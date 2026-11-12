// Java_jdk_internal_loader_RawNativeLibraries_load0
// rva 0x132b6210  size 158  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
bool __fastcall Java_jdk_internal_loader_RawNativeLibraries_load0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  __int64 v8; // rdi
  __int64 v9; // rsi
  __int64 v10; // rax
  __int64 v11; // rdi
  __int64 v12; // rdi
  __int64 v13; // rbx
  __int64 v14; // rsi
  __int64 v15; // rdi
  __int64 v16; // rsi

  if ( (unsigned __int8)sub_1932B6318(a1: a4) == 0 )
    return false;
  v10 = sub_1932B0228(a1: v8, a2: v9, a3: a6, a4: v8, a5: 0);
  if ( v10 == 0 )
    return false;
  v13 = sub_1932C8980(a1: v11, a2: v10, a3: 0, a4: v10);
  (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)v12 + 880LL))(
    a1: v12,
    a2: v14,
    a3: a5,
    a4: v12,
    a5: MEMORY[0x337680],
    a6: v13);
  sub_1932B110C(a1: v15, a2: v16, a3: a6, a4: v15, a5: v16);
  return v13 != 0;
}
