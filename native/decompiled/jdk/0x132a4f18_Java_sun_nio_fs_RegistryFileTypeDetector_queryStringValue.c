// Java_sun_nio_fs_RegistryFileTypeDetector_queryStringValue
// rva 0x132a4f18  size 216  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_fs_RegistryFileTypeDetector_queryStringValue(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  __int64 v6; // rdx
  __int64 v7; // rdi
  __int64 v8; // rsi
  __int64 v9; // r8
  __int64 v10; // r9
  __int64 v11; // rdx
  __int64 v12; // rdi
  __int64 v13; // rsi
  unsigned int v14; // eax
  __int64 v15; // rdi
  __int64 v16; // rsi
  __int64 v18; // [rsp+0h] [rbp-168h] BYREF
  __int64 *v19; // [rsp+20h] [rbp-148h]
  int *v20; // [rsp+28h] [rbp-140h]
  int v21; // [rsp+30h] [rbp-138h] BYREF
  int v22; // [rsp+34h] [rbp-134h] BYREF
  __int64 v23; // [rsp+38h] [rbp-130h] BYREF
  _BYTE v24[256]; // [rsp+40h] [rbp-128h] BYREF
  __int64 v25; // [rsp+140h] [rbp-28h]

  v19 = &v23;
  if ( (unsigned int)MEMORY[0x79018](a1: a4, a2: a6, a3: a5, a4: 0xFFFFFFFF80000000LL, a5: 0, a6: 131097) == 0 )
  {
    v20 = &v21;
    v21 = 255;
    v19 = (__int64 *)v24;
    if ( (unsigned int)MEMORY[0x79040](a1: v7, a2: v8, a3: v8, a4: v23, a5: 0, a6: &v22) == 0 && v22 == 1 )
    {
      v14 = MEMORY[0x79CB0](a1: v12, a2: v13, a3: v11, a4: v24);
      (*(void (__fastcall **)(__int64, __int64, _BYTE *, __int64, _QWORD))(*(_QWORD *)v15 + 1304LL))(
        a1: v15,
        a2: v16,
        a3: v24,
        a4: v15,
        a5: v14);
    }
    MEMORY[0x791C8](a1: v12, a2: v13, a3: v11, a4: v23);
  }
  return sub_1932C8DE0(a1: v7, a2: v8, a3: v6, a4: (unsigned __int64)&v18 ^ v25, a5: v9, a6: v10);
}
