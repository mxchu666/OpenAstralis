# Desofuscación de la capa Java

Resultado del pipeline completo sobre los 518 `.class` del cliente
(**Fabric 26.3**, build **DrCrypter Astralis 2.11**). Todo se genera sin cargar
una sola clase: los `.class` se parsean, las claves se derivan de `<clinit>` y el
bytecode se reescribe con ASM.

---

## 1. Las cinco capas

| Capa | Forma en el bytecode | Cómo se pliega |
|---|---|---|
| clave por clase | `ldc2_w A` + `putstatic <cls>.a:J`, y `K = A ^ <const>` | XOR de los dos `long` |
| cadena simple | literal de 8·n bytes en `<clinit>`, DES/CBC/PKCS5, IV = 0 | DES con la clave de clase, salida **CESU-8** |
| tabla `long[]` por campo | `newarray long` + literales entre el `newarray` y el `putstatic` | cada bloque de 8 bytes, big-endian |
| `invokedynamic (IJ)I` / `(IJ)J` | `a:(IJ)I`, `b:(IJ)J` sobre un `long[]` | índice `(arg0 ^ (arg1 & 0x7fff) ^ sal)` y `DES(tabla[idx], arg1)` |
| `invokedynamic (IJ)Ljava/lang/String;` | `b[]` de trozos cifrados + caché `c[]` | índice anterior, DES del trozo, CESU-8, `ISO-8859-1` |

El detalle de cada una está en `tools/astralis_deobf.py` y en el reescritor
`tools/AstralisDeobf.java`.

---

## 2. El recorrido del blob va en caracteres, no en bytes

El primer pase dejaba **80 saltos `range`**: el sitio pedía un índice mayor que el
número de trozos recuperados. La causa no era la fórmula del índice, era el
tamaño de la tabla.

El `<clinit>` parte el literal así:

```
ldc_w   <blob>            // String
...
invokevirtual String.length:()I
sipush  208              // longitud del primer trozo
...
invokevirtual String.substring:(II)Ljava/lang/String;
```

`substring` y `charAt` cuentan **caracteres**. Un literal del constant pool se
guarda en MUTF-8, y los caracteres de `U+0080..U+07FF` ocupan dos bytes, así que
`len(bytes) > len(chars)`. Recorrer el blob con el string ya decodificado da el
número correcto de trozos; recorrerlo con los bytes del constant pool corta antes
de tiempo.

Caso que lo cerró: `cc/astralis/ehy` declara `bipush 59 / anewarray java/lang/String`
y el recorrido en bytes sólo devolvía 2 trozos (64 bytes). En dominio de
caracteres devuelve los 59, y cada índice de llamada (13..58) resuelve.

---

## 3. La constante del decodificador

`string_indy_xor()` tomaba el **primer** `sipush` del método decodificador. En
`cc/astralis/bpv` eso devolvía `14857` (un `sipush` que pertenece a otra parte del
método), cuando la constante real es el `bipush 18` que sigue al idioma

```
lload_1
ldc2_w  32767L
land
l2i
ixor
bipush  18        <- ésta
ixor
```

`_mask_xor()` busca ese idioma (`l2i; ixor; <bipush|sipush>`) con guardas de
longitud del operando. Efecto medido: `bpv` pasa de `Y=14857` a `Y=18`; `cse`
pasa de `255` a `29`. Sin ese arreglo, 13 sitios de `cse` caían en `eval`.

---

## 4. Tablas `long[]` por campo, no por clase

Una clase puede tener varias tablas (`d`, `j`, `p`, `e`…). Agruparlas todas
desindexa todo lo que va después de la primera. `field_tables()` asocia cada
literal al `putstatic` que le sigue, así que cada campo conserva su propio
vector y su propio tamaño declarado.

---

## 5. Resultado

```
clases analizadas       518
clases con clave        306
sitios invokedynamic   3.897
  (IJ)I                2.012
  (IJ)Ljava/lang/String; 1.726
  (IJ)J                  159
saltos                   55
```

- **0 saltos `range`**: todos los índices de cadena caen dentro de su tabla.
- **55 saltos `eval`, todos `(IJ)J`** en `cc/astralis/brc` y `cc/astralis/cvn`.
  Esos dos helpers construyen el call site en ejecución desde un `long[]`
  compuesto byte a byte dentro del propio `<clinit>`; no existe una tabla
  estática contra la que plegar, así que el sitio se queda como llamada.
- Las otras causas de salto (`des`, `stack`, `noframe`, `unknown`) quedan a cero.

`mapping/offsets.json` guarda los 3.897 sitios con su clase, método, descriptor,
argumentos, sal y valor. Las cadenas con forma de token de Discord se sustituyen
por `<redacted>` en `tools/build_offsets.py` antes de escribir el fichero.

---

## 6. Decompilación

```
Vineflower  ->  516/518 clases
CFR         ->    2/518 clases   (ehy, hcu)
```

Vineflower lanza `NullPointerException` en `ehy` y `hcu`
(`Statement.getVarDefinitions()` sobre un `stat` nulo) y escribe el stub
`// $VF: Couldn't be decompiled`. CFR 0.152 decompila las dos sin problema, con
las cadenas ya plegadas, así que `src/` no tiene ningún fichero stub.

---

## 7. Organización de módulos

`mapping/modules.tsv` es el mapa de la capa de trampa:

| columna | contenido |
|---|---|
| `class` | clase ofuscada (`cc/astralis/ekb`) |
| `category` | categoría con la que se registra (`bfm.COMBAT`, `MOVEMENT`, `WORLD`, `PLAYER`, `VISUAL`, `EXPLOIT`, `CLIENT`) |
| `confidence` | `high` / `medium` / `low` |
| `inferred` | función deducida del nombre de sus ajustes y de su superficie de llamadas |
| `evidence` | qué ajustes o llamadas sostienen la deducción |
| `settings` | nombres de ajuste recuperados, ya descifrados |

91 clases heredan de la base `guu`; 78 las instancia el gestor `dfw` en su array
de registro. Los nombres de módulo del cliente no viajan como literales: se arman
en `<clinit>` desde las mismas tablas cifradas, así que la identificación se hace
por evidencia (ajustes + tipos de Minecraft que toca cada clase), no por una
cadena que diga "KillAura".

De las 91, 74 quedan identificadas (52 `high`, 20 `medium`, 2 `low`); las 17
restantes no declaran ajustes propios ni tocan ningún tipo de Minecraft, así que
se quedan como `?` en vez de inventarles nombre. El desglose por categoría y la
tabla completa están en `docs/modules.md`, y los renombrados se pueden importar
en Recaf con `mapping/modules.proguard.txt`.

---

## 8. Reproducir

```bash
python tools/astralis_deobf.py work/java work/deobf.map work/report.txt
java -Dskips=work/skips.tsv -cp "build/openastralis-tools.jar;tools/lib/*" \
     AstralisDeobf work/java work/java_fold work/deobf.map work/sites.tsv
java -jar tools/vineflower.jar work/java_fold work/src
java -jar tools/cfr.jar work/java_fold/cc/astralis/ehy.class --outputdir work/src
java -jar tools/cfr.jar work/java_fold/cc/astralis/hcu.class --outputdir work/src
python tools/build_offsets.py work/deobf.map work/sites.tsv mapping/offsets.json
```
