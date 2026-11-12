// Java_java_io_WinNTFileSystem_checkAccess0
// rva 0x132b2f48  size 122  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
char __fastcall Java_java_io_WinNTFileSystem_checkAccess0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        int a6)
{
  __int64 v7; // rax
  __int64 v8; // rdx
  __int64 v9; // rdi
  unsigned int v10; // eax
  __int64 v11; // rdi
  __int64 v12; // rsi
  unsigned int v13; // eax
  __int64 v14; // rdx
  __int64 v15; // rsi
  int v16; // edi
  char result; // al

  v7 = sub_1932B8E48(a1, a2, a3: a5, a4, a5: MEMORY[0x337630]);
  if ( v7 != 0 )
  {
    v10 = MEMORY[0x79300](a1: v9, a2: v7, a3: v8, a4: v7);
    v13 = sub_1932B3ED4(a1: v11, a2: v12, a3: v10, a4: v12);
    MEMORY[0x79AE0](a1: v13, a2: v15, a3: v14, a4: v15);
    if ( v16 != -1 )
    {
      result = 1;
      if ( a6 == 1 )
        return result;
      if ( a6 != 2 )
      {
        if ( a6 == 4 )
          return result;
      }
      else if ( (v16 & 0x11) != 1 )
      {
        return result;
      }
    }
  }
  return 0;
}
