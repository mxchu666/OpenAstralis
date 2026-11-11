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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1041;

public class gxk extends cec implements dlc {
   private static final Map<String, bcc> bzn;
   private static final long a = 116726582573261L;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e = new HashMap(13);

   @gdz
   public void bxt(ctt e) {
      long ax = gxk.a ^ 2918218087257L;
      int[] axx = dar.abu();
      if (!bzn.isEmpty()) {
         class_1041 axxx = chi.method_22683();
         int axxxx = axxx.method_4486();
         int axxxxx = axxx.method_4502();
         float axxxxxx = axxxx / 2.0F;
         float axxxxxxx = axxxxx / 2.0F + 30.0F;
         List<String> axxxxxxxx = new ArrayList<>();
         Iterator var11 = bzn.entrySet().iterator();

         while (true) {
            if (var11.hasNext()) {
               Entry<String, bcc> axxxxxxxxx = (Entry<String, bcc>)var11.next();
               String axxxxxxxxxx = axxxxxxxxx.getKey();
               bcc axxxxxxxxxxx = axxxxxxxxx.getValue();
               axxxxxxxxxxx.atv(axxxxxxxxxxx.hbi() + (axxxxxxxxxxx.ces() - axxxxxxxxxxx.hbi()) * 0.2F);
               if (axx == null) {
                  break;
               }

               int var10000;
               var10000 = axxxxxxxxxxx.bsc();
               label144:
               if (axx != null) {
                  if (var10000 == 0) {
                     float var31;
                     var10000 = (var31 = axxxxxxxxxxx.ces() - 0.999F) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
                     if (axx == null) {
                        break label144;
                     }

                     if (var10000 >= 0) {
                        float var32;
                        var10000 = (var32 = axxxxxxxxxxx.hbi() - 0.999F) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
                        if (axx == null) {
                           break label144;
                        }

                        if (var10000 >= 0) {
                           axxxxxxxxxxx.cqy(true);
                           axxxxxxxxxxx.ceg(true);
                        }
                     }
                  }

                  float var33;
                  var10000 = (var33 = axxxxxxxxxxx.ces() - 0.0F) == 0.0F ? 0 : (var33 < 0.0F ? -1 : 1);
               }

               label133:
               if (axx != null) {
                  if (var10000 <= 0) {
                     float var34;
                     var10000 = (var34 = axxxxxxxxxxx.hbi() - 0.001F) == 0.0F ? 0 : (var34 < 0.0F ? -1 : 1);
                     if (axx == null) {
                        break label133;
                     }

                     if (var10000 <= 0) {
                        var10000 = 0;
                        break label133;
                     }
                  }

                  var10000 = 1;
               }

               label125: {
                  label157: {
                     boolean axxxxxxxxxxxx = (boolean)var10000;
                     var10000 = axxxxxxxxxxx.dzr();
                     if (axx != null) {
                        if (var10000 != 0) {
                           break label157;
                        }

                        var10000 = axxxxxxxxxxxx;
                     }

                     if (axx == null) {
                        break label125;
                     }

                     if (var10000 != 0) {
                        var10000 = 1;
                        break label125;
                     }
                  }

                  var10000 = 0;
               }

               float axxxxxxxxxxxxx;
               label158: {
                  boolean axxxxxxxxxxxxxx = (boolean)var10000;
                  axxxxxxxxxxx.hdn().dwm(axxxxxxxxxxxxxx != 0 ? 1.0 : 0.0);
                  axxxxxxxxxxxxx = (float)axxxxxxxxxxx.hdn().hjo();
                  var10000 = axxxxxxxxxxx.dzr();
                  label112:
                  if (axx != null) {
                     if (var10000 != 0) {
                        float var35;
                        var10000 = (var35 = axxxxxxxxxxxxx - 0.0F) == 0.0F ? 0 : (var35 < 0.0F ? -1 : 1);
                        if (axx == null) {
                           break label112;
                        }

                        if (var10000 <= 0) {
                           axxxxxxxx.add(axxxxxxxxxx);
                           if (axx != null) {
                              continue;
                           }
                        }
                     }

                     if (axx == null) {
                        break label158;
                     }

                     float var36;
                     var10000 = (var36 = axxxxxxxxxxxxx - 0.0F) == 0.0F ? 0 : (var36 < 0.0F ? -1 : 1);
                  }

                  if (var10000 <= 0) {
                     continue;
                  }

                  float var27 = 200.0F;
               }

               float axxxxxxxxxxxxxxx = 8.0F;
               float axxxxxxxxxxxxxxxx = axxxxxx - 100.0F;
               float axxxxxxxxxxxxxxxxx = axxxxxxx;
               dmp.hdn();
               float axxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxxx + 100.0F;
               float axxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxxxx + 4.0F;
               dmp.gpu(axxxxxxxxxxxxxxxxxx, axxxxxxxxxxxxxxxxxxx);
               dmp.fle(axxxxxxxxxxxxx, axxxxxxxxxxxxx);
               dmp.gpu(-axxxxxxxxxxxxxxxxxx, -axxxxxxxxxxxxxxxxxxx);
               short var10007 = 23726;
               long var10008 = 1754910620952346381L ^ ax;
               short var29 = 12014;
               long var10009 = 2987962235928530252L ^ ax;
               short var30 = 12014;
               long var10010 = 2987962235928530252L ^ ax;
               dmp.cpp(axxxxxxxxxxxxxxxx, axxxxxxxxxxxxxxxxx, 200.0F, 8.0F, 4.0F, new Color(25, 25, 25));
               float axxxxxxxxxxxxxxxxxxxx = axxxxxxxxxxx.hbi() * 200.0F;
               float var28 = axxxxxxxxxxxxxxxxxxxx;
               float var10001 = 0.1F;
               if (axx != null) {
                  if (axxxxxxxxxxxxxxxxxxxx > 0.1F) {
                     dmp.abh(
                        axxxxxxxxxxxxxxxx,
                        axxxxxxxxxxxxxxxxx,
                        axxxxxxxxxxxxxxxxxxxx,
                        8.0F,
                        () -> dmp.aho(a, a, 200.0F, 8.0F, 4.0F, dar.gqy().deo(), dar.gqy().cxj(), false)
                     );
                  }

                  dmp.bzg();
                  var28 = axxxxxxx;
                  var10001 = 16.0F;
               }

               axxxxxxx = var28 + var10001;
               if (axx != null) {
                  continue;
               }
            }

            axxxxxxxx.forEach(bzn::remove);
            break;
         }
      }
   }

