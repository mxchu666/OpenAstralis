// Java_sun_nio_fs_WindowsNativeDispatcher_GetVolumePathName0
// rva 0x132a63d8  size 149  section .text  group jdk
// window base 0x1932a63d8: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_GetVolumePathName0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  __int64 v5; // rdx
  __int64 *v6; // rdi
  __int64 v7; // rsi
  unsigned int v8; // eax
  __int64 v9; // rdi
  __int64 v10; // rsi
  __int64 v11; // rdx
  __int64 v12; // rdi
  __int64 v13; // rsi
  __int64 v14; // r8
  __int64 v15; // r9
  __int64 v16; // rbx
  unsigned int v17; // eax
  __int64 v18; // rdi
  __int64 v19; // rsi
  __int64 v21; // [rsp+0h] [rbp-248h] BYREF
  _BYTE v22[528]; // [rsp+20h] [rbp-228h] BYREF
  __int64 v23; // [rsp+230h] [rbp-18h]

  if ( (unsigned int)MEMORY[0x79330](a1: a4, a2, a3: v22, a4: a5, a5: 261) != 0 )
  {
    v16 = *v6;
    v17 = MEMORY[0x79CB0](a1: v6, a2: v7, a3: v5, a4: v22);
    (*(void (__fastcall **)(__int64, __int64, _BYTE *, __int64, _QWORD))(v16 + 1304))(
      a1: v18,
      a2: v19,
      a3: v22,
      a4: v18,
      a5: v17);
  }
  else
  {
    v8 = MEMORY[0x79758](a1: v6);
    sub_1932A6F44(a1: v9, a2: v10, a3: v8, a4: v9);
  }
  return sub_1932C8DE0(a1: v12, a2: v13, a3: v11, a4: (unsigned __int64)&v21 ^ v23, a5: v14, a6: v15);
}
