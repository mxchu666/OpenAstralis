// Java_sun_security_mscapi_CKeyStore_loadKeysOrCertificateChains
// rva 0x132ba928  size 3137  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_security_mscapi_CKeyStore_loadKeysOrCertificateChains(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        int a6)
{
  __int64 v8; // r12
  __int64 v9; // r14
  __int64 v10; // rax
  __int64 v11; // rdx
  __int64 v12; // rdi
  __int64 v13; // rsi
  __int64 v14; // r8
  __int64 v15; // r9
  __int64 v16; // r15
  __int64 v17; // rax
  __int64 v18; // rdi
  __int64 v19; // rsi
  unsigned int v20; // eax
  __int64 v21; // rdi
  __int64 v22; // rsi
  __int64 v23; // rax
  __int64 v24; // rsi
  __int64 v25; // rsi
  __int64 v26; // rax
  __int64 v27; // rsi
  __int64 v28; // rbx
  __int64 v29; // rsi
  __int64 v30; // rsi
  __int64 v31; // rsi
  __int64 v32; // rbx
  __int64 v33; // rsi
  __int64 v34; // rax
  __int64 v35; // rdi
  __int64 v36; // rsi
  __int64 v37; // r9
  __int64 v38; // rdx
  __int64 v39; // rdi
  __int64 v40; // rsi
  __int64 v41; // rax
  __int64 v42; // rdi
  __int64 v43; // rsi
  __int64 v44; // r8
  __int64 v45; // r9
  __int64 v46; // rdx
  __int64 v47; // rdi
  __int64 v48; // rsi
  __int64 v49; // rax
  __int64 v50; // rdi
  __int64 v51; // rsi
  __int64 v52; // r8
  __int64 v53; // r9
  __int64 v54; // rdx
  __int64 v55; // rdi
  __int64 v56; // rsi
  __int64 v57; // rax
  __int64 v58; // rdx
  __int64 v59; // rdi
  __int64 v60; // rsi
  __int64 v61; // rdx
  __int64 v62; // rdi
  __int64 v63; // rsi
  __int64 v64; // rax
  __int64 v65; // rdi
  __int64 v66; // rsi
  __int64 v67; // r9
  __int64 v68; // rdx
  __int64 v69; // rdi
  __int64 v70; // rsi
  __int64 v71; // rax
  __int64 v72; // rdi
  __int64 v73; // rsi
  __int64 v74; // r8
  __int64 v75; // r9
  __int64 v76; // rdx
  __int64 v77; // rdx
  __int64 v78; // rax
  __int64 v79; // rdi
  __int64 v80; // rsi
  __int64 v81; // r9
  __int64 v82; // rdx
  __int64 v83; // rdi
  __int64 v84; // rsi
  __int64 v85; // rdx
  __int64 v86; // rdi
  __int64 v87; // rsi
  __int64 v88; // rax
  __int64 v89; // rdi
  __int64 v90; // rsi
  __int64 v91; // r8
  __int64 v92; // r9
  __int64 v93; // rdx
  __int64 v94; // rdi
  __int64 v95; // rsi
  __int64 v96; // rax
  __int64 v97; // rdx
  __int64 v98; // rdi
  __int64 v99; // rsi
  __int64 v100; // rax
  __int64 v101; // rdi
  __int64 v102; // rsi
  __int64 v103; // r9
  __int64 v104; // rdx
  __int64 v105; // rdi
  __int64 v106; // rsi
  __int64 v107; // rax
  __int64 v108; // rdi
  __int64 v109; // rsi
  __int64 v110; // r9
  __int64 v111; // rdx
  __int64 v112; // rdi
  __int64 v113; // rsi
  __int64 v114; // rdx
  __int64 v115; // rax
  __int64 v116; // rdi
  __int64 v117; // rsi
  __int64 v118; // r9
  __int64 v119; // rdx
  __int64 v120; // rdi
  __int64 v121; // rsi
  __int64 v122; // rax
  __int64 v123; // rdi
  __int64 v124; // rsi
  __int64 v125; // rax
  __int64 v126; // rdi
  __int64 v127; // rsi
  __int64 v128; // r8
  __int64 v129; // r9
  __int64 v130; // rdx
  __int64 v131; // rdi
  __int64 v132; // rsi
  __int64 v133; // rax
  __int64 v134; // rdx
  __int64 v135; // rdi
  __int64 v136; // rsi
  __int64 i; // r15
  __int64 v138; // r15
  __int64 v139; // rbx
  __int64 v140; // r15
  unsigned int v141; // eax
  int v142; // r8d
  int v143; // r9d
  unsigned int v144; // r13d
  __int64 v145; // rax
  __int64 v146; // rsi
  unsigned int v147; // r13d
  __int64 v148; // rsi
  __int64 v149; // r15
  void (__fastcall *v150)(__int64, __int64, __int64, __int64, _QWORD, _QWORD); // r10
  __int64 v151; // rdi
  __int64 v152; // rsi
  __int64 v153; // rdi
  __int64 v154; // rsi
  __int64 v155; // rax
  __int64 v156; // rdi
  __int64 v157; // rsi
  __int64 v158; // r9
  __int64 v159; // rbx
  __int64 v160; // rdx
  __int64 v161; // rdi
  __int64 v162; // rsi
  __int64 v163; // rax
  __int64 v164; // rdi
  __int64 v165; // rsi
  __int64 v166; // rdx
  __int64 v167; // rdi
  __int64 v168; // rsi
  __int64 v169; // rax
  __int64 v170; // rdi
  __int64 v171; // rsi
  __int64 v172; // r8
  __int64 v173; // r9
  __int64 v174; // rdx
  __int64 v175; // rdi
  __int64 v176; // rsi
  __int64 v177; // rax
  __int64 v178; // rdx
  __int64 v179; // rdi
  __int64 v180; // rsi
  unsigned int v181; // eax
  __int64 v182; // rdi
  __int64 v183; // rsi
  unsigned int v184; // ebx
  __int64 v185; // rax
  __int64 v186; // rsi
  __int64 v187; // rdi
  __int64 v188; // rsi
  __int64 v189; // rax
  __int64 v190; // rsi
  __int64 v191; // rdi
  __int64 v192; // rsi
  __int64 v193; // rcx
  __int64 v194; // rsi
  int v195; // r13d
  __int64 v196; // rdi
  __int64 v197; // rsi
  __int64 v198; // rdi
  __int64 v199; // rsi
  __int64 v200; // rax
  __int64 v201; // rdi
  __int64 v202; // rsi
  __int64 v203; // r9
  __int64 v204; // rdi
  unsigned int v205; // ebx
  __int64 v206; // rdx
  __int64 v207; // rdi
  __int64 v208; // rsi
  __int64 v209; // rax
  __int64 v210; // rdi
  __int64 v211; // rsi
  __int64 v212; // r9
  __int64 v213; // rdx
  __int64 v214; // rdi
  __int64 v215; // rsi
  __int64 v216; // rax
  __int64 v217; // rdi
  __int64 v218; // rsi
  __int64 v219; // r8
  __int64 v220; // r9
  __int64 v221; // rdx
  __int64 v222; // rdi
  __int64 v223; // rsi
  __int64 v224; // rax
  __int64 v225; // rdx
  __int64 v226; // rdi
  __int64 v227; // rsi
  __int64 v228; // rax
  __int64 v229; // rdi
  __int64 v230; // rsi
  __int64 v231; // r9
  __int64 v232; // rdx
  __int64 v233; // rdi
  __int64 v234; // rsi
  __int64 v235; // rax
  __int64 v236; // rdi
  __int64 v237; // rsi
  __int64 v238; // r8
  __int64 v239; // r9
  __int64 v240; // rdx
  __int64 v241; // rdi
  __int64 v242; // rsi
  __int64 v243; // rax
  __int64 v244; // rdi
  __int64 v245; // rsi
  __int64 v246; // r8
  __int64 v247; // r9
  __int64 v248; // rdx
  __int64 v249; // rdi
  __int64 v250; // rsi
  __int64 v251; // rax
  __int64 v252; // rdx
  __int64 v253; // rdi
  __int64 v254; // rsi
  __int64 v256[4]; // [rsp+0h] [rbp-188h] BYREF
  int *v257; // [rsp+20h] [rbp-168h]
  int *v258; // [rsp+28h] [rbp-160h]
  __int64 v259; // [rsp+30h] [rbp-158h]
  int v260; // [rsp+38h] [rbp-150h]
  __int64 v261; // [rsp+40h] [rbp-148h]
  __int64 v262; // [rsp+50h] [rbp-138h]
  int *v263; // [rsp+58h] [rbp-130h] BYREF
  int v264; // [rsp+60h] [rbp-128h] BYREF
  int v265; // [rsp+64h] [rbp-124h]
  unsigned int v266; // [rsp+68h] [rbp-120h] BYREF
  __int64 v267; // [rsp+70h] [rbp-118h]
  int v268; // [rsp+78h] [rbp-110h]
  int v269; // [rsp+7Ch] [rbp-10Ch] BYREF
  int v270; // [rsp+80h] [rbp-108h] BYREF
  int v271; // [rsp+84h] [rbp-104h]
  __int64 v272; // [rsp+88h] [rbp-100h] BYREF
  __int64 v273; // [rsp+90h] [rbp-F8h]
  __int64 v274; // [rsp+98h] [rbp-F0h]
  __int64 v275; // [rsp+A0h] [rbp-E8h]
  __int64 *v276; // [rsp+A8h] [rbp-E0h]
  _DWORD v277[2]; // [rsp+B0h] [rbp-D8h] BYREF
  int v278; // [rsp+B8h] [rbp-D0h] BYREF
  __int64 v279; // [rsp+C0h] [rbp-C8h]
  __int64 v280; // [rsp+C8h] [rbp-C0h]
  __int64 v281; // [rsp+D0h] [rbp-B8h]
  __int64 v282; // [rsp+D8h] [rbp-B0h]
  __int64 v283; // [rsp+E0h] [rbp-A8h]
  __int64 v284; // [rsp+E8h] [rbp-A0h]
  int *v285; // [rsp+F0h] [rbp-98h]
  __int64 v286; // [rsp+F8h] [rbp-90h]
  __int64 v287; // [rsp+100h] [rbp-88h]
  __int64 v288; // [rsp+108h] [rbp-80h]
  __int64 v289; // [rsp+110h] [rbp-78h]
  __int64 v290; // [rsp+118h] [rbp-70h]
  __int64 v291; // [rsp+120h] [rbp-68h]
  _BYTE v292[2]; // [rsp+128h] [rbp-60h] BYREF
  char v293; // [rsp+12Ah] [rbp-5Eh]
  char v294; // [rsp+12Ch] [rbp-5Ch]
  __int64 v295; // [rsp+148h] [rbp-40h]

  v276 = v256;
  v262 = a5;
  v274 = a3;
  v289 = a4;
  v290 = a5;
  v267 = 0;
  v8 = 0;
  v280 = 0;
  v275 = 0;
  v9 = 0;
  v281 = 0;
  v10 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 1352LL))(
          a1: a4,
          a2: a5,
          a3: a5,
          a4,
          a5: 0);
  v16 = v10;
  v267 = v10;
  if ( v10 != 0 )
  {
    if ( a6 != 0 )
    {
      if ( a6 != 1 )
      {
        if ( MEMORY[0x337780] != 0 )
        {
          v228 = MEMORY[0x79BF8](a1: v12, a2: 1, a3: v11, a4: 1);
          sub_19329DCC0(
            a1: v229,
            a2: v230,
            a3: 545760,
            a4: v228,
            a5: 454,
            a6: v231,
            a7: v256[0],
            a8: v256[1],
            a9: v256[2],
            a10: v256[3]);
          v235 = MEMORY[0x79BF8](a1: v233, a2: v234, a3: v232, a4: (unsigned int)v234);
          sub_19329DCC0(
            a1: v236,
            a2: v237,
            a3: 545776,
            a4: v235,
            a5: v238,
            a6: v239,
            a7: v256[0],
            a8: v256[1],
            a9: v256[2],
            a10: v256[3]);
          v243 = MEMORY[0x79BF8](a1: v241, a2: v242, a3: v240, a4: (unsigned int)v242);
          sub_19329DCC0(
            a1: v244,
            a2: v245,
            a3: 545496,
            a4: v243,
            a5: v246,
            a6: v247,
            a7: v256[0],
            a8: v256[1],
            a9: v256[2],
            a10: v256[3]);
          v251 = MEMORY[0x79BF8](a1: v249, a2: v250, a3: v248, a4: (unsigned int)v250);
          MEMORY[0x79C20](a1: v253, a2: v254, a3: v252, a4: v251);
        }
LABEL_94:
        v13 = v262;
        goto LABEL_95;
      }
      v257 = (int *)v10;
      v17 = MEMORY[0x79248](a1: v12, a2: 1, a3: 0, a4: 9, a5: 0, a6: 135168);
    }
    else
    {
      v17 = MEMORY[0x79238](a1: v12, a2: v13, a3: v10, a4: 0);
      v19 = 1;
    }
    v280 = v17;
    v8 = v17;
    if ( v17 == 0 )
    {
      v20 = MEMORY[0x79758](a1: v18);
      sub_1932BDD9C(a1: v21, a2: v22, a3: 545816, a4: v21, a5: v20);
      goto LABEL_94;
    }
    v23 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v18 + 48LL))(
            a1: v18,
            a2: v19,
            a3: 545848,
            a4: v18);
    v284 = v23;
    if ( v23 != 0 )
    {
      v283 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)v12 + 264LL))(
               a1: v12,
               a2: v24,
               a3: v23,
               a4: v12,
               a5: 535156,
               a6: 537592);
      if ( v283 != 0 )
      {
        v26 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v12 + 248LL))(
                a1: v12,
                a2: v25,
                a3,
                a4: v12);
        v28 = v26;
        if ( v26 != 0 )
        {
          v286 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)v12 + 264LL))(
                   a1: v12,
                   a2: v27,
                   a3: v26,
                   a4: v12,
                   a5: 545904,
                   a6: 545872);
          if ( v286 != 0 )
          {
            v288 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)v12 + 264LL))(
                     a1: v12,
                     a2: v29,
                     a3: v28,
                     a4: v12,
                     a5: 545976,
                     a6: 545928);
            if ( v288 != 0 )
            {
              v279 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)v12 + 264LL))(
                       a1: v12,
                       a2: v30,
                       a3: v28,
                       a4: v12,
                       a5: 546056,
                       a6: 546008);
              if ( v279 != 0 )
              {
                v32 = v275;
                while ( 1 )
                {
                  v32 = MEMORY[0x79210](a1: v12, a2: v31, a3: v32, a4: v8);
                  v275 = v32;
                  v291 = v32;
                  if ( v32 == 0 )
                  {
LABEL_93:
                    v16 = v267;
                    goto LABEL_94;
                  }
                  if ( MEMORY[0x337780] != 0 )
                  {
                    v34 = MEMORY[0x79BF8](a1: v12, a2: v33, a3: v11, a4: (unsigned int)v33);
                    sub_19329DCC0(
                      a1: v35,
                      a2: v36,
                      a3: 545760,
                      a4: v34,
                      a5: 508,
                      a6: v37,
                      a7: v256[0],
                      a8: v256[1],
                      a9: v256[2],
                      a10: v256[3]);
                    v41 = MEMORY[0x79BF8](a1: v39, a2: v40, a3: v38, a4: (unsigned int)v40);
                    sub_19329DCC0(
                      a1: v42,
                      a2: v43,
                      a3: 546088,
                      a4: v41,
                      a5: v44,
                      a6: v45,
                      a7: v256[0],
                      a8: v256[1],
                      a9: v256[2],
                      a10: v256[3]);
                    v49 = MEMORY[0x79BF8](a1: v47, a2: v48, a3: v46, a4: (unsigned int)v48);
                    sub_19329DCC0(
                      a1: v50,
                      a2: v51,
                      a3: 545496,
                      a4: v49,
                      a5: v52,
                      a6: v53,
                      a7: v256[0],
                      a8: v256[1],
                      a9: v256[2],
                      a10: v256[3]);
                    v57 = MEMORY[0x79BF8](a1: v55, a2: v56, a3: v54, a4: (unsigned int)v56);
                    MEMORY[0x79C20](a1: v59, a2: v60, a3: v58, a4: v57);
                  }
                  v263 = nullptr;
                  v266 = 0;
                  v272 = 0;
                  v264 = 0;
                  v268 = 0;
                  v265 = 0;
                  v258 = &v264;
                  v257 = (int *)&v266;
                  if ( (unsigned int)MEMORY[0x79220](a1: v12, a2: v33, a3: 65600, a4: v32, a5: 0, a6: &v263) == 0
                    && (unsigned int)MEMORY[0x79758](a1: v62) != -2146893790 )
                  {
                    break;
                  }
                  if ( v264 == (_DWORD)v63 )
                  {
                    if ( v266 == -1 )
                      sub_1932CA305(a1: v62, a2: v63, a3: v61, a4: v263);
                    else
                      MEMORY[0x790F0](a1: v62, a2: v63, a3: 0, a4: v263);
                    v264 = 0;
                  }
                  v258 = &v264;
                  v257 = (int *)&v266;
                  if ( (unsigned int)MEMORY[0x79220](a1: v62, a2: v63, a3: 0x10000, a4: v32, a5: 0, a6: &v263) != 0 )
                  {
                    if ( v266 == -1 )
                    {
                      if ( MEMORY[0x337780] != 0 )
                      {
                        v100 = MEMORY[0x79BF8](a1: v62, a2: v63, a3: v266, a4: (unsigned int)v63);
                        sub_19329DCC0(
                          a1: v101,
                          a2: v102,
                          a3: 545760,
                          a4: v100,
                          a5: 548,
                          a6: v103,
                          a7: v256[0],
                          a8: v256[1],
                          a9: v256[2],
                          a10: v256[3]);
                        v107 = MEMORY[0x79BF8](a1: v105, a2: v106, a3: v104, a4: (unsigned int)v106);
                        sub_19329DCC0(
                          a1: v108,
                          a2: v109,
                          a3: 546184,
                          a4: v107,
                          a5: (__int64)v263,
                          a6: v110,
                          a7: v256[0],
                          a8: v256[1],
                          a9: v256[2],
                          a10: v256[3]);
                        goto LABEL_41;
                      }
                      goto LABEL_42;
                    }
                    if ( (unsigned int)MEMORY[0x79130](a1: v62, a2: v63, a3: v266, a4: v263, a5: &v272) != 0 )
                    {
                      v277[0] = 2;
                      MEMORY[0x79110](a1: v12, a2: v31, a3: 4, a4: v272, a5: v277);
                      if ( MEMORY[0x337780] != 0 )
                      {
                        v115 = MEMORY[0x79BF8](a1: v62, a2: v63, a3: v114, a4: (unsigned int)v63);
                        sub_19329DCC0(
                          a1: v116,
                          a2: v117,
                          a3: 545760,
                          a4: v115,
                          a5: 563,
                          a6: v118,
                          a7: v256[0],
                          a8: v256[1],
                          a9: v256[2],
                          a10: v256[3]);
                        v122 = MEMORY[0x79BF8](a1: v120, a2: v121, a3: v119, a4: (unsigned int)v121);
                        sub_19329DCC0(
                          a1: v123,
                          a2: v124,
                          a3: 546200,
                          a4: v122,
                          a5: (__int64)v263,
                          a6: v272,
                          a7: v256[0],
                          a8: v256[1],
                          a9: v256[2],
                          a10: v256[3]);
LABEL_41:
                        v125 = MEMORY[0x79BF8](a1: v112, a2: v113, a3: v111, a4: (unsigned int)v113);
                        sub_19329DCC0(
                          a1: v126,
                          a2: v127,
                          a3: 545496,
                          a4: v125,
                          a5: v128,
                          a6: v129,
                          a7: v256[0],
                          a8: v256[1],
                          a9: v256[2],
                          a10: v256[3]);
                        v133 = MEMORY[0x79BF8](a1: v131, a2: v132, a3: v130, a4: (unsigned int)v132);
                        MEMORY[0x79C20](a1: v135, a2: v136, a3: v134, a4: v133);
                      }
LABEL_42:
                      v265 = MEMORY[0x79200](a1: v62, a2: v63, a3: *(_QWORD *)(v32 + 24) + 96LL, a4: 65537);
                      goto LABEL_43;
                    }
                    if ( v264 != 0 )
                      MEMORY[0x790F0](a1: v12, a2: v31, a3: 0, a4: v263);
                  }
                  else
                  {
                    if ( MEMORY[0x337780] != 0 )
                    {
                      v78 = MEMORY[0x79BF8](a1: v62, a2: v63, a3: v77, a4: (unsigned int)v63);
                      sub_19329DCC0(
                        a1: v79,
                        a2: v80,
                        a3: 545760,
                        a4: v78,
                        a5: 542,
                        a6: v81,
                        a7: v256[0],
                        a8: v256[1],
                        a9: v256[2],
                        a10: v256[3]);
                      v71 = MEMORY[0x79BF8](a1: v83, a2: v84, a3: v82, a4: (unsigned int)v84);
                      v76 = 546152;
                      goto LABEL_30;
                    }
LABEL_31:
                    v268 = v63;
LABEL_43:
                    v282 = 0;
                    if ( sub_1932BA600(a1: v62, a2: v63, a3: v32) )
                    {
                      for ( i = 0; ; i = (unsigned int)(v31 + v271) )
                      {
                        v271 = i;
                        if ( (unsigned int)i >= *(_DWORD *)(v282 + 12) )
                          break;
                        v138 = *(_QWORD *)(*(_QWORD *)(v282 + 16) + 8 * i);
                        v287 = v138;
                        v273 = sub_1932BA5D8(
                                 a1: v12,
                                 a2: v31,
                                 a3: v284,
                                 a4: v12,
                                 a5: v283,
                                 a6: v15,
                                 a7: v256[0],
                                 a8: v256[1],
                                 a9: v256[2],
                                 a10: v256[3]);
                        if ( v273 == 0 )
                          goto LABEL_93;
                        if ( v9 != 0 )
                        {
                          sub_1932C97D0(a1: v12, a2: v31, a3: v11, a4: v9);
                          v9 = 0;
                          v281 = 0;
                        }
                        v139 = 0;
                        while ( 1 )
                        {
                          v277[1] = v139;
                          if ( (unsigned int)v139 >= *(_DWORD *)(v138 + 12) )
                            break;
                          v140 = *(_QWORD *)(*(_QWORD *)(*(_QWORD *)(v138 + 16) + 8 * v139) + 8LL);
                          if ( (_DWORD)v139 == 0 )
                          {
                            LODWORD(v258) = 0;
                            v257 = nullptr;
                            v141 = MEMORY[0x79240](a1: v12, a2: v31, a3: 5, a4: v140, a5: 0, a6: 0);
                            v144 = v141;
                            if ( v141 > (unsigned int)v31 )
                            {
                              if ( is_mul_ok(v141, 2u) )
                                JUMPOUT(0x326514F53LL);
                              v145 = sub_1932BE404(a1: v12, a2: v31, a3: v12, a4: -1, a5: v142, a6: v143, a7: v256[0]);
                              v9 = v145;
                              v281 = v145;
                              if ( v145 == 0 )
                                goto LABEL_93;
                              LODWORD(v258) = v144;
                              v257 = (int *)v145;
                              MEMORY[0x79240](a1: v12, a2: v146, a3: 5, a4: v140, a5: 0, a6: 0);
                            }
                          }
                          v285 = *(int **)(v140 + 8);
                          v147 = *(_DWORD *)(v140 + 16);
                          v149 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)v12 + 1408LL))(
                                   a1: v12,
                                   a2: v31,
                                   a3: v147,
                                   a4: v12);
                          if ( v149 == 0 )
                            goto LABEL_93;
                          v150 = *(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)v12 + 1664LL);
                          v257 = v285;
                          v150(a1: v12, a2: v148, a3: v149, a4: v12, a5: 0, a6: v147);
                          v257 = (int *)v273;
                          sub_1932BA5B0(
                            a1: v151,
                            a2: v152,
                            a3: v274,
                            a4: v151,
                            a5: v286,
                            a6: v149,
                            a7: v256[0],
                            a8: v256[1],
                            a9: v256[2],
                            a10: v256[3]);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)v153 + 1824LL))(
                                 a1: v153,
                                 a2: v154,
                                 a3: *(_QWORD *)(*(_QWORD *)v153 + 1824LL),
                                 a4: v153) != 0 )
                            sub_1932CA191(a1: v12, a2: v31, a3: &loc_1932BB546, a4: v276);
                          v139 = (unsigned int)(v31 + v139);
                          v138 = v287;
                        }
                        if ( v9 == 0 )
                          continue;
                        if ( MEMORY[0x337780] != 0 )
                        {
                          v155 = MEMORY[0x79BF8](a1: v12, a2: v31, a3: v11, a4: (unsigned int)v31);
                          sub_19329DCC0(
                            a1: v156,
                            a2: v157,
                            a3: 545760,
                            a4: v155,
                            a5: 654,
                            a6: v158,
                            a7: v256[0],
                            a8: v256[1],
                            a9: v256[2],
                            a10: v256[3]);
                          v159 = *(_QWORD *)(*(_QWORD *)(v275 + 24) + 96LL);
                          v163 = MEMORY[0x79BF8](a1: v161, a2: v162, a3: v160, a4: (unsigned int)v162);
                          sub_19329DCC0(
                            a1: v164,
                            a2: v165,
                            a3: 546236,
                            a4: v163,
                            a5: v9,
                            a6: v159,
                            a7: v256[0],
                            a8: v256[1],
                            a9: v256[2],
                            a10: v256[3]);
                          v169 = MEMORY[0x79BF8](a1: v167, a2: v168, a3: v166, a4: (unsigned int)v168);
                          sub_19329DCC0(
                            a1: v170,
                            a2: v171,
                            a3: 545496,
                            a4: v169,
                            a5: v172,
                            a6: v173,
                            a7: v256[0],
                            a8: v256[1],
                            a9: v256[2],
                            a10: v256[3]);
                          v177 = MEMORY[0x79BF8](a1: v175, a2: v176, a3: v174, a4: (unsigned int)v176);
                          MEMORY[0x79C20](a1: v179, a2: v180, a3: v178, a4: v177);
                        }
                        v181 = MEMORY[0x79CB0](a1: v12, a2: v31, a3: v11, a4: v9);
                        v184 = v181;
                        if ( v268 != 0 )
                        {
                          v185 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)v182 + 1304LL))(
                                   a1: v182,
                                   a2: v183,
                                   a3: v9,
                                   a4: v182,
                                   a5: v181);
                          if ( v185 == 0 )
                            goto LABEL_93;
                          v257 = (int *)v273;
                          sub_1932BA5B0(
                            a1: v12,
                            a2: v186,
                            a3: v274,
                            a4: v12,
                            a5: v288,
                            a6: v185,
                            a7: v256[0],
                            a8: v256[1],
                            a9: v256[2],
                            a10: v256[3]);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)v187 + 1824LL))(
                                 a1: v187,
                                 a2: v188,
                                 a3: *(_QWORD *)(*(_QWORD *)v187 + 1824LL),
                                 a4: v187) == 0 )
                            continue;
                          sub_1932CA191(a1: v12, a2: v31, a3: &loc_1932BB546, a4: v276);
                        }
                        if ( v272 != 0 )
                        {
                          v269 = 41984;
                          v278 = 4;
                          LODWORD(v257) = 0;
                          MEMORY[0x79118](a1: v182, a2: v183, a3: 7, a4: v272, a5: &v269, a6: &v278);
                          if ( (v269 & 0x400) == 0 )
                            continue;
                          v189 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)v12 + 1304LL))(
                                   a1: v12,
                                   a2: v31,
                                   a3: v9,
                                   a4: v12,
                                   a5: v184);
                          if ( v189 == 0 )
                            goto LABEL_93;
                          v261 = v273;
                          v260 = v265;
                          v259 = v272;
                          v258 = v263;
                          v257 = (int *)v189;
                          sub_1932BA5B0(
                            a1: v12,
                            a2: v190,
                            a3: v274,
                            a4: v12,
                            a5: v279,
                            a6: (unsigned int)v190,
                            a7: v256[0],
                            a8: v256[1],
                            a9: v256[2],
                            a10: v256[3]);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)v191 + 1824LL))(
                                 a1: v191,
                                 a2: v192,
                                 a3: *(_QWORD *)(*(_QWORD *)v191 + 1824LL),
                                 a4: v191) == 0 )
                            continue;
                          sub_1932CA191(a1: v12, a2: v31, a3: &loc_1932BB546, a4: v276);
                        }
                        v270 = 0;
                        LODWORD(v258) = 64;
                        v257 = &v270;
                        if ( (unsigned int)sub_1932CA2D5(a1: v182, a2: v183, a3: 546248, a4: v263, a5: v292, a6: 32) != 0 )
                          continue;
                        v193 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)v12 + 1304LL))(
                                 a1: v12,
                                 a2: v31,
                                 a3: v9,
                                 a4: v12,
                                 a5: v184);
                        if ( v193 == 0 )
                          goto LABEL_93;
                        v195 = v265;
                        if ( v292[0] == 69 && v293 == 67 && (v265 == 256 || v265 == 384 || v265 == 521) )
                        {
                          v261 = v273;
                          v260 = v265;
                          v259 = 0;
                          v258 = v263;
                          v257 = (int *)v193;
                          sub_1932BA5B0(
                            a1: v12,
                            a2: v194,
                            a3: v274,
                            a4: v12,
                            a5: v279,
                            a6: 0,
                            a7: v256[0],
                            a8: v256[1],
                            a9: v256[2],
                            a10: v256[3]);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)v196 + 1824LL))(
                                 a1: v196,
                                 a2: v197,
                                 a3: *(_QWORD *)(*(_QWORD *)v196 + 1824LL),
                                 a4: v196) == 0 )
                            continue;
                          sub_1932CA191(a1: v12, a2: v31, a3: &loc_1932BB546, a4: v276);
                        }
                        if ( v292[0] == 82 && v293 == 83 && v294 == 65 )
                        {
                          v261 = v273;
                          v260 = v195;
                          v259 = 0;
                          v258 = v263;
                          v257 = (int *)v193;
                          sub_1932BA5B0(
                            a1: v12,
                            a2: v194,
                            a3: v274,
                            a4: v12,
                            a5: v279,
                            a6: (unsigned int)v194,
                            a7: v256[0],
                            a8: v256[1],
                            a9: v256[2],
                            a10: v256[3]);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)v198 + 1824LL))(
                                 a1: v198,
                                 a2: v199,
                                 a3: *(_QWORD *)(*(_QWORD *)v198 + 1824LL),
                                 a4: v198) == 0 )
                            continue;
                          sub_1932CA191(a1: v12, a2: v31, a3: &loc_1932BB546, a4: v276);
                        }
                        sub_1932BE03C(
                          a1: v12,
                          a2: v194,
                          a3: (unsigned int)v292,
                          a4: 546280,
                          a5: v270,
                          a6: v15,
                          a7: v256[0],
                          a8: v256[1],
                          a9: v256[2]);
                      }
                      MEMORY[0x79228](a1: v12, a2: v31, a3: v11, a4: v282);
                      v32 = v275;
                    }
                    else if ( MEMORY[0x337780] != 0 )
                    {
                      v200 = MEMORY[0x79BF8](a1: v12, a2: v31, a3: v11, a4: (unsigned int)v31);
                      sub_19329DCC0(
                        a1: v201,
                        a2: v202,
                        a3: 545760,
                        a4: v200,
                        a5: 734,
                        a6: v203,
                        a7: v256[0],
                        a8: v256[1],
                        a9: v256[2],
                        a10: v256[3]);
                      v205 = MEMORY[0x79758](a1: v204);
                      v209 = MEMORY[0x79BF8](a1: v207, a2: v208, a3: v206, a4: (unsigned int)v208);
                      sub_19329DCC0(
                        a1: v210,
                        a2: v211,
                        a3: 546320,
                        a4: v209,
                        a5: v205,
                        a6: v212,
                        a7: v256[0],
                        a8: v256[1],
                        a9: v256[2],
                        a10: v256[3]);
                      v216 = MEMORY[0x79BF8](a1: v214, a2: v215, a3: v213, a4: (unsigned int)v215);
                      sub_19329DCC0(
                        a1: v217,
                        a2: v218,
                        a3: 545496,
                        a4: v216,
                        a5: v219,
                        a6: v220,
                        a7: v256[0],
                        a8: v256[1],
                        a9: v256[2],
                        a10: v256[3]);
                      v224 = MEMORY[0x79BF8](a1: v222, a2: v223, a3: v221, a4: (unsigned int)v223);
                      MEMORY[0x79C20](a1: v226, a2: v227, a3: v225, a4: v224);
                      v32 = v275;
                    }
                  }
                }
                if ( MEMORY[0x337780] != 0 )
                {
                  v64 = MEMORY[0x79BF8](a1: v62, a2: v63, a3: v61, a4: (unsigned int)v63);
                  sub_19329DCC0(
                    a1: v65,
                    a2: v66,
                    a3: 545760,
                    a4: v64,
                    a5: 524,
                    a6: v67,
                    a7: v256[0],
                    a8: v256[1],
                    a9: v256[2],
                    a10: v256[3]);
                  v71 = MEMORY[0x79BF8](a1: v69, a2: v70, a3: v68, a4: (unsigned int)v70);
                  v76 = 546120;
LABEL_30:
                  sub_19329DCC0(
                    a1: v72,
                    a2: v73,
                    a3: v76,
                    a4: v71,
                    a5: v74,
                    a6: v75,
                    a7: v256[0],
                    a8: v256[1],
                    a9: v256[2],
                    a10: v256[3]);
                  v88 = MEMORY[0x79BF8](a1: v86, a2: v87, a3: v85, a4: (unsigned int)v87);
                  sub_19329DCC0(
                    a1: v89,
                    a2: v90,
                    a3: 545496,
                    a4: v88,
                    a5: v91,
                    a6: v92,
                    a7: v256[0],
                    a8: v256[1],
                    a9: v256[2],
                    a10: v256[3]);
                  v96 = MEMORY[0x79BF8](a1: v94, a2: v95, a3: v93, a4: (unsigned int)v95);
                  MEMORY[0x79C20](a1: v98, a2: v99, a3: v97, a4: v96);
                  goto LABEL_31;
                }
                goto LABEL_31;
              }
            }
          }
        }
      }
    }
    goto LABEL_94;
  }
LABEL_95:
  if ( v8 != 0 )
    MEMORY[0x79218](a1: v12, a2: v13, a3: 0, a4: v8);
  if ( v16 != 0 )
    (*(void (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)v12 + 1360LL))(
      a1: v12,
      a2: v13,
      a3: v13,
      a4: v12,
      a5: v16);
  if ( v9 != 0 )
    sub_1932C97D0(a1: v12, a2: v13, a3: v11, a4: v9);
  return sub_1932C8DE0(a1: v12, a2: v13, a3: v11, a4: (unsigned __int64)v256 ^ v295, a5: v14, a6: v15);
}
