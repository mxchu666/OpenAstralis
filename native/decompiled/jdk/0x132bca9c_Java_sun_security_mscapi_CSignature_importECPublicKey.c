// Java_sun_security_mscapi_CSignature_importECPublicKey
// rva 0x132bca9c  size 423  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_security_mscapi_CSignature_importECPublicKey(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  __int64 v7; // rbx
  int v8; // r14d
  __int64 v9; // rdi
  __int64 v10; // rsi
  __int64 v11; // rax
  int v12; // edi
  int v13; // r9d
  __int64 v14; // rdi
  __int64 v15; // rsi
  __int64 v16; // rdi
  __int64 v17; // rsi
  unsigned int v18; // eax
  __int64 v19; // rdi
  __int64 v20; // rsi
  __int64 v21; // rdx
  __int64 v22; // rdi
  __int64 v23; // rsi
  __int64 v24; // rdi
  __int64 v25; // rsi
  __int64 v26; // rdi
  __int64 v27; // rsi
  __int64 v28; // rdi
  __int64 v29; // rsi
  __int64 v30; // r8
  int v32; // [rsp+0h] [rbp-58h]
  int v33; // [rsp+8h] [rbp-50h]
  __int64 v34; // [rsp+10h] [rbp-48h]
  __int64 v35; // [rsp+18h] [rbp-40h]
  _QWORD v36[3]; // [rsp+40h] [rbp-18h] BYREF

  v7 = 0;
  v36[1] = 0;
  v8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a4 + 1368LL))(a1: a4, a2: a6, a3: a6);
  v11 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)v9 + 1472LL))(
          a1: v9,
          a2: v10,
          a3: v10,
          a4: v9,
          a5: 0);
  if ( v11 != 0 )
  {
    sub_1932BE03C(a1: v12, a2: v11, a3: v11, a4: 546880, a5: v8, a6: v13);
    if ( (unsigned int)sub_1932CA2CF(a1: v14, a2: v15, a3: 546896, a4: v36, a5: 0) != 0 )
    {
      v18 = sub_1932CA2CF(a1: v16, a2: v17, a3: 546896, a4: v36, a5: 0);
LABEL_4:
      sub_1932BDD9C(a1: v19, a2: v20, a3: 546352, a4: v19, a5: v18);
      return v7;
    }
    if ( (unsigned int)sub_1932CA2E7(a1: v16, a2: v17, a3: 0, a4: v36[0], a5: 546424, a6: 0) != 0 )
    {
      v18 = sub_1932CA2E7(a1: v22, a2: v23, a3: 0, a4: v36[0], a5: 546424, a6: 0);
      goto LABEL_4;
    }
    sub_1932CA305(a1: v22, a2: v23, a3: v21, a4: v36[0]);
    v27 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v24 + 48LL))(
            a1: v24,
            a2: v25,
            a3: 546976,
            a4: v24);
    if ( v27 != 0 )
    {
      v30 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)v26 + 904LL))(
              a1: v26,
              a2: v27,
              a3: v27,
              a4: v26,
              a5: 546876,
              a6: 547008);
      if ( v30 != 0 )
        return sub_1932BA588(a1: v28, a2: v29, a3: v29, a4: v28, a5: v30, a6: a5, a7: v32, a8: v33, a9: v34, a10: v35);
    }
  }
  return v7;
}
