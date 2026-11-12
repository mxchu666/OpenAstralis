package com.astralis.scripting.api.script;

public record ScriptDependency(String id, String version) {
   public ScriptDependency(String id, String version) {
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

   public String version() {
      throw new UnsupportedOperationException();
   }
}
