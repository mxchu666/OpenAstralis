package cc.astralis;

import imgui.type.ImFloat;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3966;

public class ezw extends guu {
   private final adu ggy;
   private final bes deb;
   private final bes ff;
   private final gbp fd;
   private final gbp dxd;
   private final gbp cjg;
   private final gbp cjf;
   private final gbp gzv;
   private final gbp hda;
   private final gbp gcy;
   private final bes gux;
   private final bes cte;
   private final gbp cxj;
   private final bes fzb;
   private final bes bff;
   private final bes brm;
   private final bes fpp;
   private final bes acu;
   private final bes emm;
   private float egm;
   private int fh;
   private boolean anv;
   private float ccb;
   private float hbq;
   private float cbt;
   private static final long a = 99645546734152L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;
   private static final long v;

   public ezw() {
      long a = ezw.a ^ 36880257364086L;
      super(bfm.COMBAT);
      short var10003 = 30728;
      long var10004 = 7953229018705552167L ^ a;
      short var34 = 31343;
      long var10005 = 1960545951199387991L ^ a;
      String[] var65 = new String[3];
      short var10008 = 31343;
      long var10009 = 1960545951199387991L ^ a;
      var65[0] = "Normal";
      var10008 = 927;
      var10009 = 5338264378376296637L ^ a;
      var65[1] = "Silent";
      var10008 = 27409;
      var10009 = 7059447205718421548L ^ a;
      var65[2] = "Flex";
      a.ggy = new adu("Mode", "Normal", var65);
      var10003 = 27854;
      var10004 = 5313805394322192367L ^ a;
      a.deb = new bes("Range", 4.5F, 1.0F, 6.0F, 0.1F);
      var10003 = 28546;
      var10004 = 2053113130001888440L ^ a;
      a.ff = new bes("FOV", 90.0F, 1.0F, 180.0F, 1.0F);
      var10003 = 28298;
      var10004 = 6687961805906408885L ^ a;
      a.fd = new gbp("Use Sensitivity", true);
      var10003 = 30222;
      var10004 = 7100042087782149418L ^ a;
      a.dxd = new gbp("Only While Clicking", false);
      var10003 = 7725;
      var10004 = 5166220133049894144L ^ a;
      a.cjg = new gbp("Weapon Only", false);
      var10003 = 15810;
      var10004 = 6418421380856522492L ^ a;
      a.cjf = new gbp("Ignore Teammates", false);
      var10003 = 31497;
      var10004 = 7244066710292357173L ^ a;
      a.gzv = new gbp("Though Walls", false);
      var10003 = 8758;
      var10004 = 8097949212642261252L ^ a;
      a.hda = new gbp("Stop Aiming on Target", false);
      var10003 = 16703;
      var10004 = 4174540189984741912L ^ a;
      a.gcy = new gbp("Slow Aim if Close", true);
      var10003 = 1758;
      var10004 = 3186086160944471547L ^ a;
      a.gux = (bes)new bes("Slow Aim Threshold", 10.0F, 1.0F, 30.0F, 1.0F).bih(a.gcy::dnp);
      var10003 = 7153;
      var10004 = 3425859419194851543L ^ a;
      a.cte = (bes)new bes("Slow Aim Factor", 0.3F, 0.1F, 1.0F, 0.1F).bih(a.gcy::dnp);
      var10003 = 30311;
      var10004 = 4509748522956811612L ^ a;
      a.cxj = new gbp("Take Curved Way", false);
      var10003 = 10784;
      var10004 = 2053718109340152073L ^ a;
      a.fzb = (bes)new bes("Curve Amplitude", 1.5F, 0.5F, 5.0F, 0.1F).bih(a.cxj::dnp);
      var10003 = 2388;
      var10004 = 351719911379014263L ^ a;
      a.bff = (bes)new bes("Curve Frequency", 0.3F, 0.1F, 1.5F, 0.05F).bih(a.cxj::dnp);
      var10003 = 17714;
      var10004 = 6974823618677235224L ^ a;
      a.brm = new bes("Min Speed", 3.0F, 1.0F, 15.0F, 0.1F);
      var10003 = 19214;
      var10004 = 7036203271295946789L ^ a;
      a.fpp = new bes("Max Speed", 6.0F, 1.0F, 20.0F, 0.1F);
      var10003 = 9249;
      var10004 = 1867478239720259337L ^ a;
      a.acu = new bes("Random Amount", 1.0F, 0.0F, 5.0F, 0.1F);
      var10003 = 24512;
      var10004 = 3861473497659884793L ^ a;
      a.emm = new bes("Random Frequency", 0.3F, 0.05F, 2.0F, 0.05F);
      a.egm = 0.0F;
      a.fh = 0;
      a.anv = false;
      short var10001 = 6847;
      long var10002 = 5770393222059781850L ^ a;
      ffn[] var3 = new ffn[]{a.ggy, a.deb, a.ff, a.fd, a.brm, a.fpp, null, null, null, null, null, null, null, null, null, null, null, null, null};
      var10003 = 14982;
      var10004 = 1493188800026824425L ^ a;
      var3[6] = a.cjg;
      var10003 = 19996;
      var10004 = 1109123320207948402L ^ a;
      var3[7] = a.dxd;
      var10003 = 18499;
      var10004 = 5823633853097262119L ^ a;
      var3[8] = a.cjf;
      var10003 = 29412;
      var10004 = 4350541447197263496L ^ a;
      var3[9] = a.gzv;
      var10003 = 28163;
      var10004 = 4820647502951553643L ^ a;
      var3[10] = a.hda;
      var10003 = 8171;
      var10004 = 7867947616034941824L ^ a;
      var3[11] = a.gcy;
      var10003 = 28254;
      var10004 = 3106033526362577464L ^ a;
      var3[12] = a.gux;
      var10003 = 6596;
      var10004 = 1960178898609171875L ^ a;
      var3[13] = a.cte;
      var3[e<"y">(30766, 3545106078976511053L ^ a)] = a.cxj;
      var10003 = 18320;
      var10004 = 1863568349737759738L ^ a;
      var3[15] = a.fzb;
      var10003 = 8940;
      var10004 = 589091958891992717L ^ a;
      var3[16] = a.bff;
      var10003 = 25066;
      var10004 = 8735227110279517575L ^ a;
      var3[17] = a.acu;
      var10003 = 28054;
      var10004 = 659869461956434431L ^ a;
      var3[18] = a.emm;
      a.bfi(var3);
   }

