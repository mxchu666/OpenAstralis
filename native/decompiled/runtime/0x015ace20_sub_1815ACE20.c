// sub_1815ACE20
// rva 0x015ace20  size 597  section .text  group runtime
// window base 0x1815ace20: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall sub_1815ACE20(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __m128 a7,
        __m128 a8,
        __m128 a9,
        __m128 a10,
        __m128 a11,
        __m128 a12,
        __m128 a13,
        __m128 a14)
{
  __int64 v14; // rax
  __int64 v15; // r10
  __int64 v16; // r11
  __int64 v17; // r14
  __int64 v18; // r15
  __m128i v19; // xmm8
  __m128i v20; // xmm9
  __m128i v21; // xmm10
  __m128i v22; // xmm11
  __m128i v23; // xmm12
  __m128i v24; // xmm13
  __m128i v25; // xmm14
  __m128i v26; // xmm15
  __int64 v27; // r8
  __int64 v28; // r8
  __int64 v30; // rdx
  __int64 v31; // rcx
  __int64 v32; // rdi
  __int64 v33; // rsi
  __int64 v34; // r8
  __int64 v35; // r9
  __int64 v36; // [rsp+0h] [rbp-178h] BYREF
  __int64 v37; // [rsp+8h] [rbp-170h]
  __int64 v38; // [rsp+10h] [rbp-168h]
  __m128i v39; // [rsp+18h] [rbp-160h]
  __m128i v40; // [rsp+28h] [rbp-150h]
  __m128i v41; // [rsp+38h] [rbp-140h]
  __m128i v42; // [rsp+48h] [rbp-130h]
  __m128i v43; // [rsp+58h] [rbp-120h]
  __m128i v44; // [rsp+68h] [rbp-110h]
  __m128i v45; // [rsp+78h] [rbp-100h]
  __m128i v46; // [rsp+88h] [rbp-F0h]
  __m128i m128_i128; // [rsp+98h] [rbp-E0h]
  __m128i v48; // [rsp+A8h] [rbp-D0h]
  __m128i v49; // [rsp+B8h] [rbp-C0h]
  __m128i v50; // [rsp+C8h] [rbp-B0h]
  __m128i v51; // [rsp+D8h] [rbp-A0h]
  __m128i v52; // [rsp+E8h] [rbp-90h]
  __m128i v53; // [rsp+F8h] [rbp-80h]
  __m128i v54; // [rsp+108h] [rbp-70h]
  __int64 v55; // [rsp+120h] [rbp-58h]
  __int64 v56; // [rsp+128h] [rbp-50h]
  __int64 v57; // [rsp+130h] [rbp-48h]
  __int64 v58; // [rsp+138h] [rbp-40h]
  __int64 v59; // [rsp+140h] [rbp-38h]
  __int64 v60; // [rsp+148h] [rbp-30h]
  __int64 v61; // [rsp+158h] [rbp-20h]
  __int64 v62; // [rsp+160h] [rbp-18h]
  __int64 v63; // [rsp+168h] [rbp-10h]

  v55 = v16;
  v56 = v15;
  v57 = a6;
  v58 = a5;
  v59 = a1;
  v60 = a2;
  v61 = a3;
  v62 = a4;
  v63 = v14;
  v39 = v26;
  v40 = v25;
  v41 = v24;
  v42 = v23;
  v43 = v22;
  v44 = v21;
  v45 = v20;
  v46 = v19;
  m128_i128 = (__m128i)a14.m128_i128;
  v48 = (__m128i)a13.m128_i128;
  v49 = (__m128i)a12.m128_i128;
  v50 = (__m128i)a11.m128_i128;
  v51 = (__m128i)a10.m128_i128;
  v52 = (__m128i)a9.m128_i128;
  v53 = (__m128i)a8.m128_i128;
  v54 = (__m128i)a7.m128_i128;
  if ( (unsigned __int64)&v36 <= *(_QWORD *)(v18 + 8) )
  {
    v38 = a3;
    MEMORY[0x181EB84E0]();
  }
  else if ( a3 != v17 )
  {
    v27 = *(unsigned int *)(a3 + 28);
    if ( (_DWORD)v27 == 0 )
    {
LABEL_10:
      v38 = a3;
      MEMORY[0x182771080]();
      goto LABEL_11;
    }
    v28 = *(unsigned int *)(v17 + 8 * v27 + 44);
    if ( (_DWORD)v28 == 0 )
    {
LABEL_11:
      MEMORY[0x182771080]();
      __builtin_debugtrap();
      __builtin_debugtrap();
      __builtin_debugtrap();
      __builtin_debugtrap();
      __builtin_debugtrap();
      __builtin_debugtrap();
      __builtin_debugtrap();
      __builtin_debugtrap();
      __builtin_debugtrap();
      __builtin_debugtrap();
      __builtin_debugtrap();
      return sub_1815AD080(a1: v32, a2: v33, a3: v30, a4: v31, a5: v34, a6: v35);
    }
    v37 = v17 + 8 * v28;
    v38 = a3;
    sub_1815AD080(a1, a2, a3: v37, a4: v38, a5: v38, a6: 0);
    if ( *(int *)(v18 + 16) <= 0 )
      MEMORY[0x18277F280]();
    return v63;
  }
  MEMORY[0x182771080]();
  goto LABEL_10;
}
