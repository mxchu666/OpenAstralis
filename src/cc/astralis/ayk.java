package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class ayk {
   private final byte[] cgf;
   private final ebf amc;
   private final asz flt;
   private long cjc;
   private static final String[] a;
   private static final long b = 12573755184405L;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;
   private static final long f;

   public ayk(byte[] key, byte[] nonce) {
      this(a, a, ayk.a[1].getBytes());
   }

   public ayk(byte[] key, byte[] nonce, byte[] addition) {
      long ax;
      int[] axx;
      cdr[] axxx;
      byte[] var15;
      label42: {
         ax = b ^ 17336323711036L;
         int[] var10000 = dar.abu();
         long axxxx = f;
         axx = var10000;
         cdr[] var13 = fz.dtf();
         super();
         axxx = var13;
         int var14 = a.length;
         int var10001 = a<"b">(4183, 930635842633262498L ^ ax);
         if (axx != null) {
            if (var14 != var10001) {
               throw new IllegalArgumentException(ayk.a[0]);
            }

            var15 = a;
            if (axx == null) {
               break label42;
            }

            var14 = a.length;
            short var18 = 7937;
            long var10002 = 1956072786363345663L ^ ax;
            var10001 = -1820814659;
         }

         if (var14 != var10001) {
            throw new IllegalArgumentException(ayk.a[2]);
         }

         a.cgf = a;
         a.cjc = 0L;
         ebf var16 = new ebf(a, a, 0);
         short var19 = 20725;
         long var21 = 6774380405721244935L ^ ax;
         var15 = var16.atf(new byte[64]);
      }

      byte[] axxxxx = var15;
      short var10004 = 25397;
      long var10005 = 1692387400377079497L ^ ax;
      a.flt = new asz(Arrays.copyOf(axxxxx, -635405026));
      a.amc = new ebf(a, a, 1);
      int var17 = a.length;
      short var20 = 24574;
      long var22 = 8778794921109694990L ^ ax;
      byte[] axxxxxx = deo(var17, 16);
      byte[] axxxxxxx = new byte[a.length + axxxxxx.length];
      System.arraycopy(a, 0, axxxxxxx, 0, a.length);
      System.arraycopy(axxxxxx, 0, axxxxxxx, a.length, axxxxxx.length);
      a.flt.ajy(axxxxxxx);
      if (axx != null && axxx != null) {
         cdr.apm(new String[2]);
      }
   }

   private static byte[] deo(int a, int a) {
      int ax = (a - a % a) % a;
      return new byte[ax];
   }

   public byte[] cjj(byte[] data) {
      long ax = b ^ 129083647570781L;
      byte[] axx = a.amc.atf(a);
      int var10000 = axx.length;
      short var10001 = 24574;
      long var10002 = 8778907471606462831L ^ ax;
      byte[] axxx = deo(var10000, 16);
      byte[] axxxx = new byte[axx.length + axxx.length];
      System.arraycopy(axx, 0, axxxx, 0, axx.length);
      System.arraycopy(axxx, 0, axxxx, axx.length, axxx.length);
      a.flt.ajy(axxxx);
      a.cjc += axx.length;
      return axx;
   }

   public byte[] fcr(byte[] data) {
      long ax = b ^ 77309716664076L;
      int var10000 = a.length;
      short var10001 = 24574;
      long var10002 = 8778855856078226750L ^ ax;
      byte[] axx = deo(var10000, 16);
      byte[] axxx = new byte[a.length + axx.length];
      System.arraycopy(a, 0, axxx, 0, a.length);
      System.arraycopy(axx, 0, axxx, a.length, axx.length);
      a.flt.ajy(axxx);
      a.cjc += a.length;
      return a.amc.bfj(a);
   }

   public byte[] arj() {
      long a = b ^ 40493916534123L;
      short var10000 = 14808;
      long var10001 = 6379158502839769470L ^ a;
      ByteBuffer ax = ByteBuffer.allocate(16).order(ByteOrder.LITTLE_ENDIAN);
      ax.putLong(a.cgf.length);
      ax.putLong(a.cjc);
      a.flt.ajy(ax.array());
      return a.flt.fkw();
   }

   static {
      long var20 = b ^ 4062039055882L;
      Cipher var17;
      Cipher var10000 = var17 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var18 = 1; var18 < 8; var18++) {
         var10003[var18] = (byte)(var20 << var18 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var19 = var17.doFinal(
         "\u0010\u0098ÐÁå\u0087\u001e\u0097+Á³\u008b\u0086Á #ò\u0000ÍÇ\u0012 ÀÐ\u0095¿õx«³\u001c\u0010\u008e\u0019>\u0014ëÜ²¸·áè´\f\" ×!L\u008bY\u0081\u0087Gá$\u0082\u0011Ê\u0088¨Îì"
            .getBytes("ISO-8859-1")
      );
      String var43 = a(var19).intern();
      int var10001 = -1;
      String var16 = var43;
      e = new HashMap(13);
      Cipher var5;
      var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var6 = 1; var6 < 8; var6++) {
         var10003[var6] = (byte)(var20 << var6 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var11 = new long[14];
      int var8 = 0;
      String var9 = "\u009baÙ¸À³]ó\u000e®© ú\u0092\u009cxJ6\u009d\u0080\n¤\u00993üg#\u0007íè\u0098§0L~³¯¹Â\u009bº¥\u0018\u0013~\u009f\u0011\u0091ë¥Àg\u008eÇ,S3£\u0086<¦ã@\u0094°o\f\u00941)\u0087³Ñ\u0007h\u0016;\u0004±óK·\u0089..r\u0081\u0088\u009f\\C^\u008a\u0003bN";
      int var10 = "\u009baÙ¸À³]ó\u000e®© ú\u0092\u009cxJ6\u009d\u0080\n¤\u00993üg#\u0007íè\u0098§0L~³¯¹Â\u009bº¥\u0018\u0013~\u009f\u0011\u0091ë¥Àg\u008eÇ,S3£\u0086<¦ã@\u0094°o\f\u00941)\u0087³Ñ\u0007h\u0016;\u0004±óK·\u0089..r\u0081\u0088\u009f\\C^\u008a\u0003bN"
         .length();
      byte var7 = 0;

      label52:
      while (true) {
         var10001 = var7;
         var7 += 8;
         byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
         long[] var31 = var11;
         var10001 = var8++;
         long var45 = (var12[0] & 255L) << 56
            | (var12[1] & 255L) << 48
            | (var12[2] & 255L) << 40
            | (var12[3] & 255L) << 32
            | (var12[4] & 255L) << 24
            | (var12[5] & 255L) << 16
            | (var12[6] & 255L) << 8
            | var12[7] & 255L;
         byte var52 = -1;

         while (true) {
            long var13 = var45;
            byte[] var15 = var5.doFinal(
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
            long var55 = (var15[0] & 255L) << 56
               | (var15[1] & 255L) << 48
               | (var15[2] & 255L) << 40
               | (var15[3] & 255L) << 32
               | (var15[4] & 255L) << 24
               | (var15[5] & 255L) << 16
               | (var15[6] & 255L) << 8
               | var15[7] & 255L;
            switch (var52) {
               case 0:
                  var31[var10001] = var55;
                  if (var7 >= var10) {
                     c = var11;
                     d = new Integer[14];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -6789446884088823691L;
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
                     long var48 = (var4[0] & 255L) << 56
                        | (var4[1] & 255L) << 48
                        | (var4[2] & 255L) << 40
                        | (var4[3] & 255L) << 32
                        | (var4[4] & 255L) << 24
                        | (var4[5] & 255L) << 16
                        | (var4[6] & 255L) << 8
                        | var4[7] & 255L;
                     byte var38 = -1;
                     f = var48;
                     String[] var27 = new String[3];
                     short var33 = 5088;
                     int var25 = 0;
                     long var39 = 7965407987050567723L ^ var20;
                     String var24 = var16;
                     int var26 = var16.length();
                     int var23 = 1209621815;
                     int var22 = -1;

                     while (true) {
                        short var34 = 31205;
                        long var40 = 228607871803077160L ^ var20;
                        String var49 = a(1062145195, a(var24.substring(++var22, var22 + var23)));
                        var38 = -1;
                        var27[var25++] = var49;
                        if ((var22 += var23) >= var26) {
                           a = var27;
                           return;
                        }

                        var23 = var24.charAt(var22);
                     }
                  }
                  break;
               default:
                  var31[var10001] = var55;
                  if (var7 < var10) {
                     continue label52;
                  }

                  var9 = "8Gåê9YújbY\u00adØ\u008b´\u001eñ";
                  var10 = "8Gåê9YújbY\u00adØ\u008b´\u001eñ".length();
                  var7 = 0;
            }

            byte var37 = var7;
            var7 += 8;
            var12 = var9.substring(var37, var7).getBytes("ISO-8859-1");
            var31 = var11;
            var10001 = var8++;
            var45 = (var12[0] & 255L) << 56
               | (var12[1] & 255L) << 48
               | (var12[2] & 255L) << 40
               | (var12[3] & 255L) << 32
               | (var12[4] & 255L) << 24
               | (var12[5] & 255L) << 16
               | (var12[6] & 255L) << 8
               | var12[7] & 255L;
            var52 = 0;
         }
      }
   }

   private static char[] a(String var0) {
      long var1 = b ^ 103179683709573L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   private static String a(int var0, char[] var1) {
      long var2 = b ^ 124917259514581L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 16158;
         long var10009 = 6570847897074784269L ^ var2;
         var10001[var4] = (char)(var10005 ^ var10002 ^ switch (var4 % -540432793) {
            case 0 -> {
               short var14 = 32403;
               long var19 = 3205355929690839429L ^ var2;
               yield -1220770655;
            }
            case 1 -> {
               short var13 = 24407;
               long var18 = 1726502303875643469L ^ var2;
               yield 60;
            }
            case 2 -> a<"b">(8058, 7068662042770929767L ^ var2);
            case 3 -> {
               short var12 = 28508;
               long var17 = 8512628439600171085L ^ var2;
               yield 751935027;
            }
            case 4 -> {
               short var11 = 4607;
               long var16 = 5258693382109624047L ^ var2;
               yield -853296479;
            }
            case 5 -> {
               short var10 = 24574;
               long var15 = 8778911155884439783L ^ var2;
               yield 16;
            }
            default -> 2;
         });
      }

      return new String(var10001).intern();
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16593;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/ayk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("cc/astralis/ayk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
