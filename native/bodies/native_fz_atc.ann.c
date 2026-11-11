__int64 __fastcall sub_1800313A0(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5)
{
  __int64 v9; // rdi
  __int64 v11; // rax
  __int64 v12; // r12
  __int64 v13; // rax
  __int64 v14; // r12
  __int64 v15; // r14
  __int64 v16; // r13
  __int64 v17; // rsi
  _QWORD *v18; // rcx
  _QWORD *v19; // rdi
  __int64 v20; // rcx
  __int64 v21; // r14
  __int64 v22; // r14
  __int64 v23; // r15
  __int64 v24; // r14
  __int64 v25; // rax
  __int64 v26; // r14
  __int64 v27; // r14
  __int64 v28; // r14
  char v29; // al
  __int64 v30; // rdx
  __int64 v31; // r14
  __int64 v32; // r14
  __int64 v33; // rax
  __int64 v34; // r14
  __int64 v35; // r14
  __int64 v36; // r14
  __int64 v37; // r12
  __int64 v38; // r14
  __int64 v39; // r14
  __int64 v40; // r14
  __int64 v41; // r15
  unsigned __int8 v42; // al
  __int64 v43; // r15
  __int64 v44; // r15
  __int64 v45; // rax
  __int64 v46; // r15
  int v47; // r15d
  __int64 v48; // r12
  __int64 v49; // r12
  __int64 v50; // r15
  __int64 v51; // r8
  __int64 v52; // r12
  __int64 v53; // r12
  __int64 v54; // rax
  __int64 v55; // r15
  __int64 v56; // r15
  __int64 v57; // r12
  __int64 v58; // r12
  __int64 v59; // r15
  int v60; // r15d
  __int64 v61; // rbx
  __int64 v62; // r12
  __int64 v63; // r15
  __int64 v64; // rax
  __int64 v65; // r14
  __int64 v66; // r12
  __int64 v67; // r12
  _BYTE *v68; // r8
  __int64 v69; // r14
  __int64 v70; // r15
  __int64 v71; // r12
  __int64 v72; // r15
  int v73; // ebx
  __int64 v74; // r14
  __int64 v75; // r15
  __int64 v76; // r15
  __int64 v77; // r15
  _BYTE *v78; // r8
  __int64 v79; // r13
  __int64 v80; // r14
  __int64 v81; // r15
  __int64 v82; // rbx
  __int64 v83; // rbx
  unsigned __int8 v84; // al
  __int64 v85; // rbx
  __int64 v86; // rbx
  __int64 v87; // rax
  __int64 v88; // rbx
  __int64 v89; // rbx
  __int64 v90; // rbx
  __int64 v91; // rdi
  __int64 v92; // rbx
  __int64 v93; // rbx
  _BYTE *v94; // r8
  __int64 v95; // rdi
  __int64 v96; // r14
  __int64 v97; // r14
  __int64 v98; // r14
  _BYTE *v99; // r8
  __int64 v100; // rax
  __int64 v101; // rbx
  __int64 v102; // r14
  __int64 v103; // rbx
  __int64 v104; // rbx
  __int64 v105; // rbx
  __int64 v106; // rbx
  _BYTE *v107; // r8
  __int64 v108; // [rsp+20h] [rbp-60h]
  __int64 v109; // [rsp+20h] [rbp-60h]
  __int64 v110; // [rsp+20h] [rbp-60h]
  __int64 v111; // [rsp+20h] [rbp-60h]
  __int64 v112; // [rsp+28h] [rbp-58h]
  __int64 v113; // [rsp+28h] [rbp-58h]
  __int64 v114; // [rsp+28h] [rbp-58h]
  __int64 v115; // [rsp+40h] [rbp-40h]
  __int64 v116; // [rsp+48h] [rbp-38h]
  _BYTE v117[16]; // [rsp+50h] [rbp-30h] BYREF
  __int64 v118; // [rsp+60h] [rbp-20h]
  __int64 v119; // [rsp+68h] [rbp-18h] BYREF
  __int64 v120; // [rsp+70h] [rbp-10h] BYREF
  __int64 v121; // [rsp+78h] [rbp-8h] BYREF
  __int64 v122; // [rsp+80h] [rbp+0h] BYREF
  __int64 v123; // [rsp+88h] [rbp+8h] BYREF
  __int64 v124; // [rsp+90h] [rbp+10h] BYREF
  __int64 v125; // [rsp+98h] [rbp+18h] BYREF
  __int64 v126; // [rsp+A0h] [rbp+20h] BYREF
  __int64 v127; // [rsp+A8h] [rbp+28h] BYREF
  __int64 v128; // [rsp+B0h] [rbp+30h] BYREF
  __int64 v129; // [rsp+B8h] [rbp+38h] BYREF
  __int64 v130; // [rsp+C0h] [rbp+40h] BYREF
  __int64 v131; // [rsp+C8h] [rbp+48h] BYREF
  __int128 v132; // [rsp+D0h] [rbp+50h] BYREF
  __int128 v133; // [rsp+E0h] [rbp+60h]
  int v134; // [rsp+F0h] [rbp+70h]
  char v135; // [rsp+100h] [rbp+80h] BYREF
  _BYTE v136[15]; // [rsp+101h] [rbp+81h] BYREF
  _BYTE *v137; // [rsp+110h] [rbp+90h]
  __int64 v138[2]; // [rsp+118h] [rbp+98h] BYREF
  __int64 v139; // [rsp+128h] [rbp+A8h]
  __int64 v140[8]; // [rsp+130h] [rbp+B0h] BYREF

  v9 = sub_1800025D0(a1, a2);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    return 0;
  if ( v9 == 0 )
  {
    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 144LL /*Throw/FatalError*/))(a1, /*0x8*/ "classloader == null");
    return 0;
  }
  if ( qword_180117640 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117640, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117530);
    if ( qword_180117640 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117640, 0) != 0 )
    {
      v11 = sub_1800023C0(a1);
      if ( v11 != 0 )
      {
        v12 = v11;
        qword_180117640 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v11);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v12);
      }
    }
    sub_1800C6900(&unk_180117530);
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
      v13 = sub_1800023C0(a1);
      if ( v13 != 0 )
      {
        v14 = v13;
        qword_1801175A8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v13);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v14);
      }
    }
    sub_1800C6900(&unk_180117498);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      return 0;
  }
  v140[0] = 0;
  v130 = 0;
  v131 = 0;
  v126 = 0;
  v127 = 0;
  v129 = 0;
  v124 = 0;
  v128 = 0;
  v119 = 0;
  v125 = 0;
  v121 = 0;
  v122 = 0;
  v123 = 0;
  v133 = 0;
  v132 = 0;
  v134 = 1065353216;
  v120 = a3;
  sub_1800036C0((__int64)&v135, (float *)&v132, &v120, &v120);
  v121 = a4;
  sub_1800036C0((__int64)&v135, (float *)&v132, &v121, &v121);
  v122 = a5;
  sub_1800036C0((__int64)&v135, (float *)&v132, &v122, &v122);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_33;
  if ( qword_1801175B0 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801175B0, 0) != 0 )
  {
    sub_1800C68B0(&unk_1801174A0);
    if ( qword_1801175B0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801175B0, 0) != 0 )
    {
      v15 = sub_1800023C0(a1);
      if ( v15 != 0 )
      {
        qword_1801175B0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v15);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v15);
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
  v140[0] = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1208LL))(a1, qword_1801175B0);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_33;
  v131 = 0x3E71EEA1F6C6LL;
  v140[0] ^= 0x3E71EEA1F6C6uLL;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_33;
  v16 = v140[0];
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_105;
  v140[0] = v120;
  sub_1800036C0((__int64)&v135, (float *)&v132, v140, v140);
  if ( qword_180117608 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117608, 0) != 0 )
  {
    sub_1800C68B0(&unk_1801174F8);
    if ( qword_180117608 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117608, 0) != 0 )
    {
      v21 = sub_1800023C0(a1);
      if ( v21 != 0 )
      {
        qword_180117608 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v21);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v21);
      }
    }
    sub_1800C6900(&unk_1801174F8);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_105;
  }
  if ( qword_1801176E8 == 0 )
  {
    qword_1801176E8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                        a1,
                        qword_180117608,
                        /*0xaac*/ "fsi",
                        /*0x6da*/ "(Ljava/lang/String;)[B");
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_105;
  }
  v140[0] = sub_180002760(a1);
  sub_1800036C0((__int64)&v135, (float *)&v132, v140, v140);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_105;
  v123 = v140[0];
  sub_1800036C0((__int64)&v135, (float *)&v132, v140, v140);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_105;
  v140[0] = v123;
  sub_1800036C0((__int64)&v135, (float *)&v132, v140, v140);
  v130 = v121;
  sub_1800036C0((__int64)&v135, (float *)&v132, &v130, &v130);
  v131 = v122;
  sub_1800036C0((__int64)&v135, (float *)&v132, &v131, &v131);
  if ( qword_180117648 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117648, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117538);
    if ( qword_180117648 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117648, 0) != 0 )
    {
      v22 = sub_1800023C0(a1);
      if ( v22 != 0 )
      {
        qword_180117648 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v22);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v22);
      }
    }
    sub_1800C6900(&unk_180117538);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_105;
  }
  if ( qword_180117728 == 0 )
  {
    qword_180117728 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                        a1,
                        qword_180117648,
                        /*0xc0c*/ "cws",
                        /*0xbfd*/ "([B[B[B)[B");
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_105;
  }
  v112 = v131;
  v108 = v130;
  v140[0] = sub_180002760(a1);
  sub_1800036C0((__int64)&v135, (float *)&v132, v140, v140);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_105;
  v23 = v140[0];
  sub_1800036C0((__int64)&v135, (float *)&v132, v140, v140);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_105;
  if ( qword_180117620 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117620, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117510);
    if ( qword_180117620 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117620, 0) != 0 )
    {
      v24 = sub_1800023C0(a1);
      if ( v24 != 0 )
      {
        qword_180117620 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v24);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v24);
      }
    }
    sub_1800C6900(&unk_180117510);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_105;
  }
  v25 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 216LL))(a1, qword_180117620);
  v138[0] = v25;
  if ( v25 != 0 )
  {
    v140[0] = v25;
    sub_1800036C0((__int64)&v135, (float *)&v132, v138, v138);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_105;
  v130 = v140[0];
  v131 = v23;
  sub_1800036C0((__int64)&v135, (float *)&v132, &v131, &v131);
  if ( qword_180117628 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117628, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117518);
    if ( qword_180117628 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117628, 0) != 0 )
    {
      v26 = sub_1800023C0(a1);
      if ( v26 != 0 )
      {
        qword_180117628 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v26);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v26);
      }
    }
    sub_1800C6900(&unk_180117518);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_105;
  }
  if ( qword_180117850 == 0 )
  {
    qword_180117850 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL /*GetMethodID*/))(
                        a1,
                        qword_180117628,
                        /*0xb49*/ "UTF_8",
                        /*0xb4f*/ "Ljava/nio/charset/Charset;",
                        v108,
                        v112);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_105;
  }
  v126 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1160LL /*GetObjectClass/AllocObject*/))(a1, qword_180117628);
  sub_1800036C0((__int64)&v135, (float *)&v132, &v126, &v126);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_105;
  if ( qword_180117620 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117620, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117510);
    if ( qword_180117620 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117620, 0) != 0 )
    {
      v27 = sub_1800023C0(a1);
      if ( v27 != 0 )
      {
        qword_180117620 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v27);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v27);
      }
    }
    sub_1800C6900(&unk_180117510);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_105;
  }
  if ( qword_180117730 == 0
    && (qword_180117730 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                            a1,
                            qword_180117620,
                            /*0x48b*/ "<init>",
                            /*0xc10*/ "([BLjava/nio/charset/Charset;)V"),
        (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0) )
  {
LABEL_105:
    v28 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
    (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
    v140[0] = v28;
    v138[0] = v28;
    sub_180026960(&v135, &v132, v138, v138);
  }
  else
  {
    if ( v130 != 0 )
      sub_180026870(a1, v130, qword_180117620, qword_180117730, v131, v126);
    else
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x4ab*/ "INVOKESPECIAL Void npe", 21);
    v29 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
    v30 = *(_QWORD *)a1;
    if ( v29 == 0 )
    {
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(v30 + 1824))(a1) == 0 )
      {
        v17 = v140[0];
        goto LABEL_34;
      }
      goto LABEL_33;
    }
    v31 = (*(__int64 (__fastcall **)(__int64))(v30 + 120))(a1);
    (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
    v140[0] = v31;
    v138[0] = v31;
    sub_180026960(&v135, &v132, v138, v138);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
         a1,
         v140[0],
         qword_180117640) == 0 )
  {
LABEL_472:
    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v140[0]);
    goto LABEL_33;
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_33;
  sub_180026DB0(&v132, v140);
  sub_180026DB0(&v132, &v120);
  sub_180026DB0(&v132, &v121);
  sub_180026DB0(&v132, &v122);
  sub_180002660(a1, &v132);
  v123 = v140[0];
  sub_1800036C0((__int64)&v135, (float *)&v132, v140, v140);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_33;
  if ( qword_180117638 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117638, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117528);
    if ( qword_180117638 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117638, 0) != 0 )
    {
      v32 = sub_1800023C0(a1);
      if ( v32 != 0 )
      {
        qword_180117638 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v32);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v32);
      }
    }
    sub_1800C6900(&unk_180117528);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_33;
  }
  v33 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 216LL))(a1, qword_180117638);
  v138[0] = v33;
  if ( v33 != 0 )
  {
    v140[0] = v33;
    sub_1800036C0((__int64)&v135, (float *)&v132, v138, v138);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_33;
  v130 = v140[0];
  v131 = v123;
  sub_1800036C0((__int64)&v135, (float *)&v132, &v131, &v131);
  if ( qword_180117640 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117640, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117530);
    if ( qword_180117640 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117640, 0) != 0 )
    {
      v34 = sub_1800023C0(a1);
      if ( v34 != 0 )
      {
        qword_180117640 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v34);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v34);
      }
    }
    sub_1800C6900(&unk_180117530);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_33;
  }
  if ( qword_180117738 == 0 )
  {
    qword_180117738 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                        a1,
                        qword_180117640,
                        /*0xc30*/ "getMessage",
                        /*0xc3b*/ "()Ljava/lang/String;");
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_33;
  }
  if ( v131 != 0 )
  {
    v131 = sub_180002790(a1);
    sub_1800036C0((__int64)&v135, (float *)&v132, &v131, &v131);
  }
  else
  {
    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 2);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_33;
  if ( qword_1801175B0 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801175B0, 0) != 0 )
  {
    sub_1800C68B0(&unk_1801174A0);
    if ( qword_1801175B0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801175B0, 0) != 0 )
    {
      v35 = sub_1800023C0(a1);
      if ( v35 != 0 )
      {
        qword_1801175B0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v35);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v35);
      }
    }
    sub_1800C6900(&unk_1801174A0);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_33;
  }
  if ( qword_180117848 == 0 )
  {
    qword_180117848 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL /*GetMethodID*/))(
                        a1,
                        qword_1801175B0,
                        /*0xa5*/ "a",
                        /*0xa3e*/ "[Ljava/lang/String;");
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_33;
  }
  v126 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1160LL /*GetObjectClass/AllocObject*/))(a1, qword_1801175B0);
  sub_1800036C0((__int64)&v135, (float *)&v132, &v126, &v126);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_33;
  LODWORD(v127) = 29429;
  v129 = v16;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
  {
    LODWORD(v129) = 1;
    if ( qword_1801175B8 != 0
      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801175B8, 0) == 0 )
    {
      goto LABEL_627;
    }
    sub_1800C68B0(&unk_1801174A8);
    if ( qword_1801175B8 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801175B8, 0) != 0 )
    {
      v36 = sub_1800023C0(a1);
      if ( v36 != 0 )
      {
        qword_1801175B8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v36);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v36);
      }
    }
    sub_1800C6900(&unk_1801174A8);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
    {
LABEL_627:
      if ( (int)v129 < 0 )
      {
        sub_180002110(a1, /*0x2ce*/ "java/lang/NegativeArraySizeException", /*0x2f3*/ "ANEWARRAY array size < 0", 2);
      }
      else
      {
        v129 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, _QWORD))(*(_QWORD *)a1 + 1376LL))(
                 a1,
                 (unsigned int)v129,
                 qword_1801175B8,
                 0);
        sub_1800036C0((__int64)&v135, (float *)&v132, &v129, &v129);
      }
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
      {
        v37 = v129;
        if ( qword_1801175C0 != 0
          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
               a1,
               qword_1801175C0,
               0) == 0 )
        {
          goto LABEL_203;
        }
        sub_1800C68B0(&unk_1801174B0);
        if ( qword_1801175C0 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
               a1,
               qword_1801175C0,
               0) != 0 )
        {
          v38 = sub_1800023C0(a1);
          if ( v38 != 0 )
          {
            qword_1801175C0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v38);
            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v38);
          }
        }
        sub_1800C6900(&unk_1801174B0);
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
        {
LABEL_203:
          v47 = qword_1801175C0;
          v124 = v37;
          v40 = sub_180002610(a1, a2);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
          {
            v128 = v40;
            if ( qword_1801175C0 != 0
              && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                   a1,
                   qword_1801175C0,
                   0) == 0 )
            {
              goto LABEL_628;
            }
            sub_1800C68B0(&unk_1801174B0);
            if ( qword_1801175C0 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                   a1,
                   qword_1801175C0,
                   0) != 0 )
            {
              v48 = sub_1800023C0(a1);
              if ( v48 != 0 )
              {
                qword_1801175C0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v48);
                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v48);
              }
            }
            sub_1800C6900(&unk_1801174B0);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
            {
LABEL_628:
              v119 = qword_180117310;
              v125 = qword_180117318;
              if ( qword_1801175C8 != 0
                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                     a1,
                     qword_1801175C8,
                     0) == 0 )
              {
                goto LABEL_629;
              }
              sub_1800C68B0(&unk_1801174B8);
              if ( qword_1801175C8 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                     a1,
                     qword_1801175C8,
                     0) != 0 )
              {
                v49 = sub_1800023C0(a1);
                if ( v49 != 0 )
                {
                  qword_1801175C8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v49);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v49);
                }
              }
              sub_1800C6900(&unk_1801174B8);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
              {
LABEL_629:
                if ( qword_1801176B0 != 0
                  || (qword_1801176B0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                          a1,
                                          qword_1801175C8,
                                          /*0x30c*/ "fromMethodDescriptorString",
                                          /*0x327*/ "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/invoke/MethodType;"),
                      (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                {
                  v125 = sub_180002760(a1);
                  sub_1800036C0((__int64)&v135, (float *)&v132, &v125, &v125);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                  {
                    if ( qword_1801175D0 != 0
                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                           a1,
                           qword_1801175D0,
                           0) == 0 )
                    {
                      goto LABEL_630;
                    }
                    sub_1800C68B0(&unk_1801174C0);
                    if ( qword_1801175D0 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                           a1,
                           qword_1801175D0,
                           0) != 0 )
                    {
                      v52 = sub_1800023C0(a1);
                      if ( v52 != 0 )
                      {
                        qword_1801175D0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                            a1,
                                            v52);
                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v52);
                      }
                    }
                    sub_1800C6900(&unk_1801174C0);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                    {
LABEL_630:
                      if ( qword_1801176B8 != 0
                        || (qword_1801176B8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                a1,
                                                qword_1801175D0,
                                                /*0x370*/ "findStatic",
                                                /*0x37b*/ "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;",
                                                v9),
                            (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                      {
                        if ( v128 != 0 )
                        {
                          v128 = sub_180002790(a1);
                          sub_1800036C0((__int64)&v135, (float *)&v132, &v128, &v128);
                        }
                        else
                        {
                          sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 2);
                        }
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                        {
                          v116 = v124;
                          v124 = v128;
                          v128 = qword_180117330;
                          v119 = qword_180117338;
                          v125 = v9;
                          if ( qword_1801175C8 != 0
                            && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                 a1,
                                 qword_1801175C8,
                                 0) == 0 )
                          {
                            goto LABEL_631;
                          }
                          sub_1800C68B0(&unk_1801174B8);
                          if ( qword_1801175C8 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                 a1,
                                 qword_1801175C8,
                                 0) != 0 )
                          {
                            v53 = sub_1800023C0(a1);
                            if ( v53 != 0 )
                            {
                              qword_1801175C8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                  a1,
                                                  v53);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v53);
                            }
                          }
                          sub_1800C6900(&unk_1801174B8);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                          {
LABEL_631:
                            if ( qword_1801176B0 != 0
                              || (qword_1801176B0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                      a1,
                                                      qword_1801175C8,
                                                      /*0x30c*/ "fromMethodDescriptorString",
                                                      /*0x327*/ "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/invoke/MethodType;"),
                                  (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                            {
                              v109 = v125;
                              v119 = sub_180002760(a1);
                              sub_1800036C0((__int64)&v135, (float *)&v132, &v119, &v119);
                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                              {
                                v115 = v119;
                                v119 = v116;
                                LODWORD(v125) = 0;
                                if ( qword_1801175B8 != 0
                                  && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                       a1,
                                       qword_1801175B8,
                                       0) == 0 )
                                {
                                  goto LABEL_632;
                                }
                                sub_1800C68B0(&unk_1801174A8);
                                if ( qword_1801175B8 == 0
                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                       a1,
                                       qword_1801175B8,
                                       0) != 0 )
                                {
                                  v57 = sub_1800023C0(a1);
                                  if ( v57 != 0 )
                                  {
                                    qword_1801175B8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1
                                                                                                  + 1808LL /*NewGlobalRef(id)*/))(
                                                        a1,
                                                        v57);
                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v57);
                                  }
                                }
                                sub_1800C6900(&unk_1801174A8);
                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                {
LABEL_632:
                                  if ( (int)v125 < 0 )
                                  {
                                    sub_180002110(a1, /*0x2ce*/ "java/lang/NegativeArraySizeException", /*0x2f3*/ "ANEWARRAY array size < 0", 2);
                                  }
                                  else
                                  {
                                    v125 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, _QWORD, __int64))(*(_QWORD *)a1 + 1376LL))(
                                             a1,
                                             (unsigned int)v125,
                                             qword_1801175B8,
                                             0,
                                             v109);
                                    sub_1800036C0((__int64)&v135, (float *)&v132, &v125, &v125);
                                  }
                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                  {
                                    if ( qword_1801175B8 != 0
                                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                           a1,
                                           qword_1801175B8,
                                           0) == 0 )
                                    {
                                      goto LABEL_330;
                                    }
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
                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v62);
                                      }
                                    }
                                    sub_1800C6900(&unk_1801174A8);
                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                    {
LABEL_330:
                                      if ( v125 != 0
                                        && (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                             a1,
                                             v125,
                                             qword_1801175B8) == 0 )
                                      {
                                        v66 = qword_1801172E0;
                                        sub_1800267D0(v138, /*0x3fa*/ "cannot cast to ");
                                        sub_1800267D0(v117, /*0x40a*/ "java/lang/Object");
                                        sub_180026770(&v135, v138, v117);
                                        v67 = v66 + 989;
                                        if ( (v135 & 1) != 0 )
                                          v68 = v137;
                                        else
                                          v68 = v136;
                                        sub_180002110(a1, v67, v68, 2);
                                        if ( (v135 & 1) != 0 )
                                        {
                                          sub_1800C0DC0(v137);
                                          if ( (v117[0] & 1) == 0 )
                                          {
LABEL_373:
                                            if ( (v138[0] & 1) == 0 )
                                              goto LABEL_375;
                                            goto LABEL_374;
                                          }
                                        }
                                        else if ( (v117[0] & 1) == 0 )
                                        {
                                          goto LABEL_373;
                                        }
                                        sub_1800C0DC0(v118);
                                        if ( (v138[0] & 1) == 0 )
                                        {
LABEL_375:
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_447;
                                          goto LABEL_331;
                                        }
LABEL_374:
                                        sub_1800C0DC0(v139);
                                        goto LABEL_375;
                                      }
LABEL_331:
                                      v64 = v125;
                                      v125 = v119;
                                      v119 = v64;
                                      sub_180001510(a1, v47, v124, v128, v115, v64, v125);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                      {
                                        if ( v129 != 0 )
                                        {
                                          v129 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1384LL))(
                                                   a1,
                                                   v129,
                                                   0);
                                          sub_1800036C0((__int64)&v135, (float *)&v132, &v129, &v129);
                                        }
                                        else
                                        {
                                          sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x41b*/ "AALOAD npe", 2);
                                        }
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                        {
                                          v70 = v129;
                                          if ( qword_1801175D8 != 0
                                            && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                 a1,
                                                 qword_1801175D8,
                                                 0) == 0 )
                                          {
                                            goto LABEL_385;
                                          }
                                          sub_1800C68B0(&unk_1801174C8);
                                          if ( qword_1801175D8 == 0
                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                 a1,
                                                 qword_1801175D8,
                                                 0) != 0 )
                                          {
                                            v71 = sub_1800023C0(a1);
                                            if ( v71 != 0 )
                                            {
                                              qword_1801175D8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                  a1,
                                                                  v71);
                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                a1,
                                                v71);
                                            }
                                          }
                                          sub_1800C6900(&unk_1801174C8);
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                          {
LABEL_385:
                                            if ( v70 == 0
                                              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                   a1,
                                                   v70,
                                                   qword_1801175D8) == 0 )
                                            {
                                              goto LABEL_633;
                                            }
                                            if ( qword_1801175D8 != 0
                                              && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                   a1,
                                                   qword_1801175D8,
                                                   0) == 0 )
                                            {
                                              goto LABEL_417;
                                            }
                                            sub_1800C68B0(&unk_1801174C8);
                                            if ( qword_1801175D8 == 0
                                              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                   a1,
                                                   qword_1801175D8,
                                                   0) != 0 )
                                            {
                                              v72 = sub_1800023C0(a1);
                                              if ( v72 != 0 )
                                              {
                                                qword_1801175D8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                    a1,
                                                                    v72);
                                                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                  a1,
                                                  v72);
                                              }
                                            }
                                            sub_1800C6900(&unk_1801174C8);
                                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                            {
LABEL_417:
                                              if ( qword_1801176C0 != 0
                                                || (qword_1801176C0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                        a1,
                                                                        qword_1801175D8,
                                                                        /*0x426*/ "getTarget",
                                                                        /*0x430*/ "()Ljava/lang/invoke/MethodHandle;"),
                                                    (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                                              {
                                                if ( v129 != 0 )
                                                {
                                                  v129 = sub_180002790(a1);
                                                  sub_1800036C0((__int64)&v135, (float *)&v132, &v129, &v129);
                                                }
                                                else
                                                {
                                                  sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x452*/ "INVOKEINTERFACE Object npe", 2);
                                                }
                                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                {
LABEL_633:
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                  {
                                                    sub_180026DB0(&v132, v140);
                                                    sub_180026DB0(&v132, &v130);
                                                    sub_180026DB0(&v132, &v131);
                                                    sub_180026DB0(&v132, &v126);
                                                    sub_180026DB0(&v132, &v129);
                                                    sub_180026DB0(&v132, &v120);
                                                    sub_180026DB0(&v132, &v121);
                                                    sub_180026DB0(&v132, &v122);
                                                    sub_180026DB0(&v132, &v123);
                                                    sub_180002660(a1, &v132);
                                                    if ( qword_1801175E0 != 0
                                                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175E0,
                                                           0) == 0 )
                                                    {
                                                      goto LABEL_428;
                                                    }
                                                    sub_1800C68B0(&unk_1801174D0);
                                                    if ( qword_1801175E0 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_1801175E0,
                                                           0) != 0 )
                                                    {
                                                      v75 = sub_1800023C0(a1);
                                                      if ( v75 != 0 )
                                                      {
                                                        qword_1801175E0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v75);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v75);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_1801174D0);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                    {
LABEL_428:
                                                      if ( v129 == 0
                                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                             a1,
                                                             v129,
                                                             qword_1801175E0) != 0 )
                                                      {
                                                        goto LABEL_224;
                                                      }
                                                      v76 = qword_1801172E0;
                                                      sub_1800267D0(v138, /*0x3fa*/ "cannot cast to ");
                                                      sub_1800267D0(v117, /*0x46d*/ "java/lang/invoke/MethodHandle");
                                                      sub_180026770(&v135, v138, v117);
                                                      v77 = v76 + 989;
                                                      if ( (v135 & 1) != 0 )
                                                        v78 = v137;
                                                      else
                                                        v78 = v136;
                                                      sub_180002110(a1, v77, v78, 2);
                                                      if ( (v135 & 1) != 0 )
                                                      {
                                                        sub_1800C0DC0(v137);
                                                        if ( (v117[0] & 1) == 0 )
                                                        {
LABEL_444:
                                                          if ( (v138[0] & 1) == 0 )
                                                            goto LABEL_446;
                                                          goto LABEL_445;
                                                        }
                                                      }
                                                      else if ( (v117[0] & 1) == 0 )
                                                      {
                                                        goto LABEL_444;
                                                      }
                                                      sub_1800C0DC0(v118);
                                                      if ( (v138[0] & 1) == 0 )
                                                      {
LABEL_446:
                                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                          goto LABEL_224;
                                                        goto LABEL_447;
                                                      }
LABEL_445:
                                                      sub_1800C0DC0(v139);
                                                      goto LABEL_446;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
LABEL_447:
                                      v81 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                      (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                      v140[0] = v81;
                                      v138[0] = v81;
                                      sub_180026960(&v135, &v132, v138, v138);
LABEL_168:
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                             a1,
                                             v140[0],
                                             qword_1801175A8) == 0 )
                                        goto LABEL_472;
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_33;
                                      sub_180026DB0(&v132, v140);
                                      sub_180026DB0(&v132, &v120);
                                      sub_180026DB0(&v132, &v121);
                                      sub_180026DB0(&v132, &v122);
                                      sub_180026DB0(&v132, &v123);
                                      sub_180002660(a1, &v132);
                                      v130 = v140[0];
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
                                          v41 = sub_1800023C0(a1);
                                          if ( v41 != 0 )
                                          {
                                            qword_1801175E8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v41);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v41);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174D8);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_33;
                                      }
                                      if ( v130 != 0 )
                                      {
                                        v42 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                a1,
                                                v130,
                                                qword_1801175E8);
                                        LODWORD(v130) = v42;
                                        if ( v42 != 0 )
                                          goto LABEL_179;
                                      }
                                      else
                                      {
                                        LODWORD(v130) = 0;
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
                                          v44 = sub_1800023C0(a1);
                                          if ( v44 != 0 )
                                          {
                                            qword_1801175E8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v44);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v44);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174D8);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_33;
                                      }
                                      v45 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 216LL))(
                                              a1,
                                              qword_1801175E8);
                                      v138[0] = v45;
                                      if ( v45 != 0 )
                                      {
                                        v130 = v45;
                                        sub_1800036C0((__int64)&v135, (float *)&v132, v138, v138);
                                      }
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_33;
                                      v126 = v130;
                                      v127 = v130;
                                      v131 = v140[0];
                                      v140[0] = v130;
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
                                          v46 = sub_1800023C0(a1);
                                          if ( v46 != 0 )
                                          {
                                            qword_1801175E8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v46);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v46);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174D8);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_33;
                                      }
                                      if ( qword_1801176C8 == 0 )
                                      {
                                        qword_1801176C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                            a1,
                                                            qword_1801175E8,
                                                            /*0x48b*/ "<init>",
                                                            /*0x492*/ "(Ljava/lang/Throwable;)V");
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_33;
                                      }
                                      if ( v130 != 0 )
                                        sub_180026870(a1, v130, qword_1801175E8, qword_1801176C8, v131);
                                      else
                                        sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x4ab*/ "INVOKESPECIAL Void npe", 2);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_33;
