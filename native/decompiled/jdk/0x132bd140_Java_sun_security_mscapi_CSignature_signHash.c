// Java_sun_security_mscapi_CSignature_signHash
// rva 0x132bd140  size 806  section .text  group jdk
// window base 0x1932bd140: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_security_mscapi_CSignature_signHash(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        int a5,
        __int64 a6,
        int a7,
        __int64 a8,
        __int64 a9,
        int a10,
        unsigned int a11,
        __int64 a12,
        __int64 a13,
        __int64 a14)
{
  __int64 v15; // r14
  __int64 v16; // rdi
  __int64 v17; // rsi
  __int64 v18; // rdi
  __int64 v19; // rsi
  int v20; // r8d
  int v21; // r9d
  __int64 v22; // rdi
  __int64 v23; // rsi
  __int64 v24; // rdi
  __int64 v25; // rsi
  __int64 v26; // rsi
  unsigned int v27; // eax
  __int64 v28; // rdi
  __int64 v29; // rsi
  __int64 v30; // rdx
  __int64 v31; // rdi
  __int64 v32; // rsi
  __int64 v33; // r8
  __int64 v34; // r9
  void (__fastcall *v35)(__int64, __int64, __int64, __int64, _QWORD, _QWORD); // r10
  __int64 v36; // rdi
  __int64 v37; // rsi
  __int64 v38; // rsi
  __int64 v39; // rsi
  int v40; // esi
  int v41; // r8d
  int v42; // r9d
  __int64 v43; // rsi
  __int64 v44; // r14
  void (__fastcall *v45)(__int64, __int64, __int64, __int64, _QWORD, _QWORD); // r10
  __int64 v47[4]; // [rsp+0h] [rbp-1B8h] BYREF
  __int64 *v48; // [rsp+20h] [rbp-198h]
  unsigned int *v49; // [rsp+28h] [rbp-190h]
  char v50; // [rsp+30h] [rbp-188h]
  unsigned int v51; // [rsp+34h] [rbp-184h] BYREF
  __int64 v52; // [rsp+38h] [rbp-180h] BYREF
  int v53; // [rsp+40h] [rbp-178h] BYREF
  __int64 v54; // [rsp+48h] [rbp-170h] BYREF
  int v55; // [rsp+50h] [rbp-168h] BYREF
  int v56; // [rsp+54h] [rbp-164h] BYREF
  int v57; // [rsp+58h] [rbp-160h] BYREF
  int v58; // [rsp+5Ch] [rbp-15Ch] BYREF
  __int64 v59; // [rsp+60h] [rbp-158h]
  __int64 v60; // [rsp+68h] [rbp-150h]
  __int64 v61; // [rsp+70h] [rbp-148h]
  _BYTE v62[256]; // [rsp+80h] [rbp-138h] BYREF
  __int64 v63; // [rsp+180h] [rbp-38h]

  v61 = a6;
  v50 = a5;
  v52 = 0;
  v60 = 0;
  v59 = 0;
  v54 = 0;
  v15 = (unsigned int)sub_1932BDB50(a1: 0, a2: 0, a3: a12, a4, a5, a6, a7: v47[0], a8: v47[1], a9: v47[2]);
  v48 = &v52;
  if ( (unsigned int)MEMORY[0x79158](a1: v16, a2: v17, a3: v15, a4: a13, a5: 0, a6: 0) != 0 )
    goto LABEL_26;
  v55 = 256;
  v62[0] = 0;
  MEMORY[0x79128](a1: v18, a2: v19, a3: (unsigned int)(v19 + 6), a4: a13, a5: v62, a6: &v55);
  v53 = 0;
  v56 = 4;
  MEMORY[0x79128](a1: v22, a2: v23, a3: (unsigned int)(v23 + 27), a4: a13, a5: &v53, a6: &v56);
  LODWORD(v48) = v53;
  if ( (unsigned int)MEMORY[0x790E8](a1: v24, a2: v25, a3: v62, a4: &v54, a5: 0, a6: (unsigned int)(v25 + 24)) != 0 )
  {
    v48 = &v52;
    if ( (unsigned int)MEMORY[0x79158](a1: v18, a2: v26, a3: (unsigned int)v15, a4: v54, a5: 0, a6: 0) != 0 )
    {
LABEL_26:
      v32 = sub_1932BE404(a1: v18, a2: v19, a3: a4, a4: a11, a5: v20, a6: v21);
      v60 = v32;
      if ( v32 == 0 )
        goto LABEL_14;
      v35 = *(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 1600LL);
      v48 = (__int64 *)v32;
      v35(a1: v31, a2: v32, a3: v61, a4, a5: 0, a6: a11);
      if ( (unsigned int)MEMORY[0x79120](a1: v36, a2: v37, a3: 2, a4: v52, a5: v37) != 0 )
      {
        v57 = 4;
        LODWORD(v48) = 0;
        if ( (unsigned int)MEMORY[0x79118](a1: v18, a2: v38, a3: 7, a4: a14, a5: &v58, a6: &v57) != 0 )
        {
          if ( v58 != 41984 )
            JUMPOUT(0x326517335LL);
          v51 = 0;
          v49 = &v51;
          v48 = nullptr;
          if ( (unsigned int)MEMORY[0x79168](a1: v18, a2: v39, a3: 1, a4: v52, a5: 0, a6: v50 == 1) != 0 )
          {
            v31 = sub_1932BE404(a1: v18, a2: v40, a3: a4, a4: v51, a5: v41, a6: v42);
            v59 = v31;
            if ( v31 == 0 )
              goto LABEL_14;
            v49 = &v51;
            v48 = (__int64 *)v31;
            if ( (unsigned int)MEMORY[0x79168](a1: v31, a2: v32, a3: 1, a4: v52, a5: 0, a6: v50 == 1) != 0 )
            {
              v44 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1408LL))(
                      a1: v18,
                      a2: v43,
                      a3: v51,
                      a4);
              if ( v44 != 0 )
              {
                v45 = *(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 1664LL);
                v48 = (__int64 *)v31;
                v45(a1: v31, a2: v32, a3: v44, a4, a5: 0, a6: v51);
              }
LABEL_14:
              if ( v31 != 0 )
                sub_1932C97D0(a1: v31, a2: v32, a3: v30, a4: v31);
              if ( v32 != 0 )
                sub_1932C97D0(a1: v31, a2: v32, a3: v30, a4: v32);
              if ( v52 != 0 )
                MEMORY[0x79160]();
              if ( v54 != 0 )
                MEMORY[0x790F0](a1: v31, a2: v32, a3: 0, a4: v54);
              return sub_1932C8DE0(a1: v31, a2: v32, a3: v30, a4: (unsigned __int64)v47 ^ v63, a5: v33, a6: v34);
            }
          }
        }
      }
    }
  }
  v27 = MEMORY[0x79758](a1: v18);
  sub_1932BDD9C(a1: v28, a2: v29, a3: 546352, a4, a5: v27);
  goto LABEL_14;
}
