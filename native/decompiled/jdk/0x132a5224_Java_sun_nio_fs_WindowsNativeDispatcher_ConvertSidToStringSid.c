// Java_sun_nio_fs_WindowsNativeDispatcher_ConvertSidToStringSid
// rva 0x132a5224  size 113  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_ConvertSidToStringSid(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        int a8,
        __int64 a9)
{
  __int64 v9; // rdx
  __int64 *v10; // rdi
  __int64 v11; // rsi
  unsigned int v12; // eax
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 v16; // rbx
  unsigned int v17; // eax
  __int64 v18; // rdi
  __int64 v19; // rsi
  __int64 v20; // rbx
  __int64 v21; // rdx
  __int64 v22; // rdi
  __int64 v23; // rsi

  if ( (unsigned int)sub_1932CA311(a1: a4, a2, a3: &a9, a4: a5) != 0 )
  {
    v16 = *v10;
    v17 = MEMORY[0x79CB0](a1: v10, a2: v11, a3: v9, a4: a9);
    v20 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(v16 + 1304))(
            a1: v18,
            a2: v19,
            a3: a9,
            a4: v18,
            a5: v17);
    MEMORY[0x79398](a1: v22, a2: v23, a3: v21, a4: a9);
    return v20;
  }
  else
  {
    v12 = MEMORY[0x79758](a1: v10);
    sub_1932A6F44(a1: v13, a2: v14, a3: v12, a4: v13);
    return 0;
  }
}
