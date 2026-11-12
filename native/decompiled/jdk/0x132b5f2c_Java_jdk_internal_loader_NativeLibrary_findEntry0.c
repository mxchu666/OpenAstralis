// Java_jdk_internal_loader_NativeLibrary_findEntry0
// rva 0x132b5f2c  size 116  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_jdk_internal_loader_NativeLibrary_findEntry0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        int a5,
        __int64 a6)
{
  __int64 result; // rax
  int v9; // edi
  int v10; // r8d
  int v11; // r9d
  __int64 v12; // rdi
  __int64 v13; // rbx
  __int64 v14; // rsi

  result = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 1352LL))(
             a1: a4,
             a2,
             a3: a6,
             a4,
             a5: 0);
  if ( result != 0 )
  {
    v13 = sub_1932C8820(a1: v9, a2: result, a3: result, a4: a5, a5: v10, a6: v11);
    (*(void (__fastcall **)(__int64, __int64, __int64, __int64, __int64))(*(_QWORD *)v12 + 1360LL))(
      a1: v12,
      a2: v14,
      a3: a6,
      a4: v12,
      a5: v14);
    return v13;
  }
  return result;
}
