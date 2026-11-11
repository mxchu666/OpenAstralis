package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class dzu extends guu {
   private cyx epd;
   private static final long a = 61807592381592L;
   private static final String g;
   private static final long[] h;
   private static final Integer[] i;
   private static final Map p;

   public dzu() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: getstatic cc/astralis/dzu.a J
      // 03: ldc2_w 22322584483985
      // 06: lxor
      // 07: lstore 1
      // 08: aload 0
      // 09: getstatic cc/astralis/bfm.EXPLOIT Lcc/astralis/bfm;
      // 0c: invokespecial cc/astralis/guu.<init> (Lcc/astralis/bfm;)V
      // 0f: aload 0
      // 10: new cc/astralis/cyx
      // 13: dup
      // 14: getstatic cc/astralis/dzu.g Ljava/lang/String;
      // 17: sipush 29113
      // 1a: ldc2_w 5542798435304387725
      // 1d: lload 1
      // 1e: lxor
      // 1f: pop2
      // 20: pop
      // 21: ldc 1205291450
      // 23: anewarray 40
      // 26: dup
      // 27: bipush 0
      // 28: new cc/astralis/awe
      // 2b: dup
      // 2c: aload 0
      // 2d: invokespecial cc/astralis/awe.<init> (Lcc/astralis/guu;)V
      // 30: aastore
      // 31: dup
      // 32: bipush 1
      // 33: new cc/astralis/frr
      // 36: dup
      // 37: aload 0
      // 38: invokespecial cc/astralis/frr.<init> (Lcc/astralis/guu;)V
      // 3b: aastore
      // 3c: dup
      // 3d: bipush 2
      // 3e: new cc/astralis/aoy
      // 41: dup
      // 42: aload 0
      // 43: invokespecial cc/astralis/aoy.<init> (Lcc/astralis/guu;)V
      // 46: aastore
      // 47: dup
      // 48: bipush 3
      // 49: new cc/astralis/guc
      // 4c: dup
      // 4d: aload 0
      // 4e: invokespecial cc/astralis/guc.<init> (Lcc/astralis/guu;)V
      // 51: aastore
      // 52: dup
      // 53: bipush 4
      // 54: new cc/astralis/fii
      // 57: dup
      // 58: aload 0
      // 59: invokespecial cc/astralis/fii.<init> (Lcc/astralis/guu;)V
      // 5c: aastore
      // 5d: dup
      // 5e: bipush 5
      // 5f: new cc/astralis/bey
      // 62: dup
      // 63: aload 0
      // 64: invokespecial cc/astralis/bey.<init> (Lcc/astralis/guu;)V
      // 67: aastore
      // 68: dup
      // 69: sipush 20617
      // 6c: ldc2_w 8524632426966193598
      // 6f: lload 1
      // 70: lxor
      // 71: invokedynamic a (IJ)I bsm=cc/astralis/dzu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: new cc/astralis/abn
      // 79: dup
      // 7a: aload 0
      // 7b: invokespecial cc/astralis/abn.<init> (Lcc/astralis/guu;)V
      // 7e: aastore
      // 7f: dup
      // 80: sipush 8071
      // 83: ldc2_w 4840734307414497970
      // 86: lload 1
      // 87: lxor
      // 88: pop2
      // 89: pop
      // 8a: ldc -453527880
      // 8c: new cc/astralis/dxa
      // 8f: dup
      // 90: aload 0
      // 91: invokespecial cc/astralis/dxa.<init> (Lcc/astralis/guu;)V
      // 94: aastore
      // 95: dup
      // 96: sipush 30175
      // 99: ldc2_w 5909663410986070249
      // 9c: lload 1
      // 9d: lxor
      // 9e: invokedynamic a (IJ)I bsm=cc/astralis/dzu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: new cc/astralis/dlg
      // a6: dup
      // a7: aload 0
      // a8: invokespecial cc/astralis/dlg.<init> (Lcc/astralis/guu;)V
      // ab: aastore
      // ac: invokespecial cc/astralis/cyx.<init> (Ljava/lang/String;[Lcc/astralis/hcr;)V
      // af: putfield cc/astralis/dzu.epd Lcc/astralis/cyx;
      // b2: aload 0
      // b3: aload 0
      // b4: getfield cc/astralis/dzu.epd Lcc/astralis/cyx;
      // b7: invokevirtual cc/astralis/dzu.beb (Lcc/astralis/ffn;)V
      // ba: return
   }

   @gdz
   public void cfu(fxx event) {
      a.efe(a.epd.dnp().akm());
   }

   static {
      long var11 = a ^ 116374916305034L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("Disabler Mode".getBytes("ISO-8859-1"));
      String var22 = d(var15).intern();
      int var10001 = -1;
      g = var22;
      p = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "ðÛ\u0016ù\u0094\u0085á×°ö3-æ \u0080©";
      int var5 = "ðÛ\u0016ù\u0094\u0085á×°ö3-æ \u0080©".length();
      byte var2 = 0;

      label29:
      while (true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var18 = var6;
         var10001 = var3++;
         long var24 = (var7[0] & 255L) << 56
            | (var7[1] & 255L) << 48
            | (var7[2] & 255L) << 40
            | (var7[3] & 255L) << 32
            | (var7[4] & 255L) << 24
            | (var7[5] & 255L) << 16
            | (var7[6] & 255L) << 8
            | var7[7] & 255L;
         byte var27 = -1;

         while (true) {
            long var8 = var24;
            byte[] var10 = var0.doFinal(
               new byte[]{
                  (byte)(var8 >>> 56),
                  (byte)(var8 >>> 48),
                  (byte)(var8 >>> 40),
                  (byte)(var8 >>> 32),
                  (byte)(var8 >>> 24),
                  (byte)(var8 >>> 16),
                  (byte)(var8 >>> 8),
                  (byte)var8
               }
            );
            long var29 = (var10[0] & 255L) << 56
               | (var10[1] & 255L) << 48
               | (var10[2] & 255L) << 40
               | (var10[3] & 255L) << 32
               | (var10[4] & 255L) << 24
               | (var10[5] & 255L) << 16
               | (var10[6] & 255L) << 8
               | var10[7] & 255L;
            switch (var27) {
               case 0:
                  var18[var10001] = var29;
                  if (var2 >= var5) {
                     h = var6;
                     i = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var18[var10001] = var29;
                  if (var2 < var5) {
                     continue label29;
                  }

                  var4 = "Õ\u0099¬\u009f\u0011-\u009a2GT[E4Ñ\u0093\u001c";
                  var5 = "Õ\u0099¬\u009f\u0011-\u009a2GT[E4Ñ\u0093\u001c".length();
                  var2 = 0;
            }

            byte var21 = var2;
            var2 += 8;
            var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
            var18 = var6;
            var10001 = var3++;
            var24 = (var7[0] & 255L) << 56
               | (var7[1] & 255L) << 48
               | (var7[2] & 255L) << 40
               | (var7[3] & 255L) << 32
               | (var7[4] & 255L) << 24
               | (var7[5] & 255L) << 16
               | (var7[6] & 255L) << 8
               | var7[7] & 255L;
            var27 = 0;
         }
      }
   }

   private static String d(byte[] var0) {
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8509;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = h[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/dzu", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/dzu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
