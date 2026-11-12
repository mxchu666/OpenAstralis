// Java_sun_nio_ch_Net_joinOrDrop4
// rva 0x132a35c0  size 283  section .text  group jdk
// window base 0x1932a35c0: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_Net_joinOrDrop4(
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
  int v14; // eax
  __int64 v15; // rdx
  __int64 v16; // rdi
  __int64 v17; // rsi
  __int64 v18; // rdi
  __int64 v19; // rsi
  _DWORD *v20; // rbp
  int v21; // r14d
  unsigned int v22; // ebx
  __int64 v23; // rdx
  __int64 v24; // rdi
  __int64 v25; // rsi
  int v26; // eax
  __int64 v27; // rdi
  __int64 v28; // rsi
  __int64 v29; // rdx
  __int64 v30; // rdi
  __int64 v31; // rsi
  __int64 v32; // r8
  __int64 v33; // r9
  unsigned int v34; // eax
  __int64 v35; // rdi
  __int64 v36; // rsi
  _DWORD v38[12]; // [rsp+0h] [rbp-78h] BYREF
  _DWORD v39[2]; // [rsp+30h] [rbp-48h] BYREF
  _DWORD v40[4]; // [rsp+38h] [rbp-40h] BYREF
  __int64 v41; // [rsp+48h] [rbp-30h]

  LOBYTE(a1) = a5;
  v14 = MEMORY[0x79940](a1, a2: a4, a3, a4: a11);
  if ( a13 != 0 )
  {
    v40[0] = v14;
    v40[1] = MEMORY[0x79940](a1: v16, a2: v17, a3: v15, a4: a13);
    v40[2] = MEMORY[0x79940](a1: v24, a2: v25, a3: v23, a4: a12);
    v20 = v40;
    v21 = 12;
    v22 = 16 - ((_BYTE)v18 != 0);
  }
  else
  {
    v39[0] = v14;
    v39[1] = MEMORY[0x79940](a1: v16, a2: v17, a3: v15, a4: a12);
    v20 = v39;
    v21 = 8;
    v22 = 13 - ((_BYTE)v18 != 0);
  }
  v26 = sub_1932A2CC4(a1: v18, a2: v19, a3: a6);
  v38[8] = v21;
  if ( (unsigned int)MEMORY[0x799F0](a1: v27, a2: v28, a3: 0, a4: v26, a5: v22, a6: v20) == -1
    && ((_BYTE)v30 == 0 || (unsigned int)MEMORY[0x79958](a1: v30, a2: v31) != 10042) )
  {
    v34 = MEMORY[0x79958](a1: v30, a2: v31);
    sub_1932AED0C(a1: v35, a2: v36, a3: v34, a4: v36, a5: 535256);
  }
  return sub_1932C8DE0(a1: v30, a2: v31, a3: v29, a4: (unsigned __int64)v38 ^ v41, a5: v32, a6: v33);
}
