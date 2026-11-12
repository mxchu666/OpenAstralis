// Java_sun_nio_fs_WindowsNativeDispatcher_CreateIoCompletionPort
// rva 0x132a5488  size 74  section .text  group jdk
// window base 0x1932a5488: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_CreateIoCompletionPort(
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
        __int64 a11)
{
  __int64 v11; // rbx
  __int64 v12; // rdi
  unsigned int v13; // eax
  __int64 v14; // rdi
  __int64 v15; // rsi

  v11 = MEMORY[0x79368](a1: a4, a2, a3: a6, a4: a5, a5: a11, a6: 0);
  if ( v11 == 0 )
  {
    v13 = MEMORY[0x79758](a1: v12);
    sub_1932A6F44(a1: v14, a2: v15, a3: v13, a4: v14);
  }
  return v11;
}
