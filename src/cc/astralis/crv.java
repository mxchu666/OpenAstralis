package cc.astralis;

import java.awt.Color;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_11909;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_4185;
import net.minecraft.class_437;
import net.minecraft.class_4185.class_7840;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWDropCallback;

public class crv extends class_437 implements dlc {
   private static final ArrayList<gfv> bgv;
   private GLFWDropCallback gxh;
   private static boolean cqb;
   private static final long a = 27782558579940L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public crv() {
      long a = crv.a ^ 37356789429789L;
      short var10001 = 23722;
      long var10002 = 171321251806398838L ^ a;
      super(class_2561.method_30163("Alt Manager"));
      dar.gqy().fyf().glu(a);
   }

   public void method_25426() {
      long a = crv.a ^ 111586659388786L;
      super.method_25426();
      long ax = chi.method_22683().method_4490();
      a.gxh = GLFWDropCallback.create((axx, axxx, axxxx) -> {
         long axxx = crv.a ^ 113595915006243L;
         int[] var10000x = dar.abu();
         int axxxx = 0;
         int[] axxxxx = var10000x;

         while (axxxx < axxx) {
            String axxxxxx = GLFWDropCallback.getName(axxxx, axxxx);
            if (axxxxx != null) {
               short var10001x = 745;
               long var10002x = 228291720540950538L ^ axxx;
               if (axxxxxx.endsWith(".txt")) {
                  ehy.crq(new File(axxxxxx), true);
               }

               axxxx++;
            }

            if (axxxxx == null) {
               break;
            }
         }
      });
      GLFW.glfwSetDropCallback(ax, a.gxh);
      short var10000 = 29191;
      long var10001 = 5517023955399761079L ^ a;
      class_7840 var11 = class_4185.method_46430(class_2561.method_43470("Add Alt"), axx -> chi.method_1507(new cv(true)));
      short var19 = 5638;
      long var10002 = 4732033751139656758L ^ a;
      short var26 = 19698;
      long var10003 = 8828073084797845194L ^ a;
      class_7840 axx = var11.method_46437(100, 20);
      var10000 = 15382;
      var10001 = 6829653294662685344L ^ a;
      class_7840 var13 = class_4185.method_46430(class_2561.method_43470("Direct Login"), axxx -> chi.method_1507(new cv(false)));
      short var21 = 9722;
      var10002 = 6941599454504916934L ^ a;
      short var28 = 15029;
      var10003 = 7381789636264790146L ^ a;
      class_7840 axxx = var13.method_46437(100, 20);
      String var14 = String.valueOf(dkz() ? class_124.field_1060 : class_124.field_1061);
      int axxxx = dkz();
      String var10 = var14;
      var10000 = 17626;
      var10001 = 6179152490770590317L ^ a;
      class_7840 var16 = class_4185.method_46430(class_2561.method_43470("Encryption " + var10 + axxxx), axxxxx -> {
         long ax = crv.a ^ 118650718670398L;
         int[] var3x = dar.abu();
         boolean var10000x = cqb;
         if (var3x != null) {
            var10000x = !cqb;
         }

         cqb = var10000x;
      });
      short var23 = 9722;
      var10002 = 6941599454504916934L ^ a;
      short var30 = 15029;
      var10003 = 7381789636264790146L ^ a;
      class_7840 axxxxx = var16.method_46437(100, 20);
      var10000 = 13530;
      var10001 = 538968943327418990L ^ a;
      class_7840 var18 = class_4185.method_46430(class_2561.method_43470("YYY Alts (Best Alt Shop)"), axxxxxx -> {
         long ax = crv.a ^ 136883112796767L;

         try {
            short var10000x = 23560;
            long var10001x = 5454546898617294224L ^ ax;
            hhl.fua("https://discord.gg/CxXjUVfqbj");
         } catch (Exception var4) {
            var4.printStackTrace();
         }
      });
      short var25 = 9722;
      var10002 = 6941599454504916934L ^ a;
      short var32 = 15029;
      var10003 = 7381789636264790146L ^ a;
      class_7840 axxxxxx = var18.method_46437(100, 20);
      short var33 = 29962;
      var10003 = 2401550847430051639L ^ a;
      short var41 = 2893;
      long var10004 = 2151810141508876658L ^ a;
      a.method_37063(axxxxxx.method_46433(10, 115).method_46431());
      short var34 = 9658;
      var10003 = 5875241241177298827L ^ a;
      short var43 = 11856;
      var10004 = 732884475186191470L ^ a;
      a.method_37063(axx.method_46433(10, 40).method_46431());
      short var35 = 9658;
      var10003 = 5875241241177298827L ^ a;
      short var45 = 5446;
      var10004 = 4216118327542425460L ^ a;
      a.method_37063(axxx.method_46433(10, 65).method_46431());
      short var36 = 9658;
      var10003 = 5875241241177298827L ^ a;
      short var47 = 2833;
      var10004 = 3590572336919197992L ^ a;
      a.method_37063(axxxxx.method_46433(10, 90).method_46431());
   }

