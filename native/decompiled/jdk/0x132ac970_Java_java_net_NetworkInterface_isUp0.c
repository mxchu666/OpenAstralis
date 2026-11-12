// Java_java_net_NetworkInterface_isUp0
// rva 0x132ac970  size 164  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_java_net_NetworkInterface_isUp0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        int a6)
{
  __int64 v7; // rdx
  __int64 v8; // rdi
  __int64 v9; // rsi
  unsigned int v10; // eax
  __int64 v11; // rdx
  __int64 v12; // rdi
  __int64 v13; // rsi
  __int64 v14; // r8
  __int64 v15; // r9
  int v16; // edi
  int v17; // esi
  int v18; // r9d
  __int64 v20; // [rsp+0h] [rbp-588h] BYREF
  _BYTE v21[8]; // [rsp+20h] [rbp-568h] BYREF
  int v22; // [rsp+28h] [rbp-560h]
  __int64 v23; // [rsp+570h] [rbp-18h]

  sub_1932CA161(a1: a4, a2, a3: 0, a4: v21, a5: 1352);
  v22 = a6;
  v10 = MEMORY[0x79280](a1: v8, a2: v9, a3: v7, a4: v21);
  if ( v10 != 0 )
  {
    MEMORY[0x793D8](a1: v12, a2: v13, a3: v11, a4: v10);
    sub_1932AED04(a1: v16, a2: v17, a3: 534024, a4: v16, a5: 538216, a6: v18);
  }
  return sub_1932C8DE0(a1: v12, a2: v13, a3: v11, a4: (unsigned __int64)&v20 ^ v23, a5: v14, a6: v15);
}
