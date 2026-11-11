package cc.astralis;

import net.minecraft.class_1657;
import net.minecraft.class_243;

public class gbg {
   private class_243 fkk = class_243.field_1353;
   private class_243 fru = class_243.field_1353;
   private class_243 aeu = class_243.field_1353;
   public static final double cxx = 0.08;
   public static final double bts = 0.91;
   public static final double fcz = 0.8;
   public static final double hki = 0.5;
   public static final double bru = 0.6;
   public static final double dda = 1.3;
   public static final double euv = 0.3;
   public static final double br = 0.42;
   public static final double grh = 0.003;
   public static final double ahs = 1.0E-4;
   private static final long a = 85542947857271L;

   public class_243 hai(class_1657 player, alz playerData) {
      class_243 ax = new class_243(a.method_23317(), a.method_23318(), a.method_23321());
      class_243 axx = a.esq(ax);
      double axxx = ax.field_1352 + axx.field_1352;
      double axxxx = a.acc(a, axx);
      double axxxxx = ax.field_1350 + axx.field_1350;
      class_243 axxxxxx = new class_243(axxx, axxxx, axxxxx);
      axxxxxx = a.afd(a, axxxxxx, axx);
      a.add(ax);
      return axxxxxx;
   }

   private class_243 esq(class_243 a) {
      long ax = gbg.a ^ 25928794889842L;
      int[] axx = dar.abu();
      class_243 var10000 = a.fkk;
      class_243 var10001 = class_243.field_1353;
      if (axx != null) {
         if (a.fkk.equals(class_243.field_1353)) {
            return class_243.field_1353;
         }

         var10000 = a;
         var10001 = a.fkk;
      }

      class_243 axxx = var10000.method_1020(var10001);
      int var6 = a.aeu.equals(class_243.field_1353);
      if (axx != null) {
         if (var6 == 0) {
            axxx = new class_243(
               axxx.field_1352 * 0.7 + a.aeu.field_1352 * 0.3, axxx.field_1351 * 0.7 + a.aeu.field_1351 * 0.3, axxx.field_1350 * 0.7 + a.aeu.field_1350 * 0.3
            );
         }

         double var8;
         var6 = (var8 = Math.abs(axxx.field_1352) - 0.003) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
      }

      if (axx != null) {
         if (var6 < 0) {
            axxx = new class_243(0.0, axxx.field_1351, axxx.field_1350);
         }

         double var9;
         var6 = (var9 = Math.abs(axxx.field_1351) - 0.003) == 0.0 ? 0 : (var9 < 0.0 ? -1 : 1);
      }

      if (axx != null) {
         if (var6 < 0) {
            axxx = new class_243(axxx.field_1352, 0.0, axxx.field_1350);
         }

         if (axx == null) {
            return axxx;
         }

         double var10;
         var6 = (var10 = Math.abs(axxx.field_1350) - 0.003) == 0.0 ? 0 : (var10 < 0.0 ? -1 : 1);
      }

      if (var6 < 0) {
         axxx = new class_243(axxx.field_1352, axxx.field_1351, 0.0);
      }

      a.aeu = axxx;
      return axxx;
   }

   private double acc(class_1657 a, class_243 a) {
      double ax;
      label45: {
         long axx = gbg.a ^ 130015879528845L;
         int[] var10000 = dar.abu();
         ax = a.method_23318();
         int[] axxx = var10000;
         int var8 = a.method_24828();
         if (axxx != null) {
            if (var8 == 0) {
               break label45;
            }

            var8 = a.amq(a, a);
         }

         if (axxx != null) {
            if (var8 != 0) {
               ax += 0.42;
               if (axxx != null) {
                  return ax;
               }
            }

            if (axxx == null) {
               return a.field_1351;
            }

            double var10;
            var8 = (var10 = a.field_1351 - 0.0) == 0.0 ? 0 : (var10 < 0.0 ? -1 : 1);
         }

         if (var8 <= 0) {
            return ax;
         }

         ax += a.field_1351 - 0.08;
         if (axxx != null) {
            return ax;
         }
      }

      ax += (a.field_1351 - 0.08) * 0.91;
      return ax;
   }

