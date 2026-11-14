// Java_java_io_WinNTFileSystem_list0
// rva 0x132b3728  size 866  section .text  group jdk
// window base 0x1932b3728: Hex-Rays prints an operand at or above the
// base as base-relative, and one below it as absolute
__int64 __fastcall Java_java_io_WinNTFileSystem_list0(__int64 a1, __int64 a2, int a3, __int64 *a4, __int64 a5)
{
  __int64 v6; // rdx
  __int64 v7; // rdi
  __int64 v8; // rsi
  __int64 v9; // r8
  __int64 v10; // r9
  __int64 v11; // r12
  __int64 v12; // rax
  __int64 v13; // rax
  __int64 v14; // rdx
  __int64 v15; // rdi
  __int64 v16; // rsi
  __int64 v17; // rax
  __int64 v18; // rdx
  __int64 v19; // rdi
  __int64 v20; // rsi
  _WORD *v21; // rbx
  __int64 v22; // rdx
  __int64 v23; // rcx
  __int64 v24; // rdi
  __int64 v25; // rsi
  __int64 v26; // rdi
  __int64 v27; // rsi
  __int64 v28; // rdx
  __int64 v29; // rdi
  __int64 v30; // rsi
  __int64 v31; // rdx
  __int64 v32; // rdi
  __int64 v33; // rsi
  int v34; // eax
  __int64 v35; // rdx
  __int64 v36; // rdi
  __int64 v37; // rsi
  int v38; // r14d
  int v39; // eax
  __int64 v40; // rdi
  __int64 v41; // rsi
  _WORD *v42; // rcx
  __int64 v43; // rdx
  __int64 v44; // rdi
  __int64 v45; // rsi
  __int64 v46; // r15
  __int64 v47; // rdx
  __int64 v48; // rdi
  __int64 v49; // rsi
  __int64 v50; // rdi
  __int64 v51; // rsi
  unsigned int v52; // ebp
  __int64 v53; // rdx
  __int64 v54; // rdi
  __int64 v55; // rsi
  __int64 *v56; // rdi
  __int64 v57; // rsi
  __int64 v58; // rdx
  __int64 v59; // rbx
  unsigned int v60; // eax
  __int64 v61; // rdi
  __int64 v62; // rsi
  __int64 v63; // r13
  __int64 v64; // rbx
  __int64 v65; // rax
  __int64 v66; // rdi
  __int64 v67; // rsi
  int v68; // ebx
  __int64 v69; // rdx
  __int64 v70; // rdi
  __int64 v71; // rsi
  __int64 v72; // rbx
  __int64 v73; // rax
  __int64 v75; // [rsp+0h] [rbp-2B8h] BYREF
  _BYTE v76[44]; // [rsp+20h] [rbp-298h] BYREF
  _BYTE v77[548]; // [rsp+4Ch] [rbp-26Ch] BYREF
  __int64 v78; // [rsp+270h] [rbp-48h]

  v11 = JNU_ClassString(a1: (__int64)a4, a2, a3, a4);
  if ( v11 != 0 )
  {
    v12 = sub_1932B8E48(a1: v7, a2: v8, a3: a5, a4: v7, a5: MEMORY[0x337630]);
    v8 = v12;
    if ( v12 != 0 )
    {
      v13 = MEMORY[0x79CB0](a1: v7, a2: v12, a3: v6, a4: v12);
      v17 = MEMORY[0x79AD0](a1: v15, a2: v16, a3: v14, a4: 2 * v13 + 6);
      v21 = (_WORD *)v17;
      if ( v17 != 0 )
      {
        MEMORY[0x79C88](a1: v19, a2: v20, a3: v20, a4: v17);
        MEMORY[0x79AE0](a1: v29, a2: v30, a3: v28, a4: v30);
        v34 = MEMORY[0x79300](a1: v32, a2: v33, a3: v31, a4: v21);
        if ( v34 == -1 || (v38 = 16, (v34 & 0x10) == 0) )
        {
          MEMORY[0x79AE0](a1: v36, a2: v37, a3: v35, a4: v21);
        }
        else
        {
          v39 = MEMORY[0x79CB0](a1: v36, a2: v37, a3: v35, a4: v21);
          if ( v21[v39 - 1] == 32 )
          {
            v42 = &v21[v39 - 1];
            do
            {
              --v39;
              --v42;
            }
            while ( *v42 == 32 );
          }
          v21[v39] = 0;
          if ( (*v21 != 92 || v21[1] != 0) && (v21[1] != 58 || v21[2] != 0 && (v21[2] != 92 || v21[3] != 0)) )
            v43 = 543792;
          else
            v43 = 543788;
          MEMORY[0x79C80](a1: v40, a2: v41, a3: v43, a4: v21);
          v46 = MEMORY[0x792E0](a1: v44, a2: v45, a3: v76, a4: v21);
          MEMORY[0x79AE0](a1: v48, a2: v49, a3: v47, a4: v21);
          if ( v46 == -1 )
          {
            if ( (unsigned int)MEMORY[0x79758](a1: v50) == 2 )
              (*(void (__fastcall **)(__int64, __int64, _QWORD, __int64, __int64, _QWORD))(*(_QWORD *)v7 + 1376LL))(
                a1: v7,
                a2: v8,
                a3: 0,
                a4: v7,
                a5: v11,
                a6: 0);
          }
          else
          {
            v52 = 0;
            v55 = (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64, __int64, _QWORD))(*(_QWORD *)v50
                                                                                                 + 1376LL))(
                    a1: v50,
                    a2: v51,
                    a3: 16,
                    a4: v50,
                    a5: v11,
                    a6: 0);
            if ( v55 != 0 )
            {
              do
              {
                if ( (unsigned int)MEMORY[0x79C68](a1: v54, a2: v55, a3: 543800, a4: v77) != 0
                  && (unsigned int)MEMORY[0x79C68](a1: v56, a2: v57, a3: 543804, a4: v77) != 0 )
                {
                  v59 = *v56;
                  v60 = MEMORY[0x79CB0](a1: v56, a2: v57, a3: v58, a4: v77);
                  v63 = (*(__int64 (__fastcall **)(__int64, __int64, _BYTE *, __int64, _QWORD))(v59 + 1304))(
                          a1: v61,
                          a2: v62,
                          a3: v77,
                          a4: v61,
                          a5: v60);
                  if ( v63 == 0 )
                    goto LABEL_36;
                  if ( v52 == v38 )
                  {
                    v38 *= 2;
                    v64 = v55;
                    v65 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64, __int64, _QWORD))(*(_QWORD *)v54 + 1376LL))(
                            a1: v54,
                            a2: v55,
                            a3: (unsigned int)v38,
                            a4: v54,
                            a5: v11,
                            a6: 0);
                    v55 = v65;
                    if ( v65 == 0 || (int)JNU_CopyObjectArray(a1: v54, a2: v65, a3: v65, a4: v54, a5: v64, a6: v52) < 0 )
                      goto LABEL_36;
                    (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v54 + 184LL))(
                      a1: v54,
                      a2: v55,
                      a3: v64,
                      a4: v54);
                  }
                  (*(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)v54 + 1392LL))(
                    a1: v54,
                    a2: v55,
                    a3: v55,
                    a4: v54,
                    a5: v52++,
                    a6: v63);
                  (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)v66 + 184LL))(
                    a1: v66,
                    a2: v67,
                    a3: v63,
                    a4: v66);
                }
              }
              while ( (unsigned int)MEMORY[0x792E8](a1: v56, a2: v57, a3: v76, a4: v46) != 0 );
              v68 = MEMORY[0x79758](a1: v54);
              MEMORY[0x79490](a1: v70, a2: v71, a3: v69, a4: v46);
              if ( v68 == 18 && (int)v52 < v38 )
              {
                v72 = v8;
                v73 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD, __int64, __int64, _QWORD))(*(_QWORD *)v7 + 1376LL))(
                        a1: v7,
                        a2: v8,
                        a3: v52,
                        a4: v7,
                        a5: v11,
                        a6: 0);
                v8 = v73;
                if ( v73 != 0 )
                  JNU_CopyObjectArray(a1: v7, a2: v73, a3: v73, a4: v7, a5: v72, a6: v52);
              }
            }
            else
            {
LABEL_36:
              MEMORY[0x79490](a1: v54, a2: v55, a3: v53, a4: v46);
            }
          }
        }
      }
      else
      {
        MEMORY[0x79AE0](a1: v19, a2: v20, a3: v18, a4: v20);
        *(_DWORD *)MEMORY[0x79B48](a1: v24, a2: v25, a3: v22, a4: v23) = 12;
        sub_1932B15D0(a1: v26, a2: v27, a3: 533920, a4: v26);
      }
    }
  }
  return sub_1932C8DE0(a1: v7, a2: v8, a3: v6, a4: (unsigned __int64)&v75 ^ v78, a5: v9, a6: v10);
}
