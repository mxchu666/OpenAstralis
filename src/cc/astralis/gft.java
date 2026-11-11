package cc.astralis;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2338;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_2350.class_2351;

public class gft extends hcr {
   private boolean ehv;
   private static final long a = 54381792305581L;
   private static final String d;
   private static final long e;

   public gft(guu parentClass) {
      long ax = gft.a ^ 13077276240065L;
      super(a, d);
      a.ehv = false;
   }

   @Override
   public void dil() {
      a.ehv = false;
      super.dil();
   }

   // $VF: Could not properly define all variable types!
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @gdz
   public void ecn(fxx event) {
      long a = gft.a ^ 4884669921361L;
      double a = chi.field_1724.method_18798().field_1351;
      <unknown> var10000;
      int[] a = var10000_1;

      dar.abu();
      a += switch (hjr) {
         case 1 -> 0.05;
         case 2 -> 0.012;
         case 3 -> -0.135;
         case 4 -> -0.2;
         default -> 0.0;
      };
      bav.fym(a);
      int var14 = chi.field_1724.method_24828();
      if (a != null) {
         if (var14 != 0) {
            chi.field_1724.method_6043();
            evd.dek(evd.chd());
            a.ehv = false;
            if (a != null) {
               return;
            }
         }

         var14 = hjr;
      }

      if (var14 == 1) {
         double ax = evd.cqz(0.33F, 0.4F, 0.48F);
         evd.dek(Math.max(ax, evd.chd()));
      }

      label103: {
         byte var17;
         label104: {
            class_2338 ax = class_2338.method_49637(
               chi.field_1724.method_23317(), chi.field_1724.method_23318() + chi.field_1724.method_18798().field_1351, chi.field_1724.method_23321()
            );
            class_2680 axx = chi.field_1687.method_8320(ax);
            class_265 axxx = axx.method_26220(chi.field_1687, ax);
            var14 = axxx.method_1110();
            if (a != null) {
               if (var14 == 0) {
                  var14 = hjr;
                  var17 = 2;
                  if (a == null) {
                     break label104;
                  }

                  if (hjr > 2) {
                     evd.dek(evd.chd());
                  }
               }

               var14 = hjr;
            }

            if (a == null) {
               break label103;
            }

            var17 = 2;
         }

         if (var14 < var17) {
            return;
         }

         var14 = a.bvx(
            chi.field_1724.method_23317(), chi.field_1724.method_23318() + chi.field_1724.method_18798().field_1351 * 3.0, chi.field_1724.method_23321()
         );
      }

      label75: {
         if (a != null) {
            if (var14 != 0) {
               break label75;
            }

            var14 = hjr;
         }

         if (var14 != (int)e) {
            return;
         }
      }

      label67: {
         double axxxx = aqw();
         gft var16 = a;
         if (a != null) {
            if (!a.ehv) {
               chi.field_1724.method_18799(chi.field_1724.method_18798().method_1031(0.0, 0.075, 0.0));
               a.ehv = true;
               if (a != null) {
                  break label67;
               }
            }

            var16 = a;
         }

         var16.ehv = false;
      }

      evd.dyv();
   }

   private boolean bvx(double a, double a, double a) {
      long ax = gft.a ^ 8166109042150L;
      class_2338 axx = class_2338.method_49637(a, a, a);
      class_2680 axxx = chi.field_1687.method_8320(axx);
      class_265 axxxx = axxx.method_26220(chi.field_1687, axx);
      return axxxx == class_259.method_1077();
   }

   public static double aqw() {
      long a = gft.a ^ 46550256252355L;
      double ax = chi.field_1724.method_23318();
      class_2339 axx = new class_2339();
      int[] var10000 = dar.abu();
      double axxx = ax;
      int[] axxxx = var10000;

      while (axxx >= 0.0) {
         axx.method_10102(chi.field_1724.method_23317(), axxx, chi.field_1724.method_23321());
         class_2680 axxxxx = chi.field_1687.method_8320(axx);
         class_265 axxxxxx = axxxxx.method_26220(chi.field_1687, axx);
         if (axxxx != null) {
            if (!axxxxxx.method_1110()) {
               return ax - (axxx + axxxxxx.method_1105(class_2351.field_11052));
            }

            axxx -= 0.5;
         }

         if (axxxx == null) {
            break;
         }
      }

      return -1.0;
   }

   static {
      long var5 = a ^ 32611595418799L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var9 = var7.doFinal("Watchdog 2".getBytes("ISO-8859-1"));
      String var12 = a(var9).intern();
      byte var10001 = -1;
      d = var12;
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = 5573268845355930927L;
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
      long var14 = (var4[0] & 255L) << 56
         | (var4[1] & 255L) << 48
         | (var4[2] & 255L) << 40
         | (var4[3] & 255L) << 32
         | (var4[4] & 255L) << 24
         | (var4[5] & 255L) << 16
         | (var4[6] & 255L) << 8
         | var4[7] & 255L;
      var10001 = -1;
      e = var14;
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
}
