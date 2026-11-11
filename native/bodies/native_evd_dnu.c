/* ===== chunk 180003D20 .. 18000BC91 ===== */
__int64 __fastcall sub_180003D20(__int64 a1, __int64 a2, __int64 a3, float a4)
{
  __int64 v8; // rdi
  __int64 result; // rax
  __int64 v10; // rax
  __int64 v11; // r15
  __int64 v12; // rax
  __int64 v13; // r15
  __int64 v14; // r14
  __int64 v15; // r12
  __int64 v16; // r14
  __int64 v17; // r14
  _QWORD *v18; // rcx
  _QWORD *v19; // rsi
  __int64 v20; // rcx
  int v21; // r15d
  __int64 v22; // r14
  int v23; // r13d
  __int64 v24; // r14
  __int64 v25; // r14
  __int64 v26; // r14
  __int64 v27; // r14
  __int64 v28; // r14
  __int64 v29; // r14
  __int64 v30; // r14
  __int64 v31; // r14
  __int64 v32; // r14
  __int64 v33; // r14
  __int64 v34; // r14
  __int64 v35; // r14
  __int64 v36; // r14
  __int64 v37; // r14
  __int64 v38; // r14
  __int64 v39; // r14
  __int64 v40; // r14
  __int64 v41; // rbx
  __int64 v42; // r14
  __int64 v43; // r14
  __int64 v44; // rbx
  __int64 v45; // r14
  __int64 v46; // rbx
  __int64 v47; // r14
  __int64 v48; // r14
  __int64 v49; // r14
  __int64 v50; // r14
  __int64 v51; // r14
  __int64 v52; // r14
  unsigned __int8 (__fastcall *v53)(__int64); // rax
  __int64 v54; // r14
  __int64 v55; // r14
  __int64 v56; // r14
  float v57; // xmm0_4
  __int64 v58; // rbx
  __int64 v59; // r8
  float v60; // xmm6_4
  __int64 v61; // r14
  __int64 v62; // r14
  __int64 v63; // r14
  __int64 v64; // r14
  __int64 v65; // r14
  __int64 v66; // r14
  __int64 v67; // r15
  __int64 v68; // r15
  __int64 v69; // r14
  __int64 v70; // r14
  __int64 v71; // r15
  __int64 v72; // r14
  __int64 v73; // r14
  __int64 v74; // r15
  unsigned __int8 v75; // al
  __int64 v76; // r14
  __int64 v77; // rbx
  __int64 v78; // rbx
  unsigned __int8 v79; // al
  __int64 v80; // r15
  __int64 v81; // rdi
  __int64 v82; // r14
  unsigned __int8 (__fastcall *v83)(__int64); // rax
  __int64 v84; // r15
  __int64 v85; // rax
  __int64 v86; // rbx
  __int64 v87; // rax
  __int64 v88; // rbx
  __int64 v89; // rdx
  int v90; // eax
  __int64 v91; // rbx
  __int64 v92; // r13
  __int64 v93; // r15
  __int64 v94; // rbx
  __int64 v95; // rbx
  __int64 v96; // rbx
  __int64 v97; // r14
  __int64 v98; // r13
  __int64 v99; // r14
  __int64 v100; // r14
  __int64 v101; // r14
  __int64 v102; // r14
  __int64 v103; // r14
  __int64 v104; // r14
  __int64 v105; // r14
  __int64 v106; // r14
  __int64 v107; // r14
  __int64 v108; // rbx
  __int64 v109; // r14
  __int64 v110; // r15
  __int64 v111; // r15
  __int64 v112; // r13
  __int64 v113; // r15
  __int64 v114; // r14
  __int64 v115; // r14
  __int64 v116; // r14
  __int64 v117; // r14
  __int64 v118; // r15
  __int64 v119; // r15
  __int64 v120; // r15
  __int64 v121; // r15
  __int64 v122; // r15
  __int64 v123; // rbx
  __int64 v124; // rbx
  __int64 v125; // r14
  __int64 v126; // rbx
  int v127; // [rsp+48h] [rbp-38h]
  int v128; // [rsp+50h] [rbp-30h]
  __int64 v129; // [rsp+70h] [rbp-10h] BYREF
  __int64 v130; // [rsp+78h] [rbp-8h] BYREF
  __int64 v131; // [rsp+80h] [rbp+0h]
  __int64 v132; // [rsp+88h] [rbp+8h] BYREF
  __int64 v133; // [rsp+90h] [rbp+10h] BYREF
  __int64 v134; // [rsp+98h] [rbp+18h] BYREF
  __int64 v135; // [rsp+A0h] [rbp+20h] BYREF
  __int64 v136; // [rsp+A8h] [rbp+28h] BYREF
  __int128 v137; // [rsp+B0h] [rbp+30h] BYREF
  __int128 v138; // [rsp+C0h] [rbp+40h]
  int v139; // [rsp+D0h] [rbp+50h]
  _BYTE v140[24]; // [rsp+D8h] [rbp+58h] BYREF
  __int64 v141[3]; // [rsp+F0h] [rbp+70h] BYREF
  __int64 v142; // [rsp+108h] [rbp+88h] BYREF

  v8 = sub_1800025D0(a1, a2);
  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
  if ( (_BYTE)result == 0 )
  {
    if ( v8 == 0 )
      return (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 144LL))(a1, qword_180116F00 + 8);
    if ( qword_1801170F0 != 0
      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(a1, qword_1801170F0, 0) == 0 )
    {
      goto LABEL_954;
    }
    sub_1800C68B0(&unk_180117020);
    if ( qword_1801170F0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(a1, qword_1801170F0, 0) != 0 )
    {
      v10 = sub_1800023C0(a1);
      if ( v10 != 0 )
      {
        v11 = v10;
        qword_1801170F0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v10);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v11);
      }
    }
    sub_1800C6900(&unk_180117020);
    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
    if ( (_BYTE)result == 0 )
    {
LABEL_954:
      if ( qword_1801170F8 != 0
        && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(a1, qword_1801170F8, 0) == 0 )
      {
        goto LABEL_18;
      }
      sub_1800C68B0(&unk_180117028);
      if ( qword_1801170F8 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(a1, qword_1801170F8, 0) != 0 )
      {
        v12 = sub_1800023C0(a1);
        if ( v12 != 0 )
        {
          v13 = v12;
          qword_1801170F8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v12);
          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v13);
        }
      }
      sub_1800C6900(&unk_180117028);
      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
      if ( (_BYTE)result == 0 )
      {
LABEL_18:
        v142 = 0;
        v135 = 0;
        v130 = 0;
        v133 = 0;
        v129 = 0;
        v131 = 0;
        v132 = 0;
        v136 = 0;
        v138 = 0;
        v137 = 0;
        v139 = 1065353216;
        v134 = a3;
        sub_1800036C0((__int64)v140, (float *)&v137, &v134, &v134);
        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
        if ( (_BYTE)result != 0 )
          goto LABEL_51;
        if ( qword_180117100 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
               a1,
               qword_180117100,
               0) != 0 )
        {
          sub_1800C68B0(&unk_180117030);
          if ( qword_180117100 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                 a1,
                 qword_180117100,
                 0) != 0 )
          {
            v14 = sub_1800023C0(a1);
            if ( v14 != 0 )
            {
              qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v14);
              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v14);
            }
          }
          sub_1800C6900(&unk_180117030);
          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
          if ( (_BYTE)result != 0 )
            goto LABEL_51;
        }
        if ( qword_180117290 == 0 )
        {
          qword_180117290 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL))(
                              a1,
                              qword_180117100,
                              qword_180116F00 + 165,
                              qword_180116F00 + 237);
          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
          if ( (_BYTE)result != 0 )
            goto LABEL_51;
        }
        v142 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1208LL))(a1, qword_180117100);
        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
        if ( (_BYTE)result != 0 )
          goto LABEL_51;
        v130 = 0x676C6E3883DFLL;
        v142 ^= 0x676C6E3883DFuLL;
        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
        if ( (_BYTE)result != 0 )
          goto LABEL_51;
        v15 = v142;
        if ( qword_180117108 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
               a1,
               qword_180117108,
               0) != 0 )
        {
          sub_1800C68B0(&unk_180117038);
          if ( qword_180117108 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                 a1,
                 qword_180117108,
                 0) != 0 )
          {
            v16 = sub_1800023C0(a1);
            if ( v16 != 0 )
            {
              qword_180117108 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v16);
              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v16);
            }
          }
          sub_1800C6900(&unk_180117038);
          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
          if ( (_BYTE)result != 0 )
            goto LABEL_51;
        }
        if ( qword_1801171C0 == 0 )
        {
          qword_1801171C0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                              a1,
                              qword_180117108,
                              qword_180116F00 + 476,
                              qword_180116F00 + 480);
          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
          if ( (_BYTE)result != 0 )
            goto LABEL_51;
        }
        v142 = sub_180002760(a1);
        sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
        if ( (_BYTE)result != 0 )
          goto LABEL_51;
        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
        if ( (_BYTE)result != 0 )
          goto LABEL_51;
        v135 = v134;
        sub_1800036C0((__int64)v140, (float *)&v137, &v135, &v135);
        if ( qword_180117110 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
               a1,
               qword_180117110,
               0) != 0 )
        {
          sub_1800C68B0(&unk_180117040);
          if ( qword_180117110 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                 a1,
                 qword_180117110,
                 0) != 0 )
          {
            v17 = sub_1800023C0(a1);
            if ( v17 != 0 )
            {
              qword_180117110 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v17);
              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v17);
            }
          }
          sub_1800C6900(&unk_180117040);
          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
          if ( (_BYTE)result != 0 )
            goto LABEL_51;
        }
        if ( qword_180117298 == 0 )
        {
          qword_180117298 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 752LL))(
                              a1,
                              qword_180117110,
                              qword_180116F00 + 485,
                              qword_180116F00 + 489);
          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
          if ( (_BYTE)result != 0 )
            goto LABEL_51;
        }
        if ( v135 != 0 )
          LODWORD(v135) = (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 768LL))(
                            a1,
                            v135,
                            qword_180117298);
        else
          sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 491, 93);
        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
        if ( (_BYTE)result != 0 )
          goto LABEL_51;
        v21 = v135;
        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
        if ( (_BYTE)result != 0 )
          goto LABEL_51;
        v136 = v142;
        sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
        if ( (_BYTE)result != 0 )
          goto LABEL_51;
        v142 = v134;
        sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
        if ( qword_180117110 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
               a1,
               qword_180117110,
               0) != 0 )
        {
          sub_1800C68B0(&unk_180117040);
          if ( qword_180117110 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                 a1,
                 qword_180117110,
                 0) != 0 )
          {
            v22 = sub_1800023C0(a1);
            if ( v22 != 0 )
            {
              qword_180117110 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v22);
              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v22);
            }
          }
          sub_1800C6900(&unk_180117040);
          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
          if ( (_BYTE)result != 0 )
            goto LABEL_51;
        }
        if ( qword_1801172A0 == 0 )
        {
          qword_1801172A0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 752LL))(
                              a1,
                              qword_180117110,
                              qword_180116F00 + 512,
                              qword_180116F00 + 489);
          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
          if ( (_BYTE)result != 0 )
            goto LABEL_51;
        }
        if ( v142 != 0 )
          LODWORD(v142) = (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 768LL))(
                            a1,
                            v142,
                            qword_1801172A0);
        else
          sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 491, 93);
        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
        if ( (_BYTE)result != 0 )
          goto LABEL_51;
        v23 = v142;
        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
        if ( (_BYTE)result != 0 )
          goto LABEL_51;
        v142 = v134;
        sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
        if ( qword_180117110 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
               a1,
               qword_180117110,
               0) != 0 )
        {
          sub_1800C68B0(&unk_180117040);
          if ( qword_180117110 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                 a1,
                 qword_180117110,
                 0) != 0 )
          {
            v24 = sub_1800023C0(a1);
            if ( v24 != 0 )
            {
              qword_180117110 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v24);
              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v24);
            }
          }
          sub_1800C6900(&unk_180117040);
          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
          if ( (_BYTE)result != 0 )
            goto LABEL_51;
        }
        if ( qword_1801172A8 == 0 )
        {
          qword_1801172A8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 752LL))(
                              a1,
                              qword_180117110,
                              qword_180116F00 + 516,
                              qword_180116F00 + 489);
          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
          if ( (_BYTE)result != 0 )
            goto LABEL_51;
        }
        if ( v142 != 0 )
          LODWORD(v142) = (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 768LL))(
                            a1,
                            v142,
                            qword_1801172A8);
        else
          sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 491, 93);
        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
        if ( (_BYTE)result != 0 )
          goto LABEL_51;
        v127 = v142;
        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
        if ( (_BYTE)result != 0 )
          goto LABEL_51;
        v142 = v134;
        sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
        if ( qword_180117110 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
               a1,
               qword_180117110,
               0) != 0 )
        {
          sub_1800C68B0(&unk_180117040);
          if ( qword_180117110 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                 a1,
                 qword_180117110,
                 0) != 0 )
          {
            v25 = sub_1800023C0(a1);
            if ( v25 != 0 )
            {
              qword_180117110 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v25);
              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v25);
            }
          }
          sub_1800C6900(&unk_180117040);
          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
          if ( (_BYTE)result != 0 )
            goto LABEL_51;
        }
        if ( qword_1801172B0 == 0 )
        {
          qword_1801172B0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 752LL))(
                              a1,
                              qword_180117110,
                              qword_180116F00 + 520,
                              qword_180116F00 + 489);
          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
          if ( (_BYTE)result != 0 )
            goto LABEL_51;
        }
        if ( v142 != 0 )
          LODWORD(v142) = (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 768LL))(
                            a1,
                            v142,
                            qword_1801172B0);
        else
          sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 491, 93);
        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
        if ( (_BYTE)result != 0 )
          goto LABEL_51;
        v128 = v142;
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
          goto LABEL_109;
        v142 = v136;
        sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
        if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(a1, v142, 0) != 0 )
        {
LABEL_113:
          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
          if ( (_BYTE)result == 0 )
          {
            sub_180026DB0(&v137, &v134);
            sub_180026DB0(&v137, &v136);
            result = sub_180002660(a1, &v137);
          }
          goto LABEL_51;
        }
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
          goto LABEL_109;
        if ( qword_180117100 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
               a1,
               qword_180117100,
               0) != 0 )
        {
          sub_1800C68B0(&unk_180117030);
          if ( qword_180117100 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                 a1,
                 qword_180117100,
                 0) != 0 )
          {
            v28 = sub_1800023C0(a1);
            if ( v28 != 0 )
            {
              qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v28);
              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v28);
            }
          }
          sub_1800C6900(&unk_180117030);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
            goto LABEL_109;
        }
        if ( qword_1801172B8 == 0 )
        {
          qword_1801172B8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL))(
                              a1,
                              qword_180117100,
                              qword_180116F00 + 524,
                              qword_180116F00 + 528);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
            goto LABEL_109;
        }
        v142 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1160LL))(a1, qword_180117100);
        sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
          goto LABEL_109;
        if ( qword_180117118 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
               a1,
               qword_180117118,
               0) != 0 )
        {
          sub_1800C68B0(&unk_180117048);
          if ( qword_180117118 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                 a1,
                 qword_180117118,
                 0) != 0 )
          {
            v30 = sub_1800023C0(a1);
            if ( v30 != 0 )
            {
              qword_180117118 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v30);
              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v30);
            }
          }
          sub_1800C6900(&unk_180117048);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
            goto LABEL_109;
        }
        if ( qword_1801172C0 == 0 )
        {
          qword_1801172C0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 752LL))(
                              a1,
                              qword_180117118,
                              qword_180116F00 + 554,
                              qword_180116F00 + 565);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
            goto LABEL_109;
        }
        if ( v142 != 0 )
        {
          v142 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 760LL))(
                   a1,
                   v142,
                   qword_1801172C0);
          sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
        }
        else
        {
          sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 591, 9);
        }
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
        {
LABEL_109:
          v26 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
          (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
          v142 = v26;
          v141[0] = v26;
          sub_180026960(v140, &v137, v141, v141);
          if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                 a1,
                 v142,
                 qword_1801170F8) == 0 )
            goto LABEL_937;
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
            goto LABEL_167;
          sub_180026DB0(&v137, &v142);
          sub_180026DB0(&v137, &v134);
          sub_180026DB0(&v137, &v136);
          sub_180002660(a1, &v137);
          if ( qword_180117100 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                 a1,
                 qword_180117100,
                 0) != 0 )
          {
            sub_1800C68B0(&unk_180117030);
            if ( qword_180117100 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                   a1,
                   qword_180117100,
                   0) != 0 )
            {
              v27 = sub_1800023C0(a1);
              if ( v27 != 0 )
              {
                qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v27);
                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v27);
              }
            }
            sub_1800C6900(&unk_180117030);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_167;
          }
          if ( qword_1801171C8 == 0 )
          {
            qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                a1,
                                qword_180117100,
                                qword_180116F00 + 165,
                                qword_180116F00 + 611);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_167;
          }
          v142 = sub_180002760(a1);
          sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
            goto LABEL_167;
          v29 = v142;
          if ( v142 != 0 )
          {
            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v142);
            v141[0] = v29;
            sub_180026960(v140, &v137, v141, v141);
          }
          else
          {
            sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 666, 9);
          }
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
            goto LABEL_167;
        }
        else
        {
          if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(a1, v142, 0) != 0 )
          {
LABEL_238:
            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
            if ( (_BYTE)result != 0 )
              goto LABEL_51;
            sub_180026DB0(&v137, &v134);
            sub_180026DB0(&v137, &v136);
            sub_180002660(a1, &v137);
            v142 = v134;
            sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
            LODWORD(v135) = v21;
            if ( qword_180117110 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                   a1,
                   qword_180117110,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117040);
              if ( qword_180117110 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117110,
                     0) != 0 )
              {
                v41 = sub_1800023C0(a1);
                if ( v41 != 0 )
                {
                  qword_180117110 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v41);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v41);
                }
              }
              sub_1800C6900(&unk_180117040);
              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
              if ( (_BYTE)result != 0 )
                goto LABEL_51;
            }
            if ( qword_180117298 == 0 )
            {
              qword_180117298 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 752LL))(
                                  a1,
                                  qword_180117110,
                                  qword_180116F00 + 485,
                                  qword_180116F00 + 489);
              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
              if ( (_BYTE)result != 0 )
                goto LABEL_51;
            }
            if ( v142 != 0 )
              (*(void (__fastcall **)(__int64, __int64, __int64, _QWORD))(*(_QWORD *)a1 + 840LL))(
                a1,
                v142,
                qword_180117298,
                (unsigned __int8)v135);
            else
              sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 1288, 65);
            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
            if ( (_BYTE)result != 0 )
              goto LABEL_51;
            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
            if ( (_BYTE)result != 0 )
              goto LABEL_51;
            v142 = v134;
            sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
            LODWORD(v135) = v23;
            if ( qword_180117110 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                   a1,
                   qword_180117110,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117040);
              if ( qword_180117110 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117110,
                     0) != 0 )
              {
                v44 = sub_1800023C0(a1);
                if ( v44 != 0 )
                {
                  qword_180117110 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v44);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v44);
                }
              }
              sub_1800C6900(&unk_180117040);
              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
              if ( (_BYTE)result != 0 )
                goto LABEL_51;
            }
            if ( qword_1801172A0 == 0 )
            {
              qword_1801172A0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 752LL))(
                                  a1,
                                  qword_180117110,
                                  qword_180116F00 + 512,
                                  qword_180116F00 + 489);
              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
              if ( (_BYTE)result != 0 )
                goto LABEL_51;
            }
            if ( v142 != 0 )
              (*(void (__fastcall **)(__int64, __int64, __int64, _QWORD))(*(_QWORD *)a1 + 840LL))(
                a1,
                v142,
                qword_1801172A0,
                (unsigned __int8)v135);
            else
              sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 1288, 4);
            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
            if ( (_BYTE)result != 0 )
              goto LABEL_51;
            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
            if ( (_BYTE)result != 0 )
              goto LABEL_51;
            v142 = v134;
            sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
            LODWORD(v135) = v127;
            if ( qword_180117110 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                   a1,
                   qword_180117110,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117040);
              if ( qword_180117110 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117110,
                     0) != 0 )
              {
                v46 = sub_1800023C0(a1);
                if ( v46 != 0 )
                {
                  qword_180117110 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v46);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v46);
                }
              }
              sub_1800C6900(&unk_180117040);
              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
              if ( (_BYTE)result != 0 )
                goto LABEL_51;
            }
            if ( qword_1801172A8 == 0 )
            {
              qword_1801172A8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 752LL))(
                                  a1,
                                  qword_180117110,
                                  qword_180116F00 + 516,
                                  qword_180116F00 + 489);
              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
              if ( (_BYTE)result != 0 )
                goto LABEL_51;
            }
            if ( v142 != 0 )
              (*(void (__fastcall **)(__int64, __int64, __int64, _QWORD))(*(_QWORD *)a1 + 840LL))(
                a1,
                v142,
                qword_1801172A8,
                (unsigned __int8)v135);
            else
              sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 1288, 111);
            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
            if ( (_BYTE)result != 0 )
              goto LABEL_51;
            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
            if ( (_BYTE)result != 0 )
              goto LABEL_51;
            v142 = v134;
            sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
            LODWORD(v135) = v128;
            if ( qword_180117110 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                   a1,
                   qword_180117110,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117040);
              if ( qword_180117110 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117110,
                     0) != 0 )
              {
                v81 = sub_1800023C0(a1);
                if ( v81 != 0 )
                {
                  qword_180117110 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v81);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v81);
                }
              }
              sub_1800C6900(&unk_180117040);
              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
              if ( (_BYTE)result != 0 )
                goto LABEL_51;
            }
            if ( qword_1801172B0 == 0 )
            {
              qword_1801172B0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 752LL))(
                                  a1,
                                  qword_180117110,
                                  qword_180116F00 + 520,
                                  qword_180116F00 + 489);
              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
              if ( (_BYTE)result != 0 )
                goto LABEL_51;
            }
            if ( v142 != 0 )
              (*(void (__fastcall **)(__int64, __int64, __int64, _QWORD))(*(_QWORD *)a1 + 840LL))(
                a1,
                v142,
                qword_1801172B0,
                (unsigned __int8)v135);
            else
              sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 1288, 101);
            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
            if ( (_BYTE)result != 0 )
              goto LABEL_51;
            goto LABEL_113;
          }
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
            goto LABEL_167;
        }
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
        {
          sub_180026DB0(&v137, &v134);
          sub_180026DB0(&v137, &v136);
          sub_180002660(a1, &v137);
          LODWORD(v142) = v21;
          LODWORD(v135) = v23;
          v130 = v136;
          sub_1800036C0((__int64)v140, (float *)&v137, &v130, &v130);
          if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(a1, v130, 0) != 0 )
            goto LABEL_235;
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
          {
LABEL_191:
            v35 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
            (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
            v142 = v35;
            v141[0] = v35;
            sub_180026960(v140, &v137, v141, v141);
LABEL_192:
            if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                   a1,
                   v142,
                   qword_1801170F8) == 0 )
              goto LABEL_937;
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_216;
            sub_180026DB0(&v137, &v142);
            sub_180026DB0(&v137, &v134);
            sub_180026DB0(&v137, &v136);
            sub_180002660(a1, &v137);
            if ( qword_180117100 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                   a1,
                   qword_180117100,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117030);
              if ( qword_180117100 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117100,
                     0) != 0 )
              {
                v36 = sub_1800023C0(a1);
                if ( v36 != 0 )
                {
                  qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v36);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v36);
                }
              }
              sub_1800C6900(&unk_180117030);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_216;
            }
            if ( qword_1801171C8 == 0 )
            {
              qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                  a1,
                                  qword_180117100,
                                  qword_180116F00 + 165,
                                  qword_180116F00 + 611);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_216;
            }
            v142 = sub_180002760(a1);
            sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_216;
            v37 = v142;
            if ( v142 != 0 )
            {
              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v142);
              v141[0] = v37;
              sub_180026960(v140, &v137, v141, v141);
            }
            else
            {
              sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 666, 9);
            }
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_216;
            goto LABEL_215;
          }
