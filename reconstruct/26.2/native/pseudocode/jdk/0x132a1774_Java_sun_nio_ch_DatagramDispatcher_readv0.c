// Java_sun_nio_ch_DatagramDispatcher_readv0
// rva 0x132a1774  size 353  section .text  group jdk
// window base 0x1932a1774: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_DatagramDispatcher_readv0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        int a7,
        int a8,
        int a9,
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
  __int64 v30; // r8
  int v31; // eax
  __int64 v32; // r9
  int v33; // edi
  int v34; // esi
  int v35; // r9d
  __int64 v36; // [rsp+0h] [rbp-68h]
  __int64 v37; // [rsp+8h] [rbp-60h]
  __int64 v38; // [rsp+10h] [rbp-58h]

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
  v24 = MEMORY[0x799B0](a1: v20, a2: v19, a3: v19, a4: v15, a5: a11, a6: &a10);
  MEMORY[0x79AE0](a1: v26, a2: v27, a3: v25, a4: v27);
  if ( v24 == 0 || (v31 = MEMORY[0x79958](a1: v28, a2: v29)) == 10040 )
  {
    LOBYTE(v30) = 1;
    return sub_1932A2C68(a1: v28, a2: v29, a3: a10, a4: v28, a5: v30);
  }
  else
  {
    if ( v31 != 10035 )
    {
      if ( v31 == 10054 )
      {
        sub_1932A155C(a1: v28, a2: v29, a3, a4: v28, a5: (unsigned int)v15, a6: v32, a7: v36, a8: v37, a9: v38);
        sub_1932B12F8(a1: v33, a2: v34, a3: 534480, a4: v33, a5: 0, a6: v35);
      }
      else
      {
        sub_1932B1580(a1: v28, a2: v29, a3: 534544, a4: v28);
      }
      return -5;
    }
    return -2;
  }
}
