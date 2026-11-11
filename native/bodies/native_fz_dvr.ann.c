__int64 __fastcall sub_180030010(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5)
{
  __int64 v8; // rdi
  __int64 v10; // rax
  __int64 v11; // r15
  __int64 v12; // rbx
  char v13; // al
  __int64 v14; // rdx
  __int64 v15; // rbx
  __int64 v16; // rbx
  __int64 v17; // r14
  __int64 v18; // rbx
  __int64 v19; // rbx
  __int64 v20; // rbx
  char v21; // al
  __int64 v22; // rbx
  __int64 v23; // r14
  __int64 v24; // rbx
  __int64 v25; // rax
  __int64 v26; // rbx
  __int64 v27; // rsi
  _QWORD *v28; // rcx
  _QWORD *v29; // rdi
  __int64 v30; // rcx
  __int64 v31; // rdi
  __int64 v32; // rdi
  __int64 v33; // [rsp+20h] [rbp-60h]
  __int64 v34; // [rsp+28h] [rbp-58h]
  __int64 v35; // [rsp+38h] [rbp-48h] BYREF
  __int64 v36; // [rsp+40h] [rbp-40h] BYREF
  __int64 v37; // [rsp+48h] [rbp-38h] BYREF
  __int64 v38; // [rsp+50h] [rbp-30h] BYREF
  __int64 v39; // [rsp+58h] [rbp-28h] BYREF
  __int128 v40; // [rsp+60h] [rbp-20h] BYREF
  __int128 v41; // [rsp+70h] [rbp-10h]
  int v42; // [rsp+80h] [rbp+0h]
  __int64 v43; // [rsp+90h] [rbp+10h] BYREF
  _BYTE v44[16]; // [rsp+98h] [rbp+18h] BYREF
  __int64 v45; // [rsp+A8h] [rbp+28h] BYREF
  __int64 v46[6]; // [rsp+B0h] [rbp+30h] BYREF

  v8 = sub_1800025D0(a1, a2);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    return 0;
  if ( v8 == 0 )
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
      v10 = sub_1800023C0(a1);
      if ( v10 != 0 )
      {
        v11 = v10;
        qword_180117640 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v10);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v11);
      }
    }
    sub_1800C6900(&unk_180117530);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      return 0;
  }
  v46[0] = 0;
  v43 = 0;
  v39 = 0;
  v36 = 0;
  v37 = 0;
  v38 = 0;
  v41 = 0;
  v40 = 0;
  v42 = 1065353216;
  v35 = a3;
  sub_1800036C0((__int64)v44, (float *)&v40, &v35, &v35);
  v37 = a4;
  sub_1800036C0((__int64)v44, (float *)&v40, &v37, &v37);
  v38 = a5;
  sub_1800036C0((__int64)v44, (float *)&v40, &v38, &v38);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_84;
  v46[0] = v35;
  sub_1800036C0((__int64)v44, (float *)&v40, v46, v46);
  if ( qword_180117628 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117628, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117518);
    if ( qword_180117628 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117628, 0) != 0 )
    {
      v12 = sub_1800023C0(a1);
      if ( v12 != 0 )
      {
        qword_180117628 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v12);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v12);
      }
    }
    sub_1800C6900(&unk_180117518);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_84;
  }
  if ( qword_180117850 == 0 )
  {
    qword_180117850 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL /*GetMethodID*/))(
                        a1,
                        qword_180117628,
                        /*0xb49*/ "UTF_8",
                        /*0xb4f*/ "Ljava/nio/charset/Charset;");
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_84;
  }
  v43 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1160LL /*GetObjectClass/AllocObject*/))(a1, qword_180117628);
  sub_1800036C0((__int64)v44, (float *)&v40, &v43, &v43);
  v13 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
  v14 = *(_QWORD *)a1;
  if ( v13 == 0 )
  {
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(v14 + 1824))(a1) != 0 )
      goto LABEL_84;
    if ( qword_180117620 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117620, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117510);
      if ( qword_180117620 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117620, 0) != 0 )
      {
        v15 = sub_1800023C0(a1);
        if ( v15 != 0 )
        {
          qword_180117620 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v15);
          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v15);
        }
      }
      sub_1800C6900(&unk_180117510);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
        goto LABEL_84;
    }
    if ( qword_180117700 == 0 )
    {
      qword_180117700 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                          a1,
                          qword_180117620,
                          /*0x6d1*/ "getBytes",
                          /*0xb6a*/ "(Ljava/nio/charset/Charset;)[B");
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
        goto LABEL_84;
    }
    if ( v46[0] != 0 )
    {
      v46[0] = sub_180002790(a1);
      sub_1800036C0((__int64)v44, (float *)&v40, v46, v46);
    }
    else
    {
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 6);
    }
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_84;
    v43 = v37;
    sub_1800036C0((__int64)v44, (float *)&v40, &v43, &v43);
    v39 = v38;
    sub_1800036C0((__int64)v44, (float *)&v40, &v39, &v39);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_84;
    if ( qword_180117648 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117648, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117538);
      if ( qword_180117648 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117648, 0) != 0 )
      {
        v16 = sub_1800023C0(a1);
        if ( v16 != 0 )
        {
          qword_180117648 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v16);
          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v16);
        }
      }
      sub_1800C6900(&unk_180117538);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
        goto LABEL_84;
    }
    if ( qword_180117720 == 0 )
    {
      qword_180117720 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                          a1,
                          qword_180117648,
                          /*0xbf9*/ "ere",
                          /*0xbfd*/ "([B[B[B)[B");
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
        goto LABEL_84;
    }
    v34 = v39;
    v33 = v43;
    v46[0] = sub_180002760(a1);
    sub_1800036C0((__int64)v44, (float *)&v40, v46, v46);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_84;
    v17 = v46[0];
    sub_1800036C0((__int64)v44, (float *)&v40, v46, v46);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_84;
    if ( qword_180117600 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117600, 0) != 0 )
    {
      sub_1800C68B0(&unk_1801174F0);
      if ( qword_180117600 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117600, 0) != 0 )
      {
        v18 = sub_1800023C0(a1);
        if ( v18 != 0 )
        {
          qword_180117600 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v18);
          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v18);
        }
      }
      sub_1800C6900(&unk_1801174F0);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
        goto LABEL_84;
    }
    if ( qword_1801176E0 == 0 )
    {
      qword_1801176E0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                          a1,
                          qword_180117600,
                          /*0xa84*/ "getEncoder",
                          /*0xa8f*/ "()Ljava/util/Base64$Encoder;",
                          v33,
                          v34);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
        goto LABEL_84;
    }
    v46[0] = sub_180002760(a1);
    sub_1800036C0((__int64)v44, (float *)&v40, v46, v46);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_84;
    v43 = v17;
    sub_1800036C0((__int64)v44, (float *)&v40, &v43, &v43);
    if ( qword_180117610 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117610, 0) != 0 )
    {
      sub_1800C68B0(&unk_180117500);
      if ( qword_180117610 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117610, 0) != 0 )
      {
        v19 = sub_1800023C0(a1);
        if ( v19 != 0 )
        {
          qword_180117610 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v19);
          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v19);
        }
      }
      sub_1800C6900(&unk_180117500);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
        goto LABEL_84;
    }
    if ( qword_1801176F0 == 0 )
    {
      qword_1801176F0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                          a1,
                          qword_180117610,
                          /*0xab0*/ "encodeToString",
                          /*0xabf*/ "([B)Ljava/lang/String;");
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      {
LABEL_84:
        v20 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
        (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
        v46[0] = v20;
        v45 = v20;
        sub_180026960(v44, &v40, &v45, &v45);
        goto LABEL_88;
      }
    }
    if ( v46[0] != 0 )
    {
      v46[0] = sub_180002790(a1);
      sub_1800036C0((__int64)v44, (float *)&v40, v46, v46);
    }
    else
    {
      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 15);
    }
    v21 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
    v14 = *(_QWORD *)a1;
    if ( v21 == 0 )
    {
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(v14 + 1824))(a1) == 0 )
      {
        v27 = v46[0];
        goto LABEL_114;
      }
