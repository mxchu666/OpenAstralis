package com.astralis.scripting.api;

import com.astralis.scripting.api.entity.ScriptPlayer;
import com.astralis.scripting.api.math.ScriptRotation;
import com.astralis.scripting.api.math.ScriptVector3;
import com.astralis.scripting.api.render.ScriptColor;
import com.astralis.scripting.api.world.ScriptBlockHit;
import com.astralis.scripting.api.world.ScriptEntityHit;
import java.util.List;

public class Client {
   public String getUsername() {
      throw new UnsupportedOperationException();
   }

   public String getUuid() {
      throw new UnsupportedOperationException();
   }

   public int getFps() {
      throw new UnsupportedOperationException();
   }

   public boolean isInGame() {
      throw new UnsupportedOperationException();
   }

   public boolean isPaused() {
      throw new UnsupportedOperationException();
   }

   public boolean isSingleplayer() {
      throw new UnsupportedOperationException();
   }

   public boolean isWindowFocused() {
      throw new UnsupportedOperationException();
   }

   public int getPing() {
      throw new UnsupportedOperationException();
   }

   public long getSystemTime() {
      throw new UnsupportedOperationException();
   }

   public long getNanoTime() {
      throw new UnsupportedOperationException();
   }

   public String getServerAddress() {
      throw new UnsupportedOperationException();
   }

   public String getDisplayServerAddress() {
      throw new UnsupportedOperationException();
   }

   public boolean canReconnect() {
      throw new UnsupportedOperationException();
   }

   public void reconnect() {
      throw new UnsupportedOperationException();
   }

   public void sendChat(String var1) {
      throw new UnsupportedOperationException();
   }

   public void print(String var1) {
      throw new UnsupportedOperationException();
   }

   public ScriptPlayer getPlayer() {
      throw new UnsupportedOperationException();
   }

   public String getClientName() {
      throw new UnsupportedOperationException();
   }

   public ScriptColor getFirstColor() {
      throw new UnsupportedOperationException();
   }

   public ScriptColor getSecondColor() {
      throw new UnsupportedOperationException();
   }

   public int getThemeFirstColorArgb(String var1) {
      throw new UnsupportedOperationException();
   }

   public int getThemeSecondColorArgb(String var1) {
      throw new UnsupportedOperationException();
   }

   public double getClientVersion() {
      throw new UnsupportedOperationException();
   }

   public String getMinecraftVersion() {
      throw new UnsupportedOperationException();
   }

   public List<String> getFriends() {
      throw new UnsupportedOperationException();
   }

   public List<String> getOnlineFriends() {
      throw new UnsupportedOperationException();
   }

   public boolean isFriend(String var1) {
      throw new UnsupportedOperationException();
   }

   public boolean isFriendOnline(String var1) {
      throw new UnsupportedOperationException();
   }

   public String getGameDirectory() {
      throw new UnsupportedOperationException();
   }

   public String getCurrentScreen() {
      throw new UnsupportedOperationException();
   }

   public String getScreenTitle() {
      throw new UnsupportedOperationException();
   }

   public boolean isContainerOpen() {
      throw new UnsupportedOperationException();
   }

   public int getWindowWidth() {
      throw new UnsupportedOperationException();
   }

   public int getWindowHeight() {
      throw new UnsupportedOperationException();
   }

   public int getFramebufferWidth() {
      throw new UnsupportedOperationException();
   }

   public int getFramebufferHeight() {
      throw new UnsupportedOperationException();
   }

   public int getGuiScale() {
      throw new UnsupportedOperationException();
   }

   public boolean isFullscreen() {
      throw new UnsupportedOperationException();
   }

   public boolean isKeyDown(int var1) {
      throw new UnsupportedOperationException();
   }

   public boolean isMouseButtonDown(int var1) {
      throw new UnsupportedOperationException();
   }

   public void setClipboard(String var1) {
      throw new UnsupportedOperationException();
   }

   public long getUsedMemory() {
      throw new UnsupportedOperationException();
   }

   public long getFreeMemory() {
      throw new UnsupportedOperationException();
   }

   public long getAllocatedMemory() {
      throw new UnsupportedOperationException();
   }

   public long getMaxMemory() {
      throw new UnsupportedOperationException();
   }

   public int getAvailableProcessors() {
      throw new UnsupportedOperationException();
   }

