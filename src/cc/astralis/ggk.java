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

public class ggk extends brc {
   private String cvd;
   private String fpc;
   private static int[] ftv;
   private static final String[] b;
   private static final long c = 129359546576336L;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;
   private static final long m;

   public ggk() {
      long a = c ^ 28486729011941L;
      short var10001 = 12947;
      long var10002 = 8200238724322789685L ^ a;
      super(108);
   }

   public ggk(String moduleName, String moduleDescription) {
      long ax = c ^ 137470388218019L;
      short var10001 = 16551;
      long var10002 = 1951684291614163269L ^ ax;
      super(108);
      a.cvd = a;
      a.fpc = a;
   }

   @Override
   public void etg(JsonObject json) {
      a.cps(a);
      String[] var2 = b;
      a.cvd = a.get(var2[0]).getAsString();
      a.fpc = a.get(var2[2]).getAsString();
   }

   @Override
   public String cql() {
      long a = c ^ 129956773087986L;
      int[] var10000 = dar.abu();
      long ax = m;
      JsonObject axx = a.fdo();
      String[] var10001 = bcy.drn();
      Object[] var10004 = new Object[4];
      String[] var8 = b;
      var10004[0] = var8[4];
      var10004[1] = a.cvd;
      var10004[2] = var8[5];
      var10004[3] = a.fpc;
      a.eqw(axx, var10004);
      String[] axxx = var10001;
      int[] axxxx = var10000;
      String var9 = fz.dvr(axx.toString(), cni.fsi(var8[3]), cni.fsi(var8[1]));
      var10001 = axxx;
      if (axxxx != null) {
         if (axxx != null) {
            return var9;
         }

         var10001 = new String[1];
      }

      cdr.apm(var10001);
      return var9;
   }

   public String bub() {
      return a.cvd;
   }

   public String he() {
      return a.fpc;
   }

   public static void ato(int[] var0) {
      ftv = var0;
   }

   public static int[] etc() {
      return ftv;
   }

