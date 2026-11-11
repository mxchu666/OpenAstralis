package astralis.mixin.game;

import cc.astralis.dar;
import cc.astralis.enu;
import cc.astralis.ezv;
import cc.astralis.hii;
import java.util.List;
import net.minecraft.class_1113;
import net.minecraft.class_1144;
import net.minecraft.class_2960;
import net.minecraft.class_3417;
import net.minecraft.class_1140.class_11518;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1144.class})
public class MixinSoundManager {
   @Unique
   private static final List<class_2960> ignoredSounds = List.of(
      class_3417.field_14999.comp_3319(),
      class_3417.field_14706.comp_3319(),
      class_3417.field_15016.comp_3319(),
      class_3417.field_14840.comp_3319(),
      class_3417.field_14625.comp_3319(),
      class_3417.field_14914.comp_3319()
   );

   @Inject(
      method = {"play(Lnet/minecraft/client/sound/SoundInstance;)Lnet/minecraft/client/sound/SoundSystem$PlayResult;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onPlay(class_1113 a, CallbackInfoReturnable<class_11518> a) {
      hii ax = dar.gqy().aws().diy(hii.class);
      if (dar.gqy().aws().diy(ezv.class) != null) {
         enu axx = dar.gqy().aws().diy(enu.class);
         if (ignoredSounds.contains(a.method_4775()) && ax != null && ax.dsv()) {
            a.cancel();
         }

         if (axx.dsv() && a.method_4775().equals(class_3417.field_15115.comp_3319())) {
            a.cancel();
         }
      }
   }
}
