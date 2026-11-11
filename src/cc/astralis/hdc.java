package cc.astralis;

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
import sun.misc.Unsafe;

public class hdc {
   private static final long a = 101740641994568L;
   private static final String b;
   private static final long c;
   private static final long[] d;
   private static final Long[] e;
   private static final Map f;

   public static void fps() {
      long a = hdc.a ^ 34151672878067L;
      int[] ax = dar.abu();

      long var10000;
      label35: {
         try {
            Field axx = Unsafe.class.getDeclaredField(b);
            axx.setAccessible(true);
            Unsafe axxx = (Unsafe)axx.get(null);
            long axxxx = ThreadLocalRandom.current().nextLong();
            long axxxxx = ThreadLocalRandom.current().nextLong(1L, a<"i">(5227, 6103838305369717055L ^ a));
            int axxxxxx = ThreadLocalRandom.current().nextInt(1, (int)c);
            axxx.putLong(Thread.currentThread(), a<"i">(13529, 915968061862140297L ^ a), axxxx);
            axxx.putAddress(axxxxx, 0L);
            Runtime.getRuntime().halt(axxxxxx);
         } catch (Throwable var10) {
            fps();
            long axxxxxxx = a<"i">(27905, 4494314876738207824L ^ a);

            while (axxxxxxx < a<"i">(315, 6002254656540601449L ^ a)) {
               var10000 = --axxxxxxx + 1L;
               if (ax == null) {
                  break label35;
               }

               axxxxxxx = var10000;
               if (ax == null) {
                  break;
               }
            }
         }

         var10000 = a<"i">(8972, 8402427067179388511L ^ a);
      }

      long axx = var10000;

      while (axx < a<"i">(315, 6002254656540601449L ^ a)) {
         axx--;
         axx++;
         if (ax == null) {
            break;
         }
      }
   }

   static {
      long var16 = a ^ 48025902721695L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var19 = 1; var19 < 8; var19++) {
         var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var20 = var18.doFinal("theUnsafe".getBytes("ISO-8859-1"));
      String var29 = a(var20).intern();
      int var10001 = -1;
      b = var29;
      Cipher var11;
      var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)(var16 << var12 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var13 = -8289151349077035178L;
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
      long var31 = (var15[0] & 255L) << 56
         | (var15[1] & 255L) << 48
         | (var15[2] & 255L) << 40
         | (var15[3] & 255L) << 32
         | (var15[4] & 255L) << 24
         | (var15[5] & 255L) << 16
         | (var15[6] & 255L) << 8
         | var15[7] & 255L;
      var10001 = (byte)-1;
      c = var31;
      f = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[5];
      int var3 = 0;
      String var4 = "\u00807ü\u001b\u0004\u00adèWTSá\u00840tDö\u0016y\u001fÆI\u0095Ñ^";
      int var5 = "\u00807ü\u001b\u0004\u00adèWTSá\u00840tDö\u0016y\u001fÆI\u0095Ñ^".length();
      byte var2 = 0;

      label35:
      while (true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var24 = var6;
         var10001 = var3++;
         long var33 = (var7[0] & 255L) << 56
            | (var7[1] & 255L) << 48
            | (var7[2] & 255L) << 40
            | (var7[3] & 255L) << 32
            | (var7[4] & 255L) << 24
            | (var7[5] & 255L) << 16
            | (var7[6] & 255L) << 8
            | var7[7] & 255L;
         byte var37 = -1;

         while (true) {
            long var8 = var33;
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
            long var39 = (var10[0] & 255L) << 56
               | (var10[1] & 255L) << 48
               | (var10[2] & 255L) << 40
               | (var10[3] & 255L) << 32
               | (var10[4] & 255L) << 24
               | (var10[5] & 255L) << 16
               | (var10[6] & 255L) << 8
               | var10[7] & 255L;
            switch (var37) {
               case 0:
                  var24[var10001] = var39;
                  if (var2 >= var5) {
                     d = var6;
                     e = new Long[5];
                     return;
                  }
                  break;
               default:
                  var24[var10001] = var39;
                  if (var2 < var5) {
                     continue label35;
                  }

                  var4 = "%¿\u001c±F\u0006¨\f\b\u009bÔ\u0094¶ìDá";
                  var5 = "%¿\u001c±F\u0006¨\f\b\u009bÔ\u0094¶ìDá".length();
                  var2 = 0;
            }

            byte var28 = var2;
            var2 += 8;
            var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
            var24 = var6;
            var10001 = var3++;
            var33 = (var7[0] & 255L) << 56
               | (var7[1] & 255L) << 48
               | (var7[2] & 255L) << 40
               | (var7[3] & 255L) << 32
               | (var7[4] & 255L) << 24
               | (var7[5] & 255L) << 16
               | (var7[6] & 255L) << 8
               | var7[7] & 255L;
            var37 = 0;
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

   private static long a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14827;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/hdc", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         e[var3] = var15;
      }

      return e[var3];
   }

   private static long a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = a(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
         throw new RuntimeException("cc/astralis/hdc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
