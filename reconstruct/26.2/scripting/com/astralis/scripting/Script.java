package com.astralis.scripting;

import com.astralis.scripting.api.Client;
import com.astralis.scripting.api.Inventory;
import com.astralis.scripting.api.Keybinds;
import com.astralis.scripting.api.Modules;
import com.astralis.scripting.api.Packets;
import com.astralis.scripting.api.Storage;
import com.astralis.scripting.api.World;
import com.astralis.scripting.api.event.ScriptEvents;
import com.astralis.scripting.api.http.ScriptHttp;
import com.astralis.scripting.api.hud.Draggables;
import com.astralis.scripting.api.props.ScriptProperties;
import com.astralis.scripting.api.render.RenderContext;
import com.astralis.scripting.api.render.WorldRenderContext;
import com.astralis.scripting.api.rotation.Rotations;
import com.astralis.scripting.api.screen.ScriptScreens;
import com.astralis.scripting.api.script.ScriptPackage;
import com.astralis.scripting.api.target.Targeting;
import com.astralis.scripting.api.task.Tasks;
import pub.astralis.client.module.core.Category;

public abstract class Script {
   protected final Client client;
   protected final World world;
   protected final Packets packets;
   protected final Inventory inventory;
   protected final Keybinds keybinds;
   protected final Modules modules;
   protected final Storage storage;
   protected final ScriptProperties props;
   protected final Draggables draggables;
   protected final Rotations rotations;
   protected final Tasks tasks;
   protected final Targeting targets;
   protected final ScriptScreens screens;
   protected final ScriptHttp http;

   public final String getName() {
      throw new UnsupportedOperationException();
   }

   protected final ScriptPackage getScriptPackage() {
      throw new UnsupportedOperationException();
   }

   public final boolean isEnabled() {
      throw new UnsupportedOperationException();
   }

   public final boolean isRuntimeActive() {
      throw new UnsupportedOperationException();
   }

   public final void print(Object var1) {
      throw new UnsupportedOperationException();
   }

   public final void reportError(String var1, Throwable var2) {
      throw new UnsupportedOperationException();
   }

   public void onLoad() {
      throw new UnsupportedOperationException();
   }

   public void onEnable() {
      throw new UnsupportedOperationException();
   }

   public void onDisable() {
      throw new UnsupportedOperationException();
   }

   public void onUnload() {
      throw new UnsupportedOperationException();
   }

   public String getDescription() {
      throw new UnsupportedOperationException();
   }

   public Category getCategory() {
      throw new UnsupportedOperationException();
   }

   public boolean isModuleVisible() {
      throw new UnsupportedOperationException();
   }

   public void onUpdate(ScriptEvents.Cancellable var1) {
      throw new UnsupportedOperationException();
   }

   public void onTick(ScriptEvents.Tick var1) {
      throw new UnsupportedOperationException();
   }

   public void onMotion(ScriptEvents.Motion var1) {
      throw new UnsupportedOperationException();
   }

   public void onRotationRequest(ScriptEvents.Motion var1) {
      throw new UnsupportedOperationException();
   }

   public void onPostMotion() {
      throw new UnsupportedOperationException();
   }

   public void onMove(ScriptEvents.Move var1) {
      throw new UnsupportedOperationException();
   }

   public void onRender(RenderContext var1) {
      throw new UnsupportedOperationException();
   }

   public void onWorldRender(WorldRenderContext var1) {
      throw new UnsupportedOperationException();
   }

   public void onPacketSend(ScriptEvents.Packet var1) {
      throw new UnsupportedOperationException();
   }

   public void onPacketReceive(ScriptEvents.Packet var1) {
      throw new UnsupportedOperationException();
   }

   public void onChatReceive(ScriptEvents.Chat var1) {
      throw new UnsupportedOperationException();
   }

   public void onKeyPress(int var1) {
      throw new UnsupportedOperationException();
   }

   public void onKey(ScriptEvents.Key var1) {
      throw new UnsupportedOperationException();
   }

   public void onChatSend(ScriptEvents.Chat var1) {
      throw new UnsupportedOperationException();
   }

   public void onAttack(ScriptEvents.Cancellable var1) {
      throw new UnsupportedOperationException();
   }

   public void onAttackEntity(ScriptEvents.Attack var1) {
      throw new UnsupportedOperationException();
   }

   public void onInput(ScriptEvents.Input var1) {
      throw new UnsupportedOperationException();
   }

   public void onMouseMove(ScriptEvents.MouseMove var1) {
      throw new UnsupportedOperationException();
   }

   public void onMouseButton(ScriptEvents.MouseButton var1) {
      throw new UnsupportedOperationException();
   }

   public void onMouseCursor(ScriptEvents.MouseCursor var1) {
      throw new UnsupportedOperationException();
   }

   public void onScreenOpen(ScriptEvents.Screen var1) {
      throw new UnsupportedOperationException();
   }

   public void onSlowDown(ScriptEvents.SlowDown var1) {
      throw new UnsupportedOperationException();
   }

   public void onJumpRotation(ScriptEvents.Rotation var1) {
      throw new UnsupportedOperationException();
   }

   public void onRotation(ScriptEvents.RotationModifier var1) {
      throw new UnsupportedOperationException();
   }

   public void onScreenRender(RenderContext var1) {
      throw new UnsupportedOperationException();
   }

   public void onPlayerJoin(long var1) {
      throw new UnsupportedOperationException();
   }

   public void onWorldChange() {
      throw new UnsupportedOperationException();
   }

   public void onSound(ScriptEvents.Sound var1) {
      throw new UnsupportedOperationException();
   }

   public void onVelocity(ScriptEvents.Velocity var1) {
      throw new UnsupportedOperationException();
   }

   public void onMouseScroll(ScriptEvents.Scroll var1) {
      throw new UnsupportedOperationException();
   }

   public void onItemUse(ScriptEvents.Cancellable var1) {
      throw new UnsupportedOperationException();
   }

   public void onLivingUpdate(ScriptEvents.Cancellable var1) {
      throw new UnsupportedOperationException();
   }

   public void onBlockBreaking(ScriptEvents.Cancellable var1) {
      throw new UnsupportedOperationException();
   }

   public void onBlockBreak(ScriptEvents.BlockBreak var1) {
      throw new UnsupportedOperationException();
   }

   public void onClick() {
      throw new UnsupportedOperationException();
   }

   public void onScreenInput(ScriptEvents.ScreenInput var1) {
      throw new UnsupportedOperationException();
   }
}
