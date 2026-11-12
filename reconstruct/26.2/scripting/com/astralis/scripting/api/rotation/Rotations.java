package com.astralis.scripting.api.rotation;

import com.astralis.scripting.api.math.ScriptRotation;

public interface Rotations {
   RotationHandle register(String var1, int var2, RotationStrategy var3);

   RotationHandle request(String var1, float var2, float var3, int var4);

   ScriptRotation getSentRotation();

   void clear();
}
