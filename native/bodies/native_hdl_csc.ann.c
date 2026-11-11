/* ===== chunk 1800A3FB0 .. 1800ABF5B ===== */
__int64 __fastcall sub_1800A3FB0(__int64 *a1, __int64 a2, __int64 a3)
{
  __int64 v6; // r15
  __int64 v7; // rdi
  __int64 v9; // rax
  __int64 v10; // r15
  __int64 v11; // rax
  __int64 v12; // r15
  __int64 v13; // r14
  __int64 v14; // rbx
  __int64 v15; // rbx
  __int64 v16; // rbx
  __int64 v17; // rbx
  __int64 v18; // rbx
  unsigned int v19; // r15d
  __int64 v20; // rbx
  __int64 v21; // rbx
  __int64 v22; // rbx
  __int64 v23; // rbx
  __int64 v24; // rbx
  __int64 v25; // r12
  __int64 v26; // r12
  __int64 v27; // r12
  __int64 v28; // r12
  _BYTE *v29; // r8
  __int64 v30; // r12
  __int64 v31; // r12
  __int64 v32; // r12
  _BYTE *v33; // r8
  __int64 v34; // r12
  __int64 v35; // r12
  __int64 v36; // r12
  __int64 v37; // r12
  __int64 v38; // r12
  __int64 v39; // r12
  __int64 v40; // r12
  __int64 v41; // r12
  __int64 v42; // r12
  _BYTE *v43; // r8
  __int64 v44; // r12
  __int64 v45; // r12
  __int64 v46; // r12
  __int64 v47; // r12
  _BYTE *v48; // r8
  __int64 v49; // r12
  __int64 v50; // r12
  __int64 v51; // r12
  __int64 v52; // r12
  __int64 v53; // rbx
  __int64 v54; // rbx
  __int64 v55; // rbx
  __int64 v56; // rbx
  char v57; // al
  __int64 v58; // rdx
  __int64 v59; // rbx
  __int64 v60; // rbx
  __int64 v61; // rbx
  __int64 v62; // rbx
  _BYTE *v63; // r8
  __int64 v64; // rbx
  __int64 v65; // r9
  __int64 v66; // rbx
  __int64 v67; // rbx
  __int64 v68; // rbx
  __int64 v69; // r8
  __int64 v70; // rbx
  __int64 v71; // r12
  __int64 v72; // rbx
  __int64 v73; // rbx
  __int64 v74; // rbx
  __int64 v75; // rbx
  __int64 v76; // r8
  __int64 v77; // rbx
  char v78; // al
  __int64 v79; // rbx
  char v80; // al
  __int64 v81; // rbx
  __int64 v82; // rbx
  __int64 v83; // rbx
  char v84; // al
  __int64 v85; // rbx
  __int64 v86; // rbx
  __int64 v87; // r8
  __int64 v88; // r12
  __int64 v89; // r8
  __int64 v90; // rax
  __int64 v91; // rbx
  __int64 v92; // rbx
  __int64 v93; // r8
  __int64 v94; // rbx
  __int64 v95; // rbx
  __int64 v96; // rax
  __int64 v97; // rbx
  __int64 v98; // [rsp+20h] [rbp-60h]
  __int64 v99; // [rsp+20h] [rbp-60h]
  __int64 v100; // [rsp+20h] [rbp-60h]
  __int64 v101; // [rsp+20h] [rbp-60h]
  __int64 v102; // [rsp+20h] [rbp-60h]
  __int64 v103; // [rsp+28h] [rbp-58h]
  __int64 v104; // [rsp+28h] [rbp-58h]
  __int64 v105; // [rsp+28h] [rbp-58h]
  int v106; // [rsp+A8h] [rbp+28h]
  _QWORD v107[3]; // [rsp+B8h] [rbp+38h] BYREF
  __int64 v108; // [rsp+D0h] [rbp+50h]
  _BYTE v109[16]; // [rsp+D8h] [rbp+58h] BYREF
  __int64 v110; // [rsp+E8h] [rbp+68h]
  __int64 v111; // [rsp+F0h] [rbp+70h] BYREF
  __int64 v112; // [rsp+F8h] [rbp+78h] BYREF
  __int64 v113; // [rsp+100h] [rbp+80h] BYREF
  __int64 v114; // [rsp+108h] [rbp+88h] BYREF
  __int64 v115; // [rsp+110h] [rbp+90h] BYREF
  __int64 v116; // [rsp+118h] [rbp+98h] BYREF
  __int64 v117; // [rsp+120h] [rbp+A0h] BYREF
  __int64 v118; // [rsp+128h] [rbp+A8h] BYREF
  __int64 v119; // [rsp+130h] [rbp+B0h] BYREF
  __int64 v120; // [rsp+138h] [rbp+B8h] BYREF
  __int64 v121; // [rsp+140h] [rbp+C0h] BYREF
  __int64 v122; // [rsp+148h] [rbp+C8h] BYREF
  _QWORD v123[4]; // [rsp+150h] [rbp+D0h] BYREF
  int v124; // [rsp+170h] [rbp+F0h]
  __int64 v125; // [rsp+180h] [rbp+100h] BYREF
  __int64 v126; // [rsp+188h] [rbp+108h] BYREF
  char v127; // [rsp+190h] [rbp+110h] BYREF
  _BYTE v128[15]; // [rsp+191h] [rbp+111h] BYREF
  _BYTE *v129; // [rsp+1A0h] [rbp+120h]
  __int64 v130[2]; // [rsp+1A8h] [rbp+128h] BYREF
  __int64 v131; // [rsp+1B8h] [rbp+138h]
  __int64 v132[8]; // [rsp+1C0h] [rbp+140h] BYREF

  v6 = sub_180002590();
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    return 0;
  v7 = sub_1800025D0((__int64)a1, v6);
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    return 0;
  if ( v7 == 0 )
  {
    (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 144))(a1, /*0x8*/ "classloader == null");
    return 0;
  }
  (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v6);
  sub_1800023C0((__int64)a1);
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    return 0;
  if ( qword_180117D30 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D30, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117B20);
    if ( qword_180117D30 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D30, 0) != 0 )
    {
      v9 = sub_1800023C0((__int64)a1);
      if ( v9 != 0 )
      {
        v10 = v9;
        qword_180117D30 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v9);
        (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v10);
      }
    }
    sub_1800C6900(&unk_180117B20);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      return 0;
  }
  if ( qword_180117D38 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D38, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117B28);
    if ( qword_180117D38 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D38, 0) != 0 )
    {
      v11 = sub_1800023C0((__int64)a1);
      if ( v11 != 0 )
      {
        v12 = v11;
        qword_180117D38 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v11);
        (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v12);
      }
    }
    sub_1800C6900(&unk_180117B28);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      return 0;
  }
  v132[0] = 0;
  v126 = 0;
  v125 = 0;
  v116 = 0;
  v117 = 0;
  v113 = 0;
  v120 = 0;
  v114 = 0;
  v118 = 0;
  v121 = 0;
  v119 = 0;
  v111 = 0;
  memset(v107, 0, sizeof(v107));
  v115 = 0;
  v108 = 0;
  v122 = 0;
  memset(v123, 0, sizeof(v123));
  v124 = 1065353216;
  v112 = a2;
  sub_1800036C0((__int64)&v127, (float *)v123, &v112, &v112);
  v116 = a3;
  sub_1800036C0((__int64)&v127, (float *)v123, &v116, &v116);
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  v132[0] = 0x38D7C9F35166LL;
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  v13 = v132[0];
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  if ( qword_180117D40 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D40, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117B30);
    if ( qword_180117D40 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D40, 0) != 0 )
    {
      v14 = sub_1800023C0((__int64)a1);
      if ( v14 != 0 )
      {
        qword_180117D40 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v14);
        (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v14);
      }
    }
    sub_1800C6900(&unk_180117B30);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
  if ( qword_180118300 == 0 )
  {
    qword_180118300 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 1152))(
                        a1,
                        qword_180117D40,
                        /*0xa5*/ "a",
                        /*0xa3e*/ "[Ljava/lang/String;");
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
  v132[0] = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1160))(a1, qword_180117D40);
  sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  v122 = v132[0];
  sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  v132[0] = v122;
  sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  LODWORD(v126) = 15;
  if ( v132[0] != 0 )
  {
    v132[0] = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64))(*a1 + 1384))(a1, v132[0], 15);
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  }
  else
  {
    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x41b*/ "AALOAD npe", 283);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  if ( qword_180117F00 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F00, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117CF0);
    if ( qword_180117F00 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F00, 0) != 0 )
    {
      v15 = sub_1800023C0((__int64)a1);
      if ( v15 != 0 )
      {
        qword_180117F00 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v15);
        (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v15);
      }
    }
    sub_1800C6900(&unk_180117CF0);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
  if ( qword_180118210 == 0 )
  {
    qword_180118210 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 904))(
                        a1,
                        qword_180117F00,
                        /*0xaac*/ "fsi",
                        /*0x6da*/ "(Ljava/lang/String;)[B");
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
  v132[0] = sub_180002760((__int64)a1);
  sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  v117 = v132[0];
  sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  v132[0] = v122;
  sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  LODWORD(v126) = 21;
  if ( v132[0] != 0 )
  {
    v132[0] = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64))(*a1 + 1384))(a1, v132[0], 21);
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  }
  else
  {
    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x41b*/ "AALOAD npe", 178);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  if ( qword_180117F00 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F00, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117CF0);
    if ( qword_180117F00 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F00, 0) != 0 )
    {
      v16 = sub_1800023C0((__int64)a1);
      if ( v16 != 0 )
      {
        qword_180117F00 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v16);
        (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v16);
      }
    }
    sub_1800C6900(&unk_180117CF0);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
  if ( qword_180118210 == 0 )
  {
    qword_180118210 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 904))(
                        a1,
                        qword_180117F00,
                        /*0xaac*/ "fsi",
                        /*0x6da*/ "(Ljava/lang/String;)[B");
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
  v132[0] = sub_180002760((__int64)a1);
  sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  v113 = v132[0];
  sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  if ( qword_180117D40 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D40, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117B30);
    if ( qword_180117D40 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D40, 0) != 0 )
    {
      v17 = sub_1800023C0((__int64)a1);
      if ( v17 != 0 )
      {
        qword_180117D40 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v17);
        (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v17);
      }
    }
    sub_1800C6900(&unk_180117B30);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
  if ( qword_180117F40 == 0 )
  {
    qword_180117F40 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 904))(
                        a1,
                        qword_180117D40,
                        /*0x2757*/ "guk",
                        /*0x275b*/ "()Z");
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
  LODWORD(v132[0]) = (unsigned __int8)sub_1800BE210(a1, qword_180117D40);
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0
    || (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
  {
    goto LABEL_77;
  }
  v126 = v122;
  sub_1800036C0((__int64)&v127, (float *)v123, &v126, &v126);
  LODWORD(v125) = 11;
  if ( v126 != 0 )
  {
    v126 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64))(*a1 + 1384))(a1, v126, 11);
    sub_1800036C0((__int64)&v127, (float *)v123, &v126, &v126);
  }
  else
  {
    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x41b*/ "AALOAD npe", 321);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  if ( qword_180117F00 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F00, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117CF0);
    if ( qword_180117F00 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F00, 0) != 0 )
    {
      v18 = sub_1800023C0((__int64)a1);
      if ( v18 != 0 )
      {
        qword_180117F00 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v18);
        (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v18);
      }
    }
    sub_1800C6900(&unk_180117CF0);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
  if ( qword_180118210 == 0 )
  {
    qword_180118210 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 904))(
                        a1,
                        qword_180117F00,
                        /*0xaac*/ "fsi",
                        /*0x6da*/ "(Ljava/lang/String;)[B");
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
  v126 = sub_180002760((__int64)a1);
  sub_1800036C0((__int64)&v127, (float *)v123, &v126, &v126);
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  v120 = v126;
  sub_1800036C0((__int64)&v127, (float *)v123, &v126, &v126);
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  v19 = v132[0];
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  v132[0] = v116;
  sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  v126 = v113;
  sub_1800036C0((__int64)&v127, (float *)v123, &v126, &v126);
  v125 = v120;
  sub_1800036C0((__int64)&v127, (float *)v123, &v125, &v125);
  if ( qword_180117F08 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F08, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117CF8);
    if ( qword_180117F08 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F08, 0) != 0 )
    {
      v20 = sub_1800023C0((__int64)a1);
      if ( v20 != 0 )
      {
        qword_180117F08 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v20);
        (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v20);
      }
    }
    sub_1800C6900(&unk_180117CF8);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
  if ( qword_180118218 == 0 )
  {
    qword_180118218 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 904))(
                        a1,
                        qword_180117F08,
                        /*0xc08*/ "atc",
                        /*0xbce*/ "(Ljava/lang/String;[B[B)Ljava/lang/String;");
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
  v103 = v125;
  v98 = v126;
  v132[0] = sub_180002760((__int64)a1);
  sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  v114 = v132[0];
  sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  v132[0] = v114;
  sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  if ( qword_180117F10 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F10, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117D00);
    if ( qword_180117F10 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F10, 0) != 0 )
    {
      v21 = sub_1800023C0((__int64)a1);
      if ( v21 != 0 )
      {
        qword_180117F10 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v21);
        (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v21);
      }
    }
    sub_1800C6900(&unk_180117D00);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
  if ( qword_180118220 == 0 )
  {
    qword_180118220 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64, __int64, __int64))(*a1 + 904))(
                        a1,
                        qword_180117F10,
                        /*0x304a*/ "parseString",
                        /*0x2b12*/ "(Ljava/lang/String;)Lcom/google/gson/JsonElement;",
                        v98,
                        v103);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
  v132[0] = sub_180002760((__int64)a1);
  sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  if ( qword_180117E08 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117E08, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117BF8);
    if ( qword_180117E08 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117E08, 0) != 0 )
    {
      v22 = sub_1800023C0((__int64)a1);
      if ( v22 != 0 )
      {
        qword_180117E08 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v22);
        (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v22);
      }
    }
    sub_1800C6900(&unk_180117BF8);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
  if ( qword_180118228 == 0 )
  {
    qword_180118228 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 264))(
                        a1,
                        qword_180117E08,
                        /*0x3056*/ "getAsJsonObject",
                        /*0x3066*/ "()Lcom/google/gson/JsonObject;");
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
  if ( v132[0] != 0 )
  {
    v132[0] = sub_180002790((__int64)a1);
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  }
  else
  {
    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 370);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  v118 = v132[0];
  sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  v132[0] = 0;
  v121 = 0;
  sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  v132[0] = 0;
  v119 = 0;
  sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  v132[0] = v118;
  sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  if ( qword_180117E00 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117E00, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117BF0);
    if ( qword_180117E00 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117E00, 0) != 0 )
    {
      v23 = sub_1800023C0((__int64)a1);
      if ( v23 != 0 )
      {
        qword_180117E00 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v23);
        (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v23);
      }
    }
    sub_1800C6900(&unk_180117BF0);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
  if ( qword_180118230 == 0 )
  {
    qword_180118230 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 264))(
                        a1,
                        qword_180117E00,
                        /*0x3085*/ "entrySet",
                        /*0x308e*/ "()Ljava/util/Set;");
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
  if ( v132[0] != 0 )
  {
    v132[0] = sub_180002790((__int64)a1);
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  }
  else
  {
    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 118);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  if ( qword_180117F18 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F18, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117D08);
    if ( qword_180117F18 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F18, 0) != 0 )
    {
      v24 = sub_1800023C0((__int64)a1);
      if ( v24 != 0 )
      {
        qword_180117F18 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v24);
        (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v24);
      }
    }
    sub_1800C6900(&unk_180117D08);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
  if ( qword_180118238 == 0 )
  {
    qword_180118238 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 264))(
                        a1,
                        qword_180117F18,
                        /*0x2c40*/ "iterator",
                        /*0x2c49*/ "()Ljava/util/Iterator;");
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
  if ( v132[0] != 0 )
  {
    v132[0] = sub_180002790((__int64)a1);
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  }
  else
  {
    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x452*/ "INVOKEINTERFACE Object npe", 118);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  v111 = v132[0];
  sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
  do
  {
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
    sub_180026DB0(v123, &v112);
    sub_180026DB0(v123, &v116);
    sub_180026DB0(v123, &v117);
    sub_180026DB0(v123, &v113);
    sub_180026DB0(v123, &v120);
    sub_180026DB0(v123, &v114);
    sub_180026DB0(v123, &v118);
    sub_180026DB0(v123, &v121);
    sub_180026DB0(v123, &v119);
    sub_180026DB0(v123, &v111);
    sub_180026DB0(v123, &v122);
    sub_180002660(a1, v123);
    v132[0] = v111;
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    if ( qword_180117E50 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117E50, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117C40);
      if ( qword_180117E50 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117E50, 0) != 0 )
      {
        v25 = sub_1800023C0((__int64)a1);
        if ( v25 != 0 )
        {
          qword_180117E50 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v25);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v25);
        }
      }
      sub_1800C6900(&unk_180117C40);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_77;
    }
    if ( qword_1801180B0 == 0 )
    {
      qword_1801180B0 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 264))(
                          a1,
                          qword_180117E50,
                          /*0x2c60*/ "hasNext",
                          /*0x275b*/ "()Z");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_77;
    }
    if ( v132[0] != 0 )
      LODWORD(v132[0]) = (unsigned __int8)sub_1800BE240(a1, v132[0], qword_1801180B0);
    else
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x2c68*/ "INVOKEINTERFACE Boolean npe", 118);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
    if ( LODWORD(v132[0]) == 0 )
      break;
    v132[0] = v111;
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    if ( qword_180117E50 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117E50, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117C40);
      if ( qword_180117E50 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117E50, 0) != 0 )
      {
        v26 = sub_1800023C0((__int64)a1);
        if ( v26 != 0 )
        {
          qword_180117E50 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v26);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v26);
        }
      }
      sub_1800C6900(&unk_180117C40);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_77;
    }
    if ( qword_1801180B8 == 0 )
    {
      qword_1801180B8 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 264))(
                          a1,
                          qword_180117E50,
                          /*0x2c84*/ "next",
                          /*0x2c89*/ "()Ljava/lang/Object;");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_77;
    }
    if ( v132[0] != 0 )
    {
      v132[0] = sub_180002790((__int64)a1);
      sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    }
    else
    {
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x452*/ "INVOKEINTERFACE Object npe", 118);
    }
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
    if ( qword_180117F20 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F20, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117D10);
      if ( qword_180117F20 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F20, 0) != 0 )
      {
        v27 = sub_1800023C0((__int64)a1);
        if ( v27 != 0 )
        {
          qword_180117F20 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v27);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v27);
        }
      }
      sub_1800C6900(&unk_180117D10);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_77;
    }
    if ( v132[0] != 0
      && (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, __int64))(*a1 + 256))(a1, v132[0], qword_180117F20) == 0 )
    {
      v28 = qword_1801178A0;
      sub_1800267D0(v130, /*0x3fa*/ "cannot cast to ");
      sub_1800267D0(v109, /*0x30a0*/ "java/util/Map$Entry");
      sub_180026770(&v127, v130, v109);
      v29 = v128;
      if ( (v127 & 1) != 0 )
        v29 = v129;
      sub_180002110(a1, v28 + 989, v29, 118);
      if ( (v127 & 1) != 0 )
      {
        sub_1800C0DC0(v129);
        if ( (v109[0] & 1) == 0 )
        {
LABEL_204:
          if ( (v130[0] & 1) == 0 )
            goto LABEL_206;
          goto LABEL_205;
        }
      }
      else if ( (v109[0] & 1) == 0 )
      {
        goto LABEL_204;
      }
      sub_1800C0DC0(v110);
      if ( (v130[0] & 1) == 0 )
      {
LABEL_206:
        if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
          goto LABEL_77;
        goto LABEL_207;
      }
LABEL_205:
      sub_1800C0DC0(v131);
      goto LABEL_206;
    }
