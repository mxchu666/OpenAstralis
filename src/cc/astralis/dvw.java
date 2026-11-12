package cc.astralis;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2661;
import net.minecraft.class_2684;
import net.minecraft.class_2708;
import net.minecraft.class_2749;
import net.minecraft.class_2767;
import net.minecraft.class_2777;
import net.minecraft.class_2797;
import net.minecraft.class_3417;
import net.minecraft.class_4048;
import net.minecraft.class_4587;
import net.minecraft.class_7422;
import net.minecraft.class_7439;
import net.minecraft.class_7472;

public class dvw extends guu {
   private final bes dte;
   private final bes dtq;
   private final bes elu;
   private final bes gsk;
   private final bes bne;
   private final gbp evs;
   private final bes gvk;
   private final adu hba;
   private final bes gwc;
   private final ConcurrentLinkedQueue<arw> etp;
   private final ConcurrentLinkedQueue<class_2596<?>> awx;
   private class_1297 ctp;
   private class_7422 cd;
   private long aoz;
   private long blj;
   private long hhe;
   private boolean enf;
   private int exx;
   private final Random fhx;
   private static final long a = 139292788949018L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;

   public dvw() {
      long a = dvw.a ^ 47236581293266L;
      super(bfm.COMBAT);
      short var10003 = 30767;
      long var10004 = 6942780692385419415L ^ a;
      a.dte = new bes("Range", 3.0F, 1.0F, 10.0F, 0.1F);
      var10003 = 20489;
      var10004 = 3608312732076243130L ^ a;
      a.dtq = new bes("MS Min", 100.0F, 0.0F, 1000.0F, 1.0F);
      var10003 = 14482;
      var10004 = 5765494626885898274L ^ a;
      a.elu = new bes("MS Max", 150.0F, 0.0F, 1000.0F, 1.0F);
      var10003 = 9340;
      var10004 = 1082985510731123909L ^ a;
      a.gsk = new bes("Tracking Timing", 500.0F, 0.0F, 2000.0F, 1.0F);
      var10003 = 26401;
      var10004 = 5738668850338680733L ^ a;
      a.bne = new bes("Chance", 50.0F, 0.0F, 100.0F, 1.0F);
      var10003 = 7755;
      var10004 = 1808793310876022521L ^ a;
      a.evs = new gbp("Pause On HurtTime", false);
      var10003 = 9502;
      var10004 = 7331616505326046633L ^ a;
      a.gvk = (bes)new bes("Hurt Time", 3.0F, 0.0F, 10.0F, 1.0F).bih(a.evs::dnp);
      var10003 = 3374;
      var10004 = 915413963067631002L ^ a;
      short var22 = 24152;
      long var10005 = 234751330115909347L ^ a;
      String[] var27 = new String[2];
      short var10008 = 13131;
      long var10009 = 308655421078608893L ^ a;
      var27[0] = "Attack";
      var10008 = 2146;
      var10009 = 757076453640544471L ^ a;
      var27[1] = "Range";
      a.hba = new adu("Target Mode", "Attack", var27);
      var10003 = 31281;
      var10004 = 4891329552010072715L ^ a;
      a.gwc = new bes("Last Attack Time To Work", 1000.0F, 0.0F, 5000.0F, 1.0F);
      a.etp = new ConcurrentLinkedQueue<>();
      a.awx = new ConcurrentLinkedQueue<>();
      a.cd = null;
      a.enf = false;
      a.fhx = new Random();
      short var10001 = 27875;
      long var10002 = 6409084966218020448L ^ a;
      ffn[] var3 = new ffn[]{a.dte, a.dtq, a.elu, a.gsk, a.bne, a.evs, null, null, null};
      var10003 = 13522;
      var10004 = 1414130962133249616L ^ a;
      var3[6] = a.gvk;
      var10003 = 9874;
      var10004 = 7487265650974948373L ^ a;
      var3[7] = a.hba;
      var10003 = 10614;
      var10004 = 9079956307845510128L ^ a;
      var3[8] = a.gwc;
      a.bfi(var3);
   }

