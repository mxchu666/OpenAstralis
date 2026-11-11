package cc.astralis;

import imgui.type.ImFloat;
import io.github.humbleui.skija.BlendMode;
import io.github.humbleui.skija.Canvas;
import io.github.humbleui.skija.ClipMode;
import io.github.humbleui.skija.ColorFilter;
import io.github.humbleui.skija.FilterTileMode;
import io.github.humbleui.skija.GradientStyle;
import io.github.humbleui.skija.Image;
import io.github.humbleui.skija.ImageFilter;
import io.github.humbleui.skija.Paint;
import io.github.humbleui.skija.PaintMode;
import io.github.humbleui.skija.Path;
import io.github.humbleui.skija.Shader;
import io.github.humbleui.types.RRect;
import io.github.humbleui.types.Rect;
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
import org.lwjgl.opengl.GL30;

public class dmp {
   private static float bcd;
   private static final Paint flb;
   private static final Paint hcx;
   private static final axb<Paint> ask;
   private static final axb<Paint> cbs;
   private static final axb<Paint> aes;
   private static final axb<Paint> gjh;
   private static final Paint doo;
   private static final Paint enz;
   private static final Paint fxd;
   private static Canvas gex;
   private static Path bqh;
   private static final long a = 134243313432536L;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public static void gsc(float scale) {
      bcd = Math.max(0.5F, a);
   }

   public static float fqt() {
      return bcd;
   }

   public static float dxk(float v) {
      return a * bcd;
   }

   private static Rect dkj(float a, float a, float a, float a) {
      return Rect.makeXYWH(dxk(a), dxk(a), dxk(a), dxk(a));
   }

   private static RRect awy(float a, float a, float a, float a, float a) {
      return RRect.makeXYWH(dxk(a), dxk(a), dxk(a), dxk(a), dxk(a));
   }

   private static float[] adt(float... a) {
      long ax = dmp.a ^ 107827427960627L;
      int[] var10000 = dar.abu();
      int axx = 0;
      int[] axxx = var10000;

      while (true) {
         if (axx < a.length) {
            var5 = a;
            if (axxx == null) {
               break;
            }

            a[axx] *= bcd;
            axx++;
            if (axxx != null) {
               continue;
            }
         }

         var5 = a;
         break;
      }

      return var5;
   }

   private static void bzp() {
      long var0 = a ^ 3326783196086L;
      int[] var2 = dar.abu();
      Path var10000 = bqh;
      if (var2 != null) {
         if (bqh != null) {
            return;
         }

         var10000 = new Path();
      }

      bqh = var10000;
   }

   public static void bxf(int shadowColor) {
      Object var7;
      label29: {
         long ax = dmp.a ^ 12454729550107L;
         int[] var10000 = dar.abu();
         ezv axx = dar.gqy().aws().diy(ezv.class);
         int[] axxx = var10000;
         boolean var6 = axx.dsv();
         if (axxx != null) {
            if (!var6) {
               return;
            }

            var7 = axx.btt.dnp();
            if (axxx == null) {
               break label29;
            }

            var6 = var7;
         }

         if (!var6) {
            return;
         }

         var7 = axx.dud.dnp();
      }

      float axxxx = ((ImFloat)var7).floatValue();
      gjh.ehu().setImageFilter(ImageFilter.makeBlur(axxxx, axxxx, FilterTileMode.DECAL));
      gjh.ehu().setColor(a);
      gex.saveLayer(null, null);
      gex.drawPath(bqh, gjh.ehu());
      gex.drawPath(bqh, doo);
      bzg();
   }

   public static void fzn(float x, float y, float width, float height) {
      adu(a, a, a, a, Color.black.getRGB());
   }

   public static void adu(float x, float y, float width, float height, int shadowColor) {
      bzp();
      bqh.addRect(dkj(a, a, a, a));
   }

   public static void grl(float x, float y, float width, float height) {
      bzp();
      Rect ax = gpf(a, a, a, a);
      bqh.addRect(ax);
   }

   public static void fnq(float x, float y, float width, float height, float radius) {
      ern(a, a, a, a, a, Color.black.getRGB());
   }

