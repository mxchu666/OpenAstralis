__int64 __fastcall sub_180027160(__int64 a1, __int64 a2, __int64 a3)
{
  __int64 v6; // rdi
  __int64 v8; // rax
  __int64 v9; // r14
  __int64 v10; // rax
  __int64 v11; // r14
  __int64 v12; // r14
  __int64 v13; // r13
  __int64 v14; // rsi
  _QWORD *v15; // rcx
  _QWORD *v16; // rdi
  __int64 v17; // rcx
  __int64 v18; // r14
  __int64 v19; // rbx
  __int64 v20; // r14
  __int64 v21; // r12
  __int64 v22; // r14
  __int64 v23; // r14
  __int64 v24; // r14
  __int64 v25; // r12
  unsigned __int8 v26; // al
  __int64 v27; // r12
  __int64 v28; // rax
  __int64 v29; // r12
  __int64 v30; // r12
  __int64 v31; // r12
  __int64 v32; // r12
  __int64 v33; // r12
  __int64 v34; // rcx
  __int64 v35; // r12
  __int64 v36; // rax
  __int64 v37; // r12
  __int64 v38; // r12
  __int64 v39; // r12
  __int64 v40; // rax
  __int64 v41; // r12
  __int64 v42; // r12
  _BYTE *v43; // r8
  __int64 v44; // r12
  __int64 v45; // r12
  __int64 v46; // r12
  __int64 v47; // r12
  __int64 v48; // r8
  __int64 v49; // r12
  __int64 v50; // r12
  __int64 v51; // r12
  __int64 v52; // r12
  __int64 v53; // rbx
  __int64 v54; // rbx
  __int64 v55; // rax
  __int64 v56; // rbx
  __int64 v57; // rdi
  __int64 v58; // rdi
  __int64 v59; // r12
  __int64 v60; // r12
  _BYTE *v61; // r8
  __int64 v62; // r15
  __int64 v63; // r12
  __int64 v64; // r15
  __int64 v65; // r12
  __int64 v66; // r15
  __int64 v67; // r15
  __int64 v68; // r15
  __int64 v69; // r15
  __int64 v70; // r15
  unsigned __int8 v71; // al
  __int64 v72; // r15
  __int64 v73; // rax
  __int64 v74; // r15
  __int64 v75; // r15
  int v76; // r15d
  __int64 v77; // r12
  __int64 v78; // rax
  __int64 v79; // r12
  __int64 v80; // r12
  __int64 v81; // r12
  __int64 v82; // r12
  _BYTE *v83; // r8
  __int64 v84; // rax
  __int64 v85; // r15
  unsigned __int8 v86; // al
  __int64 v87; // r15
  __int64 v88; // r15
  __int64 v89; // r15
  __int64 v90; // r15
  __int64 v91; // r15
  _BYTE *v92; // r8
  __int64 v93; // r15
  __int64 v94; // r15
  __int64 v95; // r15
  __int64 v96; // r15
  _BYTE *v97; // r8
  __int64 v98; // r15
  __int64 v99; // r15
  __int64 v100; // r15
  __int64 v101; // rbx
  __int64 v102; // r15
  __int64 v103; // r12
  __int64 v104; // r15
  int v105; // r15d
  __int64 v106; // rdx
  __int64 v107; // rbx
  __int64 v108; // rbx
  __int64 v109; // rbx
  __int64 v110; // rcx
  __int64 v111; // rbx
  __int64 v112; // rax
  __int64 v113; // rbx
  __int64 v114; // rbx
  __int64 v115; // rbx
  __int64 v116; // rbx
  _BYTE *v117; // r8
  __int64 v118; // rax
  __int64 v119; // rbx
  __int64 v120; // r14
  __int64 v121; // rbx
  __int64 v122; // rbx
  __int64 v123; // rbx
  __int64 v124; // rbx
  __int64 v125; // rbx
  _BYTE *v126; // r8
  __int64 v127; // rbx
  __int64 v128; // rbx
  unsigned __int8 v129; // al
  __int64 v130; // rbx
  __int64 v131; // rax
  __int64 v132; // rbx
  __int64 v133; // rbx
  __int64 v134; // rbx
  __int64 v135; // r8
  __int64 v136; // rbx
  __int64 v137; // rbx
  char v138; // al
  __int64 v139; // rdx
  __int64 v140; // rbx
  __int64 v141; // [rsp+20h] [rbp-60h]
  __int64 v142; // [rsp+20h] [rbp-60h]
  __int64 v143; // [rsp+20h] [rbp-60h]
  __int64 v144; // [rsp+20h] [rbp-60h]
  __int64 v145; // [rsp+20h] [rbp-60h]
  __int64 v146; // [rsp+28h] [rbp-58h]
  __int64 v147; // [rsp+28h] [rbp-58h]
  __int64 v148; // [rsp+28h] [rbp-58h]
  int v149; // [rsp+38h] [rbp-48h]
  __int64 v150; // [rsp+38h] [rbp-48h]
  __int64 v151; // [rsp+40h] [rbp-40h] BYREF
  __int64 v152; // [rsp+48h] [rbp-38h] BYREF
  __int64 v153; // [rsp+50h] [rbp-30h] BYREF
  _BYTE v154[16]; // [rsp+58h] [rbp-28h] BYREF
  __int64 v155; // [rsp+68h] [rbp-18h]
  __int64 v156; // [rsp+70h] [rbp-10h] BYREF
  __int64 v157; // [rsp+78h] [rbp-8h] BYREF
  __int64 v158; // [rsp+80h] [rbp+0h] BYREF
  __int64 v159; // [rsp+88h] [rbp+8h] BYREF
  __int64 v160; // [rsp+90h] [rbp+10h] BYREF
  __int64 v161; // [rsp+98h] [rbp+18h] BYREF
  __int64 v162; // [rsp+A0h] [rbp+20h] BYREF
  __int64 v163; // [rsp+A8h] [rbp+28h] BYREF
  __int64 v164; // [rsp+B0h] [rbp+30h] BYREF
  __int64 v165; // [rsp+B8h] [rbp+38h] BYREF
  __int128 v166; // [rsp+C0h] [rbp+40h] BYREF
  __int128 v167; // [rsp+D0h] [rbp+50h]
  int v168; // [rsp+E0h] [rbp+60h]
  char v169; // [rsp+F0h] [rbp+70h] BYREF
  _BYTE v170[15]; // [rsp+F1h] [rbp+71h] BYREF
  _BYTE *v171; // [rsp+100h] [rbp+80h]
  __int64 v172[2]; // [rsp+108h] [rbp+88h] BYREF
  __int64 v173; // [rsp+118h] [rbp+98h]
  __int64 v174[8]; // [rsp+120h] [rbp+A0h] BYREF

  v6 = sub_1800025D0(a1, a2);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    return 0;
  if ( v6 == 0 )
  {
    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 144LL /*Throw/FatalError*/))(a1, /*0x8*/ "classloader == null");
    return 0;
  }
  if ( qword_1801175A0 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801175A0, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117490);
    if ( qword_1801175A0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801175A0, 0) != 0 )
    {
      v8 = sub_1800023C0(a1);
      if ( v8 != 0 )
      {
        v9 = v8;
        qword_1801175A0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v8);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v9);
      }
    }
    sub_1800C6900(&unk_180117490);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      return 0;
  }
  if ( qword_1801175A8 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801175A8, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117498);
    if ( qword_1801175A8 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801175A8, 0) != 0 )
    {
      v10 = sub_1800023C0(a1);
      if ( v10 != 0 )
      {
        v11 = v10;
        qword_1801175A8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v10);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v11);
      }
    }
    sub_1800C6900(&unk_180117498);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      return 0;
  }
  v174[0] = 0;
  v165 = 0;
  v159 = 0;
  v161 = 0;
  v164 = 0;
  v156 = 0;
  v158 = 0;
  v160 = 0;
  v163 = 0;
  v162 = 0;
  v153 = 0;
  v151 = 0;
  v152 = 0;
  v157 = 0;
  v167 = 0;
  v166 = 0;
  v168 = 1065353216;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_33;
  if ( qword_1801175B0 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801175B0, 0) != 0 )
  {
    sub_1800C68B0(&unk_1801174A0);
    if ( qword_1801175B0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801175B0, 0) != 0 )
    {
      v12 = sub_1800023C0(a1);
      if ( v12 != 0 )
      {
        qword_1801175B0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v12);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v12);
      }
    }
    sub_1800C6900(&unk_1801174A0);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_33;
  }
  if ( qword_180117840 == 0 )
  {
    qword_180117840 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL /*GetMethodID*/))(
                        a1,
                        qword_1801175B0,
                        /*0x708*/ "b",
                        /*0xed*/ "J");
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_33;
  }
  v174[0] = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1208LL))(a1, qword_1801175B0);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_33;
  v159 = 0x524884245EF6LL;
  v174[0] ^= 0x524884245EF6uLL;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_33;
  v13 = v174[0];
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
  {
    if ( qword_1801175B0 != 0
      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801175B0, 0) == 0 )
    {
      goto LABEL_901;
    }
    sub_1800C68B0(&unk_1801174A0);
    if ( qword_1801175B0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801175B0, 0) != 0 )
    {
      v18 = sub_1800023C0(a1);
      if ( v18 != 0 )
      {
        qword_1801175B0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v18);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v18);
      }
    }
    sub_1800C6900(&unk_1801174A0);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
    {
LABEL_901:
      if ( qword_180117848 != 0
        || (qword_180117848 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL /*GetMethodID*/))(
                                a1,
                                qword_1801175B0,
                                /*0xa5*/ "a",
                                /*0xa3e*/ "[Ljava/lang/String;"),
            (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
      {
        v174[0] = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1160LL /*GetObjectClass/AllocObject*/))(a1, qword_1801175B0);
        sub_1800036C0((__int64)&v169, (float *)&v166, v174, v174);
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
        {
          v157 = v174[0];
          sub_1800036C0((__int64)&v169, (float *)&v166, v174, v174);
          v174[0] = v157;
          sub_1800036C0((__int64)&v169, (float *)&v166, v174, v174);
          LODWORD(v165) = 23409;
          v164 = v13;
          v159 = v13 ^ 0x5F93BB101740F557LL;
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
          {
            LODWORD(v164) = 1;
            if ( qword_1801175B8 != 0
              && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                   a1,
                   qword_1801175B8,
                   0) == 0 )
            {
              goto LABEL_902;
            }
            sub_1800C68B0(&unk_1801174A8);
            if ( qword_1801175B8 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                   a1,
                   qword_1801175B8,
                   0) != 0 )
            {
              v20 = sub_1800023C0(a1);
              if ( v20 != 0 )
              {
                qword_1801175B8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v20);
                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v20);
              }
            }
            sub_1800C6900(&unk_1801174A8);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
            {
LABEL_902:
              v164 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, _QWORD))(*(_QWORD *)a1 + 1376LL))(
                       a1,
                       (unsigned int)v164,
                       qword_1801175B8,
                       0);
              sub_1800036C0((__int64)&v169, (float *)&v166, &v164, &v164);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
              {
                v21 = v164;
                if ( qword_1801175C0 != 0
                  && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                       a1,
                       qword_1801175C0,
                       0) == 0 )
                {
                  goto LABEL_97;
                }
                sub_1800C68B0(&unk_1801174B0);
                if ( qword_1801175C0 == 0
                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                       a1,
                       qword_1801175C0,
                       0) != 0 )
                {
                  v22 = sub_1800023C0(a1);
                  if ( v22 != 0 )
                  {
                    qword_1801175C0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v22);
                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v22);
                  }
                }
                sub_1800C6900(&unk_1801174B0);
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                {
LABEL_97:
                  v149 = qword_1801175C0;
                  v156 = v21;
                  v24 = sub_180002610(a1, a2);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                  {
                    v158 = v24;
                    if ( qword_1801175C0 != 0
                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                           a1,
                           qword_1801175C0,
                           0) == 0 )
                    {
                      goto LABEL_903;
                    }
                    sub_1800C68B0(&unk_1801174B0);
                    if ( qword_1801175C0 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                           a1,
                           qword_1801175C0,
                           0) != 0 )
                    {
                      v31 = sub_1800023C0(a1);
                      if ( v31 != 0 )
                      {
                        qword_1801175C0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                            a1,
                                            v31);
                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v31);
                      }
                    }
                    sub_1800C6900(&unk_1801174B0);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                    {
LABEL_903:
                      v160 = qword_1801175C0;
                      v163 = qword_180117310;
                      v162 = qword_180117318;
                      if ( qword_1801175C8 != 0
                        && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                             a1,
                             qword_1801175C8,
                             0) == 0 )
                      {
                        goto LABEL_904;
                      }
                      sub_1800C68B0(&unk_1801174B8);
                      if ( qword_1801175C8 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                             a1,
                             qword_1801175C8,
                             0) != 0 )
                      {
                        v32 = sub_1800023C0(a1);
                        if ( v32 != 0 )
                        {
                          qword_1801175C8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                              a1,
                                              v32);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v32);
                        }
                      }
                      sub_1800C6900(&unk_1801174B8);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                      {
LABEL_904:
                        if ( qword_1801176B0 != 0
                          || (qword_1801176B0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                  a1,
                                                  qword_1801175C8,
                                                  /*0x30c*/ "fromMethodDescriptorString",
                                                  /*0x327*/ "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/invoke/MethodType;"),
                              (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                        {
                          v162 = sub_180002760(a1);
                          sub_1800036C0((__int64)&v169, (float *)&v166, &v162, &v162);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                          {
                            if ( qword_1801175D0 != 0
                              && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                   a1,
                                   qword_1801175D0,
                                   0) == 0 )
                            {
                              goto LABEL_905;
                            }
                            sub_1800C68B0(&unk_1801174C0);
                            if ( qword_1801175D0 == 0
                              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                   a1,
                                   qword_1801175D0,
                                   0) != 0 )
                            {
                              v33 = sub_1800023C0(a1);
                              if ( v33 != 0 )
                              {
                                qword_1801175D0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                    a1,
                                                    v33);
                                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v33);
                              }
                            }
                            sub_1800C6900(&unk_1801174C0);
                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                            {
LABEL_905:
                              if ( qword_1801176B8 != 0
                                || (qword_1801176B8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                        a1,
                                                        qword_1801175D0,
                                                        /*0x370*/ "findStatic",
                                                        /*0x37b*/ "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;",
                                                        v6),
                                    (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                              {
                                if ( v158 != 0 )
                                {
                                  v146 = v162;
                                  v158 = sub_180002790(a1);
                                  sub_1800036C0((__int64)&v169, (float *)&v166, &v158, &v158);
                                }
                                else
                                {
                                  sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 5);
                                }
                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                {
                                  v34 = v156;
                                  v156 = v158;
                                  v160 = v34;
                                  v158 = qword_180117330;
                                  v163 = qword_180117338;
                                  v162 = v6;
                                  if ( qword_1801175C8 != 0
                                    && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                         a1,
                                         qword_1801175C8,
                                         0) == 0 )
                                  {
                                    goto LABEL_906;
                                  }
                                  sub_1800C68B0(&unk_1801174B8);
                                  if ( qword_1801175C8 == 0
                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                         a1,
                                         qword_1801175C8,
                                         0) != 0 )
                                  {
                                    v35 = sub_1800023C0(a1);
                                    if ( v35 != 0 )
                                    {
                                      qword_1801175C8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                          a1,
                                                          v35);
                                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v35);
                                    }
                                  }
                                  sub_1800C6900(&unk_1801174B8);
                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                  {
LABEL_906:
                                    if ( qword_1801176B0 != 0
                                      || (qword_1801176B0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                              a1,
                                                              qword_1801175C8,
                                                              /*0x30c*/ "fromMethodDescriptorString",
                                                              /*0x327*/ "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/invoke/MethodType;"),
                                          (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                                    {
                                      v141 = v162;
                                      v163 = sub_180002760(a1);
                                      sub_1800036C0((__int64)&v169, (float *)&v166, &v163, &v163);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                      {
                                        v36 = v163;
                                        v163 = v160;
                                        v160 = v36;
                                        LODWORD(v162) = 0;
                                        if ( qword_1801175B8 != 0
                                          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                               a1,
                                               qword_1801175B8,
                                               0) == 0 )
                                        {
                                          goto LABEL_180;
                                        }
                                        sub_1800C68B0(&unk_1801174A8);
                                        if ( qword_1801175B8 == 0
                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                               a1,
                                               qword_1801175B8,
                                               0) != 0 )
                                        {
                                          v37 = sub_1800023C0(a1);
                                          if ( v37 != 0 )
                                          {
                                            qword_1801175B8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v37);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v37);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174A8);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                        {
LABEL_180:
                                          if ( (int)v162 < 0 )
                                          {
                                            sub_180002110(a1, /*0x2ce*/ "java/lang/NegativeArraySizeException", /*0x2f3*/ "ANEWARRAY array size < 0", 5);
                                          }
                                          else
                                          {
                                            v162 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, _QWORD, __int64, __int64))(*(_QWORD *)a1 + 1376LL))(
                                                     a1,
                                                     (unsigned int)v162,
                                                     qword_1801175B8,
                                                     0,
                                                     v141,
                                                     v146);
                                            sub_1800036C0((__int64)&v169, (float *)&v166, &v162, &v162);
                                          }
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                          {
                                            if ( qword_1801175B8 != 0
                                              && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                   a1,
                                                   qword_1801175B8,
                                                   0) == 0 )
                                            {
                                              goto LABEL_191;
                                            }
                                            sub_1800C68B0(&unk_1801174A8);
                                            if ( qword_1801175B8 == 0
                                              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                   a1,
                                                   qword_1801175B8,
                                                   0) != 0 )
                                            {
                                              v38 = sub_1800023C0(a1);
                                              if ( v38 != 0 )
                                              {
                                                qword_1801175B8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                    a1,
                                                                    v38);
                                                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                  a1,
                                                  v38);
                                              }
                                            }
                                            sub_1800C6900(&unk_1801174A8);
                                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                            {
LABEL_191:
                                              if ( v162 != 0
                                                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                     a1,
                                                     v162,
                                                     qword_1801175B8) == 0 )
                                              {
                                                v41 = qword_1801172E0;
                                                sub_1800267D0(v172, /*0x3fa*/ "cannot cast to ");
                                                sub_1800267D0(v154, /*0x40a*/ "java/lang/Object");
                                                sub_180026770(&v169, v172, v154);
                                                v42 = v41 + 989;
                                                if ( (v169 & 1) != 0 )
                                                  v43 = v171;
                                                else
                                                  v43 = v170;
                                                sub_180002110(a1, v42, v43, 5);
                                                if ( (v169 & 1) != 0 )
                                                {
                                                  sub_1800C0DC0(v171);
                                                  if ( (v154[0] & 1) == 0 )
                                                  {
LABEL_211:
                                                    if ( (v172[0] & 1) == 0 )
                                                      goto LABEL_213;
                                                    goto LABEL_212;
                                                  }
                                                }
                                                else if ( (v154[0] & 1) == 0 )
                                                {
                                                  goto LABEL_211;
                                                }
                                                sub_1800C0DC0(v155);
                                                if ( (v172[0] & 1) == 0 )
                                                {
LABEL_213:
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_393;
                                                  goto LABEL_192;
                                                }
LABEL_212:
                                                sub_1800C0DC0(v173);
                                                goto LABEL_213;
                                              }
