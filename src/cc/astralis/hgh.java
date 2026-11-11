package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1041;

public class hgh extends cec {
   private final Queue<Long> dps = new LinkedList<>();
   private boolean fqw;
   private double drh;
   private long gfp;
   private static final int ayy;
   private static final double cjn = 0.05;
   private static final long eha;
   private static final long gtl;
   private long eyj = 0L;
   private static final long a = 138567993257566L;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Long[] g;
   private static final Map h;

   @gdz
   public void erx(amo event) {
      long ax = hgh.a ^ 25380268758732L;
      int[] axx = dar.abu();
      if (axx != null) {
         short var10001 = 22781;
         long var10002 = 4587209555392056260L ^ ax;
         if (chi.field_1724.field_6012 >= 200 && !chi.method_1542()) {
            if (a.cud() == gpy.RECEIVE) {
               long axxx = System.currentTimeMillis();
               a.dps.add(axxx);
               hgh var10000 = a;
               if (axx != null) {
                  int var7 = a.dps.size();
                  var10001 = 32385;
                  var10002 = 7637135135553121723L ^ ax;
                  if (var7 > 798323200) {
                     a.dps.poll();
                  }

                  a.gfp = axxx;
                  var10000 = a;
               }

               var10000.elf();
            }

            return;
         }

         a.dps.clear();
         a.drh = 0.0;
         a.fqw = false;
         a.eyj = 0L;
         a.gfp = 0L;
      }
   }

   @gdz
   public void bc(fxx event) {
      hgh var5;
      label58: {
         long ax;
         int[] var4;
         ax = hgh.a ^ 117107892838593L;
         var4 = dar.abu();
         var10000 = a.dps.isEmpty();
         label54:
         if (var4 != null) {
            if (var10000 == 0) {
               long var6;
               var10000 = (var6 = System.currentTimeMillis() - a.gfp - b<"q">(3827, 8755198205106298395L ^ ax)) == 0L ? 0 : (var6 < 0L ? -1 : 1);
               if (var4 == null) {
                  break label54;
               }

               if (var10000 > 0) {
                  a.fqw = true;
                  a.drh = 1.0;
                  a.eyj = b<"q">(28014, 3966002451150372224L ^ ax);
                  if (var4 != null) {
                     return;
                  }
               }
            }

            var5 = a;
            if (var4 == null) {
               break label58;
            }

            double var7;
            var10000 = (var7 = a.drh - 0.05) == 0.0 ? 0 : (var7 < 0.0 ? -1 : 1);
         }

         if (var10000 > 0) {
            var5 = a;
            if (var4 == null) {
               break label58;
            }

            if (a.eyj >= b<"q">(19311, 2756281504492018563L ^ ax)) {
               a.fqw = true;
               if (var4 != null) {
                  return;
               }
            }
         }

         var5 = a;
      }

      var5.fqw = false;
   }

   @gdz
   public void fhh(ctt event) {
      long ax = hgh.a ^ 98460380774377L;
      if (a.fqw) {
         class_1041 axx = chi.method_22683();
         short var10000 = 21573;
         long var10001 = 4613261448549412443L ^ ax;
         int axxx = -778856849;
      }
   }

   private void elf() {
      long a = hgh.a ^ 46666303917324L;
      int[] ax = dar.abu();
      Queue var10000 = a.dps;
      if (ax != null) {
         if (a.dps.size() < 2) {
            a.drh = 0.0;
            a.eyj = 0L;
            return;
         }

         var10000 = a.dps;
      }

      Long[] axx = var10000.toArray(new Long[0]);
      int axxx = 0;
      long var10001 = 5788112081103286275L ^ a;
      int axxxx = 0;
      long axxxxx = b<"q">(19747, var10001);
      a.eyj = 0L;
      int axxxxxx = 1;

      label57: {
         label62: {
            while (true) {
               if (axxxxxx < axx.length) {
                  long axxxxxxx = axx[axxxxxx] - axx[axxxxxx - 1];
                  int axxxxxxxx = (int)(axxxxxxx / axxxxx) - 1;
                  if (ax != null) {
                     var13 = axxxxxxxx;
                     if (ax == null) {
                        break;
                     }

                     if (axxxxxxxx > 0) {
                        axxx += axxxxxxxx;
                        a.eyj += axxxxxxxx * axxxxx;
                     }

                     axxxx++;
                     axxxxxx++;
                  }

                  if (ax != null) {
                     continue;
                  }
               }

               axxxxxx = axxxx + axxx;
               if (ax == null) {
                  break label62;
               }

               var13 = axxxxxx;
               break;
            }

            if (var13 > 0) {
               break label57;
            }

            a.drh = 0.0;
         }

         if (ax != null) {
            return;
         }
      }

      a.drh = (double)axxx / axxxxxx;
   }

