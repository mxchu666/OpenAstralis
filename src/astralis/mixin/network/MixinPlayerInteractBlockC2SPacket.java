package astralis.mixin.network;

import net.minecraft.class_2540;
import net.minecraft.class_2885;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_2885.class})
public class MixinPlayerInteractBlockC2SPacket {
   @Inject(
      method = {"write"},
      at = {@At("HEAD")}
   )
   private void write(class_2540 a, CallbackInfo a) {
   }
}
