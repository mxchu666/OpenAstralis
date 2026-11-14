// Java_sun_nio_ch_UnixDomainSockets_localAddress0
// rva 0x132a4bb4  size 129  section .text  group jdk
// window base 0x1932a4bb4: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_UnixDomainSockets_localAddress0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  int v6; // eax
  __int64 v7; // rdi
  __int64 v8; // rsi
  __int64 v9; // rdi
  __int64 v10; // rsi
  int v11; // r9d
  __int64 v12; // rdx
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 v15; // r8
  __int64 v16; // r9
  __int64 v18[4]; // [rsp+0h] [rbp-B8h] BYREF
  int v19[4]; // [rsp+20h] [rbp-98h] BYREF
  _BYTE v20[112]; // [rsp+30h] [rbp-88h] BYREF
  __int64 v21; // [rsp+A0h] [rbp-18h]

  v19[0] = 110;
  v6 = sub_1932A2CC4(a1, a2, a3: a5);
  if ( (unsigned int)MEMORY[0x79948](a1: v7, a2: v8, a3: v20, a4: v6, a5: v19) == -1 )
    sub_1932B1580(a1: v9, a2: v10, a3: 535224, a4);
  else
    sub_1932A4CB0(a1: v9, a2: v10, a3: (unsigned int)v20, a4, a5: v19[0], a6: v11, a7: v18[0], a8: v18[1], a9: v18[2]);
  return sub_1932C8DE0(a1: v13, a2: v14, a3: v12, a4: (unsigned __int64)v18 ^ v21, a5: v15, a6: v16);
}
