package cc.astralis;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class en {
   public dzk fjz;
   public cbm cat;
   private final erp elm;
   public int dxb;
   private static final long a = 1129189496954L;
   private static final long b;

   en() {
      long a = en.a ^ 26402791561112L;
      super();
      a.elm = new erp(dtw.EASE_IN_OUT_QUAD, b);
   }

   public static fnb etn() {
      return new fnb();
   }

   public dzk dia() {
      return a.fjz;
   }

   public cbm gcf() {
      return a.cat;
   }

   public erp erd() {
      return a.elm;
   }

   public int czv() {
      return a.dxb;
   }

   public void gvi(dzk notification) {
      a.fjz = a;
   }

   public void dat(cbm notificationTime) {
      a.cat = a;
   }

   public void acx(int time) {
      a.dxb = a;
   }

   static {
      long var0 = a ^ 43220649224680L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 7498182781041178699L;
      byte[] var6 = var2.doFinal(
         new byte[]{
            (byte)(var4 >>> 56),
            (byte)(var4 >>> 48),
            (byte)(var4 >>> 40),
            (byte)(var4 >>> 32),
            (byte)(var4 >>> 24),
            (byte)(var4 >>> 16),
            (byte)(var4 >>> 8),
            (byte)var4
         }
      );
      long var7 = (var6[0] & 255L) << 56
         | (var6[1] & 255L) << 48
         | (var6[2] & 255L) << 40
         | (var6[3] & 255L) << 32
         | (var6[4] & 255L) << 24
         | (var6[5] & 255L) << 16
         | (var6[6] & 255L) << 8
         | var6[7] & 255L;
      byte var10001 = -1;
      b = var7;
   }
}
