package cc.astralis;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class hgy extends CopyOnWriteArrayList<fdg> {
   private static final long serialVersionUID;
   final fdg fot;
   final fbr hjc;

   hgy(fbr a, fdg var2) {
      a.hjc = a;
      a.fot = var2;
      a.add(a.fot);
   }

   static {
      long var2 = gls.a(-2869462226895219040L, 3353803039285156738L, MethodHandles.lookup().lookupClass()).a(132452003493292L) ^ 44821390035467L;
      Cipher var4;
      Cipher var10000 = var4 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var2 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var5 = 1; var5 < 8; var5++) {
         var10003[var5] = (byte)(var2 << var5 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var6 = 5128642574540981573L;
      byte[] var8 = var4.doFinal(
         new byte[]{
            (byte)(var6 >>> 56),
            (byte)(var6 >>> 48),
            (byte)(var6 >>> 40),
            (byte)(var6 >>> 32),
            (byte)(var6 >>> 24),
            (byte)(var6 >>> 16),
            (byte)(var6 >>> 8),
            (byte)var6
         }
      );
      long var9 = (var8[0] & 255L) << 56
         | (var8[1] & 255L) << 48
         | (var8[2] & 255L) << 40
         | (var8[3] & 255L) << 32
         | (var8[4] & 255L) << 24
         | (var8[5] & 255L) << 16
         | (var8[6] & 255L) << 8
         | var8[7] & 255L;
      byte var10001 = -1;
      long var0 = var9;
      serialVersionUID = var0;
   }
}
