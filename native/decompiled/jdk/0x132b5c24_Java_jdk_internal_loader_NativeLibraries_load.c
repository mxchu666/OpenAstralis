// Java_jdk_internal_loader_NativeLibraries_load
// rva 0x132b5c24  size 587  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_jdk_internal_loader_NativeLibraries_load(
        __int64 a1,
        __int64 a2,
        int a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        int a7,
        __int64 a8,
        int a9,
        int a10,
        char a11,
        char a12)
{
  __int64 v15; // rdx
  __int64 v16; // rdi
  __int64 v17; // rsi
  __int64 v18; // r8
  __int64 v19; // r9
  __int64 v20; // rax
  __int64 v21; // r15
  __int64 v22; // rsi
  __int64 (__fastcall *v23)(__int64, __int64, _QWORD, __int64); // rbp
  __int64 v24; // rdi
  __int64 v25; // rsi
  __int64 v26; // rdi
  __int64 v27; // rsi
  int v28; // ebp
  __int64 v29; // rdx
  __int64 v30; // rdi
  __int64 v31; // rsi
  __int64 v32; // r12
  __int64 v33; // rdi
  __int64 v34; // rsi
  __int64 v35; // rdx
  __int64 v36; // rdi
  __int64 v37; // rsi
  __int64 v38; // rdi
  __int64 v39; // rsi
  __int64 v40; // rdi
  __int64 v41; // rsi
  int v42; // edi
  int v43; // esi
  __int64 v44; // rdi
  __int64 v45; // rsi
  __int64 v46; // rdi
  __int64 v47; // rsi
  __int64 v49[6]; // [rsp+0h] [rbp-188h] BYREF
  __int64 v50; // [rsp+30h] [rbp-158h] BYREF
  __int64 v51; // [rsp+38h] [rbp-150h]
  _BYTE v52[256]; // [rsp+40h] [rbp-148h] BYREF
  __int64 v53; // [rsp+140h] [rbp-48h]

  v51 = a5;
  if ( (unsigned __int8)sub_1932B6080(a1: 0, a2: a12, a3, a4, a5, a6, a7: v49[0]) != 0 )
  {
    v20 = sub_1932B0228(a1: v16, a2: v17, a3: a6, a4, a5: 0);
    v21 = v20;
    if ( v20 != 0 )
    {
      if ( a11 != 0 )
      {
        v22 = MEMORY[0x337678];
      }
      else
      {
        LOBYTE(v15) = v17;
        v22 = sub_1932C8980(a1: v16, a2: v17, a3: v15, a4: v20);
      }
      if ( v22 == 0 )
      {
        v37 = (*(__int64 (__fastcall **)(__int64, _QWORD, _QWORD, __int64))(*(_QWORD *)a4 + 120LL))(
                a1: v16,
                a2: 0,
                a3: *(_QWORD *)(*(_QWORD *)a4 + 120LL),
                a4);
        if ( v37 != 0 )
        {
          (*(void (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 136LL))(
            a1: v36,
            a2: v37,
            a3: *(_QWORD *)(*(_QWORD *)a4 + 136LL),
            a4);
          (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 880LL))(
            a1: v44,
            a2: v45,
            a3: a5,
            a4,
            a5: MEMORY[0x337668],
            a6: 0);
          (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 104LL))(
            a1: v46,
            a2: v47,
            a3: v47,
            a4);
        }
        goto LABEL_21;
      }
      LOBYTE(v19) = 1;
      v23 = (__int64 (__fastcall *)(__int64, __int64, _QWORD, __int64))sub_1932B5FA0(
                                                                         a1: v16,
                                                                         a2: v22,
                                                                         a3: v22,
                                                                         a4,
                                                                         a5: a11 != 0 ? v21 : 0,
                                                                         a6: v19);
      if ( v23 != nullptr )
      {
        (*(void (__fastcall **)(__int64, __int64, __int64 *, __int64))(*(_QWORD *)a4 + 1752LL))(
          a1: v24,
          a2: v25,
          a3: &v50,
          a4);
        v28 = v23(a1: v26, a2: v27, a3: 0, a4: v50);
      }
      else
      {
        v28 = 65537;
      }
      v32 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 120LL))(
              a1: v24,
              a2: v25,
              a3: *(_QWORD *)(*(_QWORD *)a4 + 120LL),
              a4);
      if ( v32 != 0 )
      {
        (*(void (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 136LL))(
          a1: v30,
          a2: v31,
          a3: *(_QWORD *)(*(_QWORD *)a4 + 136LL),
          a4);
        (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 104LL))(
          a1: v33,
          a2: v34,
          a3: v32,
          a4);
      }
      else
      {
        if ( (unsigned __int8)sub_1932C8930(a1: v30, a2: v31, a3: v29, a4: (unsigned int)v28) != 0
          && (a11 == 0 || v28 >= 65544) )
        {
          (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 872LL))(
            a1: v38,
            a2: v39,
            a3: v51,
            a4,
            a5: MEMORY[0x337670],
            a6: (unsigned int)v28);
          (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 880LL))(
            a1: v40,
            a2: v41,
            a3: v51,
            a4,
            a5: MEMORY[0x337668],
            a6: v41);
          LOBYTE(v36) = 1;
LABEL_21:
          sub_1932B110C(a1: v36, a2: v37, a3: a6, a4, a5: v21);
          return sub_1932C8DE0(a1: v16, a2: v17, a3: v15, a4: (unsigned __int64)v49 ^ v53, a5: v18, a6: v19);
        }
        v49[4] = v21;
        sub_1932C8AF0(a1: v38, a2: v39, a3: 256, a4: (unsigned int)v52, a5: 544560, a6: v28);
        JNU_ThrowByName(a1: v42, a2: v43, a3: 544608, a4, a5: (__int64)v52);
      }
      if ( a11 == 0 )
        sub_1932C89B0(a1: v36, a2: v37, a3: v35, a4: v37);
      goto LABEL_21;
    }
  }
  return sub_1932C8DE0(a1: v16, a2: v17, a3: v15, a4: (unsigned __int64)v49 ^ v53, a5: v18, a6: v19);
}
