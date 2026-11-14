// sub_181EA01E0
// rva 0x01ea01e0  size 533  section .text  group samples
// window base 0x181ea01e0: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
void __fastcall sub_181EA01E0(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5, unsigned int a6)
{
  __int64 v6; // r13
  __int64 v7; // r14
  __int64 v8; // r15
  __int64 v9; // rcx
  __int64 v10; // rbx
  __int64 v11; // r8
  __int64 v12; // rax
  __int64 v13; // rcx
  __int64 v14; // rdi
  __int64 v15; // rsi
  __int64 v16; // rax
  __int64 v17; // rcx
  __int64 v18; // rsi
  __int64 v19; // rax
  __int64 v20; // rcx
  __int64 v21; // rdi
  __int64 v22; // rsi
  __int64 v23; // rax
  __int64 v24; // rdx
  __int64 v25; // rcx
  __int64 v26; // rdi
  __int64 v27; // rsi
  double v28; // xmm0_8
  __int64 v29; // rax
  __int64 v30; // rdi
  __int64 v31; // rsi
  __int64 v32; // rax
  __int64 v33; // rcx
  __int64 v34; // rdi
  __int64 v35; // rsi
  __int64 v36; // rax
  __int64 v37; // rcx
  __int64 v38; // rdi
  __int64 v39; // rsi
  __int64 v40; // rax
  __int64 v41; // rcx
  __int64 v42; // rsi
  __int64 v43; // rax
  __int64 v44; // rcx
  __int64 v45; // rdi
  __int64 v46; // rsi
  __int64 v47; // rax
  __int64 v48; // rcx
  __int64 v49; // rdi
  __int64 v50; // rsi
  __int64 v51; // rax
  __int64 v52; // rcx
  __int64 v53; // rdi
  __int64 v54; // rsi
  __int64 v55; // rax
  __int64 v56; // rdi
  __int64 v57; // rsi
  __int64 v58; // rax
  unsigned int (__fastcall *v59)(__int64, __int64, __int64); // rbp
  char v60; // [rsp+0h] [rbp-38h] BYREF
  __int64 v61; // [rsp+8h] [rbp-30h]
  __int64 v62; // [rsp+10h] [rbp-28h]
  unsigned int v63; // [rsp+1Ch] [rbp-1Ch]
  __int64 v64; // [rsp+20h] [rbp-18h]
  __int64 v65; // [rsp+28h] [rbp-10h]
  unsigned int v66; // [rsp+34h] [rbp-4h]

  v64 = a3;
  v66 = a6;
  v9 = v7 + 376612120;
  if ( (unsigned __int64)&v60 <= *(_QWORD *)(v8 + 8) )
  {
    v28 = sub_181EB83C0(a1, a2, a3, a4: v9, a5, a6, a7: v60);
LABEL_21:
    MEMORY[0x18276EFE0](a1: v26, a2: v27, a3: v24, a4: v25, a5: v65, a6: v28);
    goto LABEL_22;
  }
  v10 = *(unsigned int *)(a3 + 12);
  v63 = *(_DWORD *)(a3 + 12);
  if ( *(_DWORD *)(a3 + 48) == 0 )
  {
    v58 = *(unsigned int *)(v7 + 376351692);
    if ( (_DWORD)v58 != 0 )
    {
      v62 = v7 + 376612120;
      v59 = (unsigned int (__fastcall *)(__int64, __int64, __int64))(v6
                                                                   + *(_QWORD *)(v7
                                                                               + 8LL * (*(_DWORD *)(v7 + 8 * v58) >> 3)
                                                                               + 136));
      v61 = v7 + 8 * v58;
      if ( v59(a1, a2, a3: v61) != 0 )
      {
        v10 = v63;
        goto LABEL_4;
      }
    }
    else
    {
      v62 = v7 + 376612120;
    }
    v11 = *(_QWORD *)(v7 + 376652832);
    goto LABEL_6;
  }
  v62 = v7 + 376612120;
LABEL_4:
  if ( (_DWORD)v10 == 0 )
  {
LABEL_22:
    MEMORY[0x18276EFE0](a1, a2, a3: v64, a4: v9, a5, a6: v66);
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
    sub_181EA0400();
    return;
  }
  v11 = *(_QWORD *)(v7 + 8 * v10 + 8) + (*(_QWORD *)(v7 + 8 * v10 + 16) << 19);
LABEL_6:
  if ( v66 != 0 || v11 != 0 )
  {
    v65 = v11;
    v12 = MEMORY[0x182084840](a1, a2, a3: v62, a4: v62, a5: v7 + 8LL * *(unsigned int *)(v64 + 4));
    v16 = MEMORY[0x182084840](a1: v14, a2: v15, a3: v12, a4: v13, a5: v7 + 372436952);
    v19 = MEMORY[0x182084440](a1: 2, a2: v18, a3: v16, a4: v17, a5: v65, a6: 0x100000);
    v23 = MEMORY[0x182084840](a1: v21, a2: v22, a3: v19, a4: v20, a5: v7 + 368955176);
    if ( v63 != 0 )
    {
      v29 = MEMORY[0x182084440](
              a1: 2,
              a2: v27,
              a3: v23,
              a4: v25,
              a5: *(_QWORD *)(v7 + 8LL * v63 + 16) << 19,
              a6: 0x100000);
      v62 = v7 + 368955088;
      v32 = MEMORY[0x182084840](a1: v30, a2: v31, a3: v29, a4: v7 + 368955088, a5: v7 + 368955088);
      v36 = MEMORY[0x1820845C0](a1: v34, a2: v35, a3: v32, a4: v33, a5: *(_QWORD *)(v7 + 8LL * v63 + 16));
      v40 = MEMORY[0x182084840](a1: v38, a2: v39, a3: v36, a4: v37, a5: v7 + 372939360);
      v43 = MEMORY[0x182084440](a1: 2, a2: v42, a3: v40, a4: v41, a5: *(_QWORD *)(v7 + 8LL * v63 + 8), a6: 0x100000);
      v47 = MEMORY[0x182084840](a1: v45, a2: v46, a3: v43, a4: v44, a5: v62);
      v51 = MEMORY[0x1820845C0](a1: v49, a2: v50, a3: v47, a4: v48, a5: *(_QWORD *)(v7 + 8LL * v63 + 24));
      v55 = MEMORY[0x182084840](a1: v53, a2: v54, a3: v51, a4: v52, a5: v7 + 372891936);
      MEMORY[0x1820841E0](a1: v56, a2: v57, a3: v55);
      goto LABEL_9;
    }
    goto LABEL_21;
  }
  v65 = 0;
LABEL_9:
  if ( *(int *)(v8 + 16) <= 0 )
    MEMORY[0x18277F280]();
}
