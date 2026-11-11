package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class gjr extends fso {
   private static final long a = 96591268866014L;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public gjr() {
      long a = gjr.a ^ 5162268546907L;
      String[] var10001 = new String[2];
      short var10004 = 15196;
      long var10005 = 512088540700085860L ^ a;
      var10001[0] = "help";
      var10001[1] = "h";
      short var10002 = 8544;
      long var10003 = 1000739582203696219L ^ a;
      super(var10001, "Shows Information And Usages About Other Commands");
   }

   @Override
   public void aov(String[] args, String message) {
      long ax = gjr.a ^ 100216406351115L;
      int[] var10000 = dar.abu();
      Iterator var6 = dar.gqy().bzq().czl().iterator();
      int[] axx = var10000;

      while (var6.hasNext()) {
         fso axxx = (fso)var6.next();
         String var8 = axxx.ax()[0];
         short var10001 = 10894;
         long var10002 = 8708600255141041636L ^ ax;
         bpa.dhu("Expresion: " + var8);
         String var9 = axxx.et();
         var10001 = 30172;
         var10002 = 2156369106484333237L ^ ax;
         bpa.dhu("Description: " + var9);
         if (axx == null) {
            break;
         }
      }
   }

   static {
      long var0 = a ^ 81572047692086L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "O\u0086`Ë\u009dÄs)\u008cZ¤âÍ2|¾\u0080 \u0083fÔ\u0000:ñ\u000bìe°2\u0015¨\u0015ÄîE²_èF\u009eî\f5\u0005ºÃãùXÙÓ\u0017KûvR\u0092dóÛ&\u0087öá)b\u008eÑ°Á\u0006Î\u009dHªs\n,l_ÑÄ\u0006\u0081<5ç\u001c !p#ï\u0095\u0002×ð\u008bcy\rúéÚâ\bd¸\u0000D\u0095Æ²J\u0015v}\u008a1á£";
      int var8 = "O\u0086`Ë\u009dÄs)\u008cZ¤âÍ2|¾\u0080 \u0083fÔ\u0000:ñ\u000bìe°2\u0015¨\u0015ÄîE²_èF\u009eî\f5\u0005ºÃãùXÙÓ\u0017KûvR\u0092dóÛ&\u0087öá)b\u008eÑ°Á\u0006Î\u009dHªs\n,l_ÑÄ\u0006\u0081<5ç\u001c !p#ï\u0095\u0002×ð\u008bcy\rúéÚâ\bd¸\u0000D\u0095Æ²J\u0015v}\u008a1á£"
         .length();
      char var5 = 'X';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     d = new String[4];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "U\u007f\u0014\u0085¬÷\u0017m\u0006¶\\\u0012\u008aÎÝé\u0097-\u0012Ð/\u0006¿K©²LÞ{\u001am\u0014\u0010<U5ïI\u0012Ó[C\b\u0018>äJ2_";
                  var8 = "U\u007f\u0014\u0085¬÷\u0017m\u0006¶\\\u0012\u008aÎÝé\u0097-\u0012Ð/\u0006¿K©²LÞ{\u001am\u0014\u0010<U5ïI\u0012Ó[C\b\u0018>äJ2_"
                     .length();
                  var5 = ' ';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1470;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/gjr", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("cc/astralis/gjr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
