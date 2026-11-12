// Java_java_io_FileDescriptor_sync0
// rva 0x132b259c  size 70  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_java_io_FileDescriptor_sync0(__int64 a1, __int64 a2, __int64 a3, __int64 a4)
{
  __int64 v5; // rax
  __int64 v6; // rdx
  __int64 v7; // rdi
  __int64 v8; // rsi
  __int64 result; // rax
  int v10; // edi
  int v11; // esi

  v5 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 808LL))(
         a1,
         a2,
         a3,
         a4,
         a5: MEMORY[0x337F90]);
  result = sub_1932B9200(a1: v7, a2: v8, a3: v6, a4: v5);
  if ( (_DWORD)result == -1 )
    return JNU_ThrowByName(a1: v10, a2: v11, a3: 543496, a4, a5: 543480);
  return result;
}
