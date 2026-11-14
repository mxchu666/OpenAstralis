#!/usr/bin/env python3
"""Decode every `.vmp0` chunk and summarise what its instruction sequence does.

The section has 294,735 records of `{u32 rva, u16 length}`. This tool decodes
each chunk from its own start, then reports for each one: instructions, bytes
consumed, whether it ends on its declared length, how it leaves (branch, call,
ret, fallthrough), the target of an immediate branch and whether that target is
another chunk start, and whether the registers it writes are read inside the
chunk (a dead write is a mutation artefact, a live write is real work).

    python tools/analyze_vmp0.py work/exe/Runtime/astralis.dll native/devirt

Writes `vmp0_chunks.tsv.gz`, `vmp0_chunks_summary.txt` and 200 decoded listings
in `vmp0_listings.txt`. Needs capstone.
"""
import argparse
import collections
import gzip
import os
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from dump_native import PE
from devirt_native import vmp0_table, sec_bytes

try:
    import capstone
except ImportError:
    raise SystemExit("capstone is required: pip install capstone")

MAX = 256


def main(argv):
    ap = argparse.ArgumentParser(description=__doc__.splitlines()[0])
    ap.add_argument("image")
    ap.add_argument("outdir")
    args = ap.parse_args(argv[1:])

    pe = PE(args.image)
    vbase, vsize, recs = vmp0_table(pe)
    _, _, blob = sec_bytes(pe, ".vmp0")
    starts = {r for r, _ in recs}
    md = capstone.Cs(capstone.CS_ARCH_X86, capstone.CS_MODE_64)
    md.detail = True

    ends = collections.Counter()
    term = collections.Counter()
    target = collections.Counter()
    rows = []
    decoded = dead = 0
    listings = []

    for i, (r, length) in enumerate(recs):
        code = blob[r - vbase:r - vbase + min(length, MAX)]
        insns = list(md.disasm(code, r, count=64))
        if not insns:
            ends["undecodable"] += 1
            rows.append((r, length, 0, 0, "none", "", "undecodable"))
            continue
        decoded += 1
        used = insns[-1].address + insns[-1].size - r
        ends["exact" if used == length else "short"] += 1
        written, read = set(), set()
        for ins in insns:
            try:
                w, rd = ins.regs_access()
            except Exception:
                w, rd = (), ()
            written.update(w)
            read.update(rd)
        dead_here = len([x for x in written - read
                         if md.reg_name(x) not in ("rsp", "eflags", "rip")])
        dead += 1 if dead_here else 0
        last = insns[-1]
        kind, tgt = "next", ""
        if last.group(capstone.CS_GRP_RET):
            kind = "ret"
        elif last.group(capstone.CS_GRP_CALL):
            kind = "call"
        elif last.group(capstone.CS_GRP_JUMP):
            kind = "jmp" if last.mnemonic == "jmp" else "jcc"
        elif last.mnemonic == "int3":
            kind = "int3"
        if last.operands and last.operands[0].type == capstone.CS_OP_IMM and kind in ("jmp", "jcc", "call"):
            tgt = last.operands[0].imm
            if tgt in starts:
                target["chunk_start"] += 1
            elif vbase <= tgt:
                target["other"] += 1
        term[kind] += 1
        rows.append((r, length, len(insns), used, kind,
                     "0x%x" % tgt if tgt else "", "dead" if dead_here else "live"))
        if len(listings) < 200 and (kind in ("jmp", "jcc") and tgt in starts or length >= 96):
            body = ["chunk 0x%08x len %d  %s  regs written %d read %d"
                    % (r, length, kind, len(written), len(read))]
            for ins in insns:
                body.append("  0x%08x  %-8s %s" % (ins.address, ins.mnemonic, ins.op_str))
            listings.append("\n".join(body))

    os.makedirs(args.outdir, exist_ok=True)
    with gzip.open(os.path.join(args.outdir, "vmp0_chunks.tsv.gz"), "wt",
                   encoding="utf-8", newline="\n") as g:
        g.write("rva\tlength\tinsns\tbytes\tterminator\ttarget\tregs\n")
        for row in rows:
            g.write("%s\n" % "\t".join(str(x) for x in row))
    with open(os.path.join(args.outdir, "vmp0_listings.txt"), "w",
              encoding="utf-8", newline="\n") as g:
        g.write("\n\n".join(listings) + "\n")

    lines = [
        "chunks %d, decoded %d, undecodable %d" % (len(recs), decoded, len(recs) - decoded),
        "decode ends on declared length %d, stops early %d"
        % (ends["exact"], ends["short"]),
        "terminators " + ", ".join("%s %d" % kv for kv in term.most_common()),
        "immediate branch targets: chunk start %d, elsewhere %d"
        % (target["chunk_start"], target["other"]),
        "chunks whose written registers are read inside the chunk: %d live, %d dead-only"
        % (decoded - dead, dead),
    ]
    with open(os.path.join(args.outdir, "vmp0_chunks_summary.txt"), "w",
              encoding="utf-8", newline="\n") as g:
        g.write("\n".join(lines) + "\n")
    print("\n".join(lines))
    print("listings", len(listings))


if __name__ == "__main__":
    main(sys.argv)
