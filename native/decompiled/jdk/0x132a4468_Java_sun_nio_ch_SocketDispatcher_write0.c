// Java_sun_nio_ch_SocketDispatcher_write0
// rva 0x132a4468  size 249  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_SocketDispatcher_write0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        int a9,
        unsigned int a10,
        int a11)
{
  int v11; // ebx
  __int64 v12; // rbp
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 v15; // rsi
  int v17; // eax
  __int64 v18; // rdi
  __int64 v19; // rsi
  int v20; // [rsp+40h] [rbp-28h] BYREF
  __int64 v21; // [rsp+48h] [rbp-20h]

  v11 = 0;
  a10 = 0;
  v12 = (int)sub_1932A2CC4(a1: a4, a2: a6, a3: a5);
  while ( 1 )
  {
    v21 = v14;
    if ( a11 - v11 <= 0x1FFFF )
      JUMPOUT(0x3264FE4D0LL);
    v20 = 0x1FFFF;
    if ( (unsigned int)MEMORY[0x799A8](a1: v13, a2: v14, a3: &v20, a4: v12, a5: 1, a6: &a10) == -1 )
      break;
    v11 += a10;
    v14 = a10 + v15;
    if ( v11 >= a11 || a10 != 0x1FFFF )
      return (unsigned int)v11;
  }
  if ( v11 > 0 )
    return (unsigned int)v11;
  v17 = MEMORY[0x79958](a1: v13, a2: v15);
  if ( v17 == 10035 )
    return 4294967294LL;
  if ( v17 == 10054 )
    sub_1932B1570(a1: v18, a2: v19, a3: 535440, a4: v18);
  else
    sub_1932B1580(a1: v18, a2: v19, a3: 534624, a4: v18);
  return 4294967291LL;
}
