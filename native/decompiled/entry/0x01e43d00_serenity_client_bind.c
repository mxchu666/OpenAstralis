// serenity_client_bind
// rva 0x01e43d00  size 992  section .text  group entry
// window base 0x181e43d00: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall serenity_client_bind(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        double a7,
        double a8,
        double a9,
        double a10,
        double a11,
        double a12,
        double a13,
        double a14)
{
  __int64 v15; // rcx
  __int64 v16; // rdi
  __int64 v17; // rsi
  double v18; // xmm0_8
  double v19; // xmm1_8
  double v20; // xmm2_8
  double v21; // xmm3_8
  double v22; // xmm4_8
  double v23; // xmm5_8
  double v24; // xmm6_8
  double v25; // xmm7_8
  unsigned int v27; // [rsp+14h] [rbp-114h]

  if ( a4 == 0 )
  {
    MEMORY[0x181EB6CE0](a1, a2, a3: 2, a4: 0, a5: 292991712);
    v17 = a2;
    v16 = a1;
    v24 = a13;
    v25 = a14;
    goto LABEL_5;
  }
  MEMORY[0x181EB6D20]();
  if ( __sync_val_compare_and_swap((volatile signed __int32 *)(a4 + 20), 3, 1) != 3 )
LABEL_5:
    MEMORY[0x18277F4A0](
      a1: v16,
      a2: v17,
      a3: 1,
      a4: v15,
      a5: 0,
      a6: v18,
      a7: v19,
      a8: v20,
      a9: v21,
      a10: v22,
      a11: v23,
      a12: v24,
      a13: v25);
  v27 = MEMORY[0x18C23F680](a1: a6, a2: v17, a3: a4, a4: v15, a5: a3, a6: a5);
  MEMORY[0x1828390C0]();
  return v27;
}
