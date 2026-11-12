package cc.astralis;

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
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;

public class dmr extends class_437 implements dlc {
   private final List<eoy> coj;
   private final List<fyp> ecf;
   private static final long bmm;
   private static final float bps = 10.0F;
   private static final long a = 40434236200995L;
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   public dmr() {
      long a = dmr.a ^ 115826826887228L;
      int[] var10000 = dar.abu();
      super(class_2561.method_30163(b));
      a.coj = new ArrayList<>();
      int[] ax = var10000;
      a.ecf = new ArrayList<>();
      short var10 = 10904;
      long var10001 = 7307432587451576531L ^ a;
      int axx = 50;
      short var11 = 14288;
      var10001 = 4683098237730074010L ^ a;
      int axxx = 50;

      for (bfm axxxx : bfm.values()) {
         label27: {
            label26: {
               if (ax != null) {
                  if (axxxx != bfm.CLIENT) {
                     break label26;
                  }

                  short var10005 = 2271;
                  long var10006 = 632148724053152407L ^ a;
                  a.coj.add(new eoy(axxxx, axx - 140, 250.0F, 129.0F, 20.0F));
               }

               if (ax != null) {
                  break label27;
               }
            }

            a.coj.add(new eoy(axxxx, axx, axxx, 129.0F, 20.0F));
         }

         axx += 140;
         if (ax == null) {
            break;
         }
      }
   }

   public void method_25420(class_332 context, int mouseX, int mouseY, float delta) {
   }

   private void dgd(double a, double a) {
      long ax = dmr.a ^ 84077427181779L;
      int[] var10000 = dar.abu();
      a.ecf.add(new fyp((float)a, (float)a));
      int[] var7 = var10000;
      if (var7 != null) {
         int var8 = a.ecf.size();
         short var10001 = 21432;
         long var10002 = 4244326635282809118L ^ ax;
         if (var8 > 8) {
            a.ecf.removeFirst();
         }
      }
   }

   private void au() {
      long a = dmr.a ^ 23845309558866L;
      int[] var10000 = dar.abu();
      Iterator ax = a.ecf.iterator();
      int[] axx = var10000;

      while (ax.hasNext()) {
         label26: {
            fyp axxx = (fyp)ax.next();
            axxx.env();
            fyp var6 = axxx;
            if (axx != null) {
               if (axxx.elp()) {
                  ax.remove();
                  if (axx != null) {
                     break label26;
                  }
               }

               var6 = axxx;
            }

            var6.flv();
         }

         if (axx == null) {
            break;
         }
      }
   }

   public void method_25394(class_332 context, int mouseX, int mouseY, float delta) {
      dfr.bmt(() -> {
         a.coj.forEach(ax -> ax.bfi(a, a));
         a.au();
         ffm.fpp().emf(a, a);
      });
   }

   public boolean method_25402(class_11909 click, boolean doubled) {
      long ax = dmr.a ^ 30870174396376L;
      int[] var5 = dar.abu();
      boolean var10000 = ffm.fpp().gkk(a, a);
      if (var5 != null) {
         if (var10000) {
            return true;
         }

         a.dgd(a.comp_4798(), a.comp_4799());
         a.coj.forEach(axx -> axx.apy(a.comp_4798(), a.comp_4799(), a.method_74245()));
         var10000 = super.method_25402(a, a);
      }

      return var10000;
   }

   public boolean method_25406(class_11909 click) {
      a.coj.forEach(ax -> ax.epq(a.comp_4798(), a.comp_4799(), a.method_74245()));
      return super.method_25406(a);
   }

   public boolean method_25401(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      long ax = dmr.a ^ 69695321229785L;
      int[] axx = dar.abu();
      boolean var10000 = ffm.fpp().dmj(a, a, a, a);
      if (axx != null) {
         if (!var10000) {
            for (eoy axxx : a.coj) {
               axxx.dzm((float)(axxx.dtt() + a * 10.0));
               if (axx == null) {
                  break;
               }
            }

            return super.method_25401(a, a, a, a);
         }

         var10000 = true;
      }

      return var10000;
   }

   public boolean method_25404(class_11908 input) {
      long ax = dmr.a ^ 22047794675792L;
      int[] var4 = dar.abu();
      boolean var10000 = ffm.fpp().chz(a);
      if (var4 != null) {
         if (var10000) {
            return true;
         }

         var10000 = super.method_25404(a);
      }

      return var10000;
   }

   public boolean method_25400(class_11905 input) {
      long ax = dmr.a ^ 9313524824054L;
      int[] var4 = dar.abu();
      boolean var10000 = ffm.fpp().flf(a);
      if (var4 != null) {
         if (var10000) {
            return true;
         }

         var10000 = super.method_25400(a);
      }

      return var10000;
   }

