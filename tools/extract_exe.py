#!/usr/bin/env python3
"""Extract the payload embedded in the DrCrypter Astralis 2.11 launcher.

The launcher is a Nuitka onefile PE with a ZIP archive stored inside `.rdata`.
The archive's local-header offsets are relative to the start of the archive, so
the central directory cannot be read with a stock unzip tool pointed at the
`.exe`. This script locates the EOCD, derives the archive base, reads the central
directory and extracts every entry without executing anything.

    python tools/extract_exe.py --exe astralis.exe --out work/exe
    python tools/extract_exe.py --exe astralis.exe --out work/exe --assets

`Runtime/astralis.dll.zst` is decompressed to `Runtime/astralis.dll` and
hashed. Nothing from the archive is loaded or run.
"""
from __future__ import annotations

import argparse
import hashlib
import json
import os
import struct
import sys
import zlib

import zstandard


def sha256_file(path: str, chunk: int = 1 << 20) -> str:
    h = hashlib.sha256()
    with open(path, "rb") as fh:
        while True:
            b = fh.read(chunk)
            if not b:
                break
            h.update(b)
    return h.hexdigest()


def find_archive(fh) -> tuple[int, int, int]:
    """(base, cd_offset, entry_count) for the embedded ZIP."""
    fh.seek(0, os.SEEK_END)
    size = fh.tell()
    window = min(size, 256 << 20)
    fh.seek(size - window)
    buf = fh.read(window)
    best = None
    pos = 0
    while True:
        i = buf.find(b"PK\x05\x06", pos)
        if i < 0:
            break
        pos = i + 4
        if i + 22 > len(buf):
            continue
        _disk, _cdisk, _n_disk, n_total, cd_size, cd_off, _clen = struct.unpack_from(
            "<HHHHIIH", buf, i + 4
        )
        eocd = size - window + i
        cd_abs = eocd - cd_size
        base = cd_abs - cd_off
        if not (0 <= base < cd_abs < size) or n_total == 0 or n_total > 200000:
            continue
        fh.seek(base)
        if fh.read(4) != b"PK\x03\x04":
            continue
        fh.seek(cd_abs)
        if fh.read(4) != b"PK\x01\x02":
            continue
        if best is None or n_total > best[2]:
            best = (base, cd_abs, n_total)
    if best is None:
        raise SystemExit("no embedded ZIP found")
    return best


def read_cd(fh, cd_abs: int, count: int):
    entries = []
    fh.seek(cd_abs)
    for _ in range(count):
        hdr = fh.read(46)
        if len(hdr) < 46 or hdr[:4] != b"PK\x01\x02":
            raise SystemExit("corrupt central directory")
        (sig, _ver, _ver2, flags, method, _mt, _md, crc, csz, usz,
         nlen, elen, clen, _disk, _iattr, _eattr, lho) = struct.unpack(
            "<IHHHHHHIIIHHHHHII", hdr
        )
        name = fh.read(nlen).decode("utf-8", "replace")
        fh.read(elen + clen)
        entries.append({
            "name": name, "flags": flags, "method": method, "crc": crc,
            "csz": csz, "usz": usz, "lho": lho,
        })
    return entries


def extract_one(fh, base: int, e: dict, out_root: str) -> str:
    name = e["name"].replace("\\", "/")
    if name.startswith("/") or ".." in name.split("/"):
        raise SystemExit(f"unsafe path in archive: {name}")
    dest = os.path.join(out_root, *name.split("/"))
    os.makedirs(os.path.dirname(dest), exist_ok=True)

    fh.seek(base + e["lho"])
    lh = fh.read(30)
    if len(lh) < 30 or lh[:4] != b"PK\x03\x04":
        raise SystemExit(f"bad local header for {name}")
    nlen, elen = struct.unpack_from("<HH", lh, 26)
    fh.read(nlen + elen)
    if e["method"] == 0:
        payload = fh.read(e["csz"])
    elif e["method"] == 8:
        payload = zlib.decompress(fh.read(e["csz"]), -15)
    else:
        raise SystemExit(f"unsupported method {e['method']} for {name}")
    if len(payload) != e["usz"] or (zlib.crc32(payload) & 0xFFFFFFFF) != e["crc"]:
        raise SystemExit(f"size/CRC mismatch for {name}")
    with open(dest, "wb") as out:
        out.write(payload)
    return dest


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--exe", default="astralis.exe")
    ap.add_argument("--out", default="work/exe")
    ap.add_argument("--assets", action="store_true", help="also extract Assets/ (5,715 files)")
    ap.add_argument("--keep-zst", action="store_true", help="keep astralis.dll.zst as well")
    args = ap.parse_args()

    os.makedirs(args.out, exist_ok=True)
    with open(args.exe, "rb") as fh:
        base, cd_abs, count = find_archive(fh)
        entries = read_cd(fh, cd_abs, count)
        print(f"zip base=0x{base:X} cd=0x{cd_abs:X} entries={count}")

        manifest = []
        for e in entries:
            rec = {k: e[k] for k in ("name", "method", "csz", "usz", "crc")}
            if not e["name"].startswith("Assets/") or args.assets:
                extract_one(fh, base, e, args.out)
                rec["sha256"] = sha256_file(os.path.join(args.out, *e["name"].split("/")))
            manifest.append(rec)

        zst = os.path.join(args.out, "Runtime", "astralis.dll.zst")
        if os.path.exists(zst):
            dll = os.path.join(args.out, "Runtime", "astralis.dll")
            print(f"decompressing {zst} -> {dll}")
            with open(zst, "rb") as src, open(dll, "wb") as dst:
                zstandard.ZstdDecompressor().copy_stream(src, dst)
            if not args.keep_zst:
                os.remove(zst)
            print(f"astralis.dll sha256={sha256_file(dll)}")

    doc = {
        "exe": os.path.abspath(args.exe),
        "exe_sha256": sha256_file(args.exe),
        "zip_base": base,
        "zip_cd": cd_abs,
        "entries": manifest,
    }
    with open(os.path.join(args.out, "manifest.json"), "w", encoding="utf-8") as fh:
        json.dump(doc, fh, indent=1)
    print(f"manifest={os.path.join(args.out, 'manifest.json')} entries={len(manifest)}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
