#!/usr/bin/env python3
"""
jarscan.py - static JAR/class/PE malware triage. No code execution.

Parses class constant pools, method references, string constants and PE
import/export tables, then scores suspicious API usage and IOC patterns.

usage: python jarscan.py <extracted-dir> [--json out.json]
"""
from __future__ import annotations

import json
import os
import re
import struct
import sys
from collections import Counter, defaultdict

# ---------------------------------------------------------------- const pool
CP_Utf8, CP_Int, CP_Float, CP_Long, CP_Double = 1, 3, 4, 5, 6
CP_Class, CP_String, CP_Fieldref, CP_Methodref, CP_InterfaceMethodref = 7, 8, 9, 10, 11
CP_NameAndType, CP_MethodHandle, CP_MethodType = 12, 15, 16
CP_Dynamic, CP_InvokeDynamic, CP_Module, CP_Package = 17, 18, 19, 20


def mutf8(b: bytes) -> str:
    try:
        return b.decode("utf-8", "surrogatepass")
    except UnicodeDecodeError:
        return b.decode("utf-8", "replace")


class ClassFile:
    def __init__(self, path: str, data: bytes):
        self.path = path
        self.data = data
        self.cp: list = []          # index -> tuple(tag, payload)
        self.this_class = ""
        self.super_class = ""
        self.class_refs: list[str] = []
        self.method_refs: list[tuple[str, str, str]] = []
        self.field_refs: list[tuple[str, str, str]] = []
        self.strings: list[str] = []
        self.methods: list[dict] = []
        self.fields: list[dict] = []
        self._parse()

    def utf8(self, idx: int) -> str:
        if 0 < idx < len(self.cp) and self.cp[idx][0] == CP_Utf8:
            return self.cp[idx][1]
        return ""

    def _parse(self) -> None:
        d = self.data
        self.cp = [None]
        if len(d) < 10 or d[:4] != b"\xca\xfe\xba\xbe":
            raise ValueError("not a class file")
        n = struct.unpack_from(">H", d, 8)[0]
        i = 10
        cp: list = [None] * n
        k = 1
        while k < n:
            tag = d[i]
            i += 1
            if tag == CP_Utf8:
                ln = struct.unpack_from(">H", d, i)[0]
                cp[k] = (tag, mutf8(d[i + 2:i + 2 + ln]))
                i += 2 + ln
            elif tag in (CP_Int, CP_Float):
                cp[k] = (tag, d[i:i + 4]); i += 4
            elif tag in (CP_Long, CP_Double):
                cp[k] = (tag, d[i:i + 8]); i += 8; k += 1
            elif tag in (CP_Class, CP_String, CP_MethodType, CP_Module, CP_Package):
                cp[k] = (tag, struct.unpack_from(">H", d, i)[0]); i += 2
            elif tag in (CP_Fieldref, CP_Methodref, CP_InterfaceMethodref, CP_NameAndType,
                         CP_Dynamic, CP_InvokeDynamic):
                cp[k] = (tag, struct.unpack_from(">HH", d, i)); i += 4
            elif tag == CP_MethodHandle:
                cp[k] = (tag, (d[i], struct.unpack_from(">H", d, i + 1)[0])); i += 3
            else:
                raise ValueError(f"bad cp tag {tag} at {i}")
            k += 1
        self.cp = cp

        _, self.this_class = self._class_at(struct.unpack_from(">H", d, i)[0])
        _, sup = self._class_at(struct.unpack_from(">H", d, i + 2)[0])
        self.super_class = sup
        i += 6
        nif = struct.unpack_from(">H", d, i)[0]; i += 2 + 2 * nif

        nf = struct.unpack_from(">H", d, i)[0]; i += 2
        for _ in range(nf):
            acc, name_i, desc_i = struct.unpack_from(">HHH", d, i)
            i += 6
            na = struct.unpack_from(">H", d, i)[0]; i += 2
            i = self._skip_attrs(i, na)
            self.fields.append({
                "name": self.utf8(name_i),
                "desc": self.utf8(desc_i),
                "acc": acc,
            })

        nm = struct.unpack_from(">H", d, i)[0]; i += 2
        for _ in range(nm):
            acc, name_i, desc_i = struct.unpack_from(">HHH", d, i)
            i += 6
            start = i
            na = struct.unpack_from(">H", d, i)[0]; i += 2
            i = self._skip_attrs(i, na)
            self.methods.append({
                "name": self.utf8(name_i),
                "desc": self.utf8(desc_i),
                "acc": acc,
                "attrs": (start, i),
            })

        for entry in cp[1:]:
            if entry is None:
                continue
            tag, payload = entry
            if tag == CP_Class:
                self.class_refs.append(self.utf8(payload))
            elif tag in (CP_Methodref, CP_InterfaceMethodref):
                c, nt = payload
                cn = self.utf8(cp[c][1]) if cp[c] and cp[c][0] == CP_Class else ""
                if nt and cp[nt] and cp[nt][0] == CP_NameAndType:
                    nn, dd = cp[nt][1]
                    self.method_refs.append((cn, self.utf8(nn), self.utf8(dd)))
            elif tag == CP_Fieldref:
                c, nt = payload
                cn = self.utf8(cp[c][1]) if cp[c] and cp[c][0] == CP_Class else ""
                if nt and cp[nt] and cp[nt][0] == CP_NameAndType:
                    nn, dd = cp[nt][1]
                    self.field_refs.append((cn, self.utf8(nn), self.utf8(dd)))
            elif tag == CP_String:
                self.strings.append(self.utf8(payload))

    def _class_at(self, idx: int):
        e = self.cp[idx] if 0 < idx < len(self.cp) else None
        if e and e[0] == CP_Class:
            return e[0], self.utf8(e[1])
        return 0, ""

    def _skip_attrs(self, i: int, count: int) -> int:
        for _ in range(count):
            ln = struct.unpack_from(">I", self.data, i + 2)[0]
            i += 6 + ln
        return i