   @gdz
   public void eqj(ctt event) {
      long ax;
      int[] axx;
      ezw var19;
      label208: {
         ax = ezw.a ^ 123585673933154L;
         axx = dar.abu();
         boolean var10000 = a.dxd.dnp();
         if (axx != null) {
            if (var10000 && !chi.field_1690.field_1886.method_1434()) {
               return;
            }

            var19 = a;
            if (axx == null) {
               break label208;
            }

            var10000 = a.cjg.dnp();
         }

         if (var10000 && !bav.glo()) {
            return;
         }

         var19 = a;
      }

      class_1297 axxx = var19.arr(a.deb.dnp().floatValue());
      if (axx != null) {
         if (axxx != null) {
            bgi axxxx;
            float[] axxxxx;
            label211: {
               axxxx = a.dip(axxx);
               axxxxx = dgq.dxs(axxx);
               float var31;
               int var20 = (var31 = a.atv(axxxxx[0], chi.field_1724.method_36454()) - a.ff.dnp().floatValue()) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
               if (axx != null) {
                  if (var20 > 0) {
                     a.egm = 0.0F;
                     return;
                  }

                  var21 = a.hda.dnp();
                  if (axx == null) {
                     break label211;
                  }

                  var20 = var21;
               }

               if (var20 != 0) {
                  class_239 axxxxxx = chi.field_1765;
                  var21 = axxxxxx;
                  if (axx == null) {
                     break label211;
                  }

                  if (axxxxxx instanceof class_3966 axxxxxxx) {
                     var21 = axxxxxxx.method_17782();
                     if (axx == null) {
                        break label211;
                     }

                     if (var21 == axxx) {
                        a.egm = 0.0F;
                        return;
                     }
                  }
               }

               var21 = a.brm.dnp();
            }

            float axxxxxxx;
            float axxxxxxxx;
            label172: {
               axxxxxxx = (((ImFloat)var21).floatValue() + a.fpp.dnp().floatValue()) / 2.0F;
               axxxxxxxx = 1.0F;
               Object var22 = a.fd.dnp();
               if (axx != null) {
                  if (!var22) {
                     break label172;
                  }

                  var22 = chi.field_1690.method_42495().method_41753();
               }

               float axxxxxxxxx = ((Double)var22).floatValue();
               axxxxxxxx = axxxxxxxxx * 2.0F;
            }

            float axxxxxxxxx;
            float axxxxxxxxxx;
            label166: {
               label165: {
                  label213: {
                     axxxxxxxxxx = axxxxxxx * 0.05F * axxxxxxxx;
                     axxxxxxxxx = axxxxxxx * 0.05F * axxxxxxxx;
                     var23 = a.gcy.dnp();
                     label163:
                     if (axx != null) {
                        if (var23 != 0) {
                           float axxxxxxxxxxx = a.atv(axxxxx[0], chi.field_1724.method_36454()) + a.atv(axxxxx[1], chi.field_1724.method_36455());
                           float var32;
                           var23 = (var32 = axxxxxxxxxxx - a.gux.dnp().floatValue()) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
                           if (axx == null) {
                              break label163;
                           }

                           if (var23 < 0) {
                              float axxxxxxxxxxxx = Math.max(a.cte.dnp().floatValue(), axxxxxxxxxxx / a.gux.dnp().floatValue());
                              axxxxxxxxxx *= axxxxxxxxxxxx;
                              axxxxxxxxx *= axxxxxxxxxxxx;
                           }
                        }

                        var19 = a;
                        if (axx == null) {
                           break label213;
                        }

                        var23 = a.cxj.dnp();
                     }

                     if (var23 != 0) {
                        a.egm = a.egm + a.bff.dnp().floatValue();
                        var25 = a;
                        if (axx == null) {
                           break label166;
                        }

                        if (a.egm > 1.0F) {
                           a.egm = 1.0F;
                        }
                        break label165;
                     }

                     var19 = a;
                  }

                  var19.egm = 0.0F;
               }

               var25 = a.ggy.dnp();
            }

            String var17 = (String)var25;
            byte var18 = -1;
            var26 = var17.hashCode();
            label147:
            if (axx != null) {
               switch (var26) {
                  case -1955878649:
                     short var10001 = 24251;
                     long var10002 = 1528242106189825155L ^ ax;
                     var26 = var17.equals("Normal");
                     if (axx == null) {
                        break label147;
                     }

                     if (var26 == 0) {
                        break;
                     }

                     var18 = 0;
                     if (axx != null) {
                        break;
                     }
                  case -1818460043:
                     short var27 = 26650;
                     long var29 = 8957008784972673568L ^ ax;
                     var26 = var17.equals("Silent");
                     if (axx == null) {
                        break label147;
                     }

                     if (var26 == 0) {
                        break;
                     }

                     var18 = 1;
                     if (axx != null) {
                        break;
                     }
                  case 2192409:
                     short var28 = 9420;
                     long var30 = 5568364506756038392L ^ ax;
                     var26 = var17.equals("Flex");
                     if (axx == null) {
                        break label147;
                     }

                     if (var26 != 0) {
                        var18 = 2;
                     }
               }

               var26 = var18;
            }

            switch (var26) {
               case 0:
                  a.auv(a.gbk(axxx, axxxx), axxxxxxxxxx, axxxxxxxxx, axxx);
                  break;
               case 1:
                  dqq.cms(axxxxx, a.brm.dnp().floatValue(), a.fpp.dnp().floatValue());
                  if (axx != null) {
                     break;
                  }
               case 2:
                  a.hgc(axxx, axxxx);
            }

            return;
         }

         a.egm = 0.0F;
      }
   }

