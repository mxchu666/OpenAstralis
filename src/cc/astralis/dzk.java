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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1041;
import net.minecraft.class_5611;

public class dzk extends cdr implements dlc, amh {
   private final String dgr;
   private final gge gpx;
   public final erp heu;
   private boolean fsb;
   private boolean ati;
   private static String[] brg;
   private static final long a = 89607928786479L;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;
   private static final long[] i;
   private static final Long[] m;
   private static final Map n;

   public dzk(String subHeader, gge notificationType) {
      long ax = dzk.a ^ 83018585045034L;
      super();
      short var10004 = 25648;
      long var10005 = 7074834304535206248L ^ ax;
      a.heu = new erp(dtw.EASE_OUT_BACK, 1000L);
      a.fsb = false;
      a.ati = false;
      a.dgr = a;
      a.gpx = a;
   }

   public void dka() {
      long a = dzk.a ^ 8122945945259L;
      int[] var3 = dar.abu();
      dzk var10000 = a;
      if (var3 != null) {
         if (a.ati) {
            return;
         }

         a.ati = true;
         var10000 = a;
      }

      var10000.heu.dsw();
   }

   private float cfl(float a, long a, long a, float a) {
      int[] ax;
      label39: {
         long axx = dzk.a ^ 75203838636802L;
         int[] var10000 = dar.abu();
         float axxx = 5.0F;
         ax = var10000;
         dzk var13 = a;
         if (ax != null) {
            if (a.fsb) {
               break label39;
            }

            a.heu.dsw();
            a.heu.bpt(-a);
            a.heu.gbi(5.0);
            var13 = a;
         }

         var13.fsb = true;
      }

      long axx = Math.max(0L, a - a);
      if (ax != null) {
         if (axx <= 0L) {
            if (ax == null) {
               return (float)a.heu.hjo();
            }

            if (!a.ati) {
               a.dka();
               a.heu.bpt(a.heu.hjo());
               a.heu.gbi(-a);
            }
         }

         a.heu.dwm(a.heu.hfn());
      }

      return (float)a.heu.hjo();
   }