   public static void ern(float x, float y, float width, float height, float radius, int shadowColor) {
      bzp();
      bqh.addRRect(awy(a, a, a, a, a));
   }

   public static void bfk(int width, int height) {
      long ax = dmp.a ^ 86167002798790L;
      int[] axx = dar.abu();
      dfw var10000 = dar.gqy().aws();
      if (axx != null) {
         if (var10000 == null) {
            return;
         }

         var10000 = dar.gqy().aws();
      }

      ezv axxx = var10000.diy(ezv.class);
      boolean var9 = axxx.dsv();
      if (axx != null) {
         if (!var9) {
            return;
         }

         var9 = axxx.btt.dnp();
      }

      if (var9) {
         Object var10 = bqh;
         if (axx != null) {
            if (bqh == null) {
               bqh = new Path();
            }

            var10 = axxx.fxw.dnp();
         }

         label77: {
            label90: {
               label91: {
                  label92: {
                     label93: {
                        var11 = (Boolean)var10;
                        if (axx != null) {
                           if (var11) {
                              break label93;
                           }

                           var11 = axxx.btt.dnp();
                        }

                        if (axx == null) {
                           break label91;
                        }

                        if (!var11) {
                           break label92;
                        }
                     }

                     eel axxxx = new eel(a, a);
                     dar.gqy().fyf().brx(axxxx);
                     var11 = axxx.btt.dnp();
                     if (axx == null) {
                        break label91;
                     }

                     if (var11) {
                        bxf(Color.BLACK.getRGB());
                     }
                  }

                  var10 = axxx.fxw.dnp();
                  if (axx == null) {
                     break label90;
                  }

                  var11 = var10;
               }

               if (!var11) {
                  break label77;
               }

               hdn();
               gex.clipPath(bqh, ClipMode.INTERSECT);
               var10 = axxx.ecd.dnp();
            }

            float axxxxx = dxk(((ImFloat)var10).floatValue());
            fxd.setImageFilter(ImageFilter.makeBlur(axxxxx, axxxxx, FilterTileMode.CLAMP));
            Image axxxxxx = dar.gqy().bav().adw();
            gex.drawImageRect(axxxxxx, Rect.makeXYWH(0.0F, 0.0F, dxk(axxxxxx.getWidth()), dxk(axxxxxx.getHeight())), fxd);
            bzg();
         }

         bqh.close();
         bqh = null;
      }
   }

   private static Shader gkg(float a, float a, float a, float a, int a, int a, boolean a) {
      float var16;
      label21: {
         long ax = dmp.a ^ 118630354419613L;
         a = dxk(a);
         int[] var10000 = dar.abu();
         a = dxk(a);
         int[] axx = var10000;
         a = dxk(a);
         var16 = dxk(a);
         if (axx != null) {
            a = var16;
            if (a) {
               var16 = a;
               break label21;
            }

            var16 = a;
         }

         var16 += a;
      }

      float ax = var16;
      float axx = a ? a + a : a;
      return Shader.makeLinearGradient(a, a, ax, axx, new int[]{a, a}, null, new GradientStyle(FilterTileMode.CLAMP, false, null));
   }

   public static void euv(float x, float y, float w, float h, Color color) {
      flb.reset().setAntiAlias(true).setColor(a.getRGB());
      gex.drawRect(dkj(a, a, a, a), flb);
   }

   public static void fcp(float x, float y, float w, float h, Color fillColor, float thickness, Color outlineColor) {
      euv(a, a, a, a, a);
      hcx.reset().setAntiAlias(true).setMode(PaintMode.STROKE).setColor(a.getRGB()).setStrokeWidth(dxk(a));
      gex.drawRect(dkj(a, a, a, a), hcx);
   }

   public static void dyl(float x, float y, float w, float h, Color c1, Color c2, boolean vertical) {
      Paint ax = ask.ehu().setAntiAlias(true).setShader(gkg(a, a, a, a, a.getRGB(), a.getRGB(), a));
      gex.drawRect(dkj(a, a, a, a), ax);
   }

   public static void eud(float x, float y, float w, float h, Color c1, Color c2, boolean vertical, float thickness, Color outlineColor) {
      dyl(a, a, a, a, a, a, a);
      fcp(a, a, a, a, new Color(0, true), a, a);
   }

