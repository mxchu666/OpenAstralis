// Java_sun_nio_fs_WindowsNativeDispatcher_GetSecurityDescriptorOwner
// rva 0x132a61cc  size 62  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_GetSecurityDescriptorOwner(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        int a7,
        int a8,
        char a9,
        __int64 a10)
{
  __int64 v11; // rdi
  unsigned int v12; // eax
  __int64 v13; // rdi
  __int64 v14; // rsi

  if ( (unsigned int)MEMORY[0x79080](a1, a2, a3: &a10, a4: a5, a5: &a9) == 0 )
  {
    v12 = MEMORY[0x79758](a1: v11);
    sub_1932A6F44(a1: v13, a2: v14, a3: v12, a4);
  }
  return a10;
}
