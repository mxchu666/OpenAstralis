package cc.astralis;

import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_2561;
import net.minecraft.class_5244;
import net.minecraft.class_5250;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;

public class fey implements dlc {
   private static final long a = 71599975012247L;
   private static final String b;
   private static final long c;

   public static boolean gfq() {
      long a = fey.a ^ 121110406755454L;
      int[] ax = dar.abu();
      class_746 var10000 = chi.field_1724;
      if (ax != null) {
         if (chi.field_1724 == null) {
            return false;
         }

         var10000 = chi.field_1724;
      }

      Iterator var3 = var10000.method_6026().stream().toList().iterator();

      while (true) {
         if (var3.hasNext()) {
            class_1293 axx = (class_1293)var3.next();
            var5 = ((class_1291)axx.method_5579().comp_349()).method_5573();
            if (ax == null) {
               break;
            }

            if (ax == null) {
               return var5;
            }

            if (var5) {
               return true;
            }

            if (ax != null) {
               continue;
            }
         }

         var5 = false;
         break;
      }

      return var5;
   }

   public static boolean enx() {
      long a = fey.a ^ 106950294883468L;
      int[] ax = dar.abu();
      class_746 var10000 = chi.field_1724;
      if (ax != null) {
         if (chi.field_1724 == null) {
            return false;
         }

         var10000 = chi.field_1724;
      }

      Iterator var3 = var10000.method_6026().stream().toList().iterator();

      while (true) {
         if (var3.hasNext()) {
            class_1293 axx = (class_1293)var3.next();
            var5 = ((class_1291)axx.method_5579().comp_349()).method_5573();
            if (ax == null) {
               break;
            }

            if (ax == null) {
               return var5;
            }

            if (!var5) {
               return true;
            }

            if (ax != null) {
               continue;
            }
         }

         var5 = false;
         break;
      }

      return var5;
   }

   public static boolean gpy() {
      long var0 = a ^ 74225326489724L;
      int[] var2 = dar.abu();
      class_746 var10000 = chi.field_1724;
      if (var2 != null) {
         if (chi.field_1724 == null) {
            return false;
         }

         var10000 = chi.field_1724;
      }

      boolean var3 = var10000.method_6026().isEmpty();
      return var2 == null ? var3 : !var3;
   }

   public static List<class_1293> epm() {
      long var0 = a ^ 82495530366782L;
      int[] var2 = dar.abu();
      class_746 var10000 = chi.field_1724;
      if (var2 != null) {
         if (chi.field_1724 == null) {
            return List.of();
         }

         var10000 = chi.field_1724;
      }

      return var10000.method_6026().stream().toList();
   }

   public static class_2561 esz(@NotNull class_1293 statusEffect) {
      long ax = fey.a ^ 122028222416306L;
      int[] var10000 = dar.abu();
      class_5250 axx = ((class_1291)a.method_5579().comp_349()).method_5560().method_27661();
      int[] axxx = var10000;
      int var7 = a.method_5578();
      int var10001 = 1;
      if (axxx != null) {
         if (var7 < 1) {
            return axx;
         }

         var7 = a.method_5578();
         var10001 = (int)c;
      }

      if (var7 <= var10001) {
         class_5250 axxxx = axx.method_10852(class_5244.field_41874);
         int axxxxx = a.method_5578();
         axxxx.method_10852(class_2561.method_43471(b + (axxxxx + 1)));
      }

      return axx;
   }

   static {
      long var5 = a ^ 98675353386728L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var9 = var7.doFinal("enchantment.level.".getBytes("ISO-8859-1"));
      String var12 = a(var9).intern();
      byte var10001 = -1;
      b = var12;
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = -3642053710863484444L;
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
      c = var14;
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
