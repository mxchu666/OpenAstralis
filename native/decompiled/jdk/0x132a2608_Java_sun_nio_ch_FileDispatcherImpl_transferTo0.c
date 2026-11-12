// Java_sun_nio_ch_FileDispatcherImpl_transferTo0
// rva 0x132a2608  size 252  section .text  group jdk
// window base 0x1932a2608: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_FileDispatcherImpl_transferTo0(
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
        __int64 a11,
        __int64 a12)
{
  __int64 v13; // r14
  __int64 v14; // rdi
  __int64 v15; // rsi
  __int64 v16; // rdi
  __int64 v17; // r15
  __int64 v18; // rdi
  __int64 v19; // rsi
  __int64 v20; // rdx
  __int64 v22; // rdi
  __int64 v23; // rsi
  int v24; // eax

  v13 = sub_1932A2CD8(a1: a4, a2, a3: a5);
  v17 = (int)sub_1932A2CC4(a1: v14, a2: v15, a3: a12);
  a10 = a6;
  if ( a11 <= 2147483646 )
    JUMPOUT(0x3264FC666LL);
  if ( (unsigned int)MEMORY[0x79660](a1: v16, a2: 2147483646, a3: a6, a4: v13, a5: &a10) == 0 )
  {
    v20 = 534640;
LABEL_4:
    sub_1932B1580(a1: v18, a2: v19, a3: v20, a4: v18);
    return -5;
  }
  if ( (unsigned int)sub_1932CA335(a1: v18, a2: v19, a3: v13, a4: v17, a5: (unsigned int)v19, a6: 0x80000) != 0 )
    return (unsigned int)v23;
  v24 = MEMORY[0x79958](a1: v22, a2: v23);
  if ( v24 == 10022 )
  {
    if ( a11 < 0 )
    {
LABEL_8:
      v20 = 534936;
      goto LABEL_4;
    }
  }
  else if ( v24 != 10038 )
  {
    goto LABEL_8;
  }
  return -6;
}