   @gdz
   public void axo(amo event) {
      long ax = dvw.a ^ 126046951648074L;
      int[] axx = dar.abu();
      amo var10000 = a;
      if (axx != null) {
         if (a.cud() != gpy.RECEIVE) {
            return;
         }

         var10000 = a;
      }

      if (axx != null) {
         if (var10000.fmc()) {
            return;
         }

         var10000 = a;
      }

      class_2596<?> axxx = var10000.bed();
      int var15 = axxx instanceof class_2797;
      if (axx != null) {
         if (var15 != 0) {
            return;
         }

         var15 = axxx instanceof class_7472;
      }

      if (axx != null) {
         if (var15 != 0) {
            return;
         }

         var15 = axxx instanceof class_7439;
      }

      if (axx != null) {
         if (var15 != 0) {
            return;
         }

         var15 = axxx instanceof class_2708;
      }

      label278: {
         if (axx != null) {
            if (var15 != 0) {
               break label278;
            }

            var15 = axxx instanceof class_2661;
         }

         if (axx != null) {
            if (var15 != 0) {
               break label278;
            }

            var15 = axxx instanceof class_2749;
         }

         label219: {
            label260: {
               label217:
               if (axx != null) {
                  if (var15 != 0) {
                     float var26;
                     var15 = (var26 = ((class_2749)axxx).method_11833() - 0.0F) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
                     if (axx == null) {
                        break label217;
                     }

                     if (var15 <= 0) {
                        bpa.dhu(b<"m">(12470, 8303960946543382431L ^ ax));
                        a.enu(true);
                        return;
                     }
                  }

                  var16 = axxx;
                  if (axx == null) {
                     break label260;
                  }

                  var15 = axxx instanceof class_2767;
               }

               if (var15 == 0) {
                  break label219;
               }

               var16 = axxx;
            }

            class_2767 axxxx = (class_2767)var16;
            if (axxxx.method_11894().comp_349() == class_3417.field_15115) {
               return;
            }
         }

         dvw var17 = a;
         if (axx != null) {
            label157:
            if (a.ctp != null) {
               label199: {
                  label198: {
                     class_2596 var18 = axxx;
                     if (axx != null) {
                        if (!(axxx instanceof class_2684)) {
                           break label198;
                        }

                        var18 = axxx;
                     }

                     if (((class_2684)var18).method_11645(chi.field_1687) == a.ctp) {
                        var19 = true;
                        break label199;
                     }
                  }

                  var19 = false;
               }

               boolean axxxx;
               label190: {
                  label263: {
                     axxxx = var19;
                     var20 = axxx instanceof class_2777;
                     if (axx != null) {
                        if (var20 == 0) {
                           break label263;
                        }

                        var20 = ((class_2777)axxx).comp_3237();
                     }

                     if (axx == null) {
                        break label190;
                     }

                     if (var20 == a.ctp.method_5628()) {
                        var20 = 1;
                        break label190;
                     }
                  }

                  var20 = 0;
               }

               label264: {
                  boolean axxxxx = (boolean)var20;
                  int var21 = axxxx;
                  if (axx != null) {
                     if (axxxx != 0) {
                        break label264;
                     }

                     var21 = axxxxx;
                  }

                  if (axx == null) {
                     return;
                  }

                  if (var21 == 0) {
                     break label157;
                  }
               }

               class_243 axxxxxx;
               label173: {
                  label265: {
                     axxxxxx = null;
                     boolean var22 = axxx instanceof class_2684;
                     if (axx != null) {
                        label169: {
                           if (var22) {
                              var23 = axxx;
                              if (axx == null) {
                                 break label169;
                              }

                              class_2684 axxxxxxx = (class_2684)var23;
                              if (a.cd != null) {
                                 axxxxxx = a.cd.method_43489(axxxxxxx.method_36150(), axxxxxxx.method_36151(), axxxxxxx.method_36152());
                                 break label173;
                              }
                           }

                           var23 = axxx;
                        }

                        if (axx == null) {
                           break label265;
                        }

                        var22 = var23 instanceof class_2777;
                     }

                     if (!var22) {
                        break label173;
                     }

                     var23 = axxx;
                  }

                  class_2777 axxxxxxx = (class_2777)var23;
                  axxxxxx = new class_243(
                     axxxxxxx.comp_3238().comp_3148().field_1352, axxxxxxx.comp_3238().comp_3148().field_1351, axxxxxxx.comp_3238().comp_3148().field_1350
                  );
               }

               if (axxxxxx != null) {
                  class_7422 var24 = a.cd;
                  if (axx != null) {
                     if (a.cd == null) {
                        a.cd = new class_7422();
                     }

                     var24 = a.cd;
                  }

                  var24.method_43494(axxxxxx);
                  double axxxxxxx = axxxxxx.method_1025(chi.field_1724.method_73189());
                  double axxxxxxxx = a.ctp.method_5858(chi.field_1724);
                  double var27;
                  int var25 = (var27 = axxxxxxx - axxxxxxxx) == 0.0 ? 0 : (var27 < 0.0 ? -1 : 1);
                  if (axx == null) {
                     return;
                  }

                  if (var25 < 0) {
                     a.enu();
                     return;
                  }
               }
            }

            a.gmm(true);
            var17 = a;
         }

         var17.etp.add(new arw(axxx, System.currentTimeMillis()));
         return;
      }

      a.enu(true);
   }

