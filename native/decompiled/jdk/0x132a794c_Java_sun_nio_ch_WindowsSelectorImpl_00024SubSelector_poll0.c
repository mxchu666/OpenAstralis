// Java_sun_nio_ch_WindowsSelectorImpl_00024SubSelector_poll0
// rva 0x132a794c  size 680  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_sun_nio_ch_WindowsSelectorImpl_00024SubSelector_poll0(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        int a6,
        int a7,
        int a8,
        int a9,
        int a10,
        __int64 a11,
        __int64 a12,
        __int64 a13,
        __int64 a14,
        _DWORD *a15)
{
  void *v15; // rsp
  int v17; // r13d
  int v18; // r12d
  int v19; // r10d
  _DWORD *v20; // rsi
  int *v21; // r14
  __int64 v22; // r11
  __int64 v23; // r9
  __int64 v24; // rcx
  _QWORD *v25; // rdx
  _QWORD *v26; // r10
  int *v27; // rdi
  __int64 v28; // rsi
  __int64 v29; // rdx
  __int64 v30; // rdi
  __int64 v31; // rsi
  __int64 v32; // r8
  __int64 v33; // r9
  int v34; // r9d
  int *v35; // rcx
  __int64 i; // r8
  int v37; // eax
  void (__fastcall *v38)(int *, __int64, __int64, __int64, _QWORD, _QWORD); // r10
  __int64 v39; // rdi
  int *v40; // rsi
  int v41; // r9d
  _DWORD *v42; // rcx
  __int64 v43; // r10
  int *v44; // r8
  int v45; // eax
  void (__fastcall *v46)(__int64, int *, __int64, __int64, _QWORD, _QWORD); // r10
  __int64 v47; // rdi
  __int64 v48; // rsi
  int v49; // r9d
  _DWORD *v50; // rcx
  __int64 v51; // r10
  int *v52; // r8
  int v53; // eax
  void (__fastcall *v54)(__int64, __int64, __int64, __int64, _QWORD, _QWORD); // r10
  _BYTE v56[32]; // [rsp+0h] [rbp-100h] BYREF
  _DWORD *v57; // [rsp+20h] [rbp-E0h]
  __int64 v58; // [rsp+30h] [rbp-D0h] BYREF
  __int64 v59; // [rsp+40h] [rbp-C0h]
  __int64 v60; // [rsp+48h] [rbp-B8h]
  __int64 v61; // [rsp+50h] [rbp-B0h]
  int v62; // [rsp+60h] [rbp-A0h] BYREF
  _BYTE v63[4108]; // [rsp+64h] [rbp-9Ch] BYREF
  unsigned __int64 v64; // [rsp+1070h] [rbp+F70h]
  _UNKNOWN *retaddr; // [rsp+10A8h] [rbp+FA8h] BYREF

  v15 = alloca((signed __int64)&retaddr);
  v64 = (unsigned __int64)v56 ^ MEMORY[0x336F80];
  v17 = 0;
  v18 = 0;
  v59 = a11;
  v19 = 0;
  v60 = a12;
  v20 = a15 + 2050;
  v21 = a15 + 4100;
  v61 = a13;
  v22 = a6;
  if ( a14 != 0 )
  {
    if ( a14 >= 0 )
    {
      v23 = (__int64)&v58;
      if ( a14 < 0x1F400000000LL )
      {
        LODWORD(v58) = a14 / 0x3E8uLL;
        HIDWORD(v58) = 1000 * (a14 % 0x3E8uLL);
      }
      else
      {
        v58 = 0x7FFFFFFF;
      }
    }
    else
    {
      v23 = 0;
    }
  }
  else
  {
    v23 = 3372152;
  }
  if ( (int)v22 > 0 )
  {
    v24 = 0;
    v25 = a15 + 2052;
    v26 = a15 + 2;
    do
    {
      if ( (*(_WORD *)(a5 + 8 * v24 + 4) & 0x300) != 0 )
      {
        ++v17;
        *v26++ = *(int *)(a5 + 8 * v24);
      }
      if ( (*(_BYTE *)(a5 + 8 * v24 + 4) & 0x10) != 0 )
      {
        ++v18;
        *v25++ = *(int *)(a5 + 8 * v24);
      }
      *(_QWORD *)&v21[2 * v24 + 2] = *(int *)(a5 + 8 * v24);
      ++v24;
    }
    while ( v24 < v22 );
    v19 = v22;
  }
  *a15 = v17;
  v57 = (_DWORD *)v23;
  *v20 = v18;
  *v21 = v19;
  if ( (unsigned int)MEMORY[0x799C8](a1: a15, a2: v20, a3: a15, a4: 0, a5: v20, a6: v21) == -1 )
  {
    sub_1932B1580(a1: v27, a2: v28, a3: 536824, a4);
  }
  else
  {
    v34 = *v27;
    v62 = v34;
    if ( v34 > 0 )
    {
      v35 = (int *)v63;
      v27 += 2;
      for ( i = (unsigned int)v34; i != 0; --i )
      {
        v37 = *v27;
        v27 += 2;
        *v35++ = v37;
      }
    }
    v38 = *(void (__fastcall **)(int *, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 1688LL);
    v57 = &v62;
    v38(a1: v27, a2: v28, a3: v59, a4, a5: 0, a6: (unsigned int)(v34 + 1));
    v41 = *v40;
    v62 = v41;
    if ( v41 > 0 )
    {
      v42 = v63;
      v43 = (unsigned int)v41;
      v44 = v40 + 2;
      do
      {
        v45 = *v44;
        v44 += 2;
        *v42++ = v45;
        --v43;
      }
      while ( v43 != 0 );
    }
    v46 = *(void (__fastcall **)(__int64, int *, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 1688LL);
    v57 = &v62;
    v46(a1: v39, a2: v40, a3: v60, a4, a5: 0, a6: (unsigned int)(v41 + 1));
    v49 = *v21;
    v62 = v49;
    if ( v49 > 0 )
    {
      v50 = v63;
      v51 = (unsigned int)v49;
      v52 = a15 + 4102;
      do
      {
        v53 = *v52;
        v52 += 2;
        *v50++ = v53;
        --v51;
      }
      while ( v51 != 0 );
    }
    v54 = *(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, _QWORD))(*(_QWORD *)a4 + 1688LL);
    v57 = &v62;
    v54(a1: v47, a2: v48, a3: v61, a4, a5: 0, a6: (unsigned int)(v49 + 1));
  }
  return sub_1932C8DE0(a1: v30, a2: v31, a3: v29, a4: (unsigned __int64)v56 ^ v64, a5: v32, a6: v33);
}
