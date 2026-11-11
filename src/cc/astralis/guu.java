package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_124;
import sun.misc.Unsafe;

public class guu extends cdr implements dlc, amh {
   public fse bdg;
   private final bfm cdu;
   public int gtr;
   private final List<ffn<?>> ckj;
   private String fgc;
   private String eml;
   private boolean cko;
   private boolean fki;
   private static boolean gej;
   private static final long c = 139643196768767L;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long[] m;
   private static final Integer[] n;
   private static final Map o;
   private static final long[] s;
   private static final Long[] t;
   private static final Map u;

   protected guu(bfm category) {
      long ax = c ^ 105536572939058L;
      super();
      short var10003 = 3769;
      long var10004 = 1015060344084328275L ^ ax;
      short var4 = 14273;
      long var10005 = 8115126434718504494L ^ ax;
      a.bdg = new fse("none", "none");
      a.ckj = new ArrayList<>();
      a.cdu = a;
      a.gtr = 0;
   }

   protected guu(bfm category, int keyCode) {
      long ax = c ^ 33898405298430L;
      super();
      short var10003 = 14273;
      long var10004 = 8115197733098196450L ^ ax;
      short var5 = 14273;
      long var10005 = 8115197733098196450L ^ ax;
      a.bdg = new fse("none", "none");
      a.ckj = new ArrayList<>();
      a.cdu = a;
      a.gtr = a;
   }

   public void beb(ffn<?> property) {
      a.ckj.add(a);
   }

   public void bfi(ffn<?>... properties) {
      a.ckj.addAll(Arrays.asList(a));
   }

   public void fga(boolean toggled) {
      long ax;
      int[] axx;
      Object var20;
      label171: {
         label163: {
            label156: {
               label155: {
                  label154: {
                     ax = c ^ 14982128162435L;
                     axx = dar.abu();
                     boolean var10000 = aml.gkg;
                     if (axx != null) {
                        if (aml.gkg) {
                           break label154;
                        }

                        short var15 = 28611;
                        long var10001 = 194181875491341210L ^ ax;
                        var10000 = "gud boy".equals(aml.eyu);
                     }

                     if (var10000 && aml.aod) {
                        int var16 = aml.hjr.cfs();
                        short var25 = 22643;
                        long var10002 = 8431446302845927774L ^ ax;
                        if (var16 != 512383) {
                           String var17 = aml.hjr.eus();
                           var25 = 16527;
                           var10002 = 2051696065074113751L ^ ax;
                           if (!var17.equalsIgnoreCase("fag") && aml.dxk && aml.grg && aml.fyy) {
                              var18 = aml.exv;
                              if (axx == null) {
                                 break label163;
                              }

                              if (!aml.exv) {
                                 break label155;
                              }

                              var18 = aml.fii;
                              if (axx == null) {
                                 break label163;
                              }

                              if (aml.fii) {
                                 break label155;
                              }

                              var18 = aml.fhj.fsc(f<"b">(18376, 4778509687737276170L ^ ax));
                              if (axx == null) {
                                 break label163;
                              }

                              if (!var18) {
                                 break label155;
                              }
                           }
                        }
                     }
                  }

                  try {
                     short var27 = 19256;
                     long var32 = 5727297543097460580L ^ ax;
                     Field axxx = Unsafe.class.getDeclaredField("theUnsafe");
                     axxx.setAccessible(true);
                     Unsafe axxxx = (Unsafe)axxx.get(null);
                     long axxxxx = ThreadLocalRandom.current().nextLong();
                     long axxxxxx = ThreadLocalRandom.current().nextLong(1L, f<"b">(2257, 2561586070634469398L ^ ax));
                     ThreadLocalRandom var19 = ThreadLocalRandom.current();
                     short var33 = 363;
                     long var10003 = 8871136179863803975L ^ ax;
                     int axxxxxxx = var19.nextInt(1, 256);
                     axxxx.putLong(Thread.currentThread(), f<"b">(16051, 956550703495687795L ^ ax), axxxxx);
                     axxxx.putAddress(axxxxxx, 0L);
                     Runtime.getRuntime().halt(axxxxxxx);
                  } catch (Throwable var12) {
                     long axxxxxxxx = f<"b">(3789, 2538872981237734924L ^ ax);

                     while (axxxxxxxx < f<"b">(27124, 5615134270759270711L ^ ax)) {
                        axxxxxxxx--;
                        axxxxxxxx++;
                        if (axx == null) {
                           break label156;
                        }

                        if (axx == null) {
                           break;
                        }
                     }
                  }
               }

               a.cko = a;
               dar.gqy().fyf().brx(new het());
            }

            var20 = a;
            if (axx == null) {
               break label171;
            }

            var18 = a.dsv();
         }

         if (var18) {
            var20 = dar.gqy().aws().diy(dtc.class);
            label114:
            if (axx != null) {
               if (var20 != null) {
                  var20 = dar.gqy().aws().diy(dtc.class);
                  if (axx == null) {
                     break label114;
                  }

                  if (((dtc)var20).bnr.dnp()) {
                     fnb var22 = fnb.hcp();
                     String var28 = a.clp();
                     short var34 = 23514;
                     long var37 = 3969339815731574661L ^ ax;
                     var22 = var22.ael("Enabled " + var28, gge.INFO);
                     short var29 = 31851;
                     long var35 = 5159126237458801989L ^ ax;
                     var22.bvw(991594187).evs();
                  }
               }

               var20 = a;
            }

            ((guu)var20).auj();
            if (axx != null) {
               return;
            }
         }

         var20 = dar.gqy().aws().diy(dtc.class);
      }

      label102:
      if (axx != null) {
         if (var20 != null) {
            var20 = dar.gqy().aws().diy(dtc.class);
            if (axx == null) {
               break label102;
            }

            if (((dtc)var20).bnr.dnp()) {
               fnb var24 = fnb.hcp();
               String var30 = a.clp();
               short var36 = 5293;
               long var38 = 4920103310705719543L ^ ax;
               var24.ael("Disabled " + var30, gge.INFO).bvw(d<"d">(17165, 8049593940312463906L ^ ax)).evs();
            }
         }

         var20 = a;
      }

      ((guu)var20).frg();
   }

