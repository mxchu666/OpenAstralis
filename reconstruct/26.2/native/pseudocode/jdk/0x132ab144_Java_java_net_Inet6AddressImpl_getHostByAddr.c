// Java_java_net_Inet6AddressImpl_getHostByAddr
// rva 0x132ab144  size 355  section .text  group jdk
// window base 0x1932ab144: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_java_net_Inet6AddressImpl_getHostByAddr(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  __int64 v7; // rdi
  __int64 v8; // rsi
  bool v9; // zf
  __int64 v10; // rdi
  __int64 v11; // rsi
  void (__fastcall *v12)(__int64, __int64, __int64, __int64, _QWORD, __int64); // rax
  __int64 v13; // rdx
  __int64 v14; // rdi
  __int64 v15; // rsi
  _BYTE *v16; // rdi
  __int64 v17; // rsi
  __int16 v18; // ax
  __int64 v19; // rdi
  __int64 v20; // rsi
  int v21; // esi
  int v22; // eax
  __int64 v23; // rdi
  __int64 v24; // rsi
  __int64 v25; // r9
  int v26; // ecx
  __int64 v27; // rdx
  __int64 v28; // r8
  __int64 v30; // [rsp+0h] [rbp-100h] BYREF
  _BYTE *v31; // [rsp+20h] [rbp-E0h]
  int v32; // [rsp+28h] [rbp-D8h]
  int v33; // [rsp+30h] [rbp-D0h]
  _WORD v34[2]; // [rsp+40h] [rbp-C0h] BYREF
  int v35; // [rsp+44h] [rbp-BCh]
  _BYTE v36[24]; // [rsp+48h] [rbp-B8h] BYREF
  _BYTE v37[16]; // [rsp+60h] [rbp-A0h] BYREF
  _BYTE v38[1040]; // [rsp+70h] [rbp-90h] BYREF
  __int64 v39; // [rsp+480h] [rbp+380h]

  sub_1932CA161(a1: 0, a2, a3: 0, a4: v34, a5: 28);
  v9 = (*(unsigned int (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 1368LL))(
         a1: v7,
         a2: v8,
         a3: a5,
         a4) == 4;
  v12 = *(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1600LL);
  v31 = v37;
  if ( v9 )
  {
    v12(a1: v10, a2: v11, a3: a5, a4, a5: 0, a6: (unsigned int)(v10 + 4));
    v35 = MEMORY[0x79940](
            a1: v14,
            a2: v15,
            a3: v13,
            a4: v37[3] | ((v37[2] | ((v37[1] | (unsigned int)(v37[0] << 8)) << 8)) << 8));
    v17 = (unsigned int)((_DWORD)v16 + 16);
    v18 = (_WORD)v16 + 2;
  }
  else
  {
    v12(a1: v10, a2: 16, a3: a5, a4, a5: 0, a6: 16);
    sub_1932CA15B(a1: v19, a2: v20, a3: v37, a4: v36, a5: (unsigned int)v20);
    v18 = v21 + 7;
    v17 = (unsigned int)(v21 + 12);
  }
  v33 = 4;
  v32 = (int)v16;
  v31 = v16;
  v34[0] = v18;
  v22 = MEMORY[0x79A30](a1: v16, a2: v17, a3: (unsigned int)v17, a4: v34, a5: v38, a6: 1025);
  v26 = a4;
  if ( v22 != 0 )
    goto LABEL_7;
  v23 = (*(__int64 (__fastcall **)(__int64, __int64, _BYTE *, __int64))(*(_QWORD *)a4 + 1336LL))(
          a1: v23,
          a2: v24,
          a3: v38,
          a4);
  if ( v23 == 0 )
  {
    v26 = a4;
LABEL_7:
    sub_1932B12F8(a1: v23, a2: v24, a3: 537304, a4: v26, a5: 0, a6: v25);
  }
  return sub_1932C8DE0(a1: v23, a2: v24, a3: v27, a4: (unsigned __int64)&v30 ^ v39, a5: v28, a6: v25);
}
