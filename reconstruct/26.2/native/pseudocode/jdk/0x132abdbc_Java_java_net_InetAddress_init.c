// Java_java_net_InetAddress_init
// rva 0x132abdbc  size 416  section .text  group jdk
// window base 0x1932abdbc: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
void __fastcall Java_java_net_InetAddress_init(__int64 a1, __int64 a2, __int64 a3, __int64 a4)
{
  __int64 v5; // rax
  __int64 v6; // rdi
  __int64 v7; // rsi
  __int64 v8; // rdi
  __int64 v9; // rsi
  __int64 v10; // rax
  __int64 v11; // rdi
  __int64 v12; // rsi
  __int64 v13; // rdi
  __int64 v14; // rsi
  __int64 v15; // rdi
  __int64 v16; // rsi
  __int64 v17; // rdi
  __int64 v18; // rsi
  __int64 v19; // rdi
  __int64 v20; // rsi
  __int64 v21; // rdi
  __int64 v22; // rsi

  if ( MEMORY[0x337500] == 0 )
  {
    v5 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a4 + 48LL))(a1, a2, a3: 537904);
    if ( v5 != 0 )
    {
      MEMORY[0x337F08] = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 168LL))(
                           a1: v6,
                           a2: v7,
                           a3: v5,
                           a4);
      if ( MEMORY[0x337F08] != 0 )
      {
        v10 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 48LL))(
                a1: v8,
                a2: v9,
                a3: 537928,
                a4);
        if ( v10 != 0 )
        {
          MEMORY[0x337EE0] = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 168LL))(
                               a1: v11,
                               a2: v12,
                               a3: v10,
                               a4);
          if ( MEMORY[0x337EE0] != 0 )
          {
            MEMORY[0x337ED8] = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64, __int64, __int64))(*(_QWORD *)a4 + 752LL))(
                                 a1: v13,
                                 a2: v14,
                                 a3: MEMORY[0x337F08],
                                 a4,
                                 a5: 538012,
                                 a6: 537968);
            if ( MEMORY[0x337ED8] != 0 )
            {
              MEMORY[0x337F00] = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64, __int64, __int64))(*(_QWORD *)a4 + 752LL))(
                                   a1: v15,
                                   a2: v16,
                                   a3: MEMORY[0x337EE0],
                                   a4,
                                   a5: 538024,
                                   a6: 535012);
              if ( MEMORY[0x337F00] != 0 )
              {
                MEMORY[0x337EF8] = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64, __int64, __int64))(*(_QWORD *)a4 + 752LL))(
                                     a1: v17,
                                     a2: v18,
                                     a3: MEMORY[0x337EE0],
                                     a4,
                                     a5: 538032,
                                     a6: 535012);
                if ( MEMORY[0x337EF8] != 0 )
                {
                  MEMORY[0x337EF0] = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64, __int64, __int64))(*(_QWORD *)a4 + 752LL))(
                                       a1: v19,
                                       a2: v20,
                                       a3: MEMORY[0x337EE0],
                                       a4,
                                       a5: 538040,
                                       a6: 535736);
                  if ( MEMORY[0x337EF0] != 0 )
                  {
                    MEMORY[0x337EE8] = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64, __int64, __int64))(*(_QWORD *)a4 + 752LL))(
                                         a1: v21,
                                         a2: v22,
                                         a3: MEMORY[0x337EE0],
                                         a4,
                                         a5: 538056,
                                         a6: 535736);
                    if ( MEMORY[0x337EE8] != 0 )
                      MEMORY[0x337500] = 1;
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
