// Java_sun_nio_fs_WindowsNativeDispatcher_GetAclInformation0
// rva 0x132a5ae8  size 135  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_GetAclInformation0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  __int64 v7; // rdi
  __int64 v8; // rsi
  unsigned int v9; // eax
  __int64 v10; // rdi
  __int64 v11; // rsi
  __int64 v12; // rdx
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 v15; // r8
  __int64 v16; // r9
  __int64 v18; // [rsp+0h] [rbp-48h] BYREF
  _DWORD v19[4]; // [rsp+20h] [rbp-28h] BYREF
  __int64 v20; // [rsp+30h] [rbp-18h]

  if ( (unsigned int)MEMORY[0x79178](a1: a6, a2, a3: v19, a4: a5, a5: 12) != 0 )
  {
    (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 872LL))(
      a1: v7,
      a2: v8,
      a3: v7,
      a4,
      a5: MEMORY[0x337428],
      a6: v19[0]);
  }
  else
  {
    v9 = MEMORY[0x79758](a1: v7);
    sub_1932A6F44(a1: v10, a2: v11, a3: v9, a4);
  }
  return sub_1932C8DE0(a1: v13, a2: v14, a3: v12, a4: (unsigned __int64)&v18 ^ v20, a5: v15, a6: v16);
}
