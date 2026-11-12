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
import net.minecraft.class_304;

public class dhd extends hcr {
   private final gbp aob;
   private final gbp avs;
   private final gbp gtd;
   private final gbp dtm;
   private boolean bbc;
   private final cbm bow;
   private static final long a = 3363765041782L;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;
   private static final long[] m;
   private static final Long[] n;
   private static final Map o;

   public dhd(guu parentClass) {
      long ax = dhd.a ^ 55451413427978L;
      short var10002 = 24595;
      long var10003 = 3082485911714446301L ^ ax;
      super(a, "Vulcan Strafe");
      short var4 = 30985;
      long var10004 = 434567827047424705L ^ ax;
      a.aob = new gbp("Boost", true);
      short var5 = 12228;
      var10004 = 2352859617410806793L ^ ax;
      a.avs = new gbp("Glitch Boost", false);
      short var6 = 4482;
      var10004 = 8857211682947779150L ^ ax;
      a.gtd = new gbp("Glide", false);
      short var7 = 27289;
      var10004 = 8004078807003083088L ^ ax;
      a.dtm = new gbp("Dev Glide", false);
      a.bow = new cbm();
      a.dxe(new ffn[]{a.aob, a.avs, a.gtd, a.dtm});
   }

   @Override
   public void dil() {
      a.bow.glr();
      super.dil();
   }

   @gdz
   public void gds(elx event) {
      long ax;
      int[] var4;
      label37: {
         ax = dhd.a ^ 83093803096792L;
         var4 = dar.abu();
         int var10000 = hjr;
         if (var4 != null) {
            if (hjr <= 5) {
               break label37;
            }

            var10000 = evd.dbj();
         }

         if (var10000 != 0) {
            evd.dek(evd.cqz(1.0F, 1.0F, a.aob.dnp() ? 0.6312F : crg.gj(0.4F, 0.45F)));
         }
      }

      int var10001 = hjr;
      if (var4 != null) {
         short var10002 = 8973;
         long var10003 = 7598812032408291724L ^ ax;
         var10001 = hjr > 6 ? 1 : 0;
      }

      a.bbc = (boolean)var10001;
   }

   @gdz
   public void bjm(eih event) {
      long ax = dhd.a ^ 257300566753L;
      int[] var4 = dar.abu();
      double var21;
      int var10000 = (var21 = chi.field_1724.field_6017 - 2.0) == 0.0 ? 0 : (var21 < 0.0 ? -1 : 1);
      if (var4 != null) {
         if (var10000 > 0) {
            short var10 = 9602;
            long var16 = 2509324787992222630L ^ ax;
            bpa.bez("returning");
            a.bbc = false;
            return;
         }

         var10000 = a.gtd.dnp();
      }

      label118:
      if (var4 != null) {
         if (var10000 != 0) {
            var10000 = hjr;
            if (var4 == null) {
               break label118;
            }

            short var10001 = 18064;
            long var10002 = 7970135963408507945L ^ ax;
            if (hjr > 6) {
               var10000 = hjr;
               short var11 = a.dtm.dnp();
               if (var4 != null) {
                  if (var11 == 0) {
                     var11 = 7965;
                     var10002 = 1156506804215971238L ^ ax;
                     var11 = 16;
                  } else {
                     var11 = 14958;
                     var10002 = 7772505167693895892L ^ ax;
                     var11 = 20;
                  }
               }

               if (var10000 < var11) {
                  label122: {
                     var10000 = chi.field_1724.field_6012 % 3;
                     if (var4 != null) {
                        if (var10000 != 0) {
                           var7 = -0.0991;
                           break label122;
                        }

                        var10000 = a.dtm.dnp();
                     }

                     var7 = (var10000 == 0 ? chi.field_1724.method_18798().field_1351 : 0.0) + 0.026;
                  }

                  bav.fym(var7);
               }
            }
         }

         var10000 = a.bbc;
      }

      if (var4 != null) {
         if (var10000 != 0) {
            a.dad(true);
         }

         var10000 = chi.field_1724.method_24828();
      }

      if (var4 != null) {
         if (var10000 != 0) {
            chi.field_1724.method_6043();
            evd.dek(evd.fzm() * crg.gj(1.2F, 1.5F));
         }

         var10000 = a.avs.dnp();
      }

      if (var10000 != 0) {
         class_304 var8 = chi.field_1690.field_1903;
         short var19 = 12925;
         long var10003 = 176474913801848730L ^ ax;
         short var14 = a.bow.fsc(500L);
         if (var4 != null) {
            var14 = !var14;
         }

         var8.method_23481((boolean)var14);
         cbm var9 = a.bow;
         if (var4 != null) {
            var14 = 339;
            long var20 = 3280056923267200181L ^ ax;
            if (!a.bow.fsc(1000L)) {
               return;
            }

            var9 = a.bow;
         }

         var9.glr();
      }
   }

