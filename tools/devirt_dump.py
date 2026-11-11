#!/usr/bin/env python3
"""
devirt_dump.py - dump the native_jvm native layer of dev/opalV2 from the
Astralis DLL.

Run inside IDA (idat -A -S"devirt_dump.py" dev_opalV2_x64-windows.dll) or via
the IDA MCP `execute_python` tool. Everything below is address-relative to this
particular build; re-derive POOL / HOOKS if the DLL changes.

What it produces, in OUT:
  native_registry.tsv   class / index / method / descriptor / address / size
  symbols_<class>.tsv   every JVM symbol the class's compiled code resolves,
                        with pool offset, length, text and hex
  native_<class>_<m>.c  Hex-Rays pseudocode for each registered native method
"""
import os
import re

import ida_bytes
import ida_funcs
import ida_hexrays
import ida_ua
import idautils
import idc

OUT = r"F:\Astralis\work\devirt"

# ---------------------------------------------------------------- known layout
POOL = 0x180113000          # sub_1800BE2F0() - NUL-separated symbol pool
HIDDEN_CLASS = 0x1800EA6B0  # 1170-byte embedded dev/opalV2/hidden/Hidden0
HIDDEN_SIZE = 1170
HOOKS = {                   # Loader.registerNativesForClass -> handler
    0: 0x180003290,         # dqq
    1: 0x1800257F0,         # evd
    2: 0x18006B110,         # fz
    3: 0x1800BC110,         # hdl
}
DISPATCH_TABLE = 0x180116E10  # qword[4], indexed by registerNativesForClass(int)
CHUNK = 0x8000                # Hex-Rays MAX_FUNCSIZE is 0x10000; stay under

# True body sizes. Needed because the chunked dump in this script redefines the
# function ends in the database, after which get_func() only reports chunk one.
TRUE_SIZE = {
    0x180002A70: 138, 0x180002B00: 1936,
    0x180003D20: 120475, 0x1800213C0: 17453,
    0x180027160: 36517, 0x180030010: 5002, 0x1800313A0: 23621,
    0x180036FF0: 1063, 0x180037420: 1063, 0x180037850: 9021,
    0x180039B90: 202106,
    0x18006C860: 57327, 0x18007A850: 139324, 0x18009C890: 30494,
    0x1800A3FB0: 86961, 0x1800B9370: 11679,
}


def mutf8_decode(x):
    """JNI modified UTF-8: 0xC0 0x80 is NUL, everything else 1-3 byte.

    Plain utf-8 decode fails on this pool - the payload entries use the
    overlong NUL and 3-byte forms.
    """
    out = bytearray()
    i, n = 0, len(x)
    while i < n:
        c = x[i]
        if c == 0xC0 and i + 1 < n and x[i + 1] == 0x80:
            out.append(0)
            i += 2
        elif c < 0x80:
            out.append(c)
            i += 1
        elif c >> 5 == 0x6 and i + 1 < n:
            out.append((((c & 0x1F) << 6) | (x[i + 1] & 0x3F)) & 0xFF)
            i += 2
        elif c >> 4 == 0xE and i + 2 < n:
            out.append((((c & 0x0F) << 12) | ((x[i + 1] & 0x3F) << 6) | (x[i + 2] & 0x3F)) & 0xFF)
            i += 3
        else:
            out.append(c)
            i += 1
    return bytes(out)


def pool_bytes(off, maxlen=400):
    """Raw pool entry: truncated at the first 0x00 byte (the true terminator)."""
    b = ida_bytes.get_bytes(POOL + off, maxlen) or b""
    z = b.find(b"\x00")
    return b[: z if z >= 0 else maxlen]


def pool_text(off, maxlen=400):
    """Symbol text, or None when the entry is an encrypted payload."""
    d = mutf8_decode(pool_bytes(off, maxlen))
    if not d:
        return None
    if sum(1 for x in d if 32 <= x < 127) / len(d) < 0.75:
        return None
    return d.decode("latin-1")