# ---------------------------------------------------------------- signatures
DANGER = [
    # category, label, regex against "class.method" or class names
    ("exec",      "process spawn",        r"java/lang/(Runtime\.exec|ProcessBuilder)"),
    ("exec",      "script engine",        r"javax/script|Nashorn|GroovyShell"),
    ("net",       "raw socket",           r"java/net/Socket|DatagramSocket|ServerSocket"),
    ("net",       "http client",          r"java/net/(URL|HttpURLConnection|URI)|okhttp|apache/http"),
    ("net",       "websocket",            r"WebSocket|WebSocketClient|WebSocketServer"),
    ("net",       "dns lookup",           r"InetAddress|getByName"),
    ("loader",    "remote classload",     r"URLClassLoader|defineClass|ClassLoader\.loadClass"),
    ("loader",    "reflection",           r"java/lang/reflect|MethodHandles\$Lookup|Unsafe"),
    ("loader",    "native load",          r"System\.load|System\.loadLibrary|registerNatives"),
    ("loader",    "jni attach",           r"AttachProvider|VirtualMachine"),
    ("persist",   "startup write",        r"Startup|CurrentVersion\\\\Run|schtasks|crontab|LaunchAgent"),
    ("persist",   "registry",             r"advapi32|RegSetValue|winreg|Registry"),
    ("exfil",     "clipboard read",       r"Clipboard|getSystemClipboard|GetClipboardData"),
    ("exfil",     "screenshot/capture",   r"java/awt/Robot|createScreenCapture|BitBlt|GetDC"),
    ("exfil",     "keyboard hook",        r"WH_KEYBOARD|SetWindowsHookEx|GetAsyncKeyState|KeyboardHook"),
    ("exfil",     "crypto wallet paths",  r"wallet\.dat|Electrum|Exodus|MetaMask|Local Extension Settings|Atomic"),
    ("exfil",     "browser credential",   r"Login Data|Cookies|Local State|\\Google\\Chrome|\\BraveSoftware|\\Mozilla\\Firefox|leveldb"),
    ("exfil",     "telegram/discord",     r"api\.telegram\.org|discord(app)?\.com/api/webhooks|bot[0-9]{6,}:"),
    ("exfil",     "pastebin/gist",        r"pastebin\.com|gist\.github|transfer\.sh|anonfiles|0x0\.st"),
    ("crypto",    "crypto api",           r"javax/crypto|java/security/MessageDigest|KeyFactory|SecretKeySpec"),
    ("crypto",    "base64",               r"java/util/Base64"),
    ("file",      "mass file io",         r"java/nio/file/Files\.(write|copy|move|delete)|FileOutputStream|deleteOnExit"),
    ("file",      "temp drop",            r"createTempFile"),
    ("file",      "zip/archive",          r"ZipInputStream|ZipOutputStream|ZipFile"),
    ("anti",      "anti-debug",           r"IsDebuggerPresent|CheckRemoteDebugger|ptrace|NtQueryInformationProcess"),
    ("anti",      "vm detect",            r"VMware|VirtualBox|VBOX|hypervisor|Sandboxie|Wine"),
    ("anti",      "hwid",                 r"getHardwareAddress|getSerialNumber|MachineGuid|HWID|hardware_info"),
    ("anti",      "env probe",            r"getProperty\(\"os\.|getProperty\(\"user\.|getenv"),
    ("auth",      "license/auth",         r"LICENSE|license|activate|Activate|session|token|Token|authKey|AuthKey"),
]

