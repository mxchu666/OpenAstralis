#!/usr/bin/env python3
"""Structural dump of a PE image, tuned for the GraalVM native image.

Pure stdlib: the PE headers, the export and import directories and the
exception directory are parsed by hand, so the tool runs on a machine with no
packages installed and never loads the target.

    python tools/dump_native.py work/exe/Runtime/astralis.dll native

Writes into the output directory:

    pe.txt           headers, data directories, section table with entropy
    exports.tsv      rva  name  section  kind
    imports.tsv      dll  function  hint  callsite_count
    functions.tsv    start  end  size  section  name  in_degree  out_degree  flags
    summary.txt      counts, so the next reader knows the size before reading

`kind` on an export is one of jni, centrypoint, graal, libjava, astralis,
other. `callgraph` is left to devirt_native.py, which imports this module.
"""
import collections
import math
import os
import struct
import sys


class PE:
    def __init__(self, path):
        self.path = path
        self.fh = open(path, "rb")
        self.size = os.fstat(self.fh.fileno()).st_size
        if self.read(0, 2) != b"MZ":
            raise SystemExit("not a PE file: %s" % path)
        (pe_off,) = struct.unpack("<I", self.read(0x3C, 4))
        if self.read(pe_off, 4) != b"PE\0\0":
            raise SystemExit("bad PE signature")
        (self.machine, self.nsec, self.timestamp, _, _, self.opt_size,
         self.chars) = struct.unpack("<HHIIIHH", self.read(pe_off + 4, 20))
        opt = pe_off + 24
        (self.magic,) = struct.unpack("<H", self.read(opt, 2))
        if self.magic != 0x20B:
            raise SystemExit("only PE32+ is supported (magic 0x%x)" % self.magic)
        self.pe_off = pe_off
        self.entry = struct.unpack("<I", self.read(opt + 16, 4))[0]
        self.imagebase = struct.unpack("<Q", self.read(opt + 24, 8))[0]
        self.section_align, self.file_align = struct.unpack("<II", self.read(opt + 32, 8))
        self.size_image, self.size_headers = struct.unpack("<II", self.read(opt + 56, 8))
        self.subsystem = struct.unpack("<H", self.read(opt + 68, 2))[0]
        (self.nrva,) = struct.unpack("<I", self.read(opt + 108, 4))
        self.dirs = {}
        for i in range(min(16, self.nrva)):
            rva, sz = struct.unpack("<II", self.read(opt + 112 + i * 8, 8))
            if rva or sz:
                self.dirs[i] = (rva, sz)
        self.sections = []
        sec = opt + self.opt_size
        for n in range(self.nsec):
            raw = self.read(sec + n * 40, 40)
            name = raw[:8].rstrip(b"\0").decode("latin-1")
            vsize, vaddr, rsize, roff = struct.unpack_from("<IIII", raw, 8)
            chars = struct.unpack_from("<I", raw, 36)[0]
            self.sections.append({
                "name": name, "vsize": vsize, "vaddr": vaddr,
                "rsize": rsize, "roff": roff, "chars": chars,
                "span": max(vsize, rsize),
            })

    def read(self, off, n):
        self.fh.seek(off)
        return self.fh.read(n)

    def section_of(self, rva):
        for s in self.sections:
            if s["vaddr"] <= rva < s["vaddr"] + s["span"]:
                return s
        return None

    def off(self, rva):
        s = self.section_of(rva)
        if s is None or rva - s["vaddr"] >= s["rsize"]:
            return None
        return s["roff"] + (rva - s["vaddr"])

    def data(self, rva, n):
        off = self.off(rva)
        return b"" if off is None else self.read(off, n)

    def cstr(self, rva):
        off = self.off(rva)
        if off is None:
            return ""
        self.fh.seek(off)
        out = bytearray()
        while len(out) < 512:
            c = self.fh.read(1)
            if not c or c == b"\0":
                break
            out += c
        return out.decode("latin-1")


