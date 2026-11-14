// sub_18276A220
// rva 0x0276a220  size 1606  section .text  group runtime
// window base 0x18276a220: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__m128i __fastcall sub_18276A220(
        __int64 a1,
        __int64 a2,
        _DWORD *a3,
        __int64 a4,
        _DWORD *a5,
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
  unsigned int v16; // ebx
  __int64 v17; // r10
  __int64 v18; // r11
  __int64 v19; // r13
  _DWORD *v20; // r14
  __int64 v21; // r15
  __m128i v22; // xmm8
  __m128i v23; // xmm9
  __m128i v24; // xmm10
  __m128i v25; // xmm11
  __m128i v26; // xmm12
  __m128i v27; // xmm13
  __m128i v28; // xmm14
  __m128i v29; // xmm15
  int v30; // ecx
  __int64 v31; // rdi
  __int64 v32; // rsi
  int v33; // r9d
  __int64 v34; // rax
  int v35; // r8d
  int v36; // edx
  __int64 v37; // rax
  __int64 v38; // rdi
  __int64 v39; // rsi
  __int64 v40; // rdx
  _DWORD *v41; // r8
  unsigned int v42; // eax
  __int64 v43; // rcx
  __int64 v44; // rdi
  __int64 v45; // rsi
  unsigned int v46; // eax
  __int64 v47; // rdi
  __int64 v48; // rsi
  __int64 v49; // rcx
  __int64 v50; // rdx
  unsigned __int64 v51; // r9
  unsigned __int64 v52; // r9
  _DWORD *v53; // rcx
  __int64 v54; // rcx
  unsigned int v55; // eax
  __int64 v56; // rcx
  unsigned int v57; // eax
  __int64 v58; // rdi
  __int64 v59; // rsi
  __int64 v60; // rdx
  __int64 v61; // rax
  __int64 v62; // rdi
  __int64 v63; // rsi
  __int64 v64; // rdx
  unsigned __int64 v65; // rcx
  __int64 v66; // rax
  unsigned __int64 v68; // rbp
  __int64 v69; // rdx
  __int64 v70; // rcx
  __int64 v71; // rdi
  __int64 v72; // rsi
  __int64 v73; // rax
  char v74; // [rsp+0h] [rbp-1B8h] BYREF
  _DWORD *v75; // [rsp+8h] [rbp-1B0h]
  __int64 v76; // [rsp+10h] [rbp-1A8h]
  __int64 v77; // [rsp+18h] [rbp-1A0h]
  __int64 v78; // [rsp+20h] [rbp-198h]
  __int64 v79; // [rsp+28h] [rbp-190h]
  _DWORD *v80; // [rsp+30h] [rbp-188h]
  _DWORD *v81; // [rsp+38h] [rbp-180h]
  _DWORD *v82; // [rsp+40h] [rbp-178h]
  unsigned int v83; // [rsp+4Ch] [rbp-16Ch]
  unsigned int v84; // [rsp+50h] [rbp-168h]
  unsigned int v85; // [rsp+54h] [rbp-164h]
  __m128i v86; // [rsp+58h] [rbp-160h]
  __m128i v87; // [rsp+68h] [rbp-150h]
  __m128i v88; // [rsp+78h] [rbp-140h]
  __m128i v89; // [rsp+88h] [rbp-130h]
  __m128i v90; // [rsp+98h] [rbp-120h]
  __m128i v91; // [rsp+A8h] [rbp-110h]
  __m128i v92; // [rsp+B8h] [rbp-100h]
  __m128i v93; // [rsp+C8h] [rbp-F0h]
  __m128i m128_i128; // [rsp+D8h] [rbp-E0h]
  __m128i v95; // [rsp+E8h] [rbp-D0h]
  __m128i v96; // [rsp+F8h] [rbp-C0h]
  __m128i v97; // [rsp+108h] [rbp-B0h]
  __m128i v98; // [rsp+118h] [rbp-A0h]
  __m128i v99; // [rsp+128h] [rbp-90h]
  __m128i v100; // [rsp+138h] [rbp-80h]
  __m128i v101; // [rsp+148h] [rbp-70h]
  __int64 v102; // [rsp+160h] [rbp-58h]
  __int64 v103; // [rsp+168h] [rbp-50h]
  __int64 v104; // [rsp+170h] [rbp-48h]
  _DWORD *v105; // [rsp+178h] [rbp-40h]
  __int64 v106; // [rsp+180h] [rbp-38h]
  __int64 v107; // [rsp+188h] [rbp-30h]
  _DWORD *v108; // [rsp+198h] [rbp-20h]
  __int64 v109; // [rsp+1A0h] [rbp-18h]
  __int64 v110; // [rsp+1A8h] [rbp-10h]

  v102 = v18;
  v103 = v17;
  v104 = a6;
  v105 = a5;
  v106 = a1;
  v107 = a2;
  v108 = a3;
  v109 = a4;
  v110 = v15;
  v86 = v29;
  v87 = v28;
  v88 = v27;
  v89 = v26;
  v90 = v25;
  v91 = v24;
  v92 = v23;
  v93 = v22;
  m128_i128 = (__m128i)a14.m128_i128;
  v95 = (__m128i)a13.m128_i128;
  v96 = (__m128i)a12.m128_i128;
  v97 = (__m128i)a11.m128_i128;
  v98 = (__m128i)a10.m128_i128;
  v99 = (__m128i)a9.m128_i128;
  v100 = (__m128i)a8.m128_i128;
  v101 = (__m128i)a7.m128_i128;
  v82 = a3;
  v81 = a5;
  if ( (unsigned __int64)&v74 <= *(_QWORD *)(v21 + 8) )
  {
    MEMORY[0x181EB84E0]();
LABEL_35:
    v46 = sub_182771080(a1: v31, a2: v32, a3: v36, a4: v30, a5: v35, a6: v33, a7: v74);
    goto LABEL_36;
  }
  sub_182771FC0(a1, a2, a3: 0);
  v34 = (__int64)(v20 + 88325320);
  v35 = (int)v81;
  if ( v81 != v20 && *v81 >> 3 == 4262015 )
  {
    v80 = v20 + 88325320;
    v34 = MEMORY[0x184F68C80](a1: v31, a2: v32, a3: v81);
  }
  else
  {
    v80 = v20 + 88325320;
    if ( v81 != v20 )
      v34 = ((__int64 (__fastcall *)(__int64, __int64, _DWORD *))(v19 + *(_QWORD *)&v20[2 * (*v81 >> 3) + 26]))(
              a1: v31,
              a2: v32,
              a3: v81);
  }
  v79 = v34;
  v36 = (int)v82;
  if ( v82 == v20 )
    goto LABEL_35;
  v37 = MEMORY[0x184F68C80](a1: v31, a2: v32, a3: &v20[2 * (*v82 >> 3)]);
  if ( (_DWORD *)v37 == v20 )
    v40 = (__int64)v80;
  else
    v40 = v37;
  if ( (_DWORD *)v79 == v20 )
    v41 = v80;
  else
    v41 = (_DWORD *)v79;
  v80 = (_DWORD *)v37;
  v85 = *((char *)v41 + 12) | *(char *)(v40 + 12);
  v78 = (__int64)v41;
  v77 = v40;
  v42 = MEMORY[0x1850132E0](a1: v38, a2: v39, a3: 19, a4: v79, a5: v40);
  v46 = MEMORY[0x1850132E0](a1: v44, a2: v45, a3: v42, a4: v43, a5: v78);
  v49 = v85;
  v16 = v46 << v85;
  if ( ((v46 << v85) & 0x80000000) != 0 )
  {
LABEL_36:
    v84 = v46;
    v69 = *(_QWORD *)(v21 + 40);
    if ( (unsigned __int64)(v69 + 40) > *(_QWORD *)(v21 + 32) )
    {
      v83 = v16;
      v69 = MEMORY[0x181EAA920](a1: v47, a2: v48, a3: 34082880);
    }
    else
    {
      *(_QWORD *)(v21 + 40) = v69 + 40;
      *(_DWORD *)v69 = 34082880;
      *(_DWORD *)(v69 + 4) = 0;
      *(_QWORD *)(v69 + 8) = 0;
      *(_QWORD *)(v69 + 16) = 0;
      *(_QWORD *)(v69 + 24) = 0;
      *(_QWORD *)(v69 + 32) = 0;
      v83 = v16;
    }
    *(_DWORD *)(v69 + 20) = 46923644;
    *(_DWORD *)(v69 + 16) = v20[93585974];
    *(_DWORD *)(v69 + 12) = (unsigned __int64)(v69 - (_QWORD)v20) >> 3;
    v76 = v69;
    MEMORY[0x18503B9A0](a1: v47, a2: v48, a3: v69, a4: v49, a5: 0);
    v73 = v76;
    *(_DWORD *)(v76 + 8) = 46004603;
    if ( (*(_DWORD *)v73 & 2) != 0 )
      goto LABEL_40;
    while ( 1 )
    {
      v73 = sub_1827697E0(a1: v71, a2: v72, a3: (_DWORD *)v73, a4: v70, a5: (__int64)&a15);
LABEL_40:
      v70 = (v73 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v73 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v73 - v70) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v73 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v73 - v70) >> 9) + 0x38) = 0;
    }
  }
  v50 = *(_QWORD *)(v21 + 40);
  v51 = (v16 + 19LL) & 0x1FFFFFFF8LL;
  if ( v51 >= 0x20000 || (v52 = v50 + v51) > *(_QWORD *)(v21 + 32) )
  {
    v84 = v46;
    v50 = MEMORY[0x181EAA840](a1: 34082368, a2: v48, a3: 34082368, a4: v85, a5: v16);
    v46 = v84;
  }
  else
  {
    *(_QWORD *)(v21 + 40) = v52;
    *(_QWORD *)v50 = 34082368;
    *(_DWORD *)(v50 + 8) = v16;
  }
  v76 = v50;
  v53 = v20 + 93320312;
  v75 = v20 + 93320312;
  v84 = v46;
  if ( v85 != 0 )
    MEMORY[0x184FF2C40](a1: 1, a2: v48, a3: v20 + 93320312, a4: v53, a5: v50, a6: v46);
  else
    MEMORY[0x181EB4960](a1: v46, a2: 0, a3: v20 + 94087886, a4: v53, a5: 0, a6: v76);
  v55 = MEMORY[0x185011A80](a1: v78, a2: v20 + 14546168, a3: v84, a4: v54, a5: v85, a6: v76);
  v57 = MEMORY[0x185011A80](a1: v77, a2: v75, a3: v55, a4: v56, a5: v85, a6: v76);
  v60 = *(_QWORD *)(v21 + 40);
  if ( (unsigned __int64)(v60 + 40) > *(_QWORD *)(v21 + 32) )
  {
    v83 = v57;
    v60 = MEMORY[0x181EAA920](a1: v58, a2: v59, a3: 34590936);
  }
  else
  {
    *(_QWORD *)(v21 + 40) = v60 + 40;
    *(_DWORD *)v60 = 34590936;
    *(_DWORD *)(v60 + 4) = 0;
    *(_QWORD *)(v60 + 8) = 0;
    *(_QWORD *)(v60 + 16) = 0;
    *(_QWORD *)(v60 + 24) = 0;
    *(_QWORD *)(v60 + 32) = 0;
  }
  v80 = (_DWORD *)v60;
  *(_DWORD *)(v60 + 20) = 46923644;
  *(_DWORD *)(v60 + 16) = v20[93585974];
  *(_DWORD *)(v60 + 12) = (unsigned __int64)(v60 - (_QWORD)v20) >> 3;
  v83 = (char)v85;
  v61 = MEMORY[0x18503B9A0](a1: v58, a2: v59, a3: v60, a4: v60, a5: 0);
  v64 = *(_QWORD *)(v21 + 40);
  if ( (unsigned __int64)(v64 + 24) > *(_QWORD *)(v21 + 32) )
  {
    v78 = v61;
    v64 = MEMORY[0x181EAA920](a1: v62, a2: 34082680, a3: 34082680);
  }
  else
  {
    *(_QWORD *)(v21 + 40) = v64 + 24;
    *(_DWORD *)v64 = 34082680;
    *(_DWORD *)(v64 + 4) = 0;
    *(_QWORD *)(v64 + 8) = 0;
    *(_QWORD *)(v64 + 16) = 0;
  }
  v65 = (unsigned __int64)v80;
  v66 = v76;
  *(_BYTE *)(v64 + 12) = v85;
  *(_DWORD *)(v64 + 4) = (unsigned __int64)(v66 - (_QWORD)v20) >> 3;
  *(_DWORD *)(v65 + 8) = (unsigned __int64)(v64 - (_QWORD)v20) >> 3;
  if ( (*(_DWORD *)v65 & 2) != 0 )
  {
    v68 = (v65 & 0xFFFFFFFFFFF80000LL) + 2112;
    if ( *(_BYTE *)((v65 & 0xFFFFFFFFFFF80000LL) + ((v65 - v68) >> 9) + 0x38) != 0 )
      *(_BYTE *)((v65 & 0xFFFFFFFFFFF80000LL) + ((v65 - v68) >> 9) + 0x38) = 0;
  }
  if ( *(int *)(v21 + 16) <= 0 )
    sub_18277F280(a1: v62, a2: v63, a3: v64);
  return v101;
}
