package com.astralis.scripting.api.math;

public record ScriptBoundingBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
   public ScriptBoundingBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
   }

   public ScriptVector3 center() {
      throw new UnsupportedOperationException();
   }

   public ScriptVector3 size() {
      throw new UnsupportedOperationException();
   }

   public boolean contains(ScriptVector3 var1) {
      throw new UnsupportedOperationException();
   }

   public boolean intersects(ScriptBoundingBox var1) {
      throw new UnsupportedOperationException();
   }

   public ScriptBoundingBox expand(double var1) {
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

   public double minX() {
      throw new UnsupportedOperationException();
   }

   public double minY() {
      throw new UnsupportedOperationException();
   }

   public double minZ() {
      throw new UnsupportedOperationException();
   }

   public double maxX() {
      throw new UnsupportedOperationException();
   }

   public double maxY() {
      throw new UnsupportedOperationException();
   }

   public double maxZ() {
      throw new UnsupportedOperationException();
   }
}
