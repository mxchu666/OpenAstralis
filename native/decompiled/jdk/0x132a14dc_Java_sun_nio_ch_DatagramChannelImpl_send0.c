// Java_sun_nio_ch_DatagramChannelImpl_send0
// rva 0x132a14dc  size 126  section .text  group jdk
// window base 0x1932a14dc: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_DatagramChannelImpl_send0(
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
        unsigned int a11)
{
  int v12; // eax
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 result; // rax
  __int64 v16; // rdi
  __int64 v17; // rsi
  __int64 v18; // rdi
  __int64 v19; // rsi
  unsigned int v20; // eax
  __int64 v21; // rdi
  __int64 v22; // rsi

  v12 = sub_1932A2CC4(a1: a4, a2, a3: a5);
  result = MEMORY[0x799C0](a1: v13, a2: v14, a3: a6, a4: v12, a5: a11, a6: 0);
  if ( (_DWORD)result == -1 )
  {
    if ( (unsigned int)MEMORY[0x79958](a1: v16, a2: v17) == 10035 )
    {
      return 4294967294LL;
    }
    else
    {
      v20 = MEMORY[0x79958](a1: v18, a2: v19);
      sub_1932AED0C(a1: v21, a2: v22, a3: v20, a4: v21, a5: 534532);
      return 4294967291LL;
    }
  }
  return result;
}