   public static void fcv(String id) {
      bzn.computeIfAbsent(a, bcc::new);
   }

   public static void gbu(String id, float progress) {
      long ax = gxk.a ^ 80797800198087L;
      int[] var10000 = dar.abu();
      bcc axx = bzn.get(a);
      int[] axxx = var10000;
      bcc var6 = axx;
      if (axxx != null) {
         if (axx == null) {
            return;
         }

         var6 = axx;
      }

      label37: {
         label36: {
            if (axxx != null) {
               if (!var6.dzr()) {
                  var7 = axx;
                  if (axxx == null) {
                     break label37;
                  }

                  if (!axx.bsc()) {
                     break label36;
                  }
               }

               axx.cqy(false);
               axx.ceg(false);
               var6 = axx;
            }

            var6.hdn().dsw();
         }

         var7 = axx;
      }

      var7.dgw(a);
   }

   public static void dfh(String id) {
      long ax = gxk.a ^ 58768876414996L;
      int[] var10000 = dar.abu();
      bcc axx = bzn.get(a);
      int[] axxx = var10000;
      bcc var5 = axx;
      if (axxx != null) {
         if (axx == null) {
            return;
         }

         axx.cqy(true);
         var5 = axx;
      }

      var5.ceg(true);
   }

   public static void hil() {
      bzn.clear();
   }

   static {
      long var0 = a ^ 112893599031298L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[2];
      int var5 = 0;
      String var6 = "ÐÜíÍ+è'¢âûÎDÞ\u0011Ó=";
      int var7 = "ÐÜíÍ+è'¢âûÎDÞ\u0011Ó=".length();
      byte var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = (var9[0] & 255L) << 56
            | (var9[1] & 255L) << 48
            | (var9[2] & 255L) << 40
            | (var9[3] & 255L) << 32
            | (var9[4] & 255L) << 24
            | (var9[5] & 255L) << 16
            | (var9[6] & 255L) << 8
            | var9[7] & 255L;
         byte[] var12 = var2.doFinal(
            new byte[]{
               (byte)(var10 >>> 56),
               (byte)(var10 >>> 48),
               (byte)(var10 >>> 40),
               (byte)(var10 >>> 32),
               (byte)(var10 >>> 24),
               (byte)(var10 >>> 16),
               (byte)(var10 >>> 8),
               (byte)var10
            }
         );
         long var10004 = (var12[0] & 255L) << 56
            | (var12[1] & 255L) << 48
            | (var12[2] & 255L) << 40
            | (var12[3] & 255L) << 32
            | (var12[4] & 255L) << 24
            | (var12[5] & 255L) << 16
            | (var12[6] & 255L) << 8
            | var12[7] & 255L;
         byte var14 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      c = var8;
      d = new Integer[2];
      bzn = new LinkedHashMap<>();
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8247;
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
            throw new RuntimeException("cc/astralis/gxk", var14);
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
         throw new RuntimeException("cc/astralis/gxk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
