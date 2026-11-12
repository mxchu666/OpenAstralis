// Java_sun_nio_fs_WindowsNativeDispatcher_ReadDirectoryChangesW
// rva 0x132a6868  size 113  section .text  group jdk
// window base 0x1932a6868: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_ReadDirectoryChangesW(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        int a7,
        int a8,
        int a9,
        int a10,
        unsigned int a11,
        char a12)
{
  __int64 result; // rax
  __int64 v14; // rdi
  unsigned int v15; // eax
  __int64 v16; // rdi
  __int64 v17; // rsi

  result = MEMORY[0x793C0](a1, a2, a3: a6, a4: a5, a5: a11, a6: a12 == 1);
  if ( (_DWORD)result == 0 )
  {
    v15 = MEMORY[0x79758](a1: v14);
    return sub_1932A6F44(a1: v16, a2: v17, a3: v15, a4);
  }
  return result;
}
