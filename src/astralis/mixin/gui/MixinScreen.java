package astralis.mixin.gui;

import net.minecraft.class_332;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_437.class})
public abstract class MixinScreen {
   @Unique
   private long startTime;

   @Inject(
      method = {"renderBackground(Lnet/minecraft/client/gui/DrawContext;IIF)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderShaderBackground(class_332 a, int a, int a, float a, CallbackInfo a) {
   }
}
