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

public class ft extends fig {
   private final bes fyp;
   private boolean fmr;
   private static int[] bxd;
   private static final long a = 29786800958051L;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public ft(bes numberProperty) {
      a.fyp = a;
      a.dtq(a);
      a.hh(121.0F);
      a.cje(15.0F);
   }

   @Override
   public void bfi(float mouseX, float mouseY) {
      long ax = ft.a ^ 132556012323920L;
      int[] var10000 = dar.abu();
      float axx = (a.fyp.dnp().floatValue() - a.fyp.cpl()) / (a.fyp.hgz() - a.fyp.cpl());
      int[] axxx = var10000;
      ft var18 = a;
      if (axxx != null) {
         if (a.fmr) {
            float axxxx = Math.min(1.0F, Math.max(0.0F, (a - a.hjg()) / a.av()));
            double axxxxx = ftb.ggt(a.fyp.cpl().floatValue(), a.fyp.hgz().floatValue(), axxxx);
            axxxxx = a.bef(axxxxx, a.fyp.dvc());
            a.fyp.gbf(new ImFloat((float)axxxxx));
         }

         var18 = a;
      }

      float axxxx = var18.dtt() + 10.0F;
      float axxxxx = a.hjg() + 4.0F;
      float axxxxxx = a.av();
      short var10007 = 4426;
      long var10008 = 8512050522188184974L ^ ax;
      short var19 = 21207;
      long var10009 = 1382640993780907536L ^ ax;
      short var20 = 21207;
      long var10010 = 1382640993780907536L ^ ax;
      dmp.cpp(axxxxx, axxxx, axxxxxx, 4.0F, 2.0F, new Color(50, 50, 50));
      float axxxxxxx = a.av();
      dmp.abh(axxxxx, axxxx, axxxxxxx * axx, 4.0F, () -> dmp.aho(a, a, a, 4.0F, 2.0F, dar.gqy().deo(), dar.gqy().cxj(), false));
      float axxxxxxxx = axxxxx + (axxxxxx - 7.0F) * axx;
      dmp.cpp(axxxxxxxx, a.dtt() + 8.0F, 7.0F, 7.0F, 3.0F, dar.gqy().deo());
      String axxxxxxxxx = a.fyp.fah() + " " + a.fyp.dnp().floatValue();
      float axxxxxxxxxx = ety.eq(axxxxxxxxx);
      float axxxxxxxxxxx = axxxxx + (axxxxxx - axxxxxxxxxx) / 2.0F;
      ety.ebb(axxxxxxxxx, axxxxxxxxxxx, a.dtt() - 1.0F, Color.WHITE);
   }

   @Override
   public void apy(double mouseX, double mouseY, int button) {
      long ax = ft.a ^ 16324847640740L;
      int[] var8 = dar.abu();
      int var10000 = fuv.bfm(a, a, a.hjg(), a.dtt() + 8.0F, a.av(), 6.0F);
      if (var8 != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = a;
      }

      if (var10000 == 0) {
         a.fmr = true;
      }
   }

   @Override
   public void epq(double mouseX, double mouseY, int button) {
      long ax = ft.a ^ 38701825407660L;
      int[] var8 = dar.abu();
      ft var10000 = a;
      if (var8 != null) {
         if (!a.fmr) {
            return;
         }

         var10000 = a;
      }

      var10000.fmr = false;
   }

   private double bef(double a, float a) {
      long ax = ft.a ^ 9883455597816L;
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
      short var8 = 7197;
      long var10002 = 6958163316820203632L ^ ax;
      return ftb.hbp(var7, 6);
   }

   public static void ckg(int[] var0) {
      bxd = var0;
   }

   public static int[] cco() {
      return bxd;
   }

   static {
      long var0 = a ^ 117431515742271L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[3];
      int var5 = 0;
      String var6 = "\u0004Pe¨\u0010ìw\u0019ôz¶f\u0085»\u001f\u0093`ÖÛ\u0014\u001c¯Î¯";
      int var7 = "\u0004Pe¨\u0010ìw\u0019ôz¶f\u0085»\u001f\u0093`ÖÛ\u0014\u001c¯Î¯".length();
      byte var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = (var9[0] & 255L) << 56
            | (var9[1] & 255L) << 48
            | (var9[2] & 255L) << 40
            | (var9[3] & 255L) << 32
            | (var9[4] & 255L) << 24
            | (var9[5] & 255L) << 16
            | (var9[6] & 255L) << 8
            | var9[7] & 255L;
         byte[] var12 = var2.doFinal(
            new byte[]{
               (byte)(var10 >>> 56),
               (byte)(var10 >>> 48),
               (byte)(var10 >>> 40),
               (byte)(var10 >>> 32),
               (byte)(var10 >>> 24),
               (byte)(var10 >>> 16),
               (byte)(var10 >>> 8),
               (byte)var10
            }
         );
         long var10004 = (var12[0] & 255L) << 56
            | (var12[1] & 255L) << 48
            | (var12[2] & 255L) << 40
            | (var12[3] & 255L) << 32
            | (var12[4] & 255L) << 24
            | (var12[5] & 255L) << 16
            | (var12[6] & 255L) << 8
            | var12[7] & 255L;
         byte var14 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      b = var8;
      c = new Integer[3];
      if (cco() != null) {
         ckg(new int[5]);
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17142;
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
            throw new RuntimeException("cc/astralis/ft", var14);
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
         throw new RuntimeException("cc/astralis/ft" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