# ---------------------------------------------------------------- registry
def _call_args(t, open_idx):
    """Split a call argument list; t[open_idx] must be '('."""
    depth = 0
    for i in range(open_idx, len(t)):
        c = t[i]
        if c == "(":
            depth += 1
        elif c == ")":
            depth -= 1
            if depth == 0:
                return [a.strip() for a in t[open_idx + 1:i].split(",")]
    return []


def parse_handler(ea):
    """Recover (name_off, desc_off, fn_addr) triples registered by one handler."""
    text = ida_hexrays.decompile(ea)
    if text is None:
        return []
    t = str(text)
    sym = {}
    for m in re.finditer(r"(v\d+) = qword_[0-9A-Fa-f]+ \+ (\d+);", t):
        sym[m.group(1)] = int(m.group(2))
    for m in re.finditer(r"(v\d+) = qword_[0-9A-Fa-f]+;", t):
        sym[m.group(1)] = 0
    for m in re.finditer(r"(v\d+)\[(\d+)\] = qword_[0-9A-Fa-f]+ \+ (\d+);", t):
        sym["%s[%s]" % (m.group(1), m.group(2))] = int(m.group(3))
    for m in re.finditer(r"(v\d+) = (sub_[0-9A-Fa-f]+);", t):
        sym[m.group(1)] = m.group(2)
    for m in re.finditer(r"(v\d+)\[(\d+)\] = (sub_[0-9A-Fa-f]+);", t):
        sym["%s[%s]" % (m.group(1), m.group(2))] = m.group(3)

    out = []
    for m in re.finditer(r"\+ 1720LL\)\)\(", t):
        args = _call_args(t, m.end() - 1)
        if len(args) < 4 or not args[3].isdigit():
            continue
        n = int(args[3])
        # The array operand shows up three ways depending on how Hex-Rays typed
        # it: `&v30` (consecutive stack qwords), `v33` (real array), or the
        # elements passed inline. Try each, keep the one that resolves.
        base = args[2].lstrip("&")
        mv = re.fullmatch(r"v(\d+)", base)
        cands = []
        if mv:
            cands.append(["%s[%d]" % (base, i) for i in range(n * 3)])
            cands.append(["v%d" % (int(mv.group(1)) + i) for i in range(n * 3)])
        cands.append(args[4:4 + n * 3])
        for names in cands:
            triplets = [tuple(sym.get(k) for k in names[i:i + 3])
                        for i in range(0, len(names) - 2, 3)]
            if all(isinstance(x, int) and isinstance(y, int) and isinstance(z, str)
                   for x, y, z in triplets):
                for name, desc, fn in triplets:
                    out.append((name, desc, int(fn[4:], 16)))
                break
    return out


def build_registry():
    rows = []
    for idx, hook in HOOKS.items():
        for name_off, desc_off, fn in parse_handler(hook):
            f = ida_funcs.get_func(fn)
            rows.append({
                "class_index": idx,
                "method": pool_text(name_off),
                "descriptor": pool_text(desc_off),
                "address": fn,
                "size": TRUE_SIZE.get(fn, (f.end_ea - f.start_ea) if f else 0),
            })
    return rows


# ---------------------------------------------------------------- symbols
def build_symbols(hook):
    """Every symbol the handler pre-resolves into a global slot."""
    text = ida_hexrays.decompile(hook)
    if text is None:
        return []
    t = str(text)
    tail = (r";\n\s*if \( \w+ != 0 \)\n\s*\{\n\s*\w+ = \w+;\n"
            r"\s*\w+ = sub_180002720\(a1, \w+\);\n\s*if \( \w+ != 0 \)\n\s*\{\n\s*\w+ = \w+;\n"
            r"\s*(qword_[0-9A-Fa-f]+) = ")
    pairs = []
    for m in re.finditer(r"\(a1, qword_[0-9A-Fa-f]+ \+ (\d+)\)" + tail, t):
        pairs.append((int(m.group(1)), m.group(2)))
    for m in re.finditer(r"\(a1, qword_[0-9A-Fa-f]+\)" + tail, t):
        pairs.append((0, m.group(1)))
    seen, rows = set(), []
    for off, slot in sorted(pairs):
        if off in seen:
            continue
        seen.add(off)
        b = pool_bytes(off)
        rows.append((slot, off, len(b), pool_text(off), mutf8_decode(b)[:64].hex()))
    return rows