LABEL_190:
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
          {
            sub_180026DB0(&v137, &v134);
            sub_180026DB0(&v137, &v136);
            sub_180002660(a1, &v137);
            if ( (_DWORD)v142 != (_DWORD)v135 )
              goto LABEL_249;
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
            {
LABEL_215:
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
              {
                sub_180026DB0(&v137, &v134);
                sub_180026DB0(&v137, &v136);
                sub_180002660(a1, &v137);
                LODWORD(v142) = v127;
                LODWORD(v135) = v128;
                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                goto LABEL_234;
              }
            }
LABEL_216:
            v38 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
            (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
            v142 = v38;
            v141[0] = v38;
            sub_180026960(v140, &v137, v141, v141);
            if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                   a1,
                   v142,
                   qword_1801170F8) == 0 )
              goto LABEL_937;
            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
            if ( (_BYTE)result != 0 )
              goto LABEL_51;
            sub_180026DB0(&v137, &v142);
            sub_180026DB0(&v137, &v134);
            sub_180026DB0(&v137, &v136);
            sub_180002660(a1, &v137);
            if ( qword_180117100 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                   a1,
                   qword_180117100,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117030);
              if ( qword_180117100 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117100,
                     0) != 0 )
              {
                v39 = sub_1800023C0(a1);
                if ( v39 != 0 )
                {
                  qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v39);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v39);
                }
              }
              sub_1800C6900(&unk_180117030);
              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
              if ( (_BYTE)result != 0 )
                goto LABEL_51;
            }
            if ( qword_1801171C8 == 0 )
            {
              qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                  a1,
                                  qword_180117100,
                                  qword_180116F00 + 165,
                                  qword_180116F00 + 611);
              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
              if ( (_BYTE)result != 0 )
                goto LABEL_51;
            }
            v142 = sub_180002760(a1);
            sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
            if ( (_BYTE)result != 0 )
              goto LABEL_51;
            v40 = v142;
            if ( v142 != 0 )
            {
              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v142);
              v141[0] = v40;
              sub_180026960(v140, &v137, v141, v141);
            }
            else
            {
              sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 666, 9);
            }
            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
LABEL_234:
            if ( (_BYTE)result != 0 )
              goto LABEL_51;
LABEL_235:
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_323;
            sub_180026DB0(&v137, &v134);
            sub_180026DB0(&v137, &v136);
            sub_180002660(a1, &v137);
            if ( (_DWORD)v142 == (_DWORD)v135 )
              goto LABEL_238;
