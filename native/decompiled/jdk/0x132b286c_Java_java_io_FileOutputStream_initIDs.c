// Java_java_io_FileOutputStream_initIDs
// rva 0x132b286c  size 43  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_java_io_FileOutputStream_initIDs(__int64 a1, __int64 a2, __int64 a3, __int64 a4)
{
  __int64 result; // rax

  result = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 752LL))(
             a1,
             a2,
             a3,
             a4,
             a5: 535016,
             a6: 543544);
  MEMORY[0x337F78] = result;
  return result;
}