LABEL_113:
      v27 = 0;
LABEL_114:
      v28 = (_QWORD *)v41;
      if ( (_QWORD)v41 != 0 )
      {
        do
        {
          v29 = (_QWORD *)*v28;
          sub_1800C0DC0(v28);
          v28 = v29;
        }
        while ( v29 != nullptr );
      }
      v30 = v40;
      *(_QWORD *)&v40 = 0;
      if ( v30 != 0 )
        sub_1800C0DC0(v30);
      return v27;
    }
  }
  v22 = (*(__int64 (__fastcall **)(__int64))(v14 + 120))(a1);
  (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
  v46[0] = v22;
  v45 = v22;
  sub_180026960(v44, &v40, &v45, &v45);
LABEL_88:
  if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
         a1,
         v46[0],
         qword_180117640) != 0 )
  {
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
    {
      sub_180026DB0(&v40, v46);
      sub_180026DB0(&v40, &v35);
      sub_180026DB0(&v40, &v37);
      sub_180026DB0(&v40, &v38);
      sub_180002660(a1, &v40);
      v23 = v46[0];
      sub_1800036C0((__int64)v44, (float *)&v40, v46, v46);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
      {
        if ( qword_180117638 != 0
          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
               a1,
               qword_180117638,
               0) == 0 )
        {
          goto LABEL_98;
        }
        sub_1800C68B0(&unk_180117528);
        if ( qword_180117638 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
               a1,
               qword_180117638,
               0) != 0 )
        {
          v24 = sub_1800023C0(a1);
          if ( v24 != 0 )
          {
            qword_180117638 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v24);
            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v24);
          }
        }
        sub_1800C6900(&unk_180117528);
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
        {
LABEL_98:
          v25 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 216LL))(a1, qword_180117638);
          v45 = v25;
          if ( v25 != 0 )
          {
            v46[0] = v25;
            sub_1800036C0((__int64)v44, (float *)&v40, &v45, &v45);
          }
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
          {
            v43 = v46[0];
            if ( qword_1801175B0 != 0
              && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                   a1,
                   qword_1801175B0,
                   0) == 0 )
            {
              goto LABEL_146;
            }
            sub_1800C68B0(&unk_1801174A0);
            if ( qword_1801175B0 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                   a1,
                   qword_1801175B0,
                   0) != 0 )
            {
              v26 = sub_1800023C0(a1);
              if ( v26 != 0 )
              {
                qword_1801175B0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v26);
                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v26);
              }
            }
            sub_1800C6900(&unk_1801174A0);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
            {
LABEL_146:
              if ( qword_180117848 != 0
                || (qword_180117848 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL /*GetMethodID*/))(
                                        a1,
                                        qword_1801175B0,
                                        /*0xa5*/ "a",
                                        /*0xa3e*/ "[Ljava/lang/String;"),
                    (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
              {
                v39 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1160LL /*GetObjectClass/AllocObject*/))(a1, qword_1801175B0);
                sub_1800036C0((__int64)v44, (float *)&v40, &v39, &v39);
                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                {
                  LODWORD(v36) = 3;
                  if ( v39 != 0 )
                  {
                    v39 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 1384LL))(a1, v39, 3);
                    sub_1800036C0((__int64)v44, (float *)&v40, &v39, &v39);
                  }
                  else
                  {
                    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x41b*/ "AALOAD npe", 14);
                  }
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                  {
                    v36 = v23;
                    sub_1800036C0((__int64)v44, (float *)&v40, &v36, &v36);
                    if ( qword_180117638 != 0
                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                           a1,
                           qword_180117638,
                           0) == 0 )
                    {
                      goto LABEL_140;
                    }
                    sub_1800C68B0(&unk_180117528);
                    if ( qword_180117638 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                           a1,
                           qword_180117638,
                           0) != 0 )
                    {
                      v31 = sub_1800023C0(a1);
                      if ( v31 != 0 )
                      {
                        qword_180117638 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                            a1,
                                            v31);
                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v31);
                      }
                    }
                    sub_1800C6900(&unk_180117528);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                    {
LABEL_140:
                      if ( qword_180117718 != 0
                        || (qword_180117718 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                a1,
                                                qword_180117638,
                                                /*0x48b*/ "<init>",
                                                /*0xb9f*/ "(Ljava/lang/String;Ljava/lang/Throwable;)V"),
                            (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                      {
                        if ( v43 != 0 )
                          sub_180026870(a1, v43, qword_180117638, qword_180117718, v39, v36);
                        else
                          sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x4ab*/ "INVOKESPECIAL Void npe", 14);
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                        {
                          v32 = v46[0];
                          if ( v46[0] != 0 )
                          {
                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v46[0]);
                            v45 = v32;
                            sub_180026960(v44, &v40, &v45, &v45);
                          }
                          else
                          {
                            sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x29a*/ "ATHROW npe", 14);
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
    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v46[0]);
  }
  goto LABEL_113;
}
