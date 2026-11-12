// Java_sun_nio_ch_Iocp_postQueuedCompletionStatus
// rva 0x132a7194  size 54  section .text  group jdk
// window base 0x1932a7194: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_Iocp_postQueuedCompletionStatus(
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

  result = MEMORY[0x79378](a1, a2, a3: 0, a4: a5, a5: a6, a6: 0);
  if ( (_DWORD)result == 0 )
    return sub_1932B1580(a1: v8, a2: v9, a3: 536600, a4);
  return result;
}
