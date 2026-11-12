// Java_sun_nio_ch_WindowsAsynchronousSocketChannelImpl_write0
// rva 0x132a78a4  size 168  section .text  group jdk
// window base 0x1932a78a4: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_WindowsAsynchronousSocketChannelImpl_write0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        unsigned int a6,
        __int64 a7,
        __int64 a8,
        __int64 a9,
        int a10,
        __int64 a11,
        __int64 a12)
{
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 v15; // rdi
  __int64 v16; // rsi
  int v17; // eax
  __int64 v18; // rdi
  __int64 v19; // rsi

  sub_1932CA161(a1: a6, a2: a5, a3: 0, a4: a12, a5: 32);
  if ( (unsigned int)MEMORY[0x799A8](a1: v13, a2: v14, a3: a11, a4: v14, a5: (unsigned int)v13, a6: 0) != -1 )
    return 4294967294LL;
  v17 = MEMORY[0x79958](a1: v15, a2: v16);
  if ( v17 == 997 )
    return 4294967294LL;
  if ( v17 == 10058 )
    return 0xFFFFFFFFLL;
  sub_1932B1580(a1: v18, a2: v19, a3: 534560, a4);
  return 4294967291LL;
}
