package cc.astralis;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2350;

// $VF: synthetic class
class ezj {
   static final int[] gya;

   static {
      long var7 = gls.a(4448774741641234428L, 7795500655939711776L, MethodHandles.lookup().lookupClass()).a(22670045064045L) ^ 122853787714121L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var7 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var7 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -3382186215333392861L;
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
      long var16 = (var6[0] & 255L) << 56
         | (var6[1] & 255L) << 48
         | (var6[2] & 255L) << 40
         | (var6[3] & 255L) << 32
         | (var6[4] & 255L) << 24
         | (var6[5] & 255L) << 16
         | (var6[6] & 255L) << 8
         | var6[7] & 255L;
      byte var10001 = -1;
      long var0 = var16;
      gya = new int[class_2350.values().length];

      try {
         gya[class_2350.field_11033.ordinal()] = 1;
      } catch (NoSuchFieldError var15) {
      }

      try {
         gya[class_2350.field_11036.ordinal()] = 2;
      } catch (NoSuchFieldError var14) {
      }

      try {
         gya[class_2350.field_11043.ordinal()] = 3;
      } catch (NoSuchFieldError var13) {
      }

      try {
         gya[class_2350.field_11035.ordinal()] = 4;
      } catch (NoSuchFieldError var12) {
      }

      try {
         gya[class_2350.field_11039.ordinal()] = 5;
      } catch (NoSuchFieldError var11) {
      }

      try {
         gya[class_2350.field_11034.ordinal()] = (int)var0;
      } catch (NoSuchFieldError var10) {
      }
   }
}