LABEL_179:
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_33;
                                      sub_180026DB0(&v132, v140);
                                      sub_180026DB0(&v132, &v120);
                                      sub_180026DB0(&v132, &v121);
                                      sub_180026DB0(&v132, &v122);
                                      sub_180026DB0(&v132, &v123);
                                      sub_180002660(a1, &v132);
                                      v43 = v140[0];
                                      if ( v140[0] != 0 )
                                      {
                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v140[0]);
                                        v138[0] = v43;
                                        sub_180026960(&v135, &v132, v138, v138);
                                      }
                                      else
                                      {
                                        sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x29a*/ "ATHROW npe", 2);
                                      }
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_33;
LABEL_224:
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_33;
                                      sub_180026DB0(&v132, v140);
                                      sub_180026DB0(&v132, &v130);
                                      sub_180026DB0(&v132, &v131);
                                      sub_180026DB0(&v132, &v126);
                                      sub_180026DB0(&v132, &v129);
                                      sub_180026DB0(&v132, &v120);
                                      sub_180026DB0(&v132, &v121);
                                      sub_180026DB0(&v132, &v122);
                                      sub_180026DB0(&v132, &v123);
                                      sub_180002660(a1, &v132);
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
                                          v50 = sub_1800023C0(a1);
                                          if ( v50 != 0 )
                                          {
                                            qword_1801175F0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v50);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v50);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174E0);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_33;
                                      }
                                      v51 = qword_1801176D0;
                                      if ( qword_1801176D0 == 0 )
                                      {
                                        qword_1801176D0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                            a1,
                                                            qword_1801175F0,
                                                            /*0x4c2*/ "invokereverse0",
                                                            /*0x4d1*/ "(IJLjava/lang/invoke/MethodHandle;)I");
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_33;
                                        v51 = qword_1801176D0;
                                      }
                                      LODWORD(v127) = sub_1800268A0(
                                                        a1,
                                                        qword_1801175F0,
                                                        v51,
                                                        (unsigned int)v127,
                                                        v16 ^ 0x602946CA1F6DF4F4LL,
                                                        v129);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_33;
                                      if ( v126 != 0 )
                                      {
                                        v126 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1384LL))(
                                                 a1,
                                                 v126,
                                                 (unsigned int)v127);
                                        sub_1800036C0((__int64)&v135, (float *)&v132, &v126, &v126);
                                      }
                                      else
                                      {
                                        sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x41b*/ "AALOAD npe", 2);
                                      }
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_33;
                                      v54 = v126;
                                      v126 = v131;
                                      v131 = v54;
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_458;
                                      LODWORD(v127) = 1;
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
                                          v55 = sub_1800023C0(a1);
                                          if ( v55 != 0 )
                                          {
                                            qword_1801175B8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v55);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v55);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174A8);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_458;
                                      }
                                      if ( (int)v127 < 0 )
                                      {
                                        sub_180002110(a1, /*0x2ce*/ "java/lang/NegativeArraySizeException", /*0x2f3*/ "ANEWARRAY array size < 0", 2);
                                      }
                                      else
                                      {
                                        v127 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, _QWORD))(*(_QWORD *)a1 + 1376LL))(
                                                 a1,
                                                 (unsigned int)v127,
                                                 qword_1801175B8,
                                                 0);
                                        sub_1800036C0((__int64)&v135, (float *)&v132, &v127, &v127);
                                      }
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_458;
                                      v58 = v127;
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
                                          v59 = sub_1800023C0(a1);
                                          if ( v59 != 0 )
                                          {
                                            qword_1801175C0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v59);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v59);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174B0);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_458;
                                      }
                                      v60 = qword_1801175C0;
                                      if ( v40 == 0 )
                                      {
                                        v40 = sub_180002610(a1, a2);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_458;
                                      }
                                      v129 = v40;
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
                                          v61 = sub_1800023C0(a1);
                                          if ( v61 != 0 )
                                          {
                                            qword_180117618 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v61);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v61);
                                          }
                                        }
                                        sub_1800C6900(&unk_180117508);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_458;
                                      }
                                      v124 = qword_180117388;
                                      v128 = qword_180117390;
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
                                          v65 = sub_1800023C0(a1);
                                          if ( v65 != 0 )
                                          {
                                            qword_1801175C8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v65);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v65);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174B8);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_458;
                                      }
                                      if ( qword_1801176B0 == 0 )
                                      {
                                        qword_1801176B0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                            a1,
                                                            qword_1801175C8,
                                                            /*0x30c*/ "fromMethodDescriptorString",
                                                            /*0x327*/ "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/invoke/MethodType;");
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_458;
                                      }
                                      v128 = sub_180002760(a1);
                                      sub_1800036C0((__int64)&v135, (float *)&v132, &v128, &v128);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_458;
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
                                          v69 = sub_1800023C0(a1);
                                          if ( v69 != 0 )
                                          {
                                            qword_1801175D0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v69);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v69);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174C0);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_458;
                                      }
                                      if ( qword_1801176B8 == 0 )
                                      {
                                        qword_1801176B8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                            a1,
                                                            qword_1801175D0,
                                                            /*0x370*/ "findStatic",
                                                            /*0x37b*/ "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;",
                                                            v9);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_458;
                                      }
                                      if ( v129 != 0 )
                                      {
                                        v113 = v128;
                                        v129 = sub_180002790(a1);
                                        sub_1800036C0((__int64)&v135, (float *)&v132, &v129, &v129);
                                      }
                                      else
                                      {
                                        sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 2);
                                      }
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_458;
                                      v73 = v129;
                                      v129 = qword_180117388;
                                      v124 = qword_1801173D8;
                                      v128 = v9;
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
                                          v74 = sub_1800023C0(a1);
                                          if ( v74 != 0 )
                                          {
                                            qword_1801175C8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v74);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v74);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174B8);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_458;
                                      }
                                      if ( qword_1801176B0 == 0 )
                                      {
                                        qword_1801176B0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                            a1,
                                                            qword_1801175C8,
                                                            /*0x30c*/ "fromMethodDescriptorString",
                                                            /*0x327*/ "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/invoke/MethodType;");
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_458;
                                      }
                                      v110 = v128;
                                      v124 = sub_180002760(a1);
                                      sub_1800036C0((__int64)&v135, (float *)&v132, &v124, &v124);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_458;
                                      v79 = v124;
                                      v124 = v58;
                                      LODWORD(v128) = 1;
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
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v80);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174A8);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_458;
                                      }
                                      if ( (int)v128 < 0 )
                                      {
                                        sub_180002110(a1, /*0x2ce*/ "java/lang/NegativeArraySizeException", /*0x2f3*/ "ANEWARRAY array size < 0", 2);
                                      }
                                      else
                                      {
                                        v128 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, _QWORD, __int64, __int64))(*(_QWORD *)a1 + 1376LL))(
                                                 a1,
                                                 (unsigned int)v128,
                                                 qword_1801175B8,
                                                 0,
                                                 v110,
                                                 v113);
                                        sub_1800036C0((__int64)&v135, (float *)&v132, &v128, &v128);
                                      }
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_458;
                                      LODWORD(v119) = 0;
                                      v125 = qword_1801173E0;
                                      if ( v128 != 0 )
                                        (*(void (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1392LL))(
                                          a1,
                                          v128,
                                          0);
                                      else
                                        sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0xad6*/ "AASTORE npe", 2);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_458;
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
                                          v96 = sub_1800023C0(a1);
                                          if ( v96 != 0 )
                                          {
                                            qword_1801175B8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v96);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v96);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174A8);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_458;
                                      }
                                      if ( v128 != 0
                                        && (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                             a1,
                                             v128,
                                             qword_1801175B8) == 0 )
                                      {
                                        v97 = qword_1801172E0;
                                        sub_1800267D0(v138, /*0x3fa*/ "cannot cast to ");
                                        sub_1800267D0(v117, /*0x40a*/ "java/lang/Object");
                                        sub_180026770(&v135, v138, v117);
                                        v98 = v97 + 989;
                                        if ( (v135 & 1) != 0 )
                                          v99 = v137;
                                        else
                                          v99 = v136;
                                        sub_180002110(a1, v98, v99, 2);
                                        if ( (v135 & 1) != 0 )
                                        {
                                          sub_1800C0DC0(v137);
                                          if ( (v117[0] & 1) == 0 )
                                          {
LABEL_569:
                                            if ( (v138[0] & 1) == 0 )
                                              goto LABEL_571;
                                            goto LABEL_570;
                                          }
                                        }
                                        else if ( (v117[0] & 1) == 0 )
                                        {
                                          goto LABEL_569;
                                        }
                                        sub_1800C0DC0(v118);
                                        if ( (v138[0] & 1) == 0 )
                                        {
LABEL_571:
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_458;
                                          goto LABEL_576;
                                        }
LABEL_570:
                                        sub_1800C0DC0(v139);
                                        goto LABEL_571;
                                      }
