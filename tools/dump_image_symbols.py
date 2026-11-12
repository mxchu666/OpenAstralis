#!/usr/bin/env python3
"""Dump the symbol and metadata surface of the GraalVM native image.

`astralis.dll` is AOT code plus a 1.58 GB image heap. The heap keeps every
string the client can reach at runtime: class names, Mixin handler names, mod
metadata and resource paths. That is the whole of what the 26.2 build exposes
statically - there is no Java bytecode in the image, so "dump the jar" is not a
thing that can happen here.

Outputs, into `--out`:

    mc_types.txt        net/minecraft types, Mojang official names
    client_types.txt    pub/astralis + com/astralis types
    mixin_hooks.tsv     handler<TAB>mixin id<TAB>target name
    mods.jsonl          every embedded fabric.mod.json, one per line
    resources.txt       resource paths (assets, data, META-INF)
    summary.txt         counts, so the next reader knows the size before reading

    python tools/dump_image_symbols.py work/exe/Runtime/astralis.dll mapping/image26
"""
import json
import os
import re
import struct
import sys

CHUNK = 16 << 20
TYPE_RE = re.compile(r"(?:net/minecraft|pub/astralis|com/astralis|cc/astralis)/[A-Za-z0-9_$/]+")
HOOK_RE = re.compile(
    r"(redirect|modify|wrapOperation|wrapWithCondition|inject|wrap|accessor|invoker)"
    r"\$[0-9a-z]{2,6}\$([A-Za-z0-9_-]+?)(?:\$|$)([A-Za-z0-9_$]*)")
RES_RE = re.compile(r"(?:assets|data|META-INF)/[A-Za-z0-9_./-]{4,120}\.(?:json|png|ogg|class|fsh|vsh|glsl|nbt|txt|lang|mcmeta|properties|jar)")


def pe_section(path, want):
    """Return (raw_offset, raw_size) for a PE section, scanning the header only."""
    with open(path, "rb") as f:
        if f.read(2) != b"MZ":
            raise SystemExit("not a PE file")
        f.seek(0x3C)
        (pe_off,) = struct.unpack("<I", f.read(4))
        f.seek(pe_off)
        if f.read(4) != b"PE\0\0":
            raise SystemExit("bad PE signature")
        f.seek(pe_off + 6)
        (nsec,) = struct.unpack("<H", f.read(2))
        f.seek(pe_off + 20)
        (opt_size,) = struct.unpack("<H", f.read(2))
        f.seek(pe_off + 24 + opt_size)
        for _ in range(nsec):
            raw = f.read(40)
            if len(raw) < 40:
                break
            name = raw[:8].rstrip(b"\0").decode("latin-1")
            size_raw, off_raw = struct.unpack_from("<II", raw, 16)
            if name == want:
                return off_raw, size_raw
    raise SystemExit("section %s not found" % want)


def main(argv):
    if len(argv) < 3:
        print(__doc__.strip())
        return 2
    image, outdir = argv[1], argv[2]
    os.makedirs(outdir, exist_ok=True)

    off, size = pe_section(image, ".svm_hea")
    mc, client, hooks, resources = set(), set(), set(), set()
    mods = set()
    decoder = json.JSONDecoder()

    with open(image, "rb") as f:
        f.seek(off)
        left = size
        tail = ""
        while left > 0:
            buf = f.read(min(CHUNK, left))
            left -= len(buf)
            if not buf:
                break
            text = tail + buf.decode("latin-1")
            for m in TYPE_RE.finditer(text):
                s = m.group(0)
                (mc if s.startswith("net/minecraft") else client).add(s)
            for m in HOOK_RE.finditer(text):
                hooks.add((m.group(1) + "$", m.group(2), m.group(3)))
            for m in RES_RE.finditer(text):
                resources.add(m.group(0))
            i = text.find('"schemaVersion"')
            while i != -1:
                start = text.rfind("{", max(0, i - 400), i)
                if start != -1:
                    try:
                        obj, _ = decoder.raw_decode(text[start:start + 20000])
                        if isinstance(obj, dict) and "id" in obj and "version" in obj:
                            mods.add(json.dumps(obj, sort_keys=True))
                    except ValueError:
                        pass
                i = text.find('"schemaVersion"', i + 15)
            tail = text[-4096:]

    def dump(name, rows):
        with open(os.path.join(outdir, name), "w", encoding="utf-8", newline="\n") as g:
            g.write("\n".join(sorted(rows)) + "\n")

    dump("mc_types.txt", mc)
    dump("client_types.txt", client)
    dump("resources.txt", resources)
    with open(os.path.join(outdir, "mixin_hooks.tsv"), "w", encoding="utf-8", newline="\n") as g:
        g.write("kind\tmixin\ttarget\n")
        for row in sorted(hooks):
            g.write("\t".join(row) + "\n")
    with open(os.path.join(outdir, "mods.jsonl"), "w", encoding="utf-8", newline="\n") as g:
        g.write("\n".join(sorted(mods)) + "\n")

    summary = [
        "image %s" % image,
        "section .svm_hea offset=%d size=%d" % (off, size),
        "mc types       %d" % len(mc),
        "client types   %d" % len(client),
        "mixin hooks    %d" % len(hooks),
        "resource paths %d" % len(resources),
        "mod manifests  %d" % len(mods),
    ]
    with open(os.path.join(outdir, "summary.txt"), "w", encoding="utf-8", newline="\n") as g:
        g.write("\n".join(summary) + "\n")
    print("\n".join(summary))
    return 0


if __name__ == "__main__":
    sys.exit(main(sys.argv))
