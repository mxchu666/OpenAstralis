package com.astralis.scripting.api.target;

import com.astralis.scripting.api.entity.ScriptEntity;
import com.astralis.scripting.api.entity.ScriptPlayer;
import java.util.List;
import java.util.function.Predicate;

public final class TargetQuery {
   public TargetQuery(List<ScriptEntity> var1, ScriptPlayer var2) {
   }

   public TargetQuery playersOnly() {
      throw new UnsupportedOperationException();
   }

   public TargetQuery allLiving() {
      throw new UnsupportedOperationException();
   }

   public TargetQuery allEntities() {
      throw new UnsupportedOperationException();
   }

   public TargetQuery visibleOnly() {
      throw new UnsupportedOperationException();
   }

   public TargetQuery includeInvisible() {
      throw new UnsupportedOperationException();
   }

   public TargetQuery maximumDistance(double var1) {
      throw new UnsupportedOperationException();
   }

   public TargetQuery fieldOfView(double var1) {
      throw new UnsupportedOperationException();
   }

   public TargetQuery sortBy(TargetSort var1) {
      throw new UnsupportedOperationException();
   }

   public TargetQuery filter(Predicate<ScriptEntity> var1) {
      throw new UnsupportedOperationException();
   }

   public ScriptEntity first() {
      throw new UnsupportedOperationException();
   }

   public List<ScriptEntity> find() {
      throw new UnsupportedOperationException();
   }

   public List<ScriptEntity> find(int var1) {
      throw new UnsupportedOperationException();
   }
}