LABEL_249:
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
            {
              sub_180026DB0(&v137, &v134);
              sub_180026DB0(&v137, &v136);
              sub_180002660(a1, &v137);
              if ( qword_180117100 != 0
                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117100,
                     0) == 0 )
              {
                goto LABEL_955;
              }
              sub_1800C68B0(&unk_180117030);
              if ( qword_180117100 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117100,
                     0) != 0 )
              {
                v42 = sub_1800023C0(a1);
                if ( v42 != 0 )
                {
                  qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v42);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v42);
                }
              }
              sub_1800C6900(&unk_180117030);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
              {
LABEL_955:
                if ( qword_1801172B8 != 0
                  || (qword_1801172B8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL))(
                                          a1,
                                          qword_180117100,
                                          qword_180116F00 + 524,
                                          qword_180116F00 + 528),
                      (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0) )
                {
                  v142 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1160LL))(a1, qword_180117100);
                  sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                  {
                    if ( qword_180117118 != 0
                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117118,
                           0) == 0 )
                    {
                      goto LABEL_956;
                    }
                    sub_1800C68B0(&unk_180117048);
                    if ( qword_180117118 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117118,
                           0) != 0 )
                    {
                      v43 = sub_1800023C0(a1);
                      if ( v43 != 0 )
                      {
                        qword_180117118 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                            a1,
                                            v43);
                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v43);
                      }
                    }
                    sub_1800C6900(&unk_180117048);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                    {
LABEL_956:
                      if ( qword_1801172C0 != 0
                        || (qword_1801172C0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 752LL))(
                                                a1,
                                                qword_180117118,
                                                qword_180116F00 + 554,
                                                qword_180116F00 + 565),
                            (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0) )
                      {
                        if ( v142 != 0 )
                        {
                          v142 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 760LL))(
                                   a1,
                                   v142,
                                   qword_1801172C0);
                          sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
                        }
                        else
                        {
                          sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 591, 23);
                        }
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                        {
                          if ( qword_180117120 != 0
                            && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                 a1,
                                 qword_180117120,
                                 0) == 0 )
                          {
                            goto LABEL_957;
                          }
                          sub_1800C68B0(&unk_180117050);
                          if ( qword_180117120 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                 a1,
                                 qword_180117120,
                                 0) != 0 )
                          {
                            v45 = sub_1800023C0(a1);
                            if ( v45 != 0 )
                            {
                              qword_180117120 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                  a1,
                                                  v45);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v45);
                            }
                          }
                          sub_1800C6900(&unk_180117050);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                          {
LABEL_957:
                            if ( qword_1801171D0 != 0
                              || (qword_1801171D0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                                      a1,
                                                      qword_180117120,
                                                      qword_180116F00 + 677,
                                                      qword_180116F00 + 690),
                                  (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0) )
                            {
                              if ( v142 != 0 )
                                LODWORD(v142) = sub_180026740(a1, v142, qword_1801171D0);
                              else
                                sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 694, 23);
                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                              {
                                LODWORD(v135) = v21;
                                v130 = v136;
                                sub_1800036C0((__int64)v140, (float *)&v137, &v130, &v130);
                                if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                       a1,
                                       v130,
                                       0) != 0 )
                                {
LABEL_412:
                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                    goto LABEL_413;
                                  sub_180026DB0(&v137, &v134);
                                  sub_180026DB0(&v137, &v136);
                                  sub_180002660(a1, &v137);
                                  v130 = v136;
                                  sub_1800036C0((__int64)v140, (float *)&v137, &v130, &v130);
                                  if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                         a1,
                                         v130,
                                         0) == 0 )
                                  {
                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                    {
LABEL_413:
                                      v61 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                      (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                      v142 = v61;
                                      v141[0] = v61;
                                      sub_180026960(v140, &v137, v141, v141);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                             a1,
                                             v142,
                                             qword_1801170F8) == 0 )
                                        goto LABEL_937;
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                        goto LABEL_732;
                                      sub_180026DB0(&v137, &v142);
                                      sub_180026DB0(&v137, &v134);
                                      sub_180026DB0(&v137, &v136);
                                      sub_180002660(a1, &v137);
                                      if ( qword_180117100 == 0
                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                             a1,
                                             qword_180117100,
                                             0) != 0 )
                                      {
                                        sub_1800C68B0(&unk_180117030);
                                        if ( qword_180117100 == 0
                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                               a1,
                                               qword_180117100,
                                               0) != 0 )
                                        {
                                          v72 = sub_1800023C0(a1);
                                          if ( v72 != 0 )
                                          {
                                            qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                                a1,
                                                                v72);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v72);
                                          }
                                        }
                                        sub_1800C6900(&unk_180117030);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                          goto LABEL_732;
                                      }
                                      if ( qword_1801171C8 == 0 )
                                      {
                                        qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                                            a1,
                                                            qword_180117100,
                                                            qword_180116F00 + 165,
                                                            qword_180116F00 + 611);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                          goto LABEL_732;
                                      }
                                      v142 = sub_180002760(a1);
                                      sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                        goto LABEL_732;
                                      v97 = v142;
                                      if ( v142 != 0 )
                                      {
                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v142);
                                        v141[0] = v97;
                                        sub_180026960(v140, &v137, v141, v141);
                                      }
                                      else
                                      {
                                        sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 666, 23);
                                      }
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                        goto LABEL_732;
                                      goto LABEL_731;
                                    }
                                    v83 = *(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL);
                                    if ( (_DWORD)v135 != 0 )
                                    {
                                      if ( v83(a1) != 0 )
                                        goto LABEL_732;
LABEL_731:
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                                      {
                                        sub_180026DB0(&v137, &v134);
                                        sub_180026DB0(&v137, &v136);
                                        sub_180002660(a1, &v137);
                                        LODWORD(v135) = v127;
                                        v130 = v136;
                                        sub_1800036C0((__int64)v140, (float *)&v137, &v130, &v130);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                               a1,
                                               v130,
                                               0) != 0 )
                                          JUMPOUT(0x18000C729LL);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                        {
LABEL_734:
                                          v102 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                          (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                          v142 = v102;
                                          v141[0] = v102;
                                          sub_180026960(v140, &v137, v141, v141);
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                 a1,
                                                 v142,
                                                 qword_1801170F8) != 0 )
                                          {
                                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                                            {
                                              sub_180026DB0(&v137, &v142);
                                              sub_180026DB0(&v137, &v134);
                                              sub_180026DB0(&v137, &v136);
                                              sub_180002660(a1, &v137);
                                              if ( qword_180117100 != 0
                                                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                     a1,
                                                     qword_180117100,
                                                     0) == 0 )
                                              {
                                                goto LABEL_873;
                                              }
                                              sub_1800C68B0(&unk_180117030);
                                              if ( qword_180117100 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                     a1,
                                                     qword_180117100,
                                                     0) != 0 )
                                              {
                                                v107 = sub_1800023C0(a1);
                                                if ( v107 != 0 )
                                                {
                                                  qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                                      a1,
                                                                      v107);
                                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(
                                                    a1,
                                                    v107);
                                                }
                                              }
                                              sub_1800C6900(&unk_180117030);
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                                              {
LABEL_873:
                                                if ( qword_1801171C8 != 0
                                                  || (qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                                                          a1,
                                                                          qword_180117100,
                                                                          qword_180116F00 + 165,
                                                                          qword_180116F00 + 611),
                                                      (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0) )
                                                {
                                                  v142 = sub_180002760(a1);
                                                  sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL))(a1) == 0 )
                                                  {
                                                    v116 = v142;
                                                    if ( v142 != 0 )
                                                    {
                                                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(
                                                        a1,
                                                        v142);
                                                      v141[0] = v116;
                                                      sub_180026960(v140, &v137, v141, v141);
                                                    }
                                                    else
                                                    {
                                                      sub_180002110(
                                                        a1,
                                                        qword_180116F00 + 109,
                                                        qword_180116F00 + 666,
                                                        23);
                                                    }
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                                                      JUMPOUT(0x18000C779LL);
                                                  }
                                                }
                                              }
                                            }
                                            v103 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                            (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                            v142 = v103;
                                            v141[0] = v103;
                                            sub_180026960(v140, &v137, v141, v141);
                                            if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                   a1,
                                                   v142,
                                                   qword_1801170F8) != 0 )
                                            {
                                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                              if ( (_BYTE)result == 0 )
                                              {
                                                sub_180026DB0(&v137, &v142);
                                                sub_180026DB0(&v137, &v134);
                                                sub_180026DB0(&v137, &v136);
                                                sub_180002660(a1, &v137);
                                                if ( qword_180117100 != 0
                                                  && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                       a1,
                                                       qword_180117100,
                                                       0) == 0 )
                                                {
                                                  goto LABEL_958;
                                                }
                                                sub_1800C68B0(&unk_180117030);
                                                if ( qword_180117100 == 0
                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                       a1,
                                                       qword_180117100,
                                                       0) != 0 )
                                                {
                                                  v104 = sub_1800023C0(a1);
                                                  if ( v104 != 0 )
                                                  {
                                                    qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                                        a1,
                                                                        v104);
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(
                                                      a1,
                                                      v104);
                                                  }
                                                }
                                                sub_1800C6900(&unk_180117030);
                                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                if ( (_BYTE)result == 0 )
                                                {
LABEL_958:
                                                  if ( qword_1801171C8 != 0
                                                    || (qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                                                            a1,
                                                                            qword_180117100,
                                                                            qword_180116F00 + 165,
                                                                            qword_180116F00 + 611),
                                                        (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1)) == 0) )
                                                  {
                                                    v142 = sub_180002760(a1);
                                                    sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                    if ( (_BYTE)result == 0 )
                                                    {
                                                      v105 = v142;
                                                      if ( v142 != 0 )
                                                      {
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(
                                                          a1,
                                                          v142);
                                                        v141[0] = v105;
                                                        sub_180026960(v140, &v137, v141, v141);
                                                      }
                                                      else
                                                      {
                                                        sub_180002110(
                                                          a1,
                                                          qword_180116F00 + 109,
                                                          qword_180116F00 + 666,
                                                          23);
                                                      }
                                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL))(a1);
                                                      if ( (_BYTE)result == 0 )
                                                        JUMPOUT(0x18000C6E8LL);
                                                    }
                                                  }
                                                }
                                              }
                                              goto LABEL_51;
                                            }
                                          }
                                          goto LABEL_937;
                                        }
LABEL_941:
                                        JUMPOUT(0x18000BE98LL);
                                      }
LABEL_732:
                                      v101 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                      (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                      v142 = v101;
                                      v141[0] = v101;
                                      sub_180026960(v140, &v137, v141, v141);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                             a1,
                                             v142,
                                             qword_1801170F8) == 0 )
                                        goto LABEL_937;
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                        goto LABEL_734;
                                      sub_180026DB0(&v137, &v142);
                                      sub_180026DB0(&v137, &v134);
                                      sub_180026DB0(&v137, &v136);
                                      sub_180002660(a1, &v137);
                                      if ( qword_180117100 == 0
                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                             a1,
                                             qword_180117100,
                                             0) != 0 )
                                      {
                                        sub_1800C68B0(&unk_180117030);
                                        if ( qword_180117100 == 0
                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                               a1,
                                               qword_180117100,
                                               0) != 0 )
                                        {
                                          v106 = sub_1800023C0(a1);
                                          if ( v106 != 0 )
                                          {
                                            qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                                a1,
                                                                v106);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v106);
                                          }
                                        }
                                        sub_1800C6900(&unk_180117030);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                          goto LABEL_734;
                                      }
                                      if ( qword_1801171C8 == 0 )
                                      {
                                        qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                                            a1,
                                                            qword_180117100,
                                                            qword_180116F00 + 165,
                                                            qword_180116F00 + 611);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                          goto LABEL_734;
                                      }
                                      v142 = sub_180002760(a1);
                                      sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                        goto LABEL_734;
                                      v115 = v142;
                                      if ( v142 != 0 )
                                      {
                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v142);
                                        v141[0] = v115;
                                        sub_180026960(v140, &v137, v141, v141);
                                      }
                                      else
                                      {
                                        sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 666, 23);
                                      }
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                        goto LABEL_734;
                                      goto LABEL_941;
                                    }
                                    result = ((__int64 (__fastcall *)(__int64))v83)(a1);
                                    if ( (_BYTE)result != 0 )
                                      goto LABEL_51;
                                    sub_180026DB0(&v137, &v134);
                                    sub_180026DB0(&v137, &v136);
                                    sub_180002660(a1, &v137);
                                    LODWORD(v135) = v127;
                                  }
                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                    goto LABEL_477;
                                  sub_180026DB0(&v137, &v134);
                                  sub_180026DB0(&v137, &v136);
                                  sub_180002660(a1, &v137);
                                  v130 = v136;
                                  sub_1800036C0((__int64)v140, (float *)&v137, &v130, &v130);
                                  if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                         a1,
                                         v130,
                                         0) != 0 )
                                    goto LABEL_841;
                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                  {
LABEL_477:
                                    v70 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                    (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                    v142 = v70;
                                    v141[0] = v70;
                                    sub_180026960(v140, &v137, v141, v141);
                                    if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                           a1,
                                           v142,
                                           qword_1801170F8) == 0 )
                                      goto LABEL_937;
                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                      goto LABEL_796;
                                    sub_180026DB0(&v137, &v142);
                                    sub_180026DB0(&v137, &v134);
                                    sub_180026DB0(&v137, &v136);
                                    sub_180002660(a1, &v137);
                                    if ( qword_180117100 == 0
                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                           a1,
                                           qword_180117100,
                                           0) != 0 )
                                    {
                                      sub_1800C68B0(&unk_180117030);
                                      if ( qword_180117100 == 0
                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                             a1,
                                             qword_180117100,
                                             0) != 0 )
                                      {
                                        v82 = sub_1800023C0(a1);
                                        if ( v82 != 0 )
                                        {
                                          qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                              a1,
                                                              v82);
                                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v82);
                                        }
                                      }
                                      sub_1800C6900(&unk_180117030);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                        goto LABEL_796;
                                    }
                                    if ( qword_1801171C8 == 0 )
                                    {
                                      qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                                          a1,
                                                          qword_180117100,
                                                          qword_180116F00 + 165,
                                                          qword_180116F00 + 611);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                        goto LABEL_796;
                                    }
                                    v142 = sub_180002760(a1);
                                    sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                      goto LABEL_796;
                                    v100 = v142;
                                    if ( v142 != 0 )
                                    {
                                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v142);
                                      v141[0] = v100;
                                      sub_180026960(v140, &v137, v141, v141);
                                    }
                                    else
                                    {
                                      sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 666, 23);
                                    }
                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                      goto LABEL_796;
                                  }
                                  else
                                  {
                                    LODWORD(v130) = v128;
                                    if ( (_DWORD)v135 != v128 )
                                    {
LABEL_839:
                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                      if ( (_BYTE)result != 0 )
                                        goto LABEL_51;
                                      sub_180026DB0(&v137, &v134);
                                      sub_180026DB0(&v137, &v136);
                                      sub_180002660(a1, &v137);
                                      LODWORD(v135) = v127;
LABEL_841:
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                      {
                                        v118 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                        (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                        v142 = v118;
                                        v141[0] = v118;
                                        sub_180026960(v140, &v137, v141, v141);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                               a1,
                                               v142,
                                               qword_1801170F8) == 0 )
                                          goto LABEL_937;
                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                        if ( (_BYTE)result != 0 )
                                          goto LABEL_51;
                                        sub_180026DB0(&v137, &v142);
                                        sub_180026DB0(&v137, &v134);
                                        sub_180026DB0(&v137, &v136);
                                        sub_180002660(a1, &v137);
                                        if ( qword_180117100 == 0
                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                               a1,
                                               qword_180117100,
                                               0) != 0 )
                                        {
                                          sub_1800C68B0(&unk_180117030);
                                          if ( qword_180117100 == 0
                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                 a1,
                                                 qword_180117100,
                                                 0) != 0 )
                                          {
                                            v119 = sub_1800023C0(a1);
                                            if ( v119 != 0 )
                                            {
                                              qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                                  a1,
                                                                  v119);
                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(
                                                a1,
                                                v119);
                                            }
                                          }
                                          sub_1800C6900(&unk_180117030);
                                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                          if ( (_BYTE)result != 0 )
                                            goto LABEL_51;
                                        }
                                        if ( qword_1801171C8 == 0 )
                                        {
                                          qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                                              a1,
                                                              qword_180117100,
                                                              qword_180116F00 + 165,
                                                              qword_180116F00 + 611);
                                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                          if ( (_BYTE)result != 0 )
                                            goto LABEL_51;
                                        }
                                        v142 = sub_180002760(a1);
                                        sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                        if ( (_BYTE)result != 0 )
                                          goto LABEL_51;
                                        v120 = v142;
                                        if ( v142 != 0 )
                                        {
                                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v142);
                                          v141[0] = v120;
                                          sub_180026960(v140, &v137, v141, v141);
                                        }
                                        else
                                        {
                                          sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 666, 23);
                                        }
                                      }
                                      else
                                      {
                                        sub_180026DB0(&v137, &v134);
                                        sub_180026DB0(&v137, &v136);
                                        sub_180002660(a1, &v137);
                                        v130 = v136;
                                        sub_1800036C0((__int64)v140, (float *)&v137, &v130, &v130);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                               a1,
                                               v130,
                                               0) != 0 )
                                          JUMPOUT(0x180016178LL);
                                        if ( (_DWORD)v135 == 0 )
                                          JUMPOUT(0x18000BF26LL);
                                      }
                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                      if ( (_BYTE)result == 0 )
                                      {
                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                        if ( (_BYTE)result == 0 )
                                        {
                                          sub_180026DB0(&v137, &v134);
                                          sub_180026DB0(&v137, &v136);
                                          sub_180002660(a1, &v137);
                                          LODWORD(v135) = 18043;
                                          v133 = v15;
                                          v130 = v15 ^ 0x47FB551AC9560282LL;
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                          {
                                            v126 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                            (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                            v142 = v126;
                                            v141[0] = v126;
                                            sub_180026960(v140, &v137, v141, v141);
                                            JUMPOUT(0x180014E24LL);
                                          }
                                          JUMPOUT(0x18000BFC5LL);
                                        }
                                      }
                                      goto LABEL_51;
                                    }
                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                    {
LABEL_796:
                                      v109 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                      (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                      v142 = v109;
                                      v141[0] = v109;
                                      sub_180026960(v140, &v137, v141, v141);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                             a1,
                                             v142,
                                             qword_1801170F8) == 0 )
                                        goto LABEL_937;
                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                      if ( (_BYTE)result != 0 )
                                        goto LABEL_51;
                                      sub_180026DB0(&v137, &v142);
                                      sub_180026DB0(&v137, &v134);
                                      sub_180026DB0(&v137, &v136);
                                      sub_180002660(a1, &v137);
                                      if ( qword_180117100 == 0
                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                             a1,
                                             qword_180117100,
                                             0) != 0 )
                                      {
                                        sub_1800C68B0(&unk_180117030);
                                        if ( qword_180117100 == 0
                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                               a1,
                                               qword_180117100,
                                               0) != 0 )
                                        {
                                          v110 = sub_1800023C0(a1);
                                          if ( v110 != 0 )
                                          {
                                            qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                                a1,
                                                                v110);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v110);
                                          }
                                        }
                                        sub_1800C6900(&unk_180117030);
                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                        if ( (_BYTE)result != 0 )
                                          goto LABEL_51;
                                      }
                                      if ( qword_1801171C8 == 0 )
                                      {
                                        qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                                            a1,
                                                            qword_180117100,
                                                            qword_180116F00 + 165,
                                                            qword_180116F00 + 611);
                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                        if ( (_BYTE)result != 0 )
                                          goto LABEL_51;
                                      }
                                      v142 = sub_180002760(a1);
                                      sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                      if ( (_BYTE)result != 0 )
                                        goto LABEL_51;
                                      v111 = v142;
                                      if ( v142 != 0 )
                                      {
                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v142);
                                        v141[0] = v111;
                                        sub_180026960(v140, &v137, v141, v141);
                                      }
                                      else
                                      {
                                        sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 666, 23);
                                      }
                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                      if ( (_BYTE)result != 0 )
                                        goto LABEL_51;
                                      goto LABEL_839;
                                    }
                                  }
                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                                  {
                                    sub_180026DB0(&v137, &v134);
                                    sub_180026DB0(&v137, &v136);
                                    sub_180002660(a1, &v137);
                                    LODWORD(v135) = 16171;
                                    v133 = v15;
                                    v130 = v15 ^ 0x2A7562FED7907BD0LL;
                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                                    {
                                      LODWORD(v133) = 1;
                                      if ( qword_180117128 != 0
                                        && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                             a1,
                                             qword_180117128,
                                             0) == 0 )
                                      {
                                        goto LABEL_946;
                                      }
                                      sub_1800C68B0(&unk_180117058);
                                      if ( qword_180117128 == 0
                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                             a1,
                                             qword_180117128,
                                             0) != 0 )
                                      {
                                        v125 = sub_1800023C0(a1);
                                        if ( v125 != 0 )
                                        {
                                          qword_180117128 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                              a1,
                                                              v125);
                                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v125);
                                        }
                                      }
                                      sub_1800C6900(&unk_180117058);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
