package cc.astralis;

import imgui.type.ImFloat;
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

public class ffz extends bmd {
   private final bes aeb;
   private boolean cfz;
   private static final int dkt;
   private static final Color aot;
   private static final long a = 46391267271958L;
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   public ffz(bes property, float width, float height) {
      a.aeb = a;
      a.fqg(a);
      a.fuo(a);
   }

   @Override
   public void ckn(float x, float y, float mouseX, float mouseY) {
      long ax = ffz.a ^ 54392747049461L;
      a.fji(a);
      a.axc(a);
      fll axx = bxc.emc(b, a<"l">(21419, 4629143144448681979L ^ ax));
      int[] var10000 = dar.abu();
      axx.aof(a.aeb.fah(), a + 6.0F, a + 4.0F, cbc.fgl);
      String axxx = String.valueOf(a.aeb.dnp());
      int[] axxxx = var10000;
      axx.aof(axxx, a + a.arq() - (axx.eq(axxx) + 6.0F), a + 4.0F, cbc.fgl);
      float axxxxx = a.arq() - 12.0F;
      float axxxxxx = (a.aeb.dnp().floatValue() - a.aeb.cpl()) / (a.aeb.hgz() - a.aeb.cpl());
      if (axxxx != null) {
         if (a.cfz) {
            float axxxxxxx = Math.min(1.0F, Math.max(0.0F, (a - (a + 6.0F)) / axxxxx));
            double axxxxxxxx = ftb.ggt(a.aeb.cpl().floatValue(), a.aeb.hgz().floatValue(), axxxxxxx);
            axxxxxxxx = a.hhb(axxxxxxxx, a.aeb.dvc());
            a.aeb.gbf(new ImFloat((float)axxxxxxxx));
         }

         dmp.cpp(a + 6.0F, a + super.ajg(), axxxxx, 7.0F, 2.0F, aot);
         dmp.aho(a + 6.0F, a + super.ajg(), axxxxx * axxxxxx, 7.0F, 2.0F, dar.gqy().deo(), dar.gqy().cxj(), false);
      }
   }

   @Override
   public void gdj(double mouseX, double mouseY, int button) {
      long ax = ffz.a ^ 60674511228025L;
      if (fuv.bfm(a, a, a.aqy(), a.gpn(), a.arq(), a.ajg())) {
         a.cfz = true;
      }
   }

   @Override
   public void euk(double mouseX, double mouseY, int button) {
      a.cfz = false;
   }

   @Override
   public float ajg() {
      return super.ajg() + 4.0F + 7.0F;
   }

   private double hhb(double a, float a) {
      long ax = ffz.a ^ 1554043445496L;
      int[] var6 = dar.abu();
      float var10000 = a;
      float var10001 = 0.0F;
      if (var6 != null) {
         if (a == 0.0F) {
            return a;
         }

         var10000 = (float)Math.round(a / a);
         var10001 = a;
      }

      double var7 = var10000 * var10001;
      short var8 = 8323;
      long var10002 = 2715962307039229407L ^ ax;
      return ftb.hbp(var7, 6);
   }

   static {
      long var14 = a ^ 135173417962802L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)(var14 << var12 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var13 = var11.doFinal("Sf-Ui".getBytes("ISO-8859-1"));
      String var24 = a(var13).intern();
      int var10001 = -1;
      b = var24;
      e = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[5];
      int var3 = 0;
      String var4 = "ü³\u0094\u0014\u0092q\u00973\r\u000f!¡\t\u0007Þ\u001d§B0\u0013í0\b¯";
      int var5 = "ü³\u0094\u0014\u0092q\u00973\r\u000f!¡\t\u0007Þ\u001d§B0\u0013í0\b¯".length();
      byte var2 = 0;

      label29:
      while (true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var18 = var6;
         var10001 = var3++;
         long var26 = (var7[0] & 255L) << 56
            | (var7[1] & 255L) << 48
            | (var7[2] & 255L) << 40
            | (var7[3] & 255L) << 32
            | (var7[4] & 255L) << 24
            | (var7[5] & 255L) << 16
            | (var7[6] & 255L) << 8
            | var7[7] & 255L;
         byte var30 = -1;

         while (true) {
            long var8 = var26;
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
            long var33 = (var10[0] & 255L) << 56
               | (var10[1] & 255L) << 48
               | (var10[2] & 255L) << 40
               | (var10[3] & 255L) << 32
               | (var10[4] & 255L) << 24
               | (var10[5] & 255L) << 16
               | (var10[6] & 255L) << 8
               | var10[7] & 255L;
            switch (var30) {
               case 0:
                  var18[var10001] = var33;
                  if (var2 >= var5) {
                     c = var6;
                     d = new Integer[5];
                     short var19 = 7653;
                     long var23 = var14 ^ 7489852931418744177L;
                     dkt = 7;
                     int var28 = a<"l">(21826, 6452618031911710162L ^ var14);
                     short var32 = 4117;
                     var33 = 5452484351073839232L ^ var14;
                     short var35 = 4117;
                     long var10005 = 5452484351073839232L ^ var14;
                     aot = new Color(var28, 40, 40);
                     return;
                  }
                  break;
               default:
                  var18[var10001] = var33;
                  if (var2 < var5) {
                     continue label29;
                  }

                  var4 = "B\u001aà»òV!ñ\b\u0004FÓÏ\n\u001c·";
                  var5 = "B\u001aà»òV!ñ\b\u0004FÓÏ\n\u001c·".length();
                  var2 = 0;
            }

            byte var22 = var2;
            var2 += 8;
            var7 = var4.substring(var22, var2).getBytes("ISO-8859-1");
            var18 = var6;
            var10001 = var3++;
            var26 = (var7[0] & 255L) << 56
               | (var7[1] & 255L) << 48
               | (var7[2] & 255L) << 40
               | (var7[3] & 255L) << 32
               | (var7[4] & 255L) << 24
               | (var7[5] & 255L) << 16
               | (var7[6] & 255L) << 8
               | var7[7] & 255L;
            var30 = 0;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20656;
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
            throw new RuntimeException("cc/astralis/ffz", var14);
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
         throw new RuntimeException("cc/astralis/ffz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
