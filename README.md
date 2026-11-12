# OpenAstralis

Static reverse engineering of **`astralis.exe`** — the **DrCrypter Astralis 2.11**
build of the **Astralis** Minecraft cheat client (**`astralis-recode 2.2`**, its
own manifest declares `minecraft ~26.2`).

Nothing in this repository was produced by running the target. The launcher was
parsed as a PE file, its payload was extracted and decompressed offline, the
launcher's Python layer was read out of the compiled module, the native image was
inventoried section by section with IDA Pro, and the recovered Java layer was
rewritten with ASM. No DLL was mapped, no class was loaded, no packet was sent.

```
artifact      astralis.exe          1,325,867,008 bytes
sha256        20d030efebc8a73e50c8ab0fe60a5aba487fd11c617c8b68521a76dc584cbf4f
format        PE32+ x86-64, 11 sections, image base 0x140000000
timestamp     2026-11-10 10:05:39 UTC
```

---

## What the file actually is

Four stages sit between the `.exe` and the running client. Each stage is a
different technology, and each one is documented below with the values that were
read out of the file.

```
astralis.exe
  PE bootstrap, Nuitka onefile
  KAX payload at 0xEA50
    compiled_launcher.dll        6,786,048 bytes  sha256 e6d1a526...b98ffe96
      Nuitka-compiled CPython 3.12 launcher ("Astralis Offline")
  ZIP payload at 0xD4E20D, central directory at 0x4E6BD0F1, 5,930 entries
    Assets/                      5,715 files   Minecraft assets
    Runtime/                       200 files   portable JRE 25.0.4.1
      serenity-client-host.exe     468,648 bytes  sha256 4068f524...29ec80c3
      astralis.dll.zst         685,406,607 bytes  zstd, stored
      serenity-native-release.properties
    Game/                           14 files   options.txt, servers.dat,
                                                viafabricplus, sodium config
    Python/libsodium.dll             1 file   crypto used by the launcher
```

`Runtime/astralis.dll.zst` decompresses to a **1,933,864,960-byte PE32+**
(`sha256 f2168fc4...a1b10d0`). That file is the client, and it is not Java
bytecode: it is a **GraalVM SubstrateVM native image** wrapped in VMProtect.

| `.` section | virtual size | contents |
|---|---|---|
| `.text` | 321,993,123 | AOT-compiled code, all Java methods are native here |
| `.svm_int` | 32,736 | SubstrateVM image metadata |
| `.rdata` | 2,854,582 | image constants, export table (534 CEntryPoint symbols) |
| `.svm_hea` | 1,580,941,312 | image heap: class hubs, resources, static data |
| `.vmp0` | 23,190,040 | VMProtect layer |
| `.reloc` | 93,240 | relocations |

Facts taken from the image itself:

```
image base              0x180000000
entry point             0x132c9114
sections                9
exports                 534   JNI_CreateJavaVM, JavaMainWrapper__run,
                              serenity_client_bind, serenity_client_start
JAVA_VERSION            25.0.4.1
minecraftVersion        26.2
ipcVersion              9
entrypoint              astralis.dll
```

`.svm_int` and `.svm_hea` are SubstrateVM sections, and the export list is the
CEntryPoint set of a native image. There is no `.class` file anywhere in the
.dex, no jar and no Java bytecode: a native image is compiled ahead of time, so
the mod code exists only as x86-64 machine code plus image metadata.

---

## Stage 2 — the launcher (`compiled_launcher.dll`)

The onefile payload is a Nuitka-compiled CPython module that imports
`python312.dll` and exposes 1,529 functions. Its Python module names survive in
the compiled string table:

```
run_windows.py          entry point, builds the client command line
runtime_data.py         locates Runtime/, decompresses astralis.dll.zst
offline_ipc_server.py   local IPC server the client talks to
offline_profile.py      the offline account packet (uuid, name, avatar)
offline_configs.py      emulator settings
```

Those names, and everything else in this stage, were read out of the module's
constant blob, not from code xrefs: the Nuitka build stores every string in one
tagged/length-prefixed region and decodes it at import time, so IDA shows the
literal at, say, `0x3ae8f6a72` with no pointer and no reference from `.text`.
The 6.78 MB module is 1,529 functions; the blob is what ties them to their
purpose.

What it does, in order:

1. Reads `launcher-settings.json` and `resources.json`, resolves `Runtime/` and
   the user data root (`%LOCALAPPDATA%\AstralisData`, override
   `ASTRALIS_USER_DATA_ROOT`).
2. Decompresses `astralis.dll.zst` into `runtime_data/astralis.dll`.
3. Loads `Python/libsodium.dll` and uses **ChaCha20-Poly1305 IETF**
   (`crypto_aead_chacha20poly1305_ietf_encrypt/decrypt`) with labels
   `serenity-ipc-frame`, `serenity-ipc-v1`, `ipc-encryption`,
   `session-encryption`, `outer-encryption`. The key material lives in
   `ipc.seed`.
4. Serves the client's auth and session gates locally instead of contacting the
   real backend: `LAB_TOKEN_GATE` → `offline-lab-token`,
   `LAB_SYNTHETIC_USER_INFO`, `LAB_WEBSOCKET_PLAINTEXT`,
   `LAB_CAPTURED_PACKET_TRACE`. The offline identity is
   `Offline / 00000000000000000000000000000000`.
5. Starts `serenity-client-host.exe` with a fixed argument vector and a fresh
   `\\.\pipe\<uuid4>` handoff, then logs `client.stdout.log`,
   `client.stderr.log`, `emulator.log` and `emulator-errors.log`.

The argument vector, recovered verbatim from the compiled module:

```
serenity-client-host.exe
  -Dserenity.guard=1
  -Dserenity.launcher.pid=<pid>
  -Djava.home=<Runtime>
  -XX:InitialCollectionPolicy=Proportionate
  --username Offline
  --version <version>
  --gameDir <Game>
  --assetsDir <Assets>
  --assetIndex <index>
  --uuid 00000000000000000000000000000000
  --accessToken <token>
  --userType legacy
  --versionType release
  --clientId ...
  --xuid ...
```

Environment it sets for the child: `GALLIUM_DRIVER=llvmpipe`,
`VK_DRIVER_FILES`/`VK_ICD_FILENAMES=windows_amd64/vk_swiftshader_icd.json`,
`SERENITY_NATIVE_IPC_FILE`, and `PATH` extended with `windows_amd64`.

That is the whole crack: the client's authentication is answered by a local
process instead of the vendor's service, and every frame between the two is
encrypted with a key derived from `ipc.seed`.

## Stage 3 — the host (`serenity-client-host.exe`)

468,648 bytes, 1,115 functions, imports limited to `KERNEL32`, `ADVAPI32` and the
UCRT — plus `AddDllDirectory` and `CryptAcquireContextA`. Its string table names
the contract:

```
serenity-native-artifact-v2      artifact marker
@serenity-bootstrap-v1:%s        bootstrap report
serenity_client_bind             resolved from the image
serenity_client_start            resolved from the image
-Djava.home=%s
-Djava.library.path=%s
-Dsun.boot.library.path=%s
```

It loads `astralis.dll`, resolves `serenity_client_bind` and
`serenity_client_start`, builds the JVM argument list above and enters the image.
This is the Fabric **Serenity** native-client host: the JVM is not a separate
`java.exe`, it is the image.

The import table is deliberately tiny — 13 symbols, of which only
`AddDllDirectory` and `CryptAcquireContextA` are Win32 calls. Everything else is
resolved at runtime by walking the target module's export directory
(`sub_1400071E0`, 453 bytes: reads the PE headers, the export name array and the
ordinal table, then returns the function pointer). In IDA the whole bootstrap is
one 4,267-byte function, `sub_140001BA0`, at image base `0x140000000`:

```
0x1400024d6  sub_1400071E0(..., "serenity_client_bind",  ...)   export lookup
0x1400024e8  sub_1400071E0(..., "serenity_client_start", ...)   export lookup
MultiByteToWideChar(CP_UTF8, Runtime)  ->  SetDefaultDllDirectories(0xC00)
                                       ->  AddDllDirectory(<wide Runtime path>)
swprintf(..., "-Djava.home=%s", Runtime)
```

`sub_140001BA0` calls the resolver four times; two of the names are the two
`serenity_client*` exports above. `LoadLibraryW` and `GetProcAddress` are not in
the import table, so the image is not brought in through the imported loader
entry — the directory is registered and the two exports are called directly.

---

## What is recoverable, and what is not

A native image keeps names, not bytecode. The scan of `.svm_hea` with
`tools/image_inventory.py` returns:

| bucket | types | examples |
|---|---|---|
| JDK / GraalVM runtime | 83,876 | `jdk/graal/compiler/...`, `com/oracle/svm/...` |
| libraries | 161,350 | `it/unimi/dsi/...`, `com/viaversion/...`, `io/netty/...` |
| Minecraft + Fabric | 18,356 | `net/minecraft/client/...`, `net/fabricmc/fabric/...` |
| **Astralis** | **1,483** | `com/astralis/scripting/api/...`, `pub/astralis/client/...` |
| resources | 94,456 | `assets/minecraft/...`, `cosmetics/...`, `recode/...` |

The Astralis bucket is the interesting one. It splits into:

- `com/astralis/scripting/**` — 113 types, the client's scripting API, fully
  named because it is reachable through reflection: `Script`, `ScriptBytecodePolicy`,
  `Modules`, `ScriptModule`, `ScriptModuleValue`, `Packets`, `Targeting`,
  `RotationStrategy`, `Rotations`, `HttpRequest`, `ScriptPackage`, `Tasks`,
  `ScriptEvents` with 22 event subtypes (`Attack`, `BlockBreak`, `Chat`, `Input`,
  `Key`, `Motion`, `Packet`, `Rotation`, `ScreenInput`, `Velocity`, ...).
- `pub/astralis/client/**` — the client itself, with obfuscated simple names
  (`AK`, `A6`, `bR`, `fG`, `wa`, `W9`, `VE`, `Astralis`), plus the readable
  subpackages `event/` (86 types) and `scripting/` (55 types).
- `pub/astralis/obfuscated/**` — the second obfuscation pass.

Resource namespaces are intact: `cosmetics/cloaks` (2,600), `cosmetics/models`
(2,991), `cosmetics/wings`, `recode/emotes` (501), `recode/fonts`,
`recode/sounds`.

Two limits are real and are stated once:

- The client's class files are not present anywhere in the `.exe`. Every string
  above is a name that survived into the image heap, not a decompilable class.
- Recovering bodies from `.text` means decompiling a 322 MB AOT image inside
  VMProtect. The naming layer (`pub/astralis/client/*`, `event/*`) is recovered;
  the bodies are native code and are analysed as such.

### What the heap hands over

`tools/dump_image_symbols.py` walks `.svm_hea` as text and writes the parts that
are readable without a decompiler:

| output | contents |
|---|---|
| `16,263` Minecraft types | Mojang official names, zero intermediary ids |
| `1,483` client types | `pub/astralis/client/**`, `com/astralis/scripting/**` |
| `593` Mixin handlers | `redirect$…$astralis-recode$hookKillAuraAutoBlock` and friends |
| `85` mod manifests | every `fabric.mod.json`, with versions and dependencies |
| `43,324` resource paths | `assets/**`, `data/**`, `META-INF/**` |

