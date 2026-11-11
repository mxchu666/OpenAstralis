package cc.astralis;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class aml {
   public static boolean gkg;
   public static String eyu;
   public static boolean gsj;
   public static boolean aod;
   public static String euh;
   public static boolean fyy;
   public static final cbm fhj;
   public static boolean exv;
   public static boolean fii;
   public static bvc hjr;
   public static int cbd;
   public static boolean dxk;
   public static boolean grg;
   public static boolean bxp;
   public static boolean cwd;
   public static List<ago> cic;

   static {
      long var20 = gls.a(6245420114258814153L, -2563267314471752716L, MethodHandles.lookup().lookupClass()).a(257299965716198L) ^ 76381852210621L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var20 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[2];
      int var17 = 0;
      String var16 = "çÌbÿýØ¯Õ\b;\u000b,\u0006ñIód";
      int var18 = "çÌbÿýØ¯Õ\b;\u000b,\u0006ñIód".length();
      char var15 = '\b';
      int var14 = -1;

      while (true) {
         byte[] var19 = var12.doFinal(var16.substring(++var14, var14 + var15).getBytes("ISO-8859-1"));
         String var27 = a(var19).intern();
         int var10001 = -1;
         var11[var17++] = var27;
         if ((var14 += var15) >= var18) {
            Cipher var1;
            var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var2 = 1; var2 < 8; var2++) {
               var10003[var2] = (byte)(var20 << var2 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var0 = new long[2];
            int var4 = 0;
            String var5 = "Oµ{}Æü§íè\u001e,\u001c\u008f\u0017zy";
            int var6 = "Oµ{}Æü§íè\u001e,\u001c\u008f\u0017zy".length();
            byte var3 = 0;

            do {
               var10001 = var3;
               var3 += 8;
               byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
               var10001 = var4++;
               long var8 = (var7[0] & 255L) << 56
                  | (var7[1] & 255L) << 48
                  | (var7[2] & 255L) << 40
                  | (var7[3] & 255L) << 32
                  | (var7[4] & 255L) << 24
                  | (var7[5] & 255L) << 16
                  | (var7[6] & 255L) << 8
                  | var7[7] & 255L;
               byte[] var10 = var1.doFinal(
                  new byte[]{
                     (byte)(var8 >>> 56),
                     (byte)(var8 >>> 48),
                     (byte)(var8 >>> 40),
                     (byte)(var8 >>> 32),
                     (byte)(var8 >>> 24),
                     (byte)(var8 >>> 16),
                     (byte)(var8 >>> 8),
                     (byte)var8
                  }
               );
               long var10004 = (var10[0] & 255L) << 56
                  | (var10[1] & 255L) << 48
                  | (var10[2] & 255L) << 40
                  | (var10[3] & 255L) << 32
                  | (var10[4] & 255L) << 24
                  | (var10[5] & 255L) << 16
                  | (var10[6] & 255L) << 8
                  | var10[7] & 255L;
               byte var31 = -1;
               var0[var10001] = var10004;
            } while (var3 < var6);

            gkg = true;
            eyu = null;
            gsj = false;
            aod = false;
            euh = var11[0];
            fyy = true;
            fhj = new cbm();
            exv = false;
            fii = false;
            hjr = new dtk(var11[1], (int)var0[1]);
            cbd = (int)var0[0];
            dxk = false;
            grg = false;
            bxp = false;
            cwd = false;
            cic = new ArrayList<>();
            return;
         }

         var15 = var16.charAt(var14);
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
