package cc.astralis;

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
import net.minecraft.class_1268;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2846;
import net.minecraft.class_2885;
import net.minecraft.class_3965;
import net.minecraft.class_2846.class_2847;

public class cdo extends guu {
   private final bes cyb;
   private final bes dqr;
   private final bes bot;
   private final bes hhp;
   private final adu cna;
   private final adu cdx;
   private final adu cfs;
   private final adu djx;
   public dgz axl;
   private int bb;
   private boolean cbc;
   private static final long a = 96358731938859L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;

   public cdo() {
      long a = cdo.a ^ 138637625847497L;
      super(bfm.MOVEMENT);
      short var10003 = 3803;
      long var10004 = 6267486136414697718L ^ a;
      a.cyb = new bes("Sword Slow Down", 1.0F, 0.0F, 1.0F, 0.1F);
      var10003 = 12524;
      var10004 = 8215632664320558813L ^ a;
      a.dqr = new bes("Food Slow Down", 1.0F, 0.0F, 1.0F, 0.1F);
      var10003 = 21499;
      var10004 = 2782855184870876615L ^ a;
      a.bot = new bes("Potion Slow Down", 1.0F, 0.0F, 1.0F, 0.1F);
      var10003 = 30661;
      var10004 = 644654896559161842L ^ a;
      a.hhp = new bes("Bow Slow Down", 1.0F, 0.0F, 1.0F, 0.1F);
      var10003 = 19724;
      var10004 = 2818260313785645877L ^ a;
      short var17 = 21622;
      long var10005 = 2403615018414285401L ^ a;
      short var26 = 31879;
      long var10006 = 380465023115508883L ^ a;
      String[] var27 = new String[6];
      short var10008 = 17610;
      long var10009 = 7814069474392290046L ^ a;
      var27[0] = "Vanilla";
      var10008 = 22616;
      var10009 = 1230789603910168160L ^ a;
      var27[1] = "Watchdog";
      var10008 = 31490;
      var10009 = 1910881018891537721L ^ a;
      var27[2] = "Old Watchdog";
      var10008 = 16775;
      var10009 = 2453581343718913976L ^ a;
      var27[3] = "No Cheat Plus";
      var10008 = 32711;
      var10009 = 3263373070103022073L ^ a;
      var27[4] = "Old Intave";
      var10008 = 9044;
      var10009 = 108810655704208750L ^ a;
      var27[5] = "Intave";
      a.cna = new adu("Sword Method", "Vanilla", var27);
      var10003 = 22568;
      var10004 = 7771874118648278552L ^ a;
      short var19 = 17610;
      var10005 = 7814069474392290046L ^ a;
      short var29 = 6144;
      var10006 = 4561190852717795345L ^ a;
      String[] var30 = new String[6];
      var10008 = 17610;
      var10009 = 7814069474392290046L ^ a;
      var30[0] = "Vanilla";
      var10008 = 22616;
      var10009 = 1230789603910168160L ^ a;
      var30[1] = "Watchdog";
      var10008 = 31490;
      var10009 = 1910881018891537721L ^ a;
      var30[2] = "Old Watchdog";
      var10008 = 3788;
      var10009 = 5935845792980236537L ^ a;
      var30[3] = "No Cheat Plus";
      var10008 = 22327;
      var10009 = 6195165464779039003L ^ a;
      var30[4] = "Old Intave";
      var10008 = 9044;
      var10009 = 108810655704208750L ^ a;
      var30[5] = "Intave";
      a.cdx = new adu("Food Method", "Vanilla", var30);
      var10003 = 21953;
      var10004 = 6547438826432570359L ^ a;
      short var21 = 17610;
      var10005 = 7814069474392290046L ^ a;
      String[] var32 = new String[5];
      var10008 = 17610;
      var10009 = 7814069474392290046L ^ a;
      var32[0] = "Vanilla";
      var10008 = 22616;
      var10009 = 1230789603910168160L ^ a;
      var32[1] = "Watchdog";
      var10008 = 31490;
      var10009 = 1910881018891537721L ^ a;
      var32[2] = "Old Watchdog";
      var10008 = 3788;
      var10009 = 5935845792980236537L ^ a;
      var32[3] = "No Cheat Plus";
      var10008 = 22327;
      var10009 = 6195165464779039003L ^ a;
      var32[4] = "Old Intave";
      a.cfs = new adu("Potion Method", "Vanilla", var32);
      var10003 = 21221;
      var10004 = 410947605026022616L ^ a;
      short var23 = 17610;
      var10005 = 7814069474392290046L ^ a;
      short var34 = 6144;
      var10006 = 4561190852717795345L ^ a;
      String[] var35 = new String[6];
      var10008 = 17610;
      var10009 = 7814069474392290046L ^ a;
      var35[0] = "Vanilla";
      var10008 = 22616;
      var10009 = 1230789603910168160L ^ a;
      var35[1] = "Watchdog";
      var10008 = 31490;
      var10009 = 1910881018891537721L ^ a;
      var35[2] = "Old Watchdog";
      var10008 = 3788;
      var10009 = 5935845792980236537L ^ a;
      var35[3] = "No Cheat Plus";
      var10008 = 22327;
      var10009 = 6195165464779039003L ^ a;
      var35[4] = "Old Intave";
      var10008 = 9044;
      var10009 = 108810655704208750L ^ a;
      var35[5] = "Intave";
      a.djx = new adu("Bow Method", "Vanilla", var35);
      a.cbc = false;
      short var10001 = 15372;
      long var10002 = 8888174062860172316L ^ a;
      ffn[] var3 = new ffn[]{a.cyb, a.dqr, a.bot, a.hhp, a.cna, a.cdx, null, null};
      var10003 = 6144;
      var10004 = 4561190852717795345L ^ a;
      var3[6] = a.cfs;
      var10003 = 6753;
      var10004 = 2893631398828235379L ^ a;
      var3[7] = a.djx;
      a.bfi(var3);
   }

