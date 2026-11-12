// Java_sun_nio_fs_WindowsNativeDispatcher_LookupAccountSid0
// rva 0x132a6584  size 348  section .text  group jdk
// window base 0x1932a6584: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_LookupAccountSid0(
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
  _QWORD v33[8]; // [rsp+0h] [rbp-100h] BYREF
  int v34; // [rsp+40h] [rbp-C0h] BYREF
  int v35; // [rsp+44h] [rbp-BCh] BYREF
  unsigned int v36; // [rsp+48h] [rbp-B8h] BYREF
  _BYTE v37[512]; // [rsp+50h] [rbp-B0h] BYREF
  _BYTE v38[512]; // [rsp+250h] [rbp+150h] BYREF
  __int64 v39; // [rsp+450h] [rbp+350h]

  v34 = 510;
  v35 = 510;
  v33[6] = &v36;
  v33[5] = &v34;
  v33[4] = v37;
  if ( (unsigned int)MEMORY[0x790C0](a1: a4, a2: a6, a3: a5, a4: 0, a5: v38, a6: &v35) != 0 )
  {
    v17 = *v7;
    v18 = MEMORY[0x79CB0](a1: v7, a2: v8, a3: v6, a4: v37);
    v21 = (*(__int64 (__fastcall **)(__int64, __int64, _BYTE *, __int64, _QWORD))(v17 + 1304))(
            a1: v19,
            a2: v20,
            a3: v37,
            a4: v19,
            a5: v18);
    if ( v21 != 0 )
    {
      (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)v13 + 832LL))(
        a1: v13,
        a2: v14,
        a3: v14,
        a4: v13,
        a5: MEMORY[0x337410],
        a6: v21);
      v23 = *v22;
      v26 = MEMORY[0x79CB0](a1: v22, a2: v25, a3: v24, a4: v38);
      v29 = (*(__int64 (__fastcall **)(__int64, __int64, _BYTE *, __int64, _QWORD))(v23 + 1304))(
              a1: v27,
              a2: v28,
              a3: v38,
              a4: v27,
              a5: v26);
      if ( v29 != 0 )
      {
        (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)v13 + 832LL))(
          a1: v13,
          a2: v14,
          a3: v14,
          a4: v13,
          a5: MEMORY[0x337418],
          a6: v29);
        (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)v30 + 872LL))(
          a1: v30,
          a2: v31,
          a3: v31,
          a4: v30,
          a5: MEMORY[0x337420],
          a6: v36);
      }
    }
  }
  else
  {
    v9 = MEMORY[0x79758](a1: v7);
    sub_1932A6F44(a1: v10, a2: v11, a3: v9, a4: v10);
  }
  return sub_1932C8DE0(a1: v13, a2: v14, a3: v12, a4: (unsigned __int64)v33 ^ v39, a5: v15, a6: v16);
}
