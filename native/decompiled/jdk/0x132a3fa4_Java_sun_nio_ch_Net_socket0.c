// Java_sun_nio_ch_Net_socket0
// rva 0x132a3fa4  size 352  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_Net_socket0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        char a5,
        char a6,
        __int64 a7,
        int a8,
        int a9,
        int a10,
        int a11,
        char a12)
{
  __int64 v14; // rax
  __int64 v15; // rsi
  int v16; // edx
  __int64 v17; // rdi
  __int64 v18; // rsi
  int v19; // r8d
  int v20; // r9d
  unsigned int v21; // eax
  __int64 v22; // rdi
  __int64 v23; // rsi
  unsigned int v24; // eax
  __int64 v25; // rsi

  LOBYTE(a2) = a6;
  v14 = MEMORY[0x799E8](a1, a2, a3: 2 - (unsigned int)(a6 != 0), a4: a5 != 0 ? 23 : 2, a5: 0);
  if ( v14 == -1 )
  {
    v21 = MEMORY[0x79958](a1: -1, a2: v15);
    sub_1932AED0C(a1: v22, a2: v23, a3: v21, a4, a5: 535164);
    if ( (_BYTE)v18 == 0 )
      return (unsigned int)v17;
  }
  else
  {
    MEMORY[0x79628](a1: v14, a2: v15, a3: 1, a4: v14);
    if ( a5 != 0 )
    {
      a9 = 0;
      MEMORY[0x799F0](a1: v17, a2: v18, a3: 41, a4: v17, a5: 27, a6: &a9);
    }
    if ( (_BYTE)v18 == 0 )
    {
      a10 = 0;
      a9 = 0;
      MEMORY[0x799B8](a1: v17, a2: v18, a3: 2550136844LL, a4: v17, a5: &a10, a6: 4);
      return (unsigned int)v17;
    }
  }
  if ( a12 != 0 && MEMORY[0x3367B0] != 0 )
  {
    v24 = sub_1932AE7F4(a1: v17, a2: v18, a3: v16, a4: v17, a5: v19, a6: v20);
    if ( v24 != 0 )
    {
      if ( v24 == 10045 )
        MEMORY[0x3367B0] = 0;
      else
        sub_1932AED0C(a1: v17, a2: v25, a3: v24, a4, a5: 535176);
    }
  }
  return (unsigned int)v17;
}
