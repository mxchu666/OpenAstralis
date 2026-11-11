package cc.astralis;

import java.awt.Color;
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
import net.minecraft.class_5611;

public class dec implements dlc {
   private static cdr[] aqh;
   private static final long a = 11850397063986L;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public static int brp(Color color) {
      return new Color(a.getBlue(), a.getGreen(), a.getRed()).getRGB();
   }

   public static Color fbp(class_5611 screenCoordinates, Color firstColor, Color secondColor) {
      return hcp(a, a, dge(a));
   }

   static Color hcp(Color a, Color a, double a) {
      double ax = 1.0 - a;
      int axx = (int)(a.getRed() * a + a.getRed() * ax);
      int axxx = (int)(a.getGreen() * a + a.getGreen() * ax);
      int axxxx = (int)(a.getBlue() * a + a.getBlue() * ax);
      return new Color(axx, axxx, axxxx);
   }

   public static double dge(class_5611 screenCoordinates) {
      return Math.sin(System.currentTimeMillis() / 175.0 + a.method_32118() * 7.0E-4 + a.method_32119() * 7.0E-4) * 0.5 + 0.5;
   }

   public static Color bst(int color) {
      long ax = dec.a ^ 28512707379716L;
      short var10001 = 13244;
      long var10002 = 6798015806536338471L ^ ax;
      int var10000 = a >> 24;
      var10001 = 6446;
      var10002 = 3082034638576281268L ^ ax;
      int axx = var10000 & 0xFF;
      var10000 = a >> a<"w">(12613, 1865965446156570320L ^ ax);
      var10001 = 4375;
      var10002 = 10999400189259406L ^ ax;
      int axxx = var10000 & 0xFF;
      var10000 = a >> a<"w">(2287, 8468044953026164603L ^ ax);
      var10001 = 4375;
      var10002 = 10999400189259406L ^ ax;
      int axxxx = var10000 & 0xFF;
      var10001 = 4375;
      var10002 = 10999400189259406L ^ ax;
      int axxxxx = a & 0xFF;
      return new Color(axxx, axxxx, axxxxx, axx);
   }

   public static int bw(int color1, int color2, float fraction) {
      long ax = dec.a ^ 57822165781578L;
      short var10001 = 16427;
      long var10002 = 1554234641087853053L ^ ax;
      int var10000 = a >> 16;
      var10001 = 4375;
      var10002 = 11046368280355008L ^ ax;
      int axx = var10000 & 0xFF;
      var10001 = 8609;
      var10002 = 7336349673761542258L ^ ax;
      var10000 = a >> 8;
      var10001 = 4375;
      var10002 = 11046368280355008L ^ ax;
      int axxx = var10000 & 0xFF;
      var10001 = 4375;
      var10002 = 11046368280355008L ^ ax;
      int axxxx = a & 0xFF;
      var10001 = 16427;
      var10002 = 1554234641087853053L ^ ax;
      var10000 = a >> 16;
      var10001 = 4375;
      var10002 = 11046368280355008L ^ ax;
      int axxxxx = var10000 & 0xFF;
      var10001 = 8609;
      var10002 = 7336349673761542258L ^ ax;
      var10000 = a >> 8;
      var10001 = 4375;
      var10002 = 11046368280355008L ^ ax;
      int axxxxxx = var10000 & 0xFF;
      var10001 = 4375;
      var10002 = 11046368280355008L ^ ax;
      int axxxxxxx = a & 0xFF;
      int axxxxxxxx = (int)(axx + a * (axxxxx - axx));
      int axxxxxxxxx = (int)(axxx + a * (axxxxxx - axxx));
      int axxxxxxxxxx = (int)(axxxx + a * (axxxxxxx - axxxx));
      var10001 = 16427;
      var10002 = 1554234641087853053L ^ ax;
      var10000 = axxxxxxxx << 16;
      short var38 = 8609;
      long var10003 = 7336349673761542258L ^ ax;
      return var10000 | axxxxxxxxx << 8 | axxxxxxxxxx;
   }

