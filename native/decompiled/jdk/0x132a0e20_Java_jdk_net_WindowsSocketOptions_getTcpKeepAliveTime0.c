// Java_jdk_net_WindowsSocketOptions_getTcpKeepAliveTime0
// rva 0x132a0e20  size 77  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_jdk_net_WindowsSocketOptions_getTcpKeepAliveTime0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        int a4,
        int a5,
        __int64 a6,
        int a7,
        int a8,
        int a9,
        unsigned int a10)
{
  int v11; // eax
  int v12; // edi
  int v13; // esi
  int v14; // r9d

  v11 = MEMORY[0x799F8](a1, a2, a3: 6, a4: a5, a5: 3, a6: &a10);
  sub_1932A1064(a1: v12, a2: v13, a3: v11, a4, a5: 534232, a6: v14);
  return a10;
}
