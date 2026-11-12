package astralis.mixin.render;

import cc.astralis.ctu;
import com.mojang.blaze3d.opengl.GlStateManager;
import io.github.humbleui.skija.ColorType;
import io.github.humbleui.skija.DirectContext;
import io.github.humbleui.skija.Image;
import io.github.humbleui.skija.SurfaceOrigin;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
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
import net.minecraft.class_10868;
import net.minecraft.class_276;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_10868.class})
public class GlTextureMixin implements ctu {
   @Shadow
   @Final
   protected int field_57882;
   @Shadow
   @Final
   private Int2IntMap field_57885;
   @Unique
   private Image image;
   private static final long a;
   private static final long b = 3857879070987L;
   private static final long c;
   private static final long[] d;
   private static final Long[] e;
   private static final Map f;

   @Override
   public Image astralis$getOrCreateSkikoImage(DirectContext context, class_276 framebuffer, boolean hasAlpha) {
      long ax = b ^ 19511085270140L;
      short var10000 = 1880;
      long var10001 = 1625760935152590915L ^ ax;
      long axx = 40660301793870L;
      if (a.image != null) {
         return a.image;
      } else {
         class_10868 axxx = (class_10868)a;
         int axxxx = axxx.getWidth(axxx.getMipLevels());
         int axxxxx = axxx.getHeight(axxx.getMipLevels());
         a.image = Image.adoptGLTextureFrom(
            a, a.field_57882, (int)c, axxxx, axxxxx, (int)GlTextureMixin.a, SurfaceOrigin.BOTTOM_LEFT, a ? ColorType.RGBA_8888 : ColorType.RGB_888X
         );
         return a.image;
      }
   }

   @Inject(
      method = {"free"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void astralis$free(CallbackInfo a) {
      if (a.image != null) {
         a.image.close();
         a.image = null;
         IntIterator ax = a.field_57885.values().iterator();

         while (ax.hasNext()) {
            int axx = ax.next();
            GlStateManager._glDeleteFramebuffers(axx);
         }

         a.cancel();
      }
   }

   static {
      long var16 = b ^ 63278519388779L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)(var16 << var12 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var13 = 5845031006843949332L;
      byte[] var15 = var11.doFinal(
         new byte[]{
            (byte)(var13 >>> 56),
            (byte)(var13 >>> 48),
            (byte)(var13 >>> 40),
            (byte)(var13 >>> 32),
            (byte)(var13 >>> 24),
            (byte)(var13 >>> 16),
            (byte)(var13 >>> 8),
            (byte)var13
         }
      );
      long var28 = (var15[0] & 255L) << 56
         | (var15[1] & 255L) << 48
         | (var15[2] & 255L) << 40
         | (var15[3] & 255L) << 32
         | (var15[4] & 255L) << 24
         | (var15[5] & 255L) << 16
         | (var15[6] & 255L) << 8
         | var15[7] & 255L;
      int var10001 = -1;
      c = var28;
      f = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "W tüs\"Ï@¦O\u0017~;\"DÍ¤Ö~öuÆÏ>";
      int var5 = "W tüs\"Ï@¦O\u0017~;\"DÍ¤Ö~öuÆÏ>".length();
      byte var2 = 0;

      do {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
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
         long var10004 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         byte var32 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      d = var6;
      e = new Long[3];
      short var21 = 26130;
      long var25 = 6035732866364100380L ^ var16;
      long var18 = 1106788954990L;
      short var22 = 24362;
      long var26 = 2278334144243889703L ^ var16;
      long var30 = -4569943185345498314L ^ var18;
      byte var27 = -1;
      a = var30;
   }

   private static long a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23148;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("astralis/mixin/render/GlTextureMixin", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         e[var3] = var15;
      }

      return e[var3];
   }

   private static long a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = a(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
         throw new RuntimeException("astralis/mixin/render/GlTextureMixin" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
