package cc.astralis;

import java.awt.Color;
import java.io.File;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.Unsafe;

public class dar implements dlc {
   private static final dar dtw;
   public static final Logger ecj;
   public static final String asu;
   public static final String dpr;
   public static final double gjn = 1.15;
   private final fgh hcu = new elw(cfg.ASTRALIS, 1.15);
   public static String enk;
   public static String dul;
   private dfw cvq;
   private fbr buf;
   private gzz ani;
   private enn cai;
   private drd cfe;
   private dc cge;
   private avo gfe;
   private cwr dgx;
   private gqs ccy;
   private ag dam;
   private ckb btx;
   private cvn amb;
   private hdl ame;
   private goy gou;
   private static int[] bko;
   private static final long a = 11119225109967L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;
   private static final long[] f;
   private static final Long[] g;
   private static final Map h;

   public void er() {
      long a = dar.a ^ 59900628261579L;
      int[] var10000 = abu();
      short var10004 = 22884;
      long var10005 = 8091470373201894480L ^ a;
      File ax = new File(chi.field_1697, "/" + "Astralis".toLowerCase());
      int[] axx = var10000;
      if (axx != null) {
         if (!ax.exists()) {
            if (ax.mkdirs()) {
               short var10001 = 8973;
               long var10002 = 1026009889750492731L ^ a;
               ecj.info("/astralis directory created successfully.");
            } else {
               short var18 = 13550;
               long var20 = 3792226424265552345L ^ a;
               ecj.error("Failed to create /astralis directory.");
            }
         }

         a.buf = new fbr();
         a.cai = new enn();
         a.cvq = new dfw();
         a.ani = new gzz();
         a.cfe = new drd();
         a.cge = new dc();
         a.gfe = new avo();
         a.dam = new ag();
         a.amb = new cvn();
         a.gou = new goy();
         a.dgx = new cwr(false);
         a.ccy = new gqs();
         fow.fjs();
         Runtime var17 = Runtime.getRuntime();
         Runnable var10003 = a::dgy;
         var10004 = 12224;
         var10005 = 259031690561563379L ^ a;
         var17.addShutdownHook(new Thread(var10003, "Shutdown Thread"));

         try {
            short var22 = 14497;
            long var24 = 329264732432121232L ^ a;
            a.ame = new hdl("wss://ws.serenityutils.club");
            eby.fqb();
         } catch (Throwable var14) {
            try {
               short var19 = 18645;
               long var21 = 4097609733494033888L ^ a;
               Field axxx = Unsafe.class.getDeclaredField("theUnsafe");
               axxx.setAccessible(true);
               Unsafe axxxx = (Unsafe)axxx.get(null);
               long axxxxx = ThreadLocalRandom.current().nextLong();
               long axxxxxx = ThreadLocalRandom.current().nextLong(1L, b<"o">(7268, 8857430770621373232L ^ a));
               int axxxxxxx = ThreadLocalRandom.current().nextInt(1, (int)e);
               axxxx.putLong(Thread.currentThread(), b<"o">(7005, 5818979008806673419L ^ a), axxxxx);
               axxxx.putAddress(axxxxxx, 0L);
               Runtime.getRuntime().halt(axxxxxxx);
            } catch (Throwable var13) {
               long axxxxxxxx = b<"o">(25741, 5000024223444706266L ^ a);

               while (axxxxxxxx < b<"o">(16665, 2395108985833129548L ^ a)) {
                  axxxxxxxx--;
                  axxxxxxxx++;
                  if (axx == null) {
                     break;
                  }
               }
            }
         }
      }
   }

   public void dgy() {
      a.dgx.apo();
      a.cfe.faw();
      a.ccy.apo();
   }

   public Color deo() {
      return a.aws().diy(ezv.class).ehf.dnp();
   }

   public Color cxj() {
      return a.aws().diy(ezv.class).aoz.dnp();
   }

   public fgh ado() {
      return a.hcu;
   }

   public dfw aws() {
      return a.cvq;
   }

   public fbr fyf() {
      return a.buf;
   }

   public gzz ccv() {
      return a.ani;
   }

   public enn ftn() {
      return a.cai;
   }

   public drd dy() {
      return a.cfe;
   }

   public dc bzq() {
      return a.cge;
   }

   public avo cgu() {
      return a.gfe;
   }

   public cwr aad() {
      return a.dgx;
   }

   public gqs aqn() {
      return a.ccy;
   }

   public ag bav() {
      return a.dam;
   }

   public ckb aom() {
      return a.btx;
   }

   public cvn gxs() {
      return a.amb;
   }

   public hdl gp() {
      return a.ame;
   }

