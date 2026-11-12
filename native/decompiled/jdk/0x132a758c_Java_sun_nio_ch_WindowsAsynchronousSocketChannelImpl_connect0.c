// Java_sun_nio_ch_WindowsAsynchronousSocketChannelImpl_connect0
// rva 0x132a758c  size 217  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_WindowsAsynchronousSocketChannelImpl_connect0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        int a5,
        char a6,
        int a7,
        int a8,
        int a9,
        int a10,
        __int64 a11,
        int a12,
        __int64 a13)
{
  __int64 v14; // rdx
  __int64 v15; // rdi
  __int64 v16; // rsi
  __int64 v17; // r8
  __int64 v18; // r9
  __int64 v19; // rdi
  __int64 v20; // rsi
  _DWORD v22[10]; // [rsp+0h] [rbp-88h] BYREF
  __int64 v23; // [rsp+28h] [rbp-60h]
  __int64 v24; // [rsp+30h] [rbp-58h]
  unsigned int v25; // [rsp+40h] [rbp-48h] BYREF
  _BYTE v26[32]; // [rsp+48h] [rbp-40h] BYREF
  __int64 v27; // [rsp+68h] [rbp-20h]

  v25 = 0;
  if ( (unsigned int)sub_1932AE988(
                       a1: a13,
                       a2: a5,
                       a3: a11,
                       a4,
                       a5: a12,
                       a6: (unsigned int)v26,
                       a7: v22[0],
                       a8: v22[2],
                       a9: v22[4],
                       a10: v22[6],
                       a11: (__int64)&v25,
                       a12: a6) == 0 )
  {
    sub_1932CA161(a1: v15, a2: v16, a3: 0, a4: v15, a5: 32);
    v24 = v19;
    v23 = 0;
    v22[8] = 0;
    if ( (unsigned int)MEMORY[0x337470](a1: v19, a2: v20, a3: v26, a4: v20, a5: v25, a6: 0) == 0
      && (unsigned int)MEMORY[0x79758](a1: v15) != 997 )
    {
      sub_1932B1580(a1: v15, a2: v16, a3: 536784, a4);
    }
  }
  return sub_1932C8DE0(a1: v15, a2: v16, a3: v14, a4: (unsigned __int64)v22 ^ v27, a5: v17, a6: v18);
}
