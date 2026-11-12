// Java_sun_security_mscapi_CKeyPairGenerator_00024RSA_generateCKeyPair
// rva 0x132ba664  size 421  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_security_mscapi_CKeyPairGenerator_00024RSA_generateCKeyPair(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        int a6,
        int a7,
        int a8,
        int a9,
        int a10,
        __int64 a11)
{
  __int64 v13; // r14
  __int64 v14; // rax
  __int64 v15; // rsi
  __int64 v16; // rdi
  __int64 v17; // rdi
  __int64 v18; // rsi
  unsigned int v19; // eax
  __int64 v20; // rdi
  __int64 v21; // rsi
  __int64 v22; // r8
  __int64 v23; // rdi
  __int64 v24; // rsi
  __int64 v25; // r8
  int v27; // [rsp+0h] [rbp-78h]
  int v28; // [rsp+8h] [rbp-70h]
  __int64 v29; // [rsp+10h] [rbp-68h]
  __int64 v30; // [rsp+18h] [rbp-60h]
  __int64 v31; // [rsp+40h] [rbp-38h] BYREF
  __int64 v32; // [rsp+48h] [rbp-30h]
  __int64 v33; // [rsp+50h] [rbp-28h] BYREF

  v31 = 0;
  v13 = 0;
  v32 = 0;
  v14 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 1352LL))(
          a1,
          a2: (a6 << 16) | 1u,
          a3: a11,
          a4,
          a5: 0);
  v16 = v14;
  v32 = v14;
  if ( v14 != 0 )
  {
    if ( (unsigned int)MEMORY[0x790E8](a1: v14, a2: v15, a3: v14, a4: &v31, a5: 0, a6: 24) == 0
      && (unsigned int)MEMORY[0x790E8](a1: v17, a2: v18, a3: v17, a4: &v31, a5: 0, a6: 1) == 0 )
    {
      v19 = MEMORY[0x79758](a1: v17);
      v22 = 546456;
LABEL_5:
      sub_1932BDE64(a1: v20, a2: v21, a3: 546488, a4, a5: v22, a6: v19);
      goto LABEL_11;
    }
    if ( (unsigned int)MEMORY[0x79100](a1: v17, a2: v18, a3: 1, a4: v31, a5: (unsigned int)v18, a6: &v33) == 0 )
    {
      v19 = MEMORY[0x79758](a1: v23);
      v22 = 546520;
      goto LABEL_5;
    }
    v15 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 48LL))(
            a1: v23,
            a2: v24,
            a3: 546544,
            a4);
    if ( v15 != 0 )
    {
      v25 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 264LL))(
              a1: v16,
              a2: v15,
              a3: v15,
              a4,
              a5: 535156,
              a6: 546576);
      if ( v25 != 0 )
        v13 = sub_1932BA5D8(a1: v16, a2: v15, a3: v15, a4, a5: v25, a6: a5, a7: v27, a8: v28, a9: v29, a10: v30);
    }
  }
LABEL_11:
  if ( v16 != 0 )
    (*(void (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 1360LL))(
      a1: v16,
      a2: v15,
      a3: a11,
      a4,
      a5: v16);
  return v13;
}
