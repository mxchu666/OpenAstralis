// Java_sun_nio_ch_FileDispatcherImpl_seek0
// rva 0x132a24c0  size 103  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_FileDispatcherImpl_seek0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        int a8,
        int a9,
        __int64 a10)
{
  __int64 v11; // rax
  __int64 v12; // rdi
  __int64 v13; // rsi
  __int64 v14; // rdi
  __int64 v15; // rsi

  v11 = sub_1932A2CD8(a1: a4, a2, a3: a5);
  if ( a6 < 0 )
    JUMPOUT(0x3264FC4E9LL);
  a10 = a6;
  if ( (unsigned int)MEMORY[0x79660](a1: v12, a2: v13, a3: a6, a4: v11, a5: &a10) != 0 )
    return a10;
  sub_1932B1580(a1: v14, a2: v15, a3: 534640, a4: v14);
  return -5;
}
