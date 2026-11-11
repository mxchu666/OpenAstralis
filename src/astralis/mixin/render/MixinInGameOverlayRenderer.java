package astralis.mixin.render;

import cc.astralis.dar;
import cc.astralis.di;
import net.minecraft.class_1058;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4603;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_4603.class})
public class MixinInGameOverlayRenderer {
   @Inject(
      method = {"renderFireOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void renderNofire(class_4587 a, class_4597 a, class_1058 a, CallbackInfo a) {
      di ax = dar.gqy().aws().diy(di.class);
      if (ax.dsv() && ax.eyg.dnp()) {
         a.cancel();
      }
   }

   @Inject(
      method = {"renderUnderwaterOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void renderNowater(class_310 a, class_4587 a, class_4597 a, CallbackInfo a) {
      di ax = dar.gqy().aws().diy(di.class);
      if (ax.dsv() && ax.gpx.dnp()) {
         a.cancel();
      }
   }
}
