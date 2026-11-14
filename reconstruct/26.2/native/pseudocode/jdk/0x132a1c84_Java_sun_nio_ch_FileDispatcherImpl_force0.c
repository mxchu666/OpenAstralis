// Java_sun_nio_ch_FileDispatcherImpl_force0
// rva 0x132a1c84  size 94  section .text  group jdk
// window base 0x1932a1c84: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_FileDispatcherImpl_force0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  __int64 v6; // rax
  __int64 v7; // rdx
  __int64 v8; // rdi
  __int64 v9; // rsi
  __int64 v10; // rdi
  __int64 v11; // rsi

  v6 = sub_1932A2CD8(a1, a2, a3: a5);
  if ( v6 == -1 )
  {
    sub_1932B1570(a1: v8, a2: v9, a3: 534576, a4);
  }
  else
  {
    if ( (unsigned int)MEMORY[0x79790](a1: v8, a2: v9, a3: v7, a4: v6) != 0 || (unsigned int)MEMORY[0x79758]() == 5 )
      return 0;
    sub_1932B1580(a1: v10, a2: v11, a3: 534664, a4);
  }
  return 4294967291LL;
}
