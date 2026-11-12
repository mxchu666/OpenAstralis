// Java_sun_security_mscapi_PRNG_getContext
// rva 0x132bdadc  size 87  section .text  group jdk
// window base 0x1932bdadc: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_security_mscapi_PRNG_getContext(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        int a7,
        int a8,
        __int64 a9)
{
  __int64 v10; // rdi
  unsigned int v11; // eax
  __int64 v12; // rdi
  __int64 v13; // rsi

  a9 = 0;
  if ( (unsigned int)MEMORY[0x790E8](a1, a2, a3: 0, a4: &a9, a5: 0, a6: 1) == 0 )
  {
    v11 = MEMORY[0x79758](a1: v10);
    sub_1932BDD9C(a1: v12, a2: v13, a3: 545728, a4, a5: v11);
  }
  return a9;
}
