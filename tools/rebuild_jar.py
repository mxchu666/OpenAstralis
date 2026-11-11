#!/usr/bin/env python3
"""
rebuild_jar.py - reassemble a jar from the original archive plus patched classes.

Every entry of the source jar is copied verbatim; entries whose .class file
exists in <classes-dir> are replaced. With --drop, matching prefixes are
skipped entirely (used to remove the native loader payload).

usage:
  python rebuild_jar.py <src.jar> <classes-dir> <out.jar> [--drop dev/opalV2/]
"""
from __future__ import annotations

import os
import sys
import zipfile


def main() -> int:
    if len(sys.argv) < 4:
        print(__doc__)
        return 2
    src, cls_dir, out = sys.argv[1], sys.argv[2], sys.argv[3]
    drops = [a for a in sys.argv[4:] if not a.startswith("--")]
    drops += [sys.argv[i + 1] for i, a in enumerate(sys.argv) if a == "--drop" and i + 1 < len(sys.argv)]

    replaced = added = dropped = 0
    seen: set[str] = set()

    with zipfile.ZipFile(src, "r") as zin, zipfile.ZipFile(out, "w", zipfile.ZIP_DEFLATED) as zout:
        for item in zin.infolist():
            name = item.filename
            if any(name.startswith(d) for d in drops):
                dropped += 1
                continue
            data = zin.read(name)
            if name.endswith(".class"):
                p = os.path.join(cls_dir, *name.split("/"))
                if os.path.isfile(p):
                    data = open(p, "rb").read()
                    replaced += 1
            zout.writestr(item, data)
            seen.add(name)

        # patched classes that did not exist in the source jar
        for dirpath, _, files in os.walk(cls_dir):
            for f in files:
                if not f.endswith(".class"):
                    continue
                full = os.path.join(dirpath, f)
                rel = os.path.relpath(full, cls_dir).replace("\\", "/")
                if rel in seen or any(rel.startswith(d) for d in drops):
                    continue
                zout.write(full, rel)
                added += 1

    print(f"replaced={replaced} added={added} dropped={dropped} -> {out}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
