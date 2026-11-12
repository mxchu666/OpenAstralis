// Java_sun_security_mscapi_CRSACipher_encryptDecrypt
// rva 0x132bc7e0  size 635  section .text  group jdk
// window base 0x1932bc7e0: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_security_mscapi_CRSACipher_encryptDecrypt(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        int a7,
        __int64 a8,
        int a9,
        int a10,
        unsigned int a11,
        __int64 a12,
        char a13)
{
  int v15; // edi
  int v16; // esi
  int v17; // r8d
  int v18; // r9d
  __int64 v19; // rdx
  __int64 v20; // rdi
  __int64 v21; // rsi
  __int64 v22; // r8
  __int64 v23; // r9
  void (__fastcall *v24)(__int64, __int64, __int64, __int64, _QWORD, _QWORD); // r10
  int *v25; // rdi
  __int64 v26; // rsi
  __int64 v27; // r9
  int *v28; // rdi
  __int64 v29; // rsi
  unsigned int v30; // eax
  __int64 v31; // rdi
  __int64 v32; // rsi
  unsigned int v33; // ebx
  __int64 v34; // r9
  char v35; // r8
  int *v36; // r15
  char v37; // r8
  int v38; // ebx
  __int64 v39; // rdi
  int v40; // eax
  int *v41; // rdi
  __int64 v42; // rsi
  void (__fastcall *v43)(int *, __int64, __int64, __int64, _QWORD, __int64); // r10
  __int64 v44; // r14
  void (__fastcall *v45)(__int64, __int64, __int64, __int64, _QWORD, _QWORD); // r10
  __int64 v47; // [rsp+0h] [rbp-C8h] BYREF
  int *v48; // [rsp+20h] [rbp-A8h]
  unsigned int *v49; // [rsp+28h] [rbp-A0h]
  unsigned int v50; // [rsp+30h] [rbp-98h]
  unsigned int v51; // [rsp+40h] [rbp-88h] BYREF
  int v52; // [rsp+44h] [rbp-84h]
  int v53; // [rsp+48h] [rbp-80h] BYREF
  unsigned int v54; // [rsp+4Ch] [rbp-7Ch] BYREF
  __int64 v55; // [rsp+50h] [rbp-78h]
  __int64 v56; // [rsp+58h] [rbp-70h]
  _QWORD v57[6]; // [rsp+60h] [rbp-68h] BYREF
  __int64 v58; // [rsp+90h] [rbp-38h]

  v55 = 0;
  v54 = a11;
  v51 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a4 + 1368LL))(a1, a2: a4, a3: a6);
  v53 = 0;
  memset(v57, 0, sizeof(v57));
  v20 = sub_1932BE404(a1: v15, a2: v16, a3: v16, a4: v51, a5: v17, a6: v18);
  v55 = v20;
  if ( v20 != 0 )
  {
    v24 = *(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)v21 + 1600LL);
    v48 = (int *)v20;
    v24(a1: v20, a2: v21, a3: a6, a4: v21, a5: 0, a6: v51);
    v27 = 0;
    if ( a13 == 1 )
    {
      v50 = v51;
      v49 = &v54;
      v48 = v25;
      if ( (unsigned int)MEMORY[0x79148](a1: v25, a2: v26, a3: 0, a4: a12, a5: 1, a6: 0) == 0 )
      {
        v30 = MEMORY[0x79758](a1: v28);
        sub_1932BDD9C(a1: v31, a2: v32, a3: 546488, a4: v32, a5: v30);
        goto LABEL_17;
      }
      v33 = v54;
      v51 = v54;
      v34 = 0;
      v52 = 0;
      while ( (unsigned int)v34 < v33 >> 1 )
      {
        v35 = *((_BYTE *)v28 + v34);
        *((_BYTE *)v28 + v34) = *((_BYTE *)v28 + v33 - (unsigned int)v34 - 1);
        *((_BYTE *)v28 + v51 - (unsigned int)v34 - 1) = v35;
        v34 = (unsigned int)(v34 + 1);
        v52 = v34;
        v33 = v51;
      }
      v36 = v28;
    }
    else
    {
      while ( 1 )
      {
        v52 = v27;
        if ( (unsigned int)v27 >= v51 >> 1 )
          break;
        v37 = *((_BYTE *)v25 + v27);
        *((_BYTE *)v25 + v27) = *((_BYTE *)v25 + v51 - (unsigned int)v27 - 1);
        *((_BYTE *)v25 + v51 - (unsigned int)v27 - 1) = v37;
        v27 = (unsigned int)(v27 + 1);
      }
      v49 = &v51;
      v48 = v25;
      v38 = MEMORY[0x79150](a1: v25, a2: v26, a3: 0, a4: a12, a5: 1, a6: 0);
      v40 = MEMORY[0x79758](a1: v39);
      if ( v38 != 0 )
      {
        v53 = 0;
        v36 = v41;
        v33 = v51;
      }
      else
      {
        v53 = v40;
        v36 = (int *)v57;
        v33 = 48;
      }
      v43 = *(void (__fastcall **)(int *, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)v42 + 1688LL);
      v48 = &v53;
      v43(a1: v41, a2: v42, a3: a5, a4: v42, a5: 0, a6: 1);
    }
    v44 = (*(__int64 (__fastcall **)(int *, __int64, _QWORD, __int64))(*(_QWORD *)v29 + 1408LL))(
            a1: v28,
            a2: v29,
            a3: v33,
            a4: v29);
    v56 = v44;
    if ( v44 != 0 )
    {
      v45 = *(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)v21 + 1664LL);
      v48 = v36;
      v45(a1: v20, a2: v21, a3: v44, a4: v21, a5: 0, a6: v33);
    }
  }
LABEL_17:
  if ( v20 != 0 )
    sub_1932C97D0(a1: v20, a2: v21, a3: v19, a4: v20);
  return sub_1932C8DE0(a1: v20, a2: v21, a3: v19, a4: (unsigned __int64)&v47 ^ v58, a5: v22, a6: v23);
}
