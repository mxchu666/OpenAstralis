package cc.astralis;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class dkw {
   private static final ScheduledExecutorService hdk = Executors.newScheduledThreadPool(3, new bpv());
   public static ExecutorService ctj = Executors.newCachedThreadPool(new dyn());

   public static void got(Runnable r, long initialDelay, long delay, TimeUnit unit) {
      hdk.scheduleAtFixedRate(a, a, a, a);
   }

   public static ScheduledFuture<?> gbk(Runnable r, long delay, TimeUnit unit) {
      return hdk.schedule(a, a, a);
   }

   public static int ama() {
      return ((ThreadPoolExecutor)ctj).getActiveCount();
   }

   public static void dwk(Runnable runnable) {
      ctj.execute(a);
   }
}
