package com.astralis.scripting.api.script;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public final class ScriptPackage {
   public ScriptPackage(
      String var1, String var2, String var3, String var4, Set<String> var5, Set<String> var6, List<ScriptDependency> var7, Map<String, byte[]> var8
   ) {
   }

   public String id() {
      throw new UnsupportedOperationException();
   }

   public String name() {
      throw new UnsupportedOperationException();
   }

   public String version() {
      throw new UnsupportedOperationException();
   }

   public String apiVersion() {
      throw new UnsupportedOperationException();
   }

   public Set<String> permissions() {
      throw new UnsupportedOperationException();
   }

   public Set<String> requestedHttpDomains() {
      throw new UnsupportedOperationException();
   }

   public List<ScriptDependency> dependencies() {
      throw new UnsupportedOperationException();
   }

   public Set<String> assetNames() {
      throw new UnsupportedOperationException();
   }

   public boolean hasAsset(String var1) {
      throw new UnsupportedOperationException();
   }

   public Optional<byte[]> readAsset(String var1) {
      throw new UnsupportedOperationException();
   }

   public Optional<String> readTextAsset(String var1) {
      throw new UnsupportedOperationException();
   }
}
