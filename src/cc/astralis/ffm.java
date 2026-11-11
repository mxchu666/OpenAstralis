package cc.astralis;

import com.google.gson.JsonObject;
import java.awt.Color;
import java.io.File;
import java.io.PrintStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_310;

public class ffm {
   private final int awm;
   private final int gt;
   private final int abn;
   private final int gwu;
   private float gfo;
   private float dwq;
   private boolean byr;
   private boolean hid;
   private boolean gxr;
   private int chy;
   private int dpb;
   private int gya;
   private int gqe;
   private String dyv;
   private String avw;
   private final erp dtn;
   private final erp gnm;
   private final class_310 aku;
   private static ffm hcn;
   private static final long a = 123914004231192L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long[] h;
   private static final Long[] i;
   private static final Map j;

   public static ffm fpp() {
      long var0 = a ^ 53247588357982L;
      int[] var2 = dar.abu();
      ffm var10000 = hcn;
      if (var2 != null) {
         if (hcn == null) {
            hcn = new ffm();
         }

         var10000 = hcn;
      }

      return var10000;
   }

   private ffm() {
      long a = ffm.a ^ 64426455088262L;
      super();
      a.awm = b<"h">(25, 2464828684615244586L ^ a);
      int var10001 = 15108;
      long var10002 = 7597388775349870604L ^ a;
      a.gt = 400;
      var10001 = (short)7971;
      var10002 = 8507550924585649174L ^ a;
      a.abn = 30;
      var10001 = (short)21731;
      var10002 = 6859791223979872238L ^ a;
      a.gwu = 15;
      a.byr = false;
      a.hid = false;
      a.gxr = false;
      a.gya = 0;
      a.gqe = 0;
      a.dyv = "";
      a.avw = "";
      a.dtn = new erp(dtw.EASE_IN_OUT_SINE, c<"c">(26543, 2748837448778086515L ^ a));
      a.gnm = new erp(dtw.EASE_IN_OUT_SINE, c<"c">(13980, 1918036290853218625L ^ a));
      a.aku = class_310.method_1551();
      a.gfo = a.aku.method_22683().method_4486();
      var10001 = a.aku.method_22683().method_4502();
      short var8 = 15108;
      long var10003 = 7597388775349870604L ^ a;
      a.dwq = (var10001 - 400) / 2;
   }

   public void emf(int mouseX, int mouseY) {
      long ax;
      int[] axx;
      float axxx;
      float axxxx;
      float axxxxx;
      int var26;
      label119: {
         label123: {
            ax = ffm.a ^ 65413957654451L;
            axx = dar.abu();
            a.dtn.dwm(a.hid ? 1.0 : 0.0);
            a.gnm.dwm(a.gxr ? 1.0 : 0.0);
            axxx = (float)a.dtn.hjo();
            var26 = a.aku.method_22683().method_4486();
            int var10001 = 7285;
            long var10002 = 109813945943190620L ^ ax;
            float axxxxxx = (var26 - 700) / 2;
            a.gfo = a.aku.method_22683().method_4486() + (axxxxxx - a.aku.method_22683().method_4486()) * axxx;
            var10001 = a.aku.method_22683().method_4502();
            short var42 = 1033;
            long var10003 = 7501577866067801146L ^ ax;
            a.dwq = (var10001 - 400) / 2;
            var26 = a.aku.method_22683().method_4486();
            short var32 = 7971;
            var10002 = 8507552152606273315L ^ ax;
            var26 -= 30;
            var32 = 9214;
            var10002 = 8014445726720709595L ^ ax;
            axxxx = var26 - 15;
            var26 = a.aku.method_22683().method_4502();
            var32 = 7971;
            var10002 = 8507552152606273315L ^ ax;
            var26 -= 30;
            var32 = 21731;
            var10002 = 6859789412245710043L ^ ax;
            axxxxx = var26 - 15;
            float var79;
            var26 = (var79 = a - axxxx) == 0.0F ? 0 : (var79 < 0.0F ? -1 : 1);
            if (axx != null) {
               if (var26 < 0) {
                  break label123;
               }

               float var80;
               var26 = (var80 = a - axxxxx) == 0.0F ? 0 : (var80 < 0.0F ? -1 : 1);
            }

            if (axx != null) {
               if (var26 < 0) {
                  break label123;
               }

               float var81;
               var26 = (var81 = a - (axxxx + 30.0F)) == 0.0F ? 0 : (var81 < 0.0F ? -1 : 1);
            }

            if (axx != null) {
               if (var26 > 0) {
                  break label123;
               }

               float var82;
               var26 = (var82 = a - (axxxxx + 30.0F)) == 0.0F ? 0 : (var82 < 0.0F ? -1 : 1);
            }

            if (axx == null) {
               break label119;
            }

            if (var26 <= 0) {
               var26 = 1;
               break label119;
            }
         }

         var26 = 0;
      }

      boolean axxxxxxx = (boolean)var26;
      Color var10005;
      if (axxxxxxx != 0) {
         var10005 = dar.gqy().deo();
      } else {
         short var10007 = 7971;
         long var10008 = 8507552152606273315L ^ ax;
         short var59 = 7971;
         long var10009 = 8507552152606273315L ^ ax;
         short var67 = 7971;
         long var10010 = 8507552152606273315L ^ ax;
         var10005 = new Color(30, 30, 30);
      }

      label97: {
         dmp.cpp(axxxx, axxxxx, 30.0F, 30.0F, 8.0F, var10005);
         float var27 = axxxx + 10.0F;
         float var36 = axxxxx + 15.0F;
         float var47 = axxxx + 20.0F;
         float var51 = axxxxx + 15.0F;
         float var10004 = 2.0F;
         var10005 = Color.WHITE;
         if (axx != null) {
            dmp.ezk(var27, var36, var47, var51, 2.0F, Color.WHITE);
            if (a.hid) {
               dmp.ezk(axxxx + 15.0F, axxxxx + 10.0F, axxxx + 15.0F, axxxxx + 20.0F, 2.0F, Color.WHITE);
               if (axx != null) {
                  break label97;
               }
            }

            var27 = axxxx + 15.0F;
            var36 = axxxxx + 10.0F;
            var47 = axxxx + 15.0F;
            var51 = axxxxx + 20.0F;
            var10004 = 2.0F;
            var10005 = Color.WHITE;
         }

         dmp.ezk(var27, var36, var47, var51, var10004, var10005);
      }

      float var28 = axxx;
      float var37 = 0.01F;
      if (axx != null) {
         label87: {
            if (!(axxx > 0.01F)) {
               var29 = a;
               if (axx == null) {
                  break label87;
               }

               if (a.dtn.flo()) {
                  return;
               }
            }

            short var54 = 16598;
            long var60 = 2451204146908344552L ^ ax;
            short var61 = 26337;
            long var68 = 7275372104353191635L ^ ax;
            short var69 = 26337;
            long var74 = 7275372104353191635L ^ ax;
            short var75 = 10553;
            long var10011 = 3533474160695466240L ^ ax;
            dmp.cpp(a.gfo, a.dwq, 700.0F, 400.0F, 8.0F, new Color(18, 18, 18, 250));
            dmp.cdw(a.gfo, a.dwq, 700.0F, 12.0F, 8.0F, 8.0F, 0.0F, 0.0F, dar.gqy().deo(), dar.gqy().cxj(), false);
            var29 = a;
         }

         var28 = var29.gfo;
         var37 = 20.0F;
      }

      float axxxxxxxx = var28 + var37;
      float axxxxxxxxx = a.dwq + 25.0F;
      short var38 = 14695;
      long var48 = 6062918273586771270L ^ ax;
      amh.dot.ebb("Cloud Configurations", axxxxxxxx, axxxxxxxxx, Color.WHITE);
      short var39 = 28174;
      var48 = 7821683376596017706L ^ ax;
      float var52 = axxxxxxxxx + 15.0F;
      short var10006 = 3290;
      long var55 = 8773684583468596466L ^ ax;
      short var56 = 21321;
      long var62 = 7963918853198095210L ^ ax;
      short var63 = 21321;
      long var70 = 7963918853198095210L ^ ax;
      amh.ety.ebb("Browse and download community configurations", axxxxxxxx, var52, new Color(160, 160, 160));
      float axxxxxxxxxx = 70.0F;
      float axxxxxxxxxxx = 20.0F;
      float axxxxxxxxxxxx = a.gfo + 700.0F - 70.0F - 20.0F;
      float axxxxxxxxxxxxx = axxxxxxxxx - 2.0F;
      int var57 = dar.gqy().deo().getRed();
      int var64 = dar.gqy().deo().getGreen();
      int var71 = dar.gqy().deo().getBlue();
      short var76 = 12998;
      long var78 = 2764161667322266342L ^ ax;
      dmp.cpp(axxxxxxxxxxxx, axxxxxxxxxxxxx, 70.0F, 20.0F, 4.0F, new Color(var57, var64, var71, 200));
      short var40 = 21115;
      var48 = 8563186886265495126L ^ ax;
      amh.grb.ebb("Upload", axxxxxxxxxxxx + 20.0F, axxxxxxxxxxxxx + 4.0F, Color.WHITE);
      var37 = axxxxxxxxx + 30.0F;
      short var58 = 29886;
      var62 = 2771328824697128079L ^ ax;
      short var66 = 29886;
      var70 = 2771328824697128079L ^ ax;
      short var73 = 29886;
      long var77 = 2771328824697128079L ^ ax;
      dmp.cpp(axxxxxxxx, var37, 660.0F, 1.0F, 0.5F, new Color(40, 40, 40));
      float axxxxxxxxxxxxxx = a.gfo + 25.0F;
      float axxxxxxxxxxxxxxx = a.dwq + 70.0F;
      float axxxxxxxxxxxxxxxx = 320.0F;
      float axxxxxxxxxxxxxxxxx = 90.0F;
      float axxxxxxxxxxxxxxxxxx = 10.0F;
      dmp.abh(a.gfo + 20.0F, a.dwq + 70.0F, 660.0F, 300.0F, () -> {
         long ax = ffm.a ^ 55613057028608L;
         int[] var10000x = dar.abu();
         int axx = 0;
         int[] axxx = var10000x;

         while (axx < aml.cic.size()) {
            ago axxxx = aml.cic.get(axx);
            float axxxxx = a + axx % 2 * 330.0F;
            float axxxxxx = a + axx / 2 * 100.0F - a.gya;
            a.hit(axxxx, axxxxx, axxxxxx, 320.0F, 90.0F);
            axx++;
            if (axxx == null) {
               break;
            }
         }
      });
      ffm var30 = a;
      if (axx != null) {
         if (!(a.gnm.hjo() > 0.01)) {
            return;
         }

         var30 = a;
      }

      var30.bcw();
   }

