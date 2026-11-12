// Java_java_io_FileDescriptor_initIDs
// rva 0x132b2504  size 151  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_java_io_FileDescriptor_initIDs(__int64 a1, __int64 a2, __int64 a3, __int64 a4)
{
  __int64 result; // rax
  __int64 v6; // rdi
  __int64 v7; // rsi
  __int64 v8; // rdi
  __int64 v9; // rsi

  result = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 752LL))(
             a1: a3,
             a2,
             a3,
             a4,
             a5: 535016,
             a6: 535012);
  MEMORY[0x337F98] = result;
  if ( result != 0 )
  {
    result = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 752LL))(
               a1: v6,
               a2: v7,
               a3: v6,
               a4,
               a5: 534444,
               a6: 534440);
    MEMORY[0x337F90] = result;
    if ( result != 0 )
    {
      result = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 752LL))(
                 a1: v8,
                 a2: v9,
                 a3: v8,
                 a4,
                 a5: 543468,
                 a6: 537192);
      MEMORY[0x337F88] = result;
    }
  }
  return result;
}
