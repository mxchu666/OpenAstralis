package cc.astralis;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import sun.misc.Unsafe;

public class eby {
   private static boolean djg;
   private static final long a = 112314524250024L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long[] h;
   private static final Long[] i;
   private static final Map j;

   public static void fqb() throws Throwable {
      short var18;
      long a = eby.a ^ 37005503122882L;
      int[] var10000 = dar.abu();
      eab();
      int[] ax = var10000;
      var18 = 17528;
      long var10001 = 9199546849436271796L ^ a;
      String var17 = System.getProperty("os.name").toLowerCase();
      short var22 = 15816;
      long var10002 = 2566847987509722382L ^ a;
      var18 = var17.startsWith("win");
      label63:
      if (ax != null) {
         if (var18) {
            short var30 = 17465;
            long var10003 = 2202239306220438779L ^ a;
            short var39 = 15185;
            long var10004 = 8628104926177655683L ^ a;
            File axx = new File("C:\\Windows\\System32\\drivers\\etc", "hosts");
            var18 = axx.exists();
            if (ax == null) {
               break label63;
            }

            if (var18) {
               Scanner axxx = new Scanner(axx);

               while (axxx.hasNextLine()) {
                  String axxxx = axxx.nextLine().toLowerCase();
                  if (ax != null) {
                     short var23 = 2444;
                     var10002 = 733718856611645787L ^ a;
                     var18 = axxxx.contains("wss://ws.serenityutils.club");
                     if (ax == null) {
                        break label63;
                     }

                     if (!var18) {
                        short var24 = 31348;
                        var10002 = 4839826556869032636L ^ a;
                        if (!axxxx.contains("45.144.55.184")) {
                           if (ax != null) {
                              continue;
                           }
                           break;
                        }
                     }

                     short var25 = 6878;
                     var10002 = 6985174887244880397L ^ a;
                     dar.ecj.error("Runtime Standard Failed 0x02");
                  }

                  try {
                     short var28 = 5837;
                     var10002 = 3314731224952559108L ^ a;
                     Field axxxxx = Unsafe.class.getDeclaredField("theUnsafe");
                     axxxxx.setAccessible(true);
                     Unsafe axxxxxx = (Unsafe)axxxxx.get(null);
                     long axxxxxxx = ThreadLocalRandom.current().nextLong();
                     ThreadLocalRandom var20 = ThreadLocalRandom.current();
                     short var36 = 13597;
                     var10003 = 6363893389077235333L ^ a;
                     long axxxxxxxx = var20.nextLong(1L, Long.MAX_VALUE);
                     ThreadLocalRandom var21 = ThreadLocalRandom.current();
                     short var37 = 11041;
                     var10003 = 7600478760500327401L ^ a;
                     int axxxxxxxxx = var21.nextInt(1, 256);
                     Thread var29 = Thread.currentThread();
                     short var38 = 11717;
                     var10003 = 3221414300771638873L ^ a;
                     axxxxxx.putLong(var29, 8L, axxxxxxx);
                     axxxxxx.putAddress(axxxxxxxx, 0L);
                     Runtime.getRuntime().halt(axxxxxxxxx);
                  } catch (Throwable var13) {
                     var18 = 4110;
                     var10001 = 5822405786677371799L ^ a;
                     long axxxxxxxxxx = Long.MIN_VALUE;

                     do {
                        short var27 = 28338;
                        var10002 = 3980814760639962415L ^ a;
                        if (axxxxxxxxxx >= Long.MAX_VALUE) {
                           break;
                        }

                        axxxxxxxxxx--;
                        axxxxxxxxxx++;
                        if (ax == null) {
                           return;
                        }
                     } while (ax != null);
                  }

                  axxx.close();
                  return;
               }

               axxx.close();
            }
         }

         var18 = djg;
      }

      if (!var18) {
         dar.gqy().gp().cat();
      }
   }

