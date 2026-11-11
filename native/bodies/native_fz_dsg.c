__int64 __fastcall sub_180036FF0(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5)
{
  __int64 v8; // rdi
  __int64 v10; // rbx
  __int64 v11; // rdi
  __int64 v12; // rsi
  _QWORD *v13; // rcx
  _QWORD *v14; // rdi
  __int64 v15; // rcx
  __int128 v16; // [rsp+30h] [rbp-50h] BYREF
  __int128 v17; // [rsp+40h] [rbp-40h]
  int v18; // [rsp+50h] [rbp-30h]
  _BYTE v19[16]; // [rsp+58h] [rbp-28h] BYREF
  __int64 v20; // [rsp+68h] [rbp-18h] BYREF
  __int64 v21; // [rsp+70h] [rbp-10h] BYREF
  __int64 v22; // [rsp+78h] [rbp-8h] BYREF
  __int64 v23; // [rsp+80h] [rbp+0h] BYREF
  __int64 v24[5]; // [rsp+88h] [rbp+8h] BYREF

  v8 = sub_1800025D0(a1, a2);
  if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
    return 0;
  if ( v8 != 0 )
  {
    v24[0] = 0;
    v21 = 0;
    v23 = 0;
    v22 = 0;
    v17 = 0;
    v16 = 0;
    v18 = 1065353216;
    v20 = a3;
    sub_1800036C0((__int64)v19, (float *)&v16, &v20, &v20);
    v22 = a4;
    sub_1800036C0((__int64)v19, (float *)&v16, &v22, &v22);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
      goto LABEL_26;
    v24[0] = v20;
    sub_1800036C0((__int64)v19, (float *)&v16, v24, v24);
    v21 = v22;
    sub_1800036C0((__int64)v19, (float *)&v16, &v21, &v21);
    v23 = a5;
    if ( qword_1801175B0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(a1, qword_1801175B0, 0) != 0 )
    {
      sub_1800C68B0(&unk_1801174A0);
      if ( qword_1801175B0 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(a1, qword_1801175B0, 0) != 0 )
      {
        v10 = sub_1800023C0(a1);
        if ( v10 != 0 )
        {
          qword_1801175B0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v10);
          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v10);
        }
      }
      sub_1800C6900(&unk_1801174A0);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
        goto LABEL_26;
    }
    if ( qword_180117748 == 0 )
    {
      qword_180117748 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                          a1,
                          qword_1801175B0,
                          qword_1801172E0 + 3301,
                          qword_1801172E0 + 2616);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
        goto LABEL_26;
    }
    v23 = sub_180002760(a1);
    sub_1800036C0((__int64)v19, (float *)&v16, &v23, &v23);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
      goto LABEL_26;
    if ( qword_1801175B0 == 0
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(a1, qword_1801175B0, 0) != 0 )
    {
      sub_1800C68B0(&unk_1801174A0);
      if ( qword_1801175B0 == 0
        || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 192LL))(a1, qword_1801175B0, 0) != 0 )
      {
        v11 = sub_1800023C0(a1);
        if ( v11 != 0 )
        {
          qword_1801175B0 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1808LL))(a1, v11);
          (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v11);
        }
      }
      sub_1800C6900(&unk_1801174A0);
      if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 )
        goto LABEL_26;
    }
    if ( qword_180117750 == 0
      && (qword_180117750 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 904LL))(
                              a1,
                              qword_1801175B0,
                              qword_1801172E0 + 3018,
                              qword_1801172E0 + 3022),
          (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0)
      || (v24[0] = sub_180002760(a1),
          sub_1800036C0((__int64)v19, (float *)&v16, v24, v24),
          (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0) )
    {
LABEL_26:
      v12 = 0;
    }
    else
    {
      v12 = v24[0];
    }
    v13 = (_QWORD *)v17;
    if ( (_QWORD)v17 != 0 )
    {
      do
      {
        v14 = (_QWORD *)*v13;
        sub_1800C0DC0(v13);
        v13 = v14;
      }
      while ( v14 != nullptr );
    }
    v15 = v16;
    *(_QWORD *)&v16 = 0;
    if ( v15 != 0 )
      sub_1800C0DC0(v15);
    return v12;
  }
  else
  {
    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 144LL))(a1, qword_1801172E0 + 8);
    return 0;
  }
}
