// Java_sun_security_mscapi_CPublicKey_00024CRSAPublicKey_getModulus
// rva 0x132bc2bc  size 406  section .text  group jdk
// window base 0x1932bc2bc: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_security_mscapi_CPublicKey_00024CRSAPublicKey_getModulus(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  __int64 v7; // r15
  __int64 v8; // rdi
  __int64 v9; // rsi
  int v10; // r13d
  __int64 v11; // rcx
  __int64 v12; // r8
  __int64 v13; // rax
  __int64 v14; // rdx
  int v15; // r8d
  int v16; // r9d
  int v17; // r14d
  int v18; // edx
  int v19; // r8d

  v7 = 0;
  v10 = (*(__int64 (__fastcall **)(_QWORD, _QWORD, __int64))(*(_QWORD *)a4 + 1368LL))(a1: 0, a2: 0, a3: a5);
  v11 = a4;
  if ( v10 < 20 )
  {
    v12 = 546704;
LABEL_14:
    JNU_ThrowByName(a1: v8, a2: v9, a3: 546488, a4: v11, a5: v12);
    goto LABEL_15;
  }
  v13 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 1472LL))(
          a1: v8,
          a2: v9,
          a3: a5,
          a4,
          a5: 0);
  v9 = v13;
  if ( v13 == 0 )
    goto LABEL_15;
  if ( *(_BYTE *)v13 != 6 )
  {
    sub_1932BDD9C(a1: v8, a2: v13, a3: 546488, a4, a5: 2148073482LL);
    goto LABEL_15;
  }
  v17 = *(_DWORD *)(v13 + 12) >> 3;
  if ( v17 > v10 - 20 )
  {
    v12 = 546720;
    v11 = a4;
    goto LABEL_14;
  }
  v8 = sub_1932BE404(a1: v8, a2: v13, a3: a4, a4: v17, a5: v15, a6: v16);
  if ( v8 != 0 )
  {
    v18 = 0;
    v19 = v17 - 1;
    while ( v18 < v17 )
      *(_BYTE *)(v18++ + v8) = *(_BYTE *)(v19-- + v9 + 20);
    v7 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1408LL))(
           a1: v8,
           a2: v9,
           a3: (unsigned int)v17,
           a4);
    if ( v7 != 0 )
      (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 1664LL))(
        a1: v8,
        a2: v9,
        a3: v7,
        a4,
        a5: 0,
        a6: (unsigned int)v17);
  }
LABEL_15:
  if ( v9 != 0 )
    (*(void (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 1536LL))(
      a1: v8,
      a2: v9,
      a3: a5,
      a4,
      a5: v9,
      a6: 2);
  if ( v8 != 0 )
    sub_1932C97D0(a1: v8, a2: v9, a3: v14, a4: v8);
  return v7;
}
