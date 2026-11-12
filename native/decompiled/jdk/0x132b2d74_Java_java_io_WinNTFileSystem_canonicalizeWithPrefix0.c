// Java_java_io_WinNTFileSystem_canonicalizeWithPrefix0
// rva 0x132b2d74  size 468  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_java_io_WinNTFileSystem_canonicalizeWithPrefix0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  __int64 v6; // r15
  __int64 v9; // rdi
  __int64 v10; // rsi
  __int64 v11; // rbp
  __int64 v12; // rdi
  __int64 v13; // rsi
  __int64 v14; // rdx
  __int64 v15; // r14
  __int64 v16; // rdx
  int v17; // ebx
  __int64 v18; // rdi
  __int64 v19; // rsi
  __int64 v20; // rax
  __int64 v21; // rdi
  __int64 v22; // rdx
  __int64 *v23; // rdi
  __int64 v24; // rsi
  __int64 v25; // rbx
  unsigned int v26; // eax
  __int64 v27; // rdi
  __int64 v28; // rsi
  __int64 *v29; // rdi
  __int64 v30; // rsi
  __int64 v31; // rdx
  __int64 v32; // rbx
  unsigned int v33; // eax
  __int64 v34; // rdi
  __int64 v35; // rsi
  __int64 v36; // rdx
  __int64 v37; // r8
  __int64 v38; // r9
  __int64 v40; // [rsp+0h] [rbp-868h] BYREF
  _BYTE v41[2048]; // [rsp+20h] [rbp-848h] BYREF
  __int64 v42; // [rsp+820h] [rbp-48h]

  v6 = 0;
  if ( a5 == 0 )
  {
    sub_1932B15C0(a1: a4, a2, a3: 0, a4);
LABEL_17:
    if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)v9 + 1824LL))(
           a1: v9,
           a2: v10,
           a3: *(_QWORD *)(*(_QWORD *)v9 + 1824LL),
           a4: v9) == 0 )
      sub_1932B1580(a1: v9, a2: v10, a3: 543704, a4: v9);
    return sub_1932C8DE0(a1: v9, a2: v10, a3: v36, a4: (unsigned __int64)&v40 ^ v42, a5: v37, a6: v38);
  }
  v11 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 1320LL))(
          a1: a4,
          a2,
          a3: a5,
          a4,
          a5: 0);
  if ( v11 == 0 )
    goto LABEL_17;
  if ( a6 != 0 )
  {
    v15 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)v9 + 1320LL))(
            a1: v9,
            a2: v10,
            a3: a6,
            a4: v9,
            a5: 0);
    if ( v15 != 0 )
    {
      v17 = MEMORY[0x79CB0](a1: v12, a2: v13, a3: v14, a4: v11) + 260;
      if ( v17 <= 1024 )
      {
        if ( (int)sub_1932B9ECC(a1: v18, a2: v19, a3: v15, a4: v11, a5: v41) >= 0 )
        {
          v32 = *v29;
          v33 = MEMORY[0x79CB0](a1: v29, a2: v30, a3: v31, a4: v41);
          v6 = (*(__int64 (__fastcall **)(__int64, __int64, _BYTE *, __int64, _QWORD))(v32 + 1304))(
                 a1: v34,
                 a2: v35,
                 a3: v41,
                 a4: v34,
                 a5: v33);
        }
      }
      else
      {
        v20 = MEMORY[0x79AD0](a1: v18, a2: v19, a3: v16, a4: 2LL * v17);
        if ( v20 != 0 )
        {
          if ( (int)sub_1932B9ECC(a1: v21, a2: v20, a3: v15, a4: v11, a5: v20) >= 0 )
          {
            v25 = *v23;
            v26 = MEMORY[0x79CB0](a1: v23, a2: v24, a3: v22, a4: v24);
            v6 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(v25 + 1304))(
                   a1: v27,
                   a2: v28,
                   a3: v28,
                   a4: v27,
                   a5: v26);
          }
          MEMORY[0x79AE0](a1: v23, a2: v24, a3: v22, a4: v24);
        }
        else
        {
          sub_1932B15D0(a1: v21, a2: 0, a3: 533920, a4: v21);
        }
      }
      (*(void (__fastcall **)(__int64 *, __int64, __int64, __int64 *, __int64))(*v29 + 1328))(
        a1: v29,
        a2: v30,
        a3: a6,
        a4: v29,
        a5: v15);
    }
  }
  else
  {
    sub_1932B15C0(a1: v9, a2: v10, a3: 0, a4: v9);
  }
  (*(void (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)v12 + 1328LL))(
    a1: v12,
    a2: v13,
    a3: a5,
    a4: v12,
    a5: v11);
  if ( v6 == 0 )
    goto LABEL_17;
  return sub_1932C8DE0(a1: v9, a2: v10, a3: v36, a4: (unsigned __int64)&v40 ^ v42, a5: v37, a6: v38);
}