LABEL_576:
                                      v100 = v128;
                                      v128 = v124;
                                      v124 = v100;
                                      sub_180001510(a1, v60, v73, v129, v79, v100, v128);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_458;
                                      if ( v127 != 0 )
                                      {
                                        v127 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1384LL))(
                                                 a1,
                                                 v127,
                                                 0);
                                        sub_1800036C0((__int64)&v135, (float *)&v132, &v127, &v127);
                                      }
                                      else
                                      {
                                        sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x41b*/ "AALOAD npe", 2);
                                      }
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_458;
                                      v101 = v127;
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
                                          v102 = sub_1800023C0(a1);
                                          if ( v102 != 0 )
                                          {
                                            qword_1801175D8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v102);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v102);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174C8);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_458;
                                      }
                                      if ( v101 != 0
                                        && (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                             a1,
                                             v101,
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
                                            v103 = sub_1800023C0(a1);
                                            if ( v103 != 0 )
                                            {
                                              qword_1801175D8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                  a1,
                                                                  v103);
                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                a1,
                                                v103);
                                            }
                                          }
                                          sub_1800C6900(&unk_1801174C8);
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_458;
                                        }
                                        if ( qword_1801176C0 == 0 )
                                        {
                                          qword_1801176C0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                              a1,
                                                              qword_1801175D8,
                                                              /*0x426*/ "getTarget",
                                                              /*0x430*/ "()Ljava/lang/invoke/MethodHandle;");
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_458;
                                        }
                                        if ( v127 != 0 )
                                        {
                                          v127 = sub_180002790(a1);
                                          sub_1800036C0((__int64)&v135, (float *)&v132, &v127, &v127);
                                        }
                                        else
                                        {
                                          sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x452*/ "INVOKEINTERFACE Object npe", 2);
                                        }
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_458;
                                      }
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_458;
                                      sub_180026DB0(&v132, v140);
                                      sub_180026DB0(&v132, &v130);
                                      sub_180026DB0(&v132, &v131);
                                      sub_180026DB0(&v132, &v126);
                                      sub_180026DB0(&v132, &v127);
                                      sub_180026DB0(&v132, &v120);
                                      sub_180026DB0(&v132, &v121);
                                      sub_180026DB0(&v132, &v122);
                                      sub_180026DB0(&v132, &v123);
                                      sub_180002660(a1, &v132);
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
                                          v104 = sub_1800023C0(a1);
                                          if ( v104 != 0 )
                                          {
                                            qword_1801175E0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v104);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v104);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174D0);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_458;
                                      }
                                      if ( v127 == 0
                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                             a1,
                                             v127,
                                             qword_1801175E0) != 0 )
                                      {
                                        goto LABEL_496;
                                      }
                                      v105 = qword_1801172E0;
                                      sub_1800267D0(v138, /*0x3fa*/ "cannot cast to ");
                                      sub_1800267D0(v117, /*0x46d*/ "java/lang/invoke/MethodHandle");
                                      sub_180026770(&v135, v138, v117);
                                      v106 = v105 + 989;
                                      if ( (v135 & 1) != 0 )
                                        v107 = v137;
                                      else
                                        v107 = v136;
                                      sub_180002110(a1, v106, v107, 2);
                                      if ( (v135 & 1) != 0 )
                                      {
                                        sub_1800C0DC0(v137);
                                        if ( (v117[0] & 1) == 0 )
                                        {
LABEL_618:
                                          if ( (v138[0] & 1) == 0 )
                                            goto LABEL_620;
                                          goto LABEL_619;
                                        }
                                      }
                                      else if ( (v117[0] & 1) == 0 )
                                      {
                                        goto LABEL_618;
                                      }
                                      sub_1800C0DC0(v118);
                                      if ( (v138[0] & 1) != 0 )
