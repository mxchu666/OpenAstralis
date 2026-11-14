// Java_sun_security_mscapi_PRNG_releaseContext
// rva 0x132bdb34  size 25  section .text  group jdk
// window base 0x1932bdb34: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_security_mscapi_PRNG_releaseContext(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  __int64 result; // rax

  if ( a5 != 0 )
    return MEMORY[0x790F0](a1, a2, a3: 0, a4: a5);
  return result;
}
