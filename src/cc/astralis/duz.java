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

public final class duz {
   private final int alg;
   private final int agj;
   private final int bom;
   private final int gpv;
   private final int dx;
   private final fua ecm;
   private static final long a = 93342062827759L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private duz(ara a) {
      a.alg = a.fna;
      a.agj = a.ehj;
      a.bom = a.ear;
      a.gpv = a.bub;
      a.dx = a.djw;
      a.ecm = a.ahu;
      a.gxw();
   }

   private void gxw() {
      long a;
      label72: {
         a = duz.a ^ 43949873290713L;
         int[] var3 = dar.abu();
         int var10000 = a.alg;
         if (var3 != null) {
            if (a.alg <= 0) {
               break label72;
            }

            var10000 = a.agj;
         }

         if (var3 != null) {
            if (var10000 <= 0) {
               break label72;
            }

            var10000 = a.bom;
         }

         if (var3 != null) {
            if (var10000 < 1) {
               short var7 = 5894;
               long var11 = 289528737072018816L ^ a;
               throw new IllegalArgumentException("samples must be >= 1");
            }

            var10000 = a.gpv;
         }

         label73: {
            if (var3 != null) {
               if (var10000 < 0) {
                  short var6 = 16157;
                  long var10 = 7795977369965747608L ^ a;
                  throw new IllegalArgumentException("stencilBits must be >= 0");
               }

               var4 = a;
               if (var3 == null) {
                  break label73;
               }

               var10000 = a.dx;
            }

            if (var10000 < 0) {
               short var10002 = 5248;
               long var10003 = 5598922612466775556L ^ a;
               throw new IllegalArgumentException("framebufferId must be >= 0");
            }

            var4 = a;
         }

         if (var4.ecm == null) {
            short var5 = 1225;
            long var9 = 6568888119050266187L ^ a;
            throw new IllegalArgumentException("framebufferFormat must not be null");
         }

         return;
      }

      short var8 = 22969;
      long var12 = 8652689291780537150L ^ a;
      throw new IllegalArgumentException("width/height must be > 0");
   }

   public static ara eqv(int width, int height) {
      return new ara(a, a);
   }

   public int gqz() {
      return a.alg;
   }

   public int bqx() {
      return a.agj;
   }

   public int cjo() {
      return a.bom;
   }

   public int cjq() {
      return a.gpv;
   }

   public int bmo() {
      return a.dx;
   }

   public fua frs() {
      return a.ecm;
   }

   static {
      long var0 = a ^ 82913170130964L;
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
      String var6 = "ñ\u0007)2\u008b\u001f~¾\u009d¦\u0006¤f\u001d°.\u0018\u0081\\ÒåµìCï\u0090lÏCòqNÓÞ¡jçÛå\u008509÷{§\u009a\u001foM±\u0080\u0011p\u0088\u0016Nà%\u000b{ÒßÓ·`°@±Õ0¿\u009b\u0086b\u0095¡w¾÷ì\"ãø,\n</åA8*¥¹rc(yØÞ%¼u\u0097\u001eh\u0083#¯\u0005³Ð\u0090q¿\u008aÖ#åpÃ\u009bNy²#\u00117Uï\u000eá'·\u0086\u0014ËTîPõ¥\u0017Ú\u0086\u0085\b";
      int var8 = "ñ\u0007)2\u008b\u001f~¾\u009d¦\u0006¤f\u001d°.\u0018\u0081\\ÒåµìCï\u0090lÏCòqNÓÞ¡jçÛå\u008509÷{§\u009a\u001foM±\u0080\u0011p\u0088\u0016Nà%\u000b{ÒßÓ·`°@±Õ0¿\u009b\u0086b\u0095¡w¾÷ì\"ãø,\n</åA8*¥¹rc(yØÞ%¼u\u0097\u001eh\u0083#¯\u0005³Ð\u0090q¿\u008aÖ#åpÃ\u009bNy²#\u00117Uï\u000eá'·\u0086\u0014ËTîPõ¥\u0017Ú\u0086\u0085\b"
         .length();
      char var5 = '(';
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
                     b = var9;
                     c = new String[5];
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

                  var6 = "\u008e\u0019¼M»J \u0017\u008a\u0007v\u0012\u008da\u007fZèI/)¦\u000f®\u0007R\u0084K{\u0086mÁN\u0089\u0014Wý<?\u008b}A^·MY[]\u0087@Òg\rÁ\u0082\u0083wö;Ù\u0012Ùn\u000fxÈj\u0018~±ÙC\u0091,üAzj\u009e\u007fdå\u001d\u001e%\u0001óþ\u0005«ålØ\u009cTÎÌYÌ\nÂ\u0091\u009bsÈ£EfD9`\u0002å¦";
                  var8 = "\u008e\u0019¼M»J \u0017\u008a\u0007v\u0012\u008da\u007fZèI/)¦\u000f®\u0007R\u0084K{\u0086mÁN\u0089\u0014Wý<?\u008b}A^·MY[]\u0087@Òg\rÁ\u0082\u0083wö;Ù\u0012Ùn\u000fxÈj\u0018~±ÙC\u0091,üAzj\u009e\u007fdå\u001d\u001e%\u0001óþ\u0005«ålØ\u009cTÎÌYÌ\nÂ\u0091\u009bsÈ£EfD9`\u0002å¦"
                     .length();
                  var5 = '0';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26544;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/duz", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("cc/astralis/duz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
