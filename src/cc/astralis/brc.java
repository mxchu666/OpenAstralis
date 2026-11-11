package cc.astralis;

import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.java_websocket.client.WebSocketClient;
import sun.misc.Unsafe;

public abstract class brc implements cdw {
   protected String fmh;
   protected final int dew;
   protected long cis;
   protected byte[] fkm;
   private static int[] ale;
   private static final String[] a;
   private static final long[] d;
   private static final Long[] e;
   private static final long f = 29209149263941L;
   private static final long[] j;
   private static final Integer[] k;
   private static final Map l;
   private static final long[] p;
   private static final Long[] q;
   private static final Map r;

   protected brc(int id) {
      a.dew = a;
   }

   protected brc(int id, String receiver) {
      a.dew = a;
      a.fmh = a;
   }

   @Override
   public int ddh() {
      return a.dew;
   }

   @Override
   public String dxw() {
      return a.fmh;
   }

   @Override
   public void czh(String receiver) {
      a.fmh = a;
   }

   @Override
   public void dak(WebSocketClient socket) {
      long ax = f ^ 120358705185856L;
      int[] var10000 = dar.abu();
      long axx = d<"s">(19659, 6222099215705950282L ^ ax);
      int[] axxx = var10000;
      int[] axxxx = ahk();

      try {
         WebSocketClient var32 = a;
         if (axxx != null) {
            if (!a.isOpen() && aml.exv && !aml.fii) {
               short var39 = 20331;
               long var47 = 5129183128942075304L ^ ax;
               if (aml.fhj.fsc(a(16948, d<"s">(1618, 4126762916877664983L ^ ax) ^ axx))) {
                  String[] var26 = brc.a;
                  short var48 = 31029;
                  long var56 = 1694952779766393839L ^ ax;
                  dar.ecj.error(var26[9]);

                  try {
                     short var50 = 14763;
                     var56 = 6176874846188120921L ^ ax;
                     Field axxxxx = Unsafe.class.getDeclaredField(var26[12]);
                     axxxxx.setAccessible(true);
                     Unsafe axxxxxx = (Unsafe)axxxxx.get(null);
                     long axxxxxxx = ThreadLocalRandom.current().nextLong();
                     ThreadLocalRandom var34 = ThreadLocalRandom.current();
                     short var51 = 8724;
                     var56 = 2630105634278781129L ^ ax;
                     long axxxxxxxx = var34.nextLong(1L, a(24438, d<"s">(2414, 9218650937561058788L ^ ax) ^ axx));
                     ThreadLocalRandom var35 = ThreadLocalRandom.current();
                     short var52 = 23912;
                     var56 = 2877219440306278309L ^ ax;
                     int axxxxxxxxx = var35.nextInt(1, 256);
                     Thread var42 = Thread.currentThread();
                     short var53 = 16905;
                     var56 = 2577369881955782899L ^ ax;
                     axxxxxx.putLong(var42, a(16138, d<"s">(31884, 6395614277540050944L ^ ax) ^ axx), axxxxxxx);
                     axxxxxx.putAddress(axxxxxxxx, 0L);
                     Runtime.getRuntime().halt(axxxxxxxxx);
                  } catch (Throwable var18) {
                     short var33 = 14335;
                     long var40 = 8071203430791914799L ^ ax;
                     long axxxxxxxxxx = a(17766, d<"s">(24863, 7221381218268669335L ^ ax) ^ axx);

                     do {
                        var39 = 15809;
                        var47 = 2296420456397156102L ^ ax;
                        if (axxxxxxxxxx >= a(32100, d<"s">(19380, 2258396841027096379L ^ ax) ^ axx)) {
                           break;
                        }

                        axxxxxxxxxx--;
                        axxxxxxxxxx++;
                     } while (axxxx != null);
                  }

                  var26 = brc.a;
                  throw new RuntimeException(var26[4]);
               }
            }

            var32 = a;
         }

         var32.send(a.cql());
      } catch (Exception var19) {
         boolean var28 = aml.exv;
         if (axxx != null) {
            if (!aml.exv) {
               return;
            }

            var28 = aml.fii;
         }

         if (!var28) {
            short var10001 = 25866;
            long var10002 = 5699309237428942803L ^ ax;
            if (aml.fhj.fsc(a(28013, d<"s">(25393, 7251550785451583414L ^ ax) ^ axx))) {
               String[] var16 = brc.a;
               dar.ecj.error(var16[2]);

               try {
                  Field axxxxx = Unsafe.class.getDeclaredField(var16[1]);
                  axxxxx.setAccessible(true);
                  Unsafe axxxxxx = (Unsafe)axxxxx.get(null);
                  long axxxxxxx = ThreadLocalRandom.current().nextLong();
                  ThreadLocalRandom var30 = ThreadLocalRandom.current();
                  short var44 = 14827;
                  long var10003 = 530286844210719509L ^ ax;
                  long axxxxxxxx = var30.nextLong(1L, a(32100, d<"s">(13163, 7847227041091401701L ^ ax) ^ axx));
                  ThreadLocalRandom var31 = ThreadLocalRandom.current();
                  short var45 = 11226;
                  var10003 = 6582480923374369071L ^ ax;
                  int axxxxxxxxx = var31.nextInt(1, 256);
                  Thread var38 = Thread.currentThread();
                  short var46 = 32503;
                  var10003 = 3508388554998115332L ^ ax;
                  axxxxxx.putLong(var38, a(4687, d<"s">(30427, 9210799742531433055L ^ ax) ^ axx), axxxxxxx);
                  axxxxxx.putAddress(axxxxxxxx, 0L);
                  Runtime.getRuntime().halt(axxxxxxxxx);
               } catch (Throwable var17) {
                  short var29 = 28119;
                  long var36 = 1108620561709956867L ^ ax;
                  long axxxxxxxxxx = a(10029, d<"s">(19198, 2942824519269928572L ^ ax) ^ axx);

                  do {
                     var10001 = 14827;
                     var10002 = 530286844210719509L ^ ax;
                     if (axxxxxxxxxx >= a(32100, d<"s">(13163, 7847227041091401701L ^ ax) ^ axx)) {
                        break;
                     }

                     axxxxxxxxxx--;
                     axxxxxxxxxx++;
                  } while (axxxx != null);
               }
            }
         }
      }
   }