   public void method_25394(class_332 context, int mouseX, int mouseY, float delta) {
      long ax = crv.a ^ 120429526997764L;
      dfr.bmt(
         () -> {
            long ax = crv.a ^ 47124316288884L;
            float axx = 120.0F;
            float axxx = 20.0F;
            int[] var10000 = dar.abu();
            short var10002x = 3792;
            long var10003x = 8360375742866491116L ^ ax;
            float axxxx = a.field_22789 - 140;
            var10002x = 11856;
            var10003x = 732948930011014760L ^ ax;
            float axxxxx = a.field_22790 - 40;
            short var10008 = 19671;
            long var10009 = 6016872477733897442L ^ ax;
            short var23 = 11686;
            long var10010 = 4109043965796984213L ^ ax;
            short var24 = 17353;
            long var10011 = 5566710258423483385L ^ ax;
            Color var10006 = new Color(60, 60, 67);
            short var25 = 9722;
            var10011 = 6941679026610089408L ^ ax;
            short var27 = 9722;
            long var10012 = 6941679026610089408L ^ ax;
            short var28 = 10884;
            long var10013 = 3224632020238279350L ^ ax;
            dmp.dnc(axx, axxx, axxxx, axxxxx, 8.0F, var10006, 2.0F, new Color(100, 100, 110));
            float axxxxxx = 135.0F;
            float axxxxxxx = 30.0F;
            float axxxxxxxx = 150.0F;
            int[] axxxxxxxxx = var10000;
            float axxxxxxxxxx = 50.0F;
            int axxxxxxxxxxx = 0;

            while (axxxxxxxxxxx < bgv.size()) {
               gfv axxxxxxxxxxxx = bgv.get(axxxxxxxxxxx);
               int axxxxxxxxxxxxx = (int)((axxxx - 20.0F) / 160.0F);
               int axxxxxxxxxxxxxx = axxxxxxxxxxx % axxxxxxxxxxxxx;
               int axxxxxxxxxxxxxxx = axxxxxxxxxxx / axxxxxxxxxxxxx;
               float axxxxxxxxxxxxxxxx = 135.0F + axxxxxxxxxxxxxx * 160.0F;
               float axxxxxxxxxxxxxxxxx = 30.0F + axxxxxxxxxxxxxxx * 60.0F;
               if (!(axxxxxxxxxxxxxxxxx + 50.0F > axx + axxxxx - 10.0F) || axxxxxxxxx == null) {
                  axxxxxxxxxxxx.ern()
                     .feu(axxxxxxxxxxxx, axxxxxxxxxxxxxxxx, axxxxxxxxxxxxxxxxx, fuv.bfm(a, a, axxxxxxxxxxxxxxxx, axxxxxxxxxxxxxxxxx, 150.0F, 50.0F));
               }

               axxxxxxxxxxx++;
               if (axxxxxxxxx == null) {
                  break;
               }
            }
         }
      );
      super.method_25394(a, a, a, a);
      class_327 var10001 = chi.field_1772;
      String var10002 = chi.method_1548().method_1676();
      short var10003 = 8558;
      long var10004 = 6860845407642786217L ^ ax;
      a.method_51433(var10001, "Logged In With " + var10002, 3, 3, Color.white.getRGB(), true);
   }

