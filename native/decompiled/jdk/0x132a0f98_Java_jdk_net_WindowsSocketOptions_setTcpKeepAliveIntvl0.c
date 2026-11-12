// Java_jdk_net_WindowsSocketOptions_setTcpKeepAliveIntvl0
// rva 0x132a0f98  size 67  section .text  group jdk
// window base 0x1932a0f98: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_jdk_net_WindowsSocketOptions_setTcpKeepAliveIntvl0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        int a4,
        int a5,
        int a6,
        int a7,
        int a8,
        int a9,
        int a10)
{
  int v11; // eax
  int v12; // edi
  int v13; // esi
  int v14; // r9d

  a10 = a6;
  v11 = MEMORY[0x799F0](a1, a2, a3: 6, a4: a5, a5: 17, a6: &a10);
  return sub_1932A1064(a1: v12, a2: v13, a3: v11, a4, a5: 534264, a6: v14);
}
