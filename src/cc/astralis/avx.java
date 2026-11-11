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

public class avx extends guu {
   public final gbp dpg;
   public final gbp gav;
   public final gbp ccp;
   public final gbp dzj;
   public final gbp czi;
   private static final long a = 115885606831329L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public avx() {
      long a = avx.a ^ 19765308796088L;
      super(bfm.COMBAT);
      short var10003 = 29418;
      long var10004 = 3789135051131045465L ^ a;
      a.dpg = new gbp("Removes Attack Cooldown", true);
      var10003 = 1410;
      var10004 = 5749440688687132983L ^ a;
      a.gav = new gbp("Removes your attack on miss", true);
      var10003 = 15977;
      var10004 = 2875015269633166041L ^ a;
      a.ccp = new gbp("Weapon Only", true);
      var10003 = 21528;
      var10004 = 2186356839651795114L ^ a;
      a.dzj = new gbp("Allow Block Hit", false);
      var10003 = 21856;
      var10004 = 4703010386198389201L ^ a;
      a.czi = new gbp("Allow Air Hit", false);
      a.bfi(new ffn[]{a.dpg, a.gav, a.ccp, a.dzj, a.czi});
   }

   static {
      long var0 = a ^ 97333593558L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "D¶XÜà\u0016un¤ÞÞRÖk\u0086_G¾ñm?ø3Î`;\u008b\u0016?\u0010\u0014ì KÜMÃ\u0010¼\u0016j\u009b\fÒ©ê\u0018^Íÿ\u0011]\u0002ô)\u0092å\u008d\u008e¾s\u001b\u009c]u(i\u00114ìúXµ\u009dÀÔ±Cj\u0081C\u0080\\\u0090tW\u0086(\u0099¢\t¾\u00072\u0085ff4ÅéÑ7Y\u0082\u001fO";
      int var8 = "D¶XÜà\u0016un¤ÞÞRÖk\u0086_G¾ñm?ø3Î`;\u008b\u0016?\u0010\u0014ì KÜMÃ\u0010¼\u0016j\u009b\fÒ©ê\u0018^Íÿ\u0011]\u0002ô)\u0092å\u008d\u008e¾s\u001b\u009c]u(i\u00114ìúXµ\u009dÀÔ±Cj\u0081C\u0080\\\u0090tW\u0086(\u0099¢\t¾\u00072\u0085ff4ÅéÑ7Y\u0082\u001fO"
         .length();
      char var5 = ' ';
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
                     h = new String[5];
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

                  var6 = "£®\f\u0084\u000f2~Ñy&\u008f\u0019\u0001H+¨XjS§30¿/0¾\u009d\u0006.\r\u0092¨DpþnÏf\u0002\u001b\u0084\u0097\u0001\u0091ùSK¸_\u0099f?/\r\u0004\u0085`ñ\u0003ß\u0000|\u0012\u0093j\u0019Ã'´\nSÍ\u009f";
                  var8 = "£®\f\u0084\u000f2~Ñy&\u008f\u0019\u0001H+¨XjS§30¿/0¾\u009d\u0006.\r\u0092¨DpþnÏf\u0002\u001b\u0084\u0097\u0001\u0091ùSK¸_\u0099f?/\r\u0004\u0085`ñ\u0003ß\u0000|\u0012\u0093j\u0019Ã'´\nSÍ\u009f"
                     .length();
                  var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7400;
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
            throw new RuntimeException("cc/astralis/avx", var10);
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
         throw new RuntimeException("cc/astralis/avx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
