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
import net.minecraft.class_476;
import net.minecraft.class_490;

public class dke extends guu {
   public final cyx eda;
   public final gbp aig;
   public final gbp cnd;
   public final gbp gms;
   public final gbp gfw;
   public final gbp dfl;
   public final gbp fvw;
   private static String cps;
   private static final long a = 112513092313125L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;

   public dke() {
      long a = dke.a ^ 74059892849784L;
      super(bfm.PLAYER);
      short var10003 = 9765;
      long var10004 = 3934310852022072201L ^ a;
      a.eda = new cyx("Mode", new del(a), new bu(a), new eno(a));
      var10003 = 20683;
      var10004 = 2011454395460191585L ^ a;
      a.aig = new gbp("Inventory", true);
      var10003 = 2246;
      var10004 = 4912515391632956783L ^ a;
      a.cnd = new gbp("Chest", true);
      var10003 = 10275;
      var10004 = 7032069324388400525L ^ a;
      a.gms = new gbp("ClickGui", true);
      var10003 = 3197;
      var10004 = 4049963929200712150L ^ a;
      a.gfw = new gbp("Allow Jumping", true);
      var10003 = 10564;
      var10004 = 8558165221640305897L ^ a;
      a.dfl = new gbp("Allow Sneaking", false);
      var10003 = 22823;
      var10004 = 809064306127899791L ^ a;
      a.fvw = new gbp("Allow Sprinting", true);
      short var10001 = 27709;
      long var10002 = 8998530603610957802L ^ a;
      ffn[] var3 = new ffn[]{a.aig, a.cnd, a.eda, a.gfw, a.dfl, a.fvw, null};
      var10003 = 12880;
      var10004 = 2627710720614676870L ^ a;
      var3[6] = a.gms;
      a.bfi(var3);
   }

   @gdz
   public void fdt(fxx e) {
      a.efe(a.eda.dnp().akm());
   }

   public boolean ech() {
      long a = dke.a ^ 128288205828742L;
      int[] var3 = dar.abu();
      boolean var10000 = chi.field_1755 instanceof class_490;
      if (var3 != null) {
         if (var10000) {
            var10000 = a.aig.dnp();
            if (var3 == null) {
               return var10000;
            }

            if (var10000) {
               return true;
            }
         }

         var10000 = chi.field_1755 instanceof class_476;
      }

      if (var3 != null) {
         if (var10000) {
            var10000 = a.cnd.dnp();
            if (var3 == null) {
               return var10000;
            }

            if (var10000) {
               return true;
            }
         }

         var10000 = chi.field_1755 instanceof dmr;
      }

      if (var3 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = a.gms.dnp();
      }

      return var3 == null ? var10000 : var10000;
   }

   public static void aqa(String var0) {
      cps = var0;
   }

   public static String dgo() {
      return cps;
   }

   static {
      long var20 = a ^ 72857271286719L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[8];
      int var16 = 0;
      String var15 = "±\u0004¾\u0087ë\u009e]\u0098¤F\u0007\u0089\u000b1RF \u0016\b\u0006x\u008dTHß\u0096\u0002¿?±Ä\f\bN\u009a²\u0089\n\u008aX4\u0099N×ó8\u009eu¥ x>;\u00ad\u000eyöÄ@\u008b¥ôG?Ø\u000fÏí\u0014D8\u0096\u0097½\u0007Ø^¤0E\u008a¯ âíòaÎLz\u001c²¯oþ uÇ7\u0013':?à\u00037\u001eÛµgDQI\u001d\f\u00187à\u0018\u00ad¡]ãÛÇ\u009b\u001b\fq¹CgÑöGõ¨A°)\u0010ê?OÃÁ\u0080¥?\u001e/ë°â\u0093\u001c%";
      int var17 = "±\u0004¾\u0087ë\u009e]\u0098¤F\u0007\u0089\u000b1RF \u0016\b\u0006x\u008dTHß\u0096\u0002¿?±Ä\f\bN\u009a²\u0089\n\u008aX4\u0099N×ó8\u009eu¥ x>;\u00ad\u000eyöÄ@\u008b¥ôG?Ø\u000fÏí\u0014D8\u0096\u0097½\u0007Ø^¤0E\u008a¯ âíòaÎLz\u001c²¯oþ uÇ7\u0013':?à\u00037\u001eÛµgDQI\u001d\f\u00187à\u0018\u00ad¡]ãÛÇ\u009b\u001b\fq¹CgÑöGõ¨A°)\u0010ê?OÃÁ\u0080¥?\u001e/ë°â\u0093\u001c%"
         .length();
      char var14 = 16;
      int var23 = -1;

      label52:
      while (true) {
         String var24 = var15.substring(++var23, var23 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
            String var35 = d(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var35;
                  if ((var23 += var14) >= var17) {
                     g = var18;
                     h = new String[8];
                     r = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "\u0086f0>\u0013·\u0082ÛA\u0085èÜ÷î ¤";
                     int var5 = "\u0086f0>\u0013·\u0082ÛA\u0085èÜ÷î ¤".length();
                     byte var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
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
                        long var10004 = (var10[0] & 255L) << 56
                           | (var10[1] & 255L) << 48
                           | (var10[2] & 255L) << 40
                           | (var10[3] & 255L) << 32
                           | (var10[4] & 255L) << 24
                           | (var10[5] & 255L) << 16
                           | (var10[6] & 255L) << 8
                           | var10[7] & 255L;
                        byte var40 = -1;
                        var6[var10001] = var10004;
                     } while (var2 < var5);

                     p = var6;
                     q = new Integer[2];
                     if (dgo() != null) {
                        short var27 = 17666;
                        long var33 = 5051800950307346282L ^ var20;
                        aqa("WpN5yc");
                     }

                     return;
                  }

                  var14 = var15.charAt(var23);
                  break;
               default:
                  var18[var16++] = var35;
                  if ((var23 += var14) < var17) {
                     var14 = var15.charAt(var23);
                     continue label52;
                  }

                  var15 = "\u008cmZnnI¢\u000fÒØ\"Ô\fë£\u0094\u0018\u008c=8ÑmAÂ5ßýï\u000eØt\u0087ò<H\u007f\u00885Â2u";
                  var17 = "\u008cmZnnI¢\u000fÒØ\"Ô\fë£\u0094\u0018\u008c=8ÑmAÂ5ßýï\u000eØt\u0087ò<H\u007f\u00885Â2u".length();
                  var14 = 16;
                  var23 = -1;
            }

            var24 = var15.substring(++var23, var23 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18932;
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
            throw new RuntimeException("cc/astralis/dke", var10);
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
         throw new RuntimeException("cc/astralis/dke" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6026;
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
            throw new RuntimeException("cc/astralis/dke", var14);
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
         throw new RuntimeException("cc/astralis/dke" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
