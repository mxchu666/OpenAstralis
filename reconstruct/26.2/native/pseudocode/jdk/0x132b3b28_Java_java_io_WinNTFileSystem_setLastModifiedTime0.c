// Java_java_io_WinNTFileSystem_setLastModifiedTime0
// rva 0x132b3b28  size 203  section .text  group jdk
// window base 0x1932b3b28: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
char __fastcall Java_java_io_WinNTFileSystem_setLastModifiedTime0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  __int64 v7; // rax
  __int64 v8; // rdi
  __int64 v9; // rdx
  __int64 v10; // rbp
  __int64 v11; // rdi
  __int64 v12; // rsi
  int v13; // ebx
  __int64 v14; // rdx
  __int64 v15; // rdi
  __int64 v16; // rsi
  char v17; // di
  __int64 v19[3]; // [rsp+40h] [rbp-18h] BYREF

  v7 = sub_1932B8E48(a1: 0, a2, a3: a5, a4, a5: MEMORY[0x337630]);
  if ( v7 != 0 )
  {
    v10 = MEMORY[0x797B0](a1: v8, a2: v7, a3: 256, a4: v7, a5: 3, a6: 0);
    if ( v10 != -1 )
    {
      v19[0] = 10000 * (a6 + 11644473600000LL);
      v13 = MEMORY[0x79350](a1: v11, a2: v12, a3: 0, a4: v10, a5: 0, a6: v19);
      MEMORY[0x797C8](a1: v15, a2: v16, a3: v14, a4: v10);
      LOBYTE(v11) = v13 != 0;
    }
    MEMORY[0x79AE0](a1: v11, a2: v12, a3: v9, a4: v12);
    LOBYTE(v7) = v17;
  }
  return v7;
}
