package astralis.mixin.player;

import cc.astralis.ab;
import cc.astralis.bav;
import cc.astralis.cxx;
import cc.astralis.dar;
import cc.astralis.dlc;
import cc.astralis.dqq;
import cc.astralis.dxd;
import cc.astralis.fhd;
import cc.astralis.gwj;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1657.class})
public abstract class MixinPlayerEntity extends class_1309 {
   protected MixinPlayerEntity(class_1299<? extends class_1309> entityType, class_1937 world) {
      super(a, a);
   }

   @Inject(
      method = {"tickMovement"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/entity/player/PlayerEntity;headYaw:F"
      )}
   )
   public void updateHeadRotation(CallbackInfo ci) {
      float ax = a.method_36454();
      float axx = a.method_36455();
      if (a == class_310.method_1551().field_1724 && dqq.bzx) {
         ax = dqq.ahd;
         axx = dqq.epd;
      }

      ((cxx)a).serenium_setHeadYaw(ax);
      ((cxx)a).serenium_setHeadPitch(axx);
   }

   @Inject(
      method = {"attack"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/player/PlayerEntity;setVelocity(Lnet/minecraft/util/math/Vec3d;)V"
      )},
      cancellable = true
   )
   private void onSetVelocity(class_1297 a, CallbackInfo a) {
      if (a == class_310.method_1551().field_1724) {
         gwj ax = new gwj();
         dar.gqy().fyf().brx(ax);
         if (ax.fmc()) {
            a.cancel();
         }
      }
   }

   @Inject(
      method = {"attack"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/player/PlayerEntity;setSprinting(Z)V"
      )},
      cancellable = true
   )
   private void onSetSprinting(class_1297 a, CallbackInfo a) {
      if (a == class_310.method_1551().field_1724) {
         class_1657 ax = (class_1657)a;
         gwj axx = new gwj();
         dar.gqy().fyf().brx(axx);
         if (axx.fmc()) {
            ax.method_5728(true);
            a.cancel();
         }
      }
   }

   @Inject(
      method = {"clipAtLedge"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void ClipatEdgeSafewalk(CallbackInfoReturnable<Boolean> cir) {
      if (a == dlc.chi.field_1724) {
         ab ax = dar.gqy().aws().diy(ab.class);
         fhd axx = dar.gqy().aws().diy(fhd.class);
         if (ax.dsv()) {
            if (ax.dds.dnp() && !bav.cdc()) {
               return;
            }

            if (ax.hcs.dnp() && !dlc.chi.field_1690.field_1881.method_1434()) {
               return;
            }

            if (ax.cup.dnp() && dlc.chi.field_1724.method_36455() <= 60.0F) {
               return;
            }

            a.setReturnValue(true);
         }
      }
   }

   @Inject(
      method = {"getBlockInteractionRange"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void getBlockInteractionRangeHook(CallbackInfoReturnable<Double> cir) {
      dxd ax = dar.gqy().aws().diy(dxd.class);
      if (ax != null) {
         if (ax.dsv() && ax.dnp.dnp()) {
            a.setReturnValue((double)ax.ffi.dnp().floatValue());
         }
      }
   }

   @Inject(
      method = {"getEntityInteractionRange"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void getEntityInteractionRangeHook(CallbackInfoReturnable<Double> cir) {
      dxd ax = dar.gqy().aws().diy(dxd.class);
      if (ax != null) {
         if (ax.dsv()) {
            a.setReturnValue((double)ax.gdv.dnp().floatValue());
         }
      }
   }
}
