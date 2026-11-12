// Java_sun_nio_ch_Net_accept
// rva 0x132a2d04  size 317  section .text  group jdk
// window base 0x1932a2d04: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_Net_accept(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        int a7,
        __int64 a8,
        int a9,
        int a10,
        __int64 a11)
{
  __int64 v12; // rbx
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 v15; // rdi
  __int64 v16; // rsi
  unsigned int v17; // eax
  __int64 v18; // rdi
  __int64 v19; // rsi
  unsigned int v20; // ebx
  __int64 v21; // rdx
  __int64 v22; // rdi
  __int64 v23; // rsi
  __int64 v24; // r8
  __int64 v25; // r9
  __int64 v27; // rdi
  __int64 v28; // rsi
  int v29; // edi
  int v30; // esi
  int v31; // r9d
  __int64 v32; // rax
  __int64 (__fastcall *v33)(__int64, __int64, _QWORD, __int64, _QWORD, __int64); // r10
  __int64 v34; // rax
  __int64 v35[4]; // [rsp+0h] [rbp-78h] BYREF
  int v36; // [rsp+20h] [rbp-58h]
  int v37; // [rsp+30h] [rbp-48h] BYREF
  int v38; // [rsp+34h] [rbp-44h] BYREF
  _BYTE v39[32]; // [rsp+38h] [rbp-40h] BYREF
  __int64 v40; // [rsp+58h] [rbp-20h]

  v12 = (int)sub_1932A2CC4(a1: a4, a2: a11, a3: a5);
  v38 = 28;
  v37 = 0;
  sub_1932CA161(a1: v13, a2: v14, a3: 0, a4: v39, a5: 28);
  v17 = MEMORY[0x79978](a1: v15, a2: v16, a3: v39, a4: v12, a5: &v38);
  v20 = v17;
  if ( v17 == -1 )
  {
    if ( (unsigned int)MEMORY[0x79958](a1: v18, a2: v19) != 10035 )
      sub_1932B1580(a1: v22, a2: v23, a3: 535208, a4: v22);
  }
  else
  {
    MEMORY[0x79628](a1: v18, a2: v19, a3: 1, a4: (int)v17);
    sub_1932A2CEC(a1: v27, a2: v28, a3: a6, a4: v27, a5: v20);
    v32 = sub_1932A9D88(
            a1: v29,
            a2: v30,
            a3: (unsigned int)v39,
            a4: v29,
            a5: (unsigned int)&v37,
            a6: v31,
            a7: v35[0],
            a8: v35[1],
            a9: v35[2],
            a10: v35[3]);
    if ( v32 != 0 )
    {
      v33 = *(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64, _QWORD, __int64))(*(_QWORD *)v22 + 224LL);
      v36 = v37;
      v34 = v33(a1: v22, a2: v23, a3: MEMORY[0x337118], a4: v22, a5: MEMORY[0x337120], a6: v32);
      if ( v34 != 0 )
        (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)v22 + 1392LL))(
          a1: v22,
          a2: v23,
          a3: v23,
          a4: v22,
          a5: 0,
          a6: v34);
    }
  }
  return sub_1932C8DE0(a1: v22, a2: v23, a3: v21, a4: (unsigned __int64)v35 ^ v40, a5: v24, a6: v25);
}
