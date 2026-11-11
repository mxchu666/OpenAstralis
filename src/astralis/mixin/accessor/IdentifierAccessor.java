package astralis.mixin.accessor;

import net.minecraft.class_2960;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_2960.class})
public interface IdentifierAccessor {
   @Invoker("<init>")
   static class_2960 createIdentifier(String namespace, String path) {
      throw new UnsupportedOperationException();
   }
}
