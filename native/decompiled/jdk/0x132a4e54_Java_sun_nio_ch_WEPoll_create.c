// Java_sun_nio_ch_WEPoll_create
// rva 0x132a4e54  size 57  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_WEPoll_create(__int64 a1, __int64 a2, __int64 a3, __int64 a4)
{
  __int64 v4; // rbx
  __int64 v5; // rdi
  __int64 v6; // rsi

  v4 = sub_1932A7F84(a1: a4, a2, a3, a4: 0);
  if ( v4 == 0 )
    sub_1932B1580(a1: v5, a2: v6, a3: 535600, a4: v5);
  return v4;
}
