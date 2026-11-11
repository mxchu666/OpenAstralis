package cc.astralis;

import java.awt.Color;
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
import net.minecraft.class_124;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import org.joml.Vector4d;

public class der extends guu {
   private final adu gco;
   private final gbp dk;
   private final gbp fua;
   private final gbp bff;
   private final acn chs;
   private final acn eok;
   private final bes aih;
   private final bes ait;
   private static final long a = 68363239688307L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;

   public der() {
      long a = der.a ^ 8449320076688L;
      super(bfm.VISUAL);
      short var10003 = 594;
      long var10004 = 8202393272308847833L ^ a;
      short var12 = 16655;
      long var10005 = 1924092404768151455L ^ a;
      short var21 = 17904;
      long var10006 = 4888670143474169709L ^ a;
      String[] var22 = new String[9];
      short var10008 = 10652;
      long var10009 = 3146712035735994140L ^ a;
      var22[0] = "Product Sans Regular";
      var10008 = 27381;
      var10009 = 789517440437075065L ^ a;
      var22[1] = "Product Sans Bold";
      var10008 = 8938;
      var10009 = 167736360851272813L ^ a;
      var22[2] = "JetBrains-Regular";
      var10008 = 27740;
      var10009 = 7397281211146222301L ^ a;
      var22[3] = "JetBrains-Bold";
      var10008 = 1408;
      var10009 = 4742534046867116814L ^ a;
      var22[4] = "Poppins-Regular";
      var10008 = 9949;
      var10009 = 5895107413476110421L ^ a;
      var22[5] = "Poppins-Bold";
      int var10007 = 5006;
      long var30 = 8415853406848950546L ^ a;
      var10008 = 11335;
      var10009 = 6124567891092601540L ^ a;
      var22[6] = "Sf-Regular";
      var10007 = e<"t">(24793, 6314581829626745410L ^ a);
      var10008 = 22357;
      var10009 = 8440569293560119770L ^ a;
      var22[var10007] = "Sf-Bold";
      short var24 = 23016;
      long var33 = 1518589552073403249L ^ a;
      var10008 = 733;
      var10009 = 7700161758414033999L ^ a;
      var22[8] = "Tahoma";
      a.gco = new adu("Font", "Product Sans Regular", var22);
      var10003 = 3876;
      var10004 = 4517214158943148454L ^ a;
      a.dk = new gbp("Text Shadow", true);
      var10003 = 14319;
      var10004 = 182570006707986793L ^ a;
      a.fua = new gbp("Background", true);
      var10003 = 14034;
      var10004 = 7886333898819559512L ^ a;
      a.bff = new gbp("Show Health", true);
      var10003 = 3914;
      var10004 = 6142162855814814171L ^ a;
      a.chs = new acn("Text Color", Color.WHITE);
      var10003 = 26178;
      var10004 = 3808487343831855311L ^ a;
      short var43 = 30710;
      long var10010 = 3353493486050559342L ^ a;
      a.eok = new acn("Background Color", new Color(0, 0, 0, 150));
      var10003 = 7607;
      var10004 = 3688868106807855908L ^ a;
      a.aih = new bes("Corner Radius", 3.0F, 0.0F, 10.0F, 0.5F);
      var10003 = 31384;
      var10004 = 6856770535481256977L ^ a;
      a.ait = new bes("Padding", 2.0F, 0.0F, 10.0F, 0.5F);
      short var10001 = 584;
      long var10002 = 878807782559854807L ^ a;
      ffn[] var3 = new ffn[]{a.gco, a.dk, a.fua, a.bff, a.chs, a.eok, null, null};
      var10003 = 12601;
      var10004 = 924028140932531107L ^ a;
      var3[6] = a.aih;
      var3[e<"t">(21668, 7062375412798154288L ^ a)] = a.ait;
      a.bfi(var3);
   }

