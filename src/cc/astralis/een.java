package cc.astralis;

import java.awt.Color;
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
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;

public class een extends class_437 implements amh, dlc, fjk {
   private env avp;
   private float cjg;
   private float fiy;
   private static final long a = 99132401644616L;
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   public een() {
      long a = een.a ^ 138228030958564L;
      super(class_2561.method_30163(b));
   }

   public void method_25420(class_332 context, int mouseX, int mouseY, float delta) {
   }

   public void method_25394(class_332 context, int mouseX, int mouseY, float delta) {
      long ax = een.a ^ 51097051149116L;
      float var10002 = a.field_22789;
      float var10003 = a.field_22790;
      short var10009 = 7301;
      long var10010 = 1455592368642058686L ^ ax;
      dmp.gst(0.0F, 0.0F, var10002, var10003, new Color(0, 0, 0, 200));
      float var10000 = a.field_22789 / 2;
      var10002 = a.field_22789 / 2;
      var10003 = a.field_22790;
      short var10007 = 12253;
      long var10008 = 4769339897036593893L ^ ax;
      short var12 = 11497;
      long var15 = 7870160479983393232L ^ ax;
      var10009 = 11497;
      var10010 = 7870160479983393232L ^ ax;
      short var20 = 4987;
      long var10011 = 3022021344437298753L ^ ax;
      dmp.ezk(var10000, 0.0F, var10002, var10003, 1.0F, new Color(255, 255, 255, 30));
      float var10001 = a.field_22790 / 2;
      var10002 = a.field_22789;
      var10003 = a.field_22790 / 2;
      var10007 = 11497;
      var10008 = 7870160479983393232L ^ ax;
      short var14 = 11497;
      long var17 = 7870160479983393232L ^ ax;
      var10009 = 11497;
      var10010 = 7870160479983393232L ^ ax;
      short var22 = 21155;
      var10011 = 256089782510921631L ^ ax;
      dmp.ezk(0.0F, var10001, var10002, var10003, 1.0F, new Color(255, 255, 255, 30));
   }

   public boolean method_25402(class_11909 click, boolean doubled) {
      double ax = a.comp_4798();
      double axx = a.comp_4799();
      int axxx = a.method_74245();
      bfv.forEach(axxxx -> {
         long ax = een.a ^ 123691419532656L;
         int[] var8 = dar.abu();
         if (var8 != null) {
            if (!fuv.bfm(a, a, axxxx.grp(), axxxx.azb(), axxxx.cxc(), axxxx.evg())) {
               return;
            }

            a.avp = axxxx;
            a.cjg = (float)a - axxxx.grp();
         }

         a.fiy = (float)a - axxxx.azb();
      });
      return super.method_25402(a, a);
   }

   public boolean method_25403(class_11909 click, double offsetX, double offsetY) {
      long ax = een.a ^ 92814657851466L;
      int[] var10000 = dar.abu();
      double axx = a.comp_4798();
      int[] axxx = var10000;
      double axxxx = a.comp_4799();
      een var16 = a;
      if (axxx != null) {
         if (a.avp != null) {
            float axxxxx = (float)axx - a.cjg;
            float axxxxxx = (float)axxxx - a.fiy;
            int axxxxxxx = 4;
            float var18;
            int var17 = (var18 = Math.abs(axxxxx - a.field_22789 / 2.0F) - axxxxxxx) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
            if (axxx != null) {
               if (var17 < 0) {
                  axxxxx = a.field_22789 / 2.0F;
               }

               float var19;
               var17 = (var19 = Math.abs(axxxxxx - a.field_22790 / 2.0F) - axxxxxxx) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
            }

            label34: {
               if (axxx != null) {
                  if (var17 >= 0) {
                     break label34;
                  }

                  var17 = a.field_22790;
               }

               axxxxxx = var17 / 2.0F;
            }

            a.avp.evg(axxxxx, axxxxxx);
         }

         var16 = a;
      }

      return var16.method_25403(a, a, a);
   }

   public boolean method_25406(class_11909 click) {
      a.avp = null;
      return super.method_25406(a);
   }

   private float fez(float a, float a) {
      float ax = 0.05F;
      return 0.95F * a + 0.05F * a;
   }

   static {
      long var11 = a ^ 7718323017190L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("Hud Editor".getBytes("ISO-8859-1"));
      String var22 = b(var15).intern();
      int var10001 = -1;
      b = var22;
      e = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[5];
      int var3 = 0;
      String var4 = "ìX]+\u0097¤è$\u008f\\^\u00addà\u0006l¢È\u0092nl¡×\n";
      int var5 = "ìX]+\u0097¤è$\u008f\\^\u00addà\u0006l¢È\u0092nl¡×\n".length();
      byte var2 = 0;

      label29:
      while (true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var18 = var6;
         var10001 = var3++;
         long var24 = (var7[0] & 255L) << 56
            | (var7[1] & 255L) << 48
            | (var7[2] & 255L) << 40
            | (var7[3] & 255L) << 32
            | (var7[4] & 255L) << 24
            | (var7[5] & 255L) << 16
            | (var7[6] & 255L) << 8
            | var7[7] & 255L;
         byte var27 = -1;

         while (true) {
            long var8 = var24;
            byte[] var10 = var0.doFinal(
               new byte[]{
                  (byte)(var8 >>> 56),
                  (byte)(var8 >>> 48),
                  (byte)(var8 >>> 40),
                  (byte)(var8 >>> 32),
                  (byte)(var8 >>> 24),
                  (byte)(var8 >>> 16),
                  (byte)(var8 >>> 8),
                  (byte)var8
               }
            );
            long var29 = (var10[0] & 255L) << 56
               | (var10[1] & 255L) << 48
               | (var10[2] & 255L) << 40
               | (var10[3] & 255L) << 32
               | (var10[4] & 255L) << 24
               | (var10[5] & 255L) << 16
               | (var10[6] & 255L) << 8
               | var10[7] & 255L;
            switch (var27) {
               case 0:
                  var18[var10001] = var29;
                  if (var2 >= var5) {
                     c = var6;
                     d = new Integer[5];
                     return;
                  }
                  break;
               default:
                  var18[var10001] = var29;
                  if (var2 < var5) {
                     continue label29;
                  }

                  var4 = "o\fÕ\u0017}gâÃ]Og\u009c\u00941Gà";
                  var5 = "o\fÕ\u0017}gâÃ]Og\u009c\u00941Gà".length();
                  var2 = 0;
            }

            byte var21 = var2;
            var2 += 8;
            var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
            var18 = var6;
            var10001 = var3++;
            var24 = (var7[0] & 255L) << 56
               | (var7[1] & 255L) << 48
               | (var7[2] & 255L) << 40
               | (var7[3] & 255L) << 32
               | (var7[4] & 255L) << 24
               | (var7[5] & 255L) << 16
               | (var7[6] & 255L) << 8
               | var7[7] & 255L;
            var27 = 0;
         }
      }
   }

   private static String b(byte[] var0) {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12876;
      if (d[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = c[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/een", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("cc/astralis/een" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
