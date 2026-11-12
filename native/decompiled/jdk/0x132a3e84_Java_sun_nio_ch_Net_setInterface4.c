// Java_sun_nio_ch_Net_setInterface4
// rva 0x132a3e84  size 107  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_Net_setInterface4(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        unsigned int a6)
{
  __int64 v7; // rdi
  __int64 v8; // rsi
  int v9; // eax
  __int64 v10; // rdi
  __int64 v11; // rsi
  __int64 result; // rax
  __int64 v13; // rdi
  __int64 v14; // rsi
  unsigned int v15; // eax
  __int64 v16; // rdi
  __int64 v17; // rsi
  _DWORD v18[6]; // [rsp+30h] [rbp-18h] BYREF

  v18[0] = MEMORY[0x79940](a1: a4, a2, a3, a4: a6);
  v9 = sub_1932A2CC4(a1: v7, a2: v8, a3: a5);
  result = MEMORY[0x799F0](a1: v10, a2: v11, a3: 0, a4: v9, a5: 9, a6: v18);
  if ( (_DWORD)result == -1 )
  {
    v15 = MEMORY[0x79958](a1: v13, a2: v14);
    return sub_1932AED0C(a1: v16, a2: v17, a3: v15, a4: v16, a5: 535272);
  }
  return result;
}
