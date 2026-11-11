package astralis.mixin.accessor;

import net.minecraft.class_5721.class_5722;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_5722.class})
public interface EmptyAccessor {
   @Accessor
   static class_5722 getINSTANCE() {
      throw new UnsupportedOperationException();
   }
}
