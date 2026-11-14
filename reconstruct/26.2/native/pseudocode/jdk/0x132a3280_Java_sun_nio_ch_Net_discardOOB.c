// Java_sun_nio_ch_Net_discardOOB
// rva 0x132a3280  size 157  section .text  group jdk
// window base 0x1932a3280: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_Net_discardOOB(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5)
{
  __int64 v5; // rsi
  __int64 v6; // rdi
  __int64 i; // rdx
  int v8; // eax
  __int64 v9; // rdi
  __int64 v10; // rsi
  int v11; // eax
  __int64 v12; // rdx
  __int64 v13; // r8
  __int64 v14; // r9
  __int64 v16; // [rsp+0h] [rbp-38h] BYREF
  _BYTE v17[8]; // [rsp+20h] [rbp-18h] BYREF
  __int64 v18; // [rsp+28h] [rbp-10h]

  v5 = a5;
  v6 = a4;
  for ( i = a5; ; i = v5 )
  {
    v8 = sub_1932A2CC4(a1: v6, a2: v5, a3: i);
    v11 = MEMORY[0x79998](a1: v9, a2: v10, a3: v17, a4: v8, a5: 8);
    if ( v11 == -1 )
      break;
    if ( v11 < 8 )
      return sub_1932C8DE0(a1: v6, a2: v5, a3: v12, a4: (unsigned __int64)&v16 ^ v18, a5: v13, a6: v14);
  }
  if ( (unsigned int)MEMORY[0x79958](a1: v6, a2: v5) != 10035 )
    sub_1932B1580(a1: v6, a2: v5, a3: 535064, a4: v6);
  return sub_1932C8DE0(a1: v6, a2: v5, a3: v12, a4: (unsigned __int64)&v16 ^ v18, a5: v13, a6: v14);
}
