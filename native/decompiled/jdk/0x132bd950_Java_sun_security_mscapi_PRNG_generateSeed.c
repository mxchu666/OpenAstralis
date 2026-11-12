// Java_sun_security_mscapi_PRNG_generateSeed
// rva 0x132bd950  size 395  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_security_mscapi_PRNG_generateSeed(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        int a6,
        int a7,
        __int64 a8,
        __int64 a9,
        int a10,
        __int64 a11)
{
  unsigned int v11; // r14d
  __int64 v14; // r15
  __int64 v15; // r12
  unsigned int v16; // r14d
  __int64 v17; // rdi
  __int64 v18; // rsi
  __int64 v19; // rax
  __int64 v20; // rdi
  __int64 v21; // rsi
  unsigned int v22; // eax
  __int64 v23; // rdi
  __int64 v24; // rsi
  __int64 v25; // rax

  v11 = a6;
  v14 = 0;
  v15 = 0;
  if ( a6 >= 0 )
  {
    if ( a6 <= 0 && (a1 = a11, a11 != 0) )
    {
      v11 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64))(*(_QWORD *)a4 + 1368LL))(a1: a11, a2: 0, a3: a11);
    }
    else
    {
      v20 = (*(__int64 (__fastcall **)(__int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 1408LL))(
              a1,
              a2: 0,
              a3: (unsigned int)a6);
      if ( v20 == 0 )
        goto LABEL_13;
    }
    v25 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 1472LL))(
            a1: v20,
            a2: v21,
            a3: v20,
            a4,
            a5: 0);
    v21 = v25;
    if ( v25 != 0 )
    {
      if ( (unsigned int)MEMORY[0x790F8](a1: v20, a2: v25, a3: v11, a4: a5, a5: v25) == 0 )
      {
LABEL_4:
        v22 = MEMORY[0x79758](a1: v20);
        sub_1932BDD9C(a1: v23, a2: v24, a3: 545728, a4, a5: v22);
        goto LABEL_13;
      }
      v15 = v20;
    }
  }
  else
  {
    v16 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64))(*(_QWORD *)a4 + 1368LL))(a1: a11, a2: 0, a3: a11);
    v19 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 1472LL))(
            a1: v17,
            a2: v18,
            a3: v17,
            a4,
            a5: 0);
    v14 = v19;
    if ( v19 == 0 )
      goto LABEL_13;
    if ( (unsigned int)MEMORY[0x790F8](a1: v20, a2: v21, a3: v16, a4: a5, a5: v19) == 0 )
      goto LABEL_4;
    v15 = 0;
  }
LABEL_13:
  if ( v14 != 0 )
    (*(void (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 1536LL))(
      a1: v20,
      a2: v21,
      a3: v20,
      a4,
      a5: v14,
      a6: 2);
  if ( v21 != 0 )
    (*(void (__fastcall **)(__int64, __int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 1536LL))(
      a1: v20,
      a2: v21,
      a3: v20,
      a4,
      a5: v21,
      a6: 0);
  return v15;
}
