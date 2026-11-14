// Java_sun_nio_ch_WindowsAsynchronousSocketChannelImpl_shutdown0
// rva 0x132a782c  size 47  section .text  group jdk
// window base 0x1932a782c: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_WindowsAsynchronousSocketChannelImpl_shutdown0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        unsigned int a6)
{
  __int64 result; // rax
  __int64 v8; // rdi
  __int64 v9; // rsi

  result = MEMORY[0x79960](a1, a2, a3: a6, a4: a5);
  if ( (_DWORD)result == -1 )
    return sub_1932B1580(a1: v8, a2: v9, a3: 536808, a4);
  return result;
}
