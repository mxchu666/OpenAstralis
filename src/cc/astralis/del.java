package cc.astralis;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_304;

public class del extends hcr {
   private final dke bvm;
   private static final long a = 54222671095342L;
   private static final String d;

   public del(guu parentClass) {
      long ax = del.a ^ 39771370654660L;
      super(a, d);
      a.bvm = (dke)a;
   }

   @gdz
   public void gvy(fxx e) {
      long ax = del.a ^ 120125840596513L;
      int[] var4 = dar.abu();
      if (chi.field_1755 != null) {
         boolean var10000 = a.bvm.ech();
         if (var4 != null) {
            if (!var10000) {
               return;
            }

            class_304.method_1424();
            var10000 = a.bvm.gfw.dnp();
         }

         if (var4 != null) {
            if (!var10000) {
               chi.field_1690.field_1903.method_23481(false);
            }

            var10000 = a.bvm.dfl.dnp();
         }

         if (var4 != null) {
            if (!var10000) {
               chi.field_1690.field_1832.method_23481(false);
            }

            var10000 = a.bvm.fvw.dnp();
         }

         if (!var10000) {
            chi.field_1690.field_1867.method_23481(false);
            chi.field_1724.method_5728(false);
         }
      }
   }

   static {
      long var0 = a ^ 103133145433658L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Vanilla".getBytes("ISO-8859-1"));
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
