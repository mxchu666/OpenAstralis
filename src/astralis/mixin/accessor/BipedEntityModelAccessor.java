package astralis.mixin.accessor;

import net.minecraft.class_572;
import net.minecraft.class_630;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_572.class})
public interface BipedEntityModelAccessor {
   @Accessor
   class_630 getRightArm();

   @Mutable
   @Accessor
   void setRightArm(class_630 var1);
}
