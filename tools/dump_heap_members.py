#!/usr/bin/env python3
"""Recover member names and method descriptors from the `.svm_hea` heap.

A GraalVM image answers `getDeclaredMethods` at runtime, so the names it has to
return live in the heap as length-prefixed byte arrays. Two structures are
recoverable because they are self-describing:

* **member-name runs.** The methods of one class sit in one contiguous block,
  sorted in descending name order. A run ends when the next name would sort
  higher or when the gap grows past a class boundary. That yields per-class
  member-name sets even though the class name itself is not stored next to
  them.
* **descriptors.** Every `(...)X` string is length-prefixed and adjacent to a
  string hub, so it can be extracted exactly.

The connection between the two - which descriptor belongs to which name, and
which run belongs to which class - is not recoverable without walking the
object graph, and this tool does not pretend otherwise.

    python tools/dump_heap_members.py work/exe/Runtime/astralis.dll mapping/image26
    python tools/dump_heap_members.py ... mapping/image26 --check reconstruct/26.2/scripting

Writes `member_names.tsv`, `descriptors.tsv` and `member_summary.txt`.
`--check` scores the run extraction against the scripting jar, whose real
member sets are known from the decompiled sources.
"""
import collections
import mmap
import os
import re
import struct
import sys

HEAP = ".svm_hea"
GRAIN = 0x10000
MAX_GAP = 0x200
IDENT = re.compile(rb"[A-Za-z0-9_$]{2,200}")
DESC = re.compile(rb"\([\[\]A-Za-z0-9_/$;<>.+*]{0,400}\)[\[\]A-Za-z0-9_/$;<>.+*]{1,400}")
DECL = re.compile(r"\b(?:public|private|protected)\s+(?:static\s+|final\s+|abstract\s+|"
                  r"synchronized\s+|native\s+)*[\w.$<>\[\], ?]+?\s+(\w+)\s*[\(;=]")


def heap(path):
    sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
    from dump_native import PE
    pe = PE(path)
    for s in pe.sections:
        if s["name"] == HEAP:
            align = s["roff"] - s["roff"] % GRAIN
            delta = s["roff"] - align
            return (mmap.mmap(pe.fh.fileno(), s["rsize"] + delta,
                              access=mmap.ACCESS_READ, offset=align), delta, s["vaddr"])
    raise SystemExit("no %s section" % HEAP)


def record_at(mm, off, regex):
    """A length-prefixed byte array: u32 length at off, data at off+4."""
    if off < 16 or off + 8 > len(mm):
        return None
    (length,) = struct.unpack_from("<I", mm, off)
    if not 2 <= length <= 400 or off + 4 + length > len(mm):
        return None
    raw = mm[off + 4:off + 4 + length]
    if not regex.fullmatch(raw):
        return None
    for back in (8, 12):
        hub = struct.unpack_from("<I", mm, off - back)[0]
        if (hub & 3) == 2 and 0x01000000 <= hub <= 0x60000000:
            return raw
    return None


def scan(mm, delta):
    """Return (name records, descriptor records) as (heap_offset, text)."""
    names, descs = [], []
    n = len(mm)
    off = delta
    while off < n - 16:
        raw = record_at(mm, off, IDENT)
        if raw:
            names.append((off - delta, raw.decode("ascii")))
            off += 4 + len(raw)
            off += (-off) % 4
            continue
        raw = record_at(mm, off, DESC)
        if raw:
            descs.append((off - delta, raw.decode("ascii")))
            off += 4 + len(raw)
            off += (-off) % 4
            continue
        off += 4
    return names, descs


def runs_of(names):
    """Split name records into per-class blocks: descending order, close gaps."""
    runs, cur = [], []
    for off, name in names:
        if cur and (name >= cur[-1][1] or off - cur[-1][0] > MAX_GAP):
            runs.append(cur)
            cur = []
        cur.append((off, name))
    if cur:
        runs.append(cur)
    return runs


def source_members(root):
    """{class: set(member names)} from decompiled sources, for validation."""
    out = {}
    for dp, _, fs in os.walk(root):
        for f in fs:
            if not f.endswith(".java"):
                continue
            text = open(os.path.join(dp, f), encoding="utf-8", errors="replace").read()
            out[f[:-5]] = {m.group(1) for m in DECL.finditer(text)}
    return out


def main(argv):
    if len(argv) < 3:
        print(__doc__.strip())
        return 2
    image, outdir = argv[1], argv[2]
    check = argv[argv.index("--check") + 1] if "--check" in argv else None
    os.makedirs(outdir, exist_ok=True)

    mm, delta, _ = heap(image)
    names, descs = scan(mm, delta)
    runs = runs_of(names)
    big = [r for r in runs if len(r) >= 2]

    with open(os.path.join(outdir, "member_names.tsv"), "w",
              encoding="utf-8", newline="\n") as g:
        g.write("offset\tname\n")
        for off, name in names:
            g.write("0x%09x\t%s\n" % (off, name))

    counts = collections.Counter(d for _, d in descs)
    with open(os.path.join(outdir, "descriptors.tsv"), "w",
              encoding="utf-8", newline="\n") as g:
        g.write("descriptor\toccurrences\n")
        for d, c in sorted(counts.items()):
            g.write("%s\t%d\n" % (d, c))

    lines = [
        "name records          %d" % len(names),
        "descriptor records    %d (%d distinct)" % (len(descs), len({d for _, d in descs})),
        "runs                  %d (%d with two or more members)" % (len(runs), len(big)),
        "names inside runs     %d" % sum(len(r) for r in big),
        "longest sorted run    %d" % max((len(r) for r in big), default=0),
        "runs are slices of one interned table, not class boundaries:",
        "  the check below scores that claim against known member sets.",
        "lambda members        %d" % sum(1 for _, n in names if n.startswith("lambda$")),
        "accessor members      %d" % sum(1 for _, n in names if n.startswith(("get", "set", "is"))),
    ]
    if check:
        truth = source_members(check)
        exact = 0
        contained = 0
        for cls, members in truth.items():
            if not members:
                continue
            for run in big:
                got = {n for _, n in run}
                if got == members:
                    exact += 1
                    break
                if members <= got:
                    contained += 1
                    break
        lines.append("class-member-set match: %d of %d scripting classes exact, "
                     "%d contained, over %d runs"
                     % (exact, len(truth), contained, len(big)))
    with open(os.path.join(outdir, "member_summary.txt"), "w",
              encoding="utf-8", newline="\n") as g:
        g.write("\n".join(lines) + "\n")
    print("\n".join(lines))
    return 0


if __name__ == "__main__":
    sys.exit(main(sys.argv))
