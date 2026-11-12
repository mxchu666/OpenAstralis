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

public class crb extends bmd {
   private final acn goq;
   private static final int arq;
   private float csp;
   private float byo;
   private float csw = 0.0F;
   private boolean gea;
   private boolean ee;
   private boolean gsu;
   private static final int esx;
   private static final int ex;
   private static final long a = 123002813673263L;
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   public crb(acn property, float width, float height) {
      a.goq = a;
      a.fqg(a);
      a.fuo(a);
   }

   @Override
   public void ckn(float x, float y, float mouseX, float mouseY) {
      long ax = crb.a ^ 128195384806348L;
      int[] var10000 = dar.abu();
      a.fji(a);
      a.axc(a);
      short var10002 = 25381;
      long var10003 = 8171062741799019034L ^ ax;
      fll axx = bxc.emc(b, 10);
      axx.aof(a.goq.fah(), a + 6.0F, a + 4.0F, cbc.fgl);
      float axxx = super.ajg() - 6.0F;
      dmp.cpp(a + a.arq() - (axxx + 6.0F), a + 3.0F, axxx, axxx, 2.0F, a.goq.dnp());
      float axxxx = a.aqy() - 1.0F + 8.0F;
      float axxxxx = a.gpn() + super.ajg();
      int[] axxxxxx = var10000;
      elz(axxxx, axxxxx, 80.0F, 80.0F, a.csw);
      float var14 = axxxx + a.csp - 4.0F;
      float var10001 = axxxxx + a.byo - 4.0F;
      short var10007 = 4748;
      long var10008 = 5228943657491747767L ^ ax;
      byte var16 = 4;
      long var10009 = 4201407861938241848L ^ ax;
      byte var17 = 4;
      long var10010 = 4201407861938241848L ^ ax;
      short var18 = 10044;
      long var10011 = 6906433462177621510L ^ ax;
      dmp.cpp(var14, var10001, 8.0F, 8.0F, 4.0F, new Color(255, 255, 255, 200));
      float axxxxxxx = axxxxx + 80.0F + 4.0F;
      dxy(axxxx, axxxxxxx, 80.0F, 10.0F);
      float axxxxxxxx = axxxx + a.csw * 80.0F;
      dmp.cpp(axxxxxxxx - 1.0F, axxxxxxx - 2.0F, 2.0F, 14.0F, 1.0F, Color.WHITE);
      crb var15 = a;
      if (axxxxxx != null) {
         if (!a.gea) {
            return;
         }

         var15 = a;
      }

      var15.ead(a, a);
   }

   @Override
   public void gdj(double mouseX, double mouseY, int button) {
      long ax = crb.a ^ 126175379850816L;
      int[] var10000 = dar.abu();
      a.gea = true;
      float axx = a.aqy() - 1.0F + 8.0F;
      int[] axxx = var10000;
      float axxxx = a.gpn() + super.ajg();
      boolean var11 = fuv.bfm(a, a, axx, axxxx, 80.0F, 80.0F);
      if (axxx != null) {
         if (var11) {
            a.ee = true;
            if (axxx != null) {
               return;
            }
         }

         var11 = fuv.bfm(a, a, axx, axxxx + 80.0F + 4.0F, 80.0F, 10.0F);
      }

      if (var11) {
         a.gsu = true;
      }
   }

   @Override
   public void euk(double mouseX, double mouseY, int button) {
      a.gea = a.ee = a.gsu = false;
   }

   @Override
   public float ajg() {
      return super.ajg() + 8.0F + 80.0F + 10.0F;
   }

   private void ead(double a, double a) {
      crb var17;
      label31: {
         long ax = crb.a ^ 89873368194421L;
         float axx = a.aqy() - 1.0F + 8.0F;
         int[] var10000 = dar.abu();
         float axxx = a.gpn() + super.ajg();
         int[] axxxx = var10000;
         boolean var16 = a.ee;
         if (axxxx != null) {
            if (a.ee) {
               a = Math.clamp(a, (double)axx, (double)(axx + 80.0F));
               a = Math.clamp(a, (double)axxx, (double)(axxx + 80.0F));
               a.csp = (float)(a - axx);
               a.byo = (float)(a - axxx);
               float axxxxx = a.csp / 80.0F;
               float axxxxxx = 1.0F - a.byo / 80.0F;
               a.goq.gbf(Color.getHSBColor(a.csw, axxxxx, axxxxxx));
               if (axxxx != null) {
                  return;
               }
            }

            var17 = a;
            if (axxxx == null) {
               break label31;
            }

            var16 = a.gsu;
         }

         if (!var16) {
            return;
         }

         a = Math.clamp(a, (double)axx, (double)(axx + 80.0F));
         a.csw = (float)(a - axx) / 80.0F;
         a.csw = Math.max(0.0F, Math.min(1.0F, a.csw));
         var17 = a;
      }

      float axxxxx = var17.csp / 80.0F;
      float axxxxxx = 1.0F - a.byo / 80.0F;
      a.goq.gbf(Color.getHSBColor(a.csw, axxxxx, axxxxxx));
   }