   private void hgc(class_1297 a, bgi a) {
      ezw var11;
      label41: {
         long ax = ezw.a ^ 67969425970021L;
         int[] var10000 = dar.abu();
         float[] axx = dgq.dxs(a);
         int[] axxx = var10000;
         float axxxx = axx[0];
         float axxxxx = axx[1];
         int var10 = a.anv;
         if (axxx != null) {
            if (a.anv) {
               float axxxxxx = 6.0F;
               a.hbq += axxxxxx;
               if (axxx != null) {
                  if (a.hbq >= a.cbt) {
                     a.anv = false;
                  }

                  chi.field_1724.method_36456(a.hbq % 360.0F);
                  chi.field_1724.method_36457(axxxxx);
               }

               return;
            }

            chi.field_1724.method_36456(axxxx);
            chi.field_1724.method_36457(axxxxx);
            a.fh++;
            var11 = a;
            if (axxx == null) {
               break label41;
            }

            var10 = a.fh;
         }

         if (var10 < e<"y">(5618, 1273727101809050241L ^ ax)) {
            return;
         }

         a.anv = true;
         a.fh = 0;
         a.ccb = chi.field_1724.method_36454();
         a.hbq = a.ccb;
         var11 = a;
      }

      var11.cbt = a.ccb + 360.0F;
   }