   public static void cpp(float x, float y, float w, float h, float radius, Color color) {
      flb.reset().setAntiAlias(true).setColor(a.getRGB());
      gex.drawRRect(awy(a, a, a, a, a), flb);
   }

   public static void caz(float x, float y, float w, float h, float tl, float tr, float br, float bl, Color color) {
      long ax = dmp.a ^ 83765468085614L;
      short var10000 = 1111;
      long var10001 = 228152265225545627L ^ ax;
      float[] var12 = new float[]{a, a, a, a, a, a, 0.0F, 0.0F};
      short var10002 = 5905;
      long var10003 = 8632231305801250003L ^ ax;
      var12[6] = a;
      var10002 = 2682;
      var10003 = 6405146246352382391L ^ ax;
      var12[7] = a;
      float[] axx = adt(var12);
      flb.reset().setAntiAlias(true).setColor(a.getRGB());
      gex.drawRRect(RRect.makeComplexXYWH(dxk(a), dxk(a), dxk(a), dxk(a), axx), flb);
   }

   public static void dnc(float x, float y, float w, float h, float radius, Color fillColor, float thickness, Color outlineColor) {
      cpp(a, a, a, a, a, a);
      RRect ax = awy(a, a, a, a, a);
      hcx.reset().setAntiAlias(true).setMode(PaintMode.STROKE).setColor(a.getRGB()).setStrokeWidth(dxk(a));
      gex.drawRRect(ax, hcx);
   }

   public static void dwy(float x, float y, float w, float h, float tl, float tr, float br, float bl, Color fillColor, float thickness, Color outlineColor) {
      long ax = dmp.a ^ 87780662646383L;
      caz(a, a, a, a, a, a, a, a, a);
      short var10000 = 12431;
      long var10001 = 2017813069444364358L ^ ax;
      float[] var15 = new float[]{a, a, a, a, a, a, 0.0F, 0.0F};
      short var10002 = 26674;
      long var10003 = 94612710223503613L ^ ax;
      var15[6] = a;
      var10002 = 9924;
      var10003 = 8473817378112876047L ^ ax;
      var15[7] = a;
      float[] axx = adt(var15);
      RRect axxx = RRect.makeComplexXYWH(dxk(a), dxk(a), dxk(a), dxk(a), axx);
      hcx.reset().setAntiAlias(true).setMode(PaintMode.STROKE).setColor(a.getRGB()).setStrokeWidth(dxk(a));
      gex.drawRRect(axxx, hcx);
   }

   public static void aho(float x, float y, float w, float h, float radius, Color c1, Color c2, boolean vertical) {
      Paint ax = new Paint().setAntiAlias(true).setShader(gkg(a, a, a, a, a.getRGB(), a.getRGB(), a));
      gex.drawRRect(awy(a, a, a, a, a), ax);
      ax.close();
   }

   public static void dsm(float x, float y, float w, float h, float radius, Color c1, Color c2) {
      Shader ax = Shader.makeLinearGradient(
         dxk(a), dxk(a), dxk(a + a), dxk(a + a), new int[]{a.getRGB(), a.getRGB()}, null, new GradientStyle(FilterTileMode.CLAMP, false, null)
      );
      Paint axx = new Paint().setAntiAlias(true).setShader(ax);
      gex.drawRRect(awy(a, a, a, a, a), axx);
      axx.close();
   }

   public static void cdw(float x, float y, float w, float h, float tl, float tr, float br, float bl, Color c1, Color c2, boolean vertical) {
      long ax = dmp.a ^ 87565853405474L;
      short var10000 = 1111;
      long var10001 = 228149547159137239L ^ ax;
      float[] var15 = new float[]{a, a, a, a, a, a, 0.0F, 0.0F};
      short var10002 = 5905;
      long var10003 = 8632234076438542495L ^ ax;
      var15[6] = a;
      var10002 = 2682;
      var10003 = 6405144617904023035L ^ ax;
      var15[7] = a;
      float[] axx = adt(var15);
      Paint axxx = new Paint().setAntiAlias(true).setShader(gkg(a, a, a, a, a.getRGB(), a.getRGB(), a));
      gex.drawRRect(RRect.makeComplexXYWH(dxk(a), dxk(a), dxk(a), dxk(a), axx), axxx);
      axxx.close();
   }

