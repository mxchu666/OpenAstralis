package cc.astralis;

import java.awt.Color;
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
import net.minecraft.class_2561;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_342;
import net.minecraft.class_4185;
import net.minecraft.class_437;
import net.minecraft.class_4185.class_7840;

public class eyu extends class_437 implements dlc {
   private class_342 dlu;
   private gfv gyi;
   private static final long a = 64404719011752L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public eyu(gfv alt) {
      long ax = eyu.a ^ 86777755353591L;
      short var10001 = 32506;
      long var10002 = 6355128505346287767L ^ ax;
      super(class_2561.method_30163("Account Settings"));
      a.gyi = a;
   }

   public void method_25426() {
      long a = eyu.a ^ 53610841385306L;
      short var10000 = 3118;
      long var10001 = 7708146520668196282L ^ a;
      int ax = 200;
      var10000 = 22842;
      var10001 = 1331787285798557869L ^ a;
      int axx = 20;
      int var10005 = 27239;
      long var10006 = 5101916039578233841L ^ a;
      int var10004 = (a.field_22789 - 200) / 2;
      short var42 = 7261;
      long var10007 = 2960227982845468108L ^ a;
      var10005 = (a.field_22790 - 20) / 2;
      short var43 = 14725;
      var10007 = 3262899880088467477L ^ a;
      var10005 -= 25;
      short var44 = 27239;
      var10007 = 5101916039578233841L ^ a;
      short var47 = 7261;
      long var10008 = 2960227982845468108L ^ a;
      short var48 = 27018;
      long var10009 = 7156156816515536713L ^ a;
      a.dlu = new class_342(a.field_22793, var10004, var10005, 200, 20, class_2561.method_43470("Name"));
      var10000 = 27239;
      var10001 = 5101916039578233841L ^ a;
      int axxx = 200;
      var10000 = 7261;
      var10001 = 2960227982845468108L ^ a;
      int axxxx = 20;
      var10000 = 27364;
      var10001 = 896978421311083557L ^ a;
      class_7840 var13 = class_4185.method_46430(class_2561.method_43470("Change Skin"), axxxxx -> {});
      short var20 = 27239;
      long var10002 = 5101916039578233841L ^ a;
      short var23 = 7261;
      long var10003 = 2960227982845468108L ^ a;
      class_7840 axxxxx = var13.method_46437(200, 20);
      var10000 = 1862;
      var10001 = 6961575208250079620L ^ a;
      class_7840 var15 = class_4185.method_46430(class_2561.method_43470("Change Name"), axxxxxx -> {});
      short var22 = 27239;
      var10002 = 5101916039578233841L ^ a;
      short var25 = 7261;
      var10003 = 2960227982845468108L ^ a;
      class_7840 axxxxxx = var15.method_46437(200, 20);
      a.method_25429(a.dlu);
      short var29 = 27239;
      long var32 = 5101916039578233841L ^ a;
      int var26 = (a.field_22789 - 200) / 2;
      short var33 = 7261;
      long var39 = 2960227982845468108L ^ a;
      a.method_37063(axxxxxx.method_46433(var26, (a.field_22790 - 20) / 2).method_46431());
      short var30 = 27239;
      long var34 = 5101916039578233841L ^ a;
      int var27 = (a.field_22789 - 200) / 2;
      var33 = 7261;
      long var40 = 2960227982845468108L ^ a;
      int var31 = (a.field_22790 - 20) / 2;
      var33 = 7261;
      long var41 = 2960227982845468108L ^ a;
      a.method_37063(axxxxx.method_46433(var27, var31 + 20 + 5).method_46431());
   }

