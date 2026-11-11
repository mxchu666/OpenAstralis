#!/usr/bin/env python3
"""Build mapping/offsets.json from a folded-site log and the deobfuscation map.

    python tools/build_offsets.py work/deobf.map work/sites.tsv mapping/offsets.json

`sites.tsv` is written by AstralisDeobf when a fourth path argument is given:

    <class> <method> <descriptor> <arg0> <arg1> <value>

The map supplies the per-class keys and the constant tables, so each entry can
be traced back to the exact salt and table that produced it.
"""
from __future__ import annotations

import json
import re
import sys

SAMPLE = "Astralis - DrCrypter Astralis 2.11 crack, Fabric 26.3"

# Folded constants include live credentials; never publish them.
_SECRET = re.compile(
    r"(?i)\b(?:mfa\.[\w-]{84}|[MN][A-Za-z0-9]{23,}\.[\w-]{6}\.[\w-]{27,})\b"
)


def parse_map(path):
    """class -> {field, key, secret, int salt/field, long salt/field, tables}"""
    classes, cur = {}, None
    with open(path, encoding="utf-8") as fh:
        for line in fh:
            line = line.rstrip("\n")
            if not line:
                continue
            tag, _, rest = line.partition(" ")
            if tag == "C":
                cur = {"tables": {}}
                classes[rest.strip()] = cur
                continue
            if cur is None:
                continue
            if tag == "F":
                cur["field"] = rest.strip()
            elif tag == "A":
                cur["a"] = int(rest.strip(), 16)
            elif tag == "K":
                cur["key"] = int(rest.strip(), 16)
            elif tag == "X":
                parts = rest.split()
                cur["int_salt"] = int(parts[0])
                if len(parts) > 1:
                    cur["int_table"] = parts[1]
            elif tag == "Z":
                parts = rest.split()
                cur["long_salt"] = int(parts[0])
                if len(parts) > 1:
                    cur["long_table"] = parts[1]
            elif tag == "B":
                parts = rest.split()
                field = parts[0] if len(parts) > 1 else ""
                vals = parts[1] if len(parts) > 1 else parts[0]
                cur["tables"][field] = len(vals.split(",")) if vals else 0
    return classes


def parse_sites(path):
    sites = []
    with open(path, encoding="utf-8") as fh:
        for line in fh:
            parts = line.rstrip("\n").split("\t")
            if len(parts) != 6:
                continue
            cls, method, desc, a0, a1, value = parts
            sites.append((cls, method, desc, int(a0), int(a1), value))
    return sites


def typed(desc, value):
    if desc.endswith("Ljava/lang/String;"):
        return _SECRET.sub("<redacted>", value)
    n = int(value)
    return {"dec": n, "hex": "0x%X" % (n & 0xFFFFFFFFFFFFFFFF)}


def main():
    if len(sys.argv) != 4:
        sys.stderr.write("usage: build_offsets.py <deobf.map> <sites.tsv> <out.json>\n")
        return 2
    classes = parse_map(sys.argv[1])
    sites = parse_sites(sys.argv[2])

    out_classes = {}
    counts = {"(IJ)I": 0, "(IJ)J": 0, "(IJ)Ljava/lang/String;": 0}
    for cls, method, desc, a0, a1, value in sites:
        info = classes.get(cls + ".class", {})
        c = out_classes.setdefault(cls, {"keys": {}, "sites": {}})
        c["keys"] = {
            "string_field": info.get("field"),
            "secret": info.get("a"),
            "key": info.get("key"),
            "int_salt": info.get("int_salt"),
            "int_table": info.get("int_table"),
            "long_salt": info.get("long_salt"),
            "long_table": info.get("long_table"),
            "tables": info.get("tables", {}),
        }
        c["sites"].setdefault(method, []).append({
            "desc": desc,
            "arg0": a0,
            "arg1": a1,
            "value": typed(desc, value),
        })
        counts[desc] = counts.get(desc, 0) + 1

    doc = {
        "sample": SAMPLE,
        "note": "Values folded offline with DES/CBC/NoPadding, IV=0, per-class keys; "
                "no class was ever loaded or executed.",
        "counts": counts,
        "classes": out_classes,
    }
    with open(sys.argv[3], "w", encoding="utf-8") as fh:
        json.dump(doc, fh, indent=1, ensure_ascii=False, sort_keys=True)
        fh.write("\n")

    print("classes=%d sites=%d" % (len(out_classes), sum(counts.values())))
    for k in sorted(counts):
        print("  %-28s %d" % (k, counts[k]))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
