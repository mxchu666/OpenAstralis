// Java_sun_nio_ch_FileDispatcherImpl_pread0
// rva 0x132a202c  size 301  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_FileDispatcherImpl_pread0(
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
        __int64 a12)
{
  __int64 v13; // rax
  __int64 v14; // rsi
  __int64 v15; // rdi
  __int64 v16; // rsi
  __int64 v17; // rdi
  __int64 v18; // rsi
  int v19; // eax
  __int64 v21; // rdx
  __int64 v22; // r8
  unsigned int v23; // [rsp+30h] [rbp-38h] BYREF
  __int64 v24; // [rsp+38h] [rbp-30h] BYREF
  _BYTE v25[16]; // [rsp+40h] [rbp-28h] BYREF
  __int64 v26; // [rsp+50h] [rbp-18h]

  v23 = 0;
  v13 = sub_1932A2CD8(a1, a2: a6, a3: a5);
  if ( v13 != -1 )
  {
    v24 = 0;
    if ( (unsigned int)MEMORY[0x79660](a1: v13, a2: v14, a3: 0, a4: v13, a5: &v24) != 0 )
    {
      sub_1932CA161(a1: v15, a2: v16, a3: 0, a4: v25, a5: 32);
      v26 = a12;
      if ( (unsigned int)MEMORY[0x79670](a1: v17, a2: v18, a3: v18, a4: v17, a5: a11, a6: &v23) == 0 )
      {
        v19 = MEMORY[0x79758](a1: v15);
        if ( v19 == 109 )
          return 0xFFFFFFFFLL;
        if ( v19 == 232 )
          return 4294967294LL;
        if ( v19 != 38 )
        {
          v21 = 534592;
LABEL_14:
          sub_1932B1580(a1: v15, a2: v16, a3: v21, a4);
          return 4294967291LL;
        }
      }
      if ( (unsigned int)MEMORY[0x79660](a1: v15, a2: v16, a3: v24, a4: v15, a5: 0) != 0 )
      {
        LOBYTE(v22) = 1;
        return sub_1932A2C98(a1: v15, a2: v16, a3: v23, a4, a5: v22);
      }
    }
    v21 = 534608;
    goto LABEL_14;
  }
  sub_1932B1570(a1: -1, a2: v14, a3: 534576, a4);
  return 4294967291LL;
}
