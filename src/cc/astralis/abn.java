package cc.astralis;

import astralis.mixin.accessor.PlayerMoveC2SPacketAccessor;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1309;
import net.minecraft.class_2596;
import net.minecraft.class_2670;
import net.minecraft.class_2708;
import net.minecraft.class_2767;
import net.minecraft.class_2828;
import net.minecraft.class_2879;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3414;
import net.minecraft.class_634;
import net.minecraft.class_6373;
import net.minecraft.class_640;
import net.minecraft.class_7923;

public class abn extends hcr {
   private final gbp gal;
   private final gbp aya;
   private final gbp ezm;
   private final LinkedHashSet<g> hid;
   private boolean gin;
   long duw;
   boolean czn;
   boolean dqr;
   class_1309 ekv;
   boolean bwb;
   private static final long a = 79597484040760L;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;
   private static final long[] m;
   private static final Long[] n;
   private static final Map o;

   public abn(guu module) {
      long ax = abn.a ^ 97848180637607L;
      short var10002 = 5541;
      long var10003 = 8897950043542802859L ^ ax;
      super(a, "Cubecraft");
      short var4 = 30143;
      long var10004 = 888525420417888696L ^ ax;
      a.gal = new gbp("Ground Spoof Disabler", true);
      short var5 = 6509;
      var10004 = 8208933255032102253L ^ ax;
      a.aya = new gbp("Auto Resync", false);
      short var6 = 20538;
      var10004 = 2805582301933048881L ^ ax;
      a.ezm = new gbp("Warning", true);
      a.hid = new LinkedHashSet<>();
      a.gin = false;
      a.duw = 0L;
      a.czn = false;
      a.dqr = false;
      a.ekv = null;
      a.bwb = false;
      a.dxe(new ffn[]{a.ezm, a.gal, a.aya});
   }

   @Override
   public void cbw() {
      a.gyb(true);
      a.bwb = false;
      super.cbw();
   }