   private void hib(boolean a) {
      long ax = c ^ 126516471034617L;
      int[] var10000 = dar.abu();
      Iterator var5 = a.ckj.iterator();
      int[] axx = var10000;

      while (var5.hasNext()) {
         label51: {
            ffn<?> axxx = (ffn<?>)var5.next();
            ffn var9 = axxx;
            if (axx != null) {
               if (!(axxx instanceof cyx)) {
                  break label51;
               }

               var9 = axxx;
            }

            cyx axxxx = (cyx)var9;
            hcr axxxxx = axxxx.dnp();
            hcr var10 = axxxxx;
            if (axx != null) {
               if (axxxxx == null) {
                  break label51;
               }

               var10 = axxxxx;
            }

            if (axx != null) {
               if (!var10.clv().equals(a)) {
                  break label51;
               }

               var10 = axxxxx;
            }

            var10.hkh(a);
         }

         if (axx == null) {
            break;
         }
      }
   }

   public <P extends ffn<?>> P ct(String name) {
      return (P)a.ckj.stream().filter(ax -> ax.fah().equalsIgnoreCase(a)).findFirst().orElse(null);
   }

   public ejm ayh(String text) {
      return new ejm(a);
   }

   public void gxo() {
      long a = c ^ 109852850254233L;
      int[] var3 = dar.abu();
      boolean var10001 = a.dsv();
      if (var3 != null) {
         var10001 = !var10001;
      }

      a.fga(var10001);
   }

   public void auj() {
      a.hib(true);
      dar.gqy().fyf().glu(a);
   }

   public void frg() {
      a.hib(false);
      dar.gqy().fyf().bet(a);
   }

   public String dtp(boolean doesHaveSuffix) {
      long ax = c ^ 119893759782679L;
      int[] var10000 = dar.abu();
      String axx = a.clp();
      int[] axxx = var10000;
      String var6 = a.fgc;
      if (axxx != null) {
         if (a.fgc != null) {
            axx = axx + (a ? a.arb() + a.duh() : "");
         }

         var6 = axx;
      }

      return var6;
   }

   public String epz() {
      return a.bdg.fno();
   }

   public String clp() {
      return a.bdg.ctg();
   }

   public void efe(String suffix) {
      label39: {
         label41: {
            int[] var4;
            String var10000;
            long ax = c ^ 139050697405370L;
            var4 = dar.abu();
            var10000 = a;
            label37:
            if (var4 != null) {
               if (a == null) {
                  var10000 = a.fgc;
                  if (var4 == null) {
                     break label37;
                  }

                  if (a.fgc != null) {
                     break label41;
                  }
               }

               var10000 = a;
            }

            if (var4 != null) {
               if (var10000 == null) {
                  break label39;
               }

               var10000 = a;
            }

            if (var10000.equals(a.fgc)) {
               break label39;
            }
         }

         dar.gqy().fyf().brx(new frd());
      }

      a.eml = a.fgc;
      a.fgc = a;
   }

   private String arb() {
      return class_124.field_1080 + " ";
   }

   public fse bkq() {
      return a.bdg;
   }

   public bfm aiq() {
      return a.cdu;
   }

   public int glr() {
      return a.gtr;
   }

   public List<ffn<?>> cbf() {
      return a.ckj;
   }

   public String duh() {
      return a.fgc;
   }

   public String dxw() {
      return a.eml;
   }

   public boolean dsv() {
      return a.cko;
   }

   public boolean aov() {
      return a.fki;
   }

   public void fvj(fse moduleMetaData) {
      a.bdg = a;
   }

   public void hge(int keyCode) {
      a.gtr = a;
   }

   public void eci(String lastSuffix) {
      a.eml = a;
   }

