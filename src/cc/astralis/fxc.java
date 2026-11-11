package cc.astralis;

import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fxc extends brc {
   private static int[] agp;
   private static final String[] b;
   private static final long c = 9956836897563L;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public fxc() {
      long a = c ^ 135100323690953L;
      short var10001 = 5145;
      long var10002 = 1241462587314537859L ^ a;
      super(-1304840595);
   }

   @Override
   public void etg(JsonObject json) {
      a.cps(a);
   }

   @Override
   public String cql() {
      JsonObject a = a.fdo();
      String var10000 = a.toString();
      String[] var2 = b;
      return fz.dvr(var10000, cni.fsi(var2[0]), cni.fsi(var2[1]));
   }

   public static void dsm(int[] var0) {
      agp = var0;
   }

   public static int[] gty() {
      return agp;
   }

   static {
      long var15 = c ^ 85703940430308L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var15 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var14 = var12.doFinal(
         "¤&yò\u0015\u0007ËgÉv\u001cÓFý\u009al\u0095¤$\n\r4Sü\tíöØ9\u0084\u0000d?Ãæße@¤¨©Ñl\u0080\u0004\u0012Ü\u0088f\u0080ÊëÒå¬\u0007§¯\u0017z½Uê\u0013#!O$ P\"\u001e\u008aþ\u0092OQc)Ä\u00000gØY!Ùú»«\u009eß\u0093Q\u0005\u0013bÈ\u001di\u000bI\u0090;Q\u009dy\u008eM\\´\u0081A\u0081e\u001e\u008c}ÓdùÓÝe¯c®æVêß÷âª¼;<-G\u0019)Ò\u0000\b"
            .getBytes("ISO-8859-1")
      );
      String var35 = b(var14).intern();
      int var10001 = -1;
      String var11 = var35;
      i = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var15 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[11];
      int var3 = 0;
      String var4 = "a½Q¢A\u000eJúúîÈ¾\u000fÅ!ê5pÝêq\u0081\u009dÇ7\u0097ÈnA8t-_2F\u0085úu'a)D\u0097úe©¨NõÆ{D\u0017}u}ÔUÎv\u009aA¹öVÎ\u009d<Ý\u007fEè";
      int var5 = "a½Q¢A\u000eJúúîÈ¾\u000fÅ!ê5pÝêq\u0081\u009dÇ7\u0097ÈnA8t-_2F\u0085úu'a)D\u0097úe©¨NõÆ{D\u0017}u}ÔUÎv\u009aA¹öVÎ\u009d<Ý\u007fEè".length();
      byte var2 = 0;

      label40:
      while (true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var26 = var6;
         var10001 = var3++;
         long var37 = (var7[0] & 255L) << 56
            | (var7[1] & 255L) << 48
            | (var7[2] & 255L) << 40
            | (var7[3] & 255L) << 32
            | (var7[4] & 255L) << 24
            | (var7[5] & 255L) << 16
            | (var7[6] & 255L) << 8
            | var7[7] & 255L;
         byte var43 = -1;

         while (true) {
            long var8 = var37;
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
            long var45 = (var10[0] & 255L) << 56
               | (var10[1] & 255L) << 48
               | (var10[2] & 255L) << 40
               | (var10[3] & 255L) << 32
               | (var10[4] & 255L) << 24
               | (var10[5] & 255L) << 16
               | (var10[6] & 255L) << 8
               | var10[7] & 255L;
            switch (var43) {
               case 0:
                  var26[var10001] = var45;
                  if (var2 >= var5) {
                     g = var6;
                     h = new Integer[11];
                     String[] var22 = new String[2];
                     int var20 = 0;
                     String var19 = var11;
                     int var21 = var11.length();
                     short var31 = 30457;
                     long var39 = 5969197993079883591L ^ var15;
                     int var18 = 2045063808;
                     int var17 = -1;
                     dsm(null);

                     while (true) {
                        short var27 = 18308;
                        long var32 = 1281952968484714041L ^ var15;
                        String var40 = b(1826695012, b(var19.substring(++var17, var17 + var18)));
                        byte var33 = -1;
                        var22[var20++] = var40;
                        if ((var17 += var18) >= var21) {
                           b = var22;
                           return;
                        }

                        var18 = var19.charAt(var17);
                     }
                  }
                  break;
               default:
                  var26[var10001] = var45;
                  if (var2 < var5) {
                     continue label40;
                  }

                  var4 = "\u0005^\u0097\u0014\u0089u\u0019*%=¡\r-eOh";
                  var5 = "\u0005^\u0097\u0014\u0089u\u0019*%=¡\r-eOh".length();
                  var2 = 0;
            }

            byte var30 = var2;
            var2 += 8;
            var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
            var26 = var6;
            var10001 = var3++;
            var37 = (var7[0] & 255L) << 56
               | (var7[1] & 255L) << 48
               | (var7[2] & 255L) << 40
               | (var7[3] & 255L) << 32
               | (var7[4] & 255L) << 24
               | (var7[5] & 255L) << 16
               | (var7[6] & 255L) << 8
               | var7[7] & 255L;
            var43 = 0;
         }
      }
   }

   private static char[] b(String var0) {
      long var1 = c ^ 18616177945912L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 9846;
         long var10005 = 1092915554056774416L ^ var1;
         var10000[0] = (char)(var10003 ^ -1279094253);
      }

      return var10000;
   }

   private static String b(int var0, char[] var1) {
      long var2 = c ^ 104011179547249L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 1586;
         long var10009 = 3733554449696994331L ^ var2;
         var10001[var4] = (char)(var10005 ^ var10002 ^ switch (var4 % -1868817075) {
            case 0 -> {
               short var15 = 28975;
               long var21 = 4122301665425277711L ^ var2;
               yield 193591428;
            }
            case 1 -> {
               short var14 = 26651;
               long var20 = 8785132880487897653L ^ var2;
               yield 1506012787;
            }
            case 2 -> 2;
            case 3 -> {
               short var13 = 30612;
               long var19 = 3509279829791851966L ^ var2;
               yield 805365366;
            }
            case 4 -> {
               short var12 = 9834;
               long var18 = 4530180665647993926L ^ var2;
               yield 1454834460;
            }
            case 5 -> {
               short var11 = 7471;
               long var17 = 7869092141299543822L ^ var2;
               yield 1188518853;
            }
            default -> {
               short var10007 = 21946;
               long var16 = 4247824312219559831L ^ var2;
               yield 1212606088;
            }
         });
      }

      return new String(var10001).intern();
   }

   private static String b(byte[] var0) {
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6978;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/fxc", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
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
         throw new RuntimeException("cc/astralis/fxc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
