// Java_sun_nio_ch_Net_getInterface6
// rva 0x132a34ac  size 101  section .text  group jdk
// window base 0x1932a34ac: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_Net_getInterface6(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5)
{
  int v6; // eax
  __int64 v7; // rdi
  __int64 v8; // rsi
  __int64 v9; // rdi
  __int64 v10; // rsi
  unsigned int v11; // eax
  __int64 v12; // rdi
  __int64 v13; // rsi
  _DWORD v15[6]; // [rsp+30h] [rbp-18h] BYREF

  v6 = sub_1932A2CC4(a1, a2, a3: a5);
  if ( (unsigned int)MEMORY[0x799F8](a1: v7, a2: v8, a3: 41, a4: v6, a5: 9, a6: v15) != -1 )
    return v15[0];
  v11 = MEMORY[0x79958](a1: v9, a2: v10);
  sub_1932AED0C(a1: v12, a2: v13, a3: v11, a4, a5: 535240);
  return 0xFFFFFFFFLL;
}
