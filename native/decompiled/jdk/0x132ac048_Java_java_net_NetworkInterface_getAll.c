// Java_java_net_NetworkInterface_getAll
// rva 0x132ac048  size 308  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_java_net_NetworkInterface_getAll(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        int a8,
        unsigned int *a9,
        __int64 a10)
{
  unsigned int v10; // eax
  __int64 v11; // rdx
  __int64 v12; // rdi
  __int64 v13; // rsi
  __int64 v14; // rbx
  int v15; // edi
  int v16; // esi
  int v17; // r9d
  __int64 v19; // rdi
  int v20; // esi
  int v21; // r9d
  __int64 v22; // r14
  int v23; // edx
  unsigned int v24; // esi
  __int64 v25; // rax
  __int64 v26; // rsi
  __int64 v27; // r15
  __int64 v28; // rdi
  __int64 v29; // rsi
  int v30; // esi
  __int64 v31; // rdi
  __int64 v32; // rdi
  int v33; // [rsp+0h] [rbp-30h]
  int v34; // [rsp+8h] [rbp-28h]
  __int64 v35; // [rsp+10h] [rbp-20h]
  __int64 v36; // [rsp+20h] [rbp-10h] BYREF

  v10 = MEMORY[0x79288](a1: a4, a2: a3, a3, a4: &a9);
  v14 = 0;
  if ( v10 != 0 )
  {
    MEMORY[0x793D8](a1: v12, a2: v13, a3: v11, a4: v10);
    sub_1932AED04(a1: v15, a2: v16, a3: 534024, a4: v15, a5: 538264, a6: v17);
    return 0;
  }
  v22 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64, __int64, _QWORD))(*(_QWORD *)v12 + 1376LL))(
          a1: v12,
          a2: v13,
          a3: *a9,
          a4: v12,
          a5: v13,
          a6: 0);
  if ( v22 == 0
    || (unsigned int)sub_1932AD2D4(a1: v19, a2: v20, a3: (unsigned int)&a10, a4: v19, a5: (unsigned int)&v36, a6: v21) == 0 )
  {
    MEMORY[0x792A0](a1: v19);
    return 0;
  }
  v23 = (int)a9;
  v24 = 0;
  if ( *a9 != 0 )
  {
    while ( 1 )
    {
      v25 = sub_1932ACA14(
              a1: v19,
              a2: v24,
              a3: 1352 * v24 + 8 + v23,
              a4: v19,
              a5: a10,
              a6: v36,
              a7: v33,
              a8: v34,
              a9: v35);
      v27 = v25;
      if ( v25 == 0 )
        break;
      (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)v19 + 1392LL))(
        a1: v19,
        a2: v26,
        a3: v22,
        a4: v19,
        a5: (unsigned int)v26,
        a6: v25);
      (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v28 + 184LL))(
        a1: v28,
        a2: v29,
        a3: v27,
        a4: v28);
      v23 = (int)a9;
      v24 = v30 + 1;
      if ( v24 >= *a9 )
        goto LABEL_10;
    }
  }
  else
  {
LABEL_10:
    v14 = v22;
  }
  MEMORY[0x792A0](a1: v19);
  MEMORY[0x792A0](a1: v31);
  MEMORY[0x792A0](a1: v32);
  return v14;
}
