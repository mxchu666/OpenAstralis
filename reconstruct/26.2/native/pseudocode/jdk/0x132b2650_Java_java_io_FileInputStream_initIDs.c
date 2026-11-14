// Java_java_io_FileInputStream_initIDs
// rva 0x132b2650  size 43  section .text  group jdk
// window base 0x1932b2650: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_java_io_FileInputStream_initIDs(__int64 a1, __int64 a2, __int64 a3, __int64 a4)
{
  __int64 result; // rax

  result = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 752LL))(
             a1,
             a2,
             a3,
             a4,
             a5: 535016,
             a6: 543544);
  MEMORY[0x337F80] = result;
  return result;
}
