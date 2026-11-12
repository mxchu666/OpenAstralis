#!/usr/bin/env python3
"""Carve address windows out of `astralis.dll` so a decompiler can open them.

The image is 1.93 GB: 321.7 MB of code, a 1.58 GB heap and a 23.2 MB VMProtect
section. Loading that into IDA needs several GB of RAM and hours of analysis for
342,822 functions. Nothing about a single function needs the other 321 MB.

This tool writes a raw slice of one section per window plus the list of real
function starts inside it, taken from the `.pdata` table that
`dump_native.py` already parsed. The slice is loaded as a flat binary at
`imagebase + rva`, so every address in the decompiler matches the address in the
original file: a function at RVA `0x1e43d00` is still at `0x181e43d00`.

    python tools/carve_window.py work/exe/Runtime/astralis.dll work/carve \
        --target 0x1e43d00 0x1e440e0 0x1eaa840 --pad 0x20000
    python tools/carve_window.py ... --window .text:0x1e40000:0x80000

Writes into the output directory:

    win_<n>_<rva>.bin     raw bytes
    win_<n>_<rva>.tsv     function starts inside the window, with export names
    index.tsv             one row per window: file, section, rva, size, base

`--pad` merges targets that are close together, so related functions land in the
same slice and calls between them show up as calls to named functions instead of
addresses outside the segment. Overlapping windows are merged, never duplicated.
"""
import argparse
import os
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from dump_native import PE, parse_exports, parse_functions

ALIGN = 0x1000


def windows_from_targets(targets, pad):
    rooms = sorted((t - pad, t + pad) for t in targets)
    merged = []
    for lo, hi in rooms:
        lo = max(0, lo - lo % ALIGN)
        hi += (-hi) % ALIGN
        if merged and lo <= merged[-1][1]:
            merged[-1][1] = max(merged[-1][1], hi)
        else:
            merged.append([lo, hi])
    return [tuple(w) for w in merged]


def parse_window(spec):
    """.text:0x1e40000:0x80000 -> (section, rva, size)"""
    section, rva, size = spec.rsplit(":", 2)
    return section, int(rva, 0), int(size, 0)


def main(argv):
    ap = argparse.ArgumentParser(description=__doc__.splitlines()[0])
    ap.add_argument("image")
    ap.add_argument("outdir")
    ap.add_argument("--target", nargs="*", type=lambda s: int(s, 0), default=[],
                    help="function RVAs to keep in view; nearby ones are merged")
    ap.add_argument("--pad", type=lambda s: int(s, 0), default=0x10000,
                    help="bytes of context around each target (default 64 KiB)")
    ap.add_argument("--window", nargs="*", default=[],
                    help="explicit SECTION:rva:size windows")
    args = ap.parse_args(argv[1:])

    pe = PE(args.image)
    sections = {s["name"]: s for s in pe.sections}
    functions = [(f["start"], f) for f in parse_functions(pe)]
    names = {e["rva"]: e["name"] for e in parse_exports(pe) if e["name"]}

    windows = windows_from_targets(args.target, args.pad) if args.target else []
    explicit = [parse_window(w) for w in args.window]
    for section, rva, size in explicit:
        if section not in sections:
            raise SystemExit("no section %r" % section)
        windows.append((rva, rva + size))

    if not windows:
        raise SystemExit("nothing to carve: pass --target or --window")

    os.makedirs(args.outdir, exist_ok=True)
    index = []
    for n, (lo, hi) in enumerate(sorted(windows), 1):
        sec = pe.section_of(lo)
        if sec is None:
            raise SystemExit("window 0x%x is outside every section" % lo)
        size = min(hi, sec["vaddr"] + sec["vsize"]) - lo
        raw = pe.data(lo, size)
        stem = "win_%02d_%08x" % (n, lo)
        with open(os.path.join(args.outdir, stem + ".bin"), "wb") as g:
            g.write(raw)
        inside = [(rva, fn) for rva, fn in functions
                  if lo <= rva < lo + size]
        with open(os.path.join(args.outdir, stem + ".tsv"), "w",
                  encoding="utf-8", newline="\n") as g:
            g.write("rva\tbase\tsection\tsize\tname\n")
            for rva, fn in inside:
                g.write("0x%08x\t0x%x\t%s\t%d\t%s\n"
                        % (rva, pe.imagebase + rva, sec["name"],
                           fn["end"] - fn["start"], names.get(rva, "")))
        index.append((stem, sec["name"], lo, size, pe.imagebase + lo, len(inside)))
        print("%s  %-8s rva 0x%08x  %7d bytes  %5d functions  base 0x%x"
              % (stem, sec["name"], lo, size, len(inside), pe.imagebase + lo))

    with open(os.path.join(args.outdir, "index.tsv"), "w",
              encoding="utf-8", newline="\n") as g:
        g.write("file\tsection\trva\tsize\tbase\tfunctions\n")
        for row in index:
            g.write("%s\t%s\t0x%08x\t%d\t0x%x\t%d\n" % row)
    print("%d windows, %d functions, %d bytes"
          % (len(index), sum(r[5] for r in index), sum(r[3] for r in index)))
    return 0


if __name__ == "__main__":
    sys.exit(main(sys.argv))
