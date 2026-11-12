package cc.astralis;

import imgui.type.ImFloat;
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

public class hia extends guu {
   private final adu ata;
   private final bes dik;
   private final bes gas;
   private final bes asq;
   private static final long a = 129433976883677L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public hia() {
      long a = hia.a ^ 100848309671885L;
      super(bfm.PLAYER);
      short var10003 = 14769;
      long var10004 = 731341828148842728L ^ a;
      short var6 = 15357;
      long var10005 = 5047431053232001697L ^ a;
      String[] var10 = new String[2];
      short var10008 = 9937;
      long var10009 = 4955387714601963404L ^ a;
      var10[0] = "Normal";
      var10008 = 15357;
      var10009 = 5047431053232001697L ^ a;
      var10[1] = "Custom";
      a.ata = new adu("Mode", "Custom", var10);
      var10003 = 3100;
      var10004 = 6093516823251019074L ^ a;
      a.dik = (bes)new bes("Timer", 1.0F, 0.0F, 10.0F, 0.1F).bih(() -> {
         long ax = hia.a ^ 18332299192978L;
         short var10001 = 14725;
         long var10002 = 3977884306649525633L ^ ax;
         return a.ata.emb("Normal");
      });
      var10003 = 31785;
      var10004 = 5561814258362848630L ^ a;
      a.gas = (bes)new bes("Ground Timer", 1.0F, 0.0F, 10.0F, 0.1F).bih(() -> {
         long ax = hia.a ^ 42340444702608L;
         short var10001 = 26883;
         long var10002 = 7649197302096367622L ^ ax;
         return a.ata.emb("Custom");
      });
      var10003 = 18656;
      var10004 = 1699189821271581114L ^ a;
      a.asq = (bes)new bes("Air Timer", 1.0F, 0.0F, 10.0F, 0.1F).bih(() -> {
         long ax = hia.a ^ 20627071595557L;
         short var10001 = 15357;
         long var10002 = 5047509023910375753L ^ ax;
         return a.ata.emb("Custom");
      });
      a.bfi(new ffn[]{a.ata, a.dik, a.gas, a.asq});
   }

   @Override
   public void frg() {
      cdr.aal = 1.0F;
      super.frg();
   }

   @gdz
   public void arr(fxx event) {
      int[] ax;
      int var7;
      long axx = hia.a ^ 16277571241027L;
      int[] var10000 = dar.abu();
      String var5 = a.ata.dnp();
      byte var6 = -1;
      ax = var10000;
      var7 = var5.hashCode();
      label63:
      if (ax != null) {
         switch (var7) {
            case -1955878649:
               short var10001 = 9937;
               long var10002 = 4955445762010504194L ^ axx;
               var7 = var5.equals("Normal");
               if (ax == null) {
                  break label63;
               }

               if (var7 == 0) {
                  break;
               }

               var6 = 0;
               if (ax != null) {
                  break;
               }
            case 2029746065:
               short var9 = 15357;
               long var10 = 5047487045264326959L ^ axx;
               var7 = var5.equals("Custom");
               if (ax == null) {
                  break label63;
               }

               if (var7 != 0) {
                  var6 = 1;
               }
         }

         var7 = var6;
      }

      switch (var7) {
         case 0:
            cdr.aal = a.dik.dnp().floatValue();
            if (ax != null) {
               break;
            }
         case 1:
            Object var8 = chi.field_1724;
            if (ax != null) {
               if (chi.field_1724.method_24828()) {
                  cdr.aal = a.gas.dnp().floatValue();
                  if (ax != null) {
                     return;
                  }
               }

               var8 = a.asq.dnp();
            }

            cdr.aal = ((ImFloat)var8).floatValue();
      }
   }

   static {
      long var0 = a ^ 57274029462837L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "ó\u0014=Üh8¾&fB\u0081y\u008fÛ\u0011/\u0010\u00102[©ÖüsÌ\u0000\u0014U\u0003\u0086ÊÜØ\u0010b\u0087ª\u001d)P\u0000oôcéµ1\u0092\u001b2\u0018\u0097ë;\u0086\u001dl\u007f\u0005n\u0017\u0085\u0017Ò¤Gø$\u0082\u007f\u0080nàFø\u0010Î¬$J9\\ûü\u0004&?\u0019<\u0019\"*\u0010\u0082ÓÔ%¦\u0091\u009a^dCî\u0019Þ¹6ü";
      int var8 = "ó\u0014=Üh8¾&fB\u0081y\u008fÛ\u0011/\u0010\u00102[©ÖüsÌ\u0000\u0014U\u0003\u0086ÊÜØ\u0010b\u0087ª\u001d)P\u0000oôcéµ1\u0092\u001b2\u0018\u0097ë;\u0086\u001dl\u007f\u0005n\u0017\u0085\u0017Ò¤Gø$\u0082\u007f\u0080nàFø\u0010Î¬$J9\\ûü\u0004&?\u0019<\u0019\"*\u0010\u0082ÓÔ%¦\u0091\u009a^dCî\u0019Þ¹6ü"
         .length();
      char var5 = 16;
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
                     h = new String[8];
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

                  var6 = "6õ\u009eù\u0007/ïB\u0017ñ§Ý\u0004A½¸Çs0ß\u0017\u009aC¥>\u0016¹\u0086U\rEÒ\u001012b§~ø\u0007Cò\u0016Y\f#þ\u008fF";
                  var8 = "6õ\u009eù\u0007/ïB\u0017ñ§Ý\u0004A½¸Çs0ß\u0017\u009aC¥>\u0016¹\u0086U\rEÒ\u001012b§~ø\u0007Cò\u0016Y\f#þ\u008fF".length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14156;
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
            throw new RuntimeException("cc/astralis/hia", var10);
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
         throw new RuntimeException("cc/astralis/hia" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
