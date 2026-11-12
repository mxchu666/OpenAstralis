package com.astralis.scripting.api.event;

import com.astralis.scripting.api.entity.ScriptEntity;
import com.astralis.scripting.api.math.ScriptVector3;

public final class ScriptEvents {
   public record Attack(ScriptEntity target, ScriptEvents.Phase phase, ScriptEvents.Cancellable cancellation) {
      public Attack(ScriptEntity target, ScriptEvents.Phase phase, ScriptEvents.Cancellable cancellation) {
      }

      public void cancel() {
         throw new UnsupportedOperationException();
      }

      public boolean isCancelled() {
         throw new UnsupportedOperationException();
      }

      @Override
      public final String toString() {
         throw new UnsupportedOperationException();
      }

      @Override
      public final int hashCode() {
         throw new UnsupportedOperationException();
      }

      @Override
      public final boolean equals(Object var1) {
         throw new UnsupportedOperationException();
      }

      public ScriptEntity target() {
         throw new UnsupportedOperationException();
      }

      public ScriptEvents.Phase phase() {
         throw new UnsupportedOperationException();
      }

      public ScriptEvents.Cancellable cancellation() {
         throw new UnsupportedOperationException();
      }
   }

   public record BlockBreak(ScriptVector3 position, String blockId) {
      public BlockBreak(ScriptVector3 position, String blockId) {
      }

      @Override
      public final String toString() {
         throw new UnsupportedOperationException();
      }

      @Override
      public final int hashCode() {
         throw new UnsupportedOperationException();
      }

      @Override
      public final boolean equals(Object var1) {
         throw new UnsupportedOperationException();
      }

      public ScriptVector3 position() {
         throw new UnsupportedOperationException();
      }

      public String blockId() {
         throw new UnsupportedOperationException();
      }
   }

   public static class Cancellable {
      public Cancellable() {
      }

      public Cancellable(boolean var1) {
      }

      public void cancel() {
         throw new UnsupportedOperationException();
      }

      public void setCancelled(boolean var1) {
         throw new UnsupportedOperationException();
      }

      public boolean isCancelled() {
         throw new UnsupportedOperationException();
      }
   }

   public static class Chat extends ScriptEvents.Cancellable {
      public Chat(String var1, boolean var2, boolean var3) {
      }

      public String getMessage() {
         throw new UnsupportedOperationException();
      }

      public boolean isOverlay() {
         throw new UnsupportedOperationException();
      }

      public void setMessage(String var1) {
         throw new UnsupportedOperationException();
      }

      public void setOverlay(boolean var1) {
         throw new UnsupportedOperationException();
      }
   }

   public static class Input {
      public Input(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      }

      public float getForward() {
         throw new UnsupportedOperationException();
      }

      public void setForward(float var1) {
         throw new UnsupportedOperationException();
      }

      public void setStrafe(float var1) {
         throw new UnsupportedOperationException();
      }

      public void setForward(boolean var1) {
         throw new UnsupportedOperationException();
      }

      public void setBackward(boolean var1) {
         throw new UnsupportedOperationException();
      }

      public void setLeft(boolean var1) {
         throw new UnsupportedOperationException();
      }

      public void setRight(boolean var1) {
         throw new UnsupportedOperationException();
      }

      public void setJump(boolean var1) {
         throw new UnsupportedOperationException();
      }

      public void setSneak(boolean var1) {
         throw new UnsupportedOperationException();
      }

      public void setSprint(boolean var1) {
         throw new UnsupportedOperationException();
      }

      public boolean isBackward() {
         throw new UnsupportedOperationException();
      }

      public boolean isLeft() {
         throw new UnsupportedOperationException();
      }

      public boolean isRight() {
         throw new UnsupportedOperationException();
      }

      public boolean isJump() {
         throw new UnsupportedOperationException();
      }

      public boolean isSneak() {
         throw new UnsupportedOperationException();
      }

      public boolean isSprint() {
         throw new UnsupportedOperationException();
      }

      public float getForwardInput() {
         throw new UnsupportedOperationException();
      }

      public float getStrafe() {
         throw new UnsupportedOperationException();
      }
   }

   public static class Key extends ScriptEvents.Cancellable {
      public Key(String var1, int var2, boolean var3, boolean var4, boolean var5) {
      }

      public String getName() {
         throw new UnsupportedOperationException();
      }

      public int getKeyCode() {
         throw new UnsupportedOperationException();
      }

      public boolean isPressed() {
         throw new UnsupportedOperationException();
      }

      public boolean isInGui() {
         throw new UnsupportedOperationException();
      }
   }

   public static class Motion extends ScriptEvents.Cancellable {
      public Motion(double var1, double var3, double var5, float var7, float var8, boolean var9, boolean var10) {
      }

      public double getX() {
         throw new UnsupportedOperationException();
      }

      public double getY() {
         throw new UnsupportedOperationException();
      }

      public double getZ() {
         throw new UnsupportedOperationException();
      }