LABEL_619:
                                        sub_1800C0DC0(v139);
LABEL_620:
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                        goto LABEL_496;
LABEL_458:
                                      v82 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                      (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                      v140[0] = v82;
                                      v138[0] = v82;
                                      sub_180026960(&v135, &v132, v138, v138);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                             a1,
                                             v140[0],
                                             qword_1801175A8) == 0 )
                                        goto LABEL_472;
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_33;
                                      sub_180026DB0(&v132, v140);
                                      sub_180026DB0(&v132, &v120);
                                      sub_180026DB0(&v132, &v121);
                                      sub_180026DB0(&v132, &v122);
                                      sub_180026DB0(&v132, &v123);
                                      sub_180002660(a1, &v132);
                                      v130 = v140[0];
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
                                          v83 = sub_1800023C0(a1);
                                          if ( v83 != 0 )
                                          {
                                            qword_1801175E8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v83);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v83);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174D8);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_33;
                                      }
                                      if ( v130 != 0 )
                                      {
                                        v84 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                a1,
                                                v130,
                                                qword_1801175E8);
                                        LODWORD(v130) = v84;
                                        if ( v84 != 0 )
                                          goto LABEL_469;
                                      }
                                      else
                                      {
                                        LODWORD(v130) = 0;
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
                                          v86 = sub_1800023C0(a1);
                                          if ( v86 != 0 )
                                          {
                                            qword_1801175E8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v86);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v86);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174D8);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_33;
                                      }
                                      v87 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 216LL))(
                                              a1,
                                              qword_1801175E8);
                                      v138[0] = v87;
                                      if ( v87 != 0 )
                                      {
                                        v130 = v87;
                                        sub_1800036C0((__int64)&v135, (float *)&v132, v138, v138);
                                      }
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_33;
                                      v126 = v130;
                                      v127 = v130;
                                      v131 = v140[0];
                                      v140[0] = v130;
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
                                          v88 = sub_1800023C0(a1);
                                          if ( v88 != 0 )
                                          {
                                            qword_1801175E8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v88);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v88);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174D8);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_33;
                                      }
                                      if ( qword_1801176C8 == 0 )
                                      {
                                        qword_1801176C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                            a1,
                                                            qword_1801175E8,
                                                            /*0x48b*/ "<init>",
                                                            /*0x492*/ "(Ljava/lang/Throwable;)V");
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_33;
                                      }
                                      if ( v130 != 0 )
                                        sub_180026870(a1, v130, qword_1801175E8, qword_1801176C8, v131);
                                      else
                                        sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x4ab*/ "INVOKESPECIAL Void npe", 2);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_33;
