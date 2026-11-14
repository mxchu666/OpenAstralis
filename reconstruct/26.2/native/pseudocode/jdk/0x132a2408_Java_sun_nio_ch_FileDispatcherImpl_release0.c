// Java_sun_nio_ch_FileDispatcherImpl_release0
// rva 0x132a2408  size 182  section .text  group jdk
// window base 0x1932a2408: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_FileDispatcherImpl_release0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        int a9,
        int a10,
        __int64 a11)
{
  __int64 v12; // rax
  __int64 v13; // rdi
  __int64 result; // rax
  __int64 v15; // rdi
  __int64 v16; // rdi
  __int64 v17; // rsi
  __int64 v18; // rdi
  _BYTE v19[16]; // [rsp+30h] [rbp-28h] BYREF
  __int64 v20; // [rsp+40h] [rbp-18h]
  __int64 v21; // [rsp+48h] [rbp-10h]

  v12 = sub_1932A2CD8(a1: a4, a2, a3: a5);
  v20 = a6;
  v21 = 0;
  result = MEMORY[0x79658](a1: v13, a2: v12, a3: 0, a4: v12, a5: a11, a6: a11 >> 32);
  if ( (_DWORD)result == 0 )
  {
    result = MEMORY[0x79758](a1: v15);
    if ( (_DWORD)result == 997 )
    {
      result = MEMORY[0x79648](a1: v16, a2: v17, a3: v19, a4: v17, a5: &a11, a6: 1);
      if ( (_DWORD)result != 0 )
        return result;
      result = MEMORY[0x79758](a1: v18);
    }
    if ( (_DWORD)result != 158 )
      return sub_1932B1580(a1: v16, a2: v17, a3: 534776, a4: v16);
  }
  return result;
}
