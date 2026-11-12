// Java_java_net_Inet6AddressImpl_isReachable0
// rva 0x132ab2a8  size 470  section .text  group jdk
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall Java_java_net_Inet6AddressImpl_isReachable0(
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
        int a11,
        __int64 a12,
        int a13,
        int a14)
{
  __int64 v17; // rdx
  __int64 v18; // rdi
  __int64 v19; // rsi
  __int64 v20; // r8
  __int64 v21; // r9
  __int64 v22; // rdi
  __int64 v23; // rsi
  void (__fastcall *v24)(__int64, __int64, __int64, __int64, _QWORD, __int64); // r10
  __int64 v25; // rdi
  __int64 v26; // rsi
  __int64 v27; // rdi
  __int64 v28; // rdi
  __int64 v29; // rsi
  __int16 *v30; // rdi
  __int64 v31; // rsi
  void (__fastcall *v32)(__int64, __int64, __int64, __int64, _QWORD, __int64); // r10
  __int64 v33; // rdi
  __int64 v34; // rsi
  __int64 v35; // rdi
  __int64 v36; // rsi
  __int64 v37; // rdi
  __int64 v38; // rsi
  __int64 v39; // rax
  __int64 v40; // rdi
  __int64 v41; // rsi
  unsigned int v42; // eax
  __int64 v43; // rdi
  __int64 v44; // rsi
  __int64 v46; // [rsp+0h] [rbp-91h] BYREF
  __int64 v47; // [rsp+8h] [rbp-89h]
  __int64 v48; // [rsp+10h] [rbp-81h]
  int v49; // [rsp+18h] [rbp-79h]
  _BYTE *v50; // [rsp+20h] [rbp-71h]
  __int16 v51; // [rsp+30h] [rbp-61h] BYREF
  _BYTE v52[16]; // [rsp+38h] [rbp-59h] BYREF
  int v53; // [rsp+48h] [rbp-49h]
  __int16 v54; // [rsp+50h] [rbp-41h] BYREF
  _BYTE v55[16]; // [rsp+58h] [rbp-39h] BYREF
  int v56; // [rsp+68h] [rbp-29h]
  _BYTE v57[16]; // [rsp+70h] [rbp-21h] BYREF
  __int64 v58; // [rsp+80h] [rbp-11h]

  if ( (unsigned int)sub_1932AA290(a1: 0, a2: a5) != 0 )
  {
    if ( (*(unsigned int (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a4 + 1368LL))(
           a1: v18,
           a2: v19,
           a3: v19,
           a4) == 4 )
    {
      Java_java_net_Inet4AddressImpl_isReachable0(
        a1: v22,
        a2: v23,
        a3,
        a4,
        a5: v23,
        a6: a11,
        a7: v46,
        a8: v47,
        a9: v48,
        a10: v49,
        a11: a12,
        a12: a13);
    }
    else
    {
      sub_1932CA161(a1: v22, a2: v23, a3: 0, a4: v57, a5: 16);
      v24 = *(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1600LL);
      v50 = v57;
      v24(a1: v25, a2: v26, a3: v26, a4, a5: 0, a6: 16);
      sub_1932CA161(a1: v27, a2: 28, a3: 0, a4: &v51, a5: 28);
      sub_1932CA15B(a1: v28, a2: v29, a3: v57, a4: v52, a5: 16);
      v51 = 23;
      if ( a6 <= 0 )
        JUMPOUT(0x326505397LL);
      v53 = a6;
      if ( a12 != 0 )
      {
        sub_1932CA161(a1: v30, a2: v31, a3: 0, a4: v57, a5: 16);
        v32 = *(void (__fastcall **)(__int64, __int64, __int64, __int64, _QWORD, __int64))(*(_QWORD *)a4 + 1600LL);
        v50 = v57;
        v32(a1: v33, a2: v34, a3: a12, a4, a5: 0, a6: 16);
        sub_1932CA161(a1: v35, a2: v36, a3: 0, a4: &v54, a5: (unsigned int)v36);
        sub_1932CA15B(a1: v37, a2: v38, a3: v57, a4: v55, a5: 16);
        v30 = &v54;
        v56 = a14;
        v54 = 23;
      }
      v39 = MEMORY[0x79270](a1: v30);
      if ( v39 == -1 )
      {
        v42 = MEMORY[0x79958](a1: v40, a2: v41);
        if ( v42 == 5 )
          sub_1932ABA00(
            a1: v43,
            a2: v44,
            a3: (unsigned int)&v51,
            a4,
            a5: v43,
            a6: a11,
            a7: v46,
            a8: v47,
            a9: v48,
            a10: v49,
            a11: a13);
        else
          sub_1932AED0C(a1: v43, a2: v44, a3: v42, a4, a5: 537528);
      }
      else
      {
        sub_1932AB8E8(
          a1: v40,
          a2: v41,
          a3: v39,
          a4,
          a5: (unsigned int)&v51,
          a6: v40,
          a7: v46,
          a8: v47,
          a9: v48,
          a10: v49,
          a11);
      }
    }
  }
  return sub_1932C8DE0(a1: v18, a2: v19, a3: v17, a4: (unsigned __int64)&v46 ^ v58, a5: v20, a6: v21);
}
