// Java_sun_nio_fs_WindowsNativeDispatcher_GetVolumeInformation0
// rva 0x132a626c  size 363  section .text  group jdk
// window base 0x1932a626c: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_GetVolumeInformation0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  __int64 v6; // rdx
  __int64 *v7; // rdi
  __int64 v8; // rsi
  unsigned int v9; // eax
  __int64 v10; // rdi
  __int64 v11; // rsi
  __int64 v12; // rdx
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 v15; // r8
  __int64 v16; // r9
  __int64 v17; // rbx
  unsigned int v18; // eax
  __int64 v19; // rdi
  __int64 v20; // rsi
  __int64 v21; // rax
  __int64 *v22; // rdi
  __int64 v23; // rbx
  __int64 v24; // rdx
  __int64 v25; // rsi
  unsigned int v26; // eax
  __int64 v27; // rdi
  __int64 v28; // rsi
  __int64 v29; // rax
  __int64 v30; // rdi
  __int64 v31; // rsi
  __int64 v32; // rdi
  __int64 v33; // rsi
  _QWORD v35[7]; // [rsp+0h] [rbp-498h] BYREF
  int v36; // [rsp+38h] [rbp-460h]
  unsigned int v37; // [rsp+40h] [rbp-458h] BYREF
  unsigned int v38; // [rsp+44h] [rbp-454h] BYREF
  char v39; // [rsp+48h] [rbp-450h] BYREF
  _BYTE v40[528]; // [rsp+50h] [rbp-448h] BYREF
  _BYTE v41[528]; // [rsp+260h] [rbp-238h] BYREF
  __int64 v42; // [rsp+470h] [rbp-28h]

  v36 = 261;
  v35[6] = v40;
  v35[5] = &v38;
  v35[4] = &v39;
  if ( (unsigned int)MEMORY[0x79328](a1: a4, a2: a6, a3: v41, a4: a5, a5: 261, a6: &v37) != 0 )
  {
    v17 = *v7;
    v18 = MEMORY[0x79CB0](a1: v7, a2: v8, a3: v6, a4: v40);
    v21 = (*(__int64 (__fastcall **)(__int64, __int64, _BYTE *, __int64, _QWORD))(v17 + 1304))(
            a1: v19,
            a2: v20,
            a3: v40,
            a4: v19,
            a5: v18);
    if ( v21 != 0 )
    {
      (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)v13 + 832LL))(
        a1: v13,
        a2: v14,
        a3: v14,
        a4: v13,
        a5: MEMORY[0x3373D0],
        a6: v21);
      v23 = *v22;
      v26 = MEMORY[0x79CB0](a1: v22, a2: v25, a3: v24, a4: v41);
      v29 = (*(__int64 (__fastcall **)(__int64, __int64, _BYTE *, __int64, _QWORD))(v23 + 1304))(
              a1: v27,
              a2: v28,
              a3: v41,
              a4: v27,
              a5: v26);
      if ( v29 != 0 )
      {
        (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)v13 + 832LL))(
          a1: v13,
          a2: v14,
          a3: v14,
          a4: v13,
          a5: MEMORY[0x3373D8],
          a6: v29);
        (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)v30 + 872LL))(
          a1: v30,
          a2: v31,
          a3: v31,
          a4: v30,
          a5: MEMORY[0x3373E0],
          a6: v37);
        (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)v32 + 872LL))(
          a1: v32,
          a2: v33,
          a3: v33,
          a4: v32,
          a5: MEMORY[0x3373E8],
          a6: v38);
      }
    }
  }
  else
  {
    v9 = MEMORY[0x79758](a1: v7);
    sub_1932A6F44(a1: v10, a2: v11, a3: v9, a4: v10);
  }
  return sub_1932C8DE0(a1: v13, a2: v14, a3: v12, a4: (unsigned __int64)v35 ^ v42, a5: v15, a6: v16);
}
