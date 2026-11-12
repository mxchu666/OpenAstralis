package com.astralis.scripting.api.world;

public enum BlockFace {
   DOWN(0, -1, 0),
   UP(0, 1, 0),
   NORTH(0, 0, -1),
   SOUTH(0, 0, 1),
   WEST(-1, 0, 0),
   EAST(1, 0, 0);

   private final int offsetX;
   private final int offsetY;
   private final int offsetZ;

   private BlockFace(final int nullxx, final int nullxxx, final int nullxxxx) {
      this.offsetX = nullxx;
      this.offsetY = nullxxx;
      this.offsetZ = nullxxxx;
   }

   public int getOffsetX() {
      return this.offsetX;
   }

   public int getOffsetY() {
      return this.offsetY;
   }

   public int getOffsetZ() {
      return this.offsetZ;
   }
}
