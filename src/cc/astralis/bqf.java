package cc.astralis;

import astralis.mixin.accessor.BufferBuilderStorageAccessor;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
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
import net.minecraft.class_10799;
import net.minecraft.class_1297;
import net.minecraft.class_1921;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_290;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4668;
import net.minecraft.class_5611;
import net.minecraft.class_1921.class_4688;
import net.minecraft.class_4587.class_4665;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;

public class bqf implements dlc {
   public static final RenderPipeline dzt;
   public static final RenderPipeline fak;
   public static final class_1921 fgg;
   public static final class_1921 gpm;
   private static final long a = 45007057084317L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long[] h;
   private static final Long[] i;
   private static final Map j;

   public static void hjf(class_4587 stack, class_238 box, Color color, int alpha) {
      a.method_22903();
      class_243 ax = chi.field_1773.method_19418().method_19326();
      a.method_22904(a.field_1323 - ax.field_1352, a.field_1322 - ax.field_1351, a.field_1321 - ax.field_1350);
      Matrix4f axx = a.method_23760().method_23761();
      class_4598 axxx = ((BufferBuilderStorageAccessor)chi.method_22940()).getEntityVertexConsumers();
      class_4588 axxxx = axxx.method_73477(gpm);
      int axxxxx = dec.ceu(a, a).getRGB();
      float axxxxxx = (float)(a.field_1320 - a.field_1323);
      float axxxxxxx = (float)(a.field_1325 - a.field_1322);
      float axxxxxxxx = (float)(a.field_1324 - a.field_1321);
      fgy(axx, axxxx, axxxxx, 0.0F, 0.0F, axxxxxxxx, axxxxxx, 0.0F, axxxxxxxx, axxxxxx, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      fgy(axx, axxxx, axxxxx, 0.0F, axxxxxxx, 0.0F, axxxxxx, axxxxxxx, 0.0F, axxxxxx, axxxxxxx, axxxxxxxx, 0.0F, axxxxxxx, axxxxxxxx);
      fgy(axx, axxxx, axxxxx, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, axxxxxxxx, 0.0F, axxxxxxx, axxxxxxxx, 0.0F, axxxxxxx, 0.0F);
      fgy(axx, axxxx, axxxxx, axxxxxx, 0.0F, axxxxxxxx, axxxxxx, 0.0F, 0.0F, axxxxxx, axxxxxxx, 0.0F, axxxxxx, axxxxxxx, axxxxxxxx);
      fgy(axx, axxxx, axxxxx, axxxxxx, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, axxxxxxx, 0.0F, axxxxxx, axxxxxxx, 0.0F);
      fgy(axx, axxxx, axxxxx, 0.0F, 0.0F, axxxxxxxx, axxxxxx, 0.0F, axxxxxxxx, axxxxxx, axxxxxxx, axxxxxxxx, 0.0F, axxxxxxx, axxxxxxxx);
      axxx.method_37104();
      a.method_22909();
   }

   private static void fgy(
      Matrix4f a, class_4588 a, int a, float a, float a, float a, float a, float a, float a, float a, float a, float a, float a, float a, float a
   ) {
      a.method_22918(a, a, a, a).method_39415(a);
      a.method_22918(a, a, a, a).method_39415(a);
      a.method_22918(a, a, a, a).method_39415(a);
      a.method_22918(a, a, a, a).method_39415(a);
   }

   private static void dug(class_4587 a, class_4588 a, float a, float a, float a, float a, float a, float a, Color a) {
      class_4665 ax = a.method_23760();
      Matrix4f axx = ax.method_23761();
      class_243 axxx = cpi(a, a, a, a, a, a);
      float axxxx = a.getRed() / 255.0F;
      float axxxxx = a.getGreen() / 255.0F;
      float axxxxxx = a.getBlue() / 255.0F;
      a.method_22918(axx, a, a, a)
         .method_22915(axxxx, axxxxx, axxxxxx, 1.0F)
         .method_60831(ax, (float)axxx.field_1352, (float)axxx.field_1351, (float)axxx.field_1350);
      a.method_22918(axx, a, a, a)
         .method_22915(axxxx, axxxxx, axxxxxx, 1.0F)
         .method_60831(ax, (float)axxx.field_1352, (float)axxx.field_1351, (float)axxx.field_1350);
   }

   public static class_243 cpi(float x1, float y1, float z1, float x2, float y2, float z2) {
      float ax = a - a;
      float axx = a - a;
      float axxx = a - a;
      float axxxx = class_3532.method_15355(ax * ax + axx * axx + axxx * axxx);
      return new class_243(ax / axxxx, axx / axxxx, axxx / axxxx).method_1029();
   }

   public static void enm(class_4587 stack, class_1297 target) {
      long ax = bqf.a ^ 76770334382967L;
      a.method_22903();
      int[] var10000 = dar.abu();
      ezv axx = dar.gqy().aws().diy(ezv.class);
      int[] axxx = var10000;
      String axxxx = axx.eqi.dnp();
      byte axxxxx = -1;
      int var32 = axxxx.hashCode();
      if (axxx != null) {
         switch (var32) {
            case -1656737386:
               short var10001 = 20943;
               long var10002 = 6468317318610869779L ^ ax;
               var32 = axxxx.equals("Rainbow");
               if (axxx == null) {
                  break;
               }

               if (var32 != 0) {
                  axxxxx = 0;
               }
            default:
               var32 = axxxxx;
         }
      }
      Color axxxxxx = switch (var32) {
         case 0 -> {
            short var34 = 23380;
            long var39 = 912165839743806562L ^ ax;
            yield ezv.gbq(3000L, 0, 0.7F, 1.0F);
         }
         default -> dec.fbp(new class_5611(0.0F, 6.0F), axx.ehf.dnp(), axx.aoz.dnp());
      };
      String var29 = axx.eqi.dnp();
      byte axxxxxxx = -1;
      int var35 = var29.hashCode();
      if (axxx != null) {
         switch (var35) {
            case -1656737386:
               short var40 = 14613;
               long var46 = 6938821246708299467L ^ ax;
               var35 = var29.equals("Rainbow");
               if (axxx == null) {
                  break;
               }

               if (var35 != 0) {
                  axxxxxxx = 0;
               }
            default:
               var35 = axxxxxxx;
         }
      }
      Color axxxxxxxx = switch (var35) {
         case 0 -> {
            short var37 = 5070;
            long var41 = 4051667039465809146L ^ ax;
            yield ezv.gbq(4000L, 0, 1.0F, 1.0F);
         }
         default -> dec.fbp(new class_5611(0.0F, 6.0F), axx.ehf.dnp(), axx.aoz.dnp());
      };
      short var42 = 13158;
      long var47 = 3199015070355320018L ^ ax;
      Color axxxxxxxxx = dec.ceu(axxxxxx, 200);
      var42 = 29115;
      var47 = 8511707684391038478L ^ ax;
      Color var31 = dec.ceu(axxxxxxxx, 200);
      short var38 = 4815;
      long var44 = System.currentTimeMillis();
      short var49 = 10693;
      long var10003 = 791296897400413936L ^ ax;
      float axxxxxxxxxx = (float)(var44 % 3000L) / 3000.0F;
      long var45 = 4790519215233846655L ^ ax;
      float axxxxxxxxxxx = 0.15F;
      a.method_61958(a.method_30950(chi.method_61966().method_60637(true)).method_1020(chi.field_1773.method_19418().method_19326()));
      Matrix4f axxxxxxxxxxxx = a.method_23760().method_23761();
      float axxxxxxxxxxxxx = a.method_17681() * 1.2F;
      class_4598 axxxxxxxxxxxxxx = ((BufferBuilderStorageAccessor)chi.method_22940()).getEntityVertexConsumers();
      class_4588 axxxxxxxxxxxxxxx = axxxxxxxxxxxxxx.method_73477(fgg);
      int axxxxxxxxxxxxxxxx = 720;
      int axxxxxxxxxxxxxxxxx = 0;

      while (true) {
         if (axxxxxxxxxxxxxxxxx <= axxxxxxxxxxxxxxxx) {
            float axxxxxxxxxxxxxxxxxx = (float)Math.toRadians(axxxxxxxxxxxxxxxxx * 0.5F);
            double axxxxxxxxxxxxxxxxxxx = Math.sin(axxxxxxxxxxxxxxxxxx) * axxxxxxxxxxxxx;
            double axxxxxxxxxxxxxxxxxxxx = Math.cos(axxxxxxxxxxxxxxxxxx) * axxxxxxxxxxxxx;
            float axxxxxxxxxxxxxxxxxxxxx = (axxxxxxxxxx + (float)axxxxxxxxxxxxxxxxx / axxxxxxxxxxxxxxxx) % 1.0F;
            float axxxxxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxxxxxxxx * a.method_17682();
            float axxxxxxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxxxxxxxxx + axxxxxxxxxxx;
            Color axxxxxxxxxxxxxxxxxxxxxxxx = dec.azi(axxxxxxxxx, var31, 0.3F);
            Color axxxxxxxxxxxxxxxxxxxxxxxxx = dec.azi(axxxxxxxxx, var31, 0.0F);
            axxxxxxxxxxxxxxx.method_22918(axxxxxxxxxxxx, (float)axxxxxxxxxxxxxxxxxxx, axxxxxxxxxxxxxxxxxxxxxx, (float)axxxxxxxxxxxxxxxxxxxx)
               .method_39415(dar.gqy().deo().getRGB());
            axxxxxxxxxxxxxxx.method_22918(axxxxxxxxxxxx, (float)axxxxxxxxxxxxxxxxxxx, axxxxxxxxxxxxxxxxxxxxxxx, (float)axxxxxxxxxxxxxxxxxxxx)
               .method_39415(dar.gqy().cxj().getRGB());
            axxxxxxxxxxxxxxxxx++;
            if (axxx == null) {
               break;
            }

            if (axxx != null) {
               continue;
            }
         }

         axxxxxxxxxxxxxx.method_37104();
         a.method_22909();
         break;
      }
   }

   public static void dd(class_4587 stack, class_243 pos, float size, int alpha) {
      long ax = bqf.a ^ 115789511517961L;
      int[] var10000 = dar.abu();
      a.method_22903();
      class_243 axx = chi.field_1773.method_19418().method_19326();
      a.method_22904(a.field_1352 - axx.field_1352, a.field_1351 - axx.field_1351, a.field_1350 - axx.field_1350);
      int[] axxx = var10000;
      Matrix4f axxxx = a.method_23760().method_23761();
      class_4598 axxxxx = ((BufferBuilderStorageAccessor)chi.method_22940()).getEntityVertexConsumers();
      class_4588 axxxxxx = axxxxx.method_73477(class_1921.method_49043(1.0));
      short var21 = 28835;
      long var10001 = 3790110190128059244L ^ ax;
      GL11.glEnable(2848);
      int axxxxxxx = 0;

      while (true) {
         byte var26 = 99;
         long var10002 = 4347237011424027567L ^ ax;
         if (axxxxxxx <= 360) {
            double axxxxxxxx = Math.toRadians(axxxxxxx);
            float axxxxxxxxx = (float)Math.sin(axxxxxxxx) * a;
            float axxxxxxxxxx = (float)Math.cos(axxxxxxxx) * a;
            ezv axxxxxxxxxxx = dar.gqy().aws().diy(ezv.class);
            String axxxxxxxxxxxx = axxxxxxxxxxx.eqi.dnp();
            byte var19 = -1;
            var22 = axxxxxxxxxxxx.hashCode();
            if (axxx == null) {
               break;
            }

            if (axxx != null) {
               switch (var22) {
                  case -1656737386:
                     short var27 = 14613;
                     var10002 = 6938791057983949493L ^ ax;
                     var22 = axxxxxxxxxxxx.equals("Rainbow");
                     if (axxx == null) {
                        break;
                     }

                     if (var22 != 0) {
                        var19 = 0;
                     }
                  default:
                     var22 = var19;
               }
            }
            Color axxxxxxxxxxxxx = switch (var22) {
               case 0 -> {
                  short var24 = 10693;
                  var10001 = 791345769362416270L ^ ax;
                  yield ezv.gbq(3000L, 0, 0.7F, 1.0F);
               }
               default -> dec.fbp(new class_5611(0.0F, 6.0F), axxxxxxxxxxx.ehf.dnp(), axxxxxxxxxxx.aoz.dnp());
            };
            Color axxxxxxxxxxxxxx = dec.ceu(axxxxxxxxxxxxx, a);
            axxxxxx.method_22918(axxxx, axxxxxxxxx, 0.01F, axxxxxxxxxx)
               .method_1336(axxxxxxxxxxxxxx.getRed(), axxxxxxxxxxxxxx.getGreen(), axxxxxxxxxxxxxx.getBlue(), axxxxxxxxxxxxxx.getAlpha());
            axxxxxxx++;
            if (axxx != null) {
               continue;
            }
         }

         axxxxx.method_37104();
         short var25 = 25324;
         var10001 = 5981950142919786789L ^ ax;
         var22 = 2848;
         break;
      }

      GL11.glDisable(var22);
      a.method_22909();
   }

   public static void aag(class_4587 stack, class_1297 target, float size) {
      long ax = bqf.a ^ 89475383544946L;
      a.method_22903();
      int[] var10000 = dar.abu();
      class_243 axx = a.method_30950(chi.method_61966().method_60637(true));
      class_243 axxx = chi.field_1773.method_19418().method_19326();
      int[] axxxx = var10000;
      a.method_22904(axx.field_1352 - axxx.field_1352, axx.field_1351 - axxx.field_1351, axx.field_1350 - axxx.field_1350);
      Matrix4f axxxxx = a.method_23760().method_23761();
      class_4598 axxxxxx = ((BufferBuilderStorageAccessor)chi.method_22940()).getEntityVertexConsumers();
      class_4588 axxxxxxx = axxxxxx.method_73477(class_1921.method_49043(1.0));
      GL11.glEnable(b<"y">(25324, 5981941225414257246L ^ ax));
      int axxxxxxxx = 0;

      while (true) {
         if (axxxxxxxx <= b<"y">(7582, 8597738751812998438L ^ ax)) {
            double axxxxxxxxx = Math.toRadians(axxxxxxxx);
            float axxxxxxxxxx = (float)Math.sin(axxxxxxxxx) * a;
            float axxxxxxxxxxx = (float)Math.cos(axxxxxxxxx) * a;
            axxxxxxx.method_22918(axxxxx, axxxxxxxxxx, 0.01F, axxxxxxxxxxx).method_39415(dar.gqy().deo().getRGB());
            axxxxxxxx++;
            if (axxxx == null) {
               break;
            }

            if (axxxx != null) {
               continue;
            }
         }

         axxxxxx.method_37104();
         GL11.glDisable(b<"y">(25324, 5981941225414257246L ^ ax));
         a.method_22909();
         break;
      }
   }

   public static float gsi() {
      return chi.method_61966().method_60638();
   }

   public static double fev(double input) {
      return Math.abs(1.0 + Math.sin(a)) / 2.0;
   }

   static {
      long var31 = a ^ 131129639348690L;
      Cipher var22;
      Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var23 = 1; var23 < 8; var23++) {
         var10003[var23] = (byte)(var31 << var23 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var29 = new String[6];
      int var27 = 0;
      String var26 = "Á´y\u0010\b\u001e3tàÏLi7zw\u0010ð\u007fge¦Mu¡\u0007Á\nj×\u0085èî)Õ«Î\u000e÷r¥\u0092\u001dLXC\n\u0098(Seå\u0085\u00ad³\u001d\b\u0010\u0007·Æ(~ØÐ\r\u008c\u0018\u001btxÌý\u00ad\u0010Æ\u0083c\u007f)Oh±kD\u009d48<\u0003µ\u0010\u001d\u0087@pà\u009a\u0098CJ^øÿ©Ø|[";
      int var28 = "Á´y\u0010\b\u001e3tàÏLi7zw\u0010ð\u007fge¦Mu¡\u0007Á\nj×\u0085èî)Õ«Î\u000e÷r¥\u0092\u001dLXC\n\u0098(Seå\u0085\u00ad³\u001d\b\u0010\u0007·Æ(~ØÐ\r\u008c\u0018\u001btxÌý\u00ad\u0010Æ\u0083c\u007f)Oh±kD\u009d48<\u0003µ\u0010\u001d\u0087@pà\u009a\u0098CJ^øÿ©Ø|["
         .length();
      char var25 = '8';
      int var35 = -1;

      label72:
      while (true) {
         String var36 = var26.substring(++var35, var35 + var25);
         int var10001 = -1;

         while (true) {
            byte[] var30 = var22.doFinal(var36.getBytes("ISO-8859-1"));
            String var60 = a(var30).intern();
            switch (var10001) {
               case 0:
                  var29[var27++] = var60;
                  if ((var35 += var25) >= var28) {
                     b = var29;
                     c = new String[6];
                     g = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[9];
                     int var14 = 0;
                     String var15 = "¹\fâg\u0095ªå´1y°ô\u009aE\u0095\u000buÔ\u0082\u0015Ê6À\u00154ð³NÐ\u008d\u008cq\u00064\u00ad×}\u001ff<X«Á\u001c\u008aYcY´\u008cÒÕ\u0011\u0006\u001dß";
                     int var16 = "¹\fâg\u0095ªå´1y°ô\u009aE\u0095\u000buÔ\u0082\u0015Ê6À\u00154ð³NÐ\u008d\u008cq\u00064\u00ad×}\u001ff<X«Á\u001c\u008aYcY´\u008cÒÕ\u0011\u0006\u001dß"
                        .length();
                     byte var13 = 0;

                     label54:
                     while (true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var39 = var17;
                        var10001 = var14++;
                        long var64 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte var72 = -1;

                        while (true) {
                           long var19 = var64;
                           byte[] var21 = var11.doFinal(
                              new byte[]{
                                 (byte)(var19 >>> 56),
                                 (byte)(var19 >>> 48),
                                 (byte)(var19 >>> 40),
                                 (byte)(var19 >>> 32),
                                 (byte)(var19 >>> 24),
                                 (byte)(var19 >>> 16),
                                 (byte)(var19 >>> 8),
                                 (byte)var19
                              }
                           );
                           long var76 = (var21[0] & 255L) << 56
                              | (var21[1] & 255L) << 48
                              | (var21[2] & 255L) << 40
                              | (var21[3] & 255L) << 32
                              | (var21[4] & 255L) << 24
                              | (var21[5] & 255L) << 16
                              | (var21[6] & 255L) << 8
                              | var21[7] & 255L;
                           switch (var72) {
                              case 0:
                                 var39[var10001] = var76;
                                 if (var13 >= var16) {
                                    e = var17;
                                    f = new Integer[9];
                                    j = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var31 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[3];
                                    int var3 = 0;
                                    String var4 = "E\u008d]ëô§ó\tá05\u008fPX¦é*¢A§]×Z¬";
                                    int var5 = "E\u008d]ëô§ó\tá05\u008fPX¦é*¢A§]×Z¬".length();
                                    byte var2 = 0;

                                    do {
                                       int var51 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var51, var2).getBytes("ISO-8859-1");
                                       var51 = var3++;
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
                                       var76 = (var10[0] & 255L) << 56
                                          | (var10[1] & 255L) << 48
                                          | (var10[2] & 255L) << 40
                                          | (var10[3] & 255L) << 32
                                          | (var10[4] & 255L) << 24
                                          | (var10[5] & 255L) << 16
                                          | (var10[6] & 255L) << 8
                                          | var10[7] & 255L;
                                       byte var75 = -1;
                                       var6[var51] = var76;
                                    } while (var2 < var5);

                                    h = var6;
                                    i = new Long[3];
                                    Builder var41 = RenderPipeline.builder(new Snippet[]{class_10799.field_56860});
                                    short var53 = 16029;
                                    long var67 = 3619738108258550753L ^ var31;
                                    dzt = class_10799.method_67887(
                                       var41.withLocation("pipeline/debug_filled_box")
                                          .withCull(false)
                                          .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                                          .withBlend(BlendFunction.TRANSLUCENT)
                                          .withVertexFormat(class_290.field_1576, class_5596.field_27380)
                                          .build()
                                    );
                                    Builder var42 = RenderPipeline.builder(new Snippet[]{class_10799.field_56860});
                                    var53 = 8463;
                                    long var68 = 2908156834246597751L ^ var31;
                                    fak = class_10799.method_67887(
                                       var42.withLocation("pipeline/debug_filled_box")
                                          .withCull(false)
                                          .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                                          .withBlend(BlendFunction.TRANSLUCENT)
                                          .withVertexFormat(class_290.field_1576, class_5596.field_27382)
                                          .build()
                                    );
                                    short var43 = 15679;
                                    long var55 = 5708056364104515653L ^ var31;
                                    var53 = 32744;
                                    long var69 = 8688287788638704379L ^ var31;
                                    fgg = class_1921.method_24049(
                                       "test", 1536, false, true, dzt, class_4688.method_23598().method_23607(class_4668.field_22241).method_23617(false)
                                    );
                                    short var44 = 18752;
                                    long var57 = 6932847216880907325L ^ var31;
                                    var53 = 27299;
                                    long var70 = 5647419312575711157L ^ var31;
                                    gpm = class_1921.method_24049(
                                       "test2", 1536, false, true, fak, class_4688.method_23598().method_23607(class_4668.field_22241).method_23617(false)
                                    );
                                    return;
                                 }
                                 break;
                              default:
                                 var39[var10001] = var76;
                                 if (var13 < var16) {
                                    continue label54;
                                 }

                                 var15 = "ÓØ\u0017Vj\feD{3<\u008a\u00172lÙ";
                                 var16 = "ÓØ\u0017Vj\feD{3<\u008a\u00172lÙ".length();
                                 var13 = 0;
                           }

                           byte var50 = var13;
                           var13 += 8;
                           var18 = var15.substring(var50, var13).getBytes("ISO-8859-1");
                           var39 = var17;
                           var10001 = var14++;
                           var64 = (var18[0] & 255L) << 56
                              | (var18[1] & 255L) << 48
                              | (var18[2] & 255L) << 40
                              | (var18[3] & 255L) << 32
                              | (var18[4] & 255L) << 24
                              | (var18[5] & 255L) << 16
                              | (var18[6] & 255L) << 8
                              | var18[7] & 255L;
                           var72 = 0;
                        }
                     }
                  }

                  var25 = var26.charAt(var35);
                  break;
               default:
                  var29[var27++] = var60;
                  if ((var35 += var25) < var28) {
                     var25 = var26.charAt(var35);
                     continue label72;
                  }

                  var26 = "&þ+`\u009b7àJµ\u008e}q p\u009es¨2:_I&¨¬ÚH9\u0003ÿ¬\u0001¨ËÞ\u0092Þ§@K=5Ï\u0098,¼ºÜ\u0094\u0010(ÞÂE¯@.\u009fv8\u0015\u0001Î]^ø";
                  var28 = "&þ+`\u009b7àJµ\u008e}q p\u009es¨2:_I&¨¬ÚH9\u0003ÿ¬\u0001¨ËÞ\u0092Þ§@K=5Ï\u0098,¼ºÜ\u0094\u0010(ÞÂE¯@.\u009fv8\u0015\u0001Î]^ø"
                     .length();
                  var25 = '0';
                  var35 = -1;
            }

            var36 = var26.substring(++var35, var35 + var25);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19255;
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
            throw new RuntimeException("cc/astralis/bqf", var10);
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
         throw new RuntimeException("cc/astralis/bqf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7007;
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
            throw new RuntimeException("cc/astralis/bqf", var14);
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
         throw new RuntimeException("cc/astralis/bqf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29662;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/bqf", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         i[var3] = var15;
      }

      return i[var3];
   }

   private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = c(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/bqf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
