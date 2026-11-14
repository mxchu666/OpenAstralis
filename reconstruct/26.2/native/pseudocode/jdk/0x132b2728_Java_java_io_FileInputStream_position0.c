// Java_java_io_FileInputStream_position0
// rva 0x132b2728  size 104  section .text  group jdk
// window base 0x1932b2728: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_java_io_FileInputStream_position0(__int64 a1, __int64 a2, __int64 a3, __int64 a4)
{
  __int64 v5; // rax
  __int64 v6; // rdi
  __int64 v7; // rsi
  int v8; // r9d
  __int64 v10; // rdi
  __int64 v11; // rsi

  v5 = sub_1932B8E78(a1, a2, a3, a4, a5: MEMORY[0x337F80]);
  if ( v5 == -1 )
  {
    sub_1932B1570(a1: v6, a2: v7, a3: 543576, a4);
    return -1;
  }
  else
  {
    v10 = sub_1932B9014(a1: v6, a2: v7, a3: 0, a4: v5, a5: 1, a6: v8);
    if ( v10 == -1 )
      sub_1932B1580(a1: -1, a2: v11, a3: 534608, a4);
    return v10;
  }
}
