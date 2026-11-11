__int64 __fastcall sub_180037850(__int64 a1, __int64 a2)
{
  __int64 v4; // rdi
  __int64 v6; // rax
  __int64 v7; // r14
  __int64 v8; // r14
  __int64 v9; // r14
  __int64 v10; // r14
  __int64 v11; // rsi
  _QWORD *v12; // rcx
  _QWORD *v13; // rdi
  __int64 v14; // rcx
  __int64 v15; // r15
  __int64 v16; // r15
  int v17; // r15d
  __int64 v18; // r12
  __int64 v19; // r12
  __int64 v20; // r13
  __int64 v21; // r13
  __int64 v22; // r14
  int v23; // r12d
  __int64 v24; // r13
  __int64 v25; // r13
  __int64 v26; // r13
  __int64 v27; // r14
  __int64 v28; // rax
  __int64 v29; // r13
  __int64 v30; // r13
  _BYTE *v31; // r8
  __int64 v32; // r15
  __int64 v33; // r12
  __int64 v34; // r14
  __int64 v35; // r14
  __int64 v36; // r15
  unsigned __int8 v37; // al
  __int64 v38; // r14
  __int64 v39; // r15
  __int64 v40; // r15
  __int64 v41; // r15
  __int64 v42; // r12
  __int64 v43; // r15
  __int64 v44; // r15
  __int64 v45; // r8
  __int64 v46; // r14
  __int64 v47; // r14
  __int64 v48; // rdi
  __int64 v49; // r15
  __int64 v50; // r15
  __int64 v51; // r15
  __int64 v52; // r15
  _BYTE *v53; // r8
  __int64 v54; // [rsp+20h] [rbp-60h]
  __int64 v55; // [rsp+28h] [rbp-58h]
  __int64 v56; // [rsp+38h] [rbp-48h]
  __int64 v57; // [rsp+40h] [rbp-40h]
  _BYTE v58[16]; // [rsp+48h] [rbp-38h] BYREF
  __int64 v59; // [rsp+58h] [rbp-28h]
  __int64 v60; // [rsp+60h] [rbp-20h] BYREF
  __int64 v61; // [rsp+68h] [rbp-18h] BYREF
  __int128 v62; // [rsp+70h] [rbp-10h] BYREF
  __int128 v63; // [rsp+80h] [rbp+0h]
  int v64; // [rsp+90h] [rbp+10h]
  __int64 v65; // [rsp+A0h] [rbp+20h] BYREF
  char v66; // [rsp+A8h] [rbp+28h] BYREF
  _BYTE v67[15]; // [rsp+A9h] [rbp+29h] BYREF
  _BYTE *v68; // [rsp+B8h] [rbp+38h]
  __int64 v69; // [rsp+C0h] [rbp+40h] BYREF
  __int64 v70[2]; // [rsp+C8h] [rbp+48h] BYREF
  __int64 v71; // [rsp+D8h] [rbp+58h]
  __int64 v72[8]; // [rsp+E0h] [rbp+60h] BYREF

  v4 = sub_1800025D0(a1, a2);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    return 0;
  if ( v4 == 0 )
  {
    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 144LL /*Throw/FatalError*/))(a1, /*0x8*/ "classloader == null");
    return 0;
  }
  if ( qword_1801175A8 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801175A8, 0) != 0 )
  {
    sub_1800C68B0(&unk_180117498);
    if ( qword_1801175A8 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801175A8, 0) != 0 )
    {
      v6 = sub_1800023C0(a1);
      if ( v6 != 0 )
      {
        v7 = v6;
        qword_1801175A8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v6);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v7);
      }
    }
    sub_1800C6900(&unk_180117498);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      return 0;
  }
  v72[0] = 0;
  v69 = 0;
  v60 = 0;
  v61 = 0;
  v65 = 0;
  v63 = 0;
  v62 = 0;
  v64 = 1065353216;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_27;
  if ( qword_1801175B0 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801175B0, 0) != 0 )
  {
    sub_1800C68B0(&unk_1801174A0);
    if ( qword_1801175B0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801175B0, 0) != 0 )
    {
      v8 = sub_1800023C0(a1);
      if ( v8 != 0 )
      {
        qword_1801175B0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v8);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v8);
      }
    }
    sub_1800C6900(&unk_1801174A0);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_27;
  }
  if ( qword_180117840 == 0 )
  {
    qword_180117840 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL /*GetMethodID*/))(
                        a1,
                        qword_1801175B0,
                        /*0x708*/ "b",
                        /*0xed*/ "J");
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
      goto LABEL_27;
  }
  v72[0] = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1208LL))(a1, qword_1801175B0);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_27;
  v72[0] ^= 0x325856BD5281uLL;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_27;
  v9 = v72[0];
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
    goto LABEL_27;
  LODWORD(v72[0]) = 24410;
  v69 = v9;
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
  {
    LODWORD(v69) = 1;
    if ( qword_1801175B8 != 0
      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801175B8, 0) == 0 )
    {
      goto LABEL_41;
    }
    sub_1800C68B0(&unk_1801174A8);
    if ( qword_1801175B8 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801175B8, 0) != 0 )
    {
      v15 = sub_1800023C0(a1);
      if ( v15 != 0 )
      {
        qword_1801175B8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v15);
        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v15);
      }
    }
    sub_1800C6900(&unk_1801174A8);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
    {
LABEL_41:
      v69 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, _QWORD))(*(_QWORD *)a1 + 1376LL))(
              a1,
              (unsigned int)v69,
              qword_1801175B8,
              0);
      sub_1800036C0((__int64)&v66, (float *)&v62, &v69, &v69);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
      {
        v56 = v69;
        if ( qword_1801175C0 != 0
          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
               a1,
               qword_1801175C0,
               0) == 0 )
        {
          goto LABEL_284;
        }
        sub_1800C68B0(&unk_1801174B0);
        if ( qword_1801175C0 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
               a1,
               qword_1801175C0,
               0) != 0 )
        {
          v16 = sub_1800023C0(a1);
          if ( v16 != 0 )
          {
            qword_1801175C0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v16);
            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v16);
          }
        }
        sub_1800C6900(&unk_1801174B0);
        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
        {
LABEL_284:
          v17 = qword_1801175C0;
          v18 = sub_180002610(a1, a2);
          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
          {
            v60 = v18;
            if ( qword_1801175C0 != 0
              && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                   a1,
                   qword_1801175C0,
                   0) == 0 )
            {
              goto LABEL_285;
            }
            sub_1800C68B0(&unk_1801174B0);
            if ( qword_1801175C0 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                   a1,
                   qword_1801175C0,
                   0) != 0 )
            {
              v19 = sub_1800023C0(a1);
              if ( v19 != 0 )
              {
                qword_1801175C0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v19);
                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v19);
              }
            }
            sub_1800C6900(&unk_1801174B0);
            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
            {
LABEL_285:
              v61 = qword_180117310;
              v65 = qword_180117318;
              if ( qword_1801175C8 != 0
                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                     a1,
                     qword_1801175C8,
                     0) == 0 )
              {
                goto LABEL_286;
              }
              sub_1800C68B0(&unk_1801174B8);
              if ( qword_1801175C8 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                     a1,
                     qword_1801175C8,
                     0) != 0 )
              {
                v20 = sub_1800023C0(a1);
                if ( v20 != 0 )
                {
                  qword_1801175C8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v20);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v20);
                }
              }
              sub_1800C6900(&unk_1801174B8);
              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
              {
LABEL_286:
                if ( qword_1801176B0 != 0
                  || (qword_1801176B0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                          a1,
                                          qword_1801175C8,
                                          /*0x30c*/ "fromMethodDescriptorString",
                                          /*0x327*/ "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/invoke/MethodType;"),
                      (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                {
                  v65 = sub_180002760(a1);
                  sub_1800036C0((__int64)&v66, (float *)&v62, &v65, &v65);
                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                  {
                    if ( qword_1801175D0 != 0
                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                           a1,
                           qword_1801175D0,
                           0) == 0 )
                    {
                      goto LABEL_287;
                    }
                    sub_1800C68B0(&unk_1801174C0);
                    if ( qword_1801175D0 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                           a1,
                           qword_1801175D0,
                           0) != 0 )
                    {
                      v21 = sub_1800023C0(a1);
                      if ( v21 != 0 )
                      {
                        qword_1801175D0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                            a1,
                                            v21);
                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v21);
                      }
                    }
                    sub_1800C6900(&unk_1801174C0);
                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                    {
LABEL_287:
                      if ( qword_1801176B8 != 0
                        || (qword_1801176B8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                a1,
                                                qword_1801175D0,
                                                /*0x370*/ "findStatic",
                                                /*0x37b*/ "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;",
                                                v4),
                            (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                      {
                        if ( v60 != 0 )
                        {
                          v55 = v65;
                          v60 = sub_180002790(a1);
                          sub_1800036C0((__int64)&v66, (float *)&v62, &v60, &v60);
                        }
                        else
                        {
                          sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 9);
                        }
                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                        {
                          v23 = v60;
                          v60 = qword_180117330;
                          v61 = qword_180117338;
                          v65 = v4;
                          if ( qword_1801175C8 != 0
                            && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                 a1,
                                 qword_1801175C8,
                                 0) == 0 )
                          {
                            goto LABEL_288;
                          }
                          sub_1800C68B0(&unk_1801174B8);
                          if ( qword_1801175C8 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                 a1,
                                 qword_1801175C8,
                                 0) != 0 )
                          {
                            v24 = sub_1800023C0(a1);
                            if ( v24 != 0 )
                            {
                              qword_1801175C8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                  a1,
                                                  v24);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v24);
                            }
                          }
                          sub_1800C6900(&unk_1801174B8);
                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                          {
LABEL_288:
                            if ( qword_1801176B0 != 0
                              || (qword_1801176B0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                      a1,
                                                      qword_1801175C8,
                                                      /*0x30c*/ "fromMethodDescriptorString",
                                                      /*0x327*/ "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/invoke/MethodType;"),
                                  (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                            {
                              v54 = v65;
                              v61 = sub_180002760(a1);
                              sub_1800036C0((__int64)&v66, (float *)&v62, &v61, &v61);
                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                              {
                                v57 = v61;
                                v61 = v56;
                                LODWORD(v65) = 0;
                                if ( qword_1801175B8 != 0
                                  && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                       a1,
                                       qword_1801175B8,
                                       0) == 0 )
                                {
                                  goto LABEL_110;
                                }
                                sub_1800C68B0(&unk_1801174A8);
                                if ( qword_1801175B8 == 0
                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                       a1,
                                       qword_1801175B8,
                                       0) != 0 )
                                {
                                  v25 = sub_1800023C0(a1);
                                  if ( v25 != 0 )
                                  {
                                    qword_1801175B8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1
                                                                                                  + 1808LL /*NewGlobalRef(id)*/))(
                                                        a1,
                                                        v25);
                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v25);
                                  }
                                }
                                sub_1800C6900(&unk_1801174A8);
                                if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                {
LABEL_110:
                                  if ( (int)v65 < 0 )
                                  {
                                    sub_180002110(a1, /*0x2ce*/ "java/lang/NegativeArraySizeException", /*0x2f3*/ "ANEWARRAY array size < 0", 9);
                                  }
                                  else
                                  {
                                    v65 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, _QWORD, __int64, __int64))(*(_QWORD *)a1 + 1376LL))(
                                            a1,
                                            (unsigned int)v65,
                                            qword_1801175B8,
                                            0,
                                            v54,
                                            v55);
                                    sub_1800036C0((__int64)&v66, (float *)&v62, &v65, &v65);
                                  }
                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                  {
                                    if ( qword_1801175B8 != 0
                                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                           a1,
                                           qword_1801175B8,
                                           0) == 0 )
                                    {
                                      goto LABEL_121;
                                    }
                                    sub_1800C68B0(&unk_1801174A8);
                                    if ( qword_1801175B8 == 0
                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                           a1,
                                           qword_1801175B8,
                                           0) != 0 )
                                    {
                                      v26 = sub_1800023C0(a1);
                                      if ( v26 != 0 )
                                      {
                                        qword_1801175B8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                            a1,
                                                            v26);
                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v26);
                                      }
                                    }
                                    sub_1800C6900(&unk_1801174A8);
                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                    {
LABEL_121:
                                      if ( v65 == 0
                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                             a1,
                                             v65,
                                             qword_1801175B8) != 0 )
                                      {
                                        goto LABEL_122;
                                      }
                                      v29 = qword_1801172E0;
                                      sub_1800267D0(v70, /*0x3fa*/ "cannot cast to ");
                                      sub_1800267D0(v58, /*0x40a*/ "java/lang/Object");
                                      sub_180026770(&v66, v70, v58);
                                      v30 = v29 + 989;
                                      if ( (v66 & 1) != 0 )
                                        v31 = v68;
                                      else
                                        v31 = v67;
                                      sub_180002110(a1, v30, v31, 9);
                                      if ( (v66 & 1) != 0 )
                                      {
                                        sub_1800C0DC0(v68);
                                        if ( (v58[0] & 1) == 0 )
                                        {
LABEL_141:
                                          if ( (v70[0] & 1) == 0 )
                                            goto LABEL_143;
                                          goto LABEL_142;
                                        }
                                      }
                                      else if ( (v58[0] & 1) == 0 )
                                      {
                                        goto LABEL_141;
                                      }
                                      sub_1800C0DC0(v59);
                                      if ( (v70[0] & 1) != 0 )
