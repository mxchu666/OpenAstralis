package cc.astralis;

public abstract class gqb {
   private static cdr[] fss;

   public static void goa(cdr[] var0) {
      fss = var0;
   }

   public static cdr[] gib() {
      return fss;
   }

   static {
      if (gib() == null) {
         goa(new cdr[5]);
      }
   }
}
