package cc.astralis;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1309;
import net.minecraft.class_5611;

public class TargetHud extends guu {
   private final adu eub;
   private final env edt;
   private class_1309 bon;
   public final erp azu;
   private double amt;
   private final erp dgx;
   private static final DecimalFormat fsg;
   private static final long a = 119043477712123L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;
   private static final long[] v;
   private static final Long[] w;
   private static final Map x;

   public TargetHud() {
      long a = TargetHud.a ^ 41866345194263L;
      super(bfm.VISUAL);
      short var10003 = 9391;
      long var10004 = 7111813783858348111L ^ a;
      short var4 = 31477;
      long var10005 = 4538759843386121755L ^ a;
      String[] var8 = new String[2];
      short var10008 = 31477;
      long var10009 = 4538759843386121755L ^ a;
      var8[0] = "Modern";
      var10008 = 24932;
      var10009 = 5594700257398048135L ^ a;
      var8[1] = "Legacy";
      a.eub = new adu("Mode", "Modern", var8);
      short var5 = 20726;
      var10005 = 3930296938192471164L ^ a;
      a.azu = new erp(dtw.EASE_IN_OUT_QUAD, 500L);
      a.amt = 0.0;
      short var6 = 8946;
      var10005 = 4365189189549946491L ^ a;
      a.dgx = new erp(dtw.EASE_IN_OUT_SINE, 300L);
      var10003 = 617;
      var10004 = 5680562982533670541L ^ a;
      a.edt = new env("Target Hud", 320.0F, 300.0F, 200.0F, 100.0F);
      fjk.bfv.add(a.edt);
      a.bfi(new ffn[]{a.eub});
   }

   @gdz
   public void gdt(ctt event) {
      long ax;
      int[] axx;
      Object var13;
      label112: {
         ax = TargetHud.a ^ 54325004497391L;
         axx = dar.abu();
         var13 = a;
         if (axx != null) {
            short var10001 = 31477;
            long var10002 = 4538781237726940387L ^ ax;
            a.efe("Modern");
            if (chi.field_1755 instanceof een) {
               var13 = chi.field_1724;
               break label112;
            }

            var13 = dar.gqy().aws().diy(KillAura.class);
         }

         var13 = ((KillAura)var13).gvw;
      }

      class_1309 axxx;
      label106: {
         axxx = var13;
         if (axx != null) {
            if (axxx == null) {
               break label106;
            }

            hcu.asr();
         }

         a.bon = axxx;
      }

      var13 = a.dgx;
      if (axx != null) {
         if (a.dgx.flo()) {
            a.dgx.bpt(a.dgx.hjo());
         }

         var13 = a.dgx;
      }

      var13.dwm(axxx != null ? 1.0 : 0.0);
      float axxxx = (float)a.dgx.hjo();
      float var22;
      int var15 = (var22 = axxxx - 0.0F) == 0.0F ? 0 : (var22 < 0.0F ? -1 : 1);
      if (axx != null) {
         if (var15 == 0) {
            return;
         }

         var15 = (int)a.edt.grp();
      }

      int axxxxx = var15;
      int axxxxxx = (int)a.edt.azb();
      double axxxxxxx = a.bon.method_6032() / a.bon.method_6063();
      var13 = a.bon;
      if (axx != null) {
         if (a.bon.method_6032() != a.amt) {
            a.azu.bpt(a.azu.hjo());
            a.azu.gbi(axxxxxxx);
            a.azu.dsw();
            a.amt = a.bon.method_6032();
         }

         a.azu.dwm(axxxxxxx);
         var13 = a.eub.dnp();
      }

      String var11 = (String)var13;
      byte var12 = -1;
      var17 = var11.hashCode();
      label94:
      if (axx != null) {
         switch (var17) {
            case -1984932033:
               short var18 = 31477;
               long var20 = 4538781237726940387L ^ ax;
               var17 = var11.equals("Modern");
               if (axx == null) {
                  break label94;
               }

               if (var17 == 0) {
                  break;
               }

               var12 = 0;
               if (axx != null) {
                  break;
               }
            case -2022711319:
               short var19 = 24932;
               long var21 = 5594677205197461375L ^ ax;
               var17 = var11.equals("Legacy");
               if (axx == null) {
                  break label94;
               }

               if (var17 != 0) {
                  var12 = 1;
               }
         }

         var17 = var12;
      }

      switch (var17) {
         case 0:
            a.fmo(axxxxx, axxxxxx, axxxx);
            if (axx != null) {
               break;
            }
         case 1:
            a.fqj(axxxxx, axxxxxx, axxxx);
      }
   }

