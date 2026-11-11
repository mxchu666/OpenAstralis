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
import net.minecraft.class_2708;

public class avy extends guu {
   private final adu dpp;
   private static final long a = 77402320457268L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public avy() {
      long a = avy.a ^ 18020828179469L;
      super(bfm.PLAYER);
      short var10003 = 8152;
      long var10004 = 6663471321025399731L ^ a;
      short var3 = 19158;
      long var10005 = 8237072490287308476L ^ a;
      String[] var4 = new String[2];
      short var10008 = 19158;
      long var10009 = 8237072490287308476L ^ a;
      var4[0] = "Cancel";
      var10008 = 31330;
      var10009 = 7517629188460129805L ^ a;
      var4[1] = "Adjust";
      a.dpp = new adu("Mode", "Cancel", var4);
      a.bfi(new ffn[]{a.dpp});
   }

   @gdz
   public void aza(fxx event) {
      a.efe(a.dpp.dnp());
   }

   @gdz
   public void bhc(amo event) {
      long ax = avy.a ^ 85134797804658L;
      int[] axx = dar.abu();
      amo var10000 = a;
      if (axx != null) {
         if (a.cud() != gpy.RECEIVE) {
            return;
         }

         var10000 = a;
      }

      Object var7 = var10000.bed();
      if (axx != null) {
         if (!(var7 instanceof class_2708)) {
            return;
         }

         var7 = a.dpp.dnp();
      }

      String var5 = (String)var7;
      byte var6 = -1;
      var8 = var5.hashCode();
      label45:
      if (axx != null) {
         switch (var8) {
            case 2011110042:
               short var10001 = 22013;
               long var10002 = 5237854772570487275L ^ ax;
               var8 = var5.equals("Cancel");
               if (axx == null) {
                  break label45;
               }

               if (var8 == 0) {
                  break;
               }

               var6 = 0;
               if (axx != null) {
                  break;
               }
            case 1956520879:
               short var9 = 12152;
               long var10 = 4661545536975635311L ^ ax;
               var8 = var5.equals("Adjust");
               if (axx == null) {
                  break label45;
               }

               if (var8 != 0) {
                  var6 = 1;
               }
         }

         var8 = var6;
      }

      switch (var8) {
         case 0:
            a.gmm(true);
         case 1:
      }
   }

   static {
      long var0 = a ^ 81398351943044L;
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
      String var6 = "LmÿO!KaH\u0083¡\u0082 JÍ\u008aâ\u0010i{zþYÝÔ_\u008dF¶2./¬¢\u0010\u0093$¯e\u0088\u0018»\u009cø¥~%ùÊ\u0085S";
      int var8 = "LmÿO!KaH\u0083¡\u0082 JÍ\u008aâ\u0010i{zþYÝÔ_\u008dF¶2./¬¢\u0010\u0093$¯e\u0088\u0018»\u009cø¥~%ùÊ\u0085S".length();
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
                     h = new String[5];
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

                  var6 = "<+&Ê2\u008e\u009d\u0006\t]%}vØ\"º\u0010QÓUàWCñ¶U~Ë\u000eC\u008c×Ë";
                  var8 = "<+&Ê2\u008e\u009d\u0006\t]%}vØ\"º\u0010QÓUàWCñ¶U~Ë\u000eC\u008c×Ë".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30290;
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
            throw new RuntimeException("cc/astralis/avy", var10);
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
         throw new RuntimeException("cc/astralis/avy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
