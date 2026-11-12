// Java_sun_nio_fs_WindowsNativeDispatcher_GetFileSecurity0
// rva 0x132a5d48  size 103  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_GetFileSecurity0(
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
        __int64 a11,
        unsigned int a12)
{
  __int64 v13; // rdi
  __int64 v14; // rdi
  unsigned int v16; // eax
  __int64 v17; // rdi
  __int64 v18; // rsi

  if ( (unsigned int)MEMORY[0x79000](a1, a2, a3: a6, a4: a5, a5: a11, a6: a12) != 0 )
    return a12;
  if ( (unsigned int)MEMORY[0x79758](a1: v13) != 122 )
  {
    v16 = MEMORY[0x79758](a1: v14);
    sub_1932A6F44(a1: v17, a2: v18, a3: v16, a4);
  }
  return 0;
}
