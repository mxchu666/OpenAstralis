// Java_sun_nio_ch_Net_blockOrUnblock6
// rva 0x132a301c  size 86  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_Net_blockOrUnblock6(
        int a1,
        int a2,
        __int64 a3,
        __int64 a4,
        char a5,
        int a6,
        int a7,
        int a8,
        int a9,
        int a10,
        __int64 a11)
{
  __int64 v12; // rdi
  __int64 v13; // rsi
  unsigned int v14; // eax
  __int64 v15; // rdi
  __int64 v16; // rsi

  if ( (unsigned int)sub_1932A4104(a1, a2, a3: a6, a4, a5: 44 - (unsigned int)(a5 != 0), a6: a11) == -1 )
  {
    v14 = MEMORY[0x79958](a1: v12, a2: v13);
    sub_1932AED0C(a1: v15, a2: v16, a3: v14, a4, a5: 535288);
  }
  return 0;
}
