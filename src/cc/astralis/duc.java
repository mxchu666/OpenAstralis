package cc.astralis;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1268;
import net.minecraft.class_2246;
import net.minecraft.class_2350;
import net.minecraft.class_310;
import net.minecraft.class_3965;

public class duc extends hcr {
   private static final long a = 63868318739967L;
   private static final String d;

   public duc(guu parentClass) {
      long ax = duc.a ^ 117846489852166L;
      super(a, d);
   }

   @gdz
   public void eki(fxx event) {
      long ax = duc.a ^ 5909290505280L;
      int[] var10000 = dar.abu();
      dqq.edu(chi.field_1724.method_36454() - 180.0F, 81.0F, 100.0F, 100.0F);
      int[] var4 = var10000;
      class_310 var5 = chi;
      if (var4 != null) {
         if (!chi.field_1687.method_8320(chi.field_1724.method_24515().method_10074()).method_27852(class_2246.field_10124)) {
            return;
         }

         chi.field_1724.method_6104(class_1268.field_5808);
         var5 = chi;
      }

      var5.field_1761
         .method_2896(
            chi.field_1724,
            class_1268.field_5808,
            new class_3965(chi.field_1765.method_17784(), class_2350.field_11033, chi.field_1724.method_24515().method_10074(), false)
         );
   }

   static {
      long var0 = a ^ 100472282914897L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Block".getBytes("ISO-8859-1"));
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
