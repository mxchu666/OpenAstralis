package cc.astralis;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1268;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2828;
import net.minecraft.class_2886;
import net.minecraft.class_3489;
import net.minecraft.class_2828.class_2830;

public class aoy extends hcr {
   private int ghx;
   private static final long a = 88659002106689L;
   private static final String d;

   public aoy(guu module) {
      long ax = aoy.a ^ 110716712188534L;
      super(a, d);
   }

   @Override
   public void dil() {
      a.ghx = 0;
      super.dil();
   }

   @gdz
   public void dpr(amo event) {
      long ax = aoy.a ^ 30145847748831L;
      int[] var10000 = dar.abu();
      class_2596 var6 = a.bed();
      int[] axx = var10000;
      class_2596 var7 = var6;
      if (axx != null) {
         if (!(var6 instanceof class_2828)) {
            return;
         }

         var7 = var6;
      }

      class_2828 axxx = (class_2828)var7;
      a.gmm(true);
      gix.eex(
         new class_2830(
            new class_243(
               axxx.method_12269(chi.field_1724.method_23317()),
               axxx.method_12268(chi.field_1724.method_23318()),
               axxx.method_12274(chi.field_1724.method_23321())
            ),
            axxx.method_12271(chi.field_1724.method_36454()),
            axxx.method_12270(chi.field_1724.method_36455()),
            axxx.method_12273(),
            chi.field_1724.field_5976
         )
      );
      aoy var8 = a;
      if (axx != null) {
         if (a.ghx % 3 == 0) {
            gix.dsd(
               new class_2886(
                  chi.field_1724.method_31548().method_7391().method_31573(class_3489.field_42611) ? class_1268.field_5810 : class_1268.field_5808,
                  0,
                  0.0F,
                  0.0F
               )
            );
         }

         var8 = a;
      }

      var8.ghx++;
   }

   static {
      long var0 = a ^ 107837715585975L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Verus Timer".getBytes("ISO-8859-1"));
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
