// Java_sun_nio_fs_WindowsNativeDispatcher_GetFileAttributes0
// rva 0x132a5ca8  size 58  section .text  group jdk
// window base 0x1932a5ca8: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_GetFileAttributes0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  unsigned int v5; // ebx
  __int64 v6; // rdi
  unsigned int v7; // eax
  __int64 v8; // rdi
  __int64 v9; // rsi

  v5 = MEMORY[0x79300](a1: a4, a2, a3, a4: a5);
  if ( v5 == -1 )
  {
    v7 = MEMORY[0x79758](a1: v6);
    sub_1932A6F44(a1: v8, a2: v9, a3: v7, a4: v8);
  }
  return v5;
}
