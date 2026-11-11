package cc.astralis;

import java.awt.Color;

public class acn extends ffn<Color> {
   private float ck = 0.0F;
   private float fih = 1.0F;
   private float bvx = 1.0F;

   public acn(String name, Color color) {
      super(a, a);
      a.dtr(a);
   }

   public void dtr(Color color) {
      float[] ax = Color.RGBtoHSB(a.getRed(), a.getGreen(), a.getBlue(), null);
      a.ck = ax[0];
      a.fih = ax[1];
      a.bvx = ax[2];
   }

   public void enb(float hue, float saturation, float brightness, float alpha) {
      a.ck = a;
      a.fih = a;
      a.bvx = a;
   }

   public float eia() {
      return a.ck;
   }

   public float coh() {
      return a.fih;
   }

   public float fke() {
      return a.bvx;
   }

   public void aik(float hue) {
      a.ck = a;
   }

   public void bdt(float saturation) {
      a.fih = a;
   }

   public void fth(float brightness) {
      a.bvx = a;
   }
}
