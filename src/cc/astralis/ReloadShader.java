package cc.astralis;

import java.awt.Color;
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

public class ReloadShader extends guu {
   public final gbp cgf;
   public final acn fkq;
   private boolean gne;
   private static final long a = 49417177202899L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public ReloadShader() {
      long a = ReloadShader.a ^ 135685088738024L;
      super(bfm.VISUAL);
      short var10003 = 20418;
      long var10004 = 7537065718212156791L ^ a;
      a.cgf = new gbp("Reload Shader", false);
      var10003 = 6844;
      var10004 = 6937433281012795400L ^ a;
      a.fkq = new acn("Color", Color.RED);
      a.gne = false;
      a.bfi(new ffn[]{a.fkq, a.cgf});
   }

   @gdz
   public void duk(fxx event) {
      int[] var4;
      boolean var10000;
      long ax = ReloadShader.a ^ 83266892798264L;
      var4 = dar.abu();
      var10000 = a.cgf.dnp();
      label48:
      if (var4 != null) {
         if (var10000) {
            var10000 = a.gne;
            if (var4 == null) {
               break label48;
            }

            if (!a.gne) {
               chi.method_1521();
               a.gne = true;
            }
         }

         var10000 = a.cgf.dnp();
      }

      label51: {
         if (var4 != null) {
            if (var10000) {
               return;
            }

            var5 = a;
            if (var4 == null) {
               break label51;
            }

            var10000 = a.gne;
         }

         if (!var10000) {
            return;
         }

         var5 = a;
      }

      var5.gne = false;
   }

   static {
      long var0 = a ^ 9359314482395L;
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
      String var6 = "\\\u0007tZ°\u0083¿öÑ\u008bF\u0095 Ø\u0081g\u0018|\u0002\u00ad3³E´\u000bHPJì/0S\u009fÛ»$¬6¨«\u0018";
      int var8 = "\\\u0007tZ°\u0083¿öÑ\u008bF\u0095 Ø\u0081g\u0018|\u0002\u00ad3³E´\u000bHPJì/0S\u009fÛ»$¬6¨«\u0018".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = d(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            g = var9;
            h = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static String d(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26767;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/ayd", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         h[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("cc/astralis/ayd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