LABEL_207:
    v107[0] = v132[0];
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_394;
    v132[0] = v107[0];
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    if ( qword_180117F20 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F20, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117D10);
      if ( qword_180117F20 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F20, 0) != 0 )
      {
        v30 = sub_1800023C0((__int64)a1);
        if ( v30 != 0 )
        {
          qword_180117F20 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v30);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v30);
        }
      }
      sub_1800C6900(&unk_180117D10);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_394;
    }
    if ( qword_180118240 == 0 )
    {
      qword_180118240 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 264))(
                          a1,
                          qword_180117F20,
                          /*0x30b4*/ "getKey",
                          /*0x2c89*/ "()Ljava/lang/Object;");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_394;
    }
    if ( v132[0] != 0 )
    {
      v132[0] = sub_180002790((__int64)a1);
      sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    }
    else
    {
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x452*/ "INVOKEINTERFACE Object npe", 34);
    }
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_394;
    if ( qword_180117E70 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117E70, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117C60);
      if ( qword_180117E70 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117E70, 0) != 0 )
      {
        v31 = sub_1800023C0((__int64)a1);
        if ( v31 != 0 )
        {
          qword_180117E70 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v31);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v31);
        }
      }
      sub_1800C6900(&unk_180117C60);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_394;
    }
    if ( v132[0] != 0
      && (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, __int64))(*a1 + 256))(a1, v132[0], qword_180117E70) == 0 )
    {
      v32 = qword_1801178A0;
      sub_1800267D0(v130, /*0x3fa*/ "cannot cast to ");
      sub_1800267D0(v109, /*0xb38*/ "java/lang/String");
      sub_180026770(&v127, v130, v109);
      v33 = v128;
      if ( (v127 & 1) != 0 )
        v33 = v129;
      sub_180002110(a1, v32 + 989, v33, 34);
      if ( (v127 & 1) != 0 )
      {
        sub_1800C0DC0(v129);
        if ( (v109[0] & 1) == 0 )
        {
LABEL_239:
          if ( (v130[0] & 1) == 0 )
            goto LABEL_241;
          goto LABEL_240;
        }
      }
      else if ( (v109[0] & 1) == 0 )
      {
        goto LABEL_239;
      }
      sub_1800C0DC0(v110);
      if ( (v130[0] & 1) == 0 )
      {
LABEL_241:
        if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
          goto LABEL_394;
        goto LABEL_246;
      }
LABEL_240:
      sub_1800C0DC0(v131);
      goto LABEL_241;
    }
LABEL_246:
    v126 = v117;
    sub_1800036C0((__int64)&v127, (float *)v123, &v126, &v126);
    v125 = v120;
    sub_1800036C0((__int64)&v127, (float *)v123, &v125, &v125);
    if ( qword_180117F08 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F08, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117CF8);
      if ( qword_180117F08 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F08, 0) != 0 )
      {
        v34 = sub_1800023C0((__int64)a1);
        if ( v34 != 0 )
        {
          qword_180117F08 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v34);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v34);
        }
      }
      sub_1800C6900(&unk_180117CF8);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_394;
    }
    if ( qword_180118218 == 0 )
    {
      qword_180118218 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 904))(
                          a1,
                          qword_180117F08,
                          /*0xc08*/ "atc",
                          /*0xbce*/ "(Ljava/lang/String;[B[B)Ljava/lang/String;");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_394;
    }
    v104 = v125;
    v99 = v126;
    v132[0] = sub_180002760((__int64)a1);
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_394;
    v115 = v132[0];
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_289;
    if ( qword_180117D40 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D40, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117B30);
      if ( qword_180117D40 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D40, 0) != 0 )
      {
        v35 = sub_1800023C0((__int64)a1);
        if ( v35 != 0 )
        {
          qword_180117D40 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v35);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v35);
        }
      }
      sub_1800C6900(&unk_180117B30);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_289;
    }
    if ( qword_180118300 == 0 )
    {
      qword_180118300 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64, __int64, __int64))(*a1 + 1152))(
                          a1,
                          qword_180117D40,
                          /*0xa5*/ "a",
                          /*0xa3e*/ "[Ljava/lang/String;",
                          v99,
                          v104);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_289;
    }
    v132[0] = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1160))(a1, qword_180117D40);
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_289;
    LODWORD(v126) = 10;
    if ( v132[0] != 0 )
    {
      v132[0] = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64))(*a1 + 1384))(a1, v132[0], 10);
      sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    }
    else
    {
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x41b*/ "AALOAD npe", 142);
    }
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_289;
    LODWORD(v126) = v19;
    if ( v19 == 0 )
      goto LABEL_425;
    v126 = v115;
    sub_1800036C0((__int64)&v127, (float *)v123, &v126, &v126);
    if ( qword_180117E70 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117E70, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117C60);
      if ( qword_180117E70 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117E70, 0) != 0 )
      {
        v36 = sub_1800023C0((__int64)a1);
        if ( v36 != 0 )
        {
          qword_180117E70 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v36);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v36);
        }
      }
      sub_1800C6900(&unk_180117C60);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_289;
    }
    if ( qword_1801180E0 == 0 )
    {
      qword_1801180E0 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 264))(
                          a1,
                          qword_180117E70,
                          /*0x2cf6*/ "equals",
                          /*0x2cfd*/ "(Ljava/lang/Object;)Z");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_289;
    }
    if ( v132[0] != 0 )
      LODWORD(v132[0]) = (unsigned __int8)sub_1800BE240(a1, v132[0], qword_1801180E0);
    else
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x276f*/ "INVOKEVIRTUAL Boolean npe", 142);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    {
LABEL_289:
      v37 = (*(__int64 (__fastcall **)(__int64 *))(*a1 + 120))(a1);
      (*(void (__fastcall **)(__int64 *))(*a1 + 136))(a1);
      v132[0] = v37;
      v130[0] = v37;
      sub_180026960(&v127, v123, v130, v130);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, __int64))(*a1 + 256))(a1, v132[0], qword_180117D30) == 0 )
        goto LABEL_787;
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_394;
      sub_180026DB0(v123, v132);
      sub_180026DB0(v123, &v112);
      sub_180026DB0(v123, &v116);
      sub_180026DB0(v123, &v117);
      sub_180026DB0(v123, &v113);
      sub_180026DB0(v123, &v120);
      sub_180026DB0(v123, &v114);
      sub_180026DB0(v123, &v118);
      sub_180026DB0(v123, &v121);
      sub_180026DB0(v123, &v119);
      sub_180026DB0(v123, &v111);
      sub_180026DB0(v123, v107);
      sub_180026DB0(v123, &v115);
      sub_180026DB0(v123, &v122);
      sub_180002660(a1, v123);
      if ( qword_180117D40 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D40, 0) != 0 )
      {
        sub_1800C68B0(&unk_180117B30);
        if ( qword_180117D40 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D40, 0) != 0 )
        {
          v38 = sub_1800023C0((__int64)a1);
          if ( v38 != 0 )
          {
            qword_180117D40 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v38);
            (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v38);
          }
        }
        sub_1800C6900(&unk_180117B30);
        if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
          goto LABEL_394;
      }
      if ( qword_1801180F0 == 0 )
      {
        qword_1801180F0 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 904))(
                            a1,
                            qword_180117D40,
                            /*0xa5*/ "a",
                            /*0x2d17*/ "(Ljava/lang/Throwable;)Ljava/lang/Throwable;");
        if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
          goto LABEL_394;
      }
      v132[0] = sub_180002760((__int64)a1);
      sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_394;
      v39 = v132[0];
      if ( v132[0] != 0 )
      {
        (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 104))(a1, v132[0]);
        v130[0] = v39;
        sub_180026960(&v127, v123, v130, v130);
      }
      else
      {
        sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x29a*/ "ATHROW npe", 142);
      }
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_394;
    }
    else
    {
      if ( LODWORD(v132[0]) == 0 )
        goto LABEL_401;
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_394;
    }
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_394;
    sub_180026DB0(v123, &v112);
    sub_180026DB0(v123, &v116);
    sub_180026DB0(v123, &v117);
    sub_180026DB0(v123, &v113);
    sub_180026DB0(v123, &v120);
    sub_180026DB0(v123, &v114);
    sub_180026DB0(v123, &v118);
    sub_180026DB0(v123, &v121);
    sub_180026DB0(v123, &v119);
    sub_180026DB0(v123, &v111);
    sub_180026DB0(v123, v107);
    sub_180026DB0(v123, &v115);
    sub_180026DB0(v123, &v122);
    sub_180002660(a1, v123);
    v132[0] = v107[0];
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    if ( qword_180117F20 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F20, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117D10);
      if ( qword_180117F20 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F20, 0) != 0 )
      {
        v40 = sub_1800023C0((__int64)a1);
        if ( v40 != 0 )
        {
          qword_180117F20 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v40);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v40);
        }
      }
      sub_1800C6900(&unk_180117D10);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_394;
    }
    if ( qword_180118248 == 0 )
    {
      qword_180118248 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 264))(
                          a1,
                          qword_180117F20,
                          /*0x30bb*/ "getValue",
                          /*0x2c89*/ "()Ljava/lang/Object;");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_394;
    }
    if ( v132[0] != 0 )
    {
      v132[0] = sub_180002790((__int64)a1);
      sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    }
    else
    {
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x452*/ "INVOKEINTERFACE Object npe", 330);
    }
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_394;
    if ( qword_180117E08 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117E08, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117BF8);
      if ( qword_180117E08 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117E08, 0) != 0 )
      {
        v41 = sub_1800023C0((__int64)a1);
        if ( v41 != 0 )
        {
          qword_180117E08 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v41);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v41);
        }
      }
      sub_1800C6900(&unk_180117BF8);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_394;
    }
    if ( v132[0] != 0
      && (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, __int64))(*a1 + 256))(a1, v132[0], qword_180117E08) == 0 )
    {
      v42 = qword_1801178A0;
      sub_1800267D0(v130, /*0x3fa*/ "cannot cast to ");
      sub_1800267D0(v109, /*0x30c4*/ "com/google/gson/JsonElement");
      sub_180026770(&v127, v130, v109);
      v43 = v128;
      if ( (v127 & 1) != 0 )
        v43 = v129;
      sub_180002110(a1, v42 + 989, v43, 330);
      if ( (v127 & 1) != 0 )
      {
        sub_1800C0DC0(v129);
        if ( (v109[0] & 1) == 0 )
        {
LABEL_340:
          if ( (v130[0] & 1) == 0 )
            goto LABEL_342;
          goto LABEL_341;
        }
      }
      else if ( (v109[0] & 1) == 0 )
      {
        goto LABEL_340;
      }
      sub_1800C0DC0(v110);
      if ( (v130[0] & 1) == 0 )
      {
LABEL_342:
        if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
          goto LABEL_394;
        goto LABEL_347;
      }
LABEL_341:
      sub_1800C0DC0(v131);
      goto LABEL_342;
    }
LABEL_347:
    if ( qword_180117E08 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117E08, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117BF8);
      if ( qword_180117E08 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117E08, 0) != 0 )
      {
        v44 = sub_1800023C0((__int64)a1);
        if ( v44 != 0 )
        {
          qword_180117E08 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v44);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v44);
        }
      }
      sub_1800C6900(&unk_180117BF8);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_394;
    }
    if ( qword_180118058 == 0 )
    {
      qword_180118058 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 264))(
                          a1,
                          qword_180117E08,
                          /*0x2b44*/ "getAsString",
                          /*0xc3b*/ "()Ljava/lang/String;");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_394;
    }
    if ( v132[0] != 0 )
    {
      v132[0] = sub_180002790((__int64)a1);
      sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    }
    else
    {
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 330);
    }
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_394;
    v121 = v132[0];
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_394;
    v132[0] = v107[0];
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    if ( qword_180117F20 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F20, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117D10);
      if ( qword_180117F20 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F20, 0) != 0 )
      {
        v45 = sub_1800023C0((__int64)a1);
        if ( v45 != 0 )
        {
          qword_180117F20 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v45);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v45);
        }
      }
      sub_1800C6900(&unk_180117D10);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_394;
    }
    if ( qword_180118240 == 0 )
    {
      qword_180118240 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 264))(
                          a1,
                          qword_180117F20,
                          /*0x30b4*/ "getKey",
                          /*0x2c89*/ "()Ljava/lang/Object;");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_394;
    }
    if ( v132[0] != 0 )
    {
      v132[0] = sub_180002790((__int64)a1);
      sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    }
    else
    {
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x452*/ "INVOKEINTERFACE Object npe", 38);
    }
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_394;
    if ( qword_180117E70 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117E70, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117C60);
      if ( qword_180117E70 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117E70, 0) != 0 )
      {
        v46 = sub_1800023C0((__int64)a1);
        if ( v46 != 0 )
        {
          qword_180117E70 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v46);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v46);
        }
      }
      sub_1800C6900(&unk_180117C60);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_394;
    }
    if ( v132[0] == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, __int64))(*a1 + 256))(a1, v132[0], qword_180117E70) != 0 )
    {
LABEL_399:
      v119 = v132[0];
      sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
      {
        LODWORD(v132[0]) = v19;
        if ( v19 != 0 )
          break;
LABEL_401:
        if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
        {
          sub_180026DB0(v123, &v112);
          sub_180026DB0(v123, &v116);
          sub_180026DB0(v123, &v117);
          sub_180026DB0(v123, &v113);
          sub_180026DB0(v123, &v120);
          sub_180026DB0(v123, &v114);
          sub_180026DB0(v123, &v118);
          sub_180026DB0(v123, &v121);
          sub_180026DB0(v123, &v119);
          sub_180026DB0(v123, &v111);
          sub_180026DB0(v123, v107);
          sub_180026DB0(v123, &v115);
          sub_180026DB0(v123, &v122);
          sub_180002660(a1, v123);
          goto LABEL_421;
        }
      }
      v50 = (*(__int64 (__fastcall **)(__int64 *))(*a1 + 120))(a1);
      (*(void (__fastcall **)(__int64 *))(*a1 + 136))(a1);
      v132[0] = v50;
      v130[0] = v50;
      sub_180026960(&v127, v123, v130, v130);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, __int64))(*a1 + 256))(a1, v132[0], qword_180117D30) == 0 )
        goto LABEL_787;
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_77;
      sub_180026DB0(v123, v132);
      sub_180026DB0(v123, &v112);
      sub_180026DB0(v123, &v116);
      sub_180026DB0(v123, &v117);
      sub_180026DB0(v123, &v113);
      sub_180026DB0(v123, &v120);
      sub_180026DB0(v123, &v114);
      sub_180026DB0(v123, &v118);
      sub_180026DB0(v123, &v121);
      sub_180026DB0(v123, &v119);
      sub_180026DB0(v123, &v111);
      sub_180026DB0(v123, v107);
      sub_180026DB0(v123, &v115);
      sub_180026DB0(v123, &v122);
      sub_180002660(a1, v123);
      if ( qword_180117D40 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D40, 0) != 0 )
      {
        sub_1800C68B0(&unk_180117B30);
        if ( qword_180117D40 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D40, 0) != 0 )
        {
          v51 = sub_1800023C0((__int64)a1);
          if ( v51 != 0 )
          {
            qword_180117D40 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v51);
            (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v51);
          }
        }
        sub_1800C6900(&unk_180117B30);
        if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
          goto LABEL_77;
      }
      if ( qword_1801180F0 == 0 )
      {
        qword_1801180F0 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 904))(
                            a1,
                            qword_180117D40,
                            /*0xa5*/ "a",
                            /*0x2d17*/ "(Ljava/lang/Throwable;)Ljava/lang/Throwable;");
        if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
          goto LABEL_77;
      }
      v132[0] = sub_180002760((__int64)a1);
      sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_77;
      v52 = v132[0];
      if ( v132[0] != 0 )
      {
        (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 104))(a1, v132[0]);
        v130[0] = v52;
        sub_180026960(&v127, v123, v130, v130);
      }
      else
      {
        sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x29a*/ "ATHROW npe", 29);
      }
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_77;
      goto LABEL_419;
    }
    v47 = qword_1801178A0;
    sub_1800267D0(v130, /*0x3fa*/ "cannot cast to ");
    sub_1800267D0(v109, /*0xb38*/ "java/lang/String");
    sub_180026770(&v127, v130, v109);
    v48 = v128;
    if ( (v127 & 1) != 0 )
      v48 = v129;
    sub_180002110(a1, v47 + 989, v48, 38);
    if ( (v127 & 1) != 0 )
    {
      sub_1800C0DC0(v129);
      if ( (v109[0] & 1) == 0 )
      {
LABEL_391:
        if ( (v130[0] & 1) == 0 )
          goto LABEL_393;
LABEL_392:
        sub_1800C0DC0(v131);
        goto LABEL_393;
      }
    }
    else if ( (v109[0] & 1) == 0 )
    {
      goto LABEL_391;
    }
    sub_1800C0DC0(v110);
    if ( (v130[0] & 1) != 0 )
      goto LABEL_392;