   @gdz
   public void cal(ctt event) {
      long ax = der.a ^ 78224763792940L;
      int[] axx = dar.abu();
      class_310 var10000 = chi;
      if (axx != null) {
         if (chi.method_1561().field_4686 == null) {
            return;
         }

         var10000 = chi;
      }

      if (axx != null) {
         if (var10000.field_1687 == null) {
            return;
         }

         var10000 = chi;
      }

      if (axx != null) {
         if (var10000.field_1724 == null) {
            return;
         }

         var10000 = chi;
      }

      Iterator var5 = var10000.field_1687.method_18112().iterator();

      label198:
      while (true) {
         int var42 = var5.hasNext();

         class_1297 axxx;
         Vector4d axxxx;
         label195:
         while (true) {
            if (var42 == 0) {
               return;
            }

            label218: {
               axxx = (class_1297)var5.next();
               boolean var43 = axxx instanceof class_1309;
               if (axx != null) {
                  if (!var43 && axx != null) {
                     continue label198;
                  }

                  var44 = axxx;
                  if (axx == null) {
                     break label218;
                  }

                  var43 = axxx instanceof class_1657;
               }

               if (!var43) {
                  continue label198;
               }

               var44 = axxx;
            }

            label171: {
               if (axx != null) {
                  if (var44 == chi.field_1724) {
                     var45 = chi.field_1690.method_31044().method_31034();
                     if (axx == null) {
                        break label171;
                     }

                     if (var45 != 0 && axx != null) {
                        continue label198;
                     }
                  }

                  var44 = axxx;
               }

               var45 = var44 instanceof class_1657;
            }

            label220: {
               label181:
               if (axx != null) {
                  if (var45 != 0) {
                     class_1657 axxxxx = (class_1657)axxx;
                     var45 = axxxxx.method_5628();
                     if (axx == null) {
                        break label181;
                     }

                     if (var45 == chi.field_1724.method_5628() && axx != null) {
                        continue label198;
                     }
                  }

                  var46 = (class_1657)axxx;
                  if (axx == null) {
                     break label220;
                  }

                  var45 = ejt.cnv((class_1657)var46);
               }

               if (var45 != 0) {
                  return;
               }

               var46 = axxx;
            }

            class_238 var32 = var46.method_5829();
            short var47 = 584;
            double axxxxxx = axxx.field_6014 + (axxx.method_23317() - axxx.field_6014) * chi.method_61966().method_60637(false);
            long var10001 = 878878745273752427L ^ ax;
            double axxxxxxx = axxx.field_6036 + (axxx.method_23318() - axxx.field_6036) * chi.method_61966().method_60637(false);
            double axxxxxxxx = axxx.field_5969 + (axxx.method_23321() - axxx.field_5969) * chi.method_61966().method_60637(false);
            class_238 axxxxxxxxx = new class_238(
               var32.field_1323 - axxx.method_23317() + axxxxxx - 0.1,
               var32.field_1322 - axxx.method_23318() + axxxxxxx,
               var32.field_1321 - axxx.method_23321() + axxxxxxxx - 0.1,
               var32.field_1320 - axxx.method_23317() + axxxxxx + 0.1,
               var32.field_1325 - axxx.method_23318() + axxxxxxx + 0.12,
               var32.field_1324 - axxx.method_23321() + axxxxxxxx + 0.1
            );
            class_243[] var48 = new class_243[]{
               new class_243(axxxxxxxxx.field_1323, axxxxxxxxx.field_1322, axxxxxxxxx.field_1321),
               new class_243(axxxxxxxxx.field_1323, axxxxxxxxx.field_1325, axxxxxxxxx.field_1321),
               new class_243(axxxxxxxxx.field_1320, axxxxxxxxx.field_1322, axxxxxxxxx.field_1321),
               new class_243(axxxxxxxxx.field_1320, axxxxxxxxx.field_1325, axxxxxxxxx.field_1321),
               new class_243(axxxxxxxxx.field_1323, axxxxxxxxx.field_1322, axxxxxxxxx.field_1324),
               new class_243(axxxxxxxxx.field_1323, axxxxxxxxx.field_1325, axxxxxxxxx.field_1324),
               null,
               null
            };
            short var10002 = 12601;
            long var10003 = 923957247204485151L ^ ax;
            var48[6] = new class_243(axxxxxxxxx.field_1320, axxxxxxxxx.field_1322, axxxxxxxxx.field_1324);
            var48[e<"t">(21668, 7062446375143968140L ^ ax)] = new class_243(axxxxxxxxx.field_1320, axxxxxxxxx.field_1325, axxxxxxxxx.field_1324);
            class_243[] axxxxxxxxxx = var48;
            axxxx = null;
            class_243[] axxxxxxxxxxx = axxxxxxxxxx;
            int axxxxxxxxxxxx = axxxxxxxxxx.length;
            int axxxxxxxxxxxxx = 0;

            while (true) {
               if (axxxxxxxxxxxxx >= axxxxxxxxxxxx) {
                  break label195;
               }

               class_243 axxxxxxxxxxxxxx = axxxxxxxxxxx[axxxxxxxxxxxxx];
               class_243 axxxxxxxxxxxxxxx = guf.at(axxxxxxxxxxxxxx);
               if (axx != null) {
                  double var60;
                  var42 = (var60 = axxxxxxxxxxxxxxx.field_1350 - 0.0) == 0.0 ? 0 : (var60 < 0.0 ? -1 : 1);
                  if (axx == null) {
                     break;
                  }

                  if (var42 > 0 && axxxxxxxxxxxxxxx.field_1350 < 1.0) {
                     Vector4d var49 = axxxx;
                     if (axx != null) {
                        if (axxxx == null) {
                           axxxx = new Vector4d(axxxxxxxxxxxxxxx.field_1352, axxxxxxxxxxxxxxx.field_1351, axxxxxxxxxxxxxxx.field_1350, 0.0);
                        }

                        axxxx.x = Math.min(axxxxxxxxxxxxxxx.field_1352, axxxx.x);
                        axxxx.y = Math.min(axxxxxxxxxxxxxxx.field_1351, axxxx.y);
                        axxxx.z = Math.max(axxxxxxxxxxxxxxx.field_1352, axxxx.z);
                        var49 = axxxx;
                     }

                     var49.w = Math.max(axxxxxxxxxxxxxxx.field_1351, axxxx.w);
                  }

                  axxxxxxxxxxxxx++;
               }

               if (axx == null) {
                  break label195;
               }
            }
         }

         label224: {
            Vector4d var50 = axxxx;
            if (axx != null) {
               if (axxxx == null) {
                  break label224;
               }

               var50 = axxxx;
            }

            float axxxxxx = (float)var50.x;
            float axxxxxxx = (float)axxxx.y;
            float axxxxxxxx = (float)axxxx.z;
            float axxxxxxxxx = (float)axxxx.w;
            String var51 = a.gco.dnp();
            short var54 = 29637;
            long var57 = 1877102437158234855L ^ ax;
            fll axxxxxxxxxx = bxc.emc(var51, 9);
            float axxxxxxxxxxx = (axxxxxx + axxxxxxxx) / 2.0F;
            float axxxxxxxxxxxx = axxxxxxx - 10.0F;
            class_1309 axxxxxxxxxxxxx = (class_1309)axxx;
            StringBuilder axxxxxxxxxxxxxxxx = new StringBuilder(axxx.method_5477().getString());
            if (a.bff.dnp()) {
               float axxxxxxxxxxxxxxxxx = axxxxxxxxxxxxx.method_6032();
               float axxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxxxx / axxxxxxxxxxxxx.method_6063();
               class_124 axxxxxxxxxxxxxxxxxxx = a.dak(axxxxxxxxxxxxxxxxxx);
               StringBuilder var52 = axxxxxxxxxxxxxxxx.append(axxxxxxxxxxxxxxxxxxx);
               var54 = 6745;
               var57 = 47410651065198432L ^ ax;
               var52.append(String.format(" %.1f", axxxxxxxxxxxxxxxxx));
            }

            float axxxxxxxxxxxxxxxxx;
            float axxxxxxxxxxxxxxxxxx;
            label149: {
               axxxxxxxxxxxxxxxxx = axxxxxxxxxx.eq(axxxxxxxxxxxxxxxx.toString());
               var54 = 8080;
               var57 = 4855583524764426920L ^ ax;
               axxxxxxxxxxxxxxxxxx = axxxxxxxxxx.biu("Ay");
               float axxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxxxx + a.ait.dnp().intValue() * 4;
               float axxxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxxxxx + a.ait.dnp().intValue() * 2;
               var10000 = a;
               if (axx != null) {
                  if (!a.fua.dnp()) {
                     break label149;
                  }

                  var10000 = dar.gqy().aws().diy(ezv.class);
               }

               ezv axxxxxxxxxxxxxxxxxxxxx = (ezv)var10000;
               Color axxxxxxxxxxxxxxxxxxxxxx = dec.ceu(a.eok.dnp(), axxxxxxxxxxxxxxxxxxxxx.fug.dnp().intValue());
               dmp.cpp(
                  axxxxxxxxxxx - axxxxxxxxxxxxxxxxxxx / 2.0F,
                  axxxxxxxxxxxx - axxxxxxxxxxxxxxxxxxxx / 2.0F + axxxxxxxxxxxxxxxxxx / 4.0F,
                  axxxxxxxxxxxxxxxxxxx,
                  axxxxxxxxxxxxxxxxxxxx,
                  a.aih.dnp().floatValue(),
                  axxxxxxxxxxxxxxxxxxxxxx
               );
            }

            float axxxxxxxxxxxxxxxxxxx;
            label143: {
               axxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxx - axxxxxxxxxxxxxxxxxx / 3.2F;
               if (axx != null) {
                  if (a.dk.dnp()) {
                     break label143;
                  }

                  axxxxxxxxxx.ebb(axxxxxxxxxxxxxxxx.toString(), axxxxxxxxxxx - axxxxxxxxxxxxxxxxx / 2.0F, axxxxxxxxxxxxxxxxxxx, a.chs.dnp());
               }

               if (axx != null) {
                  break label224;
               }
            }

            axxxxxxxxxx.aof(axxxxxxxxxxxxxxxx.toString(), axxxxxxxxxxx - axxxxxxxxxxxxxxxxx / 2.0F, axxxxxxxxxxxxxxxxxxx, a.chs.dnp());
         }

         if (axx == null) {
            return;
         }
      }
   }

