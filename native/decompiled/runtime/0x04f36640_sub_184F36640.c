// sub_184F36640
// rva 0x04f36640  size 541  section .text  group runtime
// window base 0x184f36640: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall sub_184F36640(__int64 a1, __int64 a2, __int64 a3, __int64 a4, int a5)
{
  __int64 v5; // r14
  __int64 v6; // r15
  int v7; // r9d
  int v8; // eax
  int v9; // r9d
  int v10; // r9d
  __int64 v11; // rax
  int v12; // ebx
  __int64 v13; // r9
  __int64 v14; // rax
  __int64 v15; // rdi
  __int64 v16; // rsi
  __int64 v17; // rdi
  __int64 v18; // rsi
  unsigned __int64 v19; // rdx
  unsigned __int64 v21; // rbp
  __int64 v22; // [rsp+0h] [rbp-28h] BYREF
  __int64 v23; // [rsp+8h] [rbp-20h]
  _DWORD *v24; // [rsp+10h] [rbp-18h]
  unsigned int v25; // [rsp+18h] [rbp-10h]
  int v26; // [rsp+1Ch] [rbp-Ch]
  unsigned int v27; // [rsp+20h] [rbp-8h]
  unsigned int v28; // [rsp+24h] [rbp-4h]

  if ( (unsigned __int64)&v22 <= *(_QWORD *)(v6 + 8) )
  {
    MEMORY[0x181EB84E0]();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    return sub_184F36860();
  }
  if ( a5 < 0 )
  {
    v8 = 1;
    v7 = a5;
  }
  else
  {
    v7 = -a5;
    v8 = 0;
  }
  if ( v7 < -9 )
  {
    if ( v7 < -99 )
    {
      if ( v7 < -999 )
      {
        if ( v7 < -9999 )
        {
          if ( v7 < -99999 )
          {
            if ( v7 < -999999 )
            {
              if ( v7 < -9999999 )
              {
                if ( v7 < -99999999 )
                {
                  if ( v7 < -999999999 )
                  {
                    v28 = a5;
                    v10 = v8 + 10;
                    goto LABEL_7;
                  }
                  v9 = 9;
                }
                else
                {
                  v9 = 8;
                }
              }
              else
              {
                v9 = 7;
              }
            }
            else
            {
              v9 = 6;
            }
          }
          else
          {
            v9 = 5;
          }
        }
        else
        {
          v9 = 4;
        }
      }
      else
      {
        v9 = 3;
      }
    }
    else
    {
      v9 = 2;
    }
  }
  else
  {
    v9 = 1;
  }
  v10 = v8 + v9;
  v28 = a5;
LABEL_7:
  v11 = *(unsigned int *)(a3 + 4);
  v27 = *(char *)(a3 + 12);
  v12 = *(_DWORD *)(a3 + 8);
  v13 = (unsigned int)(v12 + v10);
  v24 = (_DWORD *)a3;
  v26 = v12;
  v25 = v13;
  v14 = sub_184F39060(a1, a2: (unsigned int)v13, a3: v5 + 8 * v11, a4: v27, a5: v27, a6: v13);
  v23 = v14;
  if ( v27 != 0 )
    MEMORY[0x1863274C0](a1: v15, a2: v16, a3: v28, a4: v27, a5: v25, a6: v14);
  else
    MEMORY[0x186326F00](a1: v15, a2: v16, a3: v28, a4: v27, a5: v25, a6: v14);
  v19 = (unsigned __int64)v24;
  v24[1] = (unsigned __int64)(v23 - v5) >> 3;
  if ( (*(_DWORD *)v19 & 2) != 0 )
  {
    v21 = (v19 & 0xFFFFFFFFFFF80000LL) + 2112;
    if ( *(_BYTE *)((v19 & 0xFFFFFFFFFFF80000LL) + ((v19 - v21) >> 9) + 0x38) != 0 )
      *(_BYTE *)((v19 & 0xFFFFFFFFFFF80000LL) + ((v19 - v21) >> 9) + 0x38) = 0;
  }
  *(_DWORD *)(v19 + 8) = v25;
  if ( *(int *)(v6 + 16) <= 0 )
    MEMORY[0x18277F280](a1: v17, a2: v18, a3: v19, a4: v27);
  return v19;
}