   private void bcw() {
      long a = ffm.a ^ 117177870937390L;
      float ax = 400.0F;
      float axx = 300.0F;
      float axxx = (a.aku.method_22683().method_4486() - ax) / 2.0F;
      float axxxx = (a.aku.method_22683().method_4502() - axx) / 2.0F;
      float axxxxx = (float)a.gnm.hjo();
      float axxxxxx = ax * axxxxx;
      float axxxxxxx = axx * axxxxx;
      float axxxxxxxx = axxx + (ax - axxxxxx) / 2.0F;
      float axxxxxxxxx = axxxx + (axx - axxxxxxx) / 2.0F;
      dmp.cpp(0.0F, 0.0F, a.aku.method_22683().method_4486(), a.aku.method_22683().method_4502(), 0.0F, new Color(0, 0, 0, (int)(100.0F * axxxxx)));
      float var10004 = 8.0F * axxxxx;
      int var10007 = 18086;
      long var10008 = 1871010945034963991L ^ a;
      short var59 = 6469;
      long var10009 = 5685295632169735130L ^ a;
      short var67 = 6469;
      long var10010 = 5685295632169735130L ^ a;
      dmp.cpp(axxxxxxxx, axxxxxxxxx, axxxxxx, axxxxxxx, var10004, new Color(25, 25, 25));
      dmp.cdw(axxxxxxxx, axxxxxxxxx, axxxxxx, 12.0F * axxxxx, 8.0F * axxxxx, 8.0F * axxxxx, 0.0F, 0.0F, dar.gqy().deo(), dar.gqy().cxj(), false);
      short var10001 = 21675;
      long var10002 = 7059570359977419294L ^ a;
      amh.dot.ebb("Upload Configuration", axxxxxxxx + 20.0F * axxxxx, axxxxxxxxx + 25.0F * axxxxx, Color.WHITE);
      float axxxxxxxxxx = axxxxxxxxx + 60.0F * axxxxx;
      var10001 = 3791;
      var10002 = 6085419677880744047L ^ a;
      amh.grb.ebb("Configuration Name:", axxxxxxxx + 20.0F * axxxxx, axxxxxxxxxx, Color.WHITE);
      axxxxxxxxxx += 20.0F * axxxxx;
      Color var10000;
      if (a.gqe == 0) {
         var10000 = dar.gqy().deo();
      } else {
         short var34 = 31246;
         long var10003 = 187571950230532263L ^ a;
         short var41 = 8169;
         long var46 = 3504127965568963906L ^ a;
         short var47 = 8169;
         long var10005 = 3504127965568963906L ^ a;
         var10000 = new Color(50, 50, 50);
      }

      Color axxxxxxxxxxx = var10000;
      dmp.cpp(axxxxxxxx + 20.0F * axxxxx, axxxxxxxxxx, (ax - 40.0F) * axxxxx, 25.0F * axxxxx, 4.0F * axxxxx, axxxxxxxxxxx);
      float var24 = axxxxxxxx + 22.0F * axxxxx;
      float var28 = axxxxxxxxxx + 2.0F * axxxxx;
      float var35 = (ax - 44.0F) * axxxxx;
      float var42 = 21.0F * axxxxx;
      var10004 = 3.0F * axxxxx;
      var10007 = (short)31486;
      var10008 = 3966180290729340993L ^ a;
      short var61 = 8322;
      var10009 = 1828784695249709620L ^ a;
      short var69 = 8322;
      var10010 = 1828784695249709620L ^ a;
      dmp.cpp(var24, var28, var35, var42, var10004, new Color(35, 35, 35));
      amh.grb.ebb(a.dyv + (a.gqe == 0 ? "_" : ""), axxxxxxxx + 28.0F * axxxxx, axxxxxxxxxx + 8.0F * axxxxx, Color.WHITE);
      axxxxxxxxxx += 40.0F * axxxxx;
      var10001 = 20426;
      var10002 = 8793302464726776180L ^ a;
      amh.grb.ebb("Description:", axxxxxxxx + 20.0F * axxxxx, axxxxxxxxxx, Color.WHITE);
      axxxxxxxxxx += 20.0F * axxxxx;
      if (a.gqe == 1) {
         var10000 = dar.gqy().deo();
      } else {
         short var37 = 8169;
         long var43 = 3504127965568963906L ^ a;
         short var44 = 8169;
         long var49 = 3504127965568963906L ^ a;
         short var50 = 8169;
         long var54 = 3504127965568963906L ^ a;
         var10000 = new Color(50, 50, 50);
      }

      Color axxxxxxxxxxxx = var10000;
      dmp.cpp(axxxxxxxx + 20.0F * axxxxx, axxxxxxxxxx, (ax - 40.0F) * axxxxx, 60.0F * axxxxx, 4.0F * axxxxx, axxxxxxxxxxxx);
      float var26 = axxxxxxxx + 22.0F * axxxxx;
      float var30 = axxxxxxxxxx + 2.0F * axxxxx;
      float var38 = (ax - 44.0F) * axxxxx;
      var42 = 56.0F * axxxxx;
      var10004 = 3.0F * axxxxx;
      var10007 = (short)8322;
      var10008 = 1828784695249709620L ^ a;
      short var63 = 8322;
      var10009 = 1828784695249709620L ^ a;
      short var71 = 8322;
      var10010 = 1828784695249709620L ^ a;
      dmp.cpp(var26, var30, var38, var42, var10004, new Color(35, 35, 35));
      a.evf(a.avw + (a.gqe == 1 ? "_" : ""), axxxxxxxx + 28.0F * axxxxx, axxxxxxxxxx + 8.0F * axxxxx, (ax - 56.0F) * axxxxx, 12.0F * axxxxx, Color.WHITE);
      axxxxxxxxxx += 80.0F * axxxxx;
      float axxxxxxxxxxxxx = 80.0F * axxxxx;
      float axxxxxxxxxxxxxx = 25.0F * axxxxx;
      float axxxxxxxxxxxxxxx = axxxxxxxx + axxxxxx - 180.0F * axxxxx;
      float axxxxxxxxxxxxxxxx = axxxxxxxx + axxxxxx - 90.0F * axxxxx;
      var10004 = 4.0F * axxxxx;
      var10007 = (short)8195;
      var10008 = 4677021129191107234L ^ a;
      short var65 = 30664;
      var10009 = 1232343389691805048L ^ a;
      short var73 = 30664;
      var10010 = 1232343389691805048L ^ a;
      dmp.cpp(axxxxxxxxxxxxxxx, axxxxxxxxxx, axxxxxxxxxxxxx, axxxxxxxxxxxxxx, var10004, new Color(60, 60, 60));
      var10001 = 20481;
      var10002 = 8809255817026152119L ^ a;
      amh.cbl.ebb("Cancel", axxxxxxxxxxxxxxx + 24.0F * axxxxx, axxxxxxxxxx + 7.0F * axxxxx, Color.WHITE);
      var10004 = 4.0F * axxxxx;
      var10007 = dar.gqy().deo().getRed();
      int var66 = dar.gqy().deo().getGreen();
      int var74 = dar.gqy().deo().getBlue();
      short var78 = 32295;
      long var10011 = 6646803881025893532L ^ a;
      dmp.cpp(axxxxxxxxxxxxxxxx, axxxxxxxxxx, axxxxxxxxxxxxx, axxxxxxxxxxxxxx, var10004, new Color(var10007, var66, var74, 200));
      var10001 = 12442;
      var10002 = 6360475891186681381L ^ a;
      amh.cbl.ebb("Upload", axxxxxxxxxxxxxxxx + 24.0F * axxxxx, axxxxxxxxxx + 7.0F * axxxxx, Color.WHITE);
   }

