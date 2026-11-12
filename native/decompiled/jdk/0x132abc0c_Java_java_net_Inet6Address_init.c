// Java_java_net_Inet6Address_init
// rva 0x132abc0c  size 430  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
void __fastcall Java_java_net_Inet6Address_init(__int64 a1, __int64 a2, _DWORD a3, __int64 a4)
{
  __int64 v5; // rax
  __int64 v6; // rdi
  __int64 v7; // rsi
  __int64 v8; // rdi
  __int64 v9; // rsi
  __int64 v10; // rdi
  __int64 v11; // rsi
  __int64 v12; // rdi
  __int64 v13; // rsi
  __int64 v14; // rdi
  __int64 v15; // rsi
  __int64 v16; // rdi
  __int64 v17; // rsi
  __int64 v18; // rdi
  __int64 v19; // rsi
  __int64 v20; // rdi
  __int64 v21; // rsi

  if ( MEMORY[0x3374FC] == 0 )
  {
    v5 = (*(__int64 (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a4 + 48LL))(a1, a2, a3: 537672);
    if ( v5 != 0 )
    {
      MEMORY[0x337F40] = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 168LL))(
                           a1: v6,
                           a2: v7,
                           a3: v5,
                           a4);
      if ( MEMORY[0x337F40] != 0 )
      {
        v10 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 48LL))(
                a1: v8,
                a2: v9,
                a3: 537696,
                a4);
        if ( v10 != 0 )
        {
          MEMORY[0x337F38] = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64, __int64, __int64))(*(_QWORD *)a4 + 752LL))(
                               a1: v10,
                               a2: v11,
                               a3: MEMORY[0x337F40],
                               a4,
                               a5: 537792,
                               a6: 537744);
          if ( MEMORY[0x337F38] != 0 )
          {
            MEMORY[0x337F30] = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 752LL))(
                                 a1: v12,
                                 a2: v13,
                                 a3: v12,
                                 a4,
                                 a5: 537808,
                                 a6: 537800);
            if ( MEMORY[0x337F30] != 0 )
            {
              MEMORY[0x337F28] = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 752LL))(
                                   a1: v14,
                                   a2: v15,
                                   a3: v14,
                                   a4,
                                   a5: 537824,
                                   a6: 535012);
              if ( MEMORY[0x337F28] != 0 )
              {
                MEMORY[0x337F20] = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 752LL))(
                                     a1: v16,
                                     a2: v17,
                                     a3: v16,
                                     a4,
                                     a5: 537840,
                                     a6: 537192);
                if ( MEMORY[0x337F20] != 0 )
                {
                  MEMORY[0x337F18] = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 752LL))(
                                       a1: v18,
                                       a2: v19,
                                       a3: v18,
                                       a4,
                                       a5: 537888,
                                       a6: 537856);
                  if ( MEMORY[0x337F18] != 0 )
                  {
                    MEMORY[0x337F10] = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64, __int64, __int64))(*(_QWORD *)a4 + 264LL))(
                                         a1: v20,
                                         a2: v21,
                                         a3: MEMORY[0x337F40],
                                         a4,
                                         a5: 535156,
                                         a6: 537592);
                    if ( MEMORY[0x337F10] != 0 )
                      MEMORY[0x3374FC] = 1;
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
