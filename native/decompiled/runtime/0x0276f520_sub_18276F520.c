// sub_18276F520
// rva 0x0276f520  size 528  section .text  group runtime
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall sub_18276F520(
        __int64 a1,
        __int64 a2,
        _DWORD *a3,
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
  _DWORD *v21; // r14
  _QWORD *v22; // r15
  __m128i v23; // xmm8
  __m128i v24; // xmm9
  __m128i v25; // xmm10
  __m128i v26; // xmm11
  __m128i v27; // xmm12
  __m128i v28; // xmm13
  __m128i v29; // xmm14
  __m128i v30; // xmm15
  int v31; // ecx
  __int64 v32; // rdi
  __int64 v33; // rsi
  int v34; // r8d
  int v35; // r9d
  int v36; // edx
  __int64 v37; // rdi
  __int64 v38; // rsi
  __int64 v39; // rdx
  __int64 v40; // rdi
  __int64 v41; // rsi
  __int64 v42; // rcx
  unsigned __int64 v43; // rbx
  __int64 v44; // rax
  __int64 v45; // rdi
  __int64 v46; // rsi
  __int64 v47; // r11
  __int64 v48; // r10
  __int64 v49; // r9
  __int64 v50; // r8
  __int64 v51; // rdx
  __int64 v52; // rcx
  __m128i v53; // xmm7
  __m128i v54; // xmm6
  __m128i v55; // xmm5
  __m128i v56; // xmm4
  __m128i v57; // xmm3
  __m128i v58; // xmm2
  __m128i v59; // xmm1
  __m128i v60; // xmm0
  __int64 v61; // rcx
  __int64 v62; // rdi
  __int64 v63; // rsi
  __int64 v64; // rdx
  __int64 v65; // rcx
  __int64 v66; // rdi
  __int64 v67; // rsi
  __int64 v68; // rax
  __int64 v69; // rdx
  __int64 v70; // rdi
  __int64 v71; // rsi
  __int64 v72; // r11
  __int64 v73; // r10
  __int64 v74; // r9
  __int64 v75; // r8
  __int64 v76; // rcx
  __m128i v77; // xmm7
  __m128i v78; // xmm6
  __m128i v79; // xmm5
  __m128i v80; // xmm4
  __m128i v81; // xmm3
  __m128i v82; // xmm2
  __m128i v83; // xmm1
  __m128i v84; // xmm0
  __int64 v85; // rcx
  __int64 v86; // rdi
  __int64 v87; // rsi
  __int64 v88; // rdx
  __int64 v89; // rcx
  __int64 v90; // rdi
  __int64 v91; // rsi
  __int64 v92; // rax
  __int64 v93; // rdi
  __int64 v94; // rsi
  __int64 v95; // r11
  __int64 v96; // r10
  __int64 v97; // r9
  __int64 v98; // r8
  __int64 v99; // rdx
  __int64 v100; // rcx
  __m128i v101; // xmm7
  __m128i v102; // xmm6
  __m128i v103; // xmm5
  __m128i v104; // xmm4
  __m128i v105; // xmm3
  __m128i v106; // xmm2
  __m128i v107; // xmm1
  __m128i v108; // xmm0
  __int64 v109; // rcx
  __int64 v110; // rdi
  __int64 v111; // rsi
  __int64 v112; // rdx
  __int64 v113; // rcx
  __int64 v114; // rdi
  __int64 v115; // rsi
  int v116; // edx
  int v117; // ecx
  int v118; // edi
  int v119; // esi
  int v120; // r8d
  int v121; // r9d
  __int64 v123; // [rsp-10h] [rbp-5F0h] BYREF
  _DWORD *v124; // [rsp+0h] [rbp-5E0h]
  __m128i v125; // [rsp+8h] [rbp-5D8h]
  __m128i v126; // [rsp+18h] [rbp-5C8h]
  __m128i v127; // [rsp+28h] [rbp-5B8h]
  __m128i v128; // [rsp+38h] [rbp-5A8h]
  __m128i v129; // [rsp+48h] [rbp-598h]
  __m128i v130; // [rsp+58h] [rbp-588h]
  __m128i v131; // [rsp+68h] [rbp-578h]
  __m128i v132; // [rsp+78h] [rbp-568h]
  __m128i v133; // [rsp+88h] [rbp-558h]
  __m128i v134; // [rsp+98h] [rbp-548h]
  __m128i v135; // [rsp+A8h] [rbp-538h]
  __m128i v136; // [rsp+B8h] [rbp-528h]
  __m128i v137; // [rsp+C8h] [rbp-518h]
  __m128i v138; // [rsp+D8h] [rbp-508h]
  __m128i v139; // [rsp+E8h] [rbp-4F8h]
  __m128i v140; // [rsp+F8h] [rbp-4E8h]
  __int64 v141; // [rsp+108h] [rbp-4D8h]
  __int64 v142; // [rsp+110h] [rbp-4D0h]
  __int64 v143; // [rsp+118h] [rbp-4C8h]
  __int64 v144; // [rsp+120h] [rbp-4C0h]
  __int64 v145; // [rsp+128h] [rbp-4B8h]
  __int64 v146; // [rsp+130h] [rbp-4B0h]
  __int64 v147; // [rsp+138h] [rbp-4A8h]
  __int64 v148; // [rsp+140h] [rbp-4A0h]
  __int64 v149; // [rsp+148h] [rbp-498h]
  __int64 v150; // [rsp+150h] [rbp-490h]
  __int64 v151; // [rsp+158h] [rbp-488h]
  __int64 v152; // [rsp+160h] [rbp-480h]
  __int64 v153; // [rsp+168h] [rbp-478h] BYREF
  _DWORD *v154; // [rsp+170h] [rbp-470h] BYREF
  __int64 v155; // [rsp+178h] [rbp-468h]
  __m128i v156; // [rsp+180h] [rbp-460h]
  __m128i v157; // [rsp+190h] [rbp-450h]
  __m128i v158; // [rsp+1A0h] [rbp-440h]
  __m128i v159; // [rsp+1B0h] [rbp-430h]
  __m128i v160; // [rsp+1C0h] [rbp-420h]
  __m128i v161; // [rsp+1D0h] [rbp-410h]
  __m128i v162; // [rsp+1E0h] [rbp-400h]
  __m128i v163; // [rsp+1F0h] [rbp-3F0h]
  __m128i v164; // [rsp+200h] [rbp-3E0h]
  __m128i v165; // [rsp+210h] [rbp-3D0h]
  __m128i v166; // [rsp+220h] [rbp-3C0h]
  __m128i v167; // [rsp+230h] [rbp-3B0h]
  __m128i v168; // [rsp+240h] [rbp-3A0h]
  __m128i v169; // [rsp+250h] [rbp-390h]
  __m128i v170; // [rsp+260h] [rbp-380h]
  __m128i v171; // [rsp+270h] [rbp-370h]
  __int64 v172; // [rsp+280h] [rbp-360h]
  __int64 v173; // [rsp+288h] [rbp-358h]
  __int64 v174; // [rsp+290h] [rbp-350h]
  __int64 v175; // [rsp+298h] [rbp-348h]
  __int64 v176; // [rsp+2A0h] [rbp-340h]
  __int64 v177; // [rsp+2A8h] [rbp-338h]
  __int64 v178; // [rsp+2B0h] [rbp-330h]
  __int64 v179; // [rsp+2B8h] [rbp-328h]
  __int64 v180; // [rsp+2C0h] [rbp-320h]
  __int64 v181; // [rsp+2C8h] [rbp-318h]
  __int64 v182; // [rsp+2D0h] [rbp-310h]
  __int64 v183; // [rsp+2D8h] [rbp-308h]
  __int64 v184; // [rsp+2E0h] [rbp-300h] BYREF
  char v185[8]; // [rsp+2E8h] [rbp-2F8h] BYREF
  _DWORD *v186; // [rsp+2F0h] [rbp-2F0h]
  __m128i v187; // [rsp+2F8h] [rbp-2E8h]
  __m128i v188; // [rsp+308h] [rbp-2D8h]
  __m128i v189; // [rsp+318h] [rbp-2C8h]
  __m128i v190; // [rsp+328h] [rbp-2B8h]
  __m128i v191; // [rsp+338h] [rbp-2A8h]
  __m128i v192; // [rsp+348h] [rbp-298h]
  __m128i v193; // [rsp+358h] [rbp-288h]
  __m128i v194; // [rsp+368h] [rbp-278h]
  __m128i v195; // [rsp+378h] [rbp-268h]
  __m128i v196; // [rsp+388h] [rbp-258h]
  __m128i v197; // [rsp+398h] [rbp-248h]
  __m128i v198; // [rsp+3A8h] [rbp-238h]
  __m128i v199; // [rsp+3B8h] [rbp-228h]
  __m128i v200; // [rsp+3C8h] [rbp-218h]
  __m128i v201; // [rsp+3D8h] [rbp-208h]
  __m128i v202; // [rsp+3E8h] [rbp-1F8h]
  __int64 v203; // [rsp+3F8h] [rbp-1E8h]
  __int64 v204; // [rsp+400h] [rbp-1E0h]
  __int64 v205; // [rsp+408h] [rbp-1D8h]
  __int64 v206; // [rsp+410h] [rbp-1D0h]
  __int64 v207; // [rsp+418h] [rbp-1C8h]
  __int64 v208; // [rsp+420h] [rbp-1C0h]
  __int64 v209; // [rsp+428h] [rbp-1B8h]
  __int64 v210; // [rsp+430h] [rbp-1B0h]
  __int64 v211; // [rsp+438h] [rbp-1A8h]
  __int64 v212; // [rsp+440h] [rbp-1A0h]
  __int64 v213; // [rsp+448h] [rbp-198h]
  __int64 v214; // [rsp+450h] [rbp-190h]
  char v215; // [rsp+458h] [rbp-188h] BYREF
  char v216[8]; // [rsp+460h] [rbp-180h] BYREF
  __int64 v217; // [rsp+468h] [rbp-178h]
  __int64 v218; // [rsp+470h] [rbp-170h]
  _DWORD *v219; // [rsp+478h] [rbp-168h]
  __m128i v220; // [rsp+480h] [rbp-160h]
  __m128i v221; // [rsp+490h] [rbp-150h]
  __m128i v222; // [rsp+4A0h] [rbp-140h]
  __m128i v223; // [rsp+4B0h] [rbp-130h]
  __m128i v224; // [rsp+4C0h] [rbp-120h]
  __m128i v225; // [rsp+4D0h] [rbp-110h]
  __m128i v226; // [rsp+4E0h] [rbp-100h]
  __m128i v227; // [rsp+4F0h] [rbp-F0h]
  __m128i m128_i128; // [rsp+500h] [rbp-E0h]
  __m128i v229; // [rsp+510h] [rbp-D0h]
  __m128i v230; // [rsp+520h] [rbp-C0h]
  __m128i v231; // [rsp+530h] [rbp-B0h]
  __m128i v232; // [rsp+540h] [rbp-A0h]
  __m128i v233; // [rsp+550h] [rbp-90h]
  __m128i v234; // [rsp+560h] [rbp-80h]
  __m128i v235; // [rsp+570h] [rbp-70h]
  __int64 v236; // [rsp+580h] [rbp-60h]
  __int64 v237; // [rsp+588h] [rbp-58h]
  __int64 v238; // [rsp+590h] [rbp-50h]
  __int64 v239; // [rsp+598h] [rbp-48h]
  __int64 v240; // [rsp+5A0h] [rbp-40h]
  __int64 v241; // [rsp+5A8h] [rbp-38h]
  __int64 v242; // [rsp+5B0h] [rbp-30h]
  __int64 v243; // [rsp+5B8h] [rbp-28h]
  _DWORD *v244; // [rsp+5C0h] [rbp-20h]
  __int64 v245; // [rsp+5C8h] [rbp-18h]
  __int64 v246; // [rsp+5D0h] [rbp-10h]

  v236 = v20;
  v237 = v19;
  v238 = v18;
  v239 = a6;
  v240 = a5;
  v241 = a1;
  v242 = a2;
  v243 = v16;
  v244 = a3;
  v245 = a4;
  v246 = v15;
  v220 = v30;
  v221 = v29;
  v222 = v28;
  v223 = v27;
  v224 = v26;
  v225 = v25;
  v226 = v24;
  v227 = v23;
  m128_i128 = (__m128i)a14.m128_i128;
  v229 = (__m128i)a13.m128_i128;
  v230 = (__m128i)a12.m128_i128;
  v231 = (__m128i)a11.m128_i128;
  v232 = (__m128i)a10.m128_i128;
  v233 = (__m128i)a9.m128_i128;
  v234 = (__m128i)a8.m128_i128;
  v235 = (__m128i)a7.m128_i128;
  v219 = a3;
  if ( (unsigned __int64)&v215 <= v22[1] )
  {
    MEMORY[0x181EB84E0]();
  }
  else
  {
    sub_182771FC0(a1, a2, a3: 0);
    v36 = (int)v219;
    if ( v219 != v21 )
    {
      v218 = MEMORY[0x184F68C80](a1: v32, a2: v33, a3: &v21[2 * (*v219 >> 3)]);
      v39 = v22[5];
      if ( (unsigned __int64)(v39 + 40) > v22[4] )
      {
        v39 = MEMORY[0x181EAA920](a1: v37, a2: v38, a3: 35966824);
      }
      else
      {
        v22[5] = v39 + 40;
        *(_DWORD *)v39 = 35966824;
        *(_DWORD *)(v39 + 4) = 0;
        *(_QWORD *)(v39 + 8) = 0;
        *(_QWORD *)(v39 + 16) = 0;
        *(_QWORD *)(v39 + 24) = 0;
        *(_QWORD *)(v39 + 32) = 0;
      }
      *(_DWORD *)(v39 + 20) = 46923644;
      *(_DWORD *)(v39 + 16) = v21[93585974];
      *(_DWORD *)(v39 + 12) = (unsigned __int64)(v39 - (_QWORD)v21) >> 3;
      v217 = v39;
      MEMORY[0x18503B9A0](a1: v37, a2: v38, a3: v39, a4: v39, a5: 0);
      v42 = v217;
      *(_DWORD *)(v217 + 8) = (unsigned __int64)(v218 - (_QWORD)v21) >> 3;
      if ( (*(_DWORD *)v42 & 2) != 0 )
        goto LABEL_7;
      while ( 1 )
      {
        sub_1827697E0(a1: v40, a2: v41, a3: (_DWORD *)v42, a4: v42, a5: (__int64)&a15);
LABEL_7:
        v43 = (v42 & 0xFFFFFFFFFFF80000LL) + 2112;
        if ( *(_BYTE *)((v42 & 0xFFFFFFFFFFF80000LL) + ((v42 - v43) >> 9) + 0x38) != 0 )
          *(_BYTE *)((v42 & 0xFFFFFFFFFFF80000LL) + ((v42 - v43) >> 9) + 0x38) = 0;
      }
    }
  }
  v44 = sub_182771080(a1: v32, a2: v33, a3: v36, a4: v31, a5: v34, a6: v35, a7: v215);
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
  v214 = v17;
  v203 = v20;
  v204 = v47;
  v205 = v48;
  v206 = v49;
  v207 = v50;
  v208 = v45;
  v209 = v46;
  v210 = v16;
  v211 = v51;
  v212 = v52;
  v213 = v44;
  v187 = v30;
  v188 = v29;
  v189 = v28;
  v190 = v27;
  v191 = v26;
  v192 = v25;
  v193 = v24;
  v194 = v23;
  v195 = v53;
  v196 = v54;
  v197 = v55;
  v198 = v56;
  v199 = v57;
  v200 = v58;
  v201 = v59;
  v202 = v60;
  if ( (unsigned __int64)&v184 > v22[1] )
  {
    sub_182771FC0(a1: v45, a2: v46, a3: 0);
    v64 = v22[5];
    if ( (unsigned __int64)(v64 + 40) > v22[4] )
      goto LABEL_15;
    v22[5] = v64 + 40;
    *(_DWORD *)v64 = 34591136;
    *(_DWORD *)(v64 + 4) = 0;
    *(_QWORD *)(v64 + 8) = 0;
    *(_QWORD *)(v64 + 16) = 0;
    *(_QWORD *)(v64 + 24) = 0;
    *(_QWORD *)(v64 + 32) = 0;
    while ( 1 )
    {
      *(_DWORD *)(v64 + 20) = 46923644;
      *(_DWORD *)(v64 + 16) = v21[93585974];
      *(_DWORD *)(v64 + 12) = (unsigned __int64)(v64 - (_QWORD)v21) >> 3;
      v186 = (_DWORD *)v64;
      MEMORY[0x18503B9A0](a1: v62, a2: v63, a3: v64, a4: v61, a5: 0);
      sub_1827697E0(a1: v66, a2: v67, a3: v186, a4: v65, a5: (__int64)v216);
LABEL_15:
      v64 = MEMORY[0x181EAA920](a1: v62, a2: v63, a3: 34591136);
    }
  }
  v68 = MEMORY[0x181EB84E0]();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  v183 = v17;
  v172 = v20;
  v173 = v72;
  v174 = v73;
  v175 = v74;
  v176 = v75;
  v177 = v70;
  v178 = v71;
  v179 = v16;
  v180 = v69;
  v181 = v76;
  v182 = v68;
  v156 = v30;
  v157 = v29;
  v158 = v28;
  v159 = v27;
  v160 = v26;
  v161 = v25;
  v162 = v24;
  v163 = v23;
  v164 = v77;
  v165 = v78;
  v166 = v79;
  v167 = v80;
  v168 = v81;
  v169 = v82;
  v170 = v83;
  v171 = v84;
  if ( (unsigned __int64)&v153 > v22[1] )
  {
    v155 = v69;
    sub_182771FC0(a1: v70, a2: v71, a3: 0);
    v88 = v22[5];
    if ( (unsigned __int64)(v88 + 40) > v22[4] )
      goto LABEL_20;
    v22[5] = v88 + 40;
    *(_DWORD *)v88 = 34591136;
    *(_DWORD *)(v88 + 4) = 0;
    *(_QWORD *)(v88 + 8) = 0;
    *(_QWORD *)(v88 + 16) = 0;
    *(_QWORD *)(v88 + 24) = 0;
    *(_QWORD *)(v88 + 32) = 0;
    while ( 1 )
    {
      v154 = (_DWORD *)v88;
      MEMORY[0x184F403E0](a1: v86, a2: v87, a3: v88, a4: v85, a5: v155);
      sub_1827697E0(a1: v90, a2: v91, a3: v154, a4: v89, a5: (__int64)v185);
LABEL_20:
      v88 = MEMORY[0x181EAA920](a1: v86, a2: v87, a3: 34591136);
    }
  }
  v92 = MEMORY[0x181EB84E0]();
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
  v152 = v17;
  v141 = v20;
  v142 = v95;
  v143 = v96;
  v144 = v97;
  v145 = v98;
  v146 = v93;
  v147 = v94;
  v148 = v16;
  v149 = v99;
  v150 = v100;
  v151 = v92;
  v125 = v30;
  v126 = v29;
  v127 = v28;
  v128 = v27;
  v129 = v26;
  v130 = v25;
  v131 = v24;
  v132 = v23;
  v133 = v101;
  v134 = v102;
  v135 = v103;
  v136 = v104;
  v137 = v105;
  v138 = v106;
  v139 = v107;
  v140 = v108;
  if ( (unsigned __int64)&v123 > v22[1] )
  {
    sub_182771FC0(a1: v93, a2: v94, a3: 0);
    v112 = v22[5];
    if ( (unsigned __int64)(v112 + 40) > v22[4] )
      goto LABEL_25;
    v22[5] = v112 + 40;
    *(_DWORD *)v112 = 34590936;
    *(_DWORD *)(v112 + 4) = 0;
    *(_QWORD *)(v112 + 8) = 0;
    *(_QWORD *)(v112 + 16) = 0;
    *(_QWORD *)(v112 + 24) = 0;
    *(_QWORD *)(v112 + 32) = 0;
    while ( 1 )
    {
      *(_DWORD *)(v112 + 20) = 46923644;
      *(_DWORD *)(v112 + 16) = v21[93585974];
      *(_DWORD *)(v112 + 12) = (unsigned __int64)(v112 - (_QWORD)v21) >> 3;
      v124 = (_DWORD *)v112;
      MEMORY[0x18503B9A0](a1: v110, a2: v111, a3: v112, a4: v109, a5: 0);
      sub_1827697E0(a1: v114, a2: v115, a3: v124, a4: v113, a5: (__int64)&v154);
LABEL_25:
      v112 = MEMORY[0x181EAA920](a1: v110, a2: v111, a3: 34590936);
    }
  }
  MEMORY[0x181EB84E0]();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  return sub_18276FC00(a1: v118, a2: v119, a3: v116, a4: v117, a5: v120, a6: v121, a7: a15);
}