The manifest is the part that settles the version question, because it is the
client's own text: `"id": "astralis-recode"`, `"version": "2.2"`,
`"minecraft": "~26.2"`, licence CC0, authors listed. 87 of the 593 hooks belong
to `astralis-recode`; they are the 26.2 feature map, and three of them
(`trackBeds`, `renderEmote`/`streamEmote`,
`preserveVulkanPreferenceAfterUncleanExit`) have no counterpart in the jar build.

`tools/carve_dll_archives.py` finds 92 ZIP archives embedded in the image,
193.8 MB total. 91 are JDK modules. The 92nd is `arc_040.zip`, 57 KB,
`Implementation-Version: 2.2.6`, 85 class files of `com/astralis/scripting/**` —
the only real bytecode in the file. It decompiles to 55 files with no failures
and lives in `reconstruct/26.2/scripting/`; the bodies throw
`UnsupportedOperationException` because it is the GraalVM substitution jar, so
the signatures are the deliverable, not the bodies.

`tools/dump_heap_members.py` adds the member surface: 202,366 name records and
105,012 descriptors, each accepted only when its length prefix and array hub
both validate. Binding a name to its descriptor and to a class is not
recoverable locally — the run experiment that can be scored against the
scripting jar fails outright (0 of 55 known classes) — which is why
`member_names.tsv` is a flat offset list and not a per-class table.

### The code, and the section around it

`tools/dump_native.py` parses the PE by hand: 9 sections, 534 named exports
(433 JNI, 55 libjava, 14 CEntryPoint, 7 GraalVM, and two of the client's own —
`serenity_client_bind` and `serenity_client_start`), 404 imports from 22 DLLs,
and **342,822 `RUNTIME_FUNCTION` entries** covering 324.6 MB of `.text`. The
import set looks like crypto of the client's own — `ncrypt` (11), `CRYPT32` (15),
`Secur32` (5) — and it is not: every call site in that family lands inside a
`Java_sun_security_mscapi_*` entry point, so it is the JDK's SunMSCAPI provider
compiled into the image. `native/devirt/iat_sites.tsv` has the caller for all
1,628 import call sites.

`tools/devirt_native.py` turns the function table into a labelled call graph:
4,850,262 `E8` sites in `.text`, 3,279,735 of them landing on a known function
start, and 1,684,622 distinct caller→callee edges. Only 1,628 call sites reach a
Windows API directly; `native/devirt/import_calls.tsv` ranks all 404 of them.

`tools/carve_window.py` cuts windows out of `.text` and loads them as flat
binaries at `0x180000000 + rva`, so a decompiler works in the file's own address
space; each file records its window base, because Hex-Rays prints operands above
that base relative to it and operands below it absolute. Every `.pdata` start in
the window is created as a function and run through Hex-Rays. 4,463 distinct
functions came out, 415,287 lines, 420 of them with an export name. `native/decompiled/` ships 328: the two client entry points, 264 JDK
JNI functions (the whole `sun.security.mscapi` family among them), the 30
highest in-degree functions, 24 unnamed `.text` samples, and 8 `.vmp0` chunks
that all decompile to a `JUMPOUT` five bytes into themselves.

`.vmp0` is the part that gets misread. It is not a bytecode VM: it opens with
`u32 294,735` and a 1.77 MB table of `{u32 rva, u16 length}` records describing a
6.6 MB band of code, and the code there is *mutated in place* — `xor`/`not`/
`rol`/`adc` pairs, fake return addresses written into `[rsp+0x10]`, branches into
the middle of instructions. Its 103 `.pdata` entries are decoys whose unwind RVA
points back into `.vmp0`. There is no dispatch table to undo, so the repository
ships the decoded table, the mnemonic histogram, the resolved edges and the
`JUMPOUT` bodies, not an invented listing. The numbers are in
`docs/analysis/NATIVE_DUMP.md`.

---

## The Java layer

`src/` holds 518 decompiled `.java` files of the same client — `cc/astralis/**`
and `astralis/mixin/**`. They are the result of the bytecode pipeline below, not
of the native image, and they reference Minecraft through Fabric intermediary
names (`net.minecraft.class_310`), so they only compile inside a Fabric workspace
for the version they were built against; the intermediary ids carry no version
themselves.

The obfuscator used five layers, all folded offline:

1. **Encrypted strings in `<clinit>`** — each class carries a `long` key and a
   character blob; `static {}` derives a DES key from a per-class constant.
   The plaintext is **CESU-8**, not UTF-8.
2. **Encrypted `long[]` tables** — the constant dictionary (coordinates, offsets,
   packet IDs), DES/CBC/NoPadding, IV = 0, one table per field.
3. **`invokedynamic (IJ)I`** — integer constant: index XOR-folded with the site
   key and a per-class salt.
4. **`invokedynamic (IJ)Ljava/lang/String;`** — two stages: class key, CESU-8
   decode, ISO-8859-1 re-encode, site key.
5. **`invokedynamic (IJ)J`** — the same scheme returning the raw `long`: the
   memory offsets the cheat feeds to `sun.misc.Unsafe`.

`mapping/offsets.json` holds 3,897 folded constants from 229 classes: 2,012
ints, 1,726 strings, 159 offsets. Every `(IJ)Ljava/lang/String;` site in the
tree folds — the 80 `range` skips the first pass left were a table-walk bug: the
obfuscator walks the blob with `String.substring`, so the chunk cursor is a
**char** count, not a byte count, and a CESU-8 literal carries more bytes than
chars. With the walk in the char domain, `cc/astralis/ehy` yields the full 59
entries its `bipush 59 / anewarray` declares.