LABEL_192:
                                              v40 = v162;
                                              v162 = v163;
                                              v163 = v40;
                                              sub_180001510(a1, v149, v156, v158, v160, v40, v162);
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                              {
                                                if ( v164 != 0 )
                                                {
                                                  v164 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1384LL))(
                                                           a1,
                                                           v164,
                                                           0);
                                                  sub_1800036C0((__int64)&v169, (float *)&v166, &v164, &v164);
                                                }
                                                else
                                                {
                                                  sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x41b*/ "AALOAD npe", 5);
                                                }
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                {
                                                  v150 = v164;
                                                  if ( qword_1801175D8 != 0
                                                    && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_1801175D8,
                                                         0) == 0 )
                                                  {
                                                    goto LABEL_219;
                                                  }
                                                  sub_1800C68B0(&unk_1801174C8);
                                                  if ( qword_1801175D8 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_1801175D8,
                                                         0) != 0 )
                                                  {
                                                    v44 = sub_1800023C0(a1);
                                                    if ( v44 != 0 )
                                                    {
                                                      qword_1801175D8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                          a1,
                                                                          v44);
                                                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                        a1,
                                                        v44);
                                                    }
                                                  }
                                                  sub_1800C6900(&unk_1801174C8);
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                  {
LABEL_219:
                                                    if ( v150 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                           a1,
                                                           v150,
                                                           qword_1801175D8) == 0 )
                                                    {
                                                      goto LABEL_907;
                                                    }
                                                    if ( qword_1801175D8 != 0
                                                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175D8,
                                                           0) == 0 )
                                                    {
                                                      goto LABEL_233;
                                                    }
                                                    sub_1800C68B0(&unk_1801174C8);
                                                    if ( qword_1801175D8 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175D8,
                                                           0) != 0 )
                                                    {
                                                      v45 = sub_1800023C0(a1);
                                                      if ( v45 != 0 )
                                                      {
                                                        qword_1801175D8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v45);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v45);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_1801174C8);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                    {
LABEL_233:
                                                      if ( qword_1801176C0 != 0
                                                        || (qword_1801176C0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                                a1,
                                                                                qword_1801175D8,
                                                                                /*0x426*/ "getTarget",
                                                                                /*0x430*/ "()Ljava/lang/invoke/MethodHandle;"),
                                                            (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                                                      {
                                                        if ( v164 != 0 )
                                                        {
                                                          v164 = sub_180002790(a1);
                                                          sub_1800036C0((__int64)&v169, (float *)&v166, &v164, &v164);
                                                        }
                                                        else
                                                        {
                                                          sub_180002110(
                                                            a1,
                                                            /*0x6d*/ "java/lang/NullPointerException",
                                                            /*0x452*/ "INVOKEINTERFACE Object npe",
                                                            5);
                                                        }
                                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                        {
LABEL_907:
                                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                          {
                                                            sub_180026DB0(&v166, v174);
                                                            sub_180026DB0(&v166, &v164);
                                                            sub_180026DB0(&v166, &v157);
                                                            sub_180002660(a1, &v166);
                                                            if ( qword_1801175E0 != 0
                                                              && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                   a1,
                                                                   qword_1801175E0,
                                                                   0) == 0 )
                                                            {
                                                              goto LABEL_244;
                                                            }
                                                            sub_1800C68B0(&unk_1801174D0);
                                                            if ( qword_1801175E0 == 0
                                                              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                   a1,
                                                                   qword_1801175E0,
                                                                   0) != 0 )
                                                            {
                                                              v46 = sub_1800023C0(a1);
                                                              if ( v46 != 0 )
                                                              {
                                                                qword_1801175E0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                    a1,
                                                                                    v46);
                                                                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                  a1,
                                                                  v46);
                                                              }
                                                            }
                                                            sub_1800C6900(&unk_1801174D0);
                                                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                            {
LABEL_244:
                                                              if ( v164 == 0
                                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                                     a1,
                                                                     v164,
                                                                     qword_1801175E0) != 0 )
                                                              {
                                                                goto LABEL_245;
                                                              }
                                                              v59 = qword_1801172E0;
                                                              sub_1800267D0(v172, /*0x3fa*/ "cannot cast to ");
                                                              sub_1800267D0(v154, /*0x46d*/ "java/lang/invoke/MethodHandle");
                                                              sub_180026770(&v169, v172, v154);
                                                              v60 = v59 + 989;
                                                              if ( (v169 & 1) != 0 )
                                                                v61 = v171;
                                                              else
                                                                v61 = v170;
                                                              sub_180002110(a1, v60, v61, 5);
                                                              if ( (v169 & 1) != 0 )
                                                              {
                                                                sub_1800C0DC0(v171);
                                                                if ( (v154[0] & 1) == 0 )
                                                                {
LABEL_390:
                                                                  if ( (v172[0] & 1) == 0 )
                                                                    goto LABEL_392;
                                                                  goto LABEL_391;
                                                                }
                                                              }
                                                              else if ( (v154[0] & 1) == 0 )
                                                              {
                                                                goto LABEL_390;
                                                              }
                                                              sub_1800C0DC0(v155);
                                                              if ( (v172[0] & 1) == 0 )
                                                              {
LABEL_392:
                                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                                  goto LABEL_245;
                                                                goto LABEL_393;
                                                              }
LABEL_391:
                                                              sub_1800C0DC0(v173);
                                                              goto LABEL_392;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
LABEL_393:
                                              v63 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                              (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                              v174[0] = v63;
                                              v172[0] = v63;
                                              sub_180026960(&v169, &v166, v172, v172);
LABEL_71:
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                     a1,
                                                     v174[0],
                                                     qword_1801175A8) == 0 )
                                                goto LABEL_326;
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_325;
                                              sub_180026DB0(&v166, v174);
                                              sub_180026DB0(&v166, &v157);
                                              sub_180002660(a1, &v166);
                                              v165 = v174[0];
                                              if ( qword_1801175E8 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_1801175E8,
                                                     0) != 0 )
                                              {
                                                sub_1800C68B0(&unk_1801174D8);
                                                if ( qword_1801175E8 == 0
                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                       a1,
                                                       qword_1801175E8,
                                                       0) != 0 )
                                                {
                                                  v25 = sub_1800023C0(a1);
                                                  if ( v25 != 0 )
                                                  {
                                                    qword_1801175E8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                        a1,
                                                                        v25);
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                      a1,
                                                      v25);
                                                  }
                                                }
                                                sub_1800C6900(&unk_1801174D8);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_325;
                                              }
                                              if ( v165 != 0 )
                                              {
                                                v26 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                        a1,
                                                        v165,
                                                        qword_1801175E8);
                                                LODWORD(v165) = v26;
                                                if ( v26 != 0 )
                                                  goto LABEL_83;
                                              }
                                              else
                                              {
                                                LODWORD(v165) = 0;
                                              }
                                              if ( qword_1801175E8 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_1801175E8,
                                                     0) != 0 )
                                              {
                                                sub_1800C68B0(&unk_1801174D8);
                                                if ( qword_1801175E8 == 0
                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                       a1,
                                                       qword_1801175E8,
                                                       0) != 0 )
                                                {
                                                  v27 = sub_1800023C0(a1);
                                                  if ( v27 != 0 )
                                                  {
                                                    qword_1801175E8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                        a1,
                                                                        v27);
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                      a1,
                                                      v27);
                                                  }
                                                }
                                                sub_1800C6900(&unk_1801174D8);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_325;
                                              }
                                              v28 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 216LL))(
                                                      a1,
                                                      qword_1801175E8);
                                              v172[0] = v28;
                                              if ( v28 != 0 )
                                              {
                                                v165 = v28;
                                                sub_1800036C0((__int64)&v169, (float *)&v166, v172, v172);
                                              }
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_325;
                                              v161 = v165;
                                              v164 = v165;
                                              v159 = v174[0];
                                              v174[0] = v165;
                                              if ( qword_1801175E8 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_1801175E8,
                                                     0) != 0 )
                                              {
                                                sub_1800C68B0(&unk_1801174D8);
                                                if ( qword_1801175E8 == 0
                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                       a1,
                                                       qword_1801175E8,
                                                       0) != 0 )
                                                {
                                                  v30 = sub_1800023C0(a1);
                                                  if ( v30 != 0 )
                                                  {
                                                    qword_1801175E8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                        a1,
                                                                        v30);
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                      a1,
                                                      v30);
                                                  }
                                                }
                                                sub_1800C6900(&unk_1801174D8);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_325;
                                              }
                                              if ( qword_1801176C8 == 0 )
                                              {
                                                qword_1801176C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                    a1,
                                                                    qword_1801175E8,
                                                                    /*0x48b*/ "<init>",
                                                                    /*0x492*/ "(Ljava/lang/Throwable;)V");
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_325;
                                              }
                                              if ( v165 != 0 )
                                                sub_180026870(a1, v165, qword_1801175E8, qword_1801176C8, v159);
                                              else
                                                sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x4ab*/ "INVOKESPECIAL Void npe", 5);
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_325;
LABEL_83:
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_325;
                                              sub_180026DB0(&v166, v174);
                                              sub_180026DB0(&v166, &v157);
                                              sub_180002660(a1, &v166);
                                              v29 = v174[0];
                                              if ( v174[0] != 0 )
                                              {
                                                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(
                                                  a1,
                                                  v174[0]);
                                                v172[0] = v29;
                                                sub_180026960(&v169, &v166, v172, v172);
                                              }
                                              else
                                              {
                                                sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x29a*/ "ATHROW npe", 5);
                                              }
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_325;
LABEL_245:
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_325;
                                              sub_180026DB0(&v166, v174);
                                              sub_180026DB0(&v166, &v164);
                                              sub_180026DB0(&v166, &v157);
                                              sub_180002660(a1, &v166);
                                              if ( qword_1801175F0 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_1801175F0,
                                                     0) != 0 )
                                              {
                                                sub_1800C68B0(&unk_1801174E0);
                                                if ( qword_1801175F0 == 0
                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                       a1,
                                                       qword_1801175F0,
                                                       0) != 0 )
                                                {
                                                  v47 = sub_1800023C0(a1);
                                                  if ( v47 != 0 )
                                                  {
                                                    qword_1801175F0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                        a1,
                                                                        v47);
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                      a1,
                                                      v47);
                                                  }
                                                }
                                                sub_1800C6900(&unk_1801174E0);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_325;
                                              }
                                              v48 = qword_1801176D0;
                                              if ( qword_1801176D0 == 0 )
                                              {
                                                qword_1801176D0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                    a1,
                                                                    qword_1801175F0,
                                                                    /*0x4c2*/ "invokereverse0",
                                                                    /*0x4d1*/ "(IJLjava/lang/invoke/MethodHandle;)I");
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                {
LABEL_325:
                                                  v53 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                                  (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                                  v174[0] = v53;
                                                  v172[0] = v53;
                                                  sub_180026960(&v169, &v166, v172, v172);
                                                  goto LABEL_326;
                                                }
                                                v48 = qword_1801176D0;
                                              }
                                              LODWORD(v165) = sub_1800268A0(
                                                                a1,
                                                                qword_1801175F0,
                                                                v48,
                                                                (unsigned int)v165,
                                                                v159,
                                                                v164);
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_325;
                                              if ( v174[0] != 0 )
                                              {
                                                v174[0] = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1384LL))(
                                                            a1,
                                                            v174[0],
                                                            (unsigned int)v165);
                                                sub_1800036C0((__int64)&v169, (float *)&v166, v174, v174);
                                              }
                                              else
                                              {
                                                sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x41b*/ "AALOAD npe", 5);
                                              }
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_325;
                                              if ( qword_1801175F8 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_1801175F8,
                                                     0) != 0 )
                                              {
                                                sub_1800C68B0(&unk_1801174E8);
                                                if ( qword_1801175F8 == 0
                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                       a1,
                                                       qword_1801175F8,
                                                       0) != 0 )
                                                {
                                                  v49 = sub_1800023C0(a1);
                                                  if ( v49 != 0 )
                                                  {
                                                    qword_1801175F8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                        a1,
                                                                        v49);
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                      a1,
                                                      v49);
                                                  }
                                                }
                                                sub_1800C6900(&unk_1801174E8);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_325;
                                              }
                                              if ( qword_1801176D8 == 0 )
                                              {
                                                qword_1801176D8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                    a1,
                                                                    qword_1801175F8,
                                                                    /*0x534*/ "getInstance",
                                                                    /*0xa52*/ "(Ljava/lang/String;)Ljava/security/MessageDigest;");
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_325;
                                              }
                                              v174[0] = sub_180002760(a1);
                                              sub_1800036C0((__int64)&v169, (float *)&v166, v174, v174);
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_325;
                                              v153 = v174[0];
                                              sub_1800036C0((__int64)&v169, (float *)&v166, v174, v174);
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_325;
                                              if ( qword_180117600 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_180117600,
                                                     0) != 0 )
                                              {
                                                sub_1800C68B0(&unk_1801174F0);
                                                if ( qword_180117600 == 0
                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                       a1,
                                                       qword_180117600,
                                                       0) != 0 )
                                                {
                                                  v50 = sub_1800023C0(a1);
                                                  if ( v50 != 0 )
                                                  {
                                                    qword_180117600 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                        a1,
                                                                        v50);
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                      a1,
                                                      v50);
                                                  }
                                                }
                                                sub_1800C6900(&unk_1801174F0);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_325;
                                              }
                                              if ( qword_1801176E0 == 0 )
                                              {
                                                qword_1801176E0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                    a1,
                                                                    qword_180117600,
                                                                    /*0xa84*/ "getEncoder",
                                                                    /*0xa8f*/ "()Ljava/util/Base64$Encoder;");
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_325;
                                              }
                                              v174[0] = sub_180002760(a1);
                                              sub_1800036C0((__int64)&v169, (float *)&v166, v174, v174);
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_325;
                                              v165 = v157;
                                              sub_1800036C0((__int64)&v169, (float *)&v166, &v165, &v165);
                                              LODWORD(v159) = 1;
                                              if ( v165 != 0 )
                                              {
                                                v165 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 1384LL))(
                                                         a1,
                                                         v165,
                                                         1);
                                                sub_1800036C0((__int64)&v169, (float *)&v166, &v165, &v165);
                                              }
                                              else
                                              {
                                                sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x41b*/ "AALOAD npe", 10);
                                              }
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_325;
                                              if ( qword_180117608 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_180117608,
                                                     0) != 0 )
                                              {
                                                sub_1800C68B0(&unk_1801174F8);
                                                if ( qword_180117608 == 0
                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                       a1,
                                                       qword_180117608,
                                                       0) != 0 )
                                                {
                                                  v51 = sub_1800023C0(a1);
                                                  if ( v51 != 0 )
                                                  {
                                                    qword_180117608 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                        a1,
                                                                        v51);
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                      a1,
                                                      v51);
                                                  }
                                                }
                                                sub_1800C6900(&unk_1801174F8);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_325;
                                              }
                                              if ( qword_1801176E8 == 0 )
                                              {
                                                qword_1801176E8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                    a1,
                                                                    qword_180117608,
                                                                    /*0xaac*/ "fsi",
                                                                    /*0x6da*/ "(Ljava/lang/String;)[B");
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_325;
                                              }
                                              v165 = sub_180002760(a1);
                                              sub_1800036C0((__int64)&v169, (float *)&v166, &v165, &v165);
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_325;
                                              if ( qword_180117610 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_180117610,
                                                     0) != 0 )
                                              {
                                                sub_1800C68B0(&unk_180117500);
                                                if ( qword_180117610 == 0
                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                       a1,
                                                       qword_180117610,
                                                       0) != 0 )
                                                {
                                                  v52 = sub_1800023C0(a1);
                                                  if ( v52 != 0 )
                                                  {
                                                    qword_180117610 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                        a1,
                                                                        v52);
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                      a1,
                                                      v52);
                                                  }
                                                }
                                                sub_1800C6900(&unk_180117500);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_325;
                                              }
                                              if ( qword_1801176F0 == 0 )
                                              {
                                                qword_1801176F0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                    a1,
                                                                    qword_180117610,
                                                                    /*0xab0*/ "encodeToString",
                                                                    /*0xabf*/ "([B)Ljava/lang/String;");
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_325;
                                              }
                                              if ( v174[0] != 0 )
                                              {
                                                v174[0] = sub_180002790(a1);
                                                sub_1800036C0((__int64)&v169, (float *)&v166, v174, v174);
                                              }
                                              else
                                              {
                                                sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 10);
                                              }
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_325;
                                              v165 = a3;
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_447;
                                              LODWORD(v161) = 1;
                                              if ( qword_1801175B8 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_1801175B8,
                                                     0) != 0 )
                                              {
                                                sub_1800C68B0(&unk_1801174A8);
                                                if ( qword_1801175B8 == 0
                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                       a1,
                                                       qword_1801175B8,
                                                       0) != 0 )
                                                {
                                                  v62 = sub_1800023C0(a1);
                                                  if ( v62 != 0 )
                                                  {
                                                    qword_1801175B8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                        a1,
                                                                        v62);
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                      a1,
                                                      v62);
                                                  }
                                                }
                                                sub_1800C6900(&unk_1801174A8);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_447;
                                              }
                                              if ( (int)v161 < 0 )
                                              {
                                                sub_180002110(a1, /*0x2ce*/ "java/lang/NegativeArraySizeException", /*0x2f3*/ "ANEWARRAY array size < 0", 10);
                                              }
                                              else
                                              {
                                                v161 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, _QWORD))(*(_QWORD *)a1 + 1376LL))(
                                                         a1,
                                                         (unsigned int)v161,
                                                         qword_1801175B8,
                                                         0);
                                                sub_1800036C0((__int64)&v169, (float *)&v166, &v161, &v161);
                                              }
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_447;
                                              v164 = v161;
                                              if ( qword_1801175C0 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_1801175C0,
                                                     0) != 0 )
                                              {
                                                sub_1800C68B0(&unk_1801174B0);
                                                if ( qword_1801175C0 == 0
                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                       a1,
                                                       qword_1801175C0,
                                                       0) != 0 )
                                                {
                                                  v64 = sub_1800023C0(a1);
                                                  if ( v64 != 0 )
                                                  {
                                                    qword_1801175C0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                        a1,
                                                                        v64);
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                      a1,
                                                      v64);
                                                  }
                                                }
                                                sub_1800C6900(&unk_1801174B0);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_447;
                                              }
                                              v65 = v164;
                                              v164 = qword_1801175C0;
                                              if ( v24 == 0 )
                                              {
                                                v24 = sub_180002610(a1, a2);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_447;
                                              }
                                              v156 = v24;
                                              if ( qword_180117618 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_180117618,
                                                     0) != 0 )
                                              {
                                                sub_1800C68B0(&unk_180117508);
                                                if ( qword_180117618 == 0
                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                       a1,
                                                       qword_180117618,
                                                       0) != 0 )
                                                {
                                                  v66 = sub_1800023C0(a1);
                                                  if ( v66 != 0 )
                                                  {
                                                    qword_180117618 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                        a1,
                                                                        v66);
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                      a1,
                                                      v66);
                                                  }
                                                }
                                                sub_1800C6900(&unk_180117508);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_447;
                                              }
                                              v158 = qword_180117618;
                                              v160 = qword_180117388;
                                              v163 = qword_180117390;
                                              v162 = v6;
                                              if ( qword_1801175C8 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_1801175C8,
                                                     0) != 0 )
                                              {
                                                sub_1800C68B0(&unk_1801174B8);
                                                if ( qword_1801175C8 == 0
                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                       a1,
                                                       qword_1801175C8,
                                                       0) != 0 )
                                                {
                                                  v67 = sub_1800023C0(a1);
                                                  if ( v67 != 0 )
                                                  {
                                                    qword_1801175C8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                        a1,
                                                                        v67);
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                      a1,
                                                      v67);
                                                  }
                                                }
                                                sub_1800C6900(&unk_1801174B8);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_447;
                                              }
                                              if ( qword_1801176B0 == 0 )
                                              {
                                                qword_1801176B0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                    a1,
                                                                    qword_1801175C8,
                                                                    /*0x30c*/ "fromMethodDescriptorString",
                                                                    /*0x327*/ "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/invoke/MethodType;");
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_447;
                                              }
                                              v142 = v162;
                                              v163 = sub_180002760(a1);
                                              sub_1800036C0((__int64)&v169, (float *)&v166, &v163, &v163);
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_447;
                                              if ( qword_1801175D0 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_1801175D0,
                                                     0) != 0 )
                                              {
                                                sub_1800C68B0(&unk_1801174C0);
                                                if ( qword_1801175D0 == 0
                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                       a1,
                                                       qword_1801175D0,
                                                       0) != 0 )
                                                {
                                                  v68 = sub_1800023C0(a1);
                                                  if ( v68 != 0 )
                                                  {
                                                    qword_1801175D0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                        a1,
                                                                        v68);
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                      a1,
                                                      v68);
                                                  }
                                                }
                                                sub_1800C6900(&unk_1801174C0);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_447;
                                              }
                                              if ( qword_1801176B8 == 0 )
                                              {
                                                qword_1801176B8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                    a1,
                                                                    qword_1801175D0,
                                                                    /*0x370*/ "findStatic",
                                                                    /*0x37b*/ "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;",
                                                                    v142);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_447;
                                              }
                                              if ( v156 != 0 )
                                              {
                                                v147 = v163;
                                                v156 = sub_180002790(a1);
                                                sub_1800036C0((__int64)&v169, (float *)&v166, &v156, &v156);
                                              }
                                              else
                                              {
                                                sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 10);
                                              }
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_447;
                                              v76 = v156;
                                              v158 = v65;
                                              v156 = qword_180117388;
                                              v160 = qword_180117398;
                                              v163 = v6;
                                              if ( qword_1801175C8 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_1801175C8,
                                                     0) != 0 )
                                              {
                                                sub_1800C68B0(&unk_1801174B8);
                                                if ( qword_1801175C8 == 0
                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                       a1,
                                                       qword_1801175C8,
                                                       0) != 0 )
                                                {
                                                  v77 = sub_1800023C0(a1);
                                                  if ( v77 != 0 )
                                                  {
                                                    qword_1801175C8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                        a1,
                                                                        v77);
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                      a1,
                                                      v77);
                                                  }
                                                }
                                                sub_1800C6900(&unk_1801174B8);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_447;
                                              }
                                              if ( qword_1801176B0 == 0 )
                                              {
                                                qword_1801176B0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                    a1,
                                                                    qword_1801175C8,
                                                                    /*0x30c*/ "fromMethodDescriptorString",
                                                                    /*0x327*/ "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/invoke/MethodType;");
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_447;
                                              }
                                              v143 = v163;
                                              v160 = sub_180002760(a1);
                                              sub_1800036C0((__int64)&v169, (float *)&v166, &v160, &v160);
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_447;
                                              v78 = v160;
                                              v160 = v158;
                                              v158 = v78;
                                              LODWORD(v163) = 1;
                                              if ( qword_1801175B8 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_1801175B8,
                                                     0) != 0 )
                                              {
                                                sub_1800C68B0(&unk_1801174A8);
                                                if ( qword_1801175B8 == 0
                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                       a1,
                                                       qword_1801175B8,
                                                       0) != 0 )
                                                {
                                                  v79 = sub_1800023C0(a1);
                                                  if ( v79 != 0 )
                                                  {
                                                    qword_1801175B8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                        a1,
                                                                        v79);
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                      a1,
                                                      v79);
                                                  }
                                                }
                                                sub_1800C6900(&unk_1801174A8);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_447;
                                              }
                                              if ( (int)v163 < 0 )
                                              {
                                                sub_180002110(a1, /*0x2ce*/ "java/lang/NegativeArraySizeException", /*0x2f3*/ "ANEWARRAY array size < 0", 10);
                                              }
                                              else
                                              {
                                                v163 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, _QWORD, __int64, __int64))(*(_QWORD *)a1 + 1376LL))(
                                                         a1,
                                                         (unsigned int)v163,
                                                         qword_1801175B8,
                                                         0,
                                                         v143,
                                                         v147);
                                                sub_1800036C0((__int64)&v169, (float *)&v166, &v163, &v163);
                                              }
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_447;
                                              v162 = v163;
                                              if ( v163 != 0 )
                                                (*(void (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)a1 + 1392LL))(
                                                  a1,
                                                  v163,
                                                  0,
                                                  qword_1801173A0);
                                              else
                                                sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0xad6*/ "AASTORE npe", 10);
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_447;
                                              if ( qword_1801175B8 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_1801175B8,
                                                     0) != 0 )
                                              {
                                                sub_1800C68B0(&unk_1801174A8);
                                                if ( qword_1801175B8 == 0
                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                       a1,
                                                       qword_1801175B8,
                                                       0) != 0 )
                                                {
                                                  v80 = sub_1800023C0(a1);
                                                  if ( v80 != 0 )
                                                  {
                                                    qword_1801175B8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                        a1,
                                                                        v80);
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                      a1,
                                                      v80);
                                                  }
                                                }
                                                sub_1800C6900(&unk_1801174A8);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_447;
                                              }
                                              if ( v163 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                     a1,
                                                     v163,
                                                     qword_1801175B8) != 0 )
                                              {
                                                goto LABEL_540;
                                              }
                                              v81 = qword_1801172E0;
                                              sub_1800267D0(v172, /*0x3fa*/ "cannot cast to ");
                                              sub_1800267D0(v154, /*0x40a*/ "java/lang/Object");
                                              sub_180026770(&v169, v172, v154);
                                              v82 = v81 + 989;
                                              if ( (v169 & 1) != 0 )
                                                v83 = v171;
                                              else
                                                v83 = v170;
                                              sub_180002110(a1, v82, v83, 10);
                                              if ( (v169 & 1) != 0 )
                                              {
                                                sub_1800C0DC0(v171);
                                                if ( (v154[0] & 1) == 0 )
                                                {
LABEL_533:
                                                  if ( (v172[0] & 1) == 0 )
                                                    goto LABEL_535;
                                                  goto LABEL_534;
                                                }
                                              }
                                              else if ( (v154[0] & 1) == 0 )
                                              {
                                                goto LABEL_533;
                                              }
                                              sub_1800C0DC0(v155);
                                              if ( (v172[0] & 1) != 0 )
