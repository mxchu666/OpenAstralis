package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import sun.misc.Unsafe;

public class gep {
   private static final long a = 62379534996954L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;
   private static final long[] f;
   private static final Long[] g;
   private static final Map h;

   public static String bhj() {
      long a = gep.a ^ 93751257391714L;
      int[] ax = dar.abu();

      try {
         short var19 = 6914;
         long var39 = 4622642370934311110L ^ a;
         MessageDigest axx = MessageDigest.getInstance("SHA-256");
         StringBuilder axxx = new StringBuilder();
         StringBuilder var20 = axxx.append(bam.asl()).append(bam.aeb()).append(bam.gzo()).append(bam.bma());
         short var40 = 1450;
         long var58 = 4027299078974707311L ^ a;
         StringBuilder var21 = var20.append(bam.hfo("PROCESSOR_IDENTIFIER"));
         short var41 = 6182;
         var58 = 8903045945372052449L ^ a;
         StringBuilder var22 = var21.append(bam.hfo("PROCESSOR_ARCHITECTURE"));
         short var42 = 31395;
         var58 = 4987618747556653417L ^ a;
         StringBuilder var23 = var22.append(bam.hfo("PROCESSOR_ARCHITEW6432"));
         short var43 = 25331;
         var58 = 3106619738763096379L ^ a;
         StringBuilder var24 = var23.append(bam.hfo("NUMBER_OF_PROCESSORS"));
         short var44 = 11207;
         var58 = 2876805417095411713L ^ a;
         StringBuilder var25 = var24.append(bam.hfo("COMPUTERNAME"));
         short var45 = 12764;
         var58 = 4331853231241601543L ^ a;
         StringBuilder var26 = var25.append(bam.hfo("os")).append(bam.dvt());
         short var46 = 21690;
         var58 = 1601768537876842338L ^ a;
         StringBuilder var27 = var26.append(bam.hfo("SystemRoot"));
         short var47 = 2613;
         var58 = 155027588673378807L ^ a;
         StringBuilder var28 = var27.append(bam.hfo("HOMEDRIVE"));
         short var48 = 8335;
         var58 = 6153522554150466389L ^ a;
         StringBuilder var29 = var28.append(bam.hfo("PROCESSOR_LEVEL"));
         short var49 = 32689;
         var58 = 6318122735339007090L ^ a;
         StringBuilder var30 = var29.append(bam.hfo("PROCESSOR_REVISION"));
         short var50 = 20374;
         var58 = 4533400614384688223L ^ a;
         StringBuilder var31 = var30.append(bam.hfo("HOME"));
         short var51 = 21168;
         var58 = 1080895188899873150L ^ a;
         StringBuilder var32 = var31.append(bam.hfo("HOSTNAME"));
         short var52 = 30515;
         var58 = 1087478262774654194L ^ a;
         StringBuilder var33 = var32.append(bam.hfo("SHELL"));
         short var53 = 11597;
         var58 = 1879833260643466893L ^ a;
         StringBuilder var34 = var33.append(bam.hfo("LOGNAME"));
         short var54 = 1266;
         var58 = 7926293841842640701L ^ a;
         var34.append(bam.hfo("USERNAME"));
         byte[] axxxx = axx.digest(axxx.toString().getBytes(StandardCharsets.UTF_8));
         return bct(axxxx);
      } catch (NoSuchAlgorithmException var12) {
         try {
            short var36 = 17085;
            long var55 = 8145602075450888561L ^ a;
            Field axxxxx = Unsafe.class.getDeclaredField("theUnsafe");
            axxxxx.setAccessible(true);
            Unsafe axxxxxx = (Unsafe)axxxxx.get(null);
            long axxxxxxx = ThreadLocalRandom.current().nextLong();
            ThreadLocalRandom var17 = ThreadLocalRandom.current();
            short var56 = 17757;
            long var10003 = 3848663514736779883L ^ a;
            long axxxxxxxx = var17.nextLong(1L, Long.MAX_VALUE);
            int axxxxxxxxx = ThreadLocalRandom.current().nextInt(1, (int)e);
            Thread var37 = Thread.currentThread();
            short var57 = 3082;
            var10003 = 6352892608986884925L ^ a;
            axxxxxx.putLong(var37, 8L, axxxxxxx);
            axxxxxx.putAddress(axxxxxxxx, 0L);
            Runtime.getRuntime().halt(axxxxxxxxx);
         } catch (Throwable var11) {
            short var10000 = 30505;
            long var10001 = 8047459072964644893L ^ a;
            long axxxxxxxxxx = Long.MIN_VALUE;

            do {
               short var35 = 29030;
               long var10002 = 1078695867445433939L ^ a;
               if (axxxxxxxxxx >= Long.MAX_VALUE) {
                  break;
               }

               axxxxxxxxxx--;
               axxxxxxxxxx++;
            } while (ax != null);
         }

         short var18 = 24368;
         long var38 = 4775531654806523133L ^ a;
         return "################";
      }
   }

