package cc.astralis;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaInfo;
import io.github.humbleui.skija.Image;
import java.awt.Color;
import java.io.ByteArrayInputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_5611;

public class fhc extends guu {
   private final adu doa;
   private final env gss;
   private Image fms;
   public final erp gqt;
   private double dkr;
   private static final long a = 58791830616871L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;
   private static final long[] v;
   private static final Long[] w;
   private static final Map x;

   public fhc() {
      long a = fhc.a ^ 102173411428757L;
      super(bfm.VISUAL);
      short var10003 = 4697;
      long var10004 = 4342964267911453580L ^ a;
      short var4 = 22965;
      long var10005 = 6938082009414848614L ^ a;
      String[] var7 = new String[2];
      short var10008 = 1735;
      long var10009 = 3942180976558083865L ^ a;
      var7[0] = "Modern";
      var10008 = 23722;
      var10009 = 1749587334375593341L ^ a;
      var7[1] = "Legacy";
      a.doa = new adu("Mode", "Modern", var7);
      short var5 = 31041;
      var10005 = 5114791768259936705L ^ a;
      a.gqt = new erp(dtw.EASE_IN_OUT_QUAD, 500L);
      a.dkr = 0.0;
      var10003 = 4461;
      var10004 = 5544255725526849724L ^ a;
      a.gss = new env("Media Info", 50.0F, 50.0F, 200.0F, 60.0F);
      fjk.bfv.add(a.gss);
      a.bfi(new ffn[]{a.doa});
   }

   @gdz
   public void ehh(ctt event) {
      long ax;
      int[] axx;
      MediaInfo var26;
      label141: {
         ax = fhc.a ^ 102334053790077L;
         int[] var10000 = dar.abu();
         a.efe(a.doa.dnp());
         axx = var10000;
         IMediaSession var25 = fow.cza;
         if (axx != null) {
            if (fow.cza == null) {
               var26 = null;
               break label141;
            }

            var25 = fow.cza;
         }

         var26 = var25.getMedia();
      }

      MediaInfo axxx = var26;
      var26 = axxx;
      if (axx != null) {
         if (axxx == null) {
            return;
         }

         var26 = axxx;
      }

      label134: {
         label133: {
            byte[] axxxx = var26.getArtworkPng();
            byte[] var28 = axxxx;
            if (axx != null) {
               if (axxxx == null) {
                  break label133;
               }

               var28 = axxxx;
            }

            if (var28.length > 0) {
               a.fms = hcu.fkx(new ByteArrayInputStream(axxxx));
               if (axx != null) {
                  break label134;
               }
            }
         }

         a.fms = null;
      }

      int axxxxx;
      int axxxxxx;
      label124: {
         axxxxx = (int)a.gss.grp();
         axxxxxx = (int)a.gss.azb();
         long var29 = axxx.getDuration();
         if (axx != null) {
            if (var29 <= 0L) {
               var30 = 0.0;
               break label124;
            }

            var29 = axxx.getPosition();
         }

         var30 = (double)var29 / axxx.getDuration();
      }

      double axxxxxxx = var30;
      if (axx != null) {
         if (axxxxxxx != a.dkr) {
            a.gqt.bpt(a.gqt.hjo());
            a.gqt.gbi(axxxxxxx);
            a.gqt.dsw();
            a.dkr = axxxxxxx;
         }

         a.gqt.dwm(axxxxxxx);
      }

      String axxxxxxxx = chh(gkn(axxx.getTitle()));
      String axxxxxxxxx = chh(gkn(axxx.getArtist()));
      String var31 = a.avy(axxx.getPosition());
      String var10001 = a.avy(axxx.getDuration());
      short var10002 = 31656;
      long var10003 = 8853867087293319828L ^ ax;
      String axxxxxxxxxx = var31 + " / " + var10001;
      double axxxxxxxxxxx = a.gqt.hjo();
      short var32 = 1735;
      long var43 = 3942181610216257521L ^ ax;
      short var33 = "Modern".equals(a.doa.dnp());
      if (axx != null) {
         if (var33 != 0) {
            short var34 = 18872;
            long var44 = 5792804843215374746L ^ ax;
            var33 = 250;
         } else {
            short var35 = 23584;
            long var45 = 4602496022265846833L ^ ax;
            var33 = 210;
         }
      }

      short axxxxxxxxxxxx = var33;
      short var36 = 5060;
      short var46 = 17294;
      long var54 = 6938389948908356495L ^ ax;
      byte axxxxxxxxxxxxx = 60;
      long var47 = 7822711033009529589L ^ ax;
      if ("Legacy".equals(a.doa.dnp())) {
         ezv axxxxxxxxxxxxxx = dar.gqy().aws().diy(ezv.class);
         String var21 = axxxxxxxxxxxxxx.eqi.dnp();
         byte var22 = -1;
         int var37 = var21.hashCode();
         if (axx != null) {
            switch (var37) {
               case -1656737386:
                  short var48 = 26518;
                  long var55 = 4389798253377099428L ^ ax;
                  var37 = var21.equals("Rainbow");
                  if (axx == null) {
                     break;
                  }

                  if (var37 != 0) {
                     var22 = 0;
                  }
               default:
                  var37 = var22;
            }
         }
         Color axxxxxxxxxxxxxxx = switch (var37) {
            case 0 -> {
               short var39 = 23834;
               long var49 = 2522506938334977397L ^ ax;
               yield ezv.gbq(3000L, 0, 0.7F, 1.0F);
            }
            default -> dec.fbp(new class_5611(0.0F, 6.0F), axxxxxxxxxxxxxx.ehf.dnp(), axxxxxxxxxxxxxx.aoz.dnp());
         };
         var21 = axxxxxxxxxxxxxx.eqi.dnp();
         var22 = -1;
         int var40 = var21.hashCode();
         if (axx != null) {
            switch (var40) {
               case -1656737386:
                  short var50 = 19781;
                  long var56 = 2040654305681980543L ^ ax;
                  var40 = var21.equals("Rainbow");
                  if (axx == null) {
                     break;
                  }

                  if (var40 != 0) {
                     var22 = 0;
                  }
               default:
                  var40 = var22;
            }
         }
         Color axxxxxxxxxxxxxxxx = switch (var40) {
            case 0 -> {
               short var42 = 22465;
               long var51 = 5293894031803652008L ^ ax;
               yield ezv.gbq(4000L, 0, 1.0F, 1.0F);
            }
            default -> dec.fbp(new class_5611(0.0F, 6.0F), axxxxxxxxxxxxxx.ehf.dnp(), axxxxxxxxxxxxxx.aoz.dnp());
         };
         float var52 = axxxxx;
         float var57 = axxxxxx;
         short var10004 = 17294;
         long var10005 = 6938389948908356495L ^ ax;
         a.edh(var52, var57, axxxxxxxxxxxx, 60, axxxxxxxx, axxxxxxxxx, axxxxxxxxxx, axxxxxxxxxxx, axxxxxxxxxxxxxxx, axxxxxxxxxxxxxxxx);
         if (axx != null) {
            return;
         }
      }

      float var53 = axxxxx;
      float var58 = axxxxxx;
      short var59 = 17294;
      long var60 = 6938389948908356495L ^ ax;
      a.cwt(var53, var58, axxxxxxxxxxxx, 60, axxxxxxxx, axxxxxxxxx, axxxxxxxxxxx);
   }

