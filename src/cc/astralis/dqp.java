package cc.astralis;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class dqp extends bmd {
   private final bfm dwz;
   private final List<cbc> afg;
   private static final int ewf;
   private static final int fwb;
   private float bws;
   private float bbj;
   private float dxn;
   private static final long a = 98276579202062L;

   public dqp(bfm category, float width, float height) {
      long ax = dqp.a ^ 108798968583392L;
      super();
      int[] var10000 = dar.abu();
      a.afg = new ArrayList<>();
      a.dwz = a;
      a.fqg(a);
      a.fuo(a);
      int[] axx = var10000;

      for (guu axxx : dar.gqy().aws().gtd(a).stream().sorted(Comparator.comparing(guu::clp)).toList()) {
         cbc axxxx = new cbc(axxx, a - 14.0F, 31.0F);
         a.afg.add(axxxx);
         if (axx == null) {
            break;
         }
      }
   }

   @Override
   public void ckn(float x, float y, float mouseX, float mouseY) {
      long ax = dqp.a ^ 72743052357869L;
      a.fji(a);
      a.axc(a);
      a.bws = a;
      a.bbj = a;
      int[] var10000 = dar.abu();
      float axx = 7.0F;
      int[] axxx = var10000;
      Iterator axxxx = a.afg.iterator();

      while (true) {
         if (axxxx.hasNext()) {
            cbc axxxxx = (cbc)axxxx.next();
            var14 = axx + (axxxxx.ajg() + 7.0F);
            if (axxx == null) {
               break;
            }

            axx = var14;
            if (axxx != null) {
               continue;
            }
         }

         var14 = a.ajg();
         break;
      }

      float axxxxxx = var14;
      a.dxn = Math.clamp(a.dxn, 0.0F, Math.max(axx, axxxxxx) - axxxxxx);
      float axxxxxxx = a + 7.0F;
      float[] axxxxxxxx = new float[]{a + 7.0F - a.dxn};
      dmp.abh(a, a, a.arq(), a.ajg(), () -> {
         long ax = dqp.a ^ 25110237316502L;
         int[] var10000x = dar.abu();
         Iterator var8x = a.afg.iterator();
         int[] axx = var10000x;

         while (var8x.hasNext()) {
            cbc axxx = (cbc)var8x.next();
            axxx.ckn(a, a[0], a, a);
            a[0] += axxx.ajg() + 7.0F;
            if (axx == null) {
               break;
            }
         }
      });
   }

   @Override
   public void gdj(double mouseX, double mouseY, int button) {
      long ax = dqp.a ^ 75309586464097L;
      int[] axx = dar.abu();
      if (fuv.bfm(a, a, a.aqy(), a.gpn(), a.arq(), a.ajg())) {
         for (cbc axxx : a.afg) {
            axxx.gdj(a, a, a);
            if (axx == null) {
               break;
            }
         }
      }
   }

   @Override
   public void euk(double mouseX, double mouseY, int button) {
      long ax = dqp.a ^ 17767223674306L;
      int[] var10000 = dar.abu();
      Iterator var9 = a.afg.iterator();
      int[] axx = var10000;

      while (var9.hasNext()) {
         cbc axxx = (cbc)var9.next();
         axxx.euk(a, a, a);
         if (axx == null) {
            break;
         }
      }
   }

   @Override
   public void bof(double amount) {
      long ax = dqp.a ^ 59197041077561L;
      int[] var5 = dar.abu();
      dqp var10000 = a;
      if (var5 != null) {
         if (!fuv.bfm(a.bws, a.bbj, a.aqy(), a.gpn(), a.arq(), a.ajg())) {
            return;
         }

         var10000 = a;
      }

      var10000.dxn += (float)(a * 20.0);
   }

   static {
      long var1 = a ^ 7070402040758L;
      Cipher var3;
      Cipher var10000 = var3 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var1 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var4 = 1; var4 < 8; var4++) {
         var10003[var4] = (byte)(var1 << var4 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[2];
      int var6 = 0;
      String var7 = "jç\u00ad9ÈÙ:Ì\u0016ÆA\u0002áì\u0086\f";
      int var8 = "jç\u00ad9ÈÙ:Ì\u0016ÆA\u0002áì\u0086\f".length();
      byte var5 = 0;

      do {
         int var10001 = var5;
         var5 += 8;
         byte[] var9 = var7.substring(var10001, var5).getBytes("ISO-8859-1");
         var10001 = var6++;
         long var10 = (var9[0] & 255L) << 56
            | (var9[1] & 255L) << 48
            | (var9[2] & 255L) << 40
            | (var9[3] & 255L) << 32
            | (var9[4] & 255L) << 24
            | (var9[5] & 255L) << 16
            | (var9[6] & 255L) << 8
            | var9[7] & 255L;
         byte[] var12 = var3.doFinal(
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
         var0[var10001] = var10004;
      } while (var5 < var8);

      fwb = (int)var0[0];
      ewf = (int)var0[1];
   }
}