LABEL_393:
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
      goto LABEL_399;
LABEL_394:
    v49 = (*(__int64 (__fastcall **)(__int64 *))(*a1 + 120))(a1);
    (*(void (__fastcall **)(__int64 *))(*a1 + 136))(a1);
    v132[0] = v49;
    v130[0] = v49;
    sub_180026960(&v127, v123, v130, v130);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, __int64))(*a1 + 256))(a1, v132[0], qword_180117D30) == 0 )
      goto LABEL_787;
LABEL_419:
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
    sub_180026DB0(v123, v132);
    sub_180026DB0(v123, &v112);
    sub_180026DB0(v123, &v116);
    sub_180026DB0(v123, &v117);
    sub_180026DB0(v123, &v113);
    sub_180026DB0(v123, &v120);
    sub_180026DB0(v123, &v114);
    sub_180026DB0(v123, &v118);
    sub_180026DB0(v123, &v121);
    sub_180026DB0(v123, &v119);
    sub_180026DB0(v123, &v111);
    sub_180026DB0(v123, v107);
    sub_180026DB0(v123, &v122);
    sub_180002660(a1, v123);
    v115 = v132[0];
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
LABEL_421:
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_77;
    sub_180026DB0(v123, &v112);
    sub_180026DB0(v123, &v116);
    sub_180026DB0(v123, &v117);
    sub_180026DB0(v123, &v113);
    sub_180026DB0(v123, &v120);
    sub_180026DB0(v123, &v114);
    sub_180026DB0(v123, &v118);
    sub_180026DB0(v123, &v121);
    sub_180026DB0(v123, &v119);
    sub_180026DB0(v123, &v111);
    sub_180026DB0(v123, v107);
    sub_180026DB0(v123, &v115);
    sub_180026DB0(v123, &v122);
    sub_180002660(a1, v123);
    LODWORD(v132[0]) = v19;
  }
  while ( v19 != 0 );
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  sub_180026DB0(v123, &v112);
  sub_180026DB0(v123, &v116);
  sub_180026DB0(v123, &v117);
  sub_180026DB0(v123, &v113);
  sub_180026DB0(v123, &v120);
  sub_180026DB0(v123, &v114);
  sub_180026DB0(v123, &v118);
  sub_180026DB0(v123, &v121);
  sub_180026DB0(v123, &v119);
  sub_180026DB0(v123, &v111);
  sub_180026DB0(v123, &v122);
  sub_180002660(a1, v123);
  v132[0] = v121;
  sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
LABEL_425:
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
    goto LABEL_77;
  sub_180026DB0(v123, v132);
  sub_180026DB0(v123, &v112);
  sub_180026DB0(v123, &v116);
  sub_180026DB0(v123, &v117);
  sub_180026DB0(v123, &v113);
  sub_180026DB0(v123, &v120);
  sub_180026DB0(v123, &v114);
  sub_180026DB0(v123, &v118);
  sub_180026DB0(v123, &v121);
  sub_180026DB0(v123, &v119);
  sub_180026DB0(v123, &v111);
  sub_180026DB0(v123, &v122);
  sub_180002660(a1, v123);
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, v132[0], 0) != 0 )
  {
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_692;
    if ( qword_180117DD0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DD0, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117BC0);
      if ( qword_180117DD0 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DD0, 0) != 0 )
      {
        v53 = sub_1800023C0((__int64)a1);
        if ( v53 != 0 )
        {
          qword_180117DD0 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v53);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v53);
        }
      }
      sub_1800C6900(&unk_180117BC0);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    v132[0] = qword_180117DD0;
    if ( qword_180117D40 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D40, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117B30);
      if ( qword_180117D40 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D40, 0) != 0 )
      {
        v54 = sub_1800023C0((__int64)a1);
        if ( v54 != 0 )
        {
          qword_180117D40 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v54);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v54);
        }
      }
      sub_1800C6900(&unk_180117B30);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( qword_180118300 == 0 )
    {
      qword_180118300 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 1152))(
                          a1,
                          qword_180117D40,
                          /*0xa5*/ "a",
                          /*0xa3e*/ "[Ljava/lang/String;");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    v126 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1160))(a1, qword_180117D40);
    sub_1800036C0((__int64)&v127, (float *)v123, &v126, &v126);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_692;
    v122 = v126;
    sub_1800036C0((__int64)&v127, (float *)v123, &v126, &v126);
    v126 = v122;
    sub_1800036C0((__int64)&v127, (float *)v123, &v126, &v126);
    LODWORD(v125) = 5;
    if ( v126 != 0 )
    {
      v126 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64))(*a1 + 1384))(a1, v126, 5);
      sub_1800036C0((__int64)&v127, (float *)v123, &v126, &v126);
    }
    else
    {
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x41b*/ "AALOAD npe", 257);
    }
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_692;
    if ( qword_180117DD8 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DD8, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117BC8);
      if ( qword_180117DD8 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DD8, 0) != 0 )
      {
        v55 = sub_1800023C0((__int64)a1);
        if ( v55 != 0 )
        {
          qword_180117DD8 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v55);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v55);
        }
      }
      sub_1800C6900(&unk_180117BC8);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( qword_180117FE0 == 0 )
    {
      qword_180117FE0 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 264))(
                          a1,
                          qword_180117DD8,
                          /*0x2963*/ "getDeclaredField",
                          /*0x2974*/ "(Ljava/lang/String;)Ljava/lang/reflect/Field;");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( v132[0] != 0 )
    {
      v132[0] = sub_180002790((__int64)a1);
      sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    }
    else
    {
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 257);
    }
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_692;
    v111 = v132[0];
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_692;
    v132[0] = v111;
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    LODWORD(v126) = 1;
    if ( qword_180117DE0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DE0, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117BD0);
      if ( qword_180117DE0 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DE0, 0) != 0 )
      {
        v56 = sub_1800023C0((__int64)a1);
        if ( v56 != 0 )
        {
          qword_180117DE0 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v56);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v56);
        }
      }
      sub_1800C6900(&unk_180117BD0);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( qword_180117FE8 == 0 )
    {
      qword_180117FE8 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 264))(
                          a1,
                          qword_180117DE0,
                          /*0x29a2*/ "setAccessible",
                          /*0x29b0*/ "(Z)V");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( v132[0] != 0 )
      sub_1800027F0(a1, v132[0], qword_180117FE8, (unsigned int)v126);
    else
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x65b*/ "INVOKEVIRTUAL Void npe", 153);
    v57 = (*(__int64 (__fastcall **)(__int64 *))(*a1 + 1824))(a1);
    v58 = *a1;
    if ( v57 != 0 )
    {
LABEL_697:
      v85 = (*(__int64 (__fastcall **)(__int64 *))(v58 + 120))(a1);
      (*(void (__fastcall **)(__int64 *))(*a1 + 136))(a1);
      v132[0] = v85;
      v130[0] = v85;
      sub_180026960(&v127, v123, v130, v130);
LABEL_698:
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, __int64))(*a1 + 256))(a1, v132[0], qword_180117D38) == 0 )
LABEL_787:
        JUMPOUT(0x1800B7034LL);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
      {
        sub_180026DB0(v123, v132);
        sub_180026DB0(v123, &v112);
        sub_180026DB0(v123, &v116);
        sub_180026DB0(v123, &v117);
        sub_180026DB0(v123, &v113);
        sub_180026DB0(v123, &v120);
        sub_180026DB0(v123, &v114);
        sub_180026DB0(v123, &v118);
        sub_180026DB0(v123, &v121);
        sub_180026DB0(v123, &v119);
        sub_180026DB0(v123, &v111);
        sub_180026DB0(v123, &v122);
        sub_180002660(a1, v123);
        v111 = v132[0];
        sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
        LODWORD(v132[0]) = 2680;
        v126 = v13 ^ 0x1CE8D55A341B32ELL;
        if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
        {
          if ( qword_180117D40 != 0
            && (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D40, 0) == 0 )
          {
            goto LABEL_708;
          }
          sub_1800C68B0(&unk_180117B30);
          if ( qword_180117D40 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D40, 0) != 0 )
          {
            v86 = sub_1800023C0((__int64)a1);
            if ( v86 != 0 )
            {
              qword_180117D40 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v86);
              (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v86);
            }
          }
          sub_1800C6900(&unk_180117B30);
          if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
          {
LABEL_708:
            v87 = qword_180118008;
            if ( qword_180118008 == 0 )
            {
              qword_180118008 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 904))(
                                  a1,
                                  qword_180117D40,
                                  /*0xa5*/ "a",
                                  /*0x2a47*/ "(IJ)J");
              if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
                goto LABEL_77;
              v87 = qword_180118008;
            }
            v132[0] = sub_1800BE2A0(a1, qword_180117D40, v87, LODWORD(v132[0]), v126);
            if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
            {
              v107[0] = v132[0];
              while ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
              {
                sub_180026DB0(v123, &v112);
                sub_180026DB0(v123, &v116);
                sub_180026DB0(v123, &v117);
                sub_180026DB0(v123, &v113);
                sub_180026DB0(v123, &v120);
                sub_180026DB0(v123, &v114);
                sub_180026DB0(v123, &v118);
                sub_180026DB0(v123, &v121);
                sub_180026DB0(v123, &v119);
                sub_180026DB0(v123, &v111);
                sub_180026DB0(v123, &v122);
                sub_180002660(a1, v123);
                v132[0] = v107[0];
                LODWORD(v125) = 15559;
                if ( qword_180117D40 == 0
                  || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D40, 0) != 0 )
                {
                  sub_1800C68B0(&unk_180117B30);
                  if ( qword_180117D40 == 0
                    || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(
                         a1,
                         qword_180117D40,
                         0) != 0 )
                  {
                    v88 = sub_1800023C0((__int64)a1);
                    if ( v88 != 0 )
                    {
                      qword_180117D40 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v88);
                      (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v88);
                    }
                  }
                  sub_1800C6900(&unk_180117B30);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
                    break;
                }
                v89 = qword_180118008;
                if ( qword_180118008 == 0 )
                {
                  qword_180118008 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 904))(
                                      a1,
                                      qword_180117D40,
                                      /*0xa5*/ "a",
                                      /*0x2a47*/ "(IJ)J");
                  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
                    goto LABEL_77;
                  v89 = qword_180118008;
                }
                v125 = sub_1800BE2A0(a1, qword_180117D40, v89, (unsigned int)v125, v13 ^ 0x766D274C80DC059ALL);
                if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
                  break;
                v90 = v132[0];
                LODWORD(v132[0]) = (char)((v132[0] > v125) - (v132[0] < v125));
                if ( v90 >= v125 )
                  goto LABEL_731;
                if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
                  break;
                v125 = 1;
                v132[0] = --v107[0];
                if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
                  break;
                v132[0] = v107[0] + 1LL;
                v125 = v19;
                if ( v19 == 0 )
                  goto LABEL_753;
                ++v107[0];
                LODWORD(v132[0]) = v19;
              }
            }
          }
        }
      }
      goto LABEL_77;
    }
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(v58 + 1824))(a1) != 0 )
      goto LABEL_692;
    v132[0] = v111;
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    v126 = 0;
    if ( qword_180117DE0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DE0, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117BD0);
      if ( qword_180117DE0 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DE0, 0) != 0 )
      {
        v59 = sub_1800023C0((__int64)a1);
        if ( v59 != 0 )
        {
          qword_180117DE0 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v59);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v59);
        }
      }
      sub_1800C6900(&unk_180117BD0);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( qword_180117FF0 == 0 )
    {
      qword_180117FF0 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 264))(
                          a1,
                          qword_180117DE0,
                          /*0x29b5*/ "get",
                          /*0x29b9*/ "(Ljava/lang/Object;)Ljava/lang/Object;");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( v132[0] != 0 )
    {
      v132[0] = sub_180002790((__int64)a1);
      sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    }
    else
    {
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 308);
    }
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_692;
    if ( qword_180117DE8 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DE8, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117BD8);
      if ( qword_180117DE8 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DE8, 0) != 0 )
      {
        v60 = sub_1800023C0((__int64)a1);
        if ( v60 != 0 )
        {
          qword_180117DE8 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v60);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v60);
        }
      }
      sub_1800C6900(&unk_180117BD8);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( v132[0] != 0
      && (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, __int64))(*a1 + 256))(a1, v132[0], qword_180117DE8) == 0 )
    {
      v61 = qword_1801178A0;
      sub_1800267D0(v130, /*0x3fa*/ "cannot cast to ");
      sub_1800267D0(v109, /*0x29e0*/ "sun/misc/Unsafe");
      sub_180026770(&v127, v130, v109);
      v62 = v61 + 989;
      if ( (v127 & 1) != 0 )
        v63 = v129;
      else
        v63 = v128;
      sub_180002110(a1, v62, v63, 308);
      if ( (v127 & 1) == 0 )
      {
        if ( (v109[0] & 1) == 0 )
          goto LABEL_513;
LABEL_518:
        sub_1800C0DC0(v110);
        if ( (v130[0] & 1) == 0 )
          goto LABEL_515;
LABEL_514:
        sub_1800C0DC0(v131);
        goto LABEL_515;
      }
      sub_1800C0DC0(v129);
      if ( (v109[0] & 1) != 0 )
        goto LABEL_518;
LABEL_513:
      if ( (v130[0] & 1) != 0 )
        goto LABEL_514;
LABEL_515:
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    v107[0] = v132[0];
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_692;
    if ( qword_180117DF0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DF0, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117BE0);
      if ( qword_180117DF0 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DF0, 0) != 0 )
      {
        v64 = sub_1800023C0((__int64)a1);
        if ( v64 != 0 )
        {
          qword_180117DF0 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v64);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v64);
        }
      }
      sub_1800C6900(&unk_180117BE0);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( qword_180117FF8 == 0 )
    {
      qword_180117FF8 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 904))(
                          a1,
                          qword_180117DF0,
                          /*0x29f0*/ "current",
                          /*0x29f8*/ "()Ljava/util/concurrent/ThreadLocalRandom;");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    v132[0] = sub_180002760((__int64)a1);
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_692;
    if ( qword_180117DF0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DF0, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117BE0);
      if ( qword_180117DF0 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DF0, 0) != 0 )
      {
        v66 = sub_1800023C0((__int64)a1);
        if ( v66 != 0 )
        {
          qword_180117DF0 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v66);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v66);
        }
      }
      sub_1800C6900(&unk_180117BE0);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( qword_180118000 == 0 )
    {
      qword_180118000 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 264))(
                          a1,
                          qword_180117DF0,
                          /*0x2a23*/ "nextLong",
                          /*0x2a2c*/ "()J");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( v132[0] != 0 )
      v132[0] = sub_180003690(a1, v132[0], qword_180118000, v65);
    else
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x2a30*/ "INVOKEVIRTUAL Long npe", 208);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_692;
    v115 = v132[0];
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_692;
    if ( qword_180117DF0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DF0, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117BE0);
      if ( qword_180117DF0 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DF0, 0) != 0 )
      {
        v67 = sub_1800023C0((__int64)a1);
        if ( v67 != 0 )
        {
          qword_180117DF0 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v67);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v67);
        }
      }
      sub_1800C6900(&unk_180117BE0);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( qword_180117FF8 == 0 )
    {
      qword_180117FF8 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 904))(
                          a1,
                          qword_180117DF0,
                          /*0x29f0*/ "current",
                          /*0x29f8*/ "()Ljava/util/concurrent/ThreadLocalRandom;");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    v132[0] = sub_180002760((__int64)a1);
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_692;
    v126 = 1;
    if ( qword_180117D40 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D40, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117B30);
      if ( qword_180117D40 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D40, 0) != 0 )
      {
        v68 = sub_1800023C0((__int64)a1);
        if ( v68 != 0 )
        {
          qword_180117D40 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v68);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v68);
        }
      }
      sub_1800C6900(&unk_180117B30);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    v69 = qword_180118008;
    if ( qword_180118008 == 0 )
    {
      qword_180118008 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 904))(
                          a1,
                          qword_180117D40,
                          /*0xa5*/ "a",
                          /*0x2a47*/ "(IJ)J");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
      v69 = qword_180118008;
    }
    v70 = sub_1800BE2A0(a1, qword_180117D40, v69, 15559, v13 ^ 0x766D274C80DC059ALL);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_692;
    if ( qword_180117DF0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DF0, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117BE0);
      if ( qword_180117DF0 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DF0, 0) != 0 )
      {
        v71 = sub_1800023C0((__int64)a1);
        if ( v71 != 0 )
        {
          qword_180117DF0 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v71);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v71);
        }
      }
      sub_1800C6900(&unk_180117BE0);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( qword_180118010 == 0 )
    {
      qword_180118010 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 264))(
                          a1,
                          qword_180117DF0,
                          /*0x2a23*/ "nextLong",
                          /*0x2a4d*/ "(JJ)J");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( v132[0] != 0 )
    {
      v100 = v70;
      v132[0] = sub_180003690(a1, v132[0], qword_180118010, v126);
    }
    else
    {
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x2a30*/ "INVOKEVIRTUAL Long npe", 86);
    }
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_692;
    v108 = v132[0];
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_692;
    if ( qword_180117DF0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DF0, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117BE0);
      if ( qword_180117DF0 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DF0, 0) != 0 )
      {
        v72 = sub_1800023C0((__int64)a1);
        if ( v72 != 0 )
        {
          qword_180117DF0 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v72);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v72);
        }
      }
      sub_1800C6900(&unk_180117BE0);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( qword_180117FF8 == 0 )
    {
      qword_180117FF8 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64, __int64))(*a1 + 904))(
                          a1,
                          qword_180117DF0,
                          /*0x29f0*/ "current",
                          /*0x29f8*/ "()Ljava/util/concurrent/ThreadLocalRandom;",
                          v100);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    v132[0] = sub_180002760((__int64)a1);
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_692;
    LODWORD(v126) = 1;
    LODWORD(v125) = 256;
    if ( qword_180117DF0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DF0, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117BE0);
      if ( qword_180117DF0 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DF0, 0) != 0 )
      {
        v73 = sub_1800023C0((__int64)a1);
        if ( v73 != 0 )
        {
          qword_180117DF0 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v73);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v73);
        }
      }
      sub_1800C6900(&unk_180117BE0);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( qword_180118018 == 0 )
    {
      qword_180118018 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 264))(
                          a1,
                          qword_180117DF0,
                          /*0x2a53*/ "nextInt",
                          /*0x2a5b*/ "(II)I");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( v132[0] != 0 )
      LODWORD(v132[0]) = sub_180026900(a1, v132[0], qword_180118018, (unsigned int)v126);
    else
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x69a*/ "INVOKEVIRTUAL Int npe", 383);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_692;
    v106 = v132[0];
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_692;
    v132[0] = v107[0];
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    if ( qword_180117D70 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D70, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117B60);
      if ( qword_180117D70 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D70, 0) != 0 )
      {
        v74 = sub_1800023C0((__int64)a1);
        if ( v74 != 0 )
        {
          qword_180117D70 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v74);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v74);
        }
      }
      sub_1800C6900(&unk_180117B60);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( qword_180118020 == 0 )
    {
      qword_180118020 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 904))(
                          a1,
                          qword_180117D70,
                          /*0x2a61*/ "currentThread",
                          /*0x2a6f*/ "()Ljava/lang/Thread;");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    v126 = sub_180002760((__int64)a1);
    sub_1800036C0((__int64)&v127, (float *)v123, &v126, &v126);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_692;
    LODWORD(v125) = 8382;
    if ( qword_180117D40 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D40, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117B30);
      if ( qword_180117D40 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117D40, 0) != 0 )
      {
        v75 = sub_1800023C0((__int64)a1);
        if ( v75 != 0 )
        {
          qword_180117D40 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v75);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v75);
        }
      }
      sub_1800C6900(&unk_180117B30);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    v76 = qword_180118008;
    if ( qword_180118008 == 0 )
    {
      qword_180118008 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 904))(
                          a1,
                          qword_180117D40,
                          /*0xa5*/ "a",
                          /*0x2a47*/ "(IJ)J");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
      v76 = qword_180118008;
    }
    v125 = sub_1800BE2A0(a1, qword_180117D40, v76, (unsigned int)v125, v13 ^ 0x744B433253E799EFLL);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_692;
    if ( qword_180117DE8 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DE8, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117BD8);
      if ( qword_180117DE8 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DE8, 0) != 0 )
      {
        v77 = sub_1800023C0((__int64)a1);
        if ( v77 != 0 )
        {
          qword_180117DE8 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v77);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v77);
        }
      }
      sub_1800C6900(&unk_180117BD8);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( qword_180118028 == 0 )
    {
      qword_180118028 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 264))(
                          a1,
                          qword_180117DE8,
                          /*0xd0f*/ "putLong",
                          /*0x2a84*/ "(Ljava/lang/Object;JJ)V");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      {
LABEL_692:
        v83 = (*(__int64 (__fastcall **)(__int64 *))(*a1 + 120))(a1);
        (*(void (__fastcall **)(__int64 *))(*a1 + 136))(a1);
        v132[0] = v83;
        v130[0] = v83;
        sub_180026960(&v127, v123, v130, v130);
        goto LABEL_698;
      }
    }
    if ( v132[0] != 0 )
    {
      v101 = v125;
      sub_1800027F0(a1, v132[0], qword_180118028, v126);
    }
    else
    {
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x65b*/ "INVOKEVIRTUAL Void npe", 194);
    }
    v78 = (*(__int64 (__fastcall **)(__int64 *))(*a1 + 1824))(a1);
    v58 = *a1;
    if ( v78 != 0 )
      goto LABEL_697;
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(v58 + 1824))(a1) != 0 )
      goto LABEL_692;
    v132[0] = v107[0];
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    v126 = v108;
    if ( qword_180117DE8 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DE8, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117BD8);
      if ( qword_180117DE8 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DE8, 0) != 0 )
      {
        v79 = sub_1800023C0((__int64)a1);
        if ( v79 != 0 )
        {
          qword_180117DE8 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v79);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v79);
        }
      }
      sub_1800C6900(&unk_180117BD8);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( qword_180118030 == 0 )
    {
      qword_180118030 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64, __int64))(*a1 + 264))(
                          a1,
                          qword_180117DE8,
                          /*0x2a9c*/ "putAddress",
                          /*0x2aa7*/ "(JJ)V",
                          v101);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( v132[0] != 0 )
      sub_1800027F0(a1, v132[0], qword_180118030, v126);
    else
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x65b*/ "INVOKEVIRTUAL Void npe", 221);
    v80 = (*(__int64 (__fastcall **)(__int64 *))(*a1 + 1824))(a1);
    v58 = *a1;
    if ( v80 != 0 )
      goto LABEL_697;
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(v58 + 1824))(a1) != 0 )
      goto LABEL_692;
    if ( qword_180117DF8 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DF8, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117BE8);
      if ( qword_180117DF8 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DF8, 0) != 0 )
      {
        v81 = sub_1800023C0((__int64)a1);
        if ( v81 != 0 )
        {
          qword_180117DF8 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v81);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v81);
        }
      }
      sub_1800C6900(&unk_180117BE8);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( qword_180118038 == 0 )
    {
      qword_180118038 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 904))(
                          a1,
                          qword_180117DF8,
                          /*0x2aad*/ "getRuntime",
                          /*0x2ab8*/ "()Ljava/lang/Runtime;");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    v132[0] = sub_180002760((__int64)a1);
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
      goto LABEL_692;
    LODWORD(v126) = v106;
    if ( qword_180117DF8 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DF8, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117BE8);
      if ( qword_180117DF8 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117DF8, 0) != 0 )
      {
        v82 = sub_1800023C0((__int64)a1);
        if ( v82 != 0 )
        {
          qword_180117DF8 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v82);
          (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v82);
        }
      }
      sub_1800C6900(&unk_180117BE8);
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( qword_180118040 == 0 )
    {
      qword_180118040 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 264))(
                          a1,
                          qword_180117DF8,
                          /*0x2ace*/ "halt",
                          /*0x51d*/ "(I)V");
      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
        goto LABEL_692;
    }
    if ( v132[0] != 0 )
      sub_1800027F0(a1, v132[0], qword_180118040, (unsigned int)v126);
    else
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x65b*/ "INVOKEVIRTUAL Void npe", 324);
    v84 = (*(__int64 (__fastcall **)(__int64 *))(*a1 + 1824))(a1);
    v58 = *a1;
    if ( v84 != 0 )
      goto LABEL_697;
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(v58 + 1824))(a1) != 0 )
      goto LABEL_77;
  }