   public goy azc() {
      return a.gou;
   }

   public static dar gqy() {
      return dtw;
   }

   public void amb(ckb configUIImGui) {
      a.btx = a;
   }

   static {
      long var25 = a ^ 54811591240671L;
      int[] var10000 = new int[5];
      aow(var10000);
      Cipher var16;
      Cipher var30 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var17 = 1; var17 < 8; var17++) {
         var10003[var17] = (byte)(var25 << var17 * 8 >>> 56);
      }

      var30.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var23 = new String[9];
      int var21 = 0;
      String var20 = "x\u008agå½è®Ñ\u0082â\u0007vrý]z*\u0081DS\u008dJS_\u000fF,Ñ\\ÜBP\u009fçCÑ¹¡I^@\fÊ¥¬\u001a?\"x\u0086¤ø\u0086¦~oAH'à\u0082\u009dQDP.+\u0094½³ÛÏ@?8Æ\u0081*\u0096áóò\u0083\u008br\u0007\fd\u0091C1]®ÏfêÚÄ\u0086\u009c£\u008aÿçí\u008cÏ)º\u0098\u0089Õ\u0012\u0090$\u001azG\bó`æ\u0010\u0088>\u0095ÿ.\u0080\u008bj*XV^vò \u0081\u0089\u0001\u000b\u0095Ý·üÎ\u0092Ä²ÅK ã\u008b¥c\u0007ã¶\u0099÷\u0094Ê\u001d\u0095r\u001e%>\u0018\u0002²\u001e»âÐCzÎ¢@hBR\u0089í\u0099\u0011ð\u000eø\u0090¸\u001dH\n$Y¾\u0005SL¥o¥fy®¬\u000bÛ[\u0083¥[èþ>\u00ad¶n k@Ð¬q$¼}piägü\u0000\u0093©\u0003\u0013\u0013nsËçá\u00ad¼\u0012\u009añ\b«\u001e\u001d¼Ã5÷tYÚ\u0000Gýtù\u0018Ío\u001d\u009b\u0006\u0002Î\u0006d×â37®¼\u008fö\u0090ºë0\u0099`^ ¥\u001c\u001b|ô\rY.Ì\u001eTû&2\u000f¿\u009e\u0088\u001c(*\ftê¾X¼Ä,\u0090\u008b¤";
      int var22 = "x\u008agå½è®Ñ\u0082â\u0007vrý]z*\u0081DS\u008dJS_\u000fF,Ñ\\ÜBP\u009fçCÑ¹¡I^@\fÊ¥¬\u001a?\"x\u0086¤ø\u0086¦~oAH'à\u0082\u009dQDP.+\u0094½³ÛÏ@?8Æ\u0081*\u0096áóò\u0083\u008br\u0007\fd\u0091C1]®ÏfêÚÄ\u0086\u009c£\u008aÿçí\u008cÏ)º\u0098\u0089Õ\u0012\u0090$\u001azG\bó`æ\u0010\u0088>\u0095ÿ.\u0080\u008bj*XV^vò \u0081\u0089\u0001\u000b\u0095Ý·üÎ\u0092Ä²ÅK ã\u008b¥c\u0007ã¶\u0099÷\u0094Ê\u001d\u0095r\u001e%>\u0018\u0002²\u001e»âÐCzÎ¢@hBR\u0089í\u0099\u0011ð\u000eø\u0090¸\u001dH\n$Y¾\u0005SL¥o¥fy®¬\u000bÛ[\u0083¥[èþ>\u00ad¶n k@Ð¬q$¼}piägü\u0000\u0093©\u0003\u0013\u0013nsËçá\u00ad¼\u0012\u009añ\b«\u001e\u001d¼Ã5÷tYÚ\u0000Gýtù\u0018Ío\u001d\u009b\u0006\u0002Î\u0006d×â37®¼\u008fö\u0090ºë0\u0099`^ ¥\u001c\u001b|ô\rY.Ì\u001eTû&2\u000f¿\u009e\u0088\u001c(*\ftê¾X¼Ä,\u0090\u008b¤"
         .length();
      char var19 = 'H';
      int var29 = -1;

