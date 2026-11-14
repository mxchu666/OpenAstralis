// Java_sun_nio_ch_Net_pollConnect
// rva 0x132a3ab0  size 382  section .text  group jdk
// window base 0x1932a3ab0: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_Net_pollConnect(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  unsigned int v7; // eax
  __int64 v8; // rdi
  int v9; // eax
  __int64 v10; // rdx
  __int64 v11; // rdi
  __int64 v12; // rsi
  __int64 v13; // r8
  __int64 v14; // r9
  __int64 v15; // r8
  __int64 v16; // rbx
  unsigned int v17; // eax
  __int64 v19; // [rsp+0h] [rbp-100h] BYREF
  _DWORD *v20; // [rsp+20h] [rbp-E0h]
  unsigned int v21; // [rsp+30h] [rbp-D0h] BYREF
  _DWORD v22[3]; // [rsp+34h] [rbp-CCh] BYREF
  int v23; // [rsp+40h] [rbp-C0h] BYREF
  __int64 v24; // [rsp+48h] [rbp-B8h]
  int v25; // [rsp+250h] [rbp+150h] BYREF
  __int64 v26; // [rsp+258h] [rbp+158h]
  __int64 v27; // [rsp+460h] [rbp+360h]

  v22[0] = 4;
  v21 = 0;
  v7 = sub_1932A2CC4(a1: a4, a2, a3: a5);
  v24 = v7;
  v26 = v7;
  v23 = 1;
  v25 = 1;
  if ( a6 >= 0 )
  {
    v22[1] = a6 / 0x3E8uLL;
    v22[2] = 1000 * (a6 % 0x3E8uLL);
    JUMPOUT(0x3264FDB61LL);
  }
  v20 = nullptr;
  v9 = MEMORY[0x799C8](a1: v8, a2: (int)v7, a3: 0, a4: v7 + 1, a5: &v23, a6: &v25);
  if ( v9 == -1 )
  {
    v10 = (unsigned int)MEMORY[0x79958](a1: v11, a2: v12);
    v15 = 535340;
LABEL_13:
    sub_1932AED0C(a1: v11, a2: v12, a3: v10, a4: v11, a5: v15);
    return sub_1932C8DE0(a1: v11, a2: v12, a3: v10, a4: (unsigned __int64)&v19 ^ v27, a5: v13, a6: v14);
  }
  if ( v9 != 0 )
  {
    v16 = v12;
    if ( (unsigned int)sub_1932CA31D(a1: v11, a2: v12, a3: &v23, a4: v12) == 0
      || (unsigned int)sub_1932CA31D(a1: v11, a2: v12, a3: &v25, a4: v16) != 0 )
    {
      v20 = v22;
      if ( (unsigned int)MEMORY[0x799F8](a1: v11, a2: v12, a3: 0xFFFF, a4: v16, a5: 4103, a6: &v21) == -1 )
      {
        v17 = MEMORY[0x79958](a1: v11, a2: v12);
        if ( v17 != 10036 )
        {
          v10 = v17;
LABEL_12:
          v15 = 535240;
          goto LABEL_13;
        }
      }
      else
      {
        v10 = v21;
        if ( v21 != 0 )
          goto LABEL_12;
      }
    }
  }
  return sub_1932C8DE0(a1: v11, a2: v12, a3: v10, a4: (unsigned __int64)&v19 ^ v27, a5: v13, a6: v14);
}
