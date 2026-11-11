package cc.astralis;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum hcp {
   Axe,
   Hoe,
   Shovel,
   Shears,
   Pickaxe,
   Sword;

   private static final long a = 44892371857313L;
   private static final long b;

   public boolean gnc() {
      long a = hcp.a ^ 114829113922353L;
      int[] var3 = dar.abu();
      hcp var10000 = a;
      hcp var10001 = Axe;
      if (var3 != null) {
         if (a == Axe) {
            return true;
         }

         var10000 = a;
         var10001 = Shovel;
      }

      if (var3 != null) {
         if (var10000 == var10001) {
            return true;
         }

         var10000 = a;
         var10001 = Pickaxe;
      }

      return var10000 == var10001;
   }

   public int ckz() {
      long a = hcp.a ^ 50690894406055L;
      int[] var3 = dar.abu();
      hcp var10000 = a;
      hcp var10001 = Shovel;
      if (var3 != null) {
         if (a == Shovel) {
            return 0;
         }

         var10000 = a;
         var10001 = Pickaxe;
      }

      if (var3 != null) {
         if (var10000 == var10001) {
            return 1;
         }

         var10000 = a;
         var10001 = Axe;
      }

      return var10000 == var10001 ? 2 : -1;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var14 = a ^ 63079248887681L;
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
      String var10 = "M0\"\u00847ñÓ\u009d\b\u008boõ&\u0081ð}ô\b^a\u008dO°R9T\bèúBì\u009eî?&";
      int var12 = "M0\"\u00847ñÓ\u009d\b\u008boõ&\u0081ð}ô\b^a\u008dO°R9T\bèúBì\u009eî?&".length();
      char var9 = '\b';
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
                     long var2 = -7784934847301515370L;
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
                     Axe = new hcp();
                     Hoe = new hcp();
                     Shovel = new hcp();
                     Shears = new hcp();
                     Pickaxe = new hcp();
                     Sword = new hcp();
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

                  var10 = "Ïh¹nu\u0015ü\u0082\b¸\u0000\u0004Äq\\`\u0095";
                  var12 = "Ïh¹nu\u0015ü\u0082\b¸\u0000\u0004Äq\\`\u0095".length();
                  var9 = '\b';
                  var17 = -1;
            }

            var18 = var10.substring(++var17, var17 + var9);
            var10001 = 0;
         }
      }
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
