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
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_310;
import net.minecraft.class_5250;
import net.minecraft.class_746;

public class bpa implements dlc {
   private static String[] dyf;
   private static final long a = 328666661901L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static void dhu(Object message) {
      long ax = bpa.a ^ 7578634929766L;
      int[] var3 = dar.abu();
      class_310 var10000 = chi;
      if (var3 != null) {
         if (chi.field_1724 == null) {
            return;
         }

         var10000 = chi;
      }

      if (var3 != null) {
         if (var10000.field_1687 == null) {
            return;
         }

         var10000 = chi;
      }

      class_746 var4 = var10000.field_1724;
      short var10001 = 8900;
      long var10002 = 1647453986783078679L ^ ax;
      class_5250 var5 = alb("Astralis", dar.gqy().deo().getRGB(), dar.gqy().cxj().getRGB());
      String var6 = String.valueOf(a);
      short var10003 = 23818;
      long var10004 = 243547890222290648L ^ ax;
      var4.method_7353(var5.method_27693(" » " + var6), false);
   }

   public static void bez(Object message) {
      long ax = bpa.a ^ 34193282613605L;
      int[] var3 = dar.abu();
      Object var10000 = dar.gqy().aws().diy(dxc.class);
      if (var3 != null) {
         if (!((dxc)var10000).dsv()) {
            return;
         }

         var10000 = a;
      }

      dhu(var10000);
   }

   public static class_5250 alb(String message, int firstColor, int secondColor) {
      long ax = bpa.a ^ 56950682075184L;
      int[] var10000 = dar.abu();
      class_5250 axx = class_2561.method_43473();
      axx.method_27693(class_124.field_1063 + "[");
      int axxx = 0;
      int[] axxxx = var10000;

      while (true) {
         if (axxx < a.length()) {
            float axxxxx = (float)(a.length() - 1 - axxx) / (a.length() - 1);
            class_2583 axxxxxx = class_2583.field_24360.method_36139(dec.bw(a, a, axxxxx));
            axx.method_10852(class_2561.method_43470(String.valueOf(a.charAt(axxx))).method_10862(axxxxxx));
            axxx++;
            if (axxxx == null) {
               break;
            }

            if (axxxx != null) {
               continue;
            }
         }

         axx.method_27693(class_124.field_1063 + "]");
         break;
      }

      return axx;
   }

   public static void dsj(String[] var0) {
      dyf = var0;
   }

   public static String[] fbq() {
      return dyf;
   }

   static {
      long var0 = a ^ 77466172213916L;
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
      String var6 = "'\u0083°w\u0005\u0015\u0096§\u0091a\u0083\u0098Îk\u0004]\u0018Ïú\u0097\u008f{\u009a Ð\u009bÓ¦\u009e\u009bzÝ×úwÃF\u009by(\u0090";
      int var8 = "'\u0083°w\u0005\u0015\u0096§\u0091a\u0083\u0098Îk\u0004]\u0018Ïú\u0097\u008f{\u009a Ð\u009bÓ¦\u009e\u009bzÝ×úwÃF\u009by(\u0090".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            if (fbq() != null) {
               dsj(new String[1]);
            }

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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2489;
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
            throw new RuntimeException("cc/astralis/bpa", var10);
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
         throw new RuntimeException("cc/astralis/bpa" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
