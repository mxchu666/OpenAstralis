// sub_181EAA920
// rva 0x01eaa920  size 188  section .text  group runtime
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall sub_181EAA920(__int64 a1, __int64 a2, __int64 a3)
{
  __int64 v3; // r14
  __int64 v4; // r15
  unsigned int v5; // eax
  __int64 v6; // rcx
  __int64 v7; // rcx
  __int64 v8; // rdi
  __int64 v9; // rsi
  int v10; // r8d
  int v11; // r9d
  __int64 v12; // rax
  __int64 v13; // rcx
  __int64 v14; // rdi
  __int64 v15; // rsi
  __int64 v16; // rcx
  unsigned int v17; // ebx
  __int64 v19; // [rsp+10h] [rbp-18h]

  v5 = *(_DWORD *)(v4 + 320);
  v6 = v5 + 1;
  *(_DWORD *)(v4 + 320) = v6;
  sub_181EB8240(a1, a2, a3: v5, a4: v6, a5: (unsigned int)v6);
  v12 = sub_181EA1E20(a1: v8, a2: v9, a3, a4: v7, a5: v10, a6: v11);
  v19 = v12;
  if ( v12 != v3 )
    sub_181EABBC0(a1: v14, a2: v15, a3: v3 + 376654616, a4: v13, a5: v12);
  v16 = *(unsigned int *)(v4 + 320);
  v17 = *(_DWORD *)(v4 + 320) - 1;
  *(_DWORD *)(v4 + 320) = v17;
  sub_181EB82C0(a1: v14, a2: v15, a3: (unsigned int)v16, a4: v16, a5: v17);
  return v19;
}
