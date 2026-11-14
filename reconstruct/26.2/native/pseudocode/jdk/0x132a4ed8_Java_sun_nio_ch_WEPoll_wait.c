// Java_sun_nio_ch_WEPoll_wait
// rva 0x132a4ed8  size 63  section .text  group jdk
// window base 0x1932a4ed8: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_WEPoll_wait(
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
        int a11,
        int a12)
{
  __int64 result; // rax
  __int64 v14; // rdi
  __int64 v15; // rsi

  result = sub_1932A807C(a1, a2, a3: a6, a4: a5, a5: a11, a6: a12);
  if ( (int)result < 0 )
  {
    sub_1932B1580(a1: v14, a2: v15, a3: 535624, a4);
    return 4294967291LL;
  }
  return result;
}
