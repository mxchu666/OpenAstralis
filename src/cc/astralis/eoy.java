package cc.astralis;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class eoy extends fig {
   private final List<ckg> gzf;
   private final bfm gzi;
   private static String cgd;
   private static final long a = 25583590156695L;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;

   public eoy(bfm category, float x, float y, float width, float height) {
      long ax = eoy.a ^ 29942878013799L;
      int[] var10000 = dar.abu();
      super();
      int[] axx = var10000;
      a.gzf = new ArrayList<>();
      a.gzi = a;
      a.hh(a);
      a.cje(a);
      a.ans(a);
      a.dzm(a);

      for (guu axxx : dar.gqy().aws().gtd(a)) {
         a.gzf.add(new ckg(axxx, a.gzf));
         if (axx == null) {
            break;
         }
      }
   }

   @Override
   public void bfi(float mouseX, float mouseY) {
      long ax = eoy.a ^ 128492427151268L;
      int[] var10000 = dar.abu();
      float axx = a.gqc();
      int[] axxx = var10000;
      Iterator axxxx = a.gzf.iterator();

      while (true) {
         if (axxxx.hasNext()) {
            label60: {
               ckg axxxxx = (ckg)axxxx.next();
               float var12 = axx + axxxxx.gqc();
               if (axxx != null) {
                  axx = var12;
                  if (axxx == null) {
                     break;
                  }

                  if (!axxxxx.dfv && !axxxxx.btb) {
                     break label60;
                  }

                  var12 = axx + (float)axxxxx.dmy.hjo();
               }

               axx = var12;
            }

            if (axxx != null) {
               continue;
            }
         }

         float var13 = a.hjg() + 1.0F;
         float var10001 = a.dtt();
         float var10002 = a.av() - 1.0F;
         float var10003 = a.gqc();
         short var10010 = 4003;
         long var10011 = 1567353453927050979L ^ ax;
         short var15 = 21477;
         long var10012 = 8865069608911172260L ^ ax;
         short var16 = 21477;
         long var10013 = 8865069608911172260L ^ ax;
         dmp.caz(var13, var10001, var10002, var10003, 5.0F, 5.0F, 0.0F, 0.0F, new Color(35, 35, 35));
         cbl.ebb(a.gzi.eai(), a.hjg() + (a.av() - cbl.eq(a.gzi.eai())) / 2.0F, a.dtt() + (a.gqc() - cbl.biu(a.gzi.eai())) / 2.0F, Color.white);
         break;
      }

      float axxxxx = a.dtt() + a.gqc();
      Iterator var11 = a.gzf.iterator();

      while (true) {
         if (var11.hasNext()) {
            label44: {
               ckg axxxxxx = (ckg)var11.next();
               axxxxxx.ans(a.hjg() + 1.0F);
               axxxxxx.dzm(axxxxx);
               axxxxxx.hh(a.av() - 1.0F);
               axxxxxx.cje(20.0F);
               axxxxxx.bfi(a, a);
               float var14 = axxxxx + axxxxxx.gqc();
               if (axxx != null) {
                  axxxxx = var14;
                  if (axxx == null) {
                     break;
                  }

                  if (!axxxxxx.dfv && !axxxxxx.btb) {
                     break label44;
                  }

                  var14 = axxxxx + (float)axxxxxx.dmy.hjo();
               }

               axxxxx = var14;
            }

            if (axxx != null) {
               continue;
            }
         }

         dmp.hbm(a.hjg(), a.dtt() - 1.0F, a.av() + 1.0F, axx + 2.0F, 6.0F, dar.gqy().deo(), dar.gqy().cxj(), false, 2.0F, new Color(0, 0, 0, 0));
         break;
      }
   }

   @Override
   public void apy(double mouseX, double mouseY, int button) {
      a.gzf.forEach(ax -> ax.apy(a, a, a));
   }

   @Override
   public void epq(double mouseX, double mouseY, int button) {
      a.gzf.forEach(ax -> ax.epq(a, a, a));
   }

   public List<ckg> eze() {
      return a.gzf;
   }

   public bfm fxi() {
      return a.gzi;
   }

   public static void emn(String var0) {
      cgd = var0;
   }

   public static String flu() {
      return cgd;
   }

   static {
      long var15 = a ^ 37796713195610L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var15 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var14 = var12.doFinal("¯¦»EV¶w@".getBytes("ISO-8859-1"));
      String var20 = b(var14).intern();
      int var10001 = -1;
      String var11 = var20;
      d = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var15 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "û{qµåÔ*\u009bE\u001fòe\"ª\u009ak";
      int var5 = "û{qµåÔ*\u009bE\u001fòe\"ª\u009ak".length();
      byte var2 = 0;

      do {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var8 = (var7[0] & 255L) << 56
            | (var7[1] & 255L) << 48
            | (var7[2] & 255L) << 40
            | (var7[3] & 255L) << 32
            | (var7[4] & 255L) << 24
            | (var7[5] & 255L) << 16
            | (var7[6] & 255L) << 8
            | var7[7] & 255L;
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
         long var10004 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         byte var23 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      b = var6;
      c = new Integer[2];
      if (flu() == null) {
         emn(var11);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3955;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/eoy", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
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
         throw new RuntimeException("cc/astralis/eoy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
