package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_310;
import net.minecraft.class_490;

public class AutoWeapon extends guu {
   private final bes ftz;
   private final bes cxi;
   private final bes ehm;
   private int bxp;
   private static final long a = 62383304767009L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;

   public AutoWeapon() {
      long a = AutoWeapon.a ^ 42677255140842L;
      super(bfm.PLAYER);
      short var10003 = 11413;
      long var10004 = 4711892131625746565L ^ a;
      a.ftz = new bes("Action Delay (ticks)", 2.0F, 0.0F, 20.0F, 1.0F);
      var10003 = 23763;
      var10004 = 4093328055058706625L ^ a;
      a.cxi = new bes("Sword Slot", 0.0F, 0.0F, 8.0F, 1.0F);
      var10003 = 13786;
      var10004 = 8620445937722022345L ^ a;
      a.ehm = new bes("First Tool Slot", 1.0F, 0.0F, 8.0F, 1.0F);
      a.bxp = 0;
      a.bfi(new ffn[]{a.ftz, a.cxi, a.ehm});
   }

   @gdz
   public void dlh(fnt event) {
      long ax = AutoWeapon.a ^ 135558152857018L;
      int[] axx = dar.abu();
      class_310 var10000 = chi;
      if (axx != null) {
         if (chi.field_1724 == null) {
            return;
         }

         var10000 = chi;
      }

      if (axx != null) {
         if (var10000.field_1761 == null) {
            return;
         }

         var10000 = chi;
      }

      if (axx != null) {
         if (var10000.field_1687 == null) {
            return;
         }

         var10000 = chi;
      }

      label160: {
         int var16 = var10000.field_1755 instanceof class_490;
         if (axx != null) {
            if (var16 == 0) {
               return;
            }

            var17 = a;
            if (axx == null) {
               break label160;
            }

            var16 = a.bxp;
         }

         if (var16 < a.ftz.dnp().intValue()) {
            a.bxp++;
            return;
         }

         var17 = a;
      }

      var17.bxp = 0;
      cxs axxx = cwp.dwm(chi.field_1724.field_7512.field_7761);
      List<class_1735> axxxx = new ArrayList<>(axxx.dsa());
      class_1735[] axxxxx = axxx.eyj();
      class_1735[] axxxxxx = axxx.fch();
      class_1735[] axxxxxxx = axxx.gwx();
      List<class_1735> axxxxxxxx = axxxx.stream().filter(axxxxxxxxx -> cwp.gvl(axxxxxxxxx.method_7677())).toList();
      boolean var18 = axxxxxxxx.isEmpty();
      if (axx != null) {
         if (var18) {
            List<class_1735> axxxxxxxxx = new ArrayList<>(Arrays.stream(axxxxxx).filter(axxxxxxxxxx -> {
               long ax = AutoWeapon.a ^ 26262122108873L;
               int[] var3 = dar.abu();
               class_1735 var10000x = axxxxxxxxxx;
               if (var3 != null) {
                  if (axxxxxxxxxx == null) {
                     return (boolean)0;
                  }

                  var10000x = axxxxxxxxxx;
               }

               if (var3 == null) {
                  return (boolean)var10000x.field_7874;
               } else {
                  short var10001x = 27344;
                  long var10002 = 3550641827769337710L ^ ax;
                  return (boolean)(var10000x.field_7874 > 8 ? 1 : 0);
               }
            }).toList());
            var19 = chi.field_1755 instanceof class_490;
            label132:
            if (axx != null) {
               if (var19 != 0) {
                  Collections.shuffle(axxxxxxxxx);
                  var19 = axxxxxxxxx.isEmpty();
                  if (axx == null) {
                     break label132;
                  }

                  if (var19 == 0) {
                     cwp.gmh(axxxxxxxxx.removeFirst().field_7874, 0, class_1713.field_7794);
                     return;
                  }
               }

               Collections.shuffle(axxxx);
               var19 = axxxx.isEmpty();
            }

            if (axx != null) {
               if (var19 == 0) {
                  cwp.gmh(axxxx.removeFirst().field_7874, 1, class_1713.field_7795);
                  return;
               }

               short var20 = 5429;
               long var10001 = 2781065808883583739L ^ ax;
               var19 = 36 + a.cxi.dnp().intValue();
            }

            label124: {
               label163: {
                  int axxxxxxxxxx = var19;
                  class_1735 var21 = axxxxx[0];
                  if (axx != null) {
                     if (var21 == null) {
                        break label163;
                     }

                     var21 = axxxxx[0];
                  }

                  var22 = var21.field_7874;
                  if (axx == null) {
                     break label124;
                  }

                  if (var21.field_7874 != axxxxxxxxxx) {
                     cwp.gmh(axxxxx[0].field_7874, a.cxi.dnp().intValue(), class_1713.field_7791);
                     return;
                  }
               }

               var22 = 0;
            }

            int axxxxxxxxxxx = var22;

            int var26;
            while (true) {
               if (axxxxxxxxxxx < 3) {
                  class_1735 axxxxxxxxxxxx = axxxxxxx[axxxxxxxxxxx];
                  short var23 = 16215;
                  long var25 = 4673478408025022616L ^ ax;
                  int axxxxxxxxxxxxx = 36 + a.ehm.dnp().intValue() + axxxxxxxxxxx;
                  if (axx != null) {
                     if (axxxxxxxxxxxx != null) {
                        var24 = axxxxxxxxxxxx.field_7874;
                        var26 = axxxxxxxxxxxxx;
                        if (axx == null) {
                           break;
                        }

                        if (axxxxxxxxxxxx.field_7874 != axxxxxxxxxxxxx) {
                           var24 = axxxxxxxxxxxx.field_7874;
                           var26 = a.ehm.dnp().intValue() + axxxxxxxxxxx;
                           break;
                        }
                     }

                     axxxxxxxxxxx++;
                  }

                  if (axx != null) {
                     continue;
                  }
               }

               return;
            }

            cwp.gmh(var24, var26, class_1713.field_7791);
            return;
         }

         cwp.gmh(axxxxxxxx.get(0).field_7874, 1, class_1713.field_7795);
         axxxx.remove(axxxxxxxx.get(0));
      }
   }

