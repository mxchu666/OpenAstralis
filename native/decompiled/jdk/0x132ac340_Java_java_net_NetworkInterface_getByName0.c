// Java_java_net_NetworkInterface_getByName0
// rva 0x132ac340  size 211  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_java_net_NetworkInterface_getByName0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  __int64 v5; // rsi
  __int64 v6; // rdi
  __int64 v7; // rbx
  __int64 v8; // rdi
  __int64 v9; // rsi
  __int64 v10; // rsi
  unsigned int v11; // ebp
  __int64 v12; // rdi
  __int64 v13; // rdx
  __int64 v14; // rdi
  __int64 v15; // rsi
  __int64 v16; // r8
  __int64 v17; // r9
  int v18; // edi
  int v19; // esi
  int v20; // r9d
  __int64 v22; // [rsp+0h] [rbp-598h] BYREF
  int v23; // [rsp+8h] [rbp-590h]
  __int64 v24; // [rsp+10h] [rbp-588h]
  __int64 v25; // [rsp+18h] [rbp-580h]
  _BYTE v26[1360]; // [rsp+20h] [rbp-578h] BYREF
  __int64 v27; // [rsp+570h] [rbp-28h]

  sub_1932CA161(a1: a5, a2: a4, a3: 0, a4: v26, a5: 1352);
  v7 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)v5 + 1320LL))(
         a1: v6,
         a2: v5,
         a3: v6,
         a4: v5,
         a5: 0);
  v11 = MEMORY[0x792A8](a1: v8, a2: v9, a3: v26, a4: v7);
  (*(void (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)v10 + 1328LL))(
    a1: v12,
    a2: v10,
    a3: v12,
    a4: v10,
    a5: v7);
  if ( v11 != 0 )
  {
    if ( v11 != 123 )
    {
      MEMORY[0x793D8](a1: v14, a2: v15, a3: v13, a4: v11);
      sub_1932AED04(a1: v18, a2: v19, a3: 534024, a4: v19, a5: 538232, a6: v20);
    }
  }
  else
  {
    sub_1932AD1F4(
      a1: v14,
      a2: v15,
      a3: (unsigned int)v26,
      a4: v15,
      a5: v16,
      a6: v17,
      a7: v22,
      a8: v23,
      a9: v24,
      a10: v25);
  }
  return sub_1932C8DE0(a1: v14, a2: v15, a3: v13, a4: (unsigned __int64)&v22 ^ v27, a5: v16, a6: v17);
}
