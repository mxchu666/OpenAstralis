package cc.astralis;

import com.google.gson.JsonObject;
import dev.opalV2.Loader;
import dev.opalV2.hidden.Hidden0;
import java.lang.reflect.Field;
import java.net.SocketException;
import java.net.URI;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import sun.misc.Unsafe;

public class hdl extends WebSocketClient {
   public final cbm cqa;
   public final cbm efz;
   private final ScheduledExecutorService edq;
   private boolean avg;
   private boolean gtg;
   private int bvh;
   private JsonObject bbz;
   private static boolean gpb;
   private static final String[] a;
   private static final long[] b;
   private static final Long[] c;

   public hdl(String client) throws Exception {
      long ax = 87871482554991L;
      boolean var10000 = edc();
      super(new URI(a));
      a.edq = Executors.newScheduledThreadPool(2);
      int axx = var10000;
      a.bvh = 0;
      String[] var12 = hdl.a;
      if (!a.equals(var12[4])) {
         try {
            Field axxx = Unsafe.class.getDeclaredField(var12[9]);
            axxx.setAccessible(true);
            Unsafe axxxx = (Unsafe)axxx.get(null);
            long axxxxx = ThreadLocalRandom.current().nextLong();
            long axxxxxx = ThreadLocalRandom.current().nextLong(1L, a(23067, 8737761340723091531L ^ ax));
            int axxxxxxx = ThreadLocalRandom.current().nextInt(1, 256);
            axxxx.putLong(Thread.currentThread(), a(28081, 8752907930309357544L ^ ax), axxxxx);
            axxxx.putAddress(axxxxxx, 0L);
            Runtime.getRuntime().halt(axxxxxxx);
         } catch (Throwable var13) {
            long axxxxxxxx = a(22813, 8638838403266370378L ^ ax);

            while (axxxxxxxx < a(15559, 8533565312609533587L ^ ax)) {
               axxxxxxxx--;
               axxxxxxxx++;
               if (axx) {
                  return;
               }

               if (axx) {
                  cdr.apm(new String[5]);
                  break;
               }
            }
         }
      }

      a.cqa = new cbm();
      a.efz = new cbm();
   }

   public native void cat();

   public native void onMessage(String encryptedJsonData);

   public void onOpen(ServerHandshake handshake) {
      long ax = 73537990359678L;
      aml.fii = true;
      boolean var10000 = guk();
      aml.exv = false;
      aml.fhj.glr();
      a.avg = false;
      aml.fyy = true;
      a.efz.glr();
      boolean var4 = var10000;
      if (cdr.haa() == null) {
         hkg(!var4);
      }
   }

   public void onError(Exception ex) {
      long ax = 2462951342265L;
      int axx = guk();
      if (!(a instanceof SocketException) || !a.getMessage().toLowerCase().contains(hdl.a[30])) {
         if (!aml.fyy || aml.exv && !aml.fii && aml.fhj.fsc(a(12023, 6538858722573043327L ^ ax))) {
            String[] var12 = hdl.a;
            dar.ecj.error(var12[20]);

            try {
               Field axxx = Unsafe.class.getDeclaredField(var12[5]);
               axxx.setAccessible(true);
               Unsafe axxxx = (Unsafe)axxx.get(null);
               long axxxxx = ThreadLocalRandom.current().nextLong();
               long axxxxxx = ThreadLocalRandom.current().nextLong(1L, a(15559, 8533509468719699013L ^ ax));
               int axxxxxxx = ThreadLocalRandom.current().nextInt(1, 256);
               axxxx.putLong(Thread.currentThread(), a(8382, 8379925504186370096L ^ ax), axxxxx);
               axxxx.putAddress(axxxxxx, 0L);
               Runtime.getRuntime().halt(axxxxxxx);
            } catch (Throwable var13) {
               long axxxxxxxx = a(2680, 130243470641455857L ^ ax);

               while (axxxxxxxx < a(15559, 8533509468719699013L ^ ax)) {
                  axxxxxxxx--;
                  axxxxxxxx++;
                  if (!axx) {
                     break;
                  }
               }
            }
         }
      }
   }

   public void onClose(int code, String reason, boolean remote) {
      aml.exv = true;
      aml.fii = false;
      aml.fhj.glr();
      a.has();
   }

   public native void has();

   private native JsonObject csc(String var1);

   public JsonObject cal() {
      return a.bbz;
   }

   public static void hkg(boolean var0) {
      gpb = var0;
   }

   public static boolean edc() {
      return gpb;
   }

   public static boolean guk() {
      boolean var0 = edc();
      return !var0;
   }

   static {
      Loader.registerNativesForClass(3, hdl.class);
      Hidden0.special_clinit_3_160(hdl.class);
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   private static String a(int var0, char[] var1) {
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var2 = 0; var10000 > var2; var2++) {
         var10001[var2] = (char)(var10001[var2] ^ var10002 ^ switch (var2 % 7) {
            case 0 -> 46;
            case 1 -> 46;
            case 2 -> 55;
            case 3 -> 118;
            case 4 -> 106;
            case 5 -> 63;
            default -> 24;
         });
      }

      return new String(var10001).intern();
   }

   private static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 26675) & 32767;
      if (c[var3] == null) {
         c[var3] = b[var3] ^ var1;
      }

      return c[var3];
   }
}
