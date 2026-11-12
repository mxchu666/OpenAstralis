// Java_sun_nio_fs_WindowsNativeDispatcher_GetOverlappedResult
// rva 0x132a6070  size 73  section .text  group jdk
// window base 0x1932a6070: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_GetOverlappedResult(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  __int64 v7; // rdi
  unsigned int v8; // eax
  __int64 v9; // rdi
  __int64 v10; // rsi
  unsigned int v12[6]; // [rsp+20h] [rbp-18h] BYREF

  v12[0] = 0xFFFFFFFF;
  if ( (unsigned int)MEMORY[0x79648](a1, a2, a3: a6, a4: a5, a5: v12, a6: 1) == 0 )
  {
    v8 = MEMORY[0x79758](a1: v7);
    sub_1932A6F44(a1: v9, a2: v10, a3: v8, a4);
  }
  return v12[0];
}
