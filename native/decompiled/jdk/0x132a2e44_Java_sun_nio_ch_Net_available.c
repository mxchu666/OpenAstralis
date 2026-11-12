// Java_sun_nio_ch_Net_available
// rva 0x132a2e44  size 81  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_Net_available(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        int a7,
        int a8,
        int a9,
        unsigned int a10)
{
  int v11; // eax
  __int64 v12; // rdi
  __int64 v13; // rsi
  __int64 v14; // rdi
  __int64 v15; // rsi
  unsigned int v16; // eax
  __int64 v17; // rdi
  __int64 v18; // rsi

  v11 = sub_1932A2CC4(a1, a2, a3: a5);
  if ( (unsigned int)MEMORY[0x799A0](a1: v12, a2: v13, a3: 1074030207, a4: v11, a5: &a10) != -1 )
    return a10;
  v16 = MEMORY[0x79958](a1: v14, a2: v15);
  sub_1932AED0C(a1: v17, a2: v18, a3: v16, a4, a5: 535048);
  return 4294967291LL;
}
