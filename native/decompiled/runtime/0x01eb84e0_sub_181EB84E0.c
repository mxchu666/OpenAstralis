// sub_181EB84E0
// rva 0x01eb84e0  size 479  section .text  group runtime
// window base 0x181eb84e0: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall sub_181EB84E0(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5, __int64 a6, char a7)
{
  __int64 v7; // r14
  _DWORD *v8; // r15
  int v9; // eax
  __int64 v10; // rdx
  __int64 v11; // rax
  __int64 v12; // rcx
  int v13; // ebx
  int v14; // edx
  __int64 v15; // rcx
  __int64 v16; // rdi
  __int64 v17; // rsi
  int v18; // r8d
  int v19; // r9d
  __int64 v20; // rcx
  int v21; // ebx
  __int64 v22; // rdi
  __int64 v23; // rsi
  __int64 v24; // rdx
  __int64 v25; // rdi
  __int64 v26; // rsi
  __int64 v28; // [rsp+10h] [rbp-178h]

  v9 = v8[80];
  if ( v9 != 0 )
  {
    v10 = v7 + 376658528;
    if ( v9 < 2 )
      goto LABEL_5;
    v11 = v7 + 376658528;
    while ( 1 )
    {
      MEMORY[0x1827697E0](a1, a2, a3: v11, a4, a5: &a7);
LABEL_5:
      if ( v8[75] != 0 )
      {
        v11 = v10;
      }
      else if ( v8[81] != 0 )
      {
        v11 = v10;
      }
      else
      {
        v12 = (unsigned int)v8[80];
        v13 = v8[80] + 1;
        v8[80] = v13;
        sub_181EB8240(a1, a2, a3: v12, a4: v12, a5: v13);
        v28 = sub_181EB8180(a1: v16, a2: v17, a3: v14, a4: v15, a5: v18, a6: v19);
        v20 = (unsigned int)v8[80];
        v21 = v8[80] - 1;
        v8[80] = v21;
        sub_181EB82C0(a1: v22, a2: v23, a3: v20, a4: v20, a5: v21);
        v11 = v28;
      }
    }
  }
  MEMORY[0x1828C1C40](a1, a2, a3: v7 + 367050608);
  __builtin_debugtrap();
  return sub_181EB86C0(a1: v25, a2: v26, a3: v24);
}
