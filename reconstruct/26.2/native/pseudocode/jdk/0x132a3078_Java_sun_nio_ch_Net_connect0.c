// Java_sun_nio_ch_Net_connect0
// rva 0x132a3078  size 518  section .text  group jdk
// window base 0x1932a3078: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_Net_connect0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        char a5,
        __int64 a6,
        int a7,
        int a8,
        int a9,
        int a10,
        __int64 a11,
        int a12)
{
  __int64 v13; // r15
  int v14; // edi
  int v15; // esi
  __int64 v16; // rdx
  __int64 v17; // rdi
  __int64 v18; // rsi
  __int64 v19; // r8
  __int64 v20; // r9
  __int64 v21; // rdx
  int v22; // ebx
  __int64 v23; // rdi
  __int64 v24; // rsi
  bool v25; // zf
  int v26; // edx
  int v27; // r8d
  int v28; // r9d
  unsigned int v29; // eax
  int v31; // [rsp+0h] [rbp-79h] BYREF
  int v32; // [rsp+8h] [rbp-71h]
  __int64 v33; // [rsp+10h] [rbp-69h]
  int v34; // [rsp+18h] [rbp-61h]
  int *v35; // [rsp+20h] [rbp-59h]
  int v36; // [rsp+28h] [rbp-51h]
  int *v37; // [rsp+30h] [rbp-49h]
  __int64 v38; // [rsp+38h] [rbp-41h]
  __int64 v39; // [rsp+40h] [rbp-39h]
  int v40; // [rsp+50h] [rbp-29h] BYREF
  unsigned int v41; // [rsp+54h] [rbp-25h] BYREF
  int v42; // [rsp+58h] [rbp-21h] BYREF
  int v43; // [rsp+5Ch] [rbp-1Dh] BYREF
  int v44; // [rsp+60h] [rbp-19h] BYREF
  _WORD v45[2]; // [rsp+68h] [rbp-11h] BYREF
  unsigned int v46; // [rsp+6Ch] [rbp-Dh]
  unsigned __int16 v47; // [rsp+70h] [rbp-9h]
  __int16 v48; // [rsp+72h] [rbp-7h]
  unsigned __int16 v49; // [rsp+74h] [rbp-5h]
  unsigned __int16 v50; // [rsp+76h] [rbp-3h]
  unsigned __int16 v51; // [rsp+78h] [rbp-1h]
  __int16 v52; // [rsp+7Ah] [rbp+1h]
  __int16 v53; // [rsp+7Ch] [rbp+3h]
  __int16 v54; // [rsp+7Eh] [rbp+5h]
  __int64 v55; // [rsp+88h] [rbp+Fh]

  v41 = 0;
  LOBYTE(a1) = a5;
  v13 = (int)sub_1932A2CC4(a1, a2, a3: a6);
  v40 = 0;
  v42 = 4;
  if ( (unsigned int)sub_1932AE988(
                       a1: v14,
                       a2: v15,
                       a3: a11,
                       a4,
                       a5: a12,
                       a6: (unsigned int)v45,
                       a7: v31,
                       a8: v32,
                       a9: v33,
                       a10: v34,
                       a11: (__int64)&v41,
                       a12: v14) != 0 )
    return sub_1932C8DE0(a1: v17, a2: v18, a3: v16, a4: (unsigned __int64)&v31 ^ v55, a5: v19, a6: v20);
  v35 = &v42;
  v22 = MEMORY[0x799F8](a1: 0xFFFF, a2: v18, a3: 0xFFFF, a4: v13, a5: 4104, a6: &v40);
  if ( v22 == 0 && v40 == 1 )
  {
    if ( v45[0] == 2 )
    {
      v25 = (MEMORY[0x79930](a1: v23, a2: v24, a3: v21, a4: v46) & 0xFF000000) == 2130706432;
      goto LABEL_19;
    }
    v26 = v47;
    v28 = v51;
    v27 = v50;
    if ( v47 != 0 )
      goto LABEL_21;
    if ( v48 == 0 && __PAIR32__(v49, 0) == v50 && v51 == 0 && v52 == 0 && v53 == 0 )
    {
      LODWORD(v23) = 256;
      if ( v54 == 256 )
      {
LABEL_20:
        sub_1932AE854(a1: v23, a2: v24, a3: v26, a4: v13, a5: v27, a6: v28, a7: v31, a8: v32, a9: v33);
        goto LABEL_21;
      }
      v23 = 0xFFFF;
    }
    if ( v48 == 0 && __PAIR32__(v49, 0) == v50 && v51 == 0 && v52 == (_WORD)v23 )
    {
      v25 = (_BYTE)v53 == 127;
LABEL_19:
      if ( !v25 )
        goto LABEL_21;
      goto LABEL_20;
    }
  }
LABEL_21:
  if ( (unsigned int)MEMORY[0x799D8](a1: v23, a2: v24, a3: v45, a4: v13, a5: v41) != 0 )
  {
    v29 = MEMORY[0x79958](a1: v17, a2: v18);
    v16 = v29 - 10035;
    if ( (unsigned int)v16 > 1 )
      sub_1932AED0C(a1: v17, a2: v18, a3: v29, a4, a5: 534472);
  }
  else if ( v22 == 0 && v40 == 2 )
  {
    v39 = 0;
    v38 = 0;
    v37 = &v43;
    v36 = 0;
    v35 = nullptr;
    v44 = 1;
    v43 = 0;
    MEMORY[0x799B8](a1: v17, a2: v18, a3: 2550136844LL, a4: v13, a5: &v44, a6: 4);
  }
  return sub_1932C8DE0(a1: v17, a2: v18, a3: v16, a4: (unsigned __int64)&v31 ^ v55, a5: v19, a6: v20);
}
