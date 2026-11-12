package com.astralis.scripting.api.render;

public record ScriptColor(int argb) {
   public ScriptColor(int var1, int var2, int var3, int var4) {
   }

   public ScriptColor(int argb) {
   }

   public int alpha() {
      throw new UnsupportedOperationException();
   }

   public int red() {
      throw new UnsupportedOperationException();
   }

   public int green() {
      throw new UnsupportedOperationException();
   }

   public int blue() {
      throw new UnsupportedOperationException();
   }

   public ScriptColor withAlpha(int var1) {
      throw new UnsupportedOperationException();
   }

   public ScriptColor interpolate(ScriptColor var1, double var2) {
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

   public int argb() {
      throw new UnsupportedOperationException();
   }
}