LABEL_946:
                                        JUMPOUT(0x18000BEE8LL);
                                    }
                                    v117 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                    (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                    v142 = v117;
                                    v141[0] = v117;
                                    sub_180026960(v140, &v137, v141, v141);
                                    JUMPOUT(0x18000C8B5LL);
                                  }
                                  goto LABEL_796;
                                }
                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                  goto LABEL_347;
LABEL_346:
                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                  goto LABEL_347;
                                sub_180026DB0(&v137, &v134);
                                sub_180026DB0(&v137, &v136);
                                sub_180002660(a1, &v137);
                                LODWORD(v130) = v23;
                                v53 = *(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL);
                                if ( (_DWORD)v135 == v23 )
                                {
                                  if ( v53(a1) != 0 )
                                    goto LABEL_371;
                                  goto LABEL_370;
                                }
                                result = ((__int64 (__fastcall *)(__int64))v53)(a1);
                                if ( (_BYTE)result != 0 )
                                  goto LABEL_51;
                                sub_180026DB0(&v137, &v134);
                                sub_180026DB0(&v137, &v136);
                                sub_180002660(a1, &v137);
                                LODWORD(v135) = v21;
                                goto LABEL_412;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
LABEL_323:
            v47 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
            (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
            v142 = v47;
            v141[0] = v47;
            sub_180026960(v140, &v137, v141, v141);
            if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                   a1,
                   v142,
                   qword_1801170F8) == 0 )
              goto LABEL_937;
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_347;
            sub_180026DB0(&v137, &v142);
            sub_180026DB0(&v137, &v134);
            sub_180026DB0(&v137, &v136);
            sub_180002660(a1, &v137);
            if ( qword_180117100 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                   a1,
                   qword_180117100,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117030);
              if ( qword_180117100 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117100,
                     0) != 0 )
              {
                v48 = sub_1800023C0(a1);
                if ( v48 != 0 )
                {
                  qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v48);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v48);
                }
              }
              sub_1800C6900(&unk_180117030);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_347;
            }
            if ( qword_1801171C8 == 0 )
            {
              qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                  a1,
                                  qword_180117100,
                                  qword_180116F00 + 165,
                                  qword_180116F00 + 611);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_347;
            }
            v142 = sub_180002760(a1);
            sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_347;
            v49 = v142;
            if ( v142 != 0 )
            {
              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v142);
              v141[0] = v49;
              sub_180026960(v140, &v137, v141, v141);
            }
            else
            {
              sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 666, 23);
            }
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
            {
LABEL_347:
              v50 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
              (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
              v142 = v50;
              v141[0] = v50;
              sub_180026960(v140, &v137, v141, v141);
              if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                     a1,
                     v142,
                     qword_1801170F8) == 0 )
                goto LABEL_937;
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_371;
              sub_180026DB0(&v137, &v142);
              sub_180026DB0(&v137, &v134);
              sub_180026DB0(&v137, &v136);
              sub_180002660(a1, &v137);
              if ( qword_180117100 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117100,
                     0) != 0 )
              {
                sub_1800C68B0(&unk_180117030);
                if ( qword_180117100 == 0
                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                       a1,
                       qword_180117100,
                       0) != 0 )
                {
                  v51 = sub_1800023C0(a1);
                  if ( v51 != 0 )
                  {
                    qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v51);
                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v51);
                  }
                }
                sub_1800C6900(&unk_180117030);
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                  goto LABEL_371;
              }
              if ( qword_1801171C8 == 0 )
              {
                qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                    a1,
                                    qword_180117100,
                                    qword_180116F00 + 165,
                                    qword_180116F00 + 611);
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                  goto LABEL_371;
              }
              v142 = sub_180002760(a1);
              sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_371;
              v52 = v142;
              if ( v142 != 0 )
              {
                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v142);
                v141[0] = v52;
                sub_180026960(v140, &v137, v141, v141);
              }
              else
              {
                sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 666, 23);
              }
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              {
LABEL_371:
                v54 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                v142 = v54;
                v141[0] = v54;
                sub_180026960(v140, &v137, v141, v141);
                if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                       a1,
                       v142,
                       qword_1801170F8) == 0 )
                  goto LABEL_937;
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                  goto LABEL_418;
                sub_180026DB0(&v137, &v142);
                sub_180026DB0(&v137, &v134);
                sub_180026DB0(&v137, &v136);
                sub_180002660(a1, &v137);
                if ( qword_180117100 == 0
                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                       a1,
                       qword_180117100,
                       0) != 0 )
                {
                  sub_1800C68B0(&unk_180117030);
                  if ( qword_180117100 == 0
                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                         a1,
                         qword_180117100,
                         0) != 0 )
                  {
                    v55 = sub_1800023C0(a1);
                    if ( v55 != 0 )
                    {
                      qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v55);
                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v55);
                    }
                  }
                  sub_1800C6900(&unk_180117030);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                    goto LABEL_418;
                }
                if ( qword_1801171C8 == 0 )
                {
                  qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                      a1,
                                      qword_180117100,
                                      qword_180116F00 + 165,
                                      qword_180116F00 + 611);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                    goto LABEL_418;
                }
                v142 = sub_180002760(a1);
                sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                  goto LABEL_418;
                v56 = v142;
                if ( v142 != 0 )
                {
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v142);
                  v141[0] = v56;
                  sub_180026960(v140, &v137, v141, v141);
                }
                else
                {
                  sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 666, 23);
                }
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                  goto LABEL_418;
                goto LABEL_417;
              }
LABEL_370:
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_371;
              sub_180026DB0(&v137, &v134);
              sub_180026DB0(&v137, &v136);
              sub_180002660(a1, &v137);
              LODWORD(v135) = v127;
              v130 = v136;
              sub_1800036C0((__int64)v140, (float *)&v137, &v130, &v130);
              if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(a1, v130, 0) == 0 )
              {
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                {
LABEL_417:
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                  {
                    sub_180026DB0(&v137, &v134);
                    sub_180026DB0(&v137, &v136);
                    sub_180002660(a1, &v137);
                    if ( (_DWORD)v135 == 0 )
                    {
                      v66 = 0;
                      goto LABEL_464;
                    }
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      goto LABEL_442;
                    goto LABEL_441;
                  }
                }
LABEL_418:
                v62 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                v142 = v62;
                v141[0] = v62;
                sub_180026960(v140, &v137, v141, v141);
                if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                       a1,
                       v142,
                       qword_1801170F8) == 0 )
                  goto LABEL_937;
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                  goto LABEL_442;
                sub_180026DB0(&v137, &v142);
                sub_180026DB0(&v137, &v134);
                sub_180026DB0(&v137, &v136);
                sub_180002660(a1, &v137);
                if ( qword_180117100 == 0
                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                       a1,
                       qword_180117100,
                       0) != 0 )
                {
                  sub_1800C68B0(&unk_180117030);
                  if ( qword_180117100 == 0
                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                         a1,
                         qword_180117100,
                         0) != 0 )
                  {
                    v63 = sub_1800023C0(a1);
                    if ( v63 != 0 )
                    {
                      qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v63);
                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v63);
                    }
                  }
                  sub_1800C6900(&unk_180117030);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                    goto LABEL_442;
                }
                if ( qword_1801171C8 == 0 )
                {
                  qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                      a1,
                                      qword_180117100,
                                      qword_180116F00 + 165,
                                      qword_180116F00 + 611);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                    goto LABEL_442;
                }
                v142 = sub_180002760(a1);
                sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                  goto LABEL_442;
                v64 = v142;
                if ( v142 != 0 )
                {
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v142);
                  v141[0] = v64;
                  sub_180026960(v140, &v137, v141, v141);
                }
                else
                {
                  sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 666, 23);
                }
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                  goto LABEL_442;
LABEL_441:
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                {
LABEL_442:
                  v65 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                  (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                  v142 = v65;
                  v141[0] = v65;
                  sub_180026960(v140, &v137, v141, v141);
                  v66 = 0;
LABEL_443:
                  if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                         a1,
                         v142,
                         qword_1801170F8) == 0 )
                    goto LABEL_937;
                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                  if ( (_BYTE)result != 0 )
                    goto LABEL_51;
                  sub_180026DB0(&v137, &v142);
                  sub_180026DB0(&v137, &v134);
                  sub_180026DB0(&v137, &v136);
                  sub_180002660(a1, &v137);
                  if ( qword_180117100 == 0
                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                         a1,
                         qword_180117100,
                         0) != 0 )
                  {
                    sub_1800C68B0(&unk_180117030);
                    if ( qword_180117100 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117100,
                           0) != 0 )
                    {
                      v67 = sub_1800023C0(a1);
                      if ( v67 != 0 )
                      {
                        qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                            a1,
                                            v67);
                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v67);
                      }
                    }
                    sub_1800C6900(&unk_180117030);
                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                    if ( (_BYTE)result != 0 )
                      goto LABEL_51;
                  }
                  if ( qword_1801171C8 == 0 )
                  {
                    qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                        a1,
                                        qword_180117100,
                                        qword_180116F00 + 165,
                                        qword_180116F00 + 611);
                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                    if ( (_BYTE)result != 0 )
                      goto LABEL_51;
                  }
                  v142 = sub_180002760(a1);
                  sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                  if ( (_BYTE)result != 0 )
                    goto LABEL_51;
                  v68 = v142;
                  if ( v142 != 0 )
                  {
                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v142);
                    v141[0] = v68;
                    sub_180026960(v140, &v137, v141, v141);
                  }
                  else
                  {
                    sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 666, 23);
                  }
                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                  if ( (_BYTE)result != 0 )
                    goto LABEL_51;
LABEL_464:
                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                  if ( (_BYTE)result == 0 )
                  {
                    sub_180026DB0(&v137, &v134);
                    sub_180026DB0(&v137, &v136);
                    sub_180002660(a1, &v137);
                    LODWORD(v135) = 31640;
                    v133 = v15;
                    v130 = v15 ^ 0x254449C41433BF67LL;
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                    {
                      LODWORD(v133) = 1;
                      if ( qword_180117128 != 0
                        && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117128,
                             0) == 0 )
                      {
                        goto LABEL_534;
                      }
                      sub_1800C68B0(&unk_180117058);
                      if ( qword_180117128 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117128,
                             0) != 0 )
                      {
                        v71 = sub_1800023C0(a1);
                        if ( v71 != 0 )
                        {
                          qword_180117128 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                              a1,
                                              v71);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v71);
                        }
                      }
                      sub_1800C6900(&unk_180117058);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                      {
LABEL_534:
                        if ( (int)v133 < 0 )
                        {
                          sub_180002110(a1, qword_180116F00 + 718, qword_180116F00 + 755, 23);
                        }
                        else
                        {
                          v133 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, _QWORD))(*(_QWORD *)a1 + 1376LL))(
                                   a1,
                                   (unsigned int)v133,
                                   qword_180117128,
                                   0);
                          sub_1800036C0((__int64)v140, (float *)&v137, &v133, &v133);
                        }
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                        {
                          if ( qword_180117130 != 0
                            && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                 a1,
                                 qword_180117130,
                                 0) == 0 )
                          {
                            goto LABEL_621;
                          }
                          sub_1800C68B0(&unk_180117060);
                          if ( qword_180117130 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                 a1,
                                 qword_180117130,
                                 0) != 0 )
                          {
                            v80 = sub_1800023C0(a1);
                            if ( v80 != 0 )
                            {
                              qword_180117130 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                  a1,
                                                  v80);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v80);
                            }
                          }
                          sub_1800C6900(&unk_180117060);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                          {
LABEL_621:
                            v89 = qword_180117130;
                            if ( v66 == 0 )
                            {
                              v66 = sub_180002610(a1, a2);
                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                goto LABEL_535;
                              v89 = qword_180117130;
                            }
                            v129 = v66;
                            if ( v89 != 0
                              && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                   a1,
                                   v89,
                                   0) == 0 )
                            {
                              goto LABEL_705;
                            }
                            sub_1800C68B0(&unk_180117060);
                            if ( qword_180117130 == 0
                              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                   a1,
                                   qword_180117130,
                                   0) != 0 )
                            {
                              v95 = sub_1800023C0(a1);
                              if ( v95 != 0 )
                              {
                                qword_180117130 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                    a1,
                                                    v95);
                                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v95);
                              }
                            }
                            sub_1800C6900(&unk_180117060);
                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                            {
LABEL_705:
                              v131 = qword_180116F50;
                              v132 = qword_180116F58;
                              if ( qword_180117138 != 0
                                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                     a1,
                                     qword_180117138,
                                     0) == 0 )
                              {
                                goto LABEL_959;
                              }
                              sub_1800C68B0(&unk_180117068);
                              if ( qword_180117138 == 0
                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                     a1,
                                     qword_180117138,
                                     0) != 0 )
                              {
                                v99 = sub_1800023C0(a1);
                                if ( v99 != 0 )
                                {
                                  qword_180117138 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                      a1,
                                                      v99);
                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v99);
                                }
                              }
                              sub_1800C6900(&unk_180117068);
                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                              {
LABEL_959:
                                if ( qword_1801171D8 != 0
                                  || (qword_1801171D8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                                          a1,
                                                          qword_180117138,
                                                          qword_180116F00 + 780,
                                                          qword_180116F00 + 807),
                                      (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0) )
                                {
                                  v132 = sub_180002760(a1);
                                  sub_1800036C0((__int64)v140, (float *)&v137, &v132, &v132);
                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                                  {
                                    if ( qword_180117140 != 0
                                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                           a1,
                                           qword_180117140,
                                           0) == 0 )
                                    {
                                      goto LABEL_960;
                                    }
                                    sub_1800C68B0(&unk_180117070);
                                    if ( qword_180117140 == 0
                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                           a1,
                                           qword_180117140,
                                           0) != 0 )
                                    {
                                      v114 = sub_1800023C0(a1);
                                      if ( v114 != 0 )
                                      {
                                        qword_180117140 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                            a1,
                                                            v114);
                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v114);
                                      }
                                    }
                                    sub_1800C6900(&unk_180117070);
                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                                    {
LABEL_960:
                                      if ( qword_1801171E0 != 0
                                        || (qword_1801171E0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                                                a1,
                                                                qword_180117140,
                                                                qword_180116F00 + 880,
                                                                qword_180116F00 + 891,
                                                                v8),
                                            (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0) )
                                      {
                                        if ( v129 != 0 )
                                        {
                                          v129 = sub_180002790(a1);
                                          sub_1800036C0((__int64)v140, (float *)&v137, &v129, &v129);
                                          JUMPOUT(0x18000C145LL);
                                        }
                                        JUMPOUT(0x18000C125LL);
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
LABEL_535:
                    v77 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                    (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                    v142 = v77;
                    v141[0] = v77;
                    sub_180026960(v140, &v137, v141, v141);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                           a1,
                           v142,
                           qword_1801170F0) != 0 )
                    {
                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                      if ( (_BYTE)result != 0 )
                        goto LABEL_51;
                      sub_180026DB0(&v137, &v142);
                      sub_180026DB0(&v137, &v134);
                      sub_180026DB0(&v137, &v136);
                      sub_180002660(a1, &v137);
                      v135 = v142;
                      if ( qword_180117158 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117158,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117088);
                        if ( qword_180117158 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                               a1,
                               qword_180117158,
                               0) != 0 )
                        {
                          v78 = sub_1800023C0(a1);
                          if ( v78 != 0 )
                          {
                            qword_180117158 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                a1,
                                                v78);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v78);
                          }
                        }
                        sub_1800C6900(&unk_180117088);
                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                        if ( (_BYTE)result != 0 )
                          goto LABEL_51;
                      }
                      if ( v135 != 0 )
                      {
                        v79 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                a1,
                                v135,
                                qword_180117158);
                        LODWORD(v135) = v79;
                        if ( v79 != 0 )
                        {
LABEL_663:
                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                          if ( (_BYTE)result == 0 )
                          {
                            sub_180026DB0(&v137, &v142);
                            sub_180026DB0(&v137, &v134);
                            sub_180026DB0(&v137, &v136);
                            sub_180002660(a1, &v137);
                            v94 = v142;
                            if ( v142 != 0 )
                            {
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v142);
                              v141[0] = v94;
                              sub_180026960(v140, &v137, v141, v141);
                            }
                            else
                            {
                              sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 666, 23);
                            }
                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                            if ( (_BYTE)result == 0 )
                              JUMPOUT(0x180012741LL);
                          }
                          goto LABEL_51;
                        }
                      }
                      else
                      {
                        LODWORD(v135) = 0;
                      }
                      if ( qword_180117158 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117158,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117088);
                        if ( qword_180117158 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                               a1,
                               qword_180117158,
                               0) != 0 )
                        {
                          v86 = sub_1800023C0(a1);
                          if ( v86 != 0 )
                          {
                            qword_180117158 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                a1,
                                                v86);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v86);
                          }
                        }
                        sub_1800C6900(&unk_180117088);
                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                        if ( (_BYTE)result != 0 )
                          goto LABEL_51;
                      }
                      v87 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 216LL))(a1, qword_180117158);
                      v141[0] = v87;
                      if ( v87 != 0 )
                      {
                        v135 = v87;
                        sub_1800036C0((__int64)v140, (float *)&v137, v141, v141);
                      }
                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                      if ( (_BYTE)result != 0 )
                        goto LABEL_51;
                      v133 = v135;
                      v130 = v142;
                      v142 = v135;
                      if ( qword_180117158 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117158,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117088);
                        if ( qword_180117158 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                               a1,
                               qword_180117158,
                               0) != 0 )
                        {
                          v88 = sub_1800023C0(a1);
                          if ( v88 != 0 )
                          {
                            qword_180117158 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                a1,
                                                v88);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v88);
                          }
                        }
                        sub_1800C6900(&unk_180117088);
                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                        if ( (_BYTE)result != 0 )
                          goto LABEL_51;
                      }
                      if ( qword_1801171F0 == 0 )
                      {
                        qword_1801171F0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                            a1,
                                            qword_180117158,
                                            qword_180116F00 + 1163,
                                            qword_180116F00 + 1170);
                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                        if ( (_BYTE)result != 0 )
                          goto LABEL_51;
                      }
                      if ( v135 != 0 )
                        sub_180026870(a1, v135, qword_180117158, qword_1801171F0, v130);
                      else
                        sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 1195, 23);
                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                      if ( (_BYTE)result != 0 )
                        goto LABEL_51;
                      goto LABEL_663;
                    }
