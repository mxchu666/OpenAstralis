// Java_sun_nio_ch_Net_joinOrDrop6
// rva 0x132a36dc  size 240  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_Net_joinOrDrop6(
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
        int a12,
        __int64 a13)
{
  void (__fastcall *v14)(__int64, __int64, __int64, __int64, _QWORD, __int64); // r10
  __int64 v15; // rdi
  __int64 v16; // rsi
  int v17; // eax
  __int64 v18; // rdi
  __int64 v19; // rsi
  int v20; // eax
  __int64 v21; // rdx
  __int64 v22; // rdi
  __int64 v23; // rsi
  __int64 v24; // r8
  __int64 v25; // r9
  unsigned int v26; // eax
  __int64 v27; // rdi
  __int64 v28; // rsi
  __int64 v30; // [rsp+0h] [rbp-68h] BYREF
  _BYTE *v31; // [rsp+20h] [rbp-48h]
  __int64 v32; // [rsp+28h] [rbp-40h]
  _BYTE v33[16]; // [rsp+30h] [rbp-38h] BYREF
  int v34; // [rsp+40h] [rbp-28h]
  __int64 v35; // [rsp+48h] [rbp-20h]

  if ( a13 != 0 )
  {
    v32 = a13;
    LODWORD(v31) = a12;
    v20 = sub_1932A4104(a1: a4, a2: a6, a3: a6, a4, a5: 46 - (unsigned int)(a5 != 0), a6: a11);
  }
  else
  {
    v14 = *(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1600LL);
    v31 = v33;
    v14(a1: a4, a2: a6, a3: a11, a4, a5: 0, a6: 16);
    v34 = a12;
    v17 = sub_1932A2CC4(a1: v15, a2: v16, a3: v16);
    LODWORD(v31) = 20;
    v20 = MEMORY[0x799F0](a1: v18, a2: v19, a3: 41, a4: v17, a5: 13 - (unsigned int)(a5 != 0), a6: v33);
  }
  if ( v20 == -1 )
  {
    v26 = MEMORY[0x79958](a1: v22, a2: v23);
    sub_1932AED0C(a1: v27, a2: v28, a3: v26, a4: v27, a5: 535272);
  }
  return sub_1932C8DE0(a1: v22, a2: v23, a3: v21, a4: (unsigned __int64)&v30 ^ v35, a5: v24, a6: v25);
}
