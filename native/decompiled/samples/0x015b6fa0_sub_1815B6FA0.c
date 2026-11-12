// sub_1815B6FA0
// rva 0x015b6fa0  size 283  section .text  group samples
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall sub_1815B6FA0(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5, __int64 a6, char a7)
{
  __int64 v7; // r14
  __int64 v8; // r15
  __int64 result; // rax
  __int64 v10; // rdx
  __int64 v11; // rcx
  __int64 v12; // rdi
  __int64 v13; // rsi
  __int64 v14; // [rsp+0h] [rbp-18h] BYREF
  __int64 v15; // [rsp+8h] [rbp-10h]
  __int64 v16; // [rsp+10h] [rbp-8h]

  v16 = a3;
  if ( (unsigned __int64)&v14 <= *(_QWORD *)(v8 + 8) )
  {
    MEMORY[0x181EB84E0]();
  }
  else if ( a3 != v7 )
  {
    result = *(_QWORD *)(v8 + 40);
    if ( (unsigned __int64)(result + 16) > *(_QWORD *)(v8 + 32) )
    {
      result = MEMORY[0x181EAA920](a1, a2, a3: 35811896);
      a3 = v16;
    }
    else
    {
      *(_QWORD *)(v8 + 40) = result + 16;
      *(_DWORD *)result = 35811896;
      *(_DWORD *)(result + 4) = 0;
      *(_QWORD *)(result + 8) = 0;
    }
    *(_DWORD *)(result + 4) = (unsigned __int64)(a3 - v7) >> 3;
    if ( *(int *)(v8 + 16) <= 0 )
      return MEMORY[0x18277F280]();
    return result;
  }
  v10 = *(_QWORD *)(v8 + 40);
  if ( (unsigned __int64)(v10 + 48) > *(_QWORD *)(v8 + 32) )
    goto LABEL_13;
  *(_QWORD *)(v8 + 40) = v10 + 48;
  *(_DWORD *)v10 = 34101256;
  *(_DWORD *)(v10 + 4) = 0;
  *(_QWORD *)(v10 + 8) = 0;
  *(_QWORD *)(v10 + 16) = 0;
  *(_QWORD *)(v10 + 24) = 0;
  *(_QWORD *)(v10 + 32) = 0;
  *(_QWORD *)(v10 + 40) = 0;
  while ( 1 )
  {
    *(_DWORD *)(v10 + 20) = 46923644;
    *(_DWORD *)(v10 + 16) = *(_DWORD *)(v7 + 374343896);
    *(_DWORD *)(v10 + 12) = (unsigned __int64)(v10 - v7) >> 3;
    v15 = v10;
    MEMORY[0x18503B9A0](a1, a2, a3: v10, a4, a5: 0);
    MEMORY[0x182769900](a1: v12, a2: v13, a3: v15, a4: v11, a5: &a7);
LABEL_13:
    v10 = MEMORY[0x181EAA920](a1, a2, a3: 34101256);
  }
}
