package cc.astralis;

import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum dtw {
   EASE_IN_OUT_SINE,
   EASE_IN_OUT_QUAD,
   EASE_OUT_BACK,
   EASE_IN_BACK;

   private final Function<Double, Double> bjp;
   private static final long a = 82583005345037L;

   private dtw(Function<Double, Double> a) {
      a.bjp = a;
   }

   public Function<Double, Double> hbd() {
      return a.bjp;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var9 = a ^ 43304898163016L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[4];
      int var6 = 0;
      String var5 = " ºÔ¿V»\u001c.¬ýx<vÅ©?\u00103|\u0019^ù£\u0094:Vú8ð\u0014\u0092$#";
      int var7 = " ºÔ¿V»\u001c.¬ýx<vÅ©?\u00103|\u0019^ù£\u0094:Vú8ð\u0014\u0092$#".length();
      char var4 = 16;
      int var12 = -1;

      label28:
      while (true) {
         String var13 = var5.substring(++var12, var12 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var19;
                  if ((var12 += var4) >= var7) {
                     EASE_IN_OUT_SINE = new dtw(a -> -(Math.cos(Math.PI * a) - 1.0) / 2.0);
                     EASE_IN_OUT_QUAD = new dtw(a -> {
                        long ax = dtw.a ^ 25065342208013L;
                        int[] var3 = dar.abu();
                        double var10000x = a;
                        double var10001x = 0.5;
                        if (var3 != null) {
                           if (var10000x < 0.5) {
                              return 2.0 * a * a;
                           }

                           var10000x = 1.0;
                           var10001x = Math.pow(-2.0 * a + 2.0, 2.0) / 2.0;
                        }

                        return var10000x - var10001x;
                     });
                     EASE_OUT_BACK = new dtw(a -> 1.0 + 2.70158 * Math.pow(a - 1.0, 3.0) + 1.70158 * Math.pow(a - 1.0, 2.0));
                     EASE_IN_BACK = new dtw(a -> {
                        double ax = 1.70158;
                        return a * a * ((ax + 1.0) * a - ax);
                     });
                     return;
                  }

                  var4 = var5.charAt(var12);
                  break;
               default:
                  var0[var6++] = var19;
                  if ((var12 += var4) < var7) {
                     var4 = var5.charAt(var12);
                     continue label28;
                  }

                  var5 = "3|\u0019^ù£\u0094:8:\u001eþ\u001ck¤>q¢\f\u0095.ÿ\u0089É\u00183|\u0019^ù£\u0094:\u001aY\u009b³\u001cMKôa&\u0084\u009f\u0005f\\6";
                  var7 = "3|\u0019^ù£\u0094:8:\u001eþ\u001ck¤>q¢\f\u0095.ÿ\u0089É\u00183|\u0019^ù£\u0094:\u001aY\u009b³\u001cMKôa&\u0084\u009f\u0005f\\6"
                     .length();
                  var4 = 24;
                  var12 = -1;
            }

            var13 = var5.substring(++var12, var12 + var4);
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