   public void async(Runnable var1) {
      throw new UnsupportedOperationException();
   }

   public void runOnClient(Runnable var1) {
      throw new UnsupportedOperationException();
   }

   public void closeScreen() {
      throw new UnsupportedOperationException();
   }

   public boolean isMoving() {
      throw new UnsupportedOperationException();
   }

   public boolean isMovingDiagonally() {
      throw new UnsupportedOperationException();
   }

   public double getSpeed() {
      throw new UnsupportedOperationException();
   }

   public double getBlocksPerSecond() {
      throw new UnsupportedOperationException();
   }

   public float getMovementDirection() {
      throw new UnsupportedOperationException();
   }

   public float getForwardInput() {
      throw new UnsupportedOperationException();
   }

   public float getStrafeInput() {
      throw new UnsupportedOperationException();
   }

   public void setMovementInput(float var1, float var2, boolean var3, boolean var4, boolean var5) {
      throw new UnsupportedOperationException();
   }

   public void setForward(float var1) {
      throw new UnsupportedOperationException();
   }

   public void setStrafe(float var1) {
      throw new UnsupportedOperationException();
   }

   public void setJump(boolean var1) {
      throw new UnsupportedOperationException();
   }

   public void setSneak(boolean var1) {
      throw new UnsupportedOperationException();
   }

   public void setSprinting(boolean var1) {
      throw new UnsupportedOperationException();
   }

   public void releaseMovementInput() {
      throw new UnsupportedOperationException();
   }

   public void setSpeed(double var1) {
      throw new UnsupportedOperationException();
   }

   public void stop() {
      throw new UnsupportedOperationException();
   }

   public void jump() {
      throw new UnsupportedOperationException();
   }

   public void swing(boolean var1) {
      throw new UnsupportedOperationException();
   }

   public boolean useItem(boolean var1) {
      throw new UnsupportedOperationException();
   }

   public boolean useItem(boolean var1, float var2, float var3) {
      throw new UnsupportedOperationException();
   }

   public void releaseItemUse() {
      throw new UnsupportedOperationException();
   }

   public void dropItem(boolean var1) {
      throw new UnsupportedOperationException();
   }

   public boolean isFlying() {
      throw new UnsupportedOperationException();
   }

   public boolean canEditWorld() {
      throw new UnsupportedOperationException();
   }

   public boolean isCreative() {
      throw new UnsupportedOperationException();
   }

   public boolean isSpectator() {
      throw new UnsupportedOperationException();
   }

   public boolean isSneaking() {
      throw new UnsupportedOperationException();
   }

   public boolean isSprinting() {
      throw new UnsupportedOperationException();
   }

   public boolean isJumping() {
      throw new UnsupportedOperationException();
   }

   public void playSound(String var1, float var2, float var3) {
      throw new UnsupportedOperationException();
   }

   public boolean isRiding() {
      throw new UnsupportedOperationException();
   }

   public boolean canFly() {
      throw new UnsupportedOperationException();
   }

   public void setFlying(boolean var1) {
      throw new UnsupportedOperationException();
   }

   public double[] getMotion() {
      throw new UnsupportedOperationException();
   }

   public ScriptVector3 getMotionVector() {
      throw new UnsupportedOperationException();
   }

   public void setMotion(double var1, double var3, double var5) {
      throw new UnsupportedOperationException();
   }

   public void setMotion(ScriptVector3 var1) {
      throw new UnsupportedOperationException();
   }

   public float[] getRotations(double var1, double var3, double var5) {
      throw new UnsupportedOperationException();
   }

   public ScriptRotation getRotation(ScriptVector3 var1) {
      throw new UnsupportedOperationException();
   }

   public ScriptBlockHit raycastBlock(double var1) {
      throw new UnsupportedOperationException();
   }

   public ScriptBlockHit raycastBlock(double var1, float var3, float var4) {
      throw new UnsupportedOperationException();
   }

   public ScriptEntityHit raycastEntity(double var1) {
      throw new UnsupportedOperationException();
   }

   public ScriptEntityHit raycastEntity(double var1, float var3, float var4) {
      throw new UnsupportedOperationException();
   }

   public boolean placeBlock(ScriptBlockHit var1) {
      throw new UnsupportedOperationException();
   }
}
