// sub_18276BEE0
// rva 0x0276bee0  size 651  section .text  group runtime
// from Hex-Rays over a carved window; addresses are image addresses
__m128i __fastcall sub_18276BEE0(
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
        __m128 a14)
{
  __int64 v14; // rax
  __int64 v15; // rbx
  __int64 v16; // rbp
  __int64 v17; // r10
  __int64 v18; // r11
  __int64 v19; // r12
  __int64 v20; // r14
  __int64 v21; // r15
  __m128i v22; // xmm8
  __m128i v23; // xmm9
  __m128i v24; // xmm10
  __m128i v25; // xmm11
  __m128i v26; // xmm12
  __m128i v27; // xmm13
  __m128i v28; // xmm14
  __m128i v29; // xmm15
  __int64 v30; // rcx
  __int64 v31; // rdi
  __int64 v32; // rsi
  __int64 v33; // rdx
  __int64 v34; // rdx
  __int64 v35; // rdi
  __int64 v36; // rsi
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
  __int64 v59; // rdi
  __int64 v60; // rsi
  unsigned __int64 v61; // rdx
  unsigned __int64 v62; // rbx
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
  __int64 v84; // rdi
  __int64 v85; // rsi
  unsigned __int64 v86; // rdx
  unsigned __int64 v87; // rbx
  __int64 v88; // rax
  __int64 v89; // rdi
  __int64 v90; // rsi
  __int64 v91; // r11
  __int64 v92; // r10
  __int64 v93; // r9
  __int64 v94; // r8
  __int64 v95; // rdx
  __int64 v96; // rcx
  __m128i v97; // xmm7
  __m128i v98; // xmm6
  __m128i v99; // xmm5
  __m128i v100; // xmm4
  __m128i v101; // xmm3
  __m128i v102; // xmm2
  __m128i v103; // xmm1
  __m128i v104; // xmm0
  __int64 v105; // rcx
  __int64 v106; // rdi
  __int64 v107; // rsi
  __int64 v108; // rdx
  __int64 v109; // rdi
  __int64 v110; // rsi
  unsigned __int64 v111; // rdx
  unsigned __int64 v112; // rbx
  __int64 v113; // rax
  __int64 v114; // rdi
  __int64 v115; // rsi
  __int64 v116; // r11
  __int64 v117; // r10
  __int64 v118; // r9
  __int64 v119; // r8
  __int64 v120; // rdx
  __int64 v121; // rcx
  __m128i v122; // xmm7
  __m128i v123; // xmm6
  __m128i v124; // xmm5
  __m128i v125; // xmm4
  __m128i v126; // xmm3
  __m128i v127; // xmm2
  __m128i v128; // xmm1
  __m128i v129; // xmm0
  __int64 v130; // rcx
  __int64 v131; // rdi
  __int64 v132; // rsi
  __int64 v133; // rdx
  __int64 v134; // rdi
  __int64 v135; // rsi
  unsigned __int64 v136; // rdx
  unsigned __int64 v137; // rbx
  __int64 v138; // rax
  __int64 v139; // rdi
  __int64 v140; // rsi
  __int64 v141; // r11
  __int64 v142; // r10
  __int64 v143; // r9
  __int64 v144; // r8
  __int64 v145; // rdx
  __int64 v146; // rcx
  __m128i v147; // xmm7
  __m128i v148; // xmm6
  __m128i v149; // xmm5
  __m128i v150; // xmm4
  __m128i v151; // xmm3
  __m128i v152; // xmm2
  __m128i v153; // xmm1
  __m128i v154; // xmm0
  __int64 v155; // rcx
  __int64 v156; // rdi
  __int64 v157; // rsi
  __int64 v158; // rdx
  __int64 v159; // rdi
  __int64 v160; // rsi
  unsigned __int64 v161; // rdx
  unsigned __int64 v162; // rbx
  __int64 v163; // rax
  __int64 v164; // rdx
  __int64 v165; // rdi
  __int64 v166; // rsi
  __int64 v167; // r8
  __int64 v168; // r11
  __int64 v169; // r10
  __int64 v170; // r9
  __int64 v171; // rcx
  __m128i v172; // xmm7
  __m128i v173; // xmm6
  __m128i v174; // xmm5
  __m128i v175; // xmm4
  __m128i v176; // xmm3
  __m128i v177; // xmm2
  __m128i v178; // xmm1
  __m128i v179; // xmm0
  __int64 v180; // rcx
  __int64 v181; // rdi
  __int64 v182; // rsi
  unsigned int v183; // eax
  __int64 v184; // rcx
  __int64 v185; // rdi
  __int64 v186; // rsi
  unsigned int v187; // eax
  __int64 v188; // rcx
  __int64 v189; // rdi
  __int64 v190; // rsi
  __int64 v191; // rdx
  unsigned __int64 v192; // r9
  unsigned __int64 v193; // r9
  __int64 v194; // rcx
  unsigned int v195; // eax
  __int64 v196; // rcx
  int v197; // eax
  __int64 v198; // rcx
  __int64 v199; // rdi
  __int64 v200; // rsi
  __int64 v201; // rdx
  __int64 v202; // rax
  __int64 v203; // rdi
  __int64 v204; // rsi
  __int64 v205; // rdx
  __int64 v206; // rax
  unsigned __int64 v207; // rcx
  unsigned __int64 v208; // rdx
  unsigned __int64 v209; // rbp
  __int64 v210; // rdx
  __int64 v211; // rcx
  __int64 v212; // rdi
  __int64 v213; // rsi
  __int64 v214; // rax
  _QWORD v215[3]; // [rsp-10h] [rbp-A68h] BYREF
  unsigned int *v216; // [rsp+8h] [rbp-A50h]
  __int64 v217; // [rsp+10h] [rbp-A48h]
  int v218; // [rsp+18h] [rbp-A40h]
  unsigned int v219; // [rsp+1Ch] [rbp-A3Ch]
  unsigned int v220; // [rsp+20h] [rbp-A38h]
  unsigned int v221; // [rsp+24h] [rbp-A34h]
  __m128i v222; // [rsp+28h] [rbp-A30h]
  __m128i v223; // [rsp+38h] [rbp-A20h]
  __m128i v224; // [rsp+48h] [rbp-A10h]
  __m128i v225; // [rsp+58h] [rbp-A00h]
  __m128i v226; // [rsp+68h] [rbp-9F0h]
  __m128i v227; // [rsp+78h] [rbp-9E0h]
  __m128i v228; // [rsp+88h] [rbp-9D0h]
  __m128i v229; // [rsp+98h] [rbp-9C0h]
  __m128i v230; // [rsp+A8h] [rbp-9B0h]
  __m128i v231; // [rsp+B8h] [rbp-9A0h]
  __m128i v232; // [rsp+C8h] [rbp-990h]
  __m128i v233; // [rsp+D8h] [rbp-980h]
  __m128i v234; // [rsp+E8h] [rbp-970h]
  __m128i v235; // [rsp+F8h] [rbp-960h]
  __m128i v236; // [rsp+108h] [rbp-950h]
  __m128i v237; // [rsp+118h] [rbp-940h]
  __int64 v238; // [rsp+128h] [rbp-930h]
  __int64 v239; // [rsp+130h] [rbp-928h]
  __int64 v240; // [rsp+138h] [rbp-920h]
  __int64 v241; // [rsp+140h] [rbp-918h]
  __int64 v242; // [rsp+148h] [rbp-910h]
  __int64 v243; // [rsp+150h] [rbp-908h]
  __int64 v244; // [rsp+158h] [rbp-900h]
  __int64 v245; // [rsp+160h] [rbp-8F8h]
  __int64 v246; // [rsp+168h] [rbp-8F0h]
  __int64 v247; // [rsp+170h] [rbp-8E8h]
  __int64 v248; // [rsp+178h] [rbp-8E0h]
  __int64 v249; // [rsp+180h] [rbp-8D8h]
  __int64 v250; // [rsp+188h] [rbp-8D0h] BYREF
  _BYTE v251[8]; // [rsp+190h] [rbp-8C8h] BYREF
  _DWORD *v252; // [rsp+198h] [rbp-8C0h]
  __m128i v253; // [rsp+1A0h] [rbp-8B8h]
  __m128i v254; // [rsp+1B0h] [rbp-8A8h]
  __m128i v255; // [rsp+1C0h] [rbp-898h]
  __m128i v256; // [rsp+1D0h] [rbp-888h]
  __m128i v257; // [rsp+1E0h] [rbp-878h]
  __m128i v258; // [rsp+1F0h] [rbp-868h]
  __m128i v259; // [rsp+200h] [rbp-858h]
  __m128i v260; // [rsp+210h] [rbp-848h]
  __m128i v261; // [rsp+220h] [rbp-838h]
  __m128i v262; // [rsp+230h] [rbp-828h]
  __m128i v263; // [rsp+240h] [rbp-818h]
  __m128i v264; // [rsp+250h] [rbp-808h]
  __m128i v265; // [rsp+260h] [rbp-7F8h]
  __m128i v266; // [rsp+270h] [rbp-7E8h]
  __m128i v267; // [rsp+280h] [rbp-7D8h]
  __m128i v268; // [rsp+290h] [rbp-7C8h]
  __int64 v269; // [rsp+2A0h] [rbp-7B8h]
  __int64 v270; // [rsp+2A8h] [rbp-7B0h]
  __int64 v271; // [rsp+2B0h] [rbp-7A8h]
  __int64 v272; // [rsp+2B8h] [rbp-7A0h]
  __int64 v273; // [rsp+2C0h] [rbp-798h]
  __int64 v274; // [rsp+2C8h] [rbp-790h]
  __int64 v275; // [rsp+2D0h] [rbp-788h]
  __int64 v276; // [rsp+2D8h] [rbp-780h]
  __int64 v277; // [rsp+2E0h] [rbp-778h]
  __int64 v278; // [rsp+2E8h] [rbp-770h]
  __int64 v279; // [rsp+2F0h] [rbp-768h]
  __int64 v280; // [rsp+2F8h] [rbp-760h]
  __int64 v281; // [rsp+300h] [rbp-758h] BYREF
  _DWORD *v282; // [rsp+310h] [rbp-748h]
  __m128i v283; // [rsp+318h] [rbp-740h]
  __m128i v284; // [rsp+328h] [rbp-730h]
  __m128i v285; // [rsp+338h] [rbp-720h]
  __m128i v286; // [rsp+348h] [rbp-710h]
  __m128i v287; // [rsp+358h] [rbp-700h]
  __m128i v288; // [rsp+368h] [rbp-6F0h]
  __m128i v289; // [rsp+378h] [rbp-6E0h]
  __m128i v290; // [rsp+388h] [rbp-6D0h]
  __m128i v291; // [rsp+398h] [rbp-6C0h]
  __m128i v292; // [rsp+3A8h] [rbp-6B0h]
  __m128i v293; // [rsp+3B8h] [rbp-6A0h]
  __m128i v294; // [rsp+3C8h] [rbp-690h]
  __m128i v295; // [rsp+3D8h] [rbp-680h]
  __m128i v296; // [rsp+3E8h] [rbp-670h]
  __m128i v297; // [rsp+3F8h] [rbp-660h]
  __m128i v298; // [rsp+408h] [rbp-650h]
  __int64 v299; // [rsp+418h] [rbp-640h]
  __int64 v300; // [rsp+420h] [rbp-638h]
  __int64 v301; // [rsp+428h] [rbp-630h]
  __int64 v302; // [rsp+430h] [rbp-628h]
  __int64 v303; // [rsp+438h] [rbp-620h]
  __int64 v304; // [rsp+440h] [rbp-618h]
  __int64 v305; // [rsp+448h] [rbp-610h]
  __int64 v306; // [rsp+450h] [rbp-608h]
  __int64 v307; // [rsp+458h] [rbp-600h]
  __int64 v308; // [rsp+460h] [rbp-5F8h]
  __int64 v309; // [rsp+468h] [rbp-5F0h]
  __int64 v310; // [rsp+470h] [rbp-5E8h]
  __int64 v311; // [rsp+478h] [rbp-5E0h] BYREF
  _DWORD *v312; // [rsp+488h] [rbp-5D0h]
  __m128i v313; // [rsp+490h] [rbp-5C8h]
  __m128i v314; // [rsp+4A0h] [rbp-5B8h]
  __m128i v315; // [rsp+4B0h] [rbp-5A8h]
  __m128i v316; // [rsp+4C0h] [rbp-598h]
  __m128i v317; // [rsp+4D0h] [rbp-588h]
  __m128i v318; // [rsp+4E0h] [rbp-578h]
  __m128i v319; // [rsp+4F0h] [rbp-568h]
  __m128i v320; // [rsp+500h] [rbp-558h]
  __m128i v321; // [rsp+510h] [rbp-548h]
  __m128i v322; // [rsp+520h] [rbp-538h]
  __m128i v323; // [rsp+530h] [rbp-528h]
  __m128i v324; // [rsp+540h] [rbp-518h]
  __m128i v325; // [rsp+550h] [rbp-508h]
  __m128i v326; // [rsp+560h] [rbp-4F8h]
  __m128i v327; // [rsp+570h] [rbp-4E8h]
  __m128i v328; // [rsp+580h] [rbp-4D8h]
  __int64 v329; // [rsp+590h] [rbp-4C8h]
  __int64 v330; // [rsp+598h] [rbp-4C0h]
  __int64 v331; // [rsp+5A0h] [rbp-4B8h]
  __int64 v332; // [rsp+5A8h] [rbp-4B0h]
  __int64 v333; // [rsp+5B0h] [rbp-4A8h]
  __int64 v334; // [rsp+5B8h] [rbp-4A0h]
  __int64 v335; // [rsp+5C0h] [rbp-498h]
  __int64 v336; // [rsp+5C8h] [rbp-490h]
  __int64 v337; // [rsp+5D0h] [rbp-488h]
  __int64 v338; // [rsp+5D8h] [rbp-480h]
  __int64 v339; // [rsp+5E0h] [rbp-478h]
  __int64 v340; // [rsp+5E8h] [rbp-470h]
  __int64 v341; // [rsp+5F0h] [rbp-468h] BYREF
  _DWORD *v342; // [rsp+600h] [rbp-458h]
  __m128i v343; // [rsp+608h] [rbp-450h]
  __m128i v344; // [rsp+618h] [rbp-440h]
  __m128i v345; // [rsp+628h] [rbp-430h]
  __m128i v346; // [rsp+638h] [rbp-420h]
  __m128i v347; // [rsp+648h] [rbp-410h]
  __m128i v348; // [rsp+658h] [rbp-400h]
  __m128i v349; // [rsp+668h] [rbp-3F0h]
  __m128i v350; // [rsp+678h] [rbp-3E0h]
  __m128i v351; // [rsp+688h] [rbp-3D0h]
  __m128i v352; // [rsp+698h] [rbp-3C0h]
  __m128i v353; // [rsp+6A8h] [rbp-3B0h]
  __m128i v354; // [rsp+6B8h] [rbp-3A0h]
  __m128i v355; // [rsp+6C8h] [rbp-390h]
  __m128i v356; // [rsp+6D8h] [rbp-380h]
  __m128i v357; // [rsp+6E8h] [rbp-370h]
  __m128i v358; // [rsp+6F8h] [rbp-360h]
  __int64 v359; // [rsp+708h] [rbp-350h]
  __int64 v360; // [rsp+710h] [rbp-348h]
  __int64 v361; // [rsp+718h] [rbp-340h]
  __int64 v362; // [rsp+720h] [rbp-338h]
  __int64 v363; // [rsp+728h] [rbp-330h]
  __int64 v364; // [rsp+730h] [rbp-328h]
  __int64 v365; // [rsp+738h] [rbp-320h]
  __int64 v366; // [rsp+740h] [rbp-318h]
  __int64 v367; // [rsp+748h] [rbp-310h]
  __int64 v368; // [rsp+750h] [rbp-308h]
  __int64 v369; // [rsp+758h] [rbp-300h]
  __int64 v370; // [rsp+760h] [rbp-2F8h]
  __int64 v371; // [rsp+768h] [rbp-2F0h] BYREF
  _DWORD *v372; // [rsp+778h] [rbp-2E0h]
  __m128i v373; // [rsp+780h] [rbp-2D8h]
  __m128i v374; // [rsp+790h] [rbp-2C8h]
  __m128i v375; // [rsp+7A0h] [rbp-2B8h]
  __m128i v376; // [rsp+7B0h] [rbp-2A8h]
  __m128i v377; // [rsp+7C0h] [rbp-298h]
  __m128i v378; // [rsp+7D0h] [rbp-288h]
  __m128i v379; // [rsp+7E0h] [rbp-278h]
  __m128i v380; // [rsp+7F0h] [rbp-268h]
  __m128i v381; // [rsp+800h] [rbp-258h]
  __m128i v382; // [rsp+810h] [rbp-248h]
  __m128i v383; // [rsp+820h] [rbp-238h]
  __m128i v384; // [rsp+830h] [rbp-228h]
  __m128i v385; // [rsp+840h] [rbp-218h]
  __m128i v386; // [rsp+850h] [rbp-208h]
  __m128i v387; // [rsp+860h] [rbp-1F8h]
  __m128i v388; // [rsp+870h] [rbp-1E8h]
  __int64 v389; // [rsp+880h] [rbp-1D8h]
  __int64 v390; // [rsp+888h] [rbp-1D0h]
  __int64 v391; // [rsp+890h] [rbp-1C8h]
  __int64 v392; // [rsp+898h] [rbp-1C0h]
  __int64 v393; // [rsp+8A0h] [rbp-1B8h]
  __int64 v394; // [rsp+8A8h] [rbp-1B0h]
  __int64 v395; // [rsp+8B0h] [rbp-1A8h]
  __int64 v396; // [rsp+8B8h] [rbp-1A0h]
  __int64 v397; // [rsp+8C0h] [rbp-198h]
  __int64 v398; // [rsp+8C8h] [rbp-190h]
  __int64 v399; // [rsp+8D0h] [rbp-188h]
  __int64 v400; // [rsp+8D8h] [rbp-180h]
  _QWORD v401[3]; // [rsp+8E0h] [rbp-178h] BYREF
  __m128i v402; // [rsp+8F8h] [rbp-160h]
  __m128i v403; // [rsp+908h] [rbp-150h]
  __m128i v404; // [rsp+918h] [rbp-140h]
  __m128i v405; // [rsp+928h] [rbp-130h]
  __m128i v406; // [rsp+938h] [rbp-120h]
  __m128i v407; // [rsp+948h] [rbp-110h]
  __m128i v408; // [rsp+958h] [rbp-100h]
  __m128i v409; // [rsp+968h] [rbp-F0h]
  __m128i m128_i128; // [rsp+978h] [rbp-E0h]
  __m128i v411; // [rsp+988h] [rbp-D0h]
  __m128i v412; // [rsp+998h] [rbp-C0h]
  __m128i v413; // [rsp+9A8h] [rbp-B0h]
  __m128i v414; // [rsp+9B8h] [rbp-A0h]
  __m128i v415; // [rsp+9C8h] [rbp-90h]
  __m128i v416; // [rsp+9D8h] [rbp-80h]
  __m128i v417; // [rsp+9E8h] [rbp-70h]
  __int64 v418; // [rsp+A00h] [rbp-58h]
  __int64 v419; // [rsp+A08h] [rbp-50h]
  __int64 v420; // [rsp+A10h] [rbp-48h]
  __int64 v421; // [rsp+A18h] [rbp-40h]
  __int64 v422; // [rsp+A20h] [rbp-38h]
  __int64 v423; // [rsp+A28h] [rbp-30h]
  __int64 v424; // [rsp+A38h] [rbp-20h]
  __int64 v425; // [rsp+A40h] [rbp-18h]
  __int64 v426; // [rsp+A48h] [rbp-10h]

  v418 = v18;
  v419 = v17;
  v420 = a6;
  v421 = a5;
  v422 = a1;
  v423 = a2;
  v424 = a3;
  v425 = a4;
  v426 = v14;
  v402 = v29;
  v403 = v28;
  v404 = v27;
  v405 = v26;
  v406 = v25;
  v407 = v24;
  v408 = v23;
  v409 = v22;
  m128_i128 = (__m128i)a14.m128_i128;
  v411 = (__m128i)a13.m128_i128;
  v412 = (__m128i)a12.m128_i128;
  v413 = (__m128i)a11.m128_i128;
  v414 = (__m128i)a10.m128_i128;
  v415 = (__m128i)a9.m128_i128;
  v416 = (__m128i)a8.m128_i128;
  v417 = (__m128i)a7.m128_i128;
  if ( (unsigned __int64)v401 > *(_QWORD *)(v21 + 8) )
  {
    sub_182771FC0(a1, a2, a3: 0);
    v33 = *(_QWORD *)(v21 + 40);
    if ( (unsigned __int64)(v33 + 48) > *(_QWORD *)(v21 + 32) )
    {
      v33 = MEMORY[0x181EAA920](a1: v31, a2: v32, a3: 34101256);
    }
    else
    {
      *(_QWORD *)(v21 + 40) = v33 + 48;
      *(_DWORD *)v33 = 34101256;
      *(_DWORD *)(v33 + 4) = 0;
      *(_QWORD *)(v33 + 8) = 0;
      *(_QWORD *)(v33 + 16) = 0;
      *(_QWORD *)(v33 + 24) = 0;
      *(_QWORD *)(v33 + 32) = 0;
      *(_QWORD *)(v33 + 40) = 0;
    }
    *(_DWORD *)(v33 + 20) = 46923644;
    *(_DWORD *)(v33 + 16) = *(_DWORD *)(v20 + 374343896);
    *(_DWORD *)(v33 + 12) = (unsigned __int64)(v33 - v20) >> 3;
    v401[2] = v33;
    MEMORY[0x18503B9A0](a1: v31, a2: v32, a3: v33, a4: v30, a5: 0);
    if ( *(int *)(v21 + 16) <= 0 )
      sub_18277F280(a1: v35, a2: v36, a3: v34);
    return v417;
  }
  v38 = MEMORY[0x181EB84E0]();
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
  v400 = v16;
  v389 = v19;
  v390 = v41;
  v391 = v42;
  v392 = v43;
  v393 = v44;
  v394 = v39;
  v395 = v40;
  v396 = v15;
  v397 = v45;
  v398 = v46;
  v399 = v38;
  v373 = v29;
  v374 = v28;
  v375 = v27;
  v376 = v26;
  v377 = v25;
  v378 = v24;
  v379 = v23;
  v380 = v22;
  v381 = v47;
  v382 = v48;
  v383 = v49;
  v384 = v50;
  v385 = v51;
  v386 = v52;
  v387 = v53;
  v388 = v54;
  if ( (unsigned __int64)&v371 > *(_QWORD *)(v21 + 8) )
  {
    sub_182771FC0(a1: v39, a2: v40, a3: 0);
    v58 = *(_QWORD *)(v21 + 40);
    if ( (unsigned __int64)(v58 + 40) > *(_QWORD *)(v21 + 32) )
    {
      v58 = MEMORY[0x181EAA920](a1: v56, a2: v57, a3: 35966824);
    }
    else
    {
      *(_QWORD *)(v21 + 40) = v58 + 40;
      *(_DWORD *)v58 = 35966824;
      *(_DWORD *)(v58 + 4) = 0;
      *(_QWORD *)(v58 + 8) = 0;
      *(_QWORD *)(v58 + 16) = 0;
      *(_QWORD *)(v58 + 24) = 0;
      *(_QWORD *)(v58 + 32) = 0;
    }
    *(_DWORD *)(v58 + 20) = 46923644;
    *(_DWORD *)(v58 + 16) = *(_DWORD *)(v20 + 374343896);
    *(_DWORD *)(v58 + 12) = (unsigned __int64)(v58 - v20) >> 3;
    v372 = (_DWORD *)v58;
    MEMORY[0x18503B9A0](a1: v56, a2: v57, a3: v58, a4: v55, a5: 0);
    v61 = (unsigned __int64)v372;
    v372[2] = 7273087;
    if ( (*(_DWORD *)v61 & 2) != 0 )
    {
      v62 = (v61 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v61 & 0xFFFFFFFFFFF80000LL) + ((v61 - v62) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v61 & 0xFFFFFFFFFFF80000LL) + ((v61 - v62) >> 9) + 0x38) = 0;
    }
    if ( *(int *)(v21 + 16) <= 0 )
      sub_18277F280(a1: v59, a2: v60, a3: v61);
    return v388;
  }
  v63 = MEMORY[0x181EB84E0]();
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
  v370 = v16;
  v359 = v19;
  v360 = v66;
  v361 = v67;
  v362 = v68;
  v363 = v69;
  v364 = v64;
  v365 = v65;
  v366 = v15;
  v367 = v70;
  v368 = v71;
  v369 = v63;
  v343 = v29;
  v344 = v28;
  v345 = v27;
  v346 = v26;
  v347 = v25;
  v348 = v24;
  v349 = v23;
  v350 = v22;
  v351 = v72;
  v352 = v73;
  v353 = v74;
  v354 = v75;
  v355 = v76;
  v356 = v77;
  v357 = v78;
  v358 = v79;
  if ( (unsigned __int64)&v341 > *(_QWORD *)(v21 + 8) )
  {
    sub_182771FC0(a1: v64, a2: v65, a3: 0);
    v83 = *(_QWORD *)(v21 + 40);
    if ( (unsigned __int64)(v83 + 40) > *(_QWORD *)(v21 + 32) )
    {
      v83 = MEMORY[0x181EAA920](a1: v81, a2: v82, a3: 34590936);
    }
    else
    {
      *(_QWORD *)(v21 + 40) = v83 + 40;
      *(_DWORD *)v83 = 34590936;
      *(_DWORD *)(v83 + 4) = 0;
      *(_QWORD *)(v83 + 8) = 0;
      *(_QWORD *)(v83 + 16) = 0;
      *(_QWORD *)(v83 + 24) = 0;
      *(_QWORD *)(v83 + 32) = 0;
    }
    *(_DWORD *)(v83 + 20) = 46923644;
    *(_DWORD *)(v83 + 16) = *(_DWORD *)(v20 + 374343896);
    *(_DWORD *)(v83 + 12) = (unsigned __int64)(v83 - v20) >> 3;
    v342 = (_DWORD *)v83;
    MEMORY[0x18503B9A0](a1: v81, a2: v82, a3: v83, a4: v80, a5: 0);
    v86 = (unsigned __int64)v342;
    v342[2] = 7273087;
    if ( (*(_DWORD *)v86 & 2) != 0 )
    {
      v87 = (v86 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v86 & 0xFFFFFFFFFFF80000LL) + ((v86 - v87) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v86 & 0xFFFFFFFFFFF80000LL) + ((v86 - v87) >> 9) + 0x38) = 0;
    }
    if ( *(int *)(v21 + 16) <= 0 )
      sub_18277F280(a1: v84, a2: v85, a3: v86);
    return v358;
  }
  v88 = MEMORY[0x181EB84E0]();
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
  v340 = v16;
  v329 = v19;
  v330 = v91;
  v331 = v92;
  v332 = v93;
  v333 = v94;
  v334 = v89;
  v335 = v90;
  v336 = v15;
  v337 = v95;
  v338 = v96;
  v339 = v88;
  v313 = v29;
  v314 = v28;
  v315 = v27;
  v316 = v26;
  v317 = v25;
  v318 = v24;
  v319 = v23;
  v320 = v22;
  v321 = v97;
  v322 = v98;
  v323 = v99;
  v324 = v100;
  v325 = v101;
  v326 = v102;
  v327 = v103;
  v328 = v104;
  if ( (unsigned __int64)&v311 > *(_QWORD *)(v21 + 8) )
  {
    sub_182771FC0(a1: v89, a2: v90, a3: 0);
    v108 = *(_QWORD *)(v21 + 40);
    if ( (unsigned __int64)(v108 + 40) > *(_QWORD *)(v21 + 32) )
    {
      v108 = MEMORY[0x181EAA920](a1: v106, a2: v107, a3: 35317296);
    }
    else
    {
      *(_QWORD *)(v21 + 40) = v108 + 40;
      *(_DWORD *)v108 = 35317296;
      *(_DWORD *)(v108 + 4) = 0;
      *(_QWORD *)(v108 + 8) = 0;
      *(_QWORD *)(v108 + 16) = 0;
      *(_QWORD *)(v108 + 24) = 0;
      *(_QWORD *)(v108 + 32) = 0;
    }
    *(_DWORD *)(v108 + 20) = 46923644;
    *(_DWORD *)(v108 + 16) = *(_DWORD *)(v20 + 374343896);
    *(_DWORD *)(v108 + 12) = (unsigned __int64)(v108 - v20) >> 3;
    v312 = (_DWORD *)v108;
    MEMORY[0x18503B9A0](a1: v106, a2: v107, a3: v108, a4: v105, a5: 0);
    v111 = (unsigned __int64)v312;
    v312[2] = 7273087;
    if ( (*(_DWORD *)v111 & 2) != 0 )
    {
      v112 = (v111 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v111 & 0xFFFFFFFFFFF80000LL) + ((v111 - v112) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v111 & 0xFFFFFFFFFFF80000LL) + ((v111 - v112) >> 9) + 0x38) = 0;
    }
    if ( *(int *)(v21 + 16) <= 0 )
      sub_18277F280(a1: v109, a2: v110, a3: v111);
    return v328;
  }
  v113 = MEMORY[0x181EB84E0]();
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
  v310 = v16;
  v299 = v19;
  v300 = v116;
  v301 = v117;
  v302 = v118;
  v303 = v119;
  v304 = v114;
  v305 = v115;
  v306 = v15;
  v307 = v120;
  v308 = v121;
  v309 = v113;
  v283 = v29;
  v284 = v28;
  v285 = v27;
  v286 = v26;
  v287 = v25;
  v288 = v24;
  v289 = v23;
  v290 = v22;
  v291 = v122;
  v292 = v123;
  v293 = v124;
  v294 = v125;
  v295 = v126;
  v296 = v127;
  v297 = v128;
  v298 = v129;
  if ( (unsigned __int64)&v281 > *(_QWORD *)(v21 + 8) )
  {
    sub_182771FC0(a1: v114, a2: v115, a3: 0);
    v133 = *(_QWORD *)(v21 + 40);
    if ( (unsigned __int64)(v133 + 48) > *(_QWORD *)(v21 + 32) )
    {
      v133 = MEMORY[0x181EAA920](a1: v131, a2: v132, a3: 34101256);
    }
    else
    {
      *(_QWORD *)(v21 + 40) = v133 + 48;
      *(_DWORD *)v133 = 34101256;
      *(_DWORD *)(v133 + 4) = 0;
      *(_QWORD *)(v133 + 8) = 0;
      *(_QWORD *)(v133 + 16) = 0;
      *(_QWORD *)(v133 + 24) = 0;
      *(_QWORD *)(v133 + 32) = 0;
      *(_QWORD *)(v133 + 40) = 0;
    }
    *(_DWORD *)(v133 + 20) = 46923644;
    *(_DWORD *)(v133 + 16) = *(_DWORD *)(v20 + 374343896);
    *(_DWORD *)(v133 + 12) = (unsigned __int64)(v133 - v20) >> 3;
    v282 = (_DWORD *)v133;
    MEMORY[0x18503B9A0](a1: v131, a2: v132, a3: v133, a4: v130, a5: 0);
    v136 = (unsigned __int64)v282;
    v282[2] = 7273087;
    if ( (*(_DWORD *)v136 & 2) != 0 )
    {
      v137 = (v136 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v136 & 0xFFFFFFFFFFF80000LL) + ((v136 - v137) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v136 & 0xFFFFFFFFFFF80000LL) + ((v136 - v137) >> 9) + 0x38) = 0;
    }
    if ( *(int *)(v21 + 16) <= 0 )
      sub_18277F280(a1: v134, a2: v135, a3: v136);
    return v298;
  }
  v138 = MEMORY[0x181EB84E0]();
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
  v280 = v16;
  v269 = v19;
  v270 = v141;
  v271 = v142;
  v272 = v143;
  v273 = v144;
  v274 = v139;
  v275 = v140;
  v276 = v15;
  v277 = v145;
  v278 = v146;
  v279 = v138;
  v253 = v29;
  v254 = v28;
  v255 = v27;
  v256 = v26;
  v257 = v25;
  v258 = v24;
  v259 = v23;
  v260 = v22;
  v261 = v147;
  v262 = v148;
  v263 = v149;
  v264 = v150;
  v265 = v151;
  v266 = v152;
  v267 = v153;
  v268 = v154;
  if ( (unsigned __int64)&v250 > *(_QWORD *)(v21 + 8) )
  {
    sub_182771FC0(a1: v139, a2: v140, a3: 0);
    v158 = *(_QWORD *)(v21 + 40);
    if ( (unsigned __int64)(v158 + 40) > *(_QWORD *)(v21 + 32) )
    {
      v158 = MEMORY[0x181EAA920](a1: v156, a2: v157, a3: 34150672);
    }
    else
    {
      *(_QWORD *)(v21 + 40) = v158 + 40;
      *(_DWORD *)v158 = 34150672;
      *(_DWORD *)(v158 + 4) = 0;
      *(_QWORD *)(v158 + 8) = 0;
      *(_QWORD *)(v158 + 16) = 0;
      *(_QWORD *)(v158 + 24) = 0;
      *(_QWORD *)(v158 + 32) = 0;
    }
    *(_DWORD *)(v158 + 20) = 46923644;
    *(_DWORD *)(v158 + 16) = *(_DWORD *)(v20 + 374343896);
    *(_DWORD *)(v158 + 12) = (unsigned __int64)(v158 - v20) >> 3;
    v252 = (_DWORD *)v158;
    MEMORY[0x18503B9A0](a1: v156, a2: v157, a3: v158, a4: v155, a5: 0);
    v161 = (unsigned __int64)v252;
    v252[2] = 7273087;
    if ( (*(_DWORD *)v161 & 2) != 0 )
    {
      v162 = (v161 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v161 & 0xFFFFFFFFFFF80000LL) + ((v161 - v162) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v161 & 0xFFFFFFFFFFF80000LL) + ((v161 - v162) >> 9) + 0x38) = 0;
    }
    if ( *(int *)(v21 + 16) <= 0 )
      sub_18277F280(a1: v159, a2: v160, a3: v161);
    return v268;
  }
  v163 = MEMORY[0x181EB84E0]();
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
  v249 = v16;
  v238 = v19;
  v239 = v168;
  v240 = v169;
  v241 = v170;
  v242 = v167;
  v243 = v165;
  v244 = v166;
  v245 = v15;
  v246 = v164;
  v247 = v171;
  v248 = v163;
  v222 = v29;
  v223 = v28;
  v224 = v27;
  v225 = v26;
  v226 = v25;
  v227 = v24;
  v228 = v23;
  v229 = v22;
  v230 = v172;
  v231 = v173;
  v232 = v174;
  v233 = v175;
  v234 = v176;
  v235 = v177;
  v236 = v178;
  v237 = v179;
  if ( (unsigned __int64)v215 <= *(_QWORD *)(v21 + 8) )
  {
    v221 = v167;
    v220 = v164;
    v187 = MEMORY[0x181EB84E0]();
LABEL_77:
    v219 = v187;
    v210 = *(_QWORD *)(v21 + 40);
    if ( (unsigned __int64)(v210 + 40) > *(_QWORD *)(v21 + 32) )
    {
      v210 = MEMORY[0x181EAA920](a1: v189, a2: v190, a3: 34082880);
    }
    else
    {
      *(_QWORD *)(v21 + 40) = v210 + 40;
      *(_DWORD *)v210 = 34082880;
      *(_DWORD *)(v210 + 4) = 0;
      *(_QWORD *)(v210 + 8) = 0;
      *(_QWORD *)(v210 + 16) = 0;
      *(_QWORD *)(v210 + 24) = 0;
      *(_QWORD *)(v210 + 32) = 0;
    }
    *(_DWORD *)(v210 + 20) = 46923644;
    *(_DWORD *)(v210 + 16) = *(_DWORD *)(v20 + 374343896);
    *(_DWORD *)(v210 + 12) = (unsigned __int64)(v210 - v20) >> 3;
    v217 = v210;
    MEMORY[0x18503B9A0](a1: v189, a2: v190, a3: v210, a4: v188, a5: 0);
    v214 = v217;
    *(_DWORD *)(v217 + 8) = 46004603;
    if ( (*(_DWORD *)v214 & 2) != 0 )
      goto LABEL_81;
    while ( 1 )
    {
      v214 = sub_1827697E0(a1: v212, a2: v213, a3: (_DWORD *)v214, a4: v211, a5: (__int64)v251);
LABEL_81:
      v211 = (v214 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v214 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v214 - v211) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v214 & 0xFFFFFFFFFFF80000LL) + ((unsigned __int64)(v214 - v211) >> 9) + 0x38) = 0;
    }
  }
  v221 = v167;
  v220 = v164;
  sub_182771FC0(a1: v165, a2: v166, a3: 0);
  v183 = MEMORY[0x1850130C0](a1: v181, a2: v182, a3: 32, a4: v180, a5: v220);
  v187 = MEMORY[0x1850130C0](a1: v185, a2: v186, a3: v183, a4: v184, a5: v221);
  if ( (v187 & 0x80000000) != 0 )
    goto LABEL_77;
  v191 = *(_QWORD *)(v21 + 40);
  v192 = (v187 + 19LL) & 0x1FFFFFFF8LL;
  if ( v192 >= 0x20000 || (v193 = v191 + v192) > *(_QWORD *)(v21 + 32) )
  {
    v219 = v187;
    v191 = MEMORY[0x181EAA840](a1: 34082368, a2: v190, a3: 34082368, a4: v188, a5: v187);
    v187 = v219;
  }
  else
  {
    *(_QWORD *)(v21 + 40) = v193;
    *(_QWORD *)v191 = 34082368;
    *(_DWORD *)(v191 + 8) = v187;
  }
  v217 = v191;
  v219 = v187;
  MEMORY[0x181EB4960](a1: v187, a2: 0, a3: v20 + 376351544, a4: v191, a5: 0, a6: v191);
  v195 = MEMORY[0x185011920](a1: v221, a2: v20 + 58184720, a3: v219, a4: v194, a5: 0, a6: v217);
  v197 = MEMORY[0x185011920](a1: v220, a2: v20 + 58184744, a3: v195, a4: v196, a5: 0, a6: v217);
  v201 = *(_QWORD *)(v21 + 40);
  if ( (unsigned __int64)(v201 + 40) > *(_QWORD *)(v21 + 32) )
  {
    v218 = v197;
    v201 = MEMORY[0x181EAA920](a1: v199, a2: v200, a3: 34150672);
  }
  else
  {
    *(_QWORD *)(v21 + 40) = v201 + 40;
    *(_DWORD *)v201 = 34150672;
    *(_DWORD *)(v201 + 4) = 0;
    *(_QWORD *)(v201 + 8) = 0;
    *(_QWORD *)(v201 + 16) = 0;
    *(_QWORD *)(v201 + 24) = 0;
    *(_QWORD *)(v201 + 32) = 0;
  }
  v216 = (unsigned int *)v201;
  *(_DWORD *)(v201 + 20) = 46923644;
  *(_DWORD *)(v201 + 16) = *(_DWORD *)(v20 + 374343896);
  *(_DWORD *)(v201 + 12) = (unsigned __int64)(v201 - v20) >> 3;
  v202 = MEMORY[0x18503B9A0](a1: v199, a2: v200, a3: v201, a4: v198, a5: 0);
  v205 = *(_QWORD *)(v21 + 40);
  if ( (unsigned __int64)(v205 + 24) > *(_QWORD *)(v21 + 32) )
  {
    v215[2] = v202;
    v206 = MEMORY[0x181EAA920](a1: v203, a2: v204, a3: 34082680);
  }
  else
  {
    *(_QWORD *)(v21 + 40) = v205 + 24;
    *(_DWORD *)v205 = 34082680;
    *(_DWORD *)(v205 + 4) = 0;
    *(_QWORD *)(v205 + 8) = 0;
    *(_QWORD *)(v205 + 16) = 0;
    v206 = v205;
  }
  v207 = (unsigned __int64)v216;
  *(_DWORD *)(v206 + 4) = (unsigned __int64)(v217 - v20) >> 3;
  *(_DWORD *)(v207 + 8) = (unsigned __int64)(v206 - v20) >> 3;
  v208 = *(unsigned int *)v207;
  if ( (v208 & 2) != 0 )
  {
    v209 = (v207 & 0xFFFFFFFFFFF80000LL) + 2112;
    v208 = (v207 - v209) >> 9;
    if ( *(_BYTE *)((v207 & 0xFFFFFFFFFFF80000LL) + v208 + 0x38) != 0 )
      *(_BYTE *)((v207 & 0xFFFFFFFFFFF80000LL) + ((v207 - v209) >> 9) + 0x38) = 0;
  }
  if ( *(int *)(v21 + 16) <= 0 )
    sub_18277F280(a1: v203, a2: v204, a3: v208);
  return v237;
}
