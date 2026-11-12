package com.astralis.scripting.api.rotation;

public interface RotationHandle {
   String getName();

   int getPriority();

   boolean isActive();

   void remove();
}