   @gdz
   public void bmh(eel event) {
      long ax;
      int[] axx;
      MediaInfo var13;
      label73: {
         ax = fhc.a ^ 72569794695578L;
         axx = dar.abu();
         IMediaSession var10000 = fow.cza;
         if (axx != null) {
            if (fow.cza == null) {
               var13 = null;
               break label73;
            }

            var10000 = fow.cza;
         }

         var13 = var10000.getMedia();
      }

      MediaInfo axxx = var13;
      if (axxx != null) {
         int axxxx = (int)a.gss.grp();
         int axxxxx = (int)a.gss.azb();
         short var14 = 1735;
         long var10001 = 3942178387249682198L ^ ax;
         short var15 = "Modern".equals(a.doa.dnp());
         if (axx != null) {
            if (var15 != 0) {
               short var16 = 4673;
               var10001 = 479378471433515701L ^ ax;
               var15 = 250;
            } else {
               short var17 = 9180;
               var10001 = 8322625115554284333L ^ ax;
               var15 = 210;
            }
         }

         short axxxxxx;
         axxxxxx = var15;
         short var18 = 17294;
         var10001 = 6938362536415454056L ^ ax;
         int axxxxxxx = 60;
         String var10 = a.doa.dnp();
         byte var11 = -1;
         var19 = var10.hashCode();
         label64:
         if (axx != null) {
            switch (var19) {
               case -1984932033:
                  short var23 = 1735;
                  long var10002 = 3942178387249682198L ^ ax;
                  var19 = var10.equals("Modern");
                  if (axx == null) {
                     break label64;
                  }

                  if (var19 == 0) {
                     break;
                  }

                  var11 = 0;
                  if (axx != null) {
                     break;
                  }
               case -2022711319:
                  short var24 = 5060;
                  long var25 = 7822687879514472978L ^ ax;
                  var19 = var10.equals("Legacy");
                  if (axx == null) {
                     break label64;
                  }

                  if (var19 != 0) {
                     var11 = 1;
                  }
            }

            var19 = var11;
         }

         switch (var19) {
            case 0:
               float axxxxxxxx = 16.0F;
               dmp.fnq(axxxx, axxxxx, axxxxxx, 60.0F, 16.0F);
               if (axx != null) {
                  break;
               }
            case 1:
               dmp.fzn(axxxx, axxxxx, axxxxxx, 60.0F);
         }
      }
   }

