// sub_184F36F80
// rva 0x04f36f80  size 469  section .text  group runtime
// window base 0x184f36f80: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall sub_184F36F80(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5)
{
  unsigned int v5; // ebx
  __int64 v6; // r14
  __int64 v7; // r15
  __int64 v8; // rcx
  unsigned int v9; // eax
  __int64 v10; // rbp
  __int64 v11; // r10
  unsigned int v12; // esi
  __int64 v13; // rcx
  __int64 v14; // rsi
  unsigned int v15; // r11d
  int v16; // r12d
  __int64 v17; // rdi
  __int64 v18; // rax
  __int64 v19; // rdx
  __int64 v20; // rdi
  __int64 v21; // rsi
  __int64 result; // rax
  unsigned __int64 v23; // rdx
  unsigned __int64 v24; // r9
  __int64 v25; // [rsp+0h] [rbp-38h] BYREF
  __int64 v26; // [rsp+8h] [rbp-30h]
  __int64 v27; // [rsp+10h] [rbp-28h]
  __int64 v28; // [rsp+18h] [rbp-20h]
  unsigned int v29; // [rsp+20h] [rbp-18h]
  int v30; // [rsp+24h] [rbp-14h]
  int v31; // [rsp+28h] [rbp-10h]
  int v32; // [rsp+2Ch] [rbp-Ch]
  unsigned int v33; // [rsp+30h] [rbp-8h]
  unsigned int v34; // [rsp+34h] [rbp-4h]

  if ( (unsigned __int64)&v25 <= *(_QWORD *)(v7 + 8) )
  {
    v26 = a5;
    MEMORY[0x181EB84E0]();
    goto LABEL_19;
  }
  v28 = a3;
  if ( a5 != v6 )
  {
    v8 = *(unsigned int *)(a5 + 4);
    v9 = *(char *)(a3 + 12);
    v34 = v9;
    v5 = *(_DWORD *)(a3 + 8);
    v10 = *(unsigned int *)(a3 + 4);
    v11 = v6 + 8 * v10;
    if ( (_DWORD)v8 != 0 )
    {
      v12 = *(_DWORD *)(v6 + 8 * v8 + 8);
      v13 = (unsigned int)*(char *)(a5 + 12);
      v14 = v12 >> *(_BYTE *)(a5 + 12);
      v15 = v5 + v14;
      v32 = v5 + v14;
      v16 = v13 | v9;
      v17 = (unsigned int)(char)(v13 | v9);
      if ( v9 != (_DWORD)v17 )
        goto LABEL_5;
      v13 = (unsigned int)v17;
      v23 = (__int64)(int)v15 << v17;
      if ( (_DWORD)v10 != 0 )
      {
        if ( v23 <= *(unsigned int *)(v6 + 8 * v10 + 8) )
        {
          v29 = v17;
          v30 = v14;
          v33 = v5;
          v26 = a5;
          v18 = v6 + 8 * v10;
LABEL_7:
          v27 = v18;
          MEMORY[0x184FF2C40](a1: v29, a2: v14, a3: v26, a4: v13, a5: v18, a6: v33);
          result = v28;
          *(_DWORD *)(v28 + 8) = v32;
          if ( *(int *)(v7 + 16) <= 0 )
            return MEMORY[0x18277F280](a1: v20, a2: v21, a3: v19, a4: v27);
          return result;
        }
LABEL_5:
        v31 = v16;
        v30 = v14;
        v26 = a5;
        v27 = v6 + 8 * v10;
        v29 = v17;
        v33 = v5;
        v18 = sub_184F38CC0(a1: v15, a2: (unsigned int)v17, a3: v27, a4: v13, a5: v9, a6: v5);
        v13 = v28;
        *(_DWORD *)(v28 + 4) = (unsigned __int64)(v18 - v6) >> 3;
        if ( (*(_DWORD *)v13 & 2) != 0 )
        {
          v24 = (v13 & 0xFFFFFFFFFFF80000LL) + 2112;
          if ( *(_BYTE *)((v13 & 0xFFFFFFFFFFF80000LL) + ((v13 - v24) >> 9) + 0x38) != 0 )
            *(_BYTE *)((v13 & 0xFFFFFFFFFFF80000LL) + ((v13 - v24) >> 9) + 0x38) = 0;
        }
        *(_BYTE *)(v13 + 12) = v31;
        goto LABEL_7;
      }
LABEL_20:
      MEMORY[0x182771080](a1: v17, a2: v14, a3: v23, a4: v9);
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
      return sub_184F37160();
    }
LABEL_19:
    v27 = v11;
    v33 = v5;
    v26 = a5;
    v9 = MEMORY[0x182771080]();
    goto LABEL_20;
  }
  sub_184F37F40();
  if ( *(int *)(v7 + 16) <= 0 )
    MEMORY[0x18277F280]();
  return v28;
}
