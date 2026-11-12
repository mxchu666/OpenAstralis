// Java_sun_nio_ch_Iocp_createIoCompletionPort
// rva 0x132a6f80  size 75  section .text  group jdk
// window base 0x1932a6f80: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_Iocp_createIoCompletionPort(
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
        int a11,
        unsigned int a12)
{
  __int64 v12; // rbx
  __int64 v13; // rdi
  __int64 v14; // rsi

  v12 = MEMORY[0x79368](a1: a4, a2, a3: a6, a4: a5, a5: a11, a6: a12);
  if ( v12 == 0 )
    sub_1932B1580(a1: v13, a2: v14, a3: 536528, a4: v13);
  return v12;
}
