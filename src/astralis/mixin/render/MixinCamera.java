package astralis.mixin.render;

import cc.astralis.dar;
import cc.astralis.hin;
import net.minecraft.class_4184;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_4184.class})
public class MixinCamera {
   @Inject(
      method = {"clipToSpace"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void hookCameraNoClip(float f, CallbackInfoReturnable<Float> cir) {
      hin ax = dar.gqy().aws().diy(hin.class);
      if (ax.dsv() && ax.ahi.dnp() && ax.gff.dnp()) {
         a.setReturnValue(a);
      }
   }
}
