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
import net.minecraft.class_1268;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2484;
import net.minecraft.class_2680;
import net.minecraft.class_2846;
import net.minecraft.class_4587;
import net.minecraft.class_638;
import net.minecraft.class_2484.class_2486;
import net.minecraft.class_2846.class_2847;

public class gdj extends guu {
   private final bes fjg;
   private class_2338 dfv;
   private boolean bdp;
   private int foy;
   private static final long a = 98397241968401L;
   private static final String g;
   private static final long[] h;
   private static final Integer[] i;
   private static final Map p;

   public gdj() {
      long a = gdj.a ^ 32365410446614L;
      super(bfm.WORLD);
      a.fjg = new bes(g, 6.0F, 1.0F, 12.0F, 1.0F);
      a.beb(a.fjg);
   }

   @gdz
   public void eea(fxx event) {
      long ax = gdj.a ^ 62318300036568L;
      int[] var10000 = dar.abu();
      double axx = a.fjg.dnp().doubleValue();
      int axxx = (int)(chi.field_1724.method_73189().field_1352 - axx);
      int axxxx = (int)(chi.field_1724.method_73189().field_1352 + axx);
      int axxxxx = (int)(chi.field_1724.method_73189().field_1351 + chi.field_1724.method_5751() - axx);
      int axxxxxx = (int)(chi.field_1724.method_73189().field_1351 + chi.field_1724.method_5751() + axx);
      int[] axxxxxxx = var10000;
      int axxxxxxxx = (int)(chi.field_1724.method_73189().field_1350 - axx);
      int axxxxxxxxx = (int)(chi.field_1724.method_73189().field_1350 + axx);
      int axxxxxxxxxx = axxx;

      label98:
      while (true) {
         int var20 = axxxxxxxxxx;

         label95: {
            label94:
            while (var20 <= axxxx) {
               int axxxxxxxxxxx = axxxxxxxx;

               label92:
               while (true) {
                  int var21 = axxxxxxxxxxx;

                  label89:
                  while (var21 <= axxxxxxxxx) {
                     var20 = axxxxx;
                     if (axxxxxxx == null) {
                        continue label94;
                     }

                     int axxxxxxxxxxxx = axxxxx;

                     while (axxxxxxxxxxxx <= axxxxxx) {
                        class_2680 axxxxxxxxxxxxx = chi.field_1687.method_8320(new class_2338(axxxxxxxxxx, axxxxxxxxxxxx, axxxxxxxxxxx));
                        class_2248 axxxxxxxxxxxxxx = axxxxxxxxxxxxx.method_26204();
                        label83:
                        if (axxxxxxx != null) {
                           var21 = axxxxxxxxxxxxxx instanceof class_2484;
                           if (axxxxxxx == null) {
                              continue label89;
                           }

                           if (var21 != 0) {
                              class_2484 axxxxxxxxxxxxxxx = (class_2484)axxxxxxxxxxxxxx;
                              if (axxxxxxx == null) {
                                 break label83;
                              }

                              if (axxxxxxxxxxxxxxx.method_9327() == class_2486.field_11510) {
                                 label106: {
                                    a.dfv = new class_2338(axxxxxxxxxx, axxxxxxxxxxxx, axxxxxxxxxxx);
                                    int var22 = a.foy;
                                    if (axxxxxxx != null) {
                                       if (a.foy == 0) {
                                          a.bdp = true;
                                          chi.field_1724.method_6104(class_1268.field_5808);
                                          gix.dsd(new class_2846(class_2847.field_12968, a.dfv, class_2350.field_11033));
                                          a.bdp = false;
                                          if (axxxxxxx != null) {
                                             break label106;
                                          }
                                       }

                                       var23 = a;
                                       if (axxxxxxx == null) {
                                          break label95;
                                       }

                                       float var25;
                                       var22 = (var25 = a.foy - bav.faa(a.dfv, chi.field_1724.method_6047())) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
                                    }

                                    if (var22 >= 0) {
                                       a.bdp = true;
                                       chi.field_1724.method_6104(class_1268.field_5808);
                                       gix.dsd(new class_2846(class_2847.field_12973, a.dfv, class_2350.field_11033));
                                       chi.method_1577().method_4907(chi.field_1687, a.dfv, axxxxxxxxxxxxx, 1.0F);
                                       var23 = a;
                                       break label95;
                                    }

                                    chi.field_1724.method_6104(class_1268.field_5808);
                                 }

                                 a.foy++;
                                 int axxxxxxxxxxxxxxxx = (int)((double)a.foy / bav.faa(a.dfv, chi.field_1724.method_6047()) * 100.0);
                                 class_638 var24 = chi.field_1687;
                                 int var10001 = chi.field_1724.method_5628();
                                 short var10004 = 21410;
                                 long var10005 = 3998566463005805758L ^ ax;
                                 var24.method_8517(var10001, a.dfv, axxxxxxxxxxxxxxxx / 10);
                              }
                           }

                           axxxxxxxxxxxx++;
                        }

                        if (axxxxxxx == null) {
                           break;
                        }
                     }

                     axxxxxxxxxxx++;
                     if (axxxxxxx != null) {
                        continue label92;
                     }
                     break;
                  }

                  axxxxxxxxxx++;
                  if (axxxxxxx != null) {
                     continue label98;
                  }

                  return;
               }
            }

            return;
         }

         var23.fdn();
         return;
      }
   }

