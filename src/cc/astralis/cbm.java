package cc.astralis;

public class cbm {
   private long edc;
   private static cdr[] cjs;
   private static final long a = 76460839558249L;

   public cbm() {
      a.glr();
   }

   public boolean fsc(long delay) {
      long ax = cbm.a ^ 50053690831291L;
      int[] var5 = dar.abu();
      long var6;
      int var10000 = (var6 = System.currentTimeMillis() - a - a.edc) == 0L ? 0 : (var6 < 0L ? -1 : 1);
      if (var5 != null) {
         var10000 = var10000 >= 0 ? 1 : 0;
      }

      return (boolean)var10000;
   }

   public void glr() {
      a.edc = System.currentTimeMillis();
   }

   public long fct() {
      return System.currentTimeMillis() - a.edc;
   }

   public long dou() {
      return a.edc;
   }

   public void dzy(long lastMS) {
      a.edc = a;
   }

   public static void dma(cdr[] var0) {
      cjs = var0;
   }

   public static cdr[] dkd() {
      return cjs;
   }

   static {
      if (dkd() == null) {
         dma(new cdr[1]);
      }
   }
}
