package astralis.mixin.input;

import cc.astralis.dar;
import cc.astralis.dfa;
import cc.astralis.etk;
import net.minecraft.class_10185;
import net.minecraft.class_241;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_743;
import net.minecraft.class_744;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(
   value = {class_743.class},
   priority = 999
)
public class MixinKeyboardInput extends class_744 {
   @Shadow
   @Final
   private class_315 field_3902;

   @Shadow
   private static float method_40218(boolean a, boolean a) {
      return 0.0F;
   }

   @Overwrite
   public void method_3129() {
      etk a = new etk(
         a.field_3902.field_1894.method_1434(),
         a.field_3902.field_1881.method_1434(),
         a.field_3902.field_1913.method_1434(),
         a.field_3902.field_1849.method_1434(),
         a.field_3902.field_1903.method_1434(),
         a.field_3902.field_1832.method_1434(),
         a.field_3902.field_1867.method_1434()
      );
      dar.gqy().fyf().brx(a);
      class_310 ax = class_310.method_1551();
      class_746 axx = ax.field_1724;
      boolean axxx = a.bxg;
      boolean axxxx = a.aky;
      boolean axxxxx = a.gvc;
      boolean axxxxxx = a.coh;
      a.field_54155 = new class_10185(axxx, axxxx, axxxxx, axxxxxx, a.eeq, a.fgh, a.dab);
      float axxxxxxx = method_40218(a.field_54155.comp_3159(), a.field_54155.comp_3160());
      float axxxxxxxx = method_40218(a.field_54155.comp_3161(), a.field_54155.comp_3162());
      dfa axxxxxxxxx = new dfa(axxxxxxx, axxxxxxxx);
      dar.gqy().fyf().brx(axxxxxxxxx);
      a.field_55868 = new class_241(axxxxxxxxx.aop(), axxxxxxxxx.eyl()).method_35581();
   }
}
