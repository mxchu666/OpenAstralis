// sub_182771220
// rva 0x02771220  size 1083  section .text  group runtime
// window base 0x182771220: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall sub_182771220(
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
  unsigned int v34; // eax
  __int64 v35; // rcx
  __int64 v36; // rdi
  __int64 v37; // rsi
  unsigned int v38; // eax
  __int64 v39; // rcx
  __int64 v40; // rdi
  __int64 v41; // rsi
  __int64 v42; // rdx
  unsigned __int64 v43; // r9
  unsigned __int64 v44; // r9
  __int64 v45; // rcx
  unsigned int v46; // eax
  __int64 v47; // rcx
  int v48; // eax
  __int64 v49; // rcx
  __int64 v50; // rdi
  __int64 v51; // rsi
  __int64 v52; // rdx
  __int64 v53; // rax
  __int64 v54; // rcx
  __int64 v55; // rdi
  __int64 v56; // rsi
  __int64 v57; // rdx
  __int64 v58; // r8
  unsigned __int64 v59; // rax
  __int64 v60; // rdx
  unsigned __int64 v61; // rdx
  __int64 v62; // rax
  __int64 v63; // rdi
  __int64 v64; // rsi
  __int64 v65; // r11
  __int64 v66; // r10
  __int64 v67; // r9
  __int64 v68; // r8
  __int64 v69; // rdx
  __int64 v70; // rcx
  __m128i v71; // xmm7
  __m128i v72; // xmm6
  __m128i v73; // xmm5
  __m128i v74; // xmm4
  __m128i v75; // xmm3
  __m128i v76; // xmm2
  __m128i v77; // xmm1
  __m128i v78; // xmm0
  __int64 v79; // rcx
  __int64 v80; // rdi
  __int64 v81; // rsi
  __int64 v82; // rdx
  __int64 v83; // rcx
  __int64 v84; // rdi
  __int64 v85; // rsi
  __int64 v86; // rax
  __int64 v87; // rax
  __int64 v88; // rdi
  __int64 v89; // rsi
  __int64 v90; // r11
  __int64 v91; // r10
  __int64 v92; // r9
  __int64 v93; // r8
  __int64 v94; // rdx
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
  __int64 v108; // rcx
  __int64 v109; // rdi
  __int64 v110; // rsi
  __int64 v111; // rax
  __int64 v112; // rax
  __int64 v113; // rdi
  __int64 v114; // rsi
  __int64 v115; // r11
  __int64 v116; // r10
  __int64 v117; // r9
  __int64 v118; // r8
  __int64 v119; // rdx
  __int64 v120; // rcx
  __m128i v121; // xmm7
  __m128i v122; // xmm6
  __m128i v123; // xmm5
  __m128i v124; // xmm4
  __m128i v125; // xmm3
  __m128i v126; // xmm2
  __m128i v127; // xmm1
  __m128i v128; // xmm0
  __int64 v129; // rcx
  __int64 v130; // rdi
  __int64 v131; // rsi
  __int64 v132; // rdx
  __int64 v133; // rcx
  __int64 v134; // rdi
  __int64 v135; // rsi
  __int64 v136; // rax
  __int64 v137; // rax
  __int64 v138; // rdi
  __int64 v139; // rsi
  __int64 v140; // r11
  __int64 v141; // r10
  __int64 v142; // r9
  __int64 v143; // r8
  __int64 v144; // rdx
  __int64 v145; // rcx
  __m128i v146; // xmm7
  __m128i v147; // xmm6
  __m128i v148; // xmm5
  __m128i v149; // xmm4
  __m128i v150; // xmm3
  __m128i v151; // xmm2
  __m128i v152; // xmm1
  __m128i v153; // xmm0
  __int64 v154; // rcx
  __int64 v155; // rdi
  __int64 v156; // rsi
  __int64 v157; // rdx
  __int64 v158; // rcx
  __int64 v159; // rdi
  __int64 v160; // rsi
  __int64 v161; // rax
  __int64 v162; // rax
  __int64 v163; // rdi
  __int64 v164; // rsi
  __int64 v165; // r11
  __int64 v166; // r10
  __int64 v167; // r9
  __int64 v168; // r8
  __int64 v169; // rdx
  __int64 v170; // rcx
  __m128i v171; // xmm7
  __m128i v172; // xmm6
  __m128i v173; // xmm5
  __m128i v174; // xmm4
  __m128i v175; // xmm3
  __m128i v176; // xmm2
  __m128i v177; // xmm1
  __m128i v178; // xmm0
  __int64 v179; // rcx
  __int64 v180; // rdi
  __int64 v181; // rsi
  __int64 v182; // rdx
  __int64 v183; // rcx
  __int64 v184; // rdi
  __int64 v185; // rsi
  __int64 v186; // rax
  __int64 v187; // rdx
  __int64 v188; // rdi
  __int64 v189; // rsi
  __int64 v191; // [rsp-10h] [rbp-8F0h] BYREF
  __int64 v192; // [rsp+0h] [rbp-8E0h]
  __m128i v193; // [rsp+8h] [rbp-8D8h]
  __m128i v194; // [rsp+18h] [rbp-8C8h]
  __m128i v195; // [rsp+28h] [rbp-8B8h]
  __m128i v196; // [rsp+38h] [rbp-8A8h]
  __m128i v197; // [rsp+48h] [rbp-898h]
  __m128i v198; // [rsp+58h] [rbp-888h]
  __m128i v199; // [rsp+68h] [rbp-878h]
  __m128i v200; // [rsp+78h] [rbp-868h]
  __m128i v201; // [rsp+88h] [rbp-858h]
  __m128i v202; // [rsp+98h] [rbp-848h]
  __m128i v203; // [rsp+A8h] [rbp-838h]
  __m128i v204; // [rsp+B8h] [rbp-828h]
  __m128i v205; // [rsp+C8h] [rbp-818h]
  __m128i v206; // [rsp+D8h] [rbp-808h]
  __m128i v207; // [rsp+E8h] [rbp-7F8h]
  __m128i v208; // [rsp+F8h] [rbp-7E8h]
  __int64 v209; // [rsp+108h] [rbp-7D8h]
  __int64 v210; // [rsp+110h] [rbp-7D0h]
  __int64 v211; // [rsp+118h] [rbp-7C8h]
  __int64 v212; // [rsp+120h] [rbp-7C0h]
  __int64 v213; // [rsp+128h] [rbp-7B8h]
  __int64 v214; // [rsp+130h] [rbp-7B0h]
  __int64 v215; // [rsp+138h] [rbp-7A8h]
  __int64 v216; // [rsp+140h] [rbp-7A0h]
  __int64 v217; // [rsp+148h] [rbp-798h]
  __int64 v218; // [rsp+150h] [rbp-790h]
  __int64 v219; // [rsp+158h] [rbp-788h]
  __int64 v220; // [rsp+160h] [rbp-780h]
  __int64 v221; // [rsp+168h] [rbp-778h] BYREF
  _BYTE v222[8]; // [rsp+170h] [rbp-770h] BYREF
  __int64 v223; // [rsp+178h] [rbp-768h]
  __m128i v224; // [rsp+180h] [rbp-760h]
  __m128i v225; // [rsp+190h] [rbp-750h]
  __m128i v226; // [rsp+1A0h] [rbp-740h]
  __m128i v227; // [rsp+1B0h] [rbp-730h]
  __m128i v228; // [rsp+1C0h] [rbp-720h]
  __m128i v229; // [rsp+1D0h] [rbp-710h]
  __m128i v230; // [rsp+1E0h] [rbp-700h]
  __m128i v231; // [rsp+1F0h] [rbp-6F0h]
  __m128i v232; // [rsp+200h] [rbp-6E0h]
  __m128i v233; // [rsp+210h] [rbp-6D0h]
  __m128i v234; // [rsp+220h] [rbp-6C0h]
  __m128i v235; // [rsp+230h] [rbp-6B0h]
  __m128i v236; // [rsp+240h] [rbp-6A0h]
  __m128i v237; // [rsp+250h] [rbp-690h]
  __m128i v238; // [rsp+260h] [rbp-680h]
  __m128i v239; // [rsp+270h] [rbp-670h]
  __int64 v240; // [rsp+280h] [rbp-660h]
  __int64 v241; // [rsp+288h] [rbp-658h]
  __int64 v242; // [rsp+290h] [rbp-650h]
  __int64 v243; // [rsp+298h] [rbp-648h]
  __int64 v244; // [rsp+2A0h] [rbp-640h]
  __int64 v245; // [rsp+2A8h] [rbp-638h]
  __int64 v246; // [rsp+2B0h] [rbp-630h]
  __int64 v247; // [rsp+2B8h] [rbp-628h]
  __int64 v248; // [rsp+2C0h] [rbp-620h]
  __int64 v249; // [rsp+2C8h] [rbp-618h]
  __int64 v250; // [rsp+2D0h] [rbp-610h]
  __int64 v251; // [rsp+2D8h] [rbp-608h]
  __int64 v252; // [rsp+2E0h] [rbp-600h] BYREF
  _BYTE v253[8]; // [rsp+2E8h] [rbp-5F8h] BYREF
  __int64 v254; // [rsp+2F0h] [rbp-5F0h]
  __m128i v255; // [rsp+2F8h] [rbp-5E8h]
  __m128i v256; // [rsp+308h] [rbp-5D8h]
  __m128i v257; // [rsp+318h] [rbp-5C8h]
  __m128i v258; // [rsp+328h] [rbp-5B8h]
  __m128i v259; // [rsp+338h] [rbp-5A8h]
  __m128i v260; // [rsp+348h] [rbp-598h]
  __m128i v261; // [rsp+358h] [rbp-588h]
  __m128i v262; // [rsp+368h] [rbp-578h]
  __m128i v263; // [rsp+378h] [rbp-568h]
  __m128i v264; // [rsp+388h] [rbp-558h]
  __m128i v265; // [rsp+398h] [rbp-548h]
  __m128i v266; // [rsp+3A8h] [rbp-538h]
  __m128i v267; // [rsp+3B8h] [rbp-528h]
  __m128i v268; // [rsp+3C8h] [rbp-518h]
  __m128i v269; // [rsp+3D8h] [rbp-508h]
  __m128i v270; // [rsp+3E8h] [rbp-4F8h]
  __int64 v271; // [rsp+3F8h] [rbp-4E8h]
  __int64 v272; // [rsp+400h] [rbp-4E0h]
  __int64 v273; // [rsp+408h] [rbp-4D8h]
  __int64 v274; // [rsp+410h] [rbp-4D0h]
  __int64 v275; // [rsp+418h] [rbp-4C8h]
  __int64 v276; // [rsp+420h] [rbp-4C0h]
  __int64 v277; // [rsp+428h] [rbp-4B8h]
  __int64 v278; // [rsp+430h] [rbp-4B0h]
  __int64 v279; // [rsp+438h] [rbp-4A8h]
  __int64 v280; // [rsp+440h] [rbp-4A0h]
  __int64 v281; // [rsp+448h] [rbp-498h]
  __int64 v282; // [rsp+450h] [rbp-490h]
  __int64 v283; // [rsp+458h] [rbp-488h] BYREF
  _BYTE v284[8]; // [rsp+460h] [rbp-480h] BYREF
  __int64 v285; // [rsp+468h] [rbp-478h]
  __m128i v286; // [rsp+470h] [rbp-470h]
  __m128i v287; // [rsp+480h] [rbp-460h]
  __m128i v288; // [rsp+490h] [rbp-450h]
  __m128i v289; // [rsp+4A0h] [rbp-440h]
  __m128i v290; // [rsp+4B0h] [rbp-430h]
  __m128i v291; // [rsp+4C0h] [rbp-420h]
  __m128i v292; // [rsp+4D0h] [rbp-410h]
  __m128i v293; // [rsp+4E0h] [rbp-400h]
  __m128i v294; // [rsp+4F0h] [rbp-3F0h]
  __m128i v295; // [rsp+500h] [rbp-3E0h]
  __m128i v296; // [rsp+510h] [rbp-3D0h]
  __m128i v297; // [rsp+520h] [rbp-3C0h]
  __m128i v298; // [rsp+530h] [rbp-3B0h]
  __m128i v299; // [rsp+540h] [rbp-3A0h]
  __m128i v300; // [rsp+550h] [rbp-390h]
  __m128i v301; // [rsp+560h] [rbp-380h]
  __int64 v302; // [rsp+570h] [rbp-370h]
  __int64 v303; // [rsp+578h] [rbp-368h]
  __int64 v304; // [rsp+580h] [rbp-360h]
  __int64 v305; // [rsp+588h] [rbp-358h]
  __int64 v306; // [rsp+590h] [rbp-350h]
  __int64 v307; // [rsp+598h] [rbp-348h]
  __int64 v308; // [rsp+5A0h] [rbp-340h]
  __int64 v309; // [rsp+5A8h] [rbp-338h]
  __int64 v310; // [rsp+5B0h] [rbp-330h]
  __int64 v311; // [rsp+5B8h] [rbp-328h]
  __int64 v312; // [rsp+5C0h] [rbp-320h]
  __int64 v313; // [rsp+5C8h] [rbp-318h]
  __int64 v314; // [rsp+5D0h] [rbp-310h] BYREF
  _BYTE v315[8]; // [rsp+5D8h] [rbp-308h] BYREF
  __int64 v316; // [rsp+5E0h] [rbp-300h]
  __m128i v317; // [rsp+5E8h] [rbp-2F8h]
  __m128i v318; // [rsp+5F8h] [rbp-2E8h]
  __m128i v319; // [rsp+608h] [rbp-2D8h]
  __m128i v320; // [rsp+618h] [rbp-2C8h]
  __m128i v321; // [rsp+628h] [rbp-2B8h]
  __m128i v322; // [rsp+638h] [rbp-2A8h]
  __m128i v323; // [rsp+648h] [rbp-298h]
  __m128i v324; // [rsp+658h] [rbp-288h]
  __m128i v325; // [rsp+668h] [rbp-278h]
  __m128i v326; // [rsp+678h] [rbp-268h]
  __m128i v327; // [rsp+688h] [rbp-258h]
  __m128i v328; // [rsp+698h] [rbp-248h]
  __m128i v329; // [rsp+6A8h] [rbp-238h]
  __m128i v330; // [rsp+6B8h] [rbp-228h]
  __m128i v331; // [rsp+6C8h] [rbp-218h]
  __m128i v332; // [rsp+6D8h] [rbp-208h]
  __int64 v333; // [rsp+6E8h] [rbp-1F8h]
  __int64 v334; // [rsp+6F0h] [rbp-1F0h]
  __int64 v335; // [rsp+6F8h] [rbp-1E8h]
  __int64 v336; // [rsp+700h] [rbp-1E0h]
  __int64 v337; // [rsp+708h] [rbp-1D8h]
  __int64 v338; // [rsp+710h] [rbp-1D0h]
  __int64 v339; // [rsp+718h] [rbp-1C8h]
  __int64 v340; // [rsp+720h] [rbp-1C0h]
  __int64 v341; // [rsp+728h] [rbp-1B8h]
  __int64 v342; // [rsp+730h] [rbp-1B0h]
  __int64 v343; // [rsp+738h] [rbp-1A8h]
  __int64 v344; // [rsp+740h] [rbp-1A0h]
  __int64 v345; // [rsp+748h] [rbp-198h] BYREF
  _BYTE v346[8]; // [rsp+750h] [rbp-190h] BYREF
  __int64 v347; // [rsp+758h] [rbp-188h]
  _DWORD *v348; // [rsp+760h] [rbp-180h]
  _DWORD *v349; // [rsp+768h] [rbp-178h]
  int v350; // [rsp+770h] [rbp-170h]
  unsigned int v351; // [rsp+774h] [rbp-16Ch]
  unsigned int v352; // [rsp+778h] [rbp-168h]
  unsigned int v353; // [rsp+77Ch] [rbp-164h]
  __m128i v354; // [rsp+780h] [rbp-160h]
  __m128i v355; // [rsp+790h] [rbp-150h]
  __m128i v356; // [rsp+7A0h] [rbp-140h]
  __m128i v357; // [rsp+7B0h] [rbp-130h]
  __m128i v358; // [rsp+7C0h] [rbp-120h]
  __m128i v359; // [rsp+7D0h] [rbp-110h]
  __m128i v360; // [rsp+7E0h] [rbp-100h]
  __m128i v361; // [rsp+7F0h] [rbp-F0h]
  __m128i m128_i128; // [rsp+800h] [rbp-E0h]
  __m128i v363; // [rsp+810h] [rbp-D0h]
  __m128i v364; // [rsp+820h] [rbp-C0h]
  __m128i v365; // [rsp+830h] [rbp-B0h]
  __m128i v366; // [rsp+840h] [rbp-A0h]
  __m128i v367; // [rsp+850h] [rbp-90h]
  __m128i v368; // [rsp+860h] [rbp-80h]
  __m128i v369; // [rsp+870h] [rbp-70h]
  __int64 v370; // [rsp+880h] [rbp-60h]
  __int64 v371; // [rsp+888h] [rbp-58h]
  __int64 v372; // [rsp+890h] [rbp-50h]
  __int64 v373; // [rsp+898h] [rbp-48h]
  __int64 v374; // [rsp+8A0h] [rbp-40h]
  __int64 v375; // [rsp+8A8h] [rbp-38h]
  __int64 v376; // [rsp+8B0h] [rbp-30h]
  __int64 v377; // [rsp+8B8h] [rbp-28h]
  __int64 v378; // [rsp+8C0h] [rbp-20h]
  __int64 v379; // [rsp+8C8h] [rbp-18h]
  __int64 v380; // [rsp+8D0h] [rbp-10h]

  v370 = v20;
  v371 = v19;
  v372 = v18;
  v373 = a6;
  v374 = a5;
  v375 = a1;
  v376 = a2;
  v377 = v16;
  v378 = a3;
  v379 = a4;
  v380 = v15;
  v354 = v30;
  v355 = v29;
  v356 = v28;
  v357 = v27;
  v358 = v26;
  v359 = v25;
  v360 = v24;
  v361 = v23;
  m128_i128 = (__m128i)a14.m128_i128;
  v363 = (__m128i)a13.m128_i128;
  v364 = (__m128i)a12.m128_i128;
  v365 = (__m128i)a11.m128_i128;
  v366 = (__m128i)a10.m128_i128;
  v367 = (__m128i)a9.m128_i128;
  v368 = (__m128i)a8.m128_i128;
  v369 = (__m128i)a7.m128_i128;
  if ( (unsigned __int64)&v345 > v22[1] )
  {
    v353 = a5;
    v352 = a3;
    sub_182771FC0(a1, a2, a3: 0);
    v34 = MEMORY[0x1850130C0](a1: v32, a2: v33, a3: 32, a4: v31, a5: v352);
    v38 = MEMORY[0x1850130C0](a1: v36, a2: v37, a3: v34, a4: v35, a5: v353);
    if ( (v38 & 0x80000000) != 0 )
      goto LABEL_12;
    v42 = v22[5];
    v43 = (v38 + 19LL) & 0x1FFFFFFF8LL;
    if ( v43 >= 0x20000 || (v44 = v42 + v43) > v22[4] )
    {
      v351 = v38;
      v42 = MEMORY[0x181EAA840](a1: 34082368, a2: v41, a3: 34082368, a4: v39, a5: v38);
      v38 = v351;
    }
    else
    {
      v22[5] = v44;
      *(_QWORD *)v42 = 34082368;
      *(_DWORD *)(v42 + 8) = v38;
    }
    v349 = (_DWORD *)v42;
    v351 = v38;
    MEMORY[0x181EB4960](a1: v38, a2: 0, a3: v21 + 376351544, a4: v42, a5: 0, a6: v42);
    v46 = MEMORY[0x185011920](a1: v353, a2: v21 + 58184792, a3: v351, a4: v45, a5: 0, a6: v349);
    v48 = MEMORY[0x185011920](a1: v352, a2: v21 + 58184816, a3: v46, a4: v47, a5: 0, a6: v349);
    v52 = v22[5];
    if ( (unsigned __int64)(v52 + 40) > v22[4] )
    {
      v350 = v48;
      v52 = MEMORY[0x181EAA920](a1: v50, a2: v51, a3: 34150672);
    }
    else
    {
      v22[5] = v52 + 40;
      *(_DWORD *)v52 = 34150672;
      *(_DWORD *)(v52 + 4) = 0;
      *(_QWORD *)(v52 + 8) = 0;
      *(_QWORD *)(v52 + 16) = 0;
      *(_QWORD *)(v52 + 24) = 0;
      *(_QWORD *)(v52 + 32) = 0;
    }
    v348 = (_DWORD *)v52;
    *(_DWORD *)(v52 + 20) = 46923644;
    *(_DWORD *)(v52 + 16) = *(_DWORD *)(v21 + 374343896);
    *(_DWORD *)(v52 + 12) = (unsigned __int64)(v52 - v21) >> 3;
    v53 = MEMORY[0x18503B9A0](a1: v50, a2: v51, a3: v52, a4: v49, a5: 0);
    v57 = v22[5];
    if ( (unsigned __int64)(v57 + 24) > v22[4] )
    {
      v347 = v53;
      v58 = MEMORY[0x181EAA920](a1: v55, a2: v56, a3: 34082680);
    }
    else
    {
      v22[5] = v57 + 24;
      *(_DWORD *)v57 = 34082680;
      *(_DWORD *)(v57 + 4) = 0;
      *(_QWORD *)(v57 + 8) = 0;
      *(_QWORD *)(v57 + 16) = 0;
      v58 = v57;
    }
    v59 = (unsigned __int64)v348;
    *(_DWORD *)(v58 + 4) = ((unsigned __int64)v349 - v21) >> 3;
    *(_DWORD *)(v59 + 8) = (unsigned __int64)(v58 - v21) >> 3;
    if ( (*(_DWORD *)v59 & 2) != 0 )
    {
      v54 = (v59 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v59 & 0xFFFFFFFFFFF80000LL) + ((v59 - v54) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v59 & 0xFFFFFFFFFFF80000LL) + ((v59 - v54) >> 9) + 0x38) = 0;
    }
    while ( 1 )
    {
      v38 = sub_1827697E0(a1: v55, a2: v56, a3: (_DWORD *)v59, a4: v54, a5: (__int64)&a15);
LABEL_12:
      v351 = v38;
      v60 = v22[5];
      if ( (unsigned __int64)(v60 + 40) > v22[4] )
      {
        v60 = MEMORY[0x181EAA920](a1: v40, a2: v41, a3: 34082880);
      }
      else
      {
        v22[5] = v60 + 40;
        *(_DWORD *)v60 = 34082880;
        *(_DWORD *)(v60 + 4) = 0;
        *(_QWORD *)(v60 + 8) = 0;
        *(_QWORD *)(v60 + 16) = 0;
        *(_QWORD *)(v60 + 24) = 0;
        *(_QWORD *)(v60 + 32) = 0;
      }
      *(_DWORD *)(v60 + 20) = 46923644;
      *(_DWORD *)(v60 + 16) = *(_DWORD *)(v21 + 374343896);
      *(_DWORD *)(v60 + 12) = (unsigned __int64)(v60 - v21) >> 3;
      v349 = (_DWORD *)v60;
      MEMORY[0x18503B9A0](a1: v40, a2: v41, a3: v60, a4: v39, a5: 0);
      v61 = (unsigned __int64)v349;
      v349[2] = 46004603;
      if ( (*(_DWORD *)v61 & 2) != 0 )
      {
        v54 = (v61 & 0xFFFFFFFFFFF80000LL) + 2112;
        if ( *(_BYTE *)((v61 & 0xFFFFFFFFFFF80000LL) + ((v61 - v54) >> 9) + 0x38) != 0 )
          *(_BYTE *)((v61 & 0xFFFFFFFFFFF80000LL) + ((v61 - v54) >> 9) + 0x38) = 0;
        v59 = v61;
      }
      else
      {
        v59 = v61;
      }
    }
  }
  v62 = MEMORY[0x181EB84E0]();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  v344 = v17;
  v333 = v20;
  v334 = v65;
  v335 = v66;
  v336 = v67;
  v337 = v68;
  v338 = v63;
  v339 = v64;
  v340 = v16;
  v341 = v69;
  v342 = v70;
  v343 = v62;
  v317 = v30;
  v318 = v29;
  v319 = v28;
  v320 = v27;
  v321 = v26;
  v322 = v25;
  v323 = v24;
  v324 = v23;
  v325 = v71;
  v326 = v72;
  v327 = v73;
  v328 = v74;
  v329 = v75;
  v330 = v76;
  v331 = v77;
  v332 = v78;
  if ( (unsigned __int64)&v314 > v22[1] )
  {
    sub_182771FC0(a1: v63, a2: v64, a3: 0);
    v82 = v22[5];
    if ( (unsigned __int64)(v82 + 40) > v22[4] )
    {
      v82 = MEMORY[0x181EAA920](a1: v80, a2: v81, a3: 35966824);
    }
    else
    {
      v22[5] = v82 + 40;
      *(_DWORD *)v82 = 35966824;
      *(_DWORD *)(v82 + 4) = 0;
      *(_QWORD *)(v82 + 8) = 0;
      *(_QWORD *)(v82 + 16) = 0;
      *(_QWORD *)(v82 + 24) = 0;
      *(_QWORD *)(v82 + 32) = 0;
    }
    *(_DWORD *)(v82 + 20) = 46923644;
    *(_DWORD *)(v82 + 16) = *(_DWORD *)(v21 + 374343896);
    *(_DWORD *)(v82 + 12) = (unsigned __int64)(v82 - v21) >> 3;
    v316 = v82;
    MEMORY[0x18503B9A0](a1: v80, a2: v81, a3: v82, a4: v79, a5: 0);
    v86 = v316;
    *(_DWORD *)(v316 + 8) = 7273087;
    if ( (*(_DWORD *)v86 & 2) != 0 )
      goto LABEL_31;
    while ( 1 )
    {
      v86 = sub_1827697E0(a1: v84, a2: v85, a3: (_DWORD *)v86, a4: v83, a5: (__int64)v346);
LABEL_31:
      v83 = (v86 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v86 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v86 - v83) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v86 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v86 - v83) >> 9) + 0x38) = 0;
    }
  }
  v87 = MEMORY[0x181EB84E0]();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  v313 = v17;
  v302 = v20;
  v303 = v90;
  v304 = v91;
  v305 = v92;
  v306 = v93;
  v307 = v88;
  v308 = v89;
  v309 = v16;
  v310 = v94;
  v311 = v95;
  v312 = v87;
  v286 = v30;
  v287 = v29;
  v288 = v28;
  v289 = v27;
  v290 = v26;
  v291 = v25;
  v292 = v24;
  v293 = v23;
  v294 = v96;
  v295 = v97;
  v296 = v98;
  v297 = v99;
  v298 = v100;
  v299 = v101;
  v300 = v102;
  v301 = v103;
  if ( (unsigned __int64)&v283 > v22[1] )
  {
    sub_182771FC0(a1: v88, a2: v89, a3: 0);
    v107 = v22[5];
    if ( (unsigned __int64)(v107 + 40) > v22[4] )
    {
      v107 = MEMORY[0x181EAA920](a1: v105, a2: v106, a3: 34590936);
    }
    else
    {
      v22[5] = v107 + 40;
      *(_DWORD *)v107 = 34590936;
      *(_DWORD *)(v107 + 4) = 0;
      *(_QWORD *)(v107 + 8) = 0;
      *(_QWORD *)(v107 + 16) = 0;
      *(_QWORD *)(v107 + 24) = 0;
      *(_QWORD *)(v107 + 32) = 0;
    }
    *(_DWORD *)(v107 + 20) = 46923644;
    *(_DWORD *)(v107 + 16) = *(_DWORD *)(v21 + 374343896);
    *(_DWORD *)(v107 + 12) = (unsigned __int64)(v107 - v21) >> 3;
    v285 = v107;
    MEMORY[0x18503B9A0](a1: v105, a2: v106, a3: v107, a4: v104, a5: 0);
    v111 = v285;
    *(_DWORD *)(v285 + 8) = 7273087;
    if ( (*(_DWORD *)v111 & 2) != 0 )
      goto LABEL_39;
    while ( 1 )
    {
      v111 = sub_1827697E0(a1: v109, a2: v110, a3: (_DWORD *)v111, a4: v108, a5: (__int64)v315);
LABEL_39:
      v108 = (v111 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v111 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v111 - v108) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v111 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v111 - v108) >> 9) + 0x38) = 0;
    }
  }
  v112 = MEMORY[0x181EB84E0]();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  v282 = v17;
  v271 = v20;
  v272 = v115;
  v273 = v116;
  v274 = v117;
  v275 = v118;
  v276 = v113;
  v277 = v114;
  v278 = v16;
  v279 = v119;
  v280 = v120;
  v281 = v112;
  v255 = v30;
  v256 = v29;
  v257 = v28;
  v258 = v27;
  v259 = v26;
  v260 = v25;
  v261 = v24;
  v262 = v23;
  v263 = v121;
  v264 = v122;
  v265 = v123;
  v266 = v124;
  v267 = v125;
  v268 = v126;
  v269 = v127;
  v270 = v128;
  if ( (unsigned __int64)&v252 > v22[1] )
  {
    sub_182771FC0(a1: v113, a2: v114, a3: 0);
    v132 = v22[5];
    if ( (unsigned __int64)(v132 + 40) > v22[4] )
    {
      v132 = MEMORY[0x181EAA920](a1: v130, a2: v131, a3: 35317296);
    }
    else
    {
      v22[5] = v132 + 40;
      *(_DWORD *)v132 = 35317296;
      *(_DWORD *)(v132 + 4) = 0;
      *(_QWORD *)(v132 + 8) = 0;
      *(_QWORD *)(v132 + 16) = 0;
      *(_QWORD *)(v132 + 24) = 0;
      *(_QWORD *)(v132 + 32) = 0;
    }
    *(_DWORD *)(v132 + 20) = 46923644;
    *(_DWORD *)(v132 + 16) = *(_DWORD *)(v21 + 374343896);
    *(_DWORD *)(v132 + 12) = (unsigned __int64)(v132 - v21) >> 3;
    v254 = v132;
    MEMORY[0x18503B9A0](a1: v130, a2: v131, a3: v132, a4: v129, a5: 0);
    v136 = v254;
    *(_DWORD *)(v254 + 8) = 7273087;
    if ( (*(_DWORD *)v136 & 2) != 0 )
      goto LABEL_47;
    while ( 1 )
    {
      v136 = sub_1827697E0(a1: v134, a2: v135, a3: (_DWORD *)v136, a4: v133, a5: (__int64)v284);
LABEL_47:
      v133 = (v136 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v136 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v136 - v133) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v136 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v136 - v133) >> 9) + 0x38) = 0;
    }
  }
  v137 = MEMORY[0x181EB84E0]();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  v251 = v17;
  v240 = v20;
  v241 = v140;
  v242 = v141;
  v243 = v142;
  v244 = v143;
  v245 = v138;
  v246 = v139;
  v247 = v16;
  v248 = v144;
  v249 = v145;
  v250 = v137;
  v224 = v30;
  v225 = v29;
  v226 = v28;
  v227 = v27;
  v228 = v26;
  v229 = v25;
  v230 = v24;
  v231 = v23;
  v232 = v146;
  v233 = v147;
  v234 = v148;
  v235 = v149;
  v236 = v150;
  v237 = v151;
  v238 = v152;
  v239 = v153;
  if ( (unsigned __int64)&v221 > v22[1] )
  {
    sub_182771FC0(a1: v138, a2: v139, a3: 0);
    v157 = v22[5];
    if ( (unsigned __int64)(v157 + 48) > v22[4] )
    {
      v157 = MEMORY[0x181EAA920](a1: v155, a2: v156, a3: 34101256);
    }
    else
    {
      v22[5] = v157 + 48;
      *(_DWORD *)v157 = 34101256;
      *(_DWORD *)(v157 + 4) = 0;
      *(_QWORD *)(v157 + 8) = 0;
      *(_QWORD *)(v157 + 16) = 0;
      *(_QWORD *)(v157 + 24) = 0;
      *(_QWORD *)(v157 + 32) = 0;
      *(_QWORD *)(v157 + 40) = 0;
    }
    *(_DWORD *)(v157 + 20) = 46923644;
    *(_DWORD *)(v157 + 16) = *(_DWORD *)(v21 + 374343896);
    *(_DWORD *)(v157 + 12) = (unsigned __int64)(v157 - v21) >> 3;
    v223 = v157;
    MEMORY[0x18503B9A0](a1: v155, a2: v156, a3: v157, a4: v154, a5: 0);
    v161 = v223;
    *(_DWORD *)(v223 + 8) = 7273087;
    if ( (*(_DWORD *)v161 & 2) != 0 )
      goto LABEL_55;
    while ( 1 )
    {
      v161 = sub_1827697E0(a1: v159, a2: v160, a3: (_DWORD *)v161, a4: v158, a5: (__int64)v253);
LABEL_55:
      v158 = (v161 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v161 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v161 - v158) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v161 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v161 - v158) >> 9) + 0x38) = 0;
    }
  }
  v162 = MEMORY[0x181EB84E0]();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  v220 = v17;
  v209 = v20;
  v210 = v165;
  v211 = v166;
  v212 = v167;
  v213 = v168;
  v214 = v163;
  v215 = v164;
  v216 = v16;
  v217 = v169;
  v218 = v170;
  v219 = v162;
  v193 = v30;
  v194 = v29;
  v195 = v28;
  v196 = v27;
  v197 = v26;
  v198 = v25;
  v199 = v24;
  v200 = v23;
  v201 = v171;
  v202 = v172;
  v203 = v173;
  v204 = v174;
  v205 = v175;
  v206 = v176;
  v207 = v177;
  v208 = v178;
  if ( (unsigned __int64)&v191 > v22[1] )
  {
    sub_182771FC0(a1: v163, a2: v164, a3: 0);
    v182 = v22[5];
    if ( (unsigned __int64)(v182 + 40) > v22[4] )
    {
      v182 = MEMORY[0x181EAA920](a1: v180, a2: v181, a3: 34150672);
    }
    else
    {
      v22[5] = v182 + 40;
      *(_DWORD *)v182 = 34150672;
      *(_DWORD *)(v182 + 4) = 0;
      *(_QWORD *)(v182 + 8) = 0;
      *(_QWORD *)(v182 + 16) = 0;
      *(_QWORD *)(v182 + 24) = 0;
      *(_QWORD *)(v182 + 32) = 0;
    }
    *(_DWORD *)(v182 + 20) = 46923644;
    *(_DWORD *)(v182 + 16) = *(_DWORD *)(v21 + 374343896);
    *(_DWORD *)(v182 + 12) = (unsigned __int64)(v182 - v21) >> 3;
    v192 = v182;
    MEMORY[0x18503B9A0](a1: v180, a2: v181, a3: v182, a4: v179, a5: 0);
    v186 = v192;
    *(_DWORD *)(v192 + 8) = 7273087;
    if ( (*(_DWORD *)v186 & 2) != 0 )
      goto LABEL_63;
    while ( 1 )
    {
      v186 = sub_1827697E0(a1: v184, a2: v185, a3: (_DWORD *)v186, a4: v183, a5: (__int64)v222);
LABEL_63:
      v183 = (v186 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v186 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v186 - v183) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v186 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v186 - v183) >> 9) + 0x38) = 0;
    }
  }
  MEMORY[0x181EB84E0]();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  return sub_182771FC0(a1: v188, a2: v189, a3: v187);
}
