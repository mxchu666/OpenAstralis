package cc.astralis;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum bgi {
   NECK,
   RIGHT_ARM,
   LEFT_ARM,
   HEAD,
   CHEST,
   LOWER_CHEST;

   private static boolean gsy;
   private static final long a = 52704756492843L;
   private static final long b;

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var14 = a ^ 73241947660853L;
      Cipher var6;
      Cipher var10000 = var6 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var7 = 1; var7 < 8; var7++) {
         var10003[var7] = (byte)(var14 << var7 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var5 = new String[6];
      int var11 = 0;
      String var10 = "¶ª\u0002\u0003\u0081\u0005 Ð\u0082Ú¦\u008a¡(\u0096\u008d\u0010\u0094:4EB!\u0084©ÑBÇ!|\u00ad\u0097]\bH\u0018M\u008bÆÕÀ7\u0010\u0007°ê_%åÙuÅc\u0018+3tËï";
      int var12 = "¶ª\u0002\u0003\u0081\u0005 Ð\u0082Ú¦\u008a¡(\u0096\u008d\u0010\u0094:4EB!\u0084©ÑBÇ!|\u00ad\u0097]\bH\u0018M\u008bÆÕÀ7\u0010\u0007°ê_%åÙuÅc\u0018+3tËï"
         .length();
      char var9 = 16;
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var10.substring(++var17, var17 + var9);
         byte var10001 = -1;

         while (true) {
            byte[] var13 = var6.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = a(var13).intern();
            switch (var10001) {
               case 0:
                  var5[var11++] = var26;
                  if ((var17 += var9) >= var12) {
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 6782184900201287098L;
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
                     long var30 = (var4[0] & 255L) << 56
                        | (var4[1] & 255L) << 48
                        | (var4[2] & 255L) << 40
                        | (var4[3] & 255L) << 32
                        | (var4[4] & 255L) << 24
                        | (var4[5] & 255L) << 16
                        | (var4[6] & 255L) << 8
                        | var4[7] & 255L;
                     var10001 = -1;
                     b = var30;
                     NECK = new bgi();
                     RIGHT_ARM = new bgi();
                     LEFT_ARM = new bgi();
                     HEAD = new bgi();
                     CHEST = new bgi();
                     LOWER_CHEST = new bgi();
                     ato(true);
                     return;
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var5[var11++] = var26;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label37;
                  }

                  var10 = "]´ù¦V\\ÿú\b\u0019\u00874¹0Õ\u0095/";
                  var12 = "]´ù¦V\\ÿú\b\u0019\u00874¹0Õ\u0095/".length();
                  var9 = '\b';
                  var17 = -1;
            }

            var18 = var10.substring(++var17, var17 + var9);
            var10001 = 0;
         }
      }
   }

   public static void ato(boolean var0) {
      gsy = var0;
   }

   public static boolean bfz() {
      return gsy;
   }

   public static boolean cfg() {
      long var0 = a ^ 5097523826278L;
      int[] var2 = dar.abu();
      boolean var3 = bfz();
      boolean var10000 = var3;
      if (var2 != null) {
         if (!var3) {
            return true;
         }

         var10000 = false;
      }

      return var10000;
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
