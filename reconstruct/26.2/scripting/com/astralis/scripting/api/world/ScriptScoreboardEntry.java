package com.astralis.scripting.api.world;

public record ScriptScoreboardEntry(String name, int score) {
   public ScriptScoreboardEntry(String name, int score) {
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

   public String name() {
      throw new UnsupportedOperationException();
   }

   public int score() {
      throw new UnsupportedOperationException();
   }
}
