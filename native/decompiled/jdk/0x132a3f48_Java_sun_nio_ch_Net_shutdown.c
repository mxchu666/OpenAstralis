// Java_sun_nio_ch_Net_shutdown
// rva 0x132a3f48  size 89  section .text  group jdk
// window base 0x1932a3f48: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_Net_shutdown(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5, int a6)
{
  unsigned int v6; // ebx
  int v7; // eax
  __int64 v8; // rdi
  __int64 v9; // rsi
  __int64 result; // rax
  __int64 v11; // rdi
  __int64 v12; // rsi
  unsigned int v13; // eax
  __int64 v14; // rdi
  __int64 v15; // rsi

  v6 = a6 != 0 ? (a6 != 1) + 1 : 0;
  v7 = sub_1932A2CC4(a1: a4, a2, a3: a5);
  result = MEMORY[0x79960](a1: v8, a2: v9, a3: v6, a4: v7);
  if ( (_DWORD)result == -1 )
  {
    v13 = MEMORY[0x79958](a1: v11, a2: v12);
    return sub_1932AED0C(a1: v14, a2: v15, a3: v13, a4: v14, a5: 535328);
  }
  return result;
}
