// Java_sun_security_mscapi_CKeyStore_storePrivateKey
// rva 0x132bbddc  size 488  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_security_mscapi_CKeyStore_storePrivateKey(
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
        __int64 a11)
{
  __int64 v14; // r12
  __int64 v15; // rdi
  __int64 v16; // rsi
  unsigned int v17; // r14d
  __int64 v18; // rdi
  __int64 v19; // rsi
  __int64 v20; // rdi
  __int64 v21; // rsi
  unsigned int v22; // eax
  __int64 v23; // rdi
  __int64 v24; // rsi
  __int64 v25; // rsi
  __int64 v26; // r14
  __int64 v27; // r8
  int v29; // [rsp+0h] [rbp-88h]
  int v30; // [rsp+8h] [rbp-80h]
  __int64 v31; // [rsp+10h] [rbp-78h]
  __int64 v32; // [rsp+18h] [rbp-70h]
  _QWORD v33[2]; // [rsp+40h] [rbp-48h] BYREF
  __int64 v34; // [rsp+50h] [rbp-38h]
  __int64 v35; // [rsp+58h] [rbp-30h]

  v33[0] = 0;
  v33[1] = 0;
  v35 = 0;
  v34 = 0;
  v14 = 0;
  v16 = (*(__int64 (__fastcall **)(_QWORD, __int64, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 1352LL))(
          a1: 0,
          a2,
          a3: a11,
          a4,
          a5: 0);
  v34 = v16;
  if ( v16 != 0 )
  {
    v17 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 1368LL))(
            a1: v15,
            a2: v16,
            a3: a6,
            a4);
    v15 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 1472LL))(
            a1: v18,
            a2: v19,
            a3: a6,
            a4,
            a5: 0);
    v35 = v15;
    if ( v15 != 0 )
    {
      if ( (unsigned int)MEMORY[0x790E8](a1: v15, a2: v16, a3: v16, a4: v33, a5: 0, a6: 1) != 0
        && (unsigned int)MEMORY[0x79140](a1: v20, a2: v21, a3: v20, a4: v33[0], a5: v17, a6: 0) != 0 )
      {
        v26 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 48LL))(
                a1: v20,
                a2: v25,
                a3: 546784,
                a4);
        if ( v26 != 0 )
        {
          v27 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 904LL))(
                  a1: v15,
                  a2: v16,
                  a3: v26,
                  a4,
                  a5: 546876,
                  a6: 546816);
          if ( v27 != 0 )
            v14 = sub_1932BA588(a1: v15, a2: v16, a3: v26, a4, a5: v27, a6: a5, a7: v29, a8: v30, a9: v31, a10: v32);
        }
      }
      else
      {
        v22 = MEMORY[0x79758](a1: v20);
        sub_1932BDD9C(a1: v23, a2: v24, a3: 545816, a4, a5: v22);
      }
    }
  }
  if ( v16 != 0 )
    (*(void (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 1360LL))(
      a1: v15,
      a2: v16,
      a3: a11,
      a4,
      a5: v16);
  if ( v15 != 0 )
    (*(void (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 1536LL))(
      a1: v15,
      a2: v16,
      a3: a6,
      a4,
      a5: v15,
      a6: 2);
  return v14;
}
