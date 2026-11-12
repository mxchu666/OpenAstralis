#!/usr/bin/env python3
"""
deobf.py - static string decryptor for the DES/<clinit> obfuscation used in
Astralis (cc.astralis.*). Pure parsing + crypto, nothing from the jar is
executed.

Per class:
  <clinit>: ldc2_w A; putstatic <cls>.a:J
             getstatic a; ldc2_w K; lxor; lstore_n     -> key = A ^ K
             Cipher DES/CBC/PKCS5Padding, IV = 8 zero bytes

  encrypted string sits as a CONSTANT_String in the pool, decoded with
  cipher.doFinal(s.getBytes("ISO-8859-1")) then a CESU-8 style byte->char pass.

usage:
  python deobf.py dump   <classes-dir> [out.json]
  python deobf.py patch  <classes-dir> <out-dir> <map.json>
"""
from __future__ import annotations

import json
import os
import re
import struct
import sys
from collections import Counter

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from jarscan import ClassFile  # noqa: E402

from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes  # noqa: E402

OP_LDC = 0x12
OP_LDC_W = 0x13
OP_LDC2_W = 0x14
OP_GETSTATIC = 0xB2
OP_PUTSTATIC = 0xB3
OP_LXOR = 0x61
OP_LSTORE = 0x37
OP_LSTORE_0 = 0x3F

# operand sizes for the opcodes we must skip correctly
FIXED = {0x10: 1, 0x11: 2, 0x12: 1, 0x13: 2, 0x14: 2, 0x15: 1, 0x16: 1, 0x17: 1,
         0x18: 1, 0x19: 1, 0x36: 1, 0x37: 1, 0x38: 1, 0x39: 1, 0x3A: 1,
         0xA9: 1, 0xBC: 1, 0x84: 2, 0xB2: 2, 0xB3: 2, 0xB4: 2, 0xB5: 2,
         0xB6: 2, 0xB7: 2, 0xB8: 2, 0xB9: 4, 0xBA: 4, 0xBB: 2, 0xBD: 2,
         0xC0: 2, 0xC1: 2, 0xC5: 3, 0xC6: 2, 0xC7: 2, 0xC8: 4, 0xC9: 4,
         0xCA: 1, 0xCB: 1, 0xCC: 0, 0xBE: 0, 0xBF: 0}
SWITCH = {0xAA: 0, 0xAB: 0}


def iter_insns(code: bytes):
    """yield (offset, opcode, operands)"""
    i, n = 0, len(code)
    while i < n:
        op = code[i]
        if op in SWITCH:
            pad = (4 - ((i + 1) % 4)) % 4
            j = i + 1 + pad
            if op == 0xAA:  # tableswitch
                low, high = struct.unpack_from(">ii", code, j + 4)
                j += 12 + 4 * (high - low + 1)
            else:  # lookupswitch
                npairs = struct.unpack_from(">i", code, j + 4)[0]
                j += 8 + 8 * npairs
            yield i, op, code[i + 1:j]
            i = j
            continue
        if op == 0xC4:  # wide
            sub = code[i + 1]
            ln = 2 if sub == 0x84 else 1
            yield i, op, code[i + 1:i + 2 + ln]
            i += 2 + ln
            continue
        ln = FIXED.get(op)
        if ln is None:
            ln = 0
        yield i, op, code[i + 1:i + 1 + ln]
        i += 1 + ln


def code_of(cf: ClassFile, m: dict) -> bytes:
    """extract the Code attribute bytes for a method record"""
    d = cf.data
    start, end = m["attrs"]
    i = start
    cnt = struct.unpack_from(">H", d, i)[0]
    i += 2
    for _ in range(cnt):
        name_i, ln = struct.unpack_from(">HI", d, i)
        if cf.utf8(name_i) == "Code":
            base = i + 6
            code_len = struct.unpack_from(">I", d, base + 4)[0]
            return d[base + 8:base + 8 + code_len]
        i += 6 + ln
    return b""


def cesu8_decode(b: bytes) -> str:
    out = []
    i, n = 0, len(b)
    while i < n:
        v = b[i]
        if v < 0xC0:
            out.append(chr(v))
            i += 1
        elif v < 0xE0 and i + 1 < n:
            out.append(chr(((v & 0x1F) << 6) | (b[i + 1] & 0x3F)))
            i += 2
        elif i + 2 < n:
            out.append(chr(((v & 0x0F) << 12) | ((b[i + 1] & 0x3F) << 6) | (b[i + 2] & 0x3F)))
            i += 3
        else:
            return "".join(out)
    return "".join(out)


def key_bytes(v: int) -> bytes:
    return ((v & 0xFFFFFFFFFFFFFFFF).to_bytes(8, "big"))


