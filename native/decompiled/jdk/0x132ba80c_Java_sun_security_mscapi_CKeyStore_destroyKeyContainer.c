// Java_sun_security_mscapi_CKeyStore_destroyKeyContainer
// rva 0x132ba80c  size 174  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_security_mscapi_CKeyStore_destroyKeyContainer(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        int a7,
        int a8,
        int a9,
        __int64 a10)
{
  __int64 result; // rax
  __int64 v12; // rsi
  __int64 v13; // rdi
  unsigned int v14; // eax
  __int64 v15; // rdi
  __int64 v16; // rsi

  a10 = 0;
  result = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 1352LL))(
             a1,
             a2: a5,
             a3: a5,
             a4,
             a5: 0);
  v13 = result;
  if ( result != 0 )
  {
    result = MEMORY[0x790E8](a1: result, a2: v12, a3: result, a4: &a10, a5: 0, a6: 1);
    if ( (_DWORD)result == 0 )
    {
      v14 = MEMORY[0x79758](a1: v13);
      result = sub_1932BDE64(a1: v15, a2: v16, a3: 545816, a4, a5: 546456, a6: v14);
    }
  }
  if ( v13 != 0 )
    return (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 1360LL))(
             a1: v13,
             a2: v12,
             a3: v12,
             a4,
             a5: v13);
  return result;
}
