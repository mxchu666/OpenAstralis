package com.astralis.scripting.api.screen;

import com.astralis.scripting.api.render.RenderContext;

public interface ScriptScreen {
   void render(RenderContext var1, double var2, double var4, float var6);

   default boolean mouseClicked(double var1, double var3, int var5, int var6, boolean var7) {
      throw new UnsupportedOperationException();
   }

   default boolean mouseReleased(double var1, double var3, int var5, int var6) {
      throw new UnsupportedOperationException();
   }

   default boolean mouseScrolled(double var1, double var3, double var5, double var7) {
      throw new UnsupportedOperationException();
   }

   default boolean keyPressed(int var1, int var2, int var3) {
      throw new UnsupportedOperationException();
   }

   default boolean charTyped(int var1) {
      throw new UnsupportedOperationException();
   }

   default void onClose() {
      throw new UnsupportedOperationException();
   }
}