   private static String bct(byte[] a) {
      long ax = gep.a ^ 75524241264489L;
      StringBuilder axx = new StringBuilder();
      int[] var10000 = dar.abu();
      byte[] var5 = a;
      int var6 = a.length;
      int[] axxx = var10000;
      int var7 = 0;

      while (true) {
         if (var7 < var6) {
            byte axxxx = var5[var7];
            short var10001 = 24478;
            long var10002 = 6187883602550137182L ^ ax;
            var9 = axx.append(String.format("%02x", axxxx));
            if (axxx == null) {
               break;
            }

            var7++;
            if (axxx != null) {
               continue;
            }
         }

         var9 = axx;
         break;
      }

      return var9.toString();
   }

   static {
      long var16 = a ^ 127617859506406L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var19 = 1; var19 < 8; var19++) {
         var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[19];
      int var23 = 0;
      String var22 = "û\u008cjj\u0017\u0018\bß^:w\u0094w\u0081\u0098C©¦û@\u0000êÌ¸d\u0092MD¯Îþ\u009d±D\u0081\r(\u0086\ta\u0010\u0087ôºÔj\u009eQ\u0097\n÷¾¢²\u0094Ec(1 ÞY\u009c7°R\u0007Âê/À¶g®®\u0087JÙ\u001eÑÝ\u001fH\u008f\u0092)³\u0013à¢ö\u0084·¿È\u00197'\u0010.a\u0005P8*¢8\u0091\u009b=ö\u009dpñä 3\u0081\u008e Ôe¬*\u0089{¦ÁRÅ\u00940\"\u009eÜp2\u0083\u0099Ô¯óq~ÉìôO \u0012¹\u009ddÈw>p\u009cO|Q\u009aÕ¡\u0088=K\u0085/\u008cH-Lû!½XÇ[¤H\u0018\u0081u6×\u009c\u0010L\u009b\u0094\u001c·È\u0092¶e.è\u0082¨+Á\u0002»?(\u00adûª.'\"\u008e-Þ*×\u000fsÝiðÞú\u000bÓç{T\u0003kÀ¼Ý\u0018\u0095Í\u008f\u009a<\u0017í\u0011\u000eÕ\u0007 \u009f^Ïå\u0010Æ¡9Ò\u0091\u0088V:è\u009f\u008b_jðqÅþ¤W9od{´i\u001eú([[«kµÞê³»ß¢D0=\u00109\u008boÖ>ÂG#¡+¼Ã\u009dÍf`w\u000f\u0083n7õBR«\u0010Úe2¥\u001fyÛ®àP\u00ad\u0091\u0099B\u0015m\u0010Mä\u0082.\u0099]í¦bFfõßÄ\u001cM ,Ñ'¶\u0011\u000fw#¤'Ð\u007f\u000f7N{ö´\u000ffdY&\u0015ë\u0000\u0096ôòa\u009a| \u001aAÓ\u001fßkjÔÃÀùR¥Z2ÛÈ³ß¦ÌôeUy¿RH~ý;Y\u0010:µÓâóÃFòæ\u0095X\u008fy²`\u0097(T\u0096Ð¶îóR\u0014|\u008aW~ì©ªø A(ÍE·þ[£¡\u00853ñü< \u0017fÝ´H\u0083÷° µÜ,î<ç?ðqßðPg\u001d]Kº\bÔû\u0005¼V\u008b9«êl\u009fÑ,ø";
      int var24 = "û\u008cjj\u0017\u0018\bß^:w\u0094w\u0081\u0098C©¦û@\u0000êÌ¸d\u0092MD¯Îþ\u009d±D\u0081\r(\u0086\ta\u0010\u0087ôºÔj\u009eQ\u0097\n÷¾¢²\u0094Ec(1 ÞY\u009c7°R\u0007Âê/À¶g®®\u0087JÙ\u001eÑÝ\u001fH\u008f\u0092)³\u0013à¢ö\u0084·¿È\u00197'\u0010.a\u0005P8*¢8\u0091\u009b=ö\u009dpñä 3\u0081\u008e Ôe¬*\u0089{¦ÁRÅ\u00940\"\u009eÜp2\u0083\u0099Ô¯óq~ÉìôO \u0012¹\u009ddÈw>p\u009cO|Q\u009aÕ¡\u0088=K\u0085/\u008cH-Lû!½XÇ[¤H\u0018\u0081u6×\u009c\u0010L\u009b\u0094\u001c·È\u0092¶e.è\u0082¨+Á\u0002»?(\u00adûª.'\"\u008e-Þ*×\u000fsÝiðÞú\u000bÓç{T\u0003kÀ¼Ý\u0018\u0095Í\u008f\u009a<\u0017í\u0011\u000eÕ\u0007 \u009f^Ïå\u0010Æ¡9Ò\u0091\u0088V:è\u009f\u008b_jðqÅþ¤W9od{´i\u001eú([[«kµÞê³»ß¢D0=\u00109\u008boÖ>ÂG#¡+¼Ã\u009dÍf`w\u000f\u0083n7õBR«\u0010Úe2¥\u001fyÛ®àP\u00ad\u0091\u0099B\u0015m\u0010Mä\u0082.\u0099]í¦bFfõßÄ\u001cM ,Ñ'¶\u0011\u000fw#¤'Ð\u007f\u000f7N{ö´\u000ffdY&\u0015ë\u0000\u0096ôòa\u009a| \u001aAÓ\u001fßkjÔÃÀùR¥Z2ÛÈ³ß¦ÌôeUy¿RH~ý;Y\u0010:µÓâóÃFòæ\u0095X\u008fy²`\u0097(T\u0096Ð¶îóR\u0014|\u008aW~ì©ªø A(ÍE·þ[£¡\u00853ñü< \u0017fÝ´H\u0083÷° µÜ,î<ç?ðqßðPg\u001d]Kº\bÔû\u0005¼V\u008b9«êl\u009fÑ,ø"
         .length();
      char var21 = '(';
      int var29 = -1;

      label66:
      while (true) {
         String var30 = var22.substring(++var29, var29 + var21);
         int var10001 = -1;

         while (true) {
            byte[] var26 = var18.doFinal(var30.getBytes("ISO-8859-1"));
            String var43 = a(var26).intern();
            switch (var10001) {
               case 0:
                  var25[var23++] = var43;
                  if ((var29 += var21) >= var24) {
                     b = var25;
                     c = new String[19];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var16 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = 4487644726208405917L;
                     byte[] var15 = var11.doFinal(
                        new byte[]{
                           (byte)(var13 >>> 56),
                           (byte)(var13 >>> 48),
                           (byte)(var13 >>> 40),
                           (byte)(var13 >>> 32),
                           (byte)(var13 >>> 24),
                           (byte)(var13 >>> 16),
                           (byte)(var13 >>> 8),
                           (byte)var13
                        }
                     );
                     long var47 = (var15[0] & 255L) << 56
                        | (var15[1] & 255L) << 48
                        | (var15[2] & 255L) << 40
                        | (var15[3] & 255L) << 32
                        | (var15[4] & 255L) << 24
                        | (var15[5] & 255L) << 16
                        | (var15[6] & 255L) << 8
                        | var15[7] & 255L;
                     var10001 = (byte)-1;
                     e = var47;
                     h = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "\u0085\u0086÷\u0015X\u0088ï.É\u001cYù\u008að\u0097C";
                     int var5 = "\u0085\u0086÷\u0015X\u0088ï.É\u001cYù\u008að\u0097C".length();
                     byte var2 = 0;

                     label42:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var34 = var6;
                        var10001 = var3++;
                        long var49 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte var53 = -1;

                        while (true) {
                           long var8 = var49;
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
                           long var55 = (var10[0] & 255L) << 56
                              | (var10[1] & 255L) << 48
                              | (var10[2] & 255L) << 40
                              | (var10[3] & 255L) << 32
                              | (var10[4] & 255L) << 24
                              | (var10[5] & 255L) << 16
                              | (var10[6] & 255L) << 8
                              | var10[7] & 255L;
                           switch (var53) {
                              case 0:
                                 var34[var10001] = var55;
                                 if (var2 >= var5) {
                                    f = var6;
                                    g = new Long[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var34[var10001] = var55;
                                 if (var2 < var5) {
                                    continue label42;
                                 }

                                 var4 = "ïkoóö%:6êÐ¦\u0087¯¬é\u0092";
                                 var5 = "ïkoóö%:6êÐ¦\u0087¯¬é\u0092".length();
                                 var2 = 0;
                           }

                           byte var41 = var2;
                           var2 += 8;
                           var7 = var4.substring(var41, var2).getBytes("ISO-8859-1");
                           var34 = var6;
                           var10001 = var3++;
                           var49 = (var7[0] & 255L) << 56
                              | (var7[1] & 255L) << 48
                              | (var7[2] & 255L) << 40
                              | (var7[3] & 255L) << 32
                              | (var7[4] & 255L) << 24
                              | (var7[5] & 255L) << 16
                              | (var7[6] & 255L) << 8
                              | var7[7] & 255L;
                           var53 = 0;
                        }
                     }
                  }

                  var21 = var22.charAt(var29);
                  break;
               default:
                  var25[var23++] = var43;
                  if ((var29 += var21) < var24) {
                     var21 = var22.charAt(var29);
                     continue label66;
                  }

                  var22 = "^>úCd%Fóð\u0013=\u009d}¥\u009c\u0005 ¯±{ò\u0011¯©Ç\u0094¢x\u0081¶úò\u001a\u0096\u008bi\u0085B)\u0097~²,'ÙA®^½";
                  var24 = "^>úCd%Fóð\u0013=\u009d}¥\u009c\u0005 ¯±{ò\u0011¯©Ç\u0094¢x\u0081¶úò\u001a\u0096\u008bi\u0085B)\u0097~²,'ÙA®^½".length();
                  var21 = 16;
                  var29 = -1;
            }

            var30 = var22.substring(++var29, var29 + var21);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9330;
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
            throw new RuntimeException("cc/astralis/gep", var10);
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
         throw new RuntimeException("cc/astralis/gep" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4237;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/gep", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         g[var3] = var15;
      }

      return g[var3];
   }

   private static long b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = b(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
         throw new RuntimeException("cc/astralis/gep" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