LABEL_142:
                                        sub_1800C0DC0(v71);
LABEL_143:
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                      {
LABEL_144:
                                        v34 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                        (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                        v72[0] = v34;
                                        v70[0] = v34;
                                        sub_180026960(&v66, &v62, v70, v70);
LABEL_145:
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                               a1,
                                               v72[0],
                                               qword_1801175A8) == 0 )
                                        {
                                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v72[0]);
                                          goto LABEL_27;
                                        }
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_27;
                                        sub_180026DB0(&v62, v72);
                                        sub_180002660(a1, &v62);
                                        v35 = v72[0];
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
                                            v36 = sub_1800023C0(a1);
                                            if ( v36 != 0 )
                                            {
                                              qword_1801175E8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                  a1,
                                                                  v36);
                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                a1,
                                                v36);
                                            }
                                          }
                                          sub_1800C6900(&unk_1801174D8);
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_27;
                                        }
                                        if ( v35 != 0 )
                                        {
                                          v37 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                                  a1,
                                                  v35,
                                                  qword_1801175E8);
                                          v38 = v37 | v35 & 0xFFFFFFFF00000000uLL;
                                          if ( v37 != 0 )
                                            goto LABEL_156;
                                        }
                                        else
                                        {
                                          v38 = 0;
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
                                            v40 = sub_1800023C0(a1);
                                            if ( v40 != 0 )
                                            {
                                              qword_1801175E8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                  a1,
                                                                  v40);
                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                a1,
                                                v40);
                                            }
                                          }
                                          sub_1800C6900(&unk_1801174D8);
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_27;
                                        }
                                        v41 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 216LL))(
                                                a1,
                                                qword_1801175E8);
                                        v70[0] = v41;
                                        if ( v41 != 0 )
                                        {
                                          sub_1800036C0((__int64)&v66, (float *)&v62, v70, v70);
                                          v38 = v41;
                                        }
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_27;
                                        v69 = v38;
                                        v42 = v72[0];
                                        v72[0] = v38;
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
                                            v43 = sub_1800023C0(a1);
                                            if ( v43 != 0 )
                                            {
                                              qword_1801175E8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                  a1,
                                                                  v43);
                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                a1,
                                                v43);
                                            }
                                          }
                                          sub_1800C6900(&unk_1801174D8);
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_27;
                                        }
                                        if ( qword_1801176C8 == 0 )
                                        {
                                          qword_1801176C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                              a1,
                                                              qword_1801175E8,
                                                              /*0x48b*/ "<init>",
                                                              /*0x492*/ "(Ljava/lang/Throwable;)V");
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_27;
                                        }
                                        if ( v38 != 0 )
                                          sub_180026870(a1, v38, qword_1801175E8, qword_1801176C8, v42);
                                        else
                                          sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x4ab*/ "INVOKESPECIAL Void npe", 9);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_27;
