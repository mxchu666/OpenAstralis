// Java_sun_nio_ch_Net_getIntOption0
// rva 0x132a3320  size 285  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_Net_getIntOption0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        char a6,
        __int64 a7,
        __int64 a8,
        int a9,
        int a10,
        unsigned int a11,
        unsigned int a12)
{
  unsigned int *v13; // rbx
  int v14; // eax
  int v15; // edi
  int v16; // esi
  int v17; // eax
  __int64 v18; // rdi
  __int64 v19; // rsi
  int v20; // eax
  __int64 v21; // rdi
  __int64 v22; // rsi
  unsigned int v23; // eax
  __int64 v24; // rdi
  __int64 v25; // rsi
  unsigned int v27; // [rsp+30h] [rbp-18h] BYREF
  _WORD v28[8]; // [rsp+38h] [rbp-10h] BYREF

  v27 = 0;
  if ( a11 == 0xFFFF && a12 == 128 )
  {
    v13 = (unsigned int *)v28;
  }
  else
  {
    v13 = &v27;
    if ( a11 == 0 && a12 == 3 )
      goto LABEL_9;
    v13 = &v27;
    if ( a11 == 41 && a12 == 39 )
      goto LABEL_9;
  }
  if ( a6 != 0 )
  {
LABEL_9:
    v14 = sub_1932A2CC4(a1, a2, a3: a5);
    v17 = sub_1932AE8E0(a1: v15, a2: v16, a3: a11, a4: v14, a5: a12, a6: (_DWORD)v13);
    goto LABEL_11;
  }
  v20 = sub_1932A2CC4(a1, a2, a3: a5);
  v17 = MEMORY[0x799F8](a1: v21, a2: v22, a3: a11, a4: v20, a5: a12, a6: v13);
LABEL_11:
  if ( v17 == -1 )
  {
    v23 = MEMORY[0x79958](a1: v18, a2: v19);
    sub_1932AED0C(a1: v24, a2: v25, a3: v23, a4, a5: 535240);
    return 4294967291LL;
  }
  else if ( a11 == 0xFFFF && a12 == 128 )
  {
    if ( v28[0] == 0 )
      JUMPOUT(0x3264FD426LL);
    return v28[1];
  }
  else
  {
    return v27;
  }
}