LABEL_731:
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
  {
    sub_180026DB0(v123, &v112);
    sub_180026DB0(v123, &v116);
    sub_180026DB0(v123, &v117);
    sub_180026DB0(v123, &v113);
    sub_180026DB0(v123, &v120);
    sub_180026DB0(v123, &v114);
    sub_180026DB0(v123, &v118);
    sub_180026DB0(v123, &v121);
    sub_180026DB0(v123, &v119);
    sub_180026DB0(v123, &v111);
    sub_180026DB0(v123, &v122);
    sub_180002660(a1, v123);
    v132[0] = v121;
    sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
    v126 = v117;
    sub_1800036C0((__int64)&v127, (float *)v123, &v126, &v126);
    v125 = v120;
    sub_1800036C0((__int64)&v127, (float *)v123, &v125, &v125);
    if ( qword_180117F08 != 0
      && (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F08, 0) == 0 )
    {
      goto LABEL_793;
    }
    sub_1800C68B0(&unk_180117CF8);
    if ( qword_180117F08 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F08, 0) != 0 )
    {
      v91 = sub_1800023C0((__int64)a1);
      if ( v91 != 0 )
      {
        qword_180117F08 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v91);
        (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v91);
      }
    }
    sub_1800C6900(&unk_180117CF8);
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
    {
LABEL_793:
      if ( qword_180118218 != 0
        || (qword_180118218 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 904))(
                                a1,
                                qword_180117F08,
                                /*0xc08*/ "atc",
                                /*0xbce*/ "(Ljava/lang/String;[B[B)Ljava/lang/String;"),
            (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0) )
      {
        v105 = v125;
        v102 = v126;
        v132[0] = sub_180002760((__int64)a1);
        sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
        if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
        {
          if ( qword_180117F28 != 0
            && (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F28, 0) == 0 )
          {
            goto LABEL_749;
          }
          sub_1800C68B0(&unk_180117D18);
          if ( qword_180117F28 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(a1, qword_180117F28, 0) != 0 )
          {
            v92 = sub_1800023C0((__int64)a1);
            if ( v92 != 0 )
            {
              qword_180117F28 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v92);
              (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v92);
            }
          }
          sub_1800C6900(&unk_180117D18);
          if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
          {
LABEL_749:
            v93 = qword_180118250;
            if ( qword_180118250 == 0 )
            {
              qword_180118250 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64, __int64, __int64))(*a1 + 904))(
                                  a1,
                                  qword_180117F28,
                                  /*0x30e0*/ "parseLong",
                                  /*0x30ea*/ "(Ljava/lang/String;)J",
                                  v102,
                                  v105);
              if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
                goto LABEL_77;
              v93 = qword_180118250;
            }
            v132[0] = sub_1800BE2A0(a1, qword_180117F28, v93, v132[0], v102);
            if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
            {
LABEL_753:
              if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
              {
                sub_180026DB0(v123, &v112);
                sub_180026DB0(v123, &v116);
                sub_180026DB0(v123, &v117);
                sub_180026DB0(v123, &v113);
                sub_180026DB0(v123, &v120);
                sub_180026DB0(v123, &v114);
                sub_180026DB0(v123, &v118);
                sub_180026DB0(v123, &v121);
                sub_180026DB0(v123, &v119);
                sub_180026DB0(v123, &v111);
                sub_180026DB0(v123, &v122);
                sub_180002660(a1, v123);
                v111 = v132[0];
                if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
                {
                  v132[0] = v111;
                  if ( qword_180117F08 != 0
                    && (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(
                         a1,
                         qword_180117F08,
                         0) == 0 )
                  {
                    goto LABEL_794;
                  }
                  sub_1800C68B0(&unk_180117CF8);
                  if ( qword_180117F08 == 0
                    || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(
                         a1,
                         qword_180117F08,
                         0) != 0 )
                  {
                    v94 = sub_1800023C0((__int64)a1);
                    if ( v94 != 0 )
                    {
                      qword_180117F08 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v94);
                      (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v94);
                    }
                  }
                  sub_1800C6900(&unk_180117CF8);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
                  {
LABEL_794:
                    if ( qword_180118258 != 0
                      || (qword_180118258 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 904))(
                                              a1,
                                              qword_180117F08,
                                              /*0xa34*/ "hgv",
                                              /*0xa38*/ "(J)[B"),
                          (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0) )
                    {
                      v132[0] = sub_180002760((__int64)a1);
                      sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
                      {
                        v115 = v132[0];
                        sub_1800036C0((__int64)&v127, (float *)v123, v132, v132);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
                        {
                          if ( qword_180117E00 != 0
                            && (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(
                                 a1,
                                 qword_180117E00,
                                 0) == 0 )
                          {
                            goto LABEL_773;
                          }
                          sub_1800C68B0(&unk_180117BF0);
                          if ( qword_180117E00 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(
                                 a1,
                                 qword_180117E00,
                                 0) != 0 )
                          {
                            v95 = sub_1800023C0((__int64)a1);
                            if ( v95 != 0 )
                            {
                              qword_180117E00 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(a1, v95);
                              (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v95);
                            }
                          }
                          sub_1800C6900(&unk_180117BF0);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
                          {
LABEL_773:
                            v96 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 216))(a1, qword_180117E00);
                            v130[0] = v96;
                            if ( v96 != 0 )
                            {
                              v132[0] = v96;
                              sub_1800036C0((__int64)&v127, (float *)v123, v130, v130);
                            }
                            if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
                            {
                              v126 = v132[0];
                              if ( qword_180117E00 != 0
                                && (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(
                                     a1,
                                     qword_180117E00,
                                     0) == 0 )
                              {
                                goto LABEL_795;
                              }
                              sub_1800C68B0(&unk_180117BF0);
                              if ( qword_180117E00 == 0
                                || (*(unsigned __int8 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 192))(
                                     a1,
                                     qword_180117E00,
                                     0) != 0 )
                              {
                                v97 = sub_1800023C0((__int64)a1);
                                if ( v97 != 0 )
                                {
                                  qword_180117E00 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1808))(
                                                      a1,
                                                      v97);
                                  (*(void (__fastcall **)(__int64 *, __int64))(*a1 + 184))(a1, v97);
                                }
                              }
                              sub_1800C6900(&unk_180117BF0);
                              if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
                              {
LABEL_795:
                                if ( qword_180118260 != 0
                                  || (qword_180118260 = (*(__int64 (__fastcall **)(__int64 *, __int64, __int64, __int64))(*a1 + 264))(
                                                          a1,
                                                          qword_180117E00,
                                                          /*0x48b*/ "<init>",
                                                          /*0x4*/ "()V"),
                                      (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0) )
                                {
                                  if ( v126 != 0 )
                                  {
                                    sub_180026870((_DWORD)a1, v126, qword_180117E00, qword_180118260);
                                    JUMPOUT(0x1800ABF7BLL);
                                  }
                                  JUMPOUT(0x1800ABF5BLL);
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
LABEL_77:
  sub_180003630(v123);
  return 0;
}


/* ===== chunk 1800ABF5B .. 1800B3F41 ===== */
// bad sp value at call has been detected, the output may be wrong!
void __fastcall sub_1800ABF5B()
{
  __int64 v0; // rsi
  __int64 v1; // r14
  int v2; // r15d
  __int64 v3; // rbx
  __int64 v4; // rbx
  __int64 v5; // r14
  __int64 v6; // r14
  __int64 v7; // r14
  __int64 v8; // r14
  _BYTE *v9; // r8
  __int64 v10; // r14
  __int64 v11; // r14
  __int64 v12; // r14
  __int64 v13; // r14
  __int64 v14; // r14
  char v15; // al
  __int64 v16; // rdx
  __int64 v17; // r14
  __int64 v18; // r14
  __int64 v19; // r14
  _BYTE *v20; // r8
  __int64 v21; // r14
  __int64 v22; // r14
  __int64 v23; // r14
  __int64 v24; // r14
  _BYTE *v25; // r8
  __int64 v26; // r14
  __int64 v27; // r14
  __int64 v28; // r14
  __int64 v29; // rax
  __int64 v30; // r14
  __int64 v31; // r14
  __int64 v32; // r14
  __int64 v33; // r14
  __int64 v34; // r14
  __int64 v35; // r14
  _BYTE *v36; // r8
  __int64 v37; // r14
  __int64 v38; // r14
  __int64 v39; // rax
  __int64 v40; // r14
  __int64 v41; // r14
  __int64 v42; // r14
  __int64 v43; // r14
  __int64 v44; // r14
  __int64 v45; // r14
  __int64 v46; // r14
  _BYTE *v47; // r8
  __int64 v48; // r14
  __int64 v49; // r14
  __int64 v50; // r14
  _BYTE *v51; // r8
  __int64 v52; // r14
  __int64 v53; // r14
  __int64 v54; // r14
  __int64 v55; // r14
  _BYTE *v56; // r8
  __int64 v57; // r14
  __int64 v58; // r14
  __int64 v59; // r14
  char v60; // al
  __int64 v61; // rdx
  __int64 v62; // r14
  __int64 v63; // r14
  __int64 v64; // r14
  __int64 v65; // r14
  __int64 v66; // r14
  char v67; // al
  __int64 v68; // r14
  char v69; // al
  __int64 v70; // r14
  __int64 v71; // r14
  __int64 v72; // r14
  __int64 v73; // r14
  __int64 v74; // r14
  __int64 v75; // r14
  __int64 v76; // r14
  __int64 v77; // r14
  __int64 v78; // [rsp+50h] [rbp-30h] BYREF
  __int64 v79; // [rsp+58h] [rbp-28h] BYREF
  __int64 v80; // [rsp+60h] [rbp-20h]
  __int64 v81; // [rsp+68h] [rbp-18h] BYREF
  __int64 v82; // [rsp+70h] [rbp-10h] BYREF
  __int64 v83; // [rsp+78h] [rbp-8h] BYREF
  __int64 v84; // [rsp+80h] [rbp+0h] BYREF
  __int64 v85; // [rsp+88h] [rbp+8h] BYREF
  __int64 v86; // [rsp+90h] [rbp+10h] BYREF
  __int64 v87; // [rsp+98h] [rbp+18h] BYREF
  __int64 v88; // [rsp+A0h] [rbp+20h] BYREF
  __int64 v89; // [rsp+A8h] [rbp+28h] BYREF
  _QWORD v90[2]; // [rsp+B0h] [rbp+30h] BYREF
  __int64 v91; // [rsp+C0h] [rbp+40h] BYREF
  __int64 v92; // [rsp+C8h] [rbp+48h] BYREF
  __int64 v93; // [rsp+D0h] [rbp+50h] BYREF
  _QWORD v94[4]; // [rsp+D8h] [rbp+58h] BYREF
  __int64 v95; // [rsp+F8h] [rbp+78h] BYREF
  __int64 v96; // [rsp+100h] [rbp+80h] BYREF
  __int64 v97; // [rsp+108h] [rbp+88h] BYREF
  __int64 v98; // [rsp+110h] [rbp+90h] BYREF
  __int64 v99; // [rsp+118h] [rbp+98h] BYREF
  __int64 v100; // [rsp+120h] [rbp+A0h] BYREF
  __int64 v101; // [rsp+128h] [rbp+A8h] BYREF
  __int64 v102; // [rsp+130h] [rbp+B0h] BYREF
  __int64 v103; // [rsp+138h] [rbp+B8h] BYREF
  __int64 v104; // [rsp+140h] [rbp+C0h] BYREF
  __int64 v105; // [rsp+148h] [rbp+C8h] BYREF
  float v106[12]; // [rsp+150h] [rbp+D0h] BYREF
  __int64 v107; // [rsp+180h] [rbp+100h] BYREF
  __int64 v108; // [rsp+188h] [rbp+108h] BYREF
  char v109; // [rsp+190h] [rbp+110h] BYREF
  _BYTE v110[23]; // [rsp+191h] [rbp+111h] BYREF
  __int64 v111[2]; // [rsp+1A8h] [rbp+128h] BYREF
  __int64 v112; // [rsp+1B8h] [rbp+138h]
  __int64 v113[8]; // [rsp+1C0h] [rbp+140h] BYREF

  sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x4ab*/ "INVOKESPECIAL Void npe", 339);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) == 0 )
  {
    v92 = v113[0];
    sub_1800036C0((__int64)&v109, v106, v113, v113);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) == 0 )
    {
      v113[0] = v101;
      sub_1800036C0((__int64)&v109, v106, v113, v113);
      if ( qword_180117E00 != 0
        && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(v0, qword_180117E00, 0) == 0 )
      {
        goto LABEL_28;
      }
      sub_1800C68B0(&unk_180117BF0);
      if ( qword_180117E00 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(v0, qword_180117E00, 0) != 0 )
      {
        v3 = sub_1800023C0(v0);
        if ( v3 != 0 )
        {
          qword_180117E00 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(v0, v3);
          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v3);
        }
      }
      sub_1800C6900(&unk_180117BF0);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) == 0 )
      {
LABEL_28:
        if ( qword_180118230 != 0
          || (qword_180118230 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                  v0,
                                  qword_180117E00,
                                  /*0x3085*/ "entrySet",
                                  /*0x308e*/ "()Ljava/util/Set;"),
              (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) == 0) )
        {
          if ( v113[0] != 0 )
          {
            v113[0] = sub_180002790(v0);
            sub_1800036C0((__int64)&v109, v106, v113, v113);
          }
          else
          {
            sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 204);
          }
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) == 0 )
          {
            if ( qword_180117F18 != 0
              && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                   v0,
                   qword_180117F18,
                   0) == 0 )
            {
              goto LABEL_809;
            }
            sub_1800C68B0(&unk_180117D08);
            if ( qword_180117F18 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                   v0,
                   qword_180117F18,
                   0) != 0 )
            {
              v4 = sub_1800023C0(v0);
              if ( v4 != 0 )
              {
                qword_180117F18 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(v0, v4);
                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v4);
              }
            }
            sub_1800C6900(&unk_180117D08);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) == 0 )
            {
LABEL_809:
              if ( qword_180118238 != 0
                || (qword_180118238 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                        v0,
                                        qword_180117F18,
                                        /*0x2c40*/ "iterator",
                                        /*0x2c49*/ "()Ljava/util/Iterator;"),
                    (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) == 0) )
              {
                if ( v113[0] != 0 )
                {
                  v113[0] = sub_180002790(v0);
                  sub_1800036C0((__int64)&v109, v106, v113, v113);
                }
                else
                {
                  sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x452*/ "INVOKEINTERFACE Object npe", 204);
                }
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) == 0 )
                {
                  v93 = v113[0];
                  sub_1800036C0((__int64)&v109, v106, v113, v113);
                  v80 ^= v1;
                  while ( 1 )
                  {
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                      goto LABEL_832;
                    sub_180026DB0(v106, &v95);
                    sub_180026DB0(v106, &v99);
                    sub_180026DB0(v106, &v100);
                    sub_180026DB0(v106, &v96);
                    sub_180026DB0(v106, &v103);
                    sub_180026DB0(v106, &v97);
                    sub_180026DB0(v106, &v101);
                    sub_180026DB0(v106, &v104);
                    sub_180026DB0(v106, &v102);
                    sub_180026DB0(v106, &v98);
                    sub_180026DB0(v106, &v92);
                    sub_180026DB0(v106, &v93);
                    sub_180026DB0(v106, &v105);
                    sub_180002660(v0, v106);
                    v113[0] = v93;
                    sub_1800036C0((__int64)&v109, v106, v113, v113);
LABEL_32:
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                      goto LABEL_832;
                    sub_180026DB0(v106, v113);
                    sub_180026DB0(v106, &v95);
                    sub_180026DB0(v106, &v99);
                    sub_180026DB0(v106, &v100);
                    sub_180026DB0(v106, &v96);
                    sub_180026DB0(v106, &v103);
                    sub_180026DB0(v106, &v97);
                    sub_180026DB0(v106, &v101);
                    sub_180026DB0(v106, &v104);
                    sub_180026DB0(v106, &v102);
                    sub_180026DB0(v106, &v98);
                    sub_180026DB0(v106, &v92);
                    sub_180026DB0(v106, &v93);
                    sub_180026DB0(v106, &v105);
                    sub_180002660(v0, v106);
                    if ( qword_180117E50 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                           v0,
                           qword_180117E50,
                           0) != 0 )
                    {
                      sub_1800C68B0(&unk_180117C40);
                      if ( qword_180117E50 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                             v0,
                             qword_180117E50,
                             0) != 0 )
                      {
                        v5 = sub_1800023C0(v0);
                        if ( v5 != 0 )
                        {
                          qword_180117E50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                              v0,
                                              v5);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v5);
                        }
                      }
                      sub_1800C6900(&unk_180117C40);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_832;
                    }
                    if ( qword_1801180B0 == 0 )
                    {
                      qword_1801180B0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                          v0,
                                          qword_180117E50,
                                          /*0x2c60*/ "hasNext",
                                          /*0x275b*/ "()Z");
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_832;
                    }
                    if ( v113[0] != 0 )
                      LODWORD(v113[0]) = (unsigned __int8)sub_1800BE240(v0, v113[0], qword_1801180B0);
                    else
                      sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x2c68*/ "INVOKEINTERFACE Boolean npe", 204);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                      goto LABEL_832;
                    if ( LODWORD(v113[0]) == 0 )
                      JUMPOUT(0x1800B6EDBLL);
                    v113[0] = v93;
                    sub_1800036C0((__int64)&v109, v106, v113, v113);
                    if ( qword_180117E50 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                           v0,
                           qword_180117E50,
                           0) != 0 )
                    {
                      sub_1800C68B0(&unk_180117C40);
                      if ( qword_180117E50 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                             v0,
                             qword_180117E50,
                             0) != 0 )
                      {
                        v6 = sub_1800023C0(v0);
                        if ( v6 != 0 )
                        {
                          qword_180117E50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                              v0,
                                              v6);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v6);
                        }
                      }
                      sub_1800C6900(&unk_180117C40);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_832;
                    }
                    if ( qword_1801180B8 == 0 )
                    {
                      qword_1801180B8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                          v0,
                                          qword_180117E50,
                                          /*0x2c84*/ "next",
                                          /*0x2c89*/ "()Ljava/lang/Object;");
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_832;
                    }
                    if ( v113[0] != 0 )
                    {
                      v113[0] = sub_180002790(v0);
                      sub_1800036C0((__int64)&v109, v106, v113, v113);
                    }
                    else
                    {
                      sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x452*/ "INVOKEINTERFACE Object npe", 204);
                    }
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                      goto LABEL_832;
                    if ( qword_180117F20 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                           v0,
                           qword_180117F20,
                           0) != 0 )
                    {
                      sub_1800C68B0(&unk_180117D10);
                      if ( qword_180117F20 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                             v0,
                             qword_180117F20,
                             0) != 0 )
                      {
                        v7 = sub_1800023C0(v0);
                        if ( v7 != 0 )
                        {
                          qword_180117F20 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                              v0,
                                              v7);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v7);
                        }
                      }
                      sub_1800C6900(&unk_180117D10);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_832;
                    }
                    if ( v113[0] != 0
                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)v0 + 256LL))(
                           v0,
                           v113[0],
                           qword_180117F20) == 0 )
                    {
                      break;
                    }
