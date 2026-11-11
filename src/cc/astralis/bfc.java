package cc.astralis;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_10209;
import net.minecraft.class_1297;
import net.minecraft.class_1301;
import net.minecraft.class_1675;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_746;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public class bfc implements dlc {
   private static class_3966 aub;
   private static final long a = 108299544042939L;
   private static final String b;

   public static boolean gto(class_2350 enumFacing, class_2338 pos, boolean strict, float reach, float yaw, float pitch) {
      long ax = bfc.a ^ 23949804770346L;
      int[] var10000 = dar.abu();
      class_3965 axx = ejr(a, a, a);
      int[] axxx = var10000;
      class_3965 var11 = axx;
      if (axxx != null) {
         if (axx == null) {
            return false;
         }

         var11 = axx;
      }

      if (axxx != null) {
         if (var11.method_17783() != class_240.field_1332) {
            return false;
         }

         var11 = axx;
      }

      class_2338 axxxx = var11.method_17777();
      class_2338 var12 = axxxx;
      if (axxx != null) {
         if (axxxx == null) {
            return false;
         }

         var12 = axxxx;
      }

      boolean var13 = var12.equals(a);
      if (axxx != null) {
         if (!var13) {
            return false;
         }

         var13 = a;
      }

      return axxx == null ? var13 : !var13 || axx.method_17780() == a;
   }

   public static boolean frs(float yaw, float pitch, float reach) {
      long ax = bfc.a ^ 61092350594419L;
      return ejr(a, a, a).method_17783() == class_240.field_1332;
   }

   public static class_3965 ejr(float yaw, float pitch, float reach) {
      class_243 ax = chi.method_1560().method_5836(1.0F);
      class_243 axx = ekk(a, a);
      class_243 axxx = ax.method_1031(axx.field_1352 * a, axx.field_1351 * a, axx.field_1350 * a);
      return chi.field_1687.method_17742(new class_3959(ax, axxx, class_3960.field_17558, class_242.field_1348, chi.method_1560()));
   }

   public static class_243 ekk(float yaw, float pitch) {
      float ax = class_3532.method_15362(-a * (float) (Math.PI / 180.0) - (float) Math.PI);
      float axx = class_3532.method_15374(-a * (float) (Math.PI / 180.0) - (float) Math.PI);
      float axxx = -class_3532.method_15362(-a * (float) (Math.PI / 180.0));
      float axxxx = class_3532.method_15374(-a * (float) (Math.PI / 180.0));
      return new class_243(axx * axxx, axxxx, ax * axxx);
   }

   public static boolean eqw(class_2350 facing, class_2338 position, boolean strict, float reach, float yaw, float pitch) {
      long ax = bfc.a ^ 130606985619120L;
      int[] var10000 = dar.abu();
      class_3965 axx = cb(a, a, a);
      int[] axxx = var10000;
      class_3965 var10 = axx;
      if (axxx != null) {
         if (axx == null) {
            return false;
         }

         var10 = axx;
      }

      int var11 = var10.method_17777().method_10263();
      if (axxx != null) {
         if (var11 == a.method_10263()) {
            int var13 = axx.method_17777().method_10264();
            if (axxx == null) {
               return (boolean)var13;
            }

            if (var13 == a.method_10264()) {
               int var14 = axx.method_17777().method_10260();
               if (axxx == null) {
                  return (boolean)var14;
               }

               if (var14 == a.method_10260()) {
                  boolean var12 = a;
                  if (axxx != null) {
                     if (a) {
                        return axx.method_17780() == a;
                     }

                     var12 = true;
                  }

                  return var12;
               }
            }
         }

         var11 = 0;
      }

      return (boolean)var11;
   }

   public static class_3965 cb(float reach, float yaw, float pitch) {
      class_243 ax = chi.method_1560().method_5836(1.0F);
      class_243 axx = ekk(a, a);
      class_243 axxx = ax.method_1031(axx.field_1352 * a, axx.field_1351 * a, axx.field_1350 * a);
      return chi.field_1687.method_17742(new class_3959(ax, axxx, class_3960.field_17558, class_242.field_1348, chi.method_1560()));
   }

   public static void fpt(boolean throughWalls) {
      long ax = bfc.a ^ 43740833200453L;
      int[] var10000 = dar.abu();
      float axx = 1.0F;
      int[] axxx = var10000;
      class_1297 axxxx = chi.method_1560();
      if (axxxx != null) {
         class_310 var12 = chi;
         if (axxx != null) {
            if (chi.field_1687 == null) {
               return;
            }

            var12 = chi;
         }

         class_746 var13 = var12.field_1724;
         if (axxx != null) {
            if (var12.field_1724 == null) {
               return;
            }

            class_10209.method_64146().method_15396(b);
            var13 = chi.field_1724;
         }

         label37: {
            label36: {
               double axxxxx = var13.method_55754();
               double axxxxxx = chi.field_1724.method_55755();
               class_239 axxxxxxx = eut(axxxx, axxxxx, axxxxxx, 1.0F, a);
               class_239 var14 = axxxxxxx;
               if (axxx != null) {
                  if (!(axxxxxxx instanceof class_3966)) {
                     break label36;
                  }

                  var14 = axxxxxxx;
               }

               class_3966 axxxxxxxx = (class_3966)var14;
               aub = axxxxxxxx;
               if (axxx != null) {
                  break label37;
               }
            }

            aub = null;
         }

         class_10209.method_64146().method_15407();
      }
   }

   private static class_239 eut(class_1297 a, double a, double a, float a, boolean a) {
      int[] ax;
      double axx;
      double axxx;
      class_243 axxxx;
      class_239 axxxxx;
      double axxxxxx;
      label44: {
         long axxxxxxx = bfc.a ^ 69186783587085L;
         axx = Math.max(a, a);
         int[] var10000 = dar.abu();
         axxx = class_3532.method_33723(axx);
         ax = var10000;
         axxxx = a.method_5836(a);
         axxxxx = (class_239)(a
            ? class_3965.method_17778(
               axxxx.method_1019(a.method_5828(a).method_1021(axx)),
               class_2350.method_10142(a.method_5828(a).field_1352, a.method_5828(a).field_1351, a.method_5828(a).field_1350),
               class_2338.method_49638(axxxx.method_1019(a.method_5828(a).method_1021(axx)))
            )
            : a.method_5745(axx, a, false));
         axxxxxx = axxxxx.method_17784().method_1025(axxxx);
         if (ax != null) {
            if (axxxxx.method_17783() == class_240.field_1333) {
               break label44;
            }

            axxx = axxxxxx;
         }

         axx = Math.sqrt(axxxxxx);
      }

      class_243 axxxxxxx = a.method_5828(a);
      class_243 axxxxxxxx = axxxx.method_1019(axxxxxxx.method_1021(axx));
      class_238 axxxxxxxxx = a.method_5829().method_18804(axxxxxxx.method_1021(axx)).method_1014(1.0);
      class_3966 axxxxxxxxxx = class_1675.method_18075(a, axxxx, axxxxxxxx, axxxxxxxxx, class_1301.field_52443, axxx);
      Object var22 = axxxxxxxxxx;
      if (ax != null) {
         if (axxxxxxxxxx != null) {
            if (ax == null) {
               return cy(axxxxxxxxxx, axxxx, a);
            }

            if (axxxxxxxxxx.method_17784().method_1025(axxxx) < axxxxxx) {
               return cy(axxxxxxxxxx, axxxx, a);
            }
         }

         var22 = axxxxx;
      }

      return cy((class_239)var22, axxxx, a);
   }

   private static class_239 cy(class_239 a, class_243 a, double a) {
      long ax = bfc.a ^ 87935515383100L;
      int[] var10000 = dar.abu();
      class_243 axx = a.method_17784();
      int[] axxx = var10000;
      class_243 var10 = axx;
      if (axxx != null) {
         if (axx.method_24802(a, a)) {
            return a;
         }

         var10 = a.method_17784();
      }

      class_243 axxxx = var10;
      class_2350 axxxxx = class_2350.method_10142(axxxx.field_1352 - a.field_1352, axxxx.field_1351 - a.field_1351, axxxx.field_1350 - a.field_1350);
      return class_3965.method_17778(axxxx, axxxxx, class_2338.method_49638(axxxx));
   }

   public static class_3966 exm() {
      return aub;
   }

   static {
      long var0 = a ^ 131802677083487L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("pick".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      b = var5;
      aub = null;
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