   private void hit(ago a, float a, float a, float a, float a) {
      long ax;
      float axx;
      float axxx;
      String var25;
      ax = ffm.a ^ 96945837073846L;
      float var10000 = a + 1.0F;
      float var10001 = a + 1.0F;
      short var10010 = 30115;
      long var10011 = 2607836974983149448L ^ ax;
      dmp.cpp(var10000, var10001, a, a, 6.0F, new Color(0, 0, 0, 40));
      int var10007 = 27711;
      long var10008 = 4798883051123469839L ^ ax;
      short var40 = 12328;
      long var10009 = 3119124831989019148L ^ ax;
      short var46 = 12328;
      long var50 = 3119124831989019148L ^ ax;
      dmp.cpp(a, a, a, a, 6.0F, new Color(28, 28, 28));
      dmp.cpp(a, a, 3.0F, a, 6.0F, dar.gqy().deo());
      int[] var20 = dar.abu();
      axx = a + 12.0F;
      axxx = a + 12.0F;
      amh.dot.ebb(a.amx(), axx, axxx, Color.WHITE);
      axxx += 16.0F;
      int[] axxxx = var20;
      amh.cbl.ebb(a.ayq().eus(), axx, axxx, dar.gqy().deo());
      short var10002 = 4865;
      long var10003 = 7449266515414936878L ^ ax;
      SimpleDateFormat axxxxx = new SimpleDateFormat("MMM dd, yyyy");
      String var21 = axxxxx.format(new Date(a.bsl()));
      short var24 = 7539;
      long var30 = 8029292065629463384L ^ ax;
      String axxxxxx = " • " + var21;
      fll var22 = amh.ety;
      float var31 = axx + amh.cbl.eq(a.ayq().eus());
      short var10006 = 12797;
      long var35 = 1002871196030841815L ^ ax;
      var10007 = (short)17030;
      var10008 = 3284768532488831104L ^ ax;
      short var42 = 17030;
      var10009 = 3284768532488831104L ^ ax;
      var22.ebb(axxxxxx, var31, axxx, new Color(120, 120, 120));
      axxx += 14.0F;
      var25 = a.chb();
      label29:
      if (axxxx != null) {
         label26:
         if (!var25.isEmpty()) {
            ago var26 = a;
            if (axxxx != null) {
               if (a.chb().isBlank()) {
                  break label26;
               }

               var26 = a;
            }

            var25 = var26.chb();
            break label29;
         }

         short var27 = 16337;
         long var32 = 1523065064150385137L ^ ax;
         var25 = "No Description Provided";
      }

      a.bve(var25, axx, axxx, a - 24.0F, 10.0F, Color.LIGHT_GRAY);
      float axxxxxxx = a + a - 20.0F;
      fll var23 = amh.ety;
      var25 = "#" + a.cna();
      var10006 = 23195;
      long var37 = 6991759035719473321L ^ ax;
      var10007 = (short)26693;
      var10008 = 5346689354708019812L ^ ax;
      short var44 = 26693;
      var10009 = 5346689354708019812L ^ ax;
      var23.ebb(var25, axx, axxxxxxx, new Color(100, 100, 100));
      float axxxxxxxx = 60.0F;
      float axxxxxxxxx = 16.0F;
      float axxxxxxxxxx = a + a - 60.0F - 12.0F;
      float axxxxxxxxxxx = axxxxxxx - 4.0F;
      var10007 = dar.gqy().deo().getRed();
      int var45 = dar.gqy().deo().getGreen();
      int var49 = dar.gqy().deo().getBlue();
      var10010 = 3093;
      var10011 = 6336055410853711392L ^ ax;
      dmp.cpp(axxxxxxxxxx, axxxxxxxxxxx, 60.0F, 16.0F, 3.0F, new Color(var10007, var45, var49, 180));
      short var29 = 6581;
      long var33 = 5377066659852314524L ^ ax;
      amh.ety.ebb("Download", axxxxxxxxxx + 11.5F, axxxxxxxxxxx + 3.0F, Color.WHITE);
   }

   private void bve(String a, float a, float a, float a, float a, Color a) {
      long ax = ffm.a ^ 48405721760783L;
      String[] axx = a.split(" ");
      StringBuilder axxx = new StringBuilder();
      int[] var10000 = dar.abu();
      float axxxx = a;
      int axxxxx = 0;
      String[] var14 = axx;
      int var15 = axx.length;
      int[] axxxxxx = var10000;
      int var16 = 0;

      while (true) {
         label107:
         if (var16 < var15) {
            String axxxxxxx;
            label105: {
               axxxxxxx = var14[var16];
               StringBuilder var20 = axxx;
               if (axxxxxx != null) {
                  var21 = axxx.length();
                  if (axxxxxx == null) {
                     break;
                  }

                  if (var21 <= 0) {
                     var22 = axxxxxxx;
                     break label105;
                  }

                  var20 = axxx;
               }

               var22 = var20 + " " + axxxxxxx;
            }

            label97: {
               label96: {
                  String axxxxxxxx = var22;
                  float var27;
                  int var23 = (var27 = amh.ety.eq(axxxxxxxx) - a) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1);
                  if (axxxxxx != null) {
                     if (var23 <= 0) {
                        break label96;
                     }

                     if (axxxxxx == null) {
                        break label97;
                     }

                     var23 = axxx.length();
                  }

                  if (var23 > 0) {
                     label116: {
                        String axxxxxxxxx = axxx.toString();
                        int var24 = axxxxx;
                        short var10001 = 1;
                        if (axxxxxx != null) {
                           label117: {
                              if (axxxxx == 1) {
                                 var24 = axx[axx.length - 1].equals(axxxxxxx);
                                 if (axxxxxx == null) {
                                    break label117;
                                 }

                                 if (var24 == 0) {
                                    String var25 = axxxxxxxxx.substring(0, Math.min(axxxxxxxxx.length(), b<"h">(30898, 8003161297943747343L ^ ax)));
                                    var10001 = 31906;
                                    long var10002 = 2203240078759764798L ^ ax;
                                    axxxxxxxxx = var25 + "...";
                                 }
                              }

                              amh.ety.ebb(axxxxxxxxx, a, axxxx, a);
                              axxxxx++;
                              if (axxxxxx == null) {
                                 break label116;
                              }

                              var24 = axxxxx;
                           }

                           var10001 = 2;
                        }

                        if (var24 >= var10001) {
                           break label107;
                        }

                        axxx = new StringBuilder(axxxxxxx);
                        axxxx += a;
                     }

                     if (axxxxxx != null) {
                        break label97;
                     }
                  }
               }

               axxx.append(axxxxxxx).append(" ");
            }

            var16++;
            if (axxxxxx != null) {
               continue;
            }
         }

         var21 = axxxxx;
         break;
      }

