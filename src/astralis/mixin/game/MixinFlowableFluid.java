package astralis.mixin.game;

import cc.astralis.dar;
import cc.astralis.edr;
import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_3609;
import net.minecraft.class_3610;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_2350.class_2353;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_3609.class})
public abstract class MixinFlowableFluid {
   @Shadow
   protected abstract boolean method_15749(class_1922 var1, class_2338 var2, class_2350 var3);

   @Inject(
      method = {"getVelocity"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getVelocityHook(class_1922 a, class_2338 a, class_3610 a, CallbackInfoReturnable<class_243> a) {
      edr ax = dar.gqy().aws().diy(edr.class);
      if (ax.dsv() && ax.gvb.dnp()) {
         double axx = 0.0;
         double axxx = 0.0;
         class_2339 axxxx = new class_2339();
         class_243 axxxxx = new class_243(axx, 0.0, axxx);
         if ((Boolean)a.method_11654(class_3609.field_15902)) {
            for (class_2350 axxxxxx : class_2353.field_11062) {
               axxxx.method_25505(a, axxxxxx);
               if (a.method_15749(a, axxxx, axxxxxx) || a.method_15749(a, axxxx.method_10084(), axxxxxx)) {
                  axxxxx = axxxxx.method_1029().method_1031(0.0, -6.0, 0.0);
                  break;
               }
            }
         }

         a.setReturnValue(axxxxx.method_1029());
      }
   }
}
