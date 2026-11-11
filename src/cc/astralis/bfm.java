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

public enum bfm {
   COMBAT,
   MOVEMENT,
   WORLD,
   PLAYER,
   VISUAL,
   EXPLOIT,
   CLIENT;

   private final String gta;
   private static int gbm;
   private static ffn[] foh;
   private static final long a = 64132037563882L;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;

   private bfm(String a) {
      a.gta = a;
   }

   public String eai() {
      return a.gta;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var20 = a ^ 33285445897607L;
      if (auf() != null) {
         em(new ffn[3]);
      }

      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var20 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[14];
      int var17 = 0;
      String var16 = "¹Y½\\Ç iÖ\b³Ódâ[ê\u0091k\b-©=/ZTJ\u008b\béòRm\u008f5\u007fÓ\b<\u00adi\u009d \u0019\u0013-\bìÞâ\u0097\u008dÑVþ\b^Ó\u0003-rÅ¿\u0088\b°\u0084\u000fí'\u0006Mº\bü\u001a\u0018ü\u0017\u0097)¿\u0010©=Ð\u0015\u008d²å¥·\u0097p}*Zp\u008a\bJ\u0090\u0014£@\u0099æ\u009e\u0010äg\u00031ØWò\u0011x\u000b\"S1\u0088ÞÓ";
      int var18 = "¹Y½\\Ç iÖ\b³Ódâ[ê\u0091k\b-©=/ZTJ\u008b\béòRm\u008f5\u007fÓ\b<\u00adi\u009d \u0019\u0013-\bìÞâ\u0097\u008dÑVþ\b^Ó\u0003-rÅ¿\u0088\b°\u0084\u000fí'\u0006Mº\bü\u001a\u0018ü\u0017\u0097)¿\u0010©=Ð\u0015\u008d²å¥·\u0097p}*Zp\u008a\bJ\u0090\u0014£@\u0099æ\u009e\u0010äg\u00031ØWò\u0011x\u000b\"S1\u0088ÞÓ"
         .length();
      char var15 = '\b';
      int var24 = -1;

      label58:
      while (true) {
         String var25 = var16.substring(++var24, var24 + var15);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var12.doFinal(var25.getBytes("ISO-8859-1"));
            String var38 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var11[var17++] = var38;
                  if ((var24 += var15) >= var18) {
                     d = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[5];
                     int var3 = 0;
                     String var4 = "ç\u000b¶í\u0016c\u0096Ø\b/¤½K\u008bVw´±&\u0084Ô\u0015J\u0091";
                     int var5 = "ç\u000b¶í\u0016c\u0096Ø\b/¤½K\u008bVw´±&\u0084Ô\u0015J\u0091".length();
                     byte var2 = 0;

                     label40:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var42 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var8 = var42;
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
                           long var47 = (var10[0] & 255L) << 56
                              | (var10[1] & 255L) << 48
                              | (var10[2] & 255L) << 40
                              | (var10[3] & 255L) << 32
                              | (var10[4] & 255L) << 24
                              | (var10[5] & 255L) << 16
                              | (var10[6] & 255L) << 8
                              | var10[7] & 255L;
                           switch (var45) {
                              case 0:
                                 var28[var10001] = var47;
                                 if (var2 >= var5) {
                                    b = var6;
                                    c = new Integer[5];
                                    short var29 = 20479;
                                    long var36 = 8415668347169245928L ^ var20;
                                    COMBAT = new bfm(var11[2]);
                                    efy(22);
                                    MOVEMENT = new bfm(var11[11]);
                                    WORLD = new bfm(var11[12]);
                                    PLAYER = new bfm(var11[3]);
                                    VISUAL = new bfm(var11[5]);
                                    EXPLOIT = new bfm(var11[6]);
                                    CLIENT = new bfm(var11[0]);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var47;
                                 if (var2 < var5) {
                                    continue label40;
                                 }

                                 var4 = "_0|H²eÛ\u0085¨\u0099×AéÝR\u0006";
                                 var5 = "_0|H²eÛ\u0085¨\u0099×AéÝR\u0006".length();
                                 var2 = 0;
                           }

                           byte var35 = var2;
                           var2 += 8;
                           var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var42 = (var7[0] & 255L) << 56
                              | (var7[1] & 255L) << 48
                              | (var7[2] & 255L) << 40
                              | (var7[3] & 255L) << 32
                              | (var7[4] & 255L) << 24
                              | (var7[5] & 255L) << 16
                              | (var7[6] & 255L) << 8
                              | var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var15 = var16.charAt(var24);
                  break;
               default:
                  var11[var17++] = var38;
                  if ((var24 += var15) < var18) {
                     var15 = var16.charAt(var24);
                     continue label58;
                  }

                  var16 = "Þ)\u0088\u001f[ÎÀ\u0016\bøÇ\u0095H\u0016SË^";
                  var18 = "Þ)\u0088\u001f[ÎÀ\u0016\bøÇ\u0095H\u0016SË^".length();
                  var15 = '\b';
                  var24 = -1;
            }

            var25 = var16.substring(++var24, var24 + var15);
            var10001 = 0;
         }
      }
   }

   public static void efy(int var0) {
      gbm = var0;
   }

   public static int cmu() {
      return gbm;
   }

   public static int egc() {
      long var0 = a ^ 877379365480L;
      int[] var2 = dar.abu();
      int var3 = cmu();
      int var10000 = var3;
      if (var2 != null) {
         if (var3 == 0) {
            short var4 = 32608;
            long var10001 = 3182213891602931097L ^ var0;
            return 67;
         }

         var10000 = 0;
      }

      return var10000;
   }

   public static void em(ffn[] var0) {
      foh = var0;
   }

   public static ffn[] auf() {
      return foh;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23931;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/bfm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
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
         throw new RuntimeException("cc/astralis/bfm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
