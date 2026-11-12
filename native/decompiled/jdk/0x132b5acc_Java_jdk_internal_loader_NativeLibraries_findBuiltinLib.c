// Java_jdk_internal_loader_NativeLibraries_findBuiltinLib
// rva 0x132b5acc  size 342  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_jdk_internal_loader_NativeLibraries_findBuiltinLib(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  unsigned __int64 v7; // r15
  __int64 v8; // rdx
  __int64 v9; // rdi
  __int64 v10; // rsi
  __int64 v11; // rdi
  __int64 v12; // rsi
  __int64 v13; // r8
  __int64 v14; // r12
  __int64 v16; // rdi
  __int64 v17; // rsi
  __int64 v18; // rax
  __int64 v19; // rdx
  __int64 v20; // rdi
  unsigned __int64 v21; // rax
  __int64 v22; // rdx
  __int64 v23; // rdi
  __int64 v24; // rsi
  unsigned __int64 v25; // r14
  __int64 v26; // rax
  __int64 v27; // rsi
  __int64 v28; // rdi
  __int64 v29; // rdi
  __int64 v30; // rsi
  __int64 v31; // rdx
  __int64 v32; // rdi
  __int64 v33; // rsi
  __int64 v34; // rax
  int v35; // edx
  __int64 v36; // rdi
  int v37; // r9d
  int v38; // esi
  __int64 v39; // rdx
  _BYTE *v40; // rdi
  __int64 v41; // rsi
  int v42; // r8d
  int v43; // r9d
  __int64 v44; // rbx

  v7 = sub_1932CA1FD(a1, a2, a3, a4: 533883);
  v14 = sub_1932CA1FD(a1: v9, a2: v10, a3: v8, a4: 544640);
  if ( a5 == 0 )
  {
    sub_1932B15B0(a1: v11, a2: v12, a3: 544648, a4, a5: v13);
    return 0;
  }
  MEMORY[0x337678] = sub_1932B8BCC();
  v18 = sub_1932B0228(a1: v16, a2: v17, a3: a5, a4, a5: 0);
  if ( v18 == 0 )
    return 0;
  v21 = sub_1932CA1FD(a1: v20, a2: v18, a3: v19, a4: v18);
  v25 = v21;
  if ( v21 <= v14 + v7 )
  {
    sub_1932B110C(a1: v23, a2: v24, a3: a5, a4, a5: v24);
    return 0;
  }
  v26 = MEMORY[0x79AD0](a1: v23, a2: v24, a3: v22, a4: v21 + 1);
  v28 = v26;
  if ( v26 == 0 )
  {
    sub_1932B110C(a1: 0, a2: v27, a3: a5, a4, a5: v27);
    sub_1932B15D0(a1: v29, a2: v30, a3: 0, a4);
    return 0;
  }
  if ( v25 > v7 )
    sub_1932CA27B(a1: v26, a2: v27, a3: v27 + v7, a4: v26);
  sub_1932B110C(a1: v28, a2: v27, a3: a5, a4, a5: v27);
  v34 = sub_1932CA1FD(a1: v32, a2: v33, a3: v31, a4: v32);
  v35 = MEMORY[0x337678];
  LOBYTE(v37) = 1;
  *(_BYTE *)(v34 + v36 - v14) = 0;
  if ( sub_1932B5FA0(a1: v36, a2: v38, a3: v35, a4, a5: v36, a6: v37) != 0 )
    v44 = JNU_NewStringPlatform(a1: (__int64)v40, a2: v41, a3: v40, a4, a5: v42, a6: v43);
  else
    v44 = 0;
  MEMORY[0x79AE0](a1: v40, a2: v41, a3: v39, a4: v40);
  return v44;
}
