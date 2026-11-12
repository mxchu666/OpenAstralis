#!/usr/bin/env python3
"""Inventory the GraalVM native image stored in `Runtime/astralis.dll`.

`astralis.dll` is not a JVM launcher and contains no Java bytecode: it is a
Serenity/GraalVM SubstrateVM native image (sections `.svm_int`, `.svm_hea`,
`.vmp0`). Every type name that survived into the image — class hubs,
reflection metadata, resource paths, mixin lookup strings — is stored as a
plain string in `.svm_hea`, so a section-scoped scan recovers the client's
vocabulary without mapping or running the DLL.

    python tools/image_inventory.py --dll work/exe/Runtime/astralis.dll \
        --out mapping/image_inventory.json

The scan is read-only: the file is opened, mmapped and closed. Nothing is
loaded, relocated or executed.
"""
from __future__ import annotations

import argparse
import json
import mmap
import os
import re
import struct
import sys

TYPE_RE = re.compile(rb"(?:L)?(?:[A-Za-z_$][\w$]{0,63}/){2,}[\w$]{1,63}")
RES_RE = re.compile(rb"[\w$./-]{3,200}\.(?:png|json|fsh|vsh|properties|ogg|ttf|txt|dat|nbt|mcmeta)(?![A-Za-z0-9_])")


def pe_sections(fh) -> list[tuple[str, int, int]]:
    fh.seek(0)
    head = fh.read(0x400)
    if head[:2] != b"MZ":
        raise SystemExit("not a PE file")
    pe = struct.unpack_from("<I", head, 0x3C)[0]
    fh.seek(pe)
    sig = fh.read(4)
    if sig != b"PE\0\0":
        raise SystemExit("bad PE signature")
    machine, nsec = struct.unpack("<HH", fh.read(4))
    fh.seek(pe + 0x14)
    opt_size = struct.unpack("<H", fh.read(2))[0]
    fh.seek(pe + 0x18 + opt_size)
    secs = []
    for _ in range(nsec):
        raw = fh.read(40)
        name = raw[:8].rstrip(b"\0").decode("latin-1")
        vsize, vad, rsize, rptr = struct.unpack_from("<IIII", raw, 8)
        if rsize:
            secs.append((name, rptr, rsize))
    return secs


def collect(fh, secs, chunk: int = 1 << 24):
    types: set[str] = set()
    res: set[str] = set()
    for name, rptr, rsize in secs:
        fh.seek(rptr)
        left = rsize
        while left:
            data = fh.read(min(chunk, left))
            left -= len(data)
            for m in TYPE_RE.finditer(data):
                s = m.group().decode("latin-1").lstrip("L")
                if "/" in s and not s.endswith("/"):
                    types.add(s)
            for m in RES_RE.finditer(data):
                res.add(m.group().decode("latin-1"))
            if not data:
                break
    return types, res


JDK_ROOTS = ("java/", "javax/", "jdk/", "sun/", "com/sun/", "com/oracle/",
             "com/graalvm/", "org/graalvm/", "jdk/internal/")


def bucket(name: str) -> str:
    if name.startswith(JDK_ROOTS):
        return "jdk"
    if name.startswith(("com/astralis", "pub/astralis")):
        return "astralis"
    if name.startswith(("net/minecraft", "net/fabricmc")):
        return "minecraft"
    return "library"


def packages(types: set[str], depth: int) -> dict[str, int]:
    out: dict[str, int] = {}
    for t in types:
        parts = t.split("/")[:-1]
        key = "/".join(parts[:depth]) or "(default)"
        out[key] = out.get(key, 0) + 1
    return dict(sorted(out.items(), key=lambda kv: -kv[1]))


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--dll", default="work/exe/Runtime/astralis.dll")
    ap.add_argument("--out", default="mapping/image_inventory.json")
    ap.add_argument("--top", type=int, default=40)
    ap.add_argument("--list-astralis", action="store_true", help="print every com/astralis type")
    args = ap.parse_args()

    with open(args.dll, "rb") as fh:
        size = os.path.getsize(args.dll)
        secs = pe_sections(fh)
        names = [s[0] for s in secs]
        if ".svm_hea" not in names:
            raise SystemExit("no .svm_hea section: this is not a SubstrateVM image")
        types, res = collect(fh, secs)

    if "com/astralis/scripting/Script" not in types:
        raise SystemExit("marker com/astralis/scripting/Script missing: inventory incomplete")

    kind: dict[str, list[str]] = {}
    for t in types:
        kind.setdefault(bucket(t), []).append(t)

    doc = {
        "dll": os.path.abspath(args.dll),
        "dll_size": size,
        "sections": [{"name": n, "raw_offset": o, "raw_size": s} for n, o, s in secs],
        "counts": {k: len(v) for k, v in sorted(kind.items())},
        "packages": packages(set(types), 3),
        "resources": {
            "total": len(res),
            "namespaces": packages(set(res), 2),
        },
        "astralis_types": sorted(kind.get("astralis", [])),
    }
    os.makedirs(os.path.dirname(os.path.abspath(args.out)), exist_ok=True)
    with open(args.out, "w", encoding="utf-8") as fh_out:
        json.dump(doc, fh_out, indent=1, sort_keys=False)

    print(f"image   {args.dll} {size:,} bytes, {len(secs)} sections")
    print(f"types   {len(types):,}")
    for k in sorted(kind):
        print(f"  {k:<10} {len(kind[k]):,}")
    print(f"res     {len(res):,} resource paths")
    print("top packages:")
    for k, v in list(doc["packages"].items())[: args.top]:
        print(f"  {v:>7,}  {k}")
    if args.list_astralis:
        for t in doc["astralis_types"]:
            print("  " + t)
    print(f"wrote   {args.out}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
