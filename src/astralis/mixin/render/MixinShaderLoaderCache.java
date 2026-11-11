package astralis.mixin.render;

import cc.astralis.cqp;
import com.mojang.blaze3d.shaders.ShaderType;
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
import net.minecraft.class_2960;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(
   targets = {"net.minecraft.client.gl.ShaderLoader$Cache"}
)
public class MixinShaderLoaderCache {
   private static final String a;
   private static final long b = 61591351295592L;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   @Inject(
      method = {"getSource"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void overrideShaderSource(class_2960 a, ShaderType a, CallbackInfoReturnable<String> a) {
      if (a.toString().equals(MixinShaderLoaderCache.a)) {
         a.setReturnValue(cqp.gdu());
      }
   }

   static {
      long var15 = b ^ 44965189453637L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var15 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var14 = var12.doFinal("»ömÀ´9\u0018e\u0081'Ôý\fFÈt\u000b_¢À\u008a¸R\u008bl·Eö·:ÔÊ,/¹m\u0098Ðô©".getBytes("ISO-8859-1"));
      String var24 = a(var14).intern();
      int var10001 = -1;
      String var11 = var24;
      e = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var15 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[10];
      int var3 = 0;
      String var4 = "þù\u000bØ\u001d\u008eïp\u0013\u0012¡mÆ\u0081¦â\u007f±Â^\f:\u0081j8Æ\u008a\u0010¨Mí\u008b~\u0013\u0094Ó\u009b$\u00adýy¸Jæ»?9.\f\u0006Î\u0007\u0093n\u0082{\u0011ö\"\u0080¼ã:\u009b";
      int var5 = "þù\u000bØ\u001d\u008eïp\u0013\u0012¡mÆ\u0081¦â\u007f±Â^\f:\u0081j8Æ\u008a\u0010¨Mí\u008b~\u0013\u0094Ó\u009b$\u00adýy¸Jæ»?9.\f\u0006Î\u0007\u0093n\u0082{\u0011ö\"\u0080¼ã:\u009b"
         .length();
      byte var2 = 0;

      label29:
      while (true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var19 = var6;
         var10001 = var3++;
         long var26 = (var7[0] & 255L) << 56
            | (var7[1] & 255L) << 48
            | (var7[2] & 255L) << 40
            | (var7[3] & 255L) << 32
            | (var7[4] & 255L) << 24
            | (var7[5] & 255L) << 16
            | (var7[6] & 255L) << 8
            | var7[7] & 255L;
         byte var30 = -1;

         while (true) {
            long var8 = var26;
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
            long var32 = (var10[0] & 255L) << 56
               | (var10[1] & 255L) << 48
               | (var10[2] & 255L) << 40
               | (var10[3] & 255L) << 32
               | (var10[4] & 255L) << 24
               | (var10[5] & 255L) << 16
               | (var10[6] & 255L) << 8
               | var10[7] & 255L;
            switch (var30) {
               case 0:
                  var19[var10001] = var32;
                  if (var2 >= var5) {
                     c = var6;
                     d = new Integer[10];
                     String var28 = a(a<"o">(12929, 4376289666209741393L ^ var15), a(var11));
                     byte var23 = -1;
                     a = var28;
                     return;
                  }
                  break;
               default:
                  var19[var10001] = var32;
                  if (var2 < var5) {
                     continue label29;
                  }

                  var4 = "+\fÜQG6ÁÃSª\u0005©øËà±";
                  var5 = "+\fÜQG6ÁÃSª\u0005©øËà±".length();
                  var2 = 0;
            }

            byte var22 = var2;
            var2 += 8;
            var7 = var4.substring(var22, var2).getBytes("ISO-8859-1");
            var19 = var6;
            var10001 = var3++;
            var26 = (var7[0] & 255L) << 56
               | (var7[1] & 255L) << 48
               | (var7[2] & 255L) << 40
               | (var7[3] & 255L) << 32
               | (var7[4] & 255L) << 24
               | (var7[5] & 255L) << 16
               | (var7[6] & 255L) << 8
               | var7[7] & 255L;
            var30 = 0;
         }
      }
   }

   private static char[] a(String var0) {
      long var1 = b ^ 105167813831062L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 7709;
         long var10005 = 6848840270570010646L ^ var1;
         var10000[0] = (char)(var10003 ^ 572245839);
      }

      return var10000;
   }

   private static String a(int var0, char[] var1) {
      long var2 = b ^ 120968575268348L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         int var10;
         switch (var4 % a<"o">(3848, 4674651202666493280L ^ var2)) {
            case 0:
               short var16 = 26246;
               long var22 = 5572817235227221221L ^ var2;
               var10 = 789874171;
               break;
            case 1:
               short var15 = 29995;
               long var21 = 8715530568342572877L ^ var2;
               var10 = 61;
               break;
            case 2:
               short var14 = 26474;
               long var20 = 7172123572608867598L ^ var2;
               var10 = 1971027143;
               break;
            case 3:
               byte var13 = 125;
               long var19 = 8890672964204722714L ^ var2;
               var10 = 31;
               break;
            case 4:
               short var12 = 4787;
               long var18 = 359958891144866001L ^ var2;
               var10 = -1662554341;
               break;
            case 5:
               short var11 = 31813;
               long var17 = 1616085474672150048L ^ var2;
               var10 = 67;
               break;
            default:
               short var10007 = 26011;
               long var10008 = 5744823078809935867L ^ var2;
               var10 = 1808415679;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12788;
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
            throw new RuntimeException("astralis/mixin/render/MixinShaderLoaderCache", var14);
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
         throw new RuntimeException("astralis/mixin/render/MixinShaderLoaderCache" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