def entropy(buf):
    if not buf:
        return 0.0
    n = len(buf)
    counts = collections.Counter(buf)
    return -sum((v / n) * math.log2(v / n) for v in counts.values())


def parse_exports(pe):
    rva, _ = pe.dirs.get(0, (0, 0))
    if not rva:
        return []
    d = pe.data(rva, 40)
    (nfun, nnam, afun, anam, aord) = struct.unpack_from("<IIIII", d, 20)
    functions = struct.unpack("<%dI" % nfun, pe.data(afun, 4 * nfun))
    name_rvas = struct.unpack("<%dI" % nnam, pe.data(anam, 4 * nnam))
    ordinals = struct.unpack("<%dH" % nnam, pe.data(aord, 2 * nnam))
    out = [{"rva": 0, "name": "#%d" % i, "ordinal": i} for i in range(nfun)]
    for i in range(nnam):
        ordn = ordinals[i]
        if ordn < nfun:
            out[ordn] = {"rva": functions[ordn],
                         "name": pe.cstr(name_rvas[i]),
                         "ordinal": ordn}
    for e in out:
        e["section"] = (pe.section_of(e["rva"]) or {}).get("name", "?")
    return out


def parse_imports(pe):
    rva, _ = pe.dirs.get(1, (0, 0))
    out = []
    if not rva:
        return out
    off = 0
    while True:
        d = pe.data(rva + off, 20)
        if len(d) < 20:
            break
        oft, _, _, name_rva, ft = struct.unpack("<IIIII", d)
        if not name_rva:
            break
        dll = pe.cstr(name_rva)
        thunk = oft or ft
        i = 0
        while True:
            v = pe.data(thunk + i * 8, 8)
            if len(v) < 8:
                break
            (val,) = struct.unpack("<Q", v)
            if val == 0:
                break
            if val & (1 << 63):
                out.append({"dll": dll, "function": "#%d" % (val & 0xFFFF),
                            "hint": val & 0xFFFF, "iat": ft + i * 8})
            else:
                hint = struct.unpack("<H", pe.data((val & 0x7FFFFFFF), 2))[0]
                out.append({"dll": dll,
                            "function": pe.cstr((val & 0x7FFFFFFF) + 2),
                            "hint": hint, "iat": ft + i * 8})
            i += 1
        off += 20
    return out


def parse_functions(pe):
    rva, size = pe.dirs.get(3, (0, 0))
    if not rva:
        return []
    blob = pe.data(rva, size)
    out = []
    for i in range(0, len(blob) - 11, 12):
        begin, end, unwind = struct.unpack_from("<III", blob, i)
        if begin == 0 and end == 0:
            break
        out.append({"start": begin, "end": end, "unwind": unwind})
    return out


def export_kind(name):
    if name.startswith("Java_") or name.startswith("JNI_"):
        return "jni"
    if name.startswith("IsolateEnterStub__"):
        return "centrypoint"
    if name.startswith("graal_") or name.startswith("graal"):
        return "graal"
    if name.startswith("serenity_"):
        return "astralis"
    if name.startswith(("jio_", "JNU_", "GetString", "InitializeEncoding",
                        "JDK_", "handle", "NET_", "initInet", "ipv4", "ipv6",
                        "reuseport", "canonicalize", "verifyJNIEnvThread",
                        "JVM_")):
        return "libjava"
    return "other"


