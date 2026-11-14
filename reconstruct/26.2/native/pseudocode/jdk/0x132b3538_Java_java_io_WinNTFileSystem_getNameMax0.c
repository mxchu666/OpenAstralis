// Java_java_io_WinNTFileSystem_getNameMax0
// rva 0x132b3538  size 217  section .text  group jdk
// window base 0x1932b3538: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_java_io_WinNTFileSystem_getNameMax0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        unsigned int a9)
{
  __int64 v10; // rdi
  __int64 v11; // rsi
  __int64 v12; // rbp
  unsigned int v13; // eax
  __int64 v14; // rdi

  if ( a5 != 0 )
  {
    v12 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 1320LL))(
            a1: a5,
            a2,
            a3: a5,
            a4,
            a5: 0);
    if ( v12 == 0 )
    {
LABEL_6:
      sub_1932B1580(a1: v10, a2: v11, a3: 543816, a4);
      return a9;
    }
    v13 = MEMORY[0x79328](a1: v10, a2: v11, a3: 0, a4: v12, a5: 0, a6: 0);
    (*(void (__fastcall **)(__int64, _QWORD, __int64, __int64, __int64))(*(_QWORD *)a4 + 1328LL))(
      a1: v14,
      a2: v13,
      a3: v14,
      a4,
      a5: v12);
  }
  else
  {
    v11 = (unsigned int)MEMORY[0x79328](a1: 0, a2, a3: 0, a4: 0, a5: 0, a6: 0);
  }
  if ( (_DWORD)v11 == 0 )
    goto LABEL_6;
  return a9;
}