   static {
      long var11 = a ^ 101554356112575L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var19 = new long[4];
      int var16 = 0;
      String var17 = "\u0095\u0093ÌÅ·\u0012\u001c¤²\u0012ié]øº\u0000";
      int var18 = "\u0095\u0093ÌÅ·\u0012\u001c¤²\u0012ié]øº\u0000".length();
      byte var15 = 0;

      label50:
      while (true) {
         int var10001 = var15;
         var15 += 8;
         byte[] var20 = var17.substring(var10001, var15).getBytes("ISO-8859-1");
         long[] var26 = var19;
         var10001 = var16++;
         long var36 = (var20[0] & 255L) << 56
            | (var20[1] & 255L) << 48
            | (var20[2] & 255L) << 40
            | (var20[3] & 255L) << 32
            | (var20[4] & 255L) << 24
            | (var20[5] & 255L) << 16
            | (var20[6] & 255L) << 8
            | var20[7] & 255L;
         byte var41 = -1;

         while (true) {
            long var21 = var36;
            byte[] var23 = var13.doFinal(
               new byte[]{
                  (byte)(var21 >>> 56),
                  (byte)(var21 >>> 48),
                  (byte)(var21 >>> 40),
                  (byte)(var21 >>> 32),
                  (byte)(var21 >>> 24),
                  (byte)(var21 >>> 16),
                  (byte)(var21 >>> 8),
                  (byte)var21
               }
            );
            long var46 = (var23[0] & 255L) << 56
               | (var23[1] & 255L) << 48
               | (var23[2] & 255L) << 40
               | (var23[3] & 255L) << 32
               | (var23[4] & 255L) << 24
               | (var23[5] & 255L) << 16
               | (var23[6] & 255L) << 8
               | var23[7] & 255L;
            switch (var41) {
               case 0:
                  var26[var10001] = var46;
                  if (var15 >= var18) {
                     c = var19;
                     d = new Integer[4];
                     short var27 = 21701;
                     long var32 = var11 ^ 3488922340937031054L;
                     ayy = 300;
                     h = new HashMap(13);
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
                     String var4 = "q[bä{\\þ\u0093;4\u0081\u008b\u0091\u009cÈ\\ÓòÀ\u0083\\\u0002\u001eZF\u0092¦ñlæn°";
                     int var5 = "q[bä{\\þ\u0093;4\u0081\u008b\u0091\u009cÈ\\ÓòÀ\u0083\\\u0002\u001eZF\u0092¦ñlæn°".length();
                     byte var2 = 0;

                     label34:
                     while (true) {
                        int var33 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                        long[] var29 = var6;
                        var33 = var3++;
                        long var39 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte var44 = -1;

                        while (true) {
                           long var8 = var39;
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
                           var46 = (var10[0] & 255L) << 56
                              | (var10[1] & 255L) << 48
                              | (var10[2] & 255L) << 40
                              | (var10[3] & 255L) << 32
                              | (var10[4] & 255L) << 24
                              | (var10[5] & 255L) << 16
                              | (var10[6] & 255L) << 8
                              | var10[7] & 255L;
                           switch (var44) {
                              case 0:
                                 var29[var33] = var46;
                                 if (var2 >= var5) {
                                    f = var6;
                                    g = new Long[6];
                                    gtl = b<"q">(15184, var11 ^ 2106590616443193287L);
                                    eha = b<"q">(27924, var11 ^ 3895778642241376645L);
                                    return;
                                 }
                                 break;
                              default:
                                 var29[var33] = var46;
                                 if (var2 < var5) {
                                    continue label34;
                                 }

                                 var4 = "VRH¯\u0090»Lv\u0086u\u0018|emf\u0003";
                                 var5 = "VRH¯\u0090»Lv\u0086u\u0018|emf\u0003".length();
                                 var2 = 0;
                           }

                           byte var35 = var2;
                           var2 += 8;
                           var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                           var29 = var6;
                           var33 = var3++;
                           var39 = (var7[0] & 255L) << 56
                              | (var7[1] & 255L) << 48
                              | (var7[2] & 255L) << 40
                              | (var7[3] & 255L) << 32
                              | (var7[4] & 255L) << 24
                              | (var7[5] & 255L) << 16
                              | (var7[6] & 255L) << 8
                              | var7[7] & 255L;
                           var44 = 0;
                        }
                     }
                  }
                  break;
               default:
                  var26[var10001] = var46;
                  if (var15 < var18) {
                     continue label50;
                  }

                  var17 = "¯_yÐ\u001b&Êèä[\u0098V\u0090\u009b\næ";
                  var18 = "¯_yÐ\u001b&Êèä[\u0098V\u0090\u009b\næ".length();
                  var15 = 0;
            }

            byte var31 = var15;
            var15 += 8;
            var20 = var17.substring(var31, var15).getBytes("ISO-8859-1");
            var26 = var19;
            var10001 = var16++;
            var36 = (var20[0] & 255L) << 56
               | (var20[1] & 255L) << 48
               | (var20[2] & 255L) << 40
               | (var20[3] & 255L) << 32
               | (var20[4] & 255L) << 24
               | (var20[5] & 255L) << 16
               | (var20[6] & 255L) << 8
               | var20[7] & 255L;
            var41 = 0;
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11178;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/hgh", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
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
         throw new RuntimeException("cc/astralis/hgh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7795;
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
            throw new RuntimeException("cc/astralis/hgh", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         g[var3] = var15;
      }

      return g[var3];
   }

   private static long b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = b(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
         throw new RuntimeException("cc/astralis/hgh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
