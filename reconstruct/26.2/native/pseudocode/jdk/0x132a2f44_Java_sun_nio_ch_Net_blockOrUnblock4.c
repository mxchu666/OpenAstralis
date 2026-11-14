// Java_sun_nio_ch_Net_blockOrUnblock4
// rva 0x132a2f44  size 214  section .text  group jdk
// window base 0x1932a2f44: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_Net_blockOrUnblock4(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        char a5,
        __int64 a6,
        int a7,
        __int64 a8,
        int a9,
        int a10,
        unsigned int a11,
        unsigned int a12,
        unsigned int a13)
{
  __int64 v14; // rdx
  __int64 v15; // rdi
  __int64 v16; // rsi
  __int64 v17; // rdx
  __int64 v18; // rdi
  __int64 v19; // rsi
  __int64 v20; // rsi
  int v21; // ebx
  __int64 v22; // rdi
  int v23; // eax
  __int64 v24; // rdi
  __int64 v25; // rsi
  __int64 v26; // rdx
  __int64 v27; // rdi
  __int64 v28; // rsi
  __int64 v29; // r8
  __int64 v30; // r9
  unsigned int v31; // eax
  __int64 v32; // rdi
  __int64 v33; // rsi
  _DWORD v35[12]; // [rsp+0h] [rbp-68h] BYREF
  _DWORD v36[4]; // [rsp+30h] [rbp-38h] BYREF
  __int64 v37; // [rsp+40h] [rbp-28h]

  LOBYTE(a2) = a5;
  v36[0] = MEMORY[0x79940](a1: a6, a2, a3, a4: a11);
  v36[1] = MEMORY[0x79940](a1: v15, a2: v16, a3: v14, a4: a13);
  v36[2] = MEMORY[0x79940](a1: v18, a2: v19, a3: v17, a4: a12);
  v21 = -((_BYTE)v20 != 0);
  v23 = sub_1932A2CC4(a1: v22, a2: v20, a3: v22);
  v35[8] = 12;
  if ( (unsigned int)MEMORY[0x799F0](a1: v24, a2: v25, a3: 0, a4: v23, a5: (unsigned int)(v21 + 18), a6: v36) == -1
    && ((_BYTE)v28 == 0 || (unsigned int)MEMORY[0x79958](a1: v27, a2: v28) != 10042) )
  {
    v31 = MEMORY[0x79958](a1: v27, a2: v28);
    sub_1932AED0C(a1: v32, a2: v33, a3: v31, a4, a5: 535272);
  }
  return sub_1932C8DE0(a1: v27, a2: v28, a3: v26, a4: (unsigned __int64)v35 ^ v37, a5: v29, a6: v30);
}
