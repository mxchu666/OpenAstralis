package astralis.mixin.accessor;

import java.util.Comparator;
import net.minecraft.class_355;
import net.minecraft.class_640;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_355.class})
public interface PlayerListHudAccessor {
   @Accessor("ENTRY_ORDERING")
   static Comparator<class_640> getEntryOrdering() {
      throw new AssertionError();
   }
}
