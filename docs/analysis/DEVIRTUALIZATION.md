# Devirtualization — `dev/opalV2` native layer

Status: complete inventory + full pseudocode recovery. Java port of the 12 real
methods is the remaining unit.

Everything here was produced from the shipped DLL
`work/dev_opalV2_x64-windows.dll` (IDA database instance `629dbef17162`).
No network, no execution of the target.

---

## 1. There is no bytecode VM

The earlier working assumption — a custom interpreter with an opcode table
inside the DLL — is wrong. There is no dispatch loop, no opcode table, no
bytecode blob. What is in the DLL is a **Java→C translator output**: each Java
method of the protected classes was compiled to native x86-64 at protection
time, and the class file in the jar was rewritten to declare those methods
`native`.

Evidence:

| check | result |
|---|---|
| `CAFEBABE` scan over all segments | exactly one hit: `0x1800EA6B0`, the 1170-byte `dev/opalV2/hidden/Hidden0` stub |
| per-function `push rbp;push r15;push r14;push r13` prologue scan in the "VM" blobs | 1 prologue each — one real function, not many |
| `retn` count in `sub_1800A3FB0..0x1800B9361` (87 KB) | 1 |
| `call` targets inside the same range | 3 280 calls, all JNI vtable slots or `sub_1800Cxxxx` runtime helpers |
| strings `.rdata` `0x180113000` | exception text of a Java→C runtime: `INVOKEVIRTUAL Object npe`, `GETFIELD Boolean npe`, `ATHROW npe`, `ANEWARRAY array size < 0`, `BASTORE npe`, `LASTORE npe`, `AASTORE npe`, `BALOAD npe`, `cannot cast to ` |

The `.rdata` with those messages also carries the full constant pool of the
translated classes — class names, method names, descriptors, string literals —
which is what the "opcode table" hunt was actually looking at.

The protector identifies itself in its own diagnostics: every registration
failure prints `Exception occured while registering native_jvm for %s`.

---

## 2. How the loader chain works

```
JNI_OnLoad                        0x180002A30
 └ sub_1800028F0                  DefineClass(Hidden0, 1170 bytes) + RegisterNatives
    ├ 0x1800EA6B0                 dev/opalV2/hidden/Hidden0  (only class file in the DLL)
    └ 0x180116E10                 qword[4] = {0x180003290, 0x1800257F0, 0x18006B110, 0x1800BC110}

dev/opalV2/Loader.registerNativesForClass(int, Class)   native, 0x1800028D0
 └ return qword_180116E10[index](env, class)            ← one handler per protected class
```

Each handler does two things:

1. resolves every JVM symbol the translated code touches into a global slot
   (`FindClass` → `NewGlobalRef`, wrapped in monitor + `ExceptionCheck`);
2. `RegisterNatives` for the class's native methods, plus one call into
   `Hidden0.special_clinit_<index>_<n>(Class)` which runs the original
   `<clinit>`.

`Loader` itself is 3 294 bytes: a `<clinit>` that picks `x64`/`aarch64`/`x86`
from `os.arch` and loads `/dev/opalV2/<arch>.<dll|so|dylib>`, plus the one
native method above. That is the entire Java-side API of the protector.

Handler → class:

| index | class | handler |
|---|---|---|
| 0 | `cc/astralis/dqq` | `sub_180003290` |
| 1 | `cc/astralis/evd` | `sub_1800257F0` |
| 2 | `cc/astralis/fz`  | `sub_18006B110` |
| 3 | `cc/astralis/hdl` | `sub_1800BC110` |

---

## 3. Complete native registry

16 entries, matching `javap` exactly (dqq 1, evd 1, fz 6, hdl 4 native methods,
plus the four `<clinit>` bodies).

| class | idx | method | descriptor | address | size | hidden entry |
|---|---|---|---|---|---|---|
| dqq | 0 | `ahf` | `()V` | `0x180002A70` | 138 | |
| dqq | 0 | `<clinit>` | `()V` | `0x180002B00` | 1 936 | `special_clinit_0_320` |
| evd | 1 | `dnu` | `(Lcc/astralis/etk;F)V` | `0x180003D20` | 120 475 | |
| evd | 1 | `<clinit>` | `()V` | `0x1800213C0` | 17 453 | `special_clinit_1_230` |
| fz | 2 | `hgv` | `(J)[B` | `0x180027160` | 36 517 | |
| fz | 2 | `dvr` | `(Ljava/lang/String;[B[B)Ljava/lang/String;` | `0x180030010` | 5 002 | |
| fz | 2 | `atc` | `(Ljava/lang/String;[B[B)Ljava/lang/String;` | `0x1800313A0` | 23 621 | |
| fz | 2 | `dsg` | `(Ljava/lang/String;[BJ)Ljava/lang/String;` | `0x180036FF0` | 1 063 | |
| fz | 2 | `ati` | `(Ljava/lang/String;[BJ)Ljava/lang/String;` | `0x180037420` | 1 063 | |
| fz | 2 | `fbh` | `(J)[B` | `0x180037850` | 9 021 | |
| fz | 2 | `<clinit>` | `()V` | `0x180039B90` | 202 106 | `special_clinit_2_70` |
| hdl | 3 | `cat` | `()V` | `0x18006C860` | 57 327 | |
| hdl | 3 | `onMessage` | `(Ljava/lang/String;)V` | `0x18007A850` | 139 324 | |
| hdl | 3 | `has` | `()V` | `0x18009C890` | 30 494 | |
| hdl | 3 | `csc` | `(Ljava/lang/String;)Lcom/google/gson/JsonObject;` | `0x1800A3FB0` | 86 961 | |
| hdl | 3 | `<clinit>` | `()V` | `0x1800B9370` | 11 679 | `special_clinit_3_160` |

