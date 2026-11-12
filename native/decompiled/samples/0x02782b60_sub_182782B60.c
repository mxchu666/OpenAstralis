// sub_182782B60
// rva 0x02782b60  size 526  section .text  group samples
// window base 0x182782b60: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall sub_182782B60(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        int a5,
        int a6,
        int a7,
        int a8,
        __int64 a9,
        __int64 a10,
        __int64 a11,
        int a12)
{
  __int64 v12; // r14
  __int64 v13; // r15
  __int64 v14; // rax
  __int64 v15; // rcx
  __int64 v16; // rax
  __int64 v17; // rdi
  __int64 v18; // rsi
  __int64 v19; // rdx
  __int64 v20; // rax
  __int64 v21; // rcx
  __int64 v22; // rdi
  __int64 v23; // rsi
  __int64 v24; // rcx
  __int64 v25; // rdi
  __int64 v26; // rsi
  __int64 v27; // rax
  __int64 v28; // rcx
  __int64 v29; // rdi
  __int64 v30; // rsi
  __int64 v31; // rdx
  __int64 v32; // rax
  __int64 v33; // rdi
  __int64 v34; // rsi
  __int64 v35; // rcx
  __int64 v36; // rdi
  __int64 v37; // rsi
  __int64 v38; // rax
  __int64 v39; // rcx
  __int64 v40; // rdi
  __int64 v41; // rsi
  __int64 v42; // rax
  __int64 v43; // rdi
  __int64 v44; // rsi
  __int64 v45; // rcx
  __int64 v46; // rdi
  __int64 v47; // rsi
  __int64 v48; // rax
  __int64 v49; // rcx
  __int64 v50; // rdi
  __int64 v51; // rsi
  __int64 v52; // rax
  __int64 v53; // rdi
  __int64 v54; // rsi
  __int64 v55; // rcx
  __int64 v56; // rdi
  __int64 v57; // rsi
  __int64 result; // rax
  __int64 v59; // [rsp+0h] [rbp-38h] BYREF
  unsigned int v60; // [rsp+14h] [rbp-24h]
  __int64 v61; // [rsp+18h] [rbp-20h]
  __int64 v62; // [rsp+20h] [rbp-18h]
  __int64 v63; // [rsp+28h] [rbp-10h]
  int v64; // [rsp+34h] [rbp-4h]

  v63 = a3;
  if ( (unsigned __int64)&v59 <= *(_QWORD *)(v13 + 8) )
    JUMPOUT(0x182782D34LL);
  v14 = *(unsigned int *)(v12 + 376351692);
  v15 = v12 + 8 * v14;
  v62 = v15;
  if ( (_DWORD)v14 == 0 )
    return sub_182782CB5(a1, a2, a3, a4: v15, a5, a6, a7, a8, a9, a10, a11, a12);
  if ( a5 == 0 )
    JUMPOUT(0x182782CE7LL);
  v60 = v14;
  if ( a3 == v12 )
    JUMPOUT(0x182782D45LL);
  v64 = a5;
  v61 = v12 + 376612120;
  v16 = MEMORY[0x182084840](a1, a2, a3: v12 + 376612120, a4: v15, a5: v12 + 366228560);
  v19 = *(unsigned int *)(v12 + 8LL * v60 + 4);
  if ( (_DWORD)v19 == 0 )
    JUMPOUT(0x182782D54LL);
  v20 = MEMORY[0x182084840](a1: v17, a2: v18, a3: v16, a4: v60, a5: v12 + 8LL * *(unsigned int *)(v12 + 8 * v19 + 4));
  MEMORY[0x182084180](a1: v22, a2: v23, a3: v20, a4: v21, a5: 1);
  v27 = MEMORY[0x182084840](a1: v25, a2: v26, a3: v61, a4: v24, a5: v12 + 367380832);
  v31 = *(unsigned int *)(v12 + 8LL * v60 + 4);
  if ( (_DWORD)v31 == 0 )
    JUMPOUT(0x182782D59LL);
  v32 = MEMORY[0x182083E40](a1: v29, a2: v30, a3: v27, a4: v28, a5: *(_DWORD *)(v12 + 8 * v31 + 8) == 47076659);
  MEMORY[0x1820841E0](a1: v33, a2: v34, a3: v32);
  v38 = MEMORY[0x182084840](a1: v36, a2: v37, a3: v61, a4: v35, a5: v12 + 367731632);
  v42 = MEMORY[0x182084BC0](a1: v40, a2: v41, a3: v38, a4: v39, a5: *(_QWORD *)(v12 + 376351696));
  MEMORY[0x1820841E0](a1: v43, a2: v44, a3: v42);
  v48 = MEMORY[0x182084840](a1: v46, a2: v47, a3: v61, a4: v45, a5: v12 + 370782480);
  v52 = MEMORY[0x182084BC0](a1: v50, a2: v51, a3: v48, a4: v49, a5: *(_QWORD *)(v12 + 376351704));
  MEMORY[0x1820841E0](a1: v53, a2: v54, a3: v52);
  result = MEMORY[0x182084500](a1: v56, a2: v57, a3: v61, a4: v55, a5: 0);
  if ( *(int *)(v13 + 16) <= 0 )
    JUMPOUT(0x182782D2ALL);
  return result;
}
