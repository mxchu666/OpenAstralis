/* ===== chunk 18007A850 .. 180082844 ===== */
__int64 __fastcall sub_18007A850(__int64 a1, __int64 a2, __int64 a3)
{
  __int64 v6; // r15
  __int64 result; // rax
  __int64 v8; // rdi
  __int64 v9; // rax
  __int64 v10; // r15
  __int64 v11; // rax
  __int64 v12; // r15
  __int64 v13; // r13
  __int64 v14; // rbx
  int v15; // r14d
  __int64 v16; // rbx
  __int64 v17; // rbx
  __int64 v18; // rbx
  __int64 v19; // rbx
  __int64 v20; // rbx
  __int64 v21; // r8
  __int64 v22; // rbx
  __int64 v23; // rbx
  __int64 v24; // rbx
  __int64 v25; // rbx
  char v26; // al
  __int64 v27; // rdx
  __int64 v28; // rbx
  __int64 v29; // rbx
  __int64 v30; // r9
  __int64 v31; // rbx
  __int64 v32; // rbx
  __int64 v33; // rbx
  __int64 v34; // rbx
  __int64 v35; // rbx
  __int64 v36; // rbx
  __int64 v37; // rbx
  char v38; // al
  __int64 v39; // rdx
  __int64 v40; // rbx
  __int64 v41; // rbx
  __int64 v42; // rbx
  __int64 v43; // rbx
  __int64 v44; // rbx
  __int64 v45; // rbx
  _BYTE *v46; // r8
  __int64 v47; // rbx
  __int64 v48; // rbx
  __int64 v49; // rbx
  _BYTE *v50; // r8
  __int64 v51; // rbx
  __int64 v52; // rbx
  __int64 v53; // r8
  __int64 v54; // r13
  __int64 v55; // r12
  __int64 v56; // r8
  __int64 v57; // r12
  __int64 v58; // rax
  __int64 v59; // r9
  __int64 v60; // rbx
  __int64 v61; // rbx
  __int64 v62; // rbx
  __int64 v63; // rbx
  __int64 v64; // rbx
  __int64 v65; // r8
  __int64 v66; // rbx
  __int64 v67; // rbx
  __int64 v68; // rax
  __int64 v69; // rbx
  __int64 v70; // r15
  __int64 v71; // rbx
  __int64 v72; // r15
  __int64 v73; // rbx
  __int64 v74; // rbx
  char v75; // al
  __int64 v76; // rdx
  __int64 v77; // rbx
  __int64 v78; // rbx
  __int64 v79; // rbx
  __int64 v80; // rbx
  __int64 v81; // rbx
  _BYTE *v82; // r8
  __int64 v83; // rbx
  __int64 v84; // rbx
  __int64 v85; // r8
  __int64 v86; // r15
  __int64 v87; // rbx
  char v88; // al
  __int64 v89; // rbx
  __int64 v90; // rbx
  __int64 v91; // r15
  __int64 v92; // r15
  __int64 v93; // r15
  __int64 v94; // r15
  _BYTE *v95; // r8
  __int64 v96; // [rsp+20h] [rbp-60h]
  _QWORD v97[2]; // [rsp+58h] [rbp-28h] BYREF
  __int64 v98; // [rsp+68h] [rbp-18h]
  _BYTE v99[16]; // [rsp+70h] [rbp-10h] BYREF
  __int64 v100; // [rsp+80h] [rbp+0h]
  __int64 v101; // [rsp+88h] [rbp+8h] BYREF
  __int64 v102; // [rsp+90h] [rbp+10h]
  __int64 v103; // [rsp+98h] [rbp+18h]
  __int64 v104; // [rsp+A0h] [rbp+20h] BYREF
  __int64 v105; // [rsp+A8h] [rbp+28h] BYREF
  __int64 v106; // [rsp+B0h] [rbp+30h] BYREF
  __int64 v107; // [rsp+B8h] [rbp+38h] BYREF
  __int64 v108; // [rsp+C0h] [rbp+40h] BYREF
  __int64 v109; // [rsp+C8h] [rbp+48h] BYREF
  __int64 v110; // [rsp+D0h] [rbp+50h] BYREF
  __int64 v111; // [rsp+D8h] [rbp+58h] BYREF
  _QWORD v112[4]; // [rsp+E0h] [rbp+60h] BYREF
  int v113; // [rsp+100h] [rbp+80h]
  char v114; // [rsp+110h] [rbp+90h] BYREF
  _BYTE v115[15]; // [rsp+111h] [rbp+91h] BYREF
  _BYTE *v116; // [rsp+120h] [rbp+A0h]
  __int64 v117[2]; // [rsp+128h] [rbp+A8h] BYREF
  __int64 v118; // [rsp+138h] [rbp+B8h]
  __int64 v119[8]; // [rsp+140h] [rbp+C0h] BYREF

  v6 = sub_180002590();
  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
  if ( (_BYTE)result == 0 )
  {
    v8 = sub_1800025D0(a1, v6);
    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
    if ( (_BYTE)result == 0 )
    {
      if ( v8 == 0 )
        return (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 144LL))(a1, qword_1801178A0 + 8);
      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v6);
      sub_1800023C0(a1);
      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
      if ( (_BYTE)result == 0 )
      {
        if ( qword_180117D30 != 0
          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
               a1,
               qword_180117D30,
               0) == 0 )
        {
          goto LABEL_771;
        }
        sub_1800C68B0(&unk_180117B20);
        if ( qword_180117D30 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
               a1,
               qword_180117D30,
               0) != 0 )
        {
          v9 = sub_1800023C0(a1);
          if ( v9 != 0 )
          {
            v10 = v9;
            qword_180117D30 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v9);
            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v10);
          }
        }
        sub_1800C6900(&unk_180117B20);
        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
        if ( (_BYTE)result == 0 )
        {
LABEL_771:
          if ( qword_180117D38 != 0
            && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                 a1,
                 qword_180117D38,
                 0) == 0 )
          {
            goto LABEL_20;
          }
          sub_1800C68B0(&unk_180117B28);
          if ( qword_180117D38 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                 a1,
                 qword_180117D38,
                 0) != 0 )
          {
            v11 = sub_1800023C0(a1);
            if ( v11 != 0 )
            {
              v12 = v11;
              qword_180117D38 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v11);
              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v12);
            }
          }
          sub_1800C6900(&unk_180117B28);
          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
          if ( (_BYTE)result == 0 )
          {
LABEL_20:
            v119[0] = 0;
            v111 = 0;
            v101 = 0;
            v106 = 0;
            v107 = 0;
            v97[0] = 0;
            v110 = 0;
            v105 = 0;
            v104 = 0;
            v102 = 0;
            v103 = 0;
            v98 = 0;
            v97[1] = 0;
            v109 = 0;
            memset(v112, 0, sizeof(v112));
            v113 = 1065353216;
            v108 = a2;
            sub_1800036C0((__int64)&v114, (float *)v112, &v108, &v108);
            v106 = a3;
            sub_1800036C0((__int64)&v114, (float *)v112, &v106, &v106);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              return sub_180003630(v112);
            v119[0] = 0x1BDA0E5D6FD6LL;
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              return sub_180003630(v112);
            v13 = v119[0];
            if ( qword_180117D40 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                   a1,
                   qword_180117D40,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117B30);
              if ( qword_180117D40 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117D40,
                     0) != 0 )
              {
                v14 = sub_1800023C0(a1);
                if ( v14 != 0 )
                {
                  qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v14);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v14);
                }
              }
              sub_1800C6900(&unk_180117B30);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                return sub_180003630(v112);
            }
            if ( qword_180117F40 == 0 )
            {
              qword_180117F40 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                  a1,
                                  qword_180117D40,
                                  qword_1801178A0 + 10071,
                                  qword_1801178A0 + 10075);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                return sub_180003630(v112);
            }
            LODWORD(v119[0]) = (unsigned __int8)sub_1800BE210(a1, qword_180117D40);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0
              || (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
            {
              return sub_180003630(v112);
            }
            v15 = v119[0];
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_177;
            v119[0] = v108;
            sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
            v111 = v106;
            sub_1800036C0((__int64)&v114, (float *)v112, &v111, &v111);
            if ( qword_180117D40 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                   a1,
                   qword_180117D40,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117B30);
              if ( qword_180117D40 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117D40,
                     0) != 0 )
              {
                v16 = sub_1800023C0(a1);
                if ( v16 != 0 )
                {
                  qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v16);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v16);
                }
              }
              sub_1800C6900(&unk_180117B30);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_177;
            }
            if ( qword_180118048 == 0 )
            {
              qword_180118048 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                  a1,
                                  qword_180117D40,
                                  qword_1801178A0 + 10973,
                                  qword_1801178A0 + 10977);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_177;
            }
            if ( v119[0] != 0 )
            {
              v119[0] = sub_180002790(a1);
              sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
            }
            else
            {
              sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 140, 50);
            }
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_177;
            v107 = v119[0];
            sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_177;
            v119[0] = v107;
            sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
            if ( qword_180117D40 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                   a1,
                   qword_180117D40,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117B30);
              if ( qword_180117D40 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117D40,
                     0) != 0 )
              {
                v17 = sub_1800023C0(a1);
                if ( v17 != 0 )
                {
                  qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v17);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v17);
                }
              }
              sub_1800C6900(&unk_180117B30);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_177;
            }
            if ( qword_180118300 == 0 )
            {
              qword_180118300 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL))(
                                  a1,
                                  qword_180117D40,
                                  qword_1801178A0 + 165,
                                  qword_1801178A0 + 2622);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_177;
            }
            v111 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1160LL))(a1, qword_180117D40);
            sub_1800036C0((__int64)&v114, (float *)v112, &v111, &v111);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_177;
            v109 = v111;
            sub_1800036C0((__int64)&v114, (float *)v112, &v111, &v111);
            v111 = v109;
            sub_1800036C0((__int64)&v114, (float *)v112, &v111, &v111);
            if ( v111 != 0 )
            {
              v111 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 1384LL))(a1, v111, 12);
              sub_1800036C0((__int64)&v114, (float *)v112, &v111, &v111);
            }
            else
            {
              sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 1051, 340);
            }
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_177;
            if ( qword_180117E00 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                   a1,
                   qword_180117E00,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117BF0);
              if ( qword_180117E00 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117E00,
                     0) != 0 )
              {
                v18 = sub_1800023C0(a1);
                if ( v18 != 0 )
                {
                  qword_180117E00 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v18);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v18);
                }
              }
              sub_1800C6900(&unk_180117BF0);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_177;
            }
            if ( qword_180118050 == 0 )
            {
              qword_180118050 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                  a1,
                                  qword_180117E00,
                                  qword_1801178A0 + 10677,
                                  qword_1801178A0 + 11026);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_177;
            }
            if ( v119[0] != 0 )
            {
              v119[0] = sub_180002790(a1);
              sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
            }
            else
            {
              sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 140, 340);
            }
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_177;
            if ( qword_180117E08 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                   a1,
                   qword_180117E08,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117BF8);
              if ( qword_180117E08 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117E08,
                     0) != 0 )
              {
                v19 = sub_1800023C0(a1);
                if ( v19 != 0 )
                {
                  qword_180117E08 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v19);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v19);
                }
              }
              sub_1800C6900(&unk_180117BF8);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_177;
            }
            if ( qword_180118058 == 0 )
            {
              qword_180118058 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                  a1,
                                  qword_180117E08,
                                  qword_1801178A0 + 11076,
                                  qword_1801178A0 + 3131);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_177;
            }
            if ( v119[0] != 0 )
            {
              v119[0] = sub_180002790(a1);
              sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
            }
            else
            {
              sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 140, 340);
            }
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_177;
            if ( qword_180117E10 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                   a1,
                   qword_180117E10,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117C00);
              if ( qword_180117E10 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117E10,
                     0) != 0 )
              {
                v20 = sub_1800023C0(a1);
                if ( v20 != 0 )
                {
                  qword_180117E10 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v20);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v20);
                }
              }
              sub_1800C6900(&unk_180117C00);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_177;
            }
            v21 = qword_180118060;
            if ( qword_180118060 == 0 )
            {
              qword_180118060 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                  a1,
                                  qword_180117E10,
                                  qword_1801178A0 + 11088,
                                  qword_1801178A0 + 11097);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_177;
              v21 = qword_180118060;
            }
            LODWORD(v119[0]) = sub_1800268A0(a1, qword_180117E10, v21, v119[0]);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_177;
            LODWORD(v97[0]) = v119[0];
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_177;
            if ( qword_180117D50 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                   a1,
                   qword_180117D50,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117B40);
              if ( qword_180117D50 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117D50,
                     0) != 0 )
              {
                v22 = sub_1800023C0(a1);
                if ( v22 != 0 )
                {
                  qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v22);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v22);
                }
              }
              sub_1800C6900(&unk_180117B40);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_177;
            }
            if ( qword_180117F50 == 0 )
            {
              qword_180117F50 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                  a1,
                                  qword_180117D50,
                                  qword_1801178A0 + 10121,
                                  qword_1801178A0 + 10125);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_177;
            }
            v119[0] = sub_180002760(a1);
            sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_177;
            if ( qword_180117D50 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                   a1,
                   qword_180117D50,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117B40);
              if ( qword_180117D50 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117D50,
                     0) != 0 )
              {
                v23 = sub_1800023C0(a1);
                if ( v23 != 0 )
                {
                  qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v23);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v23);
                }
              }
              sub_1800C6900(&unk_180117B40);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_177;
            }
            if ( qword_180118068 == 0 )
            {
              qword_180118068 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                  a1,
                                  qword_180117D50,
                                  qword_1801178A0 + 11119,
                                  qword_1801178A0 + 11123);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_177;
            }
            if ( v119[0] != 0 )
            {
              v119[0] = sub_180002790(a1);
              sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
            }
            else
            {
              sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 140, 49);
            }
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_177;
            LODWORD(v111) = v97[0];
            if ( qword_180117E18 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                   a1,
                   qword_180117E18,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117C08);
              if ( qword_180117E18 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117E18,
                     0) != 0 )
              {
                v24 = sub_1800023C0(a1);
                if ( v24 != 0 )
                {
                  qword_180117E18 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v24);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v24);
                }
              }
              sub_1800C6900(&unk_180117C08);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_177;
            }
            if ( qword_180118070 == 0 )
            {
              qword_180118070 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                  a1,
                                  qword_180117E18,
                                  qword_1801178A0 + 11143,
                                  qword_1801178A0 + 11147);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_177;
            }
            if ( v119[0] != 0 )
            {
              v119[0] = sub_180002790(a1);
              sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
            }
            else
            {
              sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 140, 49);
            }
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_177;
            v110 = v119[0];
            sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
              goto LABEL_177;
            v119[0] = v110;
            sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
            v111 = v107;
            sub_1800036C0((__int64)&v114, (float *)v112, &v111, &v111);
            if ( qword_180117E20 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                   a1,
                   qword_180117E20,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117C10);
              if ( qword_180117E20 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117E20,
                     0) != 0 )
              {
                v25 = sub_1800023C0(a1);
                if ( v25 != 0 )
                {
                  qword_180117E20 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v25);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v25);
                }
              }
              sub_1800C6900(&unk_180117C10);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_177;
            }
            if ( qword_180118078 == 0 )
            {
              qword_180118078 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                  a1,
                                  qword_180117E20,
                                  qword_1801178A0 + 11168,
                                  qword_1801178A0 + 11172);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                goto LABEL_177;
            }
            if ( v119[0] != 0 )
              sub_1800027F0(a1, v119[0], qword_180118078, v111);
            else
              sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 10570, 161);
            v26 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
            v27 = *(_QWORD *)a1;
            if ( v26 != 0 )
            {
              v28 = (*(__int64 (__fastcall **)(__int64))(v27 + 120))(a1);
              (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
              v119[0] = v28;
              v117[0] = v28;
              sub_180026960(&v114, v112, v117, v117);
              goto LABEL_178;
            }
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(v27 + 1824))(a1) != 0 )
              goto LABEL_177;
            LODWORD(v119[0]) = v97[0];
            if ( (unsigned int)(LODWORD(v97[0]) - 1) > 9 )
              goto LABEL_754;
            if ( LODWORD(v97[0]) != 1 )
              abort();
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
            {
              sub_180026DB0(v112, &v108);
              sub_180026DB0(v112, &v106);
              sub_180026DB0(v112, &v107);
              sub_180026DB0(v112, &v110);
              sub_180026DB0(v112, &v109);
              sub_180002660(a1, v112);
              v119[0] = v110;
              sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
              if ( qword_180117E28 != 0
                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117E28,
                     0) == 0 )
              {
                goto LABEL_345;
              }
              sub_1800C68B0(&unk_180117C18);
              if ( qword_180117E28 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                     a1,
                     qword_180117E28,
                     0) != 0 )
              {
                v47 = sub_1800023C0(a1);
                if ( v47 != 0 )
                {
                  qword_180117E28 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v47);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v47);
                }
              }
              sub_1800C6900(&unk_180117C18);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
              {
LABEL_345:
                if ( v119[0] == 0
                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                       a1,
                       v119[0],
                       qword_180117E28) != 0 )
                {
                  goto LABEL_401;
                }
                v48 = qword_1801178A0;
                sub_1800267D0(v117, qword_1801178A0 + 1018);
                sub_1800267D0(v99, qword_1801178A0 + 11204);
                sub_180026770(&v114, v117, v99);
                v49 = v48 + 989;
                if ( (v114 & 1) != 0 )
                  v50 = v116;
                else
                  v50 = v115;
                sub_180002110(a1, v49, v50, 314);
                if ( (v114 & 1) != 0 )
                {
                  sub_1800C0DC0(v116);
                  if ( (v99[0] & 1) == 0 )
                  {
LABEL_398:
                    if ( (v117[0] & 1) == 0 )
                      goto LABEL_400;
                    goto LABEL_399;
                  }
                }
                else if ( (v99[0] & 1) == 0 )
                {
                  goto LABEL_398;
                }
                sub_1800C0DC0(v100);
                if ( (v117[0] & 1) == 0 )
                {
LABEL_400:
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                    goto LABEL_679;
LABEL_401:
                  v105 = v119[0];
                  sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                    goto LABEL_679;
                  if ( qword_180117D50 == 0
                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                         a1,
                         qword_180117D50,
                         0) != 0 )
                  {
                    sub_1800C68B0(&unk_180117B40);
                    if ( qword_180117D50 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117D50,
                           0) != 0 )
                    {
                      v61 = sub_1800023C0(a1);
                      if ( v61 != 0 )
                      {
                        qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                            a1,
                                            v61);
                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v61);
                      }
                    }
                    sub_1800C6900(&unk_180117B40);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      goto LABEL_679;
                  }
                  if ( qword_180117F50 == 0 )
                  {
                    qword_180117F50 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                        a1,
                                        qword_180117D50,
                                        qword_1801178A0 + 10121,
                                        qword_1801178A0 + 10125);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      goto LABEL_679;
                  }
                  v119[0] = sub_180002760(a1);
                  sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                    goto LABEL_679;
                  if ( qword_180117D50 == 0
                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                         a1,
                         qword_180117D50,
                         0) != 0 )
                  {
                    sub_1800C68B0(&unk_180117B40);
                    if ( qword_180117D50 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117D50,
                           0) != 0 )
                    {
                      v63 = sub_1800023C0(a1);
                      if ( v63 != 0 )
                      {
                        qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                            a1,
                                            v63);
                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v63);
                      }
                    }
                    sub_1800C6900(&unk_180117B40);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      goto LABEL_679;
                  }
                  if ( qword_180118080 == 0 )
                  {
                    qword_180118080 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                        a1,
                                        qword_180117D50,
                                        qword_1801178A0 + 11220,
                                        qword_1801178A0 + 11224);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      goto LABEL_679;
                  }
                  if ( v119[0] != 0 )
                  {
                    v119[0] = sub_180002790(a1);
                    sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                  }
                  else
                  {
                    sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 140, 261);
                  }
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                    goto LABEL_679;
                  if ( qword_180117E30 == 0
                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                         a1,
                         qword_180117E30,
                         0) != 0 )
                  {
                    sub_1800C68B0(&unk_180117C20);
                    if ( qword_180117E30 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117E30,
                           0) != 0 )
                    {
                      v66 = sub_1800023C0(a1);
                      if ( v66 != 0 )
                      {
                        qword_180117E30 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                            a1,
                                            v66);
                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v66);
                      }
                    }
                    sub_1800C6900(&unk_180117C20);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      goto LABEL_679;
                  }
                  v68 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 216LL))(a1, qword_180117E30);
                  v117[0] = v68;
                  if ( v68 != 0 )
                  {
                    v111 = v68;
                    sub_1800036C0((__int64)&v114, (float *)v112, v117, v117);
                  }
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                    goto LABEL_679;
                  v69 = v111;
                  v101 = v105;
                  sub_1800036C0((__int64)&v114, (float *)v112, &v101, &v101);
                  if ( qword_180117E28 == 0
                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                         a1,
                         qword_180117E28,
                         0) != 0 )
                  {
                    sub_1800C68B0(&unk_180117C18);
                    if ( qword_180117E28 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117E28,
                           0) != 0 )
                    {
                      v70 = sub_1800023C0(a1);
                      if ( v70 != 0 )
                      {
                        qword_180117E28 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                            a1,
                                            v70);
                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v70);
                      }
                    }
                    sub_1800C6900(&unk_180117C18);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      goto LABEL_679;
                  }
                  if ( qword_180118088 == 0 )
                  {
                    qword_180118088 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                        a1,
                                        qword_180117E28,
                                        qword_1801178A0 + 11244,
                                        qword_1801178A0 + 3131);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      goto LABEL_679;
                  }
                  if ( v101 != 0 )
                  {
                    v101 = sub_180002790(a1);
                    sub_1800036C0((__int64)&v114, (float *)v112, &v101, &v101);
                  }
                  else
                  {
                    sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 140, 261);
                  }
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                    goto LABEL_679;
                  if ( qword_180117E30 == 0
                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                         a1,
                         qword_180117E30,
                         0) != 0 )
                  {
                    sub_1800C68B0(&unk_180117C20);
                    if ( qword_180117E30 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117E30,
                           0) != 0 )
                    {
                      v72 = sub_1800023C0(a1);
                      if ( v72 != 0 )
                      {
                        qword_180117E30 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                            a1,
                                            v72);
                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v72);
                      }
                    }
                    sub_1800C6900(&unk_180117C20);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      goto LABEL_679;
                  }
                  if ( qword_180118090 == 0 )
                  {
                    qword_180118090 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                        a1,
                                        qword_180117E30,
                                        qword_1801178A0 + 1163,
                                        qword_1801178A0 + 10548);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      goto LABEL_679;
                  }
                  if ( v69 != 0 )
                    sub_180026870(a1, v69, qword_180117E30, qword_180118090, v101);
                  else
                    sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 1195, 261);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                    goto LABEL_679;
                  if ( qword_180117E38 == 0
                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                         a1,
                         qword_180117E38,
                         0) != 0 )
                  {
                    sub_1800C68B0(&unk_180117C28);
                    if ( qword_180117E38 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117E38,
                           0) != 0 )
                    {
                      v74 = sub_1800023C0(a1);
                      if ( v74 != 0 )
                      {
                        qword_180117E38 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                            a1,
                                            v74);
                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v74);
                      }
                    }
                    sub_1800C6900(&unk_180117C28);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      goto LABEL_679;
                  }
                  if ( qword_180118098 == 0 )
                  {
                    qword_180118098 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                        a1,
                                        qword_180117E38,
                                        qword_1801178A0 + 11248,
                                        qword_1801178A0 + 11252);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      goto LABEL_679;
                  }
                  if ( v119[0] != 0 )
                  {
                    v119[0] = sub_180002790(a1);
                    sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                  }
                  else
                  {
                    sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 140, 261);
                  }
                  v75 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                  v76 = *(_QWORD *)a1;
                  if ( v75 != 0 )
                  {
                    v77 = (*(__int64 (__fastcall **)(__int64))(v76 + 120))(a1);
                    (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                    v119[0] = v77;
                    v117[0] = v77;
                    sub_180026960(&v114, v112, v117, v117);
                    goto LABEL_178;
                  }
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(v76 + 1824))(a1) != 0 )
                  {
LABEL_679:
                    v89 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                    (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                    v119[0] = v89;
                    v117[0] = v89;
                    sub_180026960(&v114, v112, v117, v117);
LABEL_178:
                    if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                           a1,
                           v119[0],
                           qword_180117D30) == 0 )
                      goto LABEL_381;
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      return sub_180003630(v112);
                    sub_180026DB0(v112, v119);
                    sub_180026DB0(v112, &v108);
                    sub_180026DB0(v112, &v106);
                    sub_180002660(a1, v112);
                    v107 = v119[0];
                    sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      return sub_180003630(v112);
                    v119[0] = v107;
                    sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                    if ( qword_180117D30 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117D30,
                           0) != 0 )
                    {
                      sub_1800C68B0(&unk_180117B20);
                      if ( qword_180117D30 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117D30,
                             0) != 0 )
                      {
                        v31 = sub_1800023C0(a1);
                        if ( v31 != 0 )
                        {
                          qword_180117D30 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                              a1,
                                              v31);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v31);
                        }
                      }
                      sub_1800C6900(&unk_180117B20);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        return sub_180003630(v112);
                    }
                    if ( qword_1801181F8 == 0 )
                    {
                      qword_1801181F8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                          a1,
                                          qword_180117D30,
                                          qword_1801178A0 + 12123,
                                          qword_1801178A0 + 4);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        return sub_180003630(v112);
                    }
                    if ( v119[0] != 0 )
                      sub_1800027F0(a1, v119[0], qword_1801181F8, v30);
                    else
                      sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 1627, 163);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0
                      || (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                    {
                      return sub_180003630(v112);
                    }
                    if ( qword_180117D50 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117D50,
                           0) != 0 )
                    {
                      sub_1800C68B0(&unk_180117B40);
                      if ( qword_180117D50 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117D50,
                             0) != 0 )
                      {
                        v32 = sub_1800023C0(a1);
                        if ( v32 != 0 )
                        {
                          qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                              a1,
                                              v32);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v32);
                        }
                      }
                      sub_1800C6900(&unk_180117B40);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        return sub_180003630(v112);
                    }
                    if ( qword_180118308 == 0 )
                    {
                      qword_180118308 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL))(
                                          a1,
                                          qword_180117D50,
                                          qword_1801178A0 + 10519,
                                          qword_1801178A0 + 10523);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        return sub_180003630(v112);
                    }
                    v119[0] = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1160LL))(
                                a1,
                                qword_180117D50);
                    sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      return sub_180003630(v112);
                    if ( qword_180117D40 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117D40,
                           0) != 0 )
                    {
                      sub_1800C68B0(&unk_180117B30);
                      if ( qword_180117D40 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117D40,
                             0) != 0 )
                      {
                        v33 = sub_1800023C0(a1);
                        if ( v33 != 0 )
                        {
                          qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                              a1,
                                              v33);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v33);
                        }
                      }
                      sub_1800C6900(&unk_180117B30);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        return sub_180003630(v112);
                    }
                    if ( qword_180118300 == 0 )
                    {
                      qword_180118300 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL))(
                                          a1,
                                          qword_180117D40,
                                          qword_1801178A0 + 165,
                                          qword_1801178A0 + 2622);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        return sub_180003630(v112);
                    }
                    v111 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1160LL))(a1, qword_180117D40);
                    sub_1800036C0((__int64)&v114, (float *)v112, &v111, &v111);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      return sub_180003630(v112);
                    v109 = v111;
                    sub_1800036C0((__int64)&v114, (float *)v112, &v111, &v111);
                    v111 = v109;
                    sub_1800036C0((__int64)&v114, (float *)v112, &v111, &v111);
                    if ( v111 != 0 )
                    {
                      v111 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 1384LL))(
                               a1,
                               v111,
                               29);
                      sub_1800036C0((__int64)&v114, (float *)v112, &v111, &v111);
                    }
                    else
                    {
                      sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 1051, 317);
                    }
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      return sub_180003630(v112);
                    if ( qword_180117DC8 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117DC8,
                           0) != 0 )
                    {
                      sub_1800C68B0(&unk_180117BB8);
                      if ( qword_180117DC8 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117DC8,
                             0) != 0 )
                      {
                        v34 = sub_1800023C0(a1);
                        if ( v34 != 0 )
                        {
                          qword_180117DC8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                              a1,
                                              v34);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v34);
                        }
                      }
                      sub_1800C6900(&unk_180117BB8);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        return sub_180003630(v112);
                    }
                    if ( qword_180117FD8 == 0 )
                    {
                      qword_180117FD8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                          a1,
                                          qword_180117DC8,
                                          qword_1801178A0 + 10542,
                                          qword_1801178A0 + 10548);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        return sub_180003630(v112);
                    }
                    if ( v119[0] != 0 )
                      sub_1800027F0(a1, v119[0], qword_180117FD8, v111);
                    else
                      sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 10570, 317);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      return sub_180003630(v112);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      goto LABEL_349;
                    if ( qword_180117DD0 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117DD0,
                           0) != 0 )
                    {
                      sub_1800C68B0(&unk_180117BC0);
                      if ( qword_180117DD0 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117DD0,
                             0) != 0 )
                      {
                        v35 = sub_1800023C0(a1);
                        if ( v35 != 0 )
                        {
                          qword_180117DD0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                              a1,
                                              v35);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v35);
                        }
                      }
                      sub_1800C6900(&unk_180117BC0);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                    }
                    v119[0] = qword_180117DD0;
                    v111 = v109;
                    sub_1800036C0((__int64)&v114, (float *)v112, &v111, &v111);
                    if ( v111 != 0 )
                    {
                      v111 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 1384LL))(
                               a1,
                               v111,
                               5);
                      sub_1800036C0((__int64)&v114, (float *)v112, &v111, &v111);
                    }
                    else
                    {
                      sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 1051, 312);
                    }
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      goto LABEL_349;
                    if ( qword_180117DD8 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117DD8,
                           0) != 0 )
                    {
                      sub_1800C68B0(&unk_180117BC8);
                      if ( qword_180117DD8 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117DD8,
                             0) != 0 )
                      {
                        v36 = sub_1800023C0(a1);
                        if ( v36 != 0 )
                        {
                          qword_180117DD8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                              a1,
                                              v36);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v36);
                        }
                      }
                      sub_1800C6900(&unk_180117BC8);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                    }
                    if ( qword_180117FE0 == 0 )
                    {
                      qword_180117FE0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                          a1,
                                          qword_180117DD8,
                                          qword_1801178A0 + 10595,
                                          qword_1801178A0 + 10612);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                    }
                    if ( v119[0] != 0 )
                    {
                      v119[0] = sub_180002790(a1);
                      sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                    }
                    else
                    {
                      sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 140, 312);
                    }
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      goto LABEL_349;
                    v97[0] = v119[0];
                    sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      goto LABEL_349;
                    v119[0] = v97[0];
                    sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                    LODWORD(v111) = 1;
                    if ( qword_180117DE0 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117DE0,
                           0) != 0 )
                    {
                      sub_1800C68B0(&unk_180117BD0);
                      if ( qword_180117DE0 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117DE0,
                             0) != 0 )
                      {
                        v37 = sub_1800023C0(a1);
                        if ( v37 != 0 )
                        {
                          qword_180117DE0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                              a1,
                                              v37);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v37);
                        }
                      }
                      sub_1800C6900(&unk_180117BD0);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                    }
                    if ( qword_180117FE8 == 0 )
                    {
                      qword_180117FE8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                          a1,
                                          qword_180117DE0,
                                          qword_1801178A0 + 10658,
                                          qword_1801178A0 + 10672);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                    }
                    if ( v119[0] != 0 )
                      sub_1800027F0(a1, v119[0], qword_180117FE8, (unsigned int)v111);
                    else
                      sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 1627, 338);
                    v38 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                    v39 = *(_QWORD *)a1;
                    if ( v38 != 0 )
                    {
LABEL_280:
                      v40 = (*(__int64 (__fastcall **)(__int64))(v39 + 120))(a1);
                      (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                      v119[0] = v40;
                      v117[0] = v40;
                      sub_180026960(&v114, v112, v117, v117);
                      goto LABEL_350;
                    }
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(v39 + 1824))(a1) != 0 )
                      goto LABEL_349;
                    v119[0] = v97[0];
                    sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                    v111 = 0;
                    if ( qword_180117DE0 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117DE0,
                           0) != 0 )
                    {
                      sub_1800C68B0(&unk_180117BD0);
                      if ( qword_180117DE0 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117DE0,
                             0) != 0 )
                      {
                        v41 = sub_1800023C0(a1);
                        if ( v41 != 0 )
                        {
                          qword_180117DE0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                              a1,
                                              v41);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v41);
                        }
                      }
                      sub_1800C6900(&unk_180117BD0);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                    }
                    if ( qword_180117FF0 == 0 )
                    {
                      qword_180117FF0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                          a1,
                                          qword_180117DE0,
                                          qword_1801178A0 + 10677,
                                          qword_1801178A0 + 10681);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                    }
                    if ( v119[0] != 0 )
                    {
                      v119[0] = sub_180002790(a1);
                      sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                    }
                    else
                    {
                      sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 140, 333);
                    }
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      goto LABEL_349;
                    if ( qword_180117DE8 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117DE8,
                           0) != 0 )
                    {
                      sub_1800C68B0(&unk_180117BD8);
                      if ( qword_180117DE8 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117DE8,
                             0) != 0 )
                      {
                        v42 = sub_1800023C0(a1);
                        if ( v42 != 0 )
                        {
                          qword_180117DE8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                              a1,
                                              v42);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v42);
                        }
                      }
                      sub_1800C6900(&unk_180117BD8);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                    }
                    if ( v119[0] == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                           a1,
                           v119[0],
                           qword_180117DE8) != 0 )
                    {
LABEL_307:
                      v110 = v119[0];
                      sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                      if ( qword_180117DF0 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117DF0,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117BE0);
                        if ( qword_180117DF0 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                               a1,
                               qword_180117DF0,
                               0) != 0 )
                        {
                          v43 = sub_1800023C0(a1);
                          if ( v43 != 0 )
                          {
                            qword_180117DF0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                a1,
                                                v43);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v43);
                          }
                        }
                        sub_1800C6900(&unk_180117BE0);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_349;
                      }
                      if ( qword_180117FF8 == 0 )
                      {
                        qword_180117FF8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                            a1,
                                            qword_180117DF0,
                                            qword_1801178A0 + 10736,
                                            qword_1801178A0 + 10744);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_349;
                      }
                      v119[0] = sub_180002760(a1);
                      sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                      if ( qword_180117DF0 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117DF0,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117BE0);
                        if ( qword_180117DF0 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                               a1,
                               qword_180117DF0,
                               0) != 0 )
                        {
                          v60 = sub_1800023C0(a1);
                          if ( v60 != 0 )
                          {
                            qword_180117DF0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                a1,
                                                v60);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v60);
                          }
                        }
                        sub_1800C6900(&unk_180117BE0);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_349;
                      }
                      if ( qword_180118000 == 0 )
                      {
                        qword_180118000 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                            a1,
                                            qword_180117DF0,
                                            qword_1801178A0 + 10787,
                                            qword_1801178A0 + 10796);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_349;
                      }
                      if ( v119[0] != 0 )
                        v119[0] = sub_180003690(a1, v119[0], qword_180118000, v59);
                      else
                        sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 10800, 299);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                      v105 = v119[0];
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                      if ( qword_180117DF0 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117DF0,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117BE0);
                        if ( qword_180117DF0 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                               a1,
                               qword_180117DF0,
                               0) != 0 )
                        {
                          v62 = sub_1800023C0(a1);
                          if ( v62 != 0 )
                          {
                            qword_180117DF0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                a1,
                                                v62);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v62);
                          }
                        }
                        sub_1800C6900(&unk_180117BE0);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_349;
                      }
                      if ( qword_180117FF8 == 0 )
                      {
                        qword_180117FF8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                            a1,
                                            qword_180117DF0,
                                            qword_1801178A0 + 10736,
                                            qword_1801178A0 + 10744);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_349;
                      }
                      v119[0] = sub_180002760(a1);
                      sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                      v111 = 1;
                      LODWORD(v101) = 15559;
                      if ( qword_180117D40 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117D40,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117B30);
                        if ( qword_180117D40 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                               a1,
                               qword_180117D40,
                               0) != 0 )
                        {
                          v64 = sub_1800023C0(a1);
                          if ( v64 != 0 )
                          {
                            qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                a1,
                                                v64);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v64);
                          }
                        }
                        sub_1800C6900(&unk_180117B30);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_349;
                      }
                      v65 = qword_180118008;
                      if ( qword_180118008 == 0 )
                      {
                        qword_180118008 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                            a1,
                                            qword_180117D40,
                                            qword_1801178A0 + 165,
                                            qword_1801178A0 + 10823);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_349;
                        v65 = qword_180118008;
                      }
                      v101 = sub_1800BE2A0(a1, qword_180117D40, v65, (unsigned int)v101, v13 ^ 0x766D044147723B2ALL);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                      if ( qword_180117DF0 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117DF0,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117BE0);
                        if ( qword_180117DF0 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                               a1,
                               qword_180117DF0,
                               0) != 0 )
                        {
                          v67 = sub_1800023C0(a1);
                          if ( v67 != 0 )
                          {
                            qword_180117DF0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                a1,
                                                v67);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v67);
                          }
                        }
                        sub_1800C6900(&unk_180117BE0);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_349;
                      }
                      if ( qword_180118010 == 0 )
                      {
                        qword_180118010 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                            a1,
                                            qword_180117DF0,
                                            qword_1801178A0 + 10787,
                                            qword_1801178A0 + 10829);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_349;
                      }
                      if ( v119[0] != 0 )
                      {
                        v96 = v101;
                        v119[0] = sub_180003690(a1, v119[0], qword_180118010, v111);
                      }
                      else
                      {
                        sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 10800, 40);
                      }
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                      v102 = v119[0];
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                      if ( qword_180117DF0 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117DF0,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117BE0);
                        if ( qword_180117DF0 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                               a1,
                               qword_180117DF0,
                               0) != 0 )
                        {
                          v71 = sub_1800023C0(a1);
                          if ( v71 != 0 )
                          {
                            qword_180117DF0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                a1,
                                                v71);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v71);
                          }
                        }
                        sub_1800C6900(&unk_180117BE0);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_349;
                      }
                      if ( qword_180117FF8 == 0 )
                      {
                        qword_180117FF8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                            a1,
                                            qword_180117DF0,
                                            qword_1801178A0 + 10736,
                                            qword_1801178A0 + 10744,
                                            v96);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_349;
                      }
                      v119[0] = sub_180002760(a1);
                      sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                      LODWORD(v111) = 1;
                      if ( qword_180117DF0 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117DF0,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117BE0);
                        if ( qword_180117DF0 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                               a1,
                               qword_180117DF0,
                               0) != 0 )
                        {
                          v73 = sub_1800023C0(a1);
                          if ( v73 != 0 )
                          {
                            qword_180117DF0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                a1,
                                                v73);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v73);
                          }
                        }
                        sub_1800C6900(&unk_180117BE0);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_349;
                      }
                      if ( qword_180118018 == 0 )
                      {
                        qword_180118018 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                            a1,
                                            qword_180117DF0,
                                            qword_1801178A0 + 10835,
                                            qword_1801178A0 + 10843);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_349;
                      }
                      if ( v119[0] != 0 )
                        LODWORD(v119[0]) = sub_180026900(a1, v119[0], qword_180118018, (unsigned int)v111);
                      else
                        sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 1690, 263);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                      LODWORD(v98) = v119[0];
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                      v119[0] = v110;
                      sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                      if ( qword_180117D70 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117D70,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117B60);
                        if ( qword_180117D70 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                               a1,
                               qword_180117D70,
                               0) != 0 )
                        {
                          v78 = sub_1800023C0(a1);
                          if ( v78 != 0 )
                          {
                            qword_180117D70 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                a1,
                                                v78);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v78);
                          }
                        }
                        sub_1800C6900(&unk_180117B60);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_349;
                      }
                      if ( qword_180118020 == 0 )
                      {
                        qword_180118020 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                            a1,
                                            qword_180117D70,
                                            qword_1801178A0 + 10849,
                                            qword_1801178A0 + 10863);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_349;
                      }
                      v111 = sub_180002760(a1);
                      sub_1800036C0((__int64)&v114, (float *)v112, &v111, &v111);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                      v101 = v13 ^ 0x744B603F9449A75FLL;
                      if ( qword_180117D40 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117D40,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117B30);
                        if ( qword_180117D40 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                               a1,
                               qword_180117D40,
                               0) != 0 )
                        {
                          v83 = sub_1800023C0(a1);
                          if ( v83 != 0 )
                          {
                            qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                a1,
                                                v83);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v83);
                          }
                        }
                        sub_1800C6900(&unk_180117B30);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_349;
                      }
                      v85 = qword_180118008;
                      if ( qword_180118008 == 0 )
                      {
                        qword_180118008 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                            a1,
                                            qword_180117D40,
                                            qword_1801178A0 + 165,
                                            qword_1801178A0 + 10823);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_349;
                        v85 = qword_180118008;
                      }
                      sub_1800BE2A0(a1, qword_180117D40, v85, 8382, v101);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                      {
                        if ( qword_180117DE8 != 0
                          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                               a1,
                               qword_180117DE8,
                               0) == 0 )
                        {
                          goto LABEL_772;
                        }
                        sub_1800C68B0(&unk_180117BD8);
                        if ( qword_180117DE8 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                               a1,
                               qword_180117DE8,
                               0) != 0 )
                        {
                          v86 = sub_1800023C0(a1);
                          if ( v86 != 0 )
                          {
                            qword_180117DE8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                a1,
                                                v86);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v86);
                          }
                        }
                        sub_1800C6900(&unk_180117BD8);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                        {
LABEL_772:
                          if ( qword_180118028 != 0
                            || (qword_180118028 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                                    a1,
                                                    qword_180117DE8,
                                                    qword_1801178A0 + 3343,
                                                    qword_1801178A0 + 10884),
                                (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0) )
                          {
                            if ( v119[0] != 0 )
                              sub_1800027F0(a1, v119[0], qword_180118028, v111);
                            else
                              sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 1627, 239);
                            v88 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                            v39 = *(_QWORD *)a1;
                            if ( v88 != 0 )
                              goto LABEL_280;
                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(v39 + 1824))(a1) == 0 )
                            {
                              v119[0] = v110;
                              sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                              v111 = v102;
                              v101 = 0;
                              if ( qword_180117DE8 != 0
                                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                     a1,
                                     qword_180117DE8,
                                     0) == 0 )
                              {
                                goto LABEL_755;
                              }
                              sub_1800C68B0(&unk_180117BD8);
                              if ( qword_180117DE8 == 0
                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                     a1,
                                     qword_180117DE8,
                                     0) != 0 )
                              {
                                v90 = sub_1800023C0(a1);
                                if ( v90 != 0 )
                                {
                                  qword_180117DE8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                      a1,
                                                      v90);
                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v90);
                                }
                              }
                              sub_1800C6900(&unk_180117BD8);
                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