   public void method_25419() {
      long a = crv.a ^ 47944154894816L;
      int[] var3 = dar.abu();
      crv var10000 = a;
      if (var3 != null) {
         if (a.gxh != null) {
            a.gxh.free();
            a.gxh = null;
         }

         dar.gqy().fyf().bet(a);
         hcu.asr();
         var10000 = a;
      }

      var10000.method_25419();
   }

   public void method_25420(class_332 context, int mouseX, int mouseY, float delta) {
   }

   public boolean method_25402(class_11909 click, boolean doubled) {
      long ax = crv.a ^ 28624144029180L;
      float axx = 120.0F;
      short var10001 = 29219;
      long var10002 = 7802769860491991190L ^ ax;
      float axxx = a.field_22789 - 140;
      var10001 = 12094;
      var10002 = 2845563394047542682L ^ ax;
      float axxxx = a.field_22790 - 40;
      float axxxxx = 135.0F;
      int[] var10000 = dar.abu();
      float axxxxxx = 30.0F;
      int[] axxxxxxx = var10000;
      float axxxxxxxx = 150.0F;
      float axxxxxxxxx = 50.0F;
      int axxxxxxxxxx = 0;

      while (true) {
         if (axxxxxxxxxx < bgv.size()) {
            gfv axxxxxxxxxxx = bgv.get(axxxxxxxxxx);
            int axxxxxxxxxxxx = (int)((axxx - 20.0F) / 160.0F);
            int axxxxxxxxxxxxx = axxxxxxxxxx % axxxxxxxxxxxx;
            int axxxxxxxxxxxxxx = axxxxxxxxxx / axxxxxxxxxxxx;
            float axxxxxxxxxxxxxxx = 135.0F + axxxxxxxxxxxxx * 160.0F;
            float axxxxxxxxxxxxxxxx = 30.0F + axxxxxxxxxxxxxx * 60.0F;
            float var23;
            var20 = (var23 = axxxxxxxxxxxxxxxx + 50.0F - (axx + axxxx - 10.0F)) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1);
            if (axxxxxxx == null) {
               break;
            }

            label33: {
               if (axxxxxxx != null) {
                  if (var20 > 0 && axxxxxxx != null) {
                     break label33;
                  }

                  var20 = fuv.bfm(a.comp_4798(), a.comp_4799(), axxxxxxxxxxxxxxx, axxxxxxxxxxxxxxxx, 150.0F, 50.0F);
               }

               if (var20 != 0) {
                  ehy.ckh(axxxxxxxxxxx);
               }
            }

            axxxxxxxxxx++;
            if (axxxxxxx != null) {
               continue;
            }
         }

         var20 = super.method_25402(a, a);
         break;
      }

