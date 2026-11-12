// Java_sun_nio_fs_WindowsNativeDispatcher_GetFileSizeEx
// rva 0x132a5db0  size 54  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_GetFileSizeEx(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        int a7,
        int a8,
        __int64 a9)
{
  __int64 v10; // rdi
  unsigned int v11; // eax
  __int64 v12; // rdi
  __int64 v13; // rsi

  if ( (unsigned int)MEMORY[0x79688](a1, a2, a3: &a9, a4: a5) == 0 )
  {
    v11 = MEMORY[0x79758](a1: v10);
    sub_1932A6F44(a1: v12, a2: v13, a3: v11, a4);
  }
  return a9;
}