LABEL_469:
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_33;
                                      sub_180026DB0(&v132, v140);
                                      sub_180026DB0(&v132, &v120);
                                      sub_180026DB0(&v132, &v121);
                                      sub_180026DB0(&v132, &v122);
                                      sub_180026DB0(&v132, &v123);
                                      sub_180002660(a1, &v132);
                                      v85 = v140[0];
                                      if ( v140[0] != 0 )
                                      {
                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v140[0]);
                                        v138[0] = v85;
                                        sub_180026960(&v135, &v132, v138, v138);
                                      }
                                      else
                                      {
                                        sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x29a*/ "ATHROW npe", 2);
                                      }
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_33;
LABEL_496:
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_33;
                                      sub_180026DB0(&v132, v140);
                                      sub_180026DB0(&v132, &v130);
                                      sub_180026DB0(&v132, &v131);
                                      sub_180026DB0(&v132, &v126);
                                      sub_180026DB0(&v132, &v127);
                                      sub_180026DB0(&v132, &v120);
                                      sub_180026DB0(&v132, &v121);
                                      sub_180026DB0(&v132, &v122);
                                      sub_180026DB0(&v132, &v123);
                                      sub_180002660(a1, &v132);
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
                                          v89 = sub_1800023C0(a1);
                                          if ( v89 != 0 )
                                          {
                                            qword_1801175F0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v89);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v89);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174E0);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_33;
                                      }
                                      if ( qword_180117740 == 0 )
                                      {
                                        qword_180117740 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                            a1,
                                                            qword_1801175F0,
                                                            /*0xc50*/ "invokereverse2",
                                                            /*0xc5f*/ "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;");
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_33;
                                      }
                                      v114 = v127;
                                      v111 = v126;
                                      v131 = sub_180002760(a1);
                                      sub_1800036C0((__int64)&v135, (float *)&v132, &v131, &v131);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_33;
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
                                          v90 = sub_1800023C0(a1);
                                          if ( v90 != 0 )
                                          {
                                            qword_180117620 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v90);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v90);
                                          }
                                        }
                                        sub_1800C6900(&unk_180117510);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_33;
                                      }
                                      if ( v131 == 0
                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                             a1,
                                             v131,
                                             qword_180117620) != 0 )
                                      {
                                        goto LABEL_515;
                                      }
                                      v92 = qword_1801172E0;
                                      sub_1800267D0(v138, /*0x3fa*/ "cannot cast to ");
                                      sub_1800267D0(v117, /*0xb38*/ "java/lang/String");
                                      sub_180026770(&v135, v138, v117);
                                      v93 = v92 + 989;
                                      if ( (v135 & 1) != 0 )
                                        v94 = v137;
                                      else
                                        v94 = v136;
                                      sub_180002110(a1, v93, v94, 2);
                                      if ( (v135 & 1) != 0 )
                                      {
                                        sub_1800C0DC0(v137);
                                        if ( (v117[0] & 1) == 0 )
                                        {
LABEL_544:
                                          if ( (v138[0] & 1) == 0 )
                                            goto LABEL_546;
                                          goto LABEL_545;
                                        }
                                      }
                                      else if ( (v117[0] & 1) == 0 )
                                      {
                                        goto LABEL_544;
                                      }
                                      sub_1800C0DC0(v118);
                                      if ( (v138[0] & 1) != 0 )