Two classes Vineflower cannot finish (`ehy`, `hcu`) are decompiled with CFR, so
`src/` is 518/518 readable files with no `$VF: Couldn't be decompiled` stub.
The 55 sites that stay unfolded are all `(IJ)J` in `cc/astralis/brc`/`cvn`; their
bootstrap method builds the call site at runtime from a bytewise-composed
`long[]` that has no static table in the class file, so there is nothing to fold
against.

`mapping/modules.tsv` organises the cheat layer: the 91 classes that extend the
module base `guu`, the category each one registers under (`bfm`), its recovered
setting names, and the feature the settings and call surface identify. 84 of
them are constructed by the module manager `dfw`. Names are marked `high`,
`medium` or `low` confidence; `?` means the class carries no name of its own and
the settings alone do not pin it down. They come from the setting names, the
mode options and the Minecraft types each class touches - never from a string
that says `KillAura`, because the module name lives in the user config, not in
the class file. `docs/modules.md` is the readable version and
`mapping/modules.proguard.txt` imports the 74 identified renames into Recaf.

The native component
(`dev/opalV2/x64-windows.dll`, 1,148,928 bytes) is a small JVM bytecode
interpreter that fills in the `native` methods of `dqq`, `evd`, `fz` and `hdl`;
16 recovered bodies are in `native/bodies/`.

---

## Repository layout

| Path | Contents |
|---|---|
| `tools/extract_exe.py` | locate the embedded ZIP, read its central directory, extract every entry, decompress `astralis.dll.zst` |
| `tools/image_inventory.py` | scan the SubstrateVM image, classify 265,065 type names and 94,456 resource paths, write `mapping/image_inventory.json` |
| `tools/astralis_deobf.py` | recover DES keys, per-field tables, string blobs and indy salts from the Java layer |
| `tools/deobf.py` | class-file code walker, DES helper and CESU-8 decoder shared by the Python tools |
| `tools/AstralisDeobf.java` | ASM rewriter that folds every `invokedynamic` site to `LDC` |
| `tools/vineflower.jar` | vendored Vineflower, the last step of the Java-layer pipeline |
| `tools/indy_scan.py` | list every `invokedynamic` descriptor and its bootstrap method |
| `tools/jarscan.py`, `tools/rebuild_jar.py` | archive-level inventory and rebuild |
| `tools/Sanitize.java` | neutralise hardcoded endpoints and `halt` calls |
| `tools/devirt_dump.py` | turn IDA output into annotated C bodies |
| `tools/dump_image_symbols.py` | dump types, Mixin handlers, mod manifests and resource paths from `.svm_hea` |
| `tools/carve_dll_archives.py` | carve the 92 ZIP archives embedded in the image, JDK modules and the scripting jar |
| `tools/dump_native.py` | PE headers, 534 named exports, 404 imports, 342,822 function ranges |
| `tools/devirt_native.py` | decode `.vmp0`, resolve direct calls and IAT edges into a call graph |
| `tools/dump_heap_members.py` | member names and descriptors from `.svm_hea`, with the failed-binding check |
| `tools/carve_window.py` | cut `.text`/`.vmp0` windows as flat binaries for a decompiler, with per-window `.pdata` starts |
| `tools/decompile_native.py` | sort Hex-Rays output into `entry/`, `jdk/`, `runtime/`, `samples/`, `vmp0/` |
| `mapping/offsets.json` | 3,897 folded constants |
| `mapping/modules.tsv` | 91 module classes: category, settings, inferred feature |
| `mapping/modules.proguard.txt` | the 74 identified renames, importable into Recaf |
| `tools/module_scan.py` | emits the evidence the module names were read from |
| `mapping/deobf.map` | per-class keys, constant tables, string blobs |
| `mapping/image_inventory.json` | type and resource inventory of `astralis.dll` |
| `mapping/image26/` | 26.2 dump: 16,263 MC types, 1,483 client types, 593 hooks, 85 mod manifests, 202,366 member names, 105,012 descriptors |
| `native/dump/` | `pe.txt`, `exports.tsv`, `imports.tsv`, function counts |
| `native/devirt/` | `callgraph_top.tsv`, `import_calls.tsv`, `iat_sites.tsv`, the decoded `.vmp0` table |
| `native/decompiled/` | 328 Hex-Rays functions: client entry points, JDK JNI, hot runtime, samples, `.vmp0` chunks |
| `native/bodies/`, `native/registry/` | 16 devirtualized bodies, symbol tables |
| `src/` | 518 decompiled classes |
| `reconstruct/26.2/scripting/` | 55 files of the 2.2.6 scripting API, the only bytecode in the image |
| `docs/modules.md` | the module map, category by category |
| `docs/analysis/` | detailed reports (Spanish) |
| `build.sh`, `build.ps1` | offline build of the tooling |

---

## Running the tools

Requires **Python 3.10+** (`pip install -r requirements.txt`) and, for the
Java tooling, **JDK 21+**.

```bash
# 1. extract the 5,930 entries and decompress the native image (~1.9 GB)
python tools/extract_exe.py --exe astralis.exe --out work/exe

# 2. classify every type and resource name inside the image
python tools/image_inventory.py --dll work/exe/Runtime/astralis.dll \
    --out mapping/image_inventory.json

# 3. Java layer: folder of `.class` files (input to this step, not something the
#    native image contains) -> folded classes -> readable source
python tools/astralis_deobf.py work/extract work/deobf.map work/deobf_report.txt
java -cp "build/openastralis-tools.jar:tools/lib/*" AstralisDeobf \
     work/extract work/deobf work/deobf.map
java -jar tools/vineflower.jar -dgs=1 -hdc=0 -asc=1 -jrt=1 work/deobf work/src
```

```bash
./build.sh          # or ./build.ps1 on Windows
```

