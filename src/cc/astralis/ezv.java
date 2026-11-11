package cc.astralis;

import io.github.humbleui.skija.Image;
import java.awt.Color;
import java.io.IOException;
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
import net.minecraft.class_1041;
import net.minecraft.class_124;
import net.minecraft.class_310;
import net.minecraft.class_408;
import net.minecraft.class_634;
import net.minecraft.class_640;

public class ezv extends guu {
   public final gbp btt;
   public final bes dud;
   public final gbp fxw;
   public final bes ecd;
   public final adu ahf;
   public final adu eqi;
   private final adu hjj;
   private final gbp dxi;
   private final dxl eyi;
   private final bes gle;
   private final epo aht;
   public acn ehf;
   public acn aoz;
   public final bes fug;
   private final env grl;
   private final cbm brd;
   private static String ard;
   private final Map<String, Image> gzk;
   private int gdj;
   private String[] bpz;
   private static final long a = 34258656575219L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;
   private static final long v;

   public ezv() {
      long a = ezv.a ^ 88925151785685L;
      super(bfm.VISUAL);
      short var10003 = 14191;
      long var10004 = 6941843360086449613L ^ a;
      a.btt = new gbp("Bloom", true);
      var10003 = 13620;
      var10004 = 8053911150239506316L ^ a;
      a.dud = new bes("Bloom Radius", 7.0F, 1.0F, 30.0F, 1.0F);
      var10003 = 23097;
      var10004 = 7261418327485395077L ^ a;
      a.fxw = new gbp("Blur", true);
      var10003 = 11474;
      var10004 = 2099962957170787953L ^ a;
      a.ecd = new bes("Blur Radius", 4.0F, 0.0F, 10.0F, 1.0F);
      var10003 = 198;
      var10004 = 3802840008875666016L ^ a;
      short var29 = 19700;
      long var10005 = 3991793115332224605L ^ a;
      short var51 = 6738;
      long var10006 = 4069237305909600245L ^ a;
      String[] var52 = new String[11];
      short var10008 = 28698;
      long var10009 = 7956088433006647969L ^ a;
      var52[0] = "Sf-Ui";
      var10008 = 16487;
      var10009 = 1028448303034084050L ^ a;
      var52[1] = "Product Sans Regular";
      var10008 = 23020;
      var10009 = 9111895173843989343L ^ a;
      var52[2] = "Product Sans Bold";
      var10008 = 13480;
      var10009 = 8183914193744715315L ^ a;
      var52[3] = "JetBrains-Regular";
      var10008 = 28296;
      var10009 = 9140699032541135919L ^ a;
      var52[4] = "JetBrains-Bold";
      var10008 = 7575;
      var10009 = 1186086777965967146L ^ a;
      var52[5] = "Poppins-Regular";
      short var10007 = 18225;
      long var75 = 7898276356431872650L ^ a;
      var10008 = 14202;
      var10009 = 275076257837112809L ^ a;
      var52[6] = "Poppins-Bold";
      var10007 = 7253;
      long var77 = 53687391600204284L ^ a;
      var10008 = 30673;
      var10009 = 7684990729984515430L ^ a;
      var52[7] = "Sf-Regular";
      var10007 = 9669;
      long var79 = 4926329460371775587L ^ a;
      var10008 = 23685;
      var10009 = 7685350712378013194L ^ a;
      var52[8] = "Sf-Bold";
      var10007 = 32452;
      long var81 = 6026658967061576559L ^ a;
      var10008 = 1249;
      var10009 = 8926858907091594878L ^ a;
      var52[9] = "Tahoma";
      var10007 = 8251;
      long var83 = 2689188779664762249L ^ a;
      var10008 = 32726;
      var10009 = 3820742193960260932L ^ a;
      var52[10] = "mojangles-extended";
      a.ahf = new adu("Font Mode", "Sf-Ui", var52);
      var10003 = 30049;
      var10004 = 3885654377690243047L ^ a;
      short var31 = 25526;
      var10005 = 9011481694488299815L ^ a;
      String[] var54 = new String[2];
      var10008 = 15691;
      var10009 = 271464924016367552L ^ a;
      var54[0] = "Client";
      var10008 = 31730;
      var10009 = 1089286616678863214L ^ a;
      var54[1] = "Rainbow";
      a.eqi = new adu("Color Mode", "Client", var54);
      var10003 = 13086;
      var10004 = 5017467779862747564L ^ a;
      short var33 = 821;
      var10005 = 4560130461931006376L ^ a;
      short var56 = 19344;
      var10006 = 7774588450400833076L ^ a;
      String[] var57 = new String[6];
      var10008 = 25934;
      var10009 = 8978199848977076190L ^ a;
      var57[0] = "Text";
      var10008 = 27249;
      var10009 = 2191800588165546217L ^ a;
      var57[1] = "Astralis";
      var10008 = 11107;
      var10009 = 3021581337340625401L ^ a;
      var57[2] = "Adjust";
      var10008 = 25971;
      var10009 = 4982558160241954801L ^ a;
      var57[3] = "Gif";
      var10008 = 28684;
      var10009 = 5914197163986655899L ^ a;
      var57[4] = "Sense";
      var10008 = 13115;
      var10009 = 290113548889217419L ^ a;
      var57[5] = "None";
      a.hjj = new adu("Water Mark Mode", "Text", var57);
      var10003 = 9228;
      var10004 = 25338860157587083L ^ a;
      a.dxi = new gbp("Alternative Color", true);
      var10003 = 15141;
      var10004 = 8824716764007879076L ^ a;
      short var36 = 20951;
      var10005 = 5039355458228271938L ^ a;
      a.eyi = new dxl("Client Name", "Astralis");
      var10003 = 30426;
      var10004 = 3499050402520734820L ^ a;
      a.gle = new bes("Speed", 100.0F, 1.0F, 300.0F, 1.0F);
      var10003 = 5328;
      var10004 = 6412591139478339142L ^ a;
      short var39 = 14779;
      var10005 = 8702331698489152315L ^ a;
      a.aht = new epo("Gif", "astralis/dancing-random.gif");
      var10003 = 3899;
      var10004 = 8724469202116699546L ^ a;
      short var61 = 16584;
      long var67 = 1557622547559253344L ^ a;
      var10007 = 11326;
      long var93 = 5313565316450314643L ^ a;
      a.ehf = new acn("First Color", new Color(78, 73, e<"g">(6371, 2444350526766275904L ^ a)));
      var10003 = 4094;
      var10004 = 8772322090949109111L ^ a;
      short var62 = 16356;
      long var69 = 4890324074624350795L ^ a;
      a.aoz = new acn("Second Color", new Color(-16764448));
      var10003 = 14194;
      var10004 = 7611777409241374167L ^ a;
      a.fug = new bes("Background Alpha", 150.0F, 1.0F, 255.0F, 5.0F);
      a.brd = new cbm();
      a.gzk = new HashMap<>();
      a.gdj = 0;
      a.bpz = null;
      short var10001 = 4030;
      long var10002 = 2662483890869946887L ^ a;
      ffn[] var3 = new ffn[]{a.btt, a.dud, a.fxw, a.ecd, a.ahf, a.eqi, null, null, null, null, null, null, null, null};
      var10003 = 19344;
      var10004 = 7774588450400833076L ^ a;
      var3[6] = a.hjj;
      var10003 = 670;
      var10004 = 3247614916371334950L ^ a;
      var3[7] = a.dxi.bih(() -> {
         long ax = ezv.a ^ 139161828650923L;
         short var10001x = 32631;
         long var10002x = 5062873282629666967L ^ ax;
         return a.hjj.emb("Sense");
      });
      var3[e<"g">(5643, 8629647210606318505L ^ a)] = a.gle.bih(() -> {
         long ax = ezv.a ^ 31181456646795L;
         int[] var3x = dar.abu();
         short var10001x = 18660;
         long var10002x = 203683374179316238L ^ ax;
         boolean var10000 = a.hjj.emb("PSD");
         if (var3x != null) {
            if (!var10000) {
               var10001x = 5328;
               var10002x = 6412656450956209688L ^ ax;
               var10000 = a.hjj.emb("Gif");
               if (var3x == null) {
                  return var10000;
               }

               if (!var10000) {
                  return false;
               }
            }

            var10000 = true;
         }

         return var10000;
      });
      var10003 = 10712;
      var10004 = 1435813164146650237L ^ a;
      var3[9] = a.aht.bih(() -> {
         long ax = ezv.a ^ 55198847193667L;
         short var10001x = 5328;
         long var10002x = 6412698679141261008L ^ ax;
         return a.hjj.emb("Gif");
      });
      var10003 = 22592;
      var10004 = 5722294880845602300L ^ a;
      var3[10] = a.eyi;
      var10003 = 22859;
      var10004 = 816962417666301157L ^ a;
      var3[11] = a.ehf;
      var10003 = 23613;
      var10004 = 3923001540366014851L ^ a;
      var3[12] = a.aoz;
      var10003 = 18489;
      var10004 = 770257311156473226L ^ a;
      var3[13] = a.fug;
      a.bfi(var3);
      var10003 = 9535;
      var10004 = 934158267289161651L ^ a;
      a.grl = new env("Watermark", 5.0F, 5.0F, 100.0F, 50.0F);
      fjk.bfv.add(a.grl);
   }

