// sub_182770E80
// rva 0x02770e80  size 506  section .text  group runtime
// window base 0x182770e80: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall sub_182770E80(
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
  __int64 v30; // rdi
  __int64 v31; // rsi
  __int64 v32; // rdi
  __int64 v33; // rsi
  __int64 v34; // rdx
  __int64 v35; // rdi
  __int64 v36; // rsi
  __int64 v37; // rcx
  unsigned __int64 v38; // rbx
  int v39; // edx
  int v40; // ecx
  int v41; // edi
  int v42; // esi
  int v43; // r8d
  int v44; // r9d
  __int64 v46; // [rsp+0h] [rbp-188h] BYREF
  __int64 v47; // [rsp+10h] [rbp-178h]
  __int64 v48; // [rsp+18h] [rbp-170h]
  unsigned int v49; // [rsp+24h] [rbp-164h]
  __m128i v50; // [rsp+28h] [rbp-160h]
  __m128i v51; // [rsp+38h] [rbp-150h]
  __m128i v52; // [rsp+48h] [rbp-140h]
  __m128i v53; // [rsp+58h] [rbp-130h]
  __m128i v54; // [rsp+68h] [rbp-120h]
  __m128i v55; // [rsp+78h] [rbp-110h]
  __m128i v56; // [rsp+88h] [rbp-100h]
  __m128i v57; // [rsp+98h] [rbp-F0h]
  __m128i m128_i128; // [rsp+A8h] [rbp-E0h]
  __m128i v59; // [rsp+B8h] [rbp-D0h]
  __m128i v60; // [rsp+C8h] [rbp-C0h]
  __m128i v61; // [rsp+D8h] [rbp-B0h]
  __m128i v62; // [rsp+E8h] [rbp-A0h]
  __m128i v63; // [rsp+F8h] [rbp-90h]
  __m128i v64; // [rsp+108h] [rbp-80h]
  __m128i v65; // [rsp+118h] [rbp-70h]
  __int64 v66; // [rsp+128h] [rbp-60h]
  __int64 v67; // [rsp+130h] [rbp-58h]
  __int64 v68; // [rsp+138h] [rbp-50h]
  __int64 v69; // [rsp+140h] [rbp-48h]
  __int64 v70; // [rsp+148h] [rbp-40h]
  __int64 v71; // [rsp+150h] [rbp-38h]
  __int64 v72; // [rsp+158h] [rbp-30h]
  __int64 v73; // [rsp+160h] [rbp-28h]
  __int64 v74; // [rsp+168h] [rbp-20h]
  __int64 v75; // [rsp+170h] [rbp-18h]
  __int64 v76; // [rsp+178h] [rbp-10h]

  v66 = v19;
  v67 = v18;
  v68 = v17;
  v69 = a6;
  v70 = a5;
  v71 = a1;
  v72 = a2;
  v73 = v16;
  v74 = a3;
  v75 = a4;
  v76 = v15;
  v50 = v29;
  v51 = v28;
  v52 = v27;
  v53 = v26;
  v54 = v25;
  v55 = v24;
  v56 = v23;
  v57 = v22;
  m128_i128 = (__m128i)a14.m128_i128;
  v59 = (__m128i)a13.m128_i128;
  v60 = (__m128i)a12.m128_i128;
  v61 = (__m128i)a11.m128_i128;
  v62 = (__m128i)a10.m128_i128;
  v63 = (__m128i)a9.m128_i128;
  v64 = (__m128i)a8.m128_i128;
  v65 = (__m128i)a7.m128_i128;
  if ( (unsigned __int64)&v46 > v21[1] )
  {
    v49 = a3;
    sub_182771FC0(a1, a2, a3: 0);
    v48 = MEMORY[0x184F8C700](a1: v30, a2: v31, a3: v49);
    v34 = v21[5];
    if ( (unsigned __int64)(v34 + 40) > v21[4] )
    {
      v34 = MEMORY[0x181EAA920](a1: v32, a2: v33, a3: 36108448);
    }
    else
    {
      v21[5] = v34 + 40;
      *(_DWORD *)v34 = 36108448;
      *(_DWORD *)(v34 + 4) = 0;
      *(_QWORD *)(v34 + 8) = 0;
      *(_QWORD *)(v34 + 16) = 0;
      *(_QWORD *)(v34 + 24) = 0;
      *(_QWORD *)(v34 + 32) = 0;
    }
    *(_DWORD *)(v34 + 20) = 46923644;
    *(_DWORD *)(v34 + 16) = *(_DWORD *)(v20 + 374343896);
    *(_DWORD *)(v34 + 12) = (unsigned __int64)(v34 - v20) >> 3;
    v47 = v34;
    MEMORY[0x18503B9A0](a1: v32, a2: v33, a3: v34, a4: v34, a5: 0);
    v37 = v47;
    *(_DWORD *)(v47 + 8) = (unsigned __int64)(v48 - v20) >> 3;
    if ( (*(_DWORD *)v37 & 2) != 0 )
      goto LABEL_6;
    while ( 1 )
    {
      sub_1827697E0(a1: v35, a2: v36, a3: (_DWORD *)v37, a4: v37, a5: (__int64)&a15);
LABEL_6:
      v38 = (v37 & 0xFFFFFFFFFFF80000LL) + 2112;
      if ( *(_BYTE *)((v37 & 0xFFFFFFFFFFF80000LL) + ((v37 - v38) >> 9) + 0x38) != 0 )
        *(_BYTE *)((v37 & 0xFFFFFFFFFFF80000LL) + ((v37 - v38) >> 9) + 0x38) = 0;
    }
  }
  MEMORY[0x181EB84E0]();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  __builtin_debugtrap();
  return sub_182771080(a1: v41, a2: v42, a3: v39, a4: v40, a5: v43, a6: v44, a7: a15);
}