LABEL_755:
                                JUMPOUT(0x180083993LL);
                            }
                          }
                        }
                      }
LABEL_349:
                      v51 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                      (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                      v119[0] = v51;
                      v117[0] = v51;
                      sub_180026960(&v114, v112, v117, v117);
LABEL_350:
                      if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                             a1,
                             v119[0],
                             qword_180117D38) != 0 )
                      {
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                        {
                          sub_180026DB0(v112, v119);
                          sub_180026DB0(v112, &v108);
                          sub_180026DB0(v112, &v106);
                          sub_180026DB0(v112, &v107);
                          sub_180026DB0(v112, &v109);
                          sub_180002660(a1, v112);
                          v97[0] = v119[0];
                          sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                          LODWORD(v119[0]) = 2680;
                          v101 = v13;
                          v111 = v13 ^ 0x1CEAE5864EF8D9ELL;
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                          {
                            if ( qword_180117D40 != 0
                              && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                   a1,
                                   qword_180117D40,
                                   0) == 0 )
                            {
                              goto LABEL_360;
                            }
                            sub_1800C68B0(&unk_180117B30);
                            if ( qword_180117D40 == 0
                              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                   a1,
                                   qword_180117D40,
                                   0) != 0 )
                            {
                              v52 = sub_1800023C0(a1);
                              if ( v52 != 0 )
                              {
                                qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                    a1,
                                                    v52);
                                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v52);
                              }
                            }
                            sub_1800C6900(&unk_180117B30);
                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                            {
LABEL_360:
                              v53 = qword_180118008;
                              if ( qword_180118008 != 0 )
                                goto LABEL_361;
                              qword_180118008 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                                  a1,
                                                  qword_180117D40,
                                                  qword_1801178A0 + 165,
                                                  qword_1801178A0 + 10823);
                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                              {
                                v53 = qword_180118008;
LABEL_361:
                                v119[0] = sub_1800BE2A0(a1, qword_180117D40, v53, LODWORD(v119[0]), v111);
                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                                {
                                  v110 = v119[0];
                                  v54 = v13 ^ 0x766D044147723B2ALL;
                                  while ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                                  {
                                    sub_180026DB0(v112, &v108);
                                    sub_180026DB0(v112, &v106);
                                    sub_180026DB0(v112, &v107);
                                    sub_180026DB0(v112, v97);
                                    sub_180026DB0(v112, &v109);
                                    sub_180002660(a1, v112);
                                    v119[0] = v110;
                                    v101 = v54;
                                    if ( qword_180117D40 == 0
                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                           a1,
                                           qword_180117D40,
                                           0) != 0 )
                                    {
                                      sub_1800C68B0(&unk_180117B30);
                                      if ( qword_180117D40 == 0
                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                             a1,
                                             qword_180117D40,
                                             0) != 0 )
                                      {
                                        v55 = sub_1800023C0(a1);
                                        if ( v55 != 0 )
                                        {
                                          qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                              a1,
                                                              v55);
                                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v55);
                                        }
                                      }
                                      sub_1800C6900(&unk_180117B30);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                        break;
                                    }
                                    v56 = qword_180118008;
                                    if ( qword_180118008 == 0 )
                                    {
                                      qword_180118008 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                                          a1,
                                                          qword_180117D40,
                                                          qword_1801178A0 + 165,
                                                          qword_1801178A0 + 10823);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                        return sub_180003630(v112);
                                      v56 = qword_180118008;
                                    }
                                    v57 = sub_1800BE2A0(a1, qword_180117D40, v56, 15559, v101);
                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                      break;
                                    v58 = v119[0];
                                    LODWORD(v119[0]) = (char)((v119[0] > v57) - (v119[0] < v57));
                                    if ( v58 < v57 )
                                    {
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                        return sub_180003630(v112);
                                      v119[0] = --v110;
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                                        return sub_180003630(v112);
                                      HIDWORD(v119[0]) = (unsigned __int64)++v110 >> 32;
                                      LODWORD(v119[0]) = v15;
                                      if ( v15 != 0 )
                                        continue;
                                    }
                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                                    {
                                      sub_180026DB0(v112, &v108);
                                      sub_180026DB0(v112, &v106);
                                      sub_180026DB0(v112, &v107);
                                      sub_180026DB0(v112, &v109);
                                      sub_180002660(a1, v112);
                                    }
                                    return sub_180003630(v112);
                                  }
                                }
                              }
                            }
                          }
                        }
                        return sub_180003630(v112);
                      }
