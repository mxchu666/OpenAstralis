// Java_sun_nio_ch_WindowsAsynchronousServerSocketChannelImpl_updateAcceptContext
// rva 0x132a7540  size 76  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_WindowsAsynchronousServerSocketChannelImpl_updateAcceptContext(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        int a7,
        int a8,
        __int64 a9)
{
  __int64 result; // rax
  __int64 v11; // rdi
  __int64 v12; // rsi

  a9 = a5;
  result = MEMORY[0x799F0](a1, a2, a3: 0xFFFF, a4: a6, a5: 28683, a6: &a9);
  if ( (_DWORD)result == -1 )
    return sub_1932B1580(a1: v11, a2: v12, a3: 536736, a4);
  return result;
}
