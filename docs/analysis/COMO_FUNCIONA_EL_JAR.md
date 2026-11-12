# Cómo funciona el jar de Astralis (por dentro)

Documento técnico. Explica qué hay dentro de
`astralis (Fabric 26.3).jar`, cómo está ofuscado y cómo se
reconstruyó todo sin ejecutarlo.

---

## 1. Estructura del archivo

```
astralis (Fabric 26.3).jar      55.300.085 bytes, 639 entradas
├── fabric.mod.json                        manifiesto de Fabric
├── astralis.mixins.json                   config de mixins
├── META-INF/                              firma, manifest, services
├── astralis/mixin/**                      68 clases de mixin
├── cc/astralis/**                         449 clases ofuscadas (el cliente)
├── dev/opalV2/Loader.class                cargador del componente nativo
├── dev/opalV2/x64-windows.dll             1.148.928 bytes  ← VM JVM
├── dev/opalV2/x64-linux.so                1.195.088 bytes
├── dev/opalV2/x64-macos.dylib             1.093.396 bytes
├── dev/opalV2/aarch64-macos.dylib         1.167.056 bytes
├── natives/hardware_info_dll.dll            256.000 bytes  (huérfano)
└── *.jar (15)                             librerías empaquetadas
```

Todas las clases son **versión 65** (Java 21). Nombres de clase y de miembro
ofuscados; el *layout* general sigue siendo legible porque el cliente usa
mixins de Fabric y eso ancla los nombres de los hooks.

### División funcional

- `astralis/mixin/**` — hooks sobre Minecraft. Los nombres de *target* están en
  la anotación `@Mixin(...)`, así que se pueden leer sin deobfuscar.
- `cc/astralis/**` — el cliente: módulos, HUD, config, red, cripto.
- `dev/opalV2/**` — el cargador nativo + la VM.

---

## 2. Cadena de arranque

```
Fabric carga el mod
   └─ se toca una clase protegida (dqq / evd / fz / hdl)
        └─ <clinit>  →  Loader.registerNativesForClass(N, cls.class)
        │                └─ Loader.<clinit> corre primero:
        │                     copia dev/opalV2/x64-windows.dll a %TEMP%\lib<rand>.tmp
        │                     System.load(...)
        │                     └─ DllMain → JNI_OnLoad
        │                          ├─ cachea ~15 IDs de JNI (incl. linkCallSite)
        │                          ├─ DefineClass("dev/opalV2/hidden/Hidden0", 1170 bytes)
        │                          └─ RegisterNatives(Loader.registerNativesForClass)
        │
        └─ <clinit>  →  Hidden0.special_clinit_N_<len>(cls.class)
                         └─ la VM interpreta el <clinit> original
                            y rellena los campos estáticos por JNI
```

`Loader.<clinit>` (decompilado) hace exactamente esto:

```java
String libFileName = "/dev/opalV2/" + arch + "-" + os;   // p.ej. x64-windows.dll
File libFile = File.createTempFile("lib", null);
libFile.deleteOnExit();
InputStream in = Loader.class.getResourceAsStream(libFileName);
FileOutputStream out = new FileOutputStream(libFile);
byte[] buf = new byte[2048];
int n;
while ((n = in.read(buf)) != -1) out.write(buf, 0, n);
System.load(libFile.getAbsolutePath());
```

Nada de `System.loadLibrary` ni de rutas del sistema: escribe en `%TEMP%` y
carga desde ahí. Eso es lo que hace que la DLL no aparezca en el classpath ni
en el directorio del juego.

---

## 3. Las cuatro capas de ofuscación

El ofuscador no usa un producto comercial conocido; es un esquema propio con
cuatro capas encadenadas. Todas se resolvieron en Python puro.

### Capa 1 — Constantes de string cifradas en `<clinit>`

Cada clase tiene un `long a` y un blob de caracteres en el constant pool. El
`static {}` lo descifra:

```java
long key = a ^ <const per class>;            // 8 bytes, big-endian
byte[] iv = new byte[8];                     // ceros
Cipher c = Cipher.getInstance("DES/CBC/PKCS5Padding");
c.init(DECRYPT, new SecretKeySpec(key, "DES"), new IvParameterSpec(iv));
```

El plaintext es **CESU-8** (no UTF-8): hay que decodificarlo para recuperar los
bytes reales.

Implementado en `tools/astralis_deobf.py`:

