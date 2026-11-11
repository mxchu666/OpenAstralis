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
import net.minecraft.class_2828;

public class dts extends guu {
   private final adu fbp;
   private double gic;
   private double dab;
   private double bih;
   private boolean fjd;
   private int cju;
   private static final long a = 102137888449377L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long p;

   public dts() {
      long a = dts.a ^ 79530025290916L;
      super(bfm.PLAYER);
      short var10003 = 31544;
      long var10004 = 4011453046589566094L ^ a;
      short var3 = 1110;
      long var10005 = 3899400101597565922L ^ a;
      String[] var4 = new String[2];
      short var10008 = 1110;
      long var10009 = 3899400101597565922L ^ a;
      var4[0] = "Blink";
      var10008 = 4090;
      var10009 = 534518023067195469L ^ a;
      var4[1] = "Stop";
      a.fbp = new adu("Mode", "Blink", var4);
      a.bfi(new ffn[]{a.fbp});
   }

   @Override
   public void auj() {
      long a = dts.a ^ 96254037516966L;
      int[] var10000 = dar.abu();
      super.auj();
      int[] var3 = var10000;
      if (var3 != null) {
         if (chi.field_1724 != null && chi.field_1724.method_24828()) {
            a.dab = chi.field_1724.method_23317();
            a.gic = chi.field_1724.method_23318();
            a.bih = chi.field_1724.method_23321();
         }

         a.cju = 0;
         a.fjd = false;
      }
   }

   @gdz
   public void div(fxx event) {
      long ax = dts.a ^ 13405490388760L;
      int[] var4 = dar.abu();
      short var10001 = 3780;
      long var10002 = 961470199450454728L ^ ax;
      boolean var10000 = a.fbp.emb("Stop");
      if (var4 != null) {
         if (!var10000) {
            return;
         }

         var10000 = bav.bfi();
      }

      if (var4 != null) {
         if (!var10000) {
            return;
         }

         var10000 = chi.field_1724.method_24828();
      }

      if (!var10000) {
         a.gmm(true);
      }
   }

   @gdz
   public void dzn(amo event) {
      long ax = dts.a ^ 52056546233485L;
      int[] axx = dar.abu();
      String var10000 = a.fbp.dnp();
      short var10001 = 29927;
      long var10002 = 2125518681722446715L ^ ax;
      boolean var6 = var10000.equals("Blink");
      if (axx != null) {
         label93: {
            if (var6) {
               var7 = a;
               if (axx == null) {
                  break label93;
               }

               if (a.cud() == gpy.RECEIVE) {
                  return;
               }
            }

            var7 = a;
         }

         var6 = var7.bed() instanceof class_2828;
      }

      if (axx != null) {
         if (!var6) {
            return;
         }

         var6 = bav.bfi();
      }

      boolean axxx = var6;
      int var8 = axxx;
      if (axx != null) {
         if (axxx != 0) {
            label100: {
               double var13;
               int var9 = (var13 = chi.field_1724.field_6017 - 5.0) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
               if (axx != null) {
                  if (var9 < 0) {
                     a.gmm(true);
                     a.fjd = true;
                     if (axx != null) {
                        return;
                     }
                  }

                  var10 = a;
                  if (axx == null) {
                     break label100;
                  }

                  var9 = a.fjd;
               }

               if (var9 == 0) {
                  return;
               }

               evd.eeo();
               chi.field_1724.method_5814(a.dab, a.gic, a.bih);
               chi.field_1724.field_6017 = 0.0;
               var10 = a;
            }

            var10.fjd = false;
            short var11 = 6878;
            long var12 = 5937257608482524486L ^ ax;
            bpa.dhu("Saved from void!");
            if (axx != null) {
               return;
            }
         }

         var8 = chi.field_1724.field_6012 % (int)p;
      }

      if (axx != null) {
         if (var8 != 0) {
            return;
         }

         var8 = chi.field_1724.method_24828();
      }

      if (var8 != 0) {
         a.dab = chi.field_1724.method_23317();
         a.gic = chi.field_1724.method_23318();
         a.bih = chi.field_1724.method_23321();
         a.fjd = false;
      }
   }

   static {
      long var5 = a ^ 84496528035303L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[6];
      int var12 = 0;
      String var11 = "]4ÆÃv{[\u0083\u007fQÖÙóúQ\u0007\u00100b¡ð\u0099¦\rxò4ì}íC\u0092a\u00107^ö#\u0095o\f\u007f¨8¿ï\n\u0088\u0097*\u0010êJ\n×¶\u0092Ò ¸xFåm,.¢";
      int var13 = "]4ÆÃv{[\u0083\u007fQÖÙóúQ\u0007\u00100b¡ð\u0099¦\rxò4ì}íC\u0092a\u00107^ö#\u0095o\f\u007f¨8¿ï\n\u0088\u0097*\u0010êJ\n×¶\u0092Ò ¸xFåm,.¢"
         .length();
      char var10 = 16;
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
                     h = new String[6];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 7305239364693476920L;
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

                  var11 = "\u0083 Wè¿L\u008b Ö\u008fÌx^yêW\u0087b\u008dÈJR\u0084â³\u0001i\u0010æ\u0094\u000e²>\u0003âv\u001eGXÕ\u0010\nÎä\u0094Z\u0087'pÊä^\u009ee\u0082ïU";
                  var13 = "\u0083 Wè¿L\u008b Ö\u008fÌx^yêW\u0087b\u008dÈJR\u0084â³\u0001i\u0010æ\u0094\u000e²>\u0003âv\u001eGXÕ\u0010\nÎä\u0094Z\u0087'pÊä^\u009ee\u0082ïU"
                     .length();
                  var10 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30832;
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
            throw new RuntimeException("cc/astralis/dts", var10);
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
         throw new RuntimeException("cc/astralis/dts" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
