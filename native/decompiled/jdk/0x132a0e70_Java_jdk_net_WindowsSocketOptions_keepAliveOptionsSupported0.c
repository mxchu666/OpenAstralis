// Java_jdk_net_WindowsSocketOptions_keepAliveOptionsSupported0
// rva 0x132a0e70  size 65  section .text  group jdk
// window base 0x1932a0e70: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
bool __fastcall Java_jdk_net_WindowsSocketOptions_keepAliveOptionsSupported0(
        int a1,
        int a2,
        __int64 a3,
        __int64 a4,
        int a5,
        int a6)
{
  int v6; // edi
  int v7; // esi
  int v8; // r8d
  int v9; // r9d
  char v10; // bl
  int v11; // edi
  int v12; // esi
  int v13; // r8d
  int v14; // r9d

  v10 = 0;
  if ( (unsigned int)sub_1932A10B8(a1, a2, a3: 3, a4: 6, a5, a6) != 0
    && (unsigned int)sub_1932A10B8(a1: v6, a2: v7, a3: 16, a4: 6, a5: v8, a6: v9) != 0 )
  {
    return (unsigned int)sub_1932A10B8(a1: v11, a2: v12, a3: 17, a4: 6, a5: v13, a6: v14) != 0;
  }
  return v10;
}