   @gdz
   public void eur(eel event) {
      long ax = TargetHud.a ^ 86995143994910L;
      int[] axx = dar.abu();
      TargetHud var10000 = a;
      if (axx != null) {
         if (a.bon == null) {
            return;
         }

         var10000 = a;
      }

      float axxx = (float)var10000.dgx.hjo();
      float var24;
      int var16 = (var24 = axxx - 0.0F) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
      if (axx != null) {
         if (var16 == 0) {
            return;
         }

         var16 = (int)a.edt.grp();
      }

      float axxxx;
      float axxxxx;
      float axxxxxx;
      float axxxxxxx;
      int axxxxxxxx = var16;
      int axxxxxxxxx = (int)a.edt.azb();
      short var17 = 5793;
      long var10001 = 1031746328589877071L ^ ax;
      axxxxxx = "Modern".equals(a.eub.dnp()) ? 180.0F : 150.0F;
      short var18 = 31477;
      var10001 = 4538646609358213906L ^ ax;
      axxxxxxx = "Modern".equals(a.eub.dnp()) ? 55.0F : 46.0F;
      axxxx = axxxxxxxx + axxxxxx / 2.0F * (1.0F - axxx);
      axxxxx = axxxxxxxxx + axxxxxxx / 2.0F * (1.0F - axxx);
      axxxxxx *= axxx;
      axxxxxxx *= axxx;
      String var12 = a.eub.dnp();
      byte var13 = -1;
      var19 = var12.hashCode();
      label76:
      if (axx != null) {
         switch (var19) {
            case -1984932033:
               short var21 = 31477;
               long var10002 = 4538646609358213906L ^ ax;
               var19 = var12.equals("Modern");
               if (axx == null) {
                  break label76;
               }

               if (var19 == 0) {
                  break;
               }

               var13 = 0;
               if (axx != null) {
                  break;
               }
            case -2022711319:
               short var22 = 1598;
               long var23 = 4389744848724897750L ^ ax;
               var19 = var12.equals("Legacy");
               if (axx == null) {
                  break label76;
               }

               if (var19 != 0) {
                  var13 = 1;
               }
         }

         var19 = var13;
      }

      switch (var19) {
         case 0:
            dmp.fnq(axxxx, axxxxx, axxxxxx, axxxxxxx, 12.0F * axxx);
            if (axx != null) {
               break;
            }
         case 1:
            dmp.fzn(axxxx, axxxxx, axxxxxx, axxxxxxx);
      }
   }