   public static void hbm(float x, float y, float w, float h, float radius, Color c1, Color c2, boolean vertical, float thickness, Color fillColor) {
      cpp(a, a, a, a, a, a);
      Paint ax = new Paint().setAntiAlias(true).setMode(PaintMode.STROKE).setStrokeWidth(dxk(a)).setShader(gkg(a, a, a, a, a.getRGB(), a.getRGB(), a));
      gex.drawRRect(awy(a, a, a, a, a), ax);
      ax.close();
   }

   public static void and(
      float x, float y, float w, float h, float tl, float tr, float br, float bl, Color c1, Color c2, boolean vertical, float thickness, Color fillColor
   ) {
      long ax = dmp.a ^ 25275640050743L;
      caz(a, a, a, a, a, a, a, a, a);
      short var10000 = 1111;
      long var10001 = 228229567465909954L ^ ax;
      float[] var18 = new float[]{a, a, a, a, a, a, 0.0F, 0.0F};
      short var10002 = 5905;
      long var10003 = 8632136531592215946L ^ ax;
      var18[6] = a;
      var10002 = 2682;
      var10003 = 6405240450737856750L ^ ax;
      var18[7] = a;
      float[] axx = adt(var18);
      RRect axxx = RRect.makeComplexXYWH(dxk(a), dxk(a), dxk(a), dxk(a), axx);
      Paint axxxx = new Paint().setAntiAlias(true).setMode(PaintMode.STROKE).setStrokeWidth(dxk(a)).setShader(gkg(a, a, a, a, a.getRGB(), a.getRGB(), a));
      gex.drawRRect(axxx, axxxx);
      axxxx.close();
   }

   public static void egv(float x1, float y1, float x2, float y2, Color color) {
      flb.reset().setAntiAlias(true).setColor(a.getRGB());
      gex.drawLine(dxk(a), dxk(a), dxk(a), dxk(a), flb);
   }

   public static void ezk(float x1, float y1, float x2, float y2, float thickness, Color color) {
      hcx.reset().setAntiAlias(true).setMode(PaintMode.STROKE).setColor(a.getRGB()).setStrokeWidth(dxk(a));
      gex.drawLine(dxk(a), dxk(a), dxk(a), dxk(a), hcx);
   }

   public static void fiz(float x1, float y1, float x2, float y2, float x3, float y3, Color color) {
      Path ax = new Path();
      ax.moveTo(dxk(a), dxk(a));
      ax.lineTo(dxk(a), dxk(a));
      ax.lineTo(dxk(a), dxk(a));
      ax.closePath();
      flb.reset().setAntiAlias(true).setColor(a.getRGB());
      gex.drawPath(ax, flb);
      ax.close();
   }

   public static void auq(float x, float y, float radius, Color color) {
      flb.reset().setAntiAlias(true).setImageFilter(null).setColor(a.getRGB());
      gex.drawCircle(dxk(a), dxk(a), dxk(a), flb);
   }

   public static void baq(float cx, float cy, float radius, Color color) {
      auq(a, a, a, a);
   }

   public static void ery(float cx, float cy, float radius, float thickness, Color color) {
      hcx.reset().setAntiAlias(true).setMode(PaintMode.STROKE).setColor(a.getRGB()).setStrokeWidth(dxk(a));
      gex.drawCircle(dxk(a), dxk(a), dxk(a), hcx);
   }

   public static void asa(float cx, float cy, float radius, float thickness, Color startColor, Color endColor, boolean vertical) {
      float ax = a - a;
      float axx = a - a;
      hcx.reset().setAntiAlias(true).setMode(PaintMode.STROKE).setStrokeWidth(dxk(a)).setShader(gkg(ax, axx, a * 2.0F, a * 2.0F, a.getRGB(), a.getRGB(), a));
      gex.drawCircle(dxk(a), dxk(a), dxk(a), hcx);
   }

