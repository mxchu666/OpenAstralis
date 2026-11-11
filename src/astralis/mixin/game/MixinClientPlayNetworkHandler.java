package astralis.mixin.game;

import cc.astralis.dar;
import cc.astralis.ese;
import cc.astralis.fki;
import net.minecraft.class_1923;
import net.minecraft.class_2666;
import net.minecraft.class_2672;
import net.minecraft.class_2678;
import net.minecraft.class_2818;
import net.minecraft.class_634;
import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_634.class})
public class MixinClientPlayNetworkHandler {
   @Shadow
   private class_638 field_3699;

   @Inject(
      method = {"sendChatMessage"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sendChatMessageHook(String a, CallbackInfo a) {
      ese ax = new ese(a);
      dar.gqy().fyf().brx(ax);
      if (ax.fmc()) {
         a.cancel();
      }
   }

   @Inject(
      method = {"onGameJoin"},
      at = {@At("HEAD")}
   )
   private void astr$onJoin(class_2678 a, CallbackInfo a) {
      fki.dxj();
   }

   @Inject(
      method = {"onChunkData"},
      at = {@At("TAIL")}
   )
   private void astr$afterChunkData(class_2672 a, CallbackInfo a) {
      if (fki.ces()) {
         if (a.field_3699 != null) {
            class_1923 ax = new class_1923(a.method_11523(), a.method_11524());
            class_2818 axx = a.field_3699.method_2935().method_21730(ax.field_9181, ax.field_9180);
            if (axx != null) {
               fki.edf(axx);
            }
         }
      }
   }

   @Inject(
      method = {"onUnloadChunk"},
      at = {@At("TAIL")}
   )
   private void astr$afterUnload(class_2666 a, CallbackInfo a) {
      if (fki.ces()) {
         fki.an(new class_1923(a.comp_1726().field_9181, a.comp_1726().field_9180));
      }
   }
}
