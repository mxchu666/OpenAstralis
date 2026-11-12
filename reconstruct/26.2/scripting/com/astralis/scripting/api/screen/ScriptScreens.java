package com.astralis.scripting.api.screen;

public interface ScriptScreens {
   void open(String var1, ScriptScreen var2);

   void close();

   boolean isOpen();

   public interface Managed {
   }
}
