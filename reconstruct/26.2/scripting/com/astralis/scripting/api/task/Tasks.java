package com.astralis.scripting.api.task;

public interface Tasks {
   ScriptTask afterTicks(int var1, Runnable var2);

   ScriptTask everyTicks(int var1, Runnable var2);

   void clear();
}
