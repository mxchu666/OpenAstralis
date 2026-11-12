# Astralis — paquete de análisis

Informes detallados de la **capa Java** del cliente (**Fabric 26.3**, build
**DrCrypter Astralis 2.11**). El `.exe` no contiene bytecode: la parte nativa
(imagen GraalVM SubstrateVM dentro de VMProtect) se documenta en el `README.md`
principal y en `mapping/image_inventory.json`.

Todo se generó sin ejecutar el objetivo en el host: deobfuscación en Python +
ASM, nativo en IDA headless.

---

## Documentos

| Fichero | Contenido |
|---|---|
| [`ASTRALIS_MALWARE_ANALYSIS.md`](ASTRALIS_MALWARE_ANALYSIS.md) | Informe de malware: hallazgos, IOCs, veredictos, sanitización |
| [`COMO_FUNCIONA_EL_JAR.md`](COMO_FUNCIONA_EL_JAR.md) | Ingeniería inversa: 4 capas de ofuscación, arranque, VM nativa |
| [`DEOBFUSCATION.md`](DEOBFUSCATION.md) | Pipeline de bytecode: las 5 capas, el fallo del blob, resultado por clase |
| [`DEVIRTUALIZATION.md`](DEVIRTUALIZATION.md) | Cuerpos nativos recuperados de la DLL |
| [`GLS_BLOCKER.md`](GLS_BLOCKER.md) | Lo que bloquea el arranque del cliente sin la DLL |
| [`RECAF.md`](RECAF.md) | Cómo abrir el árbol de clases en Recaf e importar el mapa de módulos |
| [`../modules.md`](../modules.md) | Los 91 módulos: categoría, ajustes y función inferida |

---

## Artefactos

| Fichero | Tamaño | SHA-256 | Uso |
|---|---|---|---|
| `out/astralis-clean.jar` | 55.316.922 | `efdeb6641c8327f6deed53cad7b93022fe912cb3116fdbb3bc81338328c2758c` | **Build usable**: C2 muerto, `halt` neutralizado, natives presentes |
| `out/astralis-inert.jar` | 53.908.409 | `7580260a72a3618b8ce7a198809db7bbf38842d31a0a57bf8164fe1cc04d4cb5` | Sin `dev/opalV2/`, sin métodos `native`. **No funciona como cliente**, es para auditar |

Original de la capa Java, para referencia:

```
astralis (Fabric 26.3).jar   55.300.085
a39253d43097012e07fa864745a1789bb1bf671d825cdb00f99a353a38f0a849
```

---

## Qué se neutralizó

- `wss://ws.serenityutils.club` → `ws://127.0.0.1:9/`
- `discord.com/api/v10/channels/...` → `http://127.0.0.1:9/`
- `pastebin.com/gtCdWxDx` y `pastebin.com/raw/G6DvJjqY` → `http://127.0.0.1:9/`
- 26 `Runtime.getRuntime().halt(...)` → NPE capturada por el `try` existente
- 7 métodos del subsistema C2 vaciados (`hdl.onOpen/onError/onClose`,
  `dle.gxa`, `fwi.akb`, `fwi.cvu`, `hht.ga`)
- Token de bot de Discord y channel id **eliminados del bytecode**

Lo que no se puede quitar sin romper el cliente: la DLL, porque
`dqq/evd/fz/hdl` la usan para inicializar sus tablas estáticas. Ver §9.3 del
informe.

---

## Reproducir el pipeline

```powershell
$env:PYTHONIOENCODING='utf-8'
$J = "F:\JDKS\JDK 21 AZUL\bin\java.exe"
$CP = "tools\classes;tools\asm.jar;tools\asm-tree.jar;tools\asm-util.jar;tools\asm-analysis.jar"

# 1. claves + tablas
python -W ignore tools\astralis_deobf.py work\extract work\deobf.map work\deobf_report.txt

# 2. plegar bytecode
& $J -cp $CP AstralisDeobf work\extract work\deobf work\deobf.map

# 3. decompilar
& $J -Xmx4G -jar tools\vineflower.jar -dgs=1 -rsy=1 work\deobf work\src2

# 4. sanitizar
& $J -cp $CP Sanitize work\deobf work\clean
& $J -cp $CP Sanitize work\deobf work\clean_nonative --nonative

# 5. reensamblar
python tools\rebuild_jar.py "astralis (Fabric 26.3).jar" work\clean out\astralis-clean.jar --drop "natives/hardware_info_dll.dll"
python tools\rebuild_jar.py "astralis (Fabric 26.3).jar" work\clean_nonative out\astralis-inert.jar --drop "dev/opalV2/" --drop "natives/hardware_info_dll.dll"
```

---

## Herramientas

| Fichero | Qué hace |
|---|---|
| `tools/jarscan.py` | Parser de `.class` sin JVM; inventario, capabilities, IOCs, PE |
| `tools/astralis_deobf.py` | Recupera claves y las 4 capas (DES, tablas, indy) |
| `tools/AstralisDeobf.java` | Reescritor ASM: pliega 3435 call sites |
| `tools/Sanitize.java` | Neutraliza URLs, `halt`, stubs del C2, modo inerte |
| `tools/rebuild_jar.py` | Reensambla el jar preservando entradas |

---

## IOCs en una línea

```
wss://ws.serenityutils.club
discord channel 1253949752119136312   token MTIxMDU3NjQzNTg0OTE5OTY0Ng.REDACTED
https://pastebin.com/gtCdWxDx   https://pastebin.com/raw/G6DvJjqY
https://bwstats.shivam.pro/user/   https://discord.gg/CxXjUVfqbj
```
