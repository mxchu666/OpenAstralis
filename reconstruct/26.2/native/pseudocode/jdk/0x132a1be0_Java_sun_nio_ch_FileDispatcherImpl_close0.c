// Java_sun_nio_ch_FileDispatcherImpl_close0
// rva 0x132a1be0  size 57  section .text  group jdk
// window base 0x1932a1be0: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_FileDispatcherImpl_close0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  __int64 result; // rax
  __int64 v7; // rdx
  __int64 v8; // rdi
  __int64 v9; // rsi
  __int64 v10; // rdi
  __int64 v11; // rsi

  result = sub_1932A2CD8(a1, a2, a3: a5);
  if ( result != -1 )
  {
    result = MEMORY[0x797C8](a1: v8, a2: v9, a3: v7, a4: result);
    if ( (_DWORD)result == 0 )
      return sub_1932B1580(a1: v10, a2: v11, a3: 534792, a4);
  }
  return result;
}
