package cc.astralis;

import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hcd extends bmd {
   private final adu btr;
   private static final long a = 123940405675415L;
   private static final String b;
   private static final long c;

   public hcd(adu property, float width, float height) {
      a.btr = a;
      a.fqg(a);
      a.fuo(a);
   }

   @Override
   public void ckn(float x, float y, float mouseX, float mouseY) {
      long ax = hcd.a ^ 118679014924660L;
      a.fji(a);
      a.axc(a);
      fll axx = bxc.emc(b, (int)c);
      axx.aof(a.btr.fah(), a + 6.0F, a + 4.0F, cbc.fgl);
      axx.aof(a.btr.dnp(), a + a.arq() - (axx.eq(a.btr.dnp()) + 6.0F), a + 4.0F, cbc.fgl);
   }

   @Override
   public void gdj(double mouseX, double mouseY, int button) {
      long ax = hcd.a ^ 120562725383416L;
      int[] axx = dar.abu();
      if (fuv.bfm(a, a, a.aqy(), a.gpn(), a.arq(), a.ajg())) {
         List<String> axxx = List.of(a.btr.ape());
         int axxxx = axxx.size();
         int axxxxx = axxx.indexOf(a.btr.dnp());
         if (a == 0) {
            a.btr.gbf(axxxxx < axxxx - 1 ? axxx.get(axxxxx + 1) : axxx.getFirst());
            if (axx != null) {
               return;
            }
         }

         a.btr.gbf(axxxxx > 0 ? axxx.get(axxxxx - 1) : axxx.getLast());
      }
   }

   static {
      long var5 = a ^ 78274759570211L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var9 = var7.doFinal("Sf-Ui".getBytes("ISO-8859-1"));
      String var12 = a(var9).intern();
      byte var10001 = -1;
      b = var12;
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = 8100034755544270016L;
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
      c = var14;
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
