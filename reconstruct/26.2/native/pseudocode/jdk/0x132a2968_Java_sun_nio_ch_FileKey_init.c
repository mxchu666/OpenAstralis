// Java_sun_nio_ch_FileKey_init
// rva 0x132a2968  size 166  section .text  group jdk
// window base 0x1932a2968: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_FileKey_init(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5, __int64 a6)
{
  __int64 v7; // rax
  __int64 v8; // rdi
  __int64 v9; // rsi
  __int64 v10; // rdi
  __int64 v11; // rsi
  void (__fastcall *v12)(__int64, __int64, __int64, __int64, _QWORD, __int64); // r10
  __int64 v13; // rdx
  __int64 v14; // rdi
  __int64 v15; // rsi
  __int64 v16; // r8
  __int64 v17; // r9
  _QWORD v19[6]; // [rsp+0h] [rbp-88h] BYREF
  _BYTE v20[28]; // [rsp+30h] [rbp-58h] BYREF
  int v21; // [rsp+4Ch] [rbp-3Ch]
  int v22; // [rsp+5Ch] [rbp-2Ch]
  int v23; // [rsp+60h] [rbp-28h]
  _DWORD v24[4]; // [rsp+68h] [rbp-20h] BYREF
  __int64 v25; // [rsp+78h] [rbp-10h]

  v7 = sub_1932A2CD8(a1: a6, a2, a3: a5);
  if ( (unsigned int)MEMORY[0x79690](a1: v8, a2: v9, a3: v20, a4: v7) != 0 )
  {
    v24[0] = v21;
    v24[1] = v22;
    v24[2] = v23;
    v12 = *(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1688LL);
    v19[4] = v24;
    v12(a1: v10, a2: v11, a3: v10, a4, a5: 0, a6: 3);
  }
  else
  {
    sub_1932B1580(a1: v10, a2: v11, a3: 534976, a4);
  }
  return sub_1932C8DE0(a1: v14, a2: v15, a3: v13, a4: (unsigned __int64)v19 ^ v25, a5: v16, a6: v17);
}