   private static void eab() {
      long a = eby.a ^ 71400700065002L;
      int[] var10000 = dar.abu();
      short var10001 = 7427;
      long var10002 = 6507812420037229798L ^ a;
      String[] var30 = new String[13];
      short var10004 = 15317;
      long var10005 = 1846042673882268203L ^ a;
      var30[0] = "-agentlib:jdwp";
      var10004 = 15602;
      var10005 = 929284770619393306L ^ a;
      var30[1] = "-XBootclasspath";
      var10004 = 29527;
      var10005 = 8063377328407431860L ^ a;
      var30[2] = "-javaagent";
      var10004 = 32488;
      var10005 = 3142635203667150613L ^ a;
      var30[3] = "-Xdebug";
      var10004 = 21489;
      var10005 = 1352606633202117146L ^ a;
      var30[4] = "-agentlib";
      var10004 = 17625;
      var10005 = 2336990715085290815L ^ a;
      var30[5] = "-Xrunjdwp";
      short var10003 = 2841;
      long var58 = 5976319606861703921L ^ a;
      var10004 = 25861;
      var10005 = 8880677712338705634L ^ a;
      var30[6] = "-Xnoagent";
      var10003 = 10517;
      long var60 = 15969916579449073L ^ a;
      var10004 = 17895;
      var10005 = 8177060162528836610L ^ a;
      var30[7] = "-verbose";
      var10003 = 8112;
      long var62 = 2112625976994741842L ^ a;
      var10004 = 25575;
      var10005 = 4682493383340939781L ^ a;
      var30[8] = "-DproxySet";
      var10003 = 30524;
      long var64 = 9086511401242810070L ^ a;
      var10004 = 7575;
      var10005 = 2901827200110404715L ^ a;
      var30[9] = "-DproxyHost";
      var10003 = 29426;
      long var66 = 8028780958810592021L ^ a;
      var10004 = 31438;
      var10005 = 4275367396377477927L ^ a;
      var30[10] = "-DproxyPort";
      var10003 = 5582;
      long var68 = 4276350161526600751L ^ a;
      var10004 = 13256;
      var10005 = 3883115212438571556L ^ a;
      var30[11] = "-Djavax.net.ssl.trustStore";
      var10003 = 11001;
      long var70 = 3009379137659931418L ^ a;
      var10004 = 12830;
      var10005 = 3463529474851146737L ^ a;
      var30[12] = "-Djavax.net.ssl.trustStorePassword";
      String[] ax = var30;
      RuntimeMXBean axx = ManagementFactory.getRuntimeMXBean();
      String axxx = axx.getInputArguments().toString();
      boolean axxxx = true;
      boolean axxxxx = true;
      boolean axxxxxx = false;
      int axxxxxxx = 0;
      String[] axxxxxxxx = ax;
      int axxxxxxxxx = ax.length;
      int axxxxxxxxxx = 0;
      int[] axxxxxxxxxxx = var10000;

      while (true) {
         label109:
         if (axxxxxxxxxx < axxxxxxxxx) {
            String axxxxxxxxxxxx = axxxxxxxx[axxxxxxxxxx];
            if (axxxxxxxxxxx != null) {
               var25 = axxxxxxxxxxxx.contains("-");
               if (axxxxxxxxxxx == null) {
                  break;
               }

               if (var25 == 0) {
                  axxxx = false;
                  if (axxxxxxxxxxx != null) {
                     break label109;
                  }
               }

               axxxxxxx++;
               axxxxxxxxxx++;
            }

            if (axxxxxxxxxxx != null) {
               continue;
            }
         }

         var25 = axxxxxxx;
         break;
      }

      if (axxxxxxxxxxx != null) {
         var10001 = 17754;
         var10002 = 3017612587945092284L ^ a;
         if (var25 != 13) {
            axxxxx = false;
         }

         axxxxxxxx = ax;
         axxxxxxxxx = ax.length;
         var25 = 0;
      }

      axxxxxxxxxx = var25;

      while (true) {
         label94:
         if (axxxxxxxxxx < axxxxxxxxx) {
            String axxxxxxxxxxxxx = axxxxxxxx[axxxxxxxxxx];
            if (axxxxxxxxxxx != null) {
               var26 = axxx.contains(axxxxxxxxxxxxx);
               if (axxxxxxxxxxx == null) {
                  break;
               }

               if (var26) {
                  axxxxxx = true;
                  if (axxxxxxxxxxx != null) {
                     break label94;
                  }
               }

               axxxxxxxxxx++;
            }

            if (axxxxxxxxxxx != null) {
               continue;
            }
         }

         var26 = axxxx;
         break;
      }

      label81:
      if (axxxxxxxxxxx != null) {
         if (var26) {
            var26 = axxxxx;
            if (axxxxxxxxxxx == null) {
               break label81;
            }

            if (axxxxx && !axxxxxx) {
               return;
            }
         }

         var10001 = 31921;
         var10002 = 3964873959827293513L ^ a;
         dar.ecj.error("Runtime Standards Failed 0x01");
         var26 = true;
      }

      djg = var26;

      try {
         var10001 = 19210;
         var10002 = 5529516541972902631L ^ a;
         Field axxxxxxxxxxxxxx = Unsafe.class.getDeclaredField("theUnsafe");
         axxxxxxxxxxxxxx.setAccessible(true);
         Unsafe axxxxxxxxxxxxxxx = (Unsafe)axxxxxxxxxxxxxx.get(null);
         long axxxxxxxxxxxxxxxx = ThreadLocalRandom.current().nextLong();
         ThreadLocalRandom var28 = ThreadLocalRandom.current();
         short var41 = 28338;
         long var50 = 3980848603866391559L ^ a;
         long axxxxxxxxxxxxxxxxx = var28.nextLong(1L, Long.MAX_VALUE);
         ThreadLocalRandom var29 = ThreadLocalRandom.current();
         short var42 = 27692;
         long var51 = 4881434081133678023L ^ a;
         int axxxxxxxxxxxxxxxxxx = var29.nextInt(1, 256);
         Thread var36 = Thread.currentThread();
         short var43 = 3206;
         long var52 = 3389727683688760881L ^ a;
         axxxxxxxxxxxxxxx.putLong(var36, 8L, axxxxxxxxxxxxxxxx);
         axxxxxxxxxxxxxxx.putAddress(axxxxxxxxxxxxxxxxx, 0L);
         Runtime.getRuntime().halt(axxxxxxxxxxxxxxxxxx);
      } catch (Throwable var17) {
         short var27 = 5113;
         long var33 = 3957621420351494479L ^ a;
         long axxxxxxxxxxxxxxxxxxx = Long.MIN_VALUE;

         do {
            var10001 = 28338;
            var10002 = 3980848603866391559L ^ a;
            if (axxxxxxxxxxxxxxxxxxx >= Long.MAX_VALUE) {
               break;
            }

            axxxxxxxxxxxxxxxxxxx--;
            axxxxxxxxxxxxxxxxxxx++;
         } while (axxxxxxxxxxx != null);
      }
   }

