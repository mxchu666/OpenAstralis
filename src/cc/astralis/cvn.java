package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import sun.misc.Unsafe;

public class cvn extends fsa<Integer, Class<? extends cdw>> implements ge {
   private static int[] ec;
   private static final String[] a;
   private static final long[] b;
   private static final Long[] c;
   private static final long d = 36251306216249L;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;
   private static final long[] l;
   private static final Long[] m;
   private static final Map n;

   public cvn() {
      long a = d ^ 98905952416500L;
      long ax = c<"v">(19349, 544520381941361134L ^ a);
      super();
      int[] var10000 = dar.abu();
      brc.ahk();
      short var10003 = 18886;
      long var10004 = 5045541070615934282L ^ a;
      Class[] var7 = new Class[]{gjp.class, dve.class, dsk.class, aki.class, gqi.class, cse.class, null, null, null, null, null, null, null, null};
      short var10005 = 2632;
      long var10006 = 856296222820546262L ^ a;
      var7[6] = fvh.class;
      var10005 = 29378;
      var10006 = 8360773472745967170L ^ a;
      var7[7] = gyn.class;
      var10005 = 12845;
      var10006 = 425121692908424874L ^ a;
      var7[8] = bcy.class;
      var10005 = 7783;
      var10006 = 1747089717480563429L ^ a;
      var7[9] = fxc.class;
      var10005 = 23961;
      var10006 = 4443211161536815383L ^ a;
      var7[10] = dnu.class;
      var10005 = 15853;
      var10006 = 4144016421779276132L ^ a;
      var7[11] = hhm.class;
      var10005 = 8536;
      var10006 = 2514920763072454090L ^ a;
      var7[12] = egf.class;
      var10005 = 30771;
      var10006 = 6022125863011435687L ^ a;
      var7[13] = dfg.class;
      a.afa(var7);
      int[] axx = var10000;
      if (axx != null && cdr.haa() == null) {
         brc.edo(new int[2]);
      }
   }

   @SafeVarargs
   private void afa(Class<? extends brc>... a) {
      long ax = d ^ 3759959860392L;
      int[] var10000 = dar.abu();
      long axx = c<"v">(18566, 911655437649362083L ^ ax);
      int[] axxx = var10000;
      Class[] var8 = a;
      int var9 = a.length;
      var10000 = brc.ahk();
      int var10 = 0;
      int[] axxxx = var10000;

      while (var10 < var9) {
         Class<? extends brc> axxxxx = var8[var10];

         label55: {
            label54: {
               try {
                  brc axxxxxx = axxxxx.getDeclaredConstructor().newInstance();
                  int axxxxxxx = axxxxxx.ddh();
                  a.ctx(axxxxxxx, axxxxx);
               } catch (Exception var22) {
                  String[] var20 = cvn.a;
                  dar.ecj.error(var20[1]);

                  try {
                     Field axxxxxxxx = Unsafe.class.getDeclaredField(var20[0]);
                     axxxxxxxx.setAccessible(true);
                     Unsafe axxxxxxxxx = (Unsafe)axxxxxxxx.get(null);
                     long axxxxxxxxxx = ThreadLocalRandom.current().nextLong();
                     ThreadLocalRandom var29 = ThreadLocalRandom.current();
                     short var33 = 20666;
                     long var10003 = 1246658676031060548L ^ ax;
                     long axxxxxxxxxxx = var29.nextLong(1L, a(10167, c<"v">(15712, 6524898370152778051L ^ ax) ^ axx));
                     ThreadLocalRandom var30 = ThreadLocalRandom.current();
                     var33 = 10776;
                     var10003 = 2036899811895541969L ^ ax;
                     int axxxxxxxxxxxx = var30.nextInt(1, 256);
                     Thread var32 = Thread.currentThread();
                     var33 = 24919;
                     var10003 = 237418433026968452L ^ ax;
                     axxxxxxxxx.putLong(var32, a(26982, c<"v">(5966, 8091259915459617647L ^ ax) ^ axx), axxxxxxxxxx);
                     axxxxxxxxx.putAddress(axxxxxxxxxxx, 0L);
                     Runtime.getRuntime().halt(axxxxxxxxxxxx);
                  } catch (Throwable var21) {
                     short var27 = 20513;
                     long var10001 = 6372527568497048299L ^ ax;
                     long axxxxxxxxxxxxx = a(7784, c<"v">(1279, 6396469923412603099L ^ ax) ^ axx);

                     label49:
                     while (true) {
                        short var31 = 7070;
                        long var10002 = 2040743337652269383L ^ ax;
                        if (axxxxxxxxxxxxx >= a(12343, c<"v">(1786, 2085895383827411664L ^ ax) ^ axx)) {
                           break;
                        }

                        axxxxxxxxxxxxx--;
                        axxxxxxxxxxxxx++;

                        while (true) {
                           var10000 = axxxx;
                           if (axxx == null) {
                              break label55;
                           }

                           if (axxxx == null) {
                              break label54;
                           }

                           if (axxxx != null) {
                              break;
                           }

                           if (axxx != null) {
                              break label49;
                           }
                        }
                     }
                  }
               }

               var10++;
            }

            var10000 = axxxx;
         }

         if (var10000 == null) {
            break;
         }
      }
   }

