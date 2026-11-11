package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class bxc {
   public static boolean bcf;
   private static final Map<String, fll> cmr;
   private static final Map<String, bad> gfp;
   private static final long a = 50376844898819L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public static fll emc(String name, int size) {
      long ax = bxc.a ^ 21202584827061L;
      if (a != null && !a.isEmpty() && a > 0) {
         String axx = a + "-" + a;
         return cmr.computeIfAbsent(axx, axxx -> fis(a, a));
      } else {
         return null;
      }
   }

   private static fll fis(String a, int a) {
      String ax = a + "-" + a;
      bad axx = gfp.computeIfAbsent(ax, axxx -> new bad(a, a));
      return new fll(axx, a);
   }

   public static synchronized void ctl() {
      long a = bxc.a ^ 9061006786480L;
      int[] var10000 = dar.abu();
      int var10001 = 4613;
      long var10002 = 1226208110189948350L ^ a;
      dip("Reinitializing all fonts...");
      int[] ax = var10000;
      Set<String> axx = new HashSet<>();
      axx.addAll(gfp.keySet());
      axx.addAll(cmr.keySet());
      Iterator var4 = axx.iterator();

      while (true) {
         if (var4.hasNext()) {
            String axxx = (String)var4.next();
            fry axxxx = cjn(axxx);
            if (ax == null) {
               break;
            }

            var10000 = (int[])axxxx;
            if (ax != null) {
               if (axxxx == null) {
                  var10001 = (short)8376;
                  var10002 = 3110254344651841281L ^ a;
                  byp("Invalid key: " + axxx);
                  continue;
               }

               var10000 = (int[])gfp.remove(axxx);
            }

            bad axxxxx = (bad)var10000;
            fqm(axxxxx);

            try {
               bad axxxxxx = new bad(axxxx.adw, axxxx.ary);
               gfp.put(axxx, axxxxxx);
               cmr.put(axxx, new fll(axxxxxx, axxxx.ary));
               var10001 = (short)12646;
               var10002 = 4937674200554409688L ^ a;
               dip("Reinitialized: " + axxx);
            } catch (Exception var9) {
               String var12 = String.valueOf(var9);
               short var16 = 28623;
               long var10003 = 8790463493984964706L ^ a;
               short var20 = 23263;
               long var10004 = 5541692871221962089L ^ a;
               byp("Failed to reinit " + axxx + ": " + var12);
            }

            if (ax != null) {
               continue;
            }
         }

         int var11 = gfp.size();
         var10001 = cmr.size();
         short var18 = 25891;
         long var21 = 6487926244524219020L ^ a;
         short var22 = 6931;
         long var23 = 5238912875477378222L ^ a;
         dip("Reinit complete. NVG=" + var11 + " UI=" + var10001);
         break;
      }
   }

   public static synchronized void ehl() {
      long a = bxc.a ^ 60812971733567L;
      int[] var10000 = dar.abu();
      short var10001 = 5221;
      long var10002 = 2573699309412181593L ^ a;
      dip("Disposing all fonts...");
      Iterator var3 = gfp.values().iterator();
      int[] ax = var10000;

      while (true) {
         if (var3.hasNext()) {
            bad axx = (bad)var3.next();
            fqm(axx);
            if (ax == null) {
               break;
            }

            if (ax != null) {
               continue;
            }
         }

         gfp.clear();
         short var5 = 11970;
         cmr.clear();
         long var6 = 3358684157863386367L ^ a;
         dip("Disposed.");
         break;
      }
   }

   public static synchronized void fnk(String name, int size) {
      long ax;
      String axx;
      label22: {
         ax = bxc.a ^ 67748002861920L;
         int[] var10000 = dar.abu();
         axx = a + "-" + a;
         int[] axxx = var10000;
         fll axxxx = cmr.remove(axx);
         bad axxxxx = gfp.remove(axx);
         bad var8 = axxxxx;
         if (axxx != null) {
            fqm(axxxxx);
            if (axxxx != null) {
               break label22;
            }

            var8 = axxxxx;
         }

         if (var8 == null) {
            short var10001 = 29629;
            long var10002 = 1414035288290287809L ^ ax;
            dip("disposeFont: nothing to dispose for " + axx);
            return;
         }
      }

      short var9 = 20367;
      long var10 = 6896504505925426411L ^ ax;
      dip("Disposed font: " + axx);
   }

   private static fry cjn(String a) {
      long ax = bxc.a ^ 118854347999125L;
      int[] var10000 = dar.abu();
      int axx = a.lastIndexOf((int)e);
      int[] axxx = var10000;
      int var8 = axx;
      if (axxx != null) {
         if (axx <= 0) {
            return null;
         }

         var8 = axx;
      }

      if (var8 < a.length() - 1) {
         String axxxx = a.substring(0, axx);

         try {
            int axxxxx = Integer.parseInt(a.substring(axx + 1));
            return new fry(axxxx, axxxxx);
         } catch (NumberFormatException var7) {
            return null;
         }
      } else {
         return null;
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static void fqm(bad a) {
      long ax = bxc.a ^ 48692170182111L;
      int[] axx = dar.abu();
      bad var10000 = a;
      if (axx == null) {
         try {
            var10000.bq();
         } catch (Throwable var5) {
            String var8 = String.valueOf(var5);
            short var9 = 247;
            long var10 = 771814955165732141L ^ ax;
            byp("Dispose error: " + var8);
         }
      } else if (a != null) {
         label22:
         try {
            var10000 = a;
            break label22;
         } catch (Throwable var6) {
            String var7 = String.valueOf(var6);
            short var10001 = 247;
            long var10002 = 771814955165732141L ^ ax;
            byp("Dispose error: " + var7);
         }
      }
   }

   private static void dip(String a) {
      long ax = bxc.a ^ 18501531606771L;
      int[] var3 = dar.abu();
      if (var3 != null && bcf) {
         short var10002 = 14195;
         long var10003 = 5227946699453835655L ^ ax;
         dar.ecj.info("[FontManager] " + a);
      }
   }

   private static void byp(String a) {
      long ax = bxc.a ^ 11836207459434L;
      short var10002 = 23746;
      long var10003 = 3250691014119010472L ^ ax;
      System.err.println("[FontManager ERROR] " + a);
   }

   public static void cxt() {
      gfp.keySet().forEach(a -> {
         long ax = bxc.a ^ 91816338877926L;
         short var10002 = 20441;
         long var10003 = 7848172661469618739L ^ ax;
         dar.ecj.error(" - " + a);
      });
      cmr.keySet().forEach(a -> {
         long ax = bxc.a ^ 77861493046570L;
         short var10002 = 6206;
         long var10003 = 6236447266652349723L ^ ax;
         dar.ecj.error(" - " + a);
      });
   }

   public static void fzb() {
      long var0 = a ^ 10327423354306L;
      int var10000 = cmr.size();
      int var10001 = gfp.size();
      short var10002 = 21333;
      long var10003 = 1145773908675745437L ^ var0;
      short var2 = 6407;
      long var10004 = 5680702914273025229L ^ var0;
      short var3 = 4259;
      long var10005 = 2249626759069439328L ^ var0;
      dip("Clearing font cache (" + var10000 + " fonts, " + var10001 + " NVG fonts)");
      cmr.clear();
      gfp.clear();
   }

   static {
      long var5 = a ^ 6725535459204L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[19];
      int var12 = 0;
      String var11 = "&\u008a\u0081\u0098p\u0018ïÿ\u009aÈ\u0018\u0096éèçh\u0010Þ&²»\u0012\u001f³\u0014fÿz\u0082nôJÃ\u0010ñ'¸ÀÚ=¸Va\u0091ÈG\\nEI\u0018\u008eJãMá\u0013sò\u008bõÏ\u0001«¯Ns\u0090?[vN\u0090\u0011ç «n±o:«.Rõëg©\u0015SQë\u0096å&)V-¹\u000f\u001b\u009cFÜ¶ìI²\u0018ïÌ\u007fÔ)DÎ\u001c,\u0090\u0085é£Çà_\u001d\u0001ºDù^\u0083\u00168Wª\u009e¨\u0013²wEg#\u008bNÔ\u0097\u008b\u008aë \u0081Q#f4Õ\u0082\\wÕ\u000e\u008eNÖ\u008d\u0018=y\u009b¬Ì¡\u0092'\u0013QÏ>\u0005,0\u007fð?k>\u0094}(\u0000%\u0091)0ÅÊS\u0096\u008dÌ0ý\u0002\u009fO\u000b§C\u008b\u000e\u000bè\u0085KQ_Ð:3¶Ò£D\u0097\u0006ã+ót\u0018\u009bjl«ù\b;dÓbµÕ\u0086,%Å\u0018\u0083c?\u0003µJÉ ÝàA !ô=\u0092Óä®sÜ9_¦\u0003\u0011i@\u0006è\u0007¹'=ù/'WsI \u0016ÖÕèÙÆ\fîÕ¥Kº)\u0080k\u0090\u0093¶\u0090J½sÝ\u0099euÄðEæ®\u0085\u0010BãÐ\u0085ªS\u0007s'\u0099\fôÏ×]Ø\u0018\u009e³¤t'n[\u000eü#ÿIìE/\u0084\u007f_>\u0082Q»\u001e?(ÿEäG\u0089Ïïª\u0003µf^\u0004\u0017\u0085\u0004`S\u009eTÀ\u0011\u0017$ï\u0016¬øï\u0090Æ¿xc\u0094ò\u0015¸i\"(zÇ9\u009a\u000e\u0016XÑ8WdVgàÞù\u009e#M=\u0012\u009f$ÇC)ÂæE²¡Ø\u009d\u0081U \u0098\fºs\u0018\u008bý\u009c\u001a\u007f%rA|øc\n\u007f6MÑ®\u0096\u009aj$Ïs_0(;Âå¦$¬@zdÓJ\u0094áHtü4#Ý°µ¤]\u00ad\\Ã\u009f\tD~7XÂk\u0019ì\u00ad\u009c\u0089\u0090xýÔ\u001fÏ<õ";
      int var13 = "&\u008a\u0081\u0098p\u0018ïÿ\u009aÈ\u0018\u0096éèçh\u0010Þ&²»\u0012\u001f³\u0014fÿz\u0082nôJÃ\u0010ñ'¸ÀÚ=¸Va\u0091ÈG\\nEI\u0018\u008eJãMá\u0013sò\u008bõÏ\u0001«¯Ns\u0090?[vN\u0090\u0011ç «n±o:«.Rõëg©\u0015SQë\u0096å&)V-¹\u000f\u001b\u009cFÜ¶ìI²\u0018ïÌ\u007fÔ)DÎ\u001c,\u0090\u0085é£Çà_\u001d\u0001ºDù^\u0083\u00168Wª\u009e¨\u0013²wEg#\u008bNÔ\u0097\u008b\u008aë \u0081Q#f4Õ\u0082\\wÕ\u000e\u008eNÖ\u008d\u0018=y\u009b¬Ì¡\u0092'\u0013QÏ>\u0005,0\u007fð?k>\u0094}(\u0000%\u0091)0ÅÊS\u0096\u008dÌ0ý\u0002\u009fO\u000b§C\u008b\u000e\u000bè\u0085KQ_Ð:3¶Ò£D\u0097\u0006ã+ót\u0018\u009bjl«ù\b;dÓbµÕ\u0086,%Å\u0018\u0083c?\u0003µJÉ ÝàA !ô=\u0092Óä®sÜ9_¦\u0003\u0011i@\u0006è\u0007¹'=ù/'WsI \u0016ÖÕèÙÆ\fîÕ¥Kº)\u0080k\u0090\u0093¶\u0090J½sÝ\u0099euÄðEæ®\u0085\u0010BãÐ\u0085ªS\u0007s'\u0099\fôÏ×]Ø\u0018\u009e³¤t'n[\u000eü#ÿIìE/\u0084\u007f_>\u0082Q»\u001e?(ÿEäG\u0089Ïïª\u0003µf^\u0004\u0017\u0085\u0004`S\u009eTÀ\u0011\u0017$ï\u0016¬øï\u0090Æ¿xc\u0094ò\u0015¸i\"(zÇ9\u009a\u000e\u0016XÑ8WdVgàÞù\u009e#M=\u0012\u009f$ÇC)ÂæE²¡Ø\u009d\u0081U \u0098\fºs\u0018\u008bý\u009c\u001a\u007f%rA|øc\n\u007f6MÑ®\u0096\u009aj$Ïs_0(;Âå¦$¬@zdÓJ\u0094áHtü4#Ý°µ¤]\u00ad\\Ã\u009f\tD~7XÂk\u0019ì\u00ad\u009c\u0089\u0090xýÔ\u001fÏ<õ"
         .length();
      char var10 = 16;
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = a(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     b = var14;
                     c = new String[19];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -8686402230083726124L;
                     byte[] var4 = var0.doFinal(
                        new byte[]{
                           (byte)(var2 >>> 56),
                           (byte)(var2 >>> 48),
                           (byte)(var2 >>> 40),
                           (byte)(var2 >>> 32),
                           (byte)(var2 >>> 24),
                           (byte)(var2 >>> 16),
                           (byte)(var2 >>> 8),
                           (byte)var2
                        }
                     );
                     long var30 = (var4[0] & 255L) << 56
                        | (var4[1] & 255L) << 48
                        | (var4[2] & 255L) << 40
                        | (var4[3] & 255L) << 32
                        | (var4[4] & 255L) << 24
                        | (var4[5] & 255L) << 16
                        | (var4[6] & 255L) << 8
                        | var4[7] & 255L;
                     var10001 = -1;
                     e = var30;
                     bcf = true;
                     cmr = new ConcurrentHashMap<>();
                     gfp = new ConcurrentHashMap<>();
                     return;
                  }

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var14[var12++] = var26;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label37;
                  }

                  var11 = "\bÒü\u0089¿]$\u0016!ó\u0015\u0014W\u00004¶8Áo¯\u00885>wdá\u008e7ò¡Å%\u0019\u0089\u0097\u0017\u0015«Û/§\u0090ã¶¯\nB*Ô\u0006AD\u0085»Ñ\r(ÛÞD¬êî0\\¿\u0092°ùÃ\u0082ä²Õ3}ð\u0001\u00ad\u008bm\u0016\u009aL\u009fa\u001bDòñ\u0004»³Üå`*";
                  var13 = "\bÒü\u0089¿]$\u0016!ó\u0015\u0014W\u00004¶8Áo¯\u00885>wdá\u008e7ò¡Å%\u0019\u0089\u0097\u0017\u0015«Û/§\u0090ã¶¯\nB*Ô\u0006AD\u0085»Ñ\r(ÛÞD¬êî0\\¿\u0092°ùÃ\u0082ä²Õ3}ð\u0001\u00ad\u008bm\u0016\u009aL\u009fa\u001bDòñ\u0004»³Üå`*"
                     .length();
                  var10 = '8';
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29198;
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
            throw new RuntimeException("cc/astralis/bxc", var10);
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
         throw new RuntimeException("cc/astralis/bxc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
