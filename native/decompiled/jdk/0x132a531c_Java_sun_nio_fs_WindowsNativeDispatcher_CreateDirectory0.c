// Java_sun_nio_fs_WindowsNativeDispatcher_CreateDirectory0
// rva 0x132a531c  size 79  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_CreateDirectory0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  int *v7; // rdx
  __int64 result; // rax
  __int64 v9; // rdi
  unsigned int v10; // eax
  __int64 v11; // rdi
  __int64 v12; // rsi
  int v13; // [rsp+20h] [rbp-28h] BYREF
  __int64 v14; // [rsp+28h] [rbp-20h]
  int v15; // [rsp+30h] [rbp-18h]

  if ( a6 != 0 )
  {
    v13 = 24;
    v7 = &v13;
    v14 = a6;
    v15 = 0;
  }
  else
  {
    v7 = nullptr;
  }
  result = MEMORY[0x79620](a1, a2, a3: v7, a4: a5);
  if ( (_DWORD)result == 0 )
  {
    v10 = MEMORY[0x79758](a1: v9);
    return sub_1932A6F44(a1: v11, a2: v12, a3: v10, a4);
  }
  return result;
}
