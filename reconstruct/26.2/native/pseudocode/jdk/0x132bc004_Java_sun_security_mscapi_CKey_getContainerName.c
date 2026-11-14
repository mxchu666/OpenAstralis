// Java_sun_security_mscapi_CKey_getContainerName
// rva 0x132bc004  size 124  section .text  group jdk
// window base 0x1932bc004: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_security_mscapi_CKey_getContainerName(
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
  __int64 v11; // r8
  __int64 v12; // r9
  _DWORD v14[12]; // [rsp+0h] [rbp-158h] BYREF
  int v15[4]; // [rsp+30h] [rbp-128h] BYREF
  _BYTE v16[256]; // [rsp+40h] [rbp-118h] BYREF
  __int64 v17; // [rsp+140h] [rbp-18h]

  v15[0] = 256;
  v16[0] = 0;
  v14[8] = 0;
  MEMORY[0x79128](a1, a2, a3: 6, a4: a5, a5: v16, a6: v15);
  (*(void (__fastcall **)(__int64, __int64, _BYTE *, __int64))(*(_QWORD *)a4 + 1336LL))(a1: v6, a2: v7, a3: v16, a4);
  return sub_1932C8DE0(a1: v9, a2: v10, a3: v8, a4: (unsigned __int64)v14 ^ v17, a5: v11, a6: v12);
}
