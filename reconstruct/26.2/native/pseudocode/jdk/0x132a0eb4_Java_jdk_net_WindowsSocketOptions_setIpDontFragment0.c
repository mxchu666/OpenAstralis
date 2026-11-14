// Java_jdk_net_WindowsSocketOptions_setIpDontFragment0
// rva 0x132a0eb4  size 226  section .text  group jdk
// window base 0x1932a0eb4: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_jdk_net_WindowsSocketOptions_setIpDontFragment0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        int a4,
        int a5,
        unsigned __int8 a6,
        __int64 a7,
        __int64 a8,
        __int64 a9,
        int a10,
        int a11)
{
  int v12; // ebx
  __int64 v13; // rdi
  __int64 v14; // rsi
  int v15; // r9d
  __int64 v16; // rdx

  if ( (_BYTE)a11 != 0 )
  {
    a11 = 2 - (a6 != 0);
    v12 = MEMORY[0x799F0](a1: a6, a2: a5, a3: 41, a4: a5, a5: 71, a6: &a11);
    if ( v12 == -1 && (unsigned int)MEMORY[0x79958](a1: v13, a2: v14) == 10042 )
    {
      v16 = (unsigned int)(v12 + 42);
      goto LABEL_8;
    }
  }
  else
  {
    a11 = 2 - (a6 != 0);
    v12 = MEMORY[0x799F0](a1: a6, a2: a5, a3: 0, a4: a5, a5: 71, a6: &a11);
    if ( v12 == -1 && (unsigned int)MEMORY[0x79958](a1: v13, a2: v14) == 10042 )
    {
      v16 = 0;
LABEL_8:
      a11 = v13;
      v12 = MEMORY[0x799F0](a1: v13, a2: v14, a3: v16, a4: v14, a5: 14, a6: &a11);
    }
  }
  return sub_1932A1064(a1: v13, a2: v14, a3: v12, a4, a5: 534056, a6: v15);
}
