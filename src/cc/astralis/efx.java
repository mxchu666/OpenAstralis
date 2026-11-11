package cc.astralis;

import imgui.type.ImFloat;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1041;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2879;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_4587;
import net.minecraft.class_638;
import net.minecraft.class_239.class_240;

public class efx extends guu {
   private final adu aqg;
   private final adu bqc;
   private final bes gju;
   private final gbp fqo;
   private final gbp coa;
   public final gbp cgy;
   private final gbp bdd;
   private final gbp cdk;
   private final gbp bn;
   private final gbp euz;
   private final gbp hge;
   private final bes bjk;
   private final bes exn;
   private final gbp fpf;
   public final gbp bza;
   private final gbp epf;
   private final cyx gdh;
   public final gbp gez;
   private final cyx cuw;
   private final gbp czw;
   private final gbp gso;
   private final adu end;
   private final gbp dhl;
   private final adu fdv;
   private final gbp euu;
   private final bes grx;
   private final gbp flo;
   private final gbp esl;
   private final gbp ggy;
   private final adu gkz;
   private final bes ewl;
   private final bes dih;
   private final bes ezy;
   private final bes ael;
   public final adu hfi;
   private final gbp aof;
   private final gbp dgy;
   private final gbp aba;
   private final gbp cci;
   private final bes bld;
   private final bes dgj;
   private aqy hba;
   public int gnd;
   public int btn;
   public int dzc;
   public int cj;
   public double ebp;
   private float[] fub;
   public boolean fwx;
   private boolean hci;
   public int ciu;
   private int btd;
   private int fmm;
   private boolean dsc;
   private final cbm dsa;
   private class_2338 adx;
   private float dku;
   private float dxn;
   private boolean awk;
   public final cbm eat;
   private float[] gpi;
   private int hek;
   private aqy hil;
   private boolean hjm;
   private static int[] bd;
   private static final long a = 109583705240673L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;
   private static final long v;

   public efx() {
      long a = efx.a ^ 12973103487419L;
      super(bfm.MOVEMENT);
      int[] var10000 = dar.abu();
      short var10004 = 29206;
      long var10005 = 5118616045073169690L ^ a;
      short var145 = 18618;
      long var10006 = 3236698855878182787L ^ a;
      String[] var165 = new String[4];
      short var10009 = 10726;
      long var10010 = 4694935003934271119L ^ a;
      var165[0] = "Normal";
      var10009 = 17758;
      var10010 = 5268201454946208374L ^ a;
      var165[1] = "Modern Watchdog";
      var10009 = 11744;
      var10010 = 5663065953896505984L ^ a;
      var165[2] = "Telly";
      var10009 = 20101;
      var10010 = 2253099706860257677L ^ a;
      var165[3] = "Snap";
      a.aqg = new adu("Scaffold Mode", "Normal", var165);
      var10004 = 10213;
      var10005 = 6235973740084799703L ^ a;
      short var147 = 1266;
      var10006 = 7829588862803479518L ^ a;
      String[] var167 = new String[2];
      var10009 = 17797;
      var10010 = 5689842658287438522L ^ a;
      var167[0] = "Update";
      var10009 = 32470;
      var10010 = 6822322386814988724L ^ a;
      var167[1] = "Click";
      a.bqc = new adu("Place Mode", "Update", var167);
      var10004 = 31371;
      var10005 = 113799823361996188L ^ a;
      a.gju = new bes("Start Placing After", 5.0F, 0.0F, 9.0F, 1.0F);
      var10004 = 9104;
      var10005 = 3443995112378838201L ^ a;
      a.fqo = new gbp("Swing Hand", true);
      var10004 = 19590;
      var10005 = 8353640073426158488L ^ a;
      a.coa = new gbp("Alternated Scaffold Order", false);
      var10004 = 20342;
      var10005 = 1782600290718662749L ^ a;
      a.cgy = new gbp("SafeWalk", true);
      var10004 = 17078;
      var10005 = 2471675846310415793L ^ a;
      a.bdd = new gbp("Same Y", false);
      var10004 = 20552;
      var10005 = 2491147520874405748L ^ a;
      a.cdk = new gbp("Anal Boob", false);
      var10004 = 30063;
      var10005 = 7616806522190133767L ^ a;
      a.bn = new gbp("Don't place in same tick", true);
      var10004 = 31354;
      var10005 = 1235549740168344852L ^ a;
      a.euz = new gbp("Jump", false);
      int[] var3 = var10000;
      short var10003 = 16949;
      long var77 = 8994178587173997879L ^ a;
      a.hge = new gbp("Don't jump diagonally", false);
      var10003 = 23955;
      long var78 = 9094745706310062723L ^ a;
      a.bjk = new bes("Jump Every", 1.0F, 1.0F, 30.0F, 1.0F);
      var10003 = 4049;
      long var79 = 5318868268672876722L ^ a;
      a.exn = new bes("Place Delay", 0.0F, 0.0F, 10.0F, 1.0F);
      var10003 = 19772;
      long var80 = 2690326005127135763L ^ a;
      a.fpf = new gbp("Sprint On Jump", false);
      var10003 = 20968;
      long var81 = 1239938196215324297L ^ a;
      a.bza = new gbp("Sprint", false);
      var10003 = 14916;
      long var82 = 4371409955720115491L ^ a;
      a.epf = new gbp("Change FOV", false);
      var10003 = 11396;
      long var83 = 2570381698267947950L ^ a;
      a.gdh = new cyx("Sprint Mode", new ecs(a), new arx(a), new dkm(a));
      var10003 = 17100;
      long var84 = 2776524004880010697L ^ a;
      a.gez = new gbp("Tower", false);
      var10003 = 11842;
      long var85 = 1538464201380962640L ^ a;
      a.cuw = new cyx("Tower Mode", new cgw(a), new bgl(a));
      var10003 = 13897;
      long var86 = 5982643869323508034L ^ a;
      a.czw = new gbp("No Off Hand check", true);
      var10003 = 20983;
      long var87 = 5035522264662367946L ^ a;
      a.gso = new gbp("Block Counter", true);
      var10003 = 18656;
      long var88 = 2017380996828055501L ^ a;
      var10004 = 10527;
      var10005 = 1862297927488841278L ^ a;
      String[] var157 = new String[2];
      short var10008 = 2388;
      long var187 = 678744821673035363L ^ a;
      var157[0] = "Astralis";
      var10008 = 16907;
      long var188 = 9216871595052420378L ^ a;
      var157[1] = "Adjust";
      a.end = new adu("Block Counter Mode", "Astralis", var157);
      var10003 = 24198;
      long var90 = 2163235057141338511L ^ a;
      a.dhl = new gbp("Block ESP", true);
      var10003 = 31573;
      long var91 = 7966276003476272251L ^ a;
      var10004 = 18462;
      var10005 = 789059682154039045L ^ a;
      String[] var159 = new String[2];
      var10008 = 18462;
      long var189 = 789059682154039045L ^ a;
      var159[0] = "Accurate";
      var10008 = 1017;
      long var190 = 3575420179344133364L ^ a;
      var159[1] = "Prediction";
      a.fdv = new adu("Block ESP Mode", "Accurate", var159);
      var10003 = 11212;
      long var93 = 5602640085958501592L ^ a;
      a.euu = new gbp("Sneak", false);
      var10003 = 2263;
      long var94 = 8857177065079113659L ^ a;
      a.grx = new bes("Sneak Every", 1.0F, 1.0F, 30.0F, 1.0F);
      var10003 = 27074;
      long var95 = 6169403297980147446L ^ a;
      a.flo = new gbp("Autoswap to next stack", true);
      var10003 = 15321;
      long var96 = 6383712457065510085L ^ a;
      a.esl = new gbp("Rotations", true);
      var10003 = 6318;
      long var97 = 5490620219211814794L ^ a;
      a.ggy = new gbp("180 on jump key", false);
      var10003 = 28575;
      long var98 = 2786835437019455730L ^ a;
      var10004 = 12497;
      var10005 = 1971575053594247098L ^ a;
      String[] var161 = new String[4];
      var10008 = 16548;
      long var191 = 4268102371946942396L ^ a;
      var161[0] = "Off";
      var10008 = 10726;
      long var192 = 4694935003934271119L ^ a;
      var161[1] = "Normal";
      var10008 = 31478;
      long var193 = 3296986833227347440L ^ a;
      var161[2] = "Advanced";
      var10008 = 16656;
      long var194 = 3280760497962110515L ^ a;
      var161[3] = "MC";
      a.gkz = new adu("Ray Cast Mode", "Off", var161);
      var10003 = 9942;
      long var100 = 7034826567316548072L ^ a;
      a.ewl = new bes("Min Yaw Speed", 120.0F, 1.0F, 180.0F, 1.0F);
      var10003 = 17053;
      long var101 = 1453571114383494556L ^ a;
      a.dih = new bes("Max Yaw Speed", 120.0F, 1.0F, 180.0F, 1.0F);
      var10003 = 3878;
      long var102 = 676570180342186057L ^ a;
      a.ezy = new bes("Min Pitch Speed", 120.0F, 1.0F, 180.0F, 1.0F);
      var10003 = 14265;
      long var103 = 3646913518110914743L ^ a;
      a.ael = new bes("Max Pitch Speed", 120.0F, 1.0F, 180.0F, 1.0F);
      var10003 = 2262;
      long var104 = 8255421607588726732L ^ a;
      var10004 = 28532;
      var10005 = 7762890693807071344L ^ a;
      short var163 = 12131;
      var10006 = 1971085004764920462L ^ a;
      String[] var164 = new String[6];
      var10008 = 28532;
      long var195 = 7762890693807071344L ^ a;
      var164[0] = "Basic";
      var10008 = 27994;
      long var196 = 8254015602457862767L ^ a;
      var164[1] = "Edge";
      var10008 = 17758;
      long var197 = 5268201454946208374L ^ a;
      var164[2] = "Modern Watchdog";
      var10008 = 17866;
      long var198 = 123389735295437484L ^ a;
      var164[3] = "Modern Watchdog 2";
      var10008 = 28529;
      long var199 = 8109229975263633489L ^ a;
      var164[4] = "God Bridge";
      var10008 = 18203;
      long var200 = 8473884255235983366L ^ a;
      var164[5] = "Intave";
      a.hfi = new adu("Rotation Mode", "Basic", var164);
      var10003 = 6950;
      long var106 = 3606449650073342997L ^ a;
      a.aof = new gbp("Brute Force Yaw", true);
      var10003 = 23952;
      long var107 = 4915896766692053641L ^ a;
      a.dgy = new gbp("Brute Force Pitch", true);
      var10003 = 21363;
      long var108 = 2334544928923343897L ^ a;
      a.aba = new gbp("Spoof Ray Cast", false);
      var10003 = 9569;
      long var109 = 7073938492098980432L ^ a;
      a.cci = new gbp("Stable", false);
      var10003 = 9668;
      long var110 = 7692005801944754891L ^ a;
      a.bld = new bes("Yaw Value", 180.0F, 0.0F, 360.0F, 1.0F);
      var10003 = 31226;
      long var111 = 862428912575444684L ^ a;
      a.dgj = new bes("Pitch Value", 81.7F, -90.0F, 90.0F, 0.1F);
      a.ciu = -1;
      a.dsa = new cbm();
      a.awk = false;
      a.eat = new cbm();
      a.gpi = null;
      a.hek = 0;
      short var10001 = 18414;
      long var10002 = 705920773575397948L ^ a;
      ffn[] var4 = new ffn[]{
         a.aqg,
         a.coa,
         a.gju.bih(() -> {
            long ax = efx.a ^ 31396819258814L;
            short var10001x = 4652;
            long var10002x = 3128135912116734243L ^ ax;
            return a.aqg.emb("Telly");
         }),
         a.bqc,
         a.exn,
         a.fqo,
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
         null,
         null,
         null,
         null
      };
      var10003 = 9144;
      long var112 = 3950215343920264805L ^ a;
      var4[6] = a.bdd;
      var10003 = 17921;
      long var113 = 7308210642741154787L ^ a;
      var4[7] = a.epf;
      var4[e<"u">(30456, 7688202087667098424L ^ a)] = a.bn;
      var10003 = 20329;
      long var114 = 5658199239190338222L ^ a;
      var4[9] = a.cdk.bih(a.bdd::dnp);
      var10003 = 3928;
      long var115 = 6727412134240098986L ^ a;
      var4[10] = a.euz;
      var10003 = 821;
      long var116 = 766460450673530594L ^ a;
      var4[11] = a.hge.bih(a.euz::dnp);
      var10003 = 27170;
      long var117 = 4512930774983868357L ^ a;
      var4[12] = a.bjk.bih(a.euz::dnp);
      var10003 = 15674;
      long var118 = 2002686725485406431L ^ a;
      var4[13] = a.bza;
      var10003 = 15704;
      long var119 = 1829081115442784428L ^ a;
      var4[14] = a.fpf;
      var10003 = 19891;
      long var120 = 3884934975117416525L ^ a;
      var4[15] = a.gdh.bih(a.bza::dnp);
      var10003 = 24460;
      long var121 = 3045557632174574162L ^ a;
      var4[16] = a.gez;
      var10003 = 2263;
      long var122 = 89049025673501964L ^ a;
      var4[17] = a.cuw.bih(a.gez::dnp);
      var10003 = 8250;
      long var123 = 7320342079517767120L ^ a;
      var4[18] = a.czw;
      var10003 = 17185;
      long var124 = 7229821888262690528L ^ a;
      var4[19] = a.gso;
      var10003 = 29717;
      long var125 = 5041565561642508796L ^ a;
      var4[20] = a.end.bih(a.gso::dnp);
      var10003 = 25894;
      long var126 = 1380754287279272185L ^ a;
      var4[21] = a.dhl;
      var10003 = 7162;
      long var127 = 7172289930726542858L ^ a;
      var4[22] = a.fdv.bih(a.dhl::dnp);
      var10003 = 12463;
      long var128 = 166324328227808633L ^ a;
      var4[23] = a.euu;
      var10003 = 32462;
      long var129 = 6484521120444771125L ^ a;
      var4[24] = a.grx.bih(a.euu::dnp);
      var10003 = 19024;
      long var130 = 6143063010808127365L ^ a;
      var4[25] = a.gkz;
      var10003 = 4112;
      long var131 = 737335857102980581L ^ a;
      var4[26] = a.flo;
      var10003 = 16911;
      long var132 = 8795959866686429175L ^ a;
      var4[27] = a.esl;
      var10003 = 17070;
      long var133 = 5721771729870509912L ^ a;
      var4[28] = a.ggy.bih(a.esl::dnp);
      var10003 = 27081;
      long var134 = 3270207451699444778L ^ a;
      var4[29] = a.hfi.bih(a.esl::dnp);
      var10003 = 23977;
      long var135 = 2375428277816445007L ^ a;
      var4[30] = a.aof.bih(() -> {
         long ax = efx.a ^ 13125369025572L;
         int[] var3x = dar.abu();
         short var10001x = 18203;
         long var10002x = 8473884395555587481L ^ ax;
         boolean var10000x = a.hfi.emb("Intave");
         if (var3x != null) {
            var10000x = !var10000x;
         }

         return var10000x;
      });
      var10003 = 5060;
      long var136 = 4109098445314721280L ^ a;
      var4[31] = a.dgy.bih(() -> {
         long ax = efx.a ^ 88191224945843L;
         int[] var3x = dar.abu();
         short var10001x = 18203;
         long var10002x = 8473825255495224590L ^ ax;
         boolean var10000x = a.hfi.emb("Intave");
         if (var3x != null) {
            var10000x = !var10000x;
         }

         return var10000x;
      });
      var10003 = 31817;
      long var137 = 6807170411532511664L ^ a;
      var4[32] = a.aba.bih(() -> {
         long ax = efx.a ^ 33248483775458L;
         int[] var3x = dar.abu();
         short var10001x = 17758;
         long var10002x = 5268222821387649071L ^ ax;
         boolean var10000x = a.hfi.emb("Modern Watchdog");
         if (var3x != null) {
            if (!var10000x) {
               return false;
            }

            var10000x = a.esl.dnp();
         }

         if (var3x == null) {
            return var10000x;
         } else {
            return var10000x ? true : false;
         }
      });
      var4[e<"u">(24386, 6266468391071894145L ^ a)] = a.cci.bih(() -> {
         long ax = efx.a ^ 57955359090107L;
         int[] var3x = dar.abu();
         short var10001x = 17758;
         long var10002x = 5268180457919166070L ^ ax;
         boolean var10000x = a.hfi.emb("Modern Watchdog");
         if (var3x != null) {
            if (!var10000x) {
               return false;
            }

            var10000x = a.esl.dnp();
         }

         if (var3x == null) {
            return var10000x;
         } else {
            return var10000x ? true : false;
         }
      });
      var10003 = 20328;
      long var138 = 8352548059348196016L ^ a;
      var4[34] = a.ewl.bih(a.esl::dnp);
      var10003 = 3475;
      long var139 = 1133082573751097418L ^ a;
      var4[35] = a.dih.bih(a.esl::dnp);
      var10003 = 12753;
      long var140 = 3423689948347868160L ^ a;
      var4[36] = a.ezy.bih(a.esl::dnp);
      var10003 = 31276;
      long var141 = 6668853111776899049L ^ a;
      var4[37] = a.ael.bih(a.esl::dnp);
      var10003 = 25429;
      long var142 = 7552146136224298629L ^ a;
      var4[38] = a.bld.bih(a.esl::dnp);
      var10003 = 1836;
      long var143 = 2068851975314412228L ^ a;
      var4[39] = a.dgj.bih(a.esl::dnp);
      var10003 = 14483;
      long var144 = 2433678218440977778L ^ a;
      var4[40] = a.cgy;
      a.bfi(var4);
      if (var3 == null) {
         ffn.bzf(ffn.czs());
      }
   }