   @gdz
   public void bim(amo event) {
      long ax;
      int[] axx;
      ax = abn.a ^ 37414812104247L;
      axx = dar.abu();
      label217:
      if (a.aya.dnp()) {
         ekb axxx = dar.gqy().aws().diy(ekb.class);
         class_2596 var10000 = a.bed();
         if (axx != null) {
            label213:
            if (var10000 instanceof class_2879) {
               class_1309 var31 = axxx.gvw;
               if (axx != null) {
                  if (axxx.gvw == null) {
                     break label213;
                  }

                  a.duw = System.currentTimeMillis();
                  a.czn = true;
                  a.dqr = false;
                  a.ekv = axxx.gvw;
                  a.bwb = false;
                  var31 = a.ekv;
               }

               String var32 = var31.method_5477().getString();
               short var10001 = 12938;
               long var10002 = 6875682444515196697L ^ ax;
               bpa.bez("§ePlayer swung at: " + var32);
            }

            var10000 = a.bed();
         }

         class_2596 axxxx = var10000;
         var33 = axxxx instanceof class_2767;
         label188:
         if (axx != null) {
            label202: {
               label201:
               if (var33 != 0) {
                  class_2767 axxxxx = (class_2767)axxxx;
                  class_2960 axxxxxx = class_7923.field_41172.method_10221((class_3414)axxxxx.method_11894().comp_349());
                  class_2960 var34 = axxxxxx;
                  if (axx != null) {
                     if (axxxxxx == null) {
                        break label201;
                     }

                     var34 = axxxxxx;
                  }

                  String var35 = var34.method_12832();
                  short var44 = 21546;
                  long var50 = 6953607680746150323L ^ ax;
                  var33 = var35.contains("hurt");
                  if (axx == null) {
                     break label188;
                  }

                  if (var33 != 0) {
                     var33 = a.czn;
                     if (axx == null) {
                        break label188;
                     }

                     if (a.czn) {
                        var36 = a;
                        if (axx == null) {
                           break label202;
                        }

                        if (a.ekv != null) {
                           long axxxxxxx = System.currentTimeMillis() - a.duw;
                           double axxxxxxxx = axxxxx.method_11890();
                           double axxxxxxxxx = axxxxx.method_11889();
                           double axxxxxxxxxx = axxxxx.method_11893();
                           double axxxxxxxxxxx = a.ekv.method_23317() - axxxxxxxx;
                           double axxxxxxxxxxxx = a.ekv.method_23318() - axxxxxxxxx;
                           double axxxxxxxxxxxxx = a.ekv.method_23321() - axxxxxxxxxx;
                           double axxxxxxxxxxxxxx = axxxxxxxxxxx * axxxxxxxxxxx + axxxxxxxxxxxx * axxxxxxxxxxxx + axxxxxxxxxxxxx * axxxxxxxxxxxxx;
                           var44 = 31316;
                           var50 = 8388931969173227063L ^ ax;
                           long var56;
                           var33 = (var56 = axxxxxxx - 150L) == 0L ? 0 : (var56 < 0L ? -1 : 1);
                           if (axx == null) {
                              break label188;
                           }

                           if (var33 < 0) {
                              double var57;
                              var33 = (var57 = axxxxxxxxxxxxxx - dar.gqy().aws().diy(ekb.class).ejq.dnp().floatValue()) == 0.0 ? 0 : (var57 < 0.0 ? -1 : 1);
                              if (axx == null) {
                                 break label188;
                              }

                              if (var33 < 0) {
                                 String var37 = a.ekv.method_5477().getString();
                                 String var46 = String.valueOf(axxxxxx);
                                 short var52 = 23533;
                                 long var10003 = 7060350187886466687L ^ ax;
                                 short var55 = 1682;
                                 long var10004 = 1322399274753297162L ^ ax;
                                 bpa.bez("§aAttack confirmed on " + var37 + " via sound: " + var46);
                                 a.czn = false;
                                 a.ekv = null;
                                 a.dqr = false;
                                 a.bwb = false;
                              }
                           }
                        }
                     }
                  }
               }

               var36 = a;
            }

            var33 = var36.czn;
         }

         if (axx != null) {
            if (var33 == 0) {
               break label217;
            }

            var33 = a.dqr;
         }

         if (axx != null) {
            if (var33 != 0) {
               break label217;
            }

            long var38 = System.currentTimeMillis() - a.duw;
            short var47 = 28986;
            long var53 = 8102996102437178714L ^ ax;
            long var58;
            var33 = (var58 = var38 - 150L) == 0L ? 0 : (var58 < 0L ? -1 : 1);
         }

         label224: {
            if (axx != null) {
               if (var33 <= 0) {
                  break label217;
               }

               a.dqr = true;
               a.czn = false;
               var39 = a;
               if (axx == null) {
                  break label224;
               }

               var33 = a.bwb;
            }

            if (var33 == 0) {
               var39 = a;
               if (axx == null) {
                  break label224;
               }

               if (a.ekv != null) {
                  String var40 = a.ekv.method_5477().getString();
                  short var48 = 10259;
                  long var54 = 2780219387091297671L ^ ax;
                  bpa.bez("§cSwing missed or not confirmed on: " + var40);
                  a.bwb = true;
                  a.gyb(true);
               }
            }

            var39 = a;
         }

         var39.ekv = null;
      }

      class_2596 var29 = a.bed();
      short var41 = var29 instanceof class_2708;
      if (axx != null) {
         if (var41) {
            class_2708 var26 = (class_2708)var29;
            var41 = 15277;
            long var49 = 1091747651038787127L ^ ax;
            bpa.bez("Flag. Wait a bit before flying again.");
            ((eky)dar.gqy().aws().diy(eky.class)).fga(false);
            dar.gqy().aws().diy(bni.class).fga(false);
         }

         var41 = a.bed() instanceof class_2828;
      }

      label227: {
         label150:
         if (axx != null) {
            if (var41) {
               var41 = a.gal.dnp();
               if (axx == null) {
                  break label150;
               }

               if (var41) {
                  PlayerMoveC2SPacketAccessor axxxxxxxxxxxxxxx = (PlayerMoveC2SPacketAccessor)a.bed();
                  axxxxxxxxxxxxxxx.setY(axxxxxxxxxxxxxxx.getY() - axxxxxxxxxxxxxxx.getY() % 0.015625);
               }
            }

            var43 = a;
            if (axx == null) {
               break label227;
            }

            var41 = a.bed() instanceof class_6373;
         }

         if (!var41) {
            var43 = a;
            if (axx == null) {
               break label227;
            }

            if (!(a.bed() instanceof class_2670)) {
               return;
            }
         }

         var43 = a;
      }

      var43.gmm(true);
      synchronized (a.hid) {
         a.hid.add(new g(a.bed(), System.currentTimeMillis()));
      }
   }

