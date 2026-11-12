// Java_java_io_WinNTFileSystem_getBooleanAttributes0
// rva 0x132b3130  size 104  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_java_io_WinNTFileSystem_getBooleanAttributes0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  __int64 result; // rax
  __int64 v6; // rdx
  __int64 v7; // rdi
  __int64 v8; // rsi
  __int64 v9; // rbx
  __int64 v10; // rdx
  __int64 v11; // rdi
  __int64 v12; // rsi
  int v13; // r8d
  int v14; // r9d
  unsigned int v15; // eax
  unsigned int v16; // edi

  result = sub_1932B8E48(a1: 0, a2, a3: a5, a4, a5: MEMORY[0x337630]);
  v9 = result;
  if ( result != 0 )
  {
    if ( (unsigned int)sub_1932B41CC(a1: v7, a2: v8, a3: v6, a4: result) == 0 )
    {
      v15 = sub_1932B3E04(a1: v11, a2: v12, a3: v10, a4: v9, a5: v13, a6: v14);
      v10 = v15;
      if ( v15 != -1 )
      {
        v10 = 4 * (v15 & 2);
        v11 = (unsigned int)v10 | ((v15 & 0x10) != 0 ? 5 : 3);
      }
    }
    MEMORY[0x79AE0](a1: v11, a2: v12, a3: v10, a4: v9);
    return v16;
  }
  return result;
}
