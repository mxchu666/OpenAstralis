// sub_185051440
// rva 0x05051440  size 682  section .text  group samples
// window base 0x185051440: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall sub_185051440(__int64 a1, __int64 a2, _DWORD *a3, __int64 a4, __int64 a5, __int64 a6, char a7)
{
  __int64 v7; // r13
  _DWORD *v8; // r14
  __int64 v9; // r15
  __int64 v10; // rax
  __int64 v11; // rcx
  __int64 (*v12)(void); // rcx
  _DWORD *v13; // rax
  __int64 v14; // rsi
  __int64 v15; // rdx
  __int64 v16; // rdi
  __int64 v17; // rcx
  __int64 v18; // rax
  __int64 (__fastcall *v19)(__int64, __int64, _DWORD *, _QWORD, __int64, __int64); // rcx
  __int64 result; // rax
  __int64 v21; // rdx
  __int64 v22; // rcx
  __int64 v23; // rdi
  __int64 v24; // rsi
  __int64 v25; // [rsp+0h] [rbp-48h] BYREF
  _DWORD *v26; // [rsp+8h] [rbp-40h]
  __int64 v27; // [rsp+10h] [rbp-38h]
  _DWORD *v28; // [rsp+18h] [rbp-30h]
  __int64 v29; // [rsp+20h] [rbp-28h]
  __int64 v30; // [rsp+28h] [rbp-20h]
  __int64 v31; // [rsp+30h] [rbp-18h]
  __int64 v32; // [rsp+38h] [rbp-10h]
  unsigned int v33; // [rsp+40h] [rbp-8h]
  unsigned int v34; // [rsp+44h] [rbp-4h]

  v32 = a2;
  if ( (unsigned __int64)&v25 <= *(_QWORD *)(v9 + 8) )
  {
    v31 = a1;
    v30 = a6;
    v29 = a5;
    v28 = a3;
    MEMORY[0x181EB84E0]();
  }
  else if ( (_DWORD *)a2 != v8 )
  {
    if ( (unsigned __int16)v8[2 * v8[2 * (*a3 >> 3) + 5]
                            + 3
                            + (v8[2 * (*a3 >> 3) + 11] & (0x1E9Du >> HIBYTE(v8[2 * (*a3 >> 3) + 11])))] != 7837 )
      goto LABEL_12;
    v31 = a1;
    v30 = a6;
    v29 = a5;
    v10 = *a3 >> 3;
    v11 = (unsigned int)v8[2 * v10 + 5];
    v34 = v8[2 * v10 + 11];
    v27 = (__int64)&v8[2 * v11];
    v33 = HIBYTE(v34);
    LODWORD(v11) = *(_DWORD *)(v27 + 4LL * (v34 & (0x16BCu >> SHIBYTE(v34))) + 12);
    v26 = &v8[2 * v10];
    v12 = (__int64 (*)(void))(v7 + *(_QWORD *)((char *)v26 + WORD1(v11) + 16));
    v28 = a3;
    v13 = (_DWORD *)v12();
    if ( v13 == v8 )
      goto LABEL_13;
    if ( (unsigned __int16)v8[2 * v8[2 * (*v13 >> 3) + 5]
                            + 3
                            + (v8[2 * (*v13 >> 3) + 11] & (0x1ECFu >> HIBYTE(v8[2 * (*v13 >> 3) + 11])))] != 7887 )
    {
      while ( 1 )
      {
        MEMORY[0x182770780]();
LABEL_15:
        v21 = MEMORY[0x181EAA920](a1, a2, a3: 34101256);
LABEL_11:
        *(_DWORD *)(v21 + 20) = 46923644;
        *(_DWORD *)(v21 + 16) = v8[93585974];
        *(_DWORD *)(v21 + 12) = (unsigned __int64)(v21 - (_QWORD)v8) >> 3;
        v27 = v21;
        sub_18503B9A0(a1, a2, a3: (unsigned int *)v21, a4, a5: 0);
        MEMORY[0x182769900](a1: v23, a2: v24, a3: v27, a4: v22, a5: &a7);
LABEL_12:
        v31 = a1;
        v30 = a6;
        v29 = a5;
        v28 = a3;
        MEMORY[0x182770780]();
LABEL_13:
        MEMORY[0x182771080]();
      }
    }
    v15 = *v13 >> 3;
    v16 = (unsigned int)v8[2 * v15 + 11];
    v17 = *(_QWORD *)((char *)&v8[2 * v15 + 8]
                    + HIWORD(v8[2 * v8[2 * v15 + 5] + 3 + ((unsigned int)v16 & (0x1ECFu >> HIBYTE(v8[2 * v15 + 11])))]));
    v18 = ((__int64 (__fastcall *)(__int64, __int64, _DWORD *, __int64, __int64))(v7 + v17))(
            a1: v16,
            a2: v14,
            a3: v13,
            a4: v17,
            a5: v32);
    v19 = (__int64 (__fastcall *)(__int64, __int64, _DWORD *, _QWORD, __int64, __int64))(v7
                                                                                       + *(_QWORD *)((char *)v26 + HIWORD(*(_DWORD *)(v27 + 4LL * (v34 & (0x1E9Du >> v33)) + 12)) + 400));
    result = v19(a1: v31, a2: v18, a3: v28, a4: v19, a5: v29, a6: v30);
    if ( *(int *)(v9 + 16) <= 0 )
      return MEMORY[0x18277F280]();
    return result;
  }
  v31 = a1;
  v30 = a6;
  v29 = a5;
  v28 = a3;
  v21 = *(_QWORD *)(v9 + 40);
  if ( (unsigned __int64)(v21 + 48) > *(_QWORD *)(v9 + 32) )
    goto LABEL_15;
  *(_QWORD *)(v9 + 40) = v21 + 48;
  *(_DWORD *)v21 = 34101256;
  *(_DWORD *)(v21 + 4) = 0;
  *(_QWORD *)(v21 + 8) = 0;
  *(_QWORD *)(v21 + 16) = 0;
  *(_QWORD *)(v21 + 24) = 0;
  *(_QWORD *)(v21 + 32) = 0;
  *(_QWORD *)(v21 + 40) = 0;
  goto LABEL_11;
}
