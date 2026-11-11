__int64 __fastcall sub_180002A70(__int64 a1)
{
  __int64 v2; // rdi
  __int64 result; // rax

  v2 = sub_1800025D0();
  result = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
  if ( (_BYTE)result == 0 )
  {
    if ( v2 != 0 )
      return (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1);
    else
      return (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 144LL))(a1, qword_180116E30 + 8);
  }
  return result;
}
