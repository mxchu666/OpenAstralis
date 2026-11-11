package cc.astralis;

import astralis.mixin.accessor.ClientPlayerInteractionManagerAccessor;
import net.minecraft.class_2596;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_7204;
import net.minecraft.class_746;

public class gix implements dlc {
   private static int[] bb;
   private static final long a = 5220360344971L;

   public static void fcd(class_2596<?> packet) {
      long ax = gix.a ^ 18498291160631L;
      int[] axx = dar.abu();
      class_746 var10000 = chi.field_1724;
      if (axx != null) {
         if (chi.field_1724 == null) {
            return;
         }

         var10000 = chi.field_1724;
      }

      class_634 var5 = var10000.field_3944;
      if (axx != null) {
         if (var10000.field_3944 == null) {
            return;
         }

         var5 = chi.field_1724.field_3944;
      }

      dmt axxx = (dmt)var5.method_48296();
      axxx.receiveNoEvent(a);
   }

   public static void eex(class_2596<?> packet) {
      long ax = gix.a ^ 86917963569961L;
      int[] axx = dar.abu();
      class_746 var10000 = chi.field_1724;
      if (axx != null) {
         if (chi.field_1724 == null) {
            return;
         }

         var10000 = chi.field_1724;
      }

      class_634 var5 = var10000.field_3944;
      if (axx != null) {
         if (var10000.field_3944 == null) {
            return;
         }

         var5 = chi.field_1724.field_3944;
      }

      dmt axxx = (dmt)var5.method_48296();
      axxx.sendNoEvent(a);
   }

   public static void dsd(class_2596<?> packet) {
      long ax = gix.a ^ 64092931290784L;
      int[] axx = dar.abu();
      class_746 var10000 = chi.field_1724;
      if (axx != null) {
         if (chi.field_1724 == null) {
            return;
         }

         var10000 = chi.field_1724;
      }

      class_634 var5 = var10000.field_3944;
      if (axx != null) {
         if (var10000.field_3944 == null) {
            return;
         }

         var5 = chi.field_1724.field_3944;
      }

      dmt axxx = (dmt)var5.method_48296();
      axxx.sendWithEvent(a);
   }

   public static void avn(class_7204 packetCreator) {
      long ax = gix.a ^ 3715236783731L;
      int[] var3 = dar.abu();
      class_310 var10000 = chi;
      if (var3 != null) {
         if (chi.field_1687 == null) {
            return;
         }

         var10000 = chi;
      }

      ((ClientPlayerInteractionManagerAccessor)var10000.field_1761).callSendSequencedPacket(chi.field_1687, a);
   }

   public static void fdw(class_2596<?> packet) {
      try {
         a.method_65081(chi.method_1562());
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public static void ewc(int[] var0) {
      bb = var0;
   }

   public static int[] bme() {
      return bb;
   }

   static {
      if (bme() == null) {
         ewc(new int[1]);
      }
   }
}
