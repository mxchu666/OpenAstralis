// Java_java_io_WinNTFileSystem_createFileExclusively0
// rva 0x132b300c  size 214  section .text  group jdk
// window base 0x1932b300c: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
char __fastcall Java_java_io_WinNTFileSystem_createFileExclusively0(
        int a1,
        __int64 a2,
        __int64 a3,
        int a4,
        int a5,
        int a6)
{
  __int64 v6; // rax
  __int64 v7; // rdx
  __int64 v8; // rdi
  __int64 v9; // rsi
  __int64 v10; // rbx
  __int64 v11; // rdx
  __int64 v12; // rdi
  __int64 v13; // rsi
  __int64 v14; // rdx
  __int64 v15; // rdi
  __int64 v16; // rsi
  unsigned int v17; // eax
  __int64 v18; // rdi
  __int64 v19; // rsi
  __int64 v21; // rdx
  __int64 v22; // rdi
  __int64 v23; // rsi

  v6 = sub_1932B9260(a1, a2: a4, a3: a5, a4, a5: 0, a6);
  v10 = v6;
  if ( v6 == 0 )
    return 0;
  if ( (unsigned int)sub_1932B41CC(a1: v8, a2: v9, a3: v7, a4: v6) != 0 )
  {
LABEL_8:
    MEMORY[0x79AE0](a1: v12, a2: v13, a3: v11, a4: v10);
    return 0;
  }
  v15 = MEMORY[0x797B0](a1: v12, a2: v13, a3: 3221225472LL, a4: v10, a5: 3, a6: 0);
  if ( v15 == -1 )
  {
    v17 = MEMORY[0x79758](a1: -1);
    v12 = v17;
    if ( v17 != 80 && v17 != 183 && (unsigned int)MEMORY[0x79300](a1: v17, a2: v13, a3: v11, a4: v10) == -1 )
    {
      MEMORY[0x793D8](a1: v12, a2: v13, a3: v11, a4: (unsigned int)v12);
      sub_1932B1580(a1: v18, a2: v19, a3: 543768, a4: v19);
    }
    goto LABEL_8;
  }
  MEMORY[0x79AE0](a1: v15, a2: v16, a3: v14, a4: v10);
  MEMORY[0x797C8](a1: v22, a2: v23, a3: v21, a4: v22);
  return 1;
}
