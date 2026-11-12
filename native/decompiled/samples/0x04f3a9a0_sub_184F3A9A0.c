// sub_184F3A9A0
// rva 0x04f3a9a0  size 258  section .text  group samples
// window base 0x184f3a9a0: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall sub_184F3A9A0(__int64 a1, __int64 a2, __int64 a3, __int64 a4, int a5, int a6, char a7)
{
  __int64 v7; // r14
  __int64 v8; // r15
  __int64 result; // rax
  __int64 v10; // rdx
  __int64 v11; // rcx
  __int64 v12; // rdi
  __int64 v13; // rsi
  char v14; // [rsp+0h] [rbp-28h] BYREF
  __int64 v15; // [rsp+10h] [rbp-18h]
  __int64 v16; // [rsp+18h] [rbp-10h]
  int v17; // [rsp+20h] [rbp-8h]
  int v18; // [rsp+24h] [rbp-4h]

  if ( (unsigned __int64)&v14 <= *(_QWORD *)(v8 + 8) )
    goto LABEL_9;
  if ( a5 < 0 || a5 > *(_DWORD *)(a3 + 8) )
  {
    v18 = a6;
    v17 = a5;
    v16 = a3;
    v10 = *(_QWORD *)(v8 + 40);
    if ( (unsigned __int64)(v10 + 40) > *(_QWORD *)(v8 + 32) )
      goto LABEL_10;
    *(_QWORD *)(v8 + 40) = v10 + 40;
    *(_DWORD *)v10 = 34176760;
    *(_DWORD *)(v10 + 4) = 0;
    *(_QWORD *)(v10 + 8) = 0;
    *(_QWORD *)(v10 + 16) = 0;
    *(_QWORD *)(v10 + 24) = 0;
    *(_QWORD *)(v10 + 32) = 0;
    while ( 1 )
    {
      *(_DWORD *)(v10 + 20) = 46923644;
      *(_DWORD *)(v10 + 16) = *(_DWORD *)(v7 + 374343896);
      *(_DWORD *)(v10 + 12) = (unsigned __int64)(v10 - v7) >> 3;
      v15 = v10;
      MEMORY[0x18503B9A0](a1, a2, a3: v10, a4, a5: 0);
      MEMORY[0x182769900](a1: v12, a2: v13, a3: v15, a4: v11, a5: &a7);
LABEL_9:
      v18 = a6;
      v17 = a5;
      v16 = a3;
      MEMORY[0x181EB84E0]();
LABEL_10:
      v10 = MEMORY[0x181EAA920](a1, a2, a3: 34176760);
    }
  }
  v16 = a3;
  v17 = a5;
  v18 = a6;
  result = sub_184F4A340(a1, a2, a3, a4: a5, a5, a6, a7: v14);
  if ( *(int *)(v8 + 16) <= 0 )
    return MEMORY[0x18277F280]();
  return result;
}
