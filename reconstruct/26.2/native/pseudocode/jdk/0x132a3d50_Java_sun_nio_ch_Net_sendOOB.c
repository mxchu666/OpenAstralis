// Java_sun_nio_ch_Net_sendOOB
// rva 0x132a3d50  size 95  section .text  group jdk
// window base 0x1932a3d50: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_Net_sendOOB(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        char a6,
        int a7,
        int a8,
        int a9,
        char a10)
{
  int v11; // eax
  __int64 v12; // rdi
  __int64 v13; // rsi
  __int64 result; // rax
  __int64 v15; // rdi
  __int64 v16; // rsi
  __int64 v17; // rdi
  __int64 v18; // rsi

  a10 = a6;
  v11 = sub_1932A2CC4(a1, a2, a3: a5);
  result = MEMORY[0x79990](a1: v12, a2: v13, a3: &a10, a4: v11, a5: 1);
  if ( (_DWORD)result == -1 )
  {
    if ( (unsigned int)MEMORY[0x79958](a1: v15, a2: v16) == 10035 )
    {
      return 4294967294LL;
    }
    else
    {
      sub_1932B1580(a1: v17, a2: v18, a3: 535080, a4);
      return 4294967291LL;
    }
  }
  return result;
}