The build compiles `tools/*.java` against the vendored ASM 9 jars, produces
`build/openastralis-tools.jar`, runs a smoke test and byte-compiles the Python
tools. No network access is required.

---

## How each claim was checked

| Claim | How |
|---|---|
| exe is a Nuitka onefile | `KAX` record at `0xEA50`, `compiled_launcher.dll` size field `0x678C00` |
| payload is a ZIP | EOCD scan, central directory validated at `0x4E6BD0F1`, 5,930 entries, CRC of every extracted entry |
| image is SubstrateVM | `.svm_int` + `.svm_hea` sections, 534 CEntryPoint exports, `JNI_CreateJavaVM` |
| image is VMProtect-wrapped | `.vmp0` section, entry stub outside `NT` `.text` start |
| launcher is CPython | import of `python312.dll`, 1,529 functions, CPython string table |
| launcher strings have no code xrefs | every constant sits in one tagged blob (`0x3ae8bd000` onwards); IDA reports zero references to `ipc.seed`, `LAB_TOKEN_GATE`, `--accessToken` |
| offline auth | `LAB_TOKEN_GATE`, `offline-lab-token`, `--accessToken`, `LAB_SYNTHETIC_USER_INFO` strings in `compiled_launcher.dll` |
| host resolves exports itself | `sub_1400071E0` decompiled: PE headers, export name array, ordinal table; called four times from `sub_140001BA0` |
| host does not import the loader | 13 imports enumerated in IDA, `LoadLibraryW` and `GetProcAddress` absent |
| client type inventory | `tools/image_inventory.py`, deterministic scan, refuses to finish if the marker `com/astralis/scripting/Script` is missing |

---

## What this is not

The original `astralis.exe` is not redistributed here. This repository contains
analysis, recovered code and tooling — not a runnable client, not a license
bypass, not a C2 endpoint.

---

# Español

Ingeniería inversa estática de **`astralis.exe`**, la build **DrCrypter Astralis
2.11** del cliente de trampas **Astralis** para Minecraft (**`astralis-recode 2.2`**, su
propio manifiesto declara `minecraft ~26.2`).

Nada de este repositorio se produjo ejecutando el objetivo. El lanzador se
analizó como fichero PE, su payload se extrajo y descomprimió sin conexión, la
capa Python del lanzador se leyó del módulo compilado, la imagen nativa se
inventarió sección por sección con IDA Pro y la capa Java recuperada se reescribió
con ASM. No se mapeó ninguna DLL, no se cargó ninguna clase, no se envió ningún
paquete.

```
artefacto     astralis.exe          1.325.867.008 bytes
sha256        20d030ef...dc584cbf4f
formato       PE32+ x86-64, 11 secciones, base de imagen 0x140000000
fecha         2026-11-10 10:05:39 UTC
```

## Qué es realmente el fichero

Entre el `.exe` y el cliente en ejecución hay cuatro etapas:

```
astralis.exe
  bootstrap PE, Nuitka onefile
  payload KAX en 0xEA50
    compiled_launcher.dll        6.786.048 bytes  lanzador CPython 3.12
  payload ZIP en 0xD4E20D, directorio central en 0x4E6BD0F1, 5.930 entradas
    Assets/                      5.715 ficheros  assets de Minecraft
    Runtime/                       200 ficheros  JRE portátil 25.0.4.1
      serenity-client-host.exe     468.648 bytes  anfitrión nativo
      astralis.dll.zst         685.406.607 bytes  zstd, almacenado
    Game/                           14 ficheros  options.txt, servers.dat,
                                                  viafabricplus, sodium
    Python/libsodium.dll             1 fichero   criptografía del lanzador
```

`Runtime/astralis.dll.zst` se descomprime a un **PE32+ de 1.933.864.960 bytes**
(`sha256 f2168fc4...a1b10d0`). Ese fichero es el cliente, y no es bytecode Java:
es una **imagen nativa de GraalVM SubstrateVM** envuelta en VMProtect.

| sección | tamaño virtual | contenido |
|---|---|---|
| `.text` | 321.993.123 | código AOT: todos los métodos Java son nativos aquí |
| `.svm_int` | 32.736 | metadatos de la imagen SubstrateVM |
| `.rdata` | 2.854.582 | constantes y tabla de exportes (534 símbolos CEntryPoint) |
| `.svm_hea` | 1.580.941.312 | heap de imagen: hubs de clase, recursos, datos estáticos |
| `.vmp0` | 23.190.040 | capa VMProtect |
| `.reloc` | 93.240 | reubicaciones |

Datos leídos de la propia imagen:

```
base de imagen          0x180000000
punto de entrada        0x132c9114
exportes                534   JNI_CreateJavaVM, JavaMainWrapper__run,
                              serenity_client_bind, serenity_client_start
JAVA_VERSION            25.0.4.1
minecraftVersion        26.2
ipcVersion              9
entrypoint              astralis.dll
```

No hay ningún `.class` en el `.exe`, ni jar, ni bytecode: una imagen nativa se
compila por adelantado, así que el código del mod solo existe como máquina x86-64
más metadatos.

## Etapa 2 — el lanzador

El payload onefile es un módulo CPython compilado con Nuitka que importa
`python312.dll`. Sus nombres de módulo sobreviven en la tabla de cadenas:

```
run_windows.py          construye la línea de comandos del cliente
runtime_data.py         localiza Runtime/ y descomprime astralis.dll.zst
offline_ipc_server.py   servidor IPC local con el que habla el cliente
offline_profile.py      la cuenta offline (uuid, nombre, avatar)
offline_configs.py      ajustes del emulador
```

