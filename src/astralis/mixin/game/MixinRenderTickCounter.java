package astralis.mixin.game;

import cc.astralis.cdr;
import it.unimi.dsi.fastutil.floats.FloatUnaryOperator;
import net.minecraft.class_9779.class_9781;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_9781.class})
public class MixinRenderTickCounter {
   @Shadow
   private float field_51958;
   @Shadow
   private float field_51959;
   @Shadow
   private long field_51962;
   @Shadow
   @Final
   private float field_51964;
   @Shadow
   @Final
   private FloatUnaryOperator field_51965;

   @Inject(
      method = {"beginRenderTick(J)I"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void overrideBeginRenderTick(long a, CallbackInfoReturnable<Integer> a) {
      a.field_51958 = (float)(a - a.field_51962) / a.field_51965.apply(a.field_51964);
      a.field_51958 = a.field_51958 * cdr.aal;
      a.field_51962 = a;
      a.field_51959 = a.field_51959 + a.field_51958;
      int ax = (int)a.field_51959;
      a.field_51959 -= ax;
      a.setReturnValue(ax);
   }
}
