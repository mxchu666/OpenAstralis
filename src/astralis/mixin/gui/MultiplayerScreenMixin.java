package astralis.mixin.gui;

import astralis.mixin.accessor.ScreenAccessor;
import cc.astralis.aml;
import cc.astralis.crv;
import cc.astralis.dar;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_4185;
import net.minecraft.class_437;
import net.minecraft.class_500;
import net.minecraft.class_4185.class_7840;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_500.class})
public abstract class MultiplayerScreenMixin extends class_437 {
   private static final String[] a;
   private static final long b = 55104644989215L;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   protected MultiplayerScreenMixin(class_2561 title) {
      super(a);
   }

   @Inject(
      method = {"init"},
      at = {@At("TAIL")}
   )
   private void onInit(CallbackInfo a) {
      long ax = b ^ 108809105996107L;
      if (class_310.method_1551().field_1755 instanceof class_500 axx) {
         class_7840 var10000 = class_4185.method_46430(
            class_2561.method_43470(MultiplayerScreenMixin.a[1]), axxx -> class_310.method_1551().method_1507(new crv())
         );
         short var10001 = 18684;
         long var10002 = 8422949729019369663L ^ ax;
         short var8 = 17039;
         long var10003 = 1758456856165913287L ^ ax;
         class_7840 axxx = var10000.method_46437(100, 20);
         ScreenAccessor var7 = (ScreenAccessor)axx;
         short var10 = 31614;
         long var10004 = 6147691510815206196L ^ ax;
         int var9 = axx.field_22789 - 105;
         short var11 = 30886;
         long var10005 = 5479877632935373024L ^ ax;
         var7.invokeAddDrawableChild(axxx.method_46433(var9, axx.field_22790 - 35).method_46431());
      }
   }

   @Inject(
      method = {"init"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void earlyAuthCheck(CallbackInfo a) {
      if (aml.gkg || !Objects.equals(aml.eyu, MultiplayerScreenMixin.a[0]) || !aml.gsj) {
         class_310.method_1551().method_1507(dar.gqy().azc());
         a.cancel();
      }
   }

   static {
      long var15 = b ^ 106587083532957L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var15 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var14 = var12.doFinal("\u0002\u0005Ñ%ñ\u0003°Í8\u008e¬\u0005\u007f7ç\u0084\u0085þa\u0087YBUí".getBytes("ISO-8859-1"));
      String var36 = a(var14).intern();
      int var10001 = -1;
      String var11 = var36;
      e = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var15 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[15];
      int var3 = 0;
      String var4 = "Ä9B\u009c\tÒj?â\u0013¨\u00ad\u0097`Ðc¢´nlÆÆÅA\u0001èF\u0096ÿ\u001dþ\u00073õ\u0086r@\u00ad»\u0085Þ\u008d\u0006.o\u0088Ý\u0011Ò\u0016¡R\u0092\u0087\u0016W\u001f¼~Z\u001eÕû'>e¯&\u0000\u0097\u0098\u009fd1\u0088\u0093\u0019Ø\u0084'&\u008a\u0001ó\u0082û5¬Ê8\u0099\u0016Ý21\u0088\u0097D×áK\r\u008bþ";
      int var5 = "Ä9B\u009c\tÒj?â\u0013¨\u00ad\u0097`Ðc¢´nlÆÆÅA\u0001èF\u0096ÿ\u001dþ\u00073õ\u0086r@\u00ad»\u0085Þ\u008d\u0006.o\u0088Ý\u0011Ò\u0016¡R\u0092\u0087\u0016W\u001f¼~Z\u001eÕû'>e¯&\u0000\u0097\u0098\u009fd1\u0088\u0093\u0019Ø\u0084'&\u008a\u0001ó\u0082û5¬Ê8\u0099\u0016Ý21\u0088\u0097D×áK\r\u008bþ"
         .length();
      byte var2 = 0;

      label40:
      while (true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var26 = var6;
         var10001 = var3++;
         long var38 = (var7[0] & 255L) << 56
            | (var7[1] & 255L) << 48
            | (var7[2] & 255L) << 40
            | (var7[3] & 255L) << 32
            | (var7[4] & 255L) << 24
            | (var7[5] & 255L) << 16
            | (var7[6] & 255L) << 8
            | var7[7] & 255L;
         byte var43 = -1;

         while (true) {
            long var8 = var38;
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
                     c = var6;
                     d = new Integer[15];
                     String[] var22 = new String[2];
                     short var27 = 9758;
                     int var20 = 0;
                     long var32 = 5211283750756148616L ^ var15;
                     String var19 = var11;
                     int var21 = var11.length();
                     char var18 = 7;
                     int var17 = -1;

                     while (true) {
                        short var28 = 8685;
                        long var33 = 5170696069786198644L ^ var15;
                        String var40 = a(102, a(var19.substring(++var17, var17 + var18)));
                        byte var34 = -1;
                        var22[var20++] = var40;
                        if ((var17 += var18) >= var21) {
                           a = var22;
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

                  var4 = "\u008f7 \u008dmõ¿\u0088\u009d\u008a\u0094p\u0092ÐÓÛ";
                  var5 = "\u008f7 \u008dmõ¿\u0088\u009d\u008a\u0094p\u0092ÐÓÛ".length();
                  var2 = 0;
            }

            byte var31 = var2;
            var2 += 8;
            var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
            var26 = var6;
            var10001 = var3++;
            var38 = (var7[0] & 255L) << 56
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

   private static char[] a(String var0) {
      long var1 = b ^ 58845593961336L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 19130;
         long var10005 = 430965311709667527L ^ var1;
         var10000[0] = (char)(var10003 ^ 'k');
      }

      return var10000;
   }

   private static String a(int var0, char[] var1) {
      long var2 = b ^ 111651421058581L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 16142;
         long var10009 = 4109483011735642135L ^ var2;
         byte var10;
         switch (var4 % 7) {
            case 0:
               var10 = 24044;
               long var23 = 1449994098807898873L ^ var2;
               var10 = 19;
               break;
            case 1:
               var10 = 1157;
               long var22 = 3283194311515462559L ^ var2;
               var10 = 25;
               break;
            case 2:
               var10 = 15387;
               long var21 = 3977071433139970823L ^ var2;
               var10 = 64;
               break;
            case 3:
               var10 = 25657;
               long var20 = 2788248577136343851L ^ var2;
               var10 = 117;
               break;
            case 4:
               var10 = 30228;
               long var19 = 2502915071730854147L ^ var2;
               var10 = 26;
               break;
            case 5:
               var10 = 16283;
               long var18 = 5695280048900268164L ^ var2;
               var10 = 96;
               break;
            default:
               var10 = 27811;
               long var17 = 5080508450642932656L ^ var2;
               var10 = 107;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26654;
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
            throw new RuntimeException("astralis/mixin/gui/MultiplayerScreenMixin", var14);
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
         throw new RuntimeException("astralis/mixin/gui/MultiplayerScreenMixin" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
