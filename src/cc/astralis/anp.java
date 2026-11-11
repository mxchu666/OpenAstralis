package cc.astralis;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class anp extends hcr {
   private int dkr;
   private static final long a = 42578052491949L;
   private static final String d;

   public anp(guu parentClass) {
      long ax = anp.a ^ 126919728360227L;
      super(a, d);
   }

   @Override
   public void dil() {
      a.dkr = 0;
      super.dil();
   }

   @gdz
   public void bfh(eih event) {
      int var5;
      label25: {
         long ax = anp.a ^ 86070059749683L;
         int[] var10000 = dar.abu();
         evd.dek(0.5);
         int[] var4 = var10000;
         var5 = chi.field_1690.field_1903.method_1434();
         if (var4 != null) {
            if (var5 != 0) {
               var5 = 1;
               break label25;
            }

            var5 = chi.field_1690.field_1832.method_1434();
         }

         if (var4 != null) {
            var5 = var5 != 0 ? -1 : 0;
         }
      }

      bav.fym(var5);
   }

   static {
      long var0 = a ^ 73666346758421L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Old Mush".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      d = var5;
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
