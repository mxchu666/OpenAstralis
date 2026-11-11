package cc.astralis;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2596;
import net.minecraft.class_2743;
import net.minecraft.class_6374;

public class bod extends hcr {
   private int hfo;
   private static final long a = 119041239919368L;
   private static final String d;

   public bod(guu parentClass) {
      long ax = bod.a ^ 7765474453697L;
      super(a, d);
      a.hfo = 0;
   }

   @gdz
   public void ess(amo event) {
      int[] ax;
      class_2596 var9;
      label51: {
         long axx = bod.a ^ 14170005828545L;
         int[] var10000 = dar.abu();
         class_2596 var6 = a.bed();
         ax = var10000;
         boolean var8 = var6 instanceof class_2743;
         if (ax != null) {
            if (var8) {
               class_2743 axxx = (class_2743)var6;
               if (ax != null) {
                  if (axxx.method_11818() != chi.field_1724.method_5628()) {
                     return;
                  }

                  a.gmm(true);
               }

               a.hfo++;
            }

            var6 = a.bed();
            var9 = var6;
            if (ax == null) {
               break label51;
            }

            var8 = var6 instanceof class_6374;
         }

         if (!var8) {
            return;
         }

         var9 = var6;
      }

      class_6374 axxx = (class_6374)var9;
      bod var10 = a;
      if (ax != null) {
         if (a.hfo <= 0) {
            return;
         }

         a.gmm(true);
         var10 = a;
      }

      var10.hfo--;
   }

   static {
      long var0 = a ^ 19724260267322L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Buffer".getBytes("ISO-8859-1"));
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