def main(argv):
    if len(argv) < 3:
        print(__doc__.strip())
        return 2
    image, outdir = argv[1], argv[2]
    os.makedirs(outdir, exist_ok=True)
    pe = PE(image)

    exports = parse_exports(pe)
    imports = parse_imports(pe)
    functions = parse_functions(pe)

    by_kind = collections.Counter(export_kind(e["name"]) for e in exports)

    # section entropy over the whole raw body, sampled at 8 MB
    with open(os.path.join(outdir, "pe.txt"), "w", encoding="utf-8", newline="\n") as g:
        g.write("file                 %s\n" % image)
        g.write("size                 %d\n" % pe.size)
        g.write("machine              0x%04x\n" % pe.machine)
        g.write("timestamp            %d\n" % pe.timestamp)
        g.write("image base           0x%x\n" % pe.imagebase)
        g.write("entry point          0x%x (%s)\n" %
                (pe.entry, (pe.section_of(pe.entry) or {}).get("name", "?")))
        g.write("section alignment    0x%x\n" % pe.section_align)
        g.write("size of image        0x%x\n" % pe.size_image)
        g.write("subsystem            %d\n" % pe.subsystem)
        g.write("\ndata directories\n")
        names = {0: "export", 1: "import", 2: "resource", 3: "exception",
                 4: "security", 5: "reloc", 6: "debug", 9: "tls",
                 10: "config", 11: "bound-import", 12: "iat",
                 13: "delay-import", 14: "clr"}
        for i, (rva, sz) in sorted(pe.dirs.items()):
            g.write("  %-14s rva 0x%08x  size %d\n" % (names.get(i, str(i)), rva, sz))
        g.write("\nsections\n")
        g.write("  %-9s %10s %10s %10s %10s %8s  %s\n" %
                ("name", "rva", "vsize", "raw off", "raw size", "entropy", "characteristics"))
        for s in pe.sections:
            body = pe.read(s["roff"], min(s["rsize"], 8 << 20))
            g.write("  %-9s 0x%08x %10d 0x%08x %10d %8.2f  0x%08x\n" %
                    (s["name"], s["vaddr"], s["vsize"], s["roff"], s["rsize"],
                     entropy(body), s["chars"]))
        g.write("\nexports by kind\n")
        for k, v in by_kind.most_common():
            g.write("  %-12s %d\n" % (k, v))
        g.write("\nfunctions by section\n")
        fsec = collections.Counter((pe.section_of(f["start"]) or {}).get("name", "?")
                                   for f in functions)
        for k, v in fsec.most_common():
            g.write("  %-12s %d\n" % (k, v))

    with open(os.path.join(outdir, "exports.tsv"), "w", encoding="utf-8", newline="\n") as g:
        g.write("rva\tname\tsection\tkind\n")
        for e in exports:
            g.write("0x%08x\t%s\t%s\t%s\n" % (e["rva"], e["name"], e["section"],
                                             export_kind(e["name"])))

    with open(os.path.join(outdir, "imports.tsv"), "w", encoding="utf-8", newline="\n") as g:
        g.write("dll\tfunction\thint\tiat_rva\n")
        for i in sorted(imports, key=lambda x: (x["dll"].lower(), x["function"])):
            g.write("%s\t%s\t%d\t0x%08x\n" % (i["dll"], i["function"], i["hint"], i["iat"]))

    summary = [
        "image          %s" % image,
        "size           %d" % pe.size,
        "entry          0x%x" % pe.entry,
        "sections       %d" % len(pe.sections),
        "exports        %d (%s)" % (len(exports),
                                    ", ".join("%s %d" % kv for kv in by_kind.most_common())),
        "imports        %d functions from %d dlls"
        % (len(imports), len({i["dll"] for i in imports})),
        "functions      %d (%.1f MB covered)"
        % (len(functions),
           sum(f["end"] - f["start"] for f in functions if f["end"] > f["start"]) / 1e6),
    ]
    with open(os.path.join(outdir, "summary.txt"), "w", encoding="utf-8", newline="\n") as g:
        g.write("\n".join(summary) + "\n")
    with open(os.path.join(outdir, "functions.tsv"), "w", encoding="utf-8", newline="\n") as g:
        g.write("start\tend\tsize\tsection\tunwind\tname\n")
        names = {e["rva"]: e["name"] for e in exports}
        for f in functions:
            sec = (pe.section_of(f["start"]) or {}).get("name", "?")
            g.write("0x%08x\t0x%08x\t%d\t%s\t0x%x\t%s\n" %
                    (f["start"], f["end"], f["end"] - f["start"], sec, f["unwind"],
                     names.get(f["start"], "")))
    print("\n".join(summary))
    return 0


if __name__ == "__main__":
    sys.exit(main(sys.argv))
