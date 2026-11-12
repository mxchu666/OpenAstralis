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

public class fvh extends brc {
   private String cwq;
   private String eyk;
   private static String[] euj;
   private static final String[] c;
   private static final long b = 124810866834040L;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public fvh() {
      super(5);
   }

   public fvh(String header, String message) {
      super(5);
      a.cwq = a;
      a.eyk = a;
   }

   @Override
   public void etg(JsonObject jsonObject) {
      a.cps(a);
      String[] var2 = c;
      a.cwq = a.get(var2[3]).getAsString();
      a.eyk = a.get(var2[5]).getAsString();
   }

   @Override
   public String cql() {
      JsonObject a = a.fdo();
      Object[] var10002 = new Object[4];
      String[] var2 = c;
      var10002[0] = var2[1];
      var10002[1] = a.cwq;
      var10002[2] = var2[0];
      var10002[3] = a.eyk;
      a.eqw(a, var10002);
      return fz.dvr(a.toString(), cni.fsi(var2[4]), cni.fsi(var2[2]));
   }

   public String gmc() {
      return a.cwq;
   }

   public String akn() {
      return a.eyk;
   }

   public static void gvg(String[] var0) {
      euj = var0;
   }

   public static String[] epq() {
      return euj;
   }

   static {
      long var20 = b ^ 31057017289835L;
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
      String var16 = "VØ®n]#\u009c\u001bÆ\u00903\u0010\u008fÁ\u000b0?À\u0095:uh»\u008eõÞ\u009c@\u0014±ä\u009fÊñt\u0083¯µ\u008c!µ\u008cÅ\u009e®ã\u0004ä\u0005×z\u0097Ôc`þx\u0083H/>L´{?\u0011º\u008bÈè\u001b´÷ÅµÍ\u0099Ø75äïÌÃ\u008d|[ð¬kI\b¹Eã*3\u0013íß\bÀ¾Û\u009d\u008cJÀc=ÑR³|\u008dâ\u0003½\u0019\u0094\u008d6Tg\u0096\u0091Ô×Wxã$ª»Z¾ó¹\u0096Á\u0016ëKÄ×&® :\u001aH½>[ÃÙyåúú\u0012\u007f\u008a\u0088uÞT¡}L\u0017)\u008a,Jô\n";
      int var18 = "VØ®n]#\u009c\u001bÆ\u00903\u0010\u008fÁ\u000b0?À\u0095:uh»\u008eõÞ\u009c@\u0014±ä\u009fÊñt\u0083¯µ\u008c!µ\u008cÅ\u009e®ã\u0004ä\u0005×z\u0097Ôc`þx\u0083H/>L´{?\u0011º\u008bÈè\u001b´÷ÅµÍ\u0099Ø75äïÌÃ\u008d|[ð¬kI\b¹Eã*3\u0013íß\bÀ¾Û\u009d\u008cJÀc=ÑR³|\u008dâ\u0003½\u0019\u0094\u008d6Tg\u0096\u0091Ô×Wxã$ª»Z¾ó¹\u0096Á\u0016ëKÄ×&® :\u001aH½>[ÃÙyåúú\u0012\u007f\u008a\u0088uÞT¡}L\u0017)\u008a,Jô\n"
         .length();
      char var15 = '8';
      int var14 = -1;

      while (true) {
         byte[] var19 = var12.doFinal(var16.substring(++var14, var14 + var15).getBytes("ISO-8859-1"));
         String var52 = b(var19).intern();
         int var10001 = -1;
         var11[var17++] = var52;
         if ((var14 += var15) >= var18) {
            i = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[14];
            int var3 = 0;
            String var4 = "IÝ½óFè'ã\u008bÛÍ\u0098k\u0010Nïª\u0089tÃV\u001cÖfïZ«fYâ¹\u0007\u009a\rªQp\u008do4\u0005\u0088BlzÇU/ÑeæÌ\u0012Lö¢ÓÛ\u001bý±÷\u0018\u000b¼q\u008aMs\tÒq¨{cë\u0084~¤\u0005w¾\u0098\u0086Br\u001eÿ8*®ì\u009dª;\u0099";
            int var5 = "IÝ½óFè'ã\u008bÛÍ\u0098k\u0010Nïª\u0089tÃV\u001cÖfïZ«fYâ¹\u0007\u009a\rªQp\u008do4\u0005\u0088BlzÇU/ÑeæÌ\u0012Lö¢ÓÛ\u001bý±÷\u0018\u000b¼q\u008aMs\tÒq¨{cë\u0084~¤\u0005w¾\u0098\u0086Br\u001eÿ8*®ì\u009dª;\u0099"
               .length();
            byte var2 = 0;

            label54:
            while (true) {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               long[] var33 = var6;
               var10001 = var3++;
               long var55 = (var7[0] & 255L) << 56
                  | (var7[1] & 255L) << 48
                  | (var7[2] & 255L) << 40
                  | (var7[3] & 255L) << 32
                  | (var7[4] & 255L) << 24
                  | (var7[5] & 255L) << 16
                  | (var7[6] & 255L) << 8
                  | var7[7] & 255L;
               byte var61 = -1;

               while (true) {
                  long var8 = var55;
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
                  long var63 = (var10[0] & 255L) << 56
                     | (var10[1] & 255L) << 48
                     | (var10[2] & 255L) << 40
                     | (var10[3] & 255L) << 32
                     | (var10[4] & 255L) << 24
                     | (var10[5] & 255L) << 16
                     | (var10[6] & 255L) << 8
                     | var10[7] & 255L;
                  switch (var61) {
                     case 0:
                        var33[var10001] = var63;
                        if (var2 >= var5) {
                           g = var6;
                           h = new Integer[14];
                           short var34 = 8435;
                           long var46 = 1348846798297481500L ^ var20;
                           String[] var27 = new String[6];
                           short var35 = 17221;
                           int var25 = 0;
                           long var47 = 5755532835662176941L ^ var20;
                           String var24;
                           int var26 = (var24 = var11[1]).length();
                           char var23 = 7;
                           String[] var36 = new String[2];
                           int var31 = -1;
                           gvg(var36);

                           label44:
                           while (true) {
                              short var37 = 21633;
                              long var48 = 5151019575038621039L ^ var20;
                              byte var38 = 48;
                              String var49 = var24.substring(++var31, var31 + var23);
                              byte var57 = -1;

                              while (true) {
                                 String var39 = b(var38, b(var49));
                                 switch (var57) {
                                    case 0:
                                       var27[var25++] = var39;
                                       if ((var31 += var23) >= var26) {
                                          c = var27;
                                          return;
                                       }

                                       var23 = var24.charAt(var31);
                                       break;
                                    default:
                                       var27[var25++] = var39;
                                       if ((var31 += var23) < var26) {
                                          var23 = var24.charAt(var31);
                                          continue label44;
                                       }

                                       var26 = (var24 = var11[0]).length();
                                       short var40 = 16320;
                                       long var50 = 637938748824968737L ^ var20;
                                       var23 = ',';
                                       var31 = -1;
                                 }

                                 short var41 = 8724;
                                 long var51 = 1693093009722098681L ^ var20;
                                 var38 = 75;
                                 var49 = var24.substring(++var31, var31 + var23);
                                 var57 = 0;
                              }
                           }
                        }
                        break;
                     default:
                        var33[var10001] = var63;
                        if (var2 < var5) {
                           continue label54;
                        }

                        var4 = "m \u0081\u000f6$~\u0083\u0087ÎAôF{9Ë";
                        var5 = "m \u0081\u000f6$~\u0083\u0087ÎAôF{9Ë".length();
                        var2 = 0;
                  }

                  byte var45 = var2;
                  var2 += 8;
                  var7 = var4.substring(var45, var2).getBytes("ISO-8859-1");
                  var33 = var6;
                  var10001 = var3++;
                  var55 = (var7[0] & 255L) << 56
                     | (var7[1] & 255L) << 48
                     | (var7[2] & 255L) << 40
                     | (var7[3] & 255L) << 32
                     | (var7[4] & 255L) << 24
                     | (var7[5] & 255L) << 16
                     | (var7[6] & 255L) << 8
                     | var7[7] & 255L;
                  var61 = 0;
               }
            }
         }

         var15 = var16.charAt(var14);
      }
   }