   @gdz
   public void bog(eov event) {
      long ax = dvw.a ^ 41560172006113L;
      int[] var10000 = dar.abu();
      class_1297 axx = a.hfw();
      int[] axxx = var10000;
      if (axxx != null) {
         if (axx == null) {
            return;
         }

         a.hhe = System.currentTimeMillis();
         short var10002 = 699;
         long var10003 = 559259110792310285L ^ ax;
         a.exx = a.fhx.nextInt(101);
      }

      dvw var6 = a;
      if (axxx != null) {
         short var10001 = 13131;
         long var7 = 308671681357704654L ^ ax;
         if (!a.hba.emb("Attack")) {
            return;
         }

         var6 = a;
      }

      var6.fix(axx);
   }

   @gdz
   public void cop(fnt event) {
      long ax = dvw.a ^ 103292497763050L;
      int[] axx = dar.abu();
      if (axx != null) {
         if (a.cud() == gpy.POST) {
            return;
         }

         short var10002 = 22066;
         long var10003 = 4661494798838896823L ^ ax;
         a.efe(a.aoz + "ms");
      }

      label71: {
         dvw var6;
         label75: {
            short var10001 = 2146;
            long var8 = 757125915708245743L ^ ax;
            boolean var10000 = a.hba.emb("Range");
            if (axx != null) {
               label60:
               if (var10000) {
                  label65: {
                     class_1309 axxx = bav.elv(false, false, false, true, false, a.dte.dnp().floatValue()).getFirst();
                     if (axx != null) {
                        if (axxx == null) {
                           break label65;
                        }

                        a.fix(axxx);
                     }

                     if (axx != null) {
                        break label60;
                     }
                  }

                  a.fbf();
               }

               var6 = a;
               if (axx == null) {
                  break label75;
               }

               var10000 = a.eiu();
            }

            if (var10000) {
               a.buu(false);
               if (axx != null) {
                  break label71;
               }
            }

            var6 = a;
         }

         var6.fbf();
      }

      a.awx.removeIf(axxxx -> {
         gix.fdw((class_2596<?>)axxxx);
         return true;
      });
      dvw var7 = a;
      if (axx != null) {
         if (!a.cz()) {
            return;
         }

         var7 = a;
      }

      var7.aoz = a.fe();
   }

   @gdz
   public void cpc(bsm event) {
      long ax = dvw.a ^ 126319906456998L;
      int[] axx = dar.abu();
      dvw var10000 = a;
      if (axx != null) {
         if (a.cd == null) {
            return;
         }

         var10000 = a;
      }

      class_1297 var10 = var10000.ctp;
      if (axx != null) {
         if (var10000.ctp == null) {
            return;
         }

         var10 = a.ctp;
      }

      class_4048 axxx = var10.method_18377(a.ctp.method_18376());
      double axxxx = axxx.comp_2185() / 2.0;
      class_238 axxxxx = new class_238(-axxxx, 0.0, -axxxx, axxxx, axxx.comp_2186(), axxxx).method_1014(0.05);
      class_243 axxxxxx = a.cd.method_60933();
      if (axxxxxx != null) {
         class_4587 var11 = a.bus();
         class_238 var10001 = axxxxx.method_997(axxxxxx);
         Color var10002 = dar.gqy().deo();
         short var10003 = 17081;
         long var10004 = 9034094441510854985L ^ ax;
         bqf.hjf(var11, var10001, var10002, 200);
      }
   }

   @gdz
   public void cxs(dgk event) {
      a.enu(true);
   }

