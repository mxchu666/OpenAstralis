// sub_182770B00
// rva 0x02770b00  size 410  section .text  group runtime
// window base 0x182770b00: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall sub_182770B00(
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
  __int64 v16; // rbx
  __int64 v17; // rbp
  __int64 v18; // r10
  __int64 v19; // r11
  __int64 v20; // r12
  __int64 v21; // r14
  _QWORD *v22; // r15
  __m128i v23; // xmm8
  __m128i v24; // xmm9
  __m128i v25; // xmm10
  __m128i v26; // xmm11
  __m128i v27; // xmm12
  __m128i v28; // xmm13
  __m128i v29; // xmm14
  __m128i v30; // xmm15
  __int64 v31; // rcx
  __int64 v32; // rdi
  __int64 v33; // rsi
  __int64 v34; // rdx
  __int64 v35; // rcx
  __int64 v36; // rdi
  __int64 v37; // rsi
  __int64 v38; // rax
  __int64 v39; // rdi
  __int64 v40; // rsi
  __int64 v41; // r11
  __int64 v42; // r10
  __int64 v43; // r9
  __int64 v44; // r8
  __int64 v45; // rdx
  __int64 v46; // rcx
  __m128i v47; // xmm7
  __m128i v48; // xmm6
  __m128i v49; // xmm5
  __m128i v50; // xmm4
  __m128i v51; // xmm3
  __m128i v52; // xmm2
  __m128i v53; // xmm1
  __m128i v54; // xmm0
  __int64 v55; // rcx
  __int64 v56; // rdi
  __int64 v57; // rsi
  __int64 v58; // rdx
  __int64 v59; // rcx
  __int64 v60; // rdi
  __int64 v61; // rsi
  __int64 v62; // rax
  int v63; // edx
  int v64; // ecx
  int v65; // edi
  int v66; // esi
  int v67; // r8d
  int v68; // r9d
  __int64 v70; // [rsp-10h] [rbp-2F0h] BYREF
  __int64 v71; // [rsp+0h] [rbp-2E0h]
  __m128i v72; // [rsp+8h] [rbp-2D8h]
  __m128i v73; // [rsp+18h] [rbp-2C8h]
  __m128i v74; // [rsp+28h] [rbp-2B8h]
  __m128i v75; // [rsp+38h] [rbp-2A8h]
  __m128i v76; // [rsp+48h] [rbp-298h]
  __m128i v77; // [rsp+58h] [rbp-288h]
  __m128i v78; // [rsp+68h] [rbp-278h]
  __m128i v79; // [rsp+78h] [rbp-268h]
  __m128i v80; // [rsp+88h] [rbp-258h]
  __m128i v81; // [rsp+98h] [rbp-248h]
  __m128i v82; // [rsp+A8h] [rbp-238h]
  __m128i v83; // [rsp+B8h] [rbp-228h]
  __m128i v84; // [rsp+C8h] [rbp-218h]
  __m128i v85; // [rsp+D8h] [rbp-208h]
  __m128i v86; // [rsp+E8h] [rbp-1F8h]
  __m128i v87; // [rsp+F8h] [rbp-1E8h]
  __int64 v88; // [rsp+108h] [rbp-1D8h]
  __int64 v89; // [rsp+110h] [rbp-1D0h]
  __int64 v90; // [rsp+118h] [rbp-1C8h]
  __int64 v91; // [rsp+120h] [rbp-1C0h]
  __int64 v92; // [rsp+128h] [rbp-1B8h]
  __int64 v93; // [rsp+130h] [rbp-1B0h]
  __int64 v94; // [rsp+138h] [rbp-1A8h]
  __int64 v95; // [rsp+140h] [rbp-1A0h]
  __int64 v96; // [rsp+148h] [rbp-198h]
  __int64 v97; // [rsp+150h] [rbp-190h]
  __int64 v98; // [rsp+158h] [rbp-188h]
  __int64 v99; // [rsp+160h] [rbp-180h]
  __int64 v100; // [rsp+168h] [rbp-178h] BYREF
  _BYTE v101[8]; // [rsp+170h] [rbp-170h] BYREF
  _DWORD *v102; // [rsp+178h] [rbp-168h]
  __m128i v103; // [rsp+180h] [rbp-160h]
  __m128i v104; // [rsp+190h] [rbp-150h]
  __m128i v105; // [rsp+1A0h] [rbp-140h]
  __m128i v106; // [rsp+1B0h] [rbp-130h]
  __m128i v107; // [rsp+1C0h] [rbp-120h]
  __m128i v108; // [rsp+1D0h] [rbp-110h]
  __m128i v109; // [rsp+1E0h] [rbp-100h]
  __m128i v110; // [rsp+1F0h] [rbp-F0h]
  __m128i m128_i128; // [rsp+200h] [rbp-E0h]
  __m128i v112; // [rsp+210h] [rbp-D0h]
  __m128i v113; // [rsp+220h] [rbp-C0h]
  __m128i v114; // [rsp+230h] [rbp-B0h]
  __m128i v115; // [rsp+240h] [rbp-A0h]
  __m128i v116; // [rsp+250h] [rbp-90h]
  __m128i v117; // [rsp+260h] [rbp-80h]
  __m128i v118; // [rsp+270h] [rbp-70h]
  __int64 v119; // [rsp+280h] [rbp-60h]
  __int64 v120; // [rsp+288h] [rbp-58h]
  __int64 v121; // [rsp+290h] [rbp-50h]
  __int64 v122; // [rsp+298h] [rbp-48h]
  __int64 v123; // [rsp+2A0h] [rbp-40h]
  __int64 v124; // [rsp+2A8h] [rbp-38h]
  __int64 v125; // [rsp+2B0h] [rbp-30h]
  __int64 v126; // [rsp+2B8h] [rbp-28h]
  __int64 v127; // [rsp+2C0h] [rbp-20h]
  __int64 v128; // [rsp+2C8h] [rbp-18h]
  __int64 v129; // [rsp+2D0h] [rbp-10h]

  v119 = v20;
  v120 = v19;
  v121 = v18;
  v122 = a6;
  v123 = a5;
  v124 = a1;
  v125 = a2;
  v126 = v16;
  v127 = a3;
  v128 = a4;
  v129 = v15;
  v103 = v30;
  v104 = v29;
  v105 = v28;
  v106 = v27;
  v107 = v26;
  v108 = v25;
  v109 = v24;
  v110 = v23;
  m128_i128 = (__m128i)a14.m128_i128;
  v112 = (__m128i)a13.m128_i128;
  v113 = (__m128i)a12.m128_i128;
  v114 = (__m128i)a11.m128_i128;
  v115 = (__m128i)a10.m128_i128;
  v116 = (__m128i)a9.m128_i128;
  v117 = (__m128i)a8.m128_i128;
  v118 = (__m128i)a7.m128_i128;
  if ( (unsigned __int64)&v100 > v22[1] )
  {
    sub_182771FC0(a1, a2, a3: 0);
    v34 = v22[5];
    if ( (unsigned __int64)(v34 + 40) > v22[4] )
      goto LABEL_5;
    v22[5] = v34 + 40;
    *(_DWORD *)v34 = 34150672;
    *(_DWORD *)(v34 + 4) = 0;
    *(_QWORD *)(v34 + 8) = 0;
    *(_QWORD *)(v34 + 16) = 0;
    *(_QWORD *)(v34 + 24) = 0;
    *(_QWORD *)(v34 + 32) = 0;
    while ( 1 )
    {
      *(_DWORD *)(v34 + 20) = 46923644;
      *(_DWORD *)(v34 + 16) = *(_DWORD *)(v21 + 374343896);
      *(_DWORD *)(v34 + 12) = (unsigned __int64)(v34 - v21) >> 3;
      v102 = (_DWORD *)v34;
      MEMORY[0x18503B9A0](a1: v32, a2: v33, a3: v34, a4: v31, a5: 0);
      sub_1827697E0(a1: v36, a2: v37, a3: v102, a4: v35, a5: (__int64)&a15);
LABEL_5:
      v34 = MEMORY[0x181EAA920](a1: v32, a2: v33, a3: 34150672);
    }
  }
  v38 = MEMORY[0x181EB84E0]();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  v99 = v17;
  v88 = v20;
  v89 = v41;
  v90 = v42;
  v91 = v43;
  v92 = v44;
  v93 = v39;
  v94 = v40;
  v95 = v16;
  v96 = v45;
  v97 = v46;
  v98 = v38;
  v72 = v30;
  v73 = v29;
  v74 = v28;
  v75 = v27;
  v76 = v26;
  v77 = v25;
  v78 = v24;
  v79 = v23;
  v80 = v47;
  v81 = v48;
  v82 = v49;
  v83 = v50;
  v84 = v51;
  v85 = v52;
  v86 = v53;
  v87 = v54;
  if ( (unsigned __int64)&v70 > v22[1] )
  {
    sub_182771FC0(a1: v39, a2: v40, a3: 0);
    v58 = v22[5];
    if ( (unsigned __int64)(v58 + 40) > v22[4] )
    {
      v58 = MEMORY[0x181EAA920](a1: v56, a2: v57, a3: 34171952);
    }
    else
    {
      v22[5] = v58 + 40;
      *(_DWORD *)v58 = 34171952;
      *(_DWORD *)(v58 + 4) = 0;
      *(_QWORD *)(v58 + 8) = 0;
      *(_QWORD *)(v58 + 16) = 0;
      *(_QWORD *)(v58 + 24) = 0;
      *(_QWORD *)(v58 + 32) = 0;
    }
    *(_DWORD *)(v58 + 20) = 46923644;
    *(_DWORD *)(v58 + 16) = *(_DWORD *)(v21 + 374343896);
    *(_DWORD *)(v58 + 12) = (unsigned __int64)(v58 - v21) >> 3;
    v71 = v58;
    MEMORY[0x18503B9A0](a1: v56, a2: v57, a3: v58, a4: v55, a5: 0);
    v62 = v71;
    *(_DWORD *)(v71 + 8) = 44883198;
    if ( (*(_DWORD *)v62 & 2) != 0 )
      goto LABEL_11;
    while ( 1 )
    {
      v62 = sub_1827697E0(a1: v60, a2: v61, a3: (_DWORD *)v62, a4: v59, a5: (__int64)v101);
LABEL_11:
      v59 = (v62 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v62 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v62 - v59) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v62 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v62 - v59) >> 9) + 0x38) = 0;
    }
  }
  MEMORY[0x181EB84E0]();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  return sub_182770E80(a1: v65, a2: v66, a3: v63, a4: v64, a5: v67, a6: v68, a7: a15);
}
