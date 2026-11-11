package astralis.mixin.render;

import cc.astralis.ag;
import cc.astralis.dar;
import cc.astralis.dfr;
import net.minecraft.class_1041;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_1041.class})
public class MixinWindow {
   @Inject(
      method = {"onFramebufferSizeChanged"},
      at = {@At("RETURN")}
   )
   private void onFramebufferSizeChanged(long a, int a, int a, CallbackInfo a) {
      dar.gqy().bav().dxy(a > 0 ? a : 1, a > 0 ? a : 1);
   }

   @Inject(
      method = {"swapBuffers"},
      at = {@At("HEAD")}
   )
   private void onSwapBuffers(CallbackInfo a) {
      ag ax = dar.gqy().bav();
      ax.gao();

      try {
         if (class_310.method_1551().field_1724 != null && class_310.method_1551().field_1687 != null) {
            ax.bpv();
         }

         dfr.dsv();
      } catch (Throwable var7) {
         var7.printStackTrace();
      } finally {
         ax.aqk();
      }
   }
}