LABEL_381:
                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v119[0]);
                      return sub_180003630(v112);
                    }
                    v44 = qword_1801178A0;
                    sub_1800267D0(v117, qword_1801178A0 + 1018);
                    sub_1800267D0(v99, qword_1801178A0 + 10720);
                    sub_180026770(&v114, v117, v99);
                    v45 = v44 + 989;
                    if ( (v114 & 1) != 0 )
                      v46 = v116;
                    else
                      v46 = v115;
                    sub_180002110(a1, v45, v46, 333);
                    if ( (v114 & 1) != 0 )
                    {
                      sub_1800C0DC0(v116);
                      if ( (v99[0] & 1) == 0 )
                      {
LABEL_330:
                        if ( (v117[0] & 1) == 0 )
                          goto LABEL_332;
                        goto LABEL_331;
                      }
                    }
                    else if ( (v99[0] & 1) == 0 )
                    {
                      goto LABEL_330;
                    }
                    sub_1800C0DC0(v100);
                    if ( (v117[0] & 1) == 0 )
                    {
LABEL_332:
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_349;
                      goto LABEL_307;
                    }
LABEL_331:
                    sub_1800C0DC0(v118);
                    goto LABEL_332;
                  }
                  LODWORD(v119[0]) = v15;
                  if ( v15 == 0 )
                  {
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                      goto LABEL_679;
                    sub_180026DB0(v112, &v108);
                    sub_180026DB0(v112, &v106);
                    sub_180026DB0(v112, &v107);
                    sub_180026DB0(v112, &v110);
                    sub_180026DB0(v112, &v109);
                    sub_180002660(a1, v112);
                    v119[0] = v110;
                    sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                    if ( qword_180117E40 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117E40,
                           0) != 0 )
                    {
                      sub_1800C68B0(&unk_180117C30);
                      if ( qword_180117E40 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117E40,
                             0) != 0 )
                      {
                        v79 = sub_1800023C0(a1);
                        if ( v79 != 0 )
                        {
                          qword_180117E40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                              a1,
                                              v79);
                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v79);
                        }
                      }
                      sub_1800C6900(&unk_180117C30);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_679;
                    }
                    if ( v119[0] == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                           a1,
                           v119[0],
                           qword_180117E40) != 0 )
                    {
                      goto LABEL_611;
                    }
                    v80 = qword_1801178A0;
                    sub_1800267D0(v117, qword_1801178A0 + 1018);
                    sub_1800267D0(v99, qword_1801178A0 + 11289);
                    sub_180026770(&v114, v117, v99);
                    v81 = v80 + 989;
                    if ( (v114 & 1) != 0 )
                      v82 = v116;
                    else
                      v82 = v115;
                    sub_180002110(a1, v81, v82, 373);
                    if ( (v114 & 1) != 0 )
                    {
                      sub_1800C0DC0(v116);
                      if ( (v99[0] & 1) == 0 )
                      {
LABEL_608:
                        if ( (v117[0] & 1) == 0 )
                          goto LABEL_610;
                        goto LABEL_609;
                      }
                    }
                    else if ( (v99[0] & 1) == 0 )
                    {
                      goto LABEL_608;
                    }
                    sub_1800C0DC0(v100);
                    if ( (v117[0] & 1) == 0 )
                    {
LABEL_610:
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_679;
LABEL_611:
                      v105 = v119[0];
                      sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_679;
                      v119[0] = v105;
                      sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                      if ( qword_180117E40 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117E40,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117C30);
                        if ( qword_180117E40 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                               a1,
                               qword_180117E40,
                               0) != 0 )
                        {
                          v84 = sub_1800023C0(a1);
                          if ( v84 != 0 )
                          {
                            qword_180117E40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                a1,
                                                v84);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v84);
                          }
                        }
                        sub_1800C6900(&unk_180117C30);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_679;
                      }
                      if ( qword_1801180A0 == 0 )
                      {
                        qword_1801180A0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                            a1,
                                            qword_180117E40,
                                            qword_1801178A0 + 11305,
                                            qword_1801178A0 + 11309);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_679;
                      }
                      if ( v119[0] != 0 )
                      {
                        v119[0] = sub_180002790(a1);
                        sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                      }
                      else
                      {
                        sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 140, 188);
                      }
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_679;
                      if ( qword_180117E48 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117E48,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117C38);
                        if ( qword_180117E48 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                               a1,
                               qword_180117E48,
                               0) != 0 )
                        {
                          v87 = sub_1800023C0(a1);
                          if ( v87 != 0 )
                          {
                            qword_180117E48 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                a1,
                                                v87);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v87);
                          }
                        }
                        sub_1800C6900(&unk_180117C38);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_679;
                      }
                      if ( qword_1801180A8 == 0 )
                      {
                        qword_1801180A8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                            a1,
                                            qword_180117E48,
                                            qword_1801178A0 + 11328,
                                            qword_1801178A0 + 11337);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          goto LABEL_679;
                      }
                      if ( v119[0] != 0 )
                      {
                        v119[0] = sub_180002790(a1);
                        sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                      }
                      else
                      {
                        sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 1106, 188);
                      }
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        goto LABEL_679;
                      v104 = v119[0];
                      sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        JUMPOUT(0x180083A29LL);
                      sub_180026DB0(v112, &v108);
                      sub_180026DB0(v112, &v106);
                      sub_180026DB0(v112, &v107);
                      sub_180026DB0(v112, &v110);
                      sub_180026DB0(v112, &v105);
                      sub_180026DB0(v112, &v104);
                      sub_180026DB0(v112, &v109);
                      sub_180002660(a1, v112);
                      v119[0] = v104;
                      sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                      if ( qword_180117E50 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117E50,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117C40);
                        if ( qword_180117E50 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                               a1,
                               qword_180117E50,
                               0) != 0 )
                        {
                          v91 = sub_1800023C0(a1);
                          if ( v91 != 0 )
                          {
                            qword_180117E50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                a1,
                                                v91);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v91);
                          }
                        }
                        sub_1800C6900(&unk_180117C40);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          JUMPOUT(0x180083A6ELL);
                      }
                      if ( qword_1801180B0 == 0 )
                      {
                        qword_1801180B0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                            a1,
                                            qword_180117E50,
                                            qword_1801178A0 + 11360,
                                            qword_1801178A0 + 10075);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          JUMPOUT(0x180083AB3LL);
                      }
                      if ( v119[0] != 0 )
                        LODWORD(v119[0]) = (unsigned __int8)sub_1800BE240(a1, v119[0], qword_1801180B0);
                      else
                        sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 11368, 188);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        JUMPOUT(0x180083AF8LL);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        JUMPOUT(0x180083B3ALL);
                      sub_180026DB0(v112, &v108);
                      sub_180026DB0(v112, &v106);
                      sub_180026DB0(v112, &v107);
                      sub_180026DB0(v112, &v110);
                      sub_180026DB0(v112, &v105);
                      sub_180026DB0(v112, &v104);
                      sub_180026DB0(v112, &v109);
                      sub_180002660(a1, v112);
                      if ( LODWORD(v119[0]) == 0 )
                        JUMPOUT(0x180083B7FLL);
                      v119[0] = v104;
                      sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                      if ( qword_180117E50 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117E50,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117C40);
                        if ( qword_180117E50 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                               a1,
                               qword_180117E50,
                               0) != 0 )
                        {
                          v92 = sub_1800023C0(a1);
                          if ( v92 != 0 )
                          {
                            qword_180117E50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                a1,
                                                v92);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v92);
                          }
                        }
                        sub_1800C6900(&unk_180117C40);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          JUMPOUT(0x180083BD8LL);
                      }
                      if ( qword_1801180B8 == 0 )
                      {
                        qword_1801180B8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                            a1,
                                            qword_180117E50,
                                            qword_1801178A0 + 11396,
                                            qword_1801178A0 + 11401);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          JUMPOUT(0x180083C1DLL);
                      }
                      if ( v119[0] != 0 )
                      {
                        v119[0] = sub_180002790(a1);
                        sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                      }
                      else
                      {
                        sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 1106, 188);
                      }
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                        JUMPOUT(0x180083C62LL);
                      if ( qword_180117E58 == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                             a1,
                             qword_180117E58,
                             0) != 0 )
                      {
                        sub_1800C68B0(&unk_180117C48);
                        if ( qword_180117E58 == 0
                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                               a1,
                               qword_180117E58,
                               0) != 0 )
                        {
                          v93 = sub_1800023C0(a1);
                          if ( v93 != 0 )
                          {
                            qword_180117E58 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                a1,
                                                v93);
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v93);
                          }
                        }
                        sub_1800C6900(&unk_180117C48);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          JUMPOUT(0x180083CA7LL);
                      }
                      if ( v119[0] == 0
                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                             a1,
                             v119[0],
                             qword_180117E58) != 0 )
                      {
LABEL_733:
                        v102 = v119[0];
                        sub_1800036C0((__int64)&v114, (float *)v112, v119, v119);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) == 0 )
                        {
                          LODWORD(v119[0]) = 0;
                          JUMPOUT(0x18008528ELL);
                        }
                        JUMPOUT(0x180083D31LL);
                      }
                      v94 = qword_1801178A0;
                      sub_1800267D0(v117, qword_1801178A0 + 1018);
                      sub_1800267D0(v99, qword_1801178A0 + 11422);
                      sub_180026770(&v114, v117, v99);
                      v95 = v115;
                      if ( (v114 & 1) != 0 )
                        v95 = v116;
                      sub_180002110(a1, v94 + 989, v95, 188);
                      if ( (v114 & 1) != 0 )
                      {
                        sub_1800C0DC0(v116);
                        if ( (v99[0] & 1) == 0 )
                        {
LABEL_730:
                          if ( (v117[0] & 1) == 0 )
                            goto LABEL_732;
                          goto LABEL_731;
                        }
                      }
                      else if ( (v99[0] & 1) == 0 )
                      {
                        goto LABEL_730;
                      }
                      sub_1800C0DC0(v100);
                      if ( (v117[0] & 1) == 0 )
                      {
LABEL_732:
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
                          JUMPOUT(0x180083CECLL);
                        goto LABEL_733;
                      }
