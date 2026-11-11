package cc.astralis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fwi {
   private static final String bib;
   private static String[] fec;
   private static final long a = 46924283539142L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public static String akb() {
      long a = fwi.a ^ 49282735522914L;
      int[] ax = dar.abu();

      try {
         short var10002 = 17375;
         long var10003 = 5427321886245673678L ^ a;
         URL axx = new URL("https://pastebin.com/gtCdWxDx");
         HttpURLConnection axxx = (HttpURLConnection)axx.openConnection();
         short var10001 = 25685;
         long var13 = 6917806885029150021L ^ a;
         axxx.setRequestMethod("GET");
         var10001 = 15684;
         long var14 = 6446438649518278958L ^ a;
         axxx.setConnectTimeout(3000);
         var10001 = 11339;
         long var15 = 7964040698463180835L ^ a;
         axxx.setReadTimeout(3000);
         int axxxx = axxx.getResponseCode();
         var10001 = 21772;
         long var16 = 3221773921841848679L ^ a;
         if (axxxx != 200) {
            return null;
         } else {
            BufferedReader axxxxx = new BufferedReader(new InputStreamReader(axxx.getInputStream()));
            StringBuilder axxxxxx = new StringBuilder();

            while (true) {
               String axxxxxxx;
               if ((axxxxxxx = axxxxx.readLine()) != null) {
                  axxxxxx.append(axxxxxxx).append("\n");
                  if (ax != null) {
                     continue;
                  }
                  break;
               }

               axxxxx.close();
               axxx.disconnect();
               break;
            }

            return axxxxxx.toString().trim();
         }
      } catch (Exception var9) {
         return null;
      }
   }

   public static boolean cvu() {
      long a = fwi.a ^ 28606554602265L;
      int[] var10000 = dar.abu();
      String ax = akb();
      int[] axx = var10000;
      String var4 = ax;
      if (axx != null) {
         if (ax == null) {
            return false;
         }

         var4 = ax;
      }

      boolean var5 = var4.isEmpty();
      return axx == null ? var5 : !var5;
   }

   public static void eki(String[] var0) {
      fec = var0;
   }

   public static String[] agu() {
      return fec;
   }

   static {
      long var11 = a ^ 10353699318341L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[3];
      int var18 = 0;
      String var17 = "ß\u009d%§uÀ«~Et¥\u001cR\u0080\u0017Qô\u0013¾n\u001f\u001c\u001chtÆÇ\u001aC£D*UÝñüÆÐ\u00964\u0017Ú \u000f\u008eb#\u008e\u0010©íç¬7U\u0019á\nJlÔÛa\u0011r0j\u0088ÕP\u009eû\u008e|W\u0087Ä-o\u001d\u0003¼º\u001bk\u0087OÌ>\u000fÜjg¼¯Ùm\u007f\u0013÷V\u0018Àýq/´íñ´\u0019nÅÁ";
      int var19 = "ß\u009d%§uÀ«~Et¥\u001cR\u0080\u0017Qô\u0013¾n\u001f\u001c\u001chtÆÇ\u001aC£D*UÝñüÆÐ\u00964\u0017Ú \u000f\u008eb#\u008e\u0010©íç¬7U\u0019á\nJlÔÛa\u0011r0j\u0088ÕP\u009eû\u008e|W\u0087Ä-o\u001d\u0003¼º\u001bk\u0087OÌ>\u000fÜjg¼¯Ùm\u007f\u0013÷V\u0018Àýq/´íñ´\u0019nÅÁ"
         .length();
      char var16 = '0';
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var29 = a(var21).intern();
         int var10001 = -1;
         var20[var18++] = var29;
         if ((var15 += var16) >= var19) {
            b = var20;
            c = new String[3];
            short var23 = 1036;
            long var26 = 5377251845478593336L ^ var11;
            bib = "https://pastebin.com/gtCdWxDx";
            g = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[3];
            int var3 = 0;
            String var4 = "úvî5[½zLÙêlêÔ«èø\n\u0083\tHO\u0099§J";
            int var5 = "úvî5[½zLÙêlêÔ«èø\n\u0083\tHO\u0099§J".length();
            byte var2 = 0;

            do {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               var10001 = var3++;
               long var8 = (var7[0] & 255L) << 56
                  | (var7[1] & 255L) << 48
                  | (var7[2] & 255L) << 40
                  | (var7[3] & 255L) << 32
                  | (var7[4] & 255L) << 24
                  | (var7[5] & 255L) << 16
                  | (var7[6] & 255L) << 8
                  | var7[7] & 255L;
               byte[] var10 = var0.doFinal(
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
               byte var33 = -1;
               var6[var10001] = var10004;
            } while (var2 < var5);

            e = var6;
            f = new Integer[3];
            if (agu() != null) {
               eki(new String[5]);
            }

            return;
         }

         var16 = var17.charAt(var15);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13237;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/fwi", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/fwi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24270;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = e[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/fwi", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/fwi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
