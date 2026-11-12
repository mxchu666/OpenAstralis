// Java_sun_nio_ch_Net_getInterface4
// rva 0x132a3440  size 106  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_Net_getInterface4(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5)
{
  int v6; // eax
  __int64 v7; // rdi
  __int64 v8; // rsi
  __int64 v9; // rdx
  __int64 v10; // rdi
  __int64 v11; // rsi
  unsigned int v12; // eax
  __int64 v13; // rdi
  __int64 v14; // rsi
  _DWORD v16[6]; // [rsp+30h] [rbp-18h] BYREF

  v6 = sub_1932A2CC4(a1, a2, a3: a5);
  if ( (unsigned int)MEMORY[0x799F8](a1: v7, a2: v8, a3: 0, a4: v6, a5: 9, a6: v16) != -1 )
    return MEMORY[0x79930](a1: v10, a2: v11, a3: v9, a4: v16[0]);
  v12 = MEMORY[0x79958](a1: v10, a2: v11);
  sub_1932AED0C(a1: v13, a2: v14, a3: v12, a4, a5: 535240);
  return 4294967291LL;
}
