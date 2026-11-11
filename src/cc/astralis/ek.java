package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ek {
   private static final Pattern ffl;
   private static final long a = 92927555517024L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long h;

   public static String gkf(String text) {
      return ffl.matcher(a).replaceAll("");
   }

   public static String bfz(String input) {
      long ax = ek.a ^ 23749658965488L;
      int[] var10000 = dar.abu();
      short var10002 = 5531;
      long var10003 = 8250135295982934878L ^ ax;
      String[] axx = a.split("\\s");
      int[] axxx = var10000;
      StringBuilder axxxx = new StringBuilder();
      String[] var6 = axx;
      int var7 = axx.length;
      int var8 = 0;

      while (true) {
         if (var8 < var7) {
            String axxxxx = var6[var8];
            var10 = axxxx.append(Character.toTitleCase(axxxxx.charAt(0))).append(axxxxx.substring(1)).append(" ");
            if (axxx == null) {
               break;
            }

            var8++;
            if (axxx != null) {
               continue;
            }
         }

         var10 = axxxx;
         break;
      }

      return var10.toString().trim();
   }

   public static String bf(String input) {
      long ax = ek.a ^ 35971280607347L;

      try {
         short var10000 = 20070;
         long var10001 = 6200420705016229166L ^ ax;
         MessageDigest axx = MessageDigest.getInstance("SHA-1");
         byte[] axxx = axx.digest(a.getBytes(StandardCharsets.UTF_8));
         String var6 = bpw(axxx);
         short var10002 = 7270;
         long var10003 = 5254911551954922809L ^ ax;
         return var6.substring(0, 8);
      } catch (NoSuchAlgorithmException var5) {
         throw new RuntimeException(var5);
      }
   }

   private static String bpw(byte[] a) {
      long ax = ek.a ^ 29519592023760L;
      StringBuilder axx = new StringBuilder();
      byte[] var5 = a;
      int[] var10000 = dar.abu();
      int var6 = a.length;
      int[] axxx = var10000;
      int var7 = 0;

      while (true) {
         if (var7 < var6) {
            byte axxxx = var5[var7];
            short var10001 = 10613;
            long var10002 = 2255213529833059475L ^ ax;
            var9 = axx.append(String.format("%02x", axxxx));
            if (axxx == null) {
               break;
            }

            var7++;
            if (axxx != null) {
               continue;
            }
         }

         var9 = axx;
         break;
      }

      return var9.toString();
   }

   public static String bzp(String input) {
      return bfz(a.toLowerCase().replace("_", " "));
   }

   public static String ckv(int length) {
      return IntStream.range(0, a).mapToObj(ax -> {
         long ax = ek.a ^ 49049287322482L;
         Random var10000 = new Random();
         short var10001 = 2001;
         long var10002 = 4657036571291043212L ^ ax;
         short var3 = 4268;
         long var10003 = 6444119795781817075L ^ ax;
         return String.valueOf((char)var10000.nextInt(97, 123));
      }).collect(Collectors.joining());
   }

   public static String chu(String input) {
      long ax = ek.a ^ 127559980405068L;
      short var10001 = 32622;
      long var10002 = 3964660352858346776L ^ ax;
      short var9 = 4975;
      long var10003 = 4017942809260210458L ^ ax;
      String axx = a.replaceAll("([a-z])([A-Z])", "$1 $2");
      var10001 = 16627;
      var10002 = 6047257373568887432L ^ ax;
      axx = axx.replaceAll("(?<=\\p{Lower})(?=\\d)", " ");
      var10001 = 22490;
      var10002 = 3138384803039313316L ^ ax;
      axx = axx.replaceAll("(?<=\\p{Upper})(?=\\d)", " ");
      var10001 = 23952;
      var10002 = 9139874997518006252L ^ ax;
      return axx.replaceAll("(?<=\\d)(?=[A-Z])", " ");
   }

   public static String gha(long milliseconds) {
      long ax = ek.a ^ 139069205848987L;
      double axx = TimeUnit.MILLISECONDS.toSeconds(a) + a % h / 1000.0;
      long axxx = (long)(axx / 3600.0);
      int[] var10000 = dar.abu();
      long axxxx = (long)(axx % 3600.0 / 60.0);
      double axxxxx = axx % 60.0;
      int[] axxxxxx = var10000;
      StringBuilder axxxxxxx = new StringBuilder();
      long var21;
      int var14 = (var21 = axxx - 0L) == 0L ? 0 : (var21 < 0L ? -1 : 1);
      if (axxxxxx != null) {
         if (var14 > 0) {
            StringBuilder var15 = axxxxxxx.append(axxx);
            short var10001 = 4221;
            long var10002 = 6852852258887256277L ^ ax;
            var15.append("h ");
         }

         long var22;
         var14 = (var22 = axxxx - 0L) == 0L ? 0 : (var22 < 0L ? -1 : 1);
      }

      label32: {
         label31: {
            if (axxxxxx != null) {
               if (var14 > 0) {
                  break label31;
               }

               long var23;
               var14 = (var23 = axxx - 0L) == 0L ? 0 : (var23 < 0L ? -1 : 1);
            }

            if (var14 <= 0) {
               break label32;
            }
         }

         StringBuilder var16 = axxxxxxx.append(axxxx);
         short var17 = 28845;
         long var19 = 4706815428793640962L ^ ax;
         var16.append("m ");
      }

      short var18 = 2991;
      long var20 = 5816884330382316293L ^ ax;
      axxxxxxx.append(String.format("%.1fs", axxxxx));
      return axxxxxxx.toString().trim();
   }

   static {
      long var25 = a ^ 12923059837297L;
      Cipher var16;
      Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var17 = 1; var17 < 8; var17++) {
         var10003[var17] = (byte)(var25 << var17 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var23 = new String[12];
      int var21 = 0;
      String var20 = "Å1ü×t\fUuÊw¦\nQ\u009e£ãis¢\"\u0089Ù*É\u007föG¡æ¸¹¯ïÿd\u0098\u000bO\u009dZ\u0010=ð\u009ah\u008dÑ\u000fTY=vk¦\u007fhG(Õ\u000bRJz\u0081\n\u0081\u001f\u0015à{KÕ\u0090ÎoÂ\u0000ÊÎ¹\u0083ÌúqO\u0099dtE¿°[\u0083cF¡\u000fV\u0010A\u0093¥VU\u0087\t4¶ÊV,>÷\\\u0005\u0010\u008f +\u0019Ì\u009aËtqáV¦7DP¼\u0010\u009e\u0089ç°v\u001eÕb+|§k\r\u0091ÎÌ\u0010úò~hô\rc\u008fðf£\nö¸@j((º|\u009d\\}ú\u009c\u000b@o\u009f9ëÍ\tÄRµ\u009fy¾Ìå\"À\u0086¦·þ\u000fZ÷²Ä\u0000Ûæ\n3(Â\r²\u008f\u008a\bá\u0096ÎºIQ5(´ý&êñÁ\u0001Æi\u001a$îíÚ\u0091¢X8\u0007V\u000b\u001b} \u008bj\u0010\u0002uâúÉ\n\u0016ùÊ\u008a@º@Î\u001cÆ";
      int var22 = "Å1ü×t\fUuÊw¦\nQ\u009e£ãis¢\"\u0089Ù*É\u007föG¡æ¸¹¯ïÿd\u0098\u000bO\u009dZ\u0010=ð\u009ah\u008dÑ\u000fTY=vk¦\u007fhG(Õ\u000bRJz\u0081\n\u0081\u001f\u0015à{KÕ\u0090ÎoÂ\u0000ÊÎ¹\u0083ÌúqO\u0099dtE¿°[\u0083cF¡\u000fV\u0010A\u0093¥VU\u0087\t4¶ÊV,>÷\\\u0005\u0010\u008f +\u0019Ì\u009aËtqáV¦7DP¼\u0010\u009e\u0089ç°v\u001eÕb+|§k\r\u0091ÎÌ\u0010úò~hô\rc\u008fðf£\nö¸@j((º|\u009d\\}ú\u009c\u000b@o\u009f9ëÍ\tÄRµ\u009fy¾Ìå\"À\u0086¦·þ\u000fZ÷²Ä\u0000Ûæ\n3(Â\r²\u008f\u008a\bá\u0096ÎºIQ5(´ý&êñÁ\u0001Æi\u001a$îíÚ\u0091¢X8\u0007V\u000b\u001b} \u008bj\u0010\u0002uâúÉ\n\u0016ùÊ\u008a@º@Î\u001cÆ"
         .length();
      char var19 = '(';
      int var28 = -1;

      label56:
      while (true) {
         String var29 = var20.substring(++var28, var28 + var19);
         int var10001 = -1;

         while (true) {
            byte[] var24 = var16.doFinal(var29.getBytes("ISO-8859-1"));
            String var42 = a(var24).intern();
            switch (var10001) {
               case 0:
                  var23[var21++] = var42;
                  if ((var28 += var19) >= var22) {
                     b = var23;
                     c = new String[12];
                     g = new HashMap(13);
                     Cipher var5;
                     var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var6 = 1; var6 < 8; var6++) {
                        var10003[var6] = (byte)(var25 << var6 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var11 = new long[3];
                     int var8 = 0;
                     String var9 = "hp}ä\u0016\u008fÙu\u0011\u008dëfýê\u0003\u0011<\u001bÓ4D\u0094v\u0016";
                     int var10 = "hp}ä\u0016\u008fÙu\u0011\u008dëfýê\u0003\u0011<\u001bÓ4D\u0094v\u0016".length();
                     byte var7 = 0;

                     do {
                        var10001 = var7;
                        var7 += 8;
                        byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
                        var10001 = var8++;
                        long var13 = (var12[0] & 255L) << 56
                           | (var12[1] & 255L) << 48
                           | (var12[2] & 255L) << 40
                           | (var12[3] & 255L) << 32
                           | (var12[4] & 255L) << 24
                           | (var12[5] & 255L) << 16
                           | (var12[6] & 255L) << 8
                           | var12[7] & 255L;
                        byte[] var15 = var5.doFinal(
                           new byte[]{
                              (byte)(var13 >>> 56),
                              (byte)(var13 >>> 48),
                              (byte)(var13 >>> 40),
                              (byte)(var13 >>> 32),
                              (byte)(var13 >>> 24),
                              (byte)(var13 >>> 16),
                              (byte)(var13 >>> 8),
                              (byte)var13
                           }
                        );
                        long var10004 = (var15[0] & 255L) << 56
                           | (var15[1] & 255L) << 48
                           | (var15[2] & 255L) << 40
                           | (var15[3] & 255L) << 32
                           | (var15[4] & 255L) << 24
                           | (var15[5] & 255L) << 16
                           | (var15[6] & 255L) << 8
                           | var15[7] & 255L;
                        byte var49 = -1;
                        var11[var10001] = var10004;
                     } while (var7 < var10);

                     e = var11;
                     f = new Integer[3];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -6548593600067373418L;
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
                     long var47 = (var4[0] & 255L) << 56
                        | (var4[1] & 255L) << 48
                        | (var4[2] & 255L) << 40
                        | (var4[3] & 255L) << 32
                        | (var4[4] & 255L) << 24
                        | (var4[5] & 255L) << 16
                        | (var4[6] & 255L) << 8
                        | var4[7] & 255L;
                     byte var39 = -1;
                     h = var47;
                     short var33 = 6512;
                     long var40 = 2115347719904295737L ^ var25;
                     ffl = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");
                     return;
                  }

                  var19 = var20.charAt(var28);
                  break;
               default:
                  var23[var21++] = var42;
                  if ((var28 += var19) < var22) {
                     var19 = var20.charAt(var28);
                     continue label56;
                  }

                  var20 = "Ã ë9U¨E½ â»\u0095àNÉ÷\u0090\u000fDô¦¹¦íþXÑD©\u0018@÷\u0010?3S°\u0088.ê\fú·4\u00068:ÁX";
                  var22 = "Ã ë9U¨E½ â»\u0095àNÉ÷\u0090\u000fDô¦¹¦íþXÑD©\u0018@÷\u0010?3S°\u0088.ê\fú·4\u00068:ÁX".length();
                  var19 = ' ';
                  var28 = -1;
            }

            var29 = var20.substring(++var28, var28 + var19);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16720;
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
            throw new RuntimeException("cc/astralis/ek", var10);
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
         throw new RuntimeException("cc/astralis/ek" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4941;
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
            throw new RuntimeException("cc/astralis/ek", var14);
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
         throw new RuntimeException("cc/astralis/ek" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
