package cc.astralis;

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
import net.minecraft.class_1657;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_2189;
import net.minecraft.class_2338;

public class cgk extends fwu {
   private static final long a = 119983032481739L;
   private static final String f;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map j;

   public cgk() {
      long a = cgk.a ^ 66207762676094L;
      super(f);
   }

   @Override
   public void ayy(eih event) {
      long ax = cgk.a ^ 100763245794470L;
      int[] var10000 = dar.abu();
      class_1657 axx = a.bv().fyt;
      int[] axxx = var10000;
      class_1657 var9 = axx;
      if (axxx != null) {
         if (axx == null) {
            return;
         }

         var9 = axx;
      }

      label138: {
         short var13;
         label132: {
            var10 = var9.field_6252;
            label131:
            if (axxx != null) {
               if (var9.field_6252) {
                  float var18;
                  var10 = (var18 = axx.method_36455() - 70.0F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
                  if (axxx == null) {
                     break label131;
                  }

                  label127:
                  if (var10 >= 0) {
                     class_1799 var11 = axx.method_6030();
                     if (axxx != null) {
                        if (var11 == null) {
                           break label127;
                        }

                        var11 = axx.method_6030();
                     }

                     var10 = var11.method_7909() instanceof class_1747;
                     if (axxx == null) {
                        break label131;
                     }

                     if (var10 != 0) {
                        var10 = a.bv().djk;
                        var13 = 17426;
                        long var10002 = 7369398860343329682L ^ ax;
                        var13 = 20;
                        if (axxx == null) {
                           break label132;
                        }

                        if (var10 >= 20) {
                           var10 = axx.field_6012 - a.bv().gab;
                           var13 = 17734;
                           var10002 = 8773297530687996615L ^ ax;
                           var13 = 30;
                           if (axxx == null) {
                              break label132;
                           }

                           if (var10 >= 30) {
                              var10 = axx.field_6012 - a.bv().dfw;
                              var13 = 22600;
                              var10002 = 3664928059452284875L ^ ax;
                              var13 = 20;
                              if (axxx == null) {
                                 break label132;
                              }

                              if (var10 >= 20) {
                                 boolean axxxx = true;
                                 class_2338 axxxxx = axx.method_24515().method_10087(2);
                                 int axxxxxx = 0;

                                 label111: {
                                    while (axxxxxx < 4) {
                                       var10 = dlc.chi.field_1687.method_8320(axxxxx).method_26204() instanceof class_2189;
                                       if (axxx == null) {
                                          break label111;
                                       }

                                       label107: {
                                          if (axxx != null) {
                                             if (var10 != 0) {
                                                break label107;
                                             }

                                             var10 = 0;
                                          }

                                          axxxx = (boolean)var10;
                                          if (axxx != null) {
                                             break;
                                          }
                                       }

                                       axxxxx = axxxxx.method_10074();
                                       axxxxxx++;
                                       if (axxx == null) {
                                          break;
                                       }
                                    }

                                    var10 = axxxx;
                                 }

                                 if (axxx == null) {
                                    break label131;
                                 }

                                 if (var10 != 0) {
                                    a.grm();
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               var12 = a;
               if (axxx == null) {
                  break label138;
               }

               var10 = a.bv().gjk;
            }

            var13 = 3;
         }

         if (var10 < var13) {
            return;
         }

         var12 = a;
      }

      var12.grm();
   }

   static {
      long var11 = a ^ 122368411084113L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("Scaffold".getBytes("ISO-8859-1"));
      String var19 = b(var15).intern();
      int var10001 = -1;
      f = var19;
      j = new HashMap(13);
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
      String var4 = "d.9\u008a\u007fg\u007fîG\u000bÞÞmýT\u008d\u008d2\u009f{E\t¼×";
      int var5 = "d.9\u008a\u007fg\u007fîG\u000bÞÞmýT\u008d\u008d2\u009f{E\t¼×".length();
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

      g = var6;
      h = new Integer[3];
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25836;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/cgk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("cc/astralis/cgk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
