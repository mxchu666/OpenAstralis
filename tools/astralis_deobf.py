#!/usr/bin/env python3
"""
astralis_deobf.py - recover the obfuscator's static secrets, offline.

Layers handled (all parsed, none executed):

  1. `<clinit>` DES/CBC/PKCS5 string constants.
     A  = `ldc2_w A; putstatic <cls>.a:J`
     K  = `getstatic a:J; ldc2_w K; lxor`
     key = A ^ K, IV = 8 zero bytes, plaintext from ISO-8859-1 bytes.

  2. long[] `b` array: the class's non-printable string constant split into
     8-byte blocks, each DES/CBC/NoPadding decrypted with the same key.

  3. invokedynamic int constants: call site `a:(IJ)I` whose operands are
     folded at the call site; value = DES(b[idx], key=arg1)[4..8] as i32,
     idx = arg0 ^ (arg1 & 0x7fff) ^ 19379.

Output is a line oriented map consumed by tools/AstralisDeobf.java.

usage: python astralis_deobf.py <classes-dir> <out.map> [report.txt]
"""
from __future__ import annotations

import base64
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from jarscan import ClassFile, CP_Long  # noqa: E402
from deobf import code_of, iter_insns, des_decrypt, cesu8_decode, key_bytes  # noqa: E402

from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes


def des_nopad(ct: bytes, key: int) -> bytes:
    c = Cipher(algorithms.TripleDES(key_bytes(key)), modes.CBC(b"\0" * 8))
    return c.decryptor().update(ct)


def field_at(cf: ClassFile, idx: int):
    if not (0 < idx < len(cf.cp)) or cf.cp[idx][0] != 9:
        return None
    c_i, nt_i = cf.cp[idx][1]
    owner = cf.utf8(cf.cp[c_i][1])
    nn, dd = cf.cp[nt_i][1]
    return owner, cf.utf8(nn), cf.utf8(dd)


def class_secrets(cf: ClassFile):
    """(A, key) from <clinit>: `ldc2_w A; putstatic F:J` then `getstatic F:J; ldc2_w K; lxor`."""
    clinit = next((m for m in cf.methods if m["name"] == "<clinit>"), None)
    if clinit is None:
        return None
    code = code_of(cf, clinit)
    if not code:
        return None

    field = None
    a_val = None
    key = None
    last_long = None
    armed_field = None

    for _off, op, operands in iter_insns(code):
        if op == 0x14:  # ldc2_w
            i = struct.unpack_from(">H", operands)[0]
            e = cf.cp[i] if 0 < i < len(cf.cp) else None
            if e and e[0] == CP_Long:
                last_long = struct.unpack(">q", e[1])[0]
                if armed_field is not None and field == armed_field and key is None:
                    key = (a_val ^ last_long) & 0xFFFFFFFFFFFFFFFF if a_val is not None else None
                    armed_field = None
            continue
        if op == 0xB3:  # putstatic
            f = field_at(cf, struct.unpack_from(">H", operands)[0])
            if f and f[2] == "J" and last_long is not None and field is None:
                field = f[1]
                a_val = last_long
            last_long = None
            continue
        if op == 0xB2:  # getstatic
            f = field_at(cf, struct.unpack_from(">H", operands)[0])
            armed_field = f[1] if (f and f[1] == field) else None
            last_long = None
            continue
        if op == 0x61:  # lxor
            continue
        armed_field = None
        last_long = None

    if field is None or a_val is None or key is None:
        return None
    return field, a_val, key


def _mutf8(payload: bytes) -> str:
    """decode a CONSTANT_Utf8 payload byte-exactly (CESU-8 + surrogate pairs)."""
    try:
        s = payload.decode("utf-8", "surrogatepass")
        return s.encode("utf-16", "surrogatepass").decode("utf-16")
    except (UnicodeDecodeError, UnicodeEncodeError):
        out = []
        i, n = 0, len(payload)
        while i < n:
            v = payload[i]
            if v < 0x80:
                out.append(chr(v)); i += 1
            elif v < 0xE0 and i + 1 < n:
                out.append(chr(((v & 0x1F) << 6) | (payload[i + 1] & 0x3F))); i += 2
            elif i + 2 < n:
                out.append(chr(((v & 0x0F) << 12) | ((payload[i + 1] & 0x3F) << 6)
                               | (payload[i + 2] & 0x3F))); i += 3
            else:
                break
        return "".join(out)


def raw_strings(cf: ClassFile) -> list[str]:
    """every CONSTANT_String literal, decoded byte-exactly (no mojibake)."""
    d = cf.data
    n = struct.unpack_from(">H", d, 8)[0]
    i, k = 10, 1
    utf8: dict[int, bytes] = {}
    sref: list[int] = []
    while k < n:
        tag = d[i]; i += 1
        if tag == 1:
            ln = struct.unpack_from(">H", d, i)[0]
            utf8[k] = d[i + 2:i + 2 + ln]
            i += 2 + ln
        elif tag in (3, 4):
            i += 4
        elif tag in (5, 6):
            i += 8; k += 1
        elif tag in (7, 8, 16, 19, 20):
            if tag == 8:
                sref.append(struct.unpack_from(">H", d, i)[0])
            i += 2
        elif tag in (9, 10, 11, 12, 17, 18):
            i += 4
        elif tag == 15:
            i += 3
        else:
            break
        k += 1
    return [_mutf8(utf8[r]) for r in sref if r in utf8]


