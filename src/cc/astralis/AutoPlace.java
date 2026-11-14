package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1268;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_3965;

public class AutoPlace extends guu {
   private final ArrayList<class_2338> foa;
   private final bes ccs;
   private final gbp gie;
   private final gbp eo;
   private int fzr;
   private int fuo;
   private boolean hhz;
   private int bvz;
   private class_2350 fvj;
   private static final long a = 51537810685214L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public AutoPlace() {
      long a = AutoPlace.a ^ 79203954915332L;
      super(bfm.WORLD);
      a.foa = new ArrayList<>();
      short var10003 = 27717;
      long var10004 = 5480241717692088878L ^ a;
      a.ccs = new bes("Place Delay", 2.0F, 1.0F, 10.0F, 1.0F);
      var10003 = 17528;
      var10004 = 1910594437162953232L ^ a;
      a.gie = new gbp("Swing Hand", true);
      var10003 = 12827;
      var10004 = 9000112343862058097L ^ a;
      a.eo = new gbp("Rotations", true);
      a.fzr = 0;
      a.fuo = 0;
      a.hhz = false;
      a.bvz = -1;
      a.bfi(new ffn[]{a.ccs, a.gie, a.eo});
   }

   @gdz
   public void ben(eih event) {
      long ax = AutoPlace.a ^ 133660526672925L;
      int[] var4 = dar.abu();
      int var10000 = a.hhz;
      if (var4 != null) {
         if (!a.hhz) {
            a.bap();
            a.bvz = amg.bdh(true).aqk();
            return;
         }

         var10000 = a.fzr;
      }

      label46: {
         int var10001 = a.foa.size();
         if (var4 != null) {
            if (var10000 >= var10001) {
               a.gxo();
               return;
            }

            var5 = a;
            if (var4 == null) {
               break label46;
            }

            var10000 = a.fuo;
            var10001 = a.ccs.dnp().intValue();
         }

         if (var10000 >= var10001) {
            a.gro();
            a.fuo = 0;
            if (var4 != null) {
               return;
            }
         }

         var5 = a;
      }

      var5.fuo++;
   }

   @gdz
   public void evs(fxx event) {
      long ax = AutoPlace.a ^ 118343743491827L;
      int[] axx = dar.abu();
      int var10000 = a.eo.dnp();
      if (axx != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = a.hhz;
      }

      label42: {
         if (axx != null) {
            if (var10000 == 0) {
               return;
            }

            var7 = a;
            if (axx == null) {
               break label42;
            }

            var10000 = a.fzr;
         }

         if (var10000 >= a.foa.size()) {
            return;
         }

         var7 = a.foa.get(a.fzr);
      }

      class_2338 axxx = (class_2338)var7;
      float[] axxxx = a.bco(axxx);
      dqq.cms(axxxx, 180.0F, 180.0F);
   }

   private void bap() {
      long a = AutoPlace.a ^ 73251340191398L;
      class_2350[] var4 = class_2350.values();
      int[] var10000 = dar.abu();
      int var5 = var4.length;
      int[] ax = var10000;
      int var6 = 0;

      while (var6 < var5) {
         class_2350 axx = var4[var6];
         class_2338 axxx = chi.field_1724.method_24515().method_10074().method_10093(axx);
         a.foa.clear();
         a.foa.add(axxx);
         a.foa.add(axxx.method_10069(1, 0, 0));
         a.foa.add(axxx.method_10069(2, 0, 0));
         a.foa.add(axxx.method_10069(0, 1, 0));
         a.foa.add(axxx.method_10069(0, 2, 0));
         a.hhz = true;
         var6++;
         if (ax == null) {
            break;
         }
      }
   }

