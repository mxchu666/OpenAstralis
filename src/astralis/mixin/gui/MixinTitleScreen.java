package astralis.mixin.gui;

import cc.astralis.amh;
import cc.astralis.aml;
import cc.astralis.crv;
import cc.astralis.dar;
import cc.astralis.dlc;
import cc.astralis.eqf;
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
import net.minecraft.class_332;
import net.minecraft.class_4185;
import net.minecraft.class_437;
import net.minecraft.class_442;
import net.minecraft.class_4185.class_7840;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_442.class})
public class MixinTitleScreen extends class_437 implements dlc, amh {
   private static final String[] a;
   private static final long b = 66465874384629L;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   protected MixinTitleScreen(class_2561 title) {
      super(a);
   }

   @Inject(
      method = {"init"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onInit(CallbackInfo a) {
      if (aml.gkg || !Objects.equals(aml.eyu, MixinTitleScreen.a[0]) || !aml.gsj) {
         chi.method_1507(dar.gqy().azc());
         a.cancel();
      }
   }

   @Inject(
      at = {@At("HEAD")},
      method = {"addNormalWidgets(II)I"}
   )
   private void addNormalWidgets(int a, int a, CallbackInfoReturnable<Integer> a) {
      long ax = b ^ 92205784689205L;
      class_442 axx = (class_442)a;
      class_7840 var10000 = class_4185.method_46430(class_2561.method_43470(MixinTitleScreen.a[1]), axxx -> chi.method_1507(new crv()));
      short var10001 = 3111;
      long var10002 = 6288586837356079630L ^ ax;
      class_7840 axxx = var10000.method_46437(60, a<"p">(9485, 7643781810904974114L ^ ax));
      short var10003 = 6512;
      long var10004 = 2417161613509689178L ^ ax;
      int var8 = a.field_22789 - 65;
      short var9 = 12573;
      long var10005 = 4252760805894018873L ^ ax;
      a.method_37063(axxx.method_46433(var8, a.field_22790 - 25).method_46431());
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   private void renderMixin(class_332 a, int a, int a, float a, CallbackInfo a) {
      eqf.ddy(a, a);
   }

   static {
      long var15 = b ^ 102064014566386L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var15 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var14 = var12.doFinal("\u0005©@L\u009c\"d£U-\u0085#GT\u0081úkÐ\u000b\u0013\u000f6.ð".getBytes("ISO-8859-1"));
      String var36 = b(var14).intern();
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
      String var4 = "Ígò¶·0\u0006 \u009b'\u009ejga¦\u0081@®\u0010M¤lýêw=¤1\u008f \u0082S¯ãÒ\u001e:¿\u0080G\u001f\u008fmÌ\u0085<È\u0013\u0091ÒÃ^G\u0013ü¤j¨,ÿS\u0006#A\u0083g\u009fù\u008bâº¤AÛ§ý\u0007\f*ö%âv\u0090\u0012·êM:rrqú÷\"\u0005PoÏ5©ï\u0081D";
      int var5 = "Ígò¶·0\u0006 \u009b'\u009ejga¦\u0081@®\u0010M¤lýêw=¤1\u008f \u0082S¯ãÒ\u001e:¿\u0080G\u001f\u008fmÌ\u0085<È\u0013\u0091ÒÃ^G\u0013ü¤j¨,ÿS\u0006#A\u0083g\u009fù\u008bâº¤AÛ§ý\u0007\f*ö%âv\u0090\u0012·êM:rrqú÷\"\u0005PoÏ5©ï\u0081D"
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
                     short var27 = 29462;
                     int var20 = 0;
                     long var32 = 2754025907168664823L ^ var15;
                     String var19 = var11;
                     int var21 = var11.length();
                     char var18 = 7;
                     int var17 = -1;

                     while (true) {
                        short var28 = 16248;
                        long var33 = 1521860385647759505L ^ var15;
                        String var40 = a(55, a(var19.substring(++var17, var17 + var18)));
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

                  var4 = "LBmÆ)\u009fõkèÛ©µéb0ê";
                  var5 = "LBmÆ)\u009fõkèÛ©µéb0ê".length();
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
      long var1 = b ^ 84942619963326L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 28230;
         long var10005 = 4726650803078991341L ^ var1;
         var10000[0] = (char)(var10003 ^ -1349522306);
      }

      return var10000;
   }

   private static String a(int var0, char[] var1) {
      long var2 = b ^ 9394564712260L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 1504;
         long var10009 = 4577240049388965556L ^ var2;
         var10001[var4] = (char)(var10005 ^ var10002 ^ switch (var4 % 7) {
            case 0 -> {
               short var15 = 10006;
               long var21 = 6541035813832453184L ^ var2;
               yield 28;
            }
            case 1 -> {
               short var14 = 6227;
               long var20 = 3485496733663810307L ^ var2;
               yield 65;
            }
            case 2 -> {
               short var13 = 24642;
               long var19 = 4582219046813707035L ^ var2;
               yield 9;
            }
            case 3 -> {
               short var12 = 13351;
               long var18 = 7886710137162334069L ^ var2;
               yield 1693154668;
            }
            case 4 -> {
               short var11 = 29865;
               long var17 = 7712493575535837178L ^ var2;
               yield -1628233086;
            }
            case 5 -> {
               short var10 = 25098;
               long var16 = 7514795553013508432L ^ var2;
               yield 22;
            }
            default -> a<"p">(14731, 5099272905308140246L ^ var2);
         });
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6882;
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
            throw new RuntimeException("astralis/mixin/gui/MixinTitleScreen", var14);
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
         throw new RuntimeException("astralis/mixin/gui/MixinTitleScreen" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
