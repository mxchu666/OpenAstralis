__int64 __fastcall sub_18009C890(__int64 a1, __int64 a2)
{
  __int64 v4; // rbx
  __int64 result; // rax
  __int64 v6; // rdi
  __int64 v7; // rbx
  __int64 v8; // rax
  __int64 v9; // r15
  __int64 v10; // r15
  __int64 v11; // r14
  unsigned int v12; // r12d
  __int64 v13; // r14
  unsigned __int8 (__fastcall *v14)(__int64); // rax
  __int64 v15; // r14
  __int64 v16; // rbx
  __int64 v17; // rbx
  __int64 v18; // rbx
  __int64 v19; // r14
  __int64 v20; // r14
  __int64 v21; // rbx
  __int64 v22; // r14
  __int64 v23; // r12
  __int64 v24; // r14
  __int64 v25; // r14
  __int64 v26; // rbx
  __int64 v27; // r12
  __int64 v28; // r13
  __int64 v29; // rbx
  __int64 v30; // r13
  __int64 v31; // rbx
  __int64 v32; // r13
  __int64 v33; // r12
  char v34; // al
  __int64 v35; // rdx
  __int64 v36; // rbx
  __int64 v37; // r12
  __int64 v38; // rbx
  __int64 v39; // r12
  __int64 v40; // r13
  __int64 v41; // rbx
  __int64 v42; // rbx
  __int64 v43; // r13
  __int64 v44; // rbx
  __int64 v45; // rbx
  __int64 v46; // rbx
  unsigned __int8 v47; // al
  __int64 v48; // rbx
  __int64 v49; // rbx
  __int64 v50; // rax
  __int64 v51; // rbx
  __int64 v52; // rbx
  __int64 v53; // rbx
  __int64 v54; // rbx
  __int64 v55; // r8
  __int64 v56; // rbx
  __int64 v57; // rdi
  __int64 v58; // rbx
  __int64 v59; // rbx
  _BYTE *v60; // r8
  __int64 v61; // r12
  __int64 v62; // rbx
  __int64 v63; // rbx
  __int64 v64; // rbx
  _BYTE *v65; // r8
  __int64 v66; // r14
  __int64 v67; // r9
  __int64 v68; // rbx
  __int64 v69; // r14
  __int64 v70; // rbx
  __int64 v71; // rbx
  __int64 v72; // r14
  __int64 v73; // rbx
  __int64 v74; // r8
  __int64 v75; // rbx
  __int64 v76; // r14
  __int64 v77; // rbx
  __int64 v78; // rbx
  __int64 v79; // rbx
  _BYTE *v80; // r8
  __int64 v81; // rax
  __int64 v82; // rbx
  __int64 v83; // rbx
  __int64 v84; // r14
  __int64 v85; // rbx
  __int64 v86; // rbx
  int v87; // r14d
  __int64 v88; // rbx
  __int64 v89; // rbx
  __int64 v90; // rbx
  __int64 v91; // rbx
  _BYTE *v92; // r8
  __int64 v93; // rbx
  __int64 v94; // rbx
  __int64 v95; // r8
  __int64 v96; // rbx
  char v97; // al
  __int64 v98; // rdx
  __int64 v99; // rbx
  char v100; // al
  __int64 v101; // rbx
  __int64 v102; // rbx
  __int64 v103; // rbx
  char v104; // al
  __int64 v105; // rbx
  __int64 v106; // rbx
  __int64 v107; // r8
  __int64 v108; // r13
  __int64 v109; // r14
  __int64 v110; // r8
  __int64 v111; // rax
  __int64 v112; // [rsp+20h] [rbp-60h]
  __int64 v113; // [rsp+20h] [rbp-60h]
  __int64 v114; // [rsp+20h] [rbp-60h]
  __int64 v115; // [rsp+20h] [rbp-60h]
  __int64 v116; // [rsp+28h] [rbp-58h]
  __int64 v117; // [rsp+40h] [rbp-40h] BYREF
  __int64 v118; // [rsp+48h] [rbp-38h]
  __int64 v119; // [rsp+50h] [rbp-30h]
  __int64 v120; // [rsp+58h] [rbp-28h] BYREF
  __int64 v121; // [rsp+60h] [rbp-20h] BYREF
  _BYTE v122[16]; // [rsp+68h] [rbp-18h] BYREF
  __int64 v123; // [rsp+78h] [rbp-8h]
  __int64 v124; // [rsp+80h] [rbp+0h] BYREF
  __int64 v125; // [rsp+88h] [rbp+8h] BYREF
  __int64 v126; // [rsp+90h] [rbp+10h] BYREF
  __int64 v127; // [rsp+98h] [rbp+18h] BYREF
  __int64 v128; // [rsp+A0h] [rbp+20h] BYREF
  __int64 v129; // [rsp+A8h] [rbp+28h] BYREF
  _QWORD v130[4]; // [rsp+B0h] [rbp+30h] BYREF
  int v131; // [rsp+D0h] [rbp+50h]
  __int64 v132; // [rsp+E0h] [rbp+60h] BYREF
  __int64 v133; // [rsp+E8h] [rbp+68h] BYREF
  char v134; // [rsp+F0h] [rbp+70h] BYREF
  _BYTE v135[15]; // [rsp+F1h] [rbp+71h] BYREF
  _BYTE *v136; // [rsp+100h] [rbp+80h]
  __int64 v137[2]; // [rsp+108h] [rbp+88h] BYREF
  __int64 v138; // [rsp+118h] [rbp+98h]
  __int64 v139[8]; // [rsp+120h] [rbp+A0h] BYREF

  v4 = sub_180002590();
  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
  if ( (_BYTE)result == 0 )
  {
    v6 = sub_1800025D0(a1, v4);
    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
    if ( (_BYTE)result == 0 )
    {
      if ( v6 == 0 )
        return (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 144LL /*Throw/FatalError*/))(a1, /*0x8*/ "classloader == null");
      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v4);
      v7 = sub_1800023C0(a1);
      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
      if ( (_BYTE)result == 0 )
      {
        if ( qword_180117D38 != 0
          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
               a1,
               qword_180117D38,
               0) == 0 )
        {
          goto LABEL_13;
        }
        sub_1800C68B0(&unk_180117B28);
        if ( qword_180117D38 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
               a1,
               qword_180117D38,
               0) != 0 )
        {
          v8 = sub_1800023C0(a1);
          if ( v8 != 0 )
          {
            v9 = v8;
            qword_180117D38 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v8);
            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v9);
          }
        }
        sub_1800C6900(&unk_180117B28);
        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
        if ( (_BYTE)result == 0 )
        {
LABEL_13:
          v139[0] = 0;
          v133 = 0;
          v132 = 0;
          v126 = 0;
          v124 = 0;
          v125 = 0;
          v129 = 0;
          v128 = 0;
          v117 = 0;
          v120 = 0;
          v121 = 0;
          memset(v130, 0, sizeof(v130));
          v131 = 1065353216;
          v127 = a2;
          sub_1800036C0((__int64)&v134, (float *)v130, &v127, &v127);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
            return sub_180003630(v130);
          v139[0] = 0x74145900121LL;
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
            return sub_180003630(v130);
          v10 = v139[0];
          if ( qword_180117D40 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                 a1,
                 qword_180117D40,
                 0) != 0 )
          {
            sub_1800C68B0(&unk_180117B30);
            if ( qword_180117D40 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                   a1,
                   qword_180117D40,
                   0) != 0 )
            {
              v11 = sub_1800023C0(a1);
              if ( v11 != 0 )
              {
                qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v11);
                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v11);
              }
            }
            sub_1800C6900(&unk_180117B30);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
              return sub_180003630(v130);
          }
          if ( qword_180118200 == 0 )
          {
            qword_180118200 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                a1,
                                qword_180117D40,
                                /*0x2f6f*/ "edc",
                                /*0x275b*/ "()Z");
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
              return sub_180003630(v130);
          }
          LODWORD(v139[0]) = (unsigned __int8)sub_1800BE210(a1, qword_180117D40);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
            return sub_180003630(v130);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
            return sub_180003630(v130);
          v12 = v139[0];
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
            return sub_180003630(v130);
          v139[0] = v127;
          sub_1800036C0((__int64)&v134, (float *)v130, v139, v139);
          if ( qword_180117D40 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                 a1,
                 qword_180117D40,
                 0) != 0 )
          {
            sub_1800C68B0(&unk_180117B30);
            if ( qword_180117D40 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                   a1,
                   qword_180117D40,
                   0) != 0 )
            {
              v13 = sub_1800023C0(a1);
              if ( v13 != 0 )
              {
                qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v13);
                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v13);
              }
            }
            sub_1800C6900(&unk_180117B30);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
              return sub_180003630(v130);
          }
          if ( qword_180118380 == 0 )
          {
            qword_180118380 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 752LL))(
                                a1,
                                qword_180117D40,
                                /*0x2f73*/ "bvh",
                                /*0xdd6*/ "I");
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
              return sub_180003630(v130);
          }
          if ( v139[0] != 0 )
            LODWORD(v139[0]) = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 800LL))(
                                 a1,
                                 v139[0],
                                 qword_180118380);
          else
            sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x2ee6*/ "GETFIELD Int npe", 195);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
            return sub_180003630(v130);
          LODWORD(v133) = 10;
          v14 = *(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/);
          if ( SLODWORD(v139[0]) < 10 )
          {
            if ( v14(a1) != 0 )
              return sub_180003630(v130);
            sub_180026DB0(v130, &v127);
            sub_180002660(a1, v130);
            v139[0] = v127;
            sub_1800036C0((__int64)&v134, (float *)v130, v139, v139);
            v133 = v139[0];
            if ( qword_180117D40 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                   a1,
                   qword_180117D40,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117B30);
              if ( qword_180117D40 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                     a1,
                     qword_180117D40,
                     0) != 0 )
              {
                v15 = sub_1800023C0(a1);
                if ( v15 != 0 )
                {
                  qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v15);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v15);
                }
              }
              sub_1800C6900(&unk_180117B30);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                return sub_180003630(v130);
            }
            if ( qword_180118380 == 0 )
            {
              qword_180118380 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 752LL))(
                                  a1,
                                  qword_180117D40,
                                  /*0x2f73*/ "bvh",
                                  /*0xdd6*/ "I");
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                return sub_180003630(v130);
            }
            if ( v133 != 0 )
              LODWORD(v133) = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 800LL))(
                                a1,
                                v133,
                                qword_180118380);
            else
              sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x2ee6*/ "GETFIELD Int npe", 201);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
              return sub_180003630(v130);
            LODWORD(v133) = v133 + 1;
            LODWORD(v132) = 1;
            if ( qword_180117D40 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                   a1,
                   qword_180117D40,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117B30);
              if ( qword_180117D40 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                     a1,
                     qword_180117D40,
                     0) != 0 )
              {
                v19 = sub_1800023C0(a1);
                if ( v19 != 0 )
                {
                  qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v19);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v19);
                }
              }
              sub_1800C6900(&unk_180117B30);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                return sub_180003630(v130);
            }
            if ( qword_180118380 == 0 )
            {
              qword_180118380 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 752LL))(
                                  a1,
                                  qword_180117D40,
                                  /*0x2f73*/ "bvh",
                                  /*0xdd6*/ "I");
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                return sub_180003630(v130);
            }
            if ( v139[0] != 0 )
              (*(void (__fastcall **)(__int64, __int64, __int64, _QWORD))(*(_QWORD *)a1 + 872LL))(
                a1,
                v139[0],
                qword_180118380,
                (unsigned int)v133);
            else
              sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x2f77*/ "PUTFIELD Int npe", 201);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0
              || (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
            {
              return sub_180003630(v130);
            }
            v139[0] = v127;
            sub_1800036C0((__int64)&v134, (float *)v130, v139, v139);
            if ( qword_180117D40 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                   a1,
                   qword_180117D40,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117B30);
              if ( qword_180117D40 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                     a1,
                     qword_180117D40,
                     0) != 0 )
              {
                v20 = sub_1800023C0(a1);
                if ( v20 != 0 )
                {
                  qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v20);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v20);
                }
              }
              sub_1800C6900(&unk_180117B30);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                return sub_180003630(v130);
            }
            if ( qword_180118388 == 0 )
            {
              qword_180118388 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 752LL))(
                                  a1,
                                  qword_180117D40,
                                  /*0x2f88*/ "edq",
                                  /*0x2f8c*/ "Ljava/util/concurrent/ScheduledExecutorService;");
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                return sub_180003630(v130);
            }
            if ( v139[0] != 0 )
            {
              v139[0] = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 760LL))(
                          a1,
                          v139[0],
                          qword_180118388);
              sub_1800036C0((__int64)&v134, (float *)v130, v139, v139);
            }
            else
            {
              sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x24f*/ "GETFIELD Object npe", 215);
            }
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
              return sub_180003630(v130);
            v133 = v127;
            sub_1800036C0((__int64)&v134, (float *)v130, &v133, &v133);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
            {
              LODWORD(v132) = 1;
              if ( qword_180117D78 != 0
                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                     a1,
                     qword_180117D78,
                     0) == 0 )
              {
                goto LABEL_823;
              }
              sub_1800C68B0(&unk_180117B68);
              if ( qword_180117D78 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                     a1,
                     qword_180117D78,
                     0) != 0 )
              {
                v22 = sub_1800023C0(a1);
                if ( v22 != 0 )
                {
                  qword_180117D78 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v22);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v22);
                }
              }
              sub_1800C6900(&unk_180117B68);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
              {
LABEL_823:
                if ( (int)v132 < 0 )
                {
                  sub_180002110(a1, /*0x2ce*/ "java/lang/NegativeArraySizeException", /*0x2f3*/ "ANEWARRAY array size < 0", 215);
                }
                else
                {
                  v132 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, _QWORD))(*(_QWORD *)a1 + 1376LL))(
                           a1,
                           (unsigned int)v132,
                           qword_180117D78,
                           0);
                  sub_1800036C0((__int64)&v134, (float *)v130, &v132, &v132);
                }
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                {
                  v23 = v132;
                  if ( qword_180117D80 != 0
                    && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                         a1,
                         qword_180117D80,
                         0) == 0 )
                  {
                    goto LABEL_824;
                  }
                  sub_1800C68B0(&unk_180117B70);
                  if ( qword_180117D80 == 0
                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                         a1,
                         qword_180117D80,
                         0) != 0 )
                  {
                    v24 = sub_1800023C0(a1);
                    if ( v24 != 0 )
                    {
                      qword_180117D80 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v24);
                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v24);
                    }
                  }
                  sub_1800C6900(&unk_180117B70);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                  {
LABEL_824:
                    v118 = qword_180117D80;
                    v126 = v23;
                    v25 = sub_180002610(a1, v7);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                    {
                      v124 = v25;
                      if ( qword_180117D88 != 0
                        && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                             a1,
                             qword_180117D88,
                             0) == 0 )
                      {
                        goto LABEL_825;
                      }
                      sub_1800C68B0(&unk_180117B78);
                      if ( qword_180117D88 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                             a1,
                             qword_180117D88,
                             0) != 0 )
                      {
                        v27 = sub_1800023C0(a1);
                        if ( v27 != 0 )
                        {
                          qword_180117D88 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                              a1,
                                              v27);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v27);
                        }
                      }
                      sub_1800C6900(&unk_180117B78);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                      {
LABEL_825:
                        v125 = qword_180117908;
                        v129 = qword_180117910;
                        if ( qword_180117D90 != 0
                          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                               a1,
                               qword_180117D90,
                               0) == 0 )
                        {
                          goto LABEL_826;
                        }
                        sub_1800C68B0(&unk_180117B80);
                        if ( qword_180117D90 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                               a1,
                               qword_180117D90,
                               0) != 0 )
                        {
                          v28 = sub_1800023C0(a1);
                          if ( v28 != 0 )
                          {
                            qword_180117D90 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                a1,
                                                v28);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v28);
                          }
                        }
                        sub_1800C6900(&unk_180117B80);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                        {
LABEL_826:
                          if ( qword_180117F98 != 0
                            || (qword_180117F98 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                    a1,
                                                    qword_180117D90,
                                                    /*0x30c*/ "fromMethodDescriptorString",
                                                    /*0x327*/ "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/invoke/MethodType;"),
                                (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                          {
                            v129 = sub_180002760(a1);
                            sub_1800036C0((__int64)&v134, (float *)v130, &v129, &v129);
                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                            {
                              if ( qword_180117D98 != 0
                                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                     a1,
                                     qword_180117D98,
                                     0) == 0 )
                              {
                                goto LABEL_829;
                              }
                              sub_1800C68B0(&unk_180117B88);
                              if ( qword_180117D98 == 0
                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                     a1,
                                     qword_180117D98,
                                     0) != 0 )
                              {
                                v30 = sub_1800023C0(a1);
                                if ( v30 != 0 )
                                {
                                  qword_180117D98 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                      a1,
                                                      v30);
                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v30);
                                }
                              }
                              sub_1800C6900(&unk_180117B88);
                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                              {
LABEL_829:
                                if ( qword_180117FA0 != 0
                                  || (qword_180117FA0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                          a1,
                                                          qword_180117D98,
                                                          /*0x370*/ "findStatic",
                                                          /*0x37b*/ "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;",
                                                          v6),
                                      (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                                {
                                  if ( v124 != 0 )
                                  {
                                    v116 = v129;
                                    v124 = sub_180002790(a1);
                                    sub_1800036C0((__int64)&v134, (float *)v130, &v124, &v124);
                                  }
                                  else
                                  {
                                    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 215);
                                  }
                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                  {
                                    v32 = v126;
                                    v126 = v124;
                                    v124 = qword_180117928;
                                    v125 = qword_180117930;
                                    v129 = v6;
                                    if ( qword_180117D90 != 0
                                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                           a1,
                                           qword_180117D90,
                                           0) == 0 )
                                    {
                                      goto LABEL_830;
                                    }
                                    sub_1800C68B0(&unk_180117B80);
                                    if ( qword_180117D90 == 0
                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                           a1,
                                           qword_180117D90,
                                           0) != 0 )
                                    {
                                      v33 = sub_1800023C0(a1);
                                      if ( v33 != 0 )
                                      {
                                        qword_180117D90 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                            a1,
                                                            v33);
                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v33);
                                      }
                                    }
                                    sub_1800C6900(&unk_180117B80);
                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                    {
LABEL_830:
                                      if ( qword_180117F98 != 0
                                        || (qword_180117F98 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                a1,
                                                                qword_180117D90,
                                                                /*0x30c*/ "fromMethodDescriptorString",
                                                                /*0x327*/ "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/invoke/MethodType;"),
                                            (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                                      {
                                        v112 = v129;
                                        v125 = sub_180002760(a1);
                                        sub_1800036C0((__int64)&v134, (float *)v130, &v125, &v125);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                        {
                                          v119 = v125;
                                          v125 = v32;
                                          LODWORD(v129) = 3;
                                          if ( qword_180117D78 != 0
                                            && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                 a1,
                                                 qword_180117D78,
                                                 0) == 0 )
                                          {
                                            goto LABEL_275;
                                          }
                                          sub_1800C68B0(&unk_180117B68);
                                          if ( qword_180117D78 == 0
                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                 a1,
                                                 qword_180117D78,
                                                 0) != 0 )
                                          {
                                            v37 = sub_1800023C0(a1);
                                            if ( v37 != 0 )
                                            {
                                              qword_180117D78 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                  a1,
                                                                  v37);
                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                a1,
                                                v37);
                                            }
                                          }
                                          sub_1800C6900(&unk_180117B68);
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                          {
LABEL_275:
                                            if ( (int)v129 < 0 )
                                            {
                                              sub_180002110(a1, /*0x2ce*/ "java/lang/NegativeArraySizeException", /*0x2f3*/ "ANEWARRAY array size < 0", 215);
                                            }
                                            else
                                            {
                                              v129 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, _QWORD, __int64, __int64))(*(_QWORD *)a1 + 1376LL))(
                                                       a1,
                                                       (unsigned int)v129,
                                                       qword_180117D78,
                                                       0,
                                                       v112,
                                                       v116);
                                              sub_1800036C0((__int64)&v134, (float *)v130, &v129, &v129);
                                            }
                                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                            {
                                              v39 = v129;
                                              v128 = qword_180117938;
                                              if ( qword_180117D90 != 0
                                                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_180117D90,
                                                     0) == 0 )
                                              {
                                                goto LABEL_827;
                                              }
                                              sub_1800C68B0(&unk_180117B80);
                                              if ( qword_180117D90 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_180117D90,
                                                     0) != 0 )
                                              {
                                                v40 = sub_1800023C0(a1);
                                                if ( v40 != 0 )
                                                {
                                                  qword_180117D90 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                      a1,
                                                                      v40);
                                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                    a1,
                                                    v40);
                                                }
                                              }
                                              sub_1800C6900(&unk_180117B80);
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                              {
LABEL_827:
                                                if ( qword_180117F98 != 0
                                                  || (qword_180117F98 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                          a1,
                                                                          qword_180117D90,
                                                                          /*0x30c*/ "fromMethodDescriptorString",
                                                                          /*0x327*/ "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/invoke/MethodType;"),
                                                      (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                                                {
                                                  v128 = sub_180002760(a1);
                                                  sub_1800036C0((__int64)&v134, (float *)v130, &v128, &v128);
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                  {
                                                    if ( v39 != 0 )
                                                      (*(void (__fastcall **)(__int64, __int64, _QWORD, __int64, __int64))(*(_QWORD *)a1 + 1392LL))(
                                                        a1,
                                                        v39,
                                                        0,
                                                        v128,
                                                        v6);
                                                    else
                                                      sub_180002110(
                                                        a1,
                                                        /*0x6d*/ "java/lang/NullPointerException",
                                                        /*0xad6*/ "AASTORE npe",
                                                        215);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                    {
                                                      v61 = v129;
                                                      if ( v25 != 0
                                                        || (v25 = sub_180002610(a1, v7),
                                                            (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                                                      {
                                                        v128 = v25;
                                                        if ( qword_180117D80 != 0
                                                          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                               a1,
                                                               qword_180117D80,
                                                               0) == 0 )
                                                        {
                                                          goto LABEL_464;
                                                        }
                                                        sub_1800C68B0(&unk_180117B70);
                                                        if ( qword_180117D80 == 0
                                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                               a1,
                                                               qword_180117D80,
                                                               0) != 0 )
                                                        {
                                                          v62 = sub_1800023C0(a1);
                                                          if ( v62 != 0 )
                                                          {
                                                            qword_180117D80 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                a1,
                                                                                v62);
                                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                              a1,
                                                              v62);
                                                          }
                                                        }
                                                        sub_1800C6900(&unk_180117B70);
                                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                        {
LABEL_464:
                                                          v117 = qword_180117938;
                                                          if ( qword_180117D90 != 0
                                                            && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                 a1,
                                                                 qword_180117D90,
                                                                 0) == 0 )
                                                          {
                                                            goto LABEL_828;
                                                          }
                                                          sub_1800C68B0(&unk_180117B80);
                                                          if ( qword_180117D90 == 0
                                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                 a1,
                                                                 qword_180117D90,
                                                                 0) != 0 )
                                                          {
                                                            v66 = sub_1800023C0(a1);
                                                            if ( v66 != 0 )
                                                            {
                                                              qword_180117D90 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                  a1,
                                                                                  v66);
                                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                a1,
                                                                v66);
                                                            }
                                                          }
                                                          sub_1800C6900(&unk_180117B80);
                                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                          {
LABEL_828:
                                                            if ( qword_180117F98 != 0
                                                              || (qword_180117F98 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                                      a1,
                                                                                      qword_180117D90,
                                                                                      /*0x30c*/ "fromMethodDescriptorString",
                                                                                      /*0x327*/ "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/invoke/MethodType;"),
                                                                  (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                                                            {
                                                              v117 = sub_180002760(a1);
                                                              sub_1800036C0((__int64)&v134, (float *)v130, &v117, &v117);
                                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                goto LABEL_709;
                                                              if ( qword_180117D98 == 0
                                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                     a1,
                                                                     qword_180117D98,
                                                                     0) != 0 )
                                                              {
                                                                sub_1800C68B0(&unk_180117B88);
                                                                if ( qword_180117D98 == 0
                                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                       a1,
                                                                       qword_180117D98,
                                                                       0) != 0 )
                                                                {
                                                                  v69 = sub_1800023C0(a1);
                                                                  if ( v69 != 0 )
                                                                  {
                                                                    qword_180117D98 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                        a1,
                                                                                        v69);
                                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                      a1,
                                                                      v69);
                                                                  }
                                                                }
                                                                sub_1800C6900(&unk_180117B88);
                                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                  goto LABEL_709;
                                                              }
                                                              if ( qword_180117FA8 == 0 )
                                                              {
                                                                qword_180117FA8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                                    a1,
                                                                                    qword_180117D98,
                                                                                    /*0x2873*/ "findVirtual",
                                                                                    /*0x37b*/ "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;",
                                                                                    v6);
                                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                  goto LABEL_709;
                                                              }
                                                              if ( v128 != 0 )
                                                              {
                                                                v128 = sub_180002790(a1);
                                                                sub_1800036C0(
                                                                  (__int64)&v134,
                                                                  (float *)v130,
                                                                  &v128,
                                                                  &v128);
                                                              }
                                                              else
                                                              {
                                                                sub_180002110(
                                                                  a1,
                                                                  /*0x6d*/ "java/lang/NullPointerException",
                                                                  /*0x8c*/ "INVOKEVIRTUAL Object npe",
                                                                  215);
                                                              }
                                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                goto LABEL_709;
                                                              if ( v61 != 0 )
                                                                (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1392LL))(
                                                                  a1,
                                                                  v61,
                                                                  1,
                                                                  v128);
                                                              else
                                                                sub_180002110(
                                                                  a1,
                                                                  /*0x6d*/ "java/lang/NullPointerException",
                                                                  /*0xad6*/ "AASTORE npe",
                                                                  215);
                                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                goto LABEL_709;
                                                              v71 = v129;
                                                              v128 = qword_180117938;
                                                              if ( qword_180117D90 == 0
                                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                     a1,
                                                                     qword_180117D90,
                                                                     0) != 0 )
                                                              {
                                                                sub_1800C68B0(&unk_180117B80);
                                                                if ( qword_180117D90 == 0
                                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                       a1,
                                                                       qword_180117D90,
                                                                       0) != 0 )
                                                                {
                                                                  v72 = sub_1800023C0(a1);
                                                                  if ( v72 != 0 )
                                                                  {
                                                                    qword_180117D90 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                        a1,
                                                                                        v72);
                                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                      a1,
                                                                      v72);
                                                                  }
                                                                }
                                                                sub_1800C6900(&unk_180117B80);
                                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                  goto LABEL_709;
                                                              }
                                                              if ( qword_180117F98 == 0 )
                                                              {
                                                                qword_180117F98 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                                    a1,
                                                                                    qword_180117D90,
                                                                                    /*0x30c*/ "fromMethodDescriptorString",
                                                                                    /*0x327*/ "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/invoke/MethodType;");
                                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                  goto LABEL_709;
                                                              }
                                                              v128 = sub_180002760(a1);
                                                              sub_1800036C0((__int64)&v134, (float *)v130, &v128, &v128);
                                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                goto LABEL_709;
                                                              if ( v71 != 0 )
                                                                (*(void (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1392LL))(
                                                                  a1,
                                                                  v71,
                                                                  2,
                                                                  v128,
                                                                  v6);
                                                              else
                                                                sub_180002110(
                                                                  a1,
                                                                  /*0x6d*/ "java/lang/NullPointerException",
                                                                  /*0xad6*/ "AASTORE npe",
                                                                  215);
                                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                goto LABEL_709;
                                                              if ( qword_180117D78 == 0
                                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                     a1,
                                                                     qword_180117D78,
                                                                     0) != 0 )
                                                              {
                                                                sub_1800C68B0(&unk_180117B68);
                                                                if ( qword_180117D78 == 0
                                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                       a1,
                                                                       qword_180117D78,
                                                                       0) != 0 )
                                                                {
                                                                  v77 = sub_1800023C0(a1);
                                                                  if ( v77 != 0 )
                                                                  {
                                                                    qword_180117D78 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                        a1,
                                                                                        v77);
                                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                      a1,
                                                                      v77);
                                                                  }
                                                                }
                                                                sub_1800C6900(&unk_180117B68);
                                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                {
LABEL_709:
                                                                  v93 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                                                  (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                                                  v139[0] = v93;
                                                                  v137[0] = v93;
                                                                  sub_180026960(&v134, v130, v137, v137);
LABEL_335:
                                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                                         a1,
                                                                         v139[0],
                                                                         qword_180117D38) != 0 )
                                                                  {
                                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                      return sub_180003630(v130);
                                                                    sub_180026DB0(v130, v139);
                                                                    sub_180026DB0(v130, &v127);
                                                                    sub_180002660(a1, v130);
                                                                    v133 = v139[0];
                                                                    if ( qword_180117DB0 == 0
                                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                           a1,
                                                                           qword_180117DB0,
                                                                           0) != 0 )
                                                                    {
                                                                      sub_1800C68B0(&unk_180117BA0);
                                                                      if ( qword_180117DB0 == 0
                                                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                             a1,
                                                                             qword_180117DB0,
                                                                             0) != 0 )
                                                                      {
                                                                        v46 = sub_1800023C0(a1);
                                                                        if ( v46 != 0 )
                                                                        {
                                                                          qword_180117DB0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                              a1,
                                                                                              v46);
                                                                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                            a1,
                                                                            v46);
                                                                        }
                                                                      }
                                                                      sub_1800C6900(&unk_180117BA0);
                                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                        return sub_180003630(v130);
                                                                    }
                                                                    if ( v133 != 0 )
                                                                    {
                                                                      v47 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                                              a1,
                                                                              v133,
                                                                              qword_180117DB0);
                                                                      LODWORD(v133) = v47;
                                                                      if ( v47 != 0 )
                                                                        goto LABEL_346;
                                                                    }
                                                                    else
                                                                    {
                                                                      LODWORD(v133) = 0;
                                                                    }
                                                                    if ( qword_180117DB0 == 0
                                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                           a1,
                                                                           qword_180117DB0,
                                                                           0) != 0 )
                                                                    {
                                                                      sub_1800C68B0(&unk_180117BA0);
                                                                      if ( qword_180117DB0 == 0
                                                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                             a1,
                                                                             qword_180117DB0,
                                                                             0) != 0 )
                                                                      {
                                                                        v49 = sub_1800023C0(a1);
                                                                        if ( v49 != 0 )
                                                                        {
                                                                          qword_180117DB0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                              a1,
                                                                                              v49);
                                                                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                            a1,
                                                                            v49);
                                                                        }
                                                                      }
                                                                      sub_1800C6900(&unk_180117BA0);
                                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                        return sub_180003630(v130);
                                                                    }
                                                                    v50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 216LL))(
                                                                            a1,
                                                                            qword_180117DB0);
                                                                    v137[0] = v50;
                                                                    if ( v50 != 0 )
                                                                    {
                                                                      v133 = v50;
                                                                      sub_1800036C0(
                                                                        (__int64)&v134,
                                                                        (float *)v130,
                                                                        v137,
                                                                        v137);
                                                                    }
                                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                      return sub_180003630(v130);
                                                                    v126 = v133;
                                                                    v132 = v139[0];
                                                                    v139[0] = v133;
                                                                    if ( qword_180117DB0 == 0
                                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                           a1,
                                                                           qword_180117DB0,
                                                                           0) != 0 )
                                                                    {
                                                                      sub_1800C68B0(&unk_180117BA0);
                                                                      if ( qword_180117DB0 == 0
                                                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                             a1,
                                                                             qword_180117DB0,
                                                                             0) != 0 )
                                                                      {
                                                                        v51 = sub_1800023C0(a1);
                                                                        if ( v51 != 0 )
                                                                        {
                                                                          qword_180117DB0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                              a1,
                                                                                              v51);
                                                                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                            a1,
                                                                            v51);
                                                                        }
                                                                      }
                                                                      sub_1800C6900(&unk_180117BA0);
                                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                        return sub_180003630(v130);
                                                                    }
                                                                    if ( qword_180117FB8 == 0 )
                                                                    {
                                                                      qword_180117FB8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                                          a1,
                                                                                          qword_180117DB0,
                                                                                          /*0x48b*/ "<init>",
                                                                                          /*0x492*/ "(Ljava/lang/Throwable;)V");
                                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                        return sub_180003630(v130);
                                                                    }
                                                                    if ( v133 != 0 )
                                                                      sub_180026870(
                                                                        a1,
                                                                        v133,
                                                                        qword_180117DB0,
                                                                        qword_180117FB8,
                                                                        v132);
                                                                    else
                                                                      sub_180002110(
                                                                        a1,
                                                                        /*0x6d*/ "java/lang/NullPointerException",
                                                                        /*0x4ab*/ "INVOKESPECIAL Void npe",
                                                                        215);
                                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                      return sub_180003630(v130);
