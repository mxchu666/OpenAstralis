package astralis.mixin.accessor;

import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_746.class})
public interface ClientPlayerEntityAccessor {
   @Accessor
   boolean getLastSprinting();
}
