package cc.astralis;

import io.netty.buffer.ByteBuf;
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
import net.minecraft.class_1294;
import net.minecraft.class_241;
import net.minecraft.class_2540;
import net.minecraft.class_2596;
import net.minecraft.class_2658;
import net.minecraft.class_2743;
import net.minecraft.class_2960;
import net.minecraft.class_746;
import org.joml.Vector3d;

public class hba extends guu {
   private final dda hiq = new dda();
   private double aqh = 0.0;
   private long grf = System.currentTimeMillis();
   private static final long a = 49373811742215L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;
   private static final long v;

   public hba() {
      super(bfm.EXPLOIT);
   }

   @gdz
   public void bac(elx event) {
      long ax = hba.a ^ 21398917018135L;
      int[] var10000 = dar.abu();
      class_746 axx = chi.field_1724;
      int[] axxx = var10000;
      if (axx != null && chi.field_1687 != null) {
         var11 = axx.method_24828();
         label91:
         if (axxx != null) {
            if (var11 != 0) {
               double var16;
               var11 = (var16 = a.hiq.cyd.y - 0.0) == 0.0 ? 0 : (var16 < 0.0 ? -1 : 1);
               if (axxx == null) {
                  break label91;
               }

               if (var11 < 0) {
                  a.hiq.cyd.set(0.0, 0.0, 0.0);
               }
            }

            double var17;
            var11 = (var17 = a.cqr() - 0.42F) == 0.0 ? 0 : (var17 < 0.0 ? -1 : 1);
         }

         if (var11 == 0) {
            a.aqh = Math.min(a.aqh + 1.0, 3.0);
            a.hiq.bnj.add(0.0, 8.0, 0.0);
         }

         double var15;
         label83: {
            label82: {
               int var10001 = axx.method_24828();
               if (axxx != null) {
                  if (var10001 == 0) {
                     break label82;
                  }

                  var10001 = axx.field_6012;
               }

               if (var10001 > 5) {
                  var15 = 0.0;
                  break label83;
               }
            }

            var15 = a.aqh;
         }

         label74: {
            a.aqh = var15;
            long var18;
            int var12 = (var18 = a.grf - System.currentTimeMillis()) == 0L ? 0 : (var18 < 0L ? -1 : 1);
            if (axxx != null) {
               if (var12 > 0) {
                  var13 = 1.0;
                  break label74;
               }

               var12 = axx.method_6115();
            }

            var13 = var12 != 0 ? 0.06 : 0.26 + 0.025 * a.aqh;
         }

         double axxxx;
         label97: {
            axxxx = var13;
            int var14 = axx.method_6059(class_1294.field_5904);
            if (axxx != null) {
               if (var14 == 0) {
                  break label97;
               }

               var14 = axx.method_6112(class_1294.field_5904).method_5578();
            }

            int axxxxx = var14;
            axxxx += axxxxx == 0 ? 0.14 : 0.28;
         }

         Vector3d axxxxx = a.ays(axxxx);
         a.hiq.csi = 2.0;
         Vector3d axxxxxx = a.hiq.bnv();
         a.dof(axxxxx.x);
         a.ftl(axxxxxx.y * 0.03333333333333333);
         a.gni(axxxxx.z);
      }
   }

   @gdz
   public void eev(amo event) {
      long ax;
      int[] axx;
      class_2596 var11;
      label60: {
         class_2596 axxx;
         label61: {
            ax = hba.a ^ 48852420790473L;
            axx = dar.abu();
            amo var10000 = a;
            if (axx != null) {
               if (a.cud() == gpy.RECEIVE) {
                  axxx = a.bed();
                  var10 = axxx instanceof class_2743;
                  if (axx == null) {
                     break label61;
                  }

                  if (var10 != 0) {
                     class_2743 axxxx = (class_2743)axxx;
                     var10 = axxxx.method_11818();
                     if (axx == null) {
                        break label61;
                     }

                     if (var10 == chi.field_1724.method_5628()) {
                        a.grf = System.currentTimeMillis() + v;
                     }
                  }
               }

               var10000 = a;
            }

            axxx = var10000.bed();
            var11 = axxx;
            if (axx == null) {
               break label60;
            }

            var10 = axxx instanceof class_2658;
         }

         if (var10 == 0) {
            return;
         }

         var11 = axxx;
      }

      class_2658 axxxxx = (class_2658)var11;
      class_2960 axxxxxx = axxxxx.method_65080().comp_2231();
      String var12 = axxxxxx.method_12836();
      short var10001 = 2384;
      long var10002 = 5504979438591897282L ^ ax;
      boolean var13 = var12.equals("bloxd");
      if (axx != null) {
         if (!var13) {
            return;
         }

         String var14 = axxxxxx.method_12832();
         var10001 = 11792;
         var10002 = 8852173258696018307L ^ ax;
         var13 = var14.equals("resyncphysics");
      }

      if (var13) {
         class_2540 axxxxxxx = new class_2540((ByteBuf)axxxxx.comp_1646());
         a.aqh = 0.0;
         a.hiq.bnj.set(0.0, 0.0, 0.0);
         a.hiq.gdf.set(0.0, 0.0, 0.0);
         a.hiq.cyd.set(axxxxxxx.readFloat(), axxxxxxx.readFloat(), axxxxxxx.readFloat());
      }
   }

