// Java_sun_nio_ch_IOUtil_configureBlocking
// rva 0x132a2a10  size 146  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_IOUtil_configureBlocking(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        char a6,
        __int64 a7,
        __int64 a8,
        int a9,
        int a10)
{
  int v11; // eax
  __int64 v12; // rsi
  __int64 v13; // rdi
  __int64 result; // rax
  __int64 v15; // rdi
  __int64 v16; // rsi
  unsigned int v17; // eax
  __int64 v18; // rdi
  __int64 v19; // rsi

  v11 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)a4 + 800LL))(
          a1,
          a2: a4,
          a3: a5,
          a4,
          a5: MEMORY[0x337110]);
  v13 = v11;
  if ( a6 != 0 )
  {
    a10 = 0;
    MEMORY[0x79988](a1: v11, a2: v12, a3: 0, a4: v11, a5: 0);
  }
  else
  {
    a10 = 1;
  }
  result = MEMORY[0x799A0](a1: v13, a2: v12, a3: 2147772030LL, a4: v13, a5: &a10);
  if ( (_DWORD)result == -1 )
  {
    v17 = MEMORY[0x79958](a1: v15, a2: v16);
    return sub_1932AED0C(a1: v18, a2: v19, a3: v17, a4: v19, a5: 535048);
  }
  return result;
}