```python
class_secrets(cf)  -> (field, key, cipher_key)
des_decrypt(chunk, key)
cesu8_decode(bytes)
```

### Capa 2 — Tabla `long[] b` de enteros

Otro blob, también cifrado, que produce una tabla de 32768 `long`. Cada entrada
se descifra **por bloques de 8 bytes** con `DES/CBC/NoPadding`, IV = 0. El
resultado es el diccionario de constantes enteras del cliente (coordenadas,
offsets, IDs de packet, etc.).

```python
walk_blob(blob, key, start)   # [n chars][1 char = longitud del siguiente]… repetido
string_table(cf, key)         # camina todos los blobs y concatena
```

El blob es **auto-descriptivo**: `[N chars de ciphertext][1 char con la
longitud del siguiente chunk]`, en bucle. La longitud inicial cambia por clase
(16, 24, 32, 48, 64…), así que hay que probar múltiplos de 8 y validar con el
padding PKCS5.

### Capa 3 — `invokedynamic (IJ)I` → entero

Site típico:

```
LDC idx
LDC key
INVOKEDYNAMIC
```

Fórmula exacta, sacada del bootstrap:

```
i     = arg0 ^ (arg1 & 0x7fff) ^ <xor de la clase>
valor = DES(b[i], key=arg1)[4..8] interpretado como i32 big-endian
```

### Capa 4 — `invokedynamic (IJ)Ljava/lang/String;` → string

La más profunda. El blob de la capa 2 no contiene el string final, sino un
**ciphertext intermedio**:

1. `stage1 = DES_CBC_PKCS5(b[i], class_key)` → bytes, que hay que **decodificar
   como CESU-8** y volver a codificar en ISO-8859-1 (así lo hace el call site
   con `ISO-8859-1`).
2. `final = DES_CBC_PKCS5(stage1, arg1)` → CESU-8 → string real.

Detalle crítico: el blob hay que leerlo del **payload MUTF-8 crudo** del
constant pool. Un decoder de strings convencional destroza los bytes ≥ 0x80
(717 chars vs 713 bytes reales) y la capa deja de cuadrar.

### Resultado del pipeline

```
classes=306 with_secrets=306 strings=76
Y lines (tablas de string) = 159
classes=518 analyzed=3304 strings=76 indy=3435 failures=0
```

3435 call sites plegados a `LDC` constantes.

---

## 4. El reescritor ASM

`tools/AstralisDeobf.java` hace tres cosas:

1. **Plegado de strings**: recorre cada método con un `Analyzer` + `ConstInterp`
   para saber qué hay en la pila en cada `INVOKEDYNAMIC`. Si el descriptor es
   `(IJ)Ljava/lang/String;`, calcula el valor y sustituye el site por
   `LDC "..."`.
2. **Plegado de enteros**: igual para `(IJ)I` → `LDC n`.
3. **Sustitución de tablas**: los `GETSTATIC b` / accesos a la tabla se
   convierten en constantes cuando el índice es conocido.

Trampas que costaron tiempo y quedan documentadas en el código:

- `newValue`/`naryOperation` deben devolver `null` para `void`.
- `GETSTATIC`/`GETFIELD` deben reportar el tamaño real del campo.
- La clave de un `LdcInsnNode` de string es base64 del UTF-8.
- `Runtime.getRuntime()` es **estático** (`INVOKESTATIC`), no virtual.
- El guard de la pasada 2 debe ser `if (arrays.isEmpty() && table.isEmpty()) continue;`
  — si no, las clases que solo tienen tabla de strings se saltan en silencio.

---

## 5. Arquitectura del cliente

Una vez decompilado (`work/src2`, 518 `.java`), el cliente se lee bien:

- **Mixins** (`astralis/mixin/…`): `MixinMinecraftClient`, `MixinInGameHud`,
  `MixinClientConnection`, `MixinChatHud`, `MixinHeldItemRenderer`,
  `MixinShaderLoaderCache`, etc. Son los puntos de enganche.
- **Módulos** (`cc/astralis/*`): un paquete plano y enorme. Cada módulo tiene
  `onEnable/onDisable/onTick`, settings y un nombre legible en su tabla de
  strings. Nombres que aparecen ya en claro: `Auto Block`, `Disabler Mode`,
  `Ground Only`, `Grim`, `Blocks MC`, `Flag detected!`.
- **Config**: serialización a JSON, con settings tipados (bool, int, double,
  color, keybind).
