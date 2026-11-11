package astralis.mixin.game;

import cc.astralis.dar;
import cc.astralis.fhx;
import net.minecraft.client.ClientBrandRetriever;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ClientBrandRetriever.class})
public class ClientBrandRetrieverMixin {
   @Shadow
   @Final
   public static String field_33204;

   @Inject(
      method = {"getClientModName"},
      at = {@At("HEAD")},
      remap = false,
      cancellable = true
   )
   private static void getClientModName(CallbackInfoReturnable<String> a) {
      if (dar.gqy().aws() != null && dar.gqy().aws().diy(fhx.class) != null && dar.gqy().aws().diy(fhx.class).dsv()) {
         a.setReturnValue(field_33204);
      }
   }
}
