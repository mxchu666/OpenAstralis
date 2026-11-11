package cc.astralis;

import astralis.mixin.accessor.BufferBuilderStorageAccessor;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_5611;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;

public class cem extends guu {
   private final bes dpe;
   private final bes aui;
   private final ArrayList<bpi> bwl;
   private static final long a = 82371839067723L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Long[] q;
   private static final Map r;

   public cem() {
      long a = cem.a ^ 20948015613427L;
      super(bfm.VISUAL);
      short var10003 = 19295;
      long var10004 = 7967526347593515287L ^ a;
      a.dpe = new bes("Min Distance", 0.1F, 0.1F, 2.0F, 0.1F);
      var10003 = 2107;
      var10004 = 7484522343339213424L ^ a;
      a.aui = new bes("Curve Resolution", 10.0F, 5.0F, 50.0F, 1.0F);
      a.bwl = new ArrayList<>();
      a.bfi(new ffn[]{a.dpe, a.aui});
   }

   @gdz
   public void bhm(eih event) {
      long ax = cem.a ^ 128593504456380L;
      int[] var10000 = dar.abu();
      class_243 axx = chi.field_1724.method_73189();
      int[] axxx = var10000;
      var10000 = (int[])a.bwl;
      if (axxx != null) {
         if (a.bwl.isEmpty()) {
            a.bwl.add(new bpi(axx, chi.field_1724.method_18376(), System.currentTimeMillis()));
            if (axxx != null) {
               return;
            }
         }

         var10000 = (int[])a.bwl.get(a.bwl.size() - 1);
      }

      bpi axxxx = (bpi)var10000;
      if (axxx != null && axxxx.hho.method_1022(axx) >= a.dpe.dnp().floatValue()) {
         a.bwl.add(new bpi(axx, chi.field_1724.method_18376(), System.currentTimeMillis()));
      }
   }

   @gdz
   public void goc(bsm event) {
      long ax = cem.a ^ 114819584924956L;
      int[] axx = dar.abu();
      if (a.bwl.size() >= 2) {
         class_4587 axxx = a.bus();
         axxx.method_22903();
         class_243 axxxx = chi.field_1773.method_19418().method_19326();
         axxx.method_22904(-axxxx.field_1352, -axxxx.field_1351, -axxxx.field_1350);
         Matrix4f axxxxx = axxx.method_23760().method_23761();
         class_4598 axxxxxx = ((BufferBuilderStorageAccessor)chi.method_22940()).getEntityVertexConsumers();
         class_4588 axxxxxxx = axxxxxx.method_73477(class_1921.method_49043(2.0));
         a.bwl.removeIf(axxxxxxxx -> {
            long ax = cem.a ^ 63755914774281L;
            int[] var3 = dar.abu();
            long var4x;
            int var10000x = (var4x = System.currentTimeMillis() - axxxxxxxx.caz - e<"l">(12398, 6611098324501515448L ^ ax)) == 0L ? 0 : (var4x < 0L ? -1 : 1);
            if (var3 != null) {
               var10000x = var10000x > 0 ? 1 : 0;
            }

            return (boolean)var10000x;
         });
         Object var10000 = a.bwl;
         if (axx != null) {
            if (a.bwl.size() < 2) {
               return;
            }

            var10000 = a.cch();
         }

         List<class_243> axxxxxxxx = (List<class_243>)var10000;
         a.fqz(axxxxx, axxxxxxx, axxxxxxxx);
         axxxxxx.method_37104();
         axxx.method_22909();
      }
   }

   private List<class_243> cch() {
      long a = cem.a ^ 25295840776250L;
      int[] var10000 = dar.abu();
      ArrayList ax = new ArrayList();
      int[] axx = var10000;
      int var16 = a.bwl.size();
      if (axx != null) {
         if (var16 < 2) {
            return ax;
         }

         ax.add(a.bwl.get(0).hho.method_1031(0.0, 0.02, 0.0));
         var16 = 0;
      }

      int axxx = var16;

      while (true) {
         if (axxx < a.bwl.size() - 1) {
            class_243 axxxx = a.bwl.get(axxx).hho.method_1031(0.0, 0.02, 0.0);
            var17 = a.bwl;
            if (axx == null) {
               break;
            }

            class_243 axxxxx = a.bwl.get(axxx + 1).hho.method_1031(0.0, 0.02, 0.0);
            class_243 axxxxxx = axxxx;
            class_243 axxxxxxx = axxxxx;
            int var18 = axxx;
            if (axx != null) {
               if (axxx > 0) {
                  class_243 axxxxxxxx = a.bwl.get(axxx - 1).hho.method_1031(0.0, 0.02, 0.0);
                  axxxxxx = axxxx.method_1019(axxxxx.method_1020(axxxxxxxx).method_1021(0.3));
               }

               var18 = axxx;
            }

            if (axx != null) {
               if (var18 < a.bwl.size() - 2) {
                  class_243 axxxxxxxx = a.bwl.get(axxx + 2).hho.method_1031(0.0, 0.02, 0.0);
                  axxxxxxx = axxxxx.method_1019(axxxx.method_1020(axxxxxxxx).method_1021(0.3));
               }

               var18 = a.aui.dnp().intValue();
            }

            int axxxxxxxx = var18;
            int axxxxxxxxx = 1;

            label60: {
               while (axxxxxxxxx <= axxxxxxxx) {
                  float axxxxxxxxxx = (float)axxxxxxxxx / axxxxxxxx;
                  class_243 axxxxxxxxxxx = a.dqf(axxxx, axxxxxx, axxxxxxx, axxxxx, axxxxxxxxxx);
                  ax.add(axxxxxxxxxxx);
                  axxxxxxxxx++;
                  if (axx == null) {
                     break label60;
                  }

                  if (axx == null) {
                     break;
                  }
               }

               axxx++;
            }

            if (axx != null) {
               continue;
            }
         }

         var17 = ax;
         break;
      }

      return var17;
   }

