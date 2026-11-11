package cc.astralis;

import astralis.mixin.accessor.PlayerMoveC2SPacketAccessor;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2708;
import net.minecraft.class_2828;

public class cyh extends hcr {
   private boolean ayg;
   private static final long a = 137658596043813L;
   private static final String d;

   public cyh(guu parentClass) {
      long ax = cyh.a ^ 98889853193987L;
      super(a, d);
      a.ayg = false;
   }

   @gdz
   public void dnt(fnt event) {
      long ax = cyh.a ^ 59122120115313L;
      if (chi.field_1724.method_18798().field_1351 < -0.7) {
         a.ayg = true;
      }
   }

   @gdz
   public void dtf(amo event) {
      boolean var10000;
      long ax = cyh.a ^ 78470665234089L;
      int[] axx = dar.abu();
      var10000 = a.bed() instanceof class_2828;
      label36:
      if (axx != null) {
         if (var10000) {
            PlayerMoveC2SPacketAccessor axxx = (PlayerMoveC2SPacketAccessor)a.bed();
            var10000 = chi.field_1724.method_24828();
            if (axx == null) {
               break label36;
            }

            if (var10000) {
               var10000 = a.ayg;
               if (axx == null) {
                  break label36;
               }

               if (a.ayg) {
                  axxx.setY(-0.1);
               }
            }
         }

         var10000 = a.bed() instanceof class_2708;
      }

      if (var10000) {
         a.ayg = false;
      }
   }

   static {
      long var0 = a ^ 78112312180445L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Blocks MC".getBytes("ISO-8859-1"));
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
