package astralis.mixin.accessor;

import net.minecraft.class_310;
import net.minecraft.class_320;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_310.class})
public interface MinecraftClientSessionAccessor {
   @Accessor
   class_320 getSession();

   @Mutable
   @Accessor
   void setSession(class_320 var1);

   @Accessor("itemUseCooldown")
   int getItemUseCooldown();

   @Accessor("itemUseCooldown")
   void setItemUseCooldown(int var1);
}
