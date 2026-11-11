package cc.astralis;

import io.github.humbleui.skija.FilterTileMode;
import io.github.humbleui.skija.ImageFilter;
import io.github.humbleui.skija.Paint;
import io.github.humbleui.types.RRect;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;

public class coc extends class_437 {
   private static final Color bbw;
   private static final Color egi;
   private static final int gsj;
   private static final int fzw;
   private static final int bpx;
   private static final int fgr;
   private static final int ciq;
   private static final int ejc;
   private final float apw;
   private final List<gnp> bfv;
   private final Map<gnp, dqp> bia;
   private gnp bal;
   private static final axb<Paint> csi;
   private static final long a = 94521316966282L;
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   public coc() {
      long a = coc.a ^ 54025599819964L;
      super(class_2561.method_30163(""));
      a.bfv = new ArrayList<>();
      a.bia = new HashMap<>();
      float ax = 0.0F;
      int[] var10000 = dar.abu();
      bfm[] var5 = bfm.values();
      int var6 = var5.length;
      int var7 = 0;
      int[] axx = var10000;

      while (true) {
         if (var7 < var6) {
            bfm axxx;
            gnp axxxx;
            label25: {
               axxx = var5[var7];
               short var10003 = 26710;
               long var10004 = 2983158060980685240L ^ a;
               axxxx = new gnp(axxx, 21);
               coc var11 = a;
               if (axx != null) {
                  a.bfv.add(axxxx);
                  ax += axxxx.ajg() + 5.0F;
                  if (axx == null) {
                     break;
                  }

                  if (axxx != bfm.COMBAT) {
                     break label25;
                  }

                  var11 = a;
               }

               var11.bal = axxxx;
            }

            dqp axxxxx = new dqp(axxx, 325.0F, 218.0F);
            a.bia.put(axxxx, axxxxx);
            var7++;
            if (axx != null) {
               continue;
            }
         }

         a.apw = ax - 5.0F;
         break;
      }
   }

   public void method_25420(class_332 context, int mouseX, int mouseY, float deltaTicks) {
   }

   public void method_25394(class_332 context, int mouseX, int mouseY, float deltaTicks) {
      dfr.bmt(() -> {
         long ax = coc.a ^ 72439465396748L;
         short var10001 = 3850;
         long var10002 = 6330476676907582552L ^ ax;
         float axx = (a.field_22789 - 360) * 0.5F;
         var10001 = 10825;
         var10002 = 8600600644738703644L ^ ax;
         float axxx = (a.field_22790 - 218) * 0.5F;
         float axxxx = 6.0F;
         RRect axxxxx = RRect.makeXYWH(dmp.dxk(axx), dmp.dxk(axxx), dmp.dxk(366.0F), dmp.dxk(224.0F), dmp.dxk(8.0F));
         csi.ehu().setColor(Color.black.getRGB()).setImageFilter(ImageFilter.makeBlur(20.0F, 20.0F, FilterTileMode.DECAL)).setAntiAlias(true);
         dmp.fpb().saveLayer(null, null);
         dmp.fpb().drawRRect(axxxxx, csi.ehu());
         dmp.fpb().restore();
         a.fzv(a, a);
         ffm.fpp().emf(a, a);
      });
   }

   private void fzv(float a, float a) {
      long ax = coc.a ^ 28586073454582L;
      int[] var10000 = dar.abu();
      short var10002 = 8309;
      long var10003 = 8923465933053482718L ^ ax;
      float axx = (a.field_22789 - 360) * 0.5F;
      int[] axxx = var10000;
      short var10001 = 6809;
      long var18 = 867974516226976819L ^ ax;
      float axxxx = (a.field_22790 - 218) * 0.5F;
      dmp.cpp(axx, axxxx, 360.0F, 218.0F, 8.0F, bbw);
      dmp.caz(axx, axxxx, 35.0F, 218.0F, 8.0F, 0.0F, 0.0F, 8.0F, egi);
      float axxxxx = axx + 7.0F;
      float axxxxxx = axxxx + (218.0F - (a.apw + 7.0F));

      for (gnp axxxxxxx : a.bfv) {
         axxxxxxx.ckn(axxxxx, axxxxxx, a, a);
         if (axxx != null) {
            if (a.bal == axxxxxxx) {
               short var15 = 8440;
               long var16 = 4688289572783314517L ^ ax;
               int axxxxxxxx = 6;
               dmp.caz(axxxxx + 6.0F, axxxxxx + axxxxxxx.ajg(), axxxxxxx.arq() - 12.0F, 1.5F, 0.0F, 0.0F, 1.0F, 1.0F, Color.white);
            }

            axxxxxx += axxxxxxx.ajg() + 5.0F;
         }

         if (axxx == null) {
            break;
         }
      }

      var10001 = 29158;
      long var19 = 5580513273170200392L ^ ax;
      fll axxxxxxx = bxc.emc(b, 21);
      ezv axxxxxxxx = dar.gqy().aws().diy(ezv.class);
      axxxxxxx.aof("A", axxxxx + 3.5F, axxxx + 7.0F, axxxxxxxx.ehf.dnp());
      a.bia.get(a.bal).ckn(axx + 35.0F, axxxx, a, a);
   }

