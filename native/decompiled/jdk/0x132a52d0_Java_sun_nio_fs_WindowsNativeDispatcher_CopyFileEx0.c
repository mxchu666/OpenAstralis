// Java_sun_nio_fs_WindowsNativeDispatcher_CopyFileEx0
// rva 0x132a52d0  size 74  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_CopyFileEx0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  __int64 result; // rax
  __int64 v8; // rdi
  unsigned int v9; // eax
  __int64 v10; // rdi
  __int64 v11; // rsi

  result = MEMORY[0x793A8](a1, a2, a3: a6, a4: a5, a5: 0, a6: 0);
  if ( (_DWORD)result == 0 )
  {
    v9 = MEMORY[0x79758](a1: v8);
    return sub_1932A6F44(a1: v10, a2: v11, a3: v9, a4);
  }
  return result;
}
