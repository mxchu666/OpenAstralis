# OpenAstralis

Static reverse engineering of **DrCrypter v2.11** — the crack/loader for the
**Astralis** Minecraft cheat client (Fabric, Minecraft 1.21).

Everything here was produced **without executing the target**. The launcher was
parsed as a PE file, its payload was decompressed offline, the inner jar was
parsed byte by byte, the encrypted constants were recovered in Python, the
bytecode was rewritten with ASM, and the native methods were translated with
IDA Pro. No class was loaded, no DLL was mapped, no packet was sent.

```
artifact      astralis.exe          1,325,867,008 bytes
sha256        20d030efebc8a73e50c8ab0fe60a5aba487fd11c617c8b68521a76dc584cbf4f

inner jar     astralis.jar             55,300,085 bytes, 518 classes
sha256        a39253d43097012e07fa864745a1789bb1bf671d825cdb00f99a353a38f0a849
```

---

## What is in here

| Path | Contents |
|---|---|
| `src/` | 518 decompiled `.java` files (`cc/astralis/**` + `astralis/mixin/**`) |
| `mapping/deobf.map` | per-class DES keys, constant tables, string blobs (518 classes) |
| `mapping/offsets.json` | 3,799 folded constants from 226 classes: 1,999 ints, 1,641 strings, 159 Unsafe offsets |
| `native/bodies/` | 16 devirtualized native bodies + annotated variants (C pseudocode) |
| `native/registry/` | native method registry, symbol tables, lazy slots |
| `tools/` | the whole pipeline: Python key recovery, ASM rewriter, IDA dumper |
| `tools/lib/` | vendored ASM 9 jars so the build works offline |
| `build.sh`, `build.ps1` | one-command build of the tooling (JDK 21+, no network) |
| `.github/workflows/build.yml` | CI: builds on Linux and Windows |
| `docs/analysis/` | original analysis reports (Spanish) |
| `docs/en/`, `docs/es/` | plain-language explanations, both languages |

---

## How DrCrypter v2.11 is built

The `.exe` is not a plain Java launcher. It is a Nuitka onefile bootstrap with a
complete portable Minecraft environment embedded in its `.rdata` section:

```
astralis.exe
├─ PE bootstrap (Nuitka onefile, "KAX" payload header at 0xEA50)
│   └─ compiled_launcher.dll                 6,786,048 bytes
│       └─ CPython 3 launcher, obfuscated at the Python bytecode level
└─ embedded ZIP payload at 0xD4E20D        5,930 entries
    ├─ Runtime/        200 files            portable JRE (java.exe, jvm.dll, libs)
    ├─ Assets/       5,715 files            Minecraft 1.21 assets, skins, icons
    ├─ Game/            14 files            options.txt, servers.dat, viafabricplus,
    │                                       sodium config, usercache.json
    ├─ Python/libsodium.dll                  crypto used by the loader
    └─ Runtime/astralis.dll.zst            685,406,607 bytes, stored
        └─ astralis.dll                  1,933,113,344 bytes, PE32+
            ├─ .text                         321 MB of native code
            ├─ .svm_int                        32 KB virtualized entry stubs
            ├─ .svm_hea                        1.58 GB virtualization heap
            └─ .vmp0                           23 MB VMProtect section
```

Facts established from the file itself:

- The onefile payload starts at `0xEA50` with the `KAX` header, followed by
  UTF-16 file names, a `uint64` size and the file body.
- The ZIP payload starts at `0xD4E20D`; its central directory has 5,930 entries
  and sits at `0x4E6BD0F1`.
- `Runtime/astralis.dll.zst` is a valid zstd frame (`28 B5 2F FD`) whose declared
  content size is exactly `0x73447000` — the same value as the PE image end.
- The decompressed DLL carries `.vmp0` plus two `.svm_*` sections. That is a
  VMProtect-protected binary, not something a Java decompiler can read.

The ZIP is the distribution: a portable JRE, the 1.21 asset set and the game
instance. The outer launcher supplies the runtime and the environment; the cheat
classes analyzed in this repository come from the companion `astralis.jar`.

---

## The five obfuscation layers

