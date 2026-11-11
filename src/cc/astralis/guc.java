package cc.astralis;

import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2596;
import net.minecraft.class_6374;

public class guc extends hcr {
   private final ArrayList<class_2596<?>> cdg;
   private int ehv;
   private static final long a = 56804775403512L;
   private static final String d;
   private static final long e;

   public guc(guu module) {
      long ax = guc.a ^ 102330357848083L;
      super(a, d);
      a.cdg = new ArrayList<>();
   }

   @Override
   public void dil() {
      a.cdg.clear();
      a.ehv = 0;
      super.dil();
   }

   @gdz
   public void dko(amo event) {
      int[] ax;
      guc var7;
      label49: {
         long axx = guc.a ^ 13384082721332L;
         ax = dar.abu();
         int var10000 = a.bed() instanceof class_6374;
         if (ax != null) {
            if (var10000 != 0) {
               a.cdg.add(a.bed());
               a.gmm(true);
            }

            a.ehv++;
            var7 = a;
            if (ax == null) {
               break label49;
            }

            var10000 = a.ehv;
         }

         if (var10000 <= (int)e) {
            return;
         }

         var7 = a;
      }

      label34: {
         for (class_2596<?> axxx : var7.cdg) {
            gix.dsd(axxx);
            if (ax == null) {
               break label34;
            }

            if (ax == null) {
               break;
            }
         }

         a.ehv = 0;
      }

      a.cdg.clear();
   }

   static {
      long var5 = a ^ 87948501838159L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var9 = var7.doFinal("Verus Fly 2".getBytes("ISO-8859-1"));
      String var12 = a(var9).intern();
      byte var10001 = -1;
      d = var12;
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = 5659624014739488046L;
      byte[] var4 = var0.doFinal(
         new byte[]{
            (byte)(var2 >>> 56),
            (byte)(var2 >>> 48),
            (byte)(var2 >>> 40),
            (byte)(var2 >>> 32),
            (byte)(var2 >>> 24),
            (byte)(var2 >>> 16),
            (byte)(var2 >>> 8),
            (byte)var2
         }
      );
      long var14 = (var4[0] & 255L) << 56
         | (var4[1] & 255L) << 48
         | (var4[2] & 255L) << 40
         | (var4[3] & 255L) << 32
         | (var4[4] & 255L) << 24
         | (var4[5] & 255L) << 16
         | (var4[6] & 255L) << 8
         | var4[7] & 255L;
      var10001 = -1;
      e = var14;
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
