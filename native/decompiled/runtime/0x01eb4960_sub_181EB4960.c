// sub_181EB4960
// rva 0x01eb4960  size 1922  section .text  group runtime
// from Hex-Rays over a carved window; addresses are image addresses
unsigned __int64 __fastcall sub_181EB4960(__int64 a1, __int64 a2, _DWORD *a3, __int64 a4, int a5, _DWORD *a6, char a7)
{
  _DWORD *v7; // r14
  __int64 v8; // r15
  int v9; // eax
  unsigned int v10; // ebx
  __int64 v11; // rcx
  int v12; // ebp
  __int64 v13; // rbx
  _DWORD *v14; // r11
  int v15; // ebp
  unsigned __int64 result; // rax
  __int64 v17; // r12
  char v18; // r10
  unsigned int v19; // ebp
  __int64 v20; // rcx
  __int16 v21; // bp
  _DWORD *v22; // rdx
  _DWORD *v23; // r10
  __int64 v24; // r10
  __int64 v25; // rsi
  __int64 v26; // rdi
  unsigned __int64 v27; // rdx
  char *v28; // r8
  __int64 v29; // rcx
  unsigned __int64 v30; // r10
  __int64 v31; // rcx
  __int64 v32; // rbx
  unsigned __int64 v33; // r9
  _DWORD *v34; // rdx
  unsigned __int64 v35; // rdi
  char *v36; // r8
  unsigned __int64 v37; // rdi
  __int64 v38; // rsi
  __int64 v39; // rdi
  BOOL v40; // edx
  unsigned __int64 v41; // rdx
  unsigned __int64 v42; // rbx
  unsigned __int64 v43; // r9
  char *v44; // r8
  int i; // ebp
  __int64 v46; // rdx
  int v47; // eax
  __int64 v48; // rcx
  __int64 v49; // rdi
  __int64 v50; // rsi
  __int64 v51; // rax
  __int64 v52; // rdx
  char v53; // [rsp+0h] [rbp-78h] BYREF
  __int64 v54; // [rsp+10h] [rbp-68h]
  unsigned int v55; // [rsp+18h] [rbp-60h]
  int v56; // [rsp+1Ch] [rbp-5Ch]
  _DWORD *v57; // [rsp+20h] [rbp-58h]
  __int64 v58; // [rsp+28h] [rbp-50h]
  int v59; // [rsp+34h] [rbp-44h]
  _DWORD *v60; // [rsp+38h] [rbp-40h]
  _DWORD *v61; // [rsp+40h] [rbp-38h]
  __int64 v62; // [rsp+48h] [rbp-30h]
  __int64 v63; // [rsp+50h] [rbp-28h]
  __int64 v64; // [rsp+58h] [rbp-20h]
  __int64 v65; // [rsp+60h] [rbp-18h]
  unsigned int v66; // [rsp+68h] [rbp-10h]
  unsigned int j; // [rsp+6Ch] [rbp-Ch]
  unsigned int v68; // [rsp+70h] [rbp-8h]
  unsigned int v69; // [rsp+74h] [rbp-4h]

  v61 = a3;
  v60 = a6;
  v69 = a1;
  if ( (unsigned __int64)&v53 <= *(_QWORD *)(v8 + 8) )
    goto LABEL_80;
  v9 = v7[93585974];
  v59 = v9;
  if ( a3 == v7 || a6 == v7 )
  {
    v68 = a2;
    j = a5;
    v46 = *(_QWORD *)(v8 + 40);
    if ( (unsigned __int64)(v46 + 48) > *(_QWORD *)(v8 + 32) )
    {
      v46 = sub_181EAA920(a1, a2, a3: 34101256);
    }
    else
    {
      *(_QWORD *)(v8 + 40) = v46 + 48;
      *(_DWORD *)v46 = 34101256;
      *(_DWORD *)(v46 + 4) = 0;
      *(_QWORD *)(v46 + 8) = 0;
      *(_QWORD *)(v46 + 16) = 0;
      *(_QWORD *)(v46 + 24) = 0;
      *(_QWORD *)(v46 + 32) = 0;
      *(_QWORD *)(v46 + 40) = 0;
    }
    v47 = v59;
    *(_DWORD *)(v46 + 20) = 46923644;
    *(_DWORD *)(v46 + 16) = v47;
    *(_DWORD *)(v46 + 12) = (unsigned __int64)(v46 - (_QWORD)v7) >> 3;
    v58 = v46;
    MEMORY[0x18503B9A0](a1, a2, a3: v46, a4, a5: 0);
    v51 = v58;
    goto LABEL_79;
  }
  v10 = *a6;
  v11 = *a3 >> 3;
  v12 = v7[2 * v11 + 8];
  v66 = v12;
  v13 = v10 >> 3;
  v58 = (__int64)&v7[2 * v13];
  v14 = &v7[2 * v11];
  if ( (unsigned int)v12 < 0xE0000000 )
  {
    if ( (unsigned int)v12 >> 29 != 5 )
      goto LABEL_81;
    v17 = (v12 >> 8) & 0xFFF;
    v18 = v12;
    v19 = v11;
    v65 = v17 + ((unsigned __int64)(unsigned int)a1 << v18);
    v64 = v17 + ((unsigned __int64)(unsigned int)a5 << v18);
    v11 = (unsigned int)a2;
    v63 = 4LL * (unsigned int)a2;
    if ( a6 == a3 )
    {
      v57 = v14;
      v68 = a2;
      j = a5;
      if ( (int)a1 > a5 )
      {
        v62 = (unsigned int)a2;
        result = MEMORY[0x182784780]();
        v24 = v63;
        v25 = v64;
        v26 = v65;
        v27 = (unsigned __int64)v61;
        while ( v24 != 0 )
        {
          result = v24 - 4 + v26;
          *(_DWORD *)(v27 + result) = *(_DWORD *)(v27 + v24 - 4 + v25);
          if ( (*(_DWORD *)v27 & 2) != 0 )
          {
            if ( (_DWORD *)v27 == v7 )
              JUMPOUT(0x303D3EC15LL);
            if ( (*(_DWORD *)v27 & 1) != 0 )
            {
              v28 = (char *)(v27 - *(_QWORD *)(v27 - 8));
              if ( (_DWORD *)v27 == v7 )
                JUMPOUT(0x303D3EC54LL);
              result >>= 9;
              if ( v28[result + 48] != 0 )
                v28[result + 48] = 0;
            }
            else
            {
              result = (v27 & 0xFFFFFFFFFFF80000LL) + 2112;
              if ( *(_BYTE *)((v27 & 0xFFFFFFFFFFF80000LL) + ((v27 - result) >> 9) + 0x38) != 0 )
                *(_BYTE *)((v27 & 0xFFFFFFFFFFF80000LL) + ((v27 - result) >> 9) + 0x38) = 0;
            }
          }
          if ( *(int *)(v8 + 16) <= 0 )
          {
            result = MEMORY[0x18277F280]();
            v24 = v29;
          }
          else
          {
            v24 -= 4;
          }
        }
        if ( *(int *)(v8 + 16) <= 0 )
          return MEMORY[0x18277F280](a1: v26, a2: v25, a3: v27, a4: v62);
        return result;
      }
    }
    else
    {
      v57 = v14;
      v68 = a2;
      j = a5;
    }
    if ( (_DWORD)v13 == v19 )
    {
      v62 = (unsigned int)a2;
      MEMORY[0x182784780]();
      result = 0;
      v30 = v63;
      v31 = v64;
      v32 = v65;
      v33 = (unsigned __int64)v60;
      v34 = v61;
      while ( v30 > result )
      {
        v35 = result + v32;
        *(_DWORD *)(v33 + result + v32) = *(_DWORD *)((char *)v34 + v31 + result);
        result += 4LL;
        if ( (*(_DWORD *)v33 & 2) != 0 )
        {
          if ( (_DWORD *)v33 == v7 )
            JUMPOUT(0x303D3ECE4LL);
          if ( (*(_DWORD *)v33 & 1) != 0 )
          {
            v36 = (char *)(v33 - *(_QWORD *)(v33 - 8));
            if ( (_DWORD *)v33 == v7 )
              JUMPOUT(0x303D3ED23LL);
            v37 = v35 >> 9;
            if ( v36[v37 + 48] != 0 )
              v36[v37 + 48] = 0;
          }
          else if ( *(_BYTE *)((v33 & 0xFFFFFFFFFFF80000LL) + ((v33 - ((v33 & 0xFFFFFFFFFFF80000LL) + 2112)) >> 9) + 0x38) != 0 )
          {
            *(_BYTE *)((v33 & 0xFFFFFFFFFFF80000LL) + ((v33 - ((v33 & 0xFFFFFFFFFFF80000LL) + 2112)) >> 9) + 0x38) = 0;
          }
        }
      }
      if ( *(int *)(v8 + 16) <= 0 )
        return MEMORY[0x18277F280](a1: v32, a2: v31, a3: v34);
      return result;
    }
    if ( v7[2 * v13 + 8] >> 29 != 5 )
    {
      v9 = v59;
      goto LABEL_82;
    }
    v56 = v13;
    v55 = v19;
    MEMORY[0x182784780](a1, a2, a3: v61);
    result = (unsigned int)SLOWORD(v7[2 * v56 + 15]);
    v20 = v55;
    v21 = HIWORD(v7[2 * v55 + 15]);
    v22 = &v7[2 * v7[2 * v55 + 4]];
    if ( SLOWORD(v7[2 * v56 + 15]) < 0 )
    {
      v38 = v64;
      v39 = v65;
      v23 = v61;
      result = (unsigned int)v7[2 * v56 + 10];
      if ( (int)result >= 0x10000 )
      {
        v20 = (unsigned int)v21;
        for ( i = 0; 2 * SLOWORD(v7[2 * v55 + 16]) > i; i += 2 )
        {
          if ( (_DWORD)result == v22[(int)v20 + 3 + i] )
            goto LABEL_55;
        }
        goto LABEL_18;
      }
      v20 = HIBYTE(v7[2 * v55 + 11]);
      v40 = result == (unsigned __int16)*(_DWORD *)((char *)&v7[2 * v7[2 * v55 + 5]]
                                                  + (int)(4
                                                        * (v7[2 * v55 + 11]
                                                         & ((unsigned int)result >> HIBYTE(v7[2 * v55 + 11])))
                                                        + 12));
    }
    else
    {
      if ( v21 <= SLOWORD(v7[2 * v56 + 15]) )
      {
        v23 = v61;
        goto LABEL_18;
      }
      v38 = v64;
      v39 = v65;
      v23 = v61;
      v40 = v7[2 * v56 + 9] == v22[LOWORD(v7[2 * v56 + 15]) + 3];
    }
    if ( v40 )
    {
LABEL_55:
      v41 = 0;
      v42 = v63;
      v43 = (unsigned __int64)v60;
      while ( v42 > v41 )
      {
        result = v41 + v39;
        *(_DWORD *)(v43 + v41 + v39) = *(_DWORD *)((char *)v23 + v38 + v41);
        v41 += 4LL;
        if ( (*(_DWORD *)v43 & 2) != 0 )
        {
          if ( (_DWORD *)v43 == v7 )
            JUMPOUT(0x303D3EE24LL);
          if ( (*(_DWORD *)v43 & 1) != 0 )
          {
            v44 = (char *)(v43 - *(_QWORD *)(v43 - 8));
            if ( (_DWORD *)v43 == v7 )
              JUMPOUT(0x303D3EE63LL);
            result >>= 9;
            if ( v44[result + 48] != 0 )
              v44[result + 48] = 0;
          }
          else
          {
            result = (v43 & 0xFFFFFFFFFFF80000LL) + 2112;
            if ( *(_BYTE *)((v43 & 0xFFFFFFFFFFF80000LL) + ((v43 - result) >> 9) + 0x38) != 0 )
              *(_BYTE *)((v43 & 0xFFFFFFFFFFF80000LL) + ((v43 - result) >> 9) + 0x38) = 0;
          }
        }
      }
LABEL_19:
      if ( *(int *)(v8 + 16) <= 0 )
        return MEMORY[0x18277F280]();
      return result;
    }
LABEL_18:
    result = MEMORY[0x181595AE0](a1: v69, a2: v68, a3: v23, a4: v20, a5: j);
    goto LABEL_19;
  }
  if ( a6 != a3 )
  {
    v15 = v11;
LABEL_7:
    if ( (_DWORD)v13 == v15 )
    {
      v57 = &v7[2 * v11];
      v68 = a2;
      j = a5;
      MEMORY[0x182784780]();
      result = MEMORY[0x181596200](a1: v69, a2: v68, a3: v61, a4: v66, a5: j, a6: v60);
      if ( *(int *)(v8 + 16) > 0 )
        return result;
      return MEMORY[0x18277F280]();
    }
    v57 = &v7[2 * v11];
    v68 = a2;
    for ( j = a5; ; j = a5 )
    {
LABEL_82:
      v52 = *(_QWORD *)(v8 + 40);
      if ( (unsigned __int64)(v52 + 40) > *(_QWORD *)(v8 + 32) )
      {
        v52 = sub_181EAA920(a1, a2, a3: 35966824);
        v9 = v59;
      }
      else
      {
        *(_QWORD *)(v8 + 40) = v52 + 40;
        *(_DWORD *)v52 = 35966824;
        *(_DWORD *)(v52 + 4) = 0;
        *(_QWORD *)(v52 + 8) = 0;
        *(_QWORD *)(v52 + 16) = 0;
        *(_QWORD *)(v52 + 24) = 0;
        *(_QWORD *)(v52 + 32) = 0;
      }
      *(_DWORD *)(v52 + 20) = 46923644;
      *(_DWORD *)(v52 + 16) = v9;
      *(_DWORD *)(v52 + 12) = (unsigned __int64)(v52 - (_QWORD)v7) >> 3;
      v54 = v52;
      MEMORY[0x18503B9A0](a1, a2, a3: v52, a4: v11, a5: 0);
      v51 = v54;
LABEL_79:
      MEMORY[0x182769900](a1: v49, a2: v50, a3: v51, a4: v48, a5: &a7);
LABEL_80:
      v68 = a2;
      j = a5;
      v9 = sub_181EB84E0(a1, a2, (_DWORD)a3, a4, a5, (_DWORD)a6, a7: v53);
LABEL_81:
      v57 = v14;
      v68 = a2;
    }
  }
  v15 = v11;
  if ( (int)a1 <= a5 )
    goto LABEL_7;
  v57 = &v7[2 * v11];
  v68 = a2;
  j = a5;
  MEMORY[0x182784780](a1, a2, a3, a4: a6);
  result = MEMORY[0x1815960E0](a1: v69, a2: v68, a3: v61, a4: v66, a5: j, a6: v61);
  if ( *(int *)(v8 + 16) <= 0 )
    return MEMORY[0x18277F280]();
  return result;
}
