# Module map

The client registers **91 modules**. `cc/astralis/guu` is the module base: it
holds the name/description pair (`fse bdg`), the setting list
(`List<ffn<?>> ckj`), the enabled flag and the category. Every module class
extends it and calls `super(bfm.<CATEGORY>)`; `cc/astralis/bfm` is the enum
that defines the seven categories.

`cc/astralis/dfw` is the manager. Its registration array instantiates 78 of
the 91; the remaining 13 (the HUD and the GUI pieces) are created elsewhere.

## Why the names are inferred, not read

The display name of a module is **not** in the class file. `guu.dtp()` builds
it from `bdg.ctg()`, and `bdg` is a `fse` whose value only arrives from the
user config (`bcy.etg` reads two JSON keys per entry). A fresh install has
`new fse("none", "none")`. The string `KillAura` does not exist anywhere in
the 518 classes.

So each row is identified by what it *does*:

- the **setting names** it constructs — `new bes("Scout Range", ...)`, `new gbp("Ignore Teammates", ...)` — which are plain string literals after folding;
- the **mode options** it lists — `Single`/`Switch`/`Vanilla` for an aura, `Imgui`/`Dropdown`/`Astralis` for the GUI;
- the **Minecraft surface** it touches — `class_7422` (`EndCrystalEntity`) pins a crystal aura, `class_640` (`PlayerListEntry`) pins a tab-list feature, `class_1041` (`Window`) pins freecam;
- the **suffix** it prints next to its own name — `efe("ms")`, `efe("Modern")`.

Confidence is `high` when a setting list is unambiguous, `medium` when the
surface narrows it to a family, `low` when only one weak signal exists, `?`
when the class carries nothing of its own.

| | |
|---|---|
| classes | 91 |
| identified | 74 |
| unresolved | 17 |
| high confidence | 52 |
| medium confidence | 20 |
| low confidence | 2 |
| per category | Combat 14 · Movement 14 · World 7 · Player 16 · Visual 29 · Exploit 6 · Client 5 |

Machine-readable: `mapping/modules.tsv` (all 91, evidence per row) and
`mapping/modules.proguard.txt` (`cc.astralis.ekb -> cc.astralis.KillAura:`,
importable into Recaf).

An em dash in the settings column means the class builds no name-carrying
setting of its own; the identification then rests on the mode options it lists
and the game surface it calls, both recorded per row in `modules.tsv`.

## Combat (14 modules, 12 identified)

| class | module | conf. | settings |
|---|---|---|---|
| `avx` | OldCombat | high | Removes Attack Cooldown; Removes your attack on miss; Weapon Only; Allow Block Hit; Allow Air Hit |
| `cuu` | AutoCrystal | high | Scout Range; Min Range; Max Range; Duration; Ignore Teammates; ESP |
| `czm` | HitSelect | medium | Wait for Crit; Percentage; Reaction Time; Miss Chance; Weapon Only; Ignore Teammates |
| `dqk` | ? | low | — |
| `dur` | AutoClicker | high | — |
| `dvw` | Backtrack | high | Range; MS Min; MS Max; Tracking Timing; Chance; Pause On HurtTime; Hurt Time; Target Mode; Last Attack Time To Work |
| `dxd` | Reach | high | Reach; Modify Block Reach; Block Reach |
| `ejt` | AntiBot | high | Is In Tablist; Valid Name; Name Starts With; Age; Latency |
| `ekb` | KillAura | high | Aura Mode; Ray Cast; Switch Delay; Scout Range; Attack Range; Auto Block; Block Range; Auto Block Mode; Blink; Packet Auto Block; Interact When Blocking; Force Block Hit Animation; Rotations; Noise Mode; Noise Yaw Multiplier; Noise Pitch Multiplier; Max Yaw Noise; Max Pitch Noise; GCD Fix; Rotation Range; Min Yaw Speed; Max Yaw Speed; Min Pitch Speed; Max Pitch Speed; 1.9+ CPS; 1.8 Swing Order; Min CPS; Max CPS; Wait for Crit; Critical Sprint; Through Walls; Ignore Teammates; Monsters; Animals; Invisible; ESP; Esp Width |
| `exz` | AimAssist | medium | Range; 1.8 Swing Order; Hit Cool Down; Min Rotation Speed; Max Rotation Speed |
| `ezw` | SilentAim | medium | Mode; Range; FOV; Use Sensitivity; Only While Clicking; Weapon Only; Ignore Teammates; Though Walls; Stop Aiming on Target; Slow Aim if Close; Slow Aim Threshold; Slow Aim Factor; Take Curved Way; Curve Amplitude; Curve Frequency; Min Speed; Max Speed; Random Amount; Random Frequency |
| `gey` | Velocity | high | Mode; Packets; Max Hurt Time |
| `gya` | ? | low | — |
| `gzv` | Criticals | high | Mode; Critical On Ticks |

