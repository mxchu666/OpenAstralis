// Java_sun_nio_ch_WindowsAsynchronousFileChannelImpl_writeFile
// rva 0x132a72e0  size 118  section .text  group jdk
// window base 0x1932a72e0: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_WindowsAsynchronousFileChannelImpl_writeFile(
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
  __int64 v15; // rdi
  __int64 v16; // rsi

  *(_QWORD *)(a13 + 16) = a12;
  *(_QWORD *)(a13 + 24) = 0;
  if ( (unsigned int)MEMORY[0x795C0](a1, a2, a3: a6, a4: a5, a5: a11, a6: 0) != 0
    || (unsigned int)MEMORY[0x79758](a1: v14) == 997 )
  {
    return 4294967294LL;
  }
  sub_1932B1580(a1: v15, a2: v16, a3: 536648, a4);
  return 4294967291LL;
}