LABEL_156:
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_27;
                                        sub_180026DB0(&v62, v72);
                                        sub_180002660(a1, &v62);
                                        v39 = v72[0];
                                        if ( v72[0] != 0 )
                                        {
                                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v72[0]);
                                          v70[0] = v39;
                                          sub_180026960(&v66, &v62, v70, v70);
                                        }
                                        else
                                        {
                                          sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x29a*/ "ATHROW npe", 9);
                                        }
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_27;
                                        goto LABEL_183;
                                      }
LABEL_122:
                                      v28 = v65;
                                      v65 = v61;
                                      v61 = v28;
                                      sub_180001510(a1, v17, v23, v60, v57, v28, v65);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_144;
                                      if ( v69 != 0 )
                                      {
                                        v69 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1
                                                                                                  + 1384LL))(
                                                a1,
                                                v69,
                                                0);
                                        sub_1800036C0((__int64)&v66, (float *)&v62, &v69, &v69);
                                      }
                                      else
                                      {
                                        sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x41b*/ "AALOAD npe", 9);
                                      }
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_144;
                                      v32 = v69;
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
                                          v33 = sub_1800023C0(a1);
                                          if ( v33 != 0 )
                                          {
                                            qword_1801175D8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v33);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v33);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174C8);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_144;
                                      }
                                      if ( v32 != 0
                                        && (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                             a1,
                                             v32,
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
                                            v49 = sub_1800023C0(a1);
                                            if ( v49 != 0 )
                                            {
                                              qword_1801175D8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                  a1,
                                                                  v49);
                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                a1,
                                                v49);
                                            }
                                          }
                                          sub_1800C6900(&unk_1801174C8);
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_144;
                                        }
                                        if ( qword_1801176C0 == 0 )
                                        {
                                          qword_1801176C0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                              a1,
                                                              qword_1801175D8,
                                                              /*0x426*/ "getTarget",
                                                              /*0x430*/ "()Ljava/lang/invoke/MethodHandle;");
                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                            goto LABEL_144;
                                        }
                                        if ( v69 != 0 )
                                        {
                                          v69 = sub_180002790(a1);
                                          sub_1800036C0((__int64)&v66, (float *)&v62, &v69, &v69);
                                        }
                                        else
                                        {
                                          sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x452*/ "INVOKEINTERFACE Object npe", 9);
                                        }
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_144;
                                      }
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_144;
                                      sub_180026DB0(&v62, &v69);
                                      sub_180002660(a1, &v62);
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
                                          v50 = sub_1800023C0(a1);
                                          if ( v50 != 0 )
                                          {
                                            qword_1801175E0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v50);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v50);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174D0);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_144;
                                      }
                                      v38 = v9 ^ 0x3B81B0FE072D7D1ELL;
                                      if ( v69 == 0
                                        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(
                                             a1,
                                             v69,
                                             qword_1801175E0) != 0 )
                                      {
                                        goto LABEL_183;
                                      }
                                      v51 = qword_1801172E0;
                                      sub_1800267D0(v70, /*0x3fa*/ "cannot cast to ");
                                      sub_1800267D0(v58, /*0x46d*/ "java/lang/invoke/MethodHandle");
                                      sub_180026770(&v66, v70, v58);
                                      v52 = v51 + 989;
                                      if ( (v66 & 1) != 0 )
                                        v53 = v68;
                                      else
                                        v53 = v67;
                                      sub_180002110(a1, v52, v53, 9);
                                      if ( (v66 & 1) != 0 )
                                      {
                                        sub_1800C0DC0(v68);
                                        if ( (v58[0] & 1) == 0 )
                                        {
LABEL_275:
                                          if ( (v70[0] & 1) == 0 )
                                            goto LABEL_277;
                                          goto LABEL_276;
                                        }
                                      }
                                      else if ( (v58[0] & 1) == 0 )
                                      {
                                        goto LABEL_275;
                                      }
                                      sub_1800C0DC0(v59);
                                      if ( (v70[0] & 1) != 0 )
