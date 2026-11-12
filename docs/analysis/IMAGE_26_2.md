# La imagen 26.2 — qué se puede sacar del `.dll` y qué no

`Runtime/astralis.dll` no es un contenedor de bytecode: es una **native image de
GraalVM SubstrateVM** envuelta en VMProtect. El código Java se compiló AOT a x86,
así que no hay `.class` del cliente que extraer. Lo que sí queda dentro es todo
lo que la imagen necesita en tiempo de ejecución: nombres de tipos, nombres de
handlers de Mixin, los manifiestos de los 85 mods y 43.324 rutas de recursos.

Este informe mide esa superficie y documenta el único bytecode real que apareció
dentro: el jar de la API de scripting.

---

## 1. Qué hay dentro

| sección | offset | tamaño | contenido |
|---|---|---|---|
| `.text` | `0x1000` | 321.691.648 | código x86 AOT |
| `.svm_hea` | `0x139C1000` | 1.581.580.288 | heap de la imagen: tipos, strings, recursos |
| `.vmp0` | `0x71E1E000` | 23.191.552 | capa VMProtect |
| `.rdata` `.data` `.pdata` `.rodata` `.reloc` `.svm_int` | — | ~5 MB | tablas auxiliares |

Total del fichero: 1.933.864.960 bytes. El heap es el 82 % del fichero, y ahí
está todo lo que se puede leer de forma estática.

## 2. El manifiesto del mod

El propio cliente publica su identidad dentro del heap. Literal, del
`fabric.mod.json` embebido:

```json
{
  "id": "astralis-recode",
  "name": "Astralis-Recode",
  "version": "2.2",
  "license": "CC0-1.0",
  "authors": ["Kawase, Ihasedich and occasionally Badaiim & Cioc"],
  "depends": { "minecraft": "~26.2", "fabricloader": ">=0.19.3", "java": ">=25" },
  "accessWidener": "astralis-recode.classtweaker",
  "mixins": ["astralis-recode.mixins.json"]
}
```

Es la respuesta a la versión sin adivinar: **`minecraft ~26.2`**. El nombre del
producto que aparece en el manifiesto es `astralis-recode 2.2`, no el "2.11" del
crack que lo empaqueta; el 2.11 es la build del wrapper, el 2.2 la del mod.

Del mismo volcado salen los 85 mods del entorno, entre ellos:

| mod | versión | nota |
|---|---|---|
| `fabric-api` | `0.154.2+26.2` | la API de Fabric para 26.2 |
| `viafabricplus` | `5.0.3` | 228 de los 593 hooks |
| `sodium` | `0.9.2` (`sodium-mc26.2-0.9.2-fabric.jar`) | renderer |
| `mcef` | `2.2.1-26.2` | navegador embebido |
| `hypixel-mod-api` | `1.0.2+build.1+mc26.1` | API del servidor objetivo |
| `astralis-recode` | `2.2` | el cliente |

`mapping/image26/mods.jsonl` guarda los 85 completos, con dependencias y la lista
de jars anidados (`META-INF/jars/native-<sha>.jar`, 60 entradas).

## 3. El único bytecode que hay: la API de scripting

Barriendo firmas `PK\x05\x06` válidas aparecen **92 archivos ZIP** dentro de la
imagen (193.794.585 bytes). 91 son módulos del JDK que GraalVM enlaza como
recurso. El 92 es otra cosa:

```
work/dll_archives/arc_040.zip   base 0x20E5D0DC  57.161 bytes  86 entradas
META-INF/MANIFEST.MF            Implementation-Version: 2.2.6
com/astralis/scripting/**       85 clases
```

Es el **jar de la API de scripting**, con bytecode real de la build 2.2.6. Se
descompila entero con Vineflower (`55` ficheros, `4.259` líneas, 0 fallos) y está
en `reconstruct/26.2/scripting/`.

Aviso importante: los cuerpos **lanzan `UnsupportedOperationException` a
propósito**. No es un fallo del decompilador ni una protección: es el jar de
substitución que GraalVM consume en el build, donde cada método lo implementa la
imagen. Lo que sí es real es la firma — el contrato de la API para 26.2:

```java
public class Modules {
   public Modules.ScriptModule get(String var1);
   public ScriptEntity getKillAuraTarget();
   public Modules.ScriptMode addTargetHudMode(String, ScriptDraggable, TargetHudRenderer);
   public boolean exists(String var1);
   public List<Modules.ScriptModule> getAll();
   public List<Modules.ScriptModule> getByCategory(String var1);
   public Modules.ScriptMode addMode(String var1, ...);
}
```

Que `getKillAuraTarget` exista en 2.2.6 y no en la build anterior confirma que la
API de scripts creció entre versiones.

## 4. La superficie de tipos

| conjunto | recuento | nombres |
|---|---|---|
| Minecraft | 16.263 | **Mojang oficiales** (`net/minecraft/client/Camera`) |
| cliente | 1.483 | `pub/astralis/client/**` (1.281), `com/astralis/scripting/**` (208) |
| recursos | 43.324 | `assets/**`, `data/**`, `META-INF/**` |

