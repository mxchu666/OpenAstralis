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
import net.minecraft.class_1661;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2189;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;

public class amg implements dlc {
   private static final long a = 67509153110099L;
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   public static fux[] fww(boolean ignoreOffhand) {
      long ax;
      int[] axx;
      ArrayList axxx;
      byte var14;
      ax = amg.a ^ 57662330064475L;
      int[] var10000 = dar.abu();
      axxx = new ArrayList();
      axx = var10000;
      var14 = a;
      label65:
      if (axx != null) {
         if (a == 0) {
            class_1661 var15 = chi.field_1724.method_31548();
            short var10001 = 25538;
            long var10002 = 7491535500215213857L ^ ax;
            class_1799 axxxx = var15.method_5438(40);
            class_1792 axxxxx = axxxx.method_7909();
            var14 = axxxxx instanceof class_1747;
            if (axx == null) {
               break label65;
            }

            if (var14 != 0) {
               class_1747 axxxxxx = (class_1747)axxxxx;
               class_2248 axxxxxxx = axxxxxx.method_7711();
               var14 = ayj(axxxxxxx);
               if (axx == null) {
                  break label65;
               }

               if (var14 != 0) {
                  axxx.add(new fux(0, class_1268.field_5810));
               }
            }
         }

         var14 = 0;
      }

      int axxxxxxxx = var14;

      do {
         short var16 = 12348;
         long var17 = 7879215430212947164L ^ ax;
         if (axxxxxxxx >= 9) {
            break;
         }

         class_1799 axxxxxxxxx = (class_1799)chi.field_1724.method_31548().method_67533().get(axxxxxxxx);
         class_1792 axxxxxxxxxx = axxxxxxxxx.method_7909();
         if (axx != null) {
            if (axxxxxxxxxx instanceof class_1747 axxxxxxxxxxx) {
               if (axx == null) {
                  continue;
               }

               if (axxxxxxxxx.method_7947() > 0) {
                  class_2248 axxxxxxxxxxxx = axxxxxxxxxxx.method_7711();
                  if (axx == null) {
                     continue;
                  }

                  if (ayj(axxxxxxxxxxxx)) {
                     axxx.add(new fux(axxxxxxxx, class_1268.field_5808));
                  }
               }
            }

            axxxxxxxx++;
         }
      } while (axx != null);

      return axxx.toArray(new fux[0]);
   }

   public static int dzc(fux slot) {
      long ax = amg.a ^ 109662325625037L;
      int[] var3 = dar.abu();
      Object var10000 = a.gee();
      if (var3 != null) {
         if (var10000 == class_1268.field_5810) {
            var10000 = chi.field_1724.method_31548();
            short var10001 = 19022;
            long var10002 = 1019408584055482426L ^ ax;
            return var10000.method_5438(40).method_7947();
         }

         var10000 = chi.field_1724.method_31548().method_67533().get(a.aqk());
      }

      return ((class_1799)var10000).method_7947();
   }

   public static fux bdh(boolean ignore) {
      long ax = amg.a ^ 25954761714492L;
      int[] var10000 = dar.abu();
      fux[] axx = fww(a);
      int[] axxx = var10000;
      fux[] var5 = axx;
      if (axxx != null) {
         if (axx.length <= 0) {
            return new fux(-1, class_1268.field_5808);
         }

         var5 = axx;
      }

      return var5[0];
   }

   public static class_2680 dul(double offsetX, double offsetY, double offsetZ) {
      class_2338 ax = chi.field_1724.method_24515();
      return chi.field_1687.method_8320(ax.method_10069((int)a, (int)a, (int)a));
   }

   public static boolean gmi(class_2338 pos) {
      return chi.field_1687.method_8320(a).method_26204() instanceof class_2189;
   }

