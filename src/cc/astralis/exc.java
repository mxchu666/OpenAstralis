package cc.astralis;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
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

public class exc {
   @Expose
   @SerializedName("items")
   private bac[] ejy;
   private static final long a = 69840807849739L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private boolean dnv() {
      long a = exc.a ^ 14959521927782L;
      boolean ax = false;
      int[] var10000 = dar.abu();
      boolean axx = false;
      bac[] var6 = a.ejy;
      int var7 = var6.length;
      int[] axxx = var10000;
      int var8 = 0;

      while (true) {
         if (var8 < var7) {
            bac axxxx = var6[var8];
            short var10001 = 3733;
            long var10002 = 3787318957990796842L ^ a;
            var10 = axxxx.gpl.equals("product_minecraft");
            if (axxx == null) {
               break;
            }

            label70: {
               if (axxx != null) {
                  if (var10) {
                     ax = true;
                     if (axxx != null) {
                        break label70;
                     }
                  }

                  var10001 = 13565;
                  var10002 = 470507365934654531L ^ a;
                  var10 = axxxx.gpl.equals("game_minecraft");
               }

               if (axxx != null) {
                  if (!var10) {
                     break label70;
                  }

                  var10 = true;
               }

               axx = var10;
            }

            var8++;
            if (axxx != null) {
               continue;
            }
         }

         var10 = ax;
         break;
      }

      if (axxx != null) {
         if (!var10) {
            return false;
         }

         var10 = axx;
      }

      return axxx == null ? var10 : var10;
   }

   static {
      long var0 = a ^ 50244431972790L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "õZ\b/\nãæ\u009a\u0093@¶\tEµ\u0095+å0\u0002Ï\u0091ç_\u0087ÀÓ0O½6àØ(½\u0017OÈ\u001f°®?TÕ\u0005®±\u008b±Ôu\u0092\u0010þnK\u0094\"\u009f÷\u009b\u0083ãE$\u0086yýà«<?\u0004\u001b";
      int var8 = "õZ\b/\nãæ\u009a\u0093@¶\tEµ\u0095+å0\u0002Ï\u0091ç_\u0087ÀÓ0O½6àØ(½\u0017OÈ\u001f°®?TÕ\u0005®±\u008b±Ôu\u0092\u0010þnK\u0094\"\u009f÷\u009b\u0083ãE$\u0086yýà«<?\u0004\u001b"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11731;
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
            throw new RuntimeException("cc/astralis/exc", var10);
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
         throw new RuntimeException("cc/astralis/exc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
