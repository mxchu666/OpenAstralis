package cc.astralis;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1041;

public class bnn extends guu {
   private final bes dfs;
   private final adu dwz;
   private final bes fkz;
   private final bes gfw;
   private final gbp afu;
   private final gbp clm;
   private final gbp egk;
   private List<String> flm;
   private List<dmm> byg;
   private static final long a = 24480334018513L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;
   private static final long v;

   public bnn() {
      long a = bnn.a ^ 103723734994120L;
      super(bfm.VISUAL);
      short var10003 = 1727;
      long var10004 = 5916052458290283312L ^ a;
      a.dfs = new bes("Font Size", 10.0F, 0.0F, 50.0F, 1.0F);
      var10003 = 26342;
      var10004 = 6662700792435106656L ^ a;
      short var11 = 10773;
      long var10005 = 2506539247681384341L ^ a;
      short var17 = 16268;
      long var10006 = 8804169274727817939L ^ a;
      String[] var18 = new String[7];
      short var10008 = 947;
      long var10009 = 489055679218353713L ^ a;
      var18[0] = "Combat";
      var10008 = 26594;
      var10009 = 4801346280945214057L ^ a;
      var18[1] = "Exploit";
      var10008 = 14680;
      var10009 = 6665687915004443857L ^ a;
      var18[2] = "Movement";
      var10008 = 26612;
      var10009 = 2033515980141879929L ^ a;
      var18[3] = "Player";
      var10008 = 26816;
      var10009 = 3528989739215678788L ^ a;
      var18[4] = "Visual";
      var10008 = 11574;
      var10009 = 2546269677780314293L ^ a;
      var18[5] = "World";
      short var10007 = 2146;
      long var24 = 2216202577384559932L ^ a;
      var10008 = 8053;
      var10009 = 3708766559394798329L ^ a;
      var18[6] = "None";
      a.dwz = new adu("Hidden Categories", "None", var18);
      var10003 = 17111;
      var10004 = 1327792458032498512L ^ a;
      a.fkz = new bes("Animation Speed", 300.0F, 1.0F, 2000.0F, 1.0F);
      var10003 = 21917;
      var10004 = 1357550287185858583L ^ a;
      a.gfw = new bes("Color Speed", 10.0F, 1.0F, 50.0F, 1.0F);
      var10003 = 20343;
      var10004 = 7526488381679651577L ^ a;
      a.afu = new gbp("Back Ground", true);
      var10003 = 19197;
      var10004 = 8206248862692200309L ^ a;
      a.clm = new gbp("Side Line", true);
      var10003 = 7923;
      var10004 = 7791744975415876470L ^ a;
      a.egk = new gbp("Full Outline", false);
      a.flm = new ArrayList<>();
      a.byg = new ArrayList<>();
      short var10001 = 5503;
      long var10002 = 8360989731034155043L ^ a;
      ffn[] var3 = new ffn[]{a.dfs, a.fkz, a.gfw, a.afu, a.clm, a.egk, null};
      var3[e<"v">(11384, 6890233304918159661L ^ a)] = a.dwz;
      a.bfi(var3);
   }

