// Java_java_io_WinNTFileSystem_canonicalize0
// rva 0x132b2bec  size 390  section .text  group jdk
// window base 0x1932b2bec: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_java_io_WinNTFileSystem_canonicalize0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  __int64 v5; // r14
  __int64 v7; // rdi
  __int64 v8; // rsi
  __int64 v9; // rax
  __int64 v10; // rdx
  int v11; // ebx
  int v12; // edi
  int v13; // esi
  int v14; // r8d
  int v15; // r9d
  __int64 v16; // rdx
  int v17; // ebx
  __int64 v18; // rdi
  __int64 v19; // rsi
  int v20; // r9d
  __int64 v21; // rax
  __int64 v22; // rdi
  __int64 v23; // rsi
  int v24; // r9d
  __int64 v25; // rbp
  __int64 v26; // rdx
  __int64 *v27; // rdi
  __int64 v28; // rsi
  __int64 v29; // rbx
  unsigned int v30; // eax
  __int64 v31; // rdi
  __int64 v32; // rsi
  __int64 *v33; // rdi
  __int64 v34; // rsi
  __int64 v35; // rdx
  __int64 v36; // rbx
  unsigned int v37; // eax
  __int64 v38; // rdi
  __int64 v39; // rsi
  __int64 v40; // rdx
  __int64 v41; // r8
  __int64 v42; // r9
  __int64 v44; // [rsp+0h] [rbp-858h] BYREF
  int v45; // [rsp+8h] [rbp-850h]
  int v46; // [rsp+10h] [rbp-848h]
  __int64 v47; // [rsp+18h] [rbp-840h]
  _BYTE v48[2048]; // [rsp+20h] [rbp-838h] BYREF
  __int64 v49; // [rsp+820h] [rbp-38h]

  v5 = 0;
  if ( a5 == 0 )
  {
    sub_1932B15C0(a1: a4, a2, a3: 0, a4);
LABEL_13:
    if ( (*(unsigned __int8 (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)v7 + 1824LL))(
           a1: v7,
           a2: v8,
           a3: *(_QWORD *)(*(_QWORD *)v7 + 1824LL),
           a4: v7) == 0 )
      sub_1932B1580(a1: v7, a2: v8, a3: 543704, a4: v7);
    return sub_1932C8DE0(a1: v7, a2: v8, a3: v40, a4: (unsigned __int64)&v44 ^ v49, a5: v41, a6: v42);
  }
  v9 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 1320LL))(
         a1: a4,
         a2,
         a3: a5,
         a4,
         a5: 0);
  v8 = v9;
  if ( v9 == 0 )
    goto LABEL_13;
  v11 = MEMORY[0x79CB0](a1: v7, a2: v9, a3: v10, a4: v9);
  v17 = sub_1932B8C40(a1: v12, a2: v13, a3: v11, a4: v13, a5: v14, a6: v15, a7: v44) + v11;
  if ( v17 <= 1023 )
  {
    if ( (int)sub_1932B9BA8(
                a1: v18,
                a2: v19,
                a3: (unsigned int)v48,
                a4: v19,
                a5: 1024,
                a6: v20,
                a7: v44,
                a8: v45,
                a9: v46,
                a10: v47) >= 0 )
    {
      v36 = *v33;
      v37 = MEMORY[0x79CB0](a1: v33, a2: v34, a3: v35, a4: v48);
      v5 = (*(__int64 (__fastcall **)(__int64, __int64, _BYTE *, __int64, _QWORD))(v36 + 1304))(
             a1: v38,
             a2: v39,
             a3: v48,
             a4: v38,
             a5: v37);
    }
  }
  else
  {
    v21 = MEMORY[0x79AD0](a1: v18, a2: v19, a3: v16, a4: 2LL * v17);
    v25 = v21;
    if ( v21 != 0 )
    {
      if ( (int)sub_1932B9BA8(a1: v22, a2: v23, a3: v21, a4: v23, a5: v17, a6: v24, a7: v44, a8: v45, a9: v46, a10: v47) >= 0 )
      {
        v29 = *v27;
        v30 = MEMORY[0x79CB0](a1: v27, a2: v28, a3: v26, a4: v25);
        v5 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(v29 + 1304))(
               a1: v31,
               a2: v32,
               a3: v25,
               a4: v31,
               a5: v30);
      }
      MEMORY[0x79AE0](a1: v27, a2: v28, a3: v26, a4: v25);
    }
    else
    {
      sub_1932B15D0(a1: v22, a2: v23, a3: 533920, a4: v22);
    }
  }
  (*(void (__fastcall **)(__int64 *, __int64, __int64, __int64 *, __int64))(*v33 + 1328))(
    a1: v33,
    a2: v34,
    a3: a5,
    a4: v33,
    a5: v34);
  if ( v5 == 0 )
    goto LABEL_13;
  return sub_1932C8DE0(a1: v7, a2: v8, a3: v40, a4: (unsigned __int64)&v44 ^ v49, a5: v41, a6: v42);
}
