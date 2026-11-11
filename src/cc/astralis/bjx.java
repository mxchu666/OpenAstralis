package cc.astralis;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bjx extends hcr {
   private final efx gjw;
   private static final long a = 41148518382015L;
   private static final String d;

   public bjx(guu parentClass) {
      long ax = bjx.a ^ 109896816399372L;
      super(a, d);
      a.gjw = (efx)a.clv();
   }

   @gdz
   public void dst(eih event) {
      long ax = bjx.a ^ 66661120779024L;
      int[] var10000 = dar.abu();
      eky axx = dar.gqy().aws().diy(eky.class);
      int[] axxx = var10000;
      boolean var6 = chi.field_1690.field_1903.method_1434();
      if (axxx != null) {
         if (var6) {
            return;
         }

         var6 = evd.bpi();
      }

      if (axxx != null) {
         if (var6) {
            chi.field_1724
               .method_18800(
                  chi.field_1724.method_18798().field_1352 * 0.98, chi.field_1724.method_18798().field_1351, chi.field_1724.method_18798().field_1350 * 0.98
               );
         }

         var6 = evd.fsj();
      }

      label47: {
         label54: {
            if (axxx != null) {
               if (!var6) {
                  return;
               }

               var7 = axx;
               if (axxx == null) {
                  break label54;
               }

               var6 = axx.dsv();
            }

            if (!var6) {
               break label47;
            }

            var7 = axx;
         }

         var7.gxo();
      }

      chi.field_1724
         .method_18800(chi.field_1724.method_18798().field_1352 * 0.5, chi.field_1724.method_18798().field_1351, chi.field_1724.method_18798().field_1350 * 0.5);
   }

   static {
      long var0 = a ^ 115952230733231L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Watchdog Safe".getBytes("ISO-8859-1"));
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
