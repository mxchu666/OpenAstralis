// Java_sun_nio_ch_DatagramChannelImpl_receive0
// rva 0x132a13f8  size 228  section .text  group jdk
// window base 0x1932a13f8: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_DatagramChannelImpl_receive0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        __int64 a9,
        int a10,
        unsigned int a11,
        __int64 a12,
        char a13)
{
  __int64 v15; // rdi
  __int64 v16; // rsi
  __int64 result; // rax
  __int64 v18; // rdi
  __int64 v19; // rsi
  unsigned int v20; // eax
  __int64 v21; // rdi
  __int64 v22; // rsi
  int v23; // r9d

  v15 = (int)sub_1932A2CC4(a1, a2: a3, a3: a5);
  while ( 1 )
  {
    result = MEMORY[0x799D0](a1: v15, a2: v16, a3: a6, a4: v15, a5: a11, a6: 0);
    if ( (_DWORD)result != -1 )
      return result;
    v20 = MEMORY[0x79958](a1: v18, a2: v19);
    if ( v20 == 10040 )
      return a11;
    if ( v20 != 10054 )
      break;
    sub_1932A155C(a1: v21, a2: v22, a3: v22, a4, a5: (unsigned int)v21);
    if ( a13 != 0 )
    {
      sub_1932B12F8(a1: v15, a2: v16, a3: 534480, a4, a5: 0, a6: v23);
      return 4294967291LL;
    }
  }
  if ( v20 != 10035 )
  {
    sub_1932AED0C(a1: v21, a2: v22, a3: v20, a4, a5: 534520);
    return 4294967291LL;
  }
  return 4294967294LL;
}