   private void fqj(float a, float a, float a) {
      long ax = TargetHud.a ^ 137988092761121L;
      int var10000 = 26719;
      long var10001 = 2657196118411798161L ^ ax;
      int axx = 150;
      var10000 = (short)20510;
      var10001 = 8130376145037778644L ^ ax;
      byte axxx = 46;
      int[] var25 = dar.abu();
      int axxxx = 3;
      short var37 = 3113;
      long var10002 = 749858410638508778L ^ ax;
      int axxxxx = 40;
      dmp.hdn();
      float axxxxxx = a + 75.0F;
      float axxxxxxx = a + 23.0F;
      dmp.gpu(axxxxxx, axxxxxxx);
      dmp.fle(a, a);
      dmp.gpu(-axxxxxx, -axxxxxxx);
      float axxxxxxxx = a + 40.0F + 6.0F;
      float var10003 = a + 150.0F;
      float var10004 = a + 46.0F;
      short var10007 = 15103;
      long var10008 = 7155113499453010987L ^ ax;
      short var64 = 21413;
      long var10009 = 4239110271090220406L ^ ax;
      short var69 = 21413;
      long var10010 = 4239110271090220406L ^ ax;
      short var73 = 30655;
      long var10011 = 3610305880843450733L ^ ax;
      dmp.gst(a, a, var10003, var10004, new Color(30, 30, 30, 180));
      float axxxxxxxxx = 150.0F - (axxxxxxxx - a + 6.0F);
      float axxxxxxxxxx = (float)(axxxxxxxxx * a.azu.hjo());
      int[] axxxxxxxxxxx = var25;
      var10000 = (short)15416;
      var10001 = 3984918037195141871L ^ ax;
      int axxxxxxxxxxxx = 12;
      Glow axxxxxxxxxxxxx = dar.gqy().aws().diy(Glow.class);
      String axxxxxxxxxxxxxx = axxxxxxxxxxxxx.eqi.dnp();
      byte var20 = -1;
      var10000 = axxxxxxxxxxxxxx.hashCode();
      if (axxxxxxxxxxx != null) {
         switch (var10000) {
            case -1656737386:
               short var39 = 28035;
               var10002 = 1364554943664651865L ^ ax;
               var10000 = axxxxxxxxxxxxxx.equals("Rainbow");
               if (axxxxxxxxxxx == null) {
                  break;
               }

               if (var10000 != 0) {
                  var20 = 0;
               }
            default:
               var10000 = var20;
         }
      }
      Color axxxxxxxxxxxxxxx = switch (var10000) {
         case 0 -> {
            short var29 = 26874;
            var10001 = 8177281057769294660L ^ ax;
            yield Glow.gbq(3000L, 0, 0.7F, 1.0F);
         }
         default -> dec.fbp(new class_5611(0.0F, 6.0F), axxxxxxxxxxxxx.ehf.dnp(), axxxxxxxxxxxxx.aoz.dnp());
      };
      String var23 = axxxxxxxxxxxxx.eqi.dnp();
      byte var21 = -1;
      var10000 = var23.hashCode();
      if (axxxxxxxxxxx != null) {
         switch (var10000) {
            case -1656737386:
               short var41 = 26307;
               var10002 = 2043442670079636755L ^ ax;
               var10000 = var23.equals("Rainbow");
               if (axxxxxxxxxxx == null) {
                  break;
               }

               if (var10000 != 0) {
                  var21 = 0;
               }
            default:
               var10000 = var21;
         }
      }
      Color axxxxxxxxxxxxxxxx = switch (var10000) {
         case 0 -> {
            short var32 = 32222;
            var10001 = 8079959409431944803L ^ ax;
            yield Glow.gbq(4000L, 0, 1.0F, 1.0F);
         }
         default -> dec.fbp(new class_5611(0.0F, 6.0F), axxxxxxxxxxxxx.ehf.dnp(), axxxxxxxxxxxxx.aoz.dnp());
      };
      float var43 = a + 46.0F - 15.0F;
      float var52 = axxxxxxxx + axxxxxxxxx;
      var10003 = a + 46.0F - 3.0F;
      short var10006 = 20006;
      long var60 = 3150755679196561638L ^ ax;
      var10007 = 23407;
      var10008 = 3388215403417097658L ^ ax;
      short var66 = 23407;
      var10009 = 3388215403417097658L ^ ax;
      short var71 = 1118;
      var10010 = 8061280136596195993L ^ ax;
      dmp.gst(axxxxxxxx, var43, var52, var10003, new Color(25, 25, 25, 220));
      dmp.dyl(axxxxxxxx, a + 46.0F - 15.0F, axxxxxxxxxx, 12.0F, axxxxxxxxxxxxxxx, axxxxxxxxxxxxxxxx, false);
      dmp.dzr(a + 3.0F, a + 3.0F, 40.0F, 40.0F, hcu.fkx(ehy.cyx(a.bon.method_5845())), null);
      if (axxxxxxxxxxx != null) {
         if (a.bon.method_6032() <= 0.0F) {
            a.azu.dsw();
            a.amt = -1.0;
         }

         short var33 = 16706;
         var10001 = 5402438168238576281L ^ ax;
         short var45 = 466;
         var10002 = 501441363164532511L ^ ax;
         bxc.emc("Sf-Ui", 12).ebb(a.bon.method_5477().getString(), axxxxxxxx, a + 3.0F, Color.white);
         var33 = 2825;
         var10001 = 8434413139716643031L ^ ax;
         short var47 = 28263;
         var10002 = 5538807899427496108L ^ ax;
         fll var35 = bxc.emc("Sf-Ui", 10);
         String var48 = fsg.format(a.bon.method_6032());
         short var55 = 31682;
         long var57 = 6497937926398961694L ^ ax;
         String var49 = var48 + " Health";
         var10003 = a + 3.0F + 14.0F;
         var10006 = 20200;
         long var62 = 3749706343545356342L ^ ax;
         var10007 = 20200;
         var10008 = 3749706343545356342L ^ ax;
         short var68 = 20200;
         var10009 = 3749706343545356342L ^ ax;
         var35.ebb(var49, axxxxxxxx, var10003, new Color(180, 180, 180));
         dmp.bzg();
      }
   }

