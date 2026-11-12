// Java_sun_nio_ch_DatagramDispatcher_read0
// rva 0x132a1670  size 260  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_DatagramDispatcher_read0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        int a7,
        int a8,
        int a9,
        unsigned int a10,
        int a11)
{
  int v13; // eax
  __int64 v14; // rdi
  __int64 v15; // rdi
  __int64 v16; // rsi
  __int64 v17; // r8
  int v18; // eax
  __int64 v19; // r9
  int v21; // edi
  int v22; // esi
  int v23; // r9d
  __int64 v24; // [rsp+0h] [rbp-68h]
  __int64 v25; // [rsp+8h] [rbp-60h]
  __int64 v26; // [rsp+10h] [rbp-58h]
  int v27; // [rsp+48h] [rbp-20h] BYREF
  __int64 v28; // [rsp+50h] [rbp-18h]

  a10 = 0;
  v13 = sub_1932A2CC4(a1: a4, a2, a3: a5);
  v27 = a11;
  v28 = a6;
  if ( (unsigned int)MEMORY[0x799B0](a1: v14, a2: v13, a3: &v27, a4: v13, a5: 1, a6: &a10) != -1
    || (v18 = MEMORY[0x79958](a1: v15, a2: v16)) == 10040 )
  {
    LOBYTE(v17) = 1;
    return sub_1932A2C98(a1: v15, a2: v16, a3: a10, a4: v15, a5: v17);
  }
  else if ( v18 == 10035 )
  {
    return 4294967294LL;
  }
  else
  {
    if ( v18 == 10054 )
    {
      sub_1932A155C(a1: v15, a2: v16, a3, a4: v15, a5: (unsigned int)v16, a6: v19, a7: v24, a8: v25, a9: v26);
      sub_1932B12F8(a1: v21, a2: v22, a3: 534480, a4: v21, a5: 0, a6: v23);
    }
    else
    {
      sub_1932B1580(a1: v15, a2: v16, a3: 534544, a4: v15);
    }
    return 4294967291LL;
  }
}
