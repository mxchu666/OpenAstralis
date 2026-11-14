// Java_sun_nio_ch_SocketDispatcher_read0
// rva 0x132a4214  size 229  section .text  group jdk
// window base 0x1932a4214: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_SocketDispatcher_read0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        int a8,
        int a9,
        int a10,
        int a11)
{
  __int64 v12; // rcx
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 v15; // rdi
  __int64 v16; // rsi
  int v17; // eax
  __int64 v18; // rdi
  __int64 v19; // rsi
  int v20; // r9d
  int v22; // [rsp+48h] [rbp-20h] BYREF
  __int64 v23; // [rsp+50h] [rbp-18h]

  a10 = 0;
  v12 = (int)sub_1932A2CC4(a1: a4, a2, a3: a5);
  if ( a11 > 0x1FFFF )
    JUMPOUT(0x3264FE269LL);
  v22 = a11;
  v23 = a6;
  if ( (unsigned int)MEMORY[0x799B0](a1: v13, a2: v14, a3: &v22, a4: v12, a5: 1, a6: &a10) != -1 )
    return sub_1932A2C98(a1: v15, a2: v16, a3: a10, a4: v15, a5: 1);
  v17 = MEMORY[0x79958](a1: v15, a2: v16);
  if ( v17 == 10035 )
    return 4294967294LL;
  if ( v17 == 10054 )
    sub_1932B12F8(a1: v18, a2: v19, a3: 535376, a4: v18, a5: 535352, a6: v20);
  else
    sub_1932B1580(a1: v18, a2: v19, a3: 534592, a4: v18);
  return 4294967291LL;
}
