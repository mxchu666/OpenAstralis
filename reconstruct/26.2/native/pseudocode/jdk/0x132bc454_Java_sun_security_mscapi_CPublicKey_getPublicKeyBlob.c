// Java_sun_security_mscapi_CPublicKey_getPublicKeyBlob
// rva 0x132bc454  size 480  section .text  group jdk
// window base 0x1932bc454: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_security_mscapi_CPublicKey_getPublicKeyBlob(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  __int64 v7; // r14
  __int64 v8; // rbx
  __int64 v9; // rdi
  __int64 v10; // rsi
  int v11; // r8d
  int v12; // r9d
  unsigned int v13; // eax
  __int64 v14; // rdi
  __int64 v15; // rsi
  __int64 v16; // rdx
  __int64 v17; // rdx
  __int64 v18; // rdi
  __int64 v19; // rsi
  unsigned int v21; // [rsp+40h] [rbp-28h]

  v7 = 0;
  v8 = 0;
  if ( a6 != 0 )
  {
    if ( (unsigned int)MEMORY[0x79138](a1: a4, a2: a6, a3: 0, a4: a6, a5: 6) == 0 )
      goto LABEL_6;
  }
  else if ( (unsigned int)sub_1932CA2ED(a1: a4, a2: 0, a3: 0, a4: a5, a5: 546424) != 0 )
  {
LABEL_3:
    v13 = sub_1932CA2ED(a1: v9, a2: v10, a3: 0, a4: a5, a5: 546424);
    v16 = 546352;
LABEL_4:
    sub_1932BDD9C(a1: v14, a2: v15, a3: v16, a4: v14, a5: v13);
    goto LABEL_14;
  }
  v8 = sub_1932BE404(a1: v9, a2: v10, a3: v9, a4: v21, a5: v11, a6: v12);
  if ( v8 != 0 )
  {
    if ( v19 == 0 )
    {
      if ( (unsigned int)sub_1932CA2ED(a1: v18, a2: 0, a3: 0, a4: a5, a5: 546424) != 0 )
        goto LABEL_3;
      goto LABEL_12;
    }
    if ( (unsigned int)MEMORY[0x79138](a1: v18, a2: v19, a3: 0, a4: v19, a5: 6) == 0 )
    {
LABEL_6:
      v13 = MEMORY[0x79758](a1: v9);
      v16 = 546488;
      goto LABEL_4;
    }
LABEL_12:
    v7 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)v9 + 1408LL))(
           a1: v9,
           a2: v10,
           a3: v21,
           a4: v9);
    if ( v7 != 0 )
      (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)v18 + 1664LL))(
        a1: v18,
        a2: v19,
        a3: v7,
        a4: v18,
        a5: 0,
        a6: v21);
  }
LABEL_14:
  if ( v8 != 0 )
    sub_1932C97D0(a1: v18, a2: v19, a3: v17, a4: v8);
  return v7;
}