   public static void elz(float x, float y, float w, float h, float hue) {
      long ax = crb.a ^ 39485850501040L;
      int[] var10000 = dar.abu();
      int axx = 0;
      int[] axxx = var10000;

      while (axx < a) {
         int axxxx = 0;

         while (true) {
            if (axxxx < a) {
               float axxxxx = axx / a;
               float axxxxxx = 1.0F - axxxx / a;
               Color axxxxxxx = Color.getHSBColor(a, axxxxx, axxxxxx);
               dmp.eq(a + axx, a + axxxx, axxxxxxx);
               axxxx++;
               if (axxx == null) {
                  break;
               }

               if (axxx != null) {
                  continue;
               }
            }

            axx++;
            break;
         }

         if (axxx == null) {
            break;
         }
      }
   }

   public static void dxy(float x, float y, float w, float h) {
      long ax = crb.a ^ 62220775244975L;
      int[] var10000 = dar.abu();
      int axx = 0;
      int[] axxx = var10000;

      while (axx < a) {
         float axxxx = axx / a;
         Color axxxxx = Color.getHSBColor(axxxx, 1.0F, 1.0F);
         dmp.euv(a + axx, a, 1.0F, a, axxxxx);
         axx++;
         if (axxx == null) {
            break;
         }
      }
   }

   static {
      long var11 = a ^ 37129288897194L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("Sf-Ui".getBytes("ISO-8859-1"));
      String var28 = a(var15).intern();
      int var10001 = -1;
      b = var28;
      e = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[7];
      int var3 = 0;
      String var4 = "ë(¿\u0018ºg>^8wg|u»\u0016Ë\u00122îì«6\u0018;Q]!êß\u0087\u0094\u008a2.Î\u009f\u0092:y1";
      int var5 = "ë(¿\u0018ºg>^8wg|u»\u0016Ë\u00122îì«6\u0018;Q]!êß\u0087\u0094\u008a2.Î\u009f\u0092:y1".length();
      byte var2 = 0;

      label29:
      while (true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var18 = var6;
         var10001 = var3++;
         long var30 = (var7[0] & 255L) << 56
            | (var7[1] & 255L) << 48
            | (var7[2] & 255L) << 40
            | (var7[3] & 255L) << 32
            | (var7[4] & 255L) << 24
            | (var7[5] & 255L) << 16
            | (var7[6] & 255L) << 8
            | var7[7] & 255L;
         byte var33 = -1;

         while (true) {
            long var8 = var30;
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
            long var35 = (var10[0] & 255L) << 56
               | (var10[1] & 255L) << 48
               | (var10[2] & 255L) << 40
               | (var10[3] & 255L) << 32
               | (var10[4] & 255L) << 24
               | (var10[5] & 255L) << 16
               | (var10[6] & 255L) << 8
               | var10[7] & 255L;
            switch (var33) {
               case 0:
                  var18[var10001] = var35;
                  if (var2 >= var5) {
                     c = var6;
                     d = new Integer[7];
                     short var19 = 937;
                     long var25 = var11 ^ 5009026131473406966L;
                     arq = 10;
                     short var20 = 31932;
                     long var26 = var11 ^ 7117201529858974948L;
                     ex = 3;
                     short var21 = 30657;
                     long var27 = var11 ^ 881515052834746266L;
                     esx = 80;
                     return;
                  }
                  break;
               default:
                  var18[var10001] = var35;
                  if (var2 < var5) {
                     continue label29;
                  }

                  var4 = "Âi$k6\u009cÜùe\u008dû,\u008e\"QL";
                  var5 = "Âi$k6\u009cÜùe\u008dû,\u008e\"QL".length();
                  var2 = 0;
            }

            byte var24 = var2;
            var2 += 8;
            var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
            var18 = var6;
            var10001 = var3++;
            var30 = (var7[0] & 255L) << 56
               | (var7[1] & 255L) << 48
               | (var7[2] & 255L) << 40
               | (var7[3] & 255L) << 32
               | (var7[4] & 255L) << 24
               | (var7[5] & 255L) << 16
               | (var7[6] & 255L) << 8
               | var7[7] & 255L;
            var33 = 0;
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9692;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/crb", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
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
         throw new RuntimeException("cc/astralis/crb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
