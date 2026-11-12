// Java_sun_nio_ch_WindowsAsynchronousFileChannelImpl_lockFile
// rva 0x132a71cc  size 147  section .text  group jdk
// window base 0x1932a71cc: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_WindowsAsynchronousFileChannelImpl_lockFile(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        int a8,
        int a9,
        int a10,
        __int64 a11,
        char a12,
        __int64 a13)
{
  __int64 v13; // rdi
  __int64 v14; // rdi
  __int64 v15; // rsi

  *(_QWORD *)(a13 + 16) = a6;
  *(_QWORD *)(a13 + 24) = 0;
  if ( (unsigned int)MEMORY[0x79678](a1: a4, a2, a3: a12 != 1 ? 2 : 0, a4: a5, a5: 0) != 0 )
    return 0;
  if ( (unsigned int)MEMORY[0x79758](a1: v13) == 997 )
    return 4294967294LL;
  sub_1932B1580(a1: v14, a2: v15, a3: 536672, a4: v14);
  return 4294967291LL;
}
