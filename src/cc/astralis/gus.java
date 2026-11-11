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

public class gus extends hcr {
   private final bes egf;
   private static final long a = 47547461041551L;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public gus(guu parentClass) {
      long ax = gus.a ^ 58175843992189L;
      short var10002 = 10197;
      long var10003 = 7199423830928096675L ^ ax;
      super(a, "MMC");
      short var4 = 21947;
      long var10004 = 8609077446868668364L ^ ax;
      a.egf = new bes("MMC Value", 0.8F, 0.75F, 1.0F, 0.01F);
      a.ebu(a.egf);
   }

   @gdz
   public void aop(fnt event) {
      long ax = gus.a ^ 23113448045710L;
      int[] var4 = dar.abu();
      int var10000 = chi.field_1724.field_6235;
      if (var4 != null) {
         if (chi.field_1724.field_6235 <= 1) {
            return;
         }

         chi.field_1724
            .method_18800(
               chi.field_1724.method_18798().field_1352 * a.egf.dnp().floatValue(),
               chi.field_1724.method_18798().field_1351,
               chi.field_1724.method_18798().field_1350 * a.egf.dnp().floatValue()
            );
         var10000 = chi.field_1724.method_24828();
      }

      label41: {
         if (var4 != null) {
            if (var10000 == 0) {
               return;
            }

            var5 = chi;
            if (var4 == null) {
               break label41;
            }

            var10000 = chi.field_1690.field_1903.method_1434();
         }

         if (var10000 != 0) {
            return;
         }

         var5 = chi;
      }

      var5.field_1724.method_6043();
   }

   static {
      long var0 = a ^ 48592275506486L;
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
      String var6 = "\u0095ç\u00147¨bË(×¿É\u0091KE=¿\u0018\rÝNH\u0005^c\u0010|%¬ßê<\u0086¬)ª¯.I\u001c\u0088H";
      int var8 = "\u0095ç\u00147¨bË(×¿É\u0091KE=¿\u0018\rÝNH\u0005^c\u0010|%¬ßê<\u0086¬)ª¯.I\u001c\u0088H".length();
      char var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9604;
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
            throw new RuntimeException("cc/astralis/gus", var10);
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
         throw new RuntimeException("cc/astralis/gus" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