   private void auv(class_243 a, float a, float a, class_1297 a) {
      double ax;
      float var33;
      label38: {
         long axx = ezw.a ^ 93317145720678L;
         class_243 axxx = chi.field_1724.method_5836(1.0F);
         class_243 axxxx = a.method_1020(axxx);
         double axxxxx = class_3532.method_15349(axxxx.field_1350, axxxx.field_1352) * 180.0 / Math.PI - 90.0;
         int[] var10000 = dar.abu();
         double axxxxxx = -class_3532.method_15349(axxxx.field_1351, Math.sqrt(axxxx.field_1352 * axxxx.field_1352 + axxxx.field_1350 * axxxx.field_1350))
            * 180.0
            / Math.PI;
         int[] axxxxxxx = var10000;
         double axxxxxxxx = class_3532.method_15338(axxxxx - chi.field_1724.method_36454());
         ax = axxxxxx - chi.field_1724.method_36455();
         int var31 = a.cxj.dnp();
         if (axxxxxxx != null) {
            if (var31 != 0) {
               float axxxxxxxxx = a.atv((float)axxxxx, chi.field_1724.method_36454()) + a.atv((float)axxxxxx, chi.field_1724.method_36455());
               float axxxxxxxxxx = a.fzb.dnp().floatValue() * Math.min(1.0F, axxxxxxxxx / a.gux.dnp().floatValue());
               class_243 axxxxxxxxxxx = a.method_18798();
               float axxxxxxxxxxxx = (float)Math.signum(axxxxxxxxxxx.field_1352 * axxxx.field_1350 - axxxxxxxxxxx.field_1350 * axxxx.field_1352);
               var33 = axxxxxxxxxxxx;
               if (axxxxxxx != null) {
                  var33 = axxxxxxxxxxxx == 0.0F ? 1.0F : axxxxxxxxxxxx;
               }

               axxxxxxxxxxxx = var33;
               axxxxxxxx += Math.sin(a.egm * Math.PI) * axxxxxxxxxx * axxxxxxxxxxxx;
               ax += Math.cos(a.egm * Math.PI) * axxxxxxxxxx * 0.5;
            }

            var33 = a.acu.dnp().floatValue();
            if (axxxxxxx == null) {
               break label38;
            }

            float var34;
            var31 = (var34 = var33 - 0.0F) == 0.0F ? 0 : (var34 < 0.0F ? -1 : 1);
         }

         if (var31 > 0) {
            float axxxxxxxxx = a.acu.dnp().floatValue();
            float axxxxxxxxxx = a.emm.dnp().floatValue();
            float axxxxxxxxxxx = (float)(System.currentTimeMillis() % v) / 1000.0F;
            axxxxxxxx += Math.sin(axxxxxxxxxxx * axxxxxxxxxx * 2.0F * Math.PI) * axxxxxxxxx;
            ax += Math.cos(axxxxxxxxxxx * axxxxxxxxxx * 2.0F * Math.PI) * axxxxxxxxx * 0.5;
         }

         var33 = (float)(chi.field_1724.method_36454() + axxxxxxxx * a * 0.05);
      }

      float axxxxxxxxx = var33;
      float axxxxxxxxxx = (float)(chi.field_1724.method_36455() + ax * a * 0.05);
      float axxxxxxxxxxx = a.fdy();
      axxxxxxxxx = Math.round(axxxxxxxxx / axxxxxxxxxxx) * axxxxxxxxxxx;
      axxxxxxxxxx = Math.round(axxxxxxxxxx / axxxxxxxxxxx) * axxxxxxxxxxx;
      chi.field_1724.method_36456(axxxxxxxxx);
      chi.field_1724.method_36457(axxxxxxxxxx);
   }

