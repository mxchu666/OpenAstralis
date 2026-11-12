// Java_sun_nio_fs_WindowsNativeDispatcher_FindFirstFile0
// rva 0x132a5668  size 262  section .text  group jdk
// window base 0x1932a5668: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_FindFirstFile0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  __int64 v7; // rdx
  __int64 *v8; // rdi
  __int64 v9; // rsi
  __int64 v10; // rbx
  unsigned int v11; // eax
  __int64 v12; // rdi
  __int64 v13; // rsi
  __int64 v14; // rdx
  __int64 v15; // rbx
  __int64 v16; // rdi
  __int64 v17; // rsi
  __int64 v18; // rdx
  __int64 v19; // rdi
  __int64 v20; // rsi
  __int64 v21; // r8
  __int64 v22; // r9
  __int64 v23; // rdi
  __int64 v24; // rsi
  __int64 v25; // rdi
  __int64 v26; // rsi
  unsigned int v27; // eax
  __int64 v28; // rdi
  __int64 v29; // rsi
  __int64 v31; // [rsp+0h] [rbp-298h] BYREF
  _DWORD v32[11]; // [rsp+20h] [rbp-278h] BYREF
  _BYTE v33[548]; // [rsp+4Ch] [rbp-24Ch] BYREF
  __int64 v34; // [rsp+270h] [rbp-28h]

  v9 = MEMORY[0x792E0](a1: a4, a2, a3: v32, a4: a5);
  if ( v9 == -1 )
  {
    v27 = MEMORY[0x79758](a1: v8);
    sub_1932A6F44(a1: v28, a2: v29, a3: v27, a4: v28);
  }
  else
  {
    v10 = *v8;
    v11 = MEMORY[0x79CB0](a1: v8, a2: v9, a3: v7, a4: v33);
    v15 = (*(__int64 (__fastcall **)(__int64, __int64, _BYTE *, __int64, _QWORD))(v10 + 1304))(
            a1: v12,
            a2: v13,
            a3: v33,
            a4: v12,
            a5: v11);
    if ( v15 != 0 )
    {
      (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)v16 + 880LL))(
        a1: v16,
        a2: v17,
        a3: a6,
        a4: v16,
        a5: MEMORY[0x3373A8],
        a6: v17);
      (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)v23 + 832LL))(
        a1: v23,
        a2: v24,
        a3: a6,
        a4: v23,
        a5: MEMORY[0x3373B0],
        a6: v15);
      (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)v25 + 872LL))(
        a1: v25,
        a2: v26,
        a3: a6,
        a4: v25,
        a5: MEMORY[0x3373B8],
        a6: v32[0]);
    }
    else
    {
      MEMORY[0x79490](a1: v16, a2: v17, a3: v14, a4: v17);
    }
  }
  return sub_1932C8DE0(a1: v19, a2: v20, a3: v18, a4: (unsigned __int64)&v31 ^ v34, a5: v21, a6: v22);
}