   public static float[] eul(int color) {
      long ax = dec.a ^ 121585411596116L;
      short var10001 = 16427;
      long var10002 = 1554192850882110179L ^ ax;
      int var10000 = a >> 16;
      var10001 = 4375;
      var10002 = 11088158213731294L ^ ax;
      float axx = (var10000 & 0xFF) / 255.0F;
      var10001 = 8609;
      var10002 = 7336268318388405100L ^ ax;
      var10000 = a >> 8;
      var10001 = 4375;
      var10002 = 11088158213731294L ^ ax;
      float axxx = (var10000 & 0xFF) / 255.0F;
      var10001 = 4375;
      var10002 = 11088158213731294L ^ ax;
      float axxxx = (a & 0xFF) / 255.0F;
      var10001 = 12500;
      var10002 = 118040632395059738L ^ ax;
      var10000 = a >> 24;
      var10001 = 4375;
      var10002 = 11088158213731294L ^ ax;
      float axxxxx = (var10000 & 0xFF) / 255.0F;
      return new float[]{axx, axxx, axxxx, axxxxx};
   }

   public static Color gry(float[] colors) {
      return new Color(a[0], a[1], a[2], a[3]);
   }

   public static Color fqm(int speed, int index, Color start, Color end, boolean trueColor) {
      int var12;
      label23: {
         long ax = dec.a ^ 2305456001948L;
         int[] var10000 = dar.abu();
         int axx = (int)((System.currentTimeMillis() / a + a) % e);
         int[] axxx = var10000;
         var12 = axx;
         int var10001 = 2146;
         long var10002 = 2476897337468659301L ^ ax;
         var10001 = 180;
         if (axxx != null) {
            if (axx < 180) {
               var12 = axx;
               break label23;
            }

            short var11 = 7352;
            long var14 = 1328319530785092284L ^ ax;
            var12 = 360;
            var10001 = axx;
         }

         var12 -= var10001;
      }

      int var9 = var12 * 2;
      return a ? gno(a, a, var9 / 360.0F) : azi(a, a, var9 / 360.0F);
   }

   public static Double ffv(double oldValue, double newValue, double interpolationValue) {
      return a + (a - a) * a;
   }

   public static int dhh(int oldValue, int newValue, double interpolationValue) {
      return ffv(a, a, (float)a).intValue();
   }

   public static float fhy(float oldValue, float newValue, double interpolationValue) {
      return ffv(a, a, (float)a).floatValue();
   }

   public static Color ceu(Color color, int alpha) {
      return new Color(a.getRed(), a.getGreen(), a.getBlue(), a);
   }

   public static Color azi(Color color1, Color color2, float amount) {
      a = Math.min(1.0F, Math.max(0.0F, a));
      return new Color(dhh(a.getRed(), a.getRed(), a), dhh(a.getGreen(), a.getGreen(), a), dhh(a.getBlue(), a.getBlue(), a), dhh(a.getAlpha(), a.getAlpha(), a));
   }

   public static int[] ghd(int in) {
      long ax = dec.a ^ 17594146400110L;
      short var10001 = 16427;
      long var10002 = 1554274848679369433L ^ ax;
      int var10000 = a >> 16;
      var10001 = 4375;
      var10002 = 11006161727179748L ^ ax;
      int axx = var10000 & 0xFF;
      var10001 = 8609;
      var10002 = 7336319529823402838L ^ ax;
      var10000 = a >> 8;
      var10001 = 4375;
      var10002 = 11006161727179748L ^ ax;
      int axxx = var10000 & 0xFF;
      var10001 = 4375;
      var10002 = 11006161727179748L ^ ax;
      int axxxx = a & 0xFF;
      return new int[]{axx, axxx, axxxx};
   }

   public static Color gno(Color color1, Color color2, float amount) {
      a = Math.min(1.0F, Math.max(0.0F, a));
      float[] ax = Color.RGBtoHSB(a.getRed(), a.getGreen(), a.getBlue(), null);
      float[] axx = Color.RGBtoHSB(a.getRed(), a.getGreen(), a.getBlue(), null);
      Color axxx = Color.getHSBColor(fhy(ax[0], axx[0], a), fhy(ax[1], axx[1], a), fhy(ax[2], axx[2], a));
      return dpq(axxx, dhh(a.getAlpha(), a.getAlpha(), a) / 255.0F);
   }

   public static Color dpq(Color color, float opacity) {
      a = Math.min(1.0F, Math.max(0.0F, a));
      return new Color(a.getRed(), a.getGreen(), a.getBlue(), (int)(a.getAlpha() * a));
   }

   public static Color csw(int baseGrey, Color tintColor, double tintWeight) {
      long ax = dec.a ^ 82040014616469L;
      int axx = (int)(a + a.getRed() * a);
      int axxx = (int)(a + a.getGreen() * a);
      int axxxx = (int)(a + a.getBlue() * a);
      axx = Math.min(a<"w">(4375, 11048539784469279L ^ ax), Math.max(0, axx));
      axxx = Math.min(a<"w">(4375, 11048539784469279L ^ ax), Math.max(0, axxx));
      axxxx = Math.min(a<"w">(4375, 11048539784469279L ^ ax), Math.max(0, axxxx));
      return new Color(axx, axxx, axxxx);
   }

