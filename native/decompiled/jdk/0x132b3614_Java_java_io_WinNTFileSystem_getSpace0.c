// Java_java_io_WinNTFileSystem_getSpace0
// rva 0x132b3614  size 195  section .text  group jdk
// window base 0x1932b3614: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_java_io_WinNTFileSystem_getSpace0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        unsigned int a6)
{
  __int64 v6; // rax
  __int64 v7; // rdi
  __int64 v8; // rdx
  __int64 v9; // rdi
  __int64 v10; // rsi
  __int64 v11; // rdx
  __int64 v12; // rdi
  __int64 v13; // rsi
  __int64 v14; // r8
  __int64 v15; // r9
  __int64 v17; // [rsp+0h] [rbp-868h] BYREF
  __int64 v18; // [rsp+20h] [rbp-848h] BYREF
  __int64 v19; // [rsp+28h] [rbp-840h] BYREF
  __int64 v20; // [rsp+30h] [rbp-838h] BYREF
  _BYTE v21[2064]; // [rsp+40h] [rbp-828h] BYREF
  __int64 v22; // [rsp+850h] [rbp-18h]

  v6 = sub_1932B8E48(a1: a6, a2, a3: a5, a4, a5: MEMORY[0x337630]);
  if ( (unsigned int)MEMORY[0x79330](a1: v7, a2: v6, a3: v21, a4: v6, a5: 1024) != 0
    && (unsigned int)MEMORY[0x792F0](a1: v9, a2: v10, a3: &v18, a4: v21, a5: &v20, a6: &v19) != 0
    && (_DWORD)v9 != 0 )
  {
    v9 = (unsigned int)(v9 - 1);
  }
  MEMORY[0x79AE0](a1: v9, a2: v10, a3: v8, a4: v10);
  return sub_1932C8DE0(a1: v12, a2: v13, a3: v11, a4: (unsigned __int64)&v17 ^ v22, a5: v14, a6: v15);
}
