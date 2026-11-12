// Java_java_io_WinNTFileSystem_initIDs
// rva 0x132b36d8  size 77  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_java_io_WinNTFileSystem_initIDs(__int64 a1, __int64 a2, __int64 a3, __int64 a4)
{
  __int64 result; // rax
  __int64 v6; // rdi
  __int64 v7; // rsi

  result = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a4 + 48LL))(a1, a2, a3: 543680);
  if ( result != 0 )
  {
    result = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 752LL))(
               a1: v6,
               a2: v7,
               a3: result,
               a4,
               a5: 543696,
               a6: 535736);
    MEMORY[0x337630] = result;
  }
  return result;
}
