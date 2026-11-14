// sub_18158E1E0
// rva 0x0158e1e0  size 282  section .text  group samples
// window base 0x18158e1e0: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall sub_18158E1E0(__int64 a1, __int64 a2, _DWORD *a3, __int64 a4, unsigned int a5, __int64 a6)
{
  __int64 v6; // r13
  _DWORD *v7; // r14
  __int64 v8; // r15
  __int64 (*v9)(void); // rax
  _DWORD *v10; // rax
  __int64 v11; // rdi
  __int64 v12; // rsi
  __int64 (__fastcall *v13)(__int64, __int64, _DWORD *, _QWORD, __int64); // rcx
  _DWORD *v14; // rax
  __int64 v15; // rdi
  __int64 v16; // rsi
  _DWORD *v17; // rax
  __int64 v18; // rdi
  __int64 v19; // rsi
  __int64 v20; // r8
  _DWORD *v21; // rdx
  _DWORD *v22; // rcx
  __int64 result; // rax
  __int64 v24; // [rsp+0h] [rbp-28h] BYREF
  _DWORD *v25; // [rsp+10h] [rbp-18h]
  __int64 v26; // [rsp+18h] [rbp-10h]
  unsigned int v27; // [rsp+24h] [rbp-4h]

  v27 = a5;
  if ( (unsigned __int64)&v24 <= *(_QWORD *)(v8 + 8) )
  {
    v26 = a6;
    v25 = a3;
    MEMORY[0x181EB84E0]();
  }
  else if ( a3 != v7 )
  {
    v26 = a6;
    v9 = (__int64 (*)(void))(v6 + *(_QWORD *)&v7[2 * (*a3 >> 3) + 46]);
    v25 = a3;
    v10 = (_DWORD *)v9();
    if ( v10 == v7 )
    {
LABEL_14:
      MEMORY[0x182771080]();
      goto LABEL_15;
    }
    v13 = (__int64 (__fastcall *)(__int64, __int64, _DWORD *, _QWORD, __int64))(v6 + *(_QWORD *)&v7[2 * (*v10 >> 3) + 64]);
    v14 = (_DWORD *)v13(a1: v11, a2: v12, a3: v10, a4: v13, a5: v26);
    if ( v14 == v7 )
    {
LABEL_15:
      MEMORY[0x182771080]();
LABEL_16:
      MEMORY[0x182771080](a1: v18, a2: v19, a3: v25, a4: v22, a5: v20, a6: v26);
      __builtin_debugtrap();
      __builtin_debugtrap();
      __builtin_debugtrap();
      __builtin_debugtrap();
      __builtin_debugtrap();
      __builtin_debugtrap();
      return sub_18158E300();
    }
    v17 = (_DWORD *)((__int64 (__fastcall *)(__int64, __int64, _DWORD *))(v6 + *(_QWORD *)&v7[2 * (*v14 >> 3) + 36]))(
                      a1: v15,
                      a2: v16,
                      a3: v14);
    v20 = v27;
    if ( v27 != 0 )
      v21 = v7 + 87742672;
    else
      v21 = v7 + 90424442;
    v22 = v21;
    if ( v17 == v7 )
      goto LABEL_16;
    result = ((__int64 (__fastcall *)(__int64, __int64, _DWORD *, _DWORD *, _DWORD *))(v6
                                                                                     + *(_QWORD *)&v7[2 * (*v17 >> 3) + 30]))(
               a1: v18,
               a2: v19,
               a3: v17,
               a4: v21,
               a5: v21);
    if ( *(int *)(v8 + 16) <= 0 )
      return MEMORY[0x18277F280]();
    return result;
  }
  v26 = a6;
  MEMORY[0x182771080]();
  goto LABEL_14;
}
