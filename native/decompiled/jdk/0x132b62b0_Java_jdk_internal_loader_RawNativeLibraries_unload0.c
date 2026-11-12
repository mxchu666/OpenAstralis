// Java_jdk_internal_loader_RawNativeLibraries_unload0
// rva 0x132b62b0  size 103  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_jdk_internal_loader_RawNativeLibraries_unload0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  __int64 result; // rax
  __int64 v9; // rdi
  __int64 v10; // rsi
  __int64 v11; // rdx
  __int64 v12; // rsi
  __int64 v13; // rdi
  __int64 v14; // rsi

  result = sub_1932B6318(a1);
  if ( (_BYTE)result != 0 )
  {
    result = sub_1932B0228(a1: v9, a2: v10, a3: v10, a4, a5: 0);
    if ( result != 0 )
    {
      sub_1932C89B0(a1: result, a2: v12, a3: v11, a4: a6);
      return sub_1932B110C(a1: v13, a2: v14, a3: v14, a4, a5: v13);
    }
  }
  return result;
}
