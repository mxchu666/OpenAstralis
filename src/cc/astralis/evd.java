package cc.astralis;

import dev.opalV2.Loader;
import dev.opalV2.hidden.Hidden0;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_241;

public class evd implements dlc {
   public static final float fuc = 0.221F;
   public static final float gdg = 0.520362F;
   public static final float fug = 0.3F;
   public static final float djz = 1.3F;
   private static int[] ctw;
   private static final long a;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;

   public static float fgd() {
      return (float)Math.toRadians(des(chi.field_1724.method_36454()));
   }

   public static float gep() {
      return des(chi.field_1724.method_36454());
   }

   public static float fnh() {
      return esw(chi.field_1724.method_36454(), false);
   }

   public static float des(float inputYaw) {
      return esw(a, true);
   }

   public static float esw(float inputYaw, boolean keys) {
      long ax = evd.a ^ 36939254575617L;
      class_241 axx = chi.field_1724.field_3913.method_3128();
      int[] var10000 = dar.abu();
      float axxx = a;
      float axxxx = 1.0F;
      int[] axxxxx = var10000;
      float var10;
      int var8 = (var10 = axx.field_1342 - 0.0F) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
      if (axxxxx != null) {
         if (var8 < 0) {
            axxx = a + 180.0F;
         }

         float var11;
         var8 = (var11 = axx.field_1342 - 0.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
      }

      label69: {
         label73: {
            if (axxxxx != null) {
               if (var8 < 0) {
                  axxxx = -0.5F;
                  if (axxxxx != null) {
                     break label73;
                  }
               }

               float var12;
               var8 = (var12 = axx.field_1342 - 0.0F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
            }

            if (axxxxx == null) {
               break label69;
            }

            if (var8 > 0) {
               axxxx = 0.5F;
            }
         }

         var8 = a;
      }

      if (axxxxx != null) {
         if (var8 == 0) {
            return axxx;
         }

         float var13;
         var8 = (var13 = axx.field_1343 - 0.0F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
      }

      if (axxxxx != null) {
         if (var8 > 0) {
            axxx -= 90.0F * axxxx;
         }

         if (axxxxx == null) {
            return axx.field_1343;
         }

         float var14;
         var8 = (var14 = axx.field_1343 - 0.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
      }

      if (var8 < 0) {
         axxx += 90.0F * axxxx;
      }

      return axxx;
   }

   public static void dyv() {
      dek(chd());
   }

   public static void dek(double speed) {
      label20: {
         long ax = evd.a ^ 90385851608168L;
         int[] var4 = dar.abu();
         if (var4 != null) {
            if (!dbj()) {
               break label20;
            }

            chi.field_1724.method_18800(-Math.sin(fgd()) * a, chi.field_1724.method_18798().field_1351, Math.cos(fgd()) * a);
         }

         if (var4 != null) {
            return;
         }
      }

      eeo();
   }

   public static void fdo(elx event, double speed) {
      label20: {
         long ax = evd.a ^ 57639617733804L;
         int[] var5 = dar.abu();
         if (var5 != null) {
            if (!dbj()) {
               break label20;
            }

            a.dof(-Math.sin(fgd()) * a);
            a.gni(Math.cos(fgd()) * a);
         }

         if (var5 != null) {
            return;
         }
      }

      eeo();
   }

   public static boolean bpi() {
      long var0 = a ^ 16964411562637L;
      int[] var2 = dar.abu();
      double var3;
      int var10000 = (var3 = Math.abs(chi.field_1724.method_18798().field_1352) - 0.05) == 0.0 ? 0 : (var3 < 0.0 ? -1 : 1);
      if (var2 != null) {
         if (var10000 <= 0) {
            return (boolean)0;
         }

         double var4;
         var10000 = (var4 = Math.abs(chi.field_1724.method_18798().field_1350) - 0.05) == 0.0 ? 0 : (var4 < 0.0 ? -1 : 1);
      }

      if (var2 == null) {
         return (boolean)var10000;
      } else {
         return (boolean)(var10000 > 0 ? 1 : 0);
      }
   }

   public static double fzm() {
      int[] a;
      boolean ax;
      double axx;
      label77: {
         boolean var6;
         label73: {
            label72: {
               label78: {
                  long axxx = evd.a ^ 29236538067373L;
                  int[] var10000 = dar.abu();
                  ax = false;
                  a = var10000;
                  var6 = chi.field_1724.method_5799();
                  if (a != null) {
                     if (var6) {
                        break label78;
                     }

                     var6 = chi.field_1724.method_5771();
                  }

                  if (a == null) {
                     break label73;
                  }

                  if (!var6) {
                     break label72;
                  }
               }

               axx = 0.11500001F;
               if (a != null) {
                  break label77;
               }
            }

            var6 = chi.field_1724.method_5715();
         }

         if (var6) {
            axx = 0.066300005F;
            if (a != null) {
               break label77;
            }
         }

         axx = 0.221F;
         ax = true;
      }

      boolean var7 = ax;
      if (a != null) {
         if (!ax) {
            return axx;
         }

         var7 = chi.field_1724.method_5624();
      }

      if (a != null) {
         if (var7) {
            axx *= 1.3F;
         }

         var7 = chi.field_1724.method_6059(class_1294.field_5904);
      }

      if (a != null) {
         if (var7) {
            axx *= 1.0 + 0.2 * (chi.field_1724.method_6112(class_1294.field_5904).method_5578() + 1);
         }

         var7 = chi.field_1724.method_6059(class_1294.field_5909);
      }

      if (var7) {
         axx = 0.29F;
      }

      return axx;
   }

   public static float cqz(float noSpeed, float speed1, float speed2) {
      long ax = evd.a ^ 52409091187391L;
      int[] var10000 = dar.abu();
      float axx = a;
      Iterator var7 = chi.field_1724.method_6026().iterator();
      int[] axxx = var10000;

      while (true) {
         if (var7.hasNext()) {
            class_1293 axxxx = (class_1293)var7.next();
            if (axxx == null) {
               break;
            }

            label45: {
               class_1293 var9 = axxxx;
               if (axxx != null) {
                  if (axxxx.method_5579() != class_1294.field_5904) {
                     break label45;
                  }

                  var9 = axxxx;
               }
               axx = switch (var9.method_5578()) {
                  case 0 -> a;
                  case 1 -> a;
                  default -> 0.0F;
               };
            }

            if (axxx != null) {
               continue;
            }
         }

         if (!chi.field_1724.method_6059(class_1294.field_5904)) {
            axx = a;
         }
         break;
      }

      return axx;
   }

   public static void eeo() {
      chi.field_1724.method_18800(0.0, chi.field_1724.method_18798().field_1351, 0.0);
   }

   public static boolean dbj() {
      long a = evd.a ^ 30313913434226L;
      int[] var10000 = dar.abu();
      class_241 ax = chi.field_1724.field_3913.method_3128();
      int[] axx = var10000;
      float var5;
      int var4 = (var5 = ax.field_1343 - 0.0F) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1);
      if (axx != null) {
         if (!var4) {
            float var6;
            int var7 = (var6 = ax.field_1342 - 0.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
            if (axx == null) {
               return (boolean)var7;
            }

            if (!var7) {
               return (boolean)0;
            }
         }

         var4 = 1;
      }

      return (boolean)var4;
   }

   public static boolean h() {
      long a = evd.a ^ 33337616659455L;
      int[] var10000 = dar.abu();
      class_241 ax = chi.field_1724.field_3913.method_3128();
      int[] axx = var10000;
      float var5;
      int var4 = (var5 = Math.abs(ax.field_1342) - 0.8F) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1);
      if (axx != null) {
         if (var4 < 0) {
            float var6;
            int var7 = (var6 = Math.abs(ax.field_1342) - 0.8F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
            if (axx == null) {
               return (boolean)var7;
            }

            if (var7 < 0) {
               return (boolean)0;
            }
         }

         var4 = 1;
      }

      return (boolean)var4;
   }

   public static double cvw(double motion, int ticks) {
      long ax = evd.a ^ 105598844981284L;
      int[] axx = dar.abu();
      if (a == 0) {
         return a;
      } else {
         double axxx = a;
         int axxxx = 0;

         double var10000;
         while (true) {
            if (axxxx < a) {
               var10000 = (axxx - 0.08) * 0.98F;
               if (axx == null) {
                  break;
               }

               axxx = var10000;
               axxxx++;
               if (axx != null) {
                  continue;
               }
            }

            var10000 = axxx;
            break;
         }

         return var10000;
      }
   }

   public static double chd() {
      return Math.hypot(chi.field_1724.method_18798().field_1352, chi.field_1724.method_18798().field_1350);
   }

   public static native void dnu(etk event, float yaw);

   public static double eve(float rotationYaw, double moveForward, double moveStrafing) {
      long ax = evd.a ^ 17065728863583L;
      int[] axx = dar.abu();
      if (a < 0.0) {
         a += 180.0F;
      }

      float axxx;
      int var10000;
      label52: {
         label56: {
            axxx = 1.0F;
            double var10;
            var10000 = (var10 = a - 0.0) == 0.0 ? 0 : (var10 < 0.0 ? -1 : 1);
            if (axx != null) {
               if (var10000 < 0) {
                  axxx = -0.5F;
                  if (axx != null) {
                     break label56;
                  }
               }

               double var11;
               var10000 = (var11 = a - 0.0) == 0.0 ? 0 : (var11 < 0.0 ? -1 : 1);
            }

            if (axx == null) {
               break label52;
            }

            if (var10000 > 0) {
               axxx = 0.5F;
            }
         }

         double var12;
         var10000 = (var12 = a - 0.0) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
      }

      if (axx != null) {
         if (var10000 > 0) {
            a -= 90.0F * axxx;
         }

         if (axx == null) {
            return a;
         }

         double var13;
         var10000 = (var13 = a - 0.0) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
      }

      if (var10000 < 0) {
         a += 90.0F * axxx;
      }

      return Math.toRadians(a);
   }

   public static double glu() {
      double a = Math.hypot(chi.field_1724.method_23317() - chi.field_1724.field_6014, chi.field_1724.method_23321() - chi.field_1724.field_5969)
         * cdr.aal
         * 20.0;
      return Math.round(a * 100.0) / 100.0;
   }

   public static boolean fsj() {
      long a = evd.a ^ 102819842943839L;
      boolean ax = chi.field_1690.field_1894.method_1434();
      boolean axx = chi.field_1690.field_1913.method_1434();
      int[] var10000 = dar.abu();
      boolean axxx = chi.field_1690.field_1849.method_1434();
      int[] axxxx = var10000;
      boolean var6 = ax;
      if (axxxx != null) {
         if (!ax) {
            return false;
         }

         var6 = axx;
      }

      if (axxxx == null) {
         return var6;
      } else if (var6) {
         return true;
      } else {
         return axxxx == null ? axxx : axxx;
      }
   }

   public static void clb(int[] var0) {
      ctw = var0;
   }

   public static int[] gqi() {
      return ctw;
   }

   static {
      Loader.registerNativesForClass(1, evd.class);
      Hidden0.special_clinit_1_230(evd.class);
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14737;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/evd", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
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
         throw new RuntimeException("cc/astralis/evd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
