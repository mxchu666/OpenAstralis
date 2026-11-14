// Java_sun_nio_ch_IOUtil_initIDs
// rva 0x132a2b48  size 134  section .text  group jdk
// window base 0x1932a2b48: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_IOUtil_initIDs(__int64 a1, __int64 a2, __int64 a3, __int64 a4)
{
  __int64 result; // rax
  __int64 v6; // rsi
  __int64 v7; // rdi
  __int64 v8; // rsi

  result = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a4 + 48LL))(a1, a2, a3: 534416);
  if ( result != 0 )
  {
    result = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 752LL))(
               a1: result,
               a2: v6,
               a3: result,
               a4,
               a5: 535016,
               a6: 535012);
    MEMORY[0x337110] = result;
    if ( result != 0 )
    {
      result = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 752LL))(
                 a1: v7,
                 a2: v8,
                 a3: v7,
                 a4,
                 a5: 534444,
                 a6: 534440);
      MEMORY[0x337108] = result;
    }
  }
  return result;
}
