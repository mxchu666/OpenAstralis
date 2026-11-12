// sub_184F27280
// rva 0x04f27280  size 91  section .text  group samples
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall sub_184F27280(__int64 a1, __int64 a2, __int64 a3, int a4, int a5, int a6, int a7, __int64 a8)
{
  __int64 v8; // r13
  __int64 v9; // r14
  __int64 v10; // r15
  __int64 v11; // rax
  int v12; // ecx
  int v13; // edi
  int v14; // esi
  int v15; // r8d
  int v16; // r9d
  __int64 result; // rax
  int v18; // edx
  int v19; // ecx
  int v20; // edi
  int v21; // esi
  int v22; // r8d
  int v23; // r9d
  char v24; // [rsp+0h] [rbp-18h] BYREF
  __int64 v25; // [rsp+10h] [rbp-8h]

  if ( (unsigned __int64)&v24 <= *(_QWORD *)(v10 + 8) )
  {
    MEMORY[0x181EB84E0]();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    return sub_184F272E0(a1: v20, a2: v21, a3: v18, a4: v19, a5: v22, a6: v23, a7);
  }
  else
  {
    v11 = *(unsigned int *)(a3 + 8);
    if ( (_DWORD)v11 != 0 )
    {
      v25 = a3;
      ((void (__fastcall *)(__int64, __int64, __int64))(v8
                                                      + *(_QWORD *)(v9 + 8LL * (*(_DWORD *)(v9 + 8 * v11) >> 3) + 120)))(
        a1,
        a2,
        a3: v9 + 8 * v11);
      result = sub_184F272E0(a1: v13, a2: v14, a3: v25, a4: v12, a5: v15, a6: v16, a7: v24);
      if ( *(int *)(v10 + 16) <= 0 )
        return MEMORY[0x18277F280]();
    }
    else
    {
      return sub_184F272C7(a1, a2, a3, a4, a5, a6, a7, a8);
    }
  }
  return result;
}