   public boolean method_25403(class_11909 click, double offsetX, double offsetY) {
      long ax = dmr.a ^ 137538869783824L;
      int[] var8 = dar.abu();
      boolean var10000 = ffm.fpp().fgn(a, a, a);
      if (var8 != null) {
         if (var10000) {
            return true;
         }

         var10000 = super.method_25403(a, a, a);
      }

      return var10000;
   }

   public void method_25419() {
      dar.gqy().fyf().bet(a);
      super.method_25419();
   }

   static {
      long var18 = a ^ 128866419354594L;
      Cipher var20;
      Cipher var10000 = var20 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var18 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var21 = 1; var21 < 8; var21++) {
         var10003[var21] = (byte)(var18 << var21 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var22 = var20.doFinal("Dropdown".getBytes("ISO-8859-1"));
      String var31 = a(var22).intern();
      int var10001 = -1;
      b = var31;
      e = new HashMap(13);
      Cipher var7;
      var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var18 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var18 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var13 = new long[4];
      int var10 = 0;
      String var11 = "? ¿ý¶¶Ï\u0090\u001b\u0014xJ\u0010\u009c\u0002@";
      int var12 = "? ¿ý¶¶Ï\u0090\u001b\u0014xJ\u0010\u009c\u0002@".length();
      byte var9 = 0;

      label39:
      while (true) {
         var10001 = var9;
         var9 += 8;
         byte[] var14 = var11.substring(var10001, var9).getBytes("ISO-8859-1");
         long[] var25 = var13;
         var10001 = var10++;
         long var33 = (var14[0] & 255L) << 56
            | (var14[1] & 255L) << 48
            | (var14[2] & 255L) << 40
            | (var14[3] & 255L) << 32
            | (var14[4] & 255L) << 24
            | (var14[5] & 255L) << 16
            | (var14[6] & 255L) << 8
            | var14[7] & 255L;
         byte var38 = -1;

         while (true) {
            long var15 = var33;
            byte[] var17 = var7.doFinal(
               new byte[]{
                  (byte)(var15 >>> 56),
                  (byte)(var15 >>> 48),
                  (byte)(var15 >>> 40),
                  (byte)(var15 >>> 32),
                  (byte)(var15 >>> 24),
                  (byte)(var15 >>> 16),
                  (byte)(var15 >>> 8),
                  (byte)var15
               }
            );
            long var41 = (var17[0] & 255L) << 56
               | (var17[1] & 255L) << 48
               | (var17[2] & 255L) << 40
               | (var17[3] & 255L) << 32
               | (var17[4] & 255L) << 24
               | (var17[5] & 255L) << 16
               | (var17[6] & 255L) << 8
               | var17[7] & 255L;
            switch (var38) {
               case 0:
                  var25[var10001] = var41;
                  if (var9 >= var12) {
                     c = var13;
                     d = new Integer[4];
                     Cipher var2;
                     var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var18 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var18 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var4 = -5895330533933590543L;
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
                     long var36 = (var6[0] & 255L) << 56
                        | (var6[1] & 255L) << 48
                        | (var6[2] & 255L) << 40
                        | (var6[3] & 255L) << 32
                        | (var6[4] & 255L) << 24
                        | (var6[5] & 255L) << 16
                        | (var6[6] & 255L) << 8
                        | var6[7] & 255L;
                     byte var30 = -1;
                     long var0 = var36;
                     bmm = var0;
                     return;
                  }
                  break;
               default:
                  var25[var10001] = var41;
                  if (var9 < var12) {
                     continue label39;
                  }

                  var11 = "9|å\u008e\rTq\u009c¤Çfý\t<êÍ";
                  var12 = "9|å\u008e\rTq\u009c¤Çfý\t<êÍ".length();
                  var9 = 0;
            }

            byte var29 = var9;
            var9 += 8;
            var14 = var11.substring(var29, var9).getBytes("ISO-8859-1");
            var25 = var13;
            var10001 = var10++;
            var33 = (var14[0] & 255L) << 56
               | (var14[1] & 255L) << 48
               | (var14[2] & 255L) << 40
               | (var14[3] & 255L) << 32
               | (var14[4] & 255L) << 24
               | (var14[5] & 255L) << 16
               | (var14[6] & 255L) << 8
               | var14[7] & 255L;
            var38 = 0;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16982;
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
            throw new RuntimeException("cc/astralis/dmr", var14);
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
         throw new RuntimeException("cc/astralis/dmr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