LABEL_76:
                    v88 = v113[0];
                    sub_1800036C0((__int64)&v109, v106, v113, v113);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                      goto LABEL_779;
                    v113[0] = v88;
                    sub_1800036C0((__int64)&v109, v106, v113, v113);
                    if ( qword_180117F20 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                           v0,
                           qword_180117F20,
                           0) != 0 )
                    {
                      sub_1800C68B0(&unk_180117D10);
                      if ( qword_180117F20 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                             v0,
                             qword_180117F20,
                             0) != 0 )
                      {
                        v10 = sub_1800023C0(v0);
                        if ( v10 != 0 )
                        {
                          qword_180117F20 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                              v0,
                                              v10);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v10);
                        }
                      }
                      sub_1800C6900(&unk_180117D10);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                    }
                    if ( qword_180118240 == 0 )
                    {
                      qword_180118240 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                          v0,
                                          qword_180117F20,
                                          /*0x30b4*/ "getKey",
                                          /*0x2c89*/ "()Ljava/lang/Object;");
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                    }
                    if ( v113[0] != 0 )
                    {
                      v113[0] = sub_180002790(v0);
                      sub_1800036C0((__int64)&v109, v106, v113, v113);
                    }
                    else
                    {
                      sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x452*/ "INVOKEINTERFACE Object npe", 11);
                    }
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                      goto LABEL_779;
                    v108 = v102;
                    sub_1800036C0((__int64)&v109, v106, &v108, &v108);
                    if ( qword_180117F30 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                           v0,
                           qword_180117F30,
                           0) != 0 )
                    {
                      sub_1800C68B0(&unk_180117D20);
                      if ( qword_180117F30 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                             v0,
                             qword_180117F30,
                             0) != 0 )
                      {
                        v11 = sub_1800023C0(v0);
                        if ( v11 != 0 )
                        {
                          qword_180117F30 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                              v0,
                                              v11);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v11);
                        }
                      }
                      sub_1800C6900(&unk_180117D20);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                    }
                    if ( qword_180118268 == 0 )
                    {
                      qword_180118268 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL /*GetStaticMethodID*/))(
                                          v0,
                                          qword_180117F30,
                                          /*0x2cf6*/ "equals",
                                          /*0x3100*/ "(Ljava/lang/Object;Ljava/lang/Object;)Z");
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                    }
                    LODWORD(v113[0]) = (unsigned __int8)sub_1800BE210(v0, qword_180117F30);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                      goto LABEL_779;
                    if ( LODWORD(v113[0]) == 0 )
                      goto LABEL_144;
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                      goto LABEL_779;
                    v113[0] = v92;
                    sub_1800036C0((__int64)&v109, v106, v113, v113);
                    if ( qword_180117D40 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                           v0,
                           qword_180117D40,
                           0) != 0 )
                    {
                      sub_1800C68B0(&unk_180117B30);
                      if ( qword_180117D40 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                             v0,
                             qword_180117D40,
                             0) != 0 )
                      {
                        v12 = sub_1800023C0(v0);
                        if ( v12 != 0 )
                        {
                          qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                              v0,
                                              v12);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v12);
                        }
                      }
                      sub_1800C6900(&unk_180117B30);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                    }
                    if ( qword_180118300 == 0 )
                    {
                      qword_180118300 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 1152LL /*GetMethodID*/))(
                                          v0,
                                          qword_180117D40,
                                          /*0xa5*/ "a",
                                          /*0xa3e*/ "[Ljava/lang/String;");
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                    }
                    v108 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1160LL /*GetObjectClass/AllocObject*/))(v0, qword_180117D40);
                    sub_1800036C0((__int64)&v109, v106, &v108, &v108);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                      goto LABEL_779;
                    v105 = v108;
                    sub_1800036C0((__int64)&v109, v106, &v108, &v108);
                    v108 = v105;
                    sub_1800036C0((__int64)&v109, v106, &v108, &v108);
                    LODWORD(v107) = 2;
                    if ( v108 != 0 )
                    {
                      v108 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)v0 + 1384LL))(
                               v0,
                               v108,
                               2);
                      sub_1800036C0((__int64)&v109, v106, &v108, &v108);
                    }
                    else
                    {
                      sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x41b*/ "AALOAD npe", 250);
                    }
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                      goto LABEL_779;
                    v107 = v94[3];
                    if ( qword_180117F28 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                           v0,
                           qword_180117F28,
                           0) != 0 )
                    {
                      sub_1800C68B0(&unk_180117D18);
                      if ( qword_180117F28 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                             v0,
                             qword_180117F28,
                             0) != 0 )
                      {
                        v13 = sub_1800023C0(v0);
                        if ( v13 != 0 )
                        {
                          qword_180117F28 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                              v0,
                                              v13);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v13);
                        }
                      }
                      sub_1800C6900(&unk_180117D18);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                    }
                    if ( qword_180118270 == 0 )
                    {
                      qword_180118270 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL /*GetStaticMethodID*/))(
                                          v0,
                                          qword_180117F28,
                                          /*0x3128*/ "valueOf",
                                          /*0x3130*/ "(J)Ljava/lang/Long;");
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                    }
                    v107 = sub_180002760(v0);
                    sub_1800036C0((__int64)&v109, v106, &v107, &v107);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                      goto LABEL_779;
                    if ( qword_180117E00 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                           v0,
                           qword_180117E00,
                           0) != 0 )
                    {
                      sub_1800C68B0(&unk_180117BF0);
                      if ( qword_180117E00 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                             v0,
                             qword_180117E00,
                             0) != 0 )
                      {
                        v14 = sub_1800023C0(v0);
                        if ( v14 != 0 )
                        {
                          qword_180117E00 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                              v0,
                                              v14);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v14);
                        }
                      }
                      sub_1800C6900(&unk_180117BF0);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                    }
                    if ( qword_180118278 == 0 )
                    {
                      qword_180118278 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                          v0,
                                          qword_180117E00,
                                          /*0x3144*/ "addProperty",
                                          /*0x3150*/ "(Ljava/lang/String;Ljava/lang/Number;)V");
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                    }
                    if ( v113[0] != 0 )
                      sub_1800027F0(v0, v113[0], qword_180118278, v108);
                    else
                      sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x65b*/ "INVOKEVIRTUAL Void npe", 250);
                    v15 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0);
                    v16 = *(_QWORD *)v0;
                    if ( v15 != 0 )
                      goto LABEL_733;
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(v16 + 1824))(v0) != 0 )
                      goto LABEL_832;
                    LODWORD(v113[0]) = v2;
                    if ( v2 == 0 )
                    {
LABEL_144:
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                      sub_180026DB0(v106, &v95);
                      sub_180026DB0(v106, &v99);
                      sub_180026DB0(v106, &v100);
                      sub_180026DB0(v106, &v96);
                      sub_180026DB0(v106, &v103);
                      sub_180026DB0(v106, &v97);
                      sub_180026DB0(v106, &v101);
                      sub_180026DB0(v106, &v104);
                      sub_180026DB0(v106, &v102);
                      sub_180026DB0(v106, &v98);
                      sub_180026DB0(v106, &v92);
                      sub_180026DB0(v106, &v93);
                      sub_180026DB0(v106, &v88);
                      sub_180026DB0(v106, &v105);
                      sub_180002660(v0, v106);
                      v113[0] = v88;
                      sub_1800036C0((__int64)&v109, v106, v113, v113);
                      if ( qword_180117F20 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                             v0,
                             qword_180117F20,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117D10);
                        if ( qword_180117F20 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117F20,
                               0) != 0 )
                        {
                          v17 = sub_1800023C0(v0);
                          if ( v17 != 0 )
                          {
                            qword_180117F20 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                v0,
                                                v17);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v17);
                          }
                        }
                        sub_1800C6900(&unk_180117D10);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                      }
                      if ( qword_180118240 == 0 )
                      {
                        qword_180118240 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                            v0,
                                            qword_180117F20,
                                            /*0x30b4*/ "getKey",
                                            /*0x2c89*/ "()Ljava/lang/Object;");
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                      }
                      if ( v113[0] != 0 )
                      {
                        v113[0] = sub_180002790(v0);
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                      }
                      else
                      {
                        sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x452*/ "INVOKEINTERFACE Object npe", 205);
                      }
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                      if ( qword_180117E70 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                             v0,
                             qword_180117E70,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117C60);
                        if ( qword_180117E70 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117E70,
                               0) != 0 )
                        {
                          v18 = sub_1800023C0(v0);
                          if ( v18 != 0 )
                          {
                            qword_180117E70 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                v0,
                                                v18);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v18);
                          }
                        }
                        sub_1800C6900(&unk_180117C60);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                      }
                      if ( v113[0] != 0
                        && (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)v0 + 256LL))(
                             v0,
                             v113[0],
                             qword_180117E70) == 0 )
                      {
                        v19 = qword_1801178A0;
                        sub_1800267D0(v111, /*0x3fa*/ "cannot cast to ");
                        sub_1800267D0(v94, /*0xb38*/ "java/lang/String");
                        sub_180026770(&v109, v111, v94);
                        v20 = v110;
                        if ( (v109 & 1) != 0 )
                          v20 = *(_BYTE **)&v110[15];
                        sub_180002110(v0, v19 + 989, v20, 205);
                        if ( (v109 & 1) == 0 )
                        {
                          if ( (v94[0] & 1) == 0 )
                            goto LABEL_171;
LABEL_197:
                          sub_1800C0DC0(v94[2]);
                          if ( (v111[0] & 1) == 0 )
                            goto LABEL_173;
LABEL_172:
                          sub_1800C0DC0(v112);
                          goto LABEL_173;
                        }
                        sub_1800C0DC0(*(_QWORD *)&v110[15]);
                        if ( (v94[0] & 1) != 0 )
                          goto LABEL_197;
LABEL_171:
                        if ( (v111[0] & 1) != 0 )
                          goto LABEL_172;
LABEL_173:
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                      }
                      v108 = v98;
                      sub_1800036C0((__int64)&v109, v106, &v108, &v108);
                      v107 = v94[3];
                      if ( qword_180117F08 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                             v0,
                             qword_180117F08,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117CF8);
                        if ( qword_180117F08 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117F08,
                               0) != 0 )
                        {
                          v21 = sub_1800023C0(v0);
                          if ( v21 != 0 )
                          {
                            qword_180117F08 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                v0,
                                                v21);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v21);
                          }
                        }
                        sub_1800C6900(&unk_180117CF8);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                      }
                      if ( qword_180118280 == 0 )
                      {
                        qword_180118280 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL /*GetStaticMethodID*/))(
                                            v0,
                                            qword_180117F08,
                                            /*0xce9*/ "ati",
                                            /*0xcbb*/ "(Ljava/lang/String;[BJ)Ljava/lang/String;");
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                      }
                      v113[0] = sub_180002760(v0);
                      sub_1800036C0((__int64)&v109, v106, v113, v113);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                      v89 = v113[0];
                      sub_1800036C0((__int64)&v109, v106, v113, v113);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                      v113[0] = v88;
                      sub_1800036C0((__int64)&v109, v106, v113, v113);
                      if ( qword_180117F20 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                             v0,
                             qword_180117F20,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117D10);
                        if ( qword_180117F20 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117F20,
                               0) != 0 )
                        {
                          v22 = sub_1800023C0(v0);
                          if ( v22 != 0 )
                          {
                            qword_180117F20 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                v0,
                                                v22);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v22);
                          }
                        }
                        sub_1800C6900(&unk_180117D10);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                      }
                      if ( qword_180118248 == 0 )
                      {
                        qword_180118248 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                            v0,
                                            qword_180117F20,
                                            /*0x30bb*/ "getValue",
                                            /*0x2c89*/ "()Ljava/lang/Object;");
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                      }
                      if ( v113[0] != 0 )
                      {
                        v113[0] = sub_180002790(v0);
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                      }
                      else
                      {
                        sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x452*/ "INVOKEINTERFACE Object npe", 230);
                      }
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                      if ( qword_180117E08 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                             v0,
                             qword_180117E08,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117BF8);
                        if ( qword_180117E08 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117E08,
                               0) != 0 )
                        {
                          v23 = sub_1800023C0(v0);
                          if ( v23 != 0 )
                          {
                            qword_180117E08 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                v0,
                                                v23);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v23);
                          }
                        }
                        sub_1800C6900(&unk_180117BF8);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                      }
                      if ( v113[0] != 0
                        && (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)v0 + 256LL))(
                             v0,
                             v113[0],
                             qword_180117E08) == 0 )
                      {
                        v24 = qword_1801178A0;
                        sub_1800267D0(v111, /*0x3fa*/ "cannot cast to ");
                        sub_1800267D0(v94, /*0x30c4*/ "com/google/gson/JsonElement");
                        sub_180026770(&v109, v111, v94);
                        v25 = v110;
                        if ( (v109 & 1) != 0 )
                          v25 = *(_BYTE **)&v110[15];
                        sub_180002110(v0, v24 + 989, v25, 230);
                        if ( (v109 & 1) == 0 )
                        {
                          if ( (v94[0] & 1) == 0 )
                            goto LABEL_214;
LABEL_230:
                          sub_1800C0DC0(v94[2]);
                          if ( (v111[0] & 1) == 0 )
                            goto LABEL_216;
LABEL_215:
                          sub_1800C0DC0(v112);
                          goto LABEL_216;
                        }
                        sub_1800C0DC0(*(_QWORD *)&v110[15]);
                        if ( (v94[0] & 1) != 0 )
                          goto LABEL_230;
LABEL_214:
                        if ( (v111[0] & 1) != 0 )
                          goto LABEL_215;
LABEL_216:
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                      }
                      v90[0] = v113[0];
                      sub_1800036C0((__int64)&v109, v106, v113, v113);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                      v113[0] = v90[0];
                      sub_1800036C0((__int64)&v109, v106, v113, v113);
                      if ( qword_180117E08 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                             v0,
                             qword_180117E08,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117BF8);
                        if ( qword_180117E08 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117E08,
                               0) != 0 )
                        {
                          v26 = sub_1800023C0(v0);
                          if ( v26 != 0 )
                          {
                            qword_180117E08 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                v0,
                                                v26);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v26);
                          }
                        }
                        sub_1800C6900(&unk_180117BF8);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                      }
                      if ( qword_180118288 == 0 )
                      {
                        qword_180118288 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                            v0,
                                            qword_180117E08,
                                            /*0x3178*/ "isJsonArray",
                                            /*0x275b*/ "()Z");
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                      }
                      if ( v113[0] != 0 )
                        LODWORD(v113[0]) = (unsigned __int8)sub_1800BE240(v0, v113[0], qword_180118288);
                      else
                        sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x276f*/ "INVOKEVIRTUAL Boolean npe", 278);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                      if ( LODWORD(v113[0]) == 0 )
                        goto LABEL_736;
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                      v113[0] = v90[0];
                      sub_1800036C0((__int64)&v109, v106, v113, v113);
                      if ( qword_180117E08 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                             v0,
                             qword_180117E08,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117BF8);
                        if ( qword_180117E08 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117E08,
                               0) != 0 )
                        {
                          v27 = sub_1800023C0(v0);
                          if ( v27 != 0 )
                          {
                            qword_180117E08 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                v0,
                                                v27);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v27);
                          }
                        }
                        sub_1800C6900(&unk_180117BF8);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                      }
                      if ( qword_180118290 == 0 )
                      {
                        qword_180118290 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                            v0,
                                            qword_180117E08,
                                            /*0x3184*/ "getAsJsonArray",
                                            /*0x3193*/ "()Lcom/google/gson/JsonArray;");
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                      }
                      if ( v113[0] != 0 )
                      {
                        v113[0] = sub_180002790(v0);
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                      }
                      else
                      {
                        sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 345);
                      }
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                      v91 = v113[0];
                      sub_1800036C0((__int64)&v109, v106, v113, v113);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                      if ( qword_180117F38 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                             v0,
                             qword_180117F38,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117D28);
                        if ( qword_180117F38 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117F38,
                               0) != 0 )
                        {
                          v28 = sub_1800023C0(v0);
                          if ( v28 != 0 )
                          {
                            qword_180117F38 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                v0,
                                                v28);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v28);
                          }
                        }
                        sub_1800C6900(&unk_180117D28);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                      }
                      v29 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 216LL))(v0, qword_180117F38);
                      v111[0] = v29;
                      if ( v29 != 0 )
                      {
                        v113[0] = v29;
                        sub_1800036C0((__int64)&v109, v106, v111, v111);
                      }
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                      v108 = v113[0];
                      if ( qword_180117F38 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                             v0,
                             qword_180117F38,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117D28);
                        if ( qword_180117F38 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117F38,
                               0) != 0 )
                        {
                          v30 = sub_1800023C0(v0);
                          if ( v30 != 0 )
                          {
                            qword_180117F38 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                v0,
                                                v30);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v30);
                          }
                        }
                        sub_1800C6900(&unk_180117D28);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                      }
                      if ( qword_180118298 == 0 )
                      {
                        qword_180118298 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                            v0,
                                            qword_180117F38,
                                            /*0x48b*/ "<init>",
                                            /*0x4*/ "()V");
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                      }
                      if ( v108 != 0 )
                        sub_180026870(v0, v108, qword_180117F38, qword_180118298);
                      else
                        sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x4ab*/ "INVOKESPECIAL Void npe", 284);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                      v87 = v113[0];
                      sub_1800036C0((__int64)&v109, v106, v113, v113);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                        goto LABEL_779;
                      v113[0] = v91;
                      sub_1800036C0((__int64)&v109, v106, v113, v113);
                      if ( qword_180117F38 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                             v0,
                             qword_180117F38,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117D28);
                        if ( qword_180117F38 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117F38,
                               0) != 0 )
                        {
                          v31 = sub_1800023C0(v0);
                          if ( v31 != 0 )
                          {
                            qword_180117F38 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                v0,
                                                v31);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v31);
                          }
                        }
                        sub_1800C6900(&unk_180117D28);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                      }
                      if ( qword_1801182A0 == 0 )
                      {
                        qword_1801182A0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                            v0,
                                            qword_180117F38,
                                            /*0x2c40*/ "iterator",
                                            /*0x2c49*/ "()Ljava/util/Iterator;");
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                      }
                      if ( v113[0] != 0 )
                      {
                        v113[0] = sub_180002790(v0);
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                      }
                      else
                      {
                        sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 84);
                      }
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                      {
LABEL_779:
                        v74 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 120LL))(v0);
                        (*(void (__fastcall **)(__int64))(*(_QWORD *)v0 + 136LL))(v0);
                        v113[0] = v74;
                        v111[0] = v74;
                        sub_180026960(&v109, v106, v111, v111);