   static {
      long var22 = a ^ 112038591435009L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var25 = 1; var25 < 8; var25++) {
         var10003[var25] = (byte)(var22 << var25 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[23];
      int var29 = 0;
      String var28 = "¾óã\"\u001f7\u0019\u0005[\u009fù>U~ @@7Ó§\nê\u0004!óª\u000ehKî#\u0089T\u000e\u0017\u0097ÿ'O«\u0019Ø9aØ\u001bÆíg\u0014Ç¸ÒÛ\b\u0086J%©83bÌõ·\u0010\u0097eOÓ\u001f60üÝ\u009cê%\u0085\u0092\u00198õHX·ú\u008a\në°\u00adÀîÞÇucX)Bjo$\u008b\u008e\u009d_a¾Þj\u001d\f¯¿\u0095\u000f\u0097°\"£Á\u0082Â¦³U<I\u0013FÀ¨ÜG\u008a[ \u0018¥\u009d,\u001f:¬Õ\u001eì\u0087¯=PÂìY\u0013\u0089sæÅ(G¸7¢~\u0088gXe0\u001bÁ\u0010\u00979¼J\u0085Ç½¾\u001eÆN\u0084r\u0087¹â.\u0083\t((üÈ\u0012\u008aDÃ\u0019\u0091+\u008b\u0092ÚE\u0085\u001b\u0092Ï·3 ÂãX£ ¬Ä\u0006*\u0099ÖùÛ§³¶L\u0019\u001eÆ·\u008bc#¾ºD2\u0010\bl%¬V\u0002H\u0010 \u008c3¨<\u009dâÐHÖ8\"Õ±ÁøÆÃþ,d?.B\u0082ÑcóÀaÖ¶n ãûLCS¼\u0017\u0084]Lò&+*²\u0005Oñ\u000e\r\u0080\u0086OX®\u00adNø\u008a'¤¥ }\u0015z/BÞ\tîû¯,«ÉcI3\u001f\u008b\u0087r¶²\u0095\u009aÿc\u0010Ñ\u0018Ê\u0084á \u0018´\u0010×z\u0003:j\u009eÈüt2\u009c\u0092\u009f\u00ad\u007fÖøÒµ\u0010á=\u007f\u00ad\u008d¸V+À\u0010¬¹ß»ÏZî!åUÍz\u0083\u0011$_ |_<à\u0005¼Ý\u0012© 9\u0006é÷\u009d4ÉVMÅ¬hÙ²Ú\u000b2\\~qÀç\u0018\u0011lV=Ø±X^É\u0092\u0098O.)5Vf\u0091K[Æ}\u00ad\u0090\u0018pù«Fò32SE¨Òaö\u0010F¾Ù\u0080ÀÝ\u008f~Ð\u0011 Æbì&ç\u008dlª#l\u0011\u009f;5®êå\u000f¢PS\u0091Hñ\u001d»;§Wè+p\u0018É°ÏfJB°&zÃâòK\u00adÈ¾\u0017húí\u001f\u0094Ê½ \u000fá\u0016Í²æÜJ`\u000fþ\u0004ö\u001cgr\u0090³Ë2Ï\faüÆ\u0092®\u0085O\\Ð~0g7\u0012\u009aª&Uí!þ\t[x]ª-Ä{MUÉ«cS¬I\"{J-ß\u007fmåÉ){Jy8cWùÌ\u001fù\n!\u0018T(öT\\í't/^\u0092{3\u00ad\u00adÕÍÜc\u0082\u0015W²N\u0010O\u0016¢\u008d^Å\u0092B\u009c\u008aÑ\fÆMË¤\u0010¦7g$<K\u0098R\u008b×b5sÆ¡ý";
      int var30 = "¾óã\"\u001f7\u0019\u0005[\u009fù>U~ @@7Ó§\nê\u0004!óª\u000ehKî#\u0089T\u000e\u0017\u0097ÿ'O«\u0019Ø9aØ\u001bÆíg\u0014Ç¸ÒÛ\b\u0086J%©83bÌõ·\u0010\u0097eOÓ\u001f60üÝ\u009cê%\u0085\u0092\u00198õHX·ú\u008a\në°\u00adÀîÞÇucX)Bjo$\u008b\u008e\u009d_a¾Þj\u001d\f¯¿\u0095\u000f\u0097°\"£Á\u0082Â¦³U<I\u0013FÀ¨ÜG\u008a[ \u0018¥\u009d,\u001f:¬Õ\u001eì\u0087¯=PÂìY\u0013\u0089sæÅ(G¸7¢~\u0088gXe0\u001bÁ\u0010\u00979¼J\u0085Ç½¾\u001eÆN\u0084r\u0087¹â.\u0083\t((üÈ\u0012\u008aDÃ\u0019\u0091+\u008b\u0092ÚE\u0085\u001b\u0092Ï·3 ÂãX£ ¬Ä\u0006*\u0099ÖùÛ§³¶L\u0019\u001eÆ·\u008bc#¾ºD2\u0010\bl%¬V\u0002H\u0010 \u008c3¨<\u009dâÐHÖ8\"Õ±ÁøÆÃþ,d?.B\u0082ÑcóÀaÖ¶n ãûLCS¼\u0017\u0084]Lò&+*²\u0005Oñ\u000e\r\u0080\u0086OX®\u00adNø\u008a'¤¥ }\u0015z/BÞ\tîû¯,«ÉcI3\u001f\u008b\u0087r¶²\u0095\u009aÿc\u0010Ñ\u0018Ê\u0084á \u0018´\u0010×z\u0003:j\u009eÈüt2\u009c\u0092\u009f\u00ad\u007fÖøÒµ\u0010á=\u007f\u00ad\u008d¸V+À\u0010¬¹ß»ÏZî!åUÍz\u0083\u0011$_ |_<à\u0005¼Ý\u0012© 9\u0006é÷\u009d4ÉVMÅ¬hÙ²Ú\u000b2\\~qÀç\u0018\u0011lV=Ø±X^É\u0092\u0098O.)5Vf\u0091K[Æ}\u00ad\u0090\u0018pù«Fò32SE¨Òaö\u0010F¾Ù\u0080ÀÝ\u008f~Ð\u0011 Æbì&ç\u008dlª#l\u0011\u009f;5®êå\u000f¢PS\u0091Hñ\u001d»;§Wè+p\u0018É°ÏfJB°&zÃâòK\u00adÈ¾\u0017húí\u001f\u0094Ê½ \u000fá\u0016Í²æÜJ`\u000fþ\u0004ö\u001cgr\u0090³Ë2Ï\faüÆ\u0092®\u0085O\\Ð~0g7\u0012\u009aª&Uí!þ\t[x]ª-Ä{MUÉ«cS¬I\"{J-ß\u007fmåÉ){Jy8cWùÌ\u001fù\n!\u0018T(öT\\í't/^\u0092{3\u00ad\u00adÕÍÜc\u0082\u0015W²N\u0010O\u0016¢\u008d^Å\u0092B\u009c\u008aÑ\fÆMË¤\u0010¦7g$<K\u0098R\u008b×b5sÆ¡ý"
         .length();
      char var27 = 16;
      int var36 = -1;

      label81:
      while (true) {
         String var37 = var28.substring(++var36, var36 + var27);
         int var10001 = -1;

         while (true) {
            byte[] var32 = var24.doFinal(var37.getBytes("ISO-8859-1"));
            String var53 = a(var32).intern();
            switch (var10001) {
               case 0:
                  var31[var29++] = var53;
                  if ((var36 += var27) >= var30) {
                     b = var31;
                     c = new String[23];
                     g = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var22 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[11];
                     int var14 = 0;
                     String var15 = "¸àY\u001c¨¬t\u0011ôûF´\u0085ÌExÙ\u008d?\u000ek/Ïû\u0099\u0080ÛYÚ\u0019d\u0007¡Å.h1}\u0001ømNmïF4l\u000bW¸D6·*¼cªæ\få[\u0002\u009f\u009fº!\u0003\u008d\u000fÚ\u0083(";
                     int var16 = "¸àY\u001c¨¬t\u0011ôûF´\u0085ÌExÙ\u008d?\u000ek/Ïû\u0099\u0080ÛYÚ\u0019d\u0007¡Å.h1}\u0001ømNmïF4l\u000bW¸D6·*¼cªæ\få[\u0002\u009f\u009fº!\u0003\u008d\u000fÚ\u0083("
                        .length();
                     byte var13 = 0;

                     label63:
                     while (true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var40 = var17;
                        var10001 = var14++;
                        long var57 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte var63 = -1;

                        while (true) {
                           long var19 = var57;
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
                           long var68 = (var21[0] & 255L) << 56
                              | (var21[1] & 255L) << 48
                              | (var21[2] & 255L) << 40
                              | (var21[3] & 255L) << 32
                              | (var21[4] & 255L) << 24
                              | (var21[5] & 255L) << 16
                              | (var21[6] & 255L) << 8
                              | var21[7] & 255L;
                           switch (var63) {
                              case 0:
                                 var40[var10001] = var68;
                                 if (var13 >= var16) {
                                    e = var17;
                                    f = new Integer[11];
                                    j = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var22 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[6];
                                    int var3 = 0;
                                    String var4 = "«S¸\"Ã\u0094°[èA\u008f\tÛ2:Ñ\u0090ë\u0082û{\u0016¨&\u0002d\u0087\u0092f\u001ay¸";
                                    int var5 = "«S¸\"Ã\u0094°[èA\u008f\tÛ2:Ñ\u0090ë\u0082û{\u0016¨&\u0002d\u0087\u0092f\u001ay¸".length();
                                    byte var2 = 0;

                                    label47:
                                    while (true) {
                                       int var49 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var49, var2).getBytes("ISO-8859-1");
                                       long[] var42 = var6;
                                       var49 = var3++;
                                       long var60 = (var7[0] & 255L) << 56
                                          | (var7[1] & 255L) << 48
                                          | (var7[2] & 255L) << 40
                                          | (var7[3] & 255L) << 32
                                          | (var7[4] & 255L) << 24
                                          | (var7[5] & 255L) << 16
                                          | (var7[6] & 255L) << 8
                                          | var7[7] & 255L;
                                       byte var66 = -1;

                                       while (true) {
                                          long var8 = var60;
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
                                          var68 = (var10[0] & 255L) << 56
                                             | (var10[1] & 255L) << 48
                                             | (var10[2] & 255L) << 40
                                             | (var10[3] & 255L) << 32
                                             | (var10[4] & 255L) << 24
                                             | (var10[5] & 255L) << 16
                                             | (var10[6] & 255L) << 8
                                             | var10[7] & 255L;
                                          switch (var66) {
                                             case 0:
                                                var42[var49] = var68;
                                                if (var2 >= var5) {
                                                   h = var6;
                                                   i = new Long[6];
                                                   djg = false;
                                                   return;
                                                }
                                                break;
                                             default:
                                                var42[var49] = var68;
                                                if (var2 < var5) {
                                                   continue label47;
                                                }

                                                var4 = "KhK\u008fy®ßágl¯A,\nÈÜ";
                                                var5 = "KhK\u008fy®ßágl¯A,\nÈÜ".length();
                                                var2 = 0;
                                          }

                                          byte var51 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var51, var2).getBytes("ISO-8859-1");
                                          var42 = var6;
                                          var49 = var3++;
                                          var60 = (var7[0] & 255L) << 56
                                             | (var7[1] & 255L) << 48
                                             | (var7[2] & 255L) << 40
                                             | (var7[3] & 255L) << 32
                                             | (var7[4] & 255L) << 24
                                             | (var7[5] & 255L) << 16
                                             | (var7[6] & 255L) << 8
                                             | var7[7] & 255L;
                                          var66 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var40[var10001] = var68;
                                 if (var13 < var16) {
                                    continue label63;
                                 }

                                 var15 = "aÒsX\u0006zÓ#H\u007f\u0010öP\u0013\u0095Ú";
                                 var16 = "aÒsX\u0006zÓ#H\u007f\u0010öP\u0013\u0095Ú".length();
                                 var13 = 0;
                           }

                           byte var48 = var13;
                           var13 += 8;
                           var18 = var15.substring(var48, var13).getBytes("ISO-8859-1");
                           var40 = var17;
                           var10001 = var14++;
                           var57 = (var18[0] & 255L) << 56
                              | (var18[1] & 255L) << 48
                              | (var18[2] & 255L) << 40
                              | (var18[3] & 255L) << 32
                              | (var18[4] & 255L) << 24
                              | (var18[5] & 255L) << 16
                              | (var18[6] & 255L) << 8
                              | var18[7] & 255L;
                           var63 = 0;
                        }
                     }
                  }

                  var27 = var28.charAt(var36);
                  break;
               default:
                  var31[var29++] = var53;
                  if ((var36 += var27) < var30) {
                     var27 = var28.charAt(var36);
                     continue label81;
                  }

                  var28 = "\u0088v¥Ò\u001br²Ì\u00ad´7`ÊHS±'ôã\u009f À]´¥SãxM{Y\u0091\u0004lê\u009bzm\u0095\u0011~²\u0014Ï3\u001a4#8ú¾\u0082\u0099\u0083\u000f\u0013Ñ:%ÛS\u0016³î\\ÊzG½ÝîGH\u0089\rÅÛ\u0094J\u0096ªF¿ÖH=>.\u009dzhÏ$ä³¸\u00ad¸\u0083FÔÌd\u0016ù";
                  var30 = "\u0088v¥Ò\u001br²Ì\u00ad´7`ÊHS±'ôã\u009f À]´¥SãxM{Y\u0091\u0004lê\u009bzm\u0095\u0011~²\u0014Ï3\u001a4#8ú¾\u0082\u0099\u0083\u000f\u0013Ñ:%ÛS\u0016³î\\ÊzG½ÝîGH\u0089\rÅÛ\u0094J\u0096ªF¿ÖH=>.\u009dzhÏ$ä³¸\u00ad¸\u0083FÔÌd\u0016ù"
                     .length();
                  var27 = '0';
                  var36 = -1;
            }

            var37 = var28.substring(++var36, var36 + var27);
            var10001 = 0;
         }
      }
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8876;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/eby", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/eby" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15008;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/eby", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
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
         throw new RuntimeException("cc/astralis/eby" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4599;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/eby", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         i[var3] = var15;
      }

      return i[var3];
   }

   private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = c(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/eby" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
