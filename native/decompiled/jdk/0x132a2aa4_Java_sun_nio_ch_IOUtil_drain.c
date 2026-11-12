// Java_sun_nio_ch_IOUtil_drain
// rva 0x132a2aa4  size 140  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_IOUtil_drain(__int64 a1, __int64 a2, __int64 a3, __int64 a4, int a5)
{
  __int64 v5; // rdi
  __int64 v6; // rsi
  int v7; // eax
  __int64 v8; // rdx
  __int64 v9; // r8
  __int64 v10; // r9
  __int64 v12; // [rsp+0h] [rbp-48h] BYREF
  _BYTE v13[16]; // [rsp+20h] [rbp-28h] BYREF
  __int64 v14; // [rsp+30h] [rbp-18h]

  v5 = a4;
  v6 = a5;
  while ( 1 )
  {
    v7 = MEMORY[0x79998](a1: v5, a2: v6, a3: v13, a4: v6, a5: 16);
    if ( v7 == -1 )
      break;
    if ( v7 < 16 )
      return sub_1932C8DE0(a1: v5, a2: v6, a3: v8, a4: (unsigned __int64)&v12 ^ v14, a5: v9, a6: v10);
  }
  if ( (unsigned int)MEMORY[0x79958](a1: v5, a2: v6) != 10035 )
    sub_1932B1580(a1: v5, a2: v6, a3: 535064, a4: v5);
  return sub_1932C8DE0(a1: v5, a2: v6, a3: v8, a4: (unsigned __int64)&v12 ^ v14, a5: v9, a6: v10);
}
