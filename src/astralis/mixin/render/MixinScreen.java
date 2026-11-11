package astralis.mixin.render;

import cc.astralis.dar;
import cc.astralis.dk;
import java.awt.Color;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin({class_437.class})
public abstract class MixinScreen {
   @ModifyArg(
      method = {"renderInGameBackground"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/DrawContext;fillGradient(IIIIII)V"
      ),
      index = 5
   )
   private int modifyGradientEndColor(int a) {
      dk ax = dar.gqy().aws().diy(dk.class);
      return ax != null && ax.dsv() && ax.dsk.dnp() ? a.applyAlpha(ax.els.dnp(), ax.cic.dnp().floatValue()) : a;
   }

   @ModifyArg(
      method = {"renderInGameBackground"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/DrawContext;fillGradient(IIIIII)V"
      ),
      index = 4
   )
   private int modifyGradientStartColor(int a) {
      dk ax = dar.gqy().aws().diy(dk.class);
      return ax != null && ax.dsv() && ax.dsk.dnp() ? a.applyAlpha(ax.beo.dnp(), ax.ddd.dnp().floatValue()) : a;
   }

   @Unique
   private int applyAlpha(Color a, float a) {
      return new Color(a.getRed(), a.getGreen(), a.getBlue(), (int)(a * 255.0F)).getRGB();
   }
}
