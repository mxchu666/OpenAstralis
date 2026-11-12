// Java_sun_nio_ch_Net_setInterface6
// rva 0x132a3ef0  size 86  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_Net_setInterface6(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        int a6,
        int a7,
        int a8,
        int a9,
        int a10)
{
  int v11; // eax
  __int64 v12; // rdi
  __int64 v13; // rsi
  __int64 result; // rax
  __int64 v15; // rdi
  __int64 v16; // rsi
  unsigned int v17; // eax
  __int64 v18; // rdi
  __int64 v19; // rsi

  a10 = a6;
  v11 = sub_1932A2CC4(a1, a2, a3: a5);
  result = MEMORY[0x799F0](a1: v12, a2: v13, a3: 41, a4: v11, a5: 9, a6: &a10);
  if ( (_DWORD)result == -1 )
  {
    v17 = MEMORY[0x79958](a1: v15, a2: v16);
    return sub_1932AED0C(a1: v18, a2: v19, a3: v17, a4, a5: 535272);
  }
  return result;
}
