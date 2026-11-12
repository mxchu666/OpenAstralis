// Java_sun_nio_ch_FileDispatcherImpl_readv0
// rva 0x132a230c  size 249  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_FileDispatcherImpl_readv0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        int a9,
        unsigned int a10,
        int a11)
{
  __int64 v13; // rbp
  __int64 v14; // rdi
  __int64 v15; // rsi
  __int64 v16; // r12
  __int64 v17; // rsi
  unsigned int v18; // r15d
  int v19; // eax
  __int64 v20; // r8
  int v22; // eax
  __int64 v23; // rdi
  __int64 v24; // rsi

  a10 = 0;
  v13 = 0;
  v16 = sub_1932A2CD8(a1, a2, a3: a5);
  if ( v16 == -1 )
  {
    sub_1932B1570(a1: v14, a2: v15, a3: 534576, a4);
  }
  else
  {
    v17 = a11;
    if ( a11 > 0 )
    {
      v14 = 0;
      do
      {
        v18 = *(_DWORD *)(a6 + 8);
        v19 = MEMORY[0x79670](a1: v14, a2: v17, a3: *(_QWORD *)a6, a4: v16, a5: v18, a6: &a10);
        if ( a10 != 0 )
          v13 += a10;
        if ( a10 < v18 )
          break;
        ++v14;
        a6 += 16;
      }
      while ( v14 < v17 );
      if ( v19 != 0 )
      {
        LOBYTE(v20) = 1;
        return sub_1932A2C68(a1: v14, a2: v17, a3: v13, a4, a5: v20);
      }
    }
    v22 = MEMORY[0x79758](a1: v14);
    if ( v22 == 109 )
      return -1;
    if ( v22 == 232 )
      return -2;
    sub_1932B1580(a1: v23, a2: v24, a3: 534592, a4);
  }
  return -5;
}