      public float getYaw() {
         throw new UnsupportedOperationException();
      }

      public float getPitch() {
         throw new UnsupportedOperationException();
      }

      public boolean isOnGround() {
         throw new UnsupportedOperationException();
      }

      public void setX(double var1) {
         throw new UnsupportedOperationException();
      }

      public void setY(double var1) {
         throw new UnsupportedOperationException();
      }

      public void setZ(double var1) {
         throw new UnsupportedOperationException();
      }

      public void setYaw(float var1) {
         throw new UnsupportedOperationException();
      }

      public void setPitch(float var1) {
         throw new UnsupportedOperationException();
      }

      public void setOnGround(boolean var1) {
         throw new UnsupportedOperationException();
      }
   }

   public static class MouseButton extends ScriptEvents.Cancellable {
      public MouseButton(int var1, boolean var2, double var3, double var5, boolean var7) {
      }

      public int getButton() {
         throw new UnsupportedOperationException();
      }

      public boolean isPressed() {
         throw new UnsupportedOperationException();
      }

      public double getX() {
         throw new UnsupportedOperationException();
      }

      public double getY() {
         throw new UnsupportedOperationException();
      }
   }

   public record MouseCursor(double x, double y) {
      public MouseCursor(double x, double y) {
      }

      @Override
      public final String toString() {
         throw new UnsupportedOperationException();
      }

      @Override
      public final int hashCode() {
         throw new UnsupportedOperationException();
      }

      @Override
      public final boolean equals(Object var1) {
         throw new UnsupportedOperationException();
      }

      public double x() {
         throw new UnsupportedOperationException();
      }

      public double y() {
         throw new UnsupportedOperationException();
      }
   }

   public static class MouseMove extends ScriptEvents.Cancellable {
      public MouseMove(double var1, double var3, double var5, double var7, double var9, boolean var11, boolean var12) {
      }

      public double getDeltaX() {
         throw new UnsupportedOperationException();
      }

      public double getDeltaY() {
         throw new UnsupportedOperationException();
      }

      public double getSensitivityMultiplier() {
         throw new UnsupportedOperationException();
      }

      public double getOriginalDeltaX() {
         throw new UnsupportedOperationException();
      }

      public double getOriginalDeltaY() {
         throw new UnsupportedOperationException();
      }

      public boolean isHandled() {
         throw new UnsupportedOperationException();
      }

      public void setDeltaX(double var1) {
         throw new UnsupportedOperationException();
      }

      public void setDeltaY(double var1) {
         throw new UnsupportedOperationException();
      }

      public void setSensitivityMultiplier(double var1) {
         throw new UnsupportedOperationException();
      }

      public void setHandled(boolean var1) {
         throw new UnsupportedOperationException();
      }
   }

   public static class Move extends ScriptEvents.Cancellable {
      public Move(double var1, double var3, double var5, boolean var7) {
      }

      public double getX() {
         throw new UnsupportedOperationException();
      }

      public double getY() {
         throw new UnsupportedOperationException();
      }

      public double getZ() {
         throw new UnsupportedOperationException();
      }

      public void setX(double var1) {
         throw new UnsupportedOperationException();
      }

      public void setY(double var1) {
         throw new UnsupportedOperationException();
      }

      public void setZ(double var1) {
         throw new UnsupportedOperationException();
      }
   }

   public static class Packet extends ScriptEvents.Cancellable {
      public Packet(String var1, boolean var2) {
      }

      public Packet(String var1, String var2, String var3, ScriptVector3 var4, int var5, float var6, float var7, boolean var8, boolean var9) {
      }

      public Packet(
         String var1,
         String var2,
         String var3,
         ScriptVector3 var4,
         int var5,
         int var6,
         float var7,
         float var8,
         boolean var9,
         ScriptPacketHandle var10,
         boolean var11
      ) {
      }

      public ScriptPacketHandle hold() {
         throw new UnsupportedOperationException();
      }

      public String getType() {
         throw new UnsupportedOperationException();
      }

      public String getAction() {
         throw new UnsupportedOperationException();
      }

      public String getMessage() {
         throw new UnsupportedOperationException();
      }

      public ScriptVector3 getPosition() {
         throw new UnsupportedOperationException();
      }

      public int getDirection() {
         throw new UnsupportedOperationException();
      }

      public int getHeldSlot() {
         throw new UnsupportedOperationException();
      }

      public float getYaw() {
         throw new UnsupportedOperationException();
      }

      public float getPitch() {
         throw new UnsupportedOperationException();
      }

      public boolean isMoving() {
         throw new UnsupportedOperationException();
      }
   }

   public static enum Phase {
      PRE,
      POST;
   }

   public static class Rotation {
      public Rotation(float var1) {
      }

      public float getYaw() {
         throw new UnsupportedOperationException();
      }

      public void setYaw(float var1) {
         throw new UnsupportedOperationException();
      }
   }

   public static class RotationModifier {
      public RotationModifier(float var1, float var2, float var3, float var4, float var5, String var6, ScriptEntity var7) {
      }