   @gdz
   public void ayz(fxx event) {
      long ax = abn.a ^ 1424367683640L;
      int[] axx = dar.abu();
      class_310 var10000 = chi;
      if (axx != null) {
         if (chi.method_1496()) {
            a.clv().gxo();
            return;
         }

         var10000 = chi;
      }

      label105: {
         label109: {
            class_634 var8 = var10000.method_1562();
            if (axx != null) {
               if (var8 == null) {
                  break label109;
               }

               var8 = chi.method_1562();
            }

            class_640 axxx = var8.method_2871(chi.field_1724.method_5667());
            class_640 var9 = axxx;
            if (axx != null) {
               if (axxx == null) {
                  break label109;
               }

               var9 = axxx;
            }

            int var10 = var9.method_2959();
            if (axx != null) {
               short var10001 = 5111;
               long var10002 = 7585915597954177961L ^ ax;
               if (var10 > 500) {
                  var11 = a;
                  if (axx == null) {
                     break label105;
                  }

                  if (a.gin) {
                     break label109;
                  }

                  fnb var12 = fnb.hcp();
                  var10001 = 10841;
                  var10002 = 1991242256945256903L ^ ax;
                  fnb var13 = var12.ael("Done you can now fly etc", gge.INFO);
                  var10001 = 30831;
                  var10002 = 7444621738235637813L ^ ax;
                  var13.bvw(10000).evs();
                  a.gin = true;
                  if (axx != null) {
                     break label109;
                  }
               }

               var11 = a;
               if (axx == null) {
                  break label105;
               }

               var10 = a.ezm.dnp();
            }

            label85:
            if (var10 != 0) {
               label112: {
                  eky axxxx = dar.gqy().aws().diy(eky.class);
                  bni axxxxx = dar.gqy().aws().diy(bni.class);
                  boolean var14 = axxxx.dsv();
                  if (axx != null) {
                     if (var14) {
                        fnb var15 = fnb.hcp();
                        short var22 = 20683;
                        long var29 = 5394199463609099099L ^ ax;
                        fnb var16 = var15.ael("Wait until disabler is finished.", gge.WARNING);
                        var22 = 22363;
                        var29 = 8555087268228505348L ^ ax;
                        var16.bvw(1000).evs();
                        axxxx.fga(false);
                     }

                     var17 = axxxxx;
                     if (axx == null) {
                        break label112;
                     }

                     var14 = axxxxx.dsv();
                  }

                  if (!var14) {
                     break label85;
                  }

                  fnb var18 = fnb.hcp();
                  short var24 = 8;
                  long var31 = 6466724357448348562L ^ ax;
                  fnb var19 = var18.ael("Wait until disabler is finished.", gge.WARNING);
                  var24 = 9330;
                  var31 = 8549036661017766954L ^ ax;
                  var19.bvw(1000).evs();
                  var17 = axxxxx;
               }

               var17.fga(false);
            }
         }

         var11 = a;
      }

      int var26 = chi.field_1724.field_6012;
      if (axx != null) {
         short var33 = 2090;
         long var10003 = 2772350773071528051L ^ ax;
         var26 = chi.field_1724.field_6012 <= 50 ? 1 : 0;
      }

      var11.gyb((boolean)var26);
   }

   @gdz
   public void hd(dgk event) {
      long ax = abn.a ^ 123688039520398L;
      short var10000 = 7042;
      long var10001 = 8356834716622469293L ^ ax;
      bpa.bez("Please wait a moment before performing actions again.");
      a.gyb(true);
      a.gin = false;
      a.bwb = false;
   }

   private void gyb(boolean a) {
      synchronized (a.hid) {
         a.hid.removeIf(ax -> {
            long ax = abn.a ^ 52332178558044L;
            int[] var4 = dar.abu();
            int var10000 = a;
            if (var4 != null) {
               label33:
               if (!a) {
                  long var5 = ax.dgk();
                  long var10001 = System.currentTimeMillis();
                  short var10003 = 147;
                  long var10004 = 3087034597998988460L ^ ax;
                  long var7;
                  if (chi.field_1724.field_6012 < 150) {
                     short var10002 = 6096;
                     long var9 = 5978714267763544537L ^ ax;
                     var7 = 5000L;
                  } else {
                     short var8 = 17311;
                     long var10 = 9165369700015883669L ^ ax;
                     var7 = 10000L;
                  }

                  long var11;
                  var10000 = (var11 = var5 - (var10001 - var7)) == 0L ? 0 : (var11 < 0L ? -1 : 1);
                  if (var4 != null) {
                     if (var10000 <= 0) {
                        break label33;
                     }

                     var10000 = 0;
                  }

                  return (boolean)var10000;
               }

               gix.fcd(ax.gci());
               var10000 = 1;
            }

            return (boolean)var10000;
         });
      }
   }