   private void edh(float a, float a, int a, int a, String a, String a, String a, double a, Color a, Color a) {
      long ax;
      int[] axx;
      float axxx;
      label41: {
         ax = fhc.a ^ 41639638567801L;
         int[] var10000 = dar.abu();
         int axxxx = 3;
         short var10002 = 9506;
         long var10003 = 2275935086671896377L ^ ax;
         int axxxxx = a - 6;
         axxx = a + axxxxx + 6.0F;
         ezv axxxxxx = dar.gqy().aws().diy(ezv.class);
         float var60 = a + a;
         float var10004 = a + a;
         short var10007 = 20242;
         long var10008 = 6659093815943263551L ^ ax;
         short var81 = 22740;
         long var10009 = 7663412697240429253L ^ ax;
         short var91 = 22740;
         long var10010 = 7663412697240429253L ^ ax;
         dmp.gst(a, a, var60, var10004, new Color(30, 30, 30, axxxxxx.fug.dnp().intValue()));
         axx = var10000;
         float axxxxxxx = a - (axxx - a + 6.0F) + 4.0F;
         float axxxxxxxx = (float)(axxxxxxx * a);
         short var22 = 4742;
         long var10001 = 4267819222256527499L ^ ax;
         int axxxxxxxxx = 8;
         float var34 = a + a - 11.0F;
         float var48 = axxx + axxxxxxx;
         float var61 = a + a - 3.0F;
         short var10006 = 16656;
         long var72 = 4181852783665117999L ^ ax;
         var10007 = 22219;
         var10008 = 6819343933191974113L ^ ax;
         short var83 = 22219;
         var10009 = 6819343933191974113L ^ ax;
         short var93 = 9263;
         var10010 = 4595720569667132964L ^ ax;
         dmp.gst(axxx, var34, var48, var61, new Color(25, 25, 25, 220));
         float var23 = axxx;
         float var35 = a + a - 11.0F;
         float var49 = axxxxxxxx;
         float var62 = 8.0F;
         Color var68 = a;
         if (axx != null) {
            dmp.dyl(axxx, var35, axxxxxxxx, 8.0F, a, a, false);
            if (a.fms != null) {
               float var24 = a + 3.0F;
               float var36 = a + 3.0F;
               float var50 = axxxxx;
               float var63 = axxxxx;
               var10007 = 9262;
               var10008 = 6412840048656031238L ^ ax;
               dmp.gnj(var24, var36, var50, var63, 3.0F, a.fms, dec.ceu(Color.white, 255));
               if (axx != null) {
                  break label41;
               }
            }

            var23 = a + 3.0F;
            var35 = a + 3.0F;
            var49 = a + 3.0F + axxxxx;
            var62 = a + 3.0F + axxxxx;
            var10006 = 18120;
            long var75 = 5810035118230535378L ^ ax;
            var10007 = 17294;
            var10008 = 6938468306443827595L ^ ax;
            short var86 = 17294;
            var10009 = 6938468306443827595L ^ ax;
            short var95 = 16253;
            var10010 = 7902973729734788477L ^ ax;
            var68 = new Color(60, 60, 60, 200);
         }

         dmp.gst(var23, var35, var49, var62, var68);
      }

      String var28;
      label44: {
         int var25 = a.length();
         short var37 = 22219;
         long var51 = 6819343933191974113L ^ ax;
         short var38 = 25;
         if (axx != null) {
            if (var25 > 25) {
               short var52 = 22219;
               long var64 = 6819343933191974113L ^ ax;
               var28 = a.substring(0, 25);
               var38 = 5655;
               var51 = 7589641028346961184L ^ ax;
               a = var28 + "...";
            }

            short var27 = 2272;
            long var40 = 470832097992688602L ^ ax;
            var38 = 32285;
            var51 = 5421446782185686079L ^ ax;
            bxc.emc("Sf-Ui", 12).ebb(a, axxx, a + 3.0F, Color.white);
            var28 = a;
            if (axx == null) {
               break label44;
            }

            var25 = a.length();
            var38 = 22740;
            var51 = 7663412697240429253L ^ ax;
            var38 = 30;
         }

         if (var25 > var38) {
            short var56 = 22740;
            long var65 = 7663412697240429253L ^ ax;
            var28 = a.substring(0, 30);
            var38 = 24924;
            var51 = 3531588014444849775L ^ ax;
            a = var28 + "...";
         }

         short var30 = 21051;
         long var44 = 2356906087039703307L ^ ax;
         var38 = 15116;
         var51 = 1546335191269376309L ^ ax;
         fll var31 = bxc.emc("Sf-Ui", 10);
         float var66 = a + 3.0F + 14.0F;
         short var70 = 31699;
         long var77 = 3929944897166459388L ^ ax;
         short var78 = 30044;
         long var87 = 5428025183081287536L ^ ax;
         short var88 = 30044;
         long var96 = 5428025183081287536L ^ ax;
         var31.ebb(a, axxx, var66, new Color(180, 180, 180));
         short var32 = 21051;
         long var46 = 2356906087039703307L ^ ax;
         var28 = "Sf-Ui";
      }

      short var47 = 7672;
      long var59 = 4715283480448673731L ^ ax;
      fll var33 = bxc.emc(var28, 9);
      float var67 = a + 3.0F + 28.0F;
      short var71 = 3891;
      long var79 = 6577117724069410096L ^ ax;
      short var80 = 9991;
      long var89 = 4900494520871329032L ^ ax;
      short var90 = 9991;
      long var97 = 4900494520871329032L ^ ax;
      var33.ebb(a, axxx, var67, new Color(160, 160, 160));
   }

