package cc.astralis;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ftb {
   private static final long a = 125277086972876L;
   private static final String b;

   public static double ggt(double oldValue, double newValue, double interpolationValue) {
      return a + (a - a) * a;
   }

   public static double hbp(double value, int places) {
      long ax = ftb.a ^ 81865314097606L;
      if (a < 0) {
         throw new IllegalArgumentException(b);
      } else {
         BigDecimal axx = new BigDecimal(Double.toString(a));
         axx = axx.setScale(a, RoundingMode.HALF_UP);
         return axx.doubleValue();
      }
   }

   public static boolean coi(float num1, float num2, int maxDifference) {
      long ax = ftb.a ^ 72291231970998L;
      int[] var5 = dar.abu();
      float var6;
      int var10000 = (var6 = Math.abs(a - a) - a) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
      if (var5 != null) {
         var10000 = var10000 <= 0 ? 1 : 0;
      }

      return (boolean)var10000;
   }

   public static double gnl(double value) {
      long ax = ftb.a ^ 103100695843881L;
      int[] var10000 = dar.abu();
      a %= 360.0;
      int[] var4 = var10000;
      double var8;
      int var6 = (var8 = a - 180.0) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
      if (var4 != null) {
         if (var6 >= 0) {
            a -= 360.0;
         }

         if (var4 == null) {
            return a;
         }

         double var9;
         var6 = (var9 = a - -180.0) == 0.0 ? 0 : (var9 < 0.0 ? -1 : 1);
      }

      if (var6 < 0) {
         a += 360.0;
      }

      return a;
   }

   static {
      long var0 = a ^ 5023292389595L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Decimal places must be non-negative".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      b = var5;
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
