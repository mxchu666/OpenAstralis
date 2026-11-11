package cc.astralis;

public class erp {
   private final cbm gpl = new cbm();
   private dtw avk;
   private long dtl;
   private double ayk;
   private double gdq;
   private double eev;
   private boolean gls = true;
   private static cdr[] ffj;
   private static final long a = 23321900323499L;

   public erp(dtw easing, long duration) {
      a.avk = a;
      a.dtl = a;
   }

   public void dwm(double endPoint) {
      int[] ax;
      Object var8;
      label48: {
         label47: {
            long axx = erp.a ^ 90070570455586L;
            ax = dar.abu();
            double var10;
            int var10000 = (var10 = a.gdq - a) == 0.0 ? 0 : (var10 < 0.0 ? -1 : 1);
            if (ax != null) {
               if (var10000) {
                  a.gdq = a;
                  a.dsw();
                  if (ax != null) {
                     break label47;
                  }
               }

               a.gls = a.gpl.fsc(a.dtl);
               var8 = a;
               if (ax == null) {
                  break label48;
               }

               var10000 = a.gls;
            }

            if (var10000) {
               a.eev = a;
               return;
            }
         }

         var8 = a.avk.hbd().apply(a.cnx());
      }

      double axxx = (Double)var8;
      var8 = a;
      if (ax != null) {
         if (a.eev > a) {
            a.eev = a.ayk - (a.ayk - a) * axxx;
            if (ax != null) {
               return;
            }
         }

         var8 = a;
      }

      var8.eev = a.ayk + (a - a.ayk) * axxx;
   }

   public double cnx() {
      return (double)(System.currentTimeMillis() - a.gpl.dou()) / a.dtl;
   }

   public void dsw() {
      a.gpl.glr();
      a.ayk = a.eev;
      a.gls = false;
   }

   public cbm fnz() {
      return a.gpl;
   }

   public dtw fzx() {
      return a.avk;
   }

   public long hhk() {
      return a.dtl;
   }

   public double gtd() {
      return a.ayk;
   }

   public double hfn() {
      return a.gdq;
   }

   public double hjo() {
      return a.eev;
   }

   public boolean flo() {
      return a.gls;
   }

   public void hbk(dtw easing) {
      a.avk = a;
   }

   public void hef(long duration) {
      a.dtl = a;
   }

   public void bpt(double startPoint) {
      a.ayk = a;
   }

   public void gbi(double endPoint) {
      a.gdq = a;
   }

   public void enr(double value) {
      a.eev = a;
   }

   public void hgo(boolean finished) {
      a.gls = a;
   }

   public static void ghw(cdr[] var0) {
      ffj = var0;
   }

   public static cdr[] hfm() {
      return ffj;
   }

   static {
      if (hfm() == null) {
         ghw(new cdr[3]);
      }
   }
}