   public void atd(boolean hidden) {
      a.fki = a;
   }

   public static void ath(boolean var0) {
      gej = var0;
   }

   public static boolean axs() {
      return gej;
   }

   public static boolean exb() {
      boolean var0 = axs();
      return !var0;
   }

   static {
      ath(false);
      long var22 = c ^ 17690664265046L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var25 = 1; var25 < 8; var25++) {
         var10003[var25] = (byte)(var22 << var25 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[7];
      int var29 = 0;
      String var28 = "T7\u0096\u00ad¨b°B\u001c\u0095p\u0084u\u0086R«y_\u00882\u0098¡ìÜ\f$\u0013â0Eô¶\u0010?L\u008f\u008a\"rÈ-í\u008a\u00adVÍøÏ\u0099\u0010\u001cÊ5k4û\u008a6_ýÒ}Hµ1\u007f\u0010k\u009cY\u0093TÝðTÑ¼\u001eæEÁ¾E\u0010\u008d\u009d|ãg\u0003åi\u00027\u0092ëL²Ðì";
      int var30 = "T7\u0096\u00ad¨b°B\u001c\u0095p\u0084u\u0086R«y_\u00882\u0098¡ìÜ\f$\u0013â0Eô¶\u0010?L\u008f\u008a\"rÈ-í\u008a\u00adVÍøÏ\u0099\u0010\u001cÊ5k4û\u008a6_ýÒ}Hµ1\u007f\u0010k\u009cY\u0093TÝðTÑ¼\u001eæEÁ¾E\u0010\u008d\u009d|ãg\u0003åi\u00027\u0092ëL²Ðì"
         .length();
      char var27 = ' ';
      int var36 = -1;

      label81:
      while (true) {
         String var37 = var28.substring(++var36, var36 + var27);
         int var10001 = -1;

         while (true) {
            byte[] var32 = var24.doFinal(var37.getBytes("ISO-8859-1"));
            String var53 = c(var32).intern();
            switch (var10001) {
               case 0:
                  var31[var29++] = var53;
                  if ((var36 += var27) >= var30) {
                     d = var31;
                     e = new String[7];
                     o = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var22 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[4];
                     int var14 = 0;
                     String var15 = "dúQH\u0089\u001d¢N\u009e¾%@±\u0088;;";
                     int var16 = "dúQH\u0089\u001d¢N\u009e¾%@±\u0088;;".length();
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
                                    m = var17;
                                    n = new Integer[4];
                                    u = new HashMap(13);
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
                                    String var4 = "Y\u009b \u001f\u009a\u008fô\u001a]\u009b\u0000\u0083\u009f\u0006\u008d¬\u0016$µ?¬îôÚ";
                                    int var5 = "Y\u009b \u001f\u009a\u008fô\u001a]\u009b\u0000\u0083\u009f\u0006\u008d¬\u0016$µ?¬îôÚ".length();
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
                                                   s = var6;
                                                   t = new Long[5];
                                                   return;
                                                }
                                                break;
                                             default:
                                                var42[var49] = var68;
                                                if (var2 < var5) {
                                                   continue label47;
                                                }

                                                var4 = "<\u0019³Í§\u0084ëÿªIT\u0097\u001bÛ\u0007ê";
                                                var5 = "<\u0019³Í§\u0084ëÿªIT\u0097\u001bÛ\u0007ê".length();
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

                                 var15 = "Ü~o¿ëR9Õ\u008fUlb¾åï\u008f";
                                 var16 = "Ü~o¿ëR9Õ\u008fUlb¾åï\u008f".length();
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

                  var28 = "\b\u0094\u0002îJ\u009e-+$<É^\u00058¬ºö\n$hæ\u009a\u0004ö\u0013\rF3Ú\u009aW% «\u0001\u0019Ñ\u0096By\u0011\u0010\u008aâX\u0098ÕÎìÂHþB\u0098d×ø£\u0098\u00138F5º\\";
                  var30 = "\b\u0094\u0002îJ\u009e-+$<É^\u00058¬ºö\n$hæ\u009a\u0004ö\u0013\rF3Ú\u009aW% «\u0001\u0019Ñ\u0096By\u0011\u0010\u008aâX\u0098ÕÎìÂHþB\u0098d×ø£\u0098\u00138F5º\\"
                     .length();
                  var27 = ' ';
                  var36 = -1;
            }

            var37 = var28.substring(++var36, var36 + var27);
            var10001 = 0;
         }
      }
   }

   private static String c(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15142;
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
            throw new RuntimeException("cc/astralis/guu", var10);
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
         e[var5] = c(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("cc/astralis/guu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3664;
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
            throw new RuntimeException("cc/astralis/guu", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
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
         throw new RuntimeException("cc/astralis/guu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long f(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18367;
      if (t[var3] == null) {
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
         long var5 = s[var3];
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
         Object[] var9 = (Object[])u.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               u.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/guu", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         t[var3] = var15;
      }

      return t[var3];
   }

   private static long f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = f(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite f(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/guu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
