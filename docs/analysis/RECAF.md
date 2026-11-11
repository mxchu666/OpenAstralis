# Recaf — puesta en marcha y flujo de trabajo

Recaf es el editor de bytecode con el que se navega el jar ya deobfuscado.
Aquí está lo mínimo para arrancarlo, abrir el cliente y no perderse.

---

## 1. Requisitos

- **JDK 21** — el jar usa `class file version 65`, y Recaf 0.8.x necesita 21
  para leerlo sin quejas.
  En esta máquina: `F:\JDKS\JDK 21 AZUL`
- `F:\Astralis\recaf\recaf-launcher-gui-0.8.8.jar`

No hace falta instalar nada: el launcher se descarga la versión de Recaf que
elijas la primera vez y la cachea.

---

## 2. Arrancar

```powershell
$env:JAVA_HOME = "F:\JDKS\JDK 21 AZUL"
& "F:\JDKS\JDK 21 AZUL\bin\java.exe" -jar "F:\Astralis\recaf\recaf-launcher-gui-0.8.8.jar"
```

En el launcher:

1. Pestaña **Recaf**.
2. Versión: **0.8.8** (o la última 0.8.x).
3. **Launch**.

La primera vez tarda porque descarga el jar de Recaf. Las siguientes arranca
directo.

> Si prefieres no depender del launcher, el jar de Recaf queda cacheado en
> `%LOCALAPPDATA%\Recaf\` y se puede lanzar con
> `java -jar <ruta>\recaf-0.8.8.jar`.

---

## 3. Abrir el cliente

`File → Load` y elegir:

- **`F:\Astralis\work\deobf`** ← recomendado. Es el jar **ya deobfuscado**:
  los strings están en claro y los `invokedynamic` están plegados. Es lo que se
  quiere leer.
- `F:\Astralis\Astralis 08.10.25 (1.21) (Fabric).jar` ← el original. Solo para
  comparar o si quieres ver el estado antes del pipeline.
- `F:\Astralis\out\astralis-clean.jar` ← para verificar el resultado de la
  sanitización.

Recaf indexa las clases al cargar (unos segundos con 518 clases).

---

## 4. Navegación básica

| Acción | Cómo |
|---|---|
| Ir a una clase | `Ctrl+Shift+F` o el árbol de la izquierda |
| Buscar texto en todo el jar | `Ctrl+Shift+F` → pestaña **Strings** / **Code** |
| Ver referencias a un método | clic derecho → **References** (`Ctrl+Alt+R`) |
| Ver el bytecode | pestaña **Bytecode** del editor |
| Ver el decompilado | pestaña **Decompile** (usa CFR/Fernflower interno) |
| Renombrar | clic derecho sobre el miembro → **Rename** |
| Añadir comentario | clic derecho → **Comment** |

Atajos útiles para este jar:

- Buscar `serenityutils` → cae en `dar`.
- Buscar `pastebin` → cae en `fwi` y `hht`.
- Buscar `discord.com/api` → cae en `dle`.
- Buscar `halt` en **Code** → los 26 sitios de la red anti-tamper.
- Ir a `cc.astralis.hdl` y mirar la pestaña Bytecode: los cuatro métodos
  `native` aparecen sin `Code` attribute. Eso es exactamente lo que se describe
  en el informe: el cuerpo está en la DLL.

---

## 5. Flujo recomendado para este análisis

1. **Abrir `work\deobf`.**
2. Renombrar las clases que ya conocemos (opcional, pero ayuda):
   - `hdl` → `C2Socket`
   - `dar` → `C2Manager`
   - `dle` → `DiscordBot`
   - `fwi` → `RemoteConfig`
   - `hht` → `RemoteGate`
3. Para cada una, `Ctrl+Alt+R` sobre el método sospechoso y seguir la cadena:
   - `dar.<init>` → `new hdl(...)` → el string del `wss://`.
   - `dle.gxa()` → el token y el canal.
   - `hht.ga()` → el `catch` que devuelve `true`.
4. Guardar el mapa de renombrados: `File → Export → Mappings`. Eso genera un
   `.txt` que se puede volver a aplicar con `File → Import → Mappings` si se
   recarga el jar.

---

## 6. Editar y recompilar (si hace falta)

Recaf puede editar bytecode y guardar el jar, pero para este proyecto **no se
usa**: la sanitización se hace con ASM (`tools/Sanitize.java`) porque necesita
reemplazar instrucciones preservando los stack map frames. Recaf es para leer,
no para parchear aquí.

Si aun así quieres probar un parche a mano:

1. Abrir el método en la pestaña **Bytecode**.
2. Clic derecho → **Edit with assembler** (ASM text).
3. Cambiar la instrucción.
4. `File → Save` (sobrescribe el jar cargado o pide ruta nueva).

Ojo: si el parche cambia el tamaño de la pila, Recaf recalcula frames solo si
marcas la opción; si no, el jar revienta con `VerifyError`.

---

## 7. Limitaciones con este jar

- **Clases virtualizadas**: `dqq`, `evd`, `fz`, `hdl` tienen métodos `native` y
  un `<clinit>` de dos líneas. En Recaf se ven vacíos porque el cuerpo está en
  la DLL. No es un fallo de Recaf.
- **`cc/astralis/fhd`**: Vineflower no lo decompila del todo. Recaf usa otro
  decompilador y puede que sí; si no, la pestaña **Bytecode** siempre funciona.
- **Assets**: los 15 jars anidados no se abren solos. Hay que extraerlos y
  cargarlos como recursos aparte si se quieren inspeccionar.

---

## 8. Alternativa sin GUI

Si en algún momento Recaf no arranca, el mismo trabajo se hace con:

```powershell
# listar clases
jar tf work\deobf | Select-String '\.class$'

# bytecode de una clase
& "F:\JDKS\JDK 21 AZUL\bin\javap.exe" -p -c -constants work\deobf\cc\astralis\dle.class

# decompilar todo
& "F:\JDKS\JDK 21 AZUL\bin\java.exe" -Xmx4G -jar tools\vineflower.jar -dgs=1 -rsy=1 work\deobf work\src2
```

`work/src2` ya está generado: para lectura rápida es más cómodo que la GUI.
