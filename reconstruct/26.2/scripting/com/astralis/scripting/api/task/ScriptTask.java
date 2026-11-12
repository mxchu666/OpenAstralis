package com.astralis.scripting.api.task;

public interface ScriptTask {
   void cancel();

   boolean isCancelled();

   boolean isComplete();
}