   private void cwt(float a, float a, int a, int a, String a, String a, double a) {
      long ax;
      int[] axx;
      float axxx;
      float axxxx;
      float axxxxx;
      label55: {
         label54: {
            ax = fhc.a ^ 130472548158108L;
            float axxxxxx = 10.0F;
            int[] var10000 = dar.abu();
            float axxxxxxx = 16.0F;
            axx = var10000;
            axxx = a - 20.0F;
            float axxxxxxxx = 12.0F;
            ezv axxxxxxxxx = dar.gqy().aws().diy(ezv.class);
            dmp.cpp(
               a,
               a,
               a,
               a,
               16.0F,
               new Color(
                  e<"j">(27619, 4068588166981783577L ^ ax),
                  e<"j">(7022, 8613853983823847561L ^ ax),
                  e<"j">(28551, 166862022156883014L ^ ax),
                  axxxxxxxxx.fug.dnp().intValue()
               )
            );
            axxxx = a + axxx + 25.0F;
            axxxxx = a - axxx - 35.0F;
            if (axx != null) {
               if (a.fms == null) {
                  break label54;
               }

               dmp.gnj(a + 10.0F, a + 10.0F, axxx, axxx, 12.0F, a.fms, null);
            }

            if (axx != null) {
               break label55;
            }
         }

         dmp.aho(
            a + 10.0F,
            a + 10.0F,
            axxx,
            axxx,
            12.0F,
            new Color(e<"j">(3904, 516052335017391246L ^ ax), e<"j">(31562, 191607641346113687L ^ ax), e<"j">(31893, 4381333555839502184L ^ ax)),
            new Color(e<"j">(3554, 2777160588171212327L ^ ax), e<"j">(4075, 6274918343930541085L ^ ax), e<"j">(26918, 350491456962663115L ^ ax)),
            true
         );
      }

      String var24;
      label58: {
         dmp.dnc(
            a + 10.0F,
            a + 10.0F,
            axxx,
            axxx,
            12.0F,
            new Color(0, 0, 0, 0),
            2.0F,
            new Color(
               e<"j">(4282, 4140171899396516696L ^ ax),
               e<"j">(4282, 4140171899396516696L ^ ax),
               e<"j">(4282, 4140171899396516696L ^ ax),
               e<"j">(4075, 6274918343930541085L ^ ax)
            )
         );
         int var23 = a.length();
         int var10001 = e<"j">(20798, 2255389738105252585L ^ ax);
         if (axx != null) {
            if (var23 > var10001) {
               a = a.substring(0, e<"j">(12827, 5897084761794103746L ^ ax)) + b<"d">(24924, 3531644415791360906L ^ ax);
            }

            bxc.emc(b<"d">(2662, 4159493506368733375L ^ ax), e<"j">(24781, 5987274366644230927L ^ ax)).ebb(a, axxxx, a + 10.0F, Color.WHITE);
            var24 = a;
            if (axx == null) {
               break label58;
            }

            var23 = a.length();
            var10001 = e<"j">(20677, 5178687948571487014L ^ ax);
         }

         if (var23 > var10001) {
            a = a.substring(0, e<"j">(17894, 2507461685777186323L ^ ax)) + b<"d">(24924, 3531644415791360906L ^ ax);
         }

         var24 = b<"d">(21406, 8253681424776124751L ^ ax);
      }

      bxc.emc(var24, e<"j">(16046, 1412814320542008696L ^ ax))
         .ebb(
            a,
            axxxx,
            a + 10.0F + 16.0F,
            new Color(e<"j">(1591, 9211605380096425455L ^ ax), e<"j">(8877, 1784978652227852641L ^ ax), e<"j">(7256, 6856773053116999607L ^ ax))
         );
      float axxxxxxxxxx = a + a - 10.0F - 7.0F;
      float axxxxxxxxxxx = 8.0F;
      float axxxxxxxxxxxx = 5.0F;
      dmp.cpp(
         axxxx,
         axxxxxxxxxx,
         axxxxx,
         8.0F,
         5.0F,
         new Color(e<"j">(22740, 7663361068340912928L ^ ax), e<"j">(22740, 7663361068340912928L ^ ax), e<"j">(4075, 6274918343930541085L ^ ax))
      );
      float axxxxxxxxxxxxx = (float)(axxxxx * a);
      float var25 = axxxxxxxxxxxxx;
      float var26 = 0.0F;
      if (axx != null) {
         if (!(axxxxxxxxxxxxx > 0.0F)) {
            return;
         }

         var25 = axxxx;
         var26 = axxxxxxxxxx;
      }

      dmp.aho(var25, var26, axxxxxxxxxxxxx, 8.0F, 5.0F, dar.gqy().deo(), dar.gqy().cxj(), false);
   }

