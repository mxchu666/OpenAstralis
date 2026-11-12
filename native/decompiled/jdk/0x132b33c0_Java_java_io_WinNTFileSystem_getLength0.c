// Java_java_io_WinNTFileSystem_getLength0
// rva 0x132b33c0  size 376  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_java_io_WinNTFileSystem_getLength0(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5)
{
  __int64 v5; // rax
  __int64 v6; // rdx
  __int64 v7; // rsi
  __int64 v8; // r8
  __int64 v9; // r9
  __int64 v10; // rdi
  __int64 v11; // rdx
  __int64 v12; // rdi
  __int64 v13; // rsi
  int v14; // r8d
  int v15; // r9d
  __int64 v16; // r14
  __int64 v17; // rax
  __int64 v18; // rdi
  __int64 v19; // rsi
  __int64 v20; // rax
  __int64 v21; // rdi
  __int64 v22; // rsi
  _BYTE *v23; // rax
  __int64 v25[5]; // [rsp+0h] [rbp-100h] BYREF
  _DWORD v26[7]; // [rsp+28h] [rbp-D8h] BYREF
  char v27; // [rsp+50h] [rbp-B0h] BYREF
  _DWORD v28[7]; // [rsp+90h] [rbp-70h] BYREF
  unsigned int v29; // [rsp+ACh] [rbp-54h]
  unsigned int v30; // [rsp+B0h] [rbp-50h]
  _BYTE v31[548]; // [rsp+BCh] [rbp-44h] BYREF
  __int64 v32; // [rsp+2E0h] [rbp+1E0h]

  v5 = sub_1932B8E48(a1, a2, a3: a5, a4, a5: MEMORY[0x337630]);
  v10 = v5;
  if ( v5 != 0 )
  {
    if ( (unsigned int)MEMORY[0x79308](a1: v5, a2: v7, a3: 0, a4: v5, a5: v26) != 0 )
    {
      if ( (v26[0] & 0x400) != 0 )
        sub_1932B3D7C(a1: v12, a2: v13, a3: (unsigned int)&v27, a4: v12, a5: v14, a6: v15, a7: v25[0], a8: v25[1]);
    }
    else if ( (unsigned int)MEMORY[0x79758](a1: v12) == 32 )
    {
      v16 = MEMORY[0x792E0](a1: v12, a2: v13, a3: v28, a4: v12);
      if ( v16 != -1 )
      {
        if ( (v28[0] & 0x400) == 0 )
        {
          v17 = sub_1932CA17F(a1: v12, a2: v13, a3: 92, a4: v12);
          v19 = v17 != 0 ? v17 + 2 : v18;
          v20 = sub_1932CA17F(a1: v18, a2: v19, a3: 92, a4: v31);
          v23 = v20 != 0 ? (_BYTE *)(v20 + 2) : v31;
          if ( (unsigned int)MEMORY[0x79C68](a1: v21, a2: v22, a3: v23, a4: v22) == 0 )
          {
            v25[4] = __PAIR64__(v29, v30);
            if ( __PAIR64__(v29, v30) > 0x7FFFFFFFFFFFFFFFLL )
              JUMPOUT(0x32650D4FCLL);
          }
        }
        MEMORY[0x79490](a1: v12, a2: v13, a3: v11, a4: v16);
      }
    }
    MEMORY[0x79AE0](a1: v12, a2: v13, a3: v11, a4: v12);
  }
  return sub_1932C8DE0(a1: v10, a2: v7, a3: v6, a4: (unsigned __int64)v25 ^ v32, a5: v8, a6: v9);
}
