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

public class dve extends brc {
   private String dof;
   private static String erm;
   private static final String[] b;
   private static final long c = 83335819705038L;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public dve() {
      super(1);
   }

   public dve(String message) {
      super(1);
      a.dof = a;
   }

   @Override
   public void etg(JsonObject jsonObject) {
      a.cps(a);
      a.dof = a.get(b[0]).getAsString();
   }

   @Override
   public String cql() {
      JsonObject a = a.fdo();
      String[] var2 = b;
      a.dqb(a, var2[2], a.dof);
      return fz.dvr(a.toString(), cni.fsi(var2[1]), cni.fsi(var2[3]));
   }

   public String gyv() {
      return a.dof;
   }

   public static void hby(String var0) {
      erm = var0;
   }

   public static String bvt() {
      return erm;
   }

   static {
      long var20 = c ^ 68759146019245L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var20 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[3];
      int var17 = 0;
      String var16 = "a\u00ad\u000f{bîæ\u0081p, \u001am»g:ëÖ\u0087¡9¨³m_\u008c±\u0012Z\u001f\u0087\u0012\u0014¢;vÉ±®æåM*÷\f1Ê\u0088uG\u001d8]\u0089w¾Ü\rs\\Ð¶]Ð\u0084b\u0093ð\u0097E@BN8U:f\u001dýK¬\fåIjû\u0005å\u0094\u008aÊ(v,}5Wc\u0097\u001b|®\u009bÆ\u0097R(t\u0017ù<\u0093\u0004ÎpÜ\u0013´\u008a¯\u00148\u0005\u0019\rW£\u008c<åa\u0017å³×üG°\u0005\u0087æ mÉ\u000bý¢ÿ\u0093¦ \u0091\u000e\u0087vðÎçÎÝÅ°º\u0007ÒÉ7\u0017W\u0005â%N2º0gç";
      int var18 = "a\u00ad\u000f{bîæ\u0081p, \u001am»g:ëÖ\u0087¡9¨³m_\u008c±\u0012Z\u001f\u0087\u0012\u0014¢;vÉ±®æåM*÷\f1Ê\u0088uG\u001d8]\u0089w¾Ü\rs\\Ð¶]Ð\u0084b\u0093ð\u0097E@BN8U:f\u001dýK¬\fåIjû\u0005å\u0094\u008aÊ(v,}5Wc\u0097\u001b|®\u009bÆ\u0097R(t\u0017ù<\u0093\u0004ÎpÜ\u0013´\u008a¯\u00148\u0005\u0019\rW£\u008c<åa\u0017å³×üG°\u0005\u0087æ mÉ\u000bý¢ÿ\u0093¦ \u0091\u000e\u0087vðÎçÎÝÅ°º\u0007ÒÉ7\u0017W\u0005â%N2º0gç"
         .length();
      char var15 = '\b';
      int var14 = -1;

      while (true) {
         byte[] var19 = var12.doFinal(var16.substring(++var14, var14 + var15).getBytes("ISO-8859-1"));
         String var47 = b(var19).intern();
         int var10001 = -1;
         var11[var17++] = var47;
         if ((var14 += var15) >= var18) {
            i = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[12];
            int var3 = 0;
            String var4 = "º5Y\u0083\u0014\u0005\u0081\u0087\u00ad\" óÌCÝ\u001et\u00957B\u0099r\u0003ºyøë«ðè\u0089ÿ\u000bæÌi\u0093J\u0099Z.¤\"6á\r´\u008e<Þà0×\\R¦\u0007ÑêfP÷8)d.ûiÒ]òf\u0005n\u009c=\u0092³Za";
            int var5 = "º5Y\u0083\u0014\u0005\u0081\u0087\u00ad\" óÌCÝ\u001et\u00957B\u0099r\u0003ºyøë«ðè\u0089ÿ\u000bæÌi\u0093J\u0099Z.¤\"6á\r´\u008e<Þà0×\\R¦\u0007ÑêfP÷8)d.ûiÒ]òf\u0005n\u009c=\u0092³Za"
               .length();
            byte var2 = 0;

            label54:
            while (true) {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               long[] var33 = var6;
               var10001 = var3++;
               long var50 = (var7[0] & 255L) << 56
                  | (var7[1] & 255L) << 48
                  | (var7[2] & 255L) << 40
                  | (var7[3] & 255L) << 32
                  | (var7[4] & 255L) << 24
                  | (var7[5] & 255L) << 16
                  | (var7[6] & 255L) << 8
                  | var7[7] & 255L;
               byte var57 = -1;

               while (true) {
                  long var8 = var50;
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
                  long var59 = (var10[0] & 255L) << 56
                     | (var10[1] & 255L) << 48
                     | (var10[2] & 255L) << 40
                     | (var10[3] & 255L) << 32
                     | (var10[4] & 255L) << 24
                     | (var10[5] & 255L) << 16
                     | (var10[6] & 255L) << 8
                     | var10[7] & 255L;
                  switch (var57) {
                     case 0:
                        var33[var10001] = var59;
                        if (var2 >= var5) {
                           g = var6;
                           h = new Integer[12];
                           String[] var27 = new String[4];
                           int var25 = 0;
                           String var24;
                           int var26 = (var24 = var11[2]).length();
                           String var34 = var11[0];
                           short var43 = 28021;
                           long var52 = 8669087061252932639L ^ var20;
                           char var23 = 7;
                           hby(var34);
                           int var31 = -1;

                           label44:
                           while (true) {
                              short var35 = 11256;
                              long var44 = 3878209119543640720L ^ var20;
                              int var36 = 35;
                              String var45 = var24.substring(++var31, var31 + var23);
                              byte var53 = -1;

                              while (true) {
                                 String var37 = b(var36, b(var45));
                                 switch (var53) {
                                    case 0:
                                       var27[var25++] = var37;
                                       if ((var31 += var23) >= var26) {
                                          b = var27;
                                          return;
                                       }

                                       var23 = var24.charAt(var31);
                                       break;
                                    default:
                                       var27[var25++] = var37;
                                       if ((var31 += var23) < var26) {
                                          var23 = var24.charAt(var31);
                                          continue label44;
                                       }

                                       var26 = (var24 = var11[1]).length();
                                       short var38 = 28021;
                                       long var46 = 8669087061252932639L ^ var20;
                                       var23 = 7;
                                       var31 = -1;
                                 }

                                 var36 = a<"c">(25021, 4534385526265055454L ^ var20);
                                 var45 = var24.substring(++var31, var31 + var23);
                                 var53 = 0;
                              }
                           }
                        }
                        break;
                     default:
                        var33[var10001] = var59;
                        if (var2 < var5) {
                           continue label54;
                        }

                        var4 = "ùºõÐv°D©\u00ad\u008a^\u0006Íì}1";
                        var5 = "ùºõÐv°D©\u00ad\u008a^\u0006Íì}1".length();
                        var2 = 0;
                  }

                  byte var42 = var2;
                  var2 += 8;
                  var7 = var4.substring(var42, var2).getBytes("ISO-8859-1");
                  var33 = var6;
                  var10001 = var3++;
                  var50 = (var7[0] & 255L) << 56
                     | (var7[1] & 255L) << 48
                     | (var7[2] & 255L) << 40
                     | (var7[3] & 255L) << 32
                     | (var7[4] & 255L) << 24
                     | (var7[5] & 255L) << 16
                     | (var7[6] & 255L) << 8
                     | var7[7] & 255L;
                  var57 = 0;
               }
            }
         }

         var15 = var16.charAt(var14);
      }
   }

