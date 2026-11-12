// Java_sun_nio_fs_WindowsNativeDispatcher_FormatMessage
// rva 0x132a59d0  size 216  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_FormatMessage(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  unsigned int v5; // eax
  __int64 v6; // rdx
  __int64 *v7; // rdi
  __int64 v8; // rsi
  __int64 v9; // r8
  __int64 v10; // r9
  __int64 v11; // rbx
  unsigned int v12; // eax
  __int64 v13; // rdi
  __int64 v14; // rsi
  _QWORD v16[5]; // [rsp+0h] [rbp-258h] BYREF
  int v17; // [rsp+28h] [rbp-230h]
  __int64 v18; // [rsp+30h] [rbp-228h]
  _WORD v19[256]; // [rsp+40h] [rbp-218h] BYREF
  __int64 v20; // [rsp+240h] [rbp-18h]

  v18 = 0;
  v17 = 255;
  v16[4] = v19;
  v5 = MEMORY[0x793A0](a1: a4, a2, a3: 0, a4: 4096, a5, a6: 0);
  if ( v5 != 0 )
  {
    if ( v5 > 3 )
    {
      if ( v19[v5 - 1] == 10 )
        JUMPOUT(0x3264FFA34LL);
      if ( v19[v5 - 1] == 13 )
        JUMPOUT(0x3264FFA40LL);
      v6 = v5;
      if ( v19[v5 - 1] == 46 )
        JUMPOUT(0x3264FFA4CLL);
      if ( 2 * (unsigned __int64)v5 >= 0x1FE )
      {
        sub_1932C925C();
        __builtin_debugtrap();
      }
      v19[v5] = 0;
    }
    v11 = *v7;
    v12 = MEMORY[0x79CB0](a1: v7, a2: v8, a3: v6, a4: v19);
    (*(void (__fastcall **)(__int64, __int64, _WORD *, __int64, _QWORD))(v11 + 1304))(
      a1: v13,
      a2: v14,
      a3: v19,
      a4: v13,
      a5: v12);
  }
  return sub_1932C8DE0(a1: v7, a2: v8, a3: v6, a4: (unsigned __int64)v16 ^ v20, a5: v9, a6: v10);
}
