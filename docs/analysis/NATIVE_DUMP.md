# El plano nativo — dump, grafo de llamadas y `.vmp0`

`Runtime/astralis.dll` tiene dos mitades que se suelen confundir: el **código**
(321,7 MB de x86-64 AOT dentro de `.text`) y la **imagen** (1,58 GB de heap en
`.svm_hea`). Los documentos anteriores trabajaron el heap. Este trabaja el
código y la sección que lo envuelve.

Los tres volcados salen de `tools/dump_native.py` y `tools/devirt_native.py`,
ambos stdlib puro y sin cargar el binario.

```bash
python tools/dump_native.py   work/exe/Runtime/astralis.dll native
python tools/devirt_native.py work/exe/Runtime/astralis.dll native
```

---

## 1. Cabecera y secciones

| sección | RVA | raw | entropía | qué es |
|---|---|---|---|---|
| `.text` | `0x00001000` | 321.691.648 | 6,96 | código AOT de GraalVM, sin tocar |
| `.svm_int` | `0x132cb000` | 32.768 | — | tablas de la imagen |
| `.rdata` | `0x132d3000` | 2.859.008 | 2,69 | IAT, exports, constantes |
| `.data` | `0x1358d000` | 20.480 | — | datos escribibles |
| `.pdata` | `0x13592000` | 4.116.480 | 7,96 | 342.822 `RUNTIME_FUNCTION` |
| `.rodata` | `0x1397f000` | 274.432 | 4,34 | datos de solo lectura |
| `.svm_hea` | `0x139c2000` | 1.581.580.288 | — | heap de la imagen |
| `.vmp0` | `0x71e12000` | 23.191.552 | 7,76 | envoltorio VMProtect |
| `.reloc` | `0x73430000` | 94.208 | 5,46 | reubicaciones |

Punto de entrada `0x132c9114`, base `0x180000000`. Los bytes del entry point son
un prólogo normal (`48 89 5c 24 08` = `mov [rsp+8], rbx`), no un stub de VM: el
entry vive en `.text`, fuera de `.vmp0`.

## 2. Las 534 exportaciones

| tipo | nº | ejemplos |
|---|---|---|
| `jni` | 433 | `Java_java_lang_String_length`, `Java_sun_nio_ch_FileDispatcherImpl_read0` |
| `libjava` | 55 | `jio_snprintf`, `JDK_Canonicalize`, `NET_ThrowNew` |
| `other` | 23 | `initInetAddressIDs`, `reuseport_available` |
| `centrypoint` | 14 | `IsolateEnterStub__JavaMainWrapper__run__cXbf…` |
| `graal` | 7 | `graal_get_isolate`, `graal_attach_thread` |
| `astralis` | 2 | **`serenity_client_bind`**, **`serenity_client_start`** |

Las dos exportaciones propias (`0x1e43d00`, `0x1e440e0`) son alias de
`IsolateEnterStub__NativeMemoryIdentity__bind/start`: el cliente registró sus
propios puntos de entrada en la imagen y los dejó con nombre legible. Es la
única puerta de entrada al cliente que no pasa por `JNI_CreateJavaVM`.

## 3. Las 404 importaciones

22 DLLs, 404 funciones. Lo que importa no es el volumen sino el reparto:

| DLL | nº | lectura |
|---|---|---|
| `KERNEL32` | 161 | ficheros, procesos, memoria, consola |
| `ADVAPI32` | 58 | registro, tokens, `OpenProcessToken`, SIDs |
| `WS2_32` | 39 | sockets |
| `api-ms-win-crt-*` | 76 | CRT de Visual Studio |
| `IPHLPAPI` | 16 | `IcmpSendEcho`, `GetIfTable2`, interfaces |
| `CRYPT32` | 15 | certificados: `CertEnumCertificatesInStore`, `CryptAcquireCertificatePrivateKey` |
| `ncrypt` | 11 | `NCryptEncrypt`, `NCryptDecrypt`, `NCryptSignHash`, `NCryptVerifySignature` |
| `Secur32` | 5 | `InitializeSecurityContextA`, `AcquireCredentialsHandleA` |
| `WINHTTP` | 3 | `WinHttpOpen`, `WinHttpGetProxyForUrl` |
| `VERSION` | 3 | lectura de versión de fichero |

