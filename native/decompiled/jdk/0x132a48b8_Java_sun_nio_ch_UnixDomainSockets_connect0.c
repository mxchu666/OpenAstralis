// Java_sun_nio_ch_UnixDomainSockets_connect0
// rva 0x132a48b8  size 189  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_UnixDomainSockets_connect0(
        __int64 a1,
        int a2,
        __int64 a3,
        __int64 a4,
        int a5,
        int a6)
{
  __int64 v7; // rdx
  __int64 v8; // rdi
  __int64 v9; // rsi
  __int64 v10; // r8
  __int64 v11; // r9
  int v12; // eax
  __int64 v13; // rdi
  __int64 v14; // rsi
  unsigned int v15; // eax
  __int64 v17; // [rsp+0h] [rbp-B8h] BYREF
  char v18; // [rsp+8h] [rbp-B0h]
  __int64 v19; // [rsp+10h] [rbp-A8h]
  unsigned int v20; // [rsp+20h] [rbp-98h] BYREF
  _BYTE v21[112]; // [rsp+30h] [rbp-88h] BYREF
  __int64 v22; // [rsp+A0h] [rbp-18h]

  v20 = 0;
  if ( (unsigned int)sub_1932A4D44(
                       a1: a5,
                       a2,
                       a3: a6,
                       a4,
                       a5: (unsigned int)v21,
                       a6: (unsigned int)&v20,
                       a7: v17,
                       a8: v18,
                       a9: v19) == 0 )
  {
    v12 = sub_1932A2CC4(a1: v8, a2: v9, a3: v8);
    if ( (unsigned int)MEMORY[0x799D8](a1: v13, a2: v14, a3: v21, a4: v12, a5: v20) != 0 )
    {
      v15 = MEMORY[0x79958](a1: v8, a2: v9);
      v7 = v15 - 10035;
      if ( (unsigned int)v7 > 1 )
        sub_1932AED0C(a1: v8, a2: v9, a3: v15, a4, a5: 534472);
    }
  }
  return sub_1932C8DE0(a1: v8, a2: v9, a3: v7, a4: (unsigned __int64)&v17 ^ v22, a5: v10, a6: v11);
}
