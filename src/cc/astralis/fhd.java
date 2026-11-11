package cc.astralis;

import imgui.type.ImFloat;
import java.awt.Color;
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
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_2404;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2879;
import net.minecraft.class_3532;
import net.minecraft.class_3675;
import net.minecraft.class_3965;
import net.minecraft.class_4587;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_239.class_240;

public class fhd extends guu {
   private final gbp bij;
   private final bes bab;
   private final adu cmi;
   private final adu fdy;
   private final gbp gf;
   private final adu dee;
   private final adu hio;
   private final bes erv;
   private final gbp ftz;
   private final bes caw;
   private final bes bax;
   private final bes aco;
   private final gbp ady;
   private final gbp dds;
   private final gbp fgh;
   private final bes ait;
   private final gbp bnq;
   private final adu esi;
   private final gbp ckt;
   private final bes csq;
   public final gbp euy;
   public final gbp ecl;
   private final cbm bme;
   private efy aeb;
   private float fro;
   private float bda;
   private double bet;
   private boolean fwb;
   private int cqp;
   private int aos;
   private final List<efy> fmi;
   private int hfv;
   public int eru;
   public int czy;
   private float awh;
   private static final Map<String, int[]> aac;
   private boolean bcy;
   private class_2338 gei;
   private float cvz;
   private float ahz;
   private static final long a = 14684246990949L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;

   public fhd() {
      long a = fhd.a ^ 114574656566678L;
      super(bfm.MOVEMENT);
      short var10003 = 16814;
      long var10004 = 8165796278267792484L ^ a;
      a.bij = new gbp("Modern Watchdog", false);
      var10003 = 15202;
      var10004 = 1542614827079448221L ^ a;
      a.bab = new bes("Search Range", 4.0F, 1.0F, 10.0F, 1.0F);
      var10003 = 7214;
      var10004 = 3476077691192349123L ^ a;
      short var43 = 12068;
      long var10005 = 67533697694376653L ^ a;
      short var83 = 13509;
      long var10006 = 2263476125006212619L ^ a;
      String[] var84 = new String[413732359];
      short var10008 = 12068;
      long var10009 = 67533697694376653L ^ a;
      var84[0] = "Basic";
      var10008 = 24994;
      var10009 = 8500649358709419119L ^ a;
      var84[1] = "Brute Force";
      var10008 = 16814;
      var10009 = 8165796278267792484L ^ a;
      var84[2] = "Modern Watchdog";
      var10008 = 28313;
      var10009 = 726938680843428708L ^ a;
      var84[3] = "Snap";
      var10008 = 20608;
      var10009 = 6351902828450766153L ^ a;
      var84[4] = "Edge";
      var10008 = 24767;
      var10009 = 118106763067780432L ^ a;
      var84[5] = "None";
      a.cmi = new adu("Rotation Mode", "Basic", var84);
      var10003 = 30370;
      var10004 = 1702486333272390476L ^ a;
      short var45 = 24767;
      var10005 = 118106763067780432L ^ a;
      String[] var86 = new String[4];
      var10008 = 26160;
      var10009 = 568479819861715966L ^ a;
      var86[0] = "Minecraft";
      var10008 = 7820;
      var10009 = 6395244250584585031L ^ a;
      var86[1] = "Astralis";
      var10008 = 8458;
      var10009 = 6449535923046591694L ^ a;
      var86[2] = "Normal";
      var10008 = 24767;
      var10009 = 118106763067780432L ^ a;
      var86[3] = "None";
      a.fdy = new adu("Raycast Mode", "None", var86);
      var10003 = 170;
      var10004 = 6167228782042484057L ^ a;
      a.gf = new gbp("God Bridge Yaw", false);
      var10003 = 21969;
      var10004 = 231285195616933905L ^ a;
      short var48 = 32210;
      var10005 = 7426925040069046289L ^ a;
      String[] var88 = new String[3];
      var10008 = 32210;
      var10009 = 7426925040069046289L ^ a;
      var88[0] = "Fast";
      var10008 = 8458;
      var10009 = 6449535923046591694L ^ a;
      var88[1] = "Normal";
      var10008 = 21881;
      var10009 = 4227567122700195969L ^ a;
      var88[2] = "Slow";
      a.dee = new adu("Rotation Speed", "Fast", var88);
      var10003 = 24839;
      var10004 = 7941258665665064190L ^ a;
      short var50 = 23731;
      var10005 = 6269506426697142642L ^ a;
      String[] var90 = new String[3];
      var10008 = 23731;
      var10009 = 6269506426697142642L ^ a;
      var90[0] = "Telly";
      var10008 = 18893;
      var10009 = 1924509469612983336L ^ a;
      var90[1] = "Telly Slow";
      var10008 = 7820;
      var10009 = 6395244250584585031L ^ a;
      var90[2] = "Astralis";
      a.hio = new adu("Bypass Mode", "Telly", var90);
      var10003 = 17585;
      var10004 = 3736633222081759614L ^ a;
      a.erv = new bes("Tower Jump Timing", 1.0F, 0.0F, 10.0F, 1.0F);
      var10003 = 1952;
      var10004 = 250048589958285914L ^ a;
      a.ftz = new gbp("Spin", false);
      var10003 = 9512;
      var10004 = 6542884691255142650L ^ a;
      a.caw = new bes("Spin Speed", 30.0F, 0.0F, 100.0F, 1.0F);
      var10003 = 11587;
      var10004 = 4587836779433795744L ^ a;
      a.bax = new bes("Rotation Speed Yaw", 180.0F, 1.0F, 180.0F, 1.0F);
      var10003 = 19318;
      var10004 = 2073910761380103856L ^ a;
      a.aco = new bes("Rotation Speed Pitch", 180.0F, 1.0F, 180.0F, 1.0F);
      var10003 = 11126;
      var10004 = 5379600733873120902L ^ a;
      a.ady = new gbp("KeepY", false);
      var10003 = 13485;
      var10004 = 3492943072068548970L ^ a;
      a.dds = new gbp("Jump", false);
      var10003 = 6097;
      var10004 = 7759089585296513571L ^ a;
      a.fgh = new gbp("Don't jump diagonally", false);
      var10003 = 20067;
      var10004 = 2526328545114506135L ^ a;
      a.ait = new bes("Jump Every", 1.0F, 1.0F, 30.0F, 1.0F);
      var10003 = 584;
      var10004 = 7641009734520868793L ^ a;
      a.bnq = new gbp("Block Counter", true);
      var10003 = 7041;
      var10004 = 6082026483747198571L ^ a;
      short var62 = 7820;
      var10005 = 6395244250584585031L ^ a;
      String[] var92 = new String[2];
      var10008 = 7820;
      var10009 = 6395244250584585031L ^ a;
      var92[0] = "Astralis";
      var10008 = 28945;
      var10009 = 8586692579782261971L ^ a;
      var92[1] = "Adjust";
      a.esi = new adu("Block Counter Mode", "Astralis", var92);
      var10003 = 23737;
      var10004 = 5575072586726953298L ^ a;
      a.ckt = new gbp("Block ESP", true);
      var10003 = 22463;
      var10004 = 3853366769113815646L ^ a;
      a.csq = new bes("Block ESP Alpha", 200.0F, 1.0F, 255.0F, 5.0F);
      var10003 = 9160;
      var10004 = 4346609966664068635L ^ a;
      a.euy = new gbp("Spoof Item", false);
      var10003 = 25136;
      var10004 = 7386566117981810629L ^ a;
      a.ecl = new gbp("Swing", true);
      a.bme = new cbm();
      a.aeb = null;
      a.fwb = true;
      a.fmi = new ArrayList<>();
      a.eru = -1;
      a.awh = 0.0F;
      short var10001 = 19040;
      long var10002 = 5993033652576440498L ^ a;
      ffn[] var3 = new ffn[-2145299727];
      var3[0] = a.bij;
      var3[1] = a.bab;
      var3[2] = a.cmi;
      var3[3] = a.fdy;
      var3[4] = a.gf.bih(() -> {
         long ax = fhd.a ^ 10124754603256L;
         short var10001x = 16814;
         long var10002x = 8165832557372994826L ^ ax;
         return a.cmi.emb("Modern Watchdog");
      });
      var3[5] = a.dee.bih(() -> {
         long ax = fhd.a ^ 55645601517513L;
         short var10001x = 16814;
         long var10002x = 8165842903044748859L ^ ax;
         return a.cmi.emb("Modern Watchdog");
      });
      var10003 = 31247;
      var10004 = 6772800527575802064L ^ a;
      var3[-1236291285] = a.hio.bih(() -> {
         long ax = fhd.a ^ 102663632148769L;
         short var10001x = 16814;
         long var10002x = 8165739811265372371L ^ ax;
         return a.cmi.emb("Modern Watchdog");
      });
      var10003 = 24918;
      var10004 = 6104326545412324251L ^ a;
      var3[903212573] = a.erv;
      var10003 = 27323;
      var10004 = 8387994622357434475L ^ a;
      var3[-1015782542] = a.ftz;
      var10003 = 20741;
      var10004 = 8555040613146348498L ^ a;
      var3[439902766] = a.caw;
      var10003 = 11743;
      var10004 = 2708462870811719452L ^ a;
      var3[2062055825] = a.bax;
      var10003 = 10243;
      var10004 = 13139611803464388L ^ a;
      var3[-1318218227] = a.aco;
      var10003 = 2669;
      var10004 = 1668630493037858992L ^ a;
      var3[-521176575] = a.ady;
      var10003 = 26830;
      var10004 = 1767880840720871959L ^ a;
      var3[1540739061] = a.dds;
      var10003 = 14516;
      var10004 = 6222994159152865916L ^ a;
      var3[-1781353030] = a.fgh.bih(a.dds::dnp);
      var10003 = 641;
      var10004 = 7893854074953701463L ^ a;
      var3[437273364] = a.ait.bih(a.dds::dnp);
      var10003 = 28981;
      var10004 = 3594837860807076846L ^ a;
      var3[1174126346] = a.bnq;
      var10003 = 23348;
      var10004 = 8166325213207118314L ^ a;
      var3[-1292452875] = a.esi.bih(a.bnq::dnp);
      var10003 = 25022;
      var10004 = 1245285367485987708L ^ a;
      var3[1879267472] = a.ckt;
      var10003 = 180;
      var10004 = 300278127040141927L ^ a;
      var3[1377799528] = a.csq.bih(a.ckt::dnp);
      var10003 = 1776;
      var10004 = 8989187029245434937L ^ a;
      var3[207432471] = a.euy;
      var10003 = 6336;
      var10004 = 1098168900325343745L ^ a;
      var3[52146516] = a.ecl;
      a.bfi(var3);
   }

