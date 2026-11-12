// Java_sun_nio_ch_FileDispatcherImpl_isOther0
// rva 0x132a1ce4  size 286  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_FileDispatcherImpl_isOther0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  __int64 v6; // rax
  __int64 v7; // rdi
  __int64 v8; // rdx
  __int64 v9; // rdi
  __int64 v10; // rsi
  __int64 v11; // r8
  __int64 v12; // r9
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 v15; // rdx
  __int64 v16; // rdi
  __int64 v17; // rsi
  __int64 v18; // rdi
  __int64 v19; // rsi
  _QWORD v21[5]; // [rsp+0h] [rbp-98h] BYREF
  int v22; // [rsp+28h] [rbp-70h]
  char *v23; // [rsp+30h] [rbp-68h]
  __int64 v24; // [rsp+38h] [rbp-60h]
  char v25; // [rsp+40h] [rbp-58h] BYREF
  _DWORD v26[14]; // [rsp+48h] [rbp-50h] BYREF
  __int64 v27; // [rsp+80h] [rbp-18h]

  v6 = sub_1932A2CD8(a1, a2, a3: a5);
  if ( (unsigned int)MEMORY[0x79690](a1: v7, a2: v6, a3: v26, a4: v6) == 0 )
    sub_1932B1580(a1: v9, a2: v10, a3: 534744, a4);
  if ( (v26[0] & 0x40) == 0 && (v26[0] & 0x400) != 0 )
  {
    v13 = MEMORY[0x79AD0](a1: v9, a2: v10, a3: v8, a4: 0x4000);
    if ( v13 == 0 )
      sub_1932B15D0(a1: 0, a2: v14, a3: 534744, a4);
    v24 = 0;
    v23 = &v25;
    v22 = 0x4000;
    v21[4] = v13;
    if ( (unsigned int)MEMORY[0x79650](a1: v13, a2: v14, a3: 589992, a4: v14, a5: 0, a6: 0) == 0 )
    {
      MEMORY[0x79AE0](a1: v16, a2: v17, a3: v15, a4: v16);
      sub_1932B1580(a1: v18, a2: v19, a3: 534744, a4);
    }
    MEMORY[0x79AE0](a1: v16, a2: v17, a3: v15, a4: v16);
  }
  return sub_1932C8DE0(a1: v9, a2: v10, a3: v8, a4: (unsigned __int64)v21 ^ v27, a5: v11, a6: v12);
}
