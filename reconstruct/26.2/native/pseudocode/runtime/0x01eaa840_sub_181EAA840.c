// sub_181EAA840
// rva 0x01eaa840  size 201  section .text  group runtime
// window base 0x181eaa840: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall sub_181EAA840(__int64 a1, __int64 a2, __int64 a3, __int64 a4, unsigned int a5)
{
  __int64 v5; // r14
  __int64 v6; // r15
  unsigned int v7; // eax
  __int64 v8; // rcx
  __int64 v9; // rcx
  __int64 v10; // rdi
  __int64 v11; // rsi
  __int64 v12; // rax
  __int64 v13; // rcx
  __int64 v14; // rdi
  __int64 v15; // rsi
  __int64 v16; // rcx
  unsigned int v17; // ebx
  char v19; // [rsp+0h] [rbp-28h]
  __int64 v20; // [rsp+8h] [rbp-20h]
  unsigned __int64 v21; // [rsp+18h] [rbp-10h]

  v7 = *(_DWORD *)(v6 + 320);
  v8 = v7 + 1;
  *(_DWORD *)(v6 + 320) = v8;
  v21 = __PAIR64__(a5, v7);
  sub_181EB8240(a1, a2, a3: v7, a4: v8, a5: (unsigned int)v8);
  sub_181EA1740(a1: v10, a2: v11, a3, a4: v9, a5: SHIDWORD(v21), a6: v5, a7: v19);
  v20 = v12;
  if ( v12 != v5 )
    sub_181EABBC0(a1: v14, a2: v15, a3: v5 + 376654616, a4: v13, a5: v12);
  v16 = *(unsigned int *)(v6 + 320);
  v17 = *(_DWORD *)(v6 + 320) - 1;
  *(_DWORD *)(v6 + 320) = v17;
  sub_181EB82C0(a1: v14, a2: v15, a3: (unsigned int)v16, a4: v16, a5: v17);
  return v20;
}
