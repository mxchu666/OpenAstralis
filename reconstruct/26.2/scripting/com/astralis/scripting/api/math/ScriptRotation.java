package com.astralis.scripting.api.math;

public record ScriptRotation(float yaw, float pitch) {
   public ScriptRotation(float yaw, float pitch) {
   }

   public ScriptRotation add(float var1, float var2) {
      throw new UnsupportedOperationException();
   }

   public ScriptRotation interpolate(ScriptRotation var1, double var2) {
      throw new UnsupportedOperationException();
   }

   public float yawDifference(ScriptRotation var1) {
      throw new UnsupportedOperationException();
   }

   public float pitchDifference(ScriptRotation var1) {
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

   public float yaw() {
      throw new UnsupportedOperationException();
   }

   public float pitch() {
      throw new UnsupportedOperationException();
   }
}