   private void fix(class_1297 a) {
      int var6;
      label49: {
         label52: {
            long ax = dvw.a ^ 120450238580846L;
            int[] axx = dar.abu();
            class_1297 var10001 = a;
            if (axx != null) {
               if (!(a instanceof class_1309)) {
                  break label52;
               }

               var10001 = a;
            }

            class_1309 axxx = (class_1309)var10001;
            var6 = a.evs.dnp();
            if (axx != null) {
               if (var6 == 0) {
                  break label52;
               }

               var6 = axxx.field_6235;
            }

            if (axx == null) {
               break label49;
            }

            if (var6 >= a.gvk.dnp().intValue()) {
               var6 = 1;
               break label49;
            }
         }

         var6 = 0;
      }

      a.enf = (boolean)var6;
      if (a.eaa(a)) {
         if (a != a.ctp) {
            a.enu(false);
            a.cd = new class_7422();
            a.cd.method_43494(a.method_73189());
         }

         a.ctp = a;
      }
   }

   private boolean eaa(class_1297 a) {
      long ax = dvw.a ^ 124871073660751L;
      int[] var10000 = dar.abu();
      double axx = chi.field_1724.method_5739(a);
      int[] axxx = var10000;
      double var18;
      int var12 = (var18 = axx - a.dte.dnp().floatValue()) == 0.0 ? 0 : (var18 < 0.0 ? -1 : 1);
      if (axxx != null) {
         var12 = var12 <= 0 ? 1 : 0;
      }

      boolean axxxx = (boolean)var12;
      int var13 = axxxx;
      if (axxx != null) {
         if (axxxx != 0) {
            a.blj = System.currentTimeMillis();
         }

         long var19;
         var13 = (var19 = System.currentTimeMillis() - a.blj - a.gsk.dnp().longValue()) == 0L ? 0 : (var19 < 0L ? -1 : 1);
      }

      if (axxx != null) {
         var13 = var13 <= 0 ? 1 : 0;
      }

      boolean axxxxx = (boolean)var13;
      int var14 = a.exx;
      if (axxx != null) {
         var14 = a.exx < a.bne.dnp().intValue() ? 1 : 0;
      }

      boolean axxxxxx = (boolean)var14;
      boolean var15 = a.enf;
      if (axxx != null) {
         var15 = !a.enf;
      }

      boolean axxxxxxx = var15;
      long var20;
      int var16 = (var20 = System.currentTimeMillis() - a.hhe - a.gwc.dnp().longValue()) == 0L ? 0 : (var20 < 0L ? -1 : 1);
      if (axxx != null) {
         var16 = var16 <= 0 ? 1 : 0;
      }

      boolean axxxxxxxx;
      axxxxxxxx = (boolean)var16;
      var17 = axxxx;
      label130:
      if (axxx != null) {
         if (axxxx == 0) {
            var17 = axxxxx;
            if (axxx == null) {
               break label130;
            }

            if (axxxxx == 0) {
               return (boolean)0;
            }
         }

         var17 = a.method_5805();
      }

      if (axxx != null) {
         if (var17 == 0) {
            return (boolean)0;
         }

         var17 = chi.field_1724.field_6012;
      }

      if (axxx != null) {
         if (var17 <= e<"l">(20204, 2481927845789669360L ^ ax)) {
            return (boolean)0;
         }

         var17 = axxxxxx;
      }

      if (axxx != null) {
         if (var17 == 0) {
            return (boolean)0;
         }

         var17 = axxxxxxx;
      }

      if (axxx != null) {
         if (var17 == 0) {
            return (boolean)0;
         }

         var17 = axxxxxxxx;
      }

      if (axxx == null) {
         return (boolean)var17;
      } else {
         return (boolean)(var17 != 0 ? 1 : 0);
      }
   }

   private void buu(boolean a) {
      long ax = System.currentTimeMillis();
      a.etp.removeIf(axx -> {
         long ax = dvw.a ^ 1233213960469L;
         int[] var7 = dar.abu();
         int var10000 = a;
         if (var7 != null) {
            label27:
            if (!a) {
               long var9;
               var10000 = (var9 = axx.bqk() - (a - a.aoz)) == 0L ? 0 : (var9 < 0L ? -1 : 1);
               if (var7 != null) {
                  if (var10000 <= 0) {
                     break label27;
                  }

                  var10000 = 0;
               }

               return (boolean)var10000;
            }

            gix.fdw(axx.aew());
            var10000 = 1;
         }

         return (boolean)var10000;
      });
   }

