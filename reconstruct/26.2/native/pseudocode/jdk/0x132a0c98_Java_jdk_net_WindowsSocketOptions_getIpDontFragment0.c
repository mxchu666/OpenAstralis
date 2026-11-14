// Java_jdk_net_WindowsSocketOptions_getIpDontFragment0
// rva 0x132a0c98  size 230  section .text  group jdk
// window base 0x1932a0c98: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
bool __fastcall Java_jdk_net_WindowsSocketOptions_getIpDontFragment0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        int a4,
        int a5,
        char a6,
        __int64 a7,
        __int64 a8,
        __int64 a9,
        int a10)
{
  __int64 v11; // rdi
  __int64 v12; // rsi
  int v13; // r9d
  __int64 v14; // rdx
  int v15; // eax
  int v16; // edi
  int v17; // esi
  int v18; // r9d

  if ( a6 != 0 )
  {
    LODWORD(v12) = MEMORY[0x799F8](a1: a5, a2, a3: 41, a4: a5, a5: 71, a6: &a10);
    if ( (_DWORD)v12 == -1 && (unsigned int)MEMORY[0x79958](a1: v11, a2: 0xFFFFFFFFLL) == 10042 )
    {
      v14 = (unsigned int)(v12 + 42);
      goto LABEL_8;
    }
  }
  else
  {
    LODWORD(v12) = MEMORY[0x799F8](a1: a5, a2, a3: 0, a4: a5, a5: 71, a6: &a10);
    if ( (_DWORD)v12 == -1 && (unsigned int)MEMORY[0x79958](a1: v11, a2: 0xFFFFFFFFLL) == 10042 )
    {
      v14 = 0;
LABEL_8:
      v15 = MEMORY[0x799F8](a1: v11, a2: v12, a3: v14, a4: v11, a5: 14, a6: &a10);
      sub_1932A1064(a1: v16, a2: v17, a3: v15, a4, a5: 534096, a6: v18);
      return a10;
    }
  }
  sub_1932A1064(a1: v11, a2: v12, a3: v12, a4, a5: 534096, a6: v13);
  return a10 == 1;
}
