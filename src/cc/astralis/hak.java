package cc.astralis;

import astralis.mixin.accessor.EntityVelocityUpdateS2CPacketAccessor;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1268;
import net.minecraft.class_2596;
import net.minecraft.class_2743;
import net.minecraft.class_2879;

public class hak extends hcr {
   private static final long a = 82496594389170L;
   private static final String d;

   public hak(guu parentClass) {
      long ax = hak.a ^ 17249996515517L;
      super(a, d);
   }

   @gdz
   public void efw(amo event) {
      long ax = hak.a ^ 35712708319911L;
      int[] axx = dar.abu();
      amo var10000 = a;
      if (axx != null) {
         if (a.cud() != gpy.RECEIVE) {
            return;
         }

         var10000 = a;
      }

      class_2596 axxx = var10000.bed();
      class_2596 var9 = axxx;
      if (axx != null) {
         if (!(axxx instanceof class_2743)) {
            return;
         }

         var9 = axxx;
      }

      class_2743 axxxx = (class_2743)var9;
      EntityVelocityUpdateS2CPacketAccessor axxxxx = (EntityVelocityUpdateS2CPacketAccessor)a.bed();
      int var10 = axxxxx.getEntityId();
      if (axx != null) {
         if (var10 != chi.field_1724.method_5628()) {
            return;
         }

         var10 = 0;
      }

      int axxxxxx = var10;

      while (axxxxxx < 5) {
         gix.dsd(new class_2879(class_1268.field_5808));
         axxxxxx++;
         if (axx == null) {
            break;
         }
      }
   }

   static {
      long var0 = a ^ 52515093441798L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Reduce Packet".getBytes("ISO-8859-1"));
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
