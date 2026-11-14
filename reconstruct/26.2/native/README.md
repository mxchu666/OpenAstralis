# `reconstruct/26.2/native` — the DLL side of the 26.2 reconstruction

The 26.2 build survives as a GraalVM native image, not as classes. This folder
holds what a decompiler and a table decoder can pull out of `astralis.dll`, in
the same tree as the one real jar (`../scripting/`), so the reconstruction of
"Astralis on 26.2" is in one place.

| path | contents |
|---|---|
| `pseudocode/` | 328 Hex-Rays functions: `entry/`, `jdk/`, `runtime/`, `samples/`, `vmp0/` + `index.tsv`, `summary.txt` |
| `callgraph_top.tsv` | the 20,000 most frequent caller→callee edges |
| `iat_sites.tsv` | all 1,628 import call sites: `dll`, `function`, `caller`, `caller_name`, `site` |
| `import_calls.tsv` | the 404 imports ranked by number of call sites |
| `hot_functions.tsv` | the 60 functions with the highest in-degree |
| `vmp0_records.tsv.gz` | all 294,735 `.vmp0` chunks: `rva`, `length`, `section`, `kind`, `first8` |
| `vmp0_records_summary.txt` | chunk count, span, coverage, length and start-kind histograms |
| `devirt_summary.txt`, `vmp0_summary.txt`, `vmp0_chunk_sigs.tsv` | call-site counts, `.vmp0` header facts, the 500 most common chunk openings |

`pseudocode/README.md` explains the window-base rule: Hex-Rays prints an operand
above the window base relative to it and one below it absolute, so add the base
recorded in each file's header to rebase.

## What devirtualisation means here

`.vmp0` is not a bytecode VM and there is no dispatch table to undo. The section
opens with `u32 294,735` and a 1.77 MB table of `{u32 rva, u16 length}` records
that describe **4,921,400 bytes of in-place-mutated x86** — 74.7% of the 6.6 MB
band they span. Every chunk starts with arithmetic garbage (`xor` 58,657,
`not` 15,414, `neg` 14,551, `rol` 13,223, `adc` 12,180), and the 16,853 that look
like prologues are the ones the 8 published fragments were taken from. All 8
decompile to `JUMPOUT` five bytes into themselves.

So the devirtualised artifact is the record index plus the resolved call graph,
not a listing. Undoing the mutation needs the code to run, and the image is not
run here.

## What deobfuscation means here

The client's own classes are `pub/astralis/client/**` and `pub/astralis/obfuscated/**`
with 2-character names (`FD`, `AK`, `e5`, `tN`) — already obfuscated before the
AOT compile, and the ProGuard mapping is not in the image. The JDK half is not
obfuscated and decompiles with full names, which is why `pseudocode/jdk/` reads
normally and `pseudocode/samples/` does not. The member-name and descriptor
corpus is `../../../mapping/image26/` (202,366 names, 105,008 descriptors) with the
failed binding check documented in `member_summary.txt`.

## Regenerate

```bash
python tools/dump_native.py      work/exe/Runtime/astralis.dll native
python tools/devirt_native.py    work/exe/Runtime/astralis.dll native
python tools/dump_vmp0_table.py  work/exe/Runtime/astralis.dll native/devirt
python tools/carve_window.py     work/exe/Runtime/astralis.dll work/carve \
       --target 0x1e43d00 0x132ba928 --pad 0x20000
python tools/decompile_native.py --raw work/decompiled/raw --raw work/decompiled/vmp0raw \
       --out native/decompiled --image work/exe/Runtime/astralis.dll \
       --hot native/devirt/hot_functions.tsv
```

The decompiler step needs IDA with Hex-Rays; everything else is stdlib Python.