   public void dho(float yPos, long elapsed, long totalTime) {
      long ax = dzk.a ^ 45407627274258L;
      class_1041 axx = chi.method_22683();
      int[] var10000 = dar.abu();
      long axxx = Math.max(0L, a - a);
      String var10001 = a.dgr;
      short var10002 = 16363;
      long var10003 = 5565979717687087019L ^ ax;
      String var43 = String.format("%.1f", axxx / 1000.0);
      short var48 = 25695;
      long var10004 = 7386863600979432472L ^ ax;
      String axxxx = var10001 + " (" + var43 + ")";
      float axxxxx = dfk.eq(a.dgr) + 23.5F;
      int[] axxxxxx = var10000;
      float axxxxxxx = 50.0F + axxxxx;
      float axxxxxxxx = 35.0F;
      float axxxxxxxxx = a.cfl(a, a, a, axxxxxxx);
      float var56;
      int var30 = (var56 = axxxxxxxxx - -axxxxxxx) == 0.0F ? 0 : (var56 < 0.0F ? -1 : 1);
      if (axxxxxx != null) {
         if (var30 <= 0) {
            return;
         }

         var30 = axx.method_4486();
      }

      float axxxxxxxxxx;
      float axxxxxxxxxxx;
      float axxxxxxxxxxxx;
      ezv axxxxxxxxxxxxx;
      label99: {
         label98: {
            axxxxxxxxxx = var30 - axxxxxxxxx - axxxxxxx;
            axxxxxxxxxxx = axx.method_4502() - a - axxxxxxxx;
            float axxxxxxxxxxxxxx = a > 0L ? Math.max(0.0F, Math.min(1.0F, 1.0F - (float)axxx / (float)a)) : 0.0F;
            axxxxxxxxxxxx = axxxxxxx * axxxxxxxxxxxxxx;
            axxxxxxxxxxxxx = dar.gqy().aws().diy(ezv.class);
            if (axxxxxx != null) {
               short var37 = 32631;
               long var44 = 3979993652507954995L ^ ax;
               if (!dar.gqy().aws().diy(dtc.class).bph.emb("Modern")) {
                  break label98;
               }

               short var10007 = 10001;
               long var10008 = 4390233368949310478L ^ ax;
               short var51 = 10281;
               long var10009 = 2159310605546277685L ^ ax;
               short var54 = 2382;
               long var10010 = 1312099216003131987L ^ ax;
               dmp.cpp(axxxxxxxxxx, axxxxxxxxxxx, axxxxxxx, axxxxxxxx, 5.0F, new Color(15, 15, 18, axxxxxxxxxxxxx.fug.dnp().intValue()));
            }

            if (axxxxxx != null) {
               break label99;
            }
         }

         short var10006 = 10281;
         long var49 = 2159310605546277685L ^ ax;
         short var50 = 10281;
         long var52 = 2159310605546277685L ^ ax;
         short var53 = 25333;
         long var55 = 7802381521432936939L ^ ax;
         dmp.euv(axxxxxxxxxx, axxxxxxxxxxx, axxxxxxx, axxxxxxxx, new Color(15, 15, 18, axxxxxxxxxxxxx.fug.dnp().intValue()));
      }

      String axxxxxxxxxxxxxxx = axxxxxxxxxxxxx.eqi.dnp();
      byte axxxxxxxxxxxxxxxx = -1;
      int var31 = axxxxxxxxxxxxxxx.hashCode();
      if (axxxxxx != null) {
         switch (var31) {
            case -1656737386:
               short var38 = 4266;
               long var45 = 9056654662386065641L ^ ax;
               var31 = axxxxxxxxxxxxxxx.equals("Rainbow");
               if (axxxxxx == null) {
                  break;
               }

               if (var31 != 0) {
                  axxxxxxxxxxxxxxxx = 0;
               }
            default:
               var31 = axxxxxxxxxxxxxxxx;
         }
      }
      Color axxxxxxxxxxxxxxxxx = switch (var31) {
         case 0 -> {
            short var33 = 14582;
            long var39 = 6294421922929235351L ^ ax;
            yield ezv.gbq(3000L, 0, 0.7F, 1.0F);
         }
         default -> dec.fbp(new class_5611(0.0F, 6.0F), axxxxxxxxxxxxx.ehf.dnp(), axxxxxxxxxxxxx.aoz.dnp());
      };
      String var28 = axxxxxxxxxxxxx.eqi.dnp();
      byte var26 = -1;
      int var34 = var28.hashCode();
      if (axxxxxx != null) {
         switch (var34) {
            case -1656737386:
               short var40 = 9215;
               long var46 = 7731900237655020474L ^ ax;
               var34 = var28.equals("Rainbow");
               if (axxxxxx == null) {
                  break;
               }

               if (var34 != 0) {
                  var26 = 0;
               }
            default:
               var34 = var26;
         }
      }
      Color axxxxxxxxxxxxxxxxxx = switch (var34) {
         case 0 -> {
            short var36 = 27470;
            long var41 = 2345135216729359916L ^ ax;
            yield ezv.gbq(4000L, 0, 1.0F, 1.0F);
         }
         default -> dec.fbp(new class_5611(0.0F, 6.0F), axxxxxxxxxxxxx.ehf.dnp(), axxxxxxxxxxxxx.aoz.dnp());
      };
      if (axxxxxx != null) {
         short var42 = 32137;
         long var47 = 7543534926847036872L ^ ax;
         if (dar.gqy().aws().diy(dtc.class).bph.emb("Legacy")) {
            dmp.dyl(axxxxxxxxxx, axxxxxxxxxxx + 33.0F, axxxxxxxxxxxx, 2.0F, axxxxxxxxxxxxxxxxx, axxxxxxxxxxxxxxxxxx, false);
         }

         dmp.baq(axxxxxxxxxx + 16.0F, axxxxxxxxxxx + 17.5F, 13.0F, axxxxxxxxxxxxxxxxx);
      }

      ezy.ebb(a.gpx == gge.INFO ? "c" : "d", axxxxxxxxxx + 4.2F, axxxxxxxxxxx + 5.8F, Color.white);
      float axxxxxxxxxxxxxxxxxxx = axxxxxxxxxx + (axxxxxxx - axxxxx) - 15.0F;
      dot.aof(ek.bzp(a.gpx.name()), axxxxxxxxxxxxxxxxxxx, axxxxxxxxxxx + 4.0F, Color.white);
      dfk.aof(axxxx, axxxxxxxxxxxxxxxxxxx, axxxxxxxxxxx + 18.0F, Color.white);
   }