def des_decrypt(ct: bytes, key: int) -> bytes | None:
    if not ct or len(ct) % 8:
        return None
    try:
        c = Cipher(algorithms.TripleDES(key_bytes(key)), modes.CBC(b"\0" * 8))
        pt = c.decryptor().update(ct)
    except Exception:  # noqa: BLE001
        return None
    if not pt:
        return None
    pad = pt[-1]
    if pad < 1 or pad > 8 or pt[-pad:] != bytes([pad]) * pad:
        return None
    return pt[:-pad]


printable = set(range(0x20, 0x7F)) | {0x09, 0x0A, 0x0D}


def score(s: str) -> int:
    if not s:
        return -100
    ok = sum(1 for ch in s if ord(ch) in printable or ord(ch) > 0x7F)
    return ok * 10 // len(s) - (len(s) - ok)


def decrypt_class(cf: ClassFile) -> dict[str, str]:
    longs: list[int] = []
    a_const = None
    xor_pairs: list[int] = []

    for m in cf.methods:
        code = code_of(cf, m)
        if not code:
            continue
        prev = None
        prev2 = None
        for off, op, operands in iter_insns(code):
            if op == OP_LDC2_W:
                idx = struct.unpack(">H", operands)[0] if operands else 0
                e = cf.cp[idx] if 0 < idx < len(cf.cp) else None
                if e and e[0] == 5:
                    val = struct.unpack(">q", e[1])[0]
                    longs.append(val)
                    prev2, prev = prev, ("long", val)
                continue
            if op == OP_PUTSTATIC:
                idx = struct.unpack(">H", operands)[0]
                if 0 < idx < len(cf.cp) and cf.cp[idx][0] == 9:
                    c_i, nt_i = cf.cp[idx][1]
                    nn, dd = cf.cp[nt_i][1]
                    if cf.utf8(nn) == "a" and cf.utf8(dd) == "J" and prev and prev[0] == "long":
                        a_const = prev[1]
                continue
            if op == OP_LXOR and prev and prev[0] == "long":
                xor_pairs.append(prev[1])
            if op in (OP_LSTORE_0,) or op in (OP_LSTORE, 0x38, 0x39, 0x3A):
                prev2 = prev; prev = None
                continue
            if op == OP_GETSTATIC or op == OP_LDC:
                prev2, prev = prev, None
                continue
            prev2 = prev
            prev = None

    candidates = set()
    if a_const is not None:
        for k in longs:
            candidates.add(a_const ^ k)
    candidates.update(longs)

    out: dict[str, str] = {}
    for s in cf.strings:
        raw = s.encode("latin-1", "replace")
        if len(s) < 3 or len(raw) % 8:
            continue
        # ciphertext always carries control/high bytes
        if all(0x20 <= b < 0x7F for b in raw) and len(s) < 12:
            continue
        best = None
        best_score = 0
        for key in candidates:
            pt = des_decrypt(raw, key)
            if pt is None:
                continue
            dec = cesu8_decode(pt)
            sc = score(dec)
            if sc > best_score:
                best, best_score = dec, sc
        if best and best_score >= 8:
            out[s] = best
    return out


def walk(root: str):
    for dirpath, _, files in os.walk(root):
        for f in files:
            if f.endswith(".class"):
                p = os.path.join(dirpath, f)
                yield p, os.path.relpath(p, root).replace("\\", "/")


def cmd_dump(root: str, out_json: str | None) -> int:
    result = {}
    total = 0
    for p, rel in walk(root):
        try:
            cf = ClassFile(rel, open(p, "rb").read())
            mapping = decrypt_class(cf)
        except Exception as exc:  # noqa: BLE001
            print(f"[!] {rel}: {exc}")
            continue
        if mapping:
            result[rel] = mapping
            total += len(mapping)
    print(f"classes with decrypted strings: {len(result)}   strings: {total}")
    for rel in sorted(result):
        print(f"\n== {rel}")
        for enc, dec in result[rel].items():
            print(f"   {dec}")
    if out_json:
        with open(out_json, "w", encoding="utf-8") as fh:
            json.dump(result, fh, indent=1, ensure_ascii=False)
    return 0


def cmd_patch(root: str, outdir: str, mapfile: str) -> int:
    mapping = json.load(open(mapfile, encoding="utf-8"))
    print(f"map classes: {len(mapping)}")
    print("run: java -cp tools/asm.jar;tools/asm-tree.jar;tools/asm-util.jar "
          "tools/StrPatch.java --in ./work/extract --out ./work/deobf --map scan_strings.json")
    return 0


if __name__ == "__main__":
    if len(sys.argv) < 3:
        print(__doc__)
        raise SystemExit(2)
    cmd = sys.argv[1]
    if cmd == "dump":
        raise SystemExit(cmd_dump(sys.argv[2], sys.argv[3] if len(sys.argv) > 3 else None))
    if cmd == "patch":
        raise SystemExit(cmd_patch(sys.argv[2], sys.argv[3], sys.argv[4]))
    raise SystemExit(__doc__)
