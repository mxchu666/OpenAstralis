package com.astralis.scripting.api.world;

public record ScriptBlockHit(int supportX, int supportY, int supportZ, BlockFace face, double hitX, double hitY, double hitZ) {
   public ScriptBlockHit(int supportX, int supportY, int supportZ, BlockFace face, double hitX, double hitY, double hitZ) {
   }

   public int targetX() {
      throw new UnsupportedOperationException();
   }

   public int targetY() {
      throw new UnsupportedOperationException();
   }

   public int targetZ() {
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

   public int supportX() {
      throw new UnsupportedOperationException();
   }

   public int supportY() {
      throw new UnsupportedOperationException();
   }

   public int supportZ() {
      throw new UnsupportedOperationException();
   }

   public BlockFace face() {
      throw new UnsupportedOperationException();
   }

   public double hitX() {
      throw new UnsupportedOperationException();
   }

   public double hitY() {
      throw new UnsupportedOperationException();
   }

   public double hitZ() {
      throw new UnsupportedOperationException();
   }
}
