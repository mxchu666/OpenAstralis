// sub_184F35F80
// rva 0x04f35f80  size 454  section .text  group runtime
// window base 0x184f35f80: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall sub_184F35F80(__int64 a1, __int64 a2, __int64 a3, __int64 a4, unsigned int a5)
{
  __int64 v5; // r14
  __int64 v6; // r15
  __int64 v7; // r9
  unsigned int v8; // eax
  unsigned int v9; // ebx
  __int64 v10; // rcx
  unsigned int v11; // ebp
  unsigned int v12; // r10d
  __int64 v13; // rax
  unsigned __int64 v14; // rdi
  __int64 v15; // rcx
  unsigned __int64 v17; // rbx
  __int64 v18; // [rsp+0h] [rbp-38h] BYREF
  __int64 v19; // [rsp+10h] [rbp-28h]
  __int64 v20; // [rsp+18h] [rbp-20h]
  unsigned int v21; // [rsp+20h] [rbp-18h]
  unsigned int v22; // [rsp+24h] [rbp-14h]
  unsigned int v23; // [rsp+28h] [rbp-10h]
  unsigned int v24; // [rsp+2Ch] [rbp-Ch]
  unsigned int v25; // [rsp+30h] [rbp-8h]
  unsigned int v26; // [rsp+34h] [rbp-4h]

  if ( (unsigned __int64)&v18 <= *(_QWORD *)(v6 + 8) )
  {
    v11 = a5;
    v8 = MEMORY[0x181EB84E0](a1, a2, a3, a4: a3);
    goto LABEL_20;
  }
  v7 = *(unsigned int *)(a3 + 4);
  v8 = *(_DWORD *)(a3 + 8);
  v9 = *(char *)(a3 + 12);
  v10 = v9 | ((255 - a5) >> 31);
  v11 = (char)(*(_BYTE *)(a3 + 12) | ((int)(255 - a5) < 0));
  v12 = v8 + 1;
  if ( v9 != v11 )
  {
    v26 = v9 | ((255 - a5) >> 31);
    goto LABEL_4;
  }
  v26 = v9 | ((255 - a5) >> 31);
  v10 = v11;
  v14 = (__int64)(int)v12 << v11;
  if ( (_DWORD)v7 == 0 )
  {
LABEL_20:
    v25 = v11;
    MEMORY[0x182771080](a1: v14, a2, a3: v8, a4: a3);
    goto LABEL_21;
  }
  if ( v14 <= *(unsigned int *)(v5 + 8 * v7 + 8) )
  {
    v23 = v8 + 1;
    v25 = v11;
    v22 = v8;
    v24 = a5;
    v15 = a3;
    v13 = v5 + 8 * v7;
    goto LABEL_6;
  }
LABEL_4:
  v24 = a5;
  v20 = a3;
  v21 = v9;
  v19 = v5 + 8 * v7;
  v23 = v8 + 1;
  v22 = v8;
  v25 = v11;
  v13 = sub_184F38CC0(a1: v12, a2: v11, a3: v19, a4: v10, a5: v9, a6: v8);
  v15 = v20;
  *(_DWORD *)(v20 + 4) = (unsigned __int64)(v13 - v5) >> 3;
  if ( (*(_DWORD *)v15 & 2) != 0 )
  {
    v17 = (v15 & 0xFFFFFFFFFFF80000LL) + 2112;
    if ( *(_BYTE *)((v15 & 0xFFFFFFFFFFF80000LL) + ((v15 - v17) >> 9) + 0x38) != 0 )
      *(_BYTE *)((v15 & 0xFFFFFFFFFFF80000LL) + ((v15 - v17) >> 9) + 0x38) = 0;
  }
  a3 = v26;
  *(_BYTE *)(v15 + 12) = v26;
  v9 = v25;
LABEL_6:
  if ( v9 == 0 )
  {
    if ( v13 != v5 )
    {
      if ( *(_DWORD *)(v13 + 8) > v22 )
      {
        *(_BYTE *)(v13 + v22 + 12) = v24;
        goto LABEL_8;
      }
LABEL_22:
      MEMORY[0x182771220](a1: v14, a2, a3: v22, a4: v15);
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
      __builtin_debugtrap();
      __builtin_debugtrap();
      __builtin_debugtrap();
      __builtin_debugtrap();
      __builtin_debugtrap();
      return sub_184F36160();
    }
LABEL_21:
    MEMORY[0x182771080](a1: v14, a2, a3, a4: v15);
    goto LABEL_22;
  }
  *(_WORD *)(v13 + (int)(2 * v22) + 12) = v24;
LABEL_8:
  *(_DWORD *)(v15 + 8) = v23;
  if ( *(int *)(v6 + 16) <= 0 )
    MEMORY[0x18277F280]();
  return v15;
}
