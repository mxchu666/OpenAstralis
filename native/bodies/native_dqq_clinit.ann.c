__int64 __fastcall sub_180002B00(__int64 a1, __int64 a2, __int64 a3)
{
  __int64 v5; // rdi
  __int64 result; // rax
  __int64 v7; // rbx
  __int64 v8; // rbx
  __int64 v9; // rbx
  __int64 v10; // rbx
  __int64 v11; // rdi
  __int64 v12; // r8
  _QWORD *v13; // rcx
  _QWORD *v14; // rsi
  __int64 v15; // rcx
  _BYTE v16[16]; // [rsp+30h] [rbp-40h] BYREF
  __int128 v17; // [rsp+40h] [rbp-30h] BYREF
  __int128 v18; // [rsp+50h] [rbp-20h]
  int v19; // [rsp+60h] [rbp-10h]
  __int64 v20; // [rsp+68h] [rbp-8h] BYREF
  _QWORD v21[4]; // [rsp+70h] [rbp+0h] BYREF

  (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1);
  v5 = sub_1800025D0(a1, a3);
  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
  if ( (_BYTE)result != 0 )
    return result;
  if ( v5 == 0 )
    return (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 144LL /*Throw/FatalError*/))(a1, /*0x8*/ "classloader == null");
  v21[0] = 0;
  v18 = 0;
  v17 = 0;
  v19 = 1065353216;
  v20 = 0x8DA1C30C8176074DuLL;
  if ( qword_180116EA0 != 0
    && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180116EA0, 0) == 0 )
  {
    goto LABEL_72;
  }
  sub_1800C68B0(&unk_180116E70);
  if ( qword_180116EA0 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(a1, qword_180116EA0, 0) != 0 )
  {
    v7 = sub_1800023C0(a1, v5, qword_180116E40);
    if ( v7 != 0 )
    {
      qword_180116EA0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v7);
      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v7);
    }
  }
  sub_1800C6900(&unk_180116E70);
  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
  if ( (_BYTE)result == 0 )
  {
LABEL_72:
    if ( qword_180116ED0 != 0
      || (qword_180116ED0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                              a1,
                              qword_180116EA0,
                              /*0x1c*/ "lookup",
                              /*0x23*/ "()Ljava/lang/invoke/MethodHandles$Lookup;"),
          (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
    {
      v21[0] = sub_180002760(a1, qword_180116EA0);
      sub_1800036C0(v16, &v17, v21, v21);
      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
      if ( (_BYTE)result == 0 )
      {
        if ( qword_180116EA8 != 0
          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
               a1,
               qword_180116EA8,
               0) == 0 )
        {
          goto LABEL_73;
        }
        sub_1800C68B0(&unk_180116E78);
        if ( qword_180116EA8 == 0
          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
               a1,
               qword_180116EA8,
               0) != 0 )
        {
          v8 = sub_1800023C0(a1, v5, qword_180116E48);
          if ( v8 != 0 )
          {
            qword_180116EA8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v8);
            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v8);
          }
        }
        sub_1800C6900(&unk_180116E78);
        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
        if ( (_BYTE)result == 0 )
        {
LABEL_73:
          if ( qword_180116ED8 != 0
            || (qword_180116ED8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                    a1,
                                    qword_180116EA8,
                                    /*0x4d*/ "lookupClass",
                                    /*0x59*/ "()Ljava/lang/Class;"),
                (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
          {
            if ( v21[0] != 0 )
            {
              v21[0] = sub_180002790(a1, v21[0], qword_180116ED8);
              sub_1800036C0(v16, &v17, v21, v21);
            }
            else
            {
              sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0x8c*/ "INVOKEVIRTUAL Object npe", 0xFFFFFFFFLL);
            }
            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
            if ( (_BYTE)result == 0 )
            {
              if ( qword_180116EB0 != 0
                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                     a1,
                     qword_180116EB0,
                     0) == 0 )
              {
                goto LABEL_74;
              }
              sub_1800C68B0(&unk_180116E80);
              if ( qword_180116EB0 == 0
                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                     a1,
                     qword_180116EB0,
                     0) != 0 )
              {
                v9 = sub_1800023C0(a1, v5, qword_180116E50);
                if ( v9 != 0 )
                {
                  qword_180116EB0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(a1, v9);
                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v9);
                }
              }
              sub_1800C6900(&unk_180116E80);
              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
              if ( (_BYTE)result == 0 )
              {
LABEL_74:
                if ( qword_180116EE0 != 0
                  || (qword_180116EE0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL /*GetStaticMethodID*/))(
                                          a1,
                                          qword_180116EB0,
                                          /*0xa5*/ "a",
                                          /*0xa7*/ "(JJLjava/lang/Object;)Lcc/astralis/bga;"),
                      (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
                {
                  v20 = sub_180002760(a1, qword_180116EB0);
                  sub_1800036C0(v16, &v17, &v20, &v20);
                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                  if ( (_BYTE)result == 0 )
                  {
                    if ( qword_180116EB8 != 0
                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                           a1,
                           qword_180116EB8,
                           0) == 0 )
                    {
                      goto LABEL_75;
                    }
                    sub_1800C68B0(&unk_180116E88);
                    if ( qword_180116EB8 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                           a1,
                           qword_180116EB8,
                           0) != 0 )
                    {
                      v10 = sub_1800023C0(a1, v5, qword_180116E58);
                      if ( v10 != 0 )
                      {
                        qword_180116EB8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                            a1,
                                            v10);
                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v10);
                      }
                    }
                    sub_1800C6900(&unk_180116E88);
                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                    if ( (_BYTE)result == 0 )
                    {
LABEL_75:
                      if ( qword_180116EE8 != 0
                        || (qword_180116EE8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL /*GetFieldID*/))(
                                                a1,
                                                qword_180116EB8,
                                                /*0xa5*/ "a",
                                                /*0xcf*/ "(J)J"),
                            (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1)) == 0) )
                      {
                        if ( v20 != 0 )
                          v20 = sub_180003690(a1, v20, qword_180116EE8, 0xA6E832598399LL);
                        else
                          sub_180002110(a1, /*0x6d*/ "java/lang/NullPointerException", /*0xd4*/ "INVOKEINTERFACE Long npe", 0xFFFFFFFFLL);
                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                        if ( (_BYTE)result == 0 )
                        {
                          if ( qword_180116EC0 != 0
                            && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                 a1,
                                 qword_180116EC0,
                                 0) == 0 )
                          {
                            goto LABEL_62;
                          }
                          sub_1800C68B0(&unk_180116E90);
                          if ( qword_180116EC0 == 0
                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL /*ExceptionCheck*/))(
                                 a1,
                                 qword_180116EC0,
                                 0) != 0 )
                          {
                            v11 = sub_1800023C0(a1, v5, qword_180116E60);
                            if ( v11 != 0 )
                            {
                              qword_180116EC0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL /*NewGlobalRef(id)*/))(
                                                  a1,
                                                  v11);
                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL /*DeleteLocalRef*/))(a1, v11);
                            }
                          }
                          sub_1800C6900(&unk_180116E90);
                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                          if ( (_BYTE)result == 0 )
                          {
LABEL_62:
                            v12 = qword_180116EF0;
                            if ( qword_180116EF0 == 0 )
                            {
                              qword_180116EF0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL /*GetMethodID*/))(
                                                  a1,
                                                  qword_180116EC0,
                                                  /*0xa5*/ "a",
                                                  /*0xed*/ "J");
                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
                              if ( (_BYTE)result != 0 )
                                goto LABEL_65;
                              v12 = qword_180116EF0;
                            }
                            (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1280LL))(
                              a1,
                              qword_180116EC0,
                              v12,
                              v20);
                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL /*ExceptionCheck*/))(a1);
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
LABEL_65:
  v13 = (_QWORD *)v18;
  if ( (_QWORD)v18 != 0 )
  {
    do
    {
      v14 = (_QWORD *)*v13;
      result = sub_1800C0DC0();
      v13 = v14;
    }
    while ( v14 != nullptr );
  }
  v15 = v17;
  *(_QWORD *)&v17 = 0;
  if ( v15 != 0 )
    return sub_1800C0DC0();
  return result;
}
