// Java_java_net_NetworkInterface_getMacAddr0
// rva 0x132ac4ac  size 226  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_java_net_NetworkInterface_getMacAddr0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 *a4,
        __int64 a5,
        __int64 a6,
        int a7,
        __int64 a8,
        int a9,
        int a10,
        int a11)
{
  __int64 v12; // rdx
  __int64 v13; // rdi
  __int64 v14; // rsi
  unsigned int v15; // eax
  __int64 v16; // rdx
  __int64 v17; // rdi
  __int64 v18; // rsi
  __int64 v19; // r8
  __int64 v20; // r9
  int v21; // edi
  int v22; // esi
  int v23; // r9d
  __int64 v24; // rdx
  __int64 v26; // rcx
  _QWORD v27[6]; // [rsp+0h] [rbp-598h] BYREF
  _BYTE v28[8]; // [rsp+30h] [rbp-568h] BYREF
  int v29; // [rsp+38h] [rbp-560h]
  unsigned int v30; // [rsp+450h] [rbp-148h]
  char v31; // [rsp+454h] [rbp-144h] BYREF
  __int64 v32; // [rsp+580h] [rbp-18h]

  sub_1932CA161(a1, a2, a3: 0, a4: v28, a5: 1352);
  v29 = a11;
  v15 = MEMORY[0x79280](a1: v13, a2: v14, a3: v12, a4: v28);
  if ( v15 != 0 )
  {
    MEMORY[0x793D8](a1: v17, a2: v18, a3: v16, a4: v15);
    sub_1932AED04(a1: v21, a2: v22, a3: 534024, (_DWORD)a4, a5: 538216, a6: v23);
  }
  else
  {
    v24 = v30;
    if ( v30 != 0 )
    {
      v17 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64 *))(*a4 + 1408))(a1: v17, a2: v18, a3: v30, a4);
      if ( v17 != 0 )
      {
        v26 = *a4;
        v27[4] = &v31;
        (*(void (__fastcall **)(__int64, __int64, __int64, __int64 *, _QWORD, _QWORD))(v26 + 1664))(
          a1: v17,
          a2: v18,
          a3: v17,
          a4,
          a5: 0,
          a6: v30);
      }
    }
  }
  return sub_1932C8DE0(a1: v17, a2: v18, a3: v24, a4: (unsigned __int64)v27 ^ v32, a5: v19, a6: v20);
}