1. **Encrypted strings in `<clinit>`** — each class carries a `long a` and a
   character blob; `static {}` derives a DES key from a per-class constant and
   decrypts the blob. Plaintext is **CESU-8**, not UTF-8.
2. **Encrypted `long[] b` tables** — the constant dictionary of the client
   (coordinates, offsets, packet IDs), DES/CBC/NoPadding in 8-byte blocks, IV = 0.
   A class may own several tables; each `<clinit>` fill block is mapped to its
   own field so the indices do not drift.
3. **`invokedynamic (IJ)I`** — integer constant site: the index is XOR-folded
   with the site key and a per-class salt, then read from the table.
4. **`invokedynamic (IJ)Ljava/lang/String;`** — two-stage: table entry decrypted
   with the class key, decoded as CESU-8, re-encoded ISO-8859-1, decrypted again
   with the site key. Only then is it a string.
5. **`invokedynamic (IJ)J`** — the same scheme returning the full 8-byte `long`.
   These are the raw memory offsets the cheat feeds to `sun.misc.Unsafe`.

All five are folded offline by `tools/astralis_deobf.py` + `tools/AstralisDeobf.java`.
The output is `mapping/offsets.json`:

```json
{
  "counts": { "(IJ)I": 1999, "(IJ)J": 159, "(IJ)Ljava/lang/String;": 1641 },
  "classes": 226,
  "jar_sha256": "a39253d4...f0a849"
}
```

Lambdas and string concatenation use the same opcode but are legitimate Java;
they are left untouched.

---

## The native component

`dev/opalV2/x64-windows.dll` (1,148,928 bytes) is a JVM bytecode interpreter. The
classes `dqq`, `evd`, `fz` and `hdl` have their `<clinit>` and several methods
stripped to `native` stubs; the DLL registers an implementation for each, and on
first touch the VM interprets a serialized method body and writes the static
fields back through JNI.

- No network imports at all (`ws2_32`, `wininet`, `winhttp` absent). Java does the I/O.
- `Loader.<clinit>` copies the DLL to `%TEMP%\lib<random>.tmp`, `System.load`s it,
  then `JNI_OnLoad` define-classes `dev/opalV2/hidden/Hidden0` (1,170 bytes) and
  registers the natives.
- 16 bodies were dumped, decompiled and annotated: `native/bodies/`.

This is a different component from the VMProtect DLL in the outer launcher. The
JVM VM is analyzed here; the VMProtect binary is documented at the file level and
is not devirtualized.

---

## Rebuilding

Requires **JDK 21+** and **Python 3.10+** (`pip install -r requirements.txt`).

```bash
./build.sh          # or: ./build.ps1  on Windows
```

That compiles `tools/*.java` against the vendored ASM jars in `tools/lib`,
produces `build/openastralis-tools.jar`, runs a smoke test and byte-compiles the
Python tools. No network access is needed to build.

Then, with the original jar extracted into `work/extract`:

```bash
# 1. recover keys, per-field constant tables, string blobs and the indy salts
python tools/astralis_deobf.py work/extract work/deobf.map work/deobf_report.txt

# 2. fold every invokedynamic site -> LDC
java -cp "build/openastralis-tools.jar:tools/lib/*" AstralisDeobf \
     work/extract work/deobf work/deobf.map

# 3. decompile
java -jar tools/vineflower.jar -dgs=1 -hdc=0 -asc=1 -jrt=1 work/deobf work/src
```

`tools/indy_scan.py <classes-dir>` reports every `invokedynamic` descriptor in a
tree and which bootstrap method serves it — the fastest way to confirm a new
obfuscator variant before touching the rewriter.

The 518 files under `src/` are the **result** of that pipeline. They reference
Minecraft through Fabric intermediary names (`net.minecraft.class_310`), so they
only compile inside a Fabric 1.21 workspace with intermediary mappings; they are
not part of this project's build.

---

## What this is not

The original `.exe` and `.jar` are not redistributed here. This repository
contains the analysis, the recovered source and the tooling — not a runnable
client, not a license bypass, and not a C2 endpoint. The reports in
`docs/analysis/` document the remote-control surface that was found (WebSocket,
Discord bot, Pastebin config, HWID DTO) and the sanitized builds that were made
from it.

---

## Español

