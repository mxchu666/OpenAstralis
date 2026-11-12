// Java_sun_nio_ch_IOUtil_write1
// rva 0x132a2bf8  size 98  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_IOUtil_write1(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        int a5,
        char a6,
        __int64 a7,
        int a8,
        int a9,
        char a10)
{
  int v10; // ebx
  __int64 v11; // rdi
  __int64 v12; // rsi
  __int64 v13; // rdi
  __int64 v14; // rsi

  a10 = a6;
  v10 = MEMORY[0x79990](a1: a4, a2, a3: &a10, a4: a5, a5: 1);
  if ( v10 != -1 || (unsigned int)MEMORY[0x79958](a1: v11, a2: v12) == 10035 )
    return v10 == 1;
  sub_1932B1580(a1: v13, a2: v14, a3: 535080, a4: v13);
  return 4294967291LL;
}
