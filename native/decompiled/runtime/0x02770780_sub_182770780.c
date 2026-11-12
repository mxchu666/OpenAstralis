// sub_182770780
// rva 0x02770780  size 410  section .text  group runtime
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall sub_182770780(
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
        __m128 a14,
        char a15)
{
  __int64 v15; // rax
  __int64 v16; // rbx
  __int64 v17; // r10
  __int64 v18; // r11
  __int64 v19; // r12
  __int64 v20; // r14
  _QWORD *v21; // r15
  __m128i v22; // xmm8
  __m128i v23; // xmm9
  __m128i v24; // xmm10
  __m128i v25; // xmm11
  __m128i v26; // xmm12
  __m128i v27; // xmm13
  __m128i v28; // xmm14
  __m128i v29; // xmm15
  __int64 v30; // rcx
  __int64 v31; // rdi
  __int64 v32; // rsi
  __int64 v33; // rdx
  __int64 v34; // rcx
  __int64 v35; // rdi
  __int64 v36; // rsi
  int v37; // edx
  int v38; // ecx
  int v39; // edi
  int v40; // esi
  int v41; // r8d
  int v42; // r9d
  __int64 v44; // [rsp+0h] [rbp-178h] BYREF
  _DWORD *v45; // [rsp+10h] [rbp-168h]
  __m128i v46; // [rsp+18h] [rbp-160h]
  __m128i v47; // [rsp+28h] [rbp-150h]
  __m128i v48; // [rsp+38h] [rbp-140h]
  __m128i v49; // [rsp+48h] [rbp-130h]
  __m128i v50; // [rsp+58h] [rbp-120h]
  __m128i v51; // [rsp+68h] [rbp-110h]
  __m128i v52; // [rsp+78h] [rbp-100h]
  __m128i v53; // [rsp+88h] [rbp-F0h]
  __m128i m128_i128; // [rsp+98h] [rbp-E0h]
  __m128i v55; // [rsp+A8h] [rbp-D0h]
  __m128i v56; // [rsp+B8h] [rbp-C0h]
  __m128i v57; // [rsp+C8h] [rbp-B0h]
  __m128i v58; // [rsp+D8h] [rbp-A0h]
  __m128i v59; // [rsp+E8h] [rbp-90h]
  __m128i v60; // [rsp+F8h] [rbp-80h]
  __m128i v61; // [rsp+108h] [rbp-70h]
  __int64 v62; // [rsp+118h] [rbp-60h]
  __int64 v63; // [rsp+120h] [rbp-58h]
  __int64 v64; // [rsp+128h] [rbp-50h]
  __int64 v65; // [rsp+130h] [rbp-48h]
  __int64 v66; // [rsp+138h] [rbp-40h]
  __int64 v67; // [rsp+140h] [rbp-38h]
  __int64 v68; // [rsp+148h] [rbp-30h]
  __int64 v69; // [rsp+150h] [rbp-28h]
  __int64 v70; // [rsp+158h] [rbp-20h]
  __int64 v71; // [rsp+160h] [rbp-18h]
  __int64 v72; // [rsp+168h] [rbp-10h]

  v62 = v19;
  v63 = v18;
  v64 = v17;
  v65 = a6;
  v66 = a5;
  v67 = a1;
  v68 = a2;
  v69 = v16;
  v70 = a3;
  v71 = a4;
  v72 = v15;
  v46 = v29;
  v47 = v28;
  v48 = v27;
  v49 = v26;
  v50 = v25;
  v51 = v24;
  v52 = v23;
  v53 = v22;
  m128_i128 = (__m128i)a14.m128_i128;
  v55 = (__m128i)a13.m128_i128;
  v56 = (__m128i)a12.m128_i128;
  v57 = (__m128i)a11.m128_i128;
  v58 = (__m128i)a10.m128_i128;
  v59 = (__m128i)a9.m128_i128;
  v60 = (__m128i)a8.m128_i128;
  v61 = (__m128i)a7.m128_i128;
  if ( (unsigned __int64)&v44 > v21[1] )
  {
    sub_182771FC0(a1, a2, a3: 0);
    v33 = v21[5];
    if ( (unsigned __int64)(v33 + 40) > v21[4] )
      goto LABEL_5;
    v21[5] = v33 + 40;
    *(_DWORD *)v33 = 35317296;
    *(_DWORD *)(v33 + 4) = 0;
    *(_QWORD *)(v33 + 8) = 0;
    *(_QWORD *)(v33 + 16) = 0;
    *(_QWORD *)(v33 + 24) = 0;
    *(_QWORD *)(v33 + 32) = 0;
    while ( 1 )
    {
      *(_DWORD *)(v33 + 20) = 46923644;
      *(_DWORD *)(v33 + 16) = *(_DWORD *)(v20 + 374343896);
      *(_DWORD *)(v33 + 12) = (unsigned __int64)(v33 - v20) >> 3;
      v45 = (_DWORD *)v33;
      MEMORY[0x18503B9A0](a1: v31, a2: v32, a3: v33, a4: v30, a5: 0);
      sub_1827697E0(a1: v35, a2: v36, a3: v45, a4: v34, a5: (__int64)&a15);
LABEL_5:
      v33 = MEMORY[0x181EAA920](a1: v31, a2: v32, a3: 35317296);
    }
  }
  MEMORY[0x181EB84E0]();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  return sub_182770920(a1: v39, a2: v40, a3: v37, a4: v38, a5: v41, a6: v42, a7: a15);
}
