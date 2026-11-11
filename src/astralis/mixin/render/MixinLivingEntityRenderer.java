package astralis.mixin.render;

import cc.astralis.cxx;
import cc.astralis.dar;
import cc.astralis.der;
import cc.astralis.dlc;
import cc.astralis.dqq;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.class_10042;
import net.minecraft.class_1309;
import net.minecraft.class_3532;
import net.minecraft.class_3883;
import net.minecraft.class_583;
import net.minecraft.class_897;
import net.minecraft.class_922;
import net.minecraft.class_5617.class_5618;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_922.class})
public abstract class MixinLivingEntityRenderer<T extends class_1309, S extends class_10042, M extends class_583<? super S>>
   extends class_897<T, S>
   implements dlc,
   class_3883<S, M> {
   protected MixinLivingEntityRenderer(class_5618 ctx) {
      super(a);
   }

   @Inject(
      method = {"hasLabel*"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hideNametags(T a, double a, CallbackInfoReturnable<Boolean> a) {
      if (a == chi.field_1724) {
         a.setReturnValue(true);
      } else {
         a.setReturnValue(!dar.gqy().aws().diy(der.class).dsv() && dar.gqy().aws().diy(der.class) != null);
      }
   }

   @ModifyExpressionValue(
      method = {"updateRenderState(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;F)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/util/math/MathHelper;lerpAngleDegrees(FFF)F"
      )}
   )
   private float hookHeadYaw(float a, class_1309 a, S a, float a) {
      if (a == chi.field_1724 && dqq.bzx) {
         cxx ax = (cxx)a;
         if (!ax.serenium_isInInventory()) {
            return class_3532.method_17821(a, ax.serenium_getPrevHeadYaw(), ax.serenium_getHeadYaw());
         }
      }

      return a;
   }

   @ModifyExpressionValue(
      method = {"updateRenderState(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;F)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;getLerpedPitch(F)F"
      )}
   )
   private float hookPitch(float a, class_1309 a, S a, float a) {
      if (a == chi.field_1724 && dqq.bzx) {
         cxx ax = (cxx)a;
         if (!ax.serenium_isInInventory()) {
            return class_3532.method_17821(a, ax.serenium_getPrevHeadPitch(), ax.serenium_getHeadPitch());
         }
      }

      return a;
   }
}
