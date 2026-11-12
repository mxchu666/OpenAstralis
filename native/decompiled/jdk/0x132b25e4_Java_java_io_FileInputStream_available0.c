// Java_java_io_FileInputStream_available0
// rva 0x132b25e4  size 107  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_java_io_FileInputStream_available0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        int a7,
        int a8,
        __int64 a9)
{
  __int64 v10; // rax
  __int64 v11; // rdi
  __int64 v12; // rsi
  int v13; // r8d
  int v14; // r9d
  __int64 v15; // rdi
  __int64 v16; // rsi
  __int64 result; // rax

  v10 = sub_1932B8E78(a1, a2, a3, a4, a5: MEMORY[0x337F80]);
  if ( v10 == -1 )
  {
    sub_1932B1570(a1: v11, a2: v12, a3: 543576, a4);
    return 0;
  }
  if ( (unsigned int)sub_1932B8F0C(a1: v11, a2: v12, a3: (unsigned int)&a9, a4: v10, a5: v13, a6: v14) == 0 )
  {
    sub_1932B1580(a1: v15, a2: v16, a3: 0, a4);
    return 0;
  }
  result = a9;
  if ( a9 > 0x7FFFFFFF )
    return 0x7FFFFFFF;
  if ( a9 < 0 )
    return 0;
  return result;
}
