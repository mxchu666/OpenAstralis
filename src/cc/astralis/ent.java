package cc.astralis;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2743;
import net.minecraft.class_746;
import net.minecraft.class_2828.class_5911;

public class ent extends hcr {
   private boolean bqn;
   private boolean fuu;
   private static final long a = 15952682504914L;
   private static final String d;

   public ent(guu parentClass) {
      long ax = ent.a ^ 50768650674887L;
      super(a, d);
   }

   @Override
   public void dil() {
      a.bqn = false;
      a.fuu = false;
      super.dil();
   }

   @gdz
   public void edq(dgp e) {
      long ax = ent.a ^ 13405757328115L;
      int[] var4 = dar.abu();
      if (a.cud() == gpy.POST) {
         int var10000;
         var10000 = a.bqn;
         label51:
         if (var4 != null) {
            if (!a.bqn) {
               double var6;
               var10000 = (var6 = chi.field_1724.field_6017 - 0.0) == 0.0 ? 0 : (var6 < 0.0 ? -1 : 1);
               if (var4 == null) {
                  break label51;
               }

               if (var10000 > 0) {
                  gix.eex(new class_5911(true, false));
                  chi.field_1724.field_6017 = 0.0;
                  a.bqn = true;
               }
            }

            var10000 = a.bqn;
         }

         label58: {
            if (var4 != null) {
               if (var10000 != 0) {
                  byb(class_243.field_1353);
               }

               var5 = a;
               if (var4 == null) {
                  break label58;
               }

               var10000 = a.fuu;
            }

            if (var10000 == 0) {
               return;
            }

            evd.dek(0.3F);
            bav.fym(-2.0E-4);
            var5 = a;
         }

         var5.fuu = false;
      }
   }

   @gdz
   public void dca(eih e) {
      long ax = ent.a ^ 273566363536L;
      if (a.bqn) {
         a.gmm(true);
      }
   }

   @gdz
   public void fd(amo e) {
      long ax = ent.a ^ 128316081633669L;
      int[] var10000 = dar.abu();
      class_2596 var6 = a.bed();
      int[] axx = var10000;
      class_2596 var7 = var6;
      if (axx != null) {
         if (!(var6 instanceof class_2743)) {
            return;
         }

         var7 = var6;
      }

      class_2743 axxx = (class_2743)var7;
      if (axx != null) {
         if (axxx.method_11818() != chi.field_1724.method_5628()) {
            return;
         }

         a.bqn = false;
         a.gmm(true);
      }

      a.fuu = true;
   }

   private static void byb(class_243 a) {
      long ax = ent.a ^ 80982274021373L;
      int[] var3 = dar.abu();
      class_746 var10000 = chi.field_1724;
      if (var3 != null) {
         if (chi.field_1724 == null) {
            return;
         }

         var10000 = chi.field_1724;
      }

      var10000.method_18799(a);
   }

   static {
      long var0 = a ^ 5936874521070L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Grim".getBytes("ISO-8859-1"));
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