   public static void eq(float x, float y, Color color) {
      euv(a, a, 1.0F, 1.0F, a);
   }

   public static void gst(float x1, float y1, float x2, float y2, Color color) {
      flb.reset().setAntiAlias(true).setColor(a.getRGB());
      gex.drawRect(gpf(a, a, a, a), flb);
   }

   public static void dxg(float x1, float y1, float x2, float y2, Color topColor, Color bottomColor) {
      Rect ax = gpf(a, a, a, a);
      Paint axx = new Paint()
         .setAntiAlias(true)
         .setShader(gkg(ax.getLeft() / bcd, ax.getTop() / bcd, ax.getWidth() / bcd, ax.getHeight() / bcd, a.getRGB(), a.getRGB(), true));
      gex.drawRect(ax, axx);
      axx.close();
   }

   public static void gmg(float x1, float y1, float x2, float y2, Color leftColor, Color rightColor) {
      Rect ax = gpf(a, a, a, a);
      Paint axx = new Paint()
         .setAntiAlias(true)
         .setShader(gkg(ax.getLeft() / bcd, ax.getTop() / bcd, ax.getWidth() / bcd, ax.getHeight() / bcd, a.getRGB(), a.getRGB(), false));
      gex.drawRect(ax, axx);
      axx.close();
   }

