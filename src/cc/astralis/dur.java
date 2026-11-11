package cc.astralis;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class dur extends guu {
   private final gbp czg;
   private static final long a = 134639318277804L;
   private static final String g;

   public dur() {
      long a = dur.a ^ 75779968184376L;
      super(bfm.COMBAT);
      a.czg = new gbp(g, false);
      a.beb(a.czg);
   }

   @gdz
   public void afz(gwj event) {
      label20: {
         long ax = dur.a ^ 128517466593331L;
         int[] var4 = dar.abu();
         boolean var10000 = a.czg.dnp();
         if (var4 != null) {
            if (!var10000) {
               break label20;
            }

            var10000 = chi.field_1724.method_24828();
         }

         if (!var10000) {
            return;
         }
      }

      a.gmm(true);
   }

   static {
      long var0 = a ^ 50636300982662L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Ground Only".getBytes("ISO-8859-1"));
      String var5 = d(var4).intern();
      byte var10001 = -1;
      g = var5;
   }

   private static String d(byte[] var0) {
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