   public void method_25394(class_332 context, int mouseX, int mouseY, float delta) {
      long ax = eyu.a ^ 29909189345731L;
      super.method_25394(a, a, a, a);
      class_327 var10001 = chi.field_1772;
      class_2561 var10002 = a.method_25440();
      int var10003 = a.field_22789 / 2;
      short var10004 = 26983;
      long var10005 = 3119437391460253803L ^ ax;
      a.method_27534(var10001, var10002, var10003, 10, -1);
      var10001 = chi.field_1772;
      String var8 = chi.method_1548().method_1676();
      short var9 = 31917;
      long var10 = 4078684012015315697L ^ ax;
      a.method_51433(var10001, "Logged In With " + var8, 3, 3, Color.white.getRGB(), true);
      a.dlu.method_25394(a, a, a, a);
   }

   static {
      long var11 = a ^ 127646990662562L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[5];
      int var18 = 0;
      String var17 = " ¨]\u0019Õ\u0096\"Ç¡\u0013ù_\u0006Á\u00ad¦£L\r\u009e\u001d\u0089\u001ea\u0007Ê\u001b!x7!\u0085( Ùù$o\u0094\u0001·}\u0098ù¯¢â¶\u0019YÄEmíAÄ4\u00adèûwù¯\u0080þ0P§\u0007\u0012Y\u001a\\\u0010=½$ï\u001d\u0094Ù¦ñïÜ\u000eIjöÄ";
      int var19 = " ¨]\u0019Õ\u0096\"Ç¡\u0013ù_\u0006Á\u00ad¦£L\r\u009e\u001d\u0089\u001ea\u0007Ê\u001b!x7!\u0085( Ùù$o\u0094\u0001·}\u0098ù¯¢â¶\u0019YÄEmíAÄ4\u00adèûwù¯\u0080þ0P§\u0007\u0012Y\u001a\\\u0010=½$ï\u001d\u0094Ù¦ñïÜ\u000eIjöÄ"
         .length();
      char var16 = ' ';
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     b = var20;
                     c = new String[5];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "\u0015&f¯\u0084\u0010\u0084\u0006.\u009ai\u009bOãé\u0081\u009c$\u0083\u0092T\u0098\u0000\u009bg¡Ò\u0011Á\u0014S&";
                     int var5 = "\u0015&f¯\u0084\u0010\u0084\u0006.\u009ai\u009bOãé\u0081\u009c$\u0083\u0092T\u0098\u0000\u009bg¡Ò\u0011Á\u0014S&".length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var40 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte var43 = -1;

                        while (true) {
                           long var8 = var40;
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
                                 var28[var10001] = var45;
                                 if (var2 >= var5) {
                                    e = var6;
                                    f = new Integer[6];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u009fü\u001a÷\u0006&§\u00adãÞ\u0097st\u001få®";
                                 var5 = "\u009fü\u001a÷\u0006&§\u00adãÞ\u0097st\u001få®".length();
                                 var2 = 0;
                           }

                           byte var34 = var2;
                           var2 += 8;
                           var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var40 = (var7[0] & 255L) << 56
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

                  var16 = var17.charAt(var24);
                  break;
               default:
                  var20[var18++] = var36;
                  if ((var24 += var16) < var19) {
                     var16 = var17.charAt(var24);
                     continue label54;
                  }

                  var17 = "We\u0082\u0006_l\u0016r\u0086MTÿ~]à§f\u001d z\u001c\u008fØ\u0092ÂâÖ\u008c\u0092\rÞ¡\u0018&Ð\u0083«wõÈé\u0091\u009b£ò\u0088^Ù\u0007QïÂÉ\u0082\u0089yY";
                  var19 = "We\u0082\u0006_l\u0016r\u0086MTÿ~]à§f\u001d z\u001c\u008fØ\u0092ÂâÖ\u008c\u0092\rÞ¡\u0018&Ð\u0083«wõÈé\u0091\u009b£ò\u0088^Ù\u0007QïÂÉ\u0082\u0089yY"
                     .length();
                  var16 = ' ';
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20531;
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
            throw new RuntimeException("cc/astralis/eyu", var10);
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
         throw new RuntimeException("cc/astralis/eyu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28519;
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
            throw new RuntimeException("cc/astralis/eyu", var14);
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
         throw new RuntimeException("cc/astralis/eyu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