   private static char[] b(String var0) {
      long var1 = b ^ 129527921828322L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 27371;
         long var10005 = 7282483434329560713L ^ var1;
         var10000[0] = (char)(var10003 ^ 'p');
      }

      return var10000;
   }

   private static String b(int var0, char[] var1) {
      long var2 = b ^ 15776600342754L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 14292;
         long var10009 = 2328994004230974142L ^ var2;
         byte var10;
         switch (var4 % 7) {
            case 0:
               var10 = 12148;
               long var23 = 8015609686248174106L ^ var2;
               var10 = 54;
               break;
            case 1:
               var10 = 27131;
               long var22 = 39158387528266904L ^ var2;
               var10 = 16;
               break;
            case 2:
               var10 = 21444;
               long var21 = 7332702329268915885L ^ var2;
               var10 = 85;
               break;
            case 3:
               var10 = 18639;
               long var20 = 7016307288698738095L ^ var2;
               var10 = 56;
               break;
            case 4:
               var10 = 13791;
               long var19 = 7994316622752393396L ^ var2;
               var10 = 41;
               break;
            case 5:
               var10 = 15887;
               long var18 = 4209821047818953578L ^ var2;
               var10 = 109;
               break;
            default:
               var10 = 17462;
               long var17 = 8734071210628241753L ^ var2;
               var10 = 112;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26616;
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
            throw new RuntimeException("cc/astralis/fvh", var14);
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
         throw new RuntimeException("cc/astralis/fvh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