      return (boolean)var20;
   }

   public static ArrayList<gfv> emo() {
      return bgv;
   }

   public static boolean dkz() {
      return cqb;
   }

   public static void eqt(boolean encryption) {
      cqb = a;
   }

   static {
      long var11 = a ^ 68042455696945L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[8];
      int var18 = 0;
      String var17 = "#\u0086p÷D°\u0014ÜÂáN.\u0083ûY\u0006ÑÝ\u0013\u008cwØ¯B`Vîaã\u0097ë?\u0011A\u000b\"úÛ\u009avX\u0004XûT\u0003\u001c3½°\u001a\u0001\u001cMÉ.8\u0096D\u0018k\u0005Ñé\u00126ÜG.\u001d°è^T\u000b\f\u0004r\u001cßù'µ0Ó\u0019Ü\b\u000fÕY¨\u0018)@\u000eëkÉ|R\u001bÌµ\u0091qÙ\u0002ù;Ë\u0085ø ,|\u0018Ép\u0016W¸6´8VÃuDä\u000e¡p\u001b\"k3?Ã¿¶$cû®] \u0094\u0094ö\u0099Ï\u008aûBO\u0007ãæ¸öé$\nKçú+Ãù±UÄ\u0081áLµïN A\u0097\u0003âê½²\u0089\u009cñªDÈáÆGI1á\u0088c\u0005¸©ûkÉ°iî¹0\u0010×\u0096\u0095g¶K\tGÊ\u0011\u008b¥ôgs\u0099";
      int var19 = "#\u0086p÷D°\u0014ÜÂáN.\u0083ûY\u0006ÑÝ\u0013\u008cwØ¯B`Vîaã\u0097ë?\u0011A\u000b\"úÛ\u009avX\u0004XûT\u0003\u001c3½°\u001a\u0001\u001cMÉ.8\u0096D\u0018k\u0005Ñé\u00126ÜG.\u001d°è^T\u000b\f\u0004r\u001cßù'µ0Ó\u0019Ü\b\u000fÕY¨\u0018)@\u000eëkÉ|R\u001bÌµ\u0091qÙ\u0002ù;Ë\u0085ø ,|\u0018Ép\u0016W¸6´8VÃuDä\u000e¡p\u001b\"k3?Ã¿¶$cû®] \u0094\u0094ö\u0099Ï\u008aûBO\u0007ãæ¸öé$\nKçú+Ãù±UÄ\u0081áLµïN A\u0097\u0003âê½²\u0089\u009cñªDÈáÆGI1á\u0088c\u0005¸©ûkÉ°iî¹0\u0010×\u0096\u0095g¶K\tGÊ\u0011\u008b¥ôgs\u0099"
         .length();
      char var16 = '8';
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
                     c = new String[8];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[17];
                     int var3 = 0;
                     String var4 = "ûtÐ³ì\u008aî\u0016ê²s½¶~_'ÊÉèZLôq \u0080:rhkJ\u0001?¶´OB§æ\u0085RÞu³@Ë«\u0015sÌ\u0006º^o\u0090<\bÿ\rÍ\u0013È\u0092ÉÐ[è\u0096\u000b^N×ÚÒ\u0085\u001a^z\\ß>àyrÕ\u001bª\u0018\u0019\u0082\u0002\u009awáákï³\u001b1vwC-\u0087Þ8Þõ\u0016õ\u0014¼4¯pàÔr\u0010\u009e";
                     int var5 = "ûtÐ³ì\u008aî\u0016ê²s½¶~_'ÊÉèZLôq \u0080:rhkJ\u0001?¶´OB§æ\u0085RÞu³@Ë«\u0015sÌ\u0006º^o\u0090<\bÿ\rÍ\u0013È\u0092ÉÐ[è\u0096\u000b^N×ÚÒ\u0085\u001a^z\\ß>àyrÕ\u001bª\u0018\u0019\u0082\u0002\u009awáákï³\u001b1vwC-\u0087Þ8Þõ\u0016õ\u0014¼4¯pàÔr\u0010\u009e"
                        .length();
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
                                    f = new Integer[17];
                                    bgv = new ArrayList<>();
                                    cqb = false;
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u000e%g¸ßîdÍ\u0019Í<Á\u007f\u001e4ö";
                                 var5 = "\u000e%g¸ßîdÍ\u0019Í<Á\u007f\u001e4ö".length();
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

                  var17 = "©\u0085Iz{^áü·è¸z\u0092\u0002ÌPí\\\rAe¢î{\u0010üÃ\u0007}§) ¦\u009f\u009e¡\u001f×hnm";
                  var19 = "©\u0085Iz{^áü·è¸z\u0092\u0002ÌPí\\\rAe¢î{\u0010üÃ\u0007}§) ¦\u009f\u009e¡\u001f×hnm".length();
                  var16 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7971;
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
            throw new RuntimeException("cc/astralis/crv", var10);
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
         throw new RuntimeException("cc/astralis/crv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 940;
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
            throw new RuntimeException("cc/astralis/crv", var14);
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
         throw new RuntimeException("cc/astralis/crv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