   static {
      long var22 = a ^ 26159509031078L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var25 = 1; var25 < 8; var25++) {
         var10003[var25] = (byte)(var22 << var25 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[14];
      int var29 = 0;
      String var28 = "\rß8H=¡]\u0098®>\u0084 Ñv\u0013VÊ\u001e^\u0002Wq~\u008a%é\"\u0097\u008di\t-EÒâç#;X\u000e(qÆÚ%pT\u0087\u0002²4\u009a§¬\u0014åp\tUÅ+\u000bê\u0012ÏQZ\u008dW\u009b]\u0082)\u0086%\u0007ë\n\u001f¨\u0085\u0018}\u000f\u0093\u0089Âäd\u001e\u0001boÓ÷H\u0013õçFWï\u009e\u0014\u0099\u00078\u009fÃè\u0010\u0019\u00955\u000b´Ö\u0012ÚáN°Ç;n\u007fÿ\bà>Òu\u00185\u0088S--\u0087\u000b(Óßw\t´¹á\u0097È\u000b7P\u0088\u0005î¥n\u0082ÿó\u008c\u0007X\u0084\f\u0083î\u0098\u0095GÝÊûÒ»\u000e\u001fI;\u0086¶_\u0002\u008f\u009fRÂw \u001fÁÙ%Ð»·}üs`\u001c)Kîå*}y\u007f©9\u0090 \u0001ã;CÈ\u001d\u000b\t¢F\u001c\u0095ø³ð\"ô#Þ\u0094p;ª\u0086¤/FhÍµÉ½És³\u0087úM(Òcºÿk#i&x÷\u0016â5-mC\u001cÛ6gßÄÃ\u0094îg]í\u0098ú«ë\n\u009ad\u0090\u009c®·Å@ýÈ\u0089\u008fÜ\u0004´\b/þp\tv·W\u009bÙãy\u0001Ñ\u009b\u0011ÒüB'zýÄ¤kz\u0085³á÷\u0099\u0011óAÔÆzÌÑ³G3¡¬ó\u0007\u0083\u00881(û\u0096`lo\u001c\u0001@åÄÎ?¶¿\u000ek¤$§wãîc#!uõ3MÝx#jCâ\b6QA\u009bÍ\u001a\u0083ë\u0015\u001a4¶$ðàãú\u001c¿DU7¯Æ\u008eïü·Ä#±«\u0005^\u008bQH¹êlìá @\u0088ØbgDß:\u00807\u0014^Ø\u0086¤¶´ÅÐtåxZu\u0006Nåô\u0017Ðä%r±¥}s\u009blàÓJ:0\f°)ìÊmYÿÍ\u009e:\u0096\u0099à1£\u0017|Ó®\u008a¾\u0010\u009f\u0003½Ãq\\]Ä'Å\u0007\u0096\u001bµ\u001bò\u0018\u00ad.¥þM~\u0089Ã\u009dôX9 \"Âÿ\u0016*H¹\u0010ÿTî\u0010fA\u008f;6y\\c\u008a\u0011-{\u009e\u0094lE";
      int var30 = "\rß8H=¡]\u0098®>\u0084 Ñv\u0013VÊ\u001e^\u0002Wq~\u008a%é\"\u0097\u008di\t-EÒâç#;X\u000e(qÆÚ%pT\u0087\u0002²4\u009a§¬\u0014åp\tUÅ+\u000bê\u0012ÏQZ\u008dW\u009b]\u0082)\u0086%\u0007ë\n\u001f¨\u0085\u0018}\u000f\u0093\u0089Âäd\u001e\u0001boÓ÷H\u0013õçFWï\u009e\u0014\u0099\u00078\u009fÃè\u0010\u0019\u00955\u000b´Ö\u0012ÚáN°Ç;n\u007fÿ\bà>Òu\u00185\u0088S--\u0087\u000b(Óßw\t´¹á\u0097È\u000b7P\u0088\u0005î¥n\u0082ÿó\u008c\u0007X\u0084\f\u0083î\u0098\u0095GÝÊûÒ»\u000e\u001fI;\u0086¶_\u0002\u008f\u009fRÂw \u001fÁÙ%Ð»·}üs`\u001c)Kîå*}y\u007f©9\u0090 \u0001ã;CÈ\u001d\u000b\t¢F\u001c\u0095ø³ð\"ô#Þ\u0094p;ª\u0086¤/FhÍµÉ½És³\u0087úM(Òcºÿk#i&x÷\u0016â5-mC\u001cÛ6gßÄÃ\u0094îg]í\u0098ú«ë\n\u009ad\u0090\u009c®·Å@ýÈ\u0089\u008fÜ\u0004´\b/þp\tv·W\u009bÙãy\u0001Ñ\u009b\u0011ÒüB'zýÄ¤kz\u0085³á÷\u0099\u0011óAÔÆzÌÑ³G3¡¬ó\u0007\u0083\u00881(û\u0096`lo\u001c\u0001@åÄÎ?¶¿\u000ek¤$§wãîc#!uõ3MÝx#jCâ\b6QA\u009bÍ\u001a\u0083ë\u0015\u001a4¶$ðàãú\u001c¿DU7¯Æ\u008eïü·Ä#±«\u0005^\u008bQH¹êlìá @\u0088ØbgDß:\u00807\u0014^Ø\u0086¤¶´ÅÐtåxZu\u0006Nåô\u0017Ðä%r±¥}s\u009blàÓJ:0\f°)ìÊmYÿÍ\u009e:\u0096\u0099à1£\u0017|Ó®\u008a¾\u0010\u009f\u0003½Ãq\\]Ä'Å\u0007\u0096\u001bµ\u001bò\u0018\u00ad.¥þM~\u0089Ã\u009dôX9 \"Âÿ\u0016*H¹\u0010ÿTî\u0010fA\u008f;6y\\c\u008a\u0011-{\u009e\u0094lE"
         .length();
      char var27 = '(';
      int var36 = -1;

      label81:
      while (true) {
         String var37 = var28.substring(++var36, var36 + var27);
         int var10001 = -1;

         while (true) {
            byte[] var32 = var24.doFinal(var37.getBytes("ISO-8859-1"));
            String var53 = a(var32).intern();
            switch (var10001) {
               case 0:
                  var31[var29++] = var53;
                  if ((var36 += var27) >= var30) {
                     d = var31;
                     e = new String[14];
                     i = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var22 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[6];
                     int var14 = 0;
                     String var15 = "\u008f\u001fÚ/ÖuÀÍ¨{ò\u001bUé«¾^×l²W\u000e\u0014}f\u0014\u007f^z\u0085Y\u0014";
                     int var16 = "\u008f\u001fÚ/ÖuÀÍ¨{ò\u001bUé«¾^×l²W\u000e\u0014}f\u0014\u007f^z\u0085Y\u0014".length();
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
                                    g = var17;
                                    h = new Integer[6];
                                    o = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var22 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[4];
                                    int var3 = 0;
                                    String var4 = "§O\u008e\u0081JK^P\u0012eqÓuÒ7\u0090";
                                    int var5 = "§O\u008e\u0081JK^P\u0012eqÓuÒ7\u0090".length();
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
                                                   m = var6;
                                                   n = new Long[4];
                                                   return;
                                                }
                                                break;
                                             default:
                                                var42[var49] = var68;
                                                if (var2 < var5) {
                                                   continue label47;
                                                }

                                                var4 = "u\u0011+ë\u0099OAÿæ/Ç\u0092N\u0095P¡";
                                                var5 = "u\u0011+ë\u0099OAÿæ/Ç\u0092N\u0095P¡".length();
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

                                 var15 = "\u0003óvpgH@\u001569áC.S\u001e\u008e";
                                 var16 = "\u0003óvpgH@\u001569áC.S\u001e\u008e".length();
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

                  var28 = "Àç1²F|CmN\n\u009aÙÉ°`5[e´\b\n¿\u001aê@\u0080ÃÝ¾\u009aÂ¹)f(\u0019\u0013½Ho³\u009a¹\u0005ÿ\u0000vÁñsÙ³Ñ£Ú\u0016\u0002§bý\u0011¥Âg¨\u007f\u0090ï\u001a\u008a²A-ô\u0087N\n±Ï\u000e\u0088qd\u000bcßÈ«\u0010";
                  var30 = "Àç1²F|CmN\n\u009aÙÉ°`5[e´\b\n¿\u001aê@\u0080ÃÝ¾\u009aÂ¹)f(\u0019\u0013½Ho³\u009a¹\u0005ÿ\u0000vÁñsÙ³Ñ£Ú\u0016\u0002§bý\u0011¥Âg¨\u007f\u0090ï\u001a\u008a²A-ô\u0087N\n±Ï\u000e\u0088qd\u000bcßÈ«\u0010"
                     .length();
                  var27 = 24;
                  var36 = -1;
            }

            var37 = var28.substring(++var36, var36 + var27);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22941;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/abn", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("cc/astralis/abn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8794;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/abn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("cc/astralis/abn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10351;
      if (n[var3] == null) {
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
         long var5 = m[var3];
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
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/abn", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         n[var3] = var15;
      }

      return n[var3];
   }

   private static long d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = d(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/abn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
