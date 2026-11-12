// Java_sun_nio_ch_SocketDispatcher_readv0
// rva 0x132a42fc  size 361  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_SocketDispatcher_readv0(
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
        int a11)
{
  int v12; // eax
  __int64 v13; // r14
  __int64 v14; // r15
  __int64 v15; // rdx
  __int64 v16; // rdi
  __int64 v17; // rsi
  __int64 v18; // rax
  __int64 v19; // rdi
  int v20; // r10d
  int v22; // r8d
  __int64 v23; // r9
  _QWORD *v24; // rdx
  __int64 v25; // rbp
  int v26; // ecx
  int v27; // ebx
  __int64 v28; // rdx
  __int64 v29; // rdi
  __int64 v30; // rsi
  __int64 v31; // rdi
  __int64 v32; // rsi
  int v33; // eax
  __int64 v34; // rdi
  __int64 v35; // rsi
  int v36; // r9d

  a10 = 0;
  v12 = sub_1932A2CC4(a1: a4, a2, a3: a5);
  v13 = a11;
  v14 = v12;
  v18 = MEMORY[0x79AD0](a1: v16, a2: v17, a3: v15, a4: 16LL * a11);
  v20 = 0x1FFFF;
  if ( v18 == 0 )
  {
    sub_1932B15D0(a1: v19, a2: 0, a3: 0, a4: v19);
    return -5;
  }
  v22 = 0;
  if ( (int)v13 > 0 )
  {
    v23 = 0;
    v24 = (_QWORD *)(v18 + 8);
    v25 = a6 - v18;
    while ( 1 )
    {
      ++v22;
      if ( *(_DWORD *)((char *)v24 + v25) > v20 )
        JUMPOUT(0x3264FE392LL);
      v26 = *(_DWORD *)((char *)v24 + v25);
      *v24 = *(_QWORD *)((char *)v24 + v25 - 8);
      *((_DWORD *)v24 - 2) = v26;
      v20 -= v26;
      if ( v20 == 0 )
        break;
      ++v23;
      v24 += 2;
      if ( v23 >= v13 )
        goto LABEL_11;
    }
    LODWORD(v13) = v22;
  }
LABEL_11:
  v27 = MEMORY[0x799B0](a1: v19, a2: v18, a3: v18, a4: v14, a5: (unsigned int)v13, a6: &a10);
  MEMORY[0x79AE0](a1: v29, a2: v30, a3: v28, a4: v30);
  if ( v27 == 0 )
    return sub_1932A2C68(a1: v31, a2: v32, a3: a10, a4: v31, a5: 1);
  v33 = MEMORY[0x79958](a1: v31, a2: v32);
  if ( v33 != 10035 )
  {
    if ( v33 == 10054 )
      sub_1932B12F8(a1: v34, a2: v35, a3: 535376, a4: v34, a5: 535352, a6: v36);
    else
      sub_1932B1580(a1: v34, a2: v35, a3: 535416, a4: v34);
    return -5;
  }
  return -2;
}
