#!/usr/bin/env python3
"""Index the `.vmp0` record table: one row per chunk, with section and start kind.

The section opens with a `u32` count and `count` x `{u32 rva, u16 length}`
records. This tool only reads that table and the sixteen bytes at each chunk
start; it does not disassemble the band. Output is gzipped because 294,735 rows
of text is ~12 MB raw and the repository does not need that in the working tree.

    python tools/dump_vmp0_table.py work/exe/Runtime/astralis.dll native/devirt
"""
import argparse
import gzip
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from dump_native import PE
from devirt_native import vmp0_table, classify_chunk, sec_bytes


def section_at(sections, rva):
    for s in sections:
        if s["vaddr"] <= rva < s["vaddr"] + max(s["vsize"], s["rsize"]):
            return s["name"]
    return "out"


def main(argv):
    ap = argparse.ArgumentParser(description=__doc__.splitlines()[0])
    ap.add_argument("image")
    ap.add_argument("outdir")
    args = ap.parse_args(argv[1:])

    pe = PE(args.image)
    base, size, recs = vmp0_table(pe)
    if not recs:
        raise SystemExit("no .vmp0 record table in %s" % args.image)
    _, _, blob = sec_bytes(pe, ".vmp0")

    os.makedirs(args.outdir, exist_ok=True)
    per_section = {}
    per_len = {}
    kinds = {}
    out = os.path.join(args.outdir, "vmp0_records.tsv.gz")
    with gzip.open(out, "wt", encoding="utf-8", newline="\n") as g:
        g.write("rva\tlength\tsection\tkind\tfirst8\n")
        for rva, length in recs:
            off = rva - base
            raw = blob[off:off + 8]
            kind, _ = classify_chunk(blob, rva, base)
            sec = section_at(pe.sections, rva)
            per_section[sec] = per_section.get(sec, 0) + 1
            per_len[length] = per_len.get(length, 0) + 1
            kinds[kind] = kinds.get(kind, 0) + 1
            g.write("0x%08x\t%d\t%s\t%s\t%s\n"
                    % (rva, length, sec, kind, raw.hex()))

    lo = min(r for r, _ in recs)
    hi = max(r + l for r, l in recs)
    described = sum(l for _, l in recs)
    lines = [
        "section .vmp0 rva 0x%x size %d" % (base, size),
        "records %d, span 0x%x..0x%x, %d bytes described (%.1f%% of span)"
        % (len(recs), lo, hi, described, 100.0 * described / (hi - lo)),
        "every record target lands inside .vmp0",
    ]
    lines.append("lengths " + ", ".join("%d:%d" % kv for kv in sorted(per_len.items())))
    lines.append("start kinds " + ", ".join("%s:%d" % kv for kv in
                                            sorted(kinds.items(), key=lambda kv: -kv[1])))
    with open(os.path.join(args.outdir, "vmp0_records_summary.txt"),
              "w", encoding="utf-8", newline="\n") as g:
        g.write("\n".join(lines) + "\n")
    print("\n".join(lines))
    print("wrote %s (%.1f MB gz)" % (out, os.path.getsize(out) / 1048576))


if __name__ == "__main__":
    main(sys.argv)
