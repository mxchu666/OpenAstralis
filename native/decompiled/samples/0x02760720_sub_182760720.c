// sub_182760720
// rva 0x02760720  size 306  section .text  group samples
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall sub_182760720(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5, __int64 a6)
{
  __int64 v6; // r14
  __int64 v7; // r15
  __int64 v8; // rcx
  _WORD *v9; // rbx
  __int64 v10; // rbp
  int v11; // eax
  __int64 result; // rax
  __int64 v13; // rax
  __int64 v14; // rcx
  int v15; // [rsp+0h] [rbp-28h] BYREF
  __int64 v16; // [rsp+10h] [rbp-18h]
  __int64 v17; // [rsp+18h] [rbp-10h]
  __int64 v18; // [rsp+20h] [rbp-8h]

  if ( (unsigned __int64)&v15 <= *(_QWORD *)(v7 + 8) )
  {
    MEMORY[0x181EB84E0]();
    goto LABEL_19;
  }
  v18 = a3;
  v17 = a5;
  v16 = a6;
  if ( *(_BYTE *)(a3 + 17) != 0 )
  {
LABEL_19:
    v13 = v6 + 373281248;
    if ( a6 == v6 )
      goto LABEL_23;
    v14 = v6 + 8LL * *(unsigned int *)(v6 + 8LL * (*(_DWORD *)a6 >> 3) + 12);
    goto LABEL_21;
  }
  if ( a6 == v6 )
  {
    while ( 1 )
    {
      v13 = sub_18275BEC0(a1, a2, a3, a4, a5: v6 + 373281248, a6: v6 + 373281248, a7: v15);
LABEL_23:
      v14 = v13;
LABEL_21:
      sub_18275BDA0(a1, a2, a3: v18, a4: v14, a5: v14, a6: v13, a7: v15);
    }
  }
  v8 = *(unsigned int *)(a3 + 20);
  v9 = *(_WORD **)(a3 + 8);
  v10 = v6 + 8 * v8;
  v11 = *(_DWORD *)a6 >> 3;
  if ( v11 == 4288437 )
  {
    result = (unsigned int)*(char *)(a6 + 4);
    if ( (_DWORD)v8 != 0 )
      *(_WORD *)((char *)v9 + v10) = *(char *)(a6 + 4);
    else
      *v9 = *(char *)(a6 + 4);
    __faststorefence();
    if ( *(int *)(v7 + 16) > 0 )
      return result;
    return sub_18277F280(a1, a2, a3);
  }
  if ( v11 != 4288459 )
  {
    sub_18275BEC0(
      a1,
      a2,
      a3,
      a4: v6 + 8LL * *(unsigned int *)(v6 + 8LL * (*(_DWORD *)a6 >> 3) + 12),
      a5: v6 + 8LL * *(unsigned int *)(v6 + 8LL * (*(_DWORD *)a6 >> 3) + 12),
      a6: v6 + 373281248,
      a7: v15);
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
    return sub_182760860();
  }
  result = (unsigned int)*(__int16 *)(a6 + 4);
  if ( (_DWORD)v8 != 0 )
    *(_WORD *)((char *)v9 + v10) = *(_WORD *)(a6 + 4);
  else
    *v9 = *(_WORD *)(a6 + 4);
  __faststorefence();
  if ( *(int *)(v7 + 16) <= 0 )
    return sub_18277F280(a1, a2, a3);
  return result;
}
