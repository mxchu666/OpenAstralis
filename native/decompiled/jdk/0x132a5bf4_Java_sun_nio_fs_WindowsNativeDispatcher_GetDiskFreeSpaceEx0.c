// Java_sun_nio_fs_WindowsNativeDispatcher_GetDiskFreeSpaceEx0
// rva 0x132a5bf4  size 168  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_GetDiskFreeSpaceEx0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        int a8,
        __int64 a9)
{
  __int64 v10; // rdi
  __int64 v11; // rsi
  unsigned int v12; // eax
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 v16; // rdi
  __int64 v17; // rsi
  __int64 v18; // rdi
  __int64 v19; // rsi
  __int64 v20; // [rsp+20h] [rbp-18h] BYREF
  __int64 v21; // [rsp+28h] [rbp-10h] BYREF

  if ( (unsigned int)MEMORY[0x792F0](a1: a6, a2, a3: &a9, a4: a5, a5: &v20, a6: &v21) != 0 )
  {
    (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 880LL))(
      a1: v10,
      a2: v11,
      a3: v10,
      a4,
      a5: MEMORY[0x3373F0],
      a6: a9);
    (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 880LL))(
      a1: v16,
      a2: v17,
      a3: v16,
      a4,
      a5: MEMORY[0x3373F8],
      a6: v20);
    return (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 880LL))(
             a1: v18,
             a2: v19,
             a3: v18,
             a4,
             a5: MEMORY[0x337400],
             a6: v21);
  }
  else
  {
    v12 = MEMORY[0x79758](a1: v10);
    return sub_1932A6F44(a1: v13, a2: v14, a3: v12, a4);
  }
}