   private Vector3d ays(double a) {
      float ax;
      float axx;
      float axxx;
      float var15;
      float var10001;
      label108: {
         long axxxx;
         int[] axxxxx;
         axxxx = hba.a ^ 73027060605391L;
         int[] var10000 = dar.abu();
         class_241 axxxxxx = chi.field_1724.field_3913.method_3128();
         ax = axxxxxx.field_1342;
         axx = axxxxxx.field_1343;
         axxx = chi.field_1724.method_36454();
         axxxxx = var10000;
         float var27;
         var14 = (var27 = ax - 0.0F) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1);
         label98:
         if (axxxxx != null) {
            if (!var14) {
               float var28;
               var14 = (var28 = axx - 0.0F) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
               if (axxxxx == null) {
                  break label98;
               }

               if (!var14) {
                  return new Vector3d(0.0, 0.0, 0.0);
               }
            }

            var15 = ax;
            var10001 = 0.0F;
            if (axxxxx == null) {
               break label108;
            }

            float var29;
            var14 = (var29 = ax - 0.0F) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
         }

         if (var14) {
            label86: {
               label104: {
                  label105: {
                     float var30;
                     var16 = (var30 = axx - 0.0F) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
                     if (axxxxx != null) {
                        if (var16 > 0) {
                           float var31;
                           int var18 = (var31 = ax - 0.0F) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
                           if (axxxxx != null) {
                              if (var18 > 0) {
                                 short var19 = 30265;
                                 long var10002 = 8175003037628520949L ^ axxxx;
                                 var18 = -45;
                              } else {
                                 short var20 = 27860;
                                 long var24 = 5756842712019714842L ^ axxxx;
                                 var18 = 45;
                              }
                           }

                           axxx += var18;
                           if (axxxxx != null) {
                              break label105;
                           }
                        }

                        float var32;
                        var16 = (var32 = axx - 0.0F) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
                     }

                     if (axxxxx == null) {
                        break label104;
                     }

                     if (var16 < 0) {
                        float var33;
                        int var21 = (var33 = ax - 0.0F) == 0.0F ? 0 : (var33 < 0.0F ? -1 : 1);
                        if (axxxxx != null) {
                           if (var21 > 0) {
                              short var22 = 18134;
                              long var25 = 4423536969941641499L ^ axxxx;
                              var21 = 45;
                           } else {
                              short var23 = 27914;
                              long var26 = 6374836723052036805L ^ axxxx;
                              var21 = -45;
                           }
                        }

                        axxx += var21;
                     }
                  }

                  axx = 0.0F;
                  var15 = ax;
                  if (axxxxx == null) {
                     break label86;
                  }

                  float var34;
                  var16 = (var34 = ax - 0.0F) == 0.0F ? 0 : (var34 < 0.0F ? -1 : 1);
               }

               var15 = var16 > 0 ? 1.0F : -1.0F;
            }

            ax = var15;
         }

         var15 = axxx;
         var10001 = 90.0F;
      }

