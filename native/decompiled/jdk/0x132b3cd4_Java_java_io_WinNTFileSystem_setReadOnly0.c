// Java_java_io_WinNTFileSystem_setReadOnly0
// rva 0x132b3cd4  size 167  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
char __fastcall Java_java_io_WinNTFileSystem_setReadOnly0(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5)
{
  __int64 v5; // rax
  __int64 v6; // rdx
  __int64 v7; // rdi
  __int64 v8; // rsi
  __int64 v9; // rbx
  int v10; // eax
  __int64 v11; // rdx
  __int64 v12; // rdi
  __int64 v13; // rsi
  int v14; // r8d
  int v15; // r9d
  __int64 v16; // rsi
  __int64 v17; // rdx
  __int64 v18; // rdi
  char v19; // di

  v5 = sub_1932B8E48(a1: 0, a2: a4, a3: a5, a4, a5: MEMORY[0x337630]);
  v9 = v5;
  if ( v5 != 0 )
  {
    v10 = MEMORY[0x79300](a1: v7, a2: v8, a3: v6, a4: v5);
    if ( v10 != -1 )
    {
      if ( (v10 & 0x400) == 0
        || (v13 = sub_1932B4034(a1: v12, a2: v13, a3: v9, a4: v13, a5: v14, a6: v15)) != 0
        && (MEMORY[0x79AE0](a1: v12, a2: v13, a3: v11, a4: v9),
            v9 = v16,
            (v10 = MEMORY[0x79300](a1: v18, a2: v16, a3: v17, a4: v16)) != -1) )
      {
        if ( (v10 & 0x10) == 0 )
        {
          if ( (unsigned int)MEMORY[0x79348](a1: v12, a2: 1, a3: v10 | 1u, a4: v9) == 0 )
            JUMPOUT(0x32650DD5FLL);
          v12 = (unsigned int)v13;
        }
      }
    }
    MEMORY[0x79AE0](a1: v12, a2: v13, a3: v11, a4: v9);
    LOBYTE(v5) = v19;
  }
  return v5;
}
