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
import net.minecraft.class_243;

public class cyn extends fwu {
   private final gbg eid;
   private static final double ate = 1.0;
   private static final double dka = 1.0;
   private static final double fvw = 1.0;
   private int fzh;
   private static final int fqo;
   private static final long a = 133974203903443L;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public cyn() {
      long a = cyn.a ^ 88707157759900L;
      short var10001 = 32399;
      long var10002 = 1477938906907462259L ^ a;
      super("Prediction");
      a.fzh = 0;
      a.eid = new gbg();
   }

   @Override
   public void ayy(eih event) {
   }

   private String ey(class_243 a) {
      long ax = cyn.a ^ 112637995619210L;
      short var10000 = 29079;
      long var10001 = 2096195019910627708L ^ ax;
      return String.format("(%.3f, %.3f, %.3f)", a.field_1352, a.field_1351, a.field_1350);
   }

   public void brj() {
      a.eid.awk();
      a.fzh = 0;
   }

   static {
      long var7 = a ^ 27635348832476L;
      Cipher var9;
      Cipher var10000 = var9 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var7 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var10 = 1; var10 < 8; var10++) {
         var10003[var10] = (byte)(var7 << var10 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var16 = new String[2];
      int var14 = 0;
      String var13 = "YY\u009f\u0005\"Bhxð\u0099å\u0093\u007fñÅ\u0011]Â0YõS\u0012\u0080WjÞ\u0094H\u0017ö\u0084 XÙÝJ%\u0099\u0099,×ÐW¼ò$nöC\u00ade\u009fq¥Ü.Öq\u0085ähïe%";
      int var15 = "YY\u009f\u0005\"Bhxð\u0099å\u0093\u007fñÅ\u0011]Â0YõS\u0012\u0080WjÞ\u0094H\u0017ö\u0084 XÙÝJ%\u0099\u0099,×ÐW¼ò$nöC\u00ade\u009fq¥Ü.Öq\u0085ähïe%"
         .length();
      char var12 = ' ';
      int var11 = -1;

      while (true) {
         byte[] var17 = var9.doFinal(var13.substring(++var11, var11 + var12).getBytes("ISO-8859-1"));
         String var22 = b(var17).intern();
         byte var10001 = -1;
         var16[var14++] = var22;
         if ((var11 += var12) >= var15) {
            f = var16;
            g = new String[2];
            Cipher var2;
            var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var7 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var3 = 1; var3 < 8; var3++) {
               var10003[var3] = (byte)(var7 << var3 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var4 = 2314189875010766271L;
            byte[] var6 = var2.doFinal(
               new byte[]{
                  (byte)(var4 >>> 56),
                  (byte)(var4 >>> 48),
                  (byte)(var4 >>> 40),
                  (byte)(var4 >>> 32),
                  (byte)(var4 >>> 24),
                  (byte)(var4 >>> 16),
                  (byte)(var4 >>> 8),
                  (byte)var4
               }
            );
            long var25 = (var6[0] & 255L) << 56
               | (var6[1] & 255L) << 48
               | (var6[2] & 255L) << 40
               | (var6[3] & 255L) << 32
               | (var6[4] & 255L) << 24
               | (var6[5] & 255L) << 16
               | (var6[6] & 255L) << 8
               | var6[7] & 255L;
            var10001 = -1;
            long var0 = var25;
            fqo = (int)var0;
            return;
         }

         var12 = var13.charAt(var11);
      }
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3763;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/cyn", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
         throw new RuntimeException("cc/astralis/cyn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
