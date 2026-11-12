// Java_sun_nio_ch_WindowsAsynchronousFileChannelImpl_readFile
// rva 0x132a7260  size 128  section .text  group jdk
// window base 0x1932a7260: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_WindowsAsynchronousFileChannelImpl_readFile(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        int a7,
        int a8,
        int a9,
        int a10,
        unsigned int a11,
        __int64 a12,
        __int64 a13)
{
  __int64 v14; // rdi
  int v15; // eax
  __int64 v16; // rdi
  __int64 v17; // rsi

  *(_QWORD *)(a13 + 16) = a12;
  *(_QWORD *)(a13 + 24) = 0;
  if ( (unsigned int)MEMORY[0x79670](a1, a2, a3: a6, a4: a5, a5: a11, a6: 0) != 0 )
    return 4294967294LL;
  v15 = MEMORY[0x79758](a1: v14);
  if ( v15 == 997 )
    return 4294967294LL;
  if ( v15 == 38 )
    return 0xFFFFFFFFLL;
  sub_1932B1580(a1: v16, a2: v17, a3: 536632, a4);
  return 4294967291LL;
}
