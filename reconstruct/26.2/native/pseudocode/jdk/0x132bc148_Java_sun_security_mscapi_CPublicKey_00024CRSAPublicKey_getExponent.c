// Java_sun_security_mscapi_CPublicKey_00024CRSAPublicKey_getExponent
// rva 0x132bc148  size 369  section .text  group jdk
// window base 0x1932bc148: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_security_mscapi_CPublicKey_00024CRSAPublicKey_getExponent(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  __int64 v7; // r14
  __int64 v8; // rdi
  __int64 v9; // rsi
  __int64 v10; // rdx
  __int64 v11; // rdi
  _BYTE *v12; // rsi
  _BYTE *v13; // rax
  int v14; // r8d
  int v15; // r9d
  int v16; // edx
  int v17; // r8d

  v7 = 0;
  if ( (*(int (__fastcall **)(_QWORD, _QWORD, __int64))(*(_QWORD *)a4 + 1368LL))(a1: 0, a2: 0, a3: a5) >= 20 )
  {
    v13 = (_BYTE *)(*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 1472LL))(
                     a1: v8,
                     a2: v9,
                     a3: a5,
                     a4,
                     a5: 0);
    v12 = v13;
    if ( v13 != nullptr )
    {
      if ( *v13 == 6 )
      {
        v11 = sub_1932BE404(a1: v11, a2: (_DWORD)v13, a3: a4, a4: 4, a5: v14, a6: v15);
        if ( v11 != 0 )
        {
          v16 = 0;
          v17 = 3;
          while ( v16 < 4 )
            *(_BYTE *)(v16++ + v11) = v12[v17-- + 16];
          v7 = (*(__int64 (__fastcall **)(__int64, _BYTE *, __int64, __int64))(*(_QWORD *)a4 + 1408LL))(
                 a1: v11,
                 a2: v12,
                 a3: 4,
                 a4);
          if ( v7 != 0 )
            (*(void (__fastcall **)(__int64, _BYTE *, __int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1664LL))(
              a1: v11,
              a2: v12,
              a3: v7,
              a4,
              a5: 0,
              a6: 4);
        }
      }
      else
      {
        sub_1932BDD9C(a1: v11, a2: v13, a3: 546488, a4, a5: 2148073482LL);
      }
    }
  }
  else
  {
    JNU_ThrowByName(a1: v8, a2: v9, a3: 546488, a4, a5: 546704);
  }
  if ( v12 != nullptr )
    (*(void (__fastcall **)(__int64, _BYTE *, __int64, __int64, _BYTE *, __int64))(*(_QWORD *)a4 + 1536LL))(
      a1: v11,
      a2: v12,
      a3: a5,
      a4,
      a5: v12,
      a6: 2);
  if ( v11 != 0 )
    sub_1932C97D0(a1: v11, a2: v12, a3: v10, a4: v11);
  return v7;
}
