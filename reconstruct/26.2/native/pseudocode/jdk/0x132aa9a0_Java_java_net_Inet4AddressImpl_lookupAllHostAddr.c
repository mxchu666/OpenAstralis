// Java_java_net_Inet4AddressImpl_lookupAllHostAddr
// rva 0x132aa9a0  size 690  section .text  group jdk
// window base 0x1932aa9a0: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_java_net_Inet4AddressImpl_lookupAllHostAddr(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        __int64 a9,
        __int64 a10)
{
  __int64 v10; // rbx
  __int64 v11; // rbp
  __int64 v14; // r15
  __int64 v15; // rdi
  __int64 v16; // rsi
  __int64 v17; // rdi
  __int64 v18; // rsi
  __int64 v20; // rdi
  __int64 v21; // rsi
  __int64 v22; // r13
  __int64 v23; // rdi
  __int64 v24; // rsi
  __int64 v25; // rdx
  __int64 v26; // rdi
  __int64 v27; // rsi
  int v28; // ebp
  __int64 v29; // rdi
  __int64 v30; // rsi
  int v31; // r9d
  __int64 v32; // rbp
  unsigned int v33; // r14d
  __int64 v34; // rcx
  __int64 v35; // rax
  __int64 v36; // rdi
  unsigned int v37; // r15d
  __int64 v38; // rbp
  __int64 v39; // rdx
  __int64 v40; // rsi
  __int64 v41; // r14
  unsigned int v42; // eax
  __int64 v43; // rdi
  int v44; // esi
  __int64 v45; // rdi
  __int64 v46; // rsi
  __int64 v47; // rdi
  __int64 v48; // rsi
  __int64 v49; // rdx
  __int64 v50; // rdi
  __int64 v51; // rsi
  _DWORD v52[12]; // [rsp+20h] [rbp-58h] BYREF

  a8 = v10;
  a9 = v11;
  a10 = a2;
  a7 = 0;
  v14 = 0;
  initInetAddressIDs(a1: 0, a2: 0, a3, a4);
  if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1824LL))(
         a1: v15,
         a2: v16,
         a3: *(_QWORD *)(*(_QWORD *)a4 + 1824LL),
         a4) != 0 )
    return 0;
  if ( a5 == 0 )
  {
    sub_1932B15C0(a1: v17, a2: v18, a3: 537280, a4);
    return 0;
  }
  v22 = sub_1932B0230(a1: v17, a2: v18, a3: a5, a4, a5: 0);
  if ( v22 == 0 )
    return 0;
  sub_1932CA161(a1: v20, a2: v21, a3: 0, a4: v52, a5: 48);
  v52[0] = 2;
  v52[1] = 2;
  if ( (unsigned int)MEMORY[0x79A20](a1: v23, a2: v24, a3: 0, a4: v22, a5: v52, a6: &a7) != 0 )
  {
    v28 = sub_1932A9F4C(a1: v26, a2: v27, a3: v25, a4);
    if ( v28 != -1
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1824LL))(
           a1: v29,
           a2: v30,
           a3: *(_QWORD *)(*(_QWORD *)a4 + 1824LL),
           a4) == 0 )
    {
      if ( v28 != 1 )
        JUMPOUT(0x326504AA3LL);
      sub_1932AED04(a1: v29, a2: v30, a3: 537304, a4, a5: v22, a6: v31);
    }
  }
  else
  {
    v32 = a7;
    v33 = 0;
    while ( v32 != 0 )
    {
      v34 = v26;
      if ( v26 != 0 )
      {
        v25 = *(unsigned int *)(*(_QWORD *)(v32 + 32) + 4LL);
        while ( (_DWORD)v25 != *(_DWORD *)(*(_QWORD *)(v34 + 32) + 4LL) )
        {
          v34 = *(_QWORD *)(v34 + 40);
          if ( v34 == 0 )
            goto LABEL_16;
        }
      }
      else
      {
LABEL_16:
        v35 = MEMORY[0x79AD0](a1: v26, a2: v27, a3: v25, a4: 48);
        if ( v35 == 0 )
        {
          sub_1932B15D0(a1: v36, a2: 0, a3: 537336, a4);
LABEL_31:
          v30 = 0;
          goto LABEL_32;
        }
        sub_1932CA15B(a1: v36, a2: v35, a3: v32, a4: v35, a5: 48);
        *(_QWORD *)(v27 + 40) = 0;
        if ( v26 != 0 )
          *(_QWORD *)(v14 + 40) = v27;
        else
          v26 = v27;
        v14 = v27;
        ++v33;
      }
      v32 = *(_QWORD *)(v32 + 40);
    }
    v30 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 1376LL))(
            a1: v26,
            a2: v27,
            a3: v33,
            a4,
            a5: MEMORY[0x337F08],
            a6: 0);
    if ( v30 != 0 )
    {
      v37 = 0;
      v38 = v29;
      if ( v29 != 0 )
      {
        while ( 1 )
        {
          v41 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64, _QWORD))(*(_QWORD *)a4 + 224LL))(
                  a1: v29,
                  a2: v30,
                  a3: MEMORY[0x337F50],
                  a4,
                  a5: MEMORY[0x337F48]);
          if ( v41 == 0 )
            goto LABEL_31;
          v42 = MEMORY[0x79930](a1: v29, a2: v40, a3: v39, a4: *(unsigned int *)(*(_QWORD *)(v38 + 32) + 4LL));
          sub_1932AA4C0(a1: v43, a2: v44, a3: v41, a4, a5: v42);
          if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1824LL))(
                 a1: v45,
                 a2: v46,
                 a3: *(_QWORD *)(*(_QWORD *)a4 + 1824LL),
                 a4) == 0 )
          {
            sub_1932AA5C0(a1: v29, a2: v30, a3: v41, a4, a5);
            if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1824LL))(
                   a1: v47,
                   a2: v48,
                   a3: *(_QWORD *)(*(_QWORD *)a4 + 1824LL),
                   a4) == 0 )
            {
              (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1392LL))(
                a1: v29,
                a2: v30,
                a3: v30,
                a4,
                a5: v37,
                a6: v41);
              v38 = *(_QWORD *)(v38 + 40);
              ++v37;
              if ( v38 != 0 )
                continue;
            }
          }
          break;
        }
      }
    }
  }
LABEL_32:
  sub_1932B110C(a1: v29, a2: v30, a3: a5, a4, a5: v22);
  while ( v50 != 0 )
    MEMORY[0x79AE0](a1: *(_QWORD *)(v50 + 40), a2: v51, a3: v49, a4: v50);
  if ( a7 != 0 )
    MEMORY[0x79A28]();
  return v51;
}
