// Java_sun_nio_fs_WindowsNativeDispatcher_AccessCheck
// rva 0x132a4ff0  size 224  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_AccessCheck(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        int a5,
        __int64 a6,
        int a7,
        __int64 a8,
        int a9,
        __int64 a10,
        __int64 a11,
        int a12,
        int a13,
        int a14,
        int a15,
        int a16,
        int a17,
        int a18,
        int a19,
        int a20,
        int a21,
        int a22,
        int a23,
        int a24,
        int a25,
        int a26,
        __int64 a27)
{
  int v27; // ebx
  int v29; // edi
  int v30; // esi
  _DWORD v32[4]; // [rsp+40h] [rbp-40h] BYREF
  _DWORD v33[4]; // [rsp+50h] [rbp-30h] BYREF
  __int128 v34; // [rsp+60h] [rbp-20h]
  int v35; // [rsp+70h] [rbp-10h]
  int v36; // [rsp+A8h] [rbp+28h]

  v36 = v27;
  v32[0] = a11;
  v33[0] = a12;
  v33[1] = a13;
  v33[2] = a14;
  v33[3] = a15;
  v35 = 0;
  v32[2] = 0;
  v32[1] = 0;
  v34 = 0;
  v32[3] = 20;
  MEMORY[0x790A0](a1: a6, a2: a4, a3: v33, a4: v32);
  return sub_1932A5082(
           a1: v29,
           a2: v30,
           a3: a5,
           a4: v29,
           a5: v32[0],
           a6: (unsigned int)v33,
           a7,
           a8: v36,
           a9,
           a10,
           a11,
           a12,
           a13,
           a14,
           a15,
           a16,
           a17,
           a18,
           a19,
           a20,
           a21,
           a22,
           a23,
           a24,
           a25,
           a26,
           a27);
}