Esos nombres, y todo lo demás de esta etapa, se leyeron del blob de constantes del
módulo, no de referencias de código: la build de Nuitka guarda todas las cadenas
en una única región con etiqueta y longitud, y las decodifica al importar, así que
IDA muestra el literal (por ejemplo en `0x3ae8f6a72`) sin puntero ni referencia
desde `.text`. El módulo de 6,78 MB tiene 1.529 funciones; el blob es lo que las
ata a su propósito.

En orden: lee `launcher-settings.json`, descomprime la imagen, carga
`Python/libsodium.dll` y usa **ChaCha20-Poly1305 IETF** con las etiquetas
`serenity-ipc-frame`, `serenity-ipc-v1`, `ipc-encryption`, `session-encryption`,
`outer-encryption` y la semilla `ipc.seed`; responde localmente a las puertas de
autenticación del cliente (`LAB_TOKEN_GATE` → `offline-lab-token`,
`LAB_SYNTHETIC_USER_INFO`, `LAB_WEBSOCKET_PLAINTEXT`); y arranca
`serenity-client-host.exe` con un pipe `\\.\pipe\<uuid4>` y este vector de
argumentos:

```
-Dserenity.guard=1 -Dserenity.launcher.pid=<pid> -Djava.home=<Runtime>
-XX:InitialCollectionPolicy=Proportionate
--username Offline --version <version> --gameDir <Game> --assetsDir <Assets>
--assetIndex <index> --uuid 00000000000000000000000000000000
--accessToken <token> --userType legacy --versionType release
--clientId ... --xuid ...
```

Ese es el crack completo: la autenticación la contesta un proceso local en vez
del servicio del fabricante, y cada trama entre ambos va cifrada con una clave
derivada de `ipc.seed`.

## Etapa 3 — el anfitrión

`serenity-client-host.exe` (468.648 bytes, 1.115 funciones) solo importa
`KERNEL32`, `ADVAPI32`, la UCRT, `AddDllDirectory` y `CryptAcquireContextA`. Sus
cadenas nombran el contrato: `serenity-native-artifact-v2`,
`@serenity-bootstrap-v1:%s`, `serenity_client_bind`, `serenity_client_start`,
`-Djava.home=%s`. Carga `astralis.dll`, resuelve esos dos símbolos y entra en la
imagen. Es el anfitrión del cliente nativo **Serenity** de Fabric: la JVM no es un
`java.exe` aparte, es la imagen.

Su tabla de importes es mínima: 13 símbolos, y de Win32 solo `AddDllDirectory` y
`CryptAcquireContextA`. El resto se resuelve en ejecución recorriendo el directorio
de exportes del módulo destino (`sub_1400071E0`, 453 bytes, lee cabeceras PE y las
tablas de nombres y ordinales). En IDA todo el arranque es una única función de
4.267 bytes, `sub_140001BA0`, sobre la base `0x140000000`: resuelve
`serenity_client_bind` y `serenity_client_start` en `0x1400024d6` y `0x1400024e8`,
monta la ruta con `MultiByteToWideChar(CP_UTF8)` →
`SetDefaultDllDirectories(0xC00)` → `AddDllDirectory`, y formatea
`-Djava.home=%s`. Ni `LoadLibraryW` ni `GetProcAddress` están en la tabla de
importes: la imagen no entra por la vía documentada del cargador.

## Qué se puede recuperar y qué no

Una imagen nativa conserva nombres, no bytecode. El escaneo de `.svm_hea` con
`tools/image_inventory.py` devuelve:

| grupo | tipos | ejemplos |
|---|---|---|
| JDK / GraalVM | 83.876 | `jdk/graal/compiler/...`, `com/oracle/svm/...` |
| librerías | 161.350 | `it/unimi/dsi/...`, `com/viaversion/...`, `io/netty/...` |
| Minecraft + Fabric | 18.356 | `net/minecraft/client/...`, `net/fabricmc/fabric/...` |
| **Astralis** | **1.483** | `com/astralis/scripting/api/...`, `pub/astralis/client/...` |
| recursos | 94.456 | `assets/minecraft/...`, `cosmetics/...`, `recode/...` |

El grupo Astralis se divide en:

- `com/astralis/scripting/**` — 113 tipos de la API de scripts, con nombres
  completos porque son alcanzables por reflexión: `Script`, `ScriptBytecodePolicy`,
  `Modules`, `ScriptModuleValue`, `Packets`, `Targeting`, `RotationStrategy`,
  `HttpRequest`, `ScriptPackage`, `Tasks` y `ScriptEvents` con 22 subtipos.
- `pub/astralis/client/**` — el cliente, con nombres simples ofuscados (`AK`,
  `A6`, `bR`, `fG`, `wa`, `W9`, `Astralis`) y los subpaquetes legibles `event/`
  (86 tipos) y `scripting/` (55 tipos).
- `pub/astralis/obfuscated/**` — la segunda pasada de ofuscación.

Los recursos están intactos: `cosmetics/cloaks` (2.600), `cosmetics/models`
(2.991), `cosmetics/wings`, `recode/emotes` (501), `recode/fonts`,
`recode/sounds`.

Dos límites son reales y se dicen una vez: el `.exe` no contiene ficheros de clase
en ningún sitio, y recuperar cuerpos de `.text` significa descompilar 322 MB de
código AOT dentro de VMProtect. La capa de nombres está recuperada; los cuerpos
son código nativo y se analizan como tal.

### Lo que el heap entrega

`tools/dump_image_symbols.py` recorre `.svm_hea` como texto y escribe lo que se
puede leer sin decompilador:

| salida | contenido |
|---|---|
| `16.263` tipos de Minecraft | mappings oficiales de Mojang, cero ids intermediarios |
| `1.483` tipos del cliente | `pub/astralis/client/**`, `com/astralis/scripting/**` |
| `593` handlers de Mixin | `redirect$…$astralis-recode$hookKillAuraAutoBlock` y compañía |
| `85` manifiestos de mod | cada `fabric.mod.json`, con versión y dependencias |
| `43.324` rutas de recurso | `assets/**`, `data/**`, `META-INF/**` |

