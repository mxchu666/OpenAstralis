// Java_sun_security_mscapi_CSignature_importPublicKey
// rva 0x132bcc44  size 429  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_security_mscapi_CSignature_importPublicKey(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  __int64 v9; // r15
  unsigned int v10; // eax
  __int64 v11; // rsi
  __int64 v12; // rdi
  __int64 v13; // rsi
  __int64 v14; // rdi
  __int64 v15; // rsi
  unsigned int v16; // eax
  __int64 v17; // rdi
  __int64 v18; // rsi
  __int64 v19; // rsi
  __int64 v20; // r8
  int v22; // [rsp+0h] [rbp-88h]
  int v23; // [rsp+8h] [rbp-80h]
  __int64 v24; // [rsp+10h] [rbp-78h]
  __int64 v25; // [rsp+18h] [rbp-70h]
  _QWORD v26[2]; // [rsp+40h] [rbp-48h] BYREF
  __int64 v27; // [rsp+50h] [rbp-38h]

  v26[0] = 0;
  v26[1] = 0;
  v27 = 0;
  v9 = 0;
  v10 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a4 + 1368LL))(a1, a2, a3: a6);
  v13 = (*(__int64 (__fastcall **)(_QWORD, __int64, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 1472LL))(
          a1: v10,
          a2: v11,
          a3: a6,
          a4,
          a5: 0);
  v27 = v13;
  if ( v13 != 0 )
  {
    if ( ((unsigned int)MEMORY[0x790E8](a1: v12, a2: v13, a3: 0, a4: v26, a5: 0, a6: 24) != 0
       || (unsigned int)MEMORY[0x790E8](a1: v14, a2: v15, a3: 0, a4: v26, a5: 0, a6: 1) != 0)
      && (unsigned int)MEMORY[0x79140](a1: v14, a2: v15, a3: v15, a4: v26[0], a5: (unsigned int)v14, a6: 0) != 0 )
    {
      v12 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 48LL))(
              a1: v14,
              a2: v19,
              a3: 546976,
              a4);
      if ( v12 != 0 )
      {
        v20 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 904LL))(
                a1: v12,
                a2: v13,
                a3: v12,
                a4,
                a5: 546876,
                a6: 547008);
        if ( v20 != 0 )
          v9 = sub_1932BA588(a1: v12, a2: v13, a3: v12, a4, a5: v20, a6: a5, a7: v22, a8: v23, a9: v24, a10: v25);
      }
    }
    else
    {
      v16 = MEMORY[0x79758](a1: v14);
      sub_1932BDD9C(a1: v17, a2: v18, a3: 545816, a4, a5: v16);
    }
  }
  if ( v13 != 0 )
    (*(void (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 1536LL))(
      a1: v12,
      a2: v13,
      a3: a6,
      a4,
      a5: v13,
      a6: 2);
  return v9;
}
