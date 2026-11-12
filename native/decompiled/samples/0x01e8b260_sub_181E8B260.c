// sub_181E8B260
// rva 0x01e8b260  size 412  section .text  group samples
// window base 0x181e8b260: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
_BOOL8 __fastcall sub_181E8B260(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5, int a6)
{
  __int64 v6; // r14
  __int64 v7; // rdx
  __int64 v8; // rdi
  __int64 v9; // rsi
  double v10; // xmm2_8
  _QWORD *v11; // rax
  __int64 *v12; // rdx
  double v13; // xmm0_8
  double v14; // xmm1_8
  __int64 v15; // rcx
  __int64 v16; // rdi
  __int64 v17; // rsi
  double v18; // xmm0_8
  __int64 v19; // rdx
  _BYTE *v20; // rax
  _BYTE v23[16]; // [rsp+30h] [rbp-68h] BYREF
  _BYTE v24[64]; // [rsp+40h] [rbp-58h] BYREF
  __int64 *v25; // [rsp+80h] [rbp-18h]
  _DWORD *v26; // [rsp+88h] [rbp-10h]
  int v27; // [rsp+94h] [rbp-4h]

  v27 = a6;
  v7 = *(unsigned int *)(v6 + 376654972);
  if ( (_DWORD)v7 != 0 && *(_DWORD *)(v6 + 8 * v7) >> 3 == 5057809 )
  {
    v18 = MEMORY[0x1828C1C40](a1, a2, a3: v6 + 361300432);
LABEL_8:
    if ( __builtin_isnan(v18) )
    {
      v19 = 0;
    }
    else if ( v18 > 0.0 )
    {
      v19 = ~v19;
    }
    goto LABEL_6;
  }
  v26 = v24;
  MEMORY[0x182839540](a1, a2, a3: v24, a4, a5: 54, a6: 0);
  v11 = v26;
  v26[12] = *(_DWORD *)(a5 + 8);
  v11[4] = *(_QWORD *)(v6 + 376654976);
  v11[3] = *(_QWORD *)(v6 + 376652720);
  v12 = (__int64 *)v23;
  v25 = (__int64 *)v23;
  v13 = *(double *)(v6 + 376178920);
  v14 = 0.0;
  if ( v13 == 0.0 )
  {
    MEMORY[0x11703C40](a1: v8, a2: v9, a3: v23, a4: v23, a5: v13, a6: 0.0, a7: v10);
    v12 = v25;
    v13 = (double)*v25;
    v14 = MEMORY[0x11B128F0] / v13;
    *(double *)(v6 + 376178920) = MEMORY[0x11B128F0] / v13;
  }
  MEMORY[0x11703170](a1: v8, a2: v9, a3: v12, a4: v12, a5: v13, a6: v14, a7: v10);
  v18 = (double)*v25 * *(double *)(v6 + 376178920);
  v19 = (__int64)v18;
  if ( (__int64)v18 == MEMORY[0x11B128E8] )
    goto LABEL_8;
LABEL_6:
  v20 = v26;
  *((_QWORD *)v26 + 5) = v19;
  v20[52] = v27;
  MEMORY[0x182779B80](a1: v16, a2: v17, a3: v6 + 376655792, a4: v15, a5: v20);
  return *((_BYTE *)v26 + 53) != 0;
}