   private String avy(long a) {
      long ax = fhc.a ^ 108697402372317L;
      short var10001 = 9305;
      long var10002 = 3125463274534708629L ^ ax;
      long axx = a / 1000L;
      var10001 = 2052;
      var10002 = 539357034819586505L ^ ax;
      long axxx = axx / 60L;
      var10001 = 27222;
      var10002 = 613413260234582936L ^ ax;
      axx %= 60L;
      short var10000 = 24747;
      long var12 = 7002159461007511614L ^ ax;
      return String.format("%d:%02d", axxx, axx);
   }

   public static String chh(String input) {
      long ax = fhc.a ^ 47753869021151L;
      int[] axx = dar.abu();
      String var10000 = a;
      if (axx != null) {
         if (a != null) {
            if (axx == null) {
               return a;
            }

            if (!a.isEmpty()) {
               StringBuilder axxx = new StringBuilder(a.length());
               int axxxx = 0;

               while (true) {
                  if (axxxx < a.length()) {
                     var10000 = a;
                     if (axx == null) {
                        break;
                     }

                     label236: {
                        char axxxxx;
                        short var9;
                        label217: {
                           label216: {
                              label237: {
                                 axxxxx = a.charAt(axxxx);
                                 var8 = axxxxx;
                                 var9 = 5848;
                                 long var10002 = 8509494324416800859L ^ ax;
                                 var9 = 65;
                                 label214:
                                 if (axx != null) {
                                    if (axxxxx >= 'A') {
                                       var8 = axxxxx;
                                       var9 = 20967;
                                       var10002 = 4246900217117159253L ^ ax;
                                       var9 = 90;
                                       if (axx == null) {
                                          break label214;
                                       }

                                       if (axxxxx <= 'Z') {
                                          break label237;
                                       }
                                    }

                                    var8 = axxxxx;
                                    var9 = 3121;
                                    var10002 = 5505855111797666454L ^ ax;
                                    var9 = 97;
                                 }

                                 label205:
                                 if (axx != null) {
                                    if (var8 >= var9) {
                                       var8 = axxxxx;
                                       var9 = 5742;
                                       var10002 = 4239274856470014201L ^ ax;
                                       var9 = 122;
                                       if (axx == null) {
                                          break label205;
                                       }

                                       if (axxxxx <= 'z') {
                                          break label237;
                                       }
                                    }

                                    var8 = axxxxx;
                                    var9 = 13480;
                                    var10002 = 5175898573643827757L ^ ax;
                                    var9 = 48;
                                 }

                                 label196:
                                 if (axx != null) {
                                    if (var8 >= var9) {
                                       var8 = axxxxx;
                                       var9 = 31289;
                                       var10002 = 125572470127199366L ^ ax;
                                       var9 = 57;
                                       if (axx == null) {
                                          break label196;
                                       }

                                       if (axxxxx <= '9') {
                                          break label237;
                                       }
                                    }

                                    var8 = axxxxx;
                                    var9 = 9854;
                                    var10002 = 214295698167814358L ^ ax;
                                    var9 = 32;
                                 }

                                 label187:
                                 if (axx != null) {
                                    if (var8 >= var9) {
                                       var8 = axxxxx;
                                       var9 = 22139;
                                       var10002 = 148040975449303232L ^ ax;
                                       var9 = 47;
                                       if (axx == null) {
                                          break label187;
                                       }

                                       if (axxxxx <= '/') {
                                          break label237;
                                       }
                                    }

                                    var8 = axxxxx;
                                    var9 = 26677;
                                    var10002 = 4218074181693249167L ^ ax;
                                    var9 = 58;
                                 }

                                 label178:
                                 if (axx != null) {
                                    if (var8 >= var9) {
                                       var8 = axxxxx;
                                       var9 = 11427;
                                       var10002 = 5533472869341090305L ^ ax;
                                       var9 = 64;
                                       if (axx == null) {
                                          break label178;
                                       }

                                       if (axxxxx <= '@') {
                                          break label237;
                                       }
                                    }

                                    var8 = axxxxx;
                                    var9 = 16032;
                                    var10002 = 6196853349954994192L ^ ax;
                                    var9 = 91;
                                 }

                                 label169:
                                 if (axx != null) {
                                    if (var8 >= var9) {
                                       var8 = axxxxx;
                                       var9 = 16510;
                                       var10002 = 6035242704645111542L ^ ax;
                                       var9 = 96;
                                       if (axx == null) {
                                          break label169;
                                       }

                                       if (axxxxx <= '`') {
                                          break label237;
                                       }
                                    }

                                    var8 = axxxxx;
                                    var9 = 2613;
                                    var10002 = 5207329925968721069L ^ ax;
                                    var9 = 123;
                                 }

                                 if (axx == null) {
                                    break label217;
                                 }

                                 if (var8 < var9) {
                                    break label216;
                                 }

                                 var8 = axxxxx;
                                 var9 = 12815;
                                 var10002 = 2227518755782151333L ^ ax;
                                 var9 = 126;
                                 if (axx == null) {
                                    break label217;
                                 }

                                 if (axxxxx > '~') {
                                    break label216;
                                 }
                              }

                              axxx.append(axxxxx);
                              if (axx != null) {
                                 break label236;
                              }
                           }

                           var8 = axxxxx;
                           var9 = 17367;
                           long var40 = 5284569410273983824L ^ ax;
                           var9 = 169;
                        }

                        label238: {
                           if (axx != null) {
                              if (var8 == var9) {
                                 break label238;
                              }

                              var8 = axxxxx;
                              var9 = 20765;
                              long var41 = 3380007559180693377L ^ ax;
                              var9 = 174;
                           }

                           if (axx != null) {
                              if (var8 == var9) {
                                 break label238;
                              }

                              var8 = axxxxx;
                              var9 = 24355;
                              long var42 = 8162688735664284059L ^ ax;
                              var9 = 8482;
                           }

                           if (axx != null) {
                              if (var8 == var9) {
                                 break label238;
                              }

                              var8 = axxxxx;
                              var9 = 7542;
                              long var43 = 6786307920832652249L ^ ax;
                              var9 = 176;
                           }

                           if (var8 != var9) {
                              break label236;
                           }
                        }

                        axxx.append(axxxxx);
                     }

                     axxxx++;
                     if (axx != null) {
                        continue;
                     }
                  }

                  var10000 = axxx.toString();
                  break;
               }

               return var10000;
            }
         }

         var10000 = a;
      }

      return var10000;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static String gkn(String input) {
      long ax = fhc.a ^ 82988176095796L;
      int[] axx = dar.abu();
      String var10000 = a;
      if (axx != null) {
         label95:
         if (a != null) {
            var10000 = a;
            if (axx != null) {
               if (a.isEmpty()) {
                  break label95;
               }

               try {
                  var10000 = a;
               } catch (Exception var8) {
                  return a;
               }
            }

            label102: {
               String axxx;
               label84: {
                  try {
                     byte[] axxxx = var10000.getBytes(StandardCharsets.ISO_8859_1);
                     axxx = new String(axxxx, StandardCharsets.UTF_8);
                     var14 = axxx.equals(a);
                     if (axx == null) {
                        break label84;
                     }

                     if (!var14) {
                        var14 = axxx.contains("�");
                        if (axx == null) {
                           break label84;
                        }

                        if (!var14) {
                           return axxx;
                        }
                     }
                  } catch (Exception var11) {
                     return a;
                  }

                  try {
                     byte[] var12 = a.getBytes(StandardCharsets.ISO_8859_1);
                     short var10003 = 5561;
                     long var10004 = 6014256061409882071L ^ ax;
                     axxx = new String(var12, "Windows-1252");
                     var10000 = axxx;
                     if (axx == null) {
                        break label102;
                     }

                     var14 = axxx.equals(a);
                  } catch (Exception var10) {
                     return a;
                  }
               }

               try {
                  if (!var14) {
                     var10000 = axxx;
                     if (axx == null) {
                        break label102;
                     }

                     if (!axxx.contains("�")) {
                        return axxx;
                     }
                  }
               } catch (Exception var9) {
                  return a;
               }

               try {
                  var10000 = a;
               } catch (Exception var7) {
                  return a;
               }
            }

            try {
               return var10000;
            } catch (Exception var6) {
               return a;
            }
         }

         var10000 = a;
      }

      return var10000;
   }

   static {
      long var22 = a ^ 84225446900487L;
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
      String var28 = "®¨¶-\u0013ÅÀ÷\rÙ\u0010ð9kýN\u0010&:\u00110\u0094\b,\u0084t½\"r.mÿc\u0010\u001c\u001b¨\u001a\u0095*bÁÆx\u008d×\u008eà\u009dO\u0010 êø/Êfø\u0005p\u0011«ó\t\u0098ïi\u00109\";9Z÷Ý¾1Ñ|õ \u0016H\u0011\u0010\rS<\nr»4àúü£\boMø°\u0010\u009fº\u0099ì\u0082\u0080§\u001d\u009a\u0086U´\u0092\u009dÐ$(ã\u007fc}© ò\u009ey\u0084c\u0012{FZùÍªÅB\u0001^(·\u0088\"ÐW\u0087\u0007a¿\u009cW~m³µ\u001dÃ\u0010?S\u0016ª+\u009e9|\u0014Ô·eR9iÇ\u0010,±öcöý =Á\u009eÝ\u001dyD|õ\u0010\u0098+®¤ it.\u0084®ç\u0099\u008f\u000f09\u0010\búm\u009e\u009f\u0000\u0091  >[&L\u008c#F\u0010µÉc\u001a²¸\u009b\u009aÏæT\u0015!³6\u0083\u001077Ñ'\u001b\u0083\u00970ã\bG°¼z\u008au  Ü\u001a¸ÌÕë3¾\tpÕïèJ1ñFCï{ð9\u001dä\u001cÚ1Â¿ó«";
      int var30 = "®¨¶-\u0013ÅÀ÷\rÙ\u0010ð9kýN\u0010&:\u00110\u0094\b,\u0084t½\"r.mÿc\u0010\u001c\u001b¨\u001a\u0095*bÁÆx\u008d×\u008eà\u009dO\u0010 êø/Êfø\u0005p\u0011«ó\t\u0098ïi\u00109\";9Z÷Ý¾1Ñ|õ \u0016H\u0011\u0010\rS<\nr»4àúü£\boMø°\u0010\u009fº\u0099ì\u0082\u0080§\u001d\u009a\u0086U´\u0092\u009dÐ$(ã\u007fc}© ò\u009ey\u0084c\u0012{FZùÍªÅB\u0001^(·\u0088\"ÐW\u0087\u0007a¿\u009cW~m³µ\u001dÃ\u0010?S\u0016ª+\u009e9|\u0014Ô·eR9iÇ\u0010,±öcöý =Á\u009eÝ\u001dyD|õ\u0010\u0098+®¤ it.\u0084®ç\u0099\u008f\u000f09\u0010\búm\u009e\u009f\u0000\u0091  >[&L\u008c#F\u0010µÉc\u001a²¸\u009b\u009aÏæT\u0015!³6\u0083\u001077Ñ'\u001b\u0083\u00970ã\bG°¼z\u008au  Ü\u001a¸ÌÕë3¾\tpÕïèJ1ñFCï{ð9\u001dä\u001cÚ1Â¿ó«"
         .length();
      char var27 = 16;
      int var36 = -1;

      label81:
      while (true) {
         String var37 = var28.substring(++var36, var36 + var27);
         int var10001 = -1;

         while (true) {
            byte[] var32 = var24.doFinal(var37.getBytes("ISO-8859-1"));
            String var53 = d(var32).intern();
            switch (var10001) {
               case 0:
                  var31[var29++] = var53;
                  if ((var36 += var27) >= var30) {
                     g = var31;
                     h = new String[17];
                     r = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var22 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[59];
                     int var14 = 0;
                     String var15 = "\u0004JØ¿\u0006^õ\u009fó\u009a&ô%²\u009aâp(\u0010HA¼W¡=_\u001fb)1¯eû\u009dó[D±Ì¼ð\u0012$\u0086Vÿ£Ñ\u009cs|é\u0004º\u0005\u008e_·Øk\u0001Ý\u001dAEG!g\u0086\u001c{ 'âH\u0096 \rÈ]\u0091Ëg\u0087\rVX\u008e¹\u0085¯\u009e[ë\u0084J>¡@\"ÛâG<lOÿCàýPe\u0003\u0091 Fý±µ\u0011(\n[Ú[åÐy¢¼Â\nµ\u0091&îåÀ_ß\u008cÀð\u0096\u001b5Å×CÚÚ\u0097fo\\z7.0JÌEë%¥\u0012¿¥ç\u0089+T\u0092%»²\u00134%ª^Aé\t\u0015L¡\u001fDõê#{}=\u0002\u001eå\u001eu\f·É\u0007þ\u0099\u0084]ï\u001dY{N{®_T¸^\nö\u0015\u0005Ò@ê¹U¹©B¶ëÍL¹õÓ\u000fL#G\u001aÄ¹ñÁq\u000e-±O\u0015ù©ûéÐß; ð\u0093ça\u0016ë\\Jè\u0003ü\tÐ4\u0084¶\u0094Ñt_åYü÷\u0084mÐ\buût\u0013·Ì@\u0099ò÷ãÓ!\u0015w;:ÇNÂü\u0089_\u0019Qõ\u0010J+³Ð1\u0010Ç´eª¸¥}ß\u0099\u0095Ä&:u\u00adÔ\u0017%òÂ3§\u001c\u0007Á\u007f05\u000eÄÍ |\fiÓ®7\u0011\u001fX\u0001µ\u0094Ð\u009fV\fÖ\u0086ßÍËÅÌ\u009d\u008e\u0086^\n\u0013Qr9ÎÚ\u009fÌuGê8n\u009b§æfæÝ\u009dµÌõX 'B\u0013+ê\u0000\u000f\u0089\u009bÈ\u001c<±â.ß\u001a%jõªó|\u0086\u0098S\u0088Ï^\u009aTÕ\bæTr~\r\u0014ø¶<%;Xj\u009e\u009dÝ";
                     int var16 = "\u0004JØ¿\u0006^õ\u009fó\u009a&ô%²\u009aâp(\u0010HA¼W¡=_\u001fb)1¯eû\u009dó[D±Ì¼ð\u0012$\u0086Vÿ£Ñ\u009cs|é\u0004º\u0005\u008e_·Øk\u0001Ý\u001dAEG!g\u0086\u001c{ 'âH\u0096 \rÈ]\u0091Ëg\u0087\rVX\u008e¹\u0085¯\u009e[ë\u0084J>¡@\"ÛâG<lOÿCàýPe\u0003\u0091 Fý±µ\u0011(\n[Ú[åÐy¢¼Â\nµ\u0091&îåÀ_ß\u008cÀð\u0096\u001b5Å×CÚÚ\u0097fo\\z7.0JÌEë%¥\u0012¿¥ç\u0089+T\u0092%»²\u00134%ª^Aé\t\u0015L¡\u001fDõê#{}=\u0002\u001eå\u001eu\f·É\u0007þ\u0099\u0084]ï\u001dY{N{®_T¸^\nö\u0015\u0005Ò@ê¹U¹©B¶ëÍL¹õÓ\u000fL#G\u001aÄ¹ñÁq\u000e-±O\u0015ù©ûéÐß; ð\u0093ça\u0016ë\\Jè\u0003ü\tÐ4\u0084¶\u0094Ñt_åYü÷\u0084mÐ\buût\u0013·Ì@\u0099ò÷ãÓ!\u0015w;:ÇNÂü\u0089_\u0019Qõ\u0010J+³Ð1\u0010Ç´eª¸¥}ß\u0099\u0095Ä&:u\u00adÔ\u0017%òÂ3§\u001c\u0007Á\u007f05\u000eÄÍ |\fiÓ®7\u0011\u001fX\u0001µ\u0094Ð\u009fV\fÖ\u0086ßÍËÅÌ\u009d\u008e\u0086^\n\u0013Qr9ÎÚ\u009fÌuGê8n\u009b§æfæÝ\u009dµÌõX 'B\u0013+ê\u0000\u000f\u0089\u009bÈ\u001c<±â.ß\u001a%jõªó|\u0086\u0098S\u0088Ï^\u009aTÕ\bæTr~\r\u0014ø¶<%;Xj\u009e\u009dÝ"
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
                        byte var63 = -1;

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
                           long var68 = (var21[0] & 255L) << 56
                              | (var21[1] & 255L) << 48
                              | (var21[2] & 255L) << 40
                              | (var21[3] & 255L) << 32
                              | (var21[4] & 255L) << 24
                              | (var21[5] & 255L) << 16
                              | (var21[6] & 255L) << 8
                              | var21[7] & 255L;
                           switch (var63) {
                              case 0:
                                 var40[var10001] = var68;
                                 if (var13 >= var16) {
                                    p = var17;
                                    q = new Integer[59];
                                    x = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var22 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[6];
                                    int var3 = 0;
                                    String var4 = "\"?|³ÿn\u0001@ì\u009cÆË_WS¨\u001d·CøwPÐT\u0083{Õ÷P®«³";
                                    int var5 = "\"?|³ÿn\u0001@ì\u009cÆË_WS¨\u001d·CøwPÐT\u0083{Õ÷P®«³".length();
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
                                       byte var66 = -1;

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
                                          var68 = (var10[0] & 255L) << 56
                                             | (var10[1] & 255L) << 48
                                             | (var10[2] & 255L) << 40
                                             | (var10[3] & 255L) << 32
                                             | (var10[4] & 255L) << 24
                                             | (var10[5] & 255L) << 16
                                             | (var10[6] & 255L) << 8
                                             | var10[7] & 255L;
                                          switch (var66) {
                                             case 0:
                                                var42[var49] = var68;
                                                if (var2 >= var5) {
                                                   v = var6;
                                                   w = new Long[6];
                                                   return;
                                                }
                                                break;
                                             default:
                                                var42[var49] = var68;
                                                if (var2 < var5) {
                                                   continue label47;
                                                }

                                                var4 = "WÕÿ±FXÜ\u0002\u0083øÿãyÖ±I";
                                                var5 = "WÕÿ±FXÜ\u0002\u0083øÿãyÖ±I".length();
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
                                          var66 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var40[var10001] = var68;
                                 if (var13 < var16) {
                                    continue label63;
                                 }

                                 var15 = "f²r\u009e*\u0011)Ýõ\u0018\u0091\u000bto\u0012\u001d";
                                 var16 = "f²r\u009e*\u0011)Ýõ\u0018\u0091\u000bto\u0012\u001d".length();
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
                           var63 = 0;
                        }
                     }
                  }

                  var27 = var28.charAt(var36);
                  break;
               default:
                  var31[var29++] = var53;
                  if ((var36 += var27) < var30) {
                     var27 = var28.charAt(var36);
                     continue label81;
                  }

                  var28 = "F²\u0089¢®\u0093åË&\\\u0091Èöj 1©mªe3S¨áÉRÃj\u0018nâ:©×ñ\n\u008c6Ï\u0001\u0018ÃVO^µfÎ&ç¢Òô\u0080\u008c\u0084Åý\u0013 \u0097å\u000b\"ë";
                  var30 = "F²\u0089¢®\u0093åË&\\\u0091Èöj 1©mªe3S¨áÉRÃj\u0018nâ:©×ñ\n\u008c6Ï\u0001\u0018ÃVO^µfÎ&ç¢Òô\u0080\u008c\u0084Åý\u0013 \u0097å\u000b\"ë"
                     .length();
                  var27 = '(';
                  var36 = -1;
            }

            var37 = var28.substring(++var36, var36 + var27);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15213;
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
            throw new RuntimeException("cc/astralis/fhc", var10);
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
         throw new RuntimeException("cc/astralis/fhc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19029;
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
            throw new RuntimeException("cc/astralis/fhc", var14);
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
         throw new RuntimeException("cc/astralis/fhc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long g(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2614;
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
            throw new RuntimeException("cc/astralis/fhc", var14);
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
         throw new RuntimeException("cc/astralis/fhc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