# ---------------------------------------------------------------- pseudocode
def safe_splits(start, end, maxsz=CHUNK):
    bounds = [start]
    cur, ea, last_term = start, start, None
    while ea not in (idc.BADADDR, end):
        if idc.print_insn_mnem(ea) in ("retn", "jmp"):
            last_term = ea
        if ea - cur >= maxsz and last_term is not None:
            nxt = idc.next_head(last_term, end)
            if nxt not in (idc.BADADDR, end):
                bounds.append(nxt)
                cur, last_term = nxt, None
        ea = idc.next_head(ea, end)
    bounds.append(end)
    return bounds


def dump_body(ea, path):
    f = ida_funcs.get_func(ea)
    if not f:
        return 0
    start = f.start_ea
    end = start + TRUE_SIZE.get(start, f.end_ea - f.start_ea)
    parts = []
    if end - start <= CHUNK:
        cf = ida_hexrays.decompile(ea)
        parts.append(str(cf) if cf else "/* decompile failed */")
    else:
        # Hex-Rays refuses functions larger than MAX_FUNCSIZE (0x10000).
        # Split at basic-block boundaries and decompile each chunk.
        bounds = safe_splits(start, end)
        for i in range(len(bounds) - 1):
            s, e = bounds[i], bounds[i + 1]
            if ida_funcs.get_func(s) is None:
                try:
                    idc.add_func(s)
                except Exception:
                    pass
            try:
                idc.set_func_end(s, e)
            except Exception:
                pass
            try:
                cf = ida_hexrays.decompile(s)
                parts.append("/* ===== %08X..%08X ===== */\n%s" % (s, e, cf if cf else "/* failed */"))
            except Exception as ex:
                parts.append("/* ===== %08X..%08X ===== FAIL %s */" % (s, e, ex))
    body = "\n\n".join(parts)
    with open(path, "w", encoding="utf-8") as fh:
        fh.write(body)
    return len(body.splitlines())


# ---------------------------------------------------------------- main
def main():
    os.makedirs(OUT, exist_ok=True)
    rows = build_registry()
    with open(os.path.join(OUT, "native_registry.tsv"), "w", encoding="utf-8") as fh:
        fh.write("class_index\tmethod\tdescriptor\taddress\tsize\n")
        for r in rows:
            fh.write("%d\t%s\t%s\t0x%08X\t%d\n" %
                     (r["class_index"], r["method"], r["descriptor"], r["address"], r["size"]))

    names = {0: "dqq", 1: "evd", 2: "fz", 3: "hdl"}
    for idx, hook in HOOKS.items():
        syms = build_symbols(hook)
        with open(os.path.join(OUT, "symbols_%s.tsv" % names[idx]), "w", encoding="utf-8") as fh:
            fh.write("slot\tpool_offset\tlength\ttext\thex\n")
            for s in syms:
                fh.write("%s\t%d\t%d\t%s\t%s\n" %
                         (s[0], s[1], s[2], (s[3] or "<binary>").replace("\t", "\\t"), s[4]))

    for r in rows:
        cls = names[r["class_index"]]
        meth = "clinit" if r["method"] == "<clinit>" else r["method"]
        lines = dump_body(r["address"], os.path.join(OUT, "native_%s_%s.c" % (cls, meth)))
        print("%-4s %-10s %6d lines" % (cls, meth, lines))


if __name__ == "__main__":
    main()
