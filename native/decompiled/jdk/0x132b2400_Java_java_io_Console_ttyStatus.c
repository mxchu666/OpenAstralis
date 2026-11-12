// Java_java_io_Console_ttyStatus
// rva 0x132b2400  size 156  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_java_io_Console_ttyStatus(__int64 a1, __int64 a2, __int64 a3)
{
  unsigned int v3; // ebx
  __int64 v4; // rax
  __int64 v5; // rdx
  __int64 v6; // rdi
  __int64 v7; // rbp
  __int64 v8; // rdx
  __int64 v9; // rdi
  __int64 v10; // rsi
  __int64 v11; // rdx
  __int64 v12; // rdi
  __int64 v13; // rsi

  v3 = 0;
  v4 = MEMORY[0x79730](a1, a2, a3, a4: 4294967285LL);
  v7 = MEMORY[0x79730](a1: v6, a2: v4, a3: v5, a4: 4294967286LL);
  v12 = MEMORY[0x79730](a1: v9, a2: v10, a3: v8, a4: 4294967284LL);
  if ( v7 != -1 )
  {
    if ( (unsigned int)MEMORY[0x79680](a1: v12, a2: v13, a3: v11, a4: v7) != 2 )
      JUMPOUT(0x32650C458LL);
    v3 = 1;
  }
  if ( v13 != -1 && (unsigned int)MEMORY[0x79680](a1: v12, a2: v13, a3: v11, a4: v13) == 2 )
    v3 |= 2u;
  if ( v12 != -1 && (unsigned int)MEMORY[0x79680](a1: v12, a2: v13, a3: v11, a4: v12) == 2 )
    v3 |= 4u;
  return v3;
}
