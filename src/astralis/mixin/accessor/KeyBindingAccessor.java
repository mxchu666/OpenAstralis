package astralis.mixin.accessor;

import net.minecraft.class_304;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_304.class})
public interface KeyBindingAccessor {
   @Accessor("timesPressed")
   int getTimesPressed();

   @Accessor("timesPressed")
   void setTimesPressed(int var1);
}