      public void add(float var1, float var2) {
         throw new UnsupportedOperationException();
      }

      public void addYaw(float var1) {
         throw new UnsupportedOperationException();
      }

      public void addPitch(float var1) {
         throw new UnsupportedOperationException();
      }

      public void setRotation(float var1, float var2) {
         throw new UnsupportedOperationException();
      }

      public void setYaw(float var1) {
         throw new UnsupportedOperationException();
      }

      public void setPitch(float var1) {
         throw new UnsupportedOperationException();
      }

      public void reset() {
         throw new UnsupportedOperationException();
      }

      public float getYawOffset() {
         throw new UnsupportedOperationException();
      }

      public float getPitch() {
         throw new UnsupportedOperationException();
      }

      public float getPitchOffset() {
         throw new UnsupportedOperationException();
      }

      public boolean isSource(String var1) {
         throw new UnsupportedOperationException();
      }

      public float getTickDelta() {
         throw new UnsupportedOperationException();
      }

      public float getBaseYaw() {
         throw new UnsupportedOperationException();
      }

      public float getBasePitch() {
         throw new UnsupportedOperationException();
      }

      public float getTargetYaw() {
         throw new UnsupportedOperationException();
      }

      public float getTargetPitch() {
         throw new UnsupportedOperationException();
      }

      public String getSource() {
         throw new UnsupportedOperationException();
      }

      public ScriptEntity getTarget() {
         throw new UnsupportedOperationException();
      }

      public float getYaw() {
         throw new UnsupportedOperationException();
      }
   }

   public static class Screen {
      public Screen(String var1, boolean var2) {
      }

      public void preserveInput() {
         throw new UnsupportedOperationException();
      }

      public String getName() {
         throw new UnsupportedOperationException();
      }

      public boolean isPreserveInput() {
         throw new UnsupportedOperationException();
      }
   }

   public static class ScreenInput {
      public ScreenInput(boolean var1) {
      }

      public boolean isHandled() {
         throw new UnsupportedOperationException();
      }

      public void setHandled(boolean var1) {
         throw new UnsupportedOperationException();
      }
   }

   public static class Scroll extends ScriptEvents.Cancellable {
      public Scroll(double var1, double var3, boolean var5) {
      }

      public double getX() {
         throw new UnsupportedOperationException();
      }

      public double getY() {
         throw new UnsupportedOperationException();
      }

      public void setX(double var1) {
         throw new UnsupportedOperationException();
      }

      public void setY(double var1) {
         throw new UnsupportedOperationException();
      }
   }

   public static class SlowDown extends ScriptEvents.Cancellable {
      public SlowDown(float var1, boolean var2) {
      }

      public float getMultiplier() {
         throw new UnsupportedOperationException();
      }

      public void setMultiplier(float var1) {
         throw new UnsupportedOperationException();
      }
   }

   public record Sound(String name, float volume, float pitch, ScriptEvents.Cancellable cancellation) {
      public Sound(String name, float volume, float pitch, ScriptEvents.Cancellable cancellation) {
      }

      public void cancel() {
         throw new UnsupportedOperationException();
      }

      public boolean isCancelled() {
         throw new UnsupportedOperationException();
      }

      @Override
      public final String toString() {
         throw new UnsupportedOperationException();
      }

      @Override
      public final int hashCode() {
         throw new UnsupportedOperationException();
      }

      @Override
      public final boolean equals(Object var1) {
         throw new UnsupportedOperationException();
      }

      public String name() {
         throw new UnsupportedOperationException();
      }

      public float volume() {
         throw new UnsupportedOperationException();
      }

      public float pitch() {
         throw new UnsupportedOperationException();
      }

      public ScriptEvents.Cancellable cancellation() {
         throw new UnsupportedOperationException();
      }
   }

   public record Tick(ScriptEvents.Phase phase) {
      public Tick(ScriptEvents.Phase phase) {
      }

      @Override
      public final String toString() {
         throw new UnsupportedOperationException();
      }

      @Override
      public final int hashCode() {
         throw new UnsupportedOperationException();
      }

      @Override
      public final boolean equals(Object var1) {
         throw new UnsupportedOperationException();
      }

      public ScriptEvents.Phase phase() {
         throw new UnsupportedOperationException();
      }
   }

   public static class Velocity extends ScriptEvents.Cancellable {
      public Velocity(double var1, double var3, double var5, boolean var7, boolean var8) {
      }

      public double getX() {
         throw new UnsupportedOperationException();
      }

      public double getY() {
         throw new UnsupportedOperationException();
      }

      public double getZ() {
         throw new UnsupportedOperationException();
      }

      public boolean isExplosion() {
         throw new UnsupportedOperationException();
      }

      public void setX(double var1) {
         throw new UnsupportedOperationException();
      }

      public void setY(double var1) {
         throw new UnsupportedOperationException();
      }

      public void setZ(double var1) {
         throw new UnsupportedOperationException();
      }
   }
}
