package astralis.mixin.accessor;

import java.util.concurrent.atomic.AtomicReferenceArray;
import net.minecraft.class_2818;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(
   targets = {"net.minecraft.client.world.ClientChunkManager$ClientChunkMap"}
)
public interface ClientChunkMapAccessor {
   @Accessor("chunks")
   AtomicReferenceArray<class_2818> getChunks();

   @Accessor("radius")
   int getRadius();

   @Accessor("centerChunkX")
   int getCenterChunkX();

   @Accessor("centerChunkZ")
   int getCenterChunkZ();
}
