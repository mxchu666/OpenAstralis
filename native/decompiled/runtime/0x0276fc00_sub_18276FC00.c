// sub_18276FC00
// rva 0x0276fc00  size 1414  section .text  group runtime
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall sub_18276FC00(
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
  __int64 v16; // rbx
  __int64 v17; // rbp
  __int64 v18; // r10
  __int64 v19; // r11
  __int64 v20; // r12
  __int64 v21; // r13
  _DWORD *v22; // r14
  _QWORD *v23; // r15
  __m128i v24; // xmm8
  __m128i v25; // xmm9
  __m128i v26; // xmm10
  __m128i v27; // xmm11
  __m128i v28; // xmm12
  __m128i v29; // xmm13
  __m128i v30; // xmm14
  __m128i v31; // xmm15
  __int64 v32; // rdi
  __int64 v33; // rsi
  int v34; // r9d
  __int64 v35; // rax
  int v36; // edx
  __int64 v37; // rax
  __int64 v38; // rdi
  __int64 v39; // rsi
  __int64 i; // rdx
  __int64 v41; // r8
  unsigned int v42; // eax
  __int64 v43; // rcx
  __int64 v44; // rdi
  __int64 v45; // rsi
  unsigned int v46; // eax
  __int64 v47; // rdi
  __int64 v48; // rsi
  __int64 v49; // rcx
  unsigned int v50; // ebx
  __int64 v51; // rdx
  unsigned __int64 v52; // r9
  unsigned __int64 v53; // r9
  _DWORD *v54; // rcx
  __int64 v55; // rcx
  unsigned int v56; // eax
  __int64 v57; // rcx
  int v58; // eax
  __int64 v59; // rdi
  __int64 v60; // rsi
  __int64 v61; // rdx
  __int64 v62; // rax
  __int64 v63; // rdi
  __int64 v64; // rsi
  __int64 v65; // rdx
  __int64 v66; // rcx
  char *v67; // rax
  _DWORD *v68; // rax
  __int64 v69; // rdx
  unsigned __int64 v70; // rdx
  unsigned __int64 v71; // rax
  __int64 v72; // rax
  __int64 v73; // rdi
  __int64 v74; // rsi
  __int64 v75; // r11
  __int64 v76; // r10
  __int64 v77; // r9
  __int64 v78; // r8
  __int64 v79; // rdx
  __int64 v80; // rcx
  __m128i v81; // xmm7
  __m128i v82; // xmm6
  __m128i v83; // xmm5
  __m128i v84; // xmm4
  __m128i v85; // xmm3
  __m128i v86; // xmm2
  __m128i v87; // xmm1
  __m128i v88; // xmm0
  __int64 v89; // rcx
  __int64 v90; // rdi
  __int64 v91; // rsi
  __int64 v92; // rdx
  __int64 v93; // rcx
  __int64 v94; // rdi
  __int64 v95; // rsi
  __int64 v96; // rax
  __int64 v97; // rax
  __int64 v98; // rdi
  __int64 v99; // rsi
  __int64 v100; // r11
  __int64 v101; // r10
  __int64 v102; // r9
  __int64 v103; // r8
  __int64 v104; // rdx
  __int64 v105; // rcx
  __m128i v106; // xmm7
  __m128i v107; // xmm6
  __m128i v108; // xmm5
  __m128i v109; // xmm4
  __m128i v110; // xmm3
  __m128i v111; // xmm2
  __m128i v112; // xmm1
  __m128i v113; // xmm0
  __int64 v114; // rdi
  __int64 v115; // rsi
  __int64 v116; // rdx
  unsigned __int64 v117; // rcx
  __int64 v118; // rdi
  __int64 v119; // rsi
  __int64 v120; // rax
  unsigned __int64 v121; // rbx
  __int64 v122; // rax
  __int64 v123; // rdi
  __int64 v124; // rsi
  __int64 v125; // r11
  __int64 v126; // r10
  __int64 v127; // r9
  __int64 v128; // r8
  __int64 v129; // rdx
  __int64 v130; // rcx
  __m128i v131; // xmm7
  __m128i v132; // xmm6
  __m128i v133; // xmm5
  __m128i v134; // xmm4
  __m128i v135; // xmm3
  __m128i v136; // xmm2
  __m128i v137; // xmm1
  __m128i v138; // xmm0
  __int64 v139; // rdi
  __int64 v140; // rsi
  __int64 v141; // rdx
  unsigned __int64 v142; // rcx
  __int64 v143; // rdi
  __int64 v144; // rsi
  __int64 v145; // rax
  unsigned __int64 v146; // rbx
  int v147; // edx
  int v148; // ecx
  int v149; // edi
  int v150; // esi
  int v151; // r8d
  int v152; // r9d
  __int64 v154; // [rsp-8h] [rbp-620h] BYREF
  __int64 v155; // [rsp+0h] [rbp-618h]
  __int64 v156; // [rsp+8h] [rbp-610h]
  __m128i v157; // [rsp+10h] [rbp-608h]
  __m128i v158; // [rsp+20h] [rbp-5F8h]
  __m128i v159; // [rsp+30h] [rbp-5E8h]
  __m128i v160; // [rsp+40h] [rbp-5D8h]
  __m128i v161; // [rsp+50h] [rbp-5C8h]
  __m128i v162; // [rsp+60h] [rbp-5B8h]
  __m128i v163; // [rsp+70h] [rbp-5A8h]
  __m128i v164; // [rsp+80h] [rbp-598h]
  __m128i v165; // [rsp+90h] [rbp-588h]
  __m128i v166; // [rsp+A0h] [rbp-578h]
  __m128i v167; // [rsp+B0h] [rbp-568h]
  __m128i v168; // [rsp+C0h] [rbp-558h]
  __m128i v169; // [rsp+D0h] [rbp-548h]
  __m128i v170; // [rsp+E0h] [rbp-538h]
  __m128i v171; // [rsp+F0h] [rbp-528h]
  __m128i v172; // [rsp+100h] [rbp-518h]
  __int64 v173; // [rsp+110h] [rbp-508h]
  __int64 v174; // [rsp+118h] [rbp-500h]
  __int64 v175; // [rsp+120h] [rbp-4F8h]
  __int64 v176; // [rsp+128h] [rbp-4F0h]
  __int64 v177; // [rsp+130h] [rbp-4E8h]
  __int64 v178; // [rsp+138h] [rbp-4E0h]
  __int64 v179; // [rsp+140h] [rbp-4D8h]
  __int64 v180; // [rsp+148h] [rbp-4D0h]
  __int64 v181; // [rsp+150h] [rbp-4C8h]
  __int64 v182; // [rsp+158h] [rbp-4C0h]
  __int64 v183; // [rsp+160h] [rbp-4B8h]
  __int64 v184; // [rsp+168h] [rbp-4B0h]
  __int64 v185; // [rsp+170h] [rbp-4A8h] BYREF
  __int64 v186; // [rsp+178h] [rbp-4A0h] BYREF
  __int64 v187; // [rsp+180h] [rbp-498h]
  __m128i v188; // [rsp+188h] [rbp-490h]
  __m128i v189; // [rsp+198h] [rbp-480h]
  __m128i v190; // [rsp+1A8h] [rbp-470h]
  __m128i v191; // [rsp+1B8h] [rbp-460h]
  __m128i v192; // [rsp+1C8h] [rbp-450h]
  __m128i v193; // [rsp+1D8h] [rbp-440h]
  __m128i v194; // [rsp+1E8h] [rbp-430h]
  __m128i v195; // [rsp+1F8h] [rbp-420h]
  __m128i v196; // [rsp+208h] [rbp-410h]
  __m128i v197; // [rsp+218h] [rbp-400h]
  __m128i v198; // [rsp+228h] [rbp-3F0h]
  __m128i v199; // [rsp+238h] [rbp-3E0h]
  __m128i v200; // [rsp+248h] [rbp-3D0h]
  __m128i v201; // [rsp+258h] [rbp-3C0h]
  __m128i v202; // [rsp+268h] [rbp-3B0h]
  __m128i v203; // [rsp+278h] [rbp-3A0h]
  __int64 v204; // [rsp+288h] [rbp-390h]
  __int64 v205; // [rsp+290h] [rbp-388h]
  __int64 v206; // [rsp+298h] [rbp-380h]
  __int64 v207; // [rsp+2A0h] [rbp-378h]
  __int64 v208; // [rsp+2A8h] [rbp-370h]
  __int64 v209; // [rsp+2B0h] [rbp-368h]
  __int64 v210; // [rsp+2B8h] [rbp-360h]
  __int64 v211; // [rsp+2C0h] [rbp-358h]
  __int64 v212; // [rsp+2C8h] [rbp-350h]
  __int64 v213; // [rsp+2D0h] [rbp-348h]
  __int64 v214; // [rsp+2D8h] [rbp-340h]
  __int64 v215; // [rsp+2E0h] [rbp-338h]
  __int64 v216; // [rsp+2E8h] [rbp-330h] BYREF
  char v217[8]; // [rsp+2F0h] [rbp-328h] BYREF
  __int64 v218; // [rsp+2F8h] [rbp-320h]
  __m128i v219; // [rsp+300h] [rbp-318h]
  __m128i v220; // [rsp+310h] [rbp-308h]
  __m128i v221; // [rsp+320h] [rbp-2F8h]
  __m128i v222; // [rsp+330h] [rbp-2E8h]
  __m128i v223; // [rsp+340h] [rbp-2D8h]
  __m128i v224; // [rsp+350h] [rbp-2C8h]
  __m128i v225; // [rsp+360h] [rbp-2B8h]
  __m128i v226; // [rsp+370h] [rbp-2A8h]
  __m128i v227; // [rsp+380h] [rbp-298h]
  __m128i v228; // [rsp+390h] [rbp-288h]
  __m128i v229; // [rsp+3A0h] [rbp-278h]
  __m128i v230; // [rsp+3B0h] [rbp-268h]
  __m128i v231; // [rsp+3C0h] [rbp-258h]
  __m128i v232; // [rsp+3D0h] [rbp-248h]
  __m128i v233; // [rsp+3E0h] [rbp-238h]
  __m128i v234; // [rsp+3F0h] [rbp-228h]
  __int64 v235; // [rsp+400h] [rbp-218h]
  __int64 v236; // [rsp+408h] [rbp-210h]
  __int64 v237; // [rsp+410h] [rbp-208h]
  __int64 v238; // [rsp+418h] [rbp-200h]
  __int64 v239; // [rsp+420h] [rbp-1F8h]
  __int64 v240; // [rsp+428h] [rbp-1F0h]
  __int64 v241; // [rsp+430h] [rbp-1E8h]
  __int64 v242; // [rsp+438h] [rbp-1E0h]
  __int64 v243; // [rsp+440h] [rbp-1D8h]
  __int64 v244; // [rsp+448h] [rbp-1D0h]
  __int64 v245; // [rsp+450h] [rbp-1C8h]
  __int64 v246; // [rsp+458h] [rbp-1C0h]
  char v247; // [rsp+460h] [rbp-1B8h] BYREF
  _DWORD *v248; // [rsp+468h] [rbp-1B0h] BYREF
  char *v249; // [rsp+470h] [rbp-1A8h]
  __int64 v250; // [rsp+478h] [rbp-1A0h]
  __int64 v251; // [rsp+480h] [rbp-198h]
  __int64 v252; // [rsp+488h] [rbp-190h]
  __int64 v253; // [rsp+490h] [rbp-188h]
  _DWORD *v254; // [rsp+498h] [rbp-180h]
  _DWORD *v255; // [rsp+4A0h] [rbp-178h]
  int v256; // [rsp+4ACh] [rbp-16Ch]
  unsigned int v257; // [rsp+4B0h] [rbp-168h]
  unsigned int v258; // [rsp+4B4h] [rbp-164h]
  __m128i v259; // [rsp+4B8h] [rbp-160h]
  __m128i v260; // [rsp+4C8h] [rbp-150h]
  __m128i v261; // [rsp+4D8h] [rbp-140h]
  __m128i v262; // [rsp+4E8h] [rbp-130h]
  __m128i v263; // [rsp+4F8h] [rbp-120h]
  __m128i v264; // [rsp+508h] [rbp-110h]
  __m128i v265; // [rsp+518h] [rbp-100h]
  __m128i v266; // [rsp+528h] [rbp-F0h]
  __m128i m128_i128; // [rsp+538h] [rbp-E0h]
  __m128i v268; // [rsp+548h] [rbp-D0h]
  __m128i v269; // [rsp+558h] [rbp-C0h]
  __m128i v270; // [rsp+568h] [rbp-B0h]
  __m128i v271; // [rsp+578h] [rbp-A0h]
  __m128i v272; // [rsp+588h] [rbp-90h]
  __m128i v273; // [rsp+598h] [rbp-80h]
  __m128i v274; // [rsp+5A8h] [rbp-70h]
  __int64 v275; // [rsp+5B8h] [rbp-60h]
  __int64 v276; // [rsp+5C0h] [rbp-58h]
  __int64 v277; // [rsp+5C8h] [rbp-50h]
  __int64 v278; // [rsp+5D0h] [rbp-48h]
  _DWORD *v279; // [rsp+5D8h] [rbp-40h]
  __int64 v280; // [rsp+5E0h] [rbp-38h]
  __int64 v281; // [rsp+5E8h] [rbp-30h]
  __int64 v282; // [rsp+5F0h] [rbp-28h]
  _DWORD *v283; // [rsp+5F8h] [rbp-20h]
  __int64 v284; // [rsp+600h] [rbp-18h]
  __int64 v285; // [rsp+608h] [rbp-10h]

  v275 = v20;
  v276 = v19;
  v277 = v18;
  v278 = a6;
  v279 = a5;
  v280 = a1;
  v281 = a2;
  v282 = v16;
  v283 = a3;
  v284 = a4;
  v285 = v15;
  v259 = v31;
  v260 = v30;
  v261 = v29;
  v262 = v28;
  v263 = v27;
  v264 = v26;
  v265 = v25;
  v266 = v24;
  m128_i128 = (__m128i)a14.m128_i128;
  v268 = (__m128i)a13.m128_i128;
  v269 = (__m128i)a12.m128_i128;
  v270 = (__m128i)a11.m128_i128;
  v271 = (__m128i)a10.m128_i128;
  v272 = (__m128i)a9.m128_i128;
  v273 = (__m128i)a8.m128_i128;
  v274 = (__m128i)a7.m128_i128;
  v255 = a3;
  v254 = a5;
  if ( (unsigned __int64)&v247 <= v23[1] )
  {
    MEMORY[0x181EB84E0]();
  }
  else
  {
    sub_182771FC0(a1, a2, a3: 0);
    v35 = (__int64)(v22 + 88325320);
    if ( v254 != v22 && *v254 >> 3 == 4262015 )
    {
      v253 = (__int64)(v22 + 88325320);
      v35 = MEMORY[0x184F68C80](a1: v32, a2: v33, a3: v254);
    }
    else
    {
      v253 = (__int64)(v22 + 88325320);
      if ( v254 != v22 )
        v35 = ((__int64 (__fastcall *)(__int64, __int64, _DWORD *))(v21 + *(_QWORD *)&v22[2 * (*v254 >> 3) + 26]))(
                a1: v32,
                a2: v33,
                a3: v254);
    }
    v252 = v35;
    v36 = (int)v255;
    if ( v255 != v22 )
    {
      v37 = MEMORY[0x184F68C80](a1: v32, a2: v33, a3: &v22[2 * (*v255 >> 3)]);
      if ( (_DWORD *)v37 == v22 )
        goto LABEL_24;
      for ( i = v37; ; i = v253 )
      {
        if ( (_DWORD *)v252 == v22 )
          v41 = v253;
        else
          v41 = v252;
        v253 = v37;
        v258 = *(char *)(v41 + 12) | *(char *)(i + 12);
        v251 = v41;
        v250 = i;
        v42 = MEMORY[0x1850132E0](a1: v38, a2: v39, a3: 19, a4: v252, a5: i);
        v46 = MEMORY[0x1850132E0](a1: v44, a2: v45, a3: v42, a4: v43, a5: v251);
        v49 = v258;
        v50 = v46 << v258;
        if ( ((v46 << v258) & 0x80000000) != 0 )
        {
          v257 = v46;
          v69 = v23[5];
          if ( (unsigned __int64)(v69 + 40) > v23[4] )
          {
            v256 = v46 << v258;
            v69 = MEMORY[0x181EAA920](a1: v47, a2: v48, a3: 34082880);
          }
          else
          {
            v23[5] = v69 + 40;
            *(_DWORD *)v69 = 34082880;
            *(_DWORD *)(v69 + 4) = 0;
            *(_QWORD *)(v69 + 8) = 0;
            *(_QWORD *)(v69 + 16) = 0;
            *(_QWORD *)(v69 + 24) = 0;
            *(_QWORD *)(v69 + 32) = 0;
            v256 = v50;
          }
          *(_DWORD *)(v69 + 20) = 46923644;
          *(_DWORD *)(v69 + 16) = v22[93585974];
          *(_DWORD *)(v69 + 12) = (unsigned __int64)(v69 - (_QWORD)v22) >> 3;
          v249 = (char *)v69;
          MEMORY[0x18503B9A0](a1: v47, a2: v48, a3: v69, a4: v49, a5: 0);
          v70 = (unsigned __int64)v249;
          *((_DWORD *)v249 + 2) = 46004603;
          if ( (*(_DWORD *)v70 & 2) != 0 )
          {
            v66 = (v70 & 0xFFFFFFFFFFF80000LL) + 2112;
            if ( *(_BYTE *)((v70 & 0xFFFFFFFFFFF80000LL) + ((v70 - v66) >> 9) + 0x38) != 0 )
              *(_BYTE *)((v70 & 0xFFFFFFFFFFF80000LL) + ((v70 - v66) >> 9) + 0x38) = 0;
            v68 = (_DWORD *)v70;
          }
          else
          {
            v68 = (_DWORD *)v70;
          }
        }
        else
        {
          v51 = v23[5];
          v52 = (v50 + 19LL) & 0x1FFFFFFF8LL;
          if ( v52 >= 0x20000 || (v53 = v51 + v52) > v23[4] )
          {
            v257 = v46;
            v51 = MEMORY[0x181EAA840](a1: 34082368, a2: v48, a3: 34082368, a4: v258, a5: v50);
            v46 = v257;
          }
          else
          {
            v23[5] = v53;
            *(_QWORD *)v51 = 34082368;
            *(_DWORD *)(v51 + 8) = v50;
          }
          v249 = (char *)v51;
          v54 = v22 + 93320312;
          v248 = v22 + 93320312;
          v257 = v46;
          if ( v258 != 0 )
            MEMORY[0x184FF2C40](a1: 1, a2: v48, a3: v22 + 93320312, a4: v54, a5: v51, a6: v46);
          else
            MEMORY[0x181EB4960](a1: v46, a2: 0, a3: v22 + 94087886, a4: v54, a5: 0, a6: v249);
          v56 = MEMORY[0x185011A80](a1: v251, a2: v22 + 14546192, a3: v257, a4: v55, a5: v258, a6: v249);
          v58 = MEMORY[0x185011A80](a1: v250, a2: v248, a3: v56, a4: v57, a5: v258, a6: v249);
          v61 = v23[5];
          if ( (unsigned __int64)(v61 + 40) > v23[4] )
          {
            v256 = v58;
            v61 = MEMORY[0x181EAA920](a1: v59, a2: v60, a3: 34590936);
          }
          else
          {
            v23[5] = v61 + 40;
            *(_DWORD *)v61 = 34590936;
            *(_DWORD *)(v61 + 4) = 0;
            *(_QWORD *)(v61 + 8) = 0;
            *(_QWORD *)(v61 + 16) = 0;
            *(_QWORD *)(v61 + 24) = 0;
            *(_QWORD *)(v61 + 32) = 0;
          }
          v253 = v61;
          *(_DWORD *)(v61 + 20) = 46923644;
          *(_DWORD *)(v61 + 16) = v22[93585974];
          *(_DWORD *)(v61 + 12) = (unsigned __int64)(v61 - (_QWORD)v22) >> 3;
          v256 = (char)v258;
          v62 = MEMORY[0x18503B9A0](a1: v59, a2: v60, a3: v61, a4: v61, a5: 0);
          v65 = v23[5];
          if ( (unsigned __int64)(v65 + 24) > v23[4] )
          {
            v251 = v62;
            v65 = MEMORY[0x181EAA920](a1: v63, a2: v64, a3: 34082680);
          }
          else
          {
            v23[5] = v65 + 24;
            *(_DWORD *)v65 = 34082680;
            *(_DWORD *)(v65 + 4) = 0;
            *(_QWORD *)(v65 + 8) = 0;
            *(_QWORD *)(v65 + 16) = 0;
          }
          v66 = v253;
          v67 = v249;
          *(_BYTE *)(v65 + 12) = v258;
          *(_DWORD *)(v65 + 4) = (unsigned __int64)(v67 - (char *)v22) >> 3;
          *(_DWORD *)(v66 + 8) = (unsigned __int64)(v65 - (_QWORD)v22) >> 3;
          if ( (*(_DWORD *)v66 & 2) != 0 )
          {
            v71 = (v66 & 0xFFFFFFFFFFF80000LL) + 2112;
            if ( *(_BYTE *)((v66 & 0xFFFFFFFFFFF80000LL) + ((v66 - v71) >> 9) + 0x38) != 0 )
              *(_BYTE *)((v66 & 0xFFFFFFFFFFF80000LL) + ((v66 - v71) >> 9) + 0x38) = 0;
            v68 = (_DWORD *)v66;
          }
          else
          {
            v68 = (_DWORD *)v66;
          }
        }
        v37 = sub_1827697E0(a1: v63, a2: v64, a3: v68, a4: v66, a5: (__int64)&a15);
LABEL_24:
        ;
      }
    }
  }
  v72 = sub_182771080(a1: v32, a2: v33, a3: v36, a4: v252, a5: (_DWORD)v254, a6: v34, a7: v247);
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
  v246 = v17;
  v235 = v20;
  v236 = v75;
  v237 = v76;
  v238 = v77;
  v239 = v78;
  v240 = v73;
  v241 = v74;
  v242 = v16;
  v243 = v79;
  v244 = v80;
  v245 = v72;
  v219 = v31;
  v220 = v30;
  v221 = v29;
  v222 = v28;
  v223 = v27;
  v224 = v26;
  v225 = v25;
  v226 = v24;
  v227 = v81;
  v228 = v82;
  v229 = v83;
  v230 = v84;
  v231 = v85;
  v232 = v86;
  v233 = v87;
  v234 = v88;
  if ( (unsigned __int64)&v216 > v23[1] )
  {
    sub_182771FC0(a1: v73, a2: v74, a3: 0);
    v92 = v23[5];
    if ( (unsigned __int64)(v92 + 40) > v23[4] )
    {
      v92 = MEMORY[0x181EAA920](a1: v90, a2: v91, a3: 34171952);
    }
    else
    {
      v23[5] = v92 + 40;
      *(_DWORD *)v92 = 34171952;
      *(_DWORD *)(v92 + 4) = 0;
      *(_QWORD *)(v92 + 8) = 0;
      *(_QWORD *)(v92 + 16) = 0;
      *(_QWORD *)(v92 + 24) = 0;
      *(_QWORD *)(v92 + 32) = 0;
    }
    *(_DWORD *)(v92 + 20) = 46923644;
    *(_DWORD *)(v92 + 16) = v22[93585974];
    *(_DWORD *)(v92 + 12) = (unsigned __int64)(v92 - (_QWORD)v22) >> 3;
    v218 = v92;
    MEMORY[0x18503B9A0](a1: v90, a2: v91, a3: v92, a4: v89, a5: 0);
    v96 = v218;
    *(_DWORD *)(v218 + 8) = 46571621;
    if ( (*(_DWORD *)v96 & 2) != 0 )
      goto LABEL_50;
    while ( 1 )
    {
      v96 = sub_1827697E0(a1: v94, a2: v95, a3: (_DWORD *)v96, a4: v93, a5: (__int64)&v248);
LABEL_50:
      v93 = (v96 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v96 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v96 - v93) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v96 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v96 - v93) >> 9) + 0x38) = 0;
    }
  }
  v97 = MEMORY[0x181EB84E0]();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  v215 = v17;
  v204 = v20;
  v205 = v100;
  v206 = v101;
  v207 = v102;
  v208 = v103;
  v209 = v98;
  v210 = v99;
  v211 = v16;
  v212 = v104;
  v213 = v105;
  v214 = v97;
  v188 = v31;
  v189 = v30;
  v190 = v29;
  v191 = v28;
  v192 = v27;
  v193 = v26;
  v194 = v25;
  v195 = v24;
  v196 = v106;
  v197 = v107;
  v198 = v108;
  v199 = v109;
  v200 = v110;
  v201 = v111;
  v202 = v112;
  v203 = v113;
  v187 = v104;
  if ( (unsigned __int64)&v185 > v23[1] )
  {
    sub_182771FC0(a1: v98, a2: v99, a3: 0);
    v116 = v23[5];
    if ( (unsigned __int64)(v116 + 40) > v23[4] )
    {
      v116 = MEMORY[0x181EAA920](a1: v114, a2: v115, a3: 34081944);
    }
    else
    {
      v23[5] = v116 + 40;
      *(_DWORD *)v116 = 34081944;
      *(_DWORD *)(v116 + 4) = 0;
      *(_QWORD *)(v116 + 8) = 0;
      *(_QWORD *)(v116 + 16) = 0;
      *(_QWORD *)(v116 + 24) = 0;
      *(_QWORD *)(v116 + 32) = 0;
    }
    *(_DWORD *)(v116 + 20) = 46923644;
    *(_DWORD *)(v116 + 16) = v22[93585974];
    *(_DWORD *)(v116 + 12) = (unsigned __int64)(v116 - (_QWORD)v22) >> 3;
    v186 = v116;
    MEMORY[0x18503B9A0](a1: v114, a2: v115, a3: v116, a4: v116, a5: 0);
    v120 = v186;
    *(_DWORD *)(v186 + 8) = (unsigned __int64)(v187 - (_QWORD)v22) >> 3;
    if ( (*(_DWORD *)v120 & 2) != 0 )
      goto LABEL_58;
    while ( 1 )
    {
      v120 = sub_1827697E0(a1: v118, a2: v119, a3: (_DWORD *)v120, a4: v117, a5: (__int64)v217);
LABEL_58:
      v117 = v120 & 0xFFFFFFFFFFF80000LL;
      v121 = (v120 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v120 & 0xFFFFFFFFFFF80000LL) + ((v120 - v121) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v120 & 0xFFFFFFFFFFF80000LL) + ((v120 - v121) >> 9) + 0x38) = 0;
    }
  }
  v122 = MEMORY[0x181EB84E0]();
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
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  v184 = v17;
  v173 = v20;
  v174 = v125;
  v175 = v126;
  v176 = v127;
  v177 = v128;
  v178 = v123;
  v179 = v124;
  v180 = v16;
  v181 = v129;
  v182 = v130;
  v183 = v122;
  v157 = v31;
  v158 = v30;
  v159 = v29;
  v160 = v28;
  v161 = v27;
  v162 = v26;
  v163 = v25;
  v164 = v24;
  v165 = v131;
  v166 = v132;
  v167 = v133;
  v168 = v134;
  v169 = v135;
  v170 = v136;
  v171 = v137;
  v172 = v138;
  v156 = v129;
  if ( (unsigned __int64)&v154 > v23[1] )
  {
    sub_182771FC0(a1: v123, a2: v124, a3: 0);
    v141 = v23[5];
    if ( (unsigned __int64)(v141 + 40) > v23[4] )
    {
      v141 = MEMORY[0x181EAA920](a1: v139, a2: v140, a3: 37751496);
    }
    else
    {
      v23[5] = v141 + 40;
      *(_DWORD *)v141 = 37751496;
      *(_DWORD *)(v141 + 4) = 0;
      *(_QWORD *)(v141 + 8) = 0;
      *(_QWORD *)(v141 + 16) = 0;
      *(_QWORD *)(v141 + 24) = 0;
      *(_QWORD *)(v141 + 32) = 0;
    }
    *(_DWORD *)(v141 + 20) = 46923644;
    *(_DWORD *)(v141 + 16) = v22[93585974];
    *(_DWORD *)(v141 + 12) = (unsigned __int64)(v141 - (_QWORD)v22) >> 3;
    v155 = v141;
    MEMORY[0x18503B9A0](a1: v139, a2: v140, a3: v141, a4: v141, a5: 0);
    v145 = v155;
    *(_DWORD *)(v155 + 8) = (unsigned __int64)(v156 - (_QWORD)v22) >> 3;
    if ( (*(_DWORD *)v145 & 2) != 0 )
      goto LABEL_66;
    while ( 1 )
    {
      v145 = sub_1827697E0(a1: v143, a2: v144, a3: (_DWORD *)v145, a4: v142, a5: (__int64)&v186);
LABEL_66:
      v142 = v145 & 0xFFFFFFFFFFF80000LL;
      v146 = (v145 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v145 & 0xFFFFFFFFFFF80000LL) + ((v145 - v146) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v145 & 0xFFFFFFFFFFF80000LL) + ((v145 - v146) >> 9) + 0x38) = 0;
    }
  }
  MEMORY[0x181EB84E0]();
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
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  return sub_182770780(a1: v149, a2: v150, a3: v147, a4: v148, a5: v151, a6: v152, a7: a15);
}
