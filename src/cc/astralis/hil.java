package cc.astralis;

import net.minecraft.class_746;

public class hil extends hcr {
   private static final long a;
   private static final String d;

   public hil(guu parentClass) {
      long ax = hil.a ^ 46160508601584L;
      super(a, d);
   }

   @gdz
   public void gbs(eih event) {
      label20: {
         long ax = hil.a ^ 15767045346433L;
         int[] var4 = dar.abu();
         class_746 var10000 = chi.field_1724;
         if (var4 != null) {
            if (!chi.field_1724.method_24828()) {
               break label20;
            }

            var10000 = chi.field_1724;
         }

         var10000.method_6043();
         if (var4 != null) {
            return;
         }
      }

      evd.dyv();
   }

   static {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: ldc2_w 48039453267156
      // 03: putstatic cc/astralis/hil.a J
      // 06: getstatic cc/astralis/hil.a J
      // 09: ldc2_w 64541650615982
      // 0c: lxor
      // 0d: lstore 0
      // 0e: ldc "DES/CBC/PKCS5Padding"
      // 10: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 13: dup
      // 14: astore 2
      // 15: bipush 2
      // 16: ldc "DES"
      // 18: invokestatic javax/crypto/SecretKeyFactory.getInstance (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
      // 1b: bipush 8
      // 1d: newarray 8
      // 1f: dup
      // 20: bipush 0
      // 21: lload 0
      // 22: bipush 56
      // 24: lushr
      // 25: l2i
      // 26: i2b
      // 27: bastore
      // 28: bipush 1
      // 29: istore 3
      // 2a: iload 3
      // 2b: bipush 8
      // 2d: if_icmpge 44
      // 30: dup
      // 31: iload 3
      // 32: lload 0
      // 33: iload 3
      // 34: bipush 8
      // 36: imul
      // 37: lshl
      // 38: bipush 56
      // 3a: lushr
      // 3b: l2i
      // 3c: i2b
      // 3d: bastore
      // 3e: iinc 3 1
      // 41: goto 2a
      // 44: new javax/crypto/spec/DESKeySpec
      // 47: dup_x1
      // 48: swap
      // 49: invokespecial javax/crypto/spec/DESKeySpec.<init> ([B)V
      // 4c: invokevirtual javax/crypto/SecretKeyFactory.generateSecret (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
      // 4f: new javax/crypto/spec/IvParameterSpec
      // 52: dup
      // 53: bipush 8
      // 55: newarray 8
      // 57: invokespecial javax/crypto/spec/IvParameterSpec.<init> ([B)V
      // 5a: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 5d: ldc "Mush"
      // 5f: bipush -1
      // 60: goto 69
      // 63: putstatic cc/astralis/hil.d Ljava/lang/String;
      // 66: goto 83
      // 69: swap
      // 6a: ldc "ISO-8859-1"
      // 6c: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 6f: aload 2
      // 70: swap
      // 71: invokevirtual javax/crypto/Cipher.doFinal ([B)[B
      // 74: astore 4
      // 76: aload 4
      // 78: invokestatic cc/astralis/hil.a ([B)Ljava/lang/String;
      // 7b: invokevirtual java/lang/String.intern ()Ljava/lang/String;
      // 7e: swap
      // 7f: pop
      // 80: goto 63
      // 83: return
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
