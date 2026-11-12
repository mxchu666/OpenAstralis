// sub_18503B9A0
// rva 0x0503b9a0  size 2441  section .text  group runtime
// window base 0x18503b9a0: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
unsigned int *__fastcall sub_18503B9A0(__int64 a1, __int64 a2, unsigned int *a3, __int64 a4, int a5)
{
  __int64 v5; // rbx
  __int64 v6; // rbp
  __int64 v7; // r14
  __int64 v8; // r15
  __int64 v9; // rax
  __int64 v10; // rsi
  __int64 v11; // rdi
  __int64 v12; // r9
  signed __int64 v13; // r10
  __int64 v14; // r11
  signed __int64 v15; // rax
  __int64 v16; // rax
  __int64 v17; // rcx
  __int64 v18; // rbx
  unsigned __int64 v19; // rsi
  unsigned __int64 j; // rbp
  unsigned __int64 v21; // rdx
  unsigned __int64 v22; // rsi
  unsigned __int64 v23; // rcx
  __int64 v25; // rsi
  __int64 v26; // rax
  __int64 v27; // rcx
  int v28; // ebx
  __int64 v29; // rdx
  __int64 v30; // rax
  __int64 v31; // rax
  __int64 v32; // rax
  __int64 v33; // rcx
  __int64 v34; // rbx
  __int64 v35; // r8
  unsigned __int64 i; // rbp
  __int64 v37; // rax
  __int64 v38; // rcx
  int v39; // ebx
  __int64 v40; // rdx
  __int64 v41; // rax
  unsigned __int64 v42; // rbp
  unsigned __int64 v43; // rbx
  unsigned __int64 v44; // rbx
  int v45; // eax
  unsigned __int64 v46; // rbx
  unsigned __int64 v47; // rbp
  unsigned __int64 v48; // rbx
  __int64 v49; // r8
  int v50; // [rsp+0h] [rbp-58h] BYREF
  int v51; // [rsp+8h] [rbp-50h]
  int v52; // [rsp+Ch] [rbp-4Ch]
  __int64 v53; // [rsp+10h] [rbp-48h]
  __int64 v54; // [rsp+18h] [rbp-40h]
  unsigned int *v55; // [rsp+20h] [rbp-38h]
  __int64 v56; // [rsp+28h] [rbp-30h]
  unsigned int v57; // [rsp+30h] [rbp-28h]
  int v58; // [rsp+34h] [rbp-24h]
  __int64 v59; // [rsp+38h] [rbp-20h]
  __int64 v60; // [rsp+40h] [rbp-18h]
  __int64 v61; // [rsp+48h] [rbp-10h]
  __int64 v62; // [rsp+50h] [rbp-8h]

  if ( (unsigned __int64)&v50 <= *(_QWORD *)(v8 + 8) )
  {
    v58 = a5;
    v9 = MEMORY[0x181EB84E0]();
    goto LABEL_102;
  }
  v55 = a3;
  v9 = 40472992;
  v62 = 34089600;
  v5 = 40478984;
  v6 = 43307504;
  if ( v8 == *(_QWORD *)(v7 + 376351704) )
  {
    v61 = 43307504;
    v60 = 40478984;
    v59 = 40472992;
    v58 = a5;
    if ( (unsigned int)MEMORY[0x18208C680](a1: a3, a2: v7 + 376381032, a3: v7 + 376381032, a4: 34089600, a5: a3) != 0 )
    {
      v23 = (unsigned __int64)v55;
    }
    else
    {
      v21 = (unsigned __int64)v55;
      if ( v55[4] != 0 || v55[1] != 0 )
      {
        v55[1] = 0;
        v32 = *(_QWORD *)(v8 + 40);
        if ( (unsigned __int64)(v32 + 40) > *(_QWORD *)(v8 + 32) )
        {
          v32 = MEMORY[0x181EAA920](a1: v11, a2: v22, a3: v61);
        }
        else
        {
          *(_QWORD *)(v8 + 40) = v32 + 40;
          *(_DWORD *)v32 = 43307504;
          *(_DWORD *)(v32 + 4) = 0;
          *(_QWORD *)(v32 + 8) = 0;
          *(_QWORD *)(v32 + 16) = 0;
          *(_QWORD *)(v32 + 24) = 0;
          *(_QWORD *)(v32 + 32) = 0;
        }
        v54 = v32;
        *(_DWORD *)(v32 + 20) = 1034;
        v33 = *(_QWORD *)(v8 + 40);
        if ( (unsigned __int64)(v33 + 24) > *(_QWORD *)(v8 + 32) )
        {
          v33 = MEMORY[0x181EAA920](a1: v11, a2: v22, a3: v60);
          v32 = v54;
        }
        else
        {
          *(_QWORD *)(v8 + 40) = v33 + 24;
          *(_DWORD *)v33 = 40478984;
          *(_DWORD *)(v33 + 4) = 0;
          *(_QWORD *)(v33 + 8) = 0;
          *(_QWORD *)(v33 + 16) = 0;
        }
        *(_DWORD *)(v33 + 8) = -5;
        v34 = *(_QWORD *)(v8 + 40);
        if ( (unsigned __int64)(v34 + 656) > *(_QWORD *)(v8 + 32) )
        {
          v53 = v33;
          v34 = MEMORY[0x181EAA840](a1: v11, a2: v22, a3: v62, a4: v33, a5: 80);
          v33 = v53;
          v32 = v54;
        }
        else
        {
          v35 = v62;
          *(_QWORD *)(v8 + 40) = v34 + 656;
          *(_QWORD *)v34 = v35;
          *(_DWORD *)(v34 + 8) = 80;
          *(_DWORD *)(v34 + 12) = 0;
          for ( i = 16; i < 0x290; i += 8LL )
            *(_QWORD *)(v34 + i) = 0;
        }
        *(_DWORD *)(v32 + 4) = (unsigned __int64)(v33 - v7) >> 3;
        if ( (*(_DWORD *)v32 & 2) != 0 )
        {
          v22 = (v32 & 0xFFFFFFFFFFF80000LL) + 2112;
          if ( *(_BYTE *)((v32 & 0xFFFFFFFFFFF80000LL) + ((v32 - v22) >> 9) + 0x38) != 0 )
            *(_BYTE *)((v32 & 0xFFFFFFFFFFF80000LL) + ((v32 - v22) >> 9) + 0x38) = 0;
        }
        *(_DWORD *)(v32 + 8) = (unsigned __int64)(v34 - v7) >> 3;
        if ( (*(_DWORD *)v32 & 2) != 0 )
        {
          v47 = (v32 & 0xFFFFFFFFFFF80000LL) + 2112;
          if ( *(_BYTE *)((v32 & 0xFFFFFFFFFFF80000LL) + ((v32 - v47) >> 9) + 0x38) != 0 )
            *(_BYTE *)((v32 & 0xFFFFFFFFFFF80000LL) + ((v32 - v47) >> 9) + 0x38) = 0;
        }
        MEMORY[0x182779880](a1: v11, a2: v22, a3: v32);
        v37 = v54;
        v38 = *(unsigned int *)(v54 + 8);
        v39 = *(_DWORD *)(v54 + 12);
        if ( v39 != 0 )
        {
          v40 = *(_QWORD *)(v8 + 40);
          if ( (unsigned __int64)(v40 + 24) > *(_QWORD *)(v8 + 32) )
          {
            v52 = *(_DWORD *)(v54 + 12);
            v51 = v38;
            v40 = MEMORY[0x181EAA920](a1: v11, a2: v22, a3: v59);
            v39 = v52;
            LODWORD(v38) = v51;
            v37 = v54;
          }
          else
          {
            *(_QWORD *)(v8 + 40) = v40 + 24;
            *(_DWORD *)v40 = 40472992;
            *(_DWORD *)(v40 + 4) = 0;
            *(_QWORD *)(v40 + 8) = 0;
            *(_QWORD *)(v40 + 16) = 0;
          }
          *(_DWORD *)(v40 + 8) = v39;
          *(_DWORD *)(v40 + 4) = v38;
        }
        else
        {
          v40 = v7 + 8 * v38;
        }
        v23 = (unsigned __int64)v55;
        *(_DWORD *)(v37 + 8) = 0;
        *(_DWORD *)(v37 + 12) = 0;
        *(_DWORD *)(v23 + 4) = (unsigned __int64)(v40 - v7) >> 3;
        if ( (*(_DWORD *)v23 & 2) != 0 )
        {
          v46 = (v23 & 0xFFFFFFFFFFF80000LL) + 2112;
          if ( *(_BYTE *)((v23 & 0xFFFFFFFFFFF80000LL) + ((v23 - v46) >> 9) + 0x38) != 0 )
            *(_BYTE *)((v23 & 0xFFFFFFFFFFF80000LL) + ((v23 - v46) >> 9) + 0x38) = 0;
        }
        *(_DWORD *)(v23 + 16) = *(_DWORD *)(v7 + 374343896);
        v21 = *(unsigned int *)v23;
        if ( (v21 & 2) != 0 )
        {
          v48 = (v23 & 0xFFFFFFFFFFF80000LL) + 2112;
          v21 = (v23 - v48) >> 9;
          if ( *(_BYTE *)((v23 & 0xFFFFFFFFFFF80000LL) + v21 + 0x38) != 0 )
            *(_BYTE *)((v23 & 0xFFFFFFFFFFF80000LL) + ((v23 - v48) >> 9) + 0x38) = 0;
        }
      }
      else
      {
        v23 = (unsigned __int64)v55;
      }
    }
    goto LABEL_20;
  }
  v10 = *(unsigned int *)(v7 + 8LL * (*a3 >> 3) + 48);
  v57 = v10;
  v11 = (int)v10;
  v56 = (int)v10;
  if ( (_DWORD)v10 == 0 )
  {
    v61 = 43307504;
    v60 = 40478984;
    v59 = 40472992;
    v58 = a5;
    goto LABEL_68;
  }
  v12 = *(unsigned int *)((char *)a3 + (int)v10);
  if ( (_DWORD)v12 == 0 )
  {
    v61 = 43307504;
    v60 = 40478984;
    v59 = 40472992;
    v58 = a5;
    goto LABEL_68;
  }
  if ( v8 == *(_QWORD *)(v7 + 376351704) )
  {
LABEL_102:
    v61 = v6;
    v60 = v5;
    v59 = v9;
    v58 = a5;
    goto LABEL_68;
  }
  v13 = *(_QWORD *)(v8 + 64);
  v14 = *(_QWORD *)(v7 + 8 * v12 + 16);
  if ( v14 == 0 )
  {
    v59 = 40472992;
    v15 = __sync_val_compare_and_swap((volatile signed __int64 *)(v7 + 8 * v12 + 16), 0, v13);
    v61 = 43307504;
    v60 = 40478984;
    v58 = a5;
    if ( v15 == 0 )
      goto LABEL_8;
    goto LABEL_68;
  }
  v61 = 43307504;
  v60 = 40478984;
  v59 = 40472992;
  v58 = a5;
  if ( v14 != v13 || (v45 = *(_DWORD *)(v7 + 8 * v12 + 28) + 1) < 0 )
  {
LABEL_68:
    MEMORY[0x18208CC20](a1: v11, a2: v10, a3, a4: a3);
    a3 = v55;
    goto LABEL_8;
  }
  *(_DWORD *)(v7 + 8 * v12 + 28) = v45;
LABEL_8:
  if ( a3[4] != 0 || a3[1] != 0 )
  {
    a3[1] = 0;
    v16 = *(_QWORD *)(v8 + 40);
    if ( (unsigned __int64)(v16 + 40) > *(_QWORD *)(v8 + 32) )
    {
      v16 = MEMORY[0x181EAA920](a1: v11, a2: v10, a3: v61);
    }
    else
    {
      *(_QWORD *)(v8 + 40) = v16 + 40;
      *(_DWORD *)v16 = 43307504;
      *(_DWORD *)(v16 + 4) = 0;
      *(_QWORD *)(v16 + 8) = 0;
      *(_QWORD *)(v16 + 16) = 0;
      *(_QWORD *)(v16 + 24) = 0;
      *(_QWORD *)(v16 + 32) = 0;
    }
    v54 = v16;
    *(_DWORD *)(v16 + 20) = 1034;
    v17 = *(_QWORD *)(v8 + 40);
    if ( (unsigned __int64)(v17 + 24) > *(_QWORD *)(v8 + 32) )
    {
      v17 = MEMORY[0x181EAA920](a1: v11, a2: v10, a3: v60);
      v16 = v54;
    }
    else
    {
      *(_QWORD *)(v8 + 40) = v17 + 24;
      *(_DWORD *)v17 = 40478984;
      *(_DWORD *)(v17 + 4) = 0;
      *(_QWORD *)(v17 + 8) = 0;
      *(_QWORD *)(v17 + 16) = 0;
    }
    *(_DWORD *)(v17 + 8) = -5;
    v18 = *(_QWORD *)(v8 + 40);
    if ( (unsigned __int64)(v18 + 656) > *(_QWORD *)(v8 + 32) )
    {
      v53 = v17;
      v18 = MEMORY[0x181EAA840](a1: v11, a2: v10, a3: v62, a4: v17, a5: 80);
      v17 = v53;
      v16 = v54;
    }
    else
    {
      v19 = v62;
      *(_QWORD *)(v8 + 40) = v18 + 656;
      *(_QWORD *)v18 = v19;
      *(_DWORD *)(v18 + 8) = 80;
      *(_DWORD *)(v18 + 12) = 0;
      for ( j = 16; j < 0x290; j += 8LL )
        *(_QWORD *)(v18 + j) = 0;
    }
    *(_DWORD *)(v16 + 4) = (unsigned __int64)(v17 - v7) >> 3;
    if ( (*(_DWORD *)v16 & 2) != 0 )
    {
      v19 = (v16 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v16 & 0xFFFFFFFFFFF80000LL) + ((v16 - v19) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v16 & 0xFFFFFFFFFFF80000LL) + ((v16 - v19) >> 9) + 0x38) = 0;
    }
    *(_DWORD *)(v16 + 8) = (unsigned __int64)(v18 - v7) >> 3;
    if ( (*(_DWORD *)v16 & 2) != 0 )
    {
      v42 = (v16 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v16 & 0xFFFFFFFFFFF80000LL) + ((v16 - v42) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v16 & 0xFFFFFFFFFFF80000LL) + ((v16 - v42) >> 9) + 0x38) = 0;
    }
    MEMORY[0x182779880](a1: v11, a2: v19, a3: v16);
    v26 = v54;
    v27 = *(unsigned int *)(v54 + 8);
    v28 = *(_DWORD *)(v54 + 12);
    if ( v28 != 0 )
    {
      v29 = *(_QWORD *)(v8 + 40);
      if ( (unsigned __int64)(v29 + 24) > *(_QWORD *)(v8 + 32) )
      {
        v51 = *(_DWORD *)(v54 + 12);
        v52 = v27;
        v29 = MEMORY[0x181EAA920](a1: v11, a2: v25, a3: v59);
        v28 = v51;
        LODWORD(v27) = v52;
        v26 = v54;
      }
      else
      {
        *(_QWORD *)(v8 + 40) = v29 + 24;
        *(_DWORD *)v29 = 40472992;
        *(_DWORD *)(v29 + 4) = 0;
        *(_QWORD *)(v29 + 8) = 0;
        *(_QWORD *)(v29 + 16) = 0;
      }
      *(_DWORD *)(v29 + 8) = v28;
      *(_DWORD *)(v29 + 4) = v27;
    }
    else
    {
      v29 = v7 + 8 * v27;
    }
    v23 = (unsigned __int64)v55;
    *(_DWORD *)(v26 + 8) = 0;
    *(_DWORD *)(v26 + 12) = 0;
    *(_DWORD *)(v23 + 4) = (unsigned __int64)(v29 - v7) >> 3;
    if ( (*(_DWORD *)v23 & 2) != 0 )
    {
      v43 = (v23 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v23 & 0xFFFFFFFFFFF80000LL) + ((v23 - v43) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v23 & 0xFFFFFFFFFFF80000LL) + ((v23 - v43) >> 9) + 0x38) = 0;
    }
    *(_DWORD *)(v23 + 16) = *(_DWORD *)(v7 + 374343896);
    if ( (*(_DWORD *)v23 & 2) != 0 )
    {
      v44 = (v23 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v23 & 0xFFFFFFFFFFF80000LL) + ((v23 - v44) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v23 & 0xFFFFFFFFFFF80000LL) + ((v23 - v44) >> 9) + 0x38) = 0;
      v22 = v57;
    }
    else
    {
      v22 = v57;
    }
  }
  else
  {
    v22 = v57;
    v23 = (unsigned __int64)a3;
  }
  if ( (_DWORD)v22 != 0 )
  {
    v11 = v56;
    v30 = *(unsigned int *)(v23 + v56);
    v21 = *(unsigned int *)(v7 + 8 * v30 + 28);
    if ( (_DWORD)v21 == 1 )
    {
      *(_QWORD *)(v7 + 8 * v30 + 16) = 0;
      __faststorefence();
    }
    else
    {
      *(_DWORD *)(v7 + 8 * v30 + 28) = v21 - 1;
    }
    if ( (_DWORD)v21 != 1 )
      goto LABEL_20;
    v31 = *(unsigned int *)(v7 + 8 * v30 + 4);
    if ( (_DWORD)v31 == 0 )
      goto LABEL_20;
    v41 = *(unsigned int *)(v7 + 8 * v31 + 8);
    if ( (_DWORD)v41 == 0 || *(_DWORD *)(v7 + 8 * v41 + 16) == 0 )
      goto LABEL_20;
    v49 = 1;
  }
  else
  {
    v49 = 0xFFFFFFFFLL;
  }
  MEMORY[0x18208CCA0](a1: v11, a2: v22, a3: v55, a4: v23, a5: v49);
  v23 = (unsigned __int64)v55;
LABEL_20:
  if ( *(int *)(v8 + 16) <= 0 )
  {
    MEMORY[0x18277F280](a1: v11, a2: v22, a3: v21, a4: v23);
    return v55;
  }
  return (unsigned int *)v23;
}
