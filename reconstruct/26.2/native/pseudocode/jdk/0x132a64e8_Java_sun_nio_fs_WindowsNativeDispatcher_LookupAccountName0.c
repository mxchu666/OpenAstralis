// Java_sun_nio_fs_WindowsNativeDispatcher_LookupAccountName0
// rva 0x132a64e8  size 154  section .text  group jdk
// window base 0x1932a64e8: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_LookupAccountName0(
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
        int a11)
{
  __int64 v12; // rdx
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 v15; // r8
  __int64 v16; // r9
  unsigned int v17; // eax
  __int64 v18; // rdi
  __int64 v19; // rsi
  _QWORD v21[8]; // [rsp+0h] [rbp-268h] BYREF
  int v22; // [rsp+40h] [rbp-228h] BYREF
  char v23; // [rsp+44h] [rbp-224h] BYREF
  char v24; // [rsp+50h] [rbp-218h] BYREF
  __int64 v25; // [rsp+250h] [rbp-18h]

  v22 = 510;
  v21[6] = &v23;
  v21[5] = &v22;
  v21[4] = &v24;
  if ( (unsigned int)MEMORY[0x790C8](a1, a2, a3: a5, a4: 0, a5: a6, a6: &a11) == 0
    && (unsigned int)MEMORY[0x79758](a1: v13) != 122 )
  {
    v17 = MEMORY[0x79758](a1: v13);
    sub_1932A6F44(a1: v18, a2: v19, a3: v17, a4);
  }
  return sub_1932C8DE0(a1: v13, a2: v14, a3: v12, a4: (unsigned __int64)v21 ^ v25, a5: v15, a6: v16);
}
