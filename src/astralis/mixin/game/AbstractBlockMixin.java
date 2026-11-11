package astralis.mixin.game;

import cc.astralis.dar;
import cc.astralis.haj;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_3726;
import net.minecraft.class_4970;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin({class_4970.class})
public class AbstractBlockMixin {
   @ModifyReturnValue(
      method = {"getCollisionShape"},
      at = {@At("RETURN")}
   )
   private class_265 getCollisionShapeInject(class_265 a, class_2680 a, class_1922 a, class_2338 a, class_3726 a) {
      if (a != null && dar.gqy().fyf() != null) {
         haj ax = new haj(a, a, a);
         dar.gqy().fyf().brx(ax);
         return ax.bfu();
      } else {
         return a;
      }
   }
}
