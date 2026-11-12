package cc.astralis;

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

public enum bdq {
   WEEKLY,
   MONTHLY,
   LIFETIME;

   private final String bme;
   private static int heh;
   private static final String[] a;
   private static final long b = 25660212068138L;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;
   private static final long f;

   private bdq(String a) {
      a.bme = a;
   }

   public static bdq bys(String name) {
      long ax = b ^ 105444763066286L;
      long axx = f;
      bdq[] var7 = values();
      int[] var10000 = dar.abu();
      int var10001 = bfi();
      int var8 = var7.length;
      int axxx = var10001;
      int var9 = 0;
      int[] axxxx = var10000;

      label29:
      while (var9 < var8) {
         bdq axxxxx = var7[var9];
         int var11 = axxxxx.bme.equalsIgnoreCase(a);

         do {
            if (axxxx != null) {
               if (var11 != 0) {
                  return axxxxx;
               }

               var9++;
               var11 = axxx;
            }

            if (var11 != 0) {
               continue label29;
            }

            var11 = 2;
         } while (axxxx == null);

         cdr.apm(new String[2]);
         break;
      }

      throw new IllegalArgumentException(bdq.a[2] + a);
   }

   public String bxw() {
      return a.bme;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var25 = b ^ 72594122632372L;
      Cipher var17;
      Cipher var10000 = var17 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var18 = 1; var18 < 8; var18++) {
         var10003[var18] = (byte)(var25 << var18 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var16 = new String[2];
      int var22 = 0;
      String var21 = "\u0007C³\u0083ÿ]2?±udôõ\u008b6jjPlpïM'\u0005¡¥:F@Äý\u008e\u008cÞÀ\u0004|Â¸jðö2È\u001eþ\u0081è<¾¦`8ÿrïÍ\u008anåÐ\bã^\u0010o¬\u0087I¬æpxK\u009dZ\u001a3Ç¥«";
      int var23 = "\u0007C³\u0083ÿ]2?±udôõ\u008b6jjPlpïM'\u0005¡¥:F@Äý\u008e\u008cÞÀ\u0004|Â¸jðö2È\u001eþ\u0081è<¾¦`8ÿrïÍ\u008anåÐ\bã^\u0010o¬\u0087I¬æpxK\u009dZ\u001a3Ç¥«"
         .length();
      char var20 = '@';
      int var19 = -1;

      while (true) {
         byte[] var24 = var17.doFinal(var21.substring(++var19, var19 + var20).getBytes("ISO-8859-1"));
         String var59 = a(var24).intern();
         int var10001 = -1;
         var16[var22++] = var59;
         if ((var19 += var20) >= var23) {
            e = new HashMap(13);
            Cipher var5;
            var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var6 = 1; var6 < 8; var6++) {
               var10003[var6] = (byte)(var25 << var6 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var11 = new long[15];
            int var8 = 0;
            String var9 = "\u0081|wYk\u001c\u0084(®\u009a+Àê¢úN®å\u009c1iÓ÷õ\u0094bUæ=\u0006\u0085µF£R\u0004\u0006ê¦yÁ¨¯ÆjrÿÓ\u0086¦â\u001ao6öîz§^{Þé/\u009b\u009b\u0016ç®l\u000e2\u009b\u0007ê.<r¼rÃ\u009aÚe\u001eÉ\u00076pl\u0007qæ?RÁV~øë¥\u001c#US";
            int var10 = "\u0081|wYk\u001c\u0084(®\u009a+Àê¢úN®å\u009c1iÓ÷õ\u0094bUæ=\u0006\u0085µF£R\u0004\u0006ê¦yÁ¨¯ÆjrÿÓ\u0086¦â\u001ao6öîz§^{Þé/\u009b\u009b\u0016ç®l\u000e2\u009b\u0007ê.<r¼rÃ\u009aÚe\u001eÉ\u00076pl\u0007qæ?RÁV~øë¥\u001c#US"
               .length();
            byte var7 = 0;

            label66:
            while (true) {
               var10001 = var7;
               var7 += 8;
               byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
               long[] var39 = var11;
               var10001 = var8++;
               long var62 = (var12[0] & 255L) << 56
                  | (var12[1] & 255L) << 48
                  | (var12[2] & 255L) << 40
                  | (var12[3] & 255L) << 32
                  | (var12[4] & 255L) << 24
                  | (var12[5] & 255L) << 16
                  | (var12[6] & 255L) << 8
                  | var12[7] & 255L;
               byte var70 = -1;

               while (true) {
                  long var13 = var62;
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
                  long var74 = (var15[0] & 255L) << 56
                     | (var15[1] & 255L) << 48
                     | (var15[2] & 255L) << 40
                     | (var15[3] & 255L) << 32
                     | (var15[4] & 255L) << 24
                     | (var15[5] & 255L) << 16
                     | (var15[6] & 255L) << 8
                     | var15[7] & 255L;
                  switch (var70) {
                     case 0:
                        var39[var10001] = var74;
                        if (var7 >= var10) {
                           c = var11;
                           d = new Integer[15];
                           Cipher var0;
                           var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                           var10002 = SecretKeyFactory.getInstance("DES");
                           var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                           for (int var1 = 1; var1 < 8; var1++) {
                              var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
                           }

                           var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                           long var2 = 6204825237109910564L;
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
                           long var65 = (var4[0] & 255L) << 56
                              | (var4[1] & 255L) << 48
                              | (var4[2] & 255L) << 40
                              | (var4[3] & 255L) << 32
                              | (var4[4] & 255L) << 24
                              | (var4[5] & 255L) << 16
                              | (var4[6] & 255L) << 8
                              | var4[7] & 255L;
                           byte var52 = -1;
                           f = var65;
                           short var41 = 25472;
                           long var53 = 4612638270054690024L ^ var25;
                           String[] var32 = new String[7];
                           short var42 = 8275;
                           int var30 = 0;
                           String var29;
                           int var31 = (var29 = var16[0]).length();
                           cki(0);
                           long var54 = 7825268252585471795L ^ var25;
                           char var28 = '\b';
                           int var36 = -1;

                           label50:
                           while (true) {
                              short var43 = 24881;
                              long var55 = 7221583024538709584L ^ var25;
                              byte var44 = 121;
                              String var56 = var29.substring(++var36, var36 + var28);
                              byte var66 = -1;

                              while (true) {
                                 String var45 = a(var44, a(var56));
                                 switch (var66) {
                                    case 0:
                                       var32[var30++] = var45;
                                       if ((var36 += var28) >= var31) {
                                          a = var32;
                                          String[] var37 = a;
                                          short var73 = 28465;
                                          var74 = 7321861352567464022L ^ var25;
                                          WEEKLY = new bdq(var37[1]);
                                          MONTHLY = new bdq(var37[5]);
                                          LIFETIME = new bdq(var37[0]);
                                          return;
                                       }

                                       var28 = var29.charAt(var36);
                                       break;
                                    default:
                                       var32[var30++] = var45;
                                       if ((var36 += var28) < var31) {
                                          var28 = var29.charAt(var36);
                                          continue label50;
                                       }

                                       var31 = (var29 = var16[1]).length();
                                       short var46 = 25472;
                                       long var57 = 4612638270054690024L ^ var25;
                                       var28 = 7;
                                       var36 = -1;
                                 }

                                 short var47 = 14096;
                                 long var58 = 1346780079571351666L ^ var25;
                                 var44 = 107;
                                 var56 = var29.substring(++var36, var36 + var28);
                                 var66 = 0;
                              }
                           }
                        }
                        break;
                     default:
                        var39[var10001] = var74;
                        if (var7 < var10) {
                           continue label66;
                        }

                        var9 = "ØYJ4\n\u0082þG\u008ecd\bVdXG";
                        var10 = "ØYJ4\n\u0082þG\u008ecd\bVdXG".length();
                        var7 = 0;
                  }

                  byte var51 = var7;
                  var7 += 8;
                  var12 = var9.substring(var51, var7).getBytes("ISO-8859-1");
                  var39 = var11;
                  var10001 = var8++;
                  var62 = (var12[0] & 255L) << 56
                     | (var12[1] & 255L) << 48
                     | (var12[2] & 255L) << 40
                     | (var12[3] & 255L) << 32
                     | (var12[4] & 255L) << 24
                     | (var12[5] & 255L) << 16
                     | (var12[6] & 255L) << 8
                     | var12[7] & 255L;
                  var70 = 0;
               }
            }
         }

         var20 = var21.charAt(var19);
      }
   }

   public static void cki(int var0) {
      heh = var0;
   }

   public static int bdi() {
      return heh;
   }

   public static int bfi() {
      long var0 = b ^ 1978960495621L;
      int[] var2 = dar.abu();
      int var3 = bdi();
      int var10000 = var3;
      if (var2 != null) {
         if (var3 == 0) {
            short var4 = 15742;
            long var10001 = 4971473586202909355L ^ var0;
            return 98;
         }

         var10000 = 0;
      }

      return var10000;
   }

   private static char[] a(String var0) {
      long var1 = b ^ 76767100829818L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 7410;
         long var10005 = 4814760879017721683L ^ var1;
         var10000[0] = (char)(var10003 ^ 'W');
      }

      return var10000;
   }

   private static String a(int var0, char[] var1) {
      long var2 = b ^ 7342630923593L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 2345;
         long var10009 = 1212968399622277053L ^ var2;
         byte var10;
         switch (var4 % 7) {
            case 0:
               var10 = 17530;
               long var23 = 2936631130867649261L ^ var2;
               var10 = 9;
               break;
            case 1:
               var10 = 24899;
               long var22 = 7470130806248599509L ^ var2;
               var10 = 50;
               break;
            case 2:
               var10 = 22835;
               long var21 = 9037059763452696482L ^ var2;
               var10 = 9;
               break;
            case 3:
               var10 = 28093;
               long var20 = 191176644294697763L ^ var2;
               var10 = 114;
               break;
            case 4:
               var10 = 11059;
               long var19 = 2409573364237084067L ^ var2;
               var10 = 50;
               break;
            case 5:
               var10 = 29786;
               long var18 = 2887801944915212994L ^ var2;
               var10 = 28;
               break;
            default:
               var10 = 27884;
               long var17 = 7747544476008800895L ^ var2;
               var10 = 87;
         }

         var10001[var4] = (char)(var10005 ^ var10002 ^ var10);
      }

      return new String(var10001).intern();
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23799;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/bdq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
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
         throw new RuntimeException("cc/astralis/bdq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