      label66:
      while (true) {
         String var31 = var20.substring(++var29, var29 + var19);
         int var10001 = -1;

         while (true) {
            byte[] var24 = var16.doFinal(var31.getBytes("ISO-8859-1"));
            String var50 = a(var24).intern();
            switch (var10001) {
               case 0:
                  var23[var21++] = var50;
                  if ((var29 += var19) >= var22) {
                     b = var23;
                     c = new String[9];
                     short var33 = 2637;
                     long var42 = 837577615751855723L ^ var25;
                     dpr = "Developed by Kawase, Badaiim & IHasseDich";
                     short var34 = 10941;
                     long var43 = 2588335785628278423L ^ var25;
                     asu = "Astralis";
                     Cipher var11;
                     Cipher var35 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var25 << var12 * 8 >>> 56);
                     }

                     var35.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = 5909704405387031147L;
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
                     long var54 = (var15[0] & 255L) << 56
                        | (var15[1] & 255L) << 48
                        | (var15[2] & 255L) << 40
                        | (var15[3] & 255L) << 32
                        | (var15[4] & 255L) << 24
                        | (var15[5] & 255L) << 16
                        | (var15[6] & 255L) << 8
                        | var15[7] & 255L;
                     var10001 = (byte)-1;
                     e = var54;
                     h = new HashMap(13);
                     Cipher var0;
                     Cipher var36 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
                     }

                     var36.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "\u00947$B\u0080\u0085=//-¦-Ó`\u0096E";
                     int var5 = "\u00947$B\u0080\u0085=//-¦-Ó`\u0096E".length();
                     byte var2 = 0;

                     label42:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var37 = var6;
                        var10001 = var3++;
                        long var56 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte var60 = -1;

                        while (true) {
                           long var8 = var56;
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
                           long var62 = (var10[0] & 255L) << 56
                              | (var10[1] & 255L) << 48
                              | (var10[2] & 255L) << 40
                              | (var10[3] & 255L) << 32
                              | (var10[4] & 255L) << 24
                              | (var10[5] & 255L) << 16
                              | (var10[6] & 255L) << 8
                              | var10[7] & 255L;
                           switch (var60) {
                              case 0:
                                 var37[var10001] = var62;
                                 if (var2 >= var5) {
                                    f = var6;
                                    g = new Long[4];
                                    dtw = new dar();
                                    short var38 = 1439;
                                    long var48 = 362581967194108347L ^ var25;
                                    ecj = LoggerFactory.getLogger("astralis");
                                    return;
                                 }
                                 break;
                              default:
                                 var37[var10001] = var62;
                                 if (var2 < var5) {
                                    continue label42;
                                 }

                                 var4 = "\fãq(±Ád¿ÌÕÌ\u0013ö\r¶÷";
                                 var5 = "\fãq(±Ád¿ÌÕÌ\u0013ö\r¶÷".length();
                                 var2 = 0;
                           }

                           byte var47 = var2;
                           var2 += 8;
                           var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
                           var37 = var6;
                           var10001 = var3++;
                           var56 = (var7[0] & 255L) << 56
                              | (var7[1] & 255L) << 48
                              | (var7[2] & 255L) << 40
                              | (var7[3] & 255L) << 32
                              | (var7[4] & 255L) << 24
                              | (var7[5] & 255L) << 16
                              | (var7[6] & 255L) << 8
                              | var7[7] & 255L;
                           var60 = 0;
                        }
                     }
                  }

                  var19 = var20.charAt(var29);
                  break;
               default:
                  var23[var21++] = var50;
                  if ((var29 += var19) < var22) {
                     var19 = var20.charAt(var29);
                     continue label66;
                  }

                  var20 = "\u0014ø2\u0092©d\u0082\u009cïé×]&\u009b¸\u0094\u000eÔð\u0080~¦\t\u008a\u008fÈ¬d^\u0083:î\u0014Ú\u008c¢\u0005*4ÕF×\u0012S±òz±dáíüåw\u0095s\u0014É\u000e>jóª~\u0018t¡¹Ð}\u0088\u0092-£ÇX\u009a\u009d\tØB£ýzÞ\u0094N\u001c²";
                  var22 = "\u0014ø2\u0092©d\u0082\u009cïé×]&\u009b¸\u0094\u000eÔð\u0080~¦\t\u008a\u008fÈ¬d^\u0083:î\u0014Ú\u008c¢\u0005*4ÕF×\u0012S±òz±dáíüåw\u0095s\u0014É\u000e>jóª~\u0018t¡¹Ð}\u0088\u0092-£ÇX\u009a\u009d\tØB£ýzÞ\u0094N\u001c²"
                     .length();
                  var19 = '@';
                  var29 = -1;
            }

            var31 = var20.substring(++var29, var29 + var19);
            var10001 = 0;
         }
      }
   }

   public static void aow(int[] var0) {
      bko = var0;
   }

   public static int[] abu() {
      return bko;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8754;
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
            throw new RuntimeException("cc/astralis/dar", var10);
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
         throw new RuntimeException("cc/astralis/dar" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24657;
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
            throw new RuntimeException("cc/astralis/dar", var14);
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
         throw new RuntimeException("cc/astralis/dar" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
