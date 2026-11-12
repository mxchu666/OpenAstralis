// sub_1815A2320
// rva 0x015a2320  size 691  section .text  group samples
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall sub_1815A2320(
        unsigned __int64 a1,
        __int64 a2,
        unsigned __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        char a7)
{
  __int64 v7; // r13
  char *v8; // r14
  __int64 v9; // r15
  __int64 v10; // rax
  __int64 v11; // rcx
  char *v12; // rbx
  __int64 v13; // rax
  __int64 v14; // rbp
  char *v15; // rsi
  __int64 (__fastcall *v16)(unsigned __int64, char *, char *); // rax
  __int64 v17; // rax
  unsigned __int64 v18; // rcx
  unsigned int v19; // eax
  __int64 v20; // rsi
  int v21; // esi
  __int64 v22; // rax
  unsigned __int64 v23; // r8
  unsigned __int64 v24; // rbx
  unsigned __int64 v25; // r8
  int v27; // edx
  int v28; // ecx
  int v29; // edi
  int v30; // esi
  int v31; // r8d
  int v32; // r9d
  __int64 v33; // [rsp+0h] [rbp-38h] BYREF
  char *v34; // [rsp+10h] [rbp-28h]
  char *v35; // [rsp+18h] [rbp-20h]
  unsigned int v36; // [rsp+24h] [rbp-14h]
  _DWORD *v37; // [rsp+28h] [rbp-10h]
  int v38; // [rsp+34h] [rbp-4h]

  if ( (unsigned __int64)&v33 <= *(_QWORD *)(v9 + 8) )
  {
    MEMORY[0x181EB84E0](a1, a2, a3, a4: a3);
LABEL_39:
    MEMORY[0x182771080](a1, a2, a3, a4: a3);
LABEL_40:
    MEMORY[0x182771080](a1, a2: v15, a3, a4: a3);
LABEL_41:
    LODWORD(v14) = v38;
    v19 = MEMORY[0x182771080](a1, a2: v34);
LABEL_42:
    v19 = MEMORY[0x182771220](a1, a2: v15, a3: (unsigned int)v14, a4: a3, a5: v19);
LABEL_43:
    MEMORY[0x182771220](a1, a2: v20, a3: (unsigned int)v20, a4: a3, a5: v19);
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
    return sub_1815A25E0(a1: v29, a2: v30, a3: v27, a4: v28, a5: v31, a6: v32, a7);
  }
  v10 = *(unsigned int *)(a3 + 20);
  if ( (_DWORD)v10 == 0 )
    goto LABEL_39;
  v37 = (_DWORD *)a3;
  v36 = *(_DWORD *)&v8[8 * v10 + 12];
  v11 = v36;
  v12 = &v8[8 * v36];
  v35 = v12;
  while ( *(_DWORD *)(a3 + 12) == 0 )
  {
    v13 = *(unsigned int *)(a3 + 4);
    LODWORD(v14) = *(_DWORD *)(a3 + 24);
    v15 = &v8[8 * v13];
    if ( (_DWORD)v13 == 0 && (int)v14 >= 1 )
    {
      v14 = (unsigned int)(v14 - 1);
      if ( (_DWORD)v11 == 0 )
        goto LABEL_40;
      v19 = *(_DWORD *)&v8[8 * v11 + 8];
      if ( v19 <= (unsigned int)v14 )
        goto LABEL_42;
      v15 = &v8[8 * *(unsigned int *)&v12[4 * v14 + 12]];
      while ( v15 == v8 && (int)v14 >= 1 )
      {
        v20 = (unsigned int)(v14 - 1);
        if ( v19 <= (unsigned int)v20 )
          goto LABEL_43;
        a1 = (unsigned __int64)&v8[8 * *(unsigned int *)&v12[4 * v20 + 12]];
        if ( *(int *)(v9 + 16) <= 0 )
        {
          v19 = MEMORY[0x18277F280](a1);
          LODWORD(v14) = v21;
          v15 = (char *)a1;
        }
        else
        {
          LODWORD(v14) = v14 - 1;
          v15 = &v8[8 * *(unsigned int *)&v12[4 * v20 + 12]];
        }
      }
    }
    *(_DWORD *)(a3 + 4) = (unsigned __int64)(v15 - v8) >> 3;
    if ( (*(_DWORD *)a3 & 2) != 0 )
    {
      a1 = a3 & 0xFFFFFFFFFFF80000LL;
      v23 = (a3 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((a3 & 0xFFFFFFFFFFF80000LL) + ((a3 - v23) >> 9) + 0x38) != 0 )
        *(_BYTE *)((a3 & 0xFFFFFFFFFFF80000LL) + ((a3 - v23) >> 9) + 0x38) = 0;
    }
    *(_DWORD *)(a3 + 24) = v14;
    if ( v15 == v8 )
    {
      v38 = v14;
      *(_DWORD *)(a3 + 16) = 0;
      if ( *(int *)(v9 + 16) <= 0 )
        MEMORY[0x18277F280]();
      return 0;
    }
    v38 = v14;
    v16 = (__int64 (__fastcall *)(unsigned __int64, char *, char *))(v7 + *(_QWORD *)&v8[8 * (*(_DWORD *)v15 >> 3) + 152]);
    v34 = v15;
    v17 = v16(a1, a2: v15, a3: v15);
    v18 = (unsigned __int64)v37;
    v37[3] = (unsigned __int64)(v17 - (_QWORD)v8) >> 3;
    if ( (*(_DWORD *)v18 & 2) != 0 )
    {
      v24 = (v18 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v18 & 0xFFFFFFFFFFF80000LL) + ((v18 - v24) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v18 & 0xFFFFFFFFFFF80000LL) + ((v18 - v24) >> 9) + 0x38) = 0;
    }
    if ( (char *)v17 == v8 )
    {
      v22 = *(unsigned int *)(v18 + 4);
      if ( (_DWORD)v22 == 0 )
        goto LABEL_41;
      *(_DWORD *)(v18 + 4) = *(_DWORD *)&v8[8 * v22 + 24];
      if ( (*(_DWORD *)v18 & 2) != 0 )
      {
        v25 = (v18 & 0xFFFFFFFFFFF80000LL) + 2112;
        if ( *(_BYTE *)((v18 & 0xFFFFFFFFFFF80000LL) + ((v18 - v25) >> 9) + 0x38) != 0 )
          *(_BYTE *)((v18 & 0xFFFFFFFFFFF80000LL) + ((v18 - v25) >> 9) + 0x38) = 0;
        v12 = v35;
        a3 = v18;
        v11 = v36;
      }
      else
      {
        v12 = v35;
        a3 = v18;
        v11 = v36;
      }
    }
    else
    {
      v12 = v35;
      a3 = v18;
      v11 = v36;
    }
  }
  if ( *(int *)(v9 + 16) <= 0 )
    MEMORY[0x18277F280](a1, a2, a3, a4: a3);
  return 1;
}
