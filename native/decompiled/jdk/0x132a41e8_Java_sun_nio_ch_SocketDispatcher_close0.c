// Java_sun_nio_ch_SocketDispatcher_close0
// rva 0x132a41e8  size 44  section .text  group jdk
// window base 0x1932a41e8: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_SocketDispatcher_close0(__int64 a1, __int64 a2, __int64 a3, __int64 a4, int a5)
{
  __int64 result; // rax
  __int64 v7; // rdi
  __int64 v8; // rsi

  result = MEMORY[0x79A00](a1, a2, a3, a4: a5);
  if ( (_DWORD)result == -1 )
    return sub_1932B1580(a1: v7, a2: v8, a3: 535496, a4);
  return result;
}
