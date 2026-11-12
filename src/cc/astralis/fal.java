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

public class fal extends bmd {
   private final gbp gvd;
   private static final int dlm;
   private static final Color bcr;
   private static final long a = 82324579500586L;
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   public fal(gbp property, float width, float height) {
      a.gvd = a;
      a.fqg(a);
      a.fuo(a);
   }

   @Override
   public void ckn(float x, float y, float mouseX, float mouseY) {
      long ax = fal.a ^ 89707573487305L;
      a.fji(a);
      a.axc(a);
      short var10001 = 12478;
      long var10002 = 1388936440100908208L ^ ax;
      fll axx = bxc.emc(b, 10);
      axx.aof(a.gvd.fah(), a + 6.0F, a + 4.0F - 1.5F, cbc.fgl);
      float axxx = super.ajg() - 6.0F;
      dmp.cpp(a + a.arq() - (axxx + 6.0F), a + 3.0F, axxx, axxx, 2.0F, bcr);
      if (a.gvd.dnp()) {
         ezv axxxx = dar.gqy().aws().diy(ezv.class);
         dmp.dsm(a + a.arq() - (axxx + 6.0F), a + 3.0F, axxx, axxx, 2.0F, axxxx.ehf.dnp(), axxxx.aoz.dnp());
      }
   }

   @Override
   public void gdj(double mouseX, double mouseY, int button) {
      long ax = fal.a ^ 96482193615685L;
      int[] var8 = dar.abu();
      if (fuv.bfm(a, a, a.aqy(), a.gpn(), a.arq(), a.ajg())) {
         gbp var10000 = a.gvd;
         boolean var10001 = a.gvd.dnp();
         if (var8 != null) {
            var10001 = !var10001;
         }

         var10000.gbf(var10001);
      }
   }

   static {
      long var14 = a ^ 84337849687078L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)(var14 << var12 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var13 = var11.doFinal("Sf-Ui".getBytes("ISO-8859-1"));
      String var24 = a(var13).intern();
      int var10001 = -1;
      b = var24;
      e = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "\u0089\u0098[\u0089Þß\u0099\t\u001cz~ÚÇ§!\u000e";
      int var5 = "\u0089\u0098[\u0089Þß\u0099\t\u001cz~ÚÇ§!\u000e".length();
      byte var2 = 0;

      label29:
      while (true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var18 = var6;
         var10001 = var3++;
         long var26 = (var7[0] & 255L) << 56
            | (var7[1] & 255L) << 48
            | (var7[2] & 255L) << 40
            | (var7[3] & 255L) << 32
            | (var7[4] & 255L) << 24
            | (var7[5] & 255L) << 16
            | (var7[6] & 255L) << 8
            | var7[7] & 255L;
         byte var30 = -1;

         while (true) {
            long var8 = var26;
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
            long var34 = (var10[0] & 255L) << 56
               | (var10[1] & 255L) << 48
               | (var10[2] & 255L) << 40
               | (var10[3] & 255L) << 32
               | (var10[4] & 255L) << 24
               | (var10[5] & 255L) << 16
               | (var10[6] & 255L) << 8
               | var10[7] & 255L;
            switch (var30) {
               case 0:
                  var18[var10001] = var34;
                  if (var2 >= var5) {
                     c = var6;
                     d = new Integer[4];
                     short var19 = 15731;
                     long var23 = var14 ^ 919015584603544467L;
                     dlm = 3;
                     short var28 = 20470;
                     long var32 = 6706729428529408277L ^ var14;
                     short var33 = 20084;
                     var34 = 2965660239773493398L ^ var14;
                     short var36 = 20084;
                     long var10005 = 2965660239773493398L ^ var14;
                     bcr = new Color(40, 40, 40);
                     return;
                  }
                  break;
               default:
                  var18[var10001] = var34;
                  if (var2 < var5) {
                     continue label29;
                  }

                  var4 = "×¦zþh)\u000b³\u0004Äêõ\u0089mF3";
                  var5 = "×¦zþh)\u000b³\u0004Äêõ\u0089mF3".length();
                  var2 = 0;
            }

            byte var22 = var2;
            var2 += 8;
            var7 = var4.substring(var22, var2).getBytes("ISO-8859-1");
            var18 = var6;
            var10001 = var3++;
            var26 = (var7[0] & 255L) << 56
               | (var7[1] & 255L) << 48
               | (var7[2] & 255L) << 40
               | (var7[3] & 255L) << 32
               | (var7[4] & 255L) << 24
               | (var7[5] & 255L) << 16
               | (var7[6] & 255L) << 8
               | var7[7] & 255L;
            var30 = 0;
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14573;
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
            throw new RuntimeException("cc/astralis/fal", var14);
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
         throw new RuntimeException("cc/astralis/fal" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