LABEL_780:
                        if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)v0 + 256LL))(
                               v0,
                               v113[0],
                               qword_180117D30) == 0 )
LABEL_834:
                          JUMPOUT(0x1800B7034LL);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) == 0 )
                        {
                          sub_180026DB0(v106, v113);
                          sub_180026DB0(v106, &v95);
                          sub_180026DB0(v106, &v99);
                          sub_180026DB0(v106, &v100);
                          sub_180026DB0(v106, &v96);
                          sub_180026DB0(v106, &v103);
                          sub_180026DB0(v106, &v97);
                          sub_180026DB0(v106, &v101);
                          sub_180026DB0(v106, &v104);
                          sub_180026DB0(v106, &v102);
                          sub_180026DB0(v106, &v98);
                          sub_180026DB0(v106, &v92);
                          sub_180026DB0(v106, &v93);
                          sub_180026DB0(v106, &v88);
                          sub_180026DB0(v106, &v105);
                          sub_180002660(v0, v106);
                          v89 = v113[0];
                          sub_1800036C0((__int64)&v109, v106, v113, v113);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) == 0 )
                          {
                            if ( qword_180117DD0 != 0
                              && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                   v0,
                                   qword_180117DD0,
                                   0) == 0 )
                            {
                              goto LABEL_793;
                            }
                            sub_1800C68B0(&unk_180117BC0);
                            if ( qword_180117DD0 == 0
                              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                   v0,
                                   qword_180117DD0,
                                   0) != 0 )
                            {
                              v75 = sub_1800023C0(v0);
                              if ( v75 != 0 )
                              {
                                qword_180117DD0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                    v0,
                                                    v75);
                                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v75);
                              }
                            }
                            sub_1800C6900(&unk_180117BC0);
                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) == 0 )
                            {
LABEL_793:
                              v113[0] = qword_180117DD0;
                              if ( qword_180117D40 != 0
                                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                     v0,
                                     qword_180117D40,
                                     0) == 0 )
                              {
                                goto LABEL_800;
                              }
                              sub_1800C68B0(&unk_180117B30);
                              if ( qword_180117D40 == 0
                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                     v0,
                                     qword_180117D40,
                                     0) != 0 )
                              {
                                v76 = sub_1800023C0(v0);
                                if ( v76 != 0 )
                                {
                                  qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                      v0,
                                                      v76);
                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v76);
                                }
                              }
                              sub_1800C6900(&unk_180117B30);
                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) == 0 )
                              {
LABEL_800:
                                if ( qword_180118300 != 0 )
                                  JUMPOUT(0x1800B3F48LL);
                                qword_180118300 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 1152LL /*GetMethodID*/))(
                                                    v0,
                                                    qword_180117D40,
                                                    /*0xa5*/ "a",
                                                    /*0xa3e*/ "[Ljava/lang/String;");
                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) == 0 )
                                  JUMPOUT(0x1800B3F41LL);
                              }
                            }
                          }
                          v77 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 120LL))(v0);
                          (*(void (__fastcall **)(__int64))(*(_QWORD *)v0 + 136LL))(v0);
                          v113[0] = v77;
                          v111[0] = v77;
                          sub_180026960(&v109, v106, v111, v111);
                          JUMPOUT(0x1800B680DLL);
                        }
                        goto LABEL_832;
                      }
                      v85 = v113[0];
                      sub_1800036C0((__int64)&v109, v106, v113, v113);
                      while ( 2 )
                      {
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        sub_180026DB0(v106, &v95);
                        sub_180026DB0(v106, &v99);
                        sub_180026DB0(v106, &v100);
                        sub_180026DB0(v106, &v96);
                        sub_180026DB0(v106, &v103);
                        sub_180026DB0(v106, &v97);
                        sub_180026DB0(v106, &v101);
                        sub_180026DB0(v106, &v104);
                        sub_180026DB0(v106, &v102);
                        sub_180026DB0(v106, &v98);
                        sub_180026DB0(v106, &v92);
                        sub_180026DB0(v106, &v93);
                        sub_180026DB0(v106, &v88);
                        sub_180026DB0(v106, &v89);
                        sub_180026DB0(v106, v90);
                        sub_180026DB0(v106, &v91);
                        sub_180026DB0(v106, &v87);
                        sub_180026DB0(v106, &v85);
                        sub_180026DB0(v106, &v105);
                        sub_180002660(v0, v106);
                        v113[0] = v85;
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                        if ( qword_180117E50 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117E50,
                               0) != 0 )
                        {
                          sub_1800C68B0(&unk_180117C40);
                          if ( qword_180117E50 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117E50,
                                 0) != 0 )
                          {
                            v32 = sub_1800023C0(v0);
                            if ( v32 != 0 )
                            {
                              qword_180117E50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                  v0,
                                                  v32);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v32);
                            }
                          }
                          sub_1800C6900(&unk_180117C40);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( qword_1801180B0 == 0 )
                        {
                          qword_1801180B0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                              v0,
                                              qword_180117E50,
                                              /*0x2c60*/ "hasNext",
                                              /*0x275b*/ "()Z");
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( v113[0] != 0 )
                          LODWORD(v113[0]) = (unsigned __int8)sub_1800BE240(v0, v113[0], qword_1801180B0);
                        else
                          sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x2c68*/ "INVOKEINTERFACE Boolean npe", 84);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        if ( LODWORD(v113[0]) == 0 )
                        {
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                          sub_180026DB0(v106, &v95);
                          sub_180026DB0(v106, &v99);
                          sub_180026DB0(v106, &v100);
                          sub_180026DB0(v106, &v96);
                          sub_180026DB0(v106, &v103);
                          sub_180026DB0(v106, &v97);
                          sub_180026DB0(v106, &v101);
                          sub_180026DB0(v106, &v104);
                          sub_180026DB0(v106, &v102);
                          sub_180026DB0(v106, &v98);
                          sub_180026DB0(v106, &v92);
                          sub_180026DB0(v106, &v93);
                          sub_180026DB0(v106, &v88);
                          sub_180026DB0(v106, &v89);
                          sub_180026DB0(v106, v90);
                          sub_180026DB0(v106, &v91);
                          sub_180026DB0(v106, &v87);
                          sub_180026DB0(v106, &v85);
                          sub_180026DB0(v106, &v105);
                          sub_180002660(v0, v106);
                          v113[0] = v92;
                          sub_1800036C0((__int64)&v109, v106, v113, v113);
                          v108 = v89;
                          sub_1800036C0((__int64)&v109, v106, &v108, &v108);
                          v107 = v87;
                          sub_1800036C0((__int64)&v109, v106, &v107, &v107);
                          if ( qword_180117E00 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117E00,
                                 0) != 0 )
                          {
                            sub_1800C68B0(&unk_180117BF0);
                            if ( qword_180117E00 == 0
                              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                   v0,
                                   qword_180117E00,
                                   0) != 0 )
                            {
                              v68 = sub_1800023C0(v0);
                              if ( v68 != 0 )
                              {
                                qword_180117E00 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                    v0,
                                                    v68);
                                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v68);
                              }
                            }
                            sub_1800C6900(&unk_180117BF0);
                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                              goto LABEL_779;
                          }
                          if ( qword_1801182B8 == 0 )
                          {
                            qword_1801182B8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                                v0,
                                                qword_180117E00,
                                                /*0x31d9*/ "add",
                                                /*0x31fe*/ "(Ljava/lang/String;Lcom/google/gson/JsonElement;)V");
                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                              goto LABEL_779;
                          }
                          if ( v113[0] != 0 )
                            sub_1800027F0(v0, v113[0], qword_1801182B8, v108);
                          else
                            sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x65b*/ "INVOKEVIRTUAL Void npe", 316);
                          v69 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0);
                          v16 = *(_QWORD *)v0;
                          if ( v69 != 0 )
                          {
LABEL_733:
                            v70 = (*(__int64 (__fastcall **)(__int64))(v16 + 120))(v0);
                            (*(void (__fastcall **)(__int64))(*(_QWORD *)v0 + 136LL))(v0);
                            v113[0] = v70;
                            v111[0] = v70;
                            sub_180026960(&v109, v106, v111, v111);
                            goto LABEL_780;
                          }
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(v16 + 1824))(v0) != 0 )
                            goto LABEL_779;
                          LODWORD(v113[0]) = v2;
                          if ( v2 == 0 )
                          {
LABEL_736:
                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                              goto LABEL_779;
                            sub_180026DB0(v106, &v95);
                            sub_180026DB0(v106, &v99);
                            sub_180026DB0(v106, &v100);
                            sub_180026DB0(v106, &v96);
                            sub_180026DB0(v106, &v103);
                            sub_180026DB0(v106, &v97);
                            sub_180026DB0(v106, &v101);
                            sub_180026DB0(v106, &v104);
                            sub_180026DB0(v106, &v102);
                            sub_180026DB0(v106, &v98);
                            sub_180026DB0(v106, &v92);
                            sub_180026DB0(v106, &v93);
                            sub_180026DB0(v106, &v88);
                            sub_180026DB0(v106, &v89);
                            sub_180026DB0(v106, v90);
                            sub_180026DB0(v106, &v105);
                            sub_180002660(v0, v106);
                            v113[0] = v90[0];
                            sub_1800036C0((__int64)&v109, v106, v113, v113);
                            if ( qword_180117E08 == 0
                              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                   v0,
                                   qword_180117E08,
                                   0) != 0 )
                            {
                              sub_1800C68B0(&unk_180117BF8);
                              if ( qword_180117E08 == 0
                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                     v0,
                                     qword_180117E08,
                                     0) != 0 )
                              {
                                v71 = sub_1800023C0(v0);
                                if ( v71 != 0 )
                                {
                                  qword_180117E08 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                      v0,
                                                      v71);
                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v71);
                                }
                              }
                              sub_1800C6900(&unk_180117BF8);
                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                                goto LABEL_779;
                            }
                            if ( qword_180118058 == 0 )
                            {
                              qword_180118058 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                                  v0,
                                                  qword_180117E08,
                                                  /*0x2b44*/ "getAsString",
                                                  /*0xc3b*/ "()Ljava/lang/String;");
                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                                goto LABEL_779;
                            }
                            if ( v113[0] != 0 )
                            {
                              v113[0] = sub_180002790(v0);
                              sub_1800036C0((__int64)&v109, v106, v113, v113);
                            }
                            else
                            {
                              sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 136);
                            }
                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                              goto LABEL_779;
                            v108 = v98;
                            sub_1800036C0((__int64)&v109, v106, &v108, &v108);
                            v107 = v94[3];
                            if ( qword_180117F08 == 0
                              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                   v0,
                                   qword_180117F08,
                                   0) != 0 )
                            {
                              sub_1800C68B0(&unk_180117CF8);
                              if ( qword_180117F08 == 0
                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                     v0,
                                     qword_180117F08,
                                     0) != 0 )
                              {
                                v72 = sub_1800023C0(v0);
                                if ( v72 != 0 )
                                {
                                  qword_180117F08 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                      v0,
                                                      v72);
                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v72);
                                }
                              }
                              sub_1800C6900(&unk_180117CF8);
                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                                goto LABEL_779;
                            }
                            if ( qword_180118280 == 0 )
                            {
                              qword_180118280 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL /*GetStaticMethodID*/))(
                                                  v0,
                                                  qword_180117F08,
                                                  /*0xce9*/ "ati",
                                                  /*0xcbb*/ "(Ljava/lang/String;[BJ)Ljava/lang/String;");
                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                                goto LABEL_779;
                            }
                            v113[0] = sub_180002760(v0);
                            sub_1800036C0((__int64)&v109, v106, v113, v113);
                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                              goto LABEL_779;
                            v91 = v113[0];
                            sub_1800036C0((__int64)&v109, v106, v113, v113);
                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                              goto LABEL_779;
                            v113[0] = v92;
                            sub_1800036C0((__int64)&v109, v106, v113, v113);
                            v108 = v89;
                            sub_1800036C0((__int64)&v109, v106, &v108, &v108);
                            v107 = v91;
                            sub_1800036C0((__int64)&v109, v106, &v107, &v107);
                            if ( qword_180117E00 == 0
                              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                   v0,
                                   qword_180117E00,
                                   0) != 0 )
                            {
                              sub_1800C68B0(&unk_180117BF0);
                              if ( qword_180117E00 == 0
                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                     v0,
                                     qword_180117E00,
                                     0) != 0 )
                              {
                                v73 = sub_1800023C0(v0);
                                if ( v73 != 0 )
                                {
                                  qword_180117E00 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                      v0,
                                                      v73);
                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v73);
                                }
                              }
                              sub_1800C6900(&unk_180117BF0);
                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                                goto LABEL_779;
                            }
                            if ( qword_1801182A8 == 0 )
                            {
                              qword_1801182A8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                                  v0,
                                                  qword_180117E00,
                                                  /*0x3144*/ "addProperty",
                                                  /*0x31b1*/ "(Ljava/lang/String;Ljava/lang/String;)V");
                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                                goto LABEL_779;
                            }
                            if ( v113[0] != 0 )
                              sub_1800027F0(v0, v113[0], qword_1801182A8, v108);
                            else
                              sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x65b*/ "INVOKEVIRTUAL Void npe", 276);
                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                              goto LABEL_779;
                          }
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) == 0 )
                          {
                            sub_180026DB0(v106, &v95);
                            sub_180026DB0(v106, &v99);
                            sub_180026DB0(v106, &v100);
                            sub_180026DB0(v106, &v96);
                            sub_180026DB0(v106, &v103);
                            sub_180026DB0(v106, &v97);
                            sub_180026DB0(v106, &v101);
                            sub_180026DB0(v106, &v104);
                            sub_180026DB0(v106, &v102);
                            sub_180026DB0(v106, &v98);
                            sub_180026DB0(v106, &v92);
                            sub_180026DB0(v106, &v93);
                            sub_180026DB0(v106, &v88);
                            sub_180026DB0(v106, &v89);
                            sub_180026DB0(v106, v90);
                            sub_180026DB0(v106, &v91);
                            sub_180026DB0(v106, &v105);
                            sub_180002660(v0, v106);
                            JUMPOUT(0x1800B6DCELL);
                          }