LABEL_731:
                      sub_1800C0DC0(v118);
                      goto LABEL_732;
                    }
LABEL_609:
                    sub_1800C0DC0(v118);
                    goto LABEL_610;
                  }
LABEL_754:
                  JUMPOUT(0x180098DF1LL);
                }
LABEL_399:
                sub_1800C0DC0(v118);
                goto LABEL_400;
              }
            }
LABEL_177:
            v29 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
            (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
            v119[0] = v29;
            v117[0] = v29;
            sub_180026960(&v114, v112, v117, v117);
            goto LABEL_178;
          }
        }
      }
    }
  }
  return result;
}


/* ===== chunk 180082844 .. 18008A810 ===== */
// bad sp value at call has been detected, the output may be wrong!
void __fastcall sub_180082844()
{
  float *v0; // rbx
  __int64 v1; // rsi
  __int64 v2; // r12
  int v3; // r14d
  __int64 v4; // r15
  __int64 v5; // r15
  __int64 v6; // r15
  __int64 v7; // r15
  __int64 v8; // r15
  __int64 v9; // r15
  __int64 v10; // r15
  char v11; // al
  __int64 v12; // rdx
  __int64 v13; // r15
  __int64 v14; // r15
  __int64 v15; // r15
  char v16; // al
  __int64 v17; // rbx
  __int64 v18; // rbx
  __int64 v19; // rbx
  _QWORD v20[5]; // [rsp+68h] [rbp-18h] BYREF
  __int64 v21; // [rsp+90h] [rbp+10h] BYREF
  __int64 v22; // [rsp+98h] [rbp+18h] BYREF
  __int64 v23; // [rsp+A0h] [rbp+20h] BYREF
  __int64 v24; // [rsp+A8h] [rbp+28h] BYREF
  __int64 v25; // [rsp+B0h] [rbp+30h] BYREF
  __int64 v26; // [rsp+B8h] [rbp+38h] BYREF
  __int64 v27; // [rsp+C0h] [rbp+40h] BYREF
  __int64 v28; // [rsp+C8h] [rbp+48h] BYREF
  __int64 v29; // [rsp+D0h] [rbp+50h] BYREF
  __int64 v30; // [rsp+D8h] [rbp+58h] BYREF
  _BYTE v31[48]; // [rsp+E0h] [rbp+60h] BYREF
  _BYTE v32[24]; // [rsp+110h] [rbp+90h] BYREF
  _QWORD v33[3]; // [rsp+128h] [rbp+A8h] BYREF
  __int64 v34[8]; // [rsp+140h] [rbp+C0h] BYREF

  sub_180002110(v1, qword_1801178A0 + 109, qword_1801178A0 + 1051, 28);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) == 0 )
  {
    if ( qword_180117E70 != 0
      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117E70, 0) == 0 )
    {
      goto LABEL_148;
    }
    sub_1800C68B0(&unk_180117C60);
    if ( qword_180117E70 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117E70, 0) != 0 )
    {
      v4 = sub_1800023C0(v1);
      if ( v4 != 0 )
      {
        qword_180117E70 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 1808LL))(v1, v4);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 184LL))(v1, v4);
      }
    }
    sub_1800C6900(&unk_180117C60);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) == 0 )
    {
LABEL_148:
      if ( qword_1801180E0 != 0
        || (qword_1801180E0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 264LL))(
                                v1,
                                qword_180117E70,
                                qword_1801178A0 + 11510,
                                qword_1801178A0 + 11517),
            (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) == 0) )
      {
        if ( v34[0] != 0 )
          LODWORD(v34[0]) = (unsigned __int8)sub_1800BE240(v1, v34[0], qword_1801180E0);
        else
          sub_180002110(v1, qword_1801178A0 + 109, qword_1801178A0 + 10095, 28);
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) == 0 )
        {
          if ( LODWORD(v34[0]) != 0 )
            goto LABEL_33;
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) == 0 )
            JUMPOUT(0x180081924LL);
        }
      }
    }
  }
  v5 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 120LL))(v1);
  (*(void (__fastcall **)(__int64))(*(_QWORD *)v1 + 136LL))(v1);
  v34[0] = v5;
  v33[0] = v5;
  sub_180026960(v2, v0, v33, v33);
  if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)v1 + 256LL))(
         v1,
         v34[0],
         qword_180117D38) == 0 )
    goto LABEL_144;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
  {
    v17 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 120LL))(v1);
    (*(void (__fastcall **)(__int64))(*(_QWORD *)v1 + 136LL))(v1);
    v34[0] = v17;
    v33[0] = v17;
    sub_180026960(v32, v31, v33, v33);
    goto LABEL_144;
  }
  sub_180026DB0(v0, v34);
  sub_180026DB0(v0, &v27);
  sub_180026DB0(v0, &v25);
  sub_180026DB0(v0, &v26);
  sub_180026DB0(v0, &v29);
  sub_180026DB0(v0, &v24);
  sub_180026DB0(v0, &v23);
  sub_180026DB0(v0, &v21);
  sub_180026DB0(v0, &v22);
  sub_180026DB0(v0, v20);
  sub_180026DB0(v0, &v28);
  sub_180002660(v1, v0);
  if ( qword_180117D40 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117D40, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117B30);
    if ( qword_180117D40 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117D40, 0) != 0 )
    {
      v6 = sub_1800023C0(v1);
      if ( v6 != 0 )
      {
        qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 1808LL))(v1, v6);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 184LL))(v1, v6);
      }
    }
    sub_1800C6900(&unk_180117B30);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
      goto LABEL_117;
  }
  if ( qword_1801180F0 == 0 )
  {
    qword_1801180F0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 904LL))(
                        v1,
                        qword_180117D40,
                        qword_1801178A0 + 165,
                        qword_1801178A0 + 11543);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
      goto LABEL_117;
  }
  v34[0] = sub_180002760(v1);
  sub_1800036C0(v2, v0, v34, v34);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
    goto LABEL_117;
  v7 = v34[0];
  if ( v34[0] != 0 )
  {
    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 104LL))(v1, v34[0]);
    v33[0] = v7;
    sub_180026960(v2, v0, v33, v33);
  }
  else
  {
    sub_180002110(v1, qword_1801178A0 + 109, qword_1801178A0 + 666, 70);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
    goto LABEL_117;
LABEL_33:
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
    goto LABEL_117;
  sub_180026DB0(v0, &v27);
  sub_180026DB0(v0, &v25);
  sub_180026DB0(v0, &v26);
  sub_180026DB0(v0, &v29);
  sub_180026DB0(v0, &v24);
  sub_180026DB0(v0, &v23);
  sub_180026DB0(v0, &v21);
  sub_180026DB0(v0, &v22);
  sub_180026DB0(v0, v20);
  sub_180026DB0(v0, &v28);
  sub_180002660(v1, v0);
  v34[0] = v20[0];
  sub_1800036C0(v2, v0, v34, v34);
  if ( qword_180117E68 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117E68, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117C58);
    if ( qword_180117E68 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117E68, 0) != 0 )
    {
      v8 = sub_1800023C0(v1);
      if ( v8 != 0 )
      {
        qword_180117E68 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 1808LL))(v1, v8);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 184LL))(v1, v8);
      }
    }
    sub_1800C6900(&unk_180117C58);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
      goto LABEL_117;
  }
  if ( qword_1801180D0 == 0 )
  {
    qword_1801180D0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 264LL))(
                        v1,
                        qword_180117E68,
                        qword_1801178A0 + 11482,
                        qword_1801178A0 + 11486);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
      goto LABEL_117;
  }
  if ( v34[0] != 0 )
  {
    v34[0] = sub_180002790(v1);
    sub_1800036C0(v2, v0, v34, v34);
  }
  else
  {
    sub_180002110(v1, qword_1801178A0 + 109, qword_1801178A0 + 140, 294);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
    goto LABEL_117;
  v30 = v21;
  sub_1800036C0(v2, v0, &v30, &v30);
  if ( qword_180117E58 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117E58, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117C48);
    if ( qword_180117E58 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117E58, 0) != 0 )
    {
      v9 = sub_1800023C0(v1);
      if ( v9 != 0 )
      {
        qword_180117E58 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 1808LL))(v1, v9);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 184LL))(v1, v9);
      }
    }
    sub_1800C6900(&unk_180117C48);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
      goto LABEL_117;
  }
  if ( qword_1801180D8 == 0 )
  {
    qword_1801180D8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 264LL))(
                        v1,
                        qword_180117E58,
                        qword_1801178A0 + 11506,
                        qword_1801178A0 + 3131);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
      goto LABEL_117;
  }
  if ( v30 != 0 )
  {
    v30 = sub_180002790(v1);
    sub_1800036C0(v2, v0, &v30, &v30);
  }
  else
  {
    sub_180002110(v1, qword_1801178A0 + 109, qword_1801178A0 + 140, 294);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
    goto LABEL_117;
  if ( qword_180117E58 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117E58, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117C48);
    if ( qword_180117E58 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117E58, 0) != 0 )
    {
      v10 = sub_1800023C0(v1);
      if ( v10 != 0 )
      {
        qword_180117E58 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 1808LL))(v1, v10);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 184LL))(v1, v10);
      }
    }
    sub_1800C6900(&unk_180117C48);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
      goto LABEL_117;
  }
  if ( qword_1801180F8 == 0 )
  {
    qword_1801180F8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 264LL))(
                        v1,
                        qword_180117E58,
                        qword_1801178A0 + 11588,
                        qword_1801178A0 + 10548);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
      goto LABEL_117;
  }
  if ( v34[0] != 0 )
    sub_1800027F0(v1, v34[0], qword_1801180F8, v30);
  else
    sub_180002110(v1, qword_1801178A0 + 109, qword_1801178A0 + 1627, 294);
  v11 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1);
  v12 = *(_QWORD *)v1;
  if ( v11 == 0 )
  {
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(v12 + 1824))(v1) != 0 )
      goto LABEL_117;
    v34[0] = v20[0];
    sub_1800036C0(v2, v0, v34, v34);
    if ( qword_180117E68 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117E68, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117C58);
      if ( qword_180117E68 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117E68, 0) != 0 )
      {
        v13 = sub_1800023C0(v1);
        if ( v13 != 0 )
        {
          qword_180117E68 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 1808LL))(v1, v13);
          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 184LL))(v1, v13);
        }
      }
      sub_1800C6900(&unk_180117C58);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_117;
    }
    if ( qword_1801180D0 == 0 )
    {
      qword_1801180D0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 264LL))(
                          v1,
                          qword_180117E68,
                          qword_1801178A0 + 11482,
                          qword_1801178A0 + 11486);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_117;
    }
    if ( v34[0] != 0 )
    {
      v34[0] = sub_180002790(v1);
      sub_1800036C0(v2, v0, v34, v34);
    }
    else
    {
      sub_180002110(v1, qword_1801178A0 + 109, qword_1801178A0 + 140, 172);
    }
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
      goto LABEL_117;
    v30 = v21;
    sub_1800036C0(v2, v0, &v30, &v30);
    if ( qword_180117E58 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117E58, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117C48);
      if ( qword_180117E58 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117E58, 0) != 0 )
      {
        v14 = sub_1800023C0(v1);
        if ( v14 != 0 )
        {
          qword_180117E58 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 1808LL))(v1, v14);
          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 184LL))(v1, v14);
        }
      }
      sub_1800C6900(&unk_180117C48);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_117;
    }
    if ( qword_1801180E8 == 0 )
    {
      qword_1801180E8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 264LL))(
                          v1,
                          qword_180117E58,
                          qword_1801178A0 + 11539,
                          qword_1801178A0 + 3131);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_117;
    }
    if ( v30 != 0 )
    {
      v30 = sub_180002790(v1);
      sub_1800036C0(v2, v0, &v30, &v30);
    }
    else
    {
      sub_180002110(v1, qword_1801178A0 + 109, qword_1801178A0 + 140, 172);
    }
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
      goto LABEL_117;
    if ( qword_180117E58 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117E58, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117C48);
      if ( qword_180117E58 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v1 + 192LL))(v1, qword_180117E58, 0) != 0 )
      {
        v15 = sub_1800023C0(v1);
        if ( v15 != 0 )
        {
          qword_180117E58 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 1808LL))(v1, v15);
          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v1 + 184LL))(v1, v15);
        }
      }
      sub_1800C6900(&unk_180117C48);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_117;
    }
    if ( qword_180118100 == 0 )
    {
      qword_180118100 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v1 + 264LL))(
                          v1,
                          qword_180117E58,
                          qword_1801178A0 + 11592,
                          qword_1801178A0 + 10548);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) != 0 )
        goto LABEL_117;
    }
    if ( v34[0] != 0 )
      sub_1800027F0(v1, v34[0], qword_180118100, v30);
    else
      sub_180002110(v1, qword_1801178A0 + 109, qword_1801178A0 + 1627, 172);
    v16 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1);
    v12 = *(_QWORD *)v1;
    if ( v16 == 0 )
    {
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(v12 + 1824))(v1) == 0
        && (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v1 + 1824LL))(v1) == 0 )
      {
        sub_180026DB0(v0, &v27);
        sub_180026DB0(v0, &v25);
        sub_180026DB0(v0, &v26);
        sub_180026DB0(v0, &v29);
        sub_180026DB0(v0, &v24);
        sub_180026DB0(v0, &v23);
        sub_180026DB0(v0, &v21);
        sub_180026DB0(v0, &v22);
        sub_180026DB0(v0, &v28);
        sub_180002660(v1, v0);
        LODWORD(v34[0]) = v3;
        JUMPOUT(0x180080D9CLL);
      }
