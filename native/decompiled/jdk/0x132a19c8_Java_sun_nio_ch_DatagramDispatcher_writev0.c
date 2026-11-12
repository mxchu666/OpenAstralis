// Java_sun_nio_ch_DatagramDispatcher_writev0
// rva 0x132a19c8  size 330  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_DatagramDispatcher_writev0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        __int64 a9,
        unsigned int a10,
        unsigned int a11)
{
  int v13; // eax
  __int64 v14; // rbx
  __int64 v15; // r14
  __int64 v16; // rdx
  __int64 v17; // rdi
  __int64 v18; // rsi
  __int64 v19; // rax
  __int64 v20; // rdi
  _DWORD *v22; // rcx
  __int64 v23; // rdx
  int v24; // ebx
  __int64 v25; // rdx
  __int64 v26; // rdi
  __int64 v27; // rsi
  __int64 v28; // rdi
  __int64 v29; // rsi
  int v30; // eax
  __int64 v31; // rdi
  __int64 v32; // rsi
  __int64 v33; // r9
  int v34; // edi
  int v35; // esi
  int v36; // r9d
  __int64 v37; // [rsp+0h] [rbp-58h]
  __int64 v38; // [rsp+8h] [rbp-50h]
  __int64 v39; // [rsp+10h] [rbp-48h]

  a10 = 0;
  v13 = sub_1932A2CC4(a1: a4, a2, a3: a5);
  v14 = (int)a11;
  v15 = v13;
  v19 = MEMORY[0x79AD0](a1: v17, a2: v18, a3: v16, a4: 16LL * (int)a11);
  if ( v19 == 0 )
  {
    sub_1932B15D0(a1: v20, a2: 0, a3: 0, a4: v20);
    return -5;
  }
  if ( v14 > 0 )
  {
    v22 = (_DWORD *)(a6 + 8);
    v23 = v19 - a6;
    do
    {
      *(_QWORD *)((char *)v22 + v23) = *((_QWORD *)v22 - 1);
      *(_DWORD *)((char *)v22 + v23 - 8) = *v22;
      v22 += 4;
      --v14;
    }
    while ( v14 != 0 );
  }
  v24 = MEMORY[0x799A8](a1: v20, a2: v19, a3: v19, a4: v15, a5: a11, a6: &a10);
  MEMORY[0x79AE0](a1: v26, a2: v27, a3: v25, a4: v27);
  if ( v24 == 0 )
    return sub_1932A2C68(a1: v28, a2: v29, a3: a10, a4: v28, a5: 0);
  v30 = MEMORY[0x79958](a1: v28, a2: v29);
  if ( v30 != 10035 )
  {
    if ( v30 == 10054 )
    {
      sub_1932A155C(a1: v31, a2: v32, a3, a4: v31, a5: (unsigned int)v15, a6: v33, a7: v37, a8: v38, a9: v39);
      sub_1932B12F8(a1: v34, a2: v35, a3: 534480, a4: v34, a5: 0, a6: v36);
    }
    else
    {
      sub_1932B1580(a1: v31, a2: v32, a3: 534560, a4: v31);
    }
    return -5;
  }
  return -2;
}
