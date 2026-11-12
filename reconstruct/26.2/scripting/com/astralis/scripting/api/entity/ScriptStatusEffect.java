package com.astralis.scripting.api.entity;

public record ScriptStatusEffect(String id, int amplifier, int durationTicks, boolean ambient, boolean visible) {
   public ScriptStatusEffect(String id, int amplifier, int durationTicks, boolean ambient, boolean visible) {
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

   public String id() {
      throw new UnsupportedOperationException();
   }

   public int amplifier() {
      throw new UnsupportedOperationException();
   }

   public int durationTicks() {
      throw new UnsupportedOperationException();
   }

   public boolean ambient() {
      throw new UnsupportedOperationException();
   }

   public boolean visible() {
      throw new UnsupportedOperationException();
   }
}
