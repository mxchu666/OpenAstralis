// sub_18502B700
// rva 0x0502b700  size 182  section .text  group samples
// window base 0x18502b700: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall sub_18502B700(
        unsigned int a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        unsigned int a6,
        char a7)
{
  __int64 v7; // r14
  __int64 v8; // r15
  __int64 v9; // rdi
  __int64 v10; // rsi
  __int64 v11; // rdx
  __int64 v12; // rcx
  __int64 v13; // rcx
  __int64 v14; // rdi
  __int64 v15; // rsi
  __int64 result; // rax
  __int64 v17; // rdi
  __int64 v18; // rsi
  __int64 v19; // rcx
  __int64 v20; // rdi
  __int64 v21; // rsi
  __int64 v22; // [rsp+0h] [rbp-38h] BYREF
  __int64 v23; // [rsp+10h] [rbp-28h]
  __int64 v24; // [rsp+18h] [rbp-20h]
  __int64 v25; // [rsp+20h] [rbp-18h]
  int v26; // [rsp+28h] [rbp-10h]
  unsigned int v27; // [rsp+2Ch] [rbp-Ch]
  unsigned int v28; // [rsp+30h] [rbp-8h]
  unsigned int v29; // [rsp+34h] [rbp-4h]

  v25 = a3;
  v24 = a5;
  v29 = a6;
  v28 = a1;
  if ( (unsigned __int64)&v22 <= *(_QWORD *)(v8 + 8) )
    goto LABEL_5;
  v27 = MEMORY[0x186116840]();
  v11 = v25;
  v12 = *(unsigned int *)(v25 + 4);
  if ( (_DWORD)v12 == 0 )
  {
    while ( 1 )
    {
      v23 = MEMORY[0x18276BEE0](a1: v9, a2: v10, a3: v11, a4: v7 + 8 * v12);
      MEMORY[0x186116940](a1: v17, a2: v18, a3: v27);
      MEMORY[0x182769900](a1: v20, a2: v21, a3: v23, a4: v19, a5: &a7);
LABEL_5:
      MEMORY[0x181EB84E0]();
    }
  }
  v13 = *(unsigned __int8 *)(v7 + 8 * v12 + 29);
  v26 = v13;
  MEMORY[0x184ECE7E0](a1: v28, a2: (unsigned int)v13, a3: v25, a4: v13, a5: v24, a6: v29);
  result = MEMORY[0x186116940](a1: v14, a2: v15, a3: v27);
  if ( *(int *)(v8 + 16) <= 0 )
    return MEMORY[0x18277F280]();
  return result;
}
