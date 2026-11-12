// Java_sun_nio_ch_WindowsSelectorImpl_resetWakeupSocket0
// rva 0x132a7bf4  size 181  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_WindowsSelectorImpl_resetWakeupSocket0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        int a5)
{
  __int64 v5; // rdx
  __int64 v6; // rdi
  __int64 v7; // rsi
  __int64 v8; // r8
  __int64 v9; // r9
  __int64 v10; // rax
  __int64 v11; // rdi
  __int64 v12; // rsi
  __int64 v13; // rbx
  __int64 v14; // rdx
  __int64 v15; // rdi
  __int64 v16; // rsi
  __int64 v18; // [rsp+0h] [rbp-48h] BYREF
  int v19; // [rsp+20h] [rbp-28h] BYREF
  _BYTE v20[16]; // [rsp+28h] [rbp-20h] BYREF
  __int64 v21; // [rsp+38h] [rbp-10h]

  MEMORY[0x799A0](a1: a5, a2: a4, a3: 1074030207, a4: a5, a5: &v19);
  if ( v19 != 0 )
  {
    if ( v19 <= 16 )
    {
      MEMORY[0x79998](a1: v6, a2: v7, a3: v20, a4: v6, a5: 16);
    }
    else
    {
      v10 = MEMORY[0x79AD0](a1: v6, a2: v7, a3: v5, a4: v19);
      v13 = v10;
      if ( v10 != 0 )
      {
        MEMORY[0x79998](a1: v11, a2: v12, a3: v10, a4: v11, a5: (unsigned int)v19);
        MEMORY[0x79AE0](a1: v15, a2: v16, a3: v14, a4: v13);
      }
      else
      {
        sub_1932B15D0(a1: v11, a2: v12, a3: 0, a4: v12);
      }
    }
  }
  return sub_1932C8DE0(a1: v6, a2: v7, a3: v5, a4: (unsigned __int64)&v18 ^ v21, a5: v8, a6: v9);
}
