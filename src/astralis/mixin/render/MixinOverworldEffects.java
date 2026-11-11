package astralis.mixin.render;

import cc.astralis.dar;
import cc.astralis.dk;
import java.awt.Color;
import net.minecraft.class_243;
import net.minecraft.class_5294.class_5297;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_5297.class})
public class MixinOverworldEffects {
   @Inject(
      method = {"adjustFogColor"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onAdjustFogColor(class_243 a, float a, CallbackInfoReturnable<class_243> a) {
      dk ax = dar.gqy().aws().diy(dk.class);
      if (ax != null && ax.dsv() && ax.eyj.dnp()) {
         Color axx = ax.axb.dnp();
         class_243 axxx = new class_243(axx.getRed() / 255.0, axx.getGreen() / 255.0, axx.getBlue() / 255.0);
         a.setReturnValue(axxx);
      }
   }
}