`ncrypt` + `CRYPT32` + `Secur32` parecen criptografía propia del cliente. No lo
son: `native/devirt/iat_sites.tsv` resuelve los 1.628 sitios de llamada a import,
y todos los de esa familia caen dentro de entradas JNI del JDK —
`Java_sun_security_mscapi_CKeyStore_loadKeysOrCertificateChains` (36 KB de
pseudocódigo), `storeCertificate`, `removeCertificate`,
`CRSACipher_encryptDecrypt` — más un puñado de helpers sin nombre del mismo
bloque (`0x132b…`–`0x132c…`). Igual con `IPHLPAPI`
(`Java_java_net_NetworkInterface_*`) y `WINHTTP`
(`Java_sun_net_spi_DefaultProxySelector_*`). Es el proveedor SunMSCAPI y la capa
de red del JDK compilados AOT dentro de la imagen, no una CNG propia del cliente.
La corrección importa porque cambia la lectura: el binario no trae criptografía
propia; trae la del JDK, y la del cliente está en el heap (§8).

## 4. El dump de funciones

`.pdata` tiene 342.822 entradas válidas:

```
.text   342.719
.vmp0       103   (señuelos, ver §6)
tamaño  mínimo 1  mediana 224  p90 1.254  máximo 6.586.155
cubierto 324.570.350 bytes de 321.691.648 (100,9 %)
```

El 100,9 % no es un error de redondeo: hay **6.334 rangos solapados** en
`.pdata`. Un solapamiento real no existe en código compilado; es lo que queda
cuando una herramienta reescribe la tabla. El efecto práctico es que la
atribución llamada→función por bisección funciona (los inicios siguen siendo
inicios) pero el tamaño de un puñado de funciones es dudoso.

`functions.tsv` con las 342.822 filas no se versiona por tamaño; se regenera con
el comando de arriba.

## 5. Grafo de llamadas

Barrido de `.text` y del código de `.vmp0` buscando las cuatro formas directas:
`E8 rel32` (call), `E9 rel32` (jmp), `FF 15` y `FF 25` (call/jmp RIP-relativo).

| | sitios | resueltos | destino |
|---|---|---|---|
| `E8` en `.text` | 4.850.262 | 3.279.735 (67,6 %) | inicio de función en `.text` |
| `E8` en `.vmp0` | 113.798 | — | código mutado |
| `FF 15`/`FF 25` en `.text` | 2.061 | 1.628 | import de la IAT |
| `E9` en `.text` | 3.693.099 | 207 (0,006 %) | — |

Los `E8` resueltos dan **1.684.622 aristas** distintas sobre 342.417 llamantes.
Los 1,57 M de `E8` no resueltos caen en su mayoría fuera de toda sección
(`out`) o en `.svm_hea`: son datos con un byte `E8` dentro, no llamadas.

Los `E9` no resuelven porque en `.text` hay **tablas de salto**: cada entrada de
una tabla es un `rel32` con un byte `E9` delante por casualidad. Por eso el
grafo se construye con `E8` y con la IAT, y los `E9` se cuentan y se descartan.

`native/devirt/import_calls.tsv` ordena las 404 importaciones por número de
puntos de llamada: es el mapa de "qué hace el binario con Windows".
`callgraph_top.tsv` son las 20.000 aristas más frecuentes, con nombres solo
donde existe exportación (534 de 342.822 funciones). Las otras 342.288 no tienen
nombre estático: el symbol table del linker no se publicó en la imagen.

## 6. `.vmp0` decodificado

La sección no es una máquina virtual de bytecode. Su estructura es aritmética:

```
0x00  u32  count = 294.735
0x04  × count  { u32 rva, u16 length }        6 bytes por registro
      fin de tabla = 0x71fc1bde              1.768.414 bytes
      resto         = 21.423.138 bytes de código
```

Los 294.735 registros apuntan a un **cinturón de 6,6 MB** entre `0x728715c1` y
`0x72eb96a2`. Las longitudes son múltiplos de 8, de 8 a 128:

```
8:127.293  16:84.540  24:44.384  32:21.526  40:9.859
48:3.958   56:1.679   64:689     72:258     80:154 ... 128:24
```

Ese cinturón coincide con **una única entrada de `.pdata`** de 6.586.155 bytes
(`0x7287157d`–`0x72eb94a8`), es decir: la tabla de `RUNTIME_FUNCTION` declara el
bloque entero como una sola función. Es exactamente lo que hace un empaquetador
para que el unwind no pueda reconstruir los límites reales.

