package cc.astralis;

import dev.opalV2.Loader;
import dev.opalV2.hidden.Hidden0;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.security.PrivateKey;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fz {
   private static final String ebt;
   private static final int had;
   private static final int emz;
   private static final int anv;
   public static final PrivateKey czv;
   private static cdr[] eta;
   private static final String[] a;
   private static final long b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   public static native byte[] hgv(long seed);

   public static native String dvr(String data, byte[] key, byte[] aad);

   public static native String atc(String base64, byte[] key, byte[] aad);

   public static native String dsg(String data, byte[] key, long aad);

   public static native String ati(String data, byte[] key, long aad);

   private static native byte[] fbh(long var0);

   static {
      Loader.registerNativesForClass(2, fz.class);
      Hidden0.special_clinit_2_70(fz.class);
   }

   public static void gpz(cdr[] var0) {
      eta = var0;
   }

   public static cdr[] dtf() {
      return eta;
   }

   private static char[] a(String var0) {
      long var1 = b ^ 34027008235863L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ a<"p">(30504, 1000121376111926945L ^ var1));
      }

      return var10000;
   }

   private static String a(int var0, char[] var1) {
      long var2 = b ^ 13040155252041L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         var10001[var4] = (char)(var10001[var4] ^ var10002 ^ switch (var4 % a<"p">(30157, 4729817973478805599L ^ var2)) {
            case 0 -> a<"p">(4151, 6814512269942339007L ^ var2);
            case 1 -> a<"p">(18725, 8057442844525685947L ^ var2);
            case 2 -> a<"p">(16331, 9069902616273689172L ^ var2);
            case 3 -> a<"p">(27135, 6199030825221278828L ^ var2);
            case 4 -> a<"p">(29429, 6929196391463802747L ^ var2);
            case 5 -> a<"p">(26439, 5274623765372551894L ^ var2);
            default -> a<"p">(25281, 1379865230917683029L ^ var2);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25159;
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
            throw new RuntimeException("cc/astralis/fz", var14);
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
         throw new RuntimeException("cc/astralis/fz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