   static {
      long var11 = a ^ 99118389374426L;
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
      String var17 = "KÏéËàK1\u0094L¡ÊÛ\u008a\n\u007f¿zT¤H\u008cõÆ:2\u0002-:j6¿¸ \u0092VHò'¿íÌ\u001f÷`i\u0012H\u00129¦?§\bûZ¨\bg\u0012\u0002-¢Þ`·(!\u0097¾ zÊ\u0085A¨N~ m}ÑN\u00108\u007f`\f\u008eIc²wCäu\u0099Õ@?ïsf\u001d3\b¤";
      int var19 = "KÏéËàK1\u0094L¡ÊÛ\u008a\n\u007f¿zT¤H\u008cõÆ:2\u0002-:j6¿¸ \u0092VHò'¿íÌ\u001f÷`i\u0012H\u00129¦?§\bûZ¨\bg\u0012\u0002-¢Þ`·(!\u0097¾ zÊ\u0085A¨N~ m}ÑN\u00108\u007f`\f\u008eIc²wCäu\u0099Õ@?ïsf\u001d3\b¤"
         .length();
      char var16 = ' ';
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
            long[] var6 = new long[3];
            int var3 = 0;
            String var4 = "_\u009d\u0003 \u0007k£'_C*äÓjCK5î\u009fRãZ\u0086¾";
            int var5 = "_\u009d\u0003 \u0007k£'_C*äÓjCK5î\u009fRãZ\u0086¾".length();
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
            q = new Integer[3];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28633;
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
            throw new RuntimeException("cc/astralis/aac", var10);
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
         throw new RuntimeException("cc/astralis/aac" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19540;
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
            throw new RuntimeException("cc/astralis/aac", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
   }

   private static int e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
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
         throw new RuntimeException("cc/astralis/aac" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
