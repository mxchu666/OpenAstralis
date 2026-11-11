package astralis.mixin.player;

import cc.astralis.cxx;
import cc.astralis.dar;
import cc.astralis.dgp;
import cc.astralis.dqq;
import cc.astralis.epn;
import cc.astralis.gpy;
import net.minecraft.class_11368;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1297.class})
public abstract class MixinEntity {
   @Shadow
   public abstract class_243 method_5631(float var1, float var2);

   @Shadow
   public abstract float method_36455();

   @Shadow
   public abstract float method_36454();

   @Inject(
      method = {"getRotationVec"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void injectFakeRotation(float tickDelta, CallbackInfoReturnable<class_243> cir) {
      if (a == class_310.method_1551().field_1724 && dqq.bzx) {
         a.setReturnValue(a.method_5631(dqq.epd, dqq.ahd));
      }
   }

   @Inject(
      method = {"readData"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/Entity;setBodyYaw(F)V"
      )}
   )
   public void hookUpdateHeadRotation(class_11368 view, CallbackInfo ci) {
      if (a instanceof class_1309 && dqq.bzx) {
         cxx ax = (cxx)a;
         ax.serenium_setHeadYaw(a.method_36454());
         ax.serenium_setHeadPitch(a.method_36455());
      }
   }

   @Inject(
      method = {"updateVelocity"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void weeeooooUpdateVelo(float a, class_243 a, CallbackInfo a) {
      if (a instanceof class_1657) {
         dgp ax = new dgp(a, gpy.PRE);
         dar.gqy().fyf().brx(ax);
         if (ax.fmc()) {
            a.cancel();
            return;
         }
      }
   }

   @Inject(
      method = {"updateVelocity"},
      at = {@At("TAIL")},
      cancellable = true
   )
   private void updateVelo(float a, class_243 a, CallbackInfo a) {
      if (a instanceof class_1657) {
         dgp ax = new dgp(a, gpy.POST);
         dar.gqy().fyf().brx(ax);
         if (ax.fmc()) {
            a.cancel();
            return;
         }
      }
   }

   @Shadow
   public static class_243 method_18795(class_243 movementInput, float speed, float yaw) {
      return null;
   }

   @Redirect(
      method = {"adjustMovementForCollisions(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/Entity;getStepHeight()F"
      )
   )
   private float hookStepHeight(class_1297 a) {
      return a.method_49476();
   }

   @Redirect(
      method = {"updateVelocity"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/Entity;movementInputToVelocity(Lnet/minecraft/util/math/Vec3d;FF)Lnet/minecraft/util/math/Vec3d;"
      )
   )
   public class_243 hookVelocity(class_243 movementInput, float speed, float yaw) {
      if (a == class_310.method_1551().field_1724) {
         epn ax = new epn(a);
         dar.gqy().fyf().brx(ax);
         a = ax.dfs();
      }

      return method_18795(a, a, a);
   }
}
