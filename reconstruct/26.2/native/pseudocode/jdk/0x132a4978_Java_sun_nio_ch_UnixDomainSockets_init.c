// Java_sun_nio_ch_UnixDomainSockets_init
// rva 0x132a4978  size 572  section .text  group jdk
// window base 0x1932a4978: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_sun_nio_ch_UnixDomainSockets_init(__int64 a1, __int64 a2)
{
  _BYTE *v2; // rbx
  int v3; // eax
  __int64 v4; // rdx
  __int64 v5; // rdi
  __int64 v6; // rsi
  __int64 i; // r9
  __int64 v8; // r8
  __int64 v9; // rax
  __int64 v10; // rcx
  __int64 v11; // rcx
  _OWORD *v12; // rax
  __int128 v13; // xmm1
  __int64 v14; // rax
  _DWORD v16[12]; // [rsp+0h] [rbp-CB8h] BYREF
  unsigned int v17; // [rsp+30h] [rbp-C88h] BYREF
  _QWORD v18[2]; // [rsp+38h] [rbp-C80h]
  _BYTE v19[3152]; // [rsp+50h] [rbp-C68h] BYREF
  __int64 v20; // [rsp+CA0h] [rbp-18h]

  v17 = 3140;
  v2 = v19;
  LOBYTE(a1) = 0;
  v3 = MEMORY[0x79918](a1, a2, a3: v19, a4: 0, a5: &v17);
  if ( v3 == -1 )
  {
    if ( (unsigned int)MEMORY[0x79758](a1: v5) != 10055 )
      return sub_1932C8DE0(a1: v5, a2: v6, a3: v4, a4: (unsigned __int64)v16 ^ v20, a5: v8, a6: i);
    v9 = MEMORY[0x79AD0](a1: v5, a2: v6, a3: v4, a4: v17);
    v2 = (_BYTE *)v9;
    if ( v9 == 0 )
      return sub_1932C8DE0(a1: v5, a2: v6, a3: v4, a4: (unsigned __int64)v16 ^ v20, a5: v8, a6: i);
    v3 = MEMORY[0x79918](a1: v5, a2: v6, a3: v9, a4: 0, a5: &v17);
    if ( v3 == -1 )
    {
      MEMORY[0x79AE0](a1: v5, a2: v6, a3: v4, a4: v2);
      return sub_1932C8DE0(a1: v5, a2: v6, a3: v4, a4: (unsigned __int64)v16 ^ v20, a5: v8, a6: i);
    }
  }
  v8 = 0;
  if ( v3 > 0 )
  {
    v4 = (__int64)(v2 + 20);
    for ( i = 0; i < v3; ++i )
    {
      if ( *(_DWORD *)(v4 + 56) == 1 )
      {
        *(_OWORD *)v18 = *(_OWORD *)v4;
        if ( v18[0] == MEMORY[0x3367B8] )
        {
          v10 = 0;
          while ( *((_BYTE *)&v18[1] + v10) == *(_BYTE *)(v10 + 3368896) )
          {
            if ( ++v10 >= 8 )
            {
              v11 = 3371312;
              v4 = 4;
              LOBYTE(v5) = 1;
              v12 = &v2[628 * (int)v8];
              v8 = 128;
              do
              {
                *(_OWORD *)v11 = *v12;
                *(_OWORD *)(v11 + 16) = v12[1];
                *(_OWORD *)(v11 + 32) = v12[2];
                *(_OWORD *)(v11 + 48) = v12[3];
                *(_OWORD *)(v11 + 64) = v12[4];
                *(_OWORD *)(v11 + 80) = v12[5];
                *(_OWORD *)(v11 + 96) = v12[6];
                v11 += 128;
                v13 = v12[7];
                v12 += 8;
                *(_OWORD *)(v11 - 16) = v13;
                --v4;
              }
              while ( v4 != 0 );
              *(_OWORD *)v11 = *v12;
              *(_OWORD *)(v11 + 16) = v12[1];
              *(_OWORD *)(v11 + 32) = v12[2];
              *(_OWORD *)(v11 + 48) = v12[3];
              *(_OWORD *)(v11 + 64) = v12[4];
              *(_OWORD *)(v11 + 80) = v12[5];
              *(_OWORD *)(v11 + 96) = v12[6];
              *(_DWORD *)(v11 + 112) = *((_DWORD *)v12 + 28);
              goto LABEL_17;
            }
          }
        }
      }
      v8 = (unsigned int)(v8 + 1);
      v4 += 628;
    }
  }
LABEL_17:
  if ( v2 != v19 )
    MEMORY[0x79AE0](a1: v5, a2: v6, a3: v4, a4: v2);
  if ( (_BYTE)v5 != 0 )
  {
    v16[10] = 1;
    v16[8] = 0;
    v14 = MEMORY[0x79950](a1: v5, a2: v6, a3: 1, a4: 1, a5: 0, a6: 3371312);
    if ( v14 != -1 )
      MEMORY[0x79A00](a1: v5, a2: v6, a3: v4, a4: v14);
  }
  return sub_1932C8DE0(a1: v5, a2: v6, a3: v4, a4: (unsigned __int64)v16 ^ v20, a5: v8, a6: i);
}
