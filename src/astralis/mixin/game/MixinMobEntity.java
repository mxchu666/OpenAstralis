package astralis.mixin.game;

import cc.astralis.dar;
import cc.astralis.giw;
import net.minecraft.class_1299;
import net.minecraft.class_1308;
import net.minecraft.class_1309;
import net.minecraft.class_1937;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1308.class})
public abstract class MixinMobEntity extends class_1309 {
   protected MixinMobEntity(class_1299<? extends class_1309> entityType, class_1937 world) {
      super(a, a);
   }

   @Inject(
      method = {"hasSaddleEquipped"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void HookEnityControleSaddel(CallbackInfoReturnable<Boolean> a) {
      if (dar.gqy().aws().diy(giw.class).dsv()) {
         a.setReturnValue(true);
      }
   }
}
