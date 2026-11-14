// Java_sun_security_mscapi_CSignature_signCngHash
// rva 0x132bcdf4  size 843  section .text  group jdk
// window base 0x1932bcdf4: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_security_mscapi_CSignature_signCngHash(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        unsigned int a5,
        __int64 a6,
        int a7,
        int a8,
        int a9,
        int a10,
        unsigned int a11,
        int a12,
        __int64 a13,
        __int64 a14,
        __int64 a15)
{
  __int64 v16; // rsi
  __int64 v18; // r12
  __int64 v19; // rdi
  __int64 v20; // r14
  __int64 v21; // rdx
  __int64 v22; // rdi
  __int64 v23; // rsi
  __int64 v24; // rdi
  int v25; // esi
  int v26; // r8d
  int v27; // r9d
  int v29; // esi
  unsigned int v30; // eax
  __int64 v31; // rdi
  __int64 v32; // rsi
  __int64 *v33; // rsi
  __int64 v34; // rdi
  __int64 v35; // rsi
  int v36; // r8d
  int v37; // r9d
  unsigned int v38; // eax
  __int64 v39; // rdi
  __int64 v40; // rsi
  __int64 v41; // rax
  __int64 v43; // [rsp+48h] [rbp-50h] BYREF
  __int64 v44; // [rsp+50h] [rbp-48h]
  __int64 v45; // [rsp+58h] [rbp-40h] BYREF
  __int64 v46; // [rsp+60h] [rbp-38h]
  __int64 v47; // [rsp+68h] [rbp-30h]
  __int64 v48; // [rsp+70h] [rbp-28h] BYREF
  int v49; // [rsp+78h] [rbp-20h]

  LODWORD(v16) = a5;
  v18 = 0;
  v44 = 0;
  LODWORD(v19) = 0;
  v47 = 0;
  v20 = 0;
  v46 = 0;
  v43 = 0;
  if ( a15 != 0 )
  {
    if ( (unsigned int)sub_1932CA30B(a1: 0, a2: a5, a3: &v43, a4: 0, a5: a14, a6: a15) != 0 )
    {
      v30 = sub_1932CA30B(a1: v19, a2: v16, a3: &v43, a4: 0, a5: a14, a6: a15);
      sub_1932BDD9C(a1: v31, a2: v32, a3: 546352, a4, a5: v30);
      goto LABEL_26;
    }
  }
  else
  {
    v43 = a14;
  }
  v22 = sub_1932BE404(a1: v19, a2: v16, a3: a4, a4: a11, a5, a6);
  v47 = v22;
  if ( v22 == 0 )
    goto LABEL_25;
  (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 1600LL))(
    a1: v22,
    a2: v23,
    a3: a6,
    a4,
    a5: 0,
    a6: a11);
  if ( v25 != 0 )
  {
    if ( v25 != 1 )
    {
      if ( v25 == 2 )
      {
        v48 = sub_1932BDCA0(a1: v24, a2: 1, a3: a13, a4, a5: v26, a6: v27);
        v49 = a12;
        if ( v48 == 0 )
        {
LABEL_8:
          JNU_ThrowByName(a1: v24, a2: v29, a3: 546352, a4, a5: 546392);
          goto LABEL_25;
        }
        v33 = &v48;
      }
      else
      {
        v33 = (__int64 *)v45;
      }
    }
    else
    {
      if ( a13 != 0 )
      {
        v45 = sub_1932BDCA0(a1: v24, a2: 0, a3: a13, a4, a5: v26, a6: v27);
        if ( v45 == 0 )
          goto LABEL_8;
      }
      else
      {
        v45 = 0;
      }
      v33 = &v45;
    }
  }
  else
  {
    v33 = nullptr;
  }
  if ( (unsigned int)sub_1932CA2F3(a1: v24, a2: v33, a3: v33, a4: v43, a5: v24, a6: a11) != 0 )
    goto LABEL_20;
  v20 = sub_1932BE404(a1: v34, a2: v35, a3: a4, a4: 0, a5: v36, a6: v37);
  v46 = v20;
  if ( v20 != 0 )
  {
    if ( (unsigned int)sub_1932CA2F3(a1: v22, a2: v23, a3: v23, a4: v43, a5: v22, a6: a11) != 0 )
    {
LABEL_20:
      v38 = sub_1932CA2F3(a1: v34, a2: v35, a3: v35, a4: v43, a5: v34, a6: a11);
      sub_1932BDD9C(a1: v39, a2: v40, a3: 546352, a4, a5: v38);
    }
    else
    {
      v41 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1408LL))(
              a1: v34,
              a2: v35,
              a3: 0,
              a4);
      v23 = v41;
      if ( v41 != 0 )
      {
        (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 1664LL))(
          a1: v22,
          a2: v41,
          a3: v41,
          a4,
          a5: 0,
          a6: 0);
        v18 = v23;
        goto LABEL_26;
      }
    }
  }
LABEL_25:
  v18 = v44;
LABEL_26:
  if ( v20 != 0 )
    sub_1932C97D0(a1: v22, a2: v23, a3: v21, a4: v20);
  if ( v22 != 0 )
    sub_1932C97D0(a1: v22, a2: v23, a3: v21, a4: v22);
  if ( a15 != 0 && v43 != 0 )
    sub_1932CA305(a1: v22, a2: v23, a3: v21, a4: v43);
  return v18;
}
