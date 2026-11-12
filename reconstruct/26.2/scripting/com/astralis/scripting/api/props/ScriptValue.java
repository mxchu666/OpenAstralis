package com.astralis.scripting.api.props;

import com.astralis.scripting.api.render.ScriptColor;
import java.util.List;

public class ScriptValue<T> {
   public T get() {
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

   public List<ScriptValue<?>> getChildren() {
      throw new UnsupportedOperationException();
   }

   public ScriptValue<?> getChild(String var1) {
      throw new UnsupportedOperationException();
   }

   public List<String> getOptions() {
      throw new UnsupportedOperationException();
   }

   public boolean isChipTree() {
      throw new UnsupportedOperationException();
   }

   public void set(T var1) {
      throw new UnsupportedOperationException();
   }
}
