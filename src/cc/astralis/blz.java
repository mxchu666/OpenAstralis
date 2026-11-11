package cc.astralis;

import java.io.File;
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
import net.minecraft.class_310;

public abstract class blz {
   public File evx;
   public File bf;
   private static int etp;
   private static final long a = 136496737260418L;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public blz() {
      long a = blz.a ^ 136851768448758L;
      super();
      File var10003 = class_310.method_1551().field_1697;
      short var10004 = 15206;
      long var10005 = 1087660118053908501L ^ a;
      String var4 = "Astralis".toLowerCase();
      short var10006 = 20537;
      long var10007 = 349070656364026697L ^ a;
      a.evx = new File(var10003, "/" + var4 + "/Configs");
      var10004 = 19017;
      var10005 = 6061994440578236728L ^ a;
      a.bf = new File(class_310.method_1551().field_1697, "/" + "Astralis".toLowerCase());
   }

   public abstract void apo();

   public abstract void fme();

   public static void fvm(int var0) {
      etp = var0;
   }

   public static int dcm() {
      return etp;
   }

   public static int emn() {
      long var0 = a ^ 139665036672778L;
      int[] var2 = dar.abu();
      int var3 = dcm();
      int var10000 = var3;
      if (var2 != null) {
         if (var3 == 0) {
            return 4;
         }

         var10000 = 0;
      }

      return var10000;
   }

   static {
      long var16 = a ^ 126976048220262L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var16 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[3];
      int var12 = 0;
      String var11 = "Æ\u0090Õñv¡ \u008amµç\u009c\\a\u0092¡¡\u0004åE\u0012\u0084\u0097nK\u008d],º³Û§\u00188M©YÒO\u0012G\u008c\u0014Vó~ã}>tI\u008cYÆG¼\u0089 ·¥öJHZ\u001bQ¼6ÇªìÉs\u0098m\u0018jòBgN\u008fYP4°!2Üû";
      int var13 = "Æ\u0090Õñv¡ \u008amµç\u009c\\a\u0092¡¡\u0004åE\u0012\u0084\u0097nK\u008d],º³Û§\u00188M©YÒO\u0012G\u008c\u0014Vó~ã}>tI\u008cYÆG¼\u0089 ·¥öJHZ\u001bQ¼6ÇªìÉs\u0098m\u0018jòBgN\u008fYP4°!2Üû"
         .length();
      char var10 = ' ';
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var22 = a(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var22;
         if ((var9 += var10) >= var13) {
            c = var14;
            d = new String[3];
            Cipher var2;
            var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var3 = 1; var3 < 8; var3++) {
               var10003[var3] = (byte)(var16 << var3 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var4 = -8328138040796291875L;
            byte[] var6 = var2.doFinal(
               new byte[]{
                  (byte)(var4 >>> 56),
                  (byte)(var4 >>> 48),
                  (byte)(var4 >>> 40),
                  (byte)(var4 >>> 32),
                  (byte)(var4 >>> 24),
                  (byte)(var4 >>> 16),
                  (byte)(var4 >>> 8),
                  (byte)var4
               }
            );
            long var25 = (var6[0] & 255L) << 56
               | (var6[1] & 255L) << 48
               | (var6[2] & 255L) << 40
               | (var6[3] & 255L) << 32
               | (var6[4] & 255L) << 24
               | (var6[5] & 255L) << 16
               | (var6[6] & 255L) << 8
               | var6[7] & 255L;
            var10001 = -1;
            long var0 = var25;
            if (dcm() == 0) {
               fvm((int)var0);
            }

            return;
         }

         var10 = var11.charAt(var9);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19973;
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
            throw new RuntimeException("cc/astralis/blz", var10);
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
         throw new RuntimeException("cc/astralis/blz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
