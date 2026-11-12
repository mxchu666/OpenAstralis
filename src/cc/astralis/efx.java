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
import net.minecraft.class_1294;
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
import net.minecraft.class_315;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_4587;
import net.minecraft.class_638;
import net.minecraft.class_746;
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
      short var149 = 18618;
      long var10006 = 3236698855878182787L ^ a;
      String[] var169 = new String[4];
      short var10009 = 10726;
      long var10010 = 4694935003934271119L ^ a;
      var169[0] = "Normal";
      var10009 = 17758;
      var10010 = 5268201454946208374L ^ a;
      var169[1] = "Modern Watchdog";
      var10009 = 11744;
      var10010 = 5663065953896505984L ^ a;
      var169[2] = "Telly";
      var10009 = 20101;
      var10010 = 2253099706860257677L ^ a;
      var169[3] = "Snap";
      a.aqg = new adu("Scaffold Mode", "Normal", var169);
      var10004 = 10213;
      var10005 = 6235973740084799703L ^ a;
      short var151 = 1266;
      var10006 = 7829588862803479518L ^ a;
      String[] var171 = new String[2];
      var10009 = 17797;
      var10010 = 5689842658287438522L ^ a;
      var171[0] = "Update";
      var10009 = 32470;
      var10010 = 6822322386814988724L ^ a;
      var171[1] = "Click";
      a.bqc = new adu("Place Mode", "Update", var171);
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
      long var79 = 8994178587173997879L ^ a;
      a.hge = new gbp("Don't jump diagonally", false);
      var10003 = 23955;
      long var80 = 9094745706310062723L ^ a;
      a.bjk = new bes("Jump Every", 1.0F, 1.0F, 30.0F, 1.0F);
      var10003 = 4049;
      long var81 = 5318868268672876722L ^ a;
      a.exn = new bes("Place Delay", 0.0F, 0.0F, 10.0F, 1.0F);
      var10003 = 19772;
      long var82 = 2690326005127135763L ^ a;
      a.fpf = new gbp("Sprint On Jump", false);
      var10003 = 20968;
      long var83 = 1239938196215324297L ^ a;
      a.bza = new gbp("Sprint", false);
      var10003 = 14916;
      long var84 = 4371409955720115491L ^ a;
      a.epf = new gbp("Change FOV", false);
      var10003 = 11396;
      long var85 = 2570381698267947950L ^ a;
      a.gdh = new cyx("Sprint Mode", new ecs(a), new arx(a), new dkm(a));
      var10003 = 17100;
      long var86 = 2776524004880010697L ^ a;
      a.gez = new gbp("Tower", false);
      var10003 = 11842;
      long var87 = 1538464201380962640L ^ a;
      a.cuw = new cyx("Tower Mode", new cgw(a), new bgl(a));
      var10003 = 13897;
      long var88 = 5982643869323508034L ^ a;
      a.czw = new gbp("No Off Hand check", true);
      var10003 = 20983;
      long var89 = 5035522264662367946L ^ a;
      a.gso = new gbp("Block Counter", true);
      var10003 = 18656;
      long var90 = 2017380996828055501L ^ a;
      var10004 = 10527;
      var10005 = 1862297927488841278L ^ a;
      String[] var161 = new String[2];
      short var10008 = 2388;
      long var191 = 678744821673035363L ^ a;
      var161[0] = "Astralis";
      var10008 = 16907;
      long var192 = 9216871595052420378L ^ a;
      var161[1] = "Adjust";
      a.end = new adu("Block Counter Mode", "Astralis", var161);
      var10003 = 24198;
      long var92 = 2163235057141338511L ^ a;
      a.dhl = new gbp("Block ESP", true);
      var10003 = 31573;
      long var93 = 7966276003476272251L ^ a;
      var10004 = 18462;
      var10005 = 789059682154039045L ^ a;
      String[] var163 = new String[2];
      var10008 = 18462;
      long var193 = 789059682154039045L ^ a;
      var163[0] = "Accurate";
      var10008 = 1017;
      long var194 = 3575420179344133364L ^ a;
      var163[1] = "Prediction";
      a.fdv = new adu("Block ESP Mode", "Accurate", var163);
      var10003 = 11212;
      long var95 = 5602640085958501592L ^ a;
      a.euu = new gbp("Sneak", false);
      var10003 = 2263;
      long var96 = 8857177065079113659L ^ a;
      a.grx = new bes("Sneak Every", 1.0F, 1.0F, 30.0F, 1.0F);
      var10003 = 27074;
      long var97 = 6169403297980147446L ^ a;
      a.flo = new gbp("Autoswap to next stack", true);
      var10003 = 15321;
      long var98 = 6383712457065510085L ^ a;
      a.esl = new gbp("Rotations", true);
      var10003 = 6318;
      long var99 = 5490620219211814794L ^ a;
      a.ggy = new gbp("180 on jump key", false);
      var10003 = 28575;
      long var100 = 2786835437019455730L ^ a;
      var10004 = 12497;
      var10005 = 1971575053594247098L ^ a;
      String[] var165 = new String[4];
      var10008 = 16548;
      long var195 = 4268102371946942396L ^ a;
      var165[0] = "Off";
      var10008 = 10726;
      long var196 = 4694935003934271119L ^ a;
      var165[1] = "Normal";
      var10008 = 31478;
      long var197 = 3296986833227347440L ^ a;
      var165[2] = "Advanced";
      var10008 = 16656;
      long var198 = 3280760497962110515L ^ a;
      var165[3] = "MC";
      a.gkz = new adu("Ray Cast Mode", "Off", var165);
      var10003 = 9942;
      long var102 = 7034826567316548072L ^ a;
      a.ewl = new bes("Min Yaw Speed", 120.0F, 1.0F, 180.0F, 1.0F);
      var10003 = 17053;
      long var103 = 1453571114383494556L ^ a;
      a.dih = new bes("Max Yaw Speed", 120.0F, 1.0F, 180.0F, 1.0F);
      var10003 = 3878;
      long var104 = 676570180342186057L ^ a;
      a.ezy = new bes("Min Pitch Speed", 120.0F, 1.0F, 180.0F, 1.0F);
      var10003 = 14265;
      long var105 = 3646913518110914743L ^ a;
      a.ael = new bes("Max Pitch Speed", 120.0F, 1.0F, 180.0F, 1.0F);
      var10003 = 2262;
      long var106 = 8255421607588726732L ^ a;
      var10004 = 28532;
      var10005 = 7762890693807071344L ^ a;
      short var167 = 12131;
      var10006 = 1971085004764920462L ^ a;
      String[] var168 = new String[6];
      var10008 = 28532;
      long var199 = 7762890693807071344L ^ a;
      var168[0] = "Basic";
      var10008 = 27994;
      long var200 = 8254015602457862767L ^ a;
      var168[1] = "Edge";
      var10008 = 17758;
      long var201 = 5268201454946208374L ^ a;
      var168[2] = "Modern Watchdog";
      var10008 = 17866;
      long var202 = 123389735295437484L ^ a;
      var168[3] = "Modern Watchdog 2";
      var10008 = 28529;
      long var203 = 8109229975263633489L ^ a;
      var168[4] = "God Bridge";
      var10008 = 18203;
      long var204 = 8473884255235983366L ^ a;
      var168[5] = "Intave";
      a.hfi = new adu("Rotation Mode", "Basic", var168);
      var10003 = 6950;
      long var108 = 3606449650073342997L ^ a;
      a.aof = new gbp("Brute Force Yaw", true);
      var10003 = 23952;
      long var109 = 4915896766692053641L ^ a;
      a.dgy = new gbp("Brute Force Pitch", true);
      var10003 = 21363;
      long var110 = 2334544928923343897L ^ a;
      a.aba = new gbp("Spoof Ray Cast", false);
      var10003 = 9569;
      long var111 = 7073938492098980432L ^ a;
      a.cci = new gbp("Stable", false);
      var10003 = 9668;
      long var112 = 7692005801944754891L ^ a;
      a.bld = new bes("Yaw Value", 180.0F, 0.0F, 360.0F, 1.0F);
      var10003 = 31226;
      long var113 = 862428912575444684L ^ a;
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
      long var114 = 3950215343920264805L ^ a;
      var4[6] = a.bdd;
      var10003 = 17921;
      long var115 = 7308210642741154787L ^ a;
      var4[7] = a.epf;
      var10003 = 30456;
      long var116 = 7688202087667098424L ^ a;
      var4[8] = a.bn;
      var10003 = 20329;
      long var117 = 5658199239190338222L ^ a;
      var4[9] = a.cdk.bih(a.bdd::dnp);
      var10003 = 3928;
      long var118 = 6727412134240098986L ^ a;
      var4[10] = a.euz;
      var10003 = 821;
      long var119 = 766460450673530594L ^ a;
      var4[11] = a.hge.bih(a.euz::dnp);
      var10003 = 27170;
      long var120 = 4512930774983868357L ^ a;
      var4[12] = a.bjk.bih(a.euz::dnp);
      var10003 = 15674;
      long var121 = 2002686725485406431L ^ a;
      var4[13] = a.bza;
      var10003 = 15704;
      long var122 = 1829081115442784428L ^ a;
      var4[14] = a.fpf;
      var10003 = 19891;
      long var123 = 3884934975117416525L ^ a;
      var4[15] = a.gdh.bih(a.bza::dnp);
      var10003 = 24460;
      long var124 = 3045557632174574162L ^ a;
      var4[16] = a.gez;
      var10003 = 2263;
      long var125 = 89049025673501964L ^ a;
      var4[17] = a.cuw.bih(a.gez::dnp);
      var10003 = 8250;
      long var126 = 7320342079517767120L ^ a;
      var4[18] = a.czw;
      var10003 = 17185;
      long var127 = 7229821888262690528L ^ a;
      var4[19] = a.gso;
      var10003 = 29717;
      long var128 = 5041565561642508796L ^ a;
      var4[20] = a.end.bih(a.gso::dnp);
      var10003 = 25894;
      long var129 = 1380754287279272185L ^ a;
      var4[21] = a.dhl;
      var10003 = 7162;
      long var130 = 7172289930726542858L ^ a;
      var4[22] = a.fdv.bih(a.dhl::dnp);
      var10003 = 12463;
      long var131 = 166324328227808633L ^ a;
      var4[23] = a.euu;
      var10003 = 32462;
      long var132 = 6484521120444771125L ^ a;
      var4[24] = a.grx.bih(a.euu::dnp);
      var10003 = 19024;
      long var133 = 6143063010808127365L ^ a;
      var4[25] = a.gkz;
      var10003 = 4112;
      long var134 = 737335857102980581L ^ a;
      var4[26] = a.flo;
      var10003 = 16911;
      long var135 = 8795959866686429175L ^ a;
      var4[27] = a.esl;
      var10003 = 17070;
      long var136 = 5721771729870509912L ^ a;
      var4[28] = a.ggy.bih(a.esl::dnp);
      var10003 = 27081;
      long var137 = 3270207451699444778L ^ a;
      var4[29] = a.hfi.bih(a.esl::dnp);
      var10003 = 23977;
      long var138 = 2375428277816445007L ^ a;
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
      long var139 = 4109098445314721280L ^ a;
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
      long var140 = 6807170411532511664L ^ a;
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
      var10003 = 24386;
      long var141 = 6266468391071894145L ^ a;
      var4[33] = a.cci.bih(() -> {
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
      long var142 = 8352548059348196016L ^ a;
      var4[34] = a.ewl.bih(a.esl::dnp);
      var10003 = 3475;
      long var143 = 1133082573751097418L ^ a;
      var4[35] = a.dih.bih(a.esl::dnp);
      var10003 = 12753;
      long var144 = 3423689948347868160L ^ a;
      var4[36] = a.ezy.bih(a.esl::dnp);
      var10003 = 31276;
      long var145 = 6668853111776899049L ^ a;
      var4[37] = a.ael.bih(a.esl::dnp);
      var10003 = 25429;
      long var146 = 7552146136224298629L ^ a;
      var4[38] = a.bld.bih(a.esl::dnp);
      var10003 = 1836;
      long var147 = 2068851975314412228L ^ a;
      var4[39] = a.dgj.bih(a.esl::dnp);
      var10003 = 14483;
      long var148 = 2433678218440977778L ^ a;
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
      long a;
      int[] ax;
      float var10000;
      short var10001;
      label985: {
         a = efx.a ^ 139167474333626L;
         ax = dar.abu();
         var10000 = chi.field_1724.method_36454() - a.bld.dnp().floatValue();
         var10001 = chi.field_1690.field_1849.method_1434();
         if (ax != null) {
            if (var10001 != 0) {
               var10001 = (short)14237;
               long var109 = 4610058168480697408L ^ a;
               var10001 = 45;
               break label985;
            }

            var10001 = chi.field_1690.field_1913.method_1434();
         }

         if (ax != null) {
            if (var10001 != 0) {
               var10001 = (short)2257;
               long var108 = 2520769002355405590L ^ a;
               var10001 = -45;
               break label985;
            }

            var10001 = chi.field_1690.field_1881.method_1434();
         }

         if (ax != null) {
            if (var10001 != 0) {
               var10001 = (short)24245;
               long var10002 = 6256740870304916824L ^ a;
               var10001 = 180;
            } else {
               var10001 = 0;
            }
         }
      }

      float axx = var10000 + var10001;
      Object var51 = a.hba;
      if (ax != null) {
         if (a.hba != null) {
            a.hil = a.hba;
         }

         var51 = a.dgj.dnp();
      }

      float axxx;
      axxx = ((ImFloat)var51).floatValue();
      var52 = evd.dbj();
      label970:
      if (ax != null) {
         if (!var52) {
            var10001 = (short)17493;
            long var110 = 8367579644308874606L ^ a;
            var52 = a.hfi.emb("Modern Watchdog");
            if (ax == null) {
               break label970;
            }

            if (var52) {
               return new float[]{axx, axxx};
            }
         }

         var10001 = (short)17758;
         long var111 = 5268116525027779703L ^ a;
         var52 = a.hfi.emb("Modern Watchdog");
      }

      float axxxx;
      label986: {
         if (var52) {
            class_243 axxxxx = new class_243(a.adx.method_10263() + 0.5, a.adx.method_10264(), a.adx.method_10260() + 0.5);
            double axxxxxx = evd.fgd();
            double axxxxxxx = -Math.sin(axxxxxx);
            double axxxxxxxx = Math.cos(axxxxxx);
            double axxxxxxxxx = axxxxx.field_1352 - chi.field_1724.method_23317();
            double axxxxxxxxxx = axxxxx.field_1350 - chi.field_1724.method_23321();
            double var141;
            int var53 = (var141 = axxxxxxx * axxxxxxxxxx - axxxxxxxx * axxxxxxxxx - 0.0) == 0.0 ? 0 : (var141 < 0.0 ? -1 : 1);
            if (ax != null) {
               var53 = var53 > 0 ? 1 : 0;
            }

            label959: {
               boolean axxxxxxxxxxx = (boolean)var53;
               float axxxxxxxxxxxx = fuk(
                  chi.field_1724.method_36454()
                     - (float)Math.toDegrees(Math.atan2(chi.field_1724.field_3913.method_3128().field_1343, chi.field_1724.field_3913.method_3128().field_1342))
               );
               float axxxxxxxxxxxxx = 260.0F;
               var10000 = chi.field_1724.method_36454();
               var10001 = evd.bpi();
               if (ax != null) {
                  if (var10001 != 0) {
                     var86 = -135.0F;
                     break label959;
                  }

                  var10001 = axxxxxxxxxxx;
               }

               var86 = var10001 == 0 ? axxxxxxxxxxxxx : -axxxxxxxxxxxxx;
            }

            axxxx = var10000 + var86;
            if (ax != null) {
               break label986;
            }
         }

         label988: {
            var10000 = chi.field_1724.method_36454() - a.bld.dnp().floatValue();
            var87 = chi.field_1690.field_1849.method_1434();
            if (ax != null) {
               if (var87 != 0) {
                  short var90 = 20293;
                  long var114 = 2731960675547313327L ^ a;
                  var87 = 45;
                  break label988;
               }

               var87 = chi.field_1690.field_1913.method_1434();
            }

            if (ax != null) {
               if (var87 != 0) {
                  short var89 = 19241;
                  long var113 = 2806683832130728153L ^ a;
                  var87 = -45;
                  break label988;
               }

               var87 = chi.field_1690.field_1881.method_1434();
            }

            if (ax != null) {
               if (var87 != 0) {
                  short var88 = 10203;
                  long var112 = 725978257269529641L ^ a;
                  var87 = 180;
               } else {
                  var87 = 0;
               }
            }
         }

         axxxx = var10000 + var87;
      }

      label940: {
         float axxxxxxxxxxx;
         label939: {
            axxxxxxxxxxx = chi.field_1724.method_36454() + 45.0F;
            byte var56 = a.erx();
            if (ax != null) {
               if (var56 != 0) {
                  float axxxxxxxxxxxx;
                  float axxxxxxxxxxxxx;
                  label934: {
                     label933: {
                        label990: {
                           boolean axxxxxxxxxxxxxx = false;
                           axxxxxxxxxxxxx = axxxx;
                           axxxxxxxxxxxx = axxx;
                           var57 = a.aof.dnp();
                           if (ax != null) {
                              if (var57 == 0) {
                                 var57 = a.dgy.dnp();
                                 if (ax == null) {
                                    break label934;
                                 }

                                 if (var57 == 0) {
                                    break label990;
                                 }
                              }

                              short var91 = 31831;
                              long var115 = 1685727535056411989L ^ a;
                              var57 = a.hfi.emb("Intave");
                           }

                           if (ax == null) {
                              break label934;
                           }

                           if (var57 == 0) {
                              var58 = a.hba;
                              if (ax == null) {
                                 break label933;
                              }

                              if (a.hba != null) {
                                 var57 = a.dgy.dnp();
                                 label898:
                                 if (ax != null) {
                                    if (var57 != 0) {
                                       float axxxxxxxxxxxxxxx = 90.0F;

                                       while (axxxxxxxxxxxxxxx > 30.0F) {
                                          var57 = axxxxxxxxxxxxxx;
                                          if (ax == null || ax == null) {
                                             break label898;
                                          }

                                          if (axxxxxxxxxxxxxx != 0) {
                                             break;
                                          }

                                          label913: {
                                             byte var59 = bfc.gto(a.hba.aoc(), a.hba.dnc(), true, 5.0F, axxxx, axxxxxxxxxxxxxxx);
                                             if (ax != null) {
                                                if (var59 == 0) {
                                                   break label913;
                                                }

                                                axxxxxxxxxxxxx = axxxx;
                                                axxxxxxxxxxxx = axxxxxxxxxxxxxxx;
                                                var59 = 1;
                                             }

                                             axxxxxxxxxxxxxx = (boolean)var59;
                                             a.gpi = new float[]{axxxxxxxxxxxxx, axxxxxxxxxxxx};
                                             a.hek = 0;
                                          }

                                          short var116 = chi.field_1724.method_6059(class_1294.field_5904);
                                          if (ax != null) {
                                             if (var116 != 0) {
                                                var116 = 29868;
                                                long var10003 = 7902739088776941389L ^ a;
                                                var116 = 60;
                                             } else {
                                                var116 = 17228;
                                                long var134 = 4408724373406218398L ^ a;
                                                var116 = 80;
                                             }
                                          }

                                          axxxxxxxxxxxxxxx -= axxxxxxxxxxxxxxx > var116 ? 0.5F : 2.0F;
                                          if (ax == null) {
                                             break;
                                          }
                                       }
                                    }

                                    var57 = a.aof.dnp();
                                 }

                                 if (ax == null) {
                                    break label934;
                                 }

                                 if (var57 != 0) {
                                    var57 = axxxxxxxxxxxxxx;
                                    if (ax == null) {
                                       break label934;
                                    }

                                    if (axxxxxxxxxxxxxx == 0) {
                                       float axxxxxxxxxxxxxxx = 0.0F;

                                       label888:
                                       do {
                                          float var142;
                                          int var60 = (var142 = axxxxxxxxxxxxxxx - 180.0F) == 0.0F ? 0 : (var142 < 0.0F ? -1 : 1);

                                          label885:
                                          while (true) {
                                             if (var60 > 0) {
                                                break label888;
                                             }

                                             var57 = axxxxxxxxxxxxxx;
                                             if (ax == null || ax == null) {
                                                break label934;
                                             }

                                             if (axxxxxxxxxxxxxx != 0) {
                                                break label888;
                                             }

                                             float axxxxxxxxxxxxxxxx = -1.0F;

                                             while (true) {
                                                float var143;
                                                int var61 = (var143 = axxxxxxxxxxxxxxxx - 1.0F) == 0.0F ? 0 : (var143 < 0.0F ? -1 : 1);

                                                label880:
                                                while (true) {
                                                   if (var61 > 0) {
                                                      break label885;
                                                   }

                                                   var60 = axxxxxxxxxxxxxx;
                                                   if (ax == null) {
                                                      continue label885;
                                                   }

                                                   if (axxxxxxxxxxxxxx != 0) {
                                                      break label885;
                                                   }

                                                   float axxxxxxxxxxxxxxxxx = axxxx + axxxxxxxxxxxxxxx * axxxxxxxxxxxxxxxx;
                                                   float axxxxxxxxxxxxxxxxxx = 85.0F;

                                                   while (true) {
                                                      if (!(axxxxxxxxxxxxxxxxxx > 30.0F)) {
                                                         break label880;
                                                      }

                                                      var61 = axxxxxxxxxxxxxx;
                                                      if (ax == null) {
                                                         break;
                                                      }

                                                      if (ax != null) {
                                                         if (axxxxxxxxxxxxxx != 0) {
                                                            break label880;
                                                         }

                                                         var61 = bfc.gto(a.hba.aoc(), a.hba.dnc(), true, 5.0F, axxxxxxxxxxxxxxxxx, axxxxxxxxxxxxxxxxxx);
                                                      }

                                                      label875: {
                                                         if (ax != null) {
                                                            if (var61 == 0) {
                                                               break label875;
                                                            }

                                                            axxxxxxxxxxxxx = axxxxxxxxxxxxxxxxx;
                                                            axxxxxxxxxxxx = axxxxxxxxxxxxxxxxxx;
                                                            var61 = 1;
                                                         }

                                                         axxxxxxxxxxxxxx = (boolean)var61;
                                                         a.gpi = new float[]{axxxxxxxxxxxxx, axxxxxxxxxxxx};
                                                         a.hek = 0;
                                                      }

                                                      axxxxxxxxxxxxxxxxxx -= 5.0F;
                                                      if (ax == null) {
                                                         break label880;
                                                      }
                                                   }
                                                }

                                                axxxxxxxxxxxxxxxx += 2.0F;
                                                if (ax == null) {
                                                   break label885;
                                                }
                                             }
                                          }

                                          axxxxxxxxxxxxxxx += 5.0F;
                                       } while (ax != null);
                                    }
                                 }
                              }
                           }
                        }

                        var58 = a.aof.dnp();
                     }

                     var57 = (Boolean)var58;
                  }

                  axxxx = var57 != 0 ? axxxxxxxxxxxxx : axxxx;
                  axxx = a.dgy.dnp() ? axxxxxxxxxxxx : axxx;
                  String var32 = a.hfi.dnp();
                  byte var33 = -1;
                  var62 = var32.hashCode();
                  label829:
                  if (ax != null) {
                     switch (var62) {
                        case 63955982:
                           short var92 = 3952;
                           long var119 = 5313209609133043303L ^ a;
                           var62 = var32.equals("Basic");
                           if (ax == null) {
                              break label829;
                           }

                           if (var62 == 0) {
                              break;
                           }

                           var33 = 0;
                           if (ax != null) {
                              break;
                           }
                        case 482016750:
                           short var93 = 17758;
                           long var120 = 5268116525027779703L ^ a;
                           var62 = var32.equals("Modern Watchdog");
                           if (ax == null) {
                              break label829;
                           }

                           if (var62 == 0) {
                              break;
                           }

                           var33 = 1;
                           if (ax != null) {
                              break;
                           }
                        case -638370176:
                           short var94 = 3342;
                           long var121 = 4678491614261390351L ^ a;
                           var62 = var32.equals("Modern Watchdog 2");
                           if (ax == null) {
                              break label829;
                           }

                           if (var62 == 0) {
                              break;
                           }

                           var33 = 2;
                           if (ax != null) {
                              break;
                           }
                        case 2154973:
                           short var95 = 20551;
                           long var122 = 422302444792148323L ^ a;
                           var62 = var32.equals("Edge");
                           if (ax == null) {
                              break label829;
                           }

                           if (var62 == 0) {
                              break;
                           }

                           var33 = 3;
                           if (ax != null) {
                              break;
                           }
                        case -1310785555:
                           short var96 = 2822;
                           long var123 = 7774212677414627877L ^ a;
                           var62 = var32.equals("God Bridge");
                           if (ax == null) {
                              break label829;
                           }

                           if (var62 == 0) {
                              break;
                           }

                           var33 = 4;
                           if (ax != null) {
                              break;
                           }
                        case -2099899231:
                           short var97 = 18203;
                           long var124 = 8473871843768100359L ^ a;
                           var62 = var32.equals("Intave");
                           if (ax == null) {
                              break label829;
                           }

                           if (var62 != 0) {
                              var33 = 5;
                           }
                     }

                     var62 = var33;
                  }

                  if (ax == null) {
                     break label940;
                  }

                  switch (var62) {
                     case 0:
                        var62 = 2;
                        break label940;
                     case 1:
                        aqy var78 = a.hba;
                        if (ax != null) {
                           if (a.hba == null) {
                              return new float[]{axxxx, axxx};
                           }

                           var78 = a.hba;
                        }

                        float[] axxxxxxxxxxxxxxxxxxxxxxxxx = eze(var78.dnc.method_10263(), a.hba.dnc.method_10264(), a.hba.dnc.method_10260(), a.hba.aoc);
                        axxx = axxxxxxxxxxxxxxxxxxxxxxxxx[1];
                        return new float[]{axxxx, axxx};
                     case 2:
                        boolean axxxxxxxxxxxxxxxxxxxxxx;
                        label774: {
                           axxxxxxxxxxxxxxxxxxxxxx = chi.field_1690.field_1894.method_1434();
                           boolean axxxxxxxxxxxxxxxxxxxxxxx = chi.field_1690.field_1913.method_1434();
                           var10000 = chi.field_1724.method_36454();
                           boolean var106 = axxxxxxxxxxxxxxxxxxxxxxx;
                           if (ax != null) {
                              if (axxxxxxxxxxxxxxxxxxxxxxx == chi.field_1690.field_1849.method_1434()) {
                                 var107 = 0.0;
                                 break label774;
                              }

                              var106 = axxxxxxxxxxxxxxxxxxxxxxx;
                           }

                           var107 = var106 ? 1.0 : -1.0;
                        }

                        double var133;
                        label768: {
                           boolean var132 = axxxxxxxxxxxxxxxxxxxxxx;
                           if (ax != null) {
                              if (axxxxxxxxxxxxxxxxxxxxxx == chi.field_1690.field_1881.method_1434()) {
                                 var133 = 0.0;
                                 break label768;
                              }

                              var132 = axxxxxxxxxxxxxxxxxxxxxx;
                           }

                           var133 = var132 ? 1.0 : -1.0;
                        }

                        float axxxxxxxxxxxxxxxxxxxxxxx;
                        float axxxxxxxxxxxxxxxxxxxxxxxx;
                        int var10004;
                        label762: {
                           axxxxxxxxxxxxxxxxxxxxxxx = var10000 - (float)Math.toDegrees(Math.atan2(var107, var133));
                           axxxxxxxxxxxxxxxxxxxxxxxx = fuk(axxxxxxxxxxxxxxxxxxxxxxx);
                           var77 = new float[2];
                           var10004 = gig;
                           if (ax != null) {
                              if (gig == 1) {
                                 var10004 = 0;
                                 break label762;
                              }

                              double var162;
                              var10004 = (var162 = Math.abs(axxxxxxxxxxxxxxxxxxxxxxxx) - 22.5) == 0.0 ? 0 : (var162 < 0.0 ? -1 : 1);
                           }

                           if (ax != null) {
                              if (var10004 > 0) {
                                 short var135 = 19437;
                                 long var10005 = 8724396567992201270L ^ a;
                                 var10004 = -140;
                              } else {
                                 short var136 = 9865;
                                 long var138 = 5589048730744659316L ^ a;
                                 var10004 = 90;
                              }
                           }
                        }

                        float var140;
                        label756: {
                           var137 = var10004;
                           var140 = axxxxxxxxxxxxxxxxxxxxxxxx;
                           if (ax != null) {
                              if (axxxxxxxxxxxxxxxxxxxxxxxx == 0.0F) {
                                 var140 = 1.0F;
                                 break label756;
                              }

                              var140 = axxxxxxxxxxxxxxxxxxxxxxxx;
                           }

                           var140 = Math.signum(var140);
                        }

                        var77[0] = axxxxxxxxxxxxxxxxxxxxxxx + var137 * var140;
                        var77[1] = axxx;
                        return var77;
                     case 3:
                        float axxxxxxxxxxxxxxxxxxxxx;
                        axxxxxxxxxxxxxxxxxxxxx = evd.fnh();
                        var71 = a.ggy.dnp();
                        label750:
                        if (ax != null) {
                           if (var71 != 0) {
                              var71 = evd.dbj();
                              if (ax == null) {
                                 break label750;
                              }

                              if (var71 == 0) {
                                 return new float[]{chi.field_1724.method_36454() - 180.0F, axxx};
                              }
                           }

                           var71 = evd.fsj();
                        }

                        if (ax != null) {
                           if (var71 != 0) {
                              return new float[]{axxxx, axxx};
                           }

                           var71 = a.hci;
                        }

                        if (ax != null) {
                           if (var71 == 0) {
                              efx var75 = a;
                              if (ax != null) {
                                 if (a.hba == null) {
                                    return new float[]{evd.bpi() ? axxxxxxxxxxxxxxxxxxxxx - 140.0F + a.dku : axxxxxxxxxxxxxxxxxxxxx + 100.0F + a.dku, axxx};
                                 }

                                 var75 = a;
                              }

                              var75.hci = true;
                              return new float[]{evd.bpi() ? axxxxxxxxxxxxxxxxxxxxx - 140.0F + a.dku : axxxxxxxxxxxxxxxxxxxxx + 100.0F + a.dku, axxx};
                           }

                           var71 = chi.field_1724.field_6012 % 3;
                        }

                        if (var71 == 0) {
                           a.dku = crg.gj(0.0F, 9.0F);
                        }

                        class_243 axxxxxxxxxxxxxxxxxxxxxx = new class_243(
                           a.hba.dnc.method_10263() + 0.5, a.hba.dnc.method_10264(), a.hba.dnc.method_10260() + 0.5
                        );
                        double axxxxxxxxxxxxxxxxxxxxxxx = Math.toRadians(axxxxxxxxxxxxxxxxxxxxx);
                        double axxxxxxxxxxxxxxxxxxxxxxxx = -Math.sin(axxxxxxxxxxxxxxxxxxxxxxx);
                        double axxxxxxxxxxxxxxxxxxxxxxxxx = Math.cos(axxxxxxxxxxxxxxxxxxxxxxx);
                        double axxxxxxxxxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxxxxxxxxx.field_1352 - chi.field_1724.method_23317();
                        double axxxxxxxxxxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxxxxxxxxx.field_1350 - chi.field_1724.method_23321();
                        double var161;
                        int var72 = (
                                 var161 = axxxxxxxxxxxxxxxxxxxxxxxx * axxxxxxxxxxxxxxxxxxxxxxxxxxx
                                    - axxxxxxxxxxxxxxxxxxxxxxxxx * axxxxxxxxxxxxxxxxxxxxxxxxxx
                                    - 0.0
                              )
                              == 0.0
                           ? 0
                           : (var161 < 0.0 ? -1 : 1);
                        if (ax != null) {
                           var72 = var72 > 0 ? 1 : 0;
                        }

                        label739: {
                           label1009: {
                              boolean axxxxxxxxxxxxxxxxxxxxxxxxxxxx = (boolean)var72;
                              var73 = evd.bpi();
                              if (ax != null) {
                                 if (var73 != 0) {
                                    a.dxn = axxxxxxxxxxxxxxxxxxxxx - 140.0F;
                                    if (ax != null) {
                                       break label1009;
                                    }
                                 }

                                 var73 = evd.bpi();
                              }

                              if (ax == null) {
                                 break label739;
                              }

                              if (var73 == 0) {
                                 a.dxn = axxxxxxxxxxxxxxxxxxxxx + (axxxxxxxxxxxxxxxxxxxxxxxxxxxx != 0 ? 100.0F + a.dku : -100.0F - a.dku);
                              }
                           }

                           var73 = 2;
                        }

                        float[] var74 = new float[var73];
                        var74[0] = a.dxn;
                        var74[1] = 82.0F;
                        return var74;
                     case 4:
                        label1005: {
                           class_315 axxxxxxxxxxxxxxx = chi.field_1690;
                           boolean axxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxx.field_1894.method_1434();
                           boolean axxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxx.field_1881.method_1434();
                           boolean axxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxx.field_1913.method_1434();
                           boolean axxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxx.field_1849.method_1434();
                           var10000 = chi.field_1724.method_36454() - 180.0F;
                           var98 = axxxxxxxxxxxxxxxx;
                           if (ax != null) {
                              if (axxxxxxxxxxxxxxxx == axxxxxxxxxxxxxxxxx) {
                                 var98 = axxxxxxxxxxxxxxxxxx;
                                 if (ax != null) {
                                    if (axxxxxxxxxxxxxxxxxx == axxxxxxxxxxxxxxxxxxx) {
                                       var98 = 0;
                                       break label1005;
                                    }

                                    var98 = axxxxxxxxxxxxxxxxxx;
                                 }

                                 if (ax != null) {
                                    if (var98 != 0) {
                                       short var104 = 28280;
                                       long var130 = 7573004262951015814L ^ a;
                                       var98 = -90;
                                    } else {
                                       short var105 = 26747;
                                       long var131 = 2748581162446214037L ^ a;
                                       var98 = 90;
                                    }
                                 }
                                 break label1005;
                              }

                              var98 = axxxxxxxxxxxxxxxx;
                           }

                           if (ax != null) {
                              if (var98 != 0) {
                                 var98 = axxxxxxxxxxxxxxxxxx;
                                 if (ax != null) {
                                    if (axxxxxxxxxxxxxxxxxx == axxxxxxxxxxxxxxxxxxx) {
                                       var98 = 0;
                                       break label1005;
                                    }

                                    var98 = axxxxxxxxxxxxxxxxxx;
                                 }

                                 if (ax != null) {
                                    if (var98 != 0) {
                                       short var102 = 19241;
                                       long var128 = 2806683832130728153L ^ a;
                                       var98 = -45;
                                    } else {
                                       short var103 = 20293;
                                       long var129 = 2731960675547313327L ^ a;
                                       var98 = 45;
                                    }
                                 }
                                 break label1005;
                              }

                              var98 = axxxxxxxxxxxxxxxxxx;
                           }

                           if (ax != null) {
                              if (var98 == axxxxxxxxxxxxxxxxxxx) {
                                 short var101 = 10203;
                                 long var127 = 725978257269529641L ^ a;
                                 var98 = 180;
                                 break label1005;
                              }

                              var98 = axxxxxxxxxxxxxxxxxx;
                           }

                           if (ax != null) {
                              if (var98 != 0) {
                                 short var99 = 12419;
                                 long var125 = 2482577612975803244L ^ a;
                                 var98 = -135;
                              } else {
                                 short var100 = 17228;
                                 long var126 = 7946074926747121833L ^ a;
                                 var98 = 135;
                              }
                           }
                        }

                        float axxxxxxxxxxxxxxxxxxxx;
                        axxxxxxxxxxxxxxxxxxxx = class_3532.method_15393(var10000 + var98);
                        float var144;
                        var68 = (var144 = axxxxxxxxxxxxxxxxxxxx - -22.5F) == 0.0F ? 0 : (var144 < 0.0F ? -1 : 1);
                        label692:
                        if (ax != null) {
                           if (var68 >= 0) {
                              float var145;
                              var68 = (var145 = axxxxxxxxxxxxxxxxxxxx - 22.5F) == 0.0F ? 0 : (var145 < 0.0F ? -1 : 1);
                              if (ax == null) {
                                 break label692;
                              }

                              if (var68 < 0) {
                                 axxxxxxxxxxxxxxxxxxxx = 45.0F;
                              }
                           }

                           float var146;
                           var68 = (var146 = axxxxxxxxxxxxxxxxxxxx - -22.5F) == 0.0F ? 0 : (var146 < 0.0F ? -1 : 1);
                        }

                        label685:
                        if (ax != null) {
                           if (var68 < 0) {
                              float var147;
                              var68 = (var147 = axxxxxxxxxxxxxxxxxxxx - -67.5F) == 0.0F ? 0 : (var147 < 0.0F ? -1 : 1);
                              if (ax == null) {
                                 break label685;
                              }

                              if (var68 >= 0) {
                                 axxxxxxxxxxxxxxxxxxxx = -45.0F;
                              }
                           }

                           float var148;
                           var68 = (var148 = axxxxxxxxxxxxxxxxxxxx - -67.5F) == 0.0F ? 0 : (var148 < 0.0F ? -1 : 1);
                        }

                        label678:
                        if (ax != null) {
                           if (var68 < 0) {
                              float var149;
                              var68 = (var149 = axxxxxxxxxxxxxxxxxxxx - -112.5F) == 0.0F ? 0 : (var149 < 0.0F ? -1 : 1);
                              if (ax == null) {
                                 break label678;
                              }

                              if (var68 >= 0) {
                                 axxxxxxxxxxxxxxxxxxxx = -45.0F;
                              }
                           }

                           float var150;
                           var68 = (var150 = axxxxxxxxxxxxxxxxxxxx - -112.5F) == 0.0F ? 0 : (var150 < 0.0F ? -1 : 1);
                        }

                        label671:
                        if (ax != null) {
                           if (var68 < 0) {
                              float var151;
                              var68 = (var151 = axxxxxxxxxxxxxxxxxxxx - -157.5F) == 0.0F ? 0 : (var151 < 0.0F ? -1 : 1);
                              if (ax == null) {
                                 break label671;
                              }

                              if (var68 >= 0) {
                                 axxxxxxxxxxxxxxxxxxxx = -135.0F;
                              }
                           }

                           float var152;
                           var68 = (var152 = axxxxxxxxxxxxxxxxxxxx - -157.5F) == 0.0F ? 0 : (var152 < 0.0F ? -1 : 1);
                        }

                        label664: {
                           label663: {
                              label662: {
                                 label1006: {
                                    if (ax != null) {
                                       if (var68 < 0) {
                                          var10000 = axxxxxxxxxxxxxxxxxxxx;
                                          if (ax == null) {
                                             break label662;
                                          }

                                          if (axxxxxxxxxxxxxxxxxxxx >= -180.0F) {
                                             break label1006;
                                          }
                                       }

                                       float var153;
                                       var68 = (var153 = axxxxxxxxxxxxxxxxxxxx - 157.5F) == 0.0F ? 0 : (var153 < 0.0F ? -1 : 1);
                                    }

                                    if (ax == null) {
                                       break label664;
                                    }

                                    if (var68 < 0) {
                                       break label663;
                                    }

                                    float var154;
                                    var68 = (var154 = axxxxxxxxxxxxxxxxxxxx - 180.0F) == 0.0F ? 0 : (var154 < 0.0F ? -1 : 1);
                                    if (ax == null) {
                                       break label664;
                                    }

                                    if (var68 >= 0) {
                                       break label663;
                                    }
                                 }

                                 var10000 = -135.0F;
                              }

                              axxxxxxxxxxxxxxxxxxxx = var10000;
                           }

                           float var155;
                           var68 = (var155 = axxxxxxxxxxxxxxxxxxxx - 112.5F) == 0.0F ? 0 : (var155 < 0.0F ? -1 : 1);
                        }

                        label642:
                        if (ax != null) {
                           if (var68 >= 0) {
                              float var156;
                              var68 = (var156 = axxxxxxxxxxxxxxxxxxxx - 157.5F) == 0.0F ? 0 : (var156 < 0.0F ? -1 : 1);
                              if (ax == null) {
                                 break label642;
                              }

                              if (var68 < 0) {
                                 axxxxxxxxxxxxxxxxxxxx = 135.0F;
                              }
                           }

                           float var157;
                           var68 = (var157 = axxxxxxxxxxxxxxxxxxxx - 67.5F) == 0.0F ? 0 : (var157 < 0.0F ? -1 : 1);
                        }

                        label635:
                        if (ax != null) {
                           if (var68 >= 0) {
                              float var158;
                              var68 = (var158 = axxxxxxxxxxxxxxxxxxxx - 112.5F) == 0.0F ? 0 : (var158 < 0.0F ? -1 : 1);
                              if (ax == null) {
                                 break label635;
                              }

                              if (var68 < 0) {
                                 axxxxxxxxxxxxxxxxxxxx = 135.0F;
                              }
                           }

                           float var159;
                           var68 = (var159 = axxxxxxxxxxxxxxxxxxxx - 22.5F) == 0.0F ? 0 : (var159 < 0.0F ? -1 : 1);
                        }

                        label628:
                        if (ax != null) {
                           if (var68 >= 0) {
                              float var160;
                              var68 = (var160 = axxxxxxxxxxxxxxxxxxxx - 67.5F) == 0.0F ? 0 : (var160 < 0.0F ? -1 : 1);
                              if (ax == null) {
                                 break label628;
                              }

                              if (var68 < 0) {
                                 axxxxxxxxxxxxxxxxxxxx = 45.0F;
                              }
                           }

                           var68 = 2;
                        }

                        float[] var70 = new float[var68];
                        var70[0] = axxxxxxxxxxxxxxxxxxxx;
                        var70[1] = 75.7F;
                        return var70;
                     case 5:
                        var63 = chi.field_1690.field_1903.method_1434();
                        if (ax != null) {
                           if (var63 != 0) {
                              return eze(a.hba.dnc.method_10263(), a.hba.dnc.method_10264(), a.hba.dnc.method_10260(), a.hba.aoc);
                           }

                           var63 = amg.gmi(chi.field_1724.method_24515());
                        }

                        if (ax == null) {
                           break label939;
                        }

                        if (var63 == 0) {
                           var63 = 2;
                           break label939;
                        }

                        if (ax == null) {
                           return eze(a.hba.dnc.method_10263(), a.hba.dnc.method_10264(), a.hba.dnc.method_10260(), a.hba.aoc);
                        }

                        if (a.hba != null) {
                           return eze(a.hba.dnc.method_10263(), a.hba.dnc.method_10264(), a.hba.dnc.method_10260(), a.hba.aoc);
                        }
                     default:
                        if (ax != null) {
                           return new float[]{axxxxxxxxxxx, axxx};
                        }
                  }
               }

               var56 = 2;
            }

            float[] var65 = new float[var56];
            var65[0] = chi.field_1724.method_36454();
            var65[1] = axxx;
            return var65;
         }

         float[] var66 = new float[var63];
         var66[0] = axxxxxxxxxxx;
         var66[1] = axxx;
         return var66;
      }

      float[] var79 = new float[var62];
      var79[0] = axxxx;
      var79[1] = axxx;
      return var79;
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
      long ax = efx.a ^ 45084619852787L;
      class_746 axx = chi.field_1724;
      if (axx == null) {
         return new float[]{0.0F, 0.0F};
      } else {
         double axxx = a - axx.method_23317();
         double axxxx = a - axx.method_23321();
         double axxxxx = a - axx.method_23318() - 1.2;
         double axxxxxx = Math.sqrt(axxx * axxx + axxxx * axxxx);
         float axxxxxxx = (float)(Math.atan2(axxxx, axxx) * 180.0 / (float) Math.PI - 90.0);
         float axxxxxxxx = (float)(-(Math.atan2(axxxxx, axxxxxx) * 180.0 / (float) Math.PI));
         return new float[]{axxxxxxx, axxxxxxxx};
      }
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
