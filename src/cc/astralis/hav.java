package cc.astralis;

import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_268;
import net.minecraft.class_3489;
import net.minecraft.class_5251;
import net.minecraft.class_640;
import net.minecraft.class_746;
import net.minecraft.class_9282;

public class hav implements dlc {
   private static final Pattern dh;
   private static final long a = 9352885674308L;
   private static final long b;

   public static boolean aho(class_640 entry) {
      int[] ax;
      label72: {
         long axx = hav.a ^ 96161548744511L;
         int[] var10000 = dar.abu();
         class_268 axxx = a.method_2955();
         ax = var10000;
         class_268 axxxx = chi.field_1724.method_5781();
         class_268 var8 = axxx;
         if (ax != null) {
            if (axxx == null) {
               break label72;
            }

            var8 = axxxx;
         }

         if (ax == null) {
            return var8.method_1206(axxxx);
         }

         if (var8 != null) {
            return axxx.method_1206(axxxx);
         }
      }

      class_2561 axxxxx = a.method_2971();
      class_2561 axxxxxx = chi.field_1724.method_5476();
      class_2561 var9 = axxxxxx;
      if (ax != null) {
         if (axxxxxx == null) {
            return false;
         }

         var9 = axxxxx;
      }

      if (ax != null) {
         if (var9 == null) {
            return false;
         }

         var9 = axxxxxx;
      }

      boolean var10 = cdm(var9, axxxxx);
      if (ax != null) {
         if (!var10) {
            boolean var11 = gga(axxxxx, axxxxxx);
            if (ax == null) {
               return var11;
            }

            if (!var11) {
               return false;
            }
         }

         var10 = true;
      }

      return var10;
   }

   public static boolean ab(class_1309 entity) {
      long ax = hav.a ^ 60768022434486L;
      int[] axx = dar.abu();
      class_746 var10000 = chi.field_1724;
      if (axx != null) {
         if (chi.field_1724.method_5722(a)) {
            return true;
         }

         var10000 = chi.field_1724;
      }

      class_2561 axxx = var10000.method_5476();
      class_2561 axxxx = a.method_5476();
      class_2561 var6 = axxx;
      if (axx != null) {
         if (axxx == null) {
            return false;
         }

         var6 = axxxx;
      }

      if (axx != null) {
         if (var6 == null) {
            return false;
         }

         var6 = axxx;
      }

      boolean var7 = cdm(var6, axxxx);
      if (axx != null) {
         if (!var7) {
            boolean var8 = gga(axxxx, axxx);
            if (axx == null) {
               return var8;
            }

            if (!var8) {
               return false;
            }
         }

         var7 = true;
      }

      return var7;
   }

   private static boolean cdm(class_2561 a, class_2561 a) {
      long ax = hav.a ^ 128424489442890L;
      int[] var10000 = dar.abu();
      class_2583 axx = a.method_10866();
      int[] axxx = var10000;
      class_2583 axxxx = a.method_10866();
      class_5251 var7 = axx.method_10973();
      if (axxx != null) {
         if (var7 == null) {
            return false;
         }

         var7 = axxxx.method_10973();
      }

      if (axxx != null) {
         if (var7 == null) {
            return false;
         }

         var7 = axx.method_10973();
      }

      boolean var8 = var7.equals(axxxx.method_10973());
      return axxx == null ? var8 : var8;
   }

   private static boolean gga(class_2561 a, class_2561 a) {
      int[] ax;
      int var9;
      label42: {
         long axx = hav.a ^ 1512398042790L;
         int[] var10000 = dar.abu();
         String axxx = ebi(a.getString());
         ax = var10000;
         String axxxx = ebi(a.getString());
         String[] axxxxx = axxx.split(" ");
         String[] axxxxxx = axxxx.split(" ");
         var9 = axxxxx.length;
         byte var10001 = 1;
         if (ax != null) {
            if (var9 <= 1) {
               return (boolean)0;
            }

            var9 = axxxxxx.length;
            if (ax == null) {
               break label42;
            }

            var10001 = 1;
         }

         if (var9 <= var10001) {
            return (boolean)0;
         }

         var9 = axxxxx[0].equals(axxxxxx[0]);
      }

      if (ax == null) {
         return (boolean)var9;
      } else {
         return (boolean)(var9 != 0 ? 1 : 0);
      }
   }

   private static boolean et(class_1309 a) {
      long ax = hav.a ^ 99587346902512L;
      int[] axx = dar.abu();
      class_1309 var10000 = a;
      if (axx != null) {
         if (!(a instanceof class_1657)) {
            return false;
         }

         var10000 = a;
      }

      class_1657 axxx = (class_1657)var10000;
      boolean var5 = ara(axxx, 3);
      if (axx != null) {
         if (!var5) {
            boolean var6 = ara(axxx, 2);
            if (axx == null) {
               return var6;
            }

            if (!var6) {
               return false;
            }
         }

         var5 = true;
      }

      return var5;
   }

   public static String ebi(String input) {
      return dh.matcher(a).replaceAll("");
   }

   private static boolean ara(class_1657 a, int a) {
      return true;
   }

   private static Integer hau(class_1799 a) {
      long ax = hav.a ^ 82046231663174L;
      int[] var3 = dar.abu();
      int var10000 = a.method_31573(class_3489.field_48803);
      if (var3 != null) {
         if (var10000 == 0) {
            return null;
         }

         var10000 = class_9282.method_57470(a, (int)b);
      }

      return var10000;
   }

   static {
      long var9 = a ^ 64524716403536L;
      Cipher var6;
      Cipher var10000 = var6 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var7 = 1; var7 < 8; var7++) {
         var10003[var7] = (byte)(var9 << var7 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var8 = var6.doFinal("(?i)§[0-9A-FK-OR]".getBytes("ISO-8859-1"));
      String var13 = a(var8).intern();
      byte var10001 = -1;
      String var5 = var13;
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = -5863362716078726828L;
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
      long var15 = (var4[0] & 255L) << 56
         | (var4[1] & 255L) << 48
         | (var4[2] & 255L) << 40
         | (var4[3] & 255L) << 32
         | (var4[4] & 255L) << 24
         | (var4[5] & 255L) << 16
         | (var4[6] & 255L) << 8
         | var4[7] & 255L;
      var10001 = -1;
      b = var15;
      dh = Pattern.compile(var5);
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
