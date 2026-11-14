// Java_sun_nio_fs_WindowsNativeDispatcher_FindNextFile0
// rva 0x132a58c0  size 117  section .text  group jdk
// window base 0x1932a58c0: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_FindNextFile0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  __int64 v7; // rdx
  __int64 v8; // rdi
  _QWORD *v9; // rsi
  unsigned int v10; // eax
  __int64 v11; // rdi
  __int64 v12; // rsi
  __int64 v14; // rdi
  unsigned int v15; // eax
  __int64 v16; // rdi
  __int64 v17; // rsi

  if ( (unsigned int)MEMORY[0x792E8](a1, a2: a4, a3: a6, a4: a5) != 0 )
  {
    v10 = MEMORY[0x79CB0](a1: *v9, a2: v9, a3: v7, a4: a6 + 44);
    return (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(v11 + 1304))(
             a1: v11,
             a2: v12,
             a3: a6 + 44,
             a4: v12,
             a5: v10);
  }
  else
  {
    if ( (unsigned int)MEMORY[0x79758](a1: v8) != 18 )
    {
      v15 = MEMORY[0x79758](a1: v14);
      sub_1932A6F44(a1: v16, a2: v17, a3: v15, a4: v17);
    }
    return 0;
  }
}
