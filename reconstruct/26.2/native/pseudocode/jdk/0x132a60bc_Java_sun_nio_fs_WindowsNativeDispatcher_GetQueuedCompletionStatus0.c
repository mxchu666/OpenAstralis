// Java_sun_nio_fs_WindowsNativeDispatcher_GetQueuedCompletionStatus0
// rva 0x132a60bc  size 190  section .text  group jdk
// window base 0x1932a60bc: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_GetQueuedCompletionStatus0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  int v7; // eax
  __int64 v8; // rdi
  __int64 v9; // rsi
  __int64 v10; // r9
  unsigned int v11; // eax
  __int64 v12; // rdi
  __int64 v13; // rsi
  __int64 v15; // rdi
  __int64 v16; // rsi
  __int64 v17; // rdi
  __int64 v18; // rsi
  unsigned int v19; // [rsp+30h] [rbp-28h] BYREF
  __int64 v20; // [rsp+38h] [rbp-20h] BYREF
  _QWORD v21[3]; // [rsp+40h] [rbp-18h] BYREF

  v7 = MEMORY[0x79370](a1: a6, a2, a3: &v19, a4: a5, a5: v21, a6: &v20);
  v10 = 0;
  if ( v7 == 0 )
  {
    if ( v20 == 0 )
    {
      v11 = MEMORY[0x79758](a1: v8);
      return sub_1932A6F44(a1: v12, a2: v13, a3: v11, a4);
    }
    v10 = (unsigned int)MEMORY[0x79758](a1: v8);
  }
  (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 872LL))(
    a1: v8,
    a2: v9,
    a3: v8,
    a4,
    a5: MEMORY[0x337430],
    a6: v10);
  (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 872LL))(
    a1: v15,
    a2: v16,
    a3: v15,
    a4,
    a5: MEMORY[0x337438],
    a6: v19);
  return (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 880LL))(
           a1: v17,
           a2: v18,
           a3: v17,
           a4,
           a5: MEMORY[0x337440],
           a6: v21[0]);
}