   public boolean method_25402(class_11909 click, boolean doubled) {
      long ax = coc.a ^ 116941649672548L;
      int[] axx = dar.abu();
      boolean var10000 = ffm.fpp().gkk(a, a);
      if (axx != null) {
         if (var10000) {
            return true;
         }

         var10000 = ffm.fpp().fbr();
      }

      if (axx != null) {
         if (!var10000) {
            a.bia.get(a.bal).gdj(a.comp_4798(), a.comp_4799(), a.method_74245());

            for (gnp axxx : a.bfv) {
               label47: {
                  if (axx != null) {
                     var10000 = axxx.efu(a.comp_4798(), a.comp_4799());
                     if (axx == null) {
                        return var10000;
                     }

                     if (!var10000) {
                        break label47;
                     }

                     a.bal = axxx;
                  }

                  if (axx != null) {
                     break;
                  }
               }

               if (axx == null) {
                  break;
               }
            }
         }

         var10000 = super.method_25402(a, a);
      }

      return var10000;
   }

   public boolean method_25406(class_11909 click) {
      a.bia.get(a.bal).euk(a.comp_4798(), a.comp_4799(), a.method_74245());
      return super.method_25406(a);
   }

   public boolean method_25403(class_11909 click, double offsetX, double offsetY) {
      long ax = coc.a ^ 36724491555424L;
      int[] var8 = dar.abu();
      boolean var10000 = ffm.fpp().fgn(a, a, a);
      if (var8 != null) {
         if (var10000) {
            return true;
         }

         var10000 = super.method_25403(a, a, a);
      }

      return var10000;
   }

   public boolean method_25401(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      long ax = coc.a ^ 117624414718406L;
      int[] var11 = dar.abu();
      double var12;
      int var10000 = (var12 = a - 0.0) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
      if (var11 != null) {
         if (var10000) {
            a.bia.get(a.bal).bof(-a);
         }

         var10000 = ffm.fpp().dmj(a, a, a, a);
      }

      if (var11 != null) {
         if (var10000) {
            return true;
         }

         var10000 = super.method_25401(a, a, a, a);
      }

      return (boolean)var10000;
   }

   public boolean method_25404(class_11908 input) {
      long ax = coc.a ^ 32222494817492L;
      int[] var4 = dar.abu();
      boolean var10000 = ffm.fpp().chz(a);
      if (var4 != null) {
         if (var10000) {
            return true;
         }

         var10000 = super.method_25404(a);
      }

      return var10000;
   }

   public boolean method_25400(class_11905 input) {
      long ax = coc.a ^ 93910203841844L;
      int[] var4 = dar.abu();
      boolean var10000 = ffm.fpp().flf(a);
      if (var4 != null) {
         if (var10000) {
            return true;
         }

         var10000 = super.method_25400(a);
      }

      return var10000;
   }