LABEL_534:
                                                sub_1800C0DC0(v173);
LABEL_535:
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_447;
LABEL_540:
                                              v84 = v163;
                                              v163 = v160;
                                              v160 = v84;
                                              v164 = sub_180001510(a1, v164, v76, v156, v158, v84, v163);
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_447;
                                              LODWORD(v164) = 0;
                                              if ( v161 != 0 )
                                              {
                                                v161 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1384LL))(
                                                         a1,
                                                         v161,
                                                         0);
                                                sub_1800036C0((__int64)&v169, (float *)&v166, &v161, &v161);
                                              }
                                              else
                                              {
                                                sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x41b*/ "AALOAD npe", 10);
                                              }
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_447;
                                              v164 = v161;
                                              if ( qword_1801175D8 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_1801175D8,
                                                     0) != 0 )
                                              {
                                                sub_1800C68B0(&unk_1801174C8);
                                                if ( qword_1801175D8 == 0
                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                       a1,
                                                       qword_1801175D8,
                                                       0) != 0 )
                                                {
                                                  v85 = sub_1800023C0(a1);
                                                  if ( v85 != 0 )
                                                  {
                                                    qword_1801175D8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                        a1,
                                                                        v85);
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                      a1,
                                                      v85);
                                                  }
                                                }
                                                sub_1800C6900(&unk_1801174C8);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  goto LABEL_447;
                                              }
                                              if ( v164 != 0 )
                                              {
                                                v86 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                        a1,
                                                        v164,
                                                        qword_1801175D8);
                                                LODWORD(v164) = v86;
                                                if ( v86 != 0 )
                                                {
                                                  if ( qword_1801175D8 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_1801175D8,
                                                         0) != 0 )
                                                  {
                                                    sub_1800C68B0(&unk_1801174C8);
                                                    if ( qword_1801175D8 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175D8,
                                                           0) != 0 )
                                                    {
                                                      v87 = sub_1800023C0(a1);
                                                      if ( v87 != 0 )
                                                      {
                                                        qword_1801175D8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v87);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v87);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_1801174C8);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_447;
                                                  }
                                                  if ( qword_1801176C0 == 0 )
                                                  {
                                                    qword_1801176C0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                        a1,
                                                                        qword_1801175D8,
                                                                        /*0x426*/ "getTarget",
                                                                        /*0x430*/ "()Ljava/lang/invoke/MethodHandle;");
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_447;
                                                  }
                                                  if ( v161 != 0 )
                                                  {
                                                    v161 = sub_180002790(a1);
                                                    sub_1800036C0((__int64)&v169, (float *)&v166, &v161, &v161);
                                                  }
                                                  else
                                                  {
                                                    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x452*/ "INVOKEINTERFACE Object npe", 10);
                                                  }
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_447;
                                                }
                                              }
                                              else
                                              {
                                                LODWORD(v164) = 0;
                                              }
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                              {
LABEL_447:
                                                v69 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                                (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                                v174[0] = v69;
                                                v172[0] = v69;
                                                sub_180026960(&v169, &v166, v172, v172);
                                                goto LABEL_448;
                                              }
                                              sub_180026DB0(&v166, v174);
                                              sub_180026DB0(&v166, &v161);
                                              sub_180026DB0(&v166, &v153);
                                              sub_180026DB0(&v166, &v157);
                                              sub_180002660(a1, &v166);
                                              if ( qword_1801175E0 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_1801175E0,
                                                     0) != 0 )
                                              {
                                                sub_1800C68B0(&unk_1801174D0);
                                                if ( qword_1801175E0 == 0
                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                       a1,
                                                       qword_1801175E0,
                                                       0) != 0 )
                                                {
                                                  v88 = sub_1800023C0(a1);
                                                  if ( v88 != 0 )
                                                  {
                                                    qword_1801175E0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                        a1,
                                                                        v88);
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                      a1,
                                                      v88);
                                                  }
                                                }
                                                sub_1800C6900(&unk_1801174D0);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                {
LABEL_577:
                                                  v89 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                                  (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                                  v174[0] = v89;
                                                  v172[0] = v89;
                                                  sub_180026960(&v169, &v166, v172, v172);
LABEL_448:
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                         a1,
                                                         v174[0],
                                                         qword_1801175A8) == 0 )
                                                    goto LABEL_326;
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_668;
                                                  sub_180026DB0(&v166, v174);
                                                  sub_180026DB0(&v166, &v153);
                                                  sub_180026DB0(&v166, &v157);
                                                  sub_180002660(a1, &v166);
                                                  v165 = v174[0];
                                                  if ( qword_1801175E8 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_1801175E8,
                                                         0) != 0 )
                                                  {
                                                    sub_1800C68B0(&unk_1801174D8);
                                                    if ( qword_1801175E8 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175E8,
                                                           0) != 0 )
                                                    {
                                                      v70 = sub_1800023C0(a1);
                                                      if ( v70 != 0 )
                                                      {
                                                        qword_1801175E8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v70);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v70);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_1801174D8);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_668;
                                                  }
                                                  if ( v165 != 0 )
                                                  {
                                                    v71 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                            a1,
                                                            v165,
                                                            qword_1801175E8);
                                                    LODWORD(v165) = v71;
                                                    if ( v71 != 0 )
                                                      goto LABEL_460;
                                                  }
                                                  else
                                                  {
                                                    LODWORD(v165) = 0;
                                                  }
                                                  if ( qword_1801175E8 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_1801175E8,
                                                         0) != 0 )
                                                  {
                                                    sub_1800C68B0(&unk_1801174D8);
                                                    if ( qword_1801175E8 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175E8,
                                                           0) != 0 )
                                                    {
                                                      v72 = sub_1800023C0(a1);
                                                      if ( v72 != 0 )
                                                      {
                                                        qword_1801175E8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v72);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v72);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_1801174D8);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_668;
                                                  }
                                                  v73 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 216LL))(
                                                          a1,
                                                          qword_1801175E8);
                                                  v172[0] = v73;
                                                  if ( v73 != 0 )
                                                  {
                                                    v165 = v73;
                                                    sub_1800036C0((__int64)&v169, (float *)&v166, v172, v172);
                                                  }
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_668;
                                                  v161 = v165;
                                                  v164 = v165;
                                                  v159 = v174[0];
                                                  v174[0] = v165;
                                                  if ( qword_1801175E8 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_1801175E8,
                                                         0) != 0 )
                                                  {
                                                    sub_1800C68B0(&unk_1801174D8);
                                                    if ( qword_1801175E8 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175E8,
                                                           0) != 0 )
                                                    {
                                                      v75 = sub_1800023C0(a1);
                                                      if ( v75 != 0 )
                                                      {
                                                        qword_1801175E8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v75);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v75);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_1801174D8);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_668;
                                                  }
                                                  if ( qword_1801176C8 == 0 )
                                                  {
                                                    qword_1801176C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                        a1,
                                                                        qword_1801175E8,
                                                                        /*0x48b*/ "<init>",
                                                                        /*0x492*/ "(Ljava/lang/Throwable;)V");
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_668;
                                                  }
                                                  if ( v165 != 0 )
                                                    sub_180026870(a1, v165, qword_1801175E8, qword_1801176C8, v159);
                                                  else
                                                    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x4ab*/ "INVOKESPECIAL Void npe", 10);
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_668;
LABEL_460:
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_668;
                                                  sub_180026DB0(&v166, v174);
                                                  sub_180026DB0(&v166, &v153);
                                                  sub_180026DB0(&v166, &v157);
                                                  sub_180002660(a1, &v166);
                                                  v74 = v174[0];
                                                  if ( v174[0] != 0 )
                                                  {
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(
                                                      a1,
                                                      v174[0]);
                                                    v172[0] = v74;
                                                    sub_180026960(&v169, &v166, v172, v172);
                                                  }
                                                  else
                                                  {
                                                    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x29a*/ "ATHROW npe", 10);
                                                  }
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_668;
LABEL_588:
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_668;
                                                  sub_180026DB0(&v166, v174);
                                                  sub_180026DB0(&v166, &v161);
                                                  sub_180026DB0(&v166, &v153);
                                                  sub_180026DB0(&v166, &v157);
                                                  sub_180002660(a1, &v166);
                                                  if ( qword_1801175F0 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_1801175F0,
                                                         0) != 0 )
                                                  {
                                                    sub_1800C68B0(&unk_1801174E0);
                                                    if ( qword_1801175F0 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175F0,
                                                           0) != 0 )
                                                    {
                                                      v93 = sub_1800023C0(a1);
                                                      if ( v93 != 0 )
                                                      {
                                                        qword_1801175F0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v93);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v93);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_1801174E0);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_668;
                                                  }
                                                  if ( qword_1801176F8 == 0 )
                                                  {
                                                    qword_1801176F8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                        a1,
                                                                        qword_1801175F0,
                                                                        /*0xae2*/ "invokereverse1",
                                                                        /*0xaf1*/ "(Ljava/lang/Object;JLjava/lang/invoke/MethodHandle;)Ljava/lang/Object;");
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_668;
                                                  }
                                                  v148 = v161;
                                                  v144 = v165;
                                                  v174[0] = sub_180002760(a1);
                                                  sub_1800036C0((__int64)&v169, (float *)&v166, v174, v174);
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_668;
                                                  if ( qword_180117620 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_180117620,
                                                         0) != 0 )
                                                  {
                                                    sub_1800C68B0(&unk_180117510);
                                                    if ( qword_180117620 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_180117620,
                                                           0) != 0 )
                                                    {
                                                      v94 = sub_1800023C0(a1);
                                                      if ( v94 != 0 )
                                                      {
                                                        qword_180117620 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v94);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v94);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_180117510);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_668;
                                                  }
                                                  if ( v174[0] == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                         a1,
                                                         v174[0],
                                                         qword_180117620) != 0 )
                                                  {
                                                    goto LABEL_625;
                                                  }
                                                  v95 = qword_1801172E0;
                                                  sub_1800267D0(v172, /*0x3fa*/ "cannot cast to ");
                                                  sub_1800267D0(v154, /*0xb38*/ "java/lang/String");
                                                  sub_180026770(&v169, v172, v154);
                                                  v96 = v95 + 989;
                                                  if ( (v169 & 1) != 0 )
                                                    v97 = v171;
                                                  else
                                                    v97 = v170;
                                                  sub_180002110(a1, v96, v97, 10);
                                                  if ( (v169 & 1) != 0 )
                                                  {
                                                    sub_1800C0DC0(v171);
                                                    if ( (v154[0] & 1) == 0 )
                                                    {
LABEL_618:
                                                      if ( (v172[0] & 1) == 0 )
                                                        goto LABEL_620;
                                                      goto LABEL_619;
                                                    }
                                                  }
                                                  else if ( (v154[0] & 1) == 0 )
                                                  {
                                                    goto LABEL_618;
                                                  }
                                                  sub_1800C0DC0(v155);
                                                  if ( (v172[0] & 1) != 0 )
