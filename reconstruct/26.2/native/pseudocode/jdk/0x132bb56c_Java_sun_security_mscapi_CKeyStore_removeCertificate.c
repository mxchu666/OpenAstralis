// Java_sun_security_mscapi_CKeyStore_removeCertificate
// rva 0x132bb56c  size 716  section .text  group jdk
// window base 0x1932bb56c: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_security_mscapi_CKeyStore_removeCertificate(
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
        unsigned int a12)
{
  __int64 v13; // r13
  __int64 v14; // r12
  __int64 v15; // r14
  __int64 v16; // r15
  __int64 result; // rax
  __int64 v18; // rdx
  __int64 v19; // rdi
  __int64 v20; // rsi
  __int64 v21; // rax
  int v22; // r8d
  int v23; // r9d
  __int64 v24; // rdi
  __int64 v25; // rsi
  __int64 v26; // rdi
  __int64 v27; // rsi
  unsigned int v28; // eax
  __int64 v29; // rdi
  __int64 v30; // rsi
  __int64 v31; // rdx
  __int64 v32; // rax
  __int64 v33; // rsi
  int v34; // r8d
  int v35; // r9d
  __int64 v36; // rdi
  __int64 v37; // rsi
  int v38; // [rsp+30h] [rbp-78h]
  __int64 v39; // [rsp+38h] [rbp-70h]

  v13 = 0;
  v14 = 0;
  v15 = 0;
  v16 = 0;
  v38 = 0;
  result = (*(__int64 (__fastcall **)(_QWORD, _QWORD, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 1352LL))(
             a1: 0,
             a2: 0,
             a3: a5,
             a4,
             a5: 0);
  v39 = result;
  if ( result != 0 )
  {
    v21 = MEMORY[0x79238](a1: v19, a2: v20, a3: result, a4: 0);
    if ( v21 == 0 )
      goto LABEL_14;
    result = sub_1932BE404(a1: v19, a2: v21, a3: a4, a4: a12, a5: v22, a6: v23);
    v15 = result;
    if ( result == 0 )
      goto LABEL_16;
    (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 1600LL))(
      a1: v19,
      a2: v20,
      a3: a11,
      a4,
      a5: 0,
      a6: a12);
    v14 = MEMORY[0x791F0](a1: v24, a2: v25, a3: v15, a4: (unsigned int)(v24 + 1), a5: a12);
    if ( v14 == 0 )
    {
      v28 = MEMORY[0x79758](a1: v26);
      v31 = 546656;
LABEL_15:
      result = sub_1932BDD9C(a1: v29, a2: v30, a3: v31, a4, a5: v28);
      goto LABEL_16;
    }
    v32 = MEMORY[0x79208](a1: v26, a2: v27, a3: 1, a4: v27, a5: 0, a6: 851968);
    v19 = v32;
    if ( v32 == 0 )
    {
LABEL_14:
      v28 = MEMORY[0x79758](a1: v19);
      v31 = 545816;
      goto LABEL_15;
    }
    result = MEMORY[0x79240](a1: v32, a2: v33, a3: 5, a4: v32, a5: 0, a6: 0);
    if ( (unsigned int)result > 1 )
    {
      if ( is_mul_ok((unsigned int)result, 2u) )
        JUMPOUT(0x3265156F7LL);
      result = sub_1932BE404(a1: v19, a2: v20, a3: a4, a4: -1, a5: v34, a6: v35);
      v16 = result;
      if ( result != 0 )
      {
        MEMORY[0x79240](a1: v19, a2: v20, a3: 5, a4: v19, a5: 0, a6: 0);
        result = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 1320LL))(
                   a1: v36,
                   a2: v37,
                   a3: a6,
                   a4,
                   a5: 0);
        v13 = result;
        if ( result != 0 )
        {
          result = MEMORY[0x79C68](a1: v19, a2: v20, a3: v16, a4: result);
          if ( (_DWORD)result == 0 )
          {
            result = MEMORY[0x791F8](a1: v19, a2: v20, a3: v18, a4: v19);
            if ( (_DWORD)result == 0 )
            {
              v38 = 1;
              goto LABEL_14;
            }
          }
        }
      }
    }
  }
LABEL_16:
  if ( v20 != 0 )
    result = MEMORY[0x79218](a1: v19, a2: v20, a3: 0, a4: v20);
  if ( v39 != 0 )
    result = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 1360LL))(
               a1: v19,
               a2: v20,
               a3: a5,
               a4);
  if ( v13 != 0 )
    result = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 1328LL))(
               a1: v19,
               a2: v20,
               a3: a6,
               a4,
               a5: v13);
  if ( v15 != 0 )
    result = sub_1932C97D0(a1: v19, a2: v20, a3: v18, a4: v15);
  if ( v16 != 0 )
    result = sub_1932C97D0(a1: v19, a2: v20, a3: v18, a4: v16);
  if ( v14 != 0 )
    result = MEMORY[0x791E8](a1: v19, a2: v20, a3: v18, a4: v14);
  if ( v38 != 0 && v19 != 0 )
    return MEMORY[0x791E8](a1: v19, a2: v20, a3: v18, a4: v19);
  return result;
}