   @Override
   public void auj() {
      long a = fhd.a ^ 6823736943010L;
      int[] ax = dar.abu();
      if (ax != null) {
         if (chi.field_1724 != null && chi.field_1687 != null) {
            a.bet = chi.field_1724.method_31478();
            a.fwb = true;
            a.czy = chi.field_1724.method_31548().method_67532();
            a.eru = a.czy;
            int axx = a.cfe();
            if (ax != null) {
               if (axx == -1) {
                  a.fga(false);
                  return;
               }

               chi.field_1724.method_31548().method_61496(axx);
               a.hfv = 0;
            }

            a.aos = 0;
         }

         super.auj();
      }
   }

   @Override
   public void frg() {
      long a = fhd.a ^ 16132845614833L;
      int[] var10000 = dar.abu();
      a.aeb = null;
      int[] var3 = var10000;
      class_746 var4 = chi.field_1724;
      if (var3 != null) {
         if (chi.field_1724 != null) {
            chi.field_1690.field_1904.method_23481(false);
            chi.field_1690.field_1886.method_23481(false);
            chi.field_1690.field_1903.method_23481(false);
         }

         dqq.axd(false);
         dqq.edu(a.fro, a.bda, a.bax.dnp().floatValue(), a.aco.dnp().floatValue());
         a.eru = -1;
         var4 = chi.field_1724;
      }

      var4.method_31548().method_61496(a.czy);
      super.frg();
   }

   @gdz
   public void fpg(eji event) {
      chi.field_1690.field_1904.method_23481(false);
      chi.field_1690.field_1886.method_23481(false);
   }

   @gdz
   public void hjc(etk event) {
      long ax = fhd.a ^ 12118531113921L;
      int[] var10000 = dar.abu();
      class_1041 var10001 = chi.method_22683();
      short var10002 = 20878;
      long var10003 = 6348499108853726465L ^ ax;
      boolean axx = class_3675.method_15987(var10001, -710917528);
      int[] axxx = var10000;
      fhd var6 = a;
      if (axxx != null) {
         short var7 = 21286;
         long var9 = 7790081972052011169L ^ ax;
         if (a.cmi.emb("Modern Watchdog") && axx) {
            var8 = a.aen();
            label43:
            if (axxx != null) {
               if (!var8) {
                  var8 = evd.dbj();
                  if (axxx == null) {
                     break label43;
                  }

                  if (var8) {
                     var8 = false;
                     break label43;
                  }
               }

               var8 = true;
            }

            a.eeq = var8;
            if (axxx != null) {
               return;
            }
         }

         var6 = a;
      }

      var6.brh(a);
   }

   private boolean aen() {
      long a = fhd.a ^ 70256392400668L;
      int[] ax = dar.abu();
      int var10000 = chi.field_1724.method_24828();
      if (ax != null) {
         if (var10000 == 0) {
            return false;
         }

         var10000 = a.erv.dnp().intValue();
      }

      int axx = var10000;
      class_2338 axxx = chi.field_1724.method_24515().method_10074();
      boolean axxxx = chi.field_1687.method_8320(axxx).method_26215();
      int var7 = axxxx;
      if (ax != null) {
         if (axxxx && a.aeb != null) {
            var7 = gig;
            if (ax != null) {
               var7 = gig >= axx ? 1 : 0;
            }

            return (boolean)var7;
         }

         var7 = 0;
      }

      return (boolean)var7;
   }

   @gdz
   public void cwy(fxx event) {
      long ax = fhd.a ^ 72736847706790L;
      int[] var10000 = dar.abu();
      short var10002 = 8458;
      long var10003 = 6449560193366516734L ^ ax;
      a.efe("Normal");
      int[] axx = var10000;
      fhd var15 = a;
      if (axx != null) {
         label218: {
            label217: {
               if (a.ady.dnp()) {
                  var16 = chi;
                  if (axx == null) {
                     break label217;
                  }

                  if (chi.field_1690.field_1903.method_1434()) {
                     var17 = chi.field_1724;
                     if (axx == null) {
                        break label218;
                     }

                     if (!chi.field_1724.method_24828()) {
                        a.bet = chi.field_1724.method_31478();
                     }
                  }
               }

               var16 = chi;
            }

            var17 = var16.field_1724;
         }

         var17.method_5728(evd.dbj());
         a.bvj();
         var15 = a;
      }

      class_2338 axxx;
      float axxxx;
      float axxxxx;
      label223: {
         float[] axxxxxx = var15.ecz();
         a.fro = axxxxxx[0];
         a.bda = axxxxxx[1];
         class_2338 axxxxxxx = chi.field_1724.method_24515();
         axxx = axxxxxxx.method_10074();
         a.asn();
         axxxx = dqq.ev();
         axxxxx = dqq.czi();
         short var10001 = 16814;
         long var30 = 8165754414680212308L ^ ax;
         boolean var18 = a.cmi.emb("Modern Watchdog");
         if (axx != null) {
            if (var18) {
               dqq.axd(true);
               dqq.gns(a.fro);
               dqq.eya(a.bda);
               axxxx = a.fro;
               axxxxx = a.bda;
            }

            var19 = a.ftz.dnp();
            if (axx == null) {
               break label223;
            }

            var18 = var19;
         }

         if (var18) {
            a.awh = a.awh + a.caw.dnp().floatValue();
            float var35;
            int var20 = (var35 = a.awh - 360.0F) == 0.0F ? 0 : (var35 < 0.0F ? -1 : 1);
            if (axx != null) {
               if (var20 >= 0) {
                  a.awh -= 360.0F;
               }

               var20 = 1;
            }

            dqq.axd((boolean)var20);
            dqq.gns(a.awh);
            dqq.eya(axxxxx);
         }

         var19 = a.fdy.dnp();
      }

      String axxxxxxxx = (String)var19;
      byte axxxxxxxxx = -1;
      var21 = axxxxxxxx.hashCode();
      label200:
      if (axx != null) {
         switch (var21) {
            case -1595926131:
               short var25 = 9035;
               long var31 = 5997150985746866622L ^ ax;
               var21 = axxxxxxxx.equals("Minecraft");
               if (axx == null) {
                  break label200;
               }

               if (var21 == 0) {
                  break;
               }

               axxxxxxxxx = 0;
               if (axx != null) {
                  break;
               }
            case -1955878649:
               short var26 = 8458;
               long var32 = 6449560193366516734L ^ ax;
               var21 = axxxxxxxx.equals("Normal");
               if (axx == null) {
                  break label200;
               }

               if (var21 == 0) {
                  break;
               }

               axxxxxxxxx = 1;
               if (axx != null) {
                  break;
               }
            case -268477211:
               short var27 = 7820;
               long var33 = 6395202524436520055L ^ ax;
               var21 = axxxxxxxx.equals("Astralis");
               if (axx == null) {
                  break label200;
               }

               if (var21 == 0) {
                  break;
               }

               axxxxxxxxx = 2;
               if (axx != null) {
                  break;
               }
            case 2433880:
               short var28 = 28054;
               long var34 = 2455477989204012864L ^ ax;
               var21 = axxxxxxxx.equals("None");
               if (axx == null) {
                  break label200;
               }

               if (var21 != 0) {
                  axxxxxxxxx = 3;
               }
         }

         var21 = axxxxxxxxx;
      }

      label175: {
         switch (var21) {
            case 0:
               class_3965 axxxxxxxxxx = bfc.cb(4.5F, axxxx, axxxxx);
               class_3965 var23 = axxxxxxxxxx;
               if (axx != null) {
                  if (axxxxxxxxxx == null) {
                     return;
                  }

                  var23 = axxxxxxxxxx;
               }

               if (axx != null) {
                  if (var23.method_17783() != class_240.field_1332) {
                     return;
                  }

                  var23 = axxxxxxxxxx;
               }

               if (!var23.method_17777().equals(a.aeb.ddn)) {
                  return;
               }
               break;
            case 1:
               var22 = a;
               if (axx == null) {
                  break label175;
               }

               if (!bfc.gto(a.aeb.fie, a.aeb.ddn, false, 5.0F, axxxx, axxxxx)) {
                  return;
               }
               break;
            case 2:
               var22 = a;
               if (axx == null) {
                  break label175;
               }

               if (!bfc.eqw(a.aeb.fie, a.aeb.ddn, true, 4.5F, axxxx, axxxxx)) {
                  return;
               }
            case 3:
         }

         var22 = a;
      }

      int var29 = amg.dul(0.0, -1.0, 0.0).method_26215();
      if (axx != null) {
         var29 = var29 != 0 ? ++a.cqp : 0;
      }

      var22.cqp = var29;
      int var24 = chi.field_1687.method_8320(axxx).method_26215();
      if (axx != null) {
         if (var24 == 0) {
            return;
         }

         var24 = a.cfe();
      }

      int axxxxxxxxxxx = var24;
      if (axx != null) {
         if (axxxxxxxxxxx == -1) {
            return;
         }

         chi.field_1724.method_31548().method_61496(axxxxxxxxxxx);
      }

      if (a.aeb != null) {
         class_3965 axxxxxxxxxxxx = new class_3965(a.dax(), a.aeb.fie, a.aeb.ddn, false);
         a.fgl(class_1268.field_5808, axxxxxxxxxxxx);
         a.fwb = false;
      }
   }

