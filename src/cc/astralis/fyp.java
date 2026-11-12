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

class fyp {
   private final float aag;
   private final float fgu;
   private final erp apg;
   private final erp fjf;
   private final Color afs;
   private final Color frs;
   private static final long a = 62814347157644L;
   private static final long[] b;
   private static final Long[] c;
   private static final Map d = new HashMap(13);

   public fyp(float x, float y) {
      long ax = fyp.a ^ 87449218913892L;
      super();
      a.aag = a;
      a.fgu = a;
      a.afs = dar.gqy().deo();
      a.frs = dar.gqy().cxj();
      short var10004 = 13100;
      long var10005 = 6372972534865142963L ^ ax;
      a.apg = new erp(dtw.EASE_OUT_BACK, 800L);
      var10004 = 14253;
      var10005 = 5872098799670108211L ^ ax;
      a.fjf = new erp(dtw.EASE_IN_OUT_QUAD, 800L);
      a.apg.bpt(0.0);
      a.apg.gbi(10.0);
      a.apg.enr(0.0);
      a.fjf.bpt(1.0);
      a.fjf.gbi(0.0);
      a.fjf.enr(1.0);
   }

   public void env() {
      a.apg.dwm(a.apg.hfn());
      a.fjf.dwm(a.fjf.hfn());
   }

   public boolean elp() {
      long a = fyp.a ^ 51960410224560L;
      int[] var3 = dar.abu();
      boolean var10000 = a.apg.flo();
      if (var3 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = a.fjf.flo();
      }

      return var3 == null ? var10000 : var10000;
   }

   public void flv() {
      long a = fyp.a ^ 32528015341719L;
      int[] var10000 = dar.abu();
      float ax = (float)a.apg.hjo();
      int[] axx = var10000;
      float axxx = (float)a.fjf.hjo();
      float var8;
      int var6 = (var8 = axxx - 0.01F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
      if (axx != null) {
         if (var6 <= 0) {
            return;
         }

         float var9;
         var6 = (var9 = ax - 0.0F) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
      }

      if (axx != null) {
         if (var6 <= 0) {
            return;
         }

         dmp.ery(a.aag, a.fgu, ax, 2.5F, new Color(a.afs.getRed(), a.afs.getGreen(), a.afs.getBlue(), (int)(axxx * 120.0F)));
         float var10;
         var6 = (var10 = ax - 10.0F) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
      }

      if (axx != null) {
         if (var6 > 0) {
            dmp.ery(a.aag, a.fgu, ax * 0.6F, 1.5F, new Color(a.frs.getRed(), a.frs.getGreen(), a.frs.getBlue(), (int)(axxx * 80.0F)));
         }

         float var11;
         var6 = (var11 = ax - 3.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
      }

      float var10001;
      label64: {
         if (axx != null) {
            if (var6 < 0) {
               dmp.baq(a.aag, a.fgu, Math.max(1.0F, ax * 0.1F), new Color(a.afs.getRed(), a.afs.getGreen(), a.afs.getBlue(), (int)(axxx * 200.0F)));
            }

            var7 = ax;
            var10001 = 7.0F;
            if (axx == null) {
               break label64;
            }

            float var12;
            var6 = (var12 = ax - 7.0F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
         }

         if (var6 <= 0) {
            return;
         }

         var7 = a.aag;
         var10001 = a.fgu;
      }

      dmp.ery(var7, var10001, ax * 1.2F, 1.0F, new Color(a.afs.getRed(), a.afs.getGreen(), a.afs.getBlue(), (int)(axxx * 40.0F)));
   }

   static {
      long var0 = a ^ 133995122795019L;
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
      String var6 = "ÓÀÃ±~ö\u008e[\r*4\u0097\u000fÎ\u0090í";
      int var7 = "ÓÀÃ±~ö\u008e[\r*4\u0097\u000fÎ\u0090í".length();
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
      c = new Long[2];
   }

   private static long a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24950;
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
            throw new RuntimeException("cc/astralis/fyp", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         c[var3] = var15;
      }

      return c[var3];
   }

   private static long a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = a(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
         throw new RuntimeException("cc/astralis/fyp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
