// Java_java_net_NetworkInterface_boundInetAddress0
// rva 0x132abf6c  size 220  section .text  group jdk
// window base 0x1932abf6c: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
char __fastcall Java_java_net_NetworkInterface_boundInetAddress0(
        int a1,
        int a2,
        __int64 a3,
        int a4,
        int a5,
        int a6,
        __int64 a7,
        __int64 a8,
        int a9,
        _DWORD *a10)
{
  char v12; // bl
  int v13; // eax
  __int64 v14; // rsi
  int v15; // r9d
  int v16; // ecx
  __int64 v17; // rdi
  char v18; // al
  __int64 v19; // rdi
  int v20; // edx
  __int64 v21; // rdi
  _DWORD *v23; // [rsp+20h] [rbp-28h] BYREF

  v12 = 0;
  v13 = sub_1932AD2D4(a1, a2, a3: (unsigned int)&a10, a4, a5: (unsigned int)&v23, a6);
  if ( v13 != 0 )
  {
    v16 = (int)a10;
    v17 = 0;
    if ( *a10 != 0 )
    {
      while ( 1 )
      {
        v18 = NET_SockaddrEqualsInetAddress(
                a1: v17,
                a2: 80LL * (unsigned int)v17,
                a3: 80 * (int)v17 + v16 + 8,
                a4,
                a5,
                a6: v15);
        v16 = (int)a10;
        if ( v18 != 0 && (unsigned int)(*(_DWORD *)((char *)a10 + v14 + 72) - 3) <= 1 )
          break;
        v17 = (unsigned int)(v19 + 1);
        if ( (unsigned int)v17 >= *a10 )
          goto LABEL_6;
      }
    }
    else
    {
LABEL_6:
      v20 = (int)v23;
      v19 = 0;
      if ( *v23 == 0 )
      {
LABEL_11:
        MEMORY[0x792A0](a1: v19);
        MEMORY[0x792A0](a1: v21);
        LOBYTE(v13) = v12;
        return v13;
      }
      while ( (unsigned __int8)NET_SockaddrEqualsInetAddress(
                                 a1: v19,
                                 a2: v14,
                                 a3: 48 * (int)v19 + 8 + v20,
                                 a4,
                                 a5,
                                 a6: v15) == 0 )
      {
        v20 = (int)v23;
        v19 = (unsigned int)(v19 + 1);
        if ( (unsigned int)v19 >= *v23 )
          goto LABEL_11;
      }
    }
    v12 = 1;
    goto LABEL_11;
  }
  return v13;
}
