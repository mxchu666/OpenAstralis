// Java_sun_nio_ch_FileDispatcherImpl_pwrite0
// rva 0x132a215c  size 262  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_FileDispatcherImpl_pwrite0(
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
  __int64 v19; // rdx
  unsigned int v21; // [rsp+30h] [rbp-38h] BYREF
  __int64 v22; // [rsp+38h] [rbp-30h] BYREF
  _BYTE v23[16]; // [rsp+40h] [rbp-28h] BYREF
  __int64 v24; // [rsp+50h] [rbp-18h]

  v21 = 0;
  v13 = sub_1932A2CD8(a1, a2: a6, a3: a5);
  if ( v13 != -1 )
  {
    v22 = 0;
    if ( (unsigned int)MEMORY[0x79660](a1: v13, a2: v14, a3: 0, a4: v13, a5: &v22) != 0 )
    {
      sub_1932CA161(a1: v15, a2: v16, a3: 0, a4: v23, a5: 32);
      v24 = a12;
      if ( (unsigned int)MEMORY[0x795C0](a1: v17, a2: v18, a3: v18, a4: v17, a5: a11, a6: &v21) == 0 )
      {
        v19 = 534624;
LABEL_9:
        sub_1932B1580(a1: v15, a2: v16, a3: v19, a4);
        return 4294967291LL;
      }
      if ( (unsigned int)MEMORY[0x79660](a1: v15, a2: v16, a3: v22, a4: v15, a5: 0) != 0 )
        return sub_1932A2C98(a1: v15, a2: v16, a3: v21, a4, a5: 0);
    }
    v19 = 534608;
    goto LABEL_9;
  }
  sub_1932B1570(a1: -1, a2: v14, a3: 534576, a4);
  return 4294967291LL;
}
