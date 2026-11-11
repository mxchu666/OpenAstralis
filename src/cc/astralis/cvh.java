package cc.astralis;

import astralis.mixin.accessor.EntityAccessor;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2828.class_2830;

public class cvh extends hcr {
   private static final long a = 21551644666685L;
   private static final String d;

   public cvh(guu parentClass) {
      long ax = cvh.a ^ 9406381145548L;
      super(a, d);
   }

   @gdz
   public void elb(ajd event) {
      long ax = cvh.a ^ 572378315883L;
      int[] var10000 = dar.abu();
      double axx = chi.field_1724.method_18798().field_1351;
      int[] axxx = var10000;
      double var8;
      int var7 = (var8 = chi.field_1724.field_6017 - 3.0) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
      if (axxx != null) {
         if (var7 <= 0) {
            return;
         }

         double var9;
         var7 = (var9 = axx - 0.0) == 0.0 ? 0 : (var9 < 0.0 ? -1 : 1);
      }

      if (axxx != null) {
         if (var7 >= 0) {
            return;
         }

         double var10;
         var7 = (var10 = ((EntityAccessor)chi.field_1724).callAdjustMovementForCollisions(chi.field_1724.method_18798()).field_1351 - axx) == 0.0
            ? 0
            : (var10 < 0.0 ? -1 : 1);
      }

      if (var7 > 0) {
         gix.dsd(
            new class_2830(
               chi.field_1724.method_23317(),
               chi.field_1724.method_23318() + 1.0E-14,
               chi.field_1724.method_23321(),
               chi.field_1724.method_36454(),
               chi.field_1724.method_36455(),
               false,
               false
            )
         );
      }
   }

   static {
      long var0 = a ^ 119792986952145L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Universal".getBytes("ISO-8859-1"));
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