LABEL_619:
                                                    sub_1800C0DC0(v173);
LABEL_620:
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  {
LABEL_668:
                                                    v101 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                                    (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                                    v174[0] = v101;
                                                    v172[0] = v101;
                                                    sub_180026960(&v169, &v166, v172, v172);
                                                    goto LABEL_326;
                                                  }
LABEL_625:
                                                  v151 = v174[0];
                                                  sub_1800036C0((__int64)&v169, (float *)&v166, v174, v174);
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_668;
                                                  v174[0] = v153;
                                                  sub_1800036C0((__int64)&v169, (float *)&v166, v174, v174);
                                                  v165 = v151;
                                                  sub_1800036C0((__int64)&v169, (float *)&v166, &v165, &v165);
                                                  if ( qword_180117628 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_180117628,
                                                         0) != 0 )
                                                  {
                                                    sub_1800C68B0(&unk_180117518);
                                                    if ( qword_180117628 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_180117628,
                                                           0) != 0 )
                                                    {
                                                      v98 = sub_1800023C0(a1);
                                                      if ( v98 != 0 )
                                                      {
                                                        qword_180117628 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v98);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v98);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_180117518);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_668;
                                                  }
                                                  if ( qword_180117850 == 0 )
                                                  {
                                                    qword_180117850 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL /*GetMethodID*/))(
                                                                        a1,
                                                                        qword_180117628,
                                                                        /*0xb49*/ "UTF_8",
                                                                        /*0xb4f*/ "Ljava/nio/charset/Charset;",
                                                                        v144,
                                                                        v148);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_668;
                                                  }
                                                  v159 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1160LL /*GetObjectClass/AllocObject*/))(
                                                           a1,
                                                           qword_180117628);
                                                  sub_1800036C0((__int64)&v169, (float *)&v166, &v159, &v159);
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_668;
                                                  if ( qword_180117620 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_180117620,
                                                         0) != 0 )
                                                  {
                                                    sub_1800C68B0(&unk_180117510);
                                                    if ( qword_180117620 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_180117620,
                                                           0) != 0 )
                                                    {
                                                      v99 = sub_1800023C0(a1);
                                                      if ( v99 != 0 )
                                                      {
                                                        qword_180117620 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v99);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v99);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_180117510);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_668;
                                                  }
                                                  if ( qword_180117700 == 0 )
                                                  {
                                                    qword_180117700 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                        a1,
                                                                        qword_180117620,
                                                                        /*0x6d1*/ "getBytes",
                                                                        /*0xb6a*/ "(Ljava/nio/charset/Charset;)[B");
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_668;
                                                  }
                                                  if ( v165 != 0 )
                                                  {
                                                    v165 = sub_180002790(a1);
                                                    sub_1800036C0((__int64)&v169, (float *)&v166, &v165, &v165);
                                                  }
                                                  else
                                                  {
                                                    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 16);
                                                  }
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_668;
                                                  if ( qword_1801175F8 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_1801175F8,
                                                         0) != 0 )
                                                  {
                                                    sub_1800C68B0(&unk_1801174E8);
                                                    if ( qword_1801175F8 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175F8,
                                                           0) != 0 )
                                                    {
                                                      v100 = sub_1800023C0(a1);
                                                      if ( v100 != 0 )
                                                      {
                                                        qword_1801175F8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v100);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v100);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_1801174E8);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_668;
                                                  }
                                                  if ( qword_180117708 == 0 )
                                                  {
                                                    qword_180117708 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                        a1,
                                                                        qword_1801175F8,
                                                                        /*0xb89*/ "digest",
                                                                        /*0x72c*/ "([B)[B");
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_668;
                                                  }
                                                  if ( v174[0] != 0 )
                                                  {
                                                    v174[0] = sub_180002790(a1);
                                                    sub_1800036C0((__int64)&v169, (float *)&v166, v174, v174);
                                                  }
                                                  else
                                                  {
                                                    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 16);
                                                  }
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_668;
                                                  v152 = v174[0];
                                                  sub_1800036C0((__int64)&v169, (float *)&v166, v174, v174);
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_668;
                                                  v174[0] = v152;
                                                  sub_1800036C0((__int64)&v169, (float *)&v166, v174, v174);
                                                  LODWORD(v165) = 1929;
                                                  v164 = v13;
                                                  v159 = v13 ^ 0x603B7871A21E29BFLL;
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_803;
                                                  LODWORD(v164) = 1;
                                                  if ( qword_1801175B8 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_1801175B8,
                                                         0) != 0 )
                                                  {
                                                    sub_1800C68B0(&unk_1801174A8);
                                                    if ( qword_1801175B8 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175B8,
                                                           0) != 0 )
                                                    {
                                                      v102 = sub_1800023C0(a1);
                                                      if ( v102 != 0 )
                                                      {
                                                        qword_1801175B8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v102);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v102);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_1801174A8);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_803;
                                                  }
                                                  if ( (int)v164 < 0 )
                                                  {
                                                    sub_180002110(a1, /*0x2ce*/ "java/lang/NegativeArraySizeException", /*0x2f3*/ "ANEWARRAY array size < 0", 24);
                                                  }
                                                  else
                                                  {
                                                    v164 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, _QWORD))(*(_QWORD *)a1 + 1376LL))(
                                                             a1,
                                                             (unsigned int)v164,
                                                             qword_1801175B8,
                                                             0);
                                                    sub_1800036C0((__int64)&v169, (float *)&v166, &v164, &v164);
                                                  }
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_803;
                                                  v103 = v164;
                                                  if ( qword_1801175C0 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_1801175C0,
                                                         0) != 0 )
                                                  {
                                                    sub_1800C68B0(&unk_1801174B0);
                                                    if ( qword_1801175C0 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175C0,
                                                           0) != 0 )
                                                    {
                                                      v104 = sub_1800023C0(a1);
                                                      if ( v104 != 0 )
                                                      {
                                                        qword_1801175C0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v104);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v104);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_1801174B0);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_803;
                                                  }
                                                  v105 = qword_1801175C0;
                                                  v156 = v103;
                                                  v106 = qword_1801175C0;
                                                  if ( v24 == 0 )
                                                  {
                                                    v24 = sub_180002610(a1, a2);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    {
LABEL_803:
                                                      v122 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                                      (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                                      v174[0] = v122;
                                                      v172[0] = v122;
                                                      sub_180026960(&v169, &v166, v172, v172);
                                                      goto LABEL_822;
                                                    }
                                                    v106 = qword_1801175C0;
                                                  }
                                                  v158 = v24;
                                                  if ( v106 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         v106,
                                                         0) != 0 )
                                                  {
                                                    sub_1800C68B0(&unk_1801174B0);
                                                    if ( qword_1801175C0 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175C0,
                                                           0) != 0 )
                                                    {
                                                      v107 = sub_1800023C0(a1);
                                                      if ( v107 != 0 )
                                                      {
                                                        qword_1801175C0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v107);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v107);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_1801174B0);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_803;
                                                  }
                                                  v160 = qword_1801175C0;
                                                  v163 = qword_180117310;
                                                  v162 = qword_180117318;
                                                  if ( qword_1801175C8 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_1801175C8,
                                                         0) != 0 )
                                                  {
                                                    sub_1800C68B0(&unk_1801174B8);
                                                    if ( qword_1801175C8 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175C8,
                                                           0) != 0 )
                                                    {
                                                      v108 = sub_1800023C0(a1);
                                                      if ( v108 != 0 )
                                                      {
                                                        qword_1801175C8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v108);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v108);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_1801174B8);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_803;
                                                  }
                                                  if ( qword_1801176B0 == 0 )
                                                  {
                                                    qword_1801176B0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                        a1,
                                                                        qword_1801175C8,
                                                                        /*0x30c*/ "fromMethodDescriptorString",
                                                                        /*0x327*/ "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/invoke/MethodType;");
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_803;
                                                  }
                                                  v162 = sub_180002760(a1);
                                                  sub_1800036C0((__int64)&v169, (float *)&v166, &v162, &v162);
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_803;
                                                  if ( qword_1801175D0 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_1801175D0,
                                                         0) != 0 )
                                                  {
                                                    sub_1800C68B0(&unk_1801174C0);
                                                    if ( qword_1801175D0 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175D0,
                                                           0) != 0 )
                                                    {
                                                      v109 = sub_1800023C0(a1);
                                                      if ( v109 != 0 )
                                                      {
                                                        qword_1801175D0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v109);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v109);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_1801174C0);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_803;
                                                  }
                                                  if ( qword_1801176B8 == 0 )
                                                  {
                                                    qword_1801176B8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                        a1,
                                                                        qword_1801175D0,
                                                                        /*0x370*/ "findStatic",
                                                                        /*0x37b*/ "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;",
                                                                        v6);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_803;
                                                  }
                                                  if ( v158 != 0 )
                                                  {
                                                    v158 = sub_180002790(a1);
                                                    sub_1800036C0((__int64)&v169, (float *)&v166, &v158, &v158);
                                                  }
                                                  else
                                                  {
                                                    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 24);
                                                  }
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_803;
                                                  v110 = v156;
                                                  v156 = v158;
                                                  v160 = v110;
                                                  v158 = qword_180117330;
                                                  v163 = qword_180117338;
                                                  v162 = v6;
                                                  if ( qword_1801175C8 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_1801175C8,
                                                         0) != 0 )
                                                  {
                                                    sub_1800C68B0(&unk_1801174B8);
                                                    if ( qword_1801175C8 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175C8,
                                                           0) != 0 )
                                                    {
                                                      v111 = sub_1800023C0(a1);
                                                      if ( v111 != 0 )
                                                      {
                                                        qword_1801175C8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v111);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v111);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_1801174B8);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_803;
                                                  }
                                                  if ( qword_1801176B0 == 0 )
                                                  {
                                                    qword_1801176B0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                        a1,
                                                                        qword_1801175C8,
                                                                        /*0x30c*/ "fromMethodDescriptorString",
                                                                        /*0x327*/ "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/invoke/MethodType;");
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_803;
                                                  }
                                                  v145 = v162;
                                                  v163 = sub_180002760(a1);
                                                  sub_1800036C0((__int64)&v169, (float *)&v166, &v163, &v163);
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_803;
                                                  v112 = v163;
                                                  v163 = v160;
                                                  v160 = v112;
                                                  LODWORD(v162) = 0;
                                                  if ( qword_1801175B8 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_1801175B8,
                                                         0) != 0 )
                                                  {
                                                    sub_1800C68B0(&unk_1801174A8);
                                                    if ( qword_1801175B8 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175B8,
                                                           0) != 0 )
                                                    {
                                                      v113 = sub_1800023C0(a1);
                                                      if ( v113 != 0 )
                                                      {
                                                        qword_1801175B8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v113);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v113);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_1801174A8);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_803;
                                                  }
                                                  if ( (int)v162 < 0 )
                                                  {
                                                    sub_180002110(a1, /*0x2ce*/ "java/lang/NegativeArraySizeException", /*0x2f3*/ "ANEWARRAY array size < 0", 24);
                                                  }
                                                  else
                                                  {
                                                    v162 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, _QWORD, __int64))(*(_QWORD *)a1 + 1376LL))(
                                                             a1,
                                                             (unsigned int)v162,
                                                             qword_1801175B8,
                                                             0,
                                                             v145);
                                                    sub_1800036C0((__int64)&v169, (float *)&v166, &v162, &v162);
                                                  }
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_803;
                                                  if ( qword_1801175B8 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_1801175B8,
                                                         0) != 0 )
                                                  {
                                                    sub_1800C68B0(&unk_1801174A8);
                                                    if ( qword_1801175B8 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175B8,
                                                           0) != 0 )
                                                    {
                                                      v114 = sub_1800023C0(a1);
                                                      if ( v114 != 0 )
                                                      {
                                                        qword_1801175B8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v114);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v114);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_1801174A8);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_803;
                                                  }
                                                  if ( v162 != 0
                                                    && (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                         a1,
                                                         v162,
                                                         qword_1801175B8) == 0 )
                                                  {
                                                    v115 = qword_1801172E0;
                                                    sub_1800267D0(v172, /*0x3fa*/ "cannot cast to ");
                                                    sub_1800267D0(v154, /*0x40a*/ "java/lang/Object");
                                                    sub_180026770(&v169, v172, v154);
                                                    v116 = v115 + 989;
                                                    if ( (v169 & 1) != 0 )
                                                      v117 = v171;
                                                    else
                                                      v117 = v170;
                                                    sub_180002110(a1, v116, v117, 24);
                                                    if ( (v169 & 1) != 0 )
                                                    {
                                                      sub_1800C0DC0(v171);
                                                      if ( (v154[0] & 1) == 0 )
                                                      {
LABEL_765:
                                                        if ( (v172[0] & 1) == 0 )
                                                          goto LABEL_767;
                                                        goto LABEL_766;
                                                      }
                                                    }
                                                    else if ( (v154[0] & 1) == 0 )
                                                    {
                                                      goto LABEL_765;
                                                    }
                                                    sub_1800C0DC0(v155);
                                                    if ( (v172[0] & 1) == 0 )
                                                    {
LABEL_767:
                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                        goto LABEL_803;
                                                      goto LABEL_772;
                                                    }
LABEL_766:
                                                    sub_1800C0DC0(v173);
                                                    goto LABEL_767;
                                                  }
