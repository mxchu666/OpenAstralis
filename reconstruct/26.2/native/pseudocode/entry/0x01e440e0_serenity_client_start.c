// serenity_client_start
// rva 0x01e440e0  size 992  section .text  group entry
// window base 0x181e440e0: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall serenity_client_start(
        __int64 a1,
        __int64 a2,
        unsigned int a3,
        __int64 a4,
        __int64 a5,
        double a6,
        double a7,
        double a8,
        double a9,
        double a10,
        double a11,
        double a12,
        double a13)
{
  __int64 v14; // rcx
  __int64 v15; // rdi
  __int64 v16; // rsi
  double v17; // xmm0_8
  double v18; // xmm1_8
  double v19; // xmm2_8
  double v20; // xmm3_8
  double v21; // xmm4_8
  double v22; // xmm5_8
  double v23; // xmm6_8
  double v24; // xmm7_8
  unsigned int v26; // [rsp+14h] [rbp-104h]

  if ( a4 == 0 )
  {
    MEMORY[0x181EB6CE0](a1, a2, a3: 2, a4: 0, a5: 292991712);
    v16 = a2;
    v15 = a1;
    v23 = a12;
    v24 = a13;
    goto LABEL_5;
  }
  MEMORY[0x181EB6D20]();
  if ( __sync_val_compare_and_swap((volatile signed __int32 *)(a4 + 20), 3, 1) != 3 )
LABEL_5:
    MEMORY[0x18277F4A0](
      a1: v15,
      a2: v16,
      a3: 1,
      a4: v14,
      a5: 0,
      a6: v17,
      a7: v18,
      a8: v19,
      a9: v20,
      a10: v21,
      a11: v22,
      a12: v23,
      a13: v24);
  v26 = MEMORY[0x18C242980](a1: v15, a2: v16, a3: a4, a4: v14, a5: a3, a6: a5);
  MEMORY[0x1828390C0]();
  return v26;
}
