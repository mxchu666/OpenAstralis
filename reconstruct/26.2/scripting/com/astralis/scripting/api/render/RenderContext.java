package com.astralis.scripting.api.render;

import com.astralis.scripting.api.entity.ScriptEntity;
import com.astralis.scripting.api.math.ScriptVector2;
import com.astralis.scripting.api.math.ScriptVector3;

public class RenderContext implements AutoCloseable {
   public RenderContext(Object var1, Object var2, double var3, double var5, double var7) {
   }

   public RectBuilder rect(double var1, double var3, double var5, double var7) {
      throw new UnsupportedOperationException();
   }

   public RectBuilder rect(ScriptVector2 var1, ScriptVector2 var2) {
      throw new UnsupportedOperationException();
   }

   public TextBuilder text(String var1, double var2, double var4) {
      throw new UnsupportedOperationException();
   }

   public TextBuilder text(String var1, double var2, double var4, String var6, double var7) {
      throw new UnsupportedOperationException();
   }

   public float getTextWidth(String var1, String var2, float var3) {
      throw new UnsupportedOperationException();
   }

   public float getLineHeight(String var1, float var2) {
      throw new UnsupportedOperationException();
   }

   public void push() {
      throw new UnsupportedOperationException();
   }

   public void pop() {
      throw new UnsupportedOperationException();
   }

   public void translate(double var1, double var3) {
      throw new UnsupportedOperationException();
   }

   public void translate(double var1, double var3, double var5) {
      throw new UnsupportedOperationException();
   }

   public void scale(double var1) {
      throw new UnsupportedOperationException();
   }

   public void scale(double var1, double var3) {
      throw new UnsupportedOperationException();
   }

   public void rotateZ(double var1) {
      throw new UnsupportedOperationException();
   }

   public void line(double var1, double var3, double var5, double var7, double var9, int var11) {
      throw new UnsupportedOperationException();
   }

   public void line(ScriptVector2 var1, ScriptVector2 var2, double var3, ScriptColor var5) {
      throw new UnsupportedOperationException();
   }

   public void worldText(String var1, double var2, double var4, double var6, double var8, int var10, boolean var11) {
      throw new UnsupportedOperationException();
   }

   public boolean drawPlayerHead(ScriptEntity var1, double var2, double var4, double var6, double var8, int var10) {
      throw new UnsupportedOperationException();
   }

   public void scissor(double var1, double var3, double var5, double var7) {
      throw new UnsupportedOperationException();
   }

   public void endScissor() {
      throw new UnsupportedOperationException();
   }

   public void startMaskWrite() {
      throw new UnsupportedOperationException();
   }

   public void startMaskRead() {
      throw new UnsupportedOperationException();
   }

   public void endMask() {
      throw new UnsupportedOperationException();
   }

   public double getWidth() {
      throw new UnsupportedOperationException();
   }

   public double getHeight() {
      throw new UnsupportedOperationException();
   }

   public void blurRect(double var1, double var3, double var5, double var7, double var9) {
      throw new UnsupportedOperationException();
   }

   public double[] worldToScreen(double var1, double var3, double var5) {
      throw new UnsupportedOperationException();
   }

   public ScriptVector2 worldToScreen(ScriptVector3 var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void close() {
      throw new UnsupportedOperationException();
   }

   public double getCameraX() {
      throw new UnsupportedOperationException();
   }

   public double getCameraY() {
      throw new UnsupportedOperationException();
   }

   public double getCameraZ() {
      throw new UnsupportedOperationException();
   }
}
