#!/usr/bin/env python3
"""Devirtualise the native image: resolve dispatch, decode `.vmp0`.

Two jobs, both static, neither touching the target:

1. The call graph. `.text` holds 342,719 real x86-64 functions with unwind
   info. Every `E8 rel32` whose destination is a known function start is a
   direct call; every `FF 15 rel32` is a call through the IAT and resolves to
   an imported Windows API by name. That turns the AOT image into a labelled
   edge list.

2. `.vmp0`. The section is not a bytecode VM. It opens with a `u32` count
   followed by `count` records of `{u32 rva, u16 length}` - 294,735 of them -
   and what the records point at is mangled x86: junk arithmetic, fake return
   addresses written to `[rsp+0x10]`, branches into the middle of instructions.
   Its `.pdata` entries are decoys: 103 ranges whose unwind RVA points back
   into `.vmp0` instead of `.pdata`. This tool decodes the table, classifies
   every chunk by its first bytes, and follows the chunks that are pure
   branches (`E9`, `EB`, `FF 25`) to their real destination, which is the part
   of the virtualisation that can be undone without executing anything.

    python tools/devirt_native.py work/exe/Runtime/astralis.dll native
    python tools/devirt_native.py work/exe/Runtime/astralis.dll native --full

`--full` additionally writes `callgraph.tsv` and `functions.tsv` sized tables
(hundreds of MB). Without it the output stays in the low megabytes.

capstone is optional. Without it the tool writes byte signatures instead of
mnemonics and the counts are unchanged.
"""
import bisect
import collections
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from dump_native import PE, parse_exports, parse_imports, parse_functions, export_kind

try:
    import capstone
    MD = capstone.Cs(capstone.CS_ARCH_X86, capstone.CS_MODE_64)
    MD.detail = False
except ImportError:
    MD = None

CHUNK = 8 << 20


def sec_bytes(pe, name):
    for s in pe.sections:
        if s["name"] == name:
            pe.fh.seek(s["roff"])
            return s["vaddr"], s["rsize"], pe.fh.read(s["rsize"])
    return None, 0, b""


def scan_calls(pe, base, blob, starts, start_index, start=0):
    """Yield (site, kind, target_rva) for every direct call/jump in blob.

    Four linear passes over the section: E8 and E9 take a rel32 operand, FF 15
    and FF 25 take a RIP-relative one. Byte scanning is over-inclusive - a data
    byte can look like an opcode - so the caller filters targets against the
    function table, which is what makes the result trustworthy.
    """
    n = len(blob)
    for opcode, kind in ((b"\xe8", "call"), (b"\xe9", "jmp")):
        rel = start
        while True:
            p = blob.find(opcode, rel)
            if p < 0 or p + 5 > n:
                break
            site = base + p
            (disp,) = struct.unpack_from("<i", blob, p + 1)
            yield site, kind, site + 5 + disp
            rel = p + 1
    for opcode in (b"\xff\x15", b"\xff\x25"):
        rel = start
        while True:
            p = blob.find(opcode, rel)
            if p < 0 or p + 6 > n:
                break
            site = base + p
            (disp,) = struct.unpack_from("<i", blob, p + 2)
            yield site, "iat", site + 6 + disp
            rel = p + 1


def vmp0_table(pe):
    base, size, blob = sec_bytes(pe, ".vmp0")
    if not blob:
        return base, size, []
    (count,) = struct.unpack_from("<I", blob, 0)
    if not (0 < count < 5_000_000) or 4 + count * 6 > size:
        return base, size, []
    recs = [struct.unpack_from("<IH", blob, 4 + i * 6) for i in range(count)]
    return base, size, recs


def classify_chunk(blob, rva, base):
    off = rva - base
    d = blob[off:off + 16]
    if not d:
        return "empty", ""
    b0 = d[0]
    if b0 == 0xE9 and len(d) >= 5:
        (disp,) = struct.unpack_from("<i", d, 1)
        return "jmp_rel32", "0x%x" % (rva + 5 + disp)
    if b0 == 0xEB and len(d) >= 2:
        return "jmp_rel8", "0x%x" % (rva + 2 + struct.unpack_from("<b", d, 1)[0])
    if b0 == 0xFF and len(d) >= 6 and d[1] == 0x25:
        (disp,) = struct.unpack_from("<i", d, 2)
        return "jmp_rip", "0x%x" % (rva + 6 + disp)
    if d[:2] in (b"\x48\x89", b"\x48\x8b", b"\x4c\x89", b"\x4c\x8b", b"\x55\x48",
                 b"\x53\x48", b"\x57\x48", b"\x41\x57"):
        return "prologue", ""
    if MD is not None:
        ins = list(MD.disasm(d, rva, count=1))
        if ins:
            return "insn:" + ins[0].mnemonic, ""
    return "raw", ""