      if (axxxxxx != null) {
         if (var21 >= 2) {
            return;
         }

         var21 = axxx.length();
      }

      if (var21 > 0) {
         amh.ety.ebb(axxx.toString().trim(), a, axxxx, a);
      }
   }

   private void evf(String a, float a, float a, float a, float a, Color a) {
      long ax = ffm.a ^ 5567450862165L;
      int[] var10000 = dar.abu();
      String[] axx = a.split(" ");
      StringBuilder axxx = new StringBuilder();
      float axxxx = a;
      int[] axxxxx = var10000;
      int axxxxxx = 0;
      String[] var14 = axx;
      int var15 = axx.length;
      int var16 = 0;

      while (true) {
         label87:
         if (var16 < var15) {
            String axxxxxxx;
            label85: {
               axxxxxxx = var14[var16];
               StringBuilder var19 = axxx;
               if (axxxxx != null) {
                  var20 = axxx.isEmpty();
                  if (axxxxx == null) {
                     break;
                  }

                  if (var20 != 0) {
                     var21 = axxxxxxx;
                     break label85;
                  }

                  var19 = axxx;
               }

               var21 = var19 + " " + axxxxxxx;
            }

            label77: {
               label76: {
                  String axxxxxxxx = var21;
                  float var23;
                  int var22 = (var23 = amh.grb.eq(axxxxxxxx) - a) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1);
                  if (axxxxx != null) {
                     if (var22 <= 0) {
                        break label76;
                     }

                     if (axxxxx == null) {
                        break label77;
                     }

                     var22 = axxx.length();
                  }

                  if (var22 > 0) {
                     amh.grb.ebb(axxx.toString(), a, axxxx, a);
                     axxxxxx++;
                     if (axxxxx != null) {
                        if (axxxxxx >= 4) {
                           break label87;
                        }

                        axxx = new StringBuilder(axxxxxxx);
                        axxxx += a;
                     }

                     if (axxxxx != null) {
                        break label77;
                     }
                  }
               }

               axxx.append(axxxxxxx).append(" ");
            }

            var16++;
            if (axxxxx != null) {
               continue;
            }
         }

         var20 = axxxxxx;
         break;
      }

      if (axxxxx != null) {
         if (var20 >= 4) {
            return;
         }

         var20 = axxx.isEmpty();
      }

      if (var20 == 0) {
         amh.grb.ebb(axxx.toString().trim(), a, axxxx, a);
      }
   }

   public boolean gkk(class_11909 click, boolean doubled) {
      long ax = ffm.a ^ 27354830201982L;
      int[] var10000 = dar.abu();
      double axx = a.comp_4798();
      double axxx = a.comp_4799();
      int axxxx = a.method_74245();
      int[] axxxxx = var10000;
      int var30 = axxxx;
      if (axxxxx != null) {
         if (axxxx == 0) {
            int var31 = a.aku.method_22683().method_4486();
            short var10001 = 7971;
            long var10002 = 8507517419964505326L ^ ax;
            int var32 = var31 - 30;
            var10001 = 21731;
            var10002 = 6859824181295339286L ^ ax;
            float axxxxxx = var32 - 15;
            int var33 = a.aku.method_22683().method_4502();
            var10001 = 7971;
            var10002 = 8507517419964505326L ^ ax;
            int var34 = var33 - 30;
            var10001 = 21731;
            var10002 = 6859824181295339286L ^ ax;
            float axxxxxxx = var34 - 15;
            double var53;
            var35 = (var53 = axx - axxxxxx) == 0.0 ? 0 : (var53 < 0.0 ? -1 : 1);
            label252:
            if (axxxxx != null) {
               if (var35 >= 0) {
                  double var54;
                  var35 = (var54 = axxx - axxxxxxx) == 0.0 ? 0 : (var54 < 0.0 ? -1 : 1);
                  if (axxxxx == null) {
                     break label252;
                  }

                  if (var35 >= 0) {
                     double var55;
                     var35 = (var55 = axx - (axxxxxx + 30.0F)) == 0.0 ? 0 : (var55 < 0.0 ? -1 : 1);
                     if (axxxxx == null) {
                        break label252;
                     }

                     if (var35 <= 0) {
                        double var56;
                        var35 = (var56 = axxx - (axxxxxxx + 30.0F)) == 0.0 ? 0 : (var56 < 0.0 ? -1 : 1);
                        if (axxxxx == null) {
                           break label252;
                        }

                        if (var35 <= 0) {
                           boolean var43 = a.hid;
                           if (axxxxx != null) {
                              var43 = !a.hid;
                           }

                           a.hid = var43;
                           ffm var36 = a;
                           if (axxxxx != null) {
                              if (a.hid) {
                                 new fxc().dak(dar.gqy().gp());
                                 if (axxxxx != null) {
                                    return true;
                                 }
                              }

                              var36 = a;
                           }

                           var36.gxr = false;
                           return true;
                        }
                     }
                  }
               }

               var35 = a.hid;
            }

            if (axxxxx == null) {
               return (boolean)var35;
            }

            if (var35 == 0) {
               return (boolean)0;
            }

            float axxxxxxxx = 70.0F;
            float axxxxxxxxx = 20.0F;
            float axxxxxxxxxx = a.gfo + 700.0F - 70.0F - 20.0F;
            float axxxxxxxxxxx = a.dwq + 23.0F;
            double var57;
            var37 = (var57 = axx - axxxxxxxxxx) == 0.0 ? 0 : (var57 < 0.0 ? -1 : 1);
            label237:
            if (axxxxx != null) {
               if (var37 >= 0) {
                  double var58;
                  var37 = (var58 = axx - (axxxxxxxxxx + 70.0F)) == 0.0 ? 0 : (var58 < 0.0 ? -1 : 1);
                  if (axxxxx == null) {
                     break label237;
                  }

                  if (var37 <= 0) {
                     double var59;
                     var37 = (var59 = axxx - axxxxxxxxxxx) == 0.0 ? 0 : (var59 < 0.0 ? -1 : 1);
                     if (axxxxx == null) {
                        break label237;
                     }

                     if (var37 >= 0) {
                        double var60;
                        var37 = (var60 = axxx - (axxxxxxxxxxx + 20.0F)) == 0.0 ? 0 : (var60 < 0.0 ? -1 : 1);
                        if (axxxxx == null) {
                           break label237;
                        }

                        if (var37 <= 0) {
                           a.gxr = true;
                           a.dyv = "";
                           a.avw = "";
                           a.gqe = 0;
                           return true;
                        }
                     }
                  }
               }

               double var61;
               var37 = (var61 = axx - a.gfo) == 0.0 ? 0 : (var61 < 0.0 ? -1 : 1);
            }

            label267: {
               if (axxxxx != null) {
                  if (var37 < 0) {
                     break label267;
                  }

                  double var62;
                  var37 = (var62 = axx - (a.gfo + 700.0F)) == 0.0 ? 0 : (var62 < 0.0 ? -1 : 1);
               }

               if (axxxxx != null) {
                  if (var37 > 0) {
                     break label267;
                  }

                  double var63;
                  var37 = (var63 = axxx - a.dwq) == 0.0 ? 0 : (var63 < 0.0 ? -1 : 1);
               }

               if (axxxxx != null) {
                  if (var37 < 0) {
                     break label267;
                  }

                  double var64;
                  var37 = (var64 = axxx - (a.dwq + 40.0F)) == 0.0 ? 0 : (var64 < 0.0 ? -1 : 1);
               }

               if (axxxxx == null) {
                  return (boolean)var37;
               }

               if (var37 <= 0) {
                  a.byr = true;
                  a.chy = (int)axx - (int)a.gfo;
                  a.dpb = (int)axxx - (int)a.dwq;
                  return (boolean)1;
               }
            }

            float axxxxxxxxxxxx = a.gfo + 25.0F;
            float axxxxxxxxxxxxx = a.dwq + 70.0F;
            float axxxxxxxxxxxxxx = 320.0F;
            float axxxxxxxxxxxxxxx = 90.0F;
            float axxxxxxxxxxxxxxxx = 10.0F;
            int axxxxxxxxxxxxxxxxx = 0;

            label209: {
               while (axxxxxxxxxxxxxxxxx < aml.cic.size()) {
                  ago axxxxxxxxxxxxxxxxxx = aml.cic.get(axxxxxxxxxxxxxxxxx);
                  float axxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxx + axxxxxxxxxxxxxxxxx % 2 * 330.0F;
                  float axxxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxx + axxxxxxxxxxxxxxxxx / 2 * 100.0F - a.gya;
                  float axxxxxxxxxxxxxxxxxxxxx = 60.0F;
                  float axxxxxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxxxxxx + 320.0F - 60.0F - 12.0F;
                  float axxxxxxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxxxxxxx + 90.0F - 20.0F - 4.0F;
                  File var48 = class_310.method_1551().field_1697;
                  short var10003 = 8619;
                  long var10004 = 3708659453870497344L ^ ax;
                  String var50 = "Astralis".toLowerCase();
                  short var10005 = 8499;
                  long var10006 = 8794778569531547353L ^ ax;
                  File axxxxxxxxxxxxxxxxxxxxxxxx = new File(var48, "/" + var50 + "/Configs");
                  if (axxxxx != null) {
                     double var65;
                     var70 = (var65 = axx - axxxxxxxxxxxxxxxxxxxxxx) == 0.0 ? 0 : (var65 < 0.0 ? -1 : 1);
                     if (axxxxx == null) {
                        break label209;
                     }

                     label201:
                     if (var70 >= 0) {
                        double var66;
                        int var38 = (var66 = axx - (axxxxxxxxxxxxxxxxxxxxxx + 60.0F)) == 0.0 ? 0 : (var66 < 0.0 ? -1 : 1);
                        if (axxxxx != null) {
                           if (var38 > 0) {
                              break label201;
                           }

                           double var67;
                           var38 = (var67 = axxx - axxxxxxxxxxxxxxxxxxxxxxx) == 0.0 ? 0 : (var67 < 0.0 ? -1 : 1);
                        }

                        if (axxxxx != null) {
                           if (var38 < 0) {
                              break label201;
                           }

                           double var68;
                           var38 = (var68 = axxx - (axxxxxxxxxxxxxxxxxxxxxxx + 16.0F)) == 0.0 ? 0 : (var68 < 0.0 ? -1 : 1);
                        }

                        if (axxxxx == null) {
                           return (boolean)var38;
                        }

                        if (var38 <= 0) {
                           JsonObject var39 = axxxxxxxxxxxxxxxxxx.dvu();
                           String var44 = axxxxxxxxxxxxxxxxxxxxxxxx.getAbsolutePath();
                           String var49 = axxxxxxxxxxxxxxxxxx.amx();
                           short var51 = 22342;
                           long var52 = 1612388004995180706L ^ ax;
                           dvt.exy(var39, var44 + "/" + var49 + ".astralis");
                           return (boolean)1;
                        }
                     }

                     axxxxxxxxxxxxxxxxx++;
                  }

                  if (axxxxx == null) {
                     break;
                  }
               }

               var70 = a.gxr;
            }

            if (axxxxx == null) {
               return (boolean)var70;
            }

            if (var70 != 0) {
               double var69;
               int var71 = (var69 = a.gnm.hjo() - 0.01) == 0.0 ? 0 : (var69 < 0.0 ? -1 : 1);
               if (axxxxx == null) {
                  return (boolean)var71;
               }

               if (var71 > 0) {
                  return a.cj(axx, axxx);
               }
            }
         }

         var30 = 0;
      }

      return (boolean)var30;
   }

   private boolean cj(double a, double a) {
      long ax = ffm.a ^ 592147447312L;
      float axx = 400.0F;
      float axxx = 300.0F;
      float axxxx = (a.aku.method_22683().method_4486() - axx) / 2.0F;
      int[] var10000 = dar.abu();
      float axxxxx = (a.aku.method_22683().method_4502() - axxx) / 2.0F;
      float axxxxxx = (float)a.gnm.hjo();
      int[] axxxxxxx = var10000;
      float axxxxxxxx = axx * axxxxxx;
      float axxxxxxxxx = axxx * axxxxxx;
      float axxxxxxxxxx = axxxx + (axx - axxxxxxxx) / 2.0F;
      float axxxxxxxxxxx = axxxxx + (axxx - axxxxxxxxx) / 2.0F;
      double var41;
      int var34 = (var41 = a - axxxxxxxxxx) == 0.0 ? 0 : (var41 < 0.0 ? -1 : 1);
      if (axxxxxxx != null) {
         if (var34 >= 0) {
            double var42;
            int var65 = (var42 = a - (axxxxxxxxxx + axxxxxxxx)) == 0.0 ? 0 : (var42 < 0.0 ? -1 : 1);
            if (axxxxxxx == null) {
               return (boolean)var65;
            }

            if (var65 <= 0) {
               double var43;
               int var66 = (var43 = a - axxxxxxxxxxx) == 0.0 ? 0 : (var43 < 0.0 ? -1 : 1);
               if (axxxxxxx == null) {
                  return (boolean)var66;
               }

               if (var66 >= 0) {
                  double var44;
                  int var67 = (var44 = a - (axxxxxxxxxxx + axxxxxxxxx)) == 0.0 ? 0 : (var44 < 0.0 ? -1 : 1);
                  if (axxxxxxx == null) {
                     return (boolean)var67;
                  }

                  if (var67 <= 0) {
                     float axxxxxxxxxxxx;
                     label280: {
                        axxxxxxxxxxxx = axxxxxxxxxxx + 80.0F * axxxxxx;
                        double var45;
                        var35 = (var45 = a - (axxxxxxxxxx + 20.0F * axxxxxx)) == 0.0 ? 0 : (var45 < 0.0 ? -1 : 1);
                        label261:
                        if (axxxxxxx != null) {
                           if (var35 >= 0) {
                              double var46;
                              var35 = (var46 = a - (axxxxxxxxxx + (axx - 20.0F) * axxxxxx)) == 0.0 ? 0 : (var46 < 0.0 ? -1 : 1);
                              if (axxxxxxx == null) {
                                 break label261;
                              }

                              if (var35 <= 0) {
                                 double var47;
                                 var35 = (var47 = a - axxxxxxxxxxxx) == 0.0 ? 0 : (var47 < 0.0 ? -1 : 1);
                                 if (axxxxxxx == null) {
                                    break label261;
                                 }

                                 if (var35 >= 0) {
                                    double var48;
                                    var35 = (var48 = a - (axxxxxxxxxxxx + 25.0F * axxxxxx)) == 0.0 ? 0 : (var48 < 0.0 ? -1 : 1);
                                    if (axxxxxxx == null) {
                                       break label261;
                                    }

                                    if (var35 <= 0) {
                                       a.gqe = 0;
                                       return true;
                                    }
                                 }
                              }
                           }

                           axxxxxxxxxxxx += 60.0F * axxxxxx;
                           if (axxxxxxx == null) {
                              break label280;
                           }

                           double var49;
                           var35 = (var49 = a - (axxxxxxxxxx + 20.0F * axxxxxx)) == 0.0 ? 0 : (var49 < 0.0 ? -1 : 1);
                        }

                        label248:
                        if (var35 >= 0) {
                           double var50;
                           int var36 = (var50 = a - (axxxxxxxxxx + (axx - 20.0F) * axxxxxx)) == 0.0 ? 0 : (var50 < 0.0 ? -1 : 1);
                           if (axxxxxxx != null) {
                              if (var36 > 0) {
                                 break label248;
                              }

                              double var51;
                              var36 = (var51 = a - axxxxxxxxxxxx) == 0.0 ? 0 : (var51 < 0.0 ? -1 : 1);
                           }

                           if (axxxxxxx != null) {
                              if (var36 < 0) {
                                 break label248;
                              }

                              double var52;
                              var36 = (var52 = a - (axxxxxxxxxxxx + 60.0F * axxxxxx)) == 0.0 ? 0 : (var52 < 0.0 ? -1 : 1);
                           }

                           if (axxxxxxx == null) {
                              return (boolean)var36;
                           }

                           if (var36 <= 0) {
                              a.gqe = 1;
                              return (boolean)1;
                           }
                        }

                        axxxxxxxxxxxx += 80.0F * axxxxxx;
                     }

                     float axxxxxxxxxxxxx;
                     float axxxxxxxxxxxxxx;
                     label284: {
                        float axxxxxxxxxxxxxxx = axxxxxxxxxx + axxxxxxxx - 180.0F * axxxxxx;
                        axxxxxxxxxxxxx = axxxxxxxxxx + axxxxxxxx - 90.0F * axxxxxx;
                        axxxxxxxxxxxxxx = 25.0F * axxxxxx;
                        double var53;
                        int var37 = (var53 = a - axxxxxxxxxxxxxxx) == 0.0 ? 0 : (var53 < 0.0 ? -1 : 1);
                        if (axxxxxxx != null) {
                           if (var37 < 0) {
                              break label284;
                           }

                           double var54;
                           var37 = (var54 = a - (axxxxxxxxxxxxxxx + 80.0F * axxxxxx)) == 0.0 ? 0 : (var54 < 0.0 ? -1 : 1);
                        }

                        if (axxxxxxx != null) {
                           if (var37 > 0) {
                              break label284;
                           }

                           double var55;
                           var37 = (var55 = a - axxxxxxxxxxxx) == 0.0 ? 0 : (var55 < 0.0 ? -1 : 1);
                        }

                        if (axxxxxxx != null) {
                           if (var37 < 0) {
                              break label284;
                           }

                           double var56;
                           var37 = (var56 = a - (axxxxxxxxxxxx + axxxxxxxxxxxxxx)) == 0.0 ? 0 : (var56 < 0.0 ? -1 : 1);
                        }

                        if (axxxxxxx == null) {
                           return (boolean)var37;
                        }

                        if (var37 <= 0) {
                           a.gxr = false;
                           return (boolean)1;
                        }
                     }

                     float axxxxxxxxxxxxxxxx = a.gfo + 25.0F;
                     float axxxxxxxxxxxxxxxxx = a.dwq + 70.0F;
                     float axxxxxxxxxxxxxxxxxx = 320.0F;
                     float axxxxxxxxxxxxxxxxxxx = 90.0F;
                     float axxxxxxxxxxxxxxxxxxxx = 10.0F;
                     int axxxxxxxxxxxxxxxxxxxxx = 0;

                     while (true) {
                        if (axxxxxxxxxxxxxxxxxxxxx < aml.cic.size()) {
                           ago axxxxxxxxxxxxxxxxxxxxxx = aml.cic.get(axxxxxxxxxxxxxxxxxxxxx);
                           float axxxxxxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxxx + axxxxxxxxxxxxxxxxxxxxx % 2 * 330.0F;
                           float axxxxxxxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxxxx + axxxxxxxxxxxxxxxxxxxxx / 2 * 100.0F - a.gya;
                           float axxxxxxxxxxxxxxxxxxxxxxxxx = 60.0F;
                           float axxxxxxxxxxxxxxxxxxxxxxxxxx = 16.0F;
                           float axxxxxxxxxxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxxxxxxxxxx + 320.0F - 60.0F - 12.0F;
                           float axxxxxxxxxxxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxxxxxxxxxxx + 90.0F - 20.0F - 4.0F;
                           if (axxxxxxx != null) {
                              double var57;
                              var38 = (var57 = a - axxxxxxxxxxxxxxxxxxxxxxxxxxx) == 0.0 ? 0 : (var57 < 0.0 ? -1 : 1);
                              if (axxxxxxx == null) {
                                 break;
                              }

                              label199:
                              if (var38 >= 0) {
                                 double var58;
                                 int var39 = (var58 = a - (axxxxxxxxxxxxxxxxxxxxxxxxxxx + 60.0F)) == 0.0 ? 0 : (var58 < 0.0 ? -1 : 1);
                                 if (axxxxxxx != null) {
                                    if (var39 > 0) {
                                       break label199;
                                    }

                                    double var59;
                                    var39 = (var59 = a - axxxxxxxxxxxxxxxxxxxxxxxxxxxx) == 0.0 ? 0 : (var59 < 0.0 ? -1 : 1);
                                 }

                                 if (axxxxxxx != null) {
                                    if (var39 < 0) {
                                       break label199;
                                    }

                                    double var60;
                                    var39 = (var60 = a - (axxxxxxxxxxxxxxxxxxxxxxxxxxxx + 16.0F)) == 0.0 ? 0 : (var60 < 0.0 ? -1 : 1);
                                 }

                                 if (axxxxxxx == null) {
                                    return (boolean)var39;
                                 }

                                 if (var39 <= 0) {
                                    PrintStream var40 = System.out;
                                    String var10001 = axxxxxxxxxxxxxxxxxxxxxx.amx();
                                    short var10002 = 13817;
                                    long var10003 = 5035865542863409269L ^ ax;
                                    var40.println("Download clicked for config: " + var10001);
                                    return (boolean)1;
                                 }
                              }

                              axxxxxxxxxxxxxxxxxxxxx++;
                           }

                           if (axxxxxxx != null) {
                              continue;
                           }
                        }

                        double var61;
                        var38 = (var61 = a - axxxxxxxxxxxxx) == 0.0 ? 0 : (var61 < 0.0 ? -1 : 1);
                        break;
                     }

                     if (axxxxxxx != null) {
                        if (var38 >= 0) {
                           double var62;
                           int var68 = (var62 = a - (axxxxxxxxxxxxx + 80.0F * axxxxxx)) == 0.0 ? 0 : (var62 < 0.0 ? -1 : 1);
                           if (axxxxxxx == null) {
                              return (boolean)var68;
                           }

                           if (var68 <= 0) {
                              double var63;
                              int var69 = (var63 = a - axxxxxxxxxxxx) == 0.0 ? 0 : (var63 < 0.0 ? -1 : 1);
                              if (axxxxxxx == null) {
                                 return (boolean)var69;
                              }

                              if (var69 >= 0) {
                                 double var64;
                                 int var70 = (var64 = a - (axxxxxxxxxxxx + axxxxxxxxxxxxxx)) == 0.0 ? 0 : (var64 < 0.0 ? -1 : 1);
                                 if (axxxxxxx == null) {
                                    return (boolean)var70;
                                 }

                                 if (var70 <= 0) {
                                    new hhm(new hbo(a.dyv, a.avw, aml.hjr.cfs(), aml.hjr.eus(), gco.bbm())).dak(dar.gqy().gp());
                                    new fxc().dak(dar.gqy().gp());
                                    a.gxr = false;
                                    return true;
                                 }
                              }
                           }
                        }

                        var38 = 1;
                     }

                     return (boolean)var38;
                  }
               }
            }
         }

         a.gxr = false;
         var34 = 1;
      }

      return (boolean)var34;
   }

   public boolean chz(class_11908 keyInput) {
      long ax = ffm.a ^ 51016355260621L;
      int[] var10000 = dar.abu();
      int axx = a.comp_4795();
      int[] axxx = var10000;
      boolean var6 = a.gxr;
      if (axxx != null) {
         if (a.gxr) {
            int var7 = axx;
            int var10001 = 24503;
            long var10002 = 3059544838565859574L ^ ax;
            var10001 = (short)256;
            if (axxx != null) {
               if (axx == 256) {
                  a.gxr = false;
                  return true;
               }

               var7 = axx;
               var10001 = (short)6171;
               var10002 = 1166127496897812290L ^ ax;
               var10001 = (short)258;
            }

            if (axxx != null) {
               if (var7 == var10001) {
                  var10001 = a.gqe;
                  if (axxx != null) {
                     var10001 = a.gqe == 0 ? 1 : 0;
                  }

                  a.gqe = var10001;
                  return true;
               }

               var7 = axx;
               short var11 = 28822;
               var10002 = 1310892831517458370L ^ ax;
               var10001 = (short)257;
            }

            if (axxx != null) {
               if (var7 == var10001) {
                  new hhm(new hbo(a.dyv, a.avw, aml.hjr.cfs(), aml.hjr.eus(), gco.bbm())).dak(dar.gqy().gp());
                  new fxc().dak(dar.gqy().gp());
                  a.gxr = false;
                  return true;
               }

               var7 = axx;
               if (axxx == null) {
                  return (boolean)axx;
               }

               short var12 = 15734;
               var10002 = 6267841007408050739L ^ ax;
               var10001 = (short)259;
            }

            if (var7 == var10001) {
               var8 = a.gqe;
               label101:
               if (axxx != null) {
                  if (a.gqe == 0) {
                     var8 = a.dyv.isEmpty();
                     if (axxx == null) {
                        break label101;
                     }

                     if (var8 == 0) {
                        a.dyv = a.dyv.substring(0, a.dyv.length() - 1);
                        if (axxx != null) {
                           return (boolean)1;
                        }
                     }
                  }

                  var8 = a.gqe;
               }

               if (axxx == null) {
                  return (boolean)var8;
               }

               if (var8 == 1) {
                  boolean var17 = a.avw.isEmpty();
                  if (axxx == null) {
                     return var17;
                  }

                  if (!var17) {
                     a.avw = a.avw.substring(0, a.avw.length() - 1);
                  }
               }

               return (boolean)1;
            }

            return (boolean)1;
         }

         var6 = false;
      }

      return var6;
   }

   public boolean flf(class_11905 input) {
      long ax = ffm.a ^ 38851765601281L;
      int[] axx = dar.abu();
      int var10000 = a.gxr;
      if (axx != null) {
         if (a.gxr) {
            var10000 = a.method_74227();
            if (axx == null) {
               return var10000;
            }

            if (var10000) {
               String axxx;
               short var7;
               label73: {
                  axxx = a.method_74226();
                  var10000 = a.gqe;
                  if (axx != null) {
                     if (a.gqe == 0) {
                        var10000 = a.dyv.length();
                        var7 = 8169;
                        long var10002 = 3504187636227996781L ^ ax;
                        var7 = 50;
                        if (axx == null) {
                           break label73;
                        }

                        if (var10000 < 50) {
                           a.dyv = a.dyv + axxx;
                           if (axx != null) {
                              return (boolean)1;
                           }
                        }
                     }

                     var10000 = a.gqe;
                  }

                  if (axx == null) {
                     return (boolean)var10000;
                  }

                  var7 = 1;
               }

               if (var10000 == var7) {
                  var10000 = a.avw.length();
                  if (axx == null) {
                     return (boolean)var10000;
                  }

                  var7 = 21251;
                  long var9 = 2249752198017429643L ^ ax;
                  if (var10000 < 500) {
                     a.avw = a.avw + axxx;
                  }
               }

               return (boolean)1;
            }
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   public boolean fgn(class_11909 click, double offsetX, double offsetY) {
      long ax = ffm.a ^ 122259425424312L;
      int[] var8 = dar.abu();
      boolean var10000 = a.byr;
      if (var8 != null) {
         if (a.byr) {
            if (var8 == null) {
               return a.hid;
            }

            if (a.hid) {
               if (var8 == null) {
                  return a.gxr;
               }

               if (!a.gxr) {
                  a.gfo = (float)(a.comp_4798() - a.chy);
                  a.dwq = (float)(a.comp_4799() - a.dpb);
                  return true;
               }
            }
         }

         var10000 = false;
      }

      return var10000;
   }

   public boolean dmj(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      long ax = ffm.a ^ 102366904801722L;
      int[] var11 = dar.abu();
      int var10000 = a.hid;
      if (var11 != null) {
         if (a.hid) {
            if (var11 == null) {
               return a.gxr;
            }

            if (!a.gxr) {
               double var12;
               var10000 = (var12 = a - a.gfo) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
               if (var11 == null) {
                  return (boolean)var10000;
               }

               if (var10000 >= 0) {
                  double var13;
                  var10000 = (var13 = a - (a.gfo + 700.0F)) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
                  if (var11 == null) {
                     return (boolean)var10000;
                  }

                  if (var10000 <= 0) {
                     double var14;
                     var10000 = (var14 = a - (a.dwq + 70.0F)) == 0.0 ? 0 : (var14 < 0.0 ? -1 : 1);
                     if (var11 == null) {
                        return (boolean)var10000;
                     }

                     if (var10000 >= 0) {
                        double var15;
                        var10000 = (var15 = a - (a.dwq + 400.0F)) == 0.0 ? 0 : (var15 < 0.0 ? -1 : 1);
                        if (var11 == null) {
                           return (boolean)var10000;
                        }

                        if (var10000 <= 0) {
                           a.gya -= (int)(a * 20.0);
                           a.gya = Math.max(0, a.gya);
                           return true;
                        }
                     }
                  }
               }
            }
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   public void fdk() {
      long a = ffm.a ^ 16812327808761L;
      int[] var3 = dar.abu();
      boolean var10001 = a.hid;
      if (var3 != null) {
         var10001 = !a.hid;
      }

      a.hid = var10001;
      ffm var10000 = a;
      if (var3 != null) {
         if (a.hid) {
            new fxc().dak(dar.gqy().gp());
            if (var3 != null) {
               return;
            }
         }

         var10000 = a;
      }

      var10000.gxr = false;
   }

   public boolean fbr() {
      return a.hid;
   }

   static {
      long var22 = a ^ 33394386518977L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var25 = 1; var25 < 8; var25++) {
         var10003[var25] = (byte)(var22 << var25 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[17];
      int var29 = 0;
      String var28 = "´Ë*Ãw5b\u001b{d\u007fcÏr1×\u0018î\u009eú[DÈÄ8Åé\u009b&K'ü\nt×Cj\u0097uS^0\u0097Oå²ªeÛü»ë\u0013\u00ad\náñß\u001c\u0088+\u001dAõ¿¶\u009e\u0013yPZ~\u0004ª|b³þ\"Lê#ðç×\u0080\u009b~,\u0085\u0010ÕX\u001a×ì\u0083h£o~Y\u0005_BìN\u0018ÁõÎï\u008fléjÌ*\u0098\u0098ìð#ç\u0011iÌ\u0080\u008cí\u001f6(Íø\u009bÜ¸æ\u009ej\r´¨${«\u0092\u009c\u009f\u000e²t+@½Õ\"\\\u008akºa\u001f\u008b\u0000ú\u0084b¬f\u0095Ñ\u00108GÂ\u0089Z²\u0083vv\u000eðD\u009e^Ê\u009d =\u000e8ÀÒÜR?Ry\u0099jª×²t@e\u0091DpßÂ\\æ²rX½â\u0003\u0002(âI³\u008b\u009aã\u000eêZ\u009c$¡ö¢Q«bR+÷§©êêw+è\u00879âãå£\u001cd¬Àè\u0090\"Hn1´e\u0087\u0012Ò\u0018\u0083\u0005æ&ñ\u0002\u0098\u0093Ú&Ó\u0087\u0019;ð%\u0094Ov¡\u0085\t\u0091ÄW)Ø\u0002üÉ«-é\u0004\u0086ÃÚJ\u0014Â\u000eîv\u0004_çª¿úA\n\u0002¹\u0083qQÄùXfÿ\u0006\u0099\u0084 N\u0017\u0007UË8\u009dÿ*P¢|ú²\u0012Õ\u0090¤Á\u008d\u009aQ\u0010Î\u0080svM¢1\nt\u0018\u001d*M#}ý×kÄ;EÍÖ\u0082öºÒ\u009bö\u0015Â\u001e\u0099õ(:Z°(55/$$\u0015ÅÕÜmÂ\u0018[uTÈ²Ìd¿y\u0010ò§CI\u0003ÂÕ¹º\u001d4vëÅ\u0010qÑ\u0004»È\u0096ª\búÇi:0ÕL\u0084\u0018\u001c\u0086ýðð$ibÃw¢Èj¾ñ\u007fçñfm\u008e·Ýò";
      int var30 = "´Ë*Ãw5b\u001b{d\u007fcÏr1×\u0018î\u009eú[DÈÄ8Åé\u009b&K'ü\nt×Cj\u0097uS^0\u0097Oå²ªeÛü»ë\u0013\u00ad\náñß\u001c\u0088+\u001dAõ¿¶\u009e\u0013yPZ~\u0004ª|b³þ\"Lê#ðç×\u0080\u009b~,\u0085\u0010ÕX\u001a×ì\u0083h£o~Y\u0005_BìN\u0018ÁõÎï\u008fléjÌ*\u0098\u0098ìð#ç\u0011iÌ\u0080\u008cí\u001f6(Íø\u009bÜ¸æ\u009ej\r´¨${«\u0092\u009c\u009f\u000e²t+@½Õ\"\\\u008akºa\u001f\u008b\u0000ú\u0084b¬f\u0095Ñ\u00108GÂ\u0089Z²\u0083vv\u000eðD\u009e^Ê\u009d =\u000e8ÀÒÜR?Ry\u0099jª×²t@e\u0091DpßÂ\\æ²rX½â\u0003\u0002(âI³\u008b\u009aã\u000eêZ\u009c$¡ö¢Q«bR+÷§©êêw+è\u00879âãå£\u001cd¬Àè\u0090\"Hn1´e\u0087\u0012Ò\u0018\u0083\u0005æ&ñ\u0002\u0098\u0093Ú&Ó\u0087\u0019;ð%\u0094Ov¡\u0085\t\u0091ÄW)Ø\u0002üÉ«-é\u0004\u0086ÃÚJ\u0014Â\u000eîv\u0004_çª¿úA\n\u0002¹\u0083qQÄùXfÿ\u0006\u0099\u0084 N\u0017\u0007UË8\u009dÿ*P¢|ú²\u0012Õ\u0090¤Á\u008d\u009aQ\u0010Î\u0080svM¢1\nt\u0018\u001d*M#}ý×kÄ;EÍÖ\u0082öºÒ\u009bö\u0015Â\u001e\u0099õ(:Z°(55/$$\u0015ÅÕÜmÂ\u0018[uTÈ²Ìd¿y\u0010ò§CI\u0003ÂÕ¹º\u001d4vëÅ\u0010qÑ\u0004»È\u0096ª\búÇi:0ÕL\u0084\u0018\u001c\u0086ýðð$ibÃw¢Èj¾ñ\u007fçñfm\u008e·Ýò"
         .length();
      char var27 = 16;
      int var35 = -1;

      label72:
      while (true) {
         String var36 = var28.substring(++var35, var35 + var27);
         int var10001 = -1;

         while (true) {
            byte[] var32 = var24.doFinal(var36.getBytes("ISO-8859-1"));
            String var50 = a(var32).intern();
            switch (var10001) {
               case 0:
                  var31[var29++] = var50;
                  if ((var35 += var27) >= var30) {
                     b = var31;
                     c = new String[17];
                     g = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var22 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[37];
                     int var14 = 0;
                     String var15 = ">×\u000b\rIÖ\u001e·ç\u00059ø$û§\u007f\u009cñ|T\u0090ôÓU\"*ß\u000bÈV^Ù[Ä\u0005æ\u000fê\u0092kÖ±y\u0088\b\u0017#ð\u008a\u0096%ÕèçüÂ ©\u0005ðu\u001b:n±µ§Ç÷ÊÑQ\u00858þÑºÀä0$yÜ]Ò+W§ãM±Å\"@qg¯ï3Ëq£â\"\u0096\u0017÷\u0096\u009dU\r¯;\u009aà\u001b¤°ìHa\u0015?×TÏ\u0013\u0092ÙI½\u0093\n\u00ad-¾º\u0000\u0000Ó\u0003\u0084\u00ad=ÄïTÁú\u001b»I\u009fZ\táCÉ\u0098\u0087\u0082õ\u0004\u000b\u0005³SáFúî\u008cã\u0092~\"\u0097lÍË\u0081¡'\u0097£Æn\u0090íT\rÌÝ\u0016\fÃ\u0096\u0016ÏCæ#¿v{÷:¨\u0099g^Ó$u\u00139¿\u009d¶7|V\u0098mS'(¿?Y{\u0011\u0011\u001c¨©tð}\\]\u0083ai2\u000fõÐÆ\u0010s\u0086n´²\u00013©h¦þ^>\u009e>ÿ\u009f@ô\u0015S¹y\u0095.¬×-¯Y";
                     int var16 = ">×\u000b\rIÖ\u001e·ç\u00059ø$û§\u007f\u009cñ|T\u0090ôÓU\"*ß\u000bÈV^Ù[Ä\u0005æ\u000fê\u0092kÖ±y\u0088\b\u0017#ð\u008a\u0096%ÕèçüÂ ©\u0005ðu\u001b:n±µ§Ç÷ÊÑQ\u00858þÑºÀä0$yÜ]Ò+W§ãM±Å\"@qg¯ï3Ëq£â\"\u0096\u0017÷\u0096\u009dU\r¯;\u009aà\u001b¤°ìHa\u0015?×TÏ\u0013\u0092ÙI½\u0093\n\u00ad-¾º\u0000\u0000Ó\u0003\u0084\u00ad=ÄïTÁú\u001b»I\u009fZ\táCÉ\u0098\u0087\u0082õ\u0004\u000b\u0005³SáFúî\u008cã\u0092~\"\u0097lÍË\u0081¡'\u0097£Æn\u0090íT\rÌÝ\u0016\fÃ\u0096\u0016ÏCæ#¿v{÷:¨\u0099g^Ó$u\u00139¿\u009d¶7|V\u0098mS'(¿?Y{\u0011\u0011\u001c¨©tð}\\]\u0083ai2\u000fõÐÆ\u0010s\u0086n´²\u00013©h¦þ^>\u009e>ÿ\u009f@ô\u0015S¹y\u0095.¬×-¯Y"
                        .length();
                     byte var13 = 0;

                     label54:
                     while (true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var39 = var17;
                        var10001 = var14++;
                        long var54 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte var58 = -1;

                        while (true) {
                           long var19 = var54;
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
                           long var62 = (var21[0] & 255L) << 56
                              | (var21[1] & 255L) << 48
                              | (var21[2] & 255L) << 40
                              | (var21[3] & 255L) << 32
                              | (var21[4] & 255L) << 24
                              | (var21[5] & 255L) << 16
                              | (var21[6] & 255L) << 8
                              | var21[7] & 255L;
                           switch (var58) {
                              case 0:
                                 var39[var10001] = var62;
                                 if (var13 >= var16) {
                                    e = var17;
                                    f = new Integer[37];
                                    j = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var22 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[2];
                                    int var3 = 0;
                                    String var4 = "ìO]\u008a´¾û}åü\u0012æiÉÚÏ";
                                    int var5 = "ìO]\u008a´¾û}åü\u0012æiÉÚÏ".length();
                                    byte var2 = 0;

                                    do {
                                       int var47 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
                                       var47 = var3++;
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
                                       var62 = (var10[0] & 255L) << 56
                                          | (var10[1] & 255L) << 48
                                          | (var10[2] & 255L) << 40
                                          | (var10[3] & 255L) << 32
                                          | (var10[4] & 255L) << 24
                                          | (var10[5] & 255L) << 16
                                          | (var10[6] & 255L) << 8
                                          | var10[7] & 255L;
                                       byte var61 = -1;
                                       var6[var47] = var62;
                                    } while (var2 < var5);

                                    h = var6;
                                    i = new Long[2];
                                    return;
                                 }
                                 break;
                              default:
                                 var39[var10001] = var62;
                                 if (var13 < var16) {
                                    continue label54;
                                 }

                                 var15 = "\u0012\u0010\u000fºgré«\u0005òÄ\u0090vG$\\";
                                 var16 = "\u0012\u0010\u000fºgré«\u0005òÄ\u0090vG$\\".length();
                                 var13 = 0;
                           }

                           byte var46 = var13;
                           var13 += 8;
                           var18 = var15.substring(var46, var13).getBytes("ISO-8859-1");
                           var39 = var17;
                           var10001 = var14++;
                           var54 = (var18[0] & 255L) << 56
                              | (var18[1] & 255L) << 48
                              | (var18[2] & 255L) << 40
                              | (var18[3] & 255L) << 32
                              | (var18[4] & 255L) << 24
                              | (var18[5] & 255L) << 16
                              | (var18[6] & 255L) << 8
                              | var18[7] & 255L;
                           var58 = 0;
                        }
                     }
                  }

                  var27 = var28.charAt(var35);
                  break;
               default:
                  var31[var29++] = var50;
                  if ((var35 += var27) < var30) {
                     var27 = var28.charAt(var35);
                     continue label72;
                  }

                  var28 = "àü3ï:pq§0\u008a\u0012ý¯\u0001%\u009f(ö^\\m\u001bÏÀÁ¢\u0001\u0082Í\th¹#\u0016JþSõÁÙÉÀØ\u00ad%ÒþÆR^e³¹øx¤\u001e";
                  var30 = "àü3ï:pq§0\u008a\u0012ý¯\u0001%\u009f(ö^\\m\u001bÏÀÁ¢\u0001\u0082Í\th¹#\u0016JþSõÁÙÉÀØ\u00ad%ÒþÆR^e³¹øx¤\u001e".length();
                  var27 = 16;
                  var35 = -1;
            }

            var36 = var28.substring(++var35, var35 + var27);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28550;
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
            throw new RuntimeException("cc/astralis/ffm", var10);
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
         throw new RuntimeException("cc/astralis/ffm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5001;
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
            throw new RuntimeException("cc/astralis/ffm", var14);
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
         throw new RuntimeException("cc/astralis/ffm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22338;
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
            throw new RuntimeException("cc/astralis/ffm", var14);
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
         throw new RuntimeException("cc/astralis/ffm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
