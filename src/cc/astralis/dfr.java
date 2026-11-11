package cc.astralis;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class dfr {
   private static final Queue<Runnable> cjw = new ConcurrentLinkedQueue<>();
   private static final long a = 2344881245482L;

   public static void bmt(Runnable callback) {
      long ax = dfr.a ^ 34262659791692L;
      if (a != null) {
         cjw.offer(a);
      }
   }

   public static void dsv() {
      long a = dfr.a ^ 41083207471392L;
      int[] ax = dar.abu();
      Queue var10000 = cjw;
      if (ax != null) {
         if (cjw.isEmpty()) {
            return;
         }

         var10000 = cjw;
      }

      Runnable[] axx = var10000.toArray(new Runnable[0]);
      cjw.clear();

      for (Runnable axxx : axx) {
         try {
            axxx.run();
         } catch (Exception var9) {
            var9.printStackTrace();
         }

         if (ax == null) {
            break;
         }
      }
   }
}