   @Override
   public cdw bec(int id) throws Exception {
      long ax = d ^ 70148976480479L;
      int[] var10000 = dar.abu();
      long axx = c<"v">(2488, 6076770207357602276L ^ ax);
      int[] axxx = var10000;
      Class<? extends cdw> axxxx = a.eyd(a);
      var10000 = (int[])axxxx;
      if (axxx != null) {
         if (axxxx == null) {
            throw new IllegalArgumentException(cvn.a[2] + a);
         }

         var10000 = (int[])axxxx.getDeclaredConstructor().newInstance();
      }

      return (cdw)var10000;
   }

   public static void ckk(int[] var0) {
      ec = var0;
   }

   public static int[] grk() {
      return ec;
   }

   static {
      long var31 = d ^ 78420285100663L;
      Cipher var23;
      Cipher var10000 = var23 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var24 = 1; var24 < 8; var24++) {
         var10003[var24] = (byte)(var31 << var24 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var22 = new String[5];
      int var28 = 0;
      String var27 = "ê¿°y\\u\u009døx·Ô\u008fàÇ\b\u001cs\u0019\u0003Í\u001a\u0091Ê-\u0001ÁcÂyL1ÏÚñ\u001b\u00ad~k¨j\u0010è\u0086ýÀ\u0011áé\u0011ú\u001cÔÖÔÖ?' Cz½?Ð\u0010Õu\u001b8V¦\u009fiÍM«À?w¦lÍ4æð@cY©ÎZ";
      int var29 = "ê¿°y\\u\u009døx·Ô\u008fàÇ\b\u001cs\u0019\u0003Í\u001a\u0091Ê-\u0001ÁcÂyL1ÏÚñ\u001b\u00ad~k¨j\u0010è\u0086ýÀ\u0011áé\u0011ú\u001cÔÖÔÖ?' Cz½?Ð\u0010Õu\u001b8V¦\u009fiÍM«À?w¦lÍ4æð@cY©ÎZ"
         .length();
      char var26 = '(';
      int var50 = -1;

      label111:
      while (true) {
         String var53 = var27.substring(++var50, var50 + var26);
         int var10001 = -1;

         while (true) {
            byte[] var30 = var23.doFinal(var53.getBytes("ISO-8859-1"));
            String var79 = a(var30).intern();
            switch (var10001) {
               case 0:
                  var22[var28++] = var79;
                  if ((var50 += var26) >= var29) {
                     h = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[38];
                     int var14 = 0;
                     String var15 = "Aâñ\u0089\u0088t\u009cHb#õàüÐ§ÿk\\>¨\u008e\u007fYÿ\t\u009a\"t9Ö\u001aúiÑ¬\u008d\u009f?\u0095}\u009d%\u0081Ìp:³ÆT6Ûó~\u0090^'p¤ª¤õ²\u0016+Y<\u0007\u001b{z´Uy\u008bË\u0006j¿\\\u0082°¹\u001aÁ7ïê\u0018¨Ñ«B<lËt\u008cÛ¾\u0013£«O\u0013¶\u001bî\u0084â¿\u0016õ&\u009f¡qM>\u008b\u001c\u0012þ\u009c\u009d&AªQ5HY\u0019\u0095SÄ`Çc\u0005Ç_§\u0005:\u001aÓìÉ\u0004fBÕü,EÞýÉ\u0081uUM5\u0011Û¡{\u0014>4<S7M2É¾Ì÷ñ\u0007«\u0019}:9 Ý`¼ºMôMm\u0089Óx9æ²$\u0011ÙòídÈB\u0012\b\u0001Îº÷gÇt+ôý&`r\u0018\"§hêR8\u000e\u0005ý½\u0010KR\u008cIº\u0099vÚ¶\u0089ì\u0087°÷A\u008dê\u009c\fÄ\u001b\u009c¢\u0095\u009dô\u0087\u0093zÇ~ ön[A¬ÑÞ\u0002À\u009d\u0086èj_æ¬ÊÂ\u00adM";
                     int var16 = "Aâñ\u0089\u0088t\u009cHb#õàüÐ§ÿk\\>¨\u008e\u007fYÿ\t\u009a\"t9Ö\u001aúiÑ¬\u008d\u009f?\u0095}\u009d%\u0081Ìp:³ÆT6Ûó~\u0090^'p¤ª¤õ²\u0016+Y<\u0007\u001b{z´Uy\u008bË\u0006j¿\\\u0082°¹\u001aÁ7ïê\u0018¨Ñ«B<lËt\u008cÛ¾\u0013£«O\u0013¶\u001bî\u0084â¿\u0016õ&\u009f¡qM>\u008b\u001c\u0012þ\u009c\u009d&AªQ5HY\u0019\u0095SÄ`Çc\u0005Ç_§\u0005:\u001aÓìÉ\u0004fBÕü,EÞýÉ\u0081uUM5\u0011Û¡{\u0014>4<S7M2É¾Ì÷ñ\u0007«\u0019}:9 Ý`¼ºMôMm\u0089Óx9æ²$\u0011ÙòídÈB\u0012\b\u0001Îº÷gÇt+ôý&`r\u0018\"§hêR8\u000e\u0005ý½\u0010KR\u008cIº\u0099vÚ¶\u0089ì\u0087°÷A\u008dê\u009c\fÄ\u001b\u009c¢\u0095\u009dô\u0087\u0093zÇ~ ön[A¬ÑÞ\u0002À\u009d\u0086èj_æ¬ÊÂ\u00adM"
                        .length();
                     byte var13 = 0;

                     label93:
                     while (true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var56 = var17;
                        var10001 = var14++;
                        long var83 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte var110 = -1;

                        while (true) {
                           long var19 = var83;
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
                           long var131 = (var21[0] & 255L) << 56
                              | (var21[1] & 255L) << 48
                              | (var21[2] & 255L) << 40
                              | (var21[3] & 255L) << 32
                              | (var21[4] & 255L) << 24
                              | (var21[5] & 255L) << 16
                              | (var21[6] & 255L) << 8
                              | var21[7] & 255L;
                           switch (var110) {
                              case 0:
                                 var56[var10001] = var131;
                                 if (var13 >= var16) {
                                    f = var17;
                                    g = new Integer[38];
                                    n = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var31 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[10];
                                    int var3 = 0;
                                    String var4 = "íAW\u001c\u0015°Ó\t(½¹ð\u0080åá§3\u0004¤Gm\u0089¦Þ\u0097¨·\u0099æ¡¡;8 2®\u0017\u0089v\u0015]\u0086ZÞ\u0018&ýåe{\u0098úe\u0082Î\u0087\\P\u0086\u0088\u001eº5¼";
                                    int var5 = "íAW\u001c\u0015°Ó\t(½¹ð\u0080åá§3\u0004¤Gm\u0089¦Þ\u0097¨·\u0099æ¡¡;8 2®\u0017\u0089v\u0015]\u0086ZÞ\u0018&ýåe{\u0098úe\u0082Î\u0087\\P\u0086\u0088\u001eº5¼"
                                       .length();
                                    byte var2 = 0;

                                    label77:
                                    while (true) {
                                       int var68 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var68, var2).getBytes("ISO-8859-1");
                                       long[] var58 = var6;
                                       var68 = var3++;
                                       long var86 = (var7[0] & 255L) << 56
                                          | (var7[1] & 255L) << 48
                                          | (var7[2] & 255L) << 40
                                          | (var7[3] & 255L) << 32
                                          | (var7[4] & 255L) << 24
                                          | (var7[5] & 255L) << 16
                                          | (var7[6] & 255L) << 8
                                          | var7[7] & 255L;
                                       byte var113 = -1;

                                       while (true) {
                                          long var8 = var86;
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
                                          var131 = (var10[0] & 255L) << 56
                                             | (var10[1] & 255L) << 48
                                             | (var10[2] & 255L) << 40
                                             | (var10[3] & 255L) << 32
                                             | (var10[4] & 255L) << 24
                                             | (var10[5] & 255L) << 16
                                             | (var10[6] & 255L) << 8
                                             | var10[7] & 255L;
                                          switch (var113) {
                                             case 0:
                                                var58[var68] = var131;
                                                if (var2 >= var5) {
                                                   l = var6;
                                                   m = new Long[10];
                                                   String[] var46 = new String[3];
                                                   int var44 = 0;
                                                   int[] var59 = new int[2];
                                                   String var43;
                                                   int var45 = (var43 = var22[0]).length();
                                                   short var71 = 3974;
                                                   long var88 = 8550886017966101402L ^ var31;
                                                   char var42 = '\t';
                                                   ckk(var59);
                                                   int var41 = -1;

                                                   while (true) {
                                                      short var60 = 27851;
                                                      long var72 = 7868724325696745704L ^ var31;
                                                      String var89 = a(54, a(var43.substring(++var41, var41 + var42)));
                                                      int var73 = -1;
                                                      var46[var44++] = var89;
                                                      if ((var41 += var42) >= var45) {
                                                         a = var46;
                                                         long var33 = c<"v">(19825, 6604339038090612616L ^ var31);
                                                         long[] var39 = new long[4];
                                                         int var36 = 0;
                                                         String var37;
                                                         int var38 = (var37 = var22[2]).length();
                                                         byte var35 = 0;

                                                         label61:
                                                         while (true) {
                                                            var73 = var35;
                                                            var35 += 8;
                                                            byte[] var40 = var37.substring(var73, var35).getBytes(var22[4]);
                                                            long[] var61 = var39;
                                                            var73 = var36++;
                                                            long var91 = var40[0] & c<"v">(19480, 8301110658697023207L ^ var31);
                                                            short var115 = 10720;
                                                            var131 = 11288223745996228L ^ var31;
                                                            long var92 = var91 << 56;
                                                            long var116 = var40[1] & c<"v">(4884, 4314415640531341801L ^ var31);
                                                            short var135 = 8390;
                                                            long var10005 = 4308253920793853138L ^ var31;
                                                            long var93 = var92 | var116 << 48;
                                                            long var117 = var40[2] & c<"v">(4884, 4314415640531341801L ^ var31);
                                                            short var136 = 5334;
                                                            var10005 = 7320764958426155209L ^ var31;
                                                            long var94 = var93 | var117 << 40;
                                                            long var118 = var40[3] & c<"v">(4884, 4314415640531341801L ^ var31);
                                                            short var137 = 3373;
                                                            var10005 = 6607511760424849727L ^ var31;
                                                            long var95 = var94 | var118 << 32;
                                                            long var119 = var40[4] & c<"v">(4884, 4314415640531341801L ^ var31);
                                                            short var138 = 18967;
                                                            var10005 = 8358976018472080909L ^ var31;
                                                            long var96 = var95 | var119 << 24;
                                                            long var120 = var40[5] & c<"v">(4884, 4314415640531341801L ^ var31);
                                                            short var139 = 28636;
                                                            var10005 = 5631158503894987717L ^ var31;
                                                            long var97 = var96 | var120 << 16;
                                                            short var140 = 6026;
                                                            var10005 = 153305361542630314L ^ var31;
                                                            long var121 = var40[6] & c<"v">(4884, 4314415640531341801L ^ var31);
                                                            short var141 = 27282;
                                                            var10005 = 2720503368733374105L ^ var31;
                                                            long var98 = var97 | var121 << 8;
                                                            short var142 = 32669;
                                                            var10005 = 454746296358380419L ^ var31;
                                                            long var99 = var98 | var40[7] & c<"v">(4884, 4314415640531341801L ^ var31);
                                                            byte var122 = -1;

                                                            while (true) {
                                                               var131 = var99 ^ var33;
                                                               switch (var122) {
                                                                  case 0:
                                                                     var61[var73] = var131;
                                                                     if (var35 >= var38) {
                                                                        b = var39;
                                                                        c = new Long[4];
                                                                        return;
                                                                     }
                                                                     break;
                                                                  default:
                                                                     var61[var73] = var131;
                                                                     if (var35 < var38) {
                                                                        continue label61;
                                                                     }

                                                                     var38 = (var37 = var22[3]).length();
                                                                     var35 = 0;
                                                               }

                                                               byte var77 = var35;
                                                               var35 += 8;
                                                               var40 = var37.substring(var77, var35).getBytes(var22[1]);
                                                               var61 = var39;
                                                               var73 = var36++;
                                                               long var101 = var40[0] & c<"v">(4884, 4314415640531341801L ^ var31);
                                                               short var124 = 1146;
                                                               var131 = 54795116827793505L ^ var31;
                                                               long var102 = var101 << 56;
                                                               long var125 = var40[1] & c<"v">(4884, 4314415640531341801L ^ var31);
                                                               short var146 = 32295;
                                                               var10005 = 3350872338824962606L ^ var31;
                                                               long var103 = var102 | var125 << 48;
                                                               long var126 = var40[2] & c<"v">(4884, 4314415640531341801L ^ var31);
                                                               short var147 = 29329;
                                                               var10005 = 4679027979386859145L ^ var31;
                                                               long var104 = var103 | var126 << 40;
                                                               long var127 = var40[3] & c<"v">(4884, 4314415640531341801L ^ var31);
                                                               short var148 = 32101;
                                                               var10005 = 5315847112129716551L ^ var31;
                                                               long var105 = var104 | var127 << 32;
                                                               long var128 = var40[4] & c<"v">(4884, 4314415640531341801L ^ var31);
                                                               short var149 = 24672;
                                                               var10005 = 5512226934768614498L ^ var31;
                                                               long var106 = var105 | var128 << 24;
                                                               long var129 = var40[5] & c<"v">(4884, 4314415640531341801L ^ var31);
                                                               short var150 = 28636;
                                                               var10005 = 5631158503894987717L ^ var31;
                                                               long var107 = var106 | var129 << 16;
                                                               short var151 = 6026;
                                                               var10005 = 153305361542630314L ^ var31;
                                                               long var130 = var40[6] & c<"v">(4884, 4314415640531341801L ^ var31);
                                                               short var152 = 27282;
                                                               var10005 = 2720503368733374105L ^ var31;
                                                               long var108 = var107 | var130 << 8;
                                                               short var153 = 32669;
                                                               var10005 = 454746296358380419L ^ var31;
                                                               var99 = var108 | var40[7] & c<"v">(4884, 4314415640531341801L ^ var31);
                                                               var122 = 0;
                                                            }
                                                         }
                                                      }

                                                      var42 = var43.charAt(var41);
                                                   }
                                                }
                                                break;
                                             default:
                                                var58[var68] = var131;
                                                if (var2 < var5) {
                                                   continue label77;
                                                }

                                                var4 = "^\r\u0096lOH^\u00adÏ\r^´\r~îõ";
                                                var5 = "^\r\u0096lOH^\u00adÏ\r^´\r~îõ".length();
                                                var2 = 0;
                                          }

                                          byte var70 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var70, var2).getBytes("ISO-8859-1");
                                          var58 = var6;
                                          var68 = var3++;
                                          var86 = (var7[0] & 255L) << 56
                                             | (var7[1] & 255L) << 48
                                             | (var7[2] & 255L) << 40
                                             | (var7[3] & 255L) << 32
                                             | (var7[4] & 255L) << 24
                                             | (var7[5] & 255L) << 16
                                             | (var7[6] & 255L) << 8
                                             | var7[7] & 255L;
                                          var113 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var56[var10001] = var131;
                                 if (var13 < var16) {
                                    continue label93;
                                 }

                                 var15 = "`XFk\u0018>\u008c\u0011·\n({¶Ý^µ";
                                 var16 = "`XFk\u0018>\u008c\u0011·\n({¶Ý^µ".length();
                                 var13 = 0;
                           }

                           byte var67 = var13;
                           var13 += 8;
                           var18 = var15.substring(var67, var13).getBytes("ISO-8859-1");
                           var56 = var17;
                           var10001 = var14++;
                           var83 = (var18[0] & 255L) << 56
                              | (var18[1] & 255L) << 48
                              | (var18[2] & 255L) << 40
                              | (var18[3] & 255L) << 32
                              | (var18[4] & 255L) << 24
                              | (var18[5] & 255L) << 16
                              | (var18[6] & 255L) << 8
                              | var18[7] & 255L;
                           var110 = 0;
                        }
                     }
                  }

                  var26 = var27.charAt(var50);
                  break;
               default:
                  var22[var28++] = var79;
                  if ((var50 += var26) < var29) {
                     var26 = var27.charAt(var50);
                     continue label111;
                  }

                  var27 = "Ã@büß7ù\u0014ÐµØ\u0084V\u009d\u001a»jê\u0014×Zßø5\u0010è\u0086ýÀ\u0011áé\u0011ú\u001cÔÖÔÖ?'";
                  var29 = "Ã@büß7ù\u0014ÐµØ\u0084V\u009d\u001a»jê\u0014×Zßø5\u0010è\u0086ýÀ\u0011áé\u0011ú\u001cÔÖÔÖ?'".length();
                  var26 = 24;
                  var50 = -1;
            }

            var53 = var27.substring(++var50, var50 + var26);
            var10001 = 0;
         }
      }
   }

   private static char[] a(String var0) {
      long var1 = d ^ 3545485541356L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 17747;
         long var10005 = 6811325712973755608L ^ var1;
         var10000[0] = (char)(var10003 ^ '`');
      }

      return var10000;
   }

   private static String a(int var0, char[] var1) {
      long var2 = d ^ 96847925202799L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 32669;
         long var10009 = 454733954986868379L ^ var2;
         var10001[var4] = (char)(var10005 ^ var10002 ^ switch (var4 % 7) {
            case 0 -> {
               short var14 = 26708;
               long var19 = 1264450743194741068L ^ var2;
               yield 20;
            }
            case 1 -> {
               short var13 = 25992;
               long var18 = 2010128226914493589L ^ var2;
               yield 10;
            }
            case 2 -> {
               short var12 = 5858;
               long var17 = 5137937325464590322L ^ var2;
               yield 62;
            }
            case 3 -> 2;
            case 4 -> {
               short var11 = 25086;
               long var16 = 2232105125660156149L ^ var2;
               yield 16;
            }
            case 5 -> 5;
            default -> {
               short var10007 = 27498;
               long var15 = 8839307957012556412L ^ var2;
               yield 96;
            }
         });
      }

      return new String(var10001).intern();
   }

   private static long a(int var0, long var1) {
      long var3 = d ^ 114226300751305L;
      int[] var5 = dar.abu();
      int var10000 = var0 ^ (int)var1;
      short var10001 = 24467;
      long var10002 = 2840623097537600520L ^ var3;
      var10000 ^= 4197;
      var10001 = 5208;
      var10002 = 8090345040341129185L ^ var3;
      int var6 = var10000 & 32767;
      Long var8 = c[var6];
      if (var5 != null) {
         if (var8 == null) {
            c[var6] = b[var6] ^ var1;
         }

         var8 = c[var6];
      }

      return var8;
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1359;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/cvn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("cc/astralis/cvn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23475;
      if (m[var3] == null) {
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
         long var5 = l[var3];
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/cvn", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         m[var3] = var15;
      }

      return m[var3];
   }

   private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = d(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/cvn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
