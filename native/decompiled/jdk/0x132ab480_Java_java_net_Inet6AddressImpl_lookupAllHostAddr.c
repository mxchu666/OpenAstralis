// Java_java_net_Inet6AddressImpl_lookupAllHostAddr
// rva 0x132ab480  size 1126  section .text  group jdk
// window base 0x1932ab480: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_java_net_Inet6AddressImpl_lookupAllHostAddr(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        unsigned int a6)
{
  __int64 v9; // r15
  __int64 v10; // rdi
  __int64 v11; // rsi
  __int64 v12; // rdi
  __int64 v13; // rsi
  __int64 v15; // rdi
  __int64 v16; // rsi
  __int64 v17; // rdx
  __int64 v18; // rdi
  __int64 v19; // rsi
  __int64 v20; // rdi
  __int64 v21; // rsi
  __int64 v22; // rdx
  __int64 v23; // rdi
  __int64 v24; // rsi
  int v25; // ebp
  __int64 v26; // rdi
  __int64 v27; // rsi
  int v28; // r9d
  bool v29; // zf
  __int64 v30; // rbp
  __int64 v31; // rbp
  unsigned int v32; // r14d
  unsigned int v33; // r13d
  unsigned int v34; // r12d
  __int64 v35; // r8
  int v36; // r9d
  __int64 v37; // rax
  _BYTE *v38; // rcx
  __int64 v39; // rax
  __int64 v40; // rsi
  __int64 v41; // rdx
  __int64 v42; // rdx
  __int64 v43; // rdi
  __int64 v44; // rsi
  __int64 v45; // rbp
  __int64 v46; // rdx
  __int64 v47; // rdi
  __int64 v48; // r14
  unsigned int v49; // eax
  __int64 v50; // rdi
  int v51; // esi
  __int64 v52; // rdi
  __int64 v53; // rsi
  __int64 v54; // rdi
  __int64 v55; // rsi
  __int64 v56; // rax
  __int64 v57; // rdi
  __int64 v58; // r14
  __int64 v59; // rdi
  unsigned int v60; // r8d
  __int64 v61; // rdi
  __int64 v62; // rsi
  unsigned int v63; // eax
  __int64 v64; // [rsp+20h] [rbp-78h] BYREF
  _DWORD v65[28]; // [rsp+28h] [rbp-70h] BYREF
  __int64 v67; // [rsp+A0h] [rbp+8h]

  v64 = 0;
  v9 = 0;
  initInetAddressIDs(a1: 0, a2: 0, a3, a4);
  if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1824LL))(
         a1: v10,
         a2: v11,
         a3: *(_QWORD *)(*(_QWORD *)a4 + 1824LL),
         a4) != 0 )
    return 0;
  if ( a5 == 0 )
  {
    sub_1932B15C0(a1: v12, a2: v13, a3: 537280, a4);
    return 0;
  }
  v67 = sub_1932B0230(a1: v12, a2: v13, a3: a5, a4, a5: 0);
  if ( v67 == 0 )
    return 0;
  sub_1932CA161(a1: v15, a2: v16, a3: 0, a4: v65, a5: 48);
  v65[0] = 2;
  v65[1] = sub_1932AA298(a1: v18, a2: v19, a3: v17, a4: a6);
  if ( (unsigned int)MEMORY[0x79A20](a1: v20, a2: v21, a3: 0, a4: v67, a5: v65, a6: &v64) != 0 )
  {
    v25 = sub_1932A9F4C(a1: v23, a2: v24, a3: v22, a4);
    if ( v25 != -1
      || (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1824LL))(
           a1: v26,
           a2: v27,
           a3: *(_QWORD *)(*(_QWORD *)a4 + 1824LL),
           a4) == 0 )
    {
      v29 = v25 == 1;
      v30 = v67;
      if ( !v29 )
        JUMPOUT(0x326505593LL);
      sub_1932AED04(a1: v26, a2: v27, a3: 537304, a4, a5: v67, a6: v28);
      goto LABEL_43;
    }
  }
  else
  {
    v31 = v64;
    v32 = 0;
    v33 = 0;
    v34 = 0;
    while ( v31 != 0 )
    {
      v35 = v24;
      if ( v24 != 0 )
      {
        v36 = *(_DWORD *)(v31 + 4);
        do
        {
          if ( v36 == *(_DWORD *)(v35 + 4) && *(_QWORD *)(v31 + 16) == *(_QWORD *)(v35 + 16) )
          {
            if ( *(_DWORD *)(v35 + 4) == 2 )
            {
              v22 = *(_QWORD *)(v31 + 32);
              if ( *(_DWORD *)(v22 + 4) == *(_DWORD *)(*(_QWORD *)(v35 + 32) + 4LL) )
                goto LABEL_35;
            }
            else
            {
              v37 = *(_QWORD *)(v31 + 32);
              v22 = 0;
              v38 = (_BYTE *)(v37 + 8);
              do
              {
                if ( *v38 != v38[*(_QWORD *)(v35 + 32) - v37] )
                  break;
                ++v38;
                v22 = (unsigned int)(v22 + 1);
              }
              while ( (__int64)&v38[-8 - v37] < 16 );
              if ( (int)v22 >= 16 )
                goto LABEL_35;
            }
          }
          else if ( v36 != 2 && v36 != 23 )
          {
            goto LABEL_35;
          }
          v35 = *(_QWORD *)(v35 + 40);
        }
        while ( v35 != 0 );
      }
      v39 = MEMORY[0x79AD0](a1: v23, a2: v24, a3: v22, a4: 48);
      if ( v39 == 0 )
      {
        sub_1932B15D0(a1: 0, a2: v40, a3: 537336, a4);
LABEL_41:
        v26 = 0;
        goto LABEL_42;
      }
      sub_1932CA15B(a1: v39, a2: v40, a3: v31, a4: v39, a5: 48);
      *(_QWORD *)(v23 + 40) = 0;
      if ( v24 != 0 )
        *(_QWORD *)(v9 + 40) = v23;
      else
        v24 = v23;
      ++v32;
      v9 = v23;
      if ( *(_DWORD *)(v31 + 4) == 2 )
      {
        ++v33;
      }
      else if ( *(_DWORD *)(v31 + 4) == 23 )
      {
        ++v34;
      }
LABEL_35:
      v31 = *(_QWORD *)(v31 + 40);
    }
    v26 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 1376LL))(
            a1: v23,
            a2: v24,
            a3: v32,
            a4,
            a5: MEMORY[0x337F08],
            a6: 0);
    if ( v26 != 0 )
    {
      if ( (a6 & 8) != 0 )
      {
        v33 = 0;
      }
      else
      {
        if ( (a6 & 4) == 0 )
          v33 = 0;
        v34 = 0;
      }
      v45 = v27;
      if ( v27 != 0 )
      {
        while ( 1 )
        {
          if ( *(_DWORD *)(v45 + 4) == 2 )
          {
            v48 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64, _QWORD))(*(_QWORD *)a4 + 224LL))(
                    a1: v26,
                    a2: v27,
                    a3: MEMORY[0x337F50],
                    a4,
                    a5: MEMORY[0x337F48]);
            if ( v48 == 0 )
              goto LABEL_41;
            v49 = MEMORY[0x79930](a1: v47, a2: v27, a3: v46, a4: *(unsigned int *)(*(_QWORD *)(v45 + 32) + 4LL));
            sub_1932AA4C0(a1: v50, a2: v51, a3: v48, a4, a5: v49);
            if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1824LL))(
                   a1: v52,
                   a2: v53,
                   a3: *(_QWORD *)(*(_QWORD *)a4 + 1824LL),
                   a4) != 0 )
              break;
            sub_1932AA5C0(a1: v26, a2: v27, a3: v48, a4, a5);
            if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1824LL))(
                   a1: v54,
                   a2: v55,
                   a3: *(_QWORD *)(*(_QWORD *)a4 + 1824LL),
                   a4) != 0 )
              break;
            (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1392LL))(
              a1: v26,
              a2: v27,
              a3: v26,
              a4,
              a5: v34++,
              a6: v48);
          }
          else if ( *(_DWORD *)(v45 + 4) == 23 )
          {
            v56 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64, _QWORD))(*(_QWORD *)a4 + 224LL))(
                    a1: v26,
                    a2: v27,
                    a3: MEMORY[0x337F40],
                    a4,
                    a5: MEMORY[0x337F10]);
            v58 = v56;
            if ( v56 == 0 || sub_1932AA2C0(a1: v57, a2: v27, a3: v56, a4) == 0 )
              goto LABEL_41;
            v60 = *(_DWORD *)(*(_QWORD *)(v45 + 32) + 24LL);
            if ( v60 != 0 )
              sub_1932AA3B8(a1: v59, a2: v27, a3: v58, a4, a5: v60);
            sub_1932AA5C0(a1: v59, a2: v27, a3: v58, a4, a5);
            if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1824LL))(
                   a1: v61,
                   a2: v62,
                   a3: *(_QWORD *)(*(_QWORD *)a4 + 1824LL),
                   a4) != 0 )
              break;
            (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1392LL))(
              a1: v26,
              a2: v27,
              a3: v26,
              a4,
              a5: v33++,
              a6: v58);
          }
          v63 = sub_1932A9F40(a1: v26, a2: v27, a3: v41, a4: a6);
          v45 = *(_QWORD *)(v45 + 40);
          v41 = v63;
          if ( v45 == 0 )
            break;
          if ( v63 != 0 )
            JUMPOUT(0x32650589ELL);
        }
      }
    }
  }
LABEL_42:
  v30 = v67;
LABEL_43:
  sub_1932B110C(a1: v26, a2: v27, a3: a5, a4, a5: v30);
  while ( v44 != 0 )
    MEMORY[0x79AE0](a1: v43, a2: *(_QWORD *)(v44 + 40), a3: v42, a4: v44);
  if ( v64 != 0 )
    MEMORY[0x79A28]();
  return v43;
}
