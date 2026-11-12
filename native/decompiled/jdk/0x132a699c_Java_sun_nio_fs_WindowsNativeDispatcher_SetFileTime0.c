// Java_sun_nio_fs_WindowsNativeDispatcher_SetFileTime0
// rva 0x132a699c  size 105  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_SetFileTime0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        __int64 a9,
        __int64 a10,
        __int64 a11,
        __int64 a12)
{
  __int64 result; // rax
  __int64 v14; // rdi
  unsigned int v15; // eax
  __int64 v16; // rdi
  __int64 v17; // rsi

  if ( a12 != -1 )
    JUMPOUT(0x3265009C5LL);
  if ( a11 != -1 )
    JUMPOUT(0x3265009D8LL);
  if ( a6 != -1 )
    JUMPOUT(0x3265009E0LL);
  result = MEMORY[0x79350](a1: 0, a2, a3: 0, a4: a5, a5: 0, a6: 0);
  if ( (_DWORD)result == 0 )
  {
    v15 = MEMORY[0x79758](a1: v14);
    return sub_1932A6F44(a1: v16, a2: v17, a3: v15, a4);
  }
  return result;
}
