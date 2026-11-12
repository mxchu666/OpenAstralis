// sub_181EB5100
// rva 0x01eb5100  size 5040  section .text  group runtime
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall sub_181EB5100(__int64 a1, __int64 a2, _DWORD *a3, __int64 a4, int a5, int a6, char a7)
{
  unsigned __int64 v7; // rbp
  __int64 v8; // r13
  __int64 v9; // r14
  __int64 v10; // r15
  int v11; // eax
  __int64 v12; // rbx
  __int64 v13; // rsi
  __int64 v14; // r8
  __int64 v15; // r9
  __int64 v16; // rdi
  __int64 v17; // r10
  __int64 v18; // rcx
  int v19; // eax
  int v20; // r8d
  _DWORD *v21; // r9
  unsigned __int64 v22; // rsi
  unsigned __int64 i; // rcx
  unsigned int v24; // r9d
  unsigned int v25; // r10d
  __int64 v26; // rcx
  __int64 v27; // rcx
  __int64 v28; // r9
  __int64 v29; // rcx
  __int64 v30; // r9
  __int64 v31; // rbx
  unsigned __int64 v32; // rdi
  __int64 v33; // rsi
  __int64 v34; // r12
  __int64 v35; // rcx
  unsigned __int64 v36; // rdx
  __int64 v37; // r9
  unsigned __int64 m; // r9
  __int64 v39; // rdx
  int *v40; // rdx
  char *v41; // r10
  __int64 v42; // rsi
  __int64 v43; // rax
  unsigned __int64 v44; // rsi
  unsigned __int64 v45; // rdx
  __int64 v46; // r8
  unsigned __int64 v47; // r9
  unsigned __int64 v48; // rcx
  __int64 v49; // rax
  unsigned __int64 j; // rdi
  unsigned __int64 v51; // rbp
  char *v52; // rbp
  unsigned __int64 v53; // rbp
  char *v54; // rdi
  __int64 v55; // rax
  _DWORD *v56; // rcx
  __int64 v57; // r8
  unsigned int v58; // r8d
  __int64 v59; // rsi
  int v60; // eax
  _DWORD *v61; // r9
  unsigned int v63; // ebp
  _DWORD *v64; // rax
  _DWORD *v65; // rdx
  unsigned __int64 v66; // r12
  __int64 v67; // r8
  unsigned __int64 v68; // rax
  unsigned __int64 v69; // r9
  unsigned __int64 v70; // rcx
  __int64 v71; // rcx
  unsigned __int64 v72; // r9
  __int64 v73; // rdx
  unsigned __int64 v74; // rcx
  __int64 v75; // rdi
  unsigned __int64 v76; // rsi
  __int64 v77; // rax
  __int64 k; // rcx
  __int64 v79; // rdx
  _DWORD *v80; // rbx
  unsigned int v81; // edx
  __int64 v82; // rcx
  int v83; // r12d
  signed int v84; // r12d
  __int64 v85; // rdx
  unsigned __int64 v86; // rcx
  __int64 v87; // rcx
  __int64 v88; // rsi
  __int64 v89; // rcx
  __int64 v90; // rax
  __int64 v91; // rdi
  __int64 v92; // rsi
  __int64 v93; // rcx
  char v94; // bl
  __int64 v95; // rsi
  __int64 v96; // rcx
  __int64 v97; // rdx
  _DWORD *v98; // rbx
  unsigned int v99; // edx
  __int64 v100; // rcx
  int v101; // r9d
  signed int v102; // r9d
  __int64 v103; // rdx
  unsigned __int64 v104; // rax
  __int64 v105; // rcx
  __int64 v106; // rsi
  __int64 v107; // rcx
  __int64 v108; // rax
  __int64 v109; // rsi
  __int64 v110; // rdx
  unsigned int v111; // ebx
  _DWORD *v112; // rbp
  int v113; // edx
  int v114; // edx
  __int64 v115; // rax
  __int64 v116; // rdx
  unsigned __int64 v117; // rdx
  __int64 v118; // rdx
  unsigned __int64 v119; // rdx
  __int64 v120; // rdx
  unsigned __int64 v121; // rdx
  __int64 v122; // rdx
  unsigned __int64 v123; // rdx
  unsigned __int64 v124; // rax
  unsigned __int64 v125; // rax
  unsigned __int64 v126; // rax
  unsigned __int64 v127; // rbx
  unsigned __int64 v128; // rbx
  unsigned __int64 v129; // rbx
  unsigned __int64 v130; // rbx
  char v131; // [rsp+0h] [rbp-B8h] BYREF
  unsigned int v132; // [rsp+Ch] [rbp-ACh]
  _DWORD *v133; // [rsp+10h] [rbp-A8h]
  __int64 v134; // [rsp+18h] [rbp-A0h]
  _DWORD *v135; // [rsp+20h] [rbp-98h]
  __int64 v136; // [rsp+28h] [rbp-90h]
  __int64 v137; // [rsp+30h] [rbp-88h]
  int v138; // [rsp+3Ch] [rbp-7Ch]
  _DWORD *v139; // [rsp+40h] [rbp-78h]
  __int64 v140; // [rsp+48h] [rbp-70h]
  __int64 v141; // [rsp+50h] [rbp-68h]
  int *v142; // [rsp+58h] [rbp-60h]
  __int64 v143; // [rsp+60h] [rbp-58h]
  __int64 v144; // [rsp+68h] [rbp-50h]
  char *v145; // [rsp+70h] [rbp-48h]
  __int64 v146; // [rsp+78h] [rbp-40h]
  int v147; // [rsp+84h] [rbp-34h]
  unsigned int v148; // [rsp+88h] [rbp-30h]
  int v149; // [rsp+8Ch] [rbp-2Ch]
  unsigned int v150; // [rsp+90h] [rbp-28h]
  unsigned int v151; // [rsp+94h] [rbp-24h]
  __int64 v152; // [rsp+98h] [rbp-20h]
  __int64 v153; // [rsp+A0h] [rbp-18h]
  __int64 v154; // [rsp+A8h] [rbp-10h]
  __int64 v155; // [rsp+B0h] [rbp-8h]

  v139 = a3;
  if ( (unsigned __int64)&v131 <= *(_QWORD *)(v10 + 8) )
  {
    v11 = sub_181EB84E0(a1, a2, (_DWORD)a3, a4, a5, a6, a7: v131);
    goto LABEL_85;
  }
  v11 = *(_DWORD *)(v9 + 374343896);
  if ( a3 == (_DWORD *)v9 )
  {
LABEL_85:
    v73 = *(_QWORD *)(v10 + 40);
    if ( (unsigned __int64)(v73 + 48) > *(_QWORD *)(v10 + 32) )
    {
      v138 = v11;
      v73 = sub_181EAA920(a1, a2, a3: 34101256);
      v11 = v138;
    }
    else
    {
      *(_QWORD *)(v10 + 40) = v73 + 48;
      *(_DWORD *)v73 = 34101256;
      *(_DWORD *)(v73 + 4) = 0;
      *(_QWORD *)(v73 + 8) = 0;
      *(_QWORD *)(v73 + 16) = 0;
      *(_QWORD *)(v73 + 24) = 0;
      *(_QWORD *)(v73 + 32) = 0;
      *(_QWORD *)(v73 + 40) = 0;
    }
    *(_DWORD *)(v73 + 20) = 46923644;
    *(_DWORD *)(v73 + 16) = v11;
    *(_DWORD *)(v73 + 12) = (unsigned __int64)(v73 - v9) >> 3;
    v137 = v73;
    MEMORY[0x18503B9A0](a1, a2, a3: v73, a4, a5: 0);
    v77 = v137;
    goto LABEL_88;
  }
  v12 = *a3 >> 3;
  v7 = *(unsigned int *)(v9 + 8 * v12 + 12);
  v13 = v9 + 8 * v7;
  v14 = 34082680;
  v15 = 36519448;
  v16 = 34082368;
  v17 = 34082880;
  if ( (unsigned __int16)*(_DWORD *)(v9
                                   + 8LL * *(unsigned int *)(v9 + 8 * v12 + 20)
                                   + 4LL
                                   * (*(_DWORD *)(v9 + 8 * v12 + 44) & (0x569u >> HIBYTE(*(_DWORD *)(v9 + 8 * v12 + 44))))
                                   + 12) != 1385 )
    goto LABEL_89;
  v18 = (unsigned int)*(char *)(v9 + 8 * v12 + 68);
  v137 = v9 + 8 * v12;
  if ( (_DWORD)v18 == 1 )
  {
    if ( (_DWORD)v7 != 0 )
    {
      v96 = v9 + 8 * v7;
      v153 = 36519448;
      v152 = 34082680;
      v136 = v96;
    }
    else
    {
      v153 = 36519448;
      v152 = 34082680;
      v136 = v9 + 8 * v7;
      v96 = v9 + 353301280;
    }
    v97 = *(unsigned int *)(v96 + 4);
    v98 = (_DWORD *)(v9 + 58178264);
    if ( (_DWORD)v97 == 0 )
    {
LABEL_182:
      MEMORY[0x182771080](a1: v16, a2: v13, a3: v97, a4: v96, a5: v14, a6: v15);
LABEL_183:
      MEMORY[0x182771080](a1: v16, a2: v13);
      goto LABEL_184;
    }
    v99 = *(_DWORD *)(v9 + 8 * v97 + 8);
    if ( v99 != 0 )
    {
      LODWORD(v7) = *(char *)(v96 + 12);
      v134 = v96;
      v100 = (unsigned int)v7;
      v101 = (v99 >> v7) + 57;
      if ( v101 < 0 )
      {
        v148 = v7;
        v118 = *(_QWORD *)(v10 + 40);
        if ( (unsigned __int64)(v118 + 40) > *(_QWORD *)(v10 + 32) )
        {
          v147 = v101;
          v138 = v11;
          v118 = sub_181EAA920(a1: 34082368, a2: v13, a3: 34082880);
          v11 = v138;
        }
        else
        {
          *(_QWORD *)(v10 + 40) = v118 + 40;
          *(_DWORD *)v118 = 34082880;
          *(_DWORD *)(v118 + 4) = 0;
          *(_QWORD *)(v118 + 8) = 0;
          *(_QWORD *)(v118 + 16) = 0;
          *(_QWORD *)(v118 + 24) = 0;
          *(_QWORD *)(v118 + 32) = 0;
          v147 = v101;
        }
        *(_DWORD *)(v118 + 20) = 46923644;
        *(_DWORD *)(v118 + 16) = v11;
        *(_DWORD *)(v118 + 12) = (unsigned __int64)(v118 - v9) >> 3;
        v133 = (_DWORD *)v118;
        MEMORY[0x18503B9A0](a1: v16, a2: v13, a3: v118, a4: v100, a5: 0);
        v119 = (unsigned __int64)v133;
        v133[2] = 46004603;
        if ( (*(_DWORD *)v119 & 2) != 0 )
        {
          v74 = v119 & 0xFFFFFFFFFFF80000LL;
          v128 = (v119 & 0xFFFFFFFFFFF80000LL) + 2112;
          if ( *(_BYTE *)((v119 & 0xFFFFFFFFFFF80000LL) + ((v119 - v128) >> 9) + 0x38) != 0 )
            *(_BYTE *)((v119 & 0xFFFFFFFFFFF80000LL) + ((v119 - v128) >> 9) + 0x38) = 0;
          v77 = v119;
        }
        else
        {
          v77 = v119;
        }
        goto LABEL_88;
      }
      v102 = v101 << v7;
      if ( v102 < 0 )
      {
        v147 = v102;
        v148 = v7;
        v122 = *(_QWORD *)(v10 + 40);
        if ( (unsigned __int64)(v122 + 40) > *(_QWORD *)(v10 + 32) )
        {
          v138 = v11;
          v122 = sub_181EAA920(a1: 34082368, a2: v13, a3: 34082880);
          v11 = v138;
        }
        else
        {
          *(_QWORD *)(v10 + 40) = v122 + 40;
          *(_DWORD *)v122 = 34082880;
          *(_DWORD *)(v122 + 4) = 0;
          *(_QWORD *)(v122 + 8) = 0;
          *(_QWORD *)(v122 + 16) = 0;
          *(_QWORD *)(v122 + 24) = 0;
          *(_QWORD *)(v122 + 32) = 0;
        }
        *(_DWORD *)(v122 + 20) = 46923644;
        *(_DWORD *)(v122 + 16) = v11;
        *(_DWORD *)(v122 + 12) = (unsigned __int64)(v122 - v9) >> 3;
        v133 = (_DWORD *)v122;
        MEMORY[0x18503B9A0](a1: v16, a2: v13, a3: v122, a4: v100, a5: 0);
        v123 = (unsigned __int64)v133;
        v133[2] = 46004603;
        if ( (*(_DWORD *)v123 & 2) == 0 )
        {
          v77 = v123;
          goto LABEL_88;
        }
        v74 = v123 & 0xFFFFFFFFFFF80000LL;
        v130 = (v123 & 0xFFFFFFFFFFF80000LL) + 2112;
        if ( *(_BYTE *)((v123 & 0xFFFFFFFFFFF80000LL) + ((v123 - v130) >> 9) + 0x38) != 0 )
        {
          *(_BYTE *)((v123 & 0xFFFFFFFFFFF80000LL) + ((v123 - v130) >> 9) + 0x38) = 0;
          v77 = v123;
          goto LABEL_88;
        }
        goto LABEL_176;
      }
      v103 = *(_QWORD *)(v10 + 40);
      v104 = ((unsigned int)v102 + 19LL) & 0x1FFFFFFF8LL;
      if ( v104 >= 0x20000 || (v124 = v103 + v104) > *(_QWORD *)(v10 + 32) )
      {
        v147 = v102;
        v148 = v7;
        v133 = (_DWORD *)(v9 + 58178264);
        v103 = sub_181EAA840(a1: 34082368, a2: v13, a3: 34082368, a4: (unsigned int)v7, a5: v102);
        LODWORD(v7) = v148;
        v98 = v133;
      }
      else
      {
        *(_QWORD *)(v10 + 40) = v124;
        *(_QWORD *)v103 = 34082368;
        *(_DWORD *)(v103 + 8) = v102;
        v147 = v102;
      }
      v148 = v7;
      v133 = (_DWORD *)v103;
      MEMORY[0x184FF2C40](a1: (unsigned int)v7, a2: v13, a3: v98, a4: v100, a5: v103, a6: 0);
      MEMORY[0x184FF2C40](a1: v148, a2: v106, a3: v134, a4: v105, a5: v133, a6: 57);
      v155 = v8;
      v151 = v148;
      v150 = 0;
      v154 = v8;
      v135 = v133;
      v149 = 0;
    }
    else
    {
      v114 = *(unsigned __int8 *)(v9 + 58178277);
      v151 = 0;
      v150 = 736818001;
      v135 = (_DWORD *)(v9 + 376658104);
      v149 = v114;
    }
    v107 = *(_QWORD *)(v10 + 40);
    if ( (unsigned __int64)(v107 + 40) > *(_QWORD *)(v10 + 32) )
    {
      v107 = sub_181EAA920(a1: v16, a2: v13, a3: v153);
    }
    else
    {
      *(_QWORD *)(v10 + 40) = v107 + 40;
      *(_DWORD *)v107 = 36519448;
      *(_DWORD *)(v107 + 4) = 0;
      *(_QWORD *)(v107 + 8) = 0;
      *(_QWORD *)(v107 + 16) = 0;
      *(_QWORD *)(v107 + 24) = 0;
      *(_QWORD *)(v107 + 32) = 0;
    }
    v133 = (_DWORD *)v107;
    *(_DWORD *)(v107 + 20) = 46923644;
    *(_DWORD *)(v107 + 16) = *(_DWORD *)(v9 + 374343896);
    *(_DWORD *)(v107 + 12) = (unsigned __int64)(v107 - v9) >> 3;
    v108 = MEMORY[0x18503B9A0](a1: v16, a2: v13, a3: v107, a4: v107, a5: 0);
    v110 = *(_QWORD *)(v10 + 40);
    if ( (unsigned __int64)(v110 + 24) > *(_QWORD *)(v10 + 32) )
    {
      v134 = v108;
      v110 = sub_181EAA920(a1: v75, a2: v109, a3: v152);
    }
    else
    {
      *(_QWORD *)(v10 + 40) = v110 + 24;
      *(_DWORD *)v110 = 34082680;
      *(_DWORD *)(v110 + 4) = 0;
      *(_QWORD *)(v110 + 8) = 0;
      *(_QWORD *)(v110 + 16) = 0;
    }
    v76 = (unsigned __int64)v133;
    v74 = v151;
    v111 = v150;
    v112 = v135;
    *(_BYTE *)(v110 + 13) = v149;
    *(_BYTE *)(v110 + 12) = v74;
    *(_DWORD *)(v110 + 8) = v111;
    v7 = ((unsigned __int64)v112 - v9) >> 3;
    *(_DWORD *)(v110 + 4) = v7;
    *(_DWORD *)(v76 + 8) = (unsigned __int64)(v110 - v9) >> 3;
    if ( (*(_DWORD *)v76 & 2) != 0 )
    {
      v126 = (v76 & 0xFFFFFFFFFFF80000LL) + 2112;
      v74 = (v76 - v126) >> 9;
      if ( *(_BYTE *)((v76 & 0xFFFFFFFFFFF80000LL) + v74 + 0x38) != 0 )
        *(_BYTE *)((v76 & 0xFFFFFFFFFFF80000LL) + ((v76 - v126) >> 9) + 0x38) = 0;
      v77 = v76;
    }
    else
    {
      v77 = v76;
    }
    goto LABEL_88;
  }
  v132 = v12;
  v19 = *(_DWORD *)(v9 + 8 * v12 + 32);
  v149 = v19;
  v20 = (v19 >> 8) & 0xFFF;
  v150 = v20;
  LODWORD(v7) = v19 < 0;
  v151 = v7;
  if ( v19 >= 0 )
  {
    v21 = *(_DWORD **)(v10 + 40);
    v22 = (unsigned __int64)v21 + (unsigned int)v19;
    if ( v22 > *(_QWORD *)(v10 + 32) )
    {
      v21 = (_DWORD *)sub_181EAA920(a1: (unsigned int)v19, a2: v22, a3: 8 * v12);
      v12 = v132;
    }
    else
    {
      *(_QWORD *)(v10 + 40) = v22;
      *v21 = 8 * v12;
      v21[1] = 0;
      for ( i = 8; (unsigned int)v19 > i; i += 8LL )
        *(_QWORD *)&v21[i / 4] = 0;
    }
    goto LABEL_28;
  }
  v24 = v19 & 0xA0000000;
  if ( (v19 & 0xA0000000) != 0xA0000000 )
  {
    if ( (_DWORD)v18 == 2 )
    {
      v21 = (_DWORD *)sub_181EBCFA0(a1: 34082368, a2: v13, a3, a4: v18, a5: v137, a6: (unsigned int)v149);
      v12 = v132;
LABEL_28:
      v135 = v21;
      v39 = *(int *)(v9 + 8 * v12 + 56);
      v148 = *(_DWORD *)(v9 + 4 * v39);
      v40 = (int *)(v9 + 4 * v39 + 4);
      v146 = 8LL * (int)v148;
      v41 = (char *)v40 + v146;
      v145 = (char *)v40 + v146;
      v42 = (__int64)v139;
      v43 = 4;
      while ( v41 > (char *)v40 )
      {
        v147 = *v40;
        v144 = v40[1];
        v143 = v147;
        v142 = v40 + 2;
        v141 = v147 - v43;
        v140 = v43;
        MEMORY[0x181595860](a1: v43, a2: v141, a3: v42, a4: v141, a5: v43);
        v45 = 4 * v144;
        v46 = v143 + 4 * v144;
        if ( (v144 & 0x3FFFFFFFFFFFFFFFLL) != 0 )
        {
          v47 = v143;
          v48 = (unsigned __int64)v135;
          v49 = (__int64)v139;
          *(_DWORD *)((char *)v135 + v143) = *(_DWORD *)((char *)v139 + v143);
          if ( (*(_DWORD *)v48 & 2) != 0 )
          {
            if ( v48 == v9 )
              JUMPOUT(0x303D3F56FLL);
            if ( (*(_DWORD *)v48 & 1) != 0 )
            {
              v54 = (char *)(v48 - *(_QWORD *)(v48 - 8));
              if ( v48 == v9 )
                JUMPOUT(0x303D3F5B6LL);
              v44 = v48;
              if ( v54[(v47 >> 9) + 48] != 0 )
                v54[(v47 >> 9) + 48] = 0;
            }
            else
            {
              v53 = (v48 & 0xFFFFFFFFFFF80000LL) + 2112;
              v44 = (v48 - v53) >> 9;
              if ( *(_BYTE *)((v48 & 0xFFFFFFFFFFF80000LL) + v44 + 0x38) != 0 )
                *(_BYTE *)((v48 & 0xFFFFFFFFFFF80000LL) + ((v48 - v53) >> 9) + 0x38) = 0;
            }
          }
          for ( j = 4; v45 > j; j += 4LL )
          {
            v44 = v47 + j;
            *(_DWORD *)(v48 + v47 + j) = *(_DWORD *)(v49 + v47 + j);
            if ( (*(_DWORD *)v48 & 2) != 0 )
            {
              if ( v48 == v9 )
                JUMPOUT(0x303D3F4B0LL);
              if ( (*(_DWORD *)v48 & 1) != 0 )
              {
                v52 = (char *)(v48 - *(_QWORD *)(v48 - 8));
                if ( v48 == v9 )
                  JUMPOUT(0x303D3F4EFLL);
                v44 >>= 9;
                if ( v52[v44 + 48] != 0 )
                  v52[v44 + 48] = 0;
              }
              else
              {
                v44 = v48 & 0xFFFFFFFFFFF80000LL;
                v51 = (v48 & 0xFFFFFFFFFFF80000LL) + 2112;
                if ( *(_BYTE *)((v48 & 0xFFFFFFFFFFF80000LL) + ((v48 - v51) >> 9) + 0x38) != 0 )
                  *(_BYTE *)((v48 & 0xFFFFFFFFFFF80000LL) + ((v48 - v51) >> 9) + 0x38) = 0;
              }
            }
          }
          if ( *(int *)(v10 + 16) <= 0 )
            v49 = MEMORY[0x18277F280](a1: j, a2: v44, a3: v45, a4: v48, a5: v46);
          v40 = v142;
          v41 = v145;
          v21 = (_DWORD *)v48;
          v42 = v49;
          v43 = v46;
        }
        else
        {
          v40 = v142;
          if ( *(int *)(v10 + 16) <= 0 )
          {
            v55 = MEMORY[0x18277F280](a1: v141, a2: v44, a3: v142, a4: v135, a5: v46, a6: (unsigned int)v147);
            v41 = v145;
            v21 = v56;
            v42 = v55;
            v43 = v57;
          }
          else
          {
            v41 = v145;
            v21 = v135;
            v42 = (__int64)v139;
            v43 = v143 + 4 * v144;
          }
        }
      }
      v140 = v43;
      if ( v149 < 0 )
        v58 = v150;
      else
        v58 = v149;
      v142 = v40;
      v150 = v58;
      v141 = v58;
      v143 = v58 - v140;
      MEMORY[0x181595860](a1: v140, a2: v143, a3: v139, a4: v21, a5: v140, a6: v21);
      v60 = *(_DWORD *)(v9 + 8LL * v132 + 48);
      v61 = v135;
      if ( v60 != 0 )
        *(_DWORD *)((char *)v135 + v60) = 0;
      if ( v61 != (_DWORD *)v9 )
      {
        *(_DWORD *)((char *)v61 + *(int *)(v9 + 8LL * (*v61 >> 3) + 52)) = 0;
        if ( *(int *)(v10 + 16) <= 0 )
          MEMORY[0x18277F280]();
        return (__int64)v61;
      }
      goto LABEL_120;
    }
    MEMORY[0x1828C1C40](a1: 34082368, a2: v13, a3: v9 + 370049648);
LABEL_176:
    v77 = v123;
    goto LABEL_88;
  }
  v25 = a3[2];
  v26 = *(unsigned int *)(v9 + 8 * v12 + 24);
  if ( (_DWORD)v26 != 0 )
  {
    v12 = v9 + 8 * v26;
    if ( (_DWORD)v26 == 4260190 )
      goto LABEL_119;
    v27 = *(unsigned int *)(v9 + 8 * v26 + 28);
    if ( (_DWORD)v27 == 0 )
    {
LABEL_184:
      MEMORY[0x182771080](a1: v16, a2: v13);
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
      return sub_181EB64C0();
    }
    v26 = *(unsigned int *)(v9 + 8 * v27 + 32);
    if ( (_DWORD)v26 != 0 )
    {
      v28 = *(unsigned int *)(v9 + 8 * v26 + 28);
      if ( (_DWORD)v28 != 0 )
      {
        v24 = *(char *)(v9 + 8 * v28 + 112);
        if ( (v24 & 1) != 0 )
        {
          v29 = v9 + 8 * v26;
          goto LABEL_19;
        }
LABEL_119:
        sub_181EB87C0(a1: v16, a2: v13, a3: v12, a4: v26, a5: v20, a6: v24, a7: v131);
LABEL_120:
        v11 = MEMORY[0x182771080](a1: v146, a2: v59, a3: v142, a4: v148, a5: v150, a6: v145);
LABEL_121:
        for ( k = v9 + 353301280; ; k = v13 )
        {
          v79 = *(unsigned int *)(k + 4);
          v80 = (_DWORD *)(v9 + 58178240);
          if ( (_DWORD)v79 == 0 )
          {
            v136 = v13;
            MEMORY[0x182771080](a1: v16, a2: v13, a3: v79, a4: k, a5: v14, a6: v15);
            goto LABEL_182;
          }
          v81 = *(_DWORD *)(v9 + 8 * v79 + 8);
          if ( v81 != 0 )
          {
            LODWORD(v7) = *(char *)(k + 12);
            v135 = (_DWORD *)k;
            v82 = (unsigned int)v7;
            v83 = (v81 >> v7) + 36;
            if ( v83 < 0 )
            {
              v148 = v7;
              v136 = v13;
              v116 = *(_QWORD *)(v10 + 40);
              if ( (unsigned __int64)(v116 + 40) > *(_QWORD *)(v10 + 32) )
              {
                v147 = v83;
                v138 = v11;
                v116 = sub_181EAA920(a1: v16, a2: v13, a3: v17);
                v11 = v138;
              }
              else
              {
                *(_QWORD *)(v10 + 40) = v116 + 40;
                *(_DWORD *)v116 = 34082880;
                *(_DWORD *)(v116 + 4) = 0;
                *(_QWORD *)(v116 + 8) = 0;
                *(_QWORD *)(v116 + 16) = 0;
                *(_QWORD *)(v116 + 24) = 0;
                *(_QWORD *)(v116 + 32) = 0;
                v147 = v83;
              }
              *(_DWORD *)(v116 + 20) = 46923644;
              *(_DWORD *)(v116 + 16) = v11;
              *(_DWORD *)(v116 + 12) = (unsigned __int64)(v116 - v9) >> 3;
              v133 = (_DWORD *)v116;
              MEMORY[0x18503B9A0](a1: v16, a2: v13, a3: v116, a4: v82, a5: 0, a6: v15);
              v117 = (unsigned __int64)v133;
              v133[2] = 46004603;
              if ( (*(_DWORD *)v117 & 2) != 0 )
              {
                v74 = v117 & 0xFFFFFFFFFFF80000LL;
                v127 = (v117 & 0xFFFFFFFFFFF80000LL) + 2112;
                if ( *(_BYTE *)((v117 & 0xFFFFFFFFFFF80000LL) + ((v117 - v127) >> 9) + 0x38) != 0 )
                  *(_BYTE *)((v117 & 0xFFFFFFFFFFF80000LL) + ((v117 - v127) >> 9) + 0x38) = 0;
                v77 = v117;
              }
              else
              {
                v77 = v117;
              }
              goto LABEL_88;
            }
            v84 = v83 << v7;
            if ( v84 < 0 )
            {
              v147 = v84;
              v148 = v7;
              v136 = v13;
              v120 = *(_QWORD *)(v10 + 40);
              if ( (unsigned __int64)(v120 + 40) > *(_QWORD *)(v10 + 32) )
              {
                v138 = v11;
                v120 = sub_181EAA920(a1: v16, a2: v13, a3: v17);
                v11 = v138;
              }
              else
              {
                *(_QWORD *)(v10 + 40) = v120 + 40;
                *(_DWORD *)v120 = 34082880;
                *(_DWORD *)(v120 + 4) = 0;
                *(_QWORD *)(v120 + 8) = 0;
                *(_QWORD *)(v120 + 16) = 0;
                *(_QWORD *)(v120 + 24) = 0;
                *(_QWORD *)(v120 + 32) = 0;
              }
              *(_DWORD *)(v120 + 20) = 46923644;
              *(_DWORD *)(v120 + 16) = v11;
              *(_DWORD *)(v120 + 12) = (unsigned __int64)(v120 - v9) >> 3;
              v133 = (_DWORD *)v120;
              MEMORY[0x18503B9A0](a1: v16, a2: v13, a3: v120, a4: v82, a5: 0, a6: v15);
              v121 = (unsigned __int64)v133;
              v133[2] = 46004603;
              if ( (*(_DWORD *)v121 & 2) != 0 )
              {
                v74 = v121 & 0xFFFFFFFFFFF80000LL;
                v129 = (v121 & 0xFFFFFFFFFFF80000LL) + 2112;
                if ( *(_BYTE *)((v121 & 0xFFFFFFFFFFF80000LL) + ((v121 - v129) >> 9) + 0x38) != 0 )
                  *(_BYTE *)((v121 & 0xFFFFFFFFFFF80000LL) + ((v121 - v129) >> 9) + 0x38) = 0;
                v77 = v121;
              }
              else
              {
                v77 = v121;
              }
              goto LABEL_88;
            }
            v85 = *(_QWORD *)(v10 + 40);
            v86 = ((unsigned int)v84 + 19LL) & 0x1FFFFFFF8LL;
            if ( v86 >= 0x20000 || (v86 += v85, v86 > *(_QWORD *)(v10 + 32)) )
            {
              v147 = v84;
              v148 = v7;
              v133 = (_DWORD *)(v9 + 58178240);
              v153 = v15;
              v152 = v14;
              v136 = v13;
              v85 = sub_181EAA840(a1: v16, a2: v13, a3: v16, a4: v86, a5: v84);
              LODWORD(v7) = v148;
              v80 = v133;
            }
            else
            {
              *(_QWORD *)(v10 + 40) = v86;
              *(_QWORD *)v85 = v16;
              *(_DWORD *)(v85 + 8) = v84;
              v147 = v84;
              v153 = v15;
              v152 = v14;
              v136 = v13;
            }
            v148 = v7;
            v133 = (_DWORD *)v85;
            MEMORY[0x184FF2C40](a1: (unsigned int)v7, a2: v13, a3: v80, a4: v86, a5: v85, a6: 0);
            MEMORY[0x184FF2C40](a1: v148, a2: v88, a3: v135, a4: v87, a5: v133, a6: 36);
            v155 = v8;
            v150 = v148;
            v151 = 0;
            v154 = v8;
            v137 = (__int64)v133;
            v149 = 0;
          }
          else
          {
            v153 = v15;
            v152 = v14;
            v136 = v13;
            v113 = *(unsigned __int8 *)(v9 + 58178253);
            v150 = 0;
            v151 = 1750608373;
            v137 = v9 + 376658056;
            v149 = v113;
          }
          v89 = *(_QWORD *)(v10 + 40);
          if ( (unsigned __int64)(v89 + 40) > *(_QWORD *)(v10 + 32) )
          {
            v89 = sub_181EAA920(a1: v16, a2: v13, a3: v153);
          }
          else
          {
            *(_QWORD *)(v10 + 40) = v89 + 40;
            *(_DWORD *)v89 = 36519448;
            *(_DWORD *)(v89 + 4) = 0;
            *(_QWORD *)(v89 + 8) = 0;
            *(_QWORD *)(v89 + 16) = 0;
            *(_QWORD *)(v89 + 24) = 0;
            *(_QWORD *)(v89 + 32) = 0;
          }
          v136 = v89;
          *(_DWORD *)(v89 + 20) = 46923644;
          *(_DWORD *)(v89 + 16) = *(_DWORD *)(v9 + 374343896);
          *(_DWORD *)(v89 + 12) = (unsigned __int64)(v89 - v9) >> 3;
          v90 = MEMORY[0x18503B9A0](a1: v16, a2: v13, a3: v89, a4: v89, a5: 0);
          v93 = *(_QWORD *)(v10 + 40);
          if ( (unsigned __int64)(v93 + 24) > *(_QWORD *)(v10 + 32) )
          {
            v133 = (_DWORD *)v90;
            v93 = sub_181EAA920(a1: v91, a2: v92, a3: v152);
          }
          else
          {
            *(_QWORD *)(v10 + 40) = v93 + 24;
            *(_DWORD *)v93 = 34082680;
            *(_DWORD *)(v93 + 4) = 0;
            *(_QWORD *)(v93 + 8) = 0;
            *(_QWORD *)(v93 + 16) = 0;
          }
          v75 = v136;
          v94 = v150;
          LODWORD(v7) = v151;
          v95 = v137;
          *(_BYTE *)(v93 + 13) = v149;
          *(_BYTE *)(v93 + 12) = v94;
          *(_DWORD *)(v93 + 8) = v7;
          v76 = (unsigned __int64)(v95 - v9) >> 3;
          *(_DWORD *)(v93 + 4) = v76;
          *(_DWORD *)(v75 + 8) = (unsigned __int64)(v93 - v9) >> 3;
          v74 = *(unsigned int *)v75;
          if ( (v74 & 2) != 0 )
          {
            v125 = (v75 & 0xFFFFFFFFFFF80000LL) + 2112;
            v74 = (v75 - v125) >> 9;
            if ( *(_BYTE *)((v75 & 0xFFFFFFFFFFF80000LL) + v74 + 0x38) != 0 )
              *(_BYTE *)((v75 & 0xFFFFFFFFFFF80000LL) + ((v75 - v125) >> 9) + 0x38) = 0;
            v77 = v75;
          }
          else
          {
            v77 = v75;
          }
LABEL_88:
          v11 = MEMORY[0x182769900](a1: v75, a2: v76, a3: v77, a4: v74, a5: &a7);
LABEL_89:
          if ( (_DWORD)v7 == 0 )
            goto LABEL_121;
        }
      }
      goto LABEL_183;
    }
  }
  else
  {
    v148 = a3[2];
    MEMORY[0x182771080](a1: 34082368, a2: v13);
  }
  v148 = v25;
  v115 = sub_181EB8B60(a1: v16, a2: v13, a3: v12);
  if ( v115 == v9 )
    goto LABEL_119;
  v29 = v115;
  v19 = v149;
LABEL_19:
  v30 = v29;
  v31 = *(_QWORD *)(v10 + 40);
  v32 = *(_QWORD *)(v10 + 32);
  LODWORD(v35) = *(_DWORD *)(v29 + 32);
  v33 = ((int)v35 >> 8) & 0xFFF;
  v34 = v25;
  v35 = (unsigned __int8)v35;
  v36 = (v33 + ((unsigned __int64)v25 << v35) + 7) & 0xFFFFFFFFFFFFFFF8LL;
  v37 = v30 - v9;
  if ( v36 >= 0x20000 || (v35 = v31 + v36, v31 + v36 > v32) )
  {
    v146 = v25;
    v148 = v25;
    v31 = sub_181EAA840(a1: v32, a2: v33, a3: v37, a4: v35, a5: v25);
    v34 = v146;
    v25 = v148;
    v63 = v149;
    v64 = v139;
  }
  else
  {
    *(_QWORD *)(v10 + 40) = v35;
    *(_QWORD *)v31 = v37;
    *(_DWORD *)(v31 + 8) = v25;
    if ( (v33 & 7) != 0 )
    {
      v146 = v25;
      v148 = v25;
      *(_DWORD *)(v31 + v33) = 0;
      v33 += 4;
    }
    if ( v36 - v33 >= 0x800 )
    {
      v146 = v25;
      v148 = v25;
      memset((void *)(v33 + v31), 0, v36 - v33);
      v32 = v31 + v36;
      v63 = v149;
    }
    else
    {
      for ( m = v33; v36 > m; m += 8LL )
        *(_QWORD *)(v31 + m) = 0;
      v63 = v19;
    }
    v64 = v139;
  }
  if ( v63 >> 29 == 5 )
  {
    v135 = (_DWORD *)v31;
    v148 = v25;
    v66 = 4 * v34;
    v67 = v150;
    v68 = 0;
    v65 = v139;
    while ( v66 > v68 )
    {
      v69 = v67 + v68;
      *(_DWORD *)(v31 + v67 + v68) = *(_DWORD *)((char *)v65 + v67 + v68);
      v68 += 4LL;
      if ( (*(_DWORD *)v31 & 2) != 0 )
      {
        if ( (*(_DWORD *)v31 & 1) != 0 )
        {
          v71 = v31 - *(_QWORD *)(v31 - 8);
          v72 = v69 >> 9;
          if ( *(_BYTE *)(v71 + v72 + 48) != 0 )
            *(_BYTE *)(v71 + v72 + 48) = 0;
        }
        else
        {
          v70 = (v31 & 0xFFFFFFFFFFF80000LL) + 2112;
          if ( *(_BYTE *)((v31 & 0xFFFFFFFFFFF80000LL) + ((v31 - v70) >> 9) + 0x38) != 0 )
            *(_BYTE *)((v31 & 0xFFFFFFFFFFF80000LL) + ((v31 - v70) >> 9) + 0x38) = 0;
        }
      }
    }
  }
  else
  {
    v148 = v25;
    v135 = (_DWORD *)v31;
    MEMORY[0x181596200](a1: 0, a2: v25, a3: v64, a4: v63, a5: 0, a6: v31);
    v31 = (__int64)v135;
    v65 = v139;
  }
  if ( *(int *)(v10 + 16) <= 0 )
    MEMORY[0x18277F280](a1: v32, a2: v33, a3: v65);
  return v31;
}