   static {
      long var22 = a ^ 136608620246158L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var25 = 1; var25 < 8; var25++) {
         var10003[var25] = (byte)(var22 << var25 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[6];
      int var29 = 0;
      String var28 = "ö\u000eÎöl\b¥F¤õ_\u00117ë\u008a\u0093YS¹\u0095Áø\bË¶@íÑå\u0080\n \u0010UÁA©8\u0083ç\u0004\u008e¬ÕWé$¾ì cÝ«û2ÑÝf\u0098ç\u0093}è \u0016¥7.\u000fØ¶½M37\f2\u0097Â\u0092\u0007{ -8~F\u0088\u0091×YvT(\u0082\u0087Þ8ùF!î$\u0006érVÈ\u0087«zUþ»\u0080";
      int var30 = "ö\u000eÎöl\b¥F¤õ_\u00117ë\u008a\u0093YS¹\u0095Áø\bË¶@íÑå\u0080\n \u0010UÁA©8\u0083ç\u0004\u008e¬ÕWé$¾ì cÝ«û2ÑÝf\u0098ç\u0093}è \u0016¥7.\u000fØ¶½M37\f2\u0097Â\u0092\u0007{ -8~F\u0088\u0091×YvT(\u0082\u0087Þ8ùF!î$\u0006érVÈ\u0087«zUþ»\u0080"
         .length();
      char var27 = ' ';
      int var35 = -1;

      label72:
      while (true) {
         String var36 = var28.substring(++var35, var35 + var27);
         int var10001 = -1;

         while (true) {
            byte[] var32 = var24.doFinal(var36.getBytes("ISO-8859-1"));
            String var50 = a(var32).intern();
            switch (var10001) {
               case 0:
                  var31[var29++] = var50;
                  if ((var35 += var27) >= var30) {
                     d = var31;
                     e = new String[6];
                     i = new HashMap(13);
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
                     String var15 = "rë'ô   n\u0094<ùWÄÃ=\u009d";
                     int var16 = "rë'ô   n\u0094<ùWÄÃ=\u009d".length();
                     byte var13 = 0;

                     label54:
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
                                    g = var17;
                                    h = new Integer[4];
                                    o = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var22 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[2];
                                    int var3 = 0;
                                    String var4 = "R\u0086ÀHæE\" x.mép5\t§";
                                    int var5 = "R\u0086ÀHæE\" x.mép5\t§".length();
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

                                    m = var6;
                                    n = new Long[2];
                                    return;
                                 }
                                 break;
                              default:
                                 var39[var10001] = var62;
                                 if (var13 < var16) {
                                    continue label54;
                                 }

                                 var15 = "\u000fK½Ñvµ*J¥é\rH\u0005j\"á";
                                 var16 = "\u000fK½Ñvµ*J¥é\rH\u0005j\"á".length();
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
                     continue label72;
                  }

                  var28 = "Y³\r\u0081F»É\u008bÊ5\u0003?ÝÐå!ûl\u008fõÌ3.ÿ°\u0089\b¾è6.\u0083\u0010@\fI·ÿ\u0013èß³v\u0087K)\u0099Ø<";
                  var30 = "Y³\r\u0081F»É\u008bÊ5\u0003?ÝÐå!ûl\u008fõÌ3.ÿ°\u0089\b¾è6.\u0083\u0010@\fI·ÿ\u0013èß³v\u0087K)\u0099Ø<".length();
                  var27 = ' ';
                  var35 = -1;
            }

            var36 = var28.substring(++var35, var35 + var27);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22193;
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
            throw new RuntimeException("cc/astralis/dhd", var10);
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
         throw new RuntimeException("cc/astralis/dhd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18990;
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
            throw new RuntimeException("cc/astralis/dhd", var14);
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
         throw new RuntimeException("cc/astralis/dhd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23921;
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
            throw new RuntimeException("cc/astralis/dhd", var14);
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
         throw new RuntimeException("cc/astralis/dhd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
