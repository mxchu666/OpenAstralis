// sub_184F493C0
// rva 0x04f493c0  size 58  section .text  group samples
// from Hex-Rays over a carved window; addresses are image addresses
__int64 __fastcall sub_184F493C0(__int64 a1, __int64 a2, unsigned int a3)
{
  __int64 v3; // r15
  char v4; // al
  _DWORD v6[6]; // [rsp+0h] [rbp-18h] BYREF

  if ( (unsigned __int64)v6 <= *(_QWORD *)(v3 + 8) )
  {
    MEMORY[0x181EB84E0]();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    __builtin_debugtrap();
    return sub_184F49400();
  }
  else
  {
    v6[5] = a3;
    v4 = sub_184F47B80(a1, a2, a3);
    if ( *(int *)(v3 + 16) <= 0 )
      v4 = MEMORY[0x18277F280]();
    return (0x23Eu >> v4) & 1;
  }
}
