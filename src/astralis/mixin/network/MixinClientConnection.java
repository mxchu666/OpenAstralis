package astralis.mixin.network;

import cc.astralis.amo;
import cc.astralis.dar;
import cc.astralis.dmt;
import cc.astralis.gpy;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2535;
import net.minecraft.class_2547;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2987;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({class_2535.class})
public abstract class MixinClientConnection implements dmt {
   @Shadow
   private Channel field_11651;
   @Shadow
   private class_2547 field_11652;
   private static final String[] a;
   private static final long b = 50030135748658L;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   @Shadow
   public abstract void method_10752(class_2596<?> var1, @Nullable ChannelFutureListener var2);

   @Shadow
   private static <T extends class_2547> void method_10759(class_2596<T> a, class_2547 a) {
   }

   @Shadow
   public abstract void method_10747(class_2561 var1);

   @Overwrite
   public void method_10743(class_2596<?> packet) {
      amo ax = new amo(a, gpy.SEND);
      dar.gqy().fyf().brx(ax);
      if (!ax.fmc()) {
         a = ax.bed();
         a.method_10752(a, null);
      }
   }

   @Override
   public void sendNoEvent(class_2596<?> packet) {
      a.method_10752(a, null);
   }

   @Override
   public void sendWithEvent(class_2596<?> packet) {
      a.method_10743(a);
   }

   @Override
   public void receiveNoEvent(class_2596<?> packet) {
      if (a.field_11651.isOpen()) {
         try {
            method_10759(a, a.field_11652);
         } catch (class_2987 var4) {
         } catch (RejectedExecutionException var5) {
            String[] var3 = MixinClientConnection.a;
            a.method_10747(class_2561.method_43471(var3[2]));
         } catch (ClassCastException var6) {
            a.method_10747(class_2561.method_43471(MixinClientConnection.a[1]));
         }
      }
   }

   @Overwrite
   public void method_10770(ChannelHandlerContext channelHandlerContext, class_2596<?> packet) {
      if (a.field_11651.isOpen()) {
         try {
            amo ax = new amo(a, gpy.RECEIVE);
            dar.gqy().fyf().brx(ax);
            if (ax.fmc()) {
               return;
            }

            a = ax.bed();
            method_10759(a, a.field_11652);
         } catch (class_2987 var5) {
         } catch (RejectedExecutionException var6) {
            String[] var4 = MixinClientConnection.a;
            a.method_10747(class_2561.method_43471(var4[3]));
         } catch (ClassCastException var7) {
            a.method_10747(class_2561.method_43471(MixinClientConnection.a[0]));
         }
      }
   }