Generated: `work/devirt/native_registry.tsv`.

Reading of the four groups:

- **dqq** — one hook, `ahf()V`, 138 bytes of pseudocode. Null-check plus
  `NullPointerException("classloader == null")`; class-init glue.
- **evd** — `dnu(etk,float)` is a render/update hook (120 KB), `<clinit>` is
  table setup (17 KB).
- **fz** — crypto. `(J)[B` / `(String,[B,[B)String` / `(String,[B,J)String`
  are the encrypt/decrypt/hash entry points; the class constant pool names
  `javax.crypto.Cipher`, `DES/CBC/NoPadding`, `DES/CBC/PKCS5Padding`,
  `SecretKeyFactory`, `DESKeySpec`, `IvParameterSpec`, `MessageDigest`,
  `Base64`, `KeyFactory`, `PKCS8EncodedKeySpec`. `special_clinit_2_70` is
  202 KB because it deserializes the class's data tables inline.
- **hdl** — the socket / C2 layer. `cat()` connect, `has()` keepalive,
  `onMessage(String)` the message dispatcher (139 KB), `csc(String)` a JSON
  payload builder (87 KB). Constant pool names `Java-WebSocket`, `gson`,
  `ScheduledExecutorService`, `ThreadLocalRandom`, `sun.misc.Unsafe`,
  `LambdaMetafactory`.

---

## 4. Symbol pool — every constant the native code resolves

`0x180113000`, 28 KB, 541 non-empty entries, NUL-separated, **JNI
modified-UTF-8** (so `0xC0 0x80` is an embedded NUL and `0x80..0xFF` arrives as
two or three bytes — plain `utf-8` decode fails on it, which is why naive dumps
look like garbage).

Each handler walks a slice of the pool and stores the resolved global ref in a
fixed `qword_1801xxxxx` slot. Those slots are the addresses the translated code
dereferences, so the mapping *slot → symbol* is the complete constant catalogue:

| class | symbols |
|---|---|
| dqq | 5 |
| evd | 34 |
| fz | 52 |
| hdl | 77 |
| **total** | **168** |

Generated: `work/devirt/symbols_{dqq,evd,fz,hdl}.tsv` with pool offset, encoded
length, text and hex.

Highlights from `hdl` (the whole C2 surface in one list):

```
com.google.gson.JsonObject / JsonArray / JsonElement / JsonParser
sun.misc.Unsafe            java.lang.Runtime          java.lang.Thread
java.util.concurrent.ScheduledExecutorService / TimeUnit / ThreadLocalRandom
org.slf4j.Logger           java.util.Set / List / Map$Entry / Iterator
java.lang.invoke.LambdaMetafactory   lambda$start$0 / lambda$start$1
lambda$attemptReconnect$2  run
cc.astralis.{cni,cfg,enn,ajt,dve,dc,gep,fxc,bcy,gzz,cbm,ckb,cwr,goy,drd,dfw,
              fse,gyn,aml,bvc,fbr,fvh,guu,gqs,dnu,fgh,gqi,dar,fz}
```

`fz` resolves the crypto stack plus `cc.astralis.{cni,eyj,gls,bga}` and
`java.security.{MessageDigest,KeyFactory}`.

Three slots in `fz` and one in `hdl` are **not** names — they are high-entropy
payloads (see §5).

---

## 5. Embedded payloads

The pool also carries the encrypted data blobs the classes decrypt at
`<clinit>` time. Extracted with the modified-UTF-8 decoder:

| pool offset | encoded | decoded | entropy | file |
|---|---|---|---|---|
| `0x0ed4` | 5 226 | 3 433 | 7.94 | `work/devirt/pool_blob_0ed4.bin` |
| `0x2578` | 264 | 176 | 6.86 | `work/devirt/pool_blob_2578.bin` |
| `0x3417` | 126 | 88 | 6.16 | `work/devirt/pool_blob_3417.bin` |
| `0x237b` | 105 | 73 | 5.99 | `work/devirt/pool_blob_237b.bin` |
| `0x085b` | 59 | 40 | 5.02 | `work/devirt/pool_blob_085b.bin` |
| `0x3e00` | 12 800 | 12 800 | — | all `0xFF`, filler |