URL_RE = re.compile(rb"(?:https?|wss?|ftp)://[A-Za-z0-9._~:/?#\[\]@!$&'()*+,;=%\-]{4,200}")
IP_RE = re.compile(rb"\b(?:(?:25[0-5]|2[0-4]\d|1?\d?\d)\.){3}(?:25[0-5]|2[0-4]\d|1?\d?\d)\b")
DISCORD_HOOK = re.compile(rb"discord(?:app)?\.com/api/webhooks/\d+/[\w\-]+")
TG_TOKEN = re.compile(rb"\b\d{8,10}:[A-Za-z0-9_\-]{35}\b")
B64_BLOB = re.compile(rb"[A-Za-z0-9+/]{120,}={0,2}")

URL_RE_S = re.compile(r"(?:https?|wss?|ftp)://[^\s\"'<>]{4,200}")
IP_RE_S = re.compile(r"\b(?:(?:25[0-5]|2[0-4]\d|1?\d?\d)\.){3}(?:25[0-5]|2[0-4]\d|1?\d?\d)\b")
DISCORD_HOOK_S = re.compile(r"discord(?:app)?\.com/api/webhooks/\d+/[\w\-]+")
TG_TOKEN_S = re.compile(r"\b\d{8,10}:[A-Za-z0-9_\-]{35}\b")


# ---------------------------------------------------------------- PE parsing
def pe_info(path: str) -> dict:
    out = {"path": path, "imports": [], "exports": [], "sections": [], "machine": 0}
    try:
        b = open(path, "rb").read()
    except OSError:
        return out
    if b[:2] != b"MZ":
        return out
    e_lfanew = struct.unpack_from("<I", b, 0x3C)[0]
    if b[e_lfanew:e_lfanew + 4] != b"PE\0\0":
        return out
    coff = e_lfanew + 4
    machine, nsec = struct.unpack_from("<HH", b, coff)
    out["machine"] = machine
    opt_size = struct.unpack_from("<H", b, coff + 16)[0]
    opt = coff + 20
    magic = struct.unpack_from("<H", b, opt)[0]
    pe32p = magic == 0x20B
    dd_off = opt + (112 if pe32p else 96)
    imp_rva, imp_sz = struct.unpack_from("<II", b, dd_off + 8)
    exp_rva, exp_sz = struct.unpack_from("<II", b, dd_off)
    sec_off = opt + opt_size
    secs = []
    for s in range(nsec):
        o = sec_off + 40 * s
        name = b[o:o + 8].rstrip(b"\0").decode("latin-1")
        vsz, va, rsz, raw = struct.unpack_from("<IIII", b, o + 8)
        secs.append((name, va, vsz, raw, rsz))
        out["sections"].append({"name": name, "vaddr": hex(va), "vsize": vsz, "rawsize": rsz})

    def rva2off(rva: int) -> int:
        for name, va, vsz, raw, rsz in secs:
            if va <= rva < va + max(vsz, rsz):
                return raw + (rva - va)
        return 0

    try:
        if imp_rva:
            i = rva2off(imp_rva)
            for _ in range(256):
                oft, ts, fwd, name_rva, ft = struct.unpack_from("<IIIII", b, i)
                if name_rva == 0:
                    break
                dll = b[rva2off(name_rva):]
                dll = dll[:dll.index(b"\0")].decode("latin-1", "replace")
                funcs = []
                t = rva2off(oft or ft)
                if t:
                    for j in range(2048):
                        val = struct.unpack_from("<Q" if pe32p else "<I", b, t + j * (8 if pe32p else 4))[0]
                        if val == 0:
                            break
                        if val & (1 << (63 if pe32p else 31)):
                            funcs.append(f"#{val & 0xFFFF}")
                        else:
                            fn = rva2off(val & 0x7FFFFFFF)
                            if fn:
                                s = b[fn:fn + 128]
                                funcs.append(s[:s.index(b"\0")].decode("latin-1", "replace"))
                out["imports"].append({"dll": dll, "funcs": funcs})
                i += 20
        if exp_rva:
            o = rva2off(exp_rva)
            nnames, _, _, name_ptr, ord_ptr = struct.unpack_from("<IIIII", b, o + 20)
            base = struct.unpack_from("<I", b, o + 16)[0]
            for j in range(min(nnames, 4096)):
                nr = struct.unpack_from("<I", b, rva2off(name_ptr) + 4 * j)[0]
                s = b[rva2off(nr):rva2off(nr) + 128]
                out["exports"].append(s[:s.index(b"\0")].decode("latin-1", "replace"))
            out["export_base"] = base
    except (struct.error, ValueError, IndexError):
        pass
    return out


