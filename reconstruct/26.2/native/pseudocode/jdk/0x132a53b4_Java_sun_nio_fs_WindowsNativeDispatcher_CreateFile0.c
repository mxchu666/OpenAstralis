// Java_sun_nio_fs_WindowsNativeDispatcher_CreateFile0
// rva 0x132a53b4  size 153  section .text  group jdk
// window base 0x1932a53b4: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_CreateFile0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        unsigned int a6,
        __int64 a7,
        int a8,
        int a9,
        int a10,
        unsigned int a11,
        __int64 a12)
{
  int *v13; // r9
  __int64 v14; // rbx
  __int64 v15; // rdi
  unsigned int v16; // eax
  __int64 v17; // rdi
  __int64 v18; // rsi
  int v20; // [rsp+40h] [rbp-28h] BYREF
  __int64 v21; // [rsp+48h] [rbp-20h]
  int v22; // [rsp+50h] [rbp-18h]

  if ( a12 != 0 )
  {
    v20 = 24;
    v13 = &v20;
    v21 = a12;
    v22 = 0;
  }
  else
  {
    v13 = nullptr;
  }
  v14 = MEMORY[0x797B0](a1: a4, a2, a3: a6, a4: a5, a5: a11, a6: v13);
  if ( v14 == -1 )
  {
    v16 = MEMORY[0x79758](a1: v15);
    sub_1932A6F44(a1: v17, a2: v18, a3: v16, a4: v17);
  }
  return v14;
}
