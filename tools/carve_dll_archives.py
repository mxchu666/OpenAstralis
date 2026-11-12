#!/usr/bin/env python3
"""Carve the ZIP archives embedded in the GraalVM native image.

`astralis.dll` is not a jar, but the image links resource archives (and, where a
library needs one, its jar) as plain ZIP byte ranges. Every one of them still
carries a valid end-of-central-directory record, so the archive can be located
without guessing:

    central directory offset  ->  archive start = eocd - cd_size - cd_offset

Each validated range is written out as `arc_<n>.zip` next to an `index.tsv` that
records base offset, size, entry count and the first entries, so a later step can
pick the archive it wants without re-scanning 1.9 GB.

    python tools/carve_dll_archives.py work/exe/Runtime/astralis.dll work/dll_archives
"""
import io
import os
import struct
import sys
import zipfile

EOCD = b"PK\x05\x06"
CHUNK = 8 << 20


def find_eocds(path):
    """Yield byte offsets of every end-of-central-directory signature."""
    with open(path, "rb") as f:
        base = 0
        while True:
            buf = f.read(CHUNK)
            if not buf:
                return
            i = buf.find(EOCD)
            while i != -1:
                yield base + i
                i = buf.find(EOCD, i + 4)
            base += len(buf)


def validate(path, off, size):
    """Return (base, end) for a real archive at `off`, else None."""
    with open(path, "rb") as f:
        if off + 22 > size:
            return None
        f.seek(off)
        head = f.read(22)
        if head[:4] != EOCD:
            return None
        cd_size, cd_off, comment = struct.unpack_from("<IIH", head, 12)
        if not cd_size or cd_size > (1 << 30):
            return None
        start = off - cd_size - cd_off
        if start < 0:
            return None
        f.seek(start + cd_off)
        if f.read(4) != b"PK\x01\x02":
            return None
        return start, off + 22 + comment


def main(argv):
    if len(argv) < 3:
        print(__doc__.strip())
        return 2
    image, outdir = argv[1], argv[2]
    size = os.path.getsize(image)
    os.makedirs(outdir, exist_ok=True)

    spans = sorted({v for v in (validate(image, off, size) for off in find_eocds(image)) if v})
    rows = []
    with open(image, "rb") as f:
        for n, (start, end) in enumerate(spans):
            f.seek(start)
            blob = f.read(end - start)
            try:
                zf = zipfile.ZipFile(io.BytesIO(blob))
                names = zf.namelist()
            except zipfile.BadZipFile:
                continue
            dst = os.path.join(outdir, "arc_%03d.zip" % n)
            with open(dst, "wb") as g:
                g.write(blob)
            sample = "; ".join(names[:4])
            rows.append("%s\t%d\t%d\t%d\t%s" % (dst, start, end - start, len(names), sample))
            print("%-22s base=0x%09x size=%8d entries=%5d  %s" % (
                os.path.basename(dst), start, end - start, len(names), sample[:70]))

    with open(os.path.join(outdir, "index.tsv"), "w", encoding="utf-8", newline="\n") as g:
        g.write("file\tbase\tsize\tentries\tsample\n")
        g.write("\n".join(rows) + "\n")
    print("archives: %d, bytes: %d -> %s" % (len(rows), sum(int(r.split("\t")[2]) for r in rows), outdir))
    return 0


if __name__ == "__main__":
    sys.exit(main(sys.argv))
