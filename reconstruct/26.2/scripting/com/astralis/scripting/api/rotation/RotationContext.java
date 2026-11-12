package com.astralis.scripting.api.rotation;

import com.astralis.scripting.api.entity.ScriptEntity;
import com.astralis.scripting.api.math.ScriptRotation;

public record RotationContext(ScriptRotation base, ScriptRotation current, ScriptRotation targetRotation, ScriptEntity target, String source, float tickDelta) {
   public RotationContext(ScriptRotation base, ScriptRotation current, ScriptRotation targetRotation, ScriptEntity target, String source, float tickDelta) {
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

   public ScriptRotation base() {
      throw new UnsupportedOperationException();
   }

   public ScriptRotation current() {
      throw new UnsupportedOperationException();
   }

   public ScriptRotation targetRotation() {
      throw new UnsupportedOperationException();
   }

   public ScriptEntity target() {
      throw new UnsupportedOperationException();
   }

   public String source() {
      throw new UnsupportedOperationException();
   }

   public float tickDelta() {
      throw new UnsupportedOperationException();
   }
}