LABEL_346:
                                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                      return sub_180003630(v130);
                                                                    sub_180026DB0(v130, v139);
                                                                    sub_180026DB0(v130, &v127);
                                                                    sub_180002660(a1, v130);
                                                                    v48 = v139[0];
                                                                    if ( v139[0] != 0 )
                                                                    {
                                                                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(
                                                                        a1,
                                                                        v139[0]);
                                                                      v137[0] = v48;
                                                                      sub_180026960(&v134, v130, v137, v137);
                                                                    }
                                                                    else
                                                                    {
                                                                      sub_180002110(
                                                                        a1,
                                                                        /*0x6d*/ "java/lang/NullPointerException",
                                                                        /*0x29a*/ "ATHROW npe",
                                                                        215);
                                                                    }
                                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                      return sub_180003630(v130);
LABEL_372:
                                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                      return sub_180003630(v130);
                                                                    sub_180026DB0(v130, v139);
                                                                    sub_180026DB0(v130, &v133);
                                                                    sub_180026DB0(v130, &v132);
                                                                    sub_180026DB0(v130, &v127);
                                                                    sub_180002660(a1, v130);
                                                                    if ( qword_180117DB8 == 0
                                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                           a1,
                                                                           qword_180117DB8,
                                                                           0) != 0 )
                                                                    {
                                                                      sub_1800C68B0(&unk_180117BA8);
                                                                      if ( qword_180117DB8 == 0
                                                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                             a1,
                                                                             qword_180117DB8,
                                                                             0) != 0 )
                                                                      {
                                                                        v52 = sub_1800023C0(a1);
                                                                        if ( v52 != 0 )
                                                                        {
                                                                          qword_180117DB8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                              a1,
                                                                                              v52);
                                                                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                            a1,
                                                                            v52);
                                                                        }
                                                                      }
                                                                      sub_1800C6900(&unk_180117BA8);
                                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                        return sub_180003630(v130);
                                                                    }
                                                                    if ( qword_180117FC0 == 0 )
                                                                    {
                                                                      qword_180117FC0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                                          a1,
                                                                                          qword_180117DB8,
                                                                                          /*0x287f*/ "invokereverse3",
                                                                                          /*0x288e*/ "(Ljava/lang/Object;Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;");
                                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                        return sub_180003630(v130);
                                                                    }
                                                                    v113 = v132;
                                                                    v133 = sub_180002760(a1);
                                                                    sub_1800036C0(
                                                                      (__int64)&v134,
                                                                      (float *)v130,
                                                                      &v133,
                                                                      &v133);
                                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                      return sub_180003630(v130);
                                                                    if ( qword_180117DC0 == 0
                                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                           a1,
                                                                           qword_180117DC0,
                                                                           0) != 0 )
                                                                    {
                                                                      sub_1800C68B0(&unk_180117BB0);
                                                                      if ( qword_180117DC0 == 0
                                                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                             a1,
                                                                             qword_180117DC0,
                                                                             0) != 0 )
                                                                      {
                                                                        v53 = sub_1800023C0(a1);
                                                                        if ( v53 != 0 )
                                                                        {
                                                                          qword_180117DC0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                              a1,
                                                                                              v53);
                                                                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                            a1,
                                                                            v53);
                                                                        }
                                                                      }
                                                                      sub_1800C6900(&unk_180117BB0);
                                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                        return sub_180003630(v130);
                                                                    }
                                                                    if ( v133 == 0
                                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                                           a1,
                                                                           v133,
                                                                           qword_180117DC0) != 0 )
                                                                    {
LABEL_391:
                                                                      LODWORD(v132) = 30413;
                                                                      v124 = v10;
                                                                      if ( qword_180117D40 == 0
                                                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                             a1,
                                                                             qword_180117D40,
                                                                             0) != 0 )
                                                                      {
                                                                        sub_1800C68B0(&unk_180117B30);
                                                                        if ( qword_180117D40 == 0
                                                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                               a1,
                                                                               qword_180117D40,
                                                                               0) != 0 )
                                                                        {
                                                                          v54 = sub_1800023C0(a1);
                                                                          if ( v54 != 0 )
                                                                          {
                                                                            qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                                a1,
                                                                                                v54);
                                                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                              a1,
                                                                              v54);
                                                                          }
                                                                        }
                                                                        sub_1800C6900(&unk_180117B30);
                                                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                          return sub_180003630(v130);
                                                                      }
                                                                      v55 = qword_180118008;
                                                                      if ( qword_180118008 != 0 )
                                                                        goto LABEL_399;
                                                                      qword_180118008 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                                          a1,
                                                                                          qword_180117D40,
                                                                                          /*0xa5*/ "a",
                                                                                          /*0x2a47*/ "(IJ)J",
                                                                                          v113);
                                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                                      {
                                                                        v55 = qword_180118008;
LABEL_399:
                                                                        v132 = sub_1800BE2A0(
                                                                                 a1,
                                                                                 qword_180117D40,
                                                                                 v55,
                                                                                 (unsigned int)v132,
                                                                                 v10 ^ 0xDF172CF960E9FD5LL);
                                                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                                        {
                                                                          if ( qword_180117EF0 != 0
                                                                            && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                                 a1,
                                                                                 qword_180117EF0,
                                                                                 0) == 0 )
                                                                          {
                                                                            goto LABEL_831;
                                                                          }
                                                                          sub_1800C68B0(&unk_180117CE0);
                                                                          if ( qword_180117EF0 == 0
                                                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                                 a1,
                                                                                 qword_180117EF0,
                                                                                 0) != 0 )
                                                                          {
                                                                            v56 = sub_1800023C0(a1);
                                                                            if ( v56 != 0 )
                                                                            {
                                                                              qword_180117EF0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                                  a1,
                                                                                                  v56);
                                                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                                a1,
                                                                                v56);
                                                                            }
                                                                          }
                                                                          sub_1800C6900(&unk_180117CE0);
                                                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                                          {
LABEL_831:
                                                                            if ( qword_180118390 != 0
                                                                              || (qword_180118390 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL /*GetMethodID*/))(a1, qword_180117EF0, /*0x2fbc*/ "SECONDS", /*0x2fc4*/ "Ljava/util/concurrent/TimeUnit;"),
                                                                                  (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                                                                            {
                                                                              v126 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1160LL /*GetObjectClass/AllocObject*/))(
                                                                                       a1,
                                                                                       qword_180117EF0);
                                                                              sub_1800036C0(
                                                                                (__int64)&v134,
                                                                                (float *)v130,
                                                                                &v126,
                                                                                &v126);
                                                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                                              {
                                                                                if ( qword_180117EF8 != 0
                                                                                  && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                                       a1,
                                                                                       qword_180117EF8,
                                                                                       0) == 0 )
                                                                                {
                                                                                  goto LABEL_832;
                                                                                }
                                                                                sub_1800C68B0(&unk_180117CE8);
                                                                                if ( qword_180117EF8 == 0
                                                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                                       a1,
                                                                                       qword_180117EF8,
                                                                                       0) != 0 )
                                                                                {
                                                                                  v57 = sub_1800023C0(a1);
                                                                                  if ( v57 != 0 )
                                                                                  {
                                                                                    qword_180117EF8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v57);
                                                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                                      a1,
                                                                                      v57);
                                                                                  }
                                                                                }
                                                                                sub_1800C6900(&unk_180117CE8);
                                                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                                                {
LABEL_832:
                                                                                  if ( qword_180118208 != 0
                                                                                    || (qword_180118208 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(a1, qword_180117EF8, /*0x2fe4*/ "schedule", /*0x2fed*/ "(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;"),
                                                                                        (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                                                                                  {
                                                                                    if ( v139[0] != 0 )
                                                                                    {
                                                                                      v139[0] = sub_180002790(a1);
                                                                                      sub_1800036C0(
                                                                                        (__int64)&v134,
                                                                                        (float *)v130,
                                                                                        v139,
                                                                                        v139);
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                      sub_180002110(
                                                                                        a1,
                                                                                        /*0x6d*/ "java/lang/NullPointerException",
                                                                                        /*0x452*/ "INVOKEINTERFACE Object npe",
                                                                                        215);
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
                                                                      return sub_180003630(v130);
                                                                    }
                                                                    v58 = qword_1801178A0;
                                                                    sub_1800267D0(v137, /*0x3fa*/ "cannot cast to ");
                                                                    sub_1800267D0(v122, /*0x28d4*/ "java/lang/Runnable");
                                                                    sub_180026770(&v134, v137, v122);
                                                                    v59 = v58 + 989;
                                                                    if ( (v134 & 1) != 0 )
                                                                      v60 = v136;
                                                                    else
                                                                      v60 = v135;
                                                                    sub_180002110(a1, v59, v60, 215);
                                                                    if ( (v134 & 1) != 0 )
                                                                    {
                                                                      sub_1800C0DC0(v136);
                                                                      if ( (v122[0] & 1) == 0 )
                                                                      {
LABEL_433:
                                                                        if ( (v137[0] & 1) == 0 )
                                                                          goto LABEL_435;
                                                                        goto LABEL_434;
                                                                      }
                                                                    }
                                                                    else if ( (v122[0] & 1) == 0 )
                                                                    {
                                                                      goto LABEL_433;
                                                                    }
                                                                    sub_1800C0DC0(v123);
                                                                    if ( (v137[0] & 1) == 0 )
                                                                    {
LABEL_435:
                                                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                        return sub_180003630(v130);
                                                                      goto LABEL_391;
                                                                    }
LABEL_434:
                                                                    sub_1800C0DC0(v138);
                                                                    goto LABEL_435;
                                                                  }
LABEL_816:
                                                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(
                                                                    a1,
                                                                    v139[0]);
                                                                  return sub_180003630(v130);
                                                                }
                                                              }
                                                              if ( v129 == 0
                                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                                     a1,
                                                                     v129,
                                                                     qword_180117D78) != 0 )
                                                              {
LABEL_612:
                                                                v81 = v129;
                                                                v129 = v125;
                                                                v125 = v81;
                                                                sub_180001510(a1, v118, v126, v124, v119, v81, v129);
                                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                  goto LABEL_709;
                                                                if ( v132 != 0 )
                                                                {
                                                                  v132 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1384LL))(
                                                                           a1,
                                                                           v132,
                                                                           0);
                                                                  sub_1800036C0(
                                                                    (__int64)&v134,
                                                                    (float *)v130,
                                                                    &v132,
                                                                    &v132);
                                                                }
                                                                else
                                                                {
                                                                  sub_180002110(
                                                                    a1,
                                                                    /*0x6d*/ "java/lang/NullPointerException",
                                                                    /*0x41b*/ "AALOAD npe",
                                                                    215);
                                                                }
                                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                  goto LABEL_709;
                                                                v83 = v132;
                                                                if ( qword_180117DA0 == 0
                                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                       a1,
                                                                       qword_180117DA0,
                                                                       0) != 0 )
                                                                {
                                                                  sub_1800C68B0(&unk_180117B90);
                                                                  if ( qword_180117DA0 == 0
                                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                         a1,
                                                                         qword_180117DA0,
                                                                         0) != 0 )
                                                                  {
                                                                    v84 = sub_1800023C0(a1);
                                                                    if ( v84 != 0 )
                                                                    {
                                                                      qword_180117DA0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                          a1,
                                                                                          v84);
                                                                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                        a1,
                                                                        v84);
                                                                    }
                                                                  }
                                                                  sub_1800C6900(&unk_180117B90);
                                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                    goto LABEL_709;
                                                                }
                                                                if ( v83 != 0
                                                                  && (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                                       a1,
                                                                       v83,
                                                                       qword_180117DA0) != 0 )
                                                                {
                                                                  if ( qword_180117DA0 == 0
                                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                         a1,
                                                                         qword_180117DA0,
                                                                         0) != 0 )
                                                                  {
                                                                    sub_1800C68B0(&unk_180117B90);
                                                                    if ( qword_180117DA0 == 0
                                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                           a1,
                                                                           qword_180117DA0,
                                                                           0) != 0 )
                                                                    {
                                                                      v86 = sub_1800023C0(a1);
                                                                      if ( v86 != 0 )
                                                                      {
                                                                        qword_180117DA0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                            a1,
                                                                                            v86);
                                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                          a1,
                                                                          v86);
                                                                      }
                                                                    }
                                                                    sub_1800C6900(&unk_180117B90);
                                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                      goto LABEL_709;
                                                                  }
                                                                  if ( qword_180117FB0 == 0 )
                                                                  {
                                                                    qword_180117FB0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                                        a1,
                                                                                        qword_180117DA0,
                                                                                        /*0x426*/ "getTarget",
                                                                                        /*0x430*/ "()Ljava/lang/invoke/MethodHandle;");
                                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                      goto LABEL_709;
                                                                  }
                                                                  if ( v132 != 0 )
                                                                  {
                                                                    v132 = sub_180002790(a1);
                                                                    sub_1800036C0(
                                                                      (__int64)&v134,
                                                                      (float *)v130,
                                                                      &v132,
                                                                      &v132);
                                                                  }
                                                                  else
                                                                  {
                                                                    sub_180002110(
                                                                      a1,
                                                                      /*0x6d*/ "java/lang/NullPointerException",
                                                                      /*0x452*/ "INVOKEINTERFACE Object npe",
                                                                      215);
                                                                  }
                                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                    goto LABEL_709;
                                                                }
                                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                  goto LABEL_709;
                                                                sub_180026DB0(v130, v139);
                                                                sub_180026DB0(v130, &v133);
                                                                sub_180026DB0(v130, &v132);
                                                                sub_180026DB0(v130, &v127);
                                                                sub_180002660(a1, v130);
                                                                if ( qword_180117DA8 == 0
                                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                       a1,
                                                                       qword_180117DA8,
                                                                       0) != 0 )
                                                                {
                                                                  sub_1800C68B0(&unk_180117B98);
                                                                  if ( qword_180117DA8 == 0
                                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                         a1,
                                                                         qword_180117DA8,
                                                                         0) != 0 )
                                                                  {
                                                                    v89 = sub_1800023C0(a1);
                                                                    if ( v89 != 0 )
                                                                    {
                                                                      qword_180117DA8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                          a1,
                                                                                          v89);
                                                                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                        a1,
                                                                        v89);
                                                                    }
                                                                  }
                                                                  sub_1800C6900(&unk_180117B98);
                                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                    goto LABEL_709;
                                                                }
                                                                if ( v132 == 0
                                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                                       a1,
                                                                       v132,
                                                                       qword_180117DA8) != 0 )
                                                                {
                                                                  goto LABEL_372;
                                                                }
                                                                v90 = qword_1801178A0;
                                                                sub_1800267D0(v137, /*0x3fa*/ "cannot cast to ");
                                                                sub_1800267D0(v122, /*0x46d*/ "java/lang/invoke/MethodHandle");
                                                                sub_180026770(&v134, v137, v122);
                                                                v91 = v90 + 989;
                                                                if ( (v134 & 1) != 0 )
                                                                  v92 = v136;
                                                                else
                                                                  v92 = v135;
                                                                sub_180002110(a1, v91, v92, 215);
                                                                if ( (v134 & 1) != 0 )
                                                                {
                                                                  sub_1800C0DC0(v136);
                                                                  if ( (v122[0] & 1) == 0 )
                                                                  {
LABEL_706:
                                                                    if ( (v137[0] & 1) == 0 )
                                                                      goto LABEL_708;
                                                                    goto LABEL_707;
                                                                  }
                                                                }
                                                                else if ( (v122[0] & 1) == 0 )
                                                                {
                                                                  goto LABEL_706;
                                                                }
                                                                sub_1800C0DC0(v123);
                                                                if ( (v137[0] & 1) == 0 )
                                                                {
LABEL_708:
                                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                                    goto LABEL_372;
                                                                  goto LABEL_709;
                                                                }
