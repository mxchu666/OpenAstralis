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

public class dgi extends fig {
   private final gbp byy;
   private static final long a = 16479411614702L;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public dgi(gbp booleanProperty) {
      a.byy = a;
      a.dtq(a);
      a.hh(130.0F);
      a.cje(15.0F);
   }

   @Override
   public void bfi(float mouseX, float mouseY) {
      float ax;
      float var9;
      label17: {
         long axx = dgi.a ^ 120279297564125L;
         ety.ebb(a.byy.fah(), a.hjg() + 4.0F, a.dtt() + 4.0F, Color.WHITE);
         float axxx = a.hjg() + a.av() - 30.0F;
         int[] var10000 = dar.abu();
         ax = a.dtt() + 2.0F;
         int[] axxxx = var10000;
         var9 = axxx;
         float var10001 = ax;
         if (axxxx != null) {
            short var10007 = 10164;
            long var10008 = 1076010379563703728L ^ axx;
            short var10 = 14263;
            long var10009 = 5112989930072575410L ^ axx;
            short var11 = 14263;
            long var10010 = 5112989930072575410L ^ axx;
            dmp.cpp(axxx, ax, 25.0F, 12.0F, 5.0F, new Color(50, 50, 50));
            if (!a.byy.dnp()) {
               var9 = axxx;
               break label17;
            }

            var9 = axxx;
            var10001 = 15.0F;
         }

         var9 += var10001;
      }

      dmp.cpp(var9, ax + 1.0F, 10.0F, 10.0F, 4.0F, dar.gqy().deo());
   }

   @Override
   public void apy(double mouseX, double mouseY, int button) {
      long ax = dgi.a ^ 29906972424489L;
      float axx = a.hjg() + a.av() - 30.0F;
      int[] var10000 = dar.abu();
      float axxx = a.dtt() + 2.5F;
      int[] axxxx = var10000;
      if (fuv.bfm(a, a, a.byy.dnp() ? axx + 15.0F : axx, axxx + 1.0F, 10.0F, 10.0F)) {
         gbp var11 = a.byy;
         boolean var10001 = a.byy.dnp();
         if (axxxx != null) {
            var10001 = !var10001;
         }

         var11.gbf(var10001);
      }
   }

   static {
      long var0 = a ^ 127637100757740L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[2];
      int var5 = 0;
      String var6 = "\u0083\u000fÉÓ»ÜY)zoÔCI)\fÕ";
      int var7 = "\u0083\u000fÉÓ»ÜY)zoÔCI)\fÕ".length();
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
      c = new Integer[2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5174;
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
            throw new RuntimeException("cc/astralis/dgi", var14);
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
         throw new RuntimeException("cc/astralis/dgi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
