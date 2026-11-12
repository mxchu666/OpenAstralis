// Java_sun_nio_ch_Iocp_getQueuedCompletionStatus
// rva 0x132a6fcc  size 223  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_Iocp_getQueuedCompletionStatus(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  int v7; // eax
  __int64 v8; // rdi
  __int64 v9; // rsi
  __int64 v10; // r9
  __int64 v12; // rdi
  __int64 v13; // rsi
  __int64 v14; // rdi
  __int64 v15; // rsi
  __int64 v16; // rdi
  __int64 v17; // rsi
  unsigned int v18; // [rsp+30h] [rbp-28h] BYREF
  __int64 v19; // [rsp+38h] [rbp-20h] BYREF
  _DWORD v20[6]; // [rsp+40h] [rbp-18h] BYREF

  v7 = MEMORY[0x79370](a1: a6, a2, a3: &v18, a4: a5, a5: v20, a6: &v19);
  v10 = 0;
  if ( v7 == 0 )
  {
    if ( v19 == 0 )
      return sub_1932B1580(a1: v8, a2: v9, a3: 536560, a4);
    v10 = (unsigned int)MEMORY[0x79758](a1: v8);
  }
  (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 872LL))(
    a1: v8,
    a2: v9,
    a3: v8,
    a4,
    a5: MEMORY[0x337448],
    a6: v10);
  (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 872LL))(
    a1: v12,
    a2: v13,
    a3: v12,
    a4,
    a5: MEMORY[0x337450],
    a6: v18);
  (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 872LL))(
    a1: v14,
    a2: v15,
    a3: v14,
    a4,
    a5: MEMORY[0x337458],
    a6: v20[0]);
  return (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 880LL))(
           a1: v16,
           a2: v17,
           a3: v16,
           a4,
           a5: MEMORY[0x337460],
           a6: v19);
}
