package cc.astralis;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bcc {
   private final String dgd;
   private float bfe;
   private float gxb;
   private final erp hfg;
   private boolean baz;
   private boolean gky;
   private static final long a = 30852536983012L;
   private static final long b;

   public bcc(String id) {
      long ax = bcc.a ^ 41637538937539L;
      super();
      a.bfe = 0.0F;
      a.gxb = 0.0F;
      a.hfg = new erp(dtw.EASE_OUT_BACK, b);
      a.baz = false;
      a.gky = false;
      a.dgd = a;
      a.bfe = 0.0F;
   }

   public void dgw(float value) {
      a.bfe = Math.max(0.0F, Math.min(1.0F, a));
   }

   public String egu() {
      return a.dgd;
   }

   public float ces() {
      return a.bfe;
   }

   public float hbi() {
      return a.gxb;
   }

   public erp hdn() {
      return a.hfg;
   }

   public boolean bsc() {
      return a.baz;
   }

   public boolean dzr() {
      return a.gky;
   }

   public void atv(float displayed) {
      a.gxb = a;
   }

   public void cqy(boolean completed) {
      a.baz = a;
   }

   public void ceg(boolean removing) {
      a.gky = a;
   }

   static {
      long var0 = a ^ 106116241073684L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -5738503518022526381L;
      byte[] var6 = var2.doFinal(
         new byte[]{
            (byte)(var4 >>> 56),
            (byte)(var4 >>> 48),
            (byte)(var4 >>> 40),
            (byte)(var4 >>> 32),
            (byte)(var4 >>> 24),
            (byte)(var4 >>> 16),
            (byte)(var4 >>> 8),
            (byte)var4
         }
      );
      long var7 = (var6[0] & 255L) << 56
         | (var6[1] & 255L) << 48
         | (var6[2] & 255L) << 40
         | (var6[3] & 255L) << 32
         | (var6[4] & 255L) << 24
         | (var6[5] & 255L) << 16
         | (var6[6] & 255L) << 8
         | var6[7] & 255L;
      byte var10001 = -1;
      b = var7;
   }
}
