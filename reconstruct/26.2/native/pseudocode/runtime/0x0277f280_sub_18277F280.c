// sub_18277F280
// rva 0x0277f280  size 523  section .text  group runtime
// window base 0x18277f280: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall sub_18277F280(__int64 a1, __int64 a2, __int64 a3, __int64 a4)
{
  __int64 v4; // rax
  __int64 v5; // r14
  _DWORD *v6; // r15
  __int64 v8; // rdx
  __int64 v9; // rcx
  __int64 v10; // rdi
  __int64 v11; // rsi
  __int64 v12; // r8
  __int64 v13; // [rsp+158h] [rbp-10h]

  v13 = v4;
  if ( v6[81] != 0 )
  {
    v6[4] = 0x3FFFFFFF;
    __faststorefence();
    return v13;
  }
  if ( v6[5] == 1 )
  {
    sub_18277F660(a1, a2, a3: 1, a4, a5: 0, a6: 0);
    return v13;
  }
  MEMORY[0x1828C1C40](a1, a2, a3: v5 + 371975144);
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
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  return sub_18277F4A0(a1: v10, a2: v11, a3: v8, a4: v9, a5: v12);
}
