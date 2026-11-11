package astralis.mixin.input;

import net.minecraft.class_10185;
import net.minecraft.class_241;
import net.minecraft.class_744;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({class_744.class})
public abstract class MixinInput {
   @Shadow
   public class_10185 field_54155;
   @Shadow
   protected class_241 field_55868;

   public boolean isPressingRight() {
      return a.field_54155.comp_3162();
   }

   public boolean isPressingLeft() {
      return a.field_54155.comp_3161();
   }

   public boolean isPressingBack() {
      return a.field_54155.comp_3160();
   }

   public boolean isPressingForward() {
      return a.field_54155.comp_3159();
   }

   public boolean isJumping() {
      return a.field_54155.comp_3163();
   }

   public boolean isSneaking() {
      return a.field_54155.comp_3164();
   }

   public boolean isSprinting() {
      return a.field_54155.comp_3165();
   }
}