   private void asn() {
      long a;
      int[] ax;
      float var7;
      label31: {
         a = fhd.a ^ 35437829175698L;
         int[] var10000 = dar.abu();
         int[] axx = aac.getOrDefault(a.dee.dnp(), new int[0]);
         ax = var10000;
         int var6 = hjr;
         if (ax != null) {
            if (hjr >= axx.length) {
               var7 = 40.0F;
               break label31;
            }

            var6 = axx[hjr];
         }

         var7 = var6;
      }

      float var9;
      float var10001;
      label25: {
         float axx = var7;
         var7 = a.fro;
         var10001 = a.bda;
         Object var10002 = a.cmi;
         if (ax != null) {
            short var10003 = 16814;
            long var10004 = 8165857888138920032L ^ a;
            if (a.cmi.emb("Modern Watchdog")) {
               var9 = axx;
               break label25;
            }

            var10002 = a.bax.dnp();
         }

         var9 = ((ImFloat)var10002).floatValue();
      }

      dqq.edu(var7, var10001, var9, a.aco.dnp().floatValue());
   }

   private void fgl(class_1268 a, class_3965 a) {
      label44: {
         int[] var5;
         label47: {
            long ax = fhd.a ^ 107716994536350L;
            var5 = dar.abu();
            boolean var10000 = aud;
            if (var5 != null) {
               label48: {
                  if (!aud) {
                     var6 = chi.field_1761;
                     if (var5 == null) {
                        break label48;
                     }

                     if (chi.field_1761 == null) {
                        throw new AssertionError();
                     }
                  }

                  chi.field_1761.method_2896(chi.field_1724, a, a);
                  if (var5 == null) {
                     break label47;
                  }

                  var6 = a.ecl.dnp();
               }

               var10000 = (Boolean)var6;
            }

            if (!var10000) {
               break label44;
            }

            chi.field_1724.method_6104(a);
         }

         if (var5 != null) {
            return;
         }
      }

      gix.dsd(new class_2879(class_1268.field_5808));
   }

   private static float ast(class_746 a) {
      int[] ax;
      float axx;
      boolean axxx;
      boolean axxxx;
      int var13;
      label68: {
         long axxxxx = fhd.a ^ 92395695272441L;
         int[] var10000 = dar.abu();
         axx = a.method_36454();
         boolean axxxxxx = chi.field_1690.field_1894.method_1434();
         byte axxxxxxx = chi.field_1690.field_1881.method_1434();
         ax = var10000;
         axxx = chi.field_1690.field_1913.method_1434();
         axxxx = chi.field_1690.field_1849.method_1434();
         var13 = axxxxxx;
         if (ax != null) {
            if (axxxxxx != 0) {
               var13 = 1;
               break label68;
            }

            var13 = axxxxxxx;
         }

         if (ax != null) {
            var13 = var13 != 0 ? -1 : 0;
         }
      }

      int axxxxxxxx;
      label62: {
         axxxxxxxx = var13;
         var13 = axxxx;
         if (ax != null) {
            if (axxxx != 0) {
               var13 = 1;
               break label62;
            }

            var13 = axxx;
         }

         if (ax != null) {
            var13 = var13 != 0 ? -1 : 0;
         }
      }

      int axxxxxxxxx = var13;
      var13 = axxxxxxxx;
      label56:
      if (ax != null) {
         if (axxxxxxxx == 0) {
            var13 = axxxxxxxxx;
            if (ax == null) {
               break label56;
            }

            if (axxxxxxxxx == 0) {
               return axx;
            }
         }

         var13 = axxxxxxxxx;
      }

      double axxxxxxxxxx = Math.atan2(var13, axxxxxxxx);
      return axx + (float)Math.toDegrees(axxxxxxxxxx);
   }

