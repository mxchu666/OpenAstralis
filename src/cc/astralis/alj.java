package cc.astralis;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2708;

public class alj extends cec {
   private final cbm dyi = new cbm();
   private boolean ag;
   private static final long a = 99077465604788L;
   private static final long c;

   @gdz
   public void als(amo event) {
      long ax = alj.a ^ 120591131727489L;
      int[] var4 = dar.abu();
      if (a.cud() != gpy.SEND) {
         boolean var10000 = dar.gqy().aws().diy(eky.class).dsv();
         if (var4 != null) {
            if (!var10000) {
               return;
            }

            var10000 = a.bed() instanceof class_2708;
         }

         if (var10000) {
            dar.gqy().aws().diy(eky.class).gxo();
            a.ag = true;
            a.dyi.glr();
         }
      }
   }

   @gdz
   public void dnn(fxx event) {
      alj var5;
      label29: {
         long ax = alj.a ^ 103351134297335L;
         int[] var4 = dar.abu();
         boolean var10000 = a.ag;
         if (var4 != null) {
            if (!a.ag) {
               return;
            }

            var5 = a;
            if (var4 == null) {
               break label29;
            }

            var10000 = a.dyi.fsc(c);
         }

         if (!var10000) {
            return;
         }

         var5 = a;
      }

      var5.ag = false;
   }

   @gdz
   public void feq(ctt event) {
   }

   static {
      long var0 = a ^ 1051166085234L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -5976735928838769582L;
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
      c = var7;
   }
}