   @Override
   public void auj() {
      efx var5;
      label50: {
         int[] var3;
         label47: {
            long a = efx.a ^ 115192212698534L;
            var3 = dar.abu();
            Object var10000 = chi.field_1724;
            if (var3 != null) {
               if (chi.field_1724 != null) {
                  a.cj = chi.field_1724.method_31548().method_67532();
                  a.ebp = chi.field_1724.method_31478();
                  a.awk = true;
                  a.eat.glr();
                  a.gnd = 0;
                  a.hci = false;
                  var4 = a.bza.dnp();
                  if (var3 == null) {
                     break label47;
                  }

                  if (!var4) {
                     chi.field_1690.method_42450().method_41748(false);
                     chi.field_1724.method_5728(false);
                     chi.field_1690.field_1867.method_23481(false);
                  }
               }

               var5 = a;
               if (var3 == null) {
                  break label50;
               }

               var10000 = a.esl.dnp();
            }

            var4 = (Boolean)var10000;
         }

         if (var4) {
            var5 = a;
            if (var3 == null) {
               break label50;
            }

            if (a.epf.dnp()) {
               chi.field_1690.method_42454().method_41748(0.0);
            }
         }

         a.fmm = 0;
         a.ciu = a.cj;
         a.btd = -1;
         var5 = a;
      }

      var5.auj();
   }

   @Override
   public void frg() {
      long a = efx.a ^ 105951340897013L;
      int[] var3 = dar.abu();
      Object var10000 = chi.field_1724;
      if (var3 != null) {
         if (chi.field_1724 != null) {
            chi.field_1724.method_31548().method_61496(a.cj);
         }

         var10000 = a.cdk.dnp();
      }

      boolean var4 = (Boolean)var10000;
      if (var3 != null) {
         if (var4) {
            chi.field_1690.field_1904.method_23481(false);
         }

         var4 = a.esl.dnp();
      }

      label43:
      if (var3 != null) {
         if (var4) {
            var4 = a.epf.dnp();
            if (var3 == null) {
               break label43;
            }

            if (var4) {
               chi.field_1690.method_42454().method_41748(1.0);
            }
         }

         a.ciu = -1;
         var4 = false;
      }

      dqq.axd(var4);
      dqq.cms(a.fub, crg.gj(a.ewl.dnp().floatValue(), a.dih.dnp().floatValue()), crg.gj(a.ezy.dnp().floatValue(), a.ael.dnp().floatValue()));
      super.frg();
   }

   @gdz
   public void dig(etk event) {
      long ax = efx.a ^ 114416202490459L;
      int[] var4 = dar.abu();
      if (var4 != null) {
         if (!a.bza.dnp()) {
            chi.field_1724.method_5728(false);
         }

         chi.field_1690.field_1867.method_23481(false);
      }
   }

   @gdz
   public void cyi(fnt event) {
      int[] var4;
      efx var6;
      label107: {
         label108: {
            label109: {
               long ax;
               label110: {
                  ax = efx.a ^ 11603565930606L;
                  var4 = dar.abu();
                  Object var10000 = a.cud();
                  if (var4 != null) {
                     if (var10000 != gpy.POST) {
                        break label110;
                     }

                     var10000 = a.coa.dnp();
                  }

                  var5 = (Boolean)var10000;
                  if (var4 == null) {
                     break label108;
                  }

                  if (var5) {
                     break label109;
                  }

                  a.fub = a.dba();
                  if (var4 != null) {
                     break label109;
                  }
               }

               short var10001 = 19035;
               long var10002 = 2261492571706143934L ^ ax;
               var5 = a.bqc.emb("Click");
               if (var4 == null) {
                  break label108;
               }

               if (var5) {
                  a.gsj();
               }
            }

            var6 = a;
            if (var4 == null) {
               break label107;
            }

            var5 = a.coa.dnp();
         }

         if (!var5) {
            return;
         }

         var6 = a;
      }

      double var8;
      label79: {
         label111: {
            label77: {
               label112: {
                  var7 = a.bdd.dnp();
                  if (var4 != null) {
                     if (var7 == 0) {
                        var7 = dar.gqy().aws().diy(eky.class).dsv();
                        if (var4 == null) {
                           break label77;
                        }

                        if (var7 == 0) {
                           break label112;
                        }
                     }

                     var7 = chi.field_1690.field_1903.method_1434();
                  }

                  if (var4 == null) {
                     break label77;
                  }

                  if (var7 == 0) {
                     break label111;
                  }
               }

               var7 = a.fwx;
            }

            if (var4 != null) {
               if (var7 != 0) {
                  break label111;
               }

               var7 = chi.field_1724.method_31478();
            }

            var8 = var7;
            break label79;
         }

         var8 = a.ebp;
      }

      var6.hba = amg.asc((int)var8);
      a.fub = a.dba();
   }

   @gdz
   public void clt(fxx event) {
      long ax;
      int[] axx;
      boolean var9;
      label160: {
         label163: {
            ax = efx.a ^ 16075841959500L;
            int[] var10000 = dar.abu();
            chi.field_1690.field_1886.method_23481(false);
            chi.field_1690.field_1904.method_23481(false);
            axx = var10000;
            var9 = a.gez.dnp();
            if (axx != null) {
               if (!var9) {
                  break label163;
               }

               var9 = chi.field_1690.field_1903.method_1434();
            }

            if (axx == null) {
               break label160;
            }

            if (var9) {
               var9 = true;
               break label160;
            }
         }

         var9 = false;
      }

      boolean axxx;
      label149: {
         label164: {
            axxx = var9;
            var9 = a.bza.dnp();
            if (axx != null) {
               if (!var9) {
                  break label164;
               }

               var9 = evd.dbj();
            }

            if (axx == null) {
               break label149;
            }

            if (var9) {
               var9 = true;
               break label149;
            }
         }

         var9 = false;
      }

      label165: {
         boolean axxxx;
         axxxx = var9;
         var9 = a.fpf.dnp();
         label137:
         if (axx != null) {
            if (var9) {
               var9 = chi.field_1690.field_1903.method_1434();
               if (axx == null) {
                  break label137;
               }

               if (var9) {
                  var9 = a.bza.dnp();
                  if (axx == null) {
                     break label137;
                  }

                  if (var9) {
                     chi.field_1724.method_5728(evd.dbj());
                  }
               }
            }

            var12 = a.fpf.dnp();
            if (axx == null) {
               break label165;
            }

            var9 = var12;
         }

         if (!var9 && !axxx) {
            chi.field_1690.field_1867.method_23481(axxxx);
            chi.field_1724.method_5728(axxxx);
         }

         var12 = a.ezy.dnp();
      }

      label167: {
         float axxxxx = crg.gj(((ImFloat)var12).floatValue(), a.ael.dnp().floatValue());
         float axxxxxx = crg.gj(a.ewl.dnp().floatValue(), a.dih.dnp().floatValue());
         var9 = a.esl.dnp();
         if (axx != null) {
            if (var9) {
               float var19;
               label170: {
                  var14 = a.fub;
                  int var10002 = 17758;
                  long var10003 = 5268204539628168577L ^ ax;
                  int var10001 = a.hfi.emb("Modern Watchdog");
                  if (axx != null) {
                     if (var10001 == 0) {
                        var19 = axxxxxx;
                        break label170;
                     }

                     var10001 = hjr;
                  }

                  var10002 = evd.bpi();
                  if (axx != null) {
                     var10002 = var10002 != 0 ? 1 : 2;
                  }

                  short var17;
                  if (var10001 < var10002) {
                     short var16 = 10203;
                     long var22 = 725995898830806495L ^ ax;
                     var17 = 180;
                  } else {
                     var17 = evd.bpi();
                     if (axx != null) {
                        if (var17 != 0) {
                           short var18 = 18584;
                           long var23 = 8425565133680882322L ^ ax;
                           var17 = 60;
                        } else {
                           var17 = 0;
                        }
                     }
                  }

                  var19 = var17;
               }

               dqq.cms(var14, var19, axxxxx);
            }

            var15 = a;
            if (axx == null) {
               break label167;
            }

            short var20 = 17797;
            long var24 = 5689845757741802829L ^ ax;
            var9 = a.bqc.emb("Update");
         }

         if (!var9) {
            return;
         }

         var15 = a;
      }

      var15.gsj();
   }

