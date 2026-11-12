// Java_sun_nio_fs_WindowsNativeDispatcher_GetLogicalDrives
// rva 0x132a6038  size 54  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_GetLogicalDrives(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4)
{
  unsigned int v4; // ebx
  __int64 v5; // rdi
  unsigned int v6; // eax
  __int64 v7; // rdi
  __int64 v8; // rsi

  v4 = MEMORY[0x79320](a1: a4);
  if ( v4 == 0 )
  {
    v6 = MEMORY[0x79758](a1: v5);
    sub_1932A6F44(a1: v7, a2: v8, a3: v6, a4: v7);
  }
  return v4;
}
