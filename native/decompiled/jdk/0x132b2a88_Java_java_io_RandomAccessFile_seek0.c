// Java_java_io_RandomAccessFile_seek0
// rva 0x132b2a88  size 111  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_java_io_RandomAccessFile_seek0(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5)
{
  __int64 v6; // rax
  __int64 v7; // rdi
  __int64 v8; // rsi
  int v9; // r9d
  __int64 v10; // rdx
  __int64 result; // rax
  __int64 v12; // rdi
  __int64 v13; // rsi

  v6 = sub_1932B8E78(a1: a5, a2, a3, a4, a5: MEMORY[0x337F70]);
  if ( v6 == -1 )
  {
    v10 = 543576;
    return sub_1932B1570(a1: v7, a2: v8, a3: v10, a4);
  }
  if ( v7 < 0 )
  {
    v10 = 543632;
    return sub_1932B1570(a1: v7, a2: v8, a3: v10, a4);
  }
  result = sub_1932B9014(a1: v7, a2: v8, a3: v7, a4: v6, a5: 0, a6: v9);
  if ( result == -1 )
    return sub_1932B1580(a1: v12, a2: v13, a3: 534608, a4);
  return result;
}
