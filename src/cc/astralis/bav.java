package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1268;
import net.minecraft.class_1308;
import net.minecraft.class_1309;
import net.minecraft.class_1427;
import net.minecraft.class_1429;
import net.minecraft.class_1531;
import net.minecraft.class_1646;
import net.minecraft.class_1657;
import net.minecraft.class_1743;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1835;
import net.minecraft.class_1839;
import net.minecraft.class_2189;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3489;
import net.minecraft.class_3965;
import net.minecraft.class_4174;
import net.minecraft.class_9334;
import net.minecraft.class_9362;
import net.minecraft.class_239.class_240;

public class bav implements dlc {
   private static String[] gfy;
   private static final long a = 58786819873865L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public static void fym(double y) {
      chi.field_1724.method_18800(chi.field_1724.method_18798().field_1352, a, chi.field_1724.method_18798().field_1350);
   }

   public static boolean dtz(class_1309 target, float range) {
      long ax = bav.a ^ 100133084961348L;
      int[] var4 = dar.abu();
      float var5;
      int var10000 = (var5 = chi.field_1724.method_5739(a) - a) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1);
      if (var4 != null) {
         if (var10000 > 0) {
            double var6;
            var10000 = (var6 = dgq.flj(a) - a) == 0.0 ? 0 : (var6 < 0.0 ? -1 : 1);
            if (var4 == null) {
               return (boolean)var10000;
            }

            if (var10000 > 0) {
               boolean var8 = chi.field_1724.method_56094(a, a - 3.0F - 0.001);
               if (var4 == null) {
                  return var8;
               }

               if (!var8 && chi.field_1765.method_17783() != class_240.field_1331) {
                  return (boolean)0;
               }
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   public static double hai() {
      return chi.field_1724.method_18798().field_1351;
   }

   public static void any(class_2338 pos) {
      long ax = bav.a ^ 121543848717683L;
      int[] axx = dar.abu();
      class_310 var10000 = chi;
      if (axx != null) {
         if (chi.field_1724 == null) {
            return;
         }

         var10000 = chi;
      }

      if (var10000.field_1687 != null) {
         int axxx = 0;
         class_2680 axxxx = chi.field_1687.method_8320(a);
         int axxxxx = 0;

         while (true) {
            short var10001 = 9385;
            long var10002 = 8108147752403257210L ^ ax;
            if (axxxxx < 9) {
               float var8;
               var7 = (
                        var8 = chi.field_1724.method_31548().method_5438(axxxxx).method_7924(axxxx)
                           - chi.field_1724.method_31548().method_5438(axxx).method_7924(axxxx)
                     )
                     == 0.0F
                  ? 0
                  : (var8 < 0.0F ? -1 : 1);
               if (axx == null) {
                  break;
               }

               label39: {
                  if (axx != null) {
                     if (var7 <= 0) {
                        break label39;
                     }

                     var7 = axxxxx;
                  }

                  axxx = var7;
               }

               axxxxx++;
               if (axx != null) {
                  continue;
               }
            }

            var7 = axxx;
            break;
         }

         if (var7 != chi.field_1724.method_31548().method_67532()) {
            chi.field_1724.method_31548().method_61496(axxx);
         }
      }
   }

   public static float beh() {
      long a = bav.a ^ 132172993574899L;
      int[] var10000 = dar.abu();
      int ax = (int)chi.field_1724.method_23318();
      int[] axx = var10000;

      while (ax > -1) {
         class_2338 axxx = new class_2338((int)chi.field_1724.method_23317(), ax, (int)chi.field_1724.method_23321());
         String axxxx = chi.field_1687.method_8320(axxx).method_26204().method_63499();
         if (axx != null) {
            short var10001 = 904;
            long var10002 = 3004616784619253316L ^ a;
            label45:
            if (!axxxx.contains("short_grass")) {
               var10001 = 6206;
               var10002 = 524736470290707955L ^ a;
               boolean var6 = axxxx.contains("tall_grass");
               if (axx != null) {
                  if (var6 && axx != null) {
                     break label45;
                  }

                  if (axx == null) {
                     return (float)(chi.field_1724.method_23318() - axxx.method_10264()) - 1.0F;
                  }

                  var6 = chi.field_1687.method_8320(axxx).method_26204() instanceof class_2189;
               }

               if (!var6) {
                  return (float)(chi.field_1724.method_23318() - axxx.method_10264()) - 1.0F;
               }
            }

            ax--;
         }

         if (axx == null) {
            break;
         }
      }

      return 0.0F;
   }

   public static void dee() {
      class_2338 a = ((class_3965)chi.field_1765).method_17777().method_10093(((class_3965)chi.field_1765).method_17780());
      chi.field_1761
         .method_2896(
            chi.field_1724,
            class_1268.field_5808,
            new class_3965(
               new class_243(a.method_10263(), a.method_10264(), a.method_10260()),
               ((class_3965)chi.field_1765).method_17780(),
               ((class_3965)chi.field_1765).method_17777(),
               false
            )
         );
   }

   public static boolean dwa() {
      long a = bav.a ^ 56703293689497L;
      class_4174 ax = (class_4174)chi.field_1724.method_31548().method_7391().method_58694(class_9334.field_50075);
      return ax != null;
   }

   public static boolean glo() {
      long a = bav.a ^ 47996847016176L;
      int[] var10000 = dar.abu();
      class_1799 ax = chi.field_1724.method_31548().method_7391();
      int[] axx = var10000;
      class_1792 axxx = ax.method_7909();
      class_1799 var5 = chi.field_1724.method_6030();
      if (axx != null) {
         if (var5.method_7976() == class_1839.field_8949) {
            return true;
         }

         var5 = chi.field_1724.method_31548().method_7391();
      }

      boolean var6 = var5.method_31573(class_3489.field_42611);
      if (axx == null) {
         return var6;
      } else {
         if (!var6) {
            boolean var7 = axxx instanceof class_1743;
            if (axx == null) {
               return var7;
            }

            if (!var7) {
               boolean var8 = axxx instanceof class_9362;
               if (axx == null) {
                  return var8;
               }

               if (!var8) {
                  boolean var9 = axxx instanceof class_1835;
                  if (axx == null) {
                     return var9;
                  }

                  if (!var9) {
                     return false;
                  }
               }
            }
         }

         return true;
      }
   }

   public static boolean bfi() {
      long a = bav.a ^ 94735153922009L;
      int[] var10000 = dar.abu();
      class_2338 ax = chi.field_1724.method_24515();
      int[] axx = var10000;
      int axxx = ax.method_10264() - 1;

      while (true) {
         int var10001 = ax.method_10264();
         short var10002 = 24571;
         long var10003 = 8811632007546023555L ^ a;
         if (axxx >= var10001 - 10) {
            class_2338 axxxx = new class_2338(ax.method_10263(), axxx, ax.method_10260());
            if (axx != null) {
               var6 = chi.field_1687.method_8320(axxxx).method_26215();
               if (axx == null) {
                  break;
               }

               if (!var6) {
                  return false;
               }

               axxx--;
            }

            if (axx != null) {
               continue;
            }
         }

         var6 = true;
         break;
      }

      return var6;
   }

   public static boolean cdc() {
      class_1799 a = chi.field_1724.method_31548().method_7391();
      class_1792 ax = a.method_7909();
      return ax instanceof class_1747;
   }

   public static float faa(class_2338 bp, class_1799 tool) {
      class_1799 ax = chi.field_1724.method_6047();
      chi.field_1724.method_31548().method_67533().set(chi.field_1724.method_31548().method_67532(), a);
      class_2680 axx = chi.field_1687.method_8320(a);
      float axxx = (float)Math.ceil(1.0F / axx.method_26165(chi.field_1724, chi.field_1687, a));
      chi.field_1724.method_31548().method_67533().set(chi.field_1724.method_31548().method_67532(), ax);
      return axxx;
   }

   public static List<class_1309> elv(boolean animals, boolean monsters, boolean ignoreTeammates, boolean invisible, boolean throughWalls, float range) {
      return chi.field_1687.method_8390(class_1309.class, new class_238(chi.field_1724.method_24515()).method_1014(a), axxx -> {
         int[] var8;
         class_1309 var10;
         label250: {
            long ax = bav.a ^ 123581430262988L;
            var8 = dar.abu();
            var10 = axxx;
            if (var8 != null) {
               if (axxx == null) {
                  return false;
               }

               var10 = axxx;
            }

            boolean var9 = var10.method_29504();
            if (var8 == null) {
               return var9;
            }

            if (!var9) {
               boolean var14 = axxx.method_5805();
               if (var8 == null) {
                  return var14;
               }

               if (var14) {
                  var10 = axxx;
                  if (var8 == null) {
                     break label250;
                  }

                  if (axxx.field_6213 <= 0) {
                     var10 = axxx;
                     break label250;
                  }
               }
            }

            return false;
         }

         if (var8 != null) {
            if (var10 == chi.field_1724) {
               return false;
            }

            var10 = axxx;
         }

         boolean var11 = var10 instanceof class_1531;
         if (var8 != null) {
            if (var11) {
               return false;
            }

            var11 = axxx instanceof class_1429;
         }

         if (var8 != null) {
            label195:
            if (!var11) {
               boolean var12 = axxx instanceof class_1646;
               if (var8 != null) {
                  if (var12) {
                     break label195;
                  }

                  var12 = axxx instanceof class_1308;
               }

               if (var8 != null) {
                  label181:
                  if (!var12) {
                     boolean var13 = axxx instanceof class_1427;
                     if (var8 != null) {
                        if (var13) {
                           break label181;
                        }

                        var13 = axxx instanceof class_1657;
                     }

                     label170:
                     if (var8 != null) {
                        if (var13) {
                           var13 = axxx.method_5767();
                           label165:
                           if (var8 != null) {
                              if (var13) {
                                 var13 = a;
                                 if (var8 == null) {
                                    break label165;
                                 }

                                 if (!a) {
                                    return false;
                                 }
                              }

                              var13 = hav.ab(axxx);
                           }

                           label157:
                           if (var8 != null) {
                              if (var13) {
                                 var13 = a;
                                 if (var8 == null) {
                                    break label157;
                                 }

                                 if (a) {
                                    return false;
                                 }
                              }

                              var13 = ejt.cnv((class_1657)axxx);
                           }

                           if (var8 != null) {
                              if (var13) {
                                 return false;
                              }

                              var13 = axxx.method_5820().equals(" ");
                           }

                           if (var8 == null) {
                              break label170;
                           }

                           if (var13) {
                              return false;
                           }
                        }

                        var13 = chi.field_1724.method_6057(axxx);
                     }

                     if (var8 != null) {
                        if (!var13) {
                           if (var8 == null) {
                              return a;
                           }

                           if (!a) {
                              return false;
                           }
                        }

                        var13 = true;
                     }

                     return var13;
                  }

                  var12 = a;
               }

               return var12;
            }

            var11 = a;
         }

         return var11;
      }).stream().sorted(Comparator.comparingDouble(ax -> chi.field_1724.method_5739(ax))).collect(Collectors.toList());
   }

   public static void fky(String[] var0) {
      gfy = var0;
   }

   public static String[] bnv() {
      return gfy;
   }

   static {
      long var11 = a ^ 1966770498620L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[2];
      int var18 = 0;
      String var17 = "g\u008d\téDONóüÝðÅ\u0090\u0096t(oÐJÖu\n4Ì¦¤(BÏã1Û ß+«\u00175Üh\u009ci\u009c\u0004\u009a/\u0088¡¹\u0011M¶HOª\u00117ÞÀ\u0006\u001aÒ\u0001SH";
      int var19 = "g\u008d\téDONóüÝðÅ\u0090\u0096t(oÐJÖu\n4Ì¦¤(BÏã1Û ß+«\u00175Üh\u009ci\u009c\u0004\u009a/\u0088¡¹\u0011M¶HOª\u00117ÞÀ\u0006\u001aÒ\u0001SH"
         .length();
      char var16 = ' ';
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var27 = a(var21).intern();
         int var10001 = -1;
         var20[var18++] = var27;
         if ((var15 += var16) >= var19) {
            b = var20;
            c = new String[2];
            g = new HashMap(13);
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
            String var4 = "\u0094\u007f¿\u001bï\"\u00ad{\u0088\u0004ÆQ\bA\u0004N";
            int var5 = "\u0094\u007f¿\u001bï\"\u00ad{\u0088\u0004ÆQ\bA\u0004N".length();
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

            e = var6;
            f = new Integer[2];
            if (bnv() == null) {
               fky(new String[1]);
            }

            return;
         }

         var16 = var17.charAt(var15);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1655;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/bav", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
         throw new RuntimeException("cc/astralis/bav" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4841;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/bav", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
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
         throw new RuntimeException("cc/astralis/bav" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
