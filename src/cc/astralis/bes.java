package cc.astralis;

import imgui.type.ImFloat;

public class bes extends ffn<ImFloat> {
   public Float aqj;
   public Float dfg;
   public Float ezs;
   public Float hbc;
   public ImFloat eya;
   private static ffn[] edb;
   private static final long a = 52978303285494L;

   public bes(String name, float defaultValue, float min, float max, float increment) {
      super(a, new ImFloat(a));
      a.hbc = a;
      a.aqj = a;
      a.dfg = a;
      a.ezs = a;
      a.eya = new ImFloat(a);
   }

   public void agb(double value, boolean limit) {
      long ax = bes.a ^ 97349471677301L;
      double axx = 1.0 / (!a ? a.ezs.floatValue() : 0.01);
      a.gbf(new ImFloat((float)(Math.round(Math.max((double)a.aqj.floatValue(), Math.min(a ? a.dfg.floatValue() : a.dfg + 9999.0F, a)) * axx) / axx)));
   }

   public Float cpl() {
      return a.aqj;
   }

   public Float hgz() {
      return a.dfg;
   }

   public Float dvc() {
      return a.ezs;
   }

   public Float gmj() {
      return a.hbc;
   }

   public static void esf(ffn[] var0) {
      edb = var0;
   }

   public static ffn[] bdt() {
      return edb;
   }

   static {
      if (bdt() != null) {
         esf(new ffn[5]);
      }
   }
}