LABEL_117:
      v18 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v1 + 120LL))(v1);
      (*(void (__fastcall **)(__int64))(*(_QWORD *)v1 + 136LL))(v1);
      v34[0] = v18;
      v33[0] = v18;
      sub_180026960(v32, v31, v33, v33);
      goto LABEL_144;
    }
  }
  v19 = (*(__int64 (__fastcall **)(__int64))(v12 + 120))(v1);
  (*(void (__fastcall **)(__int64))(*(_QWORD *)v1 + 136LL))(v1);
  v34[0] = v19;
  v33[0] = v19;
  sub_180026960(v32, v31, v33, v33);
LABEL_144:
  JUMPOUT(0x18007C3F8LL);
}


/* ===== chunk 18008A810 .. 1800927DF ===== */
// bad sp value at call has been detected, the output may be wrong!
void __fastcall sub_18008A810()
{
  __int64 v0; // rsi
  int v1; // r14d
  __int64 v2; // rbx
  __int64 v3; // rbx
  __int64 v4; // rbx
  __int64 v5; // rbx
  __int64 v6; // rbx
  __int64 v7; // rbx
  __int64 v8; // rbx
  __int64 v9; // r8
  char v10; // al
  __int64 v11; // rdx
  __int64 v12; // rbx
  __int64 v13; // rbx
  __int64 v14; // rbx
  __int64 v15; // rbx
  __int64 v16; // rbx
  __int64 v17; // rbx
  __int64 v18; // rbx
  __int64 v19; // rbx
  __int64 v20; // rbx
  __int64 v21; // rbx
  __int64 v22; // rbx
  __int64 v23; // rbx
  char v24; // al
  __int64 v25; // rdx
  __int64 v26; // rbx
  __int64 v27; // rbx
  __int64 v28; // r9
  __int64 v29; // rbx
  char v30; // al
  __int64 v31; // rbx
  __int64 v32; // rbx
  __int64 v33; // r9
  __int64 v34; // rbx
  char v35; // al
  __int64 v36; // rbx
  __int64 v37; // rbx
  __int64 v38; // r9
  __int64 v39; // rbx
  char v40; // al
  __int64 v41; // rbx
  __int64 v42; // rbx
  __int64 v43; // r9
  __int64 v44; // rbx
  char v45; // al
  __int64 v46; // rbx
  __int64 v47; // rbx
  __int64 v48; // r9
  __int64 v49; // rbx
  char v50; // al
  __int64 v51; // rbx
  __int64 v52; // rbx
  __int64 v53; // r9
  __int64 v54; // rbx
  char v55; // al
  __int64 v56; // rbx
  __int64 v57; // rbx
  __int64 v58; // r9
  __int64 v59; // rbx
  char v60; // al
  __int64 v61; // rbx
  __int64 v62; // rax
  __int64 v63; // rbx
  __int64 v64; // rbx
  char v65; // al
  __int64 v66; // rbx
  __int64 v67; // rax
  __int64 v68; // rbx
  __int64 v69; // rbx
  char v70; // al
  __int64 v71; // rbx
  __int64 v72; // rbx
  __int64 v73; // r8
  __int64 v74; // rbx
  __int64 v75; // rbx
  __int64 v76; // rbx
  __int64 v77; // rbx
  __int64 v78; // rbx
  __int64 v79; // rbx
  __int64 v80; // rbx
  __int64 v81; // rbx
  __int64 v82; // rbx
  __int64 v83; // rbx
  __int64 v84; // rbx
  __int64 v85; // rbx
  __int64 v86; // r8
  char v87; // al
  __int64 v88; // rdx
  __int64 v89; // rbx
  __int64 v90; // rbx
  __int64 v91; // rbx
  __int64 v92; // r8
  char v93; // al
  __int64 v94; // rbx
  __int64 v95; // rbx
  __int64 v96; // rbx
  __int64 v97; // [rsp+90h] [rbp+10h] BYREF
  __int64 v98; // [rsp+98h] [rbp+18h] BYREF
  __int64 v99; // [rsp+A0h] [rbp+20h] BYREF
  __int64 v100; // [rsp+A8h] [rbp+28h] BYREF
  __int64 v101; // [rsp+B0h] [rbp+30h] BYREF
  __int64 v102; // [rsp+B8h] [rbp+38h] BYREF
  __int64 v103; // [rsp+C0h] [rbp+40h] BYREF
  __int64 v104; // [rsp+C8h] [rbp+48h] BYREF
  __int64 v105; // [rsp+D0h] [rbp+50h] BYREF
  __int64 v106; // [rsp+D8h] [rbp+58h] BYREF
  float v107[12]; // [rsp+E0h] [rbp+60h] BYREF
  _BYTE v108[24]; // [rsp+110h] [rbp+90h] BYREF
  __int64 v109[3]; // [rsp+128h] [rbp+A8h] BYREF
  __int64 v110[8]; // [rsp+140h] [rbp+C0h] BYREF

  sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 666, 372);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0
    || (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
  {
    v2 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 120LL))(v0);
    (*(void (__fastcall **)(__int64))(*(_QWORD *)v0 + 136LL))(v0);
    v110[0] = v2;
    v109[0] = v2;
    sub_180026960(v108, v107, v109, v109);
    goto LABEL_731;
  }
  sub_180026DB0(v107, &v103);
  sub_180026DB0(v107, &v101);
  sub_180026DB0(v107, &v102);
  sub_180026DB0(v107, &v105);
  sub_180026DB0(v107, &v100);
  sub_180026DB0(v107, &v99);
  sub_180026DB0(v107, &v97);
  sub_180026DB0(v107, &v98);
  sub_180026DB0(v107, &v104);
  sub_180002660(v0, v107);
  LODWORD(v110[0]) = 3;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0 )
  {
    sub_180026DB0(v107, &v103);
    sub_180026DB0(v107, &v101);
    sub_180026DB0(v107, &v102);
    sub_180026DB0(v107, &v105);
    sub_180026DB0(v107, &v100);
    sub_180026DB0(v107, &v99);
    sub_180026DB0(v107, &v97);
    sub_180026DB0(v107, &v98);
    sub_180026DB0(v107, &v104);
    sub_180002660(v0, v107);
    LODWORD(v110[0]) = 3;
    abort();
  }
  v3 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 120LL))(v0);
  (*(void (__fastcall **)(__int64))(*(_QWORD *)v0 + 136LL))(v0);
  v110[0] = v3;
  v109[0] = v3;
  sub_180026960(v108, v107, v109, v109);
  if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)v0 + 256LL))(
         v0,
         v110[0],
         qword_180117D38) == 0 )
