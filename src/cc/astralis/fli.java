package cc.astralis;

import astralis.mixin.accessor.MinecraftClientSessionAccessor;
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
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;

public class fli extends guu {
   private final bes egk;
   private final gbp gbv;
   private final gbp edg;
   private final bes ddq;
   private static final long a = 62297369538405L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long p;

   public fli() {
      long a = fli.a ^ 28665590207063L;
      super(bfm.PLAYER);
      short var10003 = 31585;
      long var10004 = 7082915664191015264L ^ a;
      a.egk = new bes("Delay", 1.0F, 0.0F, 4.0F, 1.0F);
      var10003 = 4967;
      var10004 = 7493342376518558052L ^ a;
      a.gbv = new gbp("Blocks only", true);
      var10003 = 22862;
      var10004 = 8526454772598926158L ^ a;
      a.edg = new gbp("Auto Swap", true);
      var10003 = 29094;
      var10004 = 1958400054804923300L ^ a;
      a.ddq = new bes("Swap Amount", 1.0F, 1.0F, 64.0F, 1.0F);
      a.bfi(new ffn[]{a.egk, a.gbv, a.edg, a.ddq});
   }

   @gdz
   public void egi(fnt e) {
      int[] ax;
      int var10000;
      long axx = fli.a ^ 82993914403264L;
      ax = dar.abu();
      var10000 = a.gbv.dnp();
      label105:
      if (ax != null) {
         if (var10000 != 0) {
            var10000 = bav.cdc();
            if (ax == null) {
               break label105;
            }

            if (var10000 == 0) {
               return;
            }
         }

         var10000 = ((MinecraftClientSessionAccessor)chi).getItemUseCooldown();
      }

      if (ax != null) {
         if (var10000 > a.egk.dnp().intValue()) {
            ((MinecraftClientSessionAccessor)chi).setItemUseCooldown(a.egk.dnp().intValue());
         }

         var10000 = a.edg.dnp();
      }

      label109: {
         if (ax != null) {
            if (var10000 == 0) {
               return;
            }

            var9 = chi;
            if (ax == null) {
               break label109;
            }

            var10000 = chi.field_1690.field_1904.method_1434();
         }

         if (var10000 == 0) {
            return;
         }

         var9 = chi;
      }

      class_1799 axxx = var9.field_1724.method_6047();
      class_1792 axxxx = axxx.method_7909();
      class_1792 var10 = axxxx;
      if (ax != null) {
         if (!(axxxx instanceof class_1747)) {
            return;
         }

         var10 = axxxx;
      }

      class_1747 axxxxx = (class_1747)var10;
      var10000 = amg.ayj(axxxxx.method_7711());
      if (ax != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = axxx.method_7947();
      }

      if (ax != null) {
         if (var10000 > a.ddq.dnp().intValue()) {
            return;
         }

         var10000 = a.ebm();
      }

      int axxxxxx = var10000;
      var10000 = axxxxxx;
      int var10001 = -1;
      if (ax != null) {
         if (axxxxxx == -1) {
            return;
         }

         var10000 = axxxxxx;
         var10001 = chi.field_1724.method_31548().method_67532();
      }

      if (var10000 != var10001) {
         chi.field_1724.method_31548().method_61496(axxxxxx);
      }
   }

   private int ebm() {
      long a = fli.a ^ 3086261607906L;
      int[] var10000 = dar.abu();
      int ax = -1;
      int[] axx = var10000;
      int axxx = 0;
      int axxxx = 0;

      while (true) {
         if (axxxx < (int)p) {
            class_1799 axxxxx = chi.field_1724.method_31548().method_5438(axxxx);
            class_1792 var9 = axxxxx.method_7909();
            label34:
            if (axx != null) {
               var10 = var9 instanceof class_1747;
               if (axx == null) {
                  break;
               }

               if (var10 != 0) {
                  class_1747 axxxxxx = (class_1747)var9;
                  if (axx == null) {
                     break label34;
                  }

                  label41:
                  if (amg.ayj(axxxxxx.method_7711())) {
                     int var11 = axxxxx.method_7947();
                     if (axx != null) {
                        if (var11 <= axxx) {
                           break label41;
                        }

                        axxx = axxxxx.method_7947();
                        var11 = axxxx;
                     }

                     ax = var11;
                  }
               }

               axxxx++;
            }

            if (axx != null) {
               continue;
            }
         }

         var10 = ax;
         break;
      }

      return var10;
   }

   static {
      long var5 = a ^ 32189965099389L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[4];
      int var12 = 0;
      String var11 = "Ág\\,\u00194·t;¸¡Lç úî_K\u0090`Ú\u0086\u001dJ\u009f@Á82\u00185\u001e\u0010/HÛNñ¬Á¨\u0006^è·\u0007 «¯";
      int var13 = "Ág\\,\u00194·t;¸¡Lç úî_K\u0090`Ú\u0086\u001dJ\u009f@Á82\u00185\u001e\u0010/HÛNñ¬Á¨\u0006^è·\u0007 «¯".length();
      char var10 = ' ';
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = d(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     g = var14;
                     h = new String[4];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 2968804753033561330L;
                     byte[] var4 = var0.doFinal(
                        new byte[]{
                           (byte)(var2 >>> 56),
                           (byte)(var2 >>> 48),
                           (byte)(var2 >>> 40),
                           (byte)(var2 >>> 32),
                           (byte)(var2 >>> 24),
                           (byte)(var2 >>> 16),
                           (byte)(var2 >>> 8),
                           (byte)var2
                        }
                     );
                     long var30 = (var4[0] & 255L) << 56
                        | (var4[1] & 255L) << 48
                        | (var4[2] & 255L) << 40
                        | (var4[3] & 255L) << 32
                        | (var4[4] & 255L) << 24
                        | (var4[5] & 255L) << 16
                        | (var4[6] & 255L) << 8
                        | var4[7] & 255L;
                     var10001 = -1;
                     p = var30;
                     return;
                  }

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var14[var12++] = var26;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label37;
                  }

                  var11 = "\u009e\u0088\u0006©!ÜAÇQàñ,AI\u0005òðÓ\u000bJ\u0011\u0086\u008eg{Î÷¹ø²_ü\u0018Û¿\u009d\u0012°¹|\u0098o\u0088xp6ÕVã×>t¹ÎÕÉn";
                  var13 = "\u009e\u0088\u0006©!ÜAÇQàñ,AI\u0005òðÓ\u000bJ\u0011\u0086\u008eg{Î÷¹ø²_ü\u0018Û¿\u009d\u0012°¹|\u0098o\u0088xp6ÕVã×>t¹ÎÕÉn".length();
                  var10 = ' ';
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3890;
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
            throw new RuntimeException("cc/astralis/fli", var10);
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
         throw new RuntimeException("cc/astralis/fli" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
