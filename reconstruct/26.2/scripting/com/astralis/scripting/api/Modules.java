package com.astralis.scripting.api;

import com.astralis.scripting.api.entity.ScriptEntity;
import com.astralis.scripting.api.hud.ScriptDraggable;
import com.astralis.scripting.api.hud.TargetHudRenderer;
import com.astralis.scripting.api.render.ScriptColor;
import com.astralis.scripting.api.screen.ScriptScreen;
import java.util.List;

public class Modules {
   public Modules.ScriptModule get(String var1) {
      throw new UnsupportedOperationException();
   }

   public ScriptEntity getKillAuraTarget() {
      throw new UnsupportedOperationException();
   }

   public Modules.ScriptMode addTargetHudMode(String var1, ScriptDraggable var2, TargetHudRenderer var3) {
      throw new UnsupportedOperationException();
   }

   public boolean exists(String var1) {
      throw new UnsupportedOperationException();
   }

   public List<Modules.ScriptModule> getAll() {
      throw new UnsupportedOperationException();
   }

   public List<Modules.ScriptModule> getEnabled() {
      throw new UnsupportedOperationException();
   }

   public List<Modules.ScriptModule> getByCategory(String var1) {
      throw new UnsupportedOperationException();
   }

   public Modules.ScriptMode addMode(String var1, String var2, String var3, String... var4) {
      throw new UnsupportedOperationException();
   }

   public Modules.ScriptMode addClickGuiMode(String var1, String var2, ScriptScreen var3) {
      throw new UnsupportedOperationException();
   }

   public static class ScriptMode {
      public String getModuleName() {
         throw new UnsupportedOperationException();
      }

      public String getValueName() {
         throw new UnsupportedOperationException();
      }

      public String getName() {
         throw new UnsupportedOperationException();
      }

      public boolean isSelected() {
         throw new UnsupportedOperationException();
      }

      public boolean isActive() {
         throw new UnsupportedOperationException();
      }

      public void select() {
         throw new UnsupportedOperationException();
      }

      public void remove() {
         throw new UnsupportedOperationException();
      }

      public boolean isRegistered() {
         throw new UnsupportedOperationException();
      }

      public boolean isSelectionPending() {
         throw new UnsupportedOperationException();
      }

      public boolean isRemoved() {
         throw new UnsupportedOperationException();
      }
   }

   public static class ScriptModule {
      public String getName() {
         throw new UnsupportedOperationException();
      }

      public String getDescription() {
         throw new UnsupportedOperationException();
      }

      public String getCategory() {
         throw new UnsupportedOperationException();
      }

      public int getKeyCode() {
         throw new UnsupportedOperationException();
      }

      public void setKeyCode(int var1) {
         throw new UnsupportedOperationException();
      }

      public boolean isEnabled() {
         throw new UnsupportedOperationException();
      }

      public void setEnabled(boolean var1) {
         throw new UnsupportedOperationException();
      }

      public void toggle() {
         throw new UnsupportedOperationException();
      }

      public boolean isSuspended() {
         throw new UnsupportedOperationException();
      }

      public void setSuspended(boolean var1) {
         throw new UnsupportedOperationException();
      }

      public Modules.ScriptModuleValue getValue(String var1) {
         throw new UnsupportedOperationException();
      }

      public Modules.ScriptModuleValue getValuePath(String... var1) {
         throw new UnsupportedOperationException();
      }

      public List<Modules.ScriptModuleValue> getValues() {
         throw new UnsupportedOperationException();
      }
   }

   public static class ScriptModuleValue {
      public String getName() {
         throw new UnsupportedOperationException();
      }

      public String getDisplayName() {
         throw new UnsupportedOperationException();
      }

      public String getType() {
         throw new UnsupportedOperationException();
      }

      public boolean isHidden() {
         throw new UnsupportedOperationException();
      }

      public Object get() {
         throw new UnsupportedOperationException();
      }

      public void invoke() {
         throw new UnsupportedOperationException();
      }

      public ScriptColor getFirstColor() {
         throw new UnsupportedOperationException();
      }

      public ScriptColor getConfiguredFirstColor() {
         throw new UnsupportedOperationException();
      }

      public ScriptColor getConfiguredSecondColor() {
         throw new UnsupportedOperationException();
      }

      public ScriptColor getSecondColor() {
         throw new UnsupportedOperationException();
      }

      public ScriptColor[] getColorPair() {
         throw new UnsupportedOperationException();
      }

      public String getColorStyle() {
         throw new UnsupportedOperationException();
      }

      public boolean usesClientTheme() {
         throw new UnsupportedOperationException();
      }

      public boolean usesPlainColor() {
         throw new UnsupportedOperationException();
      }

      public boolean usesGradient() {
         throw new UnsupportedOperationException();
      }

      public List<String> getOptions() {
         throw new UnsupportedOperationException();
      }

      public List<Modules.ScriptModuleValue> getChildren() {
         throw new UnsupportedOperationException();
      }

      public Modules.ScriptModuleValue getChild(String var1) {
         throw new UnsupportedOperationException();
      }

      public boolean isChipTree() {
         throw new UnsupportedOperationException();
      }

      public float getNumberMin() {
         throw new UnsupportedOperationException();
      }

      public float getNumberMax() {
         throw new UnsupportedOperationException();
      }

      public float getNumberIncrement() {
         throw new UnsupportedOperationException();
      }

      public float getRangeMin() {
         throw new UnsupportedOperationException();
      }

      public float getRangeMax() {
         throw new UnsupportedOperationException();
      }

      public float getRangeIncrement() {
         throw new UnsupportedOperationException();
      }

      public void set(Object var1) {
         throw new UnsupportedOperationException();
      }
   }
}
