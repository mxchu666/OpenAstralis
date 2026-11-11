__int64 __fastcall sub_1800213C0(__int64 a1, __int64 a2, __int64 a3)
{
  __int64 v5; // rdi
  __int64 result; // rax
  __int64 v7; // rax
  __int64 v8; // rbx
  __int64 v9; // rbx
  __int64 v10; // rbx
  __int64 v11; // rbx
  __int64 v12; // rbx
  __int64 v13; // rbx
  __int64 v14; // r8
  __int64 v15; // rbx
  __int64 v16; // rax
  __int64 v17; // rbx
  _QWORD *v18; // rcx
  _QWORD *v19; // rsi
  __int64 v20; // rcx
  __int64 v21; // rbx
  __int64 v22; // r8
  __int64 v23; // rbx
  __int64 v24; // r12
  __int64 v25; // rbx
  __int64 v26; // rbx
  __int64 v27; // r12
  __int64 v28; // rbx
  unsigned int v29; // r14d
  __int64 v30; // r14
  __int64 v31; // rax
  __int64 v32; // rcx
  __int64 v33; // r14
  __int64 v34; // r14
  __int64 v35; // r14
  __int64 v36; // rax
  __int64 v37; // r14
  __int64 v38; // r14
  __int64 v39; // r9
  __int64 v40; // r14
  __int64 v41; // r12
  __int64 v42; // r12
  unsigned int v43; // ecx
  unsigned __int64 v44; // r12
  __int64 v45; // rax
  __int64 v46; // r12
  __int64 v47; // rdx
  __int64 (__fastcall *v48)(__int64); // rax
  __int64 v49; // r9
  __int64 v50; // r12
  __int64 v51; // r12
  __int64 v52; // r12
  __int64 v53; // rbx
  __int64 v54; // r8
  __int64 v55; // rbx
  __int64 v56; // rbx
  __int64 v57; // r8
  __int64 v58; // rbx
  __int64 v59; // rbx
  __int64 v60; // r8
  __int64 v61; // rbx
  char v62; // al
  __int64 v63; // rdx
  __int64 v64; // rbx
  __int64 v65; // rdi
  __int64 v66; // rdi
  unsigned __int64 v67; // [rsp+20h] [rbp-60h]
  __int64 v68; // [rsp+28h] [rbp-58h]
  int v69; // [rsp+30h] [rbp-50h]
  int v70; // [rsp+3Ch] [rbp-44h]
  __int128 v71; // [rsp+40h] [rbp-40h] BYREF
  __int128 v72; // [rsp+50h] [rbp-30h]
  int v73; // [rsp+60h] [rbp-20h]
  __int64 v74; // [rsp+70h] [rbp-10h] BYREF
  __int64 v75; // [rsp+78h] [rbp-8h] BYREF
  __int64 v76; // [rsp+80h] [rbp+0h] BYREF
  _BYTE v77[20]; // [rsp+88h] [rbp+8h] BYREF
  int v78; // [rsp+9Ch] [rbp+1Ch]
  __int64 v79; // [rsp+A0h] [rbp+20h] BYREF
  __int64 v80; // [rsp+A8h] [rbp+28h] BYREF
  __int64 v81; // [rsp+B0h] [rbp+30h] BYREF
  __int64 v82; // [rsp+B8h] [rbp+38h] BYREF
  unsigned __int64 v83; // [rsp+C0h] [rbp+40h] BYREF
  unsigned __int64 v84; // [rsp+C8h] [rbp+48h] BYREF
  __int64 v85; // [rsp+D0h] [rbp+50h] BYREF
  __int64 v86; // [rsp+D8h] [rbp+58h] BYREF
  __int64 v87[8]; // [rsp+E0h] [rbp+60h] BYREF

  (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1);
  v5 = sub_1800025D0(a1, a3);
  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
  if ( (_BYTE)result == 0 )
  {
    if ( v5 != 0 )
    {
      if ( qword_1801170F8 != 0
        && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801170F8, 0) == 0 )
      {
        goto LABEL_11;
      }
      sub_1800C68B0(&unk_180117028);
      if ( qword_1801170F8 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801170F8, 0) != 0 )
      {
        v7 = sub_1800023C0(a1);
        if ( v7 != 0 )
        {
          v8 = v7;
          qword_1801170F8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v7);
          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v8);
        }
      }
      sub_1800C6900(&unk_180117028);
      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
      if ( (_BYTE)result == 0 )
      {
LABEL_11:
        v82 = 0;
        v84 = 0;
        v86 = 0;
        v85 = 0;
        v74 = 0;
        v75 = 0;
        v76 = 0;
        v81 = 0;
        v79 = 0;
        v72 = 0;
        v71 = 0;
        v73 = 1065353216;
        v87[0] = 0x8073AC9487CC8A44uLL;
        v83 = 0xD6638D76473B01B8uLL;
        if ( qword_180117170 != 0
          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
               a1,
               qword_180117170,
               0) == 0 )
        {
          goto LABEL_575;
        }
        sub_1800C68B0(&unk_1801170A0);
        if ( qword_180117170 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
               a1,
               qword_180117170,
               0) != 0 )
        {
          v9 = sub_1800023C0(a1);
          if ( v9 != 0 )
          {
            qword_180117170 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v9);
            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v9);
          }
        }
        sub_1800C6900(&unk_1801170A0);
        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
        if ( (_BYTE)result == 0 )
        {
LABEL_575:
          if ( qword_180117208 != 0
            || (qword_180117208 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                    a1,
                                    qword_180117170,
                                    /*0x1c*/ "lookup",
                                    /*0x23*/ "()Ljava/lang/invoke/MethodHandles$Lookup;"),
                (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
          {
            v86 = sub_180002760(a1);
            sub_1800036C0((__int64)v77, (float *)&v71, &v86, &v86);
            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
            if ( (_BYTE)result == 0 )
            {
              if ( qword_180117140 != 0
                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                     a1,
                     qword_180117140,
                     0) == 0 )
              {
                goto LABEL_578;
              }
              sub_1800C68B0(&unk_180117070);
              if ( qword_180117140 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                     a1,
                     qword_180117140,
                     0) != 0 )
              {
                v10 = sub_1800023C0(a1);
                if ( v10 != 0 )
                {
                  qword_180117140 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v10);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v10);
                }
              }
              sub_1800C6900(&unk_180117070);
              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
              if ( (_BYTE)result == 0 )
              {
LABEL_578:
                if ( qword_180117210 != 0
                  || (qword_180117210 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                          a1,
                                          qword_180117140,
                                          /*0x4d*/ "lookupClass",
                                          /*0x59*/ "()Ljava/lang/Class;"),
                      (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
                {
                  if ( v86 != 0 )
                  {
                    v86 = sub_180002790(a1);
                    sub_1800036C0((__int64)v77, (float *)&v71, &v86, &v86);
                  }
                  else
                  {
                    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 0xFFFFFFFFLL);
                  }
                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                  if ( (_BYTE)result == 0 )
                  {
                    if ( qword_180117178 != 0
                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                           a1,
                           qword_180117178,
                           0) == 0 )
                    {
                      goto LABEL_579;
                    }
                    sub_1800C68B0(&unk_1801170A8);
                    if ( qword_180117178 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                           a1,
                           qword_180117178,
                           0) != 0 )
                    {
                      v11 = sub_1800023C0(a1);
                      if ( v11 != 0 )
                      {
                        qword_180117178 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                            a1,
                                            v11);
                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v11);
                      }
                    }
                    sub_1800C6900(&unk_1801170A8);
                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                    if ( (_BYTE)result == 0 )
                    {
LABEL_579:
                      if ( qword_180117218 != 0
                        || (qword_180117218 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                a1,
                                                qword_180117178,
                                                /*0xa5*/ "a",
                                                /*0xa7*/ "(JJLjava/lang/Object;)Lcc/astralis/bga;"),
                            (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
                      {
                        v68 = v86;
                        v67 = v83;
                        v87[0] = sub_180002760(a1);
                        sub_1800036C0((__int64)v77, (float *)&v71, v87, v87);
                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                        if ( (_BYTE)result == 0 )
                        {
                          v82 = 0x733BA0584419LL;
                          if ( qword_180117180 != 0
                            && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                 a1,
                                 qword_180117180,
                                 0) == 0 )
                          {
                            goto LABEL_580;
                          }
                          sub_1800C68B0(&unk_1801170B0);
                          if ( qword_180117180 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                 a1,
                                 qword_180117180,
                                 0) != 0 )
                          {
                            v12 = sub_1800023C0(a1);
                            if ( v12 != 0 )
                            {
                              qword_180117180 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                  a1,
                                                  v12);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v12);
                            }
                          }
                          sub_1800C6900(&unk_1801170B0);
                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                          if ( (_BYTE)result == 0 )
                          {
LABEL_580:
                            if ( qword_180117220 != 0
                              || (qword_180117220 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, unsigned __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                      a1,
                                                      qword_180117180,
                                                      /*0xa5*/ "a",
                                                      /*0xcf*/ "(J)J",
                                                      v67,
                                                      v68),
                                  (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
                            {
                              if ( v87[0] != 0 )
                                v87[0] = sub_180003690(a1, v87[0], qword_180117220, v82);
                              else
                                sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0xd4*/ "INVOKEINTERFACE Long npe", 0xFFFFFFFFLL);
                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                              if ( (_BYTE)result == 0 )
                              {
                                if ( qword_180117100 != 0
                                  && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                       a1,
                                       qword_180117100,
                                       0) == 0 )
                                {
                                  goto LABEL_69;
                                }
                                sub_1800C68B0(&unk_180117030);
                                if ( qword_180117100 == 0
                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                       a1,
                                       qword_180117100,
                                       0) != 0 )
                                {
                                  v13 = sub_1800023C0(a1);
                                  if ( v13 != 0 )
                                  {
                                    qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1
                                                                                                  + 1808LL /*NewGlobalRef(id)*/))(
                                                        a1,
                                                        v13);
                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v13);
                                  }
                                }
                                sub_1800C6900(&unk_180117030);
                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                if ( (_BYTE)result == 0 )
                                {
LABEL_69:
                                  v14 = qword_180117290;
                                  if ( qword_180117290 == 0 )
                                  {
                                    qword_180117290 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL /*GetMethodID*/))(
                                                        a1,
                                                        qword_180117100,
                                                        /*0xa5*/ "a",
                                                        /*0xed*/ "J");
                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                    if ( (_BYTE)result != 0 )
                                      goto LABEL_92;
                                    v14 = qword_180117290;
                                  }
                                  (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1280LL))(
                                    a1,
                                    qword_180117100,
                                    v14,
                                    v87[0]);
                                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                  if ( (_BYTE)result == 0 )
                                  {
                                    if ( qword_180117188 != 0
                                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                           a1,
                                           qword_180117188,
                                           0) == 0 )
                                    {
                                      goto LABEL_566;
                                    }
                                    sub_1800C68B0(&unk_1801170B8);
                                    if ( qword_180117188 == 0
                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                           a1,
                                           qword_180117188,
                                           0) != 0 )
                                    {
                                      v15 = sub_1800023C0(a1);
                                      if ( v15 != 0 )
                                      {
                                        qword_180117188 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                            a1,
                                                            v15);
                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v15);
                                      }
                                    }
                                    sub_1800C6900(&unk_1801170B8);
                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                    if ( (_BYTE)result == 0 )
                                    {
LABEL_566:
                                      v16 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 216LL))(
                                              a1,
                                              qword_180117188);
                                      v80 = v16;
                                      if ( v16 != 0 )
                                      {
                                        v87[0] = v16;
                                        sub_1800036C0((__int64)v77, (float *)&v71, &v80, &v80);
                                      }
                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                      if ( (_BYTE)result == 0 )
                                      {
                                        v82 = v87[0];
                                        LODWORD(v83) = 13;
                                        if ( qword_180117188 != 0
                                          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                               a1,
                                               qword_180117188,
                                               0) == 0 )
                                        {
                                          goto LABEL_567;
                                        }
                                        sub_1800C68B0(&unk_1801170B8);
                                        if ( qword_180117188 == 0
                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                               a1,
                                               qword_180117188,
                                               0) != 0 )
                                        {
                                          v17 = sub_1800023C0(a1);
                                          if ( v17 != 0 )
                                          {
                                            qword_180117188 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                a1,
                                                                v17);
                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v17);
                                          }
                                        }
                                        sub_1800C6900(&unk_1801170B8);
                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                        if ( (_BYTE)result == 0 )
                                        {
LABEL_567:
                                          if ( qword_180117228 != 0
                                            || (qword_180117228 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                                    a1,
                                                                    qword_180117188,
                                                                    /*0x48b*/ "<init>",
                                                                    /*0x51d*/ "(I)V"),
                                                (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
                                          {
                                            if ( v82 != 0 )
                                            {
                                              LODWORD(v67) = v83;
                                              sub_180026870(a1, v82, qword_180117188, qword_180117228, v67);
                                            }
                                            else
                                            {
                                              sub_180002110(
                                                a1,
                                                /*0x6d*/ "java/lang/NullPointerException",
                                                /*0x4ab*/ "INVOKESPECIAL Void npe",
                                                0xFFFFFFFFLL);
                                            }
                                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                            if ( (_BYTE)result == 0 )
                                            {
                                              if ( qword_180117100 != 0
                                                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_180117100,
                                                     0) == 0 )
                                              {
                                                goto LABEL_108;
                                              }
                                              sub_1800C68B0(&unk_180117030);
                                              if ( qword_180117100 == 0
                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                     a1,
                                                     qword_180117100,
                                                     0) != 0 )
                                              {
                                                v21 = sub_1800023C0(a1);
                                                if ( v21 != 0 )
                                                {
                                                  qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                      a1,
                                                                      v21);
                                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                    a1,
                                                    v21);
                                                }
                                              }
                                              sub_1800C6900(&unk_180117030);
                                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                              if ( (_BYTE)result == 0 )
                                              {
LABEL_108:
                                                v22 = qword_1801172C8;
                                                if ( qword_1801172C8 == 0 )
                                                {
                                                  qword_1801172C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL /*GetMethodID*/))(
                                                                      a1,
                                                                      qword_180117100,
                                                                      /*0x522*/ "d",
                                                                      /*0x524*/ "Ljava/util/Map;");
                                                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                  if ( (_BYTE)result != 0 )
                                                    goto LABEL_92;
                                                  v22 = qword_1801172C8;
                                                }
                                                (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1232LL))(
                                                  a1,
                                                  qword_180117100,
                                                  v22,
                                                  v87[0]);
                                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                if ( (_BYTE)result == 0 )
                                                {
                                                  if ( qword_180117100 != 0
                                                    && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_180117100,
                                                         0) == 0 )
                                                  {
                                                    goto LABEL_562;
                                                  }
                                                  sub_1800C68B0(&unk_180117030);
                                                  if ( qword_180117100 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                         a1,
                                                         qword_180117100,
                                                         0) != 0 )
                                                  {
                                                    v23 = sub_1800023C0(a1);
                                                    if ( v23 != 0 )
                                                    {
                                                      qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                          a1,
                                                                          v23);
                                                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                        a1,
                                                        v23);
                                                    }
                                                  }
                                                  sub_1800C6900(&unk_180117030);
                                                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                  if ( (_BYTE)result == 0 )
                                                  {
LABEL_562:
                                                    if ( qword_180117290 != 0
                                                      || (qword_180117290 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL /*GetMethodID*/))(
                                                                              a1,
                                                                              qword_180117100,
                                                                              /*0xa5*/ "a",
                                                                              /*0xed*/ "J"),
                                                          (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
                                                    {
                                                      v87[0] = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1208LL))(
                                                                 a1,
                                                                 qword_180117100);
                                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL /*ExceptionCheck*/))(a1);
                                                      if ( (_BYTE)result == 0 )
                                                      {
                                                        v83 = 0x721092DB6B0ALL;
                                                        v24 = v87[0];
                                                        v87[0] = qword_180116FC8;
                                                        if ( qword_180117190 != 0
                                                          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                               a1,
                                                               qword_180117190,
                                                               0) == 0 )
                                                        {
                                                          goto LABEL_568;
                                                        }
                                                        sub_1800C68B0(&unk_1801170C0);
                                                        if ( qword_180117190 == 0
                                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                               a1,
                                                               qword_180117190,
                                                               0) != 0 )
                                                        {
                                                          v25 = sub_1800023C0(a1);
                                                          if ( v25 != 0 )
                                                          {
                                                            qword_180117190 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                a1,
                                                                                v25);
                                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                              a1,
                                                              v25);
                                                          }
                                                        }
                                                        sub_1800C6900(&unk_1801170C0);
                                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                        if ( (_BYTE)result == 0 )
                                                        {
LABEL_568:
                                                          if ( qword_180117230 != 0
                                                            || (qword_180117230 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                                    a1,
                                                                                    qword_180117190,
                                                                                    /*0x534*/ "getInstance",
                                                                                    /*0x540*/ "(Ljava/lang/String;)Ljavax/crypto/Cipher;"),
                                                                (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
                                                          {
                                                            v87[0] = sub_180002760(a1);
                                                            sub_1800036C0((__int64)v77, (float *)&v71, v87, v87);
                                                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                            if ( (_BYTE)result == 0 )
                                                            {
                                                              v82 = v87[0];
                                                              v74 = v87[0];
                                                              sub_1800036C0((__int64)v77, (float *)&v71, &v82, &v82);
                                                              LODWORD(v82) = 2;
                                                              v83 = qword_180116FD8;
                                                              if ( qword_180117198 != 0
                                                                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                     a1,
                                                                     qword_180117198,
                                                                     0) == 0 )
                                                              {
                                                                goto LABEL_569;
                                                              }
                                                              sub_1800C68B0(&unk_1801170C8);
                                                              if ( qword_180117198 == 0
                                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                     a1,
                                                                     qword_180117198,
                                                                     0) != 0 )
                                                              {
                                                                v26 = sub_1800023C0(a1);
                                                                if ( v26 != 0 )
                                                                {
                                                                  qword_180117198 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                      a1,
                                                                                      v26);
                                                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                    a1,
                                                                    v26);
                                                                }
                                                              }
                                                              sub_1800C6900(&unk_1801170C8);
                                                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                              if ( (_BYTE)result == 0 )
                                                              {
LABEL_569:
                                                                if ( qword_180117238 != 0
                                                                  || (qword_180117238 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                                                                          a1,
                                                                                          qword_180117198,
                                                                                          /*0x534*/ "getInstance",
                                                                                          /*0x56a*/ "(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;"),
                                                                      (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
                                                                {
                                                                  v83 = sub_180002760(a1);
                                                                  sub_1800036C0(
                                                                    (__int64)v77,
                                                                    (float *)&v71,
                                                                    (__int64 *)&v83,
                                                                    &v83);
                                                                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                  if ( (_BYTE)result == 0 )
                                                                  {
                                                                    LODWORD(v84) = 8;
                                                                    v84 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1408LL))(
                                                                            a1,
                                                                            8);
                                                                    sub_1800036C0(
                                                                      (__int64)v77,
                                                                      (float *)&v71,
                                                                      (__int64 *)&v84,
                                                                      &v84);
                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                    if ( (_BYTE)result == 0 )
                                                                    {
                                                                      v86 = v84;
                                                                      LODWORD(v85) = 0;
                                                                      if ( v84 != 0 )
                                                                        sub_1800024D0(a1, v84, 0, v24 >> 56);
                                                                      else
                                                                        sub_180002110(
                                                                          a1,
                                                                          /*0x6d*/ "java/lang/NullPointerException",
                                                                          /*0x5bb*/ "BASTORE npe",
                                                                          0xFFFFFFFFLL);
                                                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                      if ( (_BYTE)result == 0 )
                                                                      {
                                                                        v27 = v24 ^ 0x721092DB6B0ALL;
                                                                        LODWORD(v86) = 1;
                                                                        v28 = 8;
                                                                        v29 = 1;
                                                                        while ( 1 )
                                                                        {
                                                                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                          if ( (_BYTE)result != 0 )
                                                                            goto LABEL_92;
                                                                          sub_180026DB0(&v71, v87);
                                                                          sub_180026DB0(&v71, &v83);
                                                                          sub_180026DB0(&v71, &v84);
                                                                          sub_180026DB0(&v71, &v74);
                                                                          sub_180002660(a1, &v71);
                                                                          LODWORD(v86) = v29;
                                                                          LODWORD(v85) = 8;
                                                                          if ( v28 == 64 )
                                                                            break;
                                                                          v86 = v84;
                                                                          LODWORD(v85) = v29;
                                                                          if ( v84 != 0 )
                                                                            sub_1800024D0(
                                                                              a1,
                                                                              v84,
                                                                              v29,
                                                                              v27 << v28 >> 56);
                                                                          else
                                                                            sub_180002110(
                                                                              a1,
                                                                              /*0x6d*/ "java/lang/NullPointerException",
                                                                              /*0x5bb*/ "BASTORE npe",
                                                                              0xFFFFFFFFLL);
                                                                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                          v28 += 8;
                                                                          ++v29;
                                                                          if ( (_BYTE)result != 0 )
                                                                            goto LABEL_92;
                                                                        }
                                                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                        if ( (_BYTE)result == 0 )
                                                                        {
                                                                          sub_180026DB0(&v71, v87);
                                                                          sub_180026DB0(&v71, &v83);
                                                                          sub_180026DB0(&v71, &v84);
                                                                          sub_180026DB0(&v71, &v74);
                                                                          sub_180002660(a1, &v71);
                                                                          if ( qword_1801171A0 != 0
                                                                            && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                                 a1,
                                                                                 qword_1801171A0,
                                                                                 0) == 0 )
                                                                          {
                                                                            goto LABEL_563;
                                                                          }
                                                                          sub_1800C68B0(&unk_1801170D0);
                                                                          if ( qword_1801171A0 == 0
                                                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                                 a1,
                                                                                 qword_1801171A0,
                                                                                 0) != 0 )
                                                                          {
                                                                            v30 = sub_1800023C0(a1);
                                                                            if ( v30 != 0 )
                                                                            {
                                                                              qword_1801171A0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                                                                  a1,
                                                                                                  v30);
                                                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                                a1,
                                                                                v30);
                                                                            }
                                                                          }
                                                                          sub_1800C6900(&unk_1801170D0);
                                                                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                          if ( (_BYTE)result == 0 )
                                                                          {
LABEL_563:
                                                                            v31 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 216LL))(
                                                                                    a1,
                                                                                    qword_1801171A0);
                                                                            v80 = v31;
                                                                            if ( v31 != 0 )
                                                                            {
                                                                              v86 = v31;
                                                                              sub_1800036C0(
                                                                                (__int64)v77,
                                                                                (float *)&v71,
                                                                                &v80,
                                                                                &v80);
                                                                            }
                                                                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                            if ( (_BYTE)result == 0 )
                                                                            {
                                                                              v32 = v84;
                                                                              v84 = v86;
                                                                              v85 = v32;
                                                                              if ( qword_1801171A0 != 0
                                                                                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                                     a1,
                                                                                     qword_1801171A0,
                                                                                     0) == 0 )
                                                                              {
                                                                                goto LABEL_564;
                                                                              }
                                                                              sub_1800C68B0(&unk_1801170D0);
                                                                              if ( qword_1801171A0 == 0
                                                                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                                     a1,
                                                                                     qword_1801171A0,
                                                                                     0) != 0 )
                                                                              {
                                                                                v33 = sub_1800023C0(a1);
                                                                                if ( v33 != 0 )
                                                                                {
                                                                                  qword_1801171A0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v33);
                                                                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                                    a1,
                                                                                    v33);
                                                                                }
                                                                              }
                                                                              sub_1800C6900(&unk_1801170D0);
                                                                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                              if ( (_BYTE)result == 0 )
                                                                              {
LABEL_564:
                                                                                if ( qword_180117240 != 0
                                                                                  || (qword_180117240 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(a1, qword_1801171A0, /*0x48b*/ "<init>", /*0x5c7*/ "([B)V"),
                                                                                      (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
                                                                                {
                                                                                  if ( v86 != 0 )
                                                                                    sub_180026870(
                                                                                      a1,
                                                                                      v86,
                                                                                      qword_1801171A0,
                                                                                      qword_180117240,
                                                                                      v85);
                                                                                  else
                                                                                    sub_180002110(
                                                                                      a1,
                                                                                      /*0x6d*/ "java/lang/NullPointerException",
                                                                                      /*0x4ab*/ "INVOKESPECIAL Void npe",
                                                                                      0xFFFFFFFFLL);
                                                                                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                  if ( (_BYTE)result == 0 )
                                                                                  {
                                                                                    if ( qword_180117198 != 0
                                                                                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                                           a1,
                                                                                           qword_180117198,
                                                                                           0) == 0 )
                                                                                    {
                                                                                      goto LABEL_570;
                                                                                    }
                                                                                    sub_1800C68B0(&unk_1801170C8);
                                                                                    if ( qword_180117198 == 0
                                                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                                           a1,
                                                                                           qword_180117198,
                                                                                           0) != 0 )
                                                                                    {
                                                                                      v34 = sub_1800023C0(a1);
                                                                                      if ( v34 != 0 )
                                                                                      {
                                                                                        qword_180117198 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v34);
                                                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                                          a1,
                                                                                          v34);
                                                                                      }
                                                                                    }
                                                                                    sub_1800C6900(&unk_1801170C8);
                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                    if ( (_BYTE)result == 0 )
                                                                                    {
LABEL_570:
                                                                                      if ( qword_180117248 != 0
                                                                                        || (qword_180117248 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(a1, qword_180117198, /*0x5cd*/ "generateSecret", /*0x5dc*/ "(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;"),
                                                                                            (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
                                                                                      {
                                                                                        if ( v83 != 0 )
                                                                                        {
                                                                                          v83 = sub_180002790(a1);
                                                                                          sub_1800036C0(
                                                                                            (__int64)v77,
                                                                                            (float *)&v71,
                                                                                            (__int64 *)&v83,
                                                                                            &v83);
                                                                                        }
                                                                                        else
                                                                                        {
                                                                                          sub_180002110(
                                                                                            a1,
                                                                                            /*0x6d*/ "java/lang/NullPointerException",
                                                                                            /*0x8c*/ "INVOKEVIRTUAL Object npe",
                                                                                            0xFFFFFFFFLL);
                                                                                        }
                                                                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                        if ( (_BYTE)result == 0 )
                                                                                        {
                                                                                          if ( qword_1801171A8 != 0
                                                                                            && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                                                 a1,
                                                                                                 qword_1801171A8,
                                                                                                 0) == 0 )
                                                                                          {
                                                                                            goto LABEL_204;
                                                                                          }
                                                                                          sub_1800C68B0(&unk_1801170D8);
                                                                                          if ( qword_1801171A8 == 0
                                                                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                                                                                 a1,
                                                                                                 qword_1801171A8,
                                                                                                 0) != 0 )
                                                                                          {
                                                                                            v35 = sub_1800023C0(a1);
                                                                                            if ( v35 != 0 )
                                                                                            {
                                                                                              qword_1801171A8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v35);
                                                                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(
                                                                                                a1,
                                                                                                v35);
                                                                                            }
                                                                                          }
                                                                                          sub_1800C6900(&unk_1801170D8);
                                                                                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                          if ( (_BYTE)result == 0 )
                                                                                          {
LABEL_204:
                                                                                            v36 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 216LL))(
                                                                                                    a1,
                                                                                                    qword_1801171A8);
                                                                                            v80 = v36;
                                                                                            if ( v36 != 0 )
                                                                                            {
                                                                                              v84 = v36;
                                                                                              sub_1800036C0(
                                                                                                (__int64)v77,
                                                                                                (float *)&v71,
                                                                                                &v80,
                                                                                                &v80);
                                                                                            }
                                                                                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                            if ( (_BYTE)result == 0 )
                                                                                            {
                                                                                              v86 = v84;
                                                                                              LODWORD(v85) = 8;
                                                                                              v85 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1408LL))(a1, 8);
                                                                                              sub_1800036C0(
                                                                                                (__int64)v77,
                                                                                                (float *)&v71,
                                                                                                &v85,
                                                                                                &v85);
                                                                                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                              if ( (_BYTE)result == 0 )
                                                                                              {
                                                                                                if ( qword_1801171A8 != 0 && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801171A8, 0) == 0 )
                                                                                                  goto LABEL_571;
                                                                                                sub_1800C68B0(&unk_1801170D8);
                                                                                                if ( qword_1801171A8 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801171A8, 0) != 0 )
                                                                                                {
                                                                                                  v37 = sub_1800023C0(a1);
                                                                                                  if ( v37 != 0 )
                                                                                                  {
                                                                                                    qword_1801171A8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v37);
                                                                                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v37);
                                                                                                  }
                                                                                                }
                                                                                                sub_1800C6900(&unk_1801170D8);
                                                                                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                if ( (_BYTE)result == 0 )
                                                                                                {
LABEL_571:
                                                                                                  if ( qword_180117250 != 0 || (qword_180117250 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(a1, qword_1801171A8, /*0x48b*/ "<init>", /*0x5c7*/ "([B)V"), (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
                                                                                                  {
                                                                                                    if ( v86 != 0 )
                                                                                                      sub_180026870(a1, v86, qword_1801171A8, qword_180117250, v85);
                                                                                                    else
                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x4ab*/ "INVOKESPECIAL Void npe", 0xFFFFFFFFLL);
                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                    if ( (_BYTE)result == 0 )
                                                                                                    {
                                                                                                      if ( qword_180117190 != 0 && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117190, 0) == 0 )
                                                                                                        goto LABEL_572;
                                                                                                      sub_1800C68B0(&unk_1801170C0);
                                                                                                      if ( qword_180117190 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117190, 0) != 0 )
                                                                                                      {
                                                                                                        v38 = sub_1800023C0(a1);
                                                                                                        if ( v38 != 0 )
                                                                                                        {
                                                                                                          qword_180117190 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v38);
                                                                                                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v38);
                                                                                                        }
                                                                                                      }
                                                                                                      sub_1800C6900(&unk_1801170C0);
                                                                                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                      if ( (_BYTE)result == 0 )
                                                                                                      {
LABEL_572:
                                                                                                        if ( qword_180117258 != 0 || (qword_180117258 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(a1, qword_180117190, /*0x613*/ "init", /*0x618*/ "(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V"), (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
                                                                                                        {
                                                                                                          if ( v87[0] != 0 )
                                                                                                            sub_1800027F0(a1, v87[0], qword_180117258, (unsigned int)v82);
                                                                                                          else
                                                                                                            sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x65b*/ "INVOKEVIRTUAL Void npe", 0xFFFFFFFFLL);
                                                                                                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                          if ( (_BYTE)result == 0 )
                                                                                                          {
                                                                                                            LODWORD(v87[0]) = 7;
                                                                                                            v87[0] = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1440LL))(a1, 7);
                                                                                                            sub_1800036C0((__int64)v77, (float *)&v71, v87, v87);
                                                                                                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                            if ( (_BYTE)result == 0 )
                                                                                                            {
                                                                                                              v76 = v87[0];
                                                                                                              sub_1800036C0((__int64)v77, (float *)&v71, v87, v87);
                                                                                                              v87[0] = qword_180116FF8;
                                                                                                              v82 = qword_180116FF8;
                                                                                                              v75 = qword_180116FF8;
                                                                                                              sub_1800036C0((__int64)v77, (float *)&v71, &v82, &v82);
                                                                                                              if ( qword_1801171B0 != 0 && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801171B0, 0) == 0 )
                                                                                                                goto LABEL_573;
                                                                                                              sub_1800C68B0(&unk_1801170E0);
                                                                                                              if ( qword_1801171B0 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801171B0, 0) != 0 )
                                                                                                              {
                                                                                                                v40 = sub_1800023C0(a1);
                                                                                                                if ( v40 != 0 )
                                                                                                                {
                                                                                                                  qword_1801171B0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v40);
                                                                                                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v40);
                                                                                                                }
                                                                                                              }
                                                                                                              sub_1800C6900(&unk_1801170E0);
                                                                                                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                              if ( (_BYTE)result == 0 )
                                                                                                              {
LABEL_573:
                                                                                                                if ( qword_180117260 != 0 || (qword_180117260 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(a1, qword_1801171B0, /*0x68f*/ "length", /*0x696*/ "()I"), (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
                                                                                                                {
                                                                                                                  if ( v87[0] != 0 )
                                                                                                                    LODWORD(v87[0]) = sub_180026900(a1, v87[0], qword_180117260, v39);
                                                                                                                  else
                                                                                                                    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x69a*/ "INVOKEVIRTUAL Int npe", 0xFFFFFFFFLL);
                                                                                                                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                  if ( (_BYTE)result == 0 )
                                                                                                                  {
                                                                                                                    v70 = v87[0];
                                                                                                                    LODWORD(v87[0]) = 0;
                                                                                                                    v69 = 0;
                                                                                                                    v78 = 0;
LABEL_249:
                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                    if ( (_BYTE)result == 0 )
                                                                                                                    {
                                                                                                                      sub_180026DB0(&v71, &v74);
                                                                                                                      sub_180026DB0(&v71, &v75);
                                                                                                                      sub_180026DB0(&v71, &v76);
                                                                                                                      sub_180002660(a1, &v71);
                                                                                                                      v87[0] = v75;
                                                                                                                      sub_1800036C0((__int64)v77, (float *)&v71, v87, v87);
                                                                                                                      LODWORD(v82) = v78;
                                                                                                                      v78 += 8;
                                                                                                                      LODWORD(v83) = v78;
                                                                                                                      if ( qword_1801171B0 != 0 && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801171B0, 0) == 0 )
                                                                                                                        goto LABEL_561;
                                                                                                                      sub_1800C68B0(&unk_1801170E0);
                                                                                                                      if ( qword_1801171B0 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801171B0, 0) != 0 )
                                                                                                                      {
                                                                                                                        v41 = sub_1800023C0(a1);
                                                                                                                        if ( v41 != 0 )
                                                                                                                        {
                                                                                                                          qword_1801171B0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v41);
                                                                                                                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v41);
                                                                                                                        }
                                                                                                                      }
                                                                                                                      sub_1800C6900(&unk_1801170E0);
                                                                                                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                      if ( (_BYTE)result == 0 )
                                                                                                                      {
LABEL_561:
                                                                                                                        if ( qword_180117268 != 0 || (qword_180117268 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(a1, qword_1801171B0, /*0x6b0*/ "substring", /*0x6ba*/ "(II)Ljava/lang/String;"), (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
                                                                                                                        {
                                                                                                                          if ( v87[0] != 0 )
                                                                                                                          {
                                                                                                                            v87[0] = sub_180002790(a1);
                                                                                                                            sub_1800036C0((__int64)v77, (float *)&v71, v87, v87);
                                                                                                                          }
                                                                                                                          else
                                                                                                                          {
                                                                                                                            sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 0xFFFFFFFFLL);
                                                                                                                          }
                                                                                                                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                          if ( (_BYTE)result == 0 )
                                                                                                                          {
                                                                                                                            v82 = qword_180117008;
                                                                                                                            if ( qword_1801171B0 != 0 && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801171B0, 0) == 0 )
                                                                                                                              goto LABEL_565;
                                                                                                                            sub_1800C68B0(&unk_1801170E0);
                                                                                                                            if ( qword_1801171B0 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801171B0, 0) != 0 )
                                                                                                                            {
                                                                                                                              v42 = sub_1800023C0(a1);
                                                                                                                              if ( v42 != 0 )
                                                                                                                              {
                                                                                                                                qword_1801171B0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v42);
                                                                                                                                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v42);
                                                                                                                              }
                                                                                                                            }
                                                                                                                            sub_1800C6900(&unk_1801170E0);
                                                                                                                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                            if ( (_BYTE)result == 0 )
                                                                                                                            {
LABEL_565:
                                                                                                                              if ( qword_180117270 != 0 || (qword_180117270 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(a1, qword_1801171B0, /*0x6d1*/ "getBytes", /*0x6da*/ "(Ljava/lang/String;)[B"), (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
                                                                                                                              {
                                                                                                                                if ( v87[0] != 0 )
                                                                                                                                {
                                                                                                                                  v87[0] = sub_180002790(a1);
                                                                                                                                  sub_1800036C0((__int64)v77, (float *)&v71, v87, v87);
                                                                                                                                }
                                                                                                                                else
                                                                                                                                {
                                                                                                                                  sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 0xFFFFFFFFLL);
                                                                                                                                }
                                                                                                                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                if ( (_BYTE)result == 0 )
                                                                                                                                {
                                                                                                                                  v81 = v87[0];
                                                                                                                                  sub_1800036C0((__int64)v77, (float *)&v71, v87, v87);
                                                                                                                                  v87[0] = v76;
                                                                                                                                  sub_1800036C0((__int64)v77, (float *)&v71, v87, v87);
                                                                                                                                  LODWORD(v82) = v69;
                                                                                                                                  v83 = v81;
                                                                                                                                  sub_1800036C0((__int64)v77, (float *)&v71, (__int64 *)&v83, &v83);
                                                                                                                                  LODWORD(v84) = 0;
                                                                                                                                  if ( v83 != 0 )
                                                                                                                                    LODWORD(v83) = (char)sub_180002530(a1, v83, 0);
                                                                                                                                  else
                                                                                                                                    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                  if ( (_BYTE)result == 0 )
                                                                                                                                  {
                                                                                                                                    v83 = (unsigned __int64)(unsigned int)v83 << 56;
                                                                                                                                    v86 = v81;
                                                                                                                                    sub_1800036C0((__int64)v77, (float *)&v71, &v86, &v86);
                                                                                                                                    LODWORD(v85) = 1;
                                                                                                                                    if ( v86 != 0 )
                                                                                                                                      LODWORD(v86) = (char)sub_180002530(a1, v86, 1);
                                                                                                                                    else
                                                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                    if ( (_BYTE)result == 0 )
                                                                                                                                    {
                                                                                                                                      v83 |= (unsigned __int64)(unsigned __int8)v86 << 48;
                                                                                                                                      v86 = v81;
                                                                                                                                      sub_1800036C0((__int64)v77, (float *)&v71, &v86, &v86);
                                                                                                                                      LODWORD(v85) = 2;
                                                                                                                                      if ( v86 != 0 )
                                                                                                                                        LODWORD(v86) = (char)sub_180002530(a1, v86, 2);
                                                                                                                                      else
                                                                                                                                        sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                      if ( (_BYTE)result == 0 )
                                                                                                                                      {
                                                                                                                                        v83 |= (unsigned __int64)(unsigned __int8)v86 << 40;
                                                                                                                                        v86 = v81;
                                                                                                                                        sub_1800036C0((__int64)v77, (float *)&v71, &v86, &v86);
                                                                                                                                        LODWORD(v85) = 3;
                                                                                                                                        if ( v86 != 0 )
                                                                                                                                          LODWORD(v86) = (char)sub_180002530(a1, v86, 3);
                                                                                                                                        else
                                                                                                                                          sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                        if ( (_BYTE)result == 0 )
                                                                                                                                        {
                                                                                                                                          v83 |= (unsigned __int64)(unsigned __int8)v86 << 32;
                                                                                                                                          v86 = v81;
                                                                                                                                          sub_1800036C0((__int64)v77, (float *)&v71, &v86, &v86);
                                                                                                                                          LODWORD(v85) = 4;
                                                                                                                                          if ( v86 != 0 )
                                                                                                                                            LODWORD(v86) = (char)sub_180002530(a1, v86, 4);
                                                                                                                                          else
                                                                                                                                            sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                          if ( (_BYTE)result == 0 )
                                                                                                                                          {
                                                                                                                                            v83 |= (unsigned int)((_DWORD)v86 << 24);
                                                                                                                                            v86 = v81;
                                                                                                                                            sub_1800036C0((__int64)v77, (float *)&v71, &v86, &v86);
                                                                                                                                            LODWORD(v85) = 5;
                                                                                                                                            if ( v86 != 0 )
                                                                                                                                              LODWORD(v86) = (char)sub_180002530(a1, v86, 5);
                                                                                                                                            else
                                                                                                                                              sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                            if ( (_BYTE)result == 0 )
                                                                                                                                            {
                                                                                                                                              v83 |= (unsigned __int8)v86 << 16;
                                                                                                                                              v86 = v81;
                                                                                                                                              sub_1800036C0((__int64)v77, (float *)&v71, &v86, &v86);
                                                                                                                                              LODWORD(v85) = 6;
                                                                                                                                              if ( v86 != 0 )
                                                                                                                                                LODWORD(v86) = (char)sub_180002530(a1, v86, 6);
                                                                                                                                              else
                                                                                                                                                sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                              if ( (_BYTE)result == 0 )
                                                                                                                                              {
                                                                                                                                                v83 |= (unsigned __int16)((_WORD)v86 << 8);
                                                                                                                                                v86 = v81;
                                                                                                                                                sub_1800036C0((__int64)v77, (float *)&v71, &v86, &v86);
                                                                                                                                                LODWORD(v85) = 7;
                                                                                                                                                if ( v86 != 0 )
                                                                                                                                                  LODWORD(v86) = (char)sub_180002530(a1, v86, 7);
                                                                                                                                                else
                                                                                                                                                  sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                if ( (_BYTE)result == 0 )
                                                                                                                                                {
                                                                                                                                                  ++v69;
                                                                                                                                                  v43 = 0xFFFFFFFF;
                                                                                                                                                  while ( 1 )
                                                                                                                                                  {
                                                                                                                                                    v83 |= (unsigned __int8)v86;
                                                                                                                                                    v86 = v43;
                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                    if ( (_BYTE)result != 0 )
                                                                                                                                                      break;
                                                                                                                                                    sub_180026DB0(&v71, v87);
                                                                                                                                                    sub_180026DB0(&v71, &v74);
                                                                                                                                                    sub_180026DB0(&v71, &v75);
                                                                                                                                                    sub_180026DB0(&v71, &v76);
                                                                                                                                                    sub_180026DB0(&v71, &v81);
                                                                                                                                                    sub_180002660(a1, &v71);
                                                                                                                                                    v85 = v86;
                                                                                                                                                    v86 = v84;
                                                                                                                                                    v44 = v83;
                                                                                                                                                    HIDWORD(v84) = HIDWORD(v83);
                                                                                                                                                    v83 = v85;
                                                                                                                                                    LODWORD(v84) = 8;
                                                                                                                                                    v84 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1408LL))(a1, 8);
                                                                                                                                                    sub_1800036C0((__int64)v77, (float *)&v71, (__int64 *)&v84, &v84);
                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                    if ( (_BYTE)result != 0 )
                                                                                                                                                      break;
                                                                                                                                                    v86 = v84;
                                                                                                                                                    LODWORD(v85) = 0;
                                                                                                                                                    if ( v84 != 0 )
                                                                                                                                                      sub_1800024D0(a1, v84, 0, (__int64)v44 >> 56);
                                                                                                                                                    else
                                                                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x5bb*/ "BASTORE npe", 0xFFFFFFFFLL);
                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                    if ( (_BYTE)result != 0 )
                                                                                                                                                      break;
                                                                                                                                                    v86 = v84;
                                                                                                                                                    LODWORD(v85) = 1;
                                                                                                                                                    if ( v84 != 0 )
                                                                                                                                                      sub_1800024D0(a1, v84, 1, (unsigned int)((int)(v44 >> 24) >> 24));
                                                                                                                                                    else
                                                                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x5bb*/ "BASTORE npe", 0xFFFFFFFFLL);
                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                    if ( (_BYTE)result != 0 )
                                                                                                                                                      break;
                                                                                                                                                    v86 = v84;
                                                                                                                                                    LODWORD(v85) = 2;
                                                                                                                                                    if ( v84 != 0 )
                                                                                                                                                      sub_1800024D0(a1, v84, 2, (unsigned int)((int)(v44 >> 16) >> 24));
                                                                                                                                                    else
                                                                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x5bb*/ "BASTORE npe", 0xFFFFFFFFLL);
                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                    if ( (_BYTE)result != 0 )
                                                                                                                                                      break;
                                                                                                                                                    v86 = v84;
                                                                                                                                                    LODWORD(v85) = 3;
                                                                                                                                                    if ( v84 != 0 )
                                                                                                                                                      sub_1800024D0(a1, v84, 3, (unsigned int)((int)(v44 >> 8) >> 24));
                                                                                                                                                    else
                                                                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x5bb*/ "BASTORE npe", 0xFFFFFFFFLL);
                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                    if ( (_BYTE)result != 0 )
                                                                                                                                                      break;
                                                                                                                                                    v86 = v84;
                                                                                                                                                    LODWORD(v85) = 4;
                                                                                                                                                    if ( v84 != 0 )
                                                                                                                                                      sub_1800024D0(a1, v84, 4, (unsigned int)((int)v44 >> 24));
                                                                                                                                                    else
                                                                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x5bb*/ "BASTORE npe", 0xFFFFFFFFLL);
                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                    if ( (_BYTE)result != 0 )
                                                                                                                                                      break;
                                                                                                                                                    v86 = v84;
                                                                                                                                                    LODWORD(v85) = 5;
                                                                                                                                                    if ( v84 != 0 )
                                                                                                                                                      sub_1800024D0(a1, v84, 5, (unsigned int)SBYTE2(v44));
                                                                                                                                                    else
                                                                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x5bb*/ "BASTORE npe", 0xFFFFFFFFLL);
                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                    if ( (_BYTE)result != 0 )
                                                                                                                                                      break;
                                                                                                                                                    v86 = v84;
                                                                                                                                                    LODWORD(v85) = 6;
                                                                                                                                                    if ( v84 != 0 )
                                                                                                                                                      sub_1800024D0(a1, v84, 6, (unsigned int)SBYTE1(v44));
                                                                                                                                                    else
                                                                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x5bb*/ "BASTORE npe", 0xFFFFFFFFLL);
                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                    if ( (_BYTE)result != 0 )
                                                                                                                                                      break;
                                                                                                                                                    v86 = v84;
                                                                                                                                                    LODWORD(v85) = 7;
                                                                                                                                                    if ( v84 != 0 )
                                                                                                                                                      sub_1800024D0(a1, v84, 7, (unsigned int)(char)v44);
                                                                                                                                                    else
                                                                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x5bb*/ "BASTORE npe", 0xFFFFFFFFLL);
                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                    if ( (_BYTE)result != 0 )
                                                                                                                                                      break;
                                                                                                                                                    v86 = v74;
                                                                                                                                                    sub_1800036C0((__int64)v77, (float *)&v71, &v86, &v86);
                                                                                                                                                    v45 = v86;
                                                                                                                                                    v86 = v84;
                                                                                                                                                    v84 = v45;
                                                                                                                                                    if ( qword_180117190 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117190, 0) != 0 )
                                                                                                                                                    {
                                                                                                                                                      sub_1800C68B0(&unk_1801170C0);
                                                                                                                                                      if ( qword_180117190 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117190, 0) != 0 )
                                                                                                                                                      {
                                                                                                                                                        v46 = sub_1800023C0(a1);
                                                                                                                                                        if ( v46 != 0 )
                                                                                                                                                        {
                                                                                                                                                          qword_180117190 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v46);
                                                                                                                                                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v46);
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                      sub_1800C6900(&unk_1801170C0);
                                                                                                                                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                      if ( (_BYTE)result != 0 )
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    if ( qword_180117278 == 0 )
                                                                                                                                                    {
                                                                                                                                                      qword_180117278 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(a1, qword_180117190, /*0x724*/ "doFinal", /*0x72c*/ "([B)[B");
                                                                                                                                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                      if ( (_BYTE)result != 0 )
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    if ( v84 != 0 )
                                                                                                                                                    {
                                                                                                                                                      v84 = sub_180002790(a1);
                                                                                                                                                      sub_1800036C0((__int64)v77, (float *)&v71, (__int64 *)&v84, &v84);
                                                                                                                                                    }
                                                                                                                                                    else
                                                                                                                                                    {
                                                                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 0xFFFFFFFFLL);
                                                                                                                                                    }
                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                    if ( (_BYTE)result != 0 )
                                                                                                                                                      break;
                                                                                                                                                    v79 = v84;
                                                                                                                                                    sub_1800036C0((__int64)v77, (float *)&v71, (__int64 *)&v84, &v84);
                                                                                                                                                    v84 = v79;
                                                                                                                                                    sub_1800036C0((__int64)v77, (float *)&v71, (__int64 *)&v84, &v84);
                                                                                                                                                    LODWORD(v86) = 0;
                                                                                                                                                    if ( v84 != 0 )
                                                                                                                                                      LODWORD(v84) = (char)sub_180002530(a1, v84, 0);
                                                                                                                                                    else
                                                                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                    if ( (_BYTE)result != 0 )
                                                                                                                                                      break;
                                                                                                                                                    v84 = (unsigned __int64)(unsigned int)v84 << 56;
                                                                                                                                                    v85 = v79;
                                                                                                                                                    sub_1800036C0((__int64)v77, (float *)&v71, &v85, &v85);
                                                                                                                                                    if ( v85 != 0 )
                                                                                                                                                      LODWORD(v85) = (char)sub_180002530(a1, v85, 1);
                                                                                                                                                    else
                                                                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                    if ( (_BYTE)result != 0 )
                                                                                                                                                      break;
                                                                                                                                                    v84 |= (unsigned __int64)(unsigned __int8)v85 << 48;
                                                                                                                                                    v85 = v79;
                                                                                                                                                    sub_1800036C0((__int64)v77, (float *)&v71, &v85, &v85);
                                                                                                                                                    if ( v85 != 0 )
                                                                                                                                                      LODWORD(v85) = (char)sub_180002530(a1, v85, 2);
                                                                                                                                                    else
                                                                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                    if ( (_BYTE)result != 0 )
                                                                                                                                                      break;
                                                                                                                                                    v84 |= (unsigned __int64)(unsigned __int8)v85 << 40;
                                                                                                                                                    v85 = v79;
                                                                                                                                                    sub_1800036C0((__int64)v77, (float *)&v71, &v85, &v85);
                                                                                                                                                    if ( v85 != 0 )
                                                                                                                                                      LODWORD(v85) = (char)sub_180002530(a1, v85, 3);
                                                                                                                                                    else
                                                                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                    if ( (_BYTE)result != 0 )
                                                                                                                                                      break;
                                                                                                                                                    v84 |= (unsigned __int64)(unsigned __int8)v85 << 32;
                                                                                                                                                    v85 = v79;
                                                                                                                                                    sub_1800036C0((__int64)v77, (float *)&v71, &v85, &v85);
                                                                                                                                                    if ( v85 != 0 )
                                                                                                                                                      LODWORD(v85) = (char)sub_180002530(a1, v85, 4);
                                                                                                                                                    else
                                                                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                    if ( (_BYTE)result != 0 )
                                                                                                                                                      break;
                                                                                                                                                    v84 |= (unsigned int)((_DWORD)v85 << 24);
                                                                                                                                                    v85 = v79;
                                                                                                                                                    sub_1800036C0((__int64)v77, (float *)&v71, &v85, &v85);
                                                                                                                                                    if ( v85 != 0 )
                                                                                                                                                      LODWORD(v85) = (char)sub_180002530(a1, v85, 5);
                                                                                                                                                    else
                                                                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                    if ( (_BYTE)result != 0 )
                                                                                                                                                      break;
                                                                                                                                                    v84 |= (unsigned __int8)v85 << 16;
                                                                                                                                                    v85 = v79;
                                                                                                                                                    sub_1800036C0((__int64)v77, (float *)&v71, &v85, &v85);
                                                                                                                                                    if ( v85 != 0 )
                                                                                                                                                      LODWORD(v85) = (char)sub_180002530(a1, v85, 6);
                                                                                                                                                    else
                                                                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                    if ( (_BYTE)result != 0 )
                                                                                                                                                      break;
                                                                                                                                                    v84 |= (unsigned __int16)((_WORD)v85 << 8);
                                                                                                                                                    v85 = v79;
                                                                                                                                                    sub_1800036C0((__int64)v77, (float *)&v71, &v85, &v85);
                                                                                                                                                    if ( v85 != 0 )
                                                                                                                                                      LODWORD(v85) = (char)sub_180002530(a1, v85, 7);
                                                                                                                                                    else
                                                                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                    if ( (_BYTE)result != 0 )
                                                                                                                                                      break;
                                                                                                                                                    v85 = v84 | (unsigned __int8)v85;
                                                                                                                                                    v47 = v86;
                                                                                                                                                    v86 = v83;
                                                                                                                                                    v84 = v47;
                                                                                                                                                    v83 = v85;
                                                                                                                                                    v48 = *(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/);
                                                                                                                                                    if ( (_DWORD)v86 != 0 )
                                                                                                                                                    {
                                                                                                                                                      result = v48(a1);
                                                                                                                                                      if ( (_BYTE)result != 0 )
                                                                                                                                                        break;
                                                                                                                                                      sub_180026DB0(&v71, v87);
                                                                                                                                                      sub_180026DB0(&v71, &v74);
                                                                                                                                                      sub_180026DB0(&v71, &v75);
                                                                                                                                                      sub_180026DB0(&v71, &v76);
                                                                                                                                                      sub_180026DB0(&v71, &v81);
                                                                                                                                                      sub_180026DB0(&v71, &v79);
                                                                                                                                                      sub_180002660(a1, &v71);
                                                                                                                                                      if ( v87[0] != 0 )
                                                                                                                                                        (*(void (__fastcall **)(__int64, __int64, _QWORD, __int64, unsigned __int64 *))(*(_QWORD *)a1 + 1696LL))(a1, v87[0], (unsigned int)v82, 1, &v83);
                                                                                                                                                      else
                                                                                                                                                        sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6fc*/ "LASTORE npe", 0xFFFFFFFFLL);
                                                                                                                                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                      if ( (_BYTE)result != 0 )
                                                                                                                                                        break;
                                                                                                                                                      LODWORD(v87[0]) = v78;
                                                                                                                                                      LODWORD(v82) = v70;
                                                                                                                                                      if ( v78 < v70 )
                                                                                                                                                        goto LABEL_249;
                                                                                                                                                      v87[0] = qword_180117010;
                                                                                                                                                      v82 = qword_180117010;
                                                                                                                                                      v75 = qword_180117010;
                                                                                                                                                      sub_1800036C0((__int64)v77, (float *)&v71, &v82, &v82);
                                                                                                                                                      if ( qword_1801171B0 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801171B0, 0) != 0 )
                                                                                                                                                      {
                                                                                                                                                        sub_1800C68B0(&unk_1801170E0);
                                                                                                                                                        if ( qword_1801171B0 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801171B0, 0) != 0 )
                                                                                                                                                        {
                                                                                                                                                          v50 = sub_1800023C0(a1);
                                                                                                                                                          if ( v50 != 0 )
                                                                                                                                                          {
                                                                                                                                                            qword_1801171B0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v50);
                                                                                                                                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v50);
                                                                                                                                                          }
                                                                                                                                                        }
                                                                                                                                                        sub_1800C6900(&unk_1801170E0);
                                                                                                                                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                        if ( (_BYTE)result != 0 )
                                                                                                                                                          break;
                                                                                                                                                      }
                                                                                                                                                      if ( qword_180117260 == 0 )
                                                                                                                                                      {
                                                                                                                                                        qword_180117260 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(a1, qword_1801171B0, /*0x68f*/ "length", /*0x696*/ "()I");
                                                                                                                                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                        if ( (_BYTE)result != 0 )
                                                                                                                                                          break;
                                                                                                                                                      }
                                                                                                                                                      if ( v87[0] != 0 )
                                                                                                                                                        LODWORD(v87[0]) = sub_180026900(a1, v87[0], qword_180117260, v49);
                                                                                                                                                      else
                                                                                                                                                        sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x69a*/ "INVOKEVIRTUAL Int npe", 0xFFFFFFFFLL);
                                                                                                                                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                      if ( (_BYTE)result != 0 )
                                                                                                                                                        break;
                                                                                                                                                      v70 = v87[0];
                                                                                                                                                      LODWORD(v87[0]) = 0;
                                                                                                                                                      v78 = 0;
                                                                                                                                                    }
                                                                                                                                                    else
                                                                                                                                                    {
                                                                                                                                                      result = v48(a1);
                                                                                                                                                      if ( (_BYTE)result != 0 )
                                                                                                                                                        break;
                                                                                                                                                      sub_180026DB0(&v71, v87);
                                                                                                                                                      sub_180026DB0(&v71, &v74);
                                                                                                                                                      sub_180026DB0(&v71, &v75);
                                                                                                                                                      sub_180026DB0(&v71, &v76);
                                                                                                                                                      sub_180026DB0(&v71, &v81);
                                                                                                                                                      sub_180026DB0(&v71, &v79);
                                                                                                                                                      sub_180002660(a1, &v71);
                                                                                                                                                      if ( v87[0] != 0 )
                                                                                                                                                        (*(void (__fastcall **)(__int64, __int64, _QWORD, __int64, unsigned __int64 *))(*(_QWORD *)a1 + 1696LL))(a1, v87[0], (unsigned int)v82, 1, &v83);
                                                                                                                                                      else
                                                                                                                                                        sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6fc*/ "LASTORE npe", 0xFFFFFFFFLL);
                                                                                                                                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                      if ( (_BYTE)result != 0 )
                                                                                                                                                        break;
                                                                                                                                                      LODWORD(v87[0]) = v78;
                                                                                                                                                      LODWORD(v82) = v70;
                                                                                                                                                      if ( v78 >= v70 )
                                                                                                                                                      {
                                                                                                                                                        v87[0] = v76;
                                                                                                                                                        sub_1800036C0((__int64)v77, (float *)&v71, v87, v87);
                                                                                                                                                        if ( qword_180117100 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117100, 0) != 0 )
                                                                                                                                                        {
                                                                                                                                                          sub_1800C68B0(&unk_180117030);
                                                                                                                                                          if ( qword_180117100 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117100, 0) != 0 )
                                                                                                                                                          {
                                                                                                                                                            v53 = sub_1800023C0(a1);
                                                                                                                                                            if ( v53 != 0 )
                                                                                                                                                            {
                                                                                                                                                              qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v53);
                                                                                                                                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v53);
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                          sub_1800C6900(&unk_180117030);
                                                                                                                                                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                          if ( (_BYTE)result != 0 )
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        v54 = qword_1801172D0;
                                                                                                                                                        if ( qword_1801172D0 == 0 )
                                                                                                                                                        {
                                                                                                                                                          qword_1801172D0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL /*GetMethodID*/))(a1, qword_180117100, /*0x708*/ "b", /*0x70a*/ "[J");
                                                                                                                                                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                          if ( (_BYTE)result != 0 )
                                                                                                                                                            break;
                                                                                                                                                          v54 = qword_1801172D0;
                                                                                                                                                        }
                                                                                                                                                        (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1232LL))(a1, qword_180117100, v54, v87[0]);
                                                                                                                                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                        if ( (_BYTE)result != 0 )
                                                                                                                                                          break;
                                                                                                                                                        LODWORD(v87[0]) = 7;
                                                                                                                                                        if ( qword_1801171B8 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801171B8, 0) != 0 )
                                                                                                                                                        {
                                                                                                                                                          sub_1800C68B0(&unk_1801170E8);
                                                                                                                                                          if ( qword_1801171B8 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801171B8, 0) != 0 )
                                                                                                                                                          {
                                                                                                                                                            v55 = sub_1800023C0(a1);
                                                                                                                                                            if ( v55 != 0 )
                                                                                                                                                            {
                                                                                                                                                              qword_1801171B8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v55);
                                                                                                                                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v55);
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                          sub_1800C6900(&unk_1801170E8);
                                                                                                                                                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                          if ( (_BYTE)result != 0 )
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        if ( SLODWORD(v87[0]) < 0 )
                                                                                                                                                        {
                                                                                                                                                          sub_180002110(a1, /*0x2ce*/ "java/lang/NegativeArraySizeException", /*0x2f3*/ "ANEWARRAY array size < 0", 0xFFFFFFFFLL);
                                                                                                                                                        }
                                                                                                                                                        else
                                                                                                                                                        {
                                                                                                                                                          v87[0] = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, _QWORD))(*(_QWORD *)a1 + 1376LL))(a1, LODWORD(v87[0]), qword_1801171B8, 0);
                                                                                                                                                          sub_1800036C0((__int64)v77, (float *)&v71, v87, v87);
                                                                                                                                                        }
                                                                                                                                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                        if ( (_BYTE)result != 0 )
                                                                                                                                                          break;
                                                                                                                                                        if ( qword_180117100 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117100, 0) != 0 )
                                                                                                                                                        {
                                                                                                                                                          sub_1800C68B0(&unk_180117030);
                                                                                                                                                          if ( qword_180117100 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117100, 0) != 0 )
                                                                                                                                                          {
                                                                                                                                                            v56 = sub_1800023C0(a1);
                                                                                                                                                            if ( v56 != 0 )
                                                                                                                                                            {
                                                                                                                                                              qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v56);
                                                                                                                                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v56);
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                          sub_1800C6900(&unk_180117030);
                                                                                                                                                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                          if ( (_BYTE)result != 0 )
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        v57 = qword_1801172D8;
                                                                                                                                                        if ( qword_1801172D8 == 0 )
                                                                                                                                                        {
                                                                                                                                                          qword_1801172D8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL /*GetMethodID*/))(a1, qword_180117100, /*0x70d*/ "c", /*0x70f*/ "[Ljava/lang/Integer;");
                                                                                                                                                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                          if ( (_BYTE)result != 0 )
                                                                                                                                                            break;
                                                                                                                                                          v57 = qword_1801172D8;
                                                                                                                                                        }
                                                                                                                                                        (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1232LL))(a1, qword_180117100, v57, v87[0]);
                                                                                                                                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                        if ( (_BYTE)result != 0 )
                                                                                                                                                          break;
                                                                                                                                                        if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                                                                                                          goto LABEL_534;
                                                                                                                                                        sub_180026DB0(&v71, &v74);
                                                                                                                                                        sub_180026DB0(&v71, &v75);
                                                                                                                                                        sub_180026DB0(&v71, &v76);
                                                                                                                                                        sub_180026DB0(&v71, &v81);
                                                                                                                                                        sub_180026DB0(&v71, &v79);
                                                                                                                                                        sub_180002660(a1, &v71);
                                                                                                                                                        if ( qword_180117100 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117100, 0) != 0 )
                                                                                                                                                        {
                                                                                                                                                          sub_1800C68B0(&unk_180117030);
                                                                                                                                                          if ( qword_180117100 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117100, 0) != 0 )
                                                                                                                                                          {
                                                                                                                                                            v58 = sub_1800023C0(a1);
                                                                                                                                                            if ( v58 != 0 )
                                                                                                                                                            {
                                                                                                                                                              qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v58);
                                                                                                                                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v58);
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                          sub_1800C6900(&unk_180117030);
                                                                                                                                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                                                                                                            goto LABEL_534;
                                                                                                                                                        }
                                                                                                                                                        if ( qword_180117280 == 0 && (qword_180117280 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(a1, qword_180117100, /*0x733*/ "gqi", /*0x1e0*/ "()[I"), (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0) || (v87[0] = sub_180002760(a1), sub_1800036C0((__int64)v77, (float *)&v71, v87, v87), (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0) )
                                                                                                                                                        {
LABEL_534:
                                                                                                                                                          v61 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 120LL))(a1);
                                                                                                                                                          (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                                                                                                                                          v87[0] = v61;
                                                                                                                                                          v80 = v61;
                                                                                                                                                          sub_180026960(v77, &v71, &v80, &v80);
                                                                                                                                                          goto LABEL_538;
                                                                                                                                                        }
                                                                                                                                                        if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, v87[0], 0) == 0 )
                                                                                                                                                        {
                                                                                                                                                          LODWORD(v87[0]) = 4;
                                                                                                                                                          v87[0] = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1432LL))(a1, 4);
                                                                                                                                                          sub_1800036C0((__int64)v77, (float *)&v71, v87, v87);
                                                                                                                                                          if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                                                                                                            goto LABEL_534;
                                                                                                                                                          if ( qword_180117100 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117100, 0) != 0 )
                                                                                                                                                          {
                                                                                                                                                            sub_1800C68B0(&unk_180117030);
                                                                                                                                                            if ( qword_180117100 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117100, 0) != 0 )
                                                                                                                                                            {
                                                                                                                                                              v59 = sub_1800023C0(a1);
                                                                                                                                                              if ( v59 != 0 )
                                                                                                                                                              {
                                                                                                                                                                qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v59);
                                                                                                                                                                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v59);
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                            sub_1800C6900(&unk_180117030);
                                                                                                                                                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                                                                                                              goto LABEL_534;
                                                                                                                                                          }
                                                                                                                                                          v60 = qword_180117288;
                                                                                                                                                          if ( qword_180117288 == 0 )
                                                                                                                                                          {
                                                                                                                                                            qword_180117288 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(a1, qword_180117100, /*0x753*/ "clb", /*0x757*/ "([I)V");
                                                                                                                                                            if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1) != 0 )
                                                                                                                                                              goto LABEL_534;
                                                                                                                                                            v60 = qword_180117288;
                                                                                                                                                          }
                                                                                                                                                          sub_180026930(a1, qword_180117100, v60, v87[0]);
                                                                                                                                                          v62 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                          v63 = *(_QWORD *)a1;
                                                                                                                                                          if ( v62 != 0 )
                                                                                                                                                          {
                                                                                                                                                            v64 = (*(__int64 (__fastcall **)(__int64))(v63 + 120))(a1);
                                                                                                                                                            (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 136LL))(a1);
                                                                                                                                                            v87[0] = v64;
                                                                                                                                                            v80 = v64;
                                                                                                                                                            sub_180026960(v77, &v71, &v80, &v80);
