// Java_java_io_FileInputStream_length0
// rva 0x132b26a4  size 98  section .text  group jdk
// window base 0x1932b26a4: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_java_io_FileInputStream_length0(__int64 a1, __int64 a2, __int64 a3, __int64 a4)
{
  __int64 v4; // rax
  int v5; // edx
  __int64 v6; // rdi
  __int64 v7; // rsi
  int v8; // r8d
  int v9; // r9d
  __int64 v11; // rbx
  __int64 v12; // rdi
  __int64 v13; // rsi

  v4 = sub_1932B8E78(a1: a4, a2, a3, a4, a5: MEMORY[0x337F80]);
  if ( v4 == -1 )
  {
    sub_1932B1570(a1: v6, a2: v7, a3: 543576, a4: v6);
    return -1;
  }
  else
  {
    v11 = sub_1932B8FF0(a1: v6, a2: v7, a3: v5, a4: v4, a5: v8, a6: v9);
    if ( v11 == -1 )
      sub_1932B1580(a1: v12, a2: v13, a3: 543592, a4: v12);
    return v11;
  }
}
