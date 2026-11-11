package cc.astralis;

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
import net.minecraft.class_2828.class_5911;

public class ehs extends hcr {
   private final gbp hdp;
   private int aag;
   private static final long a = 16415869563205L;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long g;

   public ehs(guu parentClass) {
      long ax = ehs.a ^ 46537812667857L;
      short var10002 = 28543;
      long var10003 = 363781433668153096L ^ ax;
      super(a, "Watchdog");
      short var4 = 1302;
      long var10004 = 2332424468659684704L ^ ax;
      a.hdp = new gbp("Timer", false);
      a.ebu(a.hdp);
   }

   @gdz
   public void ajb(eih event) {
      int[] var4;
      label65: {
         label64: {
            long ax = ehs.a ^ 46768785402592L;
            var4 = dar.abu();
            if (var4 != null) {
               if (!bav.bfi()) {
                  break label64;
               }

               a.aag++;
            }

            if (var4 != null) {
               break label65;
            }
         }

         a.aag = 0;
      }

      int var10000;
      double var5;
      var10000 = (var5 = chi.field_1724.field_6017 - chi.field_1724.method_18798().field_1351 - 3.0) == 0.0 ? 0 : (var5 < 0.0 ? -1 : 1);
      label55:
      if (var4 != null) {
         if (var10000 > 0) {
            var10000 = chi.field_1724.method_31549().field_7478;
            if (var4 == null) {
               break label55;
            }

            if (var10000 == 0) {
               var10000 = a.aag;
               if (var4 == null) {
                  break label55;
               }

               if (a.aag < (int)g) {
                  if (a.hdp.dnp()) {
                     aal = 0.5F;
                  }

                  gix.dsd(new class_5911(true, false));
                  chi.field_1724.field_6017 = 0.0;
                  if (var4 != null) {
                     return;
                  }
               }
            }
         }

         var10000 = a.hdp.dnp();
      }

      if (var10000 != 0) {
         aal = 1.0F;
      }
   }

   static {
      long var5 = a ^ 67814247721985L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[2];
      int var12 = 0;
      String var11 = "\u0082\u0016/*hwÇ\u001eé@Ü\u001at\u009füÅ\u0018QÁ\u009b+¸xQùÅí\u0011¼|Ëß]\u001c¥/\u008eº\u0094ï<";
      int var13 = "\u0082\u0016/*hwÇ\u001eé@Ü\u001at\u009füÅ\u0018QÁ\u009b+¸xQùÅí\u0011¼|Ëß]\u001c¥/\u008eº\u0094ï<".length();
      char var10 = 16;
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var20 = a(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var20;
         if ((var9 += var10) >= var13) {
            d = var14;
            e = new String[2];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = -5996727389746296747L;
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
            long var23 = (var4[0] & 255L) << 56
               | (var4[1] & 255L) << 48
               | (var4[2] & 255L) << 40
               | (var4[3] & 255L) << 32
               | (var4[4] & 255L) << 24
               | (var4[5] & 255L) << 16
               | (var4[6] & 255L) << 8
               | var4[7] & 255L;
            var10001 = -1;
            g = var23;
            return;
         }

         var10 = var11.charAt(var9);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23778;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/ehs", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("cc/astralis/ehs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