   private void gro() {
      int[] a;
      class_2338 ax;
      label72: {
         AutoPlace var12;
         label75: {
            long axx = AutoPlace.a ^ 60295047689754L;
            int[] var10000 = dar.abu();
            ax = a.foa.get(a.fzr);
            a = var10000;
            int var11 = chi.field_1724.method_31548().method_67532();
            if (a != null) {
               if (var11 != a.bvz) {
                  chi.field_1724.method_31548().method_61496(a.bvz);
                  return;
               }

               var12 = a;
               if (a == null) {
                  break label75;
               }

               var11 = a.eo.dnp();
            }

            if (var11 == 0) {
               break label72;
            }

            var12 = a;
         }

         float[] axxx = var12.bco(ax);
         dqq.cms(axxx, 180.0F, 180.0F);
      }

      class_243 axxx = new class_243(ax.method_10263() + 0.5, ax.method_10264() + 0.5, ax.method_10260() + 0.5);
      class_2350[] var6 = class_2350.values();
      int var7 = var6.length;
      int var8 = 0;

      AutoPlace var14;
      label77: {
         while (true) {
            if (var8 < var7) {
               label55: {
                  class_2350 axxxx = var6[var8];
                  if (a != null) {
                     var13 = axxxx;
                     if (a == null) {
                        break;
                     }

                     if (axxxx == a.fvj && a != null) {
                        break label55;
                     }

                     chi.field_1761.method_2896(chi.field_1724, class_1268.field_5808, new class_3965(axxx, axxxx.method_10153(), ax, false));
                  }

                  a.fvj = axxxx;
               }

               var8++;
               if (a != null) {
                  continue;
               }
            }

            var14 = a;
            if (a == null) {
               break label77;
            }

            var13 = a.gie.dnp();
            break;
         }

         if ((Boolean)var13) {
            chi.field_1724.method_6104(class_1268.field_5808);
         }

         var14 = a;
      }

      var14.fzr++;
   }

   private float[] bco(class_2338 a) {
      double ax = a.method_10263() + 0.5 - chi.field_1724.method_23317();
      double axx = a.method_10264() + 0.5 - (chi.field_1724.method_23318() + chi.field_1724.method_18381(chi.field_1724.method_18376()));
      double axxx = a.method_10260() + 0.5 - chi.field_1724.method_23321();
      double axxxx = Math.sqrt(ax * ax + axxx * axxx);
      float axxxxx = (float)Math.toDegrees(Math.atan2(axxx, ax)) - 90.0F;
      float axxxxxx = (float)(-Math.toDegrees(Math.atan2(axx, axxxx)));
      return new float[]{axxxxx, axxxxxx};
   }

   @Override
   public void auj() {
      a.fzr = 0;
      a.fuo = 0;
      a.hhz = false;
      a.bvz = -1;
      super.auj();
   }

   @Override
   public void frg() {
      a.fzr = 0;
      a.fuo = 0;
      a.hhz = false;
      a.bvz = -1;
      super.frg();
   }

   static {
      long var0 = a ^ 91855144687599L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "Þ^\u0082Úá\u001a\u0016w7bì\u0092\u0004Ý$9ùW\u0002¤\u001c\u0019C! _ÜÊ\u0082|·6¹\u0010ÜVÕèÁê \n¤\u009fÞ«¦ÏÈºò\u0014\u009b$D÷\b }±ÙQ#\u0092\u0086\u0002|=:V\u0019¹'C\u0098<\u008eÛÔ<§¹E$\u0017ÌS\u0018ûN";
      int var8 = "Þ^\u0082Úá\u001a\u0016w7bì\u0092\u0004Ý$9ùW\u0002¤\u001c\u0019C! _ÜÊ\u0082|·6¹\u0010ÜVÕèÁê \n¤\u009fÞ«¦ÏÈºò\u0014\u009b$D÷\b }±ÙQ#\u0092\u0086\u0002|=:V\u0019¹'C\u0098<\u008eÛÔ<§¹E$\u0017ÌS\u0018ûN"
         .length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = d(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            g = var9;
            h = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11120;
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
            throw new RuntimeException("cc/astralis/fei", var10);
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
         throw new RuntimeException("cc/astralis/fei" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
