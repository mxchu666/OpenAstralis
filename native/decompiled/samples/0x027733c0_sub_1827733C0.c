// sub_1827733C0
// rva 0x027733c0  size 112  section .text  group samples
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall sub_1827733C0(__int64 a1, _DWORD *a2, __int64 a3, __int64 a4, __int64 a5)
{
  __int64 v5; // r14
  __int64 v6; // rcx
  __int64 v7; // rcx
  __int64 v8; // rsi
  int v10; // [rsp+0h] [rbp-98h]
  __int64 v12[14]; // [rsp+10h] [rbp-88h] BYREF
  __int64 *v13; // [rsp+80h] [rbp-18h]
  __int64 v14; // [rsp+88h] [rbp-10h]
  __int64 v15; // [rsp+90h] [rbp-8h]

  v6 = *(_QWORD *)(a3 + 56);
  v15 = a5;
  v14 = a3;
  v13 = v12;
  sub_182772F00(a1: 0, a2: 0, a3: (__int64)v12, a4: v6, a5: a3, a6: a5);
  return sub_182772A60(
           a1: v5,
           a2: v8,
           a3: v13,
           a4: v7,
           a5: v14,
           a6: a2,
           a7: v10,
           a8: (int)a2,
           a9: v12[0],
           a10: v12[1],
           a11: v12[2],
           a12: v12[3],
           a13: v12[4],
           a14: v12[5]);
}
