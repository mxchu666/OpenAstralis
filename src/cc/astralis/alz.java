package cc.astralis;

import net.minecraft.class_1657;
import net.minecraft.class_1747;
import net.minecraft.class_1799;

public class alz {
   public double fhs;
   public int dfw;
   public int djk;
   public int ace;
   public int ajo;
   public int gab;
   public double bfc;
   public int gjk;
   public int hjp;
   public double bse;
   public boolean fno;
   public double fws;
   public double flg;
   public double emc;
   public double dnh;
   public String hdy;
   public class_1657 fyt;
   private static final long a = 59786579354115L;

   public void efg(class_1657 player) {
      int[] ax;
      int axx;
      label157: {
         long axxx = alz.a ^ 12771102120207L;
         int[] var10000 = dar.abu();
         axx = a.field_6012;
         ax = var10000;
         a.fyt = a;
         a.hdy = a.method_5477().getString();
         a.fws = a.method_23317() - a.field_6014;
         a.bse = a.method_23318() - a.field_6036;
         a.bfc = a.method_23321() - a.field_5969;
         a.fhs = Math.max(Math.abs(a.fws), Math.abs(a.bfc));
         alz var7 = a;
         if (ax != null) {
            if (a.fhs >= 0.07) {
               a.djk++;
               a.ajo = axx;
               if (ax != null) {
                  break label157;
               }
            }

            var7 = a;
         }

         var7.djk = 0;
      }

      double var13;
      int var8 = (var13 = Math.abs(a.bse) - 0.1) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
      if (ax != null) {
         if (var8 >= 0) {
            a.dfw = axx;
         }

         var8 = a.method_5715();
      }

      if (ax != null) {
         if (var8 != 0) {
            a.gab = axx;
         }

         float var14;
         var8 = (var14 = a.field_6251 - 0.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
      }

      label147: {
         label146: {
            if (ax != null) {
               if (var8 <= 0) {
                  break label146;
               }

               var8 = a.method_6039();
            }

            if (var8 != 0) {
               a.ace++;
               if (ax != null) {
                  break label147;
               }
            }
         }

         a.ace = 0;
      }

      label137: {
         label136: {
            boolean var9 = a.method_5624();
            if (ax != null) {
               if (!var9) {
                  break label136;
               }

               var9 = a.method_6115();
            }

            if (var9) {
               a.hjp++;
               if (ax != null) {
                  break label137;
               }
            }
         }

         a.hjp = 0;
      }

      label160: {
         class_1657 var10 = a;
         if (ax != null) {
            if (!(a.method_36455() >= 70.0F)) {
               break label160;
            }

            var10 = a;
         }

         label161: {
            class_1799 axxx = var10.method_6047();
            boolean var11 = axxx.method_7960();
            if (ax != null) {
               if (var11) {
                  break label161;
               }

               var11 = axxx.method_7909() instanceof class_1747;
            }

            if (ax != null) {
               if (!var11) {
                  break label161;
               }

               var11 = a.field_6252;
            }

            label162: {
               if (ax != null) {
                  if (!var11) {
                     break label161;
                  }

                  var12 = a;
                  if (ax == null) {
                     break label162;
                  }

                  var11 = a.fno;
               }

               if (!var11 && a.method_5715()) {
                  a.gjk++;
                  if (ax != null) {
                     break label161;
                  }
               }

               var12 = a;
            }

            var12.gjk = 0;
         }

         if (ax != null) {
            return;
         }
      }

      a.gjk = 0;
   }

   public void auw(class_1657 player) {
      a.fno = a.method_5715();
   }

   public void doa(class_1657 player) {
      a.flg = a.method_23317();
      a.emc = a.method_23318();
      a.dnh = a.method_23321();
   }
}
