// Java_sun_security_mscapi_CKey_cleanUp
// rva 0x132bbfc4  size 63  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_security_mscapi_CKey_cleanUp(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  __int64 result; // rax
  __int64 v8; // rdi
  __int64 v9; // rsi

  if ( a6 != 0 )
  {
    result = MEMORY[0x79108](a1, a2, a3, a4: a6);
    if ( a5 != 0 )
      return MEMORY[0x790F0](a1: v8, a2: v9, a3: 0, a4: a5);
  }
  else if ( a5 != 0 )
  {
    return sub_1932CA305(a1, a2, a3, a4: a5);
  }
  return result;
}
