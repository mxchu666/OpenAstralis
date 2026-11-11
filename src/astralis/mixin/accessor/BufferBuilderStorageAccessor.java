package astralis.mixin.accessor;

import net.minecraft.class_4599;
import net.minecraft.class_4597.class_4598;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_4599.class})
public interface BufferBuilderStorageAccessor {
   @Accessor("entityVertexConsumers")
   class_4598 getEntityVertexConsumers();
}
