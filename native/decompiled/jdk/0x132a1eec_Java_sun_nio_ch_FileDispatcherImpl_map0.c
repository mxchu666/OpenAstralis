// Java_sun_nio_ch_FileDispatcherImpl_map0
// rva 0x132a1eec  size 311  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_FileDispatcherImpl_map0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        unsigned int a6,
        __int64 a7,
        __int64 a8,
        __int64 a9,
        int a10,
        __int64 a11,
        __int64 a12,
        char a13)
{
  __int64 v14; // rax
  __int64 v15; // rsi
  __int64 v16; // rdi
  __int64 v17; // r8
  __int64 v18; // rax
  __int64 v19; // rdi
  __int64 v20; // rsi
  __int64 v21; // rax
  int v22; // ebp
  __int64 v23; // rdx
  __int64 v24; // rdi
  __int64 v25; // rsi
  __int64 v26; // rcx

  v14 = sub_1932A2CD8(a1, a2: a6, a3: a5);
  v16 = 4;
  v17 = 2;
  if ( (_DWORD)v15 != 0 )
  {
    if ( (_DWORD)v15 == 1 )
    {
      v17 = 4;
      v16 = 2;
    }
    else if ( (_DWORD)v15 == 2 )
    {
      v16 = 1;
      v17 = 8;
    }
  }
  if ( a13 == 0 )
  {
    v18 = MEMORY[0x79638](a1: v16, a2: v15, a3: 0, a4: v14, a5: v17, a6: (unsigned __int64)(a11 + a12) >> 32);
    v20 = v18;
    if ( v18 != 0
      && (v21 = MEMORY[0x79640](
                  a1: v19,
                  a2: v18,
                  a3: (unsigned int)v19,
                  a4: v18,
                  a5: HIDWORD(a11),
                  a6: (unsigned int)a11),
          v22 = MEMORY[0x79758](a1: v21),
          (unsigned int)MEMORY[0x797C8](a1: v24, a2: v25, a3: v23, a4: v25) != 0) )
    {
      if ( v19 != 0 )
        return v19;
      v26 = a4;
      if ( v22 == 8 )
      {
        sub_1932B15D0(a1: 0, a2: v20, a3: 534904, a4);
        return -5;
      }
    }
    else
    {
      v26 = a4;
    }
    sub_1932B1580(a1: v19, a2: v20, a3: 534904, a4: v26);
    return -5;
  }
  sub_1932B15B0(a1: v16, a2: v15, a3: 534832, a4, a5: v17);
  return -5;
}