## Movement (14 modules, 10 identified)

| class | module | conf. | settings |
|---|---|---|---|
| `ab` | ? | low | Blocks only; Pitch check; Backwards Only |
| `avq` | ? | low | — |
| `avv` | ? | low | — |
| `bni` | ? | low | Stop on Disable |
| `cdo` | NoSlow | high | Sword Slow Down; Food Slow Down; Potion Slow Down; Bow Slow Down; Sword Method; Food Method; Potion Method; Bow Method |
| `cqw` | LongJump | high | Range; Only with Space |
| `doc` | ElytraFly | high | Speed; Vertical Speed; Only With Elytra |
| `dtd` | Timer | medium | — |
| `efx` | Scaffold | high | Scaffold Mode; Place Mode; Start Placing After; Swing Hand; Alternated Scaffold Order; SafeWalk; Same Y; Anal Boob; Don't place in same tick; Jump; Don't jump diagonally; Jump Every; Place Delay; Sprint On Jump; Sprint; Change FOV; Tower; No Off Hand check; Block Counter; Block Counter Mode; Block ESP; Block ESP Mode; Sneak; Sneak Every; Autoswap to next stack; Rotations; 180 on jump key; Ray Cast Mode; Min Yaw Speed; Max Yaw Speed; Min Pitch Speed; Max Pitch Speed; Rotation Mode; Brute Force Yaw; Brute Force Pitch; Spoof Ray Cast; Stable; Yaw Value; Pitch Value |
| `eky` | Speed | high | — |
| `fhd` | GodBridge | high | Modern Watchdog; Search Range; Rotation Mode; Raycast Mode; God Bridge Yaw; Rotation Speed; Bypass Mode; Tower Jump Timing; Spin; Spin Speed; Rotation Speed Yaw; Rotation Speed Pitch; KeepY; Jump; Don't jump diagonally; Jump Every; Block Counter; Block Counter Mode; Block ESP; Block ESP Alpha; Spoof Item; Swing |
| `fjf` | InventoryMove | medium | — |
| `giw` | SafeWalk | medium | — |
| `gli` | Sprint | high | — |

## World (7 modules, 5 identified)

| class | module | conf. | settings |
|---|---|---|---|
| `bqo` | NoteBlock | low | — |
| `cfn` | ? | low | — |
| `ehh` | Nuker | high | Break Range; Rotate; Break Block surrounding; Keep Rotation |
| `fei` | AutoPlace | high | Place Delay; Swing Hand; Rotations |
| `fpv` | SpeedMine | high | Mode; Speed; Mining Cooldown; Cooldown |
| `gdj` | BedAura | medium | — |
| `hii` | ? | low | — |

## Player (16 modules, 12 identified)

| class | module | conf. | settings |
|---|---|---|---|
| `aac` | AutoWeapon | medium | Action Delay (ticks); Sword Slot; First Tool Slot |
| `alk` | AutoQueue | high | Auto Set Language; Auto Play; Auto Play Mode |
| `avy` | ? | low | Mode |
| `axo` | AutoShield | high | Counter Shield with Axe; Only While Sneaking; Switch Back |
| `azi` | ? | low | — |
| `cnr` | Spammer | medium | Flush Automatically; Flush Interval (ms) |
| `dke` | GuiMove | high | Inventory; Chest; ClickGui; Allow Jumping; Allow Sneaking; Allow Sprinting |
| `dts` | Blink | medium | Mode |
| `edr` | NoPush | high | Player No Push; Water No Push |
| `fgu` | FastPlace | high | Delay; Not while Scaffold |
| `fli` | AutoTool | high | Delay; Blocks only; Auto Swap; Swap Amount |
| `fnq` | ? | low | — |
| `fpn` | NoFall | high | Mode |
| `gih` | ? | low | — |
| `hdw` | ChestStealer | high | Delay; Auto Close; Check title |
| `hia` | Fly | high | Mode; Timer; Ground Timer; Air Timer |

## Visual (29 modules, 27 identified)