   static {
      long var20 = b ^ 82787632751014L;
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
      String var16 = "W:%\u0007p\u0087ö^Þ\u008aô\u00ad¢\u0004á\u008e\u0006\u008dÍ9¯\u0097R\u0086Ò\tñÝ_'Ë\u0001DÀçö\u0097ÕS2iâ±ðÉ\u0087ûzqè>Á\u001d´Õ\u008et\u0086tw°\u0090[ËN\u008e\"óÖQhûDÚ2hþ\u008c©¾P¬O¹¯¡$È\"\u0001Ro\u0082³¤ê\u001cÙ50nÃ§ë~ñøê\u0081\u0018òèÕ\u009dk\u008aÙjqðTqÃã050ú'*\u000fë5\u0085\t\u0082\u000b¢\u0096\b±\fg\u0012/#Þm=À~|CØíý+b=|¹";
      int var18 = "W:%\u0007p\u0087ö^Þ\u008aô\u00ad¢\u0004á\u008e\u0006\u008dÍ9¯\u0097R\u0086Ò\tñÝ_'Ë\u0001DÀçö\u0097ÕS2iâ±ðÉ\u0087ûzqè>Á\u001d´Õ\u008et\u0086tw°\u0090[ËN\u008e\"óÖQhûDÚ2hþ\u008c©¾P¬O¹¯¡$È\"\u0001Ro\u0082³¤ê\u001cÙ50nÃ§ë~ñøê\u0081\u0018òèÕ\u009dk\u008aÙjqðTqÃã050ú'*\u000fë5\u0085\t\u0082\u000b¢\u0096\b±\fg\u0012/#Þm=À~|CØíý+b=|¹"
         .length();
      char var15 = 'P';
      int var14 = -1;

      while (true) {
         byte[] var19 = var12.doFinal(var16.substring(++var14, var14 + var15).getBytes("ISO-8859-1"));
         String var49 = a(var19).intern();
         int var10001 = -1;
         var11[var17++] = var49;
         if ((var14 += var15) >= var18) {
            e = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[13];
            int var3 = 0;
            String var4 = "¼þvÕ¼\u0097êÆ\"¶¦Öl²¨Y¦\u001b\u0016°Û^üS#(R\u009c¡I¥&\u0018\u009f\u0099\u0005'Ãpð §*Á|®kå<\u00adì\nl\u009dÉDþ\u0016Ç&¤àç\u0086\u0086¡\n¦4äeò&%Æ\u0006â\u000f\u009d,ÏÊnÂÒZ¤\u007f";
            int var5 = "¼þvÕ¼\u0097êÆ\"¶¦Öl²¨Y¦\u001b\u0016°Û^üS#(R\u009c¡I¥&\u0018\u009f\u0099\u0005'Ãpð §*Á|®kå<\u00adì\nl\u009dÉDþ\u0016Ç&¤àç\u0086\u0086¡\n¦4äeò&%Æ\u0006â\u000f\u009d,ÏÊnÂÒZ¤\u007f"
               .length();
            byte var2 = 0;

            label54:
            while (true) {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               long[] var33 = var6;
               var10001 = var3++;
               long var52 = (var7[0] & 255L) << 56
                  | (var7[1] & 255L) << 48
                  | (var7[2] & 255L) << 40
                  | (var7[3] & 255L) << 32
                  | (var7[4] & 255L) << 24
                  | (var7[5] & 255L) << 16
                  | (var7[6] & 255L) << 8
                  | var7[7] & 255L;
               byte var58 = -1;

               while (true) {
                  long var8 = var52;
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
                  long var60 = (var10[0] & 255L) << 56
                     | (var10[1] & 255L) << 48
                     | (var10[2] & 255L) << 40
                     | (var10[3] & 255L) << 32
                     | (var10[4] & 255L) << 24
                     | (var10[5] & 255L) << 16
                     | (var10[6] & 255L) << 8
                     | var10[7] & 255L;
                  switch (var58) {
                     case 0:
                        var33[var10001] = var60;
                        if (var2 >= var5) {
                           c = var6;
                           d = new Integer[13];
                           String[] var27 = new String[4];
                           byte var34 = 107;
                           int var25 = 0;
                           long var44 = 2401961034291660913L ^ var20;
                           String var24;
                           int var26 = (var24 = var11[0]).length();
                           char var23 = '%';
                           int var31 = -1;

                           label44:
                           while (true) {
                              short var35 = 27853;
                              long var45 = 5234051828728505554L ^ var20;
                              byte var36 = 72;
                              String var46 = var24.substring(++var31, var31 + var23);
                              byte var54 = -1;

                              while (true) {
                                 String var37 = a(var36, a(var46));
                                 switch (var54) {
                                    case 0:
                                       var27[var25++] = var37;
                                       if ((var31 += var23) >= var26) {
                                          a = var27;
                                          return;
                                       }

                                       var23 = var24.charAt(var31);
                                       break;
                                    default:
                                       var27[var25++] = var37;
                                       if ((var31 += var23) < var26) {
                                          var23 = var24.charAt(var31);
                                          continue label44;
                                       }

                                       var26 = (var24 = var11[1]).length();
                                       short var38 = 10831;
                                       long var47 = 8853145265888158292L ^ var20;
                                       var23 = '&';
                                       var31 = -1;
                                 }

                                 short var39 = 21312;
                                 long var48 = 2388163094169328464L ^ var20;
                                 var36 = 63;
                                 var46 = var24.substring(++var31, var31 + var23);
                                 var54 = 0;
                              }
                           }
                        }
                        break;
                     default:
                        var33[var10001] = var60;
                        if (var2 < var5) {
                           continue label54;
                        }

                        var4 = "Y¹,\u0082ù´v÷K3ÔõÍ\u0005\u0094¹";
                        var5 = "Y¹,\u0082ù´v÷K3ÔõÍ\u0005\u0094¹".length();
                        var2 = 0;
                  }

                  byte var43 = var2;
                  var2 += 8;
                  var7 = var4.substring(var43, var2).getBytes("ISO-8859-1");
                  var33 = var6;
                  var10001 = var3++;
                  var52 = (var7[0] & 255L) << 56
                     | (var7[1] & 255L) << 48
                     | (var7[2] & 255L) << 40
                     | (var7[3] & 255L) << 32
                     | (var7[4] & 255L) << 24
                     | (var7[5] & 255L) << 16
                     | (var7[6] & 255L) << 8
                     | var7[7] & 255L;
                  var58 = 0;
               }
            }
         }

         var15 = var16.charAt(var14);
      }
   }

   private static char[] a(String var0) {
      long var1 = b ^ 59951016402544L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 22802;
         long var10005 = 7823233100739112665L ^ var1;
         var10000[0] = (char)(var10003 ^ '2');
      }

      return var10000;
   }

   private static String a(int var0, char[] var1) {
      long var2 = b ^ 100607715909389L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 16528;
         long var10009 = 4311651254726047273L ^ var2;
         var10001[var4] = (char)(var10005 ^ var10002 ^ switch (var4 % 7) {
            case 0 -> {
               short var14 = 32463;
               long var19 = 4784352667672971389L ^ var2;
               yield 39;
            }
            case 1 -> a<"t">(478, 1692334221742896993L ^ var2);
            case 2 -> {
               short var13 = 1533;
               long var18 = 4228000394471371594L ^ var2;
               yield 15;
            }
            case 3 -> {
               short var12 = 29815;
               long var17 = 2217270265616794308L ^ var2;
               yield 85;
            }
            case 4 -> a<"t">(4294, 6361026080502638206L ^ var2);
            case 5 -> {
               short var11 = 21100;
               long var16 = 7058742510416995545L ^ var2;
               yield 22;
            }
            default -> {
               short var10007 = 31310;
               long var15 = 2201171742754082036L ^ var2;
               yield 50;
            }
         });
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16780;
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
            throw new RuntimeException("astralis/mixin/network/MixinClientConnection", var14);
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
         throw new RuntimeException("astralis/mixin/network/MixinClientConnection" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
