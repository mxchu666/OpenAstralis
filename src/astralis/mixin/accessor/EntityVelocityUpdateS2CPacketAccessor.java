package astralis.mixin.accessor;

import net.minecraft.class_243;
import net.minecraft.class_2743;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_2743.class})
public interface EntityVelocityUpdateS2CPacketAccessor {
   @Accessor
   class_243 getVelocity();

   @Mutable
   @Accessor
   void setVelocity(class_243 var1);

   @Accessor
   int getEntityId();

   @Mutable
   @Accessor
   void setEntityId(int var1);
}
