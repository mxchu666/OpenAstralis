// Java_java_io_FileCleanable_cleanupClose0
// rva 0x132b249c  size 48  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
void __fastcall Java_java_io_FileCleanable_cleanupClose0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  __int64 v7; // rdi
  __int64 v8; // rsi

  if ( a6 != -1 && (unsigned int)MEMORY[0x797C8](a1, a2, a3, a4: a6) == 0 )
    sub_1932B1580(a1: v7, a2: v8, a3: 543528, a4);
}
