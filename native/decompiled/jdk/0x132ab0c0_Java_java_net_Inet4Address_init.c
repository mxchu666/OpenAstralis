// Java_java_net_Inet4Address_init
// rva 0x132ab0c0  size 132  section .text  group jdk
// window base 0x1932ab0c0: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
void __fastcall Java_java_net_Inet4Address_init(__int64 a1, __int64 a2, __int64 a3, __int64 a4)
{
  __int64 v5; // rax
  __int64 v6; // rdi
  __int64 v7; // rsi
  __int64 v8; // rdi
  __int64 v9; // rsi

  if ( MEMORY[0x3374F8] == 0 )
  {
    v5 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a4 + 48LL))(a1, a2, a3: 537568);
    if ( v5 != 0 )
    {
      MEMORY[0x337F50] = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 168LL))(
                           a1: v6,
                           a2: v7,
                           a3: v5,
                           a4);
      if ( MEMORY[0x337F50] != 0 )
      {
        MEMORY[0x337F48] = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64, __int64, __int64))(*(_QWORD *)a4 + 264LL))(
                             a1: v8,
                             a2: v9,
                             a3: MEMORY[0x337F50],
                             a4,
                             a5: 535156,
                             a6: 537592);
        if ( MEMORY[0x337F48] != 0 )
          MEMORY[0x3374F8] = 1;
      }
    }
  }
}
