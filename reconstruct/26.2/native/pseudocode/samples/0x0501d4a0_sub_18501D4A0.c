// sub_18501D4A0
// rva 0x0501d4a0  size 583  section .text  group samples
// window base 0x18501d4a0: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall sub_18501D4A0(__int64 a1, __int64 a2, __int64 a3, __int64 a4, unsigned int a5, unsigned int a6)
{
  unsigned int v6; // ebp
  __int64 v7; // r14
  __int64 v8; // r15
  unsigned int v9; // eax
  int v10; // r9d
  __int64 v11; // r8
  __int64 v12; // rcx
  __int64 v13; // rdx
  unsigned int v15; // eax
  unsigned int v16; // eax
  unsigned int v17; // ebx
  unsigned int v18; // ebx
  __int64 v19; // rcx
  __int64 v20; // [rsp+0h] [rbp-28h] BYREF
  __int64 v21; // [rsp+8h] [rbp-20h]
  int v22; // [rsp+14h] [rbp-14h]
  unsigned int v23; // [rsp+18h] [rbp-10h]
  unsigned int v24; // [rsp+1Ch] [rbp-Ch]
  int v25; // [rsp+20h] [rbp-8h]
  unsigned int v26; // [rsp+24h] [rbp-4h]

  if ( (unsigned __int64)&v20 <= *(_QWORD *)(v8 + 8) )
  {
    v25 = a1;
    v24 = a6;
    v9 = MEMORY[0x181EB84E0]();
    goto LABEL_33;
  }
  v9 = a6 - a5;
  if ( (_DWORD)a1 == 0 )
  {
    v26 = a6 - a5;
    v25 = 0;
    v24 = a6;
    v23 = a5;
    v21 = a3;
    goto LABEL_5;
  }
  if ( (int)a6 <= (int)a5 )
  {
    v26 = a6 - a5;
    v25 = a1;
    v24 = a6;
    v23 = a5;
    v21 = a3;
    goto LABEL_5;
  }
  if ( a3 == v7 )
  {
LABEL_33:
    v26 = v9;
    v25 = a1;
    v24 = a6;
    MEMORY[0x182771080]();
    goto LABEL_34;
  }
  v26 = a6 - a5;
  v25 = a1;
  v19 = *(_DWORD *)(a3 + 8) >> 1;
  v21 = a3;
  v23 = a5;
  v24 = a6;
  v22 = v19;
  MEMORY[0x18632A360](a1: v7 + 376643464, a2, a3: a5, a4: v19, a5: a6, a6: (unsigned int)v19);
LABEL_5:
  v10 = v24 - 1;
  if ( (int)(v24 - 1) > (int)v23 )
  {
    v13 = v21;
    v15 = *(unsigned __int16 *)(v21 + (int)(2 * v23) + 12);
    v11 = v23 + 1;
    if ( v15 < 0xD800 )
    {
      v12 = v26;
    }
    else if ( v15 >= 0xDC00 )
    {
      v12 = v26;
    }
    else
    {
      v16 = *(unsigned __int16 *)(v21 + 2 * (int)v11 + 12);
      if ( v16 < 0xDC00 )
      {
        v12 = v26;
      }
      else if ( v16 >= 0xE000 )
      {
        v12 = v26;
      }
      else
      {
        v12 = v26 - 1;
        v11 = v23 + 2;
      }
    }
    while ( v10 > (int)v11 )
    {
      v17 = *(unsigned __int16 *)(v13 + 2 * (int)v11 + 12);
      v6 = v11 + 1;
      if ( v17 >= 0xD800 && v17 < 0xDC00 )
      {
        v18 = *(unsigned __int16 *)(v13 + (int)(2 * v6) + 12);
        if ( *(int *)(v8 + 16) <= 0 )
          MEMORY[0x18277F280](a1, a2, a3: v13, a4: v12);
        if ( v18 < 0xDC00 )
        {
          v11 = v6;
        }
        else if ( v18 >= 0xE000 )
        {
LABEL_34:
          v11 = v6;
        }
        else
        {
          v12 = (unsigned int)(v12 - 1);
          v11 = (unsigned int)(v11 + 2);
        }
      }
      else
      {
        if ( *(int *)(v8 + 16) <= 0 )
          MEMORY[0x18277F280](a1, a2, a3: v13, a4: v12);
        v11 = v6;
      }
    }
  }
  else
  {
    v11 = v23;
    v12 = v26;
    v13 = v21;
  }
  if ( *(int *)(v8 + 16) <= 0 )
    MEMORY[0x18277F280](a1, a2, a3: v13, a4: v12, a5: v11);
  return (unsigned int)v12;
}
