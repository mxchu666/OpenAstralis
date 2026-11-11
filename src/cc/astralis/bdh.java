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

public class bdh extends guu {
   public final gbp fsr;
   public final gbp ftx;
   public final gbp ecl;
   private static String ccj;
   private static final long a = 131147393111444L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public bdh() {
      long a = bdh.a ^ 23926625835099L;
      super(bfm.CLIENT);
      short var10003 = 12749;
      long var10004 = 5421647699683077267L ^ a;
      a.fsr = new gbp("Movement Correction", false);
      var10003 = 18491;
      var10004 = 4502988922673730916L ^ a;
      a.ftx = new gbp("Old Hit Box Offset", false);
      var10003 = 2777;
      var10004 = 5541580614475798405L ^ a;
      a.ecl = new gbp("Modern Hit Vec", true);
      a.bfi(new ffn[]{a.fsr, a.ftx, a.ecl});
   }

   public static void elr(String var0) {
      ccj = var0;
   }

   public static String hfl() {
      return ccj;
   }

   static {
      long var9 = a ^ 113953070458352L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "\f\u009d.^>{\u001a\u0098ôã&Ó\u0010ÄKE N\u001aL1Ú\u0011\u0016¼KyðÐàkî¨\u0085¼¿I\u0006\u001b\u00adÝÂ\u00928v-\u0093qÊ";
      int var6 = "\f\u009d.^>{\u001a\u0098ôã&Ó\u0010ÄKE N\u001aL1Ú\u0011\u0016¼KyðÐàkî¨\u0085¼¿I\u0006\u001b\u00adÝÂ\u00928v-\u0093qÊ".length();
      char var3 = 16;
      int var12 = -1;

      label33:
      while (true) {
         String var13 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var21 = d(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var21;
                  if ((var12 += var3) >= var6) {
                     g = var7;
                     h = new String[4];
                     if (hfl() != null) {
                        short var15 = 27984;
                        long var19 = 8994239530496101798L ^ var9;
                        elr("Em2wpb");
                     }

                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var21;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label33;
                  }

                  var4 = "\u0084\u0016/\u0006ô Ü óÊ,,q\u0012\u0016´\u0089jT¿¸\u001aô²\u000f©ËÎXû\u001c\u0014A¢\u001e\"-ü}Q(ßn[~\u009f\u0084\u000fÂ\u0099?xB¹ò\u0014\"%ô>\u0006ó´\u0098ût\u0092¤°\n§\\8C\bh\u008bê\u0094Ê\u0011";
                  var6 = "\u0084\u0016/\u0006ô Ü óÊ,,q\u0012\u0016´\u0089jT¿¸\u001aô²\u000f©ËÎXû\u001c\u0014A¢\u001e\"-ü}Q(ßn[~\u009f\u0084\u000fÂ\u0099?xB¹ò\u0014\"%ô>\u0006ó´\u0098ût\u0092¤°\n§\\8C\bh\u008bê\u0094Ê\u0011"
                     .length();
                  var3 = '(';
                  var12 = -1;
            }

            var13 = var4.substring(++var12, var12 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20626;
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
            throw new RuntimeException("cc/astralis/bdh", var10);
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
         throw new RuntimeException("cc/astralis/bdh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
