package com.astralis.scripting.api.world;

import com.astralis.scripting.api.entity.ScriptEntity;
import com.astralis.scripting.api.math.ScriptVector3;

public record ScriptEntityHit(ScriptEntity entity, ScriptVector3 position, double distanceSquared) {
   public ScriptEntityHit(ScriptEntity entity, ScriptVector3 position, double distanceSquared) {
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

   public ScriptEntity entity() {
      throw new UnsupportedOperationException();
   }

   public ScriptVector3 position() {
      throw new UnsupportedOperationException();
   }

   public double distanceSquared() {
      throw new UnsupportedOperationException();
   }
}
