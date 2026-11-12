// Java_sun_nio_ch_FileDispatcherImpl_setDirect0
// rva 0x132a2528  size 152  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_FileDispatcherImpl_setDirect0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  unsigned int v6; // ebx
  __int64 v7; // rax
  __int64 v8; // rdi
  __int64 v9; // rsi
  __int64 v10; // rdi
  __int64 v11; // rsi
  __int64 v12; // rax
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 v15; // rdi
  __int64 v16; // rsi
  unsigned int v18; // [rsp+30h] [rbp-18h] BYREF
  _BYTE v19[4]; // [rsp+38h] [rbp-10h] BYREF
  _BYTE v20[12]; // [rsp+3Ch] [rbp-Ch] BYREF

  v6 = 0xFFFFFFFF;
  v7 = sub_1932A2CD8(a1: a4, a2: a6, a3: a5);
  if ( MEMORY[0x79630](a1: v8, a2: v9, a3: 0, a4: v7, a5: 0, a6: 2684354560LL) != -1 )
  {
    v12 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v10 + 1840LL))(
            a1: v10,
            a2: v11,
            a3: v11,
            a4: v10);
    if ( (unsigned int)MEMORY[0x797D8](a1: v13, a2: v14, a3: v20, a4: v12, a5: &v18, a6: v19) == 0 )
      sub_1932B1580(a1: v15, a2: v16, a3: 534952, a4: v15);
    return v18;
  }
  return v6;
}
