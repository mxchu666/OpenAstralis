// Java_sun_security_mscapi_CKey_getKeyType
// rva 0x132bc080  size 197  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_security_mscapi_CKey_getKeyType(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5)
{
  __int64 v6; // rdi
  __int64 v7; // rsi
  __int64 v8; // rdx
  int v9; // eax
  __int64 v10; // rdx
  __int64 v11; // rdi
  __int64 v12; // rsi
  __int64 v13; // r8
  __int64 v14; // r9
  _DWORD v16[12]; // [rsp+0h] [rbp-98h] BYREF
  int v17; // [rsp+30h] [rbp-68h] BYREF
  _DWORD v18[3]; // [rsp+34h] [rbp-64h] BYREF
  _BYTE v19[64]; // [rsp+40h] [rbp-58h] BYREF
  __int64 v20; // [rsp+80h] [rbp-18h]

  v17 = 4;
  v16[8] = 0;
  if ( (unsigned int)MEMORY[0x79118](a1, a2, a3: 7, a4: a5, a5: v18, a6: &v17) == 0 )
    goto LABEL_7;
  if ( v18[0] != 9216 )
  {
    if ( v18[0] == 41984 )
    {
      v8 = 546624;
      goto LABEL_8;
    }
    v9 = sub_19329EDE0(a1: v6, a2: v7, a3: 64, a4: (__int64)v19, a5: 546636);
    v8 = (__int64)v19;
    if ( v9 != 0 )
      goto LABEL_8;
LABEL_7:
    v8 = 546640;
    goto LABEL_8;
  }
  v8 = 546608;
LABEL_8:
  (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 1336LL))(a1: v6, a2: v7, a3: v8, a4);
  return sub_1932C8DE0(a1: v11, a2: v12, a3: v10, a4: (unsigned __int64)v16 ^ v20, a5: v13, a6: v14);
}
