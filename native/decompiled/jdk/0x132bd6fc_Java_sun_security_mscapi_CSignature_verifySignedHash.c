// Java_sun_security_mscapi_CSignature_verifySignedHash
// rva 0x132bd6fc  size 594  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_security_mscapi_CSignature_verifySignedHash(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        unsigned int a6,
        int a7,
        int a8,
        int a9,
        int a10,
        __int64 a11,
        __int64 a12,
        unsigned int a13,
        __int64 a14,
        __int64 a15)
{
  __int64 v17; // r13
  __int64 v18; // rdi
  __int64 v19; // rsi
  __int64 v20; // rdi
  __int64 v21; // rsi
  int v22; // r8d
  int v23; // r9d
  __int64 v24; // rsi
  __int64 v25; // rdi
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
  int v36; // edi
  int v37; // esi
  int v38; // r8d
  int v39; // r9d
  void (__fastcall *v40)(__int64, __int64, __int64, __int64, _QWORD, _QWORD); // r10
  __int64 v41; // rdi
  __int64 v42; // rsi
  __int64 v43; // rsi
  __int64 v45[4]; // [rsp+0h] [rbp-1B8h] BYREF
  __int64 *v46; // [rsp+20h] [rbp-198h]
  int v47; // [rsp+28h] [rbp-190h]
  __int64 v48; // [rsp+30h] [rbp-188h] BYREF
  __int64 v49; // [rsp+38h] [rbp-180h] BYREF
  int v50; // [rsp+40h] [rbp-178h] BYREF
  __int64 v51; // [rsp+48h] [rbp-170h]
  __int64 v52; // [rsp+50h] [rbp-168h]
  __int64 v53; // [rsp+58h] [rbp-160h]
  __int64 v54; // [rsp+60h] [rbp-158h]
  _BYTE v55[256]; // [rsp+70h] [rbp-148h] BYREF
  __int64 v56; // [rsp+170h] [rbp-48h]

  v53 = a5;
  v54 = a12;
  v48 = 0;
  v52 = 0;
  v51 = 0;
  v49 = 0;
  v17 = (unsigned int)sub_1932BDB50(a1: 0, a2: 0, a3: a11, a4, a5, a6, a7: v45[0], a8: v45[1], a9: v45[2]);
  v46 = &v48;
  if ( (unsigned int)MEMORY[0x79158](a1: v18, a2: v19, a3: v17, a4: a14, a5: 0, a6: 0) != 0
    || (v50 = 256,
        v55[0] = 0,
        MEMORY[0x79128](a1: v20, a2: v21, a3: (unsigned int)(v20 + 6), a4: a14, a5: v55, a6: &v50),
        LODWORD(v46) = v24,
        (unsigned int)MEMORY[0x790E8](a1: v25, a2: v24, a3: v55, a4: &v49, a5: 0, a6: (unsigned int)(v25 + 24)) != 0)
    && (v46 = &v48, (unsigned int)MEMORY[0x79158](a1: v20, a2: v26, a3: (unsigned int)v17, a4: v49, a5: 0, a6: 0) != 0) )
  {
    v31 = sub_1932BE404(a1: v20, a2: v21, a3: a4, a4: a6, a5: v22, a6: v23);
    v52 = v31;
    if ( v31 == 0 )
      goto LABEL_9;
    v35 = *(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 1600LL);
    v46 = (__int64 *)v31;
    v35(a1: v31, a2: v32, a3: v53, a4, a5: 0, a6);
    v32 = sub_1932BE404(a1: v36, a2: v37, a3: a4, a4: a13, a5: v38, a6: v39);
    v51 = v32;
    if ( v32 == 0 )
      goto LABEL_9;
    v40 = *(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 1600LL);
    v46 = (__int64 *)v32;
    v40(a1: v31, a2: v32, a3: v54, a4, a5: 0, a6: a13);
    if ( (unsigned int)MEMORY[0x79120](a1: v41, a2: v42, a3: 2, a4: v48, a5: v41) != 0 )
    {
      v47 = 0;
      v46 = nullptr;
      if ( (unsigned int)MEMORY[0x79170](a1: v20, a2: v43, a3: v43, a4: v48, a5: a13, a6: a15) != 1 )
        JUMPOUT(0x3265178ECLL);
LABEL_9:
      if ( v32 != 0 )
        sub_1932C97D0(a1: v31, a2: v32, a3: v30, a4: v32);
      if ( v31 != 0 )
        sub_1932C97D0(a1: v31, a2: v32, a3: v30, a4: v31);
      if ( v48 != 0 )
        MEMORY[0x79160]();
      if ( v49 != 0 )
        MEMORY[0x790F0](a1: v31, a2: v32, a3: 0, a4: v49);
      return sub_1932C8DE0(a1: v31, a2: v32, a3: v30, a4: (unsigned __int64)v45 ^ v56, a5: v33, a6: v34);
    }
  }
  v27 = MEMORY[0x79758](a1: v20);
  sub_1932BDD9C(a1: v28, a2: v29, a3: 546352, a4, a5: v27);
  goto LABEL_9;
}