   @Override
   public void auj() {
      super.auj();
   }

   @gdz(4)
   public void goj(ctt event) {
      long ax = ezv.a ^ 135293710281702L;
      int[] var10000 = dar.abu();
      a.efe(a.hjj.dnp());
      int[] axx = var10000;
      String var37 = a.ahf.dnp();
      int var10001 = 10712;
      long var10002 = 1435843005521442126L ^ ax;
      fll axxx = bxc.emc(var37, 9);
      class_1041 axxxx = chi.method_22683();
      var10000 = (int[])chi.field_1755;
      if (axx != null) {
         if (!(chi.field_1755 instanceof class_408)) {
            String var39 = aml.hjr.eus();
            var10001 = aml.hjr.cfs();
            double axxxxx = evd.glu();
            int axxxxxx = var10001;
            String axxxxxxx = var39;
            short var40 = 7793;
            long var55 = 8917718355008073204L ^ ax;
            short var74 = 16564;
            long var10003 = 5666643433892246285L ^ ax;
            short var10004 = 6699;
            long var10005 = 530280622911924641L ^ ax;
            String axxxxxxxx = "User: " + axxxxxxx + " (" + axxxxxx + ") BPS: " + axxxxx;
            fuv.dfe(cbl, axxxxxxxx, 5.0F, axxxx.method_4502() - (cbl.biu(axxxxxxxx) + 5.0F), dar.gqy().deo(), dar.gqy().cxj(), true);
         }

         var10000 = (int[])a.hjj.dnp();
      }

      String var31 = (String)var10000;
      byte var8 = -1;
      var41 = var31.hashCode();
      label206:
      if (axx != null) {
         switch (var41) {
            case 2603341:
               short var56 = 25934;
               var10002 = 8978157706831550189L ^ ax;
               var41 = var31.equals("Text");
               if (axx == null) {
                  break label206;
               }

               if (var41 == 0) {
                  break;
               }

               var8 = 0;
               if (axx != null) {
                  break;
               }
            case 71588:
               short var57 = 5328;
               var10002 = 6412618197730830197L ^ ax;
               var41 = var31.equals("Gif");
               if (axx == null) {
                  break label206;
               }

               if (var41 == 0) {
                  break;
               }

               var8 = 1;
               if (axx != null) {
                  break;
               }
            case 1956520879:
               short var58 = 24495;
               var10002 = 3121948374747048978L ^ ax;
               var41 = var31.equals("Adjust");
               if (axx == null) {
                  break label206;
               }

               if (var41 == 0) {
                  break;
               }

               var8 = 2;
               if (axx != null) {
                  break;
               }
            case -268477211:
               short var59 = 20951;
               var10002 = 5039326750740374129L ^ ax;
               var41 = var31.equals("Astralis");
               if (axx == null) {
                  break label206;
               }

               if (var41 == 0) {
                  break;
               }

               var8 = 3;
               if (axx != null) {
                  break;
               }
            case 79770510:
               short var60 = 32631;
               var10002 = 5062879344526052570L ^ ax;
               var41 = var31.equals("Sense");
               if (axx == null) {
                  break label206;
               }

               if (var41 != 0) {
                  var8 = 4;
               }
         }

         var41 = var8;
      }

      label215: {
         switch (var41) {
            case 0:
               short var42 = 6382;
               long var61 = 1374511178617465668L ^ ax;
               short var62 = 11401;
               var10002 = 7735350130253246469L ^ ax;
               fll axxxxx = bxc.emc("Product Sans Bold", 20);
               String axxxxxx = a.eyi.dnp();
               fuv.dfe(axxxxx, axxxxxx, 3.0F, 3.0F, dar.gqy().deo(), dar.gqy().cxj(), false);
               if (axx != null) {
                  return;
               }
            case 1:
               try {
                  String[] axxxxxxx = hee.asu(a.aht.dnp());
                  a.bpz = new String[axxxxxxx.length];
                  int axxxxxxxx = 0;

                  while (axxxxxxxx < axxxxxxx.length) {
                     String axxxxxxxxx = chi.field_1697.getAbsolutePath() + "/" + axxxxxxx[axxxxxxxx];
                     a.bpz[axxxxxxxx] = axxxxxxxxx;
                     axxxxxxxx++;
                     if (axx == null || axx == null) {
                        break;
                     }
                  }
               } catch (IOException var30) {
                  var30.printStackTrace();
               }

               ezv var43 = a;
               if (axx != null) {
                  if (a.brd.fsc(a.gle.dnp().longValue())) {
                     label219: {
                        a.gdj++;
                        int var44 = a.gdj;
                        if (axx != null) {
                           if (a.gdj > a.bpz.length - 1) {
                              a.gdj = 0;
                           }

                           ard = a.bpz[a.gdj];
                           var45 = a;
                           if (axx == null) {
                              break label219;
                           }

                           var44 = a.gzk.containsKey(ard);
                        }

                        if (var44 == 0) {
                           a.gzk.put(ard, hcu.fbz(ard));
                        }

                        var45 = a;
                     }

                     var45.brd.glr();
                  }

                  var43 = a;
               }

               dmp.dzr(var43.grl.grp(), a.grl.azb(), 80.0F, 80.0F, a.gzk.get(ard), null);
               if (axx != null) {
                  return;
               }
            case 2:
               fuv.fhp(euz, "A", a.grl.grp(), a.grl.azb(), 0.0F, dar.gqy().deo(), dar.gqy().cxj(), true);
               short var63 = 24407;
               var10002 = 7823164948253699291L ^ ax;
               enh.aof("djust", a.grl.grp() + euz.eq("A"), a.grl.azb(), Color.white);
               if (axx != null) {
                  return;
               }
            case 3:
               break;
            case 4:
               break label215;
            default:
               return;
         }

         label145: {
            var46 = String.valueOf(class_124.field_1068);
            class_310 var64 = chi;
            if (axx != null) {
               if (chi.method_1542()) {
                  short var66 = 18512;
                  var10002 = 8786662940460121062L ^ ax;
                  var65 = "none";
                  break label145;
               }

               var64 = chi;
            }

            var65 = a(var64.method_1558().field_3761);
         }

         int var83 = chi.method_47599();
         String axxxxx = aml.hjr.eus();
         int axxxxxx = var83;
         String axxxxxxx = var65;
         String var29 = var46;
         short var47 = 20897;
         long var67 = 183403342001136168L ^ ax;
         short var84 = 9943;
         long var92 = 1524536140919969120L ^ ax;
         short var103 = 23319;
         long var113 = 151930754626513068L ^ ax;
         short var10006 = 24822;
         long var10007 = 7904483316225168244L ^ ax;
         String axxxxxxxx = "Astralis " + var29 + "1.15 - " + axxxxxxx + " - FPS " + axxxxxx + " - " + axxxxx;
         float axxxxxxxxx = axxx.eq(axxxxxxxx) + 6.0F;
         float var48 = a.grl.grp();
         float var68 = a.grl.azb();
         Color var114 = dar.gqy().deo();
         Color var119 = dar.gqy().cxj();
         short var10014 = 21767;
         long var10015 = 952595748988373385L ^ ax;
         dmp.hbm(var48, var68, axxxxxxxxx, 18.0F, 3.0F, var114, var119, false, 1.5F, new Color(0, 0, 0, 100));
         axxx.ebb(axxxxxxxx, a.grl.grp() + 3.5F, a.grl.azb() + 3.0F, dar.gqy().deo());
         if (axx != null) {
            return;
         }
      }

      String axxxxx;
      String var36;
      label134: {
         String var49 = a.eyi.dnp();
         short var69 = 18019;
         var10002 = 7984477031628895728L ^ ax;
         var36 = "§f" + var49;
         short var50 = 32631;
         long var70 = 5062879344526052570L ^ ax;
         axxxxx = "Sense";
         var51 = dar.dul;
         class_310 var71 = chi;
         if (axx != null) {
            if (chi.method_1542()) {
               var69 = 28059;
               var10002 = 7942119427746913829L ^ ax;
               var72 = "none";
               break label134;
            }

            var71 = chi;
         }

         var72 = a(var71.method_1558().field_3761);
      }

      short var87 = 10017;
      long var93 = 6538495771325371574L ^ ax;
      short var94 = 3015;
      long var104 = 9133977170124060764L ^ ax;
      String axxxxxx = " §f- (§7" + var51 + "§f) - " + var72;
      float axxxxxxx = axxx.eq(var36);
      float axxxxxxxx = axxx.eq(axxxxx);
      float axxxxxxxxx = axxx.eq(axxxxxx);
      float axxxxxxxxxx = axxxxxxx + axxxxxxxx + axxxxxxxxx + 4.5F;
      Color var52;
      if (!a.dxi.dnp()) {
         short var88 = 30038;
         var93 = 8920704988842027474L ^ ax;
         short var96 = 3128;
         var104 = 7676235796400017598L ^ ax;
         short var106 = 20180;
         long var115 = 1582815668524896845L ^ ax;
         var52 = new Color(59, 57, 57).darker();
      } else {
         short var89 = 5180;
         var93 = 7807151217322133689L ^ ax;
         short var98 = 20180;
         var104 = 1582815668524896845L ^ ax;
         short var108 = 20180;
         long var116 = 1582815668524896845L ^ ax;
         var52 = new Color(59, 57, 57);
      }

      Color axxxxxxxxxxx = var52;
      Color var53;
      if (a.dxi.dnp()) {
         short var90 = 25067;
         var93 = 2474142166557031785L ^ ax;
         short var100 = 29724;
         var104 = 6429766410947225749L ^ ax;
         short var110 = 24388;
         long var117 = 8299732635477001159L ^ ax;
         var53 = new Color(33, 29, 29);
      } else {
         short var91 = 3449;
         var93 = 4732250765752603110L ^ ax;
         short var102 = 312;
         var104 = 296054882123455935L ^ ax;
         short var112 = 312;
         long var118 = 296054882123455935L ^ ax;
         var53 = new Color(23, 23, 23);
      }

      Color axxxxxxxxxxxx = var53;
      float axxxxxxxxxxxxx = 4.0F;
      float axxxxxxxxxxxxxx = 3.0F;
      dmp.gst(axxxxxxxxxxxxx, axxxxxxxxxxxxxx, axxxxxxxxxx + 7.0F, 18.0F, axxxxxxxxxxx);
      dmp.gst(axxxxxxxxxxxxx + 1.0F, axxxxxxxxxxxxxx + 1.0F, axxxxxxxxxx + 6.0F, 17.0F, axxxxxxxxxxxx);
      dmp.gst(axxxxxxxxxxxxx + 1.5F, axxxxxxxxxxxxxx + 1.5F, axxxxxxxxxx + 5.5F, 16.5F, axxxxxxxxxxx);
      dmp.gst(axxxxxxxxxxxxx + 2.5F, axxxxxxxxxxxxxx + 2.5F, axxxxxxxxxx + 4.5F, 15.5F, axxxxxxxxxxxx);
      dmp.gmg(axxxxxxxxxxxxx + 2.5F, 15.0F, axxxxxxxxxx + 4.5F, 15.0F, a.ehf.dnp(), a.aoz.dnp());
      axxx.ebb(var36, 8.0F, 4.5F, dar.gqy().deo());
      fuv.fhp(axxx, axxxxx, 8.0F + axxxxxxx, 4.5F, 0.0F, dar.gqy().deo(), dar.gqy().cxj(), false);
      axxx.ebb(axxxxxx, 8.0F + axxxxxxx + axxxxxxxx, 4.5F, dar.gqy().deo());
   }