   private class_1297 arr(float a) {
      return (class_1297)bav.elv(false, false, a.cjf.dnp(), false, a.gzv.dnp(), a).stream().filter(ax -> {
         long ax = ezw.a ^ 54498965732518L;
         return ax instanceof class_1657 && chi.field_1755 == null;
      }).min(Comparator.comparingDouble(chi.field_1724::method_5858)).orElse(null);
   }

   private bgi dip(class_1297 a) {
      long ax = ezw.a ^ 54782843541851L;
      bgi axx = null;
      float axxx = Float.MAX_VALUE;
      int[] var10000 = dar.abu();
      double axxxx = Double.NEGATIVE_INFINITY;
      bgi[] var9 = bgi.values();
      int[] axxxxx = var10000;
      int var10 = var9.length;
      int var11 = 0;

      while (true) {
         if (var11 < var10) {
            var16 = var9[var11];
            if (axxxxx == null) {
               break;
            }

            label32: {
               bgi axxxxxx = var16;
               class_243 axxxxxxx = a.gbk(a, axxxxxx);
               float[] axxxxxxxx = a.byk(axxxxxxx);
               float axxxxxxxxx = a.atv(axxxxxxxx[0], chi.field_1724.method_36454()) + a.atv(axxxxxxxx[1], chi.field_1724.method_36455());
               float var17 = axxxxxxxxx;
               if (axxxxx != null) {
                  if (!(axxxxxxxxx < axxx) && (axxxxxxxxx != axxx || !(axxxxxxx.field_1351 > axxxx))) {
                     break label32;
                  }

                  axx = axxxxxx;
                  var17 = axxxxxxxxx;
               }

               axxx = var17;
               axxxx = axxxxxxx.field_1351;
            }

            var11++;
            if (axxxxx != null) {
               continue;
            }
         }

         var16 = axx;
         break;
      }

      return var16;
   }

   private class_243 gbk(class_1297 a, bgi a) {
      long a = ezw.a ^ 6705875188801L;
      class_243 a = a.method_73189();
      double a = a.method_17682();

      return switch (dgw.hiz[a.ordinal()]) {
         case 1 -> a.method_1031(0.0, a.method_5751(), 0.0);
         case 2 -> a.method_1031(0.0, a * 0.85, 0.0);
         case 3 -> a.method_1031(0.0, a * 0.65, 0.0);
         case 4 -> a.method_1031(0.0, a * 0.35, 0.0);
         case 5 -> a.method_1031(-0.3, a * 0.6, 0.0);
         case 6 -> a.method_1031(0.3, a * 0.6, 0.0);
         default -> throw new MatchException(null, null);
      };
   }

   private float[] byk(class_243 a) {
      class_243 ax = chi.field_1724.method_5836(1.0F);
      class_243 axx = a.method_1020(ax);
      float axxx = (float)class_3532.method_15338(class_3532.method_15349(axx.field_1350, axx.field_1352) * 180.0 / Math.PI - 90.0);
      float axxxx = (float)class_3532.method_15338(
         -class_3532.method_15349(axx.field_1351, Math.sqrt(axx.field_1352 * axx.field_1352 + axx.field_1350 * axx.field_1350)) * 180.0 / Math.PI
      );
      return new float[]{axxx, axxxx};
   }

