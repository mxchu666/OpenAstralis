// Java_sun_nio_ch_WEPoll_ctl
// rva 0x132a4e90  size 59  section .text  group jdk
// window base 0x1932a4e90: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_WEPoll_ctl(
        int a1,
        int a2,
        __int64 a3,
        __int64 a4,
        int a5,
        int a6,
        int a7,
        int a8,
        int a9,
        int a10,
        __int64 a11,
        int a12)
{
  int v12; // eax
  __int64 v13; // rdx
  __int64 v14; // rdi
  __int64 v15; // rsi
  unsigned int v16; // ecx
  int v18; // [rsp+20h] [rbp-18h] BYREF
  __int64 v19; // [rsp+28h] [rbp-10h]

  v19 = a11;
  v18 = a12;
  v12 = sub_1932A7FA8(a1, a2, a3: a6, a4: a5, a5: a11, a6: (unsigned int)&v18);
  v16 = 0;
  if ( v12 != 0 )
    return *(unsigned int *)MEMORY[0x79B48](a1: v14, a2: v15, a3: v13, a4: 0);
  return v16;
}
