// Java_sun_nio_ch_WindowsSelectorImpl_setWakeupSocket0
// rva 0x132a7cac  size 35  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_WindowsSelectorImpl_setWakeupSocket0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        int a5,
        __int64 a6,
        int a7,
        int a8,
        char a9)
{
  a9 = 1;
  return MEMORY[0x79990](a1, a2, a3: &a9, a4: a5, a5: 1);
}