   public static String a(String serverIp) {
      long ax = ezv.a ^ 39484102665257L;
      int[] var10000 = dar.abu();
      short var10001 = 10432;
      long var10002 = 7299484808273122472L ^ ax;
      String axx = "liquidproxy.net";
      int[] axxx = var10000;
      String var6 = a;
      if (axxx != null) {
         if (a == null) {
            return null;
         }

         var6 = a;
      }

      if (axxx != null) {
         if (var6.endsWith(axx)) {
            int axxxx = a.lastIndexOf(axx);
            String var7 = a.substring(axxxx);
            var10001 = 32287;
            var10002 = 370581695326192224L ^ ax;
            return "***" + var7;
         }

         var6 = a;
      }

      return var6;
   }

   public static Color gbq(long ms, int offset, float saturation, float brightness) {
      return new Color(Color.HSBtoRGB((float)((System.currentTimeMillis() + a) % a) / (float)a, a, a));
   }

   public static Color cku(int offset, float saturation, float brightness) {
      long ax = ezv.a ^ 13760034854277L;
      return gbq(v, a, a, a);
   }

   public int bfl() {
      long a = ezv.a ^ 104071507122341L;
      int[] ax = dar.abu();
      class_634 var10000 = chi.method_1562();
      if (ax != null) {
         if (var10000 == null) {
            return -1;
         }

         var10000 = chi.method_1562();
      }

      class_640 axx = var10000.method_2871(chi.field_1724.method_5667());
      if (ax == null) {
         return axx.method_2959();
      } else {
         return axx != null ? axx.method_2959() : -1;
      }
   }

