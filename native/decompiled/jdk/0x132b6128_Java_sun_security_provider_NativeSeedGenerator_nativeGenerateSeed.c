// Java_sun_security_provider_NativeSeedGenerator_nativeGenerateSeed
// rva 0x132b6128  size 231  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
char __fastcall Java_sun_security_provider_NativeSeedGenerator_nativeGenerateSeed(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        int a9,
        __int64 a10)
{
  __int64 v11; // rdi
  __int64 v12; // rsi
  int v13; // eax
  __int64 v14; // rsi
  unsigned int v15; // ebx
  __int64 v16; // rdi
  __int64 v17; // rax
  __int64 v18; // rdi
  __int64 v19; // rsi
  __int64 v20; // r14
  __int64 v21; // rsi
  int v22; // ebx
  __int64 v23; // rdi
  char v24; // di

  if ( (unsigned int)MEMORY[0x790E8](a1: 0, a2: a4, a3: 544684, a4: &a10, a5: 0, a6: 1) != 0
    || (v13 = MEMORY[0x790E8](a1: v11, a2: v12, a3: 544684, a4: &a10, a5: 0, a6: 1)) != 0 )
  {
    v15 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v12 + 1368LL))(
            a1: v11,
            a2: v12,
            a3: a5,
            a4: v12);
    v17 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)v14 + 1472LL))(
            a1: v16,
            a2: v14,
            a3: a5,
            a4: v14,
            a5: 0);
    v20 = v17;
    if ( v17 != 0 )
    {
      v22 = MEMORY[0x790F8](a1: v18, a2: v19, a3: v15, a4: a10, a5: v17);
      (*(void (__fastcall **)(__int64, __int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)v21 + 1536LL))(
        a1: v23,
        a2: v21,
        a3: a5,
        a4: v21,
        a5: v20,
        a6: 0);
      LOBYTE(v18) = v22 != 0;
    }
    MEMORY[0x790F0](a1: v18, a2: v19, a3: 0, a4: a10);
    LOBYTE(v13) = v24;
  }
  return v13;
}