   public static void cjx(cdr[] var0) {
      aqh = var0;
   }

   public static cdr[] fi() {
      return aqh;
   }

   static {
      long var5 = a ^ 37234243614863L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var13 = new long[10];
      int var10 = 0;
      String var11 = "\u0019gßëÚ\u0005ª\u008eDèã¼§Â'FEý\u0086¶e3Låî\u001a£ó\u0096ðð\u0080æ\u0088\u0092*8¹\u0010\bzyq\u0015?ÔáßÄZ\u0013~k)\u0002âC°íp\u008aÕÿß";
      int var12 = "\u0019gßëÚ\u0005ª\u008eDèã¼§Â'FEý\u0086¶e3Låî\u001a£ó\u0096ðð\u0080æ\u0088\u0092*8¹\u0010\bzyq\u0015?ÔáßÄZ\u0013~k)\u0002âC°íp\u008aÕÿß"
         .length();
      byte var9 = 0;

      label41:
      while (true) {
         int var10001 = var9;
         var9 += 8;
         byte[] var14 = var11.substring(var10001, var9).getBytes("ISO-8859-1");
         long[] var19 = var13;
         var10001 = var10++;
         long var24 = (var14[0] & 255L) << 56
            | (var14[1] & 255L) << 48
            | (var14[2] & 255L) << 40
            | (var14[3] & 255L) << 32
            | (var14[4] & 255L) << 24
            | (var14[5] & 255L) << 16
            | (var14[6] & 255L) << 8
            | var14[7] & 255L;
         byte var28 = -1;

         while (true) {
            long var15 = var24;
            byte[] var17 = var7.doFinal(
               new byte[]{
                  (byte)(var15 >>> 56),
                  (byte)(var15 >>> 48),
                  (byte)(var15 >>> 40),
                  (byte)(var15 >>> 32),
                  (byte)(var15 >>> 24),
                  (byte)(var15 >>> 16),
                  (byte)(var15 >>> 8),
                  (byte)var15
               }
            );
            long var31 = (var17[0] & 255L) << 56
               | (var17[1] & 255L) << 48
               | (var17[2] & 255L) << 40
               | (var17[3] & 255L) << 32
               | (var17[4] & 255L) << 24
               | (var17[5] & 255L) << 16
               | (var17[6] & 255L) << 8
               | var17[7] & 255L;
            switch (var28) {
               case 0:
                  var19[var10001] = var31;
                  if (var9 >= var12) {
                     b = var13;
                     c = new Integer[10];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 31958158200165111L;
                     byte[] var4 = var0.doFinal(
                        new byte[]{
                           (byte)(var2 >>> 56),
                           (byte)(var2 >>> 48),
                           (byte)(var2 >>> 40),
                           (byte)(var2 >>> 32),
                           (byte)(var2 >>> 24),
                           (byte)(var2 >>> 16),
                           (byte)(var2 >>> 8),
                           (byte)var2
                        }
                     );
                     long var27 = (var4[0] & 255L) << 56
                        | (var4[1] & 255L) << 48
                        | (var4[2] & 255L) << 40
                        | (var4[3] & 255L) << 32
                        | (var4[4] & 255L) << 24
                        | (var4[5] & 255L) << 16
                        | (var4[6] & 255L) << 8
                        | var4[7] & 255L;
                     byte var23 = -1;
                     e = var27;
                     if (fi() == null) {
                        cjx(new cdr[1]);
                     }

                     return;
                  }
                  break;
               default:
                  var19[var10001] = var31;
                  if (var9 < var12) {
                     continue label41;
                  }

                  var11 = "SöIôÑÖ(½\u0019'dOJÙ\u0007\u0095";
                  var12 = "SöIôÑÖ(½\u0019'dOJÙ\u0007\u0095".length();
                  var9 = 0;
            }

            byte var22 = var9;
            var9 += 8;
            var14 = var11.substring(var22, var9).getBytes("ISO-8859-1");
            var19 = var13;
            var10001 = var10++;
            var24 = (var14[0] & 255L) << 56
               | (var14[1] & 255L) << 48
               | (var14[2] & 255L) << 40
               | (var14[3] & 255L) << 32
               | (var14[4] & 255L) << 24
               | (var14[5] & 255L) << 16
               | (var14[6] & 255L) << 8
               | var14[7] & 255L;
            var28 = 0;
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26282;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/dec", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/dec" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