El manifiesto es lo que cierra la duda de la versión, porque es texto del propio
cliente: `"id": "astralis-recode"`, `"version": "2.2"`, `"minecraft": "~26.2"`,
licencia CC0 y autores. 87 de los 593 hooks son de `astralis-recode`; son el mapa
de features de 26.2, y tres (`trackBeds`, `renderEmote`/`streamEmote`,
`preserveVulkanPreferenceAfterUncleanExit`) no tienen equivalente en la build del
jar.

`tools/carve_dll_archives.py` localiza 92 archivos ZIP embebidos en la imagen,
193,8 MB en total. 91 son módulos del JDK. El 92 es `arc_040.zip`, 57 KB,
`Implementation-Version: 2.2.6`, 85 clases de `com/astralis/scripting/**`: el
único bytecode real del fichero. Descompila a 55 ficheros sin fallos y está en
`reconstruct/26.2/scripting/`; los cuerpos lanzan `UnsupportedOperationException`
porque es el jar de substitución de GraalVM, así que lo entregable son las firmas.

`tools/dump_heap_members.py` añade la superficie de miembros: 202.366 nombres y
105.012 descriptores, aceptados solo cuando coinciden el prefijo de longitud y el
hub de array. Atar un nombre a su descriptor y a su clase no es recuperable de
forma local: el experimento de runs, que sí se puede puntuar contra el jar de
scripting, falla sin ambigüedad (0 de 55 clases conocidas), y por eso
`member_names.tsv` es una lista plana con offset y no una tabla por clase.

### El código, y la sección que lo envuelve

`tools/dump_native.py` parsea el PE a mano: 9 secciones, 534 exportaciones con
nombre (433 JNI, 55 libjava, 14 CEntryPoint, 7 de GraalVM y dos propias del
cliente — `serenity_client_bind` y `serenity_client_start`), 404 importaciones de
22 DLLs y **342.822 entradas `RUNTIME_FUNCTION`** que cubren 324,6 MB de `.text`.
El conjunto de importaciones parece criptografía propia — `ncrypt` (11),
`CRYPT32` (15), `Secur32` (5) — y no lo es: todos los sitios de llamada de esa
familia caen dentro de una entrada `Java_sun_security_mscapi_*`, así que es el
proveedor SunMSCAPI del JDK compilado en la imagen.
`native/devirt/iat_sites.tsv` da el llamante de los 1.628 sitios de import.

`tools/devirt_native.py` convierte esa tabla en un grafo de llamadas etiquetado:
4.850.262 sitios `E8` en `.text`, 3.279.735 de ellos sobre un inicio de función
conocido, y 1.684.622 aristas distintas llamante→llamado. Solo 1.628 sitios
llaman directamente a una API de Windows; `native/devirt/import_calls.tsv` ordena
las 404.

`tools/carve_window.py` corta ventanas de `.text` y las carga como binario plano
en `0x180000000 + rva`, así que el descompilador trabaja en el espacio de
direcciones del fichero; cada fichero guarda la base de su ventana, porque
Hex-Rays imprime relativo a ella lo que cae por encima y absoluto lo que cae por
debajo. Cada inicio de `.pdata` de la ventana se crea como función y pasa por
Hex-Rays. Salieron 4.463 funciones distintas, 415.287 líneas, 420 con nombre de
exportación. `native/decompiled/` publica 328: los dos puntos de entrada del
cliente, 264 funciones JNI del JDK (toda la familia `sun.security.mscapi`
incluida), las 30 de más in-degree, 24 muestras de `.text` sin nombre y 8
fragmentos de `.vmp0` que descompilan a un `JUMPOUT` a cinco bytes de su inicio.

`.vmp0` es la parte que se malinterpreta. No es una VM de bytecode: empieza con
`u32 294.735` y una tabla de 1,77 MB de registros `{u32 rva, u16 length}` que
describen un cinturón de 6,6 MB de código, y el código de ahí está *mutado en
sitio* — parejas `xor`/`not`/`rol`/`adc`, direcciones de retorno falsas escritas
en `[rsp+0x10]`, saltos a mitad de instrucción. Sus 103 entradas de `.pdata` son
señuelos cuyo `unwind RVA` apunta de vuelta a `.vmp0`. No hay tabla de despacho
que deshacer, así que el repositorio entrega la tabla decodificada, el histograma
de mnemónicos, las aristas resueltas y los cuerpos `JUMPOUT`, no un listado
inventado. Los números están en `docs/analysis/NATIVE_DUMP.md`.

## La capa Java

`src/` contiene 518 ficheros `.java` del mismo cliente (`cc/astralis/**` y
`astralis/mixin/**`). Son el resultado del pipeline de bytecode, no de la imagen
nativa, y usan nombres intermediarios de Fabric (`net.minecraft.class_310`), así
que solo compilan dentro de un workspace de Fabric de la versión contra la que se
construyeron; los ids intermediarios no llevan versión.

El ofuscador usaba cinco capas, todas plegadas sin conexión: strings cifrados en
`<clinit>` (clave DES por clase, texto plano en **CESU-8**), tablas `long[]`
cifradas (DES/CBC/NoPadding, IV = 0), y tres sitios `invokedynamic` — `(IJ)I`,
`(IJ)Ljava/lang/String;` y `(IJ)J` — que devuelven enteros, cadenas y los offsets
crudos que el cheat pasa a `sun.misc.Unsafe`. `mapping/offsets.json` guarda 3.897 constantes de 229 clases (2.012 enteros,
1.726 cadenas, 159 offsets). Todos los sitios `(IJ)Ljava/lang/String;` se pliegan:
los 80 saltos `range` del primer pase eran un fallo del recorrido de tablas. El
ofuscador parte el blob con `String.substring`, así que el cursor avanza en
**caracteres**, no en bytes, y un literal CESU-8 ocupa más bytes que caracteres.
Con el recorrido en dominio de caracteres, `cc/astralis/ehy` devuelve las 59
entradas que declara su `bipush 59 / anewarray`.

