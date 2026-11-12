package cc.astralis;

import com.google.gson.JsonObject;
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

public class aki extends brc {
   private long dhu;
   private long cqo;
   private static int[] fza;
   private static final String[] b;
   private static final long c = 76355694394822L;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public aki() {
      long a = c ^ 108849259470249L;
      short var10001 = 6201;
      long var10002 = 8099823419335375995L ^ a;
      super(7);
   }

   @Override
   public void etg(JsonObject jsonObject) {
      a.cps(a);
      a.cqo = a.get(b[0]).getAsLong();
      a.dhu = System.currentTimeMillis();
   }

   @Override
   public String cql() {
      JsonObject a = a.fdo();
      String var10000 = a.toString();
      String[] var2 = b;
      return fz.dvr(var10000, cni.fsi(var2[1]), cni.fsi(var2[2]));
   }

   public long gy() {
      return a.dhu;
   }

   public long gsl() {
      return a.cqo;
   }

   public static void fmu(int[] var0) {
      fza = var0;
   }

   public static int[] gdv() {
      return fza;
   }

   static {
      long var15 = c ^ 40930484627463L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var15 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var14 = var12.doFinal(
         "¾æP\u0011º¢(X\u0086]\u0011\u0094\u001fòªIØ%µ×87îÍjèë(XtJ®'8\u001e}>u<\u001fZ\u0099Çâýp\u0099\u000b\u00adâ\u001fw·\u007fÜG|µíg©Ü\u001bÛ\u0083\fÔµ4Èá\u001fèÓþ©\u0099\u008aÈ1å\u000b/d\u0080y R\bó´`µÒc¸7\u0011\u0011ÅQ\u008c$\u001bÍV!VìéA\u0094¬Ï\u0080A\u009a\u008c*©¹ªQ5ä\u0081´Z(\u0001\u0097S\u0014È»\u0087\u0082ð\u0010^ô\u0002Oà.ä~SlWW "
            .getBytes("ISO-8859-1")
      );
      String var36 = b(var14).intern();
      int var10001 = -1;
      String var11 = var36;
      i = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var15 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[12];
      int var3 = 0;
      String var4 = "ÕðÑ~Å/\u009f,ÂÅþ\u0096\u008f,'\u0003?ûG?\u0005\u008b\u0013Qç\u000f\u0098\u001c&4G\t!®\u0017Úb\u0094Ì\u0018f$A\u008a\u0083Gâ\"Ô¼\u0014\u001c\u001eÆÔ'\u009f\u0011õæ0ñ°¢D~åÉöÊÍe¢ Ñ%\u009a\u0096Ñþ";
      int var5 = "ÕðÑ~Å/\u009f,ÂÅþ\u0096\u008f,'\u0003?ûG?\u0005\u008b\u0013Qç\u000f\u0098\u001c&4G\t!®\u0017Úb\u0094Ì\u0018f$A\u008a\u0083Gâ\"Ô¼\u0014\u001c\u001eÆÔ'\u009f\u0011õæ0ñ°¢D~åÉöÊÍe¢ Ñ%\u009a\u0096Ñþ"
         .length();
      byte var2 = 0;

      label40:
      while (true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var26 = var6;
         var10001 = var3++;
         long var38 = (var7[0] & 255L) << 56
            | (var7[1] & 255L) << 48
            | (var7[2] & 255L) << 40
            | (var7[3] & 255L) << 32
            | (var7[4] & 255L) << 24
            | (var7[5] & 255L) << 16
            | (var7[6] & 255L) << 8
            | var7[7] & 255L;
         byte var43 = -1;

         while (true) {
            long var8 = var38;
            byte[] var10 = var0.doFinal(
               new byte[]{
                  (byte)(var8 >>> 56),
                  (byte)(var8 >>> 48),
                  (byte)(var8 >>> 40),
                  (byte)(var8 >>> 32),
                  (byte)(var8 >>> 24),
                  (byte)(var8 >>> 16),
                  (byte)(var8 >>> 8),
                  (byte)var8
               }
            );
            long var45 = (var10[0] & 255L) << 56
               | (var10[1] & 255L) << 48
               | (var10[2] & 255L) << 40
               | (var10[3] & 255L) << 32
               | (var10[4] & 255L) << 24
               | (var10[5] & 255L) << 16
               | (var10[6] & 255L) << 8
               | var10[7] & 255L;
            switch (var43) {
               case 0:
                  var26[var10001] = var45;
                  if (var2 >= var5) {
                     g = var6;
                     h = new Integer[12];
                     String[] var22 = new String[3];
                     short var27 = 8193;
                     int var20 = 0;
                     fmu(null);
                     long var32 = 8008626376571269614L ^ var15;
                     String var19 = var11;
                     int var21 = var11.length();
                     char var18 = '\b';
                     int var17 = -1;

                     while (true) {
                        short var28 = 29158;
                        long var33 = 1351018473954926594L ^ var15;
                        String var40 = b(71, b(var19.substring(++var17, var17 + var18)));
                        byte var34 = -1;
                        var22[var20++] = var40;
                        if ((var17 += var18) >= var21) {
                           b = var22;
                           return;
                        }

                        var18 = var19.charAt(var17);
                     }
                  }
                  break;
               default:
                  var26[var10001] = var45;
                  if (var2 < var5) {
                     continue label40;
                  }

                  var4 = "ÎÅ\u008f\u001e¿\u0007\u0007VðúÖÍ\u0086P\u0087ï";
                  var5 = "ÎÅ\u008f\u001e¿\u0007\u0007VðúÖÍ\u0086P\u0087ï".length();
                  var2 = 0;
            }

            byte var31 = var2;
            var2 += 8;
            var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
            var26 = var6;
            var10001 = var3++;
            var38 = (var7[0] & 255L) << 56
               | (var7[1] & 255L) << 48
               | (var7[2] & 255L) << 40
               | (var7[3] & 255L) << 32
               | (var7[4] & 255L) << 24
               | (var7[5] & 255L) << 16
               | (var7[6] & 255L) << 8
               | var7[7] & 255L;
            var43 = 0;
         }
      }
   }

   private static char[] b(String var0) {
      long var1 = c ^ 90823167843605L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 3796;
         long var10005 = 6987949299007662639L ^ var1;
         var10000[0] = (char)(var10003 ^ 'e');
      }

      return var10000;
   }

   private static String b(int var0, char[] var1) {
      long var2 = c ^ 71447112478577L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 6461;
         long var10009 = 7854306356061425569L ^ var2;
         byte var10;
         switch (var4 % 7) {
            case 0:
               var10 = 26081;
               long var23 = 1247966005410116464L ^ var2;
               var10 = 112;
               break;
            case 1:
               var10 = 24029;
               long var22 = 7552536586335587136L ^ var2;
               var10 = 38;
               break;
            case 2:
               var10 = 9953;
               long var21 = 1638906764320534650L ^ var2;
               var10 = 14;
               break;
            case 3:
               var10 = 29271;
               long var20 = 6280533140855694537L ^ var2;
               var10 = 30;
               break;
            case 4:
               var10 = 3030;
               long var19 = 52916266936425806L ^ var2;
               var10 = 112;
               break;
            case 5:
               var10 = 22322;
               long var18 = 8496864053578498466L ^ var2;
               var10 = 44;
               break;
            default:
               var10 = 9831;
               long var17 = 7522656690192740596L ^ var2;
               var10 = 101;
         }

         var10001[var4] = (char)(var10005 ^ var10002 ^ var10);
      }

      return new String(var10001).intern();
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17452;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/aki", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
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
         throw new RuntimeException("cc/astralis/aki" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
