// Java_sun_security_mscapi_CSignature_verifyCngSignedHash
// rva 0x132bd468  size 660  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
char __fastcall Java_sun_security_mscapi_CSignature_verifyCngSignedHash(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        unsigned int a5,
        __int64 a6,
        int a7,
        int a8,
        int a9,
        __int64 a10,
        unsigned int a11,
        __int64 a12,
        unsigned int a13,
        int a14,
        __int64 a15,
        __int64 a16,
        __int64 a17)
{
  __int64 v17; // rsi
  __int64 v19; // rdi
  __int64 v20; // r14
  char v21; // r12
  __int64 v22; // rdx
  __int64 v23; // rdi
  __int64 v24; // rsi
  int v25; // edi
  int v26; // esi
  int v27; // r8d
  int v28; // r9d
  __int64 v29; // rdi
  __int64 v30; // rsi
  int v31; // r8d
  int v32; // r9d
  __int64 *v33; // rax
  unsigned int v34; // eax
  __int64 v35; // rdi
  __int64 v36; // rsi
  __int64 v38; // [rsp+48h] [rbp-50h] BYREF
  __int64 *v39; // [rsp+50h] [rbp-48h]
  __int64 v40; // [rsp+58h] [rbp-40h] BYREF
  __int64 v41; // [rsp+60h] [rbp-38h]
  __int64 v42; // [rsp+68h] [rbp-30h]
  __int64 v43; // [rsp+70h] [rbp-28h] BYREF
  int v44; // [rsp+78h] [rbp-20h]

  LODWORD(v17) = a5;
  LODWORD(v19) = 0;
  v42 = 0;
  v20 = 0;
  v41 = 0;
  v21 = 0;
  v38 = 0;
  if ( a17 != 0 )
  {
    if ( (unsigned int)sub_1932CA30B(a1: 0, a2: a5, a3: &v38, a4: 0, a5: a16, a6: a17) != 0 )
    {
      v34 = sub_1932CA30B(a1: v19, a2: v17, a3: &v38, a4: 0, a5: a16, a6: a17);
      sub_1932BDD9C(a1: v35, a2: v36, a3: 546352, a4, a5: v34);
      goto LABEL_20;
    }
  }
  else
  {
    v38 = a16;
  }
  v23 = sub_1932BE404(a1: v19, a2: v17, a3: a4, a4: a11, a5, a6);
  v42 = v23;
  if ( v23 != 0 )
  {
    (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 1600LL))(
      a1: v23,
      a2: v24,
      a3: a6,
      a4,
      a5: 0,
      a6: a11);
    v20 = sub_1932BE404(a1: v25, a2: v26, a3: a4, a4: a13, a5: v27, a6: v28);
    v41 = v20;
    if ( v20 != 0 )
    {
      (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 1600LL))(
        a1: v23,
        a2: v24,
        a3: a12,
        a4,
        a5: 0,
        a6: a13);
      v33 = nullptr;
      if ( (_DWORD)v30 == 0 )
      {
LABEL_17:
        v39 = v33;
        goto LABEL_18;
      }
      v30 = (unsigned int)(v30 - 1);
      if ( (_DWORD)v30 != 0 )
      {
        if ( (_DWORD)v30 != 1 )
        {
LABEL_18:
          if ( (unsigned int)sub_1932CA2F9(a1: v29, a2: v30, a3: v39, a4: v38, a5: v29, a6: a11) != 0 )
            JUMPOUT(0x3265176ACLL);
          v21 = 1;
          goto LABEL_20;
        }
        v43 = sub_1932BDCA0(a1: v29, a2: 1, a3: a15, a4, a5: v31, a6: v32);
        v44 = a14;
        if ( v43 != 0 )
        {
          v33 = &v43;
          goto LABEL_17;
        }
LABEL_14:
        JNU_ThrowByName(a1: v29, a2: v30, a3: 546352, a4, a5: 546392);
        goto LABEL_20;
      }
      if ( a15 != 0 )
      {
        v40 = sub_1932BDCA0(a1: v29, a2: 0, a3: a15, a4, a5: v31, a6: v32);
        if ( v40 == 0 )
          goto LABEL_14;
      }
      else
      {
        v40 = 0;
      }
      v33 = &v40;
      goto LABEL_17;
    }
  }
LABEL_20:
  if ( v20 != 0 )
    sub_1932C97D0(a1: v23, a2: v24, a3: v22, a4: v20);
  if ( v23 != 0 )
    sub_1932C97D0(a1: v23, a2: v24, a3: v22, a4: v23);
  if ( a17 != 0 && v38 != 0 )
    sub_1932CA305(a1: v23, a2: v24, a3: v22, a4: v38);
  return v21;
}
