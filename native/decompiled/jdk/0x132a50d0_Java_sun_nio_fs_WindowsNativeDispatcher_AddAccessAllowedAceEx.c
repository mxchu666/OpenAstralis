// Java_sun_nio_fs_WindowsNativeDispatcher_AddAccessAllowedAceEx
// rva 0x132a50d0  size 73  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_AddAccessAllowedAceEx(
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
        unsigned int a11)
{
  __int64 result; // rax
  __int64 v13; // rdi
  unsigned int v14; // eax
  __int64 v15; // rdi
  __int64 v16; // rsi

  result = MEMORY[0x791A0](a1, a2, a3: 2, a4: a5, a5: a6, a6: a11);
  if ( (_DWORD)result == 0 )
  {
    v14 = MEMORY[0x79758](a1: v13);
    return sub_1932A6F44(a1: v15, a2: v16, a3: v14, a4);
  }
  return result;
}