LABEL_772:
                                                  v118 = v162;
                                                  v162 = v163;
                                                  v163 = v118;
                                                  sub_180001510(a1, v105, v156, v158, v160, v118, v162);
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_803;
                                                  if ( v164 != 0 )
                                                  {
                                                    v164 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1384LL))(
                                                             a1,
                                                             v164,
                                                             0);
                                                    sub_1800036C0((__int64)&v169, (float *)&v166, &v164, &v164);
                                                  }
                                                  else
                                                  {
                                                    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x41b*/ "AALOAD npe", 24);
                                                  }
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_803;
                                                  v119 = v164;
                                                  if ( qword_1801175D8 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_1801175D8,
                                                         0) != 0 )
                                                  {
                                                    sub_1800C68B0(&unk_1801174C8);
                                                    if ( qword_1801175D8 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175D8,
                                                           0) != 0 )
                                                    {
                                                      v120 = sub_1800023C0(a1);
                                                      if ( v120 != 0 )
                                                      {
                                                        qword_1801175D8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v120);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v120);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_1801174C8);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_803;
                                                  }
                                                  if ( v119 != 0
                                                    && (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                         a1,
                                                         v119,
                                                         qword_1801175D8) != 0 )
                                                  {
                                                    if ( qword_1801175D8 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175D8,
                                                           0) != 0 )
                                                    {
                                                      sub_1800C68B0(&unk_1801174C8);
                                                      if ( qword_1801175D8 == 0
                                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                             a1,
                                                             qword_1801175D8,
                                                             0) != 0 )
                                                      {
                                                        v121 = sub_1800023C0(a1);
                                                        if ( v121 != 0 )
                                                        {
                                                          qword_1801175D8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                              a1,
                                                                              v121);
                                                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                            a1,
                                                            v121);
                                                        }
                                                      }
                                                      sub_1800C6900(&unk_1801174C8);
                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                        goto LABEL_803;
                                                    }
                                                    if ( qword_1801176C0 == 0 )
                                                    {
                                                      qword_1801176C0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                          a1,
                                                                          qword_1801175D8,
                                                                          /*0x426*/ "getTarget",
                                                                          /*0x430*/ "()Ljava/lang/invoke/MethodHandle;");
                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                        goto LABEL_803;
                                                    }
                                                    if ( v164 != 0 )
                                                    {
                                                      v164 = sub_180002790(a1);
                                                      sub_1800036C0((__int64)&v169, (float *)&v166, &v164, &v164);
                                                    }
                                                    else
                                                    {
                                                      sub_180002110(
                                                        a1,
                                                        /*0x6d*/ "java/lang/NullPointerException",
                                                        /*0x452*/ "INVOKEINTERFACE Object npe",
                                                        24);
                                                    }
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                      goto LABEL_803;
                                                  }
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    goto LABEL_803;
                                                  sub_180026DB0(&v166, v174);
                                                  sub_180026DB0(&v166, &v164);
                                                  sub_180026DB0(&v166, &v153);
                                                  sub_180026DB0(&v166, &v151);
                                                  sub_180026DB0(&v166, &v152);
                                                  sub_180026DB0(&v166, &v157);
                                                  sub_180002660(a1, &v166);
                                                  if ( qword_1801175E0 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_1801175E0,
                                                         0) != 0 )
                                                  {
                                                    sub_1800C68B0(&unk_1801174D0);
                                                    if ( qword_1801175E0 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175E0,
                                                           0) != 0 )
                                                    {
                                                      v123 = sub_1800023C0(a1);
                                                      if ( v123 != 0 )
                                                      {
                                                        qword_1801175E0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v123);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v123);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_1801174D0);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                    {
LABEL_821:
                                                      v127 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                                      (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                                      v174[0] = v127;
                                                      v172[0] = v127;
                                                      sub_180026960(&v169, &v166, v172, v172);
LABEL_822:
                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                             a1,
                                                             v174[0],
                                                             qword_1801175A8) == 0 )
                                                        goto LABEL_326;
                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                        goto LABEL_894;
                                                      sub_180026DB0(&v166, v174);
                                                      sub_180026DB0(&v166, &v153);
                                                      sub_180026DB0(&v166, &v151);
                                                      sub_180026DB0(&v166, &v152);
                                                      sub_180026DB0(&v166, &v157);
                                                      sub_180002660(a1, &v166);
                                                      v165 = v174[0];
                                                      if ( qword_1801175E8 == 0
                                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                             a1,
                                                             qword_1801175E8,
                                                             0) != 0 )
                                                      {
                                                        sub_1800C68B0(&unk_1801174D8);
                                                        if ( qword_1801175E8 == 0
                                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                               a1,
                                                               qword_1801175E8,
                                                               0) != 0 )
                                                        {
                                                          v128 = sub_1800023C0(a1);
                                                          if ( v128 != 0 )
                                                          {
                                                            qword_1801175E8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                a1,
                                                                                v128);
                                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                              a1,
                                                              v128);
                                                          }
                                                        }
                                                        sub_1800C6900(&unk_1801174D8);
                                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                          goto LABEL_894;
                                                      }
                                                      if ( v165 != 0 )
                                                      {
                                                        v129 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                                 a1,
                                                                 v165,
                                                                 qword_1801175E8);
                                                        LODWORD(v165) = v129;
                                                        if ( v129 != 0 )
                                                          goto LABEL_864;
                                                      }
                                                      else
                                                      {
                                                        LODWORD(v165) = 0;
                                                      }
                                                      if ( qword_1801175E8 == 0
                                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                             a1,
                                                             qword_1801175E8,
                                                             0) != 0 )
                                                      {
                                                        sub_1800C68B0(&unk_1801174D8);
                                                        if ( qword_1801175E8 == 0
                                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                               a1,
                                                               qword_1801175E8,
                                                               0) != 0 )
                                                        {
                                                          v130 = sub_1800023C0(a1);
                                                          if ( v130 != 0 )
                                                          {
                                                            qword_1801175E8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                a1,
                                                                                v130);
                                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                              a1,
                                                              v130);
                                                          }
                                                        }
                                                        sub_1800C6900(&unk_1801174D8);
                                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                          goto LABEL_894;
                                                      }
                                                      v131 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 216LL))(
                                                               a1,
                                                               qword_1801175E8);
                                                      v172[0] = v131;
                                                      if ( v131 != 0 )
                                                      {
                                                        v165 = v131;
                                                        sub_1800036C0((__int64)&v169, (float *)&v166, v172, v172);
                                                      }
                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                        goto LABEL_894;
                                                      v161 = v165;
                                                      v164 = v165;
                                                      v159 = v174[0];
                                                      v174[0] = v165;
                                                      if ( qword_1801175E8 == 0
                                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                             a1,
                                                             qword_1801175E8,
                                                             0) != 0 )
                                                      {
                                                        sub_1800C68B0(&unk_1801174D8);
                                                        if ( qword_1801175E8 == 0
                                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                               a1,
                                                               qword_1801175E8,
                                                               0) != 0 )
                                                        {
                                                          v132 = sub_1800023C0(a1);
                                                          if ( v132 != 0 )
                                                          {
                                                            qword_1801175E8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                a1,
                                                                                v132);
                                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                              a1,
                                                              v132);
                                                          }
                                                        }
                                                        sub_1800C6900(&unk_1801174D8);
                                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                          goto LABEL_894;
                                                      }
                                                      if ( qword_1801176C8 == 0 )
                                                      {
                                                        qword_1801176C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                            a1,
                                                                            qword_1801175E8,
                                                                            /*0x48b*/ "<init>",
                                                                            /*0x492*/ "(Ljava/lang/Throwable;)V");
                                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                          goto LABEL_894;
                                                      }
                                                      if ( v165 != 0 )
                                                        sub_180026870(a1, v165, qword_1801175E8, qword_1801176C8, v159);
                                                      else
                                                        sub_180002110(
                                                          a1,
                                                          /*0x6d*/ "java/lang/NullPointerException",
                                                          /*0x4ab*/ "INVOKESPECIAL Void npe",
                                                          24);
                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                        goto LABEL_894;