| class | module | conf. | settings |
|---|---|---|---|
| `adv` | PlayerList | medium | — |
| `asl` | HoleESP | high | — |
| `awt` | ? | low | — |
| `ayd` | ReloadShader | medium | Reload Shader |
| `bef` | Tracers | medium | — |
| `bma` | Animations | high | Speed; Animation Mode; Block X; Block Y; Block Z; Disable Item Swing Offset |
| `bnn` | ClickGui | high | Font Size; Hidden Categories; Animation Speed; Color Speed; Back Ground; Side Line; Full Outline |
| `cc` | ESP | high | Main Box; Main box Shadow; Fill Image; Speed; Fill; Health Bar; Health Bar Shadow |
| `cem` | Trails | high | Min Distance; Curve Resolution |
| `ckv` | TargetHud | high | Mode |
| `dad` | PotionStatus | high | — |
| `daw` | ClickGuiStyle | medium | Mode; Imgui Alpha; Blur; Only Blur Imgui; Blur Radius; Gradient; Only Gradient With Imgui; Gradient Alpha |
| `der` | Nametags | high | Font; Text Shadow; Background; Show Health; Corner Radius; Padding |
| `di` | NoRender | high | No Fire; No Water; No Blindness; No Fog; No Weather; No Clouds |
| `dk` | Ambience | high | Time Changer; Time; Fog Modifier; Sky Modifier; Custom Gradient; Fog Start; Fog End; Environmental Start; Environmental End; Top Alpha; Bottom Alpha; Custom Blur; Blur Strength |
| `dtc` | Notifications | high | Notification on Toggle; Mode; Pop Sound |
| `edy` | Font | low | — |
| `enu` | HitSound | high | Hit Sound |
| `eny` | HitMarker | high | Circle Duration; Max Radius |
| `evm` | Freecam | high | — |
| `ezv` | Glow | high | Bloom; Bloom Radius; Blur; Blur Radius; Font Mode; Color Mode; Water Mark Mode; Alternative Color; Speed; Background Alpha |
| `fds` | ? | low | — |
| `fhc` | Watermark | high | Mode |
| `foz` | Scoreboard | high | No Score Board; No Score; Change Color |
| `fun` | ItemPhysics | medium | — |
| `gks` | Chams | medium | — |
| `gsn` | Fullbright | medium | — |
| `gty` | AntiVoid | medium | — |
| `hin` | Camera | high | Change Aspect Ratio; Zoom; Modify Third Person; Camera No Clip; X Item; Y Item; Z Item; Rot X; Rot Y; Rot Z |

## Exploit (6 modules, 4 identified)

| class | module | conf. | settings |
|---|---|---|---|
| `clc` | PacketMine | high | — |
| `dvp` | Session | high | — |
| `dzu` | Disabler | high | — |
| `fhx` | ? | low | — |
| `fno` | ? | low | Delay In Between Checks |
| `hba` | PayloadExploit | medium | — |

## Client (5 modules, 4 identified)

| class | module | conf. | settings |
|---|---|---|---|
| `a` | SuspiciousName | high | Send Chat message; Send Notification; Alert if Suspicious Name |
| `bdh` | MovementFix | medium | Movement Correction; Old Hit Box Offset; Modern Hit Vec |
| `coi` | IRC | high | — |
| `dfz` | Config | high | Auto Save Config; Auto Save Config Delay |
| `dxc` | ? | low | — |

## Unresolved classes

These carry no setting literals and no Minecraft type reference of their own;
they reach the game through other `cc/astralis` classes, so the string
evidence runs out. Their category is still known from the `super(bfm.X)` call.

| class | category | what is left |
|---|---|---|
| `dqk` | COMBAT | no settings |
| `gya` | COMBAT | no settings |
| `ab` | MOVEMENT | Blocks only; Pitch check; Backwards Only |
| `avq` | MOVEMENT | no settings |
| `avv` | MOVEMENT | no settings |
| `bni` | MOVEMENT | Stop on Disable |
| `cfn` | WORLD | no settings |
| `hii` | WORLD | no settings |
| `avy` | PLAYER | Mode |
| `azi` | PLAYER | no settings |
| `fnq` | PLAYER | no settings |
| `gih` | PLAYER | no settings |
| `awt` | VISUAL | no settings |
| `fds` | VISUAL | no settings |
| `fhx` | EXPLOIT | no settings |
| `fno` | EXPLOIT | Delay In Between Checks |
| `dxc` | CLIENT | no settings |

## Importing into Recaf

`mapping/modules.proguard.txt` uses the ProGuard layout that Recaf 3 expects:

```
cc.astralis.ekb -> cc.astralis.KillAura:
```

Open the workspace with `work/java_fold7` (or the rebuilt jar from
`tools/rebuild_jar.py`), then *Mappings → Import → ProGuard* and pick the
file. Class names are replaced in the tree and in the decompiler view; the
original names stay in the file so nothing is lost.

Unresolved classes are left out of the file on purpose — a wrong rename is
worse than an obfuscated one.

## Reproducing the scan

```bash
python tools/module_scan.py work/java_fold7 scan.tsv
```

The script parses the class files directly — no JVM, no class loading. It walks
the tree, keeps every class whose super is `cc/astralis/guu`, reads the
`bfm.<CATEGORY>` field reference out of the constructor, and collects the
printable string constants plus the `net/minecraft/class_*` references. Those
four columns are the evidence; the `module` column in `mapping/modules.tsv` was
assigned by reading them, and the script does not guess names.

---

Part of the decompilation of **DrCrypter Astralis 2.11** (Fabric 26.3). The
bytecode pipeline that produces readable constants is described in
`docs/analysis/DEOBFUSCATION.md`; the native side is in the top-level
`README.md`.