LABEL_707:
                                                                sub_1800C0DC0(v138);
                                                                goto LABEL_708;
                                                              }
                                                              v78 = qword_1801178A0;
                                                              sub_1800267D0(v137, /*0x3fa*/ "cannot cast to ");
                                                              sub_1800267D0(v122, /*0x40a*/ "java/lang/Object");
                                                              sub_180026770(&v134, v137, v122);
                                                              v79 = v78 + 989;
                                                              if ( (v134 & 1) != 0 )
                                                                v80 = v136;
                                                              else
                                                                v80 = v135;
                                                              sub_180002110(a1, v79, v80, 215);
                                                              if ( (v134 & 1) != 0 )
                                                              {
                                                                sub_1800C0DC0(v136);
                                                                if ( (v122[0] & 1) == 0 )
                                                                {
LABEL_603:
                                                                  if ( (v137[0] & 1) == 0 )
                                                                    goto LABEL_605;
                                                                  goto LABEL_604;
                                                                }
                                                              }
                                                              else if ( (v122[0] & 1) == 0 )
                                                              {
                                                                goto LABEL_603;
                                                              }
                                                              sub_1800C0DC0(v123);
                                                              if ( (v137[0] & 1) == 0 )
                                                              {
LABEL_605:
                                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                  goto LABEL_709;
                                                                goto LABEL_612;
                                                              }
