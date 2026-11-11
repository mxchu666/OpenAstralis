package astralis.mixin.player;

import cc.astralis.bma;
import cc.astralis.cxx;
import cc.astralis.dar;
import cc.astralis.dlc;
import cc.astralis.dqq;
import cc.astralis.edr;
import cc.astralis.goc;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1937;
import net.minecraft.class_2604;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_1309.class})
public abstract class MixinLivingEntity extends class_1297 implements cxx {
   @Shadow
   protected double field_45123;
   @Shadow
   protected int field_6265;
   @Unique
   private float serenium_headPitch;
   @Unique
   private float serenium_prevHeadPitch;
   @Unique
   private float serenium_headYaw;
   @Unique
   private float serenium_prevHeadYaw;
   @Unique
   private boolean serenium_inInventory = false;

   @Shadow
   public abstract float method_5705(float var1);

   public MixinLivingEntity(class_1299<?> type, class_1937 world) {
      super(a, a);
   }

   @Redirect(
      method = {"tick"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;getYaw()F"
      ),
      slice = @Slice(
         from = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/entity/LivingEntity;tickMovement()V"
         ),
         to = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/entity/LivingEntity;turnHead(F)V"
         )
      )
   )
   public float replaceYaw_tick(class_1309 instance) {
      float ax = dqq.gwi();
      return a == dlc.chi.field_1724 && dqq.bzx ? ax : a.method_36454();
   }

   @Redirect(
      method = {"turnHead"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;getYaw()F"
      )
   )
   public float replaceYaw_turnHead(class_1309 instance) {
      return a == class_310.method_1551().field_1724 && dqq.bzx ? dqq.ahd : a.method_36454();
   }

   @Redirect(
      method = {"jump"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;getYaw()F",
         ordinal = 0
      )
   )
   private float redirectYRotForMoveFix(class_1309 a) {
      if (a == class_310.method_1551().field_1724) {
         goc ax = new goc(a.method_36454());
         dar.gqy().fyf().brx(ax);
         return ax.hio();
      } else {
         return a.method_36454();
      }
   }

   @ModifyConstant(
      method = {"getHandSwingDuration"},
      constant = {@Constant(
         intValue = 6
      )}
   )
   private int modifyHandSwingDuration(int a) {
      bma ax = dar.gqy().aws().diy(bma.class);
      return ax.dsv() ? (int)((double)a / ax.fql.dnp().floatValue()) : a;
   }

   @Inject(
      method = {"tickMovement"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/entity/LivingEntity;headTrackingIncrements:I",
         ordinal = 2
      )}
   )
   public void respectServerHeadYaw(CallbackInfo ci) {
      a.serenium_headYaw = a.serenium_headYaw + (float)class_3532.method_15338(a.field_45123 - a.serenium_headYaw) / a.field_6265;
   }

   @Inject(
      method = {"<init>"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/entity/LivingEntity;headYaw:F"
      )}
   )
   public void setHeadRotation(class_1299<?> entityType, class_1937 world, CallbackInfo ci) {
      a.serenium_headYaw = a.method_36454();
      a.serenium_headPitch = a.method_36455();
   }

   @Inject(
      method = {"onSpawnPacket"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/entity/LivingEntity;headYaw:F",
         ordinal = 1
      )}
   )
   public void setHeadRotation(class_2604 packet, CallbackInfo ci) {
      a.serenium_headYaw = a.method_43233();
      a.serenium_prevHeadYaw = a.serenium_headYaw;
      a.serenium_headPitch = a.method_11171();
      a.serenium_prevHeadPitch = a.serenium_headPitch;
   }

   @Inject(
      method = {"baseTick"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/entity/LivingEntity;lastBodyYaw:F"
      )}
   )
   public void updateHeadRotation(CallbackInfo ci) {
      a.serenium_prevHeadYaw = a.serenium_headYaw;
      a.serenium_prevHeadPitch = a.serenium_headPitch;
   }

   @Inject(
      method = {"pushAwayFrom(Lnet/minecraft/entity/Entity;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onPushAwayFrom(class_1297 a, CallbackInfo a) {
      edr ax = dar.gqy().aws().diy(edr.class);
      if (ax.dsv() && ax.fup.dnp()) {
         a.cancel();
      }
   }

   @Override
   public float serenium_getHeadPitch() {
      return a.serenium_headPitch;
   }

   @Override
   public void serenium_setHeadPitch(float headPitch) {
      a.serenium_headPitch = a;
   }

   @Override
   public float serenium_getPrevHeadPitch() {
      return a.serenium_prevHeadPitch;
   }

   @Override
   public float serenium_getHeadYaw() {
      return a.serenium_headYaw;
   }

   @Override
   public void serenium_setHeadYaw(float headYaw) {
      a.serenium_headYaw = a;
   }

   @Override
   public float serenium_getPrevHeadYaw() {
      return a.serenium_prevHeadYaw;
   }

   @Override
   public boolean serenium_isInInventory() {
      return a.serenium_inInventory;
   }
}
