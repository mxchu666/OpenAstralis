package cc.astralis;

import java.awt.Color;

public class bdz extends fig {
   private final acn feh;
   private final int ctv = 100;
   private final int gpp = 100;
   private final int afi = 10;
   private float ebp;
   private float dkq;
   private float flz = 0.0F;
   private boolean fkk = false;
   private boolean gr = false;

   public bdz(acn colorProperty) {
      a.feh = a;
      a.dtq(a);
      a.hh(130.0F);
      a.cje(15.0F);
   }

   @Override
   public void bfi(float mouseX, float mouseY) {
      a.cje(15 + (a.fkk ? 120 : 0));
      ety.ebb(a.feh.fah(), a.hjg() + 4.0F, a.dtt() + 1.0F, Color.WHITE);
      float ax = a.hjg() + a.av() - 13.0F;
      float axx = a.dtt() + 2.0F;
      dmp.cpp(ax, axx, 10.0F, 10.0F, 4.0F, a.feh.dnp());
      if (a.fkk) {
         float axxx = a.hjg() + 15.0F;
         float axxxx = a.dtt() + 17.0F;
         bgi(axxx, axxxx, 100.0F, 100.0F, a.flz);
         dmp.cpp(axxx + a.ebp - 4.0F, axxxx + a.dkq - 4.0F, 8.0F, 8.0F, 4.0F, new Color(255, 255, 255, 200));
         float axxxxx = axxxx + 100.0F + 5.0F;
         gsl(axxx, axxxxx, 100.0F, 10.0F);
         float axxxxxx = axxx + a.flz * 100.0F;
         dmp.cpp(axxxxxx - 1.0F, axxxxx - 2.0F, 2.0F, 14.0F, 1.0F, Color.WHITE);
      }

      if (a.gr) {
         a.bhk(a, a);
      }
   }

   @Override
   public void apy(double mouseX, double mouseY, int button) {
      float ax = a.hjg() + a.av() - 13.0F;
      float axx = a.dtt() + 2.5F;
      if (fuv.bfm(a, a, ax, axx, 10.0F, 10.0F)) {
         a.fkk = !a.fkk;
      }

      a.gr = true;
      a.bhk(a, a);
   }

   @Override
   public void epq(double mouseX, double mouseY, int button) {
      a.gr = false;
   }

   private void bhk(double a, double a) {
      float ax = a.hjg() + 10.0F;
      float axx = a.dtt() + 15.0F + 2.0F;
      if (a.fkk) {
         if (fuv.bfm(a, a, ax, axx, 100.0F, 100.0F)) {
            a.ebp = (float)(a - ax);
            a.dkq = (float)(a - axx);
            float axxx = a.ebp / 100.0F;
            float axxxx = 1.0F - a.dkq / 100.0F;
            a.feh.gbf(Color.getHSBColor(a.flz, axxx, axxxx));
         }

         float axxx = axx + 100.0F + 5.0F;
         if (fuv.bfm(a, a, ax, axxx, 100.0F, 10.0F)) {
            a.flz = (float)(a - ax) / 100.0F;
            a.flz = Math.max(0.0F, Math.min(1.0F, a.flz));
            float axxxx = a.ebp / 100.0F;
            float axxxxx = 1.0F - a.dkq / 100.0F;
            a.feh.gbf(Color.getHSBColor(a.flz, axxxx, axxxxx));
         }
      }
   }

   public static void bgi(float x, float y, float w, float h, float hue) {
      for (int ax = 0; ax < a; ax++) {
         for (int axx = 0; axx < a; axx++) {
            float axxx = ax / a;
            float axxxx = 1.0F - axx / a;
            Color axxxxx = Color.getHSBColor(a, axxx, axxxx);
            dmp.eq(a + ax, a + axx, axxxxx);
         }
      }
   }

   public static void gsl(float x, float y, float w, float h) {
      for (int ax = 0; ax < a; ax++) {
         float axx = ax / a;
         Color axxx = Color.getHSBColor(axx, 1.0F, 1.0F);
         dmp.euv(a + ax, a, 1.0F, a, axxx);
      }
   }
}
