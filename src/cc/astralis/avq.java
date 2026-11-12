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
import net.minecraft.class_1309;
import net.minecraft.class_2338;
import net.minecraft.class_243;

public class avq extends guu {
   private final bes buo;
   private int cxe;
   private static final long a = 70067814014262L;
   private static final String g;
   private static final long[] h;
   private static final Integer[] i;
   private static final Map p;

   public avq() {
      long a = avq.a ^ 82634948245213L;
      super(bfm.MOVEMENT);
      a.buo = new bes(g, 3.0F, 0.0F, 10.0F, 0.1F);
      a.cxe = 1;
      a.bfi(new ffn[]{a.buo});
   }

   @gdz(4)
   public void ahs(elx event) {
      long ax = avq.a ^ 120878497251612L;
      int[] var10000 = dar.abu();
      double var10002 = a.buo.dnp().intValue();
      short var10003 = 26245;
      long var10004 = 5186733959573098595L ^ ax;
      a.efe(String.valueOf(ftb.hbp(var10002, 6)));
      int[] axx = var10000;
      class_1309 axxx = dar.gqy().aws().diy(ekb.class).gvw;
      eky axxxx = dar.gqy().aws().diy(eky.class);
      bni axxxxx = dar.gqy().aws().diy(bni.class);
      if (axxx != null) {
         int var13 = evd.dbj();
         if (axx != null) {
            if (var13 == 0) {
               return;
            }

            float var15;
            var13 = (var15 = chi.field_1724.method_5739(axxx) - 3.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
         }

         if (axx != null) {
            if (var13 > 0) {
               return;
            }

            var13 = axxxx.dsv();
         }

         label64: {
            if (axx != null) {
               if (var13 != 0) {
                  break label64;
               }

               var13 = axxxxx.dsv();
            }

            if (var13 == 0) {
               return;
            }
         }

         double axxxxxx;
         float axxxxxxx;
         label50: {
            label49: {
               axxxxxx = evd.chd();
               axxxxxxx = dgq.dxs(axxx)[0];
               class_243 axxxxxxxx = new class_243(
                  -Math.sin(Math.toRadians(chi.field_1724.method_36454())) * a.cxe, 0.0, Math.cos(Math.toRadians(chi.field_1724.method_36454())) * a.cxe
               );
               class_243 axxxxxxxxx = chi.field_1724.method_73189().method_1019(axxxxxxxx.method_1021(axxxxxx));
               boolean var14 = chi.field_1687
                  .method_8320(new class_2338((int)axxxxxxxxx.field_1352, (int)axxxxxxxxx.field_1351, (int)axxxxxxxxx.field_1350))
                  .method_26215();
               if (axx != null) {
                  if (!var14) {
                     break label49;
                  }

                  var14 = chi.field_1724.field_5976;
               }

               if (!var14) {
                  break label50;
               }
            }

            a.cxe = -a.cxe;
         }

         azr(a, axxxxxx, axxxxxxx, a.cxe, chi.field_1724.method_5739(axxx) <= a.buo.dnp().floatValue() ? 0.0 : 1.0);
      }
   }

   @gdz
   public void awh(bsm event) {
      long ax = avq.a ^ 28599393816904L;
      int[] var10000 = dar.abu();
      class_1309 axx = dar.gqy().aws().diy(ekb.class).gvw;
      int[] axxx = var10000;
      if (axxx != null) {
         if (axx == null) {
            return;
         }

         bqf.aag(a.bus(), axx, a.buo.dnp().floatValue());
      }
   }

   public static void azr(elx moveEvent, double moveSpeed, float yaw, double strafe, double forward) {
      long ax = avq.a ^ 39882610609800L;
      int[] axx = dar.abu();
      double var10000 = a;
      if (axx != null) {
         if (a != 0.0) {
            float var19;
            label68: {
               double var26;
               int var10001 = (var26 = a - 0.0) == 0.0 ? 0 : (var26 < 0.0 ? -1 : 1);
               if (axx != null) {
                  if (var10001 > 0) {
                     double var27;
                     int var20 = (var27 = a - 0.0) == 0.0 ? 0 : (var27 < 0.0 ? -1 : 1);
                     if (axx != null) {
                        if (var20 > 0) {
                           short var21 = 21235;
                           long var24 = 6229066711129893767L ^ ax;
                           var20 = -45;
                        } else {
                           short var22 = 17212;
                           long var25 = 6598539049297590857L ^ ax;
                           var20 = 45;
                        }
                     }

                     var19 = var20;
                     break label68;
                  }

                  double var28;
                  var10001 = (var28 = a - 0.0) == 0.0 ? 0 : (var28 < 0.0 ? -1 : 1);
               }

               label55: {
                  if (axx != null) {
                     if (var10001 >= 0) {
                        var10001 = 0;
                        break label55;
                     }

                     double var29;
                     var10001 = (var29 = a - 0.0) == 0.0 ? 0 : (var29 < 0.0 ? -1 : 1);
                  }

                  if (axx != null) {
                     if (var10001 > 0) {
                        short var17 = 7334;
                        long var10002 = 5747110825395971537L ^ ax;
                        var10001 = 45;
                     } else {
                        short var18 = 11493;
                        long var23 = 405631583200531859L ^ ax;
                        var10001 = -45;
                     }
                  }
               }

               var19 = var10001;
            }

            a += var19;
            a = 0.0;
            a = Math.signum(a);
         }

         a = Math.signum(a);
         var10000 = Math.toRadians(a + 90.0F);
      }

      double axxx = var10000;
      double axxxx = Math.cos(axxx);
      double axxxxx = Math.sin(axxx);
      a.dof(a * a * axxxx + a * a * axxxxx);
      a.gni(a * a * axxxxx - a * a * axxxx);
   }

   static {
      long var11 = a ^ 18173412973210L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("Range".getBytes("ISO-8859-1"));
      String var22 = d(var15).intern();
      int var10001 = -1;
      g = var22;
      p = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[5];
      int var3 = 0;
      String var4 = "ÿ\u0095UE20È\u0010FÞ§>on\u0092?ûÖ\"\u007fô\u0092t\u001b";
      int var5 = "ÿ\u0095UE20È\u0010FÞ§>on\u0092?ûÖ\"\u007fô\u0092t\u001b".length();
      byte var2 = 0;

      label29:
      while (true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var18 = var6;
         var10001 = var3++;
         long var24 = (var7[0] & 255L) << 56
            | (var7[1] & 255L) << 48
            | (var7[2] & 255L) << 40
            | (var7[3] & 255L) << 32
            | (var7[4] & 255L) << 24
            | (var7[5] & 255L) << 16
            | (var7[6] & 255L) << 8
            | var7[7] & 255L;
         byte var27 = -1;

         while (true) {
            long var8 = var24;
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
            long var29 = (var10[0] & 255L) << 56
               | (var10[1] & 255L) << 48
               | (var10[2] & 255L) << 40
               | (var10[3] & 255L) << 32
               | (var10[4] & 255L) << 24
               | (var10[5] & 255L) << 16
               | (var10[6] & 255L) << 8
               | var10[7] & 255L;
            switch (var27) {
               case 0:
                  var18[var10001] = var29;
                  if (var2 >= var5) {
                     h = var6;
                     i = new Integer[5];
                     return;
                  }
                  break;
               default:
                  var18[var10001] = var29;
                  if (var2 < var5) {
                     continue label29;
                  }

                  var4 = "¬\\½îÜ\u0019óph5¯¼ù¥\u0000·";
                  var5 = "¬\\½îÜ\u0019óph5¯¼ù¥\u0000·".length();
                  var2 = 0;
            }

            byte var21 = var2;
            var2 += 8;
            var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
            var18 = var6;
            var10001 = var3++;
            var24 = (var7[0] & 255L) << 56
               | (var7[1] & 255L) << 48
               | (var7[2] & 255L) << 40
               | (var7[3] & 255L) << 32
               | (var7[4] & 255L) << 24
               | (var7[5] & 255L) << 16
               | (var7[6] & 255L) << 8
               | var7[7] & 255L;
            var27 = 0;
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27336;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/avq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
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
         throw new RuntimeException("cc/astralis/avq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
