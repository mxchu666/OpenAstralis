package astralis.mixin.accessor;

import net.minecraft.class_2828;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_2828.class})
public interface PlayerMoveC2SPacketAccessor {
   @Accessor
   double getX();

   @Mutable
   @Accessor
   void setX(double var1);

   @Accessor
   double getY();

   @Mutable
   @Accessor
   void setY(double var1);

   @Accessor
   double getZ();

   @Mutable
   @Accessor
   void setZ(double var1);

   @Accessor
   float getYaw();

   @Mutable
   @Accessor
   void setYaw(float var1);

   @Accessor
   float getPitch();

   @Mutable
   @Accessor
   void setPitch(float var1);

   @Accessor
   boolean isOnGround();

   @Mutable
   @Accessor
   void setOnGround(boolean var1);

   @Accessor
   boolean isChangePosition();

   @Mutable
   @Accessor
   void setChangePosition(boolean var1);

   @Accessor
   boolean isChangeLook();

   @Mutable
   @Accessor
   void setChangeLook(boolean var1);
}
