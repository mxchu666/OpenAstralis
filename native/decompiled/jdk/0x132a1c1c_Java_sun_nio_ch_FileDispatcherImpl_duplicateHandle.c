// Java_sun_nio_ch_FileDispatcherImpl_duplicateHandle
// rva 0x132a1c1c  size 101  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_FileDispatcherImpl_duplicateHandle(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        int a8,
        __int64 a9)
{
  __int64 v10; // rax
  __int64 v11; // rdi
  __int64 v12; // rsi
  __int64 v13; // rdi
  __int64 v14; // rsi

  v10 = MEMORY[0x79778](a1: a4);
  if ( (unsigned int)MEMORY[0x797A0](a1: v11, a2: v12, a3: a5, a4: v10, a5: v10, a6: &a9) == 0 )
    sub_1932B1580(a1: v13, a2: v14, a3: 534808, a4: v13);
  return a9;
}
