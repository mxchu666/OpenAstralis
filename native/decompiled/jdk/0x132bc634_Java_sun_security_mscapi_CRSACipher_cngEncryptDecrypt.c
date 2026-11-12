// Java_sun_security_mscapi_CRSACipher_cngEncryptDecrypt
// rva 0x132bc634  size 428  section .text  group jdk
// window base 0x1932bc634: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_security_mscapi_CRSACipher_cngEncryptDecrypt(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        int a7,
        int a8,
        int a9,
        int a10,
        unsigned int a11,
        __int64 a12,
        char a13)
{
  int v14; // edi
  int v15; // esi
  int v16; // r8d
  int v17; // r9d
  __int64 v18; // rdx
  __int64 v19; // rbx
  __int64 v20; // rdi
  __int64 v21; // rsi
  __int64 v22; // r8
  __int64 v23; // r9
  __int64 v24; // rdi
  __int64 v25; // rsi
  unsigned int v26; // eax
  __int64 v27; // rdi
  __int64 v28; // rsi
  __int64 v29; // rdi
  void (__fastcall *v30)(__int64, __int64, __int64, __int64, _QWORD, __int64); // r10
  __int64 v31; // rsi
  __int64 v32; // rsi
  int *v33; // r14
  __int64 v34; // r15
  void (__fastcall *v35)(__int64, __int64, __int64, __int64, _QWORD, _QWORD); // r10
  __int64 v37; // [rsp+0h] [rbp-B8h] BYREF
  int *v38; // [rsp+20h] [rbp-98h]
  unsigned int v39; // [rsp+28h] [rbp-90h]
  unsigned int *v40; // [rsp+30h] [rbp-88h]
  int v41; // [rsp+38h] [rbp-80h]
  unsigned int v42; // [rsp+40h] [rbp-78h] BYREF
  unsigned int v43; // [rsp+44h] [rbp-74h] BYREF
  __int64 v44; // [rsp+48h] [rbp-70h]
  __int64 v45; // [rsp+50h] [rbp-68h]
  _QWORD v46[6]; // [rsp+58h] [rbp-60h] BYREF
  __int64 v47; // [rsp+88h] [rbp-30h]

  v44 = 0;
  v42 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a4 + 1368LL))(a1: a4, a2: a6, a3: a6);
  memset(v46, 0, sizeof(v46));
  v19 = sub_1932BE404(a1: v14, a2: v15, a3: v14, a4: v42, a5: v16, a6: v17);
  v44 = v19;
  if ( v19 == 0 )
    goto LABEL_10;
  (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)v20 + 1600LL))(
    a1: v20,
    a2: v21,
    a3: v21,
    a4: v20,
    a5: 0,
    a6: v42);
  v41 = 2;
  v40 = &v42;
  v39 = v42;
  v38 = (int *)v19;
  if ( a13 == 1 )
  {
    v26 = sub_1932CA2DB(a1: v24, a2: v25, a3: v19, a4: a12, a5: a11, a6: 0);
    v43 = v26;
    if ( v26 != 0 )
    {
      sub_1932BDD9C(a1: v27, a2: v28, a3: 546488, a4: v27, a5: v26);
      goto LABEL_10;
    }
    goto LABEL_6;
  }
  v43 = sub_1932CA2E1(a1: v24, a2: v25, a3: v19, a4: a12, a5: a11, a6: 0);
  v30 = *(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)v29 + 1688LL);
  v38 = (int *)&v43;
  v30(a1: v29, a2: v31, a3: a5, a4: v29, a5: 0, a6: 1);
  if ( v43 == 0 )
  {
LABEL_6:
    v32 = v42;
    v33 = (int *)v19;
    goto LABEL_8;
  }
  v32 = 48;
  v33 = (int *)v46;
LABEL_8:
  v34 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)v27 + 1408LL))(
          a1: v27,
          a2: v32,
          a3: (unsigned int)v32,
          a4: v27);
  v45 = v34;
  if ( v34 != 0 )
  {
    v35 = *(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)v20 + 1664LL);
    v38 = v33;
    v35(a1: v20, a2: v21, a3: v34, a4: v20, a5: 0, a6: (unsigned int)v21);
  }
LABEL_10:
  if ( v19 != 0 )
    sub_1932C97D0(a1: v20, a2: v21, a3: v18, a4: v19);
  return sub_1932C8DE0(a1: v20, a2: v21, a3: v18, a4: (unsigned __int64)&v37 ^ v47, a5: v22, a6: v23);
}