   private void fmo(float a, float a, float a) {
      long ax = TargetHud.a ^ 18601317608487L;
      int axx = e<"x">(20200, 3749756417924528176L ^ ax);
      int axxx = e<"x">(6837, 7850049966833183863L ^ ax);
      float axxxx = 8.0F;
      float axxxxx = 12.0F;
      float axxxxxx = 39.0F;
      float axxxxxxx = 8.0F;
      dmp.hdn();
      float axxxxxxxx = a + 90.0F;
      float axxxxxxxxx = a + 27.5F;
      int[] var10000 = dar.abu();
      dmp.gpu(axxxxxxxx, axxxxxxxxx);
      dmp.fle(a, a);
      int[] axxxxxxxxxx = var10000;
      dmp.gpu(-axxxxxxxx, -axxxxxxxxx);
      Glow axxxxxxxxxxx = dar.gqy().aws().diy(Glow.class);
      dmp.cpp(
         a,
         a,
         180.0F,
         55.0F,
         12.0F,
         new Color(
            e<"x">(2644, 8283382367857786004L ^ ax),
            e<"x">(26858, 4240239442342108717L ^ ax),
            e<"x">(22971, 4111929832474210168L ^ ax),
            axxxxxxxxxxx.fug.dnp().intValue()
         )
      );
      float axxxxxxxxxxxx = a + 39.0F + 16.0F;
      float axxxxxxxxxxxxx = 117.0F;
      String axxxxxxxxxxxxxx = a.bon.method_5477().getString();
      bxc.emc(b<"g">(1778, 4560997727419051296L ^ ax), e<"x">(17580, 1748507910610645606L ^ ax))
         .ebb(axxxxxxxxxxxxxx, axxxxxxxxxxxx, a + 8.0F - 1.0F, Color.WHITE);
      String axxxxxxxxxxxxxxx = fsg.format(a.bon.method_6032()) + b<"g">(2088, 4755451403827848177L ^ ax);
      bxc.emc(b<"g">(5957, 8784525311967706256L ^ ax), e<"x">(9910, 608429614127681657L ^ ax))
         .ebb(
            axxxxxxxxxxxxxxx,
            axxxxxxxxxxxx,
            a + 8.0F + 15.0F,
            new Color(e<"x">(26853, 7822112654796611135L ^ ax), e<"x">(30797, 6007379006614425236L ^ ax), e<"x">(4565, 3915973241811674897L ^ ax))
         );
      float axxxxxxxxxxxxxxxx = a + 55.0F - 8.0F - 8.0F;
      float axxxxxxxxxxxxxxxxx = 8.0F;
      float axxxxxxxxxxxxxxxxxx = 5.0F;
      dmp.cpp(
         axxxxxxxxxxxx,
         axxxxxxxxxxxxxxxx,
         axxxxxxxxxxxxx,
         8.0F,
         5.0F,
         new Color(e<"x">(2056, 6495384219008483039L ^ ax), e<"x">(20555, 2556791418104145538L ^ ax), e<"x">(16523, 2896330478954640965L ^ ax))
      );
      float axxxxxxxxxxxxxxxxxxx = (float)(axxxxxxxxxxxxx * a.azu.hjo());
      float var25;
      int var24 = (var25 = axxxxxxxxxxxxxxxxxxx - 0.0F) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
      if (axxxxxxxxxx != null) {
         if (var24 > 0) {
            dmp.aho(axxxxxxxxxxxx - 1.0F, axxxxxxxxxxxxxxxx, axxxxxxxxxxxxxxxxxxx + 1.0F, 8.0F, 5.0F, dar.gqy().deo(), dar.gqy().cxj(), false);
         }

         dmp.cpp(
            a + 8.0F,
            a + 8.0F,
            39.0F,
            39.0F,
            8.0F,
            new Color(e<"x">(25438, 8411559853070177678L ^ ax), e<"x">(3282, 4980589028691360260L ^ ax), e<"x">(2760, 6861509018269400083L ^ ax))
         );
         dmp.gnj(a + 8.0F, a + 8.0F, 39.0F, 39.0F, 8.0F, hcu.fkx(ehy.cyx(a.bon.method_5845())), null);
         dmp.hbm(a + 8.0F, a + 8.0F, 39.0F, 39.0F, 8.0F, dar.gqy().deo(), dar.gqy().cxj(), true, 1.5F, new Color(0, 0, 0, 0));
         if (axxxxxxxxxx == null) {
            return;
         }

         float var26;
         var24 = (var26 = a.bon.method_6032() - 0.0F) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
      }

      if (var24 <= 0) {
         a.azu.dsw();
         a.amt = -1.0;
      }

      dmp.bzg();
   }

