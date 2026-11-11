package astralis.mixin.render;

import cc.astralis.dar;
import cc.astralis.di;
import cc.astralis.dk;
import com.mojang.blaze3d.buffers.Std140Builder;
import java.awt.Color;
import java.nio.ByteBuffer;
import net.minecraft.class_4184;
import net.minecraft.class_638;
import net.minecraft.class_7285;
import net.minecraft.class_758;
import net.minecraft.class_9779;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_758.class})
public abstract class MixinFogRenderer {
   @ModifyVariable(
      method = {"applyFog(Lnet/minecraft/client/render/Camera;IZLnet/minecraft/client/render/RenderTickCounter;FLnet/minecraft/client/world/ClientWorld;)Lorg/joml/Vector4f;"},
      at = @At("STORE"),
      ordinal = 0
   )
   private Vector4f modifyFogColor(Vector4f a, class_4184 a, int a, boolean a, class_9779 a, float a, class_638 a) {
      dk ax = dar.gqy().aws().diy(dk.class);
      if (ax != null && ax.dsv() && ax.eth.dnp()) {
         Color axx = ax.fct.dnp();
         return new Vector4f(axx.getRed() / 255.0F, axx.getGreen() / 255.0F, axx.getBlue() / 255.0F, 1.0F);
      } else {
         return a;
      }
   }

   @Inject(
      method = {"applyFog(Lnet/minecraft/client/render/Camera;IZLnet/minecraft/client/render/RenderTickCounter;FLnet/minecraft/client/world/ClientWorld;)Lorg/joml/Vector4f;"},
      at = {@At("TAIL")}
   )
   private void modifyFogDistance(class_4184 a, int a, boolean a, class_9779 a, float a, class_638 a, CallbackInfoReturnable<Vector4f> a) {
      dk ax = dar.gqy().aws().diy(dk.class);
      di axx = dar.gqy().aws().diy(di.class);
      class_7285 axxx = new class_7285();
      if (axx != null && axx.dsv() && axx.hdp.dnp()) {
         axxx.field_60583 = 10000.0F;
         axxx.field_60585 = 10000.0F;
         axxx.field_60582 = 10000.0F;
         axxx.field_60584 = 10000.0F;
      } else if (ax != null && ax.dsv() && ax.eth.dnp()) {
         axxx.field_60583 = ax.elv.dnp().floatValue();
         axxx.field_60585 = ax.gum.dnp().floatValue();
         axxx.field_60582 = ax.cmv.dnp().floatValue();
         axxx.field_60584 = ax.gri.dnp().floatValue();
      } else {
         axxx.field_60583 = a * 0.75F;
         axxx.field_60585 = a * 1.0F;
         axxx.field_60582 = a * 0.75F;
         axxx.field_60584 = a * 1.0F;
      }
   }

   @Redirect(
      method = {"applyFog(Lnet/minecraft/client/render/Camera;IZLnet/minecraft/client/render/RenderTickCounter;FLnet/minecraft/client/world/ClientWorld;)Lorg/joml/Vector4f;"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/fog/FogRenderer;applyFog(Ljava/nio/ByteBuffer;ILorg/joml/Vector4f;FFFFFF)V"
      )
   )
   private void redirectApplyFog(class_758 a, ByteBuffer a, int a, Vector4f a, float a, float a, float a, float a, float a, float a) {
      dk ax = dar.gqy().aws().diy(dk.class);
      di axx = dar.gqy().aws().diy(di.class);
      float axxx = a;
      float axxxx = a;
      float axxxxx = a;
      float axxxxxx = a;
      if (axx != null && axx.dsv() && axx.hdp.dnp()) {
         axxx = 10000.0F;
         axxxx = 10000.0F;
         axxxxx = 10000.0F;
         axxxxxx = 10000.0F;
      } else if (ax != null && ax.dsv() && ax.eth.dnp()) {
         axxx = ax.cmv.dnp().floatValue();
         axxxx = ax.gri.dnp().floatValue();
         axxxxx = ax.elv.dnp().floatValue();
         axxxxxx = ax.gum.dnp().floatValue();
      }

      a.position(a);
      Std140Builder.intoBuffer(a).putVec4(a).putFloat(axxx).putFloat(axxxx).putFloat(axxxxx).putFloat(axxxxxx).putFloat(a).putFloat(a);
   }
}
