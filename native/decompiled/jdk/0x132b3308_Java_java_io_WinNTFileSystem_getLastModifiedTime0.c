// Java_java_io_WinNTFileSystem_getLastModifiedTime0
// rva 0x132b3308  size 183  section .text  group jdk
// window base 0x1932b3308: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_java_io_WinNTFileSystem_getLastModifiedTime0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        int a9,
        unsigned __int64 a10)
{
  unsigned __int64 v10; // rbx
  __int64 result; // rax
  __int64 v12; // rdi
  __int64 v13; // rax
  __int64 v14; // rdx
  __int64 v15; // rsi
  __int64 v16; // rdi
  __int64 v17; // rdx
  __int64 v18; // rdi
  __int64 v19; // rsi

  v10 = 0;
  result = sub_1932B8E48(a1, a2, a3: a5, a4, a5: MEMORY[0x337630]);
  if ( result != 0 )
  {
    v13 = MEMORY[0x797B0](a1: v12, a2: result, a3: 0, a4: result, a5: 7, a6: 0);
    v16 = v13;
    if ( v13 != -1 )
    {
      if ( (unsigned int)MEMORY[0x79470](a1: v13, a2: v15, a3: 0, a4: v13, a5: 0, a6: &a10) != 0 )
      {
        v17 = (a10 * (unsigned __int128)0x346DC5D63886594BuLL) >> 64;
        v10 = a10 / 0x2710 - 11644473600000LL;
      }
      MEMORY[0x797C8](a1: v18, a2: v19, a3: v17, a4: v18);
    }
    MEMORY[0x79AE0](a1: v16, a2: v15, a3: v14, a4: v15);
    return v10;
  }
  return result;
}
