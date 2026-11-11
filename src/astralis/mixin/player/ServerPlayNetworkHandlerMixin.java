package astralis.mixin.player;

import cc.astralis.dar;
import cc.astralis.fmj;
import net.minecraft.class_10387;
import net.minecraft.class_3222;
import net.minecraft.class_3244;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_3244.class})
public class ServerPlayNetworkHandlerMixin {
   @Shadow
   public class_3222 field_14140;

   @Inject(
      method = {"onPlayerLoaded"},
      at = {@At("TAIL")}
   )
   private void onPlayerJoin(class_10387 a, CallbackInfo a) {
      dar.gqy().fyf().brx(new fmj(System.currentTimeMillis()));
   }
}
