package cc.astralis;

public class hcr extends cdr implements dlc {
   private final guu hdk;
   private boolean cum;
   private String bgz;
   private boolean gye;
   private static int[] fkp;
   private static int afq;
   private static final long c = 24842422896400L;

   public hcr(guu parentClass, String name) {
      a.hdk = a;
      a.bgz = a;
   }

   public void hkh(boolean hooked) {
      long ax = c ^ 20750934743910L;
      int[] var4 = dar.abu();
      hcr var10000 = a;
      if (var4 != null) {
         a.cum = a;
         if (a) {
            var10000 = a;
            if (var4 != null) {
               if (!a.hdk.dsv()) {
                  return;
               }

               var10000 = a;
            }

            var10000.dil();
            if (var4 != null) {
               return;
            }
         }

         var10000 = a;
      }

      var10000.cbw();
   }

   public String akm() {
      return a.bgz;
   }

   public void ebu(ffn<?> property) {
      a.hdk.beb(a.bih(a::gph));
   }

   public <T> void dxe(ffn<?>... properties) {
      long ax = c ^ 82245306178855L;
      int[] var10000 = dar.abu();
      ffn[] var5 = a;
      int var6 = a.length;
      int[] axx = var10000;
      int var7 = 0;

      while (var7 < var6) {
         ffn<?> axxx = var5[var7];
         a.hdk.beb(axxx.bih(a::gph));
         var7++;
         if (axx == null) {
            break;
         }
      }
   }

   public void dil() {
      dar.gqy().fyf().glu(a);
   }

   public void cbw() {
      dar.gqy().fyf().bet(a);
   }

   public guu clv() {
      return a.hdk;
   }

   public boolean fmi() {
      return a.cum;
   }

   public String heg() {
      return a.bgz;
   }

   public boolean gph() {
      return a.gye;
   }

   public void frr(boolean selected) {
      a.gye = a;
   }

   public static void gfs(int[] var0) {
      fkp = var0;
   }

   public static int[] fps() {
      return fkp;
   }

   static {
      if (euo() != 0) {
         fdl(112);
      }

      if (fps() != null) {
         gfs(new int[4]);
      }
   }

   public static void fdl(int var0) {
      afq = var0;
   }

   public static int cji() {
      return afq;
   }

   public static int euo() {
      int var0 = cji();
      return var0 == 0 ? 103 : 0;
   }
}
