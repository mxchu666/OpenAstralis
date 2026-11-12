// Java_java_net_Inet6AddressImpl_getLocalHostName
// rva 0x132aa778  size 106  section .text  group jdk
// window base 0x1932aa778: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_java_net_Inet6AddressImpl_getLocalHostName(__int64 a1, __int64 a2, __int64 a3, int a4)
{
  __int64 v5; // rdi
  __int64 v6; // rsi
  int v7; // r8d
  int v8; // r9d
  __int64 v9; // rdx
  __int64 v10; // rdi
  __int64 v11; // rsi
  __int64 v12; // r8
  __int64 v13; // r9
  __int64 v15; // [rsp+0h] [rbp-138h] BYREF
  _BYTE v16[256]; // [rsp+20h] [rbp-118h] BYREF
  __int64 v17; // [rsp+120h] [rbp-18h]

  if ( (unsigned int)MEMORY[0x79A08](a1, a2, a3: 256, a4: v16) == -1 )
    sub_1932CA27B(a1: v5, a2: v6, a3: 537264, a4: v16);
  sub_1932B105C(a1: v5, a2: v6, a3: (unsigned int)v16, a4, a5: v7, a6: v8, a7: v15);
  return sub_1932C8DE0(a1: v10, a2: v11, a3: v9, a4: (unsigned __int64)&v15 ^ v17, a5: v12, a6: v13);
}
