// Java_jdk_internal_loader_NativeLibraries_unload
// rva 0x132b5e70  size 187  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_jdk_internal_loader_NativeLibraries_unload(
        int a1,
        __int64 a2,
        int a3,
        __int64 a4,
        int a5,
        int a6,
        __int64 a7,
        __int64 a8,
        __int64 a9,
        __int64 a10,
        __int64 a11)
{
  char v11; // bp
  __int64 result; // rax
  __int64 v14; // rdi
  __int64 v15; // rsi
  int v16; // esi
  __int64 v17; // rdx
  __int64 v18; // rdi
  __int64 v19; // rsi
  void (__fastcall *v20)(__int64, __int64, _QWORD, _QWORD); // r14
  __int64 v21; // rdi
  __int64 v22; // rsi
  _QWORD v23[3]; // [rsp+20h] [rbp-18h] BYREF

  v11 = a6;
  result = sub_1932B6080(a1, a2: a5, a3, a4, a5, a6);
  if ( (_BYTE)result != 0 )
  {
    result = sub_1932B0228(a1: v14, a2: v15, a3: v15, a4, a5: 0);
    if ( result != 0 )
    {
      v20 = (void (__fastcall *)(__int64, __int64, _QWORD, _QWORD))sub_1932B5FA0(
                                                                     a1: result,
                                                                     a2: v16,
                                                                     a3: a11,
                                                                     a4,
                                                                     a5: v11 != 0 ? result : 0,
                                                                     a6: 0);
      if ( v20 != nullptr )
      {
        (*(void (__fastcall **)(__int64, __int64, _QWORD *, __int64))(*(_QWORD *)a4 + 1752LL))(
          a1: v18,
          a2: v19,
          a3: v23,
          a4);
        v20(a1: v21, a2: v22, a3: 0, a4: v23[0]);
      }
      if ( v11 == 0 )
        sub_1932C89B0(a1: v18, a2: v19, a3: v17, a4: a11);
      return sub_1932B110C(a1: v18, a2: v19, a3: v19, a4, a5: v18);
    }
  }
  return result;
}
