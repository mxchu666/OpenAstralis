package astralis.mixin.accessor;

import net.minecraft.class_2561;
import net.minecraft.class_4185;
import net.minecraft.class_4185.class_4241;
import net.minecraft.class_4185.class_7841;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_4185.class})
public interface ButtonWidgetAccessor {
   @Invoker("<init>")
   static class_4185 createButtonWidget(int x, int y, int width, int height, class_2561 message, class_4241 onPress, class_7841 narrationSupplier) {
      throw new UnsupportedOperationException();
   }
}
