// Java_sun_nio_ch_WindowsAsynchronousSocketChannelImpl_initIDs
// rva 0x132a7668  size 271  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_WindowsAsynchronousSocketChannelImpl_initIDs(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4)
{
  __int64 v4; // rbx
  __int64 v5; // rdi
  __int64 v6; // rsi
  __int64 v7; // rdx
  __int64 v8; // rdi
  __int64 v9; // rsi
  __int64 v10; // r8
  __int64 v11; // r9
  __int64 v12; // rdx
  __int64 v13; // rdi
  __int64 v14; // rsi
  _QWORD v16[5]; // [rsp+0h] [rbp-70h] BYREF
  int v17; // [rsp+28h] [rbp-48h]
  char *v18; // [rsp+30h] [rbp-40h]
  __int64 v19; // [rsp+38h] [rbp-38h]
  __int64 v20; // [rsp+40h] [rbp-30h]
  char v21; // [rsp+50h] [rbp-20h] BYREF
  _DWORD v22[4]; // [rsp+58h] [rbp-18h] BYREF
  __int64 v23; // [rsp+68h] [rbp-8h]

  v22[0] = 631375801;
  v22[1] = 1180753395;
  v22[2] = -445191794;
  v22[3] = 1040610444;
  v4 = MEMORY[0x799E8](a1: a4, a2, a3: 1, a4: 2, a5: 0);
  if ( v4 == -1
    && ((unsigned int)MEMORY[0x79958](a1: v5, a2: v6) != 10047
     || (v4 = MEMORY[0x799E8](a1: v5, a2: v6, a3: 1, a4: 23, a5: 0)) == -1) )
  {
    sub_1932B1580(a1: v5, a2: v6, a3: 536688, a4: v5);
  }
  else
  {
    v20 = 0;
    v19 = 0;
    v18 = &v21;
    v17 = 8;
    v16[4] = 3372144;
    if ( (unsigned int)MEMORY[0x799B8](a1: v5, a2: v6, a3: 3355443206LL, a4: v4, a5: v22, a6: 16) != 0 )
      sub_1932B1580(a1: v13, a2: v14, a3: 536704, a4: v13);
    MEMORY[0x79A00](a1: v13, a2: v14, a3: v12, a4: v4);
  }
  return sub_1932C8DE0(a1: v8, a2: v9, a3: v7, a4: (unsigned __int64)v16 ^ v23, a5: v10, a6: v11);
}
