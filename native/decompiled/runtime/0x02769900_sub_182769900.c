// sub_182769900
// rva 0x02769900  size 262  section .text  group runtime
// window base 0x182769900: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__m128i __fastcall sub_182769900(
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
        __m128 a14)
{
  __int64 v14; // rax
  __int64 v15; // rbx
  __int64 v16; // rbp
  __int64 v17; // r10
  __int64 v18; // r11
  __int64 v19; // r12
  __int64 v20; // r13
  _DWORD *v21; // r14
  __int64 v22; // r15
  __m128i v23; // xmm8
  __m128i v24; // xmm9
  __m128i v25; // xmm10
  __m128i v26; // xmm11
  __m128i v27; // xmm12
  __m128i v28; // xmm13
  __m128i v29; // xmm14
  __m128i v30; // xmm15
  __int64 v31; // rax
  __int64 v32; // rdi
  __int64 v33; // rsi
  __int64 v34; // r11
  __int64 v35; // r10
  __int64 v36; // r9
  __int64 v37; // r8
  _DWORD *v38; // rdx
  __int64 v39; // rcx
  __m128i v40; // xmm7
  __m128i v41; // xmm6
  __m128i v42; // xmm5
  __m128i v43; // xmm4
  __m128i v44; // xmm3
  __m128i v45; // xmm2
  __m128i v46; // xmm1
  __m128i v47; // xmm0
  int v48; // ecx
  __int64 v49; // rdi
  __int64 v50; // rsi
  int v51; // r8d
  int v52; // r9d
  int v53; // edx
  __int64 v54; // rdi
  __int64 v55; // rsi
  __int64 v56; // rdx
  __int64 v57; // rdi
  __int64 v58; // rsi
  unsigned __int64 v59; // rcx
  unsigned __int64 v60; // rdx
  unsigned __int64 v62; // rbp
  __int64 v63; // rax
  __int64 v64; // rdi
  __int64 v65; // rsi
  __int64 v66; // r11
  __int64 v67; // r10
  __int64 v68; // r9
  __int64 v69; // r8
  __int64 v70; // rdx
  __int64 v71; // rcx
  __m128i v72; // xmm7
  __m128i v73; // xmm6
  __m128i v74; // xmm5
  __m128i v75; // xmm4
  __m128i v76; // xmm3
  __m128i v77; // xmm2
  __m128i v78; // xmm1
  __m128i v79; // xmm0
  __int64 v80; // rcx
  __int64 v81; // rdi
  __int64 v82; // rsi
  __int64 v83; // rdx
  __int64 v84; // rdx
  __int64 v85; // rdi
  __int64 v86; // rsi
  __int64 v87; // rax
  __int64 v88; // rdx
  __int64 v89; // rdi
  __int64 v90; // rsi
  __int64 v91; // r11
  __int64 v92; // r10
  __int64 v93; // r9
  __int64 v94; // r8
  __int64 v95; // rcx
  __m128i v96; // xmm7
  __m128i v97; // xmm6
  __m128i v98; // xmm5
  __m128i v99; // xmm4
  __m128i v100; // xmm3
  __m128i v101; // xmm2
  __m128i v102; // xmm1
  __m128i v103; // xmm0
  __int64 v104; // rcx
  __int64 v105; // rdi
  __int64 v106; // rsi
  __int64 v107; // rdx
  __int64 v108; // rdx
  __int64 v109; // rdi
  __int64 v110; // rsi
  __int64 v111; // rax
  __int64 v112; // rdi
  __int64 v113; // rsi
  __int64 v114; // r11
  __int64 v115; // r10
  __int64 v116; // r9
  _DWORD *v117; // r8
  _DWORD *v118; // rdx
  __int64 v119; // rcx
  __m128i v120; // xmm7
  __m128i v121; // xmm6
  __m128i v122; // xmm5
  __m128i v123; // xmm4
  __m128i v124; // xmm3
  __m128i v125; // xmm2
  __m128i v126; // xmm1
  __m128i v127; // xmm0
  int v128; // ecx
  __int64 v129; // rdi
  __int64 v130; // rsi
  int v131; // r9d
  __int64 v132; // rax
  int v133; // r8d
  int v134; // edx
  __int64 v135; // rax
  __int64 v136; // rdi
  __int64 v137; // rsi
  __int64 v138; // rdx
  _DWORD *v139; // r8
  unsigned int v140; // eax
  __int64 v141; // rcx
  __int64 v142; // rdi
  __int64 v143; // rsi
  unsigned int v144; // eax
  __int64 v145; // rdi
  __int64 v146; // rsi
  __int64 v147; // rcx
  __int64 v148; // rdx
  unsigned __int64 v149; // r9
  unsigned __int64 v150; // r9
  _DWORD *v151; // rcx
  __int64 v152; // rcx
  unsigned int v153; // eax
  __int64 v154; // rcx
  int v155; // eax
  __int64 v156; // rdi
  __int64 v157; // rsi
  __int64 v158; // rdx
  __int64 v159; // rax
  __int64 v160; // rdi
  __int64 v161; // rsi
  __int64 v162; // rdx
  unsigned __int64 v163; // rcx
  __int64 v164; // rax
  unsigned __int64 v165; // rbp
  __int64 v166; // rdx
  __int64 v167; // rcx
  __int64 v168; // rdi
  __int64 v169; // rsi
  __int64 v170; // rax
  char v171; // [rsp-8h] [rbp-7A8h] BYREF
  _DWORD *v172; // [rsp+0h] [rbp-7A0h]
  __int64 v173; // [rsp+8h] [rbp-798h]
  __int64 v174; // [rsp+10h] [rbp-790h]
  __int64 v175; // [rsp+18h] [rbp-788h]
  __int64 v176; // [rsp+20h] [rbp-780h]
  _DWORD *v177; // [rsp+28h] [rbp-778h]
  _DWORD *v178; // [rsp+30h] [rbp-770h]
  _DWORD *v179; // [rsp+38h] [rbp-768h]
  int v180; // [rsp+44h] [rbp-75Ch]
  unsigned int v181; // [rsp+48h] [rbp-758h]
  unsigned int v182; // [rsp+4Ch] [rbp-754h]
  __m128i v183; // [rsp+50h] [rbp-750h]
  __m128i v184; // [rsp+60h] [rbp-740h]
  __m128i v185; // [rsp+70h] [rbp-730h]
  __m128i v186; // [rsp+80h] [rbp-720h]
  __m128i v187; // [rsp+90h] [rbp-710h]
  __m128i v188; // [rsp+A0h] [rbp-700h]
  __m128i v189; // [rsp+B0h] [rbp-6F0h]
  __m128i v190; // [rsp+C0h] [rbp-6E0h]
  __m128i v191; // [rsp+D0h] [rbp-6D0h]
  __m128i v192; // [rsp+E0h] [rbp-6C0h]
  __m128i v193; // [rsp+F0h] [rbp-6B0h]
  __m128i v194; // [rsp+100h] [rbp-6A0h]
  __m128i v195; // [rsp+110h] [rbp-690h]
  __m128i v196; // [rsp+120h] [rbp-680h]
  __m128i v197; // [rsp+130h] [rbp-670h]
  __m128i v198; // [rsp+140h] [rbp-660h]
  __int64 v199; // [rsp+150h] [rbp-650h]
  __int64 v200; // [rsp+158h] [rbp-648h]
  __int64 v201; // [rsp+160h] [rbp-640h]
  __int64 v202; // [rsp+168h] [rbp-638h]
  _DWORD *v203; // [rsp+170h] [rbp-630h]
  __int64 v204; // [rsp+178h] [rbp-628h]
  __int64 v205; // [rsp+180h] [rbp-620h]
  __int64 v206; // [rsp+188h] [rbp-618h]
  _DWORD *v207; // [rsp+190h] [rbp-610h]
  __int64 v208; // [rsp+198h] [rbp-608h]
  __int64 v209; // [rsp+1A0h] [rbp-600h]
  __int64 v210; // [rsp+1A8h] [rbp-5F8h]
  __int64 v211; // [rsp+1B0h] [rbp-5F0h] BYREF
  __int64 v212; // [rsp+1B8h] [rbp-5E8h] BYREF
  __int64 v213; // [rsp+1C0h] [rbp-5E0h]
  __m128i v214; // [rsp+1C8h] [rbp-5D8h]
  __m128i v215; // [rsp+1D8h] [rbp-5C8h]
  __m128i v216; // [rsp+1E8h] [rbp-5B8h]
  __m128i v217; // [rsp+1F8h] [rbp-5A8h]
  __m128i v218; // [rsp+208h] [rbp-598h]
  __m128i v219; // [rsp+218h] [rbp-588h]
  __m128i v220; // [rsp+228h] [rbp-578h]
  __m128i v221; // [rsp+238h] [rbp-568h]
  __m128i v222; // [rsp+248h] [rbp-558h]
  __m128i v223; // [rsp+258h] [rbp-548h]
  __m128i v224; // [rsp+268h] [rbp-538h]
  __m128i v225; // [rsp+278h] [rbp-528h]
  __m128i v226; // [rsp+288h] [rbp-518h]
  __m128i v227; // [rsp+298h] [rbp-508h]
  __m128i v228; // [rsp+2A8h] [rbp-4F8h]
  __m128i v229; // [rsp+2B8h] [rbp-4E8h]
  __int64 v230; // [rsp+2C8h] [rbp-4D8h]
  __int64 v231; // [rsp+2D0h] [rbp-4D0h]
  __int64 v232; // [rsp+2D8h] [rbp-4C8h]
  __int64 v233; // [rsp+2E0h] [rbp-4C0h]
  __int64 v234; // [rsp+2E8h] [rbp-4B8h]
  __int64 v235; // [rsp+2F0h] [rbp-4B0h]
  __int64 v236; // [rsp+2F8h] [rbp-4A8h]
  __int64 v237; // [rsp+300h] [rbp-4A0h]
  __int64 v238; // [rsp+308h] [rbp-498h]
  __int64 v239; // [rsp+310h] [rbp-490h]
  __int64 v240; // [rsp+318h] [rbp-488h]
  __int64 v241; // [rsp+320h] [rbp-480h]
  _QWORD v242[3]; // [rsp+328h] [rbp-478h] BYREF
  __m128i v243; // [rsp+340h] [rbp-460h]
  __m128i v244; // [rsp+350h] [rbp-450h]
  __m128i v245; // [rsp+360h] [rbp-440h]
  __m128i v246; // [rsp+370h] [rbp-430h]
  __m128i v247; // [rsp+380h] [rbp-420h]
  __m128i v248; // [rsp+390h] [rbp-410h]
  __m128i v249; // [rsp+3A0h] [rbp-400h]
  __m128i v250; // [rsp+3B0h] [rbp-3F0h]
  __m128i v251; // [rsp+3C0h] [rbp-3E0h]
  __m128i v252; // [rsp+3D0h] [rbp-3D0h]
  __m128i v253; // [rsp+3E0h] [rbp-3C0h]
  __m128i v254; // [rsp+3F0h] [rbp-3B0h]
  __m128i v255; // [rsp+400h] [rbp-3A0h]
  __m128i v256; // [rsp+410h] [rbp-390h]
  __m128i v257; // [rsp+420h] [rbp-380h]
  __m128i v258; // [rsp+430h] [rbp-370h]
  __int64 v259; // [rsp+440h] [rbp-360h]
  __int64 v260; // [rsp+448h] [rbp-358h]
  __int64 v261; // [rsp+450h] [rbp-350h]
  __int64 v262; // [rsp+458h] [rbp-348h]
  __int64 v263; // [rsp+460h] [rbp-340h]
  __int64 v264; // [rsp+468h] [rbp-338h]
  __int64 v265; // [rsp+470h] [rbp-330h]
  __int64 v266; // [rsp+478h] [rbp-328h]
  __int64 v267; // [rsp+480h] [rbp-320h]
  __int64 v268; // [rsp+488h] [rbp-318h]
  __int64 v269; // [rsp+490h] [rbp-310h]
  __int64 v270; // [rsp+498h] [rbp-308h]
  char v271; // [rsp+4A0h] [rbp-300h] BYREF
  unsigned int *v272; // [rsp+4B0h] [rbp-2F0h]
  __int64 v273; // [rsp+4B8h] [rbp-2E8h]
  _DWORD *v274; // [rsp+4C0h] [rbp-2E0h]
  __m128i v275; // [rsp+4C8h] [rbp-2D8h]
  __m128i v276; // [rsp+4D8h] [rbp-2C8h]
  __m128i v277; // [rsp+4E8h] [rbp-2B8h]
  __m128i v278; // [rsp+4F8h] [rbp-2A8h]
  __m128i v279; // [rsp+508h] [rbp-298h]
  __m128i v280; // [rsp+518h] [rbp-288h]
  __m128i v281; // [rsp+528h] [rbp-278h]
  __m128i v282; // [rsp+538h] [rbp-268h]
  __m128i v283; // [rsp+548h] [rbp-258h]
  __m128i v284; // [rsp+558h] [rbp-248h]
  __m128i v285; // [rsp+568h] [rbp-238h]
  __m128i v286; // [rsp+578h] [rbp-228h]
  __m128i v287; // [rsp+588h] [rbp-218h]
  __m128i v288; // [rsp+598h] [rbp-208h]
  __m128i v289; // [rsp+5A8h] [rbp-1F8h]
  __m128i v290; // [rsp+5B8h] [rbp-1E8h]
  __int64 v291; // [rsp+5C8h] [rbp-1D8h]
  __int64 v292; // [rsp+5D0h] [rbp-1D0h]
  __int64 v293; // [rsp+5D8h] [rbp-1C8h]
  __int64 v294; // [rsp+5E0h] [rbp-1C0h]
  __int64 v295; // [rsp+5E8h] [rbp-1B8h]
  __int64 v296; // [rsp+5F0h] [rbp-1B0h]
  __int64 v297; // [rsp+5F8h] [rbp-1A8h]
  __int64 v298; // [rsp+600h] [rbp-1A0h]
  _DWORD *v299; // [rsp+608h] [rbp-198h]
  __int64 v300; // [rsp+610h] [rbp-190h]
  __int64 v301; // [rsp+618h] [rbp-188h]
  __int64 v302; // [rsp+620h] [rbp-180h]
  _DWORD *v303; // [rsp+630h] [rbp-170h]
  __int64 v304; // [rsp+638h] [rbp-168h]
  __m128i v305; // [rsp+640h] [rbp-160h]
  __m128i v306; // [rsp+650h] [rbp-150h]
  __m128i v307; // [rsp+660h] [rbp-140h]
  __m128i v308; // [rsp+670h] [rbp-130h]
  __m128i v309; // [rsp+680h] [rbp-120h]
  __m128i v310; // [rsp+690h] [rbp-110h]
  __m128i v311; // [rsp+6A0h] [rbp-100h]
  __m128i v312; // [rsp+6B0h] [rbp-F0h]
  __m128i m128_i128; // [rsp+6C0h] [rbp-E0h]
  __m128i v314; // [rsp+6D0h] [rbp-D0h]
  __m128i v315; // [rsp+6E0h] [rbp-C0h]
  __m128i v316; // [rsp+6F0h] [rbp-B0h]
  __m128i v317; // [rsp+700h] [rbp-A0h]
  __m128i v318; // [rsp+710h] [rbp-90h]
  __m128i v319; // [rsp+720h] [rbp-80h]
  __m128i v320; // [rsp+730h] [rbp-70h]
  __int64 v321; // [rsp+740h] [rbp-60h]
  __int64 v322; // [rsp+748h] [rbp-58h]
  __int64 v323; // [rsp+750h] [rbp-50h]
  __int64 v324; // [rsp+758h] [rbp-48h]
  __int64 v325; // [rsp+760h] [rbp-40h]
  __int64 v326; // [rsp+768h] [rbp-38h]
  __int64 v327; // [rsp+770h] [rbp-30h]
  __int64 v328; // [rsp+778h] [rbp-28h]
  _DWORD *v329; // [rsp+780h] [rbp-20h]
  __int64 v330; // [rsp+788h] [rbp-18h]
  __int64 v331; // [rsp+790h] [rbp-10h]

  v321 = v19;
  v322 = v18;
  v323 = v17;
  v324 = a6;
  v325 = a5;
  v326 = a1;
  v327 = a2;
  v328 = v15;
  v329 = a3;
  v330 = a4;
  v331 = v14;
  v305 = v30;
  v306 = v29;
  v307 = v28;
  v308 = v27;
  v309 = v26;
  v310 = v25;
  v311 = v24;
  v312 = v23;
  m128_i128 = (__m128i)a14.m128_i128;
  v314 = (__m128i)a13.m128_i128;
  v315 = (__m128i)a12.m128_i128;
  v316 = (__m128i)a11.m128_i128;
  v317 = (__m128i)a10.m128_i128;
  v318 = (__m128i)a9.m128_i128;
  v319 = (__m128i)a8.m128_i128;
  v320 = (__m128i)a7.m128_i128;
  v303 = a3;
  v304 = a5;
  v31 = sub_182769760(a1: 0, a2, a3, a4: a5, a5, a6: 0);
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
  v302 = v16;
  v291 = v19;
  v292 = v34;
  v293 = v35;
  v294 = v36;
  v295 = v37;
  v296 = v32;
  v297 = v33;
  v298 = v15;
  v299 = v38;
  v300 = v39;
  v301 = v31;
  v275 = v30;
  v276 = v29;
  v277 = v28;
  v278 = v27;
  v279 = v26;
  v280 = v25;
  v281 = v24;
  v282 = v23;
  v283 = v40;
  v284 = v41;
  v285 = v42;
  v286 = v43;
  v287 = v44;
  v288 = v45;
  v289 = v46;
  v290 = v47;
  v274 = v38;
  if ( (unsigned __int64)&v271 <= *(_QWORD *)(v22 + 8) )
  {
    MEMORY[0x181EB84E0]();
  }
  else
  {
    sub_182771FC0(a1: v32, a2: v33, a3: 0);
    v53 = (int)v274;
    if ( v274 != v21 )
    {
      v273 = MEMORY[0x184F68C80](a1: v49, a2: v50, a3: &v21[2 * (*v274 >> 3)]);
      v56 = *(_QWORD *)(v22 + 40);
      if ( (unsigned __int64)(v56 + 40) > *(_QWORD *)(v22 + 32) )
      {
        v56 = MEMORY[0x181EAA920](a1: v54, a2: v55, a3: 35966824);
      }
      else
      {
        *(_QWORD *)(v22 + 40) = v56 + 40;
        *(_DWORD *)v56 = 35966824;
        *(_DWORD *)(v56 + 4) = 0;
        *(_QWORD *)(v56 + 8) = 0;
        *(_QWORD *)(v56 + 16) = 0;
        *(_QWORD *)(v56 + 24) = 0;
        *(_QWORD *)(v56 + 32) = 0;
      }
      *(_DWORD *)(v56 + 20) = 46923644;
      *(_DWORD *)(v56 + 16) = v21[93585974];
      *(_DWORD *)(v56 + 12) = (unsigned __int64)(v56 - (_QWORD)v21) >> 3;
      v272 = (unsigned int *)v56;
      MEMORY[0x18503B9A0](a1: v54, a2: v55, a3: v56, a4: v56, a5: 0);
      v59 = (unsigned __int64)v272;
      v272[2] = (unsigned __int64)(v273 - (_QWORD)v21) >> 3;
      v60 = *(unsigned int *)v59;
      if ( (v60 & 2) != 0 )
      {
        v62 = (v59 & 0xFFFFFFFFFFF80000LL) + 2112;
        v60 = (v59 - v62) >> 9;
        if ( *(_BYTE *)((v59 & 0xFFFFFFFFFFF80000LL) + v60 + 0x38) != 0 )
          *(_BYTE *)((v59 & 0xFFFFFFFFFFF80000LL) + ((v59 - v62) >> 9) + 0x38) = 0;
      }
      if ( *(int *)(v22 + 16) <= 0 )
        sub_18277F280(a1: v57, a2: v58, a3: v60);
      return v290;
    }
  }
  v63 = sub_182771080(a1: v49, a2: v50, a3: v53, a4: v48, a5: v51, a6: v52, a7: v271);
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
  v270 = v16;
  v259 = v19;
  v260 = v66;
  v261 = v67;
  v262 = v68;
  v263 = v69;
  v264 = v64;
  v265 = v65;
  v266 = v15;
  v267 = v70;
  v268 = v71;
  v269 = v63;
  v243 = v30;
  v244 = v29;
  v245 = v28;
  v246 = v27;
  v247 = v26;
  v248 = v25;
  v249 = v24;
  v250 = v23;
  v251 = v72;
  v252 = v73;
  v253 = v74;
  v254 = v75;
  v255 = v76;
  v256 = v77;
  v257 = v78;
  v258 = v79;
  if ( (unsigned __int64)v242 > *(_QWORD *)(v22 + 8) )
  {
    sub_182771FC0(a1: v64, a2: v65, a3: 0);
    v83 = *(_QWORD *)(v22 + 40);
    if ( (unsigned __int64)(v83 + 40) > *(_QWORD *)(v22 + 32) )
    {
      v83 = MEMORY[0x181EAA920](a1: v81, a2: v82, a3: 34591136);
    }
    else
    {
      *(_QWORD *)(v22 + 40) = v83 + 40;
      *(_DWORD *)v83 = 34591136;
      *(_DWORD *)(v83 + 4) = 0;
      *(_QWORD *)(v83 + 8) = 0;
      *(_QWORD *)(v83 + 16) = 0;
      *(_QWORD *)(v83 + 24) = 0;
      *(_QWORD *)(v83 + 32) = 0;
    }
    *(_DWORD *)(v83 + 20) = 46923644;
    *(_DWORD *)(v83 + 16) = v21[93585974];
    *(_DWORD *)(v83 + 12) = (unsigned __int64)(v83 - (_QWORD)v21) >> 3;
    v242[2] = v83;
    MEMORY[0x18503B9A0](a1: v81, a2: v82, a3: v83, a4: v80, a5: 0);
    if ( *(int *)(v22 + 16) <= 0 )
      sub_18277F280(a1: v85, a2: v86, a3: v84);
    return v258;
  }
  v87 = MEMORY[0x181EB84E0]();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  v241 = v16;
  v230 = v19;
  v231 = v91;
  v232 = v92;
  v233 = v93;
  v234 = v94;
  v235 = v89;
  v236 = v90;
  v237 = v15;
  v238 = v88;
  v239 = v95;
  v240 = v87;
  v214 = v30;
  v215 = v29;
  v216 = v28;
  v217 = v27;
  v218 = v26;
  v219 = v25;
  v220 = v24;
  v221 = v23;
  v222 = v96;
  v223 = v97;
  v224 = v98;
  v225 = v99;
  v226 = v100;
  v227 = v101;
  v228 = v102;
  v229 = v103;
  if ( (unsigned __int64)&v211 > *(_QWORD *)(v22 + 8) )
  {
    v213 = v88;
    sub_182771FC0(a1: v89, a2: v90, a3: 0);
    v107 = *(_QWORD *)(v22 + 40);
    if ( (unsigned __int64)(v107 + 40) > *(_QWORD *)(v22 + 32) )
    {
      v107 = MEMORY[0x181EAA920](a1: v105, a2: v106, a3: 34591136);
    }
    else
    {
      *(_QWORD *)(v22 + 40) = v107 + 40;
      *(_DWORD *)v107 = 34591136;
      *(_DWORD *)(v107 + 4) = 0;
      *(_QWORD *)(v107 + 8) = 0;
      *(_QWORD *)(v107 + 16) = 0;
      *(_QWORD *)(v107 + 24) = 0;
      *(_QWORD *)(v107 + 32) = 0;
    }
    v212 = v107;
    MEMORY[0x184F403E0](a1: v105, a2: v106, a3: v107, a4: v104, a5: v213);
    if ( *(int *)(v22 + 16) <= 0 )
      sub_18277F280(a1: v109, a2: v110, a3: v108);
    return v229;
  }
  v111 = MEMORY[0x181EB84E0]();
  __builtin_debugtrap();
  v210 = v16;
  v199 = v19;
  v200 = v114;
  v201 = v115;
  v202 = v116;
  v203 = v117;
  v204 = v112;
  v205 = v113;
  v206 = v15;
  v207 = v118;
  v208 = v119;
  v209 = v111;
  v183 = v30;
  v184 = v29;
  v185 = v28;
  v186 = v27;
  v187 = v26;
  v188 = v25;
  v189 = v24;
  v190 = v23;
  v191 = v120;
  v192 = v121;
  v193 = v122;
  v194 = v123;
  v195 = v124;
  v196 = v125;
  v197 = v126;
  v198 = v127;
  v179 = v118;
  v178 = v117;
  if ( (unsigned __int64)&v171 <= *(_QWORD *)(v22 + 8) )
  {
    MEMORY[0x181EB84E0]();
LABEL_61:
    v144 = sub_182771080(a1: v129, a2: v130, a3: v134, a4: v128, a5: v133, a6: v131, a7: v171);
    goto LABEL_62;
  }
  sub_182771FC0(a1: v112, a2: v113, a3: 0);
  v132 = (__int64)(v21 + 88325320);
  v133 = (int)v178;
  if ( v178 != v21 && *v178 >> 3 == 4262015 )
  {
    v177 = v21 + 88325320;
    v132 = MEMORY[0x184F68C80](a1: v129, a2: v130, a3: v178);
  }
  else
  {
    v177 = v21 + 88325320;
    if ( v178 != v21 )
      v132 = ((__int64 (__fastcall *)(__int64, __int64, _DWORD *))(v20 + *(_QWORD *)&v21[2 * (*v178 >> 3) + 26]))(
               a1: v129,
               a2: v130,
               a3: v178);
  }
  v176 = v132;
  v134 = (int)v179;
  if ( v179 == v21 )
    goto LABEL_61;
  v135 = MEMORY[0x184F68C80](a1: v129, a2: v130, a3: &v21[2 * (*v179 >> 3)]);
  if ( (_DWORD *)v135 == v21 )
    v138 = (__int64)v177;
  else
    v138 = v135;
  if ( (_DWORD *)v176 == v21 )
    v139 = v177;
  else
    v139 = (_DWORD *)v176;
  v177 = (_DWORD *)v135;
  v182 = *((char *)v139 + 12) | *(char *)(v138 + 12);
  v175 = (__int64)v139;
  v174 = v138;
  v140 = MEMORY[0x1850132E0](a1: v136, a2: v137, a3: 19, a4: v176, a5: v138);
  v144 = MEMORY[0x1850132E0](a1: v142, a2: v143, a3: v140, a4: v141, a5: v175);
  v147 = v182;
  LODWORD(v15) = v144 << v182;
  if ( ((v144 << v182) & 0x80000000) != 0 )
  {
LABEL_62:
    v181 = v144;
    v166 = *(_QWORD *)(v22 + 40);
    if ( (unsigned __int64)(v166 + 40) > *(_QWORD *)(v22 + 32) )
    {
      v180 = v15;
      v166 = MEMORY[0x181EAA920](a1: v145, a2: v146, a3: 34082880);
    }
    else
    {
      *(_QWORD *)(v22 + 40) = v166 + 40;
      *(_DWORD *)v166 = 34082880;
      *(_DWORD *)(v166 + 4) = 0;
      *(_QWORD *)(v166 + 8) = 0;
      *(_QWORD *)(v166 + 16) = 0;
      *(_QWORD *)(v166 + 24) = 0;
      *(_QWORD *)(v166 + 32) = 0;
      v180 = v15;
    }
    *(_DWORD *)(v166 + 20) = 46923644;
    *(_DWORD *)(v166 + 16) = v21[93585974];
    *(_DWORD *)(v166 + 12) = (unsigned __int64)(v166 - (_QWORD)v21) >> 3;
    v173 = v166;
    MEMORY[0x18503B9A0](a1: v145, a2: v146, a3: v166, a4: v147, a5: 0);
    v170 = v173;
    *(_DWORD *)(v173 + 8) = 46004603;
    if ( (*(_DWORD *)v170 & 2) != 0 )
      goto LABEL_66;
    while ( 1 )
    {
      v170 = sub_1827697E0(a1: v168, a2: v169, a3: (_DWORD *)v170, a4: v167, a5: (__int64)&v212);
LABEL_66:
      v167 = (v170 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v170 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v170 - v167) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v170 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v170 - v167) >> 9) + 0x38) = 0;
    }
  }
  v148 = *(_QWORD *)(v22 + 40);
  v149 = ((unsigned int)v15 + 19LL) & 0x1FFFFFFF8LL;
  if ( v149 >= 0x20000 || (v150 = v148 + v149) > *(_QWORD *)(v22 + 32) )
  {
    v181 = v144;
    v148 = MEMORY[0x181EAA840](a1: 34082368, a2: v146, a3: 34082368, a4: v182, a5: (unsigned int)v15);
    v144 = v181;
  }
  else
  {
    *(_QWORD *)(v22 + 40) = v150;
    *(_QWORD *)v148 = 34082368;
    *(_DWORD *)(v148 + 8) = v15;
  }
  v173 = v148;
  v151 = v21 + 93320312;
  v172 = v21 + 93320312;
  v181 = v144;
  if ( v182 != 0 )
    MEMORY[0x184FF2C40](a1: 1, a2: v146, a3: v21 + 93320312, a4: v151, a5: v148, a6: v144);
  else
    MEMORY[0x181EB4960](a1: v144, a2: 0, a3: v21 + 94087886, a4: v151, a5: 0, a6: v173);
  v153 = MEMORY[0x185011A80](a1: v175, a2: v21 + 14546168, a3: v181, a4: v152, a5: v182, a6: v173);
  v155 = MEMORY[0x185011A80](a1: v174, a2: v172, a3: v153, a4: v154, a5: v182, a6: v173);
  v158 = *(_QWORD *)(v22 + 40);
  if ( (unsigned __int64)(v158 + 40) > *(_QWORD *)(v22 + 32) )
  {
    v180 = v155;
    v158 = MEMORY[0x181EAA920](a1: v156, a2: v157, a3: 34590936);
  }
  else
  {
    *(_QWORD *)(v22 + 40) = v158 + 40;
    *(_DWORD *)v158 = 34590936;
    *(_DWORD *)(v158 + 4) = 0;
    *(_QWORD *)(v158 + 8) = 0;
    *(_QWORD *)(v158 + 16) = 0;
    *(_QWORD *)(v158 + 24) = 0;
    *(_QWORD *)(v158 + 32) = 0;
  }
  v177 = (_DWORD *)v158;
  *(_DWORD *)(v158 + 20) = 46923644;
  *(_DWORD *)(v158 + 16) = v21[93585974];
  *(_DWORD *)(v158 + 12) = (unsigned __int64)(v158 - (_QWORD)v21) >> 3;
  v180 = (char)v182;
  v159 = MEMORY[0x18503B9A0](a1: v156, a2: v157, a3: v158, a4: v158, a5: 0);
  v162 = *(_QWORD *)(v22 + 40);
  if ( (unsigned __int64)(v162 + 24) > *(_QWORD *)(v22 + 32) )
  {
    v175 = v159;
    v162 = MEMORY[0x181EAA920](a1: v160, a2: 34082680, a3: 34082680);
  }
  else
  {
    *(_QWORD *)(v22 + 40) = v162 + 24;
    *(_DWORD *)v162 = 34082680;
    *(_DWORD *)(v162 + 4) = 0;
    *(_QWORD *)(v162 + 8) = 0;
    *(_QWORD *)(v162 + 16) = 0;
  }
  v163 = (unsigned __int64)v177;
  v164 = v173;
  *(_BYTE *)(v162 + 12) = v182;
  *(_DWORD *)(v162 + 4) = (unsigned __int64)(v164 - (_QWORD)v21) >> 3;
  *(_DWORD *)(v163 + 8) = (unsigned __int64)(v162 - (_QWORD)v21) >> 3;
  if ( (*(_DWORD *)v163 & 2) != 0 )
  {
    v165 = (v163 & 0xFFFFFFFFFFF80000LL) + 2112;
    if ( *(_BYTE *)((v163 & 0xFFFFFFFFFFF80000LL) + ((v163 - v165) >> 9) + 0x38) != 0 )
      *(_BYTE *)((v163 & 0xFFFFFFFFFFF80000LL) + ((v163 - v165) >> 9) + 0x38) = 0;
  }
  if ( *(int *)(v22 + 16) <= 0 )
    sub_18277F280(a1: v160, a2: v161, a3: v162);
  return v198;
}
