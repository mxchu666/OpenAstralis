// Java_com_sun_management_internal_OperatingSystemImpl_getProcessCpuLoad0
// rva 0x132af364  size 111  section .text  group samples
// window base 0x1932af364: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
double __fastcall Java_com_sun_management_internal_OperatingSystemImpl_getProcessCpuLoad0(
        int a1,
        int a2,
        int a3,
        int a4,
        int a5,
        int a6)
{
  int v6; // edx
  int v7; // ecx
  int v8; // edi
  int v9; // esi
  int v10; // r8d
  int v11; // r9d
  int v12; // eax
  int v13; // edi
  int v14; // esi
  __int64 v16; // [rsp+0h] [rbp-38h]
  __int64 v17; // [rsp+8h] [rbp-30h]
  char v18; // [rsp+20h] [rbp-18h] BYREF
  double v19; // [rsp+28h] [rbp-10h]

  if ( (int)sub_1932B0154(a1, a2, a3, a4, a5, a6) < 0 )
    return MEMORY[0x846D8];
  v12 = sub_1932AF7D4(a1: v8, a2: v9, a3: v6, a4: v7, a5: v10, a6: v11);
  if ( v12 < 0
    || (unsigned int)sub_1932AFA40(
                       a1: v13,
                       a2: v14,
                       a3: *(_QWORD *)(MEMORY[0x3375D0] + 24LL * v12 + 16),
                       a4: MEMORY[0x3375D0] + 24 * v12,
                       a5: (unsigned int)&v18,
                       a6: 33280,
                       a7: v16,
                       a8: v17) != 0 )
  {
    return MEMORY[0x846D8];
  }
  else
  {
    return fmax(0.0, fmin(MEMORY[0x846C8], v19 / MEMORY[0x3375E0]));
  }
}