LABEL_937:
                    JUMPOUT(0x18001DFE5LL);
                  }
LABEL_51:
                  v18 = (_QWORD *)v138;
                  if ( (_QWORD)v138 != 0 )
                  {
                    do
                    {
                      v19 = (_QWORD *)*v18;
                      result = sub_1800C0DC0(v18);
                      v18 = v19;
                    }
                    while ( v19 != nullptr );
                  }
                  v20 = v137;
                  *(_QWORD *)&v137 = 0;
                  if ( v20 != 0 )
                    return sub_1800C0DC0(v20);
                  return result;
                }
                sub_180026DB0(&v137, &v134);
                sub_180026DB0(&v137, &v136);
                sub_180002660(a1, &v137);
                LODWORD(v135) = 2596;
                v133 = v15;
                v130 = v15 ^ 0x440BF7E65C13CEDCLL;
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                  goto LABEL_506;
                LODWORD(v133) = 1;
                if ( qword_180117128 == 0
                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                       a1,
                       qword_180117128,
                       0) != 0 )
                {
                  sub_1800C68B0(&unk_180117058);
                  if ( qword_180117128 == 0
                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                         a1,
                         qword_180117128,
                         0) != 0 )
                  {
                    v69 = sub_1800023C0(a1);
                    if ( v69 != 0 )
                    {
                      qword_180117128 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v69);
                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v69);
                    }
                  }
                  sub_1800C6900(&unk_180117058);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                    goto LABEL_506;
                }
                if ( (int)v133 < 0 )
                {
                  sub_180002110(a1, qword_180116F00 + 718, qword_180116F00 + 755, 23);
                }
                else
                {
                  v133 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, _QWORD))(*(_QWORD *)a1 + 1376LL))(
                           a1,
                           (unsigned int)v133,
                           qword_180117128,
                           0);
                  sub_1800036C0((__int64)v140, (float *)&v137, &v133, &v133);
                }
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                  goto LABEL_506;
                if ( qword_180117130 != 0
                  && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                       a1,
                       qword_180117130,
                       0) == 0 )
                {
                  goto LABEL_591;
                }
                sub_1800C68B0(&unk_180117060);
                if ( qword_180117130 == 0
                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                       a1,
                       qword_180117130,
                       0) != 0 )
                {
                  v76 = sub_1800023C0(a1);
                  if ( v76 != 0 )
                  {
                    qword_180117130 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v76);
                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v76);
                  }
                }
                sub_1800C6900(&unk_180117060);
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                {
LABEL_506:
                  v73 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                  (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                  v142 = v73;
                  v141[0] = v73;
                  sub_180026960(v140, &v137, v141, v141);
                  v66 = 0;
                }
                else
                {
LABEL_591:
                  v66 = sub_180002610(a1, a2);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                  {
                    v129 = v66;
                    if ( qword_180117130 != 0
                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117130,
                           0) == 0 )
                    {
                      goto LABEL_690;
                    }
                    sub_1800C68B0(&unk_180117060);
                    if ( qword_180117130 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117130,
                           0) != 0 )
                    {
                      v92 = sub_1800023C0(a1);
                      if ( v92 != 0 )
                      {
                        qword_180117130 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                            a1,
                                            v92);
                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v92);
                      }
                    }
                    sub_1800C6900(&unk_180117060);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                    {
LABEL_690:
                      v131 = qword_180116F50;
                      v132 = qword_180116F58;
                      if ( qword_180117138 != 0
                        && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117138,
                             0) == 0 )
                      {
                        goto LABEL_961;
                      }
                      sub_1800C68B0(&unk_180117068);
                      if ( qword_180117138 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117138,
                             0) != 0 )
                      {
                        v98 = sub_1800023C0(a1);
                        if ( v98 != 0 )
                        {
                          qword_180117138 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                              a1,
                                              v98);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v98);
                        }
                      }
                      sub_1800C6900(&unk_180117068);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                      {
LABEL_961:
                        if ( qword_1801171D8 != 0
                          || (qword_1801171D8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                                  a1,
                                                  qword_180117138,
                                                  qword_180116F00 + 780,
                                                  qword_180116F00 + 807),
                              (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0) )
                        {
                          v132 = sub_180002760(a1);
                          sub_1800036C0((__int64)v140, (float *)&v137, &v132, &v132);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                          {
                            if ( qword_180117140 != 0
                              && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                   a1,
                                   qword_180117140,
                                   0) == 0 )
                            {
                              goto LABEL_962;
                            }
                            sub_1800C68B0(&unk_180117070);
                            if ( qword_180117140 == 0
                              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                   a1,
                                   qword_180117140,
                                   0) != 0 )
                            {
                              v112 = sub_1800023C0(a1);
                              if ( v112 != 0 )
                              {
                                qword_180117140 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                    a1,
                                                    v112);
                                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v112);
                              }
                            }
                            sub_1800C6900(&unk_180117070);
                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                            {
LABEL_962:
                              if ( qword_1801171E0 != 0
                                || (qword_1801171E0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                                        a1,
                                                        qword_180117140,
                                                        qword_180116F00 + 880,
                                                        qword_180116F00 + 891,
                                                        v8),
                                    (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0) )
                              {
                                if ( v129 != 0 )
                                {
                                  v129 = sub_180002790(a1);
                                  sub_1800036C0((__int64)v140, (float *)&v137, &v129, &v129);
                                  JUMPOUT(0x18000C0D5LL);
                                }
                                JUMPOUT(0x18000C0B5LL);
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  v121 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                  (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                  v142 = v121;
                  v141[0] = v121;
                  sub_180026960(v140, &v137, v141, v141);
                }
                if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                       a1,
                       v142,
                       qword_1801170F0) == 0 )
                  goto LABEL_443;
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                  goto LABEL_861;
                sub_180026DB0(&v137, &v142);
                sub_180026DB0(&v137, &v134);
                sub_180026DB0(&v137, &v136);
                sub_180002660(a1, &v137);
                v135 = v142;
                if ( qword_180117158 == 0
                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                       a1,
                       qword_180117158,
                       0) != 0 )
                {
                  sub_1800C68B0(&unk_180117088);
                  if ( qword_180117158 == 0
                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                         a1,
                         qword_180117158,
                         0) != 0 )
                  {
                    v74 = sub_1800023C0(a1);
                    if ( v74 != 0 )
                    {
                      qword_180117158 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v74);
                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v74);
                    }
                  }
                  sub_1800C6900(&unk_180117088);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                  {
LABEL_861:
                    v122 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                    (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                    v142 = v122;
                    v141[0] = v122;
                    sub_180026960(v140, &v137, v141, v141);
                    goto LABEL_443;
                  }
                }
                if ( v135 != 0 )
                {
                  v75 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                          a1,
                          v135,
                          qword_180117158);
                  LODWORD(v135) = v75;
                  if ( v75 != 0 )
                  {
LABEL_779:
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                    {
                      sub_180026DB0(&v137, &v142);
                      sub_180026DB0(&v137, &v134);
                      sub_180026DB0(&v137, &v136);
                      sub_180002660(a1, &v137);
                      v113 = v142;
                      if ( v142 != 0 )
                      {
                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v142);
                        v141[0] = v113;
                        sub_180026960(v140, &v137, v141, v141);
                      }
                      else
                      {
                        sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 666, 23);
                      }
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                        JUMPOUT(0x1800126C6LL);
                    }
                    goto LABEL_861;
                  }
                }
                else
                {
                  LODWORD(v135) = 0;
                }
                if ( qword_180117158 == 0
                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                       a1,
                       qword_180117158,
                       0) != 0 )
                {
                  sub_1800C68B0(&unk_180117088);
                  if ( qword_180117158 == 0
                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                         a1,
                         qword_180117158,
                         0) != 0 )
                  {
                    v84 = sub_1800023C0(a1);
                    if ( v84 != 0 )
                    {
                      qword_180117158 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v84);
                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v84);
                    }
                  }
                  sub_1800C6900(&unk_180117088);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                    goto LABEL_861;
                }
                v85 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 216LL))(a1, qword_180117158);
                v141[0] = v85;
                if ( v85 != 0 )
                {
                  v135 = v85;
                  sub_1800036C0((__int64)v140, (float *)&v137, v141, v141);
                }
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                  goto LABEL_861;
                v133 = v135;
                v130 = v142;
                v142 = v135;
                if ( qword_180117158 == 0
                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                       a1,
                       qword_180117158,
                       0) != 0 )
                {
                  sub_1800C68B0(&unk_180117088);
                  if ( qword_180117158 == 0
                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                         a1,
                         qword_180117158,
                         0) != 0 )
                  {
                    v93 = sub_1800023C0(a1);
                    if ( v93 != 0 )
                    {
                      qword_180117158 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v93);
                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v93);
                    }
                  }
                  sub_1800C6900(&unk_180117088);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                    goto LABEL_861;
                }
                if ( qword_1801171F0 == 0 )
                {
                  qword_1801171F0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                      a1,
                                      qword_180117158,
                                      qword_180116F00 + 1163,
                                      qword_180116F00 + 1170);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                    goto LABEL_861;
                }
                if ( v135 != 0 )
                  sub_180026870(a1, v135, qword_180117158, qword_1801171F0, v130);
                else
                  sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 1195, 23);
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                  goto LABEL_861;
                goto LABEL_779;
              }
              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
              if ( (_BYTE)result != 0 )
                goto LABEL_51;
              sub_180026DB0(&v137, &v134);
              sub_180026DB0(&v137, &v136);
              sub_180002660(a1, &v137);
              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
              if ( (_BYTE)result != 0 )
                goto LABEL_51;
              sub_180026DB0(&v137, &v134);
              sub_180026DB0(&v137, &v136);
              sub_180002660(a1, &v137);
              v57 = (float)(int)v135 + *(float *)&v142;
              *(float *)&v135 = a4;
              *(float *)&v142 = v57 - a4;
              if ( qword_180117168 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117168,
                     0) != 0 )
              {
                sub_1800C68B0(&unk_180117098);
                if ( qword_180117168 == 0
                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                       a1,
                       qword_180117168,
                       0) != 0 )
                {
                  v58 = sub_1800023C0(a1);
                  if ( v58 != 0 )
                  {
                    qword_180117168 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v58);
                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v58);
                  }
                }
                sub_1800C6900(&unk_180117098);
                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                if ( (_BYTE)result != 0 )
                  goto LABEL_51;
              }
              v59 = qword_180117200;
              if ( qword_180117200 == 0 )
              {
                qword_180117200 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                    a1,
                                    qword_180117168,
                                    qword_180116F00 + 1270,
                                    qword_180116F00 + 1283);
                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                if ( (_BYTE)result != 0 )
                  goto LABEL_51;
                v59 = qword_180117200;
              }
              LODWORD(v142) = sub_1800268D0(a1, qword_180117168, v59, *(float *)&v142);
              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
              if ( (_BYTE)result != 0 )
                goto LABEL_51;
              v60 = *(float *)&v142;
              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
              if ( (_BYTE)result != 0 )
                goto LABEL_51;
              LODWORD(v142) = 0;
              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
              if ( (_BYTE)result != 0 )
                goto LABEL_51;
              LODWORD(v142) = 0;
              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
              if ( (_BYTE)result != 0 )
                goto LABEL_51;
              LODWORD(v142) = 0;
              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
              if ( (_BYTE)result != 0 )
                goto LABEL_51;
              LODWORD(v142) = 0;
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_629;
              v90 = 1;
              if ( v60 <= -22.5 )
              {
                v90 = 0;
                if ( v60 != -22.5 )
                  v90 = -1;
              }
              LODWORD(v142) = v90;
              v135 = v136;
              sub_1800036C0((__int64)v140, (float *)&v137, &v135, &v135);
              if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(a1, v135, 0) != 0 )
                JUMPOUT(0x18000DFFELL);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              {
LABEL_629:
                v91 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                v142 = v91;
                v141[0] = v91;
                sub_180026960(v140, &v137, v141, v141);
                if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                       a1,
                       v142,
                       qword_1801170F8) == 0 )
                  goto LABEL_937;
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                  goto LABEL_866;
                sub_180026DB0(&v137, &v142);
                sub_180026DB0(&v137, &v134);
                sub_180026DB0(&v137, &v136);
                sub_180002660(a1, &v137);
                if ( qword_180117100 == 0
                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                       a1,
                       qword_180117100,
                       0) != 0 )
                {
                  sub_1800C68B0(&unk_180117030);
                  if ( qword_180117100 == 0
                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                         a1,
                         qword_180117100,
                         0) != 0 )
                  {
                    v96 = sub_1800023C0(a1);
                    if ( v96 != 0 )
                    {
                      qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v96);
                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v96);
                    }
                  }
                  sub_1800C6900(&unk_180117030);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                    goto LABEL_866;
                }
                if ( qword_1801171C8 == 0 )
                {
                  qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                      a1,
                                      qword_180117100,
                                      qword_180116F00 + 165,
                                      qword_180116F00 + 611);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                    goto LABEL_866;
                }
                v142 = sub_180002760(a1);
                sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                  goto LABEL_866;
                v108 = v142;
                if ( v142 != 0 )
                {
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v142);
                  v141[0] = v108;
                  sub_180026960(v140, &v137, v141, v141);
                }
                else
                {
                  sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 666, 55);
                }
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                  goto LABEL_866;
              }
              else
              {
                if ( (int)v142 < 0 )
                  JUMPOUT(0x18000DAFBLL);
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                  goto LABEL_866;
              }
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                JUMPOUT(0x18000BC91LL);
LABEL_866:
              v123 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
              (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
              v142 = v123;
              v141[0] = v123;
              sub_180026960(v140, &v137, v141, v141);
              if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                     a1,
                     v142,
                     qword_1801170F8) != 0 )
              {
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                {
                  v124 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                  (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                  v142 = v124;
                  v141[0] = v124;
                  sub_180026960(v140, &v137, v141, v141);
                  JUMPOUT(0x18000D561LL);
                }
                JUMPOUT(0x18000BD79LL);
              }
              goto LABEL_937;
            }
            goto LABEL_346;
          }
          goto LABEL_191;
        }
