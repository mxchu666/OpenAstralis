// Java_sun_nio_ch_FileDispatcherImpl_lock0
// rva 0x132a1e04  size 232  section .text  group jdk
// window base 0x1932a1e04: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_FileDispatcherImpl_lock0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        char a6,
        __int64 a7,
        __int64 a8,
        int a9,
        int a10,
        __int64 a11,
        __int64 a12,
        char a13)
{
  __int64 v14; // rdi
  __int64 v15; // rsi
  BOOL v16; // edx
  bool v17; // bl
  int v18; // eax
  __int64 v19; // rdi
  __int64 v20; // rsi
  _BYTE v22[16]; // [rsp+30h] [rbp-28h] BYREF
  __int64 v23; // [rsp+40h] [rbp-18h]
  __int64 v24; // [rsp+48h] [rbp-10h]

  v15 = sub_1932A2CD8(a1: a4, a2, a3: a5);
  v23 = a11;
  v24 = 0;
  v16 = a6 == 0;
  if ( a13 == 0 )
    JUMPOUT(0x3264FBE70LL);
  v17 = a6 == 0;
  if ( (unsigned int)MEMORY[0x79678](a1: v14, a2: v15, a3: v16, a4: v15, a5: 0) == 0 )
  {
    v18 = MEMORY[0x79758]();
    if ( v18 != 997 )
      goto LABEL_6;
    if ( (unsigned int)MEMORY[0x79648](a1: v19, a2: v20, a3: v22, a4: v20, a5: &a13, a6: 1) == 0 )
    {
      v18 = MEMORY[0x79758]();
LABEL_6:
      if ( v18 != 33 || !v17 )
        sub_1932B1580(a1: v19, a2: v20, a3: 534760, a4: v19);
      return 0xFFFFFFFFLL;
    }
  }
  return 0;
}
