package cc.astralis;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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

public final class chz {
   private final int aaq = 1;
   private static final long a = 29708345993456L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static chz dgg(InputStream is) {
      return new chz(a);
   }

   public static chz clj(String filePath) {
      long ax = chz.a ^ 110303245805239L;
      short var10003 = 30460;
      long var10004 = 2372716941524069374L ^ ax;
      return new chz("/assets/astralis/" + a);
   }

   public static chz gcm(String absoluteFilePath) {
      long ax = chz.a ^ 79054071483396L;

      try {
         chz var4;
         try (FileInputStream axx = new FileInputStream(a)) {
            var4 = new chz(axx);
         }

         return var4;
      } catch (IOException var8) {
         short var10003 = 2533;
         long var10004 = 5332040684938821205L ^ ax;
         throw new RuntimeException("Failed to load image from: " + a, var8);
      }
   }

   private chz(InputStream a) {
   }

   private chz(String a) {
      this(chz.class.getResourceAsStream(a));
   }

   public int dod() {
      return a.aaq;
   }

   static {
      long var0 = a ^ 63653293443041L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "\u000b¯\u0013e oßÊFjÊ¡$Þ±\u009f8\u009c§é8F\u0017Í\fMÁ(ûpÄ».\u00adÅc?®â©05]±2ôPM½´~32ET\u0086\u0015Ôà\u0011¼\u0013\\fË«\u0082\u0089+xö¡ÃMM´F±gö\u007fF\u001cñ;hõÀ`";
      int var8 = "\u000b¯\u0013e oßÊFjÊ¡$Þ±\u009f8\u009c§é8F\u0017Í\fMÁ(ûpÄ».\u00adÅc?®â©05]±2ôPM½´~32ET\u0086\u0015Ôà\u0011¼\u0013\\fË«\u0082\u0089+xö¡ÃMM´F±gö\u007fF\u001cñ;hõÀ`"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21317;
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
            throw new RuntimeException("cc/astralis/chz", var10);
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
         throw new RuntimeException("cc/astralis/chz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