LABEL_167:
        v31 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
        (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
        v142 = v31;
        v141[0] = v31;
        sub_180026960(v140, &v137, v141, v141);
        if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
               a1,
               v142,
               qword_1801170F8) == 0 )
          goto LABEL_937;
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
        {
          sub_180026DB0(&v137, &v142);
          sub_180026DB0(&v137, &v134);
          sub_180026DB0(&v137, &v136);
          sub_180002660(a1, &v137);
          if ( qword_180117100 != 0
            && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                 a1,
                 qword_180117100,
                 0) == 0 )
          {
            goto LABEL_186;
          }
          sub_1800C68B0(&unk_180117030);
          if ( qword_180117100 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                 a1,
                 qword_180117100,
                 0) != 0 )
          {
            v32 = sub_1800023C0(a1);
            if ( v32 != 0 )
            {
              qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v32);
              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v32);
            }
          }
          sub_1800C6900(&unk_180117030);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
          {
LABEL_186:
            if ( qword_1801171C8 != 0
              || (qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                      a1,
                                      qword_180117100,
                                      qword_180116F00 + 165,
                                      qword_180116F00 + 611),
                  (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0) )
            {
              v142 = sub_180002760(a1);
              sub_1800036C0((__int64)v140, (float *)&v137, &v142, &v142);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
              {
                v33 = v142;
                if ( v142 != 0 )
                {
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v142);
                  v141[0] = v33;
                  sub_180026960(v140, &v137, v141, v141);
                }
                else
                {
                  sub_180002110(a1, qword_180116F00 + 109, qword_180116F00 + 666, 9);
                }
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                  goto LABEL_190;
              }
            }
          }
        }
        v34 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
        (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
        v142 = v34;
        v141[0] = v34;
        sub_180026960(v140, &v137, v141, v141);
        goto LABEL_192;
      }
    }
  }
  return result;
}


/* ===== chunk 18000BC91 .. 180013C78 ===== */
void __fastcall sub_18000BC91()
{
  __int64 v0; // rbp
  __int64 v1; // rsi
  float v2; // xmm6_4
  int v3; // eax
  __int64 v4; // rbx
  __int64 v5; // rbx
  __int64 v6; // rbx
  int v7; // eax
  __int64 v8; // rdx
  __int64 v9; // rax
  __int64 v10; // rbx
  __int64 v11; // rbx
  __int64 v12; // rbx
  __int64 v13; // rbx
  int v14; // eax
  __int64 v15; // rdx
  __int64 v16; // rax
  __int64 v17; // rbx
  __int64 v18; // rbx
  __int64 v19; // rbx
  __int64 v20; // rbx
  __int64 v21; // rbx
  int v22; // eax
  __int64 v23; // rbx
  __int64 v24; // rbx
  __int64 v25; // rbx
  __int64 v26; // rbx
  __int64 v27; // rbx

  sub_180026DB0(v0 + 48, v0 + 24);
  sub_180026DB0(v0 + 48, v0 + 40);
  sub_180002660(v1, v0 + 48);
  v3 = 1;
  if ( v2 <= 22.5 )
  {
    v3 = 0;
    if ( v2 != 22.5 )
      v3 = 2 * (v2 >= 22.5) - 1;
  }
  *(_DWORD *)(v0 + 136) = v3;
  *(_QWORD *)(v0 + 32) = *(_QWORD *)(v0 + 40);
  sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 32), (_QWORD *)(v0 + 32));
  if ( (*(unsigned __int8 (__fastcall **)(__int64, _QWORD, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, *(_QWORD *)(v0 + 32), 0) != 0 )
    goto LABEL_32;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0
    || (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
  {
    v4 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 120LL))(v1);
    (*(void (__fastcall **)(__int64))(*(_QWORD *)v1 + 136LL))(v1);
    *(_QWORD *)(v0 + 136) = v4;
    *(_QWORD *)(v0 + 112) = v4;
    sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
    if ( (*(unsigned __int8 (__fastcall **)(__int64, _QWORD, __int64))(*(_QWORD *)v1 + 256LL))(
           v1,
           *(_QWORD *)(v0 + 136),
           qword_1801170F8) == 0 )
      goto LABEL_165;
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
      goto LABEL_166;
    sub_180026DB0(v0 + 48, v0 + 136);
    sub_180026DB0(v0 + 48, v0 + 24);
    sub_180026DB0(v0 + 48, v0 + 40);
    sub_180002660(v1, v0 + 48);
    if ( qword_180117100 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117100, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117030);
      if ( qword_180117100 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117100, 0) != 0 )
      {
        v5 = sub_1800023C0(v1);
        if ( v5 != 0 )
        {
          qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 1808LL))(v1, v5);
          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 184LL))(v1, v5);
        }
      }
      sub_1800C6900(&unk_180117030);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_166;
    }
    if ( qword_1801171C8 == 0 )
    {
      qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 904LL))(
                          v1,
                          qword_180117100,
                          qword_180116F00 + 165,
                          qword_180116F00 + 611);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_166;
    }
    *(_QWORD *)(v0 + 136) = sub_180002760(v1);
    sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 136), (_QWORD *)(v0 + 136));
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
      goto LABEL_166;
    v6 = *(_QWORD *)(v0 + 136);
    if ( v6 != 0 )
    {
      (*(void (__fastcall **)(__int64, _QWORD))(*(_QWORD *)v1 + 104LL))(v1, *(_QWORD *)(v0 + 136));
      *(_QWORD *)(v0 + 112) = v6;
      sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
    }
    else
    {
      sub_180002110(v1, qword_180116F00 + 109, qword_180116F00 + 666, 55);
    }
  }
  else
  {
    sub_180026DB0(v0 + 48, v0 + 24);
    sub_180026DB0(v0 + 48, v0 + 40);
    sub_180002660(v1, v0 + 48);
    if ( *(int *)(v0 + 136) >= 0 )
    {
LABEL_27:
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_166;
      sub_180026DB0(v0 + 48, v0 + 24);
      sub_180026DB0(v0 + 48, v0 + 40);
      sub_180002660(v1, v0 + 48);
      *(_DWORD *)(v0 + 32) = -1045168128;
      v7 = 1;
      if ( v2 <= -22.5 )
      {
        v7 = 0;
        if ( v2 != -22.5 )
          v7 = 2 * (v2 >= -22.5) - 1;
      }
      *(_DWORD *)(v0 + 136) = v7;
LABEL_32:
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_35;
      sub_180026DB0(v0 + 48, v0 + 24);
      sub_180026DB0(v0 + 48, v0 + 40);
      sub_180002660(v1, v0 + 48);
      *(_QWORD *)(v0 + 32) = *(_QWORD *)(v0 + 40);
      sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 32), (_QWORD *)(v0 + 32));
      v8 = *(_QWORD *)(v0 + 32);
      v9 = *(_QWORD *)v1;
      *(_QWORD *)(v0 - 56) = 0;
      if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(v9 + 192))(v1, v8, 0) != 0 )
        goto LABEL_110;
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
      {
LABEL_35:
        v10 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 120LL))(v1);
        (*(void (__fastcall **)(__int64))(*(_QWORD *)v1 + 136LL))(v1);
        *(_QWORD *)(v0 + 136) = v10;
        *(_QWORD *)(v0 + 112) = v10;
        sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
        if ( (*(unsigned __int8 (__fastcall **)(__int64, _QWORD, __int64))(*(_QWORD *)v1 + 256LL))(
               v1,
               *(_QWORD *)(v0 + 136),
               qword_1801170F8) == 0 )
          goto LABEL_165;
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
          goto LABEL_58;
        sub_180026DB0(v0 + 48, v0 + 136);
        sub_180026DB0(v0 + 48, v0 + 24);
        sub_180026DB0(v0 + 48, v0 + 40);
        sub_180002660(v1, v0 + 48);
        if ( qword_180117100 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(
               v1,
               qword_180117100,
               0) != 0 )
        {
          sub_1800C68B0(&unk_180117030);
          if ( qword_180117100 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(
                 v1,
                 qword_180117100,
                 0) != 0 )
          {
            v11 = sub_1800023C0(v1);
            if ( v11 != 0 )
            {
              qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 1808LL))(v1, v11);
              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 184LL))(v1, v11);
            }
          }
          sub_1800C6900(&unk_180117030);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_58;
        }
        if ( qword_1801171C8 == 0 )
        {
          qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 904LL))(
                              v1,
                              qword_180117100,
                              qword_180116F00 + 165,
                              qword_180116F00 + 611);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_58;
        }
        *(_QWORD *)(v0 + 136) = sub_180002760(v1);
        sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 136), (_QWORD *)(v0 + 136));
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
          goto LABEL_58;
        v12 = *(_QWORD *)(v0 + 136);
        if ( v12 != 0 )
        {
          (*(void (__fastcall **)(__int64, _QWORD))(*(_QWORD *)v1 + 104LL))(v1, *(_QWORD *)(v0 + 136));
          *(_QWORD *)(v0 + 112) = v12;
          sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
        }
        else
        {
          sub_180002110(v1, qword_180116F00 + 109, qword_180116F00 + 666, 7);
        }
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
          goto LABEL_58;
      }
      else
      {
        if ( *(int *)(v0 + 136) >= 0 )
          goto LABEL_99;
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
          goto LABEL_58;
      }
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) == 0 )
      {
        sub_180026DB0(v0 + 48, v0 + 24);
        sub_180026DB0(v0 + 48, v0 + 40);
        sub_180002660(v1, v0 + 48);
        v14 = 1;
        if ( v2 <= -67.5 )
        {
          v14 = 0;
          if ( v2 != -67.5 )
            v14 = -1;
        }
        *(_DWORD *)(v0 + 136) = v14;
        *(_QWORD *)(v0 + 32) = *(_QWORD *)(v0 + 40);
        sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 32), (_QWORD *)(v0 + 32));
        v15 = *(_QWORD *)(v0 + 32);
        v16 = *(_QWORD *)v1;
        *(_QWORD *)(v0 - 56) = 0;
        if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(v16 + 192))(v1, v15, 0) != 0 )
        {
LABEL_110:
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_113;
          sub_180026DB0(v0 + 48, v0 + 24);
          sub_180026DB0(v0 + 48, v0 + 40);
          sub_180002660(v1, v0 + 48);
          *(_QWORD *)(v0 + 32) = *(_QWORD *)(v0 + 40);
          sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 32), (_QWORD *)(v0 + 32));
          if ( (*(unsigned __int8 (__fastcall **)(__int64, _QWORD, _QWORD))(*(_QWORD *)v1 + 192LL))(
                 v1,
                 *(_QWORD *)(v0 + 32),
                 0) != 0 )
            JUMPOUT(0x1800157A6LL);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
          {
LABEL_113:
            v23 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 120LL))(v1);
            (*(void (__fastcall **)(__int64))(*(_QWORD *)v1 + 136LL))(v1);
            *(_QWORD *)(v0 + 136) = v23;
            *(_QWORD *)(v0 + 112) = v23;
            sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
            if ( (*(unsigned __int8 (__fastcall **)(__int64, _QWORD, __int64))(*(_QWORD *)v1 + 256LL))(
                   v1,
                   *(_QWORD *)(v0 + 136),
                   qword_1801170F8) == 0 )
              goto LABEL_165;
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
              goto LABEL_136;
            sub_180026DB0(v0 + 48, v0 + 136);
            sub_180026DB0(v0 + 48, v0 + 24);
            sub_180026DB0(v0 + 48, v0 + 40);
            sub_180002660(v1, v0 + 48);
            if ( qword_180117100 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(
                   v1,
                   qword_180117100,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117030);
              if ( qword_180117100 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(
                     v1,
                     qword_180117100,
                     0) != 0 )
              {
                v24 = sub_1800023C0(v1);
                if ( v24 != 0 )
                {
                  qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 1808LL))(v1, v24);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 184LL))(v1, v24);
                }
              }
              sub_1800C6900(&unk_180117030);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
                goto LABEL_136;
            }
            if ( qword_1801171C8 == 0 )
            {
              qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 904LL))(
                                  v1,
                                  qword_180117100,
                                  qword_180116F00 + 165,
                                  qword_180116F00 + 611);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
                goto LABEL_136;
            }
            *(_QWORD *)(v0 + 136) = sub_180002760(v1);
            sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 136), (_QWORD *)(v0 + 136));
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
              goto LABEL_136;
            v25 = *(_QWORD *)(v0 + 136);
            if ( v25 != 0 )
            {
              (*(void (__fastcall **)(__int64, _QWORD))(*(_QWORD *)v1 + 104LL))(v1, *(_QWORD *)(v0 + 136));
              *(_QWORD *)(v0 + 112) = v25;
              sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
            }
            else
            {
              sub_180002110(v1, qword_180116F00 + 109, qword_180116F00 + 666, 89);
            }
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            {
LABEL_136:
              v26 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 120LL))(v1);
              (*(void (__fastcall **)(__int64))(*(_QWORD *)v1 + 136LL))(v1);
              *(_QWORD *)(v0 + 136) = v26;
              *(_QWORD *)(v0 + 112) = v26;
              sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
              if ( (*(unsigned __int8 (__fastcall **)(__int64, _QWORD, __int64))(*(_QWORD *)v1 + 256LL))(
                     v1,
                     *(_QWORD *)(v0 + 136),
                     qword_1801170F8) != 0 )
              {
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
                {
                  v27 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 120LL))(v1);
                  (*(void (__fastcall **)(__int64))(*(_QWORD *)v1 + 136LL))(v1);
                  *(_QWORD *)(v0 + 136) = v27;
                  *(_QWORD *)(v0 + 112) = v27;
                  sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
                  JUMPOUT(0x180014FC6LL);
                }
                JUMPOUT(0x180013E81LL);
              }
