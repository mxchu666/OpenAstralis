// Java_sun_nio_ch_SocketDispatcher_writev0
// rva 0x132a4564  size 422  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_SocketDispatcher_writev0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        int a9,
        __int64 a10,
        int a11)
{
  int v11; // r14d
  __int64 v12; // rbx
  __int64 v13; // r12
  __int64 v14; // rdx
  __int64 v15; // rdi
  __int64 v16; // rdx
  __int64 v17; // rsi
  __int64 v18; // r15
  __int64 v19; // rdi
  __int64 v21; // rbp
  unsigned int v22; // r11d
  int v23; // r10d
  int v24; // r14d
  __int64 v25; // r8
  int v26; // r9d
  __int64 v27; // rcx
  __int64 v28; // rdi
  __int64 v29; // rsi
  int v30; // eax
  __int64 v31; // rdi
  __int64 v32; // rsi
  _DWORD v33[18]; // [rsp+40h] [rbp-48h] BYREF

  v11 = 0;
  v33[0] = 0;
  v12 = a4;
  v13 = (int)sub_1932A2CC4(a1, a2, a3: a5);
  v18 = MEMORY[0x79AD0](a1: v15, a2: a11, a3: v14, a4: 16LL * a11);
  v19 = 0;
  if ( v18 == 0 )
  {
    sub_1932B15D0(a1: 0, a2: v17, a3: 0, a4: v12);
    return -5;
  }
  if ( v17 > 0 )
  {
    v21 = 0;
    do
    {
      v22 = 0;
      v23 = 0x1FFFF;
      while ( v21 < v17 )
      {
        v24 = v23;
        if ( v23 <= 0 )
          break;
        v25 = 2 * v21;
        v26 = *(_DWORD *)(a6 + 16 * v21 + 8);
        if ( v26 > v23 )
          JUMPOUT(0x3264FE619LL);
        ++v21;
        v27 = 2LL * v22++;
        v23 -= v26;
        *(_QWORD *)(v18 + 8 * v27 + 8) = *(_QWORD *)(a6 + 8 * v25);
        if ( v26 > v24 )
          JUMPOUT(0x3264FE641LL);
        *(_DWORD *)(v18 + 8 * v27) = v26;
      }
      v11 = MEMORY[0x799A8](a1: v19, a2: v17, a3: v18, a4: v13, a5: v22, a6: v33);
      if ( v11 == -1 )
        break;
      v19 += v33[0];
    }
    while ( v21 < v17 );
    v12 = a4;
  }
  MEMORY[0x79AE0](a1: v19, a2: v17, a3: v16, a4: v18);
  if ( v11 != -1 || v28 != 0 )
    return sub_1932A2C68(a1: v28, a2: v29, a3: v28, a4: v12, a5: 0);
  v30 = MEMORY[0x79958](a1: 0, a2: v29);
  if ( v30 != 10035 )
  {
    if ( v30 == 10054 )
      sub_1932B1570(a1: v31, a2: v32, a3: 535440, a4: v12);
    else
      sub_1932B1580(a1: v31, a2: v32, a3: 535472, a4: v12);
    return -5;
  }
  return v31 - 2;
}
