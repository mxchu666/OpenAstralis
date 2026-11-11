package astralis.mixin.accessor;

import net.minecraft.class_1799;
import net.minecraft.class_759;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_759.class})
public interface HeldItemRendererAccessor {
   @Accessor("mainHand")
   void setMainHand(class_1799 var1);
}
