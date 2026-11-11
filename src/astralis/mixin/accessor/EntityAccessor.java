package astralis.mixin.accessor;

import net.minecraft.class_1297;
import net.minecraft.class_243;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_1297.class})
public interface EntityAccessor {
   @Invoker
   class_243 callAdjustMovementForCollisions(class_243 var1);

   @Invoker
   void callSetFlag(int var1, boolean var2);
}
