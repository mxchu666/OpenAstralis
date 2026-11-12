// Java_sun_nio_ch_FileDispatcherImpl_unmap0
// rva 0x132a2760  size 52  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_FileDispatcherImpl_unmap0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  __int64 v6; // rdi
  __int64 v7; // rsi

  if ( (unsigned int)MEMORY[0x795F8](a1, a2, a3, a4: a5) != 0 )
    return 0;
  sub_1932B1580(a1: v6, a2: v7, a3: 534920, a4);
  return 4294967291LL;
}
