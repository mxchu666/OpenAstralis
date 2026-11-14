// Java_sun_nio_ch_FileDispatcherImpl_writev0
// rva 0x132a2858  size 272  section .text  group jdk
// window base 0x1932a2858: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_FileDispatcherImpl_writev0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        int a7,
        int a8,
        int a9,
        int a10,
        int a11,
        char a12)
{
  __int64 v14; // rbp
  __int64 v15; // rdi
  __int64 v16; // rsi
  __int64 v17; // r13
  __int64 v18; // rsi
  unsigned int v19; // r12d
  int v20; // eax
  unsigned int v22; // [rsp+30h] [rbp-58h] BYREF
  _BYTE v23[16]; // [rsp+38h] [rbp-50h] BYREF
  int v24; // [rsp+48h] [rbp-40h]
  int v25; // [rsp+4Ch] [rbp-3Ch]

  v22 = 0;
  v14 = 0;
  v17 = sub_1932A2CD8(a1, a2, a3: a5);
  if ( v17 == -1 )
  {
    sub_1932B1570(a1: v15, a2: v16, a3: 534576, a4);
  }
  else
  {
    if ( a12 == 1 )
    {
      sub_1932CA161(a1: v15, a2: v16, a3: 0, a4: v23, a5: 32);
      v24 = -1;
      v25 = -1;
    }
    v18 = a11;
    if ( a11 > 0 )
    {
      v15 = 0;
      do
      {
        v19 = *(_DWORD *)(a6 + 8);
        v20 = MEMORY[0x795C0](a1: v15, a2: v18, a3: *(_QWORD *)a6, a4: v17, a5: v19, a6: &v22);
        if ( v22 != 0 )
          v14 += v22;
        if ( v22 < v19 )
          break;
        ++v15;
        a6 += 16;
      }
      while ( v15 < v18 );
      if ( v20 != 0 )
        return sub_1932A2C68(a1: v15, a2: v18, a3: v14, a4, a5: 0);
    }
    sub_1932B1580(a1: v15, a2: v18, a3: 534624, a4);
  }
  return -5;
}