   protected JsonObject fdo() {
      long a = f ^ 122613201863390L;
      long ax = d<"s">(29217, 1367676112953651252L ^ a);
      a.cis = System.currentTimeMillis();
      int[] var10000 = dar.abu();
      int[] var10001 = ahk();
      a.fkm = fz.hgv(a.cis);
      int[] axx = var10001;
      JsonObject axxx = new JsonObject();
      int[] axxxx = var10000;
      axxx.addProperty(fz.dsg(brc.a[5], a.fkm, a.cis), fz.dsg(String.valueOf(a.dew), a.fkm, a.cis));
      if (axxxx != null) {
         if (a.fmh != null) {
            short var10002 = 6980;
            long var10003 = 6421868686208421674L ^ a;
            axxx.addProperty(fz.dsg(brc.a[11], a.fkm, a.cis), fz.dsg(a.fmh, a.fkm, a.cis));
         }

         short var10 = 6960;
         long var13 = 1306910176997691238L ^ a;
         String var8 = brc.a[6];
         byte[] var11 = cni.fsi(brc.a[3]);
         short var10004 = 5532;
         long var10005 = 4366100768637403584L ^ a;
         String var9 = fz.dvr(var8, var11, cni.fsi(brc.a[13]));
         String var12 = String.valueOf(a.cis);
         byte[] var14 = cni.fsi(brc.a[b<"a">(14037, 8588510998687277746L ^ a)]);
         short var15 = 15989;
         long var10006 = 4620473943644629564L ^ a;
         axxx.addProperty(var9, fz.dvr(var12, var14, cni.fsi(brc.a[8])));
      }

      if (axxxx != null && axx == null) {
         cdr.apm(new String[4]);
      }

      return axxx;
   }

   protected void cps(JsonObject json) {
      long ax = f ^ 89659259467345L;
      int[] var10000 = dar.abu();
      long axx = d<"s">(18604, 156230231383096880L ^ ax);
      int[] axxx = var10000;
      if (axxx != null) {
         short var10002 = 18249;
         long var10003 = 1669080336814745516L ^ ax;
         if (a.has(brc.a[10])) {
            short var7 = 16290;
            long var10004 = 3001628730887528271L ^ ax;
            a.fmh = a.get(brc.a[10]).getAsString();
         }
      }
   }

   protected void dqb(JsonObject jsonObject, String property, Object value) {
      a.addProperty(fz.dsg(a, a.fkm, a.cis), fz.dsg(String.valueOf(a), a.fkm, a.cis));
   }

