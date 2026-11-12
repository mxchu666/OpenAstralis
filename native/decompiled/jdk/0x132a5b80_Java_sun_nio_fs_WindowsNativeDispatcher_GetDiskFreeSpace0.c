// Java_sun_nio_fs_WindowsNativeDispatcher_GetDiskFreeSpace0
// rva 0x132a5b80  size 114  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_GetDiskFreeSpace0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        int a8,
        unsigned int a9)
{
  __int64 v10; // rdi
  __int64 v11; // rsi
  unsigned int v12; // eax
  __int64 v13; // rdi
  __int64 v14; // rsi
  int v16; // [rsp+34h] [rbp-14h] BYREF
  __int64 v17; // [rsp+38h] [rbp-10h] BYREF

  if ( (unsigned int)MEMORY[0x797D8](a1: a6, a2, a3: &v17, a4: a5, a5: &a9, a6: &v16) != 0 )
    return (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 880LL))(
             a1: v10,
             a2: v11,
             a3: v10,
             a4,
             a5: MEMORY[0x337408],
             a6: a9);
  v12 = MEMORY[0x79758](a1: v10);
  return sub_1932A6F44(a1: v13, a2: v14, a3: v12, a4);
}
