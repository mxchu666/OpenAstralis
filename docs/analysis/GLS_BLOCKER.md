# GLS/BGA: definitive finding

`cc/astralis/gls` and `cc/astralis/bga` are **not in the leak and cannot be
recovered from it.** This is the single blocker for a byte-identical
open-source build. Everything below is the evidence.

## What they do

Every class that carries a DES-encrypted string table initialises it with:

```java
long key = gls.a(X, Y, methodHandlesLookupClass()).a(Z) ^ W;
// key -> DES/CBC/PKCS5 key bytes, big-endian
```

`gls.a(long,long,Object)` returns a `bga`; `bga.a(long)` returns `long`.
The `Object` argument is the calling `Class`, obtained via
`MethodHandles.lookup().lookupClass()`.

Affected: `fz`, `hdl`, `dqq`, `evd` (via their native `<clinit>`) plus
`amh`, `aml`, `cds`, `cow`, `dcm`, `dgw`, `env`, `eqf`, `erh`, `ezj`,
`fto`, `fxm`, `gge`, `gpy`, `hgy`.

## Why they are unrecoverable

1. **Absent from the jar.** `jar tf` over all 518 classes has no
   `cc/astralis/gls.class` or `cc/astralis/bga.class`. There is no
   homoglyph, zero-width or trailing-NUL near-match. The 15 nested
   `META-INF/jars/*.jar` payloads contain nothing either.
2. **Not defined by the natives.** The Windows DLL calls `DefineClass`
   exactly once, at `sub_1800028F0`:
   `DefineClass(name = pool+356, loader = NULL, buf = 0x1800EA6B0, len = 1170)`.
   The buffer is `cafebabe 00000034` and decompiles to
   `dev.opalV2.hidden.Hidden0` — six indy trampolines and the four
   `special_clinit_N_M` natives. All four platform binaries
   (`x64-windows.dll`, `aarch64-macos.dylib`, `x64-macos.dylib`,
   `x64-linux.so`) contain exactly one `CAFEBABE` and reference
   `cc/astralis/gls` only as the descriptor string
   `(JJLjava/lang/Object;)Lcc/astralis/bga;`.
3. **Not in the native registry.** The 16 registered natives are the four
   `<clinit>` handlers plus `dqq.ahf`, `evd.dnu`, five `fz` methods and
   four `hdl` methods. `gls`/`bga` are pure Java and supplied by the paid
   loader at runtime; `dev/opalV2/Loader` only picks the platform binary,
   `System.load`s it and calls `RegisterNatives`.
4. **No formula.** The four inputs per class look random. Across all 15:
   `x^y`, `x+y`, `x^z`, `y^w`, `x^y^z^w`, `x&0xffff`, `z&0x7fff` are all
   distinct for every class (15/15), so minuscule reuse (`bga.a(z)` being
   a plain XOR with the `gls` output, `X^Y` being a constant, the key being
   global) is ruled out.
5. **Key search is infeasible.** The key is a full 64-bit DES key
   (56 effective bits), and the four inputs are 64-bit random values, so
   the generator behaves as a PRF. There is no known-plaintext shortcut:
   the plaintexts are short font names in a 28-entry dictionary, which
   only makes a *candidate* key verifiable, not findable.
6. **256 candidate formulas tested, zero hits.** `tools/gls_probe2.py`
   tests XOR/add/sub/mul over all permutations of `x,y,z,w`, rotations,
   byte swaps, 128-bit high multiply, murmur/splitmix avalanche, and
   eleven class-name-hash combinations. The oracle requires a *full* walk
   of the largest table, so false positives are not possible.
7. **The oracle is not the problem.** `tools/walk_selftest.py` encrypts
   known font names in the exact emitted layout and recovers them
   **20/20 exactly**. `des_decrypt` is statistically sane (10/2000 random
   keys pass PKCS5, ≈1/256).

## What the tables actually contain: font names

`bxc.emc(String, int)` is a **font cache**, not a field resolver:

```java
public static fll emc(String name, int size) {
    if (name != null && !name.isEmpty() && size > 0)
        return cmr.computeIfAbsent(name + "-" + size, k -> fis(name, size));
    return null;
}
// fis -> new bad(name, size) -> new fll(font, size)
```

`bad` is a Skija font object. Its constructor builds
`"/assets/astralis/fonts/" + name + ".ttf"`, reads the classpath resource,
runs `Data.makeFromBytes` and `Typeface.makeFromData`. `fll` is that font
at a size, exposing the text-drawing methods (`ebb`, `aof`, `akh`, …).

So each of the 15 interfaces is a **font registry**, the decrypted strings
are `.ttf` basenames, and the `int` argument is the pixel size. The jar
ships all 28 fonts in `assets/astralis/fonts/`.

## Table layout (fully solved)

Verified against `amh`, which declares `new String[31]`:

```
[chunk 24 bytes][next-length byte][chunk]...[next-length byte][chunk]
```

then a second table with `chunk = 16` and the same framing. `amh` is
29 chunks from the 532-byte literal plus 2 chunks from the 33-byte
literal = **exactly 31**. Every length byte is a multiple of 8, and the
walk consumes each blob to the byte. Slot duplication is real: `amh` has
29 chunks but only **17 distinct**, i.e. 17 fonts each exposed at several
sizes (8, 9, 10, 11, 12, 15, 16, 20, 25, 32).

No ciphertext chunk is shared between classes, which is consistent with a
per-class key.

## Consequence for the port

A byte-identical rebuild is **impossible from the leak alone**. The
publishable crack therefore has to *replace* the obfuscation layer rather
than invert it:

- drop `gls`/`bga` entirely;
- write each table as literal `bxc.emc("Name", size)` calls;
- pick the name for each slot from the 28 shipped fonts.

The ciphertext length gives the plaintext window (8-byte chunk → 1..7
chars, 16 → 9..15, 24 → 17..23), and equal chunks inside a class are the
same font. That resolves most slots outright; the remainder are decided by
the font family already used elsewhere in the same interface. Where a slot
stays ambiguous the choice is between valid fonts, so the build runs
either way — only the rendered face can differ.

Font names already visible in plaintext elsewhere in the tree (so they are
confirmed members of the set): `Product Sans Regular`, `Product Sans Bold`,
`JetBrains-Regular`, `JetBrains-Bold`, `Poppins-Regular`, `Poppins-Bold`,
`Sf-Regular`, `Sf-Bold`, `Sf-Ui`, `Tahoma`, `Icons-Regular`,
`mojangles-extended`. `der` exposes a 9-entry user-selectable subset.
