package astralis.mixin.input;

import cc.astralis.dar;
import cc.astralis.dlc;
import cc.astralis.hao;
import net.minecraft.class_11908;
import net.minecraft.class_309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_309.class})
public class MixinKeyBoard implements dlc {
   @Inject(
      method = {"onKey"},
      at = {@At("HEAD")}
   )
   private void onPress(long a, int a, class_11908 a, CallbackInfo a) {
      if (a == 1 && chi.field_1755 == null) {
         dar.gqy().fyf().brx(new hao(a.comp_4795()));
      }
   }
}