LABEL_731:
    JUMPOUT(0x18007C3F8LL);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0 )
  {
    sub_180026DB0(v107, v110);
    sub_180026DB0(v107, &v103);
    sub_180026DB0(v107, &v101);
    sub_180026DB0(v107, &v102);
    sub_180026DB0(v107, &v105);
    sub_180026DB0(v107, &v100);
    sub_180026DB0(v107, &v99);
    sub_180026DB0(v107, &v97);
    sub_180026DB0(v107, &v98);
    sub_180026DB0(v107, &v104);
    sub_180002660(v0, v107);
    if ( qword_180117D40 != 0
      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D40, 0) == 0 )
    {
      goto LABEL_22;
    }
    sub_1800C68B0(&unk_180117B30);
    if ( qword_180117D40 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D40, 0) != 0 )
    {
      v4 = sub_1800023C0(v0);
      if ( v4 != 0 )
      {
        qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v4);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v4);
      }
    }
    sub_1800C6900(&unk_180117B30);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0 )
    {
LABEL_22:
      if ( qword_1801180F0 != 0
        || (qword_1801180F0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL))(
                                v0,
                                qword_180117D40,
                                qword_1801178A0 + 165,
                                qword_1801178A0 + 11543),
            (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0) )
      {
        v110[0] = sub_180002760(v0);
        sub_1800036C0((__int64)v108, v107, v110, v110);
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0 )
        {
          v5 = v110[0];
          if ( v110[0] != 0 )
          {
            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 104LL))(v0, v110[0]);
            v109[0] = v5;
            sub_180026960(v108, v107, v109, v109);
          }
          else
          {
            sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 666, 52);
          }
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0 )
          {
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0 )
            {
              sub_180026DB0(v107, &v103);
              sub_180026DB0(v107, &v101);
              sub_180026DB0(v107, &v102);
              sub_180026DB0(v107, &v105);
              sub_180026DB0(v107, &v100);
              sub_180026DB0(v107, &v99);
              sub_180026DB0(v107, &v97);
              sub_180026DB0(v107, &v98);
              sub_180026DB0(v107, &v104);
              sub_180002660(v0, v107);
              v110[0] = v99;
              sub_1800036C0((__int64)v108, v107, v110, v110);
              if ( qword_180117E78 != 0
                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(
                     v0,
                     qword_180117E78,
                     0) == 0 )
              {
                goto LABEL_47;
              }
              sub_1800C68B0(&unk_180117C68);
              if ( qword_180117E78 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(
                     v0,
                     qword_180117E78,
                     0) != 0 )
              {
                v8 = sub_1800023C0(v0);
                if ( v8 != 0 )
                {
                  qword_180117E78 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v8);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v8);
                }
              }
              sub_1800C6900(&unk_180117C68);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0 )
              {
LABEL_47:
                v9 = qword_180118328;
                if ( qword_180118328 == 0 )
                {
                  qword_180118328 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0
                                                                                                  + 1152LL))(
                                      v0,
                                      qword_180117E78,
                                      qword_1801178A0 + 11727,
                                      qword_1801178A0 + 3461);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
                    goto LABEL_78;
                  v9 = qword_180118328;
                }
                (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 1232LL))(
                  v0,
                  qword_180117E78,
                  v9,
                  v110[0]);
                v10 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0);
                v11 = *(_QWORD *)v0;
                if ( v10 != 0 )
                {
                  v12 = (*(__int64 (__fastcall **)(__int64))(v11 + 120))(v0);
                  (*(void (__fastcall **)(__int64))(*(_QWORD *)v0 + 136LL))(v0);
                  v110[0] = v12;
                  v109[0] = v12;
                  sub_180026960(v108, v107, v109, v109);
                  goto LABEL_79;
                }
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(v11 + 1824))(v0) == 0 )
                {
                  v110[0] = v103;
                  sub_1800036C0((__int64)v108, v107, v110, v110);
                  LODWORD(v106) = 1;
                  if ( qword_180117D40 != 0
                    && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(
                         v0,
                         qword_180117D40,
                         0) == 0 )
                  {
                    goto LABEL_747;
                  }
                  sub_1800C68B0(&unk_180117B30);
                  if ( qword_180117D40 == 0
                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(
                         v0,
                         qword_180117D40,
                         0) != 0 )
                  {
                    v14 = sub_1800023C0(v0);
                    if ( v14 != 0 )
                    {
                      qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v14);
                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v14);
                    }
                  }
                  sub_1800C6900(&unk_180117B30);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0 )
                  {
LABEL_747:
                    if ( qword_180118320 != 0
                      || (qword_180118320 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 752LL))(
                                              v0,
                                              qword_180117D40,
                                              qword_1801178A0 + 11723,
                                              qword_1801178A0 + 489),
                          (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0) )
                    {
                      if ( v110[0] != 0 )
                        (*(void (__fastcall **)(__int64, __int64, __int64, _QWORD))(*(_QWORD *)v0 + 840LL))(
                          v0,
                          v110[0],
                          qword_180118320,
                          (unsigned __int8)v106);
                      else
                        sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 1288, 385);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0 )
                      {
                        LODWORD(v110[0]) = v1;
                        if ( v1 != 0 )
                          goto LABEL_741;
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0 )
                          goto LABEL_82;
                      }
                    }
                  }
                }
              }
            }
LABEL_78:
            v15 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 120LL))(v0);
            (*(void (__fastcall **)(__int64))(*(_QWORD *)v0 + 136LL))(v0);
            v110[0] = v15;
            v109[0] = v15;
            sub_180026960(v108, v107, v109, v109);
LABEL_79:
            if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)v0 + 256LL))(
                   v0,
                   v110[0],
                   qword_180117D38) == 0 )
              goto LABEL_731;
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
              goto LABEL_117;
            sub_180026DB0(v107, v110);
            sub_180026DB0(v107, &v103);
            sub_180026DB0(v107, &v101);
            sub_180026DB0(v107, &v102);
            sub_180026DB0(v107, &v105);
            sub_180026DB0(v107, &v100);
            sub_180026DB0(v107, &v99);
            sub_180026DB0(v107, &v97);
            sub_180026DB0(v107, &v98);
            sub_180026DB0(v107, &v104);
            sub_180002660(v0, v107);
            if ( qword_180117D40 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(
                   v0,
                   qword_180117D40,
                   0) != 0 )
            {
              sub_1800C68B0(&unk_180117B30);
              if ( qword_180117D40 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(
                     v0,
                     qword_180117D40,
                     0) != 0 )
              {
                v16 = sub_1800023C0(v0);
                if ( v16 != 0 )
                {
                  qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v16);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v16);
                }
              }
              sub_1800C6900(&unk_180117B30);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
                goto LABEL_117;
            }
            if ( qword_1801180F0 == 0 )
            {
              qword_1801180F0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL))(
                                  v0,
                                  qword_180117D40,
                                  qword_1801178A0 + 165,
                                  qword_1801178A0 + 11543);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
                goto LABEL_117;
            }
            v110[0] = sub_180002760(v0);
            sub_1800036C0((__int64)v108, v107, v110, v110);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
              goto LABEL_117;
            v18 = v110[0];
            if ( v110[0] != 0 )
            {
              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 104LL))(v0, v110[0]);
              v109[0] = v18;
              sub_180026960(v108, v107, v109, v109);
            }
            else
            {
              sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 666, 379);
            }
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
              goto LABEL_117;
            goto LABEL_120;
          }
        }
      }
    }
  }
  v6 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 120LL))(v0);
  (*(void (__fastcall **)(__int64))(*(_QWORD *)v0 + 136LL))(v0);
  v110[0] = v6;
  v109[0] = v6;
  sub_180026960(v108, v107, v109, v109);
  if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)v0 + 256LL))(
         v0,
         v110[0],
         qword_180117D38) == 0 )
    goto LABEL_731;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_78;
  sub_180026DB0(v107, v110);
  sub_180026DB0(v107, &v103);
  sub_180026DB0(v107, &v101);
  sub_180026DB0(v107, &v102);
  sub_180026DB0(v107, &v105);
  sub_180026DB0(v107, &v100);
  sub_180026DB0(v107, &v99);
  sub_180026DB0(v107, &v97);
  sub_180026DB0(v107, &v98);
  sub_180026DB0(v107, &v104);
  sub_180002660(v0, v107);
  if ( qword_180117D40 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D40, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117B30);
    if ( qword_180117D40 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D40, 0) != 0 )
    {
      v7 = sub_1800023C0(v0);
      if ( v7 != 0 )
      {
        qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v7);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v7);
      }
    }
    sub_1800C6900(&unk_180117B30);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_78;
  }
  if ( qword_1801180F0 == 0 )
  {
    qword_1801180F0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL))(
                        v0,
                        qword_180117D40,
                        qword_1801178A0 + 165,
                        qword_1801178A0 + 11543);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_78;
  }
  v110[0] = sub_180002760(v0);
  sub_1800036C0((__int64)v108, v107, v110, v110);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_78;
  v13 = v110[0];
  if ( v110[0] != 0 )
  {
    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 104LL))(v0, v110[0]);
    v109[0] = v13;
    sub_180026960(v108, v107, v109, v109);
  }
  else
  {
    sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 666, 385);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_78;
LABEL_82:
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_117;
  sub_180026DB0(v107, &v103);
  sub_180026DB0(v107, &v101);
  sub_180026DB0(v107, &v102);
  sub_180026DB0(v107, &v105);
  sub_180026DB0(v107, &v100);
  sub_180026DB0(v107, &v99);
  sub_180026DB0(v107, &v97);
  sub_180026DB0(v107, &v98);
  sub_180026DB0(v107, &v104);
  sub_180002660(v0, v107);
  if ( qword_180117E78 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117E78, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117C68);
    if ( qword_180117E78 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117E78, 0) != 0 )
    {
      v17 = sub_1800023C0(v0);
      if ( v17 != 0 )
      {
        qword_180117E78 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v17);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v17);
      }
    }
    sub_1800C6900(&unk_180117C68);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_117;
  }
  if ( qword_180118330 == 0 )
  {
    qword_180118330 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 1152LL))(
                        v0,
                        qword_180117E78,
                        qword_1801178A0 + 11731,
                        qword_1801178A0 + 489);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_117;
  }
  LODWORD(v110[0]) = (*(unsigned __int8 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1168LL))(v0, qword_180117E78);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_117;
  if ( LODWORD(v110[0]) != 0 )
    goto LABEL_741;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
  {
LABEL_117:
    v19 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 120LL))(v0);
    (*(void (__fastcall **)(__int64))(*(_QWORD *)v0 + 136LL))(v0);
    v110[0] = v19;
    v109[0] = v19;
    sub_180026960(v108, v107, v109, v109);
    if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)v0 + 256LL))(
           v0,
           v110[0],
           qword_180117D38) == 0 )
      goto LABEL_731;
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
    sub_180026DB0(v107, v110);
    sub_180026DB0(v107, &v103);
    sub_180026DB0(v107, &v101);
    sub_180026DB0(v107, &v102);
    sub_180026DB0(v107, &v105);
    sub_180026DB0(v107, &v100);
    sub_180026DB0(v107, &v99);
    sub_180026DB0(v107, &v97);
    sub_180026DB0(v107, &v98);
    sub_180026DB0(v107, &v104);
    sub_180002660(v0, v107);
    if ( qword_180117D40 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D40, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117B30);
      if ( qword_180117D40 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D40, 0) != 0 )
      {
        v20 = sub_1800023C0(v0);
        if ( v20 != 0 )
        {
          qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v20);
          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v20);
        }
      }
      sub_1800C6900(&unk_180117B30);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
        goto LABEL_561;
    }
    if ( qword_1801180F0 == 0 )
    {
      qword_1801180F0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL))(
                          v0,
                          qword_180117D40,
                          qword_1801178A0 + 165,
                          qword_1801178A0 + 11543);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
        goto LABEL_561;
    }
    v110[0] = sub_180002760(v0);
    sub_1800036C0((__int64)v108, v107, v110, v110);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
    v22 = v110[0];
    if ( v110[0] != 0 )
    {
      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 104LL))(v0, v110[0]);
      v109[0] = v22;
      sub_180026960(v108, v107, v109, v109);
    }
    else
    {
      sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 666, 139);
    }
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
LABEL_565:
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_619;
    sub_180026DB0(v107, &v103);
    sub_180026DB0(v107, &v101);
    sub_180026DB0(v107, &v102);
    sub_180026DB0(v107, &v105);
    sub_180026DB0(v107, &v100);
    sub_180026DB0(v107, &v99);
    sub_180026DB0(v107, &v97);
    sub_180026DB0(v107, &v98);
    sub_180026DB0(v107, &v104);
    sub_180002660(v0, v107);
    v110[0] = v99;
    sub_1800036C0((__int64)v108, v107, v110, v110);
    if ( qword_180117D40 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D40, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117B30);
      if ( qword_180117D40 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D40, 0) != 0 )
      {
        v76 = sub_1800023C0(v0);
        if ( v76 != 0 )
        {
          qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v76);
          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v76);
        }
      }
      sub_1800C6900(&unk_180117B30);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
        goto LABEL_619;
    }
    if ( qword_180118300 == 0 )
    {
      qword_180118300 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 1152LL))(
                          v0,
                          qword_180117D40,
                          qword_1801178A0 + 165,
                          qword_1801178A0 + 2622);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
        goto LABEL_619;
    }
    v106 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1160LL))(v0, qword_180117D40);
    sub_1800036C0((__int64)v108, v107, &v106, &v106);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_619;
    if ( v106 != 0 )
    {
      v106 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)v0 + 1384LL))(v0, v106, 24);
      sub_1800036C0((__int64)v108, v107, &v106, &v106);
    }
    else
    {
      sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 1051, 359);
    }
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_619;
    if ( qword_180117E70 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117E70, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117C60);
      if ( qword_180117E70 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117E70, 0) != 0 )
      {
        v78 = sub_1800023C0(v0);
        if ( v78 != 0 )
        {
          qword_180117E70 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v78);
          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v78);
        }
      }
      sub_1800C6900(&unk_180117C60);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
        goto LABEL_619;
    }
    if ( qword_1801181D0 == 0 )
    {
      qword_1801181D0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL))(
                          v0,
                          qword_180117E70,
                          qword_1801178A0 + 11931,
                          qword_1801178A0 + 11948);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
        goto LABEL_619;
    }
    if ( v110[0] != 0 )
      LODWORD(v110[0]) = (unsigned __int8)sub_1800BE240(v0, v110[0], qword_1801181D0);
    else
      sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 10095, 359);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_619;
    if ( LODWORD(v110[0]) == 0 )
      goto LABEL_741;
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_619;
LABEL_622:
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_657;
    sub_180026DB0(v107, &v103);
    sub_180026DB0(v107, &v101);
    sub_180026DB0(v107, &v102);
    sub_180026DB0(v107, &v105);
    sub_180026DB0(v107, &v100);
    sub_180026DB0(v107, &v99);
    sub_180026DB0(v107, &v97);
    sub_180026DB0(v107, &v98);
    sub_180026DB0(v107, &v104);
    sub_180002660(v0, v107);
    if ( qword_180117E78 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117E78, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117C68);
      if ( qword_180117E78 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117E78, 0) != 0 )
      {
        v81 = sub_1800023C0(v0);
        if ( v81 != 0 )
        {
          qword_180117E78 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v81);
          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v81);
        }
      }
      sub_1800C6900(&unk_180117C68);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
        goto LABEL_657;
    }
    if ( qword_180118348 == 0 )
    {
      qword_180118348 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 1152LL))(
                          v0,
                          qword_180117E78,
                          qword_1801178A0 + 11970,
                          qword_1801178A0 + 489);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
        goto LABEL_657;
    }
    LODWORD(v110[0]) = (*(unsigned __int8 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1168LL))(
                         v0,
                         qword_180117E78);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_657;
    if ( LODWORD(v110[0]) != 0 )
    {
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0 )
        goto LABEL_660;
LABEL_657:
      v83 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 120LL))(v0);
      (*(void (__fastcall **)(__int64))(*(_QWORD *)v0 + 136LL))(v0);
      v110[0] = v83;
      v109[0] = v83;
      sub_180026960(v108, v107, v109, v109);
      if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)v0 + 256LL))(
             v0,
             v110[0],
             qword_180117D38) != 0 )
      {
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0 )
        {
          sub_180026DB0(v107, v110);
          sub_180026DB0(v107, &v103);
          sub_180026DB0(v107, &v101);
          sub_180026DB0(v107, &v102);
          sub_180026DB0(v107, &v105);
          sub_180026DB0(v107, &v100);
          sub_180026DB0(v107, &v99);
          sub_180026DB0(v107, &v97);
          sub_180026DB0(v107, &v98);
          sub_180026DB0(v107, &v104);
          sub_180002660(v0, v107);
          if ( qword_180117D40 != 0
            && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(
                 v0,
                 qword_180117D40,
                 0) == 0 )
          {
            goto LABEL_748;
          }
          sub_1800C68B0(&unk_180117B30);
          if ( qword_180117D40 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(
                 v0,
                 qword_180117D40,
                 0) != 0 )
          {
            v84 = sub_1800023C0(v0);
            if ( v84 != 0 )
            {
              qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v84);
              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v84);
            }
          }
          sub_1800C6900(&unk_180117B30);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0 )
          {
LABEL_748:
            if ( qword_1801180F0 != 0
              || (qword_1801180F0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL))(
                                      v0,
                                      qword_180117D40,
                                      qword_1801178A0 + 165,
                                      qword_1801178A0 + 11543),
                  (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0) )
            {
              v110[0] = sub_180002760(v0);
              sub_1800036C0((__int64)v108, v107, v110, v110);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0 )
              {
                v90 = v110[0];
                if ( v110[0] != 0 )
                {
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 104LL))(v0, v110[0]);
                  v109[0] = v90;
                  sub_180026960(v108, v107, v109, v109);
                }
                else
                {
                  sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 666, 388);
                }
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0 )
                  JUMPOUT(0x180092F20LL);
              }
            }
          }
        }
        goto LABEL_730;
      }
      goto LABEL_731;
    }