- **HUD**: render con `GlTexture`, shaders propios (`MixinShaderLoaderCache`).
- **Keybinds**: tabla `0=48;1=49;…;F1=290;…` en un string descifrado — el cheat
  implementa su propio mapeo de teclas LWJGL.
- **Auth/licencia**: `gqi` (DTO de HWID), `dsk`/`afc` (sesión), `fz.dsg/ati`
  (cripto nativa con clave e IV).

### Módulos de red

| Clase | Qué hace |
|---|---|
| `dar` | dueño del socket; crea el `hdl` |
| `hdl` | WebSocket + natives |
| `dle` | Discord bot |
| `fwi` | Pastebin de config |
| `hht` | Pastebin gate |
| `hbc` | stats de BedWars (`bwstats.shivam.pro`) |
| `crv` | link de Discord (`discord.gg/CxXjUVfqbj`) |

---

## 6. El componente nativo

### 6.1 Qué es

Una DLL de 1,1 MB, C++ con CRT estático, **sin imports de red** (nada de
`ws2_32`, `wininet`, `winhttp`). Todo el I/O lo hace Java; la DLL solo aporta
lógica.

Exportes:

```
JNI_OnLoad       0x180002a30
TlsCallback_0    0x1800be6a0   (CRT, thread-local destructors — benigno)
TlsCallback_1    0x1800be730   (ídem)
DllEntryPoint    0x1800be4f0   (CRT)
```

965 funciones. Los TLS callbacks son del runtime de C y no hacen nada raro:
inicializan la sección crítica de los destructores de TLS.

### 6.2 Qué hace

`JNI_OnLoad` define una clase que **no está en el jar**
(`dev/opalV2/hidden/Hidden0`, 1170 bytes embebidos en `.rdata`) y registra un
dispatcher (`registerNativesForClass`). Cada clase protegida lo llama en su
`<clinit>` con su índice, y el dispatcher registra los natives de esa clase.

Los "natives" no son funciones escritas a mano: son **intérpretes**. Cada uno
contiene un bucle de dispatch sobre opcodes JVM, con mensajes de error del tipo
`INVOKEVIRTUAL Object npe`, `ANEWARRAY array size < 0`, `ATHROW npe`. Además
cachean `MethodHandleNatives.linkCallSite` con las dos firmas (JDK 8 y 9+),
lo que confirma que resuelven `invokedynamic` desde nativo.

Traducción: **el ofuscador convirtió métodos Java en bytecode propietario y los
ejecuta desde la DLL**. El jar solo conserva la declaración `native`.

### 6.3 Qué se puede y qué no se puede saber

Se puede:

- Identificar la clase embebida y sus métodos.
- Ver qué natives registra cada índice.
- Confirmar que no hay red en el binario.
- Ver que no hay persistencia (no toca `Run`, `services`, registro).

No se puede, sin desvirtualizar la VM:

- Saber qué comandos acepta `onMessage`.
- Saber qué hace el `<clinit>` de `dqq`/`evd`/`fz`/`hdl`.

Por eso el informe los marca como **caja negra** en vez de afirmar nada.

---

## 7. Recursos generados

| Ruta | Contenido |
|---|---|
| `work/extract/` | jar desempaquetado, original |
| `work/deobf.map` | claves y tablas por clase (`C/F/X/A/K/B/S/Y/T`) |
| `work/deobf/` | clases reescritas con ASM (strings e ints plegados) |
| `work/src2/` | 518 `.java` decompilados con Vineflower |
| `work/clean/` | clases sanitizadas (variante funcional) |
| `work/clean_nonative/` | clases sanitizadas (variante inerte) |
| `work/hidden/Hidden0.class` | clase extraída de la DLL |
| `work/native_hdl.txt` | decompilado de los natives de `hdl` (770 KB) |
| `work/deobf_report.txt` | volcado de strings descifrados |
| `out/astralis-clean.jar` | build usable |
| `out/astralis-inert.jar` | build sin nativos, para inspección |

---

## 8. Por qué el jar pesa 55 MB

- 4 binarios nativos: 4,6 MB.
- 15 jars anidados (Gson, java-websocket, SLF4J, Netty parcial, etc.).
- Assets: fuentes, shaders, iconos, sonidos.
- 449 clases ofuscadas con tablas de 32768 `long` **por clase** cuando hace
  falta. La tabla de enteros es lo que más engorda el constant pool.

El código real del cliente, una vez descifrado, son unos pocos cientos de KB.