   private static char[] b(String var0) {
      long var1 = c ^ 51755667130091L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 11487;
         long var10005 = 7437165448623127289L ^ var1;
         var10000[0] = (char)(var10003 ^ 'T');
      }

      return var10000;
   }

   private static String b(int var0, char[] var1) {
      long var2 = c ^ 125210387259808L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         byte var10;
         switch (var4 % a<"c">(28953, 114372906967990390L ^ var2)) {
            case 0:
               var10 = 31262;
               long var22 = 8683991967802788722L ^ var2;
               var10 = 122;
               break;
            case 1:
               var10 = 9730;
               long var21 = 4827814375576819552L ^ var2;
               var10 = 82;
               break;
            case 2:
               var10 = 8149;
               long var20 = 5137345472656043700L ^ var2;
               var10 = 110;
               break;
            case 3:
               var10 = 6575;
               long var19 = 8573600832900753609L ^ var2;
               var10 = 29;
               break;
            case 4:
               var10 = 26885;
               long var18 = 4144495003474794593L ^ var2;
               var10 = 106;
               break;
            case 5:
               var10 = 32513;
               long var17 = 4494295205021847137L ^ var2;
               var10 = 63;
               break;
            default:
               var10 = 18502;
               long var10008 = 3087629367617272101L ^ var2;
               var10 = 84;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27146;
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
            throw new RuntimeException("cc/astralis/dve", var14);
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
         throw new RuntimeException("cc/astralis/dve" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
