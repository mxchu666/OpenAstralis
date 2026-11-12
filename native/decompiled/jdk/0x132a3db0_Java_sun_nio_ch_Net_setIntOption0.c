// Java_sun_nio_ch_Net_setIntOption0
// rva 0x132a3db0  size 209  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
_UNKNOWN **__fastcall Java_sun_nio_ch_Net_setIntOption0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        char a6,
        __int64 a7,
        int a8,
        int a9,
        int a10,
        unsigned int a11,
        unsigned int a12,
        int a13)
{
  _UNKNOWN **result; // rax
  int *v15; // rsi
  int v16; // eax
  int v17; // edi
  int v18; // esi
  __int64 v19; // rdi
  __int64 v20; // rsi
  int v21; // eax
  __int64 v22; // rdi
  __int64 v23; // rsi
  unsigned int v24; // eax
  __int64 v25; // rdi
  __int64 v26; // rsi
  int v27; // [rsp+30h] [rbp-18h] BYREF
  _UNKNOWN *retaddr; // [rsp+48h] [rbp+0h] BYREF

  result = &retaddr;
  if ( a11 == 0xFFFF && a12 == 128 )
  {
    v15 = &v27;
    if ( a13 < 0 )
    {
      v27 = 0;
    }
    else
    {
      HIWORD(v27) = a13;
      LOWORD(v27) = 1;
    }
  }
  else
  {
    v15 = &a13;
    if ( a11 == 41 && a12 == 39 )
      return result;
  }
  if ( a6 != 0 )
  {
    v16 = sub_1932A2CC4(a1, a2: v15, a3: a5);
    result = (_UNKNOWN **)sub_1932AEBF4(a1: v17, a2: v18, a3: a11, a4: v16, a5: a12, a6: v18);
  }
  else
  {
    v21 = sub_1932A2CC4(a1, a2: v15, a3: a5);
    result = (_UNKNOWN **)MEMORY[0x799F0](a1: v22, a2: v23, a3: a11, a4: v21, a5: a12, a6: v23);
  }
  if ( (_DWORD)result == -1 )
  {
    v24 = MEMORY[0x79958](a1: v19, a2: v20);
    return (_UNKNOWN **)sub_1932AED0C(a1: v25, a2: v26, a3: v24, a4, a5: 535256);
  }
  return result;
}
