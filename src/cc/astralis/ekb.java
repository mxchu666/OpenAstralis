package cc.astralis;

import astralis.mixin.accessor.KeyBindingAccessor;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1268;
import net.minecraft.class_1294;
import net.minecraft.class_1309;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_2846;
import net.minecraft.class_2868;
import net.minecraft.class_2886;
import net.minecraft.class_3489;
import net.minecraft.class_3532;
import net.minecraft.class_3966;
import net.minecraft.class_746;
import net.minecraft.class_9836;
import net.minecraft.class_2846.class_2847;

public class ekb extends guu {
   private final adu asa;
   private final gbp bt;
   private final bes ezs;
   private final bes flh;
   public final bes ejq;
   public gbp boi;
   public final bes bjd;
   public adu dhq;
   private final gbp djf;
   private final gbp esi;
   private final gbp can;
   private final gbp cel;
   private final gbp bdd;
   private final adu bcj;
   private final bes gfr;
   private final bes cbe;
   private final bes dbv;
   private final bes aud;
   private final gbp bsp;
   private final ale gbw;
   public bes esx;
   private final bes fuf;
   private final bes bgu;
   private final bes ghi;
   private final bes ffp;
   private final gbp dnl;
   private final gbp cbu;
   public bes ecs;
   public bes cun;
   private final adu cdm;
   private final gbp exp;
   private final gbp fjt;
   private final gbp dv;
   private final gbp fzp;
   private final gbp aps;
   private final gbp gln;
   private final gbp fwx;
   private final bes dfg;
   public class_1309 gvw;
   public List<class_1309> bfx;
   private final cbm auf;
   private final cbm acr;
   private float[] bbh;
   public boolean exv;
   public boolean heb;
   private boolean bzo;
   private int asl;
   private int cye;
   private int dan;
   private final cbm atx;
   private final cbm aap;
   private double fzz;
   private double dxb;
   private float dra;
   private float cmc;
   private float col;
   private float eqv;
   private float arn;
   private float gha;
   private static String[] gbb;
   private static final long a = 104499179569616L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;
   private static final long[] v;
   private static final Long[] w;
   private static final Map x;

