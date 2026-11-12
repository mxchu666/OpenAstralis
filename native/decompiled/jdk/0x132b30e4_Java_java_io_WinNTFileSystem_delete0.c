// Java_java_io_WinNTFileSystem_delete0
// rva 0x132b30e4  size 73  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
char __fastcall Java_java_io_WinNTFileSystem_delete0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        char a6)
{
  __int64 v7; // rax
  int v8; // edx
  int v9; // esi
  int v10; // r8d
  int v11; // r9d
  bool v12; // bl
  __int64 v13; // rdx
  __int64 v14; // rdi
  __int64 v15; // rsi

  v7 = sub_1932B8E48(a1, a2, a3: a5, a4, a5: MEMORY[0x337630]);
  if ( v7 != 0 )
  {
    LOBYTE(v8) = a6;
    v12 = (unsigned int)sub_1932B42F8(a1: v7, a2: v9, a3: v8, a4: v7, a5: v10, a6: v11) == 0;
    MEMORY[0x79AE0](a1: v14, a2: v15, a3: v13, a4: v14);
    LOBYTE(v7) = v12;
  }
  return v7;
}
