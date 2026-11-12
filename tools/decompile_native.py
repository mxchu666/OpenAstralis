#!/usr/bin/env python3
"""Curate decompiler output for `astralis.dll` into the tree that ships.

The decompilation itself needs IDA:

    python tools/carve_window.py work/exe/Runtime/astralis.dll work/carve \
        --target 0x1e43d00 0x132ba928 --pad 0x20000
    # each carved .bin opens as a flat binary at 0x180000000 + rva, then every
    # function start in the matching .tsv is created with add_func() and run
    # through Hex-Rays; the .c files land in work/decompiled/raw

This tool is the second half: it takes those raw files and writes the curated
set under `native/decompiled/`, grouped by what the function is.

    python tools/decompile_native.py --raw work/decompiled/raw \
        --raw work/decompiled/vmp0raw --out native/decompiled

Groups:

    entry/     the two `astralis` exports: serenity_client_bind / _start
    jdk/       JNI entry points that belong to the JDK, including every
               sun.security.mscapi function (the CNG/certificate surface)
    runtime/   the functions with the highest in-degree in the call graph
    vmp0/      chunks from the VMProtect band, kept as evidence of what
               decompiling mutated code returns
    samples/   evenly spaced functions from the rest of .text: AOT code with
               no symbol, to show what the body looks like

Nothing here is inferred: a function without an export name is shipped as
`sub_<address>`, and the index says so.
"""
import argparse
import os
import re
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from dump_native import PE, parse_exports, parse_functions

ENTRY = {"serenity_client_bind", "serenity_client_start"}
JDK = ("Java_sun_security", "Java_jdk_", "Java_sun_nio", "Java_java_io",
       "Java_java_net", "Java_sun_management")
FNAME = re.compile(r"0x([0-9a-f]{8})(?:_(.+))?\.c$")


def split_label(stem):
    """`Java_sun_security_mscapi_CKey_cleanUp` -> readable class/method."""
    parts = stem.split("_")
    return stem


def main(argv):
    ap = argparse.ArgumentParser(description=__doc__.splitlines()[0])
    ap.add_argument("--raw", action="append", nargs="+", required=True,
                    help="directories with Hex-Rays .c files")
    ap.add_argument("--out", required=True)
    ap.add_argument("--image", default=None,
                    help="astralis.dll, for sizes and export names (optional)")
    ap.add_argument("--hot", default=None,
                    help="hot_functions.tsv from devirt_native.py (optional)")
    ap.add_argument("--samples", type=int, default=24)
    args = ap.parse_args(argv[1:])

    sizes, names, hot = {}, {}, []
    if args.image and os.path.exists(args.image):
        pe = PE(args.image)
        for f in parse_functions(pe):
            sizes[f["start"]] = f["end"] - f["start"]
        for e in parse_exports(pe):
            names[e["rva"]] = e["name"]
    if args.hot and os.path.exists(args.hot):
        for line in open(args.hot, encoding="utf-8"):
            if line.startswith("in_degree"):
                continue
            parts = line.split("\t")
            if len(parts) >= 3:
                hot.append(int(parts[2], 16))

    rows = []
    for rawdir in [d for arg in args.raw for d in arg]:
        is_vmp0 = "vmp0" in os.path.basename(rawdir).lower()
        for f in sorted(os.listdir(rawdir)):
            m = FNAME.search(f)
            if not m:
                continue
            rva = int(m.group(1), 16)
            label = names.get(rva) or m.group(2) or ("vmp0_chunk" if "vmp0" in rawdir.lower() else "sub_%08x" % rva)
            if is_vmp0:
                group = "vmp0"
            elif label in ENTRY:
                group = "entry"
            elif label.startswith(JDK):
                group = "jdk"
            elif rva in hot:
                group = "runtime"
            else:
                group = "samples"
            rows.append((group, rva, label, os.path.join(rawdir, f)))

    samples = [r for r in rows if r[0] == "samples"]
    keep = set()
    if samples:
        step = max(1, len(samples) // args.samples)
        for i in range(0, len(samples), step):
            keep.add(samples[i][1])
            if len(keep) >= args.samples:
                break

    # the same function can be decompiled twice (two overlapping windows, one
    # run before the export names were applied); keep the named copy
    dedup = {}
    for group, rva, label, path in rows:
        key = (group, rva)
        better = key not in dedup or (dedup[key][2] in ("", "sub_%08x" % rva)
                                     and label not in ("", "sub_%08x" % rva))
        if better:
            dedup[key] = (group, rva, label, path)
    rows = list(dedup.values())

    # a function whose body is a single JUMPOUT is a fragment: the .pdata table
    # splits some GraalVM code in places Hex-Rays cannot join back up. Count
    # them, do not ship them.
    stubs = 0
    kept = []
    for group, rva, label, path in rows:
        text = open(path, encoding="utf-8", errors="replace").read()
        body = text.split("\n", 1)[1] if text.startswith("//") else text
        if group != "vmp0" and "JUMPOUT(" in body and len(body.strip().splitlines()) < 12:
            stubs += 1
            continue
        kept.append((group, rva, label, path, body))
    rows = kept

    samples = [r for r in rows if r[0] == "samples"]
    keep = set()
    if samples:
        step = max(1, len(samples) // args.samples)
        for i in range(0, len(samples), step):
            keep.add(samples[i][1])
            if len(keep) >= args.samples:
                break

    written = []
    for group, rva, label, path, body in rows:
        if group == "samples" and rva not in keep:
            continue
        dest = os.path.join(args.out, group)
        os.makedirs(dest, exist_ok=True)
        size = sizes.get(rva, 0)
        base = 0
        with open(path, encoding="utf-8", errors="replace") as f:
            m = re.search(r"base (0x[0-9a-fA-F]+)", f.readline())
        if m:
            base = int(m.group(1), 16)
        header = ("// %s\n// rva 0x%08x  size %d  section %s  group %s\n"
                  "// window base 0x%x: Hex-Rays prints an operand at or above the\n"
                  "// base as base-relative, and one below it as absolute\n"
                  % (label, rva, size,
                     ".vmp0" if group == "vmp0" else ".text", group, base))
        name = "0x%08x_%s.c" % (rva, re.sub(r"[^A-Za-z0-9_.-]", "_", label))
        with open(os.path.join(dest, name), "w", encoding="utf-8", newline="\n") as g:
            g.write(header + body.rstrip() + "\n")
        written.append((group, rva, label, size, body.strip().count("\n") + 1))

    with open(os.path.join(args.out, "index.tsv"), "w",
              encoding="utf-8", newline="\n") as g:
        g.write("group\trva\tlabel\tsize\tlines\n")
        for group, rva, label, size, lines in written:
            g.write("%s\t0x%08x\t%s\t%d\t%d\n" % (group, rva, label, size, lines))

    counts = {}
    for group, _, _, _, _ in written:
        counts[group] = counts.get(group, 0) + 1
    summary = ["%s %d" % (g, counts[g]) for g in sorted(counts)]
    summary.append("total %d functions, %d lines of pseudocode"
                   % (len(written), sum(w[4] for w in written)))
    summary.append("fragments dropped (body was one JUMPOUT) %d" % stubs)
    summary.append("named by export %d, unnamed %d"
                   % (sum(1 for w in written if w[2] in set(names.values())),
                      sum(1 for w in written if w[2] not in set(names.values()))))
    with open(os.path.join(args.out, "summary.txt"), "w",
              encoding="utf-8", newline="\n") as g:
        g.write("\n".join(summary) + "\n")
    print("\n".join(summary))
    return 0


if __name__ == "__main__":
    sys.exit(main(sys.argv))
