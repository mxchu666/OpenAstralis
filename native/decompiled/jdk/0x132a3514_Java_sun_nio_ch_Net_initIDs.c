// Java_sun_nio_ch_Net_initIDs
// rva 0x132a3514  size 142  section .text  group jdk
// window base 0x1932a3514: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_Net_initIDs(__int64 a1, __int64 a2, __int64 a3, __int64 a4)
{
  __int64 result; // rax
  __int64 v6; // rsi
  __int64 v7; // rdi
  __int64 v8; // rsi
  __int64 v9; // rdx
  __int64 v10; // rdi
  __int64 v11; // rsi

  result = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a4 + 48LL))(a1, a2, a3: 535096);
  if ( result != 0 )
  {
    MEMORY[0x337118] = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 168LL))(
                         a1: result,
                         a2: v6,
                         a3: result,
                         a4);
    if ( MEMORY[0x337118] != 0 )
    {
      result = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 264LL))(
                 a1: v7,
                 a2: v8,
                 a3: v7,
                 a4,
                 a5: 535156,
                 a6: 535128);
      MEMORY[0x337120] = result;
      if ( result != 0 )
        return sub_1932AA210(a1: v10, a2: v11, a3: v9, a4);
    }
    else
    {
      return sub_1932B15D0(a1: v7, a2: v8, a3: 0, a4);
    }
  }
  return result;
}