   private float atv(float a, float a) {
      long ax = ezw.a ^ 52059905932071L;
      int[] var10000 = dar.abu();
      float axx = (a - a) % 360.0F;
      int[] axxx = var10000;
      float var10;
      int var7 = (var10 = axx - 180.0F) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
      if (axxx != null) {
         if (var7 > 0) {
            return Math.abs(axx - 360.0F);
         }

         if (axxx == null) {
            return Math.abs(axx + -180.0F);
         }

         float var11;
         var7 = (var11 = axx - -180.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
      }

      return var7 >= 0 ? Math.abs(axx) : Math.abs(axx + 360.0F);
   }

   private float fdy() {
      float a = ((Double)chi.field_1690.method_42495().method_41753()).floatValue();
      float ax = a * 0.6F + 0.2F;
      return ax * ax * ax * 1.2F;
   }

   static {
      long var16 = a ^ 29930017690583L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var19 = 1; var19 < 8; var19++) {
         var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[25];
      int var23 = 0;
      String var22 = "½ü:\u00008\u001f\u0086\u0014`º+\u0017Ï$0SI\u001f\u0019\u0087\t\u000fÍRQJÄQ[M©\u007f\u0018É&`!\u0093Aráð@>+H6ýjHêLoX\u009elz sÇ\u001c\t=7þ\u009f£\u0000f2^ë¥\f@ø\u0001Ó'vE ¿¶\f¾=nní\u00188#0½oàäýJ\u000fO\\M4¸L-G¿\u0000âÍ\u000f\u0004\u0010Ðyò¿×«V<I\u0088\u009a\u008câíH\u009b\u0010\u008fd\u00ad\n®É\tU]\u0096\u0093\u009c{aÐ2\u0010}\b#\u0003\u000eBÕØ\u000eø\u0081f\u009a\u001e±:\u0018Õ\u0094¥9\u001b\u0082I\u008eÐ£~Ò¦s¬gm\u0003\u008bjÓÐå\u008d\u0010Îäâ{\u009fg^ÉËÜØìæéèÒ \u0011\\\u007f¬{ª¤*Ü·»\u008dQ\n£}ðsâ\u0093ò+x\u001d.5~\u0004/¼\u008c?\u0010HG\u0095ê-?b(è\u0011©\u0089\u0088\u008c\u0001E\u0010kÂ÷\u00127\u0001\u000f\u0092&\\Eª\u0000\u0019Ó§\u0018\u009c´\\c7 fv\u0087Ã\u00946\u0012\u000e,$<¢\u009bÞ\u008f!¸\u0097(n¡lÎ;,EËÍØs\u00ad¿ö\u000flaá¥\u009bMj»ò\u0005=ÀÝl¼\u0005ìögÂJ¤M6F(h\u000e\u009a\u001eÕ*\u0081\u0004Ã\u001f_ ù·\u0017çÞ\b6à\u0084·:\u0088\u009bÙ\u0001\u00854m>\u0003Ö÷^\u0094E,\u00897(\u009a\u008a«:W¿pK&M\u009ct\u000e\u0091v\u0017¯Ï×cV$\u0012»Èã\u0098\bI¬áÞÚú¢gv?æç\u0010ß\u0006®·[s\u0001T¹Í\u0004ÓÒ:h3 ?Ö\u0086Ð^Mà\u0093\u0092C´qúA\u0087Pë\u008d\u009e\u008a\u0019ëÕdÑ\u008a\u0084G]Ø÷<\u0010\u0017(Øé?cß#¿¥xÃY\u0095Û\u0081(îËX`\u009c«ùIJ\u0014íÔ|\u001aI\u00ad\u0000\u0088\"K£\u0080|Í\"±\u0090µ\n\u008a\fj\u0098ÝY\u0081\u0016\u0091µ\u0095(Äg'g/Ån\u0084\u0016-\u0019U¾\u0093\u0080\u008eëJ,üÛ½x/wÿXr|oÔ'\nbIeÌ\u0082ý\u0005 \u0015kÜ.ý¹=é\u007fÜ0£uA[áÈ\u000e\b\u009a\u001fT¾¶,o7\u0098:6ÜÉ dÅçÎ$¥ÊmI\u001c\u0006å\r\u009d¢ðv©×*Ø½\u0000\b¥±?8\u0082Tò\u000e";
      int var24 = "½ü:\u00008\u001f\u0086\u0014`º+\u0017Ï$0SI\u001f\u0019\u0087\t\u000fÍRQJÄQ[M©\u007f\u0018É&`!\u0093Aráð@>+H6ýjHêLoX\u009elz sÇ\u001c\t=7þ\u009f£\u0000f2^ë¥\f@ø\u0001Ó'vE ¿¶\f¾=nní\u00188#0½oàäýJ\u000fO\\M4¸L-G¿\u0000âÍ\u000f\u0004\u0010Ðyò¿×«V<I\u0088\u009a\u008câíH\u009b\u0010\u008fd\u00ad\n®É\tU]\u0096\u0093\u009c{aÐ2\u0010}\b#\u0003\u000eBÕØ\u000eø\u0081f\u009a\u001e±:\u0018Õ\u0094¥9\u001b\u0082I\u008eÐ£~Ò¦s¬gm\u0003\u008bjÓÐå\u008d\u0010Îäâ{\u009fg^ÉËÜØìæéèÒ \u0011\\\u007f¬{ª¤*Ü·»\u008dQ\n£}ðsâ\u0093ò+x\u001d.5~\u0004/¼\u008c?\u0010HG\u0095ê-?b(è\u0011©\u0089\u0088\u008c\u0001E\u0010kÂ÷\u00127\u0001\u000f\u0092&\\Eª\u0000\u0019Ó§\u0018\u009c´\\c7 fv\u0087Ã\u00946\u0012\u000e,$<¢\u009bÞ\u008f!¸\u0097(n¡lÎ;,EËÍØs\u00ad¿ö\u000flaá¥\u009bMj»ò\u0005=ÀÝl¼\u0005ìögÂJ¤M6F(h\u000e\u009a\u001eÕ*\u0081\u0004Ã\u001f_ ù·\u0017çÞ\b6à\u0084·:\u0088\u009bÙ\u0001\u00854m>\u0003Ö÷^\u0094E,\u00897(\u009a\u008a«:W¿pK&M\u009ct\u000e\u0091v\u0017¯Ï×cV$\u0012»Èã\u0098\bI¬áÞÚú¢gv?æç\u0010ß\u0006®·[s\u0001T¹Í\u0004ÓÒ:h3 ?Ö\u0086Ð^Mà\u0093\u0092C´qúA\u0087Pë\u008d\u009e\u008a\u0019ëÕdÑ\u008a\u0084G]Ø÷<\u0010\u0017(Øé?cß#¿¥xÃY\u0095Û\u0081(îËX`\u009c«ùIJ\u0014íÔ|\u001aI\u00ad\u0000\u0088\"K£\u0080|Í\"±\u0090µ\n\u008a\fj\u0098ÝY\u0081\u0016\u0091µ\u0095(Äg'g/Ån\u0084\u0016-\u0019U¾\u0093\u0080\u008eëJ,üÛ½x/wÿXr|oÔ'\nbIeÌ\u0082ý\u0005 \u0015kÜ.ý¹=é\u007fÜ0£uA[áÈ\u000e\b\u009a\u001fT¾¶,o7\u0098:6ÜÉ dÅçÎ$¥ÊmI\u001c\u0006å\r\u009d¢ðv©×*Ø½\u0000\b¥±?8\u0082Tò\u000e"
         .length();
      char var21 = ' ';
      int var29 = -1;

      label64:
      while (true) {
         String var30 = var22.substring(++var29, var29 + var21);
         int var10001 = -1;

         while (true) {
            byte[] var26 = var18.doFinal(var30.getBytes("ISO-8859-1"));
            String var43 = d(var26).intern();
            switch (var10001) {
               case 0:
                  var25[var23++] = var43;
                  if ((var29 += var21) >= var24) {
                     g = var25;
                     h = new String[25];
                     r = new HashMap(13);
                     Cipher var5;
                     var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var6 = 1; var6 < 8; var6++) {
                        var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var11 = new long[15];
                     int var8 = 0;
                     String var9 = "æ[ê=w\u0019ö\u001f\u007fvk\u0002r\u0006%\u009a-¿\bâ\u0092\u0003ç¼\u001e$è\u0002¢ÿkI]Cí9%SÕ\u0094r\u0012Ñ;ïô\u0014¾\u0000ÐëðP³qê\u0018<\u0083B9®¯ÒÆO@µ\u001dÞPj\u001b\u009esX\u0080-\u001e\u009c5\u009eÈÞF¤dèóçßUqUì\u0098¡ÌrÇÜ% È";
                     int var10 = "æ[ê=w\u0019ö\u001f\u007fvk\u0002r\u0006%\u009a-¿\bâ\u0092\u0003ç¼\u001e$è\u0002¢ÿkI]Cí9%SÕ\u0094r\u0012Ñ;ïô\u0014¾\u0000ÐëðP³qê\u0018<\u0083B9®¯ÒÆO@µ\u001dÞPj\u001b\u009esX\u0080-\u001e\u009c5\u009eÈÞF¤dèóçßUqUì\u0098¡ÌrÇÜ% È"
                        .length();
                     byte var7 = 0;

                     label46:
                     while (true) {
                        var10001 = var7;
                        var7 += 8;
                        byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
                        long[] var33 = var11;
                        var10001 = var8++;
                        long var47 = (var12[0] & 255L) << 56
                           | (var12[1] & 255L) << 48
                           | (var12[2] & 255L) << 40
                           | (var12[3] & 255L) << 32
                           | (var12[4] & 255L) << 24
                           | (var12[5] & 255L) << 16
                           | (var12[6] & 255L) << 8
                           | var12[7] & 255L;
                        byte var52 = -1;

                        while (true) {
                           long var13 = var47;
                           byte[] var15 = var5.doFinal(
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
                           long var55 = (var15[0] & 255L) << 56
                              | (var15[1] & 255L) << 48
                              | (var15[2] & 255L) << 40
                              | (var15[3] & 255L) << 32
                              | (var15[4] & 255L) << 24
                              | (var15[5] & 255L) << 16
                              | (var15[6] & 255L) << 8
                              | var15[7] & 255L;
                           switch (var52) {
                              case 0:
                                 var33[var10001] = var55;
                                 if (var7 >= var10) {
                                    p = var11;
                                    q = new Integer[15];
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long var2 = -6021083755208752287L;
                                    byte[] var4 = var0.doFinal(
                                       new byte[]{
                                          (byte)(var2 >>> 56),
                                          (byte)(var2 >>> 48),
                                          (byte)(var2 >>> 40),
                                          (byte)(var2 >>> 32),
                                          (byte)(var2 >>> 24),
                                          (byte)(var2 >>> 16),
                                          (byte)(var2 >>> 8),
                                          (byte)var2
                                       }
                                    );
                                    long var50 = (var4[0] & 255L) << 56
                                       | (var4[1] & 255L) << 48
                                       | (var4[2] & 255L) << 40
                                       | (var4[3] & 255L) << 32
                                       | (var4[4] & 255L) << 24
                                       | (var4[5] & 255L) << 16
                                       | (var4[6] & 255L) << 8
                                       | var4[7] & 255L;
                                    byte var41 = -1;
                                    v = var50;
                                    return;
                                 }
                                 break;
                              default:
                                 var33[var10001] = var55;
                                 if (var7 < var10) {
                                    continue label46;
                                 }

                                 var9 = "4B%)á~\u000exÓ\u001eO\u0098¥ýSÕ";
                                 var10 = "4B%)á~\u000exÓ\u001eO\u0098¥ýSÕ".length();
                                 var7 = 0;
                           }

                           byte var40 = var7;
                           var7 += 8;
                           var12 = var9.substring(var40, var7).getBytes("ISO-8859-1");
                           var33 = var11;
                           var10001 = var8++;
                           var47 = (var12[0] & 255L) << 56
                              | (var12[1] & 255L) << 48
                              | (var12[2] & 255L) << 40
                              | (var12[3] & 255L) << 32
                              | (var12[4] & 255L) << 24
                              | (var12[5] & 255L) << 16
                              | (var12[6] & 255L) << 8
                              | var12[7] & 255L;
                           var52 = 0;
                        }
                     }
                  }

                  var21 = var22.charAt(var29);
                  break;
               default:
                  var25[var23++] = var43;
                  if ((var29 += var21) < var24) {
                     var21 = var22.charAt(var29);
                     continue label64;
                  }

                  var22 = "Çé^\u0018MÚ´\u0014\u00942i8\u0094Âïù(ìQ8òv\u0089*î\u0096R_m\u0099\u007fP]ÈÒÅôwÙÊ»\u009b»Ù3ï>ç\u009cÍÊ¯ÞÞo\fO";
                  var24 = "Çé^\u0018MÚ´\u0014\u00942i8\u0094Âïù(ìQ8òv\u0089*î\u0096R_m\u0099\u007fP]ÈÒÅôwÙÊ»\u009b»Ù3ï>ç\u009cÍÊ¯ÞÞo\fO".length();
                  var21 = 16;
                  var29 = -1;
            }

            var30 = var22.substring(++var29, var29 + var21);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2324;
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
            throw new RuntimeException("cc/astralis/ezw", var10);
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
         throw new RuntimeException("cc/astralis/ezw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26195;
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
            throw new RuntimeException("cc/astralis/ezw", var14);
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
         throw new RuntimeException("cc/astralis/ezw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
