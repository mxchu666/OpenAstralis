// Java_sun_security_mscapi_CKeyStore_removeCngKey
// rva 0x132bb838  size 47  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_security_mscapi_CKeyStore_removeCngKey(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  __int64 result; // rax
  __int64 v7; // rdi
  __int64 v8; // rsi

  result = sub_1932CA2FF(a1, a2, a3: 0, a4: a5);
  if ( (_DWORD)result != 0 )
    return sub_1932BDD9C(a1: v7, a2: v8, a3: 546488, a4, a5: (unsigned int)result);
  return result;
}
