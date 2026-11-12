// sub_182784FA0
// rva 0x02784fa0  size 874  section .text  group runtime
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall sub_182784FA0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __m128 a7,
        __m128 a8,
        __m128 a9,
        __m128 a10,
        __m128 a11,
        __m128 a12,
        __m128 a13,
        __m128 a14)
{
  __int64 v14; // r14
  __int64 v15; // r15
  int v16; // eax
  __int64 result; // rax
  __int64 v18; // rcx
  __int64 v19; // rbp
  __int64 v20; // rcx
  __int64 v21; // r9
  __int64 v22; // r8
  unsigned int v23; // eax
  __int64 v24; // rcx
  __int64 v25; // rbx
  __int64 v26; // rcx
  int v27; // ebp
  __int64 v28; // rcx
  __int64 v29; // r8
  __int64 v30; // r9
  __int64 v31; // rbp
  __int64 v32; // rdx
  unsigned int v33; // eax
  __int64 v34; // rcx
  unsigned int v35; // r8d
  __int64 v36; // rcx
  __int64 v37; // rsi
  __int64 v38; // r9
  unsigned int v39; // r10d
  __int64 v40; // rax
  __int64 i; // rax
  char v42; // [rsp+0h] [rbp-48h] BYREF
  __int64 v43; // [rsp+8h] [rbp-40h]
  __int64 v44; // [rsp+10h] [rbp-38h]
  __int64 v45; // [rsp+18h] [rbp-30h]
  unsigned int v46; // [rsp+24h] [rbp-24h]
  int v47; // [rsp+28h] [rbp-20h]
  unsigned int v48; // [rsp+2Ch] [rbp-1Ch]
  __int64 v49; // [rsp+30h] [rbp-18h]
  int v50; // [rsp+38h] [rbp-10h]
  unsigned int v51; // [rsp+3Ch] [rbp-Ch]
  __int64 v52; // [rsp+40h] [rbp-8h]

  v52 = a5;
  v44 = a6;
  if ( (unsigned __int64)&v42 <= *(_QWORD *)(v15 + 8) )
  {
    *(double *)a7.m128_u64 = MEMORY[0x181EB84E0]();
LABEL_42:
    sub_182771080(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15: v42);
LABEL_43:
    sub_182771080(a1, a2, a3, a4: v36, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15: v42);
    goto LABEL_44;
  }
  v16 = *(_DWORD *)(a3 + 16);
  if ( v16 == 0x7FFFFFFF )
  {
    v40 = *(unsigned int *)(a3 + 8);
    a4 = v14 + 8 * v40;
    if ( (_DWORD)v40 == 0 )
    {
LABEL_44:
      sub_182771080(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15: v42);
      goto LABEL_45;
    }
    LODWORD(v25) = *(_DWORD *)(v14 + 8 * v40 + 8);
    if ( (_DWORD)v25 != 0 )
    {
      *(_DWORD *)(v14 + 8 * v40 + 12) = 0;
      for ( i = 1; (int)v25 > (int)i; i = (unsigned int)(i + 1) )
      {
        if ( (unsigned int)v25 <= (unsigned int)i )
          goto LABEL_51;
        *(_DWORD *)(a4 + 4 * i + 12) = 0;
      }
    }
    *(_DWORD *)(a3 + 16) = 0;
    v16 = 0;
  }
  result = (unsigned int)(v16 + 1);
  *(_DWORD *)(a3 + 16) = result;
  if ( a6 == v14 )
    goto LABEL_42;
  v18 = *(unsigned int *)(a6 + 8);
  v51 = v18;
  if ( (_DWORD)v18 == 0 )
    goto LABEL_17;
  v43 = a3;
  v19 = *(_QWORD *)(a5 + 8 * *(_DWORD *)(a6 + 12));
  if ( v19 == 0 )
  {
LABEL_9:
    v25 = 1;
    v26 = v51;
    a6 = v44;
    a5 = v52;
    while ( (int)v26 > (int)v25 )
    {
      if ( (unsigned int)v26 <= (unsigned int)v25 )
        goto LABEL_50;
      v27 = *(_DWORD *)(a6 + 4 * v25 + 12);
      a2 = *(_QWORD *)(a5 + 8 * v27);
      a1 = (unsigned int)(v25 + 1);
      if ( a2 != 0 )
      {
        v48 = v25 + 1;
        v47 = v27;
        v46 = v25;
        v45 = a2;
        sub_182784E00(a1, a2, a3, a4: v26, a5: a2, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15: v42);
        v31 = v43;
        v32 = *(unsigned int *)(v43 + 8);
        if ( (_DWORD)v32 == 0 )
          goto LABEL_52;
        v33 = *(_DWORD *)(v14 + 8 * v32 + 8);
        v34 = (unsigned int)v45;
        if ( v33 <= (unsigned int)v45 )
          goto LABEL_53;
        v35 = *(_DWORD *)(v43 + 16);
        *(_DWORD *)(v14 + 8 * v32 + 4LL * (unsigned int)v45 + 12) = v35;
        v25 = v48;
        result = v35;
        v26 = v51;
        a6 = v44;
        a5 = v52;
        a3 = v31;
      }
      else
      {
        v25 = (unsigned int)a1;
      }
    }
LABEL_17:
    v36 = *(unsigned int *)(a3 + 4);
    if ( (_DWORD)v36 != 0 )
    {
      v37 = *(unsigned int *)(v14 + 8 * v36 + 8);
      if ( (unsigned int)v37 < 2 )
      {
LABEL_29:
        if ( *(int *)(v15 + 16) <= 0 )
          return sub_18277F280(a1, a2: v37, a3, a4: v36);
        return result;
      }
      a3 = *(unsigned int *)(a3 + 8);
      if ( (_DWORD)a3 != 0 )
      {
        a1 = *(unsigned int *)(v14 + 8 * a3 + 8);
        if ( (unsigned int)a1 >= 2 )
        {
          if ( (_DWORD)result != *(_DWORD *)(v14 + 8 * a3 + 16) )
            *(_DWORD *)(v14 + 8 * v36 + 16) = 0;
          v38 = 2;
          while ( (int)v37 > (int)v38 )
          {
            if ( (unsigned int)a1 <= (unsigned int)v38 )
              goto LABEL_54;
            v39 = v38 + 1;
            if ( (_DWORD)result == *(_DWORD *)(v14 + 8 * a3 + 4 * v38 + 12) )
            {
LABEL_47:
              v38 = v39;
            }
            else
            {
              if ( (unsigned int)v37 <= (unsigned int)v38 )
                goto LABEL_55;
              *(_DWORD *)(v14 + 8 * v36 + 4 * v38 + 12) = 0;
              v38 = v39;
            }
          }
          goto LABEL_29;
        }
LABEL_46:
        result = sub_182771220(
                   a1,
                   a2: v37,
                   a3: 1,
                   a4: v36,
                   a5: (unsigned int)a1,
                   a6,
                   a7,
                   a8,
                   a9,
                   a10,
                   a11,
                   a12,
                   a13,
                   a14,
                   a15: v42);
        goto LABEL_47;
      }
LABEL_45:
      sub_182771080(a1, a2: v37, a3, a4: v36, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15: v42);
      goto LABEL_46;
    }
    goto LABEL_43;
  }
  v50 = *(_DWORD *)(a6 + 12);
  v49 = v19;
  sub_182784E00(a1, a2, a3, a4: v18, a5: v19, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15: v42);
  a3 = v43;
  v22 = *(unsigned int *)(v43 + 8);
  if ( (_DWORD)v22 != 0 )
  {
    v23 = *(_DWORD *)(v14 + 8 * v22 + 8);
    v24 = (unsigned int)v49;
    if ( v23 > (unsigned int)v49 )
    {
      result = *(unsigned int *)(v43 + 16);
      *(_DWORD *)(v14 + 8 * v22 + 4LL * (unsigned int)v49 + 12) = result;
      goto LABEL_9;
    }
  }
  else
  {
    v23 = sub_182771080(a1, a2, a3: v43, a4: v20, a5: v22, a6: v21, a7, a8, a9, a10, a11, a12, a13, a14, a15: v42);
  }
  LODWORD(v25) = v50;
  sub_182771220(
    a1,
    a2: v49,
    a3: (unsigned int)v24,
    a4: v24,
    a5: v23,
    a6: v21,
    a7,
    a8,
    a9,
    a10,
    a11,
    a12,
    a13,
    a14,
    a15: v42);
LABEL_50:
  v46 = v25;
  LODWORD(i) = sub_182771220(
                 a1,
                 a2,
                 a3: (unsigned int)v25,
                 a4: v26,
                 a5: v51,
                 a6,
                 a7,
                 a8,
                 a9,
                 a10,
                 a11,
                 a12,
                 a13,
                 a14,
                 a15: v42);
LABEL_51:
  sub_182771220(
    a1,
    a2,
    a3: (unsigned int)i,
    a4,
    a5: (unsigned int)v25,
    a6,
    a7,
    a8,
    a9,
    a10,
    a11,
    a12,
    a13,
    a14,
    a15: v42);
LABEL_52:
  v33 = sub_182771080(a1, a2, a3: v32, a4: v28, a5: v29, a6: v30, a7, a8, a9, a10, a11, a12, a13, a14, a15: v42);
LABEL_53:
  sub_182771220(
    a1: v45,
    a2: v46,
    a3: (unsigned int)v34,
    a4: v34,
    a5: v33,
    a6: v30,
    a7,
    a8,
    a9,
    a10,
    a11,
    a12,
    a13,
    a14,
    a15: v42);
LABEL_54:
  sub_182771220(
    a1,
    a2: v37,
    a3: (unsigned int)v38,
    a4: v36,
    a5: (unsigned int)a1,
    a6: v38,
    a7,
    a8,
    a9,
    a10,
    a11,
    a12,
    a13,
    a14,
    a15: v42);
LABEL_55:
  sub_182771220(
    a1: v52,
    a2: v37,
    a3: (unsigned int)v38,
    a4: v51,
    a5: (unsigned int)v37,
    a6: v38,
    a7,
    a8,
    a9,
    a10,
    a11,
    a12,
    a13,
    a14,
    a15: v42);
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
  return sub_182785320();
}