   private void eiu() {
      ezv a = dar.gqy().aws().diy(ezv.class);
      fll ax = bxc.emc(a.ahf.dnp(), a.dfs.dnp().intValue());
      a.flm = Arrays.stream(a.dwz.ape()).filter(a.dwz::emb).map(String::toUpperCase).toList();
      a.byg = dar.gqy().aws().dmc().stream().filter(axx -> {
         long ax = bnn.a ^ 70321045205006L;
         int[] var4 = dar.abu();
         boolean var10000 = a.flm.contains(axx.aiq().name());
         if (var4 != null) {
            var10000 = !var10000;
         }

         return var10000;
      }).map(axx -> new dmm(axx, axx.dtp(true), (int)a.dsq().ena(axx.dtp(true)))).sorted(Comparator.comparingInt(axx -> -axx.hec)).toList();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @gdz(4)
   public void eux(ctt event) {
      long ax = bnn.a ^ 42940884298000L;
      ezv axx = dar.gqy().aws().diy(ezv.class);
      int[] var10000 = dar.abu();
      fll axxx = bxc.emc(axx.ahf.dnp(), a.dfs.dnp().intValue());
      int[] axxxx = var10000;
      class_1041 axxxxx = chi.method_22683();
      float axxxxxx = chi.field_1724.method_6026().isEmpty() ? 4.0F : 25.0F;
      int axxxxxxx = 0;
      float axxxxxxxx = a.dfs.dnp().intValue() + 4;
      dmm axxxxxxxxx = null;
      dmm axxxxxxxxxx = null;
      Iterator var13 = a.byg.iterator();

      while (true) {
         if (var13.hasNext()) {
            dmm axxxxxxxxxxx = (dmm)var13.next();
            boolean var36 = axxxxxxxxxxx.gts().dsv();
            if (axxxx == null) {
               if (!var36) {
                  return;
               }
               break;
            }

            label250: {
               label251: {
                  if (axxxx != null) {
                     if (!var36) {
                        break label250;
                     }

                     var37 = axxxxxxxxxxx;
                     if (axxxx == null) {
                        break label251;
                     }

                     var36 = axxxxxxxxxxx.gts().aov();
                  }

                  if (var36) {
                     break label250;
                  }

                  var37 = axxxxxxxxx;
               }

               if (axxxx != null) {
                  if (var37 == null) {
                     axxxxxxxxx = axxxxxxxxxxx;
                  }

                  var37 = axxxxxxxxxxx;
               }

               axxxxxxxxxx = var37;
            }

            if (axxxx != null) {
               continue;
            }

            var13 = a.byg.iterator();
         } else {
            var13 = a.byg.iterator();
         }

         if (!var13.hasNext()) {
            return;
         }
         break;
      }

      while (true) {
         dmm axxxxxxxxxxxx = (dmm)var13.next();
         guu axxxxxxxxxxxxx = axxxxxxxxxxxx.gts();
         erp axxxxxxxxxxxxxx = dar.gqy().ftn().gqv(axxxxxxxxxxxxx);
         boolean var10001 = axxxxxxxxxxxxx.dsv();
         axxxxxxxxxxxxxx.dwm(axxxx != null ? (var10001 ? (!axxxxxxxxxxxxx.aov() ? 1.0 : 0.0) : 0.0) : (!var10001 ? 1.0 : 0.0));
         axxxxxxxxxxxxxx.hef(a.fkz.dnp().longValue());
         float axxxxxxxxxxxxxxx = (float)axxxxxxxxxxxxxx.hjo();
         float var45;
         int var38 = (var45 = axxxxxxxxxxxxxxx - 0.0F) == 0.0F ? 0 : (var45 < 0.0F ? -1 : 1);
         if (axxxx != null) {
            if (var38 <= 0) {
               if (!var13.hasNext()) {
                  break;
               }
               continue;
            }

            var38 = 5 + axxxxxxxxxxxx.hec;
         }

         float axxxxxxxxxxxxxxxx = var38;
         float axxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxxx * axxxxxxxxxxxxxxx;
         float axxxxxxxxxxxxxxxxxx = axxxxxxxx * axxxxxxxxxxxxxxx;
         float axxxxxxxxxxxxxxxxxxx = axxxxx.method_4486() - 4;
         float axxxxxxxxxxxxxxxxxxxx = axxxxxx + axxxxxxxxxxxxxxxxxx;
         float axxxxxxxxxxxxxxxxxxxxx = 2.0F;
         String axxxxxxxxxxxxxxxxxxxxxx = axx.eqi.dnp();
         byte axxxxxxxxxxxxxxxxxxxxxxx = -1;
         int var39 = axxxxxxxxxxxxxxxxxxxxxx.hashCode();
         if (axxxx != null) {
            switch (var39) {
               case -1656737386:
                  var39 = axxxxxxxxxxxxxxxxxxxxxx.equals(b<"b">(10043, 4038053739093067618L ^ ax));
                  if (axxxx != null) {
                     if (var39 != 0) {
                        axxxxxxxxxxxxxxxxxxxxxxx = 0;
                     }

                     var39 = axxxxxxxxxxxxxxxxxxxxxxx;
                  }
                  break;
               default:
                  var39 = axxxxxxxxxxxxxxxxxxxxxxx;
            }
         }

         label229: {
            if (axxxx != null) {
               switch (var39) {
                  case 0:
                     var40 = ezv.gbq(v, axxxxxxx * e<"v">(2159, 366114737180864750L ^ ax), 0.8F, 1.0F);
                     break label229;
                  default:
                     var39 = a.gfw.dnp().intValue();
               }
            }

            var40 = dec.fqm(var39, 3 + axxxxxxx * e<"v">(15452, 4054241309666329817L ^ ax), dar.gqy().deo(), dar.gqy().cxj(), false);
         }

         Color axxxxxxxxxxxxxxxxxxxxxxxx = var40;
         int var41 = a.afu.dnp();
         if (axxxx != null) {
            if (var41 != 0) {
               float var42 = axxxxx.method_4486() - axxxxxxxxxxxxxxxxx - axxxxxxxxxxxxxxxxxxxxx;
               int var10003 = a.clm.dnp();
               if (axxxx != null) {
                  var10003 = var10003 != 0 ? 2 : 1;
               }

               dmp.gst(
                  var42,
                  axxxxxx,
                  axxxxxxxxxxxxxxxxxxx + var10003,
                  axxxxxxxxxxxxxxxxxxxx,
                  new Color(
                     e<"v">(6658, 393789177143222913L ^ ax),
                     e<"v">(18612, 6242429508746326070L ^ ax),
                     e<"v">(5013, 2765047135602993941L ^ ax),
                     axx.fug.dnp().intValue()
                  )
               );
            }

            var41 = a.clm.dnp();
         }

         if (axxxx != null) {
            if (var41 != 0) {
               dmp.gst(axxxxx.method_4486() - 2, axxxxxx, axxxxxxxxxxxxxxxxxxx + 1.0F, axxxxxxxxxxxxxxxxxxxx, axxxxxxxxxxxxxxxxxxxxxxxx);
            }

            var41 = a.egk.dnp();
         }

         label221:
         if (axxxx != null) {
            if (var41 != 0) {
               float axxxxxxxxxxxxxxxxxxxxxxxxx = axxxxx.method_4486() - axxxxxxxxxxxxxxxxx - axxxxxxxxxxxxxxxxxxxxx;
               float axxxxxxxxxxxxxxxxxxxxxxxxxx = axxxxx.method_4486() - 3;
               dmp.gst(axxxxxxxxxxxxxxxxxxxxxxxxx - 1.0F, axxxxxx, axxxxxxxxxxxxxxxxxxxxxxxxx, axxxxxxxxxxxxxxxxxxxx, axxxxxxxxxxxxxxxxxxxxxxxx);
               dmm var43 = axxxxxxxxxxxx;
               dmm var44 = axxxxxxxxx;
               if (axxxx != null) {
                  if (axxxxxxxxxxxx == axxxxxxxxx) {
                     dmp.gst(axxxxxxxxxxxxxxxxxxxxxxxxx, axxxxxx, axxxxxxxxxxxxxxxxxxxxxxxxxx, axxxxxx + 1.0F, axxxxxxxxxxxxxxxxxxxxxxxx);
                  }

                  var43 = axxxxxxxxxxxx;
                  var44 = axxxxxxxxxx;
               }

               if (var43 == var44) {
                  dmp.gst(
                     axxxxxxxxxxxxxxxxxxxxxxxxx - 1.0F,
                     axxxxxxxxxxxxxxxxxxxx,
                     axxxxxxxxxxxxxxxxxxxxxxxxxx + 1.0F,
                     axxxxxxxxxxxxxxxxxxxx + 1.0F,
                     axxxxxxxxxxxxxxxxxxxxxxxx
                  );
               }

               int axxxxxxxxxxxxxxxxxxxxxxxxxxx = a.byg.indexOf(axxxxxxxxxxxx);
               int axxxxxxxxxxxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxxxxxxxxxxxxxx + 1;

               while (axxxxxxxxxxxxxxxxxxxxxxxxxxxx < a.byg.size()) {
                  dmm axxxxxxxxxxxxxxxxxxxxxxxxxxxxx = a.byg.get(axxxxxxxxxxxxxxxxxxxxxxxxxxxx);
                  if (axxxx != null) {
                     var41 = axxxxxxxxxxxxxxxxxxxxxxxxxxxxx.gts().dsv();
                     if (axxxx == null) {
                        break label221;
                     }

                     if (var41 != 0) {
                        if (!axxxxxxxxxxxxxxxxxxxxxxxxxxxxx.gts().aov()) {
                           erp axxxxxxxxxxxxxxxxxxxxxxxxxxxxxx = dar.gqy().ftn().gqv(axxxxxxxxxxxxxxxxxxxxxxxxxxxxx.gts());
                           float axxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx = 5.0F + axxxxxxxxxxxxxxxxxxxxxxxxxxxxx.hec * (float)axxxxxxxxxxxxxxxxxxxxxxxxxxxxxx.hjo();
                           float axxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx = axxxxx.method_4486() - axxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx - axxxxxxxxxxxxxxxxxxxxx;
                           float var46;
                           var41 = (var46 = Math.abs(axxxxxxxxxxxxxxxxxxxxxxxxx - axxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx) - 1.0F) == 0.0F
                              ? 0
                              : (var46 < 0.0F ? -1 : 1);
                           if (axxxx == null) {
                              break label221;
                           }

                           if (var41 < 0) {
                              break;
                           }

                           dmp.gst(
                              axxxxxxxxxxxxxxxxxxxxxxxxx - 1.0F,
                              axxxxxxxxxxxxxxxxxxxx,
                              axxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx,
                              axxxxxxxxxxxxxxxxxxxx + 1.0F,
                              axxxxxxxxxxxxxxxxxxxxxxxx
                           );
                           if (axxxx != null) {
                              break;
                           }

                           axxxxxxxxxxxxxxxxxxxxxxxxxxxx++;
                        } else {
                           axxxxxxxxxxxxxxxxxxxxxxxxxxxx++;
                        }
                     } else {
                        axxxxxxxxxxxxxxxxxxxxxxxxxxxx++;
                     }
                  }

                  if (axxxx == null) {
                     break;
                  }
               }
            }

            dmp.hdn();
            var41 = axxxxx.method_4486();
         }

         dmp.gpu(var41 - (axxxxxxxxxxxxxxxxxxxxx + (axxxxxxxxxxxxxxxx - 1.5F) * axxxxxxxxxxxxxxx), axxxxxx + 1.0F);
         dmp.fle(axxxxxxxxxxxxxxx, axxxxxxxxxxxxxxx);
         axxx.dsq().ejy(axxxxxxxxxxxx.ckl, 0.0F, 0.0F, axxxxxxxxxxxxxxxxxxxxxxxx);
         dmp.bzg();
         axxxxxx += axxxxxxxxxxxxxxxxxx;
         axxxxxxx++;
         if (axxxx == null || !var13.hasNext()) {
            break;
         }
      }
   }

   @gdz
   public void cvj(eel event) {
      long ax = bnn.a ^ 74527216819548L;
      ezv axx = dar.gqy().aws().diy(ezv.class);
      int[] var10000 = dar.abu();
      fll axxx = bxc.emc(axx.ahf.dnp(), a.dfs.dnp().intValue());
      class_1041 axxxx = chi.method_22683();
      int[] axxxxx = var10000;
      float axxxxxx = chi.field_1724.method_6026().isEmpty() ? 4.0F : 25.0F;
      float axxxxxxx = a.dfs.dnp().intValue() + 4;

      for (dmm axxxxxxxx : a.byg) {
         erp axxxxxxxxx;
         double var23;
         label66: {
            label65: {
               guu axxxxxxxxxx = axxxxxxxx.gts();
               axxxxxxxxx = dar.gqy().ftn().gqv(axxxxxxxxxx);
               boolean var10001 = axxxxxxxxxx.dsv();
               if (axxxxx != null) {
                  if (!var10001) {
                     break label65;
                  }

                  var10001 = axxxxxxxxxx.aov();
               }

               if (!var10001) {
                  var23 = 1.0;
                  break label66;
               }
            }

            var23 = 0.0;
         }

         axxxxxxxxx.dwm(var23);
         axxxxxxxxx.hef(a.fkz.dnp().longValue());
         float axxxxxxxxxxx = (float)axxxxxxxxx.hjo();
         float var24;
         int var21 = (var24 = axxxxxxxxxxx - 0.0F) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
         if (axxxxx != null) {
            if (var21 <= 0) {
               continue;
            }

            var21 = 5 + axxxxxxxx.hec;
         }

         float axxxxxxxxxxxx = var21;
         float axxxxxxxxxxxxx = axxxxxxxxxxxx * axxxxxxxxxxx;
         float axxxxxxxxxxxxxx = axxxxxxx * axxxxxxxxxxx;
         float axxxxxxxxxxxxxxx = axxxx.method_4486() - 4;
         float axxxxxxxxxxxxxxxx = axxxxxx + axxxxxxxxxxxxxx;
         float axxxxxxxxxxxxxxxxx = 2.0F;
         if (axxxxx != null) {
            if (a.afu.dnp()) {
               float var22 = axxxx.method_4486() - axxxxxxxxxxxxx - axxxxxxxxxxxxxxxxx;
               int var10003 = a.clm.dnp();
               if (axxxxx != null) {
                  var10003 = var10003 != 0 ? 2 : 1;
               }

               dmp.grl(var22, axxxxxx, axxxxxxxxxxxxxxx + var10003, axxxxxxxxxxxxxxxx);
            }

            axxxxxx += axxxxxxxxxxxxxx;
         }

         if (axxxxx == null) {
            break;
         }
      }
   }

   @gdz
   public void db(frd event) {
      a.eiu();
   }

   @gdz
   public void axm(het event) {
      a.eiu();
   }

   static {
      long var16 = a ^ 28487297168103L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var19 = 1; var19 < 8; var19++) {
         var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[16];
      int var23 = 0;
      String var22 = "t,º2\u0000\u008e\u0016Ç&Fj  \u009dÜ9\u0010Ó]l\u0082\u0011#Hõ0\u008e\fRÒVpæ\u0010`\u0089¸k\bMlñíí=¾ca´£\u0010ñÖ¥vYJ©3òñ\u001daÄ9÷S\u0010ú\u0095\u0013Æ|?h\u0011\u00050M·\u0091\u0006êÆ Ós$+ ¡ÔHå´|\u0016À\u008a\u009aÁ\u001e¾gKÜ<Ä31Þ\u0085¯ë¯T´ ó¼\u00ad\u0090`\u0081Z¾.\u0016A\u008fî¿pb[o2«\u0014§2\u0086\u0004D°dÔ^%y )ÜY|\u0000ÚE!x)ù¨FôReûÅ¨ÊêaÃPÎÝ;óåP1\u00ad \u0097\u009a\u0089ý»g/q_Ò\u001e/\u0000~\u00016ß\u0003E®!\b(zj4ï'Å¼\u008fu\u0018D{É¾Î\u001f{ÕL³\nçô'Z¿»\u0082aî&È_\u0016 ðµvÃ\u008c><}ª¯ÌÞ¦D0^\u001bõ4XßÕqoØF\u0091S´\u0083ë¥\u0010\u0018Î7\u0017\u001frýc\u0086GId\u009e\u008e\u001d\u009d\u0010\u001bÔ\u0019ìD\u0011\u0082½\u0018Ûæ\u0087ßô\"\u0089\u0010Ð\u0013,þ\rÿ}R\u0094èÚ\u000eE\tÃz";
      int var24 = "t,º2\u0000\u008e\u0016Ç&Fj  \u009dÜ9\u0010Ó]l\u0082\u0011#Hõ0\u008e\fRÒVpæ\u0010`\u0089¸k\bMlñíí=¾ca´£\u0010ñÖ¥vYJ©3òñ\u001daÄ9÷S\u0010ú\u0095\u0013Æ|?h\u0011\u00050M·\u0091\u0006êÆ Ós$+ ¡ÔHå´|\u0016À\u008a\u009aÁ\u001e¾gKÜ<Ä31Þ\u0085¯ë¯T´ ó¼\u00ad\u0090`\u0081Z¾.\u0016A\u008fî¿pb[o2«\u0014§2\u0086\u0004D°dÔ^%y )ÜY|\u0000ÚE!x)ù¨FôReûÅ¨ÊêaÃPÎÝ;óåP1\u00ad \u0097\u009a\u0089ý»g/q_Ò\u001e/\u0000~\u00016ß\u0003E®!\b(zj4ï'Å¼\u008fu\u0018D{É¾Î\u001f{ÕL³\nçô'Z¿»\u0082aî&È_\u0016 ðµvÃ\u008c><}ª¯ÌÞ¦D0^\u001bõ4XßÕqoØF\u0091S´\u0083ë¥\u0010\u0018Î7\u0017\u001frýc\u0086GId\u009e\u008e\u001d\u009d\u0010\u001bÔ\u0019ìD\u0011\u0082½\u0018Ûæ\u0087ßô\"\u0089\u0010Ð\u0013,þ\rÿ}R\u0094èÚ\u000eE\tÃz"
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
                     h = new String[16];
                     r = new HashMap(13);
                     Cipher var5;
                     var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var6 = 1; var6 < 8; var6++) {
                        var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var11 = new long[9];
                     int var8 = 0;
                     String var9 = "ùS\u008e8:|ÙH\u0005TÒwÃ¾¸S\u0085bÌ\u0007á\u0095\u001c5\u001b\u009a3rËbø2q\u00031ûmvS~\u0015e\u0092zÿ%Ð°µËkÞû\u008b\u0000E";
                     int var10 = "ùS\u008e8:|ÙH\u0005TÒwÃ¾¸S\u0085bÌ\u0007á\u0095\u001c5\u001b\u009a3rËbø2q\u00031ûmvS~\u0015e\u0092zÿ%Ð°µËkÞû\u008b\u0000E"
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
                                    q = new Integer[9];
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long var2 = -3186819989209227085L;
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

                                 var9 = "\u0016K\u0095í¾%¼ãå«<å\u0085æyà";
                                 var10 = "\u0016K\u0095í¾%¼ãå«<å\u0085æyà".length();
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

                  var22 = "á\u008alnÝvtÝ\u001a±»ÍÑ#Ó\\S$Ï¯\u0005¨G/-ñÞF\u001c=\u0005§ ªe¹æµ£yÅæs+\u001ejµ8p\u008a\u0010\u008e\u0015\u008dsÛRSî.\u001a!\u009e©ê";
                  var24 = "á\u008alnÝvtÝ\u001a±»ÍÑ#Ó\\S$Ï¯\u0005¨G/-ñÞF\u001c=\u0005§ ªe¹æµ£yÅæs+\u001ejµ8p\u008a\u0010\u008e\u0015\u008dsÛRSî.\u001a!\u009e©ê"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32409;
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
            throw new RuntimeException("cc/astralis/bnn", var10);
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
         throw new RuntimeException("cc/astralis/bnn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9796;
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
            throw new RuntimeException("cc/astralis/bnn", var14);
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
         throw new RuntimeException("cc/astralis/bnn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
