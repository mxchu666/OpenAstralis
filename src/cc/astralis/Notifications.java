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

public class Notifications extends guu {
   public final gbp bnr;
   public final adu bph;
   public final gbp gde;
   private static final long a = 40093294381979L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public Notifications() {
      long a = Notifications.a ^ 63571761168540L;
      super(bfm.VISUAL);
      short var10003 = 28076;
      long var10004 = 8144974742314936773L ^ a;
      a.bnr = new gbp("Notification on Toggle", true);
      var10003 = 24544;
      var10004 = 1641327803930139533L ^ a;
      short var6 = 29545;
      long var10005 = 2186995945024648963L ^ a;
      String[] var8 = new String[2];
      short var10008 = 22682;
      long var10009 = 6627808232126209270L ^ a;
      var8[0] = "Modern";
      var10008 = 24785;
      var10009 = 2896030536026580154L ^ a;
      var8[1] = "Legacy";
      a.bph = new adu("Mode", "Modern", var8);
      var10003 = 2989;
      var10004 = 2914280575922474949L ^ a;
      a.gde = new gbp("Pop Sound", true);
      a.bfi(new ffn[]{a.bph, a.bnr, a.gde});
   }

   static {
      long var0 = a ^ 120070421083005L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "çë\u0085\u0085¿\u0006á\u001fÐI6í-\u008d\u007f\u0019S¦à}%~\u0010Õ(6m\u0090µbi![\u0019\u0092¼Ç\u009bð'jx?|Û®:Ü\u0096Ë\u001e\u000fÝºË\u00068`H3Ì\tÏ\u00adå\u0010ëÃ)\u008a¹B¡l\u0082º\u0080Pú\u009e\u0004\u0092\u0010s\u009b\u000b¿ÆéQÌéÝN*ÍB®v";
      int var8 = "çë\u0085\u0085¿\u0006á\u001fÐI6í-\u008d\u007f\u0019S¦à}%~\u0010Õ(6m\u0090µbi![\u0019\u0092¼Ç\u009bð'jx?|Û®:Ü\u0096Ë\u001e\u000fÝºË\u00068`H3Ì\tÏ\u00adå\u0010ëÃ)\u008a¹B¡l\u0082º\u0080Pú\u009e\u0004\u0092\u0010s\u009b\u000b¿ÆéQÌéÝN*ÍB®v"
         .length();
      char var5 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = d(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     g = var9;
                     h = new String[6];
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

                  var6 = "i'Á¨{\u009c+¼¢X\u000fd%_¾Ù\u0010\u001dÝâ?¶p\u0084Ò\u000438ªUÕ\u0013é";
                  var8 = "i'Á¨{\u009c+¼¢X\u000fd%_¾Ù\u0010\u001dÝâ?¶p\u0084Ò\u000438ªUÕ\u0013é".length();
                  var5 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20335;
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
            throw new RuntimeException("cc/astralis/dtc", var10);
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
         throw new RuntimeException("cc/astralis/dtc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
