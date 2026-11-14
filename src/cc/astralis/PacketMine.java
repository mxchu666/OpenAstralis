package cc.astralis;

import net.minecraft.class_2720;
import net.minecraft.class_2856;
import net.minecraft.class_2856.class_2857;

public class PacketMine extends guu {
   private static final long a = 111523741872100L;

   public PacketMine() {
      super(bfm.EXPLOIT);
   }

   @gdz
   public void cvl(amo event) {
      long ax = PacketMine.a ^ 73066390570491L;
      int[] var4 = dar.abu();
      amo var10000 = a;
      if (var4 != null) {
         if (a.cud() == gpy.SEND) {
            return;
         }

         var10000 = a;
      }

      if (var4 != null) {
         if (!(var10000.bed() instanceof class_2720)) {
            return;
         }

         var10000 = a;
      }

      var10000.gmm(true);
      gix.eex(new class_2856(chi.field_1724.method_5667(), class_2857.field_13016));
      gix.eex(new class_2856(chi.field_1724.method_5667(), class_2857.field_47704));
      gix.eex(new class_2856(chi.field_1724.method_5667(), class_2857.field_13017));
   }
}
