// Java_java_net_NetworkInterface_getByInetAddress0
// rva 0x132ac1f0  size 335  section .text  group jdk
// window base 0x1932ac1f0: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_java_net_NetworkInterface_getByInetAddress0(__int64 a1, __int64 a2, __int64 a3, int a4, int a5)
{
  int v7; // edi
  int v8; // esi
  int v9; // r9d
  __int64 v10; // rdx
  __int64 v11; // rdi
  __int64 v12; // rsi
  __int64 v13; // r8
  __int64 v14; // r9
  int v15; // ecx
  __int64 v16; // rdi
  char v17; // al
  int v18; // edi
  __int64 v19; // rsi
  int v20; // edx
  __int64 v21; // rdi
  __int64 v22; // rax
  int v23; // r8d
  int v24; // r9d
  __int64 v25; // rdi
  __int64 v27[4]; // [rsp+0h] [rbp-100h] BYREF
  _DWORD *v28; // [rsp+20h] [rbp-E0h] BYREF
  _DWORD *v29; // [rsp+28h] [rbp-D8h] BYREF
  _QWORD v30[176]; // [rsp+30h] [rbp-D0h] BYREF

  sub_1932CA161(a1, a2, a3: 0, a4: v30, a5: 1352);
  if ( (unsigned int)sub_1932AD2D4(a1: v7, a2: v8, a3: (unsigned int)&v28, a4, a5: (unsigned int)&v29, a6: v9) != 0 )
  {
    v15 = (int)v28;
    v16 = 0;
    if ( *v28 != 0 )
    {
      while ( 1 )
      {
        v17 = NET_SockaddrEqualsInetAddress(
                a1: v16,
                a2: 80LL * (unsigned int)v16,
                a3: 80 * (int)v16 + v15 + 8,
                a4,
                a5,
                a6: v14);
        v15 = (int)v28;
        if ( v17 != 0 && (unsigned int)(*(_DWORD *)((char *)v28 + v19 + 72) - 3) <= 1 )
          break;
        v16 = (unsigned int)(v18 + 1);
        if ( (unsigned int)v16 >= *v28 )
          goto LABEL_6;
      }
      v22 = *(_QWORD *)((char *)v28 + v19 + 40);
      v23 = (int)v28;
      v24 = (int)v29;
    }
    else
    {
LABEL_6:
      v20 = (int)v29;
      v21 = 0;
      if ( *v29 == 0 )
      {
LABEL_13:
        MEMORY[0x792A0](a1: v21);
        MEMORY[0x792A0](a1: v25);
        return sub_1932C8DE0(a1: v11, a2: v12, a3: v10, a4: (unsigned __int64)v27 ^ v30[170], a5: v13, a6: v14);
      }
      while ( (unsigned __int8)NET_SockaddrEqualsInetAddress(
                                 a1: v21,
                                 a2: 48LL * (unsigned int)v21,
                                 a3: 48 * (int)v21 + v20 + 8,
                                 a4,
                                 a5,
                                 a6: v14) == 0 )
      {
        v20 = (int)v29;
        v21 = (unsigned int)(v18 + 1);
        if ( (unsigned int)v21 >= *v29 )
          goto LABEL_13;
      }
      v24 = (int)v29;
      v23 = (int)v28;
      v22 = *(_QWORD *)((char *)v29 + v19 + 40);
    }
    v30[0] = v22;
    sub_1932AD258(a1: v18, a2: v19, a3: (unsigned int)v30, a4, a5: v23, a6: v24, a7: v27[0], a8: v27[1], a9: v27[2]);
    goto LABEL_13;
  }
  return sub_1932C8DE0(a1: v11, a2: v12, a3: v10, a4: (unsigned __int64)v27 ^ v30[170], a5: v13, a6: v14);
}
