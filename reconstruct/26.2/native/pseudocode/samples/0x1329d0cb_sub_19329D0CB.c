// sub_19329D0CB
// rva 0x1329d0cb  size 140  section .text  group samples
// window base 0x19329d0cb: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
void __fastcall sub_19329D0CB(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        int a7,
        int a8,
        int a9,
        int a10,
        int a11,
        __int64 a12,
        int a13,
        __int64 a14,
        __int64 a15)
{
  unsigned __int64 v15; // rax
  unsigned int v16; // r10d
  unsigned int v17; // r11d
  _UNKNOWN **v18; // r9
  int v19; // ebx
  _UNKNOWN **v20; // rdi
  unsigned __int64 v21; // rdx
  unsigned __int64 v22; // r8
  _UNKNOWN *retaddr; // [rsp+0h] [rbp+0h] BYREF

  v18 = &retaddr;
  v19 = 5;
  v20 = &retaddr;
  do
  {
    ++v20;
    ++v18;
    v21 = v15 >> v19;
    v19 += 5;
    *(v20 - 1) = (_UNKNOWN *)(((unsigned __int64)*(v18 - 1) ^ v21) - 0x30FEC21428D5BBE7LL);
    v22 = (unsigned __int64)*(v18 - 1) >> (63 - (unsigned __int8)v16++);
    v15 ^= v22 | ((_QWORD)*(v18 - 1) << v16);
  }
  while ( v16 < v17 );
  JUMPOUT(0x19329D157LL);
}