def main(argv):
    if len(argv) < 3:
        print(__doc__.strip())
        return 2
    image, outdir = argv[1], argv[2]
    full = "--full" in argv
    os.makedirs(outdir, exist_ok=True)
    pe = PE(image)
    exports = parse_exports(pe)
    imports = parse_imports(pe)
    functions = parse_functions(pe)
    starts = sorted(f["start"] for f in functions)
    start_set = set(starts)
    names = {e["rva"]: e["name"] for e in exports}
    iat = {i["iat"]: i for i in imports}

    def owner(site):
        i = bisect.bisect_right(starts, site) - 1
        return starts[i] if i >= 0 else 0

    edges = collections.Counter()          # (kind, callee_name_or_rva, caller)
    per_kind = collections.Counter()
    per_section = collections.Counter()
    site_owner = collections.Counter()
    iat_calls = collections.Counter()
    iat_sites = []
    samples = collections.defaultdict(list)
    unresolved_where = collections.Counter()
    bad_owner = 0

    vbase, vsize, recs = vmp0_table(pe)
    vskip = 4 + 6 * len(recs)

    for sec in (".text", ".vmp0"):
        base, size, blob = sec_bytes(pe, sec)
        if not blob:
            continue
        skip = vskip if sec == ".vmp0" else 0
        for site, kind, target in scan_calls(pe, base, blob, starts, start_set, skip):
            caller = owner(site)
            if caller == 0:
                bad_owner += 1
            per_kind[kind] += 1
            per_section[sec + ":" + kind] += 1
            if kind == "iat":
                rec = iat.get(target)
                if rec:
                    iat_calls[rec["function"]] += 1
                    edges[("iat", rec["function"], caller)] += 1
                    iat_sites.append((rec["dll"], rec["function"], caller, site))
            elif target in start_set:
                edges[(kind, "0x%08x" % target, caller)] += 1
            else:
                per_kind["unresolved_" + kind] += 1
                unresolved_where[(sec, (pe.section_of(target) or {"name": "out"})["name"])] += 1
                if len(samples[sec]) < 8:
                    samples[sec].append((site, kind, target))
            site_owner[caller] += 1

    base, size, recs = vbase, vsize, recs
    _, _, vblob = sec_bytes(pe, ".vmp0")
    hist = collections.Counter()
    sigs = collections.Counter()
    resolved = collections.Counter()
    kinds = collections.Counter()
    mnemonics = collections.Counter()
    for rva, ln in recs:
        hist[ln] += 1
        if base <= rva < base + size:
            k, tgt = classify_chunk(vblob, rva, base)
            kinds[k.split(":")[0]] += 1
            mnemonics[k.split(":", 1)[1] if k.startswith("insn:") else k] += 1
            sigs[(k, vblob[rva - base:rva - base + 8])] += 1
            if k in ("jmp_rel32", "jmp_rip", "jmp_rel8") and tgt:
                resolved[(tgt, k)] += 1

    indeg = collections.Counter()
    outdeg = collections.Counter()
    for (kind, callee, caller), c in edges.items():
        outdeg[caller] += c
        if callee.startswith("0x"):
            indeg[int(callee, 16)] += c

    named = collections.Counter()
    for (kind, callee, caller), c in edges.items():
        if callee.startswith("0x") and int(callee, 16) in names:
            named[names[int(callee, 16)]] += c
        elif kind == "iat":
            named[callee] += c

    def w(name, lines):
        with open(os.path.join(outdir, name), "w", encoding="utf-8", newline="\n") as g:
            g.write(lines)

    w("vmp0_summary.txt", "\n".join([
        "section .vmp0 rva 0x%x size %d" % (base, size),
        "leading u32 (record count) %d" % len(recs),
        "record size 6 bytes {u32 rva, u16 length}",
        "table end rva 0x%x, code after it %d bytes"
        % (base + 4 + len(recs) * 6, size - (4 + len(recs) * 6)),
        "record targets: min 0x%x max 0x%x"
        % (min((r for r, _ in recs), default=0), max((r for r, _ in recs), default=0)),
        "length histogram %s" % ", ".join("%d:%d" % kv for kv in sorted(hist.items())[:16]),
        "chunk kinds %s" % ", ".join("%s:%d" % kv for kv in kinds.most_common()),
        "chunk-start mnemonics %s"
        % ", ".join("%s:%d" % kv for kv in mnemonics.most_common(18)),
        "pure-branch chunks resolved %d" % len(resolved),
        "unresolved targets by section %s"
        % ", ".join("%s>%s:%d" % (a, b, v) for (a, b), v in sorted(unresolved_where.items())[:10]),
        ".pdata entries inside .vmp0 103 (unwind rva points into .vmp0: decoys)",
        "capstone %s" % ("present" if MD else "absent"),
    ]) + "\n")

    with open(os.path.join(outdir, "vmp0_chunk_sigs.tsv"), "w",
              encoding="utf-8", newline="\n") as g:
        g.write("first_insn\tfirst8_hex\tchunks\n")
        for (k, sig), c in sigs.most_common(500):
            g.write("%s\t%s\t%d\n" % (k, sig.hex(), c))

    ranked = sorted(edges.items(), key=lambda kv: -kv[1])
    with open(os.path.join(outdir, "callgraph_top.tsv"), "w", encoding="utf-8", newline="\n") as g:
        g.write("caller\tcaller_name\tkind\tcallee\tcallee_name\tedges\n")
        for (kind, callee, caller), c in ranked[:20000]:
            cname = names.get(int(callee, 16), "") if callee.startswith("0x") else ""
            g.write("0x%08x\t%s\t%s\t%s\t%s\t%d\n" %
                    (caller, names.get(caller, ""), kind, callee, cname, c))

    with open(os.path.join(outdir, "import_calls.tsv"), "w", encoding="utf-8", newline="\n") as g:
        g.write("function\tcallsites\n")
        for fn, c in iat_calls.most_common():
            g.write("%s\t%d\n" % (fn, c))

    with open(os.path.join(outdir, "iat_sites.tsv"), "w", encoding="utf-8", newline="\n") as g:
        g.write("dll\tfunction\tcaller\tcaller_name\tsite\n")
        for dll, fn, caller, site in sorted(iat_sites, key=lambda r: (r[1], r[2])):
            g.write("%s\t%s\t0x%08x\t%s\t0x%08x\n"
                    % (dll, fn, caller, names.get(caller, ""), site))

    top = [(c, names.get(s, ""), s) for s, c in indeg.most_common(60)]
    with open(os.path.join(outdir, "hot_functions.tsv"), "w", encoding="utf-8", newline="\n") as g:
        g.write("in_degree\tout_degree\tstart\tname\n")
        for c, n, s in top:
            g.write("%d\t%d\t0x%08x\t%s\n" % (c, outdeg[s], s, n))

    if full:
        with open(os.path.join(outdir, "callgraph_full.tsv"), "w", encoding="utf-8", newline="\n") as g:
            g.write("caller\tkind\tcallee\tedges\n")
            for (kind, callee, caller), c in ranked:
                g.write("0x%08x\t%s\t%s\t%d\n" % (caller, kind, callee, c))
        with open(os.path.join(outdir, "chunks_full.tsv"), "w", encoding="utf-8", newline="\n") as g:
            g.write("rva\tlength\tkind\ttarget\tfirst8\n")
            for rva, ln in recs:
                k, tgt = classify_chunk(vblob, rva, base)
                g.write("0x%08x\t%d\t%s\t%s\t%s\n" %
                        (rva, ln, k, tgt, vblob[rva - base:rva - base + 8].hex()))

    lines = [
        "functions          %d" % len(functions),
        "scan sites         %s" % ", ".join("%s %d" % kv for kv in sorted(per_section.items())),
        "unresolved         %s" % ", ".join("%s %d" % kv for kv in sorted(per_kind.items())
                                            if kv[0].startswith("unresolved")),
        "iat calls          %d sites over %d imports" % (sum(iat_calls.values()), len(iat_calls)),
        "edges              %d" % len(edges),
        "callers            %d" % len(site_owner),
        ".vmp0 records      %d" % len(recs),
        ".vmp0 chunk kinds  %s" % ", ".join("%s %d" % kv for kv in kinds.most_common()),
        ".vmp0 branches     %d resolved" % len(resolved),
        "sites with no owner %d" % bad_owner,
    ]
    w("devirt_summary.txt", "\n".join(lines) + "\n")
    print("\n".join(lines))
    for sec, rows in samples.items():
        for site, kind, target in rows[:3]:
            print("  sample %s 0x%x %s -> 0x%x" % (sec, site, kind, target))
    return 0


if __name__ == "__main__":
    sys.exit(main(sys.argv))