   @gdz
   public void dnw(eih event) {
      long ax = efx.a ^ 130677418956617L;
      int[] var4 = dar.abu();
      boolean var10000 = chi.field_1690.field_1903.method_1434();
      if (var4 != null) {
         if (var10000) {
            a.dsa.glr();
         }

         var10000 = a.dsa.fsc(v);
      }

      if (var4 != null) {
         if (!var10000) {
            a.ebp = chi.field_1724.method_31478();
         }

         var10000 = a.bdd.dnp();
      }

      label101: {
         label94:
         if (var4 != null) {
            if (var10000) {
               var10000 = a.cdk.dnp();
               if (var4 == null) {
                  break label94;
               }

               if (var10000) {
                  var10000 = a.bza.dnp();
                  if (var4 == null) {
                     break label94;
                  }

                  if (var10000) {
                     if (chi.field_1724.method_24828()) {
                     }

                     int var8;
                     label85: {
                        label104: {
                           float var5 = a.dfv();
                           float var10001 = chi.field_1724.method_36454() - 110.0F;
                           short var10002 = 14044;
                           long var10003 = 4321176786380273417L ^ ax;
                           bpa.bez(var5 + " expected: " + var10001);
                           var6 = chi.field_1724;
                           float var11;
                           var8 = (var11 = Math.abs(chi.field_1724.method_36454() - 110.0F - a.dfv()) - 30.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
                           if (var4 != null) {
                              if (var8 > 0) {
                                 break label104;
                              }

                              var8 = evd.dbj();
                           }

                           if (var4 == null) {
                              break label85;
                           }

                           if (var8 != 0) {
                              var8 = 1;
                              break label85;
                           }
                        }

                        var8 = 0;
                     }

                     var6.method_5728((boolean)var8);
                  }
               }
            }

            var7 = a;
            if (var4 == null) {
               break label101;
            }

            var10000 = a.fwx;
         }

         if (var10000) {
            short var9 = 21146;
            long var10 = 1886959252846332319L ^ ax;
            if (hjr == 8) {
               a.fwx = false;
            }
         }

         a.fuf();
         var7 = a;
      }

      var7.eth();
   }

   @gdz
   public void dhz(etk event) {
      a.boi(a);
   }

   @gdz
   public void czx(bsm event) {
      long ax = efx.a ^ 15714748086590L;
      int[] var4 = dar.abu();
      efx var10000 = a;
      if (var4 != null) {
         if (!a.dhl.dnp()) {
            return;
         }

         var10000 = a;
      }

      label35: {
         if (var4 != null) {
            if (var10000.hba == null) {
               break label35;
            }

            var10000 = a;
         }

         var10000.adx = a.hba.dnc();
      }

      class_4587 var5 = a.bus();
      short var10004 = 14957;
      long var10005 = 6169096759004370316L ^ ax;
      class_238 var10001 = new class_238(a.fdv.emb("Accurate") ? a.adx : (evd.dbj() ? a.adx.method_10093(chi.field_1724.method_5755()) : a.adx.method_10084()));
      Color var10002 = dar.gqy().deo();
      short var10003 = 21300;
      long var6 = 7021105694031210085L ^ ax;
      bqf.hjf(var5, var10001, var10002, 50);
   }

   @gdz
   public void bjy(ctt event) {
      long ax = efx.a ^ 105764698656053L;
      int[] axx = dar.abu();
      if (a.gso.dnp()) {
         float axxx;
         float axxxx;
         String axxxxx;
         int var10000;
         class_1041 axxxxxx = chi.method_22683();
         axxx = axxxxxx.method_4486() / 2.0F;
         axxxx = axxxxxx.method_4502() / 2.0F + 5.0F;
         axxxxx = String.valueOf(a.dtm());
         String var9 = a.end.dnp();
         byte var10 = -1;
         var10000 = var9.hashCode();
         label48:
         if (axx != null) {
            switch (var10000) {
               case 1956520879:
                  short var10001 = 12853;
                  long var10002 = 8014017672132143488L ^ ax;
                  var10000 = var9.equals("Adjust");
                  if (axx == null) {
                     break label48;
                  }

                  if (var10000 == 0) {
                     break;
                  }

                  var10 = 0;
                  if (axx != null) {
                     break;
                  }
               case -268477211:
                  short var20 = 2388;
                  long var25 = 678646255555416813L ^ ax;
                  var10000 = var9.equals("Astralis");
                  if (axx == null) {
                     break label48;
                  }

                  if (var10000 != 0) {
                     var10 = 1;
                  }
            }

            var10000 = var10;
         }

         switch (var10000) {
            case 0:
               short var21 = 24665;
               long var26 = 6755091283637009346L ^ ax;
               float axxxxxxxxxxxx = acy.eq("Blocks");
               float axxxxxxxxxxxxx = ahh.eq(axxxxx);
               float axxxxxxxxxxxxxx = axxx - (axxxxxxxxxxxxx + 2.0F + axxxxxxxxxxxx) / 2.0F;
               ahh.aof(axxxxx, axxxxxxxxxxxxxx, axxxx, dar.gqy().deo());
               var21 = 6050;
               var26 = 258374945180388403L ^ ax;
               acy.aof("Blocks", axxxxxxxxxxxxxx + axxxxxxxxxxxxx + 2.0F, axxxx, Color.white);
               if (axx != null) {
                  break;
               }
            case 1:
               short var23 = 6050;
               long var28 = 258374945180388403L ^ ax;
               float axxxxxxx = ety.eq("Blocks");
               float axxxxxxxx = bsf.eq(axxxxx);
               float axxxxxxxxx = axxxxxxxx + 2.0F + axxxxxxx;
               float axxxxxxxxxx = axxx - axxxxxxxxx / 2.0F;
               float axxxxxxxxxxx = axxxx + 4.0F;
               float var19 = axxxxxxxxxx - 3.0F;
               float var29 = axxxxxxxxx + 6.0F;
               short var10006 = 11442;
               long var10007 = 8323158425215184326L ^ ax;
               dmp.cpp(var19, axxxx, var29, 15.0F, 3.0F, dec.ceu(Color.black, 150));
               bsf.aof(axxxxx, axxxxxxxxxx, axxxxxxxxxxx, dar.gqy().deo());
               var23 = 6050;
               var28 = 258374945180388403L ^ ax;
               ety.aof("Blocks", axxxxxxxxxx + axxxxxxxx + 2.0F, axxxxxxxxxxx, Color.white);
         }
      }
   }

   private void gsj() {
      long a = efx.a ^ 1645893413115L;
      int[] var10000 = dar.abu();
      fux[] ax = amg.fww(a.czw.dnp());
      int[] axx = var10000;
      int var7 = ax.length;
      if (axx != null) {
         if (var7 == 0) {
            return;
         }

         Arrays.sort(ax, (axxx, axxxx) -> {
            int axx = amg.dzc(axxx);
            int axxx = amg.dzc(axxxx);
            return Integer.compare(axxx, axx);
         });
         var7 = a.flo.dnp();
      }

      if (axx != null) {
         var7 = var7 != 0 ? (int)crg.gj(0.0F, ax.length) : 0;
      }

      int axxx = var7;
      fux axxxx = ax[axxx];
      if (axxxx.gee() == class_1268.field_5808) {
         chi.field_1724.method_31548().method_61496(axxxx.aqk());
      }

      int var10001 = amg.dul(0.0, -1.0, 0.0).method_26215();
      if (axx != null) {
         var10001 = var10001 != 0 ? ++a.btn : 0;
      }

      a.btn = var10001;
      efx var8 = a;
      if (axx != null) {
         if (!a.coa.dnp()) {
            label203: {
               label217: {
                  label201: {
                     label218: {
                        var10001 = a.bdd.dnp();
                        if (axx != null) {
                           if (var10001 == 0) {
                              var10001 = dar.gqy().aws().diy(eky.class).dsv();
                              if (axx == null) {
                                 break label201;
                              }

                              if (var10001 == 0) {
                                 break label218;
                              }
                           }

                           var10001 = chi.field_1690.field_1903.method_1434();
                        }

                        if (axx == null) {
                           break label201;
                        }

                        if (var10001 == 0) {
                           break label217;
                        }
                     }

                     var10001 = a.fwx;
                  }

                  if (axx != null) {
                     if (var10001 != 0) {
                        break label217;
                     }

                     var10001 = chi.field_1724.method_31478();
                  }

                  var13 = var10001;
                  break label203;
               }

               var13 = a.ebp;
            }

            a.hba = amg.asc((int)var13);
         }

         var8 = a;
      }

      if (axx != null) {
         if (var8.hba == null) {
            return;
         }

         var8 = a;
      }

      label220: {
         var9 = var8.btn;
         var10001 = a.exn.dnp().intValue();
         if (axx != null) {
            if (var9 <= var10001) {
               return;
            }

            var9 = a.btd;
            if (axx == null) {
               break label220;
            }

            var10001 = chi.field_1724.field_6012;
         }

         if (var9 == var10001) {
            var9 = a.bn.dnp();
            if (axx == null) {
               break label220;
            }

            if (var9 != 0) {
               return;
            }
         }

         var9 = a.dks();
      }

      label158: {
         label157: {
            label222: {
               if (axx != null) {
                  if (var9 == 0) {
                     return;
                  }

                  chi.field_1761.method_2896(chi.field_1724, axxxx.gee(), new class_3965(a.dri(), a.hba.aoc(), a.hba.dnc(), false));
                  if (axx == null) {
                     break label222;
                  }

                  var9 = a.fqo.dnp();
               }

               if (var9 == 0) {
                  break label157;
               }

               chi.field_1724.method_6104(axxxx.gee());
            }

            if (axx != null) {
               break label158;
            }
         }

         gix.dsd(new class_2879(axxxx.gee()));
      }

      var10 = a;
      label132:
      if (axx != null) {
         if (a.gez.dnp()) {
            var10 = a;
            if (axx == null) {
               break label132;
            }

            short var15 = 10593;
            long var10002 = 5950953247571236633L ^ a;
            label138:
            if (a.cuw.cmt("Watchdog Vertical")) {
               class_310 var11 = chi;
               if (axx != null) {
                  if (!chi.field_1690.field_1903.method_1434()) {
                     break label138;
                  }

                  var11 = chi;
               }

               var11.field_1761
                  .method_2896(
                     chi.field_1724,
                     axxxx.gee(),
                     new class_3965(
                        a.dri(), a.hba.aoc(), new class_2338(a.hba.dnc().method_10263() - 1, a.hba.dnc().method_10264(), a.hba.dnc().method_10260()), false
                     )
                  );
            }
         }

         a.gnd++;
         a.fmm++;
         a.btn = 0;
         var10 = a;
      }

      var10.btd = chi.field_1724.field_6012;
   }

   public static float fuk(float f) {
      long ax = efx.a ^ 84226634279081L;
      int[] var10000 = dar.abu();
      a %= 90.0F;
      int[] var3 = var10000;
      float var7;
      int var5 = (var7 = a - 45.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
      if (var3 != null) {
         if (var5 >= 0) {
            a -= 90.0F;
         }

         if (var3 == null) {
            return a;
         }

         float var8;
         var5 = (var8 = a - -45.0F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
      }

      if (var5 < 0) {
         a += 90.0F;
      }

      return a;
   }

   private float[] dba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.OutOfMemoryError: Java heap space
      //   at org.jetbrains.java.decompiler.util.collections.SFormsFastMapDirect.<init>(SFormsFastMapDirect.java:23)
      //   at org.jetbrains.java.decompiler.util.collections.SFormsFastMapDirect.<init>(SFormsFastMapDirect.java:28)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.getFilteredOutMap(SFormsConstructor.java:275)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.mergeInVarMaps(SFormsConstructor.java:241)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.ssaStatements(SFormsConstructor.java:107)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:94)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SSAUConstructorSparseEx.splitVariables(SSAUConstructorSparseEx.java:43)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:65)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:231)
      //
      // Bytecode:
      // 000: getstatic cc/astralis/efx.a J
      // 003: ldc2_w 139167474333626
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic cc/astralis/dar.abu ()[I
      // 00b: astore 3
      // 00c: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 00f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 012: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 015: aload 0
      // 016: getfield cc/astralis/efx.bld Lcc/astralis/bes;
      // 019: invokevirtual cc/astralis/bes.dnp ()Ljava/lang/Object;
      // 01c: checkcast imgui/type/ImFloat
      // 01f: invokevirtual imgui/type/ImFloat.floatValue ()F
      // 022: fsub
      // 023: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 026: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 029: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
      // 02c: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 02f: aload 3
      // 030: ifnull 05d
      // 033: ifeq 051
      // 036: goto 03d
      // 039: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 03c: athrow
      // 03d: sipush 14237
      // 040: ldc2_w 4610058168480697408
      // 043: lload 1
      // 044: lxor
      // 045: pop2
      // 046: pop
      // 047: ldc_w 45
      // 04a: goto 0aa
      // 04d: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 050: athrow
      // 051: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 054: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 057: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
      // 05a: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 05d: aload 3
      // 05e: ifnull 08b
      // 061: ifeq 07f
      // 064: goto 06b
      // 067: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 06a: athrow
      // 06b: sipush 2257
      // 06e: ldc2_w 2520769002355405590
      // 071: lload 1
      // 072: lxor
      // 073: pop2
      // 074: pop
      // 075: ldc_w -45
      // 078: goto 0aa
      // 07b: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 07e: athrow
      // 07f: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 082: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 085: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
      // 088: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 08b: aload 3
      // 08c: ifnull 0a6
      // 08f: ifeq 0a9
      // 092: goto 099
      // 095: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 098: athrow
      // 099: sipush 24245
      // 09c: ldc2_w 6256740870304916824
      // 09f: lload 1
      // 0a0: lxor
      // 0a1: pop2
      // 0a2: pop
      // 0a3: ldc_w 180
      // 0a6: goto 0aa
      // 0a9: bipush 0
      // 0aa: i2f
      // 0ab: fadd
      // 0ac: fstore 4
      // 0ae: aload 0
      // 0af: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // 0b2: aload 3
      // 0b3: ifnull 0d6
      // 0b6: ifnull 0cf
      // 0b9: goto 0c0
      // 0bc: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: aload 0
      // 0c2: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // 0c5: putfield cc/astralis/efx.hil Lcc/astralis/aqy;
      // 0c8: goto 0cf
      // 0cb: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: getfield cc/astralis/efx.dgj Lcc/astralis/bes;
      // 0d3: invokevirtual cc/astralis/bes.dnp ()Ljava/lang/Object;
      // 0d6: checkcast imgui/type/ImFloat
      // 0d9: invokevirtual imgui/type/ImFloat.floatValue ()F
      // 0dc: fstore 6
      // 0de: invokestatic cc/astralis/evd.dbj ()Z
      // 0e1: aload 3
      // 0e2: ifnull 13c
      // 0e5: ifne 129
      // 0e8: goto 0ef
      // 0eb: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: getfield cc/astralis/efx.hfi Lcc/astralis/adu;
      // 0f3: sipush 17493
      // 0f6: ldc2_w 8367579644308874606
      // 0f9: lload 1
      // 0fa: lxor
      // 0fb: pop2
      // 0fc: pop
      // 0fd: ldc "Modern Watchdog"
      // 0ff: invokevirtual cc/astralis/adu.emb (Ljava/lang/String;)Z
      // 102: aload 3
      // 103: ifnull 13c
      // 106: goto 10d
      // 109: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 10c: athrow
      // 10d: ifeq 129
      // 110: goto 117
      // 113: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 116: athrow
      // 117: bipush 2
      // 118: newarray 6
      // 11a: dup
      // 11b: bipush 0
      // 11c: fload 4
      // 11e: fastore
      // 11f: dup
      // 120: bipush 1
      // 121: fload 6
      // 123: fastore
      // 124: areturn
      // 125: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 128: athrow
      // 129: aload 0
      // 12a: getfield cc/astralis/efx.hfi Lcc/astralis/adu;
      // 12d: sipush 17758
      // 130: ldc2_w 5268116525027779703
      // 133: lload 1
      // 134: lxor
      // 135: pop2
      // 136: pop
      // 137: ldc "Modern Watchdog"
      // 139: invokevirtual cc/astralis/adu.emb (Ljava/lang/String;)Z
      // 13c: ifeq 238
      // 13f: new net/minecraft/class_243
      // 142: dup
      // 143: aload 0
      // 144: getfield cc/astralis/efx.adx Lnet/minecraft/class_2338;
      // 147: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 14a: i2d
      // 14b: ldc2_w 0.5
      // 14e: dadd
      // 14f: aload 0
      // 150: getfield cc/astralis/efx.adx Lnet/minecraft/class_2338;
      // 153: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 156: i2d
      // 157: aload 0
      // 158: getfield cc/astralis/efx.adx Lnet/minecraft/class_2338;
      // 15b: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 15e: i2d
      // 15f: ldc2_w 0.5
      // 162: dadd
      // 163: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 166: astore 8
      // 168: invokestatic cc/astralis/evd.fgd ()F
      // 16b: f2d
      // 16c: dstore 9
      // 16e: dload 9
      // 170: invokestatic java/lang/Math.sin (D)D
      // 173: dneg
      // 174: dstore 11
      // 176: dload 9
      // 178: invokestatic java/lang/Math.cos (D)D
      // 17b: dstore 13
      // 17d: aload 8
      // 17f: getfield net/minecraft/class_243.field_1352 D
      // 182: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 185: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 188: invokevirtual net/minecraft/class_746.method_23317 ()D
      // 18b: dsub
      // 18c: dstore 15
      // 18e: aload 8
      // 190: getfield net/minecraft/class_243.field_1350 D
      // 193: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 196: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 199: invokevirtual net/minecraft/class_746.method_23321 ()D
      // 19c: dsub
      // 19d: dstore 17
      // 19f: dload 11
      // 1a1: dload 17
      // 1a3: dmul
      // 1a4: dload 13
      // 1a6: dload 15
      // 1a8: dmul
      // 1a9: dsub
      // 1aa: dconst_0
      // 1ab: dcmpl
      // 1ac: aload 3
      // 1ad: ifnull 1bb
      // 1b0: ifle 1be
      // 1b3: goto 1ba
      // 1b6: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1b9: athrow
      // 1ba: bipush 1
      // 1bb: goto 1bf
      // 1be: bipush 0
      // 1bf: istore 7
      // 1c1: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 1c4: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1c7: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 1ca: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 1cd: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1d0: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
      // 1d3: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
      // 1d6: getfield net/minecraft/class_241.field_1343 F
      // 1d9: f2d
      // 1da: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 1dd: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1e0: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
      // 1e3: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
      // 1e6: getfield net/minecraft/class_241.field_1342 F
      // 1e9: f2d
      // 1ea: invokestatic java/lang/Math.atan2 (DD)D
      // 1ed: invokestatic java/lang/Math.toDegrees (D)D
      // 1f0: d2f
      // 1f1: fsub
      // 1f2: invokestatic cc/astralis/efx.fuk (F)F
      // 1f5: fstore 19
      // 1f7: ldc_w 260.0
      // 1fa: fstore 20
      // 1fc: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 1ff: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 202: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 205: invokestatic cc/astralis/evd.bpi ()Z
      // 208: aload 3
      // 209: ifnull 222
      // 20c: ifeq 220
      // 20f: goto 216
      // 212: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 215: athrow
      // 216: ldc_w -135.0
      // 219: goto 231
      // 21c: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 21f: athrow
      // 220: iload 7
      // 222: ifne 22e
      // 225: fload 20
      // 227: goto 231
      // 22a: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22d: athrow
      // 22e: fload 20
      // 230: fneg
      // 231: fadd
      // 232: fstore 5
      // 234: aload 3
      // 235: ifnonnull 2e1
      // 238: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 23b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 23e: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 241: aload 0
      // 242: getfield cc/astralis/efx.bld Lcc/astralis/bes;
      // 245: invokevirtual cc/astralis/bes.dnp ()Ljava/lang/Object;
      // 248: checkcast imgui/type/ImFloat
      // 24b: invokevirtual imgui/type/ImFloat.floatValue ()F
      // 24e: fsub
      // 24f: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 252: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 255: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
      // 258: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 25b: aload 3
      // 25c: ifnull 290
      // 25f: goto 266
      // 262: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 265: athrow
      // 266: ifeq 284
      // 269: goto 270
      // 26c: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 26f: athrow
      // 270: sipush 20293
      // 273: ldc2_w 2731960675547313327
      // 276: lload 1
      // 277: lxor
      // 278: pop2
      // 279: pop
      // 27a: ldc_w 45
      // 27d: goto 2dd
      // 280: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 283: athrow
      // 284: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 287: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 28a: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
      // 28d: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 290: aload 3
      // 291: ifnull 2be
      // 294: ifeq 2b2
      // 297: goto 29e
      // 29a: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 29d: athrow
      // 29e: sipush 19241
      // 2a1: ldc2_w 2806683832130728153
      // 2a4: lload 1
      // 2a5: lxor
      // 2a6: pop2
      // 2a7: pop
      // 2a8: ldc_w -45
      // 2ab: goto 2dd
      // 2ae: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2b1: athrow
      // 2b2: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 2b5: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 2b8: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
      // 2bb: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 2be: aload 3
      // 2bf: ifnull 2d9
      // 2c2: ifeq 2dc
      // 2c5: goto 2cc
      // 2c8: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2cb: athrow
      // 2cc: sipush 10203
      // 2cf: ldc2_w 725978257269529641
      // 2d2: lload 1
      // 2d3: lxor
      // 2d4: pop2
      // 2d5: pop
      // 2d6: ldc_w 180
      // 2d9: goto 2dd
      // 2dc: bipush 0
      // 2dd: i2f
      // 2de: fadd
      // 2df: fstore 5
      // 2e1: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 2e4: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2e7: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 2ea: ldc_w 45.0
      // 2ed: fadd
      // 2ee: fstore 7
      // 2f0: aload 0
      // 2f1: invokevirtual cc/astralis/efx.erx ()Z
      // 2f4: aload 3
      // 2f5: ifnull eee
      // 2f8: ifeq ee6
      // 2fb: goto 302
      // 2fe: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 301: athrow
      // 302: bipush 0
      // 303: istore 8
      // 305: fload 5
      // 307: fstore 9
      // 309: fload 6
      // 30b: fstore 10
      // 30d: aload 0
      // 30e: getfield cc/astralis/efx.aof Lcc/astralis/gbp;
      // 311: invokevirtual cc/astralis/gbp.dnp ()Ljava/lang/Object;
      // 314: checkcast java/lang/Boolean
      // 317: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 31a: aload 3
      // 31b: ifnull 365
      // 31e: ifne 34a
      // 321: goto 328
      // 324: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 327: athrow
      // 328: aload 0
      // 329: getfield cc/astralis/efx.dgy Lcc/astralis/gbp;
      // 32c: invokevirtual cc/astralis/gbp.dnp ()Ljava/lang/Object;
      // 32f: checkcast java/lang/Boolean
      // 332: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 335: aload 3
      // 336: ifnull 58c
      // 339: goto 340
      // 33c: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 33f: athrow
      // 340: ifeq 57f
      // 343: goto 34a
      // 346: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 349: athrow
      // 34a: aload 0
      // 34b: getfield cc/astralis/efx.hfi Lcc/astralis/adu;
      // 34e: sipush 31831
      // 351: ldc2_w 1685727535056411989
      // 354: lload 1
      // 355: lxor
      // 356: pop2
      // 357: pop
      // 358: ldc_w "Intave"
      // 35b: invokevirtual cc/astralis/adu.emb (Ljava/lang/String;)Z
      // 35e: goto 365
      // 361: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 364: athrow
      // 365: aload 3
      // 366: ifnull 58c
      // 369: ifne 57f
      // 36c: goto 373
      // 36f: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 372: athrow
      // 373: aload 0
      // 374: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // 377: aload 3
      // 378: ifnull 586
      // 37b: goto 382
      // 37e: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 381: athrow
      // 382: ifnull 57f
      // 385: goto 38c
      // 388: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 38b: athrow
      // 38c: aload 0
      // 38d: getfield cc/astralis/efx.dgy Lcc/astralis/gbp;
      // 390: invokevirtual cc/astralis/gbp.dnp ()Ljava/lang/Object;
      // 393: checkcast java/lang/Boolean
      // 396: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 399: aload 3
      // 39a: ifnull 484
      // 39d: goto 3a4
      // 3a0: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3a3: athrow
      // 3a4: ifeq 477
      // 3a7: goto 3ae
      // 3aa: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3ad: athrow
      // 3ae: ldc_w 90.0
      // 3b1: fstore 11
      // 3b3: fload 11
      // 3b5: ldc_w 30.0
      // 3b8: fcmpl
      // 3b9: ifle 477
      // 3bc: iload 8
      // 3be: aload 3
      // 3bf: ifnull 484
      // 3c2: aload 3
      // 3c3: ifnull 484
      // 3c6: goto 3cd
      // 3c9: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3cc: athrow
      // 3cd: ifne 477
      // 3d0: goto 3d7
      // 3d3: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3d6: athrow
      // 3d7: aload 0
      // 3d8: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // 3db: invokevirtual cc/astralis/aqy.aoc ()Lnet/minecraft/class_2350;
      // 3de: aload 0
      // 3df: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // 3e2: invokevirtual cc/astralis/aqy.dnc ()Lnet/minecraft/class_2338;
      // 3e5: bipush 1
      // 3e6: ldc 5.0
      // 3e8: fload 5
      // 3ea: fload 11
      // 3ec: invokestatic cc/astralis/bfc.gto (Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;ZFFF)Z
      // 3ef: aload 3
      // 3f0: ifnull 40d
      // 3f3: goto 3fa
      // 3f6: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3f9: athrow
      // 3fa: ifeq 425
      // 3fd: goto 404
      // 400: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 403: athrow
      // 404: fload 5
      // 406: fstore 9
      // 408: fload 11
      // 40a: fstore 10
      // 40c: bipush 1
      // 40d: istore 8
      // 40f: aload 0
      // 410: bipush 2
      // 411: newarray 6
      // 413: dup
      // 414: bipush 0
      // 415: fload 9
      // 417: fastore
      // 418: dup
      // 419: bipush 1
      // 41a: fload 10
      // 41c: fastore
      // 41d: putfield cc/astralis/efx.gpi [F
      // 420: aload 0
      // 421: bipush 0
      // 422: putfield cc/astralis/efx.hek I
      // 425: fload 11
      // 427: fload 11
      // 429: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 42c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 42f: getstatic net/minecraft/class_1294.field_5904 Lnet/minecraft/class_6880;
      // 432: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
      // 435: aload 3
      // 436: ifnull 450
      // 439: ifeq 453
      // 43c: goto 443
      // 43f: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 442: athrow
      // 443: sipush 29868
      // 446: ldc2_w 7902739088776941389
      // 449: lload 1
      // 44a: lxor
      // 44b: pop2
      // 44c: pop
      // 44d: ldc_w 60
      // 450: goto 460
      // 453: sipush 17228
      // 456: ldc2_w 4408724373406218398
      // 459: lload 1
      // 45a: lxor
      // 45b: pop2
      // 45c: pop
      // 45d: ldc_w 80
      // 460: i2f
      // 461: fcmpl
      // 462: ifle 46f
      // 465: ldc_w 0.5
      // 468: goto 470
      // 46b: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 46e: athrow
      // 46f: fconst_2
      // 470: fsub
      // 471: fstore 11
      // 473: aload 3
      // 474: ifnonnull 3b3
      // 477: aload 0
      // 478: getfield cc/astralis/efx.aof Lcc/astralis/gbp;
      // 47b: invokevirtual cc/astralis/gbp.dnp ()Ljava/lang/Object;
      // 47e: checkcast java/lang/Boolean
      // 481: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 484: aload 3
      // 485: ifnull 58c
      // 488: ifeq 57f
      // 48b: goto 492
      // 48e: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 491: athrow
      // 492: iload 8
      // 494: aload 3
      // 495: ifnull 58c
      // 498: goto 49f
      // 49b: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 49e: athrow
      // 49f: ifne 57f
      // 4a2: goto 4a9
      // 4a5: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4a8: athrow
      // 4a9: fconst_0
      // 4aa: fstore 11
      // 4ac: fload 11
      // 4ae: ldc_w 180.0
      // 4b1: fcmpg
      // 4b2: ifgt 57f
      // 4b5: iload 8
      // 4b7: aload 3
      // 4b8: ifnull 58c
      // 4bb: aload 3
      // 4bc: ifnull 58c
      // 4bf: goto 4c6
      // 4c2: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4c5: athrow
      // 4c6: ifne 57f
      // 4c9: goto 4d0
      // 4cc: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4cf: athrow
      // 4d0: ldc_w -1.0
      // 4d3: fstore 12
      // 4d5: fload 12
      // 4d7: fconst_1
      // 4d8: fcmpg
      // 4d9: ifgt 574
      // 4dc: iload 8
      // 4de: aload 3
      // 4df: ifnull 4b2
      // 4e2: ifne 574
      // 4e5: fload 5
      // 4e7: fload 11
      // 4e9: fload 12
      // 4eb: fmul
      // 4ec: fadd
      // 4ed: fstore 13
      // 4ef: ldc_w 85.0
      // 4f2: fstore 14
      // 4f4: fload 14
      // 4f6: ldc_w 30.0
      // 4f9: fcmpl
      // 4fa: ifle 56a
      // 4fd: iload 8
      // 4ff: aload 3
      // 500: ifnull 4d9
      // 503: aload 3
      // 504: ifnull 530
      // 507: ifne 56a
      // 50a: goto 511
      // 50d: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 510: athrow
      // 511: aload 0
      // 512: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // 515: invokevirtual cc/astralis/aqy.aoc ()Lnet/minecraft/class_2350;
      // 518: aload 0
      // 519: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // 51c: invokevirtual cc/astralis/aqy.dnc ()Lnet/minecraft/class_2338;
      // 51f: bipush 1
      // 520: ldc 5.0
      // 522: fload 13
      // 524: fload 14
      // 526: invokestatic cc/astralis/bfc.gto (Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;ZFFF)Z
      // 529: goto 530
      // 52c: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 52f: athrow
      // 530: aload 3
      // 531: ifnull 547
      // 534: ifeq 55f
      // 537: goto 53e
      // 53a: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 53d: athrow
      // 53e: fload 13
      // 540: fstore 9
      // 542: fload 14
      // 544: fstore 10
      // 546: bipush 1
      // 547: istore 8
      // 549: aload 0
      // 54a: bipush 2
      // 54b: newarray 6
      // 54d: dup
      // 54e: bipush 0
      // 54f: fload 9
      // 551: fastore
      // 552: dup
      // 553: bipush 1
      // 554: fload 10
      // 556: fastore
      // 557: putfield cc/astralis/efx.gpi [F
      // 55a: aload 0
      // 55b: bipush 0
      // 55c: putfield cc/astralis/efx.hek I
      // 55f: fload 14
      // 561: ldc 5.0
      // 563: fsub
      // 564: fstore 14
      // 566: aload 3
      // 567: ifnonnull 4f4
      // 56a: fload 12
      // 56c: fconst_2
      // 56d: fadd
      // 56e: fstore 12
      // 570: aload 3
      // 571: ifnonnull 4d5
      // 574: fload 11
      // 576: ldc 5.0
      // 578: fadd
      // 579: fstore 11
      // 57b: aload 3
      // 57c: ifnonnull 4ac
      // 57f: aload 0
      // 580: getfield cc/astralis/efx.aof Lcc/astralis/gbp;
      // 583: invokevirtual cc/astralis/gbp.dnp ()Ljava/lang/Object;
      // 586: checkcast java/lang/Boolean
      // 589: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 58c: ifeq 598
      // 58f: fload 9
      // 591: goto 59a
      // 594: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 597: athrow
      // 598: fload 5
      // 59a: fstore 5
      // 59c: aload 0
      // 59d: getfield cc/astralis/efx.dgy Lcc/astralis/gbp;
      // 5a0: invokevirtual cc/astralis/gbp.dnp ()Ljava/lang/Object;
      // 5a3: checkcast java/lang/Boolean
      // 5a6: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5a9: ifeq 5b5
      // 5ac: fload 10
      // 5ae: goto 5b7
      // 5b1: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5b4: athrow
      // 5b5: fload 6
      // 5b7: fstore 6
      // 5b9: aload 0
      // 5ba: getfield cc/astralis/efx.hfi Lcc/astralis/adu;
      // 5bd: invokevirtual cc/astralis/adu.dnp ()Ljava/lang/Object;
      // 5c0: checkcast java/lang/String
      // 5c3: astore 11
      // 5c5: bipush -1
      // 5c6: istore 12
      // 5c8: aload 11
      // 5ca: invokevirtual java/lang/String.hashCode ()I
      // 5cd: aload 3
      // 5ce: ifnull 721
      // 5d1: lookupswitch 334 6 -2099899231 292 -1310785555 246 -638370176 154 2154973 200 63955982 63 482016750 109
      // 60c: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 60f: athrow
      // 610: aload 11
      // 612: sipush 3952
      // 615: ldc2_w 5313209609133043303
      // 618: lload 1
      // 619: lxor
      // 61a: pop2
      // 61b: pop
      // 61c: ldc_w "Basic"
      // 61f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 622: aload 3
      // 623: ifnull 721
      // 626: goto 62d
      // 629: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 62c: athrow
      // 62d: ifeq 71f
      // 630: goto 637
      // 633: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 636: athrow
      // 637: bipush 0
      // 638: istore 12
      // 63a: aload 3
      // 63b: ifnonnull 71f
      // 63e: aload 11
      // 640: sipush 17758
      // 643: ldc2_w 5268116525027779703
      // 646: lload 1
      // 647: lxor
      // 648: pop2
      // 649: pop
      // 64a: ldc "Modern Watchdog"
      // 64c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 64f: aload 3
      // 650: ifnull 721
      // 653: goto 65a
      // 656: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 659: athrow
      // 65a: ifeq 71f
      // 65d: goto 664
      // 660: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 663: athrow
      // 664: bipush 1
      // 665: istore 12
      // 667: aload 3
      // 668: ifnonnull 71f
      // 66b: aload 11
      // 66d: sipush 3342
      // 670: ldc2_w 4678491614261390351
      // 673: lload 1
      // 674: lxor
      // 675: pop2
      // 676: pop
      // 677: ldc_w "Modern Watchdog 2"
      // 67a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 67d: aload 3
      // 67e: ifnull 721
      // 681: goto 688
      // 684: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 687: athrow
      // 688: ifeq 71f
      // 68b: goto 692
      // 68e: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 691: athrow
      // 692: bipush 2
      // 693: istore 12
      // 695: aload 3
      // 696: ifnonnull 71f
      // 699: aload 11
      // 69b: sipush 20551
      // 69e: ldc2_w 422302444792148323
      // 6a1: lload 1
      // 6a2: lxor
      // 6a3: pop2
      // 6a4: pop
      // 6a5: ldc_w "Edge"
      // 6a8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6ab: aload 3
      // 6ac: ifnull 721
      // 6af: goto 6b6
      // 6b2: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6b5: athrow
      // 6b6: ifeq 71f
      // 6b9: goto 6c0
      // 6bc: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6bf: athrow
      // 6c0: bipush 3
      // 6c1: istore 12
      // 6c3: aload 3
      // 6c4: ifnonnull 71f
      // 6c7: aload 11
      // 6c9: sipush 2822
      // 6cc: ldc2_w 7774212677414627877
      // 6cf: lload 1
      // 6d0: lxor
      // 6d1: pop2
      // 6d2: pop
      // 6d3: ldc_w "God Bridge"
      // 6d6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6d9: aload 3
      // 6da: ifnull 721
      // 6dd: goto 6e4
      // 6e0: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6e3: athrow
      // 6e4: ifeq 71f
      // 6e7: goto 6ee
      // 6ea: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6ed: athrow
      // 6ee: bipush 4
      // 6ef: istore 12
      // 6f1: aload 3
      // 6f2: ifnonnull 71f
      // 6f5: aload 11
      // 6f7: sipush 18203
      // 6fa: ldc2_w 8473871843768100359
      // 6fd: lload 1
      // 6fe: lxor
      // 6ff: pop2
      // 700: pop
      // 701: ldc_w "Intave"
      // 704: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 707: aload 3
      // 708: ifnull 721
      // 70b: goto 712
      // 70e: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 711: athrow
      // 712: ifeq 71f
      // 715: goto 71c
      // 718: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 71b: athrow
      // 71c: bipush 5
      // 71d: istore 12
      // 71f: iload 12
      // 721: aload 3
      // 722: ifnull 751
      // 725: tableswitch 1981 0 5 43 57 147 432 947 1787
      // 74c: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 74f: athrow
      // 750: bipush 2
      // 751: newarray 6
      // 753: dup
      // 754: bipush 0
      // 755: fload 5
      // 757: fastore
      // 758: dup
      // 759: bipush 1
      // 75a: fload 6
      // 75c: fastore
      // 75d: areturn
      // 75e: aload 0
      // 75f: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // 762: aload 3
      // 763: ifnull 77b
      // 766: ifnull 7aa
      // 769: goto 770
      // 76c: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 76f: athrow
      // 770: aload 0
      // 771: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // 774: goto 77b
      // 777: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 77a: athrow
      // 77b: getfield cc/astralis/aqy.dnc Lnet/minecraft/class_2338;
      // 77e: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 781: i2d
      // 782: aload 0
      // 783: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // 786: getfield cc/astralis/aqy.dnc Lnet/minecraft/class_2338;
      // 789: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 78c: i2d
      // 78d: aload 0
      // 78e: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // 791: getfield cc/astralis/aqy.dnc Lnet/minecraft/class_2338;
      // 794: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 797: i2d
      // 798: aload 0
      // 799: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // 79c: getfield cc/astralis/aqy.aoc Lnet/minecraft/class_2350;
      // 79f: invokestatic cc/astralis/efx.eze (DDDLnet/minecraft/class_2350;)[F
      // 7a2: astore 13
      // 7a4: aload 13
      // 7a6: bipush 1
      // 7a7: faload
      // 7a8: fstore 6
      // 7aa: bipush 2
      // 7ab: newarray 6
      // 7ad: dup
      // 7ae: bipush 0
      // 7af: fload 5
      // 7b1: fastore
      // 7b2: dup
      // 7b3: bipush 1
      // 7b4: fload 6
      // 7b6: fastore
      // 7b7: areturn
      // 7b8: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 7bb: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 7be: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
      // 7c1: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 7c4: istore 13
      // 7c6: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 7c9: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 7cc: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
      // 7cf: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 7d2: istore 14
      // 7d4: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 7d7: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 7da: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 7dd: iload 14
      // 7df: aload 3
      // 7e0: ifnull 803
      // 7e3: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 7e6: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 7e9: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
      // 7ec: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 7ef: if_icmpne 801
      // 7f2: goto 7f9
      // 7f5: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 7f8: athrow
      // 7f9: dconst_0
      // 7fa: goto 811
      // 7fd: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 800: athrow
      // 801: iload 14
      // 803: ifeq 80e
      // 806: dconst_1
      // 807: goto 811
      // 80a: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 80d: athrow
      // 80e: ldc2_w -1.0
      // 811: iload 13
      // 813: aload 3
      // 814: ifnull 837
      // 817: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 81a: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 81d: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
      // 820: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 823: if_icmpne 835
      // 826: goto 82d
      // 829: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 82c: athrow
      // 82d: dconst_0
      // 82e: goto 845
      // 831: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 834: athrow
      // 835: iload 13
      // 837: ifeq 842
      // 83a: dconst_1
      // 83b: goto 845
      // 83e: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 841: athrow
      // 842: ldc2_w -1.0
      // 845: invokestatic java/lang/Math.atan2 (DD)D
      // 848: invokestatic java/lang/Math.toDegrees (D)D
      // 84b: d2f
      // 84c: fsub
      // 84d: fstore 15
      // 84f: fload 15
      // 851: invokestatic cc/astralis/efx.fuk (F)F
      // 854: fstore 16
      // 856: bipush 2
      // 857: newarray 6
      // 859: dup
      // 85a: bipush 0
      // 85b: fload 15
      // 85d: getstatic cc/astralis/efx.gig I
      // 860: aload 3
      // 861: ifnull 881
      // 864: bipush 1
      // 865: if_icmpne 877
      // 868: goto 86f
      // 86b: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 86e: athrow
      // 86f: bipush 0
      // 870: goto 8ac
      // 873: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 876: athrow
      // 877: fload 16
      // 879: invokestatic java/lang/Math.abs (F)F
      // 87c: f2d
      // 87d: ldc2_w 22.5
      // 880: dcmpl
      // 881: aload 3
      // 882: ifnull 89c
      // 885: ifle 89f
      // 888: goto 88f
      // 88b: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 88e: athrow
      // 88f: sipush 19437
      // 892: ldc2_w 8724396567992201270
      // 895: lload 1
      // 896: lxor
      // 897: pop2
      // 898: pop
      // 899: ldc_w -140
      // 89c: goto 8ac
      // 89f: sipush 9865
      // 8a2: ldc2_w 5589048730744659316
      // 8a5: lload 1
      // 8a6: lxor
      // 8a7: pop2
      // 8a8: pop
      // 8a9: ldc_w 90
      // 8ac: i2f
      // 8ad: fload 16
      // 8af: aload 3
      // 8b0: ifnull 8c9
      // 8b3: fconst_0
      // 8b4: fcmpl
      // 8b5: ifne 8c7
      // 8b8: goto 8bf
      // 8bb: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 8be: athrow
      // 8bf: fconst_1
      // 8c0: goto 8cc
      // 8c3: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 8c6: athrow
      // 8c7: fload 16
      // 8c9: invokestatic java/lang/Math.signum (F)F
      // 8cc: fmul
      // 8cd: fadd
      // 8ce: fastore
      // 8cf: dup
      // 8d0: bipush 1
      // 8d1: fload 6
      // 8d3: fastore
      // 8d4: areturn
      // 8d5: invokestatic cc/astralis/evd.fnh ()F
      // 8d8: fstore 13
      // 8da: aload 0
      // 8db: getfield cc/astralis/efx.ggy Lcc/astralis/gbp;
      // 8de: invokevirtual cc/astralis/gbp.dnp ()Ljava/lang/Object;
      // 8e1: checkcast java/lang/Boolean
      // 8e4: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8e7: aload 3
      // 8e8: ifnull 92d
      // 8eb: ifeq 92a
      // 8ee: goto 8f5
      // 8f1: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 8f4: athrow
      // 8f5: invokestatic cc/astralis/evd.dbj ()Z
      // 8f8: aload 3
      // 8f9: ifnull 92d
      // 8fc: goto 903
      // 8ff: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 902: athrow
      // 903: ifne 92a
      // 906: goto 90d
      // 909: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 90c: athrow
      // 90d: bipush 2
      // 90e: newarray 6
      // 910: dup
      // 911: bipush 0
      // 912: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 915: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 918: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 91b: ldc_w 180.0
      // 91e: fsub
      // 91f: fastore
      // 920: dup
      // 921: bipush 1
      // 922: fload 6
      // 924: fastore
      // 925: areturn
      // 926: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 929: athrow
      // 92a: invokestatic cc/astralis/evd.fsj ()Z
      // 92d: aload 3
      // 92e: ifnull 951
      // 931: ifeq 94d
      // 934: goto 93b
      // 937: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 93a: athrow
      // 93b: bipush 2
      // 93c: newarray 6
      // 93e: dup
      // 93f: bipush 0
      // 940: fload 5
      // 942: fastore
      // 943: dup
      // 944: bipush 1
      // 945: fload 6
      // 947: fastore
      // 948: areturn
      // 949: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 94c: athrow
      // 94d: aload 0
      // 94e: getfield cc/astralis/efx.hci Z
      // 951: aload 3
      // 952: ifnull 9be
      // 955: ifne 9b3
      // 958: goto 95f
      // 95b: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 95e: athrow
      // 95f: aload 0
      // 960: aload 3
      // 961: ifnull 980
      // 964: goto 96b
      // 967: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 96a: athrow
      // 96b: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // 96e: ifnull 984
      // 971: goto 978
      // 974: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 977: athrow
      // 978: aload 0
      // 979: goto 980
      // 97c: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 97f: athrow
      // 980: bipush 1
      // 981: putfield cc/astralis/efx.hci Z
      // 984: bipush 2
      // 985: newarray 6
      // 987: dup
      // 988: bipush 0
      // 989: invokestatic cc/astralis/evd.bpi ()Z
      // 98c: ifeq 9a1
      // 98f: fload 13
      // 991: ldc_w 140.0
      // 994: fsub
      // 995: aload 0
      // 996: getfield cc/astralis/efx.dku F
      // 999: fadd
      // 99a: goto 9ac
      // 99d: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 9a0: athrow
      // 9a1: fload 13
      // 9a3: ldc_w 100.0
      // 9a6: fadd
      // 9a7: aload 0
      // 9a8: getfield cc/astralis/efx.dku F
      // 9ab: fadd
      // 9ac: fastore
      // 9ad: dup
      // 9ae: bipush 1
      // 9af: fload 6
      // 9b1: fastore
      // 9b2: areturn
      // 9b3: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 9b6: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 9b9: getfield net/minecraft/class_746.field_6012 I
      // 9bc: bipush 3
      // 9bd: irem
      // 9be: ifne 9d2
      // 9c1: aload 0
      // 9c2: fconst_0
      // 9c3: ldc 9.0
      // 9c5: invokestatic cc/astralis/crg.gj (FF)F
      // 9c8: putfield cc/astralis/efx.dku F
      // 9cb: goto 9d2
      // 9ce: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 9d1: athrow
      // 9d2: new net/minecraft/class_243
      // 9d5: dup
      // 9d6: aload 0
      // 9d7: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // 9da: getfield cc/astralis/aqy.dnc Lnet/minecraft/class_2338;
      // 9dd: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 9e0: i2d
      // 9e1: ldc2_w 0.5
      // 9e4: dadd
      // 9e5: aload 0
      // 9e6: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // 9e9: getfield cc/astralis/aqy.dnc Lnet/minecraft/class_2338;
      // 9ec: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 9ef: i2d
      // 9f0: aload 0
      // 9f1: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // 9f4: getfield cc/astralis/aqy.dnc Lnet/minecraft/class_2338;
      // 9f7: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 9fa: i2d
      // 9fb: ldc2_w 0.5
      // 9fe: dadd
      // 9ff: invokespecial net/minecraft/class_243.<init> (DDD)V
      // a02: astore 15
      // a04: fload 13
      // a06: f2d
      // a07: invokestatic java/lang/Math.toRadians (D)D
      // a0a: dstore 16
      // a0c: dload 16
      // a0e: invokestatic java/lang/Math.sin (D)D
      // a11: dneg
      // a12: dstore 18
      // a14: dload 16
      // a16: invokestatic java/lang/Math.cos (D)D
      // a19: dstore 20
      // a1b: aload 15
      // a1d: getfield net/minecraft/class_243.field_1352 D
      // a20: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // a23: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // a26: invokevirtual net/minecraft/class_746.method_23317 ()D
      // a29: dsub
      // a2a: dstore 22
      // a2c: aload 15
      // a2e: getfield net/minecraft/class_243.field_1350 D
      // a31: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // a34: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // a37: invokevirtual net/minecraft/class_746.method_23321 ()D
      // a3a: dsub
      // a3b: dstore 24
      // a3d: dload 18
      // a3f: dload 24
      // a41: dmul
      // a42: dload 20
      // a44: dload 22
      // a46: dmul
      // a47: dsub
      // a48: dconst_0
      // a49: dcmpl
      // a4a: aload 3
      // a4b: ifnull a59
      // a4e: ifle a5c
      // a51: goto a58
      // a54: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // a57: athrow
      // a58: bipush 1
      // a59: goto a5d
      // a5c: bipush 0
      // a5d: istore 14
      // a5f: invokestatic cc/astralis/evd.bpi ()Z
      // a62: aload 3
      // a63: ifnull a8f
      // a66: ifeq a85
      // a69: goto a70
      // a6c: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // a6f: athrow
      // a70: aload 0
      // a71: fload 13
      // a73: ldc_w 140.0
      // a76: fsub
      // a77: putfield cc/astralis/efx.dxn F
      // a7a: aload 3
      // a7b: ifnonnull ac7
      // a7e: goto a85
      // a81: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // a84: athrow
      // a85: invokestatic cc/astralis/evd.bpi ()Z
      // a88: goto a8f
      // a8b: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // a8e: athrow
      // a8f: aload 3
      // a90: ifnull ac8
      // a93: ifne ac7
      // a96: goto a9d
      // a99: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // a9c: athrow
      // a9d: aload 0
      // a9e: fload 13
      // aa0: iload 14
      // aa2: ifeq abb
      // aa5: goto aac
      // aa8: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // aab: athrow
      // aac: ldc_w 100.0
      // aaf: aload 0
      // ab0: getfield cc/astralis/efx.dku F
      // ab3: fadd
      // ab4: goto ac3
      // ab7: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // aba: athrow
      // abb: ldc_w -100.0
      // abe: aload 0
      // abf: getfield cc/astralis/efx.dku F
      // ac2: fsub
      // ac3: fadd
      // ac4: putfield cc/astralis/efx.dxn F
      // ac7: bipush 2
      // ac8: newarray 6
      // aca: dup
      // acb: bipush 0
      // acc: aload 0
      // acd: getfield cc/astralis/efx.dxn F
      // ad0: fastore
      // ad1: dup
      // ad2: bipush 1
      // ad3: ldc_w 82.0
      // ad6: fastore
      // ad7: areturn
      // ad8: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // adb: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // ade: astore 13
      // ae0: aload 13
      // ae2: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
      // ae5: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // ae8: istore 14
      // aea: aload 13
      // aec: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
      // aef: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // af2: istore 15
      // af4: aload 13
      // af6: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
      // af9: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // afc: istore 16
      // afe: aload 13
      // b00: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
      // b03: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // b06: istore 17
      // b08: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // b0b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // b0e: invokevirtual net/minecraft/class_746.method_36454 ()F
      // b11: ldc_w 180.0
      // b14: fsub
      // b15: iload 14
      // b17: aload 3
      // b18: ifnull b7e
      // b1b: iload 15
      // b1d: if_icmpne b7c
      // b20: goto b27
      // b23: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // b26: athrow
      // b27: iload 16
      // b29: aload 3
      // b2a: ifnull b4a
      // b2d: goto b34
      // b30: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // b33: athrow
      // b34: iload 17
      // b36: if_icmpne b48
      // b39: goto b40
      // b3c: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // b3f: athrow
      // b40: bipush 0
      // b41: goto c34
      // b44: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // b47: athrow
      // b48: iload 16
      // b4a: aload 3
      // b4b: ifnull b79
      // b4e: ifeq b6c
      // b51: goto b58
      // b54: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // b57: athrow
      // b58: sipush 28280
      // b5b: ldc2_w 7573004262951015814
      // b5e: lload 1
      // b5f: lxor
      // b60: pop2
      // b61: pop
      // b62: ldc_w -90
      // b65: goto c34
      // b68: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // b6b: athrow
      // b6c: sipush 26747
      // b6f: ldc2_w 2748581162446214037
      // b72: lload 1
      // b73: lxor
      // b74: pop2
      // b75: pop
      // b76: ldc_w 90
      // b79: goto c34
      // b7c: iload 14
      // b7e: aload 3
      // b7f: ifnull be3
      // b82: ifeq be1
      // b85: goto b8c
      // b88: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // b8b: athrow
      // b8c: iload 16
      // b8e: aload 3
      // b8f: ifnull baf
      // b92: goto b99
      // b95: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // b98: athrow
      // b99: iload 17
      // b9b: if_icmpne bad
      // b9e: goto ba5
      // ba1: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // ba4: athrow
      // ba5: bipush 0
      // ba6: goto c34
      // ba9: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // bac: athrow
      // bad: iload 16
      // baf: aload 3
      // bb0: ifnull bde
      // bb3: ifeq bd1
      // bb6: goto bbd
      // bb9: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // bbc: athrow
      // bbd: sipush 19241
      // bc0: ldc2_w 2806683832130728153
      // bc3: lload 1
      // bc4: lxor
      // bc5: pop2
      // bc6: pop
      // bc7: ldc_w -45
      // bca: goto c34
      // bcd: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // bd0: athrow
      // bd1: sipush 20293
      // bd4: ldc2_w 2731960675547313327
      // bd7: lload 1
      // bd8: lxor
      // bd9: pop2
      // bda: pop
      // bdb: ldc_w 45
      // bde: goto c34
      // be1: iload 16
      // be3: aload 3
      // be4: ifnull c09
      // be7: iload 17
      // be9: if_icmpne c07
      // bec: goto bf3
      // bef: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // bf2: athrow
      // bf3: sipush 10203
      // bf6: ldc2_w 725978257269529641
      // bf9: lload 1
      // bfa: lxor
      // bfb: pop2
      // bfc: pop
      // bfd: ldc_w 180
      // c00: goto c34
      // c03: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // c06: athrow
      // c07: iload 16
      // c09: aload 3
      // c0a: ifnull c24
      // c0d: ifeq c27
      // c10: goto c17
      // c13: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // c16: athrow
      // c17: sipush 12419
      // c1a: ldc2_w 2482577612975803244
      // c1d: lload 1
      // c1e: lxor
      // c1f: pop2
      // c20: pop
      // c21: ldc_w -135
      // c24: goto c34
      // c27: sipush 17228
      // c2a: ldc2_w 7946074926747121833
      // c2d: lload 1
      // c2e: lxor
      // c2f: pop2
      // c30: pop
      // c31: ldc_w 135
      // c34: i2f
      // c35: fadd
      // c36: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // c39: fstore 18
      // c3b: fload 18
      // c3d: ldc_w -22.5
      // c40: fcmpl
      // c41: aload 3
      // c42: ifnull c75
      // c45: iflt c6f
      // c48: goto c4f
      // c4b: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // c4e: athrow
      // c4f: fload 18
      // c51: ldc_w 22.5
      // c54: fcmpg
      // c55: aload 3
      // c56: ifnull c75
      // c59: goto c60
      // c5c: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // c5f: athrow
      // c60: ifge c6f
      // c63: goto c6a
      // c66: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // c69: athrow
      // c6a: ldc_w 45.0
      // c6d: fstore 18
      // c6f: fload 18
      // c71: ldc_w -22.5
      // c74: fcmpg
      // c75: aload 3
      // c76: ifnull ca9
      // c79: ifge ca3
      // c7c: goto c83
      // c7f: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // c82: athrow
      // c83: fload 18
      // c85: ldc_w -67.5
      // c88: fcmpl
      // c89: aload 3
      // c8a: ifnull ca9
      // c8d: goto c94
      // c90: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // c93: athrow
      // c94: iflt ca3
      // c97: goto c9e
      // c9a: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // c9d: athrow
      // c9e: ldc_w -45.0
      // ca1: fstore 18
      // ca3: fload 18
      // ca5: ldc_w -67.5
      // ca8: fcmpg
      // ca9: aload 3
      // caa: ifnull cdd
      // cad: ifge cd7
      // cb0: goto cb7
      // cb3: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // cb6: athrow
      // cb7: fload 18
      // cb9: ldc_w -112.5
      // cbc: fcmpl
      // cbd: aload 3
      // cbe: ifnull cdd
      // cc1: goto cc8
      // cc4: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // cc7: athrow
      // cc8: iflt cd7
      // ccb: goto cd2
      // cce: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // cd1: athrow
      // cd2: ldc_w -45.0
      // cd5: fstore 18
      // cd7: fload 18
      // cd9: ldc_w -112.5
      // cdc: fcmpg
      // cdd: aload 3
      // cde: ifnull d11
      // ce1: ifge d0b
      // ce4: goto ceb
      // ce7: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // cea: athrow
      // ceb: fload 18
      // ced: ldc_w -157.5
      // cf0: fcmpl
      // cf1: aload 3
      // cf2: ifnull d11
      // cf5: goto cfc
      // cf8: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // cfb: athrow
      // cfc: iflt d0b
      // cff: goto d06
      // d02: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // d05: athrow
      // d06: ldc_w -135.0
      // d09: fstore 18
      // d0b: fload 18
      // d0d: ldc_w -157.5
      // d10: fcmpg
      // d11: aload 3
      // d12: ifnull d47
      // d15: ifge d3a
      // d18: goto d1f
      // d1b: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // d1e: athrow
      // d1f: fload 18
      // d21: aload 3
      // d22: ifnull d73
      // d25: goto d2c
      // d28: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // d2b: athrow
      // d2c: ldc_w -180.0
      // d2f: fcmpl
      // d30: ifge d70
      // d33: goto d3a
      // d36: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // d39: athrow
      // d3a: fload 18
      // d3c: ldc_w 157.5
      // d3f: fcmpl
      // d40: goto d47
      // d43: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // d46: athrow
      // d47: aload 3
      // d48: ifnull d7b
      // d4b: iflt d75
      // d4e: goto d55
      // d51: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // d54: athrow
      // d55: fload 18
      // d57: ldc_w 180.0
      // d5a: fcmpg
      // d5b: aload 3
      // d5c: ifnull d7b
      // d5f: goto d66
      // d62: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // d65: athrow
      // d66: ifge d75
      // d69: goto d70
      // d6c: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // d6f: athrow
      // d70: ldc_w -135.0
      // d73: fstore 18
      // d75: fload 18
      // d77: ldc_w 112.5
      // d7a: fcmpl
      // d7b: aload 3
      // d7c: ifnull daf
      // d7f: iflt da9
      // d82: goto d89
      // d85: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // d88: athrow
      // d89: fload 18
      // d8b: ldc_w 157.5
      // d8e: fcmpg
      // d8f: aload 3
      // d90: ifnull daf
      // d93: goto d9a
      // d96: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // d99: athrow
      // d9a: ifge da9
      // d9d: goto da4
      // da0: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // da3: athrow
      // da4: ldc_w 135.0
      // da7: fstore 18
      // da9: fload 18
      // dab: ldc_w 67.5
      // dae: fcmpl
      // daf: aload 3
      // db0: ifnull de3
      // db3: iflt ddd
      // db6: goto dbd
      // db9: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // dbc: athrow
      // dbd: fload 18
      // dbf: ldc_w 112.5
      // dc2: fcmpg
      // dc3: aload 3
      // dc4: ifnull de3
      // dc7: goto dce
      // dca: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // dcd: athrow
      // dce: ifge ddd
      // dd1: goto dd8
      // dd4: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // dd7: athrow
      // dd8: ldc_w 135.0
      // ddb: fstore 18
      // ddd: fload 18
      // ddf: ldc_w 22.5
      // de2: fcmpl
      // de3: aload 3
      // de4: ifnull e12
      // de7: iflt e11
      // dea: goto df1
      // ded: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // df0: athrow
      // df1: fload 18
      // df3: ldc_w 67.5
      // df6: fcmpg
      // df7: aload 3
      // df8: ifnull e12
      // dfb: goto e02
      // dfe: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // e01: athrow
      // e02: ifge e11
      // e05: goto e0c
      // e08: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // e0b: athrow
      // e0c: ldc_w 45.0
      // e0f: fstore 18
      // e11: bipush 2
      // e12: newarray 6
      // e14: dup
      // e15: bipush 0
      // e16: fload 18
      // e18: fastore
      // e19: dup
      // e1a: bipush 1
      // e1b: ldc_w 75.7
      // e1e: fastore
      // e1f: areturn
      // e20: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // e23: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // e26: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
      // e29: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // e2c: aload 3
      // e2d: ifnull e76
      // e30: ifeq e6a
      // e33: goto e3a
      // e36: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // e39: athrow
      // e3a: aload 0
      // e3b: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // e3e: getfield cc/astralis/aqy.dnc Lnet/minecraft/class_2338;
      // e41: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // e44: i2d
      // e45: aload 0
      // e46: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // e49: getfield cc/astralis/aqy.dnc Lnet/minecraft/class_2338;
      // e4c: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // e4f: i2d
      // e50: aload 0
      // e51: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // e54: getfield cc/astralis/aqy.dnc Lnet/minecraft/class_2338;
      // e57: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // e5a: i2d
      // e5b: aload 0
      // e5c: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // e5f: getfield cc/astralis/aqy.aoc Lnet/minecraft/class_2350;
      // e62: invokestatic cc/astralis/efx.eze (DDDLnet/minecraft/class_2350;)[F
      // e65: areturn
      // e66: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // e69: athrow
      // e6a: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // e6d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // e70: invokevirtual net/minecraft/class_746.method_24515 ()Lnet/minecraft/class_2338;
      // e73: invokestatic cc/astralis/amg.gmi (Lnet/minecraft/class_2338;)Z
      // e76: aload 3
      // e77: ifnull ed5
      // e7a: ifeq ed4
      // e7d: goto e84
      // e80: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // e83: athrow
      // e84: aload 0
      // e85: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // e88: aload 3
      // e89: ifnull ea8
      // e8c: goto e93
      // e8f: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // e92: athrow
      // e93: ifnull ee2
      // e96: goto e9d
      // e99: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // e9c: athrow
      // e9d: aload 0
      // e9e: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // ea1: goto ea8
      // ea4: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // ea7: athrow
      // ea8: getfield cc/astralis/aqy.dnc Lnet/minecraft/class_2338;
      // eab: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // eae: i2d
      // eaf: aload 0
      // eb0: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // eb3: getfield cc/astralis/aqy.dnc Lnet/minecraft/class_2338;
      // eb6: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // eb9: i2d
      // eba: aload 0
      // ebb: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // ebe: getfield cc/astralis/aqy.dnc Lnet/minecraft/class_2338;
      // ec1: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // ec4: i2d
      // ec5: aload 0
      // ec6: getfield cc/astralis/efx.hba Lcc/astralis/aqy;
      // ec9: getfield cc/astralis/aqy.aoc Lnet/minecraft/class_2350;
      // ecc: invokestatic cc/astralis/efx.eze (DDDLnet/minecraft/class_2350;)[F
      // ecf: astore 13
      // ed1: aload 13
      // ed3: areturn
      // ed4: bipush 2
      // ed5: newarray 6
      // ed7: dup
      // ed8: bipush 0
      // ed9: fload 7
      // edb: fastore
      // edc: dup
      // edd: bipush 1
      // ede: fload 6
      // ee0: fastore
      // ee1: areturn
      // ee2: aload 3
      // ee3: ifnonnull f02
      // ee6: bipush 2
      // ee7: goto eee
      // eea: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // eed: athrow
      // eee: newarray 6
      // ef0: dup
      // ef1: bipush 0
      // ef2: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // ef5: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // ef8: invokevirtual net/minecraft/class_746.method_36454 ()F
      // efb: fastore
      // efc: dup
      // efd: bipush 1
      // efe: fload 6
      // f00: fastore
      // f01: areturn
      // f02: bipush 2
      // f03: newarray 6
      // f05: dup
      // f06: bipush 0
      // f07: fload 7
      // f09: fastore
      // f0a: dup
      // f0b: bipush 1
      // f0c: fload 6
      // f0e: fastore
      // f0f: areturn
   }

   public static float[] eze(double x, double y, double z, class_2350 direction) {
      long ax = efx.a ^ 77659228772320L;
      class_638 axx = chi.field_1687;
      if (axx == null) {
         return new float[]{0.0F, 0.0F};
      } else {
         class_1297 axxx = new buf(class_1299.field_6052, axx);
         axxx.method_5814(a + 0.5 + a.method_10148() * 0.5, a + 0.5 + a.method_10164() * 0.5, a + 0.5 + a.method_10165() * 0.5);
         return agi(axxx.method_23317(), axxx.method_23318(), axxx.method_23321());
      }
   }

   public static float[] agi(double x, double y, double z) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: getstatic cc/astralis/efx.a J
      // 03: ldc2_w 45084619852787
      // 06: lxor
      // 07: lstore 6
      // 09: getstatic cc/astralis/efx.chi Lnet/minecraft/class_310;
      // 0c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0f: astore 8
      // 11: aload 8
      // 13: ifnonnull 26
      // 16: bipush 2
      // 17: newarray 6
      // 19: dup
      // 1a: bipush 0
      // 1b: fconst_0
      // 1c: fastore
      // 1d: dup
      // 1e: bipush 1
      // 1f: fconst_0
      // 20: fastore
      // 21: areturn
      // 22: invokestatic cc/astralis/efx.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 25: athrow
      // 26: dload 0
      // 27: aload 8
      // 29: invokevirtual net/minecraft/class_746.method_23317 ()D
      // 2c: dsub
      // 2d: dstore 9
      // 2f: dload 4
      // 31: aload 8
      // 33: invokevirtual net/minecraft/class_746.method_23321 ()D
      // 36: dsub
      // 37: dstore 11
      // 39: dload 2
      // 3a: aload 8
      // 3c: invokevirtual net/minecraft/class_746.method_23318 ()D
      // 3f: dsub
      // 40: ldc2_w 1.2
      // 43: dsub
      // 44: dstore 13
      // 46: dload 9
      // 48: dload 9
      // 4a: dmul
      // 4b: dload 11
      // 4d: dload 11
      // 4f: dmul
      // 50: dadd
      // 51: invokestatic java/lang/Math.sqrt (D)D
      // 54: dstore 15
      // 56: dload 11
      // 58: dload 9
      // 5a: invokestatic java/lang/Math.atan2 (DD)D
      // 5d: ldc2_w 180.0
      // 60: dmul
      // 61: ldc2_w 3.1415927410125732
      // 64: ddiv
      // 65: ldc2_w 90.0
      // 68: dsub
      // 69: d2f
      // 6a: fstore 17
      // 6c: dload 13
      // 6e: dload 15
      // 70: invokestatic java/lang/Math.atan2 (DD)D
      // 73: ldc2_w 180.0
      // 76: dmul
      // 77: ldc2_w 3.1415927410125732
      // 7a: ddiv
      // 7b: dneg
      // 7c: d2f
      // 7d: fstore 18
      // 7f: bipush 2
      // 80: newarray 6
      // 82: dup
      // 83: bipush 0
      // 84: fload 17
      // 86: fastore
      // 87: dup
      // 88: bipush 1
      // 89: fload 18
      // 8b: fastore
      // 8c: areturn
   }

   private void fuf() {
      long a = efx.a ^ 131201626064356L;
      int[] var3 = dar.abu();
      if (a.euu.dnp()) {
         class_304 var10000 = chi.field_1690.field_1832;
         float var4;
         int var10001 = (var4 = a.gnd % a.grx.dnp().floatValue() - 0.0F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
         if (var3 != null) {
            var10001 = !var10001;
         }

         var10000.method_23481((boolean)var10001);
      }
   }

   private void boi(etk a) {
      long ax = efx.a ^ 19025279213700L;
      int[] axx = dar.abu();
      efx var10000 = a;
      if (axx != null) {
         label249:
         if (a.euz.dnp()) {
            boolean var8 = chi.field_1724.method_24828();
            if (axx != null) {
               if (!var8) {
                  break label249;
               }

               var8 = evd.dbj();
            }

            if (axx != null) {
               if (!var8) {
                  break label249;
               }

               var8 = chi.field_1690.field_1903.method_1434();
            }

            if (axx != null) {
               if (var8) {
                  break label249;
               }

               var8 = dar.gqy().aws().diy(eky.class).dsv();
            }

            if (axx != null) {
               if (var8) {
                  break label249;
               }

               short var10001 = 28529;
               long var10002 = 8109258016604428654L ^ ax;
               var8 = a.hfi.emb("God Bridge");
            }

            label227: {
               label256: {
                  if (axx != null) {
                     if (!var8) {
                        break label256;
                     }

                     var8 = a.esl.dnp();
                  }

                  if (axx == null) {
                     break label227;
                  }

                  if (var8) {
                     var8 = true;
                     break label227;
                  }
               }

               var8 = false;
            }

            boolean axxx;
            label216: {
               label257: {
                  axxx = var8;
                  var9 = evd.bpi();
                  if (axx != null) {
                     if (!var9) {
                        break label257;
                     }

                     var9 = a.hge.dnp();
                  }

                  if (axx == null) {
                     break label216;
                  }

                  if (var9) {
                     var9 = true;
                     break label216;
                  }
               }

               var9 = false;
            }

            boolean axxxx;
            boolean axxxxx;
            label258: {
               axxxx = var9;
               int var10 = axxx;
               if (axx != null) {
                  if (axxx != 0) {
                     label200: {
                        label260: {
                           var11 = a.btn;
                           if (axx != null) {
                              if (a.btn <= 0) {
                                 break label260;
                              }

                              var11 = a.fmm;
                           }

                           if (axx == null) {
                              break label200;
                           }

                           if (var11 > a.bjk.dnp().intValue()) {
                              var11 = 1;
                              break label200;
                           }
                        }

                        var11 = 0;
                     }

                     axxxxx = (boolean)var11;
                     if (axx != null) {
                        break label258;
                     }
                  }

                  var10 = a.gnd;
               }

               label185: {
                  label261: {
                     if (axx != null) {
                        if (var10 != 0) {
                           var10 = a.gnd % a.bjk.dnp().intValue();
                           if (axx == null) {
                              break label185;
                           }

                           if (var10 == 0) {
                              break label261;
                           }
                        }

                        var10 = a.bjk.dnp().intValue();
                     }

                     if (axx == null) {
                        break label185;
                     }

                     if (var10 != 1) {
                        var10 = 0;
                        break label185;
                     }
                  }

                  var10 = 1;
               }

               axxxxx = (boolean)var10;
            }

            label171: {
               label170: {
                  label262: {
                     var12 = axxxxx;
                     if (axx != null) {
                        if (axxxxx == 0) {
                           break label262;
                        }

                        var12 = axxxx;
                     }

                     if (axx != null) {
                        if (var12 != 0) {
                           break label262;
                        }

                        var12 = a.hjm;
                     }

                     if (axx != null) {
                        if (var12 != 0) {
                           break label262;
                        }

                        a.eeq = true;
                        a.hjm = true;
                        var12 = axxx;
                     }

                     if (axx == null) {
                        break label171;
                     }

                     if (var12 == 0) {
                        break label170;
                     }

                     a.fmm = -1;
                     if (axx != null) {
                        break label170;
                     }
                  }

                  a.eeq = false;
               }

               var12 = chi.field_1724.method_24828();
            }

            if (axx != null) {
               if (var12 == 0) {
                  return;
               }

               var12 = chi.field_1690.field_1903.method_1434();
            }

            if (var12 == 0) {
               a.hjm = false;
            }

            return;
         }

         var10000 = a;
      }

      var10000.hjm = false;
   }

   private void eth() {
      efx var5;
      label38: {
         label40: {
            long a = efx.a ^ 109687426923737L;
            int[] var3 = dar.abu();
            boolean var10000 = a.gez.dnp();
            if (var3 != null) {
               if (var10000) {
                  var4 = chi.field_1690.field_1903;
                  if (var3 == null) {
                     break label40;
                  }

                  if (chi.field_1690.field_1903.method_1434()) {
                     var4 = chi.field_1690.field_1904;
                     break label40;
                  }
               }

               var5 = a;
               if (var3 == null) {
                  break label38;
               }

               var10000 = a.dsc;
            }

            if (var10000) {
               evd.eeo();
            }

            var5 = a;
            break label38;
         }

         var4.method_23481(false);
         a.dsc = true;
         return;
      }

      var5.dsc = false;
   }

   private boolean erx() {
      int[] a;
      int var6;
      long ax = efx.a ^ 131098510183973L;
      int[] var10000 = dar.abu();
      String var4 = a.aqg.dnp();
      a = var10000;
      byte var5 = -1;
      var6 = var4.hashCode();
      label66:
      if (a != null) {
         switch (var6) {
            case 80691912:
               short var10001 = 11744;
               long var10002 = 5663061629785666846L ^ ax;
               var6 = var4.equals("Telly");
               if (a == null) {
                  break label66;
               }

               if (var6 == 0) {
                  break;
               }

               var5 = 0;
               if (a != null) {
                  break;
               }
            case 482016750:
               short var7 = 17758;
               long var8 = 5268109548133752296L ^ ax;
               var6 = var4.equals("Modern Watchdog");
               if (a == null) {
                  break label66;
               }

               if (var6 != 0) {
                  var5 = 1;
               }
         }

         var6 = var5;
      }

      if (a != null) {
         switch (var6) {
            case 0:
               var6 = hjr;
               break;
            case 1:
               var6 = chi.field_1724.method_24828();
               if (a != null) {
                  var6 = var6 == 0 ? 1 : 0;
               }

               return (boolean)var6;
            default:
               return (boolean)1;
         }
      }

      if (a != null) {
         var6 = var6 > a.gju.dnp().intValue() ? 1 : 0;
      }

      return (boolean)var6;
   }

   private boolean dks() {
      long a;
      int[] ax;
      boolean var10000;
      label123: {
         label126: {
            a = efx.a ^ 47040505262308L;
            ax = dar.abu();
            short var10001 = 17758;
            long var10002 = 5268165152533996329L ^ a;
            var10000 = a.hfi.emb("Modern Watchdog");
            if (ax != null) {
               if (!var10000) {
                  break label126;
               }

               var10000 = a.aba.dnp();
            }

            if (ax == null) {
               break label123;
            }

            if (var10000) {
               var10000 = 1;
               break label123;
            }
         }

         var10000 = 0;
      }

      boolean axx = (boolean)var10000;
      float axxx = axx != 0 ? chi.field_1724.method_36454() - 180.0F : dqq.ev();
      float axxxx = dqq.czi();
      Object var10 = a.hba;
      if (ax != null) {
         label108:
         if (a.hba != null) {
            var10000 = evd.bpi();
            if (ax != null) {
               if (var10000 == 0) {
                  break label108;
               }

               var10000 = axx;
            }

            if (ax != null) {
               if (var10000 == 0) {
                  break label108;
               }

               var10000 = a.hba.dnc.method_10263();
            }

            float[] axxxxx = eze(var10000, a.hba.dnc.method_10264(), a.hba.dnc.method_10260(), a.hba.aoc);
            axxx = axxxxx[0];
         }

         var10 = a.gkz.dnp();
      }

      String var9 = (String)var10;
      byte var8 = -1;
      var10000 = var9.hashCode();
      label97:
      if (ax != null) {
         switch (var10000) {
            case -654193598:
               short var13 = 3797;
               long var16 = 5818417678919968940L ^ a;
               var10000 = var9.equals("Advanced");
               if (ax == null) {
                  break label97;
               }

               if (var10000 == 0) {
                  break;
               }

               var8 = 0;
               if (ax != null) {
                  break;
               }
            case -1955878649:
               short var14 = 10726;
               long var17 = 4694971301501997008L ^ a;
               var10000 = var9.equals("Normal");
               if (ax == null) {
                  break label97;
               }

               if (var10000 == 0) {
                  break;
               }

               var8 = 1;
               if (ax != null) {
                  break;
               }
            case 2454:
               short var15 = 10973;
               long var18 = 3786568717233163409L ^ a;
               var10000 = var9.equals("MC");
               if (ax == null) {
                  break label97;
               }

               if (var10000 != 0) {
                  var8 = 2;
               }
         }

         var10000 = var8;
      }

      if (ax != null) {
         switch (var10000) {
            case 0:
               var10000 = bfc.gto(a.hba.aoc(), a.hba.dnc(), true, 5.0F, axxx, axxxx);
               break;
            case 1:
               var10000 = bfc.gto(a.hba.aoc(), a.hba.dnc(), false, 5.0F, axxx, axxxx);
               break;
            case 2:
               var10000 = a.ddd();
               break;
            default:
               var10000 = 1;
         }
      }

      return (boolean)var10000;
   }

   private boolean ddd() {
      long a = efx.a ^ 81548417848521L;
      int[] ax = dar.abu();
      class_239 var10000 = chi.field_1765;
      if (ax != null) {
         if (chi.field_1765 == null) {
            return false;
         }

         var10000 = chi.field_1765;
      }

      if (ax != null) {
         if (var10000.method_17783() != class_240.field_1332) {
            return false;
         }

         var10000 = chi.field_1765;
      }

      class_239 var5 = var10000;
      boolean var6 = var5 instanceof class_3965;
      if (ax == null) {
         return var6;
      } else if (var6) {
         class_3965 axx = (class_3965)var5;
         boolean var7 = axx.method_17777().equals(a.hba.dnc());
         if (ax != null) {
            if (!var7) {
               return false;
            }

            var7 = axx.method_17780().equals(a.hba.aoc());
         }

         return ax == null ? var7 : var7;
      } else {
         return false;
      }
   }

   private class_243 dri() {
      long a = efx.a ^ 95257378059904L;
      int[] ax = dar.abu();
      aqy var10000 = a.hba;
      if (ax != null) {
         if (a.hba == null) {
            return null;
         }

         var10000 = a.hba;
      }

      double axx;
      double axxx;
      double axxxx;
      label73: {
         class_2338 axxxxx = var10000.dnc();
         axx = axxxxx.method_10263() + Math.random();
         axxx = axxxxx.method_10264() + Math.random();
         axxxx = axxxxx.method_10260() + Math.random();
         class_239 axxxxxx = chi.field_1765;
         int var13 = fto.gwb[a.hba.aoc.ordinal()];
         if (ax != null) {
            switch (var13) {
               case 1:
                  axxx = axxxxx.method_10264();
                  if (ax != null) {
                     break;
                  }
               case 2:
                  axxx = axxxxx.method_10264() + 1;
                  if (ax != null) {
                     break;
                  }
               case 3:
                  axxxx = axxxxx.method_10260();
                  if (ax != null) {
                     break;
                  }
               case 4:
                  axxxx = axxxxx.method_10260() + 1;
                  if (ax != null) {
                     break;
                  }
               case 5:
                  axx = axxxxx.method_10263();
                  if (ax != null) {
                     break;
                  }
               case 6:
                  axx = axxxxx.method_10263() + 1;
            }

            var14 = axxxxxx;
            if (ax == null) {
               break label73;
            }

            var13 = axxxxxx instanceof class_3965;
         }

         if (var13 == 0) {
            return new class_243(axx, axxx, axxxx);
         }

         var14 = axxxxxx;
      }

      class_3965 axxxxxxx = (class_3965)var14;
      class_3965 var15 = axxxxxxx;
      if (ax != null) {
         if (!axxxxxxx.method_17777().equals(a.hba.dnc())) {
            return new class_243(axx, axxx, axxxx);
         }

         var15 = axxxxxxx;
      }

      if (ax != null) {
         if (var15.method_17780() != a.hba.aoc()) {
            return new class_243(axx, axxx, axxxx);
         }

         axx = axxxxxxx.method_17784().field_1352;
         axxx = axxxxxxx.method_17784().field_1351;
         var15 = axxxxxxx;
      }

      axxxx = var15.method_17784().field_1350;
      return new class_243(axx, axxx, axxxx);
   }

   private int dtm() {
      long a = efx.a ^ 132750061608338L;
      int ax = 0;
      int[] var10000 = dar.abu();
      int axx = 0;
      int[] axxx = var10000;

      while (true) {
         if (axx < chi.field_1724.method_31548().method_5439()) {
            class_1799 axxxx = chi.field_1724.method_31548().method_5438(axx);
            class_1792 axxxxx = axxxx.method_7909();
            label32:
            if (axxx != null) {
               var10 = axxxxx instanceof class_1747;
               if (axxx == null) {
                  break;
               }

               if (var10 != 0) {
                  class_1747 axxxxxx = (class_1747)axxxxx;
                  class_2248 axxxxxxx = axxxxxx.method_7711();
                  if (axxx == null) {
                     break label32;
                  }

                  if (amg.ayj(axxxxxxx)) {
                     ax += axxxx.method_7947();
                  }
               }

               axx++;
            }

            if (axxx != null) {
               continue;
            }
         }

         var10 = ax;
         break;
      }

      return var10;
   }

   public static void arp(int[] var0) {
      bd = var0;
   }

   public static int[] dao() {
      return bd;
   }

   static {
      long var16 = a ^ 114000327703459L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var19 = 1; var19 < 8; var19++) {
         var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[79];
      int var23 = 0;
      String var22 = "\u007fbzFCØÙ «\u0091\u009e¶Õ\u0083\u0004\u0083\u0094\u0000á¶\u009feÒxUæxÂgÊÄè\u0018yq\u0013\u001fsµ\u001f;>P\u009as\u0092r\u009d\u009aü\fÉè~Èâû ,\u0011¶è#\u0083ÃOi÷\u001f&B\u0092gg\tXM\u0084£\u0006\u008eT*zÉ\u000bÂåj· è\u0098ÿ\u0006¥â¡d¶\u0013å8Á\u0080Þº¹D´Y\u008eÜ²lòa¾·n+æà Q¤ë¯â\u0098Ö².{}\u0098Q\u0094\b\u0092 .xSê\u0080n=Èk\u000buÜw5\u0015\u0018\u0092\u009aÓ>û°@\u0018w\u0012Åò\u001e\u0017+\ftQ`LZ\u0095!\u008c\u0010\u0004'c\u009eÈ\u0003ªW\rg\u001e:3,\u0000¡(bé!Ù{P¿Én s\u0092ÅÙï$\u0093\u008f\t\u001fÜ°ÉÌ»P\u0019\u0081\u0010{ÃÜ\u0086fÈ$ÀÚ¼Q\u0018¾¬\u00adbî\u008d\u001ce:\u008dp+6\u0004Ö#8\u0006Ù%ìõÕÓ\u0010XñU\u0089úb)«KAvY\u0090fdm C£o\u0012\u001dÎu\fZ\u0093\u0006å \u001b\u001aÜàÆ\u0080á[DaAi½1*~ì\u0091¿ \u0085T)Å>ÅiÈ*5ZìjjÆò\u008aRÝ(9¾\u0086É\u0093^ó4\u009föz\u009b _1HÜµ \u00ad¤«\u001eq\u007fô\u0081\u008b¤Ç2\u00002_`\u0094¾\u001a$±æwôtS Ø\r.v\u009e»ÖÚl\u0012<w\rn\u001eÁòvF\u007f\u009b'\u0015]\u0098BWòñ}^7\u0018³À\u0083ÛNW\u0096$\u0085¶4µ\u0011¶±4¸r{.\u0093:Í\u0097\u0010\u0003Ð{¤+\u0016¡ó~\u0091\u0002ô2Ñ\u0095\u0097 þþ\u0013Ïq²\u0014n\"\u0001h\u0007ç·ÎéÃ=i\u00843Y{Në3Á¢ÇÔÇ>\u0010÷¾d\f\u008a\u009a¸(_¾\u007fßëHøæ(s\f\u0014Tâþ¦§\u0095|Y\u0017úqey%Ð¦Lw¬Ç\u0099¸Øòé°º\u008f¬\u0097ÔÄ»,³\u0090\t\u0010\u0080ýÃyÄbr%\u0011?\u0013ßèðüO £!À\u0006g%\u0084\u0090%\u0093Ä!\u0007ï]\u00adò¼;ú|=´¢ý\u008d\u0012 >\u0019JN\u0010¹ö\u0003\u009a:q&\u0002Ä,¼\bÔ-³à\u0018\u0089aÄ²Ù>\u0080?ø\u0002èÕ¾:¬¤/¦º(ãpa\u0010 \u0095¢r\u008a\u00042Ô×¨&\u000f?\u009d9ºWÓ)¹ ®B\u0013\u0083rÎ]¾\u0015óHù å2\u001d\u0010IÓÍ%×6\u0019)\u0089Ì\u0096ØK\u0086ä·\u008d¦/ü¹Â\u0085\nÜ\u0091¬â ò\u0019\u001b\nðµ\u0098[fJÿ\u00064\u000fìÁ¤]0A\u0080.´\nð\u0093:éÿ\u0010\u0010]\u0010\u00199zD§\u009f®,p\u0019s\u0096 \u0096K\u0005\u0010\u008b\u001dÞX¡Ñ#\u009d\"@V\u0091\u0018\u008f\u0082I\u0018ÀÖ=\"Þ\bð\u0086\\ÜJôd\u0082uéE\u0085\u001b\u0015\u0087¡p/\u0018\u000eï³g\u001f{MXÞ¡?<_ Ù\u0010\u0089ïøæøJ\u0014Á(º\u0089~Áq#X\u0096\"¨±âvíZ\bû8èY\u008e3\u0018çz]\u0097¦\u009c\u008bË°GjÜïÊn¿\u0001\u0010ä¬¯\u0091î¶ì¾\u0094ì\u0080Å!\u009fb\u0095\u0010¥¢Ç\u0012¶\\P§\u0098#QMãÜÈ»( ÌPÀ:\u0096\\\u0012ÿ\u0006!\u0006K¿Ðã\u0088î¦Î\nÿ#\u0000\u000fM\u0093\t»ù\u0093+\u00006\rêÏ/¹C\u0010¹iö\u008f\u000bÄ\u0018!\u001aüØô=¬|m !½PÔ\u0016\u0016;¯(õÇ\u008e\u0010°jK\u0095QÉSLÂ3GñÎÜw\"B8K\u0018\u001a³\u0001\u00ad(\u0006\u009d\u00066txZúIY\u0006µu\u000f\u008d¡_=! GvC\u0005ö×\u001eÚe\u0000\u008a>3\u007fCæ!¶s\u001eï\r1«w\u008d\u001a¡Á8þé §\u0087\u009bJ\u0097\u0015\u0010yzÄ£ms<£\u0016\f\u001càò\u000f'\u0085\u001dÕ\u000f®\u008cá\u008c\u009b\u0005\u0018#©ö§ñ \u0000%k,P\u0087\u0013\u001aªCj\u008b(Nþ\u0084I¹(\u009bZ\u0007ãÞº\u001d.\u0018o\u000f\u0081¡ésÑsý(;\ry¸n)ï\u0003Bc\u0005þ7jºåRt ÈW\u0010_Â^ãÊCw%u}\u0002¼\u0093\u0089om(\u008dSÓwÉuâ³jÇ\u009fø\u009e\u0005\u008dçé\\%ç6\u0087a\"úo\u0013\u0002¶{ÿm©øÂÎÜ\u0092\u0001~\u0018pª\u0093n\u001e5ß\u008bµ¨8c]-¾£¦é\u0083ê\u0081¾\u0010Ö\u0018[ÙCò\u001bà'R¿½ÐXcB\u008bKÈÝpV°¦%:\u0010\u009b%\u0083\u0083\u008f\u001e¬Î\u0099Î\u0006\u0097µ\u000b±ð\u0010\n?ö5¤\u000e;ê\u0092EQå\b\u008bç&\u0010\u009b\u001flU¸t¥±©ò§\u0001âQâ© \u0017)t\u0083\u0088\u009eguæKÎC\u0017óLá»o*uj¸OÉ\u00041Y±ô¢Z\u000f \u0010°³óTãoÎ\u0085\u0017\u008eã/\u0095µÊù#²¦\u0086\u0006\u0084?\u001a\u0007[¦åÌÛP\u0010\u0081½\u0003O'Àù}#÷ø8ËÂ^g(\u0084g.Tg^H\u0082¹3\u0015ff\u008a\u0089ãÙk.¦A\bÎò¬t\u009aÏ\u0007µÀ\u009cÜðpnhYBv8.\u001ce¥þ£OÏô\u008f°aDFz\u000eîq\u001eÞÙN\u00adS¬%\u009eÕ.â\u0015\u008a>Vô\u0087dPË\u008cA¤\u001f7\u0005\u0097¨E\u009eµ\r»\u0094\u009d'¹\u0010õ<ã+8ñÙ§u\"w\u000b+eÑ\u0094\u0018nÿD£G\t§_w¯\u0017éNFé(\u009e4BîA§ô\u008c\u0010i\u008eW\u008b\u0006~O3\u000e\u0080Y\u000bHÜ\u0092\u0006\u0018Å\u0015÷\u009c\u0085ý\u001a*\u0099IÉÄ\u00935rIm¯·Nh\u0093H¹\u0010ì\u0080fFtH¹«0}wÆ \u008aA\u000b\u0018UÎ7ýÈ\u0089Òä4¡¼S\u001e%\"cA=\u0097\u001e\u0017<uÑ\u0010\u0002\u000f±Rÿ5\u0099\u0083\u000emXÆ\té¾|\u0010Â6?z³©\u00834CfM\u0006¥Á²H0=\u000f\u0012ûQ\u0096(¦xyw\u001a4%¼E)>S\u0003þà\u0093Ï\u0015Kn¼äd\u009búÁªVâ®âôÍÿûÉ\u0098å\\\u0086\u001e\u0010¼e:¶\u009c)ò«\u008fVoû_\u0097\u0091\u001b\u0010½û\u0092x~÷\u00139]\u0098\\æ\u0002  \u0018\u0018 è!oÃÏ\u008eöË\u007fà=?¾õ9'iL\u0083\u008fd\u009d¯\u0010Ö\u0011\u0016ï\u009dÙ§\u0006À\u0017\u0012î\u0013^N\u00958ñöÌ\u008ag\u00103²\u0095,äí\td\tn\u0016§\u0006Ä,\u007f\u00892ÄZ\u0019=\u000eÁÀ\tYK&dÎPC\u009b\u0084Eh\u0007O\u0096Ã kë_Ët\u001c\u0088Ð\u0010\u0094Ç\b?\u009cÇ°ê\u001c-ý\"MÒÏ`\u0010ÖÚÝz\u0098Q\u0081V\u0096!a4\nìbá\u0018C\u0005h»ÿ_:\u0085µãêÉ/Äá2ù§ÐÇ¨_Hð ÉDS5\u0087åÕ8íþ}ñ\u001c\u0015 ã×¢\u0094JË[{\u0011µlýÂ¼\u0083¶¶ èUùç \u0092£Fày\u0017Q\u0000\u001f\t5\u0003\u0018 7·H¦\u0006¡æ©\u0005§\u008e\u0010\u009d\u0010Æß\"\u008aZo\u0093\u0089\u0015\u0087£\u0001Ç®Q\u0097 \u0013/\u009bä*J=mød\fZµ\u000e\u0000o\"R\rµ\u0011¡º`NÅ9òàk\u0001d\u0010^\u0019·Ù\u0099s\u0080Ã -Á<\u000f\u000fG³\u00100î¥!PºÝ=î\u0006\\ô&\u0013\u001f`(*¥\u009a\u0013\u001d'8<\u0091¦-§\u0090ë\u0088g/n¬%f÷¾ÅóXØöeK}\rc<ÇL0\u001edê";
      int var24 = "\u007fbzFCØÙ «\u0091\u009e¶Õ\u0083\u0004\u0083\u0094\u0000á¶\u009feÒxUæxÂgÊÄè\u0018yq\u0013\u001fsµ\u001f;>P\u009as\u0092r\u009d\u009aü\fÉè~Èâû ,\u0011¶è#\u0083ÃOi÷\u001f&B\u0092gg\tXM\u0084£\u0006\u008eT*zÉ\u000bÂåj· è\u0098ÿ\u0006¥â¡d¶\u0013å8Á\u0080Þº¹D´Y\u008eÜ²lòa¾·n+æà Q¤ë¯â\u0098Ö².{}\u0098Q\u0094\b\u0092 .xSê\u0080n=Èk\u000buÜw5\u0015\u0018\u0092\u009aÓ>û°@\u0018w\u0012Åò\u001e\u0017+\ftQ`LZ\u0095!\u008c\u0010\u0004'c\u009eÈ\u0003ªW\rg\u001e:3,\u0000¡(bé!Ù{P¿Én s\u0092ÅÙï$\u0093\u008f\t\u001fÜ°ÉÌ»P\u0019\u0081\u0010{ÃÜ\u0086fÈ$ÀÚ¼Q\u0018¾¬\u00adbî\u008d\u001ce:\u008dp+6\u0004Ö#8\u0006Ù%ìõÕÓ\u0010XñU\u0089úb)«KAvY\u0090fdm C£o\u0012\u001dÎu\fZ\u0093\u0006å \u001b\u001aÜàÆ\u0080á[DaAi½1*~ì\u0091¿ \u0085T)Å>ÅiÈ*5ZìjjÆò\u008aRÝ(9¾\u0086É\u0093^ó4\u009föz\u009b _1HÜµ \u00ad¤«\u001eq\u007fô\u0081\u008b¤Ç2\u00002_`\u0094¾\u001a$±æwôtS Ø\r.v\u009e»ÖÚl\u0012<w\rn\u001eÁòvF\u007f\u009b'\u0015]\u0098BWòñ}^7\u0018³À\u0083ÛNW\u0096$\u0085¶4µ\u0011¶±4¸r{.\u0093:Í\u0097\u0010\u0003Ð{¤+\u0016¡ó~\u0091\u0002ô2Ñ\u0095\u0097 þþ\u0013Ïq²\u0014n\"\u0001h\u0007ç·ÎéÃ=i\u00843Y{Në3Á¢ÇÔÇ>\u0010÷¾d\f\u008a\u009a¸(_¾\u007fßëHøæ(s\f\u0014Tâþ¦§\u0095|Y\u0017úqey%Ð¦Lw¬Ç\u0099¸Øòé°º\u008f¬\u0097ÔÄ»,³\u0090\t\u0010\u0080ýÃyÄbr%\u0011?\u0013ßèðüO £!À\u0006g%\u0084\u0090%\u0093Ä!\u0007ï]\u00adò¼;ú|=´¢ý\u008d\u0012 >\u0019JN\u0010¹ö\u0003\u009a:q&\u0002Ä,¼\bÔ-³à\u0018\u0089aÄ²Ù>\u0080?ø\u0002èÕ¾:¬¤/¦º(ãpa\u0010 \u0095¢r\u008a\u00042Ô×¨&\u000f?\u009d9ºWÓ)¹ ®B\u0013\u0083rÎ]¾\u0015óHù å2\u001d\u0010IÓÍ%×6\u0019)\u0089Ì\u0096ØK\u0086ä·\u008d¦/ü¹Â\u0085\nÜ\u0091¬â ò\u0019\u001b\nðµ\u0098[fJÿ\u00064\u000fìÁ¤]0A\u0080.´\nð\u0093:éÿ\u0010\u0010]\u0010\u00199zD§\u009f®,p\u0019s\u0096 \u0096K\u0005\u0010\u008b\u001dÞX¡Ñ#\u009d\"@V\u0091\u0018\u008f\u0082I\u0018ÀÖ=\"Þ\bð\u0086\\ÜJôd\u0082uéE\u0085\u001b\u0015\u0087¡p/\u0018\u000eï³g\u001f{MXÞ¡?<_ Ù\u0010\u0089ïøæøJ\u0014Á(º\u0089~Áq#X\u0096\"¨±âvíZ\bû8èY\u008e3\u0018çz]\u0097¦\u009c\u008bË°GjÜïÊn¿\u0001\u0010ä¬¯\u0091î¶ì¾\u0094ì\u0080Å!\u009fb\u0095\u0010¥¢Ç\u0012¶\\P§\u0098#QMãÜÈ»( ÌPÀ:\u0096\\\u0012ÿ\u0006!\u0006K¿Ðã\u0088î¦Î\nÿ#\u0000\u000fM\u0093\t»ù\u0093+\u00006\rêÏ/¹C\u0010¹iö\u008f\u000bÄ\u0018!\u001aüØô=¬|m !½PÔ\u0016\u0016;¯(õÇ\u008e\u0010°jK\u0095QÉSLÂ3GñÎÜw\"B8K\u0018\u001a³\u0001\u00ad(\u0006\u009d\u00066txZúIY\u0006µu\u000f\u008d¡_=! GvC\u0005ö×\u001eÚe\u0000\u008a>3\u007fCæ!¶s\u001eï\r1«w\u008d\u001a¡Á8þé §\u0087\u009bJ\u0097\u0015\u0010yzÄ£ms<£\u0016\f\u001càò\u000f'\u0085\u001dÕ\u000f®\u008cá\u008c\u009b\u0005\u0018#©ö§ñ \u0000%k,P\u0087\u0013\u001aªCj\u008b(Nþ\u0084I¹(\u009bZ\u0007ãÞº\u001d.\u0018o\u000f\u0081¡ésÑsý(;\ry¸n)ï\u0003Bc\u0005þ7jºåRt ÈW\u0010_Â^ãÊCw%u}\u0002¼\u0093\u0089om(\u008dSÓwÉuâ³jÇ\u009fø\u009e\u0005\u008dçé\\%ç6\u0087a\"úo\u0013\u0002¶{ÿm©øÂÎÜ\u0092\u0001~\u0018pª\u0093n\u001e5ß\u008bµ¨8c]-¾£¦é\u0083ê\u0081¾\u0010Ö\u0018[ÙCò\u001bà'R¿½ÐXcB\u008bKÈÝpV°¦%:\u0010\u009b%\u0083\u0083\u008f\u001e¬Î\u0099Î\u0006\u0097µ\u000b±ð\u0010\n?ö5¤\u000e;ê\u0092EQå\b\u008bç&\u0010\u009b\u001flU¸t¥±©ò§\u0001âQâ© \u0017)t\u0083\u0088\u009eguæKÎC\u0017óLá»o*uj¸OÉ\u00041Y±ô¢Z\u000f \u0010°³óTãoÎ\u0085\u0017\u008eã/\u0095µÊù#²¦\u0086\u0006\u0084?\u001a\u0007[¦åÌÛP\u0010\u0081½\u0003O'Àù}#÷ø8ËÂ^g(\u0084g.Tg^H\u0082¹3\u0015ff\u008a\u0089ãÙk.¦A\bÎò¬t\u009aÏ\u0007µÀ\u009cÜðpnhYBv8.\u001ce¥þ£OÏô\u008f°aDFz\u000eîq\u001eÞÙN\u00adS¬%\u009eÕ.â\u0015\u008a>Vô\u0087dPË\u008cA¤\u001f7\u0005\u0097¨E\u009eµ\r»\u0094\u009d'¹\u0010õ<ã+8ñÙ§u\"w\u000b+eÑ\u0094\u0018nÿD£G\t§_w¯\u0017éNFé(\u009e4BîA§ô\u008c\u0010i\u008eW\u008b\u0006~O3\u000e\u0080Y\u000bHÜ\u0092\u0006\u0018Å\u0015÷\u009c\u0085ý\u001a*\u0099IÉÄ\u00935rIm¯·Nh\u0093H¹\u0010ì\u0080fFtH¹«0}wÆ \u008aA\u000b\u0018UÎ7ýÈ\u0089Òä4¡¼S\u001e%\"cA=\u0097\u001e\u0017<uÑ\u0010\u0002\u000f±Rÿ5\u0099\u0083\u000emXÆ\té¾|\u0010Â6?z³©\u00834CfM\u0006¥Á²H0=\u000f\u0012ûQ\u0096(¦xyw\u001a4%¼E)>S\u0003þà\u0093Ï\u0015Kn¼äd\u009búÁªVâ®âôÍÿûÉ\u0098å\\\u0086\u001e\u0010¼e:¶\u009c)ò«\u008fVoû_\u0097\u0091\u001b\u0010½û\u0092x~÷\u00139]\u0098\\æ\u0002  \u0018\u0018 è!oÃÏ\u008eöË\u007fà=?¾õ9'iL\u0083\u008fd\u009d¯\u0010Ö\u0011\u0016ï\u009dÙ§\u0006À\u0017\u0012î\u0013^N\u00958ñöÌ\u008ag\u00103²\u0095,äí\td\tn\u0016§\u0006Ä,\u007f\u00892ÄZ\u0019=\u000eÁÀ\tYK&dÎPC\u009b\u0084Eh\u0007O\u0096Ã kë_Ët\u001c\u0088Ð\u0010\u0094Ç\b?\u009cÇ°ê\u001c-ý\"MÒÏ`\u0010ÖÚÝz\u0098Q\u0081V\u0096!a4\nìbá\u0018C\u0005h»ÿ_:\u0085µãêÉ/Äá2ù§ÐÇ¨_Hð ÉDS5\u0087åÕ8íþ}ñ\u001c\u0015 ã×¢\u0094JË[{\u0011µlýÂ¼\u0083¶¶ èUùç \u0092£Fày\u0017Q\u0000\u001f\t5\u0003\u0018 7·H¦\u0006¡æ©\u0005§\u008e\u0010\u009d\u0010Æß\"\u008aZo\u0093\u0089\u0015\u0087£\u0001Ç®Q\u0097 \u0013/\u009bä*J=mød\fZµ\u000e\u0000o\"R\rµ\u0011¡º`NÅ9òàk\u0001d\u0010^\u0019·Ù\u0099s\u0080Ã -Á<\u000f\u000fG³\u00100î¥!PºÝ=î\u0006\\ô&\u0013\u001f`(*¥\u009a\u0013\u001d'8<\u0091¦-§\u0090ë\u0088g/n¬%f÷¾ÅóXØöeK}\rc<ÇL0\u001edê"
         .length();
      char var21 = ' ';
      int var29 = -1;

      label72:
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
                     h = new String[79];
                     r = new HashMap(13);
                     Cipher var5;
                     var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var6 = 1; var6 < 8; var6++) {
                        var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var11 = new long[55];
                     int var8 = 0;
                     String var9 = "NT\u0088\u0092ò\u0088õû\u0013.pGLñE4\u0091cMnèK@8y\u008aoE¯g\u0006\u001b6Fú\u00ad\u001a?ÞF\u007fn\u001d\u009e#ÅO\u009b\u0080 @\f©\u0095ÃcSQ:HJ\u0084\u0010þ\u000eX\u008aü\u0000\u0088\u0005Öô\u0090ß\u008a»íZé\u0087\u0012jÂiÙ&;ÿ¦A©|éMÃð\u00114ôJ\b\u0017Ã\u0082pä90Çn>° 8Æ\n\u008eå:\u0096%Æò\u0017s©\u001b\u0007\u0086\u00075á<ÿ¾Üh\u009c@)\u0011I©S\u009b.RAc\u009coz\nZ\u0099Ø§ù-ÿQyF\u009e\u009a\u001fT\u0097â\u001d\u0001¦ÑÔ¿¬µ\\]ù\u008eJ.-ÈÀ²äòZ÷´z©'k9\u0003d÷Þ\u0089ñ\u0082n{Òx\u0003rú\u0089ì\u001d>Ë\u0083%\u001f'¶ô\u0000w? \u001a\u008d-\u0091ò\u00102íþº7½iÔ\u009dî®\u0003Ý$=\f¦4 BÅ\u009aGIåÍQÔêñ<\u0000\u0081©\"¿\u0012\u0082TX\u001f\u009aD~\u0093\u0098 ¹%k\rgÞz\u009c\u0016+&Þs±Y\u008b¢Òýg«;¼*ðP\u007f,Bãí2ÓcÝ\u000fsê@òL\u009cÕx°?©rÆ7¦4\u0000rttIk\u0094?¼³w\u009att\u0018\u0098\u007f\u0015\u001aäÝEâÌ\f\bQ\t¥\u0010h\u0097RÀ\u0083\u00078£?ì~\u000b\u008f)nÖ\u0018\u009bbB(\u0014¡\u0010v\u0000ü\u0017(Æþ(&Ä\u00ad,\u0003MsRÒ\u0088\u0086\u0091-Ø!3\u0014ÌN®º)\u0086\u009cä\u0018o\u0011Ñ\u0018";
                     int var10 = "NT\u0088\u0092ò\u0088õû\u0013.pGLñE4\u0091cMnèK@8y\u008aoE¯g\u0006\u001b6Fú\u00ad\u001a?ÞF\u007fn\u001d\u009e#ÅO\u009b\u0080 @\f©\u0095ÃcSQ:HJ\u0084\u0010þ\u000eX\u008aü\u0000\u0088\u0005Öô\u0090ß\u008a»íZé\u0087\u0012jÂiÙ&;ÿ¦A©|éMÃð\u00114ôJ\b\u0017Ã\u0082pä90Çn>° 8Æ\n\u008eå:\u0096%Æò\u0017s©\u001b\u0007\u0086\u00075á<ÿ¾Üh\u009c@)\u0011I©S\u009b.RAc\u009coz\nZ\u0099Ø§ù-ÿQyF\u009e\u009a\u001fT\u0097â\u001d\u0001¦ÑÔ¿¬µ\\]ù\u008eJ.-ÈÀ²äòZ÷´z©'k9\u0003d÷Þ\u0089ñ\u0082n{Òx\u0003rú\u0089ì\u001d>Ë\u0083%\u001f'¶ô\u0000w? \u001a\u008d-\u0091ò\u00102íþº7½iÔ\u009dî®\u0003Ý$=\f¦4 BÅ\u009aGIåÍQÔêñ<\u0000\u0081©\"¿\u0012\u0082TX\u001f\u009aD~\u0093\u0098 ¹%k\rgÞz\u009c\u0016+&Þs±Y\u008b¢Òýg«;¼*ðP\u007f,Bãí2ÓcÝ\u000fsê@òL\u009cÕx°?©rÆ7¦4\u0000rttIk\u0094?¼³w\u009att\u0018\u0098\u007f\u0015\u001aäÝEâÌ\f\bQ\t¥\u0010h\u0097RÀ\u0083\u00078£?ì~\u000b\u008f)nÖ\u0018\u009bbB(\u0014¡\u0010v\u0000ü\u0017(Æþ(&Ä\u00ad,\u0003MsRÒ\u0088\u0086\u0091-Ø!3\u0014ÌN®º)\u0086\u009cä\u0018o\u0011Ñ\u0018"
                        .length();
                     byte var7 = 0;

                     label54:
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
                                    q = new Integer[55];
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long var2 = -6813365935387898974L;
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
                                    if (dao() != null) {
                                       arp(new int[3]);
                                    }

                                    return;
                                 }
                                 break;
                              default:
                                 var33[var10001] = var55;
                                 if (var7 < var10) {
                                    continue label54;
                                 }

                                 var9 = "\u0011üJ¨\u0089â'?hìNyC\u001dÎý";
                                 var10 = "\u0011üJ¨\u0089â'?hìNyC\u001dÎý".length();
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
                     continue label72;
                  }

                  var22 = "{\u0090\u0099\u0096\u000fÆËo\u000bÀ(=í£\t]\tÆJÇñ°vd{Å\u0011\u000e\u0087å\u000fw \u000e\u0000\u0085\u009cá\u009büu1\u001a\u000b\u0002\u009dÃÚßÞæÈN4ÏAÏpoÕè\u0098põ\u009f";
                  var24 = "{\u0090\u0099\u0096\u000fÆËo\u000bÀ(=í£\t]\tÆJÇñ°vd{Å\u0011\u000e\u0087å\u000fw \u000e\u0000\u0085\u009cá\u009büu1\u001a\u000b\u0002\u009dÃÚßÞæÈN4ÏAÏpoÕè\u0098põ\u009f"
                     .length();
                  var21 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25328;
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
            throw new RuntimeException("cc/astralis/efx", var10);
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
         throw new RuntimeException("cc/astralis/efx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30767;
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
            throw new RuntimeException("cc/astralis/efx", var14);
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
         throw new RuntimeException("cc/astralis/efx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
