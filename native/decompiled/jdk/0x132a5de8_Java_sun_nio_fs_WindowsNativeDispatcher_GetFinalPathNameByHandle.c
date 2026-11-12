// Java_sun_nio_fs_WindowsNativeDispatcher_GetFinalPathNameByHandle
// rva 0x132a5de8  size 290  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_fs_WindowsNativeDispatcher_GetFinalPathNameByHandle(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  unsigned int v7; // eax
  __int64 v8; // rdx
  __int64 v9; // rsi
  __int64 v10; // rdx
  __int64 v11; // rdi
  __int64 v12; // rsi
  __int64 v13; // r8
  __int64 v14; // r9
  __int64 v15; // rax
  __int64 v16; // rdi
  __int64 v17; // rsi
  __int64 v18; // rbp
  unsigned int v19; // eax
  __int64 v20; // rdi
  __int64 v21; // rsi
  __int64 v22; // r8
  __int64 v23; // rdx
  __int64 v24; // rdi
  __int64 v25; // rsi
  unsigned int v26; // eax
  __int64 v27; // rdi
  __int64 v28; // rsi
  __int64 v30; // [rsp+0h] [rbp-258h] BYREF
  _BYTE v31[528]; // [rsp+20h] [rbp-238h] BYREF
  __int64 v32; // [rsp+230h] [rbp-28h]

  v7 = MEMORY[0x79310](a1, a2: 0, a3: v31, a4: a5, a5: 260, a6: 0);
  if ( v7 != 0 )
  {
    if ( v7 >= 0x104 )
    {
      v15 = MEMORY[0x79AD0](a1: v7 + 1, a2: v9, a3: v8, a4: 2LL * (v7 + 1));
      v18 = v15;
      if ( v15 != 0 )
      {
        v19 = MEMORY[0x79310](a1: v16, a2: v17, a3: v15, a4: a5, a5: (unsigned int)v16, a6: 0);
        if ( v19 != 0 )
          v25 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 1304LL))(
                  a1: v20,
                  a2: v21,
                  a3: v18,
                  a4,
                  a5: v19);
        else
          sub_1932B15B0(a1: v20, a2: v21, a3: 536432, a4, a5: v22);
        MEMORY[0x79AE0](a1: v24, a2: v25, a3: v23, a4: v18);
      }
      else
      {
        sub_1932B15D0(a1: v16, a2: v17, a3: 536392, a4);
      }
    }
    else
    {
      v12 = (*(__int64 (__fastcall **)(_QWORD, __int64, _BYTE *, __int64, _QWORD))(*(_QWORD *)a4 + 1304LL))(
              a1: v7,
              a2: v9,
              a3: v31,
              a4,
              a5: v7);
    }
  }
  else
  {
    v26 = MEMORY[0x79758](a1: 0);
    sub_1932A6F44(a1: v27, a2: v28, a3: v26, a4);
  }
  return sub_1932C8DE0(a1: v11, a2: v12, a3: v10, a4: (unsigned __int64)&v30 ^ v32, a5: v13, a6: v14);
}