      double axxxxxxx = Math.sin(Math.toRadians(var15 + var10001));
      double axxxxxxxx = Math.cos(Math.toRadians(axxx + 90.0F));
      return new Vector3d(ax * a * axxxxxxxx + axx * a * axxxxxxx, 0.0, ax * a * axxxxxxx - axx * a * axxxxxxxx);
   }

   static {
      long var16 = a ^ 99080657576018L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var19 = 1; var19 < 8; var19++) {
         var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[2];
      int var23 = 0;
      String var22 = "¾f\u0000¤\u009cÛ ÍÇ\u0000\u0096¦b4£Ý £\u0082A\\\rÒhë~ð\u0095áW\u0095xÀ\u0096îÚ´»ò&ÖN¯Ê\u0001a@ÙN";
      int var24 = "¾f\u0000¤\u009cÛ ÍÇ\u0000\u0096¦b4£Ý £\u0082A\\\rÒhë~ð\u0095áW\u0095xÀ\u0096îÚ´»ò&ÖN¯Ê\u0001a@ÙN".length();
      char var21 = 16;
      int var20 = -1;

      while (true) {
         byte[] var26 = var18.doFinal(var22.substring(++var20, var20 + var21).getBytes("ISO-8859-1"));
         String var37 = d(var26).intern();
         int var10001 = -1;
         var25[var23++] = var37;
         if ((var20 += var21) >= var24) {
            g = var25;
            h = new String[2];
            r = new HashMap(13);
            Cipher var5;
            var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var6 = 1; var6 < 8; var6++) {
               var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var11 = new long[4];
            int var8 = 0;
            String var9 = "-ñy<\b\nª$¤\u00adã\u001dµJMJ";
            int var10 = "-ñy<\b\nª$¤\u00adã\u001dµJMJ".length();
            byte var7 = 0;

            label42:
            while (true) {
               var10001 = var7;
               var7 += 8;
               byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
               long[] var30 = var11;
               var10001 = var8++;
               long var40 = (var12[0] & 255L) << 56
                  | (var12[1] & 255L) << 48
                  | (var12[2] & 255L) << 40
                  | (var12[3] & 255L) << 32
                  | (var12[4] & 255L) << 24
                  | (var12[5] & 255L) << 16
                  | (var12[6] & 255L) << 8
                  | var12[7] & 255L;
               byte var45 = -1;

               while (true) {
                  long var13 = var40;
                  byte[] var15 = var5.doFinal(
                     new byte[]{
                        (byte)(var13 >>> 56),
                        (byte)(var13 >>> 48),
                        (byte)(var13 >>> 40),
                        (byte)(var13 >>> 32),
                        (byte)(var13 >>> 24),
                        (byte)(var13 >>> 16),
                        (byte)(var13 >>> 8),
                        (byte)var13
                     }
                  );
                  long var48 = (var15[0] & 255L) << 56
                     | (var15[1] & 255L) << 48
                     | (var15[2] & 255L) << 40
                     | (var15[3] & 255L) << 32
                     | (var15[4] & 255L) << 24
                     | (var15[5] & 255L) << 16
                     | (var15[6] & 255L) << 8
                     | var15[7] & 255L;
                  switch (var45) {
                     case 0:
                        var30[var10001] = var48;
                        if (var7 >= var10) {
                           p = var11;
                           q = new Integer[4];
                           Cipher var0;
                           var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                           var10002 = SecretKeyFactory.getInstance("DES");
                           var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                           for (int var1 = 1; var1 < 8; var1++) {
                              var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
                           }

                           var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                           long var2 = -8296878563662478392L;
                           byte[] var4 = var0.doFinal(
                              new byte[]{
                                 (byte)(var2 >>> 56),
                                 (byte)(var2 >>> 48),
                                 (byte)(var2 >>> 40),
                                 (byte)(var2 >>> 32),
                                 (byte)(var2 >>> 24),
                                 (byte)(var2 >>> 16),
                                 (byte)(var2 >>> 8),
                                 (byte)var2
                              }
                           );
                           long var43 = (var4[0] & 255L) << 56
                              | (var4[1] & 255L) << 48
                              | (var4[2] & 255L) << 40
                              | (var4[3] & 255L) << 32
                              | (var4[4] & 255L) << 24
                              | (var4[5] & 255L) << 16
                              | (var4[6] & 255L) << 8
                              | var4[7] & 255L;
                           byte var36 = -1;
                           v = var43;
                           return;
                        }
                        break;
                     default:
                        var30[var10001] = var48;
                        if (var7 < var10) {
                           continue label42;
                        }

                        var9 = "Á£=Þ\u001d\u000f¸\u0015À:\fb\u0090»øÃ";
                        var10 = "Á£=Þ\u001d\u000f¸\u0015À:\fb\u0090»øÃ".length();
                        var7 = 0;
                  }

                  byte var35 = var7;
                  var7 += 8;
                  var12 = var9.substring(var35, var7).getBytes("ISO-8859-1");
                  var30 = var11;
                  var10001 = var8++;
                  var40 = (var12[0] & 255L) << 56
                     | (var12[1] & 255L) << 48
                     | (var12[2] & 255L) << 40
                     | (var12[3] & 255L) << 32
                     | (var12[4] & 255L) << 24
                     | (var12[5] & 255L) << 16
                     | (var12[6] & 255L) << 8
                     | var12[7] & 255L;
                  var45 = 0;
               }
            }
         }

         var21 = var22.charAt(var20);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31068;
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
            throw new RuntimeException("cc/astralis/hba", var10);
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
         throw new RuntimeException("cc/astralis/hba" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6148;
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
            throw new RuntimeException("cc/astralis/hba", var14);
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
         throw new RuntimeException("cc/astralis/hba" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
