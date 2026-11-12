// Java_sun_nio_ch_FileDispatcherImpl_write0
// rva 0x132a2794  size 193  section .text  group jdk
// window base 0x1932a2794: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_FileDispatcherImpl_write0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        int a9,
        int a10,
        unsigned int a11,
        char a12)
{
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 v15; // rdi
  __int64 v16; // rsi
  unsigned int v18; // [rsp+30h] [rbp-38h] BYREF
  _BYTE v19[16]; // [rsp+38h] [rbp-30h] BYREF
  int v20; // [rsp+48h] [rbp-20h]
  int v21; // [rsp+4Ch] [rbp-1Ch]

  v18 = 0;
  v13 = sub_1932A2CD8(a1, a2: a6, a3: a5);
  if ( v13 == -1 )
  {
    sub_1932B1570(a1: -1, a2: v14, a3: 534576, a4);
  }
  else
  {
    if ( a12 == 1 )
    {
      sub_1932CA161(a1: v13, a2: v14, a3: 0, a4: v19, a5: 32);
      v20 = -1;
      v21 = -1;
    }
    if ( (unsigned int)MEMORY[0x795C0](a1: v13, a2: v14, a3: v14, a4: v13, a5: a11, a6: &v18) != 0 )
      return sub_1932A2C98(a1: v15, a2: v16, a3: v18, a4, a5: 0);
    sub_1932B1580(a1: v15, a2: v16, a3: 534624, a4);
  }
  return 4294967291LL;
}
