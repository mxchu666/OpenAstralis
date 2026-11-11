package astralis.mixin.player;

import astralis.mixin.accessor.ClientPlayerEntityAccessor;
import cc.astralis.ajd;
import cc.astralis.aky;
import cc.astralis.cdr;
import cc.astralis.cxq;
import cc.astralis.dar;
import cc.astralis.dlc;
import cc.astralis.dqq;
import cc.astralis.eih;
import cc.astralis.elx;
import cc.astralis.fxx;
import cc.astralis.fyx;
import com.mojang.authlib.GameProfile;
import net.minecraft.class_1313;
import net.minecraft.class_1792;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_746.class})
public abstract class MixinClientPlayerEntity extends class_742 implements dlc {
   @Shadow
   @Final
   public class_634 field_3944;
   @Shadow
   private boolean field_3920;
   @Shadow
   private int field_3923;
   @Shadow
   private boolean field_3927;
   @Shadow
   @Final
   protected class_310 field_3937;
   @Unique
   private class_1792 lastItem;
   @Unique
   private boolean didSaveItem = false;
   private eih positionSendEvent;

   @Shadow
   protected abstract boolean method_3134();

   @Shadow
   protected abstract void method_46742();

   @Shadow
   public abstract void method_5784(class_1313 var1, class_243 var2);

   public MixinClientPlayerEntity(class_638 world, GameProfile profile) {
      super(a, a);
   }

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void tick(CallbackInfo info) {
      fxx ax = new fxx();
      dar.gqy().fyf().brx(ax);
      if (ax.fmc()) {
         a.cancel();
      }
   }

   @ModifyVariable(
      method = {"move"},
      at = @At("HEAD"),
      name = {"arg2"},
      ordinal = 0,
      index = 2,
      argsOnly = true
   )
   private class_243 hookMove(class_243 a, class_1313 a) {
      elx ax = new elx(a, a.field_1352, a.field_1351, a.field_1350);
      dar.gqy().fyf().brx(ax);
      return ax.fmc() ? class_243.field_1353 : new class_243(ax.gch(), ax.cqr(), ax.bug());
   }

   @Redirect(
      method = {"tickMovement"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z"
      )
   )
   private boolean onItemSlowdown(class_746 a) {
      fyx ax = new fyx();
      dar.gqy().fyf().brx(ax);
      return !ax.fmc() && a.method_6115();
   }

   @Redirect(
      method = {"canStartSprinting"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z"
      )
   )
   public boolean canStartSprinting(class_746 clientPlayerEntity) {
      fyx ax = new fyx();
      dar.gqy().fyf().brx(ax);
      return ax.fmc() ? false : a.method_6115();
   }

   @ModifyConstant(
      method = {"applyMovementSpeedFactors"},
      constant = {@Constant(
         floatValue = 0.2F
      )}
   )
   private float modifyItemUseSlowdown(float a) {
      fyx ax = new fyx();
      dar.gqy().fyf().brx(ax);
      return ax.fmc() ? ax.fpk() : a;
   }

   @Inject(
      method = {"tickMovement"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/entity/player/PlayerAbilities;allowFlying:Z",
         opcode = 180,
         ordinal = 0
      )}
   )
   private void hookSprintingTickEndEvent(CallbackInfo a) {
      dar.gqy().fyf().brx(new aky());
   }

   @Redirect(
      method = {"sendSprintingPacket"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;isSprinting()Z"
      )
   )
   private boolean hookSprintingSendEvent(class_746 a) {
      cxq ax = new cxq(a.method_5624());
      dar.gqy().fyf().brx(ax);
      return ax.fmc() ? ((ClientPlayerEntityAccessor)chi.field_1724).getLastSprinting() : ax.fco();
   }

   @Inject(
      method = {"sendMovementPackets"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hookPositionSendEvent(CallbackInfo a) {
      class_746 ax = (class_746)a;
      boolean axx = dqq.bzx;
      cdr.bni = chi.field_1724.method_24828() ? 0 : ++cdr.bni;
      cdr.gqd = !chi.field_1724.method_24828() ? 0 : ++cdr.gqd;
      a.positionSendEvent = new eih(
         ax.method_23317(), ax.method_23318(), ax.method_23321(), axx ? dqq.ev() : ax.method_36454(), axx ? dqq.czi() : ax.method_36455(), ax.method_24828()
      );
      dar.gqy().fyf().brx(a.positionSendEvent);
      if (a.positionSendEvent.fmc()) {
         a.cancel();
      }
   }

   @Redirect(
      method = {"sendMovementPackets"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;getX()D"
      )
   )
   private double redirectXPositionSendEvent(class_746 a) {
      return a.positionSendEvent.ejv();
   }

   @Redirect(
      method = {"sendMovementPackets"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;getY()D"
      )
   )
   private double redirectYPositionSendEvent(class_746 a) {
      return a.positionSendEvent.eil();
   }

   @Redirect(
      method = {"sendMovementPackets"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;getZ()D"
      )
   )
   private double redirectZPositionSendEvent(class_746 a) {
      return a.positionSendEvent.dba();
   }

   @Redirect(
      method = {"sendMovementPackets"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;getYaw()F"
      )
   )
   private float redirectYRotPositionSendEvent(class_746 a) {
      return a.positionSendEvent.dfv();
   }

   @Redirect(
      method = {"sendMovementPackets"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;getPitch()F"
      )
   )
   private float redirectXRotPositionSendEvent(class_746 a) {
      return a.positionSendEvent.fcq();
   }

   @Redirect(
      method = {"sendMovementPackets"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;isOnGround()Z"
      )
   )
   private boolean redirectOnGroundPositionSendEvent(class_746 a) {
      return a.positionSendEvent.afm();
   }

   @Inject(
      method = {"sendMovementPackets"},
      at = {@At("TAIL")}
   )
   private void hookPositionSendEndEvent(CallbackInfo a) {
      dar.gqy().fyf().brx(new ajd());
   }
}
