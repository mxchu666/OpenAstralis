package astralis.mixin.render;

import cc.astralis.dar;
import cc.astralis.dk;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import net.minecraft.class_465;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_465.class})
public class MixinHandledScreen extends class_437 {
   protected MixinHandledScreen(class_2561 title) {
      super(a);
   }

   @Inject(
      method = {"renderBackground"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/screen/ingame/HandledScreen;drawBackground(Lnet/minecraft/client/gui/DrawContext;FII)V",
         shift = Shift.BEFORE
      )}
   )
   private void blur$renderContainerBlur(class_332 a, int a, int a, float a, CallbackInfo a) {
      dk ax = dar.gqy().aws().diy(dk.class);
      if (ax.dsv() && ax.chd.dnp()) {
         a.method_57734(a);
      }
   }
}
