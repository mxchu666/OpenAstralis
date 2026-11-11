package cc.astralis;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $VF: synthetic class
class dcm {
   static final int[] azt;

   static {
      long var11 = gls.a(7659167829674166534L, 1824664737399993610L, MethodHandles.lookup().lookupClass()).a(2873374814063L) ^ 87371953730961L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var11 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "¤w¼Ùsz÷ë\u001dYm1#^LÇ";
      int var6 = "¤w¼Ùsz÷ë\u001dYm1#^LÇ".length();
      byte var3 = 0;

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         var10001 = var4++;
         long var8 = (var7[0] & 255L) << 56
            | (var7[1] & 255L) << 48
            | (var7[2] & 255L) << 40
            | (var7[3] & 255L) << 32
            | (var7[4] & 255L) << 24
            | (var7[5] & 255L) << 16
            | (var7[6] & 255L) << 8
            | var7[7] & 255L;
         byte[] var10 = var1.doFinal(
            new byte[]{
               (byte)(var8 >>> 56),
               (byte)(var8 >>> 48),
               (byte)(var8 >>> 40),
               (byte)(var8 >>> 32),
               (byte)(var8 >>> 24),
               (byte)(var8 >>> 16),
               (byte)(var8 >>> 8),
               (byte)var8
            }
         );
         long var10004 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         byte var22 = -1;
         var0[var10001] = var10004;
      } while (var3 < var6);

      azt = new int[bfm.values().length];

      try {
         azt[bfm.COMBAT.ordinal()] = 1;
      } catch (NoSuchFieldError var20) {
      }

      try {
         azt[bfm.MOVEMENT.ordinal()] = 2;
      } catch (NoSuchFieldError var19) {
      }

      try {
         azt[bfm.WORLD.ordinal()] = 3;
      } catch (NoSuchFieldError var18) {
      }

      try {
         azt[bfm.PLAYER.ordinal()] = 4;
      } catch (NoSuchFieldError var17) {
      }

      try {
         azt[bfm.VISUAL.ordinal()] = 5;
      } catch (NoSuchFieldError var16) {
      }

      try {
         azt[bfm.EXPLOIT.ordinal()] = (int)var0[1];
      } catch (NoSuchFieldError var15) {
      }

      try {
         azt[bfm.CLIENT.ordinal()] = (int)var0[0];
      } catch (NoSuchFieldError var14) {
      }
   }
}
