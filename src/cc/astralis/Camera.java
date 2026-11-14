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

public class Camera extends guu {
   public final gbp cmt;
   public final bes dtl;
   public final gbp gff;
   public final gbp ahi;
   public static bes don;
   public static bes boo;
   public static bes djx;
   public static bes aqe;
   public static bes afc;
   public static bes bak;
   private static final long a = 80867970245206L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;

   public Camera() {
      long a = Camera.a ^ 80133711302750L;
      super(bfm.VISUAL);
      short var10003 = 19507;
      long var10004 = 4794871602822335358L ^ a;
      a.cmt = new gbp("Change Aspect Ratio", true);
      var10003 = 5309;
      var10004 = 6487330328637838335L ^ a;
      a.dtl = (bes)new bes("Zoom", 1.0F, 0.5F, 5.0F, 0.01F).bih(a.cmt::dnp);
      var10003 = 21099;
      var10004 = 5721840809139885352L ^ a;
      a.gff = new gbp("Modify Third Person", true);
      var10003 = 8063;
      var10004 = 4216524766536833075L ^ a;
      a.ahi = new gbp("Camera No Clip", true);
      short var10001 = 22833;
      long var10002 = 518156587203033562L ^ a;
      ffn[] var3 = new ffn[]{a.gff, a.ahi.bih(a.gff::dnp), a.cmt, a.dtl, don, boo, null, null, null, null};
      var10003 = 21933;
      var10004 = 3056104894110692674L ^ a;
      var3[6] = djx;
      var10003 = 16784;
      var10004 = 4084916608355918204L ^ a;
      var3[7] = aqe;
      var10003 = 24746;
      var10004 = 1851768015283372103L ^ a;
      var3[8] = afc;
      var10003 = 32235;
      var10004 = 3836409372684508421L ^ a;
      var3[9] = bak;
      a.bfi(var3);
   }

   static {
      long var20 = a ^ 4639930968442L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[10];
      int var16 = 0;
      String var15 = "VÝªõÃÁs\u0005\u0085\u0012\u0086rÿ¯\u0098\u0018\u0010Xo\u0080È\u009bh³\u0081\u00947Ôïúè3£\u0010\u001b\u0083ÄÚ`Ò÷\u0004\u001e\u008b$\u001eP\u0006Îõ\u0010\u00134æÛ4Ðarûbm\u007fúãË\u0096\u0010\ná\u007f2^V\u0085ÝÖn\u0082¾î¤*Á\u00105ÜýÞ^èÇ¡\u0010{×ÇC\u001e\u009b?0õ\u0014º\u0087Õ8ù\u0093{Lz\u0006\u000fÄí¤xºÁ|ú·\\Éw)Õc©u\u0006l\"í\u0013qº\u001e\u0000Èrãé\u0012\u0099\f\u008c\n Èû¨\u0000;cüY\"\u009dÁ<GÝK\u0083ÞåÏ\u009fÇ\u008c>DÖÔöµ\te\u0005.";
      int var17 = "VÝªõÃÁs\u0005\u0085\u0012\u0086rÿ¯\u0098\u0018\u0010Xo\u0080È\u009bh³\u0081\u00947Ôïúè3£\u0010\u001b\u0083ÄÚ`Ò÷\u0004\u001e\u008b$\u001eP\u0006Îõ\u0010\u00134æÛ4Ðarûbm\u007fúãË\u0096\u0010\ná\u007f2^V\u0085ÝÖn\u0082¾î¤*Á\u00105ÜýÞ^èÇ¡\u0010{×ÇC\u001e\u009b?0õ\u0014º\u0087Õ8ù\u0093{Lz\u0006\u000fÄí¤xºÁ|ú·\\Éw)Õc©u\u0006l\"í\u0013qº\u001e\u0000Èrãé\u0012\u0099\f\u008c\n Èû¨\u0000;cüY\"\u009dÁ<GÝK\u0083ÞåÏ\u009fÇ\u008c>DÖÔöµ\te\u0005."
         .length();
      char var14 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = d(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var36;
                  if ((var24 += var14) >= var17) {
                     g = var18;
                     h = new String[10];
                     r = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[5];
                     int var3 = 0;
                     String var4 = "o7á«3¡\u0083oM\u008e×4\u001aÞd\u0014Á\u007fè|!½r\u001c";
                     int var5 = "o7á«3¡\u0083oM\u008e×4\u001aÞd\u0014Á\u007fè|!½r\u001c".length();
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
                        byte var49 = -1;

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
                           long var57 = (var10[0] & 255L) << 56
                              | (var10[1] & 255L) << 48
                              | (var10[2] & 255L) << 40
                              | (var10[3] & 255L) << 32
                              | (var10[4] & 255L) << 24
                              | (var10[5] & 255L) << 16
                              | (var10[6] & 255L) << 8
                              | var10[7] & 255L;
                           switch (var49) {
                              case 0:
                                 var28[var10001] = var57;
                                 if (var2 >= var5) {
                                    p = var6;
                                    q = new Integer[5];
                                    short var42 = 1325;
                                    long var51 = 240395787483249479L ^ var20;
                                    don = new bes("X Item", 1.0F, -10.0F, 10.0F, 0.1F);
                                    short var43 = 4019;
                                    long var52 = 1987221480135717343L ^ var20;
                                    boo = new bes("Y Item", 1.0F, -10.0F, 10.0F, 0.1F);
                                    short var44 = 21990;
                                    long var53 = 140165374081248141L ^ var20;
                                    djx = new bes("Z Item", 1.0F, -10.0F, 10.0F, 0.1F);
                                    short var45 = 2816;
                                    long var54 = 8254655039519094126L ^ var20;
                                    aqe = new bes("Rot X", 0.0F, -180.0F, 180.0F, 1.0F);
                                    short var46 = 28831;
                                    long var55 = 7704118001324297970L ^ var20;
                                    afc = new bes("Rot Y", 0.0F, -180.0F, 180.0F, 1.0F);
                                    short var47 = 15339;
                                    long var56 = 5346198131752387972L ^ var20;
                                    bak = new bes("Rot Z", 0.0F, -180.0F, 180.0F, 1.0F);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var57;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "ãHº\u009a\u0093c~\u007f\u0089\u009fâ0x\u0006õa";
                                 var5 = "ãHº\u009a\u0093c~\u007f\u0089\u009fâ0x\u0006õa".length();
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
                           var49 = 0;
                        }
                     }
                  }

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var36;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label54;
                  }

                  var15 = "\u0017S9\u009b@io\u009fx\\\u0013\u0090K\u0001\u0086\u009fD^\u0082JèHâ5q\u0011i\fKÚ\u001cÇ\u009d¨\u0010¬ðÕ\u009an\u0010@\fN,~ÈÎzB\u000e\u009f\u0002Z&\u000f¸";
                  var17 = "\u0017S9\u009b@io\u009fx\\\u0013\u0090K\u0001\u0086\u009fD^\u0082JèHâ5q\u0011i\fKÚ\u001cÇ\u009d¨\u0010¬ðÕ\u009an\u0010@\fN,~ÈÎzB\u000e\u009f\u0002Z&\u000f¸"
                     .length();
                  var14 = '(';
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30019;
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
            throw new RuntimeException("cc/astralis/hin", var10);
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
         throw new RuntimeException("cc/astralis/hin" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21223;
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
            throw new RuntimeException("cc/astralis/hin", var14);
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
         throw new RuntimeException("cc/astralis/hin" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
