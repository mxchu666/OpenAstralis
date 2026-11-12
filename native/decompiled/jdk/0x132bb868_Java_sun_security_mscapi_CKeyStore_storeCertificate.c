// Java_sun_security_mscapi_CKeyStore_storeCertificate
// rva 0x132bb868  size 1395  section .text  group jdk
// window base 0x1932bb868: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_security_mscapi_CKeyStore_storeCertificate(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        int a7,
        int a8,
        __int64 a9,
        __int64 a10,
        __int64 a11,
        unsigned int a12,
        __int64 a13,
        __int64 a14)
{
  __int64 v14; // r12
  __int64 v15; // r14
  __int64 v16; // r13
  __int64 v17; // r15
  __int64 v18; // rbx
  __int64 v19; // rax
  __int64 v20; // rdx
  __int64 v21; // rdi
  __int64 v22; // rsi
  __int64 v23; // rdi
  int v24; // esi
  int v25; // r8d
  int v26; // r9d
  unsigned int v27; // eax
  __int64 v28; // rdi
  __int64 v29; // rsi
  __int64 v30; // rdx
  __int64 v31; // rdi
  __int64 v32; // rsi
  __int64 v33; // rdi
  __int64 v34; // rsi
  int v35; // edi
  int v36; // esi
  int v37; // r8d
  int v38; // r9d
  __int64 v39; // rax
  __int64 v40; // rax
  __int64 v41; // rdi
  __int64 v42; // rsi
  __int64 v43; // rdi
  __int64 v44; // rsi
  __int64 v45; // rsi
  __int64 v46; // rsi
  __int64 v47; // r8
  int v48; // esi
  int v49; // r8d
  int v50; // r9d
  int v51; // esi
  int v52; // r8d
  int v53; // r9d
  __int64 v54; // rax
  __int64 v55; // rsi
  int v56; // esi
  int v57; // r8d
  int v58; // r9d
  int v59; // esi
  int v60; // r8d
  int v61; // r9d
  __int64 v62; // rax
  __int64 v63; // rsi
  __int64 v64; // rsi
  __int64 result; // rax
  unsigned int v66; // [rsp+30h] [rbp-D8h] BYREF
  __int64 v67; // [rsp+38h] [rbp-D0h]
  __int64 v68; // [rsp+40h] [rbp-C8h]
  __int64 v69; // [rsp+48h] [rbp-C0h]
  unsigned int v70; // [rsp+50h] [rbp-B8h]
  __int64 v71; // [rsp+58h] [rbp-B0h]
  __int64 v72; // [rsp+60h] [rbp-A8h]
  __int64 v73; // [rsp+68h] [rbp-A0h]
  __int64 v74; // [rsp+70h] [rbp-98h]
  __int64 v75; // [rsp+78h] [rbp-90h]
  __int64 v76; // [rsp+80h] [rbp-88h]
  __int64 v77; // [rsp+88h] [rbp-80h]
  _QWORD v78[2]; // [rsp+90h] [rbp-78h] BYREF
  char v79[4]; // [rsp+A0h] [rbp-68h] BYREF
  __int64 v80; // [rsp+A4h] [rbp-64h]
  __int64 v81; // [rsp+B0h] [rbp-58h]
  int v82; // [rsp+B8h] [rbp-50h] BYREF
  int v83; // [rsp+C0h] [rbp-48h] BYREF
  __int64 v84; // [rsp+C8h] [rbp-40h]

  v71 = 0;
  v14 = 0;
  v72 = 0;
  v76 = 0;
  v68 = 0;
  v15 = 0;
  v73 = 0;
  v16 = 0;
  v74 = 0;
  v17 = 0;
  v75 = 0;
  v69 = 0;
  v18 = 0;
  v67 = 0;
  v19 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 1352LL))(
          a1: a4,
          a2: 0,
          a3: a5,
          a4,
          a5: 0);
  v71 = v19;
  if ( v19 != 0 )
  {
    v14 = MEMORY[0x79238](a1: v21, a2: v22, a3: v19, a4: 0);
    v72 = v14;
    if ( v14 == 0 )
    {
      v27 = MEMORY[0x79758](a1: v23);
      v30 = 545816;
LABEL_4:
      sub_1932BDD9C(a1: v28, a2: v29, a3: v30, a4: v28, a5: v27);
      goto LABEL_39;
    }
    v15 = sub_1932BE404(a1: v23, a2: v24, a3: v23, a4: a12, a5: v25, a6: v26);
    v73 = v15;
    if ( v15 != 0 )
    {
      (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)v21 + 1600LL))(
        a1: v21,
        a2: v22,
        a3: a11,
        a4: v21,
        a5: 0,
        a6: a12);
      v34 = MEMORY[0x791F0](a1: v31, a2: v32, a3: v15, a4: 1, a5: a12);
      v76 = v34;
      if ( v34 == 0 )
      {
        v27 = MEMORY[0x79758](a1: v33);
        v30 = 546656;
        goto LABEL_4;
      }
      v66 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v33 + 1312LL))(
              a1: v33,
              a2: v34,
              a3: a6,
              a4: v33);
      v70 = v66 + 1;
      if ( is_mul_ok((int)v66 + 1LL, 2u) )
        JUMPOUT(0x3265159E3LL);
      v68 = sub_1932BE404(a1: v35, a2: v36, a3: v35, a4: -1, a5: v37, a6: v38);
      if ( v68 != 0 )
      {
        v39 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)v21 + 1320LL))(
                a1: v21,
                a2: v22,
                a3: a6,
                a4: v21,
                a5: 0);
        v77 = v39;
        if ( v39 != 0 )
        {
          sub_1932CA15B(a1: v21, a2: v22, a3: v39, a4: v68, a5: 2LL * (int)v66);
          v40 = v68;
          *(_WORD *)(2LL * (int)v66 + v68) = 0;
          v83 = 2 * v70;
          v84 = v40;
          (*(void (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)v41 + 1328LL))(
            a1: v41,
            a2: v42,
            a3: a6,
            a4: v41,
            a5: v77);
          if ( (unsigned int)MEMORY[0x791E0](a1: v43, a2: v44, a3: 11, a4: v44, a5: 0, a6: &v83) != 0 )
          {
            if ( a13 == 0 || a14 == 0 )
              goto LABEL_37;
            if ( (unsigned int)MEMORY[0x79128](a1: v21, a2: v45, a3: 6, a4: a13, a5: 0, a6: &v66) != 0 )
            {
              v16 = sub_1932BE404(a1: v21, a2: v48, a3: v21, a4: v66, a5: v49, a6: v50);
              v74 = v16;
              if ( v16 == 0 )
                goto LABEL_38;
              if ( (unsigned int)MEMORY[0x79128](a1: v21, a2: v22, a3: 6, a4: a13, a5: v16, a6: &v66) != 0 )
              {
                if ( is_mul_ok(v66, 2u) )
                  JUMPOUT(0x326515B4ELL);
                v54 = sub_1932BE404(a1: v21, a2: v51, a3: v21, a4: -1, a5: v52, a6: v53);
                v69 = v54;
                if ( v54 == 0 )
                  goto LABEL_38;
                if ( MEMORY[0x79A80](a1: v21, a2: v22, a3: v16, a4: v54, a5: v66) != 0 )
                {
                  v78[0] = v69;
                  if ( (unsigned int)MEMORY[0x79128](a1: v21, a2: v55, a3: 4, a4: a13, a5: 0, a6: &v66) != 0 )
                  {
                    v17 = sub_1932BE404(a1: v21, a2: v56, a3: v21, a4: v66, a5: v57, a6: v58);
                    v75 = v17;
                    if ( v17 == 0 )
                      goto LABEL_38;
                    if ( (unsigned int)MEMORY[0x79128](a1: v21, a2: v22, a3: 4, a4: a13, a5: v17, a6: &v66) != 0 )
                    {
                      if ( is_mul_ok(v66, 2u) )
                        JUMPOUT(0x326515C06LL);
                      v62 = sub_1932BE404(a1: v21, a2: v59, a3: v21, a4: -1, a5: v60, a6: v61);
                      v67 = v62;
                      if ( v62 == 0 )
                        goto LABEL_38;
                      if ( MEMORY[0x79A80](a1: v21, a2: v22, a3: v17, a4: v62, a5: v66) != 0 )
                      {
                        v78[1] = v67;
                        if ( (unsigned int)MEMORY[0x79128](a1: v21, a2: v63, a3: 16, a4: a13, a5: v79, a6: &v66) != 0 )
                        {
                          v80 = 0;
                          v81 = 0;
                          if ( (unsigned int)MEMORY[0x79118](a1: v21, a2: v64, a3: 7, a4: a14, a5: &v82, a6: &v66) != 0 )
                          {
                            if ( ((v82 - 8704) & 0xFFFFFDFF) != 0 )
                            {
                              if ( v82 != 41984 && v82 != 43521 )
                              {
                                v47 = 2148073480LL;
                                goto LABEL_13;
                              }
                              v82 = 1;
                            }
                            else
                            {
                              v82 = 2;
                            }
                            if ( (unsigned int)MEMORY[0x791E0](a1: v21, a2: v46, a3: 2, a4: v46, a5: 0, a6: v78) != 0 )
                            {
LABEL_37:
                              if ( (unsigned int)MEMORY[0x791D8](a1: v21, a2: v45, a3: v45, a4: v14, a5: 3) != 0 )
                                goto LABEL_38;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          v47 = (unsigned int)MEMORY[0x79758](a1: v21);
LABEL_13:
          sub_1932BDD9C(a1: v21, a2: v46, a3: 545816, a4: v21, a5: v47);
LABEL_38:
          v18 = v67;
        }
      }
    }
  }
LABEL_39:
  if ( v14 != 0 )
    MEMORY[0x79218](a1: v21, a2: v22, a3: 0, a4: v14);
  if ( v71 != 0 )
    (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v21 + 1360LL))(
      a1: v21,
      a2: v22,
      a3: a5,
      a4: v21);
  if ( v15 != 0 )
    sub_1932C97D0(a1: v21, a2: v22, a3: v20, a4: v15);
  if ( v68 != 0 )
    sub_1932C97D0(a1: v21, a2: v22, a3: v20, a4: v68);
  if ( v16 != 0 )
    sub_1932C97D0(a1: v21, a2: v22, a3: v20, a4: v16);
  result = v69;
  if ( v69 != 0 )
    result = sub_1932C97D0(a1: v21, a2: v22, a3: v20, a4: v69);
  if ( v17 != 0 )
    result = sub_1932C97D0(a1: v21, a2: v22, a3: v20, a4: v17);
  if ( v18 != 0 )
    result = sub_1932C97D0(a1: v21, a2: v22, a3: v20, a4: v18);
  if ( v22 != 0 )
    return MEMORY[0x791E8](a1: v21, a2: v22, a3: v20, a4: v22);
  return result;
}