LABEL_832:
                          JUMPOUT(0x1800A4B0DLL);
                        }
                        v113[0] = v85;
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                        if ( qword_180117E50 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117E50,
                               0) != 0 )
                        {
                          sub_1800C68B0(&unk_180117C40);
                          if ( qword_180117E50 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117E50,
                                 0) != 0 )
                          {
                            v33 = sub_1800023C0(v0);
                            if ( v33 != 0 )
                            {
                              qword_180117E50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                  v0,
                                                  v33);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v33);
                            }
                          }
                          sub_1800C6900(&unk_180117C40);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( qword_1801180B8 == 0 )
                        {
                          qword_1801180B8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                              v0,
                                              qword_180117E50,
                                              /*0x2c84*/ "next",
                                              /*0x2c89*/ "()Ljava/lang/Object;");
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( v113[0] != 0 )
                        {
                          v113[0] = sub_180002790(v0);
                          sub_1800036C0((__int64)&v109, v106, v113, v113);
                        }
                        else
                        {
                          sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x452*/ "INVOKEINTERFACE Object npe", 84);
                        }
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        if ( qword_180117E08 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117E08,
                               0) != 0 )
                        {
                          sub_1800C68B0(&unk_180117BF8);
                          if ( qword_180117E08 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117E08,
                                 0) != 0 )
                          {
                            v34 = sub_1800023C0(v0);
                            if ( v34 != 0 )
                            {
                              qword_180117E08 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                  v0,
                                                  v34);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v34);
                            }
                          }
                          sub_1800C6900(&unk_180117BF8);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( v113[0] != 0
                          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)v0 + 256LL))(
                               v0,
                               v113[0],
                               qword_180117E08) == 0 )
                        {
                          v35 = qword_1801178A0;
                          sub_1800267D0(v111, /*0x3fa*/ "cannot cast to ");
                          sub_1800267D0(v94, /*0x30c4*/ "com/google/gson/JsonElement");
                          sub_180026770(&v109, v111, v94);
                          v36 = v110;
                          if ( (v109 & 1) != 0 )
                            v36 = *(_BYTE **)&v110[15];
                          sub_180002110(v0, v35 + 989, v36, 84);
                          if ( (v109 & 1) == 0 )
                          {
                            if ( (v94[0] & 1) == 0 )
                              goto LABEL_329;
LABEL_345:
                            sub_1800C0DC0(v94[2]);
                            if ( (v111[0] & 1) == 0 )
                              goto LABEL_331;
LABEL_330:
                            sub_1800C0DC0(v112);
                            goto LABEL_331;
                          }
                          sub_1800C0DC0(*(_QWORD *)&v110[15]);
                          if ( (v94[0] & 1) != 0 )
                            goto LABEL_345;
LABEL_329:
                          if ( (v111[0] & 1) != 0 )
                            goto LABEL_330;
LABEL_331:
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        v84 = v113[0];
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        v113[0] = v84;
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                        if ( qword_180117E08 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117E08,
                               0) != 0 )
                        {
                          sub_1800C68B0(&unk_180117BF8);
                          if ( qword_180117E08 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117E08,
                                 0) != 0 )
                          {
                            v37 = sub_1800023C0(v0);
                            if ( v37 != 0 )
                            {
                              qword_180117E08 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                  v0,
                                                  v37);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v37);
                            }
                          }
                          sub_1800C6900(&unk_180117BF8);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( qword_180118228 == 0 )
                        {
                          qword_180118228 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                              v0,
                                              qword_180117E08,
                                              /*0x3056*/ "getAsJsonObject",
                                              /*0x3066*/ "()Lcom/google/gson/JsonObject;");
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( v113[0] != 0 )
                        {
                          v113[0] = sub_180002790(v0);
                          sub_1800036C0((__int64)&v109, v106, v113, v113);
                        }
                        else
                        {
                          sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 273);
                        }
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        v82 = v113[0];
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        if ( qword_180117E00 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117E00,
                               0) != 0 )
                        {
                          sub_1800C68B0(&unk_180117BF0);
                          if ( qword_180117E00 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117E00,
                                 0) != 0 )
                          {
                            v38 = sub_1800023C0(v0);
                            if ( v38 != 0 )
                            {
                              qword_180117E00 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                  v0,
                                                  v38);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v38);
                            }
                          }
                          sub_1800C6900(&unk_180117BF0);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        v39 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 216LL))(v0, qword_180117E00);
                        v111[0] = v39;
                        if ( v39 != 0 )
                        {
                          v113[0] = v39;
                          sub_1800036C0((__int64)&v109, v106, v111, v111);
                        }
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        v108 = v113[0];
                        if ( qword_180117E00 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117E00,
                               0) != 0 )
                        {
                          sub_1800C68B0(&unk_180117BF0);
                          if ( qword_180117E00 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117E00,
                                 0) != 0 )
                          {
                            v40 = sub_1800023C0(v0);
                            if ( v40 != 0 )
                            {
                              qword_180117E00 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                  v0,
                                                  v40);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v40);
                            }
                          }
                          sub_1800C6900(&unk_180117BF0);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( qword_180118260 == 0 )
                        {
                          qword_180118260 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                              v0,
                                              qword_180117E00,
                                              /*0x48b*/ "<init>",
                                              /*0x4*/ "()V");
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( v108 != 0 )
                          sub_180026870(v0, v108, qword_180117E00, qword_180118260);
                        else
                          sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x4ab*/ "INVOKESPECIAL Void npe", 200);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        v86 = v113[0];
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        v113[0] = v82;
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                        if ( qword_180117E00 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117E00,
                               0) != 0 )
                        {
                          sub_1800C68B0(&unk_180117BF0);
                          if ( qword_180117E00 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117E00,
                                 0) != 0 )
                          {
                            v41 = sub_1800023C0(v0);
                            if ( v41 != 0 )
                            {
                              qword_180117E00 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                  v0,
                                                  v41);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v41);
                            }
                          }
                          sub_1800C6900(&unk_180117BF0);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( qword_180118230 == 0 )
                        {
                          qword_180118230 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                              v0,
                                              qword_180117E00,
                                              /*0x3085*/ "entrySet",
                                              /*0x308e*/ "()Ljava/util/Set;");
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( v113[0] != 0 )
                        {
                          v113[0] = sub_180002790(v0);
                          sub_1800036C0((__int64)&v109, v106, v113, v113);
                        }
                        else
                        {
                          sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 326);
                        }
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        if ( qword_180117F18 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117F18,
                               0) != 0 )
                        {
                          sub_1800C68B0(&unk_180117D08);
                          if ( qword_180117F18 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117F18,
                                 0) != 0 )
                          {
                            v42 = sub_1800023C0(v0);
                            if ( v42 != 0 )
                            {
                              qword_180117F18 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                  v0,
                                                  v42);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v42);
                            }
                          }
                          sub_1800C6900(&unk_180117D08);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( qword_180118238 == 0 )
                        {
                          qword_180118238 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                              v0,
                                              qword_180117F18,
                                              /*0x2c40*/ "iterator",
                                              /*0x2c49*/ "()Ljava/util/Iterator;");
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( v113[0] != 0 )
                        {
                          v113[0] = sub_180002790(v0);
                          sub_1800036C0((__int64)&v109, v106, v113, v113);
                        }
                        else
                        {
                          sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x452*/ "INVOKEINTERFACE Object npe", 326);
                        }
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        LODWORD(v108) = v2;
                        if ( v2 == 0 )
                          goto LABEL_32;
                        v83 = v113[0];
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
LABEL_403:
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        sub_180026DB0(v106, &v95);
                        sub_180026DB0(v106, &v99);
                        sub_180026DB0(v106, &v100);
                        sub_180026DB0(v106, &v96);
                        sub_180026DB0(v106, &v103);
                        sub_180026DB0(v106, &v97);
                        sub_180026DB0(v106, &v101);
                        sub_180026DB0(v106, &v104);
                        sub_180026DB0(v106, &v102);
                        sub_180026DB0(v106, &v98);
                        sub_180026DB0(v106, &v92);
                        sub_180026DB0(v106, &v93);
                        sub_180026DB0(v106, &v88);
                        sub_180026DB0(v106, &v89);
                        sub_180026DB0(v106, v90);
                        sub_180026DB0(v106, &v91);
                        sub_180026DB0(v106, &v87);
                        sub_180026DB0(v106, &v85);
                        sub_180026DB0(v106, &v84);
                        sub_180026DB0(v106, &v82);
                        sub_180026DB0(v106, &v86);
                        sub_180026DB0(v106, &v83);
                        sub_180026DB0(v106, &v105);
                        sub_180002660(v0, v106);
                        v113[0] = v83;
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                        if ( qword_180117E50 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117E50,
                               0) != 0 )
                        {
                          sub_1800C68B0(&unk_180117C40);
                          if ( qword_180117E50 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117E50,
                                 0) != 0 )
                          {
                            v43 = sub_1800023C0(v0);
                            if ( v43 != 0 )
                            {
                              qword_180117E50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                  v0,
                                                  v43);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v43);
                            }
                          }
                          sub_1800C6900(&unk_180117C40);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( qword_1801180B0 == 0 )
                        {
                          qword_1801180B0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                              v0,
                                              qword_180117E50,
                                              /*0x2c60*/ "hasNext",
                                              /*0x275b*/ "()Z");
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( v113[0] != 0 )
                          LODWORD(v113[0]) = (unsigned __int8)sub_1800BE240(v0, v113[0], qword_1801180B0);
                        else
                          sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x2c68*/ "INVOKEINTERFACE Boolean npe", 326);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        if ( LODWORD(v113[0]) == 0 )
                          goto LABEL_585;
                        v113[0] = v83;
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                        if ( qword_180117E50 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117E50,
                               0) != 0 )
                        {
                          sub_1800C68B0(&unk_180117C40);
                          if ( qword_180117E50 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117E50,
                                 0) != 0 )
                          {
                            v44 = sub_1800023C0(v0);
                            if ( v44 != 0 )
                            {
                              qword_180117E50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                  v0,
                                                  v44);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v44);
                            }
                          }
                          sub_1800C6900(&unk_180117C40);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( qword_1801180B8 == 0 )
                        {
                          qword_1801180B8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                              v0,
                                              qword_180117E50,
                                              /*0x2c84*/ "next",
                                              /*0x2c89*/ "()Ljava/lang/Object;");
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( v113[0] != 0 )
                        {
                          v113[0] = sub_180002790(v0);
                          sub_1800036C0((__int64)&v109, v106, v113, v113);
                        }
                        else
                        {
                          sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x452*/ "INVOKEINTERFACE Object npe", 326);
                        }
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        if ( qword_180117F20 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117F20,
                               0) != 0 )
                        {
                          sub_1800C68B0(&unk_180117D10);
                          if ( qword_180117F20 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117F20,
                                 0) != 0 )
                          {
                            v45 = sub_1800023C0(v0);
                            if ( v45 != 0 )
                            {
                              qword_180117F20 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                  v0,
                                                  v45);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v45);
                            }
                          }
                          sub_1800C6900(&unk_180117D10);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( v113[0] != 0
                          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)v0 + 256LL))(
                               v0,
                               v113[0],
                               qword_180117F20) == 0 )
                        {
                          v46 = qword_1801178A0;
                          sub_1800267D0(v111, /*0x3fa*/ "cannot cast to ");
                          sub_1800267D0(v94, /*0x30a0*/ "java/util/Map$Entry");
                          sub_180026770(&v109, v111, v94);
                          v47 = v110;
                          if ( (v109 & 1) != 0 )
                            v47 = *(_BYTE **)&v110[15];
                          sub_180002110(v0, v46 + 989, v47, 326);
                          if ( (v109 & 1) == 0 )
                          {
                            if ( (v94[0] & 1) == 0 )
                              goto LABEL_444;
LABEL_460:
                            sub_1800C0DC0(v94[2]);
                            if ( (v111[0] & 1) == 0 )
                              goto LABEL_446;
LABEL_445:
                            sub_1800C0DC0(v112);
                            goto LABEL_446;
                          }
                          sub_1800C0DC0(*(_QWORD *)&v110[15]);
                          if ( (v94[0] & 1) != 0 )
                            goto LABEL_460;
LABEL_444:
                          if ( (v111[0] & 1) != 0 )
                            goto LABEL_445;
LABEL_446:
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        v81 = v113[0];
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        v113[0] = v81;
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                        if ( qword_180117F20 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117F20,
                               0) != 0 )
                        {
                          sub_1800C68B0(&unk_180117D10);
                          if ( qword_180117F20 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117F20,
                                 0) != 0 )
                          {
                            v48 = sub_1800023C0(v0);
                            if ( v48 != 0 )
                            {
                              qword_180117F20 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                  v0,
                                                  v48);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v48);
                            }
                          }
                          sub_1800C6900(&unk_180117D10);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( qword_180118240 == 0 )
                        {
                          qword_180118240 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                              v0,
                                              qword_180117F20,
                                              /*0x30b4*/ "getKey",
                                              /*0x2c89*/ "()Ljava/lang/Object;");
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( v113[0] != 0 )
                        {
                          v113[0] = sub_180002790(v0);
                          sub_1800036C0((__int64)&v109, v106, v113, v113);
                        }
                        else
                        {
                          sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x452*/ "INVOKEINTERFACE Object npe", 328);
                        }
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        if ( qword_180117E70 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117E70,
                               0) != 0 )
                        {
                          sub_1800C68B0(&unk_180117C60);
                          if ( qword_180117E70 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117E70,
                                 0) != 0 )
                          {
                            v49 = sub_1800023C0(v0);
                            if ( v49 != 0 )
                            {
                              qword_180117E70 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                  v0,
                                                  v49);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v49);
                            }
                          }
                          sub_1800C6900(&unk_180117C60);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( v113[0] != 0
                          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)v0 + 256LL))(
                               v0,
                               v113[0],
                               qword_180117E70) == 0 )
                        {
                          v50 = qword_1801178A0;
                          sub_1800267D0(v111, /*0x3fa*/ "cannot cast to ");
                          sub_1800267D0(v94, /*0xb38*/ "java/lang/String");
                          sub_180026770(&v109, v111, v94);
                          v51 = v110;
                          if ( (v109 & 1) != 0 )
                            v51 = *(_BYTE **)&v110[15];
                          sub_180002110(v0, v50 + 989, v51, 328);
                          if ( (v109 & 1) == 0 )
                          {
                            if ( (v94[0] & 1) == 0 )
                              goto LABEL_477;
LABEL_503:
                            sub_1800C0DC0(v94[2]);
                            if ( (v111[0] & 1) == 0 )
                              goto LABEL_479;
LABEL_478:
                            sub_1800C0DC0(v112);
                            goto LABEL_479;
                          }
                          sub_1800C0DC0(*(_QWORD *)&v110[15]);
                          if ( (v94[0] & 1) != 0 )
                            goto LABEL_503;
LABEL_477:
                          if ( (v111[0] & 1) != 0 )
                            goto LABEL_478;
LABEL_479:
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        v108 = v98;
                        sub_1800036C0((__int64)&v109, v106, &v108, &v108);
                        v107 = v94[3];
                        if ( qword_180117F08 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117F08,
                               0) != 0 )
                        {
                          sub_1800C68B0(&unk_180117CF8);
                          if ( qword_180117F08 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117F08,
                                 0) != 0 )
                          {
                            v52 = sub_1800023C0(v0);
                            if ( v52 != 0 )
                            {
                              qword_180117F08 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                  v0,
                                                  v52);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v52);
                            }
                          }
                          sub_1800C6900(&unk_180117CF8);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( qword_180118280 == 0 )
                        {
                          qword_180118280 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL /*GetStaticMethodID*/))(
                                              v0,
                                              qword_180117F08,
                                              /*0xce9*/ "ati",
                                              /*0xcbb*/ "(Ljava/lang/String;[BJ)Ljava/lang/String;");
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        v113[0] = sub_180002760(v0);
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        v78 = v113[0];
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        v113[0] = v81;
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                        if ( qword_180117F20 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117F20,
                               0) != 0 )
                        {
                          sub_1800C68B0(&unk_180117D10);
                          if ( qword_180117F20 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117F20,
                                 0) != 0 )
                          {
                            v53 = sub_1800023C0(v0);
                            if ( v53 != 0 )
                            {
                              qword_180117F20 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                  v0,
                                                  v53);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v53);
                            }
                          }
                          sub_1800C6900(&unk_180117D10);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( qword_180118248 == 0 )
                        {
                          qword_180118248 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                              v0,
                                              qword_180117F20,
                                              /*0x30bb*/ "getValue",
                                              /*0x2c89*/ "()Ljava/lang/Object;");
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( v113[0] != 0 )
                        {
                          v113[0] = sub_180002790(v0);
                          sub_1800036C0((__int64)&v109, v106, v113, v113);
                        }
                        else
                        {
                          sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x452*/ "INVOKEINTERFACE Object npe", 272);
                        }
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        if ( qword_180117E08 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117E08,
                               0) != 0 )
                        {
                          sub_1800C68B0(&unk_180117BF8);
                          if ( qword_180117E08 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117E08,
                                 0) != 0 )
                          {
                            v54 = sub_1800023C0(v0);
                            if ( v54 != 0 )
                            {
                              qword_180117E08 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                  v0,
                                                  v54);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v54);
                            }
                          }
                          sub_1800C6900(&unk_180117BF8);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( v113[0] != 0
                          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)v0 + 256LL))(
                               v0,
                               v113[0],
                               qword_180117E08) == 0 )
                        {
                          v55 = qword_1801178A0;
                          sub_1800267D0(v111, /*0x3fa*/ "cannot cast to ");
                          sub_1800267D0(v94, /*0x30c4*/ "com/google/gson/JsonElement");
                          sub_180026770(&v109, v111, v94);
                          v56 = v110;
                          if ( (v109 & 1) != 0 )
                            v56 = *(_BYTE **)&v110[15];
                          sub_180002110(v0, v55 + 989, v56, 272);
                          if ( (v109 & 1) == 0 )
                          {
                            if ( (v94[0] & 1) == 0 )
                              goto LABEL_520;
LABEL_535:
                            sub_1800C0DC0(v94[2]);
                            if ( (v111[0] & 1) == 0 )
                              goto LABEL_522;
LABEL_521:
                            sub_1800C0DC0(v112);
                            goto LABEL_522;
                          }
                          sub_1800C0DC0(*(_QWORD *)&v110[15]);
                          if ( (v94[0] & 1) != 0 )
                            goto LABEL_535;
LABEL_520:
                          if ( (v111[0] & 1) != 0 )
                            goto LABEL_521;
LABEL_522:
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( qword_180117E08 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117E08,
                               0) != 0 )
                        {
                          sub_1800C68B0(&unk_180117BF8);
                          if ( qword_180117E08 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117E08,
                                 0) != 0 )
                          {
                            v57 = sub_1800023C0(v0);
                            if ( v57 != 0 )
                            {
                              qword_180117E08 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                  v0,
                                                  v57);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v57);
                            }
                          }
                          sub_1800C6900(&unk_180117BF8);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( qword_180118058 == 0 )
                        {
                          qword_180118058 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                              v0,
                                              qword_180117E08,
                                              /*0x2b44*/ "getAsString",
                                              /*0xc3b*/ "()Ljava/lang/String;");
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( v113[0] != 0 )
                        {
                          v113[0] = sub_180002790(v0);
                          sub_1800036C0((__int64)&v109, v106, v113, v113);
                        }
                        else
                        {
                          sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 272);
                        }
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        v108 = v98;
                        sub_1800036C0((__int64)&v109, v106, &v108, &v108);
                        v107 = v94[3];
                        if ( qword_180117F08 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117F08,
                               0) != 0 )
                        {
                          sub_1800C68B0(&unk_180117CF8);
                          if ( qword_180117F08 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117F08,
                                 0) != 0 )
                          {
                            v58 = sub_1800023C0(v0);
                            if ( v58 != 0 )
                            {
                              qword_180117F08 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                  v0,
                                                  v58);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v58);
                            }
                          }
                          sub_1800C6900(&unk_180117CF8);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        if ( qword_180118280 == 0 )
                        {
                          qword_180118280 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL /*GetStaticMethodID*/))(
                                              v0,
                                              qword_180117F08,
                                              /*0xce9*/ "ati",
                                              /*0xcbb*/ "(Ljava/lang/String;[BJ)Ljava/lang/String;");
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                        }
                        v113[0] = sub_180002760(v0);
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_779;
                        v79 = v113[0];
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          goto LABEL_564;
                        v113[0] = v86;
                        sub_1800036C0((__int64)&v109, v106, v113, v113);
                        v108 = v78;
                        sub_1800036C0((__int64)&v109, v106, &v108, &v108);
                        v107 = v79;
                        sub_1800036C0((__int64)&v109, v106, &v107, &v107);
                        if ( qword_180117E00 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                               v0,
                               qword_180117E00,
                               0) != 0 )
                        {
                          sub_1800C68B0(&unk_180117BF0);
                          if ( qword_180117E00 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117E00,
                                 0) != 0 )
                          {
                            v59 = sub_1800023C0(v0);
                            if ( v59 != 0 )
                            {
                              qword_180117E00 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                  v0,
                                                  v59);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v59);
                            }
                          }
                          sub_1800C6900(&unk_180117BF0);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_564;
                        }
                        if ( qword_1801182A8 == 0 )
                        {
                          qword_1801182A8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                              v0,
                                              qword_180117E00,
                                              /*0x3144*/ "addProperty",
                                              /*0x31b1*/ "(Ljava/lang/String;Ljava/lang/String;)V");
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                          {
LABEL_564:
                            v62 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 120LL))(v0);
                            (*(void (__fastcall **)(__int64))(*(_QWORD *)v0 + 136LL))(v0);
                            v113[0] = v62;
                            v111[0] = v62;
                            sub_180026960(&v109, v106, v111, v111);
                            goto LABEL_569;
                          }
                        }
                        if ( v113[0] != 0 )
                          sub_1800027F0(v0, v113[0], qword_1801182A8, v108);
                        else
                          sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x65b*/ "INVOKEVIRTUAL Void npe", 125);
                        v60 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0);
                        v61 = *(_QWORD *)v0;
                        if ( v60 != 0 )
                        {
                          v63 = (*(__int64 (__fastcall **)(__int64))(v61 + 120))(v0);
                          (*(void (__fastcall **)(__int64))(*(_QWORD *)v0 + 136LL))(v0);
                          v113[0] = v63;
                          v111[0] = v63;
                          sub_180026960(&v109, v106, v111, v111);
LABEL_569:
                          if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)v0 + 256LL))(
                                 v0,
                                 v113[0],
                                 qword_180117D30) == 0 )
                            goto LABEL_834;
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                          sub_180026DB0(v106, v113);
                          sub_180026DB0(v106, &v95);
                          sub_180026DB0(v106, &v99);
                          sub_180026DB0(v106, &v100);
                          sub_180026DB0(v106, &v96);
                          sub_180026DB0(v106, &v103);
                          sub_180026DB0(v106, &v97);
                          sub_180026DB0(v106, &v101);
                          sub_180026DB0(v106, &v104);
                          sub_180026DB0(v106, &v102);
                          sub_180026DB0(v106, &v98);
                          sub_180026DB0(v106, &v92);
                          sub_180026DB0(v106, &v93);
                          sub_180026DB0(v106, &v88);
                          sub_180026DB0(v106, &v89);
                          sub_180026DB0(v106, v90);
                          sub_180026DB0(v106, &v91);
                          sub_180026DB0(v106, &v87);
                          sub_180026DB0(v106, &v85);
                          sub_180026DB0(v106, &v84);
                          sub_180026DB0(v106, &v82);
                          sub_180026DB0(v106, &v86);
                          sub_180026DB0(v106, &v83);
                          sub_180026DB0(v106, &v81);
                          sub_180026DB0(v106, &v78);
                          sub_180026DB0(v106, &v79);
                          sub_180026DB0(v106, &v105);
                          sub_180002660(v0, v106);
                          if ( qword_180117D40 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117D40,
                                 0) != 0 )
                          {
                            sub_1800C68B0(&unk_180117B30);
                            if ( qword_180117D40 == 0
                              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                   v0,
                                   qword_180117D40,
                                   0) != 0 )
                            {
                              v64 = sub_1800023C0(v0);
                              if ( v64 != 0 )
                              {
                                qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                    v0,
                                                    v64);
                                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v64);
                              }
                            }
                            sub_1800C6900(&unk_180117B30);
                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                              goto LABEL_779;
                          }
                          if ( qword_1801180F0 == 0 )
                          {
                            qword_1801180F0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL /*GetStaticMethodID*/))(
                                                v0,
                                                qword_180117D40,
                                                /*0xa5*/ "a",
                                                /*0x2d17*/ "(Ljava/lang/Throwable;)Ljava/lang/Throwable;");
                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                              goto LABEL_779;
                          }
                          v113[0] = sub_180002760(v0);
                          sub_1800036C0((__int64)&v109, v106, v113, v113);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                          v65 = v113[0];
                          if ( v113[0] != 0 )
                          {
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 104LL))(v0, v113[0]);
                            v111[0] = v65;
                            sub_180026960(&v109, v106, v111, v111);
                          }
                          else
                          {
                            sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x29a*/ "ATHROW npe", 298);
                          }
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
LABEL_585:
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                            goto LABEL_779;
                          sub_180026DB0(v106, &v95);
                          sub_180026DB0(v106, &v99);
                          sub_180026DB0(v106, &v100);
                          sub_180026DB0(v106, &v96);
                          sub_180026DB0(v106, &v103);
                          sub_180026DB0(v106, &v97);
                          sub_180026DB0(v106, &v101);
                          sub_180026DB0(v106, &v104);
                          sub_180026DB0(v106, &v102);
                          sub_180026DB0(v106, &v98);
                          sub_180026DB0(v106, &v92);
                          sub_180026DB0(v106, &v93);
                          sub_180026DB0(v106, &v88);
                          sub_180026DB0(v106, &v89);
                          sub_180026DB0(v106, v90);
                          sub_180026DB0(v106, &v91);
                          sub_180026DB0(v106, &v87);
                          sub_180026DB0(v106, &v85);
                          sub_180026DB0(v106, &v84);
                          sub_180026DB0(v106, &v82);
                          sub_180026DB0(v106, &v86);
                          sub_180026DB0(v106, &v83);
                          sub_180026DB0(v106, &v105);
                          sub_180002660(v0, v106);
                          v113[0] = v87;
                          sub_1800036C0((__int64)&v109, v106, v113, v113);
                          v108 = v86;
                          sub_1800036C0((__int64)&v109, v106, &v108, &v108);
                          if ( qword_180117F38 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                 v0,
                                 qword_180117F38,
                                 0) != 0 )
                          {
                            sub_1800C68B0(&unk_180117D28);
                            if ( qword_180117F38 == 0
                              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL /*ExceptionCheck*/))(
                                   v0,
                                   qword_180117F38,
                                   0) != 0 )
                            {
                              v66 = sub_1800023C0(v0);
                              if ( v66 != 0 )
                              {
                                qword_180117F38 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL /*NewGlobalRef(id)*/))(
                                                    v0,
                                                    v66);
                                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL /*DeleteLocalRef*/))(v0, v66);
                              }
                            }
                            sub_1800C6900(&unk_180117D28);
                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                              goto LABEL_779;
                          }
                          if ( qword_1801182B0 == 0 )
                          {
                            qword_1801182B0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL /*GetFieldID*/))(
                                                v0,
                                                qword_180117F38,
                                                /*0x31d9*/ "add",
                                                /*0x31dd*/ "(Lcom/google/gson/JsonElement;)V");
                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                              goto LABEL_779;
                          }
                          if ( v113[0] != 0 )
                            sub_1800027F0(v0, v113[0], qword_1801182B0, v108);
                          else
                            sub_180002110(v0, /*0x6d*/ "java/lang/NullPointerException", /*0x65b*/ "INVOKEVIRTUAL Void npe", 94);
                          v67 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0);
                          v16 = *(_QWORD *)v0;
                          if ( v67 != 0 )
                            goto LABEL_733;
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(v16 + 1824))(v0) != 0 )
                            goto LABEL_779;
                          sub_180026DB0(v106, &v95);
                          sub_180026DB0(v106, &v99);
                          sub_180026DB0(v106, &v100);
                          sub_180026DB0(v106, &v96);
                          sub_180026DB0(v106, &v103);
                          sub_180026DB0(v106, &v97);
                          sub_180026DB0(v106, &v101);
                          sub_180026DB0(v106, &v104);
                          sub_180026DB0(v106, &v102);
                          sub_180026DB0(v106, &v98);
                          sub_180026DB0(v106, &v92);
                          sub_180026DB0(v106, &v93);
                          sub_180026DB0(v106, &v88);
                          sub_180026DB0(v106, &v89);
                          sub_180026DB0(v106, v90);
                          sub_180026DB0(v106, &v91);
                          sub_180026DB0(v106, &v87);
                          sub_180026DB0(v106, &v85);
                          sub_180026DB0(v106, &v84);
                          sub_180026DB0(v106, &v82);
                          sub_180026DB0(v106, &v86);
                          sub_180026DB0(v106, &v83);
                          sub_180026DB0(v106, &v105);
                          sub_180002660(v0, v106);
                          LODWORD(v113[0]) = v2;
                          continue;
                        }
                        break;
                      }
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(v61 + 1824))(v0) != 0 )
                        goto LABEL_564;
                      LODWORD(v113[0]) = v2;
                      goto LABEL_403;
                    }
                  }
                  v8 = qword_1801178A0;
                  sub_1800267D0(v111, /*0x3fa*/ "cannot cast to ");
                  sub_1800267D0(v94, /*0x30a0*/ "java/util/Map$Entry");
                  sub_180026770(&v109, v111, v94);
                  v9 = v110;
                  if ( (v109 & 1) != 0 )
                    v9 = *(_BYTE **)&v110[15];
                  sub_180002110(v0, v8 + 989, v9, 204);
                  if ( (v109 & 1) != 0 )
                  {
                    sub_1800C0DC0(*(_QWORD *)&v110[15]);
                    if ( (v94[0] & 1) == 0 )
                    {
LABEL_73:
                      if ( (v111[0] & 1) == 0 )
                        goto LABEL_75;
                      goto LABEL_74;
                    }
                  }
                  else if ( (v94[0] & 1) == 0 )
                  {
                    goto LABEL_73;
                  }
                  sub_1800C0DC0(v94[2]);
                  if ( (v111[0] & 1) == 0 )
                  {
LABEL_75:
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL /*ExceptionCheck*/))(v0) != 0 )
                      goto LABEL_832;
                    goto LABEL_76;
                  }
LABEL_74:
                  sub_1800C0DC0(v112);
                  goto LABEL_75;
                }
              }
            }
          }
        }
      }
    }
  }
  JUMPOUT(0x1800A4B0ALL);
}


/* ===== chunk 1800B3F41 .. 1800B9361 ===== */
/* decompile failed */