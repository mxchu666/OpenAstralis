// sub_1827527A0
// rva 0x027527a0  size 395  section .text  group samples
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall sub_1827527A0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        _DWORD *a5,
        __int64 (__fastcall *a6)(__int64, _QWORD, _DWORD *, _DWORD *, _DWORD *, __int64))
{
  _DWORD *v6; // r14
  __int64 v7; // r15
  __int64 v9; // rdx
  __int64 v10; // r9
  __int64 v11; // r9
  __int64 result; // rax
  __int64 v13; // rdx
  __int64 v14; // rdi
  __int64 v15; // rsi
  __int64 v16; // [rsp+0h] [rbp-8h] BYREF

  if ( (unsigned __int64)&v16 <= *(_QWORD *)(v7 + 8) )
    goto LABEL_30;
  if ( a5 == v6 )
    goto LABEL_29;
  if ( a5[2] != 5 )
    goto LABEL_29;
  v9 = (unsigned int)a5[4];
  if ( (_DWORD)v9 != 0 && v6[2 * v9] >> 3 != 4291287 )
    goto LABEL_29;
  v10 = (unsigned int)a5[5];
  if ( (_DWORD)v10 == 0 )
    goto LABEL_29;
  a1 = v6[2 * v10] >> 3;
  switch ( (_DWORD)a1 )
  {
    case 0x4103C8:
      v11 = (unsigned int)v6[2 * v10 + 1];
      break;
    case 0x416FB5:
      v11 = (unsigned int)SLOBYTE(v6[2 * v10 + 1]);
      break;
    case 0x416FCB:
      v11 = (unsigned int)SLOWORD(v6[2 * v10 + 1]);
      break;
    case 0x416FE1:
      v11 = LOWORD(v6[2 * v10 + 1]);
      break;
    default:
      goto LABEL_29;
  }
  a1 = (unsigned int)a5[6];
  if ( (_DWORD)a1 == 0 )
  {
LABEL_29:
    sub_182757000(a1, a2, a3: a5);
LABEL_30:
    MEMORY[0x181EB84E0]();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    return sub_182752940();
  }
  a2 = v6[2 * a1] >> 3;
  switch ( (_DWORD)a2 )
  {
    case 0x4103C8:
      a1 = (unsigned int)v6[2 * a1 + 1];
LABEL_12:
      a2 = (unsigned int)a5[7];
      if ( (_DWORD)a2 == 0 || v6[2 * a2] >> 3 != 4261917 )
        goto LABEL_29;
      result = a6(a1, a2: LOBYTE(v6[2 * a2 + 1]), a3: &v6[2 * a5[3]], a4: &v6[2 * v9], a5: &v6[2 * v9], a6: v11);
      if ( *(int *)(v7 + 16) <= 0 )
        return sub_18277F280(a1: v14, a2: v15, a3: v13);
      return result;
    case 0x416FB5:
      a1 = (unsigned int)SLOBYTE(v6[2 * a1 + 1]);
      goto LABEL_12;
    case 0x416FCB:
      a1 = (unsigned int)SLOWORD(v6[2 * a1 + 1]);
      goto LABEL_12;
    case 0x416FE1:
      a1 = LOWORD(v6[2 * a1 + 1]);
      goto LABEL_12;
    default:
      goto LABEL_29;
  }
}