   private void enu(boolean a) {
      label21: {
         label20: {
            long ax = dvw.a ^ 97067212687722L;
            int[] var4 = dar.abu();
            if (var4 != null) {
               if (!a) {
                  break label20;
               }

               a.enu();
            }

            if (var4 != null) {
               break label21;
            }
         }

         a.etp.clear();
      }

      a.awx.clear();
      a.ctp = null;
      a.cd = null;
      a.enf = false;
   }

   public void enu() {
      long a = dvw.a ^ 83900531160300L;
      int[] ax = dar.abu();

      while (!a.etp.isEmpty()) {
         label21: {
            arw axx = a.etp.poll();
            arw var10000 = axx;
            if (ax != null) {
               if (axx == null) {
                  break label21;
               }

               var10000 = axx;
            }

            gix.fdw(var10000.aew());
         }

         if (ax == null) {
            break;
         }
      }
   }

   private void fbf() {
      a.enu(true);
   }

   private boolean eiu() {
      long a = dvw.a ^ 107710744394892L;
      int[] var3 = dar.abu();
      class_1297 var10000 = a.ctp;
      if (var3 != null) {
         if (a.ctp == null) {
            return false;
         }

         var10000 = a.ctp;
      }

      boolean var4 = var10000.method_5805();
      if (var3 != null) {
         if (!var4) {
            return false;
         }

         var4 = a.eaa(a.ctp);
      }

      return var3 == null ? var4 : var4;
   }

   private boolean cz() {
      long a = dvw.a ^ 112732134929684L;
      int[] var3 = dar.abu();
      boolean var10000 = a.etp.isEmpty();
      if (var3 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = a.awx.isEmpty();
      }

      return var3 == null ? var10000 : var10000;
   }

   private long fe() {
      int a = a.dtq.dnp().intValue();
      int ax = a.elu.dnp().intValue();
      return a + a.fhx.nextInt(ax - a + 1);
   }

   @Override
   public void auj() {
      long a = dvw.a ^ 129474306589149L;
      a.aoz = a.fe();
      short var10002 = 18899;
      long var10003 = 1542669927549972060L ^ a;
      a.exx = a.fhx.nextInt(101);
      a.enu(false);
      super.auj();
   }

   @Override
   public void frg() {
      a.enu();
      a.awx.clear();
      a.ctp = null;
      a.cd = null;
      a.enf = false;
      super.frg();
   }

