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

public class di extends guu {
   public final gbp eyg;
   public final gbp gpx;
   public final gbp aac;
   public final gbp hdp;
   public final gbp clg;
   public final gbp fub;
   private static final long a = 21890666790418L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long p;

   public di() {
      long a = di.a ^ 70642997569342L;
      super(bfm.VISUAL);
      short var10003 = 10632;
      long var10004 = 2872618057149220641L ^ a;
      a.eyg = new gbp("No Fire", true);
      var10003 = 27378;
      var10004 = 470631868344255583L ^ a;
      a.gpx = new gbp("No Water", true);
      var10003 = 31347;
      var10004 = 3756236326758700252L ^ a;
      a.aac = new gbp("No Blindness", true);
      var10003 = 22302;
      var10004 = 681413194523179442L ^ a;
      a.hdp = new gbp("No Fog", false);
      var10003 = 7836;
      var10004 = 5119370726326120500L ^ a;
      a.clg = new gbp("No Weather", false);
      var10003 = 8686;
      var10004 = 1503459836035108672L ^ a;
      a.fub = new gbp("No Clouds", false);
      ffn[] var10001 = new ffn[(int)p];
      var10001[0] = a.eyg;
      var10001[1] = a.gpx;
      var10001[2] = a.aac;
      var10001[3] = a.hdp;
      var10001[4] = a.clg;
      var10001[5] = a.fub;
      a.bfi(var10001);
   }

   static {
      long var5 = a ^ 84757923744384L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[6];
      int var12 = 0;
      String var11 = "oÊÚ\u0000\u0088ODHYPx+\u0011<\u001dZ\u000bù\u0080¹¦\u0096¬û\u0010\n8\u000eâÈ\u0014U\u009f\\04\u001e³ U¸ \u0001\u0098 ¥#ØbÄ*úÃ'\u0099öoê\u00976cÎ0\u0007\"r{iõNjáß\u007f _8h\fðh\u0083¬/=°ïÆ\"i\u0019-${òbV\u0082<ÐêÌP\u0095\u001b¸D";
      int var13 = "oÊÚ\u0000\u0088ODHYPx+\u0011<\u001dZ\u000bù\u0080¹¦\u0096¬û\u0010\n8\u000eâÈ\u0014U\u009f\\04\u001e³ U¸ \u0001\u0098 ¥#ØbÄ*úÃ'\u0099öoê\u00976cÎ0\u0007\"r{iõNjáß\u007f _8h\fðh\u0083¬/=°ïÆ\"i\u0019-${òbV\u0082<ÐêÌP\u0095\u001b¸D"
         .length();
      char var10 = 24;
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = d(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     g = var14;
                     h = new String[6];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -337058764779922893L;
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
                     long var30 = (var4[0] & 255L) << 56
                        | (var4[1] & 255L) << 48
                        | (var4[2] & 255L) << 40
                        | (var4[3] & 255L) << 32
                        | (var4[4] & 255L) << 24
                        | (var4[5] & 255L) << 16
                        | (var4[6] & 255L) << 8
                        | var4[7] & 255L;
                     var10001 = -1;
                     p = var30;
                     return;
                  }

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var14[var12++] = var26;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label37;
                  }

                  var11 = "\u0007C\u0092M\u008dC×\u008c%M\u009b×}\u008a\u0098T\u0018\u000eIEÄÏ¤\u0090ø7_úcâ¶\u008eúù'\u008f\f³\u001dNA";
                  var13 = "\u0007C\u0092M\u008dC×\u008c%M\u009b×}\u008a\u0098T\u0018\u000eIEÄÏ¤\u0090ø7_úcâ¶\u008eúù'\u008f\f³\u001dNA".length();
                  var10 = 16;
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30593;
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
            throw new RuntimeException("cc/astralis/di", var10);
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
         throw new RuntimeException("cc/astralis/di" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
