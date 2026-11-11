package astralis.mixin.render;

import cc.astralis.dar;
import cc.astralis.di;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import net.minecraft.class_243;
import net.minecraft.class_4063;
import net.minecraft.class_761;
import net.minecraft.class_9909;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_761.class})
public class MixinWorldRenderer {
   @Inject(
      method = {"renderWeather"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void renderoWeather(class_9909 frameGraphBuilder, class_243 cameraPos, GpuBufferSlice fogBuffer, CallbackInfo ci) {
      di ax = dar.gqy().aws().diy(di.class);
      if (ax.dsv() && ax.clg.dnp()) {
         a.cancel();
      }
   }

   @Inject(
      method = {"renderClouds"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void noClouds(class_9909 a, class_4063 a, class_243 a, float a, int a, float a, CallbackInfo a) {
      di ax = dar.gqy().aws().diy(di.class);
      if (ax.dsv() && ax.fub.dnp()) {
         a.cancel();
      }
   }
}
