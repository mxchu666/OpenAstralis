package cc.astralis;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum fxm {
   WIN,
   MAC,
   LNX,
   UNK;

   private final String dqw;
   private static final fxm[] gwx;

   private fxm(String a) {
      a.dqw = a;
   }

   String fty() {
      return a.dqw;
   }

   private static fxm[] ani() {
      return new fxm[]{WIN, MAC, LNX, UNK};
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var9 = gls.a(-3651535213546160602L, 2497953820917703589L, MethodHandles.lookup().lookupClass()).a(58842381435131L) ^ 59728730751774L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[8];
      int var6 = 0;
      String var5 = "É\u001e'©\u0013¡¿Â\b\u0088\u0001|ï\u001fbÿï\b\u008c\u0086\u000eð,\u009aý\r\bj%æUÊ\u000fqo\b`\u0088Ö<\u00ad?V½\bpá2t\u0091ÖÂ\u0098";
      int var7 = "É\u001e'©\u0013¡¿Â\b\u0088\u0001|ï\u001fbÿï\b\u008c\u0086\u000eð,\u009aý\r\bj%æUÊ\u000fqo\b`\u0088Ö<\u00ad?V½\bpá2t\u0091ÖÂ\u0098".length();
      char var4 = '\b';
      int var12 = -1;

      label28:
      while (true) {
         String var13 = var5.substring(++var12, var12 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var19;
                  if ((var12 += var4) >= var7) {
                     WIN = new fxm(var0[0]);
                     MAC = new fxm(var0[6]);
                     LNX = new fxm(var0[3]);
                     UNK = new fxm(var0[2]);
                     gwx = ani();
                     return;
                  }

                  var4 = var5.charAt(var12);
                  break;
               default:
                  var0[var6++] = var19;
                  if ((var12 += var4) < var7) {
                     var4 = var5.charAt(var12);
                     continue label28;
                  }

                  var5 = "WÆ7\u009e\u001f(\u009a\f\bøfG\u008d\u0014þO>";
                  var7 = "WÆ7\u009e\u001f(\u009a\f\bøfG\u008d\u0014þO>".length();
                  var4 = '\b';
                  var12 = -1;
            }

            var13 = var5.substring(++var12, var12 + var4);
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
