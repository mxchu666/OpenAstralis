# OpenAstralis

Reverse engineering of **Astralis 08.10.25 (1.21, Fabric)** — a Minecraft cheat client
whose protection is a four-layer obfuscator plus a native JVM bytecode VM
(`dev/opalV2`).

Everything here was produced **statically**. No class from the target was loaded,
no native DLL was mapped, nothing was executed. The jar was parsed byte by byte,
the constants were decrypted in Python, the bytecode was rewritten with ASM, and
the native bodies were translated with IDA Pro 9.5 in headless mode.

```
target jar   55,300,085 bytes
sha256       a39253d43097012e07fa864745a1789bb1bf671d825cdb00f99a353a38f0a849
```

---

## What is in here

| Path | Contents |
|---|---|
| `src/` | 518 decompiled `.java` files (`cc/astralis/**` + `astralis/mixin/**`) |
| `mapping/deobf.map` | per-class DES keys, constant tables, string blobs (518 classes) |
| `mapping/offsets.json` | every folded constant: integer table entries and Unsafe offsets |
| `native/bodies/` | 16 devirtualized native bodies + annotated variants (C pseudocode) |
| `native/registry/` | native method registry, symbol tables, lazy slots |
| `tools/` | the whole pipeline: Python key recovery, ASM rewriter, IDA dumper |
| `docs/analysis/` | original analysis reports (Spanish) |
| `docs/en/`, `docs/es/` | plain-language explanations, both languages |

---

## The four layers

1. **Encrypted strings in `<clinit>`** — each class carries a `long a` and a
   character blob; `static {}` derives a DES key from a per-class constant and
   decrypts the blob. Plaintext is **CESU-8**, not UTF-8.
2. **Encrypted `long[] b` integer table** — 32768 entries, DES/CBC/NoPadding in
   8-byte blocks, IV = 0. This is the constant dictionary of the client
   (coordinates, offsets, packet IDs).
3. **`invokedynamic (IJ)I`** — an integer constant site: index is XOR-folded with
   the key and a per-class salt, then read out of the table.
4. **`invokedynamic (IJ)Ljava/lang/String;`** — two-stage: table entry decrypted
   with the class key, decoded as CESU-8, re-encoded ISO-8859-1, decrypted again
   with the site key. Only then is it a string.

A fifth layer was found later: **`invokedynamic (IJ)J`**, the same scheme but
returning the full 8-byte `long`. These sites are the raw memory offsets the
cheat feeds to `sun.misc.Unsafe`. They are folded by `tools/AstralisDeobf.java`
(`long` support) and land in `mapping/offsets.json`.

---

## The native component

`dev/opalV2/x64-windows.dll` (1,148,928 bytes) is a JVM bytecode interpreter. The
classes `dqq`, `evd`, `fz` and `hdl` have their `<clinit>` and several methods
stripped to `native` stubs; the DLL registers an implementation for each, and on
first touch the VM interprets a serialized method body and writes the static
fields back through JNI.

- No network imports at all (`ws2_32`, `wininet`, `winhttp` absent). Java does the I/O.
- `Loader.<clinit>` copies the DLL to `%TEMP%\lib<random>.tmp`, `System.load`s it,
  then `JNI_OnLoad` define-classes `dev/opalV2/hidden/Hidden0` (1170 bytes) and
  registers the natives.
- 16 bodies were dumped, decompiled and annotated: `native/bodies/`.

---

## Rebuilding

Requires JDK 21+, Python 3.10+, and the original jar (not distributed here).

```powershell
$env:PYTHONIOENCODING = 'utf-8'

# 1. recover keys, constant tables and string blobs
python tools\astralis_deobf.py work\extract work\deobf.map work\deobf_report.txt

# 2. compile the ASM rewriter
javac -cp "tools\asm.jar;tools\asm-tree.jar;tools\asm-util.jar;tools\asm-analysis.jar" `
      -d tools\classes tools\AstralisDeobf.java

# 3. fold invokedynamic sites -> LDC
java -cp "tools\classes;tools\asm.jar;tools\asm-tree.jar;tools\asm-util.jar;tools\asm-analysis.jar" `
     AstralisDeobf work\extract work\deobf work\deobf.map

# 4. decompile
java -jar tools\vineflower.jar -dgs=1 -hdc=0 -asc=1 -jrt=1 work\deobf work\src
```

---

## What this is not

No working client, no license bypass, no C2 endpoint that answers. The reports in
`docs/analysis/` document the remote-control surface that was found (WebSocket,
Discord bot, Pastebin config, HWID DTO) and the sanitized builds that were made
from it.

---

## Español

Ingeniería inversa de **Astralis**, un cliente de trampas para Minecraft. Todo el
trabajo se hizo **sin ejecutar nada**: el jar se analizó byte a byte, las
constantes se descifraron en Python, el bytecode se reescribió con ASM y las
funciones nativas se tradujeron con IDA en modo headless.

El cliente usa un ofuscador propio de cuatro capas (strings cifrados con DES,
tabla de enteros cifrada, y dos tipos de `invokedynamic` que resuelven constantes
contra esa tabla) más una quinta capa de `long` que devuelve los offsets de
memoria usados con `Unsafe`. Encima hay una DLL de 1,1 MB que es una VM de
bytecode: cuatro clases (`dqq`, `evd`, `fz`, `hdl`) tienen sus métodos vaciados a
`native` y la DLL interpreta el cuerpo original en el primer uso.

- `src/` — 518 ficheros Java ya decompilados.
- `mapping/` — claves, tablas y todos los offsets extraídos.
- `native/` — los 16 cuerpos nativos traducidos a C.
- `docs/es/` — explicación en español, sin jerga.
- `docs/analysis/` — los informes originales, incluido el de malware y C2.