Dos clases que Vineflower no termina (`ehy`, `hcu`) se decompilan con CFR: `src/`
queda en 518/518 ficheros legibles, sin el stub `$VF: Couldn't be decompiled`.
Los 55 sitios sin plegar son todos `(IJ)J` en `cc/astralis/brc`/`cvn`: su
bootstrap construye el call site en ejecución desde un `long[]` compuesto byte a
byte que no existe como tabla estática en el class file.

`mapping/modules.tsv` organiza la capa de módulos: las 91 clases que heredan de
`guu`, la categoría con la que se registran (`bfm`), los nombres de sus ajustes
recuperados y la función que identifican esos ajustes y su superficie de llamadas.
84 las construye el gestor `dfw`. La confianza va marcada como `high`, `medium` o
`low`; `?` significa que la clase no lleva nombre propio y los ajustes no bastan.
El nombre sale de los ajustes, de las opciones de modo y de los tipos de Minecraft
que toca cada clase, nunca de una cadena que diga `KillAura`: el nombre del módulo
vive en la config del usuario, no en el class file. `docs/modules.md` es la
versión legible y `mapping/modules.proguard.txt` importa los 74 renombrados
identificados en Recaf.

## Estructura

| Ruta | Contenido |
|---|---|
| `tools/extract_exe.py` | localiza el ZIP, lee su directorio central, extrae las 5.930 entradas y descomprime `astralis.dll.zst` |
| `tools/image_inventory.py` | escanea la imagen SubstrateVM y escribe `mapping/image_inventory.json` |
| `tools/astralis_deobf.py` | recupera claves DES, tablas por campo, blobs y sales de indy |
| `tools/deobf.py` | recorrido de bytecode, DES y decodificador CESU-8 compartido por las herramientas |
| `tools/AstralisDeobf.java` | reescritor ASM que pliega cada `invokedynamic` a `LDC` |
| `tools/vineflower.jar` | Vineflower incluido, último paso del pipeline de la capa Java |
| `tools/indy_scan.py` | lista descriptores `invokedynamic` y su bootstrap |
| `mapping/offsets.json` | 3.897 constantes plegadas |
| `mapping/modules.tsv` | 91 clases de módulo: categoría, ajustes, función inferida |
| `mapping/modules.proguard.txt` | los 74 renombrados identificados, importables en Recaf |
| `tools/module_scan.py` | genera la evidencia con la que se leyeron los nombres |
| `tools/dump_image_symbols.py` | vuelca tipos, handlers de Mixin, manifiestos y rutas de recurso de `.svm_hea` |
| `tools/carve_dll_archives.py` | extrae los 92 ZIP embebidos, módulos del JDK y el jar de scripting |
| `tools/dump_native.py` | cabeceras PE, 534 exportaciones, 404 importaciones, 342.822 rangos de función |
| `tools/devirt_native.py` | decodifica `.vmp0` y resuelve llamadas directas e IAT en un grafo |
| `tools/dump_heap_members.py` | nombres de miembro y descriptores de `.svm_hea`, con la comprobación de binding |
| `tools/carve_window.py` | corta ventanas de `.text`/`.vmp0` como binario plano, con los inicios de `.pdata` de cada ventana |
| `tools/decompile_native.py` | ordena la salida de Hex-Rays en `entry/`, `jdk/`, `runtime/`, `samples/`, `vmp0/` |
| `mapping/image_inventory.json` | inventario de tipos y recursos de `astralis.dll` |
| `mapping/image26/` | volcado 26.2: 16.263 tipos de MC, 1.483 del cliente, 593 hooks, 85 manifiestos, 202.366 nombres, 105.012 descriptores |
| `native/dump/` | `pe.txt`, `exports.tsv`, `imports.tsv`, recuentos de funciones |
| `native/devirt/` | `callgraph_top.tsv`, `import_calls.tsv`, `iat_sites.tsv`, la tabla de `.vmp0` decodificada |
| `native/decompiled/` | 328 funciones de Hex-Rays: entradas del cliente, JNI del JDK, runtime caliente, muestras y fragmentos de `.vmp0` |
| `native/bodies/`, `native/registry/` | 16 cuerpos devirtualizados y tablas de símbolos |
| `src/` | 518 clases descompiladas |
| `reconstruct/26.2/scripting/` | 55 ficheros de la API de scripting 2.2.6, el único bytecode de la imagen |
| `docs/modules.md` | el mapa de módulos, categoría por categoría |
| `docs/analysis/` | informes detallados |
| `build.sh`, `build.ps1` | build sin red |

## Ejecutar las herramientas

Necesita **Python 3.10+** (`pip install -r requirements.txt`) y **JDK 21+** para
lo de Java.

```bash
python tools/extract_exe.py --exe astralis.exe --out work/exe
python tools/image_inventory.py --dll work/exe/Runtime/astralis.dll \
    --out mapping/image_inventory.json
./build.sh          # o ./build.ps1 en Windows
```

El build compila `tools/*.java` contra los jars de ASM 9 incluidos, genera
`build/openastralis-tools.jar`, ejecuta una prueba y byte-compila las herramientas
Python. No usa red.

## Qué no hay aquí

No se redistribuye el `astralis.exe` original. Hay análisis, código recuperado y
herramientas; no hay un cliente ejecutable, ni un bypass de licencia, ni un C2 que
responda.
