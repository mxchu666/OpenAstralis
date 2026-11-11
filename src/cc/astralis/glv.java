package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class glv<T> {
   protected final List<T> bki = new ArrayList<>();
   private static int haw;
   private static int akl;
   private static final long b = 107185137976063L;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h = new HashMap(13);

   public synchronized void cco(T object) {
      a.bki.add(a);
   }

   @SafeVarargs
   public final synchronized void bpq(T... objects) {
      a.bki.addAll(Arrays.asList(a));
   }

   public synchronized void cmz(T object) {
      a.bki.remove(a);
   }

   @SafeVarargs
   public final synchronized void bhx(T... objects) {
      a.bki.removeAll(Arrays.asList(a));
   }

   public synchronized void ave(Predicate<? super T> predicate) {
      a.bki.removeIf(a);
   }

   public final synchronized List<T> ckh(Predicate<? super T> predicate) {
      return a.bki.stream().filter(a).collect(Collectors.toList());
   }

   public final synchronized T ddh(Predicate<? super T> predicate) {
      return a.bki.stream().filter(a).findFirst().orElse(null);
   }

   public final synchronized List<T> czl() {
      return Collections.unmodifiableList(new ArrayList<>(a.bki));
   }

   public static void gvy(int var0) {
      haw = var0;
   }

   public static int bje() {
      return haw;
   }

   public static int fpx() {
      long var0 = b ^ 78195939408546L;
      int var2 = bje();
      if (var2 == 0) {
         short var10000 = 17685;
         long var10001 = 432954715943345789L ^ var0;
         return 13;
      } else {
         return 0;
      }
   }

   static {
      long var11 = b ^ 139271046552042L;
      dpn(86);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ÙÆ\u0089ÉhåU×)½e(Uùã9";
      int var5 = "ÙÆ\u0089ÉhåU×)½e(Uùã9".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var8 = (var7[0] & 255L) << 56
            | (var7[1] & 255L) << 48
            | (var7[2] & 255L) << 40
            | (var7[3] & 255L) << 32
            | (var7[4] & 255L) << 24
            | (var7[5] & 255L) << 16
            | (var7[6] & 255L) << 8
            | var7[7] & 255L;
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
         long var10004 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         byte var16 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      f = var6;
      g = new Integer[2];
      if (fpx() != 0) {
         short var13 = 22581;
         long var15 = 491684232673435668L ^ var11;
         gvy(53);
      }
   }

   public static void dpn(int var0) {
      akl = var0;
   }

   public static int cmr() {
      return akl;
   }

   public static int hhk() {
      int var0 = cmr();
      return var0 == 0 ? 80 : 0;
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9012;
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
            throw new RuntimeException("cc/astralis/glv", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("cc/astralis/glv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
