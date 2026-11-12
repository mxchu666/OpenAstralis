// Java_sun_nio_fs_WindowsNativeDispatcher_OpenThreadToken
// rva 0x132a67d0  size 89  section .text  group jdk
// window base 0x1932a67d0: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_OpenThreadToken(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        unsigned int a6,
        int a7,
        int a8,
        __int64 a9,
        int a10,
        char a11)
{
  __int64 v12; // rdi
  __int64 v13; // rdi
  unsigned int v15; // eax
  __int64 v16; // rdi
  __int64 v17; // rsi

  if ( (unsigned int)MEMORY[0x791B0](a1, a2, a3: a6, a4: a5, a5: a11 == 1, a6: &a9) == 0 )
  {
    if ( (unsigned int)MEMORY[0x79758](a1: v12) == 1008 )
      return 0;
    v15 = MEMORY[0x79758](a1: v13);
    sub_1932A6F44(a1: v16, a2: v17, a3: v15, a4);
  }
  return a9;
}