   static {
      long var31 = a ^ 23480194858506L;
      Cipher var22;
      Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var23 = 1; var23 < 8; var23++) {
         var10003[var23] = (byte)(var31 << var23 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var29 = new String[15];
      int var27 = 0;
      String var26 = "<t£¡\\\u0017´,\u0095Ç\u0019\u00adN6hn\u00108\bàðøuCì»JO\u0098÷øéÜ0üöFQo¹{-UB=\u007fFÓ\u0013/#\u001cú\u0001¤'ÈzÎù\u000fFH5\bk\u0011ê(íú\u0007.ÚfÂ_\u0013·Ì\u001dà\u0010\u009b\u0090`>\u0086ÿt-á\u0094\u008f8êywU C\u0080ù\u0084\u001f\u008bØÉÀüîª3³\u008bÓ:R`\u009cgÊ\u009bì\u001dÀ\u0007J\u001bã\u00ad\u008f()\u0097z\u0014Åß^~|É¨®Ç\u009cÓ<&Îr\u0011¬©óÖ\u0092¿\u0095\u00adÓx.E?ì³\u009c ¡\u0007D\u0010!Pu\u0096îü\u0086\u001bu)oBÈ» b\u00102\u0007\u0091¢'f¦\u001cèÊçcøUH-\u00105\u0097â\u0095\u0019ËxkÈF=u\u0092\u0001k\u0003\u0010Æ¾aL)Ójl\bu[Sq1Ì\u0003\u0010\\2\u0016=4Ö¶É\u00881\u0085õaw!<\u0010DRûù\u00175h\rõ%\u0087\u0001\u000e³â\u000b\u0010\u000eÔÅøÔ\u0016ª/·F\u0017Rj qG";
      int var28 = "<t£¡\\\u0017´,\u0095Ç\u0019\u00adN6hn\u00108\bàðøuCì»JO\u0098÷øéÜ0üöFQo¹{-UB=\u007fFÓ\u0013/#\u001cú\u0001¤'ÈzÎù\u000fFH5\bk\u0011ê(íú\u0007.ÚfÂ_\u0013·Ì\u001dà\u0010\u009b\u0090`>\u0086ÿt-á\u0094\u008f8êywU C\u0080ù\u0084\u001f\u008bØÉÀüîª3³\u008bÓ:R`\u009cgÊ\u009bì\u001dÀ\u0007J\u001bã\u00ad\u008f()\u0097z\u0014Åß^~|É¨®Ç\u009cÓ<&Îr\u0011¬©óÖ\u0092¿\u0095\u00adÓx.E?ì³\u009c ¡\u0007D\u0010!Pu\u0096îü\u0086\u001bu)oBÈ» b\u00102\u0007\u0091¢'f¦\u001cèÊçcøUH-\u00105\u0097â\u0095\u0019ËxkÈF=u\u0092\u0001k\u0003\u0010Æ¾aL)Ójl\bu[Sq1Ì\u0003\u0010\\2\u0016=4Ö¶É\u00881\u0085õaw!<\u0010DRûù\u00175h\rõ%\u0087\u0001\u000e³â\u000b\u0010\u000eÔÅøÔ\u0016ª/·F\u0017Rj qG"
         .length();
      char var25 = 16;
      int var36 = -1;

      label81:
      while (true) {
         String var37 = var26.substring(++var36, var36 + var25);
         int var10001 = -1;

         while (true) {
            byte[] var30 = var22.doFinal(var37.getBytes("ISO-8859-1"));
            String var53 = d(var30).intern();
            switch (var10001) {
               case 0:
                  var29[var27++] = var53;
                  if ((var36 += var25) >= var28) {
                     g = var29;
                     h = new String[15];
                     r = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[28];
                     int var14 = 0;
                     String var15 = "\u0097Í\u008e\u00ad\u0083`d=\u0087\u000bÚ\u0018\u008d cDíÕÄû;\u008dÇpã\u009eæµ7m\u0018b\u0085)\u0095Ï_\u0095ï\bYÜ  \u0012±\u0098Õv]Í!\u0092øÜ0¡ó\u009cKîP\u009d{\u0018Øô\u0092\u0019«ü\u009d\u009b\u0016Ã\u0017P\u0098Ð\u0002t\u009cM\u0099&¥\u008cÂ\u0080Û\u0013OVZ\u0082ÎdéW/\u0089?C\u0098¸¥\u0011äN=½L\u0088\u0092«CJ÷1(\u009e³\b\u001aí\u001be35G#\u0085,\fÎ\u009e\u000fx1\u0014Ñ{_\u0014éÏë\u001cÃäÿ\u0081Sn\u00adlµ°ÍJ\u0083©ØËbl¯W\bT\u001eS\u0001bóYÎÇ¥éEuè\u0017öð\u0002¼F\t\u0002r³Ì²b¥\u0016y\u0016\u0001\u0089õ\u008dæ\u000f\"j";
                     int var16 = "\u0097Í\u008e\u00ad\u0083`d=\u0087\u000bÚ\u0018\u008d cDíÕÄû;\u008dÇpã\u009eæµ7m\u0018b\u0085)\u0095Ï_\u0095ï\bYÜ  \u0012±\u0098Õv]Í!\u0092øÜ0¡ó\u009cKîP\u009d{\u0018Øô\u0092\u0019«ü\u009d\u009b\u0016Ã\u0017P\u0098Ð\u0002t\u009cM\u0099&¥\u008cÂ\u0080Û\u0013OVZ\u0082ÎdéW/\u0089?C\u0098¸¥\u0011äN=½L\u0088\u0092«CJ÷1(\u009e³\b\u001aí\u001be35G#\u0085,\fÎ\u009e\u000fx1\u0014Ñ{_\u0014éÏë\u001cÃäÿ\u0081Sn\u00adlµ°ÍJ\u0083©ØËbl¯W\bT\u001eS\u0001bóYÎÇ¥éEuè\u0017öð\u0002¼F\t\u0002r³Ì²b¥\u0016y\u0016\u0001\u0089õ\u008dæ\u000f\"j"
                        .length();
                     byte var13 = 0;

                     label63:
                     while (true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var40 = var17;
                        var10001 = var14++;
                        long var57 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte var64 = -1;

                        while (true) {
                           long var19 = var57;
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
                           long var70 = (var21[0] & 255L) << 56
                              | (var21[1] & 255L) << 48
                              | (var21[2] & 255L) << 40
                              | (var21[3] & 255L) << 32
                              | (var21[4] & 255L) << 24
                              | (var21[5] & 255L) << 16
                              | (var21[6] & 255L) << 8
                              | var21[7] & 255L;
                           switch (var64) {
                              case 0:
                                 var40[var10001] = var70;
                                 if (var13 >= var16) {
                                    p = var17;
                                    q = new Integer[28];
                                    x = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var31 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[4];
                                    int var3 = 0;
                                    String var4 = "\u0095Á3«\u009fýrã\u009a\u0093G¹ÃúÂH";
                                    int var5 = "\u0095Á3«\u009fýrã\u009a\u0093G¹ÃúÂH".length();
                                    byte var2 = 0;

                                    label47:
                                    while (true) {
                                       int var49 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var49, var2).getBytes("ISO-8859-1");
                                       long[] var42 = var6;
                                       var49 = var3++;
                                       long var60 = (var7[0] & 255L) << 56
                                          | (var7[1] & 255L) << 48
                                          | (var7[2] & 255L) << 40
                                          | (var7[3] & 255L) << 32
                                          | (var7[4] & 255L) << 24
                                          | (var7[5] & 255L) << 16
                                          | (var7[6] & 255L) << 8
                                          | var7[7] & 255L;
                                       byte var67 = -1;

                                       while (true) {
                                          long var8 = var60;
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
                                          var70 = (var10[0] & 255L) << 56
                                             | (var10[1] & 255L) << 48
                                             | (var10[2] & 255L) << 40
                                             | (var10[3] & 255L) << 32
                                             | (var10[4] & 255L) << 24
                                             | (var10[5] & 255L) << 16
                                             | (var10[6] & 255L) << 8
                                             | var10[7] & 255L;
                                          switch (var67) {
                                             case 0:
                                                var42[var49] = var70;
                                                if (var2 >= var5) {
                                                   v = var6;
                                                   w = new Long[4];
                                                   short var62 = 24578;
                                                   long var69 = 6866770040511273460L ^ var31;
                                                   fsg = new DecimalFormat("0.0");
                                                   return;
                                                }
                                                break;
                                             default:
                                                var42[var49] = var70;
                                                if (var2 < var5) {
                                                   continue label47;
                                                }

                                                var4 = "<\u001b\u009dÞ)ü\u001d?8ØÕAJ>Áw";
                                                var5 = "<\u001b\u009dÞ)ü\u001d?8ØÕAJ>Áw".length();
                                                var2 = 0;
                                          }

                                          byte var51 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var51, var2).getBytes("ISO-8859-1");
                                          var42 = var6;
                                          var49 = var3++;
                                          var60 = (var7[0] & 255L) << 56
                                             | (var7[1] & 255L) << 48
                                             | (var7[2] & 255L) << 40
                                             | (var7[3] & 255L) << 32
                                             | (var7[4] & 255L) << 24
                                             | (var7[5] & 255L) << 16
                                             | (var7[6] & 255L) << 8
                                             | var7[7] & 255L;
                                          var67 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var40[var10001] = var70;
                                 if (var13 < var16) {
                                    continue label63;
                                 }

                                 var15 = "k\u0096³\u0086îíjU\u009e<U8É\u0095N{";
                                 var16 = "k\u0096³\u0086îíjU\u009e<U8É\u0095N{".length();
                                 var13 = 0;
                           }

                           byte var48 = var13;
                           var13 += 8;
                           var18 = var15.substring(var48, var13).getBytes("ISO-8859-1");
                           var40 = var17;
                           var10001 = var14++;
                           var57 = (var18[0] & 255L) << 56
                              | (var18[1] & 255L) << 48
                              | (var18[2] & 255L) << 40
                              | (var18[3] & 255L) << 32
                              | (var18[4] & 255L) << 24
                              | (var18[5] & 255L) << 16
                              | (var18[6] & 255L) << 8
                              | var18[7] & 255L;
                           var64 = 0;
                        }
                     }
                  }

                  var25 = var26.charAt(var36);
                  break;
               default:
                  var29[var27++] = var53;
                  if ((var36 += var25) < var28) {
                     var25 = var26.charAt(var36);
                     continue label81;
                  }

                  var26 = "\u001dþC\u001cw¥ÿØpú&o8É¦£\u0010³ËtAøËI]\u008brg«\u009a´¢\u009d";
                  var28 = "\u001dþC\u001cw¥ÿØpú&o8É¦£\u0010³ËtAøËI]\u008brg«\u009a´¢\u009d".length();
                  var25 = 16;
                  var36 = -1;
            }

            var37 = var26.substring(++var36, var36 + var25);
            var10001 = 0;
         }
      }
   }

   private static String d(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11020;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/ckv", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         h[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
         throw new RuntimeException("cc/astralis/ckv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13855;
      if (q[var3] == null) {
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
         long var5 = p[var3];
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
         Object[] var9 = (Object[])r.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               r.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/ckv", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
   }

   private static int e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/ckv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long g(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23396;
      if (w[var3] == null) {
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
         long var5 = v[var3];
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
         Object[] var9 = (Object[])x.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               x.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/ckv", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         w[var3] = var15;
      }

      return w[var3];
   }

   private static long g(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = g(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite g(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("g".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/ckv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
