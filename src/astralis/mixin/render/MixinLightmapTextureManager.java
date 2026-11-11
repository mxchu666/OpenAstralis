package astralis.mixin.render;

import cc.astralis.bef;
import cc.astralis.dar;
import net.minecraft.class_7172;
import net.minecraft.class_765;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({class_765.class})
public class MixinLightmapTextureManager {
   @Redirect(
      method = {"update"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/option/SimpleOption;getValue()Ljava/lang/Object;",
         ordinal = 1
      )
   )
   private Object update(class_7172 a) {
      bef ax = dar.gqy().aws().diy(bef.class);
      return ax.dsv() ? 8.0 : a.method_41753();
   }
}
