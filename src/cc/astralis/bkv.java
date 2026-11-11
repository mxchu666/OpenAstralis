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

public class bkv extends fso {
   private static final long a = 72859863775204L;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public bkv() {
      long a = bkv.a ^ 6307343864627L;
      String[] var10001 = new String[2];
      short var10004 = 30413;
      long var10005 = 6754153330523631018L ^ a;
      var10001[0] = "toggle";
      var10001[1] = "t";
      short var10002 = 21557;
      long var10003 = 1375346014989733713L ^ a;
      super(var10001, "Toggles Modules (.toggle <module>)");
   }

   @Override
   public void aov(String[] args, String message) {
      long ax = bkv.a ^ 86552604937521L;
      int[] var10000 = dar.abu();
      String[] axx = a.split(" ");
      int[] axxx = var10000;
      if (axxx != null) {
         if (a.length >= 1) {
            label27: {
               guu axxxx = dar.gqy().aws().gvx(axx[1]);
               guu var9 = axxxx;
               if (axxx != null) {
                  if (axxxx == null) {
                     break label27;
                  }

                  axxxx.gxo();
                  var9 = axxxx;
               }

               String var10 = var9.clp();
               short var12 = 27708;
               long var10002 = 8106100169109039451L ^ ax;
               short var14 = 14320;
               long var10003 = 3924426372445778577L ^ ax;
               bpa.dhu("Toggled " + var10 + " module.");
               if (axxx != null) {
                  return;
               }
            }

            short var11 = 15058;
            long var13 = 6594875412712439734L ^ ax;
            bpa.dhu("Module not found.");
            return;
         }

         short var8 = 28936;
         long var10001 = 7525028445100274792L ^ ax;
         bpa.dhu("Wrong Usage .t <Module>");
      }
   }

   static {
      long var0 = a ^ 102510777729801L;
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
      String var6 = "ì\"b\u0001Á\u001d'zQCuçðmÏÆðí!\u0086/ù)\u009aî¾3§\nî#7!wÎ\u0081°³¹\u008e\u0010ýkKP^9\u0088Ër¶|Ó_\u009cá;@\u0095[ø¯\u008f=OÃ\tC §ñUO_pDV\u0095\u0091Åÿõ¥\u0081*ª1Ò(cè\u0011\u009bE\u0096\u0017â\u0099\u0007\u0014Çf`«\np\u00975ò®3\u0099W\u0002K\u0019ÎÓ\t¹n÷\u0018#Þm \u0081%\u000b71s»Ám]\b³\t\u0095÷½\u0093\u001bOj";
      int var8 = "ì\"b\u0001Á\u001d'zQCuçðmÏÆðí!\u0086/ù)\u009aî¾3§\nî#7!wÎ\u0081°³¹\u008e\u0010ýkKP^9\u0088Ër¶|Ó_\u009cá;@\u0095[ø¯\u008f=OÃ\tC §ñUO_pDV\u0095\u0091Åÿõ¥\u0081*ª1Ò(cè\u0011\u009bE\u0096\u0017â\u0099\u0007\u0014Çf`«\np\u00975ò®3\u0099W\u0002K\u0019ÎÓ\t¹n÷\u0018#Þm \u0081%\u000b71s»Ám]\b³\t\u0095÷½\u0093\u001bOj"
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
                     c = var9;
                     d = new String[6];
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

                  var6 = "\u001dv\u0001Þá0GpÀ£Vµ«¤OunÙWÿzÈð\u0088A\u008aXç\u00199Àºï?!_×\u0088\u0087\u0093\u0018£Òc\u001a,·=M\u0003Uaã.½5\u0087\u0018\u000eÁ#Ã[\u0086¶";
                  var8 = "\u001dv\u0001Þá0GpÀ£Vµ«¤OunÙWÿzÈð\u0088A\u008aXç\u00199Àºï?!_×\u0088\u0087\u0093\u0018£Òc\u001a,·=M\u0003Uaã.½5\u0087\u0018\u000eÁ#Ã[\u0086¶"
                     .length();
                  var5 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32689;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/bkv", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("cc/astralis/bkv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
