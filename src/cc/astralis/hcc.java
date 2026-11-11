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
import net.minecraft.class_1268;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2743;
import net.minecraft.class_2885;
import net.minecraft.class_3965;
import net.minecraft.class_746;
import net.minecraft.class_2350.class_2351;

public class hcc extends hcr {
   private final bes cxn;
   private int gup;
   private class_243 dfh;
   private static final long a = 138036468491799L;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public hcc(guu parentClass) {
      long ax = hcc.a ^ 132709139024888L;
      short var10002 = 569;
      long var10003 = 6248053564749632644L ^ ax;
      super(a, "Grim");
      short var4 = 16114;
      long var10004 = 1280576442727917646L ^ ax;
      a.cxn = new bes("Grim Value", 3.0F, 1.0F, 10.0F, 1.0F);
      a.ebu(a.cxn);
   }

   @gdz
   public void crx(elx event) {
      long ax = hcc.a ^ 13112155185429L;
      int[] var4 = dar.abu();
      hcc var10000 = a;
      if (var4 != null) {
         if (a.gup <= 0) {
            return;
         }

         a.gmm(true);
         var10000 = a;
      }

      var10000.gup--;
   }

   @gdz
   public void ebe(dgp event) {
      long ax = hcc.a ^ 78648039571892L;
      int[] var4 = dar.abu();
      if (a.cud() == gpy.PRE) {
         hcc var10000 = a;
         if (var4 != null) {
            if (a.gup > 0) {
               a.gmm(true);
               var10000 = a;
               if (var4 != null) {
                  if (a.dfh != null) {
                     return;
                  }

                  var10000 = a;
               }

               var10000.dfh = cqc();
               if (var4 != null) {
                  return;
               }
            }

            var10000 = a;
         }

         class_243 var6 = var10000.dfh;
         if (var4 != null) {
            if (var10000.dfh == null) {
               return;
            }

            var6 = a.dfh;
         }

         fjt(var6);
         a.dfh = null;
      }
   }

   @gdz
   public void cjr(fnt event) {
      long ax = hcc.a ^ 74207288872295L;
      if (a.gup > 0) {
         gix.eex(
            new class_2885(
               class_1268.field_5808,
               new class_3965(
                  chi.field_1724.method_73189().method_38499(class_2351.field_11052, chi.field_1724.method_31478()),
                  class_2350.field_11036,
                  chi.field_1724.method_24515().method_10074(),
                  false
               ),
               0
            )
         );
      }
   }

   @gdz
   public void gmi(amo e) {
      long ax = hcc.a ^ 1666057820819L;
      int[] var10000 = dar.abu();
      class_2596 var6 = a.bed();
      int[] axx = var10000;
      class_2596 var7 = var6;
      if (axx != null) {
         if (!(var6 instanceof class_2743)) {
            return;
         }

         var7 = var6;
      }

      class_2743 axxx = (class_2743)var7;
      if (axx != null) {
         if (axxx.method_11818() != chi.field_1724.method_5628()) {
            return;
         }

         a.gmm(true);
      }

      a.gup = a.cxn.dnp().intValue();
   }

   private static class_243 cqc() {
      long var0 = a ^ 104670554184646L;
      int[] var2 = dar.abu();
      class_746 var10000 = chi.field_1724;
      if (var2 != null) {
         if (chi.field_1724 == null) {
            return class_243.field_1353;
         }

         var10000 = chi.field_1724;
      }

      return var10000.method_18798();
   }

   private static void fjt(class_243 a) {
      long ax = hcc.a ^ 35921731276761L;
      int[] var3 = dar.abu();
      class_746 var10000 = chi.field_1724;
      if (var3 != null) {
         if (chi.field_1724 == null) {
            return;
         }

         var10000 = chi.field_1724;
      }

      var10000.method_18799(a);
   }

   static {
      long var0 = a ^ 120604825443525L;
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
      String var6 = "\u0080\u0085á\n¤\u0004QýHP>ç\u0091?5ówõs>xïï\u0084¸±\u0006ªz\u0000tù\u0010xe©ôVo.éÁ\u0094ÙG\u0019z@â";
      int var8 = "\u0080\u0085á\n¤\u0004QýHP>ç\u0091?5ówõs>xïï\u0084¸±\u0006ªz\u0000tù\u0010xe©ôVo.éÁ\u0094ÙG\u0019z@â".length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[2];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31571;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/hcc", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("cc/astralis/hcc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
