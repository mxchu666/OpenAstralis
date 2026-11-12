package com.astralis.scripting.api.entity;

public record ScriptNetworkPlayer(String uuid, String name, String displayName, int ping, String gameMode) {
   public ScriptNetworkPlayer(String uuid, String name, String displayName, int ping, String gameMode) {
   }

   public String getUuid() {
      throw new UnsupportedOperationException();
   }

   public String getName() {
      throw new UnsupportedOperationException();
   }

   public String getDisplayName() {
      throw new UnsupportedOperationException();
   }

   public int getPing() {
      throw new UnsupportedOperationException();
   }

   public String getGameMode() {
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

   public String uuid() {
      throw new UnsupportedOperationException();
   }

   public String name() {
      throw new UnsupportedOperationException();
   }

   public String displayName() {
      throw new UnsupportedOperationException();
   }

   public int ping() {
      throw new UnsupportedOperationException();
   }

   public String gameMode() {
      throw new UnsupportedOperationException();
   }
}