   static {
      long var25 = c ^ 64685361688504L;
      Cipher var17;
      Cipher var10000 = var17 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var18 = 1; var18 < 8; var18++) {
         var10003[var18] = (byte)(var25 << var18 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var16 = new String[2];
      int var22 = 0;
      String var21 = "Õ½\u0097ý¾³\u008cØø\u0092|½óøú®éÅÉºôh:c þ3Ô/ÿÊØ\u0000õ'\rKþ\u0084Ù\u007f\u0089^\rpøÒ\u008f\u0092ô×U\u008bßJÑ6E\u0097NC\u0099\r\nA«»<\u008a\u001b\u0095&g\u0084jÙ j\u0014NU-0( \u001d#®pu\u0003¸<DÍ\u009eº£§4ºõ\u0019ÿ\u008a,ãü£öÌ\u0091×\u0014\fÈ\u008eªuÁ\u009dÁÜÜ,bà3¼r\u00adà$tPU\u007fNh´zw¡o\u0011\u0086s®\u009a\u0090\bÃ\u0095[¾\u001bÏl±û\u0018Kë>\u0090â+\u0087\u0014q\\Så!Á\r\u000f÷zZ\u0094Ó´à\u0099";
      int var23 = "Õ½\u0097ý¾³\u008cØø\u0092|½óøú®éÅÉºôh:c þ3Ô/ÿÊØ\u0000õ'\rKþ\u0084Ù\u007f\u0089^\rpøÒ\u008f\u0092ô×U\u008bßJÑ6E\u0097NC\u0099\r\nA«»<\u008a\u001b\u0095&g\u0084jÙ j\u0014NU-0( \u001d#®pu\u0003¸<DÍ\u009eº£§4ºõ\u0019ÿ\u008a,ãü£öÌ\u0091×\u0014\fÈ\u008eªuÁ\u009dÁÜÜ,bà3¼r\u00adà$tPU\u007fNh´zw¡o\u0011\u0086s®\u009a\u0090\bÃ\u0095[¾\u001bÏl±û\u0018Kë>\u0090â+\u0087\u0014q\\Så!Á\r\u000f÷zZ\u0094Ó´à\u0099"
         .length();
      char var20 = 160;
      int var19 = -1;

      while (true) {
         byte[] var24 = var17.doFinal(var21.substring(++var19, var19 + var20).getBytes("ISO-8859-1"));
         String var55 = b(var24).intern();
         int var10001 = -1;
         var16[var22++] = var55;
         if ((var19 += var20) >= var23) {
            i = new HashMap(13);
            Cipher var5;
            var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var6 = 1; var6 < 8; var6++) {
               var10003[var6] = (byte)(var25 << var6 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var11 = new long[14];
            int var8 = 0;
            String var9 = "zD\r6@Ðk\u008dìÁ^åçC$øsºè\\¢búÉ\u008eò\u0016&ý\u0003'\u009dÆ¶l\u009fçöÝ\fÌ½ö>Ý\u001fÞÇ³\u0088¥\u0095\u000eÙ\u0015·B¸·¯R#Åë\nep_\u001by\u0084\u009dõV1F±ï0°\u009e¿p*uîÙ\u0092ÛF·\u0012Qjg\u0083";
            int var10 = "zD\r6@Ðk\u008dìÁ^åçC$øsºè\\¢búÉ\u008eò\u0016&ý\u0003'\u009dÆ¶l\u009fçöÝ\fÌ½ö>Ý\u001fÞÇ³\u0088¥\u0095\u000eÙ\u0015·B¸·¯R#Åë\nep_\u001by\u0084\u009dõV1F±ï0°\u009e¿p*uîÙ\u0092ÛF·\u0012Qjg\u0083"
               .length();
            byte var7 = 0;

            label66:
            while (true) {
               var10001 = var7;
               var7 += 8;
               byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
               long[] var38 = var11;
               var10001 = var8++;
               long var58 = (var12[0] & 255L) << 56
                  | (var12[1] & 255L) << 48
                  | (var12[2] & 255L) << 40
                  | (var12[3] & 255L) << 32
                  | (var12[4] & 255L) << 24
                  | (var12[5] & 255L) << 16
                  | (var12[6] & 255L) << 8
                  | var12[7] & 255L;
               byte var66 = -1;

               while (true) {
                  long var13 = var58;
                  byte[] var15 = var5.doFinal(
                     new byte[]{
                        (byte)(var13 >>> 56),
                        (byte)(var13 >>> 48),
                        (byte)(var13 >>> 40),
                        (byte)(var13 >>> 32),
                        (byte)(var13 >>> 24),
                        (byte)(var13 >>> 16),
                        (byte)(var13 >>> 8),
                        (byte)var13
                     }
                  );
                  long var69 = (var15[0] & 255L) << 56
                     | (var15[1] & 255L) << 48
                     | (var15[2] & 255L) << 40
                     | (var15[3] & 255L) << 32
                     | (var15[4] & 255L) << 24
                     | (var15[5] & 255L) << 16
                     | (var15[6] & 255L) << 8
                     | var15[7] & 255L;
                  switch (var66) {
                     case 0:
                        var38[var10001] = var69;
                        if (var7 >= var10) {
                           g = var11;
                           h = new Integer[14];
                           Cipher var0;
                           var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                           var10002 = SecretKeyFactory.getInstance("DES");
                           var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                           for (int var1 = 1; var1 < 8; var1++) {
                              var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
                           }

                           var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                           long var2 = 8476695040626752633L;
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
                           long var61 = (var4[0] & 255L) << 56
                              | (var4[1] & 255L) << 48
                              | (var4[2] & 255L) << 40
                              | (var4[3] & 255L) << 32
                              | (var4[4] & 255L) << 24
                              | (var4[5] & 255L) << 16
                              | (var4[6] & 255L) << 8
                              | var4[7] & 255L;
                           byte var50 = -1;
                           m = var61;
                           short var40 = 1506;
                           long var51 = 8182360652130763542L ^ var25;
                           String[] var32 = new String[6];
                           int var30 = 0;
                           String var29;
                           int var31 = (var29 = var16[0]).length();
                           int[] var41 = new int[4];
                           char var28 = 4;
                           ato(var41);
                           int var36 = -1;

                           label50:
                           while (true) {
                              short var42 = 10989;
                              long var52 = 2151079907272977439L ^ var25;
                              byte var43 = 115;
                              String var53 = var29.substring(++var36, var36 + var28);
                              byte var62 = -1;

                              while (true) {
                                 String var44 = b(var43, b(var53));
                                 switch (var62) {
                                    case 0:
                                       var32[var30++] = var44;
                                       if ((var36 += var28) >= var31) {
                                          b = var32;
                                          return;
                                       }

                                       var28 = var29.charAt(var36);
                                       break;
                                    default:
                                       var32[var30++] = var44;
                                       if ((var36 += var28) < var31) {
                                          var28 = var29.charAt(var36);
                                          continue label50;
                                       }

                                       var31 = (var29 = var16[1]).length();
                                       var28 = 4;
                                       var36 = -1;
                                 }

                                 short var45 = 2768;
                                 long var54 = 108853082890849319L ^ var25;
                                 var43 = 95;
                                 var53 = var29.substring(++var36, var36 + var28);
                                 var62 = 0;
                              }
                           }
                        }
                        break;
                     default:
                        var38[var10001] = var69;
                        if (var7 < var10) {
                           continue label66;
                        }

                        var9 = "dþ\u0014{ÂíVÉQo|ú¶Ø\n¦";
                        var10 = "dþ\u0014{ÂíVÉQo|ú¶Ø\n¦".length();
                        var7 = 0;
                  }

                  byte var49 = var7;
                  var7 += 8;
                  var12 = var9.substring(var49, var7).getBytes("ISO-8859-1");
                  var38 = var11;
                  var10001 = var8++;
                  var58 = (var12[0] & 255L) << 56
                     | (var12[1] & 255L) << 48
                     | (var12[2] & 255L) << 40
                     | (var12[3] & 255L) << 32
                     | (var12[4] & 255L) << 24
                     | (var12[5] & 255L) << 16
                     | (var12[6] & 255L) << 8
                     | var12[7] & 255L;
                  var66 = 0;
               }
            }
         }

         var20 = var21.charAt(var19);
      }
   }

   private static char[] b(String var0) {
      long var1 = c ^ 90577511724390L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 25993;
         long var10005 = 8383708738507209122L ^ var1;
         var10000[0] = (char)(var10003 ^ 'P');
      }

      return var10000;
   }

   private static String b(int var0, char[] var1) {
      long var2 = c ^ 100690459442898L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 24000;
         long var10009 = 5161822245232855643L ^ var2;
         byte var10;
         switch (var4 % 7) {
            case 0:
               var10 = 10284;
               long var23 = 7220429789199810492L ^ var2;
               var10 = 91;
               break;
            case 1:
               var10 = 14830;
               long var22 = 3580024649520787063L ^ var2;
               var10 = 87;
               break;
            case 2:
               var10 = 31168;
               long var21 = 4360990553152745047L ^ var2;
               var10 = 103;
               break;
            case 3:
               var10 = 32608;
               long var20 = 2767144846474701050L ^ var2;
               var10 = 35;
               break;
            case 4:
               var10 = 8735;
               long var19 = 8120887529406576009L ^ var2;
               var10 = 88;
               break;
            case 5:
               var10 = 17808;
               long var18 = 8863162335382983170L ^ var2;
               var10 = 113;
               break;
            default:
               var10 = 22582;
               long var17 = 8020478521932599210L ^ var2;
               var10 = 80;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17561;
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
            throw new RuntimeException("cc/astralis/ggk", var14);
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
         throw new RuntimeException("cc/astralis/ggk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
