package cc.astralis;

import java.awt.Color;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import org.joml.Vector4d;

public class ESP extends guu {
   private final gbp gsw;
   private final gbp ciu;
   private final acn gtt;
   private final acn for;
   private final acn gr;
   private final acn cus;
   private final acn hhu;
   private final acn gaq;
   private final acn fvg;
   private final acn dzb;
   private final gbp gmw;
   private final epo bwb;
   private final bes dhj;
   private final gbp baz;
   private final acn evq;
   private final acn fjt;
   private final gbp gqe;
   private final gbp drb;
   private final acn ba;
   private final acn abb;
   private final cbm gcl;
   private static String gpx;
   private final Map<String, chz> ffi;
   private String[] goo;
   private int ccz;
   private static final long a = 41318179238646L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;

   public ESP() {
      long a = ESP.a ^ 122964343070660L;
      super(bfm.VISUAL);
      short var10003 = 4452;
      long var10004 = 3796301793573970541L ^ a;
      a.gsw = new gbp("Main Box", true);
      var10003 = 9679;
      var10004 = 4174705373063288530L ^ a;
      a.ciu = new gbp("Main box Shadow", true);
      var10003 = 1003;
      var10004 = 2040787523849171187L ^ a;
      a.gtt = new acn("Left Box Top Color", Color.white);
      var10003 = 24145;
      var10004 = 2859762151053684050L ^ a;
      a.for = new acn("Left Box Bottom Color", Color.white);
      var10003 = 8460;
      var10004 = 6801781477025583620L ^ a;
      a.gr = new acn("Right Box Top Color", Color.white);
      var10003 = 7815;
      var10004 = 1765890592348024205L ^ a;
      a.cus = new acn("Right Box Bottom Color", Color.white);
      var10003 = 27794;
      var10004 = 1732930245600436118L ^ a;
      a.hhu = new acn("Top Box Left Color", Color.white);
      var10003 = 31450;
      var10004 = 5419685090452720090L ^ a;
      a.gaq = new acn("Top Box Right Color", Color.white);
      var10003 = 18837;
      var10004 = 2695495677469227673L ^ a;
      a.fvg = new acn("Bottom Box Left Color", Color.white);
      var10003 = 25120;
      var10004 = 5390187491479736614L ^ a;
      a.dzb = new acn("Bottom Box Right Color", Color.white);
      var10003 = 28744;
      var10004 = 8550975763771441993L ^ a;
      a.gmw = new gbp("Fill Image", false);
      var10003 = 30803;
      var10004 = 7368985817083366237L ^ a;
      short var48 = 1816;
      long var10005 = 668105688258229251L ^ a;
      a.bwb = new epo("Fill Image Path", "astralis/dancing-random.gif");
      var10003 = 27822;
      var10004 = 7016866415799525281L ^ a;
      a.dhj = new bes("Speed", 100.0F, 1.0F, 300.0F, 1.0F);
      var10003 = 9116;
      var10004 = 5700136400077295750L ^ a;
      a.baz = new gbp("Fill", true);
      var10003 = 7462;
      var10004 = 8897980371219918379L ^ a;
      short var10009 = 11490;
      long var10010 = 4467296228749565259L ^ a;
      a.evq = new acn("Fill In Color", new Color(0, 0, 0, 100));
      var10003 = 24972;
      var10004 = 2657969227655107211L ^ a;
      var10009 = 25366;
      var10010 = 1600775416845406900L ^ a;
      a.fjt = new acn("Fill In Bottom Color", new Color(0, 0, 0, 100));
      var10003 = 10833;
      var10004 = 186931532111485274L ^ a;
      a.gqe = new gbp("Health Bar", true);
      var10003 = 26761;
      var10004 = 5038353603568360336L ^ a;
      a.drb = new gbp("Health Bar Shadow", false);
      var10003 = 8378;
      var10004 = 9103492480154211256L ^ a;
      a.ba = new acn("Top Health Bar Color", Color.red);
      var10003 = 24890;
      var10004 = 5474440082249208383L ^ a;
      a.abb = new acn("Bottom Health Bar Color", Color.white);
      a.gcl = new cbm();
      a.ffi = new HashMap<>();
      a.goo = null;
      a.ccz = 0;
      short var10001 = 20400;
      long var10002 = 6546780238898249240L ^ a;
      ffn[] var3 = new ffn[]{
         a.gsw,
         a.ciu.bih(a.gsw::dnp),
         a.gtt.bih(a.gsw::dnp),
         a.for.bih(a.gsw::dnp),
         a.gr.bih(a.gsw::dnp),
         a.cus.bih(a.gsw::dnp),
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
      var10003 = 27055;
      var10004 = 1189271623001675777L ^ a;
      var3[6] = a.hhu.bih(a.gsw::dnp);
      var10003 = 2119;
      var10004 = 4661292237662419453L ^ a;
      var3[7] = a.gaq.bih(a.gsw::dnp);
      var10003 = 1266;
      var10004 = 5392591739691595103L ^ a;
      var3[8] = a.fvg.bih(a.gsw::dnp);
      var10003 = 19066;
      var10004 = 7958010302297127897L ^ a;
      var3[9] = a.dzb.bih(a.gsw::dnp);
      var10003 = 14640;
      var10004 = 1396500468025149590L ^ a;
      var3[10] = a.baz;
      var10003 = 29058;
      var10004 = 1738967643630370875L ^ a;
      var3[11] = a.evq.bih(a.baz::dnp);
      var10003 = 26504;
      var10004 = 5045413594962138669L ^ a;
      var3[12] = a.fjt.bih(a.baz::dnp);
      var10003 = 11046;
      var10004 = 598114507694725790L ^ a;
      var3[13] = a.gmw;
      var10003 = 3553;
      var10004 = 2046679951244131402L ^ a;
      var3[14] = a.bwb.bih(a.gmw::dnp);
      var10003 = 15986;
      var10004 = 1062623949922455517L ^ a;
      var3[15] = a.dhj.bih(a.gmw::dnp);
      var10003 = 8458;
      var10004 = 7346505838881820843L ^ a;
      var3[16] = a.gqe;
      var10003 = 16520;
      var10004 = 6861479632535466274L ^ a;
      var3[17] = a.drb.bih(a.gqe::dnp);
      var10003 = 4133;
      var10004 = 9188877671246324105L ^ a;
      var3[18] = a.ba.bih(a.gqe::dnp);
      var10003 = 11954;
      var10004 = 7364300216477048598L ^ a;
      var3[19] = a.abb.bih(a.gqe::dnp);
      a.bfi(var3);
   }

   @gdz(0)
   private void awu(ctt a) {
      long ax = ESP.a ^ 110635434909912L;
      int[] axx = dar.abu();
      class_310 var10000 = chi;
      if (axx != null) {
         if (chi.method_1561().field_4686 == null) {
            return;
         }

         var10000 = chi;
      }

      if (var10000.field_1687 != null) {
         var10000 = chi;
         if (axx != null) {
            if (chi.field_1724 == null) {
               return;
            }

            var10000 = chi;
         }

         Iterator var5 = var10000.field_1687.method_18112().iterator();

         label291:
         while (true) {
            int var35 = var5.hasNext();

            class_1297 axxx;
            Vector4d axxxx;
            label288:
            while (true) {
               if (var35 == 0) {
                  return;
               }

               label309: {
                  axxx = (class_1297)var5.next();
                  boolean var36 = axxx instanceof class_1309;
                  if (axx != null) {
                     if (!var36) {
                        continue label291;
                     }

                     var37 = axxx;
                     if (axx == null) {
                        break label309;
                     }

                     var36 = axxx instanceof class_1657;
                  }

                  if (!var36) {
                     continue label291;
                  }

                  var37 = axxx;
               }

               label264: {
                  if (axx != null) {
                     if (var37 == chi.field_1724) {
                        var38 = chi.field_1690.method_31044().method_31034();
                        if (axx == null) {
                           break label264;
                        }

                        if (var38 != 0) {
                           continue label291;
                        }
                     }

                     var37 = axxx;
                  }

                  var38 = var37 instanceof class_1657;
               }

               label311: {
                  label274:
                  if (axx != null) {
                     if (var38 != 0) {
                        class_1657 axxxxx = (class_1657)axxx;
                        var38 = axxxxx.method_5628();
                        if (axx == null) {
                           break label274;
                        }

                        if (var38 == chi.field_1724.method_5628()) {
                           continue label291;
                        }
                     }

                     var39 = (class_1657)axxx;
                     if (axx == null) {
                        break label311;
                     }

                     var38 = AntiBot.cnv((class_1657)var39);
                  }

                  if (var38 != 0) {
                     return;
                  }

                  var39 = axxx;
               }

               class_238 var25 = var39.method_5829();
               short var40 = 1669;
               double axxxxxx = axxx.field_6014 + (axxx.method_23317() - axxx.field_6014) * chi.method_61966().method_60637(false);
               long var10001 = 43838452914636857L ^ ax;
               double axxxxxxx = axxx.field_6036 + (axxx.method_23318() - axxx.field_6036) * chi.method_61966().method_60637(false);
               double axxxxxxxx = axxx.field_5969 + (axxx.method_23321() - axxx.field_5969) * chi.method_61966().method_60637(false);
               class_238 axxxxxxxxx = new class_238(
                  var25.field_1323 - axxx.method_23317() + axxxxxx - 0.1,
                  var25.field_1322 - axxx.method_23318() + axxxxxxx,
                  var25.field_1321 - axxx.method_23321() + axxxxxxxx - 0.1,
                  var25.field_1320 - axxx.method_23317() + axxxxxx + 0.1,
                  var25.field_1325 - axxx.method_23318() + axxxxxxx + 0.12,
                  var25.field_1324 - axxx.method_23321() + axxxxxxxx + 0.1
               );
               class_243[] var41 = new class_243[]{
                  new class_243(axxxxxxxxx.field_1323, axxxxxxxxx.field_1322, axxxxxxxxx.field_1321),
                  new class_243(axxxxxxxxx.field_1323, axxxxxxxxx.field_1325, axxxxxxxxx.field_1321),
                  new class_243(axxxxxxxxx.field_1320, axxxxxxxxx.field_1322, axxxxxxxxx.field_1321),
                  new class_243(axxxxxxxxx.field_1320, axxxxxxxxx.field_1325, axxxxxxxxx.field_1321),
                  new class_243(axxxxxxxxx.field_1323, axxxxxxxxx.field_1322, axxxxxxxxx.field_1324),
                  new class_243(axxxxxxxxx.field_1323, axxxxxxxxx.field_1325, axxxxxxxxx.field_1324),
                  null,
                  null
               };
               short var10002 = 793;
               long var10003 = 7253201396078628258L ^ ax;
               var41[6] = new class_243(axxxxxxxxx.field_1320, axxxxxxxxx.field_1322, axxxxxxxxx.field_1324);
               var10002 = 24016;
               var10003 = 6537317155599553399L ^ ax;
               var41[7] = new class_243(axxxxxxxxx.field_1320, axxxxxxxxx.field_1325, axxxxxxxxx.field_1324);
               class_243[] axxxxxxxxxx = var41;
               axxxx = null;
               class_243[] axxxxxxxxxxx = axxxxxxxxxx;
               int axxxxxxxxxxxx = axxxxxxxxxx.length;
               int axxxxxxxxxxxxx = 0;

               while (true) {
                  if (axxxxxxxxxxxxx >= axxxxxxxxxxxx) {
                     break label288;
                  }

                  class_243 axxxxxxxxxxxxxx = axxxxxxxxxxx[axxxxxxxxxxxxx];
                  class_243 axxxxxxxxxxxxxxx = guf.at(axxxxxxxxxxxxxx);
                  if (axx != null) {
                     double var51;
                     var35 = (var51 = axxxxxxxxxxxxxxx.field_1350 - 0.0) == 0.0 ? 0 : (var51 < 0.0 ? -1 : 1);
                     if (axx == null) {
                        break;
                     }

                     if (var35 > 0 && axxxxxxxxxxxxxxx.field_1350 < 1.0) {
                        Vector4d var42 = axxxx;
                        if (axx != null) {
                           if (axxxx == null) {
                              axxxx = new Vector4d(axxxxxxxxxxxxxxx.field_1352, axxxxxxxxxxxxxxx.field_1351, axxxxxxxxxxxxxxx.field_1350, 0.0);
                           }

                           axxxx.x = Math.min(axxxxxxxxxxxxxxx.field_1352, axxxx.x);
                           axxxx.y = Math.min(axxxxxxxxxxxxxxx.field_1351, axxxx.y);
                           axxxx.z = Math.max(axxxxxxxxxxxxxxx.field_1352, axxxx.z);
                           var42 = axxxx;
                        }

                        var42.w = Math.max(axxxxxxxxxxxxxxx.field_1351, axxxx.w);
                     }

                     axxxxxxxxxxxxx++;
                  }

                  if (axx == null) {
                     break label288;
                  }
               }
            }

            label324: {
               Vector4d var43 = axxxx;
               if (axx != null) {
                  if (axxxx == null) {
                     break label324;
                  }

                  var43 = axxxx;
               }

               float axxxxxx = (float)var43.x;
               float axxxxxxx = (float)axxxx.y;
               float axxxxxxxx = (float)axxxx.z;
               float axxxxxxxxx = (float)axxxx.w;
               boolean var44 = a.baz.dnp();
               if (axx != null) {
                  if (var44) {
                     dmp.dxg(axxxxxx, axxxxxxx, axxxxxxxx, axxxxxxxxx, a.evq.dnp(), a.fjt.dnp());
                  }

                  var44 = a.gmw.dnp();
               }

               label213:
               if (axx != null) {
                  label240: {
                     if (var44) {
                        var10000 = a.bwb.dnp();
                        if (axx == null) {
                           break label240;
                        }

                        if (var10000 != null) {
                           var44 = a.bwb.dnp().isEmpty();
                           if (axx == null) {
                              break label213;
                           }

                           if (!var44) {
                              try {
                                 String[] axxxxxxxxxx = hee.asu(a.bwb.dnp());
                                 a.goo = new String[axxxxxxxxxx.length];
                                 int axxxxxxxxxxx = 0;

                                 while (axxxxxxxxxxx < axxxxxxxxxx.length) {
                                    String axxxxxxxxxxxx = chi.field_1697.getAbsolutePath() + "/" + axxxxxxxxxx[axxxxxxxxxxx];
                                    a.goo[axxxxxxxxxxx] = axxxxxxxxxxxx;
                                    axxxxxxxxxxx++;
                                    if (axx == null || axx == null) {
                                       break;
                                    }
                                 }
                              } catch (IOException var24) {
                                 var24.printStackTrace();
                              }

                              var44 = a.gcl.fsc(a.dhj.dnp().longValue());
                              if (axx == null) {
                                 break label213;
                              }

                              if (var44) {
                                 label319: {
                                    a.ccz++;
                                    int var46 = a.ccz;
                                    if (axx != null) {
                                       if (a.ccz > a.goo.length - 1) {
                                          a.ccz = 0;
                                       }

                                       gpx = a.goo[a.ccz];
                                       var47 = a;
                                       if (axx == null) {
                                          break label319;
                                       }

                                       var46 = a.ffi.containsKey(gpx);
                                    }

                                    if (var46 == 0) {
                                       a.ffi.put(gpx, chz.gcm(gpx));
                                    }

                                    var47 = a;
                                 }

                                 var47.gcl.glr();
                              }
                           }
                        }
                     }

                     var10000 = a.gsw.dnp();
                  }

                  var44 = (Boolean)var10000;
               }

               label321: {
                  if (axx != null) {
                     if (!var44) {
                        break label321;
                     }

                     var44 = a.ciu.dnp();
                  }

                  if (var44) {
                     dmp.gst(axxxxxx - 1.0F, axxxxxxx, axxxxxx + 0.5F, axxxxxxxxx + 0.5F, Color.BLACK);
                     dmp.gst(axxxxxx - 1.0F, axxxxxxx - 0.5F, axxxxxxxx + 0.5F, axxxxxxx + 1.0F, Color.BLACK);
                     dmp.gst(axxxxxxxx - 1.0F, axxxxxxx, axxxxxxxx + 0.5F, axxxxxxxxx + 0.5F, Color.BLACK);
                     dmp.gst(axxxxxx - 1.0F, axxxxxxxxx - 1.0F, axxxxxxxx + 0.5F, axxxxxxxxx + 0.5F, Color.BLACK);
                  }

                  dmp.dxg(axxxxxx - 0.5F, axxxxxxx, axxxxxx, axxxxxxxxx, a.gtt.dnp(), a.for.dnp());
                  dmp.gmg(axxxxxx, axxxxxxxxx - 0.5F, axxxxxxxx, axxxxxxxxx, a.fvg.dnp(), a.dzb.dnp());
                  dmp.gmg(axxxxxx - 0.5F, axxxxxxx, axxxxxxxx, axxxxxxx + 0.5F, a.hhu.dnp(), a.gaq.dnp());
                  dmp.dxg(axxxxxxxx - 0.5F, axxxxxxx, axxxxxxxx, axxxxxxxxx, a.gr.dnp(), a.cus.dnp());
               }

               float axxxxxxxxxx = ((class_1657)axxx).method_6032() / ((class_1657)axxx).method_6063();
               float axxxxxxxxxxx = axxxxxxxxx + (axxxxxxx - axxxxxxxxx) * axxxxxxxxxx;
               boolean var48 = a.gqe.dnp();
               if (axx != null) {
                  if (!var48) {
                     break label324;
                  }

                  var48 = a.drb.dnp();
               }

               if (var48) {
                  float axxxxxxxxxxxx = 0.3F;
                  dmp.gst(axxxxxx - 5.5F, axxxxxxx, axxxxxx - 2.5F, axxxxxxxxx, Color.BLACK);
                  dmp.gst(axxxxxx - 5.0F, axxxxxxxxxxx - axxxxxxxxxxxx, axxxxxx - 3.0F, axxxxxxxxxxx, Color.BLACK);
                  dmp.gst(axxxxxx - 5.0F, axxxxxxxxx, axxxxxx - 3.0F, axxxxxxxxx + axxxxxxxxxxxx, Color.BLACK);
               }

               dmp.dxg(axxxxxx - 5.0F, axxxxxxxxxxx, axxxxxx - 3.0F, axxxxxxxxx, a.ba.dnp(), a.abb.dnp());
            }

            if (axx == null) {
               return;
            }
         }
      }
   }

   static {
      long var11 = a ^ 67001414141856L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[21];
      int var18 = 0;
      String var17 = "ãCAëîüh\u009c¹p\u0094Â(\u0091CÔô_®\u009eå3!OB\u009aðc\f\u001eÔ\u0098(\fú÷±n\u0016ô\u00062\u008c\u009cG\u001d\u0085Øi\u0084|\u009c\u001e×6[Û\u0018\u0004\u008d\u0080q^\t\u000bÿôPÆZB\u001cc ôï»çéÚF0I\u0013¬È\u001bO\u0012#Ê\u0010dÔ\u001cê÷¥°>\u0010NE\u0096\u000b®(õ¨\u000fÕy} Õ§y<RFû¥\u0000tutP3/êl4¹vRhñ\u0006]\u0082®ÕòÑþÔ\u001e <\u0012¨\u009dÛG\u008dÌe\u009b\u000e\u0007\u0007Á½e\u0014$\u00864ì\u0001@W\u009eúu\u008dÈc\u0000÷(Á¹Éßßìü) ®Ä5·\u0097¾\u008fh\u000f\u009e\u00176\u0089ÆUÎBéÂg>Ärè\u0089S;\u0097\u0094¥â\u0010&\u001bm4\u0080îÜÂgñ³B\u0007i|°\u0018ÅQ\u008aîlT\u008b\u009bº\u0095u\tTù¤xW\u0013ë\u0081\u001e\u0093bw\u0018bØ\u0084\")²Ë\u0094Ì\u008b°\u0011=GË!Û²pìL\u001b*Ú(\\\"4&/\u000b¹üLµ*æ¶Åx¦\u0000\u009fÉº´¾+·\u001d¾¥¹É\u000f\u008afÒÀ\u0080óì\u0012;h(hMÇvÒ\u008c\u008cñE!B\u0096¨3\u008cæÔ\u0095`Pê¼g\u0097FèÐ Ù?ígõ\r\u0006×\tÄm½0xñ\u009f\u0080\u0011M/¬z¨};h\u0019³ºØ\u0091(VÅÿÂ\u0090\u000e®â·\u008e¹¯Ð\u0091¨:\u001ew¥BSKÜó09öO^(\u0093ÈHPí|\u0092t\u0082\u001eº×[4\u001fïyw[ÈK]Iy\u008d·\u001f\u0092öi\u009c\u008a\u0099ªf\u0093\u008cþ\"Å(k\u000b,XÊ7AdãêQ\u0094mCøRh\u008f\u0006Ü\u0088\u001bs1\u008aÚ\u008cE)ÙKÄ¡\u001a©¨R\u001aYß(\u009aõ²[þ\u0014é¾Ü^Ö`¸\u001aXIø¥ûr¢>\u007fÜ\u0090\u0001\u001b\u0084Ö!\u0019ÀE?üÑ>\u0013y6(UÅ½³æ\u00131Ü\u0006p=^4ßHé¸%(þåý6(æ\u009c{¨©\u0017ÅÙ\u008b¸ø¢¨3\u009d\u0098(G\u0094Ç \u0087í\t<Ï2\u000f\u009cÌc\u0014Y~ú{$¹\u0098\u009aU÷6\u0014`\fÂØöRýÑ\u0016\u009aûø\u001a(ó\u0090\u0003zÏø7\u00170:£Æúý\u000f,,ÿÌ0A¿\u00012\u0096o,Q\u0007²\\\fZ´B\u0098\u0092dy°0¡<g±\u0010ëÞ\u0080ð+¹-©Àü\u0014á\bFX4Ü\u0084îz\u0091GéFTaÀGYáQòé\u0082\u000føéVæ\u001bM¡&";
      int var19 = "ãCAëîüh\u009c¹p\u0094Â(\u0091CÔô_®\u009eå3!OB\u009aðc\f\u001eÔ\u0098(\fú÷±n\u0016ô\u00062\u008c\u009cG\u001d\u0085Øi\u0084|\u009c\u001e×6[Û\u0018\u0004\u008d\u0080q^\t\u000bÿôPÆZB\u001cc ôï»çéÚF0I\u0013¬È\u001bO\u0012#Ê\u0010dÔ\u001cê÷¥°>\u0010NE\u0096\u000b®(õ¨\u000fÕy} Õ§y<RFû¥\u0000tutP3/êl4¹vRhñ\u0006]\u0082®ÕòÑþÔ\u001e <\u0012¨\u009dÛG\u008dÌe\u009b\u000e\u0007\u0007Á½e\u0014$\u00864ì\u0001@W\u009eúu\u008dÈc\u0000÷(Á¹Éßßìü) ®Ä5·\u0097¾\u008fh\u000f\u009e\u00176\u0089ÆUÎBéÂg>Ärè\u0089S;\u0097\u0094¥â\u0010&\u001bm4\u0080îÜÂgñ³B\u0007i|°\u0018ÅQ\u008aîlT\u008b\u009bº\u0095u\tTù¤xW\u0013ë\u0081\u001e\u0093bw\u0018bØ\u0084\")²Ë\u0094Ì\u008b°\u0011=GË!Û²pìL\u001b*Ú(\\\"4&/\u000b¹üLµ*æ¶Åx¦\u0000\u009fÉº´¾+·\u001d¾¥¹É\u000f\u008afÒÀ\u0080óì\u0012;h(hMÇvÒ\u008c\u008cñE!B\u0096¨3\u008cæÔ\u0095`Pê¼g\u0097FèÐ Ù?ígõ\r\u0006×\tÄm½0xñ\u009f\u0080\u0011M/¬z¨};h\u0019³ºØ\u0091(VÅÿÂ\u0090\u000e®â·\u008e¹¯Ð\u0091¨:\u001ew¥BSKÜó09öO^(\u0093ÈHPí|\u0092t\u0082\u001eº×[4\u001fïyw[ÈK]Iy\u008d·\u001f\u0092öi\u009c\u008a\u0099ªf\u0093\u008cþ\"Å(k\u000b,XÊ7AdãêQ\u0094mCøRh\u008f\u0006Ü\u0088\u001bs1\u008aÚ\u008cE)ÙKÄ¡\u001a©¨R\u001aYß(\u009aõ²[þ\u0014é¾Ü^Ö`¸\u001aXIø¥ûr¢>\u007fÜ\u0090\u0001\u001b\u0084Ö!\u0019ÀE?üÑ>\u0013y6(UÅ½³æ\u00131Ü\u0006p=^4ßHé¸%(þåý6(æ\u009c{¨©\u0017ÅÙ\u008b¸ø¢¨3\u009d\u0098(G\u0094Ç \u0087í\t<Ï2\u000f\u009cÌc\u0014Y~ú{$¹\u0098\u009aU÷6\u0014`\fÂØöRýÑ\u0016\u009aûø\u001a(ó\u0090\u0003zÏø7\u00170:£Æúý\u000f,,ÿÌ0A¿\u00012\u0096o,Q\u0007²\\\fZ´B\u0098\u0092dy°0¡<g±\u0010ëÞ\u0080ð+¹-©Àü\u0014á\bFX4Ü\u0084îz\u0091GéFTaÀGYáQòé\u0082\u000føéVæ\u001bM¡&"
         .length();
      char var16 = ' ';
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
                     h = new String[21];
                     r = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[20];
                     int var3 = 0;
                     String var4 = "Î´#á\u00ad¹¼\u0095\u0002AØÁ¬\u0019O\u007f( æO²\u0006\u000eé\u0011\u0085mìÛÅS\u0003«\u0016\u00adß\u001bÜK\u009fY\u0096ç\u008aøÑÆ\u0092\\&ÁýRâê\u0094`\u0002tðOï\u0012ÿ\u0089Åd\u001cÕ]ÙÊÛäj\u0004\u0086\ró\u00898¡(ï9\u000eñ\u00843í\u009fV«¯°\tÙ\u009c~\r\fLõJYú\u007f\u0019FµTÓù\u0087Â>\u0002\u001f³Úù@íXhâ×R\u000eS¥~)¹?ð\u009eË\u001c\u008aÆ\f@F";
                     int var5 = "Î´#á\u00ad¹¼\u0095\u0002AØÁ¬\u0019O\u007f( æO²\u0006\u000eé\u0011\u0085mìÛÅS\u0003«\u0016\u00adß\u001bÜK\u009fY\u0096ç\u008aøÑÆ\u0092\\&ÁýRâê\u0094`\u0002tðOï\u0012ÿ\u0089Åd\u001cÕ]ÙÊÛäj\u0004\u0086\ró\u00898¡(ï9\u000eñ\u00843í\u009fV«¯°\tÙ\u009c~\r\fLõJYú\u007f\u0019FµTÓù\u0087Â>\u0002\u001f³Úù@íXhâ×R\u000eS¥~)¹?ð\u009eË\u001c\u008aÆ\f@F"
                        .length();
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
                                    q = new Integer[20];
                                    gpx = null;
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "}a\u009eî0ð½\u0016½2½Ê\u0094ÅöÚ";
                                 var5 = "}a\u009eî0ð½\u0016½2½Ê\u0094ÅöÚ".length();
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

                  var17 = "\u0011!¾\u0019\u0013\u0002.\u0003\u009bt\u009bÚMì\u0096·\u0018{è>!\u0086ÉnäÍTºb°êýÂ\u0097nWuáahr";
                  var19 = "\u0011!¾\u0019\u0013\u0002.\u0003\u009bt\u009bÚMì\u0096·\u0018{è>!\u0086ÉnäÍTºb°êýÂ\u0097nWuáahr".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24123;
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
            throw new RuntimeException("cc/astralis/cc", var10);
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
         throw new RuntimeException("cc/astralis/cc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7322;
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
            throw new RuntimeException("cc/astralis/cc", var14);
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
         throw new RuntimeException("cc/astralis/cc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
