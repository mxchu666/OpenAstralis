// Java_java_io_WinNTFileSystem_getFinalPath0
// rva 0x132b3224  size 227  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_java_io_WinNTFileSystem_getFinalPath0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  __int64 v5; // rbx
  __int64 v6; // rdi
  __int64 v7; // rsi
  __int64 v8; // rax
  int v9; // r8d
  int v10; // r9d
  __int64 v11; // rbp
  __int64 v12; // rax
  __int64 v13; // rdx
  __int64 *v14; // rdi
  __int64 v15; // rsi
  __int64 v16; // r14
  __int64 v17; // rbx
  unsigned int v18; // eax
  __int64 v19; // rdi
  __int64 v20; // rsi
  __int64 v21; // rdx
  __int64 v22; // rdi
  __int64 v23; // rsi
  __int64 v24; // rdi
  __int64 v25; // rsi

  v5 = 0;
  if ( a5 == 0 )
  {
    sub_1932B15C0(a1: a4, a2: 0, a3: 0, a4);
LABEL_7:
    if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)v6 + 1824LL))(
           a1: v6,
           a2: v7,
           a3: *(_QWORD *)(*(_QWORD *)v6 + 1824LL),
           a4: v6) == 0 )
      sub_1932B1580(a1: v24, a2: v25, a3: 543704, a4: v24);
    return v5;
  }
  v8 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 1320LL))(
         a1: a4,
         a2: a5,
         a3: a5,
         a4,
         a5: 0);
  v11 = v8;
  if ( v8 == 0 )
    goto LABEL_7;
  v12 = sub_1932B4034(a1: v6, a2: v7, a3: v8, a4: v6, a5: v9, a6: v10);
  v16 = v12;
  if ( v12 != 0 )
  {
    v17 = *v14;
    v18 = MEMORY[0x79CB0](a1: v14, a2: v15, a3: v13, a4: v12);
    v5 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(v17 + 1304))(
           a1: v19,
           a2: v20,
           a3: v16,
           a4: v19,
           a5: v18);
    MEMORY[0x79AE0](a1: v22, a2: v23, a3: v21, a4: v16);
  }
  (*(void (__fastcall **)(__int64 *, __int64, __int64, __int64 *, __int64))(*v14 + 1328))(
    a1: v14,
    a2: v15,
    a3: v15,
    a4: v14,
    a5: v11);
  if ( v5 == 0 )
    goto LABEL_7;
  return v5;
}