LABEL_165:
              JUMPOUT(0x18001DFE5LL);
            }
          }
          else
          {
            if ( *(int *)(v0 + 136) >= 0 )
              JUMPOUT(0x18001572DLL);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
              goto LABEL_136;
          }
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) == 0 )
            JUMPOUT(0x180013DAELL);
          goto LABEL_136;
        }
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
          goto LABEL_84;
LABEL_83:
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        {
LABEL_84:
          v19 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 120LL))(v1);
          (*(void (__fastcall **)(__int64))(*(_QWORD *)v1 + 136LL))(v1);
          *(_QWORD *)(v0 + 136) = v19;
          *(_QWORD *)(v0 + 112) = v19;
          sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
          if ( (*(unsigned __int8 (__fastcall **)(__int64, _QWORD, __int64))(*(_QWORD *)v1 + 256LL))(
                 v1,
                 *(_QWORD *)(v0 + 136),
                 qword_1801170F8) == 0 )
            goto LABEL_165;
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_166;
          sub_180026DB0(v0 + 48, v0 + 136);
          sub_180026DB0(v0 + 48, v0 + 24);
          sub_180026DB0(v0 + 48, v0 + 40);
          sub_180002660(v1, v0 + 48);
          if ( qword_180117100 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(
                 v1,
                 qword_180117100,
                 0) != 0 )
          {
            sub_1800C68B0(&unk_180117030);
            if ( qword_180117100 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(
                   v1,
                   qword_180117100,
                   0) != 0 )
            {
              v20 = sub_1800023C0(v1);
              if ( v20 != 0 )
              {
                qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 1808LL))(v1, v20);
                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 184LL))(v1, v20);
              }
            }
            sub_1800C6900(&unk_180117030);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
              goto LABEL_166;
          }
          if ( qword_1801171C8 == 0 )
          {
            qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 904LL))(
                                v1,
                                qword_180117100,
                                qword_180116F00 + 165,
                                qword_180116F00 + 611);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
              goto LABEL_166;
          }
          *(_QWORD *)(v0 + 136) = sub_180002760(v1);
          sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 136), (_QWORD *)(v0 + 136));
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_166;
          v21 = *(_QWORD *)(v0 + 136);
          if ( v21 != 0 )
          {
            (*(void (__fastcall **)(__int64, _QWORD))(*(_QWORD *)v1 + 104LL))(v1, *(_QWORD *)(v0 + 136));
            *(_QWORD *)(v0 + 112) = v21;
            sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
          }
          else
          {
            sub_180002110(v1, qword_180116F00 + 109, qword_180116F00 + 666, 7);
          }
          goto LABEL_101;
        }
        sub_180026DB0(v0 + 48, v0 + 24);
        sub_180026DB0(v0 + 48, v0 + 40);
        sub_180002660(v1, v0 + 48);
        if ( *(int *)(v0 + 136) >= 0 )
        {
LABEL_101:
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_166;
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_166;
          sub_180026DB0(v0 + 48, v0 + 24);
          sub_180026DB0(v0 + 48, v0 + 40);
          sub_180002660(v1, v0 + 48);
          *(_DWORD *)(v0 + 136) = 1;
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_166;
          *(_DWORD *)(v0 + 136) = 1;
          *(_QWORD *)(v0 - 56) = 1;
          goto LABEL_105;
        }
LABEL_99:
        *(_QWORD *)(v0 - 56) = 0;
LABEL_105:
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) == 0 )
        {
          sub_180026DB0(v0 + 48, v0 + 24);
          sub_180026DB0(v0 + 48, v0 + 40);
          sub_180002660(v1, v0 + 48);
          *(_DWORD *)(v0 + 32) = -1031340032;
          v22 = 1;
          if ( v2 <= -67.5 )
          {
            v22 = 0;
            if ( v2 != -67.5 )
              v22 = 2 * (v2 >= -67.5) - 1;
          }
          *(_DWORD *)(v0 + 136) = v22;
          goto LABEL_110;
        }
LABEL_166:
        JUMPOUT(0x180004308LL);
      }
LABEL_58:
      v13 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 120LL))(v1);
      (*(void (__fastcall **)(__int64))(*(_QWORD *)v1 + 136LL))(v1);
      *(_QWORD *)(v0 + 136) = v13;
      *(_QWORD *)(v0 + 112) = v13;
      sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
      if ( (*(unsigned __int8 (__fastcall **)(__int64, _QWORD, __int64))(*(_QWORD *)v1 + 256LL))(
             v1,
             *(_QWORD *)(v0 + 136),
             qword_1801170F8) == 0 )
        goto LABEL_165;
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_84;
      sub_180026DB0(v0 + 48, v0 + 136);
      sub_180026DB0(v0 + 48, v0 + 24);
      sub_180026DB0(v0 + 48, v0 + 40);
      sub_180002660(v1, v0 + 48);
      if ( qword_180117100 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117100, 0) != 0 )
      {
        sub_1800C68B0(&unk_180117030);
        if ( qword_180117100 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(
               v1,
               qword_180117100,
               0) != 0 )
        {
          v17 = sub_1800023C0(v1);
          if ( v17 != 0 )
          {
            qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 1808LL))(v1, v17);
            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 184LL))(v1, v17);
          }
        }
        sub_1800C6900(&unk_180117030);
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
          goto LABEL_84;
      }
      if ( qword_1801171C8 == 0 )
      {
        qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 904LL))(
                            v1,
                            qword_180117100,
                            qword_180116F00 + 165,
                            qword_180116F00 + 611);
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
          goto LABEL_84;
      }
      *(_QWORD *)(v0 + 136) = sub_180002760(v1);
      sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 136), (_QWORD *)(v0 + 136));
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_84;
      v18 = *(_QWORD *)(v0 + 136);
      if ( v18 != 0 )
      {
        (*(void (__fastcall **)(__int64, _QWORD))(*(_QWORD *)v1 + 104LL))(v1, *(_QWORD *)(v0 + 136));
        *(_QWORD *)(v0 + 112) = v18;
        sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
      }
      else
      {
        sub_180002110(v1, qword_180116F00 + 109, qword_180116F00 + 666, 7);
      }
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_84;
      goto LABEL_83;
    }
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0
    || (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
  {
    goto LABEL_166;
  }
  sub_180026DB0(v0 + 48, v0 + 24);
  sub_180026DB0(v0 + 48, v0 + 40);
  sub_180002660(v1, v0 + 48);
  *(_DWORD *)(v0 + 136) = 1;
  goto LABEL_27;
}


/* ===== chunk 180013C78 .. 18001BC31 ===== */
/* decompile failed */

/* ===== chunk 18001BC31 .. 1800215C8 ===== */
void __fastcall sub_18001BC31()
{
  __int64 v0; // rbp
  __int64 v1; // rsi
  float v2; // xmm6_4
  __int64 v3; // rbx
  __int64 v4; // rbx
  __int64 v5; // rbx
  __int64 v6; // rbx
  int v7; // eax
  __int64 v8; // rbx
  __int64 v9; // rbx
  __int64 v10; // rbx
  __int64 v11; // rbx
  int v12; // eax
  __int64 v13; // rbx
  __int64 v14; // rbx
  __int64 v15; // rbx
  __int64 v16; // rbx
  __int64 v17; // rbx
  int v18; // eax
  __int64 v19; // rbx
  __int64 v20; // rbx
  __int64 v21; // rbx
  __int64 v22; // rbx
  __int64 v23; // rbx
  __int64 v24; // rbx
  int v25; // eax
  char v26; // al
  __int64 v27; // rbx
  __int64 v28; // rbx
  __int64 v29; // rbx

  if ( qword_1801171C8 == 0 )
  {
    qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 904LL))(
                        v1,
                        qword_180117100,
                        qword_180116F00 + 165,
                        qword_180116F00 + 611);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
      goto LABEL_10;
  }
  *(_QWORD *)(v0 + 136) = sub_180002760(v1);
  sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 136), (_QWORD *)(v0 + 136));
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
    goto LABEL_10;
  v3 = *(_QWORD *)(v0 + 136);
  if ( v3 != 0 )
  {
    (*(void (__fastcall **)(__int64, _QWORD))(*(_QWORD *)v1 + 104LL))(v1, *(_QWORD *)(v0 + 136));
    *(_QWORD *)(v0 + 112) = v3;
    sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
  }
  else
  {
    sub_180002110(v1, qword_180116F00 + 109, qword_180116F00 + 666, 5);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0
    || (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
  {
LABEL_10:
    v4 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 120LL))(v1);
    (*(void (__fastcall **)(__int64))(*(_QWORD *)v1 + 136LL))(v1);
    *(_QWORD *)(v0 + 136) = v4;
    *(_QWORD *)(v0 + 112) = v4;
    sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
    if ( (*(unsigned __int8 (__fastcall **)(__int64, _QWORD, __int64))(*(_QWORD *)v1 + 256LL))(
           v1,
           *(_QWORD *)(v0 + 136),
           qword_1801170F8) == 0 )
      goto LABEL_174;
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
      goto LABEL_201;
    sub_180026DB0(v0 + 48, v0 + 136);
    sub_180026DB0(v0 + 48, v0 + 24);
    sub_180026DB0(v0 + 48, v0 + 40);
    sub_180002660(v1, v0 + 48);
    if ( qword_180117100 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117100, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117030);
      if ( qword_180117100 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117100, 0) != 0 )
      {
        v5 = sub_1800023C0(v1);
        if ( v5 != 0 )
        {
          qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 1808LL))(v1, v5);
          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 184LL))(v1, v5);
        }
      }
      sub_1800C6900(&unk_180117030);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_201;
    }
    if ( qword_1801171C8 == 0 )
    {
      qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 904LL))(
                          v1,
                          qword_180117100,
                          qword_180116F00 + 165,
                          qword_180116F00 + 611);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_201;
    }
    *(_QWORD *)(v0 + 136) = sub_180002760(v1);
    sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 136), (_QWORD *)(v0 + 136));
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
      goto LABEL_201;
    v6 = *(_QWORD *)(v0 + 136);
    if ( v6 != 0 )
    {
      (*(void (__fastcall **)(__int64, _QWORD))(*(_QWORD *)v1 + 104LL))(v1, *(_QWORD *)(v0 + 136));
      *(_QWORD *)(v0 + 112) = v6;
      sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
    }
    else
    {
      sub_180002110(v1, qword_180116F00 + 109, qword_180116F00 + 666, 5);
    }
  }
  else
  {
    sub_180026DB0(v0 + 48, v0 + 24);
    sub_180026DB0(v0 + 48, v0 + 40);
    sub_180002660(v1, v0 + 48);
    if ( *(int *)(v0 + 136) >= 0 )
    {
      *(_QWORD *)(v0 - 48) = 0;
LABEL_31:
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_201;
      sub_180026DB0(v0 + 48, v0 + 24);
      sub_180026DB0(v0 + 48, v0 + 40);
      sub_180002660(v1, v0 + 48);
      *(_DWORD *)(v0 + 32) = 1116143616;
      v7 = 1;
      if ( v2 <= 67.5 )
      {
        v7 = 0;
        if ( v2 != 67.5 )
          v7 = -1;
      }
      *(_DWORD *)(v0 + 136) = v7;
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_38;
      sub_180026DB0(v0 + 48, v0 + 24);
      sub_180026DB0(v0 + 48, v0 + 40);
      sub_180002660(v1, v0 + 48);
      *(_QWORD *)(v0 + 32) = *(_QWORD *)(v0 + 40);
      sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 32), (_QWORD *)(v0 + 32));
      if ( (*(unsigned __int8 (__fastcall **)(__int64, _QWORD, _QWORD))(*(_QWORD *)v1 + 192LL))(
             v1,
             *(_QWORD *)(v0 + 32),
             0) != 0 )
        goto LABEL_112;
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
      {
LABEL_38:
        v8 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 120LL))(v1);
        (*(void (__fastcall **)(__int64))(*(_QWORD *)v1 + 136LL))(v1);
        *(_QWORD *)(v0 + 136) = v8;
        *(_QWORD *)(v0 + 112) = v8;
        sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
        if ( (*(unsigned __int8 (__fastcall **)(__int64, _QWORD, __int64))(*(_QWORD *)v1 + 256LL))(
               v1,
               *(_QWORD *)(v0 + 136),
               qword_1801170F8) == 0 )
          goto LABEL_174;
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
          goto LABEL_61;
        sub_180026DB0(v0 + 48, v0 + 136);
        sub_180026DB0(v0 + 48, v0 + 24);
        sub_180026DB0(v0 + 48, v0 + 40);
        sub_180002660(v1, v0 + 48);
        if ( qword_180117100 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(
               v1,
               qword_180117100,
               0) != 0 )
        {
          sub_1800C68B0(&unk_180117030);
          if ( qword_180117100 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(
                 v1,
                 qword_180117100,
                 0) != 0 )
          {
            v9 = sub_1800023C0(v1);
            if ( v9 != 0 )
            {
              qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 1808LL))(v1, v9);
              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 184LL))(v1, v9);
            }
          }
          sub_1800C6900(&unk_180117030);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_61;
        }
        if ( qword_1801171C8 == 0 )
        {
          qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 904LL))(
                              v1,
                              qword_180117100,
                              qword_180116F00 + 165,
                              qword_180116F00 + 611);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_61;
        }
        *(_QWORD *)(v0 + 136) = sub_180002760(v1);
        sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 136), (_QWORD *)(v0 + 136));
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
          goto LABEL_61;
        v10 = *(_QWORD *)(v0 + 136);
        if ( v10 != 0 )
        {
          (*(void (__fastcall **)(__int64, _QWORD))(*(_QWORD *)v1 + 104LL))(v1, *(_QWORD *)(v0 + 136));
          *(_QWORD *)(v0 + 112) = v10;
          sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
        }
        else
        {
          sub_180002110(v1, qword_180116F00 + 109, qword_180116F00 + 666, 67);
        }
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        {
LABEL_61:
          v11 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 120LL))(v1);
          (*(void (__fastcall **)(__int64))(*(_QWORD *)v1 + 136LL))(v1);
          *(_QWORD *)(v0 + 136) = v11;
          *(_QWORD *)(v0 + 112) = v11;
          sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
          if ( (*(unsigned __int8 (__fastcall **)(__int64, _QWORD, __int64))(*(_QWORD *)v1 + 256LL))(
                 v1,
                 *(_QWORD *)(v0 + 136),
                 qword_1801170F8) == 0 )
            goto LABEL_174;
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_87;
          sub_180026DB0(v0 + 48, v0 + 136);
          sub_180026DB0(v0 + 48, v0 + 24);
          sub_180026DB0(v0 + 48, v0 + 40);
          sub_180002660(v1, v0 + 48);
          if ( qword_180117100 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(
                 v1,
                 qword_180117100,
                 0) != 0 )
          {
            sub_1800C68B0(&unk_180117030);
            if ( qword_180117100 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(
                   v1,
                   qword_180117100,
                   0) != 0 )
            {
              v13 = sub_1800023C0(v1);
              if ( v13 != 0 )
              {
                qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 1808LL))(v1, v13);
                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 184LL))(v1, v13);
              }
            }
            sub_1800C6900(&unk_180117030);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
              goto LABEL_87;
          }
          if ( qword_1801171C8 == 0 )
          {
            qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 904LL))(
                                v1,
                                qword_180117100,
                                qword_180116F00 + 165,
                                qword_180116F00 + 611);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
              goto LABEL_87;
          }
          *(_QWORD *)(v0 + 136) = sub_180002760(v1);
          sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 136), (_QWORD *)(v0 + 136));
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_87;
          v14 = *(_QWORD *)(v0 + 136);
          if ( v14 != 0 )
          {
            (*(void (__fastcall **)(__int64, _QWORD))(*(_QWORD *)v1 + 104LL))(v1, *(_QWORD *)(v0 + 136));
            *(_QWORD *)(v0 + 112) = v14;
            sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
          }
          else
          {
            sub_180002110(v1, qword_180116F00 + 109, qword_180116F00 + 666, 67);
          }
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_87;
LABEL_86:
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
          {
LABEL_87:
            v15 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 120LL))(v1);
            (*(void (__fastcall **)(__int64))(*(_QWORD *)v1 + 136LL))(v1);
            *(_QWORD *)(v0 + 136) = v15;
            *(_QWORD *)(v0 + 112) = v15;
            sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
            if ( (*(unsigned __int8 (__fastcall **)(__int64, _QWORD, __int64))(*(_QWORD *)v1 + 256LL))(
                   v1,
                   *(_QWORD *)(v0 + 136),
                   qword_1801170F8) == 0 )
              goto LABEL_174;
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
              goto LABEL_201;
            sub_180026DB0(v0 + 48, v0 + 136);
            sub_180026DB0(v0 + 48, v0 + 24);
            sub_180026DB0(v0 + 48, v0 + 40);
            sub_180002660(v1, v0 + 48);
            if ( qword_180117100 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(
                   v1,
                   qword_180117100,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117030);
              if ( qword_180117100 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(
                     v1,
                     qword_180117100,
                     0) != 0 )
              {
                v16 = sub_1800023C0(v1);
                if ( v16 != 0 )
                {
                  qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 1808LL))(v1, v16);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 184LL))(v1, v16);
                }
              }
              sub_1800C6900(&unk_180117030);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
                goto LABEL_201;
            }
            if ( qword_1801171C8 == 0 )
            {
              qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 904LL))(
                                  v1,
                                  qword_180117100,
                                  qword_180116F00 + 165,
                                  qword_180116F00 + 611);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
                goto LABEL_201;
            }
            *(_QWORD *)(v0 + 136) = sub_180002760(v1);
            sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 136), (_QWORD *)(v0 + 136));
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
              goto LABEL_201;
            v17 = *(_QWORD *)(v0 + 136);
            if ( v17 != 0 )
            {
              (*(void (__fastcall **)(__int64, _QWORD))(*(_QWORD *)v1 + 104LL))(v1, *(_QWORD *)(v0 + 136));
              *(_QWORD *)(v0 + 112) = v17;
              sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
            }
            else
            {
              sub_180002110(v1, qword_180116F00 + 109, qword_180116F00 + 666, 67);
            }
            goto LABEL_104;
          }
          sub_180026DB0(v0 + 48, v0 + 24);
          sub_180026DB0(v0 + 48, v0 + 40);
          sub_180002660(v1, v0 + 48);
          if ( *(int *)(v0 + 136) < 0 )
          {
LABEL_104:
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0
              || (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            {
              goto LABEL_201;
            }
            sub_180026DB0(v0 + 48, v0 + 24);
            sub_180026DB0(v0 + 48, v0 + 40);
            sub_180002660(v1, v0 + 48);
            *(_DWORD *)(v0 + 136) = 1;
            *(_QWORD *)(v0 - 48) = 1;
          }
LABEL_107:
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_201;
          sub_180026DB0(v0 + 48, v0 + 24);
          sub_180026DB0(v0 + 48, v0 + 40);
          sub_180002660(v1, v0 + 48);
          *(_DWORD *)(v0 + 32) = 1102315520;
          v18 = 1;
          if ( v2 <= 22.5 )
          {
            v18 = 0;
            if ( v2 != 22.5 )
              v18 = -1;
          }
          *(_DWORD *)(v0 + 136) = v18;
          goto LABEL_112;
        }
      }
      else
      {
        if ( *(int *)(v0 + 136) < 0 )
          goto LABEL_107;
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
          goto LABEL_61;
      }
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_61;
      sub_180026DB0(v0 + 48, v0 + 24);
      sub_180026DB0(v0 + 48, v0 + 40);
      sub_180002660(v1, v0 + 48);
      v12 = 1;
      if ( v2 <= 112.5 )
      {
        v12 = 0;
        if ( v2 != 112.5 )
          v12 = 2 * (v2 >= 112.5) - 1;
      }
      *(_DWORD *)(v0 + 136) = v12;
      *(_QWORD *)(v0 + 32) = *(_QWORD *)(v0 + 40);
      sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 32), (_QWORD *)(v0 + 32));
      if ( (*(unsigned __int8 (__fastcall **)(__int64, _QWORD, _QWORD))(*(_QWORD *)v1 + 192LL))(
             v1,
             *(_QWORD *)(v0 + 32),
             0) == 0 )
      {
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
          goto LABEL_87;
        goto LABEL_86;
      }