   public static Rect gpf(float x1, float y1, float x2, float y2) {
      long ax = dmp.a ^ 30588663345959L;
      float axx = Math.min(a, a);
      int[] var10000 = dar.abu();
      float axxx = Math.max(a, a);
      float axxxx = Math.min(a, a);
      int[] axxxxx = var10000;
      float axxxxxx = Math.max(a, a);
      float var13;
      int var11 = (var13 = axxx - axx - 0.5F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
      if (axxxxx != null) {
         if (var11 < 0) {
            axxx = axx + 0.5F;
         }

         float var12 = axxxxxx - axxxx;
         if (axxxxx == null) {
            return Rect.makeLTRB(var12, 0.5F, dxk(axxx), dxk(axxxxxx));
         }

         float var14;
         var11 = (var14 = var12 - 0.5F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
      }

      if (var11 < 0) {
         axxxxxx = axxxx + 0.5F;
      }

      return Rect.makeLTRB(dxk(axx), dxk(axxxx), dxk(axxx), dxk(axxxxxx));
   }

   public static void gnj(float x, float y, float w, float h, float radius, Image image, Color tint) {
      hdn();
      gex.clipRRect(awy(a, a, a, a, a), ClipMode.INTERSECT);
      dzr(a, a, a, a, a, a);
      bzg();
   }

   public static void dzr(float x, float y, float w, float h, Image image, Color tint) {
      long ax = dmp.a ^ 101390462154759L;
      int[] var8 = dar.abu();
      if (var8 != null) {
         if (a != null) {
            enz.setColorFilter(ColorFilter.makeBlend(a.getRGB(), BlendMode.SRC_ATOP));
         }

         gex.drawImageRect(a, dkj(a, a, a, a), enz);
      }
   }

   public static void hdf(float x, float y, float width, float height) {
      Rect ax = dkj(a, a, a, a);
      hdn();
      gex.clipRect(ax);
   }

   public static void abh(float x, float y, float width, float height, Runnable draw) {
      hdf(a, a, a, a);

      try {
         a.run();
      } finally {
         bzg();
      }
   }

   public static void hdn() {
      gex.save();
   }

   public static void bzg() {
      gex.restore();
   }

   public static void fle(float x, float y) {
      gex.scale(a, a);
   }

   public static void bud(float rotationAngle) {
      gex.rotate(a);
   }

   public static void gpu(float x, float y) {
      gex.translate(dxk(a), dxk(a));
   }

   public static int cim() {
      long a = dmp.a ^ 111066651056775L;
      int[] ax = new int[1];
      int[] axx = new int[1];
      int var10000 = 20692;
      long var10001 = 7291002405971203326L ^ a;
      GL30.glGetIntegerv(33307, ax);
      var10000 = (short)11945;
      var10001 = 7957702268429724297L ^ a;
      GL30.glGetIntegerv(33308, axx);
      var10000 = ax[0];
      short var8 = 9145;
      long var10002 = 7522420841151227807L ^ a;
      var10000 *= 100;
      int var9 = axx[0];
      short var10 = 23475;
      long var10003 = 1446809344614277009L ^ a;
      return var10000 + var9 * 10;
   }

   public static void hbn(Canvas canvas) {
      gex = a;
   }

   public static Canvas fpb() {
      return gex;
   }

   static {
      long var0 = a ^ 83310408021513L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[12];
      int var5 = 0;
      String var6 = "\u008aÍyrDÛ\u0003ËÆ&t\u0006(\u0002\u0011Ä\u007f@w\"ß\u000e: Æ1èE\b\\cPÎóÁ$S/,\u000bRÝÀõ¡Ï·6\u0088\u0001\tàlöúÏNH\u0081\u0006%Ós÷T^i\u0011¾\u001aE¨*Âù¡¥}\u0003!";
      int var7 = "\u008aÍyrDÛ\u0003ËÆ&t\u0006(\u0002\u0011Ä\u007f@w\"ß\u000e: Æ1èE\b\\cPÎóÁ$S/,\u000bRÝÀõ¡Ï·6\u0088\u0001\tàlöúÏNH\u0081\u0006%Ós÷T^i\u0011¾\u001aE¨*Âù¡¥}\u0003!"
         .length();
      byte var4 = 0;

      label23:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = (var9[0] & 255L) << 56
            | (var9[1] & 255L) << 48
            | (var9[2] & 255L) << 40
            | (var9[3] & 255L) << 32
            | (var9[4] & 255L) << 24
            | (var9[5] & 255L) << 16
            | (var9[6] & 255L) << 8
            | var9[7] & 255L;
         byte var19 = -1;

         while (true) {
            long var10 = var17;
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
            long var21 = (var12[0] & 255L) << 56
               | (var12[1] & 255L) << 48
               | (var12[2] & 255L) << 40
               | (var12[3] & 255L) << 32
               | (var12[4] & 255L) << 24
               | (var12[5] & 255L) << 16
               | (var12[6] & 255L) << 8
               | var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     b = var8;
                     c = new Integer[12];
                     bcd = 2.0F;
                     flb = new Paint();
                     hcx = new Paint().setAntiAlias(true).setMode(PaintMode.STROKE);
                     ask = axb.afp(
                        () -> {
                           long a = dmp.a ^ 92727885731018L;
                           Paint ax = new Paint();
                           ax.setColor(
                              io.github.humbleui.skija.Color.makeARGB(
                                 a<"n">(24071, 620315842089014371L ^ a),
                                 a<"n">(5554, 4139833035977564119L ^ a),
                                 a<"n">(5554, 4139833035977564119L ^ a),
                                 a<"n">(5554, 4139833035977564119L ^ a)
                              )
                           );
                           return ax;
                        }
                     );
                     cbs = axb.afp(() -> new Paint());
                     aes = axb.afp(() -> {
                        Paint a = new Paint();
                        a.setAntiAlias(true);
                        return a;
                     });
                     gjh = axb.afp(() -> {
                        Paint a = new Paint();
                        a.setAntiAlias(true);
                        return a;
                     });
                     doo = new Paint().setBlendMode(BlendMode.CLEAR);
                     enz = new Paint().setAntiAlias(true);
                     fxd = new Paint();
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "ãûmRPC6ö~m)á«ª\u008bB";
                  var7 = "ãûmRPC6ö~m)á«ª\u008bB".length();
                  var4 = 0;
            }

            byte var16 = var4;
            var4 += 8;
            var9 = var6.substring(var16, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = (var9[0] & 255L) << 56
               | (var9[1] & 255L) << 48
               | (var9[2] & 255L) << 40
               | (var9[3] & 255L) << 32
               | (var9[4] & 255L) << 24
               | (var9[5] & 255L) << 16
               | (var9[6] & 255L) << 8
               | var9[7] & 255L;
            var19 = 0;
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10621;
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
            throw new RuntimeException("cc/astralis/dmp", var14);
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
         throw new RuntimeException("cc/astralis/dmp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
