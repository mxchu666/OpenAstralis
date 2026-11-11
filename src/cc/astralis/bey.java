package cc.astralis;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2596;
import net.minecraft.class_2848;
import net.minecraft.class_2848.class_2849;

public class bey extends hcr {
   private static final long a = 72359297652570L;
   private static final String d;

   public bey(guu module) {
      long ax = bey.a ^ 57551362323921L;
      super(a, d);
   }

   @gdz
   public void gfz(amo event) {
      long ax = bey.a ^ 98989627095647L;
      int[] var10000 = dar.abu();
      class_2596 var6 = a.bed();
      int[] axx = var10000;
      class_2596 var7 = var6;
      if (axx != null) {
         if (!(var6 instanceof class_2848)) {
            return;
         }

         var7 = var6;
      }

      label26: {
         class_2848 axxx = (class_2848)var7;
         class_2849 var8 = axxx.method_12365();
         class_2849 var10001 = class_2849.field_12981;
         if (axx != null) {
            if (var8 == class_2849.field_12981) {
               break label26;
            }

            var8 = axxx.method_12365();
            var10001 = class_2849.field_12985;
         }

         if (var8 != var10001) {
            return;
         }
      }

      a.gmm(true);
   }

   static {
      long var0 = a ^ 24169805648685L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Sprint".getBytes("ISO-8859-1"));
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
