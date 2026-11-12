// Java_java_net_NetworkInterface_getByIndex0
// rva 0x132ac17c  size 113  section .text  group jdk
// window base 0x1932ac17c: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_java_net_NetworkInterface_getByIndex0(__int64 a1, __int64 a2, __int64 a3, __int64 a4, int a5)
{
  __int64 v6; // rdx
  __int64 v7; // rdi
  __int64 v8; // rsi
  __int64 v9; // r8
  __int64 v10; // r9
  __int64 v12; // [rsp+0h] [rbp-588h] BYREF
  int v13; // [rsp+8h] [rbp-580h]
  __int64 v14; // [rsp+10h] [rbp-578h]
  __int64 v15; // [rsp+18h] [rbp-570h]
  _BYTE v16[8]; // [rsp+20h] [rbp-568h] BYREF
  int v17; // [rsp+28h] [rbp-560h]
  __int64 v18; // [rsp+570h] [rbp-18h]

  sub_1932CA161(a1: a4, a2, a3: 0, a4: v16, a5: 1352);
  if ( a5 != 0 )
  {
    v17 = a5;
    sub_1932AD1F4(a1: v7, a2: v8, a3: (unsigned int)v16, a4: v7, a5: v9, a6: v10, a7: v12, a8: v13, a9: v14, a10: v15);
  }
  return sub_1932C8DE0(a1: v7, a2: v8, a3: v6, a4: (unsigned __int64)&v12 ^ v18, a5: v9, a6: v10);
}
