package astralis.mixin.render;

import cc.astralis.dar;
import cc.astralis.dk;
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
import net.minecraft.class_315;
import net.minecraft.class_7172;
import net.minecraft.class_7172.class_7174;
import net.minecraft.class_7172.class_7277;
import net.minecraft.class_7172.class_7303;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({class_315.class})
public class MixinGameOptions {
   @Shadow
   @Final
   private class_7172<Integer> field_49476;
   private static final String[] a;
   private static final long b = 121482573752508L;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   @Redirect(
      method = {"getMenuBackgroundBlurriness"},
      at = @At(
         value = "FIELD",
         target = "Lnet/minecraft/client/option/GameOptions;menuBackgroundBlurriness:Lnet/minecraft/client/option/SimpleOption;",
         opcode = 180
      )
   )
   private class_7172<Integer> blur$overrideBlurriness(class_315 a) {
      long ax = b ^ 42226334462836L;
      dk axx = dar.gqy().aws().diy(dk.class);
      if (axx != null && axx.dsv() && axx.chd.dnp()) {
         String[] var5 = MixinGameOptions.a;
         String var10002 = var5[1];
         class_7277 var10003 = class_7172.method_42717(class_2561.method_43471(var5[0]));
         class_7303 var10004 = (axxx, axxxx) -> class_2561.method_43469(MixinGameOptions.a[2], new Object[]{axxx, axxxx});
         short var10008 = 32003;
         long var10009 = 6773462802065946361L ^ ax;
         return new class_7172(var10002, var10003, var10004, new class_7174(0, -1977042048), axx.fcg.dnp().intValue(), axxx -> {});
      } else {
         return a.field_49476;
      }
   }

   static {
      long var15 = b ^ 51709766891782L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var15 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var14 = var12.doFinal(
         "'\u0003_²ü\\\u008b\níæñëN\u0018W}é_K}\u0096FÂ»\u00830\u0011)½S\u00027íU|ª|\u001e\n\rW\u008fäÎì\u001c\u0080÷¿Z\u0094t\u001eñQgË\u008eÜr`\u00addæÚÂE\u001d'sxÇù½ä\u001cíý@\u0014ÚeÜÐçïæÄÖ\u0002)\u001eâNî»Ô8^Ê\u0094WW¢"
            .getBytes("ISO-8859-1")
      );
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
      long[] var6 = new long[12];
      int var3 = 0;
      String var4 = "\u008fw\u0088!\u0085\u0092_qNúû\u0093\u00802óï\u001b3¡¹\u0015À6\u00872á\u0001ã:¤gñHÙ\u0094£ç/0\u000fä\u0087Éå¿Û\u0011÷TÚu(\u0084¾\u0091Ié²\u0094 ñ&rè6fáó)S\u0011¬o\u0095\u0000.Ég°\u009c";
      int var5 = "\u008fw\u0088!\u0085\u0092_qNúû\u0093\u00802óï\u001b3¡¹\u0015À6\u00872á\u0001ã:¤gñHÙ\u0094£ç/0\u000fä\u0087Éå¿Û\u0011÷TÚu(\u0084¾\u0091Ié²\u0094 ñ&rè6fáó)S\u0011¬o\u0095\u0000.Ég°\u009c"
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
                     d = new Integer[12];
                     String[] var22 = new String[3];
                     short var27 = 16675;
                     int var20 = 0;
                     long var32 = 232090450398494880L ^ var15;
                     String var19 = var11;
                     int var21 = var11.length();
                     int var18 = -688022612;
                     int var17 = -1;

                     while (true) {
                        short var28 = 18031;
                        long var33 = 6589687097203574761L ^ var15;
                        String var40 = a(2064683529, a(var19.substring(++var17, var17 + var18)));
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

                  var4 = "§©R-\u0015`\u0011\u0012èmeÆU«ó\u008a";
                  var5 = "§©R-\u0015`\u0011\u0012èmeÆU«ó\u008a".length();
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
      long var1 = b ^ 89767861355085L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 6064;
         long var10005 = 1912985187921456496L ^ var1;
         var10000[0] = (char)(var10003 ^ -874332345);
      }

      return var10000;
   }

   private static String a(int var0, char[] var1) {
      long var2 = b ^ 51294843758453L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 11355;
         long var10009 = 3354158841931051946L ^ var2;
         int var10;
         switch (var4 % 1521109174) {
            case 0:
               short var16 = 15695;
               long var23 = 7872878489667674812L ^ var2;
               var10 = 943403739;
               break;
            case 1:
               short var15 = 32052;
               long var22 = 3340564281563538112L ^ var2;
               var10 = -1046253888;
               break;
            case 2:
               short var14 = 10116;
               long var21 = 5667755048925280371L ^ var2;
               var10 = -1476034972;
               break;
            case 3:
               short var13 = 11777;
               long var20 = 5307574295366709755L ^ var2;
               var10 = -1614076170;
               break;
            case 4:
               short var12 = 19637;
               long var19 = 1159645929280885580L ^ var2;
               var10 = -1402510270;
               break;
            case 5:
               short var11 = 5858;
               long var18 = 4607587144897497360L ^ var2;
               var10 = -1686443436;
               break;
            default:
               short var10007 = 18505;
               long var17 = 2881755187877140415L ^ var2;
               var10 = 566100006;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20539;
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
            throw new RuntimeException("astralis/mixin/render/MixinGameOptions", var14);
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
         throw new RuntimeException("astralis/mixin/render/MixinGameOptions" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
