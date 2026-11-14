// Java_sun_nio_ch_DatagramChannelImpl_disconnect0
// rva 0x132a1330  size 200  section .text  group jdk
// window base 0x1932a1330: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_DatagramChannelImpl_disconnect0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  __int64 v5; // rbx
  __int64 v6; // rdi
  __int64 v7; // rsi
  __int64 v8; // rdi
  __int64 v9; // rsi
  __int64 v10; // rdi
  __int64 v11; // rsi
  unsigned int v12; // eax
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 v15; // rdx
  __int64 v16; // rdi
  __int64 v17; // rsi
  __int64 v18; // r8
  __int64 v19; // r9
  _QWORD v21[5]; // [rsp+0h] [rbp-88h] BYREF
  int v22; // [rsp+28h] [rbp-60h]
  int *v23; // [rsp+30h] [rbp-58h]
  __int64 v24; // [rsp+38h] [rbp-50h]
  __int64 v25; // [rsp+40h] [rbp-48h]
  int v26; // [rsp+50h] [rbp-38h] BYREF
  int v27; // [rsp+54h] [rbp-34h] BYREF
  _BYTE v28[32]; // [rsp+58h] [rbp-30h] BYREF
  __int64 v29; // [rsp+78h] [rbp-10h]

  v5 = (int)sub_1932A2CC4(a1: a4, a2, a3: a5);
  sub_1932CA161(a1: v6, a2: v7, a3: 0, a4: v28, a5: 28);
  if ( (unsigned int)MEMORY[0x799D8](a1: v8, a2: v9, a3: v28, a4: v5, a5: 28) == -1 )
  {
    v12 = MEMORY[0x79958](a1: v10, a2: v11);
    sub_1932AED0C(a1: v13, a2: v14, a3: v12, a4: v13, a5: 534472);
  }
  else
  {
    v25 = 0;
    v24 = 0;
    v23 = &v26;
    v22 = 0;
    v21[4] = 0;
    v27 = 0;
    v26 = 0;
    MEMORY[0x799B8](a1: v10, a2: v11, a3: 2550136844LL, a4: v5, a5: &v27, a6: 4);
  }
  return sub_1932C8DE0(a1: v16, a2: v17, a3: v15, a4: (unsigned __int64)v21 ^ v29, a5: v18, a6: v19);
}
