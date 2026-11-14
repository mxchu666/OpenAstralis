// Java_java_io_WinNTFileSystem_createDirectory0
// rva 0x132b2fc4  size 71  section .text  group jdk
// window base 0x1932b2fc4: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
char __fastcall Java_java_io_WinNTFileSystem_createDirectory0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  __int64 v5; // rax
  __int64 v6; // rsi
  int v7; // ebx
  __int64 v8; // rdx
  __int64 v9; // rdi
  __int64 v10; // rsi

  v5 = sub_1932B8E48(a1, a2, a3: a5, a4, a5: MEMORY[0x337630]);
  if ( v5 != 0 )
  {
    v7 = MEMORY[0x79620](a1: v5, a2: v6, a3: 0, a4: v5);
    MEMORY[0x79AE0](a1: v9, a2: v10, a3: v8, a4: v9);
    LOBYTE(v5) = v7 != 0;
  }
  return v5;
}
