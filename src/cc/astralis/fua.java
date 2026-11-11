package cc.astralis;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum fua {
   RGBA8,
   SRGB8_ALPHA8,
   RGB8,
   OTHER;

   private final int clb;
   private static final fua[] bgc;
   private static final long a = 111869676362110L;

   private fua(int a) {
      a.clb = a;
   }

   public int bui() {
      return a.clb;
   }

   public static fua edx(int code) {
      long ax = fua.a ^ 31299698473818L;
      fua[] var4 = values();
      int[] var10000 = dar.abu();
      int var5 = var4.length;
      int[] axx = var10000;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            fua axxx = var4[var6];
            if (axx != null) {
               var8 = axxx;
               if (axx == null) {
                  break;
               }

               if (axxx.clb == a) {
                  return axxx;
               }

               var6++;
            }

            if (axx != null) {
               continue;
            }
         }

         var8 = OTHER;
         break;
      }

      return var8;
   }

   private static fua[] dch() {
      return new fua[]{RGBA8, SRGB8_ALPHA8, RGB8, OTHER};
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var20 = a ^ 130136326138185L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var20 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[4];
      int var17 = 0;
      String var16 = "\\\u001dµ!Ë\u000b¿\u009e\bC¬\u001aå«\u0006åq";
      int var18 = "\\\u001dµ!Ë\u000b¿\u009e\bC¬\u001aå«\u0006åq".length();
      char var15 = '\b';
      int var23 = -1;

      label47:
      while (true) {
         String var24 = var16.substring(++var23, var23 + var15);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var12.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var11[var17++] = var33;
                  if ((var23 += var15) >= var18) {
                     Cipher var1;
                     var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var2 = 1; var2 < 8; var2++) {
                        var10003[var2] = (byte)(var20 << var2 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var0 = new long[3];
                     int var4 = 0;
                     String var5 = "fhÖ\tYp\u00ad\u000bjö\u001b\u0017°f`Ï8JpÊ\u0082(/\u0010";
                     int var6 = "fhÖ\tYp\u00ad\u000bjö\u001b\u0017°f`Ï8JpÊ\u0082(/\u0010".length();
                     byte var3 = 0;

                     do {
                        var10001 = var3;
                        var3 += 8;
                        byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
                        var10001 = var4++;
                        long var8 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte[] var10 = var1.doFinal(
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
                        long var10004 = (var10[0] & 255L) << 56
                           | (var10[1] & 255L) << 48
                           | (var10[2] & 255L) << 40
                           | (var10[3] & 255L) << 32
                           | (var10[4] & 255L) << 24
                           | (var10[5] & 255L) << 16
                           | (var10[6] & 255L) << 8
                           | var10[7] & 255L;
                        byte var38 = -1;
                        var0[var10001] = var10004;
                     } while (var3 < var6);

                     RGBA8 = new fua((int)var0[1]);
                     SRGB8_ALPHA8 = new fua((int)var0[2]);
                     RGB8 = new fua((int)var0[0]);
                     OTHER = new fua(-1);
                     bgc = dch();
                     return;
                  }

                  var15 = var16.charAt(var23);
                  break;
               default:
                  var11[var17++] = var33;
                  if ((var23 += var15) < var18) {
                     var15 = var16.charAt(var23);
                     continue label47;
                  }

                  var16 = "\u0019\u0087\u0015\u00adQípê\u0005°§õp1\u008e!\b\u008c\u0003\u0092x<I\u0013\u0081";
                  var18 = "\u0019\u0087\u0015\u00adQípê\u0005°§õp1\u008e!\b\u008c\u0003\u0092x<I\u0013\u0081".length();
                  var15 = 16;
                  var23 = -1;
            }

            var24 = var16.substring(++var23, var23 + var15);
            var10001 = 0;
         }
      }
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
