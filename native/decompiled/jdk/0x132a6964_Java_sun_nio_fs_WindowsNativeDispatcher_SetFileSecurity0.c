// Java_sun_nio_fs_WindowsNativeDispatcher_SetFileSecurity0
// rva 0x132a6964  size 55  section .text  group jdk
// window base 0x1932a6964: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_SetFileSecurity0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        unsigned int a6,
        int a7,
        int a8,
        int a9,
        int a10,
        __int64 a11)
{
  __int64 result; // rax
  __int64 v13; // rdi
  unsigned int v14; // eax
  __int64 v15; // rdi
  __int64 v16; // rsi

  result = MEMORY[0x790A8](a1, a2, a3: a6, a4: a5, a5: a11);
  if ( (_DWORD)result == 0 )
  {
    v14 = MEMORY[0x79758](a1: v13);
    return sub_1932A6F44(a1: v15, a2: v16, a3: v14, a4);
  }
  return result;
}
