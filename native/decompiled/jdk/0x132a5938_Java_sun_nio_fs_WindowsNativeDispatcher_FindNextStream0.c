// Java_sun_nio_fs_WindowsNativeDispatcher_FindNextStream0
// rva 0x132a5938  size 151  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_FindNextStream0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  __int64 v5; // rdx
  __int64 *v6; // rdi
  __int64 v7; // rsi
  __int64 v8; // rbx
  unsigned int v9; // eax
  __int64 v10; // rdi
  __int64 v11; // rsi
  __int64 v12; // rdx
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 v15; // r8
  __int64 v16; // r9
  unsigned int v17; // eax
  __int64 v18; // rdi
  __int64 v19; // rsi
  __int64 v21; // [rsp+0h] [rbp-298h] BYREF
  _BYTE v22[8]; // [rsp+20h] [rbp-278h] BYREF
  _BYTE v23[600]; // [rsp+28h] [rbp-270h] BYREF
  __int64 v24; // [rsp+280h] [rbp-18h]

  if ( (unsigned int)MEMORY[0x79360](a1: a4, a2, a3: v22, a4: a5) != 0 )
  {
    v8 = *v6;
    v9 = MEMORY[0x79CB0](a1: v6, a2: v7, a3: v5, a4: v23);
    (*(void (__fastcall **)(__int64, __int64, _BYTE *, __int64, _QWORD))(v8 + 1304))(
      a1: v10,
      a2: v11,
      a3: v23,
      a4: v10,
      a5: v9);
  }
  else if ( (unsigned int)MEMORY[0x79758](a1: v6) != 38 )
  {
    v17 = MEMORY[0x79758](a1: v13);
    sub_1932A6F44(a1: v18, a2: v19, a3: v17, a4: v18);
  }
  return sub_1932C8DE0(a1: v13, a2: v14, a3: v12, a4: (unsigned __int64)&v21 ^ v24, a5: v15, a6: v16);
}
