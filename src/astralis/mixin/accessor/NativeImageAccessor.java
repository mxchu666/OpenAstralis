package astralis.mixin.accessor;

import net.minecraft.class_1011;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_1011.class})
public interface NativeImageAccessor {
   @Invoker("getColor")
   int invokeGetColor(int var1, int var2);
}
