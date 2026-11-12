// Java_java_io_WinNTFileSystem_setPermission0
// rva 0x132b3bf4  size 224  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
char __fastcall Java_java_io_WinNTFileSystem_setPermission0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        int a6,
        __int64 a7,
        __int64 a8,
        __int64 a9,
        int a10,
        char a11)
{
  __int64 v11; // rax
  __int64 v12; // rdx
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 v15; // rbx
  unsigned int v16; // eax
  __int64 v17; // rdi
  __int64 v18; // rsi
  int v19; // r8d
  int v20; // r9d
  __int64 v21; // rdx
  __int64 v22; // rsi
  __int64 v23; // rdx
  __int64 v24; // rdi
  char v25; // di

  if ( a6 == 4 || a6 == 1 )
  {
    LOBYTE(v11) = a11;
    return v11;
  }
  v11 = sub_1932B8E48(a1: 0, a2: a4, a3: a5, a4, a5: MEMORY[0x337630]);
  v15 = v11;
  if ( v11 != 0 )
  {
    v16 = MEMORY[0x79300](a1: v13, a2: v14, a3: v12, a4: v11);
    v21 = v16;
    if ( v16 != -1 )
    {
      if ( (v16 & 0x400) == 0 )
        goto LABEL_9;
      v18 = sub_1932B4034(a1: v17, a2: v18, a3: v15, a4: v18, a5: v19, a6: v20);
      if ( v18 == 0 )
      {
LABEL_13:
        MEMORY[0x79AE0](a1: v17, a2: v18, a3: v21, a4: v15);
        LOBYTE(v11) = v25;
        return v11;
      }
      MEMORY[0x79AE0](a1: v17, a2: v18, a3: v21, a4: v15);
      v15 = v22;
      v21 = (unsigned int)MEMORY[0x79300](a1: v24, a2: v22, a3: v23, a4: v22);
    }
    if ( (_DWORD)v21 != -1 )
    {
LABEL_9:
      if ( (v21 & 0x10) == 0 )
      {
        if ( a11 != (_BYTE)v17 )
          JUMPOUT(0x32650DC9CLL);
        if ( (unsigned int)MEMORY[0x79348](a1: v17, a2: v18, a3: (unsigned int)v21 | 1, a4: v15) == 0 )
          JUMPOUT(0x32650DCACLL);
        v17 = 1;
      }
      goto LABEL_13;
    }
    goto LABEL_13;
  }
  return v11;
}
