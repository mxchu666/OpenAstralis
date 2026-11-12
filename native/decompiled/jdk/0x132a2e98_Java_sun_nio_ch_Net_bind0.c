// Java_sun_nio_ch_Net_bind0
// rva 0x132a2e98  size 170  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_Net_bind0(
        __int64 a1,
        int a2,
        __int64 a3,
        __int64 a4,
        int a5,
        char a6,
        int a7,
        __int64 a8,
        int a9,
        int a10,
        char a11,
        __int64 a12,
        int a13)
{
  __int64 v14; // rdx
  __int64 v15; // rdi
  __int64 v16; // rsi
  __int64 v17; // r8
  __int64 v18; // r9
  int v19; // eax
  int v20; // r9d
  int v21; // edi
  int v22; // esi
  unsigned int v23; // eax
  __int64 v24; // rdi
  __int64 v25; // rsi
  __int64 v27; // [rsp+0h] [rbp-68h] BYREF
  __int64 v28; // [rsp+8h] [rbp-60h]
  int v29; // [rsp+10h] [rbp-58h]
  int v30; // [rsp+18h] [rbp-50h]
  int v31; // [rsp+30h] [rbp-38h] BYREF
  _BYTE v32[32]; // [rsp+38h] [rbp-30h] BYREF
  __int64 v33; // [rsp+58h] [rbp-10h]

  v31 = 0;
  if ( (unsigned int)sub_1932AE988(
                       a1: a5,
                       a2,
                       a3: a12,
                       a4,
                       a5: a13,
                       a6: (unsigned int)v32,
                       a7: v27,
                       a8: v28,
                       a9: v29,
                       a10: v30,
                       a11: (__int64)&v31,
                       a12: a6) == 0 )
  {
    v19 = sub_1932A2CC4(a1: v15, a2: v16, a3: v15);
    LOBYTE(v20) = a11;
    if ( (unsigned int)sub_1932AEFBC(
                         a1: v21,
                         a2: v22,
                         a3: (unsigned int)v32,
                         a4: v19,
                         a5: v31,
                         a6: v20,
                         a7: v27,
                         a8: v28) == -1 )
    {
      v23 = MEMORY[0x79958](a1: v15, a2: v16);
      sub_1932AED0C(a1: v24, a2: v25, a3: v23, a4, a5: 535192);
    }
  }
  return sub_1932C8DE0(a1: v15, a2: v16, a3: v14, a4: (unsigned __int64)&v27 ^ v33, a5: v17, a6: v18);
}