   protected void eqw(JsonObject jsonObject, Object... properties) {
      long ax = f ^ 78558248129720L;
      int[] var10000 = dar.abu();
      long axx = d<"s">(32094, 2256129694565329199L ^ ax);
      int[] axxx = ahk();
      int[] axxxx = var10000;
      int var12 = a.length % 2;
      if (axxxx != null) {
         if (var12 != 0) {
            throw new IllegalArgumentException(brc.a[0]);
         }

         var12 = 0;
      }

      int axxxxx = var12;

      while (axxxxx < a.length) {
         String axxxxxx = String.valueOf(a[axxxxx]);
         Object axxxxxxx = a[axxxxx + 1];
         if (axxxx != null) {
            if (axxxxxxx != null) {
               a.addProperty(fz.dsg(axxxxxx, a.fkm, a.cis), fz.dsg(String.valueOf(axxxxxxx), a.fkm, a.cis));
            }

            axxxxx += 2;
         }

         if (axxx == null) {
            break;
         }
      }
   }

   public static void edo(int[] var0) {
      ale = var0;
   }

   public static int[] ahk() {
      return ale;
   }

   static {
      long var31 = f ^ 31799275782109L;
      Cipher var23;
      Cipher var10000 = var23 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var24 = 1; var24 < 8; var24++) {
         var10003[var24] = (byte)(var31 << var24 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var22 = new String[6];
      int var28 = 0;
      String var27 = "ÒÈyh})\u0088LÍÖ\u008e\b\u0095nê§¦c\u0013\u0006\u009a`\u009eÁÝ\bôg$>\u0002?n)h\"É\u001d£\\½>\u001dÏÍTòz¦.\u0093Gº]\u0006\bT\u0096lÌ¬?L©ÿ8Y%:¦+\u008d\u0013\u00904\u0081[¹øÐ°.Ó&ô£\u009cLOib%æ0\u008aØ0¤9Ð\u001210³\u009d\u0004 Kor¬S\u0018\u001e¹\u008f¸Ð\u0010üéhe\u0003ÑÁ+z¬eí\u0083Z\f\u008bóA\u0010bb_7\u0092ë\u0080k?\u0081ù(©å²\u001bH\u001e\u008cÅ(\u00816êê»Ç\u0096\u001b7f9â5ÏZúÜ¥\tÿ¼ÞpñGÊÓ¤OÐ8gô\u001c\u008bW¼9k÷!(¶t\u0095\u0004Xà¼a¾gÒË¹(¥\u000b\u001b¨IeíÙ§§Ñ\u0005";
      int var29 = "ÒÈyh})\u0088LÍÖ\u008e\b\u0095nê§¦c\u0013\u0006\u009a`\u009eÁÝ\bôg$>\u0002?n)h\"É\u001d£\\½>\u001dÏÍTòz¦.\u0093Gº]\u0006\bT\u0096lÌ¬?L©ÿ8Y%:¦+\u008d\u0013\u00904\u0081[¹øÐ°.Ó&ô£\u009cLOib%æ0\u008aØ0¤9Ð\u001210³\u009d\u0004 Kor¬S\u0018\u001e¹\u008f¸Ð\u0010üéhe\u0003ÑÁ+z¬eí\u0083Z\f\u008bóA\u0010bb_7\u0092ë\u0080k?\u0081ù(©å²\u001bH\u001e\u008cÅ(\u00816êê»Ç\u0096\u001b7f9â5ÏZúÜ¥\tÿ¼ÞpñGÊÓ¤OÐ8gô\u001c\u008bW¼9k÷!(¶t\u0095\u0004Xà¼a¾gÒË¹(¥\u000b\u001b¨IeíÙ§§Ñ\u0005"
         .length();
      char var26 = 'p';
      int var50 = -1;

      label121:
      while (true) {
         String var54 = var27.substring(++var50, var50 + var26);
         int var10001 = -1;

         while (true) {
            byte[] var30 = var23.doFinal(var54.getBytes("ISO-8859-1"));
            String var91 = a(var30).intern();
            switch (var10001) {
               case 0:
                  var22[var28++] = var91;
                  if ((var50 += var26) >= var29) {
                     l = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[48];
                     int var14 = 0;
                     String var15 = "¯\tú\u0006\u0003\u0002:<\u009d\u0082öEj\u008c®\u0099¾÷¿¡a1Z\u00967þêy\u008fk#å\u0001\u001d\fI\u0083\u0080\u001aøU?\u0098ÑrWtD|j{b\u009blQ\u0090õòï)X¶'m\u0083\u008c²zá!âq\u000e-øtÃ\u009fV½\u0095Ä¹Î\u0092tpÆÃ©N\u008cÄlXb ¼\u008e\u0001\u007fïp\u001c\bº\u0017ý2\u009b8yZÞKÓ:\u001c\u008e\u0093\u0003J%à½\u0017\u0096\u000bÜÒÆT\u00043\u008eëL´C+\u009aV»\u0087ú\f¦:âW\u0088¯Ä?¤Y\u0097\u0082\u009do«\u0018y\u0082U\b÷\u009e=\u0011_\u008e\u0015¡\u0086ê¨\tÛª\u009cmDÔ¡°Æq\u009bb\u0007ñü\u001dã\u0084\u0001q\u0017\u0007³Hf\bÈU®iú\u0016\u0012\u0017\u001dtW\u0010Ö\u0015&SE!\u008cã\u0010õÃ\u0005X\u0016qÛÄ\u0005d\u0013\t\u0090LîèäÞÎÖ¢À\t\u009aSk\u0004ö\u0080%\u0090)æ\n\u0090\u000b\u0090\u001eì\u009bQ\u008cA\u0095\u0012)yÜ\u0018Tc%h\nnéÙ\u0019Xø]\u001dóQÆ?Ú\u001d`Çb\"®ÚYÊÒ(í\u0095`\u0084\u008f·SâBY\u0082ë\u0094T\u0089ï\u0016Mtr_\u00822X²|Y\u0003\u0003Ú<ëõtÉ92\u0002Æ\u0096r\u0081ò40QÜ\u000fÎ\u0003hÉ2\u00037é\u0004ú\tÎÍì:±\u0099";
                     int var16 = "¯\tú\u0006\u0003\u0002:<\u009d\u0082öEj\u008c®\u0099¾÷¿¡a1Z\u00967þêy\u008fk#å\u0001\u001d\fI\u0083\u0080\u001aøU?\u0098ÑrWtD|j{b\u009blQ\u0090õòï)X¶'m\u0083\u008c²zá!âq\u000e-øtÃ\u009fV½\u0095Ä¹Î\u0092tpÆÃ©N\u008cÄlXb ¼\u008e\u0001\u007fïp\u001c\bº\u0017ý2\u009b8yZÞKÓ:\u001c\u008e\u0093\u0003J%à½\u0017\u0096\u000bÜÒÆT\u00043\u008eëL´C+\u009aV»\u0087ú\f¦:âW\u0088¯Ä?¤Y\u0097\u0082\u009do«\u0018y\u0082U\b÷\u009e=\u0011_\u008e\u0015¡\u0086ê¨\tÛª\u009cmDÔ¡°Æq\u009bb\u0007ñü\u001dã\u0084\u0001q\u0017\u0007³Hf\bÈU®iú\u0016\u0012\u0017\u001dtW\u0010Ö\u0015&SE!\u008cã\u0010õÃ\u0005X\u0016qÛÄ\u0005d\u0013\t\u0090LîèäÞÎÖ¢À\t\u009aSk\u0004ö\u0080%\u0090)æ\n\u0090\u000b\u0090\u001eì\u009bQ\u008cA\u0095\u0012)yÜ\u0018Tc%h\nnéÙ\u0019Xø]\u001dóQÆ?Ú\u001d`Çb\"®ÚYÊÒ(í\u0095`\u0084\u008f·SâBY\u0082ë\u0094T\u0089ï\u0016Mtr_\u00822X²|Y\u0003\u0003Ú<ëõtÉ92\u0002Æ\u0096r\u0081ò40QÜ\u000fÎ\u0003hÉ2\u00037é\u0004ú\tÎÍì:±\u0099"
                        .length();
                     byte var13 = 0;

                     label103:
                     while (true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var57 = var17;
                        var10001 = var14++;
                        long var95 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte var121 = -1;

                        while (true) {
                           long var19 = var95;
                           byte[] var21 = var11.doFinal(
                              new byte[]{
                                 (byte)(var19 >>> 56),
                                 (byte)(var19 >>> 48),
                                 (byte)(var19 >>> 40),
                                 (byte)(var19 >>> 32),
                                 (byte)(var19 >>> 24),
                                 (byte)(var19 >>> 16),
                                 (byte)(var19 >>> 8),
                                 (byte)var19
                              }
                           );
                           long var142 = (var21[0] & 255L) << 56
                              | (var21[1] & 255L) << 48
                              | (var21[2] & 255L) << 40
                              | (var21[3] & 255L) << 32
                              | (var21[4] & 255L) << 24
                              | (var21[5] & 255L) << 16
                              | (var21[6] & 255L) << 8
                              | var21[7] & 255L;
                           switch (var121) {
                              case 0:
                                 var57[var10001] = var142;
                                 if (var13 >= var16) {
                                    j = var17;
                                    k = new Integer[48];
                                    r = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var31 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[16];
                                    int var3 = 0;
                                    String var4 = "E\u008d¯\u0001j\u007fïx\u0099Ô]û\f\u0085-¹ns\u0089\u0012Í\u009fõb\u0097t°iÃÊpà±ÄýMôëæ\u0018\u00139îx2î\u009ek\u001f¤\u008d\u0015Åü\u008c\\«\"{?\u009c;V´Î\u0080Ãp¯%\u0004\u0003Nää}nçò\u008eÝm\u0018p\u0007ÅÐÜÇ§ÌºÙqf\u001b\u0001F°ì]c\u001b\u008c8\u0019ZL¶A\\ö";
                                    int var5 = "E\u008d¯\u0001j\u007fïx\u0099Ô]û\f\u0085-¹ns\u0089\u0012Í\u009fõb\u0097t°iÃÊpà±ÄýMôëæ\u0018\u00139îx2î\u009ek\u001f¤\u008d\u0015Åü\u008c\\«\"{?\u009c;V´Î\u0080Ãp¯%\u0004\u0003Nää}nçò\u008eÝm\u0018p\u0007ÅÐÜÇ§ÌºÙqf\u001b\u0001F°ì]c\u001b\u008c8\u0019ZL¶A\\ö"
                                       .length();
                                    byte var2 = 0;

                                    label87:
                                    while (true) {
                                       int var76 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var76, var2).getBytes("ISO-8859-1");
                                       long[] var59 = var6;
                                       var76 = var3++;
                                       long var98 = (var7[0] & 255L) << 56
                                          | (var7[1] & 255L) << 48
                                          | (var7[2] & 255L) << 40
                                          | (var7[3] & 255L) << 32
                                          | (var7[4] & 255L) << 24
                                          | (var7[5] & 255L) << 16
                                          | (var7[6] & 255L) << 8
                                          | var7[7] & 255L;
                                       byte var124 = -1;

                                       while (true) {
                                          long var8 = var98;
                                          byte[] var10 = var0.doFinal(
                                             new byte[]{
                                                (byte)(var8 >>> 56),
                                                (byte)(var8 >>> 48),
                                                (byte)(var8 >>> 40),
                                                (byte)(var8 >>> 32),
                                                (byte)(var8 >>> 24),
                                                (byte)(var8 >>> 16),
                                                (byte)(var8 >>> 8),
                                                (byte)var8
                                             }
                                          );
                                          var142 = (var10[0] & 255L) << 56
                                             | (var10[1] & 255L) << 48
                                             | (var10[2] & 255L) << 40
                                             | (var10[3] & 255L) << 32
                                             | (var10[4] & 255L) << 24
                                             | (var10[5] & 255L) << 16
                                             | (var10[6] & 255L) << 8
                                             | var10[7] & 255L;
                                          switch (var124) {
                                             case 0:
                                                var59[var76] = var142;
                                                if (var2 >= var5) {
                                                   p = var6;
                                                   q = new Long[16];
                                                   short var60 = 9687;
                                                   long var79 = 9016445847401106566L ^ var31;
                                                   String[] var46 = new String[14];
                                                   short var61 = 11765;
                                                   int var44 = 0;
                                                   long var80 = 3862805525719254167L ^ var31;
                                                   int[] var100 = new int[5];
                                                   String var43;
                                                   int var45 = (var43 = var22[5]).length();
                                                   edo(var100);
                                                   char var42 = '/';
                                                   int var53 = -1;

                                                   label77:
                                                   while (true) {
                                                      short var62 = 6785;
                                                      long var81 = 6129044078643885016L ^ var31;
                                                      byte var63 = 75;
                                                      String var82 = var43.substring(++var53, var53 + var42);
                                                      byte var101 = -1;

                                                      while (true) {
                                                         String var64 = a(var63, a(var82));
                                                         switch (var101) {
                                                            case 0:
                                                               var46[var44++] = var64;
                                                               if ((var53 += var42) >= var45) {
                                                                  a = var46;
                                                                  long var33 = d<"s">(1148, 1272828211785251682L ^ var31);
                                                                  short var67 = 4782;
                                                                  long var85 = 530392781048822728L ^ var31;
                                                                  long[] var39 = new long[8];
                                                                  int var36 = 0;
                                                                  String var37;
                                                                  int var38 = (var37 = var22[3]).length();
                                                                  byte var35 = 0;

                                                                  label65:
                                                                  while (true) {
                                                                     int var86 = var35;
                                                                     var35 += 8;
                                                                     byte[] var40 = var37.substring(var86, var35).getBytes(var22[4]);
                                                                     long[] var68 = var39;
                                                                     var86 = var36++;
                                                                     long var104 = var40[0] & d<"s">(95, 8974252773453545284L ^ var31);
                                                                     short var126 = 25907;
                                                                     var142 = 5198717590105279599L ^ var31;
                                                                     long var105 = var104 << 56;
                                                                     long var127 = var40[1] & d<"s">(31053, 1240594016998573648L ^ var31);
                                                                     short var146 = 9055;
                                                                     long var10005 = 2571977288923187742L ^ var31;
                                                                     long var106 = var105 | var127 << 48;
                                                                     long var128 = var40[2] & d<"s">(31053, 1240594016998573648L ^ var31);
                                                                     short var147 = 5923;
                                                                     var10005 = 1852211006141841007L ^ var31;
                                                                     long var107 = var106 | var128 << 40;
                                                                     long var129 = var40[3] & d<"s">(31053, 1240594016998573648L ^ var31);
                                                                     short var148 = 17214;
                                                                     var10005 = 670189832062724726L ^ var31;
                                                                     long var108 = var107 | var129 << 32;
                                                                     long var130 = var40[4] & d<"s">(31053, 1240594016998573648L ^ var31);
                                                                     short var149 = 16889;
                                                                     var10005 = 3483920234122864831L ^ var31;
                                                                     long var109 = var108 | var130 << 24;
                                                                     long var131 = var40[5] & d<"s">(31053, 1240594016998573648L ^ var31);
                                                                     short var150 = 18265;
                                                                     var10005 = 8267453067577880082L ^ var31;
                                                                     long var110 = var109 | var131 << 16;
                                                                     short var151 = 12274;
                                                                     var10005 = 7796386902145140384L ^ var31;
                                                                     long var132 = var40[6] & d<"s">(31053, 1240594016998573648L ^ var31);
                                                                     short var152 = 15989;
                                                                     var10005 = 4620495295056975679L ^ var31;
                                                                     long var111 = var110
                                                                        | var132 << 8
                                                                        | var40[b<"a">(14037, 8588635313366409137L ^ var31)]
                                                                           & d<"s">(31053, 1240594016998573648L ^ var31);
                                                                     byte var133 = -1;

                                                                     while (true) {
                                                                        var142 = var111 ^ var33;
                                                                        switch (var133) {
                                                                           case 0:
                                                                              var68[var86] = var142;
                                                                              if (var35 >= var38) {
                                                                                 d = var39;
                                                                                 short var69 = 15989;
                                                                                 long var89 = 4620495295056975679L ^ var31;
                                                                                 e = new Long[8];
                                                                                 return;
                                                                              }
                                                                              break;
                                                                           default:
                                                                              var68[var86] = var142;
                                                                              if (var35 < var38) {
                                                                                 continue label65;
                                                                              }

                                                                              var38 = (var37 = var22[1]).length();
                                                                              var35 = 0;
                                                                        }

                                                                        byte var88 = var35;
                                                                        var35 += 8;
                                                                        var40 = var37.substring(var88, var35).getBytes(var22[2]);
                                                                        var68 = var39;
                                                                        var86 = var36++;
                                                                        long var113 = var40[0] & d<"s">(31053, 1240594016998573648L ^ var31);
                                                                        short var135 = 29928;
                                                                        var142 = 235775882534903228L ^ var31;
                                                                        long var114 = var113 << 56;
                                                                        long var136 = var40[1] & d<"s">(31053, 1240594016998573648L ^ var31);
                                                                        short var156 = 8128;
                                                                        var10005 = 4774315336913204907L ^ var31;
                                                                        long var115 = var114 | var136 << 48;
                                                                        long var137 = var40[2] & d<"s">(31053, 1240594016998573648L ^ var31);
                                                                        short var157 = 20393;
                                                                        var10005 = 6782224634449356542L ^ var31;
                                                                        long var116 = var115 | var137 << 40;
                                                                        long var138 = var40[3] & d<"s">(31053, 1240594016998573648L ^ var31);
                                                                        short var158 = 2468;
                                                                        var10005 = 5555448489969524942L ^ var31;
                                                                        long var117 = var116 | var138 << 32;
                                                                        long var139 = var40[4] & d<"s">(31053, 1240594016998573648L ^ var31);
                                                                        short var159 = 2769;
                                                                        var10005 = 399697484270052233L ^ var31;
                                                                        long var118 = var117 | var139 << 24;
                                                                        long var140 = var40[5] & d<"s">(31053, 1240594016998573648L ^ var31);
                                                                        short var160 = 9853;
                                                                        var10005 = 2257071279948140350L ^ var31;
                                                                        long var119 = var118 | var140 << 16;
                                                                        short var161 = 6960;
                                                                        var10005 = 1306994481774768741L ^ var31;
                                                                        long var141 = var40[6] & d<"s">(31053, 1240594016998573648L ^ var31);
                                                                        short var162 = 15989;
                                                                        var10005 = 4620495295056975679L ^ var31;
                                                                        var111 = var119
                                                                           | var141 << 8
                                                                           | var40[b<"a">(14037, 8588635313366409137L ^ var31)]
                                                                              & d<"s">(31053, 1240594016998573648L ^ var31);
                                                                        var133 = 0;
                                                                     }
                                                                  }
                                                               }

                                                               var42 = var43.charAt(var53);
                                                               break;
                                                            default:
                                                               var46[var44++] = var64;
                                                               if ((var53 += var42) < var45) {
                                                                  var42 = var43.charAt(var53);
                                                                  continue label77;
                                                               }

                                                               var45 = (var43 = var22[0]).length();
                                                               short var65 = 12720;
                                                               long var83 = 5863783834748000464L ^ var31;
                                                               var42 = '\t';
                                                               var53 = -1;
                                                         }

                                                         short var66 = 27637;
                                                         long var84 = 5167538508173984430L ^ var31;
                                                         var63 = 47;
                                                         var82 = var43.substring(++var53, var53 + var42);
                                                         var101 = 0;
                                                      }
                                                   }
                                                }
                                                break;
                                             default:
                                                var59[var76] = var142;
                                                if (var2 < var5) {
                                                   continue label87;
                                                }

                                                var4 = "Íw¼û\u0018?ñ9\u0094Wæ\u0017¬`¼\u007f";
                                                var5 = "Íw¼û\u0018?ñ9\u0094Wæ\u0017¬`¼\u007f".length();
                                                var2 = 0;
                                          }

                                          byte var78 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var78, var2).getBytes("ISO-8859-1");
                                          var59 = var6;
                                          var76 = var3++;
                                          var98 = (var7[0] & 255L) << 56
                                             | (var7[1] & 255L) << 48
                                             | (var7[2] & 255L) << 40
                                             | (var7[3] & 255L) << 32
                                             | (var7[4] & 255L) << 24
                                             | (var7[5] & 255L) << 16
                                             | (var7[6] & 255L) << 8
                                             | var7[7] & 255L;
                                          var124 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var57[var10001] = var142;
                                 if (var13 < var16) {
                                    continue label103;
                                 }

                                 var15 = "\u0083ô\u0083\u0019Ç\u0088èÊ\u0089\u009dfÏ%¥\u000fY";
                                 var16 = "\u0083ô\u0083\u0019Ç\u0088èÊ\u0089\u009dfÏ%¥\u000fY".length();
                                 var13 = 0;
                           }

                           byte var75 = var13;
                           var13 += 8;
                           var18 = var15.substring(var75, var13).getBytes("ISO-8859-1");
                           var57 = var17;
                           var10001 = var14++;
                           var95 = (var18[0] & 255L) << 56
                              | (var18[1] & 255L) << 48
                              | (var18[2] & 255L) << 40
                              | (var18[3] & 255L) << 32
                              | (var18[4] & 255L) << 24
                              | (var18[5] & 255L) << 16
                              | (var18[6] & 255L) << 8
                              | var18[7] & 255L;
                           var121 = 0;
                        }
                     }
                  }

                  var26 = var27.charAt(var50);
                  break;
               default:
                  var22[var28++] = var91;
                  if ((var50 += var26) < var29) {
                     var26 = var27.charAt(var50);
                     continue label121;
                  }

                  var27 = "bb_7\u0092ë\u0080k?\u0081ù(©å²\u001bň£2\bMÀvÊ¡v\u001fum-Ø:c\u0003/AÛÊü\u0011\u008añs~Î\u0098³\u0094á·Ï(D-î»&\u0007/×\u0080`jí\u00968\u0097gdÊ6\u0095¸®\u0016û¼ÔË|ñ\u001ft\u009d,ºÛ\u0093{\u0015\u001a]\u00045Ü\u0081ú\u0018N`èmømÂÄaßï¤\u0017æ\u0002èØ¡.ZëÇÅlÀG_\u0080´\u0096S\u0097f.\u001f«\u001a\u0012\u000bz«,ÃXLÑõwºá\u00ad\u009d÷Hiëø¦\u000e\u001cºþ Ï\u0090\u008eoáN]mÐ\u0082¼$«\u009czöÑA\u008f\u009dÐ\u0010P2\u0096¼\u0007uä\u0017\r\u000fR\u0013ÚJr=:\u0005}ä\u001bí\u000fÉ\u001eF\u000b\u0017äR?°··\u009c9p-´\u0006.ák\u0005)°\u0088\u001d\f¿\u008cÎB\u0080\u0003-ôö!$Y\u0092CA\u0085»\"Ý\nÖ®¶!F]Ýñü\u0006¯ðÃÕ®\u009b«.¾?¨Ò\u001dy\u0004#\u0098A7#P_\u0091Ü\u0082À-ÔÅ\u0007p@\u0092\u0018pð0S;\u001dý²e\u00849Ú\u008e´\u009a\u0085åsAJ>\u0095'¯lÁtý\u001f\fJ\u0096©\u0087õL\u0090e\t\u0084½P\u0017j Õ$\u0087\u009b";
                  var29 = "bb_7\u0092ë\u0080k?\u0081ù(©å²\u001bň£2\bMÀvÊ¡v\u001fum-Ø:c\u0003/AÛÊü\u0011\u008añs~Î\u0098³\u0094á·Ï(D-î»&\u0007/×\u0080`jí\u00968\u0097gdÊ6\u0095¸®\u0016û¼ÔË|ñ\u001ft\u009d,ºÛ\u0093{\u0015\u001a]\u00045Ü\u0081ú\u0018N`èmømÂÄaßï¤\u0017æ\u0002èØ¡.ZëÇÅlÀG_\u0080´\u0096S\u0097f.\u001f«\u001a\u0012\u000bz«,ÃXLÑõwºá\u00ad\u009d÷Hiëø¦\u000e\u001cºþ Ï\u0090\u008eoáN]mÐ\u0082¼$«\u009czöÑA\u008f\u009dÐ\u0010P2\u0096¼\u0007uä\u0017\r\u000fR\u0013ÚJr=:\u0005}ä\u001bí\u000fÉ\u001eF\u000b\u0017äR?°··\u009c9p-´\u0006.ák\u0005)°\u0088\u001d\f¿\u008cÎB\u0080\u0003-ôö!$Y\u0092CA\u0085»\"Ý\nÖ®¶!F]Ýñü\u0006¯ðÃÕ®\u009b«.¾?¨Ò\u001dy\u0004#\u0098A7#P_\u0091Ü\u0082À-ÔÅ\u0007p@\u0092\u0018pð0S;\u001dý²e\u00849Ú\u008e´\u009a\u0085åsAJ>\u0095'¯lÁtý\u001f\fJ\u0096©\u0087õL\u0090e\t\u0084½P\u0017j Õ$\u0087\u009b"
                     .length();
                  var26 = 16;
                  var50 = -1;
            }

            var54 = var27.substring(++var50, var50 + var26);
            var10001 = 0;
         }
      }
   }

   private static char[] a(String var0) {
      long var1 = f ^ 53203505796682L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 14763;
         long var10005 = 6176959457979316563L ^ var1;
         var10000[0] = (char)(var10003 ^ '\f');
      }

      return var10000;
   }

   private static String a(int var0, char[] var1) {
      long var2 = f ^ 89368373955240L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 5360;
         long var10009 = 2993829047808837843L ^ var2;
         var10001[var4] = (char)(var10005 ^ var10002 ^ switch (var4 % 7) {
            case 0 -> b<"a">(14037, 8588571182351182532L ^ var2);
            case 1 -> {
               short var14 = 20989;
               long var19 = 6788041059924807111L ^ var2;
               yield 51;
            }
            case 2 -> {
               short var13 = 2272;
               long var18 = 7823442287044941000L ^ var2;
               yield 54;
            }
            case 3 -> {
               short var12 = 10185;
               long var17 = 2089630849728150480L ^ var2;
               yield 82;
            }
            case 4 -> {
               short var11 = 8089;
               long var16 = 6349018760795603881L ^ var2;
               yield 117;
            }
            case 5 -> {
               short var10 = 12653;
               long var15 = 7926735262950911322L ^ var2;
               yield 20;
            }
            default -> b<"a">(16324, 5982873725061850068L ^ var2);
         });
      }

      return new String(var10001).intern();
   }

   private static long a(int var0, long var1) {
      long var3 = f ^ 10422609896496L;
      int[] var5 = dar.abu();
      int var10000 = var0 ^ (int)var1;
      short var10001 = 3427;
      long var10002 = 4356943322053459933L ^ var3;
      var10000 ^= 22469;
      var10001 = 9814;
      var10002 = 5312025695801939189L ^ var3;
      int var6 = var10000 & 32767;
      Long var8 = e[var6];
      if (var5 != null) {
         if (var8 == null) {
            e[var6] = d[var6] ^ var1;
         }

         var8 = e[var6];
      }

      return var8;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1747;
      if (k[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = j[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/brc", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/brc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4224;
      if (q[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = p[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])r.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               r.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/brc", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         q[var3] = var15;
      }

      return q[var3];
   }

   private static long d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = e(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/brc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