   private class_124 dak(float a) {
      long ax = der.a ^ 110634512394943L;
      int[] var4 = dar.abu();
      float var5;
      int var10000 = (var5 = a - 0.6F) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1);
      if (var4 != null) {
         if (var10000 > 0) {
            return class_124.field_1060;
         }

         float var6;
         var10000 = (var6 = a - 0.3F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
      }

      return var10000 > 0 ? class_124.field_1054 : class_124.field_1061;
   }

   static {
      long var11 = a ^ 12426760043315L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[20];
      int var18 = 0;
      String var17 = "ÄôN\u0080&¨æòÛýî°¢±þx²Í\u001eÿíj\u008c*ãiP\u0015Í\u001dÂ³Ïx\u0016\u000f6á~ï\u0018v\u0098µå¾\u008eü\u001ad\u00049\u0081fmpE@t*ÞðÄ°O S\u0001Y\u0012/\u0011\u0018Ú¯Ölñö\u0005L\u0095ßÕòL~Ã*¦+ß«àCþpN\u0018y\u008bûÍ\u009a©:v¶\u009eRO\u0000y:\u0010k/b\u008b6W\u001bÛ\u0010Tÿ\u0015f\u0094%\u001f¼\u007fÄ\u0011¼\u0094, H\u0010:³F<\u0002Fôó;WPõ|ö\u001bû\u0018½Æ2yá\u009b\"2ù5e BeI\u0084»\u00101Îg`GÉ(\u0019-æ=¿^è@\u000f\u008dC\u0086\u009f±¶ïÂV\tÐ\u0014Ì²V\u0097\u0087a\u000b1£C¡Ú\t\u0005©QjÿÔ \u008dµj\u0011xÐ\føz@C_,´Þ®ím\u008fÙÀ\u009b:\u0098\u008fl¬\u0093$q)2\u0010\u0092¹\u0080ClR5\u0090\u0097.ß\u001eØ\u001e«k\u0018«¤ïrS M8Wà9åó{\t%/ô\f\u001fÇW\nL\u0010\r²@ÃU\u0085!j|kæÍÓ\u0019Â\t(m\u0086m\u0086uPìys\u0019\u0010\u0081ëö.Å©\u0095\u008d\u0089¨úõá\u0012K¯9\u008ey4è¡«}n\u0019\u008f+*(\r|\u0018{\rÐ³^;Î\u0010Îk\u008dð÷\u0095>\u0087¨u\u0096×SDè¶Ôêh\u009cÍá¿¹°ª\u008a\u00ad_\u0018úØ4ÛP\u0082>¿\\\u009asûõ\t2¢\u001d\u001c\fÿÃtH\u0096\u0010\r73#Ì1u\u00181µÓÖ\u0091âF÷(V¿\rj2YËxøß¹Õ_\u0004ø[Ü\u008f³^ÛFE¥î°Oí\u0086\u008a\u0005¨5[à\r}7/ã \u0011ö\u0084\u000f\u0082JYf¹f\u0093\u008dk\u009dª?\u008a\bë\u0017#\u0086£èéßÔ?\u0093ÿ\u0093ø";
      int var19 = "ÄôN\u0080&¨æòÛýî°¢±þx²Í\u001eÿíj\u008c*ãiP\u0015Í\u001dÂ³Ïx\u0016\u000f6á~ï\u0018v\u0098µå¾\u008eü\u001ad\u00049\u0081fmpE@t*ÞðÄ°O S\u0001Y\u0012/\u0011\u0018Ú¯Ölñö\u0005L\u0095ßÕòL~Ã*¦+ß«àCþpN\u0018y\u008bûÍ\u009a©:v¶\u009eRO\u0000y:\u0010k/b\u008b6W\u001bÛ\u0010Tÿ\u0015f\u0094%\u001f¼\u007fÄ\u0011¼\u0094, H\u0010:³F<\u0002Fôó;WPõ|ö\u001bû\u0018½Æ2yá\u009b\"2ù5e BeI\u0084»\u00101Îg`GÉ(\u0019-æ=¿^è@\u000f\u008dC\u0086\u009f±¶ïÂV\tÐ\u0014Ì²V\u0097\u0087a\u000b1£C¡Ú\t\u0005©QjÿÔ \u008dµj\u0011xÐ\føz@C_,´Þ®ím\u008fÙÀ\u009b:\u0098\u008fl¬\u0093$q)2\u0010\u0092¹\u0080ClR5\u0090\u0097.ß\u001eØ\u001e«k\u0018«¤ïrS M8Wà9åó{\t%/ô\f\u001fÇW\nL\u0010\r²@ÃU\u0085!j|kæÍÓ\u0019Â\t(m\u0086m\u0086uPìys\u0019\u0010\u0081ëö.Å©\u0095\u008d\u0089¨úõá\u0012K¯9\u008ey4è¡«}n\u0019\u008f+*(\r|\u0018{\rÐ³^;Î\u0010Îk\u008dð÷\u0095>\u0087¨u\u0096×SDè¶Ôêh\u009cÍá¿¹°ª\u008a\u00ad_\u0018úØ4ÛP\u0082>¿\\\u009asûõ\t2¢\u001d\u001c\fÿÃtH\u0096\u0010\r73#Ì1u\u00181µÓÖ\u0091âF÷(V¿\rj2YËxøß¹Õ_\u0004ø[Ü\u008f³^ÛFE¥î°Oí\u0086\u008a\u0005¨5[à\r}7/ã \u0011ö\u0084\u000f\u0082JYf¹f\u0093\u008dk\u009dª?\u008a\bë\u0017#\u0086£èéßÔ?\u0093ÿ\u0093ø"
         .length();
      char var16 = '(';
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
                     h = new String[20];
                     r = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[9];
                     int var3 = 0;
                     String var4 = ">\u009b)\u001bq\u0019Y\u0010\r®*ÑoB¥\u0080\u001bFºÍ\u0007A÷çO.¦¯\u009dI±\u008d´Ã\u0019Þ+Wz \u0087\u0089V<Ð\u0011h¢e\u0088å\u008bMnì\u001f";
                     int var5 = ">\u009b)\u001bq\u0019Y\u0010\r®*ÑoB¥\u0080\u001bFºÍ\u0007A÷çO.¦¯\u009dI±\u008d´Ã\u0019Þ+Wz \u0087\u0089V<Ð\u0011h¢e\u0088å\u008bMnì\u001f"
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
                                    q = new Integer[9];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "%\u0015ãsíK²î®Ð¤3\u0095sÁ\t";
                                 var5 = "%\u0015ãsíK²î®Ð¤3\u0095sÁ\t".length();
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

                  var17 = "Ìt²Ò1Ób(î@¸\r©Ü8\u008b\u0018@?:\u008b\u009491L-¢à%Iè)`\\\u0005\\_\u009a+5Ö";
                  var19 = "Ìt²Ò1Ób(î@¸\r©Ü8\u008b\u0018@?:\u008b\u009491L-¢à%Iè)`\\\u0005\\_\u009a+5Ö".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7011;
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
            throw new RuntimeException("cc/astralis/der", var10);
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
         throw new RuntimeException("cc/astralis/der" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32639;
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
            throw new RuntimeException("cc/astralis/der", var14);
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
         throw new RuntimeException("cc/astralis/der" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