   private boolean amq(class_1657 a, class_243 a) {
      long ax = gbg.a ^ 61392000023550L;
      int[] var5 = dar.abu();
      int var10000 = a.method_24828();
      if (var5 != null) {
         if (var10000 == 0) {
            return (boolean)0;
         }

         double var6;
         var10000 = (var6 = a.field_1351 - 0.1) == 0.0 ? 0 : (var6 < 0.0 ? -1 : 1);
      }

      if (var5 != null) {
         if (var10000 <= 0) {
            return (boolean)0;
         }

         var10000 = a.method_5715();
      }

      if (var5 == null) {
         return (boolean)var10000;
      } else {
         return (boolean)(var10000 == 0 ? 1 : 0);
      }
   }

   private class_243 afd(class_1657 a, class_243 a, class_243 a) {
      long ax = gbg.a ^ 129735228671183L;
      int[] var10000 = dar.abu();
      double axx = a.field_1352;
      double axxx = a.field_1350;
      int[] axxxx = var10000;
      double axxxxx = a.cvm(a);
      int var15 = a.method_5799();
      if (axxxx != null) {
         if (var15 != 0) {
            axxxxx *= 0.8;
         }

         var15 = a.method_5771();
      }

      if (axxxx != null) {
         if (var15 != 0) {
            axxxxx *= 0.5;
         }

         var15 = a.method_5624();
      }

      if (axxxx != null) {
         if (var15 != 0) {
            axxxxx *= 1.3;
         }

         var15 = a.method_5715();
      }

      if (axxxx != null) {
         if (var15 != 0) {
            axxxxx *= 0.3;
         }

         double var16;
         var15 = (var16 = a.method_37268() - 1.0E-4) == 0.0 ? 0 : (var16 < 0.0 ? -1 : 1);
      }

      if (axxxx != null) {
         var15 = var15 > 0 ? 1 : 0;
      }

      boolean axxxxxx = (boolean)var15;
      if (axxxx != null) {
         if (axxxxxx != 0) {
            axx = a.field_1352 + a.field_1352 * axxxxx;
            axxx = a.field_1350 + a.field_1350 * axxxxx;
            if (axxxx != null) {
               return new class_243(axx, a.field_1351, axxx);
            }
         }

         axx = a.field_1352 + a.field_1352 * axxxxx * 0.2;
      }

      axxx = a.field_1350 + a.field_1350 * axxxxx * 0.2;
      return new class_243(axx, a.field_1351, axxx);
   }

   private double cvm(class_1657 a) {
      long ax = gbg.a ^ 16414344771765L;
      return a.method_24828() ? 0.6 : 0.91;
   }

   public boolean gqy(class_243 actualPos, class_243 predictedPos, double threshold) {
      long ax = gbg.a ^ 69485557568304L;
      int[] var10000 = dar.abu();
      double axx = a.method_1022(a);
      int[] axxx = var10000;
      double var11;
      int var10 = (var11 = axx - a) == 0.0 ? 0 : (var11 < 0.0 ? -1 : 1);
      if (axxx != null) {
         var10 = var10 > 0 ? 1 : 0;
      }

      return (boolean)var10;
   }

   public double bwi(class_243 actualPos, class_243 predictedPos) {
      return a.method_1022(a);
   }

   public double efm(class_243 actualPos, class_243 predictedPos) {
      double ax = a.field_1352 - a.field_1352;
      double axx = a.field_1350 - a.field_1350;
      return Math.sqrt(ax * ax + axx * axx);
   }

   public double aci(class_243 actualPos, class_243 predictedPos) {
      return Math.abs(a.field_1351 - a.field_1351);
   }

   private void add(class_243 a) {
      a.fru = a.fkk;
      a.fkk = a;
   }

   public void awk() {
      a.fkk = class_243.field_1353;
      a.fru = class_243.field_1353;
      a.aeu = class_243.field_1353;
   }
}