   @gdz
   public void aqo(eih event) {
      long ax = cdo.a ^ 54001334320275L;
      int[] var10000 = dar.abu();
      bhw axx = dar.gqy().ccv().gne(bhw.class);
      int[] axxx = var10000;
      int var8 = chi.field_1724.method_6115();
      if (axxx != null) {
         if (var8 == 0) {
            short var10003 = 31391;
            long var10004 = 698752042421067500L ^ ax;
            a.axl = new dgz("none", 1.0F);
            a.bb = 0;
            if (axxx != null) {
               if (!a.cbc) {
                  axx.fxn();
                  a.cbc = true;
               }

               short var15 = 13049;
               long var22 = 8255025353184040587L ^ ax;
               gxk.dfh("use");
            }

            return;
         }

         var8 = chi.field_1724.method_6115();
      }

      label197: {
         label196: {
            if (axxx != null) {
               if (var8 == 0) {
                  break label196;
               }

               var8 = chi.field_1724.method_6014();
            }

            if (var8 > 0) {
               a.bb++;
               if (axxx != null) {
                  break label197;
               }
            }
         }

         a.bb = 0;
      }

      switch (fpa.bxv[chi.field_1724.method_6030().method_7976().ordinal()]) {
         case 1:
            a.axl = new dgz(a.cna.dnp(), a.cyb.dnp().floatValue());
            if (axxx != null) {
               break;
            }
         case 2:
            a.axl = new dgz(a.djx.dnp(), a.hhp.dnp().floatValue());
            if (axxx != null) {
               break;
            }
         case 3:
            a.axl = new dgz(a.cdx.dnp(), a.dqr.dnp().floatValue());
            if (axxx != null) {
               break;
            }
         case 4:
            a.axl = new dgz(a.cfs.dnp(), a.bot.dnp().floatValue());
      }

      String var6 = a.axl.fnn();
      byte var7 = -1;
      var9 = var6.hashCode();
      label180:
      if (axxx != null) {
         switch (var9) {
            case 609795629:
               short var10001 = 9939;
               long var10002 = 3477962412118033058L ^ ax;
               var9 = var6.equals("Watchdog");
               if (axxx == null) {
                  break label180;
               }

               if (var9 == 0) {
                  break;
               }

               var7 = 0;
               if (axxx != null) {
                  break;
               }
            case 1239695398:
               short var16 = 7159;
               long var23 = 8934748476034678686L ^ ax;
               var9 = var6.equals("Old Watchdog");
               if (axxx == null) {
                  break label180;
               }

               if (var9 == 0) {
                  break;
               }

               var7 = 1;
               if (axxx != null) {
                  break;
               }
            case -2099899231:
               short var17 = 16402;
               long var24 = 6159235864915747962L ^ ax;
               var9 = var6.equals("Intave");
               if (axxx == null) {
                  break label180;
               }

               if (var9 != 0) {
                  var7 = 2;
               }
         }

         var9 = var7;
      }

      label160: {
         label208: {
            if (axxx != null) {
               switch (var9) {
                  case 0:
                     var9 = a.bb;
                     break;
                  case 1:
                     break label208;
                  case 2:
                     break label160;
                  default:
                     return;
               }
            }

            if (axxx != null) {
               short var18 = 30873;
               long var25 = 6456385151241464534L ^ ax;
               label149:
               if (var9 > 12) {
                  label147: {
                     bhw var10 = axx;
                     if (axxx != null) {
                        if (axx.bsw()) {
                           break label147;
                        }

                        var10 = axx;
                     }

                     var10.ckv();
                     short var11 = 10440;
                     long var19 = 4836100097701104824L ^ ax;
                     gxk.fcv("use");
                     a.cbc = false;
                     if (axxx != null) {
                        break label149;
                     }
                  }

                  short var12 = 10440;
                  long var20 = 4836100097701104824L ^ ax;
                  gxk.gbu("use", a.bb / 30.0F);
               }

               var9 = a.cbc;
            }

            if (axxx != null) {
               if (var9 != 0) {
                  return;
               }

               var9 = chi.field_1724.method_6014();
            }

            label205: {
               if (axxx != null) {
                  if (var9 >= 0) {
                     return;
                  }

                  var13 = axx;
                  if (axxx == null) {
                     break label205;
                  }

                  var9 = axx.bsw();
               }

               if (var9 == 0) {
                  return;
               }

               var13 = axx;
            }

            var13.fxn();
            short var14 = 10440;
            long var21 = 4836100097701104824L ^ ax;
            gxk.dfh("use");
            a.cbc = true;
            if (axxx != null) {
               return;
            }
         }

         gix.avn(
            axxxx -> new class_2885(
               class_1268.field_5808,
               new class_3965(
                  class_243.field_1353,
                  class_2350.field_11036,
                  new class_2338(class_2338.field_11176.method_10263(), class_2338.field_11176.method_10264(), class_2338.field_11176.method_10260()),
                  false
               ),
               axxxx
            )
         );
         if (axxx != null) {
            return;
         }
      }

      gix.dsd(new class_2846(class_2847.field_12974, class_2338.field_10980, class_2350.field_11036));
   }

