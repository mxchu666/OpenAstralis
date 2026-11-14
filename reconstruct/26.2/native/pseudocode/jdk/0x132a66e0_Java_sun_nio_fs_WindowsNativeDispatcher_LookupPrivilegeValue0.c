// Java_sun_nio_fs_WindowsNativeDispatcher_LookupPrivilegeValue0
// rva 0x132a66e0  size 123  section .text  group jdk
// window base 0x1932a66e0: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_LookupPrivilegeValue0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  __int64 v5; // rax
  __int64 v6; // rdi
  __int64 v7; // rsi
  __int64 v8; // r8
  __int64 v9; // rbx
  __int64 v11; // rdx
  __int64 v12; // rdi
  __int64 v13; // rsi
  __int64 v14; // rdi
  unsigned int v15; // eax
  __int64 v16; // rdi
  __int64 v17; // rsi

  v5 = MEMORY[0x79390](a1: a4, a2: a5, a3: 8, a4: 0);
  v9 = v5;
  if ( v5 == 0 )
  {
    sub_1932B15B0(a1: v6, a2: v7, a3: 536328, a4: v6, a5: v8);
    return v9;
  }
  if ( (unsigned int)MEMORY[0x790D0](a1: v6, a2: v7, a3: v7, a4: 0, a5: v5) != 0 )
    return v9;
  MEMORY[0x79398](a1: v12, a2: v13, a3: v11, a4: v9);
  v15 = MEMORY[0x79758](a1: v14);
  sub_1932A6F44(a1: v16, a2: v17, a3: v15, a4: v16);
  return 0;
}
