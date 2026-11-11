package cc.astralis;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class erh {
   public static final byte frl = 0;
   public static final byte dph = 1;
   public static final byte dck;
   public static final byte eob;
   public static final byte fnf;
   public static final byte[] cpc;

   static {
      long var1 = gls.a(4887676577823636629L, 6146970313038667432L, MethodHandles.lookup().lookupClass()).a(120529216442627L) ^ 140211497907557L;
      Cipher var3;
      Cipher var10000 = var3 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var1 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var4 = 1; var4 < 8; var4++) {
         var10003[var4] = (byte)(var1 << var4 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[3];
      int var6 = 0;
      String var7 = "îû1E\u0016Gaÿ¦\tË\n×ºY\u0083.?¢-[\u0013B\u0002";
      int var8 = "îû1E\u0016Gaÿ¦\tË\n×ºY\u0083.?¢-[\u0013B\u0002".length();
      byte var5 = 0;

      do {
         int var10001 = var5;
         var5 += 8;
         byte[] var9 = var7.substring(var10001, var5).getBytes("ISO-8859-1");
         var10001 = var6++;
         long var10 = (var9[0] & 255L) << 56
            | (var9[1] & 255L) << 48
            | (var9[2] & 255L) << 40
            | (var9[3] & 255L) << 32
            | (var9[4] & 255L) << 24
            | (var9[5] & 255L) << 16
            | (var9[6] & 255L) << 8
            | var9[7] & 255L;
         byte[] var12 = var3.doFinal(
            new byte[]{
               (byte)(var10 >>> 56),
               (byte)(var10 >>> 48),
               (byte)(var10 >>> 40),
               (byte)(var10 >>> 32),
               (byte)(var10 >>> 24),
               (byte)(var10 >>> 16),
               (byte)(var10 >>> 8),
               (byte)var10
            }
         );
         long var10004 = (var12[0] & 255L) << 56
            | (var12[1] & 255L) << 48
            | (var12[2] & 255L) << 40
            | (var12[3] & 255L) << 32
            | (var12[4] & 255L) << 24
            | (var12[5] & 255L) << 16
            | (var12[6] & 255L) << 8
            | var12[7] & 255L;
         byte var14 = -1;
         var0[var10001] = var10004;
      } while (var5 < var8);

      fnf = (byte)((int)var0[2]);
      eob = (byte)((int)var0[1]);
      dck = (byte)((int)var0[0]);
      cpc = new byte[]{0, 1, 2, 3, 4};
   }
}