### Qué hay dentro de los 294.735 fragmentos

Primer mnemónico al inicio de cada fragmento, con capstone:

| mnemónico | fragmentos | | mnemónico | fragmentos |
|---|---|---|---|---|
| `xor` | 58.657 | | `add` | 10.174 |
| `mov` | 47.694 | | `movsxd` | 10.158 |
| `lea` | 38.535 | | `movzx` | 8.477 |
| prólogo | 16.853 | | `inc` | 8.198 |
| `not` | 15.414 | | `dec` | 7.157 |
| `neg` | 14.551 | | `bswap` | 6.817 |
| `rol` | 13.223 | | `sbb` | 5.448 |
| `adc` | 12.180 | | `sub` | 4.728 |
| `ror` | 11.741 | | `or` | 1.910 |

La distribución es la firma de un motor de mutación, no de un intérprete: no
hay despachador, no hay puntero a bytecode, no hay tabla de handlers. El código
está **mutilado en sitio**: `not`/`neg`/`rol`/`ror`/`bswap`/`adc`/`sbb` en
parejas, direcciones de retorno falsas escritas a mano (`mov qword [rsp+0x10],
0x6c4bbe9a`), saltos que caen en mitad de otra instrucción. Los 16.853
fragmentos que empiezan con un prólogo son funciones reales; los otros 277.882
son fragmentos internos.

**Conclusión medida:** no hay virtualización de bytecode que deshacer. Lo que
hay es mutación de código, y se deshace ejecutando (traza) o reescribiendo el
flujo, no leyendo una tabla. Por eso este repositorio entrega el mapa del
cinturón, el histograma y las aristas resueltas, y no un "decompilado" de
`.vmp0` que sería inventado.

Las **103 entradas de `.pdata` dentro de `.vmp0` son señuelos**: su `unwind RVA`
apunta a valores como `0x52250` o `0x112980`, que caen dentro de `.vmp0` y no en
`.pdata` (que empieza en `0x13592000`). Windows no las usa; un desensamblador
que confíe en ellas produce basura.

## 7. Decompilación

`tools/carve_window.py` corta ventanas de `.text` alrededor de las funciones que
interesan y las carga como binario plano en `0x180000000 + rva`, así que las
direcciones del descompilador son las del fichero. En cada ventana se crea una
función por cada inicio de la tabla `.pdata` y se pasa por Hex-Rays.

| | |
|---|---|
| funciones descompiladas | 4.463 distintas (4.957 ficheros, 415.287 líneas) |
| con nombre de exportación | 420 |
| fragmentos que Hex-Rays no puede unir (`JUMPOUT`) | 652 |
| publicadas en `native/decompiled/` | 328 |

Lo publicado se reparte en 2 puntos de entrada del cliente, 264 funciones JNI del
JDK (`Java_*`, incluida toda la familia `sun.security.mscapi`), 30 funciones del
grafo de llamadas con más in-degree, 24 muestras de `.text` sin símbolo y 8
fragmentos de `.vmp0`.

`serenity_client_bind` (`0x1e43d00`, 992 bytes) es el ejemplo corto: comprueba
`a4` (el `Isolate`), hace un CAS de 3 a 1 sobre `[a4+0x14]` y llama a tres
helpers de `.text` (`0x1eb6ce0`, `0x1eb6d20`, `0x277f4a0`) antes de devolver un
`u32`. Los helpers salen como `MEMORY[0x...]()` porque viven fuera de la ventana
cargada: el descompilador no tiene su código, no es una llamada indirecta.

`.vmp0`: los 8 fragmentos elegidos entre los 181 que empiezan con prólogo y
tienen 96 bytes o más dan todos la misma forma al descompilar:

```c
void sub_1F289FD7A() { JUMPOUT(0x1F289FD7FLL); }
```

El salto cae 5 bytes dentro del propio fragmento. Eso es la mutación vista desde
Hex-Rays: el flujo no se reconstruye leyendo, y por eso el repositorio no publica
un listado de `.vmp0` como si fuera código normal.

### Lo que la decompilación no arregla

Los 342.288 inicios sin exportación siguen siendo `sub_<rva>`. Se probaron dos
vías para ponerles nombre, y las dos se midieron:

- **referencias directas al heap**: 4.588 `lea r64,[rip+disp]` y 14.358 `movabs`
  en `.text`; **cero** apuntan a `.svm_hea`. Las constantes de la imagen se
  alcanzan por tabla o por registro base, no por dirección absoluta.
- **punteros a código dentro del heap**: 9.914 valores de 8 bytes apuntan a un
  inicio de función, pero ninguno tiene un registro de `member_names.tsv` a
  menos de 80 bytes. Sin la estructura del `Method`, el puntero no dice a qué
  método pertenece.

Las dos pruebas están en el historial del repositorio como resultados negativos,
no como pendientes.

## 8. Nombres y descriptores del heap

`tools/dump_heap_members.py` recorre `.svm_hea` y acepta un registro solo si el
`u32` de longitud está justo antes del texto y el hub de array (`0x02080e42`,
con los bits bajos como flags) está 8 o 12 bytes antes. Resultado:

| | registros | distintos |
|---|---|---|
| nombres de miembro | 202.366 | — |
| descriptores `(...)X` | 105.012 | 105.008 |

El par nombre↔descriptor existe y es legible cuando la adyacencia es la buena:

```
getKillAuraTarget   ()Lcom/astralis/scripting/api/entity/ScriptEntity;
getByCategory       (Ljava/lang/String;)Ljava/util/List;
```

Ese par se verificó a mano contra el jar de scripting descompilado, y coincide.
Pero **la adyacencia no es constante**: al recorrer los 105.012 descriptores, el
nombre que cae 0x24 bytes antes resulta ser a veces un campo, una constante de
enum o un nombre de otra clase, y la comprobación contra el jar no se sostiene.
La técnica sirve para leer un par concreto, no para reconstruir la tabla entera,
así que el modo no se publica y ese par se cita como ejemplo, no como tabla.

La segunda hipótesis, que los nombres de una clase formen un bloque contiguo
ordenado, se mide dentro de la herramienta: 51.754 "runs" descendentes que
resultan ser **rebanadas de una única tabla de strings internados** ordenada
globalmente, no fronteras de clase. De 55 clases conocidas, 0 coinciden
exactamente con una run (`member_summary.txt`). El resultado negativo está
versionado y es la razón por la que `member_names.tsv` es una lista plana con
offset y no una tabla por clase.

## 9. Lo que no se puede sacar

- **Cuerpos Java.** El código es x86 AOT; no hay bytecode salvo el jar de
  scripting ya documentado en `IMAGE_26_2.md`.
- **Nombres de las clases del cliente.** `pub/astralis/client/**` son entradas de
  tipo ya ofuscadas antes de compilar (`FD`, `AK`, `e5`, `tN`). La imagen no
  contiene el mapping de ProGuard.
- **Binding nombre → descriptor → clase.** Requiere recorrer el grafo de objetos
  (cabecera de hub, tamaños por tipo, referencias de 4 bytes al heap), no leer
  patrones locales. Las dos técnicas locales se probaron y se descartaron con
  números.
- **Nombres de las 342.288 funciones restantes.** No hay tabla de símbolos.

## 10. Reproducir

```bash
python tools/dump_native.py    work/exe/Runtime/astralis.dll native
python tools/devirt_native.py  work/exe/Runtime/astralis.dll native
python tools/dump_heap_members.py work/exe/Runtime/astralis.dll mapping/image26 \
       --check reconstruct/26.2/scripting

# decompilación: ventana -> IDA -> curación
python tools/carve_window.py work/exe/Runtime/astralis.dll work/carve \
       --target 0x1e43d00 0x132ba928 0x276fc00 --pad 0x20000
python tools/decompile_native.py --raw work/decompiled/raw \
       --raw work/decompiled/vmp0raw --out native/decompiled \
       --image work/exe/Runtime/astralis.dll --hot work/native/hot_functions.tsv
```

Las dos primeras mitades son stdlib puro. `devirt_native.py` usa capstone si está
instalado y, si no, escribe firmas de bytes en lugar de mnemónicos: los recuentos
no cambian. `carve_window.py` también es stdlib; la descompilación necesita IDA
(`idalib` o la GUI) porque Hex-Rays no es reemplazable por un script, y
`decompile_native.py` solo ordena y filtra la salida.
