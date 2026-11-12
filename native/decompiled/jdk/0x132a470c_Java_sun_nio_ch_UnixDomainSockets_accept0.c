// Java_sun_nio_ch_UnixDomainSockets_accept0
// rva 0x132a470c  size 268  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_UnixDomainSockets_accept0(
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
  __int64 v26; // rdi
  __int64 v27; // rsi
  int v28; // edi
  int v29; // esi
  int v30; // r9d
  __int64 v31; // rax
  __int64 v33[4]; // [rsp+0h] [rbp-C8h] BYREF
  int v34[4]; // [rsp+20h] [rbp-A8h] BYREF
  _BYTE v35[112]; // [rsp+30h] [rbp-98h] BYREF
  __int64 v36; // [rsp+A0h] [rbp-28h]

  v12 = (int)sub_1932A2CC4(a1: a4, a2: a11, a3: a5);
  v34[0] = 110;
  sub_1932CA161(a1: v13, a2: v14, a3: 0, a4: v35, a5: 110);
  v17 = MEMORY[0x79978](a1: v15, a2: v16, a3: v35, a4: v12, a5: v34);
  v20 = v17;
  if ( v17 == -1 )
  {
    if ( (unsigned int)MEMORY[0x79958](a1: v18, a2: v19) != 10035 )
      sub_1932B1580(a1: v22, a2: v23, a3: 535208, a4: v22);
  }
  else
  {
    MEMORY[0x79628](a1: v18, a2: v19, a3: 1, a4: (int)v17);
    sub_1932A2CEC(a1: v26, a2: v27, a3: a6, a4: v26, a5: v20);
    v31 = sub_1932A4CB0(
            a1: v28,
            a2: v29,
            a3: (unsigned int)v35,
            a4: v28,
            a5: v34[0],
            a6: v30,
            a7: v33[0],
            a8: v33[1],
            a9: v33[2]);
    if ( v31 != 0 )
      (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)v22 + 1392LL))(
        a1: v22,
        a2: v23,
        a3: v23,
        a4: v22,
        a5: 0,
        a6: v31);
  }
  return sub_1932C8DE0(a1: v22, a2: v23, a3: v21, a4: (unsigned __int64)v33 ^ v36, a5: v24, a6: v25);
}
