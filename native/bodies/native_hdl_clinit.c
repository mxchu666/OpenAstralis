__int64 __fastcall sub_1800B9370(__int64 a1, __int64 a2, __int64 a3)
{
  __int64 v5; // rdi
  __int64 result; // rax
  __int64 v7; // rbx
  __int64 v8; // rbx
  __int64 v9; // r8
  __int64 v10; // r9
  __int64 v11; // rbx
  _QWORD *v12; // rcx
  _QWORD *v13; // rsi
  __int64 v14; // rcx
  int v15; // r12d
  int v16; // ebx
  int v17; // r12d
  __int64 v18; // r15
  int v19; // ecx
  __int64 v20; // rax
  __int64 v21; // rcx
  __int64 v22; // r15
  __int64 v23; // r15
  __int64 v24; // rax
  __int64 (__fastcall *v25)(__int64); // rax
  __int64 v26; // r9
  __int64 v27; // r8
  __int64 v28; // r9
  __int64 v29; // r8
  int v30; // r13d
  __int64 v31; // r9
  __int64 v32; // r15
  int v33; // r13d
  __int64 v34; // r15
  __int64 v35; // r15
  __int64 v36; // r15
  __int64 v37; // rbx
  __int64 v38; // r8
  __int64 v39; // r9
  __int64 v40; // rbx
  int v41; // r12d
  __int64 v42; // rbx
  __int64 v43; // rbx
  unsigned int v44; // ecx
  __int64 (__fastcall *v45)(__int64); // rax
  __int64 v46; // r9
  __int64 v47; // rbx
  __int64 v48; // rbx
  __int64 v49; // rbx
  __int64 v50; // rbx
  __int64 v51; // r8
  __int64 v52; // rbx
  __int64 v53; // rdi
  __int64 v54; // r8
  unsigned __int64 v55; // [rsp+20h] [rbp-60h]
  __int128 v56; // [rsp+30h] [rbp-50h] BYREF
  __int128 v57; // [rsp+40h] [rbp-40h]
  int v58; // [rsp+50h] [rbp-30h]
  __int64 v59; // [rsp+60h] [rbp-20h] BYREF
  __int64 v60; // [rsp+68h] [rbp-18h] BYREF
  __int64 v61; // [rsp+70h] [rbp-10h]
  int v62; // [rsp+7Ch] [rbp-4h]
  __int64 v63; // [rsp+80h] [rbp+0h] BYREF
  __int64 v64; // [rsp+88h] [rbp+8h] BYREF
  _BYTE v65[16]; // [rsp+90h] [rbp+10h] BYREF
  __int64 v66; // [rsp+A0h] [rbp+20h] BYREF
  unsigned __int64 v67; // [rsp+A8h] [rbp+28h] BYREF
  unsigned __int64 v68; // [rsp+B0h] [rbp+30h] BYREF
  __int64 v69; // [rsp+B8h] [rbp+38h] BYREF
  __int64 v70[8]; // [rsp+C0h] [rbp+40h] BYREF

  (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 184LL))(a1);
  v5 = sub_1800025D0(a1, a3);
  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
  if ( (_BYTE)result != 0 )
    return result;
  if ( v5 == 0 )
    return (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 144LL))(a1, qword_1801178A0 + 8);
  v70[0] = 32;
  v68 = 0;
  v67 = 0;
  v69 = 0;
  v59 = 0;
  v60 = 0;
  v66 = 0;
  v64 = 0;
  v63 = 0;
  v57 = 0;
  v56 = 0;
  v58 = 1065353216;
  if ( qword_180117E70 != 0
    && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(a1, qword_180117E70, 0) == 0 )
  {
    goto LABEL_365;
  }
  sub_1800C68B0(&unk_180117C60);
  if ( qword_180117E70 == 0
    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(a1, qword_180117E70, 0) != 0 )
  {
    v7 = sub_1800023C0(a1);
    if ( v7 != 0 )
    {
      qword_180117E70 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v7);
      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v7);
    }
  }
  sub_1800C6900(&unk_180117C60);
  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
  if ( (_BYTE)result == 0 )
  {
LABEL_365:
    v70[0] = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, _QWORD))(*(_QWORD *)a1 + 1376LL))(
               a1,
               LODWORD(v70[0]),
               qword_180117E70,
               0);
    sub_1800036C0((__int64)v65, (float *)&v56, v70, v70);
    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
    if ( (_BYTE)result == 0 )
    {
      v63 = v70[0];
      sub_1800036C0((__int64)v65, (float *)&v56, v70, v70);
      LODWORD(v70[0]) = 0;
      LODWORD(v68) = 0;
      if ( qword_180117D40 != 0
        && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(a1, qword_180117D40, 0) == 0 )
      {
        goto LABEL_21;
      }
      sub_1800C68B0(&unk_180117B30);
      if ( qword_180117D40 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(a1, qword_180117D40, 0) != 0 )
      {
        v8 = sub_1800023C0(a1);
        if ( v8 != 0 )
        {
          qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v8);
          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v8);
        }
      }
      sub_1800C6900(&unk_180117B30);
      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
      if ( (_BYTE)result == 0 )
      {
LABEL_21:
        v9 = qword_1801182C0;
        if ( qword_1801182C0 != 0 )
        {
LABEL_22:
          sub_180026930(a1, qword_180117D40, v9, LODWORD(v70[0]));
          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
          if ( (_BYTE)result == 0 )
          {
            v70[0] = qword_180117AF0;
            v68 = qword_180117AF0;
            v64 = qword_180117AF0;
            sub_1800036C0((__int64)v65, (float *)&v56, (__int64 *)&v68, &v68);
            if ( qword_180117E70 != 0
              && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                   a1,
                   qword_180117E70,
                   0) == 0 )
            {
              goto LABEL_375;
            }
            sub_1800C68B0(&unk_180117C60);
            if ( qword_180117E70 == 0
              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                   a1,
                   qword_180117E70,
                   0) != 0 )
            {
              v11 = sub_1800023C0(a1);
              if ( v11 != 0 )
              {
                qword_180117E70 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v11);
                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v11);
              }
            }
            sub_1800C6900(&unk_180117C60);
            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
            if ( (_BYTE)result == 0 )
            {
LABEL_375:
              if ( qword_1801182C8 != 0
                || (qword_1801182C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                        a1,
                                        qword_180117E70,
                                        qword_1801178A0 + 1679,
                                        qword_1801178A0 + 1686),
                    (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1)) == 0) )
              {
                if ( v70[0] != 0 )
                  LODWORD(v70[0]) = sub_180026900(a1, v70[0], qword_1801182C8, v10);
                else
                  sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 1690, 0xFFFFFFFFLL);
                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                if ( (_BYTE)result == 0 )
                {
                  v62 = v70[0];
                  LODWORD(v70[0]) = -1;
                  v15 = -1;
                  v16 = 22;
                  v61 = 0;
LABEL_44:
                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                  if ( (_BYTE)result == 0 )
                  {
                    sub_180026DB0(&v56, &v64);
                    sub_180026DB0(&v56, &v63);
                    sub_180002660(a1, &v56);
                    LODWORD(v70[0]) = 28;
                    v68 = v64;
                    sub_1800036C0((__int64)v65, (float *)&v56, (__int64 *)&v68, &v68);
                    v17 = v15 + 1;
                    LODWORD(v67) = v17;
                    LODWORD(v69) = v16;
                    if ( qword_180117E70 != 0
                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117E70,
                           0) == 0 )
                    {
                      goto LABEL_366;
                    }
                    sub_1800C68B0(&unk_180117C60);
                    if ( qword_180117E70 == 0
                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                           a1,
                           qword_180117E70,
                           0) != 0 )
                    {
                      v18 = sub_1800023C0(a1);
                      if ( v18 != 0 )
                      {
                        qword_180117E70 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                            a1,
                                            v18);
                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v18);
                      }
                    }
                    sub_1800C6900(&unk_180117C60);
                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                    if ( (_BYTE)result == 0 )
                    {
LABEL_366:
                      if ( qword_1801182D0 != 0
                        || (qword_1801182D0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                                a1,
                                                qword_180117E70,
                                                qword_1801178A0 + 1712,
                                                qword_1801178A0 + 1722),
                            (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1)) == 0) )
                      {
                        if ( v68 != 0 )
                        {
                          v68 = sub_180002790(a1);
                          sub_1800036C0((__int64)v65, (float *)&v56, (__int64 *)&v68, &v68);
                        }
                        else
                        {
                          sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 140, 0xFFFFFFFFLL);
                        }
                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                        if ( (_BYTE)result == 0 )
                        {
                          v19 = -1;
                          while ( 1 )
                          {
                            LODWORD(v67) = v19;
                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                            if ( (_BYTE)result != 0 )
                              break;
                            sub_180026DB0(&v56, &v68);
                            sub_180026DB0(&v56, &v64);
                            sub_180026DB0(&v56, &v63);
                            sub_180002660(a1, &v56);
                            v20 = v68;
                            v68 = v70[0];
                            v21 = v67;
                            v67 = v20;
                            v70[0] = v21;
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
                                v22 = sub_1800023C0(a1);
                                if ( v22 != 0 )
                                {
                                  qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                      a1,
                                                      v22);
                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v22);
                                }
                              }
                              sub_1800C6900(&unk_180117B30);
                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                              if ( (_BYTE)result != 0 )
                                break;
                            }
                            if ( qword_1801182E0 == 0 )
                            {
                              qword_1801182E0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                                  a1,
                                                  qword_180117D40,
                                                  qword_1801178A0 + 165,
                                                  qword_1801178A0 + 3480);
                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                              if ( (_BYTE)result != 0 )
                                break;
                            }
                            v67 = sub_180002760(a1);
                            sub_1800036C0((__int64)v65, (float *)&v56, (__int64 *)&v67, &v67);
                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                            if ( (_BYTE)result != 0 )
                              break;
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
                                v23 = sub_1800023C0(a1);
                                if ( v23 != 0 )
                                {
                                  qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                      a1,
                                                      v23);
                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v23);
                                }
                              }
                              sub_1800C6900(&unk_180117B30);
                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                              if ( (_BYTE)result != 0 )
                                break;
                            }
                            if ( qword_1801182E8 == 0 )
                            {
                              qword_1801182E8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                                                  a1,
                                                  qword_180117D40,
                                                  qword_1801178A0 + 165,
                                                  qword_1801178A0 + 3503);
                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                              if ( (_BYTE)result != 0 )
                                break;
                            }
                            v55 = v67;
                            v68 = sub_180002760(a1);
                            sub_1800036C0((__int64)v65, (float *)&v56, (__int64 *)&v68, &v68);
                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                            if ( (_BYTE)result != 0 )
                              break;
                            v24 = v68;
                            v68 = v70[0];
                            v70[0] = v24;
                            v25 = *(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL);
                            if ( (_DWORD)v68 != 0 )
                            {
                              result = v25(a1);
                              if ( (_BYTE)result != 0 )
                                goto LABEL_39;
                              sub_180026DB0(&v56, v70);
                              sub_180026DB0(&v56, &v64);
                              sub_180026DB0(&v56, &v63);
                              sub_180002660(a1, &v56);
                              v68 = v63;
                              sub_1800036C0((__int64)v65, (float *)&v56, (__int64 *)&v68, &v68);
                              v26 = v70[0];
                              v70[0] = v68;
                              LODWORD(v67) = v61;
                              v27 = v67;
                              v67 = v26;
                              v68 = v27;
                              if ( v70[0] != 0 )
                                (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 1392LL))(a1);
                              else
                                sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 2774, 0xFFFFFFFFLL);
                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                              if ( (_BYTE)result != 0 )
                                goto LABEL_39;
                              LODWORD(v70[0]) = v16 + v17;
                              v30 = v16 + v17;
                              v68 = __PAIR64__(HIDWORD(v70[0]), v62);
                              if ( v16 + v17 < v62 )
                              {
                                v70[0] = v64;
                                sub_1800036C0((__int64)v65, (float *)&v56, v70, v70);
                                LODWORD(v68) = v16 + v17;
                                if ( qword_180117E70 != 0
                                  && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                       a1,
                                       qword_180117E70,
                                       0) == 0 )
                                {
                                  goto LABEL_367;
                                }
                                sub_1800C68B0(&unk_180117C60);
                                if ( qword_180117E70 == 0
                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                       a1,
                                       qword_180117E70,
                                       0) != 0 )
                                {
                                  v36 = sub_1800023C0(a1);
                                  if ( v36 != 0 )
                                  {
                                    qword_180117E70 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1
                                                                                                  + 1808LL))(
                                                        a1,
                                                        v36);
                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v36);
                                  }
                                }
                                sub_1800C6900(&unk_180117C60);
                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                if ( (_BYTE)result == 0 )
                                {
LABEL_367:
                                  if ( qword_1801182D8 != 0
                                    || (qword_1801182D8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, unsigned __int64))(*(_QWORD *)a1 + 264LL))(
                                                            a1,
                                                            qword_180117E70,
                                                            qword_1801178A0 + 3387,
                                                            qword_1801178A0 + 3394,
                                                            v55),
                                        (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1)) == 0) )
                                  {
                                    if ( v70[0] != 0 )
                                      LODWORD(v70[0]) = (unsigned __int16)sub_18006C830(
                                                                            a1,
                                                                            v70[0],
                                                                            qword_1801182D8,
                                                                            (unsigned int)v68);
                                    else
                                      sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 3399, 0xFFFFFFFFLL);
                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                    if ( (_BYTE)result == 0 )
                                    {
                                      v61 = (unsigned int)(v61 + 1);
                                      v16 = v70[0];
                                      v15 = v30;
                                      goto LABEL_44;
                                    }
                                  }
                                }
                                goto LABEL_39;
                              }
                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                              if ( (_BYTE)result != 0 )
                                goto LABEL_39;
                              sub_180026DB0(&v56, &v64);
                              sub_180026DB0(&v56, &v63);
                              sub_180002660(a1, &v56);
                              v70[0] = qword_180117AF8;
                              v68 = qword_180117AF8;
                              v64 = qword_180117AF8;
                              sub_1800036C0((__int64)v65, (float *)&v56, (__int64 *)&v68, &v68);
                              if ( qword_180117E70 == 0
                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                     a1,
                                     qword_180117E70,
                                     0) != 0 )
                              {
                                sub_1800C68B0(&unk_180117C60);
                                if ( qword_180117E70 == 0
                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                       a1,
                                       qword_180117E70,
                                       0) != 0 )
                                {
                                  v32 = sub_1800023C0(a1);
                                  if ( v32 != 0 )
                                  {
                                    qword_180117E70 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1
                                                                                                  + 1808LL))(
                                                        a1,
                                                        v32);
                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v32);
                                  }
                                }
                                sub_1800C6900(&unk_180117C60);
                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                if ( (_BYTE)result != 0 )
                                  goto LABEL_39;
                              }
                              if ( qword_1801182C8 == 0 )
                              {
                                qword_1801182C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, unsigned __int64))(*(_QWORD *)a1 + 264LL))(
                                                    a1,
                                                    qword_180117E70,
                                                    qword_1801178A0 + 1679,
                                                    qword_1801178A0 + 1686,
                                                    v55);
                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                if ( (_BYTE)result != 0 )
                                  goto LABEL_39;
                              }
                              if ( v70[0] != 0 )
                                LODWORD(v70[0]) = sub_180026900(a1, v70[0], qword_1801182C8, v31);
                              else
                                sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 1690, 0xFFFFFFFFLL);
                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                              if ( (_BYTE)result != 0 )
                                goto LABEL_39;
                              v62 = v70[0];
                              LODWORD(v70[0]) = -1;
                              v17 = 0;
                              v16 = 17;
                            }
                            else
                            {
                              result = v25(a1);
                              if ( (_BYTE)result != 0 )
                                goto LABEL_39;
                              sub_180026DB0(&v56, v70);
                              sub_180026DB0(&v56, &v64);
                              sub_180026DB0(&v56, &v63);
                              sub_180002660(a1, &v56);
                              v68 = v63;
                              sub_1800036C0((__int64)v65, (float *)&v56, (__int64 *)&v68, &v68);
                              v28 = v70[0];
                              v70[0] = v68;
                              LODWORD(v67) = v61;
                              v29 = v67;
                              v67 = v28;
                              v68 = v29;
                              if ( v70[0] != 0 )
                                (*(void (__fastcall **)(__int64))(*(_QWORD *)a1 + 1392LL))(a1);
                              else
                                sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 2774, 0xFFFFFFFFLL);
                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                              if ( (_BYTE)result != 0 )
                                goto LABEL_39;
                              LODWORD(v70[0]) = v16 + v17;
                              v33 = v16 + v17;
                              v68 = __PAIR64__(HIDWORD(v70[0]), v62);
                              if ( v16 + v17 >= v62 )
                              {
                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                if ( (_BYTE)result == 0 )
                                {
                                  sub_180026DB0(&v56, &v64);
                                  sub_180026DB0(&v56, &v63);
                                  sub_180002660(a1, &v56);
                                  v70[0] = v63;
                                  sub_1800036C0((__int64)v65, (float *)&v56, v70, v70);
                                  if ( qword_180117D40 != 0
                                    && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                         a1,
                                         qword_180117D40,
                                         0) == 0 )
                                  {
                                    goto LABEL_159;
                                  }
                                  sub_1800C68B0(&unk_180117B30);
                                  if ( qword_180117D40 == 0
                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                         a1,
                                         qword_180117D40,
                                         0) != 0 )
                                  {
                                    v37 = sub_1800023C0(a1);
                                    if ( v37 != 0 )
                                    {
                                      qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                          a1,
                                                          v37);
                                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v37);
                                    }
                                  }
                                  sub_1800C6900(&unk_180117B30);
                                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                  if ( (_BYTE)result == 0 )
                                  {
LABEL_159:
                                    v38 = qword_180118300;
                                    if ( qword_180118300 == 0 )
                                    {
                                      qword_180118300 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, unsigned __int64))(*(_QWORD *)a1 + 1152LL))(
                                                          a1,
                                                          qword_180117D40,
                                                          qword_1801178A0 + 165,
                                                          qword_1801178A0 + 2622,
                                                          v55);
                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                      if ( (_BYTE)result != 0 )
                                        goto LABEL_39;
                                      v38 = qword_180118300;
                                    }
                                    (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1232LL))(
                                      a1,
                                      qword_180117D40,
                                      v38,
                                      v70[0]);
                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                    if ( (_BYTE)result == 0 )
                                    {
                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                      if ( (_BYTE)result == 0 )
                                      {
                                        sub_180026DB0(&v56, &v64);
                                        sub_180026DB0(&v56, &v63);
                                        sub_180002660(a1, &v56);
                                        v70[0] = 0x8BB0000000DLL;
                                        v70[0] = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1440LL))(
                                                   a1,
                                                   13);
                                        sub_1800036C0((__int64)v65, (float *)&v56, v70, v70);
                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                        if ( (_BYTE)result == 0 )
                                        {
                                          v60 = v70[0];
                                          sub_1800036C0((__int64)v65, (float *)&v56, v70, v70);
                                          v70[0] = qword_180117B00;
                                          v68 = qword_180117B00;
                                          v59 = qword_180117B00;
                                          sub_1800036C0((__int64)v65, (float *)&v56, (__int64 *)&v68, &v68);
                                          if ( qword_180117E70 != 0
                                            && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                 a1,
                                                 qword_180117E70,
                                                 0) == 0 )
                                          {
                                            goto LABEL_376;
                                          }
                                          sub_1800C68B0(&unk_180117C60);
                                          if ( qword_180117E70 == 0
                                            || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                 a1,
                                                 qword_180117E70,
                                                 0) != 0 )
                                          {
                                            v40 = sub_1800023C0(a1);
                                            if ( v40 != 0 )
                                            {
                                              qword_180117E70 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                                  a1,
                                                                  v40);
                                              (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(
                                                a1,
                                                v40);
                                            }
                                          }
                                          sub_1800C6900(&unk_180117C60);
                                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                          if ( (_BYTE)result == 0 )
                                          {
LABEL_376:
                                            if ( qword_1801182C8 != 0
                                              || (qword_1801182C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                                                      a1,
                                                                      qword_180117E70,
                                                                      qword_1801178A0 + 1679,
                                                                      qword_1801178A0 + 1686),
                                                  (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1)) == 0) )
                                            {
                                              if ( v70[0] != 0 )
                                                LODWORD(v70[0]) = sub_180026900(a1, v70[0], qword_1801182C8, v39);
                                              else
                                                sub_180002110(
                                                  a1,
                                                  qword_1801178A0 + 109,
                                                  qword_1801178A0 + 1690,
                                                  0xFFFFFFFFLL);
                                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                              if ( (_BYTE)result == 0 )
                                              {
                                                v62 = v70[0];
                                                LODWORD(v70[0]) = 0;
                                                v61 = 0;
                                                v41 = 0;
LABEL_180:
                                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                if ( (_BYTE)result == 0 )
                                                {
                                                  sub_180026DB0(&v56, &v59);
                                                  sub_180026DB0(&v56, &v60);
                                                  sub_180026DB0(&v56, &v64);
                                                  sub_180026DB0(&v56, &v63);
                                                  sub_180002660(a1, &v56);
                                                  v70[0] = v59;
                                                  sub_1800036C0((__int64)v65, (float *)&v56, v70, v70);
                                                  LODWORD(v68) = v41;
                                                  v41 += 8;
                                                  LODWORD(v67) = v41;
                                                  if ( qword_180117E70 != 0
                                                    && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                         a1,
                                                         qword_180117E70,
                                                         0) == 0 )
                                                  {
                                                    goto LABEL_368;
                                                  }
                                                  sub_1800C68B0(&unk_180117C60);
                                                  if ( qword_180117E70 == 0
                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                         a1,
                                                         qword_180117E70,
                                                         0) != 0 )
                                                  {
                                                    v42 = sub_1800023C0(a1);
                                                    if ( v42 != 0 )
                                                    {
                                                      qword_180117E70 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                                          a1,
                                                                          v42);
                                                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(
                                                        a1,
                                                        v42);
                                                    }
                                                  }
                                                  sub_1800C6900(&unk_180117C60);
                                                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                  if ( (_BYTE)result == 0 )
                                                  {
LABEL_368:
                                                    if ( qword_1801182D0 != 0
                                                      || (qword_1801182D0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                                                              a1,
                                                                              qword_180117E70,
                                                                              qword_1801178A0 + 1712,
                                                                              qword_1801178A0 + 1722),
                                                          (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1)) == 0) )
                                                    {
                                                      if ( v70[0] != 0 )
                                                      {
                                                        v70[0] = sub_180002790(a1);
                                                        sub_1800036C0((__int64)v65, (float *)&v56, v70, v70);
                                                      }
                                                      else
                                                      {
                                                        sub_180002110(
                                                          a1,
                                                          qword_1801178A0 + 109,
                                                          qword_1801178A0 + 140,
                                                          0xFFFFFFFFLL);
                                                      }
                                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1
                                                                                                  + 1824LL))(a1);
                                                      if ( (_BYTE)result == 0 )
                                                      {
                                                        v68 = qword_180117B08;
                                                        if ( qword_180117E70 != 0
                                                          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                               a1,
                                                               qword_180117E70,
                                                               0) == 0 )
                                                        {
                                                          goto LABEL_371;
                                                        }
                                                        sub_1800C68B0(&unk_180117C60);
                                                        if ( qword_180117E70 == 0
                                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                               a1,
                                                               qword_180117E70,
                                                               0) != 0 )
                                                        {
                                                          v43 = sub_1800023C0(a1);
                                                          if ( v43 != 0 )
                                                          {
                                                            qword_180117E70 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                                                a1,
                                                                                v43);
                                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(
                                                              a1,
                                                              v43);
                                                          }
                                                        }
                                                        sub_1800C6900(&unk_180117C60);
                                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                        if ( (_BYTE)result == 0 )
                                                        {
LABEL_371:
                                                          if ( qword_1801182F0 != 0
                                                            || (qword_1801182F0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                                                                    a1,
                                                                                    qword_180117E70,
                                                                                    qword_1801178A0 + 1745,
                                                                                    qword_1801178A0 + 1754),
                                                                (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1)) == 0) )
                                                          {
                                                            if ( v70[0] != 0 )
                                                            {
                                                              v70[0] = sub_180002790(a1);
                                                              sub_1800036C0((__int64)v65, (float *)&v56, v70, v70);
                                                            }
                                                            else
                                                            {
                                                              sub_180002110(
                                                                a1,
                                                                qword_1801178A0 + 109,
                                                                qword_1801178A0 + 140,
                                                                0xFFFFFFFFLL);
                                                            }
                                                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                            if ( (_BYTE)result == 0 )
                                                            {
                                                              v66 = v70[0];
                                                              sub_1800036C0((__int64)v65, (float *)&v56, v70, v70);
                                                              v70[0] = v60;
                                                              sub_1800036C0((__int64)v65, (float *)&v56, v70, v70);
                                                              LODWORD(v68) = v61;
                                                              v67 = v66;
                                                              sub_1800036C0(
                                                                (__int64)v65,
                                                                (float *)&v56,
                                                                (__int64 *)&v67,
                                                                &v67);
                                                              if ( v67 != 0 )
                                                                LODWORD(v67) = (char)sub_180002530(a1, v67, 0);
                                                              else
                                                                sub_180002110(
                                                                  a1,
                                                                  qword_1801178A0 + 109,
                                                                  qword_1801178A0 + 1777,
                                                                  0xFFFFFFFFLL);
                                                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                              if ( (_BYTE)result == 0 )
                                                              {
                                                                v67 = (unsigned __int64)(unsigned int)v67 << 56;
                                                                v69 = v66;
                                                                sub_1800036C0((__int64)v65, (float *)&v56, &v69, &v69);
                                                                if ( v69 != 0 )
                                                                  LODWORD(v69) = (char)sub_180002530(a1, v69, 1);
                                                                else
                                                                  sub_180002110(
                                                                    a1,
                                                                    qword_1801178A0 + 109,
                                                                    qword_1801178A0 + 1777,
                                                                    0xFFFFFFFFLL);
                                                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                if ( (_BYTE)result == 0 )
                                                                {
                                                                  v67 |= (unsigned __int64)(unsigned __int8)v69 << 48;
                                                                  v69 = v66;
                                                                  sub_1800036C0((__int64)v65, (float *)&v56, &v69, &v69);
                                                                  if ( v69 != 0 )
                                                                    LODWORD(v69) = (char)sub_180002530(a1, v69, 2);
                                                                  else
                                                                    sub_180002110(
                                                                      a1,
                                                                      qword_1801178A0 + 109,
                                                                      qword_1801178A0 + 1777,
                                                                      0xFFFFFFFFLL);
                                                                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                  if ( (_BYTE)result == 0 )
                                                                  {
                                                                    v67 |= (unsigned __int64)(unsigned __int8)v69 << 40;
                                                                    v69 = v66;
                                                                    sub_1800036C0(
                                                                      (__int64)v65,
                                                                      (float *)&v56,
                                                                      &v69,
                                                                      &v69);
                                                                    if ( v69 != 0 )
                                                                      LODWORD(v69) = (char)sub_180002530(a1, v69, 3);
                                                                    else
                                                                      sub_180002110(
                                                                        a1,
                                                                        qword_1801178A0 + 109,
                                                                        qword_1801178A0 + 1777,
                                                                        0xFFFFFFFFLL);
                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                    if ( (_BYTE)result == 0 )
                                                                    {
                                                                      v67 |= (unsigned __int64)(unsigned __int8)v69 << 32;
                                                                      v69 = v66;
                                                                      sub_1800036C0(
                                                                        (__int64)v65,
                                                                        (float *)&v56,
                                                                        &v69,
                                                                        &v69);
                                                                      if ( v69 != 0 )
                                                                        LODWORD(v69) = (char)sub_180002530(a1, v69, 4);
                                                                      else
                                                                        sub_180002110(
                                                                          a1,
                                                                          qword_1801178A0 + 109,
                                                                          qword_1801178A0 + 1777,
                                                                          0xFFFFFFFFLL);
                                                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                      if ( (_BYTE)result == 0 )
                                                                      {
                                                                        v67 |= (unsigned int)((_DWORD)v69 << 24);
                                                                        v69 = v66;
                                                                        sub_1800036C0(
                                                                          (__int64)v65,
                                                                          (float *)&v56,
                                                                          &v69,
                                                                          &v69);
                                                                        if ( v69 != 0 )
                                                                          LODWORD(v69) = (char)sub_180002530(a1, v69, 5);
                                                                        else
                                                                          sub_180002110(
                                                                            a1,
                                                                            qword_1801178A0 + 109,
                                                                            qword_1801178A0 + 1777,
                                                                            0xFFFFFFFFLL);
                                                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                        if ( (_BYTE)result == 0 )
                                                                        {
                                                                          v67 |= (unsigned __int8)v69 << 16;
                                                                          v69 = v66;
                                                                          sub_1800036C0(
                                                                            (__int64)v65,
                                                                            (float *)&v56,
                                                                            &v69,
                                                                            &v69);
                                                                          if ( v69 != 0 )
                                                                            LODWORD(v69) = (char)sub_180002530(
                                                                                                   a1,
                                                                                                   v69,
                                                                                                   6);
                                                                          else
                                                                            sub_180002110(
                                                                              a1,
                                                                              qword_1801178A0 + 109,
                                                                              qword_1801178A0 + 1777,
                                                                              0xFFFFFFFFLL);
                                                                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                          if ( (_BYTE)result == 0 )
                                                                          {
                                                                            v67 |= (unsigned __int16)((_WORD)v69 << 8);
                                                                            v69 = v66;
                                                                            sub_1800036C0(
                                                                              (__int64)v65,
                                                                              (float *)&v56,
                                                                              &v69,
                                                                              &v69);
                                                                            if ( v69 != 0 )
                                                                              LODWORD(v69) = (char)sub_180002530(
                                                                                                     a1,
                                                                                                     v69,
                                                                                                     7);
                                                                            else
                                                                              sub_180002110(
                                                                                a1,
                                                                                qword_1801178A0 + 109,
                                                                                qword_1801178A0 + 1777,
                                                                                0xFFFFFFFFLL);
                                                                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                            if ( (_BYTE)result == 0 )
                                                                            {
                                                                              v61 = (unsigned int)(v61 + 1);
                                                                              v44 = 0xFFFFFFFF;
                                                                              while ( 1 )
                                                                              {
                                                                                v67 |= (unsigned __int8)v69;
                                                                                v69 = v44;
                                                                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                if ( (_BYTE)result != 0 )
                                                                                  break;
                                                                                sub_180026DB0(&v56, v70);
                                                                                sub_180026DB0(&v56, &v59);
                                                                                sub_180026DB0(&v56, &v60);
                                                                                sub_180026DB0(&v56, &v66);
                                                                                sub_180026DB0(&v56, &v64);
                                                                                sub_180026DB0(&v56, &v63);
                                                                                sub_180002660(a1, &v56);
                                                                                v67 ^= 0x8BB4085B8E3uLL;
                                                                                v45 = *(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL);
                                                                                if ( (_DWORD)v69 != 0 )
                                                                                {
                                                                                  result = v45(a1);
                                                                                  if ( (_BYTE)result != 0 )
                                                                                    goto LABEL_39;
                                                                                  sub_180026DB0(&v56, v70);
                                                                                  sub_180026DB0(&v56, &v59);
                                                                                  sub_180026DB0(&v56, &v60);
                                                                                  sub_180026DB0(&v56, &v66);
                                                                                  sub_180026DB0(&v56, &v64);
                                                                                  sub_180026DB0(&v56, &v63);
                                                                                  sub_180002660(a1, &v56);
                                                                                  if ( v70[0] != 0 )
                                                                                    (*(void (__fastcall **)(__int64, __int64, _QWORD, __int64, unsigned __int64 *))(*(_QWORD *)a1 + 1696LL))(
                                                                                      a1,
                                                                                      v70[0],
                                                                                      (unsigned int)v68,
                                                                                      1,
                                                                                      &v67);
                                                                                  else
                                                                                    sub_180002110(
                                                                                      a1,
                                                                                      qword_1801178A0 + 109,
                                                                                      qword_1801178A0 + 1788,
                                                                                      0xFFFFFFFFLL);
                                                                                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                  if ( (_BYTE)result != 0 )
                                                                                    goto LABEL_39;
                                                                                  LODWORD(v70[0]) = v41;
                                                                                  LODWORD(v68) = v62;
                                                                                  if ( v41 < v62 )
                                                                                    goto LABEL_180;
                                                                                  v70[0] = qword_180117B10;
                                                                                  v68 = qword_180117B10;
                                                                                  v59 = qword_180117B10;
                                                                                  sub_1800036C0(
                                                                                    (__int64)v65,
                                                                                    (float *)&v56,
                                                                                    (__int64 *)&v68,
                                                                                    &v68);
                                                                                  if ( qword_180117E70 == 0
                                                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                                                         a1,
                                                                                         qword_180117E70,
                                                                                         0) != 0 )
                                                                                  {
                                                                                    sub_1800C68B0(&unk_180117C60);
                                                                                    if ( qword_180117E70 == 0
                                                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                                                           a1,
                                                                                           qword_180117E70,
                                                                                           0) != 0 )
                                                                                    {
                                                                                      v47 = sub_1800023C0(a1);
                                                                                      if ( v47 != 0 )
                                                                                      {
                                                                                        qword_180117E70 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v47);
                                                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(
                                                                                          a1,
                                                                                          v47);
                                                                                      }
                                                                                    }
                                                                                    sub_1800C6900(&unk_180117C60);
                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                    if ( (_BYTE)result != 0 )
                                                                                      goto LABEL_39;
                                                                                  }
                                                                                  if ( qword_1801182C8 == 0 )
                                                                                  {
                                                                                    qword_1801182C8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(a1, qword_180117E70, qword_1801178A0 + 1679, qword_1801178A0 + 1686);
                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                    if ( (_BYTE)result != 0 )
                                                                                      goto LABEL_39;
                                                                                  }
                                                                                  if ( v70[0] != 0 )
                                                                                    LODWORD(v70[0]) = sub_180026900(a1, v70[0], qword_1801182C8, v46);
                                                                                  else
                                                                                    sub_180002110(
                                                                                      a1,
                                                                                      qword_1801178A0 + 109,
                                                                                      qword_1801178A0 + 1690,
                                                                                      0xFFFFFFFFLL);
                                                                                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                  if ( (_BYTE)result != 0 )
                                                                                    goto LABEL_39;
                                                                                  v62 = v70[0];
                                                                                  LODWORD(v70[0]) = 0;
                                                                                  v41 = 0;
                                                                                }
                                                                                else
                                                                                {
                                                                                  result = v45(a1);
                                                                                  if ( (_BYTE)result != 0 )
                                                                                    goto LABEL_39;
                                                                                  sub_180026DB0(&v56, v70);
                                                                                  sub_180026DB0(&v56, &v59);
                                                                                  sub_180026DB0(&v56, &v60);
                                                                                  sub_180026DB0(&v56, &v66);
                                                                                  sub_180026DB0(&v56, &v64);
                                                                                  sub_180026DB0(&v56, &v63);
                                                                                  sub_180002660(a1, &v56);
                                                                                  if ( v70[0] != 0 )
                                                                                    (*(void (__fastcall **)(__int64, __int64, _QWORD, __int64, unsigned __int64 *))(*(_QWORD *)a1 + 1696LL))(
                                                                                      a1,
                                                                                      v70[0],
                                                                                      (unsigned int)v68,
                                                                                      1,
                                                                                      &v67);
                                                                                  else
                                                                                    sub_180002110(
                                                                                      a1,
                                                                                      qword_1801178A0 + 109,
                                                                                      qword_1801178A0 + 1788,
                                                                                      0xFFFFFFFFLL);
                                                                                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                  if ( (_BYTE)result != 0 )
                                                                                    goto LABEL_39;
                                                                                  LODWORD(v70[0]) = v41;
                                                                                  LODWORD(v68) = v62;
                                                                                  if ( v41 >= v62 )
                                                                                  {
                                                                                    v70[0] = v60;
                                                                                    sub_1800036C0(
                                                                                      (__int64)v65,
                                                                                      (float *)&v56,
                                                                                      v70,
                                                                                      v70);
                                                                                    if ( qword_180117D40 != 0
                                                                                      && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                                                           a1,
                                                                                           qword_180117D40,
                                                                                           0) == 0 )
                                                                                    {
                                                                                      goto LABEL_369;
                                                                                    }
                                                                                    sub_1800C68B0(&unk_180117B30);
                                                                                    if ( qword_180117D40 == 0
                                                                                      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                                                           a1,
                                                                                           qword_180117D40,
                                                                                           0) != 0 )
                                                                                    {
                                                                                      v50 = sub_1800023C0(a1);
                                                                                      if ( v50 != 0 )
                                                                                      {
                                                                                        qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v50);
                                                                                        (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(
                                                                                          a1,
                                                                                          v50);
                                                                                      }
                                                                                    }
                                                                                    sub_1800C6900(&unk_180117B30);
                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                    if ( (_BYTE)result == 0 )
                                                                                    {
LABEL_369:
                                                                                      v51 = qword_180118398;
                                                                                      if ( qword_180118398 == 0 )
                                                                                      {
                                                                                        qword_180118398 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL))(a1, qword_180117D40, qword_1801178A0 + 1800, qword_1801178A0 + 1802);
                                                                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                        if ( (_BYTE)result != 0 )
                                                                                          goto LABEL_39;
                                                                                        v51 = qword_180118398;
                                                                                      }
                                                                                      (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1232LL))(
                                                                                        a1,
                                                                                        qword_180117D40,
                                                                                        v51,
                                                                                        v70[0]);
                                                                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                      if ( (_BYTE)result == 0 )
                                                                                      {
                                                                                        LODWORD(v70[0]) = 13;
                                                                                        if ( qword_180117F28 != 0
                                                                                          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                                                               a1,
                                                                                               qword_180117F28,
                                                                                               0) == 0 )
                                                                                        {
                                                                                          goto LABEL_370;
                                                                                        }
                                                                                        sub_1800C68B0(&unk_180117D18);
                                                                                        if ( qword_180117F28 == 0
                                                                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                                                               a1,
                                                                                               qword_180117F28,
                                                                                               0) != 0 )
                                                                                        {
                                                                                          v52 = sub_1800023C0(a1);
                                                                                          if ( v52 != 0 )
                                                                                          {
                                                                                            qword_180117F28 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v52);
                                                                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(
                                                                                              a1,
                                                                                              v52);
                                                                                          }
                                                                                        }
                                                                                        sub_1800C6900(&unk_180117D18);
                                                                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                        if ( (_BYTE)result == 0 )
                                                                                        {
LABEL_370:
                                                                                          if ( SLODWORD(v70[0]) < 0 )
                                                                                          {
                                                                                            sub_180002110(
                                                                                              a1,
                                                                                              qword_1801178A0 + 718,
                                                                                              qword_1801178A0 + 755,
                                                                                              0xFFFFFFFFLL);
                                                                                          }
                                                                                          else
                                                                                          {
                                                                                            v70[0] = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, _QWORD))(*(_QWORD *)a1 + 1376LL))(a1, LODWORD(v70[0]), qword_180117F28, 0);
                                                                                            sub_1800036C0(
                                                                                              (__int64)v65,
                                                                                              (float *)&v56,
                                                                                              v70,
                                                                                              v70);
                                                                                          }
                                                                                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                          if ( (_BYTE)result == 0 )
                                                                                          {
                                                                                            if ( qword_180117D40 != 0
                                                                                              && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                                                                   a1,
                                                                                                   qword_180117D40,
                                                                                                   0) == 0 )
                                                                                            {
                                                                                              goto LABEL_357;
                                                                                            }
                                                                                            sub_1800C68B0(&unk_180117B30);
                                                                                            if ( qword_180117D40 == 0
                                                                                              || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                                                                   a1,
                                                                                                   qword_180117D40,
                                                                                                   0) != 0 )
                                                                                            {
                                                                                              v53 = sub_1800023C0(a1);
                                                                                              if ( v53 != 0 )
                                                                                              {
                                                                                                qword_180117D40 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v53);
                                                                                                (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(
                                                                                                  a1,
                                                                                                  v53);
                                                                                              }
                                                                                            }
                                                                                            sub_1800C6900(&unk_180117B30);
                                                                                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                            if ( (_BYTE)result == 0 )
                                                                                            {
LABEL_357:
                                                                                              v54 = qword_1801183A0;
                                                                                              if ( qword_1801183A0 == 0 )
                                                                                              {
                                                                                                qword_1801183A0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1152LL))(a1, qword_180117D40, qword_1801178A0 + 1805, qword_1801178A0 + 12853);
                                                                                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                                if ( (_BYTE)result != 0 )
                                                                                                  goto LABEL_39;
                                                                                                v54 = qword_1801183A0;
                                                                                              }
                                                                                              (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1232LL))(
                                                                                                a1,
                                                                                                qword_180117D40,
                                                                                                v54,
                                                                                                v70[0]);
                                                                                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                              if ( (_BYTE)result == 0 )
                                                                                              {
                                                                                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                                if ( (_BYTE)result == 0 )
                                                                                                {
                                                                                                  sub_180026DB0(
                                                                                                    &v56,
                                                                                                    &v59);
                                                                                                  sub_180026DB0(
                                                                                                    &v56,
                                                                                                    &v60);
                                                                                                  sub_180026DB0(
                                                                                                    &v56,
                                                                                                    &v66);
                                                                                                  sub_180026DB0(
                                                                                                    &v56,
                                                                                                    &v64);
                                                                                                  sub_180026DB0(
                                                                                                    &v56,
                                                                                                    &v63);
                                                                                                  result = sub_180002660(a1, &v56);
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    goto LABEL_39;
                                                                                  }
                                                                                }
                                                                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                if ( (_BYTE)result == 0 )
                                                                                {
                                                                                  sub_180026DB0(&v56, &v59);
                                                                                  sub_180026DB0(&v56, &v60);
                                                                                  sub_180026DB0(&v56, &v66);
                                                                                  sub_180026DB0(&v56, &v64);
                                                                                  sub_180026DB0(&v56, &v63);
                                                                                  sub_180002660(a1, &v56);
                                                                                  v70[0] = v59;
                                                                                  sub_1800036C0(
                                                                                    (__int64)v65,
                                                                                    (float *)&v56,
                                                                                    v70,
                                                                                    v70);
                                                                                  LODWORD(v68) = v41;
                                                                                  v41 += 8;
                                                                                  LODWORD(v67) = v41;
                                                                                  if ( qword_180117E70 != 0
                                                                                    && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                                                         a1,
                                                                                         qword_180117E70,
                                                                                         0) == 0 )
                                                                                  {
                                                                                    goto LABEL_372;
                                                                                  }
                                                                                  sub_1800C68B0(&unk_180117C60);
                                                                                  if ( qword_180117E70 == 0
                                                                                    || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                                                         a1,
                                                                                         qword_180117E70,
                                                                                         0) != 0 )
                                                                                  {
                                                                                    v48 = sub_1800023C0(a1);
                                                                                    if ( v48 != 0 )
                                                                                    {
                                                                                      qword_180117E70 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v48);
                                                                                      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(
                                                                                        a1,
                                                                                        v48);
                                                                                    }
                                                                                  }
                                                                                  sub_1800C6900(&unk_180117C60);
                                                                                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                  if ( (_BYTE)result == 0 )
                                                                                  {
LABEL_372:
                                                                                    if ( qword_1801182D0 != 0
                                                                                      || (qword_1801182D0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(a1, qword_180117E70, qword_1801178A0 + 1712, qword_1801178A0 + 1722),
                                                                                          (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1)) == 0) )
                                                                                    {
                                                                                      if ( v70[0] != 0 )
                                                                                      {
                                                                                        v70[0] = sub_180002790(a1);
                                                                                        sub_1800036C0(
                                                                                          (__int64)v65,
                                                                                          (float *)&v56,
                                                                                          v70,
                                                                                          v70);
                                                                                      }
                                                                                      else
                                                                                      {
                                                                                        sub_180002110(
                                                                                          a1,
                                                                                          qword_1801178A0 + 109,
                                                                                          qword_1801178A0 + 140,
                                                                                          0xFFFFFFFFLL);
                                                                                      }
                                                                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                      if ( (_BYTE)result == 0 )
                                                                                      {
                                                                                        v68 = qword_180117B08;
                                                                                        if ( qword_180117E70 != 0
                                                                                          && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                                                               a1,
                                                                                               qword_180117E70,
                                                                                               0) == 0 )
                                                                                        {
                                                                                          goto LABEL_373;
                                                                                        }
                                                                                        sub_1800C68B0(&unk_180117C60);
                                                                                        if ( qword_180117E70 == 0
                                                                                          || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                                                                               a1,
                                                                                               qword_180117E70,
                                                                                               0) != 0 )
                                                                                        {
                                                                                          v49 = sub_1800023C0(a1);
                                                                                          if ( v49 != 0 )
                                                                                          {
                                                                                            qword_180117E70 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v49);
                                                                                            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(
                                                                                              a1,
                                                                                              v49);
                                                                                          }
                                                                                        }
                                                                                        sub_1800C6900(&unk_180117C60);
                                                                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                        if ( (_BYTE)result == 0 )
                                                                                        {
LABEL_373:
                                                                                          if ( qword_1801182F0 != 0
                                                                                            || (qword_1801182F0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(a1, qword_180117E70, qword_1801178A0 + 1745, qword_1801178A0 + 1754),
                                                                                                (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1)) == 0) )
                                                                                          {
                                                                                            if ( v70[0] != 0 )
                                                                                            {
                                                                                              v70[0] = sub_180002790(a1);
                                                                                              sub_1800036C0(
                                                                                                (__int64)v65,
                                                                                                (float *)&v56,
                                                                                                v70,
                                                                                                v70);
                                                                                            }
                                                                                            else
                                                                                            {
                                                                                              sub_180002110(
                                                                                                a1,
                                                                                                qword_1801178A0 + 109,
                                                                                                qword_1801178A0 + 140,
                                                                                                0xFFFFFFFFLL);
                                                                                            }
                                                                                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                            if ( (_BYTE)result == 0 )
                                                                                            {
                                                                                              v66 = v70[0];
                                                                                              sub_1800036C0(
                                                                                                (__int64)v65,
                                                                                                (float *)&v56,
                                                                                                v70,
                                                                                                v70);
                                                                                              v70[0] = v60;
                                                                                              sub_1800036C0(
                                                                                                (__int64)v65,
                                                                                                (float *)&v56,
                                                                                                v70,
                                                                                                v70);
                                                                                              LODWORD(v68) = v61;
                                                                                              v67 = v66;
                                                                                              sub_1800036C0(
                                                                                                (__int64)v65,
                                                                                                (float *)&v56,
                                                                                                (__int64 *)&v67,
                                                                                                &v67);
                                                                                              if ( v67 != 0 )
                                                                                                LODWORD(v67) = (char)sub_180002530(a1, v67, 0);
                                                                                              else
                                                                                                sub_180002110(
                                                                                                  a1,
                                                                                                  qword_1801178A0 + 109,
                                                                                                  qword_1801178A0 + 1777,
                                                                                                  0xFFFFFFFFLL);
                                                                                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                              if ( (_BYTE)result == 0 )
                                                                                              {
                                                                                                v67 = (unsigned __int64)(unsigned int)v67 << 56;
                                                                                                v69 = v66;
                                                                                                sub_1800036C0(
                                                                                                  (__int64)v65,
                                                                                                  (float *)&v56,
                                                                                                  &v69,
                                                                                                  &v69);
                                                                                                if ( v69 != 0 )
                                                                                                  LODWORD(v69) = (char)sub_180002530(a1, v69, 1);
                                                                                                else
                                                                                                  sub_180002110(
                                                                                                    a1,
                                                                                                    qword_1801178A0 + 109,
                                                                                                    qword_1801178A0 + 1777,
                                                                                                    0xFFFFFFFFLL);
                                                                                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                                if ( (_BYTE)result == 0 )
                                                                                                {
                                                                                                  v67 |= (unsigned __int64)(unsigned __int8)v69 << 48;
                                                                                                  v69 = v66;
                                                                                                  sub_1800036C0(
                                                                                                    (__int64)v65,
                                                                                                    (float *)&v56,
                                                                                                    &v69,
                                                                                                    &v69);
                                                                                                  if ( v69 != 0 )
                                                                                                    LODWORD(v69) = (char)sub_180002530(a1, v69, 2);
                                                                                                  else
                                                                                                    sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 1777, 0xFFFFFFFFLL);
                                                                                                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                                  if ( (_BYTE)result == 0 )
                                                                                                  {
                                                                                                    v67 |= (unsigned __int64)(unsigned __int8)v69 << 40;
                                                                                                    v69 = v66;
                                                                                                    sub_1800036C0((__int64)v65, (float *)&v56, &v69, &v69);
                                                                                                    if ( v69 != 0 )
                                                                                                      LODWORD(v69) = (char)sub_180002530(a1, v69, 3);
                                                                                                    else
                                                                                                      sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 1777, 0xFFFFFFFFLL);
                                                                                                    result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                                    if ( (_BYTE)result == 0 )
                                                                                                    {
                                                                                                      v67 |= (unsigned __int64)(unsigned __int8)v69 << 32;
                                                                                                      v69 = v66;
                                                                                                      sub_1800036C0((__int64)v65, (float *)&v56, &v69, &v69);
                                                                                                      if ( v69 != 0 )
                                                                                                        LODWORD(v69) = (char)sub_180002530(a1, v69, 4);
                                                                                                      else
                                                                                                        sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 1777, 0xFFFFFFFFLL);
                                                                                                      result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                                      if ( (_BYTE)result == 0 )
                                                                                                      {
                                                                                                        v67 |= (unsigned int)((_DWORD)v69 << 24);
                                                                                                        v69 = v66;
                                                                                                        sub_1800036C0((__int64)v65, (float *)&v56, &v69, &v69);
                                                                                                        if ( v69 != 0 )
                                                                                                          LODWORD(v69) = (char)sub_180002530(a1, v69, 5);
                                                                                                        else
                                                                                                          sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 1777, 0xFFFFFFFFLL);
                                                                                                        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                                        if ( (_BYTE)result == 0 )
                                                                                                        {
                                                                                                          v67 |= (unsigned __int8)v69 << 16;
                                                                                                          v69 = v66;
                                                                                                          sub_1800036C0((__int64)v65, (float *)&v56, &v69, &v69);
                                                                                                          if ( v69 != 0 )
                                                                                                            LODWORD(v69) = (char)sub_180002530(a1, v69, 6);
                                                                                                          else
                                                                                                            sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 1777, 0xFFFFFFFFLL);
                                                                                                          result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                                          if ( (_BYTE)result == 0 )
                                                                                                          {
                                                                                                            v67 |= (unsigned __int16)((_WORD)v69 << 8);
                                                                                                            v69 = v66;
                                                                                                            sub_1800036C0((__int64)v65, (float *)&v56, &v69, &v69);
                                                                                                            if ( v69 != 0 )
                                                                                                              LODWORD(v69) = (char)sub_180002530(a1, v69, 7);
                                                                                                            else
                                                                                                              sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 1777, 0xFFFFFFFFLL);
                                                                                                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                                                                                            v61 = (unsigned int)(v61 + 1);
                                                                                                            v44 = 0;
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
                                                                                goto LABEL_39;
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
                                goto LABEL_39;
                              }
                              v70[0] = v64;
                              sub_1800036C0((__int64)v65, (float *)&v56, v70, v70);
                              LODWORD(v68) = v16 + v17;
                              if ( qword_180117E70 == 0
                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                     a1,
                                     qword_180117E70,
                                     0) != 0 )
                              {
                                sub_1800C68B0(&unk_180117C60);
                                if ( qword_180117E70 == 0
                                  || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                       a1,
                                       qword_180117E70,
                                       0) != 0 )
                                {
                                  v34 = sub_1800023C0(a1);
                                  if ( v34 != 0 )
                                  {
                                    qword_180117E70 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1
                                                                                                  + 1808LL))(
                                                        a1,
                                                        v34);
                                    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v34);
                                  }
                                }
                                sub_1800C6900(&unk_180117C60);
                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                if ( (_BYTE)result != 0 )
                                  goto LABEL_39;
                              }
                              if ( qword_1801182D8 == 0 )
                              {
                                qword_1801182D8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, unsigned __int64))(*(_QWORD *)a1 + 264LL))(
                                                    a1,
                                                    qword_180117E70,
                                                    qword_1801178A0 + 3387,
                                                    qword_1801178A0 + 3394,
                                                    v55);
                                result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                if ( (_BYTE)result != 0 )
                                  goto LABEL_39;
                              }
                              if ( v70[0] != 0 )
                                LODWORD(v70[0]) = (unsigned __int16)sub_18006C830(
                                                                      a1,
                                                                      v70[0],
                                                                      qword_1801182D8,
                                                                      (unsigned int)v68);
                              else
                                sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 3399, 0xFFFFFFFFLL);
                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                              if ( (_BYTE)result != 0 )
                                goto LABEL_39;
                              v16 = v70[0];
                              v17 = v33 + 1;
                            }
                            result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                            if ( (_BYTE)result == 0 )
                            {
                              sub_180026DB0(&v56, &v64);
                              sub_180026DB0(&v56, &v63);
                              sub_180002660(a1, &v56);
                              LODWORD(v70[0]) = 19;
                              v68 = v64;
                              sub_1800036C0((__int64)v65, (float *)&v56, (__int64 *)&v68, &v68);
                              LODWORD(v67) = v17;
                              LODWORD(v69) = v16;
                              if ( qword_180117E70 != 0
                                && (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                     a1,
                                     qword_180117E70,
                                     0) == 0 )
                              {
                                goto LABEL_374;
                              }
                              sub_1800C68B0(&unk_180117C60);
                              if ( qword_180117E70 == 0
                                || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(
                                     a1,
                                     qword_180117E70,
                                     0) != 0 )
                              {
                                v35 = sub_1800023C0(a1);
                                if ( v35 != 0 )
                                {
                                  qword_180117E70 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(
                                                      a1,
                                                      v35);
                                  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v35);
                                }
                              }
                              sub_1800C6900(&unk_180117C60);
                              result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                              if ( (_BYTE)result == 0 )
                              {
LABEL_374:
                                if ( qword_1801182D0 != 0
                                  || (qword_1801182D0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 264LL))(
                                                          a1,
                                                          qword_180117E70,
                                                          qword_1801178A0 + 1712,
                                                          qword_1801178A0 + 1722),
                                      (_BYTE)(result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1)) == 0) )
                                {
                                  if ( v68 != 0 )
                                  {
                                    v68 = sub_180002790(a1);
                                    sub_1800036C0((__int64)v65, (float *)&v56, (__int64 *)&v68, &v68);
                                  }
                                  else
                                  {
                                    sub_180002110(a1, qword_1801178A0 + 109, qword_1801178A0 + 140, 0xFFFFFFFFLL);
                                  }
                                  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
                                  v61 = (unsigned int)(v61 + 1);
                                  v19 = 0;
                                  if ( (_BYTE)result == 0 )
                                    continue;
                                }
                              }
                            }
                            goto LABEL_39;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          goto LABEL_39;
        }
        qword_1801182C0 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                            a1,
                            qword_180117D40,
                            qword_1801178A0 + 12849,
                            qword_1801178A0 + 10672);
        result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
        if ( (_BYTE)result == 0 )
        {
          v9 = qword_1801182C0;
          goto LABEL_22;
        }
      }
    }
  }
LABEL_39:
  v12 = (_QWORD *)v57;
  if ( (_QWORD)v57 != 0 )
  {
    do
    {
      v13 = (_QWORD *)*v12;
      result = sub_1800C0DC0(v12);
      v12 = v13;
    }
    while ( v13 != nullptr );
  }
  v14 = v56;
  *(_QWORD *)&v56 = 0;
  if ( v14 != 0 )
    return sub_1800C0DC0(v14);
  return result;
}
