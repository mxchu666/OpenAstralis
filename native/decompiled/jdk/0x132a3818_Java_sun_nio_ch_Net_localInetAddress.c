// Java_sun_nio_ch_Net_localInetAddress
// rva 0x132a3818  size 128  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_Net_localInetAddress(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5)
{
  int v6; // eax
  __int64 v7; // rdi
  __int64 v8; // rsi
  __int64 v9; // rdi
  __int64 v10; // rsi
  int v11; // r9d
  unsigned int v12; // eax
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 v15; // rdx
  __int64 v16; // rdi
  __int64 v17; // rsi
  __int64 v18; // r8
  __int64 v19; // r9
  __int64 v21[4]; // [rsp+0h] [rbp-58h] BYREF
  int v22; // [rsp+20h] [rbp-38h] BYREF
  char v23; // [rsp+24h] [rbp-34h] BYREF
  _BYTE v24[32]; // [rsp+28h] [rbp-30h] BYREF
  __int64 v25; // [rsp+48h] [rbp-10h]

  v22 = 28;
  v6 = sub_1932A2CC4(a1, a2, a3: a5);
  if ( (unsigned int)MEMORY[0x79948](a1: v7, a2: v8, a3: v24, a4: v6, a5: &v22) == -1 )
  {
    v12 = MEMORY[0x79958](a1: v9, a2: v10);
    sub_1932AED0C(a1: v13, a2: v14, a3: v12, a4, a5: 535224);
  }
  else
  {
    sub_1932A9D88(
      a1: v9,
      a2: v10,
      a3: (unsigned int)v24,
      a4,
      a5: (unsigned int)&v23,
      a6: v11,
      a7: v21[0],
      a8: v21[1],
      a9: v21[2],
      a10: v21[3]);
  }
  return sub_1932C8DE0(a1: v16, a2: v17, a3: v15, a4: (unsigned __int64)v21 ^ v25, a5: v18, a6: v19);
}
