// Java_sun_nio_ch_DatagramDispatcher_write0
// rva 0x132a18d8  size 237  section .text  group jdk
// window base 0x1932a18d8: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_DatagramDispatcher_write0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        __int64 a9,
        unsigned int a10,
        int a11)
{
  int v13; // eax
  __int64 v14; // rdi
  __int64 v15; // rdi
  __int64 v16; // rsi
  int v17; // eax
  __int64 v18; // rdi
  __int64 v19; // rsi
  __int64 v20; // r9
  int v22; // edi
  int v23; // esi
  int v24; // r9d
  __int64 v25; // [rsp+0h] [rbp-58h]
  __int64 v26; // [rsp+8h] [rbp-50h]
  __int64 v27; // [rsp+10h] [rbp-48h]
  int v28; // [rsp+40h] [rbp-18h] BYREF
  __int64 v29; // [rsp+48h] [rbp-10h]

  a10 = 0;
  v13 = sub_1932A2CC4(a1: a4, a2, a3: a5);
  v28 = a11;
  v29 = a6;
  if ( (unsigned int)MEMORY[0x799A8](a1: v14, a2: v13, a3: &v28, a4: v13, a5: 1, a6: &a10) != -1 )
    return sub_1932A2C98(a1: v15, a2: v16, a3: a10, a4: v15, a5: 0);
  v17 = MEMORY[0x79958](a1: v15, a2: v16);
  if ( v17 == 10035 )
    return 4294967294LL;
  if ( v17 == 10054 )
  {
    sub_1932A155C(a1: v18, a2: v19, a3, a4: v18, a5: (unsigned int)v19, a6: v20, a7: v25, a8: v26, a9: v27);
    sub_1932B12F8(a1: v22, a2: v23, a3: 534480, a4: v22, a5: 0, a6: v24);
  }
  else
  {
    sub_1932B1580(a1: v18, a2: v19, a3: 534560, a4: v18);
  }
  return 4294967291LL;
}
