// Java_java_net_Inet4AddressImpl_getHostByAddr
// rva 0x132aa65c  size 282  section .text  group jdk
// window base 0x1932aa65c: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_java_net_Inet4AddressImpl_getHostByAddr(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  __int64 v6; // rdi
  __int64 v7; // rsi
  __int64 v8; // rdx
  __int64 v9; // rdi
  __int64 v10; // rsi
  __int64 v11; // rsi
  __int64 v12; // rdi
  int v13; // eax
  __int64 v14; // rdi
  __int64 v15; // rsi
  __int64 v16; // r9
  int v17; // ecx
  __int64 v18; // rdx
  __int64 v19; // r8
  _QWORD v21[5]; // [rsp+0h] [rbp-488h] BYREF
  int v22; // [rsp+28h] [rbp-460h]
  int v23; // [rsp+30h] [rbp-458h]
  char v24; // [rsp+40h] [rbp-448h]
  unsigned __int8 v25; // [rsp+41h] [rbp-447h]
  unsigned __int8 v26; // [rsp+42h] [rbp-446h]
  unsigned __int8 v27; // [rsp+43h] [rbp-445h]
  _WORD v28[2]; // [rsp+48h] [rbp-440h] BYREF
  int v29; // [rsp+4Ch] [rbp-43Ch]
  _BYTE v30[1040]; // [rsp+60h] [rbp-428h] BYREF
  __int64 v31; // [rsp+470h] [rbp-18h]

  sub_1932CA161(a1: a4, a2: 0, a3: 0, a4: v28, a5: 16);
  (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)v6 + 1600LL))(
    a1: v6,
    a2: v7,
    a3: a5,
    a4: v6,
    a5: 0,
    a6: (unsigned int)(v7 + 4));
  v23 = 4;
  v29 = MEMORY[0x79940](a1: v9, a2: v10, a3: v8, a4: v27 | ((v26 | ((v25 | (unsigned int)(v24 << 8)) << 8)) << 8));
  v22 = v11;
  v28[0] = v11 + 2;
  v21[4] = v11;
  v13 = MEMORY[0x79A30](a1: v12, a2: v11, a3: (unsigned int)(v11 + 16), a4: v28, a5: v30, a6: 1025);
  v17 = v14;
  if ( v13 != 0 )
    goto LABEL_4;
  v15 = (*(__int64 (__fastcall **)(__int64, __int64, _BYTE *, __int64))(*(_QWORD *)v14 + 1336LL))(
          a1: v14,
          a2: v15,
          a3: v30,
          a4: v14);
  if ( v15 == 0 )
  {
    v17 = v14;
LABEL_4:
    sub_1932B12F8(a1: v14, a2: v15, a3: 537304, a4: v17, a5: 0, a6: v16);
  }
  return sub_1932C8DE0(a1: v14, a2: v15, a3: v18, a4: (unsigned __int64)v21 ^ v31, a5: v19, a6: v16);
}