LABEL_741:
    JUMPOUT(0x18009815CLL);
  }
LABEL_120:
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  sub_180026DB0(v107, &v103);
  sub_180026DB0(v107, &v101);
  sub_180026DB0(v107, &v102);
  sub_180026DB0(v107, &v105);
  sub_180026DB0(v107, &v100);
  sub_180026DB0(v107, &v99);
  sub_180026DB0(v107, &v97);
  sub_180026DB0(v107, &v98);
  sub_180026DB0(v107, &v104);
  sub_180002660(v0, v107);
  if ( qword_180117E78 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117E78, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117C68);
    if ( qword_180117E78 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117E78, 0) != 0 )
    {
      v21 = sub_1800023C0(v0);
      if ( v21 != 0 )
      {
        qword_180117E78 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v21);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v21);
      }
    }
    sub_1800C6900(&unk_180117C68);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_180118338 == 0 )
  {
    qword_180118338 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 1152LL))(
                        v0,
                        qword_180117E78,
                        qword_1801178A0 + 11735,
                        qword_1801178A0 + 11739);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  v110[0] = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1160LL))(v0, qword_180117E78);
  sub_1800036C0((__int64)v108, v107, v110, v110);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  v106 = v99;
  sub_1800036C0((__int64)v108, v107, &v106, &v106);
  if ( qword_180117E98 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117E98, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117C88);
    if ( qword_180117E98 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117E98, 0) != 0 )
    {
      v23 = sub_1800023C0(v0);
      if ( v23 != 0 )
      {
        qword_180117E98 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v23);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v23);
      }
    }
    sub_1800C6900(&unk_180117C88);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_180118140 == 0 )
  {
    qword_180118140 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL))(
                        v0,
                        qword_180117E98,
                        qword_1801178A0 + 11757,
                        qword_1801178A0 + 10548);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( v110[0] != 0 )
    sub_1800027F0(v0, v110[0], qword_180118140, v106);
  else
    sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 10570, 252);
  v24 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0);
  v25 = *(_QWORD *)v0;
  if ( v24 != 0 )
    goto LABEL_544;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(v25 + 1824))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117D50 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117B40);
    if ( qword_180117D50 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
    {
      v26 = sub_1800023C0(v0);
      if ( v26 != 0 )
      {
        qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v26);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v26);
      }
    }
    sub_1800C6900(&unk_180117B40);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_180117F50 == 0 )
  {
    qword_180117F50 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL))(
                        v0,
                        qword_180117D50,
                        qword_1801178A0 + 10121,
                        qword_1801178A0 + 10125);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  v110[0] = sub_180002760(v0);
  sub_1800036C0((__int64)v108, v107, v110, v110);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117D50 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117B40);
    if ( qword_180117D50 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
    {
      v27 = sub_1800023C0(v0);
      if ( v27 != 0 )
      {
        qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v27);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v27);
      }
    }
    sub_1800C6900(&unk_180117B40);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_180118148 == 0 )
  {
    qword_180118148 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL))(
                        v0,
                        qword_180117D50,
                        qword_1801178A0 + 11761,
                        qword_1801178A0 + 11765);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( v110[0] != 0 )
  {
    v110[0] = sub_180002790(v0);
    sub_1800036C0((__int64)v108, v107, v110, v110);
  }
  else
  {
    sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 140, 232);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117EA0 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117EA0, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117C90);
    if ( qword_180117EA0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117EA0, 0) != 0 )
    {
      v29 = sub_1800023C0(v0);
      if ( v29 != 0 )
      {
        qword_180117EA0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v29);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v29);
      }
    }
    sub_1800C6900(&unk_180117C90);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_180118150 == 0 )
  {
    qword_180118150 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL))(
                        v0,
                        qword_180117EA0,
                        qword_1801178A0 + 11785,
                        qword_1801178A0 + 4);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( v110[0] != 0 )
    sub_1800027F0(v0, v110[0], qword_180118150, v28);
  else
    sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 1627, 232);
  v30 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0);
  v25 = *(_QWORD *)v0;
  if ( v30 != 0 )
    goto LABEL_544;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(v25 + 1824))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117D50 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117B40);
    if ( qword_180117D50 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
    {
      v31 = sub_1800023C0(v0);
      if ( v31 != 0 )
      {
        qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v31);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v31);
      }
    }
    sub_1800C6900(&unk_180117B40);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_180117F50 == 0 )
  {
    qword_180117F50 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL))(
                        v0,
                        qword_180117D50,
                        qword_1801178A0 + 10121,
                        qword_1801178A0 + 10125);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  v110[0] = sub_180002760(v0);
  sub_1800036C0((__int64)v108, v107, v110, v110);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117D50 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117B40);
    if ( qword_180117D50 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
    {
      v32 = sub_1800023C0(v0);
      if ( v32 != 0 )
      {
        qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v32);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v32);
      }
    }
    sub_1800C6900(&unk_180117B40);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_1801180C0 == 0 )
  {
    qword_1801180C0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL))(
                        v0,
                        qword_180117D50,
                        qword_1801178A0 + 11438,
                        qword_1801178A0 + 11442);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( v110[0] != 0 )
  {
    v110[0] = sub_180002790(v0);
    sub_1800036C0((__int64)v108, v107, v110, v110);
  }
  else
  {
    sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 140, 129);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117E60 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117E60, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117C50);
    if ( qword_180117E60 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117E60, 0) != 0 )
    {
      v34 = sub_1800023C0(v0);
      if ( v34 != 0 )
      {
        qword_180117E60 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v34);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v34);
      }
    }
    sub_1800C6900(&unk_180117C50);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_180118158 == 0 )
  {
    qword_180118158 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL))(
                        v0,
                        qword_180117E60,
                        qword_1801178A0 + 11789,
                        qword_1801178A0 + 4);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( v110[0] != 0 )
    sub_1800027F0(v0, v110[0], qword_180118158, v33);
  else
    sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 1627, 129);
  v35 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0);
  v25 = *(_QWORD *)v0;
  if ( v35 != 0 )
    goto LABEL_544;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(v25 + 1824))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117D50 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117B40);
    if ( qword_180117D50 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
    {
      v36 = sub_1800023C0(v0);
      if ( v36 != 0 )
      {
        qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v36);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v36);
      }
    }
    sub_1800C6900(&unk_180117B40);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_180117F50 == 0 )
  {
    qword_180117F50 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL))(
                        v0,
                        qword_180117D50,
                        qword_1801178A0 + 10121,
                        qword_1801178A0 + 10125);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  v110[0] = sub_180002760(v0);
  sub_1800036C0((__int64)v108, v107, v110, v110);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117D50 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117B40);
    if ( qword_180117D50 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
    {
      v37 = sub_1800023C0(v0);
      if ( v37 != 0 )
      {
        qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v37);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v37);
      }
    }
    sub_1800C6900(&unk_180117B40);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_180118160 == 0 )
  {
    qword_180118160 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL))(
                        v0,
                        qword_180117D50,
                        qword_1801178A0 + 11793,
                        qword_1801178A0 + 11797);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( v110[0] != 0 )
  {
    v110[0] = sub_180002790(v0);
    sub_1800036C0((__int64)v108, v107, v110, v110);
  }
  else
  {
    sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 140, 357);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117EA8 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117EA8, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117C98);
    if ( qword_180117EA8 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117EA8, 0) != 0 )
    {
      v39 = sub_1800023C0(v0);
      if ( v39 != 0 )
      {
        qword_180117EA8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v39);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v39);
      }
    }
    sub_1800C6900(&unk_180117C98);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_180118168 == 0 )
  {
    qword_180118168 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL))(
                        v0,
                        qword_180117EA8,
                        qword_1801178A0 + 11816,
                        qword_1801178A0 + 4);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( v110[0] != 0 )
    sub_1800027F0(v0, v110[0], qword_180118168, v38);
  else
    sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 1627, 357);
  v40 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0);
  v25 = *(_QWORD *)v0;
  if ( v40 != 0 )
    goto LABEL_544;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(v25 + 1824))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117D50 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117B40);
    if ( qword_180117D50 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
    {
      v41 = sub_1800023C0(v0);
      if ( v41 != 0 )
      {
        qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v41);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v41);
      }
    }
    sub_1800C6900(&unk_180117B40);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_180117F50 == 0 )
  {
    qword_180117F50 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL))(
                        v0,
                        qword_180117D50,
                        qword_1801178A0 + 10121,
                        qword_1801178A0 + 10125);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  v110[0] = sub_180002760(v0);
  sub_1800036C0((__int64)v108, v107, v110, v110);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117D50 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117B40);
    if ( qword_180117D50 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
    {
      v42 = sub_1800023C0(v0);
      if ( v42 != 0 )
      {
        qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v42);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v42);
      }
    }
    sub_1800C6900(&unk_180117B40);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_180118170 == 0 )
  {
    qword_180118170 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL))(
                        v0,
                        qword_180117D50,
                        qword_1801178A0 + 11820,
                        qword_1801178A0 + 11824);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( v110[0] != 0 )
  {
    v110[0] = sub_180002790(v0);
    sub_1800036C0((__int64)v108, v107, v110, v110);
  }
  else
  {
    sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 140, 366);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117EB0 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117EB0, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117CA0);
    if ( qword_180117EB0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117EB0, 0) != 0 )
    {
      v44 = sub_1800023C0(v0);
      if ( v44 != 0 )
      {
        qword_180117EB0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v44);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v44);
      }
    }
    sub_1800C6900(&unk_180117CA0);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_180118178 == 0 )
  {
    qword_180118178 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL))(
                        v0,
                        qword_180117EB0,
                        qword_1801178A0 + 11844,
                        qword_1801178A0 + 4);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( v110[0] != 0 )
    sub_1800027F0(v0, v110[0], qword_180118178, v43);
  else
    sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 1627, 366);
  v45 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0);
  v25 = *(_QWORD *)v0;
  if ( v45 != 0 )
    goto LABEL_544;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(v25 + 1824))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117D50 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117B40);
    if ( qword_180117D50 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
    {
      v46 = sub_1800023C0(v0);
      if ( v46 != 0 )
      {
        qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v46);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v46);
      }
    }
    sub_1800C6900(&unk_180117B40);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_180117F50 == 0 )
  {
    qword_180117F50 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL))(
                        v0,
                        qword_180117D50,
                        qword_1801178A0 + 10121,
                        qword_1801178A0 + 10125);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  v110[0] = sub_180002760(v0);
  sub_1800036C0((__int64)v108, v107, v110, v110);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117D50 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117B40);
    if ( qword_180117D50 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
    {
      v47 = sub_1800023C0(v0);
      if ( v47 != 0 )
      {
        qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v47);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v47);
      }
    }
    sub_1800C6900(&unk_180117B40);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_180118180 == 0 )
  {
    qword_180118180 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL))(
                        v0,
                        qword_180117D50,
                        qword_1801178A0 + 11848,
                        qword_1801178A0 + 11852);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( v110[0] != 0 )
  {
    v110[0] = sub_180002790(v0);
    sub_1800036C0((__int64)v108, v107, v110, v110);
  }
  else
  {
    sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 140, 137);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117EB8 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117EB8, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117CA8);
    if ( qword_180117EB8 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117EB8, 0) != 0 )
    {
      v49 = sub_1800023C0(v0);
      if ( v49 != 0 )
      {
        qword_180117EB8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v49);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v49);
      }
    }
    sub_1800C6900(&unk_180117CA8);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_180118188 == 0 )
  {
    qword_180118188 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL))(
                        v0,
                        qword_180117EB8,
                        qword_1801178A0 + 11872,
                        qword_1801178A0 + 4);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( v110[0] != 0 )
    sub_1800027F0(v0, v110[0], qword_180118188, v48);
  else
    sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 1627, 137);
  v50 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0);
  v25 = *(_QWORD *)v0;
  if ( v50 != 0 )
    goto LABEL_544;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(v25 + 1824))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117D50 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117B40);
    if ( qword_180117D50 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
    {
      v51 = sub_1800023C0(v0);
      if ( v51 != 0 )
      {
        qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v51);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v51);
      }
    }
    sub_1800C6900(&unk_180117B40);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_180117F50 == 0 )
  {
    qword_180117F50 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL))(
                        v0,
                        qword_180117D50,
                        qword_1801178A0 + 10121,
                        qword_1801178A0 + 10125);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  v110[0] = sub_180002760(v0);
  sub_1800036C0((__int64)v108, v107, v110, v110);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117D50 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117B40);
    if ( qword_180117D50 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
    {
      v52 = sub_1800023C0(v0);
      if ( v52 != 0 )
      {
        qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v52);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v52);
      }
    }
    sub_1800C6900(&unk_180117B40);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_180118190 == 0 )
  {
    qword_180118190 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL))(
                        v0,
                        qword_180117D50,
                        qword_1801178A0 + 11876,
                        qword_1801178A0 + 11880);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( v110[0] != 0 )
  {
    v110[0] = sub_180002790(v0);
    sub_1800036C0((__int64)v108, v107, v110, v110);
  }
  else
  {
    sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 140, 231);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117EC0 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117EC0, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117CB0);
    if ( qword_180117EC0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117EC0, 0) != 0 )
    {
      v54 = sub_1800023C0(v0);
      if ( v54 != 0 )
      {
        qword_180117EC0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v54);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v54);
      }
    }
    sub_1800C6900(&unk_180117CB0);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_180118198 == 0 )
  {
    qword_180118198 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL))(
                        v0,
                        qword_180117EC0,
                        qword_1801178A0 + 11872,
                        qword_1801178A0 + 4);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( v110[0] != 0 )
    sub_1800027F0(v0, v110[0], qword_180118198, v53);
  else
    sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 1627, 231);
  v55 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0);
  v25 = *(_QWORD *)v0;
  if ( v55 != 0 )
    goto LABEL_544;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(v25 + 1824))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117D50 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117B40);
    if ( qword_180117D50 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
    {
      v56 = sub_1800023C0(v0);
      if ( v56 != 0 )
      {
        qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v56);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v56);
      }
    }
    sub_1800C6900(&unk_180117B40);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_180117F50 == 0 )
  {
    qword_180117F50 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL))(
                        v0,
                        qword_180117D50,
                        qword_1801178A0 + 10121,
                        qword_1801178A0 + 10125);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  v110[0] = sub_180002760(v0);
  sub_1800036C0((__int64)v108, v107, v110, v110);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117D50 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117B40);
    if ( qword_180117D50 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D50, 0) != 0 )
    {
      v57 = sub_1800023C0(v0);
      if ( v57 != 0 )
      {
        qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v57);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v57);
      }
    }
    sub_1800C6900(&unk_180117B40);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_1801181A0 == 0 )
  {
    qword_1801181A0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL))(
                        v0,
                        qword_180117D50,
                        qword_1801178A0 + 11900,
                        qword_1801178A0 + 11903);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( v110[0] != 0 )
  {
    v110[0] = sub_180002790(v0);
    sub_1800036C0((__int64)v108, v107, v110, v110);
  }
  else
  {
    sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 140, 318);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117EC8 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117EC8, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117CB8);
    if ( qword_180117EC8 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117EC8, 0) != 0 )
    {
      v59 = sub_1800023C0(v0);
      if ( v59 != 0 )
      {
        qword_180117EC8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v59);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v59);
      }
    }
    sub_1800C6900(&unk_180117CB8);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_1801181A8 == 0 )
  {
    qword_1801181A8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL))(
                        v0,
                        qword_180117EC8,
                        qword_1801178A0 + 11923,
                        qword_1801178A0 + 4);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( v110[0] != 0 )
    sub_1800027F0(v0, v110[0], qword_1801181A8, v58);
  else
    sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 1627, 318);
  v60 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0);
  v25 = *(_QWORD *)v0;
  if ( v60 != 0 )
    goto LABEL_544;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(v25 + 1824))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117ED0 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117ED0, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117CC0);
    if ( qword_180117ED0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117ED0, 0) != 0 )
    {
      v61 = sub_1800023C0(v0);
      if ( v61 != 0 )
      {
        qword_180117ED0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v61);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v61);
      }
    }
    sub_1800C6900(&unk_180117CC0);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  v62 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 216LL))(v0, qword_180117ED0);
  v109[0] = v62;
  if ( v62 != 0 )
  {
    v110[0] = v62;
    sub_1800036C0((__int64)v108, v107, v109, v109);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  v106 = v110[0];
  if ( qword_180117ED0 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117ED0, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117CC0);
    if ( qword_180117ED0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117ED0, 0) != 0 )
    {
      v63 = sub_1800023C0(v0);
      if ( v63 != 0 )
      {
        qword_180117ED0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v63);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v63);
      }
    }
    sub_1800C6900(&unk_180117CC0);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_1801181B0 == 0 )
  {
    qword_1801181B0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL))(
                        v0,
                        qword_180117ED0,
                        qword_1801178A0 + 1163,
                        qword_1801178A0 + 4);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( v106 != 0 )
    sub_180026870(v0, v106, qword_180117ED0, qword_1801181B0);
  else
    sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 1195, 319);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  v106 = v103;
  sub_1800036C0((__int64)v108, v107, &v106, &v106);
  if ( qword_180117ED0 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117ED0, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117CC0);
    if ( qword_180117ED0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117ED0, 0) != 0 )
    {
      v64 = sub_1800023C0(v0);
      if ( v64 != 0 )
      {
        qword_180117ED0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v64);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v64);
      }
    }
    sub_1800C6900(&unk_180117CC0);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_1801181B8 == 0 )
  {
    qword_1801181B8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL))(
                        v0,
                        qword_180117ED0,
                        qword_1801178A0 + 10304,
                        qword_1801178A0 + 10308);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( v110[0] != 0 )
    sub_1800027F0(v0, v110[0], qword_1801181B8, v106);
  else
    sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 1627, 319);
  v65 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0);
  v25 = *(_QWORD *)v0;
  if ( v65 != 0 )
    goto LABEL_544;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(v25 + 1824))(v0) != 0 )
    goto LABEL_561;
  if ( qword_180117ED8 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117ED8, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117CC8);
    if ( qword_180117ED8 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117ED8, 0) != 0 )
    {
      v66 = sub_1800023C0(v0);
      if ( v66 != 0 )
      {
        qword_180117ED8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v66);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v66);
      }
    }
    sub_1800C6900(&unk_180117CC8);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  v67 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 216LL))(v0, qword_180117ED8);
  v109[0] = v67;
  if ( v67 != 0 )
  {
    v110[0] = v67;
    sub_1800036C0((__int64)v108, v107, v109, v109);
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  v106 = v110[0];
  if ( qword_180117ED8 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117ED8, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117CC8);
    if ( qword_180117ED8 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117ED8, 0) != 0 )
    {
      v68 = sub_1800023C0(v0);
      if ( v68 != 0 )
      {
        qword_180117ED8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v68);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v68);
      }
    }
    sub_1800C6900(&unk_180117CC8);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_1801181C0 == 0 )
  {
    qword_1801181C0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL))(
                        v0,
                        qword_180117ED8,
                        qword_1801178A0 + 1163,
                        qword_1801178A0 + 4);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( v106 != 0 )
    sub_180026870(v0, v106, qword_180117ED8, qword_1801181C0);
  else
    sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 1195, 148);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  v106 = v103;
  sub_1800036C0((__int64)v108, v107, &v106, &v106);
  if ( qword_180117ED8 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117ED8, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117CC8);
    if ( qword_180117ED8 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117ED8, 0) != 0 )
    {
      v69 = sub_1800023C0(v0);
      if ( v69 != 0 )
      {
        qword_180117ED8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v69);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v69);
      }
    }
    sub_1800C6900(&unk_180117CC8);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( qword_1801181C8 == 0 )
  {
    qword_1801181C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 264LL))(
                        v0,
                        qword_180117ED8,
                        qword_1801178A0 + 10304,
                        qword_1801178A0 + 10308);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
  }
  if ( v110[0] != 0 )
    sub_1800027F0(v0, v110[0], qword_1801181C8, v106);
  else
    sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 1627, 148);
  v70 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0);
  v25 = *(_QWORD *)v0;
  if ( v70 != 0 )
  {
LABEL_544:
    v71 = (*(__int64 (__fastcall **)(__int64))(v25 + 120))(v0);
    (*(void (__fastcall **)(__int64))(*(_QWORD *)v0 + 136LL))(v0);
    v110[0] = v71;
    v109[0] = v71;
    sub_180026960(v108, v107, v109, v109);
    goto LABEL_562;
  }
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(v25 + 1824))(v0) != 0 )
    goto LABEL_561;
  LODWORD(v110[0]) = 1;
  if ( qword_180117E78 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117E78, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117C68);
    if ( qword_180117E78 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117E78, 0) != 0 )
    {
      v72 = sub_1800023C0(v0);
      if ( v72 != 0 )
      {
        qword_180117E78 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v72);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v72);
      }
    }
    sub_1800C6900(&unk_180117C68);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    {
LABEL_561:
      v74 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 120LL))(v0);
      (*(void (__fastcall **)(__int64))(*(_QWORD *)v0 + 136LL))(v0);
      v110[0] = v74;
      v109[0] = v74;
      sub_180026960(v108, v107, v109, v109);
