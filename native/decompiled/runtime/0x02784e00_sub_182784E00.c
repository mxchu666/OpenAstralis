// sub_182784E00
// rva 0x02784e00  size 397  section .text  group runtime
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall sub_182784E00(
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
        __m128 a14,
        char a15)
{
  unsigned int v15; // ebx
  __int64 v16; // r14
  __int64 v17; // r15
  __int64 v18; // rax
  __int64 v19; // rcx
  __int64 v20; // rcx
  __int64 v22; // rdx
  __int64 v23; // rcx
  __int64 v24; // rdi
  __int64 v25; // rsi
  __int64 v26; // r9
  __m128 v27; // xmm0
  __m128 v28; // xmm1
  __m128 v29; // xmm2
  __m128 v30; // xmm3
  __m128 v31; // xmm4
  __m128 v32; // xmm5
  __m128 v33; // xmm6
  __m128 v34; // xmm7
  __int64 v35; // rax
  char v36; // [rsp+0h] [rbp-28h] BYREF
  __int64 v37; // [rsp+10h] [rbp-18h]
  __int64 v38; // [rsp+18h] [rbp-10h]
  __int64 v39; // [rsp+20h] [rbp-8h]

  if ( (unsigned __int64)&v36 <= *(_QWORD *)(v17 + 8) )
    goto LABEL_18;
  if ( a5 != 0 )
  {
    if ( a5 < 0 )
      goto LABEL_14;
    v18 = *(unsigned int *)(a3 + 4);
    if ( (_DWORD)v18 == 0 )
      goto LABEL_19;
    v19 = *(unsigned int *)(v16 + 8 * v18 + 8);
    v15 = v19;
    if ( v19 <= a5 )
      goto LABEL_14;
    v15 = a5;
    if ( (unsigned int)v19 <= (unsigned int)a5 )
      goto LABEL_20;
    v20 = *(unsigned int *)(v16 + 8 * v18 + 4 * a5 + 12);
    if ( (_DWORD)v20 == 0 )
    {
LABEL_14:
      v39 = a5;
      v38 = a3;
      v22 = *(_QWORD *)(v17 + 40);
      if ( (unsigned __int64)(v22 + 40) > *(_QWORD *)(v17 + 32) )
      {
        v22 = MEMORY[0x181EAA920](a1, a2, a3: 34090048);
      }
      else
      {
        *(_QWORD *)(v17 + 40) = v22 + 40;
        *(_DWORD *)v22 = 34090048;
        *(_DWORD *)(v22 + 4) = 0;
        *(_QWORD *)(v22 + 8) = 0;
        *(_QWORD *)(v22 + 16) = 0;
        *(_QWORD *)(v22 + 24) = 0;
        *(_QWORD *)(v22 + 32) = 0;
      }
      *(_DWORD *)(v22 + 20) = 46923644;
      *(_DWORD *)(v22 + 16) = *(_DWORD *)(v16 + 374343896);
      *(_DWORD *)(v22 + 12) = (unsigned __int64)(v22 - v16) >> 3;
      v37 = v22;
      MEMORY[0x18503B9A0](a1, a2, a3: v22, a4: v22, a5: 0);
      v35 = v37;
      *(_DWORD *)(v37 + 8) = 46228050;
      if ( (*(_DWORD *)v35 & 2) != 0 )
        goto LABEL_21;
      while ( 1 )
      {
        sub_182769900(
          a1: v24,
          a2: v25,
          a3: (_DWORD *)v35,
          a4: v23,
          a5: (__int64)&a15,
          a6: v26,
          a7: v27,
          a8: v28,
          a9: v29,
          a10: v30,
          a11: v31,
          a12: v32,
          a13: v33,
          a14: v34);
LABEL_18:
        *(double *)a7.m128_u64 = MEMORY[0x181EB84E0]();
LABEL_19:
        sub_182771080(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15: v36);
LABEL_20:
        v39 = a5;
        v38 = a3;
        v35 = sub_182771220(
                a1,
                a2,
                a3: v15,
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
                a15: v36);
LABEL_21:
        v23 = (v35 & 0xFFFFFFFFFFF80000LL) + 2112;
        if ( *(_BYTE *)((v35 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v35 - v23) >> 9) + 0x38) != 0 )
          *(_BYTE *)((v35 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v35 - v23) >> 9) + 0x38) = 0;
      }
    }
    if ( *(int *)(v17 + 16) <= 0 )
      sub_18277F280(a1, a2, a3, a4: v20);
    return v16 + 8 * v20;
  }
  else
  {
    if ( *(int *)(v17 + 16) <= 0 )
      sub_18277F280(a1, a2, a3, a4);
    return v16;
  }
}