LABEL_112:
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_115;
      sub_180026DB0(v0 + 48, v0 + 24);
      sub_180026DB0(v0 + 48, v0 + 40);
      sub_180002660(v1, v0 + 48);
      *(_QWORD *)(v0 + 32) = *(_QWORD *)(v0 + 40);
      sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 32), (_QWORD *)(v0 + 32));
      if ( (*(unsigned __int8 (__fastcall **)(__int64, _QWORD, _QWORD))(*(_QWORD *)v1 + 192LL))(
             v1,
             *(_QWORD *)(v0 + 32),
             0) != 0 )
      {
LABEL_159:
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) == 0 )
        {
          sub_180026DB0(v0 + 48, v0 + 24);
          sub_180026DB0(v0 + 48, v0 + 40);
          sub_180002660(v1, v0 + 48);
          *(_QWORD *)(v0 + 32) = *(_QWORD *)(v0 + 40);
          sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 32), (_QWORD *)(v0 + 32));
          if ( (*(unsigned __int8 (__fastcall **)(__int64, _QWORD, _QWORD))(*(_QWORD *)v1 + 192LL))(
                 v1,
                 *(_QWORD *)(v0 + 32),
                 0) != 0 )
          {
LABEL_183:
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) == 0 )
            {
              sub_180026DB0(v0 + 48, v0 + 24);
              sub_180026DB0(v0 + 48, v0 + 40);
              sub_180002660(v1, v0 + 48);
              goto LABEL_202;
            }
LABEL_201:
            JUMPOUT(0x180004308LL);
          }
          if ( *(int *)(v0 + 136) >= 0 )
            goto LABEL_202;
LABEL_179:
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_201;
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_201;
          sub_180026DB0(v0 + 48, v0 + 24);
          sub_180026DB0(v0 + 48, v0 + 40);
          sub_180002660(v1, v0 + 48);
          *(_DWORD *)(v0 + 136) = 1;
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_201;
          *(_DWORD *)(v0 + 136) = 1;
          *(_QWORD *)(v0 - 48) = 1;
          goto LABEL_183;
        }
        v27 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 120LL))(v1);
        (*(void (__fastcall **)(__int64))(*(_QWORD *)v1 + 136LL))(v1);
        *(_QWORD *)(v0 + 136) = v27;
        *(_QWORD *)(v0 + 112) = v27;
        sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
        if ( (*(unsigned __int8 (__fastcall **)(__int64, _QWORD, __int64))(*(_QWORD *)v1 + 256LL))(
               v1,
               *(_QWORD *)(v0 + 136),
               qword_1801170F8) != 0 )
        {
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_201;
          sub_180026DB0(v0 + 48, v0 + 136);
          sub_180026DB0(v0 + 48, v0 + 24);
          sub_180026DB0(v0 + 48, v0 + 40);
          sub_180002660(v1, v0 + 48);
          if ( qword_180117100 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(
                 v1,
                 qword_180117100,
                 0) != 0 )
          {
            sub_1800C68B0(&unk_180117030);
            if ( qword_180117100 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(
                   v1,
                   qword_180117100,
                   0) != 0 )
            {
              v28 = sub_1800023C0(v1);
              if ( v28 != 0 )
              {
                qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 1808LL))(v1, v28);
                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 184LL))(v1, v28);
              }
            }
            sub_1800C6900(&unk_180117030);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
              goto LABEL_201;
          }
          if ( qword_1801171C8 == 0 )
          {
            qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 904LL))(
                                v1,
                                qword_180117100,
                                qword_180116F00 + 165,
                                qword_180116F00 + 611);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
              goto LABEL_201;
          }
          *(_QWORD *)(v0 + 136) = sub_180002760(v1);
          sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 136), (_QWORD *)(v0 + 136));
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_201;
          v29 = *(_QWORD *)(v0 + 136);
          if ( v29 != 0 )
          {
            (*(void (__fastcall **)(__int64, _QWORD))(*(_QWORD *)v1 + 104LL))(v1, *(_QWORD *)(v0 + 136));
            *(_QWORD *)(v0 + 112) = v29;
            sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
          }
          else
          {
            sub_180002110(v1, qword_180116F00 + 109, qword_180116F00 + 666, 75);
          }
          goto LABEL_179;
        }
LABEL_174:
        (*(void (__fastcall **)(__int64, _QWORD))(*(_QWORD *)v1 + 104LL))(v1, *(_QWORD *)(v0 + 136));
        goto LABEL_201;
      }
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
      {
LABEL_115:
        v19 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 120LL))(v1);
        (*(void (__fastcall **)(__int64))(*(_QWORD *)v1 + 136LL))(v1);
        *(_QWORD *)(v0 + 136) = v19;
        *(_QWORD *)(v0 + 112) = v19;
        sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
        if ( (*(unsigned __int8 (__fastcall **)(__int64, _QWORD, __int64))(*(_QWORD *)v1 + 256LL))(
               v1,
               *(_QWORD *)(v0 + 136),
               qword_1801170F8) == 0 )
          goto LABEL_174;
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
          goto LABEL_138;
        sub_180026DB0(v0 + 48, v0 + 136);
        sub_180026DB0(v0 + 48, v0 + 24);
        sub_180026DB0(v0 + 48, v0 + 40);
        sub_180002660(v1, v0 + 48);
        if ( qword_180117100 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(
               v1,
               qword_180117100,
               0) != 0 )
        {
          sub_1800C68B0(&unk_180117030);
          if ( qword_180117100 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(
                 v1,
                 qword_180117100,
                 0) != 0 )
          {
            v20 = sub_1800023C0(v1);
            if ( v20 != 0 )
            {
              qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 1808LL))(v1, v20);
              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 184LL))(v1, v20);
            }
          }
          sub_1800C6900(&unk_180117030);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_138;
        }
        if ( qword_1801171C8 == 0 )
        {
          qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 904LL))(
                              v1,
                              qword_180117100,
                              qword_180116F00 + 165,
                              qword_180116F00 + 611);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
            goto LABEL_138;
        }
        *(_QWORD *)(v0 + 136) = sub_180002760(v1);
        sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 136), (_QWORD *)(v0 + 136));
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
          goto LABEL_138;
        v21 = *(_QWORD *)(v0 + 136);
        if ( v21 != 0 )
        {
          (*(void (__fastcall **)(__int64, _QWORD))(*(_QWORD *)v1 + 104LL))(v1, *(_QWORD *)(v0 + 136));
          *(_QWORD *)(v0 + 112) = v21;
          sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
        }
        else
        {
          sub_180002110(v1, qword_180116F00 + 109, qword_180116F00 + 666, 75);
        }
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
          goto LABEL_138;
      }
      else
      {
        if ( *(int *)(v0 + 136) < 0 )
LABEL_202:
          JUMPOUT(0x180005DAELL);
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
          goto LABEL_138;
      }
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) == 0 )
      {
        sub_180026DB0(v0 + 48, v0 + 24);
        sub_180026DB0(v0 + 48, v0 + 40);
        sub_180002660(v1, v0 + 48);
        *(_DWORD *)(v0 + 32) = 1116143616;
        v25 = 1;
        if ( v2 <= 67.5 )
        {
          v25 = 0;
          if ( v2 != 67.5 )
            v25 = 2 * (v2 >= 67.5) - 1;
        }
        *(_DWORD *)(v0 + 136) = v25;
        v26 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1);
LABEL_158:
        if ( v26 != 0 )
          goto LABEL_201;
        goto LABEL_159;
      }
LABEL_138:
      v22 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 120LL))(v1);
      (*(void (__fastcall **)(__int64))(*(_QWORD *)v1 + 136LL))(v1);
      *(_QWORD *)(v0 + 136) = v22;
      *(_QWORD *)(v0 + 112) = v22;
      sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
      if ( (*(unsigned __int8 (__fastcall **)(__int64, _QWORD, __int64))(*(_QWORD *)v1 + 256LL))(
             v1,
             *(_QWORD *)(v0 + 136),
             qword_1801170F8) == 0 )
        goto LABEL_174;
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_201;
      sub_180026DB0(v0 + 48, v0 + 136);
      sub_180026DB0(v0 + 48, v0 + 24);
      sub_180026DB0(v0 + 48, v0 + 40);
      sub_180002660(v1, v0 + 48);
      if ( qword_180117100 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117100, 0) != 0 )
      {
        sub_1800C68B0(&unk_180117030);
        if ( qword_180117100 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(
               v1,
               qword_180117100,
               0) != 0 )
        {
          v23 = sub_1800023C0(v1);
          if ( v23 != 0 )
          {
            qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 1808LL))(v1, v23);
            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 184LL))(v1, v23);
          }
        }
        sub_1800C6900(&unk_180117030);
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
          goto LABEL_201;
      }
      if ( qword_1801171C8 == 0 )
      {
        qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 904LL))(
                            v1,
                            qword_180117100,
                            qword_180116F00 + 165,
                            qword_180116F00 + 611);
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
          goto LABEL_201;
      }
      *(_QWORD *)(v0 + 136) = sub_180002760(v1);
      sub_1800036C0(v0 + 88, (float *)(v0 + 48), (__int64 *)(v0 + 136), (_QWORD *)(v0 + 136));
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_201;
      v24 = *(_QWORD *)(v0 + 136);
      if ( v24 != 0 )
      {
        (*(void (__fastcall **)(__int64, _QWORD))(*(_QWORD *)v1 + 104LL))(v1, *(_QWORD *)(v0 + 136));
        *(_QWORD *)(v0 + 112) = v24;
        sub_180026960(v0 + 88, v0 + 48, v0 + 112, v0 + 112);
      }
      else
      {
        sub_180002110(v1, qword_180116F00 + 109, qword_180116F00 + 666, 75);
      }
      v26 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1);
      goto LABEL_158;
    }
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
    goto LABEL_201;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
    goto LABEL_201;
  sub_180026DB0(v0 + 48, v0 + 24);
  sub_180026DB0(v0 + 48, v0 + 40);
  sub_180002660(v1, v0 + 48);
  *(_DWORD *)(v0 + 136) = 1;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
    goto LABEL_201;
  *(_DWORD *)(v0 + 136) = 1;
  *(_QWORD *)(v0 - 48) = 1;
  goto LABEL_31;
}