def printable_strings(b: bytes, minlen: int = 5) -> list[str]:
    return [m.group().decode("latin-1") for m in re.finditer(rb"[\x20-\x7E]{%d,}" % minlen, b)]


# ---------------------------------------------------------------- main
def main() -> int:
    root = sys.argv[1] if len(sys.argv) > 1 else "."
    out_json = None
    if "--json" in sys.argv:
        out_json = sys.argv[sys.argv.index("--json") + 1]

    classes: list[ClassFile] = []
    others: list[str] = []
    pe: list[dict] = []
    errors: list[str] = []

    for dirpath, _, files in os.walk(root):
        for f in files:
            p = os.path.join(dirpath, f)
            rel = os.path.relpath(p, root).replace("\\", "/")
            if f.endswith(".class"):
                try:
                    classes.append(ClassFile(rel, open(p, "rb").read()))
                except Exception as exc:  # noqa: BLE001
                    errors.append(f"{rel}: {exc}")
            elif f.lower().endswith((".dll", ".so", ".dylib", ".exe")):
                pe.append(pe_info(p))
            else:
                others.append(rel)

    # API usage
    usage: dict[str, dict] = defaultdict(lambda: {"classes": set(), "calls": Counter()})
    for c in classes:
        blob = "\n".join([c.this_class, c.super_class] + c.class_refs +
                         [f"{a}.{b}{d}" for a, b, d in c.method_refs] +
                         [f"{a}.{b}:{d}" for a, b, d in c.field_refs])
        for cat, label, rx in DANGER:
            m = re.search(rx, blob)
            if m:
                key = f"{cat}/{label}"
                usage[key]["classes"].add(c.this_class or c.path)
                usage[key]["calls"][m.group(0)[:80]] += 1

    # IOC harvest
    iocs = {"urls": Counter(), "ips": Counter(), "discord": Counter(),
            "telegram": Counter(), "b64": Counter()}
    for c in classes:
        for s in c.strings:
            for m in URL_RE_S.finditer(s):
                iocs["urls"][m.group()] += 1
            for m in IP_RE_S.finditer(s):
                iocs["ips"][m.group()] += 1
            for m in DISCORD_HOOK_S.finditer(s):
                iocs["discord"][m.group()] += 1
            for m in TG_TOKEN_S.finditer(s):
                iocs["telegram"][m.group()] += 1

    native_strings = {}
    for p in pe:
        b = open(p["path"], "rb").read()
        strs = printable_strings(b)
        native_strings[p["path"]] = strs
        for s in strs:
            sb = s.encode("latin-1", "replace")
            for m in URL_RE.finditer(sb):
                iocs["urls"][m.group().decode("latin-1")] += 1
            for m in IP_RE.finditer(sb):
                iocs["ips"][m.group().decode("latin-1")] += 1
            for m in DISCORD_HOOK.finditer(sb):
                iocs["discord"][m.group().decode("latin-1")] += 1
            for m in B64_BLOB.finditer(sb):
                iocs["b64"][m.group().decode("latin-1")[:80] + "..."] += 1

    report = {
        "root": os.path.abspath(root),
        "classes": len(classes),
        "other_files": len(others),
        "parse_errors": errors,
        "api_usage": {k: {"classes": sorted(v["classes"]), "calls": dict(v["calls"])}
                      for k, v in sorted(usage.items())},
        "iocs": {k: dict(v.most_common(60)) for k, v in iocs.items()},
        "pe": pe,
        "native_strings": {k: v for k, v in native_strings.items()},
    }
    if out_json:
        with open(out_json, "w", encoding="utf-8") as fh:
            json.dump(report, fh, indent=1)

    # ---- human summary
    print(f"root            : {report['root']}")
    print(f"classes         : {report['classes']}")
    print(f"native modules  : {len(pe)}")
    print(f"parse errors    : {len(errors)}")
    print()
    print("== API / CAPABILITY MATRIX ==")
    for k, v in sorted(usage.items()):
        print(f"{k:34s} {len(v['classes']):4d} classes   e.g. {sorted(v['classes'])[0]}")
    print()
    print("== IOCS IN MANAGED CODE ==")
    for k in ("discord", "telegram", "urls", "ips"):
        print(f"-- {k} ({len(iocs[k])})")
        for val, n in iocs[k].most_common(40):
            print(f"   {n:3d}x {val}")
    print()
    print("== NATIVE MODULES ==")
    for p in pe:
        print(f"{p['path']}  machine={hex(p['machine'])}")
        print(f"   sections: {', '.join(s['name'] for s in p['sections'])}")
        print(f"   exports : {', '.join(p['exports'][:20]) or '-'}")
        for imp in p["imports"]:
            print(f"   {imp['dll']}: {', '.join(imp['funcs'][:18])}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