   static {
      long var14 = a ^ 134846981287411L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)(var14 << var12 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var13 = var11.doFinal("Sf-Bold".getBytes("ISO-8859-1"));
      String var30 = a(var13).intern();
      int var10001 = -1;
      b = var30;
      e = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[17];
      int var3 = 0;
      String var4 = "Lý\u0005ëF÷\u001f$¦·\u0092X\u008c¨\u007f\u0089\u0010\u001a\u008fVIFÛ\u0012Ò\u007f0W)æÑO\u008bNï4\u00adm\u0012es,]ßÅI\u000b=\u0085µ~®\u001fåìQõÝO\u0086Ðã· ¦\u0015\u0000\u0004\twÒ\u0000 \u0093\u008f\u0084µiÁM\"£ÔÈuõ\u0014£¬u\f|P\u0011Ð&1nUÒL\u0006ó>èÚÐt×³cUëáïºûà\u009et";
      int var5 = "Lý\u0005ëF÷\u001f$¦·\u0092X\u008c¨\u007f\u0089\u0010\u001a\u008fVIFÛ\u0012Ò\u007f0W)æÑO\u008bNï4\u00adm\u0012es,]ßÅI\u000b=\u0085µ~®\u001fåìQõÝO\u0086Ðã· ¦\u0015\u0000\u0004\twÒ\u0000 \u0093\u008f\u0084µiÁM\"£ÔÈuõ\u0014£¬u\f|P\u0011Ð&1nUÒL\u0006ó>èÚÐt×³cUëáïºûà\u009et"
         .length();
      byte var2 = 0;

      label29:
      while (true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var18 = var6;
         var10001 = var3++;
         long var32 = (var7[0] & 255L) << 56
            | (var7[1] & 255L) << 48
            | (var7[2] & 255L) << 40
            | (var7[3] & 255L) << 32
            | (var7[4] & 255L) << 24
            | (var7[5] & 255L) << 16
            | (var7[6] & 255L) << 8
            | var7[7] & 255L;
         byte var37 = -1;

         while (true) {
            long var8 = var32;
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
            long var43 = (var10[0] & 255L) << 56
               | (var10[1] & 255L) << 48
               | (var10[2] & 255L) << 40
               | (var10[3] & 255L) << 32
               | (var10[4] & 255L) << 24
               | (var10[5] & 255L) << 16
               | (var10[6] & 255L) << 8
               | var10[7] & 255L;
            switch (var37) {
               case 0:
                  var18[var10001] = var43;
                  if (var2 >= var5) {
                     c = var6;
                     d = new Integer[17];
                     short var19 = 27460;
                     long var26 = var14 ^ 8144178352657287143L;
                     ejc = 5;
                     fgr = a<"b">(20435, var14 ^ 6738575292218205033L);
                     short var20 = 25727;
                     long var27 = var14 ^ 3870467266380974294L;
                     ciq = 21;
                     short var21 = 27552;
                     long var28 = var14 ^ 4238762823526467340L;
                     fzw = 218;
                     short var22 = 16084;
                     long var29 = var14 ^ 5618140980324569715L;
                     bpx = 7;
                     gsj = a<"b">(11664, var14 ^ 2534670748621701429L);
                     short var34 = 11392;
                     long var39 = 4658603601223188518L ^ var14;
                     short var40 = 17041;
                     var43 = 4975100582038990389L ^ var14;
                     short var45 = 17041;
                     long var10005 = 4975100582038990389L ^ var14;
                     bbw = new Color(25, 25, 25);
                     short var35 = 26839;
                     long var41 = 6991707214490059893L ^ var14;
                     short var42 = 17977;
                     var43 = 4125661018832267929L ^ var14;
                     short var47 = 17977;
                     var10005 = 4125661018832267929L ^ var14;
                     egi = new Color(30, 30, 30);
                     csi = axb.afp(() -> {
                        Paint a = new Paint();
                        a.setAntiAlias(true);
                        return a;
                     });
                     return;
                  }
                  break;
               default:
                  var18[var10001] = var43;
                  if (var2 < var5) {
                     continue label29;
                  }

                  var4 = "\u0087Ìñ¾\u001d<éL<\u0018dÈ\u0089g\u0081Í";
                  var5 = "\u0087Ìñ¾\u001d<éL<\u0018dÈ\u0089g\u0081Í".length();
                  var2 = 0;
            }

            byte var25 = var2;
            var2 += 8;
            var7 = var4.substring(var25, var2).getBytes("ISO-8859-1");
            var18 = var6;
            var10001 = var3++;
            var32 = (var7[0] & 255L) << 56
               | (var7[1] & 255L) << 48
               | (var7[2] & 255L) << 40
               | (var7[3] & 255L) << 32
               | (var7[4] & 255L) << 24
               | (var7[5] & 255L) << 16
               | (var7[6] & 255L) << 8
               | var7[7] & 255L;
            var37 = 0;
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32467;
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
            throw new RuntimeException("cc/astralis/coc", var14);
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
         throw new RuntimeException("cc/astralis/coc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
