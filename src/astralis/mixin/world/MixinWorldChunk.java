package astralis.mixin.world;

import cc.astralis.fki;
import net.minecraft.class_2338;
import net.minecraft.class_2586;
import net.minecraft.class_2818;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_2818.class})
public class MixinWorldChunk {
   @Inject(
      method = {"setBlockEntity"},
      at = {@At("TAIL")}
   )
   private void astr$beAdded(class_2586 a, CallbackInfo a) {
      if (fki.ces()) {
         if (a != null) {
            fki.afq((class_2818)a, a);
         }
      }
   }

   @Inject(
      method = {"removeBlockEntity"},
      at = {@At("TAIL")}
   )
   private void astr$beRemoved(class_2338 a, CallbackInfo a) {
      if (fki.ces()) {
         fki.gd((class_2818)a, a);
      }
   }
}
