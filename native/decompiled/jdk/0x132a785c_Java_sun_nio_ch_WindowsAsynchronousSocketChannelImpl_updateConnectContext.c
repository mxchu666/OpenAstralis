// Java_sun_nio_ch_WindowsAsynchronousSocketChannelImpl_updateConnectContext
// rva 0x132a785c  size 69  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_WindowsAsynchronousSocketChannelImpl_updateConnectContext(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  __int64 result; // rax
  __int64 v7; // rdi
  __int64 v8; // rsi

  result = MEMORY[0x799F0](a1, a2, a3: 0xFFFF, a4: a5, a5: 28688, a6: 0);
  if ( (_DWORD)result == -1 )
    return sub_1932B1580(a1: v7, a2: v8, a3: 536736, a4);
  return result;
}