   public static aqy asc(int baseY) {
      long ax = amg.a ^ 84071774355004L;
      int[] var10000 = dar.abu();
      class_2338 axx = new class_2338(chi.field_1724.method_31477(), a, chi.field_1724.method_31479()).method_10074();
      int[] axxx = var10000;
      byte var30 = gmi(axx);
      if (axxx != null) {
         if (var30 == 0) {
            return null;
         }

         var30 = 4;
      }

      var10000 = new int[var30];
      var10000[0] = 0;
      var10000[1] = 1;
      var10000[2] = 2;
      var10000[3] = 3;
      int[] axxxx = var10000;
      int[] axxxxx = new int[]{1, -1};
      int[] var7 = axxxx;
      int var8 = axxxx.length;
      int var9 = 0;

      do {
         int var32 = var9;

         label103:
         while (true) {
            if (var32 >= var8) {
               return null;
            }

            int axxxxxx = var7[var9];
            int[] var11 = axxxx;
            int var12 = axxxx.length;
            int var13 = 0;

            while (true) {
               int var33 = var13;

               label98:
               while (true) {
                  if (var33 >= var12) {
                     break label103;
                  }

                  int axxxxxxx = var11[var13];
                  int[] var15 = axxxx;
                  int var16 = axxxx.length;
                  var32 = 0;
                  if (axxx == null) {
                     continue label103;
                  }

                  int var17 = 0;

                  while (true) {
                     int var34 = var17;

                     label93:
                     while (true) {
                        if (var34 >= var16) {
                           break label98;
                        }

                        int axxxxxxxx = var15[var17];
                        int[] var19 = axxxxx;
                        int var20 = axxxxx.length;
                        var33 = 0;
                        if (axxx == null) {
                           continue label98;
                        }

                        int var21 = 0;

                        while (true) {
                           int var35 = var21;

                           label88: {
                              label87:
                              while (true) {
                                 if (var35 >= var20) {
                                    break label93;
                                 }

                                 int axxxxxxxxx = var19[var21];
                                 class_2338 axxxxxxxxxx = axx.method_10069(axxxxxx * axxxxxxxxx, axxxxxxx * axxxxxxxxx, axxxxxxxx * axxxxxxxxx);
                                 if (axxx == null) {
                                    break label88;
                                 }

                                 var34 = gmi(axxxxxxxxxx);
                                 if (axxx == null) {
                                    continue label93;
                                 }

                                 if (var34 == 0) {
                                    break;
                                 }

                                 class_2350[] var24 = class_2350.values();
                                 int var25 = var24.length;
                                 int var26 = 0;

                                 while (true) {
                                    if (var26 >= var25) {
                                       break label87;
                                    }

                                    class_2350 axxxxxxxxxxx = var24[var26];
                                    class_2338 axxxxxxxxxxxx = axxxxxxxxxx.method_10093(axxxxxxxxxxx);
                                    class_2680 axxxxxxxxxxxxx = chi.field_1687.method_8320(axxxxxxxxxxxx);
                                    if (axxx != null) {
                                       var35 = ayj(axxxxxxxxxxxxx.method_26204());
                                       if (axxx == null) {
                                          break;
                                       }

                                       if (var35 != 0) {
                                          return new aqy(axxxxxxxxxxxx, axxxxxxxxxxx.method_10153());
                                       }

                                       var26++;
                                    }

                                    if (axxx == null) {
                                       break label87;
                                    }
                                 }
                              }

                              var21++;
                           }

                           if (axxx == null) {
                              break label93;
                           }
                        }
                     }

                     var17++;
                     if (axxx == null) {
                        break label98;
                     }
                  }
               }

               var13++;
               if (axxx == null) {
                  break label103;
               }
            }
         }

         var9++;
      } while (axxx != null);

      return null;
   }

   public static boolean ayj(class_2248 block) {
      long ax = amg.a ^ 2118371842433L;
      int[] axx = dar.abu();
      class_2248 var10000 = a;
      if (axx != null) {
         if (a == null) {
            return false;
         }

         var10000 = a;
      }

      if (axx != null) {
         if (var10000 == class_2246.field_10124) {
            return false;
         }

         var10000 = a;
      }

      class_2680 axxx = var10000.method_9564();
      var10000 = a;
      if (axx != null) {
         if (a.method_63499().contains(b)) {
            return false;
         }

         var10000 = a;
      }

      class_2248 var10001 = class_2246.field_10375;
      if (axx != null) {
         if (var10000 == class_2246.field_10375) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10179;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10327;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10525;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10263;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10395;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10465;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_16540;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10499;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_31037;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10260;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10102;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10255;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10534;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10535;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10105;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10414;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10081;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_16492;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10479;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10214;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10343;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_28048;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10181;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_16333;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_16334;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_9980;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_46797;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10200;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10228;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10312;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10333;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10485;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10443;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10034;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_23152;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_23261;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10560;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10615;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10282;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_22422;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10348;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10363;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10450;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10377;
      }

      if (axx != null) {
         if (var10000 == var10001) {
            return false;
         }

         var10000 = a;
         var10001 = class_2246.field_10429;
      }

      return var10000 != var10001 ? axxx.method_51367() : false;
   }

   static {
      long var11 = a ^ 111547012650265L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("button".getBytes("ISO-8859-1"));
      String var19 = a(var15).intern();
      int var10001 = -1;
      b = var19;
      e = new HashMap(13);
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
      String var4 = "lF;>Ål¡säd·AÖ.¥S_OO |ë\u000b¼";
      int var5 = "lF;>Ål¡säd·AÖ.¥S_OO |ë\u000b¼".length();
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
         byte var22 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      c = var6;
      d = new Integer[3];
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27370;
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
            throw new RuntimeException("cc/astralis/amg", var14);
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
         throw new RuntimeException("cc/astralis/amg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
