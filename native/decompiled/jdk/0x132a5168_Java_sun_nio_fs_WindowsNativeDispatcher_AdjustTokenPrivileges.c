// Java_sun_nio_fs_WindowsNativeDispatcher_AdjustTokenPrivileges
// rva 0x132a5168  size 129  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_AdjustTokenPrivileges(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 *a6,
        int a7,
        int a8,
        int a9,
        int a10,
        int a11)
{
  __int64 v11; // rax
  __int64 v13; // rdx
  __int64 v14; // rdi
  __int64 v15; // rsi
  __int64 v16; // r8
  __int64 v17; // r9
  unsigned int v18; // eax
  __int64 v19; // rdi
  __int64 v20; // rsi
  _QWORD v22[6]; // [rsp+0h] [rbp-58h] BYREF
  _DWORD v23[4]; // [rsp+30h] [rbp-28h] BYREF
  __int64 v24; // [rsp+40h] [rbp-18h]

  v11 = *a6;
  v22[5] = 0;
  v23[0] = 1;
  *(_QWORD *)&v23[1] = v11;
  v23[3] = a11;
  v22[4] = 0;
  if ( (unsigned int)MEMORY[0x79190](a1, a2, a3: 0, a4: a5, a5: v23, a6: 1) == 0 )
  {
    v18 = MEMORY[0x79758](a1: v14);
    sub_1932A6F44(a1: v19, a2: v20, a3: v18, a4);
  }
  return sub_1932C8DE0(a1: v14, a2: v15, a3: v13, a4: (unsigned __int64)v22 ^ v24, a5: v16, a6: v17);
}