Cero nombres intermediary: no aparece ni un `class_`. La imagen se compiló contra
las mappings oficiales, no contra las de Yarn. Eso es exactamente la diferencia
con `src/`, que viene del jar y usa `net.minecraft.class_310`.

Por paquete, la superficie de Minecraft se reparte así:

| paquete | tipos |
|---|---|
| `net/minecraft/world/level` | 3.494 |
| `net/minecraft/world/entity` | 1.728 |
| `net/minecraft/client/renderer` | 1.433 |
| `net/minecraft/client/gui` | 1.220 |
| `net/minecraft/util/datafix` | 787 |
| `net/minecraft/network/protocol` | 753 |
| `net/minecraft/world/item` | 731 |

Los recursos, por namespace de assets: `minecraft` 10.968, `astralis-recode` 657,
`lunar` 466, `viaversion` 79, `viafabricplus` 58, `viabackwards` 37, `fabric` 33,
`sodium` 10.

## 5. Los 87 hooks de `astralis-recode`

Mixin deja en el nombre del handler el mod que lo declara:

```
redirect$zcb000$astralis-recode$hookKillAuraAutoBlock
```

Barriendo el heap salen **593 handlers**, 87 del cliente. Son la lista de puntos
donde el cheat toca el juego en 26.2, con nombre legible porque el paquete
`astralis/mixin/**` no se ofuscó:

| área | handlers |
|---|---|
| combate | `hookKillAuraAutoBlock`, `hookActiveHand`, `hookUseAction`, `hookItemUseItem`, `keepAttackMovement`, `spoofMainHandItem`, `spoofMainHandTick` |
| movimiento | `hookVelocity`, `hookVelocityx`, `hookStepHeight`, `redirectYRotForMoveFix`, `redirectPlayerTurn`, `redirectOnGroundPositionSendEvent`, `redirectXRotUpdateFallFlyingMovement`, `applyCameraAdjustments`, `redirectScoping` |
| render | `applyXrayOpacity`, `hookGlow`, `skipEntityOutlinePostChain`, `drawBuffers`, `recolorParticle`, `fireColor`, `colorFlames`, `renderToParticleTarget`, `renderToParticleDepth`, `onExtractBackground`, `onExtractSprite`, `onRenderPanorama`, `redirectItemPitch`, `redirectItemYawBob`, `redirectItemViewPitch` |
| scoreboard / HUD | `redirectScoreboardHeader`, `redirectScoreboardBody`, `redirectScoreNameRow` |
| red | `astralis$queueIncoming`, `allowSneakingPacket`, `redirectXPositionSendEvent`, `redirectYPositionSendEvent`, `redirectZPositionSendEvent` |
| varios | `trackBeds`, `renderEmote`, `streamEmote`, `modifyEquipOffset`, `modifyEquipOffsetProgress`, `preserveVulkanPreferenceAfterUncleanExit`, `gatePackSkyInNether`, `fixItemRenderingForPlayerEntityFreeCam`, `grabOrReleaseMouse`, `onScreenOpen` |

`trackBeds`, `renderEmote`/`streamEmote` y `preserveVulkanPreferenceAfterUncleanExit`
no tienen equivalente en el árbol decompilado del jar: son features nuevas de la
build 26.2. La tabla completa está en `mapping/image26/mixin_hooks.tsv`, con el
mod dueño de cada handler (`viafabricplus` 228, `astralis-recode` 87,
`fabric-rendering-v1` 57, `sodium` 30, …).

## 6. Qué no se puede sacar

- **El bytecode del cliente no existe.** `pub/astralis/client/**` son entradas de
  tipo en el heap, no clases; los cuerpos están en `.text` como x86. Reconstruir
  `KillAura` desde ahí es descompilar la función, no abrir un jar.
- **Los jars anidados del manifiesto no están.** Los 60 `META-INF/jars/*.jar` son
  rutas de recurso, no archivos: Fabric los carga en build time y la imagen los
  aplana. Sólo sobrevivió el de scripting, porque la imagen lo necesita entero
  para `nativeimage`.
- **Los nombres de los módulos siguen sin estar.** `KillAura` aparece 4 veces y
  todas en nombres de handlers de Mixin, no en una tabla de módulos.

## 7. Reproducir

```bash
# 1. símbolos y manifiestos del heap
python tools/dump_image_symbols.py work/exe/Runtime/astralis.dll work/image26

# 2. los ZIP embebidos (92, ~193 MB)
python tools/carve_dll_archives.py work/exe/Runtime/astralis.dll work/dll_archives

# 3. el jar de scripting, a fuente
java -jar tools/vineflower.jar work/dll_archives/arc_040.zip reconstruct/26.2/scripting
```

Los dos scripts son stdlib puro y no cargan nada del cliente: leen el fichero,
parsean la cabecera PE y decodifican el heap como texto.
