// Java_java_io_FileInputStream_skip0
// rva 0x132b27c0  size 170  section .text  group jdk
// window base 0x1932b27c0: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_java_io_FileInputStream_skip0(__int64 a1, __int64 a2, __int64 a3, __int64 a4, int a5)
{
  __int64 v6; // rbx
  __int64 v7; // rax
  __int64 v8; // rdi
  __int64 v9; // rsi
  int v10; // r9d
  int v11; // ebp
  __int64 v13; // rdi
  __int64 v14; // rsi
  int v15; // r9d

  v6 = 0;
  v7 = sub_1932B8E78(a1: a4, a2, a3, a4, a5: MEMORY[0x337F80]);
  v11 = v7;
  if ( v7 == -1 )
  {
    sub_1932B1570(a1: v8, a2: v9, a3: 543576, a4: v8);
    return 0;
  }
  else
  {
    v14 = sub_1932B9014(a1: v8, a2: v9, a3: 0, a4: v7, a5: 1, a6: v10);
    if ( v14 == -1 || (v6 = sub_1932B9014(a1: v13, a2: v14, a3: a5, a4: v11, a5: 1, a6: v15)) == -1 )
      sub_1932B1580(a1: v13, a2: v14, a3: 543616, a4: v13);
    return v6 - v14;
  }
}
