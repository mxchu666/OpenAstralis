package cc.astralis;

import io.github.humbleui.skija.Image;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class ekh extends LinkedHashMap<String, Image> {
   private static final long a = 11005285218570L;
   private static final long b;

   ekh(int a, float a, boolean a) {
      super(a, a, a);
   }

   @Override
   protected boolean removeEldestEntry(Entry<String, Image> eldest) {
      long ax = ekh.a ^ 30712338857734L;
      int[] var4 = dar.abu();
      int var10000 = a.size();
      if (var4 != null) {
         if (var10000 > (int)b) {
            a.getValue().close();
            return true;
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   static {
      long var0 = a ^ 4024125360529L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 2483633745663424391L;
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
      b = var7;
   }
}