Ingeniería inversa estática de **DrCrypter v2.11**, el crack/cargador del cliente
de trampas **Astralis** para Minecraft (Fabric, Minecraft 1.21).

Nada se ejecutó. El lanzador se analizó como fichero PE, su payload se descomprimió
sin conexión, el jar interno se leyó byte a byte, las constantes cifradas se
recuperaron con Python, el bytecode se reescribió con ASM y los métodos nativos se
tradujeron con IDA Pro.

```
artefacto     astralis.exe          1.325.867.008 bytes
sha256        20d030ef...dc584cbf4f

jar interno   astralis.jar             55.300.085 bytes, 518 clases
sha256        a39253d4...38f0a849
```

### Cómo está construido

El `.exe` no es un lanzador Java normal: es un bootstrap de **Nuitka onefile** con
un entorno de Minecraft completo incrustado en `.rdata`.

- Cabecera `KAX` en `0xEA50`, con `compiled_launcher.dll` (6.786.048 bytes), un
  lanzador de CPython ofuscado.
- Un ZIP en `0xD4E20D` con **5.930 entradas**: 5.715 assets de Minecraft 1.21,
  200 ficheros del JRE portátil, 14 ficheros de configuración de la instancia
  (`options.txt`, `servers.dat`, `viafabricplus`, `sodium`) y `Python/libsodium.dll`.
- `Runtime/astralis.dll.zst` (685.406.607 bytes) se descomprime a un PE de
  **1.933.113.344 bytes** con secciones `.svm_int`, `.svm_hea` (1,58 GB) y `.vmp0`:
  binario protegido con VMProtect. El análisis de este repositorio empieza en el
  jar que carga ese lanzador, no en el DLL virtualizado.

### Las cinco capas

1. **Strings cifrados en `<clinit>`** — clave DES derivada de una constante por
   clase; el texto plano es **CESU-8**, no UTF-8.
2. **Tablas `long[]` cifradas** — el diccionario de constantes del cliente
   (coordenadas, offsets, IDs de paquetes), DES/CBC/NoPadding, IV = 0.
3. **`invokedynamic (IJ)I`** — constante entera: índice XOR con la clave del sitio
   y una sal por clase, y lectura de la tabla.
4. **`invokedynamic (IJ)String`** — dos etapas: descifrado con la clave de clase,
   decodificación CESU-8, re-codificación ISO-8859-1 y segundo descifrado.
5. **`invokedynamic (IJ)J`** — igual, pero devuelve el `long` completo: son los
   offsets de memoria que el cheat pasa a `sun.misc.Unsafe`.

Las cinco capas se pliegan sin conexión con `tools/astralis_deobf.py` y
`tools/AstralisDeobf.java`. El resultado está en `mapping/offsets.json`: 3.799
constantes de 226 clases (1.999 enteros, 1.641 strings, 159 offsets).

### El componente nativo

`dev/opalV2/x64-windows.dll` (1.148.928 bytes) es un intérprete de bytecode JVM.
Las clases `dqq`, `evd`, `fz` y `hdl` tienen métodos `native`; la DLL los implementa
y escribe los campos estáticos por JNI. No tiene imports de red: el I/O lo hace
Java. Se recuperaron 16 cuerpos y están en `native/bodies/`.

### Compilar

```bash
./build.sh          # o ./build.ps1 en Windows
```

Necesita **JDK 21+** y **Python 3.10+**. Compila las herramientas contra los jars
de ASM incluidos, genera `build/openastralis-tools.jar`, prueba `--help` y
byte-compila los scripts de Python. No usa red.

Los 518 ficheros de `src/` son el resultado del pipeline. Usan nombres
intermediarios de Fabric (`net.minecraft.class_310`), así que solo compilan dentro
de un workspace de Fabric 1.21; no forman parte del build de este proyecto.

### Qué no hay aquí

No se redistribuyen el `.exe` ni el `.jar` originales. Hay análisis, código
recuperado y herramientas; no hay un cliente ejecutable, ni un bypass de licencia,
ni un C2 que responda. Los informes de `docs/analysis/` documentan la superficie de
control remoto encontrada (WebSocket, bot de Discord, configuración por Pastebin,
DTO de HWID) y las versiones saneadas que se generaron a partir de ella.