def walk_blob(blob: str, key: int, start: int = 24) -> list[bytes] | None:
    """replicate the <clinit> walk: [n chars ciphertext][1 char next length]...

    the trailing char after each chunk carries the byte length of the chunk
    that follows, so the table is length-prefixed, not fixed-stride.
    """
    raw = blob.encode("latin-1", "replace")
    n = len(raw)
    out: list[bytes] = []
    pos, ln = -1, start
    while True:
        pos += 1
        if pos + ln > n:
            return None
        chunk = raw[pos:pos + ln]
        # entries are themselves ciphertext for the call-site decrypt, so the
        # only oracle available here is a valid PKCS5 pad.
        stage1 = des_decrypt(chunk, key)
        if stage1 is None:
            return None
        out.append(cesu8_decode(stage1).encode("latin-1", "replace"))
        pos += ln
        if pos >= n:
            return out
        ln = raw[pos]
        if ln == 0:
            return None


def string_table(cf: ClassFile, key: int):
    """the b[] ciphertext table: every <clinit> blob walked in order, concatenated."""
    out: list[bytes] = []
    for s in raw_strings(cf):
        raw = s.encode("latin-1", "replace")
        if len(raw) < 24:
            continue
        best = None
        for start in range(8, 129, 8):
            chunks = walk_blob(s, key, start)
            if chunks and (best is None or len(chunks) > len(best)):
                best = chunks
        if best:
            out.extend(best)
    return out or None


def string_indy_xor(cf: ClassFile) -> int | None:
    for m in cf.methods:
        if m["desc"] == "(IJ)Ljava/lang/String;" and (m["acc"] & 0x0008):
            code = code_of(cf, m)
            if not code:
                continue
            for _off, op, ops in iter_insns(code):
                if op == 0x11:
                    return struct.unpack(">h", ops)[0]
    return None


def indy_xor(cf: ClassFile) -> int:
    """the per-class xor constant baked into `a(int,long):int`"""
    for m in cf.methods:
        if m["desc"] == "(IJ)I" and (m["acc"] & 0x0008):
            code = code_of(cf, m)
            if not code:
                continue
            for _off, op, ops in iter_insns(code):
                if op == 0x11:  # sipush
                    return struct.unpack(">h", ops)[0]
    return 19379


def arrays_for(cf: ClassFile, key: int) -> list[list[int]]:
    arrs = []
    for s in raw_strings(cf):
        raw = s.encode("latin-1", "replace")
        if len(raw) >= 16 and len(raw) % 8 == 0 and not s.isprintable():
            plain = b"".join(des_nopad(raw[i:i + 8], key) for i in range(0, len(raw), 8))
            arrs.append([int.from_bytes(plain[i:i + 8], "big")
                         for i in range(0, len(plain), 8)])
    return arrs


def class_strings(cf: ClassFile, key: int) -> dict[str, str]:
    strings: dict[str, str] = {}
    for s in raw_strings(cf):
        raw = s.encode("latin-1", "replace")
        if len(raw) < 8 or len(raw) % 8 or s.isprintable():
            continue
        pt = des_decrypt(raw, key)
        if not pt:
            continue
        dec = cesu8_decode(pt)
        if dec and all(0x20 <= ord(ch) < 0x7F or ord(ch) > 0x7F for ch in dec):
            strings[s] = dec
    return strings


def main() -> int:
    root = sys.argv[1]
    out_map = sys.argv[2]
    report = sys.argv[3] if len(sys.argv) > 3 else None

    lines: list[str] = []
    txt: list[str] = []
    n_cls = n_str = n_sec = 0

    for dirpath, _, files in os.walk(root):
        for f in sorted(files):
            if not f.endswith(".class"):
                continue
            p = os.path.join(dirpath, f)
            rel = os.path.relpath(p, root).replace("\\", "/")
            try:
                cf = ClassFile(rel, open(p, "rb").read())
                secrets = class_secrets(cf)
            except Exception as exc:  # noqa: BLE001
                txt.append(f"[!] {rel}: {exc}")
                continue
            if not secrets:
                continue
            n_sec += 1
            lines.append(f"C {rel}")
            txt.append(f"\n== {rel}")
            field, a, key = secrets
            dec = class_strings(cf, key)
            lines.append(f"F {field}")
            lines.append(f"X {indy_xor(cf)}")
            lines.append(f"A {a & 0xFFFFFFFFFFFFFFFF:016x}")
            lines.append(f"K {key & 0xFFFFFFFFFFFFFFFF:016x}")
            for arr in arrays_for(cf, key):
                lines.append("B " + ",".join(f"{v & 0xFFFFFFFFFFFFFFFF:016x}" for v in arr))
            for enc, plain in dec.items():
                n_str += 1
                lines.append("S " + base64.b64encode(enc.encode("utf-8", "surrogatepass")).decode()
                             + " " + base64.b64encode(plain.encode("utf-8", "surrogatepass")).decode())
                txt.append(f"   STR  {plain}")
            table = string_table(cf, key)
            sxor = string_indy_xor(cf)
            if table and sxor is not None:
                lines.append(f"Y {sxor}")
                lines.append("T " + "|".join(
                    base64.b64encode(c).decode() for c in table))
            n_cls += 1

    with open(out_map, "w", encoding="utf-8") as fh:
        fh.write("\n".join(lines) + "\n")
    if report:
        with open(report, "w", encoding="utf-8") as fh:
            fh.write("\n".join(txt) + "\n")
    print(f"classes={n_cls} with_secrets={n_sec} strings={n_str} -> {out_map}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