   public ekb() {
      long a = ekb.a ^ 57519750087815L;
      super(bfm.COMBAT);
      short var10003 = 25365;
      long var10004 = 4652226120011216875L ^ a;
      short var55 = 30800;
      long var10005 = 2258949485895576714L ^ a;
      String[] var124 = new String[2];
      short var10008 = 12938;
      long var10009 = 9005550021069612637L ^ a;
      var124[0] = "Single";
      var10008 = 22779;
      var10009 = 3770980025177230388L ^ a;
      var124[1] = "Switch";
      a.asa = new adu("Aura Mode", "Single", var124);
      var10003 = 26501;
      var10004 = 5088547177930781515L ^ a;
      a.bt = new gbp("Ray Cast", false);
      var10003 = 22225;
      var10004 = 2895727058876776963L ^ a;
      a.ezs = new bes("Switch Delay", 200.0F, 0.0F, 5000.0F, 1.0F);
      var10003 = 16610;
      var10004 = 3048947493778904084L ^ a;
      a.flh = new bes("Scout Range", 3.0F, 0.0F, 6.0F, 0.1F);
      var10003 = 16426;
      var10004 = 6320906664041075938L ^ a;
      a.ejq = new bes("Attack Range", 3.0F, 0.0F, 6.0F, 0.1F);
      dar.abu();
      short var60 = 5618;
      var10005 = 5404390794833232149L ^ a;
      a.boi = new gbp("Auto Block", false);
      short var61 = 2730;
      var10005 = 1727639222781943364L ^ a;
      a.bjd = new bes("Block Range", 3.0F, 0.0F, 6.0F, 0.1F);
      short var62 = 27197;
      var10005 = 1332895692805406414L ^ a;
      short var128 = 6312;
      long var10006 = 4578261339189808223L ^ a;
      short var146 = 25424;
      long var10007 = 5999558878932895298L ^ a;
      String[] var147 = new String[6];
      short var155 = 15871;
      long var10010 = 2257836482564172092L ^ a;
      var147[0] = "Vanilla";
      short var156 = 23548;
      var10010 = 7926161528625418005L ^ a;
      var147[1] = "None";
      short var157 = 23894;
      var10010 = 8491481706981214607L ^ a;
      var147[2] = "Blink";
      short var158 = 21404;
      var10010 = 6416859919247427418L ^ a;
      var147[3] = "Modern Watchdog";
      short var159 = 1666;
      var10010 = 2311008395379970631L ^ a;
      var147[4] = "Modern Watchdog Post";
      short var160 = 14755;
      var10010 = 1621947160891075959L ^ a;
      var147[5] = "Old Watchdog";
      a.dhq = new adu("Auto Block Mode", "Vanilla", var147);
      short var63 = 32538;
      var10005 = 5681337048352812010L ^ a;
      a.djf = new gbp("Blink", false);
      short var64 = 30944;
      var10005 = 827455539398896676L ^ a;
      a.esi = new gbp("Packet Auto Block", false);
      short var65 = 17598;
      var10005 = 5525274859486007379L ^ a;
      a.can = new gbp("Interact When Blocking", false);
      short var66 = 17505;
      var10005 = 3868445741157109891L ^ a;
      a.cel = new gbp("Force Block Hit Animation", false);
      short var67 = 23180;
      var10005 = 9036381496512532046L ^ a;
      a.bdd = new gbp("Rotations", true);
      short var68 = 26704;
      var10005 = 3589517832581840005L ^ a;
      short var135 = 30266;
      var10006 = 1374079942142845693L ^ a;
      String[] var149 = new String[3];
      short var161 = 8776;
      var10010 = 8048591478283974332L ^ a;
      var149[0] = "Off";
      short var162 = 4213;
      var10010 = 8431903297889076392L ^ a;
      var149[1] = "Snap";
      short var163 = 23048;
      var10010 = 2247997639380618964L ^ a;
      var149[2] = "MouseSim";
      a.bcj = (adu)new adu("Noise Mode", "Off", var149).bih(a.bdd::dnp);
      short var69 = 12263;
      var10005 = 615368200922774332L ^ a;
      a.gfr = (bes)new bes("Noise Yaw Multiplier", 0.08F, 0.01F, 0.5F, 0.01F).bih(() -> {
         long ax = ekb.a ^ 2236471153753L;
         int[] var3 = dar.abu();
         short var10001x = 4213;
         long var10002x = 8431887736755688566L ^ ax;
         boolean var10000 = a.bcj.emb("Snap");
         if (var3 != null) {
            if (!var10000) {
               var10001x = 23048;
               var10002x = 2247942356108500490L ^ ax;
               var10000 = a.bcj.emb("MouseSim");
               if (var3 == null) {
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
      short var70 = 18435;
      var10005 = 4918784399747439753L ^ a;
      a.cbe = (bes)new bes("Noise Pitch Multiplier", 0.02F, 0.01F, 0.3F, 0.01F).bih(() -> {
         long ax = ekb.a ^ 22961665098100L;
         int[] var3 = dar.abu();
         short var10001x = 12390;
         long var10002x = 8213316058764927337L ^ ax;
         boolean var10000 = a.bcj.emb("Snap");
         if (var3 != null) {
            if (!var10000) {
               var10001x = 31565;
               var10002x = 7933930881207020102L ^ ax;
               var10000 = a.bcj.emb("MouseSim");
               if (var3 == null) {
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
      short var71 = 18226;
      var10005 = 6811129819030442989L ^ a;
      a.dbv = (bes)new bes("Max Yaw Noise", 1.2F, 0.1F, 5.0F, 0.1F).bih(() -> {
         long ax = ekb.a ^ 104919077273976L;
         int[] var3 = dar.abu();
         short var10001x = 4213;
         long var10002x = 8431943963108098391L ^ ax;
         boolean var10000 = a.bcj.emb("Snap");
         if (var3 != null) {
            if (!var10000) {
               var10001x = 23048;
               var10002x = 2247884235667114795L ^ ax;
               var10000 = a.bcj.emb("MouseSim");
               if (var3 == null) {
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
      short var72 = 13345;
      var10005 = 8114773129526616288L ^ a;
      a.aud = (bes)new bes("Max Pitch Noise", 0.75F, 0.1F, 5.0F, 0.1F).bih(() -> {
         long ax = ekb.a ^ 122487083565523L;
         int[] var3 = dar.abu();
         short var10001x = 4213;
         long var10002x = 8431996717137723900L ^ ax;
         boolean var10000 = a.bcj.emb("Snap");
         if (var3 != null) {
            if (!var10000) {
               var10001x = 23048;
               var10002x = 2247901803044424576L ^ ax;
               var10000 = a.bcj.emb("MouseSim");
               if (var3 == null) {
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
      short var73 = 2213;
      var10005 = 463750085469674580L ^ a;
      a.bsp = new gbp("GCD Fix", false);
      short var74 = 24137;
      var10005 = 7837494242079296170L ^ a;
      a.gbw = new ale("Rotation Target", bgi.HEAD);
      short var75 = 28681;
      var10005 = 6381813968257279206L ^ a;
      a.esx = new bes("Rotation Range", 3.0F, 0.0F, 6.0F, 0.1F);
      short var76 = 5300;
      var10005 = 6812972072036728952L ^ a;
      a.fuf = new bes("Min Yaw Speed", 120.0F, 1.0F, 180.0F, 1.0F);
      var10003 = 15468;
      var10004 = 5219294021911947411L ^ a;
      a.bgu = new bes("Max Yaw Speed", 120.0F, 1.0F, 180.0F, 1.0F);
      var10003 = 245;
      var10004 = 648036180733236239L ^ a;
      a.ghi = new bes("Min Pitch Speed", 120.0F, 1.0F, 180.0F, 1.0F);
      var10003 = 16319;
      var10004 = 7015007756312324932L ^ a;
      a.ffp = new bes("Max Pitch Speed", 120.0F, 1.0F, 180.0F, 1.0F);
      var10003 = 25207;
      var10004 = 9149647864583550597L ^ a;
      a.dnl = new gbp("1.9+ CPS", false);
      var10003 = 21081;
      var10004 = 5778870194741364413L ^ a;
      a.cbu = new gbp("1.8 Swing Order", false);
      var10003 = 6891;
      var10004 = 2558398426147196448L ^ a;
      a.ecs = new bes("Min CPS", 10.0F, 0.0F, 20.0F, 1.0F);
      var10003 = 6735;
      var10004 = 4854893744295874207L ^ a;
      a.cun = new bes("Max CPS", 20.0F, 0.0F, 20.0F, 1.0F);
      var10003 = 21073;
      var10004 = 5172106939856307868L ^ a;
      short var85 = 8776;
      var10005 = 8048591478283974332L ^ a;
      String[] var145 = new String[3];
      var10008 = 8776;
      var10009 = 8048591478283974332L ^ a;
      var145[0] = "Off";
      var10008 = 24324;
      var10009 = 6812718354373561316L ^ a;
      var145[1] = "Normal";
      var10008 = 8881;
      var10009 = 7343145208807765602L ^ a;
      var145[2] = "Force";
      a.cdm = new adu("Wait for Crit", "Off", var145);
      var10003 = 6967;
      var10004 = 7466616952640245714L ^ a;
      a.exp = new gbp("Critical Sprint", false);
      var10003 = 14765;
      var10004 = 1197878455995739476L ^ a;
      a.fjt = new gbp("Through Walls", true);
      var10003 = 11412;
      var10004 = 6499590900719204469L ^ a;
      a.dv = new gbp("Ignore Teammates", true);
      var10003 = 8262;
      var10004 = 8761904378432402602L ^ a;
      a.fzp = new gbp("Monsters", true);
      short var21 = 111;
      var10004 = 6988904990229501082L ^ a;
      a.aps = new gbp("Animals", false);
      var21 = 21785;
      var10004 = 878323906321596865L ^ a;
      a.gln = new gbp("Invisible", false);
      var21 = 19334;
      var10004 = 6297799193176301420L ^ a;
      a.fwx = new gbp("ESP", false);
      var21 = 28460;
      var10004 = 3932214543222897638L ^ a;
      a.dfg = new bes("Esp Width", 0.8F, 0.0F, 10.0F, 0.1F);
      a.bfx = new ArrayList<>();
      a.auf = new cbm();
      a.acr = new cbm();
      a.bzo = false;
      a.asl = 0;
      a.cye = 0;
      a.dan = 0;
      a.atx = new cbm();
      a.aap = new cbm();
      a.fzz = 0.0;
      a.dxb = 0.0;
      a.dra = 0.0F;
      a.cmc = 0.0F;
      a.col = 0.0F;
      a.eqv = 0.0F;
      a.arn = 0.0F;
      a.gha = 0.0F;
      short var10001 = 30352;
      long var10002 = 2672347950934856588L ^ a;
      ffn[] var4 = new ffn[]{
         a.asa,
         a.bt,
         a.ezs.bih(() -> {
            long ax = ekb.a ^ 133335311178544L;
            short var10001x = 31820;
            long var10002x = 8388481932894910258L ^ ax;
            return a.asa.emb("Switch");
         }),
         a.flh,
         a.ejq,
         a.boi,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null
      };
      var21 = 23918;
      var10004 = 389072126747129966L ^ a;
      var4[6] = a.bjd.bih(a.boi::dnp);
      var21 = 20544;
      var10004 = 1492655248843715934L ^ a;
      var4[7] = a.dhq.bih(a.boi::dnp);
      var21 = 24922;
      var10004 = 7160138382089880642L ^ a;
      var4[8] = a.djf.bih(() -> {
         long ax = ekb.a ^ 132229609419692L;
         int[] var3 = dar.abu();
         short var10001x = 13692;
         long var10002x = 2240900754677225148L ^ ax;
         boolean var10000 = a.dhq.emb("Watchdog 2");
         if (var3 != null) {
            if (!var10000) {
               return false;
            }

            var10000 = a.boi.dnp();
         }

         if (var3 == null) {
            return var10000;
         } else {
            return var10000 ? true : false;
         }
      });
      var21 = 17982;
      var10004 = 5199729424430637874L ^ a;
      var4[9] = a.esi.bih(a.boi::dnp);
      var21 = 16017;
      var10004 = 4603877253517499269L ^ a;
      var4[10] = a.can.bih(a.boi::dnp);
      var21 = 7702;
      var10004 = 8695962118922992384L ^ a;
      var4[11] = a.cel.bih(a.boi::dnp);
      var21 = 4398;
      var10004 = 7398818802488243235L ^ a;
      var4[12] = a.bdd;
      var21 = 28161;
      var10004 = 9167343362656668416L ^ a;
      var4[13] = a.bsp.bih(a.bdd::dnp);
      var21 = 22376;
      var10004 = 1648876643597365874L ^ a;
      var4[14] = a.gbw.bih(a.bdd::dnp);
      var21 = 4072;
      var10004 = 617515323776559852L ^ a;
      var4[15] = a.esx.bih(a.bdd::dnp);
      var21 = 26671;
      var10004 = 8370672247831891254L ^ a;
      var4[16] = a.bcj;
      var21 = 14064;
      var10004 = 8257179477929677764L ^ a;
      var4[17] = a.gfr.bih(() -> {
         long ax = ekb.a ^ 37627143629101L;
         int[] var3 = dar.abu();
         short var10001x = 4213;
         long var10002x = 8431922713234090242L ^ ax;
         boolean var10000 = a.bcj.emb("Snap");
         if (var3 != null) {
            if (!var10000) {
               var10001x = 23048;
               var10002x = 2247977472441246590L ^ ax;
               var10000 = a.bcj.emb("MouseSim");
               if (var3 == null) {
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
      var21 = 23533;
      var10004 = 2713845485752598270L ^ a;
      var4[18] = a.cbe.bih(() -> {
         long ax = ekb.a ^ 63732934945894L;
         int[] var3 = dar.abu();
         short var10001x = 4213;
         long var10002x = 8431915833330543689L ^ ax;
         boolean var10000 = a.bcj.emb("Snap");
         if (var3 != null) {
            if (!var10000) {
               var10001x = 23048;
               var10002x = 2247982686893631029L ^ ax;
               var10000 = a.bcj.emb("MouseSim");
               if (var3 == null) {
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
      var21 = 8041;
      var10004 = 8102734198901766763L ^ a;
      var4[19] = a.dbv.bih(() -> {
         long ax = ekb.a ^ 89312239616164L;
         int[] var3 = dar.abu();
         short var10001x = 4213;
         long var10002x = 8431941415118504075L ^ ax;
         boolean var10000 = a.bcj.emb("Snap");
         if (var3 != null) {
            if (!var10000) {
               var10001x = 23048;
               var10002x = 2247886221015927543L ^ ax;
               var10000 = a.bcj.emb("MouseSim");
               if (var3 == null) {
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
      var21 = 17739;
      var10004 = 6240451477255692414L ^ a;
      var4[20] = a.aud.bih(() -> {
         long ax = ekb.a ^ 10215587474665L;
         int[] var3 = dar.abu();
         short var10001x = 4213;
         long var10002x = 8431897915155049670L ^ ax;
         boolean var10000 = a.bcj.emb("Snap");
         if (var3 != null) {
            if (!var10000) {
               var10001x = 23048;
               var10002x = 2247930544539117242L ^ ax;
               var10000 = a.bcj.emb("MouseSim");
               if (var3 == null) {
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
      var21 = 22352;
      var10004 = 3740964033088303704L ^ a;
      var4[21] = a.fuf.bih(a.bdd::dnp);
      var21 = 32609;
      var10004 = 8245255592289606248L ^ a;
      var4[22] = a.bgu.bih(a.bdd::dnp);
      var21 = 26443;
      var10004 = 5704700054887891533L ^ a;
      var4[23] = a.ghi.bih(a.bdd::dnp);
      var21 = 3125;
      var10004 = 801187845230225700L ^ a;
      var4[24] = a.ffp.bih(a.bdd::dnp);
      var21 = 12701;
      var10004 = 7939269895068603546L ^ a;
      var4[25] = a.dnl;
      var21 = 26526;
      var10004 = 7564019096876778121L ^ a;
      var4[26] = a.cbu;
      var21 = 26498;
      var10004 = 8224927408624075415L ^ a;
      var4[27] = a.cdm;
      var21 = 5703;
      var10004 = 2076359248143151962L ^ a;
      var4[28] = a.exp;
      var21 = 18517;
      var10004 = 2828219615374421326L ^ a;
      var4[29] = a.ecs.bih(() -> {
         long ax = ekb.a ^ 90531660610396L;
         int[] var3 = dar.abu();
         boolean var10000 = a.dnl.dnp();
         if (var3 != null) {
            var10000 = !var10000;
         }

         return var10000;
      });
      var21 = 15859;
      var10004 = 5640458554369628408L ^ a;
      var4[30] = a.cun.bih(() -> {
         long ax = ekb.a ^ 98979080666413L;
         int[] var3 = dar.abu();
         boolean var10000 = a.dnl.dnp();
         if (var3 != null) {
            var10000 = !var10000;
         }

         return var10000;
      });
      var21 = 831;
      var10004 = 6578682993112704570L ^ a;
      var4[31] = a.fjt;
      var4[e<"u">(17215, 9005640626043561481L ^ a)] = a.fzp;
      var21 = 29583;
      var10004 = 376269544556271237L ^ a;
      var4[33] = a.dv;
      var21 = 4836;
      var10004 = 2245036405572990964L ^ a;
      var4[34] = a.aps;
      var21 = 2067;
      var10004 = 5728994261999906077L ^ a;
      var4[35] = a.gln;
      var21 = 27918;
      var10004 = 7309988060905703441L ^ a;
      var4[36] = a.fwx;
      var4[e<"u">(6142, 2197031402323931849L ^ a)] = a.dfg.bih(a.fwx::dnp);
      a.bfi(var4);
      if (!ffn.gsn()) {
         dar.aow(new int[5]);
      }
   }

   @Override
   public void auj() {
      a.heb = false;
      super.auj();
   }

   @Override
   public void frg() {
      a.gvw = null;
      a.epe(false);
      super.frg();
   }

   @gdz
   public void aur(fnt event) {
      long ax = ekb.a ^ 131243582792158L;
      int[] var4 = dar.abu();
      if (a.cud() != gpy.POST) {
         int var10000 = dar.gqy().aws().diy(fhd.class).dsv();
         if (var4 != null) {
            if (var10000) {
               return;
            }

            var10000 = dar.gqy().aws().diy(exz.class).dsv();
         }

         label127: {
            label132: {
               if (var4 != null) {
                  if (var10000 && dar.gqy().aws().diy(exz.class).bvh != null) {
                     return;
                  }

                  a.cye++;
                  a.efe(a.asa.dnp());
                  a.bfx = bav.elv(a.aps.dnp(), a.fzp.dnp(), a.dv.dnp(), a.gln.dnp(), a.fjt.dnp(), a.flh.dnp().floatValue());
                  var5 = a;
                  if (var4 == null) {
                     break label132;
                  }

                  short var10001 = 31820;
                  long var10002 = 8388466432408669660L ^ ax;
                  var10000 = a.asa.emb("Switch");
               }

               if (var10000) {
                  ekb var6 = a;
                  if (var4 != null) {
                     if (a.bfx.size() > 1) {
                        a.bfx = a.bfx
                           .stream()
                           .filter(axx -> bav.dtz(axx, a.ejq.dnp().floatValue()))
                           .sorted(Comparator.comparingDouble(dgq::flj))
                           .collect(Collectors.toList());
                        if (var4 != null) {
                           break label127;
                        }
                     }

                     var6 = a;
                  }

                  var6.bfx = a.bfx.stream().sorted(Comparator.comparingDouble(dgq::flj)).collect(Collectors.toList());
                  if (var4 != null) {
                     break label127;
                  }
               }

               var5 = a;
            }

            var5.bfx = a.bfx.stream().sorted(Comparator.comparingDouble(dgq::flj)).collect(Collectors.toList());
         }

         var10000 = a.bfx.isEmpty();
         if (var4 != null) {
            if (var10000 != 0) {
               a.gvw = null;
               a.dan = 0;
               a.epe(false);
               return;
            }

            short var10 = 12938;
            long var11 = 9005623697657660164L ^ ax;
            var10000 = a.asa.emb("Single");
         }

         label134: {
            if (var4 != null) {
               if (var10000 != 0) {
                  a.gvw = a.bfx.getFirst();
                  a.dan = 0;
                  if (var4 != null) {
                     break label134;
                  }
               }

               var10000 = a.dan;
            }

            label135: {
               if (var4 != null) {
                  if (var10000 >= a.bfx.size()) {
                     a.dan = 0;
                  }

                  var8 = a;
                  if (var4 == null) {
                     break label135;
                  }

                  var10000 = a.acr.fsc(g<"h">(7059, 4456349392173625312L ^ ax));
               }

               if (var10000 != 0) {
                  a.dan = (a.dan + 1) % a.bfx.size();
                  a.acr.glr();
               }

               var8 = a;
            }

            var8.gvw = a.bfx.get(a.dan);
         }

         ekb var9 = a;
         if (var4 != null) {
            if (a.gvw == null) {
               a.epe(false);
               return;
            }

            var9 = a;
         }

         var9.deb();
      }
   }

   private void deb() {
      long a;
      int[] ax;
      int var23;
      a = ekb.a ^ 35820875451594L;
      int[] var10000 = dar.abu();
      float axx = (float)dgq.flj(a.gvw);
      ax = var10000;
      float var58;
      var23 = (var58 = axx - a.esx.dnp().floatValue()) == 0.0F ? 0 : (var58 < 0.0F ? -1 : 1);
      label492:
      if (ax != null) {
         if (var23 <= 0) {
            var23 = a.bdd.dnp();
            if (ax == null) {
               break label492;
            }

            if (var23 != 0) {
               double axxx = a.fuf.dnp().doubleValue() / 2.0;
               double axxxx = a.bgu.dnp().doubleValue() / 2.0;
               double axxxxx = a.ghi.dnp().doubleValue() / 2.0;
               double axxxxxx = a.ffp.dnp().doubleValue() / 2.0;
               double var59;
               var23 = (var59 = axxx - axxxx) == 0.0 ? 0 : (var59 < 0.0 ? -1 : 1);
               if (ax != null) {
                  if (var23 > 0) {
                     axxx = axxxx;
                  }

                  double var60;
                  var23 = (var60 = axxxx - axxx) == 0.0 ? 0 : (var60 < 0.0 ? -1 : 1);
               }

               if (ax != null) {
                  if (var23 < 0) {
                     axxxx = axxx;
                  }

                  double var61;
                  var23 = (var61 = axxxxx - axxxxxx) == 0.0 ? 0 : (var61 < 0.0 ? -1 : 1);
               }

               if (ax != null) {
                  if (var23 > 0) {
                     axxxxx = axxxxxx;
                  }

                  double var62;
                  var23 = (var62 = axxxxxx - axxxxx) == 0.0 ? 0 : (var62 < 0.0 ? -1 : 1);
               }

               label496: {
                  if (ax != null) {
                     if (var23 < 0) {
                        axxxxxx = axxxxx;
                     }

                     var25 = a.atx;
                     if (ax == null) {
                        break label496;
                     }

                     var23 = a.atx.fsc(g<"h">(7374, 585562561062061483L ^ a));
                  }

                  if (var23 != 0) {
                     a.fzz = axxx + new Random().nextDouble() * (axxxx - axxx);
                     a.dxb = axxxxx + new Random().nextDouble() * (axxxxxx - axxxxx);
                  }

                  a.fzz = class_3532.method_15350(a.fzz, axxx, axxxx);
                  a.dxb = class_3532.method_15350(a.dxb, axxxxx, axxxxxx);
                  var25 = a.bcj.dnp();
               }

               String var14 = (String)var25;
               byte var15 = -1;
               var23 = var14.hashCode();
               label466:
               if (ax != null) {
                  switch (var23) {
                     case 2581482:
                        short var10001 = 4213;
                        long var10002 = 8431925581969657061L ^ a;
                        var23 = var14.equals("Snap");
                        if (ax == null) {
                           break label466;
                        }

                        if (var23 == 0) {
                           break;
                        }

                        var15 = 0;
                        if (ax != null) {
                           break;
                        }
                     case -54989294:
                        short var41 = 23048;
                        long var50 = 2247974840935499417L ^ a;
                        var23 = var14.equals("MouseSim");
                        if (ax == null) {
                           break label466;
                        }

                        if (var23 != 0) {
                           var15 = 1;
                        }
                  }

                  var23 = var15;
               }

               float[] axxxxxxx;
               label460: {
                  label500: {
                     label458: {
                        label501: {
                           if (ax != null) {
                              switch (var23) {
                                 case 0:
                                    var27 = a;
                                    if (ax == null) {
                                       break label501;
                                    }

                                    var23 = a.aap.fsc((long)crg.gj(100.0F, 200.0F));
                                    break;
                                 case 1:
                                    break label458;
                                 default:
                                    break label500;
                              }
                           }

                           if (var23 != 0) {
                              a.dra = a.gfi();
                              a.cmc = a.hgc();
                              a.aap.glr();
                           }

                           var27 = a;
                        }

                        class_243 axxxxxxxx = dgq.fgs(var27.gvw)
                           .method_1031(a.dra * a.gfr.dnp().floatValue(), a.cmc * a.cbe.dnp().floatValue(), a.dra * a.gfr.dnp().floatValue());
                        float[] axxxxxxxxx = dgq.gah(axxxxxxxx);
                        axxxxxxxxx[1] = class_3532.method_15363(axxxxxxxxx[1], -89.9F, 89.9F);
                        axxxxxxx = axxxxxxxxx;
                        if (ax != null) {
                           break label460;
                        }
                     }

                     ekb var28 = a;
                     if (ax != null) {
                        if (a.aap.fsc(g<"h">(25547, 8549296403068500648L ^ a))) {
                           a.arn = a.gfi();
                           a.gha = a.hgc();
                           a.aap.glr();
                        }

                        a.col = a.col + (a.arn - a.col) * 0.1F;
                        a.eqv = a.eqv + (a.gha - a.eqv) * 0.1F;
                        var28 = a;
                     }

                     class_243 axxxxxxxx = dgq.fgs(var28.gvw)
                        .method_1031(a.col * a.gfr.dnp().floatValue(), a.eqv * a.cbe.dnp().floatValue(), a.col * a.gfr.dnp().floatValue());
                     float[] axxxxxxxxx = dgq.gah(axxxxxxxx);
                     axxxxxxxxx[1] = class_3532.method_15363(axxxxxxxxx[1], -89.9F, 89.9F);
                     axxxxxxx = axxxxxxxxx;
                     if (ax != null) {
                        break label460;
                     }
                  }

                  axxxxxxx = dgq.dxs(a.gvw);
               }

               a.bbh = axxxxxxx;
               ekb var29 = a;
               if (ax != null) {
                  if (a.bsp.dnp()) {
                     a.bbh[0] = a.bbh[0] + (float)(Math.random() - 0.5);
                     a.bbh[1] = a.bbh[1] + (float)(Math.random() - 0.5) * 2.0F;
                  }

                  var29 = a;
               }

               dqq.cms(var29.bbh, (float)a.fzz, (float)a.dxb);
            }
         }

         float var63;
         var23 = (var63 = axx - a.bjd.dnp().floatValue()) == 0.0F ? 0 : (var63 < 0.0F ? -1 : 1);
      }

      label438: {
         label503: {
            if (ax != null) {
               if (var23 > 0) {
                  break label503;
               }

               var23 = a.boi.dnp();
            }

            if (ax != null) {
               if (var23 == 0) {
                  break label503;
               }

               var23 = chi.field_1724.method_31548().method_7391().method_31573(class_3489.field_42611);
            }

            if (ax == null) {
               break label438;
            }

            if (var23 != 0) {
               var23 = 1;
               break label438;
            }
         }

         var23 = 0;
      }

      boolean axxxxxxxx;
      label422: {
         label421: {
            axxxxxxxx = (boolean)var23;
            bfc.fpt(a.fjt.dnp());
            class_3966 axxxxxxxxx = bfc.exm();
            class_3966 var30 = axxxxxxxxx;
            if (ax != null) {
               if (axxxxxxxxx == null) {
                  break label421;
               }

               var30 = axxxxxxxxx;
            }

            if (var30.method_17782() == a.gvw) {
               var31 = true;
               break label422;
            }
         }

         var31 = false;
      }

      boolean axxxxxxxxxx;
      label413: {
         label412: {
            label504: {
               boolean axxxxxxxxxxx = var31;
               axxxxxxxxxx = bav.dtz(a.gvw, a.ejq.dnp().floatValue());
               var32 = axxxxxxxxxx;
               if (ax != null) {
                  if (axxxxxxxxxx == 0) {
                     break label504;
                  }

                  var32 = axxxxxxxxxxx;
               }

               label409:
               if (ax != null) {
                  if (var32 == 0) {
                     var32 = a.bt.dnp();
                     if (ax == null) {
                        break label409;
                     }

                     if (var32 != 0) {
                        break label504;
                     }
                  }

                  String var33 = a.cdm.dnp();
                  short var42 = 10196;
                  long var51 = 2066482092537002823L ^ a;
                  var32 = var33.equals("Normal");
               }

               label402:
               if (ax != null) {
                  if (var32 != 0) {
                     var32 = chi.field_1724.method_24828();
                     if (ax == null) {
                        break label402;
                     }

                     if (var32 != 0) {
                        break label504;
                     }
                  }

                  String var34 = a.cdm.dnp();
                  short var43 = 10196;
                  long var52 = 2066482092537002823L ^ a;
                  var32 = var34.equals("Normal");
               }

               if (ax != null) {
                  if (var32 == 0) {
                     String var35 = a.cdm.dnp();
                     short var44 = 17297;
                     long var53 = 2048681594821828385L ^ a;
                     var32 = var35.equals("Force");
                     if (ax == null) {
                        break label413;
                     }

                     if (var32 == 0) {
                        break label412;
                     }
                  }

                  var32 = a.dmb(a.exp.dnp(), true);
               }

               if (ax == null) {
                  break label413;
               }

               if (var32 == 0) {
                  break label412;
               }
            }

            var32 = 0;
            break label413;
         }

         var32 = 1;
      }

      boolean axxxxxxxxxxxx;
      label376: {
         label375: {
            axxxxxxxxxxxx = (boolean)var32;
            ekb var36 = a;
            short var45 = a.cel.dnp();
            if (ax != null) {
               a.exv = (boolean)var45;
               if (axxxxxxxx != 0) {
                  var45 = 24240;
                  long var54 = 2551410835741622827L ^ a;
                  var23 = a.dhq.emb("Modern Watchdog");
                  if (ax == null) {
                     break label376;
                  }

                  if (var23 != 0) {
                     break label375;
                  }

                  a.bhz(axxxxxxxxxxxx);
                  if (ax != null) {
                     break label375;
                  }
               }

               var36 = a;
               var45 = 0;
            }

            var36.epe((boolean)var45);
         }

         var23 = axxxxxxxxxx;
      }

      label363:
      if (ax != null) {
         if (var23 != 0) {
            var23 = axxxxxxxx;
            if (ax == null) {
               break label363;
            }

            if (axxxxxxxx != 0) {
               short var47 = 24240;
               long var55 = 2551410835741622827L ^ a;
               var23 = a.dhq.emb("Modern Watchdog");
               if (ax == null) {
                  break label363;
               }

               if (var23 != 0) {
                  label355: {
                     class_746 var38 = chi.field_1724;
                     if (ax != null) {
                        if (chi.field_1724.field_6012 % 2 != 0) {
                           break label355;
                        }

                        chi.field_1761.method_2918(chi.field_1724, a.gvw);
                        var38 = chi.field_1724;
                     }

                     var38.method_6104(class_1268.field_5808);
                  }

                  a.bhz(axxxxxxxxxxxx);
               }
            }
         }

         var23 = axxxxxxxxxxxx;
      }

      if (ax != null) {
         if (var23 == 0) {
            return;
         }

         var23 = a.boi.dnp();
      }

      label343:
      if (ax != null) {
         if (var23 != 0) {
            String var39 = a.dhq.dnp().toLowerCase();
            short var48 = 2344;
            long var56 = 710829668127184269L ^ a;
            var23 = var39.contains("watchdog");
            if (ax == null) {
               break label343;
            }

            if (var23 != 0) {
               var48 = 28323;
               var56 = 6536745780389081646L ^ a;
               var23 = a.dhq.emb("Modern Watchdog Post");
               if (ax == null) {
                  break label343;
               }

               if (var23 == 0) {
                  return;
               }
            }
         }

         var23 = a.dnl.dnp();
      }

      label326: {
         label509: {
            if (ax != null) {
               if (var23 == 0) {
                  var23 = a.auf.fsc(a.gso());
                  if (ax == null) {
                     break label326;
                  }

                  if (var23 != 0) {
                     break label509;
                  }
               }

               var23 = a.dnl.dnp();
            }

            if (ax != null) {
               if (var23 == 0) {
                  return;
               }

               double var64;
               var23 = (var64 = chi.field_1724.method_7261(0.0F) - 0.95) == 0.0 ? 0 : (var64 < 0.0 ? -1 : 1);
            }

            if (ax == null) {
               break label326;
            }

            if (var23 < 0) {
               return;
            }
         }

         var23 = a.cbu.dnp();
      }

      label510: {
         if (ax != null) {
            if (var23 != 0) {
               chi.field_1724.method_6104(class_1268.field_5808);
            }

            chi.field_1761.method_2918(chi.field_1724, a.gvw);
            var40 = a;
            if (ax == null) {
               break label510;
            }

            var23 = a.cbu.dnp();
         }

         if (var23 == 0) {
            chi.field_1724.method_6104(class_1268.field_5808);
         }

         var40 = a;
      }

      var40.auf.glr();
      chi.field_1724.method_7350();
   }

   @gdz
   public void fcp(ajd event) {
   }

   private boolean dmb(boolean a, boolean a) {
      long ax = ekb.a ^ 86013953107038L;
      int[] var5 = dar.abu();
      byte var10000 = chi.field_1724.method_24828();
      if (var5 != null) {
         if (var10000 == 0) {
            var10000 = chi.field_1724.method_6101();
            if (var5 == null) {
               return (boolean)var10000;
            }

            if (var10000 == 0) {
               var10000 = chi.field_1724.method_5799();
               if (var5 == null) {
                  return (boolean)var10000;
               }

               if (var10000 == 0) {
                  var10000 = chi.field_1724.method_5869();
                  if (var5 == null) {
                     return (boolean)var10000;
                  }

                  if (var10000 == 0) {
                     var10000 = chi.field_1724.method_6059(class_1294.field_5919);
                     if (var5 == null) {
                        return (boolean)var10000;
                     }

                     if (var10000 == 0) {
                        var10000 = chi.field_1724.method_5765();
                        if (var5 == null) {
                           return (boolean)var10000;
                        }

                        label91:
                        if (var10000 == 0) {
                           int var6 = a;
                           if (var5 != null) {
                              if (a) {
                                 double var7;
                                 var6 = (var7 = chi.field_1724.field_6017 - 0.0) == 0.0 ? 0 : (var7 < 0.0 ? -1 : 1);
                                 if (var5 == null) {
                                    return (boolean)var6;
                                 }

                                 if (var6 <= 0) {
                                    break label91;
                                 }
                              }

                              var6 = a;
                           }

                           if (var5 != null) {
                              if (var6) {
                                 boolean var8 = chi.field_1724.method_5624();
                                 if (var5 == null) {
                                    return var8;
                                 }

                                 if (var8) {
                                    return false;
                                 }
                              }

                              var6 = 1;
                           }

                           return (boolean)var6;
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

   private void bhz(boolean a) {
      long ax;
      int[] axx;
      int var10;
      ax = ekb.a ^ 22901994148339L;
      int[] var10000 = dar.abu();
      String var5 = a.dhq.dnp();
      axx = var10000;
      byte var6 = -1;
      var10 = var5.hashCode();
      label202:
      if (axx != null) {
         switch (var10) {
            case 1897755483:
               short var10001 = 15871;
               long var10002 = 2257801865483517000L ^ ax;
               var10 = var5.equals("Vanilla");
               if (axx == null) {
                  break label202;
               }

               if (var10 == 0) {
                  break;
               }

               var6 = 0;
               if (axx != null) {
                  break;
               }
            case 64274236:
               short var16 = 32538;
               long var22 = 5681301331754204830L ^ ax;
               var10 = var5.equals("Blink");
               if (axx == null) {
                  break label202;
               }

               if (var10 == 0) {
                  break;
               }

               var6 = 1;
               if (axx != null) {
                  break;
               }
            case 430277554:
               short var17 = 28323;
               long var23 = 6536724063248232215L ^ ax;
               var10 = var5.equals("Modern Watchdog Post");
               if (axx == null) {
                  break label202;
               }

               if (var10 == 0) {
                  break;
               }

               var6 = 2;
               if (axx != null) {
                  break;
               }
            case 1239695398:
               short var18 = 21989;
               long var24 = 4436319072658068599L ^ ax;
               var10 = var5.equals("Old Watchdog");
               if (axx == null) {
                  break label202;
               }

               if (var10 == 0) {
                  break;
               }

               var6 = 3;
               if (axx != null) {
                  break;
               }
            case 482016750:
               short var19 = 24240;
               long var25 = 2551389121650171666L ^ ax;
               var10 = var5.equals("Modern Watchdog");
               if (axx == null) {
                  break label202;
               }

               if (var10 != 0) {
                  var6 = 4;
               }
         }

         var10 = var6;
      }

      switch (var10) {
         case 0:
            a.epe(true);
            if (axx != null) {
               return;
            }
         case 1:
            if (chi.field_1724.field_6012 % 2 == 0) {
               dar.gqy().ccv().gne(bhw.class).fxn();
               a.bzo = false;
               gix.dsd(new class_2846(class_2847.field_12974, class_2338.field_10980, class_2350.field_11033));
               a.heb = false;
               if (axx != null) {
                  return;
               }
            }

            dar.gqy().ccv().gne(bhw.class).ckv();
            a.bzo = true;
            a.epe(true);
            if (axx != null) {
               return;
            }
         case 2:
            label212: {
               int var11 = chi.field_1724.method_6115();
               if (axx != null) {
                  if (!var11) {
                     break label212;
                  }

                  var11 = 0;
               }

               boolean axxx = (boolean)var11;
               int axxxx = 0;

               while (true) {
                  short var20 = 6219;
                  long var26 = 6989926880719841328L ^ ax;
                  label164:
                  if (axxxx < 9) {
                     var11 = ((KeyBindingAccessor)chi.field_1690.field_1852[axxxx]).getTimesPressed();
                     if (axx == null) {
                        break;
                     }

                     label161: {
                        if (axx != null) {
                           if (var11 == 0) {
                              break label161;
                           }

                           var11 = 1;
                        }

                        axxx = (boolean)var11;
                        if (axx != null) {
                           break label164;
                        }
                     }

                     axxxx++;
                     if (axx != null) {
                        continue;
                     }
                  }

                  var11 = axxx;
                  break;
               }

               if (axx != null) {
                  if (var11 != 0) {
                     break label212;
                  }

                  var11 = chi.field_1724.method_31548().method_67532();
               }

               axxxx = var11;
               int var27 = axxxx + 1;
               short var10003 = 6219;
               long var10004 = 6989926880719841328L ^ ax;
               gix.dsd(new class_2868(var27 % 9));
               chi.field_1724.method_6075();
               gix.dsd(new class_2868(axxxx));
            }

            a.heb = true;
            if (axx != null) {
               return;
            }
         case 3:
            label210: {
               boolean var13 = a.auf.fsc(a.gso());
               if (axx != null) {
                  if (!var13) {
                     return;
                  }

                  a.boh(true);
                  if (axx == null) {
                     break label210;
                  }

                  var13 = a;
               }

               if (var13) {
                  chi.field_1761.method_2918(chi.field_1724, a.gvw);
                  chi.field_1724.method_6104(class_1268.field_5808);
               }

               chi.method_1562().method_48296().method_10743(class_2824.method_34207(a.gvw, chi.field_1724.method_5715(), class_1268.field_5808));
               a.cyo(false, true);
               a.auf.glr();
            }

            if (axx != null) {
               return;
            }
         case 4:
            break;
         default:
            return;
      }

      label124: {
         ekb var14 = a;
         int var21 = a.asl;
         if (axx != null) {
            switch (a.asl++) {
               case 1:
                  gix.dsd(class_2824.method_34207(a.gvw, chi.field_1724.method_5715(), class_1268.field_5808));
                  gix.avn(axxx -> new class_2886(class_1268.field_5808, axxx, a.bbh[0], a.bbh[1]));
                  a.heb = true;
                  dar.gqy().ccv().gne(bhw.class).fxn();
                  var14 = a;
                  var21 = 0;
                  break;
               case 2:
                  break label124;
               default:
                  return;
            }
         }

         var14.bzo = (boolean)var21;
         if (axx != null) {
            return;
         }
      }

      dar.gqy().ccv().gne(bhw.class).ckv();
      a.bzo = true;
      gix.dsd(new class_2846(class_2847.field_12974, class_2338.field_10980, class_2350.field_11033));
      a.heb = false;
      a.asl = 1;
   }

   @gdz
   public void cpg(fxx event) {
   }

   @gdz
   public void gmo(amo event) {
      long ax;
      int[] axx;
      class_2596 var14;
      label142: {
         class_2596 axxx;
         label143: {
            label136: {
               ax = ekb.a ^ 399136378820L;
               axx = dar.abu();
               boolean var10000 = a.boi.dnp();
               if (axx != null) {
                  if (!var10000) {
                     break label136;
                  }

                  short var10001 = 28323;
                  long var10002 = 6536710356519137568L ^ ax;
                  var10000 = a.dhq.emb("Modern Watchdog Post");
               }

               if (var10000) {
                  axxx = a.bed();
                  var10 = axxx instanceof class_9836;
                  if (axx == null) {
                     break label143;
                  }

                  if (var10) {
                     class_9836 axxxx = (class_9836)axxx;
                     var10 = chi.field_1724.method_31548().method_7391().method_31573(class_3489.field_42611);
                     if (axx == null) {
                        break label143;
                     }

                     if (var10) {
                        var10 = bav.dtz(a.gvw, a.bjd.dnp().floatValue());
                        if (axx == null) {
                           break label143;
                        }

                        if (var10 && a.gvw != null) {
                           label122: {
                              if (!dar.gqy().ccv().gne(bhw.class).bsw()) {
                                 a.gmm(true);
                                 gix.eex(axxxx);
                                 if (axx != null) {
                                    break label122;
                                 }
                              }

                              short var11 = 22655;
                              long var16 = 5209693486405289965L ^ ax;
                              bpa.bez("Stopped Keep sprint");
                           }

                           label117: {
                              label116: {
                                 a = bfc.exm();
                                 class_3966 var12 = a;
                                 if (axx != null) {
                                    if (a == null) {
                                       break label116;
                                    }

                                    var12 = a;
                                 }

                                 if (var12.method_17782() == a.gvw) {
                                    var13 = true;
                                    break label117;
                                 }
                              }

                              var13 = false;
                           }

                           boolean axxxxx = var13;
                           chi.field_1761.method_2919(chi.field_1724, class_1268.field_5808);
                           if (axx != null && axxxxx) {
                              chi.field_1761.method_2905(chi.field_1724, a.method_17782(), class_1268.field_5808);
                           }
                        }
                     }
                  }
               }
            }

            axxx = a.bed();
            var14 = axxx;
            if (axx == null) {
               break label142;
            }

            var10 = axxx instanceof class_2846;
         }

         if (!var10) {
            return;
         }

         var14 = axxx;
      }

      class_2846 axxxxx = (class_2846)var14;
      int var15 = a.boi.dnp();
      if (axx != null) {
         if (var15 == 0) {
            return;
         }

         short var17 = 21989;
         long var18 = 4436305364719962688L ^ ax;
         var15 = a.dhq.emb("Old Watchdog");
      }

      if (axx != null) {
         if (var15 == 0) {
            return;
         }

         var15 = a.cye;
      }

      if (axx != null) {
         if (var15 >= 3) {
            return;
         }

         var15 = axxxxx.method_12363().equals(class_2847.field_12974);
      }

      if (var15 != 0) {
         a.gmm(true);
      }
   }

   @gdz
   public void ben(bsm event) {
      long ax = ekb.a ^ 91096211361065L;
      int[] var4 = dar.abu();
      ekb var10000 = a;
      if (var4 != null) {
         if (!a.fwx.dnp()) {
            return;
         }

         var10000 = a;
      }

      if (var10000.gvw != null) {
         bqf.enm(a.bus(), a.gvw);
      }
   }

   private void epe(boolean a) {
      ekb var5;
      label35: {
         long ax = ekb.a ^ 1631443414286L;
         int[] var4 = dar.abu();
         boolean var10000 = a;
         if (var4 != null) {
            if (a) {
               a.cyo(a.can.dnp(), a.esi.dnp());
               if (var4 != null) {
                  return;
               }
            }

            var5 = a;
            if (var4 == null) {
               break label35;
            }

            var10000 = a.bzo;
         }

         if (var10000) {
            dar.gqy().ccv().gne(bhw.class).fxn();
            a.bzo = false;
         }

         var5 = a;
      }

      var5.boh(a.esi.dnp());
   }

   private void cyo(boolean a, boolean a) {
      long ax = ekb.a ^ 101122312292328L;
      int[] var5 = dar.abu();
      boolean var10000 = a;
      if (var5 != null) {
         if (a) {
            chi.field_1761.method_2905(chi.field_1724, a.gvw, class_1268.field_5808);
         }

         var10000 = a;
      }

      label24: {
         if (var10000) {
            gix.avn(axx -> new class_2886(class_1268.field_5808, axx, a.bbh[0], a.bbh[1]));
            if (var5 != null) {
               break label24;
            }
         }

         chi.field_1690.field_1904.method_23481(true);
      }

      a.exv = true;
      a.heb = true;
   }

   private void boh(boolean a) {
      long ax;
      int[] axx;
      boolean var10000;
      label68: {
         label71: {
            ax = ekb.a ^ 18870269493321L;
            axx = dar.abu();
            var10000 = a.heb;
            if (axx != null) {
               if (!a.heb) {
                  break label71;
               }

               var10000 = chi.field_1724.method_31548().method_7391().method_31573(class_3489.field_42611);
            }

            if (axx == null) {
               break label68;
            }

            if (var10000) {
               var10000 = true;
               break label68;
            }
         }

         var10000 = false;
      }

      boolean axxx = var10000;
      short var10001 = 21989;
      long var10002 = 4436324140091114957L ^ ax;
      var10000 = a.dhq.emb("Old Watchdog");
      label57:
      if (axx != null) {
         if (var10000) {
            var10000 = a.heb;
            if (axx == null) {
               break label57;
            }

            if (a.heb) {
               int axxxx = chi.field_1724.method_31548().method_67532();
               short var10003 = 16746;
               long var10004 = 4826445569647075495L ^ ax;
               gix.dsd(new class_2868(axxxx % 8 + 1));
               gix.dsd(new class_2868(axxxx));
               a.heb = false;
               a.cye = 0;
            }
         }

         var10000 = axxx;
      }

      label72: {
         if (axx != null) {
            if (!var10000) {
               break label72;
            }

            var10000 = a;
         }

         if (var10000) {
            gix.eex(new class_2846(class_2847.field_12974, class_2338.field_10980, class_2350.field_11033));
            if (axx != null) {
               break label72;
            }
         }

         chi.field_1690.field_1904.method_23481(false);
      }

      a.exv = false;
      a.heb = false;
   }

   private long gso() {
      return (long)(1000.0F / crg.gj(a.ecs.dnp().floatValue(), a.cun.dnp().floatValue()));
   }

   public boolean dfb() {
      long a = ekb.a ^ 123724835910853L;
      int[] var3 = dar.abu();
      Object var10000 = a.gvw;
      if (var3 != null) {
         if (a.gvw == null) {
            return false;
         }

         var10000 = a.boi.dnp();
      }

      boolean var4 = (Boolean)var10000;
      if (var3 != null) {
         if (!var4) {
            return false;
         }

         var4 = a.exv;
      }

      return var3 == null ? var4 : var4;
   }

   private float gfi() {
      long a = ekb.a ^ 65975195564891L;
      return (float)(
         crg.gj(-a.dbv.dnp().floatValue(), a.dbv.dnp().floatValue())
            + Math.sin(System.currentTimeMillis() % g<"h">(27358, 1844852272521036843L ^ a) / 200.0) * 0.5
      );
   }

   private float hgc() {
      long a = ekb.a ^ 116180376116719L;
      return (float)(
         crg.gj(-a.aud.dnp().floatValue(), a.aud.dnp().floatValue())
            + Math.cos(System.currentTimeMillis() % g<"h">(23910, 1430922943298983205L ^ a) / 150.0) * 0.3F
      );
   }

   public static void hcg(String[] var0) {
      gbb = var0;
   }

   public static String[] chi() {
      return gbb;
   }

   static {
      long var22 = a ^ 140270037747364L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var25 = 1; var25 < 8; var25++) {
         var10003[var25] = (byte)(var22 << var25 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[65];
      int var29 = 0;
      String var28 = "Ñxi¦)\u0088Åí\b05Ðn\u0081\u009fd½@~L;ìË¯\u0010Ì¥¹ÚÕww«ëÎù\u0013!ý Ü \u0084\u008c\u0019dÂ;áþý¾ä\u0016óH<Hôh\t\u00195çQ\u0003Û@î\u0087hÇÝÀ\u0010_Û\u0083\u0085¿û×\u0092\u009f´`\u007f\u0019Ô\u0084\u001f dM\u0000\u0099Ý!Î\u0001Ï1\u001b°+NÎu/öðÙÀF\u00181ò\u001e½²¶Þv×\u0010Ï\u009b¶ÇOäX[\u0010®\u0086k!ØÜZ\u0018Ôb>«T-gt\u008aoë´\\¶ùðN\u0090*\u0086A\u0094\u0080è \u0018/\u009déñ£\b\u009bZPºá\u0089Sdhf±/NêÐ3%\u0091Îv\u0080=?0ú\u0018õ÷b\u0010j'\u0011êUß\u0011(\u0080õë\u0002Õ\u000b\u000e\u0002Ôª^p\u0010ëð\n\u001fS¯`G\u0082E\u0081Ýæâm\u008e(\f)s¹#È¡\u0007Õ\u008buE\u00ad]Þ4þ\u0084BïbÈµe\rMk¬ôO»\u008bÆÞÚÿ2c\u008cë\u0018}\u008aüD«q7^Ý\u0083\u0080\u0001hè0\u000b¤6\u0016í\r\u0019h\u0001 û&?Àº©¹\u0012ïq\u0093¯\u001bûÿ6\u008d\u009e'áìÃ×?ì6~ïÇ\u00153\u000b\u0010R\u0099íIÙ\u0095¢leÜÓ{`»\u0093E(»ö\u0083\u0086V\u0000x¿R\u008d\rxå\u0010\u009cïÏ\u0093I\u0086Ú¼t¯è\u001e\u0017ûfõl>N½\u009f\u009eÄks©(}zâ\u0011«\u001cÍbÍéã~K\u00ad«Õ{\u007f\u0011$ÛnPl\u0097]\u0097d.\u008cH,Ï¤?¹\u008d+d½\u0010ålWêÛ×\b\u0004æÆØ\u0095OËÎï(Udª?ÙZZàm)ò]îñU|\u00050Ç]ß\u0091ASÐº6\u0086\u001b\u0013\u0015\u001e¤q¿\u009bW\u0006W\u0086 E¶§\u008a~\u00adÍ²ÔÃTçÓ\u0094´O¼È%\u0084Â\u0014,ó\u008dÓZÅ¿±=c\u0010ôè\n¤\u009e5\u00ad\u0016Ï¼Î\u0004¶Óºè\u0010\u0097\u001a\u0014o0Ìzái\u009dB»Ê$\u009e\u008d !8²e3à³k\u0083BÕ\u0084\f»\u0094Í¤e\u0004N0·\u0085)mÉÚ\n«ÐÃõ\u0018\u008aEî\u008b÷\u0092\u0001Ï\u0095\"ßµ4\u0090¾°5\"\u001a\u001a\u0096U)\u0096\u0010\u0019ôw+e¤1+\u0082µäô9\u0097¶n \u008d»ønb¾üÕ¢\u001c9\u008b£=\u009eqL|\u000bÆ¹gsÝjgáXµ¥\u0094\u000b\u0010\u009c\u009e¸t\u00157åJæ´Qí«ÈG½\u0010.42 ä\u008an,['D8f¢\u0019Ð(U\u0018\u0083ÌwtEx>½rÂ:\u000e¼\u000bWi\u0013\u0098\\'¦û×_\u0004µ\u0097¬\u00839Ó\u0081aÃR\u0016\u0087~ t\u008d3)Ê\u009dÞ\u0082@Jbï\\\u001fØ\u0088vÝB\u0002\u0099qnpÃ<}·´îLü\u0010»\u0097ÇX.U\u0081P{\f$sâ\u0094hO \u009a\u0099eô{R§\u0093\u001f\u0006n\u0012G¯3KY¨ªB\u0010\u00191*\u001bNü\f-ØM\u009b \u00975EN&\u001f\u001føÓ\u009cÔdy;ª§E\t\u0018\u0082juÚ*Ò\u000eT\u0095óò@Á\u0010}H*èP\u009f\u0095¶\u0006\u009d\u0098\u0005£¤\u001bï GjA\u008füÈÔgdÑcv\u009bÛ§ª\u00adÉD\u001aüÞùh\u000eì¥£\f|ÓÑ\u0018ôM%¼L¡ÁøC\u000e\u000fIa¾\u0013¡Ãö\u0093\u0082\u001bë]ß\u0010\u0095&\u0005\u001bèï\u009c¦ªÚr\u009e\u0097;¹?\u0018\u0001ÇIuXpC\u008ftG°\u001fü4#\u0085¯¬\u0095V£Û\u000fã\u0018èö\u0082´±Â\u009e-[JLFk5\u0093\u0080\u0082y\u0099äÉ\u0018µ\u0082 å\u0018\u0094\u0089\u0000Ìô¼V79t0GV¡Ú\u0094\u0095SÃ<ïÆèe¹A@0ä{(Ì\u0091Ò½ô\u0080\u00adMé7O\fa\"P[ë£\u0088r8g«\u0084¾N\u0090:ô¼®y]kR \rÀüè0\u0084\u009eUò\u0006\fnøüÉ\u0090_Ó1/Ù\u000e½\u009f\u0015?1\u001d\"ç~ý\f\u0015\u009e?±\u007fñS\u008dí\u0097)\rï\u00125¨\b52ý ¶¿õ\u0007\u0092¨;3kº\u0007\u0087H-érÙ\r\u00146?Xæ«\u001aÛD9cY!á\u0010ô§z`'Ý\n\u001f4¾KSêº\u009f\u0016(\u0089´Ë²Ò\"\u0089éã¬}#½Ô&´\u0099\u0097\u001dXúÔQ\u001b\u008d\"nB\u0084âs3 \u009d\u0090\u0098aÊð± ÷Ýîâ×\u0082\u0012\u008eÙ\u0095\u009bLù\u0090PþâJ\u001f\u001a\u0007=ó\u0012~\u0005tÎYó\tÄ\u0018ª¢\bº/\u0085Íî Ù\u0003\u0082?5[¢»5[¯®Å\u009es Ù\u0083Y\u0092¼q(P·y@nÖ7Â'\u0082µ\u0084øiË1\u008bïÓ\rÓuÙ\\Á «Á\u0019L½\u009a`\u007fæ)\u008a\u0090\bæ\u0082\u0081>¾ÑN«\u009cTnÊDf^<6=\u008b [Û;7\u0092yd9Ïä0\u0083¾[hj\u0098 l|\u0086ùâÖä=£Ü\u0011\u0002<*\u0018j?|ü\u0099+\u0087p\u0088\u0084\u008d\u0096óH\u0082}E®èZ_Ñx\u0089 ê)æó\u0099¨\u001b\u0015cÎ\u0000e§+r\u0085\u0080ÌdÛ\u0095\u0098®`fxz}Éëk© \u0083y\\hÉA\u00044õù\u0093Ñ¤Y\u008f%:\u0091d\u0084È\u0096üÓ\u0099rY+Ø/³\u001d \u0007§\u008fhõ4\u008dÅç\r¢Ôwã²\u001b·®eÝÑÛ¤Ûå£Z\u0089O\u0010\u0004~ ×¦ç\u009eÿs9òx¨8?Ue7RsAÚÃ\u009e]~îTKC#N\u007f)j\u0010üû\n\u0013<\u0083\u009dz&\u0088)\u0018\u0093Ç®ã\u0010 £È\u007fùÃodþõrw\u0007S\u0083õ K\u009f?\u0014o\u0085mß\b\u001f!^Þ°ð\u0084\u009f\tøÜ\u009cláÛ>Æ\u008bs³\u0006°=\u0018É\u0005Ë\u001c÷\u0019\u0015Ý\r4º}]ª\n«\u0089çå®Þ¼¼\u0011\u0010\u0092õ)/âí\u0081}\r8\u0092{ñxb\f\u0010ÍþÄ\u001b\u001c?¡ò2#\u008e_þ\u0019\u008fr 5p\u00ad\u0018?y/¤±\u001d\u0083$¤é%áÙÈ.\bßO\u0089\"\u0006\u0088)Ùú\u0016\u0083ô\u0010\u00009bìå\u0018\u0088ð6Õe:yü#é\u0010Ë($\u0097`\nP\u008dWp\u0084ßº\u009e2N";
      int var30 = "Ñxi¦)\u0088Åí\b05Ðn\u0081\u009fd½@~L;ìË¯\u0010Ì¥¹ÚÕww«ëÎù\u0013!ý Ü \u0084\u008c\u0019dÂ;áþý¾ä\u0016óH<Hôh\t\u00195çQ\u0003Û@î\u0087hÇÝÀ\u0010_Û\u0083\u0085¿û×\u0092\u009f´`\u007f\u0019Ô\u0084\u001f dM\u0000\u0099Ý!Î\u0001Ï1\u001b°+NÎu/öðÙÀF\u00181ò\u001e½²¶Þv×\u0010Ï\u009b¶ÇOäX[\u0010®\u0086k!ØÜZ\u0018Ôb>«T-gt\u008aoë´\\¶ùðN\u0090*\u0086A\u0094\u0080è \u0018/\u009déñ£\b\u009bZPºá\u0089Sdhf±/NêÐ3%\u0091Îv\u0080=?0ú\u0018õ÷b\u0010j'\u0011êUß\u0011(\u0080õë\u0002Õ\u000b\u000e\u0002Ôª^p\u0010ëð\n\u001fS¯`G\u0082E\u0081Ýæâm\u008e(\f)s¹#È¡\u0007Õ\u008buE\u00ad]Þ4þ\u0084BïbÈµe\rMk¬ôO»\u008bÆÞÚÿ2c\u008cë\u0018}\u008aüD«q7^Ý\u0083\u0080\u0001hè0\u000b¤6\u0016í\r\u0019h\u0001 û&?Àº©¹\u0012ïq\u0093¯\u001bûÿ6\u008d\u009e'áìÃ×?ì6~ïÇ\u00153\u000b\u0010R\u0099íIÙ\u0095¢leÜÓ{`»\u0093E(»ö\u0083\u0086V\u0000x¿R\u008d\rxå\u0010\u009cïÏ\u0093I\u0086Ú¼t¯è\u001e\u0017ûfõl>N½\u009f\u009eÄks©(}zâ\u0011«\u001cÍbÍéã~K\u00ad«Õ{\u007f\u0011$ÛnPl\u0097]\u0097d.\u008cH,Ï¤?¹\u008d+d½\u0010ålWêÛ×\b\u0004æÆØ\u0095OËÎï(Udª?ÙZZàm)ò]îñU|\u00050Ç]ß\u0091ASÐº6\u0086\u001b\u0013\u0015\u001e¤q¿\u009bW\u0006W\u0086 E¶§\u008a~\u00adÍ²ÔÃTçÓ\u0094´O¼È%\u0084Â\u0014,ó\u008dÓZÅ¿±=c\u0010ôè\n¤\u009e5\u00ad\u0016Ï¼Î\u0004¶Óºè\u0010\u0097\u001a\u0014o0Ìzái\u009dB»Ê$\u009e\u008d !8²e3à³k\u0083BÕ\u0084\f»\u0094Í¤e\u0004N0·\u0085)mÉÚ\n«ÐÃõ\u0018\u008aEî\u008b÷\u0092\u0001Ï\u0095\"ßµ4\u0090¾°5\"\u001a\u001a\u0096U)\u0096\u0010\u0019ôw+e¤1+\u0082µäô9\u0097¶n \u008d»ønb¾üÕ¢\u001c9\u008b£=\u009eqL|\u000bÆ¹gsÝjgáXµ¥\u0094\u000b\u0010\u009c\u009e¸t\u00157åJæ´Qí«ÈG½\u0010.42 ä\u008an,['D8f¢\u0019Ð(U\u0018\u0083ÌwtEx>½rÂ:\u000e¼\u000bWi\u0013\u0098\\'¦û×_\u0004µ\u0097¬\u00839Ó\u0081aÃR\u0016\u0087~ t\u008d3)Ê\u009dÞ\u0082@Jbï\\\u001fØ\u0088vÝB\u0002\u0099qnpÃ<}·´îLü\u0010»\u0097ÇX.U\u0081P{\f$sâ\u0094hO \u009a\u0099eô{R§\u0093\u001f\u0006n\u0012G¯3KY¨ªB\u0010\u00191*\u001bNü\f-ØM\u009b \u00975EN&\u001f\u001føÓ\u009cÔdy;ª§E\t\u0018\u0082juÚ*Ò\u000eT\u0095óò@Á\u0010}H*èP\u009f\u0095¶\u0006\u009d\u0098\u0005£¤\u001bï GjA\u008füÈÔgdÑcv\u009bÛ§ª\u00adÉD\u001aüÞùh\u000eì¥£\f|ÓÑ\u0018ôM%¼L¡ÁøC\u000e\u000fIa¾\u0013¡Ãö\u0093\u0082\u001bë]ß\u0010\u0095&\u0005\u001bèï\u009c¦ªÚr\u009e\u0097;¹?\u0018\u0001ÇIuXpC\u008ftG°\u001fü4#\u0085¯¬\u0095V£Û\u000fã\u0018èö\u0082´±Â\u009e-[JLFk5\u0093\u0080\u0082y\u0099äÉ\u0018µ\u0082 å\u0018\u0094\u0089\u0000Ìô¼V79t0GV¡Ú\u0094\u0095SÃ<ïÆèe¹A@0ä{(Ì\u0091Ò½ô\u0080\u00adMé7O\fa\"P[ë£\u0088r8g«\u0084¾N\u0090:ô¼®y]kR \rÀüè0\u0084\u009eUò\u0006\fnøüÉ\u0090_Ó1/Ù\u000e½\u009f\u0015?1\u001d\"ç~ý\f\u0015\u009e?±\u007fñS\u008dí\u0097)\rï\u00125¨\b52ý ¶¿õ\u0007\u0092¨;3kº\u0007\u0087H-érÙ\r\u00146?Xæ«\u001aÛD9cY!á\u0010ô§z`'Ý\n\u001f4¾KSêº\u009f\u0016(\u0089´Ë²Ò\"\u0089éã¬}#½Ô&´\u0099\u0097\u001dXúÔQ\u001b\u008d\"nB\u0084âs3 \u009d\u0090\u0098aÊð± ÷Ýîâ×\u0082\u0012\u008eÙ\u0095\u009bLù\u0090PþâJ\u001f\u001a\u0007=ó\u0012~\u0005tÎYó\tÄ\u0018ª¢\bº/\u0085Íî Ù\u0003\u0082?5[¢»5[¯®Å\u009es Ù\u0083Y\u0092¼q(P·y@nÖ7Â'\u0082µ\u0084øiË1\u008bïÓ\rÓuÙ\\Á «Á\u0019L½\u009a`\u007fæ)\u008a\u0090\bæ\u0082\u0081>¾ÑN«\u009cTnÊDf^<6=\u008b [Û;7\u0092yd9Ïä0\u0083¾[hj\u0098 l|\u0086ùâÖä=£Ü\u0011\u0002<*\u0018j?|ü\u0099+\u0087p\u0088\u0084\u008d\u0096óH\u0082}E®èZ_Ñx\u0089 ê)æó\u0099¨\u001b\u0015cÎ\u0000e§+r\u0085\u0080ÌdÛ\u0095\u0098®`fxz}Éëk© \u0083y\\hÉA\u00044õù\u0093Ñ¤Y\u008f%:\u0091d\u0084È\u0096üÓ\u0099rY+Ø/³\u001d \u0007§\u008fhõ4\u008dÅç\r¢Ôwã²\u001b·®eÝÑÛ¤Ûå£Z\u0089O\u0010\u0004~ ×¦ç\u009eÿs9òx¨8?Ue7RsAÚÃ\u009e]~îTKC#N\u007f)j\u0010üû\n\u0013<\u0083\u009dz&\u0088)\u0018\u0093Ç®ã\u0010 £È\u007fùÃodþõrw\u0007S\u0083õ K\u009f?\u0014o\u0085mß\b\u001f!^Þ°ð\u0084\u009f\tøÜ\u009cláÛ>Æ\u008bs³\u0006°=\u0018É\u0005Ë\u001c÷\u0019\u0015Ý\r4º}]ª\n«\u0089çå®Þ¼¼\u0011\u0010\u0092õ)/âí\u0081}\r8\u0092{ñxb\f\u0010ÍþÄ\u001b\u001c?¡ò2#\u008e_þ\u0019\u008fr 5p\u00ad\u0018?y/¤±\u001d\u0083$¤é%áÙÈ.\bßO\u0089\"\u0006\u0088)Ùú\u0016\u0083ô\u0010\u00009bìå\u0018\u0088ð6Õe:yü#é\u0010Ë($\u0097`\nP\u008dWp\u0084ßº\u009e2N"
         .length();
      char var27 = 24;
      int var36 = -1;

      label87:
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
                     h = new String[65];
                     r = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var22 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[36];
                     int var14 = 0;
                     String var15 = "}IOH}åG\u008b\u0083Á\u009cÎ,\u001cy\u0019\u0012@j\b\u001d\u0017Â#\u000f\n{¡XxzåB\u009b&ß\u0099aÿ\u001dn@ þW\u009eSö\u009eíMõ\u008f¾LðMá1p÷I`é÷þõ¬ë7è\u0012JO\u0000Q<áÀ?*+\u0015;Ì¡%\u001dT8Ñ\u001e\u0096Ä>Ôe+Ú£ä\u0086\u0088Ô+»\u0089ëW\u0000\u009c´JIay\\\u008a¥ÓÒ\u0081\u0018FH®\u009e¯*\u0080\u0013¸O\u009b;w\u001b\u001aÛ\t\u0088åÓ\u0081¡çÿ\u001f\u0007æw\u0092á{Y°\u0000sÜâò0f/]=\u009a\u008b\u001061AÚ\u0014µ\u0010ÿÇÉCÿmôò¬/y\u0088\"è\u0088\t\u0085ÚT£ÊSGö³xÆ::\u0092·uåXô\u008d¯\u001eÛ²\u000e)\u0083\u0092u|\u0083\u0091\u009b`t!áH«Ì\u001af\u0080[\u0018Oúò^íXòÉ\u0010=\u0087'ú! ·iì*!Öÿ.L'ìê®h¿EE[%*";
                     int var16 = "}IOH}åG\u008b\u0083Á\u009cÎ,\u001cy\u0019\u0012@j\b\u001d\u0017Â#\u000f\n{¡XxzåB\u009b&ß\u0099aÿ\u001dn@ þW\u009eSö\u009eíMõ\u008f¾LðMá1p÷I`é÷þõ¬ë7è\u0012JO\u0000Q<áÀ?*+\u0015;Ì¡%\u001dT8Ñ\u001e\u0096Ä>Ôe+Ú£ä\u0086\u0088Ô+»\u0089ëW\u0000\u009c´JIay\\\u008a¥ÓÒ\u0081\u0018FH®\u009e¯*\u0080\u0013¸O\u009b;w\u001b\u001aÛ\t\u0088åÓ\u0081¡çÿ\u001f\u0007æw\u0092á{Y°\u0000sÜâò0f/]=\u009a\u008b\u001061AÚ\u0014µ\u0010ÿÇÉCÿmôò¬/y\u0088\"è\u0088\t\u0085ÚT£ÊSGö³xÆ::\u0092·uåXô\u008d¯\u001eÛ²\u000e)\u0083\u0092u|\u0083\u0091\u009b`t!áH«Ì\u001af\u0080[\u0018Oúò^íXòÉ\u0010=\u0087'ú! ·iì*!Öÿ.L'ìê®h¿EE[%*"
                        .length();
                     byte var13 = 0;

                     label69:
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
                                    q = new Integer[36];
                                    x = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var22 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[5];
                                    int var3 = 0;
                                    String var4 = "<c|½-!¶g¥ýUl£u®Ó\b\u001fð\u009eU\u0015}ª";
                                    int var5 = "<c|½-!¶g¥ýUl£u®Ó\b\u001fð\u009eU\u0015}ª".length();
                                    byte var2 = 0;

                                    label53:
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
                                                   w = new Long[5];
                                                   if (chi() == null) {
                                                      hcg(new String[5]);
                                                   }

                                                   return;
                                                }
                                                break;
                                             default:
                                                var42[var49] = var68;
                                                if (var2 < var5) {
                                                   continue label53;
                                                }

                                                var4 = "\t\u0091\u0018'±\u0014'VÚ\"ø¿»\u008d\u0007.";
                                                var5 = "\t\u0091\u0018'±\u0014'VÚ\"ø¿»\u008d\u0007.".length();
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
                                    continue label69;
                                 }

                                 var15 = "L\u000eÚ¹y\u000e\u0017¨ÖðÂéÆ\u000få~";
                                 var16 = "L\u000eÚ¹y\u000e\u0017¨ÖðÂéÆ\u000få~".length();
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
                     continue label87;
                  }

                  var28 = "Û´«.ª«*\u0015hÀH\u0015L]0R(9ñé\"\u008c²Ò@Jß´\u009boMRb±ùhÕ\u0010«V\u0080\u009aÎ6\u0016£ÏçÏQÀE\u0019á\u008c8¢";
                  var30 = "Û´«.ª«*\u0015hÀH\u0015L]0R(9ñé\"\u008c²Ò@Jß´\u009boMRb±ùhÕ\u0010«V\u0080\u009aÎ6\u0016£ÏçÏQÀE\u0019á\u008c8¢".length();
                  var27 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20893;
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
            throw new RuntimeException("cc/astralis/ekb", var10);
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
         throw new RuntimeException("cc/astralis/ekb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8258;
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
            throw new RuntimeException("cc/astralis/ekb", var14);
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
         throw new RuntimeException("cc/astralis/ekb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long g(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5245;
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
            throw new RuntimeException("cc/astralis/ekb", var14);
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
         throw new RuntimeException("cc/astralis/ekb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
