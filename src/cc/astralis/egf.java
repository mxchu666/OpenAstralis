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

public class egf extends brc {
   private int dnp;
   private static cdr[] ezs;
   private static final String[] b;
   private static final long c = 122132674101488L;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public egf() {
      long a = c ^ 128845265258348L;
      short var10001 = 8060;
      long var10002 = 5277761748000798950L ^ a;
      super(12);
   }

   public egf(int configId) {
      long ax = c ^ 21298673153823L;
      short var10001 = 25480;
      long var10002 = 6223622254657483878L ^ ax;
      super(12);
      a.dnp = a;
   }

   @Override
   public void etg(JsonObject json) {
      a.cps(a);
      a.dnp = a.get(b[2]).getAsInt();
   }

   @Override
   public String cql() {
      JsonObject a = a.fdo();
      a.eqw(a, new Object[]{a.dnp});
      String var10000 = a.toString();
      String[] var2 = b;
      return fz.dvr(var10000, cni.fsi(var2[1]), cni.fsi(var2[0]));
   }

   public int gkh() {
      return a.dnp;
   }

   public static void emx(cdr[] var0) {
      ezs = var0;
   }

   public static cdr[] aom() {
      return ezs;
   }

   static {
      long var15 = c ^ 104298462557404L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var15 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var14 = var12.doFinal(
         "C\u0090®~ä³i¢èüùÅÁÕ\u009c¨ÕÃÍ\u0006\u009d\u001b©ZcøU\\Ë\u0085Õ7¢\u000eÀfKÉ\u001567b¦Ã\u0017ªEÀ:Í\u009b\u0001C\u00168Kaîëé±Åp\th\u0004 \u0015\u0089Vå\u001dú²ëNT~Û0Q\u0098\u0095\u009b-HéVIe\u009a(\u009f\u008a\u000fv¢Ê\u001f\"-àI\u009ej\u009a;Ø¾þw¯ÓÇhá!Bé×F¬ë\u0085Do<JXvc\nÇ\u0010\u0003Åòçáðd\u0012þyqðJÔ#P'H2©H\u00187\\\u0089d"
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
      long[] var6 = new long[11];
      int var3 = 0;
      String var4 = "!\u0082\u001eC\u0013å8¤\r\u001e6ÔR\u001e_N}¡\u0003é9÷\u0002í4â\u009cr\u0084\u0081\u0094ª\u009d\u0092\u0088QÉÒT\\\u007fù¨\u0005\u001d-\u001c_ãÐ>6Ú(¨\u001e[\u007fd\f\u001aÊ\u0091|\u001a\u0098®³B\u0002\")";
      int var5 = "!\u0082\u001eC\u0013å8¤\r\u001e6ÔR\u001e_N}¡\u0003é9÷\u0002í4â\u009cr\u0084\u0081\u0094ª\u009d\u0092\u0088QÉÒT\\\u007fù¨\u0005\u001d-\u001c_ãÐ>6Ú(¨\u001e[\u007fd\f\u001aÊ\u0091|\u001a\u0098®³B\u0002\")"
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
         byte var44 = -1;

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
            long var46 = (var10[0] & 255L) << 56
               | (var10[1] & 255L) << 48
               | (var10[2] & 255L) << 40
               | (var10[3] & 255L) << 32
               | (var10[4] & 255L) << 24
               | (var10[5] & 255L) << 16
               | (var10[6] & 255L) << 8
               | var10[7] & 255L;
            switch (var44) {
               case 0:
                  var26[var10001] = var46;
                  if (var2 >= var5) {
                     g = var6;
                     h = new Integer[11];
                     String[] var22 = new String[3];
                     cdr[] var27 = new cdr[3];
                     int var20 = 0;
                     String var19 = var11;
                     int var21 = var11.length();
                     short var32 = 17639;
                     long var40 = 2521177389257740480L ^ var15;
                     char var18 = '`';
                     emx(var27);
                     int var17 = -1;

                     while (true) {
                        short var28 = 31836;
                        long var33 = 4729235355199334516L ^ var15;
                        String var41 = b(61, b(var19.substring(++var17, var17 + var18)));
                        byte var34 = -1;
                        var22[var20++] = var41;
                        if ((var17 += var18) >= var21) {
                           b = var22;
                           return;
                        }

                        var18 = var19.charAt(var17);
                     }
                  }
                  break;
               default:
                  var26[var10001] = var46;
                  if (var2 < var5) {
                     continue label40;
                  }

                  var4 = "Ñ*9(ª\u0090ÀÃ¿Ï\u007f1eh\u0092ü";
                  var5 = "Ñ*9(ª\u0090ÀÃ¿Ï\u007f1eh\u0092ü".length();
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
            var44 = 0;
         }
      }
   }

   private static char[] b(String var0) {
      long var1 = c ^ 38242541704144L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   private static String b(int var0, char[] var1) {
      long var2 = c ^ 116384486586803L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 25183;
         long var10009 = 3902195872104364822L ^ var2;
         var10001[var4] = (char)(var10005 ^ var10002 ^ switch (var4 % 7) {
            case 0 -> {
               short var15 = 6026;
               long var21 = 7807986374268800704L ^ var2;
               yield 61;
            }
            case 1 -> {
               short var14 = 1273;
               long var20 = 8440545346886131135L ^ var2;
               yield 42;
            }
            case 2 -> {
               short var13 = 3963;
               long var19 = 2446717343455532603L ^ var2;
               yield 34;
            }
            case 3 -> {
               short var12 = 11617;
               long var18 = 3510974329810088992L ^ var2;
               yield 111;
            }
            case 4 -> {
               short var11 = 18778;
               long var17 = 6398256745696432158L ^ var2;
               yield 31;
            }
            case 5 -> {
               short var10 = 6654;
               long var16 = 6878293243106115773L ^ var2;
               yield 13;
            }
            default -> 4;
         });
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24579;
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
            throw new RuntimeException("cc/astralis/egf", var14);
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
         throw new RuntimeException("cc/astralis/egf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
