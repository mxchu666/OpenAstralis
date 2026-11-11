package astralis.mixin.input;

import cc.astralis.dar;
import cc.astralis.eov;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_636.class})
public class MixinClientPlayerInteractionManager {
   @Shadow
   private int field_3716;

   @Inject(
      method = {"attackEntity"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerInteractionManager;syncSelectedSlot()V",
         shift = Shift.AFTER
      )}
   )
   private void hookAttack(class_1657 a, class_1297 a, CallbackInfo a) {
      dar.gqy().fyf().brx(new eov(a));
   }
}