LABEL_276:
                                        sub_1800C0DC0(v71);
LABEL_277:
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_144;
LABEL_183:
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                        goto LABEL_27;
                                      sub_180026DB0(&v62, &v69);
                                      sub_180002660(a1, &v62);
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
                                          v44 = sub_1800023C0(a1);
                                          if ( v44 != 0 )
                                          {
                                            qword_1801175F0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v44);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v44);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801174E0);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_27;
                                      }
                                      v45 = qword_1801176D0;
                                      if ( qword_1801176D0 == 0 )
                                      {
                                        qword_1801176D0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                            a1,
                                                            qword_1801175F0,
                                                            /*0x4c2*/ "invokereverse0",
                                                            /*0x4d1*/ "(IJLjava/lang/invoke/MethodHandle;)I");
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                          goto LABEL_27;
                                        v45 = qword_1801176D0;
                                      }
                                      LODWORD(v72[0]) = sub_1800268A0(
                                                          a1,
                                                          qword_1801175F0,
                                                          v45,
                                                          LODWORD(v72[0]),
                                                          v38,
                                                          v69);
                                      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                      {
                                        if ( qword_180117650 != 0
                                          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                               a1,
                                               qword_180117650,
                                               0) == 0 )
                                        {
                                          goto LABEL_289;
                                        }
                                        sub_1800C68B0(&unk_180117540);
                                        if ( qword_180117650 == 0
                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                               a1,
                                               qword_180117650,
                                               0) != 0 )
                                        {
                                          v46 = sub_1800023C0(a1);
                                          if ( v46 != 0 )
                                          {
                                            qword_180117650 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v46);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v46);
                                          }
                                        }
                                        sub_1800C6900(&unk_180117540);
                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                        {
LABEL_289:
                                          if ( qword_180117760 != 0
                                            || (qword_180117760 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                    a1,
                                                                    qword_180117650,
                                                                    /*0xced*/ "allocate",
                                                                    /*0xcf6*/ "(I)Ljava/nio/ByteBuffer;"),
                                                (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                                          {
                                            v72[0] = sub_180002760(a1);
                                            sub_1800036C0((__int64)&v66, (float *)&v62, v72, v72);
                                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                            {
                                              if ( qword_180117650 != 0
                                                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_180117650,
                                                     0) == 0 )
                                              {
                                                goto LABEL_290;
                                              }
                                              sub_1800C68B0(&unk_180117540);
                                              if ( qword_180117650 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_180117650,
                                                     0) != 0 )
                                              {
                                                v47 = sub_1800023C0(a1);
                                                if ( v47 != 0 )
                                                {
                                                  qword_180117650 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                      a1,
                                                                      v47);
                                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                    a1,
                                                    v47);
                                                }
                                              }
                                              sub_1800C6900(&unk_180117540);
                                              if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                              {
LABEL_290:
                                                if ( qword_180117768 != 0
                                                  || (qword_180117768 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                          a1,
                                                                          qword_180117650,
                                                                          /*0xd0f*/ "putLong",
                                                                          /*0xd17*/ "(J)Ljava/nio/ByteBuffer;"),
                                                      (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                                                {
                                                  if ( v72[0] != 0 )
                                                  {
                                                    v72[0] = sub_180002790(a1);
                                                    sub_1800036C0((__int64)&v66, (float *)&v62, v72, v72);
                                                  }
                                                  else
                                                  {
                                                    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 9);
                                                  }
                                                  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                  {
                                                    if ( qword_180117650 != 0
                                                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_180117650,
                                                           0) == 0 )
                                                    {
                                                      goto LABEL_291;
                                                    }
                                                    sub_1800C68B0(&unk_180117540);
                                                    if ( qword_180117650 == 0
                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                           a1,
                                                           qword_180117650,
                                                           0) != 0 )
                                                    {
                                                      v48 = sub_1800023C0(a1);
                                                      if ( v48 != 0 )
                                                      {
                                                        qword_180117650 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                            a1,
                                                                            v48);
                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                          a1,
                                                          v48);
                                                      }
                                                    }
                                                    sub_1800C6900(&unk_180117540);
                                                    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                    {
LABEL_291:
                                                      if ( qword_180117770 != 0
                                                        || (qword_180117770 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                                a1,
                                                                                qword_180117650,
                                                                                /*0xd30*/ "array",
                                                                                /*0xd36*/ "()[B"),
                                                            (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0) )
                                                      {
                                                        if ( v72[0] != 0 )
                                                        {
                                                          v72[0] = sub_180002790(a1);
                                                          sub_1800036C0((__int64)&v66, (float *)&v62, v72, v72);
                                                        }
                                                        else
                                                        {
                                                          sub_180002110(
                                                            a1,
                                                            /*0x6d*/ "java/lang/NullPointerException",
                                                            /*0x8c*/ "INVOKEVIRTUAL Object npe",
                                                            9);
                                                        }
                                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0
                                                          && (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) == 0 )
                                                        {
                                                          v11 = v72[0];
                                                          goto LABEL_28;
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
LABEL_27:
                                      v11 = 0;
LABEL_28:
                                      v12 = (_QWORD *)v63;
                                      if ( (_QWORD)v63 != 0 )
                                      {
                                        do
                                        {
                                          v13 = (_QWORD *)*v12;
                                          sub_1800C0DC0(v12);
                                          v12 = v13;
                                        }
                                        while ( v13 != nullptr );
                                      }
                                      v14 = v62;
                                      *(_QWORD *)&v62 = 0;
                                      if ( v14 != 0 )
                                        sub_1800C0DC0(v14);
                                      return v11;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        v27 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                        (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                        v72[0] = v27;
                        v70[0] = v27;
                        sub_180026960(&v66, &v62, v70, v70);
                        goto LABEL_145;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      v22 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
      (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
      v72[0] = v22;
      v70[0] = v22;
      sub_180026960(&v66, &v62, v70, v70);
      goto LABEL_145;
    }
  }
  v10 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
  (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
  v72[0] = v10;
  v70[0] = v10;
  sub_180026960(&v66, &v62, v70, v70);
  goto LABEL_145;
}
