// Java_java_net_Inet4AddressImpl_isReachable0
// rva 0x132aa7e4  size 441  section .text  group jdk
// window base 0x1932aa7e4: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_java_net_Inet4AddressImpl_isReachable0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        int a6,
        int a7,
        int a8,
        int a9,
        int a10,
        __int64 a11,
        int a12)
{
  int v14; // eax
  __int64 v15; // rdx
  __int64 v16; // rdi
  __int64 v17; // rsi
  __int64 v18; // r8
  __int64 v19; // r9
  __int64 v20; // r12
  __int64 v21; // rdi
  void (__fastcall *v22)(__int64, __int64, __int64, __int64, _QWORD, _QWORD); // r10
  __int64 v23; // rsi
  unsigned int v24; // ebx
  __int64 v25; // rdi
  __int64 v26; // rsi
  __int64 v27; // rdx
  __int64 v28; // rdi
  __int64 v29; // rsi
  __int64 v30; // rdi
  _WORD *v31; // rsi
  __int64 v32; // rdi
  void (__fastcall *v33)(__int64, __int64, __int64, __int64, _QWORD, _QWORD); // r10
  __int64 v34; // rsi
  unsigned int v35; // ebx
  __int64 v36; // rdi
  __int64 v37; // rsi
  __int64 v38; // rdx
  __int64 v39; // rdi
  __int64 v40; // rsi
  __int64 v41; // rax
  __int64 v42; // rdi
  __int64 v43; // rsi
  unsigned int v44; // eax
  __int64 v45; // rdi
  __int64 v46; // rsi
  __int64 v48; // [rsp+0h] [rbp-80h] BYREF
  __int64 v49; // [rsp+8h] [rbp-78h]
  __int64 v50; // [rsp+10h] [rbp-70h]
  int v51; // [rsp+18h] [rbp-68h]
  char *v52; // [rsp+20h] [rbp-60h]
  char v53; // [rsp+30h] [rbp-50h] BYREF
  unsigned __int8 v54; // [rsp+31h] [rbp-4Fh]
  unsigned __int8 v55; // [rsp+32h] [rbp-4Eh]
  unsigned __int8 v56; // [rsp+33h] [rbp-4Dh]
  _WORD v57[2]; // [rsp+38h] [rbp-48h] BYREF
  int v58; // [rsp+3Ch] [rbp-44h]
  _WORD v59[2]; // [rsp+58h] [rbp-28h] BYREF
  int v60; // [rsp+5Ch] [rbp-24h]
  __int64 v61; // [rsp+78h] [rbp-8h]

  v14 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64))(*(_QWORD *)a4 + 1368LL))(a1: a4, a2: 0, a3: a5);
  v20 = (unsigned int)(v17 + 4);
  if ( v14 == (_DWORD)v20 )
  {
    sub_1932CA161(a1: v16, a2: v17, a3: 0, a4: &v53, a5: (unsigned int)(v17 + 4));
    v22 = *(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)v21 + 1600LL);
    v52 = &v53;
    v22(a1: v21, a2: v23, a3: a5, a4: v21, a5: 0, a6: (unsigned int)v20);
    v24 = v56 | ((v55 | ((v54 | (v53 << 8)) << 8)) << 8);
    sub_1932CA161(a1: v25, a2: v26, a3: 0, a4: v57, a5: 28);
    v58 = MEMORY[0x79940](a1: v28, a2: v29, a3: v27, a4: v24);
    v57[0] = 2;
    if ( a11 != 0 )
    {
      sub_1932CA161(a1: v30, a2: v31, a3: 0, a4: &v53, a5: v20);
      v33 = *(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)v32 + 1600LL);
      v52 = &v53;
      v33(a1: v32, a2: v34, a3: a11, a4: v32, a5: 0, a6: (unsigned int)v20);
      v35 = v56 | ((v55 | ((v54 | (v53 << 8)) << 8)) << 8);
      sub_1932CA161(a1: v36, a2: v37, a3: 0, a4: v59, a5: 28);
      v60 = MEMORY[0x79940](a1: v39, a2: v40, a3: v38, a4: v35);
      v31 = v59;
      v59[0] = 2;
    }
    v41 = MEMORY[0x792D0](a1: v30, a2: v31);
    if ( v41 == -1 )
    {
      v44 = MEMORY[0x79958](a1: v42, a2: v43);
      if ( v44 == 5 )
        sub_1932AAEB8(
          a1: v45,
          a2: v46,
          a3: (unsigned int)v57,
          a4: v45,
          a5: v46,
          a6,
          a7: v48,
          a8: v49,
          a9: v50,
          a10: v51,
          a11: a12);
      else
        sub_1932AED0C(a1: v45, a2: v46, a3: v44, a4: v45, a5: 537528);
    }
    else
    {
      sub_1932AAC54(
        a1: v42,
        a2: v43,
        a3: v41,
        a4: v42,
        a5: (unsigned int)v57,
        a6: v43,
        a7: v48,
        a8: v49,
        a9: v50,
        a10: v51,
        a11: a6);
    }
  }
  return sub_1932C8DE0(a1: v16, a2: v17, a3: v15, a4: (unsigned __int64)&v48 ^ v61, a5: v18, a6: v19);
}