LABEL_538:
                                                                                                                                                            if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 256LL))(a1, v87[0], qword_1801170F8) == 0 )
                                                                                                                                                            {
                                                                                                                                                              result = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v87[0]);
                                                                                                                                                              break;
                                                                                                                                                            }
                                                                                                                                                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                            if ( (_BYTE)result == 0 )
                                                                                                                                                            {
                                                                                                                                                              sub_180026DB0(&v71, v87);
                                                                                                                                                              sub_180026DB0(&v71, &v74);
                                                                                                                                                              sub_180026DB0(&v71, &v75);
                                                                                                                                                              sub_180026DB0(&v71, &v76);
                                                                                                                                                              sub_180026DB0(&v71, &v81);
                                                                                                                                                              sub_180026DB0(&v71, &v79);
                                                                                                                                                              sub_180002660(a1, &v71);
                                                                                                                                                              if ( qword_180117100 != 0 && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117100, 0) == 0 )
                                                                                                                                                                goto LABEL_574;
                                                                                                                                                              sub_1800C68B0(&unk_180117030);
                                                                                                                                                              if ( qword_180117100 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180117100, 0) != 0 )
                                                                                                                                                              {
                                                                                                                                                                v65 = sub_1800023C0(a1);
                                                                                                                                                                if ( v65 != 0 )
                                                                                                                                                                {
                                                                                                                                                                  qword_180117100 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v65);
                                                                                                                                                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v65);
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                              sub_1800C6900(&unk_180117030);
                                                                                                                                                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                              if ( (_BYTE)result == 0 )
                                                                                                                                                              {
LABEL_574:
                                                                                                                                                                if ( qword_1801171C8 != 0 || (qword_1801171C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(a1, qword_180117100, /*0xa5*/ "a", /*0x263*/ "(Ljava/lang/MatchException;)Ljava/lang/MatchException;"), (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
                                                                                                                                                                {
                                                                                                                                                                  v87[0] = sub_180002760(a1);
                                                                                                                                                                  sub_1800036C0((__int64)v77, (float *)&v71, v87, v87);
                                                                                                                                                                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                                  if ( (_BYTE)result == 0 )
                                                                                                                                                                  {
                                                                                                                                                                    v66 = v87[0];
                                                                                                                                                                    if ( v87[0] != 0 )
                                                                                                                                                                    {
                                                                                                                                                                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 104LL))(a1, v87[0]);
                                                                                                                                                                      v80 = v66;
                                                                                                                                                                      sub_180026960(v77, &v71, &v80, &v80);
                                                                                                                                                                    }
                                                                                                                                                                    else
                                                                                                                                                                    {
                                                                                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x29a*/ "ATHROW npe", 0xFFFFFFFFLL);
                                                                                                                                                                    }
                                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                                    goto LABEL_556;
                                                                                                                                                                  }
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                          }
                                                                                                                                                          result = (*(__int64 (__fastcall **)(__int64))(v63 + 1824))(a1);
LABEL_556:
                                                                                                                                                          if ( (_BYTE)result != 0 )
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                        if ( (_BYTE)result == 0 )
                                                                                                                                                        {
                                                                                                                                                          sub_180026DB0(&v71, &v74);
                                                                                                                                                          sub_180026DB0(&v71, &v75);
                                                                                                                                                          sub_180026DB0(&v71, &v76);
                                                                                                                                                          sub_180026DB0(&v71, &v81);
                                                                                                                                                          sub_180026DB0(&v71, &v79);
                                                                                                                                                          result = sub_180002660(a1, &v71);
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                      }
                                                                                                                                                    }
                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                    if ( (_BYTE)result == 0 )
                                                                                                                                                    {
                                                                                                                                                      sub_180026DB0(&v71, &v74);
                                                                                                                                                      sub_180026DB0(&v71, &v75);
                                                                                                                                                      sub_180026DB0(&v71, &v76);
                                                                                                                                                      sub_180026DB0(&v71, &v81);
                                                                                                                                                      sub_180026DB0(&v71, &v79);
                                                                                                                                                      sub_180002660(a1, &v71);
                                                                                                                                                      v87[0] = v75;
                                                                                                                                                      sub_1800036C0((__int64)v77, (float *)&v71, v87, v87);
                                                                                                                                                      LODWORD(v82) = v78;
                                                                                                                                                      v78 += 8;
                                                                                                                                                      LODWORD(v83) = v78;
                                                                                                                                                      if ( qword_1801171B0 != 0 && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801171B0, 0) == 0 )
                                                                                                                                                        goto LABEL_576;
                                                                                                                                                      sub_1800C68B0(&unk_1801170E0);
                                                                                                                                                      if ( qword_1801171B0 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801171B0, 0) != 0 )
                                                                                                                                                      {
                                                                                                                                                        v51 = sub_1800023C0(a1);
                                                                                                                                                        if ( v51 != 0 )
                                                                                                                                                        {
                                                                                                                                                          qword_1801171B0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v51);
                                                                                                                                                          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v51);
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                      sub_1800C6900(&unk_1801170E0);
                                                                                                                                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                      if ( (_BYTE)result == 0 )
                                                                                                                                                      {
LABEL_576:
                                                                                                                                                        if ( qword_180117268 != 0 || (qword_180117268 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(a1, qword_1801171B0, /*0x6b0*/ "substring", /*0x6ba*/ "(II)Ljava/lang/String;"), (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
                                                                                                                                                        {
                                                                                                                                                          if ( v87[0] != 0 )
                                                                                                                                                          {
                                                                                                                                                            v87[0] = sub_180002790(a1);
                                                                                                                                                            sub_1800036C0((__int64)v77, (float *)&v71, v87, v87);
                                                                                                                                                          }
                                                                                                                                                          else
                                                                                                                                                          {
                                                                                                                                                            sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 0xFFFFFFFFLL);
                                                                                                                                                          }
                                                                                                                                                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                          if ( (_BYTE)result == 0 )
                                                                                                                                                          {
                                                                                                                                                            v82 = qword_180117008;
                                                                                                                                                            if ( qword_1801171B0 != 0 && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801171B0, 0) == 0 )
                                                                                                                                                              goto LABEL_577;
                                                                                                                                                            sub_1800C68B0(&unk_1801170E0);
                                                                                                                                                            if ( qword_1801171B0 == 0 || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_1801171B0, 0) != 0 )
                                                                                                                                                            {
                                                                                                                                                              v52 = sub_1800023C0(a1);
                                                                                                                                                              if ( v52 != 0 )
                                                                                                                                                              {
                                                                                                                                                                qword_1801171B0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v52);
                                                                                                                                                                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v52);
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                            sub_1800C6900(&unk_1801170E0);
                                                                                                                                                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                            if ( (_BYTE)result == 0 )
                                                                                                                                                            {
LABEL_577:
                                                                                                                                                              if ( qword_180117270 != 0 || (qword_180117270 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(a1, qword_1801171B0, /*0x6d1*/ "getBytes", /*0x6da*/ "(Ljava/lang/String;)[B"), (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
                                                                                                                                                              {
                                                                                                                                                                if ( v87[0] != 0 )
                                                                                                                                                                {
                                                                                                                                                                  v87[0] = sub_180002790(a1);
                                                                                                                                                                  sub_1800036C0((__int64)v77, (float *)&v71, v87, v87);
                                                                                                                                                                }
                                                                                                                                                                else
                                                                                                                                                                {
                                                                                                                                                                  sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 0xFFFFFFFFLL);
                                                                                                                                                                }
                                                                                                                                                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                                if ( (_BYTE)result == 0 )
                                                                                                                                                                {
                                                                                                                                                                  v81 = v87[0];
                                                                                                                                                                  sub_1800036C0((__int64)v77, (float *)&v71, v87, v87);
                                                                                                                                                                  v87[0] = v76;
                                                                                                                                                                  sub_1800036C0((__int64)v77, (float *)&v71, v87, v87);
                                                                                                                                                                  LODWORD(v82) = v69;
                                                                                                                                                                  v83 = v81;
                                                                                                                                                                  sub_1800036C0((__int64)v77, (float *)&v71, (__int64 *)&v83, &v83);
                                                                                                                                                                  LODWORD(v84) = 0;
                                                                                                                                                                  if ( v83 != 0 )
                                                                                                                                                                    LODWORD(v83) = (char)sub_180002530(a1, v83, 0);
                                                                                                                                                                  else
                                                                                                                                                                    sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                                                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                                  if ( (_BYTE)result == 0 )
                                                                                                                                                                  {
                                                                                                                                                                    v83 = (unsigned __int64)(unsigned int)v83 << 56;
                                                                                                                                                                    v86 = v81;
                                                                                                                                                                    sub_1800036C0((__int64)v77, (float *)&v71, &v86, &v86);
                                                                                                                                                                    LODWORD(v85) = 1;
                                                                                                                                                                    if ( v86 != 0 )
                                                                                                                                                                      LODWORD(v86) = (char)sub_180002530(a1, v86, 1);
                                                                                                                                                                    else
                                                                                                                                                                      sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                                    if ( (_BYTE)result == 0 )
                                                                                                                                                                    {
                                                                                                                                                                      v83 |= (unsigned __int64)(unsigned __int8)v86 << 48;
                                                                                                                                                                      v86 = v81;
                                                                                                                                                                      sub_1800036C0((__int64)v77, (float *)&v71, &v86, &v86);
                                                                                                                                                                      LODWORD(v85) = 2;
                                                                                                                                                                      if ( v86 != 0 )
                                                                                                                                                                        LODWORD(v86) = (char)sub_180002530(a1, v86, 2);
                                                                                                                                                                      else
                                                                                                                                                                        sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                                      if ( (_BYTE)result == 0 )
                                                                                                                                                                      {
                                                                                                                                                                        v83 |= (unsigned __int64)(unsigned __int8)v86 << 40;
                                                                                                                                                                        v86 = v81;
                                                                                                                                                                        sub_1800036C0((__int64)v77, (float *)&v71, &v86, &v86);
                                                                                                                                                                        LODWORD(v85) = 3;
                                                                                                                                                                        if ( v86 != 0 )
                                                                                                                                                                          LODWORD(v86) = (char)sub_180002530(a1, v86, 3);
                                                                                                                                                                        else
                                                                                                                                                                          sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                                        if ( (_BYTE)result == 0 )
                                                                                                                                                                        {
                                                                                                                                                                          v83 |= (unsigned __int64)(unsigned __int8)v86 << 32;
                                                                                                                                                                          v86 = v81;
                                                                                                                                                                          sub_1800036C0((__int64)v77, (float *)&v71, &v86, &v86);
                                                                                                                                                                          LODWORD(v85) = 4;
                                                                                                                                                                          if ( v86 != 0 )
                                                                                                                                                                            LODWORD(v86) = (char)sub_180002530(a1, v86, 4);
                                                                                                                                                                          else
                                                                                                                                                                            sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                                                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                                          if ( (_BYTE)result == 0 )
                                                                                                                                                                          {
                                                                                                                                                                            v83 |= (unsigned int)((_DWORD)v86 << 24);
                                                                                                                                                                            v86 = v81;
                                                                                                                                                                            sub_1800036C0((__int64)v77, (float *)&v71, &v86, &v86);
                                                                                                                                                                            LODWORD(v85) = 5;
                                                                                                                                                                            if ( v86 != 0 )
                                                                                                                                                                              LODWORD(v86) = (char)sub_180002530(a1, v86, 5);
                                                                                                                                                                            else
                                                                                                                                                                              sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                                                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                                            if ( (_BYTE)result == 0 )
                                                                                                                                                                            {
                                                                                                                                                                              v83 |= (unsigned __int8)v86 << 16;
                                                                                                                                                                              v86 = v81;
                                                                                                                                                                              sub_1800036C0((__int64)v77, (float *)&v71, &v86, &v86);
                                                                                                                                                                              LODWORD(v85) = 6;
                                                                                                                                                                              if ( v86 != 0 )
                                                                                                                                                                                LODWORD(v86) = (char)sub_180002530(a1, v86, 6);
                                                                                                                                                                              else
                                                                                                                                                                                sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                                                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                                              if ( (_BYTE)result == 0 )
                                                                                                                                                                              {
                                                                                                                                                                                v83 |= (unsigned __int16)((_WORD)v86 << 8);
                                                                                                                                                                                v86 = v81;
                                                                                                                                                                                sub_1800036C0((__int64)v77, (float *)&v71, &v86, &v86);
                                                                                                                                                                                LODWORD(v85) = 7;
                                                                                                                                                                                if ( v86 != 0 )
                                                                                                                                                                                  LODWORD(v86) = (char)sub_180002530(a1, v86, 7);
                                                                                                                                                                                else
                                                                                                                                                                                  sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x6f1*/ "BALOAD npe", 0xFFFFFFFFLL);
                                                                                                                                                                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                                                                                                                                                                                ++v69;
                                                                                                                                                                                v43 = 0;
                                                                                                                                                                                if ( (_BYTE)result == 0 )
                                                                                                                                                                                  continue;
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
                                                                                                                                                    break;
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
LABEL_92:
        v18 = (_QWORD *)v72;
        if ( (_QWORD)v72 != 0 )
        {
          do
          {
            v19 = (_QWORD *)*v18;
            result = sub_1800C0DC0(v18);
            v18 = v19;
          }
          while ( v19 != nullptr );
        }
        v20 = v71;
        *(_QWORD *)&v71 = 0;
        if ( v20 != 0 )
          return sub_1800C0DC0(v20);
      }
    }
    else
    {
      return (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 144LL /*Throw/FatalError*/))(a1, /*0x8*/ "classloader == null");
    }
  }
  return result;
}