LABEL_545:
                                        sub_1800C0DC0(v139);
LABEL_546:
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                      {
LABEL_515:
                                        v126 = v123;
                                        sub_1800036C0((__int64)&v135, (float *)&v132, &v126, &v126);
                                        if ( qword_180117638 != 0
                                          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                               a1,
                                               qword_180117638,
                                               0) == 0 )
                                        {
                                          goto LABEL_560;
                                        }
                                        sub_1800C68B0(&unk_180117528);
                                        if ( qword_180117638 == 0
                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                               a1,
                                               qword_180117638,
                                               0) != 0 )
                                        {
                                          v91 = sub_1800023C0(a1);
                                          if ( v91 != 0 )
                                          {
                                            qword_180117638 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v91);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v91);
                                          }
                                        }
                                        sub_1800C6900(&unk_180117528);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                        {
LABEL_560:
                                          if ( qword_180117718 != 0
                                            || (qword_180117718 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                    a1,
                                                                    qword_180117638,
                                                                    /*0x48b*/ "<init>",
                                                                    /*0xb9f*/ "(Ljava/lang/String;Ljava/lang/Throwable;)V",
                                                                    v111,
                                                                    v114),
                                                (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                                          {
                                            if ( v130 != 0 )
                                              sub_180026870(a1, v130, qword_180117638, qword_180117718, v131, v126);
                                            else
                                              sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x4ab*/ "INVOKESPECIAL Void npe", 2);
                                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0
                                              && (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                            {
                                              v95 = v140[0];
                                              if ( v140[0] != 0 )
                                              {
                                                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(
                                                  a1,
                                                  v140[0]);
                                                v138[0] = v95;
                                                sub_180026960(&v135, &v132, v138, v138);
                                              }
                                              else
                                              {
                                                sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x29a*/ "ATHROW npe", 2);
                                              }
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                            }
                                          }
                                        }
                                      }
LABEL_33:
                                      v17 = 0;
LABEL_34:
                                      v18 = (_QWORD *)v133;
                                      if ( (_QWORD)v133 != 0 )
                                      {
                                        do
                                        {
                                          v19 = (_QWORD *)*v18;
                                          sub_1800C0DC0(v18);
                                          v18 = v19;
                                        }
                                        while ( v19 != nullptr );
                                      }
                                      v20 = v132;
                                      *(_QWORD *)&v132 = 0;
                                      if ( v20 != 0 )
                                        sub_1800C0DC0(v20);
                                      return v17;
                                    }
                                  }
                                }
                              }
                              v63 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                              (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                              v140[0] = v63;
                              v138[0] = v63;
                              sub_180026960(&v135, &v132, v138, v138);
                              goto LABEL_168;
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
          v56 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
          (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
          v140[0] = v56;
          v138[0] = v56;
          sub_180026960(&v135, &v132, v138, v138);
          goto LABEL_168;
        }
      }
    }
  }
  v39 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
  (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
  v140[0] = v39;
  v138[0] = v39;
  sub_180026960(&v135, &v132, v138, v138);
  v40 = 0;
  goto LABEL_168;
}
