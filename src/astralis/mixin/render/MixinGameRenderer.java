package astralis.mixin.render;

import cc.astralis.bsm;
import cc.astralis.cdr;
import cc.astralis.cmx;
import cc.astralis.dar;
import cc.astralis.dlc;
import cc.astralis.evm;
import cc.astralis.guf;
import cc.astralis.hin;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4599;
import net.minecraft.class_757;
import net.minecraft.class_9779;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_757.class})
public class MixinGameRenderer implements dlc {
   @Shadow
   private float field_4025;
   @Shadow
   @Final
   class_310 field_4015;
   @Shadow
   @Final
   private class_4599 field_20948;

   @Inject(
      method = {"tiltViewWhenHurt"},
      at = {@At("HEAD")},
      cancellable = true
   )
   void onBobViewWhenHurt(class_4587 a, float a, CallbackInfo a) {
      cmx ax = new cmx();
      dar.gqy().fyf().brx(ax);
      if (ax.fmc()) {
         a.cancel();
      }
   }

   @Inject(
      method = {"renderWorld"},
      at = {@At(
         value = "INVOKE",
         target = "Lcom/mojang/blaze3d/systems/RenderSystem;setProjectionMatrix(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lcom/mojang/blaze3d/systems/ProjectionType;)V",
         ordinal = 1,
         shift = Shift.BEFORE
      )}
   )
   private void hookLevelRenderEndEvent(class_9779 a, CallbackInfo a, @Local(ordinal = 0) Matrix4f a, @Local(ordinal = 1) Matrix4f a) {
      class_4587 ax = new class_4587();
      cdr.dtv = ax;
      ax.method_34425(a);
      dar.gqy().fyf().brx(new bsm(ax));
      guf.gqp = new Matrix4f(ax.method_23760().method_23761());
      guf.gky = a;
   }

   @Inject(
      method = {"getFov"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void modifyFov(class_4184 a, float a, boolean a, CallbackInfoReturnable<Float> a) {
      double ax = ((Float)a.getReturnValue()).floatValue();
      evm axx = dar.gqy().aws().diy(evm.class);
      float axxx = axx.czi((float)ax);
      if (axx.dsv() && axxx != ax) {
         a.setReturnValue(axxx);
      }
   }

   @Inject(
      method = {"getBasicProjectionMatrix"},
      at = {@At("TAIL")},
      cancellable = true
   )
   public void getBasicProjectionMatrixHook(float fovDegrees, CallbackInfoReturnable<Matrix4f> cir) {
      hin ax = dar.gqy().aws().diy(hin.class);
      if (ax.dsv() && ax.cmt.dnp()) {
         float axx = ax.dtl.dnp().floatValue();
         if (axx != 1.0F) {
            float axxx = a / axx;
            float axxxx = (float)a.field_4015.method_22683().method_4489() / a.field_4015.method_22683().method_4506();
            float axxxxx = axxxx * (axx <= 1.0F ? axx : 1.0F / axx);
            axxxxx = class_3532.method_15363(axxxxx, 0.5F, 2.0F);
            Matrix4f axxxxxx = new Matrix4f().perspective(axxx * (float) (Math.PI / 180.0), axxxxx, 0.05F, a.field_4025 * 4.0F);
            a.setReturnValue(axxxxxx);
         }
      }
   }
}
