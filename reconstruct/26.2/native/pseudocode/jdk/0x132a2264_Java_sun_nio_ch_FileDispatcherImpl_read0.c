// Java_sun_nio_ch_FileDispatcherImpl_read0
// rva 0x132a2264  size 168  section .text  group jdk
// window base 0x1932a2264: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_FileDispatcherImpl_read0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        int a8,
        int a9,
        int a10,
        unsigned int a11)
{
  __int64 v12; // rax
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 v16; // rdi
  __int64 v17; // rsi
  __int64 v18; // r8
  int v19; // eax
  __int64 v20; // rdi
  __int64 v21; // rsi
  _DWORD v22[6]; // [rsp+30h] [rbp-18h] BYREF

  v22[0] = 0;
  v12 = sub_1932A2CD8(a1: a6, a2, a3: a5);
  if ( v12 == -1 )
  {
    sub_1932B1570(a1: v13, a2: v14, a3: 534576, a4);
    return 4294967291LL;
  }
  if ( (unsigned int)MEMORY[0x79670](a1: v13, a2: v14, a3: v13, a4: v12, a5: a11, a6: v22) != 0 )
  {
    LOBYTE(v18) = 1;
    return sub_1932A2C98(a1: v16, a2: v17, a3: v22[0], a4, a5: v18);
  }
  else
  {
    v19 = MEMORY[0x79758](a1: v16);
    if ( v19 == 109 )
    {
      return 0xFFFFFFFFLL;
    }
    else
    {
      if ( v19 != 232 )
      {
        sub_1932B1580(a1: v20, a2: v21, a3: 534592, a4);
        return 4294967291LL;
      }
      return 4294967294LL;
    }
  }
}
