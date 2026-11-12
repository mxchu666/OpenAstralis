// sub_182756FC0
// rva 0x02756fc0  size 48  section .text  group runtime
// window base 0x182756fc0: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall sub_182756FC0(__int64 a1, __int64 a2, _DWORD *a3, __int64 a4, _DWORD *a5)
{
  __int64 v5; // r15
  __int64 v6; // rdx
  __int64 v7; // rdi
  __int64 v8; // rsi
  char v10; // [rsp+0h] [rbp-18h] BYREF
  _DWORD *v11; // [rsp+8h] [rbp-10h]
  _DWORD *v12; // [rsp+10h] [rbp-8h]

  if ( (unsigned __int64)&v10 > *(_QWORD *)(v5 + 8) )
  {
    v12 = a3;
    v11 = a5;
    sub_182756AA0(a1, a2, a3: 1, a4: (__int64)v11, a5: a3, a6: v11, a7: v10);
  }
  MEMORY[0x181EB84E0]();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  return sub_182757000(a1: v7, a2: v8, a3: v6);
}
