// Java_java_io_RandomAccessFile_setLength0
// rva 0x132b2af8  size 172  section .text  group jdk
// window base 0x1932b2af8: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_java_io_RandomAccessFile_setLength0(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5)
{
  __int64 v6; // rax
  __int64 v7; // rdi
  __int64 v8; // rsi
  int v9; // r9d
  int v10; // ebx
  __int64 result; // rax
  __int64 v12; // rdi
  __int64 v13; // rsi
  int v14; // r8d
  int v15; // r9d
  int v16; // r9d
  int v17; // edx
  int v18; // r8d

  v6 = sub_1932B8E78(a1, a2: a4, a3, a4, a5: MEMORY[0x337F70]);
  v10 = v6;
  if ( v6 == -1 )
    return sub_1932B1570(a1: v7, a2: v8, a3: 543576, a4: v8);
  v12 = sub_1932B9014(a1: v7, a2: v8, a3: 0, a4: v6, a5: 1, a6: v9);
  if ( v12 == -1 || (unsigned int)sub_1932B90A4(a1: v12, a2: v13, a3: a5, a4: v10, a5: v14, a6: v15) == -1 )
    return sub_1932B1580(a1: v12, a2: v13, a3: 543656, a4: v13);
  if ( v12 <= a5 )
  {
    v18 = 0;
    v17 = v12;
  }
  else
  {
    v17 = 0;
    v18 = 2;
  }
  result = sub_1932B9014(a1: v12, a2: v13, a3: v17, a4: v10, a5: v18, a6: v16);
  if ( result == -1 )
    return sub_1932B1580(a1: v12, a2: v13, a3: 543656, a4: v13);
  return result;
}
