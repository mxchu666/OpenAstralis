# OpenAstralis

Static reverse engineering of **`astralis.exe`** — the **DrCrypter Astralis 2.11**
build of the **Astralis** Minecraft cheat client (**Fabric 26.3**).

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

---

## The Java layer

`src/` holds 518 decompiled `.java` files of the same client — `cc/astralis/**`
and `astralis/mixin/**`. They are the result of the bytecode pipeline below, not
of the native image, and they reference Minecraft through Fabric intermediary
names (`net.minecraft.class_310`), so they only compile inside a Fabric 26.3
workspace.

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

`mapping/offsets.json` holds 3,799 folded constants from 226 classes: 1,999
ints, 1,641 strings, 159 offsets. The native component
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
| `mapping/offsets.json` | 3,799 folded constants |
| `mapping/deobf.map` | per-class keys, constant tables, string blobs |
| `mapping/image_inventory.json` | type and resource inventory of `astralis.dll` |
| `native/bodies/`, `native/registry/` | 16 devirtualized bodies, symbol tables |
| `src/` | 518 decompiled classes |
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
| offline auth | `LAB_TOKEN_GATE`, `offline-lab-token`, `--accessToken`, `LAB_SYNTHETIC_USER_INFO` strings in `compiled_launcher.dll` |
| client type inventory | `tools/image_inventory.py`, deterministic scan, refuses to finish if the marker `com/astralis/scripting/Script` is missing |

---

## What this is not

The original `astralis.exe` is not redistributed here. This repository contains
analysis, recovered code and tooling — not a runnable client, not a license
bypass, not a C2 endpoint.

---

# Español

Ingeniería inversa estática de **`astralis.exe`**, la build **DrCrypter Astralis
2.11** del cliente de trampas **Astralis** para Minecraft (**Fabric 26.3**).

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

## La capa Java

`src/` contiene 518 ficheros `.java` del mismo cliente (`cc/astralis/**` y
`astralis/mixin/**`). Son el resultado del pipeline de bytecode, no de la imagen
nativa, y usan nombres intermediarios de Fabric (`net.minecraft.class_310`), así
que solo compilan dentro de un workspace de Fabric 26.3.

El ofuscador usaba cinco capas, todas plegadas sin conexión: strings cifrados en
`<clinit>` (clave DES por clase, texto plano en **CESU-8**), tablas `long[]`
cifradas (DES/CBC/NoPadding, IV = 0), y tres sitios `invokedynamic` — `(IJ)I`,
`(IJ)Ljava/lang/String;` y `(IJ)J` — que devuelven enteros, cadenas y los offsets
crudos que el cheat pasa a `sun.misc.Unsafe`. `mapping/offsets.json` guarda 3.799
constantes de 226 clases (1.999 enteros, 1.641 cadenas, 159 offsets).

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
| `mapping/offsets.json` | 3.799 constantes plegadas |
| `mapping/image_inventory.json` | inventario de tipos y recursos de `astralis.dll` |
| `native/bodies/`, `native/registry/` | 16 cuerpos devirtualizados y tablas de símbolos |
| `src/` | 518 clases descompiladas |
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