LABEL_864:
                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                        goto LABEL_894;
                                                      sub_180026DB0(&v166, v174);
                                                      sub_180026DB0(&v166, &v153);
                                                      sub_180026DB0(&v166, &v151);
                                                      sub_180026DB0(&v166, &v152);
                                                      sub_180026DB0(&v166, &v157);
                                                      sub_180002660(a1, &v166);
                                                      v133 = v174[0];
                                                      if ( v174[0] != 0 )
                                                      {
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(
                                                          a1,
                                                          v174[0]);
                                                        v172[0] = v133;
                                                        sub_180026960(&v169, &v166, v172, v172);
                                                      }
                                                      else
                                                      {
                                                        sub_180002110(
                                                          a1,
                                                          /*0x6d*/ "java/lang/NullPointerException",
                                                          /*0x29a*/ "ATHROW npe",
                                                          24);
                                                      }
                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                        goto LABEL_894;
LABEL_870:
                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                        goto LABEL_894;
                                                      sub_180026DB0(&v166, v174);
                                                      sub_180026DB0(&v166, &v164);
                                                      sub_180026DB0(&v166, &v153);
                                                      sub_180026DB0(&v166, &v151);
                                                      sub_180026DB0(&v166, &v152);
                                                      sub_180026DB0(&v166, &v157);
                                                      sub_180002660(a1, &v166);
                                                      if ( qword_1801175F0 == 0
                                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                             a1,
                                                             qword_1801175F0,
                                                             0) != 0 )
                                                      {
                                                        sub_1800C68B0(&unk_1801174E0);
                                                        if ( qword_1801175F0 == 0
                                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                               a1,
                                                               qword_1801175F0,
                                                               0) != 0 )
                                                        {
                                                          v134 = sub_1800023C0(a1);
                                                          if ( v134 != 0 )
                                                          {
                                                            qword_1801175F0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                a1,
                                                                                v134);
                                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                              a1,
                                                              v134);
                                                          }
                                                        }
                                                        sub_1800C6900(&unk_1801174E0);
                                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                          goto LABEL_894;
                                                      }
                                                      v135 = qword_1801176D0;
                                                      if ( qword_1801176D0 == 0 )
                                                      {
                                                        qword_1801176D0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                            a1,
                                                                            qword_1801175F0,
                                                                            /*0x4c2*/ "invokereverse0",
                                                                            /*0x4d1*/ "(IJLjava/lang/invoke/MethodHandle;)I");
                                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                        {
LABEL_894:
                                                          v137 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                                          (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                                          v174[0] = v137;
                                                          v172[0] = v137;
                                                          sub_180026960(&v169, &v166, v172, v172);
                                                          goto LABEL_326;
                                                        }
                                                        v135 = qword_1801176D0;
                                                      }
                                                      LODWORD(v165) = sub_1800268A0(
                                                                        a1,
                                                                        qword_1801175F0,
                                                                        v135,
                                                                        (unsigned int)v165,
                                                                        v159,
                                                                        v164);
                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                        goto LABEL_894;
                                                      if ( qword_180117630 == 0
                                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                             a1,
                                                             qword_180117630,
                                                             0) != 0 )
                                                      {
                                                        sub_1800C68B0(&unk_180117520);
                                                        if ( qword_180117630 == 0
                                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                               a1,
                                                               qword_180117630,
                                                               0) != 0 )
                                                        {
                                                          v136 = sub_1800023C0(a1);
                                                          if ( v136 != 0 )
                                                          {
                                                            qword_180117630 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                a1,
                                                                                v136);
                                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                              a1,
                                                              v136);
                                                          }
                                                        }
                                                        sub_1800C6900(&unk_180117520);
                                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                          goto LABEL_894;
                                                      }
                                                      if ( qword_180117710 == 0 )
                                                      {
                                                        qword_180117710 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                            a1,
                                                                            qword_180117630,
                                                                            /*0xb90*/ "copyOf",
                                                                            /*0xb97*/ "([BI)[B");
                                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                          goto LABEL_894;
                                                      }
                                                      v174[0] = sub_180002760(a1);
                                                      sub_1800036C0((__int64)&v169, (float *)&v166, v174, v174);
                                                      v138 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                      v139 = *(_QWORD *)a1;
                                                      if ( v138 != 0 )
                                                      {
                                                        v140 = (*(__int64 (__fastcall **)(__int64))(v139 + 120))(a1);
                                                        (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                                        v174[0] = v140;
                                                        v172[0] = v140;
                                                        sub_180026960(&v169, &v166, v172, v172);
LABEL_326:
                                                        if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                               a1,
                                                               v174[0],
                                                               qword_1801175A0) != 0 )
                                                        {
                                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                          {
                                                            sub_180026DB0(&v166, v174);
                                                            sub_180002660(a1, &v166);
                                                            v153 = v174[0];
                                                            sub_1800036C0((__int64)&v169, (float *)&v166, v174, v174);
                                                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                            {
                                                              if ( qword_180117638 != 0
                                                                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                     a1,
                                                                     qword_180117638,
                                                                     0) == 0 )
                                                              {
                                                                goto LABEL_336;
                                                              }
                                                              sub_1800C68B0(&unk_180117528);
                                                              if ( qword_180117638 == 0
                                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                     a1,
                                                                     qword_180117638,
                                                                     0) != 0 )
                                                              {
                                                                v54 = sub_1800023C0(a1);
                                                                if ( v54 != 0 )
                                                                {
                                                                  qword_180117638 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                      a1,
                                                                                      v54);
                                                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                    a1,
                                                                    v54);
                                                                }
                                                              }
                                                              sub_1800C6900(&unk_180117528);
                                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                              {
LABEL_336:
                                                                v55 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 216LL))(
                                                                        a1,
                                                                        qword_180117638);
                                                                v172[0] = v55;
                                                                if ( v55 != 0 )
                                                                {
                                                                  v174[0] = v55;
                                                                  sub_1800036C0(
                                                                    (__int64)&v169,
                                                                    (float *)&v166,
                                                                    v172,
                                                                    v172);
                                                                }
                                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                                {
                                                                  v165 = v174[0];
                                                                  if ( qword_1801175B0 != 0
                                                                    && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                         a1,
                                                                         qword_1801175B0,
                                                                         0) == 0 )
                                                                  {
                                                                    goto LABEL_908;
                                                                  }
                                                                  sub_1800C68B0(&unk_1801174A0);
                                                                  if ( qword_1801175B0 == 0
                                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                         a1,
                                                                         qword_1801175B0,
                                                                         0) != 0 )
                                                                  {
                                                                    v56 = sub_1800023C0(a1);
                                                                    if ( v56 != 0 )
                                                                    {
                                                                      qword_1801175B0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                          a1,
                                                                                          v56);
                                                                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                        a1,
                                                                        v56);
                                                                    }
                                                                  }
                                                                  sub_1800C6900(&unk_1801174A0);
                                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                                  {
LABEL_908:
                                                                    if ( qword_180117848 != 0
                                                                      || (qword_180117848 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL /*GetMethodID*/))(
                                                                                              a1,
                                                                                              qword_1801175B0,
                                                                                              /*0xa5*/ "a",
                                                                                              /*0xa3e*/ "[Ljava/lang/String;"),
                                                                          (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                                                                    {
                                                                      v159 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1160LL /*GetObjectClass/AllocObject*/))(
                                                                               a1,
                                                                               qword_1801175B0);
                                                                      sub_1800036C0(
                                                                        (__int64)&v169,
                                                                        (float *)&v166,
                                                                        &v159,
                                                                        &v159);
                                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                                      {
                                                                        LODWORD(v161) = 5;
                                                                        if ( v159 != 0 )
                                                                        {
                                                                          v159 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 1384LL))(
                                                                                   a1,
                                                                                   v159,
                                                                                   5);
                                                                          sub_1800036C0(
                                                                            (__int64)&v169,
                                                                            (float *)&v166,
                                                                            &v159,
                                                                            &v159);
                                                                        }
                                                                        else
                                                                        {
                                                                          sub_180002110(
                                                                            a1,
                                                                            /*0x6d*/ "java/lang/NullPointerException",
                                                                            /*0x41b*/ "AALOAD npe",
                                                                            18);
                                                                        }
                                                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                                        {
                                                                          v161 = v153;
                                                                          sub_1800036C0(
                                                                            (__int64)&v169,
                                                                            (float *)&v166,
                                                                            &v161,
                                                                            &v161);
                                                                          if ( qword_180117638 != 0
                                                                            && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                                 a1,
                                                                                 qword_180117638,
                                                                                 0) == 0 )
                                                                          {
                                                                            goto LABEL_373;
                                                                          }
                                                                          sub_1800C68B0(&unk_180117528);
                                                                          if ( qword_180117638 == 0
                                                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                                 a1,
                                                                                 qword_180117638,
                                                                                 0) != 0 )
                                                                          {
                                                                            v57 = sub_1800023C0(a1);
                                                                            if ( v57 != 0 )
                                                                            {
                                                                              qword_180117638 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                                  a1,
                                                                                                  v57);
                                                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                                a1,
                                                                                v57);
                                                                            }
                                                                          }
                                                                          sub_1800C6900(&unk_180117528);
                                                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                                          {
LABEL_373:
                                                                            if ( qword_180117718 != 0
                                                                              || (qword_180117718 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(a1, qword_180117638, /*0x48b*/ "<init>", /*0xb9f*/ "(Ljava/lang/String;Ljava/lang/Throwable;)V"),
                                                                                  (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                                                                            {
                                                                              if ( v165 != 0 )
                                                                                sub_180026870(
                                                                                  a1,
                                                                                  v165,
                                                                                  qword_180117638,
                                                                                  qword_180117718,
                                                                                  v159,
                                                                                  v161);
                                                                              else
                                                                                sub_180002110(
                                                                                  a1,
                                                                                  /*0x6d*/ "java/lang/NullPointerException",
                                                                                  /*0x4ab*/ "INVOKESPECIAL Void npe",
                                                                                  18);
                                                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0
                                                                                && (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                                              {
                                                                                v58 = v174[0];
                                                                                if ( v174[0] != 0 )
                                                                                {
                                                                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(
                                                                                    a1,
                                                                                    v174[0]);
                                                                                  v172[0] = v58;
                                                                                  sub_180026960(
                                                                                    &v169,
                                                                                    &v166,
                                                                                    v172,
                                                                                    v172);
                                                                                }
                                                                                else
                                                                                {
                                                                                  sub_180002110(
                                                                                    a1,
                                                                                    /*0x6d*/ "java/lang/NullPointerException",
                                                                                    /*0x29a*/ "ATHROW npe",
                                                                                    18);
                                                                                }
                                                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                                                  (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
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
                                                          }
                                                        }
                                                        else
                                                        {
                                                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(
                                                            a1,
                                                            v174[0]);
                                                        }
                                                        goto LABEL_33;
                                                      }
                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(v139 + 1824))(a1) == 0 )
                                                      {
                                                        v14 = v174[0];
                                                        goto LABEL_34;
                                                      }
LABEL_33:
                                                      v14 = 0;
LABEL_34:
                                                      v15 = (_QWORD *)v167;
                                                      if ( (_QWORD)v167 != 0 )
                                                      {
                                                        do
                                                        {
                                                          v16 = (_QWORD *)*v15;
                                                          sub_1800C0DC0(v15);
                                                          v15 = v16;
                                                        }
                                                        while ( v16 != nullptr );
                                                      }
                                                      v17 = v166;
                                                      *(_QWORD *)&v166 = 0;
                                                      if ( v17 != 0 )
                                                        sub_1800C0DC0(v17);
                                                      return v14;
                                                    }
                                                  }
                                                  if ( v164 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                         a1,
                                                         v164,
                                                         qword_1801175E0) != 0 )
                                                  {
                                                    goto LABEL_870;
                                                  }
                                                  v124 = qword_1801172E0;
                                                  sub_1800267D0(v172, /*0x3fa*/ "cannot cast to ");
                                                  sub_1800267D0(v154, /*0x46d*/ "java/lang/invoke/MethodHandle");
                                                  sub_180026770(&v169, v172, v154);
                                                  v125 = v124 + 989;
                                                  if ( (v169 & 1) != 0 )
                                                    v126 = v171;
                                                  else
                                                    v126 = v170;
                                                  sub_180002110(a1, v125, v126, 24);
                                                  if ( (v169 & 1) != 0 )
                                                  {
                                                    sub_1800C0DC0(v171);
                                                    if ( (v154[0] & 1) == 0 )
                                                    {
LABEL_818:
                                                      if ( (v172[0] & 1) == 0 )
                                                        goto LABEL_820;
                                                      goto LABEL_819;
                                                    }
                                                  }
                                                  else if ( (v154[0] & 1) == 0 )
                                                  {
                                                    goto LABEL_818;
                                                  }
                                                  sub_1800C0DC0(v155);
                                                  if ( (v172[0] & 1) == 0 )
                                                  {
LABEL_820:
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                      goto LABEL_870;
                                                    goto LABEL_821;
                                                  }
