// Java_java_io_WinNTFileSystem_getDriveDirectory
// rva 0x132b3198  size 138  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
unsigned __int16 *__fastcall Java_java_io_WinNTFileSystem_getDriveDirectory(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        unsigned int a5)
{
  unsigned __int16 *result; // rax
  __int64 v6; // rsi
  unsigned __int16 *v7; // rbp
  __int64 v8; // rdx
  __int64 v9; // rdi
  __int64 *v10; // rsi
  __int64 v11; // rbx
  unsigned int v12; // eax
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 v15; // rbx
  __int64 v16; // rdx
  __int64 v17; // rdi
  __int64 v18; // rsi

  result = (unsigned __int16 *)sub_1932B8BD8(a1, a2: a4, a3, a4: a5);
  v7 = result;
  if ( result != nullptr )
  {
    if ( (unsigned int)MEMORY[0x79C78](a1: result, a2: v6, a3: 259, a4: *result) != 0 && *(_WORD *)(v9 + 2) == 58 )
      v9 += 4;
    v11 = *v10;
    v12 = MEMORY[0x79CB0](a1: v9, a2: v10, a3: v8, a4: v9);
    v15 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(v11 + 1304))(
            a1: v13,
            a2: v14,
            a3: v13,
            a4: v14,
            a5: v12);
    MEMORY[0x79AE0](a1: v17, a2: v18, a3: v16, a4: v7);
    return (unsigned __int16 *)v15;
  }
  return result;
}