   public void gkw(float yPos, long elapsed, long totalTime) {
      long ax = dzk.a ^ 119886990639976L;
      int[] var10000 = dar.abu();
      class_1041 axx = chi.method_22683();
      float axxx = dfk.eq(a.dgr) + 23.5F;
      int[] axxxx = var10000;
      float axxxxx = 50.0F + axxx;
      float axxxxxx = 35.0F;
      float axxxxxxx = a.cfl(a, a, a, axxxxx);
      float var17;
      int var16 = (var17 = axxxxxxx - -axxxxx) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
      if (axxxx != null) {
         if (var16 <= 0) {
            return;
         }

         var16 = axx.method_4486();
      }

      float axxxxxxxx;
      float axxxxxxxxx;
      label29: {
         axxxxxxxx = var16 - axxxxxxx - axxxxx;
         axxxxxxxxx = axx.method_4502() - a - axxxxxx;
         if (axxxx != null) {
            short var10001 = 5927;
            long var10002 = 7547599959927737375L ^ ax;
            if (!dar.gqy().aws().diy(dtc.class).bph.emb("Modern")) {
               break label29;
            }

            dmp.fnq(axxxxxxxx, axxxxxxxxx, axxxxx, axxxxxx, 5.0F);
         }

         if (axxxx != null) {
            return;
         }
      }

      dmp.fzn(axxxxxxxx, axxxxxxxxx, axxxxx, axxxxxx);
   }

   public static void fst(String[] var0) {
      brg = var0;
   }

   public static String[] bux() {
      return brg;
   }