   private void fdn() {
      long a = gdj.a ^ 104214961579215L;
      int[] var3 = dar.abu();
      gdj var10000 = a;
      if (var3 != null) {
         if (a.dfv != null) {
            chi.field_1687.method_8517(chi.field_1724.method_5628(), a.dfv, -1);
            gix.dsd(new class_2846(class_2847.field_12971, a.dfv, class_2350.field_11033));
         }

         a.foy = 0;
         a.dfv = null;
         var10000 = a;
      }

      var10000.bdp = false;
   }

   @gdz
   public void fic(bsm event) {
      long ax = gdj.a ^ 121599428749166L;
      int[] var10000 = dar.abu();
      int var10001 = 132;
      long var10002 = 1929344992446022956L ^ ax;
      byte axx = 32;
      int[] axxx = var10000;
      class_2338 var11 = chi.field_1724.method_24515();
      var10001 = b<"l">(27640, 624186893144682071L ^ ax);
      short var16 = 26785;
      long var10003 = 7582221074866760968L ^ ax;
      short var18 = 26785;
      long var10004 = 7582221074866760968L ^ ax;

      for (class_2338 axxxx : class_2338.method_10097(
         var11.method_10069(var10001, -32, -32),
         chi.field_1724
            .method_24515()
            .method_10069(b<"l">(11974, 3657880430468606824L ^ ax), b<"l">(11974, 3657880430468606824L ^ ax), b<"l">(11974, 3657880430468606824L ^ ax))
      )) {
         label44: {
            class_2680 axxxxx = chi.field_1687.method_8320(axxxx);
            class_2248 axxxxxx = axxxxx.method_26204();
            class_2248 var12 = axxxxxx;
            if (axxx != null) {
               if (!(axxxxxx instanceof class_2484)) {
                  break label44;
               }

               var12 = axxxxxx;
            }

            class_2484 axxxxxxx = (class_2484)var12;
            class_4587 var13 = a.bus();
            class_238 var15 = new class_238(axxxx);
            Color var17 = a.dfv != null && chi.field_1687.method_8320(a.dfv) == axxxxx ? Color.red : Color.GREEN;
            short var19 = 12320;
            var10004 = 8454098829278262667L ^ ax;
            bqf.hjf(var13, var15, var17, 150);
         }

         if (axxx == null) {
            break;
         }
      }
   }

   static {
      long var11 = a ^ 85196464646674L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("Range".getBytes("ISO-8859-1"));
      String var22 = d(var15).intern();
      int var10001 = -1;
      g = var22;
      p = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "¢(Fþ\u0019ý\u0012f£u§`Ö0Zh*EÙ\u0082\u001fÉË@fÁjLÑÌ¹ý";
      int var5 = "¢(Fþ\u0019ý\u0012f£u§`Ö0Zh*EÙ\u0082\u001fÉË@fÁjLÑÌ¹ý".length();
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
                     h = var6;
                     i = new Integer[6];
                     return;
                  }
                  break;
               default:
                  var18[var10001] = var29;
                  if (var2 < var5) {
                     continue label29;
                  }

                  var4 = "\u0010M\u00807A\u00adßÄ8²¥\\\u008b§©¿";
                  var5 = "\u0010M\u00807A\u00adßÄ8²¥\\\u008b§©¿".length();
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26068;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/gdj", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("cc/astralis/gdj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
