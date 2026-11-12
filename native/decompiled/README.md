# `native/decompiled` — pseudocódigo de `astralis.dll`

328 funciones pasadas por Hex-Rays sobre ventanas del binario, agrupadas por lo
que son. Nada está inventado: una función sin exportación se publica como
`sub_<rva>` y el índice lo dice.

| carpeta | qué hay |
|---|---|
| `entry/` | los dos puntos de entrada propios: `serenity_client_bind`, `serenity_client_start` |
| `jdk/` | 264 entradas JNI del JDK, incluida toda la familia `Java_sun_security_mscapi_*` |
| `runtime/` | 30 funciones con más in-degree en el grafo de llamadas |
| `samples/` | 24 funciones de `.text` repartidas, sin símbolo, para ver la forma del código AOT |
| `vmp0/` | 8 fragmentos de la banda VMProtect: todos descompilan a un `JUMPOUT` a 5 bytes de su inicio |

`index.tsv` lista `group`, `rva`, `label`, `size`, `lines` por fichero.
`summary.txt` da los totales y los fragmentos descartados.

## Cómo se generó

`tools/carve_window.py` corta 40–460 KB de `.text` alrededor de las funciones
objetivo y las escribe como binario plano. Cada ventana se carga en IDA en
`0x180000000 + rva`, de modo que las direcciones del pseudocódigo son las del
fichero original. Dentro de la ventana se crea una función por cada inicio de la
tabla `.pdata` (342.822 entradas, la única fuente de límites que sobrevive al
AOT) y se descompila una a una.

Las llamadas que salen de la ventana aparecen como `MEMORY[0x...]()`: el
descompilador no tiene ese código cargado, no son llamadas indirectas.

## Lo que no está

- **Cuerpos Java.** El cliente está compilado AOT a x86; el único bytecode del
  fichero es el jar de scripting de `reconstruct/26.2/`.
- **Nombres.** Solo 534 símbolos de exportación sobre 342.822 funciones. Los
  intentos de atribuir nombres desde el heap se midieron y fallaron; el detalle
  está en `../../docs/analysis/NATIVE_DUMP.md` §8.
- **`.vmp0` legible.** Los 8 fragmentos publicados son la prueba de que no lo es:
  el flujo salta dentro de sí mismo y no hay cuerpo que reconstruir.
