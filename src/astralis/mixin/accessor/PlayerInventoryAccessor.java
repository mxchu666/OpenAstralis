package astralis.mixin.accessor;

import net.minecraft.class_10630;
import net.minecraft.class_1661;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_1661.class})
public interface PlayerInventoryAccessor {
   @Accessor("equipment")
   class_10630 astralis$getEquipment();
}