LABEL_562:
      if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)v0 + 256LL))(
             v0,
             v110[0],
             qword_180117D38) == 0 )
        goto LABEL_731;
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
        goto LABEL_619;
      sub_180026DB0(v107, v110);
      sub_180026DB0(v107, &v103);
      sub_180026DB0(v107, &v101);
      sub_180026DB0(v107, &v102);
      sub_180026DB0(v107, &v105);
      sub_180026DB0(v107, &v100);
      sub_180026DB0(v107, &v99);
      sub_180026DB0(v107, &v97);
      sub_180026DB0(v107, &v98);
      sub_180026DB0(v107, &v104);
      sub_180002660(v0, v107);
      if ( qword_180117D40 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(v0, qword_180117D40, 0) != 0 )
      {
        sub_1800C68B0(&unk_180117B30);
        if ( qword_180117D40 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(
               v0,
               qword_180117D40,
               0) != 0 )
        {
          v75 = sub_1800023C0(v0);
          if ( v75 != 0 )
          {
            qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v75);
            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v75);
          }
        }
        sub_1800C6900(&unk_180117B30);
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
          goto LABEL_619;
      }
      if ( qword_1801180F0 == 0 )
      {
        qword_1801180F0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL))(
                            v0,
                            qword_180117D40,
                            qword_1801178A0 + 165,
                            qword_1801178A0 + 11543);
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
          goto LABEL_619;
      }
      v110[0] = sub_180002760(v0);
      sub_1800036C0((__int64)v108, v107, v110, v110);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
        goto LABEL_619;
      v77 = v110[0];
      if ( v110[0] != 0 )
      {
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 104LL))(v0, v110[0]);
        v109[0] = v77;
        sub_180026960(v108, v107, v109, v109);
      }
      else
      {
        sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 666, 359);
      }
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      {
LABEL_619:
        v79 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 120LL))(v0);
        (*(void (__fastcall **)(__int64))(*(_QWORD *)v0 + 136LL))(v0);
        v110[0] = v79;
        v109[0] = v79;
        sub_180026960(v108, v107, v109, v109);
        if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)v0 + 256LL))(
               v0,
               v110[0],
               qword_180117D38) == 0 )
          goto LABEL_731;
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
          goto LABEL_657;
        sub_180026DB0(v107, v110);
        sub_180026DB0(v107, &v103);
        sub_180026DB0(v107, &v101);
        sub_180026DB0(v107, &v102);
        sub_180026DB0(v107, &v105);
        sub_180026DB0(v107, &v100);
        sub_180026DB0(v107, &v99);
        sub_180026DB0(v107, &v97);
        sub_180026DB0(v107, &v98);
        sub_180026DB0(v107, &v104);
        sub_180002660(v0, v107);
        if ( qword_180117D40 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(
               v0,
               qword_180117D40,
               0) != 0 )
        {
          sub_1800C68B0(&unk_180117B30);
          if ( qword_180117D40 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(
                 v0,
                 qword_180117D40,
                 0) != 0 )
          {
            v80 = sub_1800023C0(v0);
            if ( v80 != 0 )
            {
              qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v80);
              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v80);
            }
          }
          sub_1800C6900(&unk_180117B30);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
            goto LABEL_657;
        }
        if ( qword_1801180F0 == 0 )
        {
          qword_1801180F0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL))(
                              v0,
                              qword_180117D40,
                              qword_1801178A0 + 165,
                              qword_1801178A0 + 11543);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
            goto LABEL_657;
        }
        v110[0] = sub_180002760(v0);
        sub_1800036C0((__int64)v108, v107, v110, v110);
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
          goto LABEL_657;
        v82 = v110[0];
        if ( v110[0] != 0 )
        {
          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 104LL))(v0, v110[0]);
          v109[0] = v82;
          sub_180026960(v108, v107, v109, v109);
        }
        else
        {
          sub_180002110(v0, qword_1801178A0 + 109, qword_1801178A0 + 666, 359);
        }
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
          goto LABEL_657;
LABEL_660:
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
          goto LABEL_730;
        sub_180026DB0(v107, &v103);
        sub_180026DB0(v107, &v101);
        sub_180026DB0(v107, &v102);
        sub_180026DB0(v107, &v105);
        sub_180026DB0(v107, &v100);
        sub_180026DB0(v107, &v99);
        sub_180026DB0(v107, &v97);
        sub_180026DB0(v107, &v98);
        sub_180026DB0(v107, &v104);
        sub_180002660(v0, v107);
        LODWORD(v110[0]) = 0;
        if ( qword_180117E78 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(
               v0,
               qword_180117E78,
               0) != 0 )
        {
          sub_1800C68B0(&unk_180117C68);
          if ( qword_180117E78 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(
                 v0,
                 qword_180117E78,
                 0) != 0 )
          {
            v85 = sub_1800023C0(v0);
            if ( v85 != 0 )
            {
              qword_180117E78 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v85);
              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v85);
            }
          }
          sub_1800C6900(&unk_180117C68);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
            goto LABEL_730;
        }
        v86 = qword_180118330;
        if ( qword_180118330 == 0 )
        {
          qword_180118330 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 1152LL))(
                              v0,
                              qword_180117E78,
                              qword_1801178A0 + 11731,
                              qword_1801178A0 + 489);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
          {
LABEL_730:
            v96 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 120LL))(v0);
            (*(void (__fastcall **)(__int64))(*(_QWORD *)v0 + 136LL))(v0);
            v110[0] = v96;
            v109[0] = v96;
            sub_180026960(v108, v107, v109, v109);
LABEL_737:
            JUMPOUT(0x1800934F2LL);
          }
          v86 = qword_180118330;
        }
        (*(void (__fastcall **)(__int64, __int64, __int64, _QWORD))(*(_QWORD *)v0 + 1240LL))(
          v0,
          qword_180117E78,
          v86,
          LOBYTE(v110[0]));
        v87 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0);
        v88 = *(_QWORD *)v0;
        if ( v87 == 0 )
        {
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(v88 + 1824))(v0) != 0 )
            goto LABEL_730;
          v110[0] = v99;
          sub_1800036C0((__int64)v108, v107, v110, v110);
          if ( qword_180117E78 == 0
            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(
                 v0,
                 qword_180117E78,
                 0) != 0 )
          {
            sub_1800C68B0(&unk_180117C68);
            if ( qword_180117E78 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(
                   v0,
                   qword_180117E78,
                   0) != 0 )
            {
              v91 = sub_1800023C0(v0);
              if ( v91 != 0 )
              {
                qword_180117E78 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v91);
                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v91);
              }
            }
            sub_1800C6900(&unk_180117C68);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
              goto LABEL_730;
          }
          v92 = qword_180118350;
          if ( qword_180118350 == 0 )
          {
            qword_180118350 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 1152LL))(
                                v0,
                                qword_180117E78,
                                qword_1801178A0 + 11974,
                                qword_1801178A0 + 3461);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
              goto LABEL_730;
            v92 = qword_180118350;
          }
          (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 1232LL))(
            v0,
            qword_180117E78,
            v92,
            v110[0]);
          v93 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0);
          v88 = *(_QWORD *)v0;
          if ( v93 == 0 )
          {
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(v88 + 1824))(v0) == 0 )
            {
              if ( qword_180117E78 != 0
                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(
                     v0,
                     qword_180117E78,
                     0) == 0 )
              {
                goto LABEL_749;
              }
              sub_1800C68B0(&unk_180117C68);
              if ( qword_180117E78 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(
                     v0,
                     qword_180117E78,
                     0) != 0 )
              {
                v94 = sub_1800023C0(v0);
                if ( v94 != 0 )
                {
                  qword_180117E78 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(v0, v94);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v94);
                }
              }
              sub_1800C6900(&unk_180117C68);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0 )
              {
LABEL_749:
                if ( qword_180118338 != 0
                  || (qword_180118338 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 1152LL))(
                                          v0,
                                          qword_180117E78,
                                          qword_1801178A0 + 11735,
                                          qword_1801178A0 + 11739),
                      (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0) )
                {
                  v110[0] = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1160LL))(v0, qword_180117E78);
                  sub_1800036C0((__int64)v108, v107, v110, v110);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0 )
                  {
                    if ( qword_180117D50 != 0
                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(
                           v0,
                           qword_180117D50,
                           0) == 0 )
                    {
                      goto LABEL_728;
                    }
                    sub_1800C68B0(&unk_180117B40);
                    if ( qword_180117D50 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)v0 + 192LL))(
                           v0,
                           qword_180117D50,
                           0) != 0 )
                    {
                      v95 = sub_1800023C0(v0);
                      if ( v95 != 0 )
                      {
                        qword_180117D50 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 1808LL))(
                                            v0,
                                            v95);
                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)v0 + 184LL))(v0, v95);
                      }
                    }
                    sub_1800C6900(&unk_180117B40);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0 )
                    {
LABEL_728:
                      if ( qword_180117F50 != 0 )
                        JUMPOUT(0x1800927E6LL);
                      qword_180117F50 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 904LL))(
                                          v0,
                                          qword_180117D50,
                                          qword_1801178A0 + 10121,
                                          qword_1801178A0 + 10125);
                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) == 0 )
                        JUMPOUT(0x1800927DFLL);
                    }
                  }
                }
              }
            }
            goto LABEL_730;
          }
        }
        v89 = (*(__int64 (__fastcall **)(__int64))(v88 + 120))(v0);
        (*(void (__fastcall **)(__int64))(*(_QWORD *)v0 + 136LL))(v0);
        v110[0] = v89;
        v109[0] = v89;
        sub_180026960(v108, v107, v109, v109);
        goto LABEL_737;
      }
      goto LABEL_622;
    }
  }
  v73 = qword_180118340;
  if ( qword_180118340 == 0 )
  {
    qword_180118340 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v0 + 1152LL))(
                        v0,
                        qword_180117E78,
                        qword_1801178A0 + 11927,
                        qword_1801178A0 + 489);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
      goto LABEL_561;
    v73 = qword_180118340;
  }
  (*(void (__fastcall **)(__int64, __int64, __int64, _QWORD))(*(_QWORD *)v0 + 1240LL))(
    v0,
    qword_180117E78,
    v73,
    LOBYTE(v110[0]));
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  LODWORD(v110[0]) = v1;
  if ( v1 != 0 )
    goto LABEL_741;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)v0 + 1824LL))(v0) != 0 )
    goto LABEL_561;
  goto LABEL_565;
}


/* ===== chunk 1800927DF .. 18009A7E6 ===== */
/* decompile failed */

/* ===== chunk 18009A7E6 .. 18009C88C ===== */
// bad sp value at call has been detected, the output may be wrong!
void __fastcall __noreturn sub_18009A7E6()
{
  void *v0; // rax
  void *v1; // rsi
  __int64 v2; // [rsp+E0h] [rbp+60h] BYREF

  v1 = v0;
  sub_180003630(&v2);
  sub_1800C7320(v1);
}
