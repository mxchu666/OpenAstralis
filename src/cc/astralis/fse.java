package cc.astralis;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fse {
   public String gdd;
   public String bxw;
   private static int[] btm;
   private static final long a = 138395396106947L;
   private static final long b;

   public String ctg() {
      return a.gdd;
   }

   public String fno() {
      return a.bxw;
   }

   public void bnc(String name) {
      a.gdd = a;
   }

   public void dnv(String description) {
      a.bxw = a;
   }

   public fse(String name, String description) {
      long ax = fse.a ^ 40517696339819L;
      long axx = b;
      int[] var10000 = glz();
      super();
      a.gdd = a;
      int[] var7 = var10000;
      a.bxw = a;
      if (var7 != null) {
         cdr.apm(new String[5]);
      }
   }

   public static void bmj(int[] var0) {
      btm = var0;
   }

   public static int[] glz() {
      return btm;
   }

   static {
      long var0 = a ^ 97517091539496L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 8089269389836294800L;
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
      if (glz() != null) {
         bmj(new int[4]);
      }
   }
}
