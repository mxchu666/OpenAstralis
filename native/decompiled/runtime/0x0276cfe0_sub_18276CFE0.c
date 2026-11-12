// sub_18276CFE0
// rva 0x0276cfe0  size 1317  section .text  group runtime
// from Hex-Rays over a carved window; addresses are image addresses
__m128i __fastcall sub_18276CFE0(
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
  __int64 v15; // rax
  __int64 v16; // r10
  __int64 v17; // r11
  __int64 v18; // r14
  __int64 v19; // r15
  __m128i v20; // xmm8
  __m128i v21; // xmm9
  __m128i v22; // xmm10
  __m128i v23; // xmm11
  __m128i v24; // xmm12
  __m128i v25; // xmm13
  __m128i v26; // xmm14
  __m128i v27; // xmm15
  __int64 v28; // rcx
  __int64 v29; // rdi
  __int64 v30; // rsi
  unsigned int v31; // eax
  __int64 v32; // rcx
  __int64 v33; // rdi
  __int64 v34; // rsi
  unsigned int v35; // eax
  __int64 v36; // rcx
  __int64 v37; // rdi
  __int64 v38; // rsi
  __int64 v39; // rdx
  unsigned __int64 v40; // r9
  unsigned __int64 v41; // r9
  __int64 v42; // rcx
  unsigned int v43; // eax
  __int64 v44; // rcx
  int v45; // eax
  __int64 v46; // rcx
  __int64 v47; // rdi
  __int64 v48; // rsi
  __int64 v49; // rdx
  __int64 v50; // rax
  __int64 v51; // rdi
  __int64 v52; // rsi
  __int64 v53; // rdx
  __int64 v54; // rax
  unsigned __int64 v55; // rcx
  unsigned __int64 v56; // rdx
  unsigned __int64 v58; // rbp
  __int64 v59; // rdx
  __int64 v60; // rcx
  __int64 v61; // rdi
  __int64 v62; // rsi
  __int64 v63; // rax
  _QWORD v64[3]; // [rsp+0h] [rbp-198h] BYREF
  unsigned int *v65; // [rsp+18h] [rbp-180h]
  __int64 v66; // [rsp+20h] [rbp-178h]
  int v67; // [rsp+28h] [rbp-170h]
  unsigned int v68; // [rsp+2Ch] [rbp-16Ch]
  unsigned int v69; // [rsp+30h] [rbp-168h]
  unsigned int v70; // [rsp+34h] [rbp-164h]
  __m128i v71; // [rsp+38h] [rbp-160h]
  __m128i v72; // [rsp+48h] [rbp-150h]
  __m128i v73; // [rsp+58h] [rbp-140h]
  __m128i v74; // [rsp+68h] [rbp-130h]
  __m128i v75; // [rsp+78h] [rbp-120h]
  __m128i v76; // [rsp+88h] [rbp-110h]
  __m128i v77; // [rsp+98h] [rbp-100h]
  __m128i v78; // [rsp+A8h] [rbp-F0h]
  __m128i m128_i128; // [rsp+B8h] [rbp-E0h]
  __m128i v80; // [rsp+C8h] [rbp-D0h]
  __m128i v81; // [rsp+D8h] [rbp-C0h]
  __m128i v82; // [rsp+E8h] [rbp-B0h]
  __m128i v83; // [rsp+F8h] [rbp-A0h]
  __m128i v84; // [rsp+108h] [rbp-90h]
  __m128i v85; // [rsp+118h] [rbp-80h]
  __m128i v86; // [rsp+128h] [rbp-70h]
  __int64 v87; // [rsp+140h] [rbp-58h]
  __int64 v88; // [rsp+148h] [rbp-50h]
  __int64 v89; // [rsp+150h] [rbp-48h]
  __int64 v90; // [rsp+158h] [rbp-40h]
  __int64 v91; // [rsp+160h] [rbp-38h]
  __int64 v92; // [rsp+168h] [rbp-30h]
  __int64 v93; // [rsp+178h] [rbp-20h]
  __int64 v94; // [rsp+180h] [rbp-18h]
  __int64 v95; // [rsp+188h] [rbp-10h]

  v87 = v17;
  v88 = v16;
  v89 = a6;
  v90 = a5;
  v91 = a1;
  v92 = a2;
  v93 = a3;
  v94 = a4;
  v95 = v15;
  v71 = v27;
  v72 = v26;
  v73 = v25;
  v74 = v24;
  v75 = v23;
  v76 = v22;
  v77 = v21;
  v78 = v20;
  m128_i128 = (__m128i)a14.m128_i128;
  v80 = (__m128i)a13.m128_i128;
  v81 = (__m128i)a12.m128_i128;
  v82 = (__m128i)a11.m128_i128;
  v83 = (__m128i)a10.m128_i128;
  v84 = (__m128i)a9.m128_i128;
  v85 = (__m128i)a8.m128_i128;
  v86 = (__m128i)a7.m128_i128;
  if ( (unsigned __int64)v64 <= *(_QWORD *)(v19 + 8) )
  {
    v70 = a5;
    v69 = a3;
    v35 = MEMORY[0x181EB84E0]();
LABEL_20:
    v68 = v35;
    v59 = *(_QWORD *)(v19 + 40);
    if ( (unsigned __int64)(v59 + 40) > *(_QWORD *)(v19 + 32) )
    {
      v59 = MEMORY[0x181EAA920](a1: v37, a2: v38, a3: 34082880);
    }
    else
    {
      *(_QWORD *)(v19 + 40) = v59 + 40;
      *(_DWORD *)v59 = 34082880;
      *(_DWORD *)(v59 + 4) = 0;
      *(_QWORD *)(v59 + 8) = 0;
      *(_QWORD *)(v59 + 16) = 0;
      *(_QWORD *)(v59 + 24) = 0;
      *(_QWORD *)(v59 + 32) = 0;
    }
    *(_DWORD *)(v59 + 20) = 46923644;
    *(_DWORD *)(v59 + 16) = *(_DWORD *)(v18 + 374343896);
    *(_DWORD *)(v59 + 12) = (unsigned __int64)(v59 - v18) >> 3;
    v66 = v59;
    MEMORY[0x18503B9A0](a1: v37, a2: v38, a3: v59, a4: v36, a5: 0);
    v63 = v66;
    *(_DWORD *)(v66 + 8) = 46004603;
    if ( (*(_DWORD *)v63 & 2) != 0 )
      goto LABEL_24;
    while ( 1 )
    {
      v63 = sub_1827697E0(a1: v61, a2: v62, a3: (_DWORD *)v63, a4: v60, a5: (__int64)&a15);
LABEL_24:
      v60 = (v63 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v63 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v63 - v60) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v63 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v63 - v60) >> 9) + 0x38) = 0;
    }
  }
  v70 = a5;
  v69 = a3;
  sub_182771FC0(a1, a2, a3: 0);
  v31 = MEMORY[0x1850130C0](a1: v29, a2: v30, a3: 32, a4: v28, a5: v69);
  v35 = MEMORY[0x1850130C0](a1: v33, a2: v34, a3: v31, a4: v32, a5: v70);
  if ( (v35 & 0x80000000) != 0 )
    goto LABEL_20;
  v39 = *(_QWORD *)(v19 + 40);
  v40 = (v35 + 19LL) & 0x1FFFFFFF8LL;
  if ( v40 >= 0x20000 || (v41 = v39 + v40) > *(_QWORD *)(v19 + 32) )
  {
    v68 = v35;
    v39 = MEMORY[0x181EAA840](a1: 34082368, a2: v38, a3: 34082368, a4: v36, a5: v35);
    v35 = v68;
  }
  else
  {
    *(_QWORD *)(v19 + 40) = v41;
    *(_QWORD *)v39 = 34082368;
    *(_DWORD *)(v39 + 8) = v35;
  }
  v66 = v39;
  v68 = v35;
  MEMORY[0x181EB4960](a1: v35, a2: 0, a3: v18 + 376351544, a4: v39, a5: 0, a6: v39);
  v43 = MEMORY[0x185011920](a1: v70, a2: v18 + 58184720, a3: v68, a4: v42, a5: 0, a6: v66);
  v45 = MEMORY[0x185011920](a1: v69, a2: v18 + 58184744, a3: v43, a4: v44, a5: 0, a6: v66);
  v49 = *(_QWORD *)(v19 + 40);
  if ( (unsigned __int64)(v49 + 40) > *(_QWORD *)(v19 + 32) )
  {
    v67 = v45;
    v49 = MEMORY[0x181EAA920](a1: v47, a2: v48, a3: 34150672);
  }
  else
  {
    *(_QWORD *)(v19 + 40) = v49 + 40;
    *(_DWORD *)v49 = 34150672;
    *(_DWORD *)(v49 + 4) = 0;
    *(_QWORD *)(v49 + 8) = 0;
    *(_QWORD *)(v49 + 16) = 0;
    *(_QWORD *)(v49 + 24) = 0;
    *(_QWORD *)(v49 + 32) = 0;
  }
  v65 = (unsigned int *)v49;
  *(_DWORD *)(v49 + 20) = 46923644;
  *(_DWORD *)(v49 + 16) = *(_DWORD *)(v18 + 374343896);
  *(_DWORD *)(v49 + 12) = (unsigned __int64)(v49 - v18) >> 3;
  v50 = MEMORY[0x18503B9A0](a1: v47, a2: v48, a3: v49, a4: v46, a5: 0);
  v53 = *(_QWORD *)(v19 + 40);
  if ( (unsigned __int64)(v53 + 24) > *(_QWORD *)(v19 + 32) )
  {
    v64[2] = v50;
    v54 = MEMORY[0x181EAA920](a1: v51, a2: v52, a3: 34082680);
  }
  else
  {
    *(_QWORD *)(v19 + 40) = v53 + 24;
    *(_DWORD *)v53 = 34082680;
    *(_DWORD *)(v53 + 4) = 0;
    *(_QWORD *)(v53 + 8) = 0;
    *(_QWORD *)(v53 + 16) = 0;
    v54 = v53;
  }
  v55 = (unsigned __int64)v65;
  *(_DWORD *)(v54 + 4) = (unsigned __int64)(v66 - v18) >> 3;
  *(_DWORD *)(v55 + 8) = (unsigned __int64)(v54 - v18) >> 3;
  v56 = *(unsigned int *)v55;
  if ( (v56 & 2) != 0 )
  {
    v58 = (v55 & 0xFFFFFFFFFFF80000LL) + 2112;
    v56 = (v55 - v58) >> 9;
    if ( *(_BYTE *)((v55 & 0xFFFFFFFFFFF80000LL) + v56 + 0x38) != 0 )
      *(_BYTE *)((v55 & 0xFFFFFFFFFFF80000LL) + ((v55 - v58) >> 9) + 0x38) = 0;
  }
  if ( *(int *)(v19 + 16) <= 0 )
    sub_18277F280(a1: v51, a2: v52, a3: v56);
  return v86;
}
