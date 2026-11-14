// Java_sun_nio_ch_Net_poll
// rva 0x132a3920  size 400  section .text  group jdk
// window base 0x1932a3920: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_Net_poll(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        unsigned int a6,
        int a7,
        __int64 a8,
        int a9,
        int a10,
        __int64 a11)
{
  int v12; // eax
  __int64 v13; // rdi
  int v14; // eax
  __int64 v15; // rdx
  __int64 v16; // rsi
  __int64 v17; // r8
  __int64 v18; // r9
  __int64 v19; // rdi
  unsigned int v20; // eax
  __int64 v21; // rdi
  __int64 v22; // rsi
  unsigned int v23; // ebx
  __int64 v24; // rdi
  __int64 v25; // rsi
  __int64 v26; // rsi
  _QWORD v28[6]; // [rsp+0h] [rbp-100h] BYREF
  int v29; // [rsp+30h] [rbp-D0h]
  int v30; // [rsp+34h] [rbp-CCh]
  int v31; // [rsp+40h] [rbp-C0h] BYREF
  __int64 v32; // [rsp+48h] [rbp-B8h]
  int v33; // [rsp+250h] [rbp+150h] BYREF
  __int64 v34; // [rsp+258h] [rbp+158h]
  int v35; // [rsp+460h] [rbp+360h] BYREF
  __int64 v36; // [rsp+468h] [rbp+368h]
  __int64 v37; // [rsp+670h] [rbp+570h]

  v12 = sub_1932A2CC4(a1: a6, a2, a3: a5);
  v31 = 0;
  v33 = 0;
  if ( (v13 & 0x300) != 0 )
  {
    v32 = v12;
    v31 = 1;
  }
  if ( (v13 & 0x10) != 0 )
  {
    v34 = v12;
    v33 = 1;
  }
  v36 = v12;
  v35 = 1;
  if ( a11 >= 0 )
  {
    v29 = a11 / 0x3E8uLL;
    v30 = 1000 * (a11 % 0x3E8uLL);
    JUMPOUT(0x3264FD9FDLL);
  }
  v28[4] = 0;
  v14 = MEMORY[0x799C8](a1: v13, a2: v12, a3: &v31, a4: (unsigned int)(v12 + 1), a5: &v33, a6: &v35);
  v19 = (unsigned int)v14;
  if ( v14 == -1 )
  {
    v20 = MEMORY[0x79958](a1: 0xFFFFFFFFLL, a2: v16);
    sub_1932AED0C(a1: v21, a2: v22, a3: v20, a4, a5: 535340);
  }
  else if ( v14 >= 0 )
  {
    v23 = (unsigned int)sub_1932CA31D(a1: (unsigned int)v14, a2: v16, a3: &v31, a4: v16) != 0 ? 0x300 : 0;
    if ( (unsigned int)sub_1932CA31D(a1: v24, a2: v25, a3: &v33, a4: v25) != 0 )
      JUMPOUT(0x3264FDA7CLL);
    if ( (unsigned int)sub_1932CA31D(a1: v23, a2: v26, a3: &v35, a4: v26) != 0 )
      v19 = (unsigned int)v19 | 1;
  }
  return sub_1932C8DE0(a1: v19, a2: v16, a3: v15, a4: (unsigned __int64)v28 ^ v37, a5: v17, a6: v18);
}