   @gdz
   public void cpz(fnt event) {
      long ax = cdo.a ^ 135973568216283L;
      if (a.cud() != gpy.POST) {
         String var10000 = a.axl.fnn();
         short var10001 = 22616;
         long var10002 = 1230785767325088882L ^ ax;
         if (var10000.equals("Watchdog")) {
            return;
         }
      }
   }

   @gdz
   public void ggk(amo event) {
   }

   @gdz
   public void cff(fyx event) {
      long ax = cdo.a ^ 91579069438112L;
      int[] var4 = dar.abu();
      String var10000 = a.cdx.dnp();
      short var10001 = 22616;
      long var10002 = 1230760068016297993L ^ ax;
      int var5 = var10000.equals("Watchdog");
      if (var4 != null) {
         if (var5 == 0) {
            return;
         }

         var5 = a.bb;
      }

      if (var4 != null) {
         var10001 = 12728;
         var10002 = 1851194449450928066L ^ ax;
         if (var5 <= 12) {
            return;
         }

         var5 = chi.field_1724.method_6115();
      }

      if (var5 != 0) {
         a.gmm(true);
         a.hfr(a.axl.eqf());
      }
   }

   static {
      long var11 = a ^ 50657381293356L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[23];
      int var18 = 0;
      String var17 = "\u008d\u000b\u0003¤2»ÝË\u0010=Dº5\u008b¡(]Æö4î5ÀÊ \u0017¿Ì®\u0093Þ\u0014.ànÑ\u0093³l\u0080\u0099H\u0085\u00957Ü\u008c\u0001\u009f\u0093\u000b$ÿoV\u001b\u009c\u0018[Ñ\u008d¯\u0007àFQ¡\u000b#Ueaç\u0081\u0084d¬¸èUhP\u0010²$@?Òÿ³VñÛÑi÷©%\u0089\u0018ÖâF\u008d£\u008fLh¬RJâ\u0010Ö,:wk\u0081\u000f8\u0013ìO(h\u00ad`\u0093jî\u0098âóßV=\u008d'$kg\u000bæG¶\"Z£-R\u001dÀ\u0086¸v\u0011\u001a@»LhTx\u0085\u0018¿e¬s\u001c\u000e.%^íîÿÈ´ôQW«»¿\ny\u0001i\u0018\rRø9·\u00929\bÒ}¶çý\u0003Ü\u001e\u0095\u008c,è\u0082\u0083\b\u001d \u0013Ê*\u009e§\u009e!yÜwÑ`yìf\u0099Oôôo\u0084 !©Ã÷äêeÕ\u0005\u0016\u0018þ\u0006¡AEº\u009fõÄ·:GÄéT@îCÍ.`3\u0005a\u00186ìë\u0004Î\tÂÊPÝ\u0087^ÓüÁ\u0084\u008bW\u0003´£®\u001fÂ\u0010Ù\u0092\u0013ÞÈDqM¶\rCÄ\u0083¶Õ½ \fë»êX³\u0019ò´IFF¸áË©;U¦5ZOÈöÃ¯åì¿\u001cçr\u0010/\u009bÊ\u0098WFZMaO[\u0014\u0087ÙC¼ \u000bÅªq_\u000f¼ë¨WÐi1æG·õÓX2\u0018\\ä\u0013U\u000f\u000fÒôkDÆ f»0\u0098A¥(-=Y\u0099ã$i%pnIõ\u0013\u001adá'Q\u0091\u008aRÛ\u0099À\u0099\u0010Ã\u0090\u009c\u001cÁ_\u008ca\u0088äªp\u0083lX\u008b\u0010ÿw^F¨¦ Tü»\u009a\u001aâGü» ÎMv\u009f5fi½ý{M«9P>ï3=i2#\u0019C©âÏxø>\u0010Cé\u0010[\u0082Îj´ÍH@\u008aÀ:\u0011¾e\u001a\t\u0018\u008cw²gCd\nVÑ[\u000e#ð\u0011\u0088öKr~\u00934\u008a\u0090}";
      int var19 = "\u008d\u000b\u0003¤2»ÝË\u0010=Dº5\u008b¡(]Æö4î5ÀÊ \u0017¿Ì®\u0093Þ\u0014.ànÑ\u0093³l\u0080\u0099H\u0085\u00957Ü\u008c\u0001\u009f\u0093\u000b$ÿoV\u001b\u009c\u0018[Ñ\u008d¯\u0007àFQ¡\u000b#Ueaç\u0081\u0084d¬¸èUhP\u0010²$@?Òÿ³VñÛÑi÷©%\u0089\u0018ÖâF\u008d£\u008fLh¬RJâ\u0010Ö,:wk\u0081\u000f8\u0013ìO(h\u00ad`\u0093jî\u0098âóßV=\u008d'$kg\u000bæG¶\"Z£-R\u001dÀ\u0086¸v\u0011\u001a@»LhTx\u0085\u0018¿e¬s\u001c\u000e.%^íîÿÈ´ôQW«»¿\ny\u0001i\u0018\rRø9·\u00929\bÒ}¶çý\u0003Ü\u001e\u0095\u008c,è\u0082\u0083\b\u001d \u0013Ê*\u009e§\u009e!yÜwÑ`yìf\u0099Oôôo\u0084 !©Ã÷äêeÕ\u0005\u0016\u0018þ\u0006¡AEº\u009fõÄ·:GÄéT@îCÍ.`3\u0005a\u00186ìë\u0004Î\tÂÊPÝ\u0087^ÓüÁ\u0084\u008bW\u0003´£®\u001fÂ\u0010Ù\u0092\u0013ÞÈDqM¶\rCÄ\u0083¶Õ½ \fë»êX³\u0019ò´IFF¸áË©;U¦5ZOÈöÃ¯åì¿\u001cçr\u0010/\u009bÊ\u0098WFZMaO[\u0014\u0087ÙC¼ \u000bÅªq_\u000f¼ë¨WÐi1æG·õÓX2\u0018\\ä\u0013U\u000f\u000fÒôkDÆ f»0\u0098A¥(-=Y\u0099ã$i%pnIõ\u0013\u001adá'Q\u0091\u008aRÛ\u0099À\u0099\u0010Ã\u0090\u009c\u001cÁ_\u008ca\u0088äªp\u0083lX\u008b\u0010ÿw^F¨¦ Tü»\u009a\u001aâGü» ÎMv\u009f5fi½ý{M«9P>ï3=i2#\u0019C©âÏxø>\u0010Cé\u0010[\u0082Îj´ÍH@\u008aÀ:\u0011¾e\u001a\t\u0018\u008cw²gCd\nVÑ[\u000e#ð\u0011\u0088öKr~\u00934\u008a\u0090}"
         .length();
      char var16 = 24;
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
                     h = new String[23];
                     r = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "<Úº\u008a¤I9^¾§\u0094\u007fîe\u0003u6ÂÏ\u0016z\u0082êC¥:\u009f°3#5x";
                     int var5 = "<Úº\u008a¤I9^¾§\u0094\u007fîe\u0003u6ÂÏ\u0016z\u0082êC¥:\u009f°3#5x".length();
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
                                    q = new Integer[6];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u0097Ë\"\rS¹\u0083\u00adLJj<\u0086A\u0004±";
                                 var5 = "\u0097Ë\"\rS¹\u0083\u00adLJj<\u0086A\u0004±".length();
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

                  var17 = "Tb\u0001\u008d|ð¬ÜÇX\u008c\u008dÜ¾»c·iÐ\u001e¡Ö¿\u001b\u0010Qe-\u008b]*;>®j00ú¡!å";
                  var19 = "Tb\u0001\u008d|ð¬ÜÇX\u008c\u008dÜ¾»c·iÐ\u001e¡Ö¿\u001b\u0010Qe-\u008b]*;>®j00ú¡!å".length();
                  var16 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25819;
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
            throw new RuntimeException("cc/astralis/cdo", var10);
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
         throw new RuntimeException("cc/astralis/cdo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21235;
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
            throw new RuntimeException("cc/astralis/cdo", var14);
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
         throw new RuntimeException("cc/astralis/cdo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
