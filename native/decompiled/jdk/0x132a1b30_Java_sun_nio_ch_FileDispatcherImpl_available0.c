// Java_sun_nio_ch_FileDispatcherImpl_available0
// rva 0x132a1b30  size 174  section .text  group jdk
// window base 0x1932a1b30: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_FileDispatcherImpl_available0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        __int64 a9,
        __int64 a10)
{
  __int64 v11; // rax
  unsigned int v12; // ebx
  __int64 v13; // rdx
  __int64 v14; // rsi
  __int64 v15; // rdi
  __int64 v16; // rsi
  __int64 v17; // rdi
  __int64 v18; // rsi
  _QWORD v20[3]; // [rsp+20h] [rbp-18h] BYREF

  v11 = sub_1932A2CD8(a1, a2, a3: a5);
  v12 = 0;
  if ( (unsigned int)MEMORY[0x79680](a1: v11, a2: v14, a3: v13, a4: v11) != 1 )
    return v12;
  if ( (unsigned int)MEMORY[0x79660](a1: v15, a2: v16, a3: 0, a4: v15, a5: &a10) != 0
    && (unsigned int)MEMORY[0x79688](a1: v17, a2: a10, a3: v20, a4: v17) != 0 )
  {
    if ( v20[0] - v18 <= 0x7FFFFFFF )
    {
      if ( v20[0] - v18 >= 0 )
        JUMPOUT(0x3264FBBC3LL);
    }
    else
    {
      return 0x7FFFFFFF;
    }
    return v12;
  }
  sub_1932B1580(a1: v17, a2: v18, a3: 534720, a4);
  return 4294967291LL;
}
