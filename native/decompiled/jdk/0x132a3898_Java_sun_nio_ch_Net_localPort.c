// Java_sun_nio_ch_Net_localPort
// rva 0x132a3898  size 134  section .text  group jdk
// window base 0x1932a3898: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_Net_localPort(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5)
{
  int v6; // eax
  __int64 v7; // rdi
  __int64 v8; // rsi
  __int64 v9; // rdx
  __int64 v10; // rdi
  __int64 v11; // rsi
  unsigned int v12; // eax
  __int64 v13; // rdx
  __int64 v14; // rdi
  __int64 v15; // rsi
  __int64 v16; // r8
  __int64 v17; // r9
  __int64 v19; // [rsp+0h] [rbp-58h] BYREF
  int v20; // [rsp+20h] [rbp-38h] BYREF
  _BYTE v21[32]; // [rsp+28h] [rbp-30h] BYREF
  __int64 v22; // [rsp+48h] [rbp-10h]

  v20 = 28;
  v6 = sub_1932A2CC4(a1, a2, a3: a5);
  if ( (unsigned int)MEMORY[0x79948](a1: v7, a2: v8, a3: v21, a4: v6, a5: &v20) == -1 )
  {
    v12 = MEMORY[0x79958](a1: v10, a2: v11);
    if ( v12 != 10022 )
      sub_1932AED0C(a1: v14, a2: v15, a3: v12, a4, a5: 535224);
  }
  else
  {
    sub_1932A9C44(a1: v10, a2: v11, a3: v9, a4: v21);
  }
  return sub_1932C8DE0(a1: v14, a2: v15, a3: v13, a4: (unsigned __int64)&v19 ^ v22, a5: v16, a6: v17);
}