LABEL_604:
                                                              sub_1800C0DC0(v138);
                                                              goto LABEL_605;
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
            v45 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
            (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
            v139[0] = v45;
            v137[0] = v45;
            sub_180026960(&v134, v130, v137, v137);
            goto LABEL_335;
          }
          if ( v14(a1) != 0 )
            return sub_180003630(v130);
          v139[0] = v127;
          sub_1800036C0((__int64)&v134, (float *)v130, v139, v139);
          LODWORD(v133) = 1;
          if ( qword_180117D40 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                 a1,
                 qword_180117D40,
                 0) != 0 )
          {
            sub_1800C68B0(&unk_180117B30);
            if ( qword_180117D40 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                   a1,
                   qword_180117D40,
                   0) != 0 )
            {
              v16 = sub_1800023C0(a1);
              if ( v16 != 0 )
              {
                qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v16);
                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v16);
              }
            }
            sub_1800C6900(&unk_180117B30);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
              return sub_180003630(v130);
          }
          if ( qword_180118360 == 0 )
          {
            qword_180118360 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 752LL))(
                                a1,
                                qword_180117D40,
                                /*0x2efb*/ "avg",
                                /*0x1e9*/ "Z");
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
              return sub_180003630(v130);
          }
          if ( v139[0] != 0 )
            (*(void (__fastcall **)(__int64, __int64, __int64, _QWORD))(*(_QWORD *)a1 + 840LL))(
              a1,
              v139[0],
              qword_180118360,
              (unsigned __int8)v133);
          else
            sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x508*/ "PUTFIELD Boolean npe", 295);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0
            || (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
          {
            return sub_180003630(v130);
          }
          if ( qword_180117D50 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                 a1,
                 qword_180117D50,
                 0) != 0 )
          {
            sub_1800C68B0(&unk_180117B40);
            if ( qword_180117D50 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                   a1,
                   qword_180117D50,
                   0) != 0 )
            {
              v17 = sub_1800023C0(a1);
              if ( v17 != 0 )
              {
                qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v17);
                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v17);
              }
            }
            sub_1800C6900(&unk_180117B40);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
              return sub_180003630(v130);
          }
          if ( qword_180118308 == 0 )
          {
            qword_180118308 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL /*GetMethodID*/))(
                                a1,
                                qword_180117D50,
                                /*0x2917*/ "ecj",
                                /*0x291b*/ "Lorg/slf4j/Logger;");
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
              return sub_180003630(v130);
          }
          v139[0] = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1160LL /*GetObjectClass/AllocObject*/))(a1, qword_180117D50);
          sub_1800036C0((__int64)&v134, (float *)v130, v139, v139);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
            return sub_180003630(v130);
          if ( qword_180117D40 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                 a1,
                 qword_180117D40,
                 0) != 0 )
          {
            sub_1800C68B0(&unk_180117B30);
            if ( qword_180117D40 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                   a1,
                   qword_180117D40,
                   0) != 0 )
            {
              v18 = sub_1800023C0(a1);
              if ( v18 != 0 )
              {
                qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v18);
                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v18);
              }
            }
            sub_1800C6900(&unk_180117B30);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
              return sub_180003630(v130);
          }
          if ( qword_180118300 == 0 )
          {
            qword_180118300 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL /*GetMethodID*/))(
                                a1,
                                qword_180117D40,
                                /*0xa5*/ "a",
                                /*0xa3e*/ "[Ljava/lang/String;");
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
              return sub_180003630(v130);
          }
          v133 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1160LL /*GetObjectClass/AllocObject*/))(a1, qword_180117D40);
          sub_1800036C0((__int64)&v134, (float *)v130, &v133, &v133);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
            return sub_180003630(v130);
          v121 = v133;
          sub_1800036C0((__int64)&v134, (float *)v130, &v133, &v133);
          v133 = v121;
          sub_1800036C0((__int64)&v134, (float *)v130, &v133, &v133);
          LODWORD(v132) = 23;
          if ( v133 != 0 )
          {
            v133 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 1384LL))(a1, v133, 23);
            sub_1800036C0((__int64)&v134, (float *)v130, &v133, &v133);
          }
          else
          {
            sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x41b*/ "AALOAD npe", 76);
          }
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
            return sub_180003630(v130);
          if ( qword_180117DC8 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                 a1,
                 qword_180117DC8,
                 0) != 0 )
          {
            sub_1800C68B0(&unk_180117BB8);
            if ( qword_180117DC8 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                   a1,
                   qword_180117DC8,
                   0) != 0 )
            {
              v21 = sub_1800023C0(a1);
              if ( v21 != 0 )
              {
                qword_180117DC8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v21);
                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v21);
              }
            }
            sub_1800C6900(&unk_180117BB8);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
              return sub_180003630(v130);
          }
          if ( qword_180117FD8 == 0 )
          {
            qword_180117FD8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                a1,
                                qword_180117DC8,
                                /*0x292e*/ "error",
                                /*0x2934*/ "(Ljava/lang/String;)V");
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
              return sub_180003630(v130);
          }
          if ( v139[0] != 0 )
            sub_1800027F0(a1, v139[0], qword_180117FD8, v133);
          else
            sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x294a*/ "INVOKEINTERFACE Void npe", 76);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
            return sub_180003630(v130);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
          {
            if ( qword_180117DD0 != 0
              && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                   a1,
                   qword_180117DD0,
                   0) == 0 )
            {
              goto LABEL_187;
            }
            sub_1800C68B0(&unk_180117BC0);
            if ( qword_180117DD0 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                   a1,
                   qword_180117DD0,
                   0) != 0 )
            {
              v26 = sub_1800023C0(a1);
              if ( v26 != 0 )
              {
                qword_180117DD0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v26);
                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v26);
              }
            }
            sub_1800C6900(&unk_180117BC0);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
            {
LABEL_187:
              v139[0] = qword_180117DD0;
              v133 = v121;
              sub_1800036C0((__int64)&v134, (float *)v130, &v133, &v133);
              LODWORD(v132) = 5;
              if ( v133 != 0 )
              {
                v133 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 1384LL))(a1, v133, 5);
                sub_1800036C0((__int64)&v134, (float *)v130, &v133, &v133);
              }
              else
              {
                sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x41b*/ "AALOAD npe", 10);
              }
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
              {
                if ( qword_180117DD8 != 0
                  && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                       a1,
                       qword_180117DD8,
                       0) == 0 )
                {
                  goto LABEL_833;
                }
                sub_1800C68B0(&unk_180117BC8);
                if ( qword_180117DD8 == 0
                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                       a1,
                       qword_180117DD8,
                       0) != 0 )
                {
                  v29 = sub_1800023C0(a1);
                  if ( v29 != 0 )
                  {
                    qword_180117DD8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v29);
                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v29);
                  }
                }
                sub_1800C6900(&unk_180117BC8);
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                {
LABEL_833:
                  if ( qword_180117FE0 != 0
                    || (qword_180117FE0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                            a1,
                                            qword_180117DD8,
                                            /*0x2963*/ "getDeclaredField",
                                            /*0x2974*/ "(Ljava/lang/String;)Ljava/lang/reflect/Field;"),
                        (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                  {
                    if ( v139[0] != 0 )
                    {
                      v139[0] = sub_180002790(a1);
                      sub_1800036C0((__int64)&v134, (float *)v130, v139, v139);
                    }
                    else
                    {
                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 10);
                    }
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                    {
                      v120 = v139[0];
                      sub_1800036C0((__int64)&v134, (float *)v130, v139, v139);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                      {
                        v139[0] = v120;
                        sub_1800036C0((__int64)&v134, (float *)v130, v139, v139);
                        LODWORD(v133) = 1;
                        if ( qword_180117DE0 != 0
                          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                               a1,
                               qword_180117DE0,
                               0) == 0 )
                        {
                          goto LABEL_834;
                        }
                        sub_1800C68B0(&unk_180117BD0);
                        if ( qword_180117DE0 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                               a1,
                               qword_180117DE0,
                               0) != 0 )
                        {
                          v31 = sub_1800023C0(a1);
                          if ( v31 != 0 )
                          {
                            qword_180117DE0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                a1,
                                                v31);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v31);
                          }
                        }
                        sub_1800C6900(&unk_180117BD0);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                        {
LABEL_834:
                          if ( qword_180117FE8 != 0
                            || (qword_180117FE8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                    a1,
                                                    qword_180117DE0,
                                                    /*0x29a2*/ "setAccessible",
                                                    /*0x29b0*/ "(Z)V"),
                                (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                          {
                            if ( v139[0] != 0 )
                              sub_1800027F0(a1, v139[0], qword_180117FE8, (unsigned int)v133);
                            else
                              sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x65b*/ "INVOKEVIRTUAL Void npe", 167);
                            v34 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                            v35 = *(_QWORD *)a1;
                            if ( v34 != 0 )
                            {
                              v36 = (*(__int64 (__fastcall **)(__int64))(v35 + 120))(a1);
                              (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                              v139[0] = v36;
                              v137[0] = v36;
                              sub_180026960(&v134, v130, v137, v137);
                              goto LABEL_785;
                            }
                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(v35 + 1824))(a1) == 0 )
                            {
                              v139[0] = v120;
                              sub_1800036C0((__int64)&v134, (float *)v130, v139, v139);
                              v133 = 0;
                              if ( qword_180117DE0 != 0
                                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                     a1,
                                     qword_180117DE0,
                                     0) == 0 )
                              {
                                goto LABEL_306;
                              }
                              sub_1800C68B0(&unk_180117BD0);
                              if ( qword_180117DE0 == 0
                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                     a1,
                                     qword_180117DE0,
                                     0) != 0 )
                              {
                                v38 = sub_1800023C0(a1);
                                if ( v38 != 0 )
                                {
                                  qword_180117DE0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                      a1,
                                                      v38);
                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v38);
                                }
                              }
                              sub_1800C6900(&unk_180117BD0);
                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                              {
LABEL_306:
                                if ( qword_180117FF0 != 0
                                  || (qword_180117FF0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                          a1,
                                                          qword_180117DE0,
                                                          /*0x29b5*/ "get",
                                                          /*0x29b9*/ "(Ljava/lang/Object;)Ljava/lang/Object;"),
                                      (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                                {
                                  if ( v139[0] != 0 )
                                  {
                                    v139[0] = sub_180002790(a1);
                                    sub_1800036C0((__int64)&v134, (float *)v130, v139, v139);
                                  }
                                  else
                                  {
                                    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 386);
                                  }
                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                  {
                                    if ( qword_180117DE8 != 0
                                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                           a1,
                                           qword_180117DE8,
                                           0) == 0 )
                                    {
                                      goto LABEL_316;
                                    }
                                    sub_1800C68B0(&unk_180117BD8);
                                    if ( qword_180117DE8 == 0
                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                           a1,
                                           qword_180117DE8,
                                           0) != 0 )
                                    {
                                      v41 = sub_1800023C0(a1);
                                      if ( v41 != 0 )
                                      {
                                        qword_180117DE8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                            a1,
                                                            v41);
                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v41);
                                      }
                                    }
                                    sub_1800C6900(&unk_180117BD8);
                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                    {
LABEL_316:
                                      if ( v139[0] == 0
                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                             a1,
                                             v139[0],
                                             qword_180117DE8) != 0 )
                                      {
                                        goto LABEL_317;
                                      }
                                      v63 = qword_1801178A0;
                                      sub_1800267D0(v137, /*0x3fa*/ "cannot cast to ");
                                      sub_1800267D0(v122, /*0x29e0*/ "sun/misc/Unsafe");
                                      sub_180026770(&v134, v137, v122);
                                      v64 = v63 + 989;
                                      if ( (v134 & 1) != 0 )
                                        v65 = v136;
                                      else
                                        v65 = v135;
                                      sub_180002110(a1, v64, v65, 386);
                                      if ( (v134 & 1) != 0 )
                                      {
                                        sub_1800C0DC0(v136);
                                        if ( (v122[0] & 1) == 0 )
                                        {
LABEL_474:
                                          if ( (v137[0] & 1) == 0 )
                                            goto LABEL_476;
                                          goto LABEL_475;
                                        }
                                      }
                                      else if ( (v122[0] & 1) == 0 )
                                      {
                                        goto LABEL_474;
                                      }
                                      sub_1800C0DC0(v123);
                                      if ( (v137[0] & 1) == 0 )
                                      {
LABEL_476:
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        {
LABEL_779:
                                          v103 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                          (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                          v139[0] = v103;
                                          v137[0] = v103;
                                          sub_180026960(&v134, v130, v137, v137);
                                          goto LABEL_785;
                                        }
LABEL_317:
                                        v43 = v139[0];
                                        sub_1800036C0((__int64)&v134, (float *)v130, v139, v139);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_779;
                                        if ( qword_180117DF0 == 0
                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                               a1,
                                               qword_180117DF0,
                                               0) != 0 )
                                        {
                                          sub_1800C68B0(&unk_180117BE0);
                                          if ( qword_180117DF0 == 0
                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                 a1,
                                                 qword_180117DF0,
                                                 0) != 0 )
                                          {
                                            v44 = sub_1800023C0(a1);
                                            if ( v44 != 0 )
                                            {
                                              qword_180117DF0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                  a1,
                                                                  v44);
                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                a1,
                                                v44);
                                            }
                                          }
                                          sub_1800C6900(&unk_180117BE0);
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_779;
                                        }
                                        if ( qword_180117FF8 == 0 )
                                        {
                                          qword_180117FF8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                              a1,
                                                              qword_180117DF0,
                                                              /*0x29f0*/ "current",
                                                              /*0x29f8*/ "()Ljava/util/concurrent/ThreadLocalRandom;");
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_779;
                                        }
                                        v139[0] = sub_180002760(a1);
                                        sub_1800036C0((__int64)&v134, (float *)v130, v139, v139);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_779;
                                        if ( qword_180117DF0 == 0
                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                               a1,
                                               qword_180117DF0,
                                               0) != 0 )
                                        {
                                          sub_1800C68B0(&unk_180117BE0);
                                          if ( qword_180117DF0 == 0
                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                 a1,
                                                 qword_180117DF0,
                                                 0) != 0 )
                                          {
                                            v68 = sub_1800023C0(a1);
                                            if ( v68 != 0 )
                                            {
                                              qword_180117DF0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                  a1,
                                                                  v68);
                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                a1,
                                                v68);
                                            }
                                          }
                                          sub_1800C6900(&unk_180117BE0);
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_779;
                                        }
                                        if ( qword_180118000 == 0 )
                                        {
                                          qword_180118000 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                              a1,
                                                              qword_180117DF0,
                                                              /*0x2a23*/ "nextLong",
                                                              /*0x2a2c*/ "()J");
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_779;
                                        }
                                        if ( v139[0] != 0 )
                                          v139[0] = sub_180003690(a1, v139[0], qword_180118000, v67);
                                        else
                                          sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x2a30*/ "INVOKEVIRTUAL Long npe", 24);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_779;
                                        v118 = v139[0];
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_779;
                                        if ( qword_180117DF0 == 0
                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                               a1,
                                               qword_180117DF0,
                                               0) != 0 )
                                        {
                                          sub_1800C68B0(&unk_180117BE0);
                                          if ( qword_180117DF0 == 0
                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                 a1,
                                                 qword_180117DF0,
                                                 0) != 0 )
                                          {
                                            v70 = sub_1800023C0(a1);
                                            if ( v70 != 0 )
                                            {
                                              qword_180117DF0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                  a1,
                                                                  v70);
                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                a1,
                                                v70);
                                            }
                                          }
                                          sub_1800C6900(&unk_180117BE0);
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_779;
                                        }
                                        if ( qword_180117FF8 == 0 )
                                        {
                                          qword_180117FF8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                              a1,
                                                              qword_180117DF0,
                                                              /*0x29f0*/ "current",
                                                              /*0x29f8*/ "()Ljava/util/concurrent/ThreadLocalRandom;");
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_779;
                                        }
                                        v139[0] = sub_180002760(a1);
                                        sub_1800036C0((__int64)&v134, (float *)v130, v139, v139);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_779;
                                        v133 = 1;
                                        v126 = v10 ^ 0x766D18DA0CBF55DDLL;
                                        if ( qword_180117D40 == 0
                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                               a1,
                                               qword_180117D40,
                                               0) != 0 )
                                        {
                                          sub_1800C68B0(&unk_180117B30);
                                          if ( qword_180117D40 == 0
                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                 a1,
                                                 qword_180117D40,
                                                 0) != 0 )
                                          {
                                            v73 = sub_1800023C0(a1);
                                            if ( v73 != 0 )
                                            {
                                              qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                  a1,
                                                                  v73);
                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                a1,
                                                v73);
                                            }
                                          }
                                          sub_1800C6900(&unk_180117B30);
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_779;
                                        }
                                        v74 = qword_180118008;
                                        if ( qword_180118008 == 0 )
                                        {
                                          qword_180118008 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                              a1,
                                                              qword_180117D40,
                                                              /*0xa5*/ "a",
                                                              /*0x2a47*/ "(IJ)J");
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_779;
                                          v74 = qword_180118008;
                                        }
                                        v75 = sub_1800BE2A0(a1, qword_180117D40, v74, 15559, v126);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_779;
                                        if ( qword_180117DF0 == 0
                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                               a1,
                                               qword_180117DF0,
                                               0) != 0 )
                                        {
                                          sub_1800C68B0(&unk_180117BE0);
                                          if ( qword_180117DF0 == 0
                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                 a1,
                                                 qword_180117DF0,
                                                 0) != 0 )
                                          {
                                            v76 = sub_1800023C0(a1);
                                            if ( v76 != 0 )
                                            {
                                              qword_180117DF0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                  a1,
                                                                  v76);
                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                a1,
                                                v76);
                                            }
                                          }
                                          sub_1800C6900(&unk_180117BE0);
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_779;
                                        }
                                        if ( qword_180118010 == 0 )
                                        {
                                          qword_180118010 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                              a1,
                                                              qword_180117DF0,
                                                              /*0x2a23*/ "nextLong",
                                                              /*0x2a4d*/ "(JJ)J");
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_779;
                                        }
                                        if ( v139[0] != 0 )
                                        {
                                          v114 = v75;
                                          v139[0] = sub_180003690(a1, v139[0], qword_180118010, v133);
                                        }
                                        else
                                        {
                                          sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x2a30*/ "INVOKEVIRTUAL Long npe", 266);
                                        }
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_779;
                                        v119 = v139[0];
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_779;
                                        if ( qword_180117DF0 == 0
                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                               a1,
                                               qword_180117DF0,
                                               0) != 0 )
                                        {
                                          sub_1800C68B0(&unk_180117BE0);
                                          if ( qword_180117DF0 == 0
                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                 a1,
                                                 qword_180117DF0,
                                                 0) != 0 )
                                          {
                                            v82 = sub_1800023C0(a1);
                                            if ( v82 != 0 )
                                            {
                                              qword_180117DF0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                  a1,
                                                                  v82);
                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                a1,
                                                v82);
                                            }
                                          }
                                          sub_1800C6900(&unk_180117BE0);
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_779;
                                        }
                                        if ( qword_180117FF8 == 0 )
                                        {
                                          qword_180117FF8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                              a1,
                                                              qword_180117DF0,
                                                              /*0x29f0*/ "current",
                                                              /*0x29f8*/ "()Ljava/util/concurrent/ThreadLocalRandom;",
                                                              v114);
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_779;
                                        }
                                        v139[0] = sub_180002760(a1);
                                        sub_1800036C0((__int64)&v134, (float *)v130, v139, v139);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_779;
                                        LODWORD(v133) = 1;
                                        LODWORD(v132) = 256;
                                        if ( qword_180117DF0 == 0
                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                               a1,
                                               qword_180117DF0,
                                               0) != 0 )
                                        {
                                          sub_1800C68B0(&unk_180117BE0);
                                          if ( qword_180117DF0 == 0
                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                 a1,
                                                 qword_180117DF0,
                                                 0) != 0 )
                                          {
                                            v85 = sub_1800023C0(a1);
                                            if ( v85 != 0 )
                                            {
                                              qword_180117DF0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                  a1,
                                                                  v85);
                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                a1,
                                                v85);
                                            }
                                          }
                                          sub_1800C6900(&unk_180117BE0);
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_779;
                                        }
                                        if ( qword_180118018 == 0 )
                                        {
                                          qword_180118018 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                              a1,
                                                              qword_180117DF0,
                                                              /*0x2a53*/ "nextInt",
                                                              /*0x2a5b*/ "(II)I");
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_779;
                                        }
                                        if ( v139[0] != 0 )
                                          LODWORD(v139[0]) = sub_180026900(
                                                               a1,
                                                               v139[0],
                                                               qword_180118018,
                                                               (unsigned int)v133);
                                        else
                                          sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x69a*/ "INVOKEVIRTUAL Int npe", 174);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_779;
                                        v87 = v139[0];
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_779;
                                        v139[0] = v43;
                                        sub_1800036C0((__int64)&v134, (float *)v130, v139, v139);
                                        if ( qword_180117D70 == 0
                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                               a1,
                                               qword_180117D70,
                                               0) != 0 )
                                        {
                                          sub_1800C68B0(&unk_180117B60);
                                          if ( qword_180117D70 == 0
                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                 a1,
                                                 qword_180117D70,
                                                 0) != 0 )
                                          {
                                            v88 = sub_1800023C0(a1);
                                            if ( v88 != 0 )
                                            {
                                              qword_180117D70 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                  a1,
                                                                  v88);
                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                a1,
                                                v88);
                                            }
                                          }
                                          sub_1800C6900(&unk_180117B60);
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_779;
                                        }
                                        if ( qword_180118020 == 0 )
                                        {
                                          qword_180118020 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                              a1,
                                                              qword_180117D70,
                                                              /*0x2a61*/ "currentThread",
                                                              /*0x2a6f*/ "()Ljava/lang/Thread;");
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_779;
                                        }
                                        v133 = sub_180002760(a1);
                                        sub_1800036C0((__int64)&v134, (float *)v130, &v133, &v133);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_779;
                                        LODWORD(v132) = 8382;
                                        v124 = v10;
                                        if ( qword_180117D40 == 0
                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                               a1,
                                               qword_180117D40,
                                               0) != 0 )
                                        {
                                          sub_1800C68B0(&unk_180117B30);
                                          if ( qword_180117D40 == 0
                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                 a1,
                                                 qword_180117D40,
                                                 0) != 0 )
                                          {
                                            v94 = sub_1800023C0(a1);
                                            if ( v94 != 0 )
                                            {
                                              qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                  a1,
                                                                  v94);
                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                a1,
                                                v94);
                                            }
                                          }
                                          sub_1800C6900(&unk_180117B30);
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_779;
                                        }
                                        v95 = qword_180118008;
                                        if ( qword_180118008 == 0 )
                                        {
                                          qword_180118008 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                              a1,
                                                              qword_180117D40,
                                                              /*0xa5*/ "a",
                                                              /*0x2a47*/ "(IJ)J");
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_779;
                                          v95 = qword_180118008;
                                        }
                                        v132 = sub_1800BE2A0(
                                                 a1,
                                                 qword_180117D40,
                                                 v95,
                                                 (unsigned int)v132,
                                                 v10 ^ 0x744B7CA4DF84C9A8LL);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_779;
                                        v126 = v118;
                                        if ( qword_180117DE8 == 0
                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                               a1,
                                               qword_180117DE8,
                                               0) != 0 )
                                        {
                                          sub_1800C68B0(&unk_180117BD8);
                                          if ( qword_180117DE8 == 0
                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                 a1,
                                                 qword_180117DE8,
                                                 0) != 0 )
                                          {
                                            v96 = sub_1800023C0(a1);
                                            if ( v96 != 0 )
                                            {
                                              qword_180117DE8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                  a1,
                                                                  v96);
                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                a1,
                                                v96);
                                            }
                                          }
                                          sub_1800C6900(&unk_180117BD8);
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_779;
                                        }
                                        if ( qword_180118028 == 0 )
                                        {
                                          qword_180118028 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                              a1,
                                                              qword_180117DE8,
                                                              /*0xd0f*/ "putLong",
                                                              /*0x2a84*/ "(Ljava/lang/Object;JJ)V");
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_779;
                                        }
                                        if ( v139[0] != 0 )
                                        {
                                          v116 = v126;
                                          v115 = v132;
                                          sub_1800027F0(a1, v139[0], qword_180118028, v133);
                                        }
                                        else
                                        {
                                          sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x65b*/ "INVOKEVIRTUAL Void npe", 216);
                                        }
                                        v97 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                        v98 = *(_QWORD *)a1;
                                        if ( v97 == 0 )
                                        {
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(v98 + 1824))(a1) != 0 )
                                            goto LABEL_779;
                                          v139[0] = v43;
                                          sub_1800036C0((__int64)&v134, (float *)v130, v139, v139);
                                          v133 = v119;
                                          if ( qword_180117DE8 == 0
                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                 a1,
                                                 qword_180117DE8,
                                                 0) != 0 )
                                          {
                                            sub_1800C68B0(&unk_180117BD8);
                                            if ( qword_180117DE8 == 0
                                              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                   a1,
                                                   qword_180117DE8,
                                                   0) != 0 )
                                            {
                                              v99 = sub_1800023C0(a1);
                                              if ( v99 != 0 )
                                              {
                                                qword_180117DE8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                    a1,
                                                                    v99);
                                                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                  a1,
                                                  v99);
                                              }
                                            }
                                            sub_1800C6900(&unk_180117BD8);
                                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                              goto LABEL_779;
                                          }
                                          if ( qword_180118030 == 0 )
                                          {
                                            qword_180118030 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                a1,
                                                                qword_180117DE8,
                                                                /*0x2a9c*/ "putAddress",
                                                                /*0x2aa7*/ "(JJ)V",
                                                                v115,
                                                                v116);
                                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                              goto LABEL_779;
                                          }
                                          if ( v139[0] != 0 )
                                            sub_1800027F0(a1, v139[0], qword_180118030, v133);
                                          else
                                            sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x65b*/ "INVOKEVIRTUAL Void npe", 149);
                                          v100 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                          v98 = *(_QWORD *)a1;
                                          if ( v100 == 0 )
                                          {
                                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(v98 + 1824))(a1) != 0 )
                                              goto LABEL_779;
                                            if ( qword_180117DF8 == 0
                                              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                   a1,
                                                   qword_180117DF8,
                                                   0) != 0 )
                                            {
                                              sub_1800C68B0(&unk_180117BE8);
                                              if ( qword_180117DF8 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_180117DF8,
                                                     0) != 0 )
                                              {
                                                v101 = sub_1800023C0(a1);
                                                if ( v101 != 0 )
                                                {
                                                  qword_180117DF8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                      a1,
                                                                      v101);
                                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                    a1,
                                                    v101);
                                                }
                                              }
                                              sub_1800C6900(&unk_180117BE8);
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_779;
                                            }
                                            if ( qword_180118038 == 0 )
                                            {
                                              qword_180118038 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                  a1,
                                                                  qword_180117DF8,
                                                                  /*0x2aad*/ "getRuntime",
                                                                  /*0x2ab8*/ "()Ljava/lang/Runtime;");
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_779;
                                            }
                                            v139[0] = sub_180002760(a1);
                                            sub_1800036C0((__int64)&v134, (float *)v130, v139, v139);
                                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                              goto LABEL_779;
                                            LODWORD(v133) = v87;
                                            if ( qword_180117DF8 == 0
                                              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                   a1,
                                                   qword_180117DF8,
                                                   0) != 0 )
                                            {
                                              sub_1800C68B0(&unk_180117BE8);
                                              if ( qword_180117DF8 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_180117DF8,
                                                     0) != 0 )
                                              {
                                                v102 = sub_1800023C0(a1);
                                                if ( v102 != 0 )
                                                {
                                                  qword_180117DF8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                      a1,
                                                                      v102);
                                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                    a1,
                                                    v102);
                                                }
                                              }
                                              sub_1800C6900(&unk_180117BE8);
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_779;
                                            }
                                            if ( qword_180118040 == 0 )
                                            {
                                              qword_180118040 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                  a1,
                                                                  qword_180117DF8,
                                                                  /*0x2ace*/ "halt",
                                                                  /*0x51d*/ "(I)V");
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                goto LABEL_779;
                                            }
                                            if ( v139[0] != 0 )
                                              sub_1800027F0(a1, v139[0], qword_180118040, (unsigned int)v133);
                                            else
                                              sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x65b*/ "INVOKEVIRTUAL Void npe", 4);
                                            v104 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                            v98 = *(_QWORD *)a1;
                                            if ( v104 == 0 )
                                            {
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(v98 + 1824))(a1) == 0 )
                                              {
LABEL_814:
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                {
                                                  sub_180026DB0(v130, &v127);
                                                  sub_180026DB0(v130, &v120);
                                                  sub_180026DB0(v130, &v121);
                                                  sub_180002660(a1, v130);
                                                }
                                              }
                                              return sub_180003630(v130);
                                            }
                                          }
                                        }
                                        v105 = (*(__int64 (__fastcall **)(__int64))(v98 + 120))(a1);
                                        (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                        v139[0] = v105;
                                        v137[0] = v105;
                                        sub_180026960(&v134, v130, v137, v137);
LABEL_785:
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                               a1,
                                               v139[0],
                                               qword_180117D38) != 0 )
                                        {
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            return sub_180003630(v130);
                                          sub_180026DB0(v130, v139);
                                          sub_180026DB0(v130, &v127);
                                          sub_180026DB0(v130, &v121);
                                          sub_180002660(a1, v130);
                                          v120 = v139[0];
                                          sub_1800036C0((__int64)&v134, (float *)v130, v139, v139);
                                          LODWORD(v139[0]) = 2680;
                                          v133 = v10 ^ 0x1CEB2C32F22E369LL;
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            return sub_180003630(v130);
                                          if ( qword_180117D40 == 0
                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                 a1,
                                                 qword_180117D40,
                                                 0) != 0 )
                                          {
                                            sub_1800C68B0(&unk_180117B30);
                                            if ( qword_180117D40 == 0
                                              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                   a1,
                                                   qword_180117D40,
                                                   0) != 0 )
                                            {
                                              v106 = sub_1800023C0(a1);
                                              if ( v106 != 0 )
                                              {
                                                qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                    a1,
                                                                    v106);
                                                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                  a1,
                                                  v106);
                                              }
                                            }
                                            sub_1800C6900(&unk_180117B30);
                                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                              return sub_180003630(v130);
                                          }
                                          v107 = qword_180118008;
                                          if ( qword_180118008 == 0 )
                                          {
                                            qword_180118008 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                a1,
                                                                qword_180117D40,
                                                                /*0xa5*/ "a",
                                                                /*0x2a47*/ "(IJ)J");
                                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                              return sub_180003630(v130);
                                            v107 = qword_180118008;
                                          }
                                          v139[0] = sub_1800BE2A0(a1, qword_180117D40, v107, LODWORD(v139[0]), v133);
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                          {
                                            v108 = v139[0];
                                            v118 = v10 ^ 0x766D18DA0CBF55DDLL;
                                            v119 = v139[0] - 1;
                                            while ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                            {
                                              sub_180026DB0(v130, &v127);
                                              sub_180026DB0(v130, &v120);
                                              sub_180026DB0(v130, &v121);
                                              sub_180002660(a1, v130);
                                              v139[0] = v108;
                                              LODWORD(v132) = 15559;
                                              v124 = v10;
                                              if ( qword_180117D40 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_180117D40,
                                                     0) != 0 )
                                              {
                                                sub_1800C68B0(&unk_180117B30);
                                                if ( qword_180117D40 == 0
                                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                       a1,
                                                       qword_180117D40,
                                                       0) != 0 )
                                                {
                                                  v109 = sub_1800023C0(a1);
                                                  if ( v109 != 0 )
                                                  {
                                                    qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                        a1,
                                                                        v109);
                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                      a1,
                                                      v109);
                                                  }
                                                }
                                                sub_1800C6900(&unk_180117B30);
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  break;
                                              }
                                              v110 = qword_180118008;
                                              if ( qword_180118008 == 0 )
                                              {
                                                qword_180118008 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                    a1,
                                                                    qword_180117D40,
                                                                    /*0xa5*/ "a",
                                                                    /*0x2a47*/ "(IJ)J");
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                  return sub_180003630(v130);
                                                v110 = qword_180118008;
                                              }
                                              v132 = sub_1800BE2A0(a1, qword_180117D40, v110, (unsigned int)v132, v118);
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                break;
                                              v111 = v139[0];
                                              LODWORD(v139[0]) = (char)((v139[0] > v132) - (v139[0] < v132));
                                              if ( v111 >= v132 )
                                                goto LABEL_814;
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                break;
                                              v132 = 1;
                                              v139[0] = v119;
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                break;
                                              v132 = 1;
                                              v139[0] = __PAIR64__(HIDWORD(v108), v12);
                                              if ( v12 != 0 )
                                                goto LABEL_814;
                                            }
                                          }
                                          return sub_180003630(v130);
                                        }
                                        goto LABEL_816;
                                      }
LABEL_475:
                                      sub_1800C0DC0(v138);
                                      goto LABEL_476;
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
          v42 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
          (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
          v139[0] = v42;
          v137[0] = v42;
          sub_180026960(&v134, v130, v137, v137);
          goto LABEL_785;
        }
      }
    }
  }
  return result;
}
