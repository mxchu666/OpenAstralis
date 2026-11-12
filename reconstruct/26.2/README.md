# `reconstruct/26.2` — what the native image actually carries

`astralis.dll` is a GraalVM SubstrateVM native image. There is no client jar
inside it: the Java was compiled AOT to x86 and the class files are gone. What
survives is the runtime surface — type names, Mixin handler names, mod
manifests, resource paths — plus **one real jar**, the GraalVM substitution
build of the scripting API.

## `scripting/`

55 source files, 4,259 lines, decompiled from `arc_040.zip`:

```
base offset   0x20E5D0DC   (carved from .svm_hea)
size          57,161 bytes, 86 entries, 85 classes
manifest      Automatic-Module-Name: com.astralis.scripting.api
              Implementation-Version: 2.2.6
```

Every method body throws `UnsupportedOperationException` **by design**. This is
the substitution jar GraalVM compiles against: the signatures are the real 2.2.6
API contract, the bodies are replaced by native code at image build time. A
decompiler cannot produce more than that, and nothing is missing.

What the signatures tell you about the 26.2 build: `Modules.getKillAuraTarget()`,
`Modules.getByCategory(String)`, `Modules.addTargetHudMode(String, ScriptDraggable,
TargetHudRenderer)`, `Modules.exists(String)`, `Client`, `Inventory`, `Keybinds`,
`ScriptEvents` with its cancellable subtypes. Compare against `src/cc/astralis`
for the older intermediary build to see what the scripting layer gained.

## Everything else

| file | contents |
|---|---|
| `../mapping/image26/mc_types.txt` | 16,263 Minecraft types, Mojang official names |
| `../mapping/image26/client_types.txt` | 1,483 client types (`pub/astralis`, `com/astralis`) |
| `../mapping/image26/mixin_hooks.tsv` | 593 Mixin handlers; 87 belong to `astralis-recode` |
| `../mapping/image26/mods.jsonl` | 85 `fabric.mod.json`, parsed and sorted |
| `../mapping/image26/resources.txt` | 43,324 asset/data/META-INF paths |
| `../mapping/image26/member_names.tsv` | 202,366 member-name records with heap offsets |
| `../mapping/image26/descriptors.tsv` | 105,008 distinct method descriptors with occurrence counts |
| `../mapping/image26/member_summary.txt` | counts plus the negative result that scoring runs against the jar gives |
| `../mapping/image26/summary.txt` | counts, so you can see the size before opening anything |

The code side of the image — 342,822 functions, the call graph and the decoded
`.vmp0` table — is in `../native/` and `../docs/analysis/NATIVE_DUMP.md`.

The report that ties it together is `../docs/analysis/IMAGE_26_2.md`.

Regenerate with:

```bash
python tools/dump_image_symbols.py work/exe/Runtime/astralis.dll work/image26
python tools/carve_dll_archives.py work/exe/Runtime/astralis.dll work/dll_archives
java -jar tools/vineflower.jar work/dll_archives/arc_040.zip reconstruct/26.2/scripting
```