   static {
      long var22 = a ^ 51390641827103L;
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
      String var28 = "\u001du\u0085A\u001dÅ¸¾\u0013¨¯«-\u0013Q\u001d\u0010w¤\u000bÛ=¦³e>\n)I{Bz\u0099\u0010ù)\u008dÃ\f'j\u001bIZíl;¼~\u0099\u00107¶J0t·\u000bxGF'bÎQ\u0013®\u0010¯ÿÏû\u0096©ÀÚ7ÌN\u001eù!\u0004û";
      int var30 = "\u001du\u0085A\u001dÅ¸¾\u0013¨¯«-\u0013Q\u001d\u0010w¤\u000bÛ=¦³e>\n)I{Bz\u0099\u0010ù)\u008dÃ\f'j\u001bIZíl;¼~\u0099\u00107¶J0t·\u000bxGF'bÎQ\u0013®\u0010¯ÿÏû\u0096©ÀÚ7ÌN\u001eù!\u0004û"
         .length();
      char var27 = 16;
      int var35 = -1;

      label79:
      while (true) {
         String var36 = var28.substring(++var35, var35 + var27);
         int var10001 = -1;

         while (true) {
            byte[] var32 = var24.doFinal(var36.getBytes("ISO-8859-1"));
            String var50 = c(var32).intern();
            switch (var10001) {
               case 0:
                  var31[var29++] = var50;
                  if ((var35 += var27) >= var30) {
                     c = var31;
                     d = new String[7];
                     h = new HashMap(13);
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
                     String var15 = "Ïù·\u008dX\u008dØ\u0095Î\u0015¾¬ô\u0011\u0017&";
                     int var16 = "Ïù·\u008dX\u008dØ\u0095Î\u0015¾¬ô\u0011\u0017&".length();
                     byte var13 = 0;

                     label61:
                     while (true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var39 = var17;
                        var10001 = var14++;
                        long var54 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte var58 = -1;

                        while (true) {
                           long var19 = var54;
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
                           long var62 = (var21[0] & 255L) << 56
                              | (var21[1] & 255L) << 48
                              | (var21[2] & 255L) << 40
                              | (var21[3] & 255L) << 32
                              | (var21[4] & 255L) << 24
                              | (var21[5] & 255L) << 16
                              | (var21[6] & 255L) << 8
                              | var21[7] & 255L;
                           switch (var58) {
                              case 0:
                                 var39[var10001] = var62;
                                 if (var13 >= var16) {
                                    f = var17;
                                    g = new Integer[4];
                                    n = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var22 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[3];
                                    int var3 = 0;
                                    String var4 = " q?\u0007þ¹æÚn\u0011v£e\u0003øÑ<ÿZáa\u0014\u008cy";
                                    int var5 = " q?\u0007þ¹æÚn\u0011v£e\u0003øÑ<ÿZáa\u0014\u008cy".length();
                                    byte var2 = 0;

                                    do {
                                       int var47 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
                                       var47 = var3++;
                                       long var8 = (var7[0] & 255L) << 56
                                          | (var7[1] & 255L) << 48
                                          | (var7[2] & 255L) << 40
                                          | (var7[3] & 255L) << 32
                                          | (var7[4] & 255L) << 24
                                          | (var7[5] & 255L) << 16
                                          | (var7[6] & 255L) << 8
                                          | var7[7] & 255L;
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
                                       var62 = (var10[0] & 255L) << 56
                                          | (var10[1] & 255L) << 48
                                          | (var10[2] & 255L) << 40
                                          | (var10[3] & 255L) << 32
                                          | (var10[4] & 255L) << 24
                                          | (var10[5] & 255L) << 16
                                          | (var10[6] & 255L) << 8
                                          | var10[7] & 255L;
                                       byte var61 = -1;
                                       var6[var47] = var62;
                                    } while (var2 < var5);

                                    i = var6;
                                    m = new Long[3];
                                    if (bux() != null) {
                                       fst(new String[1]);
                                    }

                                    return;
                                 }
                                 break;
                              default:
                                 var39[var10001] = var62;
                                 if (var13 < var16) {
                                    continue label61;
                                 }

                                 var15 = "\u0087ú\u008d«m\b¯)\u008c¯¶¦\u0091e\u009dl";
                                 var16 = "\u0087ú\u008d«m\b¯)\u008c¯¶¦\u0091e\u009dl".length();
                                 var13 = 0;
                           }

                           byte var46 = var13;
                           var13 += 8;
                           var18 = var15.substring(var46, var13).getBytes("ISO-8859-1");
                           var39 = var17;
                           var10001 = var14++;
                           var54 = (var18[0] & 255L) << 56
                              | (var18[1] & 255L) << 48
                              | (var18[2] & 255L) << 40
                              | (var18[3] & 255L) << 32
                              | (var18[4] & 255L) << 24
                              | (var18[5] & 255L) << 16
                              | (var18[6] & 255L) << 8
                              | var18[7] & 255L;
                           var58 = 0;
                        }
                     }
                  }

                  var27 = var28.charAt(var35);
                  break;
               default:
                  var31[var29++] = var50;
                  if ((var35 += var27) < var30) {
                     var27 = var28.charAt(var35);
                     continue label79;
                  }

                  var28 = "ù|ÄzèKJ~¾®Î6E\rGK\u0010.\u001e5\u0017¡Õ\u0085ô\u009d\u008f¼=gÛÚ8";
                  var30 = "ù|ÄzèKJ~¾®Î6E\rGK\u0010.\u001e5\u0017¡Õ\u0085ô\u009d\u008f¼=gÛÚ8".length();
                  var27 = 16;
                  var35 = -1;
            }

            var36 = var28.substring(++var35, var35 + var27);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30332;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/dzk", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("cc/astralis/dzk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9505;
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
            throw new RuntimeException("cc/astralis/dzk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("cc/astralis/dzk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11101;
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
         long var5 = i[var3];
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
            throw new RuntimeException("cc/astralis/dzk", var14);
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
         throw new RuntimeException("cc/astralis/dzk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