   private class_243 dqf(class_243 a, class_243 a, class_243 a, class_243 a, float a) {
      float ax = 1.0F - a;
      float axx = a * a;
      float axxx = ax * ax;
      float axxxx = axxx * ax;
      float axxxxx = axx * a;
      class_243 axxxxxx = a.method_1021(axxxx);
      axxxxxx = axxxxxx.method_1019(a.method_1021(3.0F * axxx * a));
      axxxxxx = axxxxxx.method_1019(a.method_1021(3.0F * ax * axx));
      return axxxxxx.method_1019(a.method_1021(axxxxx));
   }

   private void fqz(Matrix4f a, class_4588 a, List<class_243> a) {
      long ax = cem.a ^ 62160183254259L;
      int[] axx = dar.abu();
      if (a.size() >= 2) {
         ezv axxx = dar.gqy().aws().diy(ezv.class);
         int axxxx = 0;

         while (axxxx < a.size() - 1) {
            class_243 axxxxx = a.get(axxxx);
            class_243 axxxxxx = a.get(axxxx + 1);
            float axxxxxxx = (float)axxxx / (a.size() - 1);
            float axxxxxxxx = Math.max(0.1F, 1.0F - axxxxxxx);
            String axxxxxxxxx = axxx.eqi.dnp();
            byte var15 = -1;
            int var10000 = axxxxxxxxx.hashCode();
            if (axx != null) {
               switch (var10000) {
                  case -1656737386:
                     short var10001 = 9857;
                     long var10002 = 2791047418275902920L ^ ax;
                     var10000 = axxxxxxxxx.equals("Rainbow");
                     if (axx == null) {
                        break;
                     }

                     if (var10000 != 0) {
                        var15 = 0;
                     }
                  default:
                     var10000 = var15;
               }
            }
            Color axxxxxxxxxx = switch (var10000) {
               case 0 -> ezv.gbq(e<"l">(27426, 5675533014831385615L ^ ax), (int)(axxxxxxx * 100.0F), 0.7F, 1.0F);
               default -> dec.fbp(new class_5611(0.0F, 6.0F), axxx.ehf.dnp(), axxx.aoz.dnp());
            };
            Color axxxxxxxxxxx = dec.ceu(axxxxxxxxxx, (int)(axxxxxxxx * 255.0F));
            a.fqw(a, a, axxxxx, axxxxxx, axxxxxxxxxxx);
            axxxx++;
            if (axx == null) {
               break;
            }
         }
      }
   }

   private void fqw(Matrix4f a, class_4588 a, class_243 a, class_243 a, Color a) {
      float ax = a.getRed() / 255.0F;
      float axx = a.getGreen() / 255.0F;
      float axxx = a.getBlue() / 255.0F;
      float axxxx = a.getAlpha() / 255.0F;
      a.cqi(a, a, a, ax, axx, axxx, axxxx);
      a.cqi(a, a, a, ax, axx, axxx, axxxx);
   }

   private void cqi(Matrix4f a, class_4588 a, class_243 a, float a, float a, float a, float a) {
      a.method_22918(a, (float)a.field_1352, (float)a.field_1351, (float)a.field_1350).method_22915(a, a, a, a).method_22914(0.0F, 1.0F, 0.0F);
   }

   static {
      long var11 = a ^ 122262908641242L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[3];
      int var18 = 0;
      String var17 = "\u0083î»\u0005\u0082¤$·ç[µÞ²\u0000\u001b·\u0018ùS\u0093\u008d\u000e7î\u0005?x\u0018¹Õ\u008cå:®Ç|&\u0016\u0088Qº(g¶¼6dzz\u00ad,Å\u001d\u000f¥\u0001\u0000X\u0015\u0088\u0095\u009c÷\u0088ÞÏÂ¯T\u0091á\u0000\u000b\u000e³B4ö\u0004AÎ0";
      int var19 = "\u0083î»\u0005\u0082¤$·ç[µÞ²\u0000\u001b·\u0018ùS\u0093\u008d\u000e7î\u0005?x\u0018¹Õ\u008cå:®Ç|&\u0016\u0088Qº(g¶¼6dzz\u00ad,Å\u001d\u000f¥\u0001\u0000X\u0015\u0088\u0095\u009c÷\u0088ÞÏÂ¯T\u0091á\u0000\u000b\u000e³B4ö\u0004AÎ0"
         .length();
      char var16 = 16;
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var27 = d(var21).intern();
         int var10001 = -1;
         var20[var18++] = var27;
         if ((var15 += var16) >= var19) {
            g = var20;
            h = new String[3];
            r = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "|\u0015å\u009b\u0089¯øj^&Ýä\u009d\u001b\u0081¦";
            int var5 = "|\u0015å\u009b\u0089¯øj^&Ýä\u009d\u001b\u0081¦".length();
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
               byte var31 = -1;
               var6[var10001] = var10004;
            } while (var2 < var5);

            p = var6;
            q = new Long[2];
            return;
         }

         var16 = var17.charAt(var15);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18929;
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
            throw new RuntimeException("cc/astralis/cem", var10);
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
         throw new RuntimeException("cc/astralis/cem" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32149;
      if (q[var3] == null) {
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
         long var5 = p[var3];
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
         Object[] var9 = (Object[])r.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               r.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/cem", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         q[var3] = var15;
      }

      return q[var3];
   }

   private static long e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = e(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/cem" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
