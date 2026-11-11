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

public class cgw extends hcr {
   private final gbp adp;
   public boolean epz;
   public boolean ghi;
   private final efx dbr;
   private final cbm fqv;
   private static int chw;
   private static final long a = 118967116972032L;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public cgw(guu parentClass) {
      long ax = cgw.a ^ 100857754893693L;
      short var10002 = 6029;
      long var10003 = 6322584545989670957L ^ ax;
      super(a, "Watchdog Vanilla");
      short var4 = 5204;
      long var10004 = 5863254418052692981L ^ ax;
      a.adp = new gbp("Edge", true);
      a.epz = false;
      a.ghi = false;
      a.dbr = (efx)a.clv();
      a.fqv = new cbm();
      a.ebu(a.adp);
   }

   @Override
   public void dil() {
      a.epz = false;
      a.ghi = false;
      super.dil();
   }

   @Override
   public void cbw() {
      a.ghi = false;
      super.cbw();
   }

   private boolean ahe() {
      long a = cgw.a ^ 133890094962190L;
      int[] var3 = dar.abu();
      boolean var10000 = chi.field_1690.field_1903.method_1434();
      if (var3 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = a.epz;
      }

      return var3 == null ? var10000 : var10000;
   }

   @gdz
   public void hbz(eih event) {
      int[] ax;
      boolean var7;
      long axx = cgw.a ^ 129315838305446L;
      boolean axxx = chi.field_1690.field_1903.method_1434();
      int[] var10000 = dar.abu();
      eky axxxx = dar.gqy().aws().diy(eky.class);
      ax = var10000;
      var7 = axxxx.dsv();
      label96:
      if (ax != null) {
         if (var7) {
            var7 = axxx;
            if (ax == null) {
               break label96;
            }

            if (axxx) {
               axxxx.gxo();
            }
         }

         var7 = a.ahe();
      }

      if (ax != null) {
         if (var7) {
            label84: {
               label83: {
                  label82: {
                     evd.dek(0.22F);
                     if (ax != null) {
                        switch (bni) {
                           case 0:
                              bav.fym(0.42F);
                              break;
                           case 1:
                              break label82;
                           case 2:
                              break label83;
                           default:
                              break label84;
                        }
                     }

                     if (ax != null) {
                        break label84;
                     }
                  }

                  bav.fym(0.33);
                  if (ax != null) {
                     break label84;
                  }
               }

               bni = -1;
               bav.fym(1.0 - chi.field_1724.method_23318() % 1.0);
            }

            if (ax != null) {
               return;
            }
         }

         var7 = a.epz;
      }

      label66:
      if (ax != null) {
         if (!var7) {
            var7 = chi.field_1724.method_24828();
            if (ax == null) {
               break label66;
            }

            if (var7) {
               a.epz = true;
               if (ax != null) {
                  return;
               }
            }
         }

         var7 = chi.field_1724.method_24828();
      }

      if (!var7) {
         a.epz = false;
      }
   }

   public static void ftb(int var0) {
      chw = var0;
   }

   public static int cbv() {
      return chw;
   }

   public static int epy() {
      long var0 = a ^ 6980715698542L;
      int var2 = cbv();
      if (var2 == 0) {
         short var10000 = 10242;
         long var10001 = 3444717447237784236L ^ var0;
         return 122;
      } else {
         return 0;
      }
   }

   static {
      long var20 = a ^ 53625323498496L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[2];
      int var16 = 0;
      String var15 = "\u008a©«\u0002zsN\u0011§\u0001VW\u0016O^\u0086(\u008ev\u0014>øÄò\u0099 L\u0013³~'\u0001\u0015y\u0087L\u0084f\u000bû\u001e\bS\u0000´\u0083ÄÎ[Z\u0018\u008a=E\fÂÕ";
      int var17 = "\u008a©«\u0002zsN\u0011§\u0001VW\u0016O^\u0086(\u008ev\u0014>øÄò\u0099 L\u0013³~'\u0001\u0015y\u0087L\u0084f\u000bû\u001e\bS\u0000´\u0083ÄÎ[Z\u0018\u008a=E\fÂÕ"
         .length();
      char var14 = 16;
      int var13 = -1;

      while (true) {
         byte[] var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
         String var29 = a(var19).intern();
         int var10001 = -1;
         var18[var16++] = var29;
         if ((var13 += var14) >= var17) {
            d = var18;
            e = new String[2];
            i = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "/\u0092\u00ad\u001d¥¡°]|å\u008a \u0004%y$";
            int var5 = "/\u0092\u00ad\u001d¥¡°]|å\u008a \u0004%y$".length();
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
               byte var33 = -1;
               var6[var10001] = var10004;
            } while (var2 < var5);

            g = var6;
            h = new Integer[2];
            if (epy() == 0) {
               short var24 = 10856;
               long var28 = 6221939967558002089L ^ var20;
               ftb(121);
            }

            return;
         }

         var14 = var15.charAt(var13);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21212;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/cgw", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("cc/astralis/cgw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25536;
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/cgw", var14);
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
         throw new RuntimeException("cc/astralis/cgw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