   private void brh(etk a) {
      long ax = fhd.a ^ 25172407335797L;
      int[] axx = dar.abu();
      fhd var10000 = a;
      if (axx != null) {
         label225:
         if (a.dds.dnp()) {
            boolean var8 = chi.field_1724.method_24828();
            if (axx != null) {
               if (!var8) {
                  break label225;
               }

               var8 = evd.dbj();
            }

            if (axx != null) {
               if (!var8) {
                  break label225;
               }

               var8 = chi.field_1690.field_1903.method_1434();
            }

            if (axx != null) {
               if (var8) {
                  break label225;
               }

               var8 = dar.gqy().aws().diy(eky.class).dsv();
            }

            if (axx != null) {
               if (var8) {
                  break label225;
               }

               short var10001 = 8548;
               long var10002 = 8547733362598502991L ^ ax;
               var8 = a.cmi.emb("God Bridge");
            }

            boolean axxx;
            label203: {
               label232: {
                  axxx = var8;
                  var9 = evd.bpi();
                  if (axx != null) {
                     if (!var9) {
                        break label232;
                     }

                     var9 = a.fgh.dnp();
                  }

                  if (axx == null) {
                     break label203;
                  }

                  if (var9) {
                     var9 = true;
                     break label203;
                  }
               }

               var9 = false;
            }

            boolean axxxx;
            boolean axxxxx;
            label233: {
               axxxx = var9;
               int var10 = axxx;
               if (axx != null) {
                  if (axxx != 0) {
                     label187: {
                        label235: {
                           var11 = a.cqp;
                           if (axx != null) {
                              if (a.cqp <= 0) {
                                 break label235;
                              }

                              var11 = a.hfv;
                           }

                           if (axx == null) {
                              break label187;
                           }

                           if (var11 > a.ait.dnp().intValue()) {
                              var11 = 1;
                              break label187;
                           }
                        }

                        var11 = 0;
                     }

                     axxxxx = (boolean)var11;
                     if (axx != null) {
                        break label233;
                     }
                  }

                  var10 = a.aos;
               }

               label172: {
                  label236: {
                     if (axx != null) {
                        if (var10 != 0) {
                           var10 = a.aos % a.ait.dnp().intValue();
                           if (axx == null) {
                              break label172;
                           }

                           if (var10 == 0) {
                              break label236;
                           }
                        }

                        var10 = a.ait.dnp().intValue();
                     }

                     if (axx == null) {
                        break label172;
                     }

                     if (var10 != 1) {
                        var10 = 0;
                        break label172;
                     }
                  }

                  var10 = 1;
               }

               axxxxx = (boolean)var10;
            }

            label158: {
               label157: {
                  label237: {
                     var12 = axxxxx;
                     if (axx != null) {
                        if (axxxxx == 0) {
                           break label237;
                        }

                        var12 = axxxx;
                     }

                     if (axx != null) {
                        if (var12 != 0) {
                           break label237;
                        }

                        var12 = a.bcy;
                     }

                     if (axx != null) {
                        if (var12 != 0) {
                           break label237;
                        }

                        a.eeq = true;
                        a.bcy = true;
                        var12 = axxx;
                     }

                     if (axx == null) {
                        break label158;
                     }

                     if (var12 == 0) {
                        break label157;
                     }

                     a.hfv = -1;
                     if (axx != null) {
                        break label157;
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
               a.bcy = false;
            }

            return;
         }

         var10000 = a;
      }

      var10000.bcy = false;
   }

   @gdz
   public void gjj(bsm event) {
      long ax = fhd.a ^ 15300708672982L;
      int[] var4 = dar.abu();
      fhd var10000 = a;
      if (var4 != null) {
         if (!a.ckt.dnp()) {
            return;
         }

         var10000 = a;
      }

      label35: {
         if (var4 != null) {
            if (var10000.aeb == null) {
               break label35;
            }

            var10000 = a;
         }

         var10000.gei = a.aeb.ddn;
      }

      if (!aud && a.aeb == null) {
         throw new AssertionError();
      } else {
         class_4587 var5 = a.bus();
         class_238 var10001 = new class_238(a.aeb.ddn);
         Color var10002 = dar.gqy().deo();
         short var10003 = 21270;
         long var10004 = 4244077891437926787L ^ ax;
         bqf.hjf(var5, var10001, var10002, -1543554869);
      }
   }

   @gdz
   public void cxn(ctt event) {
      long ax = fhd.a ^ 129838818100957L;
      int[] axx = dar.abu();
      if (a.bnq.dnp()) {
         float axxx;
         float axxxx;
         String axxxxx;
         int var10000;
         class_1041 axxxxxx = chi.method_22683();
         axxx = axxxxxx.method_4486() / 2.0F;
         axxxx = axxxxxx.method_4502() / 2.0F + 5.0F;
         axxxxx = String.valueOf(a.aaq());
         String var9 = a.esi.dnp();
         byte var10 = -1;
         var10000 = var9.hashCode();
         label48:
         if (axx != null) {
            switch (var10000) {
               case 1956520879:
                  short var10001 = 29641;
                  long var10002 = 7562085409215745396L ^ ax;
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
                  short var20 = 7820;
                  long var25 = 6395224588072116236L ^ ax;
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
               short var21 = 29105;
               long var26 = 6773842207986880280L ^ ax;
               float axxxxxxxxxxxx = acy.eq("Blocks");
               float axxxxxxxxxxxxx = ahh.eq(axxxxx);
               float axxxxxxxxxxxxxx = axxx - (axxxxxxxxxxxxx + 2.0F + axxxxxxxxxxxx) / 2.0F;
               ahh.aof(axxxxx, axxxxxxxxxxxxxx, axxxx, dar.gqy().deo());
               var21 = 11675;
               var26 = 6164161005039113006L ^ ax;
               acy.aof("Blocks", axxxxxxxxxxxxxx + axxxxxxxxxxxxx + 2.0F, axxxx, Color.white);
               if (axx != null) {
                  break;
               }
            case 1:
               short var23 = 11675;
               long var28 = 6164161005039113006L ^ ax;
               float axxxxxxx = ety.eq("Blocks");
               float axxxxxxxx = bsf.eq(axxxxx);
               float axxxxxxxxx = axxxxxxxx + 2.0F + axxxxxxx;
               float axxxxxxxxxx = axxx - axxxxxxxxx / 2.0F;
               float axxxxxxxxxxx = axxxx + 2.5F;
               float var19 = axxxxxxxxxx - 3.0F;
               float var29 = axxxxxxxxx + 6.0F;
               short var10007 = 3630;
               long var10008 = 8538805727756838833L ^ ax;
               short var31 = 641;
               long var10009 = 7893829756732795676L ^ ax;
               short var32 = 30656;
               long var10010 = 6116061737246563930L ^ ax;
               dmp.cpp(var19, axxxx, var29, 15.0F, 3.0F, new Color(-1520536531, 437273364, -1170090830, a.csq.dnp().intValue()));
               bsf.aof(axxxxx, axxxxxxxxxx, axxxxxxxxxxx, dar.gqy().deo());
               var23 = 11675;
               var28 = 6164161005039113006L ^ ax;
               ety.aof("Blocks", axxxxxxxxxx + axxxxxxxx + 2.0F, axxxxxxxxxxx, Color.white);
         }
      }
   }

   @gdz
   public void duh(eel event) {
      long ax = fhd.a ^ 119383045602676L;
      if (a.bnq.dnp()) {
         class_1041 axx = chi.method_22683();
         short var10001 = 7820;
         long var10002 = 6395248237024254885L ^ ax;
         if (a.esi.emb("Astralis")) {
            var10001 = 11675;
            var10002 = 6164131858239727751L ^ ax;
            float axxx = ety.eq("Blocks");
            float axxxx = bsf.eq(String.valueOf(a.aaq()));
            float axxxxx = axxxx + 2.0F + axxx;
            dmp.fnq(axx.method_4486() / 2.0F - axxxxx / 2.0F - 3.0F, axx.method_4502() / 2.0F + 5.0F, axxxxx + 6.0F, 15.0F, 3.0F);
         }
      }
   }

   public static float awo(float f) {
      long ax = fhd.a ^ 985714522663L;
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

   private float[] ecz() {
      float a;
      int var21;
      label243: {
         label242: {
            label246: {
               long ax;
               int[] axx;
               float axxx;
               ax = fhd.a ^ 12441410494553L;
               int[] var10000 = dar.abu();
               a = 81.5F;
               axx = var10000;
               axxx = ast(chi.field_1724) + 180.0F;
               var15 = a;
               label240:
               if (axx != null) {
                  label238:
                  if (!a.ert(hjr)) {
                     var21 = evd.dbj();
                     if (axx != null) {
                        if (var21 == 0) {
                           var15 = a.bij.dnp();
                           if (axx == null) {
                              break label240;
                           }

                           if (var15) {
                              break label238;
                           }
                        }

                        var21 = a.bij.dnp();
                     }

                     if (axx == null) {
                        break label242;
                     }

                     if (var21 != 0) {
                        break label246;
                     }
                  }

                  var15 = a.cmi.dnp();
               }

               String var6 = (String)var15;
               byte var7 = -1;
               var21 = var6.hashCode();
               label224:
               if (axx != null) {
                  switch (var21) {
                     case 2581482:
                        short var10001 = 14946;
                        long var10002 = 3568197132293087818L ^ ax;
                        var21 = var6.equals("Snap");
                        if (axx == null) {
                           break label224;
                        }

                        if (var21 == 0) {
                           break;
                        }

                        var7 = 0;
                        if (axx != null) {
                           break;
                        }
                     case 444110177:
                        short var25 = 10732;
                        long var30 = 1726327049901388235L ^ ax;
                        var21 = var6.equals("Brute Force");
                        if (axx == null) {
                           break label224;
                        }

                        if (var21 == 0) {
                           break;
                        }

                        var7 = 1;
                        if (axx != null) {
                           break;
                        }
                     case 482016750:
                        short var26 = 16814;
                        long var31 = 8165834367109028267L ^ ax;
                        var21 = var6.equals("Modern Watchdog");
                        if (axx == null) {
                           break label224;
                        }

                        if (var21 == 0) {
                           break;
                        }

                        var7 = 2;
                        if (axx != null) {
                           break;
                        }
                     case 63955982:
                        short var27 = 2489;
                        long var32 = 3522680914403365261L ^ ax;
                        var21 = var6.equals("Basic");
                        if (axx == null) {
                           break label224;
                        }

                        if (var21 != 0) {
                           var7 = 3;
                        }
                  }

                  var21 = var7;
               }

               if (axx == null) {
                  break label242;
               }

               switch (var21) {
                  case 0:
                     var21 = chi.field_1690.field_1903.method_1434();
                     if (axx != null) {
                        if (var21 != 0) {
                           return cse(a.aeb.ddn.method_10263(), a.aeb.ddn.method_10264(), a.aeb.ddn.method_10260(), a.aeb.fie);
                        }

                        var21 = amg.gmi(chi.field_1724.method_24515());
                     }

                     if (axx == null) {
                        break label243;
                     }

                     if (var21 == 0) {
                        var21 = 2;
                        break label243;
                     }

                     if (axx == null) {
                        return cse(a.aeb.ddn.method_10263(), a.aeb.ddn.method_10264(), a.aeb.ddn.method_10260(), a.aeb.fie);
                     }

                     if (a.aeb != null) {
                        return cse(a.aeb.ddn.method_10263(), a.aeb.ddn.method_10264(), a.aeb.ddn.method_10260(), a.aeb.fie);
                     }
                     break;
                  case 1:
                     efy var20 = a.aeb;
                     if (axx != null) {
                        if (a.aeb == null) {
                           return new float[]{axxx, a};
                        }

                        var20 = a.aeb;
                     }

                     float[] axxxxx = cse(var20.ddn.method_10263(), a.aeb.ddn.method_10264(), a.aeb.ddn.method_10260(), a.aeb.fie);
                     a = axxxxx[1];
                     axxx = axxxxx[0];
                     return new float[]{axxx, a};
                  case 2:
                     boolean axxxx;
                     double var29;
                     label178: {
                        axxxx = chi.field_1690.field_1894.method_1434();
                        boolean axxxxx = chi.field_1690.field_1913.method_1434();
                        var17 = chi.field_1724.method_36454();
                        boolean var28 = axxxxx;
                        if (axx != null) {
                           if (axxxxx == chi.field_1690.field_1849.method_1434()) {
                              var29 = 0.0;
                              break label178;
                           }

                           var28 = axxxxx;
                        }

                        var29 = var28 ? 1.0 : -1.0;
                     }

                     double var34;
                     label172: {
                        boolean var33 = axxxx;
                        if (axx != null) {
                           if (axxxx == chi.field_1690.field_1881.method_1434()) {
                              var34 = 0.0;
                              break label172;
                           }

                           var33 = axxxx;
                        }

                        var34 = var33 ? 1.0 : -1.0;
                     }

                     label166: {
                        float axxxxx = var17 - (float)Math.toDegrees(Math.atan2(var29, var34));
                        float axxxxxx = awo(axxxxx);
                        axxx = axxxxx - 180.0F;
                        efy var18 = a.aeb;
                        if (axx != null) {
                           if (a.aeb == null) {
                              break label166;
                           }

                           var18 = a.aeb;
                        }

                        float[] axxxxxxx = cse(var18.ddn.method_10263(), a.aeb.ddn.method_10264(), a.aeb.ddn.method_10260(), a.aeb.fie);
                        a.cvz = axxx = axxxxxxx[0];
                        a.ahz = a = axxxxxxx[1];
                     }

                     float var35;
                     label160: {
                        var19 = new float[2];
                        fhd var10003 = a;
                        if (axx != null) {
                           if (a.gf.dnp()) {
                              var35 = axxx;
                              break label160;
                           }

                           var10003 = a;
                        }

                        var35 = var10003.cvz;
                     }

                     label154: {
                        var19[0] = var35;
                        fhd var36 = a;
                        if (axx != null) {
                           if (a.gf.dnp()) {
                              var35 = a;
                              break label154;
                           }

                           var36 = a;
                        }

                        var35 = var36.ahz;
                     }

                     var19[1] = var35;
                     return var19;
                  case 3:
                     return new float[]{axxx, a};
               }
            }

            var21 = 2;
         }

         float[] var24 = new float[var21];
         var24[0] = fst(chi.field_1724);
         var24[1] = a;
         return var24;
      }

      float[] var23 = new float[var21];
      var23[0] = chi.field_1724.method_36454();
      var23[1] = a;
      return var23;
   }

   private static float fst(class_746 a) {
      long ax = fhd.a ^ 122694096422616L;
      int[] var10000 = dar.abu();
      class_243 axx = a.method_18798();
      int[] axxx = var10000;
      double var11 = axx.method_1027();
      double var10001 = 1.0E-6;
      if (axxx != null) {
         if (!(var11 > 1.0E-6)) {
            float axxxx = a.field_3913.method_3128().field_1343;
            float axxxxx = a.field_3913.method_3128().field_1342;
            float var12 = axxxx;
            if (axxx != null) {
               label35:
               if (axxxx == 0.0F) {
                  float var13 = axxxxx;
                  if (axxx != null) {
                     if (axxxxx != 0.0F) {
                        break label35;
                     }

                     var13 = class_3532.method_15393(a.method_36454());
                  }

                  return var13;
               }

               var12 = axxxxx;
            }

            double axxxxxx = Math.toDegrees(Math.atan2(var12, axxxx));
            float axxxxxxx = a.method_36454() + (float)axxxxxx;
            return class_3532.method_15393(axxxxxxx);
         }

         var11 = -axx.field_1352;
         var10001 = axx.field_1350;
      }

      float axxxx = (float)Math.toDegrees(Math.atan2(var11, var10001));
      return class_3532.method_15393(axxxx);
   }

   public static float[] cse(double x, double y, double z, class_2350 direction) {
      long ax = fhd.a ^ 77362082436317L;
      class_638 axx = chi.field_1687;
      if (axx == null) {
         return new float[]{0.0F, 0.0F};
      } else {
         class_1297 axxx = new fs(class_1299.field_6052, axx);
         axxx.method_5814(a + 0.5 + a.method_10148() * 0.5, a + 0.5 + a.method_10164() * 0.5, a + 0.5 + a.method_10165() * 0.5);
         return abo(axxx.method_23317(), axxx.method_23318(), axxx.method_23321());
      }
   }

   public static float[] abo(double x, double y, double z) {
      long ax = fhd.a ^ 54941233386513L;
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

   private boolean ert(int a) {
      int[] ax;
      int var7;
      long axx = fhd.a ^ 115593265294453L;
      int[] var10000 = dar.abu();
      String var5 = a.hio.dnp();
      ax = var10000;
      byte var6 = -1;
      var7 = var5.hashCode();
      label78:
      if (ax != null) {
         switch (var7) {
            case 80691912:
               short var10001 = 14512;
               long var10002 = 5276681812700343L ^ axx;
               var7 = var5.equals("Telly");
               if (ax == null) {
                  break label78;
               }

               if (var7 == 0) {
                  break;
               }

               var6 = 0;
               if (ax != null) {
                  break;
               }
            case -1684174727:
               short var8 = 19258;
               long var10 = 6249436431461588793L ^ axx;
               var7 = var5.equals("Telly Slow");
               if (ax == null) {
                  break label78;
               }

               if (var7 == 0) {
                  break;
               }

               var6 = 1;
               if (ax != null) {
                  break;
               }
            case -268477211:
               short var9 = 5245;
               long var11 = 8144786918167855218L ^ axx;
               var7 = var5.equals("Astralis");
               if (ax == null) {
                  break label78;
               }

               if (var7 != 0) {
                  var6 = 2;
               }
         }

         var7 = var6;
      }

      if (ax != null) {
         switch (var7) {
            case 0:
               var7 = bna.fsc((long)crg.gj(80.0F, 100.0F));
               break;
            case 1:
               var7 = a;
               if (ax != null) {
                  var7 = a > 2 ? 1 : 0;
               }
               break;
            case 2:
               var7 = chi.field_1724.method_24828();
               if (ax != null) {
                  var7 = var7 == 0 ? 1 : 0;
               }
               break;
            default:
               var7 = 0;
         }
      }

      return (boolean)var7;
   }

   private void bvj() {
      long a;
      int[] ax;
      class_2338 axx;
      int var18;
      label183: {
         label182: {
            label186: {
               a = fhd.a ^ 122960221265420L;
               int[] var10000 = dar.abu();
               axx = chi.field_1724.method_24515();
               ax = var10000;
               var18 = a.ady.dnp();
               if (ax != null) {
                  if (var18 == 0) {
                     break label186;
                  }

                  var18 = chi.field_1690.field_1903.method_1434();
               }

               if (ax == null) {
                  break label183;
               }

               if (var18 == 0) {
                  break label182;
               }

               var18 = a.fwb;
               if (ax == null) {
                  break label183;
               }

               if (a.fwb) {
                  break label182;
               }
            }

            var18 = axx.method_10264();
            break label183;
         }

         var18 = (int)a.bet;
      }

      label187: {
         int axxx = var18;
         class_2338 axxxx = new class_2338(axx.method_10263(), axxx - 1, axx.method_10260());
         a.fmi.clear();
         var19 = chi.field_1687.method_8320(axxxx).method_26215();
         label164:
         if (ax != null) {
            if (var19) {
               int axxxxx = 0;

               label160:
               do {
                  float var25;
                  var18 = (var25 = axxxxx - a.bab.dnp().floatValue()) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);

                  label157:
                  while (true) {
                     if (var18 >= 0) {
                        break label160;
                     }

                     var19 = false;
                     if (ax == null) {
                        break label164;
                     }

                     int axxxxxx = 0;

                     while (true) {
                        float var26;
                        var18 = (var26 = axxxxxx - a.bab.dnp().floatValue()) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);

                        label152:
                        while (true) {
                           if (var18 >= 0) {
                              break label157;
                           }

                           var18 = 1;
                           if (ax == null) {
                              continue label157;
                           }

                           int axxxxxxx = 1;

                           while (true) {
                              short var10001 = 2451;
                              long var10002 = 4226583816160000211L ^ a;
                              if (axxxxxxx <= -879912463) {
                                 break label152;
                              }

                              class_2338 axxxxxxxx = axxxx.method_10069(axxxxx * axxxxxxx, 0, axxxxxx * axxxxxxx);
                              label118:
                              if (ax != null) {
                                 var18 = chi.field_1687.method_8320(axxxxxxxx).method_26215();
                                 if (ax == null) {
                                    break;
                                 }

                                 if (var18 != 0) {
                                    class_2350[] var11 = class_2350.values();
                                    int var12 = var11.length;
                                    int var13 = 0;

                                    while (var13 < var12) {
                                       class_2350 axxxxxxxxx = var11[var13];
                                       if (ax == null) {
                                          break label118;
                                       }

                                       label141: {
                                          if (axxxxxxxxx != class_2350.field_11036) {
                                             class_2338 axxxxxxxxxx = axxxxxxxx.method_10093(axxxxxxxxx);
                                             class_2680 axxxxxxxxxxx = chi.field_1687.method_8320(axxxxxxxxxx);
                                             class_2248 axxxxxxxxxxxx = axxxxxxxxxxx.method_26204();
                                             if (ax == null) {
                                                break label141;
                                             }

                                             label138:
                                             if (!axxxxxxxxxxx.method_26215()) {
                                                class_2248 var22 = axxxxxxxxxxxx;
                                                if (ax != null) {
                                                   if (axxxxxxxxxxxx instanceof class_2404) {
                                                      break label138;
                                                   }

                                                   var22 = axxxxxxxxxxxx;
                                                }

                                                class_2248 var24 = class_2246.field_10214;
                                                if (ax != null) {
                                                   if (var22 == class_2246.field_10214) {
                                                      break label138;
                                                   }

                                                   var22 = axxxxxxxxxxxx;
                                                   var24 = class_2246.field_10479;
                                                }

                                                if (var22 != var24) {
                                                   a.fmi.add(new efy(axxxxxxxxxx, axxxxxxxxx.method_10153()));
                                                }
                                             }
                                          }

                                          var13++;
                                       }

                                       if (ax == null) {
                                          break;
                                       }
                                    }
                                 }

                                 axxxxxxx -= 2;
                              }

                              if (ax == null) {
                                 break label152;
                              }
                           }
                        }

                        axxxxxx++;
                        if (ax == null) {
                           break label157;
                        }
                     }
                  }

                  axxxxx++;
               } while (ax != null);
            }

            a.fmi.sort(Comparator.comparingDouble(axxxxx -> axxxxx.ddn.method_10262(a)));
            var23 = a;
            if (ax == null) {
               break label187;
            }

            var19 = a.fmi.isEmpty();
         }

         if (!var19) {
            a.aeb = a.fmi.get(0);
            if (ax != null) {
               return;
            }
         }

         var23 = a;
      }

      var23.aeb = null;
   }

   private int cfe() {
      long a = fhd.a ^ 10562836269993L;
      int[] var10000 = dar.abu();
      int ax = -1;
      int[] axx = var10000;
      int axxx = 0;
      int axxxx = 0;

      while (true) {
         short var10001 = 17284;
         long var10002 = 1999170418732279678L ^ a;
         if (axxxx < -1591548452) {
            class_1799 axxxxx = chi.field_1724.method_31548().method_5438(axxxx);
            if (axx != null) {
               var8 = axxxxx.method_7909() instanceof class_1747;
               if (axx == null) {
                  break;
               }

               label36:
               if (var8 != 0) {
                  int var9 = axxxxx.method_7947();
                  if (axx != null) {
                     if (var9 <= axxx) {
                        break label36;
                     }

                     axxx = axxxxx.method_7947();
                     var9 = axxxx;
                  }

                  ax = var9;
               }

               axxxx++;
            }

            if (axx != null) {
               continue;
            }
         }

         var8 = ax;
         break;
      }

      return var8;
   }

   private class_243 dax() {
      long a = fhd.a ^ 112315981941545L;
      int[] ax = dar.abu();
      efy var10000 = a.aeb;
      if (ax != null) {
         if (a.aeb == null) {
            return null;
         }

         var10000 = a.aeb;
      }

      double axx;
      double axxx;
      double axxxx;
      label73: {
         class_2338 axxxxx = var10000.ddn;
         axx = axxxxx.method_10263() + Math.random();
         axxx = axxxxx.method_10264() + Math.random();
         axxxx = axxxxx.method_10260() + Math.random();
         class_239 axxxxxx = chi.field_1765;
         int var13 = ezj.gya[a.aeb.fie.ordinal()];
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
         if (!axxxxxxx.method_17777().equals(a.aeb.ddn)) {
            return new class_243(axx, axxx, axxxx);
         }

         var15 = axxxxxxx;
      }

      if (ax != null) {
         if (var15.method_17780() != a.aeb.fie) {
            return new class_243(axx, axxx, axxxx);
         }

         axx = axxxxxxx.method_17784().field_1352;
         axxx = axxxxxxx.method_17784().field_1351;
         var15 = axxxxxxx;
      }

      axxxx = var15.method_17784().field_1350;
      return new class_243(axx, axxx, axxxx);
   }

   private int aaq() {
      long a = fhd.a ^ 18556761390697L;
      int[] var10000 = dar.abu();
      int ax = 0;
      int[] axx = var10000;
      int axxx = 0;

      while (true) {
         if (axxx < chi.field_1724.method_31548().method_5439()) {
            class_1799 axxxx = chi.field_1724.method_31548().method_5438(axxx);
            class_1792 axxxxx = axxxx.method_7909();
            label32:
            if (axx != null) {
               var10 = axxxxx instanceof class_1747;
               if (axx == null) {
                  break;
               }

               if (var10 != 0) {
                  class_1747 axxxxxx = (class_1747)axxxxx;
                  class_2248 axxxxxxx = axxxxxx.method_7711();
                  if (axx == null) {
                     break label32;
                  }

                  if (amg.ayj(axxxxxxx)) {
                     ax += axxxx.method_7947();
                  }
               }

               axxx++;
            }

            if (axx != null) {
               continue;
            }
         }

         var10 = ax;
         break;
      }

      return var10;
   }

   static {
      long var20 = a ^ 82854555301068L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[51];
      int var16 = 0;
      String var15 = "à\u0096\u00946\u0016.ÝÆG'y8©ÍíÄ(P\u0091î>Ô§\tÀ½h\u0098\u009cã2\u000fâì:Â¤Å\u0014³êÜ²û\u0010°E\u001f7ÿk_#ü~ª\u0001 (d¯iÍ\u0091ø N\u008a\u001d\u000e¨~>üEÉÄë\u0088Ð´ÔÌ\u0088\u0099âRø\u0090\u0018 nÇ~¼¡Jµ®°§ÃU.\f\u000f\u0091R\u008f\\\u0006mýX\u0095Uº\u009e`\tëa\u007f\u0010Ý\u0002ÈÂáX\u0097,Èiõ¥\u008bWN\u0091\u0010É\u001dà\u009bV\fï\u0095oâIa\u009f¶>_\u0010vÎç»ÒÒ²Ù\u0088ç\u008fÌ\u0011\u0086Cã\u0018+µ(×`S\u0007Í<fÕÎæDhqS_Û¢¢\u008aè;(a\nCjs\u0003Ï2¬}\u008d\u00ad\u007fYô\u001aÅ[*¢\bö\u0014¥Bnîýv½c*\u0017ÅÓ\u0098C£q\u009a iþ*[@S%\u001f\u001c\u0093ãyA\u001eÀþ\u008e\u0086iÍÀ44Ë#In9ló¶?\u0018XK¥;jÆÄ\u000f\u007f:b{Ö&àñ*9\u0084ÓÎ¡\u0080È\u0010\u000b\u001djÜ\u008dO\"ÉÁÉ\u0089m¦Öjõ ®\u0015\u009cfÜ\u0010÷jár¢QQ\u001f\"\u0096ï->t\u0018a\fæ\u009a« J\u0080l¥L\u0010×e\u0080h(/\u0002Môa¡Q\u001a\u0087\tE O\u008eM&¤HÈØ\u0014¿®0ê×»(\u0016F\u0006[Vg\u0081m0^5-\f\u008e¾Y \u0093\u009dè d1²a\u009fÕq·a\u0018]\u0097\u0082\u008f\u0091Á!í.?VÛ8\u0016[%^«(\u0006<ìZ¯1\u008c>\u0011ß\u009e,³)«[þ!\u000fP\u009b\u0093.®mq\"\u00808\u0005\u00906ÄyÔ@²ÀÜ\u009e\u0018ÛWÏÒ\u0081\u001a\u0084\u008dÀW;³\u0018\u001fÂ9>p¼MµmÄþ\u0010\u0093õ0&(ÉÂð^ÀO)\u001d«Y, 3é\u0002|\u0094\u0005vÑ\u009c- ÅÈ¬Wçpù\u009dN=s\u0012\u0087÷q<9«õ\u0083ò\u0010\u0010\u009d\u001a\u0003X\\h³=ÇÖµ¢rß\u008a\u0010m}\u009dAêmñÎåà½YR\u0003Æ\u009a 7áåê|f\u0088¾Ób4Ý*À\u0080ù\u00973\r\u0097\u00adg'áô\u000f\u009b4\u0091½gß\u0010èHü2\u001cÉ\"@9ÐÉ·èn\u0019\u0013\u0010Î§\t\u00045\u0081\b_øû¦ë\u0006ß²j\u0010Ü\tòt\u0011aÆ¯\u009c\u0002l.²\u008aR%\u0010\u000b^þÄ\u0001\u008dShUÐ\u008f\u0084j\u0003Ë\u0097 p»ÅC\u0016L\u0097À4\u001aõâ¨ú+û\u0003¿ÈHPbO\u0015s¯ÕvÉ^$d\u0010P\u0000/C6\"u]ÑÉ=ò+\u0086\u001c¤ ß\u008fH»± \u0007\u009d¯\u0086¤¹c@B\u00ad\u008ck^Üµêx©æVæÉ\u009b\u009a!·\u0010\u0002&Ô5Ñè\u0005ß\u009dþtÜì\u0084ÆE\u0010]ºp\u0006\u008e>\u008as:æCrÖpBD\u0010\nø30\u009d\u008eºÂX¤¯HÇ1Â*\u0010.Å\u0096\u009c0e~ëÈ\u0007ì°Õ¬^\u0004 K®ùß¸\u007fÑû~ÌNP\u0081\u0080ùàÁ1\u008d\u009cló\u0098±?\u009c\u0081\u0004\u0012\b!\u0004\u0010\u0090Î{\u0006³c\"\u0015¬º~\u008c&\u0098õ´0e\u009a\u0007eè \\ýÏÒ\u009fë@¥Ø¹ASý\u009c\u0083Ã\r\u0005\u0085\tù±\u0012ñ¯:µ'\u008béø9c\u0016ð:\u0001¤Ô\u00117§\u0010ò\u008a\u0081lz÷\"\u001eÞòþ;\u001c¨ø\u0011\u0010\u0006\u001d±|ê\u009a{z}¸ä\u0083\"H.H lp\u007f½\u0087ZÒ\u009d²6Ì/5öf±:e¡\u0017¬BÍ\u007f®`Ë*»k8-\u0018`\u0007#¦Íå~¬\u008cÆÁ\u0010ugPaÞ\u008a\u001aûµ\u0001-4 \u0098\u0017ÛxqèUÊF¼éfKDDhÈ¢k\u0003`×$\u009eâú\u0097\u0080@ú\u001f:\u0018?´\u0081P\u0016û\fëÚ\u0082I\u009fÛ'!Å\\`\u0097\u009d\u0016I~\"\u0010Í±G§wz\u0080é{ò\u0016\u009fäc\u009aS\u0018\u0085\u0014\u009eÔn,/ý\u001e\u001b%!YFL\u009cuß\u0093(\u0010T³¬(i\u008c\u0082JUÌÅ°ñµ¸\u0087}ÎÄÒÍ\u00ad5îª\\\u008e\nPÎ'*\fd¯ÊË7¼\u0000\u0006ü=g\u0010 \u0019+Ý\u0089þ \u00177\u0001Y¼\u0000e\tf\u0018!é\u0018\u001dÔ£8\u001dE\u008a1¬µÌ?ô«àäÛ%\u0011Z¥\u0018âVW\u0006\u009eµõ\u0097ê+/b£\u007f¹\u009a$ú¾ày\u008a½T";
      int var17 = "à\u0096\u00946\u0016.ÝÆG'y8©ÍíÄ(P\u0091î>Ô§\tÀ½h\u0098\u009cã2\u000fâì:Â¤Å\u0014³êÜ²û\u0010°E\u001f7ÿk_#ü~ª\u0001 (d¯iÍ\u0091ø N\u008a\u001d\u000e¨~>üEÉÄë\u0088Ð´ÔÌ\u0088\u0099âRø\u0090\u0018 nÇ~¼¡Jµ®°§ÃU.\f\u000f\u0091R\u008f\\\u0006mýX\u0095Uº\u009e`\tëa\u007f\u0010Ý\u0002ÈÂáX\u0097,Èiõ¥\u008bWN\u0091\u0010É\u001dà\u009bV\fï\u0095oâIa\u009f¶>_\u0010vÎç»ÒÒ²Ù\u0088ç\u008fÌ\u0011\u0086Cã\u0018+µ(×`S\u0007Í<fÕÎæDhqS_Û¢¢\u008aè;(a\nCjs\u0003Ï2¬}\u008d\u00ad\u007fYô\u001aÅ[*¢\bö\u0014¥Bnîýv½c*\u0017ÅÓ\u0098C£q\u009a iþ*[@S%\u001f\u001c\u0093ãyA\u001eÀþ\u008e\u0086iÍÀ44Ë#In9ló¶?\u0018XK¥;jÆÄ\u000f\u007f:b{Ö&àñ*9\u0084ÓÎ¡\u0080È\u0010\u000b\u001djÜ\u008dO\"ÉÁÉ\u0089m¦Öjõ ®\u0015\u009cfÜ\u0010÷jár¢QQ\u001f\"\u0096ï->t\u0018a\fæ\u009a« J\u0080l¥L\u0010×e\u0080h(/\u0002Môa¡Q\u001a\u0087\tE O\u008eM&¤HÈØ\u0014¿®0ê×»(\u0016F\u0006[Vg\u0081m0^5-\f\u008e¾Y \u0093\u009dè d1²a\u009fÕq·a\u0018]\u0097\u0082\u008f\u0091Á!í.?VÛ8\u0016[%^«(\u0006<ìZ¯1\u008c>\u0011ß\u009e,³)«[þ!\u000fP\u009b\u0093.®mq\"\u00808\u0005\u00906ÄyÔ@²ÀÜ\u009e\u0018ÛWÏÒ\u0081\u001a\u0084\u008dÀW;³\u0018\u001fÂ9>p¼MµmÄþ\u0010\u0093õ0&(ÉÂð^ÀO)\u001d«Y, 3é\u0002|\u0094\u0005vÑ\u009c- ÅÈ¬Wçpù\u009dN=s\u0012\u0087÷q<9«õ\u0083ò\u0010\u0010\u009d\u001a\u0003X\\h³=ÇÖµ¢rß\u008a\u0010m}\u009dAêmñÎåà½YR\u0003Æ\u009a 7áåê|f\u0088¾Ób4Ý*À\u0080ù\u00973\r\u0097\u00adg'áô\u000f\u009b4\u0091½gß\u0010èHü2\u001cÉ\"@9ÐÉ·èn\u0019\u0013\u0010Î§\t\u00045\u0081\b_øû¦ë\u0006ß²j\u0010Ü\tòt\u0011aÆ¯\u009c\u0002l.²\u008aR%\u0010\u000b^þÄ\u0001\u008dShUÐ\u008f\u0084j\u0003Ë\u0097 p»ÅC\u0016L\u0097À4\u001aõâ¨ú+û\u0003¿ÈHPbO\u0015s¯ÕvÉ^$d\u0010P\u0000/C6\"u]ÑÉ=ò+\u0086\u001c¤ ß\u008fH»± \u0007\u009d¯\u0086¤¹c@B\u00ad\u008ck^Üµêx©æVæÉ\u009b\u009a!·\u0010\u0002&Ô5Ñè\u0005ß\u009dþtÜì\u0084ÆE\u0010]ºp\u0006\u008e>\u008as:æCrÖpBD\u0010\nø30\u009d\u008eºÂX¤¯HÇ1Â*\u0010.Å\u0096\u009c0e~ëÈ\u0007ì°Õ¬^\u0004 K®ùß¸\u007fÑû~ÌNP\u0081\u0080ùàÁ1\u008d\u009cló\u0098±?\u009c\u0081\u0004\u0012\b!\u0004\u0010\u0090Î{\u0006³c\"\u0015¬º~\u008c&\u0098õ´0e\u009a\u0007eè \\ýÏÒ\u009fë@¥Ø¹ASý\u009c\u0083Ã\r\u0005\u0085\tù±\u0012ñ¯:µ'\u008béø9c\u0016ð:\u0001¤Ô\u00117§\u0010ò\u008a\u0081lz÷\"\u001eÞòþ;\u001c¨ø\u0011\u0010\u0006\u001d±|ê\u009a{z}¸ä\u0083\"H.H lp\u007f½\u0087ZÒ\u009d²6Ì/5öf±:e¡\u0017¬BÍ\u007f®`Ë*»k8-\u0018`\u0007#¦Íå~¬\u008cÆÁ\u0010ugPaÞ\u008a\u001aûµ\u0001-4 \u0098\u0017ÛxqèUÊF¼éfKDDhÈ¢k\u0003`×$\u009eâú\u0097\u0080@ú\u001f:\u0018?´\u0081P\u0016û\fëÚ\u0082I\u009fÛ'!Å\\`\u0097\u009d\u0016I~\"\u0010Í±G§wz\u0080é{ò\u0016\u009fäc\u009aS\u0018\u0085\u0014\u009eÔn,/ý\u001e\u001b%!YFL\u009cuß\u0093(\u0010T³¬(i\u008c\u0082JUÌÅ°ñµ¸\u0087}ÎÄÒÍ\u00ad5îª\\\u008e\nPÎ'*\fd¯ÊË7¼\u0000\u0006ü=g\u0010 \u0019+Ý\u0089þ \u00177\u0001Y¼\u0000e\tf\u0018!é\u0018\u001dÔ£8\u001dE\u008a1¬µÌ?ô«àäÛ%\u0011Z¥\u0018âVW\u0006\u009eµõ\u0097ê+/b£\u007f¹\u009a$ú¾ày\u008a½T"
         .length();
      char var14 = 16;
      int var24 = -1;

      label61:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var39 = d(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var39;
                  if ((var24 += var14) >= var17) {
                     g = var18;
                     h = new String[51];
                     r = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[30];
                     int var3 = 0;
                     String var4 = "\u008a\u0090Ê®ñß¬\u0092³KO¡3Ro1~\u0010`!ãRZ\u008aé\u000e\u0003`·wm\u008a\u0016æaO¨uQ\u0010d+äÂRØLÆÈKé\"zMÒ_|Æ\t?G\u0096\u0001a\u000fE&KðÄõ\u0004ú_\u0007ÝäÂ\t»øã§Ttñ\u0018Ò¿\u001f \râ\u0002\u0006M\u0005QiÄ\u0099\u008e£K\u0093J\u0001Î\u00910Ñrå\u008eTiÍ»ÁMá³\u0087\u001e\"6\u0099Þ5\u0000\tCdºã¬\u009c\u000b\u001cß>#\u009eoö\u00927QO\u001fB9©\u0010±+e>\u0015è\u009fcÁ\"g\u0091\u001b\u0081å\u0092\bj¦B\\Ç\u009a\u0084¾A4Ôik\u009b\u0097Æ;Î\u001e@\u0099\u0095h\u00adeÛµÁ\u001b\u0096¡\rýp\u0097)½Õ\u0005)í¢\u0095\u001eáy¾EZ8¼ó_";
                     int var5 = "\u008a\u0090Ê®ñß¬\u0092³KO¡3Ro1~\u0010`!ãRZ\u008aé\u000e\u0003`·wm\u008a\u0016æaO¨uQ\u0010d+äÂRØLÆÈKé\"zMÒ_|Æ\t?G\u0096\u0001a\u000fE&KðÄõ\u0004ú_\u0007ÝäÂ\t»øã§Ttñ\u0018Ò¿\u001f \râ\u0002\u0006M\u0005QiÄ\u0099\u008e£K\u0093J\u0001Î\u00910Ñrå\u008eTiÍ»ÁMá³\u0087\u001e\"6\u0099Þ5\u0000\tCdºã¬\u009c\u000b\u001cß>#\u009eoö\u00927QO\u001fB9©\u0010±+e>\u0015è\u009fcÁ\"g\u0091\u001b\u0081å\u0092\bj¦B\\Ç\u009a\u0084¾A4Ôik\u009b\u0097Æ;Î\u001e@\u0099\u0095h\u00adeÛµÁ\u001b\u0096¡\rýp\u0097)½Õ\u0005)í¢\u0095\u001eáy¾EZ8¼ó_"
                        .length();
                     byte var2 = 0;

                     label43:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var43 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte var47 = -1;

                        while (true) {
                           long var8 = var43;
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
                           long var51 = (var10[0] & 255L) << 56
                              | (var10[1] & 255L) << 48
                              | (var10[2] & 255L) << 40
                              | (var10[3] & 255L) << 32
                              | (var10[4] & 255L) << 24
                              | (var10[5] & 255L) << 16
                              | (var10[6] & 255L) << 8
                              | var10[7] & 255L;
                           switch (var47) {
                              case 0:
                                 var28[var10001] = var51;
                                 if (var2 >= var5) {
                                    p = var6;
                                    q = new Integer[30];
                                    aud = !fhd.class.desiredAssertionStatus();
                                    short var29 = 19463;
                                    long var36 = 6976786972977168554L ^ var20;
                                    int[] var37 = new int[3];
                                    short var52 = 16115;
                                    long var10005 = 4628544389427520879L ^ var20;
                                    var37[0] = -937238807;
                                    short var53 = 6405;
                                    var10005 = 7674020367450981023L ^ var20;
                                    var37[1] = -1100908983;
                                    short var54 = 25355;
                                    var10005 = 888097967500605598L ^ var20;
                                    var37[2] = -1848398885;
                                    short var45 = 28535;
                                    long var49 = 8798339598275453905L ^ var20;
                                    int[] var50 = new int[2];
                                    short var10006 = 6405;
                                    long var10007 = 7674020367450981023L ^ var20;
                                    var50[0] = -1100908983;
                                    var10006 = 11534;
                                    var10007 = 3784556848917771928L ^ var20;
                                    var50[1] = -883759743;
                                    short var55 = 11003;
                                    var10005 = 8293008654303880813L ^ var20;
                                    int[] var59 = new int[2];
                                    short var10008 = 3610;
                                    long var10009 = 674659453891466628L ^ var20;
                                    var59[0] = -1766449491;
                                    var10008 = 729;
                                    var10009 = 9198844466602563935L ^ var20;
                                    var59[1] = -691204190;
                                    aac = Map.of("Fast", var37, "Normal", var50, "Slow", var59);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var51;
                                 if (var2 < var5) {
                                    continue label43;
                                 }

                                 var4 = "»\u0091Ô\u0090ß1.\u0011÷ñ\u0010Å\u0006\u0013ö\u0081";
                                 var5 = "»\u0091Ô\u0090ß1.\u0011÷ñ\u0010Å\u0006\u0013ö\u0081".length();
                                 var2 = 0;
                           }

                           byte var35 = var2;
                           var2 += 8;
                           var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var43 = (var7[0] & 255L) << 56
                              | (var7[1] & 255L) << 48
                              | (var7[2] & 255L) << 40
                              | (var7[3] & 255L) << 32
                              | (var7[4] & 255L) << 24
                              | (var7[5] & 255L) << 16
                              | (var7[6] & 255L) << 8
                              | var7[7] & 255L;
                           var47 = 0;
                        }
                     }
                  }

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var39;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label61;
                  }

                  var15 = "\u0099rS\u0088\bG;ö\u009fë ·+Ä¥NË\u0084¦\u0011\u0098ù\u008fN\rBn÷×ããã V\u00adI¢\u0017þ-0S\u0012\u0005Æ<ç^À}«È½¯VVe«á\u0084\u0002.5ü«";
                  var17 = "\u0099rS\u0088\bG;ö\u009fë ·+Ä¥NË\u0084¦\u0011\u0098ù\u008fN\rBn÷×ããã V\u00adI¢\u0017þ-0S\u0012\u0005Æ<ç^À}«È½¯VVe«á\u0084\u0002.5ü«"
                     .length();
                  var14 = ' ';
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6161;
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
            throw new RuntimeException("cc/astralis/fhd", var10);
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
         throw new RuntimeException("cc/astralis/fhd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3878;
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
            throw new RuntimeException("cc/astralis/fhd", var14);
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
         throw new RuntimeException("cc/astralis/fhd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
