package com.astralis.scripting.api.world;

import java.util.Map;

public record ScriptBlockState(
   String id, boolean air, boolean replaceable, boolean solid, boolean interactable, boolean containsFluid, Map<String, String> properties
) {
   public ScriptBlockState(String var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6) {
   }

   public ScriptBlockState(
      String id, boolean air, boolean replaceable, boolean solid, boolean interactable, boolean containsFluid, Map<String, String> properties
   ) {
   }

   public String getProperty(String var1) {
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

   public String id() {
      throw new UnsupportedOperationException();
   }

   public boolean air() {
      throw new UnsupportedOperationException();
   }

   public boolean replaceable() {
      throw new UnsupportedOperationException();
   }

   public boolean solid() {
      throw new UnsupportedOperationException();
   }

   public boolean interactable() {
      throw new UnsupportedOperationException();
   }

   public boolean containsFluid() {
      throw new UnsupportedOperationException();
   }

   public Map<String, String> properties() {
      throw new UnsupportedOperationException();
   }
}
