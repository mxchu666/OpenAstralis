package astralis.mixin.accessor;

import net.minecraft.class_743;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_743.class})
public interface KeyboardInputAccessor {
   @Invoker
   static float callGetMovementMultiplier(boolean positive, boolean negative) {
      throw new UnsupportedOperationException();
   }
}
