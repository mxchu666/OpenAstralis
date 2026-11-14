// sub_182784B40
// rva 0x02784b40  size 682  section .text  group runtime
// window base 0x182784b40: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall sub_182784B40(
        __int64 a1,
        unsigned __int64 a2,
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
        __m128 a14,
        char a15)
{
  __int64 v15; // rbp
  __int64 v16; // r14
  __int64 v17; // r15
  __int64 v18; // rax
  __int64 v19; // rcx
  unsigned __int64 v20; // rbx
  __int64 v21; // rax
  __int64 result; // rax
  unsigned __int64 v23; // rcx
  unsigned __int64 v24; // rbx
  __int64 v25; // rax
  unsigned __int64 v26; // rcx
  __int64 v27; // rcx
  __int64 v28; // rdi
  __int64 v29; // rsi
  __int64 v30; // r9
  __m128 v31; // xmm0
  __m128 v32; // xmm1
  __m128 v33; // xmm2
  __m128 v34; // xmm3
  __m128 v35; // xmm4
  __m128 v36; // xmm5
  __m128 v37; // xmm6
  __m128 v38; // xmm7
  __int64 v39; // rax
  char v40; // [rsp+0h] [rbp-28h] BYREF
  __int64 v41; // [rsp+8h] [rbp-20h]
  __int64 v42; // [rsp+10h] [rbp-18h]
  __int64 v43; // [rsp+18h] [rbp-10h]
  int v44; // [rsp+24h] [rbp-4h]

  if ( (unsigned __int64)&v40 <= *(_QWORD *)(v17 + 8) )
  {
    *(double *)a7.m128_u64 = MEMORY[0x181EB84E0]();
LABEL_36:
    sub_182771080(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15: v40);
    goto LABEL_37;
  }
  if ( a5 == v16 )
  {
    if ( *(int *)(v17 + 16) <= 0 )
      sub_18277F280(a1, a2, a3, a4);
    return 0;
  }
  v18 = *(unsigned int *)(a3 + 4);
  if ( (_DWORD)v18 == 0 )
    goto LABEL_36;
  v19 = *(unsigned int *)(v16 + 8 * v18 + 8);
  v20 = v16 + 8 * v18;
  if ( (unsigned int)v19 < 2 )
  {
    v44 = 1;
    result = 0;
    goto LABEL_19;
  }
  v21 = *(unsigned int *)(v16 + 8 * v18 + 16);
  if ( v16 + 8 * v21 != a5 )
  {
    result = (_DWORD)v21 == 0;
    v15 = 2;
    while ( (int)v19 > (int)v15 )
    {
      if ( (unsigned int)v19 <= (unsigned int)v15 )
      {
        while ( 1 )
        {
          v43 = a5;
          v42 = a3;
          v39 = sub_182771220(
                  a1,
                  a2,
                  a3: (unsigned int)v15,
                  a4: v19,
                  a5: (unsigned int)v19,
                  a6,
                  a7,
                  a8,
                  a9,
                  a10,
                  a11,
                  a12,
                  a13,
                  a14,
                  a15: v40);
LABEL_43:
          v27 = (v39 & 0xFFFFFFFFFFF80000LL) + 2112;
          if ( *(_BYTE *)((v39 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v39 - v27) >> 9) + 0x38) != 0 )
            *(_BYTE *)((v39 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v39 - v27) >> 9) + 0x38) = 0;
LABEL_40:
          a7.m128_i128 = (__int128)sub_182769900(
                                     a1: v28,
                                     a2: v29,
                                     a3: (_DWORD *)v39,
                                     a4: v27,
                                     a5: (__int64)&a15,
                                     a6: v30,
                                     a7: v31,
                                     a8: v32,
                                     a9: v33,
                                     a10: v34,
                                     a11: v35,
                                     a12: v36,
                                     a13: v37,
                                     a14: v38);
LABEL_41:
          v43 = a5;
          v42 = a3;
          sub_182771220(
            a1,
            a2,
            a3: (unsigned int)result,
            a4: v19,
            a5: (unsigned int)v19,
            a6,
            a7,
            a8,
            a9,
            a10,
            a11,
            a12,
            a13,
            a14,
            a15: v40);
        }
      }
      a2 = *(unsigned int *)(v20 + 4 * v15 + 12);
      a1 = v16 + 8 * a2;
      if ( a1 == a5 )
        goto LABEL_24;
      a1 = (unsigned int)(v15 + 1);
      if ( (_DWORD)result != 0 )
      {
        v15 = (unsigned int)a1;
      }
      else
      {
        if ( (_DWORD)a2 == 0 )
          result = (unsigned int)v15;
        v15 = (unsigned int)a1;
      }
    }
    v44 = v15;
LABEL_19:
    if ( (_DWORD)result != 0 )
    {
      if ( (unsigned int)v19 <= (unsigned int)result )
        goto LABEL_41;
      *(_DWORD *)(v20 + 4 * result + 12) = (unsigned __int64)(a5 - v16) >> 3;
      v23 = *(unsigned int *)v20;
      if ( (v23 & 2) != 0 )
      {
        if ( (v23 & 1) != 0 )
        {
          v23 = v20 - *(_QWORD *)(v20 - 8);
          a2 = v20;
          v24 = (unsigned __int64)(4 * result + 12) >> 9;
          if ( *(_BYTE *)(v23 + v24 + 48) != 0 )
            *(_BYTE *)(v23 + v24 + 48) = 0;
        }
        else
        {
          v23 = v20 & 0xFFFFFFFFFFF80000LL;
          a2 = (v20 - ((v20 & 0xFFFFFFFFFFF80000LL) + 2112)) >> 9;
          if ( *(_BYTE *)((v20 & 0xFFFFFFFFFFF80000LL) + a2 + 0x38) != 0 )
            *(_BYTE *)(v23 + a2 + 56) = 0;
        }
      }
      if ( *(int *)(v17 + 16) <= 0 )
        return sub_18277F280(a1, a2, a3, a4: v23);
      return result;
    }
LABEL_37:
    v25 = *(_QWORD *)(v17 + 40);
    if ( (unsigned __int64)(v25 + 40) > *(_QWORD *)(v17 + 32) )
    {
      v43 = a5;
      v42 = a3;
      v25 = MEMORY[0x181EAA920](a1, a2, a3: 34090048);
    }
    else
    {
      *(_QWORD *)(v17 + 40) = v25 + 40;
      *(_DWORD *)v25 = 34090048;
      *(_DWORD *)(v25 + 4) = 0;
      *(_QWORD *)(v25 + 8) = 0;
      *(_QWORD *)(v25 + 16) = 0;
      *(_QWORD *)(v25 + 24) = 0;
      *(_QWORD *)(v25 + 32) = 0;
      v43 = a5;
      v42 = a3;
    }
    *(_DWORD *)(v25 + 20) = 46923644;
    *(_DWORD *)(v25 + 16) = *(_DWORD *)(v16 + 374343896);
    v26 = (unsigned __int64)(v25 - v16) >> 3;
    *(_DWORD *)(v25 + 12) = v26;
    v41 = v25;
    MEMORY[0x18503B9A0](a1, a2, a3: v25, a4: v26, a5: 0);
    v39 = v41;
    *(_DWORD *)(v41 + 8) = 46316219;
    if ( (*(_DWORD *)v39 & 2) != 0 )
      goto LABEL_43;
    goto LABEL_40;
  }
  LODWORD(v15) = 1;
LABEL_24:
  if ( *(int *)(v17 + 16) <= 0 )
    sub_18277F280(a1, a2, a3, a4: v19);
  return (unsigned int)v15;
}
