// Java_java_io_WinNTFileSystem_rename0
// rva 0x132b3a94  size 145  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
char __fastcall Java_java_io_WinNTFileSystem_rename0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  __int64 v7; // rbp
  __int64 v8; // rdi
  __int64 v9; // rsi
  __int64 v10; // rax
  __int64 v11; // rdx
  __int64 v12; // rdi
  __int64 v13; // rsi
  __int64 v14; // rbx
  int v15; // eax
  __int64 v16; // rdx
  __int64 v17; // rdi
  __int64 v18; // rsi
  char v19; // si

  v7 = sub_1932B8E48(a1: a6, a2: 0, a3: a5, a4, a5: MEMORY[0x337630]);
  v10 = sub_1932B8E48(a1: v8, a2: v9, a3: v8, a4, a5: MEMORY[0x337630]);
  v14 = v10;
  if ( v7 != 0 && v10 != 0 )
  {
    v15 = MEMORY[0x79AB8](a1: v12, a2: v13, a3: v10, a4: v7);
    v11 = 1;
    if ( v15 != 0 )
      JUMPOUT(0x32650DAFBLL);
    v13 = 1;
  }
  MEMORY[0x79AE0](a1: v12, a2: v13, a3: v11, a4: v7);
  MEMORY[0x79AE0](a1: v17, a2: v18, a3: v16, a4: v14);
  return v19;
}
