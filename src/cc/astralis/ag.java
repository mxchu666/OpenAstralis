package cc.astralis;

import io.github.humbleui.skija.Canvas;
import io.github.humbleui.skija.ColorSpace;
import io.github.humbleui.skija.DirectContext;
import io.github.humbleui.skija.GLBackendState;
import io.github.humbleui.skija.Image;
import io.github.humbleui.skija.Surface;
import io.github.humbleui.skija.SurfaceColorFormat;
import io.github.humbleui.skija.SurfaceOrigin;
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
import net.minecraft.class_1041;
import net.minecraft.class_10868;
import org.lwjgl.opengl.GL11;

public class ag implements dlc {
   private static final GLBackendState[] ezu;
   private DirectContext gnz;
   private Surface byk;
   private Canvas ekn;
   private gbl enu;
   private Image gq;
   private int cmc;
   private int hai;
   private static final long a = 108497718382368L;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public ag() {
      dar.gqy().fyf().glu(a);
   }

   public void dxy(int width, int height) {
      long ax = ag.a ^ 59614726895504L;
      int[] axx = dar.abu();
      int var10000 = Objects.isNull(a.gnz);
      if (axx != null) {
         if (var10000 != 0) {
            a.gnz = DirectContext.makeGL();
         }

         a.cmc = a;
         a.hai = a;
         var10000 = Objects.nonNull(a.byk);
      }

      if (axx != null) {
         if (var10000 != 0) {
            a.byk.close();
         }

         var10000 = Objects.nonNull(a.enu);
      }

      if (axx != null) {
         if (var10000 != 0) {
            a.enu.close();
         }

         var10000 = a;
      }

      ara var7 = duz.eqv(var10000, a).avs(1);
      short var10001 = 22790;
      long var10002 = 7644233253482342917L ^ ax;
      duz axxx = var7.fld(8).ern(0).bys(fua.RGBA8).cpb();
      a.enu = gbl.gri(axxx);
      a.byk = Surface.wrapBackendRenderTarget(a.gnz, a.enu, SurfaceOrigin.BOTTOM_LEFT, SurfaceColorFormat.RGBA_8888, ColorSpace.getSRGB());
      a.ekn = a.byk.getCanvas();
      dmp.hbn(a.ekn);
   }

   public void gao() {
      long a = ag.a ^ 115485896193586L;
      int[] ax = dar.abu();
      ag var10000 = a;
      if (ax != null) {
         if (a.gnz == null) {
            return;
         }

         var10000 = a;
      }

      if (ax != null) {
         if (var10000.byk == null) {
            return;
         }

         var10000 = a;
      }

      if (ax != null) {
         if (var10000.ekn == null) {
            return;
         }

         var10000 = a;
      }

      if (var10000.enu != null) {
         class_1041 axx = chi.method_22683();
         short var6 = 3416;
         dmp.gsc(axx.method_4495());
         long var10001 = 8656909542936412152L ^ a;
         bfj.chb();
         a.gnz.resetGL(ezu);
         GL11.glDisable(2884);
         GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
         class_10868 axxx = (class_10868)chi.method_1522().method_30277();
         a.gq = ((ctu)axxx).astralis$getOrCreateSkikoImage(a.gnz, chi.method_1522(), false);
      }
   }

   public void bpv() {
      class_1041 a = chi.method_22683();
      dmp.bfk(a.cmc / 2, a.hai / 2);
      dar.gqy().fyf().brx(new ctt());
   }

   public void aqk() {
      a.byk.flushAndSubmit();
      bfj.duq();
   }

   public Image adw() {
      return a.gq;
   }

   static {
      long var0 = a ^ 106529888962569L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[2];
      int var5 = 0;
      String var6 = "/eÖHçõ½\u0091«\u0089 _\u0081e\u0083D";
      int var7 = "/eÖHçõ½\u0091«\u0089 _\u0081e\u0083D".length();
      byte var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = (var9[0] & 255L) << 56
            | (var9[1] & 255L) << 48
            | (var9[2] & 255L) << 40
            | (var9[3] & 255L) << 32
            | (var9[4] & 255L) << 24
            | (var9[5] & 255L) << 16
            | (var9[6] & 255L) << 8
            | var9[7] & 255L;
         byte[] var12 = var2.doFinal(
            new byte[]{
               (byte)(var10 >>> 56),
               (byte)(var10 >>> 48),
               (byte)(var10 >>> 40),
               (byte)(var10 >>> 32),
               (byte)(var10 >>> 24),
               (byte)(var10 >>> 16),
               (byte)(var10 >>> 8),
               (byte)var10
            }
         );
         long var10004 = (var12[0] & 255L) << 56
            | (var12[1] & 255L) << 48
            | (var12[2] & 255L) << 40
            | (var12[3] & 255L) << 32
            | (var12[4] & 255L) << 24
            | (var12[5] & 255L) << 16
            | (var12[6] & 255L) << 8
            | var12[7] & 255L;
         byte var14 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      b = var8;
      c = new Integer[2];
      ezu = new GLBackendState[]{GLBackendState.BLEND, GLBackendState.VERTEX, GLBackendState.PIXEL_STORE, GLBackendState.TEXTURE_BINDING, GLBackendState.MISC};
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19379;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/ag", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
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
         throw new RuntimeException("cc/astralis/ag" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
