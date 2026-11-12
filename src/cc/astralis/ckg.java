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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ckg extends fig {
   public final List<fig> ais;
   private final List<ckg> hif;
   final erp dmy;
   private boolean cxl;
   boolean btb;
   private final guu dty;
   public boolean dfv;
   private static final long a = 112272164732023L;
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;
   private static final long f;

   public ckg(guu module, List<ckg> moduleComponentList) {
      long ax = ckg.a ^ 34159078128993L;
      super();
      a.ais = new ArrayList<>();
      a.dmy = new erp(dtw.EASE_IN_OUT_QUAD, f);
      a.cxl = true;
      a.btb = false;
      int[] var10000 = dar.abu();
      a.dty = a;
      int[] axx = var10000;
      a.hif = a;
      a.dfv = false;

      for (ffn<?> axxx : a.cbf()) {
         a.adl(axxx);
         if (axx == null) {
            break;
         }
      }
   }

   @Override
   public void bfi(float mouseX, float mouseY) {
      long ax;
      int[] axx;
      label139: {
         ax = ckg.a ^ 6065496822340L;
         int[] var10000 = dar.abu();
         short var10003 = 2263;
         long var10004 = 7806804752648392750L ^ ax;
         short var23 = 3891;
         long var10005 = 4554303629488347087L ^ ax;
         short var26 = 3891;
         long var10006 = 4554303629488347087L ^ ax;
         Color axxx = new Color(30, 30, 30);
         axx = var10000;
         ckg var14 = a;
         if (axx != null) {
            if (!a.dty.dsv()) {
               dmp.euv(a.hjg(), a.dtt(), a.av(), a.gqc(), axxx);
               if (axx != null) {
                  break label139;
               }
            }

            var14 = a;
         }

         dmp.dyl(var14.hjg(), a.dtt(), a.av(), a.gqc(), dar.gqy().deo(), dar.gqy().cxj(), false);
      }

      short var10002 = 8076;
      long var21 = 8637173186845329270L ^ ax;
      short var22 = 14906;
      long var24 = 6485026104294007490L ^ ax;
      short var25 = 14906;
      long var27 = 6485026104294007490L ^ ax;
      Color axxx = new Color(245, 245, 245);
      cbl.ebb(a.dty.clp(), a.hjg() + (a.av() - cbl.eq(a.dty.clp())) / 2.0F, a.dtt() + (a.gqc() - cbl.biu(a.dty.clp())) / 2.0F, axxx);
      if (!a.ais.isEmpty()) {
      }

      byte var15;
      var15 = a.dfv;
      label130:
      if (axx != null) {
         if (!a.dfv) {
            var15 = a.btb;
            if (axx == null) {
               break label130;
            }

            if (!a.btb) {
               return;
            }
         }

         var15 = 1;
      }

      float[] var16 = new float[var15];
      var16[0] = a.dtt() + a.gqc();
      float[] axxxx = var16;
      float axxxxx = 2.0F;
      Iterator axxxxxx = a.ais.iterator();

      label120: {
         label143: {
            while (true) {
               if (axxxxxx.hasNext()) {
                  fig axxxxxxx = (fig)axxxxxx.next();
                  var17 = axxxxxxx.auw().ajf().get();
                  if (axx == null) {
                     break;
                  }

                  if (var17) {
                     axxxxx += axxxxxxx.gqc() + 2.0F;
                  }

                  if (axx != null) {
                     continue;
                  }
               }

               var18 = a;
               if (axx == null) {
                  break label143;
               }

               var17 = a.cxl;
               break;
            }

            if (var17) {
               a.dmy.bpt(0.0);
               a.dmy.gbi(axxxxx);
               a.dmy.dwm(axxxxx);
               if (axx != null) {
                  break label120;
               }
            }

            a.dmy.bpt(axxxxx);
            a.dmy.gbi(0.0);
            var18 = a;
         }

         var18.dmy.dwm(0.0);
      }

      float axxxxxxxx;
      float var10001;
      label146: {
         label147: {
            label148: {
               a = (float)a.dmy.hjo();
               axxxxxxxx = axxxxx;
               var15 = a.cxl;
               label99:
               if (axx != null) {
                  if (!a.cxl) {
                     float var28;
                     var15 = (var28 = a - 0.1F) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
                     if (axx == null) {
                        break label99;
                     }

                     if (var15 <= 0) {
                        a.btb = false;
                        a = 0.0F;
                        if (axx != null) {
                           break label148;
                        }
                     }
                  }

                  var15 = a.cxl;
               }

               if (axx == null) {
                  break label147;
               }

               if (var15 != 0) {
                  float var29;
                  var15 = (var29 = a - (axxxxx - 0.1F)) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
                  if (axx == null) {
                     break label147;
                  }

                  if (var15 >= 0) {
                     a = axxxxx;
                  }
               }
            }

            var20 = a;
            var10001 = 0.0F;
            if (axx == null) {
               break label146;
            }

            float var30;
            var15 = (var30 = a - 0.0F) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
         }

         if (var15 <= 0) {
            return;
         }

         var20 = a.hjg();
         var10001 = axxxx[0];
      }

      dmp.abh(var20, var10001, a.av(), a, () -> {
         long ax = ckg.a ^ 133640739532297L;
         int[] var10000x = dar.abu();
         float var10001x = a.hjg();
         float var10002x = a[0];
         float var10003x = a.av();
         short var10007 = 7695;
         long var10008 = 3962857612058950332L ^ ax;
         short var11x = 6941;
         long var10009 = 8545986183571013547L ^ ax;
         short var12x = 6475;
         long var10010 = 1775387758041431547L ^ ax;
         dmp.euv(var10001x, var10002x, var10003x, a, new Color(32, 32, 36));
         Iterator var8x = a.ais.iterator();
         int[] axx = var10000x;

         while (var8x.hasNext()) {
            label22: {
               fig axxx = (fig)var8x.next();
               fig var10x = axxx;
               if (axx != null) {
                  if (!axxx.auw().ajf().get()) {
                     break label22;
                  }

                  axxx.ans(a.hjg());
                  axxx.dzm(a[0]);
                  var10x = axxx;
               }

               var10x.bfi(a, a);
               a[0] += axxx.gqc() + 2.0F;
            }

            if (axx == null) {
               break;
            }
         }
      });
   }

   @Override
   public void apy(double mouseX, double mouseY, int button) {
      long ax = ckg.a ^ 127353522042544L;
      int[] var8 = dar.abu();
      int var10000 = a.dfv;
      if (var8 != null) {
         if (a.dfv) {
            a.ais.forEach(axx -> axx.apy(a, a, a));
         }

         var10000 = fuv.bfm(a, a, a.hjg(), a.dtt(), a.av(), a.gqc());
      }

      if (var8 != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = a;
      }

      if (var8 != null) {
         if (var10000 == 0) {
            a.dty.gxo();
            if (var8 != null) {
               return;
            }
         }

         var10000 = a;
      }

      label77: {
         if (var8 != null) {
            if (var10000 != 1) {
               return;
            }

            var9 = a;
            if (var8 == null) {
               break label77;
            }

            var10000 = a.ais.isEmpty();
         }

         if (var10000 != 0) {
            return;
         }

         var9 = a;
      }

      boolean var10001 = a.dfv;
      if (var8 != null) {
         var10001 = !a.dfv;
      }

      var9.dfv = var10001;
      a.cxl = a.dfv;
      a.btb = true;
      a.dmy.dsw();
   }

   @Override
   public void epq(double mouseX, double mouseY, int button) {
      a.ais.forEach(ax -> ax.epq(a, a, a));
   }

   private void adl(ffn<?> a) {
      label39: {
         int[] ax;
         label38: {
            label37: {
               label36: {
                  label35: {
                     long axx = ckg.a ^ 80695596132285L;
                     int[] var10000 = dar.abu();
                     Objects.requireNonNull(a);
                     ax = var10000;
                     var10000 = (int[])a;
                     if (ax != null) {
                        switch (a) {
                           case gbp var13:
                              var10000 = (int[])a;
                              break;
                           case adu var14:
                              break label35;
                           case bes var15:
                              break label36;
                           case acn var16:
                              break label37;
                           case cyx var17:
                              break label38;
                           default:
                              break label39;
                        }
                     }

                     gbp axxx = (gbp)var10000;
                     a.ais.add(new dgi(axxx));
                     if (ax != null) {
                        return;
                     }
                  }

                  adu axxx = (adu)a;
                  a.ais.add(new gsu(axxx));
                  if (ax != null) {
                     return;
                  }
               }

               bes axxx = (bes)a;
               a.ais.add(new ft(axxx));
               if (ax != null) {
                  return;
               }
            }

            acn axxx = (acn)a;
            a.ais.add(new bdz(axxx));
            if (ax != null) {
               return;
            }
         }

         cyx axxx = (cyx)a;
         a.ais.add(new frf(axxx));
         if (ax != null) {
            return;
         }
      }

      dar.ecj.error(b + a.fah());
   }

   public guu fhm() {
      return a.dty;
   }

   static {
      long var16 = a ^ 111895952482455L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var19 = 1; var19 < 8; var19++) {
         var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var20 = var18.doFinal("Unknown Property! ".getBytes("ISO-8859-1"));
      String var29 = b(var20).intern();
      int var10001 = -1;
      b = var29;
      e = new HashMap(13);
      Cipher var5;
      var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var6 = 1; var6 < 8; var6++) {
         var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var11 = new long[7];
      int var8 = 0;
      String var9 = "\u0002\u000fÜïÇ_·ûì\u00ad\u008cà±ø¤¢aÐznío¯ÈàE¼\">\u0001[2ñ \u0006¦F6_\u0095";
      int var10 = "\u0002\u000fÜïÇ_·ûì\u00ad\u008cà±ø¤¢aÐznío¯ÈàE¼\">\u0001[2ñ \u0006¦F6_\u0095".length();
      byte var7 = 0;

      label39:
      while (true) {
         var10001 = var7;
         var7 += 8;
         byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
         long[] var23 = var11;
         var10001 = var8++;
         long var31 = (var12[0] & 255L) << 56
            | (var12[1] & 255L) << 48
            | (var12[2] & 255L) << 40
            | (var12[3] & 255L) << 32
            | (var12[4] & 255L) << 24
            | (var12[5] & 255L) << 16
            | (var12[6] & 255L) << 8
            | var12[7] & 255L;
         byte var36 = -1;

         while (true) {
            long var13 = var31;
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
            long var39 = (var15[0] & 255L) << 56
               | (var15[1] & 255L) << 48
               | (var15[2] & 255L) << 40
               | (var15[3] & 255L) << 32
               | (var15[4] & 255L) << 24
               | (var15[5] & 255L) << 16
               | (var15[6] & 255L) << 8
               | var15[7] & 255L;
            switch (var36) {
               case 0:
                  var23[var10001] = var39;
                  if (var7 >= var10) {
                     c = var11;
                     d = new Integer[7];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 700703973440509031L;
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
                     long var34 = (var4[0] & 255L) << 56
                        | (var4[1] & 255L) << 48
                        | (var4[2] & 255L) << 40
                        | (var4[3] & 255L) << 32
                        | (var4[4] & 255L) << 24
                        | (var4[5] & 255L) << 16
                        | (var4[6] & 255L) << 8
                        | var4[7] & 255L;
                     byte var28 = -1;
                     f = var34;
                     return;
                  }
                  break;
               default:
                  var23[var10001] = var39;
                  if (var7 < var10) {
                     continue label39;
                  }

                  var9 = "a× L\u009f\u0007¨®æmZÜ\u001ep½\u0006";
                  var10 = "a× L\u009f\u0007¨®æmZÜ\u001ep½\u0006".length();
                  var7 = 0;
            }

            byte var27 = var7;
            var7 += 8;
            var12 = var9.substring(var27, var7).getBytes("ISO-8859-1");
            var23 = var11;
            var10001 = var8++;
            var31 = (var12[0] & 255L) << 56
               | (var12[1] & 255L) << 48
               | (var12[2] & 255L) << 40
               | (var12[3] & 255L) << 32
               | (var12[4] & 255L) << 24
               | (var12[5] & 255L) << 16
               | (var12[6] & 255L) << 8
               | var12[7] & 255L;
            var36 = 0;
         }
      }
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30411;
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
            throw new RuntimeException("cc/astralis/ckg", var14);
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
         throw new RuntimeException("cc/astralis/ckg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
