// Java_sun_nio_fs_WindowsNativeDispatcher_FindFirstFile1
// rva 0x132a5770  size 64  section .text  group jdk
// window base 0x1932a5770: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_FindFirstFile1(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  __int64 v6; // rbx
  __int64 v7; // rdi
  unsigned int v8; // eax
  __int64 v9; // rdi
  __int64 v10; // rsi

  v6 = MEMORY[0x792E0](a1: a4, a2, a3: a6, a4: a5);
  if ( v6 == -1 )
  {
    v8 = MEMORY[0x79758](a1: v7);
    sub_1932A6F44(a1: v9, a2: v10, a3: v8, a4: v9);
  }
  return v6;
}