LABEL_819:
                                                  sub_1800C0DC0(v173);
                                                  goto LABEL_820;
                                                }
                                              }
                                              if ( v161 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                     a1,
                                                     v161,
                                                     qword_1801175E0) != 0 )
                                              {
                                                goto LABEL_588;
                                              }
                                              v90 = qword_1801172E0;
                                              sub_1800267D0(v172, /*0x3fa*/ "cannot cast to ");
                                              sub_1800267D0(v154, /*0x46d*/ "java/lang/invoke/MethodHandle");
                                              sub_180026770(&v169, v172, v154);
                                              v91 = v90 + 989;
                                              if ( (v169 & 1) != 0 )
                                                v92 = v171;
                                              else
                                                v92 = v170;
                                              sub_180002110(a1, v91, v92, 10);
                                              if ( (v169 & 1) != 0 )
                                              {
                                                sub_1800C0DC0(v171);
                                                if ( (v154[0] & 1) == 0 )
                                                {
LABEL_585:
                                                  if ( (v172[0] & 1) == 0 )
                                                    goto LABEL_587;
                                                  goto LABEL_586;
                                                }
                                              }
                                              else if ( (v154[0] & 1) == 0 )
                                              {
                                                goto LABEL_585;
                                              }
                                              sub_1800C0DC0(v155);
                                              if ( (v172[0] & 1) == 0 )
                                              {
LABEL_587:
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                  goto LABEL_588;
                                                goto LABEL_577;
                                              }
LABEL_586:
                                              sub_1800C0DC0(v173);
                                              goto LABEL_587;
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
                        }
                      }
                    }
                  }
                  v39 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                  (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                  v174[0] = v39;
                  v172[0] = v39;
                  sub_180026960(&v169, &v166, v172, v172);
                  goto LABEL_71;
                }
              }
            }
          }
          v23 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
          (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
          v174[0] = v23;
          v172[0] = v23;
          sub_180026960(&v169, &v166, v172, v172);
          v24 = 0;
          goto LABEL_71;
        }
      }
    }
  }
  v19 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
  (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
  v174[0] = v19;
  v172[0] = v19;
  sub_180026960(&v169, &v166, v172, v172);
  goto LABEL_326;
}
