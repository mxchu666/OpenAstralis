// sub_18276B120
// rva 0x0276b120  size 637  section .text  group runtime
// window base 0x18276b120: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall sub_18276B120(
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
  __int64 v84; // rdx
  __int64 v85; // rdi
  __int64 v86; // rsi
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
  __int64 v108; // rdi
  __int64 v109; // rsi
  unsigned __int64 v110; // rdx
  unsigned __int64 v111; // rbx
  __int64 v112; // rax
  __int64 v113; // rdx
  __int64 v114; // rdi
  __int64 v115; // rsi
  __int64 v116; // r11
  __int64 v117; // r10
  __int64 v118; // r9
  __int64 v119; // r8
  __int64 v120; // rcx
  __m128i v121; // xmm7
  __m128i v122; // xmm6
  __m128i v123; // xmm5
  __m128i v124; // xmm4
  __m128i v125; // xmm3
  __m128i v126; // xmm2
  __m128i v127; // xmm1
  __m128i v128; // xmm0
  __int64 v129; // rdi
  __int64 v130; // rsi
  __int64 v131; // rdi
  __int64 v132; // rsi
  __int64 v133; // rdx
  __int64 v134; // rdi
  __int64 v135; // rsi
  unsigned __int64 v136; // rcx
  unsigned __int64 v137; // rdx
  unsigned __int64 v138; // rbp
  __int64 v139; // [rsp-10h] [rbp-768h] BYREF
  unsigned int *v140; // [rsp+0h] [rbp-758h]
  __int64 v141; // [rsp+8h] [rbp-750h]
  unsigned int v142; // [rsp+14h] [rbp-744h]
  __m128i v143; // [rsp+18h] [rbp-740h]
  __m128i v144; // [rsp+28h] [rbp-730h]
  __m128i v145; // [rsp+38h] [rbp-720h]
  __m128i v146; // [rsp+48h] [rbp-710h]
  __m128i v147; // [rsp+58h] [rbp-700h]
  __m128i v148; // [rsp+68h] [rbp-6F0h]
  __m128i v149; // [rsp+78h] [rbp-6E0h]
  __m128i v150; // [rsp+88h] [rbp-6D0h]
  __m128i v151; // [rsp+98h] [rbp-6C0h]
  __m128i v152; // [rsp+A8h] [rbp-6B0h]
  __m128i v153; // [rsp+B8h] [rbp-6A0h]
  __m128i v154; // [rsp+C8h] [rbp-690h]
  __m128i v155; // [rsp+D8h] [rbp-680h]
  __m128i v156; // [rsp+E8h] [rbp-670h]
  __m128i v157; // [rsp+F8h] [rbp-660h]
  __m128i v158; // [rsp+108h] [rbp-650h]
  __int64 v159; // [rsp+118h] [rbp-640h]
  __int64 v160; // [rsp+120h] [rbp-638h]
  __int64 v161; // [rsp+128h] [rbp-630h]
  __int64 v162; // [rsp+130h] [rbp-628h]
  __int64 v163; // [rsp+138h] [rbp-620h]
  __int64 v164; // [rsp+140h] [rbp-618h]
  __int64 v165; // [rsp+148h] [rbp-610h]
  __int64 v166; // [rsp+150h] [rbp-608h]
  __int64 v167; // [rsp+158h] [rbp-600h]
  __int64 v168; // [rsp+160h] [rbp-5F8h]
  __int64 v169; // [rsp+168h] [rbp-5F0h]
  __int64 v170; // [rsp+170h] [rbp-5E8h]
  __int64 v171; // [rsp+178h] [rbp-5E0h] BYREF
  _DWORD *v172; // [rsp+188h] [rbp-5D0h]
  __m128i v173; // [rsp+190h] [rbp-5C8h]
  __m128i v174; // [rsp+1A0h] [rbp-5B8h]
  __m128i v175; // [rsp+1B0h] [rbp-5A8h]
  __m128i v176; // [rsp+1C0h] [rbp-598h]
  __m128i v177; // [rsp+1D0h] [rbp-588h]
  __m128i v178; // [rsp+1E0h] [rbp-578h]
  __m128i v179; // [rsp+1F0h] [rbp-568h]
  __m128i v180; // [rsp+200h] [rbp-558h]
  __m128i v181; // [rsp+210h] [rbp-548h]
  __m128i v182; // [rsp+220h] [rbp-538h]
  __m128i v183; // [rsp+230h] [rbp-528h]
  __m128i v184; // [rsp+240h] [rbp-518h]
  __m128i v185; // [rsp+250h] [rbp-508h]
  __m128i v186; // [rsp+260h] [rbp-4F8h]
  __m128i v187; // [rsp+270h] [rbp-4E8h]
  __m128i v188; // [rsp+280h] [rbp-4D8h]
  __int64 v189; // [rsp+290h] [rbp-4C8h]
  __int64 v190; // [rsp+298h] [rbp-4C0h]
  __int64 v191; // [rsp+2A0h] [rbp-4B8h]
  __int64 v192; // [rsp+2A8h] [rbp-4B0h]
  __int64 v193; // [rsp+2B0h] [rbp-4A8h]
  __int64 v194; // [rsp+2B8h] [rbp-4A0h]
  __int64 v195; // [rsp+2C0h] [rbp-498h]
  __int64 v196; // [rsp+2C8h] [rbp-490h]
  __int64 v197; // [rsp+2D0h] [rbp-488h]
  __int64 v198; // [rsp+2D8h] [rbp-480h]
  __int64 v199; // [rsp+2E0h] [rbp-478h]
  __int64 v200; // [rsp+2E8h] [rbp-470h]
  __int64 v201; // [rsp+2F0h] [rbp-468h] BYREF
  __int64 v202; // [rsp+300h] [rbp-458h]
  __m128i v203; // [rsp+308h] [rbp-450h]
  __m128i v204; // [rsp+318h] [rbp-440h]
  __m128i v205; // [rsp+328h] [rbp-430h]
  __m128i v206; // [rsp+338h] [rbp-420h]
  __m128i v207; // [rsp+348h] [rbp-410h]
  __m128i v208; // [rsp+358h] [rbp-400h]
  __m128i v209; // [rsp+368h] [rbp-3F0h]
  __m128i v210; // [rsp+378h] [rbp-3E0h]
  __m128i v211; // [rsp+388h] [rbp-3D0h]
  __m128i v212; // [rsp+398h] [rbp-3C0h]
  __m128i v213; // [rsp+3A8h] [rbp-3B0h]
  __m128i v214; // [rsp+3B8h] [rbp-3A0h]
  __m128i v215; // [rsp+3C8h] [rbp-390h]
  __m128i v216; // [rsp+3D8h] [rbp-380h]
  __m128i v217; // [rsp+3E8h] [rbp-370h]
  __m128i v218; // [rsp+3F8h] [rbp-360h]
  __int64 v219; // [rsp+408h] [rbp-350h]
  __int64 v220; // [rsp+410h] [rbp-348h]
  __int64 v221; // [rsp+418h] [rbp-340h]
  __int64 v222; // [rsp+420h] [rbp-338h]
  __int64 v223; // [rsp+428h] [rbp-330h]
  __int64 v224; // [rsp+430h] [rbp-328h]
  __int64 v225; // [rsp+438h] [rbp-320h]
  __int64 v226; // [rsp+440h] [rbp-318h]
  __int64 v227; // [rsp+448h] [rbp-310h]
  __int64 v228; // [rsp+450h] [rbp-308h]
  __int64 v229; // [rsp+458h] [rbp-300h]
  __int64 v230; // [rsp+460h] [rbp-2F8h]
  __int64 v231; // [rsp+468h] [rbp-2F0h] BYREF
  _DWORD *v232; // [rsp+478h] [rbp-2E0h]
  __m128i v233; // [rsp+480h] [rbp-2D8h]
  __m128i v234; // [rsp+490h] [rbp-2C8h]
  __m128i v235; // [rsp+4A0h] [rbp-2B8h]
  __m128i v236; // [rsp+4B0h] [rbp-2A8h]
  __m128i v237; // [rsp+4C0h] [rbp-298h]
  __m128i v238; // [rsp+4D0h] [rbp-288h]
  __m128i v239; // [rsp+4E0h] [rbp-278h]
  __m128i v240; // [rsp+4F0h] [rbp-268h]
  __m128i v241; // [rsp+500h] [rbp-258h]
  __m128i v242; // [rsp+510h] [rbp-248h]
  __m128i v243; // [rsp+520h] [rbp-238h]
  __m128i v244; // [rsp+530h] [rbp-228h]
  __m128i v245; // [rsp+540h] [rbp-218h]
  __m128i v246; // [rsp+550h] [rbp-208h]
  __m128i v247; // [rsp+560h] [rbp-1F8h]
  __m128i v248; // [rsp+570h] [rbp-1E8h]
  __int64 v249; // [rsp+580h] [rbp-1D8h]
  __int64 v250; // [rsp+588h] [rbp-1D0h]
  __int64 v251; // [rsp+590h] [rbp-1C8h]
  __int64 v252; // [rsp+598h] [rbp-1C0h]
  __int64 v253; // [rsp+5A0h] [rbp-1B8h]
  __int64 v254; // [rsp+5A8h] [rbp-1B0h]
  __int64 v255; // [rsp+5B0h] [rbp-1A8h]
  __int64 v256; // [rsp+5B8h] [rbp-1A0h]
  __int64 v257; // [rsp+5C0h] [rbp-198h]
  __int64 v258; // [rsp+5C8h] [rbp-190h]
  __int64 v259; // [rsp+5D0h] [rbp-188h]
  __int64 v260; // [rsp+5D8h] [rbp-180h]
  __int64 v261; // [rsp+5E0h] [rbp-178h] BYREF
  __int64 v262; // [rsp+5F0h] [rbp-168h]
  __m128i v263; // [rsp+5F8h] [rbp-160h]
  __m128i v264; // [rsp+608h] [rbp-150h]
  __m128i v265; // [rsp+618h] [rbp-140h]
  __m128i v266; // [rsp+628h] [rbp-130h]
  __m128i v267; // [rsp+638h] [rbp-120h]
  __m128i v268; // [rsp+648h] [rbp-110h]
  __m128i v269; // [rsp+658h] [rbp-100h]
  __m128i v270; // [rsp+668h] [rbp-F0h]
  __m128i m128_i128; // [rsp+678h] [rbp-E0h]
  __m128i v272; // [rsp+688h] [rbp-D0h]
  __m128i v273; // [rsp+698h] [rbp-C0h]
  __m128i v274; // [rsp+6A8h] [rbp-B0h]
  __m128i v275; // [rsp+6B8h] [rbp-A0h]
  __m128i v276; // [rsp+6C8h] [rbp-90h]
  __m128i v277; // [rsp+6D8h] [rbp-80h]
  __m128i v278; // [rsp+6E8h] [rbp-70h]
  __int64 v279; // [rsp+700h] [rbp-58h]
  __int64 v280; // [rsp+708h] [rbp-50h]
  __int64 v281; // [rsp+710h] [rbp-48h]
  __int64 v282; // [rsp+718h] [rbp-40h]
  __int64 v283; // [rsp+720h] [rbp-38h]
  __int64 v284; // [rsp+728h] [rbp-30h]
  __int64 v285; // [rsp+738h] [rbp-20h]
  __int64 v286; // [rsp+740h] [rbp-18h]
  __int64 v287; // [rsp+748h] [rbp-10h]

  v279 = v18;
  v280 = v17;
  v281 = a6;
  v282 = a5;
  v283 = a1;
  v284 = a2;
  v285 = a3;
  v286 = a4;
  v287 = v14;
  v263 = v29;
  v264 = v28;
  v265 = v27;
  v266 = v26;
  v267 = v25;
  v268 = v24;
  v269 = v23;
  v270 = v22;
  m128_i128 = (__m128i)a14.m128_i128;
  v272 = (__m128i)a13.m128_i128;
  v273 = (__m128i)a12.m128_i128;
  v274 = (__m128i)a11.m128_i128;
  v275 = (__m128i)a10.m128_i128;
  v276 = (__m128i)a9.m128_i128;
  v277 = (__m128i)a8.m128_i128;
  v278 = (__m128i)a7.m128_i128;
  if ( (unsigned __int64)&v261 <= *(_QWORD *)(v21 + 8) )
  {
    v38 = MEMORY[0x181EB84E0]();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    v260 = v16;
    v249 = v19;
    v250 = v41;
    v251 = v42;
    v252 = v43;
    v253 = v44;
    v254 = v39;
    v255 = v40;
    v256 = v15;
    v257 = v45;
    v258 = v46;
    v259 = v38;
    v233 = v29;
    v234 = v28;
    v235 = v27;
    v236 = v26;
    v237 = v25;
    v238 = v24;
    v239 = v23;
    v240 = v22;
    v241 = v47;
    v242 = v48;
    v243 = v49;
    v244 = v50;
    v245 = v51;
    v246 = v52;
    v247 = v53;
    v248 = v54;
    if ( (unsigned __int64)&v231 <= *(_QWORD *)(v21 + 8) )
    {
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
      v230 = v16;
      v219 = v19;
      v220 = v66;
      v221 = v67;
      v222 = v68;
      v223 = v69;
      v224 = v64;
      v225 = v65;
      v226 = v15;
      v227 = v70;
      v228 = v71;
      v229 = v63;
      v203 = v29;
      v204 = v28;
      v205 = v27;
      v206 = v26;
      v207 = v25;
      v208 = v24;
      v209 = v23;
      v210 = v22;
      v211 = v72;
      v212 = v73;
      v213 = v74;
      v214 = v75;
      v215 = v76;
      v216 = v77;
      v217 = v78;
      v218 = v79;
      if ( (unsigned __int64)&v201 <= *(_QWORD *)(v21 + 8) )
      {
        v87 = MEMORY[0x181EB84E0]();
        __builtin_debugtrap();
        __builtin_debugtrap();
        __builtin_debugtrap();
        v200 = v16;
        v189 = v19;
        v190 = v90;
        v191 = v91;
        v192 = v92;
        v193 = v93;
        v194 = v88;
        v195 = v89;
        v196 = v15;
        v197 = v94;
        v198 = v95;
        v199 = v87;
        v173 = v29;
        v174 = v28;
        v175 = v27;
        v176 = v26;
        v177 = v25;
        v178 = v24;
        v179 = v23;
        v180 = v22;
        v181 = v96;
        v182 = v97;
        v183 = v98;
        v184 = v99;
        v185 = v100;
        v186 = v101;
        v187 = v102;
        v188 = v103;
        if ( (unsigned __int64)&v171 <= *(_QWORD *)(v21 + 8) )
        {
          v112 = MEMORY[0x181EB84E0]();
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
          v170 = v16;
          v159 = v19;
          v160 = v116;
          v161 = v117;
          v162 = v118;
          v163 = v119;
          v164 = v114;
          v165 = v115;
          v166 = v15;
          v167 = v113;
          v168 = v120;
          v169 = v112;
          v143 = v29;
          v144 = v28;
          v145 = v27;
          v146 = v26;
          v147 = v25;
          v148 = v24;
          v149 = v23;
          v150 = v22;
          v151 = v121;
          v152 = v122;
          v153 = v123;
          v154 = v124;
          v155 = v125;
          v156 = v126;
          v157 = v127;
          v158 = v128;
          if ( (unsigned __int64)&v139 <= *(_QWORD *)(v21 + 8) )
          {
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
            return sub_18276BEE0();
          }
          else
          {
            v142 = v113;
            sub_182771FC0(a1: v114, a2: v115, a3: 0);
            v141 = MEMORY[0x184F8C700](a1: v129, a2: v130, a3: v142);
            v133 = *(_QWORD *)(v21 + 40);
            if ( (unsigned __int64)(v133 + 40) > *(_QWORD *)(v21 + 32) )
            {
              v133 = MEMORY[0x181EAA920](a1: v131, a2: v132, a3: 36108448);
            }
            else
            {
              *(_QWORD *)(v21 + 40) = v133 + 40;
              *(_DWORD *)v133 = 36108448;
              *(_DWORD *)(v133 + 4) = 0;
              *(_QWORD *)(v133 + 8) = 0;
              *(_QWORD *)(v133 + 16) = 0;
              *(_QWORD *)(v133 + 24) = 0;
              *(_QWORD *)(v133 + 32) = 0;
            }
            *(_DWORD *)(v133 + 20) = 46923644;
            *(_DWORD *)(v133 + 16) = *(_DWORD *)(v20 + 374343896);
            *(_DWORD *)(v133 + 12) = (unsigned __int64)(v133 - v20) >> 3;
            v140 = (unsigned int *)v133;
            MEMORY[0x18503B9A0](a1: v131, a2: v132, a3: v133, a4: v133, a5: 0);
            v136 = (unsigned __int64)v140;
            v140[2] = (unsigned __int64)(v141 - v20) >> 3;
            v137 = *(unsigned int *)v136;
            if ( (v137 & 2) != 0 )
            {
              v138 = (v136 & 0xFFFFFFFFFFF80000LL) + 2112;
              v137 = (v136 - v138) >> 9;
              if ( *(_BYTE *)((v136 & 0xFFFFFFFFFFF80000LL) + v137 + 0x38) != 0 )
                *(_BYTE *)((v136 & 0xFFFFFFFFFFF80000LL) + ((v136 - v138) >> 9) + 0x38) = 0;
            }
            if ( *(int *)(v21 + 16) <= 0 )
              sub_18277F280(a1: v134, a2: v135, a3: v137);
            return v136;
          }
        }
        else
        {
          sub_182771FC0(a1: v88, a2: v89, a3: 0);
          v107 = *(_QWORD *)(v21 + 40);
          if ( (unsigned __int64)(v107 + 40) > *(_QWORD *)(v21 + 32) )
          {
            v107 = MEMORY[0x181EAA920](a1: v105, a2: v106, a3: 34171952);
          }
          else
          {
            *(_QWORD *)(v21 + 40) = v107 + 40;
            *(_DWORD *)v107 = 34171952;
            *(_DWORD *)(v107 + 4) = 0;
            *(_QWORD *)(v107 + 8) = 0;
            *(_QWORD *)(v107 + 16) = 0;
            *(_QWORD *)(v107 + 24) = 0;
            *(_QWORD *)(v107 + 32) = 0;
          }
          *(_DWORD *)(v107 + 20) = 46923644;
          *(_DWORD *)(v107 + 16) = *(_DWORD *)(v20 + 374343896);
          *(_DWORD *)(v107 + 12) = (unsigned __int64)(v107 - v20) >> 3;
          v172 = (_DWORD *)v107;
          MEMORY[0x18503B9A0](a1: v105, a2: v106, a3: v107, a4: v104, a5: 0);
          v110 = (unsigned __int64)v172;
          v172[2] = 44883198;
          if ( (*(_DWORD *)v110 & 2) != 0 )
          {
            v111 = (v110 & 0xFFFFFFFFFFF80000LL) + 2112;
            if ( *(_BYTE *)((v110 & 0xFFFFFFFFFFF80000LL) + ((v110 - v111) >> 9) + 0x38) != 0 )
              *(_BYTE *)((v110 & 0xFFFFFFFFFFF80000LL) + ((v110 - v111) >> 9) + 0x38) = 0;
          }
          if ( *(int *)(v21 + 16) <= 0 )
            sub_18277F280(a1: v108, a2: v109, a3: v110);
          return v110;
        }
      }
      else
      {
        sub_182771FC0(a1: v64, a2: v65, a3: 0);
        v83 = *(_QWORD *)(v21 + 40);
        if ( (unsigned __int64)(v83 + 40) > *(_QWORD *)(v21 + 32) )
        {
          v83 = MEMORY[0x181EAA920](a1: v81, a2: v82, a3: 34150672);
        }
        else
        {
          *(_QWORD *)(v21 + 40) = v83 + 40;
          *(_DWORD *)v83 = 34150672;
          *(_DWORD *)(v83 + 4) = 0;
          *(_QWORD *)(v83 + 8) = 0;
          *(_QWORD *)(v83 + 16) = 0;
          *(_QWORD *)(v83 + 24) = 0;
          *(_QWORD *)(v83 + 32) = 0;
        }
        *(_DWORD *)(v83 + 20) = 46923644;
        *(_DWORD *)(v83 + 16) = *(_DWORD *)(v20 + 374343896);
        *(_DWORD *)(v83 + 12) = (unsigned __int64)(v83 - v20) >> 3;
        v202 = v83;
        MEMORY[0x18503B9A0](a1: v81, a2: v82, a3: v83, a4: v80, a5: 0);
        if ( *(int *)(v21 + 16) <= 0 )
          sub_18277F280(a1: v85, a2: v86, a3: v84);
        return v202;
      }
    }
    else
    {
      sub_182771FC0(a1: v39, a2: v40, a3: 0);
      v58 = *(_QWORD *)(v21 + 40);
      if ( (unsigned __int64)(v58 + 40) > *(_QWORD *)(v21 + 32) )
      {
        v58 = MEMORY[0x181EAA920](a1: v56, a2: v57, a3: 34171952);
      }
      else
      {
        *(_QWORD *)(v21 + 40) = v58 + 40;
        *(_DWORD *)v58 = 34171952;
        *(_DWORD *)(v58 + 4) = 0;
        *(_QWORD *)(v58 + 8) = 0;
        *(_QWORD *)(v58 + 16) = 0;
        *(_QWORD *)(v58 + 24) = 0;
        *(_QWORD *)(v58 + 32) = 0;
      }
      *(_DWORD *)(v58 + 20) = 46923644;
      *(_DWORD *)(v58 + 16) = *(_DWORD *)(v20 + 374343896);
      *(_DWORD *)(v58 + 12) = (unsigned __int64)(v58 - v20) >> 3;
      v232 = (_DWORD *)v58;
      MEMORY[0x18503B9A0](a1: v56, a2: v57, a3: v58, a4: v55, a5: 0);
      v61 = (unsigned __int64)v232;
      v232[2] = 45110288;
      if ( (*(_DWORD *)v61 & 2) != 0 )
      {
        v62 = (v61 & 0xFFFFFFFFFFF80000LL) + 2112;
        if ( *(_BYTE *)((v61 & 0xFFFFFFFFFFF80000LL) + ((v61 - v62) >> 9) + 0x38) != 0 )
          *(_BYTE *)((v61 & 0xFFFFFFFFFFF80000LL) + ((v61 - v62) >> 9) + 0x38) = 0;
      }
      if ( *(int *)(v21 + 16) <= 0 )
        sub_18277F280(a1: v59, a2: v60, a3: v61);
      return v61;
    }
  }
  else
  {
    sub_182771FC0(a1, a2, a3: 0);
    v33 = *(_QWORD *)(v21 + 40);
    if ( (unsigned __int64)(v33 + 40) > *(_QWORD *)(v21 + 32) )
    {
      v33 = MEMORY[0x181EAA920](a1: v31, a2: v32, a3: 35317296);
    }
    else
    {
      *(_QWORD *)(v21 + 40) = v33 + 40;
      *(_DWORD *)v33 = 35317296;
      *(_DWORD *)(v33 + 4) = 0;
      *(_QWORD *)(v33 + 8) = 0;
      *(_QWORD *)(v33 + 16) = 0;
      *(_QWORD *)(v33 + 24) = 0;
      *(_QWORD *)(v33 + 32) = 0;
    }
    *(_DWORD *)(v33 + 20) = 46923644;
    *(_DWORD *)(v33 + 16) = *(_DWORD *)(v20 + 374343896);
    *(_DWORD *)(v33 + 12) = (unsigned __int64)(v33 - v20) >> 3;
    v262 = v33;
    MEMORY[0x18503B9A0](a1: v31, a2: v32, a3: v33, a4: v30, a5: 0);
    if ( *(int *)(v21 + 16) <= 0 )
      sub_18277F280(a1: v35, a2: v36, a3: v34);
    return v262;
  }
}
