package cc.astralis;

import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class gyn extends brc {
   private static int eea;
   private static final String[] b;
   private static final long c = 66360568630127L;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public gyn() {
      long a = c ^ 120691098759667L;
      short var10001 = 3633;
      long var10002 = 5980712947144087861L ^ a;
      super(-1065923125);
   }

   @Override
   public void etg(JsonObject json) {
      a.cps(a);
   }

   @Override
   public String cql() {
      JsonObject a = a.fdo();
      String var10000 = a.toString();
      String[] var2 = b;
      return fz.dvr(var10000, cni.fsi(var2[1]), cni.fsi(var2[0]));
   }

   public static void aqg(int var0) {
      eea = var0;
   }

   public static int goo() {
      return eea;
   }

   public static int ews() {
      long var0 = c ^ 100776228640200L;
      int[] var2 = dar.abu();
      int var3 = goo();
      int var10000 = var3;
      if (var2 != null) {
         if (var3 == 0) {
            short var4 = 21555;
            long var10001 = 152246494285063943L ^ var0;
            return 1081941577;
         }

         var10000 = 0;
      }

      return var10000;
   }

   static {
      long var15 = c ^ 100085275249907L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var15 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var14 = var12.doFinal(
         "}\u0086}¿\\Ê\u00816\u0011\u008a1ØL±\u000eZU'Ç\u0012ó:\u0000³·\u0003.±<\u001b<¥þµ\u0019âÎø\u0097\u0013â\u0002ØÝär\u009b\u0016Uáç\u0013\u008b\u001aÕ\u0088\u0085O\u0018\u0095C\u000eÏ\u0018\u0007¹1´=õ§'T Â\u0018\u0013A(\u009d\u009f:+\u0092q\u009aIà\u009bdSo®`\u009cP\u0091ÈÈÔ\f2Éw\u0080_å\u0010ÊA\u009fÍõ\u0002zqÜ\u0003u\u009e/\u0090¹\u0083\f\u0007×\u0098\u009c%È\u0097Fîú\u0005E¿]i±(\u001dú"
            .getBytes("ISO-8859-1")
      );
      String var35 = b(var14).intern();
      int var10001 = -1;
      String var11 = var35;
      i = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var15 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[13];
      int var3 = 0;
      String var4 = "Ó}\u000f½'²\u0001\u0005\u0005n\u0011-Ì\u0012&~OÖ\u0005\u0016Ð²\u0001C@ñtçø\u0007s¿\u008d/ÇÇ¶\u009cs\u001fy^\u0092}ÒÆ\u0013\u0015ðªhm}.>åu\u0092ÉÊ\"§,H\u000fê½¦sù\u0088¢ÿ\u008aÜ²}ÑªT\u0000\u0018\u000eóí}Ýâ";
      int var5 = "Ó}\u000f½'²\u0001\u0005\u0005n\u0011-Ì\u0012&~OÖ\u0005\u0016Ð²\u0001C@ñtçø\u0007s¿\u008d/ÇÇ¶\u009cs\u001fy^\u0092}ÒÆ\u0013\u0015ðªhm}.>åu\u0092ÉÊ\"§,H\u000fê½¦sù\u0088¢ÿ\u008aÜ²}ÑªT\u0000\u0018\u000eóí}Ýâ"
         .length();
      byte var2 = 0;

      label40:
      while (true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var26 = var6;
         var10001 = var3++;
         long var37 = (var7[0] & 255L) << 56
            | (var7[1] & 255L) << 48
            | (var7[2] & 255L) << 40
            | (var7[3] & 255L) << 32
            | (var7[4] & 255L) << 24
            | (var7[5] & 255L) << 16
            | (var7[6] & 255L) << 8
            | var7[7] & 255L;
         byte var43 = -1;

         while (true) {
            long var8 = var37;
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
            long var45 = (var10[0] & 255L) << 56
               | (var10[1] & 255L) << 48
               | (var10[2] & 255L) << 40
               | (var10[3] & 255L) << 32
               | (var10[4] & 255L) << 24
               | (var10[5] & 255L) << 16
               | (var10[6] & 255L) << 8
               | var10[7] & 255L;
            switch (var43) {
               case 0:
                  var26[var10001] = var45;
                  if (var2 >= var5) {
                     g = var6;
                     h = new Integer[13];
                     String[] var22 = new String[2];
                     int var20 = 0;
                     String var19 = var11;
                     int var21 = var11.length();
                     short var31 = 2011;
                     long var39 = 7881212238042344915L ^ var15;
                     int var18 = 794894420;
                     aqg(0);
                     int var17 = -1;

                     while (true) {
                        short var27 = 15621;
                        long var32 = 1323199328176707330L ^ var15;
                        String var40 = b(-2034018439, b(var19.substring(++var17, var17 + var18)));
                        byte var33 = -1;
                        var22[var20++] = var40;
                        if ((var17 += var18) >= var21) {
                           b = var22;
                           return;
                        }

                        var18 = var19.charAt(var17);
                     }
                  }
                  break;
               default:
                  var26[var10001] = var45;
                  if (var2 < var5) {
                     continue label40;
                  }

                  var4 = "\u008cÇ\u00107©ôï\u00adWD\u0011 ÞÄÿ*";
                  var5 = "\u008cÇ\u00107©ôï\u00adWD\u0011 ÞÄÿ*".length();
                  var2 = 0;
            }

            byte var30 = var2;
            var2 += 8;
            var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
            var26 = var6;
            var10001 = var3++;
            var37 = (var7[0] & 255L) << 56
               | (var7[1] & 255L) << 48
               | (var7[2] & 255L) << 40
               | (var7[3] & 255L) << 32
               | (var7[4] & 255L) << 24
               | (var7[5] & 255L) << 16
               | (var7[6] & 255L) << 8
               | var7[7] & 255L;
            var43 = 0;
         }
      }
   }

   private static char[] b(String var0) {
      long var1 = c ^ 30273374814543L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 1795;
         long var10005 = 3138397305798516915L ^ var1;
         var10000[0] = (char)(var10003 ^ 442451427);
      }

      return var10000;
   }

   private static String b(int var0, char[] var1) {
      long var2 = c ^ 80935246117104L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 11458;
         long var10009 = 4721574070093738695L ^ var2;
         int var10;
         switch (var4 % -1337397012) {
            case 0:
               short var16 = 6961;
               long var23 = 7629598264276600114L ^ var2;
               var10 = 714925817;
               break;
            case 1:
               short var15 = 23204;
               long var22 = 6032448499781371050L ^ var2;
               var10 = 1267149508;
               break;
            case 2:
               short var14 = 17997;
               long var21 = 5664617878474233924L ^ var2;
               var10 = -950534412;
               break;
            case 3:
               short var13 = 2453;
               long var20 = 8781113483628828563L ^ var2;
               var10 = -344514769;
               break;
            case 4:
               short var12 = 5852;
               long var19 = 9091439182668581073L ^ var2;
               var10 = 1197803854;
               break;
            case 5:
               short var11 = 16040;
               long var18 = 2943356168103321762L ^ var2;
               var10 = -1570566050;
               break;
            default:
               short var10007 = 855;
               long var17 = 89359358939192671L ^ var2;
               var10 = -1811595333;
         }

         var10001[var4] = (char)(var10005 ^ var10002 ^ var10);
      }

      return new String(var10001).intern();
   }

   private static String b(byte[] var0) {
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11664;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/gyn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("cc/astralis/gyn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
