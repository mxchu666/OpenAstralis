#!/usr/bin/env python3
"""List every module class in the folded tree with the evidence used to name it.

Reads the `.class` files, finds the subclasses of the module base `cc/astralis/guu`,
and prints the category, the setting/option literals they build and the Minecraft
types they touch. Module names are not guessed here: `mapping/modules.tsv` holds
the hand-assigned names, this script produces the columns that assignment was
made from.

    python tools/module_scan.py work/java_fold7              > scan.tsv
    python tools/module_scan.py work/java_fold7 scan.tsv
"""
import os
import re
import struct
import sys

CONST_Utf8 = 1
CONST_Integer = 3
CONST_Class = 7
CONST_String = 8
CONST_Fieldref = 9
CONST_Methodref = 10
CONST_NameAndType = 12

# Constructors that take a display name as their first argument.
SETTING_TYPES = {"bes", "gbp", "adu", "bqk", "cvj", "fse"}


def parse(data):
    """Minimal class-file parse: constant pool, super name, class refs, method refs."""
    if data[:4] != b"\xca\xfe\xba\xbe":
        raise ValueError("not a class file")
    pos = 8
    (count,) = struct.unpack_from(">H", data, pos)
    pos += 2
    utf8, classes, strings, refs, nnt = {}, {}, {}, [], {}
    i = 1
    while i < count:
        tag = data[pos]
        pos += 1
        if tag == CONST_Utf8:
            (n,) = struct.unpack_from(">H", data, pos)
            pos += 2
            utf8[i] = data[pos:pos + n].decode("utf-8", "replace")
            pos += n
        elif tag in (CONST_Integer,):
            pos += 4
        elif tag in (4,):  # float
            pos += 4
        elif tag in (5, 6):  # long, double take two slots
            pos += 8
            i += 1
        elif tag == CONST_Class:
            (n,) = struct.unpack_from(">H", data, pos)
            classes[i] = n
            pos += 2
        elif tag == CONST_String:
            (n,) = struct.unpack_from(">H", data, pos)
            strings[i] = n
            pos += 2
        elif tag in (CONST_Fieldref, CONST_Methodref, 11):  # 11 = InterfaceMethodref
            c, nt = struct.unpack_from(">HH", data, pos)
            pos += 4
            refs.append((tag, c, nt))
        elif tag == CONST_NameAndType:
            n, d = struct.unpack_from(">HH", data, pos)
            pos += 4
            nnt[i] = (n, d)
        elif tag == 15:  # MethodHandle: kind (u1) + index (u2)
            pos += 3
        elif tag in (16, 19, 20):  # MethodType / Module / Package: u2
            pos += 2
        elif tag in (17, 18):  # Dynamic / InvokeDynamic: bootstrap (u2) + name-and-type (u2)
            pos += 4
        else:
            raise ValueError("unknown constant tag %d" % tag)
        i += 1

    (access, this, sup) = struct.unpack_from(">HHH", data, pos)
    del access, this
    sup_name = utf8.get(classes.get(sup, 0), "")

    pool_classes = {utf8.get(n, "") for n in classes.values()}
    pool_strings = [utf8.get(n, "") for n in strings.values()]
    mc = []
    category = ""
    for tag, c, nt in refs:
        owner = utf8.get(classes.get(c, 0), "")
        name = utf8.get(nnt.get(nt, (0, 0))[0], "")
        if tag == CONST_Fieldref and owner == "cc/astralis/bfm":
            category = name
        if tag == CONST_Methodref and owner.startswith("net/minecraft/"):
            mc.append(owner.split("/")[-1])
    return sup_name, category, pool_strings, mc


def scan(root):
    rows = []
    for dirpath, _, files in os.walk(root):
        for f in files:
            if not f.endswith(".class"):
                continue
            path = os.path.join(dirpath, f)
            sup, cat, strings, mc = parse(open(path, "rb").read())
            if sup != "cc/astralis/guu":
                continue
            own = "cc/astralis/" + f[:-6]
            skip = {own, " : ", "DES", "DES/CBC/PKCS5Padding", "DES/CBC/NoPadding", "ISO-8859-1"}
            settings = [s for s in strings
                        if s and s not in skip
                        and all(0x20 <= ord(ch) < 0x7F for ch in s)]
            rows.append({
                "class": f[:-6],
                "category": cat or "?",
                "strings": settings,
                "mc": sorted(set(mc)),
            })
    rows.sort(key=lambda r: (r["category"], r["class"]))
    return rows


def main():
    if len(sys.argv) < 2:
        print(__doc__.strip())
        return 2
    root = sys.argv[1]
    out = open(sys.argv[2], "w", encoding="utf-8", newline="\n") if len(sys.argv) > 2 else sys.stdout
    if out is not sys.stdout:
        out.write("class\tcategory\tstrings\tminecraft\n")
    else:
        print("class\tcategory\tstrings\tminecraft")
    for r in scan(root):
        out.write("%s\t%s\t%s\t%s\n" % (
            r["class"], r["category"],
            "; ".join(r["strings"][:24]),
            ", ".join(r["mc"][:16])))
    if out is not sys.stdout:
        out.close()
    return 0


if __name__ == "__main__":
    sys.exit(main())