   static {
      long var11 = a ^ 135122448242936L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[14];
      int var18 = 0;
      String var17 = "\u0088säê\u0000\u001ff-\u0010Z\u000e°ýp2\u0099\u00107\u0016¯bâ(\u007f-ÂP\u0090V¹¥\f÷\u0010\u0092\u0093\u0011½\u000b\u0092\u0093r\u001emß°lcã7(\u0000û?\u00976ìdjÝ\u0000Ä\u000eñÀ³à\bMU{Vv\u008b\u0006ç\u008füÅÛòîf\u0084\u0099&ÛYM\u0016\u008e\u0010ñ[Á\u0015LP\u009bP<\u0004\u0010òjkÞt G\u009b¯P5L\u008a_\u0084\u0087³pÑ!\u008f\u0081Ø\u0001\"x\u0013O\u008a`ÄÛ#\fÍY\u001d¸ %;K\u0017\nA*<\u0088\u0005¥dKö\u0013ï¾~ä\u0001Ö\u0090Î\u001e¢\u0080\u009cw\u001cÝ\u0092w\u0010êÅ\u0015_ÝvÄG\u001b¿¦\u00ad\u0010Øü³ \u0084×ÞÇZ\u0099\u000bpCS\u0086?Z\u008f\\©Ë\u0081õ!J´Wny@\u0088øÇ\u0018\u0017/\u0010æ@Ë-\u0090º8\u0090\u0005¿±~¨¼º*\u0010XJ|\u009c\u0093¸fØm#\u0014Oî\u001aGN07F`¾\u0005SXç§\u0091½\u008fÑ?qåbú\u001cu\u0019¼(_7)N:©\u007f\u0006½?Ã{¢PÀ,º²ÎÁÌT\u0083\u0004ï";
      int var19 = "\u0088säê\u0000\u001ff-\u0010Z\u000e°ýp2\u0099\u00107\u0016¯bâ(\u007f-ÂP\u0090V¹¥\f÷\u0010\u0092\u0093\u0011½\u000b\u0092\u0093r\u001emß°lcã7(\u0000û?\u00976ìdjÝ\u0000Ä\u000eñÀ³à\bMU{Vv\u008b\u0006ç\u008füÅÛòîf\u0084\u0099&ÛYM\u0016\u008e\u0010ñ[Á\u0015LP\u009bP<\u0004\u0010òjkÞt G\u009b¯P5L\u008a_\u0084\u0087³pÑ!\u008f\u0081Ø\u0001\"x\u0013O\u008a`ÄÛ#\fÍY\u001d¸ %;K\u0017\nA*<\u0088\u0005¥dKö\u0013ï¾~ä\u0001Ö\u0090Î\u001e¢\u0080\u009cw\u001cÝ\u0092w\u0010êÅ\u0015_ÝvÄG\u001b¿¦\u00ad\u0010Øü³ \u0084×ÞÇZ\u0099\u000bpCS\u0086?Z\u008f\\©Ë\u0081õ!J´Wny@\u0088øÇ\u0018\u0017/\u0010æ@Ë-\u0090º8\u0090\u0005¿±~¨¼º*\u0010XJ|\u009c\u0093¸fØm#\u0014Oî\u001aGN07F`¾\u0005SXç§\u0091½\u008fÑ?qåbú\u001cu\u0019¼(_7)N:©\u007f\u0006½?Ã{¢PÀ,º²ÎÁÌT\u0083\u0004ï"
         .length();
      char var16 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = d(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     g = var20;
                     h = new String[14];
                     r = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = "11þ+.2ÚNf?\u0091y@\u0099Âç\u0007\b¶ûjØ.Â\u0088T\u0013àÐ_j\u00adq0={1Ú>üéXcK4Â11";
                     int var5 = "11þ+.2ÚNf?\u0091y@\u0099Âç\u0007\b¶ûjØ.Â\u0088T\u0013àÐ_j\u00adq0={1Ú>üéXcK4Â11".length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var40 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte var43 = -1;

                        while (true) {
                           long var8 = var40;
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
                           long var45 = (var10[0] & 255L) << 56
                              | (var10[1] & 255L) << 48
                              | (var10[2] & 255L) << 40
                              | (var10[3] & 255L) << 32
                              | (var10[4] & 255L) << 24
                              | (var10[5] & 255L) << 16
                              | (var10[6] & 255L) << 8
                              | var10[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var2 >= var5) {
                                    p = var6;
                                    q = new Integer[8];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u007f*÷\u001eßßÍÍwAÑR ¬Í;";
                                 var5 = "\u007f*÷\u001eßßÍÍwAÑR ¬Í;".length();
                                 var2 = 0;
                           }

                           byte var34 = var2;
                           var2 += 8;
                           var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var40 = (var7[0] & 255L) << 56
                              | (var7[1] & 255L) << 48
                              | (var7[2] & 255L) << 40
                              | (var7[3] & 255L) << 32
                              | (var7[4] & 255L) << 24
                              | (var7[5] & 255L) << 16
                              | (var7[6] & 255L) << 8
                              | var7[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var16 = var17.charAt(var24);
                  break;
               default:
                  var20[var18++] = var36;
                  if ((var24 += var16) < var19) {
                     var16 = var17.charAt(var24);
                     continue label54;
                  }

                  var17 = "¢¢¶$# ·\u0081+\fß!\u0087®yæ\u0010¥Ê\u008d\u000fùÞ\u008eý^Ô\u009a\u000fS\u008a\u0011Ø";
                  var19 = "¢¢¶$# ·\u0081+\fß!\u0087®yæ\u0010¥Ê\u008d\u000fùÞ\u008eý^Ô\u009a\u000fS\u008a\u0011Ø".length();
                  var16 = 16;
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21625;
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
            throw new RuntimeException("cc/astralis/dvw", var10);
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
         throw new RuntimeException("cc/astralis/dvw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9802;
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
            throw new RuntimeException("cc/astralis/dvw", var14);
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
         throw new RuntimeException("cc/astralis/dvw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