   static {
      long var16 = a ^ 82509626395380L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var19 = 1; var19 < 8; var19++) {
         var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[58];
      int var23 = 0;
      String var22 = "\f?\u0001Ùcf\u008c \u00830|^¨q\u0087k\u0010\u001f¬>\u0089;½uÈô ä\u0013¿U¡P 1÷\u0097¼ÜQÜÍ+1ãÔf\u000b\u0002â*#2^f\u001dÞ¸YÐLGn÷0C(É\u0003Ñ¹}*T;ú\u001cõ\u0080viBð$\u0011»\u0090äVÚ\u0081#Û%èð·\u001fL5+Y\n½É8I\u0018\u0001^Éâ\u0099\nÓ@ Aý:0u#\u001dlh¶\u009fnyjú 80Ç:\u0096¿á3¹Âµ\u008b1ï\u001caüÔìzµxd\u0001¾Ì\u008c\u0084<\u001dËp\u0010`\u0082¤J\u0080\u009d\u000e\u001e\u009a¿\u001en1\u001d\u007ft\u0010\u0005|:\u009b6l×\u0089ÞÁ\u000eÞ`Ï`r(\u0091ç35b\u007fí\u0083l[\u0092\u0012ÿ\u0087û¸ß\föÙôtm\fÌJ{zM\u000b\u0001\u009a_\n\u00167D\u0091q¬ 1\u0096Yð\\±g´4Ðë\u008c\u0084îg\t\u0004¸^,_jè\u00958dªø¿Xf\u009f(Þ\u0085ßn\\Ô$¬¡\b\u0085 ;\u0006\u0097ÒOÿ\u0093\u0082\u008c?£É\u0015içî\u0006\u001f\u0013äÖôÏòVô\u00030\u0010X\u009aô¬8\u008dI\u0006wOJZào©\u0014\u0010©P,k2Q-\u008b'¥ó+¨ÿ¬t\u0010ì\u0089ßOÌ^æÜBf>Ô\u008a\u0010«D\u0010\u0001_tuc\u0086b\u0090\u0015÷¡'|4\u008b*\u0010-éÚF\f>«ÑÚÍMs}p»\u0019 à%\u0000\u000eÖôÔóæaÐgL0óõ\u0090\u009böãª\u0081Ç¿\u008eik\u000e\u000fÇi\u00880<¼]IB&\u00916ý\u0019\u0083\u0087\u00850=*·\u0017Í\u007f ±Pã\u008bSZÔ·\u0007n²Vj!&³´\u0011TQ\u001d=]q¢\u0093:\u0010\u000b\u0002\u0088°ßÊýy\u0083\u0096°$¡ÿá^\u0010\u0098è\u009a\u0003\u001e\u00842\u00988ùz\u0094\u0003r\u0016k\u0010?Á\u000f\u0089.Ì-Û\u009d\\¿i,\u0001Ä\u0019\u0010¼©\u009aÚý\u009b\u008b°:írª\u009c\u0092\\\n(6cC#\n@s®gz\"2a>ï\u008a+ý rm\u000e6î\u0088\u0005dÀ{¯Ø$¯d`UEA¼t Að=\u009e\u0014üc\u001câ¦y¥½Êá¸*ô¯}\u008dfàsX&ù\u0010uí\u009a² Eû´\u00adýË`\u0087\u008d@)q\u008fÅ{\u00adwº}£k+-m\u000ee\u008eàVwÐ\t\u0010ûá{\\Æ^?Z\\Ä\u009fÏ\u0003èËÒ\u0010ÐÅ\"yÌÿéÃÏqnwMI~'\u0010\u0091\u0004\u0011X^\u0015;«|S\u0000ó\u0000©/u\u0010\u008c;ípe\u0084ß\u0005a,R¼y®Pº \u001düæ\u0087ÂÀ\u0001L*!Åfq;\u0018M\u0018\u0006s§\u007fd\u0001\nc0ïVÉaØæ\u0010¥Ãâ¤×:\u00ad\u0090¾D\u009ee\u0087^b[\u0010ùÌW\u0007`.\"C{£&\u0002TÂM\u0088\u001062´C´û\u000bû\u0019WSèÏfà\u00ad\u0010Ì]q\u001e\tÔvöÖ<Í`\u0080Q¦ð(\u0082Å\rx\u009c@1.Sð\u0098\u0086¬\u0089)'L\u0089\u000b{¥\u001cÁy\u009cÂ\u0007vLE\u0010B\u009e²C\u009b¡ì\u0002\u007f\u0018ðà?9°¸²\u001bù[\u008fT\u0090\t)ÙÀ¯ÐH\b\u008c^\u000e(#\r^ÿÜ\u0015\r®\u0001¢Á\u008bCò\u001fN¤|à\u0005Ë\u0014\u0096\u0012r!k\u0086\u0001ü\u0096UéØ\u000eßPø\b\u0010\u0010\u0011Æ\u0097]\u0089{I®<S½\u008f<<Åu\u0018?(±0¥\"üÓBby\u0011\u0015CT\u009el#\u0019\u0015ûM\u0017\u0084\u0010\u0083Ï\u0010;J$S\u000f{\u007fu'i\u001e9S\u0010} \u0099÷Â\u0003\u0098cKà\u001e\u0083¤.[õ\u0018¾Ã±l5\u000eshÝ\u0092J1\u000bBÙCSÒ\u0017\u0085\u001aé\u0089Æ\u0010Y[Ù^Ü \u0098ml°Á\u0001îËØÚ \u009d5\u009c\u009dS\u0099èÝë\u009d\u0014Ì×+\u0014\u0014\u0015hg\u009cPQ#ü\u000b\u0091\u0001\u0002NMR! «&6 ïª°\rS\u001d7>Ù<\u008d\u0087nÕ\u007f\u001aô\u0099\u0083O¾ßÑ\u0094X®\u000f\u0096\u0010tþö\u0016Ãv8PºWèá^(!®\u0010\u0012o£-ôlæYøZG\u009c¿F¤\r\u0010\u009béî\u0003ý\u0088VÞ&goã£_\u001d>\u0018®Ø\u0007ò Yµ\u0085\u0092¥\u0012¥^ù\u0005ú\u009bjÄ$(0\u009d»\u0010\u00adJï;\u0094ø\u0017NH¾\u0096Á`\u000bêg \u001e´½\u0007Úô.³K¶ëmüùa\u0092<s-ðXI¤÷VëH\u0081B!\u001b¹\u0010õ\u0014ì&&aÈ\u009eÿÍ9\u0089(û\u001dA(D\u009c\u0019\u001f×S\u009bç\u0012Liùû\\ik\rÅ\u001bSö:Ï\u0086è\u001a\u00adJ6w§ÔÚ5Z\u0094a\u0098\u0019É a\u001b\\\u0094\u007f\u000byzW\u00884¡^\u0080£¼A*UÃ\u0098À3»\bß\u0014¾\u0096ù1t =x\u0010\u007f|6y#»±Ü´º\n\u008eGßÒu5]£z\u0090iFö¡Ræ\tÿ )>Îd\u0004\u0004½ò?vj¶µ+þ¢Ó\f]~1ÀkÃ1Â\r\u0014\u0091\\ÞÏ";
      int var24 = "\f?\u0001Ùcf\u008c \u00830|^¨q\u0087k\u0010\u001f¬>\u0089;½uÈô ä\u0013¿U¡P 1÷\u0097¼ÜQÜÍ+1ãÔf\u000b\u0002â*#2^f\u001dÞ¸YÐLGn÷0C(É\u0003Ñ¹}*T;ú\u001cõ\u0080viBð$\u0011»\u0090äVÚ\u0081#Û%èð·\u001fL5+Y\n½É8I\u0018\u0001^Éâ\u0099\nÓ@ Aý:0u#\u001dlh¶\u009fnyjú 80Ç:\u0096¿á3¹Âµ\u008b1ï\u001caüÔìzµxd\u0001¾Ì\u008c\u0084<\u001dËp\u0010`\u0082¤J\u0080\u009d\u000e\u001e\u009a¿\u001en1\u001d\u007ft\u0010\u0005|:\u009b6l×\u0089ÞÁ\u000eÞ`Ï`r(\u0091ç35b\u007fí\u0083l[\u0092\u0012ÿ\u0087û¸ß\föÙôtm\fÌJ{zM\u000b\u0001\u009a_\n\u00167D\u0091q¬ 1\u0096Yð\\±g´4Ðë\u008c\u0084îg\t\u0004¸^,_jè\u00958dªø¿Xf\u009f(Þ\u0085ßn\\Ô$¬¡\b\u0085 ;\u0006\u0097ÒOÿ\u0093\u0082\u008c?£É\u0015içî\u0006\u001f\u0013äÖôÏòVô\u00030\u0010X\u009aô¬8\u008dI\u0006wOJZào©\u0014\u0010©P,k2Q-\u008b'¥ó+¨ÿ¬t\u0010ì\u0089ßOÌ^æÜBf>Ô\u008a\u0010«D\u0010\u0001_tuc\u0086b\u0090\u0015÷¡'|4\u008b*\u0010-éÚF\f>«ÑÚÍMs}p»\u0019 à%\u0000\u000eÖôÔóæaÐgL0óõ\u0090\u009böãª\u0081Ç¿\u008eik\u000e\u000fÇi\u00880<¼]IB&\u00916ý\u0019\u0083\u0087\u00850=*·\u0017Í\u007f ±Pã\u008bSZÔ·\u0007n²Vj!&³´\u0011TQ\u001d=]q¢\u0093:\u0010\u000b\u0002\u0088°ßÊýy\u0083\u0096°$¡ÿá^\u0010\u0098è\u009a\u0003\u001e\u00842\u00988ùz\u0094\u0003r\u0016k\u0010?Á\u000f\u0089.Ì-Û\u009d\\¿i,\u0001Ä\u0019\u0010¼©\u009aÚý\u009b\u008b°:írª\u009c\u0092\\\n(6cC#\n@s®gz\"2a>ï\u008a+ý rm\u000e6î\u0088\u0005dÀ{¯Ø$¯d`UEA¼t Að=\u009e\u0014üc\u001câ¦y¥½Êá¸*ô¯}\u008dfàsX&ù\u0010uí\u009a² Eû´\u00adýË`\u0087\u008d@)q\u008fÅ{\u00adwº}£k+-m\u000ee\u008eàVwÐ\t\u0010ûá{\\Æ^?Z\\Ä\u009fÏ\u0003èËÒ\u0010ÐÅ\"yÌÿéÃÏqnwMI~'\u0010\u0091\u0004\u0011X^\u0015;«|S\u0000ó\u0000©/u\u0010\u008c;ípe\u0084ß\u0005a,R¼y®Pº \u001düæ\u0087ÂÀ\u0001L*!Åfq;\u0018M\u0018\u0006s§\u007fd\u0001\nc0ïVÉaØæ\u0010¥Ãâ¤×:\u00ad\u0090¾D\u009ee\u0087^b[\u0010ùÌW\u0007`.\"C{£&\u0002TÂM\u0088\u001062´C´û\u000bû\u0019WSèÏfà\u00ad\u0010Ì]q\u001e\tÔvöÖ<Í`\u0080Q¦ð(\u0082Å\rx\u009c@1.Sð\u0098\u0086¬\u0089)'L\u0089\u000b{¥\u001cÁy\u009cÂ\u0007vLE\u0010B\u009e²C\u009b¡ì\u0002\u007f\u0018ðà?9°¸²\u001bù[\u008fT\u0090\t)ÙÀ¯ÐH\b\u008c^\u000e(#\r^ÿÜ\u0015\r®\u0001¢Á\u008bCò\u001fN¤|à\u0005Ë\u0014\u0096\u0012r!k\u0086\u0001ü\u0096UéØ\u000eßPø\b\u0010\u0010\u0011Æ\u0097]\u0089{I®<S½\u008f<<Åu\u0018?(±0¥\"üÓBby\u0011\u0015CT\u009el#\u0019\u0015ûM\u0017\u0084\u0010\u0083Ï\u0010;J$S\u000f{\u007fu'i\u001e9S\u0010} \u0099÷Â\u0003\u0098cKà\u001e\u0083¤.[õ\u0018¾Ã±l5\u000eshÝ\u0092J1\u000bBÙCSÒ\u0017\u0085\u001aé\u0089Æ\u0010Y[Ù^Ü \u0098ml°Á\u0001îËØÚ \u009d5\u009c\u009dS\u0099èÝë\u009d\u0014Ì×+\u0014\u0014\u0015hg\u009cPQ#ü\u000b\u0091\u0001\u0002NMR! «&6 ïª°\rS\u001d7>Ù<\u008d\u0087nÕ\u007f\u001aô\u0099\u0083O¾ßÑ\u0094X®\u000f\u0096\u0010tþö\u0016Ãv8PºWèá^(!®\u0010\u0012o£-ôlæYøZG\u009c¿F¤\r\u0010\u009béî\u0003ý\u0088VÞ&goã£_\u001d>\u0018®Ø\u0007ò Yµ\u0085\u0092¥\u0012¥^ù\u0005ú\u009bjÄ$(0\u009d»\u0010\u00adJï;\u0094ø\u0017NH¾\u0096Á`\u000bêg \u001e´½\u0007Úô.³K¶ëmüùa\u0092<s-ðXI¤÷VëH\u0081B!\u001b¹\u0010õ\u0014ì&&aÈ\u009eÿÍ9\u0089(û\u001dA(D\u009c\u0019\u001f×S\u009bç\u0012Liùû\\ik\rÅ\u001bSö:Ï\u0086è\u001a\u00adJ6w§ÔÚ5Z\u0094a\u0098\u0019É a\u001b\\\u0094\u007f\u000byzW\u00884¡^\u0080£¼A*UÃ\u0098À3»\bß\u0014¾\u0096ù1t =x\u0010\u007f|6y#»±Ü´º\n\u008eGßÒu5]£z\u0090iFö¡Ræ\tÿ )>Îd\u0004\u0004½ò?vj¶µ+þ¢Ó\f]~1ÀkÃ1Â\r\u0014\u0091\\ÞÏ"
         .length();
      char var21 = 16;
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
                     h = new String[58];
                     r = new HashMap(13);
                     Cipher var5;
                     var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var6 = 1; var6 < 8; var6++) {
                        var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var11 = new long[30];
                     int var8 = 0;
                     String var9 = "\u009dí.×·#'ñòè\u0005\u0089\u008c(^Û Ç\u001eÌEç'\u000eÜjï\u0017\u009aÄ\u0087a\fck}Ò±kí'½²à\u001c¨~/\u008dØß\u009f®\u0098U\u001b\u008dj4°\u008b\u0013Ó\u0080\u0002\\Ùl,ëøâ,\u0017Éóõ\u0014æÍ\u009e <ûæ\u0084R\u008a.\u0016*\u0018õpö=±z\u0011&M¢\u009f\u0099ý\u0000é\u0080hÕC\u0087F°\u000e ¢n\u0004O«JzÄ\u0003~\t\u009e\u008d\u0015\u0011\u0015Ì{ê,Í\u0010\u001dTæ¶\u0011¿\u0010\u0082|&«N\u0005IKZ\u008du\u008d\u0085/#í\u0096ÕY\u0081a\u0084\u008f\ná%?±.'Ka?öÙ,èJPµ\u0092.ø?BèØ;Ó]\u0016\u007f8ª\u001dèWdÎR\u008e\nâkÏÚkw\u001e`ý°\u0001Jg¡ã1ô";
                     int var10 = "\u009dí.×·#'ñòè\u0005\u0089\u008c(^Û Ç\u001eÌEç'\u000eÜjï\u0017\u009aÄ\u0087a\fck}Ò±kí'½²à\u001c¨~/\u008dØß\u009f®\u0098U\u001b\u008dj4°\u008b\u0013Ó\u0080\u0002\\Ùl,ëøâ,\u0017Éóõ\u0014æÍ\u009e <ûæ\u0084R\u008a.\u0016*\u0018õpö=±z\u0011&M¢\u009f\u0099ý\u0000é\u0080hÕC\u0087F°\u000e ¢n\u0004O«JzÄ\u0003~\t\u009e\u008d\u0015\u0011\u0015Ì{ê,Í\u0010\u001dTæ¶\u0011¿\u0010\u0082|&«N\u0005IKZ\u008du\u008d\u0085/#í\u0096ÕY\u0081a\u0084\u008f\ná%?±.'Ka?öÙ,èJPµ\u0092.ø?BèØ;Ó]\u0016\u007f8ª\u001dèWdÎR\u008e\nâkÏÚkw\u001e`ý°\u0001Jg¡ã1ô"
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
                                    q = new Integer[30];
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long var2 = -3309789110414999342L;
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
                                    ard = null;
                                    return;
                                 }
                                 break;
                              default:
                                 var33[var10001] = var55;
                                 if (var7 < var10) {
                                    continue label46;
                                 }

                                 var9 = "6Cî\u0005ö\u001a\u000f×á\u0016W\u0012p\u0017¯¢";
                                 var10 = "6Cî\u0005ö\u001a\u000f×á\u0016W\u0012p\u0017¯¢".length();
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

                  var22 = "ù3-\u0083Ó\u000e9ið\u0096ÛÔ\u0084¡Lz\u0010\u0017\u009cj\u0082a¿Ê\u0003YÅÝr]`ß´";
                  var24 = "ù3-\u0083Ó\u000e9ið\u0096ÛÔ\u0084¡Lz\u0010\u0017\u009cj\u0082a¿Ê\u0003YÅÝr]`ß´".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9911;
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
            throw new RuntimeException("cc/astralis/ezv", var10);
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
         throw new RuntimeException("cc/astralis/ezv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2457;
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
            throw new RuntimeException("cc/astralis/ezv", var14);
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
         throw new RuntimeException("cc/astralis/ezv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