Index: `work/devirt/pool_blobs.tsv`.

`0x0ed4` is the big one (3 433 bytes). It is the `fz` string/key table — the
DES seed material `fz.<clinit>` consumes. `0x2578` (176 B) and `0x3417` (88 B)
are key/IV-sized; `hdl`'s `qword_180117AF0` is a 400-byte run of the same class
of data.

These decrypt with the same DES/CBC primitives the jar side uses
(`tools/astralis_deobf.py`: DES/CBC, zero IV, CESU-8) — the keys are already
recoverable from the existing table recovery, so no new cryptanalysis is
needed.

---

## 6. Recovering the bodies

`Hex-Rays` refuses any function over `MAX_FUNCSIZE` (0x10000 = 64 KB). Four
bodies are over it:

| body | size | status |
|---|---|---|
| `evd.dnu` | 120 475 | split-decompiled |
| `fz.<clinit>` | 202 106 | split-decompiled |
| `hdl.onMessage` | 139 324 | split-decompiled |
| `hdl.csc` | 86 961 | split-decompiled |

Workaround without restarting IDA: walk the function, cut at a basic-block
boundary after every 32 KB, `set_func_end` + `add_func`, decompile each chunk.
Chunk boundaries lose the variables that cross them, but each chunk is readable
and the control flow is intact. `tools/devirt_dump.py` does this automatically.

All 16 bodies are on disk, decompiled:

```
work/devirt/native_dqq_ahf.c                16 lines
work/devirt/native_dqq_clinit.c            276
work/devirt/native_evd_dnu.c             4 727
work/devirt/native_evd_clinit.c          2 030
work/devirt/native_fz_hgv.c              3 563
work/devirt/native_fz_dvr.c                500
work/devirt/native_fz_atc.c              2 324
work/devirt/native_fz_dsg.c                133
work/devirt/native_fz_ati.c                133
work/devirt/native_fz_fbh.c              1 095
work/devirt/native_fz_clinit.c           3 404
work/devirt/native_hdl_cat.c             5 251
work/devirt/native_hdl_onMessage.c       5 340
work/devirt/native_hdl_has.c             3 045
work/devirt/native_hdl_csc.c             5 492
work/devirt/native_hdl_clinit.c          1 720
```

Reproduce with `tools/devirt_dump.py` (run inside IDA on the DLL).

---

## 7. Idioms of the translation, for the Java port

Read these once and the pseudocode becomes Java:

| C shape | Java meaning |
|---|---|
| `(*(…+1824))(a1)` | `env->ExceptionCheck()` |
| `(*(…+184))(a1,x)` | `env->DeleteLocalRef(x)` |
| `(*(…+168))(a1,x)` | `env->NewGlobalRef(x)` |
| `(*(…+1808))(a1,x)` / `(…+710)` | `NewGlobalRef` on a resolved ID (static / instance) |
| `(*(…+1336))(a1, pool+n)` | `FindClass(pool[n])` |
| `sub_1800023C0(a1, cls, id)` | exception-safe `GetMethodID`/`GetFieldID` |
| `sub_1800027C0 / sub_180003690` | `Call*Method` on a cached ID |
| `sub_1800C68B0 / sub_1800C6900` | `MonitorEnter` / `MonitorExit` on a global object |
| `sub_180002110(a1, msg, desc, -1)` | `ThrowNew(NullPointerException, msg)` |
| `sub_1800C7320` | `ReturnValue` / epilogue |
| `sub_1800036C0` | local-ref list append |

Every `<clinit>` body is a sequence of the same block repeated:

```c
if (cache == 0) {
    MonitorEnter(&lock);
    if (cache == 0)
        cache = NewGlobalRef(<resolve member>);
    MonitorExit(&lock);
}
```

That is JNI cache warm-up, not business logic. In a pure-Java rewrite the four
`<clinit>` natives collapse to nothing — the symbols they warm are the same
symbols the Java calls name directly.

---

## 8. What is left

1. Port the 12 real bodies to Java. Order by value:
   `fz` (6 crypto methods, 5 000–36 000 B of pseudocode each, most mechanical),
   then `hdl` (`cat`/`has`/`onMessage`/`csc`, the C2 layer),
   then `evd.dnu` (render hook),
   then `dqq.ahf` (already 16 lines).
2. Drop the four `<clinit>` natives and the `Loader.registerNativesForClass`
   calls from the rewritten classes; keep `dev/opalV2/hidden/Hidden0` only as a
   historical artifact.
3. Decrypt the five payload blobs (§5) with the existing DES pipeline and inline
   the plaintexts.
4. Fold the remaining `a(idx,key)` / encrypted-`<clinit>` sites in the 518
   decompiled classes with `tools/astralis_deobf.py`.
