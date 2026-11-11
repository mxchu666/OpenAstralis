package astralis.mixin.accessor;

import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_7204;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_636.class})
public interface AccessorClientPlayerInteractionManager {
   @Invoker("sendSequencedPacket")
   void invokeSendSequencedPacket(class_638 var1, class_7204 var2);

   @Accessor("currentBreakingProgress")
   float getCurrentBreakingProgress();

   @Accessor("currentBreakingProgress")
   void setCurrentBreakingProgress(float var1);

   @Accessor("blockBreakingCooldown")
   void setBreakingCooldown(int var1);
}
